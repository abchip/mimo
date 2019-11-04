/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.campaign;

import org.abchip.mimo.biz.BizEntityNote;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marketing Campaign Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignNote#getMarketingCampaignId <em>Marketing Campaign Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaignNote()
 * @model
 * @generated
 */
public interface MarketingCampaignNote extends BizEntityNote {
	/**
	 * Returns the value of the '<em><b>Marketing Campaign Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marketing Campaign Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marketing Campaign Id</em>' attribute.
	 * @see #setMarketingCampaignId(String)
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaignNote_MarketingCampaignId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getMarketingCampaignId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignNote#getMarketingCampaignId <em>Marketing Campaign Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marketing Campaign Id</em>' attribute.
	 * @see #getMarketingCampaignId()
	 * @generated
	 */
	void setMarketingCampaignId(String value);

} // MarketingCampaignNote
