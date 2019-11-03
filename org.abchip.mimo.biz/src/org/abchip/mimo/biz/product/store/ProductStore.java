/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

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
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getOAuth2GitHubs <em>OAuth2 Git Hubs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getOAuth2Googles <em>OAuth2 Googles</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getOAuth2LinkedIns <em>OAuth2 Linked Ins</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getProductStoreEmailSettings <em>Product Store Email Settings</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStore#getProductStoreFinActSettings <em>Product Store Fin Act Settings</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore()
 * @model
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
	 * @model
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
	 * @model
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
	 * @model
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Approve Invoice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Approve Invoice</em>' attribute.
	 * @see #setAutoApproveInvoice(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_AutoApproveInvoice()
	 * @model
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Approve Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Approve Order</em>' attribute.
	 * @see #setAutoApproveOrder(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_AutoApproveOrder()
	 * @model
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
	 * @model
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Invoice Digital Items</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Invoice Digital Items</em>' attribute.
	 * @see #setAutoInvoiceDigitalItems(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_AutoInvoiceDigitalItems()
	 * @model
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Order Cc Try Exp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Order Cc Try Exp</em>' attribute.
	 * @see #setAutoOrderCcTryExp(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_AutoOrderCcTryExp()
	 * @model
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
	 * @model
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Order Cc Try Later Nsf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Order Cc Try Later Nsf</em>' attribute.
	 * @see #setAutoOrderCcTryLaterNsf(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_AutoOrderCcTryLaterNsf()
	 * @model
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Order Cc Try Other Cards</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Order Cc Try Other Cards</em>' attribute.
	 * @see #setAutoOrderCcTryOtherCards(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_AutoOrderCcTryOtherCards()
	 * @model
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
	 * @model
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
	 * @model
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
	 * @model
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Inventory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Inventory</em>' attribute.
	 * @see #setCheckInventory(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_CheckInventory()
	 * @model
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
	 * @model
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
	 * @model
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
	 * Returns the value of the '<em><b>Default Currency Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Currency Uom Id</em>' attribute.
	 * @see #setDefaultCurrencyUomId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_DefaultCurrencyUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getDefaultCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getDefaultCurrencyUomId <em>Default Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Currency Uom Id</em>' attribute.
	 * @see #getDefaultCurrencyUomId()
	 * @generated
	 */
	void setDefaultCurrencyUomId(String value);

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
	 * @model
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
	 * @model
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
	 * Returns the value of the '<em><b>Default Sales Channel Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Sales Channel Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Sales Channel Enum Id</em>' attribute.
	 * @see #setDefaultSalesChannelEnumId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_DefaultSalesChannelEnumId()
	 * @model annotation="mimo-ent-domain frame='Enumeration'"
	 * @generated
	 */
	String getDefaultSalesChannelEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getDefaultSalesChannelEnumId <em>Default Sales Channel Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Sales Channel Enum Id</em>' attribute.
	 * @see #getDefaultSalesChannelEnumId()
	 * @generated
	 */
	void setDefaultSalesChannelEnumId(String value);

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
	 * @model
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
	 * @model
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
	 * Returns the value of the '<em><b>Digital Item Approved Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digital Item Approved Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digital Item Approved Status</em>' attribute.
	 * @see #setDigitalItemApprovedStatus(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_DigitalItemApprovedStatus()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getDigitalItemApprovedStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getDigitalItemApprovedStatus <em>Digital Item Approved Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digital Item Approved Status</em>' attribute.
	 * @see #getDigitalItemApprovedStatus()
	 * @generated
	 */
	void setDigitalItemApprovedStatus(String value);

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
	 * @model
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
	 * @model
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
	 * @model
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
	 * Returns the value of the '<em><b>Header Approved Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Approved Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Approved Status</em>' attribute.
	 * @see #setHeaderApprovedStatus(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_HeaderApprovedStatus()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getHeaderApprovedStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getHeaderApprovedStatus <em>Header Approved Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Approved Status</em>' attribute.
	 * @see #getHeaderApprovedStatus()
	 * @generated
	 */
	void setHeaderApprovedStatus(String value);

	/**
	 * Returns the value of the '<em><b>Header Cancel Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Cancel Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Cancel Status</em>' attribute.
	 * @see #setHeaderCancelStatus(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_HeaderCancelStatus()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getHeaderCancelStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getHeaderCancelStatus <em>Header Cancel Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Cancel Status</em>' attribute.
	 * @see #getHeaderCancelStatus()
	 * @generated
	 */
	void setHeaderCancelStatus(String value);

	/**
	 * Returns the value of the '<em><b>Header Declined Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Declined Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Declined Status</em>' attribute.
	 * @see #setHeaderDeclinedStatus(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_HeaderDeclinedStatus()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getHeaderDeclinedStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getHeaderDeclinedStatus <em>Header Declined Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Declined Status</em>' attribute.
	 * @see #getHeaderDeclinedStatus()
	 * @generated
	 */
	void setHeaderDeclinedStatus(String value);

	/**
	 * Returns the value of the '<em><b>Item Approved Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Approved Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Approved Status</em>' attribute.
	 * @see #setItemApprovedStatus(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ItemApprovedStatus()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getItemApprovedStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getItemApprovedStatus <em>Item Approved Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Approved Status</em>' attribute.
	 * @see #getItemApprovedStatus()
	 * @generated
	 */
	void setItemApprovedStatus(String value);

	/**
	 * Returns the value of the '<em><b>Item Cancel Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Cancel Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Cancel Status</em>' attribute.
	 * @see #setItemCancelStatus(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ItemCancelStatus()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getItemCancelStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getItemCancelStatus <em>Item Cancel Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Cancel Status</em>' attribute.
	 * @see #getItemCancelStatus()
	 * @generated
	 */
	void setItemCancelStatus(String value);

	/**
	 * Returns the value of the '<em><b>Item Declined Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Declined Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Declined Status</em>' attribute.
	 * @see #setItemDeclinedStatus(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ItemDeclinedStatus()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getItemDeclinedStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getItemDeclinedStatus <em>Item Declined Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Declined Status</em>' attribute.
	 * @see #getItemDeclinedStatus()
	 * @generated
	 */
	void setItemDeclinedStatus(String value);

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
	 * @model
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
	 * @model
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
	 * @model
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
	 * @model
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
	 * @model
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
	 * @model
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>One Inventory Facility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One Inventory Facility</em>' attribute.
	 * @see #setOneInventoryFacility(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_OneInventoryFacility()
	 * @model
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
	 * @model
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
	 * @model
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
	 * Returns the value of the '<em><b>Pay To Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pay To Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pay To Party Id</em>' attribute.
	 * @see #setPayToPartyId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_PayToPartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPayToPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getPayToPartyId <em>Pay To Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pay To Party Id</em>' attribute.
	 * @see #getPayToPartyId()
	 * @generated
	 */
	void setPayToPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Requirement Method Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Method Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Method Enum Id</em>' attribute.
	 * @see #setRequirementMethodEnumId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_RequirementMethodEnumId()
	 * @model annotation="mimo-ent-domain frame='Enumeration'"
	 * @generated
	 */
	String getRequirementMethodEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getRequirementMethodEnumId <em>Requirement Method Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Method Enum Id</em>' attribute.
	 * @see #getRequirementMethodEnumId()
	 * @generated
	 */
	void setRequirementMethodEnumId(String value);

	/**
	 * Returns the value of the '<em><b>Reserve Inventory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserve Inventory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserve Inventory</em>' attribute.
	 * @see #setReserveInventory(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ReserveInventory()
	 * @model
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
	 * Returns the value of the '<em><b>Reserve Order Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserve Order Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserve Order Enum Id</em>' attribute.
	 * @see #setReserveOrderEnumId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ReserveOrderEnumId()
	 * @model annotation="mimo-ent-domain frame='Enumeration'"
	 * @generated
	 */
	String getReserveOrderEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getReserveOrderEnumId <em>Reserve Order Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserve Order Enum Id</em>' attribute.
	 * @see #getReserveOrderEnumId()
	 * @generated
	 */
	void setReserveOrderEnumId(String value);

	/**
	 * Returns the value of the '<em><b>Retry Failed Auths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retry Failed Auths</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retry Failed Auths</em>' attribute.
	 * @see #setRetryFailedAuths(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_RetryFailedAuths()
	 * @model
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
	 * @model
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
	 * @model
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship If Capture Fails</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship If Capture Fails</em>' attribute.
	 * @see #setShipIfCaptureFails(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ShipIfCaptureFails()
	 * @model
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Checkout Gift Options</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Checkout Gift Options</em>' attribute.
	 * @see #setShowCheckoutGiftOptions(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ShowCheckoutGiftOptions()
	 * @model
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
	 * @model
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
	 * @model
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Tax Is Exempt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Tax Is Exempt</em>' attribute.
	 * @see #setShowTaxIsExempt(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ShowTaxIsExempt()
	 * @model
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
	 * @model
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
	 * Returns the value of the '<em><b>Store Credit Account Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store Credit Account Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Credit Account Enum Id</em>' attribute.
	 * @see #setStoreCreditAccountEnumId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_StoreCreditAccountEnumId()
	 * @model annotation="mimo-ent-domain frame='Enumeration'"
	 * @generated
	 */
	String getStoreCreditAccountEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getStoreCreditAccountEnumId <em>Store Credit Account Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store Credit Account Enum Id</em>' attribute.
	 * @see #getStoreCreditAccountEnumId()
	 * @generated
	 */
	void setStoreCreditAccountEnumId(String value);

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
	 * @model
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
	 * @model
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
	 * @model
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
	 * @model
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
	 * @model
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
	 * @model
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
	 * @model
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
	 * @model
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
	 * @model
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
	 * Returns the value of the '<em><b>OAuth2 Git Hubs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OAuth2 Git Hubs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OAuth2 Git Hubs</em>' attribute list.
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_OAuth2GitHubs()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OAuth2GitHub'"
	 * @generated
	 */
	List<String> getOAuth2GitHubs();

	/**
	 * Returns the value of the '<em><b>OAuth2 Googles</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OAuth2 Googles</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OAuth2 Googles</em>' attribute list.
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_OAuth2Googles()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OAuth2Google'"
	 * @generated
	 */
	List<String> getOAuth2Googles();

	/**
	 * Returns the value of the '<em><b>OAuth2 Linked Ins</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OAuth2 Linked Ins</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OAuth2 Linked Ins</em>' attribute list.
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_OAuth2LinkedIns()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OAuth2LinkedIn'"
	 * @generated
	 */
	List<String> getOAuth2LinkedIns();

	/**
	 * Returns the value of the '<em><b>Product Store Email Settings</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Email Settings</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Email Settings</em>' attribute list.
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ProductStoreEmailSettings()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductStoreEmailSetting'"
	 * @generated
	 */
	List<String> getProductStoreEmailSettings();

	/**
	 * Returns the value of the '<em><b>Product Store Fin Act Settings</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Fin Act Settings</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Fin Act Settings</em>' attribute list.
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ProductStoreFinActSettings()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductStoreFinActSetting'"
	 * @generated
	 */
	List<String> getProductStoreFinActSettings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CustRequest' route='productStoreId'"
	 * @generated
	 */
	List<String> custRequests();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='GitHubUser' route='productStoreId'"
	 * @generated
	 */
	List<String> gitHubUsers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='GoogleUser' route='productStoreId'"
	 * @generated
	 */
	List<String> googleUsers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='LinkedInUser' route='productStoreId'"
	 * @generated
	 */
	List<String> linkedInUsers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderHeader' route='productStoreId'"
	 * @generated
	 */
	List<String> orderHeaders();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PartyProfileDefault' route='productStoreId'"
	 * @generated
	 */
	List<String> partyProfileDefaults();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductReview' route='productStoreId'"
	 * @generated
	 */
	List<String> productReviews();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductStoreSurveyAppl' route='productStoreId'"
	 * @generated
	 */
	List<String> productStoreSurveyAppls();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Quote' route='productStoreId'"
	 * @generated
	 */
	List<String> quotes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SegmentGroup' route='productStoreId'"
	 * @generated
	 */
	List<String> segmentGroups();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShoppingList' route='productStoreId'"
	 * @generated
	 */
	List<String> shoppingLists();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='TaxAuthorityRateProduct' route='productStoreId'"
	 * @generated
	 */
	List<String> taxAuthorityRateProducts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='WebSite' route='productStoreId'"
	 * @generated
	 */
	List<String> webSites();

	/**
	 * Returns the value of the '<em><b>Primary Store Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Store Group Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Store Group Id</em>' attribute.
	 * @see #setPrimaryStoreGroupId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_PrimaryStoreGroupId()
	 * @model annotation="mimo-ent-domain frame='ProductStoreGroup'"
	 * @generated
	 */
	String getPrimaryStoreGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getPrimaryStoreGroupId <em>Primary Store Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Store Group Id</em>' attribute.
	 * @see #getPrimaryStoreGroupId()
	 * @generated
	 */
	void setPrimaryStoreGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Prod Search Exclude Variants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prod Search Exclude Variants</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prod Search Exclude Variants</em>' attribute.
	 * @see #setProdSearchExcludeVariants(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ProdSearchExcludeVariants()
	 * @model
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
	 * Returns the value of the '<em><b>Prorate Shipping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prorate Shipping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prorate Shipping</em>' attribute.
	 * @see #setProrateShipping(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ProrateShipping()
	 * @model
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prorate Taxes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prorate Taxes</em>' attribute.
	 * @see #setProrateTaxes(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ProrateTaxes()
	 * @model
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
	 * @model
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req Ship Addr For Dig Items</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Ship Addr For Dig Items</em>' attribute.
	 * @see #setReqShipAddrForDigItems(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_ReqShipAddrForDigItems()
	 * @model
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
	 * @model
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
	 * @model
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
	 * Returns the value of the '<em><b>Inventory Facility Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Facility Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Facility Id</em>' attribute.
	 * @see #setInventoryFacilityId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_InventoryFacilityId()
	 * @model annotation="mimo-ent-domain frame='Facility'"
	 * @generated
	 */
	String getInventoryFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStore#getInventoryFacilityId <em>Inventory Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Facility Id</em>' attribute.
	 * @see #getInventoryFacilityId()
	 * @generated
	 */
	void setInventoryFacilityId(String value);

	/**
	 * Returns the value of the '<em><b>Is Demo Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Demo Store</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Demo Store</em>' attribute.
	 * @see #setIsDemoStore(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_IsDemoStore()
	 * @model
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
	 * @model
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
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
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
	 * @model
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
	 * @model
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
	 * @model
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Password</em>' attribute.
	 * @see #setAllowPassword(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStore_AllowPassword()
	 * @model
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
