/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.Factory;
import org.abchip.mimo.resource.ResourceSet;

public class BaseResourceSetFactoryImpl implements Factory<ResourceSet> {

	@Override
	public ResourceSet create(Context context) {
		return new BaseResourceSetImpl(context);
	}

	@Override
	public Class<ResourceSet> getInterfaceClass() {
		return ResourceSet.class;
	}
}
