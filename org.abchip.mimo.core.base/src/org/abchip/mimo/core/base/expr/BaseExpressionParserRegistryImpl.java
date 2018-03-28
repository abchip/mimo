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

import org.abchip.mimo.context.Registry;
import org.abchip.mimo.context.RegistryFactory;
import org.abchip.mimo.expression.ExpressionParser;
import org.abchip.mimo.expression.ExpressionParserRegistry;

public class BaseExpressionParserRegistryImpl implements ExpressionParserRegistry {

	private Registry<ExpressionParser> registry;

	@Inject
	public BaseExpressionParserRegistryImpl(RegistryFactory serviceRegistryFactory) {
		this.registry = serviceRegistryFactory.createRegistry(ExpressionParser.class);
	}

	@Override
	public ExpressionParser lookup(String name) {
		return this.registry.lookup(name);
	}

	@Override
	public List<ExpressionParser> list() {
		return this.registry.list();
	}

	@Override
	public ExpressionParser lookupByVendorVersion(String vendor, String version) {
		return this.registry.lookupByVendorVersion(vendor, version);
	}

	@Override
	public ExpressionParser lookupByPort(int port) {
		return registry.lookupByPort(port);
	}
}
