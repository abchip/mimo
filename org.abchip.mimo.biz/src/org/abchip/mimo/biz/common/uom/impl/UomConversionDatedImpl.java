/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.uom.impl;

import java.util.Date;

import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.method.CustomMethod;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.common.uom.UomConversionDated;
import org.abchip.mimo.biz.common.uom.UomPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uom Conversion Dated</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.uom.impl.UomConversionDatedImpl#getUomId <em>Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.impl.UomConversionDatedImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.impl.UomConversionDatedImpl#getConversionFactor <em>Conversion Factor</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.impl.UomConversionDatedImpl#getDecimalScale <em>Decimal Scale</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.impl.UomConversionDatedImpl#getRoundingMode <em>Rounding Mode</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.impl.UomConversionDatedImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.impl.UomConversionDatedImpl#getUomIdTo <em>Uom Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.impl.UomConversionDatedImpl#getCustomMethodId <em>Custom Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.impl.UomConversionDatedImpl#getPurposeEnumId <em>Purpose Enum Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UomConversionDatedImpl extends BizEntityImpl implements UomConversionDated {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getUomId() <em>Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String UOM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUomId() <em>Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUomId()
	 * @generated
	 * @ordered
	 */
	protected String uomId = UOM_ID_EDEFAULT;
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
	 * The default value of the '{@link #getConversionFactor() <em>Conversion Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double CONVERSION_FACTOR_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getConversionFactor() <em>Conversion Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionFactor()
	 * @generated
	 * @ordered
	 */
	protected double conversionFactor = CONVERSION_FACTOR_EDEFAULT;
	/**
	 * The default value of the '{@link #getDecimalScale() <em>Decimal Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalScale()
	 * @generated
	 * @ordered
	 */
	protected static final long DECIMAL_SCALE_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getDecimalScale() <em>Decimal Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalScale()
	 * @generated
	 * @ordered
	 */
	protected long decimalScale = DECIMAL_SCALE_EDEFAULT;
	/**
	 * The default value of the '{@link #getRoundingMode() <em>Rounding Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundingMode()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUNDING_MODE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRoundingMode() <em>Rounding Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundingMode()
	 * @generated
	 * @ordered
	 */
	protected String roundingMode = ROUNDING_MODE_EDEFAULT;
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
	 * The cached value of the '{@link #getUomIdTo() <em>Uom Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUomIdTo()
	 * @generated
	 * @ordered
	 */
	protected Uom uomIdTo;
	/**
	 * The cached value of the '{@link #getCustomMethodId() <em>Custom Method Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomMethodId()
	 * @generated
	 * @ordered
	 */
	protected CustomMethod customMethodId;
	/**
	 * The cached value of the '{@link #getPurposeEnumId() <em>Purpose Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration purposeEnumId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UomConversionDatedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UomPackage.Literals.UOM_CONVERSION_DATED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getConversionFactor() {
		return conversionFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConversionFactor(double newConversionFactor) {
		double oldConversionFactor = conversionFactor;
		conversionFactor = newConversionFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UomPackage.UOM_CONVERSION_DATED__CONVERSION_FACTOR, oldConversionFactor, conversionFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDecimalScale() {
		return decimalScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecimalScale(long newDecimalScale) {
		long oldDecimalScale = decimalScale;
		decimalScale = newDecimalScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UomPackage.UOM_CONVERSION_DATED__DECIMAL_SCALE, oldDecimalScale, decimalScale));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UomPackage.UOM_CONVERSION_DATED__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoundingMode() {
		return roundingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoundingMode(String newRoundingMode) {
		String oldRoundingMode = roundingMode;
		roundingMode = newRoundingMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UomPackage.UOM_CONVERSION_DATED__ROUNDING_MODE, oldRoundingMode, roundingMode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UomPackage.UOM_CONVERSION_DATED__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUomId() {
		return uomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUomId(String newUomId) {
		String oldUomId = uomId;
		uomId = newUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UomPackage.UOM_CONVERSION_DATED__UOM_ID, oldUomId, uomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getUomIdTo() {
		if (uomIdTo != null && ((EObject)uomIdTo).eIsProxy()) {
			InternalEObject oldUomIdTo = (InternalEObject)uomIdTo;
			uomIdTo = (Uom)eResolveProxy(oldUomIdTo);
			if (uomIdTo != oldUomIdTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UomPackage.UOM_CONVERSION_DATED__UOM_ID_TO, oldUomIdTo, uomIdTo));
			}
		}
		return uomIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetUomIdTo() {
		return uomIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUomIdTo(Uom newUomIdTo) {
		Uom oldUomIdTo = uomIdTo;
		uomIdTo = newUomIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UomPackage.UOM_CONVERSION_DATED__UOM_ID_TO, oldUomIdTo, uomIdTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomMethod getCustomMethodId() {
		if (customMethodId != null && ((EObject)customMethodId).eIsProxy()) {
			InternalEObject oldCustomMethodId = (InternalEObject)customMethodId;
			customMethodId = (CustomMethod)eResolveProxy(oldCustomMethodId);
			if (customMethodId != oldCustomMethodId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UomPackage.UOM_CONVERSION_DATED__CUSTOM_METHOD_ID, oldCustomMethodId, customMethodId));
			}
		}
		return customMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomMethod basicGetCustomMethodId() {
		return customMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomMethodId(CustomMethod newCustomMethodId) {
		CustomMethod oldCustomMethodId = customMethodId;
		customMethodId = newCustomMethodId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UomPackage.UOM_CONVERSION_DATED__CUSTOM_METHOD_ID, oldCustomMethodId, customMethodId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getPurposeEnumId() {
		if (purposeEnumId != null && ((EObject)purposeEnumId).eIsProxy()) {
			InternalEObject oldPurposeEnumId = (InternalEObject)purposeEnumId;
			purposeEnumId = (Enumeration)eResolveProxy(oldPurposeEnumId);
			if (purposeEnumId != oldPurposeEnumId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UomPackage.UOM_CONVERSION_DATED__PURPOSE_ENUM_ID, oldPurposeEnumId, purposeEnumId));
			}
		}
		return purposeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetPurposeEnumId() {
		return purposeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurposeEnumId(Enumeration newPurposeEnumId) {
		Enumeration oldPurposeEnumId = purposeEnumId;
		purposeEnumId = newPurposeEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UomPackage.UOM_CONVERSION_DATED__PURPOSE_ENUM_ID, oldPurposeEnumId, purposeEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UomPackage.UOM_CONVERSION_DATED__UOM_ID:
				return getUomId();
			case UomPackage.UOM_CONVERSION_DATED__FROM_DATE:
				return getFromDate();
			case UomPackage.UOM_CONVERSION_DATED__CONVERSION_FACTOR:
				return getConversionFactor();
			case UomPackage.UOM_CONVERSION_DATED__DECIMAL_SCALE:
				return getDecimalScale();
			case UomPackage.UOM_CONVERSION_DATED__ROUNDING_MODE:
				return getRoundingMode();
			case UomPackage.UOM_CONVERSION_DATED__THRU_DATE:
				return getThruDate();
			case UomPackage.UOM_CONVERSION_DATED__UOM_ID_TO:
				if (resolve) return getUomIdTo();
				return basicGetUomIdTo();
			case UomPackage.UOM_CONVERSION_DATED__CUSTOM_METHOD_ID:
				if (resolve) return getCustomMethodId();
				return basicGetCustomMethodId();
			case UomPackage.UOM_CONVERSION_DATED__PURPOSE_ENUM_ID:
				if (resolve) return getPurposeEnumId();
				return basicGetPurposeEnumId();
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
			case UomPackage.UOM_CONVERSION_DATED__UOM_ID:
				setUomId((String)newValue);
				return;
			case UomPackage.UOM_CONVERSION_DATED__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case UomPackage.UOM_CONVERSION_DATED__CONVERSION_FACTOR:
				setConversionFactor((Double)newValue);
				return;
			case UomPackage.UOM_CONVERSION_DATED__DECIMAL_SCALE:
				setDecimalScale((Long)newValue);
				return;
			case UomPackage.UOM_CONVERSION_DATED__ROUNDING_MODE:
				setRoundingMode((String)newValue);
				return;
			case UomPackage.UOM_CONVERSION_DATED__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case UomPackage.UOM_CONVERSION_DATED__UOM_ID_TO:
				setUomIdTo((Uom)newValue);
				return;
			case UomPackage.UOM_CONVERSION_DATED__CUSTOM_METHOD_ID:
				setCustomMethodId((CustomMethod)newValue);
				return;
			case UomPackage.UOM_CONVERSION_DATED__PURPOSE_ENUM_ID:
				setPurposeEnumId((Enumeration)newValue);
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
			case UomPackage.UOM_CONVERSION_DATED__UOM_ID:
				setUomId(UOM_ID_EDEFAULT);
				return;
			case UomPackage.UOM_CONVERSION_DATED__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case UomPackage.UOM_CONVERSION_DATED__CONVERSION_FACTOR:
				setConversionFactor(CONVERSION_FACTOR_EDEFAULT);
				return;
			case UomPackage.UOM_CONVERSION_DATED__DECIMAL_SCALE:
				setDecimalScale(DECIMAL_SCALE_EDEFAULT);
				return;
			case UomPackage.UOM_CONVERSION_DATED__ROUNDING_MODE:
				setRoundingMode(ROUNDING_MODE_EDEFAULT);
				return;
			case UomPackage.UOM_CONVERSION_DATED__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case UomPackage.UOM_CONVERSION_DATED__UOM_ID_TO:
				setUomIdTo((Uom)null);
				return;
			case UomPackage.UOM_CONVERSION_DATED__CUSTOM_METHOD_ID:
				setCustomMethodId((CustomMethod)null);
				return;
			case UomPackage.UOM_CONVERSION_DATED__PURPOSE_ENUM_ID:
				setPurposeEnumId((Enumeration)null);
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
			case UomPackage.UOM_CONVERSION_DATED__UOM_ID:
				return UOM_ID_EDEFAULT == null ? uomId != null : !UOM_ID_EDEFAULT.equals(uomId);
			case UomPackage.UOM_CONVERSION_DATED__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case UomPackage.UOM_CONVERSION_DATED__CONVERSION_FACTOR:
				return conversionFactor != CONVERSION_FACTOR_EDEFAULT;
			case UomPackage.UOM_CONVERSION_DATED__DECIMAL_SCALE:
				return decimalScale != DECIMAL_SCALE_EDEFAULT;
			case UomPackage.UOM_CONVERSION_DATED__ROUNDING_MODE:
				return ROUNDING_MODE_EDEFAULT == null ? roundingMode != null : !ROUNDING_MODE_EDEFAULT.equals(roundingMode);
			case UomPackage.UOM_CONVERSION_DATED__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case UomPackage.UOM_CONVERSION_DATED__UOM_ID_TO:
				return uomIdTo != null;
			case UomPackage.UOM_CONVERSION_DATED__CUSTOM_METHOD_ID:
				return customMethodId != null;
			case UomPackage.UOM_CONVERSION_DATED__PURPOSE_ENUM_ID:
				return purposeEnumId != null;
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
		result.append(" (uomId: ");
		result.append(uomId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", conversionFactor: ");
		result.append(conversionFactor);
		result.append(", decimalScale: ");
		result.append(decimalScale);
		result.append(", roundingMode: ");
		result.append(roundingMode);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //UomConversionDatedImpl
