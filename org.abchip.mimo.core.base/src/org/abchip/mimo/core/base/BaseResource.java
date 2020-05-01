/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import org.abchip.mimo.MimoResourceFactoryImpl;
import org.abchip.mimo.MimoResourceImpl;
import org.abchip.mimo.MimoResourceSetImpl;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.context.LockManager;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.ResourceException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class BaseResource {

	private Context context;
	private LockManager lockManager;
	private ResourceSet resourceSet = null;

	public BaseResource(Context context) {
		this.context = context;
		this.lockManager = context.get(LockManager.class);

		this.resourceSet = new MimoResourceSetImpl(context);
		this.resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put("mimo", new MimoResourceFactoryImpl(resourceSet));
	}

	protected Context getContext() {
		return this.context;
	}

	protected LockManager getLockManager() {
		return this.lockManager;
	}

	protected final void checkAuthorization(String tenant) throws ResourceException {
		ContextDescription contextDescription = context.getContextDescription();

		// check authorization
		if (contextDescription.isTenant()) {
			// if (!contextDescription.getTenant().equals(tenant))
			// throw new SecurityException("Permission denied for tenant: " +
			// contextDescription.getTenant());
		}

		// check frame authorization
	}

	protected <E extends Entity> Frame<E> getFrame(Class<E> klass) {
		return getFrame(klass, null);
	}

	@SuppressWarnings("unchecked")
	protected <E extends Entity> Frame<E> getFrame(Class<E> klass, String tenant) {
		return (Frame<E>) getFrame(klass.getSimpleName(), tenant);
	}

	protected Frame<?> getFrame(String frame) {
		return getFrame(frame, null);
	}

	protected Frame<?> getFrame(String frame, String tenant) {
		try {
			MimoResourceImpl<Frame<?>> internal = getInternalResource(Frame.class.getSimpleName(), tenant);
			return internal.getResource().read(frame, null, false);
		} catch (ResourceException e) {
			throw new RuntimeException(e);
		}
	}

	protected <E extends EntityIdentifiable> MimoResourceImpl<E> getInternalResource(String frame, String tenant) {

		if (tenant == null)
			tenant = context.getTenant();

		URI uri = URI.createHierarchicalURI("mimo", tenant, null, new String[] { frame }, null, null);
		@SuppressWarnings("unchecked")
		MimoResourceImpl<E> internal = (MimoResourceImpl<E>) getResourceSet().getResource(uri, true);

		return internal;
	}

	private ResourceSet getResourceSet() {

		if (context instanceof ContextRoot)
			return resourceSet;

		ResourceSet resourceSet = context.get(ResourceSet.class);
		if (resourceSet == null) {
			synchronized (context) {
				resourceSet = new MimoResourceSetImpl(context);
				resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put("mimo", new MimoResourceFactoryImpl(resourceSet));
				context.set(ResourceSet.class, resourceSet);
			}
		}

		return resourceSet;
	}
}
