/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.fixedasset.impl;

import org.abchip.mimo.biz.accounting.fixedasset.*;
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
public class FixedassetFactoryImpl extends EFactoryImpl implements FixedassetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FixedassetFactory init() {
		try {
			FixedassetFactory theFixedassetFactory = (FixedassetFactory)EPackage.Registry.INSTANCE.getEFactory(FixedassetPackage.eNS_URI);
			if (theFixedassetFactory != null) {
				return theFixedassetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FixedassetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedassetFactoryImpl() {
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
			case FixedassetPackage.ACCOMMODATION_CLASS: return (EObject)createAccommodationClass();
			case FixedassetPackage.ACCOMMODATION_MAP: return (EObject)createAccommodationMap();
			case FixedassetPackage.ACCOMMODATION_MAP_TYPE: return (EObject)createAccommodationMapType();
			case FixedassetPackage.FIXED_ASSET: return (EObject)createFixedAsset();
			case FixedassetPackage.FIXED_ASSET_ATTRIBUTE: return (EObject)createFixedAssetAttribute();
			case FixedassetPackage.FIXED_ASSET_DEP_METHOD: return (EObject)createFixedAssetDepMethod();
			case FixedassetPackage.FIXED_ASSET_GEO_POINT: return (EObject)createFixedAssetGeoPoint();
			case FixedassetPackage.FIXED_ASSET_IDENT: return (EObject)createFixedAssetIdent();
			case FixedassetPackage.FIXED_ASSET_IDENT_TYPE: return (EObject)createFixedAssetIdentType();
			case FixedassetPackage.FIXED_ASSET_MAINT: return (EObject)createFixedAssetMaint();
			case FixedassetPackage.FIXED_ASSET_MAINT_ORDER: return (EObject)createFixedAssetMaintOrder();
			case FixedassetPackage.FIXED_ASSET_METER: return (EObject)createFixedAssetMeter();
			case FixedassetPackage.FIXED_ASSET_PRODUCT: return (EObject)createFixedAssetProduct();
			case FixedassetPackage.FIXED_ASSET_PRODUCT_TYPE: return (EObject)createFixedAssetProductType();
			case FixedassetPackage.FIXED_ASSET_REGISTRATION: return (EObject)createFixedAssetRegistration();
			case FixedassetPackage.FIXED_ASSET_STD_COST: return (EObject)createFixedAssetStdCost();
			case FixedassetPackage.FIXED_ASSET_STD_COST_TYPE: return (EObject)createFixedAssetStdCostType();
			case FixedassetPackage.FIXED_ASSET_TYPE: return (EObject)createFixedAssetType();
			case FixedassetPackage.FIXED_ASSET_TYPE_ATTR: return (EObject)createFixedAssetTypeAttr();
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT: return (EObject)createFixedAssetTypeGlAccount();
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT: return (EObject)createPartyFixedAssetAssignment();
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
	public AccommodationClass createAccommodationClass() {
		AccommodationClassImpl accommodationClass = new AccommodationClassImpl();
		return accommodationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccommodationMap createAccommodationMap() {
		AccommodationMapImpl accommodationMap = new AccommodationMapImpl();
		return accommodationMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccommodationMapType createAccommodationMapType() {
		AccommodationMapTypeImpl accommodationMapType = new AccommodationMapTypeImpl();
		return accommodationMapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAsset createFixedAsset() {
		FixedAssetImpl fixedAsset = new FixedAssetImpl();
		return fixedAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAssetAttribute createFixedAssetAttribute() {
		FixedAssetAttributeImpl fixedAssetAttribute = new FixedAssetAttributeImpl();
		return fixedAssetAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAssetDepMethod createFixedAssetDepMethod() {
		FixedAssetDepMethodImpl fixedAssetDepMethod = new FixedAssetDepMethodImpl();
		return fixedAssetDepMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAssetGeoPoint createFixedAssetGeoPoint() {
		FixedAssetGeoPointImpl fixedAssetGeoPoint = new FixedAssetGeoPointImpl();
		return fixedAssetGeoPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAssetIdent createFixedAssetIdent() {
		FixedAssetIdentImpl fixedAssetIdent = new FixedAssetIdentImpl();
		return fixedAssetIdent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAssetIdentType createFixedAssetIdentType() {
		FixedAssetIdentTypeImpl fixedAssetIdentType = new FixedAssetIdentTypeImpl();
		return fixedAssetIdentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAssetMaint createFixedAssetMaint() {
		FixedAssetMaintImpl fixedAssetMaint = new FixedAssetMaintImpl();
		return fixedAssetMaint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAssetMaintOrder createFixedAssetMaintOrder() {
		FixedAssetMaintOrderImpl fixedAssetMaintOrder = new FixedAssetMaintOrderImpl();
		return fixedAssetMaintOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAssetMeter createFixedAssetMeter() {
		FixedAssetMeterImpl fixedAssetMeter = new FixedAssetMeterImpl();
		return fixedAssetMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAssetProduct createFixedAssetProduct() {
		FixedAssetProductImpl fixedAssetProduct = new FixedAssetProductImpl();
		return fixedAssetProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAssetProductType createFixedAssetProductType() {
		FixedAssetProductTypeImpl fixedAssetProductType = new FixedAssetProductTypeImpl();
		return fixedAssetProductType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAssetRegistration createFixedAssetRegistration() {
		FixedAssetRegistrationImpl fixedAssetRegistration = new FixedAssetRegistrationImpl();
		return fixedAssetRegistration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAssetStdCost createFixedAssetStdCost() {
		FixedAssetStdCostImpl fixedAssetStdCost = new FixedAssetStdCostImpl();
		return fixedAssetStdCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAssetStdCostType createFixedAssetStdCostType() {
		FixedAssetStdCostTypeImpl fixedAssetStdCostType = new FixedAssetStdCostTypeImpl();
		return fixedAssetStdCostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAssetType createFixedAssetType() {
		FixedAssetTypeImpl fixedAssetType = new FixedAssetTypeImpl();
		return fixedAssetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAssetTypeAttr createFixedAssetTypeAttr() {
		FixedAssetTypeAttrImpl fixedAssetTypeAttr = new FixedAssetTypeAttrImpl();
		return fixedAssetTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAssetTypeGlAccount createFixedAssetTypeGlAccount() {
		FixedAssetTypeGlAccountImpl fixedAssetTypeGlAccount = new FixedAssetTypeGlAccountImpl();
		return fixedAssetTypeGlAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyFixedAssetAssignment createPartyFixedAssetAssignment() {
		PartyFixedAssetAssignmentImpl partyFixedAssetAssignment = new PartyFixedAssetAssignmentImpl();
		return partyFixedAssetAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedassetPackage getFixedassetPackage() {
		return (FixedassetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FixedassetPackage getPackage() {
		return FixedassetPackage.eINSTANCE;
	}

} //FixedassetFactoryImpl
