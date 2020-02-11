/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.security.securitygroup.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.security.securitygroup.SecuritygroupPackage;
import org.abchip.mimo.biz.security.securitygroup.TarpittedLoginView;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tarpitted Login View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.TarpittedLoginViewImpl#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.TarpittedLoginViewImpl#getViewNameId <em>View Name Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.TarpittedLoginViewImpl#getTarpitReleaseDateTime <em>Tarpit Release Date Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TarpittedLoginViewImpl extends BizEntityImpl implements TarpittedLoginView {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TarpittedLoginViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecuritygroupPackage.Literals.TARPITTED_LOGIN_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTarpitReleaseDateTime() {
		return (Long)eGet(SecuritygroupPackage.Literals.TARPITTED_LOGIN_VIEW__TARPIT_RELEASE_DATE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarpitReleaseDateTime(long newTarpitReleaseDateTime) {
		eSet(SecuritygroupPackage.Literals.TARPITTED_LOGIN_VIEW__TARPIT_RELEASE_DATE_TIME, newTarpitReleaseDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserLoginId() {
		return (String)eGet(SecuritygroupPackage.Literals.TARPITTED_LOGIN_VIEW__USER_LOGIN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserLoginId(String newUserLoginId) {
		eSet(SecuritygroupPackage.Literals.TARPITTED_LOGIN_VIEW__USER_LOGIN_ID, newUserLoginId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getViewNameId() {
		return (String)eGet(SecuritygroupPackage.Literals.TARPITTED_LOGIN_VIEW__VIEW_NAME_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewNameId(String newViewNameId) {
		eSet(SecuritygroupPackage.Literals.TARPITTED_LOGIN_VIEW__VIEW_NAME_ID, newViewNameId);
	}

} //TarpittedLoginViewImpl
