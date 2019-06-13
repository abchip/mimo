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
package org.abchip.mimo.ui.http;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.core.http.BaseServlet;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceScope;
import org.abchip.mimo.entity.ResourceSerializer;
import org.abchip.mimo.entity.SerializationType;
import org.abchip.mimo.ui.toolbar.Toolbar;

public class LookupToolbarServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private FrameManager frameManager;
	@Inject
	private ResourceManager resourceManager;
	
	protected void execute(ContextProvider contextProvider, HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String frameName = request.getParameter("frame");
		if(frameName == null)
			return ;
		
		Frame<?> frame = frameManager.getFrame(frameName);
		if(frame == null)
			return;
		
		Toolbar toolbar = resourceManager.getEntityReader(contextProvider, Toolbar.class, ResourceScope.CTX).lookup(frameName);
		
		for(Frame<?> ako: frame.getSuperFrames()) {
			Toolbar toolbarAko = resourceManager.getEntityReader(contextProvider, Toolbar.class, ResourceScope.CTX).lookup(ako.getName());;
			if(toolbarAko == null)
				continue;
			
			if(toolbar == null)
				toolbar = toolbarAko;
			else 
				toolbar.getElements().addAll(toolbarAko.getElements());
		}

		ResourceSerializer<Toolbar> resourceSerializer = resourceManager.getResourceSerializer(contextProvider, Toolbar.class, SerializationType.JSON);
		if(toolbar != null) 
			resourceSerializer.add(toolbar);

		resourceSerializer.save(response.getOutputStream());
		resourceSerializer.close();

		response.flushBuffer();		
	}	
}