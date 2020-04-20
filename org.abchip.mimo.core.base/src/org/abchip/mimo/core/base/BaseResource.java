/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

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

	@Inject
	private ContextRoot contextRoot;
	@Inject
	private LockManager lockManager;

	// root ResourceSet
	private ResourceSet resourceSet = null;

	@PostConstruct
	protected void init() {
		this.resourceSet = new MimoResourceSetImpl(contextRoot);
		this.resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put("mimo", new MimoResourceFactoryImpl(resourceSet));
	}

	protected ContextRoot getContextRoot() {
		return this.contextRoot;
	}

	protected LockManager getLockManager() {
		return this.lockManager;
	}

	protected final void checkAuthorization(Context context, String tenant) {
		ContextDescription contextDescription = context.getContextDescription();

		// check authorization
		if (contextDescription.isTenant()) {
			// if (!contextDescription.getTenant().equals(tenant))
			// throw new SecurityException("Permission denied for tenant: " +
			// contextDescription.getTenant());
		}

		// check frame authorization
	}

	protected <E extends Entity> Frame<E> getFrame(Context context, Class<E> klass) {
		return getFrame(context, klass, null);
	}

	@SuppressWarnings("unchecked")
	protected <E extends Entity> Frame<E> getFrame(Context context, Class<E> klass, String tenant) {
		return (Frame<E>) getFrame(context, klass.getSimpleName(), tenant);
	}

	protected Frame<?> getFrame(Context context, String frame) {
		return getFrame(context, frame, null);
	}

	protected Frame<?> getFrame(Context context, String frame, String tenant) {
		try {
			MimoResourceImpl<Frame<?>> internal = getInternalResource(context, Frame.class.getSimpleName(), tenant);
			return internal.getResource().read(frame, null, false);
		} catch (ResourceException e) {
			throw new RuntimeException(e);
		}
	}

	protected <E extends EntityIdentifiable> MimoResourceImpl<E> getInternalResource(Context context, String frame, String tenant) {

		String query = null;
		if (tenant != null)
			query = "tenant=" + tenant;
		else if (context.getContextDescription().isTenant()) {
			query = "tenant=" + context.getContextDescription().getTenant();
		}

		URI uri = URI.createHierarchicalURI("mimo", null, null, new String[] { frame }, query, null);
		@SuppressWarnings("unchecked")
		MimoResourceImpl<E> internal = (MimoResourceImpl<E>) getResourceSet(context).getResource(uri, true);

		return internal;
	}

	private ResourceSet getResourceSet(Context context) {

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
