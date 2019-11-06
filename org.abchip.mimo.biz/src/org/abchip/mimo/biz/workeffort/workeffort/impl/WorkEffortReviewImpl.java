/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort.impl;

import java.util.Date;

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortReview;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Effort Review</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortReviewImpl#getReviewDate <em>Review Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortReviewImpl#isPostedAnonymous <em>Posted Anonymous</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortReviewImpl#getRating <em>Rating</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortReviewImpl#getReviewText <em>Review Text</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortReviewImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortReviewImpl#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortReviewImpl#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkEffortReviewImpl extends BizEntityImpl implements WorkEffortReview {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getReviewDate() <em>Review Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date REVIEW_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReviewDate() <em>Review Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewDate()
	 * @generated
	 * @ordered
	 */
	protected Date reviewDate = REVIEW_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPostedAnonymous() <em>Posted Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPostedAnonymous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POSTED_ANONYMOUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPostedAnonymous() <em>Posted Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPostedAnonymous()
	 * @generated
	 * @ordered
	 */
	protected boolean postedAnonymous = POSTED_ANONYMOUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRating() <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating()
	 * @generated
	 * @ordered
	 */
	protected static final double RATING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRating() <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating()
	 * @generated
	 * @ordered
	 */
	protected double rating = RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getReviewText() <em>Review Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewText()
	 * @generated
	 * @ordered
	 */
	protected static final String REVIEW_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReviewText() <em>Review Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewText()
	 * @generated
	 * @ordered
	 */
	protected String reviewText = REVIEW_TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected WorkEffort workEffortId;

	/**
	 * The cached value of the '{@link #getUserLoginId() <em>User Login Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected UserLogin userLoginId;

	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkEffortReviewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkeffortPackage.Literals.WORK_EFFORT_REVIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRating() {
		return rating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRating(double newRating) {
		rating = newRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReviewDate() {
		return reviewDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReviewDate(Date newReviewDate) {
		reviewDate = newReviewDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPostedAnonymous() {
		return postedAnonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostedAnonymous(boolean newPostedAnonymous) {
		postedAnonymous = newPostedAnonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReviewText() {
		return reviewText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReviewText(String newReviewText) {
		reviewText = newReviewText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		statusId = newStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getUserLoginId() {
		if (userLoginId != null && ((EObject)userLoginId).eIsProxy()) {
			InternalEObject oldUserLoginId = (InternalEObject)userLoginId;
			userLoginId = (UserLogin)eResolveProxy(oldUserLoginId);
			if (userLoginId != oldUserLoginId) {
			}
		}
		return userLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetUserLoginId() {
		return userLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserLoginId(UserLogin newUserLoginId) {
		userLoginId = newUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffort getWorkEffortId() {
		if (workEffortId != null && ((EObject)workEffortId).eIsProxy()) {
			InternalEObject oldWorkEffortId = (InternalEObject)workEffortId;
			workEffortId = (WorkEffort)eResolveProxy(oldWorkEffortId);
			if (workEffortId != oldWorkEffortId) {
			}
		}
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkEffort basicGetWorkEffortId() {
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortId(WorkEffort newWorkEffortId) {
		workEffortId = newWorkEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkeffortPackage.WORK_EFFORT_REVIEW__REVIEW_DATE:
				return getReviewDate();
			case WorkeffortPackage.WORK_EFFORT_REVIEW__POSTED_ANONYMOUS:
				return isPostedAnonymous();
			case WorkeffortPackage.WORK_EFFORT_REVIEW__RATING:
				return getRating();
			case WorkeffortPackage.WORK_EFFORT_REVIEW__REVIEW_TEXT:
				return getReviewText();
			case WorkeffortPackage.WORK_EFFORT_REVIEW__WORK_EFFORT_ID:
				if (resolve) return getWorkEffortId();
				return basicGetWorkEffortId();
			case WorkeffortPackage.WORK_EFFORT_REVIEW__USER_LOGIN_ID:
				if (resolve) return getUserLoginId();
				return basicGetUserLoginId();
			case WorkeffortPackage.WORK_EFFORT_REVIEW__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
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
			case WorkeffortPackage.WORK_EFFORT_REVIEW__REVIEW_DATE:
				setReviewDate((Date)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_REVIEW__POSTED_ANONYMOUS:
				setPostedAnonymous((Boolean)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_REVIEW__RATING:
				setRating((Double)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_REVIEW__REVIEW_TEXT:
				setReviewText((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_REVIEW__WORK_EFFORT_ID:
				setWorkEffortId((WorkEffort)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_REVIEW__USER_LOGIN_ID:
				setUserLoginId((UserLogin)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_REVIEW__STATUS_ID:
				setStatusId((StatusItem)newValue);
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
			case WorkeffortPackage.WORK_EFFORT_REVIEW__REVIEW_DATE:
				setReviewDate(REVIEW_DATE_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_REVIEW__POSTED_ANONYMOUS:
				setPostedAnonymous(POSTED_ANONYMOUS_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_REVIEW__RATING:
				setRating(RATING_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_REVIEW__REVIEW_TEXT:
				setReviewText(REVIEW_TEXT_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_REVIEW__WORK_EFFORT_ID:
				setWorkEffortId((WorkEffort)null);
				return;
			case WorkeffortPackage.WORK_EFFORT_REVIEW__USER_LOGIN_ID:
				setUserLoginId((UserLogin)null);
				return;
			case WorkeffortPackage.WORK_EFFORT_REVIEW__STATUS_ID:
				setStatusId((StatusItem)null);
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
			case WorkeffortPackage.WORK_EFFORT_REVIEW__REVIEW_DATE:
				return REVIEW_DATE_EDEFAULT == null ? reviewDate != null : !REVIEW_DATE_EDEFAULT.equals(reviewDate);
			case WorkeffortPackage.WORK_EFFORT_REVIEW__POSTED_ANONYMOUS:
				return postedAnonymous != POSTED_ANONYMOUS_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT_REVIEW__RATING:
				return rating != RATING_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT_REVIEW__REVIEW_TEXT:
				return REVIEW_TEXT_EDEFAULT == null ? reviewText != null : !REVIEW_TEXT_EDEFAULT.equals(reviewText);
			case WorkeffortPackage.WORK_EFFORT_REVIEW__WORK_EFFORT_ID:
				return workEffortId != null;
			case WorkeffortPackage.WORK_EFFORT_REVIEW__USER_LOGIN_ID:
				return userLoginId != null;
			case WorkeffortPackage.WORK_EFFORT_REVIEW__STATUS_ID:
				return statusId != null;
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
		result.append(" (reviewDate: ");
		result.append(reviewDate);
		result.append(", postedAnonymous: ");
		result.append(postedAnonymous);
		result.append(", rating: ");
		result.append(rating);
		result.append(", reviewText: ");
		result.append(reviewText);
		result.append(')');
		return result.toString();
	}

} //WorkEffortReviewImpl
