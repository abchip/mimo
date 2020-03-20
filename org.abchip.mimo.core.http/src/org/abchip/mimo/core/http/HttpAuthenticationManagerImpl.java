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
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.context.AuthenticationAdminKey;
import org.abchip.mimo.context.AuthenticationAnonymous;
import org.abchip.mimo.context.AuthenticationManager;
import org.abchip.mimo.context.AuthenticationUserPassword;
import org.abchip.mimo.context.AuthenticationUserToken;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextFactory;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.context.ProviderConfig;
import org.abchip.mimo.context.ProviderUser;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.SerializationType;
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

public class HttpAuthenticationManagerImpl implements AuthenticationManager {

	@Inject
	private ContextRoot contextRoot;
	@Inject
	private ResourceManager resourceManager;
	@Inject
	private ProviderConfig providerConfig;

	private static final RequestConfig StandardRequestConfig = RequestConfig.custom().setCookieSpec(CookieSpecs.STANDARD).build();

	private static final String google_TokenInfoUri = "https://oauth2.googleapis.com/tokeninfo";
	private static final String linkedin_ApiTokenEndpoint = "https://api.linkedin.com/v2/me";
	private static final String linkedin_EmailApiTokenEndpoint = "https://api.linkedin.com/v2/emailAddress?q=members&projection=(elements*(handle~))";
	@SuppressWarnings("unused")
	private static final String linkedin_PictureApiTokenEndpoint = "https://api.linkedin.com/v2/me?projection=(id,profilePicture(displayImage~:playableStreams))";

	private static final String github_ApiEndpoint = "https://api.github.com";
	private static final String github_UserApiUri = "/user";
	private static final String github_UserEmailApiUri = "/user/emails";

	private SSLConnectionSocketFactory sslsf = null;

	@PostConstruct
	protected void init() {

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
				ObjectMapper mapper = null;

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
							mapper = new ObjectMapper();
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

					String responseString = "";
					try (CloseableHttpResponse getResponse = client.execute(getMethod)) {
						responseString = new BasicResponseHandler().handleResponse(getResponse);

						mapper = new ObjectMapper();
						JsonNode node = mapper.readTree(responseString);
						JsonNode profilePicture = node.get("profilePicture");
						JsonNode displayImage = profilePicture.get("displayImage~");
						JsonNode elements = displayImage.get("elements");
						JsonNode element = elements.get(0);
						JsonNode identifiers = element.get("identifiers");
						picture = identifiers.get(0).get("identifier").asText();
						if (picture != null)
							userInfo.put("picture", picture);
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
					authentication.setPicture((String) userInfo.get("picture"));
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

	@Override
	public Context login(String contextId, AuthenticationAnonymous authentication) {

		ProviderUser user = this.providerConfig.getPublicUser();
		if (user == null)
			return null;

		AuthenticationUserPassword authenticationUserPassword = ContextFactory.eINSTANCE.createAuthenticationUserPassword();
		authenticationUserPassword.setUser(user.getUser());
		authenticationUserPassword.setPassword(user.getPassword());
		Context context = this.login(contextId, authenticationUserPassword);

		if (context != null)
			context.getContextDescription().setAnonymous(true);

		return context;
	}

	@Override
	public Context login(String contextId, AuthenticationUserPassword authentication) {

		HttpConnector connector = connect(authentication.getUser(), authentication.getPassword(), authentication.getTenant());
		if (connector == null)
			return null;

		Context context = contextRoot.createChildContext(contextId);
		context.getContextDescription().setUser(authentication.getUser());
		context.getContextDescription().setTenant(authentication.getTenant());
		context.getContextDescription().setCurrencyUom(connector.getContextDescription().getCurrencyUom());
		context.getContextDescription().setLocale(connector.getContextDescription().getLocale());
		context.getContextDescription().setTimeZone(connector.getContextDescription().getTimeZone());

		context.set(HttpConnector.class, connector);

		return context;
	}

	@Override
	public Context login(String contextId, AuthenticationAdminKey authentication) {

		HttpConnector connector = connect(authentication.getAdminKey(), authentication.getTenant());
		if (connector == null)
			return null;

		Context context = contextRoot.createChildContext(contextId);
		context.getContextDescription().setTenant(authentication.getTenant());
		context.getContextDescription().setCurrencyUom(connector.getContextDescription().getCurrencyUom());
		context.getContextDescription().setLocale(connector.getContextDescription().getLocale());
		context.getContextDescription().setTimeZone(connector.getContextDescription().getTimeZone());

		context.set(HttpConnector.class, connector);

		return context;
	}

	@Override
	public Context login(String contextId, AuthenticationUserToken authentication) {

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

		Context context = login(contextId, authenticationUserPassword);
		if (context == null)
			return null;

		context.getContextDescription().setPicture(authentication.getPicture());

		return context;
	}

	private HttpConnector connect(String user, String password, String tenant) {

		List<NameValuePair> postParameters = new ArrayList<>();

		if (tenant != null)
			postParameters.add(new BasicNameValuePair("user", tenant + "/" + user));
		else
			postParameters.add(new BasicNameValuePair("user", user));

		postParameters.add(new BasicNameValuePair("password", password));

		String url = providerConfig.getUrl() + "/login";

		HttpConnector connector = null;
		try {

			HttpPost httpPost = new HttpPost(url);
			httpPost.setEntity(new UrlEncodedFormEntity(postParameters));

			@SuppressWarnings("resource")
			CloseableHttpClient client = HttpClients.custom().setSSLSocketFactory(this.sslsf).build();
			try (CloseableHttpResponse response = client.execute(httpPost)) {
				if (response.getStatusLine().getStatusCode() == HttpServletResponse.SC_OK) {

					HttpEntity session = response.getEntity();

					ResourceSerializer<ContextDescription> contextSerializer = resourceManager.createResourceSerializer(contextRoot, ContextDescription.class,
							SerializationType.JAVA_SCRIPT_OBJECT_NOTATION);
					contextSerializer.load(session.getContent(), false);
					ContextDescription contextDescription = contextSerializer.get();

					if (contextDescription != null)
						connector = new HttpConnector(providerConfig, client, contextDescription);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return connector;
	}

	private HttpConnector connect(String adminKey, String tenant) {

		List<NameValuePair> postParameters = new ArrayList<>();
		if (tenant != null)
			postParameters.add(new BasicNameValuePair("adminKey", tenant + "/" + adminKey));
		else
			postParameters.add(new BasicNameValuePair("adminKey", adminKey));

		String url = providerConfig.getUrl() + "/login";

		HttpConnector connector = null;
		try {

			HttpPost httpPost = new HttpPost(url);
			httpPost.setEntity(new UrlEncodedFormEntity(postParameters));

			@SuppressWarnings("resource")
			CloseableHttpClient client = HttpClients.custom().setSSLSocketFactory(this.sslsf).build();
			try (CloseableHttpResponse response = client.execute(httpPost)) {
				if (response.getStatusLine().getStatusCode() == HttpServletResponse.SC_OK) {

					HttpEntity session = response.getEntity();

					ResourceSerializer<ContextDescription> contextSerializer = resourceManager.createResourceSerializer(contextRoot, ContextDescription.class,
							SerializationType.JAVA_SCRIPT_OBJECT_NOTATION);
					contextSerializer.load(session.getContent(), false);
					ContextDescription contextDescription = contextSerializer.get();

					if (contextDescription != null)
						connector = new HttpConnector(providerConfig, client, contextDescription);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return connector;
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
}
