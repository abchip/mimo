/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.period.impl;

import java.util.List;

import org.abchip.mimo.biz.common.period.PeriodPackage;
import org.abchip.mimo.biz.common.period.PeriodType;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Period Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.period.impl.PeriodTypeImpl#getPeriodTypeId <em>Period Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.period.impl.PeriodTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.period.impl.PeriodTypeImpl#getPeriodLength <em>Period Length</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.period.impl.PeriodTypeImpl#getUomId <em>Uom Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeriodTypeImpl extends BizEntityImpl implements PeriodType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getPeriodTypeId() <em>Period Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PERIOD_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPeriodTypeId() <em>Period Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodTypeId()
	 * @generated
	 * @ordered
	 */
	protected String periodTypeId = PERIOD_TYPE_ID_EDEFAULT;
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
	 * The default value of the '{@link #getPeriodLength() <em>Period Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodLength()
	 * @generated
	 * @ordered
	 */
	protected static final long PERIOD_LENGTH_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getPeriodLength() <em>Period Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodLength()
	 * @generated
	 * @ordered
	 */
	protected long periodLength = PERIOD_LENGTH_EDEFAULT;
	/**
	 * The cached value of the '{@link #getUomId() <em>Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom uomId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PeriodPackage.Literals.PERIOD_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PeriodPackage.PERIOD_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPeriodLength() {
		return periodLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeriodLength(long newPeriodLength) {
		long oldPeriodLength = periodLength;
		periodLength = newPeriodLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PeriodPackage.PERIOD_TYPE__PERIOD_LENGTH, oldPeriodLength, periodLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getUomId() {
		if (uomId != null && ((EObject)uomId).eIsProxy()) {
			InternalEObject oldUomId = (InternalEObject)uomId;
			uomId = (Uom)eResolveProxy(oldUomId);
			if (uomId != oldUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PeriodPackage.PERIOD_TYPE__UOM_ID, oldUomId, uomId));
			}
		}
		return uomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetUomId() {
		return uomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUomId(Uom newUomId) {
		Uom oldUomId = uomId;
		uomId = newUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PeriodPackage.PERIOD_TYPE__UOM_ID, oldUomId, uomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> customTimePeriods() {
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
	public String getPeriodTypeId() {
		return periodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeriodTypeId(String newPeriodTypeId) {
		String oldPeriodTypeId = periodTypeId;
		periodTypeId = newPeriodTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PeriodPackage.PERIOD_TYPE__PERIOD_TYPE_ID, oldPeriodTypeId, periodTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PeriodPackage.PERIOD_TYPE__PERIOD_TYPE_ID:
				return getPeriodTypeId();
			case PeriodPackage.PERIOD_TYPE__DESCRIPTION:
				return getDescription();
			case PeriodPackage.PERIOD_TYPE__PERIOD_LENGTH:
				return getPeriodLength();
			case PeriodPackage.PERIOD_TYPE__UOM_ID:
				if (resolve) return getUomId();
				return basicGetUomId();
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
			case PeriodPackage.PERIOD_TYPE__PERIOD_TYPE_ID:
				setPeriodTypeId((String)newValue);
				return;
			case PeriodPackage.PERIOD_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PeriodPackage.PERIOD_TYPE__PERIOD_LENGTH:
				setPeriodLength((Long)newValue);
				return;
			case PeriodPackage.PERIOD_TYPE__UOM_ID:
				setUomId((Uom)newValue);
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
			case PeriodPackage.PERIOD_TYPE__PERIOD_TYPE_ID:
				setPeriodTypeId(PERIOD_TYPE_ID_EDEFAULT);
				return;
			case PeriodPackage.PERIOD_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PeriodPackage.PERIOD_TYPE__PERIOD_LENGTH:
				setPeriodLength(PERIOD_LENGTH_EDEFAULT);
				return;
			case PeriodPackage.PERIOD_TYPE__UOM_ID:
				setUomId((Uom)null);
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
			case PeriodPackage.PERIOD_TYPE__PERIOD_TYPE_ID:
				return PERIOD_TYPE_ID_EDEFAULT == null ? periodTypeId != null : !PERIOD_TYPE_ID_EDEFAULT.equals(periodTypeId);
			case PeriodPackage.PERIOD_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PeriodPackage.PERIOD_TYPE__PERIOD_LENGTH:
				return periodLength != PERIOD_LENGTH_EDEFAULT;
			case PeriodPackage.PERIOD_TYPE__UOM_ID:
				return uomId != null;
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
		result.append(" (periodTypeId: ");
		result.append(periodTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", periodLength: ");
		result.append(periodLength);
		result.append(')');
		return result.toString();
	}

} //PeriodTypeImpl
