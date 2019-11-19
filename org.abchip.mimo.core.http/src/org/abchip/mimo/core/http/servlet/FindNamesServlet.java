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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.data.Strings;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;

public class FindNamesServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private ResourceManager resourceManager;

	protected void execute(ContextProvider contextProvider, HttpServletRequest request, HttpServletResponse response) throws IOException {
		_execute(contextProvider, request, response);
	}

	private <E extends EntityNameable> void _execute(ContextProvider contextProvider, HttpServletRequest request, HttpServletResponse response) throws IOException {

		String frameName = Strings.qINSTANCE.firstToUpper(request.getParameter("frame"));
		String filter = request.getParameter("filter");

		ResourceReader<E> entityReader = resourceManager.getResourceReader(contextProvider, frameName);
		if (entityReader == null) {
			response.setStatus(HttpServletResponse.SC_NO_CONTENT);
			response.getWriter().write("[]");

			return;
		}

		response.setStatus(HttpServletResponse.SC_FOUND);

		boolean first = true;
		response.getWriter().write("[");
		for (E entity : entityReader.find(filter, null, null, 0, true)) {
			if (!first)
				response.getWriter().write(", ");

			response.getWriter().write("\"" + Strings.qINSTANCE.escape(entity.getName()) + "\"");
			first = false;
		}
		response.getWriter().write("]");
	}
}