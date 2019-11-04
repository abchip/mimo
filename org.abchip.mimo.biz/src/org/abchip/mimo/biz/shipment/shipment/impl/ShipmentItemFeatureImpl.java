/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.feature.ProductFeature;
import org.abchip.mimo.biz.shipment.shipment.ShipmentItemFeature;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment Item Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentItemFeatureImpl#getShipmentId <em>Shipment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentItemFeatureImpl#getShipmentItemSeqId <em>Shipment Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentItemFeatureImpl#getProductFeatureId <em>Product Feature Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentItemFeatureImpl extends BizEntityImpl implements ShipmentItemFeature {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getShipmentId() <em>Shipment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipmentId() <em>Shipment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentId()
	 * @generated
	 * @ordered
	 */
	protected String shipmentId = SHIPMENT_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getProductFeatureId() <em>Product Feature Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureId()
	 * @generated
	 * @ordered
	 */
	protected ProductFeature productFeatureId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentItemFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shipment_Package.Literals.SHIPMENT_ITEM_FEATURE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_ITEM_FEATURE__PRODUCT_FEATURE_ID, oldProductFeatureId, productFeatureId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ITEM_FEATURE__PRODUCT_FEATURE_ID, oldProductFeatureId, productFeatureId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentId() {
		return shipmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentId(String newShipmentId) {
		String oldShipmentId = shipmentId;
		shipmentId = newShipmentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ITEM_FEATURE__SHIPMENT_ID, oldShipmentId, shipmentId));
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
		String oldShipmentItemSeqId = shipmentItemSeqId;
		shipmentItemSeqId = newShipmentItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_ITEM_FEATURE__SHIPMENT_ITEM_SEQ_ID, oldShipmentItemSeqId, shipmentItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Shipment_Package.SHIPMENT_ITEM_FEATURE__SHIPMENT_ID:
				return getShipmentId();
			case Shipment_Package.SHIPMENT_ITEM_FEATURE__SHIPMENT_ITEM_SEQ_ID:
				return getShipmentItemSeqId();
			case Shipment_Package.SHIPMENT_ITEM_FEATURE__PRODUCT_FEATURE_ID:
				if (resolve) return getProductFeatureId();
				return basicGetProductFeatureId();
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
			case Shipment_Package.SHIPMENT_ITEM_FEATURE__SHIPMENT_ID:
				setShipmentId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_ITEM_FEATURE__SHIPMENT_ITEM_SEQ_ID:
				setShipmentItemSeqId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_ITEM_FEATURE__PRODUCT_FEATURE_ID:
				setProductFeatureId((ProductFeature)newValue);
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
			case Shipment_Package.SHIPMENT_ITEM_FEATURE__SHIPMENT_ID:
				setShipmentId(SHIPMENT_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_ITEM_FEATURE__SHIPMENT_ITEM_SEQ_ID:
				setShipmentItemSeqId(SHIPMENT_ITEM_SEQ_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_ITEM_FEATURE__PRODUCT_FEATURE_ID:
				setProductFeatureId((ProductFeature)null);
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
			case Shipment_Package.SHIPMENT_ITEM_FEATURE__SHIPMENT_ID:
				return SHIPMENT_ID_EDEFAULT == null ? shipmentId != null : !SHIPMENT_ID_EDEFAULT.equals(shipmentId);
			case Shipment_Package.SHIPMENT_ITEM_FEATURE__SHIPMENT_ITEM_SEQ_ID:
				return SHIPMENT_ITEM_SEQ_ID_EDEFAULT == null ? shipmentItemSeqId != null : !SHIPMENT_ITEM_SEQ_ID_EDEFAULT.equals(shipmentItemSeqId);
			case Shipment_Package.SHIPMENT_ITEM_FEATURE__PRODUCT_FEATURE_ID:
				return productFeatureId != null;
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
		result.append(" (shipmentId: ");
		result.append(shipmentId);
		result.append(", shipmentItemSeqId: ");
		result.append(shipmentItemSeqId);
		result.append(')');
		return result.toString();
	}

} //ShipmentItemFeatureImpl
