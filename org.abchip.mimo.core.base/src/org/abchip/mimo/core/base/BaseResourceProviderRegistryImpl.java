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
import java.util.Hashtable;
import java.util.List;

import javax.inject.Inject;

import org.abchip.mimo.MimoConstants;
import org.abchip.mimo.application.Application;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.Registry;
import org.abchip.mimo.context.RegistryFactory;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.ResourceMapping;
import org.abchip.mimo.resource.ResourceMappingRule;
import org.abchip.mimo.resource.ResourceProvider;
import org.abchip.mimo.resource.ResourceProviderRegistry;

public class BaseResourceProviderRegistryImpl extends BaseResource implements ResourceProviderRegistry {

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
	public ResourceProvider lookupByPort(int port) {
		return registry.lookupByPort(port);
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

		ResourceProvider resourceProvider = null;

		for (ResourceMappingRule mappingRule : this.resourceMapping.getRules()) {
			switch (mappingRule.getMappingType()) {
			case BY_FRAME:
				resourceProvider = getProviderByFrame(context, frame);
				break;
			case BY_PACKAGE:
				break;
			}
		}

		return resourceProvider;
	}

	private ResourceProvider getProviderByFrame(Context context, Frame<?> frame) {

		ResourceProvider resourceProvider = null;

		String filter = "(" + MimoConstants.PROVIDER_FRAME + "=" + frame.getName() + ")";

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
}