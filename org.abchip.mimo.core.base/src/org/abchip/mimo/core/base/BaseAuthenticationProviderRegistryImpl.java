/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import java.util.List;

import javax.inject.Inject;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.authentication.AuthenticationProvider;
import org.abchip.mimo.authentication.AuthenticationProviderRegistry;
import org.abchip.mimo.context.Registry;
import org.abchip.mimo.context.RegistryFactory;

public class BaseAuthenticationProviderRegistryImpl implements AuthenticationProviderRegistry {

	private Registry<AuthenticationProvider> registry;

	@Inject
	public BaseAuthenticationProviderRegistryImpl(Application application, RegistryFactory serviceRegistryFactory) {
		this.registry = serviceRegistryFactory.createRegistry(AuthenticationProvider.class);
	}

	@Override
	public AuthenticationProvider lookup(String name) {
		return this.registry.lookup(name);
	}

	@Override
	public List<AuthenticationProvider> list() {
		return this.registry.list();
	}

	@Override
	public AuthenticationProvider lookupByVendorVersion(String vendor, String version) {
		return this.registry.lookupByVendorVersion(vendor, version);
	}
}
