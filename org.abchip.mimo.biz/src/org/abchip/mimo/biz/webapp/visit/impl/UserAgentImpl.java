/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.webapp.visit.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.webapp.visit.BrowserType;
import org.abchip.mimo.biz.webapp.visit.PlatformType;
import org.abchip.mimo.biz.webapp.visit.ProtocolType;
import org.abchip.mimo.biz.webapp.visit.UserAgent;
import org.abchip.mimo.biz.webapp.visit.UserAgentMethodType;
import org.abchip.mimo.biz.webapp.visit.UserAgentType;
import org.abchip.mimo.biz.webapp.visit.VisitPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.UserAgentImpl#getUserAgentId <em>User Agent Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.UserAgentImpl#getBrowserTypeId <em>Browser Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.UserAgentImpl#getPlatformTypeId <em>Platform Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.UserAgentImpl#getProtocolTypeId <em>Protocol Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.UserAgentImpl#getUserAgentMethodTypeId <em>User Agent Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.UserAgentImpl#getUserAgentTypeId <em>User Agent Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserAgentImpl extends BizEntityImpl implements UserAgent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserAgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisitPackage.Literals.USER_AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserAgentId() {
		return (String)eGet(VisitPackage.Literals.USER_AGENT__USER_AGENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserAgentId(String newUserAgentId) {
		eSet(VisitPackage.Literals.USER_AGENT__USER_AGENT_ID, newUserAgentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BrowserType getBrowserTypeId() {
		return (BrowserType)eGet(VisitPackage.Literals.USER_AGENT__BROWSER_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrowserTypeId(BrowserType newBrowserTypeId) {
		eSet(VisitPackage.Literals.USER_AGENT__BROWSER_TYPE_ID, newBrowserTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlatformType getPlatformTypeId() {
		return (PlatformType)eGet(VisitPackage.Literals.USER_AGENT__PLATFORM_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlatformTypeId(PlatformType newPlatformTypeId) {
		eSet(VisitPackage.Literals.USER_AGENT__PLATFORM_TYPE_ID, newPlatformTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProtocolType getProtocolTypeId() {
		return (ProtocolType)eGet(VisitPackage.Literals.USER_AGENT__PROTOCOL_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocolTypeId(ProtocolType newProtocolTypeId) {
		eSet(VisitPackage.Literals.USER_AGENT__PROTOCOL_TYPE_ID, newProtocolTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserAgentMethodType getUserAgentMethodTypeId() {
		return (UserAgentMethodType)eGet(VisitPackage.Literals.USER_AGENT__USER_AGENT_METHOD_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserAgentMethodTypeId(UserAgentMethodType newUserAgentMethodTypeId) {
		eSet(VisitPackage.Literals.USER_AGENT__USER_AGENT_METHOD_TYPE_ID, newUserAgentMethodTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserAgentType getUserAgentTypeId() {
		return (UserAgentType)eGet(VisitPackage.Literals.USER_AGENT__USER_AGENT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserAgentTypeId(UserAgentType newUserAgentTypeId) {
		eSet(VisitPackage.Literals.USER_AGENT__USER_AGENT_TYPE_ID, newUserAgentTypeId);
	}

} //UserAgentImpl
