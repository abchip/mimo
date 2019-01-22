/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.core.base.util;

import java.util.List;

import org.abchip.mimo.util.Lists;

public class BaseListsImpl implements Lists {

	@Override
	public <E> void addFirst(List<E> list, E element) {
		list.add(0, element);
	}

	@Override
	public <E> void addLast(List<E> list, E element) {
		list.add(list.size(), element);
	}

	@Override
	public <E> void addBefore(List<E> list, E oldElement, E newElement) {
		int oldElementPosition = list.indexOf(oldElement);
		list.add(oldElementPosition, newElement);
	}

	@Override
	public <E> void addAfter(List<E> list, E oldElement, E newElement) {
		int oldElementPosition = list.indexOf(oldElement);
		list.add(oldElementPosition + 1, newElement);		
	}
	
}
