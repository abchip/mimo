/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.service;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.service.ServicePackage#getServiceManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ServiceManager {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" nameRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> ServiceExecutor getServiceExecutor(Context context, String name);
} // ServiceManager
