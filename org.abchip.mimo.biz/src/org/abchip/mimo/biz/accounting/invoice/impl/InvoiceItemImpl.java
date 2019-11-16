/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.invoice.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.accounting.invoice.Invoice;
import org.abchip.mimo.biz.accounting.invoice.InvoiceItem;
import org.abchip.mimo.biz.accounting.invoice.InvoiceItemType;
import org.abchip.mimo.biz.accounting.invoice.InvoicePackage;
import org.abchip.mimo.biz.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct;
import org.abchip.mimo.biz.common.geo.Geo;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.feature.ProductFeature;
import org.abchip.mimo.biz.product.inventory.InventoryItem;
import org.abchip.mimo.biz.product.product.Product;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoice Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getParentInvoiceId <em>Parent Invoice Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getParentInvoiceItemSeqId <em>Parent Invoice Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#isTaxableFlag <em>Taxable Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getInvoiceItemTypeId <em>Invoice Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getInvoiceId <em>Invoice Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getProductFeatureId <em>Product Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getUomId <em>Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getOverrideGlAccountId <em>Override Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getTaxAuthPartyId <em>Tax Auth Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getTaxAuthorityRateSeqId <em>Tax Authority Rate Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getOverrideOrgPartyId <em>Override Org Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl#getSalesOpportunityId <em>Sales Opportunity Id</em>}</li>
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
	 * The cached value of the '{@link #getInvoiceItemTypeId() <em>Invoice Item Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected InvoiceItemType invoiceItemTypeId;
	/**
	 * The cached value of the '{@link #getInvoiceId() <em>Invoice Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceId()
	 * @generated
	 * @ordered
	 */
	protected Invoice invoiceId;
	/**
	 * The cached value of the '{@link #getInventoryItemId() <em>Inventory Item Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemId()
	 * @generated
	 * @ordered
	 */
	protected InventoryItem inventoryItemId;
	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected Product productId;
	/**
	 * The cached value of the '{@link #getProductFeatureId() <em>Product Feature Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureId()
	 * @generated
	 * @ordered
	 */
	protected ProductFeature productFeatureId;
	/**
	 * The cached value of the '{@link #getUomId() <em>Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom uomId;
	/**
	 * The cached value of the '{@link #getOverrideGlAccountId() <em>Override Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected GlAccount overrideGlAccountId;
	/**
	 * The cached value of the '{@link #getTaxAuthPartyId() <em>Tax Auth Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party taxAuthPartyId;
	/**
	 * The cached value of the '{@link #getTaxAuthGeoId() <em>Tax Auth Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthGeoId()
	 * @generated
	 * @ordered
	 */
	protected Geo taxAuthGeoId;
	/**
	 * The cached value of the '{@link #getTaxAuthorityRateSeqId() <em>Tax Authority Rate Seq Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthorityRateSeqId()
	 * @generated
	 * @ordered
	 */
	protected TaxAuthorityRateProduct taxAuthorityRateSeqId;
	/**
	 * The cached value of the '{@link #getOverrideOrgPartyId() <em>Override Org Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideOrgPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party overrideOrgPartyId;
	/**
	 * The cached value of the '{@link #getSalesOpportunityId() <em>Sales Opportunity Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesOpportunityId()
	 * @generated
	 * @ordered
	 */
	protected SalesOpportunity salesOpportunityId;

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
	public InventoryItem getInventoryItemId() {
		if (inventoryItemId != null && ((EObject)inventoryItemId).eIsProxy()) {
			InternalEObject oldInventoryItemId = (InternalEObject)inventoryItemId;
			inventoryItemId = (InventoryItem)eResolveProxy(oldInventoryItemId);
			if (inventoryItemId != oldInventoryItemId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvoicePackage.INVOICE_ITEM__INVENTORY_ITEM_ID, oldInventoryItemId, inventoryItemId));
			}
		}
		return inventoryItemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryItem basicGetInventoryItemId() {
		return inventoryItemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItemId(InventoryItem newInventoryItemId) {
		InventoryItem oldInventoryItemId = inventoryItemId;
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
	public GlAccount getOverrideGlAccountId() {
		if (overrideGlAccountId != null && ((EObject)overrideGlAccountId).eIsProxy()) {
			InternalEObject oldOverrideGlAccountId = (InternalEObject)overrideGlAccountId;
			overrideGlAccountId = (GlAccount)eResolveProxy(oldOverrideGlAccountId);
			if (overrideGlAccountId != oldOverrideGlAccountId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvoicePackage.INVOICE_ITEM__OVERRIDE_GL_ACCOUNT_ID, oldOverrideGlAccountId, overrideGlAccountId));
			}
		}
		return overrideGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccount basicGetOverrideGlAccountId() {
		return overrideGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverrideGlAccountId(GlAccount newOverrideGlAccountId) {
		GlAccount oldOverrideGlAccountId = overrideGlAccountId;
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
	public Party getOverrideOrgPartyId() {
		if (overrideOrgPartyId != null && ((EObject)overrideOrgPartyId).eIsProxy()) {
			InternalEObject oldOverrideOrgPartyId = (InternalEObject)overrideOrgPartyId;
			overrideOrgPartyId = (Party)eResolveProxy(oldOverrideOrgPartyId);
			if (overrideOrgPartyId != oldOverrideOrgPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvoicePackage.INVOICE_ITEM__OVERRIDE_ORG_PARTY_ID, oldOverrideOrgPartyId, overrideOrgPartyId));
			}
		}
		return overrideOrgPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetOverrideOrgPartyId() {
		return overrideOrgPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverrideOrgPartyId(Party newOverrideOrgPartyId) {
		Party oldOverrideOrgPartyId = overrideOrgPartyId;
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
	public ProductFeature getProductFeatureId() {
		if (productFeatureId != null && ((EObject)productFeatureId).eIsProxy()) {
			InternalEObject oldProductFeatureId = (InternalEObject)productFeatureId;
			productFeatureId = (ProductFeature)eResolveProxy(oldProductFeatureId);
			if (productFeatureId != oldProductFeatureId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvoicePackage.INVOICE_ITEM__PRODUCT_FEATURE_ID, oldProductFeatureId, productFeatureId));
			}
		}
		return productFeatureId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFeature basicGetProductFeatureId() {
		return productFeatureId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureId(ProductFeature newProductFeatureId) {
		ProductFeature oldProductFeatureId = productFeatureId;
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
	public Product getProductId() {
		if (productId != null && ((EObject)productId).eIsProxy()) {
			InternalEObject oldProductId = (InternalEObject)productId;
			productId = (Product)eResolveProxy(oldProductId);
			if (productId != oldProductId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvoicePackage.INVOICE_ITEM__PRODUCT_ID, oldProductId, productId));
			}
		}
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		Product oldProductId = productId;
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
	public SalesOpportunity getSalesOpportunityId() {
		if (salesOpportunityId != null && ((EObject)salesOpportunityId).eIsProxy()) {
			InternalEObject oldSalesOpportunityId = (InternalEObject)salesOpportunityId;
			salesOpportunityId = (SalesOpportunity)eResolveProxy(oldSalesOpportunityId);
			if (salesOpportunityId != oldSalesOpportunityId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvoicePackage.INVOICE_ITEM__SALES_OPPORTUNITY_ID, oldSalesOpportunityId, salesOpportunityId));
			}
		}
		return salesOpportunityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalesOpportunity basicGetSalesOpportunityId() {
		return salesOpportunityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesOpportunityId(SalesOpportunity newSalesOpportunityId) {
		SalesOpportunity oldSalesOpportunityId = salesOpportunityId;
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
	public Geo getTaxAuthGeoId() {
		if (taxAuthGeoId != null && ((EObject)taxAuthGeoId).eIsProxy()) {
			InternalEObject oldTaxAuthGeoId = (InternalEObject)taxAuthGeoId;
			taxAuthGeoId = (Geo)eResolveProxy(oldTaxAuthGeoId);
			if (taxAuthGeoId != oldTaxAuthGeoId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvoicePackage.INVOICE_ITEM__TAX_AUTH_GEO_ID, oldTaxAuthGeoId, taxAuthGeoId));
			}
		}
		return taxAuthGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geo basicGetTaxAuthGeoId() {
		return taxAuthGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthGeoId(Geo newTaxAuthGeoId) {
		Geo oldTaxAuthGeoId = taxAuthGeoId;
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
	public Party getTaxAuthPartyId() {
		if (taxAuthPartyId != null && ((EObject)taxAuthPartyId).eIsProxy()) {
			InternalEObject oldTaxAuthPartyId = (InternalEObject)taxAuthPartyId;
			taxAuthPartyId = (Party)eResolveProxy(oldTaxAuthPartyId);
			if (taxAuthPartyId != oldTaxAuthPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvoicePackage.INVOICE_ITEM__TAX_AUTH_PARTY_ID, oldTaxAuthPartyId, taxAuthPartyId));
			}
		}
		return taxAuthPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetTaxAuthPartyId() {
		return taxAuthPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthPartyId(Party newTaxAuthPartyId) {
		Party oldTaxAuthPartyId = taxAuthPartyId;
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
	public TaxAuthorityRateProduct getTaxAuthorityRateSeqId() {
		if (taxAuthorityRateSeqId != null && ((EObject)taxAuthorityRateSeqId).eIsProxy()) {
			InternalEObject oldTaxAuthorityRateSeqId = (InternalEObject)taxAuthorityRateSeqId;
			taxAuthorityRateSeqId = (TaxAuthorityRateProduct)eResolveProxy(oldTaxAuthorityRateSeqId);
			if (taxAuthorityRateSeqId != oldTaxAuthorityRateSeqId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvoicePackage.INVOICE_ITEM__TAX_AUTHORITY_RATE_SEQ_ID, oldTaxAuthorityRateSeqId, taxAuthorityRateSeqId));
			}
		}
		return taxAuthorityRateSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxAuthorityRateProduct basicGetTaxAuthorityRateSeqId() {
		return taxAuthorityRateSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthorityRateSeqId(TaxAuthorityRateProduct newTaxAuthorityRateSeqId) {
		TaxAuthorityRateProduct oldTaxAuthorityRateSeqId = taxAuthorityRateSeqId;
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
	public Uom getUomId() {
		if (uomId != null && ((EObject)uomId).eIsProxy()) {
			InternalEObject oldUomId = (InternalEObject)uomId;
			uomId = (Uom)eResolveProxy(oldUomId);
			if (uomId != oldUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvoicePackage.INVOICE_ITEM__UOM_ID, oldUomId, uomId));
			}
		}
		return uomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetUomId() {
		return uomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUomId(Uom newUomId) {
		Uom oldUomId = uomId;
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
	public InvoiceItemType getInvoiceItemTypeId() {
		if (invoiceItemTypeId != null && ((EObject)invoiceItemTypeId).eIsProxy()) {
			InternalEObject oldInvoiceItemTypeId = (InternalEObject)invoiceItemTypeId;
			invoiceItemTypeId = (InvoiceItemType)eResolveProxy(oldInvoiceItemTypeId);
			if (invoiceItemTypeId != oldInvoiceItemTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvoicePackage.INVOICE_ITEM__INVOICE_ITEM_TYPE_ID, oldInvoiceItemTypeId, invoiceItemTypeId));
			}
		}
		return invoiceItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceItemType basicGetInvoiceItemTypeId() {
		return invoiceItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceItemTypeId(InvoiceItemType newInvoiceItemTypeId) {
		InvoiceItemType oldInvoiceItemTypeId = invoiceItemTypeId;
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
	public Invoice getInvoiceId() {
		if (invoiceId != null && ((EObject)invoiceId).eIsProxy()) {
			InternalEObject oldInvoiceId = (InternalEObject)invoiceId;
			invoiceId = (Invoice)eResolveProxy(oldInvoiceId);
			if (invoiceId != oldInvoiceId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InvoicePackage.INVOICE_ITEM__INVOICE_ID, oldInvoiceId, invoiceId));
			}
		}
		return invoiceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invoice basicGetInvoiceId() {
		return invoiceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceId(Invoice newInvoiceId) {
		Invoice oldInvoiceId = invoiceId;
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
			case InvoicePackage.INVOICE_ITEM__INVOICE_ITEM_SEQ_ID:
				return getInvoiceItemSeqId();
			case InvoicePackage.INVOICE_ITEM__AMOUNT:
				return getAmount();
			case InvoicePackage.INVOICE_ITEM__DESCRIPTION:
				return getDescription();
			case InvoicePackage.INVOICE_ITEM__PARENT_INVOICE_ID:
				return getParentInvoiceId();
			case InvoicePackage.INVOICE_ITEM__PARENT_INVOICE_ITEM_SEQ_ID:
				return getParentInvoiceItemSeqId();
			case InvoicePackage.INVOICE_ITEM__QUANTITY:
				return getQuantity();
			case InvoicePackage.INVOICE_ITEM__TAXABLE_FLAG:
				return isTaxableFlag();
			case InvoicePackage.INVOICE_ITEM__INVOICE_ITEM_TYPE_ID:
				if (resolve) return getInvoiceItemTypeId();
				return basicGetInvoiceItemTypeId();
			case InvoicePackage.INVOICE_ITEM__INVOICE_ID:
				if (resolve) return getInvoiceId();
				return basicGetInvoiceId();
			case InvoicePackage.INVOICE_ITEM__INVENTORY_ITEM_ID:
				if (resolve) return getInventoryItemId();
				return basicGetInventoryItemId();
			case InvoicePackage.INVOICE_ITEM__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case InvoicePackage.INVOICE_ITEM__PRODUCT_FEATURE_ID:
				if (resolve) return getProductFeatureId();
				return basicGetProductFeatureId();
			case InvoicePackage.INVOICE_ITEM__UOM_ID:
				if (resolve) return getUomId();
				return basicGetUomId();
			case InvoicePackage.INVOICE_ITEM__OVERRIDE_GL_ACCOUNT_ID:
				if (resolve) return getOverrideGlAccountId();
				return basicGetOverrideGlAccountId();
			case InvoicePackage.INVOICE_ITEM__TAX_AUTH_PARTY_ID:
				if (resolve) return getTaxAuthPartyId();
				return basicGetTaxAuthPartyId();
			case InvoicePackage.INVOICE_ITEM__TAX_AUTH_GEO_ID:
				if (resolve) return getTaxAuthGeoId();
				return basicGetTaxAuthGeoId();
			case InvoicePackage.INVOICE_ITEM__TAX_AUTHORITY_RATE_SEQ_ID:
				if (resolve) return getTaxAuthorityRateSeqId();
				return basicGetTaxAuthorityRateSeqId();
			case InvoicePackage.INVOICE_ITEM__OVERRIDE_ORG_PARTY_ID:
				if (resolve) return getOverrideOrgPartyId();
				return basicGetOverrideOrgPartyId();
			case InvoicePackage.INVOICE_ITEM__SALES_OPPORTUNITY_ID:
				if (resolve) return getSalesOpportunityId();
				return basicGetSalesOpportunityId();
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
			case InvoicePackage.INVOICE_ITEM__INVOICE_ITEM_SEQ_ID:
				setInvoiceItemSeqId((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__AMOUNT:
				setAmount((BigDecimal)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__PARENT_INVOICE_ID:
				setParentInvoiceId((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__PARENT_INVOICE_ITEM_SEQ_ID:
				setParentInvoiceItemSeqId((String)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__QUANTITY:
				setQuantity((BigDecimal)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__TAXABLE_FLAG:
				setTaxableFlag((Boolean)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__INVOICE_ITEM_TYPE_ID:
				setInvoiceItemTypeId((InvoiceItemType)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__INVOICE_ID:
				setInvoiceId((Invoice)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__INVENTORY_ITEM_ID:
				setInventoryItemId((InventoryItem)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__PRODUCT_FEATURE_ID:
				setProductFeatureId((ProductFeature)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__UOM_ID:
				setUomId((Uom)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__OVERRIDE_GL_ACCOUNT_ID:
				setOverrideGlAccountId((GlAccount)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__TAX_AUTH_PARTY_ID:
				setTaxAuthPartyId((Party)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__TAX_AUTH_GEO_ID:
				setTaxAuthGeoId((Geo)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__TAX_AUTHORITY_RATE_SEQ_ID:
				setTaxAuthorityRateSeqId((TaxAuthorityRateProduct)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__OVERRIDE_ORG_PARTY_ID:
				setOverrideOrgPartyId((Party)newValue);
				return;
			case InvoicePackage.INVOICE_ITEM__SALES_OPPORTUNITY_ID:
				setSalesOpportunityId((SalesOpportunity)newValue);
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
			case InvoicePackage.INVOICE_ITEM__INVOICE_ITEM_SEQ_ID:
				setInvoiceItemSeqId(INVOICE_ITEM_SEQ_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM__PARENT_INVOICE_ID:
				setParentInvoiceId(PARENT_INVOICE_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM__PARENT_INVOICE_ITEM_SEQ_ID:
				setParentInvoiceItemSeqId(PARENT_INVOICE_ITEM_SEQ_ID_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM__TAXABLE_FLAG:
				setTaxableFlag(TAXABLE_FLAG_EDEFAULT);
				return;
			case InvoicePackage.INVOICE_ITEM__INVOICE_ITEM_TYPE_ID:
				setInvoiceItemTypeId((InvoiceItemType)null);
				return;
			case InvoicePackage.INVOICE_ITEM__INVOICE_ID:
				setInvoiceId((Invoice)null);
				return;
			case InvoicePackage.INVOICE_ITEM__INVENTORY_ITEM_ID:
				setInventoryItemId((InventoryItem)null);
				return;
			case InvoicePackage.INVOICE_ITEM__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case InvoicePackage.INVOICE_ITEM__PRODUCT_FEATURE_ID:
				setProductFeatureId((ProductFeature)null);
				return;
			case InvoicePackage.INVOICE_ITEM__UOM_ID:
				setUomId((Uom)null);
				return;
			case InvoicePackage.INVOICE_ITEM__OVERRIDE_GL_ACCOUNT_ID:
				setOverrideGlAccountId((GlAccount)null);
				return;
			case InvoicePackage.INVOICE_ITEM__TAX_AUTH_PARTY_ID:
				setTaxAuthPartyId((Party)null);
				return;
			case InvoicePackage.INVOICE_ITEM__TAX_AUTH_GEO_ID:
				setTaxAuthGeoId((Geo)null);
				return;
			case InvoicePackage.INVOICE_ITEM__TAX_AUTHORITY_RATE_SEQ_ID:
				setTaxAuthorityRateSeqId((TaxAuthorityRateProduct)null);
				return;
			case InvoicePackage.INVOICE_ITEM__OVERRIDE_ORG_PARTY_ID:
				setOverrideOrgPartyId((Party)null);
				return;
			case InvoicePackage.INVOICE_ITEM__SALES_OPPORTUNITY_ID:
				setSalesOpportunityId((SalesOpportunity)null);
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
			case InvoicePackage.INVOICE_ITEM__INVOICE_ITEM_SEQ_ID:
				return INVOICE_ITEM_SEQ_ID_EDEFAULT == null ? invoiceItemSeqId != null : !INVOICE_ITEM_SEQ_ID_EDEFAULT.equals(invoiceItemSeqId);
			case InvoicePackage.INVOICE_ITEM__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case InvoicePackage.INVOICE_ITEM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case InvoicePackage.INVOICE_ITEM__PARENT_INVOICE_ID:
				return PARENT_INVOICE_ID_EDEFAULT == null ? parentInvoiceId != null : !PARENT_INVOICE_ID_EDEFAULT.equals(parentInvoiceId);
			case InvoicePackage.INVOICE_ITEM__PARENT_INVOICE_ITEM_SEQ_ID:
				return PARENT_INVOICE_ITEM_SEQ_ID_EDEFAULT == null ? parentInvoiceItemSeqId != null : !PARENT_INVOICE_ITEM_SEQ_ID_EDEFAULT.equals(parentInvoiceItemSeqId);
			case InvoicePackage.INVOICE_ITEM__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case InvoicePackage.INVOICE_ITEM__TAXABLE_FLAG:
				return taxableFlag != TAXABLE_FLAG_EDEFAULT;
			case InvoicePackage.INVOICE_ITEM__INVOICE_ITEM_TYPE_ID:
				return invoiceItemTypeId != null;
			case InvoicePackage.INVOICE_ITEM__INVOICE_ID:
				return invoiceId != null;
			case InvoicePackage.INVOICE_ITEM__INVENTORY_ITEM_ID:
				return inventoryItemId != null;
			case InvoicePackage.INVOICE_ITEM__PRODUCT_ID:
				return productId != null;
			case InvoicePackage.INVOICE_ITEM__PRODUCT_FEATURE_ID:
				return productFeatureId != null;
			case InvoicePackage.INVOICE_ITEM__UOM_ID:
				return uomId != null;
			case InvoicePackage.INVOICE_ITEM__OVERRIDE_GL_ACCOUNT_ID:
				return overrideGlAccountId != null;
			case InvoicePackage.INVOICE_ITEM__TAX_AUTH_PARTY_ID:
				return taxAuthPartyId != null;
			case InvoicePackage.INVOICE_ITEM__TAX_AUTH_GEO_ID:
				return taxAuthGeoId != null;
			case InvoicePackage.INVOICE_ITEM__TAX_AUTHORITY_RATE_SEQ_ID:
				return taxAuthorityRateSeqId != null;
			case InvoicePackage.INVOICE_ITEM__OVERRIDE_ORG_PARTY_ID:
				return overrideOrgPartyId != null;
			case InvoicePackage.INVOICE_ITEM__SALES_OPPORTUNITY_ID:
				return salesOpportunityId != null;
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
		result.append(" (invoiceItemSeqId: ");
		result.append(invoiceItemSeqId);
		result.append(", amount: ");
		result.append(amount);
		result.append(", description: ");
		result.append(description);
		result.append(", parentInvoiceId: ");
		result.append(parentInvoiceId);
		result.append(", parentInvoiceItemSeqId: ");
		result.append(parentInvoiceItemSeqId);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", taxableFlag: ");
		result.append(taxableFlag);
		result.append(')');
		return result.toString();
	}

} //InvoiceItemImpl
