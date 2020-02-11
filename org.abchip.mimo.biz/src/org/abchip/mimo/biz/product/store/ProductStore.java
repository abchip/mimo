/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store;

import java.util.List;
import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.passport.OAuth2GitHub;
import org.abchip.mimo.biz.passport.OAuth2Google;
import org.abchip.mimo.biz.passport.OAuth2LinkedIn;
import org.abchip.mimo.biz.product.facility.Facility;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isAddToCartRemoveIncompat <em>Add To Cart Remove Incompat</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isAddToCartReplaceUpsell <em>Add To Cart Replace Upsell</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isAllowComment <em>Allow Comment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isAllowPassword <em>Allow Password</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getAuthDeclinedMessage <em>Auth Declined Message</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getAuthErrorMessage <em>Auth Error Message</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getAuthFraudMessage <em>Auth Fraud Message</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isAutoApproveInvoice <em>Auto Approve Invoice</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isAutoApproveOrder <em>Auto Approve Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isAutoApproveReviews <em>Auto Approve Reviews</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isAutoInvoiceDigitalItems <em>Auto Invoice Digital Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isAutoOrderCcTryExp <em>Auto Order Cc Try Exp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getAutoOrderCcTryLaterMax <em>Auto Order Cc Try Later Max</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isAutoOrderCcTryLaterNsf <em>Auto Order Cc Try Later Nsf</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isAutoOrderCcTryOtherCards <em>Auto Order Cc Try Other Cards</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isAutoSaveCart <em>Auto Save Cart</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isBalanceResOnOrderCreation <em>Balance Res On Order Creation</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isCheckGcBalance <em>Check Gc Balance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isCheckInventory <em>Check Inventory</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getCompanyName <em>Company Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getDaysToCancelNonPay <em>Days To Cancel Non Pay</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getDefaultCurrencyUomId <em>Default Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getDefaultLocaleString <em>Default Locale String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getDefaultPassword <em>Default Password</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getDefaultSalesChannelEnumId <em>Default Sales Channel Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getDefaultTimeZoneString <em>Default Time Zone String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getDigProdUploadCategoryId <em>Dig Prod Upload Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getDigitalItemApprovedStatus <em>Digital Item Approved Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isEnableAutoSuggestionList <em>Enable Auto Suggestion List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isEnableDigProdUpload <em>Enable Dig Prod Upload</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isExplodeOrderItems <em>Explode Order Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getHeaderApprovedStatus <em>Header Approved Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getHeaderCancelStatus <em>Header Cancel Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getHeaderDeclinedStatus <em>Header Declined Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getInventoryFacilityId <em>Inventory Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isIsDemoStore <em>Is Demo Store</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isIsImmediatelyFulfilled <em>Is Immediately Fulfilled</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getItemApprovedStatus <em>Item Approved Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getItemCancelStatus <em>Item Cancel Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getItemDeclinedStatus <em>Item Declined Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isManagedByLot <em>Managed By Lot</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isManualAuthIsCapture <em>Manual Auth Is Capture</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getOAuth2GitHubs <em>OAuth2 Git Hubs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getOAuth2Googles <em>OAuth2 Googles</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getOAuth2LinkedIns <em>OAuth2 Linked Ins</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getOldHeaderLogo <em>Old Header Logo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getOldHeaderMiddleBackground <em>Old Header Middle Background</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getOldHeaderRightBackground <em>Old Header Right Background</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getOldStyleSheet <em>Old Style Sheet</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isOneInventoryFacility <em>One Inventory Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isOrderDecimalQuantity <em>Order Decimal Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getOrderNumberPrefix <em>Order Number Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getPayToPartyId <em>Pay To Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getPrimaryStoreGroupId <em>Primary Store Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isProdSearchExcludeVariants <em>Prod Search Exclude Variants</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getProductStoreEmailSettings <em>Product Store Email Settings</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getProductStoreFinActSettings <em>Product Store Fin Act Settings</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isProrateShipping <em>Prorate Shipping</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isProrateTaxes <em>Prorate Taxes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isReqReturnInventoryReceive <em>Req Return Inventory Receive</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isReqShipAddrForDigItems <em>Req Ship Addr For Dig Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isRequireCustomerRole <em>Require Customer Role</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isRequireInventory <em>Require Inventory</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getRequirementMethodEnumId <em>Requirement Method Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isReserveInventory <em>Reserve Inventory</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getReserveOrderEnumId <em>Reserve Order Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isRetryFailedAuths <em>Retry Failed Auths</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isSelectPaymentTypePerItem <em>Select Payment Type Per Item</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isSetOwnerUponIssuance <em>Set Owner Upon Issuance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isShipIfCaptureFails <em>Ship If Capture Fails</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isShowCheckoutGiftOptions <em>Show Checkout Gift Options</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isShowOutOfStockProducts <em>Show Out Of Stock Products</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isShowPricesWithVatTax <em>Show Prices With Vat Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isShowTaxIsExempt <em>Show Tax Is Exempt</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isSplitPayPrefPerShpGrp <em>Split Pay Pref Per Shp Grp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getStoreCreditAccountEnumId <em>Store Credit Account Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getStoreCreditValidDays <em>Store Credit Valid Days</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getStoreName <em>Store Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getTitle <em>Title</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isUsePrimaryEmailUsername <em>Use Primary Email Username</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getVatTaxAuthGeoId <em>Vat Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getVatTaxAuthPartyId <em>Vat Tax Auth Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#isViewCartOnAdd <em>View Cart On Add</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getVisualThemeId <em>Visual Theme Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductStore extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Auth Declined Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth Declined Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth Declined Message</em>' attribute.
	 * @see #setAuthDeclinedMessage(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_AuthDeclinedMessage()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getAuthDeclinedMessage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getAuthDeclinedMessage <em>Auth Declined Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Declined Message</em>' attribute.
	 * @see #getAuthDeclinedMessage()
	 * @generated
	 */
	void setAuthDeclinedMessage(String value);

	/**
	 * Returns the value of the '<em><b>Auth Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth Error Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth Error Message</em>' attribute.
	 * @see #setAuthErrorMessage(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_AuthErrorMessage()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getAuthErrorMessage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getAuthErrorMessage <em>Auth Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Error Message</em>' attribute.
	 * @see #getAuthErrorMessage()
	 * @generated
	 */
	void setAuthErrorMessage(String value);

	/**
	 * Returns the value of the '<em><b>Auth Fraud Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth Fraud Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth Fraud Message</em>' attribute.
	 * @see #setAuthFraudMessage(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_AuthFraudMessage()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getAuthFraudMessage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getAuthFraudMessage <em>Auth Fraud Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Fraud Message</em>' attribute.
	 * @see #getAuthFraudMessage()
	 * @generated
	 */
	void setAuthFraudMessage(String value);

	/**
	 * Returns the value of the '<em><b>Auto Approve Invoice</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Approve Invoice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Approve Invoice</em>' attribute.
	 * @see #setAutoApproveInvoice(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_AutoApproveInvoice()
	 * @model default="true" required="true"
	 *        annotation="mimo-ent-slot help='If Y or empty, sales invoices created from orders will be marked ready.'"
	 * @generated
	 */
	boolean isAutoApproveInvoice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isAutoApproveInvoice <em>Auto Approve Invoice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Approve Invoice</em>' attribute.
	 * @see #isAutoApproveInvoice()
	 * @generated
	 */
	void setAutoApproveInvoice(boolean value);

	/**
	 * Returns the value of the '<em><b>Auto Approve Order</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Approve Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Approve Order</em>' attribute.
	 * @see #setAutoApproveOrder(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_AutoApproveOrder()
	 * @model default="true" required="true"
	 *        annotation="mimo-ent-slot help='If N, orders will not be automatically approved when payment is authorized.'"
	 * @generated
	 */
	boolean isAutoApproveOrder();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isAutoApproveOrder <em>Auto Approve Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Approve Order</em>' attribute.
	 * @see #isAutoApproveOrder()
	 * @generated
	 */
	void setAutoApproveOrder(boolean value);

	/**
	 * Returns the value of the '<em><b>Auto Approve Reviews</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Approve Reviews</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Approve Reviews</em>' attribute.
	 * @see #setAutoApproveReviews(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_AutoApproveReviews()
	 * @model required="true"
	 * @generated
	 */
	boolean isAutoApproveReviews();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isAutoApproveReviews <em>Auto Approve Reviews</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Approve Reviews</em>' attribute.
	 * @see #isAutoApproveReviews()
	 * @generated
	 */
	void setAutoApproveReviews(boolean value);

	/**
	 * Returns the value of the '<em><b>Auto Invoice Digital Items</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Invoice Digital Items</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Invoice Digital Items</em>' attribute.
	 * @see #setAutoInvoiceDigitalItems(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_AutoInvoiceDigitalItems()
	 * @model default="true" required="true"
	 *        annotation="mimo-ent-slot help='Default Y. Invoice digital items when order is placed rather than waiting for completing order items (though shipment/fulfillment).'"
	 * @generated
	 */
	boolean isAutoInvoiceDigitalItems();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isAutoInvoiceDigitalItems <em>Auto Invoice Digital Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Invoice Digital Items</em>' attribute.
	 * @see #isAutoInvoiceDigitalItems()
	 * @generated
	 */
	void setAutoInvoiceDigitalItems(boolean value);

	/**
	 * Returns the value of the '<em><b>Auto Order Cc Try Exp</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Order Cc Try Exp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Order Cc Try Exp</em>' attribute.
	 * @see #setAutoOrderCcTryExp(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_AutoOrderCcTryExp()
	 * @model default="true" required="true"
	 *        annotation="mimo-ent-slot help='For auto-orders try other Credit Card expiration dates (if date is wrong or general failure where type not known)?'"
	 * @generated
	 */
	boolean isAutoOrderCcTryExp();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isAutoOrderCcTryExp <em>Auto Order Cc Try Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Order Cc Try Exp</em>' attribute.
	 * @see #isAutoOrderCcTryExp()
	 * @generated
	 */
	void setAutoOrderCcTryExp(boolean value);

	/**
	 * Returns the value of the '<em><b>Auto Order Cc Try Later Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Order Cc Try Later Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Order Cc Try Later Max</em>' attribute.
	 * @see #setAutoOrderCcTryLaterMax(long)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_AutoOrderCcTryLaterMax()
	 * @model annotation="mimo-ent-slot help='For auto-orders if Credit Cards fails for NSF try again how many times?'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getAutoOrderCcTryLaterMax();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getAutoOrderCcTryLaterMax <em>Auto Order Cc Try Later Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Order Cc Try Later Max</em>' attribute.
	 * @see #getAutoOrderCcTryLaterMax()
	 * @generated
	 */
	void setAutoOrderCcTryLaterMax(long value);

	/**
	 * Returns the value of the '<em><b>Auto Order Cc Try Later Nsf</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Order Cc Try Later Nsf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Order Cc Try Later Nsf</em>' attribute.
	 * @see #setAutoOrderCcTryLaterNsf(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_AutoOrderCcTryLaterNsf()
	 * @model default="true" required="true"
	 *        annotation="mimo-ent-slot help='For auto-orders if Credit Cards fails for NSF (Not Sufficient Funds) try again later?'"
	 * @generated
	 */
	boolean isAutoOrderCcTryLaterNsf();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isAutoOrderCcTryLaterNsf <em>Auto Order Cc Try Later Nsf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Order Cc Try Later Nsf</em>' attribute.
	 * @see #isAutoOrderCcTryLaterNsf()
	 * @generated
	 */
	void setAutoOrderCcTryLaterNsf(boolean value);

	/**
	 * Returns the value of the '<em><b>Auto Order Cc Try Other Cards</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Order Cc Try Other Cards</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Order Cc Try Other Cards</em>' attribute.
	 * @see #setAutoOrderCcTryOtherCards(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_AutoOrderCcTryOtherCards()
	 * @model default="true" required="true"
	 *        annotation="mimo-ent-slot help='For auto-orders try other Credit Cards for the customer?'"
	 * @generated
	 */
	boolean isAutoOrderCcTryOtherCards();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isAutoOrderCcTryOtherCards <em>Auto Order Cc Try Other Cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Order Cc Try Other Cards</em>' attribute.
	 * @see #isAutoOrderCcTryOtherCards()
	 * @generated
	 */
	void setAutoOrderCcTryOtherCards(boolean value);

	/**
	 * Returns the value of the '<em><b>Auto Save Cart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Save Cart</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Save Cart</em>' attribute.
	 * @see #setAutoSaveCart(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_AutoSaveCart()
	 * @model required="true"
	 * @generated
	 */
	boolean isAutoSaveCart();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isAutoSaveCart <em>Auto Save Cart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Save Cart</em>' attribute.
	 * @see #isAutoSaveCart()
	 * @generated
	 */
	void setAutoSaveCart(boolean value);

	/**
	 * Returns the value of the '<em><b>Balance Res On Order Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Balance Res On Order Creation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balance Res On Order Creation</em>' attribute.
	 * @see #setBalanceResOnOrderCreation(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_BalanceResOnOrderCreation()
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='If set to Y, when a new sales order is created with backordered items, then reservations on the facility/product are reassigned according to the priority given by the shipBeforeDate field.'"
	 * @generated
	 */
	boolean isBalanceResOnOrderCreation();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isBalanceResOnOrderCreation <em>Balance Res On Order Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance Res On Order Creation</em>' attribute.
	 * @see #isBalanceResOnOrderCreation()
	 * @generated
	 */
	void setBalanceResOnOrderCreation(boolean value);

	/**
	 * Returns the value of the '<em><b>Check Gc Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Gc Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Gc Balance</em>' attribute.
	 * @see #setCheckGcBalance(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_CheckGcBalance()
	 * @model required="true"
	 * @generated
	 */
	boolean isCheckGcBalance();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isCheckGcBalance <em>Check Gc Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Gc Balance</em>' attribute.
	 * @see #isCheckGcBalance()
	 * @generated
	 */
	void setCheckGcBalance(boolean value);

	/**
	 * Returns the value of the '<em><b>Check Inventory</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Inventory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Inventory</em>' attribute.
	 * @see #setCheckInventory(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_CheckInventory()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isCheckInventory();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isCheckInventory <em>Check Inventory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Inventory</em>' attribute.
	 * @see #isCheckInventory()
	 * @generated
	 */
	void setCheckInventory(boolean value);

	/**
	 * Returns the value of the '<em><b>Company Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Company Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company Name</em>' attribute.
	 * @see #setCompanyName(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_CompanyName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getCompanyName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getCompanyName <em>Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company Name</em>' attribute.
	 * @see #getCompanyName()
	 * @generated
	 */
	void setCompanyName(String value);

	/**
	 * Returns the value of the '<em><b>Days To Cancel Non Pay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Days To Cancel Non Pay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Days To Cancel Non Pay</em>' attribute.
	 * @see #setDaysToCancelNonPay(long)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_DaysToCancelNonPay()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getDaysToCancelNonPay();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getDaysToCancelNonPay <em>Days To Cancel Non Pay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Days To Cancel Non Pay</em>' attribute.
	 * @see #getDaysToCancelNonPay()
	 * @generated
	 */
	void setDaysToCancelNonPay(long value);

	/**
	 * Returns the value of the '<em><b>Default Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Currency Uom Id</em>' reference.
	 * @see #setDefaultCurrencyUomId(Uom)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_DefaultCurrencyUomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getDefaultCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getDefaultCurrencyUomId <em>Default Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Currency Uom Id</em>' reference.
	 * @see #getDefaultCurrencyUomId()
	 * @generated
	 */
	void setDefaultCurrencyUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Default Locale String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Locale String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Locale String</em>' attribute.
	 * @see #setDefaultLocaleString(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_DefaultLocaleString()
	 * @model annotation="mimo-ent-format length='10'"
	 * @generated
	 */
	String getDefaultLocaleString();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getDefaultLocaleString <em>Default Locale String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Locale String</em>' attribute.
	 * @see #getDefaultLocaleString()
	 * @generated
	 */
	void setDefaultLocaleString(String value);

	/**
	 * Returns the value of the '<em><b>Default Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Password</em>' attribute.
	 * @see #setDefaultPassword(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_DefaultPassword()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getDefaultPassword();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getDefaultPassword <em>Default Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Password</em>' attribute.
	 * @see #getDefaultPassword()
	 * @generated
	 */
	void setDefaultPassword(String value);

	/**
	 * Returns the value of the '<em><b>Default Sales Channel Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Sales Channel Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Sales Channel Enum Id</em>' reference.
	 * @see #setDefaultSalesChannelEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_DefaultSalesChannelEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getDefaultSalesChannelEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getDefaultSalesChannelEnumId <em>Default Sales Channel Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Sales Channel Enum Id</em>' reference.
	 * @see #getDefaultSalesChannelEnumId()
	 * @generated
	 */
	void setDefaultSalesChannelEnumId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Default Time Zone String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Time Zone String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Time Zone String</em>' attribute.
	 * @see #setDefaultTimeZoneString(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_DefaultTimeZoneString()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getDefaultTimeZoneString();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getDefaultTimeZoneString <em>Default Time Zone String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Time Zone String</em>' attribute.
	 * @see #getDefaultTimeZoneString()
	 * @generated
	 */
	void setDefaultTimeZoneString(String value);

	/**
	 * Returns the value of the '<em><b>Dig Prod Upload Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dig Prod Upload Category Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dig Prod Upload Category Id</em>' attribute.
	 * @see #setDigProdUploadCategoryId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_DigProdUploadCategoryId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getDigProdUploadCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getDigProdUploadCategoryId <em>Dig Prod Upload Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dig Prod Upload Category Id</em>' attribute.
	 * @see #getDigProdUploadCategoryId()
	 * @generated
	 */
	void setDigProdUploadCategoryId(String value);

	/**
	 * Returns the value of the '<em><b>Enable Auto Suggestion List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Auto Suggestion List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Auto Suggestion List</em>' attribute.
	 * @see #setEnableAutoSuggestionList(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_EnableAutoSuggestionList()
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='The auto-suggestion list is a special ShoppingList that the addSuggestionsToShoppingList service will maintain for cross-sells of ordered items.'"
	 * @generated
	 */
	boolean isEnableAutoSuggestionList();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isEnableAutoSuggestionList <em>Enable Auto Suggestion List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Auto Suggestion List</em>' attribute.
	 * @see #isEnableAutoSuggestionList()
	 * @generated
	 */
	void setEnableAutoSuggestionList(boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Dig Prod Upload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Dig Prod Upload</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Dig Prod Upload</em>' attribute.
	 * @see #setEnableDigProdUpload(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_EnableDigProdUpload()
	 * @model required="true"
	 * @generated
	 */
	boolean isEnableDigProdUpload();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isEnableDigProdUpload <em>Enable Dig Prod Upload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Dig Prod Upload</em>' attribute.
	 * @see #isEnableDigProdUpload()
	 * @generated
	 */
	void setEnableDigProdUpload(boolean value);

	/**
	 * Returns the value of the '<em><b>Explode Order Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Explode Order Items</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explode Order Items</em>' attribute.
	 * @see #setExplodeOrderItems(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ExplodeOrderItems()
	 * @model required="true"
	 * @generated
	 */
	boolean isExplodeOrderItems();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isExplodeOrderItems <em>Explode Order Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explode Order Items</em>' attribute.
	 * @see #isExplodeOrderItems()
	 * @generated
	 */
	void setExplodeOrderItems(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Demo Store</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Demo Store</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Demo Store</em>' attribute.
	 * @see #setIsDemoStore(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_IsDemoStore()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isIsDemoStore();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isIsDemoStore <em>Is Demo Store</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Demo Store</em>' attribute.
	 * @see #isIsDemoStore()
	 * @generated
	 */
	void setIsDemoStore(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Immediately Fulfilled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Immediately Fulfilled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Immediately Fulfilled</em>' attribute.
	 * @see #setIsImmediatelyFulfilled(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_IsImmediatelyFulfilled()
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='If immediately fulfilled (for physical stores, etc): don\'t send email notices, don\'t reserve inventory, and IFF inventory info isn\'t found on the server then don\'t issue inventory right away'"
	 * @generated
	 */
	boolean isIsImmediatelyFulfilled();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isIsImmediatelyFulfilled <em>Is Immediately Fulfilled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Immediately Fulfilled</em>' attribute.
	 * @see #isIsImmediatelyFulfilled()
	 * @generated
	 */
	void setIsImmediatelyFulfilled(boolean value);

	/**
	 * Returns the value of the '<em><b>Managed By Lot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Managed By Lot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managed By Lot</em>' attribute.
	 * @see #setManagedByLot(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ManagedByLot()
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='If Y, the preparator can choose the InventoryItem by this lotId when he makes the picklist.'"
	 * @generated
	 */
	boolean isManagedByLot();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isManagedByLot <em>Managed By Lot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managed By Lot</em>' attribute.
	 * @see #isManagedByLot()
	 * @generated
	 */
	void setManagedByLot(boolean value);

	/**
	 * Returns the value of the '<em><b>Manual Auth Is Capture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manual Auth Is Capture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manual Auth Is Capture</em>' attribute.
	 * @see #setManualAuthIsCapture(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ManualAuthIsCapture()
	 * @model required="true"
	 * @generated
	 */
	boolean isManualAuthIsCapture();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isManualAuthIsCapture <em>Manual Auth Is Capture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manual Auth Is Capture</em>' attribute.
	 * @see #isManualAuthIsCapture()
	 * @generated
	 */
	void setManualAuthIsCapture(boolean value);

	/**
	 * Returns the value of the '<em><b>OAuth2 Git Hubs</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.passport.OAuth2GitHub}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OAuth2 Git Hubs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OAuth2 Git Hubs</em>' reference list.
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_OAuth2GitHubs()
	 * @model derived="true"
	 * @generated
	 */
	List<OAuth2GitHub> getOAuth2GitHubs();

	/**
	 * Returns the value of the '<em><b>OAuth2 Googles</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.passport.OAuth2Google}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OAuth2 Googles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OAuth2 Googles</em>' reference list.
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_OAuth2Googles()
	 * @model derived="true"
	 * @generated
	 */
	List<OAuth2Google> getOAuth2Googles();

	/**
	 * Returns the value of the '<em><b>OAuth2 Linked Ins</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.passport.OAuth2LinkedIn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OAuth2 Linked Ins</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OAuth2 Linked Ins</em>' reference list.
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_OAuth2LinkedIns()
	 * @model derived="true"
	 * @generated
	 */
	List<OAuth2LinkedIn> getOAuth2LinkedIns();

	/**
	 * Returns the value of the '<em><b>Digital Item Approved Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digital Item Approved Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digital Item Approved Status</em>' reference.
	 * @see #setDigitalItemApprovedStatus(StatusItem)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_DigitalItemApprovedStatus()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getDigitalItemApprovedStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getDigitalItemApprovedStatus <em>Digital Item Approved Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digital Item Approved Status</em>' reference.
	 * @see #getDigitalItemApprovedStatus()
	 * @generated
	 */
	void setDigitalItemApprovedStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Header Approved Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Approved Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Approved Status</em>' reference.
	 * @see #setHeaderApprovedStatus(StatusItem)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_HeaderApprovedStatus()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getHeaderApprovedStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getHeaderApprovedStatus <em>Header Approved Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Approved Status</em>' reference.
	 * @see #getHeaderApprovedStatus()
	 * @generated
	 */
	void setHeaderApprovedStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Header Cancel Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Cancel Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Cancel Status</em>' reference.
	 * @see #setHeaderCancelStatus(StatusItem)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_HeaderCancelStatus()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getHeaderCancelStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getHeaderCancelStatus <em>Header Cancel Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Cancel Status</em>' reference.
	 * @see #getHeaderCancelStatus()
	 * @generated
	 */
	void setHeaderCancelStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Header Declined Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Declined Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Declined Status</em>' reference.
	 * @see #setHeaderDeclinedStatus(StatusItem)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_HeaderDeclinedStatus()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getHeaderDeclinedStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getHeaderDeclinedStatus <em>Header Declined Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Declined Status</em>' reference.
	 * @see #getHeaderDeclinedStatus()
	 * @generated
	 */
	void setHeaderDeclinedStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Item Approved Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Approved Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Approved Status</em>' reference.
	 * @see #setItemApprovedStatus(StatusItem)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ItemApprovedStatus()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getItemApprovedStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getItemApprovedStatus <em>Item Approved Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Approved Status</em>' reference.
	 * @see #getItemApprovedStatus()
	 * @generated
	 */
	void setItemApprovedStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Item Cancel Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Cancel Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Cancel Status</em>' reference.
	 * @see #setItemCancelStatus(StatusItem)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ItemCancelStatus()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getItemCancelStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getItemCancelStatus <em>Item Cancel Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Cancel Status</em>' reference.
	 * @see #getItemCancelStatus()
	 * @generated
	 */
	void setItemCancelStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Item Declined Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Declined Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Declined Status</em>' reference.
	 * @see #setItemDeclinedStatus(StatusItem)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ItemDeclinedStatus()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getItemDeclinedStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getItemDeclinedStatus <em>Item Declined Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Declined Status</em>' reference.
	 * @see #getItemDeclinedStatus()
	 * @generated
	 */
	void setItemDeclinedStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Old Header Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Header Logo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Header Logo</em>' attribute.
	 * @see #setOldHeaderLogo(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_OldHeaderLogo()
	 * @model annotation="mimo-ent-format type='url' length='2000'"
	 * @generated
	 */
	String getOldHeaderLogo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getOldHeaderLogo <em>Old Header Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Header Logo</em>' attribute.
	 * @see #getOldHeaderLogo()
	 * @generated
	 */
	void setOldHeaderLogo(String value);

	/**
	 * Returns the value of the '<em><b>Old Header Middle Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Header Middle Background</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Header Middle Background</em>' attribute.
	 * @see #setOldHeaderMiddleBackground(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_OldHeaderMiddleBackground()
	 * @model annotation="mimo-ent-format type='url' length='2000'"
	 * @generated
	 */
	String getOldHeaderMiddleBackground();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getOldHeaderMiddleBackground <em>Old Header Middle Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Header Middle Background</em>' attribute.
	 * @see #getOldHeaderMiddleBackground()
	 * @generated
	 */
	void setOldHeaderMiddleBackground(String value);

	/**
	 * Returns the value of the '<em><b>Old Header Right Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Header Right Background</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Header Right Background</em>' attribute.
	 * @see #setOldHeaderRightBackground(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_OldHeaderRightBackground()
	 * @model annotation="mimo-ent-format type='url' length='2000'"
	 * @generated
	 */
	String getOldHeaderRightBackground();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getOldHeaderRightBackground <em>Old Header Right Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Header Right Background</em>' attribute.
	 * @see #getOldHeaderRightBackground()
	 * @generated
	 */
	void setOldHeaderRightBackground(String value);

	/**
	 * Returns the value of the '<em><b>Old Style Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Style Sheet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Style Sheet</em>' attribute.
	 * @see #setOldStyleSheet(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_OldStyleSheet()
	 * @model annotation="mimo-ent-format type='url' length='2000'"
	 * @generated
	 */
	String getOldStyleSheet();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getOldStyleSheet <em>Old Style Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Style Sheet</em>' attribute.
	 * @see #getOldStyleSheet()
	 * @generated
	 */
	void setOldStyleSheet(String value);

	/**
	 * Returns the value of the '<em><b>One Inventory Facility</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>One Inventory Facility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One Inventory Facility</em>' attribute.
	 * @see #setOneInventoryFacility(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_OneInventoryFacility()
	 * @model default="true"
	 * @generated
	 */
	boolean isOneInventoryFacility();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isOneInventoryFacility <em>One Inventory Facility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>One Inventory Facility</em>' attribute.
	 * @see #isOneInventoryFacility()
	 * @generated
	 */
	void setOneInventoryFacility(boolean value);

	/**
	 * Returns the value of the '<em><b>Order Decimal Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Decimal Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Decimal Quantity</em>' attribute.
	 * @see #setOrderDecimalQuantity(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_OrderDecimalQuantity()
	 * @model annotation="mimo-ent-slot help='use to indicate if decimal quantity can be ordered for this producStore. Default value is Y'"
	 * @generated
	 */
	boolean isOrderDecimalQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isOrderDecimalQuantity <em>Order Decimal Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Decimal Quantity</em>' attribute.
	 * @see #isOrderDecimalQuantity()
	 * @generated
	 */
	void setOrderDecimalQuantity(boolean value);

	/**
	 * Returns the value of the '<em><b>Order Number Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Number Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Number Prefix</em>' attribute.
	 * @see #setOrderNumberPrefix(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_OrderNumberPrefix()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getOrderNumberPrefix();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getOrderNumberPrefix <em>Order Number Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Number Prefix</em>' attribute.
	 * @see #getOrderNumberPrefix()
	 * @generated
	 */
	void setOrderNumberPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Req Return Inventory Receive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req Return Inventory Receive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Return Inventory Receive</em>' attribute.
	 * @see #setReqReturnInventoryReceive(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ReqReturnInventoryReceive()
	 * @model annotation="mimo-ent-slot help='Default N. This is the default value for the ReturnHeader.needsInventoryReceive field. If set to Y return will automatically go to the Received status when Accepted instead of waiting for actual receipt of the return.'"
	 * @generated
	 */
	boolean isReqReturnInventoryReceive();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isReqReturnInventoryReceive <em>Req Return Inventory Receive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req Return Inventory Receive</em>' attribute.
	 * @see #isReqReturnInventoryReceive()
	 * @generated
	 */
	void setReqReturnInventoryReceive(boolean value);

	/**
	 * Returns the value of the '<em><b>Req Ship Addr For Dig Items</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req Ship Addr For Dig Items</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Ship Addr For Dig Items</em>' attribute.
	 * @see #setReqShipAddrForDigItems(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ReqShipAddrForDigItems()
	 * @model default="true" required="true"
	 *        annotation="mimo-ent-slot help='Default Y. Require Shipping Address for Digital Items? Note this only has an effect if there are ONLY digital goods in the cart.'"
	 * @generated
	 */
	boolean isReqShipAddrForDigItems();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isReqShipAddrForDigItems <em>Req Ship Addr For Dig Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req Ship Addr For Dig Items</em>' attribute.
	 * @see #isReqShipAddrForDigItems()
	 * @generated
	 */
	void setReqShipAddrForDigItems(boolean value);

	/**
	 * Returns the value of the '<em><b>Require Customer Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require Customer Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Customer Role</em>' attribute.
	 * @see #setRequireCustomerRole(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_RequireCustomerRole()
	 * @model required="true"
	 * @generated
	 */
	boolean isRequireCustomerRole();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isRequireCustomerRole <em>Require Customer Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Customer Role</em>' attribute.
	 * @see #isRequireCustomerRole()
	 * @generated
	 */
	void setRequireCustomerRole(boolean value);

	/**
	 * Returns the value of the '<em><b>Require Inventory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require Inventory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Inventory</em>' attribute.
	 * @see #setRequireInventory(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_RequireInventory()
	 * @model required="true"
	 * @generated
	 */
	boolean isRequireInventory();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isRequireInventory <em>Require Inventory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Inventory</em>' attribute.
	 * @see #isRequireInventory()
	 * @generated
	 */
	void setRequireInventory(boolean value);

	/**
	 * Returns the value of the '<em><b>Reserve Inventory</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserve Inventory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserve Inventory</em>' attribute.
	 * @see #setReserveInventory(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ReserveInventory()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isReserveInventory();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isReserveInventory <em>Reserve Inventory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserve Inventory</em>' attribute.
	 * @see #isReserveInventory()
	 * @generated
	 */
	void setReserveInventory(boolean value);

	/**
	 * Returns the value of the '<em><b>Retry Failed Auths</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retry Failed Auths</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retry Failed Auths</em>' attribute.
	 * @see #setRetryFailedAuths(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_RetryFailedAuths()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isRetryFailedAuths();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isRetryFailedAuths <em>Retry Failed Auths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry Failed Auths</em>' attribute.
	 * @see #isRetryFailedAuths()
	 * @generated
	 */
	void setRetryFailedAuths(boolean value);

	/**
	 * Returns the value of the '<em><b>Select Payment Type Per Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Payment Type Per Item</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Payment Type Per Item</em>' attribute.
	 * @see #setSelectPaymentTypePerItem(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_SelectPaymentTypePerItem()
	 * @model required="true"
	 * @generated
	 */
	boolean isSelectPaymentTypePerItem();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isSelectPaymentTypePerItem <em>Select Payment Type Per Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Payment Type Per Item</em>' attribute.
	 * @see #isSelectPaymentTypePerItem()
	 * @generated
	 */
	void setSelectPaymentTypePerItem(boolean value);

	/**
	 * Returns the value of the '<em><b>Set Owner Upon Issuance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Owner Upon Issuance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Owner Upon Issuance</em>' attribute.
	 * @see #setSetOwnerUponIssuance(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_SetOwnerUponIssuance()
	 * @model annotation="mimo-ent-slot help='If Y or empty, set the inventory item owner upon issuance.'"
	 * @generated
	 */
	boolean isSetOwnerUponIssuance();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isSetOwnerUponIssuance <em>Set Owner Upon Issuance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Owner Upon Issuance</em>' attribute.
	 * @see #isSetOwnerUponIssuance()
	 * @generated
	 */
	void setSetOwnerUponIssuance(boolean value);

	/**
	 * Returns the value of the '<em><b>Ship If Capture Fails</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship If Capture Fails</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship If Capture Fails</em>' attribute.
	 * @see #setShipIfCaptureFails(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ShipIfCaptureFails()
	 * @model default="true" required="true"
	 *        annotation="mimo-ent-slot help='If N, the captureOrderPayments will cause a service error if credit card capture fails.'"
	 * @generated
	 */
	boolean isShipIfCaptureFails();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isShipIfCaptureFails <em>Ship If Capture Fails</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship If Capture Fails</em>' attribute.
	 * @see #isShipIfCaptureFails()
	 * @generated
	 */
	void setShipIfCaptureFails(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Checkout Gift Options</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Checkout Gift Options</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Checkout Gift Options</em>' attribute.
	 * @see #setShowCheckoutGiftOptions(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ShowCheckoutGiftOptions()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isShowCheckoutGiftOptions();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isShowCheckoutGiftOptions <em>Show Checkout Gift Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Checkout Gift Options</em>' attribute.
	 * @see #isShowCheckoutGiftOptions()
	 * @generated
	 */
	void setShowCheckoutGiftOptions(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Out Of Stock Products</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Out Of Stock Products</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Out Of Stock Products</em>' attribute.
	 * @see #setShowOutOfStockProducts(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ShowOutOfStockProducts()
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='Default Y. If N then out of stock products will not be displayed on site'"
	 * @generated
	 */
	boolean isShowOutOfStockProducts();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isShowOutOfStockProducts <em>Show Out Of Stock Products</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Out Of Stock Products</em>' attribute.
	 * @see #isShowOutOfStockProducts()
	 * @generated
	 */
	void setShowOutOfStockProducts(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Prices With Vat Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Prices With Vat Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Prices With Vat Tax</em>' attribute.
	 * @see #setShowPricesWithVatTax(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ShowPricesWithVatTax()
	 * @model required="true"
	 * @generated
	 */
	boolean isShowPricesWithVatTax();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isShowPricesWithVatTax <em>Show Prices With Vat Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Prices With Vat Tax</em>' attribute.
	 * @see #isShowPricesWithVatTax()
	 * @generated
	 */
	void setShowPricesWithVatTax(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Tax Is Exempt</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Tax Is Exempt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Tax Is Exempt</em>' attribute.
	 * @see #setShowTaxIsExempt(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ShowTaxIsExempt()
	 * @model default="true" required="true"
	 *        annotation="mimo-ent-slot help='default Y; if set to N do not show isExempt checkbox for PartyTaxAuthInfo, always force to N'"
	 * @generated
	 */
	boolean isShowTaxIsExempt();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isShowTaxIsExempt <em>Show Tax Is Exempt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Tax Is Exempt</em>' attribute.
	 * @see #isShowTaxIsExempt()
	 * @generated
	 */
	void setShowTaxIsExempt(boolean value);

	/**
	 * Returns the value of the '<em><b>Split Pay Pref Per Shp Grp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Split Pay Pref Per Shp Grp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Split Pay Pref Per Shp Grp</em>' attribute.
	 * @see #setSplitPayPrefPerShpGrp(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_SplitPayPrefPerShpGrp()
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='Default N. If Y then before the order is stored the OrderPaymentPreference record will be split, one for each OrderItemShipGroup.'"
	 * @generated
	 */
	boolean isSplitPayPrefPerShpGrp();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isSplitPayPrefPerShpGrp <em>Split Pay Pref Per Shp Grp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Split Pay Pref Per Shp Grp</em>' attribute.
	 * @see #isSplitPayPrefPerShpGrp()
	 * @generated
	 */
	void setSplitPayPrefPerShpGrp(boolean value);

	/**
	 * Returns the value of the '<em><b>Pay To Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pay To Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pay To Party Id</em>' reference.
	 * @see #setPayToPartyId(Party)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_PayToPartyId()
	 * @model keys="partyId"
	 *        annotation="mimo-ent-slot help='Note that this corresponds with the organizationPartyId that GL transactions will be posted to.'"
	 * @generated
	 */
	Party getPayToPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getPayToPartyId <em>Pay To Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pay To Party Id</em>' reference.
	 * @see #getPayToPartyId()
	 * @generated
	 */
	void setPayToPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Requirement Method Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Method Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Method Enum Id</em>' reference.
	 * @see #setRequirementMethodEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_RequirementMethodEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getRequirementMethodEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getRequirementMethodEnumId <em>Requirement Method Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Method Enum Id</em>' reference.
	 * @see #getRequirementMethodEnumId()
	 * @generated
	 */
	void setRequirementMethodEnumId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Reserve Order Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserve Order Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserve Order Enum Id</em>' reference.
	 * @see #setReserveOrderEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ReserveOrderEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getReserveOrderEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getReserveOrderEnumId <em>Reserve Order Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserve Order Enum Id</em>' reference.
	 * @see #getReserveOrderEnumId()
	 * @generated
	 */
	void setReserveOrderEnumId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Store Credit Account Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store Credit Account Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Credit Account Enum Id</em>' reference.
	 * @see #setStoreCreditAccountEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_StoreCreditAccountEnumId()
	 * @model keys="enumId"
	 *        annotation="mimo-ent-slot help='Specify the type (Billing Account or Financial Account) of Store Credit Account used for refund return. Default to Financial Account. \n              This field is override by ReturnHeader.billingAccountId or ReturnHeader.finAccountId, whichever is specified but if only finAccountId is specified explicitly then system will first\n              try to locate any billing account with -ve amount. If found, then amount is credit to this billing account else the amount will be credit to the financial account of the user.'"
	 * @generated
	 */
	Enumeration getStoreCreditAccountEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getStoreCreditAccountEnumId <em>Store Credit Account Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store Credit Account Enum Id</em>' reference.
	 * @see #getStoreCreditAccountEnumId()
	 * @generated
	 */
	void setStoreCreditAccountEnumId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Store Credit Valid Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store Credit Valid Days</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Credit Valid Days</em>' attribute.
	 * @see #setStoreCreditValidDays(long)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_StoreCreditValidDays()
	 * @model annotation="mimo-ent-slot help='How many days that store credit is valid for. Null value implies no expiration.'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getStoreCreditValidDays();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getStoreCreditValidDays <em>Store Credit Valid Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store Credit Valid Days</em>' attribute.
	 * @see #getStoreCreditValidDays()
	 * @generated
	 */
	void setStoreCreditValidDays(long value);

	/**
	 * Returns the value of the '<em><b>Store Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Name</em>' attribute.
	 * @see #setStoreName(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_StoreName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getStoreName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getStoreName <em>Store Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store Name</em>' attribute.
	 * @see #getStoreName()
	 * @generated
	 */
	void setStoreName(String value);

	/**
	 * Returns the value of the '<em><b>Subtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtitle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtitle</em>' attribute.
	 * @see #setSubtitle(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_Subtitle()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getSubtitle();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getSubtitle <em>Subtitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtitle</em>' attribute.
	 * @see #getSubtitle()
	 * @generated
	 */
	void setSubtitle(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_Title()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Use Primary Email Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Primary Email Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Primary Email Username</em>' attribute.
	 * @see #setUsePrimaryEmailUsername(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_UsePrimaryEmailUsername()
	 * @model required="true"
	 * @generated
	 */
	boolean isUsePrimaryEmailUsername();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isUsePrimaryEmailUsername <em>Use Primary Email Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Primary Email Username</em>' attribute.
	 * @see #isUsePrimaryEmailUsername()
	 * @generated
	 */
	void setUsePrimaryEmailUsername(boolean value);

	/**
	 * Returns the value of the '<em><b>Vat Tax Auth Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vat Tax Auth Geo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vat Tax Auth Geo Id</em>' attribute.
	 * @see #setVatTaxAuthGeoId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_VatTaxAuthGeoId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getVatTaxAuthGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getVatTaxAuthGeoId <em>Vat Tax Auth Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vat Tax Auth Geo Id</em>' attribute.
	 * @see #getVatTaxAuthGeoId()
	 * @generated
	 */
	void setVatTaxAuthGeoId(String value);

	/**
	 * Returns the value of the '<em><b>Vat Tax Auth Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vat Tax Auth Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vat Tax Auth Party Id</em>' attribute.
	 * @see #setVatTaxAuthPartyId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_VatTaxAuthPartyId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getVatTaxAuthPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getVatTaxAuthPartyId <em>Vat Tax Auth Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vat Tax Auth Party Id</em>' attribute.
	 * @see #getVatTaxAuthPartyId()
	 * @generated
	 */
	void setVatTaxAuthPartyId(String value);

	/**
	 * Returns the value of the '<em><b>View Cart On Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Cart On Add</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Cart On Add</em>' attribute.
	 * @see #setViewCartOnAdd(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ViewCartOnAdd()
	 * @model required="true"
	 * @generated
	 */
	boolean isViewCartOnAdd();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isViewCartOnAdd <em>View Cart On Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Cart On Add</em>' attribute.
	 * @see #isViewCartOnAdd()
	 * @generated
	 */
	void setViewCartOnAdd(boolean value);

	/**
	 * Returns the value of the '<em><b>Visual Theme Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visual Theme Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visual Theme Id</em>' attribute.
	 * @see #setVisualThemeId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_VisualThemeId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getVisualThemeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getVisualThemeId <em>Visual Theme Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visual Theme Id</em>' attribute.
	 * @see #getVisualThemeId()
	 * @generated
	 */
	void setVisualThemeId(String value);

	/**
	 * Returns the value of the '<em><b>Prorate Shipping</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prorate Shipping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prorate Shipping</em>' attribute.
	 * @see #setProrateShipping(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ProrateShipping()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isProrateShipping();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isProrateShipping <em>Prorate Shipping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prorate Shipping</em>' attribute.
	 * @see #isProrateShipping()
	 * @generated
	 */
	void setProrateShipping(boolean value);

	/**
	 * Returns the value of the '<em><b>Prorate Taxes</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prorate Taxes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prorate Taxes</em>' attribute.
	 * @see #setProrateTaxes(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ProrateTaxes()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isProrateTaxes();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isProrateTaxes <em>Prorate Taxes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prorate Taxes</em>' attribute.
	 * @see #isProrateTaxes()
	 * @generated
	 */
	void setProrateTaxes(boolean value);

	/**
	 * Returns the value of the '<em><b>Primary Store Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Store Group Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Store Group Id</em>' reference.
	 * @see #setPrimaryStoreGroupId(ProductStoreGroup)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_PrimaryStoreGroupId()
	 * @model keys="productStoreGroupId"
	 * @generated
	 */
	ProductStoreGroup getPrimaryStoreGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getPrimaryStoreGroupId <em>Primary Store Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Store Group Id</em>' reference.
	 * @see #getPrimaryStoreGroupId()
	 * @generated
	 */
	void setPrimaryStoreGroupId(ProductStoreGroup value);

	/**
	 * Returns the value of the '<em><b>Prod Search Exclude Variants</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prod Search Exclude Variants</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prod Search Exclude Variants</em>' attribute.
	 * @see #setProdSearchExcludeVariants(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ProdSearchExcludeVariants()
	 * @model default="true" required="true"
	 *        annotation="mimo-ent-slot help='default Y; if set to Y an additional constraint will of isVariant!=Y will be added to all product searches for the store'"
	 * @generated
	 */
	boolean isProdSearchExcludeVariants();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isProdSearchExcludeVariants <em>Prod Search Exclude Variants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prod Search Exclude Variants</em>' attribute.
	 * @see #isProdSearchExcludeVariants()
	 * @generated
	 */
	void setProdSearchExcludeVariants(boolean value);

	/**
	 * Returns the value of the '<em><b>Product Store Email Settings</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Email Settings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Email Settings</em>' reference list.
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ProductStoreEmailSettings()
	 * @model derived="true"
	 * @generated
	 */
	List<ProductStoreEmailSetting> getProductStoreEmailSettings();

	/**
	 * Returns the value of the '<em><b>Product Store Fin Act Settings</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Fin Act Settings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Fin Act Settings</em>' reference list.
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ProductStoreFinActSettings()
	 * @model derived="true"
	 * @generated
	 */
	List<ProductStoreFinActSetting> getProductStoreFinActSettings();

	/**
	 * Returns the value of the '<em><b>Inventory Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Facility Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Facility Id</em>' reference.
	 * @see #setInventoryFacilityId(Facility)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_InventoryFacilityId()
	 * @model keys="facilityId"
	 * @generated
	 */
	Facility getInventoryFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getInventoryFacilityId <em>Inventory Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Facility Id</em>' reference.
	 * @see #getInventoryFacilityId()
	 * @generated
	 */
	void setInventoryFacilityId(Facility value);

	/**
	 * Returns the value of the '<em><b>Product Store Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' attribute.
	 * @see #setProductStoreId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ProductStoreId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getProductStoreId <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' attribute.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(String value);

	/**
	 * Returns the value of the '<em><b>Add To Cart Remove Incompat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add To Cart Remove Incompat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add To Cart Remove Incompat</em>' attribute.
	 * @see #setAddToCartRemoveIncompat(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_AddToCartRemoveIncompat()
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='Default N. If Y then on add to cart remove all products in cart with a ProductAssoc record related to or from the product and with the PRODUCT_INCOMPATABLE type.'"
	 * @generated
	 */
	boolean isAddToCartRemoveIncompat();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isAddToCartRemoveIncompat <em>Add To Cart Remove Incompat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add To Cart Remove Incompat</em>' attribute.
	 * @see #isAddToCartRemoveIncompat()
	 * @generated
	 */
	void setAddToCartRemoveIncompat(boolean value);

	/**
	 * Returns the value of the '<em><b>Add To Cart Replace Upsell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add To Cart Replace Upsell</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add To Cart Replace Upsell</em>' attribute.
	 * @see #setAddToCartReplaceUpsell(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_AddToCartReplaceUpsell()
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='Default N. If Y then on add to cart remove all products in cart with a ProductAssoc record related from the product and with the PRODUCT_UPGRADE type.'"
	 * @generated
	 */
	boolean isAddToCartReplaceUpsell();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isAddToCartReplaceUpsell <em>Add To Cart Replace Upsell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add To Cart Replace Upsell</em>' attribute.
	 * @see #isAddToCartReplaceUpsell()
	 * @generated
	 */
	void setAddToCartReplaceUpsell(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Comment</em>' attribute.
	 * @see #setAllowComment(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_AllowComment()
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='Allow comments for order line items per store'"
	 * @generated
	 */
	boolean isAllowComment();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isAllowComment <em>Allow Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Comment</em>' attribute.
	 * @see #isAllowComment()
	 * @generated
	 */
	void setAllowComment(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Password</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Password</em>' attribute.
	 * @see #setAllowPassword(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_AllowPassword()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isAllowPassword();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#isAllowPassword <em>Allow Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Password</em>' attribute.
	 * @see #isAllowPassword()
	 * @generated
	 */
	void setAllowPassword(boolean value);

} // ProductStore
