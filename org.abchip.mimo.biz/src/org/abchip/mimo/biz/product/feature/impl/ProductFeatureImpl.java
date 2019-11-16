/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.feature.impl;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.List;

import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.product.feature.FeaturePackage;
import org.abchip.mimo.biz.product.feature.ProductFeature;
import org.abchip.mimo.biz.product.feature.ProductFeatureCategory;
import org.abchip.mimo.biz.product.feature.ProductFeatureType;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureImpl#getProductFeatureId <em>Product Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureImpl#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureImpl#getDefaultAmount <em>Default Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureImpl#getDefaultSequenceNum <em>Default Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureImpl#getIdCode <em>Id Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureImpl#getNumberSpecified <em>Number Specified</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureImpl#getProductFeatureCategoryId <em>Product Feature Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureImpl#getProductFeatureTypeId <em>Product Feature Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureImpl#getUomId <em>Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureImpl#getMainProductFeatureIactns <em>Main Product Feature Iactns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductFeatureImpl extends BizEntityTypedImpl<ProductFeatureType> implements ProductFeature {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturePackage.Literals.PRODUCT_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAbbrev() {
		return (String)eGet(FeaturePackage.Literals.PRODUCT_FEATURE__ABBREV, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbbrev(String newAbbrev) {
		eSet(FeaturePackage.Literals.PRODUCT_FEATURE__ABBREV, newAbbrev);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getDefaultAmount() {
		return (BigDecimal)eGet(FeaturePackage.Literals.PRODUCT_FEATURE__DEFAULT_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultAmount(BigDecimal newDefaultAmount) {
		eSet(FeaturePackage.Literals.PRODUCT_FEATURE__DEFAULT_AMOUNT, newDefaultAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDefaultSequenceNum() {
		return (Long)eGet(FeaturePackage.Literals.PRODUCT_FEATURE__DEFAULT_SEQUENCE_NUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultSequenceNum(long newDefaultSequenceNum) {
		eSet(FeaturePackage.Literals.PRODUCT_FEATURE__DEFAULT_SEQUENCE_NUM, newDefaultSequenceNum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(FeaturePackage.Literals.PRODUCT_FEATURE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(FeaturePackage.Literals.PRODUCT_FEATURE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdCode() {
		return (String)eGet(FeaturePackage.Literals.PRODUCT_FEATURE__ID_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdCode(String newIdCode) {
		eSet(FeaturePackage.Literals.PRODUCT_FEATURE__ID_CODE, newIdCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getNumberSpecified() {
		return (BigDecimal)eGet(FeaturePackage.Literals.PRODUCT_FEATURE__NUMBER_SPECIFIED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberSpecified(BigDecimal newNumberSpecified) {
		eSet(FeaturePackage.Literals.PRODUCT_FEATURE__NUMBER_SPECIFIED, newNumberSpecified);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getUomId() {
		return (Uom)eGet(FeaturePackage.Literals.PRODUCT_FEATURE__UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUomId(Uom newUomId) {
		eSet(FeaturePackage.Literals.PRODUCT_FEATURE__UOM_ID, newUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getMainProductFeatureIactns() {
		return (List<String>)eGet(FeaturePackage.Literals.PRODUCT_FEATURE__MAIN_PRODUCT_FEATURE_IACTNS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> assocProductFeatureIactns() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> costComponents() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> desiredFeatures() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> invoiceItems() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> productFeatureDataResources() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> productManufacturingRules() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> quoteItems() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> supplierProductFeatures() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FeaturePackage.PRODUCT_FEATURE___ASSOC_PRODUCT_FEATURE_IACTNS:
				return assocProductFeatureIactns();
			case FeaturePackage.PRODUCT_FEATURE___COST_COMPONENTS:
				return costComponents();
			case FeaturePackage.PRODUCT_FEATURE___DESIRED_FEATURES:
				return desiredFeatures();
			case FeaturePackage.PRODUCT_FEATURE___INVOICE_ITEMS:
				return invoiceItems();
			case FeaturePackage.PRODUCT_FEATURE___PRODUCT_FEATURE_DATA_RESOURCES:
				return productFeatureDataResources();
			case FeaturePackage.PRODUCT_FEATURE___PRODUCT_MANUFACTURING_RULES:
				return productManufacturingRules();
			case FeaturePackage.PRODUCT_FEATURE___QUOTE_ITEMS:
				return quoteItems();
			case FeaturePackage.PRODUCT_FEATURE___SUPPLIER_PRODUCT_FEATURES:
				return supplierProductFeatures();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFeatureCategory getProductFeatureCategoryId() {
		return (ProductFeatureCategory)eGet(FeaturePackage.Literals.PRODUCT_FEATURE__PRODUCT_FEATURE_CATEGORY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureCategoryId(ProductFeatureCategory newProductFeatureCategoryId) {
		eSet(FeaturePackage.Literals.PRODUCT_FEATURE__PRODUCT_FEATURE_CATEGORY_ID, newProductFeatureCategoryId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFeatureType getProductFeatureTypeId() {
		return (ProductFeatureType)eGet(FeaturePackage.Literals.PRODUCT_FEATURE__PRODUCT_FEATURE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureTypeId(ProductFeatureType newProductFeatureTypeId) {
		eSet(FeaturePackage.Literals.PRODUCT_FEATURE__PRODUCT_FEATURE_TYPE_ID, newProductFeatureTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductFeatureId() {
		return (String)eGet(FeaturePackage.Literals.PRODUCT_FEATURE__PRODUCT_FEATURE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureId(String newProductFeatureId) {
		eSet(FeaturePackage.Literals.PRODUCT_FEATURE__PRODUCT_FEATURE_ID, newProductFeatureId);
	}

} //ProductFeatureImpl
