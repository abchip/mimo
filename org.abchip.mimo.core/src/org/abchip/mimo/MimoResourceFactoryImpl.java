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

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceConfig;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceFactory;
import org.abchip.mimo.resource.ResourceProvider;
import org.abchip.mimo.resource.ResourceProviderRegistry;
import org.abchip.mimo.util.Frames;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class MimoResourceFactoryImpl extends ResourceFactoryImpl {

	private MimoResourceSetImpl resourceSet;
	private ResourceProviderRegistry resourceProviderRegistry;

	public MimoResourceFactoryImpl(MimoResourceSetImpl resourceSet, Map<URI, org.eclipse.emf.ecore.resource.Resource> uriResourceMap) {
		super();
		this.resourceSet = resourceSet;
		this.resourceProviderRegistry = getContext().get(ResourceProviderRegistry.class);

		Context context = resourceSet.getContext();

		ResourceConfig EMF_RESOURCE_CONFIG = ResourceFactory.eINSTANCE.createResourceConfig();
		EMF_RESOURCE_CONFIG.setLockSupport(true);
		EMF_RESOURCE_CONFIG.setOrderSupport(true);

		// frame resource
		E4FrameClassAdapter<Frame<?>> frame = new E4FrameClassAdapter<Frame<?>>(Frames.getFrames(), EntityPackage.eINSTANCE.getFrame());
		E4ResourceImpl<Frame<?>> frameResource = new E4ResourceImpl<Frame<?>>(resourceSet.getResourceSet(), context.getTenant(), frame, (Map<String, Frame<?>>) Frames.getFrames());
		frameResource.setResourceConfig(EMF_RESOURCE_CONFIG);
		URI frameUri = URI.createHierarchicalURI("mimo", context.getTenant(), context.getTenant(), new String[] { Frame.class.getSimpleName() }, null, null);
		uriResourceMap.put(frameUri, new MimoResourceImpl<Frame<?>>(frameResource, resourceSet, frameUri));
	}

	private Context getContext() {
		return resourceSet.getContext();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public org.eclipse.emf.ecore.resource.Resource createResource(URI uri) {

		String frameId = uri.segment(0);
		String tenantId = uri.authority();

		if (Frame.class.getSimpleName().equals(frameId)) {
			"".toString();
		}
		try {

			Frame<EntityIdentifiable> frame = (Frame<EntityIdentifiable>) Frames.getFrames().get(frameId);
			ResourceProvider resourceProvider = resourceProviderRegistry.getResourceProvider(getContext(), frameId);
			Resource<EntityIdentifiable> resource = resourceProvider.createResource(resourceSet.getResourceSet(), frame, tenantId);

			org.eclipse.emf.ecore.resource.Resource.Internal e4resource = new MimoResourceImpl(resource, this.resourceSet, uri);
			InternalEObject internalEObject = (InternalEObject) resource;
			internalEObject.eSetResource(e4resource, null);

			return e4resource;
		} catch (ResourceException e) {
			return null;
		}
	}
}
