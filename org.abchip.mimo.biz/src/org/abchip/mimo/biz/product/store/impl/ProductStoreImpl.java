/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store.impl;

import java.util.List;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.passport.OAuth2GitHub;
import org.abchip.mimo.biz.passport.OAuth2Google;
import org.abchip.mimo.biz.passport.OAuth2LinkedIn;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.abchip.mimo.biz.product.store.ProductStoreEmailSetting;
import org.abchip.mimo.biz.product.store.ProductStoreFinActSetting;
import org.abchip.mimo.biz.product.store.ProductStoreGroup;
import org.abchip.mimo.biz.product.store.StorePackage;
import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getDefaultCurrencyUomId <em>Default Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getDefaultLocaleString <em>Default Locale String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getDefaultPassword <em>Default Password</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getDefaultSalesChannelEnumId <em>Default Sales Channel Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getDefaultTimeZoneString <em>Default Time Zone String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getDigProdUploadCategoryId <em>Dig Prod Upload Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getDigitalItemApprovedStatus <em>Digital Item Approved Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isEnableAutoSuggestionList <em>Enable Auto Suggestion List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isEnableDigProdUpload <em>Enable Dig Prod Upload</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isExplodeOrderItems <em>Explode Order Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getHeaderApprovedStatus <em>Header Approved Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getHeaderCancelStatus <em>Header Cancel Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getHeaderDeclinedStatus <em>Header Declined Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getInventoryFacilityId <em>Inventory Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isIsDemoStore <em>Is Demo Store</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isIsImmediatelyFulfilled <em>Is Immediately Fulfilled</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getItemApprovedStatus <em>Item Approved Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getItemCancelStatus <em>Item Cancel Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getItemDeclinedStatus <em>Item Declined Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isManagedByLot <em>Managed By Lot</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isManualAuthIsCapture <em>Manual Auth Is Capture</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getOAuth2GitHubs <em>OAuth2 Git Hubs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getOAuth2Googles <em>OAuth2 Googles</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getOAuth2LinkedIns <em>OAuth2 Linked Ins</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getOldHeaderLogo <em>Old Header Logo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getOldHeaderMiddleBackground <em>Old Header Middle Background</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getOldHeaderRightBackground <em>Old Header Right Background</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getOldStyleSheet <em>Old Style Sheet</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isOneInventoryFacility <em>One Inventory Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isOrderDecimalQuantity <em>Order Decimal Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getOrderNumberPrefix <em>Order Number Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getPayToPartyId <em>Pay To Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getPrimaryStoreGroupId <em>Primary Store Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isProdSearchExcludeVariants <em>Prod Search Exclude Variants</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getProductStoreEmailSettings <em>Product Store Email Settings</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getProductStoreFinActSettings <em>Product Store Fin Act Settings</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isProrateShipping <em>Prorate Shipping</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isProrateTaxes <em>Prorate Taxes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isReqReturnInventoryReceive <em>Req Return Inventory Receive</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isReqShipAddrForDigItems <em>Req Ship Addr For Dig Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isRequireCustomerRole <em>Require Customer Role</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isRequireInventory <em>Require Inventory</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getRequirementMethodEnumId <em>Requirement Method Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isReserveInventory <em>Reserve Inventory</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getReserveOrderEnumId <em>Reserve Order Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isRetryFailedAuths <em>Retry Failed Auths</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isSelectPaymentTypePerItem <em>Select Payment Type Per Item</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isSetOwnerUponIssuance <em>Set Owner Upon Issuance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isShipIfCaptureFails <em>Ship If Capture Fails</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isShowCheckoutGiftOptions <em>Show Checkout Gift Options</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isShowOutOfStockProducts <em>Show Out Of Stock Products</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isShowPricesWithVatTax <em>Show Prices With Vat Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isShowTaxIsExempt <em>Show Tax Is Exempt</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isSplitPayPrefPerShpGrp <em>Split Pay Pref Per Shp Grp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getStoreCreditAccountEnumId <em>Store Credit Account Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getStoreCreditValidDays <em>Store Credit Valid Days</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getStoreName <em>Store Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isUsePrimaryEmailUsername <em>Use Primary Email Username</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getVatTaxAuthGeoId <em>Vat Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getVatTaxAuthPartyId <em>Vat Tax Auth Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#isViewCartOnAdd <em>View Cart On Add</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl#getVisualThemeId <em>Visual Theme Id</em>}</li>
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
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE__AUTH_DECLINED_MESSAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthDeclinedMessage(String newAuthDeclinedMessage) {
		eSet(StorePackage.Literals.PRODUCT_STORE__AUTH_DECLINED_MESSAGE, newAuthDeclinedMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthErrorMessage() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE__AUTH_ERROR_MESSAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthErrorMessage(String newAuthErrorMessage) {
		eSet(StorePackage.Literals.PRODUCT_STORE__AUTH_ERROR_MESSAGE, newAuthErrorMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthFraudMessage() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE__AUTH_FRAUD_MESSAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthFraudMessage(String newAuthFraudMessage) {
		eSet(StorePackage.Literals.PRODUCT_STORE__AUTH_FRAUD_MESSAGE, newAuthFraudMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutoApproveInvoice() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__AUTO_APPROVE_INVOICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoApproveInvoice(boolean newAutoApproveInvoice) {
		eSet(StorePackage.Literals.PRODUCT_STORE__AUTO_APPROVE_INVOICE, newAutoApproveInvoice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutoApproveOrder() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__AUTO_APPROVE_ORDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoApproveOrder(boolean newAutoApproveOrder) {
		eSet(StorePackage.Literals.PRODUCT_STORE__AUTO_APPROVE_ORDER, newAutoApproveOrder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutoApproveReviews() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__AUTO_APPROVE_REVIEWS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoApproveReviews(boolean newAutoApproveReviews) {
		eSet(StorePackage.Literals.PRODUCT_STORE__AUTO_APPROVE_REVIEWS, newAutoApproveReviews);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutoInvoiceDigitalItems() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__AUTO_INVOICE_DIGITAL_ITEMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoInvoiceDigitalItems(boolean newAutoInvoiceDigitalItems) {
		eSet(StorePackage.Literals.PRODUCT_STORE__AUTO_INVOICE_DIGITAL_ITEMS, newAutoInvoiceDigitalItems);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutoOrderCcTryExp() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__AUTO_ORDER_CC_TRY_EXP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoOrderCcTryExp(boolean newAutoOrderCcTryExp) {
		eSet(StorePackage.Literals.PRODUCT_STORE__AUTO_ORDER_CC_TRY_EXP, newAutoOrderCcTryExp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getAutoOrderCcTryLaterMax() {
		return (Long)eGet(StorePackage.Literals.PRODUCT_STORE__AUTO_ORDER_CC_TRY_LATER_MAX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoOrderCcTryLaterMax(long newAutoOrderCcTryLaterMax) {
		eSet(StorePackage.Literals.PRODUCT_STORE__AUTO_ORDER_CC_TRY_LATER_MAX, newAutoOrderCcTryLaterMax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutoOrderCcTryLaterNsf() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__AUTO_ORDER_CC_TRY_LATER_NSF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoOrderCcTryLaterNsf(boolean newAutoOrderCcTryLaterNsf) {
		eSet(StorePackage.Literals.PRODUCT_STORE__AUTO_ORDER_CC_TRY_LATER_NSF, newAutoOrderCcTryLaterNsf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutoOrderCcTryOtherCards() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__AUTO_ORDER_CC_TRY_OTHER_CARDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoOrderCcTryOtherCards(boolean newAutoOrderCcTryOtherCards) {
		eSet(StorePackage.Literals.PRODUCT_STORE__AUTO_ORDER_CC_TRY_OTHER_CARDS, newAutoOrderCcTryOtherCards);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutoSaveCart() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__AUTO_SAVE_CART, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoSaveCart(boolean newAutoSaveCart) {
		eSet(StorePackage.Literals.PRODUCT_STORE__AUTO_SAVE_CART, newAutoSaveCart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBalanceResOnOrderCreation() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__BALANCE_RES_ON_ORDER_CREATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBalanceResOnOrderCreation(boolean newBalanceResOnOrderCreation) {
		eSet(StorePackage.Literals.PRODUCT_STORE__BALANCE_RES_ON_ORDER_CREATION, newBalanceResOnOrderCreation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCheckGcBalance() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__CHECK_GC_BALANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheckGcBalance(boolean newCheckGcBalance) {
		eSet(StorePackage.Literals.PRODUCT_STORE__CHECK_GC_BALANCE, newCheckGcBalance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCheckInventory() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__CHECK_INVENTORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheckInventory(boolean newCheckInventory) {
		eSet(StorePackage.Literals.PRODUCT_STORE__CHECK_INVENTORY, newCheckInventory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompanyName() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE__COMPANY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompanyName(String newCompanyName) {
		eSet(StorePackage.Literals.PRODUCT_STORE__COMPANY_NAME, newCompanyName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDaysToCancelNonPay() {
		return (Long)eGet(StorePackage.Literals.PRODUCT_STORE__DAYS_TO_CANCEL_NON_PAY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDaysToCancelNonPay(long newDaysToCancelNonPay) {
		eSet(StorePackage.Literals.PRODUCT_STORE__DAYS_TO_CANCEL_NON_PAY, newDaysToCancelNonPay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getDefaultCurrencyUomId() {
		return (Uom)eGet(StorePackage.Literals.PRODUCT_STORE__DEFAULT_CURRENCY_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultCurrencyUomId(Uom newDefaultCurrencyUomId) {
		eSet(StorePackage.Literals.PRODUCT_STORE__DEFAULT_CURRENCY_UOM_ID, newDefaultCurrencyUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultLocaleString() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE__DEFAULT_LOCALE_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultLocaleString(String newDefaultLocaleString) {
		eSet(StorePackage.Literals.PRODUCT_STORE__DEFAULT_LOCALE_STRING, newDefaultLocaleString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultPassword() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE__DEFAULT_PASSWORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultPassword(String newDefaultPassword) {
		eSet(StorePackage.Literals.PRODUCT_STORE__DEFAULT_PASSWORD, newDefaultPassword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getDefaultSalesChannelEnumId() {
		return (Enumeration)eGet(StorePackage.Literals.PRODUCT_STORE__DEFAULT_SALES_CHANNEL_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultSalesChannelEnumId(Enumeration newDefaultSalesChannelEnumId) {
		eSet(StorePackage.Literals.PRODUCT_STORE__DEFAULT_SALES_CHANNEL_ENUM_ID, newDefaultSalesChannelEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultTimeZoneString() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE__DEFAULT_TIME_ZONE_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultTimeZoneString(String newDefaultTimeZoneString) {
		eSet(StorePackage.Literals.PRODUCT_STORE__DEFAULT_TIME_ZONE_STRING, newDefaultTimeZoneString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDigProdUploadCategoryId() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE__DIG_PROD_UPLOAD_CATEGORY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDigProdUploadCategoryId(String newDigProdUploadCategoryId) {
		eSet(StorePackage.Literals.PRODUCT_STORE__DIG_PROD_UPLOAD_CATEGORY_ID, newDigProdUploadCategoryId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnableAutoSuggestionList() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__ENABLE_AUTO_SUGGESTION_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableAutoSuggestionList(boolean newEnableAutoSuggestionList) {
		eSet(StorePackage.Literals.PRODUCT_STORE__ENABLE_AUTO_SUGGESTION_LIST, newEnableAutoSuggestionList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnableDigProdUpload() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__ENABLE_DIG_PROD_UPLOAD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableDigProdUpload(boolean newEnableDigProdUpload) {
		eSet(StorePackage.Literals.PRODUCT_STORE__ENABLE_DIG_PROD_UPLOAD, newEnableDigProdUpload);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExplodeOrderItems() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__EXPLODE_ORDER_ITEMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExplodeOrderItems(boolean newExplodeOrderItems) {
		eSet(StorePackage.Literals.PRODUCT_STORE__EXPLODE_ORDER_ITEMS, newExplodeOrderItems);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsDemoStore() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__IS_DEMO_STORE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDemoStore(boolean newIsDemoStore) {
		eSet(StorePackage.Literals.PRODUCT_STORE__IS_DEMO_STORE, newIsDemoStore);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsImmediatelyFulfilled() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__IS_IMMEDIATELY_FULFILLED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsImmediatelyFulfilled(boolean newIsImmediatelyFulfilled) {
		eSet(StorePackage.Literals.PRODUCT_STORE__IS_IMMEDIATELY_FULFILLED, newIsImmediatelyFulfilled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isManagedByLot() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__MANAGED_BY_LOT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManagedByLot(boolean newManagedByLot) {
		eSet(StorePackage.Literals.PRODUCT_STORE__MANAGED_BY_LOT, newManagedByLot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isManualAuthIsCapture() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__MANUAL_AUTH_IS_CAPTURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManualAuthIsCapture(boolean newManualAuthIsCapture) {
		eSet(StorePackage.Literals.PRODUCT_STORE__MANUAL_AUTH_IS_CAPTURE, newManualAuthIsCapture);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<OAuth2GitHub> getOAuth2GitHubs() {
		return (List<OAuth2GitHub>)eGet(StorePackage.Literals.PRODUCT_STORE__OAUTH2_GIT_HUBS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<OAuth2Google> getOAuth2Googles() {
		return (List<OAuth2Google>)eGet(StorePackage.Literals.PRODUCT_STORE__OAUTH2_GOOGLES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<OAuth2LinkedIn> getOAuth2LinkedIns() {
		return (List<OAuth2LinkedIn>)eGet(StorePackage.Literals.PRODUCT_STORE__OAUTH2_LINKED_INS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getDigitalItemApprovedStatus() {
		return (StatusItem)eGet(StorePackage.Literals.PRODUCT_STORE__DIGITAL_ITEM_APPROVED_STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDigitalItemApprovedStatus(StatusItem newDigitalItemApprovedStatus) {
		eSet(StorePackage.Literals.PRODUCT_STORE__DIGITAL_ITEM_APPROVED_STATUS, newDigitalItemApprovedStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getHeaderApprovedStatus() {
		return (StatusItem)eGet(StorePackage.Literals.PRODUCT_STORE__HEADER_APPROVED_STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeaderApprovedStatus(StatusItem newHeaderApprovedStatus) {
		eSet(StorePackage.Literals.PRODUCT_STORE__HEADER_APPROVED_STATUS, newHeaderApprovedStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getHeaderCancelStatus() {
		return (StatusItem)eGet(StorePackage.Literals.PRODUCT_STORE__HEADER_CANCEL_STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeaderCancelStatus(StatusItem newHeaderCancelStatus) {
		eSet(StorePackage.Literals.PRODUCT_STORE__HEADER_CANCEL_STATUS, newHeaderCancelStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getHeaderDeclinedStatus() {
		return (StatusItem)eGet(StorePackage.Literals.PRODUCT_STORE__HEADER_DECLINED_STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeaderDeclinedStatus(StatusItem newHeaderDeclinedStatus) {
		eSet(StorePackage.Literals.PRODUCT_STORE__HEADER_DECLINED_STATUS, newHeaderDeclinedStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getItemApprovedStatus() {
		return (StatusItem)eGet(StorePackage.Literals.PRODUCT_STORE__ITEM_APPROVED_STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemApprovedStatus(StatusItem newItemApprovedStatus) {
		eSet(StorePackage.Literals.PRODUCT_STORE__ITEM_APPROVED_STATUS, newItemApprovedStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getItemCancelStatus() {
		return (StatusItem)eGet(StorePackage.Literals.PRODUCT_STORE__ITEM_CANCEL_STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemCancelStatus(StatusItem newItemCancelStatus) {
		eSet(StorePackage.Literals.PRODUCT_STORE__ITEM_CANCEL_STATUS, newItemCancelStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getItemDeclinedStatus() {
		return (StatusItem)eGet(StorePackage.Literals.PRODUCT_STORE__ITEM_DECLINED_STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemDeclinedStatus(StatusItem newItemDeclinedStatus) {
		eSet(StorePackage.Literals.PRODUCT_STORE__ITEM_DECLINED_STATUS, newItemDeclinedStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOldHeaderLogo() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE__OLD_HEADER_LOGO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldHeaderLogo(String newOldHeaderLogo) {
		eSet(StorePackage.Literals.PRODUCT_STORE__OLD_HEADER_LOGO, newOldHeaderLogo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOldHeaderMiddleBackground() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE__OLD_HEADER_MIDDLE_BACKGROUND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldHeaderMiddleBackground(String newOldHeaderMiddleBackground) {
		eSet(StorePackage.Literals.PRODUCT_STORE__OLD_HEADER_MIDDLE_BACKGROUND, newOldHeaderMiddleBackground);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOldHeaderRightBackground() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE__OLD_HEADER_RIGHT_BACKGROUND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldHeaderRightBackground(String newOldHeaderRightBackground) {
		eSet(StorePackage.Literals.PRODUCT_STORE__OLD_HEADER_RIGHT_BACKGROUND, newOldHeaderRightBackground);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOldStyleSheet() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE__OLD_STYLE_SHEET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldStyleSheet(String newOldStyleSheet) {
		eSet(StorePackage.Literals.PRODUCT_STORE__OLD_STYLE_SHEET, newOldStyleSheet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOneInventoryFacility() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__ONE_INVENTORY_FACILITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOneInventoryFacility(boolean newOneInventoryFacility) {
		eSet(StorePackage.Literals.PRODUCT_STORE__ONE_INVENTORY_FACILITY, newOneInventoryFacility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOrderDecimalQuantity() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__ORDER_DECIMAL_QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderDecimalQuantity(boolean newOrderDecimalQuantity) {
		eSet(StorePackage.Literals.PRODUCT_STORE__ORDER_DECIMAL_QUANTITY, newOrderDecimalQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderNumberPrefix() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE__ORDER_NUMBER_PREFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderNumberPrefix(String newOrderNumberPrefix) {
		eSet(StorePackage.Literals.PRODUCT_STORE__ORDER_NUMBER_PREFIX, newOrderNumberPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReqReturnInventoryReceive() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__REQ_RETURN_INVENTORY_RECEIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReqReturnInventoryReceive(boolean newReqReturnInventoryReceive) {
		eSet(StorePackage.Literals.PRODUCT_STORE__REQ_RETURN_INVENTORY_RECEIVE, newReqReturnInventoryReceive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReqShipAddrForDigItems() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__REQ_SHIP_ADDR_FOR_DIG_ITEMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReqShipAddrForDigItems(boolean newReqShipAddrForDigItems) {
		eSet(StorePackage.Literals.PRODUCT_STORE__REQ_SHIP_ADDR_FOR_DIG_ITEMS, newReqShipAddrForDigItems);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequireCustomerRole() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__REQUIRE_CUSTOMER_ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireCustomerRole(boolean newRequireCustomerRole) {
		eSet(StorePackage.Literals.PRODUCT_STORE__REQUIRE_CUSTOMER_ROLE, newRequireCustomerRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequireInventory() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__REQUIRE_INVENTORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireInventory(boolean newRequireInventory) {
		eSet(StorePackage.Literals.PRODUCT_STORE__REQUIRE_INVENTORY, newRequireInventory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReserveInventory() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__RESERVE_INVENTORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserveInventory(boolean newReserveInventory) {
		eSet(StorePackage.Literals.PRODUCT_STORE__RESERVE_INVENTORY, newReserveInventory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRetryFailedAuths() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__RETRY_FAILED_AUTHS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetryFailedAuths(boolean newRetryFailedAuths) {
		eSet(StorePackage.Literals.PRODUCT_STORE__RETRY_FAILED_AUTHS, newRetryFailedAuths);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSelectPaymentTypePerItem() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__SELECT_PAYMENT_TYPE_PER_ITEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelectPaymentTypePerItem(boolean newSelectPaymentTypePerItem) {
		eSet(StorePackage.Literals.PRODUCT_STORE__SELECT_PAYMENT_TYPE_PER_ITEM, newSelectPaymentTypePerItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnerUponIssuance() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__SET_OWNER_UPON_ISSUANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetOwnerUponIssuance(boolean newSetOwnerUponIssuance) {
		eSet(StorePackage.Literals.PRODUCT_STORE__SET_OWNER_UPON_ISSUANCE, newSetOwnerUponIssuance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isShipIfCaptureFails() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__SHIP_IF_CAPTURE_FAILS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipIfCaptureFails(boolean newShipIfCaptureFails) {
		eSet(StorePackage.Literals.PRODUCT_STORE__SHIP_IF_CAPTURE_FAILS, newShipIfCaptureFails);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isShowCheckoutGiftOptions() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__SHOW_CHECKOUT_GIFT_OPTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShowCheckoutGiftOptions(boolean newShowCheckoutGiftOptions) {
		eSet(StorePackage.Literals.PRODUCT_STORE__SHOW_CHECKOUT_GIFT_OPTIONS, newShowCheckoutGiftOptions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isShowOutOfStockProducts() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__SHOW_OUT_OF_STOCK_PRODUCTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShowOutOfStockProducts(boolean newShowOutOfStockProducts) {
		eSet(StorePackage.Literals.PRODUCT_STORE__SHOW_OUT_OF_STOCK_PRODUCTS, newShowOutOfStockProducts);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isShowPricesWithVatTax() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__SHOW_PRICES_WITH_VAT_TAX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShowPricesWithVatTax(boolean newShowPricesWithVatTax) {
		eSet(StorePackage.Literals.PRODUCT_STORE__SHOW_PRICES_WITH_VAT_TAX, newShowPricesWithVatTax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isShowTaxIsExempt() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__SHOW_TAX_IS_EXEMPT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShowTaxIsExempt(boolean newShowTaxIsExempt) {
		eSet(StorePackage.Literals.PRODUCT_STORE__SHOW_TAX_IS_EXEMPT, newShowTaxIsExempt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSplitPayPrefPerShpGrp() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__SPLIT_PAY_PREF_PER_SHP_GRP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSplitPayPrefPerShpGrp(boolean newSplitPayPrefPerShpGrp) {
		eSet(StorePackage.Literals.PRODUCT_STORE__SPLIT_PAY_PREF_PER_SHP_GRP, newSplitPayPrefPerShpGrp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPayToPartyId() {
		return (Party)eGet(StorePackage.Literals.PRODUCT_STORE__PAY_TO_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayToPartyId(Party newPayToPartyId) {
		eSet(StorePackage.Literals.PRODUCT_STORE__PAY_TO_PARTY_ID, newPayToPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getRequirementMethodEnumId() {
		return (Enumeration)eGet(StorePackage.Literals.PRODUCT_STORE__REQUIREMENT_METHOD_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirementMethodEnumId(Enumeration newRequirementMethodEnumId) {
		eSet(StorePackage.Literals.PRODUCT_STORE__REQUIREMENT_METHOD_ENUM_ID, newRequirementMethodEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getReserveOrderEnumId() {
		return (Enumeration)eGet(StorePackage.Literals.PRODUCT_STORE__RESERVE_ORDER_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserveOrderEnumId(Enumeration newReserveOrderEnumId) {
		eSet(StorePackage.Literals.PRODUCT_STORE__RESERVE_ORDER_ENUM_ID, newReserveOrderEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getStoreCreditAccountEnumId() {
		return (Enumeration)eGet(StorePackage.Literals.PRODUCT_STORE__STORE_CREDIT_ACCOUNT_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStoreCreditAccountEnumId(Enumeration newStoreCreditAccountEnumId) {
		eSet(StorePackage.Literals.PRODUCT_STORE__STORE_CREDIT_ACCOUNT_ENUM_ID, newStoreCreditAccountEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getStoreCreditValidDays() {
		return (Long)eGet(StorePackage.Literals.PRODUCT_STORE__STORE_CREDIT_VALID_DAYS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStoreCreditValidDays(long newStoreCreditValidDays) {
		eSet(StorePackage.Literals.PRODUCT_STORE__STORE_CREDIT_VALID_DAYS, newStoreCreditValidDays);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStoreName() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE__STORE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStoreName(String newStoreName) {
		eSet(StorePackage.Literals.PRODUCT_STORE__STORE_NAME, newStoreName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubtitle() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE__SUBTITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubtitle(String newSubtitle) {
		eSet(StorePackage.Literals.PRODUCT_STORE__SUBTITLE, newSubtitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE__TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		eSet(StorePackage.Literals.PRODUCT_STORE__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUsePrimaryEmailUsername() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__USE_PRIMARY_EMAIL_USERNAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsePrimaryEmailUsername(boolean newUsePrimaryEmailUsername) {
		eSet(StorePackage.Literals.PRODUCT_STORE__USE_PRIMARY_EMAIL_USERNAME, newUsePrimaryEmailUsername);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVatTaxAuthGeoId() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE__VAT_TAX_AUTH_GEO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVatTaxAuthGeoId(String newVatTaxAuthGeoId) {
		eSet(StorePackage.Literals.PRODUCT_STORE__VAT_TAX_AUTH_GEO_ID, newVatTaxAuthGeoId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVatTaxAuthPartyId() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE__VAT_TAX_AUTH_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVatTaxAuthPartyId(String newVatTaxAuthPartyId) {
		eSet(StorePackage.Literals.PRODUCT_STORE__VAT_TAX_AUTH_PARTY_ID, newVatTaxAuthPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isViewCartOnAdd() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__VIEW_CART_ON_ADD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewCartOnAdd(boolean newViewCartOnAdd) {
		eSet(StorePackage.Literals.PRODUCT_STORE__VIEW_CART_ON_ADD, newViewCartOnAdd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVisualThemeId() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE__VISUAL_THEME_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisualThemeId(String newVisualThemeId) {
		eSet(StorePackage.Literals.PRODUCT_STORE__VISUAL_THEME_ID, newVisualThemeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isProrateShipping() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__PRORATE_SHIPPING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProrateShipping(boolean newProrateShipping) {
		eSet(StorePackage.Literals.PRODUCT_STORE__PRORATE_SHIPPING, newProrateShipping);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isProrateTaxes() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__PRORATE_TAXES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProrateTaxes(boolean newProrateTaxes) {
		eSet(StorePackage.Literals.PRODUCT_STORE__PRORATE_TAXES, newProrateTaxes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStoreGroup getPrimaryStoreGroupId() {
		return (ProductStoreGroup)eGet(StorePackage.Literals.PRODUCT_STORE__PRIMARY_STORE_GROUP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryStoreGroupId(ProductStoreGroup newPrimaryStoreGroupId) {
		eSet(StorePackage.Literals.PRODUCT_STORE__PRIMARY_STORE_GROUP_ID, newPrimaryStoreGroupId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isProdSearchExcludeVariants() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__PROD_SEARCH_EXCLUDE_VARIANTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProdSearchExcludeVariants(boolean newProdSearchExcludeVariants) {
		eSet(StorePackage.Literals.PRODUCT_STORE__PROD_SEARCH_EXCLUDE_VARIANTS, newProdSearchExcludeVariants);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductStoreEmailSetting> getProductStoreEmailSettings() {
		return (List<ProductStoreEmailSetting>)eGet(StorePackage.Literals.PRODUCT_STORE__PRODUCT_STORE_EMAIL_SETTINGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductStoreFinActSetting> getProductStoreFinActSettings() {
		return (List<ProductStoreFinActSetting>)eGet(StorePackage.Literals.PRODUCT_STORE__PRODUCT_STORE_FIN_ACT_SETTINGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getInventoryFacilityId() {
		return (Facility)eGet(StorePackage.Literals.PRODUCT_STORE__INVENTORY_FACILITY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryFacilityId(Facility newInventoryFacilityId) {
		eSet(StorePackage.Literals.PRODUCT_STORE__INVENTORY_FACILITY_ID, newInventoryFacilityId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductStoreId() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE__PRODUCT_STORE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(String newProductStoreId) {
		eSet(StorePackage.Literals.PRODUCT_STORE__PRODUCT_STORE_ID, newProductStoreId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAddToCartRemoveIncompat() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__ADD_TO_CART_REMOVE_INCOMPAT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddToCartRemoveIncompat(boolean newAddToCartRemoveIncompat) {
		eSet(StorePackage.Literals.PRODUCT_STORE__ADD_TO_CART_REMOVE_INCOMPAT, newAddToCartRemoveIncompat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAddToCartReplaceUpsell() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__ADD_TO_CART_REPLACE_UPSELL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddToCartReplaceUpsell(boolean newAddToCartReplaceUpsell) {
		eSet(StorePackage.Literals.PRODUCT_STORE__ADD_TO_CART_REPLACE_UPSELL, newAddToCartReplaceUpsell);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowComment() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__ALLOW_COMMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowComment(boolean newAllowComment) {
		eSet(StorePackage.Literals.PRODUCT_STORE__ALLOW_COMMENT, newAllowComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowPassword() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE__ALLOW_PASSWORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowPassword(boolean newAllowPassword) {
		eSet(StorePackage.Literals.PRODUCT_STORE__ALLOW_PASSWORD, newAllowPassword);
	}

} //ProductStoreImpl
