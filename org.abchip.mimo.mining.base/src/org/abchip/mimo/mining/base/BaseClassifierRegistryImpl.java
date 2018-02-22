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

import org.abchip.mimo.context.ServiceRegistry;
import org.abchip.mimo.context.ServiceRegistryFactory;
import org.abchip.mimo.mining.classification.Classifier;
import org.abchip.mimo.mining.classification.ClassifierRegistry;

public class BaseClassifierRegistryImpl implements ClassifierRegistry {

	private ServiceRegistry<Classifier> serviceRegistry;
	
	@Inject
	public BaseClassifierRegistryImpl(ServiceRegistryFactory serviceRegistryFactory) {
		 this.serviceRegistry = serviceRegistryFactory.createServiceRegistry(Classifier.class);
	}

	@Override
	public Classifier lookup(String name) {
		return this.serviceRegistry.lookup(name);
	}

	@Override
	public List<Classifier> list() {
		return this.serviceRegistry.list();
	}

	@Override
	public Classifier lookupByVendorVersion(String vendor, String version) {
		return this.serviceRegistry.lookupByVendorVersion(vendor, version);
	}

	@Override
	public Classifier lookupByPort(int port) {
		return serviceRegistry.lookupByPort(port);
	}

}
