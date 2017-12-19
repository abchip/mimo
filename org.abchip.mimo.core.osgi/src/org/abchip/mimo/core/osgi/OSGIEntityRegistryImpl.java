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
package org.abchip.mimo.core.osgi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.abchip.mimo.entity.EntityRegistry;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

public class OSGIEntityRegistryImpl<T> implements EntityRegistry<T> {

	private BundleContext bundleContext;
	private Class<T> klass;

	public OSGIEntityRegistryImpl(Class<T> klass) {
		this.bundleContext = FrameworkUtil.getBundle(klass).getBundleContext();
		this.klass = klass;
	}

	@Override
	public T lookup(String name) {

		// search plugin
		String serviceFilter = "(org.abchip.mimo.entity.registry.name=" + name + ")";

		Collection<ServiceReference<T>> pluginReferences;
		try {
			pluginReferences = bundleContext.getServiceReferences(klass, serviceFilter);
		} catch (InvalidSyntaxException e) {
			e.printStackTrace();
			return null;
		}

		ServiceReference<T> pluginReference = null;
		for (ServiceReference<T> pReference : pluginReferences) {
			pluginReference = pReference;
			break;
		}

		if (pluginReference == null)
			return null;

		T plugin = bundleContext.getService(pluginReference);

		return plugin;
	}

	@Override
	public T lookupByPort(int port) {

		// search plugin
		String serviceFilter = "(org.abchip.mimo.application.port=" + port + ")";

		Collection<ServiceReference<T>> pluginReferences;
		try {
			pluginReferences = bundleContext.getServiceReferences(klass, serviceFilter);
		} catch (InvalidSyntaxException e) {
			e.printStackTrace();
			return null;
		}

		ServiceReference<T> pluginReference = null;
		for (ServiceReference<T> pReference : pluginReferences) {
			pluginReference = pReference;
			break;
		}

		if (pluginReference == null)
			return null;

		T plugin = bundleContext.getService(pluginReference);

		return plugin;
	}

	@Override
	public List<T> list() {

		List<T> plugins = new ArrayList<T>();

		Collection<ServiceReference<T>> pluginReferences;
		try {
			pluginReferences = bundleContext.getServiceReferences(klass, null);
		} catch (InvalidSyntaxException e) {
			throw new RuntimeException(e);
		}

		// TODO
		for (ServiceReference<T> pluginReference : pluginReferences)
			if (pluginReference != null) {
				T plugin = bundleContext.getService(pluginReference);
				plugins.add(plugin);
			}

		return plugins;
	}

	@Override
	public T lookupByVendorVersion(String vendor, String version) {

		// search plugin
		String serviceFilter = "(&(org.abchip.mimo.entity.registry.vendor=" + vendor + ")" + "(org.abchip.mimo.entity.registry.version=" + version + "))";

		Collection<ServiceReference<T>> pluginReferences;
		try {
			pluginReferences = bundleContext.getServiceReferences(klass, serviceFilter);
		} catch (InvalidSyntaxException e) {
			e.printStackTrace();
			return null;
		}

		ServiceReference<T> pluginReference = null;
		for (ServiceReference<T> pReference : pluginReferences) {
			pluginReference = pReference;
			break;
		}

		if (pluginReference == null)
			return null;

		T plugin = bundleContext.getService(pluginReference);

		return plugin;
	}
}
