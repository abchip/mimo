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
import org.eclipse.equinox.http.servlet.ExtendedHttpService;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.osgi.service.http.HttpContext;
import org.osgi.service.http.HttpService;

public class HttpActivatorHook {

	
	@ComponentStarted
	public void start(Application application, SocketConfig socketConfig) {
		
		BundleContext bundleContext = FrameworkUtil.getBundle(application.getContext().getClass()).getBundleContext();

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
			String filterString = "(http.port=" + socketConfig.getPort() + ")";
			ServiceReference<?>[] httpServiceRef = bundleContext.getServiceReferences(HttpService.class.getName(), filterString);

			if (httpServiceRef.length > 0) {

				ExtendedHttpService httpService = (ExtendedHttpService) bundleContext.getService(httpServiceRef[0]);
				HttpContext httpContext = httpService.createDefaultHttpContext();
				
				
				httpService.registerFilter("/", new CORSFilter(), null, httpContext);
				
//				Dictionary<String, String> dictionary = new Hashtable<String, String>();
//				dictionary.put("osgi.http.whiteboard.context.path", "/biz");
//				dictionary.put("osgi.http.whiteboard.filter.pattern", "/*");		
//				dictionary.put("osgi.http.whiteboard.filter.regex", "*");
//				bundleContext.registerService("javax.servlet.Filter", new CORSFilter(), dictionary);

				
							
				
				// BizService
				FindServlet findServlet = application.getContext().make(FindServlet.class);
				httpService.registerServlet("/biz/service/find", findServlet, null, httpContext);
				
				// FileService
				httpService.registerResources("/", "/site/index.html", httpContext);
				httpService.registerResources("/*", "/site", httpContext);				
			} else {
				System.out.println("HttpService not found!");
				return;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
