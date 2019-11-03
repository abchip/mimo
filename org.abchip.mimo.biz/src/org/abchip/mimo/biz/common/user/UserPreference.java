/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.user;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Preference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.user.UserPreference#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.user.UserPreference#getUserPrefTypeId <em>User Pref Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.user.UserPreference#getUserPrefDataType <em>User Pref Data Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.user.UserPreference#getUserPrefGroupTypeId <em>User Pref Group Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.user.UserPreference#getUserPrefValue <em>User Pref Value</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.user.UserPackage#getUserPreference()
 * @model
 * @generated
 */
public interface UserPreference extends BizEntity {
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
	 * @see org.abchip.mimo.biz.common.user.UserPackage#getUserPreference_UserLoginId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='UserLogin'"
	 * @generated
	 */
	String getUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.user.UserPreference#getUserLoginId <em>User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Login Id</em>' attribute.
	 * @see #getUserLoginId()
	 * @generated
	 */
	void setUserLoginId(String value);

	/**
	 * Returns the value of the '<em><b>User Pref Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Pref Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Pref Data Type</em>' attribute.
	 * @see #setUserPrefDataType(String)
	 * @see org.abchip.mimo.biz.common.user.UserPackage#getUserPreference_UserPrefDataType()
	 * @model
	 * @generated
	 */
	String getUserPrefDataType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.user.UserPreference#getUserPrefDataType <em>User Pref Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Pref Data Type</em>' attribute.
	 * @see #getUserPrefDataType()
	 * @generated
	 */
	void setUserPrefDataType(String value);

	/**
	 * Returns the value of the '<em><b>User Pref Group Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Pref Group Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Pref Group Type Id</em>' attribute.
	 * @see #setUserPrefGroupTypeId(String)
	 * @see org.abchip.mimo.biz.common.user.UserPackage#getUserPreference_UserPrefGroupTypeId()
	 * @model annotation="mimo-ent-domain frame='UserPrefGroupType'"
	 * @generated
	 */
	String getUserPrefGroupTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.user.UserPreference#getUserPrefGroupTypeId <em>User Pref Group Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Pref Group Type Id</em>' attribute.
	 * @see #getUserPrefGroupTypeId()
	 * @generated
	 */
	void setUserPrefGroupTypeId(String value);

	/**
	 * Returns the value of the '<em><b>User Pref Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Pref Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Pref Type Id</em>' attribute.
	 * @see #setUserPrefTypeId(String)
	 * @see org.abchip.mimo.biz.common.user.UserPackage#getUserPreference_UserPrefTypeId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getUserPrefTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.user.UserPreference#getUserPrefTypeId <em>User Pref Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Pref Type Id</em>' attribute.
	 * @see #getUserPrefTypeId()
	 * @generated
	 */
	void setUserPrefTypeId(String value);

	/**
	 * Returns the value of the '<em><b>User Pref Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Pref Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Pref Value</em>' attribute.
	 * @see #setUserPrefValue(String)
	 * @see org.abchip.mimo.biz.common.user.UserPackage#getUserPreference_UserPrefValue()
	 * @model
	 * @generated
	 */
	String getUserPrefValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.user.UserPreference#getUserPrefValue <em>User Pref Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Pref Value</em>' attribute.
	 * @see #getUserPrefValue()
	 * @generated
	 */
	void setUserPrefValue(String value);

} // UserPreference
