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
package org.abchip.mimo.core.http;

import java.util.Dictionary;
import java.util.Hashtable;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ComponentStarted;
import org.abchip.mimo.net.SocketConfig;
import org.eclipse.equinox.http.jetty.JettyConfigurator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.osgi.service.http.HttpService;

public class HttpActivatorHook {

	
	@ComponentStarted
	public void start(Application application, SocketConfig socketConfig) {

		Dictionary<String, Object> settings = new Hashtable<String, Object>();
		settings.put("http.enabled", Boolean.TRUE);
		settings.put("http.host", socketConfig.getAddress());
		settings.put("http.port", socketConfig.getPort());
		settings.put("https.enabled", Boolean.FALSE);
		settings.put("context.path", "/");
		settings.put("context.sessioninactiveinterval", 1800);
		try {
			JettyConfigurator.startServer("org.abchip.mimo.core.http", settings);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			BundleContext bundleContext = FrameworkUtil.getBundle(application.getContext().getClass()).getBundleContext();

			String filterString = "(http.port=" + socketConfig.getPort() + ")";
			ServiceReference<?>[] httpServiceRef = bundleContext.getServiceReferences(HttpService.class.getName(), filterString);

			if (httpServiceRef.length > 0) {

				HttpService httpService = (HttpService) bundleContext.getService(httpServiceRef[0]);

				// WSService (session WS)
				FindServlet wsServlet = application.getContext().make(FindServlet.class);
				httpService.registerServlet("/service/find", wsServlet, null, null);
							
				// FileService
//				HttpContext httpContext = httpService.createDefaultHttpContext();
				httpService.registerResources("/", "/site/org.abchip.mimo.core.http/index.html", null);
				httpService.registerResources("/*", "/site/org.abchip.mimo.core.http", null);				
			} else {
				System.out.println("HttpService not found!");
				return;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
