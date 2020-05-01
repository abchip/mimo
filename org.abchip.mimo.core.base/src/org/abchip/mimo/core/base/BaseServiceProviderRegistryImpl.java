/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import java.util.List;

import javax.inject.Inject;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.Registry;
import org.abchip.mimo.context.RegistryFactory;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.service.ServiceMapping;
import org.abchip.mimo.service.ServiceMappingRule;
import org.abchip.mimo.service.ServiceMappingRuleByPackage;
import org.abchip.mimo.service.ServiceMappingType;
import org.abchip.mimo.service.ServiceProvider;
import org.abchip.mimo.service.ServiceProviderRegistry;
import org.abchip.mimo.service.ServiceRequest;
import org.abchip.mimo.service.ServiceResponse;

public class BaseServiceProviderRegistryImpl implements ServiceProviderRegistry {

	private Registry<ServiceProvider> registry;
	private ServiceMapping serviceMapping;

	@Inject
	public BaseServiceProviderRegistryImpl(RegistryFactory serviceRegistryFactory, Application application) {
		this.registry = serviceRegistryFactory.createRegistry(ServiceProvider.class);
		this.serviceMapping = application.getServiceMapping();
	}

	@Override
	public ServiceProvider lookup(String name) {
		return this.registry.lookup(name);
	}

	@Override
	public List<ServiceProvider> list() {
		return this.registry.list();
	}

	@Override
	public ServiceProvider lookupByVendorVersion(String vendor, String version) {
		return this.registry.lookupByVendorVersion(vendor, version);
	}

	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> ServiceProvider getServiceProvider(Context context, Class<R> klass) {

		Frame<?> frame = (Frame<?>) context.getResourceManager().getFrame(klass.getSimpleName());
		if (frame == null)
			return null;

		return getProvider(context, frame);
	}

	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> ServiceProvider getServiceProvider(Context context, R request) {
		return getProvider(context, request.isa());
	}

	private ServiceProvider getProvider(Context context, Frame<?> frame) {

		ServiceMappingRuleByPackage ruleByPackage = getRuleByPackage(context, frame);

		if (ruleByPackage == null)
			return null;

		return this.lookup(ruleByPackage.getProvider());
	}

	private ServiceMappingRuleByPackage getRuleByPackage(Context context, Frame<?> frame) {

		ServiceMappingRuleByPackage ruleByPackage = null;

		for (ServiceMappingRule mappingRule : this.serviceMapping.getRules()) {
			if (!mappingRule.getMappingType().equals(ServiceMappingType.BY_PACKAGE))
				continue;

			ServiceMappingRuleByPackage mappingRuleByPackage = (ServiceMappingRuleByPackage) mappingRule;
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