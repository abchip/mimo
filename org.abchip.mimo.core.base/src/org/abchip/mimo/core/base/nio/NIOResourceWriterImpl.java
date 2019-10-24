/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base.nio;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.UserDefinedFileAttributeView;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.context.EntityLocker;
import org.abchip.mimo.context.LockManager;
import org.abchip.mimo.context.LockType;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Resource;

public class NIOResourceWriterImpl extends NIOResourceReaderImpl implements EntityWriter<Resource> {

	private LockManager lockManager;

	public NIOResourceWriterImpl(NIOPathManager fileManager, Frame<Resource> frame, ContextProvider contextProvider, LockManager lockManager) {
		super(fileManager, frame, contextProvider);
		this.lockManager = lockManager;
	}

	@Override
	public void delete(Resource resource) {
		Context context = contextProvider.getContext();

		Path resourcePath = pathManager.getPath().resolve(resource.getName());
		if (!Files.exists(resourcePath))
			return;

		EntityLocker<Resource> resourceLocker = lockManager.getLocker(context, resourcePath.toUri());
		resourceLocker.lock(LockType.WRITE);

		try {
			pathManager.deletePath(resourcePath);
			pathManager.getResources().remove(resource.getName());
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			resourceLocker.unlock(LockType.WRITE);
		}
	}

	@Override
	public void create(Resource entity) {
		create(entity, false);
	}

	@Override
	public void create(Resource entity, boolean replace) {

		Context context = contextProvider.getContext();
		Path resourcePath = pathManager.getPath().resolve(entity.getName());

		EntityLocker<Resource> resourceLocker = lockManager.getLocker(context, resourcePath.toUri());
		resourceLocker.lock(LockType.WRITE);

		try {
			boolean exists = Files.exists(resourcePath);
			if (exists && !replace)
				throw new IOException("Resource already exists: " + entity.getName());

			if (exists)
				pathManager.deletePath(resourcePath);

			resourcePath = Files.createDirectories(resourcePath);

			UserDefinedFileAttributeView view = Files.getFileAttributeView(resourcePath, UserDefinedFileAttributeView.class);
			view.write("text", Charset.defaultCharset().encode(entity.getText()));

			pathManager.getResources().put(entity.getName(), pathManager.buildResource(resourcePath));
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			resourceLocker.unlock(LockType.WRITE);
		}
	}

	@Override
	public void update(Resource entity) {

		Context context = contextProvider.getContext();
		Path resourcePath = pathManager.getPath().resolve(entity.getName());

		EntityLocker<Resource> resourceLocker = lockManager.getLocker(context, resourcePath.toUri());
		resourceLocker.lock(LockType.WRITE);

		try {
			if (!Files.exists(resourcePath))
				throw new IOException("Resource not exists: " + entity.getName());

			pathManager.deletePath(resourcePath);

			resourcePath = Files.createDirectories(resourcePath);

			UserDefinedFileAttributeView view = Files.getFileAttributeView(resourcePath, UserDefinedFileAttributeView.class);
			view.write("text", Charset.defaultCharset().encode(entity.getText()));

			pathManager.getResources().put(entity.getName(), pathManager.buildResource(resourcePath));
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			resourceLocker.unlock(LockType.WRITE);
		}
	}

	@Override
	public String getResourceName() {
		return getResourceName();
	}

	@Override
	public String nextSequence() {
		throw new UnsupportedOperationException();
	}
}
