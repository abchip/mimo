/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.config;

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
 * @see org.abchip.mimo.biz.product.config.ConfigFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "config";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/product/config";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-config";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigPackage eINSTANCE = org.abchip.mimo.biz.product.config.impl.ConfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.config.impl.ConfigOptionProductOptionImpl <em>Option Product Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.config.impl.ConfigOptionProductOptionImpl
	 * @see org.abchip.mimo.biz.product.config.impl.ConfigPackageImpl#getConfigOptionProductOption()
	 * @generated
	 */
	int CONFIG_OPTION_PRODUCT_OPTION = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_OPTION_PRODUCT_OPTION__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_OPTION_PRODUCT_OPTION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_OPTION_PRODUCT_OPTION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_OPTION_PRODUCT_OPTION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_OPTION_PRODUCT_OPTION__CONFIG_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Config Item Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_OPTION_PRODUCT_OPTION__CONFIG_ITEM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config Option Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_OPTION_PRODUCT_OPTION__CONFIG_OPTION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_OPTION_PRODUCT_OPTION__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_OPTION_PRODUCT_OPTION__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_OPTION_PRODUCT_OPTION__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Product Option Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_OPTION_PRODUCT_OPTION__PRODUCT_OPTION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Option Product Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_OPTION_PRODUCT_OPTION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.config.impl.ProdConfItemContentImpl <em>Prod Conf Item Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.config.impl.ProdConfItemContentImpl
	 * @see org.abchip.mimo.biz.product.config.impl.ConfigPackageImpl#getProdConfItemContent()
	 * @generated
	 */
	int PROD_CONF_ITEM_CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CONF_ITEM_CONTENT__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CONF_ITEM_CONTENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CONF_ITEM_CONTENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CONF_ITEM_CONTENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Config Item Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CONF_ITEM_CONTENT__CONFIG_ITEM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CONF_ITEM_CONTENT__CONTENT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conf Item Content Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CONF_ITEM_CONTENT__CONF_ITEM_CONTENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CONF_ITEM_CONTENT__FROM_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CONF_ITEM_CONTENT__THRU_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Prod Conf Item Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CONF_ITEM_CONTENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.config.impl.ProdConfItemContentTypeImpl <em>Prod Conf Item Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.config.impl.ProdConfItemContentTypeImpl
	 * @see org.abchip.mimo.biz.product.config.impl.ConfigPackageImpl#getProdConfItemContentType()
	 * @generated
	 */
	int PROD_CONF_ITEM_CONTENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CONF_ITEM_CONTENT_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CONF_ITEM_CONTENT_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CONF_ITEM_CONTENT_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CONF_ITEM_CONTENT_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CONF_ITEM_CONTENT_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Conf Item Content Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CONF_ITEM_CONTENT_TYPE__CONF_ITEM_CONTENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CONF_ITEM_CONTENT_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CONF_ITEM_CONTENT_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CONF_ITEM_CONTENT_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Prod Conf Item Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROD_CONF_ITEM_CONTENT_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.config.impl.ProductConfigImpl <em>Product Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.config.impl.ProductConfigImpl
	 * @see org.abchip.mimo.biz.product.config.impl.ConfigPackageImpl#getProductConfig()
	 * @generated
	 */
	int PRODUCT_CONFIG = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Config Item Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG__CONFIG_ITEM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Config Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG__CONFIG_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Default Config Option Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG__DEFAULT_CONFIG_OPTION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG__IS_MANDATORY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG__LONG_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Product Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.config.impl.ProductConfigConfigImpl <em>Product Config Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.config.impl.ProductConfigConfigImpl
	 * @see org.abchip.mimo.biz.product.config.impl.ConfigPackageImpl#getProductConfigConfig()
	 * @generated
	 */
	int PRODUCT_CONFIG_CONFIG = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_CONFIG__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_CONFIG__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_CONFIG__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_CONFIG__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Config Item Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_CONFIG__CONFIG_ITEM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_CONFIG__CONFIG_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config Option Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_CONFIG__CONFIG_OPTION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_CONFIG__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_CONFIG__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Product Config Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_CONFIG_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.config.impl.ProductConfigItemImpl <em>Product Config Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.config.impl.ProductConfigItemImpl
	 * @see org.abchip.mimo.biz.product.config.impl.ConfigPackageImpl#getProductConfigItem()
	 * @generated
	 */
	int PRODUCT_CONFIG_ITEM = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_ITEM__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_ITEM__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_ITEM__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_ITEM__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Config Item Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_ITEM__CONFIG_ITEM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Config Item Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_ITEM__CONFIG_ITEM_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config Item Product Config Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_ITEM__CONFIG_ITEM_PRODUCT_CONFIG_OPTIONS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Config Item Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_ITEM__CONFIG_ITEM_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_ITEM__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_ITEM__IMAGE_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_ITEM__LONG_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Product Config Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_ITEM_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.config.impl.ProductConfigOptionImpl <em>Product Config Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.config.impl.ProductConfigOptionImpl
	 * @see org.abchip.mimo.biz.product.config.impl.ConfigPackageImpl#getProductConfigOption()
	 * @generated
	 */
	int PRODUCT_CONFIG_OPTION = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_OPTION__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_OPTION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_OPTION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_OPTION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Config Item Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_OPTION__CONFIG_ITEM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Config Option Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_OPTION__CONFIG_OPTION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config Option Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_OPTION__CONFIG_OPTION_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_OPTION__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_OPTION__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Product Config Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_OPTION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.config.impl.ProductConfigOptionIactnImpl <em>Product Config Option Iactn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.config.impl.ProductConfigOptionIactnImpl
	 * @see org.abchip.mimo.biz.product.config.impl.ConfigPackageImpl#getProductConfigOptionIactn()
	 * @generated
	 */
	int PRODUCT_CONFIG_OPTION_IACTN = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_OPTION_IACTN__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_OPTION_IACTN__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_OPTION_IACTN__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_OPTION_IACTN__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Config Item Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_OPTION_IACTN__CONFIG_ITEM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Config Item Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_OPTION_IACTN__CONFIG_ITEM_ID_TO = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config Option Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_OPTION_IACTN__CONFIG_OPTION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Config Option Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_OPTION_IACTN__CONFIG_OPTION_ID_TO = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_OPTION_IACTN__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Config Iactn Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_OPTION_IACTN__CONFIG_IACTN_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_OPTION_IACTN__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Product Config Option Iactn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_OPTION_IACTN_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.config.impl.ProductConfigProductImpl <em>Product Config Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.config.impl.ProductConfigProductImpl
	 * @see org.abchip.mimo.biz.product.config.impl.ConfigPackageImpl#getProductConfigProduct()
	 * @generated
	 */
	int PRODUCT_CONFIG_PRODUCT = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_PRODUCT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_PRODUCT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_PRODUCT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_PRODUCT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Config Item Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_PRODUCT__CONFIG_ITEM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_PRODUCT__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config Option Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_PRODUCT__CONFIG_OPTION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_PRODUCT__QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_PRODUCT__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Product Config Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_PRODUCT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.config.impl.ProductConfigStatsImpl <em>Product Config Stats</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.config.impl.ProductConfigStatsImpl
	 * @see org.abchip.mimo.biz.product.config.impl.ConfigPackageImpl#getProductConfigStats()
	 * @generated
	 */
	int PRODUCT_CONFIG_STATS = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_STATS__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_STATS__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_STATS__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_STATS__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_STATS__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_STATS__CONFIG_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_STATS__CONFIG_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Num Of Confs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_STATS__NUM_OF_CONFS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Product Config Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONFIG_STATS_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.config.ConfigOptionProductOption <em>Option Product Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Product Option</em>'.
	 * @see org.abchip.mimo.biz.product.config.ConfigOptionProductOption
	 * @generated
	 */
	EClass getConfigOptionProductOption();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ConfigOptionProductOption#getConfigId <em>Config Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ConfigOptionProductOption#getConfigId()
	 * @see #getConfigOptionProductOption()
	 * @generated
	 */
	EAttribute getConfigOptionProductOption_ConfigId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ConfigOptionProductOption#getConfigItemId <em>Config Item Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Item Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ConfigOptionProductOption#getConfigItemId()
	 * @see #getConfigOptionProductOption()
	 * @generated
	 */
	EAttribute getConfigOptionProductOption_ConfigItemId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ConfigOptionProductOption#getConfigOptionId <em>Config Option Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Option Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ConfigOptionProductOption#getConfigOptionId()
	 * @see #getConfigOptionProductOption()
	 * @generated
	 */
	EAttribute getConfigOptionProductOption_ConfigOptionId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ConfigOptionProductOption#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.product.config.ConfigOptionProductOption#getSequenceNum()
	 * @see #getConfigOptionProductOption()
	 * @generated
	 */
	EAttribute getConfigOptionProductOption_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ConfigOptionProductOption#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ConfigOptionProductOption#getProductId()
	 * @see #getConfigOptionProductOption()
	 * @generated
	 */
	EAttribute getConfigOptionProductOption_ProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ConfigOptionProductOption#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.config.ConfigOptionProductOption#getDescription()
	 * @see #getConfigOptionProductOption()
	 * @generated
	 */
	EAttribute getConfigOptionProductOption_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ConfigOptionProductOption#getProductOptionId <em>Product Option Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Option Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ConfigOptionProductOption#getProductOptionId()
	 * @see #getConfigOptionProductOption()
	 * @generated
	 */
	EAttribute getConfigOptionProductOption_ProductOptionId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.config.ProdConfItemContent <em>Prod Conf Item Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prod Conf Item Content</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProdConfItemContent
	 * @generated
	 */
	EClass getProdConfItemContent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.config.ProdConfItemContent#getConfigItemId <em>Config Item Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Config Item Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProdConfItemContent#getConfigItemId()
	 * @see #getProdConfItemContent()
	 * @generated
	 */
	EReference getProdConfItemContent_ConfigItemId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.config.ProdConfItemContent#getContentId <em>Content Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProdConfItemContent#getContentId()
	 * @see #getProdConfItemContent()
	 * @generated
	 */
	EReference getProdConfItemContent_ContentId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.config.ProdConfItemContent#getConfItemContentTypeId <em>Conf Item Content Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conf Item Content Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProdConfItemContent#getConfItemContentTypeId()
	 * @see #getProdConfItemContent()
	 * @generated
	 */
	EReference getProdConfItemContent_ConfItemContentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProdConfItemContent#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProdConfItemContent#getFromDate()
	 * @see #getProdConfItemContent()
	 * @generated
	 */
	EAttribute getProdConfItemContent_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProdConfItemContent#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProdConfItemContent#getThruDate()
	 * @see #getProdConfItemContent()
	 * @generated
	 */
	EAttribute getProdConfItemContent_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.config.ProdConfItemContentType <em>Prod Conf Item Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prod Conf Item Content Type</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProdConfItemContentType
	 * @generated
	 */
	EClass getProdConfItemContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProdConfItemContentType#getConfItemContentTypeId <em>Conf Item Content Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conf Item Content Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProdConfItemContentType#getConfItemContentTypeId()
	 * @see #getProdConfItemContentType()
	 * @generated
	 */
	EAttribute getProdConfItemContentType_ConfItemContentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProdConfItemContentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProdConfItemContentType#getDescription()
	 * @see #getProdConfItemContentType()
	 * @generated
	 */
	EAttribute getProdConfItemContentType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProdConfItemContentType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProdConfItemContentType#isHasTable()
	 * @see #getProdConfItemContentType()
	 * @generated
	 */
	EAttribute getProdConfItemContentType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.config.ProdConfItemContentType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProdConfItemContentType#getParentTypeId()
	 * @see #getProdConfItemContentType()
	 * @generated
	 */
	EReference getProdConfItemContentType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.config.ProductConfig <em>Product Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Config</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfig
	 * @generated
	 */
	EClass getProductConfig();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.config.ProductConfig#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfig#getProductId()
	 * @see #getProductConfig()
	 * @generated
	 */
	EReference getProductConfig_ProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.config.ProductConfig#getConfigItemId <em>Config Item Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Config Item Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfig#getConfigItemId()
	 * @see #getProductConfig()
	 * @generated
	 */
	EReference getProductConfig_ConfigItemId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfig#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfig#getSequenceNum()
	 * @see #getProductConfig()
	 * @generated
	 */
	EAttribute getProductConfig_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfig#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfig#getFromDate()
	 * @see #getProductConfig()
	 * @generated
	 */
	EAttribute getProductConfig_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfig#getConfigTypeId <em>Config Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfig#getConfigTypeId()
	 * @see #getProductConfig()
	 * @generated
	 */
	EAttribute getProductConfig_ConfigTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfig#getDefaultConfigOptionId <em>Default Config Option Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Config Option Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfig#getDefaultConfigOptionId()
	 * @see #getProductConfig()
	 * @generated
	 */
	EAttribute getProductConfig_DefaultConfigOptionId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfig#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfig#getDescription()
	 * @see #getProductConfig()
	 * @generated
	 */
	EAttribute getProductConfig_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfig#isIsMandatory <em>Is Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Mandatory</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfig#isIsMandatory()
	 * @see #getProductConfig()
	 * @generated
	 */
	EAttribute getProductConfig_IsMandatory();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfig#getLongDescription <em>Long Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Description</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfig#getLongDescription()
	 * @see #getProductConfig()
	 * @generated
	 */
	EAttribute getProductConfig_LongDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfig#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfig#getThruDate()
	 * @see #getProductConfig()
	 * @generated
	 */
	EAttribute getProductConfig_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.config.ProductConfigConfig <em>Product Config Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Config Config</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigConfig
	 * @generated
	 */
	EClass getProductConfigConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfigConfig#getConfigId <em>Config Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigConfig#getConfigId()
	 * @see #getProductConfigConfig()
	 * @generated
	 */
	EAttribute getProductConfigConfig_ConfigId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.config.ProductConfigConfig#getConfigItemId <em>Config Item Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Config Item Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigConfig#getConfigItemId()
	 * @see #getProductConfigConfig()
	 * @generated
	 */
	EReference getProductConfigConfig_ConfigItemId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfigConfig#getConfigOptionId <em>Config Option Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Option Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigConfig#getConfigOptionId()
	 * @see #getProductConfigConfig()
	 * @generated
	 */
	EAttribute getProductConfigConfig_ConfigOptionId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfigConfig#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigConfig#getSequenceNum()
	 * @see #getProductConfigConfig()
	 * @generated
	 */
	EAttribute getProductConfigConfig_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfigConfig#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigConfig#getDescription()
	 * @see #getProductConfigConfig()
	 * @generated
	 */
	EAttribute getProductConfigConfig_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.config.ProductConfigItem <em>Product Config Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Config Item</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigItem
	 * @generated
	 */
	EClass getProductConfigItem();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfigItem#getConfigItemId <em>Config Item Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Item Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigItem#getConfigItemId()
	 * @see #getProductConfigItem()
	 * @generated
	 */
	EAttribute getProductConfigItem_ConfigItemId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfigItem#getConfigItemName <em>Config Item Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Item Name</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigItem#getConfigItemName()
	 * @see #getProductConfigItem()
	 * @generated
	 */
	EAttribute getProductConfigItem_ConfigItemName();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.product.config.ProductConfigItem#getConfigItemProductConfigOptions <em>Config Item Product Config Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Config Item Product Config Options</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigItem#getConfigItemProductConfigOptions()
	 * @see #getProductConfigItem()
	 * @generated
	 */
	EReference getProductConfigItem_ConfigItemProductConfigOptions();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfigItem#getConfigItemTypeId <em>Config Item Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Item Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigItem#getConfigItemTypeId()
	 * @see #getProductConfigItem()
	 * @generated
	 */
	EAttribute getProductConfigItem_ConfigItemTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfigItem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigItem#getDescription()
	 * @see #getProductConfigItem()
	 * @generated
	 */
	EAttribute getProductConfigItem_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfigItem#getImageUrl <em>Image Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Url</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigItem#getImageUrl()
	 * @see #getProductConfigItem()
	 * @generated
	 */
	EAttribute getProductConfigItem_ImageUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfigItem#getLongDescription <em>Long Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Description</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigItem#getLongDescription()
	 * @see #getProductConfigItem()
	 * @generated
	 */
	EAttribute getProductConfigItem_LongDescription();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.config.ProductConfigOption <em>Product Config Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Config Option</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigOption
	 * @generated
	 */
	EClass getProductConfigOption();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.config.ProductConfigOption#getConfigItemId <em>Config Item Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Config Item Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigOption#getConfigItemId()
	 * @see #getProductConfigOption()
	 * @generated
	 */
	EReference getProductConfigOption_ConfigItemId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfigOption#getConfigOptionId <em>Config Option Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Option Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigOption#getConfigOptionId()
	 * @see #getProductConfigOption()
	 * @generated
	 */
	EAttribute getProductConfigOption_ConfigOptionId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfigOption#getConfigOptionName <em>Config Option Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Option Name</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigOption#getConfigOptionName()
	 * @see #getProductConfigOption()
	 * @generated
	 */
	EAttribute getProductConfigOption_ConfigOptionName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfigOption#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigOption#getDescription()
	 * @see #getProductConfigOption()
	 * @generated
	 */
	EAttribute getProductConfigOption_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfigOption#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigOption#getSequenceNum()
	 * @see #getProductConfigOption()
	 * @generated
	 */
	EAttribute getProductConfigOption_SequenceNum();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.config.ProductConfigOptionIactn <em>Product Config Option Iactn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Config Option Iactn</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigOptionIactn
	 * @generated
	 */
	EClass getProductConfigOptionIactn();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.config.ProductConfigOptionIactn#getConfigItemId <em>Config Item Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Config Item Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigOptionIactn#getConfigItemId()
	 * @see #getProductConfigOptionIactn()
	 * @generated
	 */
	EReference getProductConfigOptionIactn_ConfigItemId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfigOptionIactn#getConfigOptionId <em>Config Option Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Option Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigOptionIactn#getConfigOptionId()
	 * @see #getProductConfigOptionIactn()
	 * @generated
	 */
	EAttribute getProductConfigOptionIactn_ConfigOptionId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.config.ProductConfigOptionIactn#getConfigItemIdTo <em>Config Item Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Config Item Id To</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigOptionIactn#getConfigItemIdTo()
	 * @see #getProductConfigOptionIactn()
	 * @generated
	 */
	EReference getProductConfigOptionIactn_ConfigItemIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfigOptionIactn#getConfigOptionIdTo <em>Config Option Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Option Id To</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigOptionIactn#getConfigOptionIdTo()
	 * @see #getProductConfigOptionIactn()
	 * @generated
	 */
	EAttribute getProductConfigOptionIactn_ConfigOptionIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfigOptionIactn#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigOptionIactn#getSequenceNum()
	 * @see #getProductConfigOptionIactn()
	 * @generated
	 */
	EAttribute getProductConfigOptionIactn_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfigOptionIactn#getConfigIactnTypeId <em>Config Iactn Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Iactn Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigOptionIactn#getConfigIactnTypeId()
	 * @see #getProductConfigOptionIactn()
	 * @generated
	 */
	EAttribute getProductConfigOptionIactn_ConfigIactnTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfigOptionIactn#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigOptionIactn#getDescription()
	 * @see #getProductConfigOptionIactn()
	 * @generated
	 */
	EAttribute getProductConfigOptionIactn_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.config.ProductConfigProduct <em>Product Config Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Config Product</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigProduct
	 * @generated
	 */
	EClass getProductConfigProduct();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.config.ProductConfigProduct#getConfigItemId <em>Config Item Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Config Item Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigProduct#getConfigItemId()
	 * @see #getProductConfigProduct()
	 * @generated
	 */
	EReference getProductConfigProduct_ConfigItemId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfigProduct#getConfigOptionId <em>Config Option Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Option Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigProduct#getConfigOptionId()
	 * @see #getProductConfigProduct()
	 * @generated
	 */
	EAttribute getProductConfigProduct_ConfigOptionId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.config.ProductConfigProduct#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigProduct#getProductId()
	 * @see #getProductConfigProduct()
	 * @generated
	 */
	EReference getProductConfigProduct_ProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfigProduct#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigProduct#getQuantity()
	 * @see #getProductConfigProduct()
	 * @generated
	 */
	EAttribute getProductConfigProduct_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfigProduct#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigProduct#getSequenceNum()
	 * @see #getProductConfigProduct()
	 * @generated
	 */
	EAttribute getProductConfigProduct_SequenceNum();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.config.ProductConfigStats <em>Product Config Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Config Stats</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigStats
	 * @generated
	 */
	EClass getProductConfigStats();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfigStats#getConfigId <em>Config Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigStats#getConfigId()
	 * @see #getProductConfigStats()
	 * @generated
	 */
	EAttribute getProductConfigStats_ConfigId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.config.ProductConfigStats#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigStats#getProductId()
	 * @see #getProductConfigStats()
	 * @generated
	 */
	EReference getProductConfigStats_ProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfigStats#getConfigTypeId <em>Config Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigStats#getConfigTypeId()
	 * @see #getProductConfigStats()
	 * @generated
	 */
	EAttribute getProductConfigStats_ConfigTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.config.ProductConfigStats#getNumOfConfs <em>Num Of Confs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Of Confs</em>'.
	 * @see org.abchip.mimo.biz.product.config.ProductConfigStats#getNumOfConfs()
	 * @see #getProductConfigStats()
	 * @generated
	 */
	EAttribute getProductConfigStats_NumOfConfs();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigFactory getConfigFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.config.impl.ConfigOptionProductOptionImpl <em>Option Product Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.config.impl.ConfigOptionProductOptionImpl
		 * @see org.abchip.mimo.biz.product.config.impl.ConfigPackageImpl#getConfigOptionProductOption()
		 * @generated
		 */
		EClass CONFIG_OPTION_PRODUCT_OPTION = eINSTANCE.getConfigOptionProductOption();

		/**
		 * The meta object literal for the '<em><b>Config Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_OPTION_PRODUCT_OPTION__CONFIG_ID = eINSTANCE.getConfigOptionProductOption_ConfigId();

		/**
		 * The meta object literal for the '<em><b>Config Item Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_OPTION_PRODUCT_OPTION__CONFIG_ITEM_ID = eINSTANCE.getConfigOptionProductOption_ConfigItemId();

		/**
		 * The meta object literal for the '<em><b>Config Option Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_OPTION_PRODUCT_OPTION__CONFIG_OPTION_ID = eINSTANCE.getConfigOptionProductOption_ConfigOptionId();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_OPTION_PRODUCT_OPTION__SEQUENCE_NUM = eINSTANCE.getConfigOptionProductOption_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_OPTION_PRODUCT_OPTION__PRODUCT_ID = eINSTANCE.getConfigOptionProductOption_ProductId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_OPTION_PRODUCT_OPTION__DESCRIPTION = eINSTANCE.getConfigOptionProductOption_Description();

		/**
		 * The meta object literal for the '<em><b>Product Option Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_OPTION_PRODUCT_OPTION__PRODUCT_OPTION_ID = eINSTANCE.getConfigOptionProductOption_ProductOptionId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.config.impl.ProdConfItemContentImpl <em>Prod Conf Item Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.config.impl.ProdConfItemContentImpl
		 * @see org.abchip.mimo.biz.product.config.impl.ConfigPackageImpl#getProdConfItemContent()
		 * @generated
		 */
		EClass PROD_CONF_ITEM_CONTENT = eINSTANCE.getProdConfItemContent();

		/**
		 * The meta object literal for the '<em><b>Config Item Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROD_CONF_ITEM_CONTENT__CONFIG_ITEM_ID = eINSTANCE.getProdConfItemContent_ConfigItemId();

		/**
		 * The meta object literal for the '<em><b>Content Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROD_CONF_ITEM_CONTENT__CONTENT_ID = eINSTANCE.getProdConfItemContent_ContentId();

		/**
		 * The meta object literal for the '<em><b>Conf Item Content Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROD_CONF_ITEM_CONTENT__CONF_ITEM_CONTENT_TYPE_ID = eINSTANCE.getProdConfItemContent_ConfItemContentTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROD_CONF_ITEM_CONTENT__FROM_DATE = eINSTANCE.getProdConfItemContent_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROD_CONF_ITEM_CONTENT__THRU_DATE = eINSTANCE.getProdConfItemContent_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.config.impl.ProdConfItemContentTypeImpl <em>Prod Conf Item Content Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.config.impl.ProdConfItemContentTypeImpl
		 * @see org.abchip.mimo.biz.product.config.impl.ConfigPackageImpl#getProdConfItemContentType()
		 * @generated
		 */
		EClass PROD_CONF_ITEM_CONTENT_TYPE = eINSTANCE.getProdConfItemContentType();

		/**
		 * The meta object literal for the '<em><b>Conf Item Content Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROD_CONF_ITEM_CONTENT_TYPE__CONF_ITEM_CONTENT_TYPE_ID = eINSTANCE.getProdConfItemContentType_ConfItemContentTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROD_CONF_ITEM_CONTENT_TYPE__DESCRIPTION = eINSTANCE.getProdConfItemContentType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROD_CONF_ITEM_CONTENT_TYPE__HAS_TABLE = eINSTANCE.getProdConfItemContentType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROD_CONF_ITEM_CONTENT_TYPE__PARENT_TYPE_ID = eINSTANCE.getProdConfItemContentType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.config.impl.ProductConfigImpl <em>Product Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.config.impl.ProductConfigImpl
		 * @see org.abchip.mimo.biz.product.config.impl.ConfigPackageImpl#getProductConfig()
		 * @generated
		 */
		EClass PRODUCT_CONFIG = eINSTANCE.getProductConfig();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CONFIG__PRODUCT_ID = eINSTANCE.getProductConfig_ProductId();

		/**
		 * The meta object literal for the '<em><b>Config Item Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CONFIG__CONFIG_ITEM_ID = eINSTANCE.getProductConfig_ConfigItemId();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG__SEQUENCE_NUM = eINSTANCE.getProductConfig_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG__FROM_DATE = eINSTANCE.getProductConfig_FromDate();

		/**
		 * The meta object literal for the '<em><b>Config Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG__CONFIG_TYPE_ID = eINSTANCE.getProductConfig_ConfigTypeId();

		/**
		 * The meta object literal for the '<em><b>Default Config Option Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG__DEFAULT_CONFIG_OPTION_ID = eINSTANCE.getProductConfig_DefaultConfigOptionId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG__DESCRIPTION = eINSTANCE.getProductConfig_Description();

		/**
		 * The meta object literal for the '<em><b>Is Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG__IS_MANDATORY = eINSTANCE.getProductConfig_IsMandatory();

		/**
		 * The meta object literal for the '<em><b>Long Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG__LONG_DESCRIPTION = eINSTANCE.getProductConfig_LongDescription();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG__THRU_DATE = eINSTANCE.getProductConfig_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.config.impl.ProductConfigConfigImpl <em>Product Config Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.config.impl.ProductConfigConfigImpl
		 * @see org.abchip.mimo.biz.product.config.impl.ConfigPackageImpl#getProductConfigConfig()
		 * @generated
		 */
		EClass PRODUCT_CONFIG_CONFIG = eINSTANCE.getProductConfigConfig();

		/**
		 * The meta object literal for the '<em><b>Config Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG_CONFIG__CONFIG_ID = eINSTANCE.getProductConfigConfig_ConfigId();

		/**
		 * The meta object literal for the '<em><b>Config Item Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CONFIG_CONFIG__CONFIG_ITEM_ID = eINSTANCE.getProductConfigConfig_ConfigItemId();

		/**
		 * The meta object literal for the '<em><b>Config Option Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG_CONFIG__CONFIG_OPTION_ID = eINSTANCE.getProductConfigConfig_ConfigOptionId();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG_CONFIG__SEQUENCE_NUM = eINSTANCE.getProductConfigConfig_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG_CONFIG__DESCRIPTION = eINSTANCE.getProductConfigConfig_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.config.impl.ProductConfigItemImpl <em>Product Config Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.config.impl.ProductConfigItemImpl
		 * @see org.abchip.mimo.biz.product.config.impl.ConfigPackageImpl#getProductConfigItem()
		 * @generated
		 */
		EClass PRODUCT_CONFIG_ITEM = eINSTANCE.getProductConfigItem();

		/**
		 * The meta object literal for the '<em><b>Config Item Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG_ITEM__CONFIG_ITEM_ID = eINSTANCE.getProductConfigItem_ConfigItemId();

		/**
		 * The meta object literal for the '<em><b>Config Item Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG_ITEM__CONFIG_ITEM_NAME = eINSTANCE.getProductConfigItem_ConfigItemName();

		/**
		 * The meta object literal for the '<em><b>Config Item Product Config Options</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CONFIG_ITEM__CONFIG_ITEM_PRODUCT_CONFIG_OPTIONS = eINSTANCE.getProductConfigItem_ConfigItemProductConfigOptions();

		/**
		 * The meta object literal for the '<em><b>Config Item Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG_ITEM__CONFIG_ITEM_TYPE_ID = eINSTANCE.getProductConfigItem_ConfigItemTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG_ITEM__DESCRIPTION = eINSTANCE.getProductConfigItem_Description();

		/**
		 * The meta object literal for the '<em><b>Image Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG_ITEM__IMAGE_URL = eINSTANCE.getProductConfigItem_ImageUrl();

		/**
		 * The meta object literal for the '<em><b>Long Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG_ITEM__LONG_DESCRIPTION = eINSTANCE.getProductConfigItem_LongDescription();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.config.impl.ProductConfigOptionImpl <em>Product Config Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.config.impl.ProductConfigOptionImpl
		 * @see org.abchip.mimo.biz.product.config.impl.ConfigPackageImpl#getProductConfigOption()
		 * @generated
		 */
		EClass PRODUCT_CONFIG_OPTION = eINSTANCE.getProductConfigOption();

		/**
		 * The meta object literal for the '<em><b>Config Item Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CONFIG_OPTION__CONFIG_ITEM_ID = eINSTANCE.getProductConfigOption_ConfigItemId();

		/**
		 * The meta object literal for the '<em><b>Config Option Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG_OPTION__CONFIG_OPTION_ID = eINSTANCE.getProductConfigOption_ConfigOptionId();

		/**
		 * The meta object literal for the '<em><b>Config Option Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG_OPTION__CONFIG_OPTION_NAME = eINSTANCE.getProductConfigOption_ConfigOptionName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG_OPTION__DESCRIPTION = eINSTANCE.getProductConfigOption_Description();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG_OPTION__SEQUENCE_NUM = eINSTANCE.getProductConfigOption_SequenceNum();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.config.impl.ProductConfigOptionIactnImpl <em>Product Config Option Iactn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.config.impl.ProductConfigOptionIactnImpl
		 * @see org.abchip.mimo.biz.product.config.impl.ConfigPackageImpl#getProductConfigOptionIactn()
		 * @generated
		 */
		EClass PRODUCT_CONFIG_OPTION_IACTN = eINSTANCE.getProductConfigOptionIactn();

		/**
		 * The meta object literal for the '<em><b>Config Item Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CONFIG_OPTION_IACTN__CONFIG_ITEM_ID = eINSTANCE.getProductConfigOptionIactn_ConfigItemId();

		/**
		 * The meta object literal for the '<em><b>Config Option Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG_OPTION_IACTN__CONFIG_OPTION_ID = eINSTANCE.getProductConfigOptionIactn_ConfigOptionId();

		/**
		 * The meta object literal for the '<em><b>Config Item Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CONFIG_OPTION_IACTN__CONFIG_ITEM_ID_TO = eINSTANCE.getProductConfigOptionIactn_ConfigItemIdTo();

		/**
		 * The meta object literal for the '<em><b>Config Option Id To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG_OPTION_IACTN__CONFIG_OPTION_ID_TO = eINSTANCE.getProductConfigOptionIactn_ConfigOptionIdTo();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG_OPTION_IACTN__SEQUENCE_NUM = eINSTANCE.getProductConfigOptionIactn_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Config Iactn Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG_OPTION_IACTN__CONFIG_IACTN_TYPE_ID = eINSTANCE.getProductConfigOptionIactn_ConfigIactnTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG_OPTION_IACTN__DESCRIPTION = eINSTANCE.getProductConfigOptionIactn_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.config.impl.ProductConfigProductImpl <em>Product Config Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.config.impl.ProductConfigProductImpl
		 * @see org.abchip.mimo.biz.product.config.impl.ConfigPackageImpl#getProductConfigProduct()
		 * @generated
		 */
		EClass PRODUCT_CONFIG_PRODUCT = eINSTANCE.getProductConfigProduct();

		/**
		 * The meta object literal for the '<em><b>Config Item Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CONFIG_PRODUCT__CONFIG_ITEM_ID = eINSTANCE.getProductConfigProduct_ConfigItemId();

		/**
		 * The meta object literal for the '<em><b>Config Option Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG_PRODUCT__CONFIG_OPTION_ID = eINSTANCE.getProductConfigProduct_ConfigOptionId();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CONFIG_PRODUCT__PRODUCT_ID = eINSTANCE.getProductConfigProduct_ProductId();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG_PRODUCT__QUANTITY = eINSTANCE.getProductConfigProduct_Quantity();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG_PRODUCT__SEQUENCE_NUM = eINSTANCE.getProductConfigProduct_SequenceNum();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.config.impl.ProductConfigStatsImpl <em>Product Config Stats</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.config.impl.ProductConfigStatsImpl
		 * @see org.abchip.mimo.biz.product.config.impl.ConfigPackageImpl#getProductConfigStats()
		 * @generated
		 */
		EClass PRODUCT_CONFIG_STATS = eINSTANCE.getProductConfigStats();

		/**
		 * The meta object literal for the '<em><b>Config Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG_STATS__CONFIG_ID = eINSTANCE.getProductConfigStats_ConfigId();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CONFIG_STATS__PRODUCT_ID = eINSTANCE.getProductConfigStats_ProductId();

		/**
		 * The meta object literal for the '<em><b>Config Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG_STATS__CONFIG_TYPE_ID = eINSTANCE.getProductConfigStats_ConfigTypeId();

		/**
		 * The meta object literal for the '<em><b>Num Of Confs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONFIG_STATS__NUM_OF_CONFS = eINSTANCE.getProductConfigStats_NumOfConfs();

	}

} //ConfigPackage
