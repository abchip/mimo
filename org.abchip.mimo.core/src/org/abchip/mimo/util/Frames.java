/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.abchip.mimo.entity.EntityPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.osgi.service.log.Logger;

public class Frames {

	private static final Logger LOGGER = Logs.getLogger(Frames.class);

	public static EPackage getEPackage(EPackage root, String name, boolean deep) {

		for (EPackage ePackage : root.getESubpackages()) {
			if (ePackage.getName().equals(name))
				return ePackage;
		}

		if (deep) {
			for (EPackage ePackage : root.getESubpackages()) {
				ePackage = getEPackage(ePackage, name, true);
				if (ePackage != null)
					return ePackage;
			}
		}

		return null;
	}

	public static EClass getEClass(EPackage ePackage, String entityName) {

		EClassifier eClassifier = getEClassifier(ePackage, entityName);
		if (eClassifier instanceof EClass)
			return (EClass) eClassifier;

		return null;
	}

	public static EEnum getEEnum(EPackage ePackage, String entityName) {

		EClassifier eClassifier = getEClassifier(ePackage, entityName);
		if (eClassifier instanceof EEnum)
			return (EEnum) eClassifier;

		return null;
	}

	public static EClassifier getEClassifier(EPackage ePackage, String entityName) {

		EClassifier eClassifier = ePackage.getEClassifier(entityName);
		if (eClassifier != null)
			return eClassifier;

		for (EPackage eSubPackage : ePackage.getESubpackages()) {
			eClassifier = getEClassifier(eSubPackage, entityName);
			if (eClassifier != null)
				return eClassifier;
		}

		return null;
	}

	public static Map<String, EClassifier> getEClassifiers() {

		Map<String, EClassifier> eClassifiers = new HashMap<String, EClassifier>();

		for (Entry<String, Object> entry : EPackage.Registry.INSTANCE.entrySet()) {

			EPackage ePackage = null;
			if (entry.getValue() instanceof EPackage.Descriptor) {
				EPackage.Descriptor descriptor = (EPackage.Descriptor) entry.getValue();
				ePackage = descriptor.getEPackage();
			} else
				ePackage = (EPackage) entry.getValue();

			if (!ePackage.getNsURI().startsWith("http://www.abchip.org"))
				continue;

			for (EClassifier eClassifier : ePackage.getEClassifiers()) {

				if (eClassifiers.containsKey(eClassifier.getName())) {
					LOGGER.warn("Duplicated entity found {}", eClassifier.getName());
					continue;
				}

				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass) eClassifier;

					// only extends Entity
					if (!EntityPackage.eINSTANCE.getEntity().isSuperTypeOf(eClass))
						continue;

					eClassifiers.put(eClass.getName(), eClass);
				} else if (eClassifier instanceof EEnum) {
					EEnum eEnum = (EEnum) eClassifier;

					eClassifiers.put(eEnum.getName(), eEnum);
				} else if (eClassifier instanceof EDataType) {
					// TODO
					continue;
				} else {
					LOGGER.warn("Unknown classifier {}", eClassifier.getName());
				}
			}
		}

		return eClassifiers;
	}
}