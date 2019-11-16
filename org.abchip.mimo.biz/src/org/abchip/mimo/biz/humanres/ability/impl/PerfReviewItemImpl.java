/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.ability.impl;

import org.abchip.mimo.biz.humanres.ability.AbilityPackage;
import org.abchip.mimo.biz.humanres.ability.PerfRatingType;
import org.abchip.mimo.biz.humanres.ability.PerfReviewItem;
import org.abchip.mimo.biz.humanres.ability.PerfReviewItemType;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perf Review Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewItemImpl#getEmployeeRoleTypeId <em>Employee Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewItemImpl#getPerfReviewId <em>Perf Review Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewItemImpl#getPerfReviewItemSeqId <em>Perf Review Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewItemImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewItemImpl#getEmployeePartyId <em>Employee Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewItemImpl#getPerfRatingTypeId <em>Perf Rating Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewItemImpl#getPerfReviewItemTypeId <em>Perf Review Item Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerfReviewItemImpl extends BizEntityTypedImpl<PerfReviewItemType> implements PerfReviewItem {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getEmployeeRoleTypeId() <em>Employee Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPLOYEE_ROLE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmployeeRoleTypeId() <em>Employee Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected String employeeRoleTypeId = EMPLOYEE_ROLE_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerfReviewId() <em>Perf Review Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerfReviewId()
	 * @generated
	 * @ordered
	 */
	protected static final String PERF_REVIEW_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerfReviewId() <em>Perf Review Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerfReviewId()
	 * @generated
	 * @ordered
	 */
	protected String perfReviewId = PERF_REVIEW_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerfReviewItemSeqId() <em>Perf Review Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerfReviewItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String PERF_REVIEW_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerfReviewItemSeqId() <em>Perf Review Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerfReviewItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String perfReviewItemSeqId = PERF_REVIEW_ITEM_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmployeePartyId() <em>Employee Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeePartyId()
	 * @generated
	 * @ordered
	 */
	protected Party employeePartyId;

	/**
	 * The cached value of the '{@link #getPerfRatingTypeId() <em>Perf Rating Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerfRatingTypeId()
	 * @generated
	 * @ordered
	 */
	protected PerfRatingType perfRatingTypeId;

	/**
	 * The cached value of the '{@link #getPerfReviewItemTypeId() <em>Perf Review Item Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerfReviewItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected PerfReviewItemType perfReviewItemTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerfReviewItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbilityPackage.Literals.PERF_REVIEW_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PERF_REVIEW_ITEM__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getEmployeePartyId() {
		if (employeePartyId != null && ((EObject)employeePartyId).eIsProxy()) {
			InternalEObject oldEmployeePartyId = (InternalEObject)employeePartyId;
			employeePartyId = (Party)eResolveProxy(oldEmployeePartyId);
			if (employeePartyId != oldEmployeePartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbilityPackage.PERF_REVIEW_ITEM__EMPLOYEE_PARTY_ID, oldEmployeePartyId, employeePartyId));
			}
		}
		return employeePartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetEmployeePartyId() {
		return employeePartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmployeePartyId(Party newEmployeePartyId) {
		Party oldEmployeePartyId = employeePartyId;
		employeePartyId = newEmployeePartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PERF_REVIEW_ITEM__EMPLOYEE_PARTY_ID, oldEmployeePartyId, employeePartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmployeeRoleTypeId() {
		return employeeRoleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmployeeRoleTypeId(String newEmployeeRoleTypeId) {
		String oldEmployeeRoleTypeId = employeeRoleTypeId;
		employeeRoleTypeId = newEmployeeRoleTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PERF_REVIEW_ITEM__EMPLOYEE_ROLE_TYPE_ID, oldEmployeeRoleTypeId, employeeRoleTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerfRatingType getPerfRatingTypeId() {
		if (perfRatingTypeId != null && ((EObject)perfRatingTypeId).eIsProxy()) {
			InternalEObject oldPerfRatingTypeId = (InternalEObject)perfRatingTypeId;
			perfRatingTypeId = (PerfRatingType)eResolveProxy(oldPerfRatingTypeId);
			if (perfRatingTypeId != oldPerfRatingTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbilityPackage.PERF_REVIEW_ITEM__PERF_RATING_TYPE_ID, oldPerfRatingTypeId, perfRatingTypeId));
			}
		}
		return perfRatingTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerfRatingType basicGetPerfRatingTypeId() {
		return perfRatingTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerfRatingTypeId(PerfRatingType newPerfRatingTypeId) {
		PerfRatingType oldPerfRatingTypeId = perfRatingTypeId;
		perfRatingTypeId = newPerfRatingTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PERF_REVIEW_ITEM__PERF_RATING_TYPE_ID, oldPerfRatingTypeId, perfRatingTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPerfReviewId() {
		return perfReviewId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerfReviewId(String newPerfReviewId) {
		String oldPerfReviewId = perfReviewId;
		perfReviewId = newPerfReviewId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PERF_REVIEW_ITEM__PERF_REVIEW_ID, oldPerfReviewId, perfReviewId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPerfReviewItemSeqId() {
		return perfReviewItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerfReviewItemSeqId(String newPerfReviewItemSeqId) {
		String oldPerfReviewItemSeqId = perfReviewItemSeqId;
		perfReviewItemSeqId = newPerfReviewItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PERF_REVIEW_ITEM__PERF_REVIEW_ITEM_SEQ_ID, oldPerfReviewItemSeqId, perfReviewItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerfReviewItemType getPerfReviewItemTypeId() {
		if (perfReviewItemTypeId != null && ((EObject)perfReviewItemTypeId).eIsProxy()) {
			InternalEObject oldPerfReviewItemTypeId = (InternalEObject)perfReviewItemTypeId;
			perfReviewItemTypeId = (PerfReviewItemType)eResolveProxy(oldPerfReviewItemTypeId);
			if (perfReviewItemTypeId != oldPerfReviewItemTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbilityPackage.PERF_REVIEW_ITEM__PERF_REVIEW_ITEM_TYPE_ID, oldPerfReviewItemTypeId, perfReviewItemTypeId));
			}
		}
		return perfReviewItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerfReviewItemType basicGetPerfReviewItemTypeId() {
		return perfReviewItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerfReviewItemTypeId(PerfReviewItemType newPerfReviewItemTypeId) {
		PerfReviewItemType oldPerfReviewItemTypeId = perfReviewItemTypeId;
		perfReviewItemTypeId = newPerfReviewItemTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PERF_REVIEW_ITEM__PERF_REVIEW_ITEM_TYPE_ID, oldPerfReviewItemTypeId, perfReviewItemTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbilityPackage.PERF_REVIEW_ITEM__EMPLOYEE_ROLE_TYPE_ID:
				return getEmployeeRoleTypeId();
			case AbilityPackage.PERF_REVIEW_ITEM__PERF_REVIEW_ID:
				return getPerfReviewId();
			case AbilityPackage.PERF_REVIEW_ITEM__PERF_REVIEW_ITEM_SEQ_ID:
				return getPerfReviewItemSeqId();
			case AbilityPackage.PERF_REVIEW_ITEM__COMMENTS:
				return getComments();
			case AbilityPackage.PERF_REVIEW_ITEM__EMPLOYEE_PARTY_ID:
				if (resolve) return getEmployeePartyId();
				return basicGetEmployeePartyId();
			case AbilityPackage.PERF_REVIEW_ITEM__PERF_RATING_TYPE_ID:
				if (resolve) return getPerfRatingTypeId();
				return basicGetPerfRatingTypeId();
			case AbilityPackage.PERF_REVIEW_ITEM__PERF_REVIEW_ITEM_TYPE_ID:
				if (resolve) return getPerfReviewItemTypeId();
				return basicGetPerfReviewItemTypeId();
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
			case AbilityPackage.PERF_REVIEW_ITEM__EMPLOYEE_ROLE_TYPE_ID:
				setEmployeeRoleTypeId((String)newValue);
				return;
			case AbilityPackage.PERF_REVIEW_ITEM__PERF_REVIEW_ID:
				setPerfReviewId((String)newValue);
				return;
			case AbilityPackage.PERF_REVIEW_ITEM__PERF_REVIEW_ITEM_SEQ_ID:
				setPerfReviewItemSeqId((String)newValue);
				return;
			case AbilityPackage.PERF_REVIEW_ITEM__COMMENTS:
				setComments((String)newValue);
				return;
			case AbilityPackage.PERF_REVIEW_ITEM__EMPLOYEE_PARTY_ID:
				setEmployeePartyId((Party)newValue);
				return;
			case AbilityPackage.PERF_REVIEW_ITEM__PERF_RATING_TYPE_ID:
				setPerfRatingTypeId((PerfRatingType)newValue);
				return;
			case AbilityPackage.PERF_REVIEW_ITEM__PERF_REVIEW_ITEM_TYPE_ID:
				setPerfReviewItemTypeId((PerfReviewItemType)newValue);
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
			case AbilityPackage.PERF_REVIEW_ITEM__EMPLOYEE_ROLE_TYPE_ID:
				setEmployeeRoleTypeId(EMPLOYEE_ROLE_TYPE_ID_EDEFAULT);
				return;
			case AbilityPackage.PERF_REVIEW_ITEM__PERF_REVIEW_ID:
				setPerfReviewId(PERF_REVIEW_ID_EDEFAULT);
				return;
			case AbilityPackage.PERF_REVIEW_ITEM__PERF_REVIEW_ITEM_SEQ_ID:
				setPerfReviewItemSeqId(PERF_REVIEW_ITEM_SEQ_ID_EDEFAULT);
				return;
			case AbilityPackage.PERF_REVIEW_ITEM__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case AbilityPackage.PERF_REVIEW_ITEM__EMPLOYEE_PARTY_ID:
				setEmployeePartyId((Party)null);
				return;
			case AbilityPackage.PERF_REVIEW_ITEM__PERF_RATING_TYPE_ID:
				setPerfRatingTypeId((PerfRatingType)null);
				return;
			case AbilityPackage.PERF_REVIEW_ITEM__PERF_REVIEW_ITEM_TYPE_ID:
				setPerfReviewItemTypeId((PerfReviewItemType)null);
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
			case AbilityPackage.PERF_REVIEW_ITEM__EMPLOYEE_ROLE_TYPE_ID:
				return EMPLOYEE_ROLE_TYPE_ID_EDEFAULT == null ? employeeRoleTypeId != null : !EMPLOYEE_ROLE_TYPE_ID_EDEFAULT.equals(employeeRoleTypeId);
			case AbilityPackage.PERF_REVIEW_ITEM__PERF_REVIEW_ID:
				return PERF_REVIEW_ID_EDEFAULT == null ? perfReviewId != null : !PERF_REVIEW_ID_EDEFAULT.equals(perfReviewId);
			case AbilityPackage.PERF_REVIEW_ITEM__PERF_REVIEW_ITEM_SEQ_ID:
				return PERF_REVIEW_ITEM_SEQ_ID_EDEFAULT == null ? perfReviewItemSeqId != null : !PERF_REVIEW_ITEM_SEQ_ID_EDEFAULT.equals(perfReviewItemSeqId);
			case AbilityPackage.PERF_REVIEW_ITEM__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case AbilityPackage.PERF_REVIEW_ITEM__EMPLOYEE_PARTY_ID:
				return employeePartyId != null;
			case AbilityPackage.PERF_REVIEW_ITEM__PERF_RATING_TYPE_ID:
				return perfRatingTypeId != null;
			case AbilityPackage.PERF_REVIEW_ITEM__PERF_REVIEW_ITEM_TYPE_ID:
				return perfReviewItemTypeId != null;
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
		result.append(" (employeeRoleTypeId: ");
		result.append(employeeRoleTypeId);
		result.append(", perfReviewId: ");
		result.append(perfReviewId);
		result.append(", perfReviewItemSeqId: ");
		result.append(perfReviewItemSeqId);
		result.append(", comments: ");
		result.append(comments);
		result.append(')');
		return result.toString();
	}

} //PerfReviewItemImpl
