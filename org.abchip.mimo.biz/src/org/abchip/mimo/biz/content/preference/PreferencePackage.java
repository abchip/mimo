/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.preference;

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
 * @see org.abchip.mimo.biz.content.preference.PreferenceFactory
 * @model kind="package"
 * @generated
 */
public interface PreferencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "preference";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/content/preference";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-preference";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PreferencePackage eINSTANCE = org.abchip.mimo.biz.content.preference.impl.PreferencePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.content.preference.impl.WebPreferenceTypeImpl <em>Web Preference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.content.preference.impl.WebPreferenceTypeImpl
	 * @see org.abchip.mimo.biz.content.preference.impl.PreferencePackageImpl#getWebPreferenceType()
	 * @generated
	 */
	int WEB_PREFERENCE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PREFERENCE_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PREFERENCE_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PREFERENCE_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PREFERENCE_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Web Preference Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PREFERENCE_TYPE__WEB_PREFERENCE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PREFERENCE_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Web Preference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PREFERENCE_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.content.preference.impl.WebUserPreferenceImpl <em>Web User Preference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.content.preference.impl.WebUserPreferenceImpl
	 * @see org.abchip.mimo.biz.content.preference.impl.PreferencePackageImpl#getWebUserPreference()
	 * @generated
	 */
	int WEB_USER_PREFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_USER_PREFERENCE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_USER_PREFERENCE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_USER_PREFERENCE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_USER_PREFERENCE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Web Preference Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_USER_PREFERENCE__WEB_PREFERENCE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_USER_PREFERENCE__USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_USER_PREFERENCE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Visit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_USER_PREFERENCE__VISIT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Web Preference Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_USER_PREFERENCE__WEB_PREFERENCE_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Web User Preference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_USER_PREFERENCE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.content.preference.WebPreferenceType <em>Web Preference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Preference Type</em>'.
	 * @see org.abchip.mimo.biz.content.preference.WebPreferenceType
	 * @generated
	 */
	EClass getWebPreferenceType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.content.preference.WebPreferenceType#getWebPreferenceTypeId <em>Web Preference Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Preference Type Id</em>'.
	 * @see org.abchip.mimo.biz.content.preference.WebPreferenceType#getWebPreferenceTypeId()
	 * @see #getWebPreferenceType()
	 * @generated
	 */
	EAttribute getWebPreferenceType_WebPreferenceTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.content.preference.WebPreferenceType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.content.preference.WebPreferenceType#getDescription()
	 * @see #getWebPreferenceType()
	 * @generated
	 */
	EAttribute getWebPreferenceType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.content.preference.WebUserPreference <em>Web User Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web User Preference</em>'.
	 * @see org.abchip.mimo.biz.content.preference.WebUserPreference
	 * @generated
	 */
	EClass getWebUserPreference();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.content.preference.WebUserPreference#getUserLoginId <em>User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Login Id</em>'.
	 * @see org.abchip.mimo.biz.content.preference.WebUserPreference#getUserLoginId()
	 * @see #getWebUserPreference()
	 * @generated
	 */
	EReference getWebUserPreference_UserLoginId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.content.preference.WebUserPreference#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.content.preference.WebUserPreference#getPartyId()
	 * @see #getWebUserPreference()
	 * @generated
	 */
	EReference getWebUserPreference_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.content.preference.WebUserPreference#getVisitId <em>Visit Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visit Id</em>'.
	 * @see org.abchip.mimo.biz.content.preference.WebUserPreference#getVisitId()
	 * @see #getWebUserPreference()
	 * @generated
	 */
	EAttribute getWebUserPreference_VisitId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.content.preference.WebUserPreference#getWebPreferenceTypeId <em>Web Preference Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Web Preference Type Id</em>'.
	 * @see org.abchip.mimo.biz.content.preference.WebUserPreference#getWebPreferenceTypeId()
	 * @see #getWebUserPreference()
	 * @generated
	 */
	EReference getWebUserPreference_WebPreferenceTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.content.preference.WebUserPreference#getWebPreferenceValue <em>Web Preference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Preference Value</em>'.
	 * @see org.abchip.mimo.biz.content.preference.WebUserPreference#getWebPreferenceValue()
	 * @see #getWebUserPreference()
	 * @generated
	 */
	EAttribute getWebUserPreference_WebPreferenceValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PreferenceFactory getPreferenceFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.content.preference.impl.WebPreferenceTypeImpl <em>Web Preference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.content.preference.impl.WebPreferenceTypeImpl
		 * @see org.abchip.mimo.biz.content.preference.impl.PreferencePackageImpl#getWebPreferenceType()
		 * @generated
		 */
		EClass WEB_PREFERENCE_TYPE = eINSTANCE.getWebPreferenceType();

		/**
		 * The meta object literal for the '<em><b>Web Preference Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PREFERENCE_TYPE__WEB_PREFERENCE_TYPE_ID = eINSTANCE.getWebPreferenceType_WebPreferenceTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PREFERENCE_TYPE__DESCRIPTION = eINSTANCE.getWebPreferenceType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.content.preference.impl.WebUserPreferenceImpl <em>Web User Preference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.content.preference.impl.WebUserPreferenceImpl
		 * @see org.abchip.mimo.biz.content.preference.impl.PreferencePackageImpl#getWebUserPreference()
		 * @generated
		 */
		EClass WEB_USER_PREFERENCE = eINSTANCE.getWebUserPreference();

		/**
		 * The meta object literal for the '<em><b>User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_USER_PREFERENCE__USER_LOGIN_ID = eINSTANCE.getWebUserPreference_UserLoginId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_USER_PREFERENCE__PARTY_ID = eINSTANCE.getWebUserPreference_PartyId();

		/**
		 * The meta object literal for the '<em><b>Visit Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_USER_PREFERENCE__VISIT_ID = eINSTANCE.getWebUserPreference_VisitId();

		/**
		 * The meta object literal for the '<em><b>Web Preference Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_USER_PREFERENCE__WEB_PREFERENCE_TYPE_ID = eINSTANCE.getWebUserPreference_WebPreferenceTypeId();

		/**
		 * The meta object literal for the '<em><b>Web Preference Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_USER_PREFERENCE__WEB_PREFERENCE_VALUE = eINSTANCE.getWebUserPreference_WebPreferenceValue();

	}

} //PreferencePackage
