/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.ResourceHelper;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.impl.EntityProviderImpl;

public class EMFEntityProviderImpl extends EntityProviderImpl {
	
	@Inject
	private ResourceManager resourceManager;
	
	@PostConstruct
	private void init() {
		resourceManager.registerProvider(Frame.class.getSimpleName(), this);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <E extends EntityNameable> EntityReader<E> getEntityReader(ContextProvider contextProvider, Frame<E> frame, String resource) {
		if (isFrame(frame)) {
			return (EntityReader<E>) ResourceHelper.wrapReader(contextProvider, EMFFrameHelper.getFrames());
		} else {
			throw new UnsupportedOperationException();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E extends EntityNameable> EntityReader<E> getEntityReader(ContextProvider contextProvider, Frame<E> frame, List<String> resources) {
		if (isFrame(frame)) {
			return (EntityReader<E>) ResourceHelper.wrapReader(contextProvider, EMFFrameHelper.getFrames());
		} else {
			throw new UnsupportedOperationException();
		}
	}
	
	@Override
	public <E extends EntityNameable> EntityWriter<E> getEntityWriter(ContextProvider contextProvider, Frame<E> frame, String resource) {
		if (isFrame(frame)) {
			throw new UnsupportedOperationException();
		} else {
			throw new UnsupportedOperationException();
		}
	}
	
	private boolean isFrame(Frame<?> frame) {
		return frame.getName().equals(Frame.class.getSimpleName());
	}
}