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
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.service.Service;
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
		service.setName(request.getClass().getSimpleName());
		service.setRequest(request);

		return service;
	}

	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> Service<R, V> getService(Context context, Class<R> klass) {

		Service<R, V> service = ServiceFactory.eINSTANCE.createService();
		service.setName(klass.getSimpleName());
		service.setRequest(context.make(klass));

		return service;
	}

	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> R prepare(Context context, Class<R> klass) {

		R request = context.getFrame(klass).createEntity();
		request.setContext(context);

		return request;
	}

	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> R execute(Context context, R request) {

		ServiceProvider serviceProvider = this.getProvider(context, request);

		return serviceProvider.execute(context, request);
	}

	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> Future<V> submit(Context context, R request) {

		ServiceProvider serviceProvider = this.getProvider(context, request);

		return serviceProvider.submit(context, request);
	}

	private ServiceProvider getProvider(Context context, ServiceRequest<?> request) {

		Slot slotID = context.getFrame(request.getClass()).getSlotID();
		if (slotID == null)
			return null;

		ServiceProvider serviceProvider = this.serviceProviderRegistry.getServiceProvider(context, slotID.getDomain().getFrame());
		return serviceProvider;
	}
}