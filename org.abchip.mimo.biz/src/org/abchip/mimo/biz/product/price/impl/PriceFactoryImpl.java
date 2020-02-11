/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.price.impl;

import org.abchip.mimo.biz.product.price.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PriceFactoryImpl extends EFactoryImpl implements PriceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PriceFactory init() {
		try {
			PriceFactory thePriceFactory = (PriceFactory)EPackage.Registry.INSTANCE.getEFactory(PricePackage.eNS_URI);
			if (thePriceFactory != null) {
				return thePriceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PriceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PricePackage.PRODUCT_FEATURE_PRICE: return (EObject)createProductFeaturePrice();
			case PricePackage.PRODUCT_PAYMENT_METHOD_TYPE: return (EObject)createProductPaymentMethodType();
			case PricePackage.PRODUCT_PRICE: return (EObject)createProductPrice();
			case PricePackage.PRODUCT_PRICE_ACTION: return (EObject)createProductPriceAction();
			case PricePackage.PRODUCT_PRICE_ACTION_TYPE: return (EObject)createProductPriceActionType();
			case PricePackage.PRODUCT_PRICE_AUTO_NOTICE: return (EObject)createProductPriceAutoNotice();
			case PricePackage.PRODUCT_PRICE_CHANGE: return (EObject)createProductPriceChange();
			case PricePackage.PRODUCT_PRICE_COND: return (EObject)createProductPriceCond();
			case PricePackage.PRODUCT_PRICE_PURPOSE: return (EObject)createProductPricePurpose();
			case PricePackage.PRODUCT_PRICE_RULE: return (EObject)createProductPriceRule();
			case PricePackage.PRODUCT_PRICE_TYPE: return (EObject)createProductPriceType();
			case PricePackage.QUANTITY_BREAK: return (EObject)createQuantityBreak();
			case PricePackage.QUANTITY_BREAK_TYPE: return (EObject)createQuantityBreakType();
			case PricePackage.SALE_TYPE: return (EObject)createSaleType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFeaturePrice createProductFeaturePrice() {
		ProductFeaturePriceImpl productFeaturePrice = new ProductFeaturePriceImpl();
		return productFeaturePrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPaymentMethodType createProductPaymentMethodType() {
		ProductPaymentMethodTypeImpl productPaymentMethodType = new ProductPaymentMethodTypeImpl();
		return productPaymentMethodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPrice createProductPrice() {
		ProductPriceImpl productPrice = new ProductPriceImpl();
		return productPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPriceAction createProductPriceAction() {
		ProductPriceActionImpl productPriceAction = new ProductPriceActionImpl();
		return productPriceAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPriceActionType createProductPriceActionType() {
		ProductPriceActionTypeImpl productPriceActionType = new ProductPriceActionTypeImpl();
		return productPriceActionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPriceAutoNotice createProductPriceAutoNotice() {
		ProductPriceAutoNoticeImpl productPriceAutoNotice = new ProductPriceAutoNoticeImpl();
		return productPriceAutoNotice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPriceChange createProductPriceChange() {
		ProductPriceChangeImpl productPriceChange = new ProductPriceChangeImpl();
		return productPriceChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPriceCond createProductPriceCond() {
		ProductPriceCondImpl productPriceCond = new ProductPriceCondImpl();
		return productPriceCond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPricePurpose createProductPricePurpose() {
		ProductPricePurposeImpl productPricePurpose = new ProductPricePurposeImpl();
		return productPricePurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPriceRule createProductPriceRule() {
		ProductPriceRuleImpl productPriceRule = new ProductPriceRuleImpl();
		return productPriceRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPriceType createProductPriceType() {
		ProductPriceTypeImpl productPriceType = new ProductPriceTypeImpl();
		return productPriceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantityBreak createQuantityBreak() {
		QuantityBreakImpl quantityBreak = new QuantityBreakImpl();
		return quantityBreak;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantityBreakType createQuantityBreakType() {
		QuantityBreakTypeImpl quantityBreakType = new QuantityBreakTypeImpl();
		return quantityBreakType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SaleType createSaleType() {
		SaleTypeImpl saleType = new SaleTypeImpl();
		return saleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PricePackage getPricePackage() {
		return (PricePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PricePackage getPackage() {
		return PricePackage.eINSTANCE;
	}

} //PriceFactoryImpl
