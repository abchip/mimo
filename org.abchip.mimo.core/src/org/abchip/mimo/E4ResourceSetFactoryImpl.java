/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.Factory;
import org.abchip.mimo.resource.ResourceSet;

public class E4ResourceSetFactoryImpl implements Factory<ResourceSet> {

	@Override
	public ResourceSet create(Context context) {
		return new E4ResourceSetImpl(context);
	}

	@Override
	public Class<ResourceSet> getInterfaceClass() {
		return ResourceSet.class;
	}
}
