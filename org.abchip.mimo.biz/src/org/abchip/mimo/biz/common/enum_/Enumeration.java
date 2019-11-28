/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.enum_;

import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans;
import org.abchip.mimo.biz.accounting.finaccount.FinAccountType;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference;
import org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse;
import org.abchip.mimo.biz.common.email.EmailTemplateSetting;
import org.abchip.mimo.biz.common.geo.GeoPoint;
import org.abchip.mimo.biz.common.keyword.KeywordThesaurus;
import org.abchip.mimo.biz.content.content.Content;
import org.abchip.mimo.biz.humanres.recruitment.JobInterview;
import org.abchip.mimo.biz.humanres.recruitment.JobRequisition;
import org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.order.order.OrderItemChange;
import org.abchip.mimo.biz.order.order.OrderNotification;
import org.abchip.mimo.biz.order.quote.Quote;
import org.abchip.mimo.biz.order.request.CustRequest;
import org.abchip.mimo.biz.party.communication.CommunicationEvent;
import org.abchip.mimo.biz.party.party.Person;
import org.abchip.mimo.biz.product.facility.FacilityLocation;
import org.abchip.mimo.biz.product.facility.ProductFacility;
import org.abchip.mimo.biz.product.inventory.InventoryItemDetail;
import org.abchip.mimo.biz.product.price.ProductPriceCond;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.product.product.ProductGeo;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.abchip.mimo.biz.product.store.ProductStoreEmailSetting;
import org.abchip.mimo.biz.product.store.ProductStoreFinActSetting;
import org.abchip.mimo.biz.security.login.UserLoginSecurityQuestion;
import org.abchip.mimo.biz.service.schedule.JobManagerLock;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.enum_.Enumeration#getEnumId <em>Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.enum_.Enumeration#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.enum_.Enumeration#getEnumCode <em>Enum Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.enum_.Enumeration#getEnumTypeId <em>Enum Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.enum_.Enumeration#getSequenceId <em>Sequence Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.enum_.Enumeration#getUserLoginSecurityQuestions <em>User Login Security Questions</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.enum_.EnumPackage#getEnumeration()
 * @model annotation="mimo-ent-frame dictionary='CommonEntityLabels' formula='description'"
 * @generated
 */
public interface Enumeration extends BizEntityTyped<EnumerationType> {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.common.enum_.EnumPackage#getEnumeration_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Enum Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Code</em>' attribute.
	 * @see #setEnumCode(String)
	 * @see org.abchip.mimo.biz.common.enum_.EnumPackage#getEnumeration_EnumCode()
	 * @model annotation="mimo-ent-format type='short-varchar' length='60'"
	 * @generated
	 */
	String getEnumCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#getEnumCode <em>Enum Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Code</em>' attribute.
	 * @see #getEnumCode()
	 * @generated
	 */
	void setEnumCode(String value);

	/**
	 * Returns the value of the '<em><b>Sequence Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Id</em>' attribute.
	 * @see #setSequenceId(String)
	 * @see org.abchip.mimo.biz.common.enum_.EnumPackage#getEnumeration_SequenceId()
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 * @generated
	 */
	String getSequenceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#getSequenceId <em>Sequence Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Id</em>' attribute.
	 * @see #getSequenceId()
	 * @generated
	 */
	void setSequenceId(String value);

	/**
	 * Returns the value of the '<em><b>User Login Security Questions</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.security.login.UserLoginSecurityQuestion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Login Security Questions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Login Security Questions</em>' reference list.
	 * @see org.abchip.mimo.biz.common.enum_.EnumPackage#getEnumeration_UserLoginSecurityQuestions()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='UserLoginSecurityQuestion'"
	 * @generated
	 */
	List<UserLoginSecurityQuestion> getUserLoginSecurityQuestions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FixedAsset' route='classEnumId'"
	 * @generated
	 */
	List<FixedAsset> classFixedAssets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PartyAcctgPreference' route='cogsMethodId'"
	 * @generated
	 */
	List<PartyAcctgPreference> cogsPartyAcctgPreferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CommunicationEvent' route='reasonEnumId'"
	 * @generated
	 */
	List<CommunicationEvent> communicationEvents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductStore' route='defaultSalesChannelEnumId'"
	 * @generated
	 */
	List<ProductStore> defaultSalesChannelProductStores();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='EmailTemplateSetting' route='emailType'"
	 * @generated
	 */
	List<EmailTemplateSetting> emailTemplateSettings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Person' route='employmentStatusEnumId'"
	 * @generated
	 */
	List<Person> employmentStatusPersons();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='JobRequisition' route='examTypeEnumId'"
	 * @generated
	 */
	List<JobRequisition> examTypeJobRequisitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='GeoPoint' route='geoPointTypeEnumId'"
	 * @generated
	 */
	List<GeoPoint> geoPointTypeGeoPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='GiftCardFulfillment' route='typeEnumId'"
	 * @generated
	 */
	List<GiftCardFulfillment> giftCardFulfillments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductPriceCond' route='inputParamEnumId'"
	 * @generated
	 */
	List<ProductPriceCond> inputParamProductPriceConds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PartyAcctgPreference' route='oldInvoiceSequenceEnumId'"
	 * @generated
	 */
	List<PartyAcctgPreference> invoiceSequencePartyAcctgPreferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='JobInterview' route='gradeSecuredEnumId'"
	 * @generated
	 */
	List<JobInterview> jobInterviews();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='JobRequisition' route='jobPostingTypeEnumId'"
	 * @generated
	 */
	List<JobRequisition> jobPostingTypeJobRequisitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductPriceCond' route='operatorEnumId'"
	 * @generated
	 */
	List<ProductPriceCond> operatorProductPriceConds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderItemChange' route='changeTypeEnumId'"
	 * @generated
	 */
	List<OrderItemChange> orderItemChanges();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderNotification' route='emailType'"
	 * @generated
	 */
	List<OrderNotification> orderNotifications();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PartyAcctgPreference' route='oldOrderSequenceEnumId'"
	 * @generated
	 */
	List<PartyAcctgPreference> orderSequencePartyAcctgPreferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Content' route='privilegeEnumId'"
	 * @generated
	 */
	List<Content> privilegeContents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductGeo' route='productGeoEnumId'"
	 * @generated
	 */
	List<ProductGeo> productGeos();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductStoreEmailSetting' route='emailType'"
	 * @generated
	 */
	List<ProductStoreEmailSetting> productStoreEmailSettings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PartyAcctgPreference' route='oldQuoteSequenceEnumId'"
	 * @generated
	 */
	List<PartyAcctgPreference> quoteSequencePartyAcctgPreferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Product' route='ratingTypeEnum'"
	 * @generated
	 */
	List<Product> ratingProducts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FinAccountTrans' route='reasonEnumId'"
	 * @generated
	 */
	List<FinAccountTrans> reasonFinAccountTranss();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InventoryItemDetail' route='reasonEnumId'"
	 * @generated
	 */
	List<InventoryItemDetail> reasonInventoryItemDetails();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='JobManagerLock' route='reasonEnumId'"
	 * @generated
	 */
	List<JobManagerLock> reasonJobManagerLocks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderItemChange' route='reasonEnumId'"
	 * @generated
	 */
	List<OrderItemChange> reasonOrderItemChanges();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='KeywordThesaurus' route='relationshipEnumId'"
	 * @generated
	 */
	List<KeywordThesaurus> relationshipKeywordThesauruss();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FinAccountType' route='replenishEnumId'"
	 * @generated
	 */
	List<FinAccountType> replenishFinAccountTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductStoreFinActSetting' route='replenishMethodEnumId'"
	 * @generated
	 */
	List<ProductStoreFinActSetting> replenishMethodProductStoreFinActSettings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductFacility' route='requirementMethodEnumId'"
	 * @generated
	 */
	List<ProductFacility> requirementMethodProductFacilities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductStore' route='requirementMethodEnumId'"
	 * @generated
	 */
	List<ProductStore> requirementMethodProductStores();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Product' route='requirementMethodEnumId'"
	 * @generated
	 */
	List<Product> requirementMethodProducts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductStore' route='reserveOrderEnumId'"
	 * @generated
	 */
	List<ProductStore> reserveOrderProductStores();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Person' route='residenceStatusEnumId'"
	 * @generated
	 */
	List<Person> residenceStatusPersons();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CustRequest' route='salesChannelEnumId'"
	 * @generated
	 */
	List<CustRequest> salesChannelCustRequests();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderHeader' route='salesChannelEnumId'"
	 * @generated
	 */
	List<OrderHeader> salesChannelOrderHeaders();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Quote' route='salesChannelEnumId'"
	 * @generated
	 */
	List<Quote> salesChannelQuotes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='WorkEffort' route='scopeEnumId'"
	 * @generated
	 */
	List<WorkEffort> scopeWorkEfforts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PaymentGatewayResponse' route='paymentServiceTypeEnumId'"
	 * @generated
	 */
	List<PaymentGatewayResponse> serviceTypePaymentGatewayResponses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductStore' route='storeCreditAccountEnumId'"
	 * @generated
	 */
	List<ProductStore> storeCreditAccountProductStores();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PartyAcctgPreference' route='taxFormId'"
	 * @generated
	 */
	List<PartyAcctgPreference> taxFormPartyAcctgPreferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PaymentGatewayResponse' route='transCodeEnumId'"
	 * @generated
	 */
	List<PaymentGatewayResponse> tranCodePaymentGatewayResponses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FacilityLocation' route='locationTypeEnumId'"
	 * @generated
	 */
	List<FacilityLocation> typeFacilityLocations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SalesOpportunity' route='typeEnumId'"
	 * @generated
	 */
	List<SalesOpportunity> typeSalesOpportunities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Product' route='virtualVariantMethodEnum'"
	 * @generated
	 */
	List<Product> virtualVariantMethodProducts();

	/**
	 * Returns the value of the '<em><b>Enum Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Type Id</em>' reference.
	 * @see #setEnumTypeId(EnumerationType)
	 * @see org.abchip.mimo.biz.common.enum_.EnumPackage#getEnumeration_EnumTypeId()
	 * @model keys="enumTypeId"
	 * @generated
	 */
	EnumerationType getEnumTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#getEnumTypeId <em>Enum Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Type Id</em>' reference.
	 * @see #getEnumTypeId()
	 * @generated
	 */
	void setEnumTypeId(EnumerationType value);

	/**
	 * Returns the value of the '<em><b>Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Id</em>' attribute.
	 * @see #setEnumId(String)
	 * @see org.abchip.mimo.biz.common.enum_.EnumPackage#getEnumeration_EnumId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 * @generated
	 */
	String getEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#getEnumId <em>Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Id</em>' attribute.
	 * @see #getEnumId()
	 * @generated
	 */
	void setEnumId(String value);

} // Enumeration
