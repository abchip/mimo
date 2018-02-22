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
package org.abchip.mimo.database.base;

import java.util.List;

import javax.inject.Inject;

import org.abchip.mimo.context.ServiceRegistry;
import org.abchip.mimo.context.ServiceRegistryFactory;
import org.abchip.mimo.database.connection.ConnectionConfig;
import org.abchip.mimo.database.query.QueryParser;
import org.abchip.mimo.database.query.QueryParserRegistry;

public class BaseQueryParserRegistryImpl implements QueryParserRegistry {

	
	private ServiceRegistry<QueryParser> serviceRegistry;
	
	@Inject
	public BaseQueryParserRegistryImpl(ServiceRegistryFactory serviceRegistryFactory) {
		 this.serviceRegistry = serviceRegistryFactory.createServiceRegistry(QueryParser.class);
	}

	@Override
	public QueryParser lookup(ConnectionConfig connectionConfig) {
		return lookupByVendorVersion(connectionConfig.getVendor(), connectionConfig.getVersion());
	}

	@Override
	public QueryParser lookup(String name) {
		return this.serviceRegistry.lookup(name);
	}

	@Override
	public List<QueryParser> list() {
		return this.serviceRegistry.list();
	}

	@Override
	public QueryParser lookupByVendorVersion(String vendor, String version) {
		return this.serviceRegistry.lookupByVendorVersion(vendor, version);
	}

	@Override
	public QueryParser lookupByPort(int port) {
		return serviceRegistry.lookupByPort(port);
	}
}
