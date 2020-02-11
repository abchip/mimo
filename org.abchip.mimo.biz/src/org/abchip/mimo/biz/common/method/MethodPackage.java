/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.method;

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
 * @see org.abchip.mimo.biz.common.method.MethodFactory
 * @model kind="package"
 * @generated
 */
public interface MethodPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "method";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/common/method";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-method";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MethodPackage eINSTANCE = org.abchip.mimo.biz.common.method.impl.MethodPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.method.impl.CustomMethodImpl <em>Custom Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.method.impl.CustomMethodImpl
	 * @see org.abchip.mimo.biz.common.method.impl.MethodPackageImpl#getCustomMethod()
	 * @generated
	 */
	int CUSTOM_METHOD = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METHOD__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METHOD__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METHOD__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METHOD__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Custom Method Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METHOD__CUSTOM_METHOD_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Custom Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METHOD__CUSTOM_METHOD_NAME = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Custom Method Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METHOD__CUSTOM_METHOD_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METHOD__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fixed Asset Dep Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METHOD__FIXED_ASSET_DEP_METHODS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Custom Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METHOD_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.method.impl.CustomMethodTypeImpl <em>Custom Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.method.impl.CustomMethodTypeImpl
	 * @see org.abchip.mimo.biz.common.method.impl.MethodPackageImpl#getCustomMethodType()
	 * @generated
	 */
	int CUSTOM_METHOD_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METHOD_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METHOD_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METHOD_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METHOD_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METHOD_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Custom Method Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METHOD_TYPE__CUSTOM_METHOD_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METHOD_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METHOD_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METHOD_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Custom Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_METHOD_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.method.CustomMethod <em>Custom Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Method</em>'.
	 * @see org.abchip.mimo.biz.common.method.CustomMethod
	 * @generated
	 */
	EClass getCustomMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.method.CustomMethod#getCustomMethodId <em>Custom Method Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Method Id</em>'.
	 * @see org.abchip.mimo.biz.common.method.CustomMethod#getCustomMethodId()
	 * @see #getCustomMethod()
	 * @generated
	 */
	EAttribute getCustomMethod_CustomMethodId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.method.CustomMethod#getCustomMethodName <em>Custom Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Method Name</em>'.
	 * @see org.abchip.mimo.biz.common.method.CustomMethod#getCustomMethodName()
	 * @see #getCustomMethod()
	 * @generated
	 */
	EAttribute getCustomMethod_CustomMethodName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.method.CustomMethod#getCustomMethodTypeId <em>Custom Method Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Custom Method Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.method.CustomMethod#getCustomMethodTypeId()
	 * @see #getCustomMethod()
	 * @generated
	 */
	EReference getCustomMethod_CustomMethodTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.method.CustomMethod#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.common.method.CustomMethod#getDescription()
	 * @see #getCustomMethod()
	 * @generated
	 */
	EAttribute getCustomMethod_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.common.method.CustomMethod#getFixedAssetDepMethods <em>Fixed Asset Dep Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fixed Asset Dep Methods</em>'.
	 * @see org.abchip.mimo.biz.common.method.CustomMethod#getFixedAssetDepMethods()
	 * @see #getCustomMethod()
	 * @generated
	 */
	EReference getCustomMethod_FixedAssetDepMethods();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.method.CustomMethodType <em>Custom Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Method Type</em>'.
	 * @see org.abchip.mimo.biz.common.method.CustomMethodType
	 * @generated
	 */
	EClass getCustomMethodType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.method.CustomMethodType#getCustomMethodTypeId <em>Custom Method Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Method Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.method.CustomMethodType#getCustomMethodTypeId()
	 * @see #getCustomMethodType()
	 * @generated
	 */
	EAttribute getCustomMethodType_CustomMethodTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.method.CustomMethodType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.common.method.CustomMethodType#getDescription()
	 * @see #getCustomMethodType()
	 * @generated
	 */
	EAttribute getCustomMethodType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.method.CustomMethodType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.common.method.CustomMethodType#isHasTable()
	 * @see #getCustomMethodType()
	 * @generated
	 */
	EAttribute getCustomMethodType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.method.CustomMethodType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.method.CustomMethodType#getParentTypeId()
	 * @see #getCustomMethodType()
	 * @generated
	 */
	EReference getCustomMethodType_ParentTypeId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MethodFactory getMethodFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.method.impl.CustomMethodImpl <em>Custom Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.method.impl.CustomMethodImpl
		 * @see org.abchip.mimo.biz.common.method.impl.MethodPackageImpl#getCustomMethod()
		 * @generated
		 */
		EClass CUSTOM_METHOD = eINSTANCE.getCustomMethod();

		/**
		 * The meta object literal for the '<em><b>Custom Method Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_METHOD__CUSTOM_METHOD_ID = eINSTANCE.getCustomMethod_CustomMethodId();

		/**
		 * The meta object literal for the '<em><b>Custom Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_METHOD__CUSTOM_METHOD_NAME = eINSTANCE.getCustomMethod_CustomMethodName();

		/**
		 * The meta object literal for the '<em><b>Custom Method Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_METHOD__CUSTOM_METHOD_TYPE_ID = eINSTANCE.getCustomMethod_CustomMethodTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_METHOD__DESCRIPTION = eINSTANCE.getCustomMethod_Description();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Dep Methods</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_METHOD__FIXED_ASSET_DEP_METHODS = eINSTANCE.getCustomMethod_FixedAssetDepMethods();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.method.impl.CustomMethodTypeImpl <em>Custom Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.method.impl.CustomMethodTypeImpl
		 * @see org.abchip.mimo.biz.common.method.impl.MethodPackageImpl#getCustomMethodType()
		 * @generated
		 */
		EClass CUSTOM_METHOD_TYPE = eINSTANCE.getCustomMethodType();

		/**
		 * The meta object literal for the '<em><b>Custom Method Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_METHOD_TYPE__CUSTOM_METHOD_TYPE_ID = eINSTANCE.getCustomMethodType_CustomMethodTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_METHOD_TYPE__DESCRIPTION = eINSTANCE.getCustomMethodType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_METHOD_TYPE__HAS_TABLE = eINSTANCE.getCustomMethodType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_METHOD_TYPE__PARENT_TYPE_ID = eINSTANCE.getCustomMethodType_ParentTypeId();

	}

} //MethodPackage
