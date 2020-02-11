/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.user;

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
 * @see org.abchip.mimo.biz.common.user.UserFactory
 * @model kind="package"
 * @generated
 */
public interface UserPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "user";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/common/user";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-user";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UserPackage eINSTANCE = org.abchip.mimo.biz.common.user.impl.UserPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.user.impl.UserPrefGroupTypeImpl <em>Pref Group Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.user.impl.UserPrefGroupTypeImpl
	 * @see org.abchip.mimo.biz.common.user.impl.UserPackageImpl#getUserPrefGroupType()
	 * @generated
	 */
	int USER_PREF_GROUP_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREF_GROUP_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREF_GROUP_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREF_GROUP_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREF_GROUP_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>User Pref Group Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREF_GROUP_TYPE__USER_PREF_GROUP_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREF_GROUP_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pref Group Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREF_GROUP_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.user.impl.UserPreferenceImpl <em>Preference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.user.impl.UserPreferenceImpl
	 * @see org.abchip.mimo.biz.common.user.impl.UserPackageImpl#getUserPreference()
	 * @generated
	 */
	int USER_PREFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREFERENCE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREFERENCE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREFERENCE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREFERENCE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREFERENCE__USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Pref Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREFERENCE__USER_PREF_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User Pref Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREFERENCE__USER_PREF_DATA_TYPE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User Pref Group Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREFERENCE__USER_PREF_GROUP_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>User Pref Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREFERENCE__USER_PREF_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Preference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PREFERENCE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.user.UserPrefGroupType <em>Pref Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pref Group Type</em>'.
	 * @see org.abchip.mimo.biz.common.user.UserPrefGroupType
	 * @generated
	 */
	EClass getUserPrefGroupType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.user.UserPrefGroupType#getUserPrefGroupTypeId <em>User Pref Group Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Pref Group Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.user.UserPrefGroupType#getUserPrefGroupTypeId()
	 * @see #getUserPrefGroupType()
	 * @generated
	 */
	EAttribute getUserPrefGroupType_UserPrefGroupTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.user.UserPrefGroupType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.common.user.UserPrefGroupType#getDescription()
	 * @see #getUserPrefGroupType()
	 * @generated
	 */
	EAttribute getUserPrefGroupType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.user.UserPreference <em>Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preference</em>'.
	 * @see org.abchip.mimo.biz.common.user.UserPreference
	 * @generated
	 */
	EClass getUserPreference();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.user.UserPreference#getUserLoginId <em>User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Login Id</em>'.
	 * @see org.abchip.mimo.biz.common.user.UserPreference#getUserLoginId()
	 * @see #getUserPreference()
	 * @generated
	 */
	EReference getUserPreference_UserLoginId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.user.UserPreference#getUserPrefTypeId <em>User Pref Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Pref Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.user.UserPreference#getUserPrefTypeId()
	 * @see #getUserPreference()
	 * @generated
	 */
	EAttribute getUserPreference_UserPrefTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.user.UserPreference#getUserPrefDataType <em>User Pref Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Pref Data Type</em>'.
	 * @see org.abchip.mimo.biz.common.user.UserPreference#getUserPrefDataType()
	 * @see #getUserPreference()
	 * @generated
	 */
	EAttribute getUserPreference_UserPrefDataType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.user.UserPreference#getUserPrefGroupTypeId <em>User Pref Group Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Pref Group Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.user.UserPreference#getUserPrefGroupTypeId()
	 * @see #getUserPreference()
	 * @generated
	 */
	EReference getUserPreference_UserPrefGroupTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.user.UserPreference#getUserPrefValue <em>User Pref Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Pref Value</em>'.
	 * @see org.abchip.mimo.biz.common.user.UserPreference#getUserPrefValue()
	 * @see #getUserPreference()
	 * @generated
	 */
	EAttribute getUserPreference_UserPrefValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UserFactory getUserFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.user.impl.UserPrefGroupTypeImpl <em>Pref Group Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.user.impl.UserPrefGroupTypeImpl
		 * @see org.abchip.mimo.biz.common.user.impl.UserPackageImpl#getUserPrefGroupType()
		 * @generated
		 */
		EClass USER_PREF_GROUP_TYPE = eINSTANCE.getUserPrefGroupType();

		/**
		 * The meta object literal for the '<em><b>User Pref Group Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PREF_GROUP_TYPE__USER_PREF_GROUP_TYPE_ID = eINSTANCE.getUserPrefGroupType_UserPrefGroupTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PREF_GROUP_TYPE__DESCRIPTION = eINSTANCE.getUserPrefGroupType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.user.impl.UserPreferenceImpl <em>Preference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.user.impl.UserPreferenceImpl
		 * @see org.abchip.mimo.biz.common.user.impl.UserPackageImpl#getUserPreference()
		 * @generated
		 */
		EClass USER_PREFERENCE = eINSTANCE.getUserPreference();

		/**
		 * The meta object literal for the '<em><b>User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_PREFERENCE__USER_LOGIN_ID = eINSTANCE.getUserPreference_UserLoginId();

		/**
		 * The meta object literal for the '<em><b>User Pref Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PREFERENCE__USER_PREF_TYPE_ID = eINSTANCE.getUserPreference_UserPrefTypeId();

		/**
		 * The meta object literal for the '<em><b>User Pref Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PREFERENCE__USER_PREF_DATA_TYPE = eINSTANCE.getUserPreference_UserPrefDataType();

		/**
		 * The meta object literal for the '<em><b>User Pref Group Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_PREFERENCE__USER_PREF_GROUP_TYPE_ID = eINSTANCE.getUserPreference_UserPrefGroupTypeId();

		/**
		 * The meta object literal for the '<em><b>User Pref Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PREFERENCE__USER_PREF_VALUE = eINSTANCE.getUserPreference_UserPrefValue();

	}

} //UserPackage
