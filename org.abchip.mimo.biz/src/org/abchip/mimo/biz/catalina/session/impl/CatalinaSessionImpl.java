/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.catalina.session.impl;

import org.abchip.mimo.biz.catalina.session.CatalinaSession;
import org.abchip.mimo.biz.catalina.session.SessionPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The default value of the '{@link #getSessionId() <em>Session Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionId()
	 * @generated
	 * @ordered
	 */
	protected static final String SESSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSessionId() <em>Session Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionId()
	 * @generated
	 * @ordered
	 */
	protected String sessionId = SESSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsValid() <em>Is Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsValid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VALID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsValid() <em>Is Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsValid()
	 * @generated
	 * @ordered
	 */
	protected boolean isValid = IS_VALID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastAccessed() <em>Last Accessed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastAccessed()
	 * @generated
	 * @ordered
	 */
	protected static final long LAST_ACCESSED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLastAccessed() <em>Last Accessed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastAccessed()
	 * @generated
	 * @ordered
	 */
	protected long lastAccessed = LAST_ACCESSED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxIdle() <em>Max Idle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxIdle()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_IDLE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxIdle() <em>Max Idle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxIdle()
	 * @generated
	 * @ordered
	 */
	protected long maxIdle = MAX_IDLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSessionInfo() <em>Session Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String SESSION_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSessionInfo() <em>Session Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionInfo()
	 * @generated
	 * @ordered
	 */
	protected String sessionInfo = SESSION_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getSessionSize() <em>Session Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionSize()
	 * @generated
	 * @ordered
	 */
	protected static final long SESSION_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSessionSize() <em>Session Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionSize()
	 * @generated
	 * @ordered
	 */
	protected long sessionSize = SESSION_SIZE_EDEFAULT;

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
		return sessionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSessionId(String newSessionId) {
		String oldSessionId = sessionId;
		sessionId = newSessionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SessionPackage.CATALINA_SESSION__SESSION_ID, oldSessionId, sessionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsValid() {
		return isValid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsValid(boolean newIsValid) {
		boolean oldIsValid = isValid;
		isValid = newIsValid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SessionPackage.CATALINA_SESSION__IS_VALID, oldIsValid, isValid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getLastAccessed() {
		return lastAccessed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastAccessed(long newLastAccessed) {
		long oldLastAccessed = lastAccessed;
		lastAccessed = newLastAccessed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SessionPackage.CATALINA_SESSION__LAST_ACCESSED, oldLastAccessed, lastAccessed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxIdle() {
		return maxIdle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxIdle(long newMaxIdle) {
		long oldMaxIdle = maxIdle;
		maxIdle = newMaxIdle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SessionPackage.CATALINA_SESSION__MAX_IDLE, oldMaxIdle, maxIdle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSessionInfo() {
		return sessionInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSessionInfo(String newSessionInfo) {
		String oldSessionInfo = sessionInfo;
		sessionInfo = newSessionInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SessionPackage.CATALINA_SESSION__SESSION_INFO, oldSessionInfo, sessionInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSessionSize() {
		return sessionSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSessionSize(long newSessionSize) {
		long oldSessionSize = sessionSize;
		sessionSize = newSessionSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SessionPackage.CATALINA_SESSION__SESSION_SIZE, oldSessionSize, sessionSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SessionPackage.CATALINA_SESSION__SESSION_ID:
				return getSessionId();
			case SessionPackage.CATALINA_SESSION__IS_VALID:
				return isIsValid();
			case SessionPackage.CATALINA_SESSION__LAST_ACCESSED:
				return getLastAccessed();
			case SessionPackage.CATALINA_SESSION__MAX_IDLE:
				return getMaxIdle();
			case SessionPackage.CATALINA_SESSION__SESSION_INFO:
				return getSessionInfo();
			case SessionPackage.CATALINA_SESSION__SESSION_SIZE:
				return getSessionSize();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SessionPackage.CATALINA_SESSION__SESSION_ID:
				setSessionId((String)newValue);
				return;
			case SessionPackage.CATALINA_SESSION__IS_VALID:
				setIsValid((Boolean)newValue);
				return;
			case SessionPackage.CATALINA_SESSION__LAST_ACCESSED:
				setLastAccessed((Long)newValue);
				return;
			case SessionPackage.CATALINA_SESSION__MAX_IDLE:
				setMaxIdle((Long)newValue);
				return;
			case SessionPackage.CATALINA_SESSION__SESSION_INFO:
				setSessionInfo((String)newValue);
				return;
			case SessionPackage.CATALINA_SESSION__SESSION_SIZE:
				setSessionSize((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SessionPackage.CATALINA_SESSION__SESSION_ID:
				setSessionId(SESSION_ID_EDEFAULT);
				return;
			case SessionPackage.CATALINA_SESSION__IS_VALID:
				setIsValid(IS_VALID_EDEFAULT);
				return;
			case SessionPackage.CATALINA_SESSION__LAST_ACCESSED:
				setLastAccessed(LAST_ACCESSED_EDEFAULT);
				return;
			case SessionPackage.CATALINA_SESSION__MAX_IDLE:
				setMaxIdle(MAX_IDLE_EDEFAULT);
				return;
			case SessionPackage.CATALINA_SESSION__SESSION_INFO:
				setSessionInfo(SESSION_INFO_EDEFAULT);
				return;
			case SessionPackage.CATALINA_SESSION__SESSION_SIZE:
				setSessionSize(SESSION_SIZE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SessionPackage.CATALINA_SESSION__SESSION_ID:
				return SESSION_ID_EDEFAULT == null ? sessionId != null : !SESSION_ID_EDEFAULT.equals(sessionId);
			case SessionPackage.CATALINA_SESSION__IS_VALID:
				return isValid != IS_VALID_EDEFAULT;
			case SessionPackage.CATALINA_SESSION__LAST_ACCESSED:
				return lastAccessed != LAST_ACCESSED_EDEFAULT;
			case SessionPackage.CATALINA_SESSION__MAX_IDLE:
				return maxIdle != MAX_IDLE_EDEFAULT;
			case SessionPackage.CATALINA_SESSION__SESSION_INFO:
				return SESSION_INFO_EDEFAULT == null ? sessionInfo != null : !SESSION_INFO_EDEFAULT.equals(sessionInfo);
			case SessionPackage.CATALINA_SESSION__SESSION_SIZE:
				return sessionSize != SESSION_SIZE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (sessionId: ");
		result.append(sessionId);
		result.append(", isValid: ");
		result.append(isValid);
		result.append(", lastAccessed: ");
		result.append(lastAccessed);
		result.append(", maxIdle: ");
		result.append(maxIdle);
		result.append(", sessionInfo: ");
		result.append(sessionInfo);
		result.append(", sessionSize: ");
		result.append(sessionSize);
		result.append(')');
		return result.toString();
	}

} //CatalinaSessionImpl
