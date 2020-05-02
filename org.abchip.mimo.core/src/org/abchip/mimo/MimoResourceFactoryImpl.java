/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceProvider;
import org.abchip.mimo.resource.ResourceProviderRegistry;
import org.abchip.mimo.util.Frames;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class MimoResourceFactoryImpl extends ResourceFactoryImpl {

	private MimoResourceSetImpl resourceSet;

	public MimoResourceFactoryImpl(MimoResourceSetImpl resourceSet) {
		super();
		this.resourceSet = resourceSet;
	}

	private Context getContext() {
		return resourceSet.getContext();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public org.eclipse.emf.ecore.resource.Resource createResource(URI uri) {

		String frameId = uri.segment(0);
		String tenantId = uri.authority();

		ResourceProvider resourceProvider = getContext().get(ResourceProviderRegistry.class).getResourceProvider(getContext(), frameId);

		Frame<EntityIdentifiable> frame = (Frame<EntityIdentifiable>) Frames.getFrames().get(frameId);
		Resource<EntityIdentifiable> resource = resourceProvider.doGetResource(this.getContext(), frame, tenantId);

		org.eclipse.emf.ecore.resource.Resource.Internal e4resource = new MimoResourceImpl(resource, this.resourceSet, uri);
		InternalEObject internalEObject = (InternalEObject) resource;
		internalEObject.eSetResource(e4resource, null);

		return e4resource;
	}
}
