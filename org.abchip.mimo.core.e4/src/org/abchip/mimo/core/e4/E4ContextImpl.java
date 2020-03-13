/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.e4;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.abchip.mimo.context.AdapterFactory;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.impl.ContextImpl;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public abstract class E4ContextImpl extends ContextImpl {

	private static final String ADAPTER_FACTORIES_NAME = "org.abchip.mimo.context.adapterFactories";

	private static Boolean postConstruct = null;

	private ContextDescription contextDescription;

	public E4ContextImpl(ContextDescription contextDescription) {
		this.contextDescription = contextDescription;
	}

	protected abstract IEclipseContext getEclipseContext();

	protected abstract void removeEclipseContext();

	protected void initializeContext(IEclipseContext eclipseContext) {
		eclipseContext.set(ADAPTER_FACTORIES_NAME, new HashMap<Class<?>, List<AdapterFactory>>());
	}

	@Override
	public <T> void set(Class<T> clazz, T object) {
		getEclipseContext().set(clazz, object);
	}

	@Override
	public void set(String name, Object object) {
		getEclipseContext().set(name, object);
	}

	@Override
	public <T> T make(Class<T> clazz) {
		IEclipseContext eclipseContext = getEclipseContext();
		T object = ContextInjectionFactory.make(clazz, eclipseContext);

		if (isActivePostConstruct())
			ContextInjectionFactory.invoke(object, PostConstruct.class, eclipseContext, object);

		return object;
	}

	@Override
	public void inject(Object consumer) {
		ContextInjectionFactory.inject(consumer, getEclipseContext());
	}

	@Override
	public <T> T get(Class<T> clazz) {
		return getEclipseContext().get(clazz);
	}

	@Override
	public <A extends Annotation> void invoke(Object object, Class<A> qualifier) {
		try {
			ContextInjectionFactory.invoke(object, qualifier, getEclipseContext());
		} catch (Exception e) {
			if (e.getCause() != null)
				throw new RuntimeException(e.getCause());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void close() {

		Map<Class<?>, List<AdapterFactory>> adapterFactories = (Map<Class<?>, List<AdapterFactory>>) getEclipseContext().get(ADAPTER_FACTORIES_NAME);
		adapterFactories.clear();

		getEclipseContext().dispose();

		removeEclipseContext();
	}

	@Override
	public boolean isClosed() {
		return getEclipseContext() == null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Object adaptable, Class<T> adapterType) {

		T adaptee = searchAdapter(getEclipseContext(), adaptable, adapterType);
		if (adaptee != null)
			return adaptee;

		if (adaptee == null && adapterType.isInstance(adaptable))
			adaptee = (T) adaptable;

		return adaptee;
	}

	@SuppressWarnings("unchecked")
	private <T> T searchAdapter(IEclipseContext eclipseContext, Object adaptable, Class<T> adapterType) {

		T adaptee = null;

		Map<Class<?>, List<AdapterFactory>> adapterFactories = (Map<Class<?>, List<AdapterFactory>>) eclipseContext.get(ADAPTER_FACTORIES_NAME);
		if (!adapterFactories.isEmpty()) {
			adaptee = searchAdapter(adaptable, adaptable.getClass().getInterfaces(), adapterFactories, adapterType);

			if (adaptee != null)
				return adaptee;

			Class<?> superClass = adaptable.getClass().getSuperclass();
			if (superClass != Object.class)
				adaptee = searchAdapter(adaptable, superClass.getInterfaces(), adapterFactories, adapterType);
		}

		if (adaptee != null)
			return adaptee;

		// search on parent
		IEclipseContext parentContext = eclipseContext.getParent();
		if (parentContext != null)
			adaptee = searchAdapter(parentContext, adaptable, adapterType);

		return adaptee;
	}

	private <T> T searchAdapter(Object adaptable, Class<?> interfaces[], Map<Class<?>, List<AdapterFactory>> adapterFactories, Class<T> adapterType) {

		T adaptee = null;

		for (Class<?> _interface : interfaces) {

			List<AdapterFactory> factories = adapterFactories.get(_interface);
			if (factories != null)
				// search adaptee on naturally registration order
				for (AdapterFactory adapterFactory : factories) {
					adaptee = adapterFactory.getAdapter(this, adaptable, adapterType);
					if (adaptee != null)
						break;
				}

			if (adaptee != null)
				break;

			adaptee = searchAdapter(adaptable, _interface.getInterfaces(), adapterFactories, adapterType);
		}

		return adaptee;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> void registerAdapterFactory(AdapterFactory factory, Class<T> adapterType) {

		synchronized (adapterType) {

			Map<Class<?>, List<AdapterFactory>> adapterFactories = (Map<Class<?>, List<AdapterFactory>>) getEclipseContext().get(ADAPTER_FACTORIES_NAME);

			List<AdapterFactory> factories = adapterFactories.get(adapterType);
			if (factories == null) {
				factories = new ArrayList<AdapterFactory>();
				adapterFactories.put(adapterType, factories);
			}

			factories.add(factory);
		}
	}

	private boolean isActivePostConstruct() {

		if (postConstruct == null) {

			IEclipseContext eclipseContext = getEclipseContext();
			Dummy dummy = ContextInjectionFactory.make(Dummy.class, eclipseContext);
			postConstruct = !dummy.isLoaded();
		}

		return postConstruct;
	}

	public static class Dummy {

		private boolean loaded = false;

		public Dummy() {

		}

		@PostConstruct
		public void init() {
			this.loaded = true;
		}

		public boolean isLoaded() {
			return loaded;
		}
	}

	@Override
	public ContextDescription getContextDescription() {
		return this.contextDescription;
	}

	@Override
	public URL getResource(Class<?> context, String path) {

		Bundle bundle = FrameworkUtil.getBundle(context);
		if (bundle == null)
			return null;

		URL resource = bundle.getResource(path);

		return resource;
	}

	@Override
	public List<URL> getResources(Class<?> context, String path) throws IOException {

		Bundle bundle = FrameworkUtil.getBundle(context);
		if (bundle == null)
			return null;

		Enumeration<URL> resources = bundle.findEntries(path, null, false);

		return Collections.list(resources);
	}
}