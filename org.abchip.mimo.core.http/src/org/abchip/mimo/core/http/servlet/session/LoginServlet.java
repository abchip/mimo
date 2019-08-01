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

import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.core.http.ContextUtils;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntityProvider;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceScope;
import org.abchip.mimo.entity.ResourceSerializer;
import org.abchip.mimo.entity.SerializationType;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public static final String AUTHORIZE_URI = "https://accounts.google.com/o/oauth2/auth";
	public static final String DEFAULT_SCOPE = "openid%20email%20profile";
	// public static final String SESSION_GOOGLE_STATE = "_GOOGLE_STATE_";

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

	@SuppressWarnings("unchecked")
	@Override
	protected final void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();

		String provider = request.getParameter("provider");
		String userField = request.getParameter("user");
		String password = request.getParameter("password");

		// Third part
		if (provider != null) {

			// anonymous access
			ContextProvider contextProvider = getDefaultProvider().login(null, null);

			String entityName = "OAuth2" + provider;

			EntityReader<?> oauth2Reader = resourceManager.getEntityReader(contextProvider, entityName, ResourceScope.CTX);

			// String url = request.getScheme() + "://" + request.getServerName() + ":" +
			// request.getServerPort();
			EntityNameable oauth2Google = oauth2Reader.find(null).next();

			if (oauth2Google != null) {

				String clientId = ((Frame<EntityNameable>) oauth2Google.isa()).getValue(oauth2Google, "clientId").toString();
				String returnURI = ((Frame<EntityNameable>) oauth2Google.isa()).getValue(oauth2Google, "returnUrl").toString();

				// Get user authorization code
				try {
					String redirectUrl = AUTHORIZE_URI + "?client_id=" + clientId + "&response_type=code" + "&scope=" + DEFAULT_SCOPE + "&redirect_uri="
							+ URLEncoder.encode(returnURI, "UTF-8");

					response.getWriter().write(redirectUrl);

					// response.sendRedirect(redirectUrl);
				} catch (Exception e) {
					e.printStackTrace();
				}

			} else {
				response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				response.flushBuffer();
			}

			getDefaultProvider().logout(contextProvider);
			contextProvider.getContext().close();

			return;
		}

		ContextProvider contextProvider = ContextUtils.getContextProvider(session.getId());

		// user password login
		String[] fields = userField.split("/");

		String tenant = null;
		String user = null;

		if (fields.length > 1) {
			tenant = fields[0];
			if (tenant.trim().isEmpty())
				tenant = null;
			user = fields[1];
		} else
			user = fields[0];

		// invalid session
		if (contextProvider != null && !this.getDefaultProvider().isActive(contextProvider)) {
			contextProvider = null;
		}

		// new session with user password
		if (contextProvider == null) {
			ContextUtils.removeContextProvider(session.getId());

			contextProvider = this.getDefaultProvider().login(session.getId(), user, password, tenant);
			ContextUtils.addContextProvider(contextProvider);
		}

		if (contextProvider == null) {
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			return;
		}

		response.setStatus(HttpServletResponse.SC_ACCEPTED);

		ResourceSerializer<ContextDescription> serializer = resourceManager.getResourceSerializer(contextProvider, ContextDescription.class, SerializationType.JSON);
		serializer.add(contextProvider.getContext().getContextDescription());
		serializer.save(response.getOutputStream());
		serializer.close();

		response.flushBuffer();
	}
}