/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.List;

public class MimoUtils {

	public static <E> void addFirst(List<E> list, E element) {
		list.add(0, element);
	}

	public static <E> void addAfter(List<E> list, E oldElement, E newElement) {
		int oldElementPosition = list.indexOf(oldElement);
		list.add(oldElementPosition + 1, newElement);
	}

	public static String firstToUpper(String string) {
		StringBuffer s = new StringBuffer(string.length());
		CharacterIterator it = new StringCharacterIterator(string);
		for (char ch = it.first(); ch != CharacterIterator.DONE; ch = it.next())
			if (it.getIndex() == 0)
				s.append(String.valueOf(ch).toUpperCase());
			else
				s.append(ch);
		return s.toString();
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
