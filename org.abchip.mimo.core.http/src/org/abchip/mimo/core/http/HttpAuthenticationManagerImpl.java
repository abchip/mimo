/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.http;

import java.io.IOException;
import java.util.Map;

import javax.inject.Inject;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.authentication.AuthenticationAdminKey;
import org.abchip.mimo.authentication.AuthenticationAnonymous;
import org.abchip.mimo.authentication.AuthenticationException;
import org.abchip.mimo.authentication.AuthenticationFactory;
import org.abchip.mimo.authentication.AuthenticationManager;
import org.abchip.mimo.authentication.AuthenticationUserPassword;
import org.abchip.mimo.authentication.AuthenticationUserToken;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextEvent;
import org.abchip.mimo.context.ContextListener;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.context.ProviderConfig;
import org.abchip.mimo.context.ProviderUser;
import org.abchip.mimo.core.http.handler.HttpCheckLoginHandler;
import org.abchip.mimo.core.http.handler.HttpExternalCredentialHandler;
import org.abchip.mimo.core.http.handler.HttpLoginHandler;
import org.abchip.mimo.core.http.handler.HttpLogoutHandler;
import org.abchip.mimo.networking.HttpClient;
import org.abchip.mimo.networking.HttpClientFactory;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.SerializationType;
import org.abchip.mimo.util.Logs;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.osgi.service.log.Logger;

public class HttpAuthenticationManagerImpl implements AuthenticationManager {

	private static final Logger LOGGER = Logs.getLogger(HttpAuthenticationManagerImpl.class);

	@Inject
	private Application application;
	@Inject
	private ProviderConfig providerConfig;
	@Inject
	private HttpClientFactory httpClientFactory;

	@Override
	public ContextProvider login(String contextId, AuthenticationAnonymous authentication) throws AuthenticationException {

		ProviderUser user = this.providerConfig.getPublicUser();
		if (user == null)
			return null;

		AuthenticationUserPassword authenticationUserPassword = AuthenticationFactory.eINSTANCE.createAuthenticationUserPassword();
		authenticationUserPassword.setUser(user.getUser());
		authenticationUserPassword.setPassword(user.getPassword());

		ContextProvider context = this.login(contextId, authenticationUserPassword);
		if (context != null)
			context.get().getContextDescription().setAnonymous(true);

		return context;
	}

	@Override
	public ContextProvider login(String contextId, AuthenticationUserToken authentication) throws AuthenticationException {

		AuthenticationUserPassword authenticationUserPassword = getExternalCredentials(authentication.getUser());

		ContextProvider context = this.login(contextId, authenticationUserPassword);

		context.get().getContextDescription().setPicture(authentication.getPicture());

		return context;
	}

	@SuppressWarnings("resource")
	@Override
	public ContextProvider login(String contextId, AuthenticationUserPassword authentication) throws AuthenticationException {

		HttpConnector connector = connect(authentication.getUser(), authentication.getPassword(), authentication.getTenant());

		ContextProvider contextProvider = application.getContext().createChildContext(contextId);
		Context context = contextProvider.get();
		context.getContextDescription().setUser(authentication.getUser());
		context.getContextDescription().setTenant(authentication.getTenant());
		context.getContextDescription().setCurrencyUom(connector.getContextDescription().getCurrencyUom());
		context.getContextDescription().setLocale(connector.getContextDescription().getLocale());
		context.getContextDescription().setTimeZone(connector.getContextDescription().getTimeZone());

		// http connector
		context.set(HttpConnector.class, connector);
		context.registerListener(new ContextListener() {
			@Override
			public void handleEvent(ContextEvent event) {
				switch (event.getEventType()) {
				case CLOSING:
					disconnect(context, connector);
					break;
				}
			}
		});

		return contextProvider;
	}

	@SuppressWarnings("resource")
	@Override
	public ContextProvider login(String contextId, AuthenticationAdminKey authentication) throws AuthenticationException {

		HttpConnector connector = connect(authentication.getAdminKey(), authentication.getTenant());

		ContextProvider contextProvider = application.getContext().createChildContext(contextId);
		Context context = contextProvider.get();
		context.getContextDescription().setTenant(authentication.getTenant());
		context.getContextDescription().setCurrencyUom(connector.getContextDescription().getCurrencyUom());
		context.getContextDescription().setLocale(connector.getContextDescription().getLocale());
		context.getContextDescription().setTimeZone(connector.getContextDescription().getTimeZone());

		// http connector
		context.set(HttpConnector.class, connector);
		context.registerListener(new ContextListener() {
			@Override
			public void handleEvent(ContextEvent event) {
				switch (event.getEventType()) {
				case CLOSING:
					disconnect(context, connector);
					break;
				}
			}
		});

		return contextProvider;
	}

	@Override
	public boolean checkLogin(AuthenticationUserToken authentication, boolean create) {

		// checkLogin
		URIBuilder uri = new URIBuilder();
		uri.setScheme(providerConfig.getHost().getSchema());
		uri.setHost(providerConfig.getHost().getAddress());
		uri.setPort(providerConfig.getHost().getPort());
		uri.setPath(providerConfig.getPath() + "/checkLogin");
		uri.setParameter("provider", authentication.getProvider());
		uri.setParameter("accessToken", authentication.getAccessToken());

		Map<String, Object> userInfo = null;
		try {
			switch (authentication.getProvider()) {
			case "GitHub": {
				userInfo = HttpUtils.checkLoginGitHub(authentication);
				authentication.setPicture((String) userInfo.get("avatar_url"));

				// build checkLogin
				uri.setParameter("userId", (String) userInfo.get("email"));
				uri.setParameter("email", (String) userInfo.get("email"));
				uri.setParameter("firstName", (String) userInfo.get("name"));
				uri.setParameter("lastName", (String) userInfo.get("lastName"));
				break;
			}
			case "Google": {
				userInfo = HttpUtils.checkLoginGoogle(authentication);
				authentication.setPicture((String) userInfo.get("picture"));

				// build checkLogin
				uri.setParameter("userId", (String) userInfo.get("email"));
				uri.setParameter("email", (String) userInfo.get("email"));
				uri.setParameter("firstName", (String) userInfo.get("given_name"));
				uri.setParameter("lastName", (String) userInfo.get("family_name"));
				break;
			}
			case "LinkedIn": {
				userInfo = HttpUtils.checkLoginLinkedIn(authentication);
				authentication.setPicture((String) userInfo.get("picture"));

				// build checkLogin
				uri.setParameter("userId", (String) userInfo.get("email"));
				uri.setParameter("email", (String) userInfo.get("email"));
				uri.setParameter("firstName", (String) userInfo.get("localizedFirstName"));
				uri.setParameter("lastName", (String) userInfo.get("localizedLastName"));
				break;
			}
			default:
				LOGGER.audit("Unknown provider {} for user {}", authentication.getProvider(), authentication.getUser());
				return false;
			}
		} catch (Exception e) {
			LOGGER.audit("Invalid check login provider {} for user {} message {}", authentication.getProvider(), authentication.getUser(), e.getMessage());
			return false;
		}

		// check login
		try (HttpClient httpClient = this.httpClientFactory.create(application.getContext())) {
			httpClient.execute(new HttpPost(uri.build()), new HttpCheckLoginHandler());
			LOGGER.audit("CheckLogin success id {} user {} provider {}", authentication.getIdToken(), authentication.getUser(), authentication.getProvider());
		} catch (Exception e) {
			LOGGER.audit(e.getMessage());
			return false;
		}

		return true;
	}

	@SuppressWarnings("resource")
	private HttpConnector connect(String user, String password, String tenant) throws AuthenticationException {

		LOGGER.audit("Connection from user {} tenant {}", user, tenant);

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

		HttpConnector connector = null;
		HttpClient httpClient = this.httpClientFactory.create(application.getContext());

		try {
			ResourceSerializer<ContextDescription> serializer = application.getContext().getResourceManager().createResourceSerializer(ContextDescription.class, SerializationType.MIMO);
			ContextDescription contextDescription = httpClient.execute(new HttpPost(uri.build()), new HttpLoginHandler(serializer));
			connector = new HttpConnector(providerConfig, httpClient, contextDescription);
			LOGGER.audit("Connection success id {} user {} tenant {}", contextDescription.getId(), contextDescription.getUser(), contextDescription.getTenant());
		} catch (Exception e) {
			try {
				httpClient.close();
			} catch (Exception e1) {
				LOGGER.warn(e1.getMessage());
			}
			LOGGER.audit("Connection failed {}", e.getMessage());
			throw new AuthenticationException(e);
		}

		return connector;
	}

	@SuppressWarnings("resource")
	private HttpConnector connect(String adminKey, String tenant) throws AuthenticationException {

		LOGGER.audit("Connection from adminKey {} tenant {}", adminKey, tenant);

		URIBuilder uri = new URIBuilder();
		uri.setScheme(providerConfig.getHost().getSchema());
		uri.setHost(providerConfig.getHost().getAddress());
		uri.setPort(providerConfig.getHost().getPort());
		uri.setPath(providerConfig.getPath() + "/login");

		if (tenant != null)
			uri.setParameter("adminKey", tenant + "/" + adminKey);
		else
			uri.setParameter("adminKey", adminKey);

		HttpConnector connector = null;
		HttpClient httpClient = this.httpClientFactory.create(application.getContext());

		try {
			ResourceSerializer<ContextDescription> serializer = application.getContext().getResourceManager().createResourceSerializer(ContextDescription.class, SerializationType.MIMO);
			ContextDescription contextDescription = httpClient.execute(new HttpPost(uri.build()), new HttpLoginHandler(serializer));
			connector = new HttpConnector(providerConfig, httpClient, contextDescription);
			LOGGER.audit("Connection success id {} adminKey {} tenant {}", contextDescription.getId(), adminKey, tenant);
		} catch (Exception e) {
			try {
				httpClient.close();
			} catch (Exception e1) {
				LOGGER.warn(e1.getMessage());
			}
			LOGGER.audit("{}", e.getMessage());
			throw new AuthenticationException(e);
		}

		return connector;
	}

	private void disconnect(Context context, HttpConnector connector) {

		try {
			ResourceSerializer<ContextDescription> serializer = application.getContext().getResourceManager().createResourceSerializer(ContextDescription.class, SerializationType.MIMO);
			ContextDescription contextDescription = connector.execute("logout", null, new HttpLogoutHandler(serializer));
			LOGGER.audit("Disconnection success id {} user {} tenant {}", contextDescription.getId(), contextDescription.getUser(), contextDescription.getTenant());
		} catch (Exception e) {
			LOGGER.audit("Disconnection failed {}", e.getMessage());
		} finally {
			try {
				connector.close();
			} catch (IOException e) {
				LOGGER.audit(e.getMessage());
			}
		}
	}

	private AuthenticationUserPassword getExternalCredentials(String user) throws AuthenticationException {

		LOGGER.warn("Unsecure access to external credential for user {}", user);

		AuthenticationUserPassword authentication = null;
		try (HttpClient httpClient = this.httpClientFactory.create(application.getContext())) {
			URIBuilder uri = new URIBuilder();
			uri.setScheme(providerConfig.getHost().getSchema());
			uri.setHost(providerConfig.getHost().getAddress());
			uri.setPort(providerConfig.getHost().getPort());
			uri.setPath(providerConfig.getPath() + "/externalCredential");
			uri.setParameter("userId", user);
			authentication = httpClient.execute(new HttpPost(uri.build()), new HttpExternalCredentialHandler());
			LOGGER.audit("External credential success user {}", user);
		} catch (Exception e) {
			LOGGER.audit(e.getMessage());
			throw new AuthenticationException(e);
		}

		return authentication;
	}
}