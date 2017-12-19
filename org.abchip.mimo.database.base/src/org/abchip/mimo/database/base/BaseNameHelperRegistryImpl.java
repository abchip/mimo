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
package org.abchip.mimo.database.base;

import java.util.List;

import javax.inject.Inject;

import org.abchip.mimo.database.connection.ConnectionConfig;
import org.abchip.mimo.database.query.NameHelper;
import org.abchip.mimo.database.query.NameHelperRegistry;
import org.abchip.mimo.entity.EntityRegistry;
import org.abchip.mimo.entity.EntityRegistryFactory;

public class BaseNameHelperRegistryImpl implements NameHelperRegistry {
	
	private EntityRegistry<NameHelper> entityRegistry;
	
	@Inject
	public BaseNameHelperRegistryImpl(EntityRegistryFactory objectRegistryFactory) {
		 this.entityRegistry = objectRegistryFactory.createEntityRegistry(NameHelper.class);
	}

	@Override
	public NameHelper lookup(ConnectionConfig connectionConfig) {
		return lookupByVendorVersion(connectionConfig.getVendor(), connectionConfig.getVersion());
	}

	@Override
	public NameHelper lookup(String name) {
		return this.entityRegistry.lookup(name);
	}

	@Override
	public List<NameHelper> list() {
		return this.entityRegistry.list();
	}

	@Override
	public NameHelper lookupByVendorVersion(String vendor, String version) {
		return this.entityRegistry.lookupByVendorVersion(vendor, version);
	}

	@Override
	public NameHelper lookupByPort(int port) {
		return entityRegistry.lookupByPort(port);
	}
}
