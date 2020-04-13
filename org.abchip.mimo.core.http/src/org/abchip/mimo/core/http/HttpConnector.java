/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.http;

import java.io.Closeable;
import java.io.IOException;

import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ProviderConfig;
import org.abchip.mimo.net.HttpClient;
import org.abchip.mimo.util.Logs;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.osgi.service.log.Logger;

public class HttpConnector implements Closeable {

	private static final Logger LOGGER = Logs.getLogger(HttpConnector.class);

	private ProviderConfig providerConfig;
	private HttpClient httpClient;
	private ContextDescription contextDescription;

	private String token;

	protected HttpConnector(ProviderConfig providerConfig, HttpClient httpClient, ContextDescription contextDescription) {
		this.providerConfig = providerConfig;
		this.httpClient = httpClient;
		this.contextDescription = contextDescription;
		this.token = contextDescription.getId();
	}

	protected ContextDescription getContextDescription() {
		return this.contextDescription;
	}

	@SuppressWarnings("deprecation")
	public <E> E execute(String path, String query, ResponseHandler<E> handler) throws Exception {

		URIBuilder uri = new URIBuilder();
		uri.setScheme(providerConfig.getSchema());
		uri.setHost(providerConfig.getHost().getAddress());
		uri.setPort(providerConfig.getHost().getPort());
		uri.setPath(providerConfig.getPath() + "/" + path + ";jsessionid=" + token);

		if (query != null)
			uri.setQuery(query);

		HttpPost httpPost = new HttpPost(uri.build());
		// httpPost.setHeader("Connection", "Keep-Alive");
		// httpPost.setHeader("Connection", "Close");

		LOGGER.trace("Execute http request {}", httpPost.getURI());

		try {
			E response = httpClient.execute(httpPost, handler);
			return response;
		} finally {
			httpPost.reset();
		}
	}

	@Override
	public void close() throws IOException {
		// this.httpClient.close();
		this.httpClient = null;
	}
}
