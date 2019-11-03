/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.uom.impl;

import org.abchip.mimo.biz.common.uom.UomConversion;
import org.abchip.mimo.biz.common.uom.UomPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uom Conversion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.uom.impl.UomConversionImpl#getUomId <em>Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.impl.UomConversionImpl#getUomIdTo <em>Uom Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.impl.UomConversionImpl#getConversionFactor <em>Conversion Factor</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.impl.UomConversionImpl#getCustomMethodId <em>Custom Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.impl.UomConversionImpl#getDecimalScale <em>Decimal Scale</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.impl.UomConversionImpl#getRoundingMode <em>Rounding Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UomConversionImpl extends BizEntityImpl implements UomConversion {
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
	 * The default value of the '{@link #getUomIdTo() <em>Uom Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUomIdTo()
	 * @generated
	 * @ordered
	 */
	protected static final String UOM_ID_TO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUomIdTo() <em>Uom Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUomIdTo()
	 * @generated
	 * @ordered
	 */
	protected String uomIdTo = UOM_ID_TO_EDEFAULT;
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
	 * The default value of the '{@link #getCustomMethodId() <em>Custom Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomMethodId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_METHOD_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCustomMethodId() <em>Custom Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomMethodId()
	 * @generated
	 * @ordered
	 */
	protected String customMethodId = CUSTOM_METHOD_ID_EDEFAULT;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UomConversionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UomPackage.Literals.UOM_CONVERSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UomPackage.UOM_CONVERSION__CONVERSION_FACTOR, oldConversionFactor, conversionFactor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UomPackage.UOM_CONVERSION__DECIMAL_SCALE, oldDecimalScale, decimalScale));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UomPackage.UOM_CONVERSION__ROUNDING_MODE, oldRoundingMode, roundingMode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UomPackage.UOM_CONVERSION__UOM_ID, oldUomId, uomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUomIdTo() {
		return uomIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUomIdTo(String newUomIdTo) {
		String oldUomIdTo = uomIdTo;
		uomIdTo = newUomIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UomPackage.UOM_CONVERSION__UOM_ID_TO, oldUomIdTo, uomIdTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomMethodId() {
		return customMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomMethodId(String newCustomMethodId) {
		String oldCustomMethodId = customMethodId;
		customMethodId = newCustomMethodId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UomPackage.UOM_CONVERSION__CUSTOM_METHOD_ID, oldCustomMethodId, customMethodId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UomPackage.UOM_CONVERSION__UOM_ID:
				return getUomId();
			case UomPackage.UOM_CONVERSION__UOM_ID_TO:
				return getUomIdTo();
			case UomPackage.UOM_CONVERSION__CONVERSION_FACTOR:
				return getConversionFactor();
			case UomPackage.UOM_CONVERSION__CUSTOM_METHOD_ID:
				return getCustomMethodId();
			case UomPackage.UOM_CONVERSION__DECIMAL_SCALE:
				return getDecimalScale();
			case UomPackage.UOM_CONVERSION__ROUNDING_MODE:
				return getRoundingMode();
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
			case UomPackage.UOM_CONVERSION__UOM_ID:
				setUomId((String)newValue);
				return;
			case UomPackage.UOM_CONVERSION__UOM_ID_TO:
				setUomIdTo((String)newValue);
				return;
			case UomPackage.UOM_CONVERSION__CONVERSION_FACTOR:
				setConversionFactor((Double)newValue);
				return;
			case UomPackage.UOM_CONVERSION__CUSTOM_METHOD_ID:
				setCustomMethodId((String)newValue);
				return;
			case UomPackage.UOM_CONVERSION__DECIMAL_SCALE:
				setDecimalScale((Long)newValue);
				return;
			case UomPackage.UOM_CONVERSION__ROUNDING_MODE:
				setRoundingMode((String)newValue);
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
			case UomPackage.UOM_CONVERSION__UOM_ID:
				setUomId(UOM_ID_EDEFAULT);
				return;
			case UomPackage.UOM_CONVERSION__UOM_ID_TO:
				setUomIdTo(UOM_ID_TO_EDEFAULT);
				return;
			case UomPackage.UOM_CONVERSION__CONVERSION_FACTOR:
				setConversionFactor(CONVERSION_FACTOR_EDEFAULT);
				return;
			case UomPackage.UOM_CONVERSION__CUSTOM_METHOD_ID:
				setCustomMethodId(CUSTOM_METHOD_ID_EDEFAULT);
				return;
			case UomPackage.UOM_CONVERSION__DECIMAL_SCALE:
				setDecimalScale(DECIMAL_SCALE_EDEFAULT);
				return;
			case UomPackage.UOM_CONVERSION__ROUNDING_MODE:
				setRoundingMode(ROUNDING_MODE_EDEFAULT);
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
			case UomPackage.UOM_CONVERSION__UOM_ID:
				return UOM_ID_EDEFAULT == null ? uomId != null : !UOM_ID_EDEFAULT.equals(uomId);
			case UomPackage.UOM_CONVERSION__UOM_ID_TO:
				return UOM_ID_TO_EDEFAULT == null ? uomIdTo != null : !UOM_ID_TO_EDEFAULT.equals(uomIdTo);
			case UomPackage.UOM_CONVERSION__CONVERSION_FACTOR:
				return conversionFactor != CONVERSION_FACTOR_EDEFAULT;
			case UomPackage.UOM_CONVERSION__CUSTOM_METHOD_ID:
				return CUSTOM_METHOD_ID_EDEFAULT == null ? customMethodId != null : !CUSTOM_METHOD_ID_EDEFAULT.equals(customMethodId);
			case UomPackage.UOM_CONVERSION__DECIMAL_SCALE:
				return decimalScale != DECIMAL_SCALE_EDEFAULT;
			case UomPackage.UOM_CONVERSION__ROUNDING_MODE:
				return ROUNDING_MODE_EDEFAULT == null ? roundingMode != null : !ROUNDING_MODE_EDEFAULT.equals(roundingMode);
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
		result.append(", uomIdTo: ");
		result.append(uomIdTo);
		result.append(", conversionFactor: ");
		result.append(conversionFactor);
		result.append(", customMethodId: ");
		result.append(customMethodId);
		result.append(", decimalScale: ");
		result.append(decimalScale);
		result.append(", roundingMode: ");
		result.append(roundingMode);
		result.append(')');
		return result.toString();
	}

} //UomConversionImpl
