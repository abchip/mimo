/**
 * Copyright (c) 2017, 2020 ABChip and others.
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

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.SerializationType;
import org.abchip.mimo.resource.impl.ResourceImpl;
import org.abchip.mimo.util.Logs;
import org.osgi.service.log.Logger;

public class NIOResourcempl<E extends EntityIdentifiable> extends ResourceImpl<E> {


	private final Logger LOGGER = Logs.getLogger(NIOResourcempl.class);

	private Context context = null;
	private NIOPathManager pathManager = null;
	private ResourceSerializer<E> resourceSerializer = null;

	private String tenant = null;

	public NIOResourcempl(Context context, Frame<E> frame, String tenant, NIOPathManager pathManager) {

		this.context = context;
		this.tenant = tenant;
		this.pathManager = pathManager;

		ResourceManager resourceManager = context.get(ResourceManager.class);
		this.resourceSerializer = resourceManager.createResourceSerializer(context, frame, SerializationType.XMI);
	}

	@Override
	public Context getContext() {
		return this.context;
	}

	@Override
	public String getTenant() {
		return tenant;
	}

	@Override
	public Frame<E> getFrame() {
		return this.resourceSerializer.getFrame();
	}

	@Override
	public void create(E entity, boolean update) throws ResourceException {

		synchronized (this.resourceSerializer) {
			Path file = getClassFolder(getFrame(), true).resolve(entity.getID());

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
				throw new ResourceException(e);
			} finally {
				this.resourceSerializer.clear();
			}
		}
	}

	@Override
	public void delete(E entity) throws ResourceException {

		synchronized (this.resourceSerializer) {
			Path file = getClassFolder(getFrame(), false).resolve(entity.getID());
			if (!Files.exists(file))
				return;

			try {
				this.pathManager.deletePath(file);
			} catch (IOException e) {
				throw new ResourceException(e);
			}
		}
	}

	@Override
	public E read(String name, String fields, boolean proxy) throws ResourceException {

		synchronized (this.resourceSerializer) {
			Path folder = getClassFolder(this.getFrame(), false);
			if (folder == null)
				return null;
			Path file = folder.resolve(name);
			if (!Files.exists(file))
				return null;

			if (proxy)
				return context.createProxy(getFrame(), name);

			E entity = null;
			try (InputStream inputStream = Files.newInputStream(file)) {
				this.resourceSerializer.load(inputStream, false);
				entity = this.resourceSerializer.get();
			} catch (IOException e) {
				throw new ResourceException(e);
			} finally {
				this.resourceSerializer.clear();
			}

			return entity;
		}
	}

	@Override
	public List<E> read(String filter, String fields, String order, int limit, boolean proxy) throws ResourceException {

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
						this.resourceSerializer.add(context.createProxy(getFrame(), name));
						continue;
					}

					try (InputStream inputStream = Files.newInputStream(path)) {
						this.resourceSerializer.load(inputStream, true);
					} catch (Exception e) {
						LOGGER.error(e.getMessage());
						this.resourceSerializer.add(context.createProxy(getFrame(), name));
					}
				}

				entries.addAll(this.resourceSerializer.getAll());
			} catch (Exception e) {
				throw new ResourceException(e);
			} finally {
				this.resourceSerializer.clear();
			}

			Collections.sort(entries, new Comparator<E>() {

				@Override
				public int compare(E o1, E o2) {
					return o1.getID().compareTo(o2.getID());
				}
			});

			return entries;
		}
	}

	@Override
	public void update(E entity) throws ResourceException {

		synchronized (this.resourceSerializer) {
			try {
				this.resourceSerializer.add(entity);
				ByteArrayOutputStream output = new ByteArrayOutputStream();
				this.resourceSerializer.save(output);
				ByteArrayInputStream input = new ByteArrayInputStream(output.toByteArray());

				Path file = getClassFolder(getFrame(), true).resolve(entity.getID());
				if (!Files.exists(file))
					throw new IOException("Resource not exists: " + entity.getID());

				Files.copy(input, file, StandardCopyOption.REPLACE_EXISTING);

			} catch (IOException e) {
				throw new ResourceException(e);
			} finally {
				this.resourceSerializer.clear();
			}
		}
	}

	private Path getClassFolder(Frame<E> frame, boolean create) {

		String tenant = this.tenant;
		if (tenant == null)
			tenant = Resource.TENANT_MASTER.replaceFirst("\\*", "").toLowerCase();

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
			LOGGER.error(e.getMessage());
			return null;
		}

		return folder;
	}

	@Override
	public String nextSequence() throws ResourceException {
		throw new ResourceException(new UnsupportedOperationException());
	}
}