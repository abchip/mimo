/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo;

import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityEnumImpl;
import org.eclipse.emf.ecore.EEnumLiteral;

public class E4EntityEnumAdapter extends EntityEnumImpl {


	public E4EntityEnumAdapter(EEnumLiteral eEnumLiteral) {
		eSet(EntityPackage.ENTITY_ENUM__NAME, eEnumLiteral.getLiteral());
		eSet(EntityPackage.ENTITY_ENUM__TEXT, eEnumLiteral.getName());
	}
}
