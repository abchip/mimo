/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.fixedasset.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProduct;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProductType;
import org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.product.product.Product;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Asset Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetProductImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetProductImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetProductImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetProductImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetProductImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetProductImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetProductImpl#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetProductImpl#getFixedAssetProductTypeId <em>Fixed Asset Product Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetProductImpl#getQuantityUomId <em>Quantity Uom Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FixedAssetProductImpl extends BizEntityTypedImpl<FixedAssetProductType> implements FixedAssetProduct {
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
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;
	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quantity = QUANTITY_EDEFAULT;
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
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected Product productId;
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
	 * The cached value of the '{@link #getFixedAssetProductTypeId() <em>Fixed Asset Product Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetProductTypeId()
	 * @generated
	 * @ordered
	 */
	protected FixedAssetProductType fixedAssetProductTypeId;
	/**
	 * The cached value of the '{@link #getQuantityUomId() <em>Quantity Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom quantityUomId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedAssetProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FixedassetPackage.Literals.FIXED_ASSET_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		comments = newComments;
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
	public BigDecimal getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(BigDecimal newQuantity) {
		quantity = newQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getQuantityUomId() {
		if (quantityUomId != null && ((EObject)quantityUomId).eIsProxy()) {
			InternalEObject oldQuantityUomId = (InternalEObject)quantityUomId;
			quantityUomId = (Uom)eResolveProxy(oldQuantityUomId);
			if (quantityUomId != oldQuantityUomId) {
			}
		}
		return quantityUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetQuantityUomId() {
		return quantityUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityUomId(Uom newQuantityUomId) {
		quantityUomId = newQuantityUomId;
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
	public FixedAsset getFixedAssetId() {
		if (fixedAssetId != null && ((EObject)fixedAssetId).eIsProxy()) {
			InternalEObject oldFixedAssetId = (InternalEObject)fixedAssetId;
			fixedAssetId = (FixedAsset)eResolveProxy(oldFixedAssetId);
			if (fixedAssetId != oldFixedAssetId) {
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
		fixedAssetId = newFixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAssetProductType getFixedAssetProductTypeId() {
		if (fixedAssetProductTypeId != null && ((EObject)fixedAssetProductTypeId).eIsProxy()) {
			InternalEObject oldFixedAssetProductTypeId = (InternalEObject)fixedAssetProductTypeId;
			fixedAssetProductTypeId = (FixedAssetProductType)eResolveProxy(oldFixedAssetProductTypeId);
			if (fixedAssetProductTypeId != oldFixedAssetProductTypeId) {
			}
		}
		return fixedAssetProductTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedAssetProductType basicGetFixedAssetProductTypeId() {
		return fixedAssetProductTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetProductTypeId(FixedAssetProductType newFixedAssetProductTypeId) {
		fixedAssetProductTypeId = newFixedAssetProductTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FixedassetPackage.FIXED_ASSET_PRODUCT__FROM_DATE:
				return getFromDate();
			case FixedassetPackage.FIXED_ASSET_PRODUCT__COMMENTS:
				return getComments();
			case FixedassetPackage.FIXED_ASSET_PRODUCT__QUANTITY:
				return getQuantity();
			case FixedassetPackage.FIXED_ASSET_PRODUCT__SEQUENCE_NUM:
				return getSequenceNum();
			case FixedassetPackage.FIXED_ASSET_PRODUCT__THRU_DATE:
				return getThruDate();
			case FixedassetPackage.FIXED_ASSET_PRODUCT__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case FixedassetPackage.FIXED_ASSET_PRODUCT__FIXED_ASSET_ID:
				if (resolve) return getFixedAssetId();
				return basicGetFixedAssetId();
			case FixedassetPackage.FIXED_ASSET_PRODUCT__FIXED_ASSET_PRODUCT_TYPE_ID:
				if (resolve) return getFixedAssetProductTypeId();
				return basicGetFixedAssetProductTypeId();
			case FixedassetPackage.FIXED_ASSET_PRODUCT__QUANTITY_UOM_ID:
				if (resolve) return getQuantityUomId();
				return basicGetQuantityUomId();
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
			case FixedassetPackage.FIXED_ASSET_PRODUCT__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_PRODUCT__COMMENTS:
				setComments((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_PRODUCT__QUANTITY:
				setQuantity((BigDecimal)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_PRODUCT__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_PRODUCT__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_PRODUCT__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_PRODUCT__FIXED_ASSET_ID:
				setFixedAssetId((FixedAsset)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_PRODUCT__FIXED_ASSET_PRODUCT_TYPE_ID:
				setFixedAssetProductTypeId((FixedAssetProductType)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_PRODUCT__QUANTITY_UOM_ID:
				setQuantityUomId((Uom)newValue);
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
			case FixedassetPackage.FIXED_ASSET_PRODUCT__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_PRODUCT__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_PRODUCT__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_PRODUCT__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_PRODUCT__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_PRODUCT__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case FixedassetPackage.FIXED_ASSET_PRODUCT__FIXED_ASSET_ID:
				setFixedAssetId((FixedAsset)null);
				return;
			case FixedassetPackage.FIXED_ASSET_PRODUCT__FIXED_ASSET_PRODUCT_TYPE_ID:
				setFixedAssetProductTypeId((FixedAssetProductType)null);
				return;
			case FixedassetPackage.FIXED_ASSET_PRODUCT__QUANTITY_UOM_ID:
				setQuantityUomId((Uom)null);
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
			case FixedassetPackage.FIXED_ASSET_PRODUCT__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case FixedassetPackage.FIXED_ASSET_PRODUCT__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case FixedassetPackage.FIXED_ASSET_PRODUCT__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case FixedassetPackage.FIXED_ASSET_PRODUCT__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case FixedassetPackage.FIXED_ASSET_PRODUCT__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case FixedassetPackage.FIXED_ASSET_PRODUCT__PRODUCT_ID:
				return productId != null;
			case FixedassetPackage.FIXED_ASSET_PRODUCT__FIXED_ASSET_ID:
				return fixedAssetId != null;
			case FixedassetPackage.FIXED_ASSET_PRODUCT__FIXED_ASSET_PRODUCT_TYPE_ID:
				return fixedAssetProductTypeId != null;
			case FixedassetPackage.FIXED_ASSET_PRODUCT__QUANTITY_UOM_ID:
				return quantityUomId != null;
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
		result.append(", comments: ");
		result.append(comments);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //FixedAssetProductImpl
