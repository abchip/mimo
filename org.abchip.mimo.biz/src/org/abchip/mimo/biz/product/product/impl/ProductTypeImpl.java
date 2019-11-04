/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.product.product.ProductPackage;
import org.abchip.mimo.biz.product.product.ProductType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductTypeImpl#getProductTypeId <em>Product Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductTypeImpl#isIsDigital <em>Is Digital</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductTypeImpl#isIsPhysical <em>Is Physical</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductTypeImpl#getProductTypeAttrs <em>Product Type Attrs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductTypeImpl extends BizEntityTypeImpl<Product> implements ProductType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getProductTypeId() <em>Product Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductTypeId() <em>Product Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductTypeId()
	 * @generated
	 * @ordered
	 */
	protected String productTypeId = PRODUCT_TYPE_ID_EDEFAULT;

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
	 * The default value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_TABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected boolean hasTable = HAS_TABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDigital() <em>Is Digital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDigital()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DIGITAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDigital() <em>Is Digital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDigital()
	 * @generated
	 * @ordered
	 */
	protected boolean isDigital = IS_DIGITAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPhysical() <em>Is Physical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPhysical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PHYSICAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPhysical() <em>Is Physical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPhysical()
	 * @generated
	 * @ordered
	 */
	protected boolean isPhysical = IS_PHYSICAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected ProductType parentTypeId;

	/**
	 * The cached value of the '{@link #getProductTypeAttrs() <em>Product Type Attrs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductTypeAttrs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> productTypeAttrs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.PRODUCT_TYPE;
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
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return hasTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		boolean oldHasTable = hasTable;
		hasTable = newHasTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_TYPE__HAS_TABLE, oldHasTable, hasTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsDigital() {
		return isDigital;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDigital(boolean newIsDigital) {
		boolean oldIsDigital = isDigital;
		isDigital = newIsDigital;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_TYPE__IS_DIGITAL, oldIsDigital, isDigital));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsPhysical() {
		return isPhysical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPhysical(boolean newIsPhysical) {
		boolean oldIsPhysical = isPhysical;
		isPhysical = newIsPhysical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_TYPE__IS_PHYSICAL, oldIsPhysical, isPhysical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (ProductType)eResolveProxy(oldParentTypeId);
			if (parentTypeId != oldParentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
			}
		}
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(ProductType newParentTypeId) {
		ProductType oldParentTypeId = parentTypeId;
		parentTypeId = newParentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductTypeId() {
		return productTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductTypeId(String newProductTypeId) {
		String oldProductTypeId = productTypeId;
		productTypeId = newProductTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_TYPE__PRODUCT_TYPE_ID, oldProductTypeId, productTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getProductTypeAttrs() {
		if (productTypeAttrs == null) {
			productTypeAttrs = new EDataTypeUniqueEList<String>(String.class, this, ProductPackage.PRODUCT_TYPE__PRODUCT_TYPE_ATTRS);
		}
		return productTypeAttrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childProductTypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> products() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.PRODUCT_TYPE__PRODUCT_TYPE_ID:
				return getProductTypeId();
			case ProductPackage.PRODUCT_TYPE__DESCRIPTION:
				return getDescription();
			case ProductPackage.PRODUCT_TYPE__HAS_TABLE:
				return isHasTable();
			case ProductPackage.PRODUCT_TYPE__IS_DIGITAL:
				return isIsDigital();
			case ProductPackage.PRODUCT_TYPE__IS_PHYSICAL:
				return isIsPhysical();
			case ProductPackage.PRODUCT_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
			case ProductPackage.PRODUCT_TYPE__PRODUCT_TYPE_ATTRS:
				return getProductTypeAttrs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProductPackage.PRODUCT_TYPE__PRODUCT_TYPE_ID:
				setProductTypeId((String)newValue);
				return;
			case ProductPackage.PRODUCT_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ProductPackage.PRODUCT_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case ProductPackage.PRODUCT_TYPE__IS_DIGITAL:
				setIsDigital((Boolean)newValue);
				return;
			case ProductPackage.PRODUCT_TYPE__IS_PHYSICAL:
				setIsPhysical((Boolean)newValue);
				return;
			case ProductPackage.PRODUCT_TYPE__PARENT_TYPE_ID:
				setParentTypeId((ProductType)newValue);
				return;
			case ProductPackage.PRODUCT_TYPE__PRODUCT_TYPE_ATTRS:
				getProductTypeAttrs().clear();
				getProductTypeAttrs().addAll((Collection<? extends String>)newValue);
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
			case ProductPackage.PRODUCT_TYPE__PRODUCT_TYPE_ID:
				setProductTypeId(PRODUCT_TYPE_ID_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_TYPE__IS_DIGITAL:
				setIsDigital(IS_DIGITAL_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_TYPE__IS_PHYSICAL:
				setIsPhysical(IS_PHYSICAL_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_TYPE__PARENT_TYPE_ID:
				setParentTypeId((ProductType)null);
				return;
			case ProductPackage.PRODUCT_TYPE__PRODUCT_TYPE_ATTRS:
				getProductTypeAttrs().clear();
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
			case ProductPackage.PRODUCT_TYPE__PRODUCT_TYPE_ID:
				return PRODUCT_TYPE_ID_EDEFAULT == null ? productTypeId != null : !PRODUCT_TYPE_ID_EDEFAULT.equals(productTypeId);
			case ProductPackage.PRODUCT_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ProductPackage.PRODUCT_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case ProductPackage.PRODUCT_TYPE__IS_DIGITAL:
				return isDigital != IS_DIGITAL_EDEFAULT;
			case ProductPackage.PRODUCT_TYPE__IS_PHYSICAL:
				return isPhysical != IS_PHYSICAL_EDEFAULT;
			case ProductPackage.PRODUCT_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
			case ProductPackage.PRODUCT_TYPE__PRODUCT_TYPE_ATTRS:
				return productTypeAttrs != null && !productTypeAttrs.isEmpty();
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
		result.append(" (productTypeId: ");
		result.append(productTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(", isDigital: ");
		result.append(isDigital);
		result.append(", isPhysical: ");
		result.append(isPhysical);
		result.append(", productTypeAttrs: ");
		result.append(productTypeAttrs);
		result.append(')');
		return result.toString();
	}

} //ProductTypeImpl
