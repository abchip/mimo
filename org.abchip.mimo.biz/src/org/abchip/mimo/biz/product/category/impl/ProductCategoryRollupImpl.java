/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.category.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.category.CategoryPackage;
import org.abchip.mimo.biz.product.category.ProductCategory;
import org.abchip.mimo.biz.product.category.ProductCategoryRollup;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Category Rollup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryRollupImpl#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryRollupImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryRollupImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryRollupImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryRollupImpl#getParentProductCategoryId <em>Parent Product Category Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductCategoryRollupImpl extends BizEntityImpl implements ProductCategoryRollup {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getProductCategoryId() <em>Product Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_CATEGORY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductCategoryId() <em>Product Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryId()
	 * @generated
	 * @ordered
	 */
	protected String productCategoryId = PRODUCT_CATEGORY_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getParentProductCategoryId() <em>Parent Product Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentProductCategoryId()
	 * @generated
	 * @ordered
	 */
	protected ProductCategory parentProductCategoryId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductCategoryRollupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CategoryPackage.Literals.PRODUCT_CATEGORY_ROLLUP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY_ROLLUP__FROM_DATE, oldFromDate, fromDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY_ROLLUP__SEQUENCE_NUM, oldSequenceNum, sequenceNum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY_ROLLUP__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductCategoryId() {
		return productCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategoryId(String newProductCategoryId) {
		String oldProductCategoryId = productCategoryId;
		productCategoryId = newProductCategoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY_ROLLUP__PRODUCT_CATEGORY_ID, oldProductCategoryId, productCategoryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategory getParentProductCategoryId() {
		if (parentProductCategoryId != null && ((EObject)parentProductCategoryId).eIsProxy()) {
			InternalEObject oldParentProductCategoryId = (InternalEObject)parentProductCategoryId;
			parentProductCategoryId = (ProductCategory)eResolveProxy(oldParentProductCategoryId);
			if (parentProductCategoryId != oldParentProductCategoryId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CategoryPackage.PRODUCT_CATEGORY_ROLLUP__PARENT_PRODUCT_CATEGORY_ID, oldParentProductCategoryId, parentProductCategoryId));
			}
		}
		return parentProductCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductCategory basicGetParentProductCategoryId() {
		return parentProductCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentProductCategoryId(ProductCategory newParentProductCategoryId) {
		ProductCategory oldParentProductCategoryId = parentProductCategoryId;
		parentProductCategoryId = newParentProductCategoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY_ROLLUP__PARENT_PRODUCT_CATEGORY_ID, oldParentProductCategoryId, parentProductCategoryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CategoryPackage.PRODUCT_CATEGORY_ROLLUP__PRODUCT_CATEGORY_ID:
				return getProductCategoryId();
			case CategoryPackage.PRODUCT_CATEGORY_ROLLUP__FROM_DATE:
				return getFromDate();
			case CategoryPackage.PRODUCT_CATEGORY_ROLLUP__SEQUENCE_NUM:
				return getSequenceNum();
			case CategoryPackage.PRODUCT_CATEGORY_ROLLUP__THRU_DATE:
				return getThruDate();
			case CategoryPackage.PRODUCT_CATEGORY_ROLLUP__PARENT_PRODUCT_CATEGORY_ID:
				if (resolve) return getParentProductCategoryId();
				return basicGetParentProductCategoryId();
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
			case CategoryPackage.PRODUCT_CATEGORY_ROLLUP__PRODUCT_CATEGORY_ID:
				setProductCategoryId((String)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_ROLLUP__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_ROLLUP__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_ROLLUP__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_ROLLUP__PARENT_PRODUCT_CATEGORY_ID:
				setParentProductCategoryId((ProductCategory)newValue);
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
			case CategoryPackage.PRODUCT_CATEGORY_ROLLUP__PRODUCT_CATEGORY_ID:
				setProductCategoryId(PRODUCT_CATEGORY_ID_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_ROLLUP__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_ROLLUP__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_ROLLUP__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_ROLLUP__PARENT_PRODUCT_CATEGORY_ID:
				setParentProductCategoryId((ProductCategory)null);
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
			case CategoryPackage.PRODUCT_CATEGORY_ROLLUP__PRODUCT_CATEGORY_ID:
				return PRODUCT_CATEGORY_ID_EDEFAULT == null ? productCategoryId != null : !PRODUCT_CATEGORY_ID_EDEFAULT.equals(productCategoryId);
			case CategoryPackage.PRODUCT_CATEGORY_ROLLUP__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case CategoryPackage.PRODUCT_CATEGORY_ROLLUP__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case CategoryPackage.PRODUCT_CATEGORY_ROLLUP__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case CategoryPackage.PRODUCT_CATEGORY_ROLLUP__PARENT_PRODUCT_CATEGORY_ID:
				return parentProductCategoryId != null;
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
		result.append(" (productCategoryId: ");
		result.append(productCategoryId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //ProductCategoryRollupImpl
