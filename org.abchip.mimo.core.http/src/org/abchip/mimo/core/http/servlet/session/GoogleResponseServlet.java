/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.http.servlet.session;

import java.io.IOException;
import java.net.URI;
import java.util.HashMap;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.abchip.mimo.context.AuthenticationAnonymous;
import org.abchip.mimo.context.AuthenticationManager;
import org.abchip.mimo.context.AuthenticationUserToken;
import org.abchip.mimo.context.ContextFactory;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.core.http.ContextUtils;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.fasterxml.jackson.databind.ObjectMapper;

public class GoogleResponseServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public static final String TokenServiceUri = "https://oauth2.googleapis.com/token";
	public static final String TokenInfoUri = "https://oauth2.googleapis.com/tokeninfo";

	public static final RequestConfig StandardRequestConfig = RequestConfig.custom().setCookieSpec(CookieSpecs.STANDARD).build();

	@Inject
	private ResourceManager resourceManager;

	@Inject
	private AuthenticationManager authenticationManager;

	@Override
	protected final void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	protected final void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String state = request.getParameter("state");

		HttpSession session = request.getSession();

		if (state != session.getId())
			session.invalidate();

		String authorizationCode = request.getParameter("code");

		/*
		 * Enumeration<String> paramNames = request.getParameterNames(); while
		 * (paramNames.hasMoreElements()) { String paramName = paramNames.nextElement();
		 * System.out.println(paramName + ": " + request.getParameter(paramName)); }
		 */

		if (authorizationCode == null || authorizationCode.isEmpty()) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Error! Google failed fo get authorization code");
			return;
		}

		String accessToken = null;
		String idToken = null;

		AuthenticationAnonymous authentication = ContextFactory.eINSTANCE.createAuthenticationAnonymous();

		try (ContextProvider context = authenticationManager.login(null, authentication)) {

			// dovremmo accedere con ProductStore e data
			String entityName = "OAuth2Google";
			ResourceReader<?> oauth2Reader = resourceManager.getResourceReader(context.get(), entityName);
			EntityIdentifiable oauth2Google = oauth2Reader.first();

			if (oauth2Google == null) {
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Error! Google get OAuth2 configuration error");
				return;
			}

			HttpPost postMethod = null;
			try (CloseableHttpClient client = HttpClients.custom().build()) {
				String clientId = oauth2Google.isa().getValue(oauth2Google, "clientId", false, false).toString();
				String returnURI = oauth2Google.isa().getValue(oauth2Google, "returnUrl", false, false).toString();
				String secret = oauth2Google.isa().getValue(oauth2Google, "clientSecret", false, false).toString();

				URI uri = new URIBuilder().setPath(TokenServiceUri).setParameter("client_id", clientId).setParameter("client_secret", secret).setParameter("grant_type", "authorization_code")
						.setParameter("code", authorizationCode).setParameter("redirect_uri", returnURI).build();

				postMethod = new HttpPost(uri);
				postMethod.setConfig(StandardRequestConfig);
				try (CloseableHttpResponse postResponse = client.execute(postMethod)) {
					String responseString = new BasicResponseHandler().handleResponse(postResponse);
					if (postResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
						HashMap<?, ?> userMap = new ObjectMapper().readValue(responseString, HashMap.class);
						accessToken = (String) userMap.get("access_token");
						idToken = (String) userMap.get("id_token");
						// Debug.logInfo("Generated Access Token : " + accessToken, module);
					} else {
						response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Error! Google get OAuth2 access token error");
						return;
					}
				}
			} catch (Exception e) {
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
				return;
			}
		}

		// checkLogin
		AuthenticationUserToken authenticationUserToken = ContextFactory.eINSTANCE.createAuthenticationUserToken();
		authenticationUserToken.setIdToken(idToken);
		authenticationUserToken.setAccessToken(accessToken);
		authenticationUserToken.setProvider("Google");

		if (authenticationManager.checkLogin(authenticationUserToken, true)) {
			ContextUtils.removeContext(state);
			@SuppressWarnings("resource")
			ContextProvider context = authenticationManager.login(state, authenticationUserToken);
			ContextUtils.addContext(context.get());

			String location = response.encodeURL("http://localhost:8081");

			response.sendRedirect(location);
		} else {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Error in google response");
			return;
		}
	}
}