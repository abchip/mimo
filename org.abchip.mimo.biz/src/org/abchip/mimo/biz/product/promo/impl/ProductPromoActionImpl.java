/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.promo.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.method.CustomMethod;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.order.OrderAdjustmentType;
import org.abchip.mimo.biz.product.promo.ProductPromoAction;
import org.abchip.mimo.biz.product.promo.PromoPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Promo Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoActionImpl#getProductPromoId <em>Product Promo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoActionImpl#getProductPromoRuleId <em>Product Promo Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoActionImpl#getProductPromoActionSeqId <em>Product Promo Action Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoActionImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoActionImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoActionImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoActionImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoActionImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoActionImpl#isUseCartQuantity <em>Use Cart Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoActionImpl#getProductPromoActionEnumId <em>Product Promo Action Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoActionImpl#getCustomMethodId <em>Custom Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoActionImpl#getOrderAdjustmentTypeId <em>Order Adjustment Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductPromoActionImpl extends BizEntityImpl implements ProductPromoAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getProductPromoId() <em>Product Promo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PROMO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPromoId() <em>Product Promo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoId()
	 * @generated
	 * @ordered
	 */
	protected String productPromoId = PRODUCT_PROMO_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductPromoRuleId() <em>Product Promo Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoRuleId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PROMO_RULE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPromoRuleId() <em>Product Promo Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoRuleId()
	 * @generated
	 * @ordered
	 */
	protected String productPromoRuleId = PRODUCT_PROMO_RULE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductPromoActionSeqId() <em>Product Promo Action Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoActionSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PROMO_ACTION_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPromoActionSeqId() <em>Product Promo Action Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoActionSeqId()
	 * @generated
	 * @ordered
	 */
	protected String productPromoActionSeqId = PRODUCT_PROMO_ACTION_SEQ_ID_EDEFAULT;

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
	 * The default value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected String partyId = PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected String productId = PRODUCT_ID_EDEFAULT;

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
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseCartQuantity() <em>Use Cart Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseCartQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_CART_QUANTITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseCartQuantity() <em>Use Cart Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseCartQuantity()
	 * @generated
	 * @ordered
	 */
	protected boolean useCartQuantity = USE_CART_QUANTITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductPromoActionEnumId() <em>Product Promo Action Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoActionEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration productPromoActionEnumId;

	/**
	 * The cached value of the '{@link #getCustomMethodId() <em>Custom Method Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomMethodId()
	 * @generated
	 * @ordered
	 */
	protected CustomMethod customMethodId;

	/**
	 * The cached value of the '{@link #getOrderAdjustmentTypeId() <em>Order Adjustment Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderAdjustmentTypeId()
	 * @generated
	 * @ordered
	 */
	protected OrderAdjustmentType orderAdjustmentTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductPromoActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PromoPackage.Literals.PRODUCT_PROMO_ACTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_ACTION__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomMethod getCustomMethodId() {
		if (customMethodId != null && ((EObject)customMethodId).eIsProxy()) {
			InternalEObject oldCustomMethodId = (InternalEObject)customMethodId;
			customMethodId = (CustomMethod)eResolveProxy(oldCustomMethodId);
			if (customMethodId != oldCustomMethodId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PromoPackage.PRODUCT_PROMO_ACTION__CUSTOM_METHOD_ID, oldCustomMethodId, customMethodId));
			}
		}
		return customMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomMethod basicGetCustomMethodId() {
		return customMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomMethodId(CustomMethod newCustomMethodId) {
		CustomMethod oldCustomMethodId = customMethodId;
		customMethodId = newCustomMethodId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_ACTION__CUSTOM_METHOD_ID, oldCustomMethodId, customMethodId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderAdjustmentType getOrderAdjustmentTypeId() {
		if (orderAdjustmentTypeId != null && ((EObject)orderAdjustmentTypeId).eIsProxy()) {
			InternalEObject oldOrderAdjustmentTypeId = (InternalEObject)orderAdjustmentTypeId;
			orderAdjustmentTypeId = (OrderAdjustmentType)eResolveProxy(oldOrderAdjustmentTypeId);
			if (orderAdjustmentTypeId != oldOrderAdjustmentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PromoPackage.PRODUCT_PROMO_ACTION__ORDER_ADJUSTMENT_TYPE_ID, oldOrderAdjustmentTypeId, orderAdjustmentTypeId));
			}
		}
		return orderAdjustmentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderAdjustmentType basicGetOrderAdjustmentTypeId() {
		return orderAdjustmentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderAdjustmentTypeId(OrderAdjustmentType newOrderAdjustmentTypeId) {
		OrderAdjustmentType oldOrderAdjustmentTypeId = orderAdjustmentTypeId;
		orderAdjustmentTypeId = newOrderAdjustmentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_ACTION__ORDER_ADJUSTMENT_TYPE_ID, oldOrderAdjustmentTypeId, orderAdjustmentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		String oldPartyId = partyId;
		partyId = newPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_ACTION__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(String newProductId) {
		String oldProductId = productId;
		productId = newProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_ACTION__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getProductPromoActionEnumId() {
		if (productPromoActionEnumId != null && ((EObject)productPromoActionEnumId).eIsProxy()) {
			InternalEObject oldProductPromoActionEnumId = (InternalEObject)productPromoActionEnumId;
			productPromoActionEnumId = (Enumeration)eResolveProxy(oldProductPromoActionEnumId);
			if (productPromoActionEnumId != oldProductPromoActionEnumId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PromoPackage.PRODUCT_PROMO_ACTION__PRODUCT_PROMO_ACTION_ENUM_ID, oldProductPromoActionEnumId, productPromoActionEnumId));
			}
		}
		return productPromoActionEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetProductPromoActionEnumId() {
		return productPromoActionEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoActionEnumId(Enumeration newProductPromoActionEnumId) {
		Enumeration oldProductPromoActionEnumId = productPromoActionEnumId;
		productPromoActionEnumId = newProductPromoActionEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_ACTION__PRODUCT_PROMO_ACTION_ENUM_ID, oldProductPromoActionEnumId, productPromoActionEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPromoActionSeqId() {
		return productPromoActionSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoActionSeqId(String newProductPromoActionSeqId) {
		String oldProductPromoActionSeqId = productPromoActionSeqId;
		productPromoActionSeqId = newProductPromoActionSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_ACTION__PRODUCT_PROMO_ACTION_SEQ_ID, oldProductPromoActionSeqId, productPromoActionSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPromoRuleId() {
		return productPromoRuleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoRuleId(String newProductPromoRuleId) {
		String oldProductPromoRuleId = productPromoRuleId;
		productPromoRuleId = newProductPromoRuleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_ACTION__PRODUCT_PROMO_RULE_ID, oldProductPromoRuleId, productPromoRuleId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_ACTION__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_ACTION__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseCartQuantity() {
		return useCartQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseCartQuantity(boolean newUseCartQuantity) {
		boolean oldUseCartQuantity = useCartQuantity;
		useCartQuantity = newUseCartQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_ACTION__USE_CART_QUANTITY, oldUseCartQuantity, useCartQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPromoId() {
		return productPromoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoId(String newProductPromoId) {
		String oldProductPromoId = productPromoId;
		productPromoId = newProductPromoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_ACTION__PRODUCT_PROMO_ID, oldProductPromoId, productPromoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PromoPackage.PRODUCT_PROMO_ACTION__PRODUCT_PROMO_ID:
				return getProductPromoId();
			case PromoPackage.PRODUCT_PROMO_ACTION__PRODUCT_PROMO_RULE_ID:
				return getProductPromoRuleId();
			case PromoPackage.PRODUCT_PROMO_ACTION__PRODUCT_PROMO_ACTION_SEQ_ID:
				return getProductPromoActionSeqId();
			case PromoPackage.PRODUCT_PROMO_ACTION__AMOUNT:
				return getAmount();
			case PromoPackage.PRODUCT_PROMO_ACTION__PARTY_ID:
				return getPartyId();
			case PromoPackage.PRODUCT_PROMO_ACTION__PRODUCT_ID:
				return getProductId();
			case PromoPackage.PRODUCT_PROMO_ACTION__QUANTITY:
				return getQuantity();
			case PromoPackage.PRODUCT_PROMO_ACTION__SERVICE_NAME:
				return getServiceName();
			case PromoPackage.PRODUCT_PROMO_ACTION__USE_CART_QUANTITY:
				return isUseCartQuantity();
			case PromoPackage.PRODUCT_PROMO_ACTION__PRODUCT_PROMO_ACTION_ENUM_ID:
				if (resolve) return getProductPromoActionEnumId();
				return basicGetProductPromoActionEnumId();
			case PromoPackage.PRODUCT_PROMO_ACTION__CUSTOM_METHOD_ID:
				if (resolve) return getCustomMethodId();
				return basicGetCustomMethodId();
			case PromoPackage.PRODUCT_PROMO_ACTION__ORDER_ADJUSTMENT_TYPE_ID:
				if (resolve) return getOrderAdjustmentTypeId();
				return basicGetOrderAdjustmentTypeId();
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
			case PromoPackage.PRODUCT_PROMO_ACTION__PRODUCT_PROMO_ID:
				setProductPromoId((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_ACTION__PRODUCT_PROMO_RULE_ID:
				setProductPromoRuleId((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_ACTION__PRODUCT_PROMO_ACTION_SEQ_ID:
				setProductPromoActionSeqId((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_ACTION__AMOUNT:
				setAmount((BigDecimal)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_ACTION__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_ACTION__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_ACTION__QUANTITY:
				setQuantity((BigDecimal)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_ACTION__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_ACTION__USE_CART_QUANTITY:
				setUseCartQuantity((Boolean)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_ACTION__PRODUCT_PROMO_ACTION_ENUM_ID:
				setProductPromoActionEnumId((Enumeration)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_ACTION__CUSTOM_METHOD_ID:
				setCustomMethodId((CustomMethod)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_ACTION__ORDER_ADJUSTMENT_TYPE_ID:
				setOrderAdjustmentTypeId((OrderAdjustmentType)newValue);
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
			case PromoPackage.PRODUCT_PROMO_ACTION__PRODUCT_PROMO_ID:
				setProductPromoId(PRODUCT_PROMO_ID_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_ACTION__PRODUCT_PROMO_RULE_ID:
				setProductPromoRuleId(PRODUCT_PROMO_RULE_ID_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_ACTION__PRODUCT_PROMO_ACTION_SEQ_ID:
				setProductPromoActionSeqId(PRODUCT_PROMO_ACTION_SEQ_ID_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_ACTION__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_ACTION__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_ACTION__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_ACTION__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_ACTION__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_ACTION__USE_CART_QUANTITY:
				setUseCartQuantity(USE_CART_QUANTITY_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_ACTION__PRODUCT_PROMO_ACTION_ENUM_ID:
				setProductPromoActionEnumId((Enumeration)null);
				return;
			case PromoPackage.PRODUCT_PROMO_ACTION__CUSTOM_METHOD_ID:
				setCustomMethodId((CustomMethod)null);
				return;
			case PromoPackage.PRODUCT_PROMO_ACTION__ORDER_ADJUSTMENT_TYPE_ID:
				setOrderAdjustmentTypeId((OrderAdjustmentType)null);
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
			case PromoPackage.PRODUCT_PROMO_ACTION__PRODUCT_PROMO_ID:
				return PRODUCT_PROMO_ID_EDEFAULT == null ? productPromoId != null : !PRODUCT_PROMO_ID_EDEFAULT.equals(productPromoId);
			case PromoPackage.PRODUCT_PROMO_ACTION__PRODUCT_PROMO_RULE_ID:
				return PRODUCT_PROMO_RULE_ID_EDEFAULT == null ? productPromoRuleId != null : !PRODUCT_PROMO_RULE_ID_EDEFAULT.equals(productPromoRuleId);
			case PromoPackage.PRODUCT_PROMO_ACTION__PRODUCT_PROMO_ACTION_SEQ_ID:
				return PRODUCT_PROMO_ACTION_SEQ_ID_EDEFAULT == null ? productPromoActionSeqId != null : !PRODUCT_PROMO_ACTION_SEQ_ID_EDEFAULT.equals(productPromoActionSeqId);
			case PromoPackage.PRODUCT_PROMO_ACTION__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case PromoPackage.PRODUCT_PROMO_ACTION__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case PromoPackage.PRODUCT_PROMO_ACTION__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case PromoPackage.PRODUCT_PROMO_ACTION__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case PromoPackage.PRODUCT_PROMO_ACTION__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case PromoPackage.PRODUCT_PROMO_ACTION__USE_CART_QUANTITY:
				return useCartQuantity != USE_CART_QUANTITY_EDEFAULT;
			case PromoPackage.PRODUCT_PROMO_ACTION__PRODUCT_PROMO_ACTION_ENUM_ID:
				return productPromoActionEnumId != null;
			case PromoPackage.PRODUCT_PROMO_ACTION__CUSTOM_METHOD_ID:
				return customMethodId != null;
			case PromoPackage.PRODUCT_PROMO_ACTION__ORDER_ADJUSTMENT_TYPE_ID:
				return orderAdjustmentTypeId != null;
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
		result.append(" (productPromoId: ");
		result.append(productPromoId);
		result.append(", productPromoRuleId: ");
		result.append(productPromoRuleId);
		result.append(", productPromoActionSeqId: ");
		result.append(productPromoActionSeqId);
		result.append(", amount: ");
		result.append(amount);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", productId: ");
		result.append(productId);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", serviceName: ");
		result.append(serviceName);
		result.append(", useCartQuantity: ");
		result.append(useCartQuantity);
		result.append(')');
		return result.toString();
	}

} //ProductPromoActionImpl
