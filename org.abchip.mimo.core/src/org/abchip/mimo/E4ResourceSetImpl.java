/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo;

import java.util.Map;
import java.util.WeakHashMap;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.UserProfile;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.impl.ResourceSetImpl;
import org.eclipse.emf.common.util.URI;

public class E4ResourceSetImpl extends ResourceSetImpl {

	private Context context;
	private MimoResourceSetImpl e4ResourceSet;

	public E4ResourceSetImpl(Context context) {
		super();
		this.context = context;

		Map<URI, org.eclipse.emf.ecore.resource.Resource> uriResourceMap = new WeakHashMap<URI, org.eclipse.emf.ecore.resource.Resource>();
		e4ResourceSet = new MimoResourceSetImpl(this, uriResourceMap);
		e4ResourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put("mimo", new MimoResourceFactoryImpl(e4ResourceSet, uriResourceMap));
	}

	@Override
	public Context getContext() {
		return context;
	}

	@Override
	public <E extends EntityIdentifiable> Resource<E> getResource(String frame, String tenant) throws ResourceException {

		// TODO
		if (UserProfile.class.getSimpleName().equals(frame))
			frame = "UserLogin";

		if (tenant == null)
			tenant = context.getTenant();

		// TODO
		if (Frame.class.getSimpleName().equals(frame))
			tenant = null;

		checkAuthorization(tenant);
		
		URI uri = URI.createHierarchicalURI("mimo", tenant, null, new String[] { frame }, null, null);
		@SuppressWarnings("unchecked")
		MimoResourceImpl<E> internal = (MimoResourceImpl<E>) e4ResourceSet.getResource(uri, true);

		return internal.getResource();
	}

	private final void checkAuthorization(String tenantId) throws ResourceException {
		ContextDescription contextDescription = context.getContextDescription();

		// check authorization
		if (contextDescription.isTenant()) {
			if (!contextDescription.getTenant().equals(tenantId))
				throw new ResourceException("Permission denied for tenant: " + contextDescription.getTenant());
		}

		// check frame authorization
	}
}