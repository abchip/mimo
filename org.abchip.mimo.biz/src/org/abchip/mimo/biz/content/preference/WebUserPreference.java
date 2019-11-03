/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.preference;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web User Preference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.preference.WebUserPreference#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.preference.WebUserPreference#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.preference.WebUserPreference#getVisitId <em>Visit Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.preference.WebUserPreference#getWebPreferenceTypeId <em>Web Preference Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.preference.WebUserPreference#getWebPreferenceValue <em>Web Preference Value</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.preference.PreferencePackage#getWebUserPreference()
 * @model
 * @generated
 */
public interface WebUserPreference extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.content.preference.PreferencePackage#getWebUserPreference_PartyId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.preference.WebUserPreference#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>User Login Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Login Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Login Id</em>' attribute.
	 * @see #setUserLoginId(String)
	 * @see org.abchip.mimo.biz.content.preference.PreferencePackage#getWebUserPreference_UserLoginId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='UserLogin'"
	 * @generated
	 */
	String getUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.preference.WebUserPreference#getUserLoginId <em>User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Login Id</em>' attribute.
	 * @see #getUserLoginId()
	 * @generated
	 */
	void setUserLoginId(String value);

	/**
	 * Returns the value of the '<em><b>Visit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visit Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visit Id</em>' attribute.
	 * @see #setVisitId(String)
	 * @see org.abchip.mimo.biz.content.preference.PreferencePackage#getWebUserPreference_VisitId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getVisitId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.preference.WebUserPreference#getVisitId <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visit Id</em>' attribute.
	 * @see #getVisitId()
	 * @generated
	 */
	void setVisitId(String value);

	/**
	 * Returns the value of the '<em><b>Web Preference Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Preference Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Preference Type Id</em>' attribute.
	 * @see #setWebPreferenceTypeId(String)
	 * @see org.abchip.mimo.biz.content.preference.PreferencePackage#getWebUserPreference_WebPreferenceTypeId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='WebPreferenceType'"
	 * @generated
	 */
	String getWebPreferenceTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.preference.WebUserPreference#getWebPreferenceTypeId <em>Web Preference Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Preference Type Id</em>' attribute.
	 * @see #getWebPreferenceTypeId()
	 * @generated
	 */
	void setWebPreferenceTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Web Preference Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Preference Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Preference Value</em>' attribute.
	 * @see #setWebPreferenceValue(String)
	 * @see org.abchip.mimo.biz.content.preference.PreferencePackage#getWebUserPreference_WebPreferenceValue()
	 * @model
	 * @generated
	 */
	String getWebPreferenceValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.preference.WebUserPreference#getWebPreferenceValue <em>Web Preference Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Preference Value</em>' attribute.
	 * @see #getWebPreferenceValue()
	 * @generated
	 */
	void setWebPreferenceValue(String value);

} // WebUserPreference
