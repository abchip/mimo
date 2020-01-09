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

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.SerializationType;
import org.abchip.mimo.util.Strings;

public class LookupServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private ResourceManager resourceManager;

	protected void execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {
		_execute(context, request, response);
	}

	private <E extends EntityIdentifiable> void _execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {

		String tenant = request.getParameter("tenant");
		String frame = Strings.qINSTANCE.firstToUpper(request.getParameter("frame"));
		String id = request.getParameter("id");
		String proxy = request.getParameter("proxy");
		if (proxy == null || proxy.trim().isEmpty())
			proxy = "false";

		ResourceReader<E> entityReader = resourceManager.getResourceReader(context, frame, tenant);
		E entity = entityReader.lookup(id, Boolean.parseBoolean(proxy));
		if (entity == null)
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
		else {
			response.setStatus(HttpServletResponse.SC_FOUND);

			ResourceSerializer<E> entitySerializer = resourceManager.createResourceSerializer(context, frame, SerializationType.JAVA_SCRIPT_MIMO_NOTATION);
			entitySerializer.add(entity);
			entitySerializer.save(response.getOutputStream());
		}
	}
}