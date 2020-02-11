/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.catalina.session;

import org.abchip.mimo.biz.BizPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.abchip.mimo.biz.catalina.session.SessionFactory
 * @model kind="package"
 * @generated
 */
public interface SessionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "session";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/catalina/session";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-session";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SessionPackage eINSTANCE = org.abchip.mimo.biz.catalina.session.impl.SessionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.catalina.session.impl.CatalinaSessionImpl <em>Catalina Session</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.catalina.session.impl.CatalinaSessionImpl
	 * @see org.abchip.mimo.biz.catalina.session.impl.SessionPackageImpl#getCatalinaSession()
	 * @generated
	 */
	int CATALINA_SESSION = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALINA_SESSION__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALINA_SESSION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALINA_SESSION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALINA_SESSION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Session Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALINA_SESSION__SESSION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALINA_SESSION__IS_VALID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Accessed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALINA_SESSION__LAST_ACCESSED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Idle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALINA_SESSION__MAX_IDLE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Session Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALINA_SESSION__SESSION_INFO = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Session Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALINA_SESSION__SESSION_SIZE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Catalina Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALINA_SESSION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.catalina.session.CatalinaSession <em>Catalina Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalina Session</em>'.
	 * @see org.abchip.mimo.biz.catalina.session.CatalinaSession
	 * @generated
	 */
	EClass getCatalinaSession();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.catalina.session.CatalinaSession#getSessionId <em>Session Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session Id</em>'.
	 * @see org.abchip.mimo.biz.catalina.session.CatalinaSession#getSessionId()
	 * @see #getCatalinaSession()
	 * @generated
	 */
	EAttribute getCatalinaSession_SessionId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.catalina.session.CatalinaSession#isIsValid <em>Is Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Valid</em>'.
	 * @see org.abchip.mimo.biz.catalina.session.CatalinaSession#isIsValid()
	 * @see #getCatalinaSession()
	 * @generated
	 */
	EAttribute getCatalinaSession_IsValid();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.catalina.session.CatalinaSession#getLastAccessed <em>Last Accessed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Accessed</em>'.
	 * @see org.abchip.mimo.biz.catalina.session.CatalinaSession#getLastAccessed()
	 * @see #getCatalinaSession()
	 * @generated
	 */
	EAttribute getCatalinaSession_LastAccessed();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.catalina.session.CatalinaSession#getMaxIdle <em>Max Idle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Idle</em>'.
	 * @see org.abchip.mimo.biz.catalina.session.CatalinaSession#getMaxIdle()
	 * @see #getCatalinaSession()
	 * @generated
	 */
	EAttribute getCatalinaSession_MaxIdle();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.catalina.session.CatalinaSession#getSessionInfo <em>Session Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session Info</em>'.
	 * @see org.abchip.mimo.biz.catalina.session.CatalinaSession#getSessionInfo()
	 * @see #getCatalinaSession()
	 * @generated
	 */
	EAttribute getCatalinaSession_SessionInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.catalina.session.CatalinaSession#getSessionSize <em>Session Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session Size</em>'.
	 * @see org.abchip.mimo.biz.catalina.session.CatalinaSession#getSessionSize()
	 * @see #getCatalinaSession()
	 * @generated
	 */
	EAttribute getCatalinaSession_SessionSize();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SessionFactory getSessionFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.catalina.session.impl.CatalinaSessionImpl <em>Catalina Session</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.catalina.session.impl.CatalinaSessionImpl
		 * @see org.abchip.mimo.biz.catalina.session.impl.SessionPackageImpl#getCatalinaSession()
		 * @generated
		 */
		EClass CATALINA_SESSION = eINSTANCE.getCatalinaSession();

		/**
		 * The meta object literal for the '<em><b>Session Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALINA_SESSION__SESSION_ID = eINSTANCE.getCatalinaSession_SessionId();

		/**
		 * The meta object literal for the '<em><b>Is Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALINA_SESSION__IS_VALID = eINSTANCE.getCatalinaSession_IsValid();

		/**
		 * The meta object literal for the '<em><b>Last Accessed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALINA_SESSION__LAST_ACCESSED = eINSTANCE.getCatalinaSession_LastAccessed();

		/**
		 * The meta object literal for the '<em><b>Max Idle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALINA_SESSION__MAX_IDLE = eINSTANCE.getCatalinaSession_MaxIdle();

		/**
		 * The meta object literal for the '<em><b>Session Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALINA_SESSION__SESSION_INFO = eINSTANCE.getCatalinaSession_SessionInfo();

		/**
		 * The meta object literal for the '<em><b>Session Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALINA_SESSION__SESSION_SIZE = eINSTANCE.getCatalinaSession_SessionSize();

	}

} //SessionPackage
