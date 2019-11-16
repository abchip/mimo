/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.product.product.ProductMaint;
import org.abchip.mimo.biz.product.product.ProductMaintType;
import org.abchip.mimo.biz.product.product.ProductMeterType;
import org.abchip.mimo.biz.product.product.ProductPackage;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Maint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductMaintImpl#getProductMaintSeqId <em>Product Maint Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductMaintImpl#getIntervalQuantity <em>Interval Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductMaintImpl#getMaintName <em>Maint Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductMaintImpl#getRepeatCount <em>Repeat Count</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductMaintImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductMaintImpl#getProductMaintTypeId <em>Product Maint Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductMaintImpl#getMaintTemplateWorkEffortId <em>Maint Template Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductMaintImpl#getIntervalUomId <em>Interval Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductMaintImpl#getIntervalMeterTypeId <em>Interval Meter Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductMaintImpl extends BizEntityTypedImpl<ProductMaintType> implements ProductMaint {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The default value of the '{@link #getMaintName() <em>Maint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintName()
	 * @generated
	 * @ordered
	 */
	protected static final String MAINT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaintName() <em>Maint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintName()
	 * @generated
	 * @ordered
	 */
	protected String maintName = MAINT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepeatCount() <em>Repeat Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatCount()
	 * @generated
	 * @ordered
	 */
	protected static final long REPEAT_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRepeatCount() <em>Repeat Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatCount()
	 * @generated
	 * @ordered
	 */
	protected long repeatCount = REPEAT_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected Product productId;

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
	 * The cached value of the '{@link #getMaintTemplateWorkEffortId() <em>Maint Template Work Effort Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintTemplateWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected WorkEffort maintTemplateWorkEffortId;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductMaintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.PRODUCT_MAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_MAINT__INTERVAL_QUANTITY, oldIntervalQuantity, intervalQuantity));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT_MAINT__INTERVAL_UOM_ID, oldIntervalUomId, intervalUomId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_MAINT__INTERVAL_UOM_ID, oldIntervalUomId, intervalUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaintName() {
		return maintName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaintName(String newMaintName) {
		String oldMaintName = maintName;
		maintName = newMaintName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_MAINT__MAINT_NAME, oldMaintName, maintName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffort getMaintTemplateWorkEffortId() {
		if (maintTemplateWorkEffortId != null && ((EObject)maintTemplateWorkEffortId).eIsProxy()) {
			InternalEObject oldMaintTemplateWorkEffortId = (InternalEObject)maintTemplateWorkEffortId;
			maintTemplateWorkEffortId = (WorkEffort)eResolveProxy(oldMaintTemplateWorkEffortId);
			if (maintTemplateWorkEffortId != oldMaintTemplateWorkEffortId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT_MAINT__MAINT_TEMPLATE_WORK_EFFORT_ID, oldMaintTemplateWorkEffortId, maintTemplateWorkEffortId));
			}
		}
		return maintTemplateWorkEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkEffort basicGetMaintTemplateWorkEffortId() {
		return maintTemplateWorkEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaintTemplateWorkEffortId(WorkEffort newMaintTemplateWorkEffortId) {
		WorkEffort oldMaintTemplateWorkEffortId = maintTemplateWorkEffortId;
		maintTemplateWorkEffortId = newMaintTemplateWorkEffortId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_MAINT__MAINT_TEMPLATE_WORK_EFFORT_ID, oldMaintTemplateWorkEffortId, maintTemplateWorkEffortId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_MAINT__PRODUCT_MAINT_SEQ_ID, oldProductMaintSeqId, productMaintSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getRepeatCount() {
		return repeatCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepeatCount(long newRepeatCount) {
		long oldRepeatCount = repeatCount;
		repeatCount = newRepeatCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_MAINT__REPEAT_COUNT, oldRepeatCount, repeatCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductId() {
		if (productId != null && ((EObject)productId).eIsProxy()) {
			InternalEObject oldProductId = (InternalEObject)productId;
			productId = (Product)eResolveProxy(oldProductId);
			if (productId != oldProductId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT_MAINT__PRODUCT_ID, oldProductId, productId));
			}
		}
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		Product oldProductId = productId;
		productId = newProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_MAINT__PRODUCT_ID, oldProductId, productId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT_MAINT__PRODUCT_MAINT_TYPE_ID, oldProductMaintTypeId, productMaintTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_MAINT__PRODUCT_MAINT_TYPE_ID, oldProductMaintTypeId, productMaintTypeId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT_MAINT__INTERVAL_METER_TYPE_ID, oldIntervalMeterTypeId, intervalMeterTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_MAINT__INTERVAL_METER_TYPE_ID, oldIntervalMeterTypeId, intervalMeterTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.PRODUCT_MAINT__PRODUCT_MAINT_SEQ_ID:
				return getProductMaintSeqId();
			case ProductPackage.PRODUCT_MAINT__INTERVAL_QUANTITY:
				return getIntervalQuantity();
			case ProductPackage.PRODUCT_MAINT__MAINT_NAME:
				return getMaintName();
			case ProductPackage.PRODUCT_MAINT__REPEAT_COUNT:
				return getRepeatCount();
			case ProductPackage.PRODUCT_MAINT__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case ProductPackage.PRODUCT_MAINT__PRODUCT_MAINT_TYPE_ID:
				if (resolve) return getProductMaintTypeId();
				return basicGetProductMaintTypeId();
			case ProductPackage.PRODUCT_MAINT__MAINT_TEMPLATE_WORK_EFFORT_ID:
				if (resolve) return getMaintTemplateWorkEffortId();
				return basicGetMaintTemplateWorkEffortId();
			case ProductPackage.PRODUCT_MAINT__INTERVAL_UOM_ID:
				if (resolve) return getIntervalUomId();
				return basicGetIntervalUomId();
			case ProductPackage.PRODUCT_MAINT__INTERVAL_METER_TYPE_ID:
				if (resolve) return getIntervalMeterTypeId();
				return basicGetIntervalMeterTypeId();
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
			case ProductPackage.PRODUCT_MAINT__PRODUCT_MAINT_SEQ_ID:
				setProductMaintSeqId((String)newValue);
				return;
			case ProductPackage.PRODUCT_MAINT__INTERVAL_QUANTITY:
				setIntervalQuantity((BigDecimal)newValue);
				return;
			case ProductPackage.PRODUCT_MAINT__MAINT_NAME:
				setMaintName((String)newValue);
				return;
			case ProductPackage.PRODUCT_MAINT__REPEAT_COUNT:
				setRepeatCount((Long)newValue);
				return;
			case ProductPackage.PRODUCT_MAINT__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case ProductPackage.PRODUCT_MAINT__PRODUCT_MAINT_TYPE_ID:
				setProductMaintTypeId((ProductMaintType)newValue);
				return;
			case ProductPackage.PRODUCT_MAINT__MAINT_TEMPLATE_WORK_EFFORT_ID:
				setMaintTemplateWorkEffortId((WorkEffort)newValue);
				return;
			case ProductPackage.PRODUCT_MAINT__INTERVAL_UOM_ID:
				setIntervalUomId((Uom)newValue);
				return;
			case ProductPackage.PRODUCT_MAINT__INTERVAL_METER_TYPE_ID:
				setIntervalMeterTypeId((ProductMeterType)newValue);
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
			case ProductPackage.PRODUCT_MAINT__PRODUCT_MAINT_SEQ_ID:
				setProductMaintSeqId(PRODUCT_MAINT_SEQ_ID_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_MAINT__INTERVAL_QUANTITY:
				setIntervalQuantity(INTERVAL_QUANTITY_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_MAINT__MAINT_NAME:
				setMaintName(MAINT_NAME_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_MAINT__REPEAT_COUNT:
				setRepeatCount(REPEAT_COUNT_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_MAINT__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case ProductPackage.PRODUCT_MAINT__PRODUCT_MAINT_TYPE_ID:
				setProductMaintTypeId((ProductMaintType)null);
				return;
			case ProductPackage.PRODUCT_MAINT__MAINT_TEMPLATE_WORK_EFFORT_ID:
				setMaintTemplateWorkEffortId((WorkEffort)null);
				return;
			case ProductPackage.PRODUCT_MAINT__INTERVAL_UOM_ID:
				setIntervalUomId((Uom)null);
				return;
			case ProductPackage.PRODUCT_MAINT__INTERVAL_METER_TYPE_ID:
				setIntervalMeterTypeId((ProductMeterType)null);
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
			case ProductPackage.PRODUCT_MAINT__PRODUCT_MAINT_SEQ_ID:
				return PRODUCT_MAINT_SEQ_ID_EDEFAULT == null ? productMaintSeqId != null : !PRODUCT_MAINT_SEQ_ID_EDEFAULT.equals(productMaintSeqId);
			case ProductPackage.PRODUCT_MAINT__INTERVAL_QUANTITY:
				return INTERVAL_QUANTITY_EDEFAULT == null ? intervalQuantity != null : !INTERVAL_QUANTITY_EDEFAULT.equals(intervalQuantity);
			case ProductPackage.PRODUCT_MAINT__MAINT_NAME:
				return MAINT_NAME_EDEFAULT == null ? maintName != null : !MAINT_NAME_EDEFAULT.equals(maintName);
			case ProductPackage.PRODUCT_MAINT__REPEAT_COUNT:
				return repeatCount != REPEAT_COUNT_EDEFAULT;
			case ProductPackage.PRODUCT_MAINT__PRODUCT_ID:
				return productId != null;
			case ProductPackage.PRODUCT_MAINT__PRODUCT_MAINT_TYPE_ID:
				return productMaintTypeId != null;
			case ProductPackage.PRODUCT_MAINT__MAINT_TEMPLATE_WORK_EFFORT_ID:
				return maintTemplateWorkEffortId != null;
			case ProductPackage.PRODUCT_MAINT__INTERVAL_UOM_ID:
				return intervalUomId != null;
			case ProductPackage.PRODUCT_MAINT__INTERVAL_METER_TYPE_ID:
				return intervalMeterTypeId != null;
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
		result.append(" (productMaintSeqId: ");
		result.append(productMaintSeqId);
		result.append(", intervalQuantity: ");
		result.append(intervalQuantity);
		result.append(", maintName: ");
		result.append(maintName);
		result.append(", repeatCount: ");
		result.append(repeatCount);
		result.append(')');
		return result.toString();
	}

} //ProductMaintImpl
