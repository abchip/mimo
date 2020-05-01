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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.util.Strings;

public class FindNamesServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	protected void execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {
		_execute(context, request, response);
	}

	@SuppressWarnings("resource")
	private <E extends EntityIdentifiable> void _execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {

		String frameName = Strings.firstToUpper(request.getParameter("frame"));
		String filter = request.getParameter("filter");

		try {
			ResourceReader<E> entityReader = context.getResourceManager().getResourceReader(frameName);

			boolean first = true;
			try (EntityIterator<E> entities = entityReader.find(filter, null, null, 0, true)) {
				response.setStatus(HttpServletResponse.SC_FOUND);
				response.getWriter().write("[");
				for (E entity : entities) {
					if (!first)
						response.getWriter().write(", ");

					response.getWriter().write("\"" + Strings.escapeJava(entity.getID()) + "\"");
					first = false;
				}
				response.getWriter().write("]");
			}
		} catch (ResourceException e) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
			return;
		}
	}
}