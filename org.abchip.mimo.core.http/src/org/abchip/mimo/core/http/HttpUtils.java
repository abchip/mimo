/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.http;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.authentication.AuthenticationUserToken;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HttpUtils {

	private static final RequestConfig StandardRequestConfig = RequestConfig.custom().setCookieSpec(CookieSpecs.STANDARD).build();

	// GitHub
	private static final String github_ApiEndpoint = "https://api.github.com";
	private static final String github_UserApiUri = "/user";
	private static final String github_UserEmailApiUri = "/user/emails";

	// Google
	private static final String google_ApiEndpoint = "https://oauth2.googleapis.com";
	private static final String google_UserApiUri = "/tokeninfo";

	// LinkedIn
	private static final String linkedin_ApiEndpoint = "https://api.linkedin.com/v2";
	private static final String linkedin_UserApiUri = "/me";
	private static final String linkedIn_UserEmailApiUri = "/emailAddress?q=members&projection=(elements*(handle~))";

	public static String getParametersAsString(HttpServletRequest request) {

		StringBuffer sb = new StringBuffer();

		for (String paramName : Collections.list(request.getParameterNames())) {
			if (sb.toString().isEmpty())
				sb.append("?");
			else
				sb.append("&");
			sb.append(paramName + "=" + request.getParameter(paramName));
		}

		return sb.toString();
	}

	@SuppressWarnings("unchecked")
	public static Map<String, Object> checkLoginGitHub(AuthenticationUserToken authentication) throws Exception {

		Map<String, Object> userInfo = null;

		// Get User Profile
		HttpGet method = new HttpGet(github_ApiEndpoint + github_UserApiUri);
		method.setConfig(StandardRequestConfig);
		method.setHeader("Authorization", authentication.getIdToken() + " " + authentication.getAccessToken());
		method.setHeader("Accept", "application/json");

		try (CloseableHttpClient client = buildHttpsClient()) {
			try (CloseableHttpResponse response = client.execute(method)) {
				if (response.getStatusLine().getStatusCode() != HttpServletResponse.SC_OK)
					throw HttpUtils.buildException(response);

				String responseString = new BasicResponseHandler().handleResponse(response);
				userInfo = new ObjectMapper().readValue(responseString, HashMap.class);
			}

			if (userInfo == null)
				throw new Exception("Invalid user information");

			// Get User Email
			method = new HttpGet(github_ApiEndpoint + github_UserEmailApiUri);
			method.setConfig(StandardRequestConfig);
			method.setHeader("Authorization", authentication.getIdToken() + " " + authentication.getAccessToken());
			method.setHeader("Accept", "application/json");

			try (CloseableHttpResponse response = client.execute(method)) {
				if (response.getStatusLine().getStatusCode() != HttpServletResponse.SC_OK)
					throw HttpUtils.buildException(response);

				String responseString = new BasicResponseHandler().handleResponse(response);
				JsonNode node = new ObjectMapper().readTree(responseString);

				// search primary
				if (node.isArray()) {
					for (final JsonNode objNode : node) {
						boolean primary = objNode.get("primary").asBoolean();
						boolean verified = objNode.get("verified").asBoolean();
						if (verified && primary) {
							String email = objNode.get("email").asText();
							if (!email.isEmpty()) {
								userInfo.put("email", email);
								break;
							}
						}
					}
				}
				// default
				else {
					userInfo.put("email", node.get("email").asText());
				}
			}
		}

		return userInfo;
	}

	@SuppressWarnings("unchecked")
	public static Map<String, Object> checkLoginLinkedIn(AuthenticationUserToken authentication) throws Exception {

		Map<String, Object> userInfo = null;

		// Get User Profile
		HttpGet method = new HttpGet(linkedin_ApiEndpoint + linkedin_UserApiUri);
		method.setHeader("Host", "api.linkedin.com");
		method.setHeader("Connection", "Keep-Alive");
		method.setHeader("Authorization", "Bearer " + authentication.getIdToken());
		method.setConfig(StandardRequestConfig);
		method.setHeader("Accept", "application/json");

		try (CloseableHttpClient client = HttpUtils.buildHttpsClient()) {
			try (CloseableHttpResponse response = client.execute(method)) {
				if (response.getStatusLine().getStatusCode() != HttpServletResponse.SC_OK)
					throw HttpUtils.buildException(response);

				String responseString = new BasicResponseHandler().handleResponse(response);
				userInfo = new ObjectMapper().readValue(responseString, HashMap.class);
			}

			if (userInfo == null)
				return null;

			// Get User Email
			method = new HttpGet(linkedin_ApiEndpoint + linkedIn_UserEmailApiUri);
			method.setHeader("Host", "api.linkedin.com");
			method.setHeader("Connection", "Keep-Alive");
			method.setHeader("Authorization", "Bearer " + authentication.getIdToken());
			method.setConfig(StandardRequestConfig);
			method.setHeader("Accept", "application/json");
			try (CloseableHttpResponse response = client.execute(method)) {
				if (response.getStatusLine().getStatusCode() != HttpServletResponse.SC_OK)
					throw HttpUtils.buildException(response);

				String responseString = new BasicResponseHandler().handleResponse(response);
				JsonNode node = new ObjectMapper().readTree(responseString);

				// search primary
				JsonNode elements = node.get("elements");
				if (elements.isArray()) {
					for (final JsonNode objNode : elements) {
						String email = objNode.get("handle~").get("emailAddress").asText();
						if (!email.isEmpty()) {
							userInfo.put("email", email);
							break;
						}
					}
				}
				// default
				else {
					userInfo.put("email", elements.get("handle~").get("emailAddress").asText());
				}
			}

			// Get User Picture
			String picture = "";
			method = new HttpGet(linkedin_ApiEndpoint + "/me?projection=(" + authentication.getIdToken() + ",profilePicture(displayImage~:playableStreams))");
			method.setHeader("Host", "api.linkedin.com");
			method.setHeader("Connection", "Keep-Alive");
			method.setHeader("Authorization", "Bearer " + authentication.getIdToken());
			method.setConfig(StandardRequestConfig);
			method.setHeader("Accept", "application/json");

			try (CloseableHttpResponse response = client.execute(method)) {
				if (response.getStatusLine().getStatusCode() != HttpServletResponse.SC_OK)
					throw HttpUtils.buildException(response);

				String responseString = new BasicResponseHandler().handleResponse(response);
				JsonNode node = new ObjectMapper().readTree(responseString);

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

		return userInfo;
	}

	@SuppressWarnings("unchecked")
	public static Map<String, Object> checkLoginGoogle(AuthenticationUserToken authentication) throws Exception {

		Map<String, Object> userInfo = null;

		// Get User Profile
		HttpGet method = new HttpGet(google_ApiEndpoint + google_UserApiUri + "?id_token=" + authentication.getIdToken());
		method.setConfig(StandardRequestConfig);
		method.setHeader("Accept", "application/json");

		try (CloseableHttpClient client = HttpUtils.buildHttpsClient()) {
			try (CloseableHttpResponse response = client.execute(method)) {
				if (response.getStatusLine().getStatusCode() != HttpServletResponse.SC_OK)
					throw HttpUtils.buildException(response);

				String responseString = new BasicResponseHandler().handleResponse(response);
				userInfo = new ObjectMapper().readValue(responseString, HashMap.class);
			}
		}

		return userInfo;
	}

	public static ClientProtocolException buildException(HttpResponse response) {
		StringBuilder sb = new StringBuilder();
		sb.append(response.getStatusLine().getStatusCode() + " " + response.getStatusLine().getReasonPhrase());
		return new ClientProtocolException(sb.toString());
	}

	private static CloseableHttpClient buildHttpsClient() throws Exception {

		CloseableHttpClient httpClient = null;

		httpClient = HttpClients.custom().build();

		return httpClient;
	}

}