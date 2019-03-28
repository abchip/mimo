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
package org.abchip.mimo.database.impl;

import java.sql.SQLException;

import org.abchip.mimo.MimoPackage;
import org.abchip.mimo.context.ContextPackage;
import org.abchip.mimo.database.CatalogContainer;
import org.abchip.mimo.database.CatalogGenerationStrategy;
import org.abchip.mimo.database.CatalogMetaData;
import org.abchip.mimo.database.DatabaseContainer;
import org.abchip.mimo.database.DatabaseFactory;
import org.abchip.mimo.database.DatabaseManager;
import org.abchip.mimo.database.DatabasePackage;
import org.abchip.mimo.database.QualifiedName;
import org.abchip.mimo.database.SearchStrategy;
import org.abchip.mimo.database.TableProvider;

import org.abchip.mimo.database.connection.DatabaseConnectionPackage;

import org.abchip.mimo.database.connection.impl.DatabaseConnectionPackageImpl;

import org.abchip.mimo.database.definition.DatabaseDefinitionPackage;

import org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl;

import org.abchip.mimo.database.query.DatabaseQueryPackage;

import org.abchip.mimo.database.query.impl.DatabaseQueryPackageImpl;

import org.abchip.mimo.entity.EntityPackage;
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
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatabasePackageImpl extends EPackageImpl implements DatabasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogGenerationStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogMetaDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifiedNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum searchStrategyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType databaseExceptionEDataType = null;

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
	 * @see org.abchip.mimo.database.DatabasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatabasePackageImpl() {
		super(eNS_URI, DatabaseFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DatabasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatabasePackage init() {
		if (isInited) return (DatabasePackage)EPackage.Registry.INSTANCE.getEPackage(DatabasePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDatabasePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DatabasePackageImpl theDatabasePackage = registeredDatabasePackage instanceof DatabasePackageImpl ? (DatabasePackageImpl)registeredDatabasePackage : new DatabasePackageImpl();

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
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DatabaseConnectionPackage.eNS_URI);
		DatabaseConnectionPackageImpl theDatabaseConnectionPackage = (DatabaseConnectionPackageImpl)(registeredPackage instanceof DatabaseConnectionPackageImpl ? registeredPackage : DatabaseConnectionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DatabaseDefinitionPackage.eNS_URI);
		DatabaseDefinitionPackageImpl theDatabaseDefinitionPackage = (DatabaseDefinitionPackageImpl)(registeredPackage instanceof DatabaseDefinitionPackageImpl ? registeredPackage : DatabaseDefinitionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DatabaseQueryPackage.eNS_URI);
		DatabaseQueryPackageImpl theDatabaseQueryPackage = (DatabaseQueryPackageImpl)(registeredPackage instanceof DatabaseQueryPackageImpl ? registeredPackage : DatabaseQueryPackage.eINSTANCE);

		// Create package meta-data objects
		theDatabasePackage.createPackageContents();
		theDatabaseConnectionPackage.createPackageContents();
		theDatabaseDefinitionPackage.createPackageContents();
		theDatabaseQueryPackage.createPackageContents();

		// Initialize created meta-data
		theDatabasePackage.initializePackageContents();
		theDatabaseConnectionPackage.initializePackageContents();
		theDatabaseDefinitionPackage.initializePackageContents();
		theDatabaseQueryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatabasePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatabasePackage.eNS_URI, theDatabasePackage);
		return theDatabasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCatalogContainer() {
		return catalogContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogContainer_Name() {
		return (EAttribute)catalogContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogContainer_Active() {
		return (EAttribute)catalogContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogContainer_ConnectionConfig() {
		return (EReference)catalogContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogContainer_SupportsGuestAccess() {
		return (EAttribute)catalogContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogContainer_GenerationStrategy() {
		return (EReference)catalogContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogContainer_SearchStrategy() {
		return (EAttribute)catalogContainerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCatalogGenerationStrategy() {
		return catalogGenerationStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogGenerationStrategy_CreateIndexOnView() {
		return (EAttribute)catalogGenerationStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogGenerationStrategy_CreateRelativeRecordNumber() {
		return (EAttribute)catalogGenerationStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCatalogMetaData() {
		return catalogMetaDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabaseContainer() {
		return databaseContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseContainer_CatalogContainers() {
		return (EReference)databaseContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseContainer_DefaultCatalogContainer() {
		return (EReference)databaseContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabaseContainer_Vendor() {
		return (EAttribute)databaseContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabaseContainer_Version() {
		return (EAttribute)databaseContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabaseManager() {
		return databaseManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQualifiedName() {
		return qualifiedNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQualifiedName_Qualifiers() {
		return (EAttribute)qualifiedNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableProvider() {
		return tableProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSearchStrategy() {
		return searchStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDatabaseException() {
		return databaseExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatabaseFactory getDatabaseFactory() {
		return (DatabaseFactory)getEFactoryInstance();
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
		catalogContainerEClass = createEClass(CATALOG_CONTAINER);
		createEAttribute(catalogContainerEClass, CATALOG_CONTAINER__NAME);
		createEAttribute(catalogContainerEClass, CATALOG_CONTAINER__ACTIVE);
		createEReference(catalogContainerEClass, CATALOG_CONTAINER__CONNECTION_CONFIG);
		createEAttribute(catalogContainerEClass, CATALOG_CONTAINER__SUPPORTS_GUEST_ACCESS);
		createEReference(catalogContainerEClass, CATALOG_CONTAINER__GENERATION_STRATEGY);
		createEAttribute(catalogContainerEClass, CATALOG_CONTAINER__SEARCH_STRATEGY);

		catalogGenerationStrategyEClass = createEClass(CATALOG_GENERATION_STRATEGY);
		createEAttribute(catalogGenerationStrategyEClass, CATALOG_GENERATION_STRATEGY__CREATE_INDEX_ON_VIEW);
		createEAttribute(catalogGenerationStrategyEClass, CATALOG_GENERATION_STRATEGY__CREATE_RELATIVE_RECORD_NUMBER);

		catalogMetaDataEClass = createEClass(CATALOG_META_DATA);

		databaseContainerEClass = createEClass(DATABASE_CONTAINER);
		createEReference(databaseContainerEClass, DATABASE_CONTAINER__CATALOG_CONTAINERS);
		createEReference(databaseContainerEClass, DATABASE_CONTAINER__DEFAULT_CATALOG_CONTAINER);
		createEAttribute(databaseContainerEClass, DATABASE_CONTAINER__VENDOR);
		createEAttribute(databaseContainerEClass, DATABASE_CONTAINER__VERSION);

		databaseManagerEClass = createEClass(DATABASE_MANAGER);

		qualifiedNameEClass = createEClass(QUALIFIED_NAME);
		createEAttribute(qualifiedNameEClass, QUALIFIED_NAME__QUALIFIERS);

		tableProviderEClass = createEClass(TABLE_PROVIDER);

		// Create enums
		searchStrategyEEnum = createEEnum(SEARCH_STRATEGY);

		// Create data types
		databaseExceptionEDataType = createEDataType(DATABASE_EXCEPTION);
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
		DatabaseDefinitionPackage theDatabaseDefinitionPackage = (DatabaseDefinitionPackage)EPackage.Registry.INSTANCE.getEPackage(DatabaseDefinitionPackage.eNS_URI);
		DatabaseQueryPackage theDatabaseQueryPackage = (DatabaseQueryPackage)EPackage.Registry.INSTANCE.getEPackage(DatabaseQueryPackage.eNS_URI);
		ContextPackage theContextPackage = (ContextPackage)EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
		SQLConstraintsPackage theSQLConstraintsPackage = (SQLConstraintsPackage)EPackage.Registry.INSTANCE.getEPackage(SQLConstraintsPackage.eNS_URI);
		SQLTablesPackage theSQLTablesPackage = (SQLTablesPackage)EPackage.Registry.INSTANCE.getEPackage(SQLTablesPackage.eNS_URI);
		SQLSchemaPackage theSQLSchemaPackage = (SQLSchemaPackage)EPackage.Registry.INSTANCE.getEPackage(SQLSchemaPackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDatabaseConnectionPackage);
		getESubpackages().add(theDatabaseDefinitionPackage);
		getESubpackages().add(theDatabaseQueryPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		databaseContainerEClass.getESuperTypes().add(theEntityPackage.getEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(catalogContainerEClass, CatalogContainer.class, "CatalogContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCatalogContainer_Name(), ecorePackage.getEString(), "name", null, 1, 1, CatalogContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogContainer_Active(), ecorePackage.getEBoolean(), "active", "true", 1, 1, CatalogContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogContainer_ConnectionConfig(), theDatabaseConnectionPackage.getConnectionConfig(), null, "connectionConfig", null, 1, 1, CatalogContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogContainer_SupportsGuestAccess(), ecorePackage.getEBoolean(), "supportsGuestAccess", "false", 1, 1, CatalogContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogContainer_GenerationStrategy(), this.getCatalogGenerationStrategy(), null, "generationStrategy", null, 1, 1, CatalogContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogContainer_SearchStrategy(), this.getSearchStrategy(), "searchStrategy", "CUR", 1, 1, CatalogContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(catalogContainerEClass, null, "createConnection", 0, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "C");
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "factory", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = addEOperation(catalogContainerEClass, null, "createConnection", 0, 1, IS_UNIQUE, IS_ORDERED);
		t1 = addETypeParameter(op, "C");
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "factory", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "user", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "password", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		addEOperation(catalogContainerEClass, this.getCatalogMetaData(), "getMetaData", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(catalogContainerEClass, theContextPackage.getContext(), "getCatalogContext", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(catalogContainerEClass, theSQLConstraintsPackage.getIndex(), "loadIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(catalogContainerEClass, theSQLSchemaPackage.getSchema(), "loadSchema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(catalogContainerEClass, theSQLTablesPackage.getTable(), "loadTable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLSchemaPackage.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(catalogContainerEClass, theSQLTablesPackage.getViewTable(), "loadView", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLSchemaPackage.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(catalogContainerEClass, null, "removeIndex", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLConstraintsPackage.getIndex(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(catalogContainerEClass, null, "removeSchema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLSchemaPackage.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(catalogContainerEClass, null, "removeTable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(catalogContainerEClass, null, "removeView", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getViewTable(), "view", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(catalogGenerationStrategyEClass, CatalogGenerationStrategy.class, "CatalogGenerationStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCatalogGenerationStrategy_CreateIndexOnView(), ecorePackage.getEBoolean(), "createIndexOnView", "false", 1, 1, CatalogGenerationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalogGenerationStrategy_CreateRelativeRecordNumber(), ecorePackage.getEBoolean(), "createRelativeRecordNumber", "false", 1, 1, CatalogGenerationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(catalogMetaDataEClass, CatalogMetaData.class, "CatalogMetaData", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(catalogMetaDataEClass, theSQLConstraintsPackage.getIndex(), "getIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(catalogMetaDataEClass, theSQLSchemaPackage.getSchema(), "getAllSchemas", 1, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(catalogMetaDataEClass, theSQLSchemaPackage.getSchema(), "getCurrentSchemas", 1, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(catalogMetaDataEClass, theSQLSchemaPackage.getSchema(), "getSchema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(catalogMetaDataEClass, this.getSearchStrategy(), "getSearchStrategy", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(catalogMetaDataEClass, theSQLTablesPackage.getTable(), "getTable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(catalogMetaDataEClass, theSQLTablesPackage.getTable(), "getTable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(catalogMetaDataEClass, theSQLTablesPackage.getViewTable(), "getView", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(catalogMetaDataEClass, theSQLTablesPackage.getViewTable(), "getView", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(databaseContainerEClass, DatabaseContainer.class, "DatabaseContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabaseContainer_CatalogContainers(), this.getCatalogContainer(), null, "catalogContainers", null, 1, -1, DatabaseContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseContainer_DefaultCatalogContainer(), this.getCatalogContainer(), null, "defaultCatalogContainer", null, 1, 1, DatabaseContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getDatabaseContainer_DefaultCatalogContainer().getEKeys().add(this.getCatalogContainer_Name());
		initEAttribute(getDatabaseContainer_Vendor(), ecorePackage.getEString(), "vendor", null, 1, 1, DatabaseContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseContainer_Version(), ecorePackage.getEString(), "version", null, 1, 1, DatabaseContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseManagerEClass, DatabaseManager.class, "DatabaseManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(databaseManagerEClass, theSQLConstraintsPackage.getIndex(), "createIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseConnectionPackage.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseDefinitionPackage.getIndexDef(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(databaseManagerEClass, theSQLSchemaPackage.getSchema(), "createSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseConnectionPackage.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseDefinitionPackage.getSchemaDef(), "schema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(databaseManagerEClass, theSQLTablesPackage.getTable(), "createTable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseConnectionPackage.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLSchemaPackage.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseDefinitionPackage.getTableDef(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(databaseManagerEClass, theSQLTablesPackage.getViewTable(), "createView", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseConnectionPackage.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLSchemaPackage.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseDefinitionPackage.getViewDef(), "view", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(databaseManagerEClass, null, "dropIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseConnectionPackage.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLConstraintsPackage.getIndex(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(databaseManagerEClass, null, "dropSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseConnectionPackage.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLSchemaPackage.getSchema(), "schema", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "ignoreFailOnNonEmpty", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(databaseManagerEClass, null, "dropTable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseConnectionPackage.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(databaseManagerEClass, null, "dropView", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseConnectionPackage.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getViewTable(), "view", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(databaseManagerEClass, ecorePackage.getEBoolean(), "hasLogicals", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseConnectionPackage.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		addEOperation(databaseManagerEClass, ecorePackage.getEBoolean(), "isStarted", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(databaseManagerEClass, null, "renameIndex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseConnectionPackage.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLConstraintsPackage.getIndex(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "newName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		op = addEOperation(databaseManagerEClass, null, "renameTable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatabaseConnectionPackage.getConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSQLTablesPackage.getTable(), "table", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "newName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getDatabaseException());

		addEOperation(databaseManagerEClass, null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(qualifiedNameEClass, QualifiedName.class, "QualifiedName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQualifiedName_Qualifiers(), theEcorePackage.getEString(), "qualifiers", null, 1, 3, QualifiedName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(qualifiedNameEClass, theEcorePackage.getEString(), "getFirstQualifier", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(qualifiedNameEClass, theEcorePackage.getEString(), "getLastQualifier", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tableProviderEClass, TableProvider.class, "TableProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tableProviderEClass, theSQLTablesPackage.getTable(), "getTable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "schema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "table", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(searchStrategyEEnum, SearchStrategy.class, "SearchStrategy");
		addEEnumLiteral(searchStrategyEEnum, SearchStrategy.CURRENT);
		addEEnumLiteral(searchStrategyEEnum, SearchStrategy.ALL);

		// Initialize data types
		initEDataType(databaseExceptionEDataType, SQLException.class, "DatabaseException", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DatabasePackageImpl
