/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.util;

import java.util.List;

import org.abchip.mimo.entity.Entity;
import org.apache.commons.lang.ClassUtils;
import org.eclipse.emf.ecore.EPackage;

public class Classes {

	@SuppressWarnings("unchecked")
	public static List<Class<?>> getAllInterfaces(Class<?> input) {
		return ClassUtils.getAllInterfaces(input);
	}

	public static String getPackageURI(Class<? extends Entity> klass) {

		Package _package = null;
		for (Class<?> _interface : klass.getInterfaces()) {
			if (Entity.class.isAssignableFrom(_interface)) {
				_package = _interface.getPackage();
				break;
			}
		}

		if (_package == null)
			_package = klass.getPackage();

		if (_package.getName().startsWith("org.abchip.mimo")) {
			String packgeName = "http://www.abchip.org/mimo" + _package.getName().substring(14).replaceAll("\\.", "/");
			return packgeName.toLowerCase();
		} else
			return _package.getName();
	}

	public static EPackage getEPackage(Class<? extends Entity> klass) {

		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(getPackageURI(klass));
		return ePackage;
	}
}
