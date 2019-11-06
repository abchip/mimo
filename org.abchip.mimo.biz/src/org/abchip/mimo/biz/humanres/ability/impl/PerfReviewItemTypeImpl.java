/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.ability.impl;

import java.util.List;

import org.abchip.mimo.biz.humanres.ability.AbilityPackage;
import org.abchip.mimo.biz.humanres.ability.PerfReviewItem;
import org.abchip.mimo.biz.humanres.ability.PerfReviewItemType;
import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perf Review Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewItemTypeImpl#getPerfReviewItemTypeId <em>Perf Review Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewItemTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewItemTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PerfReviewItemTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerfReviewItemTypeImpl extends BizEntityTypeImpl<PerfReviewItem> implements PerfReviewItemType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_TABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected boolean hasTable = HAS_TABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected PerfReviewItemType parentTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerfReviewItemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbilityPackage.Literals.PERF_REVIEW_ITEM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return hasTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		hasTable = newHasTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerfReviewItemType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (PerfReviewItemType)eResolveProxy(oldParentTypeId);
			if (parentTypeId != oldParentTypeId) {
			}
		}
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerfReviewItemType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(PerfReviewItemType newParentTypeId) {
		parentTypeId = newParentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childPerfReviewItemTypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
		perfReviewItemTypeId = newPerfReviewItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbilityPackage.PERF_REVIEW_ITEM_TYPE__PERF_REVIEW_ITEM_TYPE_ID:
				return getPerfReviewItemTypeId();
			case AbilityPackage.PERF_REVIEW_ITEM_TYPE__DESCRIPTION:
				return getDescription();
			case AbilityPackage.PERF_REVIEW_ITEM_TYPE__HAS_TABLE:
				return isHasTable();
			case AbilityPackage.PERF_REVIEW_ITEM_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
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
			case AbilityPackage.PERF_REVIEW_ITEM_TYPE__PERF_REVIEW_ITEM_TYPE_ID:
				setPerfReviewItemTypeId((String)newValue);
				return;
			case AbilityPackage.PERF_REVIEW_ITEM_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AbilityPackage.PERF_REVIEW_ITEM_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case AbilityPackage.PERF_REVIEW_ITEM_TYPE__PARENT_TYPE_ID:
				setParentTypeId((PerfReviewItemType)newValue);
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
			case AbilityPackage.PERF_REVIEW_ITEM_TYPE__PERF_REVIEW_ITEM_TYPE_ID:
				setPerfReviewItemTypeId(PERF_REVIEW_ITEM_TYPE_ID_EDEFAULT);
				return;
			case AbilityPackage.PERF_REVIEW_ITEM_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AbilityPackage.PERF_REVIEW_ITEM_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case AbilityPackage.PERF_REVIEW_ITEM_TYPE__PARENT_TYPE_ID:
				setParentTypeId((PerfReviewItemType)null);
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
			case AbilityPackage.PERF_REVIEW_ITEM_TYPE__PERF_REVIEW_ITEM_TYPE_ID:
				return PERF_REVIEW_ITEM_TYPE_ID_EDEFAULT == null ? perfReviewItemTypeId != null : !PERF_REVIEW_ITEM_TYPE_ID_EDEFAULT.equals(perfReviewItemTypeId);
			case AbilityPackage.PERF_REVIEW_ITEM_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AbilityPackage.PERF_REVIEW_ITEM_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case AbilityPackage.PERF_REVIEW_ITEM_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
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
		result.append(" (perfReviewItemTypeId: ");
		result.append(perfReviewItemTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(')');
		return result.toString();
	}

} //PerfReviewItemTypeImpl
