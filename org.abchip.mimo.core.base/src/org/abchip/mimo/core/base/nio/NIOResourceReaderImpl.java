/**
 * Copyright (c) 2017, 2018 ABChip and others.
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
import org.abchip.mimo.entity.EntityProvider;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Resource;
import org.abchip.mimo.entity.impl.EntityReaderImpl;

public class NIOResourceReaderImpl extends EntityReaderImpl<Resource> {

	protected NIOPathManager pathManager;
	protected Frame<Resource> resourceFrame;
	
	public NIOResourceReaderImpl(NIOPathManager pathManager, EntityProvider entityProvider, ContextProvider contextProvider) {
		super();
		setContextProvider(contextProvider);
		setEntityProvider(entityProvider);
		
		this.pathManager = pathManager;		
	}

	@Override
	public boolean exists(String name) {
		return lookup(name) != null;
	}

	@Override
	public EntityIterator<Resource> find(String filter) {
		return new BaseEntityIteratorImpl<Resource>(resourceFrame, pathManager.getResources().values().iterator());
	}

	@Override
	public Resource lookup(String name) {
		return pathManager.getResources().get(name);
	}

	public Resource getResource() {
		return pathManager.getResourceRoot();
	}
}
