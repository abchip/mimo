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

import org.abchip.mimo.entity.Nameable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class EMFResourceImpl extends XMIResourceImpl implements Nameable {

	public EMFResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	public String getName() {
		URI uri = getURI();
		if (uri.segmentCount() == 0)
			return null;

		return uri.segment(0);
	}
}
