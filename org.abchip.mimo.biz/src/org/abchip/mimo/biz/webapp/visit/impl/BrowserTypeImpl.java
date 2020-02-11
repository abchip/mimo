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
import org.abchip.mimo.biz.webapp.visit.VisitPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Browser Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.BrowserTypeImpl#getBrowserTypeId <em>Browser Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.BrowserTypeImpl#getBrowserName <em>Browser Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.BrowserTypeImpl#getBrowserVersion <em>Browser Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BrowserTypeImpl extends BizEntityImpl implements BrowserType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrowserTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisitPackage.Literals.BROWSER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBrowserTypeId() {
		return (String)eGet(VisitPackage.Literals.BROWSER_TYPE__BROWSER_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrowserTypeId(String newBrowserTypeId) {
		eSet(VisitPackage.Literals.BROWSER_TYPE__BROWSER_TYPE_ID, newBrowserTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBrowserName() {
		return (String)eGet(VisitPackage.Literals.BROWSER_TYPE__BROWSER_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrowserName(String newBrowserName) {
		eSet(VisitPackage.Literals.BROWSER_TYPE__BROWSER_NAME, newBrowserName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBrowserVersion() {
		return (String)eGet(VisitPackage.Literals.BROWSER_TYPE__BROWSER_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrowserVersion(String newBrowserVersion) {
		eSet(VisitPackage.Literals.BROWSER_TYPE__BROWSER_VERSION, newBrowserVersion);
	}

} //BrowserTypeImpl
