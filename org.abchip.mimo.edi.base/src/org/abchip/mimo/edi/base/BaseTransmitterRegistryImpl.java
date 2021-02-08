/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.edi.base;

import java.util.List;

import javax.inject.Inject;

import org.abchip.mimo.context.Registry;
import org.abchip.mimo.context.RegistryFactory;
import org.abchip.mimo.edi.Transmitter;
import org.abchip.mimo.edi.TransmitterRegistry;

public class BaseTransmitterRegistryImpl implements TransmitterRegistry {

	private Registry<Transmitter> registry;

	@Inject
	public BaseTransmitterRegistryImpl(RegistryFactory serviceRegistryFactory) {
		this.registry = serviceRegistryFactory.createRegistry(Transmitter.class);
	}

	@Override
	public Transmitter lookup(String name) {
		return this.registry.lookup(name);
	}

	@Override
	public List<Transmitter> list() {
		return this.registry.list();
	}

	@Override
	public Transmitter lookupByVendorVersion(String vendor, String version) {
		return this.registry.lookupByVendorVersion(vendor, version);
	}
}
