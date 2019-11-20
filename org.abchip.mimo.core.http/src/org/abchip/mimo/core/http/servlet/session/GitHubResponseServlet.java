/**
 *  Copyright (c) 2017, 2019 ABChip and others.
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
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextFactory;
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

public class GitHubResponseServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public static final RequestConfig StandardRequestConfig = RequestConfig.custom().setCookieSpec(CookieSpecs.STANDARD).build();
	public static final String TokenEndpoint = "https://github.com";
	public static final String TokenServiceUri = "/login/oauth/access_token";

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
		System.out.println(state + ": " + getServletName());

		if (state != session.getId())
			session.invalidate();

		String authorizationCode = request.getParameter("code");

		/*
		 * Enumeration<String> paramNames = request.getParameterNames(); while
		 * (paramNames.hasMoreElements()) { String paramName = paramNames.nextElement();
		 * System.out.println(paramName + ": " + request.getParameter(paramName)); }
		 */

		if (authorizationCode == null || authorizationCode.isEmpty()) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Error! GitHub failed fo get authorization code");
			return;
		}

		String accessToken = null;
		String idToken = null;

		AuthenticationAnonymous authentication = ContextFactory.eINSTANCE.createAuthenticationAnonymous();

		try (Context context = authenticationManager.login(null, authentication)) {

			// dovremmo accedere con ProductStore e data
			String entityName = "OAuth2GitHub";
			ResourceReader<?> oauth2Reader = resourceManager.getResourceReader(context, entityName);
			EntityIdentifiable oauth2GitHub = oauth2Reader.first();

			authenticationManager.logout(context);

			if (oauth2GitHub == null) {
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Error! GitHub get OAuth2 configuration error");
				return;
			}

			HttpPost postMethod = null;
			try (CloseableHttpClient client = HttpClients.custom().build()) {
				String clientId = oauth2GitHub.isa().getValue(oauth2GitHub, "clientId", false).toString();
				String returnURI = oauth2GitHub.isa().getValue(oauth2GitHub, "returnUrl", false).toString();
				String secret = oauth2GitHub.isa().getValue(oauth2GitHub, "clientSecret", false).toString();

				URI uri = new URIBuilder().setScheme(TokenEndpoint.substring(0, TokenEndpoint.indexOf(":"))).setHost(TokenEndpoint.substring(TokenEndpoint.indexOf(":") + 3))
						.setPath(TokenServiceUri).setParameter("client_id", clientId).setParameter("client_secret", secret).setParameter("code", authorizationCode)
						.setParameter("redirect_uri", returnURI).build();

				postMethod = new HttpPost(uri);
				postMethod.setConfig(StandardRequestConfig);
				postMethod.setHeader("Accept", "application/json");

				try (CloseableHttpResponse postResponse = client.execute(postMethod)) {
					String responseString = new BasicResponseHandler().handleResponse(postResponse);
					if (postResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
						HashMap<?, ?> userMap = new ObjectMapper().readValue(responseString, HashMap.class);
						accessToken = (String) userMap.get("access_token");
						idToken = (String) userMap.get("token_type");
						// Debug.logInfo("Generated Access Token : " + accessToken, module);
					} else {
						response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Error! GitHub get OAuth2 access token error");
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
		authenticationUserToken.setProvider("GitHub");

		if (authenticationManager.checkLogin(authenticationUserToken, true)) {
			ContextUtils.removeContext(state);
			@SuppressWarnings("resource")
			Context context = authenticationManager.login(state, authenticationUserToken);
			ContextUtils.addContext(context);

			String location = response.encodeURL("http://localhost:8081");
			// System.err.println(("Response location: " + location));

			response.sendRedirect(location);
		} else {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Error in google response");
			return;
		}
	}
}