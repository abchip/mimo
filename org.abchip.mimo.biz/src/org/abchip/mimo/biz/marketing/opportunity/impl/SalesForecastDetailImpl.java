/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.opportunity.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage;
import org.abchip.mimo.biz.marketing.opportunity.SalesForecast;
import org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail;
import org.abchip.mimo.biz.product.category.ProductCategory;
import org.abchip.mimo.biz.product.product.Product;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sales Forecast Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastDetailImpl#getSalesForecastDetailId <em>Sales Forecast Detail Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastDetailImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastDetailImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastDetailImpl#getSalesForecastId <em>Sales Forecast Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastDetailImpl#getQuantityUomId <em>Quantity Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastDetailImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastDetailImpl#getProductCategoryId <em>Product Category Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SalesForecastDetailImpl extends BizEntityImpl implements SalesForecastDetail {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getSalesForecastDetailId() <em>Sales Forecast Detail Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesForecastDetailId()
	 * @generated
	 * @ordered
	 */
	protected static final String SALES_FORECAST_DETAIL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSalesForecastDetailId() <em>Sales Forecast Detail Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesForecastDetailId()
	 * @generated
	 * @ordered
	 */
	protected String salesForecastDetailId = SALES_FORECAST_DETAIL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal amount = AMOUNT_EDEFAULT;

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
	 * The cached value of the '{@link #getSalesForecastId() <em>Sales Forecast Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesForecastId()
	 * @generated
	 * @ordered
	 */
	protected SalesForecast salesForecastId;

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
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected Product productId;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalesForecastDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpportunityPackage.Literals.SALES_FORECAST_DETAIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(BigDecimal newAmount) {
		amount = newAmount;
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
	public String getSalesForecastDetailId() {
		return salesForecastDetailId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesForecastDetailId(String newSalesForecastDetailId) {
		salesForecastDetailId = newSalesForecastDetailId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SalesForecast getSalesForecastId() {
		if (salesForecastId != null && ((EObject)salesForecastId).eIsProxy()) {
			InternalEObject oldSalesForecastId = (InternalEObject)salesForecastId;
			salesForecastId = (SalesForecast)eResolveProxy(oldSalesForecastId);
			if (salesForecastId != oldSalesForecastId) {
			}
		}
		return salesForecastId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalesForecast basicGetSalesForecastId() {
		return salesForecastId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesForecastId(SalesForecast newSalesForecastId) {
		salesForecastId = newSalesForecastId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpportunityPackage.SALES_FORECAST_DETAIL__SALES_FORECAST_DETAIL_ID:
				return getSalesForecastDetailId();
			case OpportunityPackage.SALES_FORECAST_DETAIL__AMOUNT:
				return getAmount();
			case OpportunityPackage.SALES_FORECAST_DETAIL__QUANTITY:
				return getQuantity();
			case OpportunityPackage.SALES_FORECAST_DETAIL__SALES_FORECAST_ID:
				if (resolve) return getSalesForecastId();
				return basicGetSalesForecastId();
			case OpportunityPackage.SALES_FORECAST_DETAIL__QUANTITY_UOM_ID:
				if (resolve) return getQuantityUomId();
				return basicGetQuantityUomId();
			case OpportunityPackage.SALES_FORECAST_DETAIL__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case OpportunityPackage.SALES_FORECAST_DETAIL__PRODUCT_CATEGORY_ID:
				if (resolve) return getProductCategoryId();
				return basicGetProductCategoryId();
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
			case OpportunityPackage.SALES_FORECAST_DETAIL__SALES_FORECAST_DETAIL_ID:
				setSalesForecastDetailId((String)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST_DETAIL__AMOUNT:
				setAmount((BigDecimal)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST_DETAIL__QUANTITY:
				setQuantity((BigDecimal)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST_DETAIL__SALES_FORECAST_ID:
				setSalesForecastId((SalesForecast)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST_DETAIL__QUANTITY_UOM_ID:
				setQuantityUomId((Uom)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST_DETAIL__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST_DETAIL__PRODUCT_CATEGORY_ID:
				setProductCategoryId((ProductCategory)newValue);
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
			case OpportunityPackage.SALES_FORECAST_DETAIL__SALES_FORECAST_DETAIL_ID:
				setSalesForecastDetailId(SALES_FORECAST_DETAIL_ID_EDEFAULT);
				return;
			case OpportunityPackage.SALES_FORECAST_DETAIL__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case OpportunityPackage.SALES_FORECAST_DETAIL__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case OpportunityPackage.SALES_FORECAST_DETAIL__SALES_FORECAST_ID:
				setSalesForecastId((SalesForecast)null);
				return;
			case OpportunityPackage.SALES_FORECAST_DETAIL__QUANTITY_UOM_ID:
				setQuantityUomId((Uom)null);
				return;
			case OpportunityPackage.SALES_FORECAST_DETAIL__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case OpportunityPackage.SALES_FORECAST_DETAIL__PRODUCT_CATEGORY_ID:
				setProductCategoryId((ProductCategory)null);
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
			case OpportunityPackage.SALES_FORECAST_DETAIL__SALES_FORECAST_DETAIL_ID:
				return SALES_FORECAST_DETAIL_ID_EDEFAULT == null ? salesForecastDetailId != null : !SALES_FORECAST_DETAIL_ID_EDEFAULT.equals(salesForecastDetailId);
			case OpportunityPackage.SALES_FORECAST_DETAIL__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case OpportunityPackage.SALES_FORECAST_DETAIL__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case OpportunityPackage.SALES_FORECAST_DETAIL__SALES_FORECAST_ID:
				return salesForecastId != null;
			case OpportunityPackage.SALES_FORECAST_DETAIL__QUANTITY_UOM_ID:
				return quantityUomId != null;
			case OpportunityPackage.SALES_FORECAST_DETAIL__PRODUCT_ID:
				return productId != null;
			case OpportunityPackage.SALES_FORECAST_DETAIL__PRODUCT_CATEGORY_ID:
				return productCategoryId != null;
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
		result.append(" (salesForecastDetailId: ");
		result.append(salesForecastDetailId);
		result.append(", amount: ");
		result.append(amount);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(')');
		return result.toString();
	}

} //SalesForecastDetailImpl
