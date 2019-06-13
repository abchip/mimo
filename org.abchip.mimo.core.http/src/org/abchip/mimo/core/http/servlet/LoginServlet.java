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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.core.http.BaseServlet;
import org.abchip.mimo.entity.EntityNameable;

public class LoginServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	protected void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		_execute(request, response);
	}

	private <E extends EntityNameable> void _execute(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String user = request.getParameter("user");
		String password = request.getParameter("pass");
		String tenant = request.getParameter("tenant");
		response.getWriter().write("{\"id\":1,\"name\":\"Admin\"}");

		response.flushBuffer();
	}
}