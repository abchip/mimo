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

import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.core.http.BaseServlet;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceScope;
import org.abchip.mimo.entity.ResourceSerializer;
import org.abchip.mimo.entity.SerializationType;
import org.abchip.mimo.ui.menu.Menu;

public class LookupMenuServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private ContextRoot contextRoot;
	@Inject
	private ResourceManager resourceManager;
	
	protected void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String name = request.getParameter("name");
		Menu menu = resourceManager.getEntityReader(contextRoot, Menu.class, ResourceScope.CTX).lookup(name);
		
		ResourceSerializer<Menu> resourceSerializer = resourceManager.getResourceSerializer(contextRoot, Menu.class, SerializationType.JSON);
		if(menu != null) 
			resourceSerializer.add(menu);

		resourceSerializer.save(response.getOutputStream());
		resourceSerializer.close();

		response.flushBuffer();		
	}	
}