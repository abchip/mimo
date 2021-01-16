/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http:/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.query;

import org.eclipse.datatools.modelbase.sql.query.QueryStatement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Writer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.database.query.DatabaseQueryPackage#getQueryWriter()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QueryWriter extends StatementWriter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model statementRequired="true"
	 * @generated
	 */
	String writeQuery(QueryStatement statement);

} // QueryWriter
