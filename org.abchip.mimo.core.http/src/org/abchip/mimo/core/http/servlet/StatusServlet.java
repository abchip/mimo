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

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.entity.EntityProvider;
import org.abchip.mimo.entity.EntityProviderRegistry;

public class StatusServlet extends HttpServlet {

	@Inject
	private ContextRoot contextRoot;

	private static final long serialVersionUID = 1L;

	@Override
	protected final void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	protected final void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContextProvider contextProvider = this.contextRoot.getChildContext(request.getParameter("contextId"));
		if (contextProvider != null) {

			// TODO check su ofbiz
			EntityProviderRegistry entityProviderRegistry = contextProvider.getContext().get(EntityProviderRegistry.class);
			EntityProvider entityProvider = entityProviderRegistry.lookup("*OFBIZ");

			if(entityProvider.status(contextProvider) == null) {
				response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			} else {
				response.setStatus(HttpServletResponse.SC_ACCEPTED);
				response.getWriter().write("{\"id\":\"" + contextProvider.getContext().getID() + "\",\"name\":\"Admin\"}");
			}
		} else
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);

		response.flushBuffer();
	}
}