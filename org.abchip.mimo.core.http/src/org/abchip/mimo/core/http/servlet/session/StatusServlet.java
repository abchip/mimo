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
import org.abchip.mimo.context.AuthenticationManager;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextFactory;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.core.http.ContextUtils;
import org.abchip.mimo.core.http.HttpUtils;
import org.abchip.mimo.entity.SerializationType;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceSerializer;

public class StatusServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

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
		System.out.println(session.getId() + ": " + getServletName() + " " + HttpUtils.getParametersAsString(request));

		Context context = ContextUtils.getContext(session.getId());

		// invalid session
		if (context != null && !authenticationManager.isActive(context)) {
			context = null;
			// TODO reactivate context on provider
		}

		// new session with anonymous user
		if (context == null) {
			ContextUtils.removeContext(session.getId());

			AuthenticationAnonymous authentication = ContextFactory.eINSTANCE.createAuthenticationAnonymous();
			context = authenticationManager.login(session.getId(), authentication);

			ContextUtils.addContext(context);
		}

		if (context == null) {
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			return;
		}

		response.setStatus(HttpServletResponse.SC_ACCEPTED);

		ResourceSerializer<ContextDescription> serializer = resourceManager.createResourceSerializer(context, ContextDescription.class, SerializationType.JAVA_SCRIPT_OBJECT_NOTATION);
		serializer.add(context.getContextDescription());
		serializer.save(response.getOutputStream());

		response.flushBuffer();
	}
}