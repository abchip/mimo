/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.http;

import java.util.Dictionary;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.osgi.service.http.HttpContext;
import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;

public class HttpServiceImpl implements HttpService {

	protected ServletContext servletContext;

	public HttpServiceImpl(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

	@Override
	public HttpContext createDefaultHttpContext() {
		return null;
	}

	@Override
	public void registerResources(String arg0, String arg1, HttpContext arg2) throws NamespaceException {
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void registerServlet(String alias, Servlet servlet, Dictionary dictionary, HttpContext context) throws ServletException, NamespaceException {

		ServletRegistration servletRegistration = servletContext.addServlet(servlet.getClass().getSimpleName(), servlet);
		servletRegistration.addMapping(alias);
	}

	@Override
	public void unregister(String servletName) {
	}
}
