/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.Registry;
import org.abchip.mimo.context.RegistryFactory;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.MappingType;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceMapping;
import org.abchip.mimo.resource.ResourceMappingRule;
import org.abchip.mimo.resource.ResourceMappingRuleByFrame;
import org.abchip.mimo.resource.ResourceMappingRuleByPackage;
import org.abchip.mimo.resource.ResourceProvider;
import org.abchip.mimo.resource.ResourceProviderRegistry;

public class BaseResourceProviderRegistryImpl extends BaseResource implements ResourceProviderRegistry {

	@Inject
	private ResourceManager resourceManager;

	private Registry<ResourceProvider> registry;
	private ResourceMapping resourceMapping;

	@Inject
	public BaseResourceProviderRegistryImpl(RegistryFactory serviceRegistryFactory, Application application) {
		this.registry = serviceRegistryFactory.createRegistry(ResourceProvider.class);
		this.resourceMapping = application.getResourceMapping();
	}

	@Override
	public ResourceProvider lookup(String name) {
		return this.registry.lookup(name);
	}

	@Override
	public List<ResourceProvider> list() {
		return this.registry.list();
	}

	@Override
	public ResourceProvider lookupByVendorVersion(String vendor, String version) {
		return this.registry.lookupByVendorVersion(vendor, version);
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

	private ResourceProvider getProvider(Context context, Frame<?> frame) {

		ResourceMappingRuleByFrame ruleByFrame = getRuleByFrame(context, frame);
		ResourceMappingRuleByPackage ruleByPackage = getRuleByPackage(context, frame);

		if (ruleByFrame == null && ruleByPackage == null)
			return null;
		if (ruleByPackage == null)
			return this.lookup(ruleByFrame.getProvider());
		if (ruleByFrame == null)
			return this.lookup(ruleByPackage.getProvider());
		if (ruleByFrame.getFrame().equals(frame.getName()))
			return this.lookup(ruleByFrame.getProvider());

		Frame<?> frameFromRule = resourceManager.getFrame(context, ruleByFrame.getFrame());
		if (frameFromRule.getPackageName().startsWith(ruleByPackage.getPackage()))
			return this.lookup(ruleByFrame.getProvider());
		else
			return this.lookup(ruleByPackage.getProvider());
	}

	private ResourceMappingRuleByFrame getRuleByFrame(Context context, Frame<?> frame) {

		List<Frame<?>> frames = new LinkedList<Frame<?>>();
		frames.add(frame);
		frames.addAll(frame.getSuperFrames());

		ResourceMappingRuleByFrame ruleByFrame = null;
		for (Frame<?> frameItem : frames) {
			for (ResourceMappingRule mappingRule : this.resourceMapping.getRules()) {
				if (!mappingRule.getMappingType().equals(MappingType.BY_FRAME))
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

	private ResourceMappingRuleByPackage getRuleByPackage(Context context, Frame<?> frame) {

		ResourceMappingRuleByPackage ruleByPackage = null;

		for (ResourceMappingRule mappingRule : this.resourceMapping.getRules()) {
			if (!mappingRule.getMappingType().equals(MappingType.BY_PACKAGE))
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