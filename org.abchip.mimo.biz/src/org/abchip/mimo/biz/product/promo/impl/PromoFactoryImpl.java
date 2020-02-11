/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.promo.impl;

import org.abchip.mimo.biz.product.promo.*;
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
public class PromoFactoryImpl extends EFactoryImpl implements PromoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PromoFactory init() {
		try {
			PromoFactory thePromoFactory = (PromoFactory)EPackage.Registry.INSTANCE.getEFactory(PromoPackage.eNS_URI);
			if (thePromoFactory != null) {
				return thePromoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PromoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PromoFactoryImpl() {
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
			case PromoPackage.PRODUCT_PROMO: return (EObject)createProductPromo();
			case PromoPackage.PRODUCT_PROMO_ACTION: return (EObject)createProductPromoAction();
			case PromoPackage.PRODUCT_PROMO_CATEGORY: return (EObject)createProductPromoCategory();
			case PromoPackage.PRODUCT_PROMO_CODE: return (EObject)createProductPromoCode();
			case PromoPackage.PRODUCT_PROMO_CODE_EMAIL: return (EObject)createProductPromoCodeEmail();
			case PromoPackage.PRODUCT_PROMO_CODE_PARTY: return (EObject)createProductPromoCodeParty();
			case PromoPackage.PRODUCT_PROMO_COND: return (EObject)createProductPromoCond();
			case PromoPackage.PRODUCT_PROMO_CONTENT: return (EObject)createProductPromoContent();
			case PromoPackage.PRODUCT_PROMO_PRODUCT: return (EObject)createProductPromoProduct();
			case PromoPackage.PRODUCT_PROMO_RULE: return (EObject)createProductPromoRule();
			case PromoPackage.PRODUCT_PROMO_USE: return (EObject)createProductPromoUse();
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
	public ProductPromo createProductPromo() {
		ProductPromoImpl productPromo = new ProductPromoImpl();
		return productPromo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPromoAction createProductPromoAction() {
		ProductPromoActionImpl productPromoAction = new ProductPromoActionImpl();
		return productPromoAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPromoCategory createProductPromoCategory() {
		ProductPromoCategoryImpl productPromoCategory = new ProductPromoCategoryImpl();
		return productPromoCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPromoCode createProductPromoCode() {
		ProductPromoCodeImpl productPromoCode = new ProductPromoCodeImpl();
		return productPromoCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPromoCodeEmail createProductPromoCodeEmail() {
		ProductPromoCodeEmailImpl productPromoCodeEmail = new ProductPromoCodeEmailImpl();
		return productPromoCodeEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPromoCodeParty createProductPromoCodeParty() {
		ProductPromoCodePartyImpl productPromoCodeParty = new ProductPromoCodePartyImpl();
		return productPromoCodeParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPromoCond createProductPromoCond() {
		ProductPromoCondImpl productPromoCond = new ProductPromoCondImpl();
		return productPromoCond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPromoContent createProductPromoContent() {
		ProductPromoContentImpl productPromoContent = new ProductPromoContentImpl();
		return productPromoContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPromoProduct createProductPromoProduct() {
		ProductPromoProductImpl productPromoProduct = new ProductPromoProductImpl();
		return productPromoProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPromoRule createProductPromoRule() {
		ProductPromoRuleImpl productPromoRule = new ProductPromoRuleImpl();
		return productPromoRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPromoUse createProductPromoUse() {
		ProductPromoUseImpl productPromoUse = new ProductPromoUseImpl();
		return productPromoUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PromoPackage getPromoPackage() {
		return (PromoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PromoPackage getPackage() {
		return PromoPackage.eINSTANCE;
	}

} //PromoFactoryImpl
