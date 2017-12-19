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
package org.abchip.mimo.language.base;

import java.util.List;

import javax.inject.Inject;

import org.abchip.mimo.entity.EntityRegistry;
import org.abchip.mimo.entity.EntityRegistryFactory;
import org.abchip.mimo.language.LanguageParser;
import org.abchip.mimo.language.LanguageParserRegistry;

public class BaseLanguageParserRegistryImpl implements LanguageParserRegistry {
	
	
	private EntityRegistry<LanguageParser> entityRegistry;
	
	@Inject
	public BaseLanguageParserRegistryImpl(EntityRegistryFactory objectRegistryFactory) {
		 this.entityRegistry = objectRegistryFactory.createEntityRegistry(LanguageParser.class);
	}

	@Override
	public LanguageParser lookup(String name) {
		return this.entityRegistry.lookup(name);
	}

	@Override
	public List<LanguageParser> list() {
		return this.entityRegistry.list();
	}

	@Override
	public LanguageParser lookupByVendorVersion(String vendor, String version) {
		return this.entityRegistry.lookupByVendorVersion(vendor, version);
	}

	@Override
	public LanguageParser lookupByPort(int port) {
		return entityRegistry.lookupByPort(port);
	}

}
