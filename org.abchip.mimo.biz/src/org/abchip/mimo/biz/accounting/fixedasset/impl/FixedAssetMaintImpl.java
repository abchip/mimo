/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.fixedasset.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint;
import org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.product.product.ProductMaintType;
import org.abchip.mimo.biz.product.product.ProductMeterType;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Asset Maint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMaintImpl#getMaintHistSeqId <em>Maint Hist Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMaintImpl#getIntervalQuantity <em>Interval Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMaintImpl#getProductMaintSeqId <em>Product Maint Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMaintImpl#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMaintImpl#getProductMaintTypeId <em>Product Maint Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMaintImpl#getScheduleWorkEffortId <em>Schedule Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMaintImpl#getIntervalUomId <em>Interval Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMaintImpl#getIntervalMeterTypeId <em>Interval Meter Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMaintImpl#getPurchaseOrderId <em>Purchase Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMaintImpl#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FixedAssetMaintImpl extends BizEntityImpl implements FixedAssetMaint {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	 * The cached value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected FixedAsset fixedAssetId;
	/**
	 * The cached value of the '{@link #getProductMaintTypeId() <em>Product Maint Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductMaintTypeId()
	 * @generated
	 * @ordered
	 */
	protected ProductMaintType productMaintTypeId;
	/**
	 * The cached value of the '{@link #getScheduleWorkEffortId() <em>Schedule Work Effort Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected WorkEffort scheduleWorkEffortId;
	/**
	 * The cached value of the '{@link #getIntervalUomId() <em>Interval Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom intervalUomId;
	/**
	 * The cached value of the '{@link #getIntervalMeterTypeId() <em>Interval Meter Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalMeterTypeId()
	 * @generated
	 * @ordered
	 */
	protected ProductMeterType intervalMeterTypeId;
	/**
	 * The cached value of the '{@link #getPurchaseOrderId() <em>Purchase Order Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseOrderId()
	 * @generated
	 * @ordered
	 */
	protected OrderHeader purchaseOrderId;
	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;

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
	public ProductMeterType getIntervalMeterTypeId() {
		if (intervalMeterTypeId != null && ((EObject)intervalMeterTypeId).eIsProxy()) {
			InternalEObject oldIntervalMeterTypeId = (InternalEObject)intervalMeterTypeId;
			intervalMeterTypeId = (ProductMeterType)eResolveProxy(oldIntervalMeterTypeId);
			if (intervalMeterTypeId != oldIntervalMeterTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_METER_TYPE_ID, oldIntervalMeterTypeId, intervalMeterTypeId));
			}
		}
		return intervalMeterTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductMeterType basicGetIntervalMeterTypeId() {
		return intervalMeterTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntervalMeterTypeId(ProductMeterType newIntervalMeterTypeId) {
		ProductMeterType oldIntervalMeterTypeId = intervalMeterTypeId;
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
	public Uom getIntervalUomId() {
		if (intervalUomId != null && ((EObject)intervalUomId).eIsProxy()) {
			InternalEObject oldIntervalUomId = (InternalEObject)intervalUomId;
			intervalUomId = (Uom)eResolveProxy(oldIntervalUomId);
			if (intervalUomId != oldIntervalUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_UOM_ID, oldIntervalUomId, intervalUomId));
			}
		}
		return intervalUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetIntervalUomId() {
		return intervalUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntervalUomId(Uom newIntervalUomId) {
		Uom oldIntervalUomId = intervalUomId;
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
	public ProductMaintType getProductMaintTypeId() {
		if (productMaintTypeId != null && ((EObject)productMaintTypeId).eIsProxy()) {
			InternalEObject oldProductMaintTypeId = (InternalEObject)productMaintTypeId;
			productMaintTypeId = (ProductMaintType)eResolveProxy(oldProductMaintTypeId);
			if (productMaintTypeId != oldProductMaintTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FixedassetPackage.FIXED_ASSET_MAINT__PRODUCT_MAINT_TYPE_ID, oldProductMaintTypeId, productMaintTypeId));
			}
		}
		return productMaintTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductMaintType basicGetProductMaintTypeId() {
		return productMaintTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductMaintTypeId(ProductMaintType newProductMaintTypeId) {
		ProductMaintType oldProductMaintTypeId = productMaintTypeId;
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
	public OrderHeader getPurchaseOrderId() {
		if (purchaseOrderId != null && ((EObject)purchaseOrderId).eIsProxy()) {
			InternalEObject oldPurchaseOrderId = (InternalEObject)purchaseOrderId;
			purchaseOrderId = (OrderHeader)eResolveProxy(oldPurchaseOrderId);
			if (purchaseOrderId != oldPurchaseOrderId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FixedassetPackage.FIXED_ASSET_MAINT__PURCHASE_ORDER_ID, oldPurchaseOrderId, purchaseOrderId));
			}
		}
		return purchaseOrderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderHeader basicGetPurchaseOrderId() {
		return purchaseOrderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchaseOrderId(OrderHeader newPurchaseOrderId) {
		OrderHeader oldPurchaseOrderId = purchaseOrderId;
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
	public WorkEffort getScheduleWorkEffortId() {
		if (scheduleWorkEffortId != null && ((EObject)scheduleWorkEffortId).eIsProxy()) {
			InternalEObject oldScheduleWorkEffortId = (InternalEObject)scheduleWorkEffortId;
			scheduleWorkEffortId = (WorkEffort)eResolveProxy(oldScheduleWorkEffortId);
			if (scheduleWorkEffortId != oldScheduleWorkEffortId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FixedassetPackage.FIXED_ASSET_MAINT__SCHEDULE_WORK_EFFORT_ID, oldScheduleWorkEffortId, scheduleWorkEffortId));
			}
		}
		return scheduleWorkEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkEffort basicGetScheduleWorkEffortId() {
		return scheduleWorkEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScheduleWorkEffortId(WorkEffort newScheduleWorkEffortId) {
		WorkEffort oldScheduleWorkEffortId = scheduleWorkEffortId;
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
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FixedassetPackage.FIXED_ASSET_MAINT__STATUS_ID, oldStatusId, statusId));
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		StatusItem oldStatusId = statusId;
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
	public FixedAsset getFixedAssetId() {
		if (fixedAssetId != null && ((EObject)fixedAssetId).eIsProxy()) {
			InternalEObject oldFixedAssetId = (InternalEObject)fixedAssetId;
			fixedAssetId = (FixedAsset)eResolveProxy(oldFixedAssetId);
			if (fixedAssetId != oldFixedAssetId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FixedassetPackage.FIXED_ASSET_MAINT__FIXED_ASSET_ID, oldFixedAssetId, fixedAssetId));
			}
		}
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedAsset basicGetFixedAssetId() {
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetId(FixedAsset newFixedAssetId) {
		FixedAsset oldFixedAssetId = fixedAssetId;
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
			case FixedassetPackage.FIXED_ASSET_MAINT__MAINT_HIST_SEQ_ID:
				return getMaintHistSeqId();
			case FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_QUANTITY:
				return getIntervalQuantity();
			case FixedassetPackage.FIXED_ASSET_MAINT__PRODUCT_MAINT_SEQ_ID:
				return getProductMaintSeqId();
			case FixedassetPackage.FIXED_ASSET_MAINT__FIXED_ASSET_ID:
				if (resolve) return getFixedAssetId();
				return basicGetFixedAssetId();
			case FixedassetPackage.FIXED_ASSET_MAINT__PRODUCT_MAINT_TYPE_ID:
				if (resolve) return getProductMaintTypeId();
				return basicGetProductMaintTypeId();
			case FixedassetPackage.FIXED_ASSET_MAINT__SCHEDULE_WORK_EFFORT_ID:
				if (resolve) return getScheduleWorkEffortId();
				return basicGetScheduleWorkEffortId();
			case FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_UOM_ID:
				if (resolve) return getIntervalUomId();
				return basicGetIntervalUomId();
			case FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_METER_TYPE_ID:
				if (resolve) return getIntervalMeterTypeId();
				return basicGetIntervalMeterTypeId();
			case FixedassetPackage.FIXED_ASSET_MAINT__PURCHASE_ORDER_ID:
				if (resolve) return getPurchaseOrderId();
				return basicGetPurchaseOrderId();
			case FixedassetPackage.FIXED_ASSET_MAINT__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
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
			case FixedassetPackage.FIXED_ASSET_MAINT__MAINT_HIST_SEQ_ID:
				setMaintHistSeqId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_QUANTITY:
				setIntervalQuantity((BigDecimal)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__PRODUCT_MAINT_SEQ_ID:
				setProductMaintSeqId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__FIXED_ASSET_ID:
				setFixedAssetId((FixedAsset)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__PRODUCT_MAINT_TYPE_ID:
				setProductMaintTypeId((ProductMaintType)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__SCHEDULE_WORK_EFFORT_ID:
				setScheduleWorkEffortId((WorkEffort)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_UOM_ID:
				setIntervalUomId((Uom)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_METER_TYPE_ID:
				setIntervalMeterTypeId((ProductMeterType)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__PURCHASE_ORDER_ID:
				setPurchaseOrderId((OrderHeader)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__STATUS_ID:
				setStatusId((StatusItem)newValue);
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
			case FixedassetPackage.FIXED_ASSET_MAINT__MAINT_HIST_SEQ_ID:
				setMaintHistSeqId(MAINT_HIST_SEQ_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_QUANTITY:
				setIntervalQuantity(INTERVAL_QUANTITY_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__PRODUCT_MAINT_SEQ_ID:
				setProductMaintSeqId(PRODUCT_MAINT_SEQ_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__FIXED_ASSET_ID:
				setFixedAssetId((FixedAsset)null);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__PRODUCT_MAINT_TYPE_ID:
				setProductMaintTypeId((ProductMaintType)null);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__SCHEDULE_WORK_EFFORT_ID:
				setScheduleWorkEffortId((WorkEffort)null);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_UOM_ID:
				setIntervalUomId((Uom)null);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_METER_TYPE_ID:
				setIntervalMeterTypeId((ProductMeterType)null);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__PURCHASE_ORDER_ID:
				setPurchaseOrderId((OrderHeader)null);
				return;
			case FixedassetPackage.FIXED_ASSET_MAINT__STATUS_ID:
				setStatusId((StatusItem)null);
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
			case FixedassetPackage.FIXED_ASSET_MAINT__MAINT_HIST_SEQ_ID:
				return MAINT_HIST_SEQ_ID_EDEFAULT == null ? maintHistSeqId != null : !MAINT_HIST_SEQ_ID_EDEFAULT.equals(maintHistSeqId);
			case FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_QUANTITY:
				return INTERVAL_QUANTITY_EDEFAULT == null ? intervalQuantity != null : !INTERVAL_QUANTITY_EDEFAULT.equals(intervalQuantity);
			case FixedassetPackage.FIXED_ASSET_MAINT__PRODUCT_MAINT_SEQ_ID:
				return PRODUCT_MAINT_SEQ_ID_EDEFAULT == null ? productMaintSeqId != null : !PRODUCT_MAINT_SEQ_ID_EDEFAULT.equals(productMaintSeqId);
			case FixedassetPackage.FIXED_ASSET_MAINT__FIXED_ASSET_ID:
				return fixedAssetId != null;
			case FixedassetPackage.FIXED_ASSET_MAINT__PRODUCT_MAINT_TYPE_ID:
				return productMaintTypeId != null;
			case FixedassetPackage.FIXED_ASSET_MAINT__SCHEDULE_WORK_EFFORT_ID:
				return scheduleWorkEffortId != null;
			case FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_UOM_ID:
				return intervalUomId != null;
			case FixedassetPackage.FIXED_ASSET_MAINT__INTERVAL_METER_TYPE_ID:
				return intervalMeterTypeId != null;
			case FixedassetPackage.FIXED_ASSET_MAINT__PURCHASE_ORDER_ID:
				return purchaseOrderId != null;
			case FixedassetPackage.FIXED_ASSET_MAINT__STATUS_ID:
				return statusId != null;
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
		result.append(" (maintHistSeqId: ");
		result.append(maintHistSeqId);
		result.append(", intervalQuantity: ");
		result.append(intervalQuantity);
		result.append(", productMaintSeqId: ");
		result.append(productMaintSeqId);
		result.append(')');
		return result.toString();
	}

} //FixedAssetMaintImpl
