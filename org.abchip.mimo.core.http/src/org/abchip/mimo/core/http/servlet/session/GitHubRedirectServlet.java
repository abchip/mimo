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
import java.net.URLEncoder;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.abchip.mimo.context.AuthenticationAnonymous;
import org.abchip.mimo.context.AuthenticationManager;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextFactory;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;

public class GitHubRedirectServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public static final String TokenEndpoint = "https://github.com";
	public static final String AuthorizeUri = "/login/oauth/authorize";
	public static final String DEFAULT_SCOPE = "user,gist,user:email";

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

		HttpSession session = request.getSession();
		System.out.println(session.getId() + ": " + getServletName());

		// anonymous access
		AuthenticationAnonymous authentication = ContextFactory.eINSTANCE.createAuthenticationAnonymous();
		try (Context context = authenticationManager.login(null, authentication)) {

			ResourceReader<EntityIdentifiable> oauth2Reader = resourceManager.getResourceReader(context, "OAuth2GitHub");
			EntityIdentifiable oauth2GitHub = oauth2Reader.first();

			authenticationManager.logout(context);

			if (oauth2GitHub == null) {
				response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				return;
			}

			String clientId = oauth2GitHub.isa().getValue(oauth2GitHub, "clientId", false).toString();
			String returnURI = oauth2GitHub.isa().getValue(oauth2GitHub, "returnUrl", false).toString();
			// Get user authorization code
			try {
				String location = TokenEndpoint + AuthorizeUri + "?client_id=" + clientId + "&response_type=code" + "&scope=" + DEFAULT_SCOPE + "&redirect_uri="
						+ URLEncoder.encode(returnURI, "UTF8") + "&state=" + session.getId();

				response.sendRedirect(location);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}