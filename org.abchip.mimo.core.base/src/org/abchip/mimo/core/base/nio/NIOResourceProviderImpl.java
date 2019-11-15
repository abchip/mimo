/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base.nio;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceConfig;
import org.abchip.mimo.resource.ResourceFactory;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.impl.ResourceProviderImpl;

public class NIOResourceProviderImpl extends ResourceProviderImpl {

	@Inject
	private ContextRoot contextRoot;
	@Inject
	private ResourceManager resourceManager;

	private NIOPathManager pathManager;

	private ResourceConfig resourceConfig;

	@PostConstruct
	protected void init() {

		this.resourceConfig = ResourceFactory.eINSTANCE.createResourceConfig();
		this.resourceConfig.setLockSupport(true);
		this.resourceConfig.setOrderSupport(true);

		this.pathManager = new NIOPathManager(contextRoot.getContextDescription().getDataPath());

		resourceManager.registerProvider(EntityNameable.class, this);
	}

	@Override
	public <E extends EntityNameable> Resource<E> doGetResource(ContextProvider contextProvider, Frame<E> frame, String tenant) {

		if(pathManager == null)
			return null;
		
		Resource<E> resource = new NIOResourcempl<E>(contextProvider, frame, tenant, pathManager);
		resource.setResourceConfig(this.resourceConfig);

		return resource;
	}
}