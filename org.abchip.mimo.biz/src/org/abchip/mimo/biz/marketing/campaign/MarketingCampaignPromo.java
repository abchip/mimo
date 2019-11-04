/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.campaign;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.product.promo.ProductPromo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marketing Campaign Promo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPromo#getMarketingCampaignId <em>Marketing Campaign Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPromo#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPromo#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPromo#getProductPromoId <em>Product Promo Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaignPromo()
 * @model
 * @generated
 */
public interface MarketingCampaignPromo extends BizEntity {
	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaignPromo_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPromo#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

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
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaignPromo_MarketingCampaignId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getMarketingCampaignId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPromo#getMarketingCampaignId <em>Marketing Campaign Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marketing Campaign Id</em>' attribute.
	 * @see #getMarketingCampaignId()
	 * @generated
	 */
	void setMarketingCampaignId(String value);

	/**
	 * Returns the value of the '<em><b>Product Promo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Promo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Id</em>' reference.
	 * @see #setProductPromoId(ProductPromo)
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaignPromo_ProductPromoId()
	 * @model keys="productPromoId"
	 * @generated
	 */
	ProductPromo getProductPromoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPromo#getProductPromoId <em>Product Promo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Id</em>' reference.
	 * @see #getProductPromoId()
	 * @generated
	 */
	void setProductPromoId(ProductPromo value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaignPromo_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPromo#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // MarketingCampaignPromo
