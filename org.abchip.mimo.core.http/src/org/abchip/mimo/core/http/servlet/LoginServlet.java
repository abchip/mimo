/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.core.http.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		String user = request.getParameter("user");
		String password = request.getParameter("pass");
		String tenant = request.getParameter("tenant");

		EntityProviderRegistry entityProviderRegistry = contextRoot.get(EntityProviderRegistry.class);
		EntityProvider entityProvider = entityProviderRegistry.lookup("*OFBIZ");

		ContextProvider contextProvider = entityProvider.login(user, password, tenant);

		response.getWriter().write("{\"id\":\"" + contextProvider.getContext().getID() + "\",\"name\":\"Admin\"}");

		response.flushBuffer();
	}
}