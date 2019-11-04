/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.quote.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.humanres.ability.SkillType;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.quote.QuoteItem;
import org.abchip.mimo.biz.order.quote.QuotePackage;
import org.abchip.mimo.biz.order.request.CustRequest;
import org.abchip.mimo.biz.product.feature.ProductFeature;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.workeffort.workeffort.DeliverableType;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quote Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteItemImpl#getQuoteId <em>Quote Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteItemImpl#getQuoteItemSeqId <em>Quote Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteItemImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteItemImpl#getConfigId <em>Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteItemImpl#getCustRequestItemSeqId <em>Cust Request Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteItemImpl#getEstimatedDeliveryDate <em>Estimated Delivery Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteItemImpl#isIsPromo <em>Is Promo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteItemImpl#getLeadTimeDays <em>Lead Time Days</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteItemImpl#getQuoteUnitPrice <em>Quote Unit Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteItemImpl#getReservLength <em>Reserv Length</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteItemImpl#getReservPersons <em>Reserv Persons</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteItemImpl#getReservStart <em>Reserv Start</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteItemImpl#getSelectedAmount <em>Selected Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteItemImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteItemImpl#getProductFeatureId <em>Product Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteItemImpl#getDeliverableTypeId <em>Deliverable Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteItemImpl#getSkillTypeId <em>Skill Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteItemImpl#getUomId <em>Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteItemImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.impl.QuoteItemImpl#getCustRequestId <em>Cust Request Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuoteItemImpl extends BizEntityImpl implements QuoteItem {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The default value of the '{@link #getConfigId() <em>Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigId() <em>Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigId()
	 * @generated
	 * @ordered
	 */
	protected String configId = CONFIG_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustRequestItemSeqId() <em>Cust Request Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUST_REQUEST_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustRequestItemSeqId() <em>Cust Request Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String custRequestItemSeqId = CUST_REQUEST_ITEM_SEQ_ID_EDEFAULT;

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
	 * The default value of the '{@link #getLeadTimeDays() <em>Lead Time Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeadTimeDays()
	 * @generated
	 * @ordered
	 */
	protected static final long LEAD_TIME_DAYS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLeadTimeDays() <em>Lead Time Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeadTimeDays()
	 * @generated
	 * @ordered
	 */
	protected long leadTimeDays = LEAD_TIME_DAYS_EDEFAULT;

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
	 * The default value of the '{@link #getQuoteUnitPrice() <em>Quote Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUOTE_UNIT_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuoteUnitPrice() <em>Quote Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuoteUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quoteUnitPrice = QUOTE_UNIT_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReservLength() <em>Reserv Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservLength()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RESERV_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReservLength() <em>Reserv Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservLength()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal reservLength = RESERV_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getReservPersons() <em>Reserv Persons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservPersons()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RESERV_PERSONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReservPersons() <em>Reserv Persons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservPersons()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal reservPersons = RESERV_PERSONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReservStart() <em>Reserv Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date RESERV_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReservStart() <em>Reserv Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservStart()
	 * @generated
	 * @ordered
	 */
	protected Date reservStart = RESERV_START_EDEFAULT;

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
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected Product productId;

	/**
	 * The cached value of the '{@link #getProductFeatureId() <em>Product Feature Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureId()
	 * @generated
	 * @ordered
	 */
	protected ProductFeature productFeatureId;

	/**
	 * The cached value of the '{@link #getDeliverableTypeId() <em>Deliverable Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliverableTypeId()
	 * @generated
	 * @ordered
	 */
	protected DeliverableType deliverableTypeId;

	/**
	 * The cached value of the '{@link #getSkillTypeId() <em>Skill Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkillTypeId()
	 * @generated
	 * @ordered
	 */
	protected SkillType skillTypeId;

	/**
	 * The cached value of the '{@link #getUomId() <em>Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom uomId;

	/**
	 * The cached value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected WorkEffort workEffortId;

	/**
	 * The cached value of the '{@link #getCustRequestId() <em>Cust Request Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestId()
	 * @generated
	 * @ordered
	 */
	protected CustRequest custRequestId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuoteItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuotePackage.Literals.QUOTE_ITEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE_ITEM__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigId() {
		return configId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigId(String newConfigId) {
		String oldConfigId = configId;
		configId = newConfigId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE_ITEM__CONFIG_ID, oldConfigId, configId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustRequest getCustRequestId() {
		if (custRequestId != null && ((EObject)custRequestId).eIsProxy()) {
			InternalEObject oldCustRequestId = (InternalEObject)custRequestId;
			custRequestId = (CustRequest)eResolveProxy(oldCustRequestId);
			if (custRequestId != oldCustRequestId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuotePackage.QUOTE_ITEM__CUST_REQUEST_ID, oldCustRequestId, custRequestId));
			}
		}
		return custRequestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustRequest basicGetCustRequestId() {
		return custRequestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustRequestId(CustRequest newCustRequestId) {
		CustRequest oldCustRequestId = custRequestId;
		custRequestId = newCustRequestId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE_ITEM__CUST_REQUEST_ID, oldCustRequestId, custRequestId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustRequestItemSeqId() {
		return custRequestItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustRequestItemSeqId(String newCustRequestItemSeqId) {
		String oldCustRequestItemSeqId = custRequestItemSeqId;
		custRequestItemSeqId = newCustRequestItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE_ITEM__CUST_REQUEST_ITEM_SEQ_ID, oldCustRequestItemSeqId, custRequestItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeliverableType getDeliverableTypeId() {
		if (deliverableTypeId != null && ((EObject)deliverableTypeId).eIsProxy()) {
			InternalEObject oldDeliverableTypeId = (InternalEObject)deliverableTypeId;
			deliverableTypeId = (DeliverableType)eResolveProxy(oldDeliverableTypeId);
			if (deliverableTypeId != oldDeliverableTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuotePackage.QUOTE_ITEM__DELIVERABLE_TYPE_ID, oldDeliverableTypeId, deliverableTypeId));
			}
		}
		return deliverableTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliverableType basicGetDeliverableTypeId() {
		return deliverableTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliverableTypeId(DeliverableType newDeliverableTypeId) {
		DeliverableType oldDeliverableTypeId = deliverableTypeId;
		deliverableTypeId = newDeliverableTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE_ITEM__DELIVERABLE_TYPE_ID, oldDeliverableTypeId, deliverableTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE_ITEM__ESTIMATED_DELIVERY_DATE, oldEstimatedDeliveryDate, estimatedDeliveryDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE_ITEM__IS_PROMO, oldIsPromo, isPromo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getLeadTimeDays() {
		return leadTimeDays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeadTimeDays(long newLeadTimeDays) {
		long oldLeadTimeDays = leadTimeDays;
		leadTimeDays = newLeadTimeDays;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE_ITEM__LEAD_TIME_DAYS, oldLeadTimeDays, leadTimeDays));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFeature getProductFeatureId() {
		if (productFeatureId != null && ((EObject)productFeatureId).eIsProxy()) {
			InternalEObject oldProductFeatureId = (InternalEObject)productFeatureId;
			productFeatureId = (ProductFeature)eResolveProxy(oldProductFeatureId);
			if (productFeatureId != oldProductFeatureId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuotePackage.QUOTE_ITEM__PRODUCT_FEATURE_ID, oldProductFeatureId, productFeatureId));
			}
		}
		return productFeatureId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFeature basicGetProductFeatureId() {
		return productFeatureId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureId(ProductFeature newProductFeatureId) {
		ProductFeature oldProductFeatureId = productFeatureId;
		productFeatureId = newProductFeatureId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE_ITEM__PRODUCT_FEATURE_ID, oldProductFeatureId, productFeatureId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuotePackage.QUOTE_ITEM__PRODUCT_ID, oldProductId, productId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE_ITEM__PRODUCT_ID, oldProductId, productId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE_ITEM__QUANTITY, oldQuantity, quantity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE_ITEM__QUOTE_ID, oldQuoteId, quoteId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE_ITEM__QUOTE_ITEM_SEQ_ID, oldQuoteItemSeqId, quoteItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuoteUnitPrice() {
		return quoteUnitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuoteUnitPrice(BigDecimal newQuoteUnitPrice) {
		BigDecimal oldQuoteUnitPrice = quoteUnitPrice;
		quoteUnitPrice = newQuoteUnitPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE_ITEM__QUOTE_UNIT_PRICE, oldQuoteUnitPrice, quoteUnitPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReservLength() {
		return reservLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservLength(BigDecimal newReservLength) {
		BigDecimal oldReservLength = reservLength;
		reservLength = newReservLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE_ITEM__RESERV_LENGTH, oldReservLength, reservLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReservPersons() {
		return reservPersons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservPersons(BigDecimal newReservPersons) {
		BigDecimal oldReservPersons = reservPersons;
		reservPersons = newReservPersons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE_ITEM__RESERV_PERSONS, oldReservPersons, reservPersons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReservStart() {
		return reservStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservStart(Date newReservStart) {
		Date oldReservStart = reservStart;
		reservStart = newReservStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE_ITEM__RESERV_START, oldReservStart, reservStart));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE_ITEM__SELECTED_AMOUNT, oldSelectedAmount, selectedAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkillType getSkillTypeId() {
		if (skillTypeId != null && ((EObject)skillTypeId).eIsProxy()) {
			InternalEObject oldSkillTypeId = (InternalEObject)skillTypeId;
			skillTypeId = (SkillType)eResolveProxy(oldSkillTypeId);
			if (skillTypeId != oldSkillTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuotePackage.QUOTE_ITEM__SKILL_TYPE_ID, oldSkillTypeId, skillTypeId));
			}
		}
		return skillTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillType basicGetSkillTypeId() {
		return skillTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkillTypeId(SkillType newSkillTypeId) {
		SkillType oldSkillTypeId = skillTypeId;
		skillTypeId = newSkillTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE_ITEM__SKILL_TYPE_ID, oldSkillTypeId, skillTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getUomId() {
		if (uomId != null && ((EObject)uomId).eIsProxy()) {
			InternalEObject oldUomId = (InternalEObject)uomId;
			uomId = (Uom)eResolveProxy(oldUomId);
			if (uomId != oldUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuotePackage.QUOTE_ITEM__UOM_ID, oldUomId, uomId));
			}
		}
		return uomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetUomId() {
		return uomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUomId(Uom newUomId) {
		Uom oldUomId = uomId;
		uomId = newUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE_ITEM__UOM_ID, oldUomId, uomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffort getWorkEffortId() {
		if (workEffortId != null && ((EObject)workEffortId).eIsProxy()) {
			InternalEObject oldWorkEffortId = (InternalEObject)workEffortId;
			workEffortId = (WorkEffort)eResolveProxy(oldWorkEffortId);
			if (workEffortId != oldWorkEffortId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuotePackage.QUOTE_ITEM__WORK_EFFORT_ID, oldWorkEffortId, workEffortId));
			}
		}
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkEffort basicGetWorkEffortId() {
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortId(WorkEffort newWorkEffortId) {
		WorkEffort oldWorkEffortId = workEffortId;
		workEffortId = newWorkEffortId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuotePackage.QUOTE_ITEM__WORK_EFFORT_ID, oldWorkEffortId, workEffortId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuotePackage.QUOTE_ITEM__QUOTE_ID:
				return getQuoteId();
			case QuotePackage.QUOTE_ITEM__QUOTE_ITEM_SEQ_ID:
				return getQuoteItemSeqId();
			case QuotePackage.QUOTE_ITEM__COMMENTS:
				return getComments();
			case QuotePackage.QUOTE_ITEM__CONFIG_ID:
				return getConfigId();
			case QuotePackage.QUOTE_ITEM__CUST_REQUEST_ITEM_SEQ_ID:
				return getCustRequestItemSeqId();
			case QuotePackage.QUOTE_ITEM__ESTIMATED_DELIVERY_DATE:
				return getEstimatedDeliveryDate();
			case QuotePackage.QUOTE_ITEM__IS_PROMO:
				return isIsPromo();
			case QuotePackage.QUOTE_ITEM__LEAD_TIME_DAYS:
				return getLeadTimeDays();
			case QuotePackage.QUOTE_ITEM__QUANTITY:
				return getQuantity();
			case QuotePackage.QUOTE_ITEM__QUOTE_UNIT_PRICE:
				return getQuoteUnitPrice();
			case QuotePackage.QUOTE_ITEM__RESERV_LENGTH:
				return getReservLength();
			case QuotePackage.QUOTE_ITEM__RESERV_PERSONS:
				return getReservPersons();
			case QuotePackage.QUOTE_ITEM__RESERV_START:
				return getReservStart();
			case QuotePackage.QUOTE_ITEM__SELECTED_AMOUNT:
				return getSelectedAmount();
			case QuotePackage.QUOTE_ITEM__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case QuotePackage.QUOTE_ITEM__PRODUCT_FEATURE_ID:
				if (resolve) return getProductFeatureId();
				return basicGetProductFeatureId();
			case QuotePackage.QUOTE_ITEM__DELIVERABLE_TYPE_ID:
				if (resolve) return getDeliverableTypeId();
				return basicGetDeliverableTypeId();
			case QuotePackage.QUOTE_ITEM__SKILL_TYPE_ID:
				if (resolve) return getSkillTypeId();
				return basicGetSkillTypeId();
			case QuotePackage.QUOTE_ITEM__UOM_ID:
				if (resolve) return getUomId();
				return basicGetUomId();
			case QuotePackage.QUOTE_ITEM__WORK_EFFORT_ID:
				if (resolve) return getWorkEffortId();
				return basicGetWorkEffortId();
			case QuotePackage.QUOTE_ITEM__CUST_REQUEST_ID:
				if (resolve) return getCustRequestId();
				return basicGetCustRequestId();
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
			case QuotePackage.QUOTE_ITEM__QUOTE_ID:
				setQuoteId((String)newValue);
				return;
			case QuotePackage.QUOTE_ITEM__QUOTE_ITEM_SEQ_ID:
				setQuoteItemSeqId((String)newValue);
				return;
			case QuotePackage.QUOTE_ITEM__COMMENTS:
				setComments((String)newValue);
				return;
			case QuotePackage.QUOTE_ITEM__CONFIG_ID:
				setConfigId((String)newValue);
				return;
			case QuotePackage.QUOTE_ITEM__CUST_REQUEST_ITEM_SEQ_ID:
				setCustRequestItemSeqId((String)newValue);
				return;
			case QuotePackage.QUOTE_ITEM__ESTIMATED_DELIVERY_DATE:
				setEstimatedDeliveryDate((Date)newValue);
				return;
			case QuotePackage.QUOTE_ITEM__IS_PROMO:
				setIsPromo((Boolean)newValue);
				return;
			case QuotePackage.QUOTE_ITEM__LEAD_TIME_DAYS:
				setLeadTimeDays((Long)newValue);
				return;
			case QuotePackage.QUOTE_ITEM__QUANTITY:
				setQuantity((BigDecimal)newValue);
				return;
			case QuotePackage.QUOTE_ITEM__QUOTE_UNIT_PRICE:
				setQuoteUnitPrice((BigDecimal)newValue);
				return;
			case QuotePackage.QUOTE_ITEM__RESERV_LENGTH:
				setReservLength((BigDecimal)newValue);
				return;
			case QuotePackage.QUOTE_ITEM__RESERV_PERSONS:
				setReservPersons((BigDecimal)newValue);
				return;
			case QuotePackage.QUOTE_ITEM__RESERV_START:
				setReservStart((Date)newValue);
				return;
			case QuotePackage.QUOTE_ITEM__SELECTED_AMOUNT:
				setSelectedAmount((BigDecimal)newValue);
				return;
			case QuotePackage.QUOTE_ITEM__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case QuotePackage.QUOTE_ITEM__PRODUCT_FEATURE_ID:
				setProductFeatureId((ProductFeature)newValue);
				return;
			case QuotePackage.QUOTE_ITEM__DELIVERABLE_TYPE_ID:
				setDeliverableTypeId((DeliverableType)newValue);
				return;
			case QuotePackage.QUOTE_ITEM__SKILL_TYPE_ID:
				setSkillTypeId((SkillType)newValue);
				return;
			case QuotePackage.QUOTE_ITEM__UOM_ID:
				setUomId((Uom)newValue);
				return;
			case QuotePackage.QUOTE_ITEM__WORK_EFFORT_ID:
				setWorkEffortId((WorkEffort)newValue);
				return;
			case QuotePackage.QUOTE_ITEM__CUST_REQUEST_ID:
				setCustRequestId((CustRequest)newValue);
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
			case QuotePackage.QUOTE_ITEM__QUOTE_ID:
				setQuoteId(QUOTE_ID_EDEFAULT);
				return;
			case QuotePackage.QUOTE_ITEM__QUOTE_ITEM_SEQ_ID:
				setQuoteItemSeqId(QUOTE_ITEM_SEQ_ID_EDEFAULT);
				return;
			case QuotePackage.QUOTE_ITEM__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case QuotePackage.QUOTE_ITEM__CONFIG_ID:
				setConfigId(CONFIG_ID_EDEFAULT);
				return;
			case QuotePackage.QUOTE_ITEM__CUST_REQUEST_ITEM_SEQ_ID:
				setCustRequestItemSeqId(CUST_REQUEST_ITEM_SEQ_ID_EDEFAULT);
				return;
			case QuotePackage.QUOTE_ITEM__ESTIMATED_DELIVERY_DATE:
				setEstimatedDeliveryDate(ESTIMATED_DELIVERY_DATE_EDEFAULT);
				return;
			case QuotePackage.QUOTE_ITEM__IS_PROMO:
				setIsPromo(IS_PROMO_EDEFAULT);
				return;
			case QuotePackage.QUOTE_ITEM__LEAD_TIME_DAYS:
				setLeadTimeDays(LEAD_TIME_DAYS_EDEFAULT);
				return;
			case QuotePackage.QUOTE_ITEM__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case QuotePackage.QUOTE_ITEM__QUOTE_UNIT_PRICE:
				setQuoteUnitPrice(QUOTE_UNIT_PRICE_EDEFAULT);
				return;
			case QuotePackage.QUOTE_ITEM__RESERV_LENGTH:
				setReservLength(RESERV_LENGTH_EDEFAULT);
				return;
			case QuotePackage.QUOTE_ITEM__RESERV_PERSONS:
				setReservPersons(RESERV_PERSONS_EDEFAULT);
				return;
			case QuotePackage.QUOTE_ITEM__RESERV_START:
				setReservStart(RESERV_START_EDEFAULT);
				return;
			case QuotePackage.QUOTE_ITEM__SELECTED_AMOUNT:
				setSelectedAmount(SELECTED_AMOUNT_EDEFAULT);
				return;
			case QuotePackage.QUOTE_ITEM__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case QuotePackage.QUOTE_ITEM__PRODUCT_FEATURE_ID:
				setProductFeatureId((ProductFeature)null);
				return;
			case QuotePackage.QUOTE_ITEM__DELIVERABLE_TYPE_ID:
				setDeliverableTypeId((DeliverableType)null);
				return;
			case QuotePackage.QUOTE_ITEM__SKILL_TYPE_ID:
				setSkillTypeId((SkillType)null);
				return;
			case QuotePackage.QUOTE_ITEM__UOM_ID:
				setUomId((Uom)null);
				return;
			case QuotePackage.QUOTE_ITEM__WORK_EFFORT_ID:
				setWorkEffortId((WorkEffort)null);
				return;
			case QuotePackage.QUOTE_ITEM__CUST_REQUEST_ID:
				setCustRequestId((CustRequest)null);
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
			case QuotePackage.QUOTE_ITEM__QUOTE_ID:
				return QUOTE_ID_EDEFAULT == null ? quoteId != null : !QUOTE_ID_EDEFAULT.equals(quoteId);
			case QuotePackage.QUOTE_ITEM__QUOTE_ITEM_SEQ_ID:
				return QUOTE_ITEM_SEQ_ID_EDEFAULT == null ? quoteItemSeqId != null : !QUOTE_ITEM_SEQ_ID_EDEFAULT.equals(quoteItemSeqId);
			case QuotePackage.QUOTE_ITEM__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case QuotePackage.QUOTE_ITEM__CONFIG_ID:
				return CONFIG_ID_EDEFAULT == null ? configId != null : !CONFIG_ID_EDEFAULT.equals(configId);
			case QuotePackage.QUOTE_ITEM__CUST_REQUEST_ITEM_SEQ_ID:
				return CUST_REQUEST_ITEM_SEQ_ID_EDEFAULT == null ? custRequestItemSeqId != null : !CUST_REQUEST_ITEM_SEQ_ID_EDEFAULT.equals(custRequestItemSeqId);
			case QuotePackage.QUOTE_ITEM__ESTIMATED_DELIVERY_DATE:
				return ESTIMATED_DELIVERY_DATE_EDEFAULT == null ? estimatedDeliveryDate != null : !ESTIMATED_DELIVERY_DATE_EDEFAULT.equals(estimatedDeliveryDate);
			case QuotePackage.QUOTE_ITEM__IS_PROMO:
				return isPromo != IS_PROMO_EDEFAULT;
			case QuotePackage.QUOTE_ITEM__LEAD_TIME_DAYS:
				return leadTimeDays != LEAD_TIME_DAYS_EDEFAULT;
			case QuotePackage.QUOTE_ITEM__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case QuotePackage.QUOTE_ITEM__QUOTE_UNIT_PRICE:
				return QUOTE_UNIT_PRICE_EDEFAULT == null ? quoteUnitPrice != null : !QUOTE_UNIT_PRICE_EDEFAULT.equals(quoteUnitPrice);
			case QuotePackage.QUOTE_ITEM__RESERV_LENGTH:
				return RESERV_LENGTH_EDEFAULT == null ? reservLength != null : !RESERV_LENGTH_EDEFAULT.equals(reservLength);
			case QuotePackage.QUOTE_ITEM__RESERV_PERSONS:
				return RESERV_PERSONS_EDEFAULT == null ? reservPersons != null : !RESERV_PERSONS_EDEFAULT.equals(reservPersons);
			case QuotePackage.QUOTE_ITEM__RESERV_START:
				return RESERV_START_EDEFAULT == null ? reservStart != null : !RESERV_START_EDEFAULT.equals(reservStart);
			case QuotePackage.QUOTE_ITEM__SELECTED_AMOUNT:
				return SELECTED_AMOUNT_EDEFAULT == null ? selectedAmount != null : !SELECTED_AMOUNT_EDEFAULT.equals(selectedAmount);
			case QuotePackage.QUOTE_ITEM__PRODUCT_ID:
				return productId != null;
			case QuotePackage.QUOTE_ITEM__PRODUCT_FEATURE_ID:
				return productFeatureId != null;
			case QuotePackage.QUOTE_ITEM__DELIVERABLE_TYPE_ID:
				return deliverableTypeId != null;
			case QuotePackage.QUOTE_ITEM__SKILL_TYPE_ID:
				return skillTypeId != null;
			case QuotePackage.QUOTE_ITEM__UOM_ID:
				return uomId != null;
			case QuotePackage.QUOTE_ITEM__WORK_EFFORT_ID:
				return workEffortId != null;
			case QuotePackage.QUOTE_ITEM__CUST_REQUEST_ID:
				return custRequestId != null;
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
		result.append(" (quoteId: ");
		result.append(quoteId);
		result.append(", quoteItemSeqId: ");
		result.append(quoteItemSeqId);
		result.append(", comments: ");
		result.append(comments);
		result.append(", configId: ");
		result.append(configId);
		result.append(", custRequestItemSeqId: ");
		result.append(custRequestItemSeqId);
		result.append(", estimatedDeliveryDate: ");
		result.append(estimatedDeliveryDate);
		result.append(", isPromo: ");
		result.append(isPromo);
		result.append(", leadTimeDays: ");
		result.append(leadTimeDays);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", quoteUnitPrice: ");
		result.append(quoteUnitPrice);
		result.append(", reservLength: ");
		result.append(reservLength);
		result.append(", reservPersons: ");
		result.append(reservPersons);
		result.append(", reservStart: ");
		result.append(reservStart);
		result.append(", selectedAmount: ");
		result.append(selectedAmount);
		result.append(')');
		return result.toString();
	}

} //QuoteItemImpl
