/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.store.ProductStoreVendorShipment;
import org.abchip.mimo.biz.product.store.StorePackage;
import org.abchip.mimo.biz.shipment.shipment.ShipmentMethodType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Store Vendor Shipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreVendorShipmentImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreVendorShipmentImpl#getVendorPartyId <em>Vendor Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreVendorShipmentImpl#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreVendorShipmentImpl#getCarrierPartyId <em>Carrier Party Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductStoreVendorShipmentImpl extends BizEntityImpl implements ProductStoreVendorShipment {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_STORE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected String productStoreId = PRODUCT_STORE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVendorPartyId() <em>Vendor Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party vendorPartyId;

	/**
	 * The cached value of the '{@link #getShipmentMethodTypeId() <em>Shipment Method Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected ShipmentMethodType shipmentMethodTypeId;

	/**
	 * The cached value of the '{@link #getCarrierPartyId() <em>Carrier Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party carrierPartyId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductStoreVendorShipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.PRODUCT_STORE_VENDOR_SHIPMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getCarrierPartyId() {
		if (carrierPartyId != null && ((EObject)carrierPartyId).eIsProxy()) {
			InternalEObject oldCarrierPartyId = (InternalEObject)carrierPartyId;
			carrierPartyId = (Party)eResolveProxy(oldCarrierPartyId);
			if (carrierPartyId != oldCarrierPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__CARRIER_PARTY_ID, oldCarrierPartyId, carrierPartyId));
			}
		}
		return carrierPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetCarrierPartyId() {
		return carrierPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierPartyId(Party newCarrierPartyId) {
		Party oldCarrierPartyId = carrierPartyId;
		carrierPartyId = newCarrierPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__CARRIER_PARTY_ID, oldCarrierPartyId, carrierPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentMethodType getShipmentMethodTypeId() {
		if (shipmentMethodTypeId != null && ((EObject)shipmentMethodTypeId).eIsProxy()) {
			InternalEObject oldShipmentMethodTypeId = (InternalEObject)shipmentMethodTypeId;
			shipmentMethodTypeId = (ShipmentMethodType)eResolveProxy(oldShipmentMethodTypeId);
			if (shipmentMethodTypeId != oldShipmentMethodTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__SHIPMENT_METHOD_TYPE_ID, oldShipmentMethodTypeId, shipmentMethodTypeId));
			}
		}
		return shipmentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipmentMethodType basicGetShipmentMethodTypeId() {
		return shipmentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentMethodTypeId(ShipmentMethodType newShipmentMethodTypeId) {
		ShipmentMethodType oldShipmentMethodTypeId = shipmentMethodTypeId;
		shipmentMethodTypeId = newShipmentMethodTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__SHIPMENT_METHOD_TYPE_ID, oldShipmentMethodTypeId, shipmentMethodTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getVendorPartyId() {
		if (vendorPartyId != null && ((EObject)vendorPartyId).eIsProxy()) {
			InternalEObject oldVendorPartyId = (InternalEObject)vendorPartyId;
			vendorPartyId = (Party)eResolveProxy(oldVendorPartyId);
			if (vendorPartyId != oldVendorPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__VENDOR_PARTY_ID, oldVendorPartyId, vendorPartyId));
			}
		}
		return vendorPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetVendorPartyId() {
		return vendorPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendorPartyId(Party newVendorPartyId) {
		Party oldVendorPartyId = vendorPartyId;
		vendorPartyId = newVendorPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__VENDOR_PARTY_ID, oldVendorPartyId, vendorPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductStoreId() {
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(String newProductStoreId) {
		String oldProductStoreId = productStoreId;
		productStoreId = newProductStoreId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__PRODUCT_STORE_ID:
				return getProductStoreId();
			case StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__VENDOR_PARTY_ID:
				if (resolve) return getVendorPartyId();
				return basicGetVendorPartyId();
			case StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__SHIPMENT_METHOD_TYPE_ID:
				if (resolve) return getShipmentMethodTypeId();
				return basicGetShipmentMethodTypeId();
			case StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__CARRIER_PARTY_ID:
				if (resolve) return getCarrierPartyId();
				return basicGetCarrierPartyId();
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
			case StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__PRODUCT_STORE_ID:
				setProductStoreId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__VENDOR_PARTY_ID:
				setVendorPartyId((Party)newValue);
				return;
			case StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__SHIPMENT_METHOD_TYPE_ID:
				setShipmentMethodTypeId((ShipmentMethodType)newValue);
				return;
			case StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__CARRIER_PARTY_ID:
				setCarrierPartyId((Party)newValue);
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
			case StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__PRODUCT_STORE_ID:
				setProductStoreId(PRODUCT_STORE_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__VENDOR_PARTY_ID:
				setVendorPartyId((Party)null);
				return;
			case StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__SHIPMENT_METHOD_TYPE_ID:
				setShipmentMethodTypeId((ShipmentMethodType)null);
				return;
			case StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__CARRIER_PARTY_ID:
				setCarrierPartyId((Party)null);
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
			case StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__PRODUCT_STORE_ID:
				return PRODUCT_STORE_ID_EDEFAULT == null ? productStoreId != null : !PRODUCT_STORE_ID_EDEFAULT.equals(productStoreId);
			case StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__VENDOR_PARTY_ID:
				return vendorPartyId != null;
			case StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__SHIPMENT_METHOD_TYPE_ID:
				return shipmentMethodTypeId != null;
			case StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__CARRIER_PARTY_ID:
				return carrierPartyId != null;
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
		result.append(" (productStoreId: ");
		result.append(productStoreId);
		result.append(')');
		return result.toString();
	}

} //ProductStoreVendorShipmentImpl
