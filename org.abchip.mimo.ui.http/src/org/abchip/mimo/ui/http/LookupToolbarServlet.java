/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.ui.http;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.core.http.servlet.BaseServlet;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.SerializationType;
import org.abchip.mimo.ui.toolbar.Toolbar;

public class LookupToolbarServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private ResourceManager resourceManager;

	@SuppressWarnings("resource")
	protected void execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {

		String frameName = request.getParameter("frame");
		if (frameName == null)
			return;

		Frame<?> frame = resourceManager.getFrame(context, frameName);
		if (frame == null) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}

		try {
			Toolbar toolbar = resourceManager.getResourceReader(context, Toolbar.class, Resource.TENANT_MASTER).lookup(frameName);
			for (Frame<?> ako : frame.getSuperFrames()) {
				Toolbar toolbarAko = resourceManager.getResourceReader(context, Toolbar.class, Resource.TENANT_MASTER).lookup(ako.getName());
				if (toolbarAko == null)
					continue;

				if (toolbar == null)
					toolbar = toolbarAko;
				else
					toolbar.getElements().addAll(toolbarAko.getElements());
			}

			response.setStatus(HttpServletResponse.SC_FOUND);
			ResourceSerializer<Toolbar> entitySerializer = resourceManager.createResourceSerializer(context, Toolbar.class, SerializationType.JSON);
			if (toolbar != null)
				entitySerializer.add(toolbar);
			entitySerializer.save(response.getOutputStream());
		} catch (ResourceException e) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
			return;
		}
	}
}