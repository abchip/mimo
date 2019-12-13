/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.http;

import org.abchip.mimo.context.ProviderConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;

public class HttpConnector {

	private ProviderConfig providerConfig;
	private CloseableHttpClient httpClient;
	private final String token;

	protected HttpConnector(ProviderConfig providerConfig, CloseableHttpClient httpClient, String token) {
		this.providerConfig = providerConfig;
		this.httpClient = httpClient;
		this.token = token;
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
			return null;
		}
	}
}