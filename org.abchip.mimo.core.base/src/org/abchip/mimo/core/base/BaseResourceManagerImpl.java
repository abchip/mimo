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

import javax.annotation.PostConstruct;

import org.abchip.mimo.MimoResourceImpl;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.LockManager;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.ResourceConfig;
import org.abchip.mimo.resource.ResourceFactory;
import org.abchip.mimo.resource.ResourceListener;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceNotifier;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.resource.SerializationType;

public class BaseResourceManagerImpl extends BaseResource implements ResourceManager {

	private Map<String, ResourceNotifier<?>> notifiers = null;

	@PostConstruct
	protected void init() {
		super.init();
		this.notifiers = new HashMap<String, ResourceNotifier<?>>();
	}

	@Override
	public <E extends Entity> ResourceSerializer<E> createResourceSerializer(Context context, Class<E> klass, SerializationType serializationType) {
		return createResourceSerializer(context, klass.getSimpleName(), serializationType);
	}

	@Override
	public <E extends Entity> ResourceSerializer<E> createResourceSerializer(Context context, String frameName, SerializationType serializationType) {
		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) this.getFrame(context, frameName);
		if (frame == null)
			return null;

		return createResourceSerializer(context, frame, serializationType);
	}

	@Override
	public <E extends Entity> ResourceSerializer<E> createResourceSerializer(Context context, Frame<E> frame, SerializationType serializationType) {
		return new BaseResourceSerializerImpl<E>(context, frame, serializationType);
	}

	@Override
	public <E extends EntityIdentifiable> Frame<E> getFrame(Context context, Class<E> klass) {
		return super.getFrame(context, klass);
	}

	@Override
	public <E extends EntityIdentifiable> Frame<E> getFrame(Context context, Class<E> klass, String tenant) {
		return super.getFrame(context, klass, tenant);
	}

	@Override
	public Frame<?> getFrame(Context context, String frame) {
		return super.getFrame(context, frame);
	}

	@Override
	public Frame<?> getFrame(Context context, String frame, String tenant) {
		return super.getFrame(context, frame, tenant);
	}

	@Override
	public final <E extends EntityIdentifiable> ResourceReader<E> getResourceReader(Context context, Class<E> klass) {
		return getResourceReader(context, klass.getSimpleName());
	}

	@Override
	public final <E extends EntityIdentifiable> ResourceReader<E> getResourceReader(Context context, String frameName) {
		return getResourceReader(context, frameName, null);
	}

	@Override
	public final <E extends EntityIdentifiable> ResourceReader<E> getResourceReader(Context context, Frame<E> frame) {
		return getResourceReader(context, frame, null);
	}

	@Override
	public final <E extends EntityIdentifiable> ResourceReader<E> getResourceReader(Context context, Class<E> klass, String tenant) {
		return getResourceReader(context, klass.getSimpleName(), tenant);
	}

	@Override
	public final <E extends EntityIdentifiable> ResourceReader<E> getResourceReader(Context context, Frame<E> frame, String tenant) {
		return getResourceReader(context, frame.getName(), tenant);
	}

	@Override
	public final <E extends EntityIdentifiable> ResourceReader<E> getResourceReader(Context context, String frameName, String tenant) {

		this.checkAuthorization(context, tenant);

		MimoResourceImpl<E> internal = getInternalResource(context, frameName, tenant);

		ResourceReader<E> resourceReader = new BaseResourceReaderImpl<E>(internal);
		if (resourceReader != null)
			prepareListener(resourceReader);

		return resourceReader;
	}

	@Override
	public final <E extends EntityIdentifiable> ResourceWriter<E> getResourceWriter(Context context, Class<E> klass) {
		return getResourceWriter(context, klass.getSimpleName());
	}

	@Override
	public final <E extends EntityIdentifiable> ResourceWriter<E> getResourceWriter(Context context, String frameName) {
		return getResourceWriter(context, frameName, null);
	}

	@Override
	public final <E extends EntityIdentifiable> ResourceWriter<E> getResourceWriter(Context context, Frame<E> frame) {
		return getResourceWriter(context, frame, null);
	}

	@Override
	public final <E extends EntityIdentifiable> ResourceWriter<E> getResourceWriter(Context context, Class<E> klass, String tenant) {
		return getResourceWriter(context, klass.getSimpleName(), tenant);
	}

	@Override
	public final <E extends EntityIdentifiable> ResourceWriter<E> getResourceWriter(Context context, Frame<E> frame, String tenant) {
		return getResourceWriter(context, frame.getName(), tenant);
	}

	@Override
	public final <E extends EntityIdentifiable> ResourceWriter<E> getResourceWriter(Context context, String frameName, String tenant) {
		this.checkAuthorization(context, tenant);

		MimoResourceImpl<E> internal = getInternalResource(context, frameName, tenant);

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
	public <E extends EntityIdentifiable> void registerListener(Context context, Class<E> klass, ResourceListener<E> listener) {
		registerListener(context, klass.getSimpleName(), listener);
	}

	@Override
	public <E extends EntityIdentifiable> void registerListener(Context context, String frameName, ResourceListener<E> listener) {
		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) this.getFrame(context, frameName);
		if (frame == null)
			return;

		registerListener(context, frame, listener);
	}

	@Override
	public <E extends EntityIdentifiable> void registerListener(Context context, Frame<E> frame, ResourceListener<E> listener) {
		@SuppressWarnings("unchecked")
		ResourceNotifier<E> notifier = (ResourceNotifier<E>) notifiers.get(frame.getName());
		if (notifier == null)
			notifier = prepareNotifier(context, frame);

		notifier.registerListener(listener);
	}

	@SuppressWarnings("unchecked")
	private <E extends EntityIdentifiable> void prepareListener(ResourceReader<E> resource) {

		ResourceNotifier<E> notifier = (ResourceNotifier<E>) notifiers.get(resource.getFrame().getName());
		if (notifier == null)
			notifier = prepareNotifier(resource.getContext(), resource.getFrame());

		if (notifier != null && !notifier.getListeners().isEmpty())
			resource.setNotifier(notifier);
	}

	private <E extends EntityIdentifiable> ResourceNotifier<E> prepareNotifier(Context context, Frame<E> frame) {

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