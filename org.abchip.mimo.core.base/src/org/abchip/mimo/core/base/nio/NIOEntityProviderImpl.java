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
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceSerializer;
import org.abchip.mimo.entity.SerializationType;
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

	@PostConstruct
	protected void init() {
		super.init();
		
		this.pathManager = new NIOPathManager(contextRoot.getContextDescription().getDataPath());
		
		resourceManager.registerProvider(Resource.class, this);
		resourceManager.registerProvider(EntityNameable.class, this);
	}

	private boolean isResource(Frame<?> frame) {
		return frame.getName().equals(Resource.class.getSimpleName());
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <E extends EntityNameable> EntityReader<E> getEntityReader(ContextProvider contextProvider, Frame<E> frame, String resource) {
		
		EntityReader<E> entityReader = null;
		if (isResource(frame)) {
			entityReader = (EntityReader<E>) new NIOResourceReaderImpl(pathManager, (Frame<Resource>) frame, contextProvider);
		} else {
			ResourceSerializer<E> resourceSerializer = resourceManager.createResourceSerializer(contextProvider, frame, SerializationType.XML_METADATA_INTERCHANGE);
			entityReader = new NIOEntityReaderImpl<E>(pathManager, resourceSerializer, resource, frame, logger);
		}

		return entityReader;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E extends EntityNameable> EntityWriter<E> getEntityWriter(ContextProvider contextProvider, Frame<E> frame, String resource) {

		EntityWriter<E> resourceWriter = null;
		if (isResource(frame)) {
			resourceWriter = (EntityWriter<E>) new NIOResourceWriterImpl(pathManager, (Frame<Resource>) frame, contextProvider, lockManager);
		} else {
			ResourceSerializer<E> resourceSerializer = resourceManager.createResourceSerializer(contextProvider, frame, SerializationType.XML_METADATA_INTERCHANGE);
			resourceWriter = new NIOEntityWriterImpl<E>(pathManager, resourceSerializer, resource, frame, logger, lockManager);
		}

		return resourceWriter;
	}
}