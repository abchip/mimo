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
import org.abchip.mimo.entity.Frame;
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

	@SuppressWarnings("unchecked")
	@Override
	protected final void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		System.out.println(getServletName() + ": " + session.getId());
		
		String provider = request.getParameter("provider");
		String userField = request.getParameter("user");
		String password = request.getParameter("password");

		// Third part
		if (provider != null) {

			// anonymous access
			AuthenticationAnonymous authentication = ContextFactory.eINSTANCE.createAuthenticationAnonymous();
			ContextProvider contextProvider = getDefaultProvider().login(null, authentication);

			String entityName = "OAuth2" + provider;

			EntityReader<?> oauth2Reader = resourceManager.getEntityReader(contextProvider, entityName, ResourceScope.CTX);

			EntityNameable oauth2Entity = oauth2Reader.find(null).next();

			getDefaultProvider().logout(contextProvider);
			contextProvider.getContext().close();

			if (oauth2Entity != null) {
				String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();

				String location = ((Frame<EntityNameable>) oauth2Entity.isa()).getValue(oauth2Entity, "localRedirectUri").toString();
				response.setHeader(HttpHeader.LOCATION.name(), url + location);
				response.setStatus(HttpServletResponse.SC_ACCEPTED);
			} else {
				response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				response.flushBuffer();
			}
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

		response.setStatus(HttpServletResponse.SC_ACCEPTED);

		try (ResourceSerializer<ContextDescription> serializer = resourceManager.getResourceSerializer(contextProvider, ContextDescription.class, SerializationType.JSON)) {
			serializer.add(contextProvider.getContext().getContextDescription());
			serializer.save(response.getOutputStream());
		}

		response.flushBuffer();
	}
}