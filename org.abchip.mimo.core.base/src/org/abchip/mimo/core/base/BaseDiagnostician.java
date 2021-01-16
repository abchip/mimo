/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.core.base;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityPackage;
import org.eclipse.emf.ecore.util.Diagnostician;

public class BaseDiagnostician extends Diagnostician {

	public BaseDiagnostician(Context context) {
		super();

		this.eValidatorRegistry.put(EntityPackage.eINSTANCE, new BaseValidator(context));
	}
}
