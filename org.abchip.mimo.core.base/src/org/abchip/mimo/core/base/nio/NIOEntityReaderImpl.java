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

import org.abchip.mimo.context.Logger;
import org.abchip.mimo.core.base.BaseEntityIteratorImpl;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.ResourceSerializer;
import org.abchip.mimo.entity.impl.EntityReaderImpl;

public class NIOEntityReaderImpl<E extends EntityNameable> extends EntityReaderImpl<E> {

	private Logger logger;
	private NIOPathManager pathManager;
	private String resource;
	private ResourceSerializer<E> resourceSerializer = null;

	public NIOEntityReaderImpl(NIOPathManager pathManager, ResourceSerializer<E> resourceSerializer, String resource, Frame<E> frame, Logger logger) {
		setContextProvider(resourceSerializer.getContextProvider());
		this.pathManager = pathManager;
		this.resource = resource;
		this.resourceSerializer = resourceSerializer;
		setFrame(frame);
	}

	protected NIOPathManager getPathManager() {
		return this.pathManager;
	}

	protected ResourceSerializer<E> getResourceSerializer() {
		return resourceSerializer;
	}

	public String getResourceName() {
		return this.resource;
	}

	@Override
	public boolean exists(String name) {
		return lookup(name) != null;
	}

	@Override
	public E lookup(String name) {

		Path folder = getClassFolder(frame, false);
		if (folder == null)
			return null;
		Path file = folder.resolve(name);
		if (!Files.exists(file))
			return null;

		E entity = null;
		try (InputStream inputStream = Files.newInputStream(file)) {
			this.getResourceSerializer().load(inputStream, true);
			entity = this.getResourceSerializer().get();
			// entity = getEntitySerializer(contextProvider).deserialize(resource, frame,
			// name, inputStream);
		} catch (IOException e) {
			logger.error(e);
		} finally {
			this.getResourceSerializer().clear();
		}

		return entity;
	}

	@Override
	public EntityIterator<E> find(String filter) {
		return find(filter, -1);
	}

	@Override
	public EntityIterator<E> find(String filter, int nrElem) {

		List<E> entries = new ArrayList<E>();

		Path folder = getClassFolder(frame, false);
		if (folder == null)
			return new BaseEntityIteratorImpl<E>(entries.iterator(), nrElem);

		try {
			DirectoryStream<Path> dirStream = Files.newDirectoryStream(folder);

			int i = 0;
			for (Path path : dirStream) {
				if (Files.isDirectory(path))
					continue;
				if (Files.isHidden(path))
					continue;

				String entityName = path.getFileName().toString();

				// filter by name
				if (filter != null) {

					// starts
					if (filter.endsWith("*")) {

						if (!entityName.startsWith(filter.substring(0, filter.length() - 1)))
							continue;

					}
					// equals
					else if (!entityName.equals(filter))
						continue;

				}

				try (InputStream inputStream = Files.newInputStream(path)) {

					this.getResourceSerializer().load(inputStream, true);
					// entries.add(getEntitySerializer(contextProvider).deserialize(resource, frame,
					// entityName, inputStream));
					i++;
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}

				if (nrElem != -1 && i >= nrElem)
					break;
			}

			entries.addAll(this.getResourceSerializer().getAll());

			dirStream.close();

		} catch (Exception e) {
			logger.error(e);
		} finally {
			this.getResourceSerializer().clear();
		}

		Collections.sort(entries, new Comparator<E>() {

			@Override
			public int compare(E o1, E o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		return new BaseEntityIteratorImpl<E>(entries.iterator(), nrElem);
	}

	@Override
	public List<String> findNames(String filter) {
		List<String> names = new ArrayList<String>();

		Path folder = getClassFolder(frame, false);
		if (folder == null)
			return names;

		try {
			DirectoryStream<Path> dirStream = Files.newDirectoryStream(folder);

			for (Path path : dirStream) {
				if (Files.isDirectory(path))
					continue;

				String entityName = path.getFileName().toString();

				// filter by name
				if (filter != null) {

					// starts
					if (filter.endsWith("*")) {

						if (!entityName.startsWith(filter.substring(0, filter.length() - 1)))
							continue;

					}
					// equals
					else if (!entityName.equals(filter))
						continue;

					names.add(entityName);
				}
			}
			dirStream.close();

		} catch (Exception e) {
			logger.error(e);
		}

		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});

		return names;
	}

	protected Path getClassFolder(Frame<E> frame, boolean create) {

		Path folder = pathManager.getPath().resolve(resource).resolve(frame.getName());
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
}
