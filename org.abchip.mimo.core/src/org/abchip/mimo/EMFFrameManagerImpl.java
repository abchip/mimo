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

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.entity.ResourceHelper;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EMFFrameManagerImpl implements FrameManager {
	
	@SuppressWarnings("unchecked")
	@Override
	public <E extends Entity> E createEntity(Frame<E> frame) {

		if (frame instanceof EMFFrameAdapter)
			return (E) EcoreUtil.create(((EMFFrameAdapter<E>) frame).getEClass());
		else
			return null;
	}

	@Override
	public <E extends Entity> EntityReader<Frame<E>> getFrameReader(ContextProvider contextProvider) {
		return _getFrameReader(contextProvider);
	}

	@SuppressWarnings("unchecked")
	private <E extends Entity, F extends Frame<E>> EntityReader<F> _getFrameReader(ContextProvider contextProvider) {
		EntityReader<F> frameReader = (EntityReader<F>) ResourceHelper.wrapReader(contextProvider, EMFFrameHelper.getFrames());
		return frameReader;
	}	
}