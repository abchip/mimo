/**
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
package org.abchip.mimo.database.definition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage
 * @generated
 */
public interface DatabaseDefinitionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatabaseDefinitionFactory eINSTANCE = org.abchip.mimo.database.definition.impl.DatabaseDefinitionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Call Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Statement</em>'.
	 * @generated
	 */
	CallStatement createCallStatement();

	/**
	 * Returns a new object of class '<em>Commit Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Commit Statement</em>'.
	 * @generated
	 */
	CommitStatement createCommitStatement();

	/**
	 * Returns a new object of class '<em>Connect Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connect Statement</em>'.
	 * @generated
	 */
	ConnectStatement createConnectStatement();

	/**
	 * Returns a new object of class '<em>Create Alias Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Alias Statement</em>'.
	 * @generated
	 */
	CreateAliasStatement createCreateAliasStatement();

	/**
	 * Returns a new object of class '<em>Create Index Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Index Statement</em>'.
	 * @generated
	 */
	CreateIndexStatement createCreateIndexStatement();

	/**
	 * Returns a new object of class '<em>Create Table Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Table Statement</em>'.
	 * @generated
	 */
	CreateTableStatement createCreateTableStatement();

	/**
	 * Returns a new object of class '<em>Create View Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create View Statement</em>'.
	 * @generated
	 */
	CreateViewStatement createCreateViewStatement();

	/**
	 * Returns a new object of class '<em>Definition Parse Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition Parse Error</em>'.
	 * @generated
	 */
	DefinitionParseError createDefinitionParseError();

	/**
	 * Returns a new object of class '<em>Definition Parse Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition Parse Result</em>'.
	 * @generated
	 */
	DefinitionParseResult createDefinitionParseResult();

	/**
	 * Returns a new object of class '<em>Disconnect Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disconnect Statement</em>'.
	 * @generated
	 */
	DisconnectStatement createDisconnectStatement();

	/**
	 * Returns a new object of class '<em>Drop Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drop Statement</em>'.
	 * @generated
	 */
	DropStatement createDropStatement();

	/**
	 * Returns a new object of class '<em>Index Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Def</em>'.
	 * @generated
	 */
	IndexDef createIndexDef();

	/**
	 * Returns a new object of class '<em>Index Column Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Column Def</em>'.
	 * @generated
	 */
	IndexColumnDef createIndexColumnDef();

	/**
	 * Returns a new object of class '<em>Lock Table Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lock Table Statement</em>'.
	 * @generated
	 */
	LockTableStatement createLockTableStatement();

	/**
	 * Returns a new object of class '<em>Release Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Release Statement</em>'.
	 * @generated
	 */
	ReleaseStatement createReleaseStatement();

	/**
	 * Returns a new object of class '<em>Rename Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rename Statement</em>'.
	 * @generated
	 */
	RenameStatement createRenameStatement();

	/**
	 * Returns a new object of class '<em>Rollback Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rollback Statement</em>'.
	 * @generated
	 */
	RollbackStatement createRollbackStatement();

	/**
	 * Returns a new object of class '<em>Set Connection Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Connection Statement</em>'.
	 * @generated
	 */
	SetConnectionStatement createSetConnectionStatement();

	/**
	 * Returns a new object of class '<em>Schema Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema Def</em>'.
	 * @generated
	 */
	SchemaDef createSchemaDef();

	/**
	 * Returns a new object of class '<em>Table Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Def</em>'.
	 * @generated
	 */
	TableDef createTableDef();

	/**
	 * Returns a new object of class '<em>Table Column Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Column Def</em>'.
	 * @generated
	 */
	TableColumnDef createTableColumnDef();

	/**
	 * Returns a new object of class '<em>Table Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Term</em>'.
	 * @generated
	 */
	TableTerm createTableTerm();

	/**
	 * Returns a new object of class '<em>View Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Def</em>'.
	 * @generated
	 */
	ViewDef createViewDef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatabaseDefinitionPackage getDatabaseDefinitionPackage();

} //DatabaseDefinitionFactory
