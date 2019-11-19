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

import org.abchip.mimo.MimoConstants;
import org.abchip.mimo.MimoResourceImpl;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.context.LockManager;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.SerializationType;
import org.abchip.mimo.resource.ResourceConfig;
import org.abchip.mimo.resource.ResourceFactory;
import org.abchip.mimo.resource.ResourceListener;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceNotifier;
import org.abchip.mimo.resource.ResourceProvider;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.ResourceWriter;

public class BaseResourceManagerImpl extends BaseService implements ResourceManager {

	private Map<String, ResourceNotifier<?>> notifiers = null;

	@PostConstruct
	protected void init() {
		super.init();
		this.notifiers = new HashMap<String, ResourceNotifier<?>>();
	}

	@Override
	public <E extends Entity> ResourceSerializer<E> createResourceSerializer(ContextProvider contextProvider, Class<E> klass, SerializationType serializationType) {
		return createResourceSerializer(contextProvider, klass.getSimpleName(), serializationType);
	}

	@Override
	public <E extends Entity> ResourceSerializer<E> createResourceSerializer(ContextProvider contextProvider, String frameName, SerializationType serializationType) {
		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) this.getFrame(contextProvider, frameName);
		if (frame == null)
			return null;

		return createResourceSerializer(contextProvider, frame, serializationType);
	}

	@Override
	public <E extends Entity> ResourceSerializer<E> createResourceSerializer(ContextProvider contextProvider, Frame<E> frame, SerializationType serializationType) {
		return new BaseResourceSerializerImpl<E>(frame, serializationType);
	}

	@Override
	public <E extends EntityNameable> Frame<E> getFrame(ContextProvider contextProvider, Class<E> klass) {
		return getFrame(contextProvider, klass, null);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E extends EntityNameable> Frame<E> getFrame(ContextProvider contextProvider, Class<E> klass, String tenant) {
		return (Frame<E>) getFrame(contextProvider, klass.getSimpleName(), tenant);
	}

	@Override
	public Frame<?> getFrame(ContextProvider contextProvider, String frame) {
		return getFrame(contextProvider, frame, null);
	}

	@Override
	public Frame<?> getFrame(ContextProvider contextProvider, String frame, String tenant) {
		MimoResourceImpl<Frame<?>> internal = getInternalResource(contextProvider, Frame.class.getSimpleName(), tenant);
		return internal.getResource().read(frame, null, false);
	}

	@Override
	public <E extends EntityNameable> ResourceProvider getResourceProvider(ContextProvider contextProvider, Class<E> klass) {
		return getResourceProvider(contextProvider, klass.getSimpleName());
	}

	@Override
	public <E extends EntityNameable> ResourceProvider getResourceProvider(ContextProvider contextProvider, String frameName) {

		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) this.getFrame(contextProvider, frameName);
		if (frame == null)
			return null;

		return getResourceProvider(contextProvider, frame);
	}

	@Override
	public <E extends EntityNameable> ResourceProvider getResourceProvider(ContextProvider contextProvider, Frame<E> frame) {
		return getProvider(contextProvider, frame);
	}

	@Override
	public final <E extends EntityNameable> ResourceReader<E> getResourceReader(ContextProvider contextProvider, Class<E> klass) {
		return getResourceReader(contextProvider, klass.getSimpleName());
	}

	@Override
	public final <E extends EntityNameable> ResourceReader<E> getResourceReader(ContextProvider contextProvider, String frameName) {
		return getResourceReader(contextProvider, frameName, null);
	}

	@Override
	public final <E extends EntityNameable> ResourceReader<E> getResourceReader(ContextProvider contextProvider, Frame<E> frame) {
		return getResourceReader(contextProvider, frame, null);
	}

	@Override
	public final <E extends EntityNameable> ResourceReader<E> getResourceReader(ContextProvider contextProvider, Class<E> klass, String tenant) {
		return getResourceReader(contextProvider, klass.getSimpleName(), tenant);
	}

	@Override
	public final <E extends EntityNameable> ResourceReader<E> getResourceReader(ContextProvider contextProvider, Frame<E> frame, String tenant) {
		return getResourceReader(contextProvider, frame.getName(), tenant);
	}

	@Override
	public final <E extends EntityNameable> ResourceReader<E> getResourceReader(ContextProvider contextProvider, String frameName, String tenant) {

		this.checkAuthorization(contextProvider, tenant);

		MimoResourceImpl<E> internal = getInternalResource(contextProvider, frameName, tenant);

		ResourceReader<E> resourceReader = new BaseResourceReaderImpl<E>(internal);
		if (resourceReader != null)
			prepareListener(resourceReader);

		return resourceReader;
	}

	@Override
	public final <E extends EntityNameable> ResourceWriter<E> getResourceWriter(ContextProvider contextProvider, Class<E> klass) {
		return getResourceWriter(contextProvider, klass.getSimpleName());
	}

	@Override
	public final <E extends EntityNameable> ResourceWriter<E> getResourceWriter(ContextProvider contextProvider, String frameName) {
		return getResourceWriter(contextProvider, frameName, null);
	}

	@Override
	public final <E extends EntityNameable> ResourceWriter<E> getResourceWriter(ContextProvider contextProvider, Frame<E> frame) {
		return getResourceWriter(contextProvider, frame, null);
	}

	@Override
	public final <E extends EntityNameable> ResourceWriter<E> getResourceWriter(ContextProvider contextProvider, Class<E> klass, String tenant) {
		return getResourceWriter(contextProvider, klass.getSimpleName(), tenant);
	}

	@Override
	public final <E extends EntityNameable> ResourceWriter<E> getResourceWriter(ContextProvider contextProvider, Frame<E> frame, String tenant) {
		return getResourceWriter(contextProvider, frame.getName(), tenant);
	}

	@Override
	public final <E extends EntityNameable> ResourceWriter<E> getResourceWriter(ContextProvider contextProvider, String frameName, String tenant) {
		this.checkAuthorization(contextProvider, tenant);

		MimoResourceImpl<E> internal = getInternalResource(contextProvider, frameName, tenant);

		LockManager lockManager = null;
		ResourceConfig resourceConfig = internal.getResource().getResourceConfig();

		if (resourceConfig != null && resourceConfig.isLockSupport())
			lockManager = this.getLockManager();

		ResourceWriter<E> resourceWriter = new BaseResourceWriterImpl<E>(internal, lockManager);
		if (resourceWriter != null)
			prepareListener(resourceWriter);

		return resourceWriter;
	}

	@Override
	public <E extends EntityNameable> void registerListener(ContextProvider contextProvider, Class<E> klass, ResourceListener<E> listener) {
		registerListener(contextProvider, klass.getSimpleName(), listener);
	}

	@Override
	public <E extends EntityNameable> void registerListener(ContextProvider contextProvider, String frameName, ResourceListener<E> listener) {
		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) this.getFrame(contextProvider, frameName);
		if (frame == null)
			return;

		registerListener(contextProvider, frame, listener);
	}

	@Override
	public <E extends EntityNameable> void registerListener(ContextProvider contextProvider, Frame<E> frame, ResourceListener<E> listener) {
		@SuppressWarnings("unchecked")
		ResourceNotifier<E> notifier = (ResourceNotifier<E>) notifiers.get(frame.getName());
		if (notifier == null)
			notifier = prepareNotifier(contextProvider, frame);

		notifier.registerListener(listener);
	}

	@Override
	public <E extends EntityNameable> void registerProvider(ContextProvider contextProvider, Class<E> klass, ResourceProvider provider) {
		registerProvider(contextProvider, klass.getSimpleName(), provider);
	}

	@Override
	public <E extends EntityNameable> void registerProvider(ContextProvider contextProvider, Frame<E> frame, ResourceProvider provider) {
		registerProvider(contextProvider, frame.getName(), provider);
	}

	@Override
	public <E extends EntityNameable> void registerProvider(ContextProvider contextProvider, String frameName, ResourceProvider provider) {
		Dictionary<String, String> dictionary = new Hashtable<String, String>();
		dictionary.put(MimoConstants.DOMAIN_NAME, "mimo");
		dictionary.put(MimoConstants.PROVIDER_FRAME, frameName);

		this.getContextRoot().set(ResourceProvider.class.getName(), provider, false, dictionary);
	}

	private ResourceProvider getProvider(ContextProvider contextProvider, Frame<?> frame) {
		String filter = "(" + MimoConstants.PROVIDER_FRAME + "=" + frame.getName() + ")";

		ResourceProvider resourceProvider = null;

		for (ResourceProvider rp : this.getContextRoot().getAll(ResourceProvider.class, filter)) {
			resourceProvider = rp;
			break;
		}

		if (resourceProvider == null) {
			for (Frame<?> ako : frame.getSuperFrames()) {
				resourceProvider = getProvider(contextProvider, ako);
				if (resourceProvider != null)
					break;
			}
		}

		return resourceProvider;
	}

	@SuppressWarnings("unchecked")
	private <E extends EntityNameable> void prepareListener(ResourceReader<E> resource) {

		ResourceNotifier<E> notifier = (ResourceNotifier<E>) notifiers.get(resource.getFrame().getName());
		if (notifier == null)
			notifier = prepareNotifier(resource.getContextProvider(), resource.getFrame());

		if (notifier != null && !notifier.getListeners().isEmpty())
			resource.setNotifier(notifier);
	}

	private <E extends EntityNameable> ResourceNotifier<E> prepareNotifier(ContextProvider contextProvider, Frame<E> frame) {

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
}