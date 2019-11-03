/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.shoppinglist;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shopping List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getShoppingListId <em>Shopping List Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getCarrierPartyId <em>Carrier Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getCarrierRoleTypeId <em>Carrier Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#isIsPublic <em>Is Public</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getLastAdminModified <em>Last Admin Modified</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getLastOrderedDate <em>Last Ordered Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getListName <em>List Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getParentShoppingListId <em>Parent Shopping List Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getPaymentMethodId <em>Payment Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getProductPromoCodeId <em>Product Promo Code Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getRecurrenceInfoId <em>Recurrence Info Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getShoppingListTypeId <em>Shopping List Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getVisitorId <em>Visitor Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getShoppingListItems <em>Shopping List Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getShoppingListWorkEfforts <em>Shopping List Work Efforts</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingList()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface ShoppingList extends BizEntityTyped<ShoppingListType> {
	/**
	 * Returns the value of the '<em><b>Carrier Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carrier Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Party Id</em>' attribute.
	 * @see #setCarrierPartyId(String)
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingList_CarrierPartyId()
	 * @model
	 * @generated
	 */
	String getCarrierPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getCarrierPartyId <em>Carrier Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Party Id</em>' attribute.
	 * @see #getCarrierPartyId()
	 * @generated
	 */
	void setCarrierPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Carrier Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carrier Role Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Role Type Id</em>' attribute.
	 * @see #setCarrierRoleTypeId(String)
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingList_CarrierRoleTypeId()
	 * @model
	 * @generated
	 */
	String getCarrierRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getCarrierRoleTypeId <em>Carrier Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Role Type Id</em>' attribute.
	 * @see #getCarrierRoleTypeId()
	 * @generated
	 */
	void setCarrierRoleTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Contact Mech Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Id</em>' attribute.
	 * @see #setContactMechId(String)
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingList_ContactMechId()
	 * @model annotation="mimo-ent-domain frame='ContactMech'"
	 * @generated
	 */
	String getContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getContactMechId <em>Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Id</em>' attribute.
	 * @see #getContactMechId()
	 * @generated
	 */
	void setContactMechId(String value);

	/**
	 * Returns the value of the '<em><b>Currency Uom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Uom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom</em>' attribute.
	 * @see #setCurrencyUom(String)
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingList_CurrencyUom()
	 * @model
	 * @generated
	 */
	String getCurrencyUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getCurrencyUom <em>Currency Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom</em>' attribute.
	 * @see #getCurrencyUom()
	 * @generated
	 */
	void setCurrencyUom(String value);

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
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingList_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(boolean)
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingList_IsActive()
	 * @model
	 * @generated
	 */
	boolean isIsActive();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#isIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #isIsActive()
	 * @generated
	 */
	void setIsActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Public</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Public</em>' attribute.
	 * @see #setIsPublic(boolean)
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingList_IsPublic()
	 * @model
	 * @generated
	 */
	boolean isIsPublic();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#isIsPublic <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Public</em>' attribute.
	 * @see #isIsPublic()
	 * @generated
	 */
	void setIsPublic(boolean value);

	/**
	 * Returns the value of the '<em><b>Last Admin Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Admin Modified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Admin Modified</em>' attribute.
	 * @see #setLastAdminModified(Date)
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingList_LastAdminModified()
	 * @model
	 * @generated
	 */
	Date getLastAdminModified();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getLastAdminModified <em>Last Admin Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Admin Modified</em>' attribute.
	 * @see #getLastAdminModified()
	 * @generated
	 */
	void setLastAdminModified(Date value);

	/**
	 * Returns the value of the '<em><b>Last Ordered Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Ordered Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Ordered Date</em>' attribute.
	 * @see #setLastOrderedDate(Date)
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingList_LastOrderedDate()
	 * @model
	 * @generated
	 */
	Date getLastOrderedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getLastOrderedDate <em>Last Ordered Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Ordered Date</em>' attribute.
	 * @see #getLastOrderedDate()
	 * @generated
	 */
	void setLastOrderedDate(Date value);

	/**
	 * Returns the value of the '<em><b>List Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Name</em>' attribute.
	 * @see #setListName(String)
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingList_ListName()
	 * @model
	 * @generated
	 */
	String getListName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getListName <em>List Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Name</em>' attribute.
	 * @see #getListName()
	 * @generated
	 */
	void setListName(String value);

	/**
	 * Returns the value of the '<em><b>Parent Shopping List Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Shopping List Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Shopping List Id</em>' attribute.
	 * @see #setParentShoppingListId(String)
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingList_ParentShoppingListId()
	 * @model annotation="mimo-ent-domain frame='ShoppingList'"
	 * @generated
	 */
	String getParentShoppingListId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getParentShoppingListId <em>Parent Shopping List Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Shopping List Id</em>' attribute.
	 * @see #getParentShoppingListId()
	 * @generated
	 */
	void setParentShoppingListId(String value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingList_PartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Payment Method Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Method Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method Id</em>' attribute.
	 * @see #setPaymentMethodId(String)
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingList_PaymentMethodId()
	 * @model annotation="mimo-ent-domain frame='PaymentMethod'"
	 * @generated
	 */
	String getPaymentMethodId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getPaymentMethodId <em>Payment Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method Id</em>' attribute.
	 * @see #getPaymentMethodId()
	 * @generated
	 */
	void setPaymentMethodId(String value);

	/**
	 * Returns the value of the '<em><b>Product Promo Code Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Promo Code Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Code Id</em>' attribute.
	 * @see #setProductPromoCodeId(String)
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingList_ProductPromoCodeId()
	 * @model annotation="mimo-ent-domain frame='ProductPromoCode'"
	 * @generated
	 */
	String getProductPromoCodeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getProductPromoCodeId <em>Product Promo Code Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Code Id</em>' attribute.
	 * @see #getProductPromoCodeId()
	 * @generated
	 */
	void setProductPromoCodeId(String value);

	/**
	 * Returns the value of the '<em><b>Product Store Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' attribute.
	 * @see #setProductStoreId(String)
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingList_ProductStoreId()
	 * @model annotation="mimo-ent-domain frame='ProductStore'"
	 * @generated
	 */
	String getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getProductStoreId <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' attribute.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(String value);

	/**
	 * Returns the value of the '<em><b>Recurrence Info Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recurrence Info Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurrence Info Id</em>' attribute.
	 * @see #setRecurrenceInfoId(String)
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingList_RecurrenceInfoId()
	 * @model annotation="mimo-ent-domain frame='RecurrenceInfo'"
	 * @generated
	 */
	String getRecurrenceInfoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getRecurrenceInfoId <em>Recurrence Info Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrence Info Id</em>' attribute.
	 * @see #getRecurrenceInfoId()
	 * @generated
	 */
	void setRecurrenceInfoId(String value);

	/**
	 * Returns the value of the '<em><b>Shipment Method Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Method Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Method Type Id</em>' attribute.
	 * @see #setShipmentMethodTypeId(String)
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingList_ShipmentMethodTypeId()
	 * @model
	 * @generated
	 */
	String getShipmentMethodTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Method Type Id</em>' attribute.
	 * @see #getShipmentMethodTypeId()
	 * @generated
	 */
	void setShipmentMethodTypeId(String value);

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
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingList_ShoppingListId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getShoppingListId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getShoppingListId <em>Shopping List Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shopping List Id</em>' attribute.
	 * @see #getShoppingListId()
	 * @generated
	 */
	void setShoppingListId(String value);

	/**
	 * Returns the value of the '<em><b>Shopping List Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shopping List Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shopping List Type Id</em>' attribute.
	 * @see #setShoppingListTypeId(String)
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingList_ShoppingListTypeId()
	 * @model annotation="mimo-ent-domain frame='ShoppingListType'"
	 * @generated
	 */
	String getShoppingListTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getShoppingListTypeId <em>Shopping List Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shopping List Type Id</em>' attribute.
	 * @see #getShoppingListTypeId()
	 * @generated
	 */
	void setShoppingListTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Visitor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visitor Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visitor Id</em>' attribute.
	 * @see #setVisitorId(String)
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingList_VisitorId()
	 * @model
	 * @generated
	 */
	String getVisitorId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingList#getVisitorId <em>Visitor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visitor Id</em>' attribute.
	 * @see #getVisitorId()
	 * @generated
	 */
	void setVisitorId(String value);

	/**
	 * Returns the value of the '<em><b>Shopping List Items</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shopping List Items</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shopping List Items</em>' attribute list.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingList_ShoppingListItems()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShoppingListItem'"
	 * @generated
	 */
	List<String> getShoppingListItems();

	/**
	 * Returns the value of the '<em><b>Shopping List Work Efforts</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shopping List Work Efforts</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shopping List Work Efforts</em>' attribute list.
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingList_ShoppingListWorkEfforts()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShoppingListWorkEffort'"
	 * @generated
	 */
	List<String> getShoppingListWorkEfforts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderHeader' route='autoOrderShoppingListId'"
	 * @generated
	 */
	List<String> autoOrderOrderHeaders();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShoppingList' route='parentShoppingListId'"
	 * @generated
	 */
	List<String> childShoppingLists();

} // ShoppingList
