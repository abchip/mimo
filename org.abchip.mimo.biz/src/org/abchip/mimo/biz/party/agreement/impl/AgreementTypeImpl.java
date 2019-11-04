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
import org.abchip.mimo.biz.party.agreement.Agreement;
import org.abchip.mimo.biz.party.agreement.AgreementPackage;
import org.abchip.mimo.biz.party.agreement.AgreementType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agreement Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementTypeImpl#getAgreementTypeId <em>Agreement Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementTypeImpl#getAgreementTypeAttrs <em>Agreement Type Attrs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgreementTypeImpl extends BizEntityTypeImpl<Agreement> implements AgreementType {
	/**
	 * The default value of the '{@link #getAgreementTypeId() <em>Agreement Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String AGREEMENT_TYPE_ID_EDEFAULT = null;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getAgreementTypeId() <em>Agreement Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementTypeId()
	 * @generated
	 * @ordered
	 */
	protected String agreementTypeId = AGREEMENT_TYPE_ID_EDEFAULT;
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
	protected AgreementType parentTypeId;

	/**
	 * The cached value of the '{@link #getAgreementTypeAttrs() <em>Agreement Type Attrs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementTypeAttrs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> agreementTypeAttrs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgreementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgreementPackage.Literals.AGREEMENT_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_TYPE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_TYPE__HAS_TABLE, oldHasTable, hasTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgreementType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (AgreementType)eResolveProxy(oldParentTypeId);
			if (parentTypeId != oldParentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AgreementPackage.AGREEMENT_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
			}
		}
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(AgreementType newParentTypeId) {
		AgreementType oldParentTypeId = parentTypeId;
		parentTypeId = newParentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getAgreementTypeAttrs() {
		if (agreementTypeAttrs == null) {
			agreementTypeAttrs = new EDataTypeUniqueEList<String>(String.class, this, AgreementPackage.AGREEMENT_TYPE__AGREEMENT_TYPE_ATTRS);
		}
		return agreementTypeAttrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> agreements() {
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
	public List<String> childAgreementTypes() {
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
	public String getAgreementTypeId() {
		return agreementTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgreementTypeId(String newAgreementTypeId) {
		String oldAgreementTypeId = agreementTypeId;
		agreementTypeId = newAgreementTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_TYPE__AGREEMENT_TYPE_ID, oldAgreementTypeId, agreementTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AgreementPackage.AGREEMENT_TYPE__AGREEMENT_TYPE_ID:
				return getAgreementTypeId();
			case AgreementPackage.AGREEMENT_TYPE__DESCRIPTION:
				return getDescription();
			case AgreementPackage.AGREEMENT_TYPE__HAS_TABLE:
				return isHasTable();
			case AgreementPackage.AGREEMENT_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
			case AgreementPackage.AGREEMENT_TYPE__AGREEMENT_TYPE_ATTRS:
				return getAgreementTypeAttrs();
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
			case AgreementPackage.AGREEMENT_TYPE__AGREEMENT_TYPE_ID:
				setAgreementTypeId((String)newValue);
				return;
			case AgreementPackage.AGREEMENT_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AgreementPackage.AGREEMENT_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case AgreementPackage.AGREEMENT_TYPE__PARENT_TYPE_ID:
				setParentTypeId((AgreementType)newValue);
				return;
			case AgreementPackage.AGREEMENT_TYPE__AGREEMENT_TYPE_ATTRS:
				getAgreementTypeAttrs().clear();
				getAgreementTypeAttrs().addAll((Collection<? extends String>)newValue);
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
			case AgreementPackage.AGREEMENT_TYPE__AGREEMENT_TYPE_ID:
				setAgreementTypeId(AGREEMENT_TYPE_ID_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_TYPE__PARENT_TYPE_ID:
				setParentTypeId((AgreementType)null);
				return;
			case AgreementPackage.AGREEMENT_TYPE__AGREEMENT_TYPE_ATTRS:
				getAgreementTypeAttrs().clear();
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
			case AgreementPackage.AGREEMENT_TYPE__AGREEMENT_TYPE_ID:
				return AGREEMENT_TYPE_ID_EDEFAULT == null ? agreementTypeId != null : !AGREEMENT_TYPE_ID_EDEFAULT.equals(agreementTypeId);
			case AgreementPackage.AGREEMENT_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AgreementPackage.AGREEMENT_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case AgreementPackage.AGREEMENT_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
			case AgreementPackage.AGREEMENT_TYPE__AGREEMENT_TYPE_ATTRS:
				return agreementTypeAttrs != null && !agreementTypeAttrs.isEmpty();
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
		result.append(" (agreementTypeId: ");
		result.append(agreementTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(", agreementTypeAttrs: ");
		result.append(agreementTypeAttrs);
		result.append(')');
		return result.toString();
	}

} //AgreementTypeImpl
