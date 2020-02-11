/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.supplier.impl;

import org.abchip.mimo.biz.product.supplier.*;
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
public class SupplierFactoryImpl extends EFactoryImpl implements SupplierFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SupplierFactory init() {
		try {
			SupplierFactory theSupplierFactory = (SupplierFactory)EPackage.Registry.INSTANCE.getEFactory(SupplierPackage.eNS_URI);
			if (theSupplierFactory != null) {
				return theSupplierFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SupplierFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplierFactoryImpl() {
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
			case SupplierPackage.MARKET_INTEREST: return (EObject)createMarketInterest();
			case SupplierPackage.REORDER_GUIDELINE: return (EObject)createReorderGuideline();
			case SupplierPackage.SUPPLIER_PREF_ORDER: return (EObject)createSupplierPrefOrder();
			case SupplierPackage.SUPPLIER_PRODUCT: return (EObject)createSupplierProduct();
			case SupplierPackage.SUPPLIER_PRODUCT_FEATURE: return (EObject)createSupplierProductFeature();
			case SupplierPackage.SUPPLIER_RATING_TYPE: return (EObject)createSupplierRatingType();
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
	public MarketInterest createMarketInterest() {
		MarketInterestImpl marketInterest = new MarketInterestImpl();
		return marketInterest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReorderGuideline createReorderGuideline() {
		ReorderGuidelineImpl reorderGuideline = new ReorderGuidelineImpl();
		return reorderGuideline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplierPrefOrder createSupplierPrefOrder() {
		SupplierPrefOrderImpl supplierPrefOrder = new SupplierPrefOrderImpl();
		return supplierPrefOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplierProduct createSupplierProduct() {
		SupplierProductImpl supplierProduct = new SupplierProductImpl();
		return supplierProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplierProductFeature createSupplierProductFeature() {
		SupplierProductFeatureImpl supplierProductFeature = new SupplierProductFeatureImpl();
		return supplierProductFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplierRatingType createSupplierRatingType() {
		SupplierRatingTypeImpl supplierRatingType = new SupplierRatingTypeImpl();
		return supplierRatingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplierPackage getSupplierPackage() {
		return (SupplierPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SupplierPackage getPackage() {
		return SupplierPackage.eINSTANCE;
	}

} //SupplierFactoryImpl
