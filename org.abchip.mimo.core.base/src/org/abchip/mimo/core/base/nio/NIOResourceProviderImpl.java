/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base.nio;

import java.nio.file.Paths;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.abchip.mimo.application.ApplicationPaths;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceConfig;
import org.abchip.mimo.resource.ResourceFactory;
import org.abchip.mimo.resource.ResourceSet;
import org.abchip.mimo.resource.impl.ResourceProviderImpl;

public class NIOResourceProviderImpl extends ResourceProviderImpl {

	@Inject
	private ApplicationPaths paths;

	private NIOPathManager pathManager;

	private ResourceConfig resourceConfig;

	@PostConstruct
	protected void init() {

		this.resourceConfig = ResourceFactory.eINSTANCE.createResourceConfig();
		this.resourceConfig.setLockSupport(true);
		this.resourceConfig.setOrderSupport(true);

		this.pathManager = new NIOPathManager(Paths.get(paths.getData(), "nio"));
	}

	@Override
	public <E extends EntityIdentifiable> Resource<E> doGetResource(ResourceSet resourceSet, Context context, Frame<E> frame, String tenant) {

		if (pathManager == null)
			return null;

		Resource<E> resource = new NIOResourcempl<E>(resourceSet, context, frame, tenant, pathManager);
		resource.setResourceConfig(this.resourceConfig);

		return resource;
	}
}