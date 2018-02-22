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

import java.util.List;

import javax.inject.Inject;

import org.abchip.mimo.context.ServiceRegistry;
import org.abchip.mimo.context.ServiceRegistryFactory;
import org.abchip.mimo.entity.EntityProvider;
import org.abchip.mimo.entity.EntityProviderRegistry;

public class BaseEntityProviderRegistryImpl implements EntityProviderRegistry {

	private ServiceRegistry<EntityProvider> serviceRegistry;

	@Inject
	public BaseEntityProviderRegistryImpl(ServiceRegistryFactory serviceRegistryFactory) {
		this.serviceRegistry = serviceRegistryFactory.createServiceRegistry(EntityProvider.class);
	}

	@Override
	public EntityProvider lookup(String name) {
		return this.serviceRegistry.lookup(name);
	}

	@Override
	public List<EntityProvider> list() {
		return this.serviceRegistry.list();
	}

	@Override
	public EntityProvider lookupByVendorVersion(String vendor, String version) {
		return this.serviceRegistry.lookupByVendorVersion(vendor, version);
	}

	@Override
	public EntityProvider lookupByPort(int port) {
		return serviceRegistry.lookupByPort(port);
	}
}
