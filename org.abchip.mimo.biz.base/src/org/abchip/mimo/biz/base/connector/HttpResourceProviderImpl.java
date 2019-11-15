/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.base.connector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.BizEntityNote;
import org.abchip.mimo.biz.BizEntityType;
import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.biz.BizProviderConfig;
import org.abchip.mimo.biz.BizProviderUser;
import org.abchip.mimo.context.AuthenticationAnonymous;
import org.abchip.mimo.context.AuthenticationUserPassword;
import org.abchip.mimo.context.AuthenticationUserToken;
import org.abchip.mimo.context.ContextFactory;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.edi.entity.EdiFrameSetup;
import org.abchip.mimo.edi.message.Message;
import org.abchip.mimo.edi.message.MessageType;
import org.abchip.mimo.edi.transmission.Transmission;
import org.abchip.mimo.edi.transmission.TransmissionType;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceConfig;
import org.abchip.mimo.resource.ResourceFactory;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.impl.ResourceProviderImpl;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.TrustStrategy;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HttpResourceProviderImpl extends ResourceProviderImpl {

	public static final RequestConfig StandardRequestConfig = RequestConfig.custom().setCookieSpec(CookieSpecs.STANDARD).build();

	public static final String google_TokenInfoUri = "https://oauth2.googleapis.com/tokeninfo";
	public static final String linkedin_ApiTokenEndpoint = "https://api.linkedin.com/v2/me";
	public static final String linkedin_EmailApiTokenEndpoint = "https://api.linkedin.com/v2/emailAddress?q=members&projection=(elements*(handle~))";
	public static final String linkedin_PictureApiTokenEndpoint = "https://api.linkedin.com/v2/me?projection=(id,profilePicture(displayImage~:playableStreams))";

	public static final String github_ApiEndpoint = "https://api.github.com";
	public static final String github_UserApiUri = "/user";
	public static final String github_UserEmailApiUri = "/user/emails";

	@Inject
	private ResourceManager resourceManager;
	@Inject
	private BizProviderConfig providerConfig;
	@Inject
	private ContextRoot contextRoot;

	private SSLConnectionSocketFactory sslsf = null;

	private ResourceConfig resourceConfig;

	@PostConstruct
	protected void init() {

		this.resourceConfig = ResourceFactory.eINSTANCE.createResourceConfig();
		this.resourceConfig.setLockSupport(false);		
		this.resourceConfig.setOrderSupport(false);

		resourceManager.registerProvider(BizEntity.class, this);
		resourceManager.registerProvider(BizEntityTyped.class, this);
		resourceManager.registerProvider(BizEntityType.class, this);
		resourceManager.registerProvider(BizEntityNote.class, this);

		resourceManager.registerProvider(EdiFrameSetup.class, this);
		resourceManager.registerProvider(MessageType.class, this);
		resourceManager.registerProvider(Message.class, this);
		resourceManager.registerProvider(Transmission.class, this);
		resourceManager.registerProvider(TransmissionType.class, this);

		try {
			SSLContextBuilder builder = new SSLContextBuilder();
			builder.loadTrustMaterial(null, new TrustStrategy() {
				@Override
				public boolean isTrusted(X509Certificate[] chain, String authType) {
					return true;
				}
			});
			sslsf = new SSLConnectionSocketFactory(builder.build(), new HostnameVerifier() {

				@Override
				public boolean verify(String hostname, SSLSession session) {
					return true;
				}

			});
		} catch (KeyManagementException | NoSuchAlgorithmException | KeyStoreException e) {
			e.printStackTrace();
		}
	}

	private HttpConnector getConnector(ContextProvider contextProvider) {

		HttpConnector connector = null;
		if (contextProvider != null)
			connector = contextProvider.getContext().get(HttpConnector.class);

		if (connector == null && contextProvider instanceof ContextRoot) {
			@SuppressWarnings("unused")
			ContextRoot contextRoot = (ContextRoot) contextProvider;
		}

		return connector;
	}

	private HttpConnector connect(String user, String password, String tenant) {

		HttpConnector connector = null;
		String url = "";

		switch (providerConfig.getLoginType()) {
		case JSON_WEB_TOKEN:
			url = providerConfig.getUrl() + "/entityLogin_jwt";
			break;
		case EXTERNAL_KEY:
			url = providerConfig.getUrl() + "/entityLogin_extk";
			break;
		}

		try {
			List<NameValuePair> postParameters = new ArrayList<>();
			postParameters.add(new BasicNameValuePair("USERNAME", user));
			postParameters.add(new BasicNameValuePair("PASSWORD", password));
			if (tenant != null)
				postParameters.add(new BasicNameValuePair("userTenantId", tenant));

			HttpPost httpPost = new HttpPost(url);
			httpPost.setEntity(new UrlEncodedFormEntity(postParameters));

			@SuppressWarnings("resource")
			CloseableHttpClient client = HttpClients.custom().setSSLSocketFactory(this.sslsf).build();
			try (CloseableHttpResponse response = client.execute(httpPost)) {
				if (response.getStatusLine().getStatusCode() == HttpServletResponse.SC_OK) {

					HttpEntity session = response.getEntity();
					String token = "";
					try (BufferedReader br = new BufferedReader(new InputStreamReader(session.getContent()))) {
						token = br.lines().collect(Collectors.joining(System.lineSeparator()));
					}
					if (!token.isEmpty())
						connector = new HttpConnector(providerConfig, client, token);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return connector;
	}

	@Override
	public void logout(ContextProvider contextProvider) {
		// TODO Auto-generated method stub
		// super.logout(contextProvider);

		HttpConnector connector = getConnector(contextProvider);
		try {
			switch (providerConfig.getLoginType()) {
			case JSON_WEB_TOKEN:
				connector.execute("/entityLogout_jwt?exit=1", null);
				break;
			case EXTERNAL_KEY:
				connector.execute("/entityLogout_extk?exit=1", null);
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// TODO
		contextProvider.getContext().set(HttpConnector.class, null);
	}

	@Override
	public boolean isActive(ContextProvider contextProvider) {

		if (contextProvider == null)
			return false;

		try {
			String url = "/entityCheckStatus?set=1";
			try (CloseableHttpResponse response = getConnector(contextProvider).execute(url, null)) {
				if (response != null && response.getStatusLine().getStatusCode() == HttpServletResponse.SC_OK)
					return true;
			}
		} catch (Exception e) {
			return false;
		}

		return false;
	}

	@Override
	public ContextProvider login(String contextId, AuthenticationAnonymous authentication) {

		BizProviderUser user = this.providerConfig.getPublicUser();
		if (user == null)
			return null;

		AuthenticationUserPassword authenticationUserPassword = ContextFactory.eINSTANCE.createAuthenticationUserPassword();
		authenticationUserPassword.setUser(user.getName());
		authenticationUserPassword.setPassword(user.getPassword());
		ContextProvider contextProvider = this.login(contextId, authenticationUserPassword);

		if (contextProvider != null)
			contextProvider.getContext().getContextDescription().setAnonymous(true);

		return contextProvider;
	}

	@Override
	public ContextProvider login(String contextId, AuthenticationUserPassword authentication) {

		HttpConnector connector = connect(authentication.getUser(), authentication.getPassword(), authentication.getTenant());
		if (connector == null)
			return null;

		ContextProvider contextProvider = contextRoot.createChildContext(contextId);
		contextProvider.getContext().set(HttpConnector.class, connector);

		contextProvider.getContext().getContextDescription().setUser(authentication.getUser());
		contextProvider.getContext().getContextDescription().setTenant(authentication.getTenant());

		return contextProvider;
	}

	@Override
	public ContextProvider login(String contextId, AuthenticationUserToken authentication) {

		// from previous httpClient
		AuthenticationUserPassword authenticationUserPassword = ContextFactory.eINSTANCE.createAuthenticationUserPassword();
		URI uri = null;
		try {
			uri = new URIBuilder().setPath(providerConfig.getUrl() + "/entityExternalCredential").setParameter("userId", authentication.getUser()).build();
		} catch (URISyntaxException e) {
			e.printStackTrace();
			return null;
		}

		try (CloseableHttpResponse response = getHttpsClient().execute(new HttpPost(uri))) {

			if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK)
				return null;

			String user = response.getFirstHeader("user").getValue();
			String password = response.getFirstHeader("password").getValue();
			// System.out.println("User: " + user + " " + "password: " + password);
			authenticationUserPassword.setUser(user);
			authenticationUserPassword.setPassword(password);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

		ContextProvider contextProvider = login(contextId, authenticationUserPassword);
		if (contextProvider == null)
			return null;

		contextProvider.getContext().getContextDescription().setPicture(authentication.getPicture());

		return contextProvider;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean checkLogin(AuthenticationUserToken authentication, boolean create) {

		Map<String, Object> userInfo = null;
		HttpGet getMethod = null;

		switch (authentication.getProvider()) {
		case "GitHub":
			try (CloseableHttpClient client = HttpClients.custom().build()) {
				// Get User Profile
				getMethod = new HttpGet(github_ApiEndpoint + github_UserApiUri);
				getMethod.setConfig(StandardRequestConfig);
				getMethod.setHeader("Authorization", authentication.getIdToken() + " " + authentication.getAccessToken());
				getMethod.setHeader("Accept", "application/json");

				try (CloseableHttpResponse getResponse = client.execute(getMethod)) {
					String responseString = new BasicResponseHandler().handleResponse(getResponse);
					if (getResponse.getStatusLine().getStatusCode() != HttpStatus.SC_OK)
						throw new Exception("Error! GitHub get OAuth2 access token Error");

					userInfo = new ObjectMapper().readValue(responseString, HashMap.class);

					// Get e-mail
					if (userInfo != null) {
						getMethod = new HttpGet(github_ApiEndpoint + github_UserEmailApiUri);
						getMethod.setConfig(StandardRequestConfig);
						getMethod.setHeader("Authorization", authentication.getIdToken() + " " + authentication.getAccessToken());
						getMethod.setHeader("Accept", "application/json");
					}
				}

				try (CloseableHttpResponse getResponse = client.execute(getMethod)) {
					String responseString = new BasicResponseHandler().handleResponse(getResponse);

					if (getResponse.getStatusLine().getStatusCode() != HttpStatus.SC_OK)
						throw new Exception("Error! GitHub retrieve e-mail Error");

					ObjectMapper mapper = new ObjectMapper();
					JsonNode node = mapper.readTree(responseString);

					// retrieve email
					String email = "";
					if (node.isArray()) {
						for (final JsonNode objNode : node) {
							boolean primary = objNode.get("primary").asBoolean();
							boolean verified = objNode.get("verified").asBoolean();
							if (verified && primary) {
								email = objNode.get("email").asText();
								break;
							}
						}
					}
					if (!email.isEmpty()) {
						userInfo.put("email", email);
					}
					if (userInfo.get("email") == null) {
						throw new Exception("Error! GitHub retrieve e-mail Error");
					}
				}
			} catch (Exception e) {
				e.getStackTrace();
				return false;
			}
			if (userInfo.get("name") == null) {
				userInfo.put("name", "NoFirstName");
			}
			if (userInfo.get("lastName") == null) {
				userInfo.put("lastName", "NoLastName");
			}

			URI uri = null;

			try {
				uri = new URIBuilder().setPath(providerConfig.getUrl() + "/entityCheckLogin").setParameter("provider", authentication.getProvider())
						.setParameter("accessToken", authentication.getAccessToken()).setParameter("userId", (String) userInfo.get("email"))
						.setParameter("firstName", (String) userInfo.get("name")).setParameter("lastName", (String) userInfo.get("lastName"))
						.setParameter("email", (String) userInfo.get("email")).build();
			} catch (URISyntaxException e) {
				e.printStackTrace();
				return false;
			}

			try (CloseableHttpResponse response = getHttpsClient().execute(new HttpPost(uri))) {

				if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
					return false;
				}
				authentication.setUser((String) userInfo.get("email"));
				authentication.setPicture((String) userInfo.get("avatar_url"));

			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
			break;
		case "Google":
			// Get User Profile
			userInfo = null;
			getMethod = new HttpGet(google_TokenInfoUri + "?id_token=" + authentication.getIdToken());

			try (CloseableHttpClient client = HttpClients.custom().build()) {
				getMethod.setConfig(StandardRequestConfig);
				getMethod.setHeader("Accept", "application/json");

				try (CloseableHttpResponse getResponse = client.execute(getMethod)) {
					String responseString = new BasicResponseHandler().handleResponse(getResponse);
					if (getResponse.getStatusLine().getStatusCode() != HttpStatus.SC_OK)
						throw new Exception("Error! Google get OAuth2 access token Error");

					userInfo = new ObjectMapper().readValue(responseString, HashMap.class);
				}
			} catch (Exception e) {
				e.getStackTrace();
				return false;
			}

			try {
				uri = new URIBuilder().setPath(providerConfig.getUrl() + "/entityCheckLogin").setParameter("provider", authentication.getProvider())
						.setParameter("accessToken", authentication.getAccessToken()).setParameter("userId", (String) userInfo.get("email"))
						.setParameter("firstName", (String) userInfo.get("given_name")).setParameter("lastName", (String) userInfo.get("family_name"))
						.setParameter("email", (String) userInfo.get("email")).build();

				try (CloseableHttpResponse response = getHttpsClient().execute(new HttpPost(uri))) {

					if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
						return false;
					}
					authentication.setUser((String) userInfo.get("email"));
					authentication.setPicture((String) userInfo.get("picture"));
				}
			} catch (IOException | URISyntaxException e) {
				e.printStackTrace();
				return false;
			}
			break;
		case "LinkedIn":
			try (CloseableHttpClient client = HttpClients.custom().build()) {
				// Get User Profile
				userInfo = null;
				getMethod = new HttpGet(linkedin_ApiTokenEndpoint);
				getMethod.setHeader("Host", "api.linkedin.com");
				getMethod.setHeader("Connection", "Keep-Alive");
				getMethod.setHeader("Authorization", "Bearer " + authentication.getIdToken());
				getMethod.setConfig(StandardRequestConfig);
				getMethod.setHeader("Accept", "application/json");

				try (CloseableHttpResponse getResponse = client.execute(getMethod)) {
					String responseString = new BasicResponseHandler().handleResponse(getResponse);
					if (getResponse.getStatusLine().getStatusCode() != HttpStatus.SC_OK)
						throw new Exception("Error! LinkedIn get OAuth2 access token Error");

					userInfo = new ObjectMapper().readValue(responseString, HashMap.class);
				}
				// Get e-mail

				if (userInfo != null) {
					// retrieve email
					String email = "";
					getMethod = new HttpGet(linkedin_EmailApiTokenEndpoint);
					getMethod.setHeader("Host", "api.linkedin.com");
					getMethod.setHeader("Connection", "Keep-Alive");
					getMethod.setHeader("Authorization", "Bearer " + authentication.getIdToken());
					getMethod.setConfig(StandardRequestConfig);
					getMethod.setHeader("Accept", "application/json");

					try (CloseableHttpResponse getResponse = client.execute(getMethod)) {
						String responseString = new BasicResponseHandler().handleResponse(getResponse);

						if (getResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
							ObjectMapper mapper = new ObjectMapper();
							JsonNode node = mapper.readTree(responseString);
							JsonNode elements = node.get("elements");
							if (elements.isArray()) {
								for (final JsonNode objNode : elements) {
									email = objNode.get("handle~").get("emailAddress").asText();
								}
							}
							if (!email.isEmpty()) {
								userInfo.put("email", email);
							}
							if (userInfo.get("email") == null) {
								throw new Exception("Error! LinkedIn retrieve e-mail Error");
							}
						} else {
							throw new Exception("Error! LinkedIn retrieve e-mail Error");
						}
					}
				}

				// Get picture

				if (userInfo != null) {
					// retrieve picture
					@SuppressWarnings("unused")
					String picture = "";
					getMethod = new HttpGet("https://api.linkedin.com/v2/me?projection=(" + authentication.getIdToken() + ",profilePicture(displayImage~:playableStreams))");
					getMethod.setHeader("Host", "api.linkedin.com");
					getMethod.setHeader("Connection", "Keep-Alive");
					getMethod.setHeader("Authorization", "Bearer " + authentication.getIdToken());
					getMethod.setConfig(StandardRequestConfig);
					getMethod.setHeader("Accept", "application/json");

					try (CloseableHttpResponse getResponse = client.execute(getMethod)) {
						@SuppressWarnings("unused")
						String responseString = new BasicResponseHandler().handleResponse(getResponse);
					}
				}

			} catch (Exception e) {
				e.getStackTrace();
				return false;
			}

			try {
				uri = new URIBuilder().setPath(providerConfig.getUrl() + "/entityCheckLogin").setParameter("provider", authentication.getProvider())
						.setParameter("accessToken", authentication.getAccessToken()).setParameter("userId", (String) userInfo.get("email"))
						.setParameter("firstName", (String) userInfo.get("localizedFirstName")).setParameter("lastName", (String) userInfo.get("localizedLastName"))
						.setParameter("email", (String) userInfo.get("email")).build();

				try (CloseableHttpResponse response = getHttpsClient().execute(new HttpPost(uri))) {

					if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
						return false;
					}
					authentication.setUser((String) userInfo.get("email"));
				}

			} catch (IOException | URISyntaxException e) {
				e.printStackTrace();
				return false;
			}
			break;
		default:
			break;
		}

		return true;
	}

	private CloseableHttpClient getHttpsClient() {
		CloseableHttpClient client = null;
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
			client = HttpClients.custom().setSSLSocketFactory(sslsf).build();
		} catch (KeyManagementException | NoSuchAlgorithmException | KeyStoreException e) {
			e.printStackTrace();
			return null;
		}

		return client;
	}

	@Override
	public <E extends EntityNameable> Resource<E> doGetResource(ContextProvider contextProvider, Frame<E> frame, String tenant) {

		HttpConnector connector = contextProvider.getContext().get(HttpConnector.class);
		if (connector == null)
			return null;

		Resource<E> resource = new HttpResourceImpl<E>(contextProvider, frame, tenant, connector);
		resource.setResourceConfig(this.resourceConfig);

		return resource;
	}
}