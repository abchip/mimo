/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.feature;

import java.math.BigDecimal;
import java.util.List;
import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.biz.common.uom.Uom;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.feature.ProductFeature#getProductFeatureId <em>Product Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.ProductFeature#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.ProductFeature#getDefaultAmount <em>Default Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.ProductFeature#getDefaultSequenceNum <em>Default Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.ProductFeature#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.ProductFeature#getIdCode <em>Id Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.ProductFeature#getMainProductFeatureIactns <em>Main Product Feature Iactns</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.ProductFeature#getNumberSpecified <em>Number Specified</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.ProductFeature#getProductFeatureCategoryId <em>Product Feature Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.ProductFeature#getProductFeatureTypeId <em>Product Feature Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.ProductFeature#getUomId <em>Uom Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeature()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface ProductFeature extends BizEntityTyped<ProductFeatureType> {
	/**
	 * Returns the value of the '<em><b>Abbrev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abbrev</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbrev</em>' attribute.
	 * @see #setAbbrev(String)
	 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeature_Abbrev()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getAbbrev();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.feature.ProductFeature#getAbbrev <em>Abbrev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abbrev</em>' attribute.
	 * @see #getAbbrev()
	 * @generated
	 */
	void setAbbrev(String value);

	/**
	 * Returns the value of the '<em><b>Default Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Amount</em>' attribute.
	 * @see #setDefaultAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeature_DefaultAmount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getDefaultAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.feature.ProductFeature#getDefaultAmount <em>Default Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Amount</em>' attribute.
	 * @see #getDefaultAmount()
	 * @generated
	 */
	void setDefaultAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Default Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Sequence Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Sequence Num</em>' attribute.
	 * @see #setDefaultSequenceNum(long)
	 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeature_DefaultSequenceNum()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getDefaultSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.feature.ProductFeature#getDefaultSequenceNum <em>Default Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Sequence Num</em>' attribute.
	 * @see #getDefaultSequenceNum()
	 * @generated
	 */
	void setDefaultSequenceNum(long value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeature_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.feature.ProductFeature#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Id Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Code</em>' attribute.
	 * @see #setIdCode(String)
	 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeature_IdCode()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getIdCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.feature.ProductFeature#getIdCode <em>Id Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Code</em>' attribute.
	 * @see #getIdCode()
	 * @generated
	 */
	void setIdCode(String value);

	/**
	 * Returns the value of the '<em><b>Main Product Feature Iactns</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.product.feature.ProductFeatureIactn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Product Feature Iactns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Product Feature Iactns</em>' reference list.
	 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeature_MainProductFeatureIactns()
	 * @model derived="true"
	 * @generated
	 */
	List<ProductFeatureIactn> getMainProductFeatureIactns();

	/**
	 * Returns the value of the '<em><b>Number Specified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Specified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Specified</em>' attribute.
	 * @see #setNumberSpecified(BigDecimal)
	 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeature_NumberSpecified()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getNumberSpecified();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.feature.ProductFeature#getNumberSpecified <em>Number Specified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Specified</em>' attribute.
	 * @see #getNumberSpecified()
	 * @generated
	 */
	void setNumberSpecified(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom Id</em>' reference.
	 * @see #setUomId(Uom)
	 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeature_UomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.feature.ProductFeature#getUomId <em>Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom Id</em>' reference.
	 * @see #getUomId()
	 * @generated
	 */
	void setUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Product Feature Category Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Feature Category Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature Category Id</em>' reference.
	 * @see #setProductFeatureCategoryId(ProductFeatureCategory)
	 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeature_ProductFeatureCategoryId()
	 * @model keys="productFeatureCategoryId"
	 * @generated
	 */
	ProductFeatureCategory getProductFeatureCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.feature.ProductFeature#getProductFeatureCategoryId <em>Product Feature Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature Category Id</em>' reference.
	 * @see #getProductFeatureCategoryId()
	 * @generated
	 */
	void setProductFeatureCategoryId(ProductFeatureCategory value);

	/**
	 * Returns the value of the '<em><b>Product Feature Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Feature Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature Type Id</em>' reference.
	 * @see #setProductFeatureTypeId(ProductFeatureType)
	 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeature_ProductFeatureTypeId()
	 * @model keys="productFeatureTypeId"
	 * @generated
	 */
	ProductFeatureType getProductFeatureTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.feature.ProductFeature#getProductFeatureTypeId <em>Product Feature Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature Type Id</em>' reference.
	 * @see #getProductFeatureTypeId()
	 * @generated
	 */
	void setProductFeatureTypeId(ProductFeatureType value);

	/**
	 * Returns the value of the '<em><b>Product Feature Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Feature Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature Id</em>' attribute.
	 * @see #setProductFeatureId(String)
	 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeature_ProductFeatureId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductFeatureId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.feature.ProductFeature#getProductFeatureId <em>Product Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature Id</em>' attribute.
	 * @see #getProductFeatureId()
	 * @generated
	 */
	void setProductFeatureId(String value);

} // ProductFeature
