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
import org.abchip.mimo.entity.SerializationType;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.resource.ResourceManager;

public class SaveServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private ResourceManager resourceManager;

	protected void execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {
		_execute(context, request, response);
	}

	private <E extends EntityIdentifiable> void _execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {

		String frame = request.getParameter("frame");
		String json = request.getParameter("json");

		ResourceSerializer<E> entitySerializer = resourceManager.createResourceSerializer(context, frame, SerializationType.JAVA_SCRIPT_OBJECT_NOTATION);

		if (!json.contains("\"eClass\""))
			json = json.replaceFirst("\\{", "{\"eClass\":\"" + entitySerializer.getFrame().getURI() + "\",");

		entitySerializer.load(json, false);
		E entity = entitySerializer.get();

		ResourceWriter<E> entityWriter = resourceManager.getResourceWriter(context, frame);
		entityWriter.create(entity, true);

		response.setStatus(HttpServletResponse.SC_OK);
	}
}