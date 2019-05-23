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
package org.abchip.mimo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Frame;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Descriptor;

public class EMFFrameHelper {

	private static Map<String, Frame<?>> frames = null;

	protected static Map<String, Frame<?>> getFrames() {

		if (frames == null) {
			synchronized (EMFFrameHelper.class) {
				if (frames == null) {
					loadFrames();
				}
			}
		}

		return frames;
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

	private static synchronized void loadFrames() {

		frames = new HashMap<String, Frame<?>>();

		for (Entry<?, ?> entry : EPackage.Registry.INSTANCE.entrySet()) {

			EPackage ePackage = null;
			if (entry.getValue() instanceof EPackage.Descriptor) {
				EPackage.Descriptor descriptor = (Descriptor) entry.getValue();
				ePackage = descriptor.getEPackage();
			} else
				ePackage = (EPackage) entry.getValue();

			for (EClassifier eClassifier : ePackage.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass) eClassifier;
					if (EntityPackage.eINSTANCE.getEntity().isSuperTypeOf(eClass)) {
						frames.put(eClass.getName(), new EMFFrameAdapter<>(eClass));
					}
				}
				else if (eClassifier instanceof EEnum) {
					EEnum eEnum = (EEnum) eClassifier;
					frames.put(eEnum.getName(), new EMFFrameEnumAdapter<>(eEnum));
				}
				else if (eClassifier instanceof EDataType) {
					// TODO
				}
				else {
					System.out.println(eClassifier.getName());
				}
			}
		}

		Collections.unmodifiableMap(frames);
	}
}