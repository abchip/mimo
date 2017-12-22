/**
 * Copyright (c) 2017, 2018 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.mining.base;

import java.util.List;

import javax.inject.Inject;

import org.abchip.mimo.entity.EntityRegistry;
import org.abchip.mimo.entity.EntityRegistryFactory;
import org.abchip.mimo.mining.classification.Classifier;
import org.abchip.mimo.mining.classification.ClassifierRegistry;

public class BaseClassifierRegistryImpl implements ClassifierRegistry {

	private EntityRegistry<Classifier> entityRegistry;
	
	@Inject
	public BaseClassifierRegistryImpl(EntityRegistryFactory objectRegistryFactory) {
		 this.entityRegistry = objectRegistryFactory.createEntityRegistry(Classifier.class);
	}

	@Override
	public Classifier lookup(String name) {
		return this.entityRegistry.lookup(name);
	}

	@Override
	public List<Classifier> list() {
		return this.entityRegistry.list();
	}

	@Override
	public Classifier lookupByVendorVersion(String vendor, String version) {
		return this.entityRegistry.lookupByVendorVersion(vendor, version);
	}

	@Override
	public Classifier lookupByPort(int port) {
		return entityRegistry.lookupByPort(port);
	}

}
