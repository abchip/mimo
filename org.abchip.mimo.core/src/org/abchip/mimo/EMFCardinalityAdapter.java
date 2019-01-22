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

import org.abchip.mimo.entity.Cardinality;
import org.abchip.mimo.entity.impl.EntityImpl;
import org.eclipse.emf.ecore.ETypedElement;

public class EMFCardinalityAdapter extends EntityImpl implements Cardinality {

	private static final long serialVersionUID = 1L;

	private ETypedElement element;

	public EMFCardinalityAdapter(ETypedElement element) {
		this.element = element;
	}

	@Override
	public int getMin() {
		return this.element.getLowerBound();
	}

	@Override
	public void setMin(int value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isMandatory() {
		return this.element.getLowerBound() > 0;
	}

	@Override
	public boolean isMultiple() {
		return this.element.isMany();
	}

	@Override
	public int getMax() {
		return this.element.getUpperBound();
	}

	@Override
	public void setMax(int value) {
		throw new UnsupportedOperationException();
	}
}