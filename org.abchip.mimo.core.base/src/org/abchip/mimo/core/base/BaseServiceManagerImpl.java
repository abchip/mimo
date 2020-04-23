/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import java.util.concurrent.Future;

import javax.inject.Inject;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.service.Service;
import org.abchip.mimo.service.ServiceException;
import org.abchip.mimo.service.ServiceFactory;
import org.abchip.mimo.service.ServiceManager;
import org.abchip.mimo.service.ServiceProvider;
import org.abchip.mimo.service.ServiceProviderRegistry;
import org.abchip.mimo.service.ServiceRequest;
import org.abchip.mimo.service.ServiceResponse;

public class BaseServiceManagerImpl implements ServiceManager {

	@Inject
	private ServiceProviderRegistry serviceProviderRegistry;

	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> Service<R, V> getService(Context context, R request) {

		Service<R, V> service = ServiceFactory.eINSTANCE.createService();
		service.setName(request.getServiceName());
		service.setRequest(request);

		return service;
	}

	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> Service<R, V> getService(Context context, Class<R> klass) {

		Service<R, V> service = ServiceFactory.eINSTANCE.createService();
		service.setName(klass.getSimpleName());

		R request = context.getFrame(klass).createEntity();
		service.setRequest(request);

		return service;
	}

	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> R prepare(Context context, Class<R> klass) throws ServiceException {
		return prepare(context, klass, null);
	}

	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> R prepare(Context context, Class<R> klass, String tenant) throws ServiceException {

		this.checkAuthorization(context, tenant);

		R request = context.getFrame(klass).createEntity();

		// set default parameters
		// TODO

		request.init(context, tenant);

		return request;
	}

	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> V execute(R request) throws ServiceException {

		ServiceProvider serviceProvider = this.serviceProviderRegistry.getServiceProvider(request.getContext(), request);
		if (serviceProvider == null)
			throw new ServiceException("Service provider not found for request: " + request.getServiceName());

		return serviceProvider.execute(request);
	}

	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> Future<V> submit(R request) throws ServiceException {

		ServiceProvider serviceProvider = this.serviceProviderRegistry.getServiceProvider(request.getContext(), request);
		if (serviceProvider == null)
			throw new ServiceException("Service provider not found for request: " + request.getServiceName());

		return serviceProvider.submit(request);
	}

	protected final void checkAuthorization(Context context, String tenant) throws ServiceException {
		ContextDescription contextDescription = context.getContextDescription();

		// check authorization
		if (contextDescription.isTenant()) {
			// if (!contextDescription.getTenant().equals(tenant))
			// throw new SecurityException("Permission denied for tenant: " +
			// contextDescription.getTenant());
		}

		// check frame authorization
	}
}