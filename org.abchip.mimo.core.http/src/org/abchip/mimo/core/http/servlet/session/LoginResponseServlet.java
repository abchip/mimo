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

import javax.inject.Inject;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.authentication.AuthenticationException;
import org.abchip.mimo.authentication.AuthenticationManager;
import org.abchip.mimo.authentication.AuthenticationProvider;
import org.abchip.mimo.authentication.AuthenticationProviderRegistry;
import org.abchip.mimo.authentication.AuthenticationUserToken;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.core.http.ContextUtils;

public class LoginResponseServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private Application application;
	@Inject
	private AuthenticationManager authenticationManager;
	@Inject
	AuthenticationProviderRegistry authenticationProviderRegistry;

	@Override
	protected final void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		doPost(request, response);
	}

	@Override
	protected final void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		AuthenticationProvider authenticationProvider = authenticationProviderRegistry.lookup("GitHub");

		String state = request.getParameter("state");

		HttpSession session = request.getSession();
		if (state != session.getId())
			session.invalidate();

		String authorizationCode = request.getParameter("code");

		AuthenticationUserToken authenticationUserToken;
		try {
			authenticationUserToken = authenticationProvider.checkAccessToken(application.getContext(), authorizationCode);
		} catch (AuthenticationException e) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
			return;
		}

		if (authenticationManager.checkLogin(authenticationUserToken, true)) {
			ContextUtils.removeContext(state);
			try {
				@SuppressWarnings("resource")
				ContextProvider context = authenticationManager.login(state, authenticationUserToken);
				ContextUtils.addContext(context.getContext());
			} catch (AuthenticationException e) {
				response.sendError(HttpServletResponse.SC_UNAUTHORIZED, e.getMessage());
				return;
			}

			String location = response.encodeURL("http://localhost:8001/index.html");

			response.sendRedirect(location);
		} else {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Error in provider response");
			return;
		}
	}
}