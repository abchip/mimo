/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.entity.ResourceHelper;
import org.abchip.mimo.entity.impl.EntityProviderImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EMFFrameManagerImpl implements FrameManager {

	@SuppressWarnings("unchecked")
	@Override
	public <E extends Entity> E createEntity(Frame<E> frame) {

		if (frame instanceof EMFFrameClassAdapter)
			return (E) EcoreUtil.create(((EMFFrameClassAdapter<E>) frame).getEClass());
		else
			return null;
	}

	@Override	public <E extends Entity> E createEntity(Class<E> klass) {
		return createEntity(getFrame(klass));
	}

	@Override
	public <E extends Entity> EntityReader<Frame<E>> getFrameReader(ContextProvider contextProvider) {
		return _getFrameReader(contextProvider);
	}

	@SuppressWarnings("unchecked")
	private <E extends Entity, F extends Frame<E>> EntityReader<F> _getFrameReader(ContextProvider contextProvider) {
		EntityReader<F> frameReader = (EntityReader<F>) ResourceHelper.wrapReader(contextProvider, EntityProviderImpl.RESOURCE_MASTER, EMFFrameHelper.getFrames());
		return frameReader;
	}

	@Override
	public Frame<?> getFrame(String name) {
		return EMFFrameHelper.getFrames().get(name);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E extends Entity> Frame<E> getFrame(Class<E> klass) {
		return (Frame<E>) EMFFrameHelper.getFrames().get(klass.getSimpleName());
	}

	@SuppressWarnings("unused")
	@Override
	public <E extends Entity> void checkFrameAutorization(ContextProvider contextProvider, Frame<E> frame, String resource) {
		// TODO Auto-generated method stub
		if (false)
			throw new SecurityException("Permission denied for frame: " + frame.getName());
	}

	@Override
	public <E extends EntityNameable> E createProxy(Class<E> klass, String name) {

		E proxy = this.createEntity(klass);
		InternalEObject eValue = (InternalEObject) proxy;
		eValue.eSetProxyURI(org.eclipse.emf.common.util.URI.createURI("#" + name));

		if (eValue instanceof EntityNameable) {
			Entity entity = (Entity) eValue;
			Frame<?> domainFrame = entity.isa();
			for (String key : domainFrame.getKeys()) {
				domainFrame.setValue(entity, key, name.toString());
				break;
			}
		}
		
		return proxy;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E extends EntityNameable> E resolveProxy(E entity) {
		
		if(entity.isProxy()) {
			InternalEObject eValue = (InternalEObject) entity;
			entity = (E) EcoreUtil.resolve(eValue, (ResourceSet)null);
		}
		
		return entity;
	}
}