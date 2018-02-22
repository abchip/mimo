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

import org.abchip.mimo.context.ServiceRegistry;
import org.abchip.mimo.context.ServiceRegistryFactory;
import org.abchip.mimo.language.LanguageParser;
import org.abchip.mimo.language.LanguageParserRegistry;

public class BaseLanguageParserRegistryImpl implements LanguageParserRegistry {
	
	
	private ServiceRegistry<LanguageParser> serviceRegistry;
	
	@Inject
	public BaseLanguageParserRegistryImpl(ServiceRegistryFactory serviceRegistryFactory) {
		 this.serviceRegistry = serviceRegistryFactory.createServiceRegistry(LanguageParser.class);
	}

	@Override
	public LanguageParser lookup(String name) {
		return this.serviceRegistry.lookup(name);
	}

	@Override
	public List<LanguageParser> list() {
		return this.serviceRegistry.list();
	}

	@Override
	public LanguageParser lookupByVendorVersion(String vendor, String version) {
		return this.serviceRegistry.lookupByVendorVersion(vendor, version);
	}

	@Override
	public LanguageParser lookupByPort(int port) {
		return serviceRegistry.lookupByPort(port);
	}

}
