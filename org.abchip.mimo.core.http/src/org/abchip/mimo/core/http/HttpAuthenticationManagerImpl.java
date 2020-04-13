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
import java.net.URI;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.context.AuthenticationAdminKey;
import org.abchip.mimo.context.AuthenticationAnonymous;
import org.abchip.mimo.context.AuthenticationManager;
import org.abchip.mimo.context.AuthenticationUserPassword;
import org.abchip.mimo.context.AuthenticationUserToken;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextEvent;
import org.abchip.mimo.context.ContextFactory;
import org.abchip.mimo.context.ContextListener;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.context.ProviderConfig;
import org.abchip.mimo.context.ProviderUser;
import org.abchip.mimo.context.Thread;
import org.abchip.mimo.context.ThreadManager;
import org.abchip.mimo.core.http.handler.HttpLoginHandler;
import org.abchip.mimo.core.http.handler.HttpLogoutHandler;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.SerializationType;
import org.abchip.mimo.util.Logs;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultClientConnectionReuseStrategy;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.TrustStrategy;
import org.osgi.service.log.Logger;

public class HttpAuthenticationManagerImpl implements AuthenticationManager {

	private static final Logger LOGGER = Logs.getLogger(HttpAuthenticationManagerImpl.class);

	@Inject
	private Application application;
	@Inject
	private ResourceManager resourceManager;
	@Inject
	private ProviderConfig providerConfig;
	@Inject
	private ThreadManager threadManager;

	private PoolingHttpClientConnectionManager connectionManager = null;

	private CloseableHttpClient HTTP = null;

	@PostConstruct
	private void init() {

		connectionManager = new PoolingHttpClientConnectionManager();

		connectionManager.setMaxTotal(100);
		connectionManager.setDefaultMaxPerRoute(80);

		// RequestConfig result =
		// RequestConfig.custom().setConnectionRequestTimeout(100).setConnectTimeout(300).setSocketTimeout(1500).build();

		// connectionManager.setMaxPerRoute(new HttpRoute(new HttpHost("localhost",
		// 8080)), 200);
		// connectionManager.setMaxPerRoute(new HttpRoute(new HttpHost("localhost",
		// 8443)), 200);

		try {
			SSLContextBuilder builder = new SSLContextBuilder();
			builder.loadTrustMaterial(null, new TrustStrategy() {
				@Override
				public boolean isTrusted(X509Certificate[] chain, String authType) {
					return true;
				}
			});
			SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(builder.build(), new HostnameVerifier() {

				@Override
				public boolean verify(String hostname, SSLSession session) {
					return true;
				}

			});

			HTTP = HttpClients.custom().setConnectionManager(connectionManager).setSSLSocketFactory(sslsf).setConnectionReuseStrategy(DefaultClientConnectionReuseStrategy.INSTANCE).build();
		} catch (KeyManagementException | NoSuchAlgorithmException | KeyStoreException e) {
			LOGGER.error(e.getMessage());
		}

		Thread thread = threadManager.createThread(application.getName() + "-http-monitor", new IdleConnectionMonitorThread(connectionManager));
		threadManager.start(thread);
	}

	@Override
	public ContextProvider login(String contextId, AuthenticationAnonymous authentication) {

		ProviderUser user = this.providerConfig.getPublicUser();
		if (user == null)
			return null;

		AuthenticationUserPassword authenticationUserPassword = ContextFactory.eINSTANCE.createAuthenticationUserPassword();
		authenticationUserPassword.setUser(user.getUser());
		authenticationUserPassword.setPassword(user.getPassword());

		ContextProvider context = this.login(contextId, authenticationUserPassword);
		if (context != null)
			context.get().getContextDescription().setAnonymous(true);

		return context;
	}

	@Override
	public ContextProvider login(String contextId, AuthenticationUserToken authentication) {

		AuthenticationUserPassword authenticationUserPassword = getExternalCredentials(authentication.getUser());

		ContextProvider context = this.login(contextId, authenticationUserPassword);
		if (context == null)
			return null;

		context.get().getContextDescription().setPicture(authentication.getPicture());

		return context;
	}

	@SuppressWarnings("resource")
	@Override
	public ContextProvider login(String contextId, AuthenticationUserPassword authentication) {

		HttpConnector connector = connect(authentication.getUser(), authentication.getPassword(), authentication.getTenant());
		if (connector == null)
			return null;

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
	public ContextProvider login(String contextId, AuthenticationAdminKey authentication) {

		HttpConnector connector = connect(authentication.getAdminKey(), authentication.getTenant());
		if (connector == null)
			return null;

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
		URIBuilder checkLogin = new URIBuilder();
		checkLogin.setPath(providerConfig.getUrl() + "/entityCheckLogin");
		checkLogin.setParameter("provider", authentication.getProvider());
		checkLogin.setParameter("accessToken", authentication.getAccessToken());

		Map<String, Object> userInfo = null;
		try {
			switch (authentication.getProvider()) {
			case "GitHub": {
				userInfo = HttpUtils.checkLoginGitHub(authentication);
				authentication.setPicture((String) userInfo.get("avatar_url"));

				// build checkLogin
				checkLogin.setParameter("userId", (String) userInfo.get("email"));
				checkLogin.setParameter("email", (String) userInfo.get("email"));
				checkLogin.setParameter("firstName", (String) userInfo.get("name"));
				checkLogin.setParameter("lastName", (String) userInfo.get("lastName"));
				break;
			}
			case "Google": {
				userInfo = HttpUtils.checkLoginGoogle(authentication);
				authentication.setPicture((String) userInfo.get("picture"));

				// build checkLogin
				checkLogin.setParameter("userId", (String) userInfo.get("email"));
				checkLogin.setParameter("email", (String) userInfo.get("email"));
				checkLogin.setParameter("firstName", (String) userInfo.get("given_name"));
				checkLogin.setParameter("lastName", (String) userInfo.get("family_name"));
				break;
			}
			case "LinkedIn": {
				userInfo = HttpUtils.checkLoginLinkedIn(authentication);
				authentication.setPicture((String) userInfo.get("picture"));

				// build checkLogin
				checkLogin.setParameter("userId", (String) userInfo.get("email"));
				checkLogin.setParameter("email", (String) userInfo.get("email"));
				checkLogin.setParameter("firstName", (String) userInfo.get("localizedFirstName"));
				checkLogin.setParameter("lastName", (String) userInfo.get("localizedLastName"));
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
		try {
			try (CloseableHttpResponse response = HTTP.execute(new HttpPost(checkLogin.build()))) {
				if (response.getStatusLine().getStatusCode() != HttpServletResponse.SC_OK)
					throw new Exception(response.getStatusLine().getReasonPhrase());
			}
		} catch (Exception e) {
			LOGGER.audit(e.getMessage());
			return false;
		}

		return true;
	}

	private HttpConnector connect(String user, String password, String tenant) {

		LOGGER.audit("Connection from user {} tenant {}", user, tenant);

		URIBuilder uri = new URIBuilder().setPath(providerConfig.getUrl() + "/login");
		if (tenant != null)
			uri.setParameter("user", tenant + "/" + user);
		else
			uri.setParameter("user", user);
		uri.setParameter("password", password);

		HttpConnector connector = null;

		try {
			ResourceSerializer<ContextDescription> serializer = resourceManager.createResourceSerializer(application.getContext(), ContextDescription.class, SerializationType.MIMO);
			ContextDescription contextDescription = HTTP.execute(new HttpPost(uri.build()), new HttpLoginHandler(serializer));
			connector = new HttpConnector(providerConfig, HTTP, contextDescription);
			LOGGER.audit("Connection success id {} user {} tenant {}", contextDescription.getId(), contextDescription.getUser(), contextDescription.getTenant());
		} catch (Exception e) {
			LOGGER.audit("Connection failed {}", e.getMessage());
		}

		return connector;
	}

	private HttpConnector connect(String adminKey, String tenant) {

		LOGGER.audit("Connection from adminKey {} tenant {}", adminKey, tenant);

		URIBuilder uri = new URIBuilder().setPath(providerConfig.getUrl() + "/login");
		if (tenant != null)
			uri.setParameter("adminKey", tenant + "/" + adminKey);
		else
			uri.setParameter("adminKey", adminKey);

		HttpConnector connector = null;

		try {
			ResourceSerializer<ContextDescription> serializer = resourceManager.createResourceSerializer(application.getContext(), ContextDescription.class, SerializationType.MIMO);
			ContextDescription contextDescription = HTTP.execute(new HttpPost(uri.build()), new HttpLoginHandler(serializer));
			connector = new HttpConnector(providerConfig, HTTP, contextDescription);
			LOGGER.audit("Connection success adminKey {} tenant {}", adminKey, tenant);
		} catch (Exception e) {
			LOGGER.audit("Connection failed {}", e.getMessage());
		}

		return connector;
	}

	private void disconnect(Context context, HttpConnector connector) {

		try {
			ResourceSerializer<ContextDescription> serializer = resourceManager.createResourceSerializer(application.getContext(), ContextDescription.class, SerializationType.MIMO);
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

	private AuthenticationUserPassword getExternalCredentials(String user) {

		AuthenticationUserPassword authenticationUserPassword = ContextFactory.eINSTANCE.createAuthenticationUserPassword();

		try  {
			URI uri = new URIBuilder().setPath(providerConfig.getUrl() + "/entityExternalCredential").setParameter("userId", user).build();

			try (CloseableHttpResponse response = HTTP.execute(new HttpPost(uri))) {
				if (response.getStatusLine().getStatusCode() != HttpServletResponse.SC_OK)
					throw new Exception(response.getStatusLine().getReasonPhrase());

				authenticationUserPassword.setUser(response.getFirstHeader("user").getValue());
				authenticationUserPassword.setPassword(response.getFirstHeader("password").getValue());
			}
		} catch (Exception e) {
			LOGGER.audit(e.getMessage());
			return null;
		}

		return authenticationUserPassword;
	}

	private class IdleConnectionMonitorThread extends java.lang.Thread {

		private final HttpClientConnectionManager connMgr;
		private volatile boolean shutdown;

		public IdleConnectionMonitorThread(HttpClientConnectionManager connMgr) {
			super();
			this.connMgr = connMgr;
		}

		@Override
		public void run() {
			try {
				while (!shutdown) {
					synchronized (this) {
						wait(3000);
						connMgr.closeExpiredConnections();
						connMgr.closeIdleConnections(10, TimeUnit.SECONDS);
					}
				}
			} catch (InterruptedException ex) {
				// terminate
			}
		}

		@SuppressWarnings("unused")
		public void shutdown() {
			shutdown = true;
			synchronized (this) {
				notifyAll();
			}
		}
	}
}
