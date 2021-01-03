/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.http;

import java.net.URISyntaxException;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.authentication.AuthenticationAdminKey;
import org.abchip.mimo.authentication.AuthenticationAnonymous;
import org.abchip.mimo.authentication.AuthenticationException;
import org.abchip.mimo.authentication.AuthenticationFactory;
import org.abchip.mimo.authentication.AuthenticationUserPassword;
import org.abchip.mimo.authentication.AuthenticationUserToken;
import org.abchip.mimo.authentication.impl.AuthenticationManagerImpl;
import org.abchip.mimo.biz.service.security.CheckExternalLoginUser;
import org.abchip.mimo.biz.service.security.CheckExternalLoginUserResponse;
import org.abchip.mimo.biz.service.security.UserCredentialFromExternalId;
import org.abchip.mimo.biz.service.security.UserCredentialFromExternalIdResponse;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextHandler;
import org.abchip.mimo.context.ProviderConfig;
import org.abchip.mimo.context.ProviderUser;
import org.abchip.mimo.context.Thread;
import org.abchip.mimo.context.ThreadManager;
import org.abchip.mimo.core.http.handler.HttpLoginHandler;
import org.abchip.mimo.networking.HttpClient;
import org.abchip.mimo.networking.NetworkingException;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.SerializationType;
import org.abchip.mimo.service.ServiceManager;
import org.abchip.mimo.util.Logs;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.osgi.service.log.Logger;

public class HttpAuthenticationManagerImpl extends AuthenticationManagerImpl {

	private static final Logger LOGGER = Logs.getLogger(HttpAuthenticationManagerImpl.class);

	@Inject
	private Application application;
	@Inject
	private ProviderConfig providerConfig;
	@Inject
	private ThreadManager threadManager;

	@PostConstruct
	private void init() {
		Thread thread = threadManager.createThread("login-checker", new HttpAuthenticationLoginChecker());
		threadManager.start(thread);
	}

	@Override
	public ContextHandler login(String contextId, AuthenticationAnonymous authentication) throws AuthenticationException {

		ProviderUser user = this.providerConfig.getPublicUser();
		if (user == null)
			return null;

		AuthenticationUserPassword authenticationUserPassword = AuthenticationFactory.eINSTANCE.createAuthenticationUserPassword();
		authenticationUserPassword.setTenant(authentication.getTenant());
		authenticationUserPassword.setUser(user.getUser());
		authenticationUserPassword.setPassword(user.getPassword());

		ContextHandler context = this.login(contextId, authenticationUserPassword);
		if (context != null)
			context.getContext().getContextDescription().setAnonymous(true);

		return context;
	}

	@Override
	public ContextHandler login(String contextId, AuthenticationUserToken authentication) throws AuthenticationException {

		AuthenticationUserPassword authenticationUserPassword = getExternalCredentials(authentication.getUser());

		ContextHandler context = this.login(contextId, authenticationUserPassword);

		context.getContext().getContextDescription().setPicture(authentication.getPicture());

		return context;
	}

	@SuppressWarnings("resource")
	@Override
	public ContextHandler login(String contextId, AuthenticationUserPassword authentication) throws AuthenticationException {

		String user = authentication.getUser();
		String password = authentication.getPassword();
		String tenant = authentication.getTenant();

		LOGGER.audit("Connection from user {} tenant {}", user, tenant);

		ContextHandler contextHandler = application.getContext().createChildContext(contextId);
		try {
			Context context = contextHandler.getContext();
			ResourceSerializer<ContextDescription> serializer = context.getResourceManager().createResourceSerializer(ContextDescription.class, SerializationType.MIMO);
			HttpClient httpClient = context.get(HttpClient.class);

			URIBuilder uri = new URIBuilder();
			uri.setScheme(providerConfig.getHost().getSchema());
			uri.setHost(providerConfig.getHost().getAddress());
			uri.setPort(providerConfig.getHost().getPort());
			uri.setPath(providerConfig.getPath() + "/login");
			if (tenant != null)
				uri.setParameter("user", tenant + "/" + user);
			else
				uri.setParameter("user", user);
			uri.setParameter("password", password);

			ContextDescription contextDescription = httpClient.execute(new HttpPost(uri.build()), new HttpLoginHandler(serializer));
			context.getContextDescription().setUser(authentication.getUser());
			context.getContextDescription().setTenant(authentication.getTenant());
			context.getContextDescription().setCurrencyUom(contextDescription.getCurrencyUom());
			context.getContextDescription().setLocale(contextDescription.getLocale());
			context.getContextDescription().setTimeZone(contextDescription.getTimeZone());

			HttpConnector connector = new HttpConnector(context, providerConfig);
			context.set(HttpConnector.class, connector);

			LOGGER.audit("Connection success id {} user {} tenant {}", contextDescription.getId(), contextDescription.getUser(), contextDescription.getTenant());
		} catch (Exception e) {
			LOGGER.audit("Connection failed {}", e.getMessage());
			if (contextHandler != null)
				contextHandler.close();

			throw new AuthenticationException(e);
		}

		return contextHandler;
	}

	@Override
	public boolean checkLogin(AuthenticationUserToken authentication, boolean create) {
		try {
			ServiceManager serviceManager = application.getContext().getServiceManager();
			CheckExternalLoginUser checkExternalLoginUser = application.getContext().getServiceManager().prepare(CheckExternalLoginUser.class);
			checkExternalLoginUser.setProvider(authentication.getProvider());
			checkExternalLoginUser.setAccessToken(authentication.getAccessToken());

			Map<String, Object> userInfo = null;
			switch (authentication.getProvider()) {
			case "GitHub": {
				userInfo = HttpUtils.checkLoginGitHub(authentication);
				authentication.setUser((String) userInfo.get("email"));
				authentication.setPicture((String) userInfo.get("avatar_url"));

				checkExternalLoginUser.setUserId((String) userInfo.get("email"));
				checkExternalLoginUser.setEmail((String) userInfo.get("email"));
				checkExternalLoginUser.setFirstName((String) userInfo.get("name"));
				checkExternalLoginUser.setLastName((String) userInfo.get("lastName"));
				break;
			}
			case "Google": {
				userInfo = HttpUtils.checkLoginGoogle(authentication);
				authentication.setUser((String) userInfo.get("email"));
				authentication.setPicture((String) userInfo.get("picture"));

				checkExternalLoginUser.setUserId((String) userInfo.get("email"));
				checkExternalLoginUser.setEmail((String) userInfo.get("email"));
				checkExternalLoginUser.setFirstName((String) userInfo.get("given_name"));
				checkExternalLoginUser.setLastName((String) userInfo.get("family_name"));
				break;
			}
			case "LinkedIn": {
				userInfo = HttpUtils.checkLoginLinkedIn(authentication);
				authentication.setUser((String) userInfo.get("email"));
				authentication.setPicture((String) userInfo.get("picture"));

				checkExternalLoginUser.setUserId((String) userInfo.get("email"));
				checkExternalLoginUser.setEmail((String) userInfo.get("email"));
				checkExternalLoginUser.setFirstName((String) userInfo.get("localizedFirstName"));
				checkExternalLoginUser.setLastName((String) userInfo.get("localizedLastName"));
				break;
			}
			default:
				LOGGER.audit("Unknown provider {} for user {}", authentication.getProvider(), authentication.getUser());
				return false;
			}

			CheckExternalLoginUserResponse response = serviceManager.execute(checkExternalLoginUser);
			if (response.onError())
				LOGGER.error(response.getErrorMessage());

			LOGGER.audit("CheckLogin success id {} user {} provider {}", authentication.getIdToken(), authentication.getUser(), authentication.getProvider());
		} catch (Exception e) {
			LOGGER.audit("Invalid check login provider {} for user {} message {}", authentication.getProvider(), authentication.getUser(), e.getMessage());
			return false;
		}

		return true;
	}

	private AuthenticationUserPassword getExternalCredentials(String user) throws AuthenticationException {

		LOGGER.warn("Unsecure access to external credential for user {}", user);

		AuthenticationUserPassword authentication = AuthenticationFactory.eINSTANCE.createAuthenticationUserPassword();
		try {
			ServiceManager serviceManager = application.getContext().getServiceManager();
			UserCredentialFromExternalId userCredentialFromExternalId = application.getContext().getServiceManager().prepare(UserCredentialFromExternalId.class);
			userCredentialFromExternalId.setUserId(user);
			UserCredentialFromExternalIdResponse response = serviceManager.execute(userCredentialFromExternalId);
			if (response.onError())
				LOGGER.error(response.getErrorMessage());

			authentication.setUser(response.getUser());
			authentication.setPassword(response.getPassword());

			LOGGER.audit("External credential success user {}", user);
		} catch (Exception e) {
			LOGGER.audit("Invalid get external credentials for user {} message", user, e.getMessage());
			throw new AuthenticationException(e);
		}

		return authentication;
	}

	@SuppressWarnings("resource")
	private void connectAdmin(Context context, AuthenticationAdminKey authentication) throws NetworkingException, URISyntaxException {

		String adminKey = authentication.getAdminKey();
		String tenant = authentication.getTenant();

		ResourceSerializer<ContextDescription> serializer = context.getResourceManager().createResourceSerializer(ContextDescription.class, SerializationType.MIMO);
		HttpClient httpClient = context.get(HttpClient.class);

		URIBuilder uri = new URIBuilder();
		uri.setScheme(providerConfig.getHost().getSchema());
		uri.setHost(providerConfig.getHost().getAddress());
		uri.setPort(providerConfig.getHost().getPort());
		uri.setPath(providerConfig.getPath() + "/login");
		if (tenant != null)
			uri.setParameter("adminKey", tenant + "/" + adminKey);
		else
			uri.setParameter("adminKey", adminKey);

		ContextDescription contextDescription = httpClient.execute(new HttpPost(uri.build()), new HttpLoginHandler(serializer));

		context.getContextDescription().setUser(application.getContextDescription().getUser());
		context.getContextDescription().setTenant(authentication.getTenant());
		context.getContextDescription().setCurrencyUom(contextDescription.getCurrencyUom());
		context.getContextDescription().setLocale(contextDescription.getLocale());
		context.getContextDescription().setTimeZone(contextDescription.getTimeZone());

		HttpConnector connector = new HttpConnector(context, providerConfig);
		context.set(HttpConnector.class, connector);
	}

	private class HttpAuthenticationLoginChecker implements Runnable {

		int sleep = 1000;
		
		@SuppressWarnings("resource")
		@Override
		public void run() {
			while (true) {
				try {
					java.lang.Thread.sleep(sleep);

					Context context = application.getContext();

					HttpConnector connector = context.get(HttpConnector.class);

					if (connector == null) {
						synchronized (this) {
							connector = context.get(HttpConnector.class);
							if (connector == null) {
								AuthenticationAdminKey authentication = AuthenticationFactory.eINSTANCE.createAuthenticationAdminKey();
								authentication.setAdminKey(application.getAdminKey());
								connectAdmin(context, authentication);
							}
						}
					}

					if (connector != null)
						java.lang.Thread.sleep(5000);
				} catch (NetworkingException | URISyntaxException e) {
					LOGGER.warn(e.getMessage());
					if(sleep < 1000*60)
						sleep = sleep * 2;
				} catch (InterruptedException e) {
					return;
				}
			}
		}
	}
}