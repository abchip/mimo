/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product;

import java.util.List;

import org.abchip.mimo.biz.BizEntityType;
import org.abchip.mimo.biz.common.uom.Uom;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Meter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductMeterType#getProductMeterTypeId <em>Product Meter Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductMeterType#getDefaultUomId <em>Default Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductMeterType#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductMeterType()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface ProductMeterType extends BizEntityType<ProductMeter> {
	/**
	 * Returns the value of the '<em><b>Default Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Uom Id</em>' reference.
	 * @see #setDefaultUomId(Uom)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductMeterType_DefaultUomId()
	 * @model keys="uomId"
	 *        annotation="mimo-ent-slot help='This is optional and if applicable can describe the meter better'"
	 * @generated
	 */
	Uom getDefaultUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductMeterType#getDefaultUomId <em>Default Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Uom Id</em>' reference.
	 * @see #getDefaultUomId()
	 * @generated
	 */
	void setDefaultUomId(Uom value);

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
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductMeterType_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductMeterType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FixedAssetMaint' route='intervalMeterTypeId'"
	 * @generated
	 */
	List<String> intervalFixedAssetMaints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductMaint' route='intervalMeterTypeId'"
	 * @generated
	 */
	List<String> intervalProductMaints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductMeter' route='productMeterTypeId'"
	 * @generated
	 */
	List<String> productMeters();

	/**
	 * Returns the value of the '<em><b>Product Meter Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Meter Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Meter Type Id</em>' attribute.
	 * @see #setProductMeterTypeId(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductMeterType_ProductMeterTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 * @generated
	 */
	String getProductMeterTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductMeterType#getProductMeterTypeId <em>Product Meter Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Meter Type Id</em>' attribute.
	 * @see #getProductMeterTypeId()
	 * @generated
	 */
	void setProductMeterTypeId(String value);

} // ProductMeterType
