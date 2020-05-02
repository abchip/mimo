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
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.impl.ResourceSetImpl;
import org.eclipse.emf.common.util.URI;

public class BaseResourceSetImpl extends ResourceSetImpl {

	private Context context;
	private MimoResourceSetImpl e4ResourceSet;

	public BaseResourceSetImpl(Context context) {
		super();
		this.context = context;

		e4ResourceSet = new MimoResourceSetImpl(context);
		e4ResourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put("mimo", new MimoResourceFactoryImpl(e4ResourceSet));
	}

	@Override
	public Context getContext() {
		return context;
	}

	@Override
	public <E extends EntityIdentifiable> Resource<E> getResource(String frameId, String tenantId) {

		URI uri = URI.createHierarchicalURI("mimo", tenantId, null, new String[] { frameId }, null, null);
		@SuppressWarnings("unchecked")
		MimoResourceImpl<E> internal = (MimoResourceImpl<E>) e4ResourceSet.getResource(uri, true);

		return internal.getResource();
	}
}