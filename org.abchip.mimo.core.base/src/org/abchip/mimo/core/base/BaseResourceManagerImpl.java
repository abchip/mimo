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
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.LockManager;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityIdentifiable;
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
		return new BaseResourceSerializerImpl<E>(frame, serializationType);
	}

	@Override
	public <E extends EntityIdentifiable> Frame<E> getFrame(Context context, Class<E> klass) {
		return getFrame(context, klass, null);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E extends EntityIdentifiable> Frame<E> getFrame(Context context, Class<E> klass, String tenant) {
		return (Frame<E>) getFrame(context, klass.getSimpleName(), tenant);
	}

	@Override
	public Frame<?> getFrame(Context context, String frame) {
		return getFrame(context, frame, null);
	}

	@Override
	public Frame<?> getFrame(Context context, String frame, String tenant) {
		MimoResourceImpl<Frame<?>> internal = getInternalResource(context, Frame.class.getSimpleName(), tenant);
		return internal.getResource().read(frame, null, false);
	}

	@Override
	public <E extends EntityIdentifiable> ResourceProvider getResourceProvider(Context context, Class<E> klass) {
		return getResourceProvider(context, klass.getSimpleName());
	}

	@Override
	public <E extends EntityIdentifiable> ResourceProvider getResourceProvider(Context context, String frameName) {

		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) this.getFrame(context, frameName);
		if (frame == null)
			return null;

		return getResourceProvider(context, frame);
	}

	@Override
	public <E extends EntityIdentifiable> ResourceProvider getResourceProvider(Context context, Frame<E> frame) {
		return getProvider(context, frame);
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

	@Override
	public <E extends EntityIdentifiable> void registerProvider(Context context, Class<E> klass, ResourceProvider provider) {
		registerProvider(context, klass.getSimpleName(), provider);
	}

	@Override
	public <E extends EntityIdentifiable> void registerProvider(Context context, Frame<E> frame, ResourceProvider provider) {
		registerProvider(context, frame.getName(), provider);
	}

	@Override
	public <E extends EntityIdentifiable> void registerProvider(Context context, String frameName, ResourceProvider provider) {
		Dictionary<String, String> dictionary = new Hashtable<String, String>();
		dictionary.put(MimoConstants.DOMAIN_NAME, "mimo");
		dictionary.put(MimoConstants.PROVIDER_FRAME, frameName);

		this.getContextRoot().set(ResourceProvider.class.getName(), provider, false, dictionary);
	}

	private ResourceProvider getProvider(Context context, Frame<?> frame) {
		String filter = "(" + MimoConstants.PROVIDER_FRAME + "=" + frame.getName() + ")";

		ResourceProvider resourceProvider = null;

		for (ResourceProvider rp : this.getContextRoot().getAll(ResourceProvider.class, filter)) {
			resourceProvider = rp;
			break;
		}

		if (resourceProvider == null) {
			for (Frame<?> ako : frame.getSuperFrames()) {
				resourceProvider = getProvider(context, ako);
				if (resourceProvider != null)
					break;
			}
		}

		return resourceProvider;
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