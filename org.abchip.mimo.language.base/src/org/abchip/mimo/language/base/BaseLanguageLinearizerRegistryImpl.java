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
import org.abchip.mimo.language.LanguageLinearizer;
import org.abchip.mimo.language.LanguageLinearizerRegistry;

public class BaseLanguageLinearizerRegistryImpl implements LanguageLinearizerRegistry {
	
	
	private EntityRegistry<LanguageLinearizer> entityRegistry;
	
	@Inject
	public BaseLanguageLinearizerRegistryImpl(EntityRegistryFactory objectRegistryFactory) {
		 this.entityRegistry = objectRegistryFactory.createEntityRegistry(LanguageLinearizer.class);
	}

	@Override
	public LanguageLinearizer lookup(String name) {
		return this.entityRegistry.lookup(name);
	}

	@Override
	public List<LanguageLinearizer> list() {
		return this.entityRegistry.list();
	}

	@Override
	public LanguageLinearizer lookupByVendorVersion(String vendor, String version) {
		return this.entityRegistry.lookupByVendorVersion(vendor, version);
	}

	@Override
	public LanguageLinearizer lookupByPort(int port) {
		return entityRegistry.lookupByPort(port);
	}

}
