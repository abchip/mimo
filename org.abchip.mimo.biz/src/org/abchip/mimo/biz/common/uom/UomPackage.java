/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.uom;

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
 * @see org.abchip.mimo.biz.common.uom.UomFactory
 * @model kind="package"
 * @generated
 */
public interface UomPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uom";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/common/uom";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-uom";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UomPackage eINSTANCE = org.abchip.mimo.biz.common.uom.impl.UomPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.uom.impl.UomImpl <em>Uom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.uom.impl.UomImpl
	 * @see org.abchip.mimo.biz.common.uom.impl.UomPackageImpl#getUom()
	 * @generated
	 */
	int UOM = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abbreviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__ABBREVIATION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Main Uom Conversions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__MAIN_UOM_CONVERSIONS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Numeric Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__NUMERIC_CODE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Uom Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__UOM_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Uom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.uom.impl.UomConversionImpl <em>Conversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.uom.impl.UomConversionImpl
	 * @see org.abchip.mimo.biz.common.uom.impl.UomPackageImpl#getUomConversion()
	 * @generated
	 */
	int UOM_CONVERSION = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uom Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__UOM_ID_TO = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conversion Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__CONVERSION_FACTOR = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Custom Method Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__CUSTOM_METHOD_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Decimal Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__DECIMAL_SCALE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rounding Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__ROUNDING_MODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.uom.impl.UomConversionDatedImpl <em>Conversion Dated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.uom.impl.UomConversionDatedImpl
	 * @see org.abchip.mimo.biz.common.uom.impl.UomPackageImpl#getUomConversionDated()
	 * @generated
	 */
	int UOM_CONVERSION_DATED = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uom Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__UOM_ID_TO = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Conversion Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__CONVERSION_FACTOR = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Custom Method Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__CUSTOM_METHOD_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Decimal Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__DECIMAL_SCALE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Purpose Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__PURPOSE_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rounding Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__ROUNDING_MODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Conversion Dated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.uom.impl.UomGroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.uom.impl.UomGroupImpl
	 * @see org.abchip.mimo.biz.common.uom.impl.UomPackageImpl#getUomGroup()
	 * @generated
	 */
	int UOM_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_GROUP__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_GROUP__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_GROUP__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_GROUP__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_GROUP__UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uom Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_GROUP__UOM_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_GROUP_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.uom.impl.UomTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.uom.impl.UomTypeImpl
	 * @see org.abchip.mimo.biz.common.uom.impl.UomPackageImpl#getUomType()
	 * @generated
	 */
	int UOM_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Uom Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE__UOM_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.uom.Uom <em>Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uom</em>'.
	 * @see org.abchip.mimo.biz.common.uom.Uom
	 * @generated
	 */
	EClass getUom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.Uom#getUomId <em>Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uom Id</em>'.
	 * @see org.abchip.mimo.biz.common.uom.Uom#getUomId()
	 * @see #getUom()
	 * @generated
	 */
	EAttribute getUom_UomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.Uom#getAbbreviation <em>Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abbreviation</em>'.
	 * @see org.abchip.mimo.biz.common.uom.Uom#getAbbreviation()
	 * @see #getUom()
	 * @generated
	 */
	EAttribute getUom_Abbreviation();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.Uom#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.common.uom.Uom#getDescription()
	 * @see #getUom()
	 * @generated
	 */
	EAttribute getUom_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.common.uom.Uom#getMainUomConversions <em>Main Uom Conversions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Main Uom Conversions</em>'.
	 * @see org.abchip.mimo.biz.common.uom.Uom#getMainUomConversions()
	 * @see #getUom()
	 * @generated
	 */
	EReference getUom_MainUomConversions();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.Uom#getNumericCode <em>Numeric Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numeric Code</em>'.
	 * @see org.abchip.mimo.biz.common.uom.Uom#getNumericCode()
	 * @see #getUom()
	 * @generated
	 */
	EAttribute getUom_NumericCode();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.uom.Uom#getUomTypeId <em>Uom Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.uom.Uom#getUomTypeId()
	 * @see #getUom()
	 * @generated
	 */
	EReference getUom_UomTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.uom.UomConversion <em>Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversion</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversion
	 * @generated
	 */
	EClass getUomConversion();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.uom.UomConversion#getUomId <em>Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom Id</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversion#getUomId()
	 * @see #getUomConversion()
	 * @generated
	 */
	EReference getUomConversion_UomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.uom.UomConversion#getUomIdTo <em>Uom Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom Id To</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversion#getUomIdTo()
	 * @see #getUomConversion()
	 * @generated
	 */
	EReference getUomConversion_UomIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.UomConversion#getConversionFactor <em>Conversion Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conversion Factor</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversion#getConversionFactor()
	 * @see #getUomConversion()
	 * @generated
	 */
	EAttribute getUomConversion_ConversionFactor();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.uom.UomConversion#getCustomMethodId <em>Custom Method Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Custom Method Id</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversion#getCustomMethodId()
	 * @see #getUomConversion()
	 * @generated
	 */
	EReference getUomConversion_CustomMethodId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.UomConversion#getDecimalScale <em>Decimal Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal Scale</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversion#getDecimalScale()
	 * @see #getUomConversion()
	 * @generated
	 */
	EAttribute getUomConversion_DecimalScale();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.UomConversion#getRoundingMode <em>Rounding Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rounding Mode</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversion#getRoundingMode()
	 * @see #getUomConversion()
	 * @generated
	 */
	EAttribute getUomConversion_RoundingMode();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.uom.UomConversionDated <em>Conversion Dated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversion Dated</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversionDated
	 * @generated
	 */
	EClass getUomConversionDated();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getUomId <em>Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom Id</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversionDated#getUomId()
	 * @see #getUomConversionDated()
	 * @generated
	 */
	EReference getUomConversionDated_UomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getUomIdTo <em>Uom Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom Id To</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversionDated#getUomIdTo()
	 * @see #getUomConversionDated()
	 * @generated
	 */
	EReference getUomConversionDated_UomIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversionDated#getFromDate()
	 * @see #getUomConversionDated()
	 * @generated
	 */
	EAttribute getUomConversionDated_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getConversionFactor <em>Conversion Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conversion Factor</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversionDated#getConversionFactor()
	 * @see #getUomConversionDated()
	 * @generated
	 */
	EAttribute getUomConversionDated_ConversionFactor();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getCustomMethodId <em>Custom Method Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Custom Method Id</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversionDated#getCustomMethodId()
	 * @see #getUomConversionDated()
	 * @generated
	 */
	EReference getUomConversionDated_CustomMethodId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getDecimalScale <em>Decimal Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal Scale</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversionDated#getDecimalScale()
	 * @see #getUomConversionDated()
	 * @generated
	 */
	EAttribute getUomConversionDated_DecimalScale();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getPurposeEnumId <em>Purpose Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Purpose Enum Id</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversionDated#getPurposeEnumId()
	 * @see #getUomConversionDated()
	 * @generated
	 */
	EReference getUomConversionDated_PurposeEnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getRoundingMode <em>Rounding Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rounding Mode</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversionDated#getRoundingMode()
	 * @see #getUomConversionDated()
	 * @generated
	 */
	EAttribute getUomConversionDated_RoundingMode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversionDated#getThruDate()
	 * @see #getUomConversionDated()
	 * @generated
	 */
	EAttribute getUomConversionDated_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.uom.UomGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomGroup
	 * @generated
	 */
	EClass getUomGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.UomGroup#getUomGroupId <em>Uom Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uom Group Id</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomGroup#getUomGroupId()
	 * @see #getUomGroup()
	 * @generated
	 */
	EAttribute getUomGroup_UomGroupId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.uom.UomGroup#getUomId <em>Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom Id</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomGroup#getUomId()
	 * @see #getUomGroup()
	 * @generated
	 */
	EReference getUomGroup_UomId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.uom.UomType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomType
	 * @generated
	 */
	EClass getUomType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.UomType#getUomTypeId <em>Uom Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uom Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomType#getUomTypeId()
	 * @see #getUomType()
	 * @generated
	 */
	EAttribute getUomType_UomTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.UomType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomType#getDescription()
	 * @see #getUomType()
	 * @generated
	 */
	EAttribute getUomType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.UomType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomType#isHasTable()
	 * @see #getUomType()
	 * @generated
	 */
	EAttribute getUomType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.uom.UomType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomType#getParentTypeId()
	 * @see #getUomType()
	 * @generated
	 */
	EReference getUomType_ParentTypeId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UomFactory getUomFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.uom.impl.UomImpl <em>Uom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.uom.impl.UomImpl
		 * @see org.abchip.mimo.biz.common.uom.impl.UomPackageImpl#getUom()
		 * @generated
		 */
		EClass UOM = eINSTANCE.getUom();

		/**
		 * The meta object literal for the '<em><b>Uom Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM__UOM_ID = eINSTANCE.getUom_UomId();

		/**
		 * The meta object literal for the '<em><b>Abbreviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM__ABBREVIATION = eINSTANCE.getUom_Abbreviation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM__DESCRIPTION = eINSTANCE.getUom_Description();

		/**
		 * The meta object literal for the '<em><b>Main Uom Conversions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM__MAIN_UOM_CONVERSIONS = eINSTANCE.getUom_MainUomConversions();

		/**
		 * The meta object literal for the '<em><b>Numeric Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM__NUMERIC_CODE = eINSTANCE.getUom_NumericCode();

		/**
		 * The meta object literal for the '<em><b>Uom Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM__UOM_TYPE_ID = eINSTANCE.getUom_UomTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.uom.impl.UomConversionImpl <em>Conversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.uom.impl.UomConversionImpl
		 * @see org.abchip.mimo.biz.common.uom.impl.UomPackageImpl#getUomConversion()
		 * @generated
		 */
		EClass UOM_CONVERSION = eINSTANCE.getUomConversion();

		/**
		 * The meta object literal for the '<em><b>Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_CONVERSION__UOM_ID = eINSTANCE.getUomConversion_UomId();

		/**
		 * The meta object literal for the '<em><b>Uom Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_CONVERSION__UOM_ID_TO = eINSTANCE.getUomConversion_UomIdTo();

		/**
		 * The meta object literal for the '<em><b>Conversion Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_CONVERSION__CONVERSION_FACTOR = eINSTANCE.getUomConversion_ConversionFactor();

		/**
		 * The meta object literal for the '<em><b>Custom Method Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_CONVERSION__CUSTOM_METHOD_ID = eINSTANCE.getUomConversion_CustomMethodId();

		/**
		 * The meta object literal for the '<em><b>Decimal Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_CONVERSION__DECIMAL_SCALE = eINSTANCE.getUomConversion_DecimalScale();

		/**
		 * The meta object literal for the '<em><b>Rounding Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_CONVERSION__ROUNDING_MODE = eINSTANCE.getUomConversion_RoundingMode();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.uom.impl.UomConversionDatedImpl <em>Conversion Dated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.uom.impl.UomConversionDatedImpl
		 * @see org.abchip.mimo.biz.common.uom.impl.UomPackageImpl#getUomConversionDated()
		 * @generated
		 */
		EClass UOM_CONVERSION_DATED = eINSTANCE.getUomConversionDated();

		/**
		 * The meta object literal for the '<em><b>Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_CONVERSION_DATED__UOM_ID = eINSTANCE.getUomConversionDated_UomId();

		/**
		 * The meta object literal for the '<em><b>Uom Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_CONVERSION_DATED__UOM_ID_TO = eINSTANCE.getUomConversionDated_UomIdTo();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_CONVERSION_DATED__FROM_DATE = eINSTANCE.getUomConversionDated_FromDate();

		/**
		 * The meta object literal for the '<em><b>Conversion Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_CONVERSION_DATED__CONVERSION_FACTOR = eINSTANCE.getUomConversionDated_ConversionFactor();

		/**
		 * The meta object literal for the '<em><b>Custom Method Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_CONVERSION_DATED__CUSTOM_METHOD_ID = eINSTANCE.getUomConversionDated_CustomMethodId();

		/**
		 * The meta object literal for the '<em><b>Decimal Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_CONVERSION_DATED__DECIMAL_SCALE = eINSTANCE.getUomConversionDated_DecimalScale();

		/**
		 * The meta object literal for the '<em><b>Purpose Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_CONVERSION_DATED__PURPOSE_ENUM_ID = eINSTANCE.getUomConversionDated_PurposeEnumId();

		/**
		 * The meta object literal for the '<em><b>Rounding Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_CONVERSION_DATED__ROUNDING_MODE = eINSTANCE.getUomConversionDated_RoundingMode();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_CONVERSION_DATED__THRU_DATE = eINSTANCE.getUomConversionDated_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.uom.impl.UomGroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.uom.impl.UomGroupImpl
		 * @see org.abchip.mimo.biz.common.uom.impl.UomPackageImpl#getUomGroup()
		 * @generated
		 */
		EClass UOM_GROUP = eINSTANCE.getUomGroup();

		/**
		 * The meta object literal for the '<em><b>Uom Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_GROUP__UOM_GROUP_ID = eINSTANCE.getUomGroup_UomGroupId();

		/**
		 * The meta object literal for the '<em><b>Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_GROUP__UOM_ID = eINSTANCE.getUomGroup_UomId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.uom.impl.UomTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.uom.impl.UomTypeImpl
		 * @see org.abchip.mimo.biz.common.uom.impl.UomPackageImpl#getUomType()
		 * @generated
		 */
		EClass UOM_TYPE = eINSTANCE.getUomType();

		/**
		 * The meta object literal for the '<em><b>Uom Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_TYPE__UOM_TYPE_ID = eINSTANCE.getUomType_UomTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_TYPE__DESCRIPTION = eINSTANCE.getUomType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_TYPE__HAS_TABLE = eINSTANCE.getUomType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_TYPE__PARENT_TYPE_ID = eINSTANCE.getUomType_ParentTypeId();

	}

} //UomPackage
