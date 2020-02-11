/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.common.method.CustomMethod;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.product.product.ProductAssoc;
import org.abchip.mimo.biz.product.product.ProductAssocType;
import org.abchip.mimo.biz.product.product.ProductPackage;
import org.abchip.mimo.biz.service.schedule.RecurrenceInfo;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Assoc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductAssocImpl#getProductAssocTypeId <em>Product Assoc Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductAssocImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductAssocImpl#getProductIdTo <em>Product Id To</em>}</li>
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
	public CustomMethod getEstimateCalcMethod() {
		return (CustomMethod)eGet(ProductPackage.Literals.PRODUCT_ASSOC__ESTIMATE_CALC_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimateCalcMethod(CustomMethod newEstimateCalcMethod) {
		eSet(ProductPackage.Literals.PRODUCT_ASSOC__ESTIMATE_CALC_METHOD, newEstimateCalcMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return (Date)eGet(ProductPackage.Literals.PRODUCT_ASSOC__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(ProductPackage.Literals.PRODUCT_ASSOC__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstruction() {
		return (String)eGet(ProductPackage.Literals.PRODUCT_ASSOC__INSTRUCTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstruction(String newInstruction) {
		eSet(ProductPackage.Literals.PRODUCT_ASSOC__INSTRUCTION, newInstruction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantity() {
		return (BigDecimal)eGet(ProductPackage.Literals.PRODUCT_ASSOC__QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(BigDecimal newQuantity) {
		eSet(ProductPackage.Literals.PRODUCT_ASSOC__QUANTITY, newQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReason() {
		return (String)eGet(ProductPackage.Literals.PRODUCT_ASSOC__REASON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReason(String newReason) {
		eSet(ProductPackage.Literals.PRODUCT_ASSOC__REASON, newReason);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecurrenceInfo getRecurrenceInfoId() {
		return (RecurrenceInfo)eGet(ProductPackage.Literals.PRODUCT_ASSOC__RECURRENCE_INFO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurrenceInfoId(RecurrenceInfo newRecurrenceInfoId) {
		eSet(ProductPackage.Literals.PRODUCT_ASSOC__RECURRENCE_INFO_ID, newRecurrenceInfoId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffort getRoutingWorkEffortId() {
		return (WorkEffort)eGet(ProductPackage.Literals.PRODUCT_ASSOC__ROUTING_WORK_EFFORT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoutingWorkEffortId(WorkEffort newRoutingWorkEffortId) {
		eSet(ProductPackage.Literals.PRODUCT_ASSOC__ROUTING_WORK_EFFORT_ID, newRoutingWorkEffortId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getScrapFactor() {
		return (BigDecimal)eGet(ProductPackage.Literals.PRODUCT_ASSOC__SCRAP_FACTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScrapFactor(BigDecimal newScrapFactor) {
		eSet(ProductPackage.Literals.PRODUCT_ASSOC__SCRAP_FACTOR, newScrapFactor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceNum() {
		return (Long)eGet(ProductPackage.Literals.PRODUCT_ASSOC__SEQUENCE_NUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNum(long newSequenceNum) {
		eSet(ProductPackage.Literals.PRODUCT_ASSOC__SEQUENCE_NUM, newSequenceNum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return (Date)eGet(ProductPackage.Literals.PRODUCT_ASSOC__THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		eSet(ProductPackage.Literals.PRODUCT_ASSOC__THRU_DATE, newThruDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductAssocType getProductAssocTypeId() {
		return (ProductAssocType)eGet(ProductPackage.Literals.PRODUCT_ASSOC__PRODUCT_ASSOC_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductAssocTypeId(ProductAssocType newProductAssocTypeId) {
		eSet(ProductPackage.Literals.PRODUCT_ASSOC__PRODUCT_ASSOC_TYPE_ID, newProductAssocTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductId() {
		return (Product)eGet(ProductPackage.Literals.PRODUCT_ASSOC__PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		eSet(ProductPackage.Literals.PRODUCT_ASSOC__PRODUCT_ID, newProductId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductIdTo() {
		return (Product)eGet(ProductPackage.Literals.PRODUCT_ASSOC__PRODUCT_ID_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductIdTo(Product newProductIdTo) {
		eSet(ProductPackage.Literals.PRODUCT_ASSOC__PRODUCT_ID_TO, newProductIdTo);
	}

} //ProductAssocImpl
