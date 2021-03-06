/**
 *  Copyright (c) 2017, 2021 ABChip and others.
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
import org.abchip.mimo.database.definition.DefinitionWriter;
import org.abchip.mimo.database.definition.DefinitionWriterRegistry;

public class BaseDefinitionWriterRegistryImpl implements DefinitionWriterRegistry {

	
	private Registry<DefinitionWriter> registry;
	
	@Inject
	public BaseDefinitionWriterRegistryImpl(RegistryFactory serviceRegistryFactory) {
		 this.registry = serviceRegistryFactory.createRegistry(DefinitionWriter.class);
	}

	@Override
	public DefinitionWriter lookup(ConnectionConfig connectionConfig) {
		return lookupByVendorVersion(connectionConfig.getVendor(), connectionConfig.getVersion());
	}

	@Override
	public DefinitionWriter lookup(String name) {
		return this.registry.lookup(name);
	}

	@Override
	public List<DefinitionWriter> list() {
		return this.registry.list();
	}

	@Override
	public DefinitionWriter lookupByVendorVersion(String vendor, String version) {
		return this.registry.lookupByVendorVersion(vendor, version);
	}
}
