/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.http.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.entity.EntityProvider;
import org.abchip.mimo.entity.EntityProviderRegistry;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private ContextRoot contextRoot;

	@Override
	protected final void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	protected final void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userField = request.getParameter("user");
		String[] fields = userField.split("/");

		String tenant = null;
		String user = null;
		if (fields.length > 1) {
			tenant = fields[0];
			user = fields[1];
		} else
			user = fields[0];

		String password = request.getParameter("password");

		EntityProviderRegistry entityProviderRegistry = contextRoot.get(EntityProviderRegistry.class);
		EntityProvider entityProvider = entityProviderRegistry.lookup("*OFBIZ");

		ContextProvider contextProvider = null;

		if (user == null || user.trim().isEmpty())
			contextProvider = entityProvider.login(tenant);
		else
			contextProvider = entityProvider.login(user, password, tenant);

		if (contextProvider == null)
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		else {
			response.setStatus(HttpServletResponse.SC_ACCEPTED);
			HttpSession session = request.getSession();
			response.getWriter().write("{\"id\":\"" + session.getId() + "\",\"user\":\"" + user + "\"}");
		}

		response.flushBuffer();
	}
}