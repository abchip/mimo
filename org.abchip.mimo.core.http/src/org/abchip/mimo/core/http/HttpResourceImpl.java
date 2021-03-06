/**
* Copyright (c) 2017, 2021 ABChip and others.
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
import org.abchip.mimo.resource.SerializationType;
import org.abchip.mimo.resource.impl.ResourceImpl;
import org.apache.http.client.ResponseHandler;

public class HttpResourceImpl<E extends EntityIdentifiable> extends ResourceImpl<E> {

	private HttpConnector connector = null;
	private ResourceSerializer<E> resourceSerializer = null;

	private HttpResourceConfig config;
	
	public static class HttpResourceConfig {
		public String find = "find";
		public String lookup = "lookup";
	}

	public HttpResourceImpl(HttpResourceConfig config, HttpConnector connector, Frame<E> frame) {
		super(connector.getContext());

		this.connector = connector;
		this.config = config;
		
		this.resourceSerializer = this.getContext().getResourceManager().createResourceSerializer(frame, SerializationType.MIMO);
	}

	@Override
	public Frame<E> getFrame() {
		return this.resourceSerializer.getFrame();
	}

	@Override
	public String nextSequence() throws ResourceException {

		if (getFrame().getAllKeys().size() > 1)
			return null;

		String nextSequence = null;

		String query = "frame=" + getFrame().getName();
		if (getContext().getTenant() != null)
			query += "&tenant=" + this.getContext().getTenant();

		try {
			nextSequence = connector.execute("nextSequence", query, new HttpNextSequenceHandler());
		} catch (Exception e) {
			throw new ResourceException(e);
		}

		return nextSequence;
	}

	@Override
	public void create(E entity, boolean update, boolean raw) throws ResourceException {
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

		String query = "frame=" + getFrame().getName() + "&replace=" + update + "&raw=" + raw;
		if (getContext().getTenant() != null)
			query += "&tenant=" + this.getContext().getTenant();
		
		try {
			query += "&json=" + URLEncoder.encode(baos.toString(), "UTF-8");
		} catch (Exception e) {
			throw new ResourceException(e);
		}
		
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

	@Override
	public E lookup(String id, String fields, boolean proxy) throws ResourceException {

		E entity = null;

		String query = "frame=" + getFrame().getName() + "&id=" + id.trim();
		if (getContext().getTenant() != null)
			query += "&tenant=" + this.getContext().getTenant();
		if (proxy)
			query += "&proxy=" + proxy;

		try {
			@SuppressWarnings({ "unchecked", "rawtypes" })
			ResponseHandler<E> handler = new HttpLookupHandler(this.resourceSerializer);
			synchronized (this.resourceSerializer) {
				entity = connector.execute(this.config.lookup, query, handler);
			}
			if (entity != null)
				this.attach(entity);
		} catch (Exception e) {
			throw new ResourceException(e);
		}

		return entity;
	}

	@Override
	public List<E> find(String filter, String fields, String order, int limit, boolean proxy) throws ResourceException {

		List<E> entities = null;

		String query = "frame=" + getFrame().getName();
		if (getContext().getTenant() != null)
			query += "&tenant=" + this.getContext().getTenant();
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

		try {
			@SuppressWarnings({ "rawtypes", "unchecked" })
			HttpFindHandler<E> handler = new HttpFindHandler(this.resourceSerializer);
			synchronized (this.resourceSerializer) {
				entities = connector.execute(this.config.find, query, handler);
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
		create(entity, true, false);
	}

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
		if (getContext().getTenant() != null)
			query += "&tenant=" + this.getContext().getTenant();

		try {
			connector.execute("delete", query, new HttpDeleteHandler());
			this.detach(entity);
		} catch (Exception e) {
			throw new ResourceException(e);
		}
	}
}