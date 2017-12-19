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
import org.abchip.mimo.expression.ExpressionParser;
import org.abchip.mimo.expression.ExpressionParserRegistry;

public class BaseExpressionParserRegistryImpl implements ExpressionParserRegistry {

	private EntityRegistry<ExpressionParser> objectRegistry;

	@Inject
	public BaseExpressionParserRegistryImpl(EntityRegistryFactory objectRegistryFactory) {
		this.objectRegistry = objectRegistryFactory.createEntityRegistry(ExpressionParser.class);
	}

	@Override
	public ExpressionParser lookup(String name) {
		return this.objectRegistry.lookup(name);
	}

	@Override
	public List<ExpressionParser> list() {
		return this.objectRegistry.list();
	}

	@Override
	public ExpressionParser lookupByVendorVersion(String vendor, String version) {
		return this.objectRegistry.lookupByVendorVersion(vendor, version);
	}

	@Override
	public ExpressionParser lookupByPort(int port) {
		return objectRegistry.lookupByPort(port);
	}
}
