/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.EntityEnum;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceConfig;
import org.abchip.mimo.resource.ResourceFactory;
import org.abchip.mimo.resource.ResourceHelper;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.impl.ResourceProviderImpl;

public class EMFResourceProviderImpl extends ResourceProviderImpl {

	@Inject
	private ResourceManager resourceManager;
	@Inject
	private FrameManager frameManager;

	private ResourceConfig resourceConfig;

	@PostConstruct
	protected void init() {

		this.resourceConfig = ResourceFactory.eINSTANCE.createResourceConfig();
		this.resourceConfig.setLockSupport(false);
		
		resourceManager.registerProvider(Frame.class, this);
		resourceManager.registerProvider(EntityEnum.class, this);
	}

	private boolean isFrame(Frame<?> frame) {
		return frame.getName().equals(Frame.class.getSimpleName());
	}

	private boolean isEnum(Frame<?> frame) {
		return frame instanceof EMFFrameEnumAdapter;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E extends EntityNameable> Resource<E> doGetResource(ContextProvider contextProvider, Frame<E> frame, String tenant) {
		
		Resource<E> resource = null;
		
		if (isFrame(frame)) {
			resource = (Resource<E>) ResourceHelper.wrapResource(EMFFrameHelper.getFrames(frameManager));
		} else if (isEnum(frame)) {
			resource = (Resource<E>) ResourceHelper.wrapResource(EMFFrameHelper.getEnumerators((Frame<EntityEnum>) frame));
		} 
		
		resource.setResourceConfig(this.resourceConfig);
		
		return resource;
	}
}