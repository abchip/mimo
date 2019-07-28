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

import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.core.http.ServletUtils;
import org.abchip.mimo.entity.EntityProvider;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceSerializer;
import org.abchip.mimo.entity.SerializationType;

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

		System.out.println(this.getServletName());

		HttpSession session = request.getSession();
		System.out.println(session.getId());

		String provider = request.getParameter("provider");
		String userField = request.getParameter("user");
		String password = request.getParameter("password");

		// Third part
		if (provider != null) {
			response.sendRedirect(this.getDefaultProvider().getProviderUrl() + "/entityLoginThirdParty?provider=" + provider);
			return;
		}

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

		ContextProvider contextProvider = ServletUtils.getContextProvider(session.getId());

		// invalid session
		if (contextProvider != null && !this.getDefaultProvider().isActive(contextProvider)) {
			contextProvider = null;
		}

		// new session with user password
		if (contextProvider == null) {
			ServletUtils.removeContextProvider(session.getId());

			contextProvider = this.getDefaultProvider().login(session.getId(), user, password, tenant);
			ServletUtils.addContextProvider(contextProvider);
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