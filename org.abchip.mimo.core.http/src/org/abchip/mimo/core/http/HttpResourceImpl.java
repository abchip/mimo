/**
* Copyright (c) 2017, 2020 ABChip and others.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
*/
package org.abchip.mimo.core.http;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import org.abchip.mimo.core.http.handler.HttpDeleteHandler;
import org.abchip.mimo.core.http.handler.HttpFindHandler;
import org.abchip.mimo.core.http.handler.HttpLookupHandler;
import org.abchip.mimo.core.http.handler.HttpNextSequenceHandler;
import org.abchip.mimo.core.http.handler.HttpSaveHandler;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.ResourceSet;
import org.abchip.mimo.resource.SerializationType;
import org.abchip.mimo.resource.impl.ResourceImpl;
import org.apache.http.client.ResponseHandler;

public class HttpResourceImpl<E extends EntityIdentifiable> extends ResourceImpl<E> {

	private ResourceSerializer<E> resourceSerializer = null;

	private String tenant = null;

	public HttpResourceImpl(ResourceSet resourceSet, String tenant, Frame<E> frame) {
		super(resourceSet, tenant);

		this.resourceSerializer = resourceSet.getContext().getResourceManager().createResourceSerializer(frame, SerializationType.MIMO);
	}

	@Override
	public Frame<E> getFrame() {
		return this.resourceSerializer.getFrame();
	}

	@SuppressWarnings("resource")
	@Override
	public String nextSequence() throws ResourceException {

		if (getFrame().getKeys().size() > 1)
			return null;

		String nextSequence = null;

		String query = "frame=" + getFrame().getName();
		if (tenant != null)
			query += "&tenant=" + this.tenant;

		HttpConnector connector = getContext().get(HttpConnector.class);
		if (connector == null)
			throw new ResourceException("Unconnected resource " + getFrame().getURI());

		try {
			nextSequence = connector.execute("nextSequence", query, new HttpNextSequenceHandler());
		} catch (Exception e) {
			throw new ResourceException(e);
		}

		return nextSequence;
	}

	@SuppressWarnings("resource")
	@Override
	public void create(E entity, boolean update) throws ResourceException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		synchronized (this.resourceSerializer) {
			this.resourceSerializer.add(entity);
			try {
				this.resourceSerializer.save(baos);
			} catch (IOException e) {
				throw new ResourceException(e);
			} finally {
				this.resourceSerializer.clear();
			}
		}

		String query = "frame=" + getFrame().getName() + "&replace=" + update;
		try {
			query += "&json=" + URLEncoder.encode(baos.toString(), "UTF-8");
		} catch (Exception e) {
			throw new ResourceException(e);
		}
		if (tenant != null)
			query += "&tenant=" + this.tenant;

		HttpConnector connector = getContext().get(HttpConnector.class);
		if (connector == null)
			throw new ResourceException("Unconnected resource " + getFrame().getURI());

		try {
			@SuppressWarnings({ "unchecked", "rawtypes" })
			ResponseHandler<E> handler = new HttpSaveHandler(this.resourceSerializer);
			synchronized (this.resourceSerializer) {
				entity = connector.execute("save", query, handler);
			}
			if (entity != null)
				this.attach(entity);
		} catch (Exception e) {
			throw new ResourceException(e);
		}
	}

	@SuppressWarnings("resource")
	@Override
	public E read(String id, String fields, boolean proxy) throws ResourceException {

		E entity = null;

		String query = "frame=" + getFrame().getName() + "&id=" + id.trim();
		if (tenant != null)
			query += "&tenant=" + this.tenant;
		if (proxy)
			query += "&proxy=" + proxy;

		HttpConnector connector = getContext().get(HttpConnector.class);
		if (connector == null)
			throw new ResourceException("Unconnected resource " + getFrame().getURI());

		try {
			@SuppressWarnings({ "unchecked", "rawtypes" })
			ResponseHandler<E> handler = new HttpLookupHandler(this.resourceSerializer);
			synchronized (this.resourceSerializer) {
				entity = connector.execute("lookup", query, handler);
			}
			if (entity != null)
				this.attach(entity);
		} catch (Exception e) {
			throw new ResourceException(e);
		}

		return entity;
	}

	@SuppressWarnings("resource")
	@Override
	public List<E> read(String filter, String fields, String order, int limit, boolean proxy) throws ResourceException {

		List<E> entities = null;

		String query = "frame=" + getFrame().getName();
		if (tenant != null)
			query += "&tenant=" + this.tenant;
		if (proxy)
			query += "&proxy=" + proxy;
		if (limit != 0)
			query += "&limit=" + limit;
		if (filter != null) {
			try {
				query += "&filter=" + URLEncoder.encode(filter, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				throw new ResourceException(e);
			}
		}
		if (fields != null)
			query += "&fields=" + fields;
		if (order != null)
			query += "&order=" + order;

		HttpConnector connector = getContext().get(HttpConnector.class);
		if (connector == null)
			throw new ResourceException("Unconnected resource " + getFrame().getURI());

		try {
			@SuppressWarnings({ "rawtypes", "unchecked" })
			HttpFindHandler<E> handler = new HttpFindHandler(this.resourceSerializer);
			synchronized (this.resourceSerializer) {
				entities = connector.execute("find", query, handler);
			}
			for (E entity : entities)
				this.attach(entity);
		} catch (Exception e) {
			throw new ResourceException(e);
		}

		return entities;
	}

	@Override
	public void update(E entity) throws ResourceException {
		create(entity, true);
	}

	@SuppressWarnings("resource")
	@Override
	public void delete(E entity) throws ResourceException {

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		synchronized (this.resourceSerializer) {
			this.resourceSerializer.add(entity);

			try {
				this.resourceSerializer.save(baos);
			} catch (Exception e) {
				throw new ResourceException(e);
			} finally {
				this.resourceSerializer.clear();
			}
		}

		String query = "frame=" + getFrame().getName() + "&id=" + entity.getID();
		if (tenant != null)
			query += "&tenant=" + this.tenant;

		HttpConnector connector = getContext().get(HttpConnector.class);
		if (connector == null)
			throw new ResourceException("Unconnected resource " + getFrame().getURI());

		try {
			connector.execute("delete", query, new HttpDeleteHandler());
			this.detach(entity);
		} catch (Exception e) {
			throw new ResourceException(e);
		}
	}
}