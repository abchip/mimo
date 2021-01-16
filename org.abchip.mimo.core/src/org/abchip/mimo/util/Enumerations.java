/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;

public class Enumerations {

	public static <T> List<T> sort(Enumeration<T> enumeration, Comparator<T> comparator) {
		List<T> list = Collections.list(enumeration);
		Collections.sort(list, comparator);
		return list;
	}
}
