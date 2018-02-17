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
package orb.abchip.mimo.core.e4;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.abchip.mimo.context.AdapterFactory;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.impl.ContextImpl;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

public abstract class E4ContextImpl extends ContextImpl {

	private static final String ADAPTER_FACTORIES_NAME = "org.abchip.mimo.context.adapterFactories";
	private static final String QTEMP = "MIMO-TEMP";

	private static Boolean postConstruct = null;

	private BundleContext bundleContext;
	private ContextDescription contextDescription;
	private String contextID;

	public E4ContextImpl(BundleContext bundleContext, String contextID, ContextDescription contextDescription) {
		this.bundleContext = bundleContext;
		this.contextID = contextID;
		this.contextDescription = contextDescription;
	}

	abstract IEclipseContext getEclipseContext();

	abstract void removeEclipseContext();

	protected BundleContext getBundleContext() {
		return this.bundleContext;
	}
	
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
			if(e.getCause() != null)
				throw new RuntimeException(e.getCause());
		}
	}

	@Override
	public Class<?> loadClass(String className) {

		Class<?> class_ = null;
		for (Bundle bundle : bundleContext.getBundles()) {
			if(bundle.getSymbolicName().contains("mimo.core.base"))
				"".toCharArray();
			try {
				class_ = bundle.loadClass(className);
				break;				
			} catch (ClassNotFoundException e) {
				continue;
			}
		}

		return class_;
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

	@Override
	public Context createChildContext(final String name) {

		ContextDescription childDescription = (ContextDescription) EcoreUtil.copy((EObject)getContextDescription()); 
		childDescription.setName(name);
		
		return createChildContext(contextDescription);
	}
	
	@Override
	public Context createChildContext(ContextDescription contextDescription) {
		return createLocalContext(contextDescription);
	}

	private Context createLocalContext(ContextDescription contextDescription) {

		IEclipseContext eclipseChildContext = getEclipseContext().createChild();

		initializeContext(eclipseChildContext);

		Context contextChild = new E4ContextChildImpl(bundleContext, eclipseChildContext, UUID.randomUUID().toString(), contextDescription);

		return contextChild;
	}

	@SuppressWarnings("unused")
	private Context createRemoteContext(ContextDescription contextDescription) {

		IEclipseContext eclipseChildContext = getEclipseContext().createChild();

		// bind remote service
		try {
			for (ServiceReference<?> serviceReference : bundleContext.getAllServiceReferences(null, null)) {
				if (serviceReference.getProperty(Constants.SERVICE_IMPORTED) == null)
					continue;

				Object object = null;
				String className = ((String[]) serviceReference.getProperty("objectClass"))[0];
				if (eclipseChildContext.containsKey(className))
					continue;
				for (Bundle bundle : bundleContext.getBundles())
					if (className.startsWith(bundle.getSymbolicName())) {

						object = bundle.getBundleContext().getService(serviceReference);
						if (object == null)
							continue;

						eclipseChildContext.set(className, object);
						break;
					}
			}
		} catch (InvalidSyntaxException e) {
			throw new RuntimeException(e);
		}

		initializeContext(eclipseChildContext);

		return new E4ContextChildImpl(bundleContext, eclipseChildContext, UUID.randomUUID().toString(), contextDescription);
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
	public String getID() {
		return this.contextID;
	}

	@Override
	public ContextDescription getContextDescription() {
		return this.contextDescription;
	}

	@Override
	public String resolveAlias(String value) {

		String newValue = null;
		if (value.equalsIgnoreCase(QTEMP))
			newValue = getContextDescription().getResourceTemporary();

		if (newValue != null && !newValue.isEmpty())
			return newValue;
		else
			return value;
	}

	@Override
	public List<String> resolveAliases(List<String> values) {

		List<String> newValues = new ArrayList<String>();

		for (String value : values)
			newValues.add(resolveAlias(value));

		return newValues;
	}
}