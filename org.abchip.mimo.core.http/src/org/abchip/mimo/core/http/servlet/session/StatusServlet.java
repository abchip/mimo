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

import org.abchip.mimo.authentication.AuthenticationAnonymous;
import org.abchip.mimo.authentication.AuthenticationException;
import org.abchip.mimo.authentication.AuthenticationFactory;
import org.abchip.mimo.authentication.AuthenticationManager;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.core.http.ContextUtils;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.SerializationType;

public class StatusServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private ResourceManager resourceManager;
	@Inject
	private AuthenticationManager authenticationManager;

	@Override
	protected final void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		doPost(request, response);
	}

	@SuppressWarnings("resource")
	@Override
	protected final void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		HttpSession session = request.getSession();

		Context context = ContextUtils.getContext(session.getId());

		// new session with anonymous user
		if (context == null) {

			AuthenticationAnonymous authentication = AuthenticationFactory.eINSTANCE.createAuthenticationAnonymous();
			try {
				context = authenticationManager.login(session.getId(), authentication).get();
			} catch (AuthenticationException e) {
				response.sendError(HttpServletResponse.SC_UNAUTHORIZED, e.getMessage());
				return;
			}

			ContextUtils.addContext(context);
		}

		response.setStatus(HttpServletResponse.SC_OK);

		ResourceSerializer<ContextDescription> serializer = resourceManager.createResourceSerializer(context, ContextDescription.class, SerializationType.MIMO);
		serializer.add(context.getContextDescription());
		serializer.save(response.getOutputStream());

		response.flushBuffer();
	}
}