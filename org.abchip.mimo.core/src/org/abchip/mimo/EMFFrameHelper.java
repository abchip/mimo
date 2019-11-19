/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityEnum;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.Resource;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Descriptor;

public class EMFFrameHelper {

	private static Map<String, Frame<?>> publicFrames = null;

	public static Map<String, Frame<?>> getFrames(Resource<Frame<?>> frameReader) {

		if (publicFrames == null) {
			synchronized (EMFFrameHelper.class) {
				if (publicFrames == null) {
					loadFrames(frameReader);
				}
			}
		}

		return publicFrames;
	}

	public static Map<String, EntityEnum> getEnumerators(Frame<EntityEnum> frame) {
		Map<String, EntityEnum> enums = new HashMap<String, EntityEnum>();

		EMFFrameEnumAdapter<EntityEnum> frameEnum = (EMFFrameEnumAdapter<EntityEnum>) frame;
		EEnum eEnum = frameEnum.getEEnum();

		for (EEnumLiteral eEnumLiteral : eEnum.getELiterals()) {
			EntityEnum entity = new EMFEntityEnumAdapter(eEnumLiteral);
			enums.put(eEnumLiteral.getName(), entity);
		}
		return enums;
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

	private static synchronized void loadFrames(Resource<Frame<?>> frameResource) {

		Map<String, Frame<?>> tempFrames = new HashMap<String, Frame<?>>();
		if (publicFrames == null)
			publicFrames = tempFrames;

		EntityPackage.eINSTANCE.getEntity();

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
						if(!tempFrames.containsKey(eClass.getName()))
							tempFrames.put(eClass.getName(), new EMFFrameClassAdapter<>(tempFrames, eClass));
					}
				} else if (eClassifier instanceof EEnum) {
					EEnum eEnum = (EEnum) eClassifier;
					if(!tempFrames.containsKey(eEnum.getName()))
						tempFrames.put(eEnum.getName(), new EMFFrameEnumAdapter<>(eEnum));
				} else if (eClassifier instanceof EDataType) {
					// TODO
				} else {
					System.out.println(eClassifier.getName());
				}
			}
		}

		Collections.unmodifiableMap(tempFrames);

		publicFrames = tempFrames;
	}
}