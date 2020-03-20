/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.http.servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.abchip.mimo.MimoConstants;
import org.abchip.mimo.application.Application;
import org.abchip.mimo.core.e4.E4Activator;
import org.abchip.mimo.core.http.HttpServiceImpl;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;

public class HttpServiceServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public HttpServiceServlet() {
		super();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		ServletContext servletContext = config.getServletContext();

		try {
			// start framework
			Application application = E4Activator.getApplication();

			// register org.osgi.service.httpHttpService
			if (application.getContext().get(HttpService.class) == null) {
				HttpService httpService = new HttpServiceImpl(servletContext);
				application.getContext().set(HttpService.class, httpService);

				BundleContext bundleContext = FrameworkUtil.getBundle(Application.class).getBundleContext();
				for (ServiceReference<Servlet> serviceReference : bundleContext.getServiceReferences(Servlet.class, null)) {
					Object servletAlias = serviceReference.getProperty(MimoConstants.SERVLET_ALIAS);
					if (servletAlias == null)
						continue;

					try {
						Servlet servlet = bundleContext.getService(serviceReference);
						httpService.registerServlet(servletAlias.toString(), servlet, serviceReference.getProperties(), null);
					} catch (ServletException | NamespaceException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		} catch (InvalidSyntaxException e) {
			throw new ServletException(e);
		}
	}
}
