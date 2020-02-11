/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.definition.impl;

import org.abchip.mimo.MimoPackage;
import org.abchip.mimo.context.ContextPackage;
import org.abchip.mimo.data.DataPackage;
import org.abchip.mimo.database.DatabasePackage;

import org.abchip.mimo.database.connection.DatabaseConnectionPackage;

import org.abchip.mimo.database.connection.impl.DatabaseConnectionPackageImpl;

import org.abchip.mimo.database.definition.CallStatement;
import org.abchip.mimo.database.definition.CommitStatement;
import org.abchip.mimo.database.definition.ConnectStatement;
import org.abchip.mimo.database.definition.CreateAliasStatement;
import org.abchip.mimo.database.definition.CreateIndexStatement;
import org.abchip.mimo.database.definition.CreateTableStatement;
import org.abchip.mimo.database.definition.CreateViewStatement;
import org.abchip.mimo.database.definition.DatabaseDefinitionFactory;
import org.abchip.mimo.database.definition.DatabaseDefinitionPackage;
import org.abchip.mimo.database.definition.DatabaseObjectDef;
import org.abchip.mimo.database.definition.DefinitionParseError;
import org.abchip.mimo.database.definition.DefinitionParseResult;
import org.abchip.mimo.database.definition.DefinitionParser;
import org.abchip.mimo.database.definition.DefinitionParserRegistry;
import org.abchip.mimo.database.definition.DefinitionStatement;
import org.abchip.mimo.database.definition.DefinitionWriter;
import org.abchip.mimo.database.definition.DefinitionWriterRegistry;
import org.abchip.mimo.database.definition.DisconnectStatement;
import org.abchip.mimo.database.definition.DropRange;
import org.abchip.mimo.database.definition.DropStatement;
import org.abchip.mimo.database.definition.IndexColumnDef;
import org.abchip.mimo.database.definition.IndexDef;
import org.abchip.mimo.database.definition.LockTableStatement;
import org.abchip.mimo.database.definition.OrderingType;
import org.abchip.mimo.database.definition.ReleaseStatement;
import org.abchip.mimo.database.definition.RenameStatement;
import org.abchip.mimo.database.definition.RollbackStatement;
import org.abchip.mimo.database.definition.SchemaDef;
import org.abchip.mimo.database.definition.SetConnectionStatement;
import org.abchip.mimo.database.definition.ShareMode;
import org.abchip.mimo.database.definition.TableColumnDef;
import org.abchip.mimo.database.definition.TableDef;
import org.abchip.mimo.database.definition.TableTerm;
import org.abchip.mimo.database.definition.TargetElement;
import org.abchip.mimo.database.definition.TargetItem;
import org.abchip.mimo.database.definition.ViewDef;

import org.abchip.mimo.database.impl.DatabasePackageImpl;

import org.abchip.mimo.database.query.DatabaseQueryPackage;

import org.abchip.mimo.database.query.impl.DatabaseQueryPackageImpl;

import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.java.JavaPackage;
import org.eclipse.datatools.modelbase.sql.accesscontrol.SQLAccessControlPackage;

import org.eclipse.datatools.modelbase.sql.constraints.SQLConstraintsPackage;

import org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage;

import org.eclipse.datatools.modelbase.sql.expressions.SQLExpressionsPackage;

import org.eclipse.datatools.modelbase.sql.query.SQLQueryModelPackage;

import org.eclipse.datatools.modelbase.sql.routines.SQLRoutinesPackage;

import org.eclipse.datatools.modelbase.sql.schema.SQLSchemaPackage;

import org.eclipse.datatools.modelbase.sql.statements.SQLStatementsPackage;

import org.eclipse.datatools.modelbase.sql.tables.SQLTablesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatabaseDefinitionPackageImpl extends EPackageImpl implements DatabaseDefinitionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commitStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createAliasStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createIndexStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createTableStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createViewStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseObjectDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionParserRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionParseErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionParseResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionWriterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionWriterRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disconnectStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexColumnDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lockTableStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renameStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rollbackStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setConnectionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableColumnDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dropRangeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shareModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum targetElementEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum targetItemEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatabaseDefinitionPackageImpl() {
		super(eNS_URI, DatabaseDefinitionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DatabaseDefinitionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatabaseDefinitionPackage init() {
		if (isInited) return (DatabaseDefinitionPackage)EPackage.Registry.INSTANCE.getEPackage(DatabaseDefinitionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDatabaseDefinitionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DatabaseDefinitionPackageImpl theDatabaseDefinitionPackage = registeredDatabaseDefinitionPackage instanceof DatabaseDefinitionPackageImpl ? (DatabaseDefinitionPackageImpl)registeredDatabaseDefinitionPackage : new DatabaseDefinitionPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		MimoPackage.eINSTANCE.eClass();
		SQLSchemaPackage.eINSTANCE.eClass();
		SQLConstraintsPackage.eINSTANCE.eClass();
		SQLDataTypesPackage.eINSTANCE.eClass();
		SQLExpressionsPackage.eINSTANCE.eClass();
		SQLRoutinesPackage.eINSTANCE.eClass();
		SQLStatementsPackage.eINSTANCE.eClass();
		SQLTablesPackage.eINSTANCE.eClass();
		SQLAccessControlPackage.eINSTANCE.eClass();
		SQLQueryModelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DatabasePackage.eNS_URI);
		DatabasePackageImpl theDatabasePackage = (DatabasePackageImpl)(registeredPackage instanceof DatabasePackageImpl ? registeredPackage : DatabasePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DatabaseConnectionPackage.eNS_URI);
		DatabaseConnectionPackageImpl theDatabaseConnectionPackage = (DatabaseConnectionPackageImpl)(registeredPackage instanceof DatabaseConnectionPackageImpl ? registeredPackage : DatabaseConnectionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DatabaseQueryPackage.eNS_URI);
		DatabaseQueryPackageImpl theDatabaseQueryPackage = (DatabaseQueryPackageImpl)(registeredPackage instanceof DatabaseQueryPackageImpl ? registeredPackage : DatabaseQueryPackage.eINSTANCE);

		// Create package meta-data objects
		theDatabaseDefinitionPackage.createPackageContents();
		theDatabasePackage.createPackageContents();
		theDatabaseConnectionPackage.createPackageContents();
		theDatabaseQueryPackage.createPackageContents();

		// Initialize created meta-data
		theDatabaseDefinitionPackage.initializePackageContents();
		theDatabasePackage.initializePackageContents();
		theDatabaseConnectionPackage.initializePackageContents();
		theDatabaseQueryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatabaseDefinitionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatabaseDefinitionPackage.eNS_URI, theDatabaseDefinitionPackage);
		return theDatabaseDefinitionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCallStatement() {
		return callStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCallStatement_ProcedureName() {
		return (EReference)callStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCallStatement_Parms() {
		return (EAttribute)callStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommitStatement() {
		return commitStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommitStatement_Hold() {
		return (EAttribute)commitStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectStatement() {
		return connectStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectStatement_Pwd() {
		return (EAttribute)connectStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectStatement_Reset() {
		return (EAttribute)connectStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectStatement_To() {
		return (EAttribute)connectStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectStatement_User() {
		return (EAttribute)connectStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreateAliasStatement() {
		return createAliasStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCreateAliasStatement_AliasName() {
		return (EReference)createAliasStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCreateAliasStatement_TableName() {
		return (EReference)createAliasStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreateIndexStatement() {
		return createIndexStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCreateIndexStatement_IndexName() {
		return (EReference)createIndexStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCreateIndexStatement_OnTable() {
		return (EReference)createIndexStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCreateIndexStatement_SortBy() {
		return (EReference)createIndexStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreateIndexStatement_Unique() {
		return (EAttribute)createIndexStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreateTableStatement() {
		return createTableStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCreateTableStatement_TableName() {
		return (EReference)createTableStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCreateTableStatement_Fields() {
		return (EReference)createTableStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreateViewStatement() {
		return createViewStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCreateViewStatement_ViewName() {
		return (EReference)createViewStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreateViewStatement_Fields() {
		return (EAttribute)createViewStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreateViewStatement_Query() {
		return (EAttribute)createViewStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabaseObjectDef() {
		return databaseObjectDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabaseObjectDef_Label() {
		return (EAttribute)databaseObjectDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefinitionParser() {
		return definitionParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefinitionParserRegistry() {
		return definitionParserRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefinitionParseError() {
		return definitionParseErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefinitionParseResult() {
		return definitionParseResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinitionParseResult_DefinitionStatement() {
		return (EReference)definitionParseResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinitionParseResult_ErrorList() {
		return (EReference)definitionParseResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefinitionStatement() {
		return definitionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefinitionWriter() {
		return definitionWriterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefinitionWriterRegistry() {
		return definitionWriterRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDisconnectStatement() {
		return disconnectStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDisconnectStatement_Target() {
		return (EAttribute)disconnectStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDropStatement() {
		return dropStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDropStatement_Range() {
		return (EAttribute)dropStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDropStatement_TargetName() {
		return (EReference)dropStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDropStatement_Target() {
		return (EAttribute)dropStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndexDef() {
		return indexDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIndexDef_Clustered() {
		return (EAttribute)indexDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIndexDef_Columns() {
		return (EReference)indexDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIndexDef_Unique() {
		return (EAttribute)indexDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndexColumnDef() {
		return indexColumnDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIndexColumnDef_Name() {
		return (EAttribute)indexColumnDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIndexColumnDef_Ordering() {
		return (EAttribute)indexColumnDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIndexColumnDef_Sequence() {
		return (EAttribute)indexColumnDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLockTableStatement() {
		return lockTableStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLockTableStatement_AllowRead() {
		return (EAttribute)lockTableStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLockTableStatement_ShareMode() {
		return (EAttribute)lockTableStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLockTableStatement_TableName() {
		return (EReference)lockTableStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReleaseStatement() {
		return releaseStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReleaseStatement_ServerName() {
		return (EAttribute)releaseStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRenameStatement() {
		return renameStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRenameStatement_NewName() {
		return (EAttribute)renameStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRenameStatement_System() {
		return (EAttribute)renameStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRenameStatement_OriginalName() {
		return (EReference)renameStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRenameStatement_Target() {
		return (EAttribute)renameStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRollbackStatement() {
		return rollbackStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRollbackStatement_Hold() {
		return (EAttribute)rollbackStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetConnectionStatement() {
		return setConnectionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetConnectionStatement_DatabaseName() {
		return (EAttribute)setConnectionStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchemaDef() {
		return schemaDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableDef() {
		return tableDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableDef_Columns() {
		return (EReference)tableDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableColumnDef() {
		return tableColumnDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableColumnDef_Default() {
		return (EAttribute)tableColumnDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableColumnDef_Definition() {
		return (EReference)tableColumnDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableColumnDef_Name() {
		return (EAttribute)tableColumnDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableColumnDef_Nullable() {
		return (EAttribute)tableColumnDefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableTerm() {
		return tableTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableTerm_Name() {
		return (EAttribute)tableTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableTerm_TableDef() {
		return (EReference)tableTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewDef() {
		return viewDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViewDef_QuerySelect() {
		return (EAttribute)viewDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDropRange() {
		return dropRangeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOrderingType() {
		return orderingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getShareMode() {
		return shareModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTargetElement() {
		return targetElementEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTargetItem() {
		return targetItemEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatabaseDefinitionFactory getDatabaseDefinitionFactory() {
		return (DatabaseDefinitionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		callStatementEClass = createEClass(CALL_STATEMENT);
		createEReference(callStatementEClass, CALL_STATEMENT__PROCEDURE_NAME);
		createEAttribute(callStatementEClass, CALL_STATEMENT__PARMS);

		commitStatementEClass = createEClass(COMMIT_STATEMENT);
		createEAttribute(commitStatementEClass, COMMIT_STATEMENT__HOLD);

		connectStatementEClass = createEClass(CONNECT_STATEMENT);
		createEAttribute(connectStatementEClass, CONNECT_STATEMENT__PWD);
		createEAttribute(connectStatementEClass, CONNECT_STATEMENT__RESET);
		createEAttribute(connectStatementEClass, CONNECT_STATEMENT__TO);
		createEAttribute(connectStatementEClass, CONNECT_STATEMENT__USER);

		createAliasStatementEClass = createEClass(CREATE_ALIAS_STATEMENT);
		createEReference(createAliasStatementEClass, CREATE_ALIAS_STATEMENT__ALIAS_NAME);
		createEReference(createAliasStatementEClass, CREATE_ALIAS_STATEMENT__TABLE_NAME);

		createIndexStatementEClass = createEClass(CREATE_INDEX_STATEMENT);
		createEReference(createIndexStatementEClass, CREATE_INDEX_STATEMENT__INDEX_NAME);
		createEReference(createIndexStatementEClass, CREATE_INDEX_STATEMENT__ON_TABLE);
		createEReference(createIndexStatementEClass, CREATE_INDEX_STATEMENT__SORT_BY);
		createEAttribute(createIndexStatementEClass, CREATE_INDEX_STATEMENT__UNIQUE);

		createTableStatementEClass = createEClass(CREATE_TABLE_STATEMENT);
		createEReference(createTableStatementEClass, CREATE_TABLE_STATEMENT__TABLE_NAME);
		createEReference(createTableStatementEClass, CREATE_TABLE_STATEMENT__FIELDS);

		createViewStatementEClass = createEClass(CREATE_VIEW_STATEMENT);
		createEReference(createViewStatementEClass, CREATE_VIEW_STATEMENT__VIEW_NAME);
		createEAttribute(createViewStatementEClass, CREATE_VIEW_STATEMENT__FIELDS);
		createEAttribute(createViewStatementEClass, CREATE_VIEW_STATEMENT__QUERY);

		databaseObjectDefEClass = createEClass(DATABASE_OBJECT_DEF);
		createEAttribute(databaseObjectDefEClass, DATABASE_OBJECT_DEF__LABEL);

		definitionParserEClass = createEClass(DEFINITION_PARSER);

		definitionParserRegistryEClass = createEClass(DEFINITION_PARSER_REGISTRY);

		definitionParseErrorEClass = createEClass(DEFINITION_PARSE_ERROR);

		definitionParseResultEClass = createEClass(DEFINITION_PARSE_RESULT);
		createEReference(definitionParseResultEClass, DEFINITION_PARSE_RESULT__DEFINITION_STATEMENT);
		createEReference(definitionParseResultEClass, DEFINITION_PARSE_RESULT__ERROR_LIST);

		definitionStatementEClass = createEClass(DEFINITION_STATEMENT);

		definitionWriterEClass = createEClass(DEFINITION_WRITER);

		definitionWriterRegistryEClass = createEClass(DEFINITION_WRITER_REGISTRY);

		disconnectStatementEClass = createEClass(DISCONNECT_STATEMENT);
		createEAttribute(disconnectStatementEClass, DISCONNECT_STATEMENT__TARGET);

		dropStatementEClass = createEClass(DROP_STATEMENT);
		createEAttribute(dropStatementEClass, DROP_STATEMENT__RANGE);
		createEReference(dropStatementEClass, DROP_STATEMENT__TARGET_NAME);
		createEAttribute(dropStatementEClass, DROP_STATEMENT__TARGET);

		indexDefEClass = createEClass(INDEX_DEF);
		createEAttribute(indexDefEClass, INDEX_DEF__CLUSTERED);
		createEReference(indexDefEClass, INDEX_DEF__COLUMNS);
		createEAttribute(indexDefEClass, INDEX_DEF__UNIQUE);

		indexColumnDefEClass = createEClass(INDEX_COLUMN_DEF);
		createEAttribute(indexColumnDefEClass, INDEX_COLUMN_DEF__NAME);
		createEAttribute(indexColumnDefEClass, INDEX_COLUMN_DEF__ORDERING);
		createEAttribute(indexColumnDefEClass, INDEX_COLUMN_DEF__SEQUENCE);

		lockTableStatementEClass = createEClass(LOCK_TABLE_STATEMENT);
		createEAttribute(lockTableStatementEClass, LOCK_TABLE_STATEMENT__ALLOW_READ);
		createEAttribute(lockTableStatementEClass, LOCK_TABLE_STATEMENT__SHARE_MODE);
		createEReference(lockTableStatementEClass, LOCK_TABLE_STATEMENT__TABLE_NAME);

		releaseStatementEClass = createEClass(RELEASE_STATEMENT);
		createEAttribute(releaseStatementEClass, RELEASE_STATEMENT__SERVER_NAME);

		renameStatementEClass = createEClass(RENAME_STATEMENT);
		createEAttribute(renameStatementEClass, RENAME_STATEMENT__NEW_NAME);
		createEAttribute(renameStatementEClass, RENAME_STATEMENT__SYSTEM);
		createEReference(renameStatementEClass, RENAME_STATEMENT__ORIGINAL_NAME);
		createEAttribute(renameStatementEClass, RENAME_STATEMENT__TARGET);

		rollbackStatementEClass = createEClass(ROLLBACK_STATEMENT);
		createEAttribute(rollbackStatementEClass, ROLLBACK_STATEMENT__HOLD);

		setConnectionStatementEClass = createEClass(SET_CONNECTION_STATEMENT);
		createEAttribute(setConnectionStatementEClass, SET_CONNECTION_STATEMENT__DATABASE_NAME);

		schemaDefEClass = createEClass(SCHEMA_DEF);

		tableDefEClass = createEClass(TABLE_DEF);
		createEReference(tableDefEClass, TABLE_DEF__COLUMNS);

		tableColumnDefEClass = createEClass(TABLE_COLUMN_DEF);
		createEAttribute(tableColumnDefEClass, TABLE_COLUMN_DEF__DEFAULT);
		createEReference(tableColumnDefEClass, TABLE_COLUMN_DEF__DEFINITION);
		createEAttribute(tableColumnDefEClass, TABLE_COLUMN_DEF__NAME);
		createEAttribute(tableColumnDefEClass, TABLE_COLUMN_DEF__NULLABLE);

		tableTermEClass = createEClass(TABLE_TERM);
		createEAttribute(tableTermEClass, TABLE_TERM__NAME);
		createEReference(tableTermEClass, TABLE_TERM__TABLE_DEF);

		viewDefEClass = createEClass(VIEW_DEF);
		createEAttribute(viewDefEClass, VIEW_DEF__QUERY_SELECT);

		// Create enums
		dropRangeEEnum = createEEnum(DROP_RANGE);
		orderingTypeEEnum = createEEnum(ORDERING_TYPE);
		shareModeEEnum = createEEnum(SHARE_MODE);
		targetElementEEnum = createEEnum(TARGET_ELEMENT);
		targetItemEEnum = createEEnum(TARGET_ITEM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DatabasePackage theDatabasePackage = (DatabasePackage)EPackage.Registry.INSTANCE.getEPackage(DatabasePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		DatabaseQueryPackage theDatabaseQueryPackage = (DatabaseQueryPackage)EPackage.Registry.INSTANCE.getEPackage(DatabaseQueryPackage.eNS_URI);
		JavaPackage theJavaPackage = (JavaPackage)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);
		ContextPackage theContextPackage = (ContextPackage)EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
		DatabaseConnectionPackage theDatabaseConnectionPackage = (DatabaseConnectionPackage)EPackage.Registry.INSTANCE.getEPackage(DatabaseConnectionPackage.eNS_URI);
		SQLTablesPackage theSQLTablesPackage = (SQLTablesPackage)EPackage.Registry.INSTANCE.getEPackage(SQLTablesPackage.eNS_URI);
		SQLSchemaPackage theSQLSchemaPackage = (SQLSchemaPackage)EPackage.Registry.INSTANCE.getEPackage(SQLSchemaPackage.eNS_URI);
		SQLConstraintsPackage theSQLConstraintsPackage = (SQLConstraintsPackage)EPackage.Registry.INSTANCE.getEPackage(SQLConstraintsPackage.eNS_URI);
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		callStatementEClass.getESuperTypes().add(this.getDefinitionStatement());
		commitStatementEClass.getESuperTypes().add(this.getDefinitionStatement());
		connectStatementEClass.getESuperTypes().add(this.getDefinitionStatement());
		createAliasStatementEClass.getESuperTypes().add(this.getDefinitionStatement());
		createIndexStatementEClass.getESuperTypes().add(this.getDefinitionStatement());
		createTableStatementEClass.getESuperTypes().add(this.getDefinitionStatement());
		createViewStatementEClass.getESuperTypes().add(this.getDefinitionStatement());
		databaseObjectDefEClass.getESuperTypes().add(theEntityPackage.getEntity());
		definitionParserEClass.getESuperTypes().add(theDatabaseQueryPackage.getStatementParser());
		EGenericType g1 = createEGenericType(theContextPackage.getRegistry());
		EGenericType g2 = createEGenericType(this.getDefinitionParser());
		g1.getETypeArguments().add(g2);
		definitionParserRegistryEClass.getEGenericSuperTypes().add(g1);
		definitionStatementEClass.getESuperTypes().add(theEntityPackage.getEntity());
		definitionWriterEClass.getESuperTypes().add(theDatabaseQueryPackage.getStatementWriter());
		g1 = createEGenericType(theContextPackage.getRegistry());
		g2 = createEGenericType(this.getDefinitionWriter());
		g1.getETypeArguments().add(g2);
		definitionWriterRegistryEClass.getEGenericSuperTypes().add(g1);
		disconnectStatementEClass.getESuperTypes().add(this.getDefinitionStatement());
		dropStatementEClass.getESuperTypes().add(this.getDefinitionStatement());
		indexDefEClass.getESuperTypes().add(this.getDatabaseObjectDef());
		indexColumnDefEClass.getESuperTypes().add(this.getDatabaseObjectDef());
		lockTableStatementEClass.getESuperTypes().add(this.getDefinitionStatement());
		releaseStatementEClass.getESuperTypes().add(this.getDefinitionStatement());
		renameStatementEClass.getESuperTypes().add(this.getDefinitionStatement());
		rollbackStatementEClass.getESuperTypes().add(this.getDefinitionStatement());
		setConnectionStatementEClass.getESuperTypes().add(this.getDefinitionStatement());
		schemaDefEClass.getESuperTypes().add(this.getDatabaseObjectDef());
		tableDefEClass.getESuperTypes().add(this.getDatabaseObjectDef());
		tableColumnDefEClass.getESuperTypes().add(this.getDatabaseObjectDef());
		tableTermEClass.getESuperTypes().add(theEntityPackage.getEntityIdentifiable());
		viewDefEClass.getESuperTypes().add(this.getTableDef());

		// Initialize classes and features; add operations and parameters
		initEClass(callStatementEClass, CallStatement.class, "CallStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallStatement_ProcedureName(), theDatabasePackage.getQualifiedName(), null, "procedureName", null, 0, 1, CallStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallStatement_Parms(), theEcorePackage.getEString(), "parms", null, 0, -1, CallStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commitStatementEClass, CommitStatement.class, "CommitStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommitStatement_Hold(), theEcorePackage.getEBoolean(), "hold", null, 0, 1, CommitStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectStatementEClass, ConnectStatement.class, "ConnectStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectStatement_Pwd(), theEcorePackage.getEString(), "pwd", null, 0, 1, ConnectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectStatement_Reset(), theEcorePackage.getEBoolean(), "reset", null, 0, 1, ConnectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectStatement_To(), theEcorePackage.getEString(), "to", null, 0, 1, ConnectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectStatement_User(), theEcorePackage.getEString(), "user", null, 0, 1, ConnectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createAliasStatementEClass, CreateAliasStatement.class, "CreateAliasStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateAliasStatement_AliasName(), theDatabasePackage.getQualifiedName(), null, "aliasName", null, 0, 1, CreateAliasStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreateAliasStatement_TableName(), theDatabasePackage.getQualifiedName(), null, "tableName", null, 0, 1, CreateAliasStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createIndexStatementEClass, CreateIndexStatement.class, "CreateIndexStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateIndexStatement_IndexName(), theDatabasePackage.getQualifiedName(), null, "indexName", null, 0, 1, CreateIndexStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreateIndexStatement_OnTable(), theDatabasePackage.getQualifiedName(), null, "onTable", null, 0, 1, CreateIndexStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreateIndexStatement_SortBy(), this.getIndexDef(), null, "sortBy", null, 0, 1, CreateIndexStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateIndexStatement_Unique(), theEcorePackage.getEBoolean(), "unique", null, 0, 1, CreateIndexStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createTableStatementEClass, CreateTableStatement.class, "CreateTableStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateTableStatement_TableName(), theDatabasePackage.getQualifiedName(), null, "tableName", null, 0, 1, CreateTableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreateTableStatement_Fields(), this.getTableColumnDef(), null, "fields", null, 1, -1, CreateTableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createViewStatementEClass, CreateViewStatement.class, "CreateViewStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateViewStatement_ViewName(), theDatabasePackage.getQualifiedName(), null, "viewName", null, 0, 1, CreateViewStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateViewStatement_Fields(), ecorePackage.getEString(), "fields", null, 1, -1, CreateViewStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateViewStatement_Query(), theEcorePackage.getEString(), "query", null, 0, 1, CreateViewStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseObjectDefEClass, DatabaseObjectDef.class, "DatabaseObjectDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabaseObjectDef_Label(), ecorePackage.getEString(), "label", null, 0, 1, DatabaseObjectDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionParserEClass, DefinitionParser.class, "DefinitionParser", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(definitionParserEClass, this.getDefinitionParseResult(), "parseDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJavaPackage.getJavaInputStream(), "stream", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(definitionParserEClass, this.getDefinitionParseResult(), "parseDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		initEClass(definitionParserRegistryEClass, DefinitionParserRegistry.class, "DefinitionParserRegistry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(definitionParserRegistryEClass, this.getDefinitionParser(), "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseConnectionPackage.getConnectionConfig(), "connectionConfig", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(definitionParseErrorEClass, DefinitionParseError.class, "DefinitionParseError", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(definitionParseResultEClass, DefinitionParseResult.class, "DefinitionParseResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinitionParseResult_DefinitionStatement(), this.getDefinitionStatement(), null, "definitionStatement", null, 0, 1, DefinitionParseResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinitionParseResult_ErrorList(), this.getDefinitionParseError(), null, "errorList", null, 0, -1, DefinitionParseResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionStatementEClass, DefinitionStatement.class, "DefinitionStatement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(definitionStatementEClass, theDatabaseConnectionPackage.getStatementType(), "getStatementType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(definitionWriterEClass, DefinitionWriter.class, "DefinitionWriter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "copyTableData", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "tableFrom", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "tableTo", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isCreateRelativeRecordNumber", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "countRecords", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "createLabel", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSchemaDef(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "createLabel", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLSchemaPackage.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTableDef(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "createLabelForFields", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLSchemaPackage.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTableDef(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "createSchema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSchemaDef(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "createTable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLSchemaPackage.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTableDef(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "createView", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLSchemaPackage.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getViewDef(), "view", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "createIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIndexDef(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "dropSchema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLSchemaPackage.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "ignoreFailOnNonEmpty", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "dropTable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "dropView", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getViewTable(), "view", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "dropIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLConstraintsPackage.getIndex(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "deleteData", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "hasLogicals", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "insertData", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "insertData", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "fieldNames", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "renameIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLConstraintsPackage.getIndex(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "newName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "renameTable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "newName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "resetIdentity", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "selectData", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(definitionWriterEClass, ecorePackage.getEString(), "truncateTable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(definitionWriterRegistryEClass, DefinitionWriterRegistry.class, "DefinitionWriterRegistry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(definitionWriterRegistryEClass, this.getDefinitionWriter(), "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseConnectionPackage.getConnectionConfig(), "connectionConfig", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(disconnectStatementEClass, DisconnectStatement.class, "DisconnectStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisconnectStatement_Target(), this.getTargetItem(), "target", null, 0, 1, DisconnectStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dropStatementEClass, DropStatement.class, "DropStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDropStatement_Range(), this.getDropRange(), "range", null, 0, 1, DropStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDropStatement_TargetName(), theDatabasePackage.getQualifiedName(), null, "targetName", null, 0, 1, DropStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropStatement_Target(), this.getTargetElement(), "target", null, 0, 1, DropStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indexDefEClass, IndexDef.class, "IndexDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndexDef_Clustered(), ecorePackage.getEBoolean(), "clustered", null, 0, 1, IndexDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndexDef_Columns(), this.getIndexColumnDef(), null, "columns", null, 0, -1, IndexDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexDef_Unique(), ecorePackage.getEBoolean(), "unique", null, 0, 1, IndexDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indexColumnDefEClass, IndexColumnDef.class, "IndexColumnDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndexColumnDef_Name(), ecorePackage.getEString(), "name", null, 1, 1, IndexColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexColumnDef_Ordering(), this.getOrderingType(), "ordering", null, 1, 1, IndexColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexColumnDef_Sequence(), ecorePackage.getEInt(), "sequence", null, 1, 1, IndexColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lockTableStatementEClass, LockTableStatement.class, "LockTableStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLockTableStatement_AllowRead(), theEcorePackage.getEBoolean(), "allowRead", null, 0, 1, LockTableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLockTableStatement_ShareMode(), this.getShareMode(), "shareMode", null, 0, 1, LockTableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLockTableStatement_TableName(), theDatabasePackage.getQualifiedName(), null, "tableName", null, 0, 1, LockTableStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(releaseStatementEClass, ReleaseStatement.class, "ReleaseStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReleaseStatement_ServerName(), theEcorePackage.getEString(), "serverName", null, 0, 1, ReleaseStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(renameStatementEClass, RenameStatement.class, "RenameStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRenameStatement_NewName(), theEcorePackage.getEString(), "newName", null, 0, 1, RenameStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenameStatement_System(), theEcorePackage.getEString(), "system", null, 0, 1, RenameStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRenameStatement_OriginalName(), theDatabasePackage.getQualifiedName(), null, "originalName", null, 0, 1, RenameStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenameStatement_Target(), this.getTargetElement(), "target", null, 0, 1, RenameStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rollbackStatementEClass, RollbackStatement.class, "RollbackStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRollbackStatement_Hold(), theEcorePackage.getEBoolean(), "hold", null, 0, 1, RollbackStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setConnectionStatementEClass, SetConnectionStatement.class, "SetConnectionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetConnectionStatement_DatabaseName(), theEcorePackage.getEString(), "databaseName", null, 0, 1, SetConnectionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaDefEClass, SchemaDef.class, "SchemaDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableDefEClass, TableDef.class, "TableDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableDef_Columns(), this.getTableColumnDef(), null, "columns", null, 0, -1, TableDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableColumnDefEClass, TableColumnDef.class, "TableColumnDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableColumnDef_Default(), theEcorePackage.getEBoolean(), "default", null, 0, 1, TableColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theDataPackage.getDataDef());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getTableColumnDef_Definition(), g1, null, "definition", null, 1, 1, TableColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableColumnDef_Name(), ecorePackage.getEString(), "name", null, 1, 1, TableColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableColumnDef_Nullable(), ecorePackage.getEBoolean(), "nullable", null, 0, 1, TableColumnDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableTermEClass, TableTerm.class, "TableTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableTerm_Name(), ecorePackage.getEString(), "name", null, 1, 1, TableTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableTerm_TableDef(), this.getTableDef(), null, "tableDef", null, 0, 1, TableTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewDefEClass, ViewDef.class, "ViewDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewDef_QuerySelect(), ecorePackage.getEString(), "querySelect", null, 0, 1, ViewDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dropRangeEEnum, DropRange.class, "DropRange");
		addEEnumLiteral(dropRangeEEnum, DropRange.RESTRICT);
		addEEnumLiteral(dropRangeEEnum, DropRange.CASCADE);

		initEEnum(orderingTypeEEnum, OrderingType.class, "OrderingType");
		addEEnumLiteral(orderingTypeEEnum, OrderingType.ASCEND);
		addEEnumLiteral(orderingTypeEEnum, OrderingType.DESCEND);

		initEEnum(shareModeEEnum, ShareMode.class, "ShareMode");
		addEEnumLiteral(shareModeEEnum, ShareMode.SHARE);
		addEEnumLiteral(shareModeEEnum, ShareMode.EXCLUSIVE);

		initEEnum(targetElementEEnum, TargetElement.class, "TargetElement");
		addEEnumLiteral(targetElementEEnum, TargetElement.ALIAS);
		addEEnumLiteral(targetElementEEnum, TargetElement.INDEX);
		addEEnumLiteral(targetElementEEnum, TargetElement.VIEW);
		addEEnumLiteral(targetElementEEnum, TargetElement.TABLE);

		initEEnum(targetItemEEnum, TargetItem.class, "TargetItem");
		addEEnumLiteral(targetItemEEnum, TargetItem.ALL);
		addEEnumLiteral(targetItemEEnum, TargetItem.CURRENT);
		addEEnumLiteral(targetItemEEnum, TargetItem.SQL);
	}

} //DatabaseDefinitionPackageImpl
