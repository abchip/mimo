/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base.nio;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.context.Logger;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.entity.SerializationType;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.impl.ResourceImpl;

public class NIOResourceImpl<E extends EntityNameable> extends ResourceImpl<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private FrameManager frameManager;
	private Logger logger;
	private NIOPathManager pathManager = null;
	private ResourceSerializer<E> resourceSerializer = null;

	private String tenant = null;

	public NIOResourceImpl(ContextProvider contextProvider, Frame<E> frame, String tenant, NIOPathManager pathManager) {

		this.frameManager = contextProvider.getContext().get(FrameManager.class);
		this.logger = contextProvider.getContext().get(Logger.class);
		this.pathManager = pathManager;

		ResourceManager resourceManager = contextProvider.getContext().get(ResourceManager.class);
		this.resourceSerializer = resourceManager.createEntitySerializer(frame, SerializationType.XML_METADATA_INTERCHANGE);

		if (tenant != null)
			this.tenant = tenant;
		else
			this.tenant = Resource.TENANT_MASTER.replaceFirst("\\*", "").toLowerCase();
	}

	private Frame<E> getFrame() {
		return this.resourceSerializer.getFrame();
	}

	@Override
	public void create(E entity, boolean update) {

		synchronized (this.resourceSerializer) {
			Path file = getClassFolder(getFrame(), true).resolve(entity.getName());

			try {
				this.resourceSerializer.add(entity);
				ByteArrayOutputStream output = new ByteArrayOutputStream();
				this.resourceSerializer.save(output);
				ByteArrayInputStream input = new ByteArrayInputStream(output.toByteArray());

				if (update)
					Files.copy(input, file, StandardCopyOption.REPLACE_EXISTING);
				else {

					if (!Files.exists(file.getParent()))
						Files.createDirectories(file.getParent());

					Files.copy(input, file);
				}

			} catch (IOException e) {
				throw new RuntimeException(e);
			} finally {
				this.resourceSerializer.clear();
			}
		}
	}

	@Override
	public void delete(E entity) {

		synchronized (this.resourceSerializer) {
			Path file = getClassFolder(getFrame(), false).resolve(entity.getName());
			if (!Files.exists(file))
				return;

			try {
				this.pathManager.deletePath(file);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}

	@Override
	public E read(String name, String fields, boolean proxy) {

		synchronized (this.resourceSerializer) {
			Path folder = getClassFolder(this.getFrame(), false);
			if (folder == null)
				return null;
			Path file = folder.resolve(name);
			if (!Files.exists(file))
				return null;

			if (proxy)
				return frameManager.createProxy(getFrame(), name);

			E entity = null;
			try (InputStream inputStream = Files.newInputStream(file)) {
				this.resourceSerializer.load(inputStream, false);
				entity = this.resourceSerializer.get();
			} catch (IOException e) {
				logger.error(e);
			} finally {
				this.resourceSerializer.clear();
			}

			return entity;
		}
	}

	@Override
	public List<E> read(String filter, String fields, int limit, boolean proxy) {

		synchronized (this.resourceSerializer) {
			List<E> entries = new ArrayList<E>();

			Path folder = getClassFolder(this.getFrame(), false);
			if (folder == null)
				return entries;

			try (DirectoryStream<Path> dirStream = Files.newDirectoryStream(folder)) {

				int i = 0;
				for (Path path : dirStream) {
					if (Files.isDirectory(path))
						continue;
					if (Files.isHidden(path))
						continue;

					String name = path.getFileName().toString();

					// filter by name
					if (filter != null) {

						// starts
						if (filter.endsWith("*")) {

							if (!name.startsWith(filter.substring(0, filter.length() - 1)))
								continue;

						}
						// equals
						else if (!name.equals(filter))
							continue;

					}

					if (limit > 0 && i >= limit)
						break;

					i++;

					if (proxy) {
						this.resourceSerializer.add(frameManager.createProxy(getFrame(), name));
						continue;
					}

					try (InputStream inputStream = Files.newInputStream(path)) {

						this.resourceSerializer.load(inputStream, true);
					} catch (Exception e) {
						this.resourceSerializer.add(frameManager.createProxy(getFrame(), name));
						logger.error(e);
					}
				}

				entries.addAll(this.resourceSerializer.getAll());
			} catch (Exception e) {
				logger.error(e);
			} finally {
				this.resourceSerializer.clear();
			}

			Collections.sort(entries, new Comparator<E>() {

				@Override
				public int compare(E o1, E o2) {
					return o1.getName().compareTo(o2.getName());
				}
			});

			return entries;
		}
	}

	@Override
	public void update(E entity) {

		synchronized (this.resourceSerializer) {
			try {
				this.resourceSerializer.add(entity);
				ByteArrayOutputStream output = new ByteArrayOutputStream();
				this.resourceSerializer.save(output);
				ByteArrayInputStream input = new ByteArrayInputStream(output.toByteArray());

				Path file = getClassFolder(getFrame(), true).resolve(entity.getName());
				if (!Files.exists(file))
					throw new IOException("Resource not exists: " + entity.getName());

				Files.copy(input, file, StandardCopyOption.REPLACE_EXISTING);

			} catch (IOException e) {
				throw new RuntimeException(e);
			} finally {
				this.resourceSerializer.clear();
			}
		}
	}

	private Path getClassFolder(Frame<E> frame, boolean create) {

		Path folder = pathManager.getPath().resolve(tenant).resolve(frame.getName());
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

	@Override
	public String nextSequence() {
		throw new UnsupportedOperationException();
	}
}