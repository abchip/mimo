/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.http;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.context.Thread;
import org.abchip.mimo.context.ThreadManager;
import org.abchip.mimo.networking.ConnectionPoolingConfig;
import org.abchip.mimo.networking.ConnectionPoolingRouteConfig;
import org.abchip.mimo.networking.HttpClient;
import org.abchip.mimo.util.Logs;
import org.abchip.mimo.util.Strings;
import org.apache.http.HttpHost;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultClientConnectionReuseStrategy;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.TrustStrategy;
import org.osgi.service.log.Logger;

public class HttpClientImpl implements HttpClient {

	private static final Logger LOGGER = Logs.getLogger(HttpClientImpl.class);

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

		connectionManager = new PoolingHttpClientConnectionManager();

		// default
		connectionManager.setMaxTotal(poolingConfig.getMaxTotal());
		connectionManager.setDefaultMaxPerRoute(poolingConfig.getMaxPerRoute());

		// routes
		for(ConnectionPoolingRouteConfig route: poolingConfig.getRoutes()) {
			HttpHost host = new HttpHost(route.getHost().getAddress(), route.getHost().getPort());
			connectionManager.setMaxPerRoute(new HttpRoute(host), route.getMax());	
		}
		
		
		// RequestConfig result =
		// RequestConfig.custom().setConnectionRequestTimeout(100).setConnectTimeout(300).setSocketTimeout(1500).build();

		
		try {
			SSLContextBuilder builder = new SSLContextBuilder();
			builder.loadTrustMaterial(null, new TrustStrategy() {
				@Override
				public boolean isTrusted(X509Certificate[] chain, String authType) {
					return true;
				}
			});
			SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(builder.build(), new HostnameVerifier() {

				@Override
				public boolean verify(String hostname, SSLSession session) {
					return true;
				}

			});

			HTTP = HttpClients.custom().setConnectionManager(connectionManager).setSSLSocketFactory(sslsf).setConnectionReuseStrategy(DefaultClientConnectionReuseStrategy.INSTANCE).build();
		} catch (KeyManagementException | NoSuchAlgorithmException | KeyStoreException e) {
			LOGGER.error(e.getMessage());
		}

		Thread thread = threadManager.createThread(application.getName() + "-http-monitor", new HttpClientMonitor(connectionManager));
		threadManager.start(thread);
	}

	@Override
	public <T> T execute(HttpPost method, ResponseHandler<T> handler) throws Exception {
		try {
			return HTTP.execute(method, handler);
		} catch (Exception e) {

			String message = e.getMessage();
			while (Strings.isEmpty(message)) {
				if (e.getCause() == null)
					break;
				message = e.getCause().getMessage();
			}
			if (message == null)
				throw new ClientProtocolException(message);
			else
				throw e;
		}
	}
}
