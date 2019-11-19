/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.edi.entity.EntityEvent;
import org.abchip.mimo.entity.EntityNameable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edi Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.edi.EDIPackage#getEdiManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EdiManager {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" entityRequired="true" eventRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> void writeMessage(Context context, E entity, EntityEvent event);
} // EdiManager
