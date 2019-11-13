/**
* Copyright (c) 2017, 2019 ABChip and others.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
*/
package org.abchip.mimo.biz.base.connector;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.context.Logger;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.SerializationType;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceSerializer;
import org.abchip.mimo.resource.impl.ResourceImpl;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.entity.InputStreamEntity;

public class HttpResourceImpl<E extends EntityNameable> extends ResourceImpl<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private HttpConnector connector;
	private Logger logger;
	private ResourceSerializer<E> resourceSerializer = null;

	private String tenant = null;

	public HttpResourceImpl(ContextProvider contextProvider, Frame<E> frame, String tenant, HttpConnector connector) {
		this.logger = contextProvider.getContext().get(Logger.class);
		this.connector = connector;

		ResourceManager resourceManager = contextProvider.getContext().get(ResourceManager.class);
		this.resourceSerializer = resourceManager.createEntitySerializer(frame, SerializationType.JAVA_SCRIPT_OBJECT_NOTATION);

		if (tenant != null)
			this.tenant = tenant;
	}

	private Frame<E> getFrame() {
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

			String url = "/entityDelete?frame=" + getFrame().getName() + "&tenant=" + this.tenant;
			try (CloseableHttpResponse response = this.connector.execute(url, new InputStreamEntity(new ByteArrayInputStream(baos.toByteArray())))) {
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
		throw new UnsupportedOperationException();
	}

	@Override
	public E read(String name, String fields, boolean proxy) {

		synchronized (this.resourceSerializer) {
			E entity = null;

			String url = "/entityLookup?frame=" + getFrame().getName() + "&tenant=" + this.tenant + "&name=" + name.trim() + "&proxy=" + proxy;
			try (CloseableHttpResponse response = this.connector.execute(url, null)) {

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
	public List<E> read(String filter, String fields, int limit, boolean proxy) {

		synchronized (this.resourceSerializer) {
			List<E> entities = null;

			String url = "/entityFind?frame=" + getFrame().getName() + "&tenant=" + this.tenant + "&limit=" + limit + "&proxy=" + proxy;
			if (filter != null) {
				try {
					url += "&filter=" + URLEncoder.encode(filter, "UTF-8");
				} catch (UnsupportedEncodingException e1) {
					e1.printStackTrace();
					return null;
				}
			}

			if (fields != null)
				url += "&fields=" + fields;

			try (CloseableHttpResponse response = this.connector.execute(url, null)) {

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

			String url = "/entitySave?frame=" + getFrame().getName() + "&tenant=" + this.tenant + "&replace=" + replace;
			try (CloseableHttpResponse response = connector.execute(url, new InputStreamEntity(new ByteArrayInputStream(baos.toByteArray())))) {
			} catch (Exception e) {
				logger.error(e);
				throw new RuntimeException(e);
			} finally {
				this.resourceSerializer.clear();
			}
		}
	}
}