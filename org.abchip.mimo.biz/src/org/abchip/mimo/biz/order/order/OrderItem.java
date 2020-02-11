/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.biz.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity;
import org.abchip.mimo.biz.product.inventory.InventoryItem;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.security.login.UserLogin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getAutoCancelDate <em>Auto Cancel Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getBudgetId <em>Budget Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getBudgetItemSeqId <em>Budget Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getCancelBackOrderDate <em>Cancel Back Order Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getCancelQuantity <em>Cancel Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getChangeByUserLoginId <em>Change By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getCorrespondingPoId <em>Corresponding Po Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getDeploymentId <em>Deployment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getDontCancelSetDate <em>Dont Cancel Set Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getDontCancelSetUserLogin <em>Dont Cancel Set User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getEstimatedDeliveryDate <em>Estimated Delivery Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getEstimatedShipDate <em>Estimated Ship Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getExternalId <em>External Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getFromInventoryItemId <em>From Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#isIsItemGroupPrimary <em>Is Item Group Primary</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#isIsModifiedPrice <em>Is Modified Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#isIsPromo <em>Is Promo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getItemDescription <em>Item Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getOrderItemGroupSeqId <em>Order Item Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getOrderItemTypeId <em>Order Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getOverrideGlAccountId <em>Override Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getProdCatalogId <em>Prod Catalog Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getProductFeatureId <em>Product Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getQuoteId <em>Quote Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getQuoteItemSeqId <em>Quote Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getRecurringFreqUomId <em>Recurring Freq Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getReserveAfterDate <em>Reserve After Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getSalesOpportunityId <em>Sales Opportunity Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getSelectedAmount <em>Selected Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getShipAfterDate <em>Ship After Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getShipBeforeDate <em>Ship Before Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getShoppingListId <em>Shopping List Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getShoppingListItemSeqId <em>Shopping List Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getSubscriptionId <em>Subscription Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getSupplierProductId <em>Supplier Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getSyncStatusId <em>Sync Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getUnitAverageCost <em>Unit Average Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getUnitListPrice <em>Unit List Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItem#getUnitRecurringPrice <em>Unit Recurring Price</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem()
 * @model
 * @generated
 */
public interface OrderItem extends BizEntityTyped<OrderItemType> {
	/**
	 * Returns the value of the '<em><b>Auto Cancel Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Cancel Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Cancel Date</em>' attribute.
	 * @see #setAutoCancelDate(Date)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_AutoCancelDate()
	 * @model
	 * @generated
	 */
	Date getAutoCancelDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getAutoCancelDate <em>Auto Cancel Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Cancel Date</em>' attribute.
	 * @see #getAutoCancelDate()
	 * @generated
	 */
	void setAutoCancelDate(Date value);

	/**
	 * Returns the value of the '<em><b>Budget Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Id</em>' attribute.
	 * @see #setBudgetId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_BudgetId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getBudgetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getBudgetId <em>Budget Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Id</em>' attribute.
	 * @see #getBudgetId()
	 * @generated
	 */
	void setBudgetId(String value);

	/**
	 * Returns the value of the '<em><b>Budget Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Item Seq Id</em>' attribute.
	 * @see #setBudgetItemSeqId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_BudgetItemSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getBudgetItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getBudgetItemSeqId <em>Budget Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Item Seq Id</em>' attribute.
	 * @see #getBudgetItemSeqId()
	 * @generated
	 */
	void setBudgetItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Cancel Back Order Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancel Back Order Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Back Order Date</em>' attribute.
	 * @see #setCancelBackOrderDate(Date)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_CancelBackOrderDate()
	 * @model annotation="mimo-ent-slot help='Used to cancel all orders from suppliers when its in past'"
	 * @generated
	 */
	Date getCancelBackOrderDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getCancelBackOrderDate <em>Cancel Back Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Back Order Date</em>' attribute.
	 * @see #getCancelBackOrderDate()
	 * @generated
	 */
	void setCancelBackOrderDate(Date value);

	/**
	 * Returns the value of the '<em><b>Cancel Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancel Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Quantity</em>' attribute.
	 * @see #setCancelQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_CancelQuantity()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getCancelQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getCancelQuantity <em>Cancel Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Quantity</em>' attribute.
	 * @see #getCancelQuantity()
	 * @generated
	 */
	void setCancelQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Change By User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change By User Login Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change By User Login Id</em>' reference.
	 * @see #setChangeByUserLoginId(UserLogin)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_ChangeByUserLoginId()
	 * @model keys="userLoginId"
	 *        annotation="mimo-ent-slot audit='true'"
	 * @generated
	 */
	UserLogin getChangeByUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getChangeByUserLoginId <em>Change By User Login Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change By User Login Id</em>' reference.
	 * @see #getChangeByUserLoginId()
	 * @generated
	 */
	void setChangeByUserLoginId(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_Comments()
	 * @model annotation="mimo-ent-format type='comment' length='255'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Corresponding Po Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corresponding Po Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corresponding Po Id</em>' attribute.
	 * @see #setCorrespondingPoId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_CorrespondingPoId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCorrespondingPoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getCorrespondingPoId <em>Corresponding Po Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corresponding Po Id</em>' attribute.
	 * @see #getCorrespondingPoId()
	 * @generated
	 */
	void setCorrespondingPoId(String value);

	/**
	 * Returns the value of the '<em><b>Deployment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Id</em>' attribute.
	 * @see #setDeploymentId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_DeploymentId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getDeploymentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getDeploymentId <em>Deployment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Id</em>' attribute.
	 * @see #getDeploymentId()
	 * @generated
	 */
	void setDeploymentId(String value);

	/**
	 * Returns the value of the '<em><b>Dont Cancel Set Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dont Cancel Set Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dont Cancel Set Date</em>' attribute.
	 * @see #setDontCancelSetDate(Date)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_DontCancelSetDate()
	 * @model
	 * @generated
	 */
	Date getDontCancelSetDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getDontCancelSetDate <em>Dont Cancel Set Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dont Cancel Set Date</em>' attribute.
	 * @see #getDontCancelSetDate()
	 * @generated
	 */
	void setDontCancelSetDate(Date value);

	/**
	 * Returns the value of the '<em><b>Dont Cancel Set User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dont Cancel Set User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dont Cancel Set User Login</em>' reference.
	 * @see #setDontCancelSetUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_DontCancelSetUserLogin()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getDontCancelSetUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getDontCancelSetUserLogin <em>Dont Cancel Set User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dont Cancel Set User Login</em>' reference.
	 * @see #getDontCancelSetUserLogin()
	 * @generated
	 */
	void setDontCancelSetUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Estimated Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Delivery Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Delivery Date</em>' attribute.
	 * @see #setEstimatedDeliveryDate(Date)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_EstimatedDeliveryDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedDeliveryDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getEstimatedDeliveryDate <em>Estimated Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Delivery Date</em>' attribute.
	 * @see #getEstimatedDeliveryDate()
	 * @generated
	 */
	void setEstimatedDeliveryDate(Date value);

	/**
	 * Returns the value of the '<em><b>Estimated Ship Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Ship Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Ship Date</em>' attribute.
	 * @see #setEstimatedShipDate(Date)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_EstimatedShipDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedShipDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getEstimatedShipDate <em>Estimated Ship Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Ship Date</em>' attribute.
	 * @see #getEstimatedShipDate()
	 * @generated
	 */
	void setEstimatedShipDate(Date value);

	/**
	 * Returns the value of the '<em><b>External Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Id</em>' attribute.
	 * @see #setExternalId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_ExternalId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getExternalId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getExternalId <em>External Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Id</em>' attribute.
	 * @see #getExternalId()
	 * @generated
	 */
	void setExternalId(String value);

	/**
	 * Returns the value of the '<em><b>Is Item Group Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Item Group Primary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Item Group Primary</em>' attribute.
	 * @see #setIsItemGroupPrimary(boolean)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_IsItemGroupPrimary()
	 * @model
	 * @generated
	 */
	boolean isIsItemGroupPrimary();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#isIsItemGroupPrimary <em>Is Item Group Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Item Group Primary</em>' attribute.
	 * @see #isIsItemGroupPrimary()
	 * @generated
	 */
	void setIsItemGroupPrimary(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Modified Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Modified Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Modified Price</em>' attribute.
	 * @see #setIsModifiedPrice(boolean)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_IsModifiedPrice()
	 * @model
	 * @generated
	 */
	boolean isIsModifiedPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#isIsModifiedPrice <em>Is Modified Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Modified Price</em>' attribute.
	 * @see #isIsModifiedPrice()
	 * @generated
	 */
	void setIsModifiedPrice(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Promo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Promo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Promo</em>' attribute.
	 * @see #setIsPromo(boolean)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_IsPromo()
	 * @model
	 * @generated
	 */
	boolean isIsPromo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#isIsPromo <em>Is Promo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Promo</em>' attribute.
	 * @see #isIsPromo()
	 * @generated
	 */
	void setIsPromo(boolean value);

	/**
	 * Returns the value of the '<em><b>From Inventory Item Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Inventory Item Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Inventory Item Id</em>' reference.
	 * @see #setFromInventoryItemId(InventoryItem)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_FromInventoryItemId()
	 * @model keys="inventoryItemId"
	 * @generated
	 */
	InventoryItem getFromInventoryItemId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getFromInventoryItemId <em>From Inventory Item Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Inventory Item Id</em>' reference.
	 * @see #getFromInventoryItemId()
	 * @generated
	 */
	void setFromInventoryItemId(InventoryItem value);

	/**
	 * Returns the value of the '<em><b>Item Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Description</em>' attribute.
	 * @see #setItemDescription(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_ItemDescription()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getItemDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getItemDescription <em>Item Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Description</em>' attribute.
	 * @see #getItemDescription()
	 * @generated
	 */
	void setItemDescription(String value);

	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' reference.
	 * @see #setOrderId(OrderHeader)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_OrderId()
	 * @model keys="orderId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	OrderHeader getOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getOrderId <em>Order Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' reference.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(OrderHeader value);

	/**
	 * Returns the value of the '<em><b>Order Item Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Item Group Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Item Group Seq Id</em>' attribute.
	 * @see #setOrderItemGroupSeqId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_OrderItemGroupSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrderItemGroupSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getOrderItemGroupSeqId <em>Order Item Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Group Seq Id</em>' attribute.
	 * @see #getOrderItemGroupSeqId()
	 * @generated
	 */
	void setOrderItemGroupSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #setOrderItemSeqId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_OrderItemSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getOrderItemSeqId <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #getOrderItemSeqId()
	 * @generated
	 */
	void setOrderItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Order Item Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Item Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Item Type Id</em>' reference.
	 * @see #setOrderItemTypeId(OrderItemType)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_OrderItemTypeId()
	 * @model keys="orderItemTypeId"
	 * @generated
	 */
	OrderItemType getOrderItemTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getOrderItemTypeId <em>Order Item Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Type Id</em>' reference.
	 * @see #getOrderItemTypeId()
	 * @generated
	 */
	void setOrderItemTypeId(OrderItemType value);

	/**
	 * Returns the value of the '<em><b>Override Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Override Gl Account Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override Gl Account Id</em>' reference.
	 * @see #setOverrideGlAccountId(GlAccount)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_OverrideGlAccountId()
	 * @model keys="glAccountId"
	 *        annotation="mimo-ent-slot help='Used to specify the override or actual glAccountId used for the adjustment, avoids problems if configuration changes after initial posting, etc.'"
	 * @generated
	 */
	GlAccount getOverrideGlAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getOverrideGlAccountId <em>Override Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override Gl Account Id</em>' reference.
	 * @see #getOverrideGlAccountId()
	 * @generated
	 */
	void setOverrideGlAccountId(GlAccount value);

	/**
	 * Returns the value of the '<em><b>Prod Catalog Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prod Catalog Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prod Catalog Id</em>' attribute.
	 * @see #setProdCatalogId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_ProdCatalogId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProdCatalogId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getProdCatalogId <em>Prod Catalog Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prod Catalog Id</em>' attribute.
	 * @see #getProdCatalogId()
	 * @generated
	 */
	void setProdCatalogId(String value);

	/**
	 * Returns the value of the '<em><b>Product Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Category Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Category Id</em>' attribute.
	 * @see #setProductCategoryId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_ProductCategoryId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getProductCategoryId <em>Product Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Category Id</em>' attribute.
	 * @see #getProductCategoryId()
	 * @generated
	 */
	void setProductCategoryId(String value);

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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_ProductFeatureId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductFeatureId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getProductFeatureId <em>Product Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature Id</em>' attribute.
	 * @see #getProductFeatureId()
	 * @generated
	 */
	void setProductFeatureId(String value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' reference.
	 * @see #setProductId(Product)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_ProductId()
	 * @model keys="productId"
	 * @generated
	 */
	Product getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getProductId <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' reference.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(Product value);

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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_Quantity()
	 * @model annotation="mimo-ent-slot audit='true'"
	 *        annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Quote Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Id</em>' attribute.
	 * @see #setQuoteId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_QuoteId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getQuoteId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getQuoteId <em>Quote Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Id</em>' attribute.
	 * @see #getQuoteId()
	 * @generated
	 */
	void setQuoteId(String value);

	/**
	 * Returns the value of the '<em><b>Quote Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Item Seq Id</em>' attribute.
	 * @see #setQuoteItemSeqId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_QuoteItemSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getQuoteItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getQuoteItemSeqId <em>Quote Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Item Seq Id</em>' attribute.
	 * @see #getQuoteItemSeqId()
	 * @generated
	 */
	void setQuoteItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Recurring Freq Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recurring Freq Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurring Freq Uom Id</em>' reference.
	 * @see #setRecurringFreqUomId(Uom)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_RecurringFreqUomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getRecurringFreqUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getRecurringFreqUomId <em>Recurring Freq Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurring Freq Uom Id</em>' reference.
	 * @see #getRecurringFreqUomId()
	 * @generated
	 */
	void setRecurringFreqUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Reserve After Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserve After Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserve After Date</em>' attribute.
	 * @see #setReserveAfterDate(Date)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_ReserveAfterDate()
	 * @model
	 * @generated
	 */
	Date getReserveAfterDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getReserveAfterDate <em>Reserve After Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserve After Date</em>' attribute.
	 * @see #getReserveAfterDate()
	 * @generated
	 */
	void setReserveAfterDate(Date value);

	/**
	 * Returns the value of the '<em><b>Sales Opportunity Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Opportunity Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Opportunity Id</em>' reference.
	 * @see #setSalesOpportunityId(SalesOpportunity)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_SalesOpportunityId()
	 * @model keys="salesOpportunityId"
	 * @generated
	 */
	SalesOpportunity getSalesOpportunityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getSalesOpportunityId <em>Sales Opportunity Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Opportunity Id</em>' reference.
	 * @see #getSalesOpportunityId()
	 * @generated
	 */
	void setSalesOpportunityId(SalesOpportunity value);

	/**
	 * Returns the value of the '<em><b>Selected Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Amount</em>' attribute.
	 * @see #setSelectedAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_SelectedAmount()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getSelectedAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getSelectedAmount <em>Selected Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Amount</em>' attribute.
	 * @see #getSelectedAmount()
	 * @generated
	 */
	void setSelectedAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Ship After Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship After Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship After Date</em>' attribute.
	 * @see #setShipAfterDate(Date)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_ShipAfterDate()
	 * @model
	 * @generated
	 */
	Date getShipAfterDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getShipAfterDate <em>Ship After Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship After Date</em>' attribute.
	 * @see #getShipAfterDate()
	 * @generated
	 */
	void setShipAfterDate(Date value);

	/**
	 * Returns the value of the '<em><b>Ship Before Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship Before Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship Before Date</em>' attribute.
	 * @see #setShipBeforeDate(Date)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_ShipBeforeDate()
	 * @model
	 * @generated
	 */
	Date getShipBeforeDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getShipBeforeDate <em>Ship Before Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship Before Date</em>' attribute.
	 * @see #getShipBeforeDate()
	 * @generated
	 */
	void setShipBeforeDate(Date value);

	/**
	 * Returns the value of the '<em><b>Shopping List Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shopping List Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shopping List Id</em>' attribute.
	 * @see #setShoppingListId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_ShoppingListId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getShoppingListId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getShoppingListId <em>Shopping List Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shopping List Id</em>' attribute.
	 * @see #getShoppingListId()
	 * @generated
	 */
	void setShoppingListId(String value);

	/**
	 * Returns the value of the '<em><b>Shopping List Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shopping List Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shopping List Item Seq Id</em>' attribute.
	 * @see #setShoppingListItemSeqId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_ShoppingListItemSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getShoppingListItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getShoppingListItemSeqId <em>Shopping List Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shopping List Item Seq Id</em>' attribute.
	 * @see #getShoppingListItemSeqId()
	 * @generated
	 */
	void setShoppingListItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' reference.
	 * @see #setStatusId(StatusItem)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_StatusId()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getStatusId <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' reference.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Subscription Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscription Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Id</em>' attribute.
	 * @see #setSubscriptionId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_SubscriptionId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSubscriptionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getSubscriptionId <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Id</em>' attribute.
	 * @see #getSubscriptionId()
	 * @generated
	 */
	void setSubscriptionId(String value);

	/**
	 * Returns the value of the '<em><b>Supplier Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier Product Id</em>' attribute.
	 * @see #setSupplierProductId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_SupplierProductId()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getSupplierProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getSupplierProductId <em>Supplier Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier Product Id</em>' attribute.
	 * @see #getSupplierProductId()
	 * @generated
	 */
	void setSupplierProductId(String value);

	/**
	 * Returns the value of the '<em><b>Sync Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sync Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sync Status Id</em>' reference.
	 * @see #setSyncStatusId(StatusItem)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_SyncStatusId()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getSyncStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getSyncStatusId <em>Sync Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync Status Id</em>' reference.
	 * @see #getSyncStatusId()
	 * @generated
	 */
	void setSyncStatusId(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Unit Average Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Average Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Average Cost</em>' attribute.
	 * @see #setUnitAverageCost(BigDecimal)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_UnitAverageCost()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getUnitAverageCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getUnitAverageCost <em>Unit Average Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Average Cost</em>' attribute.
	 * @see #getUnitAverageCost()
	 * @generated
	 */
	void setUnitAverageCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Unit List Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit List Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit List Price</em>' attribute.
	 * @see #setUnitListPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_UnitListPrice()
	 * @model annotation="mimo-ent-format type='currency-precise' precision='18' scale='3'"
	 * @generated
	 */
	BigDecimal getUnitListPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getUnitListPrice <em>Unit List Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit List Price</em>' attribute.
	 * @see #getUnitListPrice()
	 * @generated
	 */
	void setUnitListPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Price</em>' attribute.
	 * @see #setUnitPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_UnitPrice()
	 * @model annotation="mimo-ent-slot audit='true'"
	 *        annotation="mimo-ent-format type='currency-precise' precision='18' scale='3'"
	 * @generated
	 */
	BigDecimal getUnitPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getUnitPrice <em>Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Price</em>' attribute.
	 * @see #getUnitPrice()
	 * @generated
	 */
	void setUnitPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Unit Recurring Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Recurring Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Recurring Price</em>' attribute.
	 * @see #setUnitRecurringPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItem_UnitRecurringPrice()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getUnitRecurringPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItem#getUnitRecurringPrice <em>Unit Recurring Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Recurring Price</em>' attribute.
	 * @see #getUnitRecurringPrice()
	 * @generated
	 */
	void setUnitRecurringPrice(BigDecimal value);

} // OrderItem
