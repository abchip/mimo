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

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextEvent;
import org.abchip.mimo.context.ContextListener;
import org.abchip.mimo.context.ProviderConfig;
import org.abchip.mimo.core.http.handler.HttpLogoutHandler;
import org.abchip.mimo.networking.HttpClient;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.SerializationType;
import org.abchip.mimo.util.Logs;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.client.utils.URLEncodedUtils;
import org.osgi.service.log.Logger;

public class HttpConnector implements Closeable {

	private static final Logger LOGGER = Logs.getLogger(HttpConnector.class);

	private Context context;
	private ProviderConfig providerConfig;

	public HttpConnector(Context context, ProviderConfig providerConfig) {
		this.context = context;
		this.providerConfig = providerConfig;

		this.context.registerListener(new ContextListener() {
			@Override
			public void handleEvent(ContextEvent event) {
				switch (event.getEventType()) {
				case CLOSING:
					close();
					break;
				}
			}
		});
	}

	protected Context getContext() {
		return this.context;
	}

	public <E> E execute(String path, String query, ResponseHandler<E> handler) throws Exception {

		URIBuilder uri = new URIBuilder();
		uri.setScheme(providerConfig.getHost().getSchema());
		uri.setHost(providerConfig.getHost().getAddress());
		
		if(providerConfig.getHost().getPort() != 0)
			uri.setPort(providerConfig.getHost().getPort());
		
		uri.setPath(providerConfig.getPath() + "/" + path);
		uri.setParameters(URLEncodedUtils.parse(query, null));
		if(providerConfig.getToken() != null)
			uri.addParameter("token", providerConfig.getToken());

		// uri.setQuery(query);

		HttpPost httpPost = new HttpPost(uri.build());
		// httpPost.setHeader("Connection", "Keep-Alive");
		// httpPost.setHeader("Connection", "Close");

		LOGGER.trace("Execute http request {}", httpPost.getURI());

		@SuppressWarnings("resource")
		E response = context.get(HttpClient.class).execute(httpPost, handler);
		return response;
	}

	@Override
	public void close() {

		try {
			ResourceSerializer<ContextDescription> serializer = context.getResourceManager().createResourceSerializer(ContextDescription.class, SerializationType.MIMO);
			ContextDescription contextDescription = execute("logout", null, new HttpLogoutHandler(serializer));
			LOGGER.audit("Disconnection success id {} user {} tenant {}", contextDescription.getId(), contextDescription.getUser(), contextDescription.getTenant());
		} catch (Exception e) {
			LOGGER.audit("Disconnection failed {}", e.getMessage());
		} finally {
			this.context = null;
			this.providerConfig = null;
		}
	}

}
