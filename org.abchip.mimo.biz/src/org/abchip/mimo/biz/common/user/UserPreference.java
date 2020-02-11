/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.user;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.security.login.UserLogin;

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
 * @model annotation="mimo-ent-frame help='The UserPreference entity contains one entry per preference per\n          userLogin. User preferences are stored as key/value pairs (userPrefTypeId/userPrefValue).\n          All values are stored as strings. Value strings can be converted to\n          other data types by specifying a java data type in the userPrefDataType field.' title='Application preferences for a given userLogin.'"
 * @generated
 */
public interface UserPreference extends BizEntity {
	/**
	 * Returns the value of the '<em><b>User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Login Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Login Id</em>' reference.
	 * @see #setUserLoginId(UserLogin)
	 * @see org.abchip.mimo.biz.common.user.UserPackage#getUserPreference_UserLoginId()
	 * @model keys="userLoginId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	UserLogin getUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.user.UserPreference#getUserLoginId <em>User Login Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Login Id</em>' reference.
	 * @see #getUserLoginId()
	 * @generated
	 */
	void setUserLoginId(UserLogin value);

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
	 * @model annotation="mimo-ent-slot help='The java data type of this preference (empty = java.lang.String)'"
	 *        annotation="mimo-ent-format length='60'"
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
	 * Returns the value of the '<em><b>User Pref Group Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Pref Group Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Pref Group Type Id</em>' reference.
	 * @see #setUserPrefGroupTypeId(UserPrefGroupType)
	 * @see org.abchip.mimo.biz.common.user.UserPackage#getUserPreference_UserPrefGroupTypeId()
	 * @model keys="userPrefGroupTypeId"
	 *        annotation="mimo-ent-slot help='Used to assemble groups of preferences'"
	 * @generated
	 */
	UserPrefGroupType getUserPrefGroupTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.user.UserPreference#getUserPrefGroupTypeId <em>User Pref Group Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Pref Group Type Id</em>' reference.
	 * @see #getUserPrefGroupTypeId()
	 * @generated
	 */
	void setUserPrefGroupTypeId(UserPrefGroupType value);

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
	 *        annotation="mimo-ent-slot key='true' help='A unique identifier for this preference'"
	 *        annotation="mimo-ent-format length='60'"
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
	 * @model annotation="mimo-ent-slot help='Contains the value of this preference'"
	 *        annotation="mimo-ent-format length='255'"
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
