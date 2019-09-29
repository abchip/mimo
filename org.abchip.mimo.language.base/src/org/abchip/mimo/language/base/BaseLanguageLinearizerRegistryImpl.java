/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.language.base;

import java.util.List;

import javax.inject.Inject;

import org.abchip.mimo.context.Registry;
import org.abchip.mimo.context.RegistryFactory;
import org.abchip.mimo.language.LanguageLinearizer;
import org.abchip.mimo.language.LanguageLinearizerRegistry;

public class BaseLanguageLinearizerRegistryImpl implements LanguageLinearizerRegistry {
	
	private Registry<LanguageLinearizer> registry;
	
	@Inject
	public BaseLanguageLinearizerRegistryImpl(RegistryFactory serviceRegistryFactory) {
		 this.registry = serviceRegistryFactory.createRegistry(LanguageLinearizer.class);
	}

	@Override
	public LanguageLinearizer lookup(String name) {
		return this.registry.lookup(name);
	}

	@Override
	public List<LanguageLinearizer> list() {
		return this.registry.list();
	}

	@Override
	public LanguageLinearizer lookupByVendorVersion(String vendor, String version) {
		return this.registry.lookupByVendorVersion(vendor, version);
	}

	@Override
	public LanguageLinearizer lookupByPort(int port) {
		return registry.lookupByPort(port);
	}
}
