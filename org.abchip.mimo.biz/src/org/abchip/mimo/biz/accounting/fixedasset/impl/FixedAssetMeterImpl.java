/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.fixedasset.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMeter;
import org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.product.ProductMeterType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Asset Meter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMeterImpl#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMeterImpl#getReadingDate <em>Reading Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMeterImpl#getMaintHistSeqId <em>Maint Hist Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMeterImpl#getMeterValue <em>Meter Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMeterImpl#getReadingReasonEnumId <em>Reading Reason Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMeterImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMeterImpl#getProductMeterTypeId <em>Product Meter Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FixedAssetMeterImpl extends BizEntityImpl implements FixedAssetMeter {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected static final String FIXED_ASSET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected String fixedAssetId = FIXED_ASSET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadingDate() <em>Reading Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadingDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date READING_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadingDate() <em>Reading Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadingDate()
	 * @generated
	 * @ordered
	 */
	protected Date readingDate = READING_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getMaintHistSeqId() <em>Maint Hist Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintHistSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String MAINT_HIST_SEQ_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMaintHistSeqId() <em>Maint Hist Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintHistSeqId()
	 * @generated
	 * @ordered
	 */
	protected String maintHistSeqId = MAINT_HIST_SEQ_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getMeterValue() <em>Meter Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal METER_VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMeterValue() <em>Meter Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterValue()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal meterValue = METER_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadingReasonEnumId() <em>Reading Reason Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadingReasonEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String READING_REASON_ENUM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadingReasonEnumId() <em>Reading Reason Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadingReasonEnumId()
	 * @generated
	 * @ordered
	 */
	protected String readingReasonEnumId = READING_REASON_ENUM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_EFFORT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected String workEffortId = WORK_EFFORT_ID_EDEFAULT;
	/**
	 * The cached value of the '{@link #getProductMeterTypeId() <em>Product Meter Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductMeterTypeId()
	 * @generated
	 * @ordered
	 */
	protected ProductMeterType productMeterTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedAssetMeterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FixedassetPackage.Literals.FIXED_ASSET_METER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFixedAssetId() {
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetId(String newFixedAssetId) {
		String oldFixedAssetId = fixedAssetId;
		fixedAssetId = newFixedAssetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_METER__FIXED_ASSET_ID, oldFixedAssetId, fixedAssetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaintHistSeqId() {
		return maintHistSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaintHistSeqId(String newMaintHistSeqId) {
		String oldMaintHistSeqId = maintHistSeqId;
		maintHistSeqId = newMaintHistSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_METER__MAINT_HIST_SEQ_ID, oldMaintHistSeqId, maintHistSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMeterValue() {
		return meterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeterValue(BigDecimal newMeterValue) {
		BigDecimal oldMeterValue = meterValue;
		meterValue = newMeterValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_METER__METER_VALUE, oldMeterValue, meterValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductMeterType getProductMeterTypeId() {
		if (productMeterTypeId != null && ((EObject)productMeterTypeId).eIsProxy()) {
			InternalEObject oldProductMeterTypeId = (InternalEObject)productMeterTypeId;
			productMeterTypeId = (ProductMeterType)eResolveProxy(oldProductMeterTypeId);
			if (productMeterTypeId != oldProductMeterTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FixedassetPackage.FIXED_ASSET_METER__PRODUCT_METER_TYPE_ID, oldProductMeterTypeId, productMeterTypeId));
			}
		}
		return productMeterTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductMeterType basicGetProductMeterTypeId() {
		return productMeterTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductMeterTypeId(ProductMeterType newProductMeterTypeId) {
		ProductMeterType oldProductMeterTypeId = productMeterTypeId;
		productMeterTypeId = newProductMeterTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_METER__PRODUCT_METER_TYPE_ID, oldProductMeterTypeId, productMeterTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReadingDate() {
		return readingDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadingDate(Date newReadingDate) {
		Date oldReadingDate = readingDate;
		readingDate = newReadingDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_METER__READING_DATE, oldReadingDate, readingDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReadingReasonEnumId() {
		return readingReasonEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadingReasonEnumId(String newReadingReasonEnumId) {
		String oldReadingReasonEnumId = readingReasonEnumId;
		readingReasonEnumId = newReadingReasonEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_METER__READING_REASON_ENUM_ID, oldReadingReasonEnumId, readingReasonEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkEffortId() {
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortId(String newWorkEffortId) {
		String oldWorkEffortId = workEffortId;
		workEffortId = newWorkEffortId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_METER__WORK_EFFORT_ID, oldWorkEffortId, workEffortId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FixedassetPackage.FIXED_ASSET_METER__FIXED_ASSET_ID:
				return getFixedAssetId();
			case FixedassetPackage.FIXED_ASSET_METER__READING_DATE:
				return getReadingDate();
			case FixedassetPackage.FIXED_ASSET_METER__MAINT_HIST_SEQ_ID:
				return getMaintHistSeqId();
			case FixedassetPackage.FIXED_ASSET_METER__METER_VALUE:
				return getMeterValue();
			case FixedassetPackage.FIXED_ASSET_METER__READING_REASON_ENUM_ID:
				return getReadingReasonEnumId();
			case FixedassetPackage.FIXED_ASSET_METER__WORK_EFFORT_ID:
				return getWorkEffortId();
			case FixedassetPackage.FIXED_ASSET_METER__PRODUCT_METER_TYPE_ID:
				if (resolve) return getProductMeterTypeId();
				return basicGetProductMeterTypeId();
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
			case FixedassetPackage.FIXED_ASSET_METER__FIXED_ASSET_ID:
				setFixedAssetId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_METER__READING_DATE:
				setReadingDate((Date)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_METER__MAINT_HIST_SEQ_ID:
				setMaintHistSeqId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_METER__METER_VALUE:
				setMeterValue((BigDecimal)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_METER__READING_REASON_ENUM_ID:
				setReadingReasonEnumId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_METER__WORK_EFFORT_ID:
				setWorkEffortId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_METER__PRODUCT_METER_TYPE_ID:
				setProductMeterTypeId((ProductMeterType)newValue);
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
			case FixedassetPackage.FIXED_ASSET_METER__FIXED_ASSET_ID:
				setFixedAssetId(FIXED_ASSET_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_METER__READING_DATE:
				setReadingDate(READING_DATE_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_METER__MAINT_HIST_SEQ_ID:
				setMaintHistSeqId(MAINT_HIST_SEQ_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_METER__METER_VALUE:
				setMeterValue(METER_VALUE_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_METER__READING_REASON_ENUM_ID:
				setReadingReasonEnumId(READING_REASON_ENUM_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_METER__WORK_EFFORT_ID:
				setWorkEffortId(WORK_EFFORT_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_METER__PRODUCT_METER_TYPE_ID:
				setProductMeterTypeId((ProductMeterType)null);
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
			case FixedassetPackage.FIXED_ASSET_METER__FIXED_ASSET_ID:
				return FIXED_ASSET_ID_EDEFAULT == null ? fixedAssetId != null : !FIXED_ASSET_ID_EDEFAULT.equals(fixedAssetId);
			case FixedassetPackage.FIXED_ASSET_METER__READING_DATE:
				return READING_DATE_EDEFAULT == null ? readingDate != null : !READING_DATE_EDEFAULT.equals(readingDate);
			case FixedassetPackage.FIXED_ASSET_METER__MAINT_HIST_SEQ_ID:
				return MAINT_HIST_SEQ_ID_EDEFAULT == null ? maintHistSeqId != null : !MAINT_HIST_SEQ_ID_EDEFAULT.equals(maintHistSeqId);
			case FixedassetPackage.FIXED_ASSET_METER__METER_VALUE:
				return METER_VALUE_EDEFAULT == null ? meterValue != null : !METER_VALUE_EDEFAULT.equals(meterValue);
			case FixedassetPackage.FIXED_ASSET_METER__READING_REASON_ENUM_ID:
				return READING_REASON_ENUM_ID_EDEFAULT == null ? readingReasonEnumId != null : !READING_REASON_ENUM_ID_EDEFAULT.equals(readingReasonEnumId);
			case FixedassetPackage.FIXED_ASSET_METER__WORK_EFFORT_ID:
				return WORK_EFFORT_ID_EDEFAULT == null ? workEffortId != null : !WORK_EFFORT_ID_EDEFAULT.equals(workEffortId);
			case FixedassetPackage.FIXED_ASSET_METER__PRODUCT_METER_TYPE_ID:
				return productMeterTypeId != null;
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
		result.append(" (fixedAssetId: ");
		result.append(fixedAssetId);
		result.append(", readingDate: ");
		result.append(readingDate);
		result.append(", maintHistSeqId: ");
		result.append(maintHistSeqId);
		result.append(", meterValue: ");
		result.append(meterValue);
		result.append(", readingReasonEnumId: ");
		result.append(readingReasonEnumId);
		result.append(", workEffortId: ");
		result.append(workEffortId);
		result.append(')');
		return result.toString();
	}

} //FixedAssetMeterImpl
