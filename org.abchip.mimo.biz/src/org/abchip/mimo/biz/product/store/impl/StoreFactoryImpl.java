/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store.impl;

import org.abchip.mimo.biz.product.store.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StoreFactoryImpl extends EFactoryImpl implements StoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StoreFactory init() {
		try {
			StoreFactory theStoreFactory = (StoreFactory)EPackage.Registry.INSTANCE.getEFactory(StorePackage.eNS_URI);
			if (theStoreFactory != null) {
				return theStoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StorePackage.PRODUCT_STORE: return (EObject)createProductStore();
			case StorePackage.PRODUCT_STORE_CATALOG: return (EObject)createProductStoreCatalog();
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING: return (EObject)createProductStoreEmailSetting();
			case StorePackage.PRODUCT_STORE_FACILITY: return (EObject)createProductStoreFacility();
			case StorePackage.PRODUCT_STORE_FIN_ACT_SETTING: return (EObject)createProductStoreFinActSetting();
			case StorePackage.PRODUCT_STORE_GROUP: return (EObject)createProductStoreGroup();
			case StorePackage.PRODUCT_STORE_GROUP_MEMBER: return (EObject)createProductStoreGroupMember();
			case StorePackage.PRODUCT_STORE_GROUP_ROLE: return (EObject)createProductStoreGroupRole();
			case StorePackage.PRODUCT_STORE_GROUP_ROLLUP: return (EObject)createProductStoreGroupRollup();
			case StorePackage.PRODUCT_STORE_GROUP_TYPE: return (EObject)createProductStoreGroupType();
			case StorePackage.PRODUCT_STORE_KEYWORD_OVRD: return (EObject)createProductStoreKeywordOvrd();
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING: return (EObject)createProductStorePaymentSetting();
			case StorePackage.PRODUCT_STORE_PROMO_APPL: return (EObject)createProductStorePromoAppl();
			case StorePackage.PRODUCT_STORE_ROLE: return (EObject)createProductStoreRole();
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH: return (EObject)createProductStoreShipmentMeth();
			case StorePackage.PRODUCT_STORE_SURVEY_APPL: return (EObject)createProductStoreSurveyAppl();
			case StorePackage.PRODUCT_STORE_VENDOR_PAYMENT: return (EObject)createProductStoreVendorPayment();
			case StorePackage.PRODUCT_STORE_VENDOR_SHIPMENT: return (EObject)createProductStoreVendorShipment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStore createProductStore() {
		ProductStoreImpl productStore = new ProductStoreImpl();
		return productStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStoreCatalog createProductStoreCatalog() {
		ProductStoreCatalogImpl productStoreCatalog = new ProductStoreCatalogImpl();
		return productStoreCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStoreEmailSetting createProductStoreEmailSetting() {
		ProductStoreEmailSettingImpl productStoreEmailSetting = new ProductStoreEmailSettingImpl();
		return productStoreEmailSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStoreFacility createProductStoreFacility() {
		ProductStoreFacilityImpl productStoreFacility = new ProductStoreFacilityImpl();
		return productStoreFacility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStoreFinActSetting createProductStoreFinActSetting() {
		ProductStoreFinActSettingImpl productStoreFinActSetting = new ProductStoreFinActSettingImpl();
		return productStoreFinActSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStoreGroup createProductStoreGroup() {
		ProductStoreGroupImpl productStoreGroup = new ProductStoreGroupImpl();
		return productStoreGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStoreGroupMember createProductStoreGroupMember() {
		ProductStoreGroupMemberImpl productStoreGroupMember = new ProductStoreGroupMemberImpl();
		return productStoreGroupMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStoreGroupRole createProductStoreGroupRole() {
		ProductStoreGroupRoleImpl productStoreGroupRole = new ProductStoreGroupRoleImpl();
		return productStoreGroupRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStoreGroupRollup createProductStoreGroupRollup() {
		ProductStoreGroupRollupImpl productStoreGroupRollup = new ProductStoreGroupRollupImpl();
		return productStoreGroupRollup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStoreGroupType createProductStoreGroupType() {
		ProductStoreGroupTypeImpl productStoreGroupType = new ProductStoreGroupTypeImpl();
		return productStoreGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStoreKeywordOvrd createProductStoreKeywordOvrd() {
		ProductStoreKeywordOvrdImpl productStoreKeywordOvrd = new ProductStoreKeywordOvrdImpl();
		return productStoreKeywordOvrd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStorePaymentSetting createProductStorePaymentSetting() {
		ProductStorePaymentSettingImpl productStorePaymentSetting = new ProductStorePaymentSettingImpl();
		return productStorePaymentSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStorePromoAppl createProductStorePromoAppl() {
		ProductStorePromoApplImpl productStorePromoAppl = new ProductStorePromoApplImpl();
		return productStorePromoAppl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStoreRole createProductStoreRole() {
		ProductStoreRoleImpl productStoreRole = new ProductStoreRoleImpl();
		return productStoreRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStoreShipmentMeth createProductStoreShipmentMeth() {
		ProductStoreShipmentMethImpl productStoreShipmentMeth = new ProductStoreShipmentMethImpl();
		return productStoreShipmentMeth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStoreSurveyAppl createProductStoreSurveyAppl() {
		ProductStoreSurveyApplImpl productStoreSurveyAppl = new ProductStoreSurveyApplImpl();
		return productStoreSurveyAppl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStoreVendorPayment createProductStoreVendorPayment() {
		ProductStoreVendorPaymentImpl productStoreVendorPayment = new ProductStoreVendorPaymentImpl();
		return productStoreVendorPayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStoreVendorShipment createProductStoreVendorShipment() {
		ProductStoreVendorShipmentImpl productStoreVendorShipment = new ProductStoreVendorShipmentImpl();
		return productStoreVendorShipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StorePackage getStorePackage() {
		return (StorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StorePackage getPackage() {
		return StorePackage.eINSTANCE;
	}

} //StoreFactoryImpl
