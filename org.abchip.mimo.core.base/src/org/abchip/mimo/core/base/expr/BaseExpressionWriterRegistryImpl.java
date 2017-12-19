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
package org.abchip.mimo.core.base.expr;

import java.util.List;

import javax.inject.Inject;

import org.abchip.mimo.entity.EntityRegistry;
import org.abchip.mimo.entity.EntityRegistryFactory;
import org.abchip.mimo.expression.ExpressionWriter;
import org.abchip.mimo.expression.ExpressionWriterRegistry;

public class BaseExpressionWriterRegistryImpl implements ExpressionWriterRegistry {

	private EntityRegistry<ExpressionWriter> objectRegistry;

	@Inject
	public BaseExpressionWriterRegistryImpl(EntityRegistryFactory objectRegistryFactory) {
		this.objectRegistry = objectRegistryFactory.createEntityRegistry(ExpressionWriter.class);
	}

	@Override
	public ExpressionWriter lookup(String name) {
		return this.objectRegistry.lookup(name);
	}

	@Override
	public List<ExpressionWriter> list() {
		return this.objectRegistry.list();
	}

	@Override
	public ExpressionWriter lookupByVendorVersion(String vendor, String version) {
		return this.objectRegistry.lookupByVendorVersion(vendor, version);
	}

	@Override
	public ExpressionWriter lookupByPort(int port) {
		return objectRegistry.lookupByPort(port);
	}
}
