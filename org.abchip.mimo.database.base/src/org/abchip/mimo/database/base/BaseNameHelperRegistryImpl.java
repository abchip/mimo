/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.base;

import java.util.List;

import javax.inject.Inject;

import org.abchip.mimo.context.Registry;
import org.abchip.mimo.context.RegistryFactory;
import org.abchip.mimo.database.connection.ConnectionConfig;
import org.abchip.mimo.database.query.NameHelper;
import org.abchip.mimo.database.query.NameHelperRegistry;

public class BaseNameHelperRegistryImpl implements NameHelperRegistry {
	
	private Registry<NameHelper> registry;
	
	@Inject
	public BaseNameHelperRegistryImpl(RegistryFactory serviceRegistryFactory) {
		 this.registry = serviceRegistryFactory.createRegistry(NameHelper.class);
	}

	@Override
	public NameHelper lookup(ConnectionConfig connectionConfig) {
		return lookupByVendorVersion(connectionConfig.getVendor(), connectionConfig.getVersion());
	}

	@Override
	public NameHelper lookup(String name) {
		return this.registry.lookup(name);
	}

	@Override
	public List<NameHelper> list() {
		return this.registry.list();
	}

	@Override
	public NameHelper lookupByVendorVersion(String vendor, String version) {
		return this.registry.lookupByVendorVersion(vendor, version);
	}
}
