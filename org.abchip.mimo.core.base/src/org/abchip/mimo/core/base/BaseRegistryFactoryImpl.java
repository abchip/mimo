/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.context.Registry;
import org.abchip.mimo.context.RegistryFactory;

public class BaseRegistryFactoryImpl implements RegistryFactory {

	private ContextRoot contextRoot;

	public BaseRegistryFactoryImpl(ContextRoot contextRoot) {
		this.contextRoot = contextRoot;
	}

	@Override
	public <K> Registry<K> createRegistry(Class<K> klass) {
		return new BaseRegistryImpl<K>(contextRoot, klass);
	}
}
