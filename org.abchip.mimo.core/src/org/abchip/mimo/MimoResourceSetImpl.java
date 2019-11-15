/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo;

import java.util.WeakHashMap;

import org.abchip.mimo.context.ContextProvider;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class MimoResourceSetImpl extends ResourceSetImpl {

	private ContextProvider contextProvider;

	public MimoResourceSetImpl(ContextProvider contextProvider) {
		super();

		this.contextProvider = contextProvider;

		this.setURIResourceMap(new WeakHashMap<URI, Resource>());
	}

	public ContextProvider getContextProvider() {
		return this.contextProvider;
	}

	@Override
	public Resource createResource(URI uri, String contentType) {
		Resource.Factory resourceFactory = getResourceFactoryRegistry().getFactory(uri, contentType);
		if (resourceFactory != null) {
			ResourceImpl resource = (ResourceImpl) resourceFactory.createResource(uri);
			return resource;
		} else {
			return null;
		}
	}
}
