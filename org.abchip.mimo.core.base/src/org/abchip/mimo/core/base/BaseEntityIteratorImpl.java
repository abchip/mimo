/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base;

import java.util.Iterator;

import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.EntityNameable;

public class BaseEntityIteratorImpl<E extends EntityNameable> implements EntityIterator<E> {

	private Iterator<E> iterator;
	private int nrElem = 0;
	private E nextObject = null;
	private int count = 0;
	
	public BaseEntityIteratorImpl(Iterator<E> iterator, int nrElem) {
		this.iterator = iterator;
		this.nrElem = nrElem;
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
		
		count++;
		if(nrElem > 0 && count >= nrElem)
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
			E eObject = iterator.next();

			E tempObject = eObject;
			nextObject = tempObject;
			break;
		}
	}

	@Override
	public Iterator<E> iterator() {
		return this;
	}
}
