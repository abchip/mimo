/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.shoppinglist.impl;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.order.shoppinglist.ShoppingList;
import org.abchip.mimo.biz.order.shoppinglist.ShoppingListType;
import org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.promo.ProductPromoCode;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.abchip.mimo.biz.service.schedule.RecurrenceInfo;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shopping List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListImpl#getShoppingListId <em>Shopping List Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListImpl#getCarrierPartyId <em>Carrier Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListImpl#getCarrierRoleTypeId <em>Carrier Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListImpl#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListImpl#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListImpl#isIsPublic <em>Is Public</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListImpl#getLastAdminModified <em>Last Admin Modified</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListImpl#getLastOrderedDate <em>Last Ordered Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListImpl#getListName <em>List Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListImpl#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListImpl#getVisitorId <em>Visitor Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListImpl#getParentShoppingListId <em>Parent Shopping List Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListImpl#getShoppingListTypeId <em>Shopping List Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListImpl#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListImpl#getPaymentMethodId <em>Payment Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListImpl#getRecurrenceInfoId <em>Recurrence Info Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListImpl#getProductPromoCodeId <em>Product Promo Code Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListImpl#getShoppingListItems <em>Shopping List Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListImpl#getShoppingListWorkEfforts <em>Shopping List Work Efforts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShoppingListImpl extends BizEntityTypedImpl<ShoppingListType> implements ShoppingList {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The default value of the '{@link #getCarrierPartyId() <em>Carrier Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String CARRIER_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarrierPartyId() <em>Carrier Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierPartyId()
	 * @generated
	 * @ordered
	 */
	protected String carrierPartyId = CARRIER_PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCarrierRoleTypeId() <em>Carrier Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String CARRIER_ROLE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarrierRoleTypeId() <em>Carrier Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected String carrierRoleTypeId = CARRIER_ROLE_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrencyUom() <em>Currency Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUom()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_UOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrencyUom() <em>Currency Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUom()
	 * @generated
	 * @ordered
	 */
	protected String currencyUom = CURRENCY_UOM_EDEFAULT;

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
	 * The default value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected boolean isActive = IS_ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPublic() <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPublic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PUBLIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPublic() <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPublic()
	 * @generated
	 * @ordered
	 */
	protected boolean isPublic = IS_PUBLIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastAdminModified() <em>Last Admin Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastAdminModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_ADMIN_MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastAdminModified() <em>Last Admin Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastAdminModified()
	 * @generated
	 * @ordered
	 */
	protected Date lastAdminModified = LAST_ADMIN_MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastOrderedDate() <em>Last Ordered Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastOrderedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_ORDERED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastOrderedDate() <em>Last Ordered Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastOrderedDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastOrderedDate = LAST_ORDERED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getListName() <em>List Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListName()
	 * @generated
	 * @ordered
	 */
	protected static final String LIST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListName() <em>List Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListName()
	 * @generated
	 * @ordered
	 */
	protected String listName = LIST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getShipmentMethodTypeId() <em>Shipment Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPMENT_METHOD_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipmentMethodTypeId() <em>Shipment Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected String shipmentMethodTypeId = SHIPMENT_METHOD_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisitorId() <em>Visitor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitorId()
	 * @generated
	 * @ordered
	 */
	protected static final String VISITOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisitorId() <em>Visitor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitorId()
	 * @generated
	 * @ordered
	 */
	protected String visitorId = VISITOR_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentShoppingListId() <em>Parent Shopping List Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentShoppingListId()
	 * @generated
	 * @ordered
	 */
	protected ShoppingList parentShoppingListId;

	/**
	 * The cached value of the '{@link #getShoppingListTypeId() <em>Shopping List Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShoppingListTypeId()
	 * @generated
	 * @ordered
	 */
	protected ShoppingListType shoppingListTypeId;

	/**
	 * The cached value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected ProductStore productStoreId;

	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;

	/**
	 * The cached value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected ContactMech contactMechId;

	/**
	 * The cached value of the '{@link #getPaymentMethodId() <em>Payment Method Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethodId()
	 * @generated
	 * @ordered
	 */
	protected PaymentMethod paymentMethodId;

	/**
	 * The cached value of the '{@link #getRecurrenceInfoId() <em>Recurrence Info Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrenceInfoId()
	 * @generated
	 * @ordered
	 */
	protected RecurrenceInfo recurrenceInfoId;

	/**
	 * The cached value of the '{@link #getProductPromoCodeId() <em>Product Promo Code Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoCodeId()
	 * @generated
	 * @ordered
	 */
	protected ProductPromoCode productPromoCodeId;

	/**
	 * The cached value of the '{@link #getShoppingListItems() <em>Shopping List Items</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShoppingListItems()
	 * @generated
	 * @ordered
	 */
	protected EList<String> shoppingListItems;

	/**
	 * The cached value of the '{@link #getShoppingListWorkEfforts() <em>Shopping List Work Efforts</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShoppingListWorkEfforts()
	 * @generated
	 * @ordered
	 */
	protected EList<String> shoppingListWorkEfforts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShoppingListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShoppinglistPackage.Literals.SHOPPING_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCarrierPartyId() {
		return carrierPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierPartyId(String newCarrierPartyId) {
		String oldCarrierPartyId = carrierPartyId;
		carrierPartyId = newCarrierPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST__CARRIER_PARTY_ID, oldCarrierPartyId, carrierPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCarrierRoleTypeId() {
		return carrierRoleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierRoleTypeId(String newCarrierRoleTypeId) {
		String oldCarrierRoleTypeId = carrierRoleTypeId;
		carrierRoleTypeId = newCarrierRoleTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST__CARRIER_ROLE_TYPE_ID, oldCarrierRoleTypeId, carrierRoleTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getContactMechId() {
		if (contactMechId != null && ((EObject)contactMechId).eIsProxy()) {
			InternalEObject oldContactMechId = (InternalEObject)contactMechId;
			contactMechId = (ContactMech)eResolveProxy(oldContactMechId);
			if (contactMechId != oldContactMechId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShoppinglistPackage.SHOPPING_LIST__CONTACT_MECH_ID, oldContactMechId, contactMechId));
			}
		}
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactMech basicGetContactMechId() {
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(ContactMech newContactMechId) {
		ContactMech oldContactMechId = contactMechId;
		contactMechId = newContactMechId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST__CONTACT_MECH_ID, oldContactMechId, contactMechId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrencyUom() {
		return currencyUom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUom(String newCurrencyUom) {
		String oldCurrencyUom = currencyUom;
		currencyUom = newCurrencyUom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST__CURRENCY_UOM, oldCurrencyUom, currencyUom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsActive(boolean newIsActive) {
		boolean oldIsActive = isActive;
		isActive = newIsActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST__IS_ACTIVE, oldIsActive, isActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsPublic() {
		return isPublic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPublic(boolean newIsPublic) {
		boolean oldIsPublic = isPublic;
		isPublic = newIsPublic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST__IS_PUBLIC, oldIsPublic, isPublic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastAdminModified() {
		return lastAdminModified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastAdminModified(Date newLastAdminModified) {
		Date oldLastAdminModified = lastAdminModified;
		lastAdminModified = newLastAdminModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST__LAST_ADMIN_MODIFIED, oldLastAdminModified, lastAdminModified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastOrderedDate() {
		return lastOrderedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastOrderedDate(Date newLastOrderedDate) {
		Date oldLastOrderedDate = lastOrderedDate;
		lastOrderedDate = newLastOrderedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST__LAST_ORDERED_DATE, oldLastOrderedDate, lastOrderedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getListName() {
		return listName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListName(String newListName) {
		String oldListName = listName;
		listName = newListName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST__LIST_NAME, oldListName, listName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShoppingList getParentShoppingListId() {
		if (parentShoppingListId != null && ((EObject)parentShoppingListId).eIsProxy()) {
			InternalEObject oldParentShoppingListId = (InternalEObject)parentShoppingListId;
			parentShoppingListId = (ShoppingList)eResolveProxy(oldParentShoppingListId);
			if (parentShoppingListId != oldParentShoppingListId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShoppinglistPackage.SHOPPING_LIST__PARENT_SHOPPING_LIST_ID, oldParentShoppingListId, parentShoppingListId));
			}
		}
		return parentShoppingListId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShoppingList basicGetParentShoppingListId() {
		return parentShoppingListId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentShoppingListId(ShoppingList newParentShoppingListId) {
		ShoppingList oldParentShoppingListId = parentShoppingListId;
		parentShoppingListId = newParentShoppingListId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST__PARENT_SHOPPING_LIST_ID, oldParentShoppingListId, parentShoppingListId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShoppinglistPackage.SHOPPING_LIST__PARTY_ID, oldPartyId, partyId));
			}
		}
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		Party oldPartyId = partyId;
		partyId = newPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethod getPaymentMethodId() {
		if (paymentMethodId != null && ((EObject)paymentMethodId).eIsProxy()) {
			InternalEObject oldPaymentMethodId = (InternalEObject)paymentMethodId;
			paymentMethodId = (PaymentMethod)eResolveProxy(oldPaymentMethodId);
			if (paymentMethodId != oldPaymentMethodId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShoppinglistPackage.SHOPPING_LIST__PAYMENT_METHOD_ID, oldPaymentMethodId, paymentMethodId));
			}
		}
		return paymentMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMethod basicGetPaymentMethodId() {
		return paymentMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodId(PaymentMethod newPaymentMethodId) {
		PaymentMethod oldPaymentMethodId = paymentMethodId;
		paymentMethodId = newPaymentMethodId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST__PAYMENT_METHOD_ID, oldPaymentMethodId, paymentMethodId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPromoCode getProductPromoCodeId() {
		if (productPromoCodeId != null && ((EObject)productPromoCodeId).eIsProxy()) {
			InternalEObject oldProductPromoCodeId = (InternalEObject)productPromoCodeId;
			productPromoCodeId = (ProductPromoCode)eResolveProxy(oldProductPromoCodeId);
			if (productPromoCodeId != oldProductPromoCodeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShoppinglistPackage.SHOPPING_LIST__PRODUCT_PROMO_CODE_ID, oldProductPromoCodeId, productPromoCodeId));
			}
		}
		return productPromoCodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductPromoCode basicGetProductPromoCodeId() {
		return productPromoCodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoCodeId(ProductPromoCode newProductPromoCodeId) {
		ProductPromoCode oldProductPromoCodeId = productPromoCodeId;
		productPromoCodeId = newProductPromoCodeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST__PRODUCT_PROMO_CODE_ID, oldProductPromoCodeId, productPromoCodeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStore getProductStoreId() {
		if (productStoreId != null && ((EObject)productStoreId).eIsProxy()) {
			InternalEObject oldProductStoreId = (InternalEObject)productStoreId;
			productStoreId = (ProductStore)eResolveProxy(oldProductStoreId);
			if (productStoreId != oldProductStoreId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShoppinglistPackage.SHOPPING_LIST__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
			}
		}
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductStore basicGetProductStoreId() {
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(ProductStore newProductStoreId) {
		ProductStore oldProductStoreId = productStoreId;
		productStoreId = newProductStoreId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecurrenceInfo getRecurrenceInfoId() {
		if (recurrenceInfoId != null && ((EObject)recurrenceInfoId).eIsProxy()) {
			InternalEObject oldRecurrenceInfoId = (InternalEObject)recurrenceInfoId;
			recurrenceInfoId = (RecurrenceInfo)eResolveProxy(oldRecurrenceInfoId);
			if (recurrenceInfoId != oldRecurrenceInfoId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShoppinglistPackage.SHOPPING_LIST__RECURRENCE_INFO_ID, oldRecurrenceInfoId, recurrenceInfoId));
			}
		}
		return recurrenceInfoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecurrenceInfo basicGetRecurrenceInfoId() {
		return recurrenceInfoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurrenceInfoId(RecurrenceInfo newRecurrenceInfoId) {
		RecurrenceInfo oldRecurrenceInfoId = recurrenceInfoId;
		recurrenceInfoId = newRecurrenceInfoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST__RECURRENCE_INFO_ID, oldRecurrenceInfoId, recurrenceInfoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentMethodTypeId() {
		return shipmentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentMethodTypeId(String newShipmentMethodTypeId) {
		String oldShipmentMethodTypeId = shipmentMethodTypeId;
		shipmentMethodTypeId = newShipmentMethodTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST__SHIPMENT_METHOD_TYPE_ID, oldShipmentMethodTypeId, shipmentMethodTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST__SHOPPING_LIST_ID, oldShoppingListId, shoppingListId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShoppingListType getShoppingListTypeId() {
		if (shoppingListTypeId != null && ((EObject)shoppingListTypeId).eIsProxy()) {
			InternalEObject oldShoppingListTypeId = (InternalEObject)shoppingListTypeId;
			shoppingListTypeId = (ShoppingListType)eResolveProxy(oldShoppingListTypeId);
			if (shoppingListTypeId != oldShoppingListTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShoppinglistPackage.SHOPPING_LIST__SHOPPING_LIST_TYPE_ID, oldShoppingListTypeId, shoppingListTypeId));
			}
		}
		return shoppingListTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShoppingListType basicGetShoppingListTypeId() {
		return shoppingListTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShoppingListTypeId(ShoppingListType newShoppingListTypeId) {
		ShoppingListType oldShoppingListTypeId = shoppingListTypeId;
		shoppingListTypeId = newShoppingListTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST__SHOPPING_LIST_TYPE_ID, oldShoppingListTypeId, shoppingListTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVisitorId() {
		return visitorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisitorId(String newVisitorId) {
		String oldVisitorId = visitorId;
		visitorId = newVisitorId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST__VISITOR_ID, oldVisitorId, visitorId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getShoppingListItems() {
		if (shoppingListItems == null) {
			shoppingListItems = new EDataTypeUniqueEList<String>(String.class, this, ShoppinglistPackage.SHOPPING_LIST__SHOPPING_LIST_ITEMS);
		}
		return shoppingListItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getShoppingListWorkEfforts() {
		if (shoppingListWorkEfforts == null) {
			shoppingListWorkEfforts = new EDataTypeUniqueEList<String>(String.class, this, ShoppinglistPackage.SHOPPING_LIST__SHOPPING_LIST_WORK_EFFORTS);
		}
		return shoppingListWorkEfforts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> autoOrderOrderHeaders() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childShoppingLists() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShoppinglistPackage.SHOPPING_LIST__SHOPPING_LIST_ID:
				return getShoppingListId();
			case ShoppinglistPackage.SHOPPING_LIST__CARRIER_PARTY_ID:
				return getCarrierPartyId();
			case ShoppinglistPackage.SHOPPING_LIST__CARRIER_ROLE_TYPE_ID:
				return getCarrierRoleTypeId();
			case ShoppinglistPackage.SHOPPING_LIST__CURRENCY_UOM:
				return getCurrencyUom();
			case ShoppinglistPackage.SHOPPING_LIST__DESCRIPTION:
				return getDescription();
			case ShoppinglistPackage.SHOPPING_LIST__IS_ACTIVE:
				return isIsActive();
			case ShoppinglistPackage.SHOPPING_LIST__IS_PUBLIC:
				return isIsPublic();
			case ShoppinglistPackage.SHOPPING_LIST__LAST_ADMIN_MODIFIED:
				return getLastAdminModified();
			case ShoppinglistPackage.SHOPPING_LIST__LAST_ORDERED_DATE:
				return getLastOrderedDate();
			case ShoppinglistPackage.SHOPPING_LIST__LIST_NAME:
				return getListName();
			case ShoppinglistPackage.SHOPPING_LIST__SHIPMENT_METHOD_TYPE_ID:
				return getShipmentMethodTypeId();
			case ShoppinglistPackage.SHOPPING_LIST__VISITOR_ID:
				return getVisitorId();
			case ShoppinglistPackage.SHOPPING_LIST__PARENT_SHOPPING_LIST_ID:
				if (resolve) return getParentShoppingListId();
				return basicGetParentShoppingListId();
			case ShoppinglistPackage.SHOPPING_LIST__SHOPPING_LIST_TYPE_ID:
				if (resolve) return getShoppingListTypeId();
				return basicGetShoppingListTypeId();
			case ShoppinglistPackage.SHOPPING_LIST__PRODUCT_STORE_ID:
				if (resolve) return getProductStoreId();
				return basicGetProductStoreId();
			case ShoppinglistPackage.SHOPPING_LIST__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case ShoppinglistPackage.SHOPPING_LIST__CONTACT_MECH_ID:
				if (resolve) return getContactMechId();
				return basicGetContactMechId();
			case ShoppinglistPackage.SHOPPING_LIST__PAYMENT_METHOD_ID:
				if (resolve) return getPaymentMethodId();
				return basicGetPaymentMethodId();
			case ShoppinglistPackage.SHOPPING_LIST__RECURRENCE_INFO_ID:
				if (resolve) return getRecurrenceInfoId();
				return basicGetRecurrenceInfoId();
			case ShoppinglistPackage.SHOPPING_LIST__PRODUCT_PROMO_CODE_ID:
				if (resolve) return getProductPromoCodeId();
				return basicGetProductPromoCodeId();
			case ShoppinglistPackage.SHOPPING_LIST__SHOPPING_LIST_ITEMS:
				return getShoppingListItems();
			case ShoppinglistPackage.SHOPPING_LIST__SHOPPING_LIST_WORK_EFFORTS:
				return getShoppingListWorkEfforts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ShoppinglistPackage.SHOPPING_LIST__SHOPPING_LIST_ID:
				setShoppingListId((String)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__CARRIER_PARTY_ID:
				setCarrierPartyId((String)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__CARRIER_ROLE_TYPE_ID:
				setCarrierRoleTypeId((String)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__CURRENCY_UOM:
				setCurrencyUom((String)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__IS_ACTIVE:
				setIsActive((Boolean)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__IS_PUBLIC:
				setIsPublic((Boolean)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__LAST_ADMIN_MODIFIED:
				setLastAdminModified((Date)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__LAST_ORDERED_DATE:
				setLastOrderedDate((Date)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__LIST_NAME:
				setListName((String)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__SHIPMENT_METHOD_TYPE_ID:
				setShipmentMethodTypeId((String)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__VISITOR_ID:
				setVisitorId((String)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__PARENT_SHOPPING_LIST_ID:
				setParentShoppingListId((ShoppingList)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__SHOPPING_LIST_TYPE_ID:
				setShoppingListTypeId((ShoppingListType)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__CONTACT_MECH_ID:
				setContactMechId((ContactMech)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__PAYMENT_METHOD_ID:
				setPaymentMethodId((PaymentMethod)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__RECURRENCE_INFO_ID:
				setRecurrenceInfoId((RecurrenceInfo)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__PRODUCT_PROMO_CODE_ID:
				setProductPromoCodeId((ProductPromoCode)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__SHOPPING_LIST_ITEMS:
				getShoppingListItems().clear();
				getShoppingListItems().addAll((Collection<? extends String>)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__SHOPPING_LIST_WORK_EFFORTS:
				getShoppingListWorkEfforts().clear();
				getShoppingListWorkEfforts().addAll((Collection<? extends String>)newValue);
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
			case ShoppinglistPackage.SHOPPING_LIST__SHOPPING_LIST_ID:
				setShoppingListId(SHOPPING_LIST_ID_EDEFAULT);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__CARRIER_PARTY_ID:
				setCarrierPartyId(CARRIER_PARTY_ID_EDEFAULT);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__CARRIER_ROLE_TYPE_ID:
				setCarrierRoleTypeId(CARRIER_ROLE_TYPE_ID_EDEFAULT);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__CURRENCY_UOM:
				setCurrencyUom(CURRENCY_UOM_EDEFAULT);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__IS_PUBLIC:
				setIsPublic(IS_PUBLIC_EDEFAULT);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__LAST_ADMIN_MODIFIED:
				setLastAdminModified(LAST_ADMIN_MODIFIED_EDEFAULT);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__LAST_ORDERED_DATE:
				setLastOrderedDate(LAST_ORDERED_DATE_EDEFAULT);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__LIST_NAME:
				setListName(LIST_NAME_EDEFAULT);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__SHIPMENT_METHOD_TYPE_ID:
				setShipmentMethodTypeId(SHIPMENT_METHOD_TYPE_ID_EDEFAULT);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__VISITOR_ID:
				setVisitorId(VISITOR_ID_EDEFAULT);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__PARENT_SHOPPING_LIST_ID:
				setParentShoppingListId((ShoppingList)null);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__SHOPPING_LIST_TYPE_ID:
				setShoppingListTypeId((ShoppingListType)null);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)null);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__PARTY_ID:
				setPartyId((Party)null);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__CONTACT_MECH_ID:
				setContactMechId((ContactMech)null);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__PAYMENT_METHOD_ID:
				setPaymentMethodId((PaymentMethod)null);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__RECURRENCE_INFO_ID:
				setRecurrenceInfoId((RecurrenceInfo)null);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__PRODUCT_PROMO_CODE_ID:
				setProductPromoCodeId((ProductPromoCode)null);
				return;
			case ShoppinglistPackage.SHOPPING_LIST__SHOPPING_LIST_ITEMS:
				getShoppingListItems().clear();
				return;
			case ShoppinglistPackage.SHOPPING_LIST__SHOPPING_LIST_WORK_EFFORTS:
				getShoppingListWorkEfforts().clear();
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
			case ShoppinglistPackage.SHOPPING_LIST__SHOPPING_LIST_ID:
				return SHOPPING_LIST_ID_EDEFAULT == null ? shoppingListId != null : !SHOPPING_LIST_ID_EDEFAULT.equals(shoppingListId);
			case ShoppinglistPackage.SHOPPING_LIST__CARRIER_PARTY_ID:
				return CARRIER_PARTY_ID_EDEFAULT == null ? carrierPartyId != null : !CARRIER_PARTY_ID_EDEFAULT.equals(carrierPartyId);
			case ShoppinglistPackage.SHOPPING_LIST__CARRIER_ROLE_TYPE_ID:
				return CARRIER_ROLE_TYPE_ID_EDEFAULT == null ? carrierRoleTypeId != null : !CARRIER_ROLE_TYPE_ID_EDEFAULT.equals(carrierRoleTypeId);
			case ShoppinglistPackage.SHOPPING_LIST__CURRENCY_UOM:
				return CURRENCY_UOM_EDEFAULT == null ? currencyUom != null : !CURRENCY_UOM_EDEFAULT.equals(currencyUom);
			case ShoppinglistPackage.SHOPPING_LIST__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ShoppinglistPackage.SHOPPING_LIST__IS_ACTIVE:
				return isActive != IS_ACTIVE_EDEFAULT;
			case ShoppinglistPackage.SHOPPING_LIST__IS_PUBLIC:
				return isPublic != IS_PUBLIC_EDEFAULT;
			case ShoppinglistPackage.SHOPPING_LIST__LAST_ADMIN_MODIFIED:
				return LAST_ADMIN_MODIFIED_EDEFAULT == null ? lastAdminModified != null : !LAST_ADMIN_MODIFIED_EDEFAULT.equals(lastAdminModified);
			case ShoppinglistPackage.SHOPPING_LIST__LAST_ORDERED_DATE:
				return LAST_ORDERED_DATE_EDEFAULT == null ? lastOrderedDate != null : !LAST_ORDERED_DATE_EDEFAULT.equals(lastOrderedDate);
			case ShoppinglistPackage.SHOPPING_LIST__LIST_NAME:
				return LIST_NAME_EDEFAULT == null ? listName != null : !LIST_NAME_EDEFAULT.equals(listName);
			case ShoppinglistPackage.SHOPPING_LIST__SHIPMENT_METHOD_TYPE_ID:
				return SHIPMENT_METHOD_TYPE_ID_EDEFAULT == null ? shipmentMethodTypeId != null : !SHIPMENT_METHOD_TYPE_ID_EDEFAULT.equals(shipmentMethodTypeId);
			case ShoppinglistPackage.SHOPPING_LIST__VISITOR_ID:
				return VISITOR_ID_EDEFAULT == null ? visitorId != null : !VISITOR_ID_EDEFAULT.equals(visitorId);
			case ShoppinglistPackage.SHOPPING_LIST__PARENT_SHOPPING_LIST_ID:
				return parentShoppingListId != null;
			case ShoppinglistPackage.SHOPPING_LIST__SHOPPING_LIST_TYPE_ID:
				return shoppingListTypeId != null;
			case ShoppinglistPackage.SHOPPING_LIST__PRODUCT_STORE_ID:
				return productStoreId != null;
			case ShoppinglistPackage.SHOPPING_LIST__PARTY_ID:
				return partyId != null;
			case ShoppinglistPackage.SHOPPING_LIST__CONTACT_MECH_ID:
				return contactMechId != null;
			case ShoppinglistPackage.SHOPPING_LIST__PAYMENT_METHOD_ID:
				return paymentMethodId != null;
			case ShoppinglistPackage.SHOPPING_LIST__RECURRENCE_INFO_ID:
				return recurrenceInfoId != null;
			case ShoppinglistPackage.SHOPPING_LIST__PRODUCT_PROMO_CODE_ID:
				return productPromoCodeId != null;
			case ShoppinglistPackage.SHOPPING_LIST__SHOPPING_LIST_ITEMS:
				return shoppingListItems != null && !shoppingListItems.isEmpty();
			case ShoppinglistPackage.SHOPPING_LIST__SHOPPING_LIST_WORK_EFFORTS:
				return shoppingListWorkEfforts != null && !shoppingListWorkEfforts.isEmpty();
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
		result.append(" (shoppingListId: ");
		result.append(shoppingListId);
		result.append(", carrierPartyId: ");
		result.append(carrierPartyId);
		result.append(", carrierRoleTypeId: ");
		result.append(carrierRoleTypeId);
		result.append(", currencyUom: ");
		result.append(currencyUom);
		result.append(", description: ");
		result.append(description);
		result.append(", isActive: ");
		result.append(isActive);
		result.append(", isPublic: ");
		result.append(isPublic);
		result.append(", lastAdminModified: ");
		result.append(lastAdminModified);
		result.append(", lastOrderedDate: ");
		result.append(lastOrderedDate);
		result.append(", listName: ");
		result.append(listName);
		result.append(", shipmentMethodTypeId: ");
		result.append(shipmentMethodTypeId);
		result.append(", visitorId: ");
		result.append(visitorId);
		result.append(", shoppingListItems: ");
		result.append(shoppingListItems);
		result.append(", shoppingListWorkEfforts: ");
		result.append(shoppingListWorkEfforts);
		result.append(')');
		return result.toString();
	}

} //ShoppingListImpl
