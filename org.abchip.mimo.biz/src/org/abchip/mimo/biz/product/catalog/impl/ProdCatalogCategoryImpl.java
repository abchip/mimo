/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.catalog.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.product.catalog.CatalogPackage;
import org.abchip.mimo.biz.product.catalog.ProdCatalog;
import org.abchip.mimo.biz.product.catalog.ProdCatalogCategory;
import org.abchip.mimo.biz.product.catalog.ProdCatalogCategoryType;
import org.abchip.mimo.biz.product.category.ProductCategory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prod Catalog Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.catalog.impl.ProdCatalogCategoryImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.catalog.impl.ProdCatalogCategoryImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.catalog.impl.ProdCatalogCategoryImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.catalog.impl.ProdCatalogCategoryImpl#getProdCatalogId <em>Prod Catalog Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.catalog.impl.ProdCatalogCategoryImpl#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.catalog.impl.ProdCatalogCategoryImpl#getProdCatalogCategoryTypeId <em>Prod Catalog Category Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProdCatalogCategoryImpl extends BizEntityTypedImpl<ProdCatalogCategoryType> implements ProdCatalogCategory {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
	 * The cached value of the '{@link #getProdCatalogId() <em>Prod Catalog Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdCatalogId()
	 * @generated
	 * @ordered
	 */
	protected ProdCatalog prodCatalogId;

	/**
	 * The cached value of the '{@link #getProductCategoryId() <em>Product Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryId()
	 * @generated
	 * @ordered
	 */
	protected ProductCategory productCategoryId;

	/**
	 * The cached value of the '{@link #getProdCatalogCategoryTypeId() <em>Prod Catalog Category Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdCatalogCategoryTypeId()
	 * @generated
	 * @ordered
	 */
	protected ProdCatalogCategoryType prodCatalogCategoryTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProdCatalogCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CatalogPackage.Literals.PROD_CATALOG_CATEGORY;
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
		fromDate = newFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategory getProductCategoryId() {
		if (productCategoryId != null && ((EObject)productCategoryId).eIsProxy()) {
			InternalEObject oldProductCategoryId = (InternalEObject)productCategoryId;
			productCategoryId = (ProductCategory)eResolveProxy(oldProductCategoryId);
			if (productCategoryId != oldProductCategoryId) {
			}
		}
		return productCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductCategory basicGetProductCategoryId() {
		return productCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategoryId(ProductCategory newProductCategoryId) {
		productCategoryId = newProductCategoryId;
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
		sequenceNum = newSequenceNum;
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
		thruDate = newThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProdCatalog getProdCatalogId() {
		if (prodCatalogId != null && ((EObject)prodCatalogId).eIsProxy()) {
			InternalEObject oldProdCatalogId = (InternalEObject)prodCatalogId;
			prodCatalogId = (ProdCatalog)eResolveProxy(oldProdCatalogId);
			if (prodCatalogId != oldProdCatalogId) {
			}
		}
		return prodCatalogId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProdCatalog basicGetProdCatalogId() {
		return prodCatalogId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProdCatalogId(ProdCatalog newProdCatalogId) {
		prodCatalogId = newProdCatalogId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProdCatalogCategoryType getProdCatalogCategoryTypeId() {
		if (prodCatalogCategoryTypeId != null && ((EObject)prodCatalogCategoryTypeId).eIsProxy()) {
			InternalEObject oldProdCatalogCategoryTypeId = (InternalEObject)prodCatalogCategoryTypeId;
			prodCatalogCategoryTypeId = (ProdCatalogCategoryType)eResolveProxy(oldProdCatalogCategoryTypeId);
			if (prodCatalogCategoryTypeId != oldProdCatalogCategoryTypeId) {
			}
		}
		return prodCatalogCategoryTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProdCatalogCategoryType basicGetProdCatalogCategoryTypeId() {
		return prodCatalogCategoryTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProdCatalogCategoryTypeId(ProdCatalogCategoryType newProdCatalogCategoryTypeId) {
		prodCatalogCategoryTypeId = newProdCatalogCategoryTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CatalogPackage.PROD_CATALOG_CATEGORY__FROM_DATE:
				return getFromDate();
			case CatalogPackage.PROD_CATALOG_CATEGORY__SEQUENCE_NUM:
				return getSequenceNum();
			case CatalogPackage.PROD_CATALOG_CATEGORY__THRU_DATE:
				return getThruDate();
			case CatalogPackage.PROD_CATALOG_CATEGORY__PROD_CATALOG_ID:
				if (resolve) return getProdCatalogId();
				return basicGetProdCatalogId();
			case CatalogPackage.PROD_CATALOG_CATEGORY__PRODUCT_CATEGORY_ID:
				if (resolve) return getProductCategoryId();
				return basicGetProductCategoryId();
			case CatalogPackage.PROD_CATALOG_CATEGORY__PROD_CATALOG_CATEGORY_TYPE_ID:
				if (resolve) return getProdCatalogCategoryTypeId();
				return basicGetProdCatalogCategoryTypeId();
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
			case CatalogPackage.PROD_CATALOG_CATEGORY__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case CatalogPackage.PROD_CATALOG_CATEGORY__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case CatalogPackage.PROD_CATALOG_CATEGORY__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case CatalogPackage.PROD_CATALOG_CATEGORY__PROD_CATALOG_ID:
				setProdCatalogId((ProdCatalog)newValue);
				return;
			case CatalogPackage.PROD_CATALOG_CATEGORY__PRODUCT_CATEGORY_ID:
				setProductCategoryId((ProductCategory)newValue);
				return;
			case CatalogPackage.PROD_CATALOG_CATEGORY__PROD_CATALOG_CATEGORY_TYPE_ID:
				setProdCatalogCategoryTypeId((ProdCatalogCategoryType)newValue);
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
			case CatalogPackage.PROD_CATALOG_CATEGORY__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case CatalogPackage.PROD_CATALOG_CATEGORY__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case CatalogPackage.PROD_CATALOG_CATEGORY__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case CatalogPackage.PROD_CATALOG_CATEGORY__PROD_CATALOG_ID:
				setProdCatalogId((ProdCatalog)null);
				return;
			case CatalogPackage.PROD_CATALOG_CATEGORY__PRODUCT_CATEGORY_ID:
				setProductCategoryId((ProductCategory)null);
				return;
			case CatalogPackage.PROD_CATALOG_CATEGORY__PROD_CATALOG_CATEGORY_TYPE_ID:
				setProdCatalogCategoryTypeId((ProdCatalogCategoryType)null);
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
			case CatalogPackage.PROD_CATALOG_CATEGORY__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case CatalogPackage.PROD_CATALOG_CATEGORY__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case CatalogPackage.PROD_CATALOG_CATEGORY__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case CatalogPackage.PROD_CATALOG_CATEGORY__PROD_CATALOG_ID:
				return prodCatalogId != null;
			case CatalogPackage.PROD_CATALOG_CATEGORY__PRODUCT_CATEGORY_ID:
				return productCategoryId != null;
			case CatalogPackage.PROD_CATALOG_CATEGORY__PROD_CATALOG_CATEGORY_TYPE_ID:
				return prodCatalogCategoryTypeId != null;
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
		result.append(" (fromDate: ");
		result.append(fromDate);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //ProdCatalogCategoryImpl
