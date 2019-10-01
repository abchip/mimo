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
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntitySerializer;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.SerializationType;

public class SaveServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private ResourceManager resourceManager;

	protected void execute(ContextProvider contextProvider, HttpServletRequest request, HttpServletResponse response) throws IOException {
		_execute(contextProvider, request, response);
	}

	private <E extends EntityNameable> void _execute(ContextProvider contextProvider, HttpServletRequest request, HttpServletResponse response) throws IOException {

		String frame = request.getParameter("frame");
		String json = request.getParameter("json");

		EntitySerializer<E> entitySerializer = resourceManager.createEntitySerializer(contextProvider, frame, SerializationType.JAVA_SCRIPT_OBJECT_NOTATION);

		if (!json.contains("\"eClass\""))
			json = json.replaceFirst("\\{", "{\"eClass\":\"" + entitySerializer.getFrame().getURI() + "\",");

		entitySerializer.load(json, false);
		E entity = entitySerializer.get();

		EntityWriter<EntityNameable> entityWriter = resourceManager.getEntityWriter(contextProvider, frame);
		entityWriter.create(entity, true);

		response.setStatus(HttpServletResponse.SC_OK);
	}
}