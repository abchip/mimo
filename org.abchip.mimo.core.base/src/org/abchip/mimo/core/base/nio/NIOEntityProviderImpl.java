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

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.context.LockManager;
import org.abchip.mimo.context.Logger;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Resource;
import org.abchip.mimo.entity.ResourceHelper;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.impl.EntityProviderImpl;

public class NIOEntityProviderImpl extends EntityProviderImpl {

	@Inject
	private ContextRoot contextRoot;
	@Inject
	private LockManager lockManager;
	@Inject
	private Logger logger;
	@Inject
	private ResourceManager resourceManager;

	private NIOPathManager pathManager;

	private EntityReader<Resource> resourceReader;

	@PostConstruct
	private void init() {

		this.pathManager = new NIOPathManager(contextRoot.getContextDescription().getResourceRoot());
		this.resourceReader = new NIOResourceReaderImpl(pathManager, this, contextRoot);

//		resourceManager.registerProvider(Resource.class, this);
//		resourceManager.registerProvider(EntityNameable.class, this);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E extends EntityNameable> EntityReader<E> getEntityReader(ContextProvider contextProvider, Frame<E> frame, String resourceName) {
		EntityReader<E> entityReader = null;
		if (isResource(frame)) {
			entityReader = (EntityReader<E>) new NIOResourceReaderImpl(pathManager, this, contextRoot);
		} else {
			Resource resource = resourceReader.lookup(resourceName);
			if (resource == null)
				return null;
			entityReader = new NIOEntityReaderImpl<E>(pathManager, this, contextProvider, resource, frame, logger);
		}

		return entityReader;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E extends EntityNameable> EntityReader<E> getEntityReader(ContextProvider contextProvider, Frame<E> frame, List<String> resources) {

		List<EntityReader<E>> readers = new ArrayList<EntityReader<E>>();
		for (String resourceName : resources) {
			if (isResource(frame)) {
				readers.add((EntityReader<E>) new NIOResourceReaderImpl(pathManager, this, contextRoot));
			} else {

				Resource resource = resourceReader.lookup(resourceName);
				if (resource == null)
					return null;
				NIOEntityReaderImpl<E> resourceReader = new NIOEntityReaderImpl<E>(pathManager, this, contextProvider, resource, frame, logger);
				readers.add(resourceReader);
			}
		}

		return ResourceHelper.wrapReader(readers);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E extends EntityNameable> EntityWriter<E> getEntityWriter(ContextProvider contextProvider, Frame<E> frame, String resourceName) {
		EntityWriter<E> resourceWriter = null;
		if (isResource(frame)) {
			resourceWriter = (EntityWriter<E>) new NIOResourceWriterImpl(pathManager, this, contextProvider, lockManager);
		} else {
			Resource resource = resourceReader.lookup(resourceName);
			if (resource == null)
				return null;
			resourceWriter = new NIOEntityWriterImpl<E>(pathManager, this, contextProvider, resource, frame, logger, lockManager);
		}

		return resourceWriter;
	}

	private boolean isResource(Frame<?> frame) {
		return frame.getName().equals(Resource.class.getSimpleName());
	}
}