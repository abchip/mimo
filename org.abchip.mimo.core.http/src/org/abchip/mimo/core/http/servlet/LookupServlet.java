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
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.SerializationType;

public class LookupServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	protected void execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {
		_execute(context, request, response);
	}

	@SuppressWarnings("resource")
	private <E extends EntityIdentifiable> void _execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {

		String tenant = request.getParameter("tenant");
		String frame = request.getParameter("frame");
		String id = request.getParameter("id");
		String proxy = request.getParameter("proxy");
		if (proxy == null || proxy.trim().isEmpty())
			proxy = "false";

		try {
			ResourceReader<E> entityReader = context.getResourceManager().getResourceReader(frame, tenant);
			E entity = entityReader.lookup(id, Boolean.parseBoolean(proxy));
			if (entity == null)
				response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			else {
				response.setStatus(HttpServletResponse.SC_OK);

				ResourceSerializer<E> entitySerializer = context.getResourceManager().createResourceSerializer(frame, SerializationType.MIMO);
				entitySerializer.add(entity);
				entitySerializer.save(response.getOutputStream());
			}
		} catch (ResourceException e) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
			return;
		}
	}
}