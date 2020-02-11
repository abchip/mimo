/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.security.login;

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
 * @see org.abchip.mimo.biz.security.login.LoginFactory
 * @model kind="package"
 * @generated
 */
public interface LoginPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "login";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/security/login";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-login";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LoginPackage eINSTANCE = org.abchip.mimo.biz.security.login.impl.LoginPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.security.login.impl.UserLoginImpl <em>User Login</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.security.login.impl.UserLoginImpl
	 * @see org.abchip.mimo.biz.security.login.impl.LoginPackageImpl#getUserLogin()
	 * @generated
	 */
	int USER_LOGIN = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>User Login Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN__USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Current Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN__CURRENT_PASSWORD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Disabled By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN__DISABLED_BY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Disabled Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN__DISABLED_DATE_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN__ENABLED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>External Auth Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN__EXTERNAL_AUTH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Logged Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN__HAS_LOGGED_OUT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN__IS_SYSTEM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Last Currency Uom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN__LAST_CURRENCY_UOM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Last Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN__LAST_LOCALE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Last Time Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN__LAST_TIME_ZONE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Password Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN__PASSWORD_HINT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Require Password Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN__REQUIRE_PASSWORD_CHANGE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Successive Failed Logins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN__SUCCESSIVE_FAILED_LOGINS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>User Ldap Dn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN__USER_LDAP_DN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>User Login Histories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN__USER_LOGIN_HISTORIES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>User Login Password Histories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN__USER_LOGIN_PASSWORD_HISTORIES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>User Preferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN__USER_PREFERENCES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>User Login</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 19;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.security.login.impl.UserLoginHistoryImpl <em>User Login History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.security.login.impl.UserLoginHistoryImpl
	 * @see org.abchip.mimo.biz.security.login.impl.LoginPackageImpl#getUserLoginHistory()
	 * @generated
	 */
	int USER_LOGIN_HISTORY = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_HISTORY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_HISTORY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_HISTORY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_HISTORY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_HISTORY__USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_HISTORY__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Origin User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_HISTORY__ORIGIN_USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_HISTORY__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Password Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_HISTORY__PASSWORD_USED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Successful Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_HISTORY__SUCCESSFUL_LOGIN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_HISTORY__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Visit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_HISTORY__VISIT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>User Login History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_HISTORY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.security.login.impl.UserLoginPasswordHistoryImpl <em>User Login Password History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.security.login.impl.UserLoginPasswordHistoryImpl
	 * @see org.abchip.mimo.biz.security.login.impl.LoginPackageImpl#getUserLoginPasswordHistory()
	 * @generated
	 */
	int USER_LOGIN_PASSWORD_HISTORY = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_PASSWORD_HISTORY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_PASSWORD_HISTORY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_PASSWORD_HISTORY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_PASSWORD_HISTORY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_PASSWORD_HISTORY__USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_PASSWORD_HISTORY__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Current Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_PASSWORD_HISTORY__CURRENT_PASSWORD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_PASSWORD_HISTORY__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>User Login Password History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_PASSWORD_HISTORY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.security.login.impl.UserLoginSecurityQuestionImpl <em>User Login Security Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.security.login.impl.UserLoginSecurityQuestionImpl
	 * @see org.abchip.mimo.biz.security.login.impl.LoginPackageImpl#getUserLoginSecurityQuestion()
	 * @generated
	 */
	int USER_LOGIN_SECURITY_QUESTION = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_SECURITY_QUESTION__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_SECURITY_QUESTION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_SECURITY_QUESTION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_SECURITY_QUESTION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Question Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_SECURITY_QUESTION__QUESTION_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_SECURITY_QUESTION__USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Security Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_SECURITY_QUESTION__SECURITY_ANSWER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>User Login Security Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_SECURITY_QUESTION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.security.login.impl.UserLoginSessionImpl <em>User Login Session</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.security.login.impl.UserLoginSessionImpl
	 * @see org.abchip.mimo.biz.security.login.impl.LoginPackageImpl#getUserLoginSession()
	 * @generated
	 */
	int USER_LOGIN_SESSION = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_SESSION__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_SESSION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_SESSION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_SESSION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>User Login Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_SESSION__USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Saved Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_SESSION__SAVED_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Session Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_SESSION__SESSION_DATA = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>User Login Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_SESSION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.security.login.UserLogin <em>User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Login</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLogin
	 * @generated
	 */
	EClass getUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.login.UserLogin#getUserLoginId <em>User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Login Id</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLogin#getUserLoginId()
	 * @see #getUserLogin()
	 * @generated
	 */
	EAttribute getUserLogin_UserLoginId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.login.UserLogin#getCurrentPassword <em>Current Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Password</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLogin#getCurrentPassword()
	 * @see #getUserLogin()
	 * @generated
	 */
	EAttribute getUserLogin_CurrentPassword();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.login.UserLogin#getDisabledBy <em>Disabled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled By</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLogin#getDisabledBy()
	 * @see #getUserLogin()
	 * @generated
	 */
	EAttribute getUserLogin_DisabledBy();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.login.UserLogin#getDisabledDateTime <em>Disabled Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled Date Time</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLogin#getDisabledDateTime()
	 * @see #getUserLogin()
	 * @generated
	 */
	EAttribute getUserLogin_DisabledDateTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.login.UserLogin#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLogin#isEnabled()
	 * @see #getUserLogin()
	 * @generated
	 */
	EAttribute getUserLogin_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.login.UserLogin#getExternalAuthId <em>External Auth Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Auth Id</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLogin#getExternalAuthId()
	 * @see #getUserLogin()
	 * @generated
	 */
	EAttribute getUserLogin_ExternalAuthId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.login.UserLogin#isHasLoggedOut <em>Has Logged Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Logged Out</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLogin#isHasLoggedOut()
	 * @see #getUserLogin()
	 * @generated
	 */
	EAttribute getUserLogin_HasLoggedOut();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.login.UserLogin#isIsSystem <em>Is System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is System</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLogin#isIsSystem()
	 * @see #getUserLogin()
	 * @generated
	 */
	EAttribute getUserLogin_IsSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.login.UserLogin#getLastCurrencyUom <em>Last Currency Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Currency Uom</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLogin#getLastCurrencyUom()
	 * @see #getUserLogin()
	 * @generated
	 */
	EAttribute getUserLogin_LastCurrencyUom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.login.UserLogin#getLastLocale <em>Last Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Locale</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLogin#getLastLocale()
	 * @see #getUserLogin()
	 * @generated
	 */
	EAttribute getUserLogin_LastLocale();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.login.UserLogin#getLastTimeZone <em>Last Time Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Time Zone</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLogin#getLastTimeZone()
	 * @see #getUserLogin()
	 * @generated
	 */
	EAttribute getUserLogin_LastTimeZone();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.security.login.UserLogin#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLogin#getPartyId()
	 * @see #getUserLogin()
	 * @generated
	 */
	EReference getUserLogin_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.login.UserLogin#getPasswordHint <em>Password Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password Hint</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLogin#getPasswordHint()
	 * @see #getUserLogin()
	 * @generated
	 */
	EAttribute getUserLogin_PasswordHint();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.login.UserLogin#isRequirePasswordChange <em>Require Password Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Require Password Change</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLogin#isRequirePasswordChange()
	 * @see #getUserLogin()
	 * @generated
	 */
	EAttribute getUserLogin_RequirePasswordChange();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.login.UserLogin#getSuccessiveFailedLogins <em>Successive Failed Logins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Successive Failed Logins</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLogin#getSuccessiveFailedLogins()
	 * @see #getUserLogin()
	 * @generated
	 */
	EAttribute getUserLogin_SuccessiveFailedLogins();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.login.UserLogin#getUserLdapDn <em>User Ldap Dn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Ldap Dn</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLogin#getUserLdapDn()
	 * @see #getUserLogin()
	 * @generated
	 */
	EAttribute getUserLogin_UserLdapDn();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.security.login.UserLogin#getUserLoginHistories <em>User Login Histories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User Login Histories</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLogin#getUserLoginHistories()
	 * @see #getUserLogin()
	 * @generated
	 */
	EReference getUserLogin_UserLoginHistories();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.security.login.UserLogin#getUserLoginPasswordHistories <em>User Login Password Histories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User Login Password Histories</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLogin#getUserLoginPasswordHistories()
	 * @see #getUserLogin()
	 * @generated
	 */
	EReference getUserLogin_UserLoginPasswordHistories();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.security.login.UserLogin#getUserPreferences <em>User Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User Preferences</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLogin#getUserPreferences()
	 * @see #getUserLogin()
	 * @generated
	 */
	EReference getUserLogin_UserPreferences();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.security.login.UserLoginHistory <em>User Login History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Login History</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLoginHistory
	 * @generated
	 */
	EClass getUserLoginHistory();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.security.login.UserLoginHistory#getUserLoginId <em>User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Login Id</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLoginHistory#getUserLoginId()
	 * @see #getUserLoginHistory()
	 * @generated
	 */
	EReference getUserLoginHistory_UserLoginId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.login.UserLoginHistory#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLoginHistory#getFromDate()
	 * @see #getUserLoginHistory()
	 * @generated
	 */
	EAttribute getUserLoginHistory_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.security.login.UserLoginHistory#getOriginUserLoginId <em>Origin User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin User Login Id</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLoginHistory#getOriginUserLoginId()
	 * @see #getUserLoginHistory()
	 * @generated
	 */
	EReference getUserLoginHistory_OriginUserLoginId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.security.login.UserLoginHistory#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLoginHistory#getPartyId()
	 * @see #getUserLoginHistory()
	 * @generated
	 */
	EReference getUserLoginHistory_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.login.UserLoginHistory#getPasswordUsed <em>Password Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password Used</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLoginHistory#getPasswordUsed()
	 * @see #getUserLoginHistory()
	 * @generated
	 */
	EAttribute getUserLoginHistory_PasswordUsed();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.login.UserLoginHistory#isSuccessfulLogin <em>Successful Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Successful Login</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLoginHistory#isSuccessfulLogin()
	 * @see #getUserLoginHistory()
	 * @generated
	 */
	EAttribute getUserLoginHistory_SuccessfulLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.login.UserLoginHistory#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLoginHistory#getThruDate()
	 * @see #getUserLoginHistory()
	 * @generated
	 */
	EAttribute getUserLoginHistory_ThruDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.login.UserLoginHistory#getVisitId <em>Visit Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visit Id</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLoginHistory#getVisitId()
	 * @see #getUserLoginHistory()
	 * @generated
	 */
	EAttribute getUserLoginHistory_VisitId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.security.login.UserLoginPasswordHistory <em>User Login Password History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Login Password History</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLoginPasswordHistory
	 * @generated
	 */
	EClass getUserLoginPasswordHistory();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.security.login.UserLoginPasswordHistory#getUserLoginId <em>User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Login Id</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLoginPasswordHistory#getUserLoginId()
	 * @see #getUserLoginPasswordHistory()
	 * @generated
	 */
	EReference getUserLoginPasswordHistory_UserLoginId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.login.UserLoginPasswordHistory#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLoginPasswordHistory#getFromDate()
	 * @see #getUserLoginPasswordHistory()
	 * @generated
	 */
	EAttribute getUserLoginPasswordHistory_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.login.UserLoginPasswordHistory#getCurrentPassword <em>Current Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Password</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLoginPasswordHistory#getCurrentPassword()
	 * @see #getUserLoginPasswordHistory()
	 * @generated
	 */
	EAttribute getUserLoginPasswordHistory_CurrentPassword();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.login.UserLoginPasswordHistory#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLoginPasswordHistory#getThruDate()
	 * @see #getUserLoginPasswordHistory()
	 * @generated
	 */
	EAttribute getUserLoginPasswordHistory_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.security.login.UserLoginSecurityQuestion <em>User Login Security Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Login Security Question</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLoginSecurityQuestion
	 * @generated
	 */
	EClass getUserLoginSecurityQuestion();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.security.login.UserLoginSecurityQuestion#getQuestionEnumId <em>Question Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Question Enum Id</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLoginSecurityQuestion#getQuestionEnumId()
	 * @see #getUserLoginSecurityQuestion()
	 * @generated
	 */
	EReference getUserLoginSecurityQuestion_QuestionEnumId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.security.login.UserLoginSecurityQuestion#getUserLoginId <em>User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Login Id</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLoginSecurityQuestion#getUserLoginId()
	 * @see #getUserLoginSecurityQuestion()
	 * @generated
	 */
	EReference getUserLoginSecurityQuestion_UserLoginId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.login.UserLoginSecurityQuestion#getSecurityAnswer <em>Security Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Answer</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLoginSecurityQuestion#getSecurityAnswer()
	 * @see #getUserLoginSecurityQuestion()
	 * @generated
	 */
	EAttribute getUserLoginSecurityQuestion_SecurityAnswer();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.security.login.UserLoginSession <em>User Login Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Login Session</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLoginSession
	 * @generated
	 */
	EClass getUserLoginSession();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.login.UserLoginSession#getUserLoginId <em>User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Login Id</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLoginSession#getUserLoginId()
	 * @see #getUserLoginSession()
	 * @generated
	 */
	EAttribute getUserLoginSession_UserLoginId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.login.UserLoginSession#getSavedDate <em>Saved Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Saved Date</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLoginSession#getSavedDate()
	 * @see #getUserLoginSession()
	 * @generated
	 */
	EAttribute getUserLoginSession_SavedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.security.login.UserLoginSession#getSessionData <em>Session Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session Data</em>'.
	 * @see org.abchip.mimo.biz.security.login.UserLoginSession#getSessionData()
	 * @see #getUserLoginSession()
	 * @generated
	 */
	EAttribute getUserLoginSession_SessionData();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LoginFactory getLoginFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.security.login.impl.UserLoginImpl <em>User Login</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.security.login.impl.UserLoginImpl
		 * @see org.abchip.mimo.biz.security.login.impl.LoginPackageImpl#getUserLogin()
		 * @generated
		 */
		EClass USER_LOGIN = eINSTANCE.getUserLogin();

		/**
		 * The meta object literal for the '<em><b>User Login Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN__USER_LOGIN_ID = eINSTANCE.getUserLogin_UserLoginId();

		/**
		 * The meta object literal for the '<em><b>Current Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN__CURRENT_PASSWORD = eINSTANCE.getUserLogin_CurrentPassword();

		/**
		 * The meta object literal for the '<em><b>Disabled By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN__DISABLED_BY = eINSTANCE.getUserLogin_DisabledBy();

		/**
		 * The meta object literal for the '<em><b>Disabled Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN__DISABLED_DATE_TIME = eINSTANCE.getUserLogin_DisabledDateTime();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN__ENABLED = eINSTANCE.getUserLogin_Enabled();

		/**
		 * The meta object literal for the '<em><b>External Auth Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN__EXTERNAL_AUTH_ID = eINSTANCE.getUserLogin_ExternalAuthId();

		/**
		 * The meta object literal for the '<em><b>Has Logged Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN__HAS_LOGGED_OUT = eINSTANCE.getUserLogin_HasLoggedOut();

		/**
		 * The meta object literal for the '<em><b>Is System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN__IS_SYSTEM = eINSTANCE.getUserLogin_IsSystem();

		/**
		 * The meta object literal for the '<em><b>Last Currency Uom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN__LAST_CURRENCY_UOM = eINSTANCE.getUserLogin_LastCurrencyUom();

		/**
		 * The meta object literal for the '<em><b>Last Locale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN__LAST_LOCALE = eINSTANCE.getUserLogin_LastLocale();

		/**
		 * The meta object literal for the '<em><b>Last Time Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN__LAST_TIME_ZONE = eINSTANCE.getUserLogin_LastTimeZone();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_LOGIN__PARTY_ID = eINSTANCE.getUserLogin_PartyId();

		/**
		 * The meta object literal for the '<em><b>Password Hint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN__PASSWORD_HINT = eINSTANCE.getUserLogin_PasswordHint();

		/**
		 * The meta object literal for the '<em><b>Require Password Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN__REQUIRE_PASSWORD_CHANGE = eINSTANCE.getUserLogin_RequirePasswordChange();

		/**
		 * The meta object literal for the '<em><b>Successive Failed Logins</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN__SUCCESSIVE_FAILED_LOGINS = eINSTANCE.getUserLogin_SuccessiveFailedLogins();

		/**
		 * The meta object literal for the '<em><b>User Ldap Dn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN__USER_LDAP_DN = eINSTANCE.getUserLogin_UserLdapDn();

		/**
		 * The meta object literal for the '<em><b>User Login Histories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_LOGIN__USER_LOGIN_HISTORIES = eINSTANCE.getUserLogin_UserLoginHistories();

		/**
		 * The meta object literal for the '<em><b>User Login Password Histories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_LOGIN__USER_LOGIN_PASSWORD_HISTORIES = eINSTANCE.getUserLogin_UserLoginPasswordHistories();

		/**
		 * The meta object literal for the '<em><b>User Preferences</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_LOGIN__USER_PREFERENCES = eINSTANCE.getUserLogin_UserPreferences();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.security.login.impl.UserLoginHistoryImpl <em>User Login History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.security.login.impl.UserLoginHistoryImpl
		 * @see org.abchip.mimo.biz.security.login.impl.LoginPackageImpl#getUserLoginHistory()
		 * @generated
		 */
		EClass USER_LOGIN_HISTORY = eINSTANCE.getUserLoginHistory();

		/**
		 * The meta object literal for the '<em><b>User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_LOGIN_HISTORY__USER_LOGIN_ID = eINSTANCE.getUserLoginHistory_UserLoginId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN_HISTORY__FROM_DATE = eINSTANCE.getUserLoginHistory_FromDate();

		/**
		 * The meta object literal for the '<em><b>Origin User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_LOGIN_HISTORY__ORIGIN_USER_LOGIN_ID = eINSTANCE.getUserLoginHistory_OriginUserLoginId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_LOGIN_HISTORY__PARTY_ID = eINSTANCE.getUserLoginHistory_PartyId();

		/**
		 * The meta object literal for the '<em><b>Password Used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN_HISTORY__PASSWORD_USED = eINSTANCE.getUserLoginHistory_PasswordUsed();

		/**
		 * The meta object literal for the '<em><b>Successful Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN_HISTORY__SUCCESSFUL_LOGIN = eINSTANCE.getUserLoginHistory_SuccessfulLogin();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN_HISTORY__THRU_DATE = eINSTANCE.getUserLoginHistory_ThruDate();

		/**
		 * The meta object literal for the '<em><b>Visit Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN_HISTORY__VISIT_ID = eINSTANCE.getUserLoginHistory_VisitId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.security.login.impl.UserLoginPasswordHistoryImpl <em>User Login Password History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.security.login.impl.UserLoginPasswordHistoryImpl
		 * @see org.abchip.mimo.biz.security.login.impl.LoginPackageImpl#getUserLoginPasswordHistory()
		 * @generated
		 */
		EClass USER_LOGIN_PASSWORD_HISTORY = eINSTANCE.getUserLoginPasswordHistory();

		/**
		 * The meta object literal for the '<em><b>User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_LOGIN_PASSWORD_HISTORY__USER_LOGIN_ID = eINSTANCE.getUserLoginPasswordHistory_UserLoginId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN_PASSWORD_HISTORY__FROM_DATE = eINSTANCE.getUserLoginPasswordHistory_FromDate();

		/**
		 * The meta object literal for the '<em><b>Current Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN_PASSWORD_HISTORY__CURRENT_PASSWORD = eINSTANCE.getUserLoginPasswordHistory_CurrentPassword();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN_PASSWORD_HISTORY__THRU_DATE = eINSTANCE.getUserLoginPasswordHistory_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.security.login.impl.UserLoginSecurityQuestionImpl <em>User Login Security Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.security.login.impl.UserLoginSecurityQuestionImpl
		 * @see org.abchip.mimo.biz.security.login.impl.LoginPackageImpl#getUserLoginSecurityQuestion()
		 * @generated
		 */
		EClass USER_LOGIN_SECURITY_QUESTION = eINSTANCE.getUserLoginSecurityQuestion();

		/**
		 * The meta object literal for the '<em><b>Question Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_LOGIN_SECURITY_QUESTION__QUESTION_ENUM_ID = eINSTANCE.getUserLoginSecurityQuestion_QuestionEnumId();

		/**
		 * The meta object literal for the '<em><b>User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_LOGIN_SECURITY_QUESTION__USER_LOGIN_ID = eINSTANCE.getUserLoginSecurityQuestion_UserLoginId();

		/**
		 * The meta object literal for the '<em><b>Security Answer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN_SECURITY_QUESTION__SECURITY_ANSWER = eINSTANCE.getUserLoginSecurityQuestion_SecurityAnswer();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.security.login.impl.UserLoginSessionImpl <em>User Login Session</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.security.login.impl.UserLoginSessionImpl
		 * @see org.abchip.mimo.biz.security.login.impl.LoginPackageImpl#getUserLoginSession()
		 * @generated
		 */
		EClass USER_LOGIN_SESSION = eINSTANCE.getUserLoginSession();

		/**
		 * The meta object literal for the '<em><b>User Login Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN_SESSION__USER_LOGIN_ID = eINSTANCE.getUserLoginSession_UserLoginId();

		/**
		 * The meta object literal for the '<em><b>Saved Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN_SESSION__SAVED_DATE = eINSTANCE.getUserLoginSession_SavedDate();

		/**
		 * The meta object literal for the '<em><b>Session Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN_SESSION__SESSION_DATA = eINSTANCE.getUserLoginSession_SessionData();

	}

} //LoginPackage
