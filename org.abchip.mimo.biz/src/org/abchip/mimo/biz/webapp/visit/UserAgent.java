/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.webapp.visit;

import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.UserAgent#getUserAgentId <em>User Agent Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.UserAgent#getBrowserTypeId <em>Browser Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.UserAgent#getPlatformTypeId <em>Platform Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.UserAgent#getProtocolTypeId <em>Protocol Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.UserAgent#getUserAgentTypeId <em>User Agent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.UserAgent#getUserAgentMethodTypeId <em>User Agent Method Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getUserAgent()
 * @model
 * @generated
 */
public interface UserAgent extends BizEntityTyped<UserAgentType> {
	/**
	 * Returns the value of the '<em><b>User Agent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Agent Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Agent Id</em>' attribute.
	 * @see #setUserAgentId(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getUserAgent_UserAgentId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getUserAgentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.UserAgent#getUserAgentId <em>User Agent Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Agent Id</em>' attribute.
	 * @see #getUserAgentId()
	 * @generated
	 */
	void setUserAgentId(String value);

	/**
	 * Returns the value of the '<em><b>Browser Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Browser Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browser Type Id</em>' reference.
	 * @see #setBrowserTypeId(BrowserType)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getUserAgent_BrowserTypeId()
	 * @model keys="browserTypeId"
	 * @generated
	 */
	BrowserType getBrowserTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.UserAgent#getBrowserTypeId <em>Browser Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Browser Type Id</em>' reference.
	 * @see #getBrowserTypeId()
	 * @generated
	 */
	void setBrowserTypeId(BrowserType value);

	/**
	 * Returns the value of the '<em><b>Platform Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Type Id</em>' reference.
	 * @see #setPlatformTypeId(PlatformType)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getUserAgent_PlatformTypeId()
	 * @model keys="platformTypeId"
	 * @generated
	 */
	PlatformType getPlatformTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.UserAgent#getPlatformTypeId <em>Platform Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform Type Id</em>' reference.
	 * @see #getPlatformTypeId()
	 * @generated
	 */
	void setPlatformTypeId(PlatformType value);

	/**
	 * Returns the value of the '<em><b>Protocol Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol Type Id</em>' reference.
	 * @see #setProtocolTypeId(ProtocolType)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getUserAgent_ProtocolTypeId()
	 * @model keys="protocolTypeId"
	 * @generated
	 */
	ProtocolType getProtocolTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.UserAgent#getProtocolTypeId <em>Protocol Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Type Id</em>' reference.
	 * @see #getProtocolTypeId()
	 * @generated
	 */
	void setProtocolTypeId(ProtocolType value);

	/**
	 * Returns the value of the '<em><b>User Agent Method Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Agent Method Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Agent Method Type Id</em>' reference.
	 * @see #setUserAgentMethodTypeId(UserAgentMethodType)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getUserAgent_UserAgentMethodTypeId()
	 * @model keys="userAgentMethodTypeId"
	 * @generated
	 */
	UserAgentMethodType getUserAgentMethodTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.UserAgent#getUserAgentMethodTypeId <em>User Agent Method Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Agent Method Type Id</em>' reference.
	 * @see #getUserAgentMethodTypeId()
	 * @generated
	 */
	void setUserAgentMethodTypeId(UserAgentMethodType value);

	/**
	 * Returns the value of the '<em><b>User Agent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Agent Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Agent Type Id</em>' reference.
	 * @see #setUserAgentTypeId(UserAgentType)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getUserAgent_UserAgentTypeId()
	 * @model keys="userAgentTypeId"
	 * @generated
	 */
	UserAgentType getUserAgentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.UserAgent#getUserAgentTypeId <em>User Agent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Agent Type Id</em>' reference.
	 * @see #getUserAgentTypeId()
	 * @generated
	 */
	void setUserAgentTypeId(UserAgentType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Visit' route='userAgentId'"
	 * @generated
	 */
	List<String> visits();

} // UserAgent