/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.security.securitygroup.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.security.securitygroup.ProtectedView;
import org.abchip.mimo.biz.security.securitygroup.SecurityGroup;
import org.abchip.mimo.biz.security.securitygroup.SecuritygroupPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protected View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.ProtectedViewImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.ProtectedViewImpl#getViewNameId <em>View Name Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.ProtectedViewImpl#getMaxHits <em>Max Hits</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.ProtectedViewImpl#getMaxHitsDuration <em>Max Hits Duration</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.ProtectedViewImpl#getTarpitDuration <em>Tarpit Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtectedViewImpl extends BizEntityImpl implements ProtectedView {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtectedViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecuritygroupPackage.Literals.PROTECTED_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityGroup getGroupId() {
		return (SecurityGroup)eGet(SecuritygroupPackage.Literals.PROTECTED_VIEW__GROUP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupId(SecurityGroup newGroupId) {
		eSet(SecuritygroupPackage.Literals.PROTECTED_VIEW__GROUP_ID, newGroupId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxHits() {
		return (Long)eGet(SecuritygroupPackage.Literals.PROTECTED_VIEW__MAX_HITS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxHits(long newMaxHits) {
		eSet(SecuritygroupPackage.Literals.PROTECTED_VIEW__MAX_HITS, newMaxHits);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxHitsDuration() {
		return (Long)eGet(SecuritygroupPackage.Literals.PROTECTED_VIEW__MAX_HITS_DURATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxHitsDuration(long newMaxHitsDuration) {
		eSet(SecuritygroupPackage.Literals.PROTECTED_VIEW__MAX_HITS_DURATION, newMaxHitsDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTarpitDuration() {
		return (Long)eGet(SecuritygroupPackage.Literals.PROTECTED_VIEW__TARPIT_DURATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarpitDuration(long newTarpitDuration) {
		eSet(SecuritygroupPackage.Literals.PROTECTED_VIEW__TARPIT_DURATION, newTarpitDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getViewNameId() {
		return (String)eGet(SecuritygroupPackage.Literals.PROTECTED_VIEW__VIEW_NAME_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewNameId(String newViewNameId) {
		eSet(SecuritygroupPackage.Literals.PROTECTED_VIEW__VIEW_NAME_ID, newViewNameId);
	}

} //ProtectedViewImpl
