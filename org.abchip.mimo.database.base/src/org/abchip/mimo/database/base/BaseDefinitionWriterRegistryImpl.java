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
import org.abchip.mimo.database.definition.DefinitionWriter;
import org.abchip.mimo.database.definition.DefinitionWriterRegistry;
import org.abchip.mimo.entity.EntityRegistry;
import org.abchip.mimo.entity.EntityRegistryFactory;

public class BaseDefinitionWriterRegistryImpl implements DefinitionWriterRegistry {

	
	private EntityRegistry<DefinitionWriter> entityRegistry;
	
	@Inject
	public BaseDefinitionWriterRegistryImpl(EntityRegistryFactory objectRegistryFactory) {
		 this.entityRegistry = objectRegistryFactory.createEntityRegistry(DefinitionWriter.class);
	}

	@Override
	public DefinitionWriter lookup(ConnectionConfig connectionConfig) {
		return lookupByVendorVersion(connectionConfig.getVendor(), connectionConfig.getVersion());
	}

	@Override
	public DefinitionWriter lookup(String name) {
		return this.entityRegistry.lookup(name);
	}

	@Override
	public List<DefinitionWriter> list() {
		return this.entityRegistry.list();
	}

	@Override
	public DefinitionWriter lookupByVendorVersion(String vendor, String version) {
		return this.entityRegistry.lookupByVendorVersion(vendor, version);
	}

	@Override
	public DefinitionWriter lookupByPort(int port) {
		return entityRegistry.lookupByPort(port);
	}
}