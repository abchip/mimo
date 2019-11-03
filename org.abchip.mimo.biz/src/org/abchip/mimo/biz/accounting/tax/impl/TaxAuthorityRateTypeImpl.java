/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.tax.impl;

import java.util.List;

import org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateType;
import org.abchip.mimo.biz.accounting.tax.TaxPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tax Authority Rate Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityRateTypeImpl#getTaxAuthorityRateTypeId <em>Tax Authority Rate Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityRateTypeImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaxAuthorityRateTypeImpl extends BizEntityImpl implements TaxAuthorityRateType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getTaxAuthorityRateTypeId() <em>Tax Authority Rate Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthorityRateTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_AUTHORITY_RATE_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTaxAuthorityRateTypeId() <em>Tax Authority Rate Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthorityRateTypeId()
	 * @generated
	 * @ordered
	 */
	protected String taxAuthorityRateTypeId = TAX_AUTHORITY_RATE_TYPE_ID_EDEFAULT;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaxAuthorityRateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxPackage.Literals.TAX_AUTHORITY_RATE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY_RATE_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> taxAuthorityRateProducts() {
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
	public String getTaxAuthorityRateTypeId() {
		return taxAuthorityRateTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthorityRateTypeId(String newTaxAuthorityRateTypeId) {
		String oldTaxAuthorityRateTypeId = taxAuthorityRateTypeId;
		taxAuthorityRateTypeId = newTaxAuthorityRateTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY_RATE_TYPE__TAX_AUTHORITY_RATE_TYPE_ID, oldTaxAuthorityRateTypeId, taxAuthorityRateTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxPackage.TAX_AUTHORITY_RATE_TYPE__TAX_AUTHORITY_RATE_TYPE_ID:
				return getTaxAuthorityRateTypeId();
			case TaxPackage.TAX_AUTHORITY_RATE_TYPE__DESCRIPTION:
				return getDescription();
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
			case TaxPackage.TAX_AUTHORITY_RATE_TYPE__TAX_AUTHORITY_RATE_TYPE_ID:
				setTaxAuthorityRateTypeId((String)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_TYPE__DESCRIPTION:
				setDescription((String)newValue);
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
			case TaxPackage.TAX_AUTHORITY_RATE_TYPE__TAX_AUTHORITY_RATE_TYPE_ID:
				setTaxAuthorityRateTypeId(TAX_AUTHORITY_RATE_TYPE_ID_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY_RATE_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case TaxPackage.TAX_AUTHORITY_RATE_TYPE__TAX_AUTHORITY_RATE_TYPE_ID:
				return TAX_AUTHORITY_RATE_TYPE_ID_EDEFAULT == null ? taxAuthorityRateTypeId != null : !TAX_AUTHORITY_RATE_TYPE_ID_EDEFAULT.equals(taxAuthorityRateTypeId);
			case TaxPackage.TAX_AUTHORITY_RATE_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (taxAuthorityRateTypeId: ");
		result.append(taxAuthorityRateTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //TaxAuthorityRateTypeImpl
