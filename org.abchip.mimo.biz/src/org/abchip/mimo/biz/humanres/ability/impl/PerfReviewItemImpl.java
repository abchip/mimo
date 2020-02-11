/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
import org.eclipse.emf.ecore.EClass;

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
		return (String)eGet(AbilityPackage.Literals.PERF_REVIEW_ITEM__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		eSet(AbilityPackage.Literals.PERF_REVIEW_ITEM__COMMENTS, newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getEmployeePartyId() {
		return (Party)eGet(AbilityPackage.Literals.PERF_REVIEW_ITEM__EMPLOYEE_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmployeePartyId(Party newEmployeePartyId) {
		eSet(AbilityPackage.Literals.PERF_REVIEW_ITEM__EMPLOYEE_PARTY_ID, newEmployeePartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmployeeRoleTypeId() {
		return (String)eGet(AbilityPackage.Literals.PERF_REVIEW_ITEM__EMPLOYEE_ROLE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmployeeRoleTypeId(String newEmployeeRoleTypeId) {
		eSet(AbilityPackage.Literals.PERF_REVIEW_ITEM__EMPLOYEE_ROLE_TYPE_ID, newEmployeeRoleTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerfRatingType getPerfRatingTypeId() {
		return (PerfRatingType)eGet(AbilityPackage.Literals.PERF_REVIEW_ITEM__PERF_RATING_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerfRatingTypeId(PerfRatingType newPerfRatingTypeId) {
		eSet(AbilityPackage.Literals.PERF_REVIEW_ITEM__PERF_RATING_TYPE_ID, newPerfRatingTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPerfReviewId() {
		return (String)eGet(AbilityPackage.Literals.PERF_REVIEW_ITEM__PERF_REVIEW_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerfReviewId(String newPerfReviewId) {
		eSet(AbilityPackage.Literals.PERF_REVIEW_ITEM__PERF_REVIEW_ID, newPerfReviewId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPerfReviewItemSeqId() {
		return (String)eGet(AbilityPackage.Literals.PERF_REVIEW_ITEM__PERF_REVIEW_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerfReviewItemSeqId(String newPerfReviewItemSeqId) {
		eSet(AbilityPackage.Literals.PERF_REVIEW_ITEM__PERF_REVIEW_ITEM_SEQ_ID, newPerfReviewItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerfReviewItemType getPerfReviewItemTypeId() {
		return (PerfReviewItemType)eGet(AbilityPackage.Literals.PERF_REVIEW_ITEM__PERF_REVIEW_ITEM_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerfReviewItemTypeId(PerfReviewItemType newPerfReviewItemTypeId) {
		eSet(AbilityPackage.Literals.PERF_REVIEW_ITEM__PERF_REVIEW_ITEM_TYPE_ID, newPerfReviewItemTypeId);
	}

} //PerfReviewItemImpl
