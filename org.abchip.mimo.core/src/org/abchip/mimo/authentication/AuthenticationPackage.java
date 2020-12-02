/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.authentication;

import org.abchip.mimo.context.ContextPackage;
import org.abchip.mimo.entity.EntityPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.abchip.mimo.authentication.AuthenticationFactory
 * @model kind="package"
 * @generated
 */
public interface AuthenticationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "authentication";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/authentication";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mimo-auth";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AuthenticationPackage eINSTANCE = org.abchip.mimo.authentication.impl.AuthenticationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.authentication.Authentication <em>Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.authentication.Authentication
	 * @see org.abchip.mimo.authentication.impl.AuthenticationPackageImpl#getAuthentication()
	 * @generated
	 */
	int AUTHENTICATION = 0;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__TENANT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.authentication.impl.AuthenticationAdminKeyImpl <em>Admin Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.authentication.impl.AuthenticationAdminKeyImpl
	 * @see org.abchip.mimo.authentication.impl.AuthenticationPackageImpl#getAuthenticationAdminKey()
	 * @generated
	 */
	int AUTHENTICATION_ADMIN_KEY = 1;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ADMIN_KEY__TENANT = AUTHENTICATION__TENANT;

	/**
	 * The feature id for the '<em><b>Admin Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ADMIN_KEY__ADMIN_KEY = AUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Admin Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ADMIN_KEY_FEATURE_COUNT = AUTHENTICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.authentication.impl.AuthenticationAnonymousImpl <em>Anonymous</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.authentication.impl.AuthenticationAnonymousImpl
	 * @see org.abchip.mimo.authentication.impl.AuthenticationPackageImpl#getAuthenticationAnonymous()
	 * @generated
	 */
	int AUTHENTICATION_ANONYMOUS = 2;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ANONYMOUS__TENANT = AUTHENTICATION__TENANT;

	/**
	 * The number of structural features of the '<em>Anonymous</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ANONYMOUS_FEATURE_COUNT = AUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.authentication.AuthenticationManager <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.authentication.AuthenticationManager
	 * @see org.abchip.mimo.authentication.impl.AuthenticationPackageImpl#getAuthenticationManager()
	 * @generated
	 */
	int AUTHENTICATION_MANAGER = 3;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.authentication.impl.AuthenticationUserPasswordImpl <em>User Password</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.authentication.impl.AuthenticationUserPasswordImpl
	 * @see org.abchip.mimo.authentication.impl.AuthenticationPackageImpl#getAuthenticationUserPassword()
	 * @generated
	 */
	int AUTHENTICATION_USER_PASSWORD = 4;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_PASSWORD__TENANT = AUTHENTICATION__TENANT;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_PASSWORD__USER = AUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_PASSWORD__PASSWORD = AUTHENTICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User Password</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_PASSWORD_FEATURE_COUNT = AUTHENTICATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.authentication.impl.AuthenticationUserTokenImpl <em>User Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.authentication.impl.AuthenticationUserTokenImpl
	 * @see org.abchip.mimo.authentication.impl.AuthenticationPackageImpl#getAuthenticationUserToken()
	 * @generated
	 */
	int AUTHENTICATION_USER_TOKEN = 5;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_TOKEN__TENANT = AUTHENTICATION__TENANT;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_TOKEN__PROVIDER = AUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_TOKEN__ACCESS_TOKEN = AUTHENTICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_TOKEN__ID_TOKEN = AUTHENTICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Picture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_TOKEN__PICTURE = AUTHENTICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_TOKEN__USER = AUTHENTICATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>User Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_USER_TOKEN_FEATURE_COUNT = AUTHENTICATION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.authentication.impl.AuthenticationProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.authentication.impl.AuthenticationProviderImpl
	 * @see org.abchip.mimo.authentication.impl.AuthenticationPackageImpl#getAuthenticationProvider()
	 * @generated
	 */
	int AUTHENTICATION_PROVIDER = 6;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.authentication.AuthenticationProviderRegistry <em>Provider Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.authentication.AuthenticationProviderRegistry
	 * @see org.abchip.mimo.authentication.impl.AuthenticationPackageImpl#getAuthenticationProviderRegistry()
	 * @generated
	 */
	int AUTHENTICATION_PROVIDER_REGISTRY = 7;

	/**
	 * The number of structural features of the '<em>Provider Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_PROVIDER_REGISTRY_FEATURE_COUNT = ContextPackage.REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.authentication.impl.OAuth2Impl <em>OAuth2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.authentication.impl.OAuth2Impl
	 * @see org.abchip.mimo.authentication.impl.AuthenticationPackageImpl#getOAuth2()
	 * @generated
	 */
	int OAUTH2 = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Icon Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2__ICON_URL = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Local Redirect Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2__LOCAL_REDIRECT_URI = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>OAuth2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.authentication.AuthenticationException
	 * @see org.abchip.mimo.authentication.impl.AuthenticationPackageImpl#getAuthenticationException()
	 * @generated
	 */
	int AUTHENTICATION_EXCEPTION = 9;

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.authentication.Authentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication</em>'.
	 * @see org.abchip.mimo.authentication.Authentication
	 * @generated
	 */
	EClass getAuthentication();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.authentication.Authentication#getTenant <em>Tenant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant</em>'.
	 * @see org.abchip.mimo.authentication.Authentication#getTenant()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_Tenant();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.authentication.AuthenticationAdminKey <em>Admin Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin Key</em>'.
	 * @see org.abchip.mimo.authentication.AuthenticationAdminKey
	 * @generated
	 */
	EClass getAuthenticationAdminKey();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.authentication.AuthenticationAdminKey#getAdminKey <em>Admin Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin Key</em>'.
	 * @see org.abchip.mimo.authentication.AuthenticationAdminKey#getAdminKey()
	 * @see #getAuthenticationAdminKey()
	 * @generated
	 */
	EAttribute getAuthenticationAdminKey_AdminKey();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.authentication.AuthenticationAnonymous <em>Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymous</em>'.
	 * @see org.abchip.mimo.authentication.AuthenticationAnonymous
	 * @generated
	 */
	EClass getAuthenticationAnonymous();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.authentication.AuthenticationManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see org.abchip.mimo.authentication.AuthenticationManager
	 * @generated
	 */
	EClass getAuthenticationManager();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.authentication.AuthenticationUserPassword <em>User Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Password</em>'.
	 * @see org.abchip.mimo.authentication.AuthenticationUserPassword
	 * @generated
	 */
	EClass getAuthenticationUserPassword();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.authentication.AuthenticationUserPassword#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.abchip.mimo.authentication.AuthenticationUserPassword#getUser()
	 * @see #getAuthenticationUserPassword()
	 * @generated
	 */
	EAttribute getAuthenticationUserPassword_User();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.authentication.AuthenticationUserPassword#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.abchip.mimo.authentication.AuthenticationUserPassword#getPassword()
	 * @see #getAuthenticationUserPassword()
	 * @generated
	 */
	EAttribute getAuthenticationUserPassword_Password();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.authentication.AuthenticationUserToken <em>User Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Token</em>'.
	 * @see org.abchip.mimo.authentication.AuthenticationUserToken
	 * @generated
	 */
	EClass getAuthenticationUserToken();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.authentication.AuthenticationUserToken#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.abchip.mimo.authentication.AuthenticationUserToken#getProvider()
	 * @see #getAuthenticationUserToken()
	 * @generated
	 */
	EAttribute getAuthenticationUserToken_Provider();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.authentication.AuthenticationUserToken#getAccessToken <em>Access Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Token</em>'.
	 * @see org.abchip.mimo.authentication.AuthenticationUserToken#getAccessToken()
	 * @see #getAuthenticationUserToken()
	 * @generated
	 */
	EAttribute getAuthenticationUserToken_AccessToken();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.authentication.AuthenticationUserToken#getIdToken <em>Id Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Token</em>'.
	 * @see org.abchip.mimo.authentication.AuthenticationUserToken#getIdToken()
	 * @see #getAuthenticationUserToken()
	 * @generated
	 */
	EAttribute getAuthenticationUserToken_IdToken();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.authentication.AuthenticationUserToken#getPicture <em>Picture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Picture</em>'.
	 * @see org.abchip.mimo.authentication.AuthenticationUserToken#getPicture()
	 * @see #getAuthenticationUserToken()
	 * @generated
	 */
	EAttribute getAuthenticationUserToken_Picture();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.authentication.AuthenticationUserToken#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.abchip.mimo.authentication.AuthenticationUserToken#getUser()
	 * @see #getAuthenticationUserToken()
	 * @generated
	 */
	EAttribute getAuthenticationUserToken_User();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.authentication.AuthenticationProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see org.abchip.mimo.authentication.AuthenticationProvider
	 * @generated
	 */
	EClass getAuthenticationProvider();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.authentication.AuthenticationProviderRegistry <em>Provider Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider Registry</em>'.
	 * @see org.abchip.mimo.authentication.AuthenticationProviderRegistry
	 * @generated
	 */
	EClass getAuthenticationProviderRegistry();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.authentication.OAuth2 <em>OAuth2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OAuth2</em>'.
	 * @see org.abchip.mimo.authentication.OAuth2
	 * @generated
	 */
	EClass getOAuth2();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.authentication.OAuth2#getIconUrl <em>Icon Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Url</em>'.
	 * @see org.abchip.mimo.authentication.OAuth2#getIconUrl()
	 * @see #getOAuth2()
	 * @generated
	 */
	EAttribute getOAuth2_IconUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.authentication.OAuth2#getLocalRedirectUri <em>Local Redirect Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Redirect Uri</em>'.
	 * @see org.abchip.mimo.authentication.OAuth2#getLocalRedirectUri()
	 * @see #getOAuth2()
	 * @generated
	 */
	EAttribute getOAuth2_LocalRedirectUri();

	/**
	 * Returns the meta object for data type '{@link org.abchip.mimo.authentication.AuthenticationException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see org.abchip.mimo.authentication.AuthenticationException
	 * @model instanceClass="org.abchip.mimo.authentication.AuthenticationException"
	 * @generated
	 */
	EDataType getAuthenticationException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AuthenticationFactory getAuthenticationFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.authentication.Authentication <em>Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.authentication.Authentication
		 * @see org.abchip.mimo.authentication.impl.AuthenticationPackageImpl#getAuthentication()
		 * @generated
		 */
		EClass AUTHENTICATION = eINSTANCE.getAuthentication();
		/**
		 * The meta object literal for the '<em><b>Tenant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__TENANT = eINSTANCE.getAuthentication_Tenant();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.authentication.impl.AuthenticationAdminKeyImpl <em>Admin Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.authentication.impl.AuthenticationAdminKeyImpl
		 * @see org.abchip.mimo.authentication.impl.AuthenticationPackageImpl#getAuthenticationAdminKey()
		 * @generated
		 */
		EClass AUTHENTICATION_ADMIN_KEY = eINSTANCE.getAuthenticationAdminKey();
		/**
		 * The meta object literal for the '<em><b>Admin Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_ADMIN_KEY__ADMIN_KEY = eINSTANCE.getAuthenticationAdminKey_AdminKey();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.authentication.impl.AuthenticationAnonymousImpl <em>Anonymous</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.authentication.impl.AuthenticationAnonymousImpl
		 * @see org.abchip.mimo.authentication.impl.AuthenticationPackageImpl#getAuthenticationAnonymous()
		 * @generated
		 */
		EClass AUTHENTICATION_ANONYMOUS = eINSTANCE.getAuthenticationAnonymous();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.authentication.AuthenticationManager <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.authentication.AuthenticationManager
		 * @see org.abchip.mimo.authentication.impl.AuthenticationPackageImpl#getAuthenticationManager()
		 * @generated
		 */
		EClass AUTHENTICATION_MANAGER = eINSTANCE.getAuthenticationManager();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.authentication.impl.AuthenticationUserPasswordImpl <em>User Password</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.authentication.impl.AuthenticationUserPasswordImpl
		 * @see org.abchip.mimo.authentication.impl.AuthenticationPackageImpl#getAuthenticationUserPassword()
		 * @generated
		 */
		EClass AUTHENTICATION_USER_PASSWORD = eINSTANCE.getAuthenticationUserPassword();
		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_USER_PASSWORD__USER = eINSTANCE.getAuthenticationUserPassword_User();
		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_USER_PASSWORD__PASSWORD = eINSTANCE.getAuthenticationUserPassword_Password();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.authentication.impl.AuthenticationUserTokenImpl <em>User Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.authentication.impl.AuthenticationUserTokenImpl
		 * @see org.abchip.mimo.authentication.impl.AuthenticationPackageImpl#getAuthenticationUserToken()
		 * @generated
		 */
		EClass AUTHENTICATION_USER_TOKEN = eINSTANCE.getAuthenticationUserToken();
		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_USER_TOKEN__PROVIDER = eINSTANCE.getAuthenticationUserToken_Provider();
		/**
		 * The meta object literal for the '<em><b>Access Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_USER_TOKEN__ACCESS_TOKEN = eINSTANCE.getAuthenticationUserToken_AccessToken();
		/**
		 * The meta object literal for the '<em><b>Id Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_USER_TOKEN__ID_TOKEN = eINSTANCE.getAuthenticationUserToken_IdToken();
		/**
		 * The meta object literal for the '<em><b>Picture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_USER_TOKEN__PICTURE = eINSTANCE.getAuthenticationUserToken_Picture();
		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_USER_TOKEN__USER = eINSTANCE.getAuthenticationUserToken_User();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.authentication.impl.AuthenticationProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.authentication.impl.AuthenticationProviderImpl
		 * @see org.abchip.mimo.authentication.impl.AuthenticationPackageImpl#getAuthenticationProvider()
		 * @generated
		 */
		EClass AUTHENTICATION_PROVIDER = eINSTANCE.getAuthenticationProvider();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.authentication.AuthenticationProviderRegistry <em>Provider Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.authentication.AuthenticationProviderRegistry
		 * @see org.abchip.mimo.authentication.impl.AuthenticationPackageImpl#getAuthenticationProviderRegistry()
		 * @generated
		 */
		EClass AUTHENTICATION_PROVIDER_REGISTRY = eINSTANCE.getAuthenticationProviderRegistry();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.authentication.impl.OAuth2Impl <em>OAuth2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.authentication.impl.OAuth2Impl
		 * @see org.abchip.mimo.authentication.impl.AuthenticationPackageImpl#getOAuth2()
		 * @generated
		 */
		EClass OAUTH2 = eINSTANCE.getOAuth2();
		/**
		 * The meta object literal for the '<em><b>Icon Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2__ICON_URL = eINSTANCE.getOAuth2_IconUrl();
		/**
		 * The meta object literal for the '<em><b>Local Redirect Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2__LOCAL_REDIRECT_URI = eINSTANCE.getOAuth2_LocalRedirectUri();
		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.authentication.AuthenticationException
		 * @see org.abchip.mimo.authentication.impl.AuthenticationPackageImpl#getAuthenticationException()
		 * @generated
		 */
		EDataType AUTHENTICATION_EXCEPTION = eINSTANCE.getAuthenticationException();

	}

} //AuthenticationPackage
