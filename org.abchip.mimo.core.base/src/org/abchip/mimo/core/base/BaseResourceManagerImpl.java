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
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.abchip.mimo.MimoResourceImpl;
import org.abchip.mimo.application.Application;
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
import org.abchip.mimo.resource.ResourceMapping;
import org.abchip.mimo.resource.ResourceMappingRule;
import org.abchip.mimo.resource.ResourceMappingRuleByFrame;
import org.abchip.mimo.resource.ResourceMappingRuleByPackage;
import org.abchip.mimo.resource.ResourceMappingType;
import org.abchip.mimo.resource.ResourceNotifier;
import org.abchip.mimo.resource.ResourceProvider;
import org.abchip.mimo.resource.ResourceProviderRegistry;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.resource.SerializationType;

public class BaseResourceManagerImpl extends BaseResource implements ResourceManager {

	private ResourceProviderRegistry resourceProviderRegistry;
	private ResourceMapping resourceMapping;
	private Map<String, ResourceNotifier<?>> notifiers = null;

	public BaseResourceManagerImpl(Context context) {
		super(context);
		this.resourceProviderRegistry = context.get(ResourceProviderRegistry.class);
		this.resourceMapping = context.get(Application.class).getResourceMapping();
		this.notifiers = new HashMap<String, ResourceNotifier<?>>();
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
	public <E extends Entity> Frame<E> getFrame(Class<E> klass) {
		return super.getFrame(klass);
	}

	@Override
	public <E extends Entity> Frame<E> getFrame(Class<E> klass, String tenant) {
		return super.getFrame(klass, tenant);
	}

	@Override
	public Frame<?> getFrame(String frame) {
		return super.getFrame(frame);
	}

	@Override
	public Frame<?> getFrame(String frame, String tenant) {
		return super.getFrame(frame, tenant);
	}

	@Override
	public <E extends EntityIdentifiable> Resource<E> getResource(Class<E> klass) {
		return this.getResourceProvider(klass).getResource(getContext(), klass);
	}

	@Override
	public <E extends EntityIdentifiable> Resource<E> getResource(Frame<E> frame) {
		return this.getResourceProvider(frame).getResource(getContext(), frame);
	}

	@Override
	public <E extends EntityIdentifiable> Resource<E> getResource(String frame) {
		return this.getResourceProvider(frame).getResource(getContext(), frame);
	}

	@Override
	public <E extends EntityIdentifiable> Resource<E> getResource(Class<E> klass, String tenant) {
		return this.getResourceProvider(klass).getResource(getContext(), klass, tenant);
	}

	@Override
	public <E extends EntityIdentifiable> Resource<E> getResource(Frame<E> frame, String tenant) {
		return this.getResourceProvider(frame).getResource(getContext(), frame, tenant);
	}

	@Override
	public <E extends EntityIdentifiable> Resource<E> getResource(String frame, String tenant) {
		return this.getResourceProvider(frame).getResource(getContext(), frame, tenant);
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
	public final <E extends EntityIdentifiable> ResourceReader<E> getResourceReader(String frameName, String tenant) throws ResourceException {

		this.checkAuthorization(tenant);

		MimoResourceImpl<E> internal = getInternalResource(frameName, tenant);

		ResourceReader<E> resourceReader = new BaseResourceReaderImpl<E>(internal);
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
	public final <E extends EntityIdentifiable> ResourceWriter<E> getResourceWriter(String frameName, String tenant) throws ResourceException {
		this.checkAuthorization(tenant);

		MimoResourceImpl<E> internal = getInternalResource(frameName, tenant);

		LockManager lockManager = null;
		ResourceConfig resourceConfig = internal.getResource().getResourceConfig();

		if (resourceConfig != null && resourceConfig.isLockSupport())
			lockManager = this.getLockManager();

		ResourceWriter<E> resourceWriter = new BaseResourceWriterImpl<E>(internal, lockManager);
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

	@Override
	public <E extends EntityIdentifiable> ResourceProvider getResourceProvider(Class<E> klass) {
		return getResourceProvider(klass.getSimpleName());
	}

	@Override
	public <E extends EntityIdentifiable> ResourceProvider getResourceProvider(String frameName) {

		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) this.getFrame(frameName);
		if (frame == null)
			return null;

		return getResourceProvider(frame);
	}

	@Override
	public <E extends EntityIdentifiable> ResourceProvider getResourceProvider(Frame<E> frame) {
		return getProvider(frame);
	}

	private ResourceProvider getProvider(Frame<?> frame) {

		ResourceMappingRuleByFrame ruleByFrame = getRuleByFrame(frame);
		ResourceMappingRuleByPackage ruleByPackage = getRuleByPackage(frame);

		if (ruleByFrame == null && ruleByPackage == null)
			return null;
		if (ruleByPackage == null)
			return resourceProviderRegistry.lookup(ruleByFrame.getProvider());
		if (ruleByFrame == null)
			return resourceProviderRegistry.lookup(ruleByPackage.getProvider());
		if (ruleByFrame.getFrame().equals(frame.getName()))
			return resourceProviderRegistry.lookup(ruleByFrame.getProvider());

		Frame<?> frameFromRule = this.getFrame(ruleByFrame.getFrame());
		if (frameFromRule.getPackageName().startsWith(ruleByPackage.getPackage()))
			return resourceProviderRegistry.lookup(ruleByFrame.getProvider());
		else
			return resourceProviderRegistry.lookup(ruleByPackage.getProvider());
	}

	private ResourceMappingRuleByFrame getRuleByFrame(Frame<?> frame) {

		List<Frame<?>> frames = new LinkedList<Frame<?>>();
		frames.add(frame);
		frames.addAll(frame.getSuperFrames());

		ResourceMappingRuleByFrame ruleByFrame = null;
		for (Frame<?> frameItem : frames) {
			for (ResourceMappingRule mappingRule : this.resourceMapping.getRules()) {
				if (!mappingRule.getMappingType().equals(ResourceMappingType.BY_FRAME))
					continue;

				ResourceMappingRuleByFrame mappingRuleByFrame = (ResourceMappingRuleByFrame) mappingRule;
				if (mappingRuleByFrame.getFrame().equals(frameItem.getName())) {
					ruleByFrame = mappingRuleByFrame;
					break;
				}
			}
			if (ruleByFrame != null)
				break;
		}

		return ruleByFrame;
	}

	private ResourceMappingRuleByPackage getRuleByPackage(Frame<?> frame) {

		ResourceMappingRuleByPackage ruleByPackage = null;

		for (ResourceMappingRule mappingRule : this.resourceMapping.getRules()) {
			if (!mappingRule.getMappingType().equals(ResourceMappingType.BY_PACKAGE))
				continue;

			ResourceMappingRuleByPackage mappingRuleByPackage = (ResourceMappingRuleByPackage) mappingRule;
			if (frame.getPackageName().startsWith(mappingRuleByPackage.getPackage())) {
				// deeper package
				if (ruleByPackage != null && ruleByPackage.getPackage().length() > mappingRuleByPackage.getPackage().length())
					continue;

				ruleByPackage = mappingRuleByPackage;
			}
		}

		return ruleByPackage;
	}
}