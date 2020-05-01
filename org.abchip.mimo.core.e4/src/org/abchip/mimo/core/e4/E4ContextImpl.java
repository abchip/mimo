/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.e4;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.abchip.mimo.application.Service;
import org.abchip.mimo.context.AdapterFactory;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextEvent;
import org.abchip.mimo.context.ContextEventType;
import org.abchip.mimo.context.ContextListener;
import org.abchip.mimo.context.ContextStatus;
import org.abchip.mimo.context.Factory;
import org.abchip.mimo.context.impl.ContextImpl;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.service.ServiceManager;
import org.abchip.mimo.util.Logs;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.Logger;

public abstract class E4ContextImpl extends ContextImpl {

	private static final String ADAPTER_FACTORIES_NAME = "org.abchip.mimo.context.adapterFactories";
	private static final Logger LOGGER = Logs.getLogger(E4ContextImpl.class);

	private BundleContext bundleContext;
	private ContextDescription contextDescription;
	private List<ContextListener> listeners;

	public E4ContextImpl(BundleContext bundleContext, ContextDescription contextDescription) {
		this.bundleContext = bundleContext;
		this.contextDescription = contextDescription;
		this.listeners = new ArrayList<ContextListener>();
		this.contextDescription.setStatus(ContextStatus.ACTIVE);
	}

	protected abstract IEclipseContext getEclipseContext();

	protected abstract void removeEclipseContext();

	protected BundleContext getBundleContext() {
		return this.bundleContext;
	}

	protected void initializeContext(IEclipseContext eclipseContext) {
		eclipseContext.set(ADAPTER_FACTORIES_NAME, new HashMap<Class<?>, List<AdapterFactory>>());
	}

	@Override
	public void registerListener(ContextListener listener) {
		this.listeners.add(listener);
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
		return object;
	}

	@Override
	public void inject(Object consumer) {
		ContextInjectionFactory.inject(consumer, getEclipseContext());
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public <T> T get(Class<T> clazz) {

		T object = null;

		Service annotation = clazz.getAnnotation(Service.class);
		if (annotation == null)
			object = getEclipseContext().get(clazz);
		else {
			switch (annotation.scope()) {
			case CONTEXT:
				object = getEclipseContext().getLocal(clazz);
				break;
			}
		}

		if (object != null)
			return object;

		"".toString();
		try {
			for (ServiceReference<Factory> serviceReference : getBundleContext().getServiceReferences(Factory.class, null)) {
				Factory<T> factory = getBundleContext().getService(serviceReference);
				if (!factory.getInterfaceClass().equals(clazz))
					continue;

				object = factory.create(this);
				this.set(factory.getInterfaceClass(), object);
				break;
			}
		} catch (Exception e) {
			LOGGER.warn(e.getMessage());
			return null;
		}

		return object;
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
	public void dispose() {

		Map<Class<?>, List<AdapterFactory>> adapterFactories = (Map<Class<?>, List<AdapterFactory>>) getEclipseContext().get(ADAPTER_FACTORIES_NAME);
		adapterFactories.clear();

		for (ContextListener listener : this.listeners) {
			try {
				listener.handleEvent(new ContextEvent() {

					@Override
					public ContextEventType getEventType() {
						return ContextEventType.CLOSING;
					}

					@Override
					public Context getContext() {
						return E4ContextImpl.this;
					}
				});
			} catch (Exception e) {
				LOGGER.warn(e.getMessage());
			}
		}

		this.listeners = null;

		this.contextDescription.setStatus(ContextStatus.CLOSED);

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

	@Override
	public ContextDescription getContextDescription() {
		return this.contextDescription;
	}

	@Override
	public ResourceManager getResourceManager() {
		return this.get(ResourceManager.class);
	}

	@Override
	public ServiceManager getServiceManager() {
		return this.get(ServiceManager.class);
	}

	@Override
	public <E extends Entity> Frame<E> getFrame(Class<E> klass) {
		return this.getResourceManager().getFrame(klass);
	}

	public <E extends EntityIdentifiable> E createProxy(Class<E> klass, String id) {
		return createProxy(klass, id, null);
	}

	@Override
	public <E extends EntityIdentifiable> E createProxy(Class<E> klass, String id, String tenant) {
		try {
			Resource<E> resource = this.getResourceManager().getResourceReader(klass, tenant).getResource();
			return resource.createProxy(id);
		} catch (ResourceException e) {
			return null;
		}
	}

	public <E extends EntityIdentifiable> E createProxy(Frame<E> frame, String id) {
		return createProxy(frame, id, null);
	}

	@Override
	public <E extends EntityIdentifiable> E createProxy(Frame<E> frame, String id, String tenant) {
		try {
			Resource<E> resource = this.getResourceManager().getResourceReader(frame, tenant).getResource();
			return resource.createProxy(id);
		} catch (ResourceException e) {
			return null;
		}
	}
}