/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database;

import org.eclipse.datatools.modelbase.sql.tables.Table;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.database.DatabasePackage#getTableProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TableProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Table getTable(String schema, String table);

} // TableProvider
