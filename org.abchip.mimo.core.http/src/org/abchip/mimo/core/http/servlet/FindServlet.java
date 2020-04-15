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
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.SerializationType;

public class FindServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private ResourceManager resourceManager;

	protected void execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {
		_execute(context, request, response);
	}

	@SuppressWarnings("resource")
	private <E extends EntityIdentifiable> void _execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {

		String tenant = request.getParameter("tenant");
		String frameName = request.getParameter("frame");
		String proxy = request.getParameter("proxy");
		if (proxy == null || proxy.trim().isEmpty())
			proxy = "false";
		String limit = request.getParameter("limit");
		if (limit == null)
			limit = "0";
		String filter = request.getParameter("filter");
		String fields = request.getParameter("fields");
		String order = request.getParameter("order");

		String[] keys = request.getParameterValues("keys");

		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) resourceManager.getFrame(context, frameName, tenant);
		if (frame == null) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}

		if (keys != null) {
			StringBuffer sb = new StringBuffer();
			int i = 0;
			for (String slotKey : frame.getKeys()) {
				if (keys.length == i)
					break;

				Slot slot = frame.getSlot(slotKey);
				switch (slot.getDataType()) {
				case STRING:
				case DATE_TIME:
				case ENUM:
					sb.append(slotKey + " = \"" + keys[i] + "\"");
					break;
				case IDENTITY:
				case NUMERIC:
				case BOOLEAN:
					sb.append(slotKey + " = " + keys[i] + "");
					break;
				case BINARY:
				case ENTITY:
					break;
				}

				i++;
			}

			if (filter != null)
				filter = sb.toString() + " and " + filter;
			else
				filter = sb.toString();
		}

		try {
			ResourceReader<E> entityReader = resourceManager.getResourceReader(context, frame, tenant);
			ResourceSerializer<E> entitySerializer = resourceManager.createResourceSerializer(context, frame, SerializationType.MIMO);
			try (EntityIterator<E> entities = entityReader.find(filter, fields, order, Integer.parseInt(limit), Boolean.parseBoolean(proxy))) {
				for (E entity : entities)
					entitySerializer.add(entity);
			}
			entitySerializer.save(response.getOutputStream());
			entitySerializer.clear();
			
			response.setStatus(HttpServletResponse.SC_FOUND);
		} catch (ResourceException e) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
			return;
		}
	}
}