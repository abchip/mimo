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

import org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans;
import org.abchip.mimo.biz.accounting.finaccount.FinAccountTransType;
import org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage;
import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fin Account Trans Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransTypeImpl#getFinAccountTransTypeId <em>Fin Account Trans Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransTypeImpl#getFinAccountTransTypeAttrs <em>Fin Account Trans Type Attrs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinAccountTransTypeImpl extends BizEntityTypeImpl<FinAccountTrans> implements FinAccountTransType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getFinAccountTransTypeId() <em>Fin Account Trans Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountTransTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String FIN_ACCOUNT_TRANS_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFinAccountTransTypeId() <em>Fin Account Trans Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountTransTypeId()
	 * @generated
	 * @ordered
	 */
	protected String finAccountTransTypeId = FIN_ACCOUNT_TRANS_TYPE_ID_EDEFAULT;
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
	protected FinAccountTransType parentTypeId;

	/**
	 * The cached value of the '{@link #getFinAccountTransTypeAttrs() <em>Fin Account Trans Type Attrs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountTransTypeAttrs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> finAccountTransTypeAttrs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinAccountTransTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinaccountPackage.Literals.FIN_ACCOUNT_TRANS_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE__HAS_TABLE, oldHasTable, hasTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccountTransType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (FinAccountTransType)eResolveProxy(oldParentTypeId);
			if (parentTypeId != oldParentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
			}
		}
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinAccountTransType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(FinAccountTransType newParentTypeId) {
		FinAccountTransType oldParentTypeId = parentTypeId;
		parentTypeId = newParentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getFinAccountTransTypeAttrs() {
		if (finAccountTransTypeAttrs == null) {
			finAccountTransTypeAttrs = new EDataTypeUniqueEList<String>(String.class, this, FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE__FIN_ACCOUNT_TRANS_TYPE_ATTRS);
		}
		return finAccountTransTypeAttrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childFinAccountTransTypes() {
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
	public List<String> finAccountTranss() {
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
	public String getFinAccountTransTypeId() {
		return finAccountTransTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountTransTypeId(String newFinAccountTransTypeId) {
		String oldFinAccountTransTypeId = finAccountTransTypeId;
		finAccountTransTypeId = newFinAccountTransTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE__FIN_ACCOUNT_TRANS_TYPE_ID, oldFinAccountTransTypeId, finAccountTransTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE__FIN_ACCOUNT_TRANS_TYPE_ID:
				return getFinAccountTransTypeId();
			case FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE__DESCRIPTION:
				return getDescription();
			case FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE__HAS_TABLE:
				return isHasTable();
			case FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
			case FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE__FIN_ACCOUNT_TRANS_TYPE_ATTRS:
				return getFinAccountTransTypeAttrs();
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
			case FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE__FIN_ACCOUNT_TRANS_TYPE_ID:
				setFinAccountTransTypeId((String)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE__PARENT_TYPE_ID:
				setParentTypeId((FinAccountTransType)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE__FIN_ACCOUNT_TRANS_TYPE_ATTRS:
				getFinAccountTransTypeAttrs().clear();
				getFinAccountTransTypeAttrs().addAll((Collection<? extends String>)newValue);
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
			case FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE__FIN_ACCOUNT_TRANS_TYPE_ID:
				setFinAccountTransTypeId(FIN_ACCOUNT_TRANS_TYPE_ID_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE__PARENT_TYPE_ID:
				setParentTypeId((FinAccountTransType)null);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE__FIN_ACCOUNT_TRANS_TYPE_ATTRS:
				getFinAccountTransTypeAttrs().clear();
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
			case FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE__FIN_ACCOUNT_TRANS_TYPE_ID:
				return FIN_ACCOUNT_TRANS_TYPE_ID_EDEFAULT == null ? finAccountTransTypeId != null : !FIN_ACCOUNT_TRANS_TYPE_ID_EDEFAULT.equals(finAccountTransTypeId);
			case FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
			case FinaccountPackage.FIN_ACCOUNT_TRANS_TYPE__FIN_ACCOUNT_TRANS_TYPE_ATTRS:
				return finAccountTransTypeAttrs != null && !finAccountTransTypeAttrs.isEmpty();
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
		result.append(" (finAccountTransTypeId: ");
		result.append(finAccountTransTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(", finAccountTransTypeAttrs: ");
		result.append(finAccountTransTypeAttrs);
		result.append(')');
		return result.toString();
	}

} //FinAccountTransTypeImpl
