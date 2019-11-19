/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.impl.ResourceImpl;

public class EMFResourceImpl<E extends EntityNameable> extends ResourceImpl<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Frame<E> frame = null;
	private Map<String, E> entities = null;
	
	protected EMFResourceImpl(Frame<E> frame) {
		this.frame = frame;
	}

	@SuppressWarnings("unchecked")
	protected void setEntities(Map<String, E> entities) {
		this.entities = entities;
		
		if(frame == null)
			this.frame = (Frame<E>) this.entities.get(Frame.class.getSimpleName());
	}
	
	@Override
	public String getTenant() {
		return null;
	}
	
	@Override
	public Frame<E> getFrame() {
		return this.frame;
	}
	
	@Override
	public void create(E entity, boolean update) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void delete(E entity) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<E> read(String filter, String fields, String order, int limit, boolean proxy) {
		List<E> entities = new ArrayList<E>(this.entities.values());

		Collections.sort(entities, new Comparator<E>() {
			@Override
			public int compare(E e1, E e2) {
				return e1.getName().compareTo(e2.getName());
			}
		});

		return entities;
	}

	@Override
	public void update(E entity) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String nextSequence() {
		throw new UnsupportedOperationException();
	}

	@Override
	public E read(String name, String fields, boolean proxy) {
		return this.entities.get(name);
	}
}