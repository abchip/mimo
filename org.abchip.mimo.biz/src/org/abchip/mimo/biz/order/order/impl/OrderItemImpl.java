/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.order.order.OrderItem;
import org.abchip.mimo.biz.order.order.OrderItemType;
import org.abchip.mimo.biz.order.order.OrderPackage;
import org.abchip.mimo.biz.product.inventory.InventoryItem;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getAutoCancelDate <em>Auto Cancel Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getBudgetId <em>Budget Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getBudgetItemSeqId <em>Budget Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getCancelBackOrderDate <em>Cancel Back Order Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getCancelQuantity <em>Cancel Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getCorrespondingPoId <em>Corresponding Po Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getDeploymentId <em>Deployment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getDontCancelSetDate <em>Dont Cancel Set Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getEstimatedDeliveryDate <em>Estimated Delivery Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getEstimatedShipDate <em>Estimated Ship Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getExternalId <em>External Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#isIsItemGroupPrimary <em>Is Item Group Primary</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#isIsModifiedPrice <em>Is Modified Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#isIsPromo <em>Is Promo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getItemDescription <em>Item Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getOrderItemGroupSeqId <em>Order Item Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getProdCatalogId <em>Prod Catalog Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getProductFeatureId <em>Product Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getQuoteId <em>Quote Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getQuoteItemSeqId <em>Quote Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getReserveAfterDate <em>Reserve After Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getSelectedAmount <em>Selected Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getShipAfterDate <em>Ship After Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getShipBeforeDate <em>Ship Before Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getShoppingListId <em>Shopping List Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getShoppingListItemSeqId <em>Shopping List Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getSubscriptionId <em>Subscription Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getSupplierProductId <em>Supplier Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getUnitAverageCost <em>Unit Average Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getUnitListPrice <em>Unit List Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getUnitRecurringPrice <em>Unit Recurring Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getOrderItemTypeId <em>Order Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getFromInventoryItemId <em>From Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getRecurringFreqUomId <em>Recurring Freq Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getSyncStatusId <em>Sync Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getDontCancelSetUserLogin <em>Dont Cancel Set User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getOverrideGlAccountId <em>Override Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getSalesOpportunityId <em>Sales Opportunity Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getChangeByUserLoginId <em>Change By User Login Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderItemImpl extends BizEntityTypedImpl<OrderItemType> implements OrderItem {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getOrderItemSeqId() <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderItemSeqId() <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String orderItemSeqId = ORDER_ITEM_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoCancelDate() <em>Auto Cancel Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoCancelDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date AUTO_CANCEL_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutoCancelDate() <em>Auto Cancel Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoCancelDate()
	 * @generated
	 * @ordered
	 */
	protected Date autoCancelDate = AUTO_CANCEL_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBudgetId() <em>Budget Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetId()
	 * @generated
	 * @ordered
	 */
	protected static final String BUDGET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBudgetId() <em>Budget Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetId()
	 * @generated
	 * @ordered
	 */
	protected String budgetId = BUDGET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBudgetItemSeqId() <em>Budget Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String BUDGET_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBudgetItemSeqId() <em>Budget Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String budgetItemSeqId = BUDGET_ITEM_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCancelBackOrderDate() <em>Cancel Back Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelBackOrderDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CANCEL_BACK_ORDER_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCancelBackOrderDate() <em>Cancel Back Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelBackOrderDate()
	 * @generated
	 * @ordered
	 */
	protected Date cancelBackOrderDate = CANCEL_BACK_ORDER_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCancelQuantity() <em>Cancel Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CANCEL_QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCancelQuantity() <em>Cancel Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal cancelQuantity = CANCEL_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCorrespondingPoId() <em>Corresponding Po Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondingPoId()
	 * @generated
	 * @ordered
	 */
	protected static final String CORRESPONDING_PO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorrespondingPoId() <em>Corresponding Po Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondingPoId()
	 * @generated
	 * @ordered
	 */
	protected String correspondingPoId = CORRESPONDING_PO_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeploymentId() <em>Deployment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentId()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOYMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeploymentId() <em>Deployment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentId()
	 * @generated
	 * @ordered
	 */
	protected String deploymentId = DEPLOYMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDontCancelSetDate() <em>Dont Cancel Set Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDontCancelSetDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DONT_CANCEL_SET_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDontCancelSetDate() <em>Dont Cancel Set Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDontCancelSetDate()
	 * @generated
	 * @ordered
	 */
	protected Date dontCancelSetDate = DONT_CANCEL_SET_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedDeliveryDate() <em>Estimated Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ESTIMATED_DELIVERY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedDeliveryDate() <em>Estimated Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected Date estimatedDeliveryDate = ESTIMATED_DELIVERY_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedShipDate() <em>Estimated Ship Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedShipDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ESTIMATED_SHIP_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedShipDate() <em>Estimated Ship Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedShipDate()
	 * @generated
	 * @ordered
	 */
	protected Date estimatedShipDate = ESTIMATED_SHIP_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalId() <em>External Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalId()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalId() <em>External Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalId()
	 * @generated
	 * @ordered
	 */
	protected String externalId = EXTERNAL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsItemGroupPrimary() <em>Is Item Group Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsItemGroupPrimary()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ITEM_GROUP_PRIMARY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsItemGroupPrimary() <em>Is Item Group Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsItemGroupPrimary()
	 * @generated
	 * @ordered
	 */
	protected boolean isItemGroupPrimary = IS_ITEM_GROUP_PRIMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsModifiedPrice() <em>Is Modified Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsModifiedPrice()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MODIFIED_PRICE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsModifiedPrice() <em>Is Modified Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsModifiedPrice()
	 * @generated
	 * @ordered
	 */
	protected boolean isModifiedPrice = IS_MODIFIED_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPromo() <em>Is Promo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPromo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PROMO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPromo() <em>Is Promo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPromo()
	 * @generated
	 * @ordered
	 */
	protected boolean isPromo = IS_PROMO_EDEFAULT;

	/**
	 * The default value of the '{@link #getItemDescription() <em>Item Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItemDescription() <em>Item Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemDescription()
	 * @generated
	 * @ordered
	 */
	protected String itemDescription = ITEM_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderItemGroupSeqId() <em>Order Item Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemGroupSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ITEM_GROUP_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderItemGroupSeqId() <em>Order Item Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemGroupSeqId()
	 * @generated
	 * @ordered
	 */
	protected String orderItemGroupSeqId = ORDER_ITEM_GROUP_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProdCatalogId() <em>Prod Catalog Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdCatalogId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROD_CATALOG_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProdCatalogId() <em>Prod Catalog Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdCatalogId()
	 * @generated
	 * @ordered
	 */
	protected String prodCatalogId = PROD_CATALOG_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductCategoryId() <em>Product Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_CATEGORY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductCategoryId() <em>Product Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryId()
	 * @generated
	 * @ordered
	 */
	protected String productCategoryId = PRODUCT_CATEGORY_ID_EDEFAULT;

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
	 * The default value of the '{@link #getQuoteId() <em>Quote Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteId()
	 * @generated
	 * @ordered
	 */
	protected static final String QUOTE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuoteId() <em>Quote Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteId()
	 * @generated
	 * @ordered
	 */
	protected String quoteId = QUOTE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuoteItemSeqId() <em>Quote Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String QUOTE_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuoteItemSeqId() <em>Quote Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String quoteItemSeqId = QUOTE_ITEM_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserveAfterDate() <em>Reserve After Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserveAfterDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RESERVE_AFTER_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserveAfterDate() <em>Reserve After Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserveAfterDate()
	 * @generated
	 * @ordered
	 */
	protected Date reserveAfterDate = RESERVE_AFTER_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelectedAmount() <em>Selected Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SELECTED_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelectedAmount() <em>Selected Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal selectedAmount = SELECTED_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getShipAfterDate() <em>Ship After Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipAfterDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SHIP_AFTER_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipAfterDate() <em>Ship After Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipAfterDate()
	 * @generated
	 * @ordered
	 */
	protected Date shipAfterDate = SHIP_AFTER_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShipBeforeDate() <em>Ship Before Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipBeforeDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SHIP_BEFORE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipBeforeDate() <em>Ship Before Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipBeforeDate()
	 * @generated
	 * @ordered
	 */
	protected Date shipBeforeDate = SHIP_BEFORE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShoppingListId() <em>Shopping List Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShoppingListId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHOPPING_LIST_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShoppingListId() <em>Shopping List Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShoppingListId()
	 * @generated
	 * @ordered
	 */
	protected String shoppingListId = SHOPPING_LIST_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getShoppingListItemSeqId() <em>Shopping List Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShoppingListItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHOPPING_LIST_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShoppingListItemSeqId() <em>Shopping List Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShoppingListItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String shoppingListItemSeqId = SHOPPING_LIST_ITEM_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriptionId() <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIPTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriptionId() <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionId()
	 * @generated
	 * @ordered
	 */
	protected String subscriptionId = SUBSCRIPTION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupplierProductId() <em>Supplier Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierProductId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLIER_PRODUCT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplierProductId() <em>Supplier Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierProductId()
	 * @generated
	 * @ordered
	 */
	protected String supplierProductId = SUPPLIER_PRODUCT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitAverageCost() <em>Unit Average Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitAverageCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal UNIT_AVERAGE_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitAverageCost() <em>Unit Average Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitAverageCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal unitAverageCost = UNIT_AVERAGE_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitListPrice() <em>Unit List Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitListPrice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal UNIT_LIST_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitListPrice() <em>Unit List Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitListPrice()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal unitListPrice = UNIT_LIST_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitPrice() <em>Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal UNIT_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitPrice() <em>Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal unitPrice = UNIT_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitRecurringPrice() <em>Unit Recurring Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitRecurringPrice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal UNIT_RECURRING_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitRecurringPrice() <em>Unit Recurring Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitRecurringPrice()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal unitRecurringPrice = UNIT_RECURRING_PRICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrderId() <em>Order Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected OrderHeader orderId;

	/**
	 * The cached value of the '{@link #getOrderItemTypeId() <em>Order Item Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected OrderItemType orderItemTypeId;

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
	 * The cached value of the '{@link #getFromInventoryItemId() <em>From Inventory Item Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromInventoryItemId()
	 * @generated
	 * @ordered
	 */
	protected InventoryItem fromInventoryItemId;

	/**
	 * The cached value of the '{@link #getRecurringFreqUomId() <em>Recurring Freq Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurringFreqUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom recurringFreqUomId;

	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;

	/**
	 * The cached value of the '{@link #getSyncStatusId() <em>Sync Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem syncStatusId;

	/**
	 * The cached value of the '{@link #getDontCancelSetUserLogin() <em>Dont Cancel Set User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDontCancelSetUserLogin()
	 * @generated
	 * @ordered
	 */
	protected UserLogin dontCancelSetUserLogin;

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
	 * The cached value of the '{@link #getSalesOpportunityId() <em>Sales Opportunity Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesOpportunityId()
	 * @generated
	 * @ordered
	 */
	protected SalesOpportunity salesOpportunityId;

	/**
	 * The cached value of the '{@link #getChangeByUserLoginId() <em>Change By User Login Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected UserLogin changeByUserLoginId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.ORDER_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getAutoCancelDate() {
		return autoCancelDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoCancelDate(Date newAutoCancelDate) {
		Date oldAutoCancelDate = autoCancelDate;
		autoCancelDate = newAutoCancelDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__AUTO_CANCEL_DATE, oldAutoCancelDate, autoCancelDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBudgetId() {
		return budgetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetId(String newBudgetId) {
		String oldBudgetId = budgetId;
		budgetId = newBudgetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__BUDGET_ID, oldBudgetId, budgetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBudgetItemSeqId() {
		return budgetItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetItemSeqId(String newBudgetItemSeqId) {
		String oldBudgetItemSeqId = budgetItemSeqId;
		budgetItemSeqId = newBudgetItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__BUDGET_ITEM_SEQ_ID, oldBudgetItemSeqId, budgetItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCancelBackOrderDate() {
		return cancelBackOrderDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancelBackOrderDate(Date newCancelBackOrderDate) {
		Date oldCancelBackOrderDate = cancelBackOrderDate;
		cancelBackOrderDate = newCancelBackOrderDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__CANCEL_BACK_ORDER_DATE, oldCancelBackOrderDate, cancelBackOrderDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCancelQuantity() {
		return cancelQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancelQuantity(BigDecimal newCancelQuantity) {
		BigDecimal oldCancelQuantity = cancelQuantity;
		cancelQuantity = newCancelQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__CANCEL_QUANTITY, oldCancelQuantity, cancelQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getChangeByUserLoginId() {
		if (changeByUserLoginId != null && ((EObject)changeByUserLoginId).eIsProxy()) {
			InternalEObject oldChangeByUserLoginId = (InternalEObject)changeByUserLoginId;
			changeByUserLoginId = (UserLogin)eResolveProxy(oldChangeByUserLoginId);
			if (changeByUserLoginId != oldChangeByUserLoginId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderPackage.ORDER_ITEM__CHANGE_BY_USER_LOGIN_ID, oldChangeByUserLoginId, changeByUserLoginId));
			}
		}
		return changeByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetChangeByUserLoginId() {
		return changeByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeByUserLoginId(UserLogin newChangeByUserLoginId) {
		UserLogin oldChangeByUserLoginId = changeByUserLoginId;
		changeByUserLoginId = newChangeByUserLoginId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__CHANGE_BY_USER_LOGIN_ID, oldChangeByUserLoginId, changeByUserLoginId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCorrespondingPoId() {
		return correspondingPoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrespondingPoId(String newCorrespondingPoId) {
		String oldCorrespondingPoId = correspondingPoId;
		correspondingPoId = newCorrespondingPoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__CORRESPONDING_PO_ID, oldCorrespondingPoId, correspondingPoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeploymentId() {
		return deploymentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeploymentId(String newDeploymentId) {
		String oldDeploymentId = deploymentId;
		deploymentId = newDeploymentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__DEPLOYMENT_ID, oldDeploymentId, deploymentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDontCancelSetDate() {
		return dontCancelSetDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDontCancelSetDate(Date newDontCancelSetDate) {
		Date oldDontCancelSetDate = dontCancelSetDate;
		dontCancelSetDate = newDontCancelSetDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__DONT_CANCEL_SET_DATE, oldDontCancelSetDate, dontCancelSetDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getDontCancelSetUserLogin() {
		if (dontCancelSetUserLogin != null && ((EObject)dontCancelSetUserLogin).eIsProxy()) {
			InternalEObject oldDontCancelSetUserLogin = (InternalEObject)dontCancelSetUserLogin;
			dontCancelSetUserLogin = (UserLogin)eResolveProxy(oldDontCancelSetUserLogin);
			if (dontCancelSetUserLogin != oldDontCancelSetUserLogin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderPackage.ORDER_ITEM__DONT_CANCEL_SET_USER_LOGIN, oldDontCancelSetUserLogin, dontCancelSetUserLogin));
			}
		}
		return dontCancelSetUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetDontCancelSetUserLogin() {
		return dontCancelSetUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDontCancelSetUserLogin(UserLogin newDontCancelSetUserLogin) {
		UserLogin oldDontCancelSetUserLogin = dontCancelSetUserLogin;
		dontCancelSetUserLogin = newDontCancelSetUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__DONT_CANCEL_SET_USER_LOGIN, oldDontCancelSetUserLogin, dontCancelSetUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedDeliveryDate() {
		return estimatedDeliveryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedDeliveryDate(Date newEstimatedDeliveryDate) {
		Date oldEstimatedDeliveryDate = estimatedDeliveryDate;
		estimatedDeliveryDate = newEstimatedDeliveryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__ESTIMATED_DELIVERY_DATE, oldEstimatedDeliveryDate, estimatedDeliveryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedShipDate() {
		return estimatedShipDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedShipDate(Date newEstimatedShipDate) {
		Date oldEstimatedShipDate = estimatedShipDate;
		estimatedShipDate = newEstimatedShipDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__ESTIMATED_SHIP_DATE, oldEstimatedShipDate, estimatedShipDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalId() {
		return externalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalId(String newExternalId) {
		String oldExternalId = externalId;
		externalId = newExternalId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__EXTERNAL_ID, oldExternalId, externalId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItem getFromInventoryItemId() {
		if (fromInventoryItemId != null && ((EObject)fromInventoryItemId).eIsProxy()) {
			InternalEObject oldFromInventoryItemId = (InternalEObject)fromInventoryItemId;
			fromInventoryItemId = (InventoryItem)eResolveProxy(oldFromInventoryItemId);
			if (fromInventoryItemId != oldFromInventoryItemId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderPackage.ORDER_ITEM__FROM_INVENTORY_ITEM_ID, oldFromInventoryItemId, fromInventoryItemId));
			}
		}
		return fromInventoryItemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryItem basicGetFromInventoryItemId() {
		return fromInventoryItemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromInventoryItemId(InventoryItem newFromInventoryItemId) {
		InventoryItem oldFromInventoryItemId = fromInventoryItemId;
		fromInventoryItemId = newFromInventoryItemId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__FROM_INVENTORY_ITEM_ID, oldFromInventoryItemId, fromInventoryItemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsItemGroupPrimary() {
		return isItemGroupPrimary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsItemGroupPrimary(boolean newIsItemGroupPrimary) {
		boolean oldIsItemGroupPrimary = isItemGroupPrimary;
		isItemGroupPrimary = newIsItemGroupPrimary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__IS_ITEM_GROUP_PRIMARY, oldIsItemGroupPrimary, isItemGroupPrimary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsModifiedPrice() {
		return isModifiedPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsModifiedPrice(boolean newIsModifiedPrice) {
		boolean oldIsModifiedPrice = isModifiedPrice;
		isModifiedPrice = newIsModifiedPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__IS_MODIFIED_PRICE, oldIsModifiedPrice, isModifiedPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsPromo() {
		return isPromo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPromo(boolean newIsPromo) {
		boolean oldIsPromo = isPromo;
		isPromo = newIsPromo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__IS_PROMO, oldIsPromo, isPromo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getItemDescription() {
		return itemDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemDescription(String newItemDescription) {
		String oldItemDescription = itemDescription;
		itemDescription = newItemDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__ITEM_DESCRIPTION, oldItemDescription, itemDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderHeader getOrderId() {
		if (orderId != null && ((EObject)orderId).eIsProxy()) {
			InternalEObject oldOrderId = (InternalEObject)orderId;
			orderId = (OrderHeader)eResolveProxy(oldOrderId);
			if (orderId != oldOrderId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderPackage.ORDER_ITEM__ORDER_ID, oldOrderId, orderId));
			}
		}
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderHeader basicGetOrderId() {
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(OrderHeader newOrderId) {
		OrderHeader oldOrderId = orderId;
		orderId = newOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__ORDER_ID, oldOrderId, orderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemGroupSeqId() {
		return orderItemGroupSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemGroupSeqId(String newOrderItemGroupSeqId) {
		String oldOrderItemGroupSeqId = orderItemGroupSeqId;
		orderItemGroupSeqId = newOrderItemGroupSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__ORDER_ITEM_GROUP_SEQ_ID, oldOrderItemGroupSeqId, orderItemGroupSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemSeqId() {
		return orderItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemSeqId(String newOrderItemSeqId) {
		String oldOrderItemSeqId = orderItemSeqId;
		orderItemSeqId = newOrderItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__ORDER_ITEM_SEQ_ID, oldOrderItemSeqId, orderItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderItemType getOrderItemTypeId() {
		if (orderItemTypeId != null && ((EObject)orderItemTypeId).eIsProxy()) {
			InternalEObject oldOrderItemTypeId = (InternalEObject)orderItemTypeId;
			orderItemTypeId = (OrderItemType)eResolveProxy(oldOrderItemTypeId);
			if (orderItemTypeId != oldOrderItemTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderPackage.ORDER_ITEM__ORDER_ITEM_TYPE_ID, oldOrderItemTypeId, orderItemTypeId));
			}
		}
		return orderItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderItemType basicGetOrderItemTypeId() {
		return orderItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemTypeId(OrderItemType newOrderItemTypeId) {
		OrderItemType oldOrderItemTypeId = orderItemTypeId;
		orderItemTypeId = newOrderItemTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__ORDER_ITEM_TYPE_ID, oldOrderItemTypeId, orderItemTypeId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderPackage.ORDER_ITEM__OVERRIDE_GL_ACCOUNT_ID, oldOverrideGlAccountId, overrideGlAccountId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__OVERRIDE_GL_ACCOUNT_ID, oldOverrideGlAccountId, overrideGlAccountId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProdCatalogId() {
		return prodCatalogId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProdCatalogId(String newProdCatalogId) {
		String oldProdCatalogId = prodCatalogId;
		prodCatalogId = newProdCatalogId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__PROD_CATALOG_ID, oldProdCatalogId, prodCatalogId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductCategoryId() {
		return productCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategoryId(String newProductCategoryId) {
		String oldProductCategoryId = productCategoryId;
		productCategoryId = newProductCategoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__PRODUCT_CATEGORY_ID, oldProductCategoryId, productCategoryId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__PRODUCT_FEATURE_ID, oldProductFeatureId, productFeatureId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderPackage.ORDER_ITEM__PRODUCT_ID, oldProductId, productId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__PRODUCT_ID, oldProductId, productId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuoteId() {
		return quoteId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteId(String newQuoteId) {
		String oldQuoteId = quoteId;
		quoteId = newQuoteId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__QUOTE_ID, oldQuoteId, quoteId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuoteItemSeqId() {
		return quoteItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteItemSeqId(String newQuoteItemSeqId) {
		String oldQuoteItemSeqId = quoteItemSeqId;
		quoteItemSeqId = newQuoteItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__QUOTE_ITEM_SEQ_ID, oldQuoteItemSeqId, quoteItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getRecurringFreqUomId() {
		if (recurringFreqUomId != null && ((EObject)recurringFreqUomId).eIsProxy()) {
			InternalEObject oldRecurringFreqUomId = (InternalEObject)recurringFreqUomId;
			recurringFreqUomId = (Uom)eResolveProxy(oldRecurringFreqUomId);
			if (recurringFreqUomId != oldRecurringFreqUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderPackage.ORDER_ITEM__RECURRING_FREQ_UOM_ID, oldRecurringFreqUomId, recurringFreqUomId));
			}
		}
		return recurringFreqUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetRecurringFreqUomId() {
		return recurringFreqUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurringFreqUomId(Uom newRecurringFreqUomId) {
		Uom oldRecurringFreqUomId = recurringFreqUomId;
		recurringFreqUomId = newRecurringFreqUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__RECURRING_FREQ_UOM_ID, oldRecurringFreqUomId, recurringFreqUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReserveAfterDate() {
		return reserveAfterDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserveAfterDate(Date newReserveAfterDate) {
		Date oldReserveAfterDate = reserveAfterDate;
		reserveAfterDate = newReserveAfterDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__RESERVE_AFTER_DATE, oldReserveAfterDate, reserveAfterDate));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderPackage.ORDER_ITEM__SALES_OPPORTUNITY_ID, oldSalesOpportunityId, salesOpportunityId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__SALES_OPPORTUNITY_ID, oldSalesOpportunityId, salesOpportunityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getSelectedAmount() {
		return selectedAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelectedAmount(BigDecimal newSelectedAmount) {
		BigDecimal oldSelectedAmount = selectedAmount;
		selectedAmount = newSelectedAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__SELECTED_AMOUNT, oldSelectedAmount, selectedAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getShipAfterDate() {
		return shipAfterDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipAfterDate(Date newShipAfterDate) {
		Date oldShipAfterDate = shipAfterDate;
		shipAfterDate = newShipAfterDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__SHIP_AFTER_DATE, oldShipAfterDate, shipAfterDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getShipBeforeDate() {
		return shipBeforeDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipBeforeDate(Date newShipBeforeDate) {
		Date oldShipBeforeDate = shipBeforeDate;
		shipBeforeDate = newShipBeforeDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__SHIP_BEFORE_DATE, oldShipBeforeDate, shipBeforeDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShoppingListId() {
		return shoppingListId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShoppingListId(String newShoppingListId) {
		String oldShoppingListId = shoppingListId;
		shoppingListId = newShoppingListId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__SHOPPING_LIST_ID, oldShoppingListId, shoppingListId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShoppingListItemSeqId() {
		return shoppingListItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShoppingListItemSeqId(String newShoppingListItemSeqId) {
		String oldShoppingListItemSeqId = shoppingListItemSeqId;
		shoppingListItemSeqId = newShoppingListItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__SHOPPING_LIST_ITEM_SEQ_ID, oldShoppingListItemSeqId, shoppingListItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderPackage.ORDER_ITEM__STATUS_ID, oldStatusId, statusId));
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		StatusItem oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubscriptionId() {
		return subscriptionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionId(String newSubscriptionId) {
		String oldSubscriptionId = subscriptionId;
		subscriptionId = newSubscriptionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__SUBSCRIPTION_ID, oldSubscriptionId, subscriptionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSupplierProductId() {
		return supplierProductId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierProductId(String newSupplierProductId) {
		String oldSupplierProductId = supplierProductId;
		supplierProductId = newSupplierProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__SUPPLIER_PRODUCT_ID, oldSupplierProductId, supplierProductId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getSyncStatusId() {
		if (syncStatusId != null && ((EObject)syncStatusId).eIsProxy()) {
			InternalEObject oldSyncStatusId = (InternalEObject)syncStatusId;
			syncStatusId = (StatusItem)eResolveProxy(oldSyncStatusId);
			if (syncStatusId != oldSyncStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderPackage.ORDER_ITEM__SYNC_STATUS_ID, oldSyncStatusId, syncStatusId));
			}
		}
		return syncStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetSyncStatusId() {
		return syncStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSyncStatusId(StatusItem newSyncStatusId) {
		StatusItem oldSyncStatusId = syncStatusId;
		syncStatusId = newSyncStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__SYNC_STATUS_ID, oldSyncStatusId, syncStatusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getUnitAverageCost() {
		return unitAverageCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitAverageCost(BigDecimal newUnitAverageCost) {
		BigDecimal oldUnitAverageCost = unitAverageCost;
		unitAverageCost = newUnitAverageCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__UNIT_AVERAGE_COST, oldUnitAverageCost, unitAverageCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getUnitListPrice() {
		return unitListPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitListPrice(BigDecimal newUnitListPrice) {
		BigDecimal oldUnitListPrice = unitListPrice;
		unitListPrice = newUnitListPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__UNIT_LIST_PRICE, oldUnitListPrice, unitListPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitPrice(BigDecimal newUnitPrice) {
		BigDecimal oldUnitPrice = unitPrice;
		unitPrice = newUnitPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__UNIT_PRICE, oldUnitPrice, unitPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getUnitRecurringPrice() {
		return unitRecurringPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitRecurringPrice(BigDecimal newUnitRecurringPrice) {
		BigDecimal oldUnitRecurringPrice = unitRecurringPrice;
		unitRecurringPrice = newUnitRecurringPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM__UNIT_RECURRING_PRICE, oldUnitRecurringPrice, unitRecurringPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrderPackage.ORDER_ITEM__ORDER_ITEM_SEQ_ID:
				return getOrderItemSeqId();
			case OrderPackage.ORDER_ITEM__AUTO_CANCEL_DATE:
				return getAutoCancelDate();
			case OrderPackage.ORDER_ITEM__BUDGET_ID:
				return getBudgetId();
			case OrderPackage.ORDER_ITEM__BUDGET_ITEM_SEQ_ID:
				return getBudgetItemSeqId();
			case OrderPackage.ORDER_ITEM__CANCEL_BACK_ORDER_DATE:
				return getCancelBackOrderDate();
			case OrderPackage.ORDER_ITEM__CANCEL_QUANTITY:
				return getCancelQuantity();
			case OrderPackage.ORDER_ITEM__COMMENTS:
				return getComments();
			case OrderPackage.ORDER_ITEM__CORRESPONDING_PO_ID:
				return getCorrespondingPoId();
			case OrderPackage.ORDER_ITEM__DEPLOYMENT_ID:
				return getDeploymentId();
			case OrderPackage.ORDER_ITEM__DONT_CANCEL_SET_DATE:
				return getDontCancelSetDate();
			case OrderPackage.ORDER_ITEM__ESTIMATED_DELIVERY_DATE:
				return getEstimatedDeliveryDate();
			case OrderPackage.ORDER_ITEM__ESTIMATED_SHIP_DATE:
				return getEstimatedShipDate();
			case OrderPackage.ORDER_ITEM__EXTERNAL_ID:
				return getExternalId();
			case OrderPackage.ORDER_ITEM__IS_ITEM_GROUP_PRIMARY:
				return isIsItemGroupPrimary();
			case OrderPackage.ORDER_ITEM__IS_MODIFIED_PRICE:
				return isIsModifiedPrice();
			case OrderPackage.ORDER_ITEM__IS_PROMO:
				return isIsPromo();
			case OrderPackage.ORDER_ITEM__ITEM_DESCRIPTION:
				return getItemDescription();
			case OrderPackage.ORDER_ITEM__ORDER_ITEM_GROUP_SEQ_ID:
				return getOrderItemGroupSeqId();
			case OrderPackage.ORDER_ITEM__PROD_CATALOG_ID:
				return getProdCatalogId();
			case OrderPackage.ORDER_ITEM__PRODUCT_CATEGORY_ID:
				return getProductCategoryId();
			case OrderPackage.ORDER_ITEM__PRODUCT_FEATURE_ID:
				return getProductFeatureId();
			case OrderPackage.ORDER_ITEM__QUANTITY:
				return getQuantity();
			case OrderPackage.ORDER_ITEM__QUOTE_ID:
				return getQuoteId();
			case OrderPackage.ORDER_ITEM__QUOTE_ITEM_SEQ_ID:
				return getQuoteItemSeqId();
			case OrderPackage.ORDER_ITEM__RESERVE_AFTER_DATE:
				return getReserveAfterDate();
			case OrderPackage.ORDER_ITEM__SELECTED_AMOUNT:
				return getSelectedAmount();
			case OrderPackage.ORDER_ITEM__SHIP_AFTER_DATE:
				return getShipAfterDate();
			case OrderPackage.ORDER_ITEM__SHIP_BEFORE_DATE:
				return getShipBeforeDate();
			case OrderPackage.ORDER_ITEM__SHOPPING_LIST_ID:
				return getShoppingListId();
			case OrderPackage.ORDER_ITEM__SHOPPING_LIST_ITEM_SEQ_ID:
				return getShoppingListItemSeqId();
			case OrderPackage.ORDER_ITEM__SUBSCRIPTION_ID:
				return getSubscriptionId();
			case OrderPackage.ORDER_ITEM__SUPPLIER_PRODUCT_ID:
				return getSupplierProductId();
			case OrderPackage.ORDER_ITEM__UNIT_AVERAGE_COST:
				return getUnitAverageCost();
			case OrderPackage.ORDER_ITEM__UNIT_LIST_PRICE:
				return getUnitListPrice();
			case OrderPackage.ORDER_ITEM__UNIT_PRICE:
				return getUnitPrice();
			case OrderPackage.ORDER_ITEM__UNIT_RECURRING_PRICE:
				return getUnitRecurringPrice();
			case OrderPackage.ORDER_ITEM__ORDER_ID:
				if (resolve) return getOrderId();
				return basicGetOrderId();
			case OrderPackage.ORDER_ITEM__ORDER_ITEM_TYPE_ID:
				if (resolve) return getOrderItemTypeId();
				return basicGetOrderItemTypeId();
			case OrderPackage.ORDER_ITEM__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case OrderPackage.ORDER_ITEM__FROM_INVENTORY_ITEM_ID:
				if (resolve) return getFromInventoryItemId();
				return basicGetFromInventoryItemId();
			case OrderPackage.ORDER_ITEM__RECURRING_FREQ_UOM_ID:
				if (resolve) return getRecurringFreqUomId();
				return basicGetRecurringFreqUomId();
			case OrderPackage.ORDER_ITEM__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case OrderPackage.ORDER_ITEM__SYNC_STATUS_ID:
				if (resolve) return getSyncStatusId();
				return basicGetSyncStatusId();
			case OrderPackage.ORDER_ITEM__DONT_CANCEL_SET_USER_LOGIN:
				if (resolve) return getDontCancelSetUserLogin();
				return basicGetDontCancelSetUserLogin();
			case OrderPackage.ORDER_ITEM__OVERRIDE_GL_ACCOUNT_ID:
				if (resolve) return getOverrideGlAccountId();
				return basicGetOverrideGlAccountId();
			case OrderPackage.ORDER_ITEM__SALES_OPPORTUNITY_ID:
				if (resolve) return getSalesOpportunityId();
				return basicGetSalesOpportunityId();
			case OrderPackage.ORDER_ITEM__CHANGE_BY_USER_LOGIN_ID:
				if (resolve) return getChangeByUserLoginId();
				return basicGetChangeByUserLoginId();
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
			case OrderPackage.ORDER_ITEM__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM__AUTO_CANCEL_DATE:
				setAutoCancelDate((Date)newValue);
				return;
			case OrderPackage.ORDER_ITEM__BUDGET_ID:
				setBudgetId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM__BUDGET_ITEM_SEQ_ID:
				setBudgetItemSeqId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM__CANCEL_BACK_ORDER_DATE:
				setCancelBackOrderDate((Date)newValue);
				return;
			case OrderPackage.ORDER_ITEM__CANCEL_QUANTITY:
				setCancelQuantity((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_ITEM__COMMENTS:
				setComments((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM__CORRESPONDING_PO_ID:
				setCorrespondingPoId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM__DEPLOYMENT_ID:
				setDeploymentId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM__DONT_CANCEL_SET_DATE:
				setDontCancelSetDate((Date)newValue);
				return;
			case OrderPackage.ORDER_ITEM__ESTIMATED_DELIVERY_DATE:
				setEstimatedDeliveryDate((Date)newValue);
				return;
			case OrderPackage.ORDER_ITEM__ESTIMATED_SHIP_DATE:
				setEstimatedShipDate((Date)newValue);
				return;
			case OrderPackage.ORDER_ITEM__EXTERNAL_ID:
				setExternalId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM__IS_ITEM_GROUP_PRIMARY:
				setIsItemGroupPrimary((Boolean)newValue);
				return;
			case OrderPackage.ORDER_ITEM__IS_MODIFIED_PRICE:
				setIsModifiedPrice((Boolean)newValue);
				return;
			case OrderPackage.ORDER_ITEM__IS_PROMO:
				setIsPromo((Boolean)newValue);
				return;
			case OrderPackage.ORDER_ITEM__ITEM_DESCRIPTION:
				setItemDescription((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM__ORDER_ITEM_GROUP_SEQ_ID:
				setOrderItemGroupSeqId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM__PROD_CATALOG_ID:
				setProdCatalogId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM__PRODUCT_CATEGORY_ID:
				setProductCategoryId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM__PRODUCT_FEATURE_ID:
				setProductFeatureId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM__QUANTITY:
				setQuantity((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_ITEM__QUOTE_ID:
				setQuoteId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM__QUOTE_ITEM_SEQ_ID:
				setQuoteItemSeqId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM__RESERVE_AFTER_DATE:
				setReserveAfterDate((Date)newValue);
				return;
			case OrderPackage.ORDER_ITEM__SELECTED_AMOUNT:
				setSelectedAmount((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_ITEM__SHIP_AFTER_DATE:
				setShipAfterDate((Date)newValue);
				return;
			case OrderPackage.ORDER_ITEM__SHIP_BEFORE_DATE:
				setShipBeforeDate((Date)newValue);
				return;
			case OrderPackage.ORDER_ITEM__SHOPPING_LIST_ID:
				setShoppingListId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM__SHOPPING_LIST_ITEM_SEQ_ID:
				setShoppingListItemSeqId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM__SUBSCRIPTION_ID:
				setSubscriptionId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM__SUPPLIER_PRODUCT_ID:
				setSupplierProductId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM__UNIT_AVERAGE_COST:
				setUnitAverageCost((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_ITEM__UNIT_LIST_PRICE:
				setUnitListPrice((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_ITEM__UNIT_PRICE:
				setUnitPrice((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_ITEM__UNIT_RECURRING_PRICE:
				setUnitRecurringPrice((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_ITEM__ORDER_ID:
				setOrderId((OrderHeader)newValue);
				return;
			case OrderPackage.ORDER_ITEM__ORDER_ITEM_TYPE_ID:
				setOrderItemTypeId((OrderItemType)newValue);
				return;
			case OrderPackage.ORDER_ITEM__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case OrderPackage.ORDER_ITEM__FROM_INVENTORY_ITEM_ID:
				setFromInventoryItemId((InventoryItem)newValue);
				return;
			case OrderPackage.ORDER_ITEM__RECURRING_FREQ_UOM_ID:
				setRecurringFreqUomId((Uom)newValue);
				return;
			case OrderPackage.ORDER_ITEM__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case OrderPackage.ORDER_ITEM__SYNC_STATUS_ID:
				setSyncStatusId((StatusItem)newValue);
				return;
			case OrderPackage.ORDER_ITEM__DONT_CANCEL_SET_USER_LOGIN:
				setDontCancelSetUserLogin((UserLogin)newValue);
				return;
			case OrderPackage.ORDER_ITEM__OVERRIDE_GL_ACCOUNT_ID:
				setOverrideGlAccountId((GlAccount)newValue);
				return;
			case OrderPackage.ORDER_ITEM__SALES_OPPORTUNITY_ID:
				setSalesOpportunityId((SalesOpportunity)newValue);
				return;
			case OrderPackage.ORDER_ITEM__CHANGE_BY_USER_LOGIN_ID:
				setChangeByUserLoginId((UserLogin)newValue);
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
			case OrderPackage.ORDER_ITEM__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId(ORDER_ITEM_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__AUTO_CANCEL_DATE:
				setAutoCancelDate(AUTO_CANCEL_DATE_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__BUDGET_ID:
				setBudgetId(BUDGET_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__BUDGET_ITEM_SEQ_ID:
				setBudgetItemSeqId(BUDGET_ITEM_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__CANCEL_BACK_ORDER_DATE:
				setCancelBackOrderDate(CANCEL_BACK_ORDER_DATE_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__CANCEL_QUANTITY:
				setCancelQuantity(CANCEL_QUANTITY_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__CORRESPONDING_PO_ID:
				setCorrespondingPoId(CORRESPONDING_PO_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__DEPLOYMENT_ID:
				setDeploymentId(DEPLOYMENT_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__DONT_CANCEL_SET_DATE:
				setDontCancelSetDate(DONT_CANCEL_SET_DATE_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__ESTIMATED_DELIVERY_DATE:
				setEstimatedDeliveryDate(ESTIMATED_DELIVERY_DATE_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__ESTIMATED_SHIP_DATE:
				setEstimatedShipDate(ESTIMATED_SHIP_DATE_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__EXTERNAL_ID:
				setExternalId(EXTERNAL_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__IS_ITEM_GROUP_PRIMARY:
				setIsItemGroupPrimary(IS_ITEM_GROUP_PRIMARY_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__IS_MODIFIED_PRICE:
				setIsModifiedPrice(IS_MODIFIED_PRICE_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__IS_PROMO:
				setIsPromo(IS_PROMO_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__ITEM_DESCRIPTION:
				setItemDescription(ITEM_DESCRIPTION_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__ORDER_ITEM_GROUP_SEQ_ID:
				setOrderItemGroupSeqId(ORDER_ITEM_GROUP_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__PROD_CATALOG_ID:
				setProdCatalogId(PROD_CATALOG_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__PRODUCT_CATEGORY_ID:
				setProductCategoryId(PRODUCT_CATEGORY_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__PRODUCT_FEATURE_ID:
				setProductFeatureId(PRODUCT_FEATURE_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__QUOTE_ID:
				setQuoteId(QUOTE_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__QUOTE_ITEM_SEQ_ID:
				setQuoteItemSeqId(QUOTE_ITEM_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__RESERVE_AFTER_DATE:
				setReserveAfterDate(RESERVE_AFTER_DATE_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__SELECTED_AMOUNT:
				setSelectedAmount(SELECTED_AMOUNT_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__SHIP_AFTER_DATE:
				setShipAfterDate(SHIP_AFTER_DATE_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__SHIP_BEFORE_DATE:
				setShipBeforeDate(SHIP_BEFORE_DATE_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__SHOPPING_LIST_ID:
				setShoppingListId(SHOPPING_LIST_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__SHOPPING_LIST_ITEM_SEQ_ID:
				setShoppingListItemSeqId(SHOPPING_LIST_ITEM_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__SUBSCRIPTION_ID:
				setSubscriptionId(SUBSCRIPTION_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__SUPPLIER_PRODUCT_ID:
				setSupplierProductId(SUPPLIER_PRODUCT_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__UNIT_AVERAGE_COST:
				setUnitAverageCost(UNIT_AVERAGE_COST_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__UNIT_LIST_PRICE:
				setUnitListPrice(UNIT_LIST_PRICE_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__UNIT_PRICE:
				setUnitPrice(UNIT_PRICE_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__UNIT_RECURRING_PRICE:
				setUnitRecurringPrice(UNIT_RECURRING_PRICE_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM__ORDER_ID:
				setOrderId((OrderHeader)null);
				return;
			case OrderPackage.ORDER_ITEM__ORDER_ITEM_TYPE_ID:
				setOrderItemTypeId((OrderItemType)null);
				return;
			case OrderPackage.ORDER_ITEM__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case OrderPackage.ORDER_ITEM__FROM_INVENTORY_ITEM_ID:
				setFromInventoryItemId((InventoryItem)null);
				return;
			case OrderPackage.ORDER_ITEM__RECURRING_FREQ_UOM_ID:
				setRecurringFreqUomId((Uom)null);
				return;
			case OrderPackage.ORDER_ITEM__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case OrderPackage.ORDER_ITEM__SYNC_STATUS_ID:
				setSyncStatusId((StatusItem)null);
				return;
			case OrderPackage.ORDER_ITEM__DONT_CANCEL_SET_USER_LOGIN:
				setDontCancelSetUserLogin((UserLogin)null);
				return;
			case OrderPackage.ORDER_ITEM__OVERRIDE_GL_ACCOUNT_ID:
				setOverrideGlAccountId((GlAccount)null);
				return;
			case OrderPackage.ORDER_ITEM__SALES_OPPORTUNITY_ID:
				setSalesOpportunityId((SalesOpportunity)null);
				return;
			case OrderPackage.ORDER_ITEM__CHANGE_BY_USER_LOGIN_ID:
				setChangeByUserLoginId((UserLogin)null);
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
			case OrderPackage.ORDER_ITEM__ORDER_ITEM_SEQ_ID:
				return ORDER_ITEM_SEQ_ID_EDEFAULT == null ? orderItemSeqId != null : !ORDER_ITEM_SEQ_ID_EDEFAULT.equals(orderItemSeqId);
			case OrderPackage.ORDER_ITEM__AUTO_CANCEL_DATE:
				return AUTO_CANCEL_DATE_EDEFAULT == null ? autoCancelDate != null : !AUTO_CANCEL_DATE_EDEFAULT.equals(autoCancelDate);
			case OrderPackage.ORDER_ITEM__BUDGET_ID:
				return BUDGET_ID_EDEFAULT == null ? budgetId != null : !BUDGET_ID_EDEFAULT.equals(budgetId);
			case OrderPackage.ORDER_ITEM__BUDGET_ITEM_SEQ_ID:
				return BUDGET_ITEM_SEQ_ID_EDEFAULT == null ? budgetItemSeqId != null : !BUDGET_ITEM_SEQ_ID_EDEFAULT.equals(budgetItemSeqId);
			case OrderPackage.ORDER_ITEM__CANCEL_BACK_ORDER_DATE:
				return CANCEL_BACK_ORDER_DATE_EDEFAULT == null ? cancelBackOrderDate != null : !CANCEL_BACK_ORDER_DATE_EDEFAULT.equals(cancelBackOrderDate);
			case OrderPackage.ORDER_ITEM__CANCEL_QUANTITY:
				return CANCEL_QUANTITY_EDEFAULT == null ? cancelQuantity != null : !CANCEL_QUANTITY_EDEFAULT.equals(cancelQuantity);
			case OrderPackage.ORDER_ITEM__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case OrderPackage.ORDER_ITEM__CORRESPONDING_PO_ID:
				return CORRESPONDING_PO_ID_EDEFAULT == null ? correspondingPoId != null : !CORRESPONDING_PO_ID_EDEFAULT.equals(correspondingPoId);
			case OrderPackage.ORDER_ITEM__DEPLOYMENT_ID:
				return DEPLOYMENT_ID_EDEFAULT == null ? deploymentId != null : !DEPLOYMENT_ID_EDEFAULT.equals(deploymentId);
			case OrderPackage.ORDER_ITEM__DONT_CANCEL_SET_DATE:
				return DONT_CANCEL_SET_DATE_EDEFAULT == null ? dontCancelSetDate != null : !DONT_CANCEL_SET_DATE_EDEFAULT.equals(dontCancelSetDate);
			case OrderPackage.ORDER_ITEM__ESTIMATED_DELIVERY_DATE:
				return ESTIMATED_DELIVERY_DATE_EDEFAULT == null ? estimatedDeliveryDate != null : !ESTIMATED_DELIVERY_DATE_EDEFAULT.equals(estimatedDeliveryDate);
			case OrderPackage.ORDER_ITEM__ESTIMATED_SHIP_DATE:
				return ESTIMATED_SHIP_DATE_EDEFAULT == null ? estimatedShipDate != null : !ESTIMATED_SHIP_DATE_EDEFAULT.equals(estimatedShipDate);
			case OrderPackage.ORDER_ITEM__EXTERNAL_ID:
				return EXTERNAL_ID_EDEFAULT == null ? externalId != null : !EXTERNAL_ID_EDEFAULT.equals(externalId);
			case OrderPackage.ORDER_ITEM__IS_ITEM_GROUP_PRIMARY:
				return isItemGroupPrimary != IS_ITEM_GROUP_PRIMARY_EDEFAULT;
			case OrderPackage.ORDER_ITEM__IS_MODIFIED_PRICE:
				return isModifiedPrice != IS_MODIFIED_PRICE_EDEFAULT;
			case OrderPackage.ORDER_ITEM__IS_PROMO:
				return isPromo != IS_PROMO_EDEFAULT;
			case OrderPackage.ORDER_ITEM__ITEM_DESCRIPTION:
				return ITEM_DESCRIPTION_EDEFAULT == null ? itemDescription != null : !ITEM_DESCRIPTION_EDEFAULT.equals(itemDescription);
			case OrderPackage.ORDER_ITEM__ORDER_ITEM_GROUP_SEQ_ID:
				return ORDER_ITEM_GROUP_SEQ_ID_EDEFAULT == null ? orderItemGroupSeqId != null : !ORDER_ITEM_GROUP_SEQ_ID_EDEFAULT.equals(orderItemGroupSeqId);
			case OrderPackage.ORDER_ITEM__PROD_CATALOG_ID:
				return PROD_CATALOG_ID_EDEFAULT == null ? prodCatalogId != null : !PROD_CATALOG_ID_EDEFAULT.equals(prodCatalogId);
			case OrderPackage.ORDER_ITEM__PRODUCT_CATEGORY_ID:
				return PRODUCT_CATEGORY_ID_EDEFAULT == null ? productCategoryId != null : !PRODUCT_CATEGORY_ID_EDEFAULT.equals(productCategoryId);
			case OrderPackage.ORDER_ITEM__PRODUCT_FEATURE_ID:
				return PRODUCT_FEATURE_ID_EDEFAULT == null ? productFeatureId != null : !PRODUCT_FEATURE_ID_EDEFAULT.equals(productFeatureId);
			case OrderPackage.ORDER_ITEM__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case OrderPackage.ORDER_ITEM__QUOTE_ID:
				return QUOTE_ID_EDEFAULT == null ? quoteId != null : !QUOTE_ID_EDEFAULT.equals(quoteId);
			case OrderPackage.ORDER_ITEM__QUOTE_ITEM_SEQ_ID:
				return QUOTE_ITEM_SEQ_ID_EDEFAULT == null ? quoteItemSeqId != null : !QUOTE_ITEM_SEQ_ID_EDEFAULT.equals(quoteItemSeqId);
			case OrderPackage.ORDER_ITEM__RESERVE_AFTER_DATE:
				return RESERVE_AFTER_DATE_EDEFAULT == null ? reserveAfterDate != null : !RESERVE_AFTER_DATE_EDEFAULT.equals(reserveAfterDate);
			case OrderPackage.ORDER_ITEM__SELECTED_AMOUNT:
				return SELECTED_AMOUNT_EDEFAULT == null ? selectedAmount != null : !SELECTED_AMOUNT_EDEFAULT.equals(selectedAmount);
			case OrderPackage.ORDER_ITEM__SHIP_AFTER_DATE:
				return SHIP_AFTER_DATE_EDEFAULT == null ? shipAfterDate != null : !SHIP_AFTER_DATE_EDEFAULT.equals(shipAfterDate);
			case OrderPackage.ORDER_ITEM__SHIP_BEFORE_DATE:
				return SHIP_BEFORE_DATE_EDEFAULT == null ? shipBeforeDate != null : !SHIP_BEFORE_DATE_EDEFAULT.equals(shipBeforeDate);
			case OrderPackage.ORDER_ITEM__SHOPPING_LIST_ID:
				return SHOPPING_LIST_ID_EDEFAULT == null ? shoppingListId != null : !SHOPPING_LIST_ID_EDEFAULT.equals(shoppingListId);
			case OrderPackage.ORDER_ITEM__SHOPPING_LIST_ITEM_SEQ_ID:
				return SHOPPING_LIST_ITEM_SEQ_ID_EDEFAULT == null ? shoppingListItemSeqId != null : !SHOPPING_LIST_ITEM_SEQ_ID_EDEFAULT.equals(shoppingListItemSeqId);
			case OrderPackage.ORDER_ITEM__SUBSCRIPTION_ID:
				return SUBSCRIPTION_ID_EDEFAULT == null ? subscriptionId != null : !SUBSCRIPTION_ID_EDEFAULT.equals(subscriptionId);
			case OrderPackage.ORDER_ITEM__SUPPLIER_PRODUCT_ID:
				return SUPPLIER_PRODUCT_ID_EDEFAULT == null ? supplierProductId != null : !SUPPLIER_PRODUCT_ID_EDEFAULT.equals(supplierProductId);
			case OrderPackage.ORDER_ITEM__UNIT_AVERAGE_COST:
				return UNIT_AVERAGE_COST_EDEFAULT == null ? unitAverageCost != null : !UNIT_AVERAGE_COST_EDEFAULT.equals(unitAverageCost);
			case OrderPackage.ORDER_ITEM__UNIT_LIST_PRICE:
				return UNIT_LIST_PRICE_EDEFAULT == null ? unitListPrice != null : !UNIT_LIST_PRICE_EDEFAULT.equals(unitListPrice);
			case OrderPackage.ORDER_ITEM__UNIT_PRICE:
				return UNIT_PRICE_EDEFAULT == null ? unitPrice != null : !UNIT_PRICE_EDEFAULT.equals(unitPrice);
			case OrderPackage.ORDER_ITEM__UNIT_RECURRING_PRICE:
				return UNIT_RECURRING_PRICE_EDEFAULT == null ? unitRecurringPrice != null : !UNIT_RECURRING_PRICE_EDEFAULT.equals(unitRecurringPrice);
			case OrderPackage.ORDER_ITEM__ORDER_ID:
				return orderId != null;
			case OrderPackage.ORDER_ITEM__ORDER_ITEM_TYPE_ID:
				return orderItemTypeId != null;
			case OrderPackage.ORDER_ITEM__PRODUCT_ID:
				return productId != null;
			case OrderPackage.ORDER_ITEM__FROM_INVENTORY_ITEM_ID:
				return fromInventoryItemId != null;
			case OrderPackage.ORDER_ITEM__RECURRING_FREQ_UOM_ID:
				return recurringFreqUomId != null;
			case OrderPackage.ORDER_ITEM__STATUS_ID:
				return statusId != null;
			case OrderPackage.ORDER_ITEM__SYNC_STATUS_ID:
				return syncStatusId != null;
			case OrderPackage.ORDER_ITEM__DONT_CANCEL_SET_USER_LOGIN:
				return dontCancelSetUserLogin != null;
			case OrderPackage.ORDER_ITEM__OVERRIDE_GL_ACCOUNT_ID:
				return overrideGlAccountId != null;
			case OrderPackage.ORDER_ITEM__SALES_OPPORTUNITY_ID:
				return salesOpportunityId != null;
			case OrderPackage.ORDER_ITEM__CHANGE_BY_USER_LOGIN_ID:
				return changeByUserLoginId != null;
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
		result.append(" (orderItemSeqId: ");
		result.append(orderItemSeqId);
		result.append(", autoCancelDate: ");
		result.append(autoCancelDate);
		result.append(", budgetId: ");
		result.append(budgetId);
		result.append(", budgetItemSeqId: ");
		result.append(budgetItemSeqId);
		result.append(", cancelBackOrderDate: ");
		result.append(cancelBackOrderDate);
		result.append(", cancelQuantity: ");
		result.append(cancelQuantity);
		result.append(", comments: ");
		result.append(comments);
		result.append(", correspondingPoId: ");
		result.append(correspondingPoId);
		result.append(", deploymentId: ");
		result.append(deploymentId);
		result.append(", dontCancelSetDate: ");
		result.append(dontCancelSetDate);
		result.append(", estimatedDeliveryDate: ");
		result.append(estimatedDeliveryDate);
		result.append(", estimatedShipDate: ");
		result.append(estimatedShipDate);
		result.append(", externalId: ");
		result.append(externalId);
		result.append(", isItemGroupPrimary: ");
		result.append(isItemGroupPrimary);
		result.append(", isModifiedPrice: ");
		result.append(isModifiedPrice);
		result.append(", isPromo: ");
		result.append(isPromo);
		result.append(", itemDescription: ");
		result.append(itemDescription);
		result.append(", orderItemGroupSeqId: ");
		result.append(orderItemGroupSeqId);
		result.append(", prodCatalogId: ");
		result.append(prodCatalogId);
		result.append(", productCategoryId: ");
		result.append(productCategoryId);
		result.append(", productFeatureId: ");
		result.append(productFeatureId);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", quoteId: ");
		result.append(quoteId);
		result.append(", quoteItemSeqId: ");
		result.append(quoteItemSeqId);
		result.append(", reserveAfterDate: ");
		result.append(reserveAfterDate);
		result.append(", selectedAmount: ");
		result.append(selectedAmount);
		result.append(", shipAfterDate: ");
		result.append(shipAfterDate);
		result.append(", shipBeforeDate: ");
		result.append(shipBeforeDate);
		result.append(", shoppingListId: ");
		result.append(shoppingListId);
		result.append(", shoppingListItemSeqId: ");
		result.append(shoppingListItemSeqId);
		result.append(", subscriptionId: ");
		result.append(subscriptionId);
		result.append(", supplierProductId: ");
		result.append(supplierProductId);
		result.append(", unitAverageCost: ");
		result.append(unitAverageCost);
		result.append(", unitListPrice: ");
		result.append(unitListPrice);
		result.append(", unitPrice: ");
		result.append(unitPrice);
		result.append(", unitRecurringPrice: ");
		result.append(unitRecurringPrice);
		result.append(')');
		return result.toString();
	}

} //OrderItemImpl
