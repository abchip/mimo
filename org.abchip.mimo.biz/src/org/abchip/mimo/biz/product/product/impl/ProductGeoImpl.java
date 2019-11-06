/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product.impl;

import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.geo.Geo;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.product.product.ProductGeo;
import org.abchip.mimo.biz.product.product.ProductPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Geo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductGeoImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductGeoImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductGeoImpl#getGeoId <em>Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductGeoImpl#getProductGeoEnumId <em>Product Geo Enum Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductGeoImpl extends BizEntityImpl implements ProductGeo {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected Product productId;

	/**
	 * The cached value of the '{@link #getGeoId() <em>Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoId()
	 * @generated
	 * @ordered
	 */
	protected Geo geoId;

	/**
	 * The cached value of the '{@link #getProductGeoEnumId() <em>Product Geo Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductGeoEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration productGeoEnumId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductGeoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.PRODUCT_GEO;
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
		description = newDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getGeoId() {
		if (geoId != null && ((EObject)geoId).eIsProxy()) {
			InternalEObject oldGeoId = (InternalEObject)geoId;
			geoId = (Geo)eResolveProxy(oldGeoId);
			if (geoId != oldGeoId) {
			}
		}
		return geoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geo basicGetGeoId() {
		return geoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoId(Geo newGeoId) {
		geoId = newGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getProductGeoEnumId() {
		if (productGeoEnumId != null && ((EObject)productGeoEnumId).eIsProxy()) {
			InternalEObject oldProductGeoEnumId = (InternalEObject)productGeoEnumId;
			productGeoEnumId = (Enumeration)eResolveProxy(oldProductGeoEnumId);
			if (productGeoEnumId != oldProductGeoEnumId) {
			}
		}
		return productGeoEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetProductGeoEnumId() {
		return productGeoEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductGeoEnumId(Enumeration newProductGeoEnumId) {
		productGeoEnumId = newProductGeoEnumId;
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
			case ProductPackage.PRODUCT_GEO__DESCRIPTION:
				return getDescription();
			case ProductPackage.PRODUCT_GEO__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case ProductPackage.PRODUCT_GEO__GEO_ID:
				if (resolve) return getGeoId();
				return basicGetGeoId();
			case ProductPackage.PRODUCT_GEO__PRODUCT_GEO_ENUM_ID:
				if (resolve) return getProductGeoEnumId();
				return basicGetProductGeoEnumId();
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
			case ProductPackage.PRODUCT_GEO__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ProductPackage.PRODUCT_GEO__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case ProductPackage.PRODUCT_GEO__GEO_ID:
				setGeoId((Geo)newValue);
				return;
			case ProductPackage.PRODUCT_GEO__PRODUCT_GEO_ENUM_ID:
				setProductGeoEnumId((Enumeration)newValue);
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
			case ProductPackage.PRODUCT_GEO__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_GEO__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case ProductPackage.PRODUCT_GEO__GEO_ID:
				setGeoId((Geo)null);
				return;
			case ProductPackage.PRODUCT_GEO__PRODUCT_GEO_ENUM_ID:
				setProductGeoEnumId((Enumeration)null);
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
			case ProductPackage.PRODUCT_GEO__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ProductPackage.PRODUCT_GEO__PRODUCT_ID:
				return productId != null;
			case ProductPackage.PRODUCT_GEO__GEO_ID:
				return geoId != null;
			case ProductPackage.PRODUCT_GEO__PRODUCT_GEO_ENUM_ID:
				return productGeoEnumId != null;
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ProductGeoImpl
