/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.request.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.request.CustRequestItem;
import org.abchip.mimo.biz.order.request.CustRequestResolution;
import org.abchip.mimo.biz.order.request.RequestPackage;
import org.abchip.mimo.biz.product.product.Product;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cust Request Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestItemImpl#getCustRequestId <em>Cust Request Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestItemImpl#getCustRequestItemSeqId <em>Cust Request Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestItemImpl#getConfigId <em>Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestItemImpl#getMaximumAmount <em>Maximum Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestItemImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestItemImpl#getRequiredByDate <em>Required By Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestItemImpl#getReservLength <em>Reserv Length</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestItemImpl#getReservPersons <em>Reserv Persons</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestItemImpl#getReservStart <em>Reserv Start</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestItemImpl#getSelectedAmount <em>Selected Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestItemImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestItemImpl#getStory <em>Story</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestItemImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestItemImpl#getCustRequestResolutionId <em>Cust Request Resolution Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestItemImpl#getProductId <em>Product Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustRequestItemImpl extends BizEntityImpl implements CustRequestItem {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getCustRequestId() <em>Cust Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUST_REQUEST_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustRequestId() <em>Cust Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestId()
	 * @generated
	 * @ordered
	 */
	protected String custRequestId = CUST_REQUEST_ID_EDEFAULT;

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
	 * The default value of the '{@link #getMaximumAmount() <em>Maximum Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MAXIMUM_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumAmount() <em>Maximum Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal maximumAmount = MAXIMUM_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final long PRIORITY_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected long priority = PRIORITY_EDEFAULT;

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
	 * The default value of the '{@link #getRequiredByDate() <em>Required By Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredByDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date REQUIRED_BY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequiredByDate() <em>Required By Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredByDate()
	 * @generated
	 * @ordered
	 */
	protected Date requiredByDate = REQUIRED_BY_DATE_EDEFAULT;

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
	 * The default value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected static final long SEQUENCE_NUM_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected long sequenceNum = SEQUENCE_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getStory() <em>Story</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStory()
	 * @generated
	 * @ordered
	 */
	protected static final String STORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStory() <em>Story</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStory()
	 * @generated
	 * @ordered
	 */
	protected String story = STORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;

	/**
	 * The cached value of the '{@link #getCustRequestResolutionId() <em>Cust Request Resolution Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestResolutionId()
	 * @generated
	 * @ordered
	 */
	protected CustRequestResolution custRequestResolutionId;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustRequestItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequestPackage.Literals.CUST_REQUEST_ITEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST_ITEM__CONFIG_ID, oldConfigId, configId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustRequestId() {
		return custRequestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustRequestId(String newCustRequestId) {
		String oldCustRequestId = custRequestId;
		custRequestId = newCustRequestId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST_ITEM__CUST_REQUEST_ID, oldCustRequestId, custRequestId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST_ITEM__CUST_REQUEST_ITEM_SEQ_ID, oldCustRequestItemSeqId, custRequestItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustRequestResolution getCustRequestResolutionId() {
		if (custRequestResolutionId != null && ((EObject)custRequestResolutionId).eIsProxy()) {
			InternalEObject oldCustRequestResolutionId = (InternalEObject)custRequestResolutionId;
			custRequestResolutionId = (CustRequestResolution)eResolveProxy(oldCustRequestResolutionId);
			if (custRequestResolutionId != oldCustRequestResolutionId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequestPackage.CUST_REQUEST_ITEM__CUST_REQUEST_RESOLUTION_ID, oldCustRequestResolutionId, custRequestResolutionId));
			}
		}
		return custRequestResolutionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustRequestResolution basicGetCustRequestResolutionId() {
		return custRequestResolutionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustRequestResolutionId(CustRequestResolution newCustRequestResolutionId) {
		CustRequestResolution oldCustRequestResolutionId = custRequestResolutionId;
		custRequestResolutionId = newCustRequestResolutionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST_ITEM__CUST_REQUEST_RESOLUTION_ID, oldCustRequestResolutionId, custRequestResolutionId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST_ITEM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMaximumAmount() {
		return maximumAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumAmount(BigDecimal newMaximumAmount) {
		BigDecimal oldMaximumAmount = maximumAmount;
		maximumAmount = newMaximumAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST_ITEM__MAXIMUM_AMOUNT, oldMaximumAmount, maximumAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(long newPriority) {
		long oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST_ITEM__PRIORITY, oldPriority, priority));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequestPackage.CUST_REQUEST_ITEM__PRODUCT_ID, oldProductId, productId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST_ITEM__PRODUCT_ID, oldProductId, productId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST_ITEM__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getRequiredByDate() {
		return requiredByDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiredByDate(Date newRequiredByDate) {
		Date oldRequiredByDate = requiredByDate;
		requiredByDate = newRequiredByDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST_ITEM__REQUIRED_BY_DATE, oldRequiredByDate, requiredByDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST_ITEM__RESERV_LENGTH, oldReservLength, reservLength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST_ITEM__RESERV_PERSONS, oldReservPersons, reservPersons));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST_ITEM__RESERV_START, oldReservStart, reservStart));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST_ITEM__SELECTED_AMOUNT, oldSelectedAmount, selectedAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceNum() {
		return sequenceNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNum(long newSequenceNum) {
		long oldSequenceNum = sequenceNum;
		sequenceNum = newSequenceNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST_ITEM__SEQUENCE_NUM, oldSequenceNum, sequenceNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequestPackage.CUST_REQUEST_ITEM__STATUS_ID, oldStatusId, statusId));
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		StatusItem oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST_ITEM__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStory() {
		return story;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStory(String newStory) {
		String oldStory = story;
		story = newStory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST_ITEM__STORY, oldStory, story));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequestPackage.CUST_REQUEST_ITEM__CUST_REQUEST_ID:
				return getCustRequestId();
			case RequestPackage.CUST_REQUEST_ITEM__CUST_REQUEST_ITEM_SEQ_ID:
				return getCustRequestItemSeqId();
			case RequestPackage.CUST_REQUEST_ITEM__CONFIG_ID:
				return getConfigId();
			case RequestPackage.CUST_REQUEST_ITEM__DESCRIPTION:
				return getDescription();
			case RequestPackage.CUST_REQUEST_ITEM__MAXIMUM_AMOUNT:
				return getMaximumAmount();
			case RequestPackage.CUST_REQUEST_ITEM__PRIORITY:
				return getPriority();
			case RequestPackage.CUST_REQUEST_ITEM__QUANTITY:
				return getQuantity();
			case RequestPackage.CUST_REQUEST_ITEM__REQUIRED_BY_DATE:
				return getRequiredByDate();
			case RequestPackage.CUST_REQUEST_ITEM__RESERV_LENGTH:
				return getReservLength();
			case RequestPackage.CUST_REQUEST_ITEM__RESERV_PERSONS:
				return getReservPersons();
			case RequestPackage.CUST_REQUEST_ITEM__RESERV_START:
				return getReservStart();
			case RequestPackage.CUST_REQUEST_ITEM__SELECTED_AMOUNT:
				return getSelectedAmount();
			case RequestPackage.CUST_REQUEST_ITEM__SEQUENCE_NUM:
				return getSequenceNum();
			case RequestPackage.CUST_REQUEST_ITEM__STORY:
				return getStory();
			case RequestPackage.CUST_REQUEST_ITEM__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case RequestPackage.CUST_REQUEST_ITEM__CUST_REQUEST_RESOLUTION_ID:
				if (resolve) return getCustRequestResolutionId();
				return basicGetCustRequestResolutionId();
			case RequestPackage.CUST_REQUEST_ITEM__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
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
			case RequestPackage.CUST_REQUEST_ITEM__CUST_REQUEST_ID:
				setCustRequestId((String)newValue);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__CUST_REQUEST_ITEM_SEQ_ID:
				setCustRequestItemSeqId((String)newValue);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__CONFIG_ID:
				setConfigId((String)newValue);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__MAXIMUM_AMOUNT:
				setMaximumAmount((BigDecimal)newValue);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__PRIORITY:
				setPriority((Long)newValue);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__QUANTITY:
				setQuantity((BigDecimal)newValue);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__REQUIRED_BY_DATE:
				setRequiredByDate((Date)newValue);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__RESERV_LENGTH:
				setReservLength((BigDecimal)newValue);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__RESERV_PERSONS:
				setReservPersons((BigDecimal)newValue);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__RESERV_START:
				setReservStart((Date)newValue);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__SELECTED_AMOUNT:
				setSelectedAmount((BigDecimal)newValue);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__STORY:
				setStory((String)newValue);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__CUST_REQUEST_RESOLUTION_ID:
				setCustRequestResolutionId((CustRequestResolution)newValue);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__PRODUCT_ID:
				setProductId((Product)newValue);
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
			case RequestPackage.CUST_REQUEST_ITEM__CUST_REQUEST_ID:
				setCustRequestId(CUST_REQUEST_ID_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__CUST_REQUEST_ITEM_SEQ_ID:
				setCustRequestItemSeqId(CUST_REQUEST_ITEM_SEQ_ID_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__CONFIG_ID:
				setConfigId(CONFIG_ID_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__MAXIMUM_AMOUNT:
				setMaximumAmount(MAXIMUM_AMOUNT_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__REQUIRED_BY_DATE:
				setRequiredByDate(REQUIRED_BY_DATE_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__RESERV_LENGTH:
				setReservLength(RESERV_LENGTH_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__RESERV_PERSONS:
				setReservPersons(RESERV_PERSONS_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__RESERV_START:
				setReservStart(RESERV_START_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__SELECTED_AMOUNT:
				setSelectedAmount(SELECTED_AMOUNT_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__STORY:
				setStory(STORY_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__CUST_REQUEST_RESOLUTION_ID:
				setCustRequestResolutionId((CustRequestResolution)null);
				return;
			case RequestPackage.CUST_REQUEST_ITEM__PRODUCT_ID:
				setProductId((Product)null);
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
			case RequestPackage.CUST_REQUEST_ITEM__CUST_REQUEST_ID:
				return CUST_REQUEST_ID_EDEFAULT == null ? custRequestId != null : !CUST_REQUEST_ID_EDEFAULT.equals(custRequestId);
			case RequestPackage.CUST_REQUEST_ITEM__CUST_REQUEST_ITEM_SEQ_ID:
				return CUST_REQUEST_ITEM_SEQ_ID_EDEFAULT == null ? custRequestItemSeqId != null : !CUST_REQUEST_ITEM_SEQ_ID_EDEFAULT.equals(custRequestItemSeqId);
			case RequestPackage.CUST_REQUEST_ITEM__CONFIG_ID:
				return CONFIG_ID_EDEFAULT == null ? configId != null : !CONFIG_ID_EDEFAULT.equals(configId);
			case RequestPackage.CUST_REQUEST_ITEM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case RequestPackage.CUST_REQUEST_ITEM__MAXIMUM_AMOUNT:
				return MAXIMUM_AMOUNT_EDEFAULT == null ? maximumAmount != null : !MAXIMUM_AMOUNT_EDEFAULT.equals(maximumAmount);
			case RequestPackage.CUST_REQUEST_ITEM__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case RequestPackage.CUST_REQUEST_ITEM__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case RequestPackage.CUST_REQUEST_ITEM__REQUIRED_BY_DATE:
				return REQUIRED_BY_DATE_EDEFAULT == null ? requiredByDate != null : !REQUIRED_BY_DATE_EDEFAULT.equals(requiredByDate);
			case RequestPackage.CUST_REQUEST_ITEM__RESERV_LENGTH:
				return RESERV_LENGTH_EDEFAULT == null ? reservLength != null : !RESERV_LENGTH_EDEFAULT.equals(reservLength);
			case RequestPackage.CUST_REQUEST_ITEM__RESERV_PERSONS:
				return RESERV_PERSONS_EDEFAULT == null ? reservPersons != null : !RESERV_PERSONS_EDEFAULT.equals(reservPersons);
			case RequestPackage.CUST_REQUEST_ITEM__RESERV_START:
				return RESERV_START_EDEFAULT == null ? reservStart != null : !RESERV_START_EDEFAULT.equals(reservStart);
			case RequestPackage.CUST_REQUEST_ITEM__SELECTED_AMOUNT:
				return SELECTED_AMOUNT_EDEFAULT == null ? selectedAmount != null : !SELECTED_AMOUNT_EDEFAULT.equals(selectedAmount);
			case RequestPackage.CUST_REQUEST_ITEM__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case RequestPackage.CUST_REQUEST_ITEM__STORY:
				return STORY_EDEFAULT == null ? story != null : !STORY_EDEFAULT.equals(story);
			case RequestPackage.CUST_REQUEST_ITEM__STATUS_ID:
				return statusId != null;
			case RequestPackage.CUST_REQUEST_ITEM__CUST_REQUEST_RESOLUTION_ID:
				return custRequestResolutionId != null;
			case RequestPackage.CUST_REQUEST_ITEM__PRODUCT_ID:
				return productId != null;
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
		result.append(" (custRequestId: ");
		result.append(custRequestId);
		result.append(", custRequestItemSeqId: ");
		result.append(custRequestItemSeqId);
		result.append(", configId: ");
		result.append(configId);
		result.append(", description: ");
		result.append(description);
		result.append(", maximumAmount: ");
		result.append(maximumAmount);
		result.append(", priority: ");
		result.append(priority);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", requiredByDate: ");
		result.append(requiredByDate);
		result.append(", reservLength: ");
		result.append(reservLength);
		result.append(", reservPersons: ");
		result.append(reservPersons);
		result.append(", reservStart: ");
		result.append(reservStart);
		result.append(", selectedAmount: ");
		result.append(selectedAmount);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(", story: ");
		result.append(story);
		result.append(')');
		return result.toString();
	}

} //CustRequestItemImpl
