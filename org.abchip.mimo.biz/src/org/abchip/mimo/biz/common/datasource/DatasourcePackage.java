/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.datasource;

import org.abchip.mimo.biz.BizPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see org.abchip.mimo.biz.common.datasource.DatasourceFactory
 * @model kind="package"
 * @generated
 */
public interface DatasourcePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datasource";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/common/datasource";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-datasource";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatasourcePackage eINSTANCE = org.abchip.mimo.biz.common.datasource.impl.DatasourcePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.datasource.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.datasource.impl.DataSourceImpl
	 * @see org.abchip.mimo.biz.common.datasource.impl.DatasourcePackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Data Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__DATA_SOURCE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Source Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__DATA_SOURCE_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___ISA = BizPackage.BIZ_ENTITY_TYPED___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___GET_NAME = BizPackage.BIZ_ENTITY_TYPED___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___GET_URI = BizPackage.BIZ_ENTITY_TYPED___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___IS_PROXY = BizPackage.BIZ_ENTITY_TYPED___IS_PROXY;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___GET_TYPE = BizPackage.BIZ_ENTITY_TYPED___GET_TYPE;

	/**
	 * The operation id for the '<em>Content Meta Datas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___CONTENT_META_DATAS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___CONTENTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Data Resource Meta Datas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___DATA_RESOURCE_META_DATAS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Data Resources</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___DATA_RESOURCES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Geo Points</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___GEO_POINTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Parties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE___PARTIES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_OPERATION_COUNT = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.datasource.impl.DataSourceTypeImpl <em>Data Source Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.datasource.impl.DataSourceTypeImpl
	 * @see org.abchip.mimo.biz.common.datasource.impl.DatasourcePackageImpl#getDataSourceType()
	 * @generated
	 */
	int DATA_SOURCE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Data Source Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE__DATA_SOURCE_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;


	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE___ISA = BizPackage.BIZ_ENTITY_TYPE___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE___GET_NAME = BizPackage.BIZ_ENTITY_TYPE___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE___GET_URI = BizPackage.BIZ_ENTITY_TYPE___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE___IS_PROXY = BizPackage.BIZ_ENTITY_TYPE___IS_PROXY;

	/**
	 * The operation id for the '<em>Get Frame</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE___GET_FRAME = BizPackage.BIZ_ENTITY_TYPE___GET_FRAME;

	/**
	 * The operation id for the '<em>Get Type Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE___GET_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE___GET_TYPE_ID;

	/**
	 * The operation id for the '<em>Has Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE___HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE___HAS_TABLE;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE___GET_TEXT = BizPackage.BIZ_ENTITY_TYPE___GET_TEXT;

	/**
	 * The operation id for the '<em>Data Sources</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE___DATA_SOURCES = BizPackage.BIZ_ENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_TYPE_OPERATION_COUNT = BizPackage.BIZ_ENTITY_TYPE_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.datasource.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see org.abchip.mimo.biz.common.datasource.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.datasource.DataSource#getDataSourceId <em>Data Source Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source Id</em>'.
	 * @see org.abchip.mimo.biz.common.datasource.DataSource#getDataSourceId()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_DataSourceId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.datasource.DataSource#getDataSourceTypeId <em>Data Source Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Source Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.datasource.DataSource#getDataSourceTypeId()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_DataSourceTypeId();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.datasource.DataSource#contentMetaDatas() <em>Content Meta Datas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Content Meta Datas</em>' operation.
	 * @see org.abchip.mimo.biz.common.datasource.DataSource#contentMetaDatas()
	 * @generated
	 */
	EOperation getDataSource__ContentMetaDatas();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.datasource.DataSource#contents() <em>Contents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contents</em>' operation.
	 * @see org.abchip.mimo.biz.common.datasource.DataSource#contents()
	 * @generated
	 */
	EOperation getDataSource__Contents();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.datasource.DataSource#dataResourceMetaDatas() <em>Data Resource Meta Datas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Data Resource Meta Datas</em>' operation.
	 * @see org.abchip.mimo.biz.common.datasource.DataSource#dataResourceMetaDatas()
	 * @generated
	 */
	EOperation getDataSource__DataResourceMetaDatas();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.datasource.DataSource#dataResources() <em>Data Resources</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Data Resources</em>' operation.
	 * @see org.abchip.mimo.biz.common.datasource.DataSource#dataResources()
	 * @generated
	 */
	EOperation getDataSource__DataResources();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.datasource.DataSource#geoPoints() <em>Geo Points</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Geo Points</em>' operation.
	 * @see org.abchip.mimo.biz.common.datasource.DataSource#geoPoints()
	 * @generated
	 */
	EOperation getDataSource__GeoPoints();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.datasource.DataSource#parties() <em>Parties</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parties</em>' operation.
	 * @see org.abchip.mimo.biz.common.datasource.DataSource#parties()
	 * @generated
	 */
	EOperation getDataSource__Parties();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.datasource.DataSource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.common.datasource.DataSource#getDescription()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.datasource.DataSourceType <em>Data Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source Type</em>'.
	 * @see org.abchip.mimo.biz.common.datasource.DataSourceType
	 * @generated
	 */
	EClass getDataSourceType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.datasource.DataSourceType#getDataSourceTypeId <em>Data Source Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.datasource.DataSourceType#getDataSourceTypeId()
	 * @see #getDataSourceType()
	 * @generated
	 */
	EAttribute getDataSourceType_DataSourceTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.datasource.DataSourceType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.common.datasource.DataSourceType#getDescription()
	 * @see #getDataSourceType()
	 * @generated
	 */
	EAttribute getDataSourceType_Description();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.datasource.DataSourceType#dataSources() <em>Data Sources</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Data Sources</em>' operation.
	 * @see org.abchip.mimo.biz.common.datasource.DataSourceType#dataSources()
	 * @generated
	 */
	EOperation getDataSourceType__DataSources();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatasourceFactory getDatasourceFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.datasource.impl.DataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.datasource.impl.DataSourceImpl
		 * @see org.abchip.mimo.biz.common.datasource.impl.DatasourcePackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '<em><b>Data Source Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__DATA_SOURCE_ID = eINSTANCE.getDataSource_DataSourceId();

		/**
		 * The meta object literal for the '<em><b>Data Source Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE__DATA_SOURCE_TYPE_ID = eINSTANCE.getDataSource_DataSourceTypeId();

		/**
		 * The meta object literal for the '<em><b>Content Meta Datas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SOURCE___CONTENT_META_DATAS = eINSTANCE.getDataSource__ContentMetaDatas();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SOURCE___CONTENTS = eINSTANCE.getDataSource__Contents();

		/**
		 * The meta object literal for the '<em><b>Data Resource Meta Datas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SOURCE___DATA_RESOURCE_META_DATAS = eINSTANCE.getDataSource__DataResourceMetaDatas();

		/**
		 * The meta object literal for the '<em><b>Data Resources</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SOURCE___DATA_RESOURCES = eINSTANCE.getDataSource__DataResources();

		/**
		 * The meta object literal for the '<em><b>Geo Points</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SOURCE___GEO_POINTS = eINSTANCE.getDataSource__GeoPoints();

		/**
		 * The meta object literal for the '<em><b>Parties</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SOURCE___PARTIES = eINSTANCE.getDataSource__Parties();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__DESCRIPTION = eINSTANCE.getDataSource_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.datasource.impl.DataSourceTypeImpl <em>Data Source Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.datasource.impl.DataSourceTypeImpl
		 * @see org.abchip.mimo.biz.common.datasource.impl.DatasourcePackageImpl#getDataSourceType()
		 * @generated
		 */
		EClass DATA_SOURCE_TYPE = eINSTANCE.getDataSourceType();

		/**
		 * The meta object literal for the '<em><b>Data Source Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE_TYPE__DATA_SOURCE_TYPE_ID = eINSTANCE.getDataSourceType_DataSourceTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE_TYPE__DESCRIPTION = eINSTANCE.getDataSourceType_Description();

		/**
		 * The meta object literal for the '<em><b>Data Sources</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SOURCE_TYPE___DATA_SOURCES = eINSTANCE.getDataSourceType__DataSources();

	}

} //DatasourcePackage
