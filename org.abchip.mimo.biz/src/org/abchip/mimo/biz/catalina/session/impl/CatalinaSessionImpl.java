/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.catalina.session.impl;

import org.abchip.mimo.biz.catalina.session.CatalinaSession;
import org.abchip.mimo.biz.catalina.session.SessionPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalina Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.catalina.session.impl.CatalinaSessionImpl#getSessionId <em>Session Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.catalina.session.impl.CatalinaSessionImpl#isIsValid <em>Is Valid</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.catalina.session.impl.CatalinaSessionImpl#getLastAccessed <em>Last Accessed</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.catalina.session.impl.CatalinaSessionImpl#getMaxIdle <em>Max Idle</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.catalina.session.impl.CatalinaSessionImpl#getSessionInfo <em>Session Info</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.catalina.session.impl.CatalinaSessionImpl#getSessionSize <em>Session Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatalinaSessionImpl extends BizEntityImpl implements CatalinaSession {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalinaSessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SessionPackage.Literals.CATALINA_SESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSessionId() {
		return (String)eGet(SessionPackage.Literals.CATALINA_SESSION__SESSION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSessionId(String newSessionId) {
		eSet(SessionPackage.Literals.CATALINA_SESSION__SESSION_ID, newSessionId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsValid() {
		return (Boolean)eGet(SessionPackage.Literals.CATALINA_SESSION__IS_VALID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsValid(boolean newIsValid) {
		eSet(SessionPackage.Literals.CATALINA_SESSION__IS_VALID, newIsValid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getLastAccessed() {
		return (Long)eGet(SessionPackage.Literals.CATALINA_SESSION__LAST_ACCESSED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastAccessed(long newLastAccessed) {
		eSet(SessionPackage.Literals.CATALINA_SESSION__LAST_ACCESSED, newLastAccessed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxIdle() {
		return (Long)eGet(SessionPackage.Literals.CATALINA_SESSION__MAX_IDLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxIdle(long newMaxIdle) {
		eSet(SessionPackage.Literals.CATALINA_SESSION__MAX_IDLE, newMaxIdle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSessionInfo() {
		return (String)eGet(SessionPackage.Literals.CATALINA_SESSION__SESSION_INFO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSessionInfo(String newSessionInfo) {
		eSet(SessionPackage.Literals.CATALINA_SESSION__SESSION_INFO, newSessionInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSessionSize() {
		return (Long)eGet(SessionPackage.Literals.CATALINA_SESSION__SESSION_SIZE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSessionSize(long newSessionSize) {
		eSet(SessionPackage.Literals.CATALINA_SESSION__SESSION_SIZE, newSessionSize);
	}

} //CatalinaSessionImpl
