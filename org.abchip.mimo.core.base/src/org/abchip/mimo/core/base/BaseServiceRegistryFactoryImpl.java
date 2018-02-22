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
import org.abchip.mimo.context.ServiceRegistry;
import org.abchip.mimo.context.ServiceRegistryFactory;

public class BaseServiceRegistryFactoryImpl implements ServiceRegistryFactory {

	@Inject
	private ContextRoot contextRoot;
	
	@Override
	public <T> ServiceRegistry<T> createServiceRegistry(Class<T> klass) {
		return new BaseServiceRegistryImpl<T>(contextRoot, klass);
	}

}
