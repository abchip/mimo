/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.accounting.ledger.AcctgTrans;
import org.abchip.mimo.biz.accounting.ledger.AcctgTransType;
import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acctg Trans Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransTypeImpl#getAcctgTransTypeId <em>Acctg Trans Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransTypeImpl#getAcctgTransTypeAttrs <em>Acctg Trans Type Attrs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcctgTransTypeImpl extends BizEntityTypeImpl<AcctgTrans> implements AcctgTransType {
	/**
	 * The default value of the '{@link #getAcctgTransTypeId() <em>Acctg Trans Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcctgTransTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCTG_TRANS_TYPE_ID_EDEFAULT = null;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getAcctgTransTypeId() <em>Acctg Trans Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcctgTransTypeId()
	 * @generated
	 * @ordered
	 */
	protected String acctgTransTypeId = ACCTG_TRANS_TYPE_ID_EDEFAULT;
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
	 * The default value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected String parentTypeId = PARENT_TYPE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAcctgTransTypeAttrs() <em>Acctg Trans Type Attrs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcctgTransTypeAttrs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> acctgTransTypeAttrs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcctgTransTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.ACCTG_TRANS_TYPE;
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
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_TYPE__DESCRIPTION, oldDescription, description));
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
		boolean oldHasTable = hasTable;
		hasTable = newHasTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_TYPE__HAS_TABLE, oldHasTable, hasTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(String newParentTypeId) {
		String oldParentTypeId = parentTypeId;
		parentTypeId = newParentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getAcctgTransTypeAttrs() {
		if (acctgTransTypeAttrs == null) {
			acctgTransTypeAttrs = new EDataTypeUniqueEList<String>(String.class, this, LedgerPackage.ACCTG_TRANS_TYPE__ACCTG_TRANS_TYPE_ATTRS);
		}
		return acctgTransTypeAttrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> acctgTranss() {
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
	public List<String> childAcctgTransTypes() {
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
	public String getAcctgTransTypeId() {
		return acctgTransTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcctgTransTypeId(String newAcctgTransTypeId) {
		String oldAcctgTransTypeId = acctgTransTypeId;
		acctgTransTypeId = newAcctgTransTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_TYPE__ACCTG_TRANS_TYPE_ID, oldAcctgTransTypeId, acctgTransTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LedgerPackage.ACCTG_TRANS_TYPE__ACCTG_TRANS_TYPE_ID:
				return getAcctgTransTypeId();
			case LedgerPackage.ACCTG_TRANS_TYPE__DESCRIPTION:
				return getDescription();
			case LedgerPackage.ACCTG_TRANS_TYPE__HAS_TABLE:
				return isHasTable();
			case LedgerPackage.ACCTG_TRANS_TYPE__PARENT_TYPE_ID:
				return getParentTypeId();
			case LedgerPackage.ACCTG_TRANS_TYPE__ACCTG_TRANS_TYPE_ATTRS:
				return getAcctgTransTypeAttrs();
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
			case LedgerPackage.ACCTG_TRANS_TYPE__ACCTG_TRANS_TYPE_ID:
				setAcctgTransTypeId((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS_TYPE__PARENT_TYPE_ID:
				setParentTypeId((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS_TYPE__ACCTG_TRANS_TYPE_ATTRS:
				getAcctgTransTypeAttrs().clear();
				getAcctgTransTypeAttrs().addAll((Collection<? extends String>)newValue);
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
			case LedgerPackage.ACCTG_TRANS_TYPE__ACCTG_TRANS_TYPE_ID:
				setAcctgTransTypeId(ACCTG_TRANS_TYPE_ID_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS_TYPE__PARENT_TYPE_ID:
				setParentTypeId(PARENT_TYPE_ID_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS_TYPE__ACCTG_TRANS_TYPE_ATTRS:
				getAcctgTransTypeAttrs().clear();
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
			case LedgerPackage.ACCTG_TRANS_TYPE__ACCTG_TRANS_TYPE_ID:
				return ACCTG_TRANS_TYPE_ID_EDEFAULT == null ? acctgTransTypeId != null : !ACCTG_TRANS_TYPE_ID_EDEFAULT.equals(acctgTransTypeId);
			case LedgerPackage.ACCTG_TRANS_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case LedgerPackage.ACCTG_TRANS_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case LedgerPackage.ACCTG_TRANS_TYPE__PARENT_TYPE_ID:
				return PARENT_TYPE_ID_EDEFAULT == null ? parentTypeId != null : !PARENT_TYPE_ID_EDEFAULT.equals(parentTypeId);
			case LedgerPackage.ACCTG_TRANS_TYPE__ACCTG_TRANS_TYPE_ATTRS:
				return acctgTransTypeAttrs != null && !acctgTransTypeAttrs.isEmpty();
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
		result.append(" (acctgTransTypeId: ");
		result.append(acctgTransTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(", parentTypeId: ");
		result.append(parentTypeId);
		result.append(", acctgTransTypeAttrs: ");
		result.append(acctgTransTypeAttrs);
		result.append(')');
		return result.toString();
	}

} //AcctgTransTypeImpl
