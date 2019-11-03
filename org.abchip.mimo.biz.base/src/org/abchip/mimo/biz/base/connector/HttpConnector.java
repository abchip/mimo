/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.base.connector;

import org.abchip.mimo.biz.BizProviderConfig;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;

public class HttpConnector {

	private BizProviderConfig providerConfig;
	private CloseableHttpClient httpClient;
	private final String token;

	protected HttpConnector(BizProviderConfig providerConfig, CloseableHttpClient httpClient, String token) {
		this.providerConfig = providerConfig;
		this.httpClient = httpClient;
		this.token = token;
	}

	protected String getToken() {
		return token;
	}

	protected CloseableHttpResponse execute(String url, HttpEntity httpEntity) throws Exception {

		HttpPost httpPost = null;
		switch (providerConfig.getLoginType()) {
		case JSON_WEB_TOKEN:
			url = providerConfig.getUrl() + url;
			url = url + "&loginType=JWT";
			httpPost = new HttpPost(url);
			httpPost.setHeader("Bearer", token);
			break;
		case EXTERNAL_KEY:
			url = providerConfig.getUrl() + url + "&externalLoginKey=" + token;
			url = url + "&loginType=EXTK";
			httpPost = new HttpPost(url);
			break;
		}

		if (httpEntity != null) {
			httpPost.setHeader("Content-Type", ContentType.APPLICATION_JSON.getMimeType());
			httpPost.setEntity(httpEntity);
		}

		try {
			CloseableHttpResponse response = httpClient.execute(httpPost);
			return response;
		} catch (Exception e) {
			return null;
		}
	}
}
