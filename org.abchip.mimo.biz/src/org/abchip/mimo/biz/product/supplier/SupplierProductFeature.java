/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.supplier;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.feature.ProductFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplier Product Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.SupplierProductFeature#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.SupplierProductFeature#getProductFeatureId <em>Product Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.SupplierProductFeature#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.SupplierProductFeature#getIdCode <em>Id Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.SupplierProductFeature#getUomId <em>Uom Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierProductFeature()
 * @model annotation="mimo-ent-frame title='Supplier-specific product feature information' dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface SupplierProductFeature extends BizEntity {
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
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierProductFeature_Description()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.supplier.SupplierProductFeature#getDescription <em>Description</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierProductFeature_IdCode()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getIdCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.supplier.SupplierProductFeature#getIdCode <em>Id Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Code</em>' attribute.
	 * @see #getIdCode()
	 * @generated
	 */
	void setIdCode(String value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' reference.
	 * @see #setPartyId(Party)
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierProductFeature_PartyId()
	 * @model keys="partyId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.supplier.SupplierProductFeature#getPartyId <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' reference.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(Party value);

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
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierProductFeature_UomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.supplier.SupplierProductFeature#getUomId <em>Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom Id</em>' reference.
	 * @see #getUomId()
	 * @generated
	 */
	void setUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Product Feature Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Feature Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature Id</em>' reference.
	 * @see #setProductFeatureId(ProductFeature)
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierProductFeature_ProductFeatureId()
	 * @model keys="productFeatureId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductFeature getProductFeatureId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.supplier.SupplierProductFeature#getProductFeatureId <em>Product Feature Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature Id</em>' reference.
	 * @see #getProductFeatureId()
	 * @generated
	 */
	void setProductFeatureId(ProductFeature value);

} // SupplierProductFeature
