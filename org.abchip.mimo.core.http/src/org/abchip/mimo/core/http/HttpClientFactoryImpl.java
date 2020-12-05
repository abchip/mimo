/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.http;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.net.ssl.SSLContext;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextEvent;
import org.abchip.mimo.context.ContextListener;
import org.abchip.mimo.context.Factory;
import org.abchip.mimo.context.Thread;
import org.abchip.mimo.context.ThreadManager;
import org.abchip.mimo.networking.ConnectionPoolingConfig;
import org.abchip.mimo.networking.ConnectionPoolingRouteConfig;
import org.abchip.mimo.networking.HttpClient;
import org.abchip.mimo.util.Logs;
import org.apache.http.HttpHost;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultClientConnectionReuseStrategy;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.ssl.TrustStrategy;
import org.osgi.service.log.Logger;

public class HttpClientFactoryImpl implements Factory<HttpClient> {

	private static final Logger LOGGER = Logs.getLogger(HttpClientFactoryImpl.class);

	@Inject
	private Application application;
	@Inject
	private ConnectionPoolingConfig poolingConfig;
	@Inject
	private ThreadManager threadManager;

	private PoolingHttpClientConnectionManager connectionManager = null;

	private CloseableHttpClient HTTP = null;
	
	@PostConstruct
	private void init() {

		try {
			TrustStrategy acceptingTrustStrategy = (cert, authType) -> true;
			SSLContext sslContext = SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy).build();
			SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext, NoopHostnameVerifier.INSTANCE);

			RegistryBuilder<ConnectionSocketFactory> sfr = RegistryBuilder.<ConnectionSocketFactory>create();
			sfr.register("https", sslsf);
			sfr.register("http", new PlainConnectionSocketFactory()).build();

			connectionManager = new PoolingHttpClientConnectionManager(sfr.build());

			// default
			connectionManager.setMaxTotal(poolingConfig.getMaxTotal());
			connectionManager.setDefaultMaxPerRoute(poolingConfig.getMaxPerRoute());

			// routes
			for (ConnectionPoolingRouteConfig route : poolingConfig.getRoutes()) {
				HttpHost host = new HttpHost(route.getHost().getAddress(), route.getHost().getPort(), route.getHost().getSchema());
				connectionManager.setMaxPerRoute(new HttpRoute(host), route.getMax());
			}

			HttpClientBuilder httpBuilder = HttpClients.custom();
			httpBuilder.setConnectionManager(connectionManager);
			httpBuilder.setSSLSocketFactory(sslsf);
			httpBuilder.setConnectionReuseStrategy(DefaultClientConnectionReuseStrategy.INSTANCE);
			HTTP = httpBuilder.build();

		} catch (KeyManagementException | NoSuchAlgorithmException | KeyStoreException e) {
			LOGGER.error(e.getMessage());
			return;
		}

		Thread thread = threadManager.createThread(application.getName() + "-http-monitor", new HttpClientMonitor(connectionManager));
		threadManager.start(thread);
	}

	@Override
	public HttpClient create(Context context) {
		HttpClient httpClient = new HttpClientImpl(HTTP);

		context.registerListener(new ContextListener() {
			@Override
			public void handleEvent(ContextEvent event) {
				switch (event.getEventType()) {
				case CLOSING:
					try {
						httpClient.close();
					} catch (IOException e) {
						LOGGER.warn(e.getMessage());
					}
					break;
				}
			}
		});

		return httpClient;
	}

	@Override
	public Class<HttpClient> getInterfaceClass() {
		return HttpClient.class;
	}
}
