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

import org.abchip.mimo.networking.HttpClient;
import org.abchip.mimo.networking.NetworkingException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.protocol.HttpContext;

public class HttpClientImpl implements HttpClient {

	private HttpContext context;
	private CloseableHttpClient client = null;

	public HttpClientImpl(CloseableHttpClient client) {
		this.client = client;

		this.context = HttpClientContext.create();
		CookieStore cookieStore = new BasicCookieStore();
		this.context.setAttribute(HttpClientContext.COOKIE_STORE, cookieStore);
	}

	@Override
	public <T> T execute(HttpPost method, ResponseHandler<T> handler) throws NetworkingException {
		if (client == null)
			throw new NetworkingException("Client closed");

		try {
			return client.execute(method, handler, context);
		} catch (Exception e) {

			/*
			 * String message = e.getMessage(); while (Strings.isEmpty(message)) { if
			 * (e.getCause() == null) break; message = e.getCause().getMessage(); } if
			 * (message == null) throw new ResourceException(message); else
			 */
			throw new NetworkingException(e);
		} finally {
			method.reset();
		}
	}

	@Override
	public void close() throws IOException {
		if (this.client == null)
			return;

		// this.client.close();
		this.client = null;
	}
}
