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
package org.abchip.mimo.core.base.nio;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.EntityLocker;
import org.abchip.mimo.context.LockManager;
import org.abchip.mimo.context.LockType;
import org.abchip.mimo.context.Logger;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.ResourceHelper;
import org.abchip.mimo.entity.ResourceSerializer;

public class NIOEntityWriterImpl<E extends EntityNameable> extends NIOEntityReaderImpl<E> implements EntityWriter<E> {

	private LockManager lockManager;

	public NIOEntityWriterImpl(NIOPathManager fileManager, ResourceSerializer<E> resourceSerializer, String resource, Frame<E> frame, Logger logger,
			LockManager lockManager) {
		super(fileManager, resourceSerializer, resource, frame, logger);
		this.lockManager = lockManager;
	}

	@Override
	public void delete(E entity) {
		try {
			ResourceHelper.firePreDeleteEvent(this, entity);

			doDelete(entity);

			ResourceHelper.firePostDeleteEvent(this, entity);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private void doDelete(E entity) throws IOException {
		Context context = contextProvider.getContext();

		Path file = getClassFolder(getFrame(), false).resolve(entity.getName());
		if (!Files.exists(file))
			return;

		EntityLocker<?> fileLocker = lockManager.getLocker(context, file.toUri());
		fileLocker.lock(LockType.WRITE);

		try {
			getPathManager().deletePath(file);
		} finally {
			fileLocker.unlock(LockType.WRITE);
		}
	}

	@Override
	public void create(E entity) {
		create(entity, false);
	}

	@Override
	public void create(E entity, boolean replace) {
		try {
			ResourceHelper.firePreSaveEvent(this, entity);

			doCreate(entity, replace);

			ResourceHelper.firePostSaveEvent(this, entity);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void update(E entity) {

		Context context = contextProvider.getContext();

		Path file = getClassFolder(getFrame(), true).resolve(entity.getName());

		EntityLocker<?> entityLocker = lockManager.getLocker(context, file.toUri());
		entityLocker.lock(LockType.WRITE);

		try {

			ByteArrayOutputStream output = new ByteArrayOutputStream();
			this.getResourceSerializer().save(output);
			ByteArrayInputStream input = new ByteArrayInputStream(output.toByteArray());

			if (!Files.exists(file))
				throw new IOException("Resource not exists: " + entity.getName());

			Files.copy(input, file, StandardCopyOption.REPLACE_EXISTING);

		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			entityLocker.unlock(LockType.WRITE);
		}
	}

	private void doCreate(E entity, boolean replace) throws IOException {

		Context context = contextProvider.getContext();

		Path file = getClassFolder(getFrame(), true).resolve(entity.getName());

		EntityLocker<?> entityLocker = lockManager.getLocker(context, file.toUri());
		entityLocker.lock(LockType.WRITE);

		try {

			ByteArrayOutputStream output = new ByteArrayOutputStream();
			this.getResourceSerializer().save(output);
			ByteArrayInputStream input = new ByteArrayInputStream(output.toByteArray());

			if (replace)
				Files.copy(input, file, StandardCopyOption.REPLACE_EXISTING);
			else {

				if (!Files.exists(file.getParent()))
					Files.createDirectories(file.getParent());

				Files.copy(input, file);
			}

		} finally {
			entityLocker.unlock(LockType.WRITE);
		}
	}
}