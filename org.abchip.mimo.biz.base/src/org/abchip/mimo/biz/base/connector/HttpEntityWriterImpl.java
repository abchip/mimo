/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.base.connector;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntitySerializer;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.entity.ResourceHelper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.entity.InputStreamEntity;

public class HttpEntityWriterImpl<E extends EntityNameable> extends HttpEntityReaderImpl<E> implements EntityWriter<E> {

	private String resource = null;

	public HttpEntityWriterImpl(EntitySerializer<E> resourceSerializer, String resource) {
		super(resourceSerializer, resource);
		this.resource = resource;
	}

	@Override
	public void delete(E entity) {
		try {
			ResourceHelper.firePreDeleteEvent(this, entity);

			doDelete(entity);

			ResourceHelper.firePostDeleteEvent(this, entity);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String getResourceName() {
		return resource;
	}

	@Override
	public void create(E entity) {
		create(entity, false);
	}

	@Override
	public void create(E entity, boolean replace) {

		try {
			ResourceHelper.firePreSaveEvent(this, entity);

			doSave(entity, replace);

			ResourceHelper.firePostSaveEvent(this, entity);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void update(E entity) {
		create(entity, true);
	}

	private void doSave(E entity, boolean replace) throws IOException {

		HttpConnector connector = getContextProvider().getContext().get(HttpConnector.class);
		if (connector == null)
			return;

		this.getEntitySerializer().add(entity);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		this.getEntitySerializer().save(baos);

		String url = "/entitySave?frame=" + getFrame().getName() + "&resource=" + this.getResourceName() + "&replace=" + replace;
		try (CloseableHttpResponse response = connector.execute(url, new InputStreamEntity(new ByteArrayInputStream(baos.toByteArray())))) {
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.getEntitySerializer().clear();
		}
	}

	private void doDelete(E entity) throws IOException {

		HttpConnector connector = getContextProvider().getContext().get(HttpConnector.class);
		if (connector == null)
			return;

		this.getEntitySerializer().add(entity);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		this.getEntitySerializer().save(baos);

		String url = "/entityDelete?frame=" + getFrame().getName() + "&resource=" + this.getResourceName();
		try (CloseableHttpResponse response = connector.execute(url, new InputStreamEntity(new ByteArrayInputStream(baos.toByteArray())))) {
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.getEntitySerializer().clear();
		}
	}

	@Override
	public String nextSequence() {
		throw new UnsupportedOperationException();
	}
}