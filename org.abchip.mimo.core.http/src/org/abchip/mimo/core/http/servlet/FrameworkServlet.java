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

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.core.e4.E4FrameworkStarter;
import org.abchip.mimo.core.http.HttpServiceImpl;
import org.osgi.framework.BundleException;
import org.osgi.service.http.HttpService;

public class FrameworkServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mimoOsgiData;
	private String mimoApplicationConfig;

	public FrameworkServlet() {
		super();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		ServletContext servletContext = config.getServletContext();

		mimoOsgiData = config.getInitParameter("mimo.osgi.data");
		mimoApplicationConfig = config.getInitParameter("mimo.application.config");

		try {
			// start framework
			Application application = new E4FrameworkStarter(mimoOsgiData, mimoApplicationConfig).start();

			// register org.osgi.service.httpHttpService
			if (application.getContext().get(HttpService.class) == null)
				application.getContext().set(HttpService.class, new HttpServiceImpl(servletContext));

		} catch (BundleException | IOException e) {
			throw new ServletException(e);
		}
	}
}
