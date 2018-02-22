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
package org.abchip.mimo.core.base;

import java.util.List;

import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.context.ServiceRegistry;


public class BaseServiceRegistryImpl<S> implements ServiceRegistry<S> {

	private ContextRoot contextRoot;
	private Class<S> klass;

	public BaseServiceRegistryImpl(ContextRoot contextRoot, Class<S> klass) {
		this.contextRoot = contextRoot;
		this.klass = klass;
	}

	@Override
	public S lookup(String name) {

		String filter = "(org.abchip.mimo.service.registry.name=" + name + ")";
		return contextRoot.get(klass, filter);		
	}

	@Override
	public S lookupByPort(int port) {

		String filter = "(org.abchip.mimo.application.port=" + port + ")";
		return contextRoot.get(klass, filter);		
	}

	@Override
	public List<S> list() {

		List<S> plugins = contextRoot.getAll(klass);
		return plugins;
	}

	@Override
	public S lookupByVendorVersion(String vendor, String version) {

		String filter = "(&(org.abchip.mimo.service.registry.vendor=" + vendor + ")" + "(org.abchip.mimo.service.registry.version=" + version + "))";
		return contextRoot.get(klass, filter);
	}
}
