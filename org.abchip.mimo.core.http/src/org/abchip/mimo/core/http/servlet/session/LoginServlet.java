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

import org.abchip.mimo.context.AuthenticationAdminKey;
import org.abchip.mimo.context.AuthenticationAnonymous;
import org.abchip.mimo.context.AuthenticationManager;
import org.abchip.mimo.context.AuthenticationUserPassword;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextFactory;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.core.http.ContextUtils;
import org.abchip.mimo.core.http.HttpUtils;
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
		System.out.println(session.getId() + ": " + getServletName() + " " + HttpUtils.getParametersAsString(request));

		String adminKeyParam = request.getParameter("adminKey");
		String provider = request.getParameter("provider");
		String userParam = request.getParameter("user");
		String password = request.getParameter("password");

		// Third part
		if (provider != null) {

			// anonymous access
			AuthenticationAnonymous authentication = ContextFactory.eINSTANCE.createAuthenticationAnonymous();
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
				ResourceSerializer<ContextDescription> serializer = resourceManager.createResourceSerializer(context.get(), ContextDescription.class, SerializationType.JAVA_SCRIPT_OBJECT_NOTATION);
				serializer.add(tempContextDescription);
				serializer.save(response.getOutputStream());

				response.flushBuffer();
			}

			return;
		}

		Context context = ContextUtils.getContext(session.getId());

		// close previous
		if (context != null) {
			context.dispose();
			context = null;
		}		
		ContextUtils.removeContext(session.getId());
		
		// adminKey
		if (adminKeyParam != null) {

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
			AuthenticationAdminKey authentication = ContextFactory.eINSTANCE.createAuthenticationAdminKey();
			authentication.setAdminKey(adminKey);
			authentication.setTenant(tenant);

			context = authenticationManager.login(session.getId(), authentication).get();
			ContextUtils.addContext(context);

		}
		// user password login
		else {

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
			AuthenticationUserPassword authentication = ContextFactory.eINSTANCE.createAuthenticationUserPassword();
			authentication.setUser(user);
			authentication.setPassword(password);
			authentication.setTenant(tenant);

			context = authenticationManager.login(session.getId(), authentication).get();
			ContextUtils.addContext(context);
		}

		if (context == null) {
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			return;
		}

		response.setStatus(HttpServletResponse.SC_OK);

		ResourceSerializer<ContextDescription> serializer = resourceManager.createResourceSerializer(context, ContextDescription.class, SerializationType.JAVA_SCRIPT_OBJECT_NOTATION);
		serializer.add(context.getContextDescription());
		serializer.save(response.getOutputStream());

		response.flushBuffer();
	}
}