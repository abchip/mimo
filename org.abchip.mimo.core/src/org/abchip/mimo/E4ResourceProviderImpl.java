/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceSet;
import org.abchip.mimo.resource.impl.ResourceProviderImpl;

public class E4ResourceProviderImpl extends ResourceProviderImpl {

	public E4ResourceProviderImpl() {
	}

	@Override
	public <E extends EntityIdentifiable> Resource<E> doGetResource(ResourceSet resourceSet, String tenant, Frame<E> frame) {
		throw new UnsupportedOperationException();
	}
}