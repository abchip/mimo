/**
 *  Copyright (c) 2017, 2020 ABChip and others.
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

import org.abchip.mimo.entity.EntityEnum;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceSet;
import org.abchip.mimo.resource.impl.ResourceImpl;

public class E4FrameEnumResourceImpl<E extends EntityEnum> extends ResourceImpl<E> {

	private Frame<E> frame = null;
	private Map<String, E> enums = null;

	protected E4FrameEnumResourceImpl(ResourceSet resourceSet, String tenant, Frame<E> frame, Map<String, E> enums) {
		super(resourceSet, tenant);

		this.frame = frame;
		this.enums = enums;
	}

	@Override
	public Frame<E> getFrame() {
		return this.frame;
	}

	@Override
	public E createProxy(String id) {
		if (id == null)
			return null;

		E entity = this.enums.get(id);
		return entity;
	}

	@Override
	public void create(E entity, boolean update) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String nextSequence() throws ResourceException {
		throw new ResourceException(new UnsupportedOperationException());
	}

	@Override
	public E lookup(String name, String fields, boolean proxy) {
		return this.enums.get(name);
	}

	@Override
	public List<E> find(String filter, String fields, String order, int limit, boolean proxy) {
		List<E> entities = new ArrayList<E>(this.enums.values());

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
	public void delete(E entity) {
		throw new UnsupportedOperationException();
	}
}