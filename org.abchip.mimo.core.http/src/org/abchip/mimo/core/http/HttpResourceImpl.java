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

import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.Logger;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.SerializationType;
import org.abchip.mimo.resource.impl.ResourceImpl;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;

public class HttpResourceImpl<E extends EntityIdentifiable> extends ResourceImpl<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private HttpConnector connector;
	private Logger logger;
	private ResourceSerializer<E> resourceSerializer = null;

	private String tenant = null;

	public HttpResourceImpl(Context context, Frame<E> frame, String tenant, HttpConnector connector) {
		this.logger = context.get(Logger.class);
		this.connector = connector;

		ResourceManager resourceManager = context.get(ResourceManager.class);
		this.resourceSerializer = resourceManager.createResourceSerializer(context, frame, SerializationType.JAVA_SCRIPT_MIMO_NOTATION);

		this.tenant = tenant;
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
	public void create(E entity, boolean update) {
		doSave(entity, false);
	}

	@Override
	public void delete(E entity) {

		synchronized (this.resourceSerializer) {
			this.resourceSerializer.add(entity);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();

			try {
				this.resourceSerializer.save(baos);
			} catch (Exception e) {
				logger.error(e);
				throw new RuntimeException(e);
			} finally {
				this.resourceSerializer.clear();
			}

			String query = "?frame=" + getFrame().getName() + "&id=" + entity.getID();
			if (tenant != null)
				query += "&tenant=" + this.tenant;

			try (CloseableHttpResponse response = this.connector.execute("delete", query)) {
			} catch (Exception e) {
				logger.error(e);
				throw new RuntimeException(e);
			} finally {
				this.resourceSerializer.clear();
			}
		}
	}

	@Override
	public String nextSequence() {

		String nextSequence = null;

		String query = "?frame=" + getFrame().getName();
		if (tenant != null)
			query += "&tenant=" + this.tenant;

		try (CloseableHttpResponse response = this.connector.execute("nextSequence", query)) {

			if (response != null && response.getStatusLine().getStatusCode() == HttpServletResponse.SC_FOUND) {
				HttpEntity entity = response.getEntity();
				nextSequence = EntityUtils.toString(entity, "UTF-8");
			}
		} catch (Exception e) {
			logger.error(e);
		}

		return nextSequence;
	}

	@Override
	public E read(String id, String fields, boolean proxy) {

		synchronized (this.resourceSerializer) {
			E entity = null;

			String query = "?frame=" + getFrame().getName() + "&id=" + id.trim();
			if (tenant != null)
				query += "&tenant=" + this.tenant;
			if (proxy)
				query += "&proxy=" + proxy;

			try (CloseableHttpResponse response = this.connector.execute("lookup", query)) {

				if (response != null && response.getStatusLine().getStatusCode() == HttpServletResponse.SC_FOUND) {
					HttpEntity jsonEntity = response.getEntity();
					this.resourceSerializer.load(jsonEntity.getContent(), false);
					entity = this.resourceSerializer.get();
				}
			} catch (Exception e) {
				logger.error(e);
			} finally {
				this.resourceSerializer.clear();
			}

			return entity;
		}
	}

	@Override
	public List<E> read(String filter, String fields, String order, int limit, boolean proxy) {

		synchronized (this.resourceSerializer) {
			List<E> entities = null;

			String query = "?frame=" + getFrame().getName();
			if (tenant != null)
				query += "&tenant=" + this.tenant;
			if (proxy)
				query += "&proxy=" + proxy;
			if (limit != 0)
				query += "&limit=" + limit;
			if (filter != null) {
				try {
					query += "&filter=" + URLEncoder.encode(filter, "UTF-8");
				} catch (UnsupportedEncodingException e1) {
					e1.printStackTrace();
					return null;
				}
			}
			if (fields != null)
				query += "&fields=" + fields;
			if (order != null)
				query += "&order=" + order;

			try (CloseableHttpResponse response = this.connector.execute("find", query)) {

				if (response != null && (response.getStatusLine().getStatusCode() == HttpServletResponse.SC_FOUND)) {
					HttpEntity jsonEntities = response.getEntity();
					this.resourceSerializer.load(jsonEntities.getContent(), false);
				}

				entities = this.resourceSerializer.getAll();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				this.resourceSerializer.clear();
			}

			return entities;
		}
	}

	@Override
	public void update(E entity) {
		doSave(entity, true);
	}

	private void doSave(E entity, boolean replace) {

		synchronized (this.resourceSerializer) {
			this.resourceSerializer.add(entity);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			try {
				this.resourceSerializer.save(baos);
			} catch (IOException e) {
				logger.error(e);
				throw new RuntimeException(e);
			} finally {
				this.resourceSerializer.clear();
			}

			String query = "?frame=" + getFrame().getName() + "&replace=" + replace + "&json=" + baos.toString();
			if (tenant != null)
				query += "&tenant=" + this.tenant;

			try (CloseableHttpResponse response = connector.execute("save", query)) {
			} catch (Exception e) {
				logger.error(e);
				throw new RuntimeException(e);
			} finally {
				this.resourceSerializer.clear();
			}
		}
	}
}