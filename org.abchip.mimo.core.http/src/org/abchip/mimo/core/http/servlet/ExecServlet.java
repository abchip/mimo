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
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.SerializationType;
import org.abchip.mimo.service.ServiceManager;
import org.abchip.mimo.service.ServiceRequest;
import org.abchip.mimo.service.ServiceResponse;

public class ExecServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private ServiceManager serviceManager;

	protected void execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {
		_execute(context, request, response);
	}

	@SuppressWarnings("resource")
	private void _execute(Context context, HttpServletRequest httpRequest, HttpServletResponse httpResponse) throws IOException {

		@SuppressWarnings("rawtypes")
		ResourceSerializer<ServiceRequest> requestSerializer = context.getResourceManager().createResourceSerializer(ServiceRequest.class, SerializationType.MIMO);
		ResourceSerializer<ServiceResponse> responseSerializer = context.getResourceManager().createResourceSerializer(ServiceResponse.class, SerializationType.MIMO);

		try {
			String json = httpRequest.getParameter("json");

			requestSerializer.load(json, false);
			ServiceRequest<?> request = requestSerializer.get();
			request.init(context, null);

			ServiceResponse response = serviceManager.execute(request);
			responseSerializer.add(response);
			responseSerializer.save(httpResponse.getOutputStream());
			httpResponse.setStatus(HttpServletResponse.SC_OK);
		} catch (Exception e) {
			httpResponse.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
			return;
		} finally {
			requestSerializer.clear();
			responseSerializer.clear();
		}
	}
}