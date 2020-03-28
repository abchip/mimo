/**
 *  Copyright (c) 2017, 2020 ABChip and others.
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

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.util.Strings;

public class FindNamesServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private ResourceManager resourceManager;

	protected void execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {
		_execute(context, request, response);
	}

	@SuppressWarnings("resource")
	private <E extends EntityIdentifiable> void _execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {

		String frameName = Strings.qINSTANCE.firstToUpper(request.getParameter("frame"));
		String filter = request.getParameter("filter");

		ResourceReader<E> entityReader = resourceManager.getResourceReader(context, frameName);
		if (entityReader == null) {
			response.setStatus(HttpServletResponse.SC_NO_CONTENT);
			response.getWriter().write("[]");

			return;
		}

		response.setStatus(HttpServletResponse.SC_FOUND);

		boolean first = true;
		response.getWriter().write("[");
		try (EntityIterator<E> entities = entityReader.find(filter, null, null, 0, true)) {
			for (E entity : entities) {
				if (!first)
					response.getWriter().write(", ");

				response.getWriter().write("\"" + Strings.qINSTANCE.escape(entity.getID()) + "\"");
				first = false;
			}
		}
		response.getWriter().write("]");
	}
}