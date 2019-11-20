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

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.entity.EntityEnum;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceConfig;
import org.abchip.mimo.resource.ResourceFactory;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.impl.ResourceProviderImpl;

public class EMFResourceProviderImpl extends ResourceProviderImpl {

	@Inject
	private ContextRoot contextRoot;
	@Inject
	private ResourceManager resourceManager;

	private static ResourceConfig EMF_RESOURCE_CONFIG;

	@PostConstruct
	protected void init() {

		EMF_RESOURCE_CONFIG = ResourceFactory.eINSTANCE.createResourceConfig();
		EMF_RESOURCE_CONFIG.setLockSupport(true);
		EMF_RESOURCE_CONFIG.setOrderSupport(true);

		resourceManager.registerProvider(contextRoot, Frame.class, this);
		resourceManager.registerProvider(contextRoot, EntityEnum.class, this);
	}

	private static boolean isFrame(Frame<?> frame) {
		return frame.getName().equals(Frame.class.getSimpleName());
	}

	private static boolean isEnum(Frame<?> frame) {
		return frame instanceof EMFFrameEnumAdapter;
	}

	@Override
	public <E extends EntityIdentifiable> Resource<E> doGetResource(Context context, Frame<E> frame, String tenant) {
		return internalGetResource(context, frame, tenant);
	}

	@SuppressWarnings("unchecked")
	public static <E extends EntityIdentifiable> Resource<E> internalGetResource(Context context, Frame<E> frame, String tenant) {
		EMFResourceImpl<E> resource = null;

		if (frame == null || isFrame(frame)) {
			resource = new EMFResourceImpl<E>(frame);
			resource.setEntities((Map<String, E>) EMFFrameHelper.getFrames((Resource<Frame<?>>) resource));
		} else if (isEnum(frame)) {
			resource = new EMFResourceImpl<E>(frame);
			resource.setEntities((Map<String, E>) EMFFrameHelper.getEnumerators((Frame<EntityEnum>) frame));
		}
		if (resource != null)
			resource.setResourceConfig(EMF_RESOURCE_CONFIG);

		return resource;
	}
}