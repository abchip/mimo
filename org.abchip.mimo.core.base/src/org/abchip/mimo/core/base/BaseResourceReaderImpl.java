/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.abchip.mimo.MimoResourceImpl;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.impl.ResourceReaderImpl;
import org.eclipse.emf.ecore.InternalEObject;

public class BaseResourceReaderImpl<E extends EntityIdentifiable> extends ResourceReaderImpl<E> {

	protected MimoResourceImpl<E> internal = null;

	public BaseResourceReaderImpl(MimoResourceImpl<E> internal) {
		this.internal = internal;
	}

	protected void setInternalResource(E entity) {
		InternalEObject internalEObject = (InternalEObject) entity;
		internalEObject.eSetResource(internal, null);
	}

	@Override
	public Frame<E> getFrame() {
		return this.internal.getResource().getFrame();
	}

	@Override
	public String getTenant() {
		return this.internal.getResource().getTenant();
	}

	@Override
	public Context getContext() {
		return this.internal.getContext();
	}

	@Override
	public EntityIterator<E> find(String filter, String fields, String order, int limit, boolean proxy) {

		List<E> entities = this.internal.getResource().read(filter, fields, order, limit, proxy);

		if (this.internal.getResource().getResourceConfig().isOrderSupport() && order != null) {

			String[] orders = order.split(",");
			Collections.sort(entities, new Comparator<E>() {

				@Override
				public int compare(E o1, E o2) {

					StringBuffer k1 = new StringBuffer();
					StringBuffer k2 = new StringBuffer();

					for (String order : orders) {
						order = order.trim();

						boolean desc = false;
						if (order.startsWith("-")) {
							desc = true;
							order = order.substring(1);
						}

						Object v1 = o1.isa().getValue(o1, order, false,  false);
						if (v1 == null)
							if (desc)
								return -1;
							else
								return 1;

						if (desc)
							v1 = stringComplement(v1.toString());
						k1.append(v1);

						Object v2 = o2.isa().getValue(o2, order, false, false);
						if (v2 == null)
							if (desc)
								return 1;
							else
								return -1;

						if (desc)
							v2 = stringComplement(v2.toString());
						k2.append(v2);
					}

					return k1.toString().compareTo(k2.toString());
				}
			});
		}

		EntityIterator<E> entityIterator = new BaseEntityIteratorImpl(entities.iterator(), limit, proxy);

		return entityIterator;
	}

	private static String stringComplement(String input) {

		final byte[] bytes = input.getBytes();

		final byte[] transformedBytes = new byte[bytes.length];

		byte original, transformed;

		for (int index = 0; index < bytes.length; index++) {
			original = bytes[index];
			transformed = (byte) transformByte(original);
			transformedBytes[index] = transformed;
		}

		return new String(transformedBytes);
	}

	private static int transformByte(final byte original) {
		return ~original & 0x7f;
	}

	@Override
	public E lookup(String name, boolean proxy) {

		E entity = this.internal.getResource().read(name, null, proxy);

		// if (entity != null && !proxy)
		if (entity != null)
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

		@Override
		public void close() {
			this.iterator = null;
			this.nextObject = null;
		}
	}
}