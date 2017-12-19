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

import org.abchip.mimo.application.Application;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.context.LockManager;
import org.abchip.mimo.context.Logger;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.entity.Resource;
import org.abchip.mimo.entity.ResourceHelper;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.impl.EntityProviderImpl;

public class NIOEntityProviderImpl extends EntityProviderImpl {

	@Inject
	private Application application;
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
		
		this.pathManager = new NIOPathManager(application.getContext().getContextDescription().getResourceRoot());
		this.resourceReader = new NIOResourceReaderImpl(pathManager, this, application);
		
		resourceManager.registerProvider(Resource.class, this);
		resourceManager.registerProvider(EntityNameable.class, this);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends EntityNameable> EntityReader<T> getEntityReader(ContextProvider contextProvider, Class<T> klass, String resourceName) {
		
		EntityReader<T> entityReader = null;
		if (Resource.class.isAssignableFrom(klass)) {
			entityReader = (EntityReader<T>) new NIOResourceReaderImpl(pathManager, this, application);
		} else {
			Resource resource = resourceReader.lookup(resourceName);
			if (resource == null)
				return null;
			entityReader = new NIOEntityReaderImpl<T>(pathManager, this, contextProvider, resource, klass, logger);
		}

		return entityReader;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends EntityNameable> EntityReader<T> getEntityReader(ContextProvider contextProvider, Class<T> klass, List<String> resources) {

		List<EntityReader<T>> readers = new ArrayList<EntityReader<T>>();
		for (String resourceName : resources) {
			if (Resource.class.isAssignableFrom(klass)) {
				readers.add((EntityReader<T>) new NIOResourceReaderImpl(pathManager, this, application));
			} else {

				Resource resource = resourceReader.lookup(resourceName);
				if (resource == null)
					return null;
				NIOEntityReaderImpl<T> resourceReader = new NIOEntityReaderImpl<T>(pathManager, this, contextProvider, resource, klass, logger);
				readers.add(resourceReader);
			}
		}

		return ResourceHelper.wrapReader(readers);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends EntityNameable> EntityWriter<T> getEntityWriter(ContextProvider contextProvider, Class<T> klass, final String resourceName) {

		EntityWriter<T> resourceWriter = null;
		if (Resource.class.isAssignableFrom(klass)) {
			resourceWriter = (EntityWriter<T>) new NIOResourceWriterImpl(pathManager, this, contextProvider, lockManager);
		} else {
			Resource resource = resourceReader.lookup(resourceName);
			if (resource == null)
				return null;
			resourceWriter = new NIOEntityWriterImpl<T>(pathManager, this, contextProvider, resource, klass, logger, lockManager);
		}

		return resourceWriter;
	}
}