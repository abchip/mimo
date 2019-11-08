/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.base.connector;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntitySerializer;
import org.abchip.mimo.entity.ResourceHelper;
import org.abchip.mimo.entity.impl.EntityReaderImpl;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;

public class HttpEntityReaderImpl<E extends EntityNameable> extends EntityReaderImpl<E> {

	private EntitySerializer<E> entitySerializer;
	protected String resource = null;

	public HttpEntityReaderImpl(EntitySerializer<E> entitySerializer, String resource) {
		setContextProvider(entitySerializer.getContextProvider());
		setFrame(entitySerializer.getFrame());
		this.entitySerializer = entitySerializer;
		this.resource = resource;
	}

	protected EntitySerializer<E> getEntitySerializer() {
		return entitySerializer;
	}

	@Override
	public boolean exists(String name) {
		return lookup(name) != null;
	}

	@Override
	public EntityIterator<E> find(String filter, String fields, int nrElem) {

		HttpConnector connector = getContextProvider().getContext().get(HttpConnector.class);
		if (connector == null)
			return null;

		String url = "/entityFind?frame=" + getFrame().getName() + "&resource=" + this.resource + "&nrElem=" + nrElem;
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

		EntityIterator<E> iterator = null;
		try (CloseableHttpResponse response = connector.execute(url, null)) {

			if (response != null && (response.getStatusLine().getStatusCode() == HttpServletResponse.SC_FOUND)) {
				HttpEntity jsonEntities = response.getEntity();
				this.getEntitySerializer().load(jsonEntities.getContent(), false);
			}

			iterator = ResourceHelper.wrapIterator((Collection<E>) this.getEntitySerializer().getAll());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.getEntitySerializer().clear();
		}

		return iterator;
	}

	@Override
	public List<String> findNames(String filter) {
		List<String> names = new ArrayList<String>();

		HttpConnector connector = getContextProvider().getContext().get(HttpConnector.class);
		if (connector == null)
			return null;

		StringBuffer fields = new StringBuffer();
		for (String key : frame.getKeys()) {
			if (!fields.toString().isEmpty())
				fields.append(",");
			fields.append(key);
		}
		String url = "/entityFind?frame=" + getFrame().getName() + "&resource=" + this.resource + "&fields=" + fields.toString();
		if (filter != null) {
			try {
				url += "&filter=" + URLEncoder.encode(filter, "UTF-8");
			} catch (UnsupportedEncodingException e1) {
				e1.printStackTrace();
				return null;
			}
		}

		try (CloseableHttpResponse response = connector.execute(url, null)) {

			if (response != null && response.getStatusLine().getStatusCode() == HttpServletResponse.SC_FOUND) {
				HttpEntity jsonEntities = response.getEntity();

				this.getEntitySerializer().load(jsonEntities.getContent(), false);

				for (E entity : this.getEntitySerializer().getAll()) {
					names.add(entity.getName());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.getEntitySerializer().clear();
		}

		return names;
	}

	@Override
	public E lookup(String name) {

		HttpConnector connector = getContextProvider().getContext().get(HttpConnector.class);
		if (connector == null)
			return null;

		E entity = null;

		String url = "/entityLookup?frame=" + getFrame().getName() + "&resource=" + this.resource + "&name=" + name.trim();
		try (CloseableHttpResponse response = connector.execute(url, null)) {

			if (response != null && response.getStatusLine().getStatusCode() == HttpServletResponse.SC_FOUND) {
				HttpEntity jsonEntity = response.getEntity();
				this.getEntitySerializer().load(jsonEntity.getContent(), false);
				entity = this.getEntitySerializer().get();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.getEntitySerializer().clear();
		}

		return entity;
	}
}