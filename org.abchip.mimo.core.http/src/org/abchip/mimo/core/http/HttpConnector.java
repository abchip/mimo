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
import org.abchip.mimo.util.Logs;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.osgi.service.log.Logger;

public class HttpConnector implements Closeable {

	private static final Logger LOGGER = Logs.getLogger(HttpConnector.class);

	private ProviderConfig providerConfig;
	private CloseableHttpClient httpClient;
	private ContextDescription contextDescription;
	private final String token;

	protected HttpConnector(ProviderConfig providerConfig, CloseableHttpClient httpClient, ContextDescription contextDescription) {
		this.providerConfig = providerConfig;
		this.httpClient = httpClient;
		this.contextDescription = contextDescription;
		this.token = contextDescription.getId();
	}

	protected ContextDescription getContextDescription() {
		return this.contextDescription;
	}

	protected String getToken() {
		return token;
	}

	public CloseableHttpResponse execute(String path, String query) throws Exception {

		HttpPost httpPost = null;
		path = providerConfig.getUrl() + "/" + path + ";jsessionid=" + token + query;
		httpPost = new HttpPost(path);

		try {
			CloseableHttpResponse response = httpClient.execute(httpPost);
			return response;
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			return null;
		}
	}

	@Override
	public void close() throws IOException {
		this.httpClient.close();
		this.httpClient = null;
	}
}
