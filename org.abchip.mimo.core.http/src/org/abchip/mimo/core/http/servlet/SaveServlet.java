/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.core.http.servlet;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.core.http.BaseServlet;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceScope;
import org.abchip.mimo.entity.ResourceSerializer;
import org.abchip.mimo.entity.SerializationType;
import org.abchip.mimo.util.Strings;

public class SaveServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ResourceManager resourceManager;
	@Inject
	private ContextRoot contextRoot;



	protected void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		_execute(request, response);
	}
	
	private <E extends EntityNameable> void _execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String frame = Strings.qINSTANCE.firstToUpper(request.getParameter("frame"));
		String json = request.getParameter("json");

		InputStream targetStream = new ByteArrayInputStream(json.getBytes());
		
		ResourceSerializer<E> resourceSerializer = resourceManager.getResourceSerializer(contextRoot, frame, SerializationType.JSON);
		resourceSerializer.load(targetStream);
		E entity = null;
		entity = resourceSerializer.get();
		
		EntityWriter<EntityNameable> entityWriter = resourceManager.getEntityWriter(contextRoot, frame, ResourceScope.ROOT);

		entityWriter.save(entity);
	}
}