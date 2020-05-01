/**
 *  Copyright (c) 2017, 2020 ABChip and others.
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

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.entity.Frame;
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

	@Inject
	private ServiceProviderRegistry serviceProviderRegistry;

	private ExecutorService executorService = null;

	@PostConstruct
	private void init() {
		executorService = Executors.newFixedThreadPool(100);
	}

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
	public <V extends ServiceResponse, R extends ServiceRequest<V>> Service<R, V> getService(Context context, String serviceId) {

		Frame<?> frame = context.getResourceManager().getFrame(Strings.firstToUpper(serviceId));
		if (frame == null) 
			return null;

		if (!frame.getSuperNames().contains(ServiceRequest.class.getSimpleName())) 
			return null;

		Service<R, V> service = ServiceFactory.eINSTANCE.createService();
		service.setName(frame.getName());

		@SuppressWarnings("unchecked")
		R request = (R) frame.createEntity();
		service.setRequest(request);

		return service;
	}
	
	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> R prepare(Context context, Class<R> klass) throws ServiceException {
		return prepare(context, klass, null);
	}

	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> R prepare(Context context, Class<R> klass, String tenant) throws ServiceException {
		return prepare(context, context.getFrame(klass), tenant);
	}

	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> R prepare(Context context, Frame<R> frame) throws ServiceException {
		return prepare(context, frame, null);
	}

	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> R prepare(Context context, String frame) throws ServiceException {
		return prepare(context, frame, null);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> R prepare(Context context, String frame, String tenant) throws ServiceException {

		Frame<?> request = (Frame<?>) context.getResourceManager().getFrame(frame, tenant);
		if(request == null)
			throw new ServiceException("Service not found" + frame);
		
		if (!request.getSuperNames().contains(ServiceRequest.class.getSimpleName()))
			throw new ServiceException("Invalid service " + frame);

		return prepare(context, (Frame<R>) request, tenant);
	}

	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> R prepare(Context context, Frame<R> frame, String tenant) throws ServiceException {

		this.checkAuthorization(context, tenant);

		R request = frame.createEntity();
		context.inject(request);

		request.init(context, tenant);

		return request;
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