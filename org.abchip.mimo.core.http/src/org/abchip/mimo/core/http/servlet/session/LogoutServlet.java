/**
 *  Copyright (c) 2017, 2019 ABChip and others.
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

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.core.http.BaseServlet;
import org.abchip.mimo.core.http.ContextUtils;

public class LogoutServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;
	
	protected void execute(ContextProvider contextProvider, HttpServletRequest request, HttpServletResponse response) throws IOException {

		HttpSession session = request.getSession();
		
		ContextUtils.removeContextProvider(session.getId());
		this.getDefaultProvider().logout(contextProvider);
		contextProvider.getContext().close();
		
		response.setStatus(HttpServletResponse.SC_ACCEPTED);
		response.flushBuffer();
	}
}