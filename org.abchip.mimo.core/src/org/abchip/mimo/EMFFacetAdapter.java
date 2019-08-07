/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo;

import org.abchip.mimo.entity.Facet;
import org.abchip.mimo.entity.impl.EntityImpl;
import org.eclipse.emf.ecore.EAnnotation;

public class EMFFacetAdapter extends EntityImpl implements Facet {

	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private EAnnotation annotation;

	public EMFFacetAdapter(EAnnotation annotation) {
		this.annotation = annotation;
	}
}
