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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.abchip.mimo.authentication.AuthenticationAdminKey;
import org.abchip.mimo.authentication.AuthenticationAnonymous;
import org.abchip.mimo.authentication.AuthenticationException;
import org.abchip.mimo.authentication.AuthenticationFactory;
import org.abchip.mimo.authentication.AuthenticationManager;
import org.abchip.mimo.authentication.AuthenticationUserPassword;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextFactory;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.core.http.ContextUtils;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.SerializationType;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private ResourceManager resourceManager;

	@Inject
	private AuthenticationManager authenticationManager;

	@Override
	protected final void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@SuppressWarnings("resource")
	@Override
	protected final void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();

		Context context = ContextUtils.getContext(session.getId());

		// close previous
		if (context != null) {
			ContextUtils.removeContext(context.getContextDescription().getId());

			context.dispose();
			context = null;
		}

		// third part -> redirect
		String provider = request.getParameter("provider");
		if (provider != null) {
			try {
				loginRedirect(request, response, provider);
			} catch (AuthenticationException e) {
				response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				throw new ServletException(e);
			}
			return;
		}

		// adminKey
		String adminKey = request.getParameter("adminKey");
		if (adminKey != null) {
			try {
				context = loginAdminKey(session, adminKey);
			} catch (AuthenticationException e) {
				response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				throw new ServletException(e);
			}
		}

		// user password login
		String user = request.getParameter("user");
		if (user != null) {
			String password = request.getParameter("password");
			try {
				context = loginUserPassword(session, user, password);
			} catch (AuthenticationException e) {
				response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				throw new ServletException(e);
			}
		}

		if (context == null) {
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			return;
		}

		// register context
		ContextUtils.addContext(context);

		ResourceSerializer<ContextDescription> serializer = resourceManager.createResourceSerializer(context, ContextDescription.class, SerializationType.MIMO);
		serializer.add(context.getContextDescription());
		serializer.save(response.getOutputStream());
		serializer.clear();

		response.setStatus(HttpServletResponse.SC_OK);
		response.flushBuffer();
	}

	private Context loginUserPassword(HttpSession session, String userParam, String password) throws AuthenticationException {

		String[] fields = userParam.split("/");

		String tenant = null;
		String user = null;

		if (fields.length > 1) {
			tenant = fields[0];
			if (tenant.trim().isEmpty())
				tenant = null;
			user = fields[1];
		} else
			user = fields[0];

		// new session with user password
		AuthenticationUserPassword authentication = AuthenticationFactory.eINSTANCE.createAuthenticationUserPassword();
		authentication.setUser(user);
		authentication.setPassword(password);
		authentication.setTenant(tenant);

		@SuppressWarnings("resource")
		Context context = authenticationManager.login(session.getId(), authentication).get();

		return context;
	}

	private Context loginAdminKey(HttpSession session, String adminKeyParam) throws AuthenticationException {

		String[] fields = adminKeyParam.split("/");

		String tenant = null;
		String adminKey = null;

		if (fields.length > 1) {
			tenant = fields[0];
			if (tenant.trim().isEmpty())
				tenant = null;
			adminKey = fields[1];
		} else
			adminKey = fields[0];

		// new session with user password
		AuthenticationAdminKey authentication = AuthenticationFactory.eINSTANCE.createAuthenticationAdminKey();
		authentication.setAdminKey(adminKey);
		authentication.setTenant(tenant);

		@SuppressWarnings("resource")
		Context context = authenticationManager.login(session.getId(), authentication).get();

		return context;
	}

	@SuppressWarnings("resource")
	private void loginRedirect(HttpServletRequest request, HttpServletResponse response, String provider) throws IOException, AuthenticationException {

		HttpSession session = request.getSession();

		// TODO remove anonymous access
		AuthenticationAnonymous authentication = AuthenticationFactory.eINSTANCE.createAuthenticationAnonymous();
		try (ContextProvider context = authenticationManager.login(session.getId(), authentication)) {

			String entityName = "OAuth2" + provider;

			ResourceReader<?> oauth2Reader = resourceManager.getResourceReader(context.get(), entityName);
			EntityIdentifiable oauth2Entity = oauth2Reader.first();

			if (oauth2Entity == null) {
				response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				return;
			}
			String location = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
					+ oauth2Entity.isa().getValue(oauth2Entity, "localRedirectUri", false, false).toString();

			location = response.encodeURL(location);
			// System.err.println(("Login location: " + location));

			response.setHeader("Location", location);
			response.setStatus(HttpServletResponse.SC_OK);

			ContextDescription tempContextDescription = ContextFactory.eINSTANCE.createContextDescription();
			tempContextDescription.setId(session.getId());
			tempContextDescription.setAnonymous(true);
			ResourceSerializer<ContextDescription> serializer = resourceManager.createResourceSerializer(context.get(), ContextDescription.class, SerializationType.MIMO);
			serializer.add(tempContextDescription);
			serializer.save(response.getOutputStream());

			response.flushBuffer();
		}
	}
}