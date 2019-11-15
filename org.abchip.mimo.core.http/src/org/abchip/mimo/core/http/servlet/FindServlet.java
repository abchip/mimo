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
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.entity.SerializationType;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.util.Strings;

public class FindServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private FrameManager frameManger;
	@Inject
	private ResourceManager resourceManager;

	protected void execute(ContextProvider contextProvider, HttpServletRequest request, HttpServletResponse response) throws IOException {
		_execute(contextProvider, request, response);
	}

	private <E extends EntityNameable> void _execute(ContextProvider contextProvider, HttpServletRequest request, HttpServletResponse response) throws IOException {

		String frameName = Strings.qINSTANCE.firstToUpper(request.getParameter("frame"));
		String filter = request.getParameter("filter");
		String fields = request.getParameter("fields");
		String order = request.getParameter("order");
		String limit = request.getParameter("limit");
		if (limit == null)
			limit = "0";
		String proxy = request.getParameter("proxy");
		if (proxy == null || proxy.trim().isEmpty())
			proxy = "false";

		String[] keys = request.getParameterValues("keys");

		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) frameManger.getFrameReader(contextProvider).lookup(frameName);
		if (frame == null)
			return;

		if (keys != null) {
			StringBuffer sb = new StringBuffer();
			int i = 0;
			for (String slotKey : frame.getKeys()) {
				if (keys.length == i)
					break;

				Slot slot = frame.getSlot(slotKey);
				if (slot.isString())
					sb.append(slotKey + " = \"" + keys[i] + "\"");
				else
					sb.append(slotKey + " = " + keys[i] + "");
				i++;
			}

			if (filter != null)
				filter = sb.toString() + " and " + filter;
			else
				filter = sb.toString();
		}

		response.setStatus(HttpServletResponse.SC_FOUND);

		ResourceReader<E> entityReader = resourceManager.getResourceReader(contextProvider, frame);
		ResourceSerializer<E> entitySerializer = resourceManager.createResourceSerializer(frame, SerializationType.JAVA_SCRIPT_OBJECT_NOTATION);
		for (E entity : entityReader.find(filter, fields, order, Integer.parseInt(limit), Boolean.parseBoolean(proxy)))
			entitySerializer.add(entity);

		entitySerializer.save(response.getOutputStream());
		entitySerializer.clear();
	}
}