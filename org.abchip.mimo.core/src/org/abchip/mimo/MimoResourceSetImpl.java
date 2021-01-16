/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo;

import java.util.Map;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceSet;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class MimoResourceSetImpl extends ResourceSetImpl {

	private ResourceSet resourceSet;

	public MimoResourceSetImpl(ResourceSet resourceSet, Map<URI, Resource> uriResourceMap) {
		super();

		this.resourceSet = resourceSet;
		this.setURIResourceMap(uriResourceMap);
	}

	public ResourceSet getResourceSet() {
		return this.resourceSet;
	}
	
	public Context getContext() {
		return this.resourceSet.getContext();
	}

	@Override
	public Resource createResource(URI uri, String contentType) {
		Resource.Factory resourceFactory = getResourceFactoryRegistry().getFactory(uri, contentType);
		if (resourceFactory != null) {
			Resource resource = resourceFactory.createResource(uri);
			return resource;
		} else {
			return null;
		}
	}
}
