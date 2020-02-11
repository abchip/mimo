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

public class LinkedInResponseServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	public static final String TokenEndpoint = "https://www.linkedin.com";
	public static final String TokenServiceUri = "/oauth/v2/accessToken";

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
		System.out.println(state + ": " + getServletName());

		if (state != session.getId())
			session.invalidate();

		String authorizationCode = request.getParameter("code");

		if (authorizationCode == null || authorizationCode.isEmpty()) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Error! LinkedIn failed fo get authorization code");
			return;
		}

		String accessToken = null;
		String idToken = null;

		AuthenticationAnonymous authentication = ContextFactory.eINSTANCE.createAuthenticationAnonymous();

		try (Context context = authenticationManager.login(null, authentication)) {

			// dovremmo accedere con ProductStore e data
			String entityName = "OAuth2LinkedIn";
			ResourceReader<?> oauth2Reader = resourceManager.getResourceReader(context, entityName);
			EntityIdentifiable oauth2LinkedIn = oauth2Reader.first();

			if (oauth2LinkedIn == null) {
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Error! LinkedIn get OAuth2 configuration error");
				return;
			}

			HttpPost postMethod = null;
			try (CloseableHttpClient client = HttpClients.custom().build()) {
				String clientId = oauth2LinkedIn.isa().getValue(oauth2LinkedIn, "apiKey", false, false).toString();
				String returnURI = oauth2LinkedIn.isa().getValue(oauth2LinkedIn, "liveReturnUrl", false, false).toString();
				String secret = oauth2LinkedIn.isa().getValue(oauth2LinkedIn, "secretKey", false, false).toString();

				URI uri = new URIBuilder().setScheme(TokenEndpoint.substring(0, TokenEndpoint.indexOf(":"))).setHost(TokenEndpoint.substring(TokenEndpoint.indexOf(":") + 3))
						.setPath(TokenServiceUri).setParameter("client_id", clientId).setParameter("client_secret", secret).setParameter("grant_type", "authorization_code")
						.setParameter("code", authorizationCode).setParameter("redirect_uri", returnURI).build();

				postMethod = new HttpPost(uri);
				postMethod.setConfig(StandardRequestConfig);
				try (CloseableHttpResponse postResponse = client.execute(postMethod)) {
					String responseString = new BasicResponseHandler().handleResponse(postResponse);
					if (postResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
						HashMap<?, ?> userMap = new ObjectMapper().readValue(responseString, HashMap.class);
						accessToken = (String) userMap.get("access_token");
						idToken = accessToken;
						// Debug.logInfo("Generated Access Token : " + accessToken, module);
					} else {
						response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Error! LinkedIn get OAuth2 access token error");
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
		authenticationUserToken.setProvider("LinkedIn");

		if (authenticationManager.checkLogin(authenticationUserToken, true)) {
			ContextUtils.removeContext(state);
			@SuppressWarnings("resource")
			Context context = authenticationManager.login(state, authenticationUserToken);
			ContextUtils.addContext(context);

			String location = response.encodeURL("http://localhost:8081");
			// System.err.println(("Response location: " + location));

			response.sendRedirect(location);
		} else {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Error in linkedin response");
			return;
		}
	}
}