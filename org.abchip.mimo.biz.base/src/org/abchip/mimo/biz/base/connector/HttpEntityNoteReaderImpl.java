/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.base.connector;

import java.net.URLEncoder;
import java.util.Collection;

import org.abchip.mimo.biz.BizEntityNote;
import org.abchip.mimo.biz.BizEntityNoteData;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.EntitySerializer;
import org.abchip.mimo.entity.ResourceHelper;
import org.abchip.mimo.entity.ResourceManager;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;

public class HttpEntityNoteReaderImpl<E extends BizEntityNote> extends HttpEntityReaderImpl<E> {

	public HttpEntityNoteReaderImpl(EntitySerializer<E> entitySerializer, String resource) {
		super(entitySerializer, resource);
	}

	@Override
	public EntityIterator<E> find(String filter, String fields, int nrElem) {

		HttpConnector connector = getContextProvider().getContext().get(HttpConnector.class);
		if (connector == null)
			return null;

		EntityIterator<E> iterator = null;

		try {
			String url = "/entityFind?frame=" + getFrame().getName() + "&nrElem=" + nrElem;
			if (filter != null)
				url += "&filter=" + URLEncoder.encode(filter, "UTF-8");
			if (fields != null)
				url += "&fields=" + fields;

			try (CloseableHttpResponse response = connector.execute(url, null)) {
				HttpEntity jsonEntities = response.getEntity();	
				this.getEntitySerializer().load(jsonEntities.getContent(), false);
			}

			ResourceManager resourceManager = getContextProvider().getContext().get(ResourceManager.class);
			EntityReader<BizEntityNoteData> noteDataReader = resourceManager.getEntityReader(getContextProvider(), BizEntityNoteData.class);
			for (BizEntityNote entityNote : this.getEntitySerializer().getAll()) {
				BizEntityNoteData dataNote = noteDataReader.lookup(entityNote.getNoteId());
				if (dataNote != null)
					entityNote.setNote(dataNote);
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
	public E lookup(String name) {

		E entityNote = super.lookup(name);

		ResourceManager resourceManager = getContextProvider().getContext().get(ResourceManager.class);
		BizEntityNoteData dataNote = resourceManager.getEntityReader(getContextProvider(), BizEntityNoteData.class).lookup(entityNote.getNoteId());
		if (dataNote != null)
			entityNote.setNote(dataNote);

		return entityNote;
	}
}