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

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.resource.ResourceHelper;
import org.abchip.mimo.resource.ResourceReader;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.InternalEObject;

public class EMFFrameManagerImpl implements FrameManager {

	@Override
	public ResourceReader<Frame<?>> getFrameReader(ContextProvider contextProvider) {
		return _getFrameReader(contextProvider);
	}

	@SuppressWarnings("unchecked")
	private <E extends EntityNameable> ResourceReader<E> _getFrameReader(ContextProvider contextProvider) {

		Frame<E> frame = (Frame<E>) this.getFrame(Frame.class);
		ResourceReader<Frame<?>> frameReader = (ResourceReader<Frame<?>>) ResourceHelper.wrapReader(contextProvider, frame, (Map<String, E>) EMFFrameHelper.getFrames(this));
		return (ResourceReader<E>) frameReader;
	}

	@Override
	public Frame<?> getFrame(String name) {
		return EMFFrameHelper.getFrames(this).get(name);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E extends Entity> Frame<E> getFrame(Class<E> klass) {
		return (Frame<E>) EMFFrameHelper.getFrames(this).get(klass.getSimpleName());
	}

	@Override
	public <E extends EntityNameable> E createProxy(Class<E> klass, String name) {
		return createProxy(getFrame(klass), name);
	}

	@Override
	public <E extends EntityNameable> E createProxy(Frame<E> frame, String name) {

		E proxy = frame.createEntity();

		InternalEObject internalEObject = (InternalEObject) proxy;
		URI uri = URI.createHierarchicalURI("mimo", null, null, new String[] { frame.getName() }, null, name);
		internalEObject.eSetProxyURI(uri);

		Entity entity = (Entity) internalEObject;
		Frame<?> domainFrame = entity.isa();
		for (String key : domainFrame.getKeys()) {
			domainFrame.setValue(entity, key, name.toString());
			break;
		}

		return proxy;
	}
}