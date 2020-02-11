/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.feature;

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
 * @see org.abchip.mimo.biz.product.feature.FeatureFactory
 * @model kind="package"
 * @generated
 */
public interface FeaturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "feature";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/product/feature";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-feature";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeaturePackage eINSTANCE = org.abchip.mimo.biz.product.feature.impl.FeaturePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureImpl <em>Product Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.feature.impl.ProductFeatureImpl
	 * @see org.abchip.mimo.biz.product.feature.impl.FeaturePackageImpl#getProductFeature()
	 * @generated
	 */
	int PRODUCT_FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Feature Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE__PRODUCT_FEATURE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abbrev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE__ABBREV = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE__DEFAULT_AMOUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE__DEFAULT_SEQUENCE_NUM = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE__ID_CODE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Main Product Feature Iactns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE__MAIN_PRODUCT_FEATURE_IACTNS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Number Specified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE__NUMBER_SPECIFIED = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Product Feature Category Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE__PRODUCT_FEATURE_CATEGORY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Product Feature Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE__PRODUCT_FEATURE_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE__UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Product Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureApplImpl <em>Product Feature Appl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.feature.impl.ProductFeatureApplImpl
	 * @see org.abchip.mimo.biz.product.feature.impl.FeaturePackageImpl#getProductFeatureAppl()
	 * @generated
	 */
	int PRODUCT_FEATURE_APPL = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL__PRODUCT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Feature Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL__PRODUCT_FEATURE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL__FROM_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL__AMOUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Feature Appl Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL__PRODUCT_FEATURE_APPL_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Recurring Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL__RECURRING_AMOUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL__THRU_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Product Feature Appl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureApplAttrImpl <em>Product Feature Appl Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.feature.impl.ProductFeatureApplAttrImpl
	 * @see org.abchip.mimo.biz.product.feature.impl.FeaturePackageImpl#getProductFeatureApplAttr()
	 * @generated
	 */
	int PRODUCT_FEATURE_APPL_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL_ATTR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL_ATTR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL_ATTR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL_ATTR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL_ATTR__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Feature Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL_ATTR__PRODUCT_FEATURE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL_ATTR__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL_ATTR__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL_ATTR__ATTR_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Product Feature Appl Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL_ATTR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureApplTypeImpl <em>Product Feature Appl Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.feature.impl.ProductFeatureApplTypeImpl
	 * @see org.abchip.mimo.biz.product.feature.impl.FeaturePackageImpl#getProductFeatureApplType()
	 * @generated
	 */
	int PRODUCT_FEATURE_APPL_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Feature Appl Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL_TYPE__PRODUCT_FEATURE_APPL_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Product Feature Appl Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_APPL_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureCatGrpApplImpl <em>Product Feature Cat Grp Appl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.feature.impl.ProductFeatureCatGrpApplImpl
	 * @see org.abchip.mimo.biz.product.feature.impl.FeaturePackageImpl#getProductFeatureCatGrpAppl()
	 * @generated
	 */
	int PRODUCT_FEATURE_CAT_GRP_APPL = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CAT_GRP_APPL__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CAT_GRP_APPL__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CAT_GRP_APPL__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CAT_GRP_APPL__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Category Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CAT_GRP_APPL__PRODUCT_CATEGORY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Feature Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CAT_GRP_APPL__PRODUCT_FEATURE_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CAT_GRP_APPL__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CAT_GRP_APPL__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Product Feature Cat Grp Appl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CAT_GRP_APPL_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureCategoryImpl <em>Product Feature Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.feature.impl.ProductFeatureCategoryImpl
	 * @see org.abchip.mimo.biz.product.feature.impl.FeaturePackageImpl#getProductFeatureCategory()
	 * @generated
	 */
	int PRODUCT_FEATURE_CATEGORY = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CATEGORY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CATEGORY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CATEGORY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CATEGORY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Feature Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CATEGORY__PRODUCT_FEATURE_CATEGORY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CATEGORY__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Category Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CATEGORY__PARENT_CATEGORY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Product Feature Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CATEGORY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureCategoryApplImpl <em>Product Feature Category Appl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.feature.impl.ProductFeatureCategoryApplImpl
	 * @see org.abchip.mimo.biz.product.feature.impl.FeaturePackageImpl#getProductFeatureCategoryAppl()
	 * @generated
	 */
	int PRODUCT_FEATURE_CATEGORY_APPL = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CATEGORY_APPL__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CATEGORY_APPL__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CATEGORY_APPL__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CATEGORY_APPL__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Category Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CATEGORY_APPL__PRODUCT_CATEGORY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Feature Category Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CATEGORY_APPL__PRODUCT_FEATURE_CATEGORY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CATEGORY_APPL__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CATEGORY_APPL__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Product Feature Category Appl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_CATEGORY_APPL_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureDataResourceImpl <em>Product Feature Data Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.feature.impl.ProductFeatureDataResourceImpl
	 * @see org.abchip.mimo.biz.product.feature.impl.FeaturePackageImpl#getProductFeatureDataResource()
	 * @generated
	 */
	int PRODUCT_FEATURE_DATA_RESOURCE = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_DATA_RESOURCE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_DATA_RESOURCE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_DATA_RESOURCE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_DATA_RESOURCE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Data Resource Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_DATA_RESOURCE__DATA_RESOURCE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Feature Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_DATA_RESOURCE__PRODUCT_FEATURE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Product Feature Data Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_DATA_RESOURCE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureGroupImpl <em>Product Feature Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.feature.impl.ProductFeatureGroupImpl
	 * @see org.abchip.mimo.biz.product.feature.impl.FeaturePackageImpl#getProductFeatureGroup()
	 * @generated
	 */
	int PRODUCT_FEATURE_GROUP = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_GROUP__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_GROUP__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_GROUP__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_GROUP__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Feature Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_GROUP__PRODUCT_FEATURE_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_GROUP__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Product Feature Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_GROUP_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureGroupApplImpl <em>Product Feature Group Appl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.feature.impl.ProductFeatureGroupApplImpl
	 * @see org.abchip.mimo.biz.product.feature.impl.FeaturePackageImpl#getProductFeatureGroupAppl()
	 * @generated
	 */
	int PRODUCT_FEATURE_GROUP_APPL = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_GROUP_APPL__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_GROUP_APPL__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_GROUP_APPL__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_GROUP_APPL__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Feature Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_GROUP_APPL__PRODUCT_FEATURE_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Feature Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_GROUP_APPL__PRODUCT_FEATURE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_GROUP_APPL__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_GROUP_APPL__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_GROUP_APPL__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Product Feature Group Appl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_GROUP_APPL_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureIactnImpl <em>Product Feature Iactn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.feature.impl.ProductFeatureIactnImpl
	 * @see org.abchip.mimo.biz.product.feature.impl.FeaturePackageImpl#getProductFeatureIactn()
	 * @generated
	 */
	int PRODUCT_FEATURE_IACTN = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_IACTN__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_IACTN__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_IACTN__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_IACTN__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Feature Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Feature Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_ID_TO = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Product Feature Iactn Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_IACTN_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_IACTN__PRODUCT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Product Feature Iactn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_IACTN_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureIactnTypeImpl <em>Product Feature Iactn Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.feature.impl.ProductFeatureIactnTypeImpl
	 * @see org.abchip.mimo.biz.product.feature.impl.FeaturePackageImpl#getProductFeatureIactnType()
	 * @generated
	 */
	int PRODUCT_FEATURE_IACTN_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_IACTN_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_IACTN_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_IACTN_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_IACTN_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_IACTN_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Feature Iactn Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_IACTN_TYPE__PRODUCT_FEATURE_IACTN_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_IACTN_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_IACTN_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_IACTN_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Product Feature Iactn Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_IACTN_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureTypeImpl <em>Product Feature Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.feature.impl.ProductFeatureTypeImpl
	 * @see org.abchip.mimo.biz.product.feature.impl.FeaturePackageImpl#getProductFeatureType()
	 * @generated
	 */
	int PRODUCT_FEATURE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Feature Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_TYPE__PRODUCT_FEATURE_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Product Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.feature.ProductFeature <em>Product Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Feature</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeature
	 * @generated
	 */
	EClass getProductFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeature#getProductFeatureId <em>Product Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Feature Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeature#getProductFeatureId()
	 * @see #getProductFeature()
	 * @generated
	 */
	EAttribute getProductFeature_ProductFeatureId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeature#getAbbrev <em>Abbrev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abbrev</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeature#getAbbrev()
	 * @see #getProductFeature()
	 * @generated
	 */
	EAttribute getProductFeature_Abbrev();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeature#getDefaultAmount <em>Default Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Amount</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeature#getDefaultAmount()
	 * @see #getProductFeature()
	 * @generated
	 */
	EAttribute getProductFeature_DefaultAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeature#getDefaultSequenceNum <em>Default Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeature#getDefaultSequenceNum()
	 * @see #getProductFeature()
	 * @generated
	 */
	EAttribute getProductFeature_DefaultSequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeature#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeature#getDescription()
	 * @see #getProductFeature()
	 * @generated
	 */
	EAttribute getProductFeature_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeature#getIdCode <em>Id Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Code</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeature#getIdCode()
	 * @see #getProductFeature()
	 * @generated
	 */
	EAttribute getProductFeature_IdCode();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.product.feature.ProductFeature#getMainProductFeatureIactns <em>Main Product Feature Iactns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Main Product Feature Iactns</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeature#getMainProductFeatureIactns()
	 * @see #getProductFeature()
	 * @generated
	 */
	EReference getProductFeature_MainProductFeatureIactns();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeature#getNumberSpecified <em>Number Specified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Specified</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeature#getNumberSpecified()
	 * @see #getProductFeature()
	 * @generated
	 */
	EAttribute getProductFeature_NumberSpecified();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.feature.ProductFeature#getProductFeatureCategoryId <em>Product Feature Category Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Feature Category Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeature#getProductFeatureCategoryId()
	 * @see #getProductFeature()
	 * @generated
	 */
	EReference getProductFeature_ProductFeatureCategoryId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.feature.ProductFeature#getProductFeatureTypeId <em>Product Feature Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Feature Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeature#getProductFeatureTypeId()
	 * @see #getProductFeature()
	 * @generated
	 */
	EReference getProductFeature_ProductFeatureTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.feature.ProductFeature#getUomId <em>Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeature#getUomId()
	 * @see #getProductFeature()
	 * @generated
	 */
	EReference getProductFeature_UomId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.feature.ProductFeatureAppl <em>Product Feature Appl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Feature Appl</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureAppl
	 * @generated
	 */
	EClass getProductFeatureAppl();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.feature.ProductFeatureAppl#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureAppl#getProductId()
	 * @see #getProductFeatureAppl()
	 * @generated
	 */
	EReference getProductFeatureAppl_ProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.feature.ProductFeatureAppl#getProductFeatureId <em>Product Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Feature Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureAppl#getProductFeatureId()
	 * @see #getProductFeatureAppl()
	 * @generated
	 */
	EReference getProductFeatureAppl_ProductFeatureId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureAppl#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureAppl#getFromDate()
	 * @see #getProductFeatureAppl()
	 * @generated
	 */
	EAttribute getProductFeatureAppl_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureAppl#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureAppl#getAmount()
	 * @see #getProductFeatureAppl()
	 * @generated
	 */
	EAttribute getProductFeatureAppl_Amount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.feature.ProductFeatureAppl#getProductFeatureApplTypeId <em>Product Feature Appl Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Feature Appl Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureAppl#getProductFeatureApplTypeId()
	 * @see #getProductFeatureAppl()
	 * @generated
	 */
	EReference getProductFeatureAppl_ProductFeatureApplTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureAppl#getRecurringAmount <em>Recurring Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recurring Amount</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureAppl#getRecurringAmount()
	 * @see #getProductFeatureAppl()
	 * @generated
	 */
	EAttribute getProductFeatureAppl_RecurringAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureAppl#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureAppl#getSequenceNum()
	 * @see #getProductFeatureAppl()
	 * @generated
	 */
	EAttribute getProductFeatureAppl_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureAppl#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureAppl#getThruDate()
	 * @see #getProductFeatureAppl()
	 * @generated
	 */
	EAttribute getProductFeatureAppl_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.feature.ProductFeatureApplAttr <em>Product Feature Appl Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Feature Appl Attr</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureApplAttr
	 * @generated
	 */
	EClass getProductFeatureApplAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.feature.ProductFeatureApplAttr#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureApplAttr#getProductId()
	 * @see #getProductFeatureApplAttr()
	 * @generated
	 */
	EReference getProductFeatureApplAttr_ProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.feature.ProductFeatureApplAttr#getProductFeatureId <em>Product Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Feature Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureApplAttr#getProductFeatureId()
	 * @see #getProductFeatureApplAttr()
	 * @generated
	 */
	EReference getProductFeatureApplAttr_ProductFeatureId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureApplAttr#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureApplAttr#getFromDate()
	 * @see #getProductFeatureApplAttr()
	 * @generated
	 */
	EAttribute getProductFeatureApplAttr_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureApplAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureApplAttr#getAttrName()
	 * @see #getProductFeatureApplAttr()
	 * @generated
	 */
	EAttribute getProductFeatureApplAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureApplAttr#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureApplAttr#getAttrValue()
	 * @see #getProductFeatureApplAttr()
	 * @generated
	 */
	EAttribute getProductFeatureApplAttr_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.feature.ProductFeatureApplType <em>Product Feature Appl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Feature Appl Type</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureApplType
	 * @generated
	 */
	EClass getProductFeatureApplType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureApplType#getProductFeatureApplTypeId <em>Product Feature Appl Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Feature Appl Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureApplType#getProductFeatureApplTypeId()
	 * @see #getProductFeatureApplType()
	 * @generated
	 */
	EAttribute getProductFeatureApplType_ProductFeatureApplTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureApplType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureApplType#getDescription()
	 * @see #getProductFeatureApplType()
	 * @generated
	 */
	EAttribute getProductFeatureApplType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureApplType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureApplType#isHasTable()
	 * @see #getProductFeatureApplType()
	 * @generated
	 */
	EAttribute getProductFeatureApplType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.feature.ProductFeatureApplType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureApplType#getParentTypeId()
	 * @see #getProductFeatureApplType()
	 * @generated
	 */
	EReference getProductFeatureApplType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.feature.ProductFeatureCatGrpAppl <em>Product Feature Cat Grp Appl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Feature Cat Grp Appl</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureCatGrpAppl
	 * @generated
	 */
	EClass getProductFeatureCatGrpAppl();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.feature.ProductFeatureCatGrpAppl#getProductCategoryId <em>Product Category Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Category Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureCatGrpAppl#getProductCategoryId()
	 * @see #getProductFeatureCatGrpAppl()
	 * @generated
	 */
	EReference getProductFeatureCatGrpAppl_ProductCategoryId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.feature.ProductFeatureCatGrpAppl#getProductFeatureGroupId <em>Product Feature Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Feature Group Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureCatGrpAppl#getProductFeatureGroupId()
	 * @see #getProductFeatureCatGrpAppl()
	 * @generated
	 */
	EReference getProductFeatureCatGrpAppl_ProductFeatureGroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureCatGrpAppl#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureCatGrpAppl#getFromDate()
	 * @see #getProductFeatureCatGrpAppl()
	 * @generated
	 */
	EAttribute getProductFeatureCatGrpAppl_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureCatGrpAppl#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureCatGrpAppl#getThruDate()
	 * @see #getProductFeatureCatGrpAppl()
	 * @generated
	 */
	EAttribute getProductFeatureCatGrpAppl_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.feature.ProductFeatureCategory <em>Product Feature Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Feature Category</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureCategory
	 * @generated
	 */
	EClass getProductFeatureCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureCategory#getProductFeatureCategoryId <em>Product Feature Category Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Feature Category Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureCategory#getProductFeatureCategoryId()
	 * @see #getProductFeatureCategory()
	 * @generated
	 */
	EAttribute getProductFeatureCategory_ProductFeatureCategoryId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureCategory#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureCategory#getDescription()
	 * @see #getProductFeatureCategory()
	 * @generated
	 */
	EAttribute getProductFeatureCategory_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.feature.ProductFeatureCategory#getParentCategoryId <em>Parent Category Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Category Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureCategory#getParentCategoryId()
	 * @see #getProductFeatureCategory()
	 * @generated
	 */
	EReference getProductFeatureCategory_ParentCategoryId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.feature.ProductFeatureCategoryAppl <em>Product Feature Category Appl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Feature Category Appl</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureCategoryAppl
	 * @generated
	 */
	EClass getProductFeatureCategoryAppl();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.feature.ProductFeatureCategoryAppl#getProductCategoryId <em>Product Category Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Category Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureCategoryAppl#getProductCategoryId()
	 * @see #getProductFeatureCategoryAppl()
	 * @generated
	 */
	EReference getProductFeatureCategoryAppl_ProductCategoryId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.feature.ProductFeatureCategoryAppl#getProductFeatureCategoryId <em>Product Feature Category Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Feature Category Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureCategoryAppl#getProductFeatureCategoryId()
	 * @see #getProductFeatureCategoryAppl()
	 * @generated
	 */
	EReference getProductFeatureCategoryAppl_ProductFeatureCategoryId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureCategoryAppl#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureCategoryAppl#getFromDate()
	 * @see #getProductFeatureCategoryAppl()
	 * @generated
	 */
	EAttribute getProductFeatureCategoryAppl_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureCategoryAppl#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureCategoryAppl#getThruDate()
	 * @see #getProductFeatureCategoryAppl()
	 * @generated
	 */
	EAttribute getProductFeatureCategoryAppl_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.feature.ProductFeatureDataResource <em>Product Feature Data Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Feature Data Resource</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureDataResource
	 * @generated
	 */
	EClass getProductFeatureDataResource();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.feature.ProductFeatureDataResource#getDataResourceId <em>Data Resource Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Resource Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureDataResource#getDataResourceId()
	 * @see #getProductFeatureDataResource()
	 * @generated
	 */
	EReference getProductFeatureDataResource_DataResourceId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.feature.ProductFeatureDataResource#getProductFeatureId <em>Product Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Feature Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureDataResource#getProductFeatureId()
	 * @see #getProductFeatureDataResource()
	 * @generated
	 */
	EReference getProductFeatureDataResource_ProductFeatureId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.feature.ProductFeatureGroup <em>Product Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Feature Group</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureGroup
	 * @generated
	 */
	EClass getProductFeatureGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureGroup#getProductFeatureGroupId <em>Product Feature Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Feature Group Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureGroup#getProductFeatureGroupId()
	 * @see #getProductFeatureGroup()
	 * @generated
	 */
	EAttribute getProductFeatureGroup_ProductFeatureGroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureGroup#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureGroup#getDescription()
	 * @see #getProductFeatureGroup()
	 * @generated
	 */
	EAttribute getProductFeatureGroup_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.feature.ProductFeatureGroupAppl <em>Product Feature Group Appl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Feature Group Appl</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureGroupAppl
	 * @generated
	 */
	EClass getProductFeatureGroupAppl();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.feature.ProductFeatureGroupAppl#getProductFeatureGroupId <em>Product Feature Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Feature Group Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureGroupAppl#getProductFeatureGroupId()
	 * @see #getProductFeatureGroupAppl()
	 * @generated
	 */
	EReference getProductFeatureGroupAppl_ProductFeatureGroupId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.feature.ProductFeatureGroupAppl#getProductFeatureId <em>Product Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Feature Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureGroupAppl#getProductFeatureId()
	 * @see #getProductFeatureGroupAppl()
	 * @generated
	 */
	EReference getProductFeatureGroupAppl_ProductFeatureId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureGroupAppl#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureGroupAppl#getFromDate()
	 * @see #getProductFeatureGroupAppl()
	 * @generated
	 */
	EAttribute getProductFeatureGroupAppl_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureGroupAppl#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureGroupAppl#getSequenceNum()
	 * @see #getProductFeatureGroupAppl()
	 * @generated
	 */
	EAttribute getProductFeatureGroupAppl_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureGroupAppl#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureGroupAppl#getThruDate()
	 * @see #getProductFeatureGroupAppl()
	 * @generated
	 */
	EAttribute getProductFeatureGroupAppl_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.feature.ProductFeatureIactn <em>Product Feature Iactn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Feature Iactn</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureIactn
	 * @generated
	 */
	EClass getProductFeatureIactn();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.feature.ProductFeatureIactn#getProductFeatureId <em>Product Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Feature Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureIactn#getProductFeatureId()
	 * @see #getProductFeatureIactn()
	 * @generated
	 */
	EReference getProductFeatureIactn_ProductFeatureId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.feature.ProductFeatureIactn#getProductFeatureIdTo <em>Product Feature Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Feature Id To</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureIactn#getProductFeatureIdTo()
	 * @see #getProductFeatureIactn()
	 * @generated
	 */
	EReference getProductFeatureIactn_ProductFeatureIdTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.feature.ProductFeatureIactn#getProductFeatureIactnTypeId <em>Product Feature Iactn Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Feature Iactn Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureIactn#getProductFeatureIactnTypeId()
	 * @see #getProductFeatureIactn()
	 * @generated
	 */
	EReference getProductFeatureIactn_ProductFeatureIactnTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureIactn#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureIactn#getProductId()
	 * @see #getProductFeatureIactn()
	 * @generated
	 */
	EAttribute getProductFeatureIactn_ProductId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.feature.ProductFeatureIactnType <em>Product Feature Iactn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Feature Iactn Type</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureIactnType
	 * @generated
	 */
	EClass getProductFeatureIactnType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureIactnType#getProductFeatureIactnTypeId <em>Product Feature Iactn Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Feature Iactn Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureIactnType#getProductFeatureIactnTypeId()
	 * @see #getProductFeatureIactnType()
	 * @generated
	 */
	EAttribute getProductFeatureIactnType_ProductFeatureIactnTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureIactnType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureIactnType#getDescription()
	 * @see #getProductFeatureIactnType()
	 * @generated
	 */
	EAttribute getProductFeatureIactnType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureIactnType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureIactnType#isHasTable()
	 * @see #getProductFeatureIactnType()
	 * @generated
	 */
	EAttribute getProductFeatureIactnType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.feature.ProductFeatureIactnType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureIactnType#getParentTypeId()
	 * @see #getProductFeatureIactnType()
	 * @generated
	 */
	EReference getProductFeatureIactnType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.feature.ProductFeatureType <em>Product Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Feature Type</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureType
	 * @generated
	 */
	EClass getProductFeatureType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureType#getProductFeatureTypeId <em>Product Feature Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Feature Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureType#getProductFeatureTypeId()
	 * @see #getProductFeatureType()
	 * @generated
	 */
	EAttribute getProductFeatureType_ProductFeatureTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureType#getDescription()
	 * @see #getProductFeatureType()
	 * @generated
	 */
	EAttribute getProductFeatureType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.feature.ProductFeatureType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureType#isHasTable()
	 * @see #getProductFeatureType()
	 * @generated
	 */
	EAttribute getProductFeatureType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.feature.ProductFeatureType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.feature.ProductFeatureType#getParentTypeId()
	 * @see #getProductFeatureType()
	 * @generated
	 */
	EReference getProductFeatureType_ParentTypeId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FeatureFactory getFeatureFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureImpl <em>Product Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.feature.impl.ProductFeatureImpl
		 * @see org.abchip.mimo.biz.product.feature.impl.FeaturePackageImpl#getProductFeature()
		 * @generated
		 */
		EClass PRODUCT_FEATURE = eINSTANCE.getProductFeature();

		/**
		 * The meta object literal for the '<em><b>Product Feature Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE__PRODUCT_FEATURE_ID = eINSTANCE.getProductFeature_ProductFeatureId();

		/**
		 * The meta object literal for the '<em><b>Abbrev</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE__ABBREV = eINSTANCE.getProductFeature_Abbrev();

		/**
		 * The meta object literal for the '<em><b>Default Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE__DEFAULT_AMOUNT = eINSTANCE.getProductFeature_DefaultAmount();

		/**
		 * The meta object literal for the '<em><b>Default Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE__DEFAULT_SEQUENCE_NUM = eINSTANCE.getProductFeature_DefaultSequenceNum();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE__DESCRIPTION = eINSTANCE.getProductFeature_Description();

		/**
		 * The meta object literal for the '<em><b>Id Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE__ID_CODE = eINSTANCE.getProductFeature_IdCode();

		/**
		 * The meta object literal for the '<em><b>Main Product Feature Iactns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE__MAIN_PRODUCT_FEATURE_IACTNS = eINSTANCE.getProductFeature_MainProductFeatureIactns();

		/**
		 * The meta object literal for the '<em><b>Number Specified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE__NUMBER_SPECIFIED = eINSTANCE.getProductFeature_NumberSpecified();

		/**
		 * The meta object literal for the '<em><b>Product Feature Category Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE__PRODUCT_FEATURE_CATEGORY_ID = eINSTANCE.getProductFeature_ProductFeatureCategoryId();

		/**
		 * The meta object literal for the '<em><b>Product Feature Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE__PRODUCT_FEATURE_TYPE_ID = eINSTANCE.getProductFeature_ProductFeatureTypeId();

		/**
		 * The meta object literal for the '<em><b>Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE__UOM_ID = eINSTANCE.getProductFeature_UomId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureApplImpl <em>Product Feature Appl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.feature.impl.ProductFeatureApplImpl
		 * @see org.abchip.mimo.biz.product.feature.impl.FeaturePackageImpl#getProductFeatureAppl()
		 * @generated
		 */
		EClass PRODUCT_FEATURE_APPL = eINSTANCE.getProductFeatureAppl();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE_APPL__PRODUCT_ID = eINSTANCE.getProductFeatureAppl_ProductId();

		/**
		 * The meta object literal for the '<em><b>Product Feature Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE_APPL__PRODUCT_FEATURE_ID = eINSTANCE.getProductFeatureAppl_ProductFeatureId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_APPL__FROM_DATE = eINSTANCE.getProductFeatureAppl_FromDate();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_APPL__AMOUNT = eINSTANCE.getProductFeatureAppl_Amount();

		/**
		 * The meta object literal for the '<em><b>Product Feature Appl Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE_APPL__PRODUCT_FEATURE_APPL_TYPE_ID = eINSTANCE.getProductFeatureAppl_ProductFeatureApplTypeId();

		/**
		 * The meta object literal for the '<em><b>Recurring Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_APPL__RECURRING_AMOUNT = eINSTANCE.getProductFeatureAppl_RecurringAmount();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_APPL__SEQUENCE_NUM = eINSTANCE.getProductFeatureAppl_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_APPL__THRU_DATE = eINSTANCE.getProductFeatureAppl_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureApplAttrImpl <em>Product Feature Appl Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.feature.impl.ProductFeatureApplAttrImpl
		 * @see org.abchip.mimo.biz.product.feature.impl.FeaturePackageImpl#getProductFeatureApplAttr()
		 * @generated
		 */
		EClass PRODUCT_FEATURE_APPL_ATTR = eINSTANCE.getProductFeatureApplAttr();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE_APPL_ATTR__PRODUCT_ID = eINSTANCE.getProductFeatureApplAttr_ProductId();

		/**
		 * The meta object literal for the '<em><b>Product Feature Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE_APPL_ATTR__PRODUCT_FEATURE_ID = eINSTANCE.getProductFeatureApplAttr_ProductFeatureId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_APPL_ATTR__FROM_DATE = eINSTANCE.getProductFeatureApplAttr_FromDate();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_APPL_ATTR__ATTR_NAME = eINSTANCE.getProductFeatureApplAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_APPL_ATTR__ATTR_VALUE = eINSTANCE.getProductFeatureApplAttr_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureApplTypeImpl <em>Product Feature Appl Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.feature.impl.ProductFeatureApplTypeImpl
		 * @see org.abchip.mimo.biz.product.feature.impl.FeaturePackageImpl#getProductFeatureApplType()
		 * @generated
		 */
		EClass PRODUCT_FEATURE_APPL_TYPE = eINSTANCE.getProductFeatureApplType();

		/**
		 * The meta object literal for the '<em><b>Product Feature Appl Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_APPL_TYPE__PRODUCT_FEATURE_APPL_TYPE_ID = eINSTANCE.getProductFeatureApplType_ProductFeatureApplTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_APPL_TYPE__DESCRIPTION = eINSTANCE.getProductFeatureApplType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_APPL_TYPE__HAS_TABLE = eINSTANCE.getProductFeatureApplType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE_APPL_TYPE__PARENT_TYPE_ID = eINSTANCE.getProductFeatureApplType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureCatGrpApplImpl <em>Product Feature Cat Grp Appl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.feature.impl.ProductFeatureCatGrpApplImpl
		 * @see org.abchip.mimo.biz.product.feature.impl.FeaturePackageImpl#getProductFeatureCatGrpAppl()
		 * @generated
		 */
		EClass PRODUCT_FEATURE_CAT_GRP_APPL = eINSTANCE.getProductFeatureCatGrpAppl();

		/**
		 * The meta object literal for the '<em><b>Product Category Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE_CAT_GRP_APPL__PRODUCT_CATEGORY_ID = eINSTANCE.getProductFeatureCatGrpAppl_ProductCategoryId();

		/**
		 * The meta object literal for the '<em><b>Product Feature Group Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE_CAT_GRP_APPL__PRODUCT_FEATURE_GROUP_ID = eINSTANCE.getProductFeatureCatGrpAppl_ProductFeatureGroupId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_CAT_GRP_APPL__FROM_DATE = eINSTANCE.getProductFeatureCatGrpAppl_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_CAT_GRP_APPL__THRU_DATE = eINSTANCE.getProductFeatureCatGrpAppl_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureCategoryImpl <em>Product Feature Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.feature.impl.ProductFeatureCategoryImpl
		 * @see org.abchip.mimo.biz.product.feature.impl.FeaturePackageImpl#getProductFeatureCategory()
		 * @generated
		 */
		EClass PRODUCT_FEATURE_CATEGORY = eINSTANCE.getProductFeatureCategory();

		/**
		 * The meta object literal for the '<em><b>Product Feature Category Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_CATEGORY__PRODUCT_FEATURE_CATEGORY_ID = eINSTANCE.getProductFeatureCategory_ProductFeatureCategoryId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_CATEGORY__DESCRIPTION = eINSTANCE.getProductFeatureCategory_Description();

		/**
		 * The meta object literal for the '<em><b>Parent Category Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE_CATEGORY__PARENT_CATEGORY_ID = eINSTANCE.getProductFeatureCategory_ParentCategoryId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureCategoryApplImpl <em>Product Feature Category Appl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.feature.impl.ProductFeatureCategoryApplImpl
		 * @see org.abchip.mimo.biz.product.feature.impl.FeaturePackageImpl#getProductFeatureCategoryAppl()
		 * @generated
		 */
		EClass PRODUCT_FEATURE_CATEGORY_APPL = eINSTANCE.getProductFeatureCategoryAppl();

		/**
		 * The meta object literal for the '<em><b>Product Category Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE_CATEGORY_APPL__PRODUCT_CATEGORY_ID = eINSTANCE.getProductFeatureCategoryAppl_ProductCategoryId();

		/**
		 * The meta object literal for the '<em><b>Product Feature Category Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE_CATEGORY_APPL__PRODUCT_FEATURE_CATEGORY_ID = eINSTANCE.getProductFeatureCategoryAppl_ProductFeatureCategoryId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_CATEGORY_APPL__FROM_DATE = eINSTANCE.getProductFeatureCategoryAppl_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_CATEGORY_APPL__THRU_DATE = eINSTANCE.getProductFeatureCategoryAppl_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureDataResourceImpl <em>Product Feature Data Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.feature.impl.ProductFeatureDataResourceImpl
		 * @see org.abchip.mimo.biz.product.feature.impl.FeaturePackageImpl#getProductFeatureDataResource()
		 * @generated
		 */
		EClass PRODUCT_FEATURE_DATA_RESOURCE = eINSTANCE.getProductFeatureDataResource();

		/**
		 * The meta object literal for the '<em><b>Data Resource Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE_DATA_RESOURCE__DATA_RESOURCE_ID = eINSTANCE.getProductFeatureDataResource_DataResourceId();

		/**
		 * The meta object literal for the '<em><b>Product Feature Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE_DATA_RESOURCE__PRODUCT_FEATURE_ID = eINSTANCE.getProductFeatureDataResource_ProductFeatureId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureGroupImpl <em>Product Feature Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.feature.impl.ProductFeatureGroupImpl
		 * @see org.abchip.mimo.biz.product.feature.impl.FeaturePackageImpl#getProductFeatureGroup()
		 * @generated
		 */
		EClass PRODUCT_FEATURE_GROUP = eINSTANCE.getProductFeatureGroup();

		/**
		 * The meta object literal for the '<em><b>Product Feature Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_GROUP__PRODUCT_FEATURE_GROUP_ID = eINSTANCE.getProductFeatureGroup_ProductFeatureGroupId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_GROUP__DESCRIPTION = eINSTANCE.getProductFeatureGroup_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureGroupApplImpl <em>Product Feature Group Appl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.feature.impl.ProductFeatureGroupApplImpl
		 * @see org.abchip.mimo.biz.product.feature.impl.FeaturePackageImpl#getProductFeatureGroupAppl()
		 * @generated
		 */
		EClass PRODUCT_FEATURE_GROUP_APPL = eINSTANCE.getProductFeatureGroupAppl();

		/**
		 * The meta object literal for the '<em><b>Product Feature Group Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE_GROUP_APPL__PRODUCT_FEATURE_GROUP_ID = eINSTANCE.getProductFeatureGroupAppl_ProductFeatureGroupId();

		/**
		 * The meta object literal for the '<em><b>Product Feature Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE_GROUP_APPL__PRODUCT_FEATURE_ID = eINSTANCE.getProductFeatureGroupAppl_ProductFeatureId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_GROUP_APPL__FROM_DATE = eINSTANCE.getProductFeatureGroupAppl_FromDate();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_GROUP_APPL__SEQUENCE_NUM = eINSTANCE.getProductFeatureGroupAppl_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_GROUP_APPL__THRU_DATE = eINSTANCE.getProductFeatureGroupAppl_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureIactnImpl <em>Product Feature Iactn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.feature.impl.ProductFeatureIactnImpl
		 * @see org.abchip.mimo.biz.product.feature.impl.FeaturePackageImpl#getProductFeatureIactn()
		 * @generated
		 */
		EClass PRODUCT_FEATURE_IACTN = eINSTANCE.getProductFeatureIactn();

		/**
		 * The meta object literal for the '<em><b>Product Feature Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_ID = eINSTANCE.getProductFeatureIactn_ProductFeatureId();

		/**
		 * The meta object literal for the '<em><b>Product Feature Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_ID_TO = eINSTANCE.getProductFeatureIactn_ProductFeatureIdTo();

		/**
		 * The meta object literal for the '<em><b>Product Feature Iactn Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE_IACTN__PRODUCT_FEATURE_IACTN_TYPE_ID = eINSTANCE.getProductFeatureIactn_ProductFeatureIactnTypeId();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_IACTN__PRODUCT_ID = eINSTANCE.getProductFeatureIactn_ProductId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureIactnTypeImpl <em>Product Feature Iactn Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.feature.impl.ProductFeatureIactnTypeImpl
		 * @see org.abchip.mimo.biz.product.feature.impl.FeaturePackageImpl#getProductFeatureIactnType()
		 * @generated
		 */
		EClass PRODUCT_FEATURE_IACTN_TYPE = eINSTANCE.getProductFeatureIactnType();

		/**
		 * The meta object literal for the '<em><b>Product Feature Iactn Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_IACTN_TYPE__PRODUCT_FEATURE_IACTN_TYPE_ID = eINSTANCE.getProductFeatureIactnType_ProductFeatureIactnTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_IACTN_TYPE__DESCRIPTION = eINSTANCE.getProductFeatureIactnType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_IACTN_TYPE__HAS_TABLE = eINSTANCE.getProductFeatureIactnType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE_IACTN_TYPE__PARENT_TYPE_ID = eINSTANCE.getProductFeatureIactnType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureTypeImpl <em>Product Feature Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.feature.impl.ProductFeatureTypeImpl
		 * @see org.abchip.mimo.biz.product.feature.impl.FeaturePackageImpl#getProductFeatureType()
		 * @generated
		 */
		EClass PRODUCT_FEATURE_TYPE = eINSTANCE.getProductFeatureType();

		/**
		 * The meta object literal for the '<em><b>Product Feature Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_TYPE__PRODUCT_FEATURE_TYPE_ID = eINSTANCE.getProductFeatureType_ProductFeatureTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_TYPE__DESCRIPTION = eINSTANCE.getProductFeatureType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_TYPE__HAS_TABLE = eINSTANCE.getProductFeatureType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE_TYPE__PARENT_TYPE_ID = eINSTANCE.getProductFeatureType_ParentTypeId();

	}

} //FeaturePackage
