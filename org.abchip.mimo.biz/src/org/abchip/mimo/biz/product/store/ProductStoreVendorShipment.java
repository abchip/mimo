/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Store Vendor Shipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreVendorShipment#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreVendorShipment#getVendorPartyId <em>Vendor Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreVendorShipment#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreVendorShipment#getCarrierPartyId <em>Carrier Party Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreVendorShipment()
 * @model
 * @generated
 */
public interface ProductStoreVendorShipment extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Carrier Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carrier Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Party Id</em>' attribute.
	 * @see #setCarrierPartyId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreVendorShipment_CarrierPartyId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getCarrierPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreVendorShipment#getCarrierPartyId <em>Carrier Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Party Id</em>' attribute.
	 * @see #getCarrierPartyId()
	 * @generated
	 */
	void setCarrierPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Shipment Method Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Method Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Method Type Id</em>' attribute.
	 * @see #setShipmentMethodTypeId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreVendorShipment_ShipmentMethodTypeId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentMethodType'"
	 * @generated
	 */
	String getShipmentMethodTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreVendorShipment#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Method Type Id</em>' attribute.
	 * @see #getShipmentMethodTypeId()
	 * @generated
	 */
	void setShipmentMethodTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Vendor Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Party Id</em>' attribute.
	 * @see #setVendorPartyId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreVendorShipment_VendorPartyId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getVendorPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreVendorShipment#getVendorPartyId <em>Vendor Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Party Id</em>' attribute.
	 * @see #getVendorPartyId()
	 * @generated
	 */
	void setVendorPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Product Store Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' attribute.
	 * @see #setProductStoreId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreVendorShipment_ProductStoreId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ProductStore'"
	 * @generated
	 */
	String getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreVendorShipment#getProductStoreId <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' attribute.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(String value);

} // ProductStoreVendorShipment
