/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.store.ProductStoreVendorShipment;
import org.abchip.mimo.biz.product.store.StorePackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
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
	 * The default value of the '{@link #getVendorPartyId() <em>Vendor Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendorPartyId() <em>Vendor Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorPartyId()
	 * @generated
	 * @ordered
	 */
	protected String vendorPartyId = VENDOR_PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getShipmentMethodTypeId() <em>Shipment Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPMENT_METHOD_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipmentMethodTypeId() <em>Shipment Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected String shipmentMethodTypeId = SHIPMENT_METHOD_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCarrierPartyId() <em>Carrier Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String CARRIER_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarrierPartyId() <em>Carrier Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierPartyId()
	 * @generated
	 * @ordered
	 */
	protected String carrierPartyId = CARRIER_PARTY_ID_EDEFAULT;

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
	public String getCarrierPartyId() {
		return carrierPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierPartyId(String newCarrierPartyId) {
		String oldCarrierPartyId = carrierPartyId;
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
	public String getShipmentMethodTypeId() {
		return shipmentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentMethodTypeId(String newShipmentMethodTypeId) {
		String oldShipmentMethodTypeId = shipmentMethodTypeId;
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
	public String getVendorPartyId() {
		return vendorPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendorPartyId(String newVendorPartyId) {
		String oldVendorPartyId = vendorPartyId;
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
				return getVendorPartyId();
			case StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__SHIPMENT_METHOD_TYPE_ID:
				return getShipmentMethodTypeId();
			case StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__CARRIER_PARTY_ID:
				return getCarrierPartyId();
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
				setVendorPartyId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__SHIPMENT_METHOD_TYPE_ID:
				setShipmentMethodTypeId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__CARRIER_PARTY_ID:
				setCarrierPartyId((String)newValue);
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
				setVendorPartyId(VENDOR_PARTY_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__SHIPMENT_METHOD_TYPE_ID:
				setShipmentMethodTypeId(SHIPMENT_METHOD_TYPE_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__CARRIER_PARTY_ID:
				setCarrierPartyId(CARRIER_PARTY_ID_EDEFAULT);
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
				return VENDOR_PARTY_ID_EDEFAULT == null ? vendorPartyId != null : !VENDOR_PARTY_ID_EDEFAULT.equals(vendorPartyId);
			case StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__SHIPMENT_METHOD_TYPE_ID:
				return SHIPMENT_METHOD_TYPE_ID_EDEFAULT == null ? shipmentMethodTypeId != null : !SHIPMENT_METHOD_TYPE_ID_EDEFAULT.equals(shipmentMethodTypeId);
			case StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT__CARRIER_PARTY_ID:
				return CARRIER_PARTY_ID_EDEFAULT == null ? carrierPartyId != null : !CARRIER_PARTY_ID_EDEFAULT.equals(carrierPartyId);
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
		result.append(", vendorPartyId: ");
		result.append(vendorPartyId);
		result.append(", shipmentMethodTypeId: ");
		result.append(shipmentMethodTypeId);
		result.append(", carrierPartyId: ");
		result.append(carrierPartyId);
		result.append(')');
		return result.toString();
	}

} //ProductStoreVendorShipmentImpl
