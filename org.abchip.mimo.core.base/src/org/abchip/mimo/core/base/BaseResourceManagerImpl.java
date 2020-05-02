/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import java.util.HashMap;
import java.util.Map;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.LockManager;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceConfig;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceFactory;
import org.abchip.mimo.resource.ResourceListener;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceNotifier;
import org.abchip.mimo.resource.ResourceProviderRegistry;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.resource.SerializationType;

public class BaseResourceManagerImpl implements ResourceManager {

	private Context context;
	private ResourceProviderRegistry resourceProviderRegistry;
	private LockManager lockManager;
	private Map<String, ResourceNotifier<?>> notifiers = null;

	public BaseResourceManagerImpl(Context context) {
		this.context = context;

		this.lockManager = context.get(LockManager.class);
		this.resourceProviderRegistry = context.get(ResourceProviderRegistry.class);

		this.notifiers = new HashMap<String, ResourceNotifier<?>>();
	}

	private Context getContext() {
		return this.context;
	}

	private LockManager getLockManager() {
		return this.lockManager;
	}

	@Override
	public <E extends Entity> ResourceSerializer<E> createResourceSerializer(Class<E> klass, SerializationType serializationType) {
		return createResourceSerializer(klass.getSimpleName(), serializationType);
	}

	@Override
	public <E extends Entity> ResourceSerializer<E> createResourceSerializer(String frameName, SerializationType serializationType) {
		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) this.getFrame(frameName);
		if (frame == null)
			return null;

		return createResourceSerializer(frame, serializationType);
	}

	@Override
	public <E extends Entity> ResourceSerializer<E> createResourceSerializer(Frame<E> frame, SerializationType serializationType) {
		return new BaseResourceSerializerImpl<E>(this.getContext(), frame, serializationType);
	}

	@Override
	public <E extends EntityIdentifiable> Frame<E> getFrame(Class<E> klass) {
		return getFrame(klass, null);
	}

	@Override
	public <E extends EntityIdentifiable> Frame<E> getFrame(Class<E> klass, String tenant) {
		try {
			return this.getResource(klass, tenant).getFrame();
		} catch (ResourceException e) {
			return null;
		}
	}

	@Override
	public <E extends EntityIdentifiable> Frame<E> getFrame(String frame) {
		return getFrame(frame, null);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E extends EntityIdentifiable> Frame<E> getFrame(String frame, String tenant) {
		try {
			return (Frame<E>) this.getResource(frame, tenant).getFrame();
		} catch (ResourceException e) {
			return null;
		}
	}

	@Override
	public <E extends EntityIdentifiable> Resource<E> getResource(Class<E> klass) throws ResourceException {
		return resourceProviderRegistry.getResourceProvider(getContext(), klass).getResource(getContext(), klass);
	}

	@Override
	public <E extends EntityIdentifiable> Resource<E> getResource(Frame<E> frame) throws ResourceException {
		return resourceProviderRegistry.getResourceProvider(getContext(), frame).getResource(getContext(), frame);
	}

	@Override
	public <E extends EntityIdentifiable> Resource<E> getResource(String frame) throws ResourceException {
		return resourceProviderRegistry.getResourceProvider(getContext(), frame).getResource(getContext(), frame);
	}

	@Override
	public <E extends EntityIdentifiable> Resource<E> getResource(Class<E> klass, String tenant) throws ResourceException {
		return resourceProviderRegistry.getResourceProvider(getContext(), klass).getResource(getContext(), klass, tenant);
	}

	@Override
	public <E extends EntityIdentifiable> Resource<E> getResource(Frame<E> frame, String tenant) throws ResourceException {
		return resourceProviderRegistry.getResourceProvider(getContext(), frame).getResource(getContext(), frame, tenant);
	}

	@Override
	public <E extends EntityIdentifiable> Resource<E> getResource(String frame, String tenant) throws ResourceException {
		return resourceProviderRegistry.getResourceProvider(getContext(), frame).getResource(getContext(), frame, tenant);
	}

	@Override
	public final <E extends EntityIdentifiable> ResourceReader<E> getResourceReader(Class<E> klass) throws ResourceException {
		return getResourceReader(klass.getSimpleName());
	}

	@Override
	public final <E extends EntityIdentifiable> ResourceReader<E> getResourceReader(String frameName) throws ResourceException {
		return getResourceReader(frameName, null);
	}

	@Override
	public final <E extends EntityIdentifiable> ResourceReader<E> getResourceReader(Frame<E> frame) throws ResourceException {
		return getResourceReader(frame, null);
	}

	@Override
	public final <E extends EntityIdentifiable> ResourceReader<E> getResourceReader(Class<E> klass, String tenant) throws ResourceException {
		return getResourceReader(klass.getSimpleName(), tenant);
	}

	@Override
	public final <E extends EntityIdentifiable> ResourceReader<E> getResourceReader(Frame<E> frame, String tenant) throws ResourceException {
		return getResourceReader(frame.getName(), tenant);
	}

	@Override
	public final <E extends EntityIdentifiable> ResourceReader<E> getResourceReader(String frameId, String tenant) throws ResourceException {

		Resource<E> resource = getResource(frameId, tenant);

		ResourceReader<E> resourceReader = new BaseResourceReaderImpl<E>(resource);
		prepareListener(resourceReader);

		return resourceReader;
	}

	@Override
	public final <E extends EntityIdentifiable> ResourceWriter<E> getResourceWriter(Class<E> klass) throws ResourceException {
		return getResourceWriter(klass.getSimpleName());
	}

	@Override
	public final <E extends EntityIdentifiable> ResourceWriter<E> getResourceWriter(String frameName) throws ResourceException {
		return getResourceWriter(frameName, null);
	}

	@Override
	public final <E extends EntityIdentifiable> ResourceWriter<E> getResourceWriter(Frame<E> frame) throws ResourceException {
		return getResourceWriter(frame, null);
	}

	@Override
	public final <E extends EntityIdentifiable> ResourceWriter<E> getResourceWriter(Class<E> klass, String tenant) throws ResourceException {
		return getResourceWriter(klass.getSimpleName(), tenant);
	}

	@Override
	public final <E extends EntityIdentifiable> ResourceWriter<E> getResourceWriter(Frame<E> frame, String tenant) throws ResourceException {
		return getResourceWriter(frame.getName(), tenant);
	}

	@Override
	public final <E extends EntityIdentifiable> ResourceWriter<E> getResourceWriter(String frameId, String tenant) throws ResourceException {

		Resource<E> resource = getResource(frameId, tenant);
		ResourceConfig resourceConfig = resource.getResourceConfig();

		LockManager lockManager = null;
		if (resourceConfig != null && resourceConfig.isLockSupport())
			lockManager = this.getLockManager();

		ResourceWriter<E> resourceWriter = new BaseResourceWriterImpl<E>(resource, lockManager);
		prepareListener(resourceWriter);

		return resourceWriter;
	}

	@Override
	public <E extends EntityIdentifiable> void registerListener(Class<E> klass, ResourceListener<E> listener) {
		registerListener(klass.getSimpleName(), listener);
	}

	@Override
	public <E extends EntityIdentifiable> void registerListener(String frameName, ResourceListener<E> listener) {
		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) this.getFrame(frameName);
		if (frame == null)
			return;

		registerListener(frame, listener);
	}

	@Override
	public <E extends EntityIdentifiable> void registerListener(Frame<E> frame, ResourceListener<E> listener) {
		@SuppressWarnings("unchecked")
		ResourceNotifier<E> notifier = (ResourceNotifier<E>) notifiers.get(frame.getName());
		if (notifier == null)
			notifier = prepareNotifier(frame);

		notifier.registerListener(listener);
	}

	@SuppressWarnings("unchecked")
	private <E extends EntityIdentifiable> void prepareListener(ResourceReader<E> resource) {

		ResourceNotifier<E> notifier = (ResourceNotifier<E>) notifiers.get(resource.getFrame().getName());
		if (notifier == null)
			notifier = prepareNotifier(resource.getFrame());

		if (notifier != null && !notifier.getListeners().isEmpty())
			resource.setNotifier(notifier);
	}

	private <E extends EntityIdentifiable> ResourceNotifier<E> prepareNotifier(Frame<E> frame) {

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