/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.definition;

import java.io.InputStream;

import java.sql.SQLException;

import org.abchip.mimo.database.query.StatementParser;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parser</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getDefinitionParser()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DefinitionParser extends StatementParser {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException" streamDataType="org.abchip.mimo.java.JavaInputStream" streamRequired="true"
	 * @generated
	 */
	DefinitionParseResult parseDefinition(InputStream stream) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException" sqlRequired="true"
	 * @generated
	 */
	DefinitionParseResult parseDefinition(String sql) throws SQLException;

} // DefinitionParser
