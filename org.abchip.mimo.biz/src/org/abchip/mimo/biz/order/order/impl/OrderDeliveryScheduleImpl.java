/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.order.OrderDeliverySchedule;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.order.order.OrderPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Delivery Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderDeliveryScheduleImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderDeliveryScheduleImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderDeliveryScheduleImpl#getCartons <em>Cartons</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderDeliveryScheduleImpl#getEstimatedReadyDate <em>Estimated Ready Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderDeliveryScheduleImpl#getSkidsPallets <em>Skids Pallets</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderDeliveryScheduleImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderDeliveryScheduleImpl#getTotalCubicSize <em>Total Cubic Size</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderDeliveryScheduleImpl#getTotalCubicUomId <em>Total Cubic Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderDeliveryScheduleImpl#getTotalWeight <em>Total Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderDeliveryScheduleImpl#getTotalWeightUomId <em>Total Weight Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderDeliveryScheduleImpl#getUnitsPieces <em>Units Pieces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderDeliveryScheduleImpl extends BizEntityImpl implements OrderDeliverySchedule {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderDeliveryScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getCartons() {
		return (Long)eGet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__CARTONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCartons(long newCartons) {
		eSet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__CARTONS, newCartons);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedReadyDate() {
		return (Date)eGet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__ESTIMATED_READY_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedReadyDate(Date newEstimatedReadyDate) {
		eSet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__ESTIMATED_READY_DATE, newEstimatedReadyDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderHeader getOrderId() {
		return (OrderHeader)eGet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__ORDER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(OrderHeader newOrderId) {
		eSet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__ORDER_ID, newOrderId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemSeqId() {
		return (String)eGet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__ORDER_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemSeqId(String newOrderItemSeqId) {
		eSet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__ORDER_ITEM_SEQ_ID, newOrderItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSkidsPallets() {
		return (Long)eGet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__SKIDS_PALLETS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkidsPallets(long newSkidsPallets) {
		eSet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__SKIDS_PALLETS, newSkidsPallets);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		return (StatusItem)eGet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		eSet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__STATUS_ID, newStatusId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTotalCubicSize() {
		return (BigDecimal)eGet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__TOTAL_CUBIC_SIZE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalCubicSize(BigDecimal newTotalCubicSize) {
		eSet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__TOTAL_CUBIC_SIZE, newTotalCubicSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getTotalCubicUomId() {
		return (Uom)eGet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__TOTAL_CUBIC_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalCubicUomId(Uom newTotalCubicUomId) {
		eSet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__TOTAL_CUBIC_UOM_ID, newTotalCubicUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTotalWeight() {
		return (BigDecimal)eGet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__TOTAL_WEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalWeight(BigDecimal newTotalWeight) {
		eSet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__TOTAL_WEIGHT, newTotalWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getTotalWeightUomId() {
		return (Uom)eGet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__TOTAL_WEIGHT_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalWeightUomId(Uom newTotalWeightUomId) {
		eSet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__TOTAL_WEIGHT_UOM_ID, newTotalWeightUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getUnitsPieces() {
		return (BigDecimal)eGet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__UNITS_PIECES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitsPieces(BigDecimal newUnitsPieces) {
		eSet(OrderPackage.Literals.ORDER_DELIVERY_SCHEDULE__UNITS_PIECES, newUnitsPieces);
	}

} //OrderDeliveryScheduleImpl
