/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http:/**
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
package org.abchip.mimo.database.query;

import org.eclipse.datatools.modelbase.sql.query.QueryStatement;

import org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.database.query.DatabaseQueryPackage#getNameHelper()
 * @model interface="true" abstract="true" superTypes="org.abchip.mimo.database.query.SQLObjectNameHelper"
 * @generated
 */
public interface NameHelper extends ISQLObjectNameHelper {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model queryRequired="true"
	 * @generated
	 */
	void resolveContainers(QueryStatement query);

} // NameHelper
