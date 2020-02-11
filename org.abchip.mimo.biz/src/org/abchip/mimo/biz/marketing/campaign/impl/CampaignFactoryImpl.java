/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.campaign.impl;

import org.abchip.mimo.biz.marketing.campaign.*;
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
public class CampaignFactoryImpl extends EFactoryImpl implements CampaignFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CampaignFactory init() {
		try {
			CampaignFactory theCampaignFactory = (CampaignFactory)EPackage.Registry.INSTANCE.getEFactory(CampaignPackage.eNS_URI);
			if (theCampaignFactory != null) {
				return theCampaignFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CampaignFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CampaignFactoryImpl() {
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
			case CampaignPackage.MARKETING_CAMPAIGN: return (EObject)createMarketingCampaign();
			case CampaignPackage.MARKETING_CAMPAIGN_NOTE: return (EObject)createMarketingCampaignNote();
			case CampaignPackage.MARKETING_CAMPAIGN_PRICE: return (EObject)createMarketingCampaignPrice();
			case CampaignPackage.MARKETING_CAMPAIGN_PROMO: return (EObject)createMarketingCampaignPromo();
			case CampaignPackage.MARKETING_CAMPAIGN_ROLE: return (EObject)createMarketingCampaignRole();
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
	public MarketingCampaign createMarketingCampaign() {
		MarketingCampaignImpl marketingCampaign = new MarketingCampaignImpl();
		return marketingCampaign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarketingCampaignNote createMarketingCampaignNote() {
		MarketingCampaignNoteImpl marketingCampaignNote = new MarketingCampaignNoteImpl();
		return marketingCampaignNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarketingCampaignPrice createMarketingCampaignPrice() {
		MarketingCampaignPriceImpl marketingCampaignPrice = new MarketingCampaignPriceImpl();
		return marketingCampaignPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarketingCampaignPromo createMarketingCampaignPromo() {
		MarketingCampaignPromoImpl marketingCampaignPromo = new MarketingCampaignPromoImpl();
		return marketingCampaignPromo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarketingCampaignRole createMarketingCampaignRole() {
		MarketingCampaignRoleImpl marketingCampaignRole = new MarketingCampaignRoleImpl();
		return marketingCampaignRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CampaignPackage getCampaignPackage() {
		return (CampaignPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CampaignPackage getPackage() {
		return CampaignPackage.eINSTANCE;
	}

} //CampaignFactoryImpl
