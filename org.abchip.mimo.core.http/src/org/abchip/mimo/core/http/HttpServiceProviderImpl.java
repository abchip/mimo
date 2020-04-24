/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.http;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.concurrent.Future;

import javax.inject.Inject;

import org.abchip.mimo.core.http.handler.HttpExecHandler;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.SerializationType;
import org.abchip.mimo.service.ServiceException;
import org.abchip.mimo.service.ServiceRequest;
import org.abchip.mimo.service.ServiceResponse;
import org.abchip.mimo.service.impl.ServiceProviderImpl;

public class HttpServiceProviderImpl extends ServiceProviderImpl {

	@Inject
	private ResourceManager resourceManager;

	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> V execute(R request) throws ServiceException {
		try {
			String query = "json=" + this.serializeRequest(request) + "&submit=false";

			@SuppressWarnings("resource")
			HttpConnector connector = request.getContext().get(HttpConnector.class);
			if (connector == null)
				throw new ServiceException("Connector not found");

			connector.execute("exec", query, new HttpExecHandler());
		} catch (Exception e) {
			throw new ServiceException(e);
		}

		return null;
	}

	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> Future<V> submit(R request) throws ServiceException {
		try {
			String query = "json=" + this.serializeRequest(request) + "&submit=true";

			@SuppressWarnings("resource")
			HttpConnector connector = request.getContext().get(HttpConnector.class);
			if (connector == null)
				throw new ServiceException("Connector not found");

			connector.execute("exec", query, new HttpExecHandler());
		} catch (Exception e) {
			throw new ServiceException(e);
		}

		return null;
	}

	private <V extends ServiceResponse, R extends ServiceRequest<V>> String serializeRequest(R request) throws ServiceException {

		@SuppressWarnings("rawtypes")
		ResourceSerializer<ServiceRequest> requestSerializer = resourceManager.createResourceSerializer(request.getContext(), ServiceRequest.class, SerializationType.MIMO);

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		requestSerializer.add(request);
		try {
			requestSerializer.save(baos);
			return URLEncoder.encode(baos.toString(), "UTF-8");
		} catch (IOException e) {
			throw new ServiceException(e);
		} finally {
			requestSerializer.clear();
		}
	}
}
