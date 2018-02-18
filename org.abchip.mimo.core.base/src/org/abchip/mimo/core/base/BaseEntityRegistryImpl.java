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
import org.abchip.mimo.entity.EntityRegistry;


public class BaseEntityRegistryImpl<T> implements EntityRegistry<T> {

	private ContextRoot contextRoot;
	private Class<T> klass;

	public BaseEntityRegistryImpl(ContextRoot contextRoot, Class<T> klass) {
		this.contextRoot = contextRoot;
		this.klass = klass;
	}

	@Override
	public T lookup(String name) {

		String filter = "(org.abchip.mimo.entity.registry.name=" + name + ")";
		return contextRoot.get(klass, filter);		
	}

	@Override
	public T lookupByPort(int port) {

		String filter = "(org.abchip.mimo.application.port=" + port + ")";
		return contextRoot.get(klass, filter);		
	}

	@Override
	public List<T> list() {

		List<T> plugins = contextRoot.getAll(klass);
		return plugins;
	}

	@Override
	public T lookupByVendorVersion(String vendor, String version) {

		String filter = "(&(org.abchip.mimo.entity.registry.vendor=" + vendor + ")" + "(org.abchip.mimo.entity.registry.version=" + version + "))";
		return contextRoot.get(klass, filter);
	}
}
