/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.e4;

import java.util.Map;

import org.abchip.mimo.EMFFrameEnumAdapter;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityEnum;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceConfig;
import org.abchip.mimo.resource.ResourceFactory;
import org.abchip.mimo.resource.impl.ResourceProviderImpl;
import org.abchip.mimo.util.Frames;

public class E4ResourceProviderImpl extends ResourceProviderImpl {

	private static ResourceConfig EMF_RESOURCE_CONFIG;

	public E4ResourceProviderImpl() {
		EMF_RESOURCE_CONFIG = ResourceFactory.eINSTANCE.createResourceConfig();
		EMF_RESOURCE_CONFIG.setLockSupport(true);
		EMF_RESOURCE_CONFIG.setOrderSupport(true);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E extends EntityIdentifiable> Resource<E> doGetResource(Context context, Frame<E> frame, String tenant) {
		E4ResourceImpl<E> resource = null;

		if (isFrame(frame)) {
			resource = new E4ResourceImpl<E>(context, frame, (Map<String, E>) Frames.getFrames());
		} else if (isEnum(frame)) {
			resource = new E4ResourceImpl<E>(context, frame, (Map<String, E>) Frames.getEnumerators((Frame<EntityEnum>) frame));
		}
		if (resource != null)
			resource.setResourceConfig(EMF_RESOURCE_CONFIG);

		return resource;

	}

	public boolean isFrame(Frame<?> frame) {
		return frame.getName().equals(Frame.class.getSimpleName());
	}

	public boolean isEnum(Frame<?> frame) {
		return frame instanceof EMFFrameEnumAdapter;
	}
}