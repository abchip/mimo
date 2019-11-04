/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.promo.ProductPromo;
import org.abchip.mimo.biz.product.store.ProductStorePromoAppl;
import org.abchip.mimo.biz.product.store.StorePackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Store Promo Appl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStorePromoApplImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStorePromoApplImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStorePromoApplImpl#isManualOnly <em>Manual Only</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStorePromoApplImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStorePromoApplImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStorePromoApplImpl#getProductPromoId <em>Product Promo Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductStorePromoApplImpl extends BizEntityImpl implements ProductStorePromoAppl {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_STORE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected String productStoreId = PRODUCT_STORE_ID_EDEFAULT;

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
	 * The default value of the '{@link #isManualOnly() <em>Manual Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManualOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANUAL_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isManualOnly() <em>Manual Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManualOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean manualOnly = MANUAL_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected static final long SEQUENCE_NUM_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected long sequenceNum = SEQUENCE_NUM_EDEFAULT;

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
	 * The cached value of the '{@link #getProductPromoId() <em>Product Promo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoId()
	 * @generated
	 * @ordered
	 */
	protected ProductPromo productPromoId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductStorePromoApplImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.PRODUCT_STORE_PROMO_APPL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_PROMO_APPL__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isManualOnly() {
		return manualOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManualOnly(boolean newManualOnly) {
		boolean oldManualOnly = manualOnly;
		manualOnly = newManualOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_PROMO_APPL__MANUAL_ONLY, oldManualOnly, manualOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceNum() {
		return sequenceNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNum(long newSequenceNum) {
		long oldSequenceNum = sequenceNum;
		sequenceNum = newSequenceNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_PROMO_APPL__SEQUENCE_NUM, oldSequenceNum, sequenceNum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_PROMO_APPL__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductStoreId() {
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(String newProductStoreId) {
		String oldProductStoreId = productStoreId;
		productStoreId = newProductStoreId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_PROMO_APPL__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPromo getProductPromoId() {
		if (productPromoId != null && ((EObject)productPromoId).eIsProxy()) {
			InternalEObject oldProductPromoId = (InternalEObject)productPromoId;
			productPromoId = (ProductPromo)eResolveProxy(oldProductPromoId);
			if (productPromoId != oldProductPromoId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE_PROMO_APPL__PRODUCT_PROMO_ID, oldProductPromoId, productPromoId));
			}
		}
		return productPromoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductPromo basicGetProductPromoId() {
		return productPromoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoId(ProductPromo newProductPromoId) {
		ProductPromo oldProductPromoId = productPromoId;
		productPromoId = newProductPromoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_PROMO_APPL__PRODUCT_PROMO_ID, oldProductPromoId, productPromoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.PRODUCT_STORE_PROMO_APPL__PRODUCT_STORE_ID:
				return getProductStoreId();
			case StorePackage.PRODUCT_STORE_PROMO_APPL__FROM_DATE:
				return getFromDate();
			case StorePackage.PRODUCT_STORE_PROMO_APPL__MANUAL_ONLY:
				return isManualOnly();
			case StorePackage.PRODUCT_STORE_PROMO_APPL__SEQUENCE_NUM:
				return getSequenceNum();
			case StorePackage.PRODUCT_STORE_PROMO_APPL__THRU_DATE:
				return getThruDate();
			case StorePackage.PRODUCT_STORE_PROMO_APPL__PRODUCT_PROMO_ID:
				if (resolve) return getProductPromoId();
				return basicGetProductPromoId();
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
			case StorePackage.PRODUCT_STORE_PROMO_APPL__PRODUCT_STORE_ID:
				setProductStoreId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_PROMO_APPL__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case StorePackage.PRODUCT_STORE_PROMO_APPL__MANUAL_ONLY:
				setManualOnly((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE_PROMO_APPL__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case StorePackage.PRODUCT_STORE_PROMO_APPL__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case StorePackage.PRODUCT_STORE_PROMO_APPL__PRODUCT_PROMO_ID:
				setProductPromoId((ProductPromo)newValue);
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
			case StorePackage.PRODUCT_STORE_PROMO_APPL__PRODUCT_STORE_ID:
				setProductStoreId(PRODUCT_STORE_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_PROMO_APPL__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_PROMO_APPL__MANUAL_ONLY:
				setManualOnly(MANUAL_ONLY_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_PROMO_APPL__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_PROMO_APPL__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_PROMO_APPL__PRODUCT_PROMO_ID:
				setProductPromoId((ProductPromo)null);
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
			case StorePackage.PRODUCT_STORE_PROMO_APPL__PRODUCT_STORE_ID:
				return PRODUCT_STORE_ID_EDEFAULT == null ? productStoreId != null : !PRODUCT_STORE_ID_EDEFAULT.equals(productStoreId);
			case StorePackage.PRODUCT_STORE_PROMO_APPL__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case StorePackage.PRODUCT_STORE_PROMO_APPL__MANUAL_ONLY:
				return manualOnly != MANUAL_ONLY_EDEFAULT;
			case StorePackage.PRODUCT_STORE_PROMO_APPL__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case StorePackage.PRODUCT_STORE_PROMO_APPL__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case StorePackage.PRODUCT_STORE_PROMO_APPL__PRODUCT_PROMO_ID:
				return productPromoId != null;
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
		result.append(" (productStoreId: ");
		result.append(productStoreId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", manualOnly: ");
		result.append(manualOnly);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //ProductStorePromoApplImpl
