/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.http.servlet.session;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.core.http.ContextUtils;
import org.abchip.mimo.core.http.servlet.BaseServlet;

public class LogoutServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	protected void execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {

		ContextUtils.removeContext(context.getContextDescription().getId());
		context.dispose();

		response.setStatus(HttpServletResponse.SC_ACCEPTED);

		HttpSession session = request.getSession();
		session.invalidate();
	}
}