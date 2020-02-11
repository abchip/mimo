/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getAutoCancelDate <em>Auto Cancel Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getBudgetId <em>Budget Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getBudgetItemSeqId <em>Budget Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getCancelBackOrderDate <em>Cancel Back Order Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getCancelQuantity <em>Cancel Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getChangeByUserLoginId <em>Change By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getCorrespondingPoId <em>Corresponding Po Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getDeploymentId <em>Deployment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getDontCancelSetDate <em>Dont Cancel Set Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getDontCancelSetUserLogin <em>Dont Cancel Set User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getEstimatedDeliveryDate <em>Estimated Delivery Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getEstimatedShipDate <em>Estimated Ship Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getExternalId <em>External Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getFromInventoryItemId <em>From Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#isIsItemGroupPrimary <em>Is Item Group Primary</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#isIsModifiedPrice <em>Is Modified Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#isIsPromo <em>Is Promo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getItemDescription <em>Item Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getOrderItemGroupSeqId <em>Order Item Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getOrderItemTypeId <em>Order Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getOverrideGlAccountId <em>Override Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getProdCatalogId <em>Prod Catalog Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getProductFeatureId <em>Product Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getQuoteId <em>Quote Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getQuoteItemSeqId <em>Quote Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getRecurringFreqUomId <em>Recurring Freq Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getReserveAfterDate <em>Reserve After Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getSalesOpportunityId <em>Sales Opportunity Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getSelectedAmount <em>Selected Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getShipAfterDate <em>Ship After Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getShipBeforeDate <em>Ship Before Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getShoppingListId <em>Shopping List Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getShoppingListItemSeqId <em>Shopping List Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getSubscriptionId <em>Subscription Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getSupplierProductId <em>Supplier Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getSyncStatusId <em>Sync Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getUnitAverageCost <em>Unit Average Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getUnitListPrice <em>Unit List Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemImpl#getUnitRecurringPrice <em>Unit Recurring Price</em>}</li>
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
		return (Date)eGet(OrderPackage.Literals.ORDER_ITEM__AUTO_CANCEL_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoCancelDate(Date newAutoCancelDate) {
		eSet(OrderPackage.Literals.ORDER_ITEM__AUTO_CANCEL_DATE, newAutoCancelDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBudgetId() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM__BUDGET_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetId(String newBudgetId) {
		eSet(OrderPackage.Literals.ORDER_ITEM__BUDGET_ID, newBudgetId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBudgetItemSeqId() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM__BUDGET_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetItemSeqId(String newBudgetItemSeqId) {
		eSet(OrderPackage.Literals.ORDER_ITEM__BUDGET_ITEM_SEQ_ID, newBudgetItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCancelBackOrderDate() {
		return (Date)eGet(OrderPackage.Literals.ORDER_ITEM__CANCEL_BACK_ORDER_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancelBackOrderDate(Date newCancelBackOrderDate) {
		eSet(OrderPackage.Literals.ORDER_ITEM__CANCEL_BACK_ORDER_DATE, newCancelBackOrderDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCancelQuantity() {
		return (BigDecimal)eGet(OrderPackage.Literals.ORDER_ITEM__CANCEL_QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancelQuantity(BigDecimal newCancelQuantity) {
		eSet(OrderPackage.Literals.ORDER_ITEM__CANCEL_QUANTITY, newCancelQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getChangeByUserLoginId() {
		return (UserLogin)eGet(OrderPackage.Literals.ORDER_ITEM__CHANGE_BY_USER_LOGIN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeByUserLoginId(UserLogin newChangeByUserLoginId) {
		eSet(OrderPackage.Literals.ORDER_ITEM__CHANGE_BY_USER_LOGIN_ID, newChangeByUserLoginId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		eSet(OrderPackage.Literals.ORDER_ITEM__COMMENTS, newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCorrespondingPoId() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM__CORRESPONDING_PO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrespondingPoId(String newCorrespondingPoId) {
		eSet(OrderPackage.Literals.ORDER_ITEM__CORRESPONDING_PO_ID, newCorrespondingPoId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeploymentId() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM__DEPLOYMENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeploymentId(String newDeploymentId) {
		eSet(OrderPackage.Literals.ORDER_ITEM__DEPLOYMENT_ID, newDeploymentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDontCancelSetDate() {
		return (Date)eGet(OrderPackage.Literals.ORDER_ITEM__DONT_CANCEL_SET_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDontCancelSetDate(Date newDontCancelSetDate) {
		eSet(OrderPackage.Literals.ORDER_ITEM__DONT_CANCEL_SET_DATE, newDontCancelSetDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getDontCancelSetUserLogin() {
		return (UserLogin)eGet(OrderPackage.Literals.ORDER_ITEM__DONT_CANCEL_SET_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDontCancelSetUserLogin(UserLogin newDontCancelSetUserLogin) {
		eSet(OrderPackage.Literals.ORDER_ITEM__DONT_CANCEL_SET_USER_LOGIN, newDontCancelSetUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedDeliveryDate() {
		return (Date)eGet(OrderPackage.Literals.ORDER_ITEM__ESTIMATED_DELIVERY_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedDeliveryDate(Date newEstimatedDeliveryDate) {
		eSet(OrderPackage.Literals.ORDER_ITEM__ESTIMATED_DELIVERY_DATE, newEstimatedDeliveryDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedShipDate() {
		return (Date)eGet(OrderPackage.Literals.ORDER_ITEM__ESTIMATED_SHIP_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedShipDate(Date newEstimatedShipDate) {
		eSet(OrderPackage.Literals.ORDER_ITEM__ESTIMATED_SHIP_DATE, newEstimatedShipDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalId() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM__EXTERNAL_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalId(String newExternalId) {
		eSet(OrderPackage.Literals.ORDER_ITEM__EXTERNAL_ID, newExternalId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsItemGroupPrimary() {
		return (Boolean)eGet(OrderPackage.Literals.ORDER_ITEM__IS_ITEM_GROUP_PRIMARY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsItemGroupPrimary(boolean newIsItemGroupPrimary) {
		eSet(OrderPackage.Literals.ORDER_ITEM__IS_ITEM_GROUP_PRIMARY, newIsItemGroupPrimary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsModifiedPrice() {
		return (Boolean)eGet(OrderPackage.Literals.ORDER_ITEM__IS_MODIFIED_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsModifiedPrice(boolean newIsModifiedPrice) {
		eSet(OrderPackage.Literals.ORDER_ITEM__IS_MODIFIED_PRICE, newIsModifiedPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsPromo() {
		return (Boolean)eGet(OrderPackage.Literals.ORDER_ITEM__IS_PROMO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPromo(boolean newIsPromo) {
		eSet(OrderPackage.Literals.ORDER_ITEM__IS_PROMO, newIsPromo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItem getFromInventoryItemId() {
		return (InventoryItem)eGet(OrderPackage.Literals.ORDER_ITEM__FROM_INVENTORY_ITEM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromInventoryItemId(InventoryItem newFromInventoryItemId) {
		eSet(OrderPackage.Literals.ORDER_ITEM__FROM_INVENTORY_ITEM_ID, newFromInventoryItemId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getItemDescription() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM__ITEM_DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemDescription(String newItemDescription) {
		eSet(OrderPackage.Literals.ORDER_ITEM__ITEM_DESCRIPTION, newItemDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderHeader getOrderId() {
		return (OrderHeader)eGet(OrderPackage.Literals.ORDER_ITEM__ORDER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(OrderHeader newOrderId) {
		eSet(OrderPackage.Literals.ORDER_ITEM__ORDER_ID, newOrderId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemGroupSeqId() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM__ORDER_ITEM_GROUP_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemGroupSeqId(String newOrderItemGroupSeqId) {
		eSet(OrderPackage.Literals.ORDER_ITEM__ORDER_ITEM_GROUP_SEQ_ID, newOrderItemGroupSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemSeqId() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM__ORDER_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemSeqId(String newOrderItemSeqId) {
		eSet(OrderPackage.Literals.ORDER_ITEM__ORDER_ITEM_SEQ_ID, newOrderItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderItemType getOrderItemTypeId() {
		return (OrderItemType)eGet(OrderPackage.Literals.ORDER_ITEM__ORDER_ITEM_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemTypeId(OrderItemType newOrderItemTypeId) {
		eSet(OrderPackage.Literals.ORDER_ITEM__ORDER_ITEM_TYPE_ID, newOrderItemTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccount getOverrideGlAccountId() {
		return (GlAccount)eGet(OrderPackage.Literals.ORDER_ITEM__OVERRIDE_GL_ACCOUNT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverrideGlAccountId(GlAccount newOverrideGlAccountId) {
		eSet(OrderPackage.Literals.ORDER_ITEM__OVERRIDE_GL_ACCOUNT_ID, newOverrideGlAccountId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProdCatalogId() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM__PROD_CATALOG_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProdCatalogId(String newProdCatalogId) {
		eSet(OrderPackage.Literals.ORDER_ITEM__PROD_CATALOG_ID, newProdCatalogId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductCategoryId() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM__PRODUCT_CATEGORY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategoryId(String newProductCategoryId) {
		eSet(OrderPackage.Literals.ORDER_ITEM__PRODUCT_CATEGORY_ID, newProductCategoryId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductFeatureId() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM__PRODUCT_FEATURE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureId(String newProductFeatureId) {
		eSet(OrderPackage.Literals.ORDER_ITEM__PRODUCT_FEATURE_ID, newProductFeatureId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductId() {
		return (Product)eGet(OrderPackage.Literals.ORDER_ITEM__PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		eSet(OrderPackage.Literals.ORDER_ITEM__PRODUCT_ID, newProductId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantity() {
		return (BigDecimal)eGet(OrderPackage.Literals.ORDER_ITEM__QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(BigDecimal newQuantity) {
		eSet(OrderPackage.Literals.ORDER_ITEM__QUANTITY, newQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuoteId() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM__QUOTE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteId(String newQuoteId) {
		eSet(OrderPackage.Literals.ORDER_ITEM__QUOTE_ID, newQuoteId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuoteItemSeqId() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM__QUOTE_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteItemSeqId(String newQuoteItemSeqId) {
		eSet(OrderPackage.Literals.ORDER_ITEM__QUOTE_ITEM_SEQ_ID, newQuoteItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getRecurringFreqUomId() {
		return (Uom)eGet(OrderPackage.Literals.ORDER_ITEM__RECURRING_FREQ_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurringFreqUomId(Uom newRecurringFreqUomId) {
		eSet(OrderPackage.Literals.ORDER_ITEM__RECURRING_FREQ_UOM_ID, newRecurringFreqUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReserveAfterDate() {
		return (Date)eGet(OrderPackage.Literals.ORDER_ITEM__RESERVE_AFTER_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserveAfterDate(Date newReserveAfterDate) {
		eSet(OrderPackage.Literals.ORDER_ITEM__RESERVE_AFTER_DATE, newReserveAfterDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SalesOpportunity getSalesOpportunityId() {
		return (SalesOpportunity)eGet(OrderPackage.Literals.ORDER_ITEM__SALES_OPPORTUNITY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesOpportunityId(SalesOpportunity newSalesOpportunityId) {
		eSet(OrderPackage.Literals.ORDER_ITEM__SALES_OPPORTUNITY_ID, newSalesOpportunityId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getSelectedAmount() {
		return (BigDecimal)eGet(OrderPackage.Literals.ORDER_ITEM__SELECTED_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelectedAmount(BigDecimal newSelectedAmount) {
		eSet(OrderPackage.Literals.ORDER_ITEM__SELECTED_AMOUNT, newSelectedAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getShipAfterDate() {
		return (Date)eGet(OrderPackage.Literals.ORDER_ITEM__SHIP_AFTER_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipAfterDate(Date newShipAfterDate) {
		eSet(OrderPackage.Literals.ORDER_ITEM__SHIP_AFTER_DATE, newShipAfterDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getShipBeforeDate() {
		return (Date)eGet(OrderPackage.Literals.ORDER_ITEM__SHIP_BEFORE_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipBeforeDate(Date newShipBeforeDate) {
		eSet(OrderPackage.Literals.ORDER_ITEM__SHIP_BEFORE_DATE, newShipBeforeDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShoppingListId() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM__SHOPPING_LIST_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShoppingListId(String newShoppingListId) {
		eSet(OrderPackage.Literals.ORDER_ITEM__SHOPPING_LIST_ID, newShoppingListId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShoppingListItemSeqId() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM__SHOPPING_LIST_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShoppingListItemSeqId(String newShoppingListItemSeqId) {
		eSet(OrderPackage.Literals.ORDER_ITEM__SHOPPING_LIST_ITEM_SEQ_ID, newShoppingListItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		return (StatusItem)eGet(OrderPackage.Literals.ORDER_ITEM__STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		eSet(OrderPackage.Literals.ORDER_ITEM__STATUS_ID, newStatusId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubscriptionId() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM__SUBSCRIPTION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionId(String newSubscriptionId) {
		eSet(OrderPackage.Literals.ORDER_ITEM__SUBSCRIPTION_ID, newSubscriptionId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSupplierProductId() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM__SUPPLIER_PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierProductId(String newSupplierProductId) {
		eSet(OrderPackage.Literals.ORDER_ITEM__SUPPLIER_PRODUCT_ID, newSupplierProductId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getSyncStatusId() {
		return (StatusItem)eGet(OrderPackage.Literals.ORDER_ITEM__SYNC_STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSyncStatusId(StatusItem newSyncStatusId) {
		eSet(OrderPackage.Literals.ORDER_ITEM__SYNC_STATUS_ID, newSyncStatusId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getUnitAverageCost() {
		return (BigDecimal)eGet(OrderPackage.Literals.ORDER_ITEM__UNIT_AVERAGE_COST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitAverageCost(BigDecimal newUnitAverageCost) {
		eSet(OrderPackage.Literals.ORDER_ITEM__UNIT_AVERAGE_COST, newUnitAverageCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getUnitListPrice() {
		return (BigDecimal)eGet(OrderPackage.Literals.ORDER_ITEM__UNIT_LIST_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitListPrice(BigDecimal newUnitListPrice) {
		eSet(OrderPackage.Literals.ORDER_ITEM__UNIT_LIST_PRICE, newUnitListPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getUnitPrice() {
		return (BigDecimal)eGet(OrderPackage.Literals.ORDER_ITEM__UNIT_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitPrice(BigDecimal newUnitPrice) {
		eSet(OrderPackage.Literals.ORDER_ITEM__UNIT_PRICE, newUnitPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getUnitRecurringPrice() {
		return (BigDecimal)eGet(OrderPackage.Literals.ORDER_ITEM__UNIT_RECURRING_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitRecurringPrice(BigDecimal newUnitRecurringPrice) {
		eSet(OrderPackage.Literals.ORDER_ITEM__UNIT_RECURRING_PRICE, newUnitRecurringPrice);
	}

} //OrderItemImpl
