/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import org.abchip.mimo.MimoResourceImpl;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.resource.ResourceReader;

public class BaseFrameManagerImpl extends BaseService implements FrameManager {

	@Override
	public <E extends EntityNameable> E createProxy(ContextProvider contextProvider, Class<E> klass, String name) {
		return this.getFrame(contextProvider, klass).createProxy(name);
	}

	@Override
	public <E extends EntityNameable> Frame<E> getFrame(ContextProvider contextProvider, Class<E> klass) {
		return getFrame(contextProvider, klass, null);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E extends EntityNameable> Frame<E> getFrame(ContextProvider contextProvider, Class<E> klass, String tenant) {
		return (Frame<E>) getFrame(contextProvider, klass.getSimpleName(), tenant);
	}

	@Override
	public Frame<?> getFrame(ContextProvider contextProvider, String frame) {
		return getFrame(contextProvider, frame, null);
	}

	@Override
	public Frame<?> getFrame(ContextProvider contextProvider, String frame, String tenant) {
		return getFrameReader(contextProvider, tenant).lookup(frame);
	}

	private <E extends Frame<?>> ResourceReader<E> getFrameReader(ContextProvider contextProvider, String tenant) {

		this.checkAuthorization(contextProvider, tenant);

		MimoResourceImpl<E> internal = getInternalResource(contextProvider, Frame.class.getSimpleName(), tenant);

		ResourceReader<E> resourceReader = new BaseResourceReaderImpl<E>(internal);
		if (resourceReader != null)
			prepareListener(resourceReader);

		return resourceReader;

	}
}