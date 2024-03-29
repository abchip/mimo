/**
 *  Copyright (c) 2017, 2021 ABChip and others.
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

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.impl.ResourceImpl;

public class E4FrameClassResourceImpl<E extends Frame<?>> extends ResourceImpl<E> {

	private Frame<E> frame = null;
	private Map<String, E> entities = null;

	protected E4FrameClassResourceImpl(Context context, Frame<E> frame, Map<String, E> frames) {
		super(context);

		this.frame = frame;
		this.entities = frames;
	}

	@Override
	public Frame<E> getFrame() {
		return this.frame;
	}

	@Override
	public E createProxy(String id) {
		if (id == null)
			return null;

		E entity = this.entities.get(id);
		return entity;
	}

	@Override
	public void create(E entity, boolean update, boolean raw) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String nextSequence() throws ResourceException {
		throw new ResourceException(new UnsupportedOperationException());
	}

	@Override
	public E lookup(String name, String fields, boolean proxy) {
		return this.entities.get(name);
	}

	@Override
	public List<E> find(String filter, String fields, String order, int limit, boolean proxy) {
		List<E> entities = new ArrayList<E>(this.entities.values());

		Collections.sort(entities, new Comparator<E>() {
			@Override
			public int compare(E e1, E e2) {
				return e1.getID().compareTo(e2.getID());
			}
		});

		return entities;
	}

	@Override
	public void update(E entity) throws ResourceException {
		throw new ResourceException(new UnsupportedOperationException());
	}

	@Override
	public void delete(E entity) throws ResourceException {
		throw new ResourceException(new UnsupportedOperationException());
	}
}