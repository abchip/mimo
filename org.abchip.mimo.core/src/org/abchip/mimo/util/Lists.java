/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.util;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static <E> void addFirst(List<E> list, E element) {
		list.add(0, element);
	}

	public static <E> void addLast(List<E> list, E element) {
		list.add(list.size(), element);
	}

	public <E> void addBefore(List<E> list, E oldElement, E newElement) {
		int oldElementPosition = list.indexOf(oldElement);
		list.add(oldElementPosition, newElement);
	}

	public static <E> void addAfter(List<E> list, E oldElement, E newElement) {
		int oldElementPosition = list.indexOf(oldElement);
		list.add(oldElementPosition + 1, newElement);
	}

	public static <E> List<E> slice(List<E> list, int index, int limit) {
		List<E> result = new ArrayList<E>();
		if (index >= 0 && index < list.size()) {
			int end = index + limit < list.size() ? index + limit : list.size();
			for (int i = index; i < end; i++) {
				result.add(list.get(i));
			}
		}
		return result;
	}
}
