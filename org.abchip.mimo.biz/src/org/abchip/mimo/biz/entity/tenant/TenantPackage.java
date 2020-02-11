/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.tenant;

import org.abchip.mimo.biz.BizPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.abchip.mimo.biz.entity.tenant.TenantFactory
 * @model kind="package"
 * @generated
 */
public interface TenantPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tenant";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/entity/tenant";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-tenant";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TenantPackage eINSTANCE = org.abchip.mimo.biz.entity.tenant.impl.TenantPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.entity.tenant.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.entity.tenant.impl.ComponentImpl
	 * @see org.abchip.mimo.biz.entity.tenant.impl.TenantPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ROOT_LOCATION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tenant Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TENANT_COMPONENTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.entity.tenant.impl.TenantImpl <em>Tenant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.entity.tenant.impl.TenantImpl
	 * @see org.abchip.mimo.biz.entity.tenant.impl.TenantPackageImpl#getTenant()
	 * @generated
	 */
	int TENANT = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Tenant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT__TENANT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT__DISABLED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT__INITIAL_PATH = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tenant Data Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT__TENANT_DATA_SOURCES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tenant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT__TENANT_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Tenant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.entity.tenant.impl.TenantComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.entity.tenant.impl.TenantComponentImpl
	 * @see org.abchip.mimo.biz.entity.tenant.impl.TenantPackageImpl#getTenantComponent()
	 * @generated
	 */
	int TENANT_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_COMPONENT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_COMPONENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_COMPONENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_COMPONENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Tenant Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_COMPONENT__TENANT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_COMPONENT__COMPONENT_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_COMPONENT__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_COMPONENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.entity.tenant.impl.TenantDataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.entity.tenant.impl.TenantDataSourceImpl
	 * @see org.abchip.mimo.biz.entity.tenant.impl.TenantPackageImpl#getTenantDataSource()
	 * @generated
	 */
	int TENANT_DATA_SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_DATA_SOURCE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_DATA_SOURCE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_DATA_SOURCE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_DATA_SOURCE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Tenant Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_DATA_SOURCE__TENANT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_DATA_SOURCE__ENTITY_GROUP_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jdbc Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_DATA_SOURCE__JDBC_PASSWORD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Jdbc Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_DATA_SOURCE__JDBC_URI = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Jdbc Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_DATA_SOURCE__JDBC_USERNAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_DATA_SOURCE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.entity.tenant.impl.TenantDomainNameImpl <em>Domain Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.entity.tenant.impl.TenantDomainNameImpl
	 * @see org.abchip.mimo.biz.entity.tenant.impl.TenantPackageImpl#getTenantDomainName()
	 * @generated
	 */
	int TENANT_DOMAIN_NAME = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_DOMAIN_NAME__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_DOMAIN_NAME__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_DOMAIN_NAME__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_DOMAIN_NAME__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_DOMAIN_NAME__DOMAIN_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tenant Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_DOMAIN_NAME__TENANT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Domain Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_DOMAIN_NAME_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.entity.tenant.impl.TenantKeyEncryptingKeyImpl <em>Key Encrypting Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.entity.tenant.impl.TenantKeyEncryptingKeyImpl
	 * @see org.abchip.mimo.biz.entity.tenant.impl.TenantPackageImpl#getTenantKeyEncryptingKey()
	 * @generated
	 */
	int TENANT_KEY_ENCRYPTING_KEY = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_KEY_ENCRYPTING_KEY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_KEY_ENCRYPTING_KEY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_KEY_ENCRYPTING_KEY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_KEY_ENCRYPTING_KEY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Tenant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_KEY_ENCRYPTING_KEY__TENANT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kek Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_KEY_ENCRYPTING_KEY__KEK_TEXT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Key Encrypting Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENANT_KEY_ENCRYPTING_KEY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.entity.tenant.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.abchip.mimo.biz.entity.tenant.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.tenant.Component#getComponentName <em>Component Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Name</em>'.
	 * @see org.abchip.mimo.biz.entity.tenant.Component#getComponentName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ComponentName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.tenant.Component#getRootLocation <em>Root Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Location</em>'.
	 * @see org.abchip.mimo.biz.entity.tenant.Component#getRootLocation()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_RootLocation();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.entity.tenant.Component#getTenantComponents <em>Tenant Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tenant Components</em>'.
	 * @see org.abchip.mimo.biz.entity.tenant.Component#getTenantComponents()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_TenantComponents();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.entity.tenant.Tenant <em>Tenant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tenant</em>'.
	 * @see org.abchip.mimo.biz.entity.tenant.Tenant
	 * @generated
	 */
	EClass getTenant();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.tenant.Tenant#getTenantId <em>Tenant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant Id</em>'.
	 * @see org.abchip.mimo.biz.entity.tenant.Tenant#getTenantId()
	 * @see #getTenant()
	 * @generated
	 */
	EAttribute getTenant_TenantId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.tenant.Tenant#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.abchip.mimo.biz.entity.tenant.Tenant#isDisabled()
	 * @see #getTenant()
	 * @generated
	 */
	EAttribute getTenant_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.tenant.Tenant#getInitialPath <em>Initial Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Path</em>'.
	 * @see org.abchip.mimo.biz.entity.tenant.Tenant#getInitialPath()
	 * @see #getTenant()
	 * @generated
	 */
	EAttribute getTenant_InitialPath();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.entity.tenant.Tenant#getTenantDataSources <em>Tenant Data Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tenant Data Sources</em>'.
	 * @see org.abchip.mimo.biz.entity.tenant.Tenant#getTenantDataSources()
	 * @see #getTenant()
	 * @generated
	 */
	EReference getTenant_TenantDataSources();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.tenant.Tenant#getTenantName <em>Tenant Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant Name</em>'.
	 * @see org.abchip.mimo.biz.entity.tenant.Tenant#getTenantName()
	 * @see #getTenant()
	 * @generated
	 */
	EAttribute getTenant_TenantName();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.entity.tenant.TenantComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.abchip.mimo.biz.entity.tenant.TenantComponent
	 * @generated
	 */
	EClass getTenantComponent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.entity.tenant.TenantComponent#getComponentName <em>Component Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Name</em>'.
	 * @see org.abchip.mimo.biz.entity.tenant.TenantComponent#getComponentName()
	 * @see #getTenantComponent()
	 * @generated
	 */
	EReference getTenantComponent_ComponentName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.entity.tenant.TenantComponent#getTenantId <em>Tenant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tenant Id</em>'.
	 * @see org.abchip.mimo.biz.entity.tenant.TenantComponent#getTenantId()
	 * @see #getTenantComponent()
	 * @generated
	 */
	EReference getTenantComponent_TenantId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.tenant.TenantComponent#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.entity.tenant.TenantComponent#getSequenceNum()
	 * @see #getTenantComponent()
	 * @generated
	 */
	EAttribute getTenantComponent_SequenceNum();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.entity.tenant.TenantDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see org.abchip.mimo.biz.entity.tenant.TenantDataSource
	 * @generated
	 */
	EClass getTenantDataSource();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.entity.tenant.TenantDataSource#getTenantId <em>Tenant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tenant Id</em>'.
	 * @see org.abchip.mimo.biz.entity.tenant.TenantDataSource#getTenantId()
	 * @see #getTenantDataSource()
	 * @generated
	 */
	EReference getTenantDataSource_TenantId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.tenant.TenantDataSource#getEntityGroupName <em>Entity Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Group Name</em>'.
	 * @see org.abchip.mimo.biz.entity.tenant.TenantDataSource#getEntityGroupName()
	 * @see #getTenantDataSource()
	 * @generated
	 */
	EAttribute getTenantDataSource_EntityGroupName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.tenant.TenantDataSource#getJdbcPassword <em>Jdbc Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jdbc Password</em>'.
	 * @see org.abchip.mimo.biz.entity.tenant.TenantDataSource#getJdbcPassword()
	 * @see #getTenantDataSource()
	 * @generated
	 */
	EAttribute getTenantDataSource_JdbcPassword();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.tenant.TenantDataSource#getJdbcUri <em>Jdbc Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jdbc Uri</em>'.
	 * @see org.abchip.mimo.biz.entity.tenant.TenantDataSource#getJdbcUri()
	 * @see #getTenantDataSource()
	 * @generated
	 */
	EAttribute getTenantDataSource_JdbcUri();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.tenant.TenantDataSource#getJdbcUsername <em>Jdbc Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jdbc Username</em>'.
	 * @see org.abchip.mimo.biz.entity.tenant.TenantDataSource#getJdbcUsername()
	 * @see #getTenantDataSource()
	 * @generated
	 */
	EAttribute getTenantDataSource_JdbcUsername();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.entity.tenant.TenantDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Name</em>'.
	 * @see org.abchip.mimo.biz.entity.tenant.TenantDomainName
	 * @generated
	 */
	EClass getTenantDomainName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.tenant.TenantDomainName#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see org.abchip.mimo.biz.entity.tenant.TenantDomainName#getDomainName()
	 * @see #getTenantDomainName()
	 * @generated
	 */
	EAttribute getTenantDomainName_DomainName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.entity.tenant.TenantDomainName#getTenantId <em>Tenant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tenant Id</em>'.
	 * @see org.abchip.mimo.biz.entity.tenant.TenantDomainName#getTenantId()
	 * @see #getTenantDomainName()
	 * @generated
	 */
	EReference getTenantDomainName_TenantId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.entity.tenant.TenantKeyEncryptingKey <em>Key Encrypting Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Encrypting Key</em>'.
	 * @see org.abchip.mimo.biz.entity.tenant.TenantKeyEncryptingKey
	 * @generated
	 */
	EClass getTenantKeyEncryptingKey();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.tenant.TenantKeyEncryptingKey#getTenantId <em>Tenant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant Id</em>'.
	 * @see org.abchip.mimo.biz.entity.tenant.TenantKeyEncryptingKey#getTenantId()
	 * @see #getTenantKeyEncryptingKey()
	 * @generated
	 */
	EAttribute getTenantKeyEncryptingKey_TenantId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.tenant.TenantKeyEncryptingKey#getKekText <em>Kek Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kek Text</em>'.
	 * @see org.abchip.mimo.biz.entity.tenant.TenantKeyEncryptingKey#getKekText()
	 * @see #getTenantKeyEncryptingKey()
	 * @generated
	 */
	EAttribute getTenantKeyEncryptingKey_KekText();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TenantFactory getTenantFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.entity.tenant.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.entity.tenant.impl.ComponentImpl
		 * @see org.abchip.mimo.biz.entity.tenant.impl.TenantPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Component Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__COMPONENT_NAME = eINSTANCE.getComponent_ComponentName();

		/**
		 * The meta object literal for the '<em><b>Root Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__ROOT_LOCATION = eINSTANCE.getComponent_RootLocation();

		/**
		 * The meta object literal for the '<em><b>Tenant Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__TENANT_COMPONENTS = eINSTANCE.getComponent_TenantComponents();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.entity.tenant.impl.TenantImpl <em>Tenant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.entity.tenant.impl.TenantImpl
		 * @see org.abchip.mimo.biz.entity.tenant.impl.TenantPackageImpl#getTenant()
		 * @generated
		 */
		EClass TENANT = eINSTANCE.getTenant();

		/**
		 * The meta object literal for the '<em><b>Tenant Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENANT__TENANT_ID = eINSTANCE.getTenant_TenantId();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENANT__DISABLED = eINSTANCE.getTenant_Disabled();

		/**
		 * The meta object literal for the '<em><b>Initial Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENANT__INITIAL_PATH = eINSTANCE.getTenant_InitialPath();

		/**
		 * The meta object literal for the '<em><b>Tenant Data Sources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENANT__TENANT_DATA_SOURCES = eINSTANCE.getTenant_TenantDataSources();

		/**
		 * The meta object literal for the '<em><b>Tenant Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENANT__TENANT_NAME = eINSTANCE.getTenant_TenantName();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.entity.tenant.impl.TenantComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.entity.tenant.impl.TenantComponentImpl
		 * @see org.abchip.mimo.biz.entity.tenant.impl.TenantPackageImpl#getTenantComponent()
		 * @generated
		 */
		EClass TENANT_COMPONENT = eINSTANCE.getTenantComponent();

		/**
		 * The meta object literal for the '<em><b>Component Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENANT_COMPONENT__COMPONENT_NAME = eINSTANCE.getTenantComponent_ComponentName();

		/**
		 * The meta object literal for the '<em><b>Tenant Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENANT_COMPONENT__TENANT_ID = eINSTANCE.getTenantComponent_TenantId();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENANT_COMPONENT__SEQUENCE_NUM = eINSTANCE.getTenantComponent_SequenceNum();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.entity.tenant.impl.TenantDataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.entity.tenant.impl.TenantDataSourceImpl
		 * @see org.abchip.mimo.biz.entity.tenant.impl.TenantPackageImpl#getTenantDataSource()
		 * @generated
		 */
		EClass TENANT_DATA_SOURCE = eINSTANCE.getTenantDataSource();

		/**
		 * The meta object literal for the '<em><b>Tenant Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENANT_DATA_SOURCE__TENANT_ID = eINSTANCE.getTenantDataSource_TenantId();

		/**
		 * The meta object literal for the '<em><b>Entity Group Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENANT_DATA_SOURCE__ENTITY_GROUP_NAME = eINSTANCE.getTenantDataSource_EntityGroupName();

		/**
		 * The meta object literal for the '<em><b>Jdbc Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENANT_DATA_SOURCE__JDBC_PASSWORD = eINSTANCE.getTenantDataSource_JdbcPassword();

		/**
		 * The meta object literal for the '<em><b>Jdbc Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENANT_DATA_SOURCE__JDBC_URI = eINSTANCE.getTenantDataSource_JdbcUri();

		/**
		 * The meta object literal for the '<em><b>Jdbc Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENANT_DATA_SOURCE__JDBC_USERNAME = eINSTANCE.getTenantDataSource_JdbcUsername();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.entity.tenant.impl.TenantDomainNameImpl <em>Domain Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.entity.tenant.impl.TenantDomainNameImpl
		 * @see org.abchip.mimo.biz.entity.tenant.impl.TenantPackageImpl#getTenantDomainName()
		 * @generated
		 */
		EClass TENANT_DOMAIN_NAME = eINSTANCE.getTenantDomainName();

		/**
		 * The meta object literal for the '<em><b>Domain Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENANT_DOMAIN_NAME__DOMAIN_NAME = eINSTANCE.getTenantDomainName_DomainName();

		/**
		 * The meta object literal for the '<em><b>Tenant Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENANT_DOMAIN_NAME__TENANT_ID = eINSTANCE.getTenantDomainName_TenantId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.entity.tenant.impl.TenantKeyEncryptingKeyImpl <em>Key Encrypting Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.entity.tenant.impl.TenantKeyEncryptingKeyImpl
		 * @see org.abchip.mimo.biz.entity.tenant.impl.TenantPackageImpl#getTenantKeyEncryptingKey()
		 * @generated
		 */
		EClass TENANT_KEY_ENCRYPTING_KEY = eINSTANCE.getTenantKeyEncryptingKey();

		/**
		 * The meta object literal for the '<em><b>Tenant Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENANT_KEY_ENCRYPTING_KEY__TENANT_ID = eINSTANCE.getTenantKeyEncryptingKey_TenantId();

		/**
		 * The meta object literal for the '<em><b>Kek Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENANT_KEY_ENCRYPTING_KEY__KEK_TEXT = eINSTANCE.getTenantKeyEncryptingKey_KekText();

	}

} //TenantPackage
