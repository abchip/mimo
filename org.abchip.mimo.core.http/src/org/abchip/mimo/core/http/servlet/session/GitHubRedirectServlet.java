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

import javax.inject.Inject;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.biz.model.passport.OAuth2GitHub;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceReader;

public class GitHubRedirectServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public static final String TokenEndpoint = "https://github.com";
	public static final String AuthorizeUri = "/login/oauth/authorize";
	public static final String DEFAULT_SCOPE = "user,gist,user:email";

	@Inject
	private Application application;

	@Override
	protected final void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		doPost(request, response);
	}

	@Override
	protected final void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		HttpSession session = request.getSession();

		try {
			ResourceReader<OAuth2GitHub> oauth2Reader = application.getContext().getResourceManager().getResourceReader(OAuth2GitHub.class);
			OAuth2GitHub oauth2GitHub = oauth2Reader.first();

			if (oauth2GitHub == null) {
				response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				return;
			}
			// Get user authorization code
			String location = TokenEndpoint + AuthorizeUri + "?client_id=" + oauth2GitHub.getClientId() + "&response_type=code" + "&scope=" + DEFAULT_SCOPE + "&redirect_uri="
					+ URLEncoder.encode(oauth2GitHub.getReturnUrl(), "UTF8") + "&state=" + session.getId();

			response.sendRedirect(location);
		} catch (ResourceException e) {
			throw new IOException(e);
		}
	}
}