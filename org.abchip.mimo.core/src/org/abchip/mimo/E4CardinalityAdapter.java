/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo;

import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.CardinalityImpl;
import org.eclipse.emf.ecore.ETypedElement;

public class E4CardinalityAdapter extends CardinalityImpl {

	public E4CardinalityAdapter(ETypedElement element) {
		eSet(EntityPackage.CARDINALITY__MIN, element.getLowerBound());
		eSet(EntityPackage.CARDINALITY__MAX, element.getUpperBound());
	}

	@Override
	public boolean isMandatory() {
		return getMin() > 0 ? true : false;
	}

	@Override
	public boolean isMultiple() {
		return (getMax() == -1 || getMax() > 1) ? true : false;
	}
}