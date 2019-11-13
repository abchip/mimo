/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class MimoResourceFactoryImpl extends ResourceFactoryImpl {
	
	public MimoResourceFactoryImpl() {
		super();
	}

	@Override
	public Resource createResource(URI uri) {

		MimoResourceImpl resource = new MimoResourceImpl(uri);
		return resource;
	}
}
