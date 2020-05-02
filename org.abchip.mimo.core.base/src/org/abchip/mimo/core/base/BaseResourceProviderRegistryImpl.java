/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;

import org.abchip.mimo.EMFResourceProviderImpl;
import org.abchip.mimo.MimoConstants;
import org.abchip.mimo.application.Application;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.Registry;
import org.abchip.mimo.context.RegistryFactory;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceMapping;
import org.abchip.mimo.resource.ResourceMappingRule;
import org.abchip.mimo.resource.ResourceMappingRuleByFrame;
import org.abchip.mimo.resource.ResourceMappingRuleByPackage;
import org.abchip.mimo.resource.ResourceMappingType;
import org.abchip.mimo.resource.ResourceProvider;
import org.abchip.mimo.resource.ResourceProviderRegistry;
import org.abchip.mimo.resource.ResourceSet;
import org.abchip.mimo.util.Logs;
import org.osgi.service.log.Logger;

public class BaseResourceProviderRegistryImpl implements ResourceProviderRegistry {

	private static final Logger LOGGER = Logs.getLogger(BaseResourceProviderRegistryImpl.class);

	private Registry<ResourceProvider> registry;
	private ResourceMapping resourceMapping;
	private EMFResourceProviderImpl e4provider;

	@Inject
	public BaseResourceProviderRegistryImpl(Application application, RegistryFactory serviceRegistryFactory) {
		this.registry = serviceRegistryFactory.createRegistry(ResourceProvider.class);
		this.resourceMapping = application.getResourceMapping();

		Dictionary<String, String> dictionary = new Hashtable<String, String>();
		dictionary.put(MimoConstants.REGISTRY_NAME, MimoConstants.REGISTRY_NAME_EMF);
		dictionary.put(MimoConstants.REGISTRY_VENDOR, "ABChip");
		dictionary.put(MimoConstants.REGISTRY_VERSION, "0.2.0");
		dictionary.put(MimoConstants.APPLICATION_NAME, application.getName());
		this.e4provider = new EMFResourceProviderImpl();
		application.getContext().set(ResourceProvider.class.getName(), e4provider, false, dictionary);
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

		// Frame<E> frame =
		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) this.getFrame(context, frameName);
		if (frame == null)
			return null;

		return getResourceProvider(context, frame);
	}

	@Override
	public <E extends EntityIdentifiable> ResourceProvider getResourceProvider(Context context, Frame<E> frame) {

		// Frame / Enumerator
		if (e4provider.isFrame(frame))
			return e4provider;
		else if (e4provider.isEnum(frame))
			return e4provider;

		ResourceMappingRuleByFrame ruleByFrame = getRuleByFrame(frame);
		ResourceMappingRuleByPackage ruleByPackage = getRuleByPackage(frame);

		if (ruleByFrame == null && ruleByPackage == null)
			return null;
		if (ruleByPackage == null)
			return lookup(ruleByFrame.getProvider());
		if (ruleByFrame == null)
			return lookup(ruleByPackage.getProvider());
		if (ruleByFrame.getFrame().equals(frame.getName()))
			return lookup(ruleByFrame.getProvider());

		Frame<?> frameFromRule = this.getFrame(context, ruleByFrame.getFrame());
		if (frameFromRule.getPackageName().startsWith(ruleByPackage.getPackage()))
			return lookup(ruleByFrame.getProvider());
		else
			return lookup(ruleByPackage.getProvider());
	}

	private Frame<?> getFrame(Context context, String frameId) {
		ResourceSet resourceSet = context.get(ResourceSet.class);
		Resource<Frame<?>> frameResource = resourceSet.getResource(Frame.class.getSimpleName(), null);
		try {
			return frameResource.read(frameId, null, false);
		} catch (ResourceException e) {
			LOGGER.error(e.getMessage());
			return null;
		}
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