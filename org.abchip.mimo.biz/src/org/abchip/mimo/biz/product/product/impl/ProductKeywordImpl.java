/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.product.ProductKeyword;
import org.abchip.mimo.biz.product.product.ProductPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Keyword</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductKeywordImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductKeywordImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductKeywordImpl#getKeywordTypeId <em>Keyword Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductKeywordImpl#getRelevancyWeight <em>Relevancy Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductKeywordImpl#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductKeywordImpl extends BizEntityImpl implements ProductKeyword {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected String productId = PRODUCT_ID_EDEFAULT;

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
	 * The default value of the '{@link #getKeywordTypeId() <em>Keyword Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywordTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYWORD_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeywordTypeId() <em>Keyword Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywordTypeId()
	 * @generated
	 * @ordered
	 */
	protected String keywordTypeId = KEYWORD_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelevancyWeight() <em>Relevancy Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevancyWeight()
	 * @generated
	 * @ordered
	 */
	protected static final long RELEVANCY_WEIGHT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRelevancyWeight() <em>Relevancy Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevancyWeight()
	 * @generated
	 * @ordered
	 */
	protected long relevancyWeight = RELEVANCY_WEIGHT_EDEFAULT;

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
	protected ProductKeywordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.PRODUCT_KEYWORD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_KEYWORD__KEYWORD, oldKeyword, keyword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeywordTypeId() {
		return keywordTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeywordTypeId(String newKeywordTypeId) {
		String oldKeywordTypeId = keywordTypeId;
		keywordTypeId = newKeywordTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_KEYWORD__KEYWORD_TYPE_ID, oldKeywordTypeId, keywordTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getRelevancyWeight() {
		return relevancyWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelevancyWeight(long newRelevancyWeight) {
		long oldRelevancyWeight = relevancyWeight;
		relevancyWeight = newRelevancyWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_KEYWORD__RELEVANCY_WEIGHT, oldRelevancyWeight, relevancyWeight));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_KEYWORD__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(String newProductId) {
		String oldProductId = productId;
		productId = newProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_KEYWORD__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.PRODUCT_KEYWORD__PRODUCT_ID:
				return getProductId();
			case ProductPackage.PRODUCT_KEYWORD__KEYWORD:
				return getKeyword();
			case ProductPackage.PRODUCT_KEYWORD__KEYWORD_TYPE_ID:
				return getKeywordTypeId();
			case ProductPackage.PRODUCT_KEYWORD__RELEVANCY_WEIGHT:
				return getRelevancyWeight();
			case ProductPackage.PRODUCT_KEYWORD__STATUS_ID:
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
			case ProductPackage.PRODUCT_KEYWORD__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case ProductPackage.PRODUCT_KEYWORD__KEYWORD:
				setKeyword((String)newValue);
				return;
			case ProductPackage.PRODUCT_KEYWORD__KEYWORD_TYPE_ID:
				setKeywordTypeId((String)newValue);
				return;
			case ProductPackage.PRODUCT_KEYWORD__RELEVANCY_WEIGHT:
				setRelevancyWeight((Long)newValue);
				return;
			case ProductPackage.PRODUCT_KEYWORD__STATUS_ID:
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
			case ProductPackage.PRODUCT_KEYWORD__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_KEYWORD__KEYWORD:
				setKeyword(KEYWORD_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_KEYWORD__KEYWORD_TYPE_ID:
				setKeywordTypeId(KEYWORD_TYPE_ID_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_KEYWORD__RELEVANCY_WEIGHT:
				setRelevancyWeight(RELEVANCY_WEIGHT_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_KEYWORD__STATUS_ID:
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
			case ProductPackage.PRODUCT_KEYWORD__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case ProductPackage.PRODUCT_KEYWORD__KEYWORD:
				return KEYWORD_EDEFAULT == null ? keyword != null : !KEYWORD_EDEFAULT.equals(keyword);
			case ProductPackage.PRODUCT_KEYWORD__KEYWORD_TYPE_ID:
				return KEYWORD_TYPE_ID_EDEFAULT == null ? keywordTypeId != null : !KEYWORD_TYPE_ID_EDEFAULT.equals(keywordTypeId);
			case ProductPackage.PRODUCT_KEYWORD__RELEVANCY_WEIGHT:
				return relevancyWeight != RELEVANCY_WEIGHT_EDEFAULT;
			case ProductPackage.PRODUCT_KEYWORD__STATUS_ID:
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
		result.append(" (productId: ");
		result.append(productId);
		result.append(", keyword: ");
		result.append(keyword);
		result.append(", keywordTypeId: ");
		result.append(keywordTypeId);
		result.append(", relevancyWeight: ");
		result.append(relevancyWeight);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(')');
		return result.toString();
	}

} //ProductKeywordImpl
