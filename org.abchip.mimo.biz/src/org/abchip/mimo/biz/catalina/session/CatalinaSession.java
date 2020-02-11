/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.catalina.session;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalina Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.catalina.session.CatalinaSession#getSessionId <em>Session Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.catalina.session.CatalinaSession#isIsValid <em>Is Valid</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.catalina.session.CatalinaSession#getLastAccessed <em>Last Accessed</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.catalina.session.CatalinaSession#getMaxIdle <em>Max Idle</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.catalina.session.CatalinaSession#getSessionInfo <em>Session Info</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.catalina.session.CatalinaSession#getSessionSize <em>Session Size</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.catalina.session.SessionPackage#getCatalinaSession()
 * @model annotation="mimo-ent-frame title='Catalina Session Store'"
 * @generated
 */
public interface CatalinaSession extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Session Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Id</em>' attribute.
	 * @see #setSessionId(String)
	 * @see org.abchip.mimo.biz.catalina.session.SessionPackage#getCatalinaSession_SessionId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getSessionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.catalina.session.CatalinaSession#getSessionId <em>Session Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Id</em>' attribute.
	 * @see #getSessionId()
	 * @generated
	 */
	void setSessionId(String value);

	/**
	 * Returns the value of the '<em><b>Is Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Valid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Valid</em>' attribute.
	 * @see #setIsValid(boolean)
	 * @see org.abchip.mimo.biz.catalina.session.SessionPackage#getCatalinaSession_IsValid()
	 * @model
	 * @generated
	 */
	boolean isIsValid();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.catalina.session.CatalinaSession#isIsValid <em>Is Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Valid</em>' attribute.
	 * @see #isIsValid()
	 * @generated
	 */
	void setIsValid(boolean value);

	/**
	 * Returns the value of the '<em><b>Last Accessed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Accessed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Accessed</em>' attribute.
	 * @see #setLastAccessed(long)
	 * @see org.abchip.mimo.biz.catalina.session.SessionPackage#getCatalinaSession_LastAccessed()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getLastAccessed();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.catalina.session.CatalinaSession#getLastAccessed <em>Last Accessed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Accessed</em>' attribute.
	 * @see #getLastAccessed()
	 * @generated
	 */
	void setLastAccessed(long value);

	/**
	 * Returns the value of the '<em><b>Max Idle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Idle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Idle</em>' attribute.
	 * @see #setMaxIdle(long)
	 * @see org.abchip.mimo.biz.catalina.session.SessionPackage#getCatalinaSession_MaxIdle()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getMaxIdle();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.catalina.session.CatalinaSession#getMaxIdle <em>Max Idle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Idle</em>' attribute.
	 * @see #getMaxIdle()
	 * @generated
	 */
	void setMaxIdle(long value);

	/**
	 * Returns the value of the '<em><b>Session Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Info</em>' attribute.
	 * @see #setSessionInfo(String)
	 * @see org.abchip.mimo.biz.catalina.session.SessionPackage#getCatalinaSession_SessionInfo()
	 * @model
	 * @generated
	 */
	String getSessionInfo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.catalina.session.CatalinaSession#getSessionInfo <em>Session Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Info</em>' attribute.
	 * @see #getSessionInfo()
	 * @generated
	 */
	void setSessionInfo(String value);

	/**
	 * Returns the value of the '<em><b>Session Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Size</em>' attribute.
	 * @see #setSessionSize(long)
	 * @see org.abchip.mimo.biz.catalina.session.SessionPackage#getCatalinaSession_SessionSize()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSessionSize();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.catalina.session.CatalinaSession#getSessionSize <em>Session Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Size</em>' attribute.
	 * @see #getSessionSize()
	 * @generated
	 */
	void setSessionSize(long value);

} // CatalinaSession
