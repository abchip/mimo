/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.feature;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.product.feature.FeaturePackage
 * @generated
 */
public interface FeatureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeatureFactory eINSTANCE = org.abchip.mimo.biz.product.feature.impl.FeatureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Product Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Feature</em>'.
	 * @generated
	 */
	ProductFeature createProductFeature();

	/**
	 * Returns a new object of class '<em>Product Feature Appl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Feature Appl</em>'.
	 * @generated
	 */
	ProductFeatureAppl createProductFeatureAppl();

	/**
	 * Returns a new object of class '<em>Product Feature Appl Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Feature Appl Attr</em>'.
	 * @generated
	 */
	ProductFeatureApplAttr createProductFeatureApplAttr();

	/**
	 * Returns a new object of class '<em>Product Feature Appl Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Feature Appl Type</em>'.
	 * @generated
	 */
	ProductFeatureApplType createProductFeatureApplType();

	/**
	 * Returns a new object of class '<em>Product Feature Cat Grp Appl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Feature Cat Grp Appl</em>'.
	 * @generated
	 */
	ProductFeatureCatGrpAppl createProductFeatureCatGrpAppl();

	/**
	 * Returns a new object of class '<em>Product Feature Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Feature Category</em>'.
	 * @generated
	 */
	ProductFeatureCategory createProductFeatureCategory();

	/**
	 * Returns a new object of class '<em>Product Feature Category Appl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Feature Category Appl</em>'.
	 * @generated
	 */
	ProductFeatureCategoryAppl createProductFeatureCategoryAppl();

	/**
	 * Returns a new object of class '<em>Product Feature Data Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Feature Data Resource</em>'.
	 * @generated
	 */
	ProductFeatureDataResource createProductFeatureDataResource();

	/**
	 * Returns a new object of class '<em>Product Feature Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Feature Group</em>'.
	 * @generated
	 */
	ProductFeatureGroup createProductFeatureGroup();

	/**
	 * Returns a new object of class '<em>Product Feature Group Appl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Feature Group Appl</em>'.
	 * @generated
	 */
	ProductFeatureGroupAppl createProductFeatureGroupAppl();

	/**
	 * Returns a new object of class '<em>Product Feature Iactn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Feature Iactn</em>'.
	 * @generated
	 */
	ProductFeatureIactn createProductFeatureIactn();

	/**
	 * Returns a new object of class '<em>Product Feature Iactn Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Feature Iactn Type</em>'.
	 * @generated
	 */
	ProductFeatureIactnType createProductFeatureIactnType();

	/**
	 * Returns a new object of class '<em>Product Feature Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Feature Type</em>'.
	 * @generated
	 */
	ProductFeatureType createProductFeatureType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FeaturePackage getFeaturePackage();

} //FeatureFactory
