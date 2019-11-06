/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.finaccount.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.accounting.finaccount.FinAccount;
import org.abchip.mimo.biz.accounting.finaccount.FinAccountType;
import org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fin Account Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeImpl#getFinAccountTypeId <em>Fin Account Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeImpl#isIsRefundable <em>Is Refundable</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeImpl#getReplenishEnumId <em>Replenish Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeImpl#getFinAccountTypeAttrs <em>Fin Account Type Attrs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeImpl#getFinAccountTypeGlAccounts <em>Fin Account Type Gl Accounts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinAccountTypeImpl extends BizEntityTypeImpl<FinAccount> implements FinAccountType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getFinAccountTypeId() <em>Fin Account Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String FIN_ACCOUNT_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFinAccountTypeId() <em>Fin Account Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountTypeId()
	 * @generated
	 * @ordered
	 */
	protected String finAccountTypeId = FIN_ACCOUNT_TYPE_ID_EDEFAULT;
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
	 * The default value of the '{@link #isIsRefundable() <em>Is Refundable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRefundable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REFUNDABLE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsRefundable() <em>Is Refundable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRefundable()
	 * @generated
	 * @ordered
	 */
	protected boolean isRefundable = IS_REFUNDABLE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected FinAccountType parentTypeId;
	/**
	 * The cached value of the '{@link #getReplenishEnumId() <em>Replenish Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplenishEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration replenishEnumId;

	/**
	 * The cached value of the '{@link #getFinAccountTypeAttrs() <em>Fin Account Type Attrs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountTypeAttrs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> finAccountTypeAttrs;
	/**
	 * The cached value of the '{@link #getFinAccountTypeGlAccounts() <em>Fin Account Type Gl Accounts</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountTypeGlAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<String> finAccountTypeGlAccounts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinAccountTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinaccountPackage.Literals.FIN_ACCOUNT_TYPE;
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
	public boolean isIsRefundable() {
		return isRefundable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsRefundable(boolean newIsRefundable) {
		isRefundable = newIsRefundable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getReplenishEnumId() {
		if (replenishEnumId != null && ((EObject)replenishEnumId).eIsProxy()) {
			InternalEObject oldReplenishEnumId = (InternalEObject)replenishEnumId;
			replenishEnumId = (Enumeration)eResolveProxy(oldReplenishEnumId);
			if (replenishEnumId != oldReplenishEnumId) {
			}
		}
		return replenishEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetReplenishEnumId() {
		return replenishEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplenishEnumId(Enumeration newReplenishEnumId) {
		replenishEnumId = newReplenishEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getFinAccountTypeAttrs() {
		if (finAccountTypeAttrs == null) {
			finAccountTypeAttrs = new BasicInternalEList<String>(String.class);
		}
		return finAccountTypeAttrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getFinAccountTypeGlAccounts() {
		if (finAccountTypeGlAccounts == null) {
			finAccountTypeGlAccounts = new BasicInternalEList<String>(String.class);
		}
		return finAccountTypeGlAccounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childFinAccountTypes() {
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
	public List<String> finAccounts() {
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
	public List<String> productStoreFinActSettings() {
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
	public FinAccountType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (FinAccountType)eResolveProxy(oldParentTypeId);
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
	public FinAccountType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(FinAccountType newParentTypeId) {
		parentTypeId = newParentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFinAccountTypeId() {
		return finAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountTypeId(String newFinAccountTypeId) {
		finAccountTypeId = newFinAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinaccountPackage.FIN_ACCOUNT_TYPE__FIN_ACCOUNT_TYPE_ID:
				return getFinAccountTypeId();
			case FinaccountPackage.FIN_ACCOUNT_TYPE__DESCRIPTION:
				return getDescription();
			case FinaccountPackage.FIN_ACCOUNT_TYPE__HAS_TABLE:
				return isHasTable();
			case FinaccountPackage.FIN_ACCOUNT_TYPE__IS_REFUNDABLE:
				return isIsRefundable();
			case FinaccountPackage.FIN_ACCOUNT_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
			case FinaccountPackage.FIN_ACCOUNT_TYPE__REPLENISH_ENUM_ID:
				if (resolve) return getReplenishEnumId();
				return basicGetReplenishEnumId();
			case FinaccountPackage.FIN_ACCOUNT_TYPE__FIN_ACCOUNT_TYPE_ATTRS:
				return getFinAccountTypeAttrs();
			case FinaccountPackage.FIN_ACCOUNT_TYPE__FIN_ACCOUNT_TYPE_GL_ACCOUNTS:
				return getFinAccountTypeGlAccounts();
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
			case FinaccountPackage.FIN_ACCOUNT_TYPE__FIN_ACCOUNT_TYPE_ID:
				setFinAccountTypeId((String)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TYPE__IS_REFUNDABLE:
				setIsRefundable((Boolean)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TYPE__PARENT_TYPE_ID:
				setParentTypeId((FinAccountType)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TYPE__REPLENISH_ENUM_ID:
				setReplenishEnumId((Enumeration)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TYPE__FIN_ACCOUNT_TYPE_ATTRS:
				getFinAccountTypeAttrs().clear();
				getFinAccountTypeAttrs().addAll((Collection<? extends String>)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TYPE__FIN_ACCOUNT_TYPE_GL_ACCOUNTS:
				getFinAccountTypeGlAccounts().clear();
				getFinAccountTypeGlAccounts().addAll((Collection<? extends String>)newValue);
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
			case FinaccountPackage.FIN_ACCOUNT_TYPE__FIN_ACCOUNT_TYPE_ID:
				setFinAccountTypeId(FIN_ACCOUNT_TYPE_ID_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TYPE__IS_REFUNDABLE:
				setIsRefundable(IS_REFUNDABLE_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TYPE__PARENT_TYPE_ID:
				setParentTypeId((FinAccountType)null);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TYPE__REPLENISH_ENUM_ID:
				setReplenishEnumId((Enumeration)null);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TYPE__FIN_ACCOUNT_TYPE_ATTRS:
				getFinAccountTypeAttrs().clear();
				return;
			case FinaccountPackage.FIN_ACCOUNT_TYPE__FIN_ACCOUNT_TYPE_GL_ACCOUNTS:
				getFinAccountTypeGlAccounts().clear();
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
			case FinaccountPackage.FIN_ACCOUNT_TYPE__FIN_ACCOUNT_TYPE_ID:
				return FIN_ACCOUNT_TYPE_ID_EDEFAULT == null ? finAccountTypeId != null : !FIN_ACCOUNT_TYPE_ID_EDEFAULT.equals(finAccountTypeId);
			case FinaccountPackage.FIN_ACCOUNT_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FinaccountPackage.FIN_ACCOUNT_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case FinaccountPackage.FIN_ACCOUNT_TYPE__IS_REFUNDABLE:
				return isRefundable != IS_REFUNDABLE_EDEFAULT;
			case FinaccountPackage.FIN_ACCOUNT_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
			case FinaccountPackage.FIN_ACCOUNT_TYPE__REPLENISH_ENUM_ID:
				return replenishEnumId != null;
			case FinaccountPackage.FIN_ACCOUNT_TYPE__FIN_ACCOUNT_TYPE_ATTRS:
				return finAccountTypeAttrs != null && !finAccountTypeAttrs.isEmpty();
			case FinaccountPackage.FIN_ACCOUNT_TYPE__FIN_ACCOUNT_TYPE_GL_ACCOUNTS:
				return finAccountTypeGlAccounts != null && !finAccountTypeGlAccounts.isEmpty();
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
		result.append(" (finAccountTypeId: ");
		result.append(finAccountTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(", isRefundable: ");
		result.append(isRefundable);
		result.append(", finAccountTypeAttrs: ");
		result.append(finAccountTypeAttrs);
		result.append(", finAccountTypeGlAccounts: ");
		result.append(finAccountTypeGlAccounts);
		result.append(')');
		return result.toString();
	}

} //FinAccountTypeImpl
