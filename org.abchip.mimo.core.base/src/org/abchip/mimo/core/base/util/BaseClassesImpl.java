/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.core.base.util;

import java.util.List;

import org.abchip.mimo.util.Classes;
import org.apache.commons.lang.ClassUtils;

public class BaseClassesImpl implements Classes {

	@SuppressWarnings("unchecked")
	@Override
	public List<Class<?>> getAllInterfaces(Class<?> input) {
		return ClassUtils.getAllInterfaces(input);
	}
}
