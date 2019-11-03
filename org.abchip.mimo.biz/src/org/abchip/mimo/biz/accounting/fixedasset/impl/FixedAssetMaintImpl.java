/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.fixedasset.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint;
import org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Asset Maint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMaintImpl#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMaintImpl#getMaintHistSeqId <em>Maint Hist Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMaintImpl#getIntervalMeterTypeId <em>Interval Meter Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMaintImpl#getIntervalQuantity <em>Interval Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMaintImpl#getIntervalUomId <em>Interval Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMaintImpl#getProductMaintSeqId <em>Product Maint Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMaintImpl#getProductMaintTypeId <em>Product Maint Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMaintImpl#getPurchaseOrderId <em>Purchase Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMaintImpl#getScheduleWorkEffortId <em>Schedule Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMaintImpl#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FixedAssetMaintImpl extends BizEntityImpl implements FixedAssetMaint {
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
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	 * The default value of the '{@link #getIntervalMeterTypeId() <em>Interval Meter Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalMeterTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERVAL_METER_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getIntervalMeterTypeId() <em>Interval Meter Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalMeterTypeId()
	 * @generated
	 * @ordered
	 */
	protected String intervalMeterTypeId = INTERVAL_METER_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getIntervalQuantity() <em>Interval Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal INTERVAL_QUANTITY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getIntervalQuantity() <em>Interval Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal intervalQuantity = INTERVAL_QUANTITY_EDEFAULT;
	/**
	 * The default value of the '{@link #getIntervalUomId() <em>Interval Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERVAL_UOM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getIntervalUomId() <em>Interval Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalUomId()
	 * @generated
	 * @ordered
	 */
	protected String intervalUomId = INTERVAL_UOM_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getProductMaintSeqId() <em>Product Maint Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductMaintSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_MAINT_SEQ_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProductMaintSeqId() <em>Product Maint Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductMaintSeqId()
	 * @generated
	 * @ordered
	 */
	protected String productMaintSeqId = PRODUCT_MAINT_SEQ_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getProductMaintTypeId() <em>Product Maint Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductMaintTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_MAINT_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProductMaintTypeId() <em>Product Maint Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductMaintTypeId()
	 * @generated
	 * @ordered
	 */
	protected String productMaintTypeId = PRODUCT_MAINT_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getPurchaseOrderId() <em>Purchase Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final String PURCHASE_ORDER_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPurchaseOrderId() <em>Purchase Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseOrderId()
	 * @generated
	 * @ordered
	 */
	protected String purchaseOrderId = PURCHASE_ORDER_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getScheduleWorkEffortId() <em>Schedule Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEDULE_WORK_EFFORT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getScheduleWorkEffortId() <em>Schedule Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected String scheduleWorkEffortId = SCHEDULE_WORK_EFFORT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected String statusId = STATUS_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedAssetMaintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FixedassetPackage.Literals.FIXED_ASSET_MAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIntervalMeterTypeId() {
		return intervalMeterTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntervalMeterTypeId(String newIntervalMeterTypeId) {
		String oldIntervalMeterTypeId = intervalMeterTypeId;
		intervalMeterTypeId = newIntervalMeterTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_METER_TYPE_ID, oldIntervalMeterTypeId, intervalMeterTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getIntervalQuantity() {
		return intervalQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntervalQuantity(BigDecimal newIntervalQuantity) {
		BigDecimal oldIntervalQuantity = intervalQuantity;
		intervalQuantity = newIntervalQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_QUANTITY, oldIntervalQuantity, intervalQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIntervalUomId() {
		return intervalUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntervalUomId(String newIntervalUomId) {
		String oldIntervalUomId = intervalUomId;
		intervalUomId = newIntervalUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_UOM_ID, oldIntervalUomId, intervalUomId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_MAINT__MAINT_HIST_SEQ_ID, oldMaintHistSeqId, maintHistSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductMaintSeqId() {
		return productMaintSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductMaintSeqId(String newProductMaintSeqId) {
		String oldProductMaintSeqId = productMaintSeqId;
		productMaintSeqId = newProductMaintSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_MAINT__PRODUCT_MAINT_SEQ_ID, oldProductMaintSeqId, productMaintSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductMaintTypeId() {
		return productMaintTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductMaintTypeId(String newProductMaintTypeId) {
		String oldProductMaintTypeId = productMaintTypeId;
		productMaintTypeId = newProductMaintTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_MAINT__PRODUCT_MAINT_TYPE_ID, oldProductMaintTypeId, productMaintTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPurchaseOrderId() {
		return purchaseOrderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchaseOrderId(String newPurchaseOrderId) {
		String oldPurchaseOrderId = purchaseOrderId;
		purchaseOrderId = newPurchaseOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_MAINT__PURCHASE_ORDER_ID, oldPurchaseOrderId, purchaseOrderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScheduleWorkEffortId() {
		return scheduleWorkEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScheduleWorkEffortId(String newScheduleWorkEffortId) {
		String oldScheduleWorkEffortId = scheduleWorkEffortId;
		scheduleWorkEffortId = newScheduleWorkEffortId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_MAINT__SCHEDULE_WORK_EFFORT_ID, oldScheduleWorkEffortId, scheduleWorkEffortId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(String newStatusId) {
		String oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_MAINT__STATUS_ID, oldStatusId, statusId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_MAINT__FIXED_ASSET_ID, oldFixedAssetId, fixedAssetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FixedassetPackage.FIXED_ASSET_MAINT__FIXED_ASSET_ID:
				return getFixedAssetId();
			case FixedassetPackage.FIXED_ASSET_MAINT__MAINT_HIST_SEQ_ID:
				return getMaintHistSeqId();
			case FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_METER_TYPE_ID:
				return getIntervalMeterTypeId();
			case FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_QUANTITY:
				return getIntervalQuantity();
			case FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_UOM_ID:
				return getIntervalUomId();
			case FixedassetPackage.FIXED_ASSET_MAINT__PRODUCT_MAINT_SEQ_ID:
				return getProductMaintSeqId();
			case FixedassetPackage.FIXED_ASSET_MAINT__PRODUCT_MAINT_TYPE_ID:
				return getProductMaintTypeId();
			case FixedassetPackage.FIXED_ASSET_MAINT__PURCHASE_ORDER_ID:
				return getPurchaseOrderId();
			case FixedassetPackage.FIXED_ASSET_MAINT__SCHEDULE_WORK_EFFORT_ID:
				return getScheduleWorkEffortId();
			case FixedassetPackage.FIXED_ASSET_MAINT__STATUS_ID:
				return getStatusId();
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
			case FixedassetPackage.FIXED_ASSET_MAINT__FIXED_ASSET_ID:
				setFixedAssetId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__MAINT_HIST_SEQ_ID:
				setMaintHistSeqId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_METER_TYPE_ID:
				setIntervalMeterTypeId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_QUANTITY:
				setIntervalQuantity((BigDecimal)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_UOM_ID:
				setIntervalUomId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__PRODUCT_MAINT_SEQ_ID:
				setProductMaintSeqId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__PRODUCT_MAINT_TYPE_ID:
				setProductMaintTypeId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__PURCHASE_ORDER_ID:
				setPurchaseOrderId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__SCHEDULE_WORK_EFFORT_ID:
				setScheduleWorkEffortId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__STATUS_ID:
				setStatusId((String)newValue);
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
			case FixedassetPackage.FIXED_ASSET_MAINT__FIXED_ASSET_ID:
				setFixedAssetId(FIXED_ASSET_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__MAINT_HIST_SEQ_ID:
				setMaintHistSeqId(MAINT_HIST_SEQ_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_METER_TYPE_ID:
				setIntervalMeterTypeId(INTERVAL_METER_TYPE_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_QUANTITY:
				setIntervalQuantity(INTERVAL_QUANTITY_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_UOM_ID:
				setIntervalUomId(INTERVAL_UOM_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__PRODUCT_MAINT_SEQ_ID:
				setProductMaintSeqId(PRODUCT_MAINT_SEQ_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__PRODUCT_MAINT_TYPE_ID:
				setProductMaintTypeId(PRODUCT_MAINT_TYPE_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__PURCHASE_ORDER_ID:
				setPurchaseOrderId(PURCHASE_ORDER_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__SCHEDULE_WORK_EFFORT_ID:
				setScheduleWorkEffortId(SCHEDULE_WORK_EFFORT_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
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
			case FixedassetPackage.FIXED_ASSET_MAINT__FIXED_ASSET_ID:
				return FIXED_ASSET_ID_EDEFAULT == null ? fixedAssetId != null : !FIXED_ASSET_ID_EDEFAULT.equals(fixedAssetId);
			case FixedassetPackage.FIXED_ASSET_MAINT__MAINT_HIST_SEQ_ID:
				return MAINT_HIST_SEQ_ID_EDEFAULT == null ? maintHistSeqId != null : !MAINT_HIST_SEQ_ID_EDEFAULT.equals(maintHistSeqId);
			case FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_METER_TYPE_ID:
				return INTERVAL_METER_TYPE_ID_EDEFAULT == null ? intervalMeterTypeId != null : !INTERVAL_METER_TYPE_ID_EDEFAULT.equals(intervalMeterTypeId);
			case FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_QUANTITY:
				return INTERVAL_QUANTITY_EDEFAULT == null ? intervalQuantity != null : !INTERVAL_QUANTITY_EDEFAULT.equals(intervalQuantity);
			case FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_UOM_ID:
				return INTERVAL_UOM_ID_EDEFAULT == null ? intervalUomId != null : !INTERVAL_UOM_ID_EDEFAULT.equals(intervalUomId);
			case FixedassetPackage.FIXED_ASSET_MAINT__PRODUCT_MAINT_SEQ_ID:
				return PRODUCT_MAINT_SEQ_ID_EDEFAULT == null ? productMaintSeqId != null : !PRODUCT_MAINT_SEQ_ID_EDEFAULT.equals(productMaintSeqId);
			case FixedassetPackage.FIXED_ASSET_MAINT__PRODUCT_MAINT_TYPE_ID:
				return PRODUCT_MAINT_TYPE_ID_EDEFAULT == null ? productMaintTypeId != null : !PRODUCT_MAINT_TYPE_ID_EDEFAULT.equals(productMaintTypeId);
			case FixedassetPackage.FIXED_ASSET_MAINT__PURCHASE_ORDER_ID:
				return PURCHASE_ORDER_ID_EDEFAULT == null ? purchaseOrderId != null : !PURCHASE_ORDER_ID_EDEFAULT.equals(purchaseOrderId);
			case FixedassetPackage.FIXED_ASSET_MAINT__SCHEDULE_WORK_EFFORT_ID:
				return SCHEDULE_WORK_EFFORT_ID_EDEFAULT == null ? scheduleWorkEffortId != null : !SCHEDULE_WORK_EFFORT_ID_EDEFAULT.equals(scheduleWorkEffortId);
			case FixedassetPackage.FIXED_ASSET_MAINT__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
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
		result.append(", maintHistSeqId: ");
		result.append(maintHistSeqId);
		result.append(", intervalMeterTypeId: ");
		result.append(intervalMeterTypeId);
		result.append(", intervalQuantity: ");
		result.append(intervalQuantity);
		result.append(", intervalUomId: ");
		result.append(intervalUomId);
		result.append(", productMaintSeqId: ");
		result.append(productMaintSeqId);
		result.append(", productMaintTypeId: ");
		result.append(productMaintTypeId);
		result.append(", purchaseOrderId: ");
		result.append(purchaseOrderId);
		result.append(", scheduleWorkEffortId: ");
		result.append(scheduleWorkEffortId);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(')');
		return result.toString();
	}

} //FixedAssetMaintImpl
