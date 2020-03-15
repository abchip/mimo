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
import org.abchip.mimo.database.definition.DefinitionParser;
import org.abchip.mimo.database.definition.DefinitionParserRegistry;

public class BaseDefinitionParserRegistryImpl implements DefinitionParserRegistry {
	
	private Registry<DefinitionParser> registry;
	
	@Inject
	public BaseDefinitionParserRegistryImpl(RegistryFactory serviceRegistryFactory) {
		 this.registry = serviceRegistryFactory.createRegistry(DefinitionParser.class);
	}

	@Override
	public DefinitionParser lookup(ConnectionConfig connectionConfig) {
		return lookupByVendorVersion(connectionConfig.getVendor(), connectionConfig.getVersion());
	}

	@Override
	public DefinitionParser lookup(String name) {
		return this.registry.lookup(name);
	}

	@Override
	public List<DefinitionParser> list() {
		return this.registry.list();
	}

	@Override
	public DefinitionParser lookupByVendorVersion(String vendor, String version) {
		return this.registry.lookupByVendorVersion(vendor, version);
	}
}
