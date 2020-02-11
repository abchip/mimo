/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.feature.impl;

import org.abchip.mimo.biz.product.feature.*;
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
public class FeatureFactoryImpl extends EFactoryImpl implements FeatureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FeatureFactory init() {
		try {
			FeatureFactory theFeatureFactory = (FeatureFactory)EPackage.Registry.INSTANCE.getEFactory(FeaturePackage.eNS_URI);
			if (theFeatureFactory != null) {
				return theFeatureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FeatureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureFactoryImpl() {
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
			case FeaturePackage.PRODUCT_FEATURE: return (EObject)createProductFeature();
			case FeaturePackage.PRODUCT_FEATURE_APPL: return (EObject)createProductFeatureAppl();
			case FeaturePackage.PRODUCT_FEATURE_APPL_ATTR: return (EObject)createProductFeatureApplAttr();
			case FeaturePackage.PRODUCT_FEATURE_APPL_TYPE: return (EObject)createProductFeatureApplType();
			case FeaturePackage.PRODUCT_FEATURE_CAT_GRP_APPL: return (EObject)createProductFeatureCatGrpAppl();
			case FeaturePackage.PRODUCT_FEATURE_CATEGORY: return (EObject)createProductFeatureCategory();
			case FeaturePackage.PRODUCT_FEATURE_CATEGORY_APPL: return (EObject)createProductFeatureCategoryAppl();
			case FeaturePackage.PRODUCT_FEATURE_DATA_RESOURCE: return (EObject)createProductFeatureDataResource();
			case FeaturePackage.PRODUCT_FEATURE_GROUP: return (EObject)createProductFeatureGroup();
			case FeaturePackage.PRODUCT_FEATURE_GROUP_APPL: return (EObject)createProductFeatureGroupAppl();
			case FeaturePackage.PRODUCT_FEATURE_IACTN: return (EObject)createProductFeatureIactn();
			case FeaturePackage.PRODUCT_FEATURE_IACTN_TYPE: return (EObject)createProductFeatureIactnType();
			case FeaturePackage.PRODUCT_FEATURE_TYPE: return (EObject)createProductFeatureType();
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
	public ProductFeature createProductFeature() {
		ProductFeatureImpl productFeature = new ProductFeatureImpl();
		return productFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFeatureAppl createProductFeatureAppl() {
		ProductFeatureApplImpl productFeatureAppl = new ProductFeatureApplImpl();
		return productFeatureAppl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFeatureApplAttr createProductFeatureApplAttr() {
		ProductFeatureApplAttrImpl productFeatureApplAttr = new ProductFeatureApplAttrImpl();
		return productFeatureApplAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFeatureApplType createProductFeatureApplType() {
		ProductFeatureApplTypeImpl productFeatureApplType = new ProductFeatureApplTypeImpl();
		return productFeatureApplType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFeatureCatGrpAppl createProductFeatureCatGrpAppl() {
		ProductFeatureCatGrpApplImpl productFeatureCatGrpAppl = new ProductFeatureCatGrpApplImpl();
		return productFeatureCatGrpAppl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFeatureCategory createProductFeatureCategory() {
		ProductFeatureCategoryImpl productFeatureCategory = new ProductFeatureCategoryImpl();
		return productFeatureCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFeatureCategoryAppl createProductFeatureCategoryAppl() {
		ProductFeatureCategoryApplImpl productFeatureCategoryAppl = new ProductFeatureCategoryApplImpl();
		return productFeatureCategoryAppl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFeatureDataResource createProductFeatureDataResource() {
		ProductFeatureDataResourceImpl productFeatureDataResource = new ProductFeatureDataResourceImpl();
		return productFeatureDataResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFeatureGroup createProductFeatureGroup() {
		ProductFeatureGroupImpl productFeatureGroup = new ProductFeatureGroupImpl();
		return productFeatureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFeatureGroupAppl createProductFeatureGroupAppl() {
		ProductFeatureGroupApplImpl productFeatureGroupAppl = new ProductFeatureGroupApplImpl();
		return productFeatureGroupAppl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFeatureIactn createProductFeatureIactn() {
		ProductFeatureIactnImpl productFeatureIactn = new ProductFeatureIactnImpl();
		return productFeatureIactn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFeatureIactnType createProductFeatureIactnType() {
		ProductFeatureIactnTypeImpl productFeatureIactnType = new ProductFeatureIactnTypeImpl();
		return productFeatureIactnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFeatureType createProductFeatureType() {
		ProductFeatureTypeImpl productFeatureType = new ProductFeatureTypeImpl();
		return productFeatureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeaturePackage getFeaturePackage() {
		return (FeaturePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FeaturePackage getPackage() {
		return FeaturePackage.eINSTANCE;
	}

} //FeatureFactoryImpl
