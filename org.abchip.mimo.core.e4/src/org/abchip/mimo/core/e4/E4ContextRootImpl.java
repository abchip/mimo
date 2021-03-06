/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.e4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Dictionary;
import java.util.List;
import java.util.UUID;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextHandler;
import org.abchip.mimo.context.ContextRoot;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

public class E4ContextRootImpl extends E4ContextImpl implements ContextRoot {

	BundleContext bundleContext;
	private IEclipseContext eclipseContext;

	public E4ContextRootImpl(BundleContext bundleContext, ContextDescription contextDescription) {
		super(bundleContext, contextDescription);

		this.eclipseContext = EclipseContextFactory.getServiceContext(bundleContext);

		initializeContext(this.eclipseContext);
	}

	@Override
	protected IEclipseContext getEclipseContext() {
		return eclipseContext;
	}

	@Override
	protected void removeEclipseContext() {
		this.eclipseContext = null;
	}

	@Override
	public void set(String name, Object object, boolean remoteExport, Dictionary<String, String> dictionary) {

		if (remoteExport) {
			dictionary.put(E4DistributionConstants.SERVICE_EXPORTED_INTERFACES, E4DistributionConstants.SERVICE_EXPORTED_INTERFACES_WILDCARD);
			dictionary.put(E4DistributionConstants.SERVICE_EXPORTED_CONFIGS, "ecf.generic.server");
			dictionary.put(E4DistributionConstants.SERVICE_EXPORTED_CONTAINER_FACTORY_ARGUMENTS, "ecftcp://localhost:30001/server");
		}
		try {
			getBundleContext().registerService(name, object, dictionary);
		} catch (Exception e) {
			e.toString();
		}
	}

	@Override
	public ContextHandler createChildContext(String contextId) {

		ContextDescription childDescription = (ContextDescription) EcoreUtil.copy((EObject) getContextDescription());
		childDescription.setId(contextId);

		return createChildContext(childDescription);
	}

	private ContextHandler createChildContext(ContextDescription contextDescription) {

		IEclipseContext eclipseChildContext = getEclipseContext().createChild();
		initializeContext(eclipseChildContext);

		if (contextDescription.getId() == null)
			contextDescription.setId(UUID.randomUUID().toString());

		Context contextChild = new E4ContextChildImpl(this.getBundleContext(), contextDescription, eclipseChildContext);

		return new ContextHandler() {

			@Override
			public Context getContext() {
				return contextChild;
			}

			@Override
			public void close() {
				contextChild.dispose();
			}
		};
	}
	

	@Override
	public <T> T get(Class<T> klass, String filter) {

		Collection<ServiceReference<T>> pluginReferences;
		try {
			pluginReferences = getBundleContext().getServiceReferences(klass, filter);
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

		T plugin = getBundleContext().getService(pluginReference);

		return plugin;
	}

	@Override
	public <T> List<T> getAll(Class<T> klass) {
		return getAll(klass, null);
	}

	@Override
	public <T> List<T> getAll(Class<T> klass, String filter) {
		List<T> plugins = new ArrayList<T>();
		Collection<ServiceReference<T>> pluginReferences;
		try {
			pluginReferences = getBundleContext().getServiceReferences(klass, filter);
		} catch (InvalidSyntaxException e) {
			throw new RuntimeException(e);
		}

		// TODO
		for (ServiceReference<T> pluginReference : pluginReferences) {
			if (pluginReference != null) {
				T plugin = getBundleContext().getService(pluginReference);
				plugins.add(plugin);
			}
		}

		return plugins;
	}
}