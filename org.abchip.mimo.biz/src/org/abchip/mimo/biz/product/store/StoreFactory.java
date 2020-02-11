/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.product.store.StorePackage
 * @generated
 */
public interface StoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StoreFactory eINSTANCE = org.abchip.mimo.biz.product.store.impl.StoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Product Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Store</em>'.
	 * @generated
	 */
	ProductStore createProductStore();

	/**
	 * Returns a new object of class '<em>Product Store Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Store Catalog</em>'.
	 * @generated
	 */
	ProductStoreCatalog createProductStoreCatalog();

	/**
	 * Returns a new object of class '<em>Product Store Email Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Store Email Setting</em>'.
	 * @generated
	 */
	ProductStoreEmailSetting createProductStoreEmailSetting();

	/**
	 * Returns a new object of class '<em>Product Store Facility</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Store Facility</em>'.
	 * @generated
	 */
	ProductStoreFacility createProductStoreFacility();

	/**
	 * Returns a new object of class '<em>Product Store Fin Act Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Store Fin Act Setting</em>'.
	 * @generated
	 */
	ProductStoreFinActSetting createProductStoreFinActSetting();

	/**
	 * Returns a new object of class '<em>Product Store Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Store Group</em>'.
	 * @generated
	 */
	ProductStoreGroup createProductStoreGroup();

	/**
	 * Returns a new object of class '<em>Product Store Group Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Store Group Member</em>'.
	 * @generated
	 */
	ProductStoreGroupMember createProductStoreGroupMember();

	/**
	 * Returns a new object of class '<em>Product Store Group Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Store Group Role</em>'.
	 * @generated
	 */
	ProductStoreGroupRole createProductStoreGroupRole();

	/**
	 * Returns a new object of class '<em>Product Store Group Rollup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Store Group Rollup</em>'.
	 * @generated
	 */
	ProductStoreGroupRollup createProductStoreGroupRollup();

	/**
	 * Returns a new object of class '<em>Product Store Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Store Group Type</em>'.
	 * @generated
	 */
	ProductStoreGroupType createProductStoreGroupType();

	/**
	 * Returns a new object of class '<em>Product Store Keyword Ovrd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Store Keyword Ovrd</em>'.
	 * @generated
	 */
	ProductStoreKeywordOvrd createProductStoreKeywordOvrd();

	/**
	 * Returns a new object of class '<em>Product Store Payment Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Store Payment Setting</em>'.
	 * @generated
	 */
	ProductStorePaymentSetting createProductStorePaymentSetting();

	/**
	 * Returns a new object of class '<em>Product Store Promo Appl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Store Promo Appl</em>'.
	 * @generated
	 */
	ProductStorePromoAppl createProductStorePromoAppl();

	/**
	 * Returns a new object of class '<em>Product Store Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Store Role</em>'.
	 * @generated
	 */
	ProductStoreRole createProductStoreRole();

	/**
	 * Returns a new object of class '<em>Product Store Shipment Meth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Store Shipment Meth</em>'.
	 * @generated
	 */
	ProductStoreShipmentMeth createProductStoreShipmentMeth();

	/**
	 * Returns a new object of class '<em>Product Store Survey Appl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Store Survey Appl</em>'.
	 * @generated
	 */
	ProductStoreSurveyAppl createProductStoreSurveyAppl();

	/**
	 * Returns a new object of class '<em>Product Store Vendor Payment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Store Vendor Payment</em>'.
	 * @generated
	 */
	ProductStoreVendorPayment createProductStoreVendorPayment();

	/**
	 * Returns a new object of class '<em>Product Store Vendor Shipment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Store Vendor Shipment</em>'.
	 * @generated
	 */
	ProductStoreVendorShipment createProductStoreVendorShipment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StorePackage getStorePackage();

} //StoreFactory
