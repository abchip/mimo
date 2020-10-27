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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceWriter;

public class NextSequenceServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;


	protected void execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {
		_execute(context, request, response);
	}

	@SuppressWarnings("resource")
	private <E extends EntityIdentifiable> void _execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {

		String tenant = request.getParameter("tenant");
		String frame = request.getParameter("frame");

		try {
			response.setStatus(HttpServletResponse.SC_OK);
			ResourceWriter<E> resourceWriter = context.getResourceManager().getResourceWriter(frame, tenant);
			String nextSequence = resourceWriter.getResource().nextSequence();
			if (nextSequence == null)
				response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			else {
				response.setStatus(HttpServletResponse.SC_OK);

				response.getWriter().write(nextSequence);
			}
		} catch (ResourceException e) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
			return;
		}
	}
}