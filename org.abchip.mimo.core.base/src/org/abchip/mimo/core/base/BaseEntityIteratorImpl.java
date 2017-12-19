/**
 * Copyright (c) 2017, 2018 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Mattia Rocchi				- Initial API and implementation
 *
 */
package org.abchip.mimo.core.base;

import java.util.Iterator;

import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.EntityNameable;

public class BaseEntityIteratorImpl<E extends EntityNameable> implements EntityIterator<E> {

	private Class<E> klass;
	private Iterator<E> iterator;

	private E nextObject = null;

	public BaseEntityIteratorImpl(Class<E> klass, Iterator<E> iterator) {
		this.klass = klass;
		this.iterator = iterator;
		doNext();
	}

	@Override
	public void close() {
		this.iterator = null;
	}

	@Override
	public boolean hasNext() {
		return nextObject != null;
	}

	@Override
	public E next() {
		E object = nextObject;
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
			E eObject = iterator.next();

			if (!klass.isInstance(eObject))
				continue;

			E tempObject = klass.cast(eObject);
			nextObject = tempObject;
			break;
		}
	}

	@Override
	public Iterator<E> iterator() {
		return this;
	}
}
