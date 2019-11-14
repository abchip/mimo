/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.abchip.mimo.MimoConstants;
import org.abchip.mimo.MimoResourceFactoryImpl;
import org.abchip.mimo.MimoResourceImpl;
import org.abchip.mimo.MimoResourceSetImpl;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.entity.SerializationType;
import org.abchip.mimo.resource.ResourceDriver;
import org.abchip.mimo.resource.ResourceFactory;
import org.abchip.mimo.resource.ResourceListener;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceNotifier;
import org.abchip.mimo.resource.ResourceProvider;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.ResourceWriter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class BaseResourceManagerImpl implements ResourceManager {

	@Inject
	private ContextRoot contextRoot;
	@Inject
	private FrameManager frameManager;

	// root ResourceSet
	private ResourceSet resourceSet = null;

	private ResourceReader<Frame<Entity>> frameReader = null;
	private Map<String, ResourceNotifier<?>> notifiers = null;

	@PostConstruct
	protected void init() {
		this.notifiers = new HashMap<String, ResourceNotifier<?>>();
		this.frameReader = frameManager.getFrameReader(contextRoot);

		this.resourceSet = new MimoResourceSetImpl(contextRoot);
		this.resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put("mimo", new MimoResourceFactoryImpl());
	}

	@Override
	public <E extends EntityNameable> void registerProvider(Class<E> klass, ResourceProvider provider) {
		registerProvider(klass.getSimpleName(), provider);
	}

	@Override
	public <E extends EntityNameable> void registerProvider(String frameName, ResourceProvider provider) {
		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) frameReader.lookup(frameName);
		// TODO remove me
		if (frame == null)
			return;
		registerProvider(frame, provider);
	}

	@Override
	public <E extends EntityNameable> void registerProvider(Frame<E> frame, ResourceProvider provider) {
		Dictionary<String, String> dictionary = new Hashtable<String, String>();
		dictionary.put(MimoConstants.DOMAIN_NAME, "mimo");
		dictionary.put(MimoConstants.PROVIDER_FRAME, frame.getName());

		contextRoot.set(ResourceProvider.class.getName(), provider, false, dictionary);
	}

	@Override
	public <E extends EntityNameable> ResourceProvider getProvider(Class<E> klass) {
		return getProvider(klass.getSimpleName());
	}

	@Override
	public <E extends EntityNameable> ResourceProvider getProvider(String frameName) {
		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) frameReader.lookup(frameName);
		if (frame == null)
			return null;

		return getProvider(frame);
	}

	@Override
	public <E extends EntityNameable> ResourceProvider getProvider(Frame<E> frame) {
		return getResourceProvider(frame);
	}

	private ResourceProvider getResourceProvider(Frame<?> frame) {
		String filter = "(" + MimoConstants.PROVIDER_FRAME + "=" + frame.getName() + ")";

		ResourceProvider resourceProvider = null;

		for (ResourceProvider rp : contextRoot.getAll(ResourceProvider.class, filter)) {
			resourceProvider = rp;
			break;
		}

		if (resourceProvider == null) {
			for (Frame<?> ako : frame.getSuperFrames()) {
				resourceProvider = getResourceProvider(ako);
				if (resourceProvider != null)
					break;
			}
		}

		return resourceProvider;
	}

	@Override
	public <E extends Entity> ResourceSerializer<E> createEntitySerializer(Class<E> klass, SerializationType serializationType) {
		return createEntitySerializer(klass.getSimpleName(), serializationType);
	}

	@Override
	public <E extends Entity> ResourceSerializer<E> createEntitySerializer(String frameName, SerializationType serializationType) {
		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) frameReader.lookup(frameName);
		if (frame == null)
			return null;

		return createEntitySerializer(frame, serializationType);
	}

	@Override
	public <E extends Entity> ResourceSerializer<E> createEntitySerializer(Frame<E> frame, SerializationType serializationType) {
		return new BaseResourceSerializerImpl<E>(frame, serializationType);
	}

	@Override
	public <E extends EntityNameable> void registerListener(Class<E> klass, ResourceListener<E> listener) {
		registerListener(klass.getSimpleName(), listener);
	}

	@Override
	public <E extends EntityNameable> void registerListener(String frameName, ResourceListener<E> listener) {
		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) frameReader.lookup(frameName);
		if (frame == null)
			return;

		registerListener(frame, listener);
	}

	@Override
	public <E extends EntityNameable> void registerListener(Frame<E> frame, ResourceListener<E> listener) {
		@SuppressWarnings("unchecked")
		ResourceNotifier<E> notifier = (ResourceNotifier<E>) notifiers.get(frame.getName());
		if (notifier == null)
			notifier = prepareNotifier(frame);

		notifier.registerListener(listener);
	}

	@SuppressWarnings("unchecked")
	private <E extends EntityNameable> void prepareListener(ResourceReader<E> resource, Frame<E> frame) {

		ResourceNotifier<E> notifier = (ResourceNotifier<E>) notifiers.get(frame.getName());
		if (notifier == null)
			notifier = prepareNotifier(frame);

		resource.setNotifier(notifier);
	}

	private <E extends EntityNameable> ResourceNotifier<E> prepareNotifier(Frame<E> frame) {

		ResourceNotifier<E> notifier = ResourceFactory.eINSTANCE.createResourceNotifier();
		notifiers.put(frame.getName(), notifier);

		for (Frame<?> ako : frame.getSuperFrames()) {

			@SuppressWarnings("unchecked")
			ResourceNotifier<E> typedNotifier = (ResourceNotifier<E>) notifiers.get(ako.getName());
			if (typedNotifier != null) {
				for (ResourceListener<E> resourceListener : typedNotifier.getListeners())
					notifier.registerListener(resourceListener);
			}
		}

		return notifier;
	}

	@Override
	public final <E extends EntityNameable> ResourceReader<E> getEntityReader(ContextProvider contextProvider, Class<E> klass) {
		return getEntityReader(contextProvider, klass.getSimpleName());
	}

	@Override
	public final <E extends EntityNameable> ResourceReader<E> getEntityReader(ContextProvider contextProvider, String frameName) {
		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) frameReader.lookup(frameName);
		return getEntityReader(contextProvider, frame);
	}

	@Override
	public final <E extends EntityNameable> ResourceReader<E> getEntityReader(ContextProvider contextProvider, Frame<E> frame) {
		return getEntityReader(contextProvider, frame, null);
	}

	@Override
	public final <E extends EntityNameable> ResourceReader<E> getEntityReader(ContextProvider contextProvider, Class<E> klass, String tenant) {
		return getEntityReader(contextProvider, klass.getSimpleName(), tenant);
	}

	@Override
	public final <E extends EntityNameable> ResourceReader<E> getEntityReader(ContextProvider contextProvider, String frameName, String tenant) {
		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) frameReader.lookup(frameName);
		return getEntityReader(contextProvider, frame, tenant);
	}

	@Override
	public final <E extends EntityNameable> ResourceReader<E> getEntityReader(ContextProvider contextProvider, Frame<E> frame, String tenant) {

		this.checkAuthorization(contextProvider, tenant);

		ResourceProvider resourceProvider = getProvider(frame);
		if (resourceProvider == null)
			return null;

		ResourceDriver<E> resource = resourceProvider.getResource(contextProvider, frame, tenant);

		URI uri = URI.createHierarchicalURI("mimo", null, null, new String[] { frame.getName() }, null, null);
		MimoResourceImpl internal = (MimoResourceImpl) getResourceSet(contextProvider).getResource(uri, true);

		ResourceReader<E> resourceReader = new BaseResourceReaderImpl<E>(internal, resource);
		if (resourceReader != null)
			prepareListener(resourceReader, frame);

		return resourceReader;
	}

	@Override
	public final <E extends EntityNameable> ResourceWriter<E> getEntityWriter(ContextProvider contextProvider, Class<E> klass) {
		return getEntityWriter(contextProvider, klass.getSimpleName());
	}

	@Override
	public final <E extends EntityNameable> ResourceWriter<E> getEntityWriter(ContextProvider contextProvider, String frameName) {
		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) frameReader.lookup(frameName);
		return getEntityWriter(contextProvider, frame);
	}

	@Override
	public final <E extends EntityNameable> ResourceWriter<E> getEntityWriter(ContextProvider contextProvider, Frame<E> frame) {
		return getEntityWriter(contextProvider, frame, null);
	}

	@Override
	public final <E extends EntityNameable> ResourceWriter<E> getEntityWriter(ContextProvider contextProvider, Class<E> klass, String tenant) {
		return getEntityWriter(contextProvider, klass.getSimpleName(), tenant);
	}

	@Override
	public final <E extends EntityNameable> ResourceWriter<E> getEntityWriter(ContextProvider contextProvider, String frameName, String tenant) {
		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) frameReader.lookup(frameName);
		return getEntityWriter(contextProvider, frame, tenant);
	}

	@Override
	public final <E extends EntityNameable> ResourceWriter<E> getEntityWriter(ContextProvider contextProvider, Frame<E> frame, String tenant) {

		this.checkAuthorization(contextProvider, tenant);

		ResourceProvider resourceProvider = getProvider(frame);
		if (resourceProvider == null)
			return null;

		ResourceDriver<E> resource = resourceProvider.getResource(contextProvider, frame, tenant);

		URI uri = URI.createHierarchicalURI("mimo", null, null, new String[] { frame.getName() }, null, null);
		MimoResourceImpl internal = (MimoResourceImpl) getResourceSet(contextProvider).getResource(uri, true);

		ResourceWriter<E> resourceWriter = new BaseResourceWriterImpl<E>(internal, resource);
		if (resourceWriter != null)
			prepareListener(resourceWriter, frame);

		return resourceWriter;
	}

	private final void checkAuthorization(ContextProvider contextProvider, String tenant) {
		ContextDescription contextDescription = contextProvider.getContextDescription();

		// check authorization
		if (contextDescription.isTenant()) {
			// if (!contextDescription.getTenant().equals(tenant))
			// throw new SecurityException("Permission denied for tenant: " +
			// contextDescription.getTenant());
		}

		// check frame authorization
	}

	private ResourceSet getResourceSet(ContextProvider contextProvider) {

		ResourceSet resourceSet = null;
		if (contextProvider.getContextDescription().isTenant()) {
			resourceSet = contextProvider.getContext().get(ResourceSet.class);
			if (resourceSet == null) {
				synchronized (contextProvider.getContext()) {
					resourceSet = new MimoResourceSetImpl(contextProvider);
					resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put("mimo", new MimoResourceFactoryImpl());
					contextProvider.getContext().set(ResourceSet.class, resourceSet);
				}
			}
		} else {
			return this.resourceSet;
		}

		return resourceSet;
	}
}