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
import java.net.URLEncoder;
import java.util.UUID;

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

public class GoogleRedirectServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public static final String AUTHORIZE_URI = "https://accounts.google.com/o/oauth2/auth";
	public static final String DEFAULT_SCOPE = "openid%20email%20profile";
	// public static final String SESSION_GOOGLE_STATE = "_GOOGLE_STATE_";

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

			ResourceReader<?> oauth2Reader = resourceManager.getResourceReader(context, "OAuth2Google");
			EntityIdentifiable oauth2Google = oauth2Reader.first();

			if (oauth2Google == null) {
				response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				return;
			}

			String clientId = oauth2Google.isa().getValue(oauth2Google, "clientId", false, false).toString();
			String returnURI = oauth2Google.isa().getValue(oauth2Google, "returnUrl", false, false).toString();
			// Get user authorization code
			try {
				String location = AUTHORIZE_URI + "?client_id=" + clientId + "&response_type=code" + "&scope=" + DEFAULT_SCOPE + "&nonce=" + UUID.randomUUID() + "&redirect_uri="
						+ URLEncoder.encode(returnURI, "UTF8") + "&state=" + session.getId();

				response.sendRedirect(location);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}