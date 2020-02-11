/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product.impl;

import org.abchip.mimo.biz.product.product.*;
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
public class ProductFactoryImpl extends EFactoryImpl implements ProductFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProductFactory init() {
		try {
			ProductFactory theProductFactory = (ProductFactory)EPackage.Registry.INSTANCE.getEFactory(ProductPackage.eNS_URI);
			if (theProductFactory != null) {
				return theProductFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProductFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFactoryImpl() {
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
			case ProductPackage.GOOD_IDENTIFICATION: return (EObject)createGoodIdentification();
			case ProductPackage.GOOD_IDENTIFICATION_TYPE: return (EObject)createGoodIdentificationType();
			case ProductPackage.PRODUCT: return (EObject)createProduct();
			case ProductPackage.PRODUCT_ASSOC: return (EObject)createProductAssoc();
			case ProductPackage.PRODUCT_ASSOC_TYPE: return (EObject)createProductAssocType();
			case ProductPackage.PRODUCT_ATTRIBUTE: return (EObject)createProductAttribute();
			case ProductPackage.PRODUCT_CALCULATED_INFO: return (EObject)createProductCalculatedInfo();
			case ProductPackage.PRODUCT_CONTENT: return (EObject)createProductContent();
			case ProductPackage.PRODUCT_CONTENT_TYPE: return (EObject)createProductContentType();
			case ProductPackage.PRODUCT_GEO: return (EObject)createProductGeo();
			case ProductPackage.PRODUCT_GL_ACCOUNT: return (EObject)createProductGlAccount();
			case ProductPackage.PRODUCT_GROUP_ORDER: return (EObject)createProductGroupOrder();
			case ProductPackage.PRODUCT_KEYWORD: return (EObject)createProductKeyword();
			case ProductPackage.PRODUCT_MAINT: return (EObject)createProductMaint();
			case ProductPackage.PRODUCT_MAINT_TYPE: return (EObject)createProductMaintType();
			case ProductPackage.PRODUCT_METER: return (EObject)createProductMeter();
			case ProductPackage.PRODUCT_METER_TYPE: return (EObject)createProductMeterType();
			case ProductPackage.PRODUCT_REVIEW: return (EObject)createProductReview();
			case ProductPackage.PRODUCT_ROLE: return (EObject)createProductRole();
			case ProductPackage.PRODUCT_SEARCH_CONSTRAINT: return (EObject)createProductSearchConstraint();
			case ProductPackage.PRODUCT_SEARCH_RESULT: return (EObject)createProductSearchResult();
			case ProductPackage.PRODUCT_TYPE: return (EObject)createProductType();
			case ProductPackage.PRODUCT_TYPE_ATTR: return (EObject)createProductTypeAttr();
			case ProductPackage.VENDOR_PRODUCT: return (EObject)createVendorProduct();
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
	public GoodIdentification createGoodIdentification() {
		GoodIdentificationImpl goodIdentification = new GoodIdentificationImpl();
		return goodIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GoodIdentificationType createGoodIdentificationType() {
		GoodIdentificationTypeImpl goodIdentificationType = new GoodIdentificationTypeImpl();
		return goodIdentificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductAssoc createProductAssoc() {
		ProductAssocImpl productAssoc = new ProductAssocImpl();
		return productAssoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductAssocType createProductAssocType() {
		ProductAssocTypeImpl productAssocType = new ProductAssocTypeImpl();
		return productAssocType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductAttribute createProductAttribute() {
		ProductAttributeImpl productAttribute = new ProductAttributeImpl();
		return productAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCalculatedInfo createProductCalculatedInfo() {
		ProductCalculatedInfoImpl productCalculatedInfo = new ProductCalculatedInfoImpl();
		return productCalculatedInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductContent createProductContent() {
		ProductContentImpl productContent = new ProductContentImpl();
		return productContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductContentType createProductContentType() {
		ProductContentTypeImpl productContentType = new ProductContentTypeImpl();
		return productContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductGeo createProductGeo() {
		ProductGeoImpl productGeo = new ProductGeoImpl();
		return productGeo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductGlAccount createProductGlAccount() {
		ProductGlAccountImpl productGlAccount = new ProductGlAccountImpl();
		return productGlAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductGroupOrder createProductGroupOrder() {
		ProductGroupOrderImpl productGroupOrder = new ProductGroupOrderImpl();
		return productGroupOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductKeyword createProductKeyword() {
		ProductKeywordImpl productKeyword = new ProductKeywordImpl();
		return productKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductMaint createProductMaint() {
		ProductMaintImpl productMaint = new ProductMaintImpl();
		return productMaint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductMaintType createProductMaintType() {
		ProductMaintTypeImpl productMaintType = new ProductMaintTypeImpl();
		return productMaintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductMeter createProductMeter() {
		ProductMeterImpl productMeter = new ProductMeterImpl();
		return productMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductMeterType createProductMeterType() {
		ProductMeterTypeImpl productMeterType = new ProductMeterTypeImpl();
		return productMeterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductReview createProductReview() {
		ProductReviewImpl productReview = new ProductReviewImpl();
		return productReview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductRole createProductRole() {
		ProductRoleImpl productRole = new ProductRoleImpl();
		return productRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductSearchConstraint createProductSearchConstraint() {
		ProductSearchConstraintImpl productSearchConstraint = new ProductSearchConstraintImpl();
		return productSearchConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductSearchResult createProductSearchResult() {
		ProductSearchResultImpl productSearchResult = new ProductSearchResultImpl();
		return productSearchResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductType createProductType() {
		ProductTypeImpl productType = new ProductTypeImpl();
		return productType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductTypeAttr createProductTypeAttr() {
		ProductTypeAttrImpl productTypeAttr = new ProductTypeAttrImpl();
		return productTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VendorProduct createVendorProduct() {
		VendorProductImpl vendorProduct = new VendorProductImpl();
		return vendorProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPackage getProductPackage() {
		return (ProductPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProductPackage getPackage() {
		return ProductPackage.eINSTANCE;
	}

} //ProductFactoryImpl
