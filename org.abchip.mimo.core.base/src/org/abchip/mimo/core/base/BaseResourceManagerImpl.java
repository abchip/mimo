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
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityFactory;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntityProvider;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.EntitySerializer;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.entity.ResourceListener;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceNotifier;
import org.abchip.mimo.entity.SerializationType;
import org.abchip.mimo.entity.impl.EntityProviderImpl;

public class BaseResourceManagerImpl extends EntityProviderImpl implements ResourceManager {

	@Inject
	private ContextRoot contextRoot;
	@Inject
	private FrameManager frameManager;

	private EntityReader<Frame<Entity>> frameReader = null;
	private Map<String, ResourceNotifier<?>> notifiers = null;

	@PostConstruct
	protected void init() {
		super.init();

		this.notifiers = new HashMap<String, ResourceNotifier<?>>();
		this.frameReader = frameManager.getFrameReader(contextRoot);
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

	@Override
	public <E extends EntityNameable> void registerProvider(Class<E> klass, EntityProvider provider) {
		registerProvider(klass.getSimpleName(), provider);
	}

	@Override
	public <E extends EntityNameable> void registerProvider(String frameName, EntityProvider provider) {
		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) frameReader.lookup(frameName);
		// TODO remove me
		if (frame == null)
			return;
		registerProvider(frame, provider);
	}

	@Override
	public <E extends EntityNameable> void registerProvider(Frame<E> frame, EntityProvider provider) {
		Dictionary<String, String> dictionary = new Hashtable<String, String>();
		dictionary.put(MimoConstants.DOMAIN_NAME, "mimo");
		dictionary.put(MimoConstants.PROVIDER_FRAME, frame.getName());

		contextRoot.set(EntityProvider.class.getName(), provider, false, dictionary);
	}

	@Override
	public <E extends EntityNameable> EntityReader<E> doEntityReader(ContextProvider contextProvider, Frame<E> frame, String resource) {

		this.checkAuthorization(contextProvider, resource);

		EntityProvider resourceProvider = getProvider(frame);
		if (resourceProvider == null)
			return null;

		EntityReader<E> resourceReader = resourceProvider.getEntityReader(contextProvider, frame, resource);
		if (resourceReader != null)
			prepareListener(resourceReader, frame);

		return resourceReader;
	}

	@Override
	public <E extends Entity> EntitySerializer<E> createEntitySerializer(ContextProvider contextProvider, Class<E> klass, SerializationType serializationType) {
		return createEntitySerializer(contextProvider, klass.getSimpleName(), serializationType);
	}

	@Override
	public <E extends Entity> EntitySerializer<E> createEntitySerializer(ContextProvider contextProvider, String frameName, SerializationType serializationType) {
		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) frameReader.lookup(frameName);
		if (frame == null)
			return null;

		return createEntitySerializer(contextProvider, frame, serializationType);
	}

	@Override
	public <E extends Entity> EntitySerializer<E> createEntitySerializer(ContextProvider contextProvider, Frame<E> frame, SerializationType serializationType) {
		return new BaseEntitySerializerImpl<E>(contextProvider, frame, serializationType);
	}

	@Override
	public <E extends EntityNameable> EntityWriter<E> doEntityWriter(ContextProvider contextProvider, Frame<E> frame, String resource) {

		EntityProvider resourceProvider = getProvider(frame);
		if (resourceProvider == null)
			return null;

		EntityWriter<E> resourceWriter = resourceProvider.getEntityWriter(contextProvider, frame, resource);
		if (resourceWriter != null)
			prepareListener(resourceWriter, frame);

		return resourceWriter;
	}

	@SuppressWarnings("unchecked")
	private <E extends EntityNameable> void prepareListener(EntityReader<E> resource, Frame<E> frame) {

		ResourceNotifier<E> notifier = (ResourceNotifier<E>) notifiers.get(frame.getName());
		if (notifier == null)
			notifier = prepareNotifier(frame);

		resource.setNotifier(notifier);
	}

	private <E extends EntityNameable> ResourceNotifier<E> prepareNotifier(Frame<E> frame) {

		ResourceNotifier<E> notifier = EntityFactory.eINSTANCE.createResourceNotifier();
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
	public <E extends EntityNameable> EntityProvider getProvider(Class<E> klass) {
		return getProvider(klass.getSimpleName());
	}

	@Override
	public <E extends EntityNameable> EntityProvider getProvider(String frameName) {
		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) frameReader.lookup(frameName);
		if (frame == null)
			return null;

		return getProvider(frame);
	}

	@Override
	public <E extends EntityNameable> EntityProvider getProvider(Frame<E> frame) {
		return getEntityProvider(frame);
	}

	private EntityProvider getEntityProvider(Frame<?> frame) {
		String filter = "(" + MimoConstants.PROVIDER_FRAME + "=" + frame.getName() + ")";

		EntityProvider entityProvider = null;

		for (EntityProvider ep : contextRoot.getAll(EntityProvider.class, filter)) {
			entityProvider = ep;
			break;
		}

		if (entityProvider == null) {
			for (Frame<?> ako : frame.getSuperFrames()) {
				entityProvider = getEntityProvider(ako);
				if (entityProvider != null)
					break;
			}
		}

		return entityProvider;
	}
	
	private final void checkAuthorization(ContextProvider contextProvider, String resource) {
		ContextDescription contextDescription = contextProvider.getContextDescription();

		// check authorization
		if (contextDescription.isTenant()) {
//			if (!contextDescription.getTenant().equals(resource))
//				throw new SecurityException("Permission denied for tenant: " + contextDescription.getTenant());
		}

		// check frame authorization
	}
}