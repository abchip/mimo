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
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.resource.SerializationType;

public class SaveServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private ResourceManager resourceManager;

	protected void execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {
		_execute(context, request, response);
	}

	private <E extends EntityIdentifiable> void _execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {

		String tenant = request.getParameter("tenant");
		String frame = request.getParameter("frame");

		E entity = null;
		ResourceSerializer<E> entitySerializer = resourceManager.createResourceSerializer(context, frame, SerializationType.MIMO);

		String json = request.getParameter("json");
		if (!json.contains("\"eClass\""))
			json = json.replaceFirst("\\{", "{\"eClass\":\"" + entitySerializer.getFrame().getURI() + "\",");

		entitySerializer.load(json, false);
		entity = entitySerializer.get();

		String replace = request.getParameter("replace");
		if (replace == null || replace.trim().isEmpty())
			replace = "false";

		ResourceWriter<E> entityWriter = resourceManager.getResourceWriter(context, frame, tenant);
		entityWriter.create(entity, Boolean.parseBoolean(replace));

		response.setStatus(HttpServletResponse.SC_OK);
	}
}