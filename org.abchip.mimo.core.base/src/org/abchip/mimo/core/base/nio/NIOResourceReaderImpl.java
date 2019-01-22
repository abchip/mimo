/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Mattia Rocchi				- Initial API and implementation
 *
 */
package org.abchip.mimo.core.base.nio;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.core.base.BaseEntityIteratorImpl;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Resource;
import org.abchip.mimo.entity.impl.EntityReaderImpl;

public class NIOResourceReaderImpl extends EntityReaderImpl<Resource> {

	protected NIOPathManager pathManager;
	
	public NIOResourceReaderImpl(NIOPathManager pathManager, Frame<Resource> frame, ContextProvider contextProvider) {
		super();
		setContextProvider(contextProvider);
		setFrame(frame);
		this.pathManager = pathManager;		
	}

	@Override
	public boolean exists(String name) {
		return lookup(name) != null;
	}

	@Override
	public EntityIterator<Resource> find(String filter) {
		return new BaseEntityIteratorImpl<Resource>(getFrame(), pathManager.getResources().values().iterator());
	}

	@Override
	public Resource lookup(String name) {
		return pathManager.getResources().get(name);
	}

	public Resource getResource() {
		return pathManager.getResourceRoot();
	}
}
