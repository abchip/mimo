/**
 * Copyright (c) 2017, 2021 ABChip and others.
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
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.SerializationType;
import org.abchip.mimo.resource.impl.ResourceImpl;
import org.abchip.mimo.util.Logs;
import org.osgi.service.log.Logger;

public class NIOResourcempl<E extends EntityIdentifiable> extends ResourceImpl<E> {

	private static final String TENANT_MASTER = "*MASTER";

	private final Logger LOGGER = Logs.getLogger(NIOResourcempl.class);

	private NIOPathManager pathManager = null;
	private ResourceSerializer<E> resourceSerializer = null;

	public NIOResourcempl(Context context, Frame<E> frame, NIOPathManager pathManager) {
		super(context);
		this.pathManager = pathManager;

		this.resourceSerializer = this.getContext().getResourceManager().createResourceSerializer(frame, SerializationType.XMI);
	}

	@Override
	public Frame<E> getFrame() {
		return this.resourceSerializer.getFrame();
	}

	@Override
	public void create(E entity, boolean update, boolean raw) throws ResourceException {

		synchronized (this.resourceSerializer) {
			String entityId = entity.getID();
			Path file = getClassFolder(getFrame(), true, entityId).resolve(entityId);

			try {
				this.resourceSerializer.add(entity);
				ByteArrayOutputStream output = new ByteArrayOutputStream();
				this.resourceSerializer.save(output);
				ByteArrayInputStream input = new ByteArrayInputStream(output.toByteArray());

				if (!Files.exists(file.getParent()))
					Files.createDirectories(file.getParent());

				if (update)
					Files.copy(input, file, StandardCopyOption.REPLACE_EXISTING);
				else
					Files.copy(input, file);

				this.attach(entity);
			} catch (IOException e) {
				throw new ResourceException(e);
			} finally {
				this.resourceSerializer.clear();
			}
		}
	}

	@Override
	public E lookup(String name, String fields, boolean proxy) throws ResourceException {

		synchronized (this.resourceSerializer) {
			Path folder = getClassFolder(this.getFrame(), false, name);
			if (folder == null)
				return null;
			Path file = folder.resolve(name);
			if (!Files.exists(file))
				return null;

			if (proxy)
				return createProxy(name);

			E entity = null;
			try (InputStream inputStream = Files.newInputStream(file)) {
				this.resourceSerializer.load(inputStream, false);
				entity = this.resourceSerializer.get();
				this.attach(entity);
			} catch (IOException e) {
				throw new ResourceException(e);
			} finally {
				this.resourceSerializer.clear();
			}

			return entity;
		}
	}

	@Override
	public List<E> find(String filter, String fields, String order, int limit, boolean proxy) throws ResourceException {

		synchronized (this.resourceSerializer) {
			List<E> entries = new ArrayList<E>();

			Path folder = getClassFolder(this.getFrame(), false, null);
			if (folder == null)
				return entries;

			try {
				appendEntries(folder, proxy, limit);
				entries.addAll(this.resourceSerializer.getAll());
				for (E entity : entries)
					this.attach(entity);
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

				String entityId = entity.getID();
				Path file = getClassFolder(getFrame(), true, entityId).resolve(entityId);
				if (!Files.exists(file))
					throw new ResourceException("Resource not exists: " + entity.getID());

				Files.copy(input, file, StandardCopyOption.REPLACE_EXISTING);

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

			try {
				String entityId = entity.getID();
				Path file = getClassFolder(getFrame(), false, entityId).resolve(entityId);
				if (!Files.exists(file))
					throw new ResourceException("Resource not exists: " + entity.getID());

				this.pathManager.deletePath(file);
				this.detach(entity);
			} catch (IOException e) {
				throw new ResourceException(e);
			}
		}
	}

	private Path getClassFolder(Frame<E> frame, boolean create, String name) {

		String tenant = this.getContext().getTenant();
		if (tenant == null)
			tenant = TENANT_MASTER.replaceFirst("\\*", "").toLowerCase();

		Path folder = pathManager.getPath().resolve(tenant).resolve(frame.getName());
		if (Files.exists(folder))
			return folder;

		if (!create)
			return null;

		// single key
		if (frame.getKeys().size() <= 1) {
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

		// multiple keys
		if (name == null)
			return folder;
		String[] names = name.split("/");
		for (int k = 0; k < frame.getKeys().size(); k++) {
			if (names.length <= k)
				return folder;
			folder = folder.resolve(names[k]);
		}
		return folder;
	}

	private void appendEntries(Path folder, boolean proxy, int limit) throws ResourceException {

		int size = 0;
		try (DirectoryStream<Path> dirStream = Files.newDirectoryStream(folder)) {
			for (Path path : dirStream) {
				if (Files.isHidden(path))
					continue;
				if (Files.isDirectory(path)) {
					appendEntries(path, proxy, limit - size);
					continue;
				}

				String name = path.getFileName().toString();
				if (proxy) {
					this.resourceSerializer.add(createProxy(name));
					continue;
				}

				try (InputStream inputStream = Files.newInputStream(path)) {
					this.resourceSerializer.load(inputStream, true);
				} catch (Exception e) {
					LOGGER.error(e.getMessage());
					this.resourceSerializer.add(createProxy(name));
				}
				size++;

				if (limit != 0 && size > limit)
					break;
			}

		} catch (Exception e) {
			throw new ResourceException(e);
		}
	}

	@Override
	public String nextSequence() throws ResourceException {
		return Long.toString(System.currentTimeMillis());
	}
}