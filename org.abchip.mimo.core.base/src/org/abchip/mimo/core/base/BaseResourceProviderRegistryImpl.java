/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import java.util.List;

import javax.inject.Inject;

import org.abchip.mimo.context.Registry;
import org.abchip.mimo.context.RegistryFactory;
import org.abchip.mimo.resource.ResourceProvider;
import org.abchip.mimo.resource.ResourceProviderRegistry;

public class BaseResourceProviderRegistryImpl implements ResourceProviderRegistry {

	private Registry<ResourceProvider> registry;

	@Inject
	public BaseResourceProviderRegistryImpl(RegistryFactory serviceRegistryFactory) {
		this.registry = serviceRegistryFactory.createRegistry(ResourceProvider.class);
	}

	@Override
	public ResourceProvider lookup(String name) {
		return this.registry.lookup(name);
	}

	@Override
	public List<ResourceProvider> list() {
		return this.registry.list();
	}

	@Override
	public ResourceProvider lookupByVendorVersion(String vendor, String version) {
		return this.registry.lookupByVendorVersion(vendor, version);
	}
}