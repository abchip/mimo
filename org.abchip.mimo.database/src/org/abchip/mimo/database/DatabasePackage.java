/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database;

import org.abchip.mimo.entity.EntityPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.database.DatabaseFactory
 * @model kind="package"
 * @generated
 */
public interface DatabasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "database";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/database";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "db";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatabasePackage eINSTANCE = org.abchip.mimo.database.impl.DatabasePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.impl.CatalogContainerImpl <em>Catalog Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.impl.CatalogContainerImpl
	 * @see org.abchip.mimo.database.impl.DatabasePackageImpl#getCatalogContainer()
	 * @generated
	 */
	int CATALOG_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTAINER__NAME = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTAINER__ACTIVE = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connection Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTAINER__CONNECTION_CONFIG = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Supports Guest Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTAINER__SUPPORTS_GUEST_ACCESS = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Generation Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTAINER__GENERATION_STRATEGY = EntityPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Search Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTAINER__SEARCH_STRATEGY = EntityPackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Catalog Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_CONTAINER_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.impl.CatalogGenerationStrategyImpl <em>Catalog Generation Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.impl.CatalogGenerationStrategyImpl
	 * @see org.abchip.mimo.database.impl.DatabasePackageImpl#getCatalogGenerationStrategy()
	 * @generated
	 */
	int CATALOG_GENERATION_STRATEGY = 1;

	/**
	 * The feature id for the '<em><b>Create Index On View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_GENERATION_STRATEGY__CREATE_INDEX_ON_VIEW = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Create Relative Record Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_GENERATION_STRATEGY__CREATE_RELATIVE_RECORD_NUMBER = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Catalog Generation Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_GENERATION_STRATEGY_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.impl.CatalogMetaDataImpl <em>Catalog Meta Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.impl.CatalogMetaDataImpl
	 * @see org.abchip.mimo.database.impl.DatabasePackageImpl#getCatalogMetaData()
	 * @generated
	 */
	int CATALOG_META_DATA = 2;

	/**
	 * The number of structural features of the '<em>Catalog Meta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_META_DATA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.impl.DatabaseContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.impl.DatabaseContainerImpl
	 * @see org.abchip.mimo.database.impl.DatabasePackageImpl#getDatabaseContainer()
	 * @generated
	 */
	int DATABASE_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Catalog Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONTAINER__CATALOG_CONTAINERS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Catalog Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONTAINER__DEFAULT_CATALOG_CONTAINER = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONTAINER__VENDOR = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONTAINER__VERSION = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_CONTAINER_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.DatabaseManager <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.DatabaseManager
	 * @see org.abchip.mimo.database.impl.DatabasePackageImpl#getDatabaseManager()
	 * @generated
	 */
	int DATABASE_MANAGER = 4;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.impl.QualifiedNameImpl
	 * @see org.abchip.mimo.database.impl.DatabasePackageImpl#getQualifiedName()
	 * @generated
	 */
	int QUALIFIED_NAME = 5;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAME__QUALIFIERS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Qualified Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAME_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.TableProvider <em>Table Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.TableProvider
	 * @see org.abchip.mimo.database.impl.DatabasePackageImpl#getTableProvider()
	 * @generated
	 */
	int TABLE_PROVIDER = 6;

	/**
	 * The number of structural features of the '<em>Table Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.SearchStrategy <em>Search Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.SearchStrategy
	 * @see org.abchip.mimo.database.impl.DatabasePackageImpl#getSearchStrategy()
	 * @generated
	 */
	int SEARCH_STRATEGY = 7;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.sql.SQLException
	 * @see org.abchip.mimo.database.impl.DatabasePackageImpl#getDatabaseException()
	 * @generated
	 */
	int DATABASE_EXCEPTION = 8;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.CatalogContainer <em>Catalog Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog Container</em>'.
	 * @see org.abchip.mimo.database.CatalogContainer
	 * @generated
	 */
	EClass getCatalogContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.CatalogContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.database.CatalogContainer#getName()
	 * @see #getCatalogContainer()
	 * @generated
	 */
	EAttribute getCatalogContainer_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.CatalogContainer#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.abchip.mimo.database.CatalogContainer#isActive()
	 * @see #getCatalogContainer()
	 * @generated
	 */
	EAttribute getCatalogContainer_Active();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.database.CatalogContainer#getConnectionConfig <em>Connection Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Config</em>'.
	 * @see org.abchip.mimo.database.CatalogContainer#getConnectionConfig()
	 * @see #getCatalogContainer()
	 * @generated
	 */
	EReference getCatalogContainer_ConnectionConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.CatalogContainer#isSupportsGuestAccess <em>Supports Guest Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supports Guest Access</em>'.
	 * @see org.abchip.mimo.database.CatalogContainer#isSupportsGuestAccess()
	 * @see #getCatalogContainer()
	 * @generated
	 */
	EAttribute getCatalogContainer_SupportsGuestAccess();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.database.CatalogContainer#getGenerationStrategy <em>Generation Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generation Strategy</em>'.
	 * @see org.abchip.mimo.database.CatalogContainer#getGenerationStrategy()
	 * @see #getCatalogContainer()
	 * @generated
	 */
	EReference getCatalogContainer_GenerationStrategy();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.CatalogContainer#getSearchStrategy <em>Search Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Search Strategy</em>'.
	 * @see org.abchip.mimo.database.CatalogContainer#getSearchStrategy()
	 * @see #getCatalogContainer()
	 * @generated
	 */
	EAttribute getCatalogContainer_SearchStrategy();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.CatalogGenerationStrategy <em>Catalog Generation Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog Generation Strategy</em>'.
	 * @see org.abchip.mimo.database.CatalogGenerationStrategy
	 * @generated
	 */
	EClass getCatalogGenerationStrategy();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.CatalogGenerationStrategy#isCreateIndexOnView <em>Create Index On View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Index On View</em>'.
	 * @see org.abchip.mimo.database.CatalogGenerationStrategy#isCreateIndexOnView()
	 * @see #getCatalogGenerationStrategy()
	 * @generated
	 */
	EAttribute getCatalogGenerationStrategy_CreateIndexOnView();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.CatalogGenerationStrategy#isCreateRelativeRecordNumber <em>Create Relative Record Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Relative Record Number</em>'.
	 * @see org.abchip.mimo.database.CatalogGenerationStrategy#isCreateRelativeRecordNumber()
	 * @see #getCatalogGenerationStrategy()
	 * @generated
	 */
	EAttribute getCatalogGenerationStrategy_CreateRelativeRecordNumber();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.CatalogMetaData <em>Catalog Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog Meta Data</em>'.
	 * @see org.abchip.mimo.database.CatalogMetaData
	 * @generated
	 */
	EClass getCatalogMetaData();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.DatabaseContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.abchip.mimo.database.DatabaseContainer
	 * @generated
	 */
	EClass getDatabaseContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.database.DatabaseContainer#getCatalogContainers <em>Catalog Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catalog Containers</em>'.
	 * @see org.abchip.mimo.database.DatabaseContainer#getCatalogContainers()
	 * @see #getDatabaseContainer()
	 * @generated
	 */
	EReference getDatabaseContainer_CatalogContainers();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.database.DatabaseContainer#getDefaultCatalogContainer <em>Default Catalog Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Catalog Container</em>'.
	 * @see org.abchip.mimo.database.DatabaseContainer#getDefaultCatalogContainer()
	 * @see #getDatabaseContainer()
	 * @generated
	 */
	EReference getDatabaseContainer_DefaultCatalogContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.DatabaseContainer#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see org.abchip.mimo.database.DatabaseContainer#getVendor()
	 * @see #getDatabaseContainer()
	 * @generated
	 */
	EAttribute getDatabaseContainer_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.DatabaseContainer#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.abchip.mimo.database.DatabaseContainer#getVersion()
	 * @see #getDatabaseContainer()
	 * @generated
	 */
	EAttribute getDatabaseContainer_Version();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.DatabaseManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see org.abchip.mimo.database.DatabaseManager
	 * @generated
	 */
	EClass getDatabaseManager();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.QualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualified Name</em>'.
	 * @see org.abchip.mimo.database.QualifiedName
	 * @generated
	 */
	EClass getQualifiedName();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.database.QualifiedName#getQualifiers <em>Qualifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Qualifiers</em>'.
	 * @see org.abchip.mimo.database.QualifiedName#getQualifiers()
	 * @see #getQualifiedName()
	 * @generated
	 */
	EAttribute getQualifiedName_Qualifiers();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.TableProvider <em>Table Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Provider</em>'.
	 * @see org.abchip.mimo.database.TableProvider
	 * @generated
	 */
	EClass getTableProvider();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.database.SearchStrategy <em>Search Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Search Strategy</em>'.
	 * @see org.abchip.mimo.database.SearchStrategy
	 * @generated
	 */
	EEnum getSearchStrategy();

	/**
	 * Returns the meta object for data type '{@link java.sql.SQLException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.sql.SQLException
	 * @model instanceClass="java.sql.SQLException" serializeable="false"
	 * @generated
	 */
	EDataType getDatabaseException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatabaseFactory getDatabaseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.impl.CatalogContainerImpl <em>Catalog Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.impl.CatalogContainerImpl
		 * @see org.abchip.mimo.database.impl.DatabasePackageImpl#getCatalogContainer()
		 * @generated
		 */
		EClass CATALOG_CONTAINER = eINSTANCE.getCatalogContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_CONTAINER__NAME = eINSTANCE.getCatalogContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_CONTAINER__ACTIVE = eINSTANCE.getCatalogContainer_Active();

		/**
		 * The meta object literal for the '<em><b>Connection Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_CONTAINER__CONNECTION_CONFIG = eINSTANCE.getCatalogContainer_ConnectionConfig();

		/**
		 * The meta object literal for the '<em><b>Supports Guest Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_CONTAINER__SUPPORTS_GUEST_ACCESS = eINSTANCE.getCatalogContainer_SupportsGuestAccess();

		/**
		 * The meta object literal for the '<em><b>Generation Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOG_CONTAINER__GENERATION_STRATEGY = eINSTANCE.getCatalogContainer_GenerationStrategy();

		/**
		 * The meta object literal for the '<em><b>Search Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_CONTAINER__SEARCH_STRATEGY = eINSTANCE.getCatalogContainer_SearchStrategy();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.impl.CatalogGenerationStrategyImpl <em>Catalog Generation Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.impl.CatalogGenerationStrategyImpl
		 * @see org.abchip.mimo.database.impl.DatabasePackageImpl#getCatalogGenerationStrategy()
		 * @generated
		 */
		EClass CATALOG_GENERATION_STRATEGY = eINSTANCE.getCatalogGenerationStrategy();

		/**
		 * The meta object literal for the '<em><b>Create Index On View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_GENERATION_STRATEGY__CREATE_INDEX_ON_VIEW = eINSTANCE.getCatalogGenerationStrategy_CreateIndexOnView();

		/**
		 * The meta object literal for the '<em><b>Create Relative Record Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG_GENERATION_STRATEGY__CREATE_RELATIVE_RECORD_NUMBER = eINSTANCE.getCatalogGenerationStrategy_CreateRelativeRecordNumber();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.impl.CatalogMetaDataImpl <em>Catalog Meta Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.impl.CatalogMetaDataImpl
		 * @see org.abchip.mimo.database.impl.DatabasePackageImpl#getCatalogMetaData()
		 * @generated
		 */
		EClass CATALOG_META_DATA = eINSTANCE.getCatalogMetaData();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.impl.DatabaseContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.impl.DatabaseContainerImpl
		 * @see org.abchip.mimo.database.impl.DatabasePackageImpl#getDatabaseContainer()
		 * @generated
		 */
		EClass DATABASE_CONTAINER = eINSTANCE.getDatabaseContainer();

		/**
		 * The meta object literal for the '<em><b>Catalog Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_CONTAINER__CATALOG_CONTAINERS = eINSTANCE.getDatabaseContainer_CatalogContainers();

		/**
		 * The meta object literal for the '<em><b>Default Catalog Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_CONTAINER__DEFAULT_CATALOG_CONTAINER = eINSTANCE.getDatabaseContainer_DefaultCatalogContainer();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_CONTAINER__VENDOR = eINSTANCE.getDatabaseContainer_Vendor();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_CONTAINER__VERSION = eINSTANCE.getDatabaseContainer_Version();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.DatabaseManager <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.DatabaseManager
		 * @see org.abchip.mimo.database.impl.DatabasePackageImpl#getDatabaseManager()
		 * @generated
		 */
		EClass DATABASE_MANAGER = eINSTANCE.getDatabaseManager();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.impl.QualifiedNameImpl
		 * @see org.abchip.mimo.database.impl.DatabasePackageImpl#getQualifiedName()
		 * @generated
		 */
		EClass QUALIFIED_NAME = eINSTANCE.getQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Qualifiers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFIED_NAME__QUALIFIERS = eINSTANCE.getQualifiedName_Qualifiers();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.TableProvider <em>Table Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.TableProvider
		 * @see org.abchip.mimo.database.impl.DatabasePackageImpl#getTableProvider()
		 * @generated
		 */
		EClass TABLE_PROVIDER = eINSTANCE.getTableProvider();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.SearchStrategy <em>Search Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.SearchStrategy
		 * @see org.abchip.mimo.database.impl.DatabasePackageImpl#getSearchStrategy()
		 * @generated
		 */
		EEnum SEARCH_STRATEGY = eINSTANCE.getSearchStrategy();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.sql.SQLException
		 * @see org.abchip.mimo.database.impl.DatabasePackageImpl#getDatabaseException()
		 * @generated
		 */
		EDataType DATABASE_EXCEPTION = eINSTANCE.getDatabaseException();

	}

} //DatabasePackage
