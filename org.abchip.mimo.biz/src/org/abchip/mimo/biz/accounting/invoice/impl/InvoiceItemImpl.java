/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.invoice.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.accounting.invoice.InvoiceItem;
import org.abchip.mimo.biz.accounting.invoice.InvoiceItemType;
import org.abchip.mimo.biz.accounting.invoice.InvoicePackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoice Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getInvoiceId <em>Invoice Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getInvoiceItemTypeId <em>Invoice Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getOverrideGlAccountId <em>Override Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getOverrideOrgPartyId <em>Override Org Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getParentInvoiceId <em>Parent Invoice Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getParentInvoiceItemSeqId <em>Parent Invoice Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getProductFeatureId <em>Product Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getSalesOpportunityId <em>Sales Opportunity Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getTaxAuthPartyId <em>Tax Auth Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getTaxAuthorityRateSeqId <em>Tax Authority Rate Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#isTaxableFlag <em>Taxable Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getUomId <em>Uom Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvoiceItemImpl extends BizEntityTypedImpl<InvoiceItemType> implements InvoiceItem {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getInvoiceId() <em>Invoice Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInvoiceId() <em>Invoice Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceId()
	 * @generated
	 * @ordered
	 */
	protected String invoiceId = INVOICE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getInvoiceItemSeqId() <em>Invoice Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_ITEM_SEQ_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInvoiceItemSeqId() <em>Invoice Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String invoiceItemSeqId = INVOICE_ITEM_SEQ_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal AMOUNT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal amount = AMOUNT_EDEFAULT;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;
	/**
	 * The default value of the '{@link #getInventoryItemId() <em>Inventory Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVENTORY_ITEM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInventoryItemId() <em>Inventory Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemId()
	 * @generated
	 * @ordered
	 */
	protected String inventoryItemId = INVENTORY_ITEM_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getInvoiceItemTypeId() <em>Invoice Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_ITEM_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInvoiceItemTypeId() <em>Invoice Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected String invoiceItemTypeId = INVOICE_ITEM_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getOverrideGlAccountId() <em>Override Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected static final String OVERRIDE_GL_ACCOUNT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOverrideGlAccountId() <em>Override Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected String overrideGlAccountId = OVERRIDE_GL_ACCOUNT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getOverrideOrgPartyId() <em>Override Org Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideOrgPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String OVERRIDE_ORG_PARTY_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOverrideOrgPartyId() <em>Override Org Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideOrgPartyId()
	 * @generated
	 * @ordered
	 */
	protected String overrideOrgPartyId = OVERRIDE_ORG_PARTY_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getParentInvoiceId() <em>Parent Invoice Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentInvoiceId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_INVOICE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getParentInvoiceId() <em>Parent Invoice Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentInvoiceId()
	 * @generated
	 * @ordered
	 */
	protected String parentInvoiceId = PARENT_INVOICE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getParentInvoiceItemSeqId() <em>Parent Invoice Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentInvoiceItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_INVOICE_ITEM_SEQ_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getParentInvoiceItemSeqId() <em>Parent Invoice Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentInvoiceItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String parentInvoiceItemSeqId = PARENT_INVOICE_ITEM_SEQ_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getProductFeatureId() <em>Product Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_FEATURE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProductFeatureId() <em>Product Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureId()
	 * @generated
	 * @ordered
	 */
	protected String productFeatureId = PRODUCT_FEATURE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected String productId = PRODUCT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quantity = QUANTITY_EDEFAULT;
	/**
	 * The default value of the '{@link #getSalesOpportunityId() <em>Sales Opportunity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesOpportunityId()
	 * @generated
	 * @ordered
	 */
	protected static final String SALES_OPPORTUNITY_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSalesOpportunityId() <em>Sales Opportunity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesOpportunityId()
	 * @generated
	 * @ordered
	 */
	protected String salesOpportunityId = SALES_OPPORTUNITY_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getTaxAuthGeoId() <em>Tax Auth Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthGeoId()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_AUTH_GEO_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTaxAuthGeoId() <em>Tax Auth Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthGeoId()
	 * @generated
	 * @ordered
	 */
	protected String taxAuthGeoId = TAX_AUTH_GEO_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getTaxAuthPartyId() <em>Tax Auth Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_AUTH_PARTY_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTaxAuthPartyId() <em>Tax Auth Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthPartyId()
	 * @generated
	 * @ordered
	 */
	protected String taxAuthPartyId = TAX_AUTH_PARTY_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getTaxAuthorityRateSeqId() <em>Tax Authority Rate Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthorityRateSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_AUTHORITY_RATE_SEQ_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTaxAuthorityRateSeqId() <em>Tax Authority Rate Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthorityRateSeqId()
	 * @generated
	 * @ordered
	 */
	protected String taxAuthorityRateSeqId = TAX_AUTHORITY_RATE_SEQ_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #isTaxableFlag() <em>Taxable Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTaxableFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TAXABLE_FLAG_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isTaxableFlag() <em>Taxable Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTaxableFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean taxableFlag = TAXABLE_FLAG_EDEFAULT;
	/**
	 * The default value of the '{@link #getUomId() <em>Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String UOM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUomId() <em>Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUomId()
	 * @generated
	 * @ordered
	 */
	protected String uomId = UOM_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvoiceItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InvoicePackage.Literals.INVOICE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(BigDecimal newAmount) {
		BigDecimal oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInventoryItemId() {
		return inventoryItemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItemId(String newInventoryItemId) {
		String oldInventoryItemId = inventoryItemId;
		inventoryItemId = newInventoryItemId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM__INVENTORY_ITEM_ID, oldInventoryItemId, inventoryItemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceItemSeqId() {
		return invoiceItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceItemSeqId(String newInvoiceItemSeqId) {
		String oldInvoiceItemSeqId = invoiceItemSeqId;
		invoiceItemSeqId = newInvoiceItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM__INVOICE_ITEM_SEQ_ID, oldInvoiceItemSeqId, invoiceItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOverrideGlAccountId() {
		return overrideGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverrideGlAccountId(String newOverrideGlAccountId) {
		String oldOverrideGlAccountId = overrideGlAccountId;
		overrideGlAccountId = newOverrideGlAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM__OVERRIDE_GL_ACCOUNT_ID, oldOverrideGlAccountId, overrideGlAccountId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOverrideOrgPartyId() {
		return overrideOrgPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverrideOrgPartyId(String newOverrideOrgPartyId) {
		String oldOverrideOrgPartyId = overrideOrgPartyId;
		overrideOrgPartyId = newOverrideOrgPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM__OVERRIDE_ORG_PARTY_ID, oldOverrideOrgPartyId, overrideOrgPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentInvoiceId() {
		return parentInvoiceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentInvoiceId(String newParentInvoiceId) {
		String oldParentInvoiceId = parentInvoiceId;
		parentInvoiceId = newParentInvoiceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM__PARENT_INVOICE_ID, oldParentInvoiceId, parentInvoiceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentInvoiceItemSeqId() {
		return parentInvoiceItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentInvoiceItemSeqId(String newParentInvoiceItemSeqId) {
		String oldParentInvoiceItemSeqId = parentInvoiceItemSeqId;
		parentInvoiceItemSeqId = newParentInvoiceItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM__PARENT_INVOICE_ITEM_SEQ_ID, oldParentInvoiceItemSeqId, parentInvoiceItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductFeatureId() {
		return productFeatureId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureId(String newProductFeatureId) {
		String oldProductFeatureId = productFeatureId;
		productFeatureId = newProductFeatureId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM__PRODUCT_FEATURE_ID, oldProductFeatureId, productFeatureId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(String newProductId) {
		String oldProductId = productId;
		productId = newProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(BigDecimal newQuantity) {
		BigDecimal oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSalesOpportunityId() {
		return salesOpportunityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesOpportunityId(String newSalesOpportunityId) {
		String oldSalesOpportunityId = salesOpportunityId;
		salesOpportunityId = newSalesOpportunityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM__SALES_OPPORTUNITY_ID, oldSalesOpportunityId, salesOpportunityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxAuthGeoId() {
		return taxAuthGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthGeoId(String newTaxAuthGeoId) {
		String oldTaxAuthGeoId = taxAuthGeoId;
		taxAuthGeoId = newTaxAuthGeoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM__TAX_AUTH_GEO_ID, oldTaxAuthGeoId, taxAuthGeoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxAuthPartyId() {
		return taxAuthPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthPartyId(String newTaxAuthPartyId) {
		String oldTaxAuthPartyId = taxAuthPartyId;
		taxAuthPartyId = newTaxAuthPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM__TAX_AUTH_PARTY_ID, oldTaxAuthPartyId, taxAuthPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxAuthorityRateSeqId() {
		return taxAuthorityRateSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthorityRateSeqId(String newTaxAuthorityRateSeqId) {
		String oldTaxAuthorityRateSeqId = taxAuthorityRateSeqId;
		taxAuthorityRateSeqId = newTaxAuthorityRateSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM__TAX_AUTHORITY_RATE_SEQ_ID, oldTaxAuthorityRateSeqId, taxAuthorityRateSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTaxableFlag() {
		return taxableFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxableFlag(boolean newTaxableFlag) {
		boolean oldTaxableFlag = taxableFlag;
		taxableFlag = newTaxableFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM__TAXABLE_FLAG, oldTaxableFlag, taxableFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUomId() {
		return uomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUomId(String newUomId) {
		String oldUomId = uomId;
		uomId = newUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM__UOM_ID, oldUomId, uomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceItemTypeId() {
		return invoiceItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceItemTypeId(String newInvoiceItemTypeId) {
		String oldInvoiceItemTypeId = invoiceItemTypeId;
		invoiceItemTypeId = newInvoiceItemTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM__INVOICE_ITEM_TYPE_ID, oldInvoiceItemTypeId, invoiceItemTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceId() {
		return invoiceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceId(String newInvoiceId) {
		String oldInvoiceId = invoiceId;
		invoiceId = newInvoiceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InvoicePackage.INVOICE_ITEM__INVOICE_ID, oldInvoiceId, invoiceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InvoicePackage.INVOICE_ITEM__INVOICE_ID:
				return getInvoiceId();
			case InvoicePackage.INVOICE_ITEM__INVOICE_ITEM_SEQ_ID:
				return getInvoiceItemSeqId();
			case InvoicePackage.INVOICE_ITEM__AMOUNT:
				return getAmount();
			case InvoicePackage.INVOICE_ITEM__DESCRIPTION:
				return getDescription();
			case InvoicePackage.INVOICE_ITEM__INVENTORY_ITEM_ID:
				return getInventoryItemId();
			case InvoicePackage.INVOICE_ITEM__INVOICE_ITEM_TYPE_ID:
				return getInvoiceItemTypeId();
			case InvoicePackage.INVOICE_ITEM__OVERRIDE_GL_ACCOUNT_ID:
				return getOverrideGlAccountId();
			case InvoicePackage.INVOICE_ITEM__OVERRIDE_ORG_PARTY_ID:
				return getOverrideOrgPartyId();
			case InvoicePackage.INVOICE_ITEM__PARENT_INVOICE_ID:
				return getParentInvoiceId();
			case InvoicePackage.INVOICE_ITEM__PARENT_INVOICE_ITEM_SEQ_ID:
				return getParentInvoiceItemSeqId();
			case InvoicePackage.INVOICE_ITEM__PRODUCT_FEATURE_ID:
				return getProductFeatureId();
			case InvoicePackage.INVOICE_ITEM__PRODUCT_ID:
				return getProductId();
			case InvoicePackage.INVOICE_ITEM__QUANTITY:
				return getQuantity();
			case InvoicePackage.INVOICE_ITEM__SALES_OPPORTUNITY_ID:
				return getSalesOpportunityId();
			case InvoicePackage.INVOICE_ITEM__TAX_AUTH_GEO_ID:
				return getTaxAuthGeoId();
			case InvoicePackage.INVOICE_ITEM__TAX_AUTH_PARTY_ID:
				return getTaxAuthPartyId();
			case InvoicePackage.INVOICE_ITEM__TAX_AUTHORITY_RATE_SEQ_ID:
				return getTaxAuthorityRateSeqId();
			case InvoicePackage.INVOICE_ITEM__TAXABLE_FLAG:
				return isTaxableFlag();
			case InvoicePackage.INVOICE_ITEM__UOM_ID:
				return getUomId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InvoicePackage.INVOICE_ITEM__INVOICE_ID:
				setInvoiceId((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__INVOICE_ITEM_SEQ_ID:
				setInvoiceItemSeqId((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__AMOUNT:
				setAmount((BigDecimal)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__INVENTORY_ITEM_ID:
				setInventoryItemId((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__INVOICE_ITEM_TYPE_ID:
				setInvoiceItemTypeId((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__OVERRIDE_GL_ACCOUNT_ID:
				setOverrideGlAccountId((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__OVERRIDE_ORG_PARTY_ID:
				setOverrideOrgPartyId((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__PARENT_INVOICE_ID:
				setParentInvoiceId((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__PARENT_INVOICE_ITEM_SEQ_ID:
				setParentInvoiceItemSeqId((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__PRODUCT_FEATURE_ID:
				setProductFeatureId((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__QUANTITY:
				setQuantity((BigDecimal)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__SALES_OPPORTUNITY_ID:
				setSalesOpportunityId((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__TAX_AUTH_GEO_ID:
				setTaxAuthGeoId((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__TAX_AUTH_PARTY_ID:
				setTaxAuthPartyId((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__TAX_AUTHORITY_RATE_SEQ_ID:
				setTaxAuthorityRateSeqId((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__TAXABLE_FLAG:
				setTaxableFlag((Boolean)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__UOM_ID:
				setUomId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InvoicePackage.INVOICE_ITEM__INVOICE_ID:
				setInvoiceId(INVOICE_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM__INVOICE_ITEM_SEQ_ID:
				setInvoiceItemSeqId(INVOICE_ITEM_SEQ_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM__INVENTORY_ITEM_ID:
				setInventoryItemId(INVENTORY_ITEM_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM__INVOICE_ITEM_TYPE_ID:
				setInvoiceItemTypeId(INVOICE_ITEM_TYPE_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM__OVERRIDE_GL_ACCOUNT_ID:
				setOverrideGlAccountId(OVERRIDE_GL_ACCOUNT_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM__OVERRIDE_ORG_PARTY_ID:
				setOverrideOrgPartyId(OVERRIDE_ORG_PARTY_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM__PARENT_INVOICE_ID:
				setParentInvoiceId(PARENT_INVOICE_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM__PARENT_INVOICE_ITEM_SEQ_ID:
				setParentInvoiceItemSeqId(PARENT_INVOICE_ITEM_SEQ_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM__PRODUCT_FEATURE_ID:
				setProductFeatureId(PRODUCT_FEATURE_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM__SALES_OPPORTUNITY_ID:
				setSalesOpportunityId(SALES_OPPORTUNITY_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM__TAX_AUTH_GEO_ID:
				setTaxAuthGeoId(TAX_AUTH_GEO_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM__TAX_AUTH_PARTY_ID:
				setTaxAuthPartyId(TAX_AUTH_PARTY_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM__TAX_AUTHORITY_RATE_SEQ_ID:
				setTaxAuthorityRateSeqId(TAX_AUTHORITY_RATE_SEQ_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM__TAXABLE_FLAG:
				setTaxableFlag(TAXABLE_FLAG_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM__UOM_ID:
				setUomId(UOM_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InvoicePackage.INVOICE_ITEM__INVOICE_ID:
				return INVOICE_ID_EDEFAULT == null ? invoiceId != null : !INVOICE_ID_EDEFAULT.equals(invoiceId);
			case InvoicePackage.INVOICE_ITEM__INVOICE_ITEM_SEQ_ID:
				return INVOICE_ITEM_SEQ_ID_EDEFAULT == null ? invoiceItemSeqId != null : !INVOICE_ITEM_SEQ_ID_EDEFAULT.equals(invoiceItemSeqId);
			case InvoicePackage.INVOICE_ITEM__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case InvoicePackage.INVOICE_ITEM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case InvoicePackage.INVOICE_ITEM__INVENTORY_ITEM_ID:
				return INVENTORY_ITEM_ID_EDEFAULT == null ? inventoryItemId != null : !INVENTORY_ITEM_ID_EDEFAULT.equals(inventoryItemId);
			case InvoicePackage.INVOICE_ITEM__INVOICE_ITEM_TYPE_ID:
				return INVOICE_ITEM_TYPE_ID_EDEFAULT == null ? invoiceItemTypeId != null : !INVOICE_ITEM_TYPE_ID_EDEFAULT.equals(invoiceItemTypeId);
			case InvoicePackage.INVOICE_ITEM__OVERRIDE_GL_ACCOUNT_ID:
				return OVERRIDE_GL_ACCOUNT_ID_EDEFAULT == null ? overrideGlAccountId != null : !OVERRIDE_GL_ACCOUNT_ID_EDEFAULT.equals(overrideGlAccountId);
			case InvoicePackage.INVOICE_ITEM__OVERRIDE_ORG_PARTY_ID:
				return OVERRIDE_ORG_PARTY_ID_EDEFAULT == null ? overrideOrgPartyId != null : !OVERRIDE_ORG_PARTY_ID_EDEFAULT.equals(overrideOrgPartyId);
			case InvoicePackage.INVOICE_ITEM__PARENT_INVOICE_ID:
				return PARENT_INVOICE_ID_EDEFAULT == null ? parentInvoiceId != null : !PARENT_INVOICE_ID_EDEFAULT.equals(parentInvoiceId);
			case InvoicePackage.INVOICE_ITEM__PARENT_INVOICE_ITEM_SEQ_ID:
				return PARENT_INVOICE_ITEM_SEQ_ID_EDEFAULT == null ? parentInvoiceItemSeqId != null : !PARENT_INVOICE_ITEM_SEQ_ID_EDEFAULT.equals(parentInvoiceItemSeqId);
			case InvoicePackage.INVOICE_ITEM__PRODUCT_FEATURE_ID:
				return PRODUCT_FEATURE_ID_EDEFAULT == null ? productFeatureId != null : !PRODUCT_FEATURE_ID_EDEFAULT.equals(productFeatureId);
			case InvoicePackage.INVOICE_ITEM__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case InvoicePackage.INVOICE_ITEM__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case InvoicePackage.INVOICE_ITEM__SALES_OPPORTUNITY_ID:
				return SALES_OPPORTUNITY_ID_EDEFAULT == null ? salesOpportunityId != null : !SALES_OPPORTUNITY_ID_EDEFAULT.equals(salesOpportunityId);
			case InvoicePackage.INVOICE_ITEM__TAX_AUTH_GEO_ID:
				return TAX_AUTH_GEO_ID_EDEFAULT == null ? taxAuthGeoId != null : !TAX_AUTH_GEO_ID_EDEFAULT.equals(taxAuthGeoId);
			case InvoicePackage.INVOICE_ITEM__TAX_AUTH_PARTY_ID:
				return TAX_AUTH_PARTY_ID_EDEFAULT == null ? taxAuthPartyId != null : !TAX_AUTH_PARTY_ID_EDEFAULT.equals(taxAuthPartyId);
			case InvoicePackage.INVOICE_ITEM__TAX_AUTHORITY_RATE_SEQ_ID:
				return TAX_AUTHORITY_RATE_SEQ_ID_EDEFAULT == null ? taxAuthorityRateSeqId != null : !TAX_AUTHORITY_RATE_SEQ_ID_EDEFAULT.equals(taxAuthorityRateSeqId);
			case InvoicePackage.INVOICE_ITEM__TAXABLE_FLAG:
				return taxableFlag != TAXABLE_FLAG_EDEFAULT;
			case InvoicePackage.INVOICE_ITEM__UOM_ID:
				return UOM_ID_EDEFAULT == null ? uomId != null : !UOM_ID_EDEFAULT.equals(uomId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (invoiceId: ");
		result.append(invoiceId);
		result.append(", invoiceItemSeqId: ");
		result.append(invoiceItemSeqId);
		result.append(", amount: ");
		result.append(amount);
		result.append(", description: ");
		result.append(description);
		result.append(", inventoryItemId: ");
		result.append(inventoryItemId);
		result.append(", invoiceItemTypeId: ");
		result.append(invoiceItemTypeId);
		result.append(", overrideGlAccountId: ");
		result.append(overrideGlAccountId);
		result.append(", overrideOrgPartyId: ");
		result.append(overrideOrgPartyId);
		result.append(", parentInvoiceId: ");
		result.append(parentInvoiceId);
		result.append(", parentInvoiceItemSeqId: ");
		result.append(parentInvoiceItemSeqId);
		result.append(", productFeatureId: ");
		result.append(productFeatureId);
		result.append(", productId: ");
		result.append(productId);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", salesOpportunityId: ");
		result.append(salesOpportunityId);
		result.append(", taxAuthGeoId: ");
		result.append(taxAuthGeoId);
		result.append(", taxAuthPartyId: ");
		result.append(taxAuthPartyId);
		result.append(", taxAuthorityRateSeqId: ");
		result.append(taxAuthorityRateSeqId);
		result.append(", taxableFlag: ");
		result.append(taxableFlag);
		result.append(", uomId: ");
		result.append(uomId);
		result.append(')');
		return result.toString();
	}

} //InvoiceItemImpl
