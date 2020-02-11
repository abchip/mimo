/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.category.impl;

import org.abchip.mimo.biz.product.category.*;
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
public class CategoryFactoryImpl extends EFactoryImpl implements CategoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CategoryFactory init() {
		try {
			CategoryFactory theCategoryFactory = (CategoryFactory)EPackage.Registry.INSTANCE.getEFactory(CategoryPackage.eNS_URI);
			if (theCategoryFactory != null) {
				return theCategoryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CategoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryFactoryImpl() {
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
			case CategoryPackage.PRODUCT_CATEGORY: return (EObject)createProductCategory();
			case CategoryPackage.PRODUCT_CATEGORY_ATTRIBUTE: return (EObject)createProductCategoryAttribute();
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT: return (EObject)createProductCategoryContent();
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT_TYPE: return (EObject)createProductCategoryContentType();
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT: return (EObject)createProductCategoryGlAccount();
			case CategoryPackage.PRODUCT_CATEGORY_LINK: return (EObject)createProductCategoryLink();
			case CategoryPackage.PRODUCT_CATEGORY_MEMBER: return (EObject)createProductCategoryMember();
			case CategoryPackage.PRODUCT_CATEGORY_ROLE: return (EObject)createProductCategoryRole();
			case CategoryPackage.PRODUCT_CATEGORY_ROLLUP: return (EObject)createProductCategoryRollup();
			case CategoryPackage.PRODUCT_CATEGORY_TYPE: return (EObject)createProductCategoryType();
			case CategoryPackage.PRODUCT_CATEGORY_TYPE_ATTR: return (EObject)createProductCategoryTypeAttr();
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
	public ProductCategory createProductCategory() {
		ProductCategoryImpl productCategory = new ProductCategoryImpl();
		return productCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategoryAttribute createProductCategoryAttribute() {
		ProductCategoryAttributeImpl productCategoryAttribute = new ProductCategoryAttributeImpl();
		return productCategoryAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategoryContent createProductCategoryContent() {
		ProductCategoryContentImpl productCategoryContent = new ProductCategoryContentImpl();
		return productCategoryContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategoryContentType createProductCategoryContentType() {
		ProductCategoryContentTypeImpl productCategoryContentType = new ProductCategoryContentTypeImpl();
		return productCategoryContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategoryGlAccount createProductCategoryGlAccount() {
		ProductCategoryGlAccountImpl productCategoryGlAccount = new ProductCategoryGlAccountImpl();
		return productCategoryGlAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategoryLink createProductCategoryLink() {
		ProductCategoryLinkImpl productCategoryLink = new ProductCategoryLinkImpl();
		return productCategoryLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategoryMember createProductCategoryMember() {
		ProductCategoryMemberImpl productCategoryMember = new ProductCategoryMemberImpl();
		return productCategoryMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategoryRole createProductCategoryRole() {
		ProductCategoryRoleImpl productCategoryRole = new ProductCategoryRoleImpl();
		return productCategoryRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategoryRollup createProductCategoryRollup() {
		ProductCategoryRollupImpl productCategoryRollup = new ProductCategoryRollupImpl();
		return productCategoryRollup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategoryType createProductCategoryType() {
		ProductCategoryTypeImpl productCategoryType = new ProductCategoryTypeImpl();
		return productCategoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategoryTypeAttr createProductCategoryTypeAttr() {
		ProductCategoryTypeAttrImpl productCategoryTypeAttr = new ProductCategoryTypeAttrImpl();
		return productCategoryTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CategoryPackage getCategoryPackage() {
		return (CategoryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CategoryPackage getPackage() {
		return CategoryPackage.eINSTANCE;
	}

} //CategoryFactoryImpl
