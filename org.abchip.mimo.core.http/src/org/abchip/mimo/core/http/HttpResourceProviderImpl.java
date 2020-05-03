/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.http;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceConfig;
import org.abchip.mimo.resource.ResourceFactory;
import org.abchip.mimo.resource.ResourceSet;
import org.abchip.mimo.resource.impl.ResourceProviderImpl;

public class HttpResourceProviderImpl extends ResourceProviderImpl {

	private ResourceConfig resourceConfig;

	public HttpResourceProviderImpl() {
		this.resourceConfig = ResourceFactory.eINSTANCE.createResourceConfig();
		this.resourceConfig.setLockSupport(false);
		this.resourceConfig.setOrderSupport(false);
	}

	@Override
	public <E extends EntityIdentifiable> Resource<E> doGetResource(ResourceSet resourceSet, String tenant, Frame<E> frame) {

		Resource<E> resource = new HttpResourceImpl<E>(resourceSet, tenant, frame);
		resource.setResourceConfig(this.resourceConfig);

		return resource;
	}
}