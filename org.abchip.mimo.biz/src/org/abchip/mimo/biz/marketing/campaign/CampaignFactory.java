/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.campaign;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage
 * @generated
 */
public interface CampaignFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CampaignFactory eINSTANCE = org.abchip.mimo.biz.marketing.campaign.impl.CampaignFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Marketing Campaign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marketing Campaign</em>'.
	 * @generated
	 */
	MarketingCampaign createMarketingCampaign();

	/**
	 * Returns a new object of class '<em>Marketing Campaign Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marketing Campaign Note</em>'.
	 * @generated
	 */
	MarketingCampaignNote createMarketingCampaignNote();

	/**
	 * Returns a new object of class '<em>Marketing Campaign Price</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marketing Campaign Price</em>'.
	 * @generated
	 */
	MarketingCampaignPrice createMarketingCampaignPrice();

	/**
	 * Returns a new object of class '<em>Marketing Campaign Promo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marketing Campaign Promo</em>'.
	 * @generated
	 */
	MarketingCampaignPromo createMarketingCampaignPromo();

	/**
	 * Returns a new object of class '<em>Marketing Campaign Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marketing Campaign Role</em>'.
	 * @generated
	 */
	MarketingCampaignRole createMarketingCampaignRole();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CampaignPackage getCampaignPackage();

} //CampaignFactory
