/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.EntityEnum;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceConfig;
import org.abchip.mimo.resource.ResourceFactory;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.impl.ResourceProviderImpl;

public class EMFResourceProviderImpl extends ResourceProviderImpl {

	@Inject
	private ResourceManager resourceManager;

	private ResourceReader<Frame<?>> frameReader;

	private ResourceConfig resourceConfig;

	@PostConstruct
	protected void init() {

		this.resourceConfig = ResourceFactory.eINSTANCE.createResourceConfig();
		this.resourceConfig.setLockSupport(true);
		this.resourceConfig.setOrderSupport(true);

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
			resource = new EMFResourceImpl<E>(frame, (Map<String, E>) EMFFrameHelper.getFrames(frameReader));
		} else if (isEnum(frame)) {
			resource = new EMFResourceImpl<E>(frame, (Map<String, E>) EMFFrameHelper.getEnumerators((Frame<EntityEnum>) frame));
		}
		if (resource != null)
			resource.setResourceConfig(this.resourceConfig);

		return resource;
	}
}