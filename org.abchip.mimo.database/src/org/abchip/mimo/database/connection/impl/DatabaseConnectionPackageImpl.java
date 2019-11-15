/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.connection.impl;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import org.abchip.mimo.MimoPackage;
import org.abchip.mimo.context.ContextPackage;
import org.abchip.mimo.database.DatabasePackage;

import org.abchip.mimo.database.connection.Connection;
import org.abchip.mimo.database.connection.ConnectionConfig;
import org.abchip.mimo.database.connection.ConnectionCredentials;
import org.abchip.mimo.database.connection.ConnectionManager;
import org.abchip.mimo.database.connection.DatabaseConnectionFactory;
import org.abchip.mimo.database.connection.DatabaseConnectionPackage;
import org.abchip.mimo.database.connection.PreparedStatement;
import org.abchip.mimo.database.connection.Statement;
import org.abchip.mimo.database.connection.StatementType;

import org.abchip.mimo.database.definition.DatabaseDefinitionPackage;

import org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl;

import org.abchip.mimo.database.impl.DatabasePackageImpl;

import org.abchip.mimo.database.query.DatabaseQueryPackage;

import org.abchip.mimo.database.query.impl.DatabaseQueryPackageImpl;
import org.abchip.mimo.util.UtilPackage;
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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
public class DatabaseConnectionPackageImpl extends EPackageImpl implements DatabaseConnectionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionCredentialsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preparedStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statementTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType databaseResultSetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType databaseResultSetMetaDataEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType statementBatchResultEDataType = null;

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
	 * @see org.abchip.mimo.database.connection.DatabaseConnectionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatabaseConnectionPackageImpl() {
		super(eNS_URI, DatabaseConnectionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DatabaseConnectionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatabaseConnectionPackage init() {
		if (isInited) return (DatabaseConnectionPackage)EPackage.Registry.INSTANCE.getEPackage(DatabaseConnectionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDatabaseConnectionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DatabaseConnectionPackageImpl theDatabaseConnectionPackage = registeredDatabaseConnectionPackage instanceof DatabaseConnectionPackageImpl ? (DatabaseConnectionPackageImpl)registeredDatabaseConnectionPackage : new DatabaseConnectionPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DatabaseDefinitionPackage.eNS_URI);
		DatabaseDefinitionPackageImpl theDatabaseDefinitionPackage = (DatabaseDefinitionPackageImpl)(registeredPackage instanceof DatabaseDefinitionPackageImpl ? registeredPackage : DatabaseDefinitionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DatabaseQueryPackage.eNS_URI);
		DatabaseQueryPackageImpl theDatabaseQueryPackage = (DatabaseQueryPackageImpl)(registeredPackage instanceof DatabaseQueryPackageImpl ? registeredPackage : DatabaseQueryPackage.eINSTANCE);

		// Create package meta-data objects
		theDatabaseConnectionPackage.createPackageContents();
		theDatabasePackage.createPackageContents();
		theDatabaseDefinitionPackage.createPackageContents();
		theDatabaseQueryPackage.createPackageContents();

		// Initialize created meta-data
		theDatabaseConnectionPackage.initializePackageContents();
		theDatabasePackage.initializePackageContents();
		theDatabaseDefinitionPackage.initializePackageContents();
		theDatabaseQueryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatabaseConnectionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatabaseConnectionPackage.eNS_URI, theDatabaseConnectionPackage);
		return theDatabaseConnectionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectionConfig() {
		return connectionConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectionConfig_Credentials() {
		return (EReference)connectionConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionConfig_Vendor() {
		return (EAttribute)connectionConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionConfig_Version() {
		return (EAttribute)connectionConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionConfig_Url() {
		return (EAttribute)connectionConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionConfig_Catalog() {
		return (EAttribute)connectionConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectionConfig_Persistent() {
		return (EAttribute)connectionConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectionCredentials() {
		return connectionCredentialsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectionManager() {
		return connectionManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPreparedStatement() {
		return preparedStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStatementType() {
		return statementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDatabaseResultSet() {
		return databaseResultSetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDatabaseResultSetMetaData() {
		return databaseResultSetMetaDataEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStatementBatchResult() {
		return statementBatchResultEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatabaseConnectionFactory getDatabaseConnectionFactory() {
		return (DatabaseConnectionFactory)getEFactoryInstance();
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
		connectionEClass = createEClass(CONNECTION);

		connectionConfigEClass = createEClass(CONNECTION_CONFIG);
		createEReference(connectionConfigEClass, CONNECTION_CONFIG__CREDENTIALS);
		createEAttribute(connectionConfigEClass, CONNECTION_CONFIG__VENDOR);
		createEAttribute(connectionConfigEClass, CONNECTION_CONFIG__VERSION);
		createEAttribute(connectionConfigEClass, CONNECTION_CONFIG__URL);
		createEAttribute(connectionConfigEClass, CONNECTION_CONFIG__CATALOG);
		createEAttribute(connectionConfigEClass, CONNECTION_CONFIG__PERSISTENT);

		connectionCredentialsEClass = createEClass(CONNECTION_CREDENTIALS);

		connectionManagerEClass = createEClass(CONNECTION_MANAGER);

		preparedStatementEClass = createEClass(PREPARED_STATEMENT);

		statementEClass = createEClass(STATEMENT);

		// Create enums
		statementTypeEEnum = createEEnum(STATEMENT_TYPE);

		// Create data types
		databaseResultSetEDataType = createEDataType(DATABASE_RESULT_SET);
		databaseResultSetMetaDataEDataType = createEDataType(DATABASE_RESULT_SET_META_DATA);
		statementBatchResultEDataType = createEDataType(STATEMENT_BATCH_RESULT);
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
		ContextPackage theContextPackage = (ContextPackage)EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
		DatabasePackage theDatabasePackage = (DatabasePackage)EPackage.Registry.INSTANCE.getEPackage(DatabasePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		connectionEClass.getESuperTypes().add(theContextPackage.getContextProvider());
		connectionCredentialsEClass.getESuperTypes().add(theContextPackage.getAuthenticationUserPassword());
		preparedStatementEClass.getESuperTypes().add(this.getStatement());
		statementEClass.getESuperTypes().add(theUtilPackage.getJavaCloseable());

		// Initialize classes and features; add operations and parameters
		initEClass(connectionEClass, Connection.class, "Connection", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(connectionEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(connectionEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStatement(), "stmt", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(connectionEClass, null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDatabaseResultSet(), "rs", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(connectionEClass, this.getStatement(), "createStatement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(connectionEClass, this.getStatement(), "createStatement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "native_", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(connectionEClass, this.getStatement(), "createStatement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "native_", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "updatable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(connectionEClass, this.getStatement(), "createStatementCursorInsensitive", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "native_", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(connectionEClass, ecorePackage.getEString(), "getCatalog", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		addEOperation(connectionEClass, theDatabasePackage.getCatalogGenerationStrategy(), "getCatalogGenerationStrategy", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(connectionEClass, theDatabasePackage.getCatalogMetaData(), "getCatalogMetaData", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(connectionEClass, this.getPreparedStatement(), "prepareStatement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(connectionEClass, this.getPreparedStatement(), "prepareStatement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "native_", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(connectionEClass, this.getPreparedStatement(), "prepareStatement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "native_", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "updatable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(connectionEClass, null, "setCatalog", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "catalog", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(connectionEClass, ecorePackage.getEString(), "translate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		initEClass(connectionConfigEClass, ConnectionConfig.class, "ConnectionConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionConfig_Credentials(), this.getConnectionCredentials(), null, "credentials", null, 1, 1, ConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionConfig_Vendor(), ecorePackage.getEString(), "vendor", null, 1, 1, ConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionConfig_Version(), ecorePackage.getEString(), "version", null, 1, 1, ConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionConfig_Url(), ecorePackage.getEString(), "url", null, 1, 1, ConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionConfig_Catalog(), ecorePackage.getEString(), "catalog", null, 0, 1, ConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectionConfig_Persistent(), ecorePackage.getEBoolean(), "persistent", null, 0, 1, ConnectionConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionCredentialsEClass, ConnectionCredentials.class, "ConnectionCredentials", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionManagerEClass, ConnectionManager.class, "ConnectionManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(connectionManagerEClass, this.getConnection(), "createConnection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(connectionManagerEClass, this.getConnection(), "createConnection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "catalog", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(connectionManagerEClass, this.getConnection(), "createConnection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "user", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "password", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(connectionManagerEClass, this.getConnection(), "createConnection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "catalog", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "user", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "password", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		initEClass(preparedStatementEClass, PreparedStatement.class, "PreparedStatement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(preparedStatementEClass, null, "addBatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(preparedStatementEClass, null, "clearParameters", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(preparedStatementEClass, ecorePackage.getEBoolean(), "execute", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(preparedStatementEClass, this.getDatabaseResultSet(), "executeQuery", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(preparedStatementEClass, ecorePackage.getEInt(), "executeUpdate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(preparedStatementEClass, this.getDatabaseResultSetMetaData(), "getMetaData", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(preparedStatementEClass, null, "setDate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "position", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(preparedStatementEClass, null, "setInt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "position", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(preparedStatementEClass, null, "setNumber", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "position", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaNumber(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(preparedStatementEClass, null, "setString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "position", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(preparedStatementEClass, null, "setObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "position", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(statementEClass, null, "close", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(statementEClass, ecorePackage.getEBoolean(), "execute", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(statementEClass, this.getDatabaseResultSet(), "executeQuery", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(statementEClass, ecorePackage.getEInt(), "executeUpdate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "generatedKeys", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(statementEClass, null, "addBatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(statementEClass, null, "clearBatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(statementEClass, this.getStatementBatchResult(), "executeBatch", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(statementEClass, this.getDatabaseResultSet(), "getGeneratedKeys", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(statementEClass, null, "setQueryTimeout", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "seconds", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(statementTypeEEnum, StatementType.class, "StatementType");
		addEEnumLiteral(statementTypeEEnum, StatementType.DATA_MANIPULATION_LANGUAGE);
		addEEnumLiteral(statementTypeEEnum, StatementType.DATA_DEFINITION_LANGUAGE);
		addEEnumLiteral(statementTypeEEnum, StatementType.DATA_BINDING_LANGUAGE);

		// Initialize data types
		initEDataType(databaseResultSetEDataType, ResultSet.class, "DatabaseResultSet", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(databaseResultSetMetaDataEDataType, ResultSetMetaData.class, "DatabaseResultSetMetaData", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(statementBatchResultEDataType, int[].class, "StatementBatchResult", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //DatabaseConnectionPackageImpl
