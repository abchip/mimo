/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protected View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.ProtectedViewImpl#getViewNameId <em>View Name Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.ProtectedViewImpl#getMaxHits <em>Max Hits</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.ProtectedViewImpl#getMaxHitsDuration <em>Max Hits Duration</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.ProtectedViewImpl#getTarpitDuration <em>Tarpit Duration</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.impl.ProtectedViewImpl#getGroupId <em>Group Id</em>}</li>
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
	 * The default value of the '{@link #getViewNameId() <em>View Name Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewNameId()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_NAME_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewNameId() <em>View Name Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewNameId()
	 * @generated
	 * @ordered
	 */
	protected String viewNameId = VIEW_NAME_ID_EDEFAULT;


	/**
	 * The default value of the '{@link #getMaxHits() <em>Max Hits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHits()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_HITS_EDEFAULT = 0L;


	/**
	 * The cached value of the '{@link #getMaxHits() <em>Max Hits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHits()
	 * @generated
	 * @ordered
	 */
	protected long maxHits = MAX_HITS_EDEFAULT;


	/**
	 * The default value of the '{@link #getMaxHitsDuration() <em>Max Hits Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHitsDuration()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_HITS_DURATION_EDEFAULT = 0L;


	/**
	 * The cached value of the '{@link #getMaxHitsDuration() <em>Max Hits Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHitsDuration()
	 * @generated
	 * @ordered
	 */
	protected long maxHitsDuration = MAX_HITS_DURATION_EDEFAULT;


	/**
	 * The default value of the '{@link #getTarpitDuration() <em>Tarpit Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarpitDuration()
	 * @generated
	 * @ordered
	 */
	protected static final long TARPIT_DURATION_EDEFAULT = 0L;


	/**
	 * The cached value of the '{@link #getTarpitDuration() <em>Tarpit Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarpitDuration()
	 * @generated
	 * @ordered
	 */
	protected long tarpitDuration = TARPIT_DURATION_EDEFAULT;


	/**
	 * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected SecurityGroup groupId;

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
		if (groupId != null && ((EObject)groupId).eIsProxy()) {
			InternalEObject oldGroupId = (InternalEObject)groupId;
			groupId = (SecurityGroup)eResolveProxy(oldGroupId);
			if (groupId != oldGroupId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecuritygroupPackage.PROTECTED_VIEW__GROUP_ID, oldGroupId, groupId));
			}
		}
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityGroup basicGetGroupId() {
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupId(SecurityGroup newGroupId) {
		SecurityGroup oldGroupId = groupId;
		groupId = newGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecuritygroupPackage.PROTECTED_VIEW__GROUP_ID, oldGroupId, groupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxHits() {
		return maxHits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxHits(long newMaxHits) {
		long oldMaxHits = maxHits;
		maxHits = newMaxHits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecuritygroupPackage.PROTECTED_VIEW__MAX_HITS, oldMaxHits, maxHits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxHitsDuration() {
		return maxHitsDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxHitsDuration(long newMaxHitsDuration) {
		long oldMaxHitsDuration = maxHitsDuration;
		maxHitsDuration = newMaxHitsDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecuritygroupPackage.PROTECTED_VIEW__MAX_HITS_DURATION, oldMaxHitsDuration, maxHitsDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTarpitDuration() {
		return tarpitDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarpitDuration(long newTarpitDuration) {
		long oldTarpitDuration = tarpitDuration;
		tarpitDuration = newTarpitDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecuritygroupPackage.PROTECTED_VIEW__TARPIT_DURATION, oldTarpitDuration, tarpitDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getViewNameId() {
		return viewNameId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewNameId(String newViewNameId) {
		String oldViewNameId = viewNameId;
		viewNameId = newViewNameId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecuritygroupPackage.PROTECTED_VIEW__VIEW_NAME_ID, oldViewNameId, viewNameId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecuritygroupPackage.PROTECTED_VIEW__VIEW_NAME_ID:
				return getViewNameId();
			case SecuritygroupPackage.PROTECTED_VIEW__MAX_HITS:
				return getMaxHits();
			case SecuritygroupPackage.PROTECTED_VIEW__MAX_HITS_DURATION:
				return getMaxHitsDuration();
			case SecuritygroupPackage.PROTECTED_VIEW__TARPIT_DURATION:
				return getTarpitDuration();
			case SecuritygroupPackage.PROTECTED_VIEW__GROUP_ID:
				if (resolve) return getGroupId();
				return basicGetGroupId();
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
			case SecuritygroupPackage.PROTECTED_VIEW__VIEW_NAME_ID:
				setViewNameId((String)newValue);
				return;
			case SecuritygroupPackage.PROTECTED_VIEW__MAX_HITS:
				setMaxHits((Long)newValue);
				return;
			case SecuritygroupPackage.PROTECTED_VIEW__MAX_HITS_DURATION:
				setMaxHitsDuration((Long)newValue);
				return;
			case SecuritygroupPackage.PROTECTED_VIEW__TARPIT_DURATION:
				setTarpitDuration((Long)newValue);
				return;
			case SecuritygroupPackage.PROTECTED_VIEW__GROUP_ID:
				setGroupId((SecurityGroup)newValue);
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
			case SecuritygroupPackage.PROTECTED_VIEW__VIEW_NAME_ID:
				setViewNameId(VIEW_NAME_ID_EDEFAULT);
				return;
			case SecuritygroupPackage.PROTECTED_VIEW__MAX_HITS:
				setMaxHits(MAX_HITS_EDEFAULT);
				return;
			case SecuritygroupPackage.PROTECTED_VIEW__MAX_HITS_DURATION:
				setMaxHitsDuration(MAX_HITS_DURATION_EDEFAULT);
				return;
			case SecuritygroupPackage.PROTECTED_VIEW__TARPIT_DURATION:
				setTarpitDuration(TARPIT_DURATION_EDEFAULT);
				return;
			case SecuritygroupPackage.PROTECTED_VIEW__GROUP_ID:
				setGroupId((SecurityGroup)null);
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
			case SecuritygroupPackage.PROTECTED_VIEW__VIEW_NAME_ID:
				return VIEW_NAME_ID_EDEFAULT == null ? viewNameId != null : !VIEW_NAME_ID_EDEFAULT.equals(viewNameId);
			case SecuritygroupPackage.PROTECTED_VIEW__MAX_HITS:
				return maxHits != MAX_HITS_EDEFAULT;
			case SecuritygroupPackage.PROTECTED_VIEW__MAX_HITS_DURATION:
				return maxHitsDuration != MAX_HITS_DURATION_EDEFAULT;
			case SecuritygroupPackage.PROTECTED_VIEW__TARPIT_DURATION:
				return tarpitDuration != TARPIT_DURATION_EDEFAULT;
			case SecuritygroupPackage.PROTECTED_VIEW__GROUP_ID:
				return groupId != null;
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
		result.append(" (viewNameId: ");
		result.append(viewNameId);
		result.append(", maxHits: ");
		result.append(maxHits);
		result.append(", maxHitsDuration: ");
		result.append(maxHitsDuration);
		result.append(", tarpitDuration: ");
		result.append(tarpitDuration);
		result.append(')');
		return result.toString();
	}

} //ProtectedViewImpl
