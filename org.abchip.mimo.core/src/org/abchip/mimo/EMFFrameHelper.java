/**
 *  Copyright (c) 2017, 2018 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo;

import org.abchip.mimo.entity.Entity;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

public class EMFFrameHelper {

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

	public static EClass getEClass(EPackage ePackage, Class<? extends Entity> klass) {
		EClass eClass = (EClass) ePackage.getEClassifier(getModelName(klass));
		return eClass;
	}

	public static String getModelName(Class<? extends Entity> klass) {

		Class<?> _class = null;
		for (Class<?> _interface : klass.getInterfaces()) {
			if (Entity.class.isAssignableFrom(_interface)) {
				_class = _interface;
				break;
			}
		}

		if (_class == null)
			_class = klass;

		if (_class.getSimpleName().startsWith("MU"))
			return _class.getSimpleName().substring(2);
		else
			return _class.getSimpleName().substring(1);
	}
}