/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.tax.impl;

import java.util.Date;

import org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc;
import org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssocType;
import org.abchip.mimo.biz.accounting.tax.TaxPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tax Authority Assoc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityAssocImpl#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityAssocImpl#getTaxAuthPartyId <em>Tax Auth Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityAssocImpl#getToTaxAuthGeoId <em>To Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityAssocImpl#getToTaxAuthPartyId <em>To Tax Auth Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityAssocImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityAssocImpl#getTaxAuthorityAssocTypeId <em>Tax Authority Assoc Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityAssocImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaxAuthorityAssocImpl extends BizEntityTypedImpl<TaxAuthorityAssocType> implements TaxAuthorityAssoc {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getTaxAuthGeoId() <em>Tax Auth Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthGeoId()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_AUTH_GEO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxAuthGeoId() <em>Tax Auth Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthGeoId()
	 * @generated
	 * @ordered
	 */
	protected String taxAuthGeoId = TAX_AUTH_GEO_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxAuthPartyId() <em>Tax Auth Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_AUTH_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxAuthPartyId() <em>Tax Auth Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthPartyId()
	 * @generated
	 * @ordered
	 */
	protected String taxAuthPartyId = TAX_AUTH_PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getToTaxAuthGeoId() <em>To Tax Auth Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTaxAuthGeoId()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_TAX_AUTH_GEO_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getToTaxAuthGeoId() <em>To Tax Auth Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTaxAuthGeoId()
	 * @generated
	 * @ordered
	 */
	protected String toTaxAuthGeoId = TO_TAX_AUTH_GEO_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getToTaxAuthPartyId() <em>To Tax Auth Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTaxAuthPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_TAX_AUTH_PARTY_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getToTaxAuthPartyId() <em>To Tax Auth Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTaxAuthPartyId()
	 * @generated
	 * @ordered
	 */
	protected String toTaxAuthPartyId = TO_TAX_AUTH_PARTY_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;
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
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaxAuthorityAssocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxPackage.Literals.TAX_AUTHORITY_ASSOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY_ASSOC__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxAuthGeoId() {
		return taxAuthGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthGeoId(String newTaxAuthGeoId) {
		String oldTaxAuthGeoId = taxAuthGeoId;
		taxAuthGeoId = newTaxAuthGeoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY_ASSOC__TAX_AUTH_GEO_ID, oldTaxAuthGeoId, taxAuthGeoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxAuthPartyId() {
		return taxAuthPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthPartyId(String newTaxAuthPartyId) {
		String oldTaxAuthPartyId = taxAuthPartyId;
		taxAuthPartyId = newTaxAuthPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY_ASSOC__TAX_AUTH_PARTY_ID, oldTaxAuthPartyId, taxAuthPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY_ASSOC__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToTaxAuthGeoId() {
		return toTaxAuthGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToTaxAuthGeoId(String newToTaxAuthGeoId) {
		String oldToTaxAuthGeoId = toTaxAuthGeoId;
		toTaxAuthGeoId = newToTaxAuthGeoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY_ASSOC__TO_TAX_AUTH_GEO_ID, oldToTaxAuthGeoId, toTaxAuthGeoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToTaxAuthPartyId() {
		return toTaxAuthPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToTaxAuthPartyId(String newToTaxAuthPartyId) {
		String oldToTaxAuthPartyId = toTaxAuthPartyId;
		toTaxAuthPartyId = newToTaxAuthPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY_ASSOC__TO_TAX_AUTH_PARTY_ID, oldToTaxAuthPartyId, toTaxAuthPartyId));
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
		String oldTaxAuthorityAssocTypeId = taxAuthorityAssocTypeId;
		taxAuthorityAssocTypeId = newTaxAuthorityAssocTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY_ASSOC__TAX_AUTHORITY_ASSOC_TYPE_ID, oldTaxAuthorityAssocTypeId, taxAuthorityAssocTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxPackage.TAX_AUTHORITY_ASSOC__TAX_AUTH_GEO_ID:
				return getTaxAuthGeoId();
			case TaxPackage.TAX_AUTHORITY_ASSOC__TAX_AUTH_PARTY_ID:
				return getTaxAuthPartyId();
			case TaxPackage.TAX_AUTHORITY_ASSOC__TO_TAX_AUTH_GEO_ID:
				return getToTaxAuthGeoId();
			case TaxPackage.TAX_AUTHORITY_ASSOC__TO_TAX_AUTH_PARTY_ID:
				return getToTaxAuthPartyId();
			case TaxPackage.TAX_AUTHORITY_ASSOC__FROM_DATE:
				return getFromDate();
			case TaxPackage.TAX_AUTHORITY_ASSOC__TAX_AUTHORITY_ASSOC_TYPE_ID:
				return getTaxAuthorityAssocTypeId();
			case TaxPackage.TAX_AUTHORITY_ASSOC__THRU_DATE:
				return getThruDate();
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
			case TaxPackage.TAX_AUTHORITY_ASSOC__TAX_AUTH_GEO_ID:
				setTaxAuthGeoId((String)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY_ASSOC__TAX_AUTH_PARTY_ID:
				setTaxAuthPartyId((String)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY_ASSOC__TO_TAX_AUTH_GEO_ID:
				setToTaxAuthGeoId((String)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY_ASSOC__TO_TAX_AUTH_PARTY_ID:
				setToTaxAuthPartyId((String)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY_ASSOC__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY_ASSOC__TAX_AUTHORITY_ASSOC_TYPE_ID:
				setTaxAuthorityAssocTypeId((String)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY_ASSOC__THRU_DATE:
				setThruDate((Date)newValue);
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
			case TaxPackage.TAX_AUTHORITY_ASSOC__TAX_AUTH_GEO_ID:
				setTaxAuthGeoId(TAX_AUTH_GEO_ID_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY_ASSOC__TAX_AUTH_PARTY_ID:
				setTaxAuthPartyId(TAX_AUTH_PARTY_ID_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY_ASSOC__TO_TAX_AUTH_GEO_ID:
				setToTaxAuthGeoId(TO_TAX_AUTH_GEO_ID_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY_ASSOC__TO_TAX_AUTH_PARTY_ID:
				setToTaxAuthPartyId(TO_TAX_AUTH_PARTY_ID_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY_ASSOC__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY_ASSOC__TAX_AUTHORITY_ASSOC_TYPE_ID:
				setTaxAuthorityAssocTypeId(TAX_AUTHORITY_ASSOC_TYPE_ID_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY_ASSOC__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
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
			case TaxPackage.TAX_AUTHORITY_ASSOC__TAX_AUTH_GEO_ID:
				return TAX_AUTH_GEO_ID_EDEFAULT == null ? taxAuthGeoId != null : !TAX_AUTH_GEO_ID_EDEFAULT.equals(taxAuthGeoId);
			case TaxPackage.TAX_AUTHORITY_ASSOC__TAX_AUTH_PARTY_ID:
				return TAX_AUTH_PARTY_ID_EDEFAULT == null ? taxAuthPartyId != null : !TAX_AUTH_PARTY_ID_EDEFAULT.equals(taxAuthPartyId);
			case TaxPackage.TAX_AUTHORITY_ASSOC__TO_TAX_AUTH_GEO_ID:
				return TO_TAX_AUTH_GEO_ID_EDEFAULT == null ? toTaxAuthGeoId != null : !TO_TAX_AUTH_GEO_ID_EDEFAULT.equals(toTaxAuthGeoId);
			case TaxPackage.TAX_AUTHORITY_ASSOC__TO_TAX_AUTH_PARTY_ID:
				return TO_TAX_AUTH_PARTY_ID_EDEFAULT == null ? toTaxAuthPartyId != null : !TO_TAX_AUTH_PARTY_ID_EDEFAULT.equals(toTaxAuthPartyId);
			case TaxPackage.TAX_AUTHORITY_ASSOC__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case TaxPackage.TAX_AUTHORITY_ASSOC__TAX_AUTHORITY_ASSOC_TYPE_ID:
				return TAX_AUTHORITY_ASSOC_TYPE_ID_EDEFAULT == null ? taxAuthorityAssocTypeId != null : !TAX_AUTHORITY_ASSOC_TYPE_ID_EDEFAULT.equals(taxAuthorityAssocTypeId);
			case TaxPackage.TAX_AUTHORITY_ASSOC__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
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
		result.append(" (taxAuthGeoId: ");
		result.append(taxAuthGeoId);
		result.append(", taxAuthPartyId: ");
		result.append(taxAuthPartyId);
		result.append(", toTaxAuthGeoId: ");
		result.append(toTaxAuthGeoId);
		result.append(", toTaxAuthPartyId: ");
		result.append(toTaxAuthPartyId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", taxAuthorityAssocTypeId: ");
		result.append(taxAuthorityAssocTypeId);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //TaxAuthorityAssocImpl
