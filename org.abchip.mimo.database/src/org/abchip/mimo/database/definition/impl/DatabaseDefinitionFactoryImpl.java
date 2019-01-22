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
package org.abchip.mimo.database.definition.impl;

import org.abchip.mimo.database.definition.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatabaseDefinitionFactoryImpl extends EFactoryImpl implements DatabaseDefinitionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatabaseDefinitionFactory init() {
		try {
			DatabaseDefinitionFactory theDatabaseDefinitionFactory = (DatabaseDefinitionFactory)EPackage.Registry.INSTANCE.getEFactory(DatabaseDefinitionPackage.eNS_URI);
			if (theDatabaseDefinitionFactory != null) {
				return theDatabaseDefinitionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatabaseDefinitionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseDefinitionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DatabaseDefinitionPackage.CALL_STATEMENT: return (EObject)createCallStatement();
			case DatabaseDefinitionPackage.COMMIT_STATEMENT: return (EObject)createCommitStatement();
			case DatabaseDefinitionPackage.CONNECT_STATEMENT: return (EObject)createConnectStatement();
			case DatabaseDefinitionPackage.CREATE_ALIAS_STATEMENT: return (EObject)createCreateAliasStatement();
			case DatabaseDefinitionPackage.CREATE_INDEX_STATEMENT: return (EObject)createCreateIndexStatement();
			case DatabaseDefinitionPackage.CREATE_TABLE_STATEMENT: return (EObject)createCreateTableStatement();
			case DatabaseDefinitionPackage.CREATE_VIEW_STATEMENT: return (EObject)createCreateViewStatement();
			case DatabaseDefinitionPackage.DEFINITION_PARSE_ERROR: return (EObject)createDefinitionParseError();
			case DatabaseDefinitionPackage.DEFINITION_PARSE_RESULT: return (EObject)createDefinitionParseResult();
			case DatabaseDefinitionPackage.DISCONNECT_STATEMENT: return (EObject)createDisconnectStatement();
			case DatabaseDefinitionPackage.DROP_STATEMENT: return (EObject)createDropStatement();
			case DatabaseDefinitionPackage.INDEX_DEF: return (EObject)createIndexDef();
			case DatabaseDefinitionPackage.INDEX_COLUMN_DEF: return (EObject)createIndexColumnDef();
			case DatabaseDefinitionPackage.LOCK_TABLE_STATEMENT: return (EObject)createLockTableStatement();
			case DatabaseDefinitionPackage.RELEASE_STATEMENT: return (EObject)createReleaseStatement();
			case DatabaseDefinitionPackage.RENAME_STATEMENT: return (EObject)createRenameStatement();
			case DatabaseDefinitionPackage.ROLLBACK_STATEMENT: return (EObject)createRollbackStatement();
			case DatabaseDefinitionPackage.SET_CONNECTION_STATEMENT: return (EObject)createSetConnectionStatement();
			case DatabaseDefinitionPackage.SCHEMA_DEF: return (EObject)createSchemaDef();
			case DatabaseDefinitionPackage.TABLE_DEF: return (EObject)createTableDef();
			case DatabaseDefinitionPackage.TABLE_COLUMN_DEF: return (EObject)createTableColumnDef();
			case DatabaseDefinitionPackage.TABLE_TERM: return (EObject)createTableTerm();
			case DatabaseDefinitionPackage.VIEW_DEF: return (EObject)createViewDef();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DatabaseDefinitionPackage.DROP_RANGE:
				return createDropRangeFromString(eDataType, initialValue);
			case DatabaseDefinitionPackage.ORDERING_TYPE:
				return createOrderingTypeFromString(eDataType, initialValue);
			case DatabaseDefinitionPackage.SHARE_MODE:
				return createShareModeFromString(eDataType, initialValue);
			case DatabaseDefinitionPackage.TARGET_ELEMENT:
				return createTargetElementFromString(eDataType, initialValue);
			case DatabaseDefinitionPackage.TARGET_ITEM:
				return createTargetItemFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DatabaseDefinitionPackage.DROP_RANGE:
				return convertDropRangeToString(eDataType, instanceValue);
			case DatabaseDefinitionPackage.ORDERING_TYPE:
				return convertOrderingTypeToString(eDataType, instanceValue);
			case DatabaseDefinitionPackage.SHARE_MODE:
				return convertShareModeToString(eDataType, instanceValue);
			case DatabaseDefinitionPackage.TARGET_ELEMENT:
				return convertTargetElementToString(eDataType, instanceValue);
			case DatabaseDefinitionPackage.TARGET_ITEM:
				return convertTargetItemToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallStatement createCallStatement() {
		CallStatementImpl callStatement = new CallStatementImpl();
		return callStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommitStatement createCommitStatement() {
		CommitStatementImpl commitStatement = new CommitStatementImpl();
		return commitStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectStatement createConnectStatement() {
		ConnectStatementImpl connectStatement = new ConnectStatementImpl();
		return connectStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateAliasStatement createCreateAliasStatement() {
		CreateAliasStatementImpl createAliasStatement = new CreateAliasStatementImpl();
		return createAliasStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateIndexStatement createCreateIndexStatement() {
		CreateIndexStatementImpl createIndexStatement = new CreateIndexStatementImpl();
		return createIndexStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateTableStatement createCreateTableStatement() {
		CreateTableStatementImpl createTableStatement = new CreateTableStatementImpl();
		return createTableStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateViewStatement createCreateViewStatement() {
		CreateViewStatementImpl createViewStatement = new CreateViewStatementImpl();
		return createViewStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionParseError createDefinitionParseError() {
		DefinitionParseErrorImpl definitionParseError = new DefinitionParseErrorImpl();
		return definitionParseError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionParseResult createDefinitionParseResult() {
		DefinitionParseResultImpl definitionParseResult = new DefinitionParseResultImpl();
		return definitionParseResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisconnectStatement createDisconnectStatement() {
		DisconnectStatementImpl disconnectStatement = new DisconnectStatementImpl();
		return disconnectStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropStatement createDropStatement() {
		DropStatementImpl dropStatement = new DropStatementImpl();
		return dropStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexDef createIndexDef() {
		IndexDefImpl indexDef = new IndexDefImpl();
		return indexDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexColumnDef createIndexColumnDef() {
		IndexColumnDefImpl indexColumnDef = new IndexColumnDefImpl();
		return indexColumnDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LockTableStatement createLockTableStatement() {
		LockTableStatementImpl lockTableStatement = new LockTableStatementImpl();
		return lockTableStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseStatement createReleaseStatement() {
		ReleaseStatementImpl releaseStatement = new ReleaseStatementImpl();
		return releaseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameStatement createRenameStatement() {
		RenameStatementImpl renameStatement = new RenameStatementImpl();
		return renameStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RollbackStatement createRollbackStatement() {
		RollbackStatementImpl rollbackStatement = new RollbackStatementImpl();
		return rollbackStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetConnectionStatement createSetConnectionStatement() {
		SetConnectionStatementImpl setConnectionStatement = new SetConnectionStatementImpl();
		return setConnectionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaDef createSchemaDef() {
		SchemaDefImpl schemaDef = new SchemaDefImpl();
		return schemaDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableDef createTableDef() {
		TableDefImpl tableDef = new TableDefImpl();
		return tableDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableColumnDef createTableColumnDef() {
		TableColumnDefImpl tableColumnDef = new TableColumnDefImpl();
		return tableColumnDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableTerm createTableTerm() {
		TableTermImpl tableTerm = new TableTermImpl();
		return tableTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewDef createViewDef() {
		ViewDefImpl viewDef = new ViewDefImpl();
		return viewDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropRange createDropRangeFromString(EDataType eDataType, String initialValue) {
		DropRange result = DropRange.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDropRangeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderingType createOrderingTypeFromString(EDataType eDataType, String initialValue) {
		OrderingType result = OrderingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShareMode createShareModeFromString(EDataType eDataType, String initialValue) {
		ShareMode result = ShareMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShareModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetElement createTargetElementFromString(EDataType eDataType, String initialValue) {
		TargetElement result = TargetElement.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTargetElementToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetItem createTargetItemFromString(EDataType eDataType, String initialValue) {
		TargetItem result = TargetItem.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTargetItemToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseDefinitionPackage getDatabaseDefinitionPackage() {
		return (DatabaseDefinitionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DatabaseDefinitionPackage getPackage() {
		return DatabaseDefinitionPackage.eINSTANCE;
	}

} //DatabaseDefinitionFactoryImpl
