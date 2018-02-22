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
import org.abchip.mimo.database.query.QueryWriter;
import org.abchip.mimo.database.query.QueryWriterRegistry;

public class BaseQueryWriterRegistryImpl implements QueryWriterRegistry {
	
	
	private ServiceRegistry<QueryWriter> serviceRegistry;
	
	@Inject
	public BaseQueryWriterRegistryImpl(ServiceRegistryFactory serviceRegistryFactory) {
		 this.serviceRegistry = serviceRegistryFactory.createServiceRegistry(QueryWriter.class);
	}

	@Override
	public QueryWriter lookup(ConnectionConfig connectionConfig) {
		return lookupByVendorVersion(connectionConfig.getVendor(), connectionConfig.getVersion());
	}

	@Override
	public QueryWriter lookup(String name) {
		return this.serviceRegistry.lookup(name);
	}

	@Override
	public List<QueryWriter> list() {
		return this.serviceRegistry.list();
	}

	@Override
	public QueryWriter lookupByVendorVersion(String vendor, String version) {
		return this.serviceRegistry.lookupByVendorVersion(vendor, version);
	}

	@Override
	public QueryWriter lookupByPort(int port) {
		return serviceRegistry.lookupByPort(port);
	}

}
