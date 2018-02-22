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
import org.abchip.mimo.language.LanguageLinearizer;
import org.abchip.mimo.language.LanguageLinearizerRegistry;

public class BaseLanguageLinearizerRegistryImpl implements LanguageLinearizerRegistry {
	
	private ServiceRegistry<LanguageLinearizer> serviceRegistry;
	
	@Inject
	public BaseLanguageLinearizerRegistryImpl(ServiceRegistryFactory serviceRegistryFactory) {
		 this.serviceRegistry = serviceRegistryFactory.createServiceRegistry(LanguageLinearizer.class);
	}

	@Override
	public LanguageLinearizer lookup(String name) {
		return this.serviceRegistry.lookup(name);
	}

	@Override
	public List<LanguageLinearizer> list() {
		return this.serviceRegistry.list();
	}

	@Override
	public LanguageLinearizer lookupByVendorVersion(String vendor, String version) {
		return this.serviceRegistry.lookupByVendorVersion(vendor, version);
	}

	@Override
	public LanguageLinearizer lookupByPort(int port) {
		return serviceRegistry.lookupByPort(port);
	}
}
