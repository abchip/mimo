/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.ability.impl;

import org.abchip.mimo.biz.humanres.ability.AbilityPackage;
import org.abchip.mimo.biz.humanres.ability.PerfReviewItem;
import org.abchip.mimo.biz.humanres.ability.PerfReviewItemType;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perf Review Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewItemImpl#getEmployeePartyId <em>Employee Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewItemImpl#getEmployeeRoleTypeId <em>Employee Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewItemImpl#getPerfReviewId <em>Perf Review Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewItemImpl#getPerfReviewItemSeqId <em>Perf Review Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewItemImpl#getComments <em>Comments</em>}</li>
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
	 * The default value of the '{@link #getEmployeePartyId() <em>Employee Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeePartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPLOYEE_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmployeePartyId() <em>Employee Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeePartyId()
	 * @generated
	 * @ordered
	 */
	protected String employeePartyId = EMPLOYEE_PARTY_ID_EDEFAULT;

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
	 * The default value of the '{@link #getPerfRatingTypeId() <em>Perf Rating Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerfRatingTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PERF_RATING_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerfRatingTypeId() <em>Perf Rating Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerfRatingTypeId()
	 * @generated
	 * @ordered
	 */
	protected String perfRatingTypeId = PERF_RATING_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerfReviewItemTypeId() <em>Perf Review Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerfReviewItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PERF_REVIEW_ITEM_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerfReviewItemTypeId() <em>Perf Review Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerfReviewItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected String perfReviewItemTypeId = PERF_REVIEW_ITEM_TYPE_ID_EDEFAULT;

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
	public String getEmployeePartyId() {
		return employeePartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmployeePartyId(String newEmployeePartyId) {
		String oldEmployeePartyId = employeePartyId;
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
	public String getPerfRatingTypeId() {
		return perfRatingTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerfRatingTypeId(String newPerfRatingTypeId) {
		String oldPerfRatingTypeId = perfRatingTypeId;
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
	public String getPerfReviewItemTypeId() {
		return perfReviewItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerfReviewItemTypeId(String newPerfReviewItemTypeId) {
		String oldPerfReviewItemTypeId = perfReviewItemTypeId;
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
			case AbilityPackage.PERF_REVIEW_ITEM__EMPLOYEE_PARTY_ID:
				return getEmployeePartyId();
			case AbilityPackage.PERF_REVIEW_ITEM__EMPLOYEE_ROLE_TYPE_ID:
				return getEmployeeRoleTypeId();
			case AbilityPackage.PERF_REVIEW_ITEM__PERF_REVIEW_ID:
				return getPerfReviewId();
			case AbilityPackage.PERF_REVIEW_ITEM__PERF_REVIEW_ITEM_SEQ_ID:
				return getPerfReviewItemSeqId();
			case AbilityPackage.PERF_REVIEW_ITEM__COMMENTS:
				return getComments();
			case AbilityPackage.PERF_REVIEW_ITEM__PERF_RATING_TYPE_ID:
				return getPerfRatingTypeId();
			case AbilityPackage.PERF_REVIEW_ITEM__PERF_REVIEW_ITEM_TYPE_ID:
				return getPerfReviewItemTypeId();
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
			case AbilityPackage.PERF_REVIEW_ITEM__EMPLOYEE_PARTY_ID:
				setEmployeePartyId((String)newValue);
				return;
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
			case AbilityPackage.PERF_REVIEW_ITEM__PERF_RATING_TYPE_ID:
				setPerfRatingTypeId((String)newValue);
				return;
			case AbilityPackage.PERF_REVIEW_ITEM__PERF_REVIEW_ITEM_TYPE_ID:
				setPerfReviewItemTypeId((String)newValue);
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
			case AbilityPackage.PERF_REVIEW_ITEM__EMPLOYEE_PARTY_ID:
				setEmployeePartyId(EMPLOYEE_PARTY_ID_EDEFAULT);
				return;
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
			case AbilityPackage.PERF_REVIEW_ITEM__PERF_RATING_TYPE_ID:
				setPerfRatingTypeId(PERF_RATING_TYPE_ID_EDEFAULT);
				return;
			case AbilityPackage.PERF_REVIEW_ITEM__PERF_REVIEW_ITEM_TYPE_ID:
				setPerfReviewItemTypeId(PERF_REVIEW_ITEM_TYPE_ID_EDEFAULT);
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
			case AbilityPackage.PERF_REVIEW_ITEM__EMPLOYEE_PARTY_ID:
				return EMPLOYEE_PARTY_ID_EDEFAULT == null ? employeePartyId != null : !EMPLOYEE_PARTY_ID_EDEFAULT.equals(employeePartyId);
			case AbilityPackage.PERF_REVIEW_ITEM__EMPLOYEE_ROLE_TYPE_ID:
				return EMPLOYEE_ROLE_TYPE_ID_EDEFAULT == null ? employeeRoleTypeId != null : !EMPLOYEE_ROLE_TYPE_ID_EDEFAULT.equals(employeeRoleTypeId);
			case AbilityPackage.PERF_REVIEW_ITEM__PERF_REVIEW_ID:
				return PERF_REVIEW_ID_EDEFAULT == null ? perfReviewId != null : !PERF_REVIEW_ID_EDEFAULT.equals(perfReviewId);
			case AbilityPackage.PERF_REVIEW_ITEM__PERF_REVIEW_ITEM_SEQ_ID:
				return PERF_REVIEW_ITEM_SEQ_ID_EDEFAULT == null ? perfReviewItemSeqId != null : !PERF_REVIEW_ITEM_SEQ_ID_EDEFAULT.equals(perfReviewItemSeqId);
			case AbilityPackage.PERF_REVIEW_ITEM__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case AbilityPackage.PERF_REVIEW_ITEM__PERF_RATING_TYPE_ID:
				return PERF_RATING_TYPE_ID_EDEFAULT == null ? perfRatingTypeId != null : !PERF_RATING_TYPE_ID_EDEFAULT.equals(perfRatingTypeId);
			case AbilityPackage.PERF_REVIEW_ITEM__PERF_REVIEW_ITEM_TYPE_ID:
				return PERF_REVIEW_ITEM_TYPE_ID_EDEFAULT == null ? perfReviewItemTypeId != null : !PERF_REVIEW_ITEM_TYPE_ID_EDEFAULT.equals(perfReviewItemTypeId);
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
		result.append(" (employeePartyId: ");
		result.append(employeePartyId);
		result.append(", employeeRoleTypeId: ");
		result.append(employeeRoleTypeId);
		result.append(", perfReviewId: ");
		result.append(perfReviewId);
		result.append(", perfReviewItemSeqId: ");
		result.append(perfReviewItemSeqId);
		result.append(", comments: ");
		result.append(comments);
		result.append(", perfRatingTypeId: ");
		result.append(perfRatingTypeId);
		result.append(", perfReviewItemTypeId: ");
		result.append(perfReviewItemTypeId);
		result.append(')');
		return result.toString();
	}

} //PerfReviewItemImpl
