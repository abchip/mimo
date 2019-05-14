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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
		return find(filter, -1);
	}

	@Override
	public EntityIterator<Resource> find(String filter, int nrElem) {
		return new BaseEntityIteratorImpl<Resource>(getFrame(), pathManager.getResources().values().iterator(), nrElem);
	}

	@Override
	public List<String> findNames(String filter) {
		List<String> names = new ArrayList<String>();
		for (Resource resource : pathManager.getResources().values())
			names.add(resource.getName());

		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});

		return names;
	}

	@Override
	public Resource lookup(String name) {
		return pathManager.getResources().get(name);
	}

	public Resource getResource() {
		return pathManager.getResourceRoot();
	}
}
