/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.jetty;

import java.util.Dictionary;
import java.util.Hashtable;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ComponentStarting;
import org.abchip.mimo.net.HttpServiceConfig;
import org.abchip.mimo.net.HostConfig;
import org.abchip.mimo.util.Logs;
import org.eclipse.equinox.http.jetty.JettyConfigurator;
import org.eclipse.equinox.http.servlet.ExtendedHttpService;
import org.osgi.service.http.HttpService;
import org.osgi.service.log.Logger;

public class JettyActivatorHook {

	private static final Logger LOGGER = Logs.getLogger(JettyActivatorHook.class);

	@ComponentStarting
	public void start(Application application, HttpServiceConfig httpServiceConfig) {

		HostConfig hostConfig = httpServiceConfig.getHost();

		Dictionary<String, Object> settings = new Hashtable<String, Object>();
		settings.put("http.enabled", Boolean.TRUE);
		settings.put("http.host", hostConfig.getAddress());
		settings.put("http.port", hostConfig.getPort());
		settings.put("https.enabled", Boolean.FALSE);
		settings.put("context.path", httpServiceConfig.getPath());
		settings.put("context.sessioninactiveinterval", 1800);
		try {
			JettyConfigurator.startServer("org.abchip.mimo.core.http", settings);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			String filterString = "(http.port=" + hostConfig.getPort() + ")";
			ExtendedHttpService httpService = (ExtendedHttpService) application.getContext().get(HttpService.class, filterString);

			if (httpService != null) {
				application.getContext().set(HttpService.class, httpService);

				// HttpContext httpContext = httpService.createDefaultHttpContext();
				httpService.registerFilter("/", new CORSFilter(), null, null);
				// httpService.registerFilter("/", new MultiPartFilter(), null, httpContext);

				// FileService
				// httpService.registerResources("/", "/site/index.html", httpContext);
				// httpService.registerResources("/*", "/site", httpContext);
			} else {
				LOGGER.warn("HttpService not found!");
				return;
			}

		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
	}
}
