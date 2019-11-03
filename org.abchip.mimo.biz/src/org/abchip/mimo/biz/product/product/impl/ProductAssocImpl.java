/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.product.product.ProductAssoc;
import org.abchip.mimo.biz.product.product.ProductAssocType;
import org.abchip.mimo.biz.product.product.ProductPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Assoc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductAssocImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductAssocImpl#getProductIdTo <em>Product Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductAssocImpl#getProductAssocTypeId <em>Product Assoc Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductAssocImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductAssocImpl#getEstimateCalcMethod <em>Estimate Calc Method</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductAssocImpl#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductAssocImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductAssocImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductAssocImpl#getRecurrenceInfoId <em>Recurrence Info Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductAssocImpl#getRoutingWorkEffortId <em>Routing Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductAssocImpl#getScrapFactor <em>Scrap Factor</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductAssocImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductAssocImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductAssocImpl extends BizEntityTypedImpl<ProductAssocType> implements ProductAssoc {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The default value of the '{@link #getProductIdTo() <em>Product Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductIdTo()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductIdTo() <em>Product Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductIdTo()
	 * @generated
	 * @ordered
	 */
	protected String productIdTo = PRODUCT_ID_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductAssocTypeId() <em>Product Assoc Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductAssocTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ASSOC_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductAssocTypeId() <em>Product Assoc Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductAssocTypeId()
	 * @generated
	 * @ordered
	 */
	protected String productAssocTypeId = PRODUCT_ASSOC_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimateCalcMethod() <em>Estimate Calc Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimateCalcMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTIMATE_CALC_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimateCalcMethod() <em>Estimate Calc Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimateCalcMethod()
	 * @generated
	 * @ordered
	 */
	protected String estimateCalcMethod = ESTIMATE_CALC_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstruction() <em>Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTRUCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected String instruction = INSTRUCTION_EDEFAULT;

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
	 * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected String reason = REASON_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecurrenceInfoId() <em>Recurrence Info Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrenceInfoId()
	 * @generated
	 * @ordered
	 */
	protected static final String RECURRENCE_INFO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecurrenceInfoId() <em>Recurrence Info Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrenceInfoId()
	 * @generated
	 * @ordered
	 */
	protected String recurrenceInfoId = RECURRENCE_INFO_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoutingWorkEffortId() <em>Routing Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTING_WORK_EFFORT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoutingWorkEffortId() <em>Routing Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected String routingWorkEffortId = ROUTING_WORK_EFFORT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getScrapFactor() <em>Scrap Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrapFactor()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SCRAP_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScrapFactor() <em>Scrap Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrapFactor()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal scrapFactor = SCRAP_FACTOR_EDEFAULT;

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
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductAssocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.PRODUCT_ASSOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEstimateCalcMethod() {
		return estimateCalcMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimateCalcMethod(String newEstimateCalcMethod) {
		String oldEstimateCalcMethod = estimateCalcMethod;
		estimateCalcMethod = newEstimateCalcMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_ASSOC__ESTIMATE_CALC_METHOD, oldEstimateCalcMethod, estimateCalcMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_ASSOC__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstruction() {
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstruction(String newInstruction) {
		String oldInstruction = instruction;
		instruction = newInstruction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_ASSOC__INSTRUCTION, oldInstruction, instruction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_ASSOC__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReason(String newReason) {
		String oldReason = reason;
		reason = newReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_ASSOC__REASON, oldReason, reason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRecurrenceInfoId() {
		return recurrenceInfoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurrenceInfoId(String newRecurrenceInfoId) {
		String oldRecurrenceInfoId = recurrenceInfoId;
		recurrenceInfoId = newRecurrenceInfoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_ASSOC__RECURRENCE_INFO_ID, oldRecurrenceInfoId, recurrenceInfoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoutingWorkEffortId() {
		return routingWorkEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoutingWorkEffortId(String newRoutingWorkEffortId) {
		String oldRoutingWorkEffortId = routingWorkEffortId;
		routingWorkEffortId = newRoutingWorkEffortId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_ASSOC__ROUTING_WORK_EFFORT_ID, oldRoutingWorkEffortId, routingWorkEffortId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getScrapFactor() {
		return scrapFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScrapFactor(BigDecimal newScrapFactor) {
		BigDecimal oldScrapFactor = scrapFactor;
		scrapFactor = newScrapFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_ASSOC__SCRAP_FACTOR, oldScrapFactor, scrapFactor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_ASSOC__SEQUENCE_NUM, oldSequenceNum, sequenceNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_ASSOC__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductAssocTypeId() {
		return productAssocTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductAssocTypeId(String newProductAssocTypeId) {
		String oldProductAssocTypeId = productAssocTypeId;
		productAssocTypeId = newProductAssocTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_ASSOC__PRODUCT_ASSOC_TYPE_ID, oldProductAssocTypeId, productAssocTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_ASSOC__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductIdTo() {
		return productIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductIdTo(String newProductIdTo) {
		String oldProductIdTo = productIdTo;
		productIdTo = newProductIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_ASSOC__PRODUCT_ID_TO, oldProductIdTo, productIdTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.PRODUCT_ASSOC__PRODUCT_ID:
				return getProductId();
			case ProductPackage.PRODUCT_ASSOC__PRODUCT_ID_TO:
				return getProductIdTo();
			case ProductPackage.PRODUCT_ASSOC__PRODUCT_ASSOC_TYPE_ID:
				return getProductAssocTypeId();
			case ProductPackage.PRODUCT_ASSOC__FROM_DATE:
				return getFromDate();
			case ProductPackage.PRODUCT_ASSOC__ESTIMATE_CALC_METHOD:
				return getEstimateCalcMethod();
			case ProductPackage.PRODUCT_ASSOC__INSTRUCTION:
				return getInstruction();
			case ProductPackage.PRODUCT_ASSOC__QUANTITY:
				return getQuantity();
			case ProductPackage.PRODUCT_ASSOC__REASON:
				return getReason();
			case ProductPackage.PRODUCT_ASSOC__RECURRENCE_INFO_ID:
				return getRecurrenceInfoId();
			case ProductPackage.PRODUCT_ASSOC__ROUTING_WORK_EFFORT_ID:
				return getRoutingWorkEffortId();
			case ProductPackage.PRODUCT_ASSOC__SCRAP_FACTOR:
				return getScrapFactor();
			case ProductPackage.PRODUCT_ASSOC__SEQUENCE_NUM:
				return getSequenceNum();
			case ProductPackage.PRODUCT_ASSOC__THRU_DATE:
				return getThruDate();
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
			case ProductPackage.PRODUCT_ASSOC__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case ProductPackage.PRODUCT_ASSOC__PRODUCT_ID_TO:
				setProductIdTo((String)newValue);
				return;
			case ProductPackage.PRODUCT_ASSOC__PRODUCT_ASSOC_TYPE_ID:
				setProductAssocTypeId((String)newValue);
				return;
			case ProductPackage.PRODUCT_ASSOC__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case ProductPackage.PRODUCT_ASSOC__ESTIMATE_CALC_METHOD:
				setEstimateCalcMethod((String)newValue);
				return;
			case ProductPackage.PRODUCT_ASSOC__INSTRUCTION:
				setInstruction((String)newValue);
				return;
			case ProductPackage.PRODUCT_ASSOC__QUANTITY:
				setQuantity((BigDecimal)newValue);
				return;
			case ProductPackage.PRODUCT_ASSOC__REASON:
				setReason((String)newValue);
				return;
			case ProductPackage.PRODUCT_ASSOC__RECURRENCE_INFO_ID:
				setRecurrenceInfoId((String)newValue);
				return;
			case ProductPackage.PRODUCT_ASSOC__ROUTING_WORK_EFFORT_ID:
				setRoutingWorkEffortId((String)newValue);
				return;
			case ProductPackage.PRODUCT_ASSOC__SCRAP_FACTOR:
				setScrapFactor((BigDecimal)newValue);
				return;
			case ProductPackage.PRODUCT_ASSOC__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case ProductPackage.PRODUCT_ASSOC__THRU_DATE:
				setThruDate((Date)newValue);
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
			case ProductPackage.PRODUCT_ASSOC__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_ASSOC__PRODUCT_ID_TO:
				setProductIdTo(PRODUCT_ID_TO_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_ASSOC__PRODUCT_ASSOC_TYPE_ID:
				setProductAssocTypeId(PRODUCT_ASSOC_TYPE_ID_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_ASSOC__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_ASSOC__ESTIMATE_CALC_METHOD:
				setEstimateCalcMethod(ESTIMATE_CALC_METHOD_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_ASSOC__INSTRUCTION:
				setInstruction(INSTRUCTION_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_ASSOC__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_ASSOC__REASON:
				setReason(REASON_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_ASSOC__RECURRENCE_INFO_ID:
				setRecurrenceInfoId(RECURRENCE_INFO_ID_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_ASSOC__ROUTING_WORK_EFFORT_ID:
				setRoutingWorkEffortId(ROUTING_WORK_EFFORT_ID_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_ASSOC__SCRAP_FACTOR:
				setScrapFactor(SCRAP_FACTOR_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_ASSOC__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_ASSOC__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
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
			case ProductPackage.PRODUCT_ASSOC__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case ProductPackage.PRODUCT_ASSOC__PRODUCT_ID_TO:
				return PRODUCT_ID_TO_EDEFAULT == null ? productIdTo != null : !PRODUCT_ID_TO_EDEFAULT.equals(productIdTo);
			case ProductPackage.PRODUCT_ASSOC__PRODUCT_ASSOC_TYPE_ID:
				return PRODUCT_ASSOC_TYPE_ID_EDEFAULT == null ? productAssocTypeId != null : !PRODUCT_ASSOC_TYPE_ID_EDEFAULT.equals(productAssocTypeId);
			case ProductPackage.PRODUCT_ASSOC__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case ProductPackage.PRODUCT_ASSOC__ESTIMATE_CALC_METHOD:
				return ESTIMATE_CALC_METHOD_EDEFAULT == null ? estimateCalcMethod != null : !ESTIMATE_CALC_METHOD_EDEFAULT.equals(estimateCalcMethod);
			case ProductPackage.PRODUCT_ASSOC__INSTRUCTION:
				return INSTRUCTION_EDEFAULT == null ? instruction != null : !INSTRUCTION_EDEFAULT.equals(instruction);
			case ProductPackage.PRODUCT_ASSOC__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case ProductPackage.PRODUCT_ASSOC__REASON:
				return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
			case ProductPackage.PRODUCT_ASSOC__RECURRENCE_INFO_ID:
				return RECURRENCE_INFO_ID_EDEFAULT == null ? recurrenceInfoId != null : !RECURRENCE_INFO_ID_EDEFAULT.equals(recurrenceInfoId);
			case ProductPackage.PRODUCT_ASSOC__ROUTING_WORK_EFFORT_ID:
				return ROUTING_WORK_EFFORT_ID_EDEFAULT == null ? routingWorkEffortId != null : !ROUTING_WORK_EFFORT_ID_EDEFAULT.equals(routingWorkEffortId);
			case ProductPackage.PRODUCT_ASSOC__SCRAP_FACTOR:
				return SCRAP_FACTOR_EDEFAULT == null ? scrapFactor != null : !SCRAP_FACTOR_EDEFAULT.equals(scrapFactor);
			case ProductPackage.PRODUCT_ASSOC__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case ProductPackage.PRODUCT_ASSOC__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
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
		result.append(" (productId: ");
		result.append(productId);
		result.append(", productIdTo: ");
		result.append(productIdTo);
		result.append(", productAssocTypeId: ");
		result.append(productAssocTypeId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", estimateCalcMethod: ");
		result.append(estimateCalcMethod);
		result.append(", instruction: ");
		result.append(instruction);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", reason: ");
		result.append(reason);
		result.append(", recurrenceInfoId: ");
		result.append(recurrenceInfoId);
		result.append(", routingWorkEffortId: ");
		result.append(routingWorkEffortId);
		result.append(", scrapFactor: ");
		result.append(scrapFactor);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //ProductAssocImpl
