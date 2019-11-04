/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.abchip.mimo.biz.product.store.ProductStoreGroup;
import org.abchip.mimo.biz.product.store.StorePackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isAddToCartRemoveIncompat <em>Add To Cart Remove Incompat</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isAddToCartReplaceUpsell <em>Add To Cart Replace Upsell</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isAllowComment <em>Allow Comment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isAllowPassword <em>Allow Password</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getAuthDeclinedMessage <em>Auth Declined Message</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getAuthErrorMessage <em>Auth Error Message</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getAuthFraudMessage <em>Auth Fraud Message</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isAutoApproveInvoice <em>Auto Approve Invoice</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isAutoApproveOrder <em>Auto Approve Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isAutoApproveReviews <em>Auto Approve Reviews</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isAutoInvoiceDigitalItems <em>Auto Invoice Digital Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isAutoOrderCcTryExp <em>Auto Order Cc Try Exp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getAutoOrderCcTryLaterMax <em>Auto Order Cc Try Later Max</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isAutoOrderCcTryLaterNsf <em>Auto Order Cc Try Later Nsf</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isAutoOrderCcTryOtherCards <em>Auto Order Cc Try Other Cards</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isAutoSaveCart <em>Auto Save Cart</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isBalanceResOnOrderCreation <em>Balance Res On Order Creation</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isCheckGcBalance <em>Check Gc Balance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isCheckInventory <em>Check Inventory</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getCompanyName <em>Company Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getDaysToCancelNonPay <em>Days To Cancel Non Pay</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getDefaultLocaleString <em>Default Locale String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getDefaultPassword <em>Default Password</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getDefaultTimeZoneString <em>Default Time Zone String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getDigProdUploadCategoryId <em>Dig Prod Upload Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isEnableAutoSuggestionList <em>Enable Auto Suggestion List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isEnableDigProdUpload <em>Enable Dig Prod Upload</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isExplodeOrderItems <em>Explode Order Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isIsDemoStore <em>Is Demo Store</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isIsImmediatelyFulfilled <em>Is Immediately Fulfilled</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isManagedByLot <em>Managed By Lot</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isManualAuthIsCapture <em>Manual Auth Is Capture</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getOldHeaderLogo <em>Old Header Logo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getOldHeaderMiddleBackground <em>Old Header Middle Background</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getOldHeaderRightBackground <em>Old Header Right Background</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getOldStyleSheet <em>Old Style Sheet</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isOneInventoryFacility <em>One Inventory Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isOrderDecimalQuantity <em>Order Decimal Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getOrderNumberPrefix <em>Order Number Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isProdSearchExcludeVariants <em>Prod Search Exclude Variants</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isProrateShipping <em>Prorate Shipping</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isProrateTaxes <em>Prorate Taxes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isReqReturnInventoryReceive <em>Req Return Inventory Receive</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isReqShipAddrForDigItems <em>Req Ship Addr For Dig Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isRequireCustomerRole <em>Require Customer Role</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isRequireInventory <em>Require Inventory</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isReserveInventory <em>Reserve Inventory</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isRetryFailedAuths <em>Retry Failed Auths</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isSelectPaymentTypePerItem <em>Select Payment Type Per Item</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isSetOwnerUponIssuance <em>Set Owner Upon Issuance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isShipIfCaptureFails <em>Ship If Capture Fails</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isShowCheckoutGiftOptions <em>Show Checkout Gift Options</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isShowOutOfStockProducts <em>Show Out Of Stock Products</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isShowPricesWithVatTax <em>Show Prices With Vat Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isShowTaxIsExempt <em>Show Tax Is Exempt</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isSplitPayPrefPerShpGrp <em>Split Pay Pref Per Shp Grp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getStoreCreditValidDays <em>Store Credit Valid Days</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getStoreName <em>Store Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isUsePrimaryEmailUsername <em>Use Primary Email Username</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getVatTaxAuthGeoId <em>Vat Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getVatTaxAuthPartyId <em>Vat Tax Auth Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isViewCartOnAdd <em>View Cart On Add</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getVisualThemeId <em>Visual Theme Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getPrimaryStoreGroupId <em>Primary Store Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getInventoryFacilityId <em>Inventory Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getReserveOrderEnumId <em>Reserve Order Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getRequirementMethodEnumId <em>Requirement Method Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getPayToPartyId <em>Pay To Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getDefaultCurrencyUomId <em>Default Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getDefaultSalesChannelEnumId <em>Default Sales Channel Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getHeaderApprovedStatus <em>Header Approved Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getItemApprovedStatus <em>Item Approved Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getDigitalItemApprovedStatus <em>Digital Item Approved Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getHeaderDeclinedStatus <em>Header Declined Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getItemDeclinedStatus <em>Item Declined Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getHeaderCancelStatus <em>Header Cancel Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getItemCancelStatus <em>Item Cancel Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getStoreCreditAccountEnumId <em>Store Credit Account Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getOAuth2GitHubs <em>OAuth2 Git Hubs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getOAuth2Googles <em>OAuth2 Googles</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getOAuth2LinkedIns <em>OAuth2 Linked Ins</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getProductStoreEmailSettings <em>Product Store Email Settings</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getProductStoreFinActSettings <em>Product Store Fin Act Settings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductStoreImpl extends BizEntityImpl implements ProductStore {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_STORE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected String productStoreId = PRODUCT_STORE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isAddToCartRemoveIncompat() <em>Add To Cart Remove Incompat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAddToCartRemoveIncompat()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADD_TO_CART_REMOVE_INCOMPAT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAddToCartRemoveIncompat() <em>Add To Cart Remove Incompat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAddToCartRemoveIncompat()
	 * @generated
	 * @ordered
	 */
	protected boolean addToCartRemoveIncompat = ADD_TO_CART_REMOVE_INCOMPAT_EDEFAULT;

	/**
	 * The default value of the '{@link #isAddToCartReplaceUpsell() <em>Add To Cart Replace Upsell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAddToCartReplaceUpsell()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADD_TO_CART_REPLACE_UPSELL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAddToCartReplaceUpsell() <em>Add To Cart Replace Upsell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAddToCartReplaceUpsell()
	 * @generated
	 * @ordered
	 */
	protected boolean addToCartReplaceUpsell = ADD_TO_CART_REPLACE_UPSELL_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowComment() <em>Allow Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowComment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_COMMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowComment() <em>Allow Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowComment()
	 * @generated
	 * @ordered
	 */
	protected boolean allowComment = ALLOW_COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowPassword() <em>Allow Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowPassword()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_PASSWORD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowPassword() <em>Allow Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowPassword()
	 * @generated
	 * @ordered
	 */
	protected boolean allowPassword = ALLOW_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthDeclinedMessage() <em>Auth Declined Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthDeclinedMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTH_DECLINED_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthDeclinedMessage() <em>Auth Declined Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthDeclinedMessage()
	 * @generated
	 * @ordered
	 */
	protected String authDeclinedMessage = AUTH_DECLINED_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthErrorMessage() <em>Auth Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthErrorMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTH_ERROR_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthErrorMessage() <em>Auth Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthErrorMessage()
	 * @generated
	 * @ordered
	 */
	protected String authErrorMessage = AUTH_ERROR_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthFraudMessage() <em>Auth Fraud Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthFraudMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTH_FRAUD_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthFraudMessage() <em>Auth Fraud Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthFraudMessage()
	 * @generated
	 * @ordered
	 */
	protected String authFraudMessage = AUTH_FRAUD_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutoApproveInvoice() <em>Auto Approve Invoice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoApproveInvoice()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_APPROVE_INVOICE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoApproveInvoice() <em>Auto Approve Invoice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoApproveInvoice()
	 * @generated
	 * @ordered
	 */
	protected boolean autoApproveInvoice = AUTO_APPROVE_INVOICE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutoApproveOrder() <em>Auto Approve Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoApproveOrder()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_APPROVE_ORDER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoApproveOrder() <em>Auto Approve Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoApproveOrder()
	 * @generated
	 * @ordered
	 */
	protected boolean autoApproveOrder = AUTO_APPROVE_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutoApproveReviews() <em>Auto Approve Reviews</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoApproveReviews()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_APPROVE_REVIEWS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoApproveReviews() <em>Auto Approve Reviews</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoApproveReviews()
	 * @generated
	 * @ordered
	 */
	protected boolean autoApproveReviews = AUTO_APPROVE_REVIEWS_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutoInvoiceDigitalItems() <em>Auto Invoice Digital Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoInvoiceDigitalItems()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_INVOICE_DIGITAL_ITEMS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoInvoiceDigitalItems() <em>Auto Invoice Digital Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoInvoiceDigitalItems()
	 * @generated
	 * @ordered
	 */
	protected boolean autoInvoiceDigitalItems = AUTO_INVOICE_DIGITAL_ITEMS_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutoOrderCcTryExp() <em>Auto Order Cc Try Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoOrderCcTryExp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_ORDER_CC_TRY_EXP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoOrderCcTryExp() <em>Auto Order Cc Try Exp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoOrderCcTryExp()
	 * @generated
	 * @ordered
	 */
	protected boolean autoOrderCcTryExp = AUTO_ORDER_CC_TRY_EXP_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoOrderCcTryLaterMax() <em>Auto Order Cc Try Later Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoOrderCcTryLaterMax()
	 * @generated
	 * @ordered
	 */
	protected static final long AUTO_ORDER_CC_TRY_LATER_MAX_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getAutoOrderCcTryLaterMax() <em>Auto Order Cc Try Later Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoOrderCcTryLaterMax()
	 * @generated
	 * @ordered
	 */
	protected long autoOrderCcTryLaterMax = AUTO_ORDER_CC_TRY_LATER_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutoOrderCcTryLaterNsf() <em>Auto Order Cc Try Later Nsf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoOrderCcTryLaterNsf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_ORDER_CC_TRY_LATER_NSF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoOrderCcTryLaterNsf() <em>Auto Order Cc Try Later Nsf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoOrderCcTryLaterNsf()
	 * @generated
	 * @ordered
	 */
	protected boolean autoOrderCcTryLaterNsf = AUTO_ORDER_CC_TRY_LATER_NSF_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutoOrderCcTryOtherCards() <em>Auto Order Cc Try Other Cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoOrderCcTryOtherCards()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_ORDER_CC_TRY_OTHER_CARDS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoOrderCcTryOtherCards() <em>Auto Order Cc Try Other Cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoOrderCcTryOtherCards()
	 * @generated
	 * @ordered
	 */
	protected boolean autoOrderCcTryOtherCards = AUTO_ORDER_CC_TRY_OTHER_CARDS_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutoSaveCart() <em>Auto Save Cart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoSaveCart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_SAVE_CART_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoSaveCart() <em>Auto Save Cart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoSaveCart()
	 * @generated
	 * @ordered
	 */
	protected boolean autoSaveCart = AUTO_SAVE_CART_EDEFAULT;

	/**
	 * The default value of the '{@link #isBalanceResOnOrderCreation() <em>Balance Res On Order Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBalanceResOnOrderCreation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BALANCE_RES_ON_ORDER_CREATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBalanceResOnOrderCreation() <em>Balance Res On Order Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBalanceResOnOrderCreation()
	 * @generated
	 * @ordered
	 */
	protected boolean balanceResOnOrderCreation = BALANCE_RES_ON_ORDER_CREATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckGcBalance() <em>Check Gc Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckGcBalance()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_GC_BALANCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckGcBalance() <em>Check Gc Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckGcBalance()
	 * @generated
	 * @ordered
	 */
	protected boolean checkGcBalance = CHECK_GC_BALANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckInventory() <em>Check Inventory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckInventory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_INVENTORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckInventory() <em>Check Inventory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckInventory()
	 * @generated
	 * @ordered
	 */
	protected boolean checkInventory = CHECK_INVENTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompanyName() <em>Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPANY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompanyName() <em>Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyName()
	 * @generated
	 * @ordered
	 */
	protected String companyName = COMPANY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDaysToCancelNonPay() <em>Days To Cancel Non Pay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaysToCancelNonPay()
	 * @generated
	 * @ordered
	 */
	protected static final long DAYS_TO_CANCEL_NON_PAY_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDaysToCancelNonPay() <em>Days To Cancel Non Pay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaysToCancelNonPay()
	 * @generated
	 * @ordered
	 */
	protected long daysToCancelNonPay = DAYS_TO_CANCEL_NON_PAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultLocaleString() <em>Default Locale String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultLocaleString()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_LOCALE_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultLocaleString() <em>Default Locale String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultLocaleString()
	 * @generated
	 * @ordered
	 */
	protected String defaultLocaleString = DEFAULT_LOCALE_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultPassword() <em>Default Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultPassword() <em>Default Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPassword()
	 * @generated
	 * @ordered
	 */
	protected String defaultPassword = DEFAULT_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultTimeZoneString() <em>Default Time Zone String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTimeZoneString()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_TIME_ZONE_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultTimeZoneString() <em>Default Time Zone String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTimeZoneString()
	 * @generated
	 * @ordered
	 */
	protected String defaultTimeZoneString = DEFAULT_TIME_ZONE_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getDigProdUploadCategoryId() <em>Dig Prod Upload Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigProdUploadCategoryId()
	 * @generated
	 * @ordered
	 */
	protected static final String DIG_PROD_UPLOAD_CATEGORY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDigProdUploadCategoryId() <em>Dig Prod Upload Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigProdUploadCategoryId()
	 * @generated
	 * @ordered
	 */
	protected String digProdUploadCategoryId = DIG_PROD_UPLOAD_CATEGORY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableAutoSuggestionList() <em>Enable Auto Suggestion List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableAutoSuggestionList()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_AUTO_SUGGESTION_LIST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableAutoSuggestionList() <em>Enable Auto Suggestion List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableAutoSuggestionList()
	 * @generated
	 * @ordered
	 */
	protected boolean enableAutoSuggestionList = ENABLE_AUTO_SUGGESTION_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableDigProdUpload() <em>Enable Dig Prod Upload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableDigProdUpload()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_DIG_PROD_UPLOAD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableDigProdUpload() <em>Enable Dig Prod Upload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableDigProdUpload()
	 * @generated
	 * @ordered
	 */
	protected boolean enableDigProdUpload = ENABLE_DIG_PROD_UPLOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #isExplodeOrderItems() <em>Explode Order Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplodeOrderItems()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPLODE_ORDER_ITEMS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExplodeOrderItems() <em>Explode Order Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplodeOrderItems()
	 * @generated
	 * @ordered
	 */
	protected boolean explodeOrderItems = EXPLODE_ORDER_ITEMS_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDemoStore() <em>Is Demo Store</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDemoStore()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DEMO_STORE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDemoStore() <em>Is Demo Store</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDemoStore()
	 * @generated
	 * @ordered
	 */
	protected boolean isDemoStore = IS_DEMO_STORE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsImmediatelyFulfilled() <em>Is Immediately Fulfilled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsImmediatelyFulfilled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_IMMEDIATELY_FULFILLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsImmediatelyFulfilled() <em>Is Immediately Fulfilled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsImmediatelyFulfilled()
	 * @generated
	 * @ordered
	 */
	protected boolean isImmediatelyFulfilled = IS_IMMEDIATELY_FULFILLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isManagedByLot() <em>Managed By Lot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManagedByLot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANAGED_BY_LOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isManagedByLot() <em>Managed By Lot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManagedByLot()
	 * @generated
	 * @ordered
	 */
	protected boolean managedByLot = MANAGED_BY_LOT_EDEFAULT;

	/**
	 * The default value of the '{@link #isManualAuthIsCapture() <em>Manual Auth Is Capture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManualAuthIsCapture()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANUAL_AUTH_IS_CAPTURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isManualAuthIsCapture() <em>Manual Auth Is Capture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManualAuthIsCapture()
	 * @generated
	 * @ordered
	 */
	protected boolean manualAuthIsCapture = MANUAL_AUTH_IS_CAPTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOldHeaderLogo() <em>Old Header Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldHeaderLogo()
	 * @generated
	 * @ordered
	 */
	protected static final String OLD_HEADER_LOGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOldHeaderLogo() <em>Old Header Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldHeaderLogo()
	 * @generated
	 * @ordered
	 */
	protected String oldHeaderLogo = OLD_HEADER_LOGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getOldHeaderMiddleBackground() <em>Old Header Middle Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldHeaderMiddleBackground()
	 * @generated
	 * @ordered
	 */
	protected static final String OLD_HEADER_MIDDLE_BACKGROUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOldHeaderMiddleBackground() <em>Old Header Middle Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldHeaderMiddleBackground()
	 * @generated
	 * @ordered
	 */
	protected String oldHeaderMiddleBackground = OLD_HEADER_MIDDLE_BACKGROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getOldHeaderRightBackground() <em>Old Header Right Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldHeaderRightBackground()
	 * @generated
	 * @ordered
	 */
	protected static final String OLD_HEADER_RIGHT_BACKGROUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOldHeaderRightBackground() <em>Old Header Right Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldHeaderRightBackground()
	 * @generated
	 * @ordered
	 */
	protected String oldHeaderRightBackground = OLD_HEADER_RIGHT_BACKGROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getOldStyleSheet() <em>Old Style Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldStyleSheet()
	 * @generated
	 * @ordered
	 */
	protected static final String OLD_STYLE_SHEET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOldStyleSheet() <em>Old Style Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldStyleSheet()
	 * @generated
	 * @ordered
	 */
	protected String oldStyleSheet = OLD_STYLE_SHEET_EDEFAULT;

	/**
	 * The default value of the '{@link #isOneInventoryFacility() <em>One Inventory Facility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOneInventoryFacility()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ONE_INVENTORY_FACILITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOneInventoryFacility() <em>One Inventory Facility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOneInventoryFacility()
	 * @generated
	 * @ordered
	 */
	protected boolean oneInventoryFacility = ONE_INVENTORY_FACILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isOrderDecimalQuantity() <em>Order Decimal Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrderDecimalQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORDER_DECIMAL_QUANTITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOrderDecimalQuantity() <em>Order Decimal Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrderDecimalQuantity()
	 * @generated
	 * @ordered
	 */
	protected boolean orderDecimalQuantity = ORDER_DECIMAL_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderNumberPrefix() <em>Order Number Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderNumberPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_NUMBER_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderNumberPrefix() <em>Order Number Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderNumberPrefix()
	 * @generated
	 * @ordered
	 */
	protected String orderNumberPrefix = ORDER_NUMBER_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #isProdSearchExcludeVariants() <em>Prod Search Exclude Variants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProdSearchExcludeVariants()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROD_SEARCH_EXCLUDE_VARIANTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProdSearchExcludeVariants() <em>Prod Search Exclude Variants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProdSearchExcludeVariants()
	 * @generated
	 * @ordered
	 */
	protected boolean prodSearchExcludeVariants = PROD_SEARCH_EXCLUDE_VARIANTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isProrateShipping() <em>Prorate Shipping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProrateShipping()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRORATE_SHIPPING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProrateShipping() <em>Prorate Shipping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProrateShipping()
	 * @generated
	 * @ordered
	 */
	protected boolean prorateShipping = PRORATE_SHIPPING_EDEFAULT;

	/**
	 * The default value of the '{@link #isProrateTaxes() <em>Prorate Taxes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProrateTaxes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRORATE_TAXES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProrateTaxes() <em>Prorate Taxes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProrateTaxes()
	 * @generated
	 * @ordered
	 */
	protected boolean prorateTaxes = PRORATE_TAXES_EDEFAULT;

	/**
	 * The default value of the '{@link #isReqReturnInventoryReceive() <em>Req Return Inventory Receive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReqReturnInventoryReceive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQ_RETURN_INVENTORY_RECEIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReqReturnInventoryReceive() <em>Req Return Inventory Receive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReqReturnInventoryReceive()
	 * @generated
	 * @ordered
	 */
	protected boolean reqReturnInventoryReceive = REQ_RETURN_INVENTORY_RECEIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isReqShipAddrForDigItems() <em>Req Ship Addr For Dig Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReqShipAddrForDigItems()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQ_SHIP_ADDR_FOR_DIG_ITEMS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReqShipAddrForDigItems() <em>Req Ship Addr For Dig Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReqShipAddrForDigItems()
	 * @generated
	 * @ordered
	 */
	protected boolean reqShipAddrForDigItems = REQ_SHIP_ADDR_FOR_DIG_ITEMS_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequireCustomerRole() <em>Require Customer Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireCustomerRole()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRE_CUSTOMER_ROLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequireCustomerRole() <em>Require Customer Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireCustomerRole()
	 * @generated
	 * @ordered
	 */
	protected boolean requireCustomerRole = REQUIRE_CUSTOMER_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequireInventory() <em>Require Inventory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireInventory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRE_INVENTORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequireInventory() <em>Require Inventory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireInventory()
	 * @generated
	 * @ordered
	 */
	protected boolean requireInventory = REQUIRE_INVENTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #isReserveInventory() <em>Reserve Inventory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReserveInventory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESERVE_INVENTORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReserveInventory() <em>Reserve Inventory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReserveInventory()
	 * @generated
	 * @ordered
	 */
	protected boolean reserveInventory = RESERVE_INVENTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #isRetryFailedAuths() <em>Retry Failed Auths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetryFailedAuths()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETRY_FAILED_AUTHS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRetryFailedAuths() <em>Retry Failed Auths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetryFailedAuths()
	 * @generated
	 * @ordered
	 */
	protected boolean retryFailedAuths = RETRY_FAILED_AUTHS_EDEFAULT;

	/**
	 * The default value of the '{@link #isSelectPaymentTypePerItem() <em>Select Payment Type Per Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelectPaymentTypePerItem()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECT_PAYMENT_TYPE_PER_ITEM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSelectPaymentTypePerItem() <em>Select Payment Type Per Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelectPaymentTypePerItem()
	 * @generated
	 * @ordered
	 */
	protected boolean selectPaymentTypePerItem = SELECT_PAYMENT_TYPE_PER_ITEM_EDEFAULT;

	/**
	 * The default value of the '{@link #isSetOwnerUponIssuance() <em>Set Owner Upon Issuance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOwnerUponIssuance()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SET_OWNER_UPON_ISSUANCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSetOwnerUponIssuance() <em>Set Owner Upon Issuance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOwnerUponIssuance()
	 * @generated
	 * @ordered
	 */
	protected boolean setOwnerUponIssuance = SET_OWNER_UPON_ISSUANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isShipIfCaptureFails() <em>Ship If Capture Fails</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShipIfCaptureFails()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHIP_IF_CAPTURE_FAILS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShipIfCaptureFails() <em>Ship If Capture Fails</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShipIfCaptureFails()
	 * @generated
	 * @ordered
	 */
	protected boolean shipIfCaptureFails = SHIP_IF_CAPTURE_FAILS_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowCheckoutGiftOptions() <em>Show Checkout Gift Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowCheckoutGiftOptions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_CHECKOUT_GIFT_OPTIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowCheckoutGiftOptions() <em>Show Checkout Gift Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowCheckoutGiftOptions()
	 * @generated
	 * @ordered
	 */
	protected boolean showCheckoutGiftOptions = SHOW_CHECKOUT_GIFT_OPTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowOutOfStockProducts() <em>Show Out Of Stock Products</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowOutOfStockProducts()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_OUT_OF_STOCK_PRODUCTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowOutOfStockProducts() <em>Show Out Of Stock Products</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowOutOfStockProducts()
	 * @generated
	 * @ordered
	 */
	protected boolean showOutOfStockProducts = SHOW_OUT_OF_STOCK_PRODUCTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowPricesWithVatTax() <em>Show Prices With Vat Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowPricesWithVatTax()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_PRICES_WITH_VAT_TAX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowPricesWithVatTax() <em>Show Prices With Vat Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowPricesWithVatTax()
	 * @generated
	 * @ordered
	 */
	protected boolean showPricesWithVatTax = SHOW_PRICES_WITH_VAT_TAX_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowTaxIsExempt() <em>Show Tax Is Exempt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowTaxIsExempt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_TAX_IS_EXEMPT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowTaxIsExempt() <em>Show Tax Is Exempt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowTaxIsExempt()
	 * @generated
	 * @ordered
	 */
	protected boolean showTaxIsExempt = SHOW_TAX_IS_EXEMPT_EDEFAULT;

	/**
	 * The default value of the '{@link #isSplitPayPrefPerShpGrp() <em>Split Pay Pref Per Shp Grp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSplitPayPrefPerShpGrp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SPLIT_PAY_PREF_PER_SHP_GRP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSplitPayPrefPerShpGrp() <em>Split Pay Pref Per Shp Grp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSplitPayPrefPerShpGrp()
	 * @generated
	 * @ordered
	 */
	protected boolean splitPayPrefPerShpGrp = SPLIT_PAY_PREF_PER_SHP_GRP_EDEFAULT;

	/**
	 * The default value of the '{@link #getStoreCreditValidDays() <em>Store Credit Valid Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreCreditValidDays()
	 * @generated
	 * @ordered
	 */
	protected static final long STORE_CREDIT_VALID_DAYS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getStoreCreditValidDays() <em>Store Credit Valid Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreCreditValidDays()
	 * @generated
	 * @ordered
	 */
	protected long storeCreditValidDays = STORE_CREDIT_VALID_DAYS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStoreName() <em>Store Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreName()
	 * @generated
	 * @ordered
	 */
	protected static final String STORE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStoreName() <em>Store Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreName()
	 * @generated
	 * @ordered
	 */
	protected String storeName = STORE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubtitle() <em>Subtitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBTITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubtitle() <em>Subtitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected String subtitle = SUBTITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUsePrimaryEmailUsername() <em>Use Primary Email Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsePrimaryEmailUsername()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_PRIMARY_EMAIL_USERNAME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUsePrimaryEmailUsername() <em>Use Primary Email Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsePrimaryEmailUsername()
	 * @generated
	 * @ordered
	 */
	protected boolean usePrimaryEmailUsername = USE_PRIMARY_EMAIL_USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVatTaxAuthGeoId() <em>Vat Tax Auth Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVatTaxAuthGeoId()
	 * @generated
	 * @ordered
	 */
	protected static final String VAT_TAX_AUTH_GEO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVatTaxAuthGeoId() <em>Vat Tax Auth Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVatTaxAuthGeoId()
	 * @generated
	 * @ordered
	 */
	protected String vatTaxAuthGeoId = VAT_TAX_AUTH_GEO_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVatTaxAuthPartyId() <em>Vat Tax Auth Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVatTaxAuthPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String VAT_TAX_AUTH_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVatTaxAuthPartyId() <em>Vat Tax Auth Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVatTaxAuthPartyId()
	 * @generated
	 * @ordered
	 */
	protected String vatTaxAuthPartyId = VAT_TAX_AUTH_PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isViewCartOnAdd() <em>View Cart On Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isViewCartOnAdd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VIEW_CART_ON_ADD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isViewCartOnAdd() <em>View Cart On Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isViewCartOnAdd()
	 * @generated
	 * @ordered
	 */
	protected boolean viewCartOnAdd = VIEW_CART_ON_ADD_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisualThemeId() <em>Visual Theme Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualThemeId()
	 * @generated
	 * @ordered
	 */
	protected static final String VISUAL_THEME_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisualThemeId() <em>Visual Theme Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualThemeId()
	 * @generated
	 * @ordered
	 */
	protected String visualThemeId = VISUAL_THEME_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrimaryStoreGroupId() <em>Primary Store Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryStoreGroupId()
	 * @generated
	 * @ordered
	 */
	protected ProductStoreGroup primaryStoreGroupId;

	/**
	 * The cached value of the '{@link #getInventoryFacilityId() <em>Inventory Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryFacilityId()
	 * @generated
	 * @ordered
	 */
	protected Facility inventoryFacilityId;

	/**
	 * The cached value of the '{@link #getReserveOrderEnumId() <em>Reserve Order Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserveOrderEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration reserveOrderEnumId;

	/**
	 * The cached value of the '{@link #getRequirementMethodEnumId() <em>Requirement Method Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementMethodEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration requirementMethodEnumId;

	/**
	 * The cached value of the '{@link #getPayToPartyId() <em>Pay To Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayToPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party payToPartyId;

	/**
	 * The cached value of the '{@link #getDefaultCurrencyUomId() <em>Default Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom defaultCurrencyUomId;

	/**
	 * The cached value of the '{@link #getDefaultSalesChannelEnumId() <em>Default Sales Channel Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSalesChannelEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration defaultSalesChannelEnumId;

	/**
	 * The cached value of the '{@link #getHeaderApprovedStatus() <em>Header Approved Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderApprovedStatus()
	 * @generated
	 * @ordered
	 */
	protected StatusItem headerApprovedStatus;

	/**
	 * The cached value of the '{@link #getItemApprovedStatus() <em>Item Approved Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemApprovedStatus()
	 * @generated
	 * @ordered
	 */
	protected StatusItem itemApprovedStatus;

	/**
	 * The cached value of the '{@link #getDigitalItemApprovedStatus() <em>Digital Item Approved Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigitalItemApprovedStatus()
	 * @generated
	 * @ordered
	 */
	protected StatusItem digitalItemApprovedStatus;

	/**
	 * The cached value of the '{@link #getHeaderDeclinedStatus() <em>Header Declined Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderDeclinedStatus()
	 * @generated
	 * @ordered
	 */
	protected StatusItem headerDeclinedStatus;

	/**
	 * The cached value of the '{@link #getItemDeclinedStatus() <em>Item Declined Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemDeclinedStatus()
	 * @generated
	 * @ordered
	 */
	protected StatusItem itemDeclinedStatus;

	/**
	 * The cached value of the '{@link #getHeaderCancelStatus() <em>Header Cancel Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderCancelStatus()
	 * @generated
	 * @ordered
	 */
	protected StatusItem headerCancelStatus;

	/**
	 * The cached value of the '{@link #getItemCancelStatus() <em>Item Cancel Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemCancelStatus()
	 * @generated
	 * @ordered
	 */
	protected StatusItem itemCancelStatus;

	/**
	 * The cached value of the '{@link #getStoreCreditAccountEnumId() <em>Store Credit Account Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreCreditAccountEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration storeCreditAccountEnumId;

	/**
	 * The cached value of the '{@link #getOAuth2GitHubs() <em>OAuth2 Git Hubs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOAuth2GitHubs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> oAuth2GitHubs;

	/**
	 * The cached value of the '{@link #getOAuth2Googles() <em>OAuth2 Googles</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOAuth2Googles()
	 * @generated
	 * @ordered
	 */
	protected EList<String> oAuth2Googles;

	/**
	 * The cached value of the '{@link #getOAuth2LinkedIns() <em>OAuth2 Linked Ins</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOAuth2LinkedIns()
	 * @generated
	 * @ordered
	 */
	protected EList<String> oAuth2LinkedIns;

	/**
	 * The cached value of the '{@link #getProductStoreEmailSettings() <em>Product Store Email Settings</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreEmailSettings()
	 * @generated
	 * @ordered
	 */
	protected EList<String> productStoreEmailSettings;

	/**
	 * The cached value of the '{@link #getProductStoreFinActSettings() <em>Product Store Fin Act Settings</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreFinActSettings()
	 * @generated
	 * @ordered
	 */
	protected EList<String> productStoreFinActSettings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductStoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.PRODUCT_STORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthDeclinedMessage() {
		return authDeclinedMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthDeclinedMessage(String newAuthDeclinedMessage) {
		String oldAuthDeclinedMessage = authDeclinedMessage;
		authDeclinedMessage = newAuthDeclinedMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__AUTH_DECLINED_MESSAGE, oldAuthDeclinedMessage, authDeclinedMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthErrorMessage() {
		return authErrorMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthErrorMessage(String newAuthErrorMessage) {
		String oldAuthErrorMessage = authErrorMessage;
		authErrorMessage = newAuthErrorMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__AUTH_ERROR_MESSAGE, oldAuthErrorMessage, authErrorMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthFraudMessage() {
		return authFraudMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthFraudMessage(String newAuthFraudMessage) {
		String oldAuthFraudMessage = authFraudMessage;
		authFraudMessage = newAuthFraudMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__AUTH_FRAUD_MESSAGE, oldAuthFraudMessage, authFraudMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutoApproveInvoice() {
		return autoApproveInvoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoApproveInvoice(boolean newAutoApproveInvoice) {
		boolean oldAutoApproveInvoice = autoApproveInvoice;
		autoApproveInvoice = newAutoApproveInvoice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__AUTO_APPROVE_INVOICE, oldAutoApproveInvoice, autoApproveInvoice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutoApproveOrder() {
		return autoApproveOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoApproveOrder(boolean newAutoApproveOrder) {
		boolean oldAutoApproveOrder = autoApproveOrder;
		autoApproveOrder = newAutoApproveOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__AUTO_APPROVE_ORDER, oldAutoApproveOrder, autoApproveOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutoApproveReviews() {
		return autoApproveReviews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoApproveReviews(boolean newAutoApproveReviews) {
		boolean oldAutoApproveReviews = autoApproveReviews;
		autoApproveReviews = newAutoApproveReviews;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__AUTO_APPROVE_REVIEWS, oldAutoApproveReviews, autoApproveReviews));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutoInvoiceDigitalItems() {
		return autoInvoiceDigitalItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoInvoiceDigitalItems(boolean newAutoInvoiceDigitalItems) {
		boolean oldAutoInvoiceDigitalItems = autoInvoiceDigitalItems;
		autoInvoiceDigitalItems = newAutoInvoiceDigitalItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__AUTO_INVOICE_DIGITAL_ITEMS, oldAutoInvoiceDigitalItems, autoInvoiceDigitalItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutoOrderCcTryExp() {
		return autoOrderCcTryExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoOrderCcTryExp(boolean newAutoOrderCcTryExp) {
		boolean oldAutoOrderCcTryExp = autoOrderCcTryExp;
		autoOrderCcTryExp = newAutoOrderCcTryExp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__AUTO_ORDER_CC_TRY_EXP, oldAutoOrderCcTryExp, autoOrderCcTryExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getAutoOrderCcTryLaterMax() {
		return autoOrderCcTryLaterMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoOrderCcTryLaterMax(long newAutoOrderCcTryLaterMax) {
		long oldAutoOrderCcTryLaterMax = autoOrderCcTryLaterMax;
		autoOrderCcTryLaterMax = newAutoOrderCcTryLaterMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__AUTO_ORDER_CC_TRY_LATER_MAX, oldAutoOrderCcTryLaterMax, autoOrderCcTryLaterMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutoOrderCcTryLaterNsf() {
		return autoOrderCcTryLaterNsf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoOrderCcTryLaterNsf(boolean newAutoOrderCcTryLaterNsf) {
		boolean oldAutoOrderCcTryLaterNsf = autoOrderCcTryLaterNsf;
		autoOrderCcTryLaterNsf = newAutoOrderCcTryLaterNsf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__AUTO_ORDER_CC_TRY_LATER_NSF, oldAutoOrderCcTryLaterNsf, autoOrderCcTryLaterNsf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutoOrderCcTryOtherCards() {
		return autoOrderCcTryOtherCards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoOrderCcTryOtherCards(boolean newAutoOrderCcTryOtherCards) {
		boolean oldAutoOrderCcTryOtherCards = autoOrderCcTryOtherCards;
		autoOrderCcTryOtherCards = newAutoOrderCcTryOtherCards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__AUTO_ORDER_CC_TRY_OTHER_CARDS, oldAutoOrderCcTryOtherCards, autoOrderCcTryOtherCards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutoSaveCart() {
		return autoSaveCart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoSaveCart(boolean newAutoSaveCart) {
		boolean oldAutoSaveCart = autoSaveCart;
		autoSaveCart = newAutoSaveCart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__AUTO_SAVE_CART, oldAutoSaveCart, autoSaveCart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBalanceResOnOrderCreation() {
		return balanceResOnOrderCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBalanceResOnOrderCreation(boolean newBalanceResOnOrderCreation) {
		boolean oldBalanceResOnOrderCreation = balanceResOnOrderCreation;
		balanceResOnOrderCreation = newBalanceResOnOrderCreation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__BALANCE_RES_ON_ORDER_CREATION, oldBalanceResOnOrderCreation, balanceResOnOrderCreation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCheckGcBalance() {
		return checkGcBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheckGcBalance(boolean newCheckGcBalance) {
		boolean oldCheckGcBalance = checkGcBalance;
		checkGcBalance = newCheckGcBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__CHECK_GC_BALANCE, oldCheckGcBalance, checkGcBalance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCheckInventory() {
		return checkInventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheckInventory(boolean newCheckInventory) {
		boolean oldCheckInventory = checkInventory;
		checkInventory = newCheckInventory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__CHECK_INVENTORY, oldCheckInventory, checkInventory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompanyName(String newCompanyName) {
		String oldCompanyName = companyName;
		companyName = newCompanyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__COMPANY_NAME, oldCompanyName, companyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDaysToCancelNonPay() {
		return daysToCancelNonPay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDaysToCancelNonPay(long newDaysToCancelNonPay) {
		long oldDaysToCancelNonPay = daysToCancelNonPay;
		daysToCancelNonPay = newDaysToCancelNonPay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__DAYS_TO_CANCEL_NON_PAY, oldDaysToCancelNonPay, daysToCancelNonPay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getDefaultCurrencyUomId() {
		if (defaultCurrencyUomId != null && ((EObject)defaultCurrencyUomId).eIsProxy()) {
			InternalEObject oldDefaultCurrencyUomId = (InternalEObject)defaultCurrencyUomId;
			defaultCurrencyUomId = (Uom)eResolveProxy(oldDefaultCurrencyUomId);
			if (defaultCurrencyUomId != oldDefaultCurrencyUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE__DEFAULT_CURRENCY_UOM_ID, oldDefaultCurrencyUomId, defaultCurrencyUomId));
			}
		}
		return defaultCurrencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetDefaultCurrencyUomId() {
		return defaultCurrencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultCurrencyUomId(Uom newDefaultCurrencyUomId) {
		Uom oldDefaultCurrencyUomId = defaultCurrencyUomId;
		defaultCurrencyUomId = newDefaultCurrencyUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__DEFAULT_CURRENCY_UOM_ID, oldDefaultCurrencyUomId, defaultCurrencyUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultLocaleString() {
		return defaultLocaleString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultLocaleString(String newDefaultLocaleString) {
		String oldDefaultLocaleString = defaultLocaleString;
		defaultLocaleString = newDefaultLocaleString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__DEFAULT_LOCALE_STRING, oldDefaultLocaleString, defaultLocaleString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultPassword() {
		return defaultPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultPassword(String newDefaultPassword) {
		String oldDefaultPassword = defaultPassword;
		defaultPassword = newDefaultPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__DEFAULT_PASSWORD, oldDefaultPassword, defaultPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getDefaultSalesChannelEnumId() {
		if (defaultSalesChannelEnumId != null && ((EObject)defaultSalesChannelEnumId).eIsProxy()) {
			InternalEObject oldDefaultSalesChannelEnumId = (InternalEObject)defaultSalesChannelEnumId;
			defaultSalesChannelEnumId = (Enumeration)eResolveProxy(oldDefaultSalesChannelEnumId);
			if (defaultSalesChannelEnumId != oldDefaultSalesChannelEnumId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE__DEFAULT_SALES_CHANNEL_ENUM_ID, oldDefaultSalesChannelEnumId, defaultSalesChannelEnumId));
			}
		}
		return defaultSalesChannelEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetDefaultSalesChannelEnumId() {
		return defaultSalesChannelEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultSalesChannelEnumId(Enumeration newDefaultSalesChannelEnumId) {
		Enumeration oldDefaultSalesChannelEnumId = defaultSalesChannelEnumId;
		defaultSalesChannelEnumId = newDefaultSalesChannelEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__DEFAULT_SALES_CHANNEL_ENUM_ID, oldDefaultSalesChannelEnumId, defaultSalesChannelEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultTimeZoneString() {
		return defaultTimeZoneString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultTimeZoneString(String newDefaultTimeZoneString) {
		String oldDefaultTimeZoneString = defaultTimeZoneString;
		defaultTimeZoneString = newDefaultTimeZoneString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__DEFAULT_TIME_ZONE_STRING, oldDefaultTimeZoneString, defaultTimeZoneString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDigProdUploadCategoryId() {
		return digProdUploadCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDigProdUploadCategoryId(String newDigProdUploadCategoryId) {
		String oldDigProdUploadCategoryId = digProdUploadCategoryId;
		digProdUploadCategoryId = newDigProdUploadCategoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__DIG_PROD_UPLOAD_CATEGORY_ID, oldDigProdUploadCategoryId, digProdUploadCategoryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getDigitalItemApprovedStatus() {
		if (digitalItemApprovedStatus != null && ((EObject)digitalItemApprovedStatus).eIsProxy()) {
			InternalEObject oldDigitalItemApprovedStatus = (InternalEObject)digitalItemApprovedStatus;
			digitalItemApprovedStatus = (StatusItem)eResolveProxy(oldDigitalItemApprovedStatus);
			if (digitalItemApprovedStatus != oldDigitalItemApprovedStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE__DIGITAL_ITEM_APPROVED_STATUS, oldDigitalItemApprovedStatus, digitalItemApprovedStatus));
			}
		}
		return digitalItemApprovedStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetDigitalItemApprovedStatus() {
		return digitalItemApprovedStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDigitalItemApprovedStatus(StatusItem newDigitalItemApprovedStatus) {
		StatusItem oldDigitalItemApprovedStatus = digitalItemApprovedStatus;
		digitalItemApprovedStatus = newDigitalItemApprovedStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__DIGITAL_ITEM_APPROVED_STATUS, oldDigitalItemApprovedStatus, digitalItemApprovedStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnableAutoSuggestionList() {
		return enableAutoSuggestionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableAutoSuggestionList(boolean newEnableAutoSuggestionList) {
		boolean oldEnableAutoSuggestionList = enableAutoSuggestionList;
		enableAutoSuggestionList = newEnableAutoSuggestionList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__ENABLE_AUTO_SUGGESTION_LIST, oldEnableAutoSuggestionList, enableAutoSuggestionList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnableDigProdUpload() {
		return enableDigProdUpload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableDigProdUpload(boolean newEnableDigProdUpload) {
		boolean oldEnableDigProdUpload = enableDigProdUpload;
		enableDigProdUpload = newEnableDigProdUpload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__ENABLE_DIG_PROD_UPLOAD, oldEnableDigProdUpload, enableDigProdUpload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExplodeOrderItems() {
		return explodeOrderItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExplodeOrderItems(boolean newExplodeOrderItems) {
		boolean oldExplodeOrderItems = explodeOrderItems;
		explodeOrderItems = newExplodeOrderItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__EXPLODE_ORDER_ITEMS, oldExplodeOrderItems, explodeOrderItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getHeaderApprovedStatus() {
		if (headerApprovedStatus != null && ((EObject)headerApprovedStatus).eIsProxy()) {
			InternalEObject oldHeaderApprovedStatus = (InternalEObject)headerApprovedStatus;
			headerApprovedStatus = (StatusItem)eResolveProxy(oldHeaderApprovedStatus);
			if (headerApprovedStatus != oldHeaderApprovedStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE__HEADER_APPROVED_STATUS, oldHeaderApprovedStatus, headerApprovedStatus));
			}
		}
		return headerApprovedStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetHeaderApprovedStatus() {
		return headerApprovedStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeaderApprovedStatus(StatusItem newHeaderApprovedStatus) {
		StatusItem oldHeaderApprovedStatus = headerApprovedStatus;
		headerApprovedStatus = newHeaderApprovedStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__HEADER_APPROVED_STATUS, oldHeaderApprovedStatus, headerApprovedStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getHeaderCancelStatus() {
		if (headerCancelStatus != null && ((EObject)headerCancelStatus).eIsProxy()) {
			InternalEObject oldHeaderCancelStatus = (InternalEObject)headerCancelStatus;
			headerCancelStatus = (StatusItem)eResolveProxy(oldHeaderCancelStatus);
			if (headerCancelStatus != oldHeaderCancelStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE__HEADER_CANCEL_STATUS, oldHeaderCancelStatus, headerCancelStatus));
			}
		}
		return headerCancelStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetHeaderCancelStatus() {
		return headerCancelStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeaderCancelStatus(StatusItem newHeaderCancelStatus) {
		StatusItem oldHeaderCancelStatus = headerCancelStatus;
		headerCancelStatus = newHeaderCancelStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__HEADER_CANCEL_STATUS, oldHeaderCancelStatus, headerCancelStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getHeaderDeclinedStatus() {
		if (headerDeclinedStatus != null && ((EObject)headerDeclinedStatus).eIsProxy()) {
			InternalEObject oldHeaderDeclinedStatus = (InternalEObject)headerDeclinedStatus;
			headerDeclinedStatus = (StatusItem)eResolveProxy(oldHeaderDeclinedStatus);
			if (headerDeclinedStatus != oldHeaderDeclinedStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE__HEADER_DECLINED_STATUS, oldHeaderDeclinedStatus, headerDeclinedStatus));
			}
		}
		return headerDeclinedStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetHeaderDeclinedStatus() {
		return headerDeclinedStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeaderDeclinedStatus(StatusItem newHeaderDeclinedStatus) {
		StatusItem oldHeaderDeclinedStatus = headerDeclinedStatus;
		headerDeclinedStatus = newHeaderDeclinedStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__HEADER_DECLINED_STATUS, oldHeaderDeclinedStatus, headerDeclinedStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getItemApprovedStatus() {
		if (itemApprovedStatus != null && ((EObject)itemApprovedStatus).eIsProxy()) {
			InternalEObject oldItemApprovedStatus = (InternalEObject)itemApprovedStatus;
			itemApprovedStatus = (StatusItem)eResolveProxy(oldItemApprovedStatus);
			if (itemApprovedStatus != oldItemApprovedStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE__ITEM_APPROVED_STATUS, oldItemApprovedStatus, itemApprovedStatus));
			}
		}
		return itemApprovedStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetItemApprovedStatus() {
		return itemApprovedStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemApprovedStatus(StatusItem newItemApprovedStatus) {
		StatusItem oldItemApprovedStatus = itemApprovedStatus;
		itemApprovedStatus = newItemApprovedStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__ITEM_APPROVED_STATUS, oldItemApprovedStatus, itemApprovedStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getItemCancelStatus() {
		if (itemCancelStatus != null && ((EObject)itemCancelStatus).eIsProxy()) {
			InternalEObject oldItemCancelStatus = (InternalEObject)itemCancelStatus;
			itemCancelStatus = (StatusItem)eResolveProxy(oldItemCancelStatus);
			if (itemCancelStatus != oldItemCancelStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE__ITEM_CANCEL_STATUS, oldItemCancelStatus, itemCancelStatus));
			}
		}
		return itemCancelStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetItemCancelStatus() {
		return itemCancelStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemCancelStatus(StatusItem newItemCancelStatus) {
		StatusItem oldItemCancelStatus = itemCancelStatus;
		itemCancelStatus = newItemCancelStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__ITEM_CANCEL_STATUS, oldItemCancelStatus, itemCancelStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getItemDeclinedStatus() {
		if (itemDeclinedStatus != null && ((EObject)itemDeclinedStatus).eIsProxy()) {
			InternalEObject oldItemDeclinedStatus = (InternalEObject)itemDeclinedStatus;
			itemDeclinedStatus = (StatusItem)eResolveProxy(oldItemDeclinedStatus);
			if (itemDeclinedStatus != oldItemDeclinedStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE__ITEM_DECLINED_STATUS, oldItemDeclinedStatus, itemDeclinedStatus));
			}
		}
		return itemDeclinedStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetItemDeclinedStatus() {
		return itemDeclinedStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemDeclinedStatus(StatusItem newItemDeclinedStatus) {
		StatusItem oldItemDeclinedStatus = itemDeclinedStatus;
		itemDeclinedStatus = newItemDeclinedStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__ITEM_DECLINED_STATUS, oldItemDeclinedStatus, itemDeclinedStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isManagedByLot() {
		return managedByLot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManagedByLot(boolean newManagedByLot) {
		boolean oldManagedByLot = managedByLot;
		managedByLot = newManagedByLot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__MANAGED_BY_LOT, oldManagedByLot, managedByLot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isManualAuthIsCapture() {
		return manualAuthIsCapture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManualAuthIsCapture(boolean newManualAuthIsCapture) {
		boolean oldManualAuthIsCapture = manualAuthIsCapture;
		manualAuthIsCapture = newManualAuthIsCapture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__MANUAL_AUTH_IS_CAPTURE, oldManualAuthIsCapture, manualAuthIsCapture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOldHeaderLogo() {
		return oldHeaderLogo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldHeaderLogo(String newOldHeaderLogo) {
		String oldOldHeaderLogo = oldHeaderLogo;
		oldHeaderLogo = newOldHeaderLogo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__OLD_HEADER_LOGO, oldOldHeaderLogo, oldHeaderLogo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOldHeaderMiddleBackground() {
		return oldHeaderMiddleBackground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldHeaderMiddleBackground(String newOldHeaderMiddleBackground) {
		String oldOldHeaderMiddleBackground = oldHeaderMiddleBackground;
		oldHeaderMiddleBackground = newOldHeaderMiddleBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__OLD_HEADER_MIDDLE_BACKGROUND, oldOldHeaderMiddleBackground, oldHeaderMiddleBackground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOldHeaderRightBackground() {
		return oldHeaderRightBackground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldHeaderRightBackground(String newOldHeaderRightBackground) {
		String oldOldHeaderRightBackground = oldHeaderRightBackground;
		oldHeaderRightBackground = newOldHeaderRightBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__OLD_HEADER_RIGHT_BACKGROUND, oldOldHeaderRightBackground, oldHeaderRightBackground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOldStyleSheet() {
		return oldStyleSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldStyleSheet(String newOldStyleSheet) {
		String oldOldStyleSheet = oldStyleSheet;
		oldStyleSheet = newOldStyleSheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__OLD_STYLE_SHEET, oldOldStyleSheet, oldStyleSheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOneInventoryFacility() {
		return oneInventoryFacility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOneInventoryFacility(boolean newOneInventoryFacility) {
		boolean oldOneInventoryFacility = oneInventoryFacility;
		oneInventoryFacility = newOneInventoryFacility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__ONE_INVENTORY_FACILITY, oldOneInventoryFacility, oneInventoryFacility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOrderDecimalQuantity() {
		return orderDecimalQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderDecimalQuantity(boolean newOrderDecimalQuantity) {
		boolean oldOrderDecimalQuantity = orderDecimalQuantity;
		orderDecimalQuantity = newOrderDecimalQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__ORDER_DECIMAL_QUANTITY, oldOrderDecimalQuantity, orderDecimalQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderNumberPrefix() {
		return orderNumberPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderNumberPrefix(String newOrderNumberPrefix) {
		String oldOrderNumberPrefix = orderNumberPrefix;
		orderNumberPrefix = newOrderNumberPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__ORDER_NUMBER_PREFIX, oldOrderNumberPrefix, orderNumberPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPayToPartyId() {
		if (payToPartyId != null && ((EObject)payToPartyId).eIsProxy()) {
			InternalEObject oldPayToPartyId = (InternalEObject)payToPartyId;
			payToPartyId = (Party)eResolveProxy(oldPayToPartyId);
			if (payToPartyId != oldPayToPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE__PAY_TO_PARTY_ID, oldPayToPartyId, payToPartyId));
			}
		}
		return payToPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPayToPartyId() {
		return payToPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayToPartyId(Party newPayToPartyId) {
		Party oldPayToPartyId = payToPartyId;
		payToPartyId = newPayToPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__PAY_TO_PARTY_ID, oldPayToPartyId, payToPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getRequirementMethodEnumId() {
		if (requirementMethodEnumId != null && ((EObject)requirementMethodEnumId).eIsProxy()) {
			InternalEObject oldRequirementMethodEnumId = (InternalEObject)requirementMethodEnumId;
			requirementMethodEnumId = (Enumeration)eResolveProxy(oldRequirementMethodEnumId);
			if (requirementMethodEnumId != oldRequirementMethodEnumId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE__REQUIREMENT_METHOD_ENUM_ID, oldRequirementMethodEnumId, requirementMethodEnumId));
			}
		}
		return requirementMethodEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetRequirementMethodEnumId() {
		return requirementMethodEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirementMethodEnumId(Enumeration newRequirementMethodEnumId) {
		Enumeration oldRequirementMethodEnumId = requirementMethodEnumId;
		requirementMethodEnumId = newRequirementMethodEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__REQUIREMENT_METHOD_ENUM_ID, oldRequirementMethodEnumId, requirementMethodEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReserveInventory() {
		return reserveInventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserveInventory(boolean newReserveInventory) {
		boolean oldReserveInventory = reserveInventory;
		reserveInventory = newReserveInventory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__RESERVE_INVENTORY, oldReserveInventory, reserveInventory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getReserveOrderEnumId() {
		if (reserveOrderEnumId != null && ((EObject)reserveOrderEnumId).eIsProxy()) {
			InternalEObject oldReserveOrderEnumId = (InternalEObject)reserveOrderEnumId;
			reserveOrderEnumId = (Enumeration)eResolveProxy(oldReserveOrderEnumId);
			if (reserveOrderEnumId != oldReserveOrderEnumId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE__RESERVE_ORDER_ENUM_ID, oldReserveOrderEnumId, reserveOrderEnumId));
			}
		}
		return reserveOrderEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetReserveOrderEnumId() {
		return reserveOrderEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserveOrderEnumId(Enumeration newReserveOrderEnumId) {
		Enumeration oldReserveOrderEnumId = reserveOrderEnumId;
		reserveOrderEnumId = newReserveOrderEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__RESERVE_ORDER_ENUM_ID, oldReserveOrderEnumId, reserveOrderEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRetryFailedAuths() {
		return retryFailedAuths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetryFailedAuths(boolean newRetryFailedAuths) {
		boolean oldRetryFailedAuths = retryFailedAuths;
		retryFailedAuths = newRetryFailedAuths;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__RETRY_FAILED_AUTHS, oldRetryFailedAuths, retryFailedAuths));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSelectPaymentTypePerItem() {
		return selectPaymentTypePerItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelectPaymentTypePerItem(boolean newSelectPaymentTypePerItem) {
		boolean oldSelectPaymentTypePerItem = selectPaymentTypePerItem;
		selectPaymentTypePerItem = newSelectPaymentTypePerItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__SELECT_PAYMENT_TYPE_PER_ITEM, oldSelectPaymentTypePerItem, selectPaymentTypePerItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnerUponIssuance() {
		return setOwnerUponIssuance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetOwnerUponIssuance(boolean newSetOwnerUponIssuance) {
		boolean oldSetOwnerUponIssuance = setOwnerUponIssuance;
		setOwnerUponIssuance = newSetOwnerUponIssuance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__SET_OWNER_UPON_ISSUANCE, oldSetOwnerUponIssuance, setOwnerUponIssuance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isShipIfCaptureFails() {
		return shipIfCaptureFails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipIfCaptureFails(boolean newShipIfCaptureFails) {
		boolean oldShipIfCaptureFails = shipIfCaptureFails;
		shipIfCaptureFails = newShipIfCaptureFails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__SHIP_IF_CAPTURE_FAILS, oldShipIfCaptureFails, shipIfCaptureFails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isShowCheckoutGiftOptions() {
		return showCheckoutGiftOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShowCheckoutGiftOptions(boolean newShowCheckoutGiftOptions) {
		boolean oldShowCheckoutGiftOptions = showCheckoutGiftOptions;
		showCheckoutGiftOptions = newShowCheckoutGiftOptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__SHOW_CHECKOUT_GIFT_OPTIONS, oldShowCheckoutGiftOptions, showCheckoutGiftOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isShowOutOfStockProducts() {
		return showOutOfStockProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShowOutOfStockProducts(boolean newShowOutOfStockProducts) {
		boolean oldShowOutOfStockProducts = showOutOfStockProducts;
		showOutOfStockProducts = newShowOutOfStockProducts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__SHOW_OUT_OF_STOCK_PRODUCTS, oldShowOutOfStockProducts, showOutOfStockProducts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isShowPricesWithVatTax() {
		return showPricesWithVatTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShowPricesWithVatTax(boolean newShowPricesWithVatTax) {
		boolean oldShowPricesWithVatTax = showPricesWithVatTax;
		showPricesWithVatTax = newShowPricesWithVatTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__SHOW_PRICES_WITH_VAT_TAX, oldShowPricesWithVatTax, showPricesWithVatTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isShowTaxIsExempt() {
		return showTaxIsExempt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShowTaxIsExempt(boolean newShowTaxIsExempt) {
		boolean oldShowTaxIsExempt = showTaxIsExempt;
		showTaxIsExempt = newShowTaxIsExempt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__SHOW_TAX_IS_EXEMPT, oldShowTaxIsExempt, showTaxIsExempt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSplitPayPrefPerShpGrp() {
		return splitPayPrefPerShpGrp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSplitPayPrefPerShpGrp(boolean newSplitPayPrefPerShpGrp) {
		boolean oldSplitPayPrefPerShpGrp = splitPayPrefPerShpGrp;
		splitPayPrefPerShpGrp = newSplitPayPrefPerShpGrp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__SPLIT_PAY_PREF_PER_SHP_GRP, oldSplitPayPrefPerShpGrp, splitPayPrefPerShpGrp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getStoreCreditAccountEnumId() {
		if (storeCreditAccountEnumId != null && ((EObject)storeCreditAccountEnumId).eIsProxy()) {
			InternalEObject oldStoreCreditAccountEnumId = (InternalEObject)storeCreditAccountEnumId;
			storeCreditAccountEnumId = (Enumeration)eResolveProxy(oldStoreCreditAccountEnumId);
			if (storeCreditAccountEnumId != oldStoreCreditAccountEnumId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE__STORE_CREDIT_ACCOUNT_ENUM_ID, oldStoreCreditAccountEnumId, storeCreditAccountEnumId));
			}
		}
		return storeCreditAccountEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetStoreCreditAccountEnumId() {
		return storeCreditAccountEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStoreCreditAccountEnumId(Enumeration newStoreCreditAccountEnumId) {
		Enumeration oldStoreCreditAccountEnumId = storeCreditAccountEnumId;
		storeCreditAccountEnumId = newStoreCreditAccountEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__STORE_CREDIT_ACCOUNT_ENUM_ID, oldStoreCreditAccountEnumId, storeCreditAccountEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getStoreCreditValidDays() {
		return storeCreditValidDays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStoreCreditValidDays(long newStoreCreditValidDays) {
		long oldStoreCreditValidDays = storeCreditValidDays;
		storeCreditValidDays = newStoreCreditValidDays;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__STORE_CREDIT_VALID_DAYS, oldStoreCreditValidDays, storeCreditValidDays));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStoreName() {
		return storeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStoreName(String newStoreName) {
		String oldStoreName = storeName;
		storeName = newStoreName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__STORE_NAME, oldStoreName, storeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubtitle() {
		return subtitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubtitle(String newSubtitle) {
		String oldSubtitle = subtitle;
		subtitle = newSubtitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__SUBTITLE, oldSubtitle, subtitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUsePrimaryEmailUsername() {
		return usePrimaryEmailUsername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsePrimaryEmailUsername(boolean newUsePrimaryEmailUsername) {
		boolean oldUsePrimaryEmailUsername = usePrimaryEmailUsername;
		usePrimaryEmailUsername = newUsePrimaryEmailUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__USE_PRIMARY_EMAIL_USERNAME, oldUsePrimaryEmailUsername, usePrimaryEmailUsername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVatTaxAuthGeoId() {
		return vatTaxAuthGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVatTaxAuthGeoId(String newVatTaxAuthGeoId) {
		String oldVatTaxAuthGeoId = vatTaxAuthGeoId;
		vatTaxAuthGeoId = newVatTaxAuthGeoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__VAT_TAX_AUTH_GEO_ID, oldVatTaxAuthGeoId, vatTaxAuthGeoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVatTaxAuthPartyId() {
		return vatTaxAuthPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVatTaxAuthPartyId(String newVatTaxAuthPartyId) {
		String oldVatTaxAuthPartyId = vatTaxAuthPartyId;
		vatTaxAuthPartyId = newVatTaxAuthPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__VAT_TAX_AUTH_PARTY_ID, oldVatTaxAuthPartyId, vatTaxAuthPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isViewCartOnAdd() {
		return viewCartOnAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewCartOnAdd(boolean newViewCartOnAdd) {
		boolean oldViewCartOnAdd = viewCartOnAdd;
		viewCartOnAdd = newViewCartOnAdd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__VIEW_CART_ON_ADD, oldViewCartOnAdd, viewCartOnAdd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVisualThemeId() {
		return visualThemeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisualThemeId(String newVisualThemeId) {
		String oldVisualThemeId = visualThemeId;
		visualThemeId = newVisualThemeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__VISUAL_THEME_ID, oldVisualThemeId, visualThemeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getOAuth2GitHubs() {
		if (oAuth2GitHubs == null) {
			oAuth2GitHubs = new EDataTypeUniqueEList<String>(String.class, this, StorePackage.PRODUCT_STORE__OAUTH2_GIT_HUBS);
		}
		return oAuth2GitHubs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getOAuth2Googles() {
		if (oAuth2Googles == null) {
			oAuth2Googles = new EDataTypeUniqueEList<String>(String.class, this, StorePackage.PRODUCT_STORE__OAUTH2_GOOGLES);
		}
		return oAuth2Googles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getOAuth2LinkedIns() {
		if (oAuth2LinkedIns == null) {
			oAuth2LinkedIns = new EDataTypeUniqueEList<String>(String.class, this, StorePackage.PRODUCT_STORE__OAUTH2_LINKED_INS);
		}
		return oAuth2LinkedIns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getProductStoreEmailSettings() {
		if (productStoreEmailSettings == null) {
			productStoreEmailSettings = new EDataTypeUniqueEList<String>(String.class, this, StorePackage.PRODUCT_STORE__PRODUCT_STORE_EMAIL_SETTINGS);
		}
		return productStoreEmailSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getProductStoreFinActSettings() {
		if (productStoreFinActSettings == null) {
			productStoreFinActSettings = new EDataTypeUniqueEList<String>(String.class, this, StorePackage.PRODUCT_STORE__PRODUCT_STORE_FIN_ACT_SETTINGS);
		}
		return productStoreFinActSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> custRequests() {
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
	public List<String> gitHubUsers() {
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
	public List<String> googleUsers() {
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
	public List<String> linkedInUsers() {
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
	public List<String> orderHeaders() {
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
	public List<String> partyProfileDefaults() {
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
	public List<String> productReviews() {
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
	public List<String> productStoreSurveyAppls() {
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
	public List<String> quotes() {
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
	public List<String> segmentGroups() {
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
	public List<String> shoppingLists() {
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
	public List<String> taxAuthorityRateProducts() {
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
	public List<String> webSites() {
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
	public ProductStoreGroup getPrimaryStoreGroupId() {
		if (primaryStoreGroupId != null && ((EObject)primaryStoreGroupId).eIsProxy()) {
			InternalEObject oldPrimaryStoreGroupId = (InternalEObject)primaryStoreGroupId;
			primaryStoreGroupId = (ProductStoreGroup)eResolveProxy(oldPrimaryStoreGroupId);
			if (primaryStoreGroupId != oldPrimaryStoreGroupId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE__PRIMARY_STORE_GROUP_ID, oldPrimaryStoreGroupId, primaryStoreGroupId));
			}
		}
		return primaryStoreGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductStoreGroup basicGetPrimaryStoreGroupId() {
		return primaryStoreGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryStoreGroupId(ProductStoreGroup newPrimaryStoreGroupId) {
		ProductStoreGroup oldPrimaryStoreGroupId = primaryStoreGroupId;
		primaryStoreGroupId = newPrimaryStoreGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__PRIMARY_STORE_GROUP_ID, oldPrimaryStoreGroupId, primaryStoreGroupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isProdSearchExcludeVariants() {
		return prodSearchExcludeVariants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProdSearchExcludeVariants(boolean newProdSearchExcludeVariants) {
		boolean oldProdSearchExcludeVariants = prodSearchExcludeVariants;
		prodSearchExcludeVariants = newProdSearchExcludeVariants;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__PROD_SEARCH_EXCLUDE_VARIANTS, oldProdSearchExcludeVariants, prodSearchExcludeVariants));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isProrateShipping() {
		return prorateShipping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProrateShipping(boolean newProrateShipping) {
		boolean oldProrateShipping = prorateShipping;
		prorateShipping = newProrateShipping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__PRORATE_SHIPPING, oldProrateShipping, prorateShipping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isProrateTaxes() {
		return prorateTaxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProrateTaxes(boolean newProrateTaxes) {
		boolean oldProrateTaxes = prorateTaxes;
		prorateTaxes = newProrateTaxes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__PRORATE_TAXES, oldProrateTaxes, prorateTaxes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReqReturnInventoryReceive() {
		return reqReturnInventoryReceive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReqReturnInventoryReceive(boolean newReqReturnInventoryReceive) {
		boolean oldReqReturnInventoryReceive = reqReturnInventoryReceive;
		reqReturnInventoryReceive = newReqReturnInventoryReceive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__REQ_RETURN_INVENTORY_RECEIVE, oldReqReturnInventoryReceive, reqReturnInventoryReceive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReqShipAddrForDigItems() {
		return reqShipAddrForDigItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReqShipAddrForDigItems(boolean newReqShipAddrForDigItems) {
		boolean oldReqShipAddrForDigItems = reqShipAddrForDigItems;
		reqShipAddrForDigItems = newReqShipAddrForDigItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__REQ_SHIP_ADDR_FOR_DIG_ITEMS, oldReqShipAddrForDigItems, reqShipAddrForDigItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequireCustomerRole() {
		return requireCustomerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireCustomerRole(boolean newRequireCustomerRole) {
		boolean oldRequireCustomerRole = requireCustomerRole;
		requireCustomerRole = newRequireCustomerRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__REQUIRE_CUSTOMER_ROLE, oldRequireCustomerRole, requireCustomerRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequireInventory() {
		return requireInventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireInventory(boolean newRequireInventory) {
		boolean oldRequireInventory = requireInventory;
		requireInventory = newRequireInventory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__REQUIRE_INVENTORY, oldRequireInventory, requireInventory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getInventoryFacilityId() {
		if (inventoryFacilityId != null && ((EObject)inventoryFacilityId).eIsProxy()) {
			InternalEObject oldInventoryFacilityId = (InternalEObject)inventoryFacilityId;
			inventoryFacilityId = (Facility)eResolveProxy(oldInventoryFacilityId);
			if (inventoryFacilityId != oldInventoryFacilityId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE__INVENTORY_FACILITY_ID, oldInventoryFacilityId, inventoryFacilityId));
			}
		}
		return inventoryFacilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facility basicGetInventoryFacilityId() {
		return inventoryFacilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryFacilityId(Facility newInventoryFacilityId) {
		Facility oldInventoryFacilityId = inventoryFacilityId;
		inventoryFacilityId = newInventoryFacilityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__INVENTORY_FACILITY_ID, oldInventoryFacilityId, inventoryFacilityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsDemoStore() {
		return isDemoStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDemoStore(boolean newIsDemoStore) {
		boolean oldIsDemoStore = isDemoStore;
		isDemoStore = newIsDemoStore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__IS_DEMO_STORE, oldIsDemoStore, isDemoStore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsImmediatelyFulfilled() {
		return isImmediatelyFulfilled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsImmediatelyFulfilled(boolean newIsImmediatelyFulfilled) {
		boolean oldIsImmediatelyFulfilled = isImmediatelyFulfilled;
		isImmediatelyFulfilled = newIsImmediatelyFulfilled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__IS_IMMEDIATELY_FULFILLED, oldIsImmediatelyFulfilled, isImmediatelyFulfilled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductStoreId() {
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(String newProductStoreId) {
		String oldProductStoreId = productStoreId;
		productStoreId = newProductStoreId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAddToCartRemoveIncompat() {
		return addToCartRemoveIncompat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddToCartRemoveIncompat(boolean newAddToCartRemoveIncompat) {
		boolean oldAddToCartRemoveIncompat = addToCartRemoveIncompat;
		addToCartRemoveIncompat = newAddToCartRemoveIncompat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__ADD_TO_CART_REMOVE_INCOMPAT, oldAddToCartRemoveIncompat, addToCartRemoveIncompat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAddToCartReplaceUpsell() {
		return addToCartReplaceUpsell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddToCartReplaceUpsell(boolean newAddToCartReplaceUpsell) {
		boolean oldAddToCartReplaceUpsell = addToCartReplaceUpsell;
		addToCartReplaceUpsell = newAddToCartReplaceUpsell;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__ADD_TO_CART_REPLACE_UPSELL, oldAddToCartReplaceUpsell, addToCartReplaceUpsell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowComment() {
		return allowComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowComment(boolean newAllowComment) {
		boolean oldAllowComment = allowComment;
		allowComment = newAllowComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__ALLOW_COMMENT, oldAllowComment, allowComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowPassword() {
		return allowPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowPassword(boolean newAllowPassword) {
		boolean oldAllowPassword = allowPassword;
		allowPassword = newAllowPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE__ALLOW_PASSWORD, oldAllowPassword, allowPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.PRODUCT_STORE__PRODUCT_STORE_ID:
				return getProductStoreId();
			case StorePackage.PRODUCT_STORE__ADD_TO_CART_REMOVE_INCOMPAT:
				return isAddToCartRemoveIncompat();
			case StorePackage.PRODUCT_STORE__ADD_TO_CART_REPLACE_UPSELL:
				return isAddToCartReplaceUpsell();
			case StorePackage.PRODUCT_STORE__ALLOW_COMMENT:
				return isAllowComment();
			case StorePackage.PRODUCT_STORE__ALLOW_PASSWORD:
				return isAllowPassword();
			case StorePackage.PRODUCT_STORE__AUTH_DECLINED_MESSAGE:
				return getAuthDeclinedMessage();
			case StorePackage.PRODUCT_STORE__AUTH_ERROR_MESSAGE:
				return getAuthErrorMessage();
			case StorePackage.PRODUCT_STORE__AUTH_FRAUD_MESSAGE:
				return getAuthFraudMessage();
			case StorePackage.PRODUCT_STORE__AUTO_APPROVE_INVOICE:
				return isAutoApproveInvoice();
			case StorePackage.PRODUCT_STORE__AUTO_APPROVE_ORDER:
				return isAutoApproveOrder();
			case StorePackage.PRODUCT_STORE__AUTO_APPROVE_REVIEWS:
				return isAutoApproveReviews();
			case StorePackage.PRODUCT_STORE__AUTO_INVOICE_DIGITAL_ITEMS:
				return isAutoInvoiceDigitalItems();
			case StorePackage.PRODUCT_STORE__AUTO_ORDER_CC_TRY_EXP:
				return isAutoOrderCcTryExp();
			case StorePackage.PRODUCT_STORE__AUTO_ORDER_CC_TRY_LATER_MAX:
				return getAutoOrderCcTryLaterMax();
			case StorePackage.PRODUCT_STORE__AUTO_ORDER_CC_TRY_LATER_NSF:
				return isAutoOrderCcTryLaterNsf();
			case StorePackage.PRODUCT_STORE__AUTO_ORDER_CC_TRY_OTHER_CARDS:
				return isAutoOrderCcTryOtherCards();
			case StorePackage.PRODUCT_STORE__AUTO_SAVE_CART:
				return isAutoSaveCart();
			case StorePackage.PRODUCT_STORE__BALANCE_RES_ON_ORDER_CREATION:
				return isBalanceResOnOrderCreation();
			case StorePackage.PRODUCT_STORE__CHECK_GC_BALANCE:
				return isCheckGcBalance();
			case StorePackage.PRODUCT_STORE__CHECK_INVENTORY:
				return isCheckInventory();
			case StorePackage.PRODUCT_STORE__COMPANY_NAME:
				return getCompanyName();
			case StorePackage.PRODUCT_STORE__DAYS_TO_CANCEL_NON_PAY:
				return getDaysToCancelNonPay();
			case StorePackage.PRODUCT_STORE__DEFAULT_LOCALE_STRING:
				return getDefaultLocaleString();
			case StorePackage.PRODUCT_STORE__DEFAULT_PASSWORD:
				return getDefaultPassword();
			case StorePackage.PRODUCT_STORE__DEFAULT_TIME_ZONE_STRING:
				return getDefaultTimeZoneString();
			case StorePackage.PRODUCT_STORE__DIG_PROD_UPLOAD_CATEGORY_ID:
				return getDigProdUploadCategoryId();
			case StorePackage.PRODUCT_STORE__ENABLE_AUTO_SUGGESTION_LIST:
				return isEnableAutoSuggestionList();
			case StorePackage.PRODUCT_STORE__ENABLE_DIG_PROD_UPLOAD:
				return isEnableDigProdUpload();
			case StorePackage.PRODUCT_STORE__EXPLODE_ORDER_ITEMS:
				return isExplodeOrderItems();
			case StorePackage.PRODUCT_STORE__IS_DEMO_STORE:
				return isIsDemoStore();
			case StorePackage.PRODUCT_STORE__IS_IMMEDIATELY_FULFILLED:
				return isIsImmediatelyFulfilled();
			case StorePackage.PRODUCT_STORE__MANAGED_BY_LOT:
				return isManagedByLot();
			case StorePackage.PRODUCT_STORE__MANUAL_AUTH_IS_CAPTURE:
				return isManualAuthIsCapture();
			case StorePackage.PRODUCT_STORE__OLD_HEADER_LOGO:
				return getOldHeaderLogo();
			case StorePackage.PRODUCT_STORE__OLD_HEADER_MIDDLE_BACKGROUND:
				return getOldHeaderMiddleBackground();
			case StorePackage.PRODUCT_STORE__OLD_HEADER_RIGHT_BACKGROUND:
				return getOldHeaderRightBackground();
			case StorePackage.PRODUCT_STORE__OLD_STYLE_SHEET:
				return getOldStyleSheet();
			case StorePackage.PRODUCT_STORE__ONE_INVENTORY_FACILITY:
				return isOneInventoryFacility();
			case StorePackage.PRODUCT_STORE__ORDER_DECIMAL_QUANTITY:
				return isOrderDecimalQuantity();
			case StorePackage.PRODUCT_STORE__ORDER_NUMBER_PREFIX:
				return getOrderNumberPrefix();
			case StorePackage.PRODUCT_STORE__PROD_SEARCH_EXCLUDE_VARIANTS:
				return isProdSearchExcludeVariants();
			case StorePackage.PRODUCT_STORE__PRORATE_SHIPPING:
				return isProrateShipping();
			case StorePackage.PRODUCT_STORE__PRORATE_TAXES:
				return isProrateTaxes();
			case StorePackage.PRODUCT_STORE__REQ_RETURN_INVENTORY_RECEIVE:
				return isReqReturnInventoryReceive();
			case StorePackage.PRODUCT_STORE__REQ_SHIP_ADDR_FOR_DIG_ITEMS:
				return isReqShipAddrForDigItems();
			case StorePackage.PRODUCT_STORE__REQUIRE_CUSTOMER_ROLE:
				return isRequireCustomerRole();
			case StorePackage.PRODUCT_STORE__REQUIRE_INVENTORY:
				return isRequireInventory();
			case StorePackage.PRODUCT_STORE__RESERVE_INVENTORY:
				return isReserveInventory();
			case StorePackage.PRODUCT_STORE__RETRY_FAILED_AUTHS:
				return isRetryFailedAuths();
			case StorePackage.PRODUCT_STORE__SELECT_PAYMENT_TYPE_PER_ITEM:
				return isSelectPaymentTypePerItem();
			case StorePackage.PRODUCT_STORE__SET_OWNER_UPON_ISSUANCE:
				return isSetOwnerUponIssuance();
			case StorePackage.PRODUCT_STORE__SHIP_IF_CAPTURE_FAILS:
				return isShipIfCaptureFails();
			case StorePackage.PRODUCT_STORE__SHOW_CHECKOUT_GIFT_OPTIONS:
				return isShowCheckoutGiftOptions();
			case StorePackage.PRODUCT_STORE__SHOW_OUT_OF_STOCK_PRODUCTS:
				return isShowOutOfStockProducts();
			case StorePackage.PRODUCT_STORE__SHOW_PRICES_WITH_VAT_TAX:
				return isShowPricesWithVatTax();
			case StorePackage.PRODUCT_STORE__SHOW_TAX_IS_EXEMPT:
				return isShowTaxIsExempt();
			case StorePackage.PRODUCT_STORE__SPLIT_PAY_PREF_PER_SHP_GRP:
				return isSplitPayPrefPerShpGrp();
			case StorePackage.PRODUCT_STORE__STORE_CREDIT_VALID_DAYS:
				return getStoreCreditValidDays();
			case StorePackage.PRODUCT_STORE__STORE_NAME:
				return getStoreName();
			case StorePackage.PRODUCT_STORE__SUBTITLE:
				return getSubtitle();
			case StorePackage.PRODUCT_STORE__TITLE:
				return getTitle();
			case StorePackage.PRODUCT_STORE__USE_PRIMARY_EMAIL_USERNAME:
				return isUsePrimaryEmailUsername();
			case StorePackage.PRODUCT_STORE__VAT_TAX_AUTH_GEO_ID:
				return getVatTaxAuthGeoId();
			case StorePackage.PRODUCT_STORE__VAT_TAX_AUTH_PARTY_ID:
				return getVatTaxAuthPartyId();
			case StorePackage.PRODUCT_STORE__VIEW_CART_ON_ADD:
				return isViewCartOnAdd();
			case StorePackage.PRODUCT_STORE__VISUAL_THEME_ID:
				return getVisualThemeId();
			case StorePackage.PRODUCT_STORE__PRIMARY_STORE_GROUP_ID:
				if (resolve) return getPrimaryStoreGroupId();
				return basicGetPrimaryStoreGroupId();
			case StorePackage.PRODUCT_STORE__INVENTORY_FACILITY_ID:
				if (resolve) return getInventoryFacilityId();
				return basicGetInventoryFacilityId();
			case StorePackage.PRODUCT_STORE__RESERVE_ORDER_ENUM_ID:
				if (resolve) return getReserveOrderEnumId();
				return basicGetReserveOrderEnumId();
			case StorePackage.PRODUCT_STORE__REQUIREMENT_METHOD_ENUM_ID:
				if (resolve) return getRequirementMethodEnumId();
				return basicGetRequirementMethodEnumId();
			case StorePackage.PRODUCT_STORE__PAY_TO_PARTY_ID:
				if (resolve) return getPayToPartyId();
				return basicGetPayToPartyId();
			case StorePackage.PRODUCT_STORE__DEFAULT_CURRENCY_UOM_ID:
				if (resolve) return getDefaultCurrencyUomId();
				return basicGetDefaultCurrencyUomId();
			case StorePackage.PRODUCT_STORE__DEFAULT_SALES_CHANNEL_ENUM_ID:
				if (resolve) return getDefaultSalesChannelEnumId();
				return basicGetDefaultSalesChannelEnumId();
			case StorePackage.PRODUCT_STORE__HEADER_APPROVED_STATUS:
				if (resolve) return getHeaderApprovedStatus();
				return basicGetHeaderApprovedStatus();
			case StorePackage.PRODUCT_STORE__ITEM_APPROVED_STATUS:
				if (resolve) return getItemApprovedStatus();
				return basicGetItemApprovedStatus();
			case StorePackage.PRODUCT_STORE__DIGITAL_ITEM_APPROVED_STATUS:
				if (resolve) return getDigitalItemApprovedStatus();
				return basicGetDigitalItemApprovedStatus();
			case StorePackage.PRODUCT_STORE__HEADER_DECLINED_STATUS:
				if (resolve) return getHeaderDeclinedStatus();
				return basicGetHeaderDeclinedStatus();
			case StorePackage.PRODUCT_STORE__ITEM_DECLINED_STATUS:
				if (resolve) return getItemDeclinedStatus();
				return basicGetItemDeclinedStatus();
			case StorePackage.PRODUCT_STORE__HEADER_CANCEL_STATUS:
				if (resolve) return getHeaderCancelStatus();
				return basicGetHeaderCancelStatus();
			case StorePackage.PRODUCT_STORE__ITEM_CANCEL_STATUS:
				if (resolve) return getItemCancelStatus();
				return basicGetItemCancelStatus();
			case StorePackage.PRODUCT_STORE__STORE_CREDIT_ACCOUNT_ENUM_ID:
				if (resolve) return getStoreCreditAccountEnumId();
				return basicGetStoreCreditAccountEnumId();
			case StorePackage.PRODUCT_STORE__OAUTH2_GIT_HUBS:
				return getOAuth2GitHubs();
			case StorePackage.PRODUCT_STORE__OAUTH2_GOOGLES:
				return getOAuth2Googles();
			case StorePackage.PRODUCT_STORE__OAUTH2_LINKED_INS:
				return getOAuth2LinkedIns();
			case StorePackage.PRODUCT_STORE__PRODUCT_STORE_EMAIL_SETTINGS:
				return getProductStoreEmailSettings();
			case StorePackage.PRODUCT_STORE__PRODUCT_STORE_FIN_ACT_SETTINGS:
				return getProductStoreFinActSettings();
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
			case StorePackage.PRODUCT_STORE__PRODUCT_STORE_ID:
				setProductStoreId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE__ADD_TO_CART_REMOVE_INCOMPAT:
				setAddToCartRemoveIncompat((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__ADD_TO_CART_REPLACE_UPSELL:
				setAddToCartReplaceUpsell((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__ALLOW_COMMENT:
				setAllowComment((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__ALLOW_PASSWORD:
				setAllowPassword((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__AUTH_DECLINED_MESSAGE:
				setAuthDeclinedMessage((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE__AUTH_ERROR_MESSAGE:
				setAuthErrorMessage((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE__AUTH_FRAUD_MESSAGE:
				setAuthFraudMessage((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE__AUTO_APPROVE_INVOICE:
				setAutoApproveInvoice((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__AUTO_APPROVE_ORDER:
				setAutoApproveOrder((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__AUTO_APPROVE_REVIEWS:
				setAutoApproveReviews((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__AUTO_INVOICE_DIGITAL_ITEMS:
				setAutoInvoiceDigitalItems((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__AUTO_ORDER_CC_TRY_EXP:
				setAutoOrderCcTryExp((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__AUTO_ORDER_CC_TRY_LATER_MAX:
				setAutoOrderCcTryLaterMax((Long)newValue);
				return;
			case StorePackage.PRODUCT_STORE__AUTO_ORDER_CC_TRY_LATER_NSF:
				setAutoOrderCcTryLaterNsf((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__AUTO_ORDER_CC_TRY_OTHER_CARDS:
				setAutoOrderCcTryOtherCards((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__AUTO_SAVE_CART:
				setAutoSaveCart((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__BALANCE_RES_ON_ORDER_CREATION:
				setBalanceResOnOrderCreation((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__CHECK_GC_BALANCE:
				setCheckGcBalance((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__CHECK_INVENTORY:
				setCheckInventory((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__COMPANY_NAME:
				setCompanyName((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE__DAYS_TO_CANCEL_NON_PAY:
				setDaysToCancelNonPay((Long)newValue);
				return;
			case StorePackage.PRODUCT_STORE__DEFAULT_LOCALE_STRING:
				setDefaultLocaleString((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE__DEFAULT_PASSWORD:
				setDefaultPassword((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE__DEFAULT_TIME_ZONE_STRING:
				setDefaultTimeZoneString((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE__DIG_PROD_UPLOAD_CATEGORY_ID:
				setDigProdUploadCategoryId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE__ENABLE_AUTO_SUGGESTION_LIST:
				setEnableAutoSuggestionList((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__ENABLE_DIG_PROD_UPLOAD:
				setEnableDigProdUpload((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__EXPLODE_ORDER_ITEMS:
				setExplodeOrderItems((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__IS_DEMO_STORE:
				setIsDemoStore((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__IS_IMMEDIATELY_FULFILLED:
				setIsImmediatelyFulfilled((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__MANAGED_BY_LOT:
				setManagedByLot((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__MANUAL_AUTH_IS_CAPTURE:
				setManualAuthIsCapture((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__OLD_HEADER_LOGO:
				setOldHeaderLogo((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE__OLD_HEADER_MIDDLE_BACKGROUND:
				setOldHeaderMiddleBackground((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE__OLD_HEADER_RIGHT_BACKGROUND:
				setOldHeaderRightBackground((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE__OLD_STYLE_SHEET:
				setOldStyleSheet((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE__ONE_INVENTORY_FACILITY:
				setOneInventoryFacility((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__ORDER_DECIMAL_QUANTITY:
				setOrderDecimalQuantity((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__ORDER_NUMBER_PREFIX:
				setOrderNumberPrefix((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE__PROD_SEARCH_EXCLUDE_VARIANTS:
				setProdSearchExcludeVariants((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__PRORATE_SHIPPING:
				setProrateShipping((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__PRORATE_TAXES:
				setProrateTaxes((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__REQ_RETURN_INVENTORY_RECEIVE:
				setReqReturnInventoryReceive((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__REQ_SHIP_ADDR_FOR_DIG_ITEMS:
				setReqShipAddrForDigItems((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__REQUIRE_CUSTOMER_ROLE:
				setRequireCustomerRole((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__REQUIRE_INVENTORY:
				setRequireInventory((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__RESERVE_INVENTORY:
				setReserveInventory((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__RETRY_FAILED_AUTHS:
				setRetryFailedAuths((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__SELECT_PAYMENT_TYPE_PER_ITEM:
				setSelectPaymentTypePerItem((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__SET_OWNER_UPON_ISSUANCE:
				setSetOwnerUponIssuance((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__SHIP_IF_CAPTURE_FAILS:
				setShipIfCaptureFails((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__SHOW_CHECKOUT_GIFT_OPTIONS:
				setShowCheckoutGiftOptions((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__SHOW_OUT_OF_STOCK_PRODUCTS:
				setShowOutOfStockProducts((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__SHOW_PRICES_WITH_VAT_TAX:
				setShowPricesWithVatTax((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__SHOW_TAX_IS_EXEMPT:
				setShowTaxIsExempt((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__SPLIT_PAY_PREF_PER_SHP_GRP:
				setSplitPayPrefPerShpGrp((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__STORE_CREDIT_VALID_DAYS:
				setStoreCreditValidDays((Long)newValue);
				return;
			case StorePackage.PRODUCT_STORE__STORE_NAME:
				setStoreName((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE__SUBTITLE:
				setSubtitle((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE__TITLE:
				setTitle((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE__USE_PRIMARY_EMAIL_USERNAME:
				setUsePrimaryEmailUsername((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__VAT_TAX_AUTH_GEO_ID:
				setVatTaxAuthGeoId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE__VAT_TAX_AUTH_PARTY_ID:
				setVatTaxAuthPartyId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE__VIEW_CART_ON_ADD:
				setViewCartOnAdd((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE__VISUAL_THEME_ID:
				setVisualThemeId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE__PRIMARY_STORE_GROUP_ID:
				setPrimaryStoreGroupId((ProductStoreGroup)newValue);
				return;
			case StorePackage.PRODUCT_STORE__INVENTORY_FACILITY_ID:
				setInventoryFacilityId((Facility)newValue);
				return;
			case StorePackage.PRODUCT_STORE__RESERVE_ORDER_ENUM_ID:
				setReserveOrderEnumId((Enumeration)newValue);
				return;
			case StorePackage.PRODUCT_STORE__REQUIREMENT_METHOD_ENUM_ID:
				setRequirementMethodEnumId((Enumeration)newValue);
				return;
			case StorePackage.PRODUCT_STORE__PAY_TO_PARTY_ID:
				setPayToPartyId((Party)newValue);
				return;
			case StorePackage.PRODUCT_STORE__DEFAULT_CURRENCY_UOM_ID:
				setDefaultCurrencyUomId((Uom)newValue);
				return;
			case StorePackage.PRODUCT_STORE__DEFAULT_SALES_CHANNEL_ENUM_ID:
				setDefaultSalesChannelEnumId((Enumeration)newValue);
				return;
			case StorePackage.PRODUCT_STORE__HEADER_APPROVED_STATUS:
				setHeaderApprovedStatus((StatusItem)newValue);
				return;
			case StorePackage.PRODUCT_STORE__ITEM_APPROVED_STATUS:
				setItemApprovedStatus((StatusItem)newValue);
				return;
			case StorePackage.PRODUCT_STORE__DIGITAL_ITEM_APPROVED_STATUS:
				setDigitalItemApprovedStatus((StatusItem)newValue);
				return;
			case StorePackage.PRODUCT_STORE__HEADER_DECLINED_STATUS:
				setHeaderDeclinedStatus((StatusItem)newValue);
				return;
			case StorePackage.PRODUCT_STORE__ITEM_DECLINED_STATUS:
				setItemDeclinedStatus((StatusItem)newValue);
				return;
			case StorePackage.PRODUCT_STORE__HEADER_CANCEL_STATUS:
				setHeaderCancelStatus((StatusItem)newValue);
				return;
			case StorePackage.PRODUCT_STORE__ITEM_CANCEL_STATUS:
				setItemCancelStatus((StatusItem)newValue);
				return;
			case StorePackage.PRODUCT_STORE__STORE_CREDIT_ACCOUNT_ENUM_ID:
				setStoreCreditAccountEnumId((Enumeration)newValue);
				return;
			case StorePackage.PRODUCT_STORE__OAUTH2_GIT_HUBS:
				getOAuth2GitHubs().clear();
				getOAuth2GitHubs().addAll((Collection<? extends String>)newValue);
				return;
			case StorePackage.PRODUCT_STORE__OAUTH2_GOOGLES:
				getOAuth2Googles().clear();
				getOAuth2Googles().addAll((Collection<? extends String>)newValue);
				return;
			case StorePackage.PRODUCT_STORE__OAUTH2_LINKED_INS:
				getOAuth2LinkedIns().clear();
				getOAuth2LinkedIns().addAll((Collection<? extends String>)newValue);
				return;
			case StorePackage.PRODUCT_STORE__PRODUCT_STORE_EMAIL_SETTINGS:
				getProductStoreEmailSettings().clear();
				getProductStoreEmailSettings().addAll((Collection<? extends String>)newValue);
				return;
			case StorePackage.PRODUCT_STORE__PRODUCT_STORE_FIN_ACT_SETTINGS:
				getProductStoreFinActSettings().clear();
				getProductStoreFinActSettings().addAll((Collection<? extends String>)newValue);
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
			case StorePackage.PRODUCT_STORE__PRODUCT_STORE_ID:
				setProductStoreId(PRODUCT_STORE_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__ADD_TO_CART_REMOVE_INCOMPAT:
				setAddToCartRemoveIncompat(ADD_TO_CART_REMOVE_INCOMPAT_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__ADD_TO_CART_REPLACE_UPSELL:
				setAddToCartReplaceUpsell(ADD_TO_CART_REPLACE_UPSELL_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__ALLOW_COMMENT:
				setAllowComment(ALLOW_COMMENT_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__ALLOW_PASSWORD:
				setAllowPassword(ALLOW_PASSWORD_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__AUTH_DECLINED_MESSAGE:
				setAuthDeclinedMessage(AUTH_DECLINED_MESSAGE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__AUTH_ERROR_MESSAGE:
				setAuthErrorMessage(AUTH_ERROR_MESSAGE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__AUTH_FRAUD_MESSAGE:
				setAuthFraudMessage(AUTH_FRAUD_MESSAGE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__AUTO_APPROVE_INVOICE:
				setAutoApproveInvoice(AUTO_APPROVE_INVOICE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__AUTO_APPROVE_ORDER:
				setAutoApproveOrder(AUTO_APPROVE_ORDER_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__AUTO_APPROVE_REVIEWS:
				setAutoApproveReviews(AUTO_APPROVE_REVIEWS_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__AUTO_INVOICE_DIGITAL_ITEMS:
				setAutoInvoiceDigitalItems(AUTO_INVOICE_DIGITAL_ITEMS_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__AUTO_ORDER_CC_TRY_EXP:
				setAutoOrderCcTryExp(AUTO_ORDER_CC_TRY_EXP_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__AUTO_ORDER_CC_TRY_LATER_MAX:
				setAutoOrderCcTryLaterMax(AUTO_ORDER_CC_TRY_LATER_MAX_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__AUTO_ORDER_CC_TRY_LATER_NSF:
				setAutoOrderCcTryLaterNsf(AUTO_ORDER_CC_TRY_LATER_NSF_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__AUTO_ORDER_CC_TRY_OTHER_CARDS:
				setAutoOrderCcTryOtherCards(AUTO_ORDER_CC_TRY_OTHER_CARDS_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__AUTO_SAVE_CART:
				setAutoSaveCart(AUTO_SAVE_CART_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__BALANCE_RES_ON_ORDER_CREATION:
				setBalanceResOnOrderCreation(BALANCE_RES_ON_ORDER_CREATION_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__CHECK_GC_BALANCE:
				setCheckGcBalance(CHECK_GC_BALANCE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__CHECK_INVENTORY:
				setCheckInventory(CHECK_INVENTORY_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__COMPANY_NAME:
				setCompanyName(COMPANY_NAME_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__DAYS_TO_CANCEL_NON_PAY:
				setDaysToCancelNonPay(DAYS_TO_CANCEL_NON_PAY_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__DEFAULT_LOCALE_STRING:
				setDefaultLocaleString(DEFAULT_LOCALE_STRING_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__DEFAULT_PASSWORD:
				setDefaultPassword(DEFAULT_PASSWORD_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__DEFAULT_TIME_ZONE_STRING:
				setDefaultTimeZoneString(DEFAULT_TIME_ZONE_STRING_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__DIG_PROD_UPLOAD_CATEGORY_ID:
				setDigProdUploadCategoryId(DIG_PROD_UPLOAD_CATEGORY_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__ENABLE_AUTO_SUGGESTION_LIST:
				setEnableAutoSuggestionList(ENABLE_AUTO_SUGGESTION_LIST_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__ENABLE_DIG_PROD_UPLOAD:
				setEnableDigProdUpload(ENABLE_DIG_PROD_UPLOAD_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__EXPLODE_ORDER_ITEMS:
				setExplodeOrderItems(EXPLODE_ORDER_ITEMS_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__IS_DEMO_STORE:
				setIsDemoStore(IS_DEMO_STORE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__IS_IMMEDIATELY_FULFILLED:
				setIsImmediatelyFulfilled(IS_IMMEDIATELY_FULFILLED_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__MANAGED_BY_LOT:
				setManagedByLot(MANAGED_BY_LOT_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__MANUAL_AUTH_IS_CAPTURE:
				setManualAuthIsCapture(MANUAL_AUTH_IS_CAPTURE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__OLD_HEADER_LOGO:
				setOldHeaderLogo(OLD_HEADER_LOGO_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__OLD_HEADER_MIDDLE_BACKGROUND:
				setOldHeaderMiddleBackground(OLD_HEADER_MIDDLE_BACKGROUND_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__OLD_HEADER_RIGHT_BACKGROUND:
				setOldHeaderRightBackground(OLD_HEADER_RIGHT_BACKGROUND_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__OLD_STYLE_SHEET:
				setOldStyleSheet(OLD_STYLE_SHEET_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__ONE_INVENTORY_FACILITY:
				setOneInventoryFacility(ONE_INVENTORY_FACILITY_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__ORDER_DECIMAL_QUANTITY:
				setOrderDecimalQuantity(ORDER_DECIMAL_QUANTITY_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__ORDER_NUMBER_PREFIX:
				setOrderNumberPrefix(ORDER_NUMBER_PREFIX_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__PROD_SEARCH_EXCLUDE_VARIANTS:
				setProdSearchExcludeVariants(PROD_SEARCH_EXCLUDE_VARIANTS_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__PRORATE_SHIPPING:
				setProrateShipping(PRORATE_SHIPPING_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__PRORATE_TAXES:
				setProrateTaxes(PRORATE_TAXES_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__REQ_RETURN_INVENTORY_RECEIVE:
				setReqReturnInventoryReceive(REQ_RETURN_INVENTORY_RECEIVE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__REQ_SHIP_ADDR_FOR_DIG_ITEMS:
				setReqShipAddrForDigItems(REQ_SHIP_ADDR_FOR_DIG_ITEMS_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__REQUIRE_CUSTOMER_ROLE:
				setRequireCustomerRole(REQUIRE_CUSTOMER_ROLE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__REQUIRE_INVENTORY:
				setRequireInventory(REQUIRE_INVENTORY_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__RESERVE_INVENTORY:
				setReserveInventory(RESERVE_INVENTORY_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__RETRY_FAILED_AUTHS:
				setRetryFailedAuths(RETRY_FAILED_AUTHS_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__SELECT_PAYMENT_TYPE_PER_ITEM:
				setSelectPaymentTypePerItem(SELECT_PAYMENT_TYPE_PER_ITEM_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__SET_OWNER_UPON_ISSUANCE:
				setSetOwnerUponIssuance(SET_OWNER_UPON_ISSUANCE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__SHIP_IF_CAPTURE_FAILS:
				setShipIfCaptureFails(SHIP_IF_CAPTURE_FAILS_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__SHOW_CHECKOUT_GIFT_OPTIONS:
				setShowCheckoutGiftOptions(SHOW_CHECKOUT_GIFT_OPTIONS_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__SHOW_OUT_OF_STOCK_PRODUCTS:
				setShowOutOfStockProducts(SHOW_OUT_OF_STOCK_PRODUCTS_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__SHOW_PRICES_WITH_VAT_TAX:
				setShowPricesWithVatTax(SHOW_PRICES_WITH_VAT_TAX_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__SHOW_TAX_IS_EXEMPT:
				setShowTaxIsExempt(SHOW_TAX_IS_EXEMPT_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__SPLIT_PAY_PREF_PER_SHP_GRP:
				setSplitPayPrefPerShpGrp(SPLIT_PAY_PREF_PER_SHP_GRP_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__STORE_CREDIT_VALID_DAYS:
				setStoreCreditValidDays(STORE_CREDIT_VALID_DAYS_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__STORE_NAME:
				setStoreName(STORE_NAME_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__SUBTITLE:
				setSubtitle(SUBTITLE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__USE_PRIMARY_EMAIL_USERNAME:
				setUsePrimaryEmailUsername(USE_PRIMARY_EMAIL_USERNAME_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__VAT_TAX_AUTH_GEO_ID:
				setVatTaxAuthGeoId(VAT_TAX_AUTH_GEO_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__VAT_TAX_AUTH_PARTY_ID:
				setVatTaxAuthPartyId(VAT_TAX_AUTH_PARTY_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__VIEW_CART_ON_ADD:
				setViewCartOnAdd(VIEW_CART_ON_ADD_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__VISUAL_THEME_ID:
				setVisualThemeId(VISUAL_THEME_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE__PRIMARY_STORE_GROUP_ID:
				setPrimaryStoreGroupId((ProductStoreGroup)null);
				return;
			case StorePackage.PRODUCT_STORE__INVENTORY_FACILITY_ID:
				setInventoryFacilityId((Facility)null);
				return;
			case StorePackage.PRODUCT_STORE__RESERVE_ORDER_ENUM_ID:
				setReserveOrderEnumId((Enumeration)null);
				return;
			case StorePackage.PRODUCT_STORE__REQUIREMENT_METHOD_ENUM_ID:
				setRequirementMethodEnumId((Enumeration)null);
				return;
			case StorePackage.PRODUCT_STORE__PAY_TO_PARTY_ID:
				setPayToPartyId((Party)null);
				return;
			case StorePackage.PRODUCT_STORE__DEFAULT_CURRENCY_UOM_ID:
				setDefaultCurrencyUomId((Uom)null);
				return;
			case StorePackage.PRODUCT_STORE__DEFAULT_SALES_CHANNEL_ENUM_ID:
				setDefaultSalesChannelEnumId((Enumeration)null);
				return;
			case StorePackage.PRODUCT_STORE__HEADER_APPROVED_STATUS:
				setHeaderApprovedStatus((StatusItem)null);
				return;
			case StorePackage.PRODUCT_STORE__ITEM_APPROVED_STATUS:
				setItemApprovedStatus((StatusItem)null);
				return;
			case StorePackage.PRODUCT_STORE__DIGITAL_ITEM_APPROVED_STATUS:
				setDigitalItemApprovedStatus((StatusItem)null);
				return;
			case StorePackage.PRODUCT_STORE__HEADER_DECLINED_STATUS:
				setHeaderDeclinedStatus((StatusItem)null);
				return;
			case StorePackage.PRODUCT_STORE__ITEM_DECLINED_STATUS:
				setItemDeclinedStatus((StatusItem)null);
				return;
			case StorePackage.PRODUCT_STORE__HEADER_CANCEL_STATUS:
				setHeaderCancelStatus((StatusItem)null);
				return;
			case StorePackage.PRODUCT_STORE__ITEM_CANCEL_STATUS:
				setItemCancelStatus((StatusItem)null);
				return;
			case StorePackage.PRODUCT_STORE__STORE_CREDIT_ACCOUNT_ENUM_ID:
				setStoreCreditAccountEnumId((Enumeration)null);
				return;
			case StorePackage.PRODUCT_STORE__OAUTH2_GIT_HUBS:
				getOAuth2GitHubs().clear();
				return;
			case StorePackage.PRODUCT_STORE__OAUTH2_GOOGLES:
				getOAuth2Googles().clear();
				return;
			case StorePackage.PRODUCT_STORE__OAUTH2_LINKED_INS:
				getOAuth2LinkedIns().clear();
				return;
			case StorePackage.PRODUCT_STORE__PRODUCT_STORE_EMAIL_SETTINGS:
				getProductStoreEmailSettings().clear();
				return;
			case StorePackage.PRODUCT_STORE__PRODUCT_STORE_FIN_ACT_SETTINGS:
				getProductStoreFinActSettings().clear();
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
			case StorePackage.PRODUCT_STORE__PRODUCT_STORE_ID:
				return PRODUCT_STORE_ID_EDEFAULT == null ? productStoreId != null : !PRODUCT_STORE_ID_EDEFAULT.equals(productStoreId);
			case StorePackage.PRODUCT_STORE__ADD_TO_CART_REMOVE_INCOMPAT:
				return addToCartRemoveIncompat != ADD_TO_CART_REMOVE_INCOMPAT_EDEFAULT;
			case StorePackage.PRODUCT_STORE__ADD_TO_CART_REPLACE_UPSELL:
				return addToCartReplaceUpsell != ADD_TO_CART_REPLACE_UPSELL_EDEFAULT;
			case StorePackage.PRODUCT_STORE__ALLOW_COMMENT:
				return allowComment != ALLOW_COMMENT_EDEFAULT;
			case StorePackage.PRODUCT_STORE__ALLOW_PASSWORD:
				return allowPassword != ALLOW_PASSWORD_EDEFAULT;
			case StorePackage.PRODUCT_STORE__AUTH_DECLINED_MESSAGE:
				return AUTH_DECLINED_MESSAGE_EDEFAULT == null ? authDeclinedMessage != null : !AUTH_DECLINED_MESSAGE_EDEFAULT.equals(authDeclinedMessage);
			case StorePackage.PRODUCT_STORE__AUTH_ERROR_MESSAGE:
				return AUTH_ERROR_MESSAGE_EDEFAULT == null ? authErrorMessage != null : !AUTH_ERROR_MESSAGE_EDEFAULT.equals(authErrorMessage);
			case StorePackage.PRODUCT_STORE__AUTH_FRAUD_MESSAGE:
				return AUTH_FRAUD_MESSAGE_EDEFAULT == null ? authFraudMessage != null : !AUTH_FRAUD_MESSAGE_EDEFAULT.equals(authFraudMessage);
			case StorePackage.PRODUCT_STORE__AUTO_APPROVE_INVOICE:
				return autoApproveInvoice != AUTO_APPROVE_INVOICE_EDEFAULT;
			case StorePackage.PRODUCT_STORE__AUTO_APPROVE_ORDER:
				return autoApproveOrder != AUTO_APPROVE_ORDER_EDEFAULT;
			case StorePackage.PRODUCT_STORE__AUTO_APPROVE_REVIEWS:
				return autoApproveReviews != AUTO_APPROVE_REVIEWS_EDEFAULT;
			case StorePackage.PRODUCT_STORE__AUTO_INVOICE_DIGITAL_ITEMS:
				return autoInvoiceDigitalItems != AUTO_INVOICE_DIGITAL_ITEMS_EDEFAULT;
			case StorePackage.PRODUCT_STORE__AUTO_ORDER_CC_TRY_EXP:
				return autoOrderCcTryExp != AUTO_ORDER_CC_TRY_EXP_EDEFAULT;
			case StorePackage.PRODUCT_STORE__AUTO_ORDER_CC_TRY_LATER_MAX:
				return autoOrderCcTryLaterMax != AUTO_ORDER_CC_TRY_LATER_MAX_EDEFAULT;
			case StorePackage.PRODUCT_STORE__AUTO_ORDER_CC_TRY_LATER_NSF:
				return autoOrderCcTryLaterNsf != AUTO_ORDER_CC_TRY_LATER_NSF_EDEFAULT;
			case StorePackage.PRODUCT_STORE__AUTO_ORDER_CC_TRY_OTHER_CARDS:
				return autoOrderCcTryOtherCards != AUTO_ORDER_CC_TRY_OTHER_CARDS_EDEFAULT;
			case StorePackage.PRODUCT_STORE__AUTO_SAVE_CART:
				return autoSaveCart != AUTO_SAVE_CART_EDEFAULT;
			case StorePackage.PRODUCT_STORE__BALANCE_RES_ON_ORDER_CREATION:
				return balanceResOnOrderCreation != BALANCE_RES_ON_ORDER_CREATION_EDEFAULT;
			case StorePackage.PRODUCT_STORE__CHECK_GC_BALANCE:
				return checkGcBalance != CHECK_GC_BALANCE_EDEFAULT;
			case StorePackage.PRODUCT_STORE__CHECK_INVENTORY:
				return checkInventory != CHECK_INVENTORY_EDEFAULT;
			case StorePackage.PRODUCT_STORE__COMPANY_NAME:
				return COMPANY_NAME_EDEFAULT == null ? companyName != null : !COMPANY_NAME_EDEFAULT.equals(companyName);
			case StorePackage.PRODUCT_STORE__DAYS_TO_CANCEL_NON_PAY:
				return daysToCancelNonPay != DAYS_TO_CANCEL_NON_PAY_EDEFAULT;
			case StorePackage.PRODUCT_STORE__DEFAULT_LOCALE_STRING:
				return DEFAULT_LOCALE_STRING_EDEFAULT == null ? defaultLocaleString != null : !DEFAULT_LOCALE_STRING_EDEFAULT.equals(defaultLocaleString);
			case StorePackage.PRODUCT_STORE__DEFAULT_PASSWORD:
				return DEFAULT_PASSWORD_EDEFAULT == null ? defaultPassword != null : !DEFAULT_PASSWORD_EDEFAULT.equals(defaultPassword);
			case StorePackage.PRODUCT_STORE__DEFAULT_TIME_ZONE_STRING:
				return DEFAULT_TIME_ZONE_STRING_EDEFAULT == null ? defaultTimeZoneString != null : !DEFAULT_TIME_ZONE_STRING_EDEFAULT.equals(defaultTimeZoneString);
			case StorePackage.PRODUCT_STORE__DIG_PROD_UPLOAD_CATEGORY_ID:
				return DIG_PROD_UPLOAD_CATEGORY_ID_EDEFAULT == null ? digProdUploadCategoryId != null : !DIG_PROD_UPLOAD_CATEGORY_ID_EDEFAULT.equals(digProdUploadCategoryId);
			case StorePackage.PRODUCT_STORE__ENABLE_AUTO_SUGGESTION_LIST:
				return enableAutoSuggestionList != ENABLE_AUTO_SUGGESTION_LIST_EDEFAULT;
			case StorePackage.PRODUCT_STORE__ENABLE_DIG_PROD_UPLOAD:
				return enableDigProdUpload != ENABLE_DIG_PROD_UPLOAD_EDEFAULT;
			case StorePackage.PRODUCT_STORE__EXPLODE_ORDER_ITEMS:
				return explodeOrderItems != EXPLODE_ORDER_ITEMS_EDEFAULT;
			case StorePackage.PRODUCT_STORE__IS_DEMO_STORE:
				return isDemoStore != IS_DEMO_STORE_EDEFAULT;
			case StorePackage.PRODUCT_STORE__IS_IMMEDIATELY_FULFILLED:
				return isImmediatelyFulfilled != IS_IMMEDIATELY_FULFILLED_EDEFAULT;
			case StorePackage.PRODUCT_STORE__MANAGED_BY_LOT:
				return managedByLot != MANAGED_BY_LOT_EDEFAULT;
			case StorePackage.PRODUCT_STORE__MANUAL_AUTH_IS_CAPTURE:
				return manualAuthIsCapture != MANUAL_AUTH_IS_CAPTURE_EDEFAULT;
			case StorePackage.PRODUCT_STORE__OLD_HEADER_LOGO:
				return OLD_HEADER_LOGO_EDEFAULT == null ? oldHeaderLogo != null : !OLD_HEADER_LOGO_EDEFAULT.equals(oldHeaderLogo);
			case StorePackage.PRODUCT_STORE__OLD_HEADER_MIDDLE_BACKGROUND:
				return OLD_HEADER_MIDDLE_BACKGROUND_EDEFAULT == null ? oldHeaderMiddleBackground != null : !OLD_HEADER_MIDDLE_BACKGROUND_EDEFAULT.equals(oldHeaderMiddleBackground);
			case StorePackage.PRODUCT_STORE__OLD_HEADER_RIGHT_BACKGROUND:
				return OLD_HEADER_RIGHT_BACKGROUND_EDEFAULT == null ? oldHeaderRightBackground != null : !OLD_HEADER_RIGHT_BACKGROUND_EDEFAULT.equals(oldHeaderRightBackground);
			case StorePackage.PRODUCT_STORE__OLD_STYLE_SHEET:
				return OLD_STYLE_SHEET_EDEFAULT == null ? oldStyleSheet != null : !OLD_STYLE_SHEET_EDEFAULT.equals(oldStyleSheet);
			case StorePackage.PRODUCT_STORE__ONE_INVENTORY_FACILITY:
				return oneInventoryFacility != ONE_INVENTORY_FACILITY_EDEFAULT;
			case StorePackage.PRODUCT_STORE__ORDER_DECIMAL_QUANTITY:
				return orderDecimalQuantity != ORDER_DECIMAL_QUANTITY_EDEFAULT;
			case StorePackage.PRODUCT_STORE__ORDER_NUMBER_PREFIX:
				return ORDER_NUMBER_PREFIX_EDEFAULT == null ? orderNumberPrefix != null : !ORDER_NUMBER_PREFIX_EDEFAULT.equals(orderNumberPrefix);
			case StorePackage.PRODUCT_STORE__PROD_SEARCH_EXCLUDE_VARIANTS:
				return prodSearchExcludeVariants != PROD_SEARCH_EXCLUDE_VARIANTS_EDEFAULT;
			case StorePackage.PRODUCT_STORE__PRORATE_SHIPPING:
				return prorateShipping != PRORATE_SHIPPING_EDEFAULT;
			case StorePackage.PRODUCT_STORE__PRORATE_TAXES:
				return prorateTaxes != PRORATE_TAXES_EDEFAULT;
			case StorePackage.PRODUCT_STORE__REQ_RETURN_INVENTORY_RECEIVE:
				return reqReturnInventoryReceive != REQ_RETURN_INVENTORY_RECEIVE_EDEFAULT;
			case StorePackage.PRODUCT_STORE__REQ_SHIP_ADDR_FOR_DIG_ITEMS:
				return reqShipAddrForDigItems != REQ_SHIP_ADDR_FOR_DIG_ITEMS_EDEFAULT;
			case StorePackage.PRODUCT_STORE__REQUIRE_CUSTOMER_ROLE:
				return requireCustomerRole != REQUIRE_CUSTOMER_ROLE_EDEFAULT;
			case StorePackage.PRODUCT_STORE__REQUIRE_INVENTORY:
				return requireInventory != REQUIRE_INVENTORY_EDEFAULT;
			case StorePackage.PRODUCT_STORE__RESERVE_INVENTORY:
				return reserveInventory != RESERVE_INVENTORY_EDEFAULT;
			case StorePackage.PRODUCT_STORE__RETRY_FAILED_AUTHS:
				return retryFailedAuths != RETRY_FAILED_AUTHS_EDEFAULT;
			case StorePackage.PRODUCT_STORE__SELECT_PAYMENT_TYPE_PER_ITEM:
				return selectPaymentTypePerItem != SELECT_PAYMENT_TYPE_PER_ITEM_EDEFAULT;
			case StorePackage.PRODUCT_STORE__SET_OWNER_UPON_ISSUANCE:
				return setOwnerUponIssuance != SET_OWNER_UPON_ISSUANCE_EDEFAULT;
			case StorePackage.PRODUCT_STORE__SHIP_IF_CAPTURE_FAILS:
				return shipIfCaptureFails != SHIP_IF_CAPTURE_FAILS_EDEFAULT;
			case StorePackage.PRODUCT_STORE__SHOW_CHECKOUT_GIFT_OPTIONS:
				return showCheckoutGiftOptions != SHOW_CHECKOUT_GIFT_OPTIONS_EDEFAULT;
			case StorePackage.PRODUCT_STORE__SHOW_OUT_OF_STOCK_PRODUCTS:
				return showOutOfStockProducts != SHOW_OUT_OF_STOCK_PRODUCTS_EDEFAULT;
			case StorePackage.PRODUCT_STORE__SHOW_PRICES_WITH_VAT_TAX:
				return showPricesWithVatTax != SHOW_PRICES_WITH_VAT_TAX_EDEFAULT;
			case StorePackage.PRODUCT_STORE__SHOW_TAX_IS_EXEMPT:
				return showTaxIsExempt != SHOW_TAX_IS_EXEMPT_EDEFAULT;
			case StorePackage.PRODUCT_STORE__SPLIT_PAY_PREF_PER_SHP_GRP:
				return splitPayPrefPerShpGrp != SPLIT_PAY_PREF_PER_SHP_GRP_EDEFAULT;
			case StorePackage.PRODUCT_STORE__STORE_CREDIT_VALID_DAYS:
				return storeCreditValidDays != STORE_CREDIT_VALID_DAYS_EDEFAULT;
			case StorePackage.PRODUCT_STORE__STORE_NAME:
				return STORE_NAME_EDEFAULT == null ? storeName != null : !STORE_NAME_EDEFAULT.equals(storeName);
			case StorePackage.PRODUCT_STORE__SUBTITLE:
				return SUBTITLE_EDEFAULT == null ? subtitle != null : !SUBTITLE_EDEFAULT.equals(subtitle);
			case StorePackage.PRODUCT_STORE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case StorePackage.PRODUCT_STORE__USE_PRIMARY_EMAIL_USERNAME:
				return usePrimaryEmailUsername != USE_PRIMARY_EMAIL_USERNAME_EDEFAULT;
			case StorePackage.PRODUCT_STORE__VAT_TAX_AUTH_GEO_ID:
				return VAT_TAX_AUTH_GEO_ID_EDEFAULT == null ? vatTaxAuthGeoId != null : !VAT_TAX_AUTH_GEO_ID_EDEFAULT.equals(vatTaxAuthGeoId);
			case StorePackage.PRODUCT_STORE__VAT_TAX_AUTH_PARTY_ID:
				return VAT_TAX_AUTH_PARTY_ID_EDEFAULT == null ? vatTaxAuthPartyId != null : !VAT_TAX_AUTH_PARTY_ID_EDEFAULT.equals(vatTaxAuthPartyId);
			case StorePackage.PRODUCT_STORE__VIEW_CART_ON_ADD:
				return viewCartOnAdd != VIEW_CART_ON_ADD_EDEFAULT;
			case StorePackage.PRODUCT_STORE__VISUAL_THEME_ID:
				return VISUAL_THEME_ID_EDEFAULT == null ? visualThemeId != null : !VISUAL_THEME_ID_EDEFAULT.equals(visualThemeId);
			case StorePackage.PRODUCT_STORE__PRIMARY_STORE_GROUP_ID:
				return primaryStoreGroupId != null;
			case StorePackage.PRODUCT_STORE__INVENTORY_FACILITY_ID:
				return inventoryFacilityId != null;
			case StorePackage.PRODUCT_STORE__RESERVE_ORDER_ENUM_ID:
				return reserveOrderEnumId != null;
			case StorePackage.PRODUCT_STORE__REQUIREMENT_METHOD_ENUM_ID:
				return requirementMethodEnumId != null;
			case StorePackage.PRODUCT_STORE__PAY_TO_PARTY_ID:
				return payToPartyId != null;
			case StorePackage.PRODUCT_STORE__DEFAULT_CURRENCY_UOM_ID:
				return defaultCurrencyUomId != null;
			case StorePackage.PRODUCT_STORE__DEFAULT_SALES_CHANNEL_ENUM_ID:
				return defaultSalesChannelEnumId != null;
			case StorePackage.PRODUCT_STORE__HEADER_APPROVED_STATUS:
				return headerApprovedStatus != null;
			case StorePackage.PRODUCT_STORE__ITEM_APPROVED_STATUS:
				return itemApprovedStatus != null;
			case StorePackage.PRODUCT_STORE__DIGITAL_ITEM_APPROVED_STATUS:
				return digitalItemApprovedStatus != null;
			case StorePackage.PRODUCT_STORE__HEADER_DECLINED_STATUS:
				return headerDeclinedStatus != null;
			case StorePackage.PRODUCT_STORE__ITEM_DECLINED_STATUS:
				return itemDeclinedStatus != null;
			case StorePackage.PRODUCT_STORE__HEADER_CANCEL_STATUS:
				return headerCancelStatus != null;
			case StorePackage.PRODUCT_STORE__ITEM_CANCEL_STATUS:
				return itemCancelStatus != null;
			case StorePackage.PRODUCT_STORE__STORE_CREDIT_ACCOUNT_ENUM_ID:
				return storeCreditAccountEnumId != null;
			case StorePackage.PRODUCT_STORE__OAUTH2_GIT_HUBS:
				return oAuth2GitHubs != null && !oAuth2GitHubs.isEmpty();
			case StorePackage.PRODUCT_STORE__OAUTH2_GOOGLES:
				return oAuth2Googles != null && !oAuth2Googles.isEmpty();
			case StorePackage.PRODUCT_STORE__OAUTH2_LINKED_INS:
				return oAuth2LinkedIns != null && !oAuth2LinkedIns.isEmpty();
			case StorePackage.PRODUCT_STORE__PRODUCT_STORE_EMAIL_SETTINGS:
				return productStoreEmailSettings != null && !productStoreEmailSettings.isEmpty();
			case StorePackage.PRODUCT_STORE__PRODUCT_STORE_FIN_ACT_SETTINGS:
				return productStoreFinActSettings != null && !productStoreFinActSettings.isEmpty();
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
		result.append(" (productStoreId: ");
		result.append(productStoreId);
		result.append(", addToCartRemoveIncompat: ");
		result.append(addToCartRemoveIncompat);
		result.append(", addToCartReplaceUpsell: ");
		result.append(addToCartReplaceUpsell);
		result.append(", allowComment: ");
		result.append(allowComment);
		result.append(", allowPassword: ");
		result.append(allowPassword);
		result.append(", authDeclinedMessage: ");
		result.append(authDeclinedMessage);
		result.append(", authErrorMessage: ");
		result.append(authErrorMessage);
		result.append(", authFraudMessage: ");
		result.append(authFraudMessage);
		result.append(", autoApproveInvoice: ");
		result.append(autoApproveInvoice);
		result.append(", autoApproveOrder: ");
		result.append(autoApproveOrder);
		result.append(", autoApproveReviews: ");
		result.append(autoApproveReviews);
		result.append(", autoInvoiceDigitalItems: ");
		result.append(autoInvoiceDigitalItems);
		result.append(", autoOrderCcTryExp: ");
		result.append(autoOrderCcTryExp);
		result.append(", autoOrderCcTryLaterMax: ");
		result.append(autoOrderCcTryLaterMax);
		result.append(", autoOrderCcTryLaterNsf: ");
		result.append(autoOrderCcTryLaterNsf);
		result.append(", autoOrderCcTryOtherCards: ");
		result.append(autoOrderCcTryOtherCards);
		result.append(", autoSaveCart: ");
		result.append(autoSaveCart);
		result.append(", balanceResOnOrderCreation: ");
		result.append(balanceResOnOrderCreation);
		result.append(", checkGcBalance: ");
		result.append(checkGcBalance);
		result.append(", checkInventory: ");
		result.append(checkInventory);
		result.append(", companyName: ");
		result.append(companyName);
		result.append(", daysToCancelNonPay: ");
		result.append(daysToCancelNonPay);
		result.append(", defaultLocaleString: ");
		result.append(defaultLocaleString);
		result.append(", defaultPassword: ");
		result.append(defaultPassword);
		result.append(", defaultTimeZoneString: ");
		result.append(defaultTimeZoneString);
		result.append(", digProdUploadCategoryId: ");
		result.append(digProdUploadCategoryId);
		result.append(", enableAutoSuggestionList: ");
		result.append(enableAutoSuggestionList);
		result.append(", enableDigProdUpload: ");
		result.append(enableDigProdUpload);
		result.append(", explodeOrderItems: ");
		result.append(explodeOrderItems);
		result.append(", isDemoStore: ");
		result.append(isDemoStore);
		result.append(", isImmediatelyFulfilled: ");
		result.append(isImmediatelyFulfilled);
		result.append(", managedByLot: ");
		result.append(managedByLot);
		result.append(", manualAuthIsCapture: ");
		result.append(manualAuthIsCapture);
		result.append(", oldHeaderLogo: ");
		result.append(oldHeaderLogo);
		result.append(", oldHeaderMiddleBackground: ");
		result.append(oldHeaderMiddleBackground);
		result.append(", oldHeaderRightBackground: ");
		result.append(oldHeaderRightBackground);
		result.append(", oldStyleSheet: ");
		result.append(oldStyleSheet);
		result.append(", oneInventoryFacility: ");
		result.append(oneInventoryFacility);
		result.append(", orderDecimalQuantity: ");
		result.append(orderDecimalQuantity);
		result.append(", orderNumberPrefix: ");
		result.append(orderNumberPrefix);
		result.append(", prodSearchExcludeVariants: ");
		result.append(prodSearchExcludeVariants);
		result.append(", prorateShipping: ");
		result.append(prorateShipping);
		result.append(", prorateTaxes: ");
		result.append(prorateTaxes);
		result.append(", reqReturnInventoryReceive: ");
		result.append(reqReturnInventoryReceive);
		result.append(", reqShipAddrForDigItems: ");
		result.append(reqShipAddrForDigItems);
		result.append(", requireCustomerRole: ");
		result.append(requireCustomerRole);
		result.append(", requireInventory: ");
		result.append(requireInventory);
		result.append(", reserveInventory: ");
		result.append(reserveInventory);
		result.append(", retryFailedAuths: ");
		result.append(retryFailedAuths);
		result.append(", selectPaymentTypePerItem: ");
		result.append(selectPaymentTypePerItem);
		result.append(", setOwnerUponIssuance: ");
		result.append(setOwnerUponIssuance);
		result.append(", shipIfCaptureFails: ");
		result.append(shipIfCaptureFails);
		result.append(", showCheckoutGiftOptions: ");
		result.append(showCheckoutGiftOptions);
		result.append(", showOutOfStockProducts: ");
		result.append(showOutOfStockProducts);
		result.append(", showPricesWithVatTax: ");
		result.append(showPricesWithVatTax);
		result.append(", showTaxIsExempt: ");
		result.append(showTaxIsExempt);
		result.append(", splitPayPrefPerShpGrp: ");
		result.append(splitPayPrefPerShpGrp);
		result.append(", storeCreditValidDays: ");
		result.append(storeCreditValidDays);
		result.append(", storeName: ");
		result.append(storeName);
		result.append(", subtitle: ");
		result.append(subtitle);
		result.append(", title: ");
		result.append(title);
		result.append(", usePrimaryEmailUsername: ");
		result.append(usePrimaryEmailUsername);
		result.append(", vatTaxAuthGeoId: ");
		result.append(vatTaxAuthGeoId);
		result.append(", vatTaxAuthPartyId: ");
		result.append(vatTaxAuthPartyId);
		result.append(", viewCartOnAdd: ");
		result.append(viewCartOnAdd);
		result.append(", visualThemeId: ");
		result.append(visualThemeId);
		result.append(", oAuth2GitHubs: ");
		result.append(oAuth2GitHubs);
		result.append(", oAuth2Googles: ");
		result.append(oAuth2Googles);
		result.append(", oAuth2LinkedIns: ");
		result.append(oAuth2LinkedIns);
		result.append(", productStoreEmailSettings: ");
		result.append(productStoreEmailSettings);
		result.append(", productStoreFinActSettings: ");
		result.append(productStoreFinActSettings);
		result.append(')');
		return result.toString();
	}

} //ProductStoreImpl
