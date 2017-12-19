/**
 *  Copyright (c) 2017, 2018 ABChip and others.
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

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.abchip.mimo.EMFResourceFactoryImpl;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.context.Logger;
import org.abchip.mimo.core.base.BaseEntityIteratorImpl;
import org.abchip.mimo.core.base.BaseResourceEntitySerializer;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntityProvider;
import org.abchip.mimo.entity.Resource;
import org.abchip.mimo.entity.impl.EntityReaderImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

public class NIOEntityReaderImpl<T extends EntityNameable> extends EntityReaderImpl<T> {

	private Logger logger;
	protected NIOPathManager pathManager;
	protected Class<T> klass;
	private Resource resource;

	public NIOEntityReaderImpl(NIOPathManager pathManager, EntityProvider resourceProvider, ContextProvider contextProvider, Resource resource, Class<T> klass, Logger logger) {
		setEntityProvider(resourceProvider);
		setContextProvider(contextProvider);
		this.pathManager = pathManager;
		this.klass = klass;
		this.resource = resource;
	}

	public Resource getResource() {
		return resource;
	}

	@Override
	public boolean exists(String name) {
		return lookup(name) != null;
	}

	@Override
	public T lookup(String name) {

		Path file = getClassFolder(klass, false).resolve(name);
		if (!Files.exists(file))
			return null;

		T entity = null;
		try {
			InputStream inputStream = Files.newInputStream(file);
			entity = getEntitySerializer(contextProvider).deserialize(resource, klass, name, inputStream);
		} catch (IOException e) {
			logger.error(e);
		}
		
		return entity;
	}
	
	@Override
	public EntityIterator<T> find(String nameFilter) {

		List<T> entries = new ArrayList<T>();
		Path folder = getClassFolder(klass, false);
		if (folder == null)
			return new BaseEntityIteratorImpl<T>(klass, entries.iterator());

		try {
			DirectoryStream<Path> dirStream = Files.newDirectoryStream(folder);

			for (Path path : dirStream) {
				if (Files.isDirectory(path))
					continue;

				String entityName = path.getFileName().toString();

				// filter by name
				if (nameFilter != null) {

					// starts
					if (nameFilter.endsWith("*")) {

						if (!entityName.startsWith(nameFilter.substring(0, nameFilter.length() - 1)))
							continue;

					}
					// equals
					else if (!entityName.equals(nameFilter))
						continue;

				}

				try {
					InputStream inputStream = Files.newInputStream(path);
					entries.add(getEntitySerializer(contextProvider).deserialize(resource, klass, entityName, inputStream));
				}
				catch(Exception e) {
					System.err.println(e.getMessage());
				}

			}
			dirStream.close();

		} catch (Exception e) {
			logger.error(e);
		}

		Collections.sort(entries, new Comparator<T>() {

			@Override
			public int compare(T o1, T o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		return new BaseEntityIteratorImpl<T>(klass, entries.iterator());
	}

	protected Path getClassFolder(Class<?> klass, boolean create) {

		Path folder = pathManager.getPath().resolve(resource.getName()).resolve(klass.getSimpleName());
		if (Files.exists(folder))
			return folder;

		if (!create)
			return null;

		try {
			Files.createDirectories(folder);
		} catch (FileAlreadyExistsException e) {
			return folder;
		} catch (IOException e) {
			logger.error(e);
			return null;
		}

		return folder;
	}
	
	protected BaseResourceEntitySerializer getEntitySerializer(ContextProvider contextProvider) {
		Context context = contextProvider.getContext();

		BaseResourceEntitySerializer objectSerializer = context.get(BaseResourceEntitySerializer.class);
		if (objectSerializer == null) {
			synchronized (context) {
				objectSerializer = context.get(BaseResourceEntitySerializer.class);
				if (objectSerializer == null) {

					ResourceSetImpl resourceSet = new ResourceSetImpl();
					resourceSet.getLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, true);

					org.eclipse.emf.ecore.resource.Resource.Factory resourceFatory = new EMFResourceFactoryImpl();
					resourceSet.getResourceFactoryRegistry().getContentTypeToFactoryMap().put("mimo", resourceFatory);

					objectSerializer = new BaseResourceEntitySerializer(context, resourceSet);
					context.set(BaseResourceEntitySerializer.class, objectSerializer);
				}
			}
		}
		return objectSerializer;
	}
}
