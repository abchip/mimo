/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.invoice;

import java.math.BigDecimal;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoice Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getInvoiceId <em>Invoice Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getInvoiceItemTypeId <em>Invoice Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getOverrideGlAccountId <em>Override Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getOverrideOrgPartyId <em>Override Org Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getParentInvoiceId <em>Parent Invoice Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getParentInvoiceItemSeqId <em>Parent Invoice Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getProductFeatureId <em>Product Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getSalesOpportunityId <em>Sales Opportunity Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getTaxAuthPartyId <em>Tax Auth Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getTaxAuthorityRateSeqId <em>Tax Authority Rate Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#isTaxableFlag <em>Taxable Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getUomId <em>Uom Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItem()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface InvoiceItem extends BizEntityTyped<InvoiceItemType> {
	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItem_Amount()
	 * @model
	 * @generated
	 */
	BigDecimal getAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItem_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Inventory Item Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Item Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Id</em>' attribute.
	 * @see #setInventoryItemId(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItem_InventoryItemId()
	 * @model annotation="mimo-ent-domain frame='InventoryItem'"
	 * @generated
	 */
	String getInventoryItemId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getInventoryItemId <em>Inventory Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item Id</em>' attribute.
	 * @see #getInventoryItemId()
	 * @generated
	 */
	void setInventoryItemId(String value);

	/**
	 * Returns the value of the '<em><b>Invoice Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Item Seq Id</em>' attribute.
	 * @see #setInvoiceItemSeqId(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItem_InvoiceItemSeqId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getInvoiceItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Item Seq Id</em>' attribute.
	 * @see #getInvoiceItemSeqId()
	 * @generated
	 */
	void setInvoiceItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Override Gl Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Override Gl Account Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override Gl Account Id</em>' attribute.
	 * @see #setOverrideGlAccountId(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItem_OverrideGlAccountId()
	 * @model annotation="mimo-ent-domain frame='GlAccount'"
	 * @generated
	 */
	String getOverrideGlAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getOverrideGlAccountId <em>Override Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override Gl Account Id</em>' attribute.
	 * @see #getOverrideGlAccountId()
	 * @generated
	 */
	void setOverrideGlAccountId(String value);

	/**
	 * Returns the value of the '<em><b>Override Org Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Override Org Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override Org Party Id</em>' attribute.
	 * @see #setOverrideOrgPartyId(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItem_OverrideOrgPartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getOverrideOrgPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getOverrideOrgPartyId <em>Override Org Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override Org Party Id</em>' attribute.
	 * @see #getOverrideOrgPartyId()
	 * @generated
	 */
	void setOverrideOrgPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Parent Invoice Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Invoice Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Invoice Id</em>' attribute.
	 * @see #setParentInvoiceId(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItem_ParentInvoiceId()
	 * @model
	 * @generated
	 */
	String getParentInvoiceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getParentInvoiceId <em>Parent Invoice Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Invoice Id</em>' attribute.
	 * @see #getParentInvoiceId()
	 * @generated
	 */
	void setParentInvoiceId(String value);

	/**
	 * Returns the value of the '<em><b>Parent Invoice Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Invoice Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Invoice Item Seq Id</em>' attribute.
	 * @see #setParentInvoiceItemSeqId(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItem_ParentInvoiceItemSeqId()
	 * @model
	 * @generated
	 */
	String getParentInvoiceItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getParentInvoiceItemSeqId <em>Parent Invoice Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Invoice Item Seq Id</em>' attribute.
	 * @see #getParentInvoiceItemSeqId()
	 * @generated
	 */
	void setParentInvoiceItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Product Feature Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Feature Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature Id</em>' attribute.
	 * @see #setProductFeatureId(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItem_ProductFeatureId()
	 * @model annotation="mimo-ent-domain frame='ProductFeature'"
	 * @generated
	 */
	String getProductFeatureId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getProductFeatureId <em>Product Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature Id</em>' attribute.
	 * @see #getProductFeatureId()
	 * @generated
	 */
	void setProductFeatureId(String value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' attribute.
	 * @see #setProductId(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItem_ProductId()
	 * @model annotation="mimo-ent-domain frame='Product'"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItem_Quantity()
	 * @model
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Sales Opportunity Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Opportunity Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Opportunity Id</em>' attribute.
	 * @see #setSalesOpportunityId(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItem_SalesOpportunityId()
	 * @model annotation="mimo-ent-domain frame='SalesOpportunity'"
	 * @generated
	 */
	String getSalesOpportunityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getSalesOpportunityId <em>Sales Opportunity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Opportunity Id</em>' attribute.
	 * @see #getSalesOpportunityId()
	 * @generated
	 */
	void setSalesOpportunityId(String value);

	/**
	 * Returns the value of the '<em><b>Tax Auth Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Auth Geo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Auth Geo Id</em>' attribute.
	 * @see #setTaxAuthGeoId(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItem_TaxAuthGeoId()
	 * @model annotation="mimo-ent-domain frame='Geo'"
	 * @generated
	 */
	String getTaxAuthGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Auth Geo Id</em>' attribute.
	 * @see #getTaxAuthGeoId()
	 * @generated
	 */
	void setTaxAuthGeoId(String value);

	/**
	 * Returns the value of the '<em><b>Tax Auth Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Auth Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Auth Party Id</em>' attribute.
	 * @see #setTaxAuthPartyId(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItem_TaxAuthPartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getTaxAuthPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getTaxAuthPartyId <em>Tax Auth Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Auth Party Id</em>' attribute.
	 * @see #getTaxAuthPartyId()
	 * @generated
	 */
	void setTaxAuthPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Tax Authority Rate Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Authority Rate Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Authority Rate Seq Id</em>' attribute.
	 * @see #setTaxAuthorityRateSeqId(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItem_TaxAuthorityRateSeqId()
	 * @model annotation="mimo-ent-domain frame='TaxAuthorityRateProduct'"
	 * @generated
	 */
	String getTaxAuthorityRateSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getTaxAuthorityRateSeqId <em>Tax Authority Rate Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Authority Rate Seq Id</em>' attribute.
	 * @see #getTaxAuthorityRateSeqId()
	 * @generated
	 */
	void setTaxAuthorityRateSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Taxable Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taxable Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taxable Flag</em>' attribute.
	 * @see #setTaxableFlag(boolean)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItem_TaxableFlag()
	 * @model
	 * @generated
	 */
	boolean isTaxableFlag();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#isTaxableFlag <em>Taxable Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taxable Flag</em>' attribute.
	 * @see #isTaxableFlag()
	 * @generated
	 */
	void setTaxableFlag(boolean value);

	/**
	 * Returns the value of the '<em><b>Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom Id</em>' attribute.
	 * @see #setUomId(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItem_UomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getUomId <em>Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom Id</em>' attribute.
	 * @see #getUomId()
	 * @generated
	 */
	void setUomId(String value);

	/**
	 * Returns the value of the '<em><b>Invoice Item Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Item Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Item Type Id</em>' attribute.
	 * @see #setInvoiceItemTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItem_InvoiceItemTypeId()
	 * @model annotation="mimo-ent-domain frame='InvoiceItemType'"
	 * @generated
	 */
	String getInvoiceItemTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getInvoiceItemTypeId <em>Invoice Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Item Type Id</em>' attribute.
	 * @see #getInvoiceItemTypeId()
	 * @generated
	 */
	void setInvoiceItemTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Invoice Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Id</em>' attribute.
	 * @see #setInvoiceId(String)
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoicePackage#getInvoiceItem_InvoiceId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Invoice'"
	 * @generated
	 */
	String getInvoiceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getInvoiceId <em>Invoice Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Id</em>' attribute.
	 * @see #getInvoiceId()
	 * @generated
	 */
	void setInvoiceId(String value);

} // InvoiceItem
