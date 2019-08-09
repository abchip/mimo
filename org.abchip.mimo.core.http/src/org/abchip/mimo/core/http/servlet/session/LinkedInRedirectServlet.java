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
import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.abchip.mimo.context.AuthenticationAnonymous;
import org.abchip.mimo.context.ContextFactory;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntityProvider;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceScope;

public class LinkedInRedirectServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

    public static final String DEFAULT_SCOPE = "r_liteprofile%20r_emailaddress";
    public static final String TokenEndpoint = "https://www.linkedin.com";
    public static final String AuthorizeUri = "/oauth/v2/authorization";
	
	@Inject
	private ResourceManager resourceManager;

	private EntityProvider entityProvider = null;

	protected EntityProvider getDefaultProvider() {
		if (this.entityProvider == null) {
			synchronized (this) {
				if (this.entityProvider == null) {
					this.entityProvider = resourceManager.getProvider("UserLogin");
				}
			}
		}

		return this.entityProvider;
	}

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
		ContextProvider contextProvider = getDefaultProvider().login(null, authentication);

		EntityReader<?> oauth2Reader = resourceManager.getEntityReader(contextProvider, "OAuth2LinkedIn", ResourceScope.CONTEXT);
		EntityNameable oauth2LinkedIn = oauth2Reader.find(null).next();

		getDefaultProvider().logout(contextProvider);
		contextProvider.getContext().close();

		if (oauth2LinkedIn == null) {
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			return;
		}

		String clientId = oauth2LinkedIn.isa().getValue(oauth2LinkedIn, "apiKey").toString();
		String returnURI = oauth2LinkedIn.isa().getValue(oauth2LinkedIn, "liveReturnUrl").toString();
		// Get user authorization code
		try {
			String location = TokenEndpoint + AuthorizeUri + "?client_id=" + clientId 
											+ "&response_type=code" 
											+ "&scope=" + DEFAULT_SCOPE 
											+ "&nonce=" + UUID.randomUUID() 
											+ "&redirect_uri="+ URLEncoder.encode(returnURI, "UTF8")
											+ "&state=" + session.getId();
//											+ "&state=" + URLEncoder.encode(";jsessionId=" + session.getId(), "UTF8");

//			location = response.encodeURL(location);
//			System.err.println(("Redirect location: " + location));

			response.sendRedirect(location);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}