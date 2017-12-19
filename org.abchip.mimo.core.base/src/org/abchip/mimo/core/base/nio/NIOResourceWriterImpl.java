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
import org.abchip.mimo.entity.EntityProvider;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.entity.Resource;

public class NIOResourceWriterImpl extends NIOResourceReaderImpl implements EntityWriter<Resource> {

	private LockManager lockManager;
	
	public NIOResourceWriterImpl(NIOPathManager fileManager, EntityProvider resourceProvider, ContextProvider contextProvider, LockManager lockManager) {
		super(fileManager, resourceProvider, contextProvider);
		this.lockManager = lockManager;
	}

	@Override
	public Resource copy(Resource entity, String name) {
		// TODO Auto-generated method stub
		return null;
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
	public void save(Resource entity) {
		save(entity, false);
	}

	@Override
	public void save(Resource resource, boolean replace) {

		Context context = contextProvider.getContext();	
		Path resourcePath = pathManager.getPath().resolve(resource.getName());

		EntityLocker<Resource> resourceLocker = lockManager.getLocker(context, resourcePath.toUri());
		resourceLocker.lock(LockType.WRITE);

		try {
			boolean exists = Files.exists(resourcePath);
			if (exists && !replace)
				throw new IOException("Resource already exists: " + resource.getName());

			if (exists)
				pathManager.deletePath(resourcePath);

			resourcePath = Files.createDirectories(resourcePath);

			UserDefinedFileAttributeView view = Files.getFileAttributeView(resourcePath, UserDefinedFileAttributeView.class);
			view.write("text", Charset.defaultCharset().encode(resource.getText()));
			
			pathManager.getResources().put(resource.getName(), pathManager.buildResource(resourcePath));
		} 
		catch (IOException e) {
			throw new RuntimeException(e);
		}
		finally {
			resourceLocker.unlock(LockType.WRITE);
		}
	}

	@Override
	public void rename(Resource entity, String newName) {
		// TODO Auto-generated method stub
		
	}
}
