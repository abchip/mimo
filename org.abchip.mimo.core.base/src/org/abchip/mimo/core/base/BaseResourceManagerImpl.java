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
package org.abchip.mimo.core.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.EntityFactory;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntityProvider;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Resource;
import org.abchip.mimo.entity.ResourceListener;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceNotifier;
import org.abchip.mimo.entity.ResourceScope;
import org.abchip.mimo.entity.ResourceType;
import org.abchip.mimo.entity.impl.EntityProviderImpl;
import org.abchip.mimo.util.Classes;

public class BaseResourceManagerImpl extends EntityProviderImpl implements ResourceManager {

	@Inject
	private Classes classes;

	private final Map<Class<? extends EntityNameable>, ResourceNotifier<?>> notifiers;
	private final Map<Class<? extends EntityNameable>, EntityProvider> providers;

	public BaseResourceManagerImpl() {
		super();

		notifiers = new HashMap<Class<? extends EntityNameable>, ResourceNotifier<?>>();
		providers = new HashMap<Class<? extends EntityNameable>, EntityProvider>();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends EntityNameable> void registerListener(Class<T> klass, ResourceListener<T> listener) {

		ResourceNotifier<T> notifier = (ResourceNotifier<T>) notifiers.get(klass);
		if (notifier == null)
			notifier = prepareNotifier(klass);

		notifier.registerListener(listener);
	}

	@Override
	public <T extends EntityNameable> void registerProvider(Class<T> klass, EntityProvider provider) {
		providers.put(klass, provider);
	}

	@Override
	public <T extends EntityNameable> EntityReader<T> getEntityReader(ContextProvider contextProvider, Class<T> klass, String resource) {

		resource = contextProvider.getContext().resolveAlias(resource);

		EntityProvider resourceProvider = getEntityProvider(klass);
		if(resourceProvider == null)
			throw new RuntimeException("Invalid class provider: "+klass.getName());
		
		EntityReader<T> resourceReader = resourceProvider.getEntityReader(contextProvider, klass, resource);
		if (resourceReader != null)
			prepareListener(resourceReader, klass);

		return resourceReader;
	}

	@Override
	public <T extends EntityNameable> EntityReader<T> getEntityReader(ContextProvider contextProvider, Class<T> klass, ResourceScope scope) {
		return getEntityReader(contextProvider, klass, resources(contextProvider, scope));
	}

	@Override
	public <T extends EntityNameable> EntityReader<T> getEntityReader(ContextProvider contextProvider, Class<T> klass, List<String> resources) {

		resources = contextProvider.getContext().resolveAliases(resources);

		EntityProvider resourceProvider = getEntityProvider(klass);
		if(resourceProvider == null)
			throw new RuntimeException("Invalid class provider: "+klass.getName());

		EntityReader<T> resourceReader = resourceProvider.getEntityReader(contextProvider, klass, resources);
		if (resourceReader != null)
			prepareListener(resourceReader, klass);

		return resourceReader;
	}

	@Override
	public <E extends EntityNameable> EntityReader<E> getEntityReader(ContextProvider contextProvider, Frame<E> frame, ResourceScope scope) {
		return getEntityReader(contextProvider, frame.getEntityClass(), scope);
	}

	@Override
	public <T extends EntityNameable> EntityWriter<T> getEntityWriter(ContextProvider contextProvider, Class<T> klass, ResourceScope scope) {

		String resource = null;
		switch (scope) {
		case ROOT:
			resource = contextProvider.getContext().getContextDescription().getResourceRoot();
			break;
		case ALL:
		case CONTEXT:
		case USER:
			throw new RuntimeException("Unsupported scope " + scope);
		}

		return getEntityWriter(contextProvider, klass, resource);
	}

	@Override
	public <T extends EntityNameable> EntityWriter<T> getEntityWriter(ContextProvider contextProvider, Class<T> klass, String resource) {

		resource = contextProvider.getContext().resolveAlias(resource);

		EntityProvider resourceProvider = getEntityProvider(klass);
		if(resourceProvider == null)
			throw new RuntimeException("Invalid class provider: "+klass.getName());

		EntityWriter<T> resourceWriter = resourceProvider.getEntityWriter(contextProvider, klass, resource);
		if (resourceWriter != null)
			prepareListener(resourceWriter, klass);

		return resourceWriter;
	}

	@Override
	public <E extends EntityNameable> EntityWriter<E> getEntityWriter(ContextProvider contextProvider, Frame<E> frame, ResourceScope scope) {
		return getEntityWriter(contextProvider, frame.getEntityClass(), scope);
	}

	@Override
	public <E extends EntityNameable> EntityProvider getEntityProvider(Class<E> klass) {

		EntityProvider resourceProvider = providers.get(klass);
		if (resourceProvider == null) {
			for (Class<?> _interface : classes.getAllInterfaces(klass)) {
				resourceProvider = providers.get(_interface);
				if (resourceProvider != null)
					break;
			}
		}

		return resourceProvider;
	}

	@SuppressWarnings("unchecked")
	private <T extends EntityNameable> void prepareListener(EntityReader<T> resource, Class<T> klass) {

		ResourceNotifier<T> notifier = (ResourceNotifier<T>) notifiers.get(klass);
		if (notifier == null)
			notifier = prepareNotifier(klass);

		resource.setNotifier(notifier);
	}

	private List<String> resources(ContextProvider contextProvider, ResourceScope scope) {

		ContextDescription contextDescription = contextProvider.getContext().getContextDescription();
		List<String> resources = new ArrayList<>();

		// set scope resources
		switch (scope) {
		case ALL: {
			resources.add(contextDescription.getResourceTemporary());
			EntityIterator<Resource> resourceIterator = getEntityReader(contextProvider, Resource.class, contextDescription.getResourceRoot()).find(null);
			while (resourceIterator.hasNext()) {
				Resource resource = resourceIterator.next();
				if (resource.getResourceType() == ResourceType.TEMPORARY)
					continue;
				resources.add(resource.getName());
			}
			break;
		}
		case CONTEXT:
			resources.add(contextDescription.getResourceTemporary());
			for (String resourceName : contextDescription.getResources())
				resources.add(resourceName);
			break;

		case ROOT:
			resources.add(contextDescription.getResourceRoot());
			break;
		case USER:
			throw new RuntimeException("Unsupported scope " + scope);
		}
		return resources;
	}

	private <T extends EntityNameable> ResourceNotifier<T> prepareNotifier(Class<T> klass) {

		ResourceNotifier<T> notifier = EntityFactory.eINSTANCE.createResourceNotifier();
		notifiers.put(klass, notifier);

		for (Class<?> _interface : classes.getAllInterfaces(klass)) {

			@SuppressWarnings("unchecked")
			ResourceNotifier<T> typedNotifier = (ResourceNotifier<T>) notifiers.get(_interface);
			if (typedNotifier != null) {
				for (ResourceListener<T> resourceListener : typedNotifier.getListeners())
					notifier.registerListener(resourceListener);
			}
		}

		return notifier;
	}
}