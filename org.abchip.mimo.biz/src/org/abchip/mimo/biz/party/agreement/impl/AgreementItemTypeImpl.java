/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.agreement.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.party.agreement.AgreementItem;
import org.abchip.mimo.biz.party.agreement.AgreementItemType;
import org.abchip.mimo.biz.party.agreement.AgreementPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agreement Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementItemTypeImpl#getAgreementItemTypeId <em>Agreement Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementItemTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementItemTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementItemTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementItemTypeImpl#getAgreementItemTypeAttrs <em>Agreement Item Type Attrs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgreementItemTypeImpl extends BizEntityTypeImpl<AgreementItem> implements AgreementItemType {
	/**
	 * The default value of the '{@link #getAgreementItemTypeId() <em>Agreement Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String AGREEMENT_ITEM_TYPE_ID_EDEFAULT = null;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getAgreementItemTypeId() <em>Agreement Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected String agreementItemTypeId = AGREEMENT_ITEM_TYPE_ID_EDEFAULT;
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
	protected AgreementItemType parentTypeId;

	/**
	 * The cached value of the '{@link #getAgreementItemTypeAttrs() <em>Agreement Item Type Attrs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementItemTypeAttrs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> agreementItemTypeAttrs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgreementItemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgreementPackage.Literals.AGREEMENT_ITEM_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_ITEM_TYPE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_ITEM_TYPE__HAS_TABLE, oldHasTable, hasTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgreementItemType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (AgreementItemType)eResolveProxy(oldParentTypeId);
			if (parentTypeId != oldParentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AgreementPackage.AGREEMENT_ITEM_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
			}
		}
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementItemType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(AgreementItemType newParentTypeId) {
		AgreementItemType oldParentTypeId = parentTypeId;
		parentTypeId = newParentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_ITEM_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getAgreementItemTypeAttrs() {
		if (agreementItemTypeAttrs == null) {
			agreementItemTypeAttrs = new EDataTypeUniqueEList<String>(String.class, this, AgreementPackage.AGREEMENT_ITEM_TYPE__AGREEMENT_ITEM_TYPE_ATTRS);
		}
		return agreementItemTypeAttrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> agreementItems() {
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
	public List<String> childAgreementItemTypes() {
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
	public String getAgreementItemTypeId() {
		return agreementItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgreementItemTypeId(String newAgreementItemTypeId) {
		String oldAgreementItemTypeId = agreementItemTypeId;
		agreementItemTypeId = newAgreementItemTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_ITEM_TYPE__AGREEMENT_ITEM_TYPE_ID, oldAgreementItemTypeId, agreementItemTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AgreementPackage.AGREEMENT_ITEM_TYPE__AGREEMENT_ITEM_TYPE_ID:
				return getAgreementItemTypeId();
			case AgreementPackage.AGREEMENT_ITEM_TYPE__DESCRIPTION:
				return getDescription();
			case AgreementPackage.AGREEMENT_ITEM_TYPE__HAS_TABLE:
				return isHasTable();
			case AgreementPackage.AGREEMENT_ITEM_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
			case AgreementPackage.AGREEMENT_ITEM_TYPE__AGREEMENT_ITEM_TYPE_ATTRS:
				return getAgreementItemTypeAttrs();
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
			case AgreementPackage.AGREEMENT_ITEM_TYPE__AGREEMENT_ITEM_TYPE_ID:
				setAgreementItemTypeId((String)newValue);
				return;
			case AgreementPackage.AGREEMENT_ITEM_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AgreementPackage.AGREEMENT_ITEM_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case AgreementPackage.AGREEMENT_ITEM_TYPE__PARENT_TYPE_ID:
				setParentTypeId((AgreementItemType)newValue);
				return;
			case AgreementPackage.AGREEMENT_ITEM_TYPE__AGREEMENT_ITEM_TYPE_ATTRS:
				getAgreementItemTypeAttrs().clear();
				getAgreementItemTypeAttrs().addAll((Collection<? extends String>)newValue);
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
			case AgreementPackage.AGREEMENT_ITEM_TYPE__AGREEMENT_ITEM_TYPE_ID:
				setAgreementItemTypeId(AGREEMENT_ITEM_TYPE_ID_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_ITEM_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_ITEM_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_ITEM_TYPE__PARENT_TYPE_ID:
				setParentTypeId((AgreementItemType)null);
				return;
			case AgreementPackage.AGREEMENT_ITEM_TYPE__AGREEMENT_ITEM_TYPE_ATTRS:
				getAgreementItemTypeAttrs().clear();
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
			case AgreementPackage.AGREEMENT_ITEM_TYPE__AGREEMENT_ITEM_TYPE_ID:
				return AGREEMENT_ITEM_TYPE_ID_EDEFAULT == null ? agreementItemTypeId != null : !AGREEMENT_ITEM_TYPE_ID_EDEFAULT.equals(agreementItemTypeId);
			case AgreementPackage.AGREEMENT_ITEM_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AgreementPackage.AGREEMENT_ITEM_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case AgreementPackage.AGREEMENT_ITEM_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
			case AgreementPackage.AGREEMENT_ITEM_TYPE__AGREEMENT_ITEM_TYPE_ATTRS:
				return agreementItemTypeAttrs != null && !agreementItemTypeAttrs.isEmpty();
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
		result.append(" (agreementItemTypeId: ");
		result.append(agreementItemTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(", agreementItemTypeAttrs: ");
		result.append(agreementItemTypeAttrs);
		result.append(')');
		return result.toString();
	}

} //AgreementItemTypeImpl
