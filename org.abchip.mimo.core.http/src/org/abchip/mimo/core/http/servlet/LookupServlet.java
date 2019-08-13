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
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceScope;
import org.abchip.mimo.entity.ResourceSerializer;
import org.abchip.mimo.entity.SerializationType;
import org.abchip.mimo.util.Strings;

public class LookupServlet extends BaseServlet {

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
		String name = request.getParameter("name");

		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) frameManger.getFrameReader(contextProvider).lookup(frameName);
		if (frame == null) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}

		try (ResourceSerializer<E> resourceSerializer = resourceManager.createResourceSerializer(contextProvider, frame, SerializationType.JAVA_SCRIPT_OBJECT_NOTATION)) {

			E entity = resourceManager.getEntityReader(contextProvider, frame, ResourceScope.CONTEXT).lookup(name);
			if (entity == null) 
				response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			else {
				resourceSerializer.add(entity);
				resourceSerializer.save(response.getOutputStream());
				response.flushBuffer();
				
				response.setStatus(HttpServletResponse.SC_FOUND);
			}
		}
	}
}