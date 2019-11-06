/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.return_.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.return_.ReturnHeader;
import org.abchip.mimo.biz.order.return_.ReturnItemShipment;
import org.abchip.mimo.biz.order.return_.ReturnPackage;
import org.abchip.mimo.biz.shipment.shipment.Shipment;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Item Shipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemShipmentImpl#getReturnItemSeqId <em>Return Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemShipmentImpl#getShipmentItemSeqId <em>Shipment Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemShipmentImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemShipmentImpl#getReturnId <em>Return Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemShipmentImpl#getShipmentId <em>Shipment Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnItemShipmentImpl extends BizEntityImpl implements ReturnItemShipment {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getReturnItemSeqId() <em>Return Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnItemSeqId() <em>Return Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String returnItemSeqId = RETURN_ITEM_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getShipmentItemSeqId() <em>Shipment Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPMENT_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipmentItemSeqId() <em>Shipment Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String shipmentItemSeqId = SHIPMENT_ITEM_SEQ_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getReturnId() <em>Return Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnId()
	 * @generated
	 * @ordered
	 */
	protected ReturnHeader returnId;

	/**
	 * The cached value of the '{@link #getShipmentId() <em>Shipment Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentId()
	 * @generated
	 * @ordered
	 */
	protected Shipment shipmentId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnItemShipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReturnPackage.Literals.RETURN_ITEM_SHIPMENT;
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
		quantity = newQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnHeader getReturnId() {
		if (returnId != null && ((EObject)returnId).eIsProxy()) {
			InternalEObject oldReturnId = (InternalEObject)returnId;
			returnId = (ReturnHeader)eResolveProxy(oldReturnId);
			if (returnId != oldReturnId) {
			}
		}
		return returnId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnHeader basicGetReturnId() {
		return returnId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnId(ReturnHeader newReturnId) {
		returnId = newReturnId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnItemSeqId() {
		return returnItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnItemSeqId(String newReturnItemSeqId) {
		returnItemSeqId = newReturnItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shipment getShipmentId() {
		if (shipmentId != null && ((EObject)shipmentId).eIsProxy()) {
			InternalEObject oldShipmentId = (InternalEObject)shipmentId;
			shipmentId = (Shipment)eResolveProxy(oldShipmentId);
			if (shipmentId != oldShipmentId) {
			}
		}
		return shipmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shipment basicGetShipmentId() {
		return shipmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentId(Shipment newShipmentId) {
		shipmentId = newShipmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentItemSeqId() {
		return shipmentItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentItemSeqId(String newShipmentItemSeqId) {
		shipmentItemSeqId = newShipmentItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReturnPackage.RETURN_ITEM_SHIPMENT__RETURN_ITEM_SEQ_ID:
				return getReturnItemSeqId();
			case ReturnPackage.RETURN_ITEM_SHIPMENT__SHIPMENT_ITEM_SEQ_ID:
				return getShipmentItemSeqId();
			case ReturnPackage.RETURN_ITEM_SHIPMENT__QUANTITY:
				return getQuantity();
			case ReturnPackage.RETURN_ITEM_SHIPMENT__RETURN_ID:
				if (resolve) return getReturnId();
				return basicGetReturnId();
			case ReturnPackage.RETURN_ITEM_SHIPMENT__SHIPMENT_ID:
				if (resolve) return getShipmentId();
				return basicGetShipmentId();
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
			case ReturnPackage.RETURN_ITEM_SHIPMENT__RETURN_ITEM_SEQ_ID:
				setReturnItemSeqId((String)newValue);
				return;
			case ReturnPackage.RETURN_ITEM_SHIPMENT__SHIPMENT_ITEM_SEQ_ID:
				setShipmentItemSeqId((String)newValue);
				return;
			case ReturnPackage.RETURN_ITEM_SHIPMENT__QUANTITY:
				setQuantity((BigDecimal)newValue);
				return;
			case ReturnPackage.RETURN_ITEM_SHIPMENT__RETURN_ID:
				setReturnId((ReturnHeader)newValue);
				return;
			case ReturnPackage.RETURN_ITEM_SHIPMENT__SHIPMENT_ID:
				setShipmentId((Shipment)newValue);
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
			case ReturnPackage.RETURN_ITEM_SHIPMENT__RETURN_ITEM_SEQ_ID:
				setReturnItemSeqId(RETURN_ITEM_SEQ_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM_SHIPMENT__SHIPMENT_ITEM_SEQ_ID:
				setShipmentItemSeqId(SHIPMENT_ITEM_SEQ_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM_SHIPMENT__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM_SHIPMENT__RETURN_ID:
				setReturnId((ReturnHeader)null);
				return;
			case ReturnPackage.RETURN_ITEM_SHIPMENT__SHIPMENT_ID:
				setShipmentId((Shipment)null);
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
			case ReturnPackage.RETURN_ITEM_SHIPMENT__RETURN_ITEM_SEQ_ID:
				return RETURN_ITEM_SEQ_ID_EDEFAULT == null ? returnItemSeqId != null : !RETURN_ITEM_SEQ_ID_EDEFAULT.equals(returnItemSeqId);
			case ReturnPackage.RETURN_ITEM_SHIPMENT__SHIPMENT_ITEM_SEQ_ID:
				return SHIPMENT_ITEM_SEQ_ID_EDEFAULT == null ? shipmentItemSeqId != null : !SHIPMENT_ITEM_SEQ_ID_EDEFAULT.equals(shipmentItemSeqId);
			case ReturnPackage.RETURN_ITEM_SHIPMENT__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case ReturnPackage.RETURN_ITEM_SHIPMENT__RETURN_ID:
				return returnId != null;
			case ReturnPackage.RETURN_ITEM_SHIPMENT__SHIPMENT_ID:
				return shipmentId != null;
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
		result.append(" (returnItemSeqId: ");
		result.append(returnItemSeqId);
		result.append(", shipmentItemSeqId: ");
		result.append(shipmentItemSeqId);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(')');
		return result.toString();
	}

} //ReturnItemShipmentImpl
