/**
 *  Copyright (c) 2017, 2018 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.core.base;

import javax.inject.Inject;

import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.entity.EntityRegistry;
import org.abchip.mimo.entity.EntityRegistryFactory;

public class BaseEntityRegistryFactoryImpl implements EntityRegistryFactory {

	@Inject
	private ContextRoot contextRoot;
	
	@Override
	public <T> EntityRegistry<T> createEntityRegistry(Class<T> klass) {
		return new BaseEntityRegistryImpl<T>(contextRoot, klass);
	}

}
