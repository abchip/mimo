/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product.impl;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.product.product.GoodIdentification;
import org.abchip.mimo.biz.product.product.GoodIdentificationType;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.product.product.ProductPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Good Identification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.GoodIdentificationImpl#getIdValue <em>Id Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.GoodIdentificationImpl#getGoodIdentificationTypeId <em>Good Identification Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.GoodIdentificationImpl#getProductId <em>Product Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoodIdentificationImpl extends BizEntityTypedImpl<GoodIdentificationType> implements GoodIdentification {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getIdValue() <em>Id Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdValue() <em>Id Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdValue()
	 * @generated
	 * @ordered
	 */
	protected String idValue = ID_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGoodIdentificationTypeId() <em>Good Identification Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoodIdentificationTypeId()
	 * @generated
	 * @ordered
	 */
	protected GoodIdentificationType goodIdentificationTypeId;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoodIdentificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.GOOD_IDENTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdValue() {
		return idValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdValue(String newIdValue) {
		idValue = newIdValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GoodIdentificationType getGoodIdentificationTypeId() {
		if (goodIdentificationTypeId != null && ((EObject)goodIdentificationTypeId).eIsProxy()) {
			InternalEObject oldGoodIdentificationTypeId = (InternalEObject)goodIdentificationTypeId;
			goodIdentificationTypeId = (GoodIdentificationType)eResolveProxy(oldGoodIdentificationTypeId);
			if (goodIdentificationTypeId != oldGoodIdentificationTypeId) {
			}
		}
		return goodIdentificationTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoodIdentificationType basicGetGoodIdentificationTypeId() {
		return goodIdentificationTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGoodIdentificationTypeId(GoodIdentificationType newGoodIdentificationTypeId) {
		goodIdentificationTypeId = newGoodIdentificationTypeId;
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
		productId = newProductId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.GOOD_IDENTIFICATION__ID_VALUE:
				return getIdValue();
			case ProductPackage.GOOD_IDENTIFICATION__GOOD_IDENTIFICATION_TYPE_ID:
				if (resolve) return getGoodIdentificationTypeId();
				return basicGetGoodIdentificationTypeId();
			case ProductPackage.GOOD_IDENTIFICATION__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
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
			case ProductPackage.GOOD_IDENTIFICATION__ID_VALUE:
				setIdValue((String)newValue);
				return;
			case ProductPackage.GOOD_IDENTIFICATION__GOOD_IDENTIFICATION_TYPE_ID:
				setGoodIdentificationTypeId((GoodIdentificationType)newValue);
				return;
			case ProductPackage.GOOD_IDENTIFICATION__PRODUCT_ID:
				setProductId((Product)newValue);
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
			case ProductPackage.GOOD_IDENTIFICATION__ID_VALUE:
				setIdValue(ID_VALUE_EDEFAULT);
				return;
			case ProductPackage.GOOD_IDENTIFICATION__GOOD_IDENTIFICATION_TYPE_ID:
				setGoodIdentificationTypeId((GoodIdentificationType)null);
				return;
			case ProductPackage.GOOD_IDENTIFICATION__PRODUCT_ID:
				setProductId((Product)null);
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
			case ProductPackage.GOOD_IDENTIFICATION__ID_VALUE:
				return ID_VALUE_EDEFAULT == null ? idValue != null : !ID_VALUE_EDEFAULT.equals(idValue);
			case ProductPackage.GOOD_IDENTIFICATION__GOOD_IDENTIFICATION_TYPE_ID:
				return goodIdentificationTypeId != null;
			case ProductPackage.GOOD_IDENTIFICATION__PRODUCT_ID:
				return productId != null;
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
		result.append(" (idValue: ");
		result.append(idValue);
		result.append(')');
		return result.toString();
	}

} //GoodIdentificationImpl
