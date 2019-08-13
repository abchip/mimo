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

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.abchip.mimo.context.AuthenticationAnonymous;
import org.abchip.mimo.context.AuthenticationUserPassword;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextFactory;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.core.http.ContextUtils;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntityProvider;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceScope;
import org.abchip.mimo.entity.ResourceSerializer;
import org.abchip.mimo.entity.SerializationType;
import org.eclipse.jetty.http.HttpHeader;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

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

		String provider = request.getParameter("provider");
		String userField = request.getParameter("user");
		String password = request.getParameter("password");

		if (request.getCookies() != null) {
			for (Cookie cookie : request.getCookies()) {
				System.out.println(cookie.getName());
			}
		}

		// Third part
		if (provider != null) {

			// anonymous access
			AuthenticationAnonymous authentication = ContextFactory.eINSTANCE.createAuthenticationAnonymous();
			ContextProvider contextProvider = getDefaultProvider().login(null, authentication);

			String entityName = "OAuth2" + provider;

			EntityReader<?> oauth2Reader = resourceManager.getEntityReader(contextProvider, entityName, ResourceScope.CONTEXT);

			EntityNameable oauth2Entity = oauth2Reader.find(null).next();

			getDefaultProvider().logout(contextProvider);
			contextProvider.getContext().close();

			if (oauth2Entity != null) {
				String location = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
						+ oauth2Entity.isa().getValue(oauth2Entity, "localRedirectUri").toString();

				location = response.encodeURL(location);
				// System.err.println(("Login location: " + location));

				response.setHeader(HttpHeader.LOCATION.name(), location);
				response.setStatus(HttpServletResponse.SC_OK);

				try (ResourceSerializer<ContextDescription> serializer = resourceManager.createResourceSerializer(contextProvider, ContextDescription.class,
						SerializationType.JAVA_SCRIPT_OBJECT_NOTATION)) {
					ContextDescription tempContextDescription = ContextFactory.eINSTANCE.createContextDescription();
					tempContextDescription.setId(session.getId());
					tempContextDescription.setAnonymous(true);
					serializer.add(tempContextDescription);
					serializer.save(response.getOutputStream());
				}
			} else {
				response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			}

			response.flushBuffer();
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

		// close previous
		if (contextProvider != null) {
			ContextUtils.removeContextProvider(session.getId());
			this.getDefaultProvider().logout(contextProvider);
			contextProvider.getContext().close();
			contextProvider = null;
		}

		// new session with user password
		if (contextProvider == null) {
			ContextUtils.removeContextProvider(session.getId());

			AuthenticationUserPassword authentication = ContextFactory.eINSTANCE.createAuthenticationUserPassword();
			authentication.setUser(user);
			authentication.setPassword(password);
			authentication.setTenant(tenant);

			contextProvider = this.getDefaultProvider().login(session.getId(), authentication);
			ContextUtils.addContextProvider(contextProvider);
		}

		if (contextProvider == null) {
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			return;
		}

		response.setStatus(HttpServletResponse.SC_OK);

		try (ResourceSerializer<ContextDescription> serializer = resourceManager.createResourceSerializer(contextProvider, ContextDescription.class,
				SerializationType.JAVA_SCRIPT_OBJECT_NOTATION)) {
			serializer.add(contextProvider.getContext().getContextDescription());
			serializer.save(response.getOutputStream());
		}

		response.flushBuffer();
	}
}