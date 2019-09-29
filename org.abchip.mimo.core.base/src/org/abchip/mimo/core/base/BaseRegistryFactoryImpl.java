/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import javax.inject.Inject;

import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.context.Registry;
import org.abchip.mimo.context.RegistryFactory;

public class BaseRegistryFactoryImpl implements RegistryFactory {

	@Inject
	private ContextRoot contextRoot;
	
	@Override
	public <T> Registry<T> createRegistry(Class<T> klass) {
		return new BaseRegistryImpl<T>(contextRoot, klass);
	}

}
