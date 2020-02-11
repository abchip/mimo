/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class MimoResourceFactoryImpl extends ResourceFactoryImpl {

	private ResourceSet resourceSet;

	public MimoResourceFactoryImpl(ResourceSet resourceSet) {
		super();
		this.resourceSet = resourceSet;
	}

	@Override
	public Resource createResource(URI uri) {

		@SuppressWarnings("rawtypes")
		MimoResourceImpl<?> internal = new MimoResourceImpl(resourceSet, uri);

		return internal;
	}
}
