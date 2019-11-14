/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import java.util.Iterator;
import java.util.List;

import org.abchip.mimo.MimoResourceImpl;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.ResourceDriver;
import org.abchip.mimo.resource.impl.ResourceReaderImpl;
import org.eclipse.emf.ecore.InternalEObject;

public class BaseResourceReaderImpl<E extends EntityNameable> extends ResourceReaderImpl<E> {

	protected MimoResourceImpl internal = null;
	protected ResourceDriver<E> resource = null;

	public BaseResourceReaderImpl(MimoResourceImpl internal, ResourceDriver<E> resource) {
		this.internal = internal;
		this.resource = resource;
	}

	protected void setInternalResource(E entity) {
		InternalEObject internalEObject = (InternalEObject) entity;
		internalEObject.eSetResource(internal, null);
	}

	@Override
	public Frame<E> getFrame() {
		return this.resource.getFrame();
	}

	@Override
	public ContextProvider getContextProvider() {
		return this.internal.getContextProvider();
	}

	@Override
	public EntityIterator<E> find(String filter, String fields, String order, int limit, boolean proxy) {

		List<E> entities = this.resource.read(filter, fields, order, limit, proxy);

		EntityIterator<E> entityIterator = new BaseEntityIteratorImpl(entities.iterator(), limit, proxy);

		return entityIterator;
	}

	@Override
	public E lookup(String name, boolean proxy) {

		E entity = this.resource.read(name, null, proxy);

		if (entity != null && !proxy)
			this.setInternalResource(entity);

		return entity;
	}

	private class BaseEntityIteratorImpl implements EntityIterator<E> {

		private Iterator<E> iterator;
		private int limit = 0;
		private boolean proxy = false;
		private E nextObject = null;
		private int count = 0;

		public BaseEntityIteratorImpl(Iterator<E> iterator, int limit, boolean proxy) {
			this.iterator = iterator;
			this.limit = limit;
			this.proxy = proxy;
			doNext();
		}

		@Override
		public boolean hasNext() {
			return nextObject != null;
		}

		@Override
		public E next() {
			E object = nextObject;

			count++;
			if (limit > 0 && count >= limit)
				nextObject = null;
			else
				doNext();

			return object;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}

		private void doNext() {

			nextObject = null;
			while (iterator.hasNext()) {
				E entity = iterator.next();

				if (entity != null && !proxy)
					BaseResourceReaderImpl.this.setInternalResource(entity);

				nextObject = entity;
				break;
			}
		}

		@Override
		public Iterator<E> iterator() {
			return this;
		}
	}
}