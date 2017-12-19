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

import org.abchip.mimo.entity.EntityRegistry;
import org.abchip.mimo.entity.EntityRegistryFactory;
import org.abchip.mimo.entity.EntityProvider;
import org.abchip.mimo.entity.EntityProviderRegistry;

public class BaseEntityProviderRegistryImpl implements EntityProviderRegistry {

	private EntityRegistry<EntityProvider> objectRegistry;

	@Inject
	public BaseEntityProviderRegistryImpl(EntityRegistryFactory objectRegistryFactory) {
		this.objectRegistry = objectRegistryFactory.createEntityRegistry(EntityProvider.class);
	}

	@Override
	public EntityProvider lookup(String name) {
		return this.objectRegistry.lookup(name);
	}

	@Override
	public List<EntityProvider> list() {
		return this.objectRegistry.list();
	}

	@Override
	public EntityProvider lookupByVendorVersion(String vendor, String version) {
		return this.objectRegistry.lookupByVendorVersion(vendor, version);
	}

	@Override
	public EntityProvider lookupByPort(int port) {
		return objectRegistry.lookupByPort(port);
	}
}
