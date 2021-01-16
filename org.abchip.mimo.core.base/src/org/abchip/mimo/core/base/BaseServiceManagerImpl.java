/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.service.Service;
import org.abchip.mimo.service.ServiceException;
import org.abchip.mimo.service.ServiceFactory;
import org.abchip.mimo.service.ServiceManager;
import org.abchip.mimo.service.ServiceProvider;
import org.abchip.mimo.service.ServiceProviderRegistry;
import org.abchip.mimo.service.ServiceRequest;
import org.abchip.mimo.service.ServiceResponse;
import org.abchip.mimo.util.Strings;

public class BaseServiceManagerImpl implements ServiceManager {

	private Context context;
	private ServiceProviderRegistry serviceProviderRegistry;

	private ExecutorService executorService = null;

	public BaseServiceManagerImpl(Context context) {
		this.context = context;

		serviceProviderRegistry = context.get(ServiceProviderRegistry.class);
		executorService = Executors.newFixedThreadPool(100);
	}

	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> Service<R, V> getService(String serviceId) {

		Frame<R> frame = context.getResourceManager().getFrame(Strings.firstToUpper(serviceId));
		if (frame == null)
			return null;

		if (!frame.getSuperNames().contains(ServiceRequest.class.getSimpleName()))
			return null;

		Service<R, V> service = ServiceFactory.eINSTANCE.createService();
		service.setName(frame.getName());

		R request = this.context.make(frame);

		service.setRequest(request);

		return service;
	}

	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> R prepare(Class<R> klass) throws ServiceException {
		return prepare(klass.getSimpleName());
	}

	@SuppressWarnings("unchecked")
	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> R prepare(String frame) throws ServiceException {

		Frame<?> request = (Frame<?>) context.getResourceManager().getFrame(frame);
		if (request == null)
			throw new ServiceException("Service not found " + frame);

		if (!request.getSuperNames().contains(ServiceRequest.class.getSimpleName()))
			throw new ServiceException("Invalid service " + frame);

		return prepare((Frame<R>) request);
	}

	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> R prepare(Frame<R> frame) throws ServiceException {

		try {
			Resource<R> resource = (Resource<R>) context.getResourceSet().getResource(frame);
			R request = resource.make();
			context.inject(request);
			return request;
		} catch (ResourceException e) {
			throw new ServiceException(e);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> V execute(R request) throws ServiceException {

		if (!request.isPrepared())
			throw new UnsupportedOperationException("Request not prepared");

		// callable
		if (request instanceof Callable) {
			try {
				return ((Callable<V>) request).call();
			} catch (Exception e) {
				throw new ServiceException(e);
			}
		}

		ServiceProvider serviceProvider = this.serviceProviderRegistry.getServiceProvider(request.getContext(), request);
		if (serviceProvider == null)
			throw new ServiceException("Service provider not found for request: " + request.getServiceName());

		return serviceProvider.execute(request);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> Future<V> submit(R request) throws ServiceException {

		if (!request.isPrepared())
			throw new UnsupportedOperationException("Request not prepared");

		// callable
		if (request instanceof Callable) {
			try {
				return executorService.submit(((Callable<V>) request));
			} catch (Exception e) {
				throw new ServiceException(e);
			}
		}

		ServiceProvider serviceProvider = this.serviceProviderRegistry.getServiceProvider(request.getContext(), request);
		if (serviceProvider == null)
			throw new ServiceException("Service provider not found for request: " + request.getServiceName());

		return serviceProvider.submit(request);
	}
}