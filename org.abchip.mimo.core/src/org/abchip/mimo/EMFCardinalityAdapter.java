/**
 *  Copyright (c) 2017, 2019 ABChip and others.
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

public class EMFCardinalityAdapter extends CardinalityImpl {

	private static final long serialVersionUID = 1L;

	private ETypedElement element;

	public EMFCardinalityAdapter(ETypedElement element) {
		this.element = element;
		eSet(EntityPackage.CARDINALITY__MIN, this.element.getLowerBound());
		eSet(EntityPackage.CARDINALITY__MAX, this.element.getUpperBound());
	}
	
	@Override
	public void setMax(int value) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void setMin(int value) {
		throw new UnsupportedOperationException();
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