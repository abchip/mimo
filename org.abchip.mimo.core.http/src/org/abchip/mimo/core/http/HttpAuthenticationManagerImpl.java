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
import java.io.InputStream;
import java.net.URI;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
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
import org.abchip.mimo.context.ThreadManager;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.SerializationType;
import org.abchip.mimo.util.Logs;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.TrustStrategy;
import org.apache.http.util.EntityUtils;
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

	private PoolingHttpClientConnectionManager pool = null;

	private CloseableHttpClient HTTP = null;

	@PostConstruct
	private void init() {

		pool = new PoolingHttpClientConnectionManager();
		pool.setMaxTotal(250);
		pool.setDefaultMaxPerRoute(25);

		pool.setMaxPerRoute(new HttpRoute(new HttpHost("localhost", 8080)), 200);
		pool.setMaxPerRoute(new HttpRoute(new HttpHost("localhost", 8443)), 200);

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

			HTTP = HttpClients.custom().setConnectionManager(pool).setSSLSocketFactory(sslsf).build();
		} catch (KeyManagementException | NoSuchAlgorithmException | KeyStoreException e) {
			LOGGER.error(e.getMessage());
		}

		org.abchip.mimo.context.Thread thread = threadManager.createThread(application.getName() + "-http-monitor", new IdleConnectionMonitorThread(pool));
		threadManager.start(thread);
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
		try (CloseableHttpClient client = HttpUtils.buildHttpsClient()) {
			HttpPost httpPost = new HttpPost(checkLogin.build());
			try (CloseableHttpResponse response = client.execute(httpPost)) {
				if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK)
					throw new Exception(response.getStatusLine().getReasonPhrase());
			}
		} catch (Exception e) {
			LOGGER.audit(e.getMessage());
			return false;
		}

		return true;
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
				case CLOSE:
					disconnect(connector);
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
				case CLOSE:
					disconnect(connector);
					break;
				}
			}
		});

		return contextProvider;
	}

	private void disconnect(HttpConnector connector) {

		HttpPost httpPost = connector.prepare("logout", null);
		try (CloseableHttpResponse response = connector.execute(httpPost)) {

			if (response.getStatusLine().getStatusCode() == HttpServletResponse.SC_ACCEPTED)
				LOGGER.audit("Disconnection success {}", response.getStatusLine().getReasonPhrase());
			else
				LOGGER.audit("Disconnection failed {}", response.getStatusLine().getReasonPhrase());

			EntityUtils.consume(response.getEntity());
		} catch (Exception e) {
			LOGGER.audit("Disconnection failed {}", e.getMessage());
		} finally {
			httpPost.reset();
			try {
				connector.close();
			} catch (IOException e) {
				LOGGER.audit(e.getMessage());
			}
		}
	}

	private HttpConnector connect(String user, String password, String tenant) {

		LOGGER.audit("Connection from user {} for tenant {}", user, tenant);

		List<NameValuePair> postParameters = new ArrayList<>();
		if (tenant != null)
			postParameters.add(new BasicNameValuePair("user", tenant + "/" + user));
		else
			postParameters.add(new BasicNameValuePair("user", user));
		postParameters.add(new BasicNameValuePair("password", password));

		HttpConnector connector = null;

		try (CloseableHttpClient client = HttpUtils.buildHttpsClient()) {
			URIBuilder uri = new URIBuilder().setPath(providerConfig.getUrl() + "/login");

			HttpPost httpPost = new HttpPost(uri.build());
			httpPost.setEntity(new UrlEncodedFormEntity(postParameters));

			try (CloseableHttpResponse response = client.execute(httpPost)) {
				if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK)
					throw new Exception(response.getStatusLine().getReasonPhrase());

				ResourceSerializer<ContextDescription> contextSerializer = resourceManager.createResourceSerializer(application.getContext(), ContextDescription.class,
						SerializationType.JAVA_SCRIPT_OBJECT_NOTATION);
				HttpEntity entity = response.getEntity();
				try (InputStream stream = entity.getContent()) {
					contextSerializer.load(stream, false);
				}
				EntityUtils.consume(entity);

				ContextDescription contextDescription = contextSerializer.get();
				connector = new HttpConnector(providerConfig, HTTP, contextDescription);

				LOGGER.audit("Connection success for user {} tenant", user, tenant);
			} finally {
				httpPost.releaseConnection();
			}
		} catch (Exception e) {
			LOGGER.audit("Connection failed {}", e.getMessage());
			return null;
		}

		return connector;
	}

	private HttpConnector connect(String adminKey, String tenant) {

		LOGGER.audit("Connection from adminKey {} for tenant {}", adminKey, tenant);

		List<NameValuePair> postParameters = new ArrayList<>();
		if (tenant != null)
			postParameters.add(new BasicNameValuePair("adminKey", tenant + "/" + adminKey));
		else
			postParameters.add(new BasicNameValuePair("adminKey", adminKey));

		HttpConnector connector = null;

		try (CloseableHttpClient client = HttpUtils.buildHttpsClient()) {
			URIBuilder uri = new URIBuilder().setPath(providerConfig.getUrl() + "/login");

			HttpPost httpPost = new HttpPost(uri.build());
			httpPost.setEntity(new UrlEncodedFormEntity(postParameters));

			try (CloseableHttpResponse response = client.execute(httpPost)) {
				if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK)
					throw new Exception(response.getStatusLine().getReasonPhrase());

				ResourceSerializer<ContextDescription> contextSerializer = resourceManager.createResourceSerializer(application.getContext(), ContextDescription.class,
						SerializationType.JAVA_SCRIPT_OBJECT_NOTATION);
				HttpEntity entity = response.getEntity();
				try (InputStream stream = entity.getContent()) {
					contextSerializer.load(stream, false);
				}
				EntityUtils.consume(entity);

				ContextDescription contextDescription = contextSerializer.get();
				connector = new HttpConnector(providerConfig, HTTP, contextDescription);

				LOGGER.audit("Connection success for adminKey {} tenant", adminKey, tenant);
			} finally {
				httpPost.releaseConnection();
			}
		} catch (Exception e) {
			LOGGER.audit("Connection failed {}", e.getMessage());
			return null;
		}

		return connector;
	}

	private AuthenticationUserPassword getExternalCredentials(String user) {

		AuthenticationUserPassword authenticationUserPassword = ContextFactory.eINSTANCE.createAuthenticationUserPassword();

		try (CloseableHttpClient client = HttpUtils.buildHttpsClient()) {
			URI uri = new URIBuilder().setPath(providerConfig.getUrl() + "/entityExternalCredential").setParameter("userId", user).build();

			try (CloseableHttpResponse response = client.execute(new HttpPost(uri))) {
				if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK)
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
