/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.inventory.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.inventory.InventoryPackage;
import org.abchip.mimo.biz.product.inventory.VarianceReason;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variance Reason</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.VarianceReasonImpl#getVarianceReasonId <em>Variance Reason Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.VarianceReasonImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.VarianceReasonImpl#getVarianceReasonGlAccounts <em>Variance Reason Gl Accounts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarianceReasonImpl extends BizEntityImpl implements VarianceReason {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getVarianceReasonId() <em>Variance Reason Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarianceReasonId()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIANCE_REASON_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarianceReasonId() <em>Variance Reason Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarianceReasonId()
	 * @generated
	 * @ordered
	 */
	protected String varianceReasonId = VARIANCE_REASON_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getVarianceReasonGlAccounts() <em>Variance Reason Gl Accounts</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarianceReasonGlAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<String> varianceReasonGlAccounts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VarianceReasonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.VARIANCE_REASON;
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
	public String getVarianceReasonId() {
		return varianceReasonId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarianceReasonId(String newVarianceReasonId) {
		varianceReasonId = newVarianceReasonId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getVarianceReasonGlAccounts() {
		if (varianceReasonGlAccounts == null) {
			varianceReasonGlAccounts = new BasicInternalEList<String>(String.class);
		}
		return varianceReasonGlAccounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> inventoryItemVariances() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InventoryPackage.VARIANCE_REASON__VARIANCE_REASON_ID:
				return getVarianceReasonId();
			case InventoryPackage.VARIANCE_REASON__DESCRIPTION:
				return getDescription();
			case InventoryPackage.VARIANCE_REASON__VARIANCE_REASON_GL_ACCOUNTS:
				return getVarianceReasonGlAccounts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InventoryPackage.VARIANCE_REASON__VARIANCE_REASON_ID:
				setVarianceReasonId((String)newValue);
				return;
			case InventoryPackage.VARIANCE_REASON__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case InventoryPackage.VARIANCE_REASON__VARIANCE_REASON_GL_ACCOUNTS:
				getVarianceReasonGlAccounts().clear();
				getVarianceReasonGlAccounts().addAll((Collection<? extends String>)newValue);
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
			case InventoryPackage.VARIANCE_REASON__VARIANCE_REASON_ID:
				setVarianceReasonId(VARIANCE_REASON_ID_EDEFAULT);
				return;
			case InventoryPackage.VARIANCE_REASON__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case InventoryPackage.VARIANCE_REASON__VARIANCE_REASON_GL_ACCOUNTS:
				getVarianceReasonGlAccounts().clear();
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
			case InventoryPackage.VARIANCE_REASON__VARIANCE_REASON_ID:
				return VARIANCE_REASON_ID_EDEFAULT == null ? varianceReasonId != null : !VARIANCE_REASON_ID_EDEFAULT.equals(varianceReasonId);
			case InventoryPackage.VARIANCE_REASON__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case InventoryPackage.VARIANCE_REASON__VARIANCE_REASON_GL_ACCOUNTS:
				return varianceReasonGlAccounts != null && !varianceReasonGlAccounts.isEmpty();
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
		result.append(" (varianceReasonId: ");
		result.append(varianceReasonId);
		result.append(", description: ");
		result.append(description);
		result.append(", varianceReasonGlAccounts: ");
		result.append(varianceReasonGlAccounts);
		result.append(')');
		return result.toString();
	}

} //VarianceReasonImpl
