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
import org.abchip.mimo.authentication.AuthenticationAdminKey;
import org.abchip.mimo.authentication.AuthenticationException;
import org.abchip.mimo.authentication.AuthenticationFactory;
import org.abchip.mimo.authentication.AuthenticationManager;
import org.abchip.mimo.authentication.AuthenticationProvider;
import org.abchip.mimo.authentication.AuthenticationProviderRegistry;
import org.abchip.mimo.authentication.AuthenticationUserPassword;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextFactory;
import org.abchip.mimo.core.http.ContextUtils;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.SerializationType;
import org.abchip.mimo.util.Logs;
import org.osgi.service.log.Logger;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private Application application;
	@Inject
	private AuthenticationManager authenticationManager;
	@Inject
	AuthenticationProviderRegistry authenticationProviderRegistry;

	private static final Logger LOGGER = Logs.getLogger(LoginServlet.class);

	@Override
	protected final void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		doPost(request, response);
	}

	@SuppressWarnings("resource")
	@Override
	protected final void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		HttpSession session = request.getSession();

		LOGGER.trace("Login from session {}", session.getId());

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
				response.sendError(HttpServletResponse.SC_UNAUTHORIZED, e.getMessage());
			} catch (ResourceException e) {
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
			}
			return;
		}

		// adminKey
		String adminKey = request.getParameter("adminKey");
		if (adminKey != null) {
			try {
				context = loginAdminKey(session, adminKey);
			} catch (AuthenticationException e) {
				response.sendError(HttpServletResponse.SC_UNAUTHORIZED, e.getMessage());
				return;
			}
		} else {
			// user password login
			String user = request.getParameter("user");
			if (user != null) {
				String password = request.getParameter("password");
				try {
					context = loginUserPassword(session, user, password);
				} catch (AuthenticationException e) {
					response.sendError(HttpServletResponse.SC_UNAUTHORIZED, e.getMessage());
					return;
				}
			}
		}

		// register context
		ContextUtils.addContext(context);

		response.setStatus(HttpServletResponse.SC_OK);

		ResourceSerializer<ContextDescription> serializer = context.getResourceManager().createResourceSerializer(ContextDescription.class, SerializationType.MIMO);
		serializer.add(context.getContextDescription());
		serializer.save(response.getOutputStream());
		serializer.clear();

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
		Context context = authenticationManager.login(session.getId(), authentication).getContext();

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
		Context context = authenticationManager.login(session.getId(), authentication).getContext();

		return context;
	}

	@SuppressWarnings("resource")
	private void loginRedirect(HttpServletRequest request, HttpServletResponse response, String provider) throws IOException, AuthenticationException, ResourceException {

		HttpSession session = request.getSession();
		Context context = application.getContext();

		if (provider.equals("Google") || provider.equals("GitHub")) {
			AuthenticationProvider authenticationProvider = authenticationProviderRegistry.lookup(provider);
			String redirectLocation = authenticationProvider.getRedirectLocation(context, session.getId());
//			redirectLocation = response.encodeURL(redirectLocation);
			response.setHeader("Location", redirectLocation);
			response.setStatus(HttpServletResponse.SC_OK);

			ContextDescription tempContextDescription = ContextFactory.eINSTANCE.createContextDescription();
			tempContextDescription.setId(session.getId());
			tempContextDescription.setAnonymous(true);
			ResourceSerializer<ContextDescription> serializer = context.getResourceManager().createResourceSerializer(ContextDescription.class, SerializationType.MIMO);
			serializer.add(tempContextDescription);
			serializer.save(response.getOutputStream());

			response.flushBuffer();
			return;
		}

		String entityName = "OAuth2" + provider;

		ResourceReader<?> oauth2Reader = context.getResourceManager().getResourceReader(entityName);
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
		ResourceSerializer<ContextDescription> serializer = context.getResourceManager().createResourceSerializer(ContextDescription.class, SerializationType.MIMO);
		serializer.add(tempContextDescription);
		serializer.save(response.getOutputStream());

		response.flushBuffer();
	}
}