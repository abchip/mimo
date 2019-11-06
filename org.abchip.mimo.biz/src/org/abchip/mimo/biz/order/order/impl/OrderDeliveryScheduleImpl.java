/**
 * Copyright (c) 2017, 2019 ABChip and others.
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Delivery Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderDeliveryScheduleImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderDeliveryScheduleImpl#getCartons <em>Cartons</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderDeliveryScheduleImpl#getEstimatedReadyDate <em>Estimated Ready Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderDeliveryScheduleImpl#getSkidsPallets <em>Skids Pallets</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderDeliveryScheduleImpl#getTotalCubicSize <em>Total Cubic Size</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderDeliveryScheduleImpl#getTotalWeight <em>Total Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderDeliveryScheduleImpl#getUnitsPieces <em>Units Pieces</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderDeliveryScheduleImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderDeliveryScheduleImpl#getTotalCubicUomId <em>Total Cubic Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderDeliveryScheduleImpl#getTotalWeightUomId <em>Total Weight Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderDeliveryScheduleImpl#getStatusId <em>Status Id</em>}</li>
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
	 * The default value of the '{@link #getOrderItemSeqId() <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderItemSeqId() <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String orderItemSeqId = ORDER_ITEM_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCartons() <em>Cartons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartons()
	 * @generated
	 * @ordered
	 */
	protected static final long CARTONS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCartons() <em>Cartons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartons()
	 * @generated
	 * @ordered
	 */
	protected long cartons = CARTONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedReadyDate() <em>Estimated Ready Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedReadyDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ESTIMATED_READY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedReadyDate() <em>Estimated Ready Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedReadyDate()
	 * @generated
	 * @ordered
	 */
	protected Date estimatedReadyDate = ESTIMATED_READY_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSkidsPallets() <em>Skids Pallets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkidsPallets()
	 * @generated
	 * @ordered
	 */
	protected static final long SKIDS_PALLETS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSkidsPallets() <em>Skids Pallets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkidsPallets()
	 * @generated
	 * @ordered
	 */
	protected long skidsPallets = SKIDS_PALLETS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalCubicSize() <em>Total Cubic Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCubicSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TOTAL_CUBIC_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalCubicSize() <em>Total Cubic Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCubicSize()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal totalCubicSize = TOTAL_CUBIC_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalWeight() <em>Total Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalWeight()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TOTAL_WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalWeight() <em>Total Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalWeight()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal totalWeight = TOTAL_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitsPieces() <em>Units Pieces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsPieces()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal UNITS_PIECES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitsPieces() <em>Units Pieces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsPieces()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal unitsPieces = UNITS_PIECES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrderId() <em>Order Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected OrderHeader orderId;

	/**
	 * The cached value of the '{@link #getTotalCubicUomId() <em>Total Cubic Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCubicUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom totalCubicUomId;

	/**
	 * The cached value of the '{@link #getTotalWeightUomId() <em>Total Weight Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalWeightUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom totalWeightUomId;

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
		return cartons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCartons(long newCartons) {
		cartons = newCartons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedReadyDate() {
		return estimatedReadyDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedReadyDate(Date newEstimatedReadyDate) {
		estimatedReadyDate = newEstimatedReadyDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderHeader getOrderId() {
		if (orderId != null && ((EObject)orderId).eIsProxy()) {
			InternalEObject oldOrderId = (InternalEObject)orderId;
			orderId = (OrderHeader)eResolveProxy(oldOrderId);
			if (orderId != oldOrderId) {
			}
		}
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderHeader basicGetOrderId() {
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(OrderHeader newOrderId) {
		orderId = newOrderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemSeqId() {
		return orderItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemSeqId(String newOrderItemSeqId) {
		orderItemSeqId = newOrderItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSkidsPallets() {
		return skidsPallets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkidsPallets(long newSkidsPallets) {
		skidsPallets = newSkidsPallets;
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
		statusId = newStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTotalCubicSize() {
		return totalCubicSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalCubicSize(BigDecimal newTotalCubicSize) {
		totalCubicSize = newTotalCubicSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getTotalCubicUomId() {
		if (totalCubicUomId != null && ((EObject)totalCubicUomId).eIsProxy()) {
			InternalEObject oldTotalCubicUomId = (InternalEObject)totalCubicUomId;
			totalCubicUomId = (Uom)eResolveProxy(oldTotalCubicUomId);
			if (totalCubicUomId != oldTotalCubicUomId) {
			}
		}
		return totalCubicUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetTotalCubicUomId() {
		return totalCubicUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalCubicUomId(Uom newTotalCubicUomId) {
		totalCubicUomId = newTotalCubicUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTotalWeight() {
		return totalWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalWeight(BigDecimal newTotalWeight) {
		totalWeight = newTotalWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getTotalWeightUomId() {
		if (totalWeightUomId != null && ((EObject)totalWeightUomId).eIsProxy()) {
			InternalEObject oldTotalWeightUomId = (InternalEObject)totalWeightUomId;
			totalWeightUomId = (Uom)eResolveProxy(oldTotalWeightUomId);
			if (totalWeightUomId != oldTotalWeightUomId) {
			}
		}
		return totalWeightUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetTotalWeightUomId() {
		return totalWeightUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalWeightUomId(Uom newTotalWeightUomId) {
		totalWeightUomId = newTotalWeightUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getUnitsPieces() {
		return unitsPieces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitsPieces(BigDecimal newUnitsPieces) {
		unitsPieces = newUnitsPieces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__ORDER_ITEM_SEQ_ID:
				return getOrderItemSeqId();
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__CARTONS:
				return getCartons();
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__ESTIMATED_READY_DATE:
				return getEstimatedReadyDate();
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__SKIDS_PALLETS:
				return getSkidsPallets();
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__TOTAL_CUBIC_SIZE:
				return getTotalCubicSize();
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__TOTAL_WEIGHT:
				return getTotalWeight();
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__UNITS_PIECES:
				return getUnitsPieces();
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__ORDER_ID:
				if (resolve) return getOrderId();
				return basicGetOrderId();
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__TOTAL_CUBIC_UOM_ID:
				if (resolve) return getTotalCubicUomId();
				return basicGetTotalCubicUomId();
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__TOTAL_WEIGHT_UOM_ID:
				if (resolve) return getTotalWeightUomId();
				return basicGetTotalWeightUomId();
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
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
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId((String)newValue);
				return;
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__CARTONS:
				setCartons((Long)newValue);
				return;
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__ESTIMATED_READY_DATE:
				setEstimatedReadyDate((Date)newValue);
				return;
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__SKIDS_PALLETS:
				setSkidsPallets((Long)newValue);
				return;
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__TOTAL_CUBIC_SIZE:
				setTotalCubicSize((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__TOTAL_WEIGHT:
				setTotalWeight((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__UNITS_PIECES:
				setUnitsPieces((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__ORDER_ID:
				setOrderId((OrderHeader)newValue);
				return;
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__TOTAL_CUBIC_UOM_ID:
				setTotalCubicUomId((Uom)newValue);
				return;
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__TOTAL_WEIGHT_UOM_ID:
				setTotalWeightUomId((Uom)newValue);
				return;
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__STATUS_ID:
				setStatusId((StatusItem)newValue);
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
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId(ORDER_ITEM_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__CARTONS:
				setCartons(CARTONS_EDEFAULT);
				return;
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__ESTIMATED_READY_DATE:
				setEstimatedReadyDate(ESTIMATED_READY_DATE_EDEFAULT);
				return;
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__SKIDS_PALLETS:
				setSkidsPallets(SKIDS_PALLETS_EDEFAULT);
				return;
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__TOTAL_CUBIC_SIZE:
				setTotalCubicSize(TOTAL_CUBIC_SIZE_EDEFAULT);
				return;
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__TOTAL_WEIGHT:
				setTotalWeight(TOTAL_WEIGHT_EDEFAULT);
				return;
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__UNITS_PIECES:
				setUnitsPieces(UNITS_PIECES_EDEFAULT);
				return;
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__ORDER_ID:
				setOrderId((OrderHeader)null);
				return;
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__TOTAL_CUBIC_UOM_ID:
				setTotalCubicUomId((Uom)null);
				return;
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__TOTAL_WEIGHT_UOM_ID:
				setTotalWeightUomId((Uom)null);
				return;
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__STATUS_ID:
				setStatusId((StatusItem)null);
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
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__ORDER_ITEM_SEQ_ID:
				return ORDER_ITEM_SEQ_ID_EDEFAULT == null ? orderItemSeqId != null : !ORDER_ITEM_SEQ_ID_EDEFAULT.equals(orderItemSeqId);
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__CARTONS:
				return cartons != CARTONS_EDEFAULT;
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__ESTIMATED_READY_DATE:
				return ESTIMATED_READY_DATE_EDEFAULT == null ? estimatedReadyDate != null : !ESTIMATED_READY_DATE_EDEFAULT.equals(estimatedReadyDate);
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__SKIDS_PALLETS:
				return skidsPallets != SKIDS_PALLETS_EDEFAULT;
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__TOTAL_CUBIC_SIZE:
				return TOTAL_CUBIC_SIZE_EDEFAULT == null ? totalCubicSize != null : !TOTAL_CUBIC_SIZE_EDEFAULT.equals(totalCubicSize);
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__TOTAL_WEIGHT:
				return TOTAL_WEIGHT_EDEFAULT == null ? totalWeight != null : !TOTAL_WEIGHT_EDEFAULT.equals(totalWeight);
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__UNITS_PIECES:
				return UNITS_PIECES_EDEFAULT == null ? unitsPieces != null : !UNITS_PIECES_EDEFAULT.equals(unitsPieces);
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__ORDER_ID:
				return orderId != null;
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__TOTAL_CUBIC_UOM_ID:
				return totalCubicUomId != null;
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__TOTAL_WEIGHT_UOM_ID:
				return totalWeightUomId != null;
			case OrderPackage.ORDER_DELIVERY_SCHEDULE__STATUS_ID:
				return statusId != null;
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
		result.append(" (orderItemSeqId: ");
		result.append(orderItemSeqId);
		result.append(", cartons: ");
		result.append(cartons);
		result.append(", estimatedReadyDate: ");
		result.append(estimatedReadyDate);
		result.append(", skidsPallets: ");
		result.append(skidsPallets);
		result.append(", totalCubicSize: ");
		result.append(totalCubicSize);
		result.append(", totalWeight: ");
		result.append(totalWeight);
		result.append(", unitsPieces: ");
		result.append(unitsPieces);
		result.append(')');
		return result.toString();
	}

} //OrderDeliveryScheduleImpl
