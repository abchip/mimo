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
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextFactory;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.core.http.ContextUtils;
import org.abchip.mimo.core.http.HttpUtils;
import org.abchip.mimo.entity.SerializationType;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceProvider;
import org.abchip.mimo.resource.ResourceSerializer;

public class StatusServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private ResourceManager resourceManager;

	private ResourceProvider resourceProvider = null;

	protected ResourceProvider getDefaultProvider() {
		if (this.resourceProvider == null) {
			synchronized (this) {
				if (this.resourceProvider == null) {
					this.resourceProvider = resourceManager.getProvider("UserLogin");
				}
			}
		}

		return this.resourceProvider;
	}

	@Override
	protected final void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	protected final void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		System.out.println(session.getId() + ": " + getServletName() + " " + HttpUtils.getParametersAsString(request));

		ContextProvider contextProvider = ContextUtils.getContextProvider(session.getId());

		// invalid session
		if (contextProvider != null && !this.getDefaultProvider().isActive(contextProvider)) {
			contextProvider = null;
			// TODO reactivate context on provider
		}

		// new session with anonymous user
		if (contextProvider == null) {
			ContextUtils.removeContextProvider(session.getId());

			AuthenticationAnonymous authentication = ContextFactory.eINSTANCE.createAuthenticationAnonymous();
			contextProvider = getDefaultProvider().login(session.getId(), authentication);

			ContextUtils.addContextProvider(contextProvider);
		}

		if (contextProvider == null) {
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			return;
		}

		response.setStatus(HttpServletResponse.SC_ACCEPTED);

		ResourceSerializer<ContextDescription> serializer = resourceManager.createEntitySerializer(ContextDescription.class, SerializationType.JAVA_SCRIPT_OBJECT_NOTATION);
		serializer.add(contextProvider.getContext().getContextDescription());
		serializer.save(response.getOutputStream());

		response.flushBuffer();
	}
}