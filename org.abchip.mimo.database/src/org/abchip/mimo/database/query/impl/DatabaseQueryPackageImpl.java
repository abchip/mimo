/**
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
package org.abchip.mimo.database.query.impl;

import org.abchip.mimo.MimoPackage;
import org.abchip.mimo.context.ContextPackage;
import org.abchip.mimo.database.DatabasePackage;

import org.abchip.mimo.database.connection.DatabaseConnectionPackage;

import org.abchip.mimo.database.connection.impl.DatabaseConnectionPackageImpl;

import org.abchip.mimo.database.definition.DatabaseDefinitionPackage;

import org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl;

import org.abchip.mimo.database.impl.DatabasePackageImpl;

import org.abchip.mimo.database.query.AliasResolver;
import org.abchip.mimo.database.query.DatabaseQueryFactory;
import org.abchip.mimo.database.query.DatabaseQueryPackage;
import org.abchip.mimo.database.query.NameHelper;
import org.abchip.mimo.database.query.NameHelperRegistry;
import org.abchip.mimo.database.query.QueryParser;
import org.abchip.mimo.database.query.QueryParserRegistry;
import org.abchip.mimo.database.query.QueryWriter;
import org.abchip.mimo.database.query.QueryWriterRegistry;
import org.abchip.mimo.database.query.StatementParser;
import org.abchip.mimo.database.query.StatementWriter;
import org.abchip.mimo.util.UtilPackage;
import org.eclipse.datatools.modelbase.sql.accesscontrol.SQLAccessControlPackage;

import org.eclipse.datatools.modelbase.sql.constraints.SQLConstraintsPackage;

import org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage;

import org.eclipse.datatools.modelbase.sql.expressions.SQLExpressionsPackage;

import org.eclipse.datatools.modelbase.sql.query.SQLQueryModelPackage;

import org.eclipse.datatools.modelbase.sql.routines.SQLRoutinesPackage;

import org.eclipse.datatools.modelbase.sql.schema.SQLSchemaPackage;

import org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper;

import org.eclipse.datatools.modelbase.sql.statements.SQLStatementsPackage;

import org.eclipse.datatools.modelbase.sql.tables.SQLTablesPackage;

import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class DatabaseQueryPackageImpl extends EPackageImpl implements DatabaseQueryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasResolverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameHelperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameHelperRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryWriterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryWriterRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryParserRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlObjectNameHelperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementWriterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sqlQueryParseResultEDataType = null;

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
	 * @see org.abchip.mimo.database.query.DatabaseQueryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatabaseQueryPackageImpl() {
		super(eNS_URI, DatabaseQueryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DatabaseQueryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatabaseQueryPackage init() {
		if (isInited) return (DatabaseQueryPackage)EPackage.Registry.INSTANCE.getEPackage(DatabaseQueryPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDatabaseQueryPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DatabaseQueryPackageImpl theDatabaseQueryPackage = registeredDatabaseQueryPackage instanceof DatabaseQueryPackageImpl ? (DatabaseQueryPackageImpl)registeredDatabaseQueryPackage : new DatabaseQueryPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DatabaseDefinitionPackage.eNS_URI);
		DatabaseDefinitionPackageImpl theDatabaseDefinitionPackage = (DatabaseDefinitionPackageImpl)(registeredPackage instanceof DatabaseDefinitionPackageImpl ? registeredPackage : DatabaseDefinitionPackage.eINSTANCE);

		// Create package meta-data objects
		theDatabaseQueryPackage.createPackageContents();
		theDatabasePackage.createPackageContents();
		theDatabaseConnectionPackage.createPackageContents();
		theDatabaseDefinitionPackage.createPackageContents();

		// Initialize created meta-data
		theDatabaseQueryPackage.initializePackageContents();
		theDatabasePackage.initializePackageContents();
		theDatabaseConnectionPackage.initializePackageContents();
		theDatabaseDefinitionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatabaseQueryPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatabaseQueryPackage.eNS_URI, theDatabaseQueryPackage);
		return theDatabaseQueryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAliasResolver() {
		return aliasResolverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameHelper() {
		return nameHelperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameHelperRegistry() {
		return nameHelperRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryWriter() {
		return queryWriterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryWriterRegistry() {
		return queryWriterRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryParser() {
		return queryParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryParserRegistry() {
		return queryParserRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSQLObjectNameHelper() {
		return sqlObjectNameHelperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatementWriter() {
		return statementWriterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatementWriter_NameHelper() {
		return (EReference)statementWriterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatementParser() {
		return statementParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSQLQueryParseResult() {
		return sqlQueryParseResultEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseQueryFactory getDatabaseQueryFactory() {
		return (DatabaseQueryFactory)getEFactoryInstance();
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
		aliasResolverEClass = createEClass(ALIAS_RESOLVER);

		nameHelperEClass = createEClass(NAME_HELPER);

		nameHelperRegistryEClass = createEClass(NAME_HELPER_REGISTRY);

		queryWriterEClass = createEClass(QUERY_WRITER);

		queryWriterRegistryEClass = createEClass(QUERY_WRITER_REGISTRY);

		queryParserEClass = createEClass(QUERY_PARSER);

		queryParserRegistryEClass = createEClass(QUERY_PARSER_REGISTRY);

		sqlObjectNameHelperEClass = createEClass(SQL_OBJECT_NAME_HELPER);

		statementWriterEClass = createEClass(STATEMENT_WRITER);
		createEReference(statementWriterEClass, STATEMENT_WRITER__NAME_HELPER);

		statementParserEClass = createEClass(STATEMENT_PARSER);

		// Create data types
		sqlQueryParseResultEDataType = createEDataType(SQL_QUERY_PARSE_RESULT);
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
		DatabaseConnectionPackage theDatabaseConnectionPackage = (DatabaseConnectionPackage)EPackage.Registry.INSTANCE.getEPackage(DatabaseConnectionPackage.eNS_URI);
		DatabasePackage theDatabasePackage = (DatabasePackage)EPackage.Registry.INSTANCE.getEPackage(DatabasePackage.eNS_URI);
		SQLQueryModelPackage theSQLQueryModelPackage = (SQLQueryModelPackage)EPackage.Registry.INSTANCE.getEPackage(SQLQueryModelPackage.eNS_URI);
		ContextPackage theContextPackage = (ContextPackage)EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
		UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nameHelperEClass.getESuperTypes().add(this.getSQLObjectNameHelper());
		EGenericType g1 = createEGenericType(theContextPackage.getRegistry());
		EGenericType g2 = createEGenericType(this.getNameHelper());
		g1.getETypeArguments().add(g2);
		nameHelperRegistryEClass.getEGenericSuperTypes().add(g1);
		queryWriterEClass.getESuperTypes().add(this.getStatementWriter());
		g1 = createEGenericType(theContextPackage.getRegistry());
		g2 = createEGenericType(this.getQueryWriter());
		g1.getETypeArguments().add(g2);
		queryWriterRegistryEClass.getEGenericSuperTypes().add(g1);
		queryParserEClass.getESuperTypes().add(this.getStatementParser());
		g1 = createEGenericType(theContextPackage.getRegistry());
		g2 = createEGenericType(this.getQueryParser());
		g1.getETypeArguments().add(g2);
		queryParserRegistryEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(aliasResolverEClass, AliasResolver.class, "AliasResolver", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(aliasResolverEClass, null, "resolveQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseConnectionPackage.getConnection(), "connection", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSQLQueryParseResult(), "query", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		initEClass(nameHelperEClass, NameHelper.class, "NameHelper", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(nameHelperEClass, null, "resolveContainers", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLQueryModelPackage.getQueryStatement(), "query", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(nameHelperRegistryEClass, NameHelperRegistry.class, "NameHelperRegistry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(nameHelperRegistryEClass, this.getNameHelper(), "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseConnectionPackage.getConnectionConfig(), "connectionConfig", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(queryWriterEClass, QueryWriter.class, "QueryWriter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(queryWriterEClass, ecorePackage.getEString(), "writeQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLQueryModelPackage.getQueryStatement(), "statement", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(queryWriterRegistryEClass, QueryWriterRegistry.class, "QueryWriterRegistry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(queryWriterRegistryEClass, this.getQueryWriter(), "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseConnectionPackage.getConnectionConfig(), "connectionConfig", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(queryParserEClass, QueryParser.class, "QueryParser", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(queryParserEClass, this.getSQLQueryParseResult(), "parseQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getJavaInputStream(), "stream", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		op = addEOperation(queryParserEClass, this.getSQLQueryParseResult(), "parseQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sql", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theDatabasePackage.getDatabaseException());

		initEClass(queryParserRegistryEClass, QueryParserRegistry.class, "QueryParserRegistry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(queryParserRegistryEClass, this.getQueryParser(), "lookup", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseConnectionPackage.getConnectionConfig(), "connectionConfig", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sqlObjectNameHelperEClass, ISQLObjectNameHelper.class, "SQLObjectNameHelper", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(statementWriterEClass, StatementWriter.class, "StatementWriter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatementWriter_NameHelper(), this.getNameHelper(), null, "nameHelper", null, 0, 1, StatementWriter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementParserEClass, StatementParser.class, "StatementParser", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(sqlQueryParseResultEDataType, SQLQueryParseResult.class, "SQLQueryParseResult", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //DatabaseQueryPackageImpl
