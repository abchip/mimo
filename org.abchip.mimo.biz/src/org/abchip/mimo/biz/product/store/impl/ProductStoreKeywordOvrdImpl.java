/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store.impl;

import java.util.Date;

import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.store.ProductStoreKeywordOvrd;
import org.abchip.mimo.biz.product.store.StorePackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Store Keyword Ovrd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreKeywordOvrdImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreKeywordOvrdImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreKeywordOvrdImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreKeywordOvrdImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreKeywordOvrdImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreKeywordOvrdImpl#getTargetTypeEnumId <em>Target Type Enum Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductStoreKeywordOvrdImpl extends BizEntityImpl implements ProductStoreKeywordOvrd {
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
	 * The default value of the '{@link #getKeyword() <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected String keyword = KEYWORD_EDEFAULT;

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
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected String target = TARGET_EDEFAULT;

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
	 * The cached value of the '{@link #getTargetTypeEnumId() <em>Target Type Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTypeEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration targetTypeEnumId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductStoreKeywordOvrdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.PRODUCT_STORE_KEYWORD_OVRD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_KEYWORD_OVRD__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeyword() {
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyword(String newKeyword) {
		String oldKeyword = keyword;
		keyword = newKeyword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_KEYWORD_OVRD__KEYWORD, oldKeyword, keyword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(String newTarget) {
		String oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_KEYWORD_OVRD__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getTargetTypeEnumId() {
		if (targetTypeEnumId != null && ((EObject)targetTypeEnumId).eIsProxy()) {
			InternalEObject oldTargetTypeEnumId = (InternalEObject)targetTypeEnumId;
			targetTypeEnumId = (Enumeration)eResolveProxy(oldTargetTypeEnumId);
			if (targetTypeEnumId != oldTargetTypeEnumId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE_KEYWORD_OVRD__TARGET_TYPE_ENUM_ID, oldTargetTypeEnumId, targetTypeEnumId));
			}
		}
		return targetTypeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetTargetTypeEnumId() {
		return targetTypeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetTypeEnumId(Enumeration newTargetTypeEnumId) {
		Enumeration oldTargetTypeEnumId = targetTypeEnumId;
		targetTypeEnumId = newTargetTypeEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_KEYWORD_OVRD__TARGET_TYPE_ENUM_ID, oldTargetTypeEnumId, targetTypeEnumId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_KEYWORD_OVRD__THRU_DATE, oldThruDate, thruDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_KEYWORD_OVRD__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.PRODUCT_STORE_KEYWORD_OVRD__PRODUCT_STORE_ID:
				return getProductStoreId();
			case StorePackage.PRODUCT_STORE_KEYWORD_OVRD__KEYWORD:
				return getKeyword();
			case StorePackage.PRODUCT_STORE_KEYWORD_OVRD__FROM_DATE:
				return getFromDate();
			case StorePackage.PRODUCT_STORE_KEYWORD_OVRD__TARGET:
				return getTarget();
			case StorePackage.PRODUCT_STORE_KEYWORD_OVRD__THRU_DATE:
				return getThruDate();
			case StorePackage.PRODUCT_STORE_KEYWORD_OVRD__TARGET_TYPE_ENUM_ID:
				if (resolve) return getTargetTypeEnumId();
				return basicGetTargetTypeEnumId();
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
			case StorePackage.PRODUCT_STORE_KEYWORD_OVRD__PRODUCT_STORE_ID:
				setProductStoreId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_KEYWORD_OVRD__KEYWORD:
				setKeyword((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_KEYWORD_OVRD__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case StorePackage.PRODUCT_STORE_KEYWORD_OVRD__TARGET:
				setTarget((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_KEYWORD_OVRD__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case StorePackage.PRODUCT_STORE_KEYWORD_OVRD__TARGET_TYPE_ENUM_ID:
				setTargetTypeEnumId((Enumeration)newValue);
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
			case StorePackage.PRODUCT_STORE_KEYWORD_OVRD__PRODUCT_STORE_ID:
				setProductStoreId(PRODUCT_STORE_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_KEYWORD_OVRD__KEYWORD:
				setKeyword(KEYWORD_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_KEYWORD_OVRD__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_KEYWORD_OVRD__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_KEYWORD_OVRD__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_KEYWORD_OVRD__TARGET_TYPE_ENUM_ID:
				setTargetTypeEnumId((Enumeration)null);
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
			case StorePackage.PRODUCT_STORE_KEYWORD_OVRD__PRODUCT_STORE_ID:
				return PRODUCT_STORE_ID_EDEFAULT == null ? productStoreId != null : !PRODUCT_STORE_ID_EDEFAULT.equals(productStoreId);
			case StorePackage.PRODUCT_STORE_KEYWORD_OVRD__KEYWORD:
				return KEYWORD_EDEFAULT == null ? keyword != null : !KEYWORD_EDEFAULT.equals(keyword);
			case StorePackage.PRODUCT_STORE_KEYWORD_OVRD__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case StorePackage.PRODUCT_STORE_KEYWORD_OVRD__TARGET:
				return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
			case StorePackage.PRODUCT_STORE_KEYWORD_OVRD__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case StorePackage.PRODUCT_STORE_KEYWORD_OVRD__TARGET_TYPE_ENUM_ID:
				return targetTypeEnumId != null;
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
		result.append(", keyword: ");
		result.append(keyword);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", target: ");
		result.append(target);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //ProductStoreKeywordOvrdImpl
