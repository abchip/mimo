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

import org.abchip.mimo.context.ServiceRegistry;
import org.abchip.mimo.context.ServiceRegistryFactory;
import org.abchip.mimo.expression.ExpressionParser;
import org.abchip.mimo.expression.ExpressionParserRegistry;

public class BaseExpressionParserRegistryImpl implements ExpressionParserRegistry {

	private ServiceRegistry<ExpressionParser> serviceRegistry;

	@Inject
	public BaseExpressionParserRegistryImpl(ServiceRegistryFactory serviceRegistryFactory) {
		this.serviceRegistry = serviceRegistryFactory.createServiceRegistry(ExpressionParser.class);
	}

	@Override
	public ExpressionParser lookup(String name) {
		return this.serviceRegistry.lookup(name);
	}

	@Override
	public List<ExpressionParser> list() {
		return this.serviceRegistry.list();
	}

	@Override
	public ExpressionParser lookupByVendorVersion(String vendor, String version) {
		return this.serviceRegistry.lookupByVendorVersion(vendor, version);
	}

	@Override
	public ExpressionParser lookupByPort(int port) {
		return serviceRegistry.lookupByPort(port);
	}
}
