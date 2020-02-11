/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.passport;

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
 * @see org.abchip.mimo.biz.passport.PassportFactory
 * @model kind="package"
 * @generated
 */
public interface PassportPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "passport";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/passport";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-passport";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PassportPackage eINSTANCE = org.abchip.mimo.biz.passport.impl.PassportPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.passport.impl.GitHubUserImpl <em>Git Hub User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.passport.impl.GitHubUserImpl
	 * @see org.abchip.mimo.biz.passport.impl.PassportPackageImpl#getGitHubUser()
	 * @generated
	 */
	int GIT_HUB_USER = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_USER__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_USER__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_USER__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_USER__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Git Hub User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_USER__GIT_HUB_USER_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_USER__ACCESS_TOKEN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Env Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_USER__ENV_PREFIX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_USER__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Token Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_USER__TOKEN_TYPE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Git Hub User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_USER_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.passport.impl.GoogleUserImpl <em>Google User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.passport.impl.GoogleUserImpl
	 * @see org.abchip.mimo.biz.passport.impl.PassportPackageImpl#getGoogleUser()
	 * @generated
	 */
	int GOOGLE_USER = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_USER__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_USER__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_USER__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_USER__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Google User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_USER__GOOGLE_USER_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_USER__ACCESS_TOKEN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Env Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_USER__ENV_PREFIX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_USER__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Token Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_USER__TOKEN_TYPE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Google User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_USER_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.passport.impl.LinkedInUserImpl <em>Linked In User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.passport.impl.LinkedInUserImpl
	 * @see org.abchip.mimo.biz.passport.impl.PassportPackageImpl#getLinkedInUser()
	 * @generated
	 */
	int LINKED_IN_USER = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_IN_USER__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_IN_USER__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_IN_USER__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_IN_USER__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Linked In User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_IN_USER__LINKED_IN_USER_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_IN_USER__ACCESS_TOKEN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Env Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_IN_USER__ENV_PREFIX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_IN_USER__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Linked In User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_IN_USER_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.passport.impl.OAuth2GitHubImpl <em>OAuth2 Git Hub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.passport.impl.OAuth2GitHubImpl
	 * @see org.abchip.mimo.biz.passport.impl.PassportPackageImpl#getOAuth2GitHub()
	 * @generated
	 */
	int OAUTH2_GIT_HUB = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GIT_HUB__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GIT_HUB__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GIT_HUB__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GIT_HUB__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GIT_HUB__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GIT_HUB__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Client Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GIT_HUB__CLIENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Client Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GIT_HUB__CLIENT_SECRET = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Icon Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GIT_HUB__ICON_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Local Redirect Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GIT_HUB__LOCAL_REDIRECT_URI = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Return Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GIT_HUB__RETURN_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GIT_HUB__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>OAuth2 Git Hub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GIT_HUB_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.passport.impl.OAuth2GoogleImpl <em>OAuth2 Google</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.passport.impl.OAuth2GoogleImpl
	 * @see org.abchip.mimo.biz.passport.impl.PassportPackageImpl#getOAuth2Google()
	 * @generated
	 */
	int OAUTH2_GOOGLE = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GOOGLE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GOOGLE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GOOGLE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GOOGLE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GOOGLE__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GOOGLE__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Client Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GOOGLE__CLIENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Client Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GOOGLE__CLIENT_SECRET = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Icon Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GOOGLE__ICON_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Local Redirect Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GOOGLE__LOCAL_REDIRECT_URI = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Return Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GOOGLE__RETURN_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GOOGLE__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>OAuth2 Google</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GOOGLE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.passport.impl.OAuth2LinkedInImpl <em>OAuth2 Linked In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.passport.impl.OAuth2LinkedInImpl
	 * @see org.abchip.mimo.biz.passport.impl.PassportPackageImpl#getOAuth2LinkedIn()
	 * @generated
	 */
	int OAUTH2_LINKED_IN = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_LINKED_IN__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_LINKED_IN__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_LINKED_IN__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_LINKED_IN__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_LINKED_IN__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_LINKED_IN__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Api Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_LINKED_IN__API_KEY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Icon Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_LINKED_IN__ICON_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Live Return Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_LINKED_IN__LIVE_RETURN_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Local Redirect Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_LINKED_IN__LOCAL_REDIRECT_URI = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Secret Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_LINKED_IN__SECRET_KEY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Test Return Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_LINKED_IN__TEST_RETURN_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_LINKED_IN__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>OAuth2 Linked In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_LINKED_IN_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.passport.impl.ThirdPartyLoginImpl <em>Third Party Login</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.passport.impl.ThirdPartyLoginImpl
	 * @see org.abchip.mimo.biz.passport.impl.PassportPackageImpl#getThirdPartyLogin()
	 * @generated
	 */
	int THIRD_PARTY_LOGIN = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_LOGIN__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_LOGIN__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_LOGIN__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_LOGIN__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_LOGIN__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_LOGIN__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Login Meth Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_LOGIN__LOGIN_METH_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Login Provider Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_LOGIN__LOGIN_PROVIDER_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_LOGIN__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_LOGIN__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Third Party Login</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_LOGIN_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.passport.GitHubUser <em>Git Hub User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Git Hub User</em>'.
	 * @see org.abchip.mimo.biz.passport.GitHubUser
	 * @generated
	 */
	EClass getGitHubUser();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.GitHubUser#getGitHubUserId <em>Git Hub User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Git Hub User Id</em>'.
	 * @see org.abchip.mimo.biz.passport.GitHubUser#getGitHubUserId()
	 * @see #getGitHubUser()
	 * @generated
	 */
	EAttribute getGitHubUser_GitHubUserId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.GitHubUser#getAccessToken <em>Access Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Token</em>'.
	 * @see org.abchip.mimo.biz.passport.GitHubUser#getAccessToken()
	 * @see #getGitHubUser()
	 * @generated
	 */
	EAttribute getGitHubUser_AccessToken();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.GitHubUser#getEnvPrefix <em>Env Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Env Prefix</em>'.
	 * @see org.abchip.mimo.biz.passport.GitHubUser#getEnvPrefix()
	 * @see #getGitHubUser()
	 * @generated
	 */
	EAttribute getGitHubUser_EnvPrefix();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.passport.GitHubUser#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.passport.GitHubUser#getProductStoreId()
	 * @see #getGitHubUser()
	 * @generated
	 */
	EReference getGitHubUser_ProductStoreId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.GitHubUser#getTokenType <em>Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token Type</em>'.
	 * @see org.abchip.mimo.biz.passport.GitHubUser#getTokenType()
	 * @see #getGitHubUser()
	 * @generated
	 */
	EAttribute getGitHubUser_TokenType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.passport.GoogleUser <em>Google User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Google User</em>'.
	 * @see org.abchip.mimo.biz.passport.GoogleUser
	 * @generated
	 */
	EClass getGoogleUser();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.GoogleUser#getGoogleUserId <em>Google User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Google User Id</em>'.
	 * @see org.abchip.mimo.biz.passport.GoogleUser#getGoogleUserId()
	 * @see #getGoogleUser()
	 * @generated
	 */
	EAttribute getGoogleUser_GoogleUserId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.GoogleUser#getAccessToken <em>Access Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Token</em>'.
	 * @see org.abchip.mimo.biz.passport.GoogleUser#getAccessToken()
	 * @see #getGoogleUser()
	 * @generated
	 */
	EAttribute getGoogleUser_AccessToken();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.GoogleUser#getEnvPrefix <em>Env Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Env Prefix</em>'.
	 * @see org.abchip.mimo.biz.passport.GoogleUser#getEnvPrefix()
	 * @see #getGoogleUser()
	 * @generated
	 */
	EAttribute getGoogleUser_EnvPrefix();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.passport.GoogleUser#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.passport.GoogleUser#getProductStoreId()
	 * @see #getGoogleUser()
	 * @generated
	 */
	EReference getGoogleUser_ProductStoreId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.GoogleUser#getTokenType <em>Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token Type</em>'.
	 * @see org.abchip.mimo.biz.passport.GoogleUser#getTokenType()
	 * @see #getGoogleUser()
	 * @generated
	 */
	EAttribute getGoogleUser_TokenType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.passport.LinkedInUser <em>Linked In User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linked In User</em>'.
	 * @see org.abchip.mimo.biz.passport.LinkedInUser
	 * @generated
	 */
	EClass getLinkedInUser();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.LinkedInUser#getLinkedInUserId <em>Linked In User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linked In User Id</em>'.
	 * @see org.abchip.mimo.biz.passport.LinkedInUser#getLinkedInUserId()
	 * @see #getLinkedInUser()
	 * @generated
	 */
	EAttribute getLinkedInUser_LinkedInUserId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.LinkedInUser#getAccessToken <em>Access Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Token</em>'.
	 * @see org.abchip.mimo.biz.passport.LinkedInUser#getAccessToken()
	 * @see #getLinkedInUser()
	 * @generated
	 */
	EAttribute getLinkedInUser_AccessToken();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.LinkedInUser#getEnvPrefix <em>Env Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Env Prefix</em>'.
	 * @see org.abchip.mimo.biz.passport.LinkedInUser#getEnvPrefix()
	 * @see #getLinkedInUser()
	 * @generated
	 */
	EAttribute getLinkedInUser_EnvPrefix();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.passport.LinkedInUser#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.passport.LinkedInUser#getProductStoreId()
	 * @see #getLinkedInUser()
	 * @generated
	 */
	EReference getLinkedInUser_ProductStoreId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.passport.OAuth2GitHub <em>OAuth2 Git Hub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OAuth2 Git Hub</em>'.
	 * @see org.abchip.mimo.biz.passport.OAuth2GitHub
	 * @generated
	 */
	EClass getOAuth2GitHub();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.passport.OAuth2GitHub#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.passport.OAuth2GitHub#getProductStoreId()
	 * @see #getOAuth2GitHub()
	 * @generated
	 */
	EReference getOAuth2GitHub_ProductStoreId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.OAuth2GitHub#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.passport.OAuth2GitHub#getFromDate()
	 * @see #getOAuth2GitHub()
	 * @generated
	 */
	EAttribute getOAuth2GitHub_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.OAuth2GitHub#getClientId <em>Client Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Id</em>'.
	 * @see org.abchip.mimo.biz.passport.OAuth2GitHub#getClientId()
	 * @see #getOAuth2GitHub()
	 * @generated
	 */
	EAttribute getOAuth2GitHub_ClientId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.OAuth2GitHub#getClientSecret <em>Client Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Secret</em>'.
	 * @see org.abchip.mimo.biz.passport.OAuth2GitHub#getClientSecret()
	 * @see #getOAuth2GitHub()
	 * @generated
	 */
	EAttribute getOAuth2GitHub_ClientSecret();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.OAuth2GitHub#getIconUrl <em>Icon Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Url</em>'.
	 * @see org.abchip.mimo.biz.passport.OAuth2GitHub#getIconUrl()
	 * @see #getOAuth2GitHub()
	 * @generated
	 */
	EAttribute getOAuth2GitHub_IconUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.OAuth2GitHub#getLocalRedirectUri <em>Local Redirect Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Redirect Uri</em>'.
	 * @see org.abchip.mimo.biz.passport.OAuth2GitHub#getLocalRedirectUri()
	 * @see #getOAuth2GitHub()
	 * @generated
	 */
	EAttribute getOAuth2GitHub_LocalRedirectUri();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.OAuth2GitHub#getReturnUrl <em>Return Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Url</em>'.
	 * @see org.abchip.mimo.biz.passport.OAuth2GitHub#getReturnUrl()
	 * @see #getOAuth2GitHub()
	 * @generated
	 */
	EAttribute getOAuth2GitHub_ReturnUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.OAuth2GitHub#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.passport.OAuth2GitHub#getThruDate()
	 * @see #getOAuth2GitHub()
	 * @generated
	 */
	EAttribute getOAuth2GitHub_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.passport.OAuth2Google <em>OAuth2 Google</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OAuth2 Google</em>'.
	 * @see org.abchip.mimo.biz.passport.OAuth2Google
	 * @generated
	 */
	EClass getOAuth2Google();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.passport.OAuth2Google#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.passport.OAuth2Google#getProductStoreId()
	 * @see #getOAuth2Google()
	 * @generated
	 */
	EReference getOAuth2Google_ProductStoreId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.OAuth2Google#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.passport.OAuth2Google#getFromDate()
	 * @see #getOAuth2Google()
	 * @generated
	 */
	EAttribute getOAuth2Google_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.OAuth2Google#getClientId <em>Client Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Id</em>'.
	 * @see org.abchip.mimo.biz.passport.OAuth2Google#getClientId()
	 * @see #getOAuth2Google()
	 * @generated
	 */
	EAttribute getOAuth2Google_ClientId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.OAuth2Google#getClientSecret <em>Client Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Secret</em>'.
	 * @see org.abchip.mimo.biz.passport.OAuth2Google#getClientSecret()
	 * @see #getOAuth2Google()
	 * @generated
	 */
	EAttribute getOAuth2Google_ClientSecret();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.OAuth2Google#getIconUrl <em>Icon Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Url</em>'.
	 * @see org.abchip.mimo.biz.passport.OAuth2Google#getIconUrl()
	 * @see #getOAuth2Google()
	 * @generated
	 */
	EAttribute getOAuth2Google_IconUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.OAuth2Google#getLocalRedirectUri <em>Local Redirect Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Redirect Uri</em>'.
	 * @see org.abchip.mimo.biz.passport.OAuth2Google#getLocalRedirectUri()
	 * @see #getOAuth2Google()
	 * @generated
	 */
	EAttribute getOAuth2Google_LocalRedirectUri();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.OAuth2Google#getReturnUrl <em>Return Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Url</em>'.
	 * @see org.abchip.mimo.biz.passport.OAuth2Google#getReturnUrl()
	 * @see #getOAuth2Google()
	 * @generated
	 */
	EAttribute getOAuth2Google_ReturnUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.OAuth2Google#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.passport.OAuth2Google#getThruDate()
	 * @see #getOAuth2Google()
	 * @generated
	 */
	EAttribute getOAuth2Google_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.passport.OAuth2LinkedIn <em>OAuth2 Linked In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OAuth2 Linked In</em>'.
	 * @see org.abchip.mimo.biz.passport.OAuth2LinkedIn
	 * @generated
	 */
	EClass getOAuth2LinkedIn();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.passport.OAuth2LinkedIn#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.passport.OAuth2LinkedIn#getProductStoreId()
	 * @see #getOAuth2LinkedIn()
	 * @generated
	 */
	EReference getOAuth2LinkedIn_ProductStoreId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.OAuth2LinkedIn#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.passport.OAuth2LinkedIn#getFromDate()
	 * @see #getOAuth2LinkedIn()
	 * @generated
	 */
	EAttribute getOAuth2LinkedIn_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.OAuth2LinkedIn#getApiKey <em>Api Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Key</em>'.
	 * @see org.abchip.mimo.biz.passport.OAuth2LinkedIn#getApiKey()
	 * @see #getOAuth2LinkedIn()
	 * @generated
	 */
	EAttribute getOAuth2LinkedIn_ApiKey();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.OAuth2LinkedIn#getIconUrl <em>Icon Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Url</em>'.
	 * @see org.abchip.mimo.biz.passport.OAuth2LinkedIn#getIconUrl()
	 * @see #getOAuth2LinkedIn()
	 * @generated
	 */
	EAttribute getOAuth2LinkedIn_IconUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.OAuth2LinkedIn#getLiveReturnUrl <em>Live Return Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Live Return Url</em>'.
	 * @see org.abchip.mimo.biz.passport.OAuth2LinkedIn#getLiveReturnUrl()
	 * @see #getOAuth2LinkedIn()
	 * @generated
	 */
	EAttribute getOAuth2LinkedIn_LiveReturnUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.OAuth2LinkedIn#getLocalRedirectUri <em>Local Redirect Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Redirect Uri</em>'.
	 * @see org.abchip.mimo.biz.passport.OAuth2LinkedIn#getLocalRedirectUri()
	 * @see #getOAuth2LinkedIn()
	 * @generated
	 */
	EAttribute getOAuth2LinkedIn_LocalRedirectUri();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.OAuth2LinkedIn#getSecretKey <em>Secret Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secret Key</em>'.
	 * @see org.abchip.mimo.biz.passport.OAuth2LinkedIn#getSecretKey()
	 * @see #getOAuth2LinkedIn()
	 * @generated
	 */
	EAttribute getOAuth2LinkedIn_SecretKey();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.OAuth2LinkedIn#getTestReturnUrl <em>Test Return Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Return Url</em>'.
	 * @see org.abchip.mimo.biz.passport.OAuth2LinkedIn#getTestReturnUrl()
	 * @see #getOAuth2LinkedIn()
	 * @generated
	 */
	EAttribute getOAuth2LinkedIn_TestReturnUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.OAuth2LinkedIn#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.passport.OAuth2LinkedIn#getThruDate()
	 * @see #getOAuth2LinkedIn()
	 * @generated
	 */
	EAttribute getOAuth2LinkedIn_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.passport.ThirdPartyLogin <em>Third Party Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Third Party Login</em>'.
	 * @see org.abchip.mimo.biz.passport.ThirdPartyLogin
	 * @generated
	 */
	EClass getThirdPartyLogin();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.passport.ThirdPartyLogin#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.passport.ThirdPartyLogin#getProductStoreId()
	 * @see #getThirdPartyLogin()
	 * @generated
	 */
	EReference getThirdPartyLogin_ProductStoreId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.ThirdPartyLogin#getLoginMethTypeId <em>Login Meth Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login Meth Type Id</em>'.
	 * @see org.abchip.mimo.biz.passport.ThirdPartyLogin#getLoginMethTypeId()
	 * @see #getThirdPartyLogin()
	 * @generated
	 */
	EAttribute getThirdPartyLogin_LoginMethTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.ThirdPartyLogin#getLoginProviderId <em>Login Provider Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login Provider Id</em>'.
	 * @see org.abchip.mimo.biz.passport.ThirdPartyLogin#getLoginProviderId()
	 * @see #getThirdPartyLogin()
	 * @generated
	 */
	EAttribute getThirdPartyLogin_LoginProviderId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.ThirdPartyLogin#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.passport.ThirdPartyLogin#getFromDate()
	 * @see #getThirdPartyLogin()
	 * @generated
	 */
	EAttribute getThirdPartyLogin_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.ThirdPartyLogin#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.passport.ThirdPartyLogin#getSequenceNum()
	 * @see #getThirdPartyLogin()
	 * @generated
	 */
	EAttribute getThirdPartyLogin_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.passport.ThirdPartyLogin#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.passport.ThirdPartyLogin#getThruDate()
	 * @see #getThirdPartyLogin()
	 * @generated
	 */
	EAttribute getThirdPartyLogin_ThruDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PassportFactory getPassportFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.passport.impl.GitHubUserImpl <em>Git Hub User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.passport.impl.GitHubUserImpl
		 * @see org.abchip.mimo.biz.passport.impl.PassportPackageImpl#getGitHubUser()
		 * @generated
		 */
		EClass GIT_HUB_USER = eINSTANCE.getGitHubUser();

		/**
		 * The meta object literal for the '<em><b>Git Hub User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_HUB_USER__GIT_HUB_USER_ID = eINSTANCE.getGitHubUser_GitHubUserId();

		/**
		 * The meta object literal for the '<em><b>Access Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_HUB_USER__ACCESS_TOKEN = eINSTANCE.getGitHubUser_AccessToken();

		/**
		 * The meta object literal for the '<em><b>Env Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_HUB_USER__ENV_PREFIX = eINSTANCE.getGitHubUser_EnvPrefix();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIT_HUB_USER__PRODUCT_STORE_ID = eINSTANCE.getGitHubUser_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>Token Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_HUB_USER__TOKEN_TYPE = eINSTANCE.getGitHubUser_TokenType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.passport.impl.GoogleUserImpl <em>Google User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.passport.impl.GoogleUserImpl
		 * @see org.abchip.mimo.biz.passport.impl.PassportPackageImpl#getGoogleUser()
		 * @generated
		 */
		EClass GOOGLE_USER = eINSTANCE.getGoogleUser();

		/**
		 * The meta object literal for the '<em><b>Google User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOOGLE_USER__GOOGLE_USER_ID = eINSTANCE.getGoogleUser_GoogleUserId();

		/**
		 * The meta object literal for the '<em><b>Access Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOOGLE_USER__ACCESS_TOKEN = eINSTANCE.getGoogleUser_AccessToken();

		/**
		 * The meta object literal for the '<em><b>Env Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOOGLE_USER__ENV_PREFIX = eINSTANCE.getGoogleUser_EnvPrefix();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOOGLE_USER__PRODUCT_STORE_ID = eINSTANCE.getGoogleUser_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>Token Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOOGLE_USER__TOKEN_TYPE = eINSTANCE.getGoogleUser_TokenType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.passport.impl.LinkedInUserImpl <em>Linked In User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.passport.impl.LinkedInUserImpl
		 * @see org.abchip.mimo.biz.passport.impl.PassportPackageImpl#getLinkedInUser()
		 * @generated
		 */
		EClass LINKED_IN_USER = eINSTANCE.getLinkedInUser();

		/**
		 * The meta object literal for the '<em><b>Linked In User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINKED_IN_USER__LINKED_IN_USER_ID = eINSTANCE.getLinkedInUser_LinkedInUserId();

		/**
		 * The meta object literal for the '<em><b>Access Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINKED_IN_USER__ACCESS_TOKEN = eINSTANCE.getLinkedInUser_AccessToken();

		/**
		 * The meta object literal for the '<em><b>Env Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINKED_IN_USER__ENV_PREFIX = eINSTANCE.getLinkedInUser_EnvPrefix();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKED_IN_USER__PRODUCT_STORE_ID = eINSTANCE.getLinkedInUser_ProductStoreId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.passport.impl.OAuth2GitHubImpl <em>OAuth2 Git Hub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.passport.impl.OAuth2GitHubImpl
		 * @see org.abchip.mimo.biz.passport.impl.PassportPackageImpl#getOAuth2GitHub()
		 * @generated
		 */
		EClass OAUTH2_GIT_HUB = eINSTANCE.getOAuth2GitHub();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OAUTH2_GIT_HUB__PRODUCT_STORE_ID = eINSTANCE.getOAuth2GitHub_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_GIT_HUB__FROM_DATE = eINSTANCE.getOAuth2GitHub_FromDate();

		/**
		 * The meta object literal for the '<em><b>Client Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_GIT_HUB__CLIENT_ID = eINSTANCE.getOAuth2GitHub_ClientId();

		/**
		 * The meta object literal for the '<em><b>Client Secret</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_GIT_HUB__CLIENT_SECRET = eINSTANCE.getOAuth2GitHub_ClientSecret();

		/**
		 * The meta object literal for the '<em><b>Icon Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_GIT_HUB__ICON_URL = eINSTANCE.getOAuth2GitHub_IconUrl();

		/**
		 * The meta object literal for the '<em><b>Local Redirect Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_GIT_HUB__LOCAL_REDIRECT_URI = eINSTANCE.getOAuth2GitHub_LocalRedirectUri();

		/**
		 * The meta object literal for the '<em><b>Return Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_GIT_HUB__RETURN_URL = eINSTANCE.getOAuth2GitHub_ReturnUrl();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_GIT_HUB__THRU_DATE = eINSTANCE.getOAuth2GitHub_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.passport.impl.OAuth2GoogleImpl <em>OAuth2 Google</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.passport.impl.OAuth2GoogleImpl
		 * @see org.abchip.mimo.biz.passport.impl.PassportPackageImpl#getOAuth2Google()
		 * @generated
		 */
		EClass OAUTH2_GOOGLE = eINSTANCE.getOAuth2Google();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OAUTH2_GOOGLE__PRODUCT_STORE_ID = eINSTANCE.getOAuth2Google_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_GOOGLE__FROM_DATE = eINSTANCE.getOAuth2Google_FromDate();

		/**
		 * The meta object literal for the '<em><b>Client Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_GOOGLE__CLIENT_ID = eINSTANCE.getOAuth2Google_ClientId();

		/**
		 * The meta object literal for the '<em><b>Client Secret</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_GOOGLE__CLIENT_SECRET = eINSTANCE.getOAuth2Google_ClientSecret();

		/**
		 * The meta object literal for the '<em><b>Icon Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_GOOGLE__ICON_URL = eINSTANCE.getOAuth2Google_IconUrl();

		/**
		 * The meta object literal for the '<em><b>Local Redirect Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_GOOGLE__LOCAL_REDIRECT_URI = eINSTANCE.getOAuth2Google_LocalRedirectUri();

		/**
		 * The meta object literal for the '<em><b>Return Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_GOOGLE__RETURN_URL = eINSTANCE.getOAuth2Google_ReturnUrl();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_GOOGLE__THRU_DATE = eINSTANCE.getOAuth2Google_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.passport.impl.OAuth2LinkedInImpl <em>OAuth2 Linked In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.passport.impl.OAuth2LinkedInImpl
		 * @see org.abchip.mimo.biz.passport.impl.PassportPackageImpl#getOAuth2LinkedIn()
		 * @generated
		 */
		EClass OAUTH2_LINKED_IN = eINSTANCE.getOAuth2LinkedIn();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OAUTH2_LINKED_IN__PRODUCT_STORE_ID = eINSTANCE.getOAuth2LinkedIn_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_LINKED_IN__FROM_DATE = eINSTANCE.getOAuth2LinkedIn_FromDate();

		/**
		 * The meta object literal for the '<em><b>Api Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_LINKED_IN__API_KEY = eINSTANCE.getOAuth2LinkedIn_ApiKey();

		/**
		 * The meta object literal for the '<em><b>Icon Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_LINKED_IN__ICON_URL = eINSTANCE.getOAuth2LinkedIn_IconUrl();

		/**
		 * The meta object literal for the '<em><b>Live Return Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_LINKED_IN__LIVE_RETURN_URL = eINSTANCE.getOAuth2LinkedIn_LiveReturnUrl();

		/**
		 * The meta object literal for the '<em><b>Local Redirect Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_LINKED_IN__LOCAL_REDIRECT_URI = eINSTANCE.getOAuth2LinkedIn_LocalRedirectUri();

		/**
		 * The meta object literal for the '<em><b>Secret Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_LINKED_IN__SECRET_KEY = eINSTANCE.getOAuth2LinkedIn_SecretKey();

		/**
		 * The meta object literal for the '<em><b>Test Return Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_LINKED_IN__TEST_RETURN_URL = eINSTANCE.getOAuth2LinkedIn_TestReturnUrl();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_LINKED_IN__THRU_DATE = eINSTANCE.getOAuth2LinkedIn_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.passport.impl.ThirdPartyLoginImpl <em>Third Party Login</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.passport.impl.ThirdPartyLoginImpl
		 * @see org.abchip.mimo.biz.passport.impl.PassportPackageImpl#getThirdPartyLogin()
		 * @generated
		 */
		EClass THIRD_PARTY_LOGIN = eINSTANCE.getThirdPartyLogin();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THIRD_PARTY_LOGIN__PRODUCT_STORE_ID = eINSTANCE.getThirdPartyLogin_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>Login Meth Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THIRD_PARTY_LOGIN__LOGIN_METH_TYPE_ID = eINSTANCE.getThirdPartyLogin_LoginMethTypeId();

		/**
		 * The meta object literal for the '<em><b>Login Provider Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THIRD_PARTY_LOGIN__LOGIN_PROVIDER_ID = eINSTANCE.getThirdPartyLogin_LoginProviderId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THIRD_PARTY_LOGIN__FROM_DATE = eINSTANCE.getThirdPartyLogin_FromDate();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THIRD_PARTY_LOGIN__SEQUENCE_NUM = eINSTANCE.getThirdPartyLogin_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THIRD_PARTY_LOGIN__THRU_DATE = eINSTANCE.getThirdPartyLogin_ThruDate();

	}

} //PassportPackage
