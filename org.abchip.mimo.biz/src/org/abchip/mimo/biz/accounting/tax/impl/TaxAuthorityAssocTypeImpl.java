/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.tax.impl;

import org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc;
import org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssocType;
import org.abchip.mimo.biz.accounting.tax.TaxPackage;
import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tax Authority Assoc Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityAssocTypeImpl#getTaxAuthorityAssocTypeId <em>Tax Authority Assoc Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityAssocTypeImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaxAuthorityAssocTypeImpl extends BizEntityTypeImpl<TaxAuthorityAssoc> implements TaxAuthorityAssocType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getTaxAuthorityAssocTypeId() <em>Tax Authority Assoc Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthorityAssocTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_AUTHORITY_ASSOC_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTaxAuthorityAssocTypeId() <em>Tax Authority Assoc Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthorityAssocTypeId()
	 * @generated
	 * @ordered
	 */
	protected String taxAuthorityAssocTypeId = TAX_AUTHORITY_ASSOC_TYPE_ID_EDEFAULT;
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
	protected TaxAuthorityAssocTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxPackage.Literals.TAX_AUTHORITY_ASSOC_TYPE;
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
	public String getTaxAuthorityAssocTypeId() {
		return taxAuthorityAssocTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthorityAssocTypeId(String newTaxAuthorityAssocTypeId) {
		taxAuthorityAssocTypeId = newTaxAuthorityAssocTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxPackage.TAX_AUTHORITY_ASSOC_TYPE__TAX_AUTHORITY_ASSOC_TYPE_ID:
				return getTaxAuthorityAssocTypeId();
			case TaxPackage.TAX_AUTHORITY_ASSOC_TYPE__DESCRIPTION:
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
			case TaxPackage.TAX_AUTHORITY_ASSOC_TYPE__TAX_AUTHORITY_ASSOC_TYPE_ID:
				setTaxAuthorityAssocTypeId((String)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY_ASSOC_TYPE__DESCRIPTION:
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
			case TaxPackage.TAX_AUTHORITY_ASSOC_TYPE__TAX_AUTHORITY_ASSOC_TYPE_ID:
				setTaxAuthorityAssocTypeId(TAX_AUTHORITY_ASSOC_TYPE_ID_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY_ASSOC_TYPE__DESCRIPTION:
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
			case TaxPackage.TAX_AUTHORITY_ASSOC_TYPE__TAX_AUTHORITY_ASSOC_TYPE_ID:
				return TAX_AUTHORITY_ASSOC_TYPE_ID_EDEFAULT == null ? taxAuthorityAssocTypeId != null : !TAX_AUTHORITY_ASSOC_TYPE_ID_EDEFAULT.equals(taxAuthorityAssocTypeId);
			case TaxPackage.TAX_AUTHORITY_ASSOC_TYPE__DESCRIPTION:
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
		result.append(" (taxAuthorityAssocTypeId: ");
		result.append(taxAuthorityAssocTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //TaxAuthorityAssocTypeImpl
