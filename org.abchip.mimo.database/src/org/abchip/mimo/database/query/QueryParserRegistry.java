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

import org.abchip.mimo.database.connection.ConnectionConfig;
import org.abchip.mimo.entity.EntityRegistry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Parser Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.database.query.DatabaseQueryPackage#getQueryParserRegistry()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QueryParserRegistry extends EntityRegistry<QueryParser> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" connectionConfigRequired="true"
	 * @generated
	 */
	QueryParser lookup(ConnectionConfig connectionConfig);

} // QueryParserRegistry