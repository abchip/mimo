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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.application.ServiceRegistering;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.core.http.BaseServlet;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceScope;
import org.abchip.mimo.entity.ResourceSerializer;
import org.abchip.mimo.entity.SerializationType;
import org.abchip.mimo.util.Strings;
import org.osgi.service.http.HttpService;

public class FindServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private ContextRoot contextRoot;
	@Inject
	private FrameManager frameManger;
	@Inject
	private ResourceManager resourceManager;
	
	@ServiceRegistering
	private void _init(HttpService httpService) throws Exception {
		httpService.registerServlet("/biz/service/find", this, null, null);
	}
	
	protected void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		_execute(request, response);
	}
	
	private <E extends EntityNameable> void _execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String frameName = Strings.qINSTANCE.firstToUpper(request.getParameter("frame"));
		
		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) frameManger.getFrameReader(contextRoot).lookup(frameName);
		if (frame == null) 
			return;
		
		ResourceSerializer<E> resourceSerializer = resourceManager.getResourceSerializer(contextRoot, frame, SerializationType.JSON);
		
		EntityReader<E> entityReader = resourceManager.getEntityReader(contextRoot, frame, ResourceScope.CTX);
		EntityIterator<E> entityIterator = entityReader.find(null);
		List<E> entityList = new ArrayList<E>();
		
		for(E entity: entityIterator) {		
			entityList.add(entity);
		}
		
		resourceSerializer.addAll(entityList);
			
		resourceSerializer.save(response.getOutputStream());
		response.flushBuffer();
		resourceSerializer.clear();		
	}
}