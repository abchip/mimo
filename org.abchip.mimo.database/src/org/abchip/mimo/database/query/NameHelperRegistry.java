/**
 * Copyright (c) 2017, 2018 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http:/**
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
package org.abchip.mimo.database.query;

import org.abchip.mimo.context.ServiceRegistry;
import org.abchip.mimo.database.connection.ConnectionConfig;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Helper Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.database.query.DatabaseQueryPackage#getNameHelperRegistry()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NameHelperRegistry extends ServiceRegistry<NameHelper> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" connectionConfigRequired="true"
	 * @generated
	 */
	NameHelper lookup(ConnectionConfig connectionConfig);

} // NameHelperRegistry
