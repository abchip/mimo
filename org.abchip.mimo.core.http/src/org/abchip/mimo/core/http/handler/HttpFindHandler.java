/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.http.handler;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.core.http.HttpUtils;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.resource.ResourceSerializer;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;

public class HttpFindHandler<E extends EntityIdentifiable> implements ResponseHandler<List<E>> {

	protected ResourceSerializer<E> serializer;

	public HttpFindHandler(ResourceSerializer<E> serializer) {
		this.serializer = serializer;
	}

	@Override
	public List<E> handleResponse(HttpResponse response) throws ClientProtocolException, IOException {

		switch (response.getStatusLine().getStatusCode()) {
		case HttpServletResponse.SC_OK:
			HttpEntity httpEntity = response.getEntity();
			try (InputStream stream = httpEntity.getContent()) {
				serializer.load(stream, false);
				return serializer.getAll();
			} finally {
				serializer.clear();
			}
		default:
			throw HttpUtils.buildException(response);
		}
	}
}
