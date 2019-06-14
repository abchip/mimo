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
import org.abchip.mimo.core.http.BaseServlet;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceScope;
import org.abchip.mimo.util.Strings;

public class DeleteServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private ResourceManager resourceManager;
	@Inject
	private FrameManager frameManger;

	protected void execute(ContextProvider contextProvider, HttpServletRequest request, HttpServletResponse response) throws IOException {
		_execute(contextProvider, request, response);
	}

	private <E extends EntityNameable> void _execute(ContextProvider contextProvider, HttpServletRequest request, HttpServletResponse response) throws IOException {
		String frameName = Strings.qINSTANCE.firstToUpper(request.getParameter("frame"));
		String name = request.getParameter("name");
		
		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) frameManger.getFrameReader(contextProvider).lookup(frameName);
		if (frame == null) 
			return;

		E entity = resourceManager.getEntityReader(contextProvider, frame, ResourceScope.CTX).lookup(name);

		EntityWriter<EntityNameable> entityWriter = resourceManager.getEntityWriter(contextProvider, frameName, "data");

		entityWriter.delete(entity);
	}
}