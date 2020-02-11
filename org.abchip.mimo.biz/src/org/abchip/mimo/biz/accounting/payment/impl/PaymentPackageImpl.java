/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.MimoPackage;
import org.abchip.mimo.biz.BizPackage;
import org.abchip.mimo.biz.accounting.AccountingPackage;
import org.abchip.mimo.biz.accounting.budget.BudgetPackage;
import org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl;
import org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage;
import org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountPackageImpl;
import org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage;
import org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl;
import org.abchip.mimo.biz.accounting.impl.AccountingPackageImpl;
import org.abchip.mimo.biz.accounting.invoice.InvoicePackage;
import org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl;
import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl;
import org.abchip.mimo.biz.accounting.payment.BillingAccount;
import org.abchip.mimo.biz.accounting.payment.BillingAccountRole;
import org.abchip.mimo.biz.accounting.payment.BillingAccountTerm;
import org.abchip.mimo.biz.accounting.payment.BillingAccountTermAttr;
import org.abchip.mimo.biz.accounting.payment.CheckAccount;
import org.abchip.mimo.biz.accounting.payment.CreditCard;
import org.abchip.mimo.biz.accounting.payment.CreditCardTypeGlAccount;
import org.abchip.mimo.biz.accounting.payment.Deduction;
import org.abchip.mimo.biz.accounting.payment.DeductionType;
import org.abchip.mimo.biz.accounting.payment.EftAccount;
import org.abchip.mimo.biz.accounting.payment.GiftCard;
import org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment;
import org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod;
import org.abchip.mimo.biz.accounting.payment.Payment;
import org.abchip.mimo.biz.accounting.payment.PaymentApplication;
import org.abchip.mimo.biz.accounting.payment.PaymentAttribute;
import org.abchip.mimo.biz.accounting.payment.PaymentBudgetAllocation;
import org.abchip.mimo.biz.accounting.payment.PaymentContent;
import org.abchip.mimo.biz.accounting.payment.PaymentContentType;
import org.abchip.mimo.biz.accounting.payment.PaymentFactory;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewayClearCommerce;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfig;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfigType;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewayEway;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewayRespMsg;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay;
import org.abchip.mimo.biz.accounting.payment.PaymentGlAccountTypeMap;
import org.abchip.mimo.biz.accounting.payment.PaymentGroup;
import org.abchip.mimo.biz.accounting.payment.PaymentGroupMember;
import org.abchip.mimo.biz.accounting.payment.PaymentGroupType;
import org.abchip.mimo.biz.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.accounting.payment.PaymentMethodTypeGlAccount;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.accounting.payment.PaymentType;
import org.abchip.mimo.biz.accounting.payment.PaymentTypeAttr;
import org.abchip.mimo.biz.accounting.payment.ValueLinkKey;
import org.abchip.mimo.biz.accounting.rate.RatePackage;
import org.abchip.mimo.biz.accounting.rate.impl.RatePackageImpl;
import org.abchip.mimo.biz.accounting.tax.TaxPackage;
import org.abchip.mimo.biz.accounting.tax.impl.TaxPackageImpl;
import org.abchip.mimo.biz.catalina.session.SessionPackage;
import org.abchip.mimo.biz.catalina.session.impl.SessionPackageImpl;
import org.abchip.mimo.biz.common.CommonPackage;
import org.abchip.mimo.biz.common.datasource.DatasourcePackage;
import org.abchip.mimo.biz.common.datasource.impl.DatasourcePackageImpl;
import org.abchip.mimo.biz.common.email.EmailPackage;
import org.abchip.mimo.biz.common.email.impl.EmailPackageImpl;
import org.abchip.mimo.biz.common.enum_.EnumPackage;
import org.abchip.mimo.biz.common.enum_.impl.EnumPackageImpl;
import org.abchip.mimo.biz.common.geo.GeoPackage;
import org.abchip.mimo.biz.common.geo.impl.GeoPackageImpl;
import org.abchip.mimo.biz.common.impl.CommonPackageImpl;
import org.abchip.mimo.biz.common.keyword.KeywordPackage;
import org.abchip.mimo.biz.common.keyword.impl.KeywordPackageImpl;
import org.abchip.mimo.biz.common.language.LanguagePackage;
import org.abchip.mimo.biz.common.language.impl.LanguagePackageImpl;
import org.abchip.mimo.biz.common.method.MethodPackage;
import org.abchip.mimo.biz.common.method.impl.MethodPackageImpl;
import org.abchip.mimo.biz.common.note.NotePackage;
import org.abchip.mimo.biz.common.note.impl.NotePackageImpl;
import org.abchip.mimo.biz.common.period.PeriodPackage;
import org.abchip.mimo.biz.common.period.impl.PeriodPackageImpl;
import org.abchip.mimo.biz.common.portal.PortalPackage;
import org.abchip.mimo.biz.common.portal.impl.PortalPackageImpl;
import org.abchip.mimo.biz.common.property.PropertyPackage;
import org.abchip.mimo.biz.common.property.impl.PropertyPackageImpl;
import org.abchip.mimo.biz.common.screen.ScreenPackage;
import org.abchip.mimo.biz.common.screen.impl.ScreenPackageImpl;
import org.abchip.mimo.biz.common.status.StatusPackage;
import org.abchip.mimo.biz.common.status.impl.StatusPackageImpl;
import org.abchip.mimo.biz.common.theme.ThemePackage;
import org.abchip.mimo.biz.common.theme.impl.ThemePackageImpl;
import org.abchip.mimo.biz.common.uom.UomPackage;
import org.abchip.mimo.biz.common.uom.impl.UomPackageImpl;
import org.abchip.mimo.biz.common.user.UserPackage;
import org.abchip.mimo.biz.common.user.impl.UserPackageImpl;
import org.abchip.mimo.biz.content.content.ContentPackage;
import org.abchip.mimo.biz.content.content.impl.ContentPackageImpl;
import org.abchip.mimo.biz.content.data.DataPackage;
import org.abchip.mimo.biz.content.data.impl.DataPackageImpl;
import org.abchip.mimo.biz.content.document.DocumentPackage;
import org.abchip.mimo.biz.content.document.impl.DocumentPackageImpl;
import org.abchip.mimo.biz.content.preference.PreferencePackage;
import org.abchip.mimo.biz.content.preference.impl.PreferencePackageImpl;
import org.abchip.mimo.biz.content.survey.SurveyPackage;
import org.abchip.mimo.biz.content.survey.impl.SurveyPackageImpl;
import org.abchip.mimo.biz.content.website.WebsitePackage;
import org.abchip.mimo.biz.content.website.impl.WebsitePackageImpl;
import org.abchip.mimo.biz.entity.EntityPackage;
import org.abchip.mimo.biz.entity.audit.AuditPackage;
import org.abchip.mimo.biz.entity.audit.impl.AuditPackageImpl;
import org.abchip.mimo.biz.entity.crypto.CryptoPackage;
import org.abchip.mimo.biz.entity.crypto.impl.CryptoPackageImpl;
import org.abchip.mimo.biz.entity.group.GroupPackage;
import org.abchip.mimo.biz.entity.group.impl.GroupPackageImpl;
import org.abchip.mimo.biz.entity.impl.EntityPackageImpl;
import org.abchip.mimo.biz.entity.sequence.SequencePackage;
import org.abchip.mimo.biz.entity.sequence.impl.SequencePackageImpl;
import org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage;
import org.abchip.mimo.biz.entity.synchronization.impl.SynchronizationPackageImpl;
import org.abchip.mimo.biz.entity.tenant.TenantPackage;
import org.abchip.mimo.biz.entity.tenant.impl.TenantPackageImpl;
import org.abchip.mimo.biz.entity.test.TestPackage;
import org.abchip.mimo.biz.entity.test.impl.TestPackageImpl;
import org.abchip.mimo.biz.humanres.ability.AbilityPackage;
import org.abchip.mimo.biz.humanres.ability.impl.AbilityPackageImpl;
import org.abchip.mimo.biz.humanres.employment.EmploymentPackage;
import org.abchip.mimo.biz.humanres.employment.impl.EmploymentPackageImpl;
import org.abchip.mimo.biz.humanres.position.PositionPackage;
import org.abchip.mimo.biz.humanres.position.impl.PositionPackageImpl;
import org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage;
import org.abchip.mimo.biz.humanres.recruitment.impl.RecruitmentPackageImpl;
import org.abchip.mimo.biz.humanres.trainings.TrainingsPackage;
import org.abchip.mimo.biz.humanres.trainings.impl.TrainingsPackageImpl;
import org.abchip.mimo.biz.impl.BizPackageImpl;
import org.abchip.mimo.biz.manufacturing.bom.BomPackage;
import org.abchip.mimo.biz.manufacturing.bom.impl.BomPackageImpl;
import org.abchip.mimo.biz.manufacturing.mrp.MrpPackage;
import org.abchip.mimo.biz.manufacturing.mrp.impl.MrpPackageImpl;
import org.abchip.mimo.biz.manufacturing.techdata.TechdataPackage;
import org.abchip.mimo.biz.manufacturing.techdata.impl.TechdataPackageImpl;
import org.abchip.mimo.biz.marketing.campaign.CampaignPackage;
import org.abchip.mimo.biz.marketing.campaign.impl.CampaignPackageImpl;
import org.abchip.mimo.biz.marketing.contact.ContactPackage;
import org.abchip.mimo.biz.marketing.contact.impl.ContactPackageImpl;
import org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage;
import org.abchip.mimo.biz.marketing.opportunity.impl.OpportunityPackageImpl;
import org.abchip.mimo.biz.marketing.segment.SegmentPackage;
import org.abchip.mimo.biz.marketing.segment.impl.SegmentPackageImpl;
import org.abchip.mimo.biz.marketing.tracking.TrackingPackage;
import org.abchip.mimo.biz.marketing.tracking.impl.TrackingPackageImpl;
import org.abchip.mimo.biz.order.order.OrderPackage;
import org.abchip.mimo.biz.order.order.impl.OrderPackageImpl;
import org.abchip.mimo.biz.order.quote.QuotePackage;
import org.abchip.mimo.biz.order.quote.impl.QuotePackageImpl;
import org.abchip.mimo.biz.order.request.RequestPackage;
import org.abchip.mimo.biz.order.request.impl.RequestPackageImpl;
import org.abchip.mimo.biz.order.requirement.RequirementPackage;
import org.abchip.mimo.biz.order.requirement.impl.RequirementPackageImpl;
import org.abchip.mimo.biz.order.reservations.ReservationsPackage;
import org.abchip.mimo.biz.order.reservations.impl.ReservationsPackageImpl;
import org.abchip.mimo.biz.order.return_.ReturnPackage;
import org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl;
import org.abchip.mimo.biz.order.shoppingcart.ShoppingcartPackage;
import org.abchip.mimo.biz.order.shoppingcart.impl.ShoppingcartPackageImpl;
import org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage;
import org.abchip.mimo.biz.order.shoppinglist.impl.ShoppinglistPackageImpl;
import org.abchip.mimo.biz.party.agreement.AgreementPackage;
import org.abchip.mimo.biz.party.agreement.impl.AgreementPackageImpl;
import org.abchip.mimo.biz.party.communication.CommunicationPackage;
import org.abchip.mimo.biz.party.communication.impl.CommunicationPackageImpl;
import org.abchip.mimo.biz.party.need.NeedPackage;
import org.abchip.mimo.biz.party.need.impl.NeedPackageImpl;
import org.abchip.mimo.biz.party.party.PartyPackage;
import org.abchip.mimo.biz.party.party.impl.PartyPackageImpl;
import org.abchip.mimo.biz.passport.PassportPackage;
import org.abchip.mimo.biz.passport.impl.PassportPackageImpl;
import org.abchip.mimo.biz.product.catalog.CatalogPackage;
import org.abchip.mimo.biz.product.catalog.impl.CatalogPackageImpl;
import org.abchip.mimo.biz.product.category.CategoryPackage;
import org.abchip.mimo.biz.product.category.impl.CategoryPackageImpl;
import org.abchip.mimo.biz.product.config.ConfigPackage;
import org.abchip.mimo.biz.product.config.impl.ConfigPackageImpl;
import org.abchip.mimo.biz.product.cost.CostPackage;
import org.abchip.mimo.biz.product.cost.impl.CostPackageImpl;
import org.abchip.mimo.biz.product.facility.FacilityPackage;
import org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl;
import org.abchip.mimo.biz.product.feature.FeaturePackage;
import org.abchip.mimo.biz.product.feature.impl.FeaturePackageImpl;
import org.abchip.mimo.biz.product.inventory.InventoryPackage;
import org.abchip.mimo.biz.product.inventory.impl.InventoryPackageImpl;
import org.abchip.mimo.biz.product.price.PricePackage;
import org.abchip.mimo.biz.product.price.impl.PricePackageImpl;
import org.abchip.mimo.biz.product.product.ProductPackage;
import org.abchip.mimo.biz.product.product.impl.ProductPackageImpl;
import org.abchip.mimo.biz.product.promo.PromoPackage;
import org.abchip.mimo.biz.product.promo.impl.PromoPackageImpl;
import org.abchip.mimo.biz.product.store.StorePackage;
import org.abchip.mimo.biz.product.store.impl.StorePackageImpl;
import org.abchip.mimo.biz.product.subscription.SubscriptionPackage;
import org.abchip.mimo.biz.product.subscription.impl.SubscriptionPackageImpl;
import org.abchip.mimo.biz.product.supplier.SupplierPackage;
import org.abchip.mimo.biz.product.supplier.impl.SupplierPackageImpl;
import org.abchip.mimo.biz.security.cert.CertPackage;
import org.abchip.mimo.biz.security.cert.impl.CertPackageImpl;
import org.abchip.mimo.biz.security.login.LoginPackage;
import org.abchip.mimo.biz.security.login.impl.LoginPackageImpl;
import org.abchip.mimo.biz.security.securitygroup.SecuritygroupPackage;
import org.abchip.mimo.biz.security.securitygroup.impl.SecuritygroupPackageImpl;
import org.abchip.mimo.biz.service.schedule.SchedulePackage;
import org.abchip.mimo.biz.service.schedule.impl.SchedulePackageImpl;
import org.abchip.mimo.biz.service.semaphore.SemaphorePackage;
import org.abchip.mimo.biz.service.semaphore.impl.SemaphorePackageImpl;
import org.abchip.mimo.biz.shipment.issuance.IssuancePackage;
import org.abchip.mimo.biz.shipment.issuance.impl.IssuancePackageImpl;
import org.abchip.mimo.biz.shipment.picklist.PicklistPackage;
import org.abchip.mimo.biz.shipment.picklist.impl.PicklistPackageImpl;
import org.abchip.mimo.biz.shipment.receipt.ReceiptPackage;
import org.abchip.mimo.biz.shipment.receipt.impl.ReceiptPackageImpl;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl;
import org.abchip.mimo.biz.webapp.visit.VisitPackage;
import org.abchip.mimo.biz.webapp.visit.impl.VisitPackageImpl;
import org.abchip.mimo.biz.workeffort.timesheet.TimesheetPackage;
import org.abchip.mimo.biz.workeffort.timesheet.impl.TimesheetPackageImpl;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
import org.abchip.mimo.biz.workeffort.workeffort.impl.WorkeffortPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PaymentPackageImpl extends EPackageImpl implements PaymentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billingAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billingAccountRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billingAccountTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billingAccountTermAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creditCardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creditCardTypeGlAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deductionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eftAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass giftCardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass giftCardFulfillmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass payPalPaymentMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentBudgetAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentContentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentGatewayAuthorizeNetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentGatewayClearCommerceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentGatewayConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentGatewayConfigTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentGatewayCyberSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentGatewayEwayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentGatewayOrbitalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentGatewayPayPalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentGatewayPayflowProEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentGatewayRespMsgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentGatewayResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentGatewaySagePayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentGatewaySecurePayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentGatewayWorldPayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentGlAccountTypeMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentGroupMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentGroupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentMethodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentMethodTypeGlAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentTypeAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueLinkKeyEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PaymentPackageImpl() {
		super(eNS_URI, PaymentFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PaymentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PaymentPackage init() {
		if (isInited) return (PaymentPackage)EPackage.Registry.INSTANCE.getEPackage(PaymentPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPaymentPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PaymentPackageImpl thePaymentPackage = registeredPaymentPackage instanceof PaymentPackageImpl ? (PaymentPackageImpl)registeredPaymentPackage : new PaymentPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		MimoPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BizPackage.eNS_URI);
		BizPackageImpl theBizPackage = (BizPackageImpl)(registeredPackage instanceof BizPackageImpl ? registeredPackage : BizPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI);
		AccountingPackageImpl theAccountingPackage = (AccountingPackageImpl)(registeredPackage instanceof AccountingPackageImpl ? registeredPackage : AccountingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BudgetPackage.eNS_URI);
		BudgetPackageImpl theBudgetPackage = (BudgetPackageImpl)(registeredPackage instanceof BudgetPackageImpl ? registeredPackage : BudgetPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FinaccountPackage.eNS_URI);
		FinaccountPackageImpl theFinaccountPackage = (FinaccountPackageImpl)(registeredPackage instanceof FinaccountPackageImpl ? registeredPackage : FinaccountPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FixedassetPackage.eNS_URI);
		FixedassetPackageImpl theFixedassetPackage = (FixedassetPackageImpl)(registeredPackage instanceof FixedassetPackageImpl ? registeredPackage : FixedassetPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InvoicePackage.eNS_URI);
		InvoicePackageImpl theInvoicePackage = (InvoicePackageImpl)(registeredPackage instanceof InvoicePackageImpl ? registeredPackage : InvoicePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LedgerPackage.eNS_URI);
		LedgerPackageImpl theLedgerPackage = (LedgerPackageImpl)(registeredPackage instanceof LedgerPackageImpl ? registeredPackage : LedgerPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RatePackage.eNS_URI);
		RatePackageImpl theRatePackage = (RatePackageImpl)(registeredPackage instanceof RatePackageImpl ? registeredPackage : RatePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TaxPackage.eNS_URI);
		TaxPackageImpl theTaxPackage = (TaxPackageImpl)(registeredPackage instanceof TaxPackageImpl ? registeredPackage : TaxPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SessionPackage.eNS_URI);
		SessionPackageImpl theSessionPackage = (SessionPackageImpl)(registeredPackage instanceof SessionPackageImpl ? registeredPackage : SessionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(registeredPackage instanceof CommonPackageImpl ? registeredPackage : CommonPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DatasourcePackage.eNS_URI);
		DatasourcePackageImpl theDatasourcePackage = (DatasourcePackageImpl)(registeredPackage instanceof DatasourcePackageImpl ? registeredPackage : DatasourcePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EmailPackage.eNS_URI);
		EmailPackageImpl theEmailPackage = (EmailPackageImpl)(registeredPackage instanceof EmailPackageImpl ? registeredPackage : EmailPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EnumPackage.eNS_URI);
		EnumPackageImpl theEnumPackage = (EnumPackageImpl)(registeredPackage instanceof EnumPackageImpl ? registeredPackage : EnumPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GeoPackage.eNS_URI);
		GeoPackageImpl theGeoPackage = (GeoPackageImpl)(registeredPackage instanceof GeoPackageImpl ? registeredPackage : GeoPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KeywordPackage.eNS_URI);
		KeywordPackageImpl theKeywordPackage = (KeywordPackageImpl)(registeredPackage instanceof KeywordPackageImpl ? registeredPackage : KeywordPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI);
		LanguagePackageImpl theLanguagePackage = (LanguagePackageImpl)(registeredPackage instanceof LanguagePackageImpl ? registeredPackage : LanguagePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MethodPackage.eNS_URI);
		MethodPackageImpl theMethodPackage = (MethodPackageImpl)(registeredPackage instanceof MethodPackageImpl ? registeredPackage : MethodPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NotePackage.eNS_URI);
		NotePackageImpl theNotePackage = (NotePackageImpl)(registeredPackage instanceof NotePackageImpl ? registeredPackage : NotePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PeriodPackage.eNS_URI);
		PeriodPackageImpl thePeriodPackage = (PeriodPackageImpl)(registeredPackage instanceof PeriodPackageImpl ? registeredPackage : PeriodPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PortalPackage.eNS_URI);
		PortalPackageImpl thePortalPackage = (PortalPackageImpl)(registeredPackage instanceof PortalPackageImpl ? registeredPackage : PortalPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PropertyPackage.eNS_URI);
		PropertyPackageImpl thePropertyPackage = (PropertyPackageImpl)(registeredPackage instanceof PropertyPackageImpl ? registeredPackage : PropertyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ScreenPackage.eNS_URI);
		ScreenPackageImpl theScreenPackage = (ScreenPackageImpl)(registeredPackage instanceof ScreenPackageImpl ? registeredPackage : ScreenPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StatusPackage.eNS_URI);
		StatusPackageImpl theStatusPackage = (StatusPackageImpl)(registeredPackage instanceof StatusPackageImpl ? registeredPackage : StatusPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ThemePackage.eNS_URI);
		ThemePackageImpl theThemePackage = (ThemePackageImpl)(registeredPackage instanceof ThemePackageImpl ? registeredPackage : ThemePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UomPackage.eNS_URI);
		UomPackageImpl theUomPackage = (UomPackageImpl)(registeredPackage instanceof UomPackageImpl ? registeredPackage : UomPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UserPackage.eNS_URI);
		UserPackageImpl theUserPackage = (UserPackageImpl)(registeredPackage instanceof UserPackageImpl ? registeredPackage : UserPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);
		ContentPackageImpl theContentPackage = (ContentPackageImpl)(registeredPackage instanceof ContentPackageImpl ? registeredPackage : ContentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		DataPackageImpl theDataPackage = (DataPackageImpl)(registeredPackage instanceof DataPackageImpl ? registeredPackage : DataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DocumentPackage.eNS_URI);
		DocumentPackageImpl theDocumentPackage = (DocumentPackageImpl)(registeredPackage instanceof DocumentPackageImpl ? registeredPackage : DocumentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PreferencePackage.eNS_URI);
		PreferencePackageImpl thePreferencePackage = (PreferencePackageImpl)(registeredPackage instanceof PreferencePackageImpl ? registeredPackage : PreferencePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SurveyPackage.eNS_URI);
		SurveyPackageImpl theSurveyPackage = (SurveyPackageImpl)(registeredPackage instanceof SurveyPackageImpl ? registeredPackage : SurveyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(WebsitePackage.eNS_URI);
		WebsitePackageImpl theWebsitePackage = (WebsitePackageImpl)(registeredPackage instanceof WebsitePackageImpl ? registeredPackage : WebsitePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		EntityPackageImpl theEntityPackage = (EntityPackageImpl)(registeredPackage instanceof EntityPackageImpl ? registeredPackage : EntityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AuditPackage.eNS_URI);
		AuditPackageImpl theAuditPackage = (AuditPackageImpl)(registeredPackage instanceof AuditPackageImpl ? registeredPackage : AuditPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CryptoPackage.eNS_URI);
		CryptoPackageImpl theCryptoPackage = (CryptoPackageImpl)(registeredPackage instanceof CryptoPackageImpl ? registeredPackage : CryptoPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GroupPackage.eNS_URI);
		GroupPackageImpl theGroupPackage = (GroupPackageImpl)(registeredPackage instanceof GroupPackageImpl ? registeredPackage : GroupPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SequencePackage.eNS_URI);
		SequencePackageImpl theSequencePackage = (SequencePackageImpl)(registeredPackage instanceof SequencePackageImpl ? registeredPackage : SequencePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SynchronizationPackage.eNS_URI);
		SynchronizationPackageImpl theSynchronizationPackage = (SynchronizationPackageImpl)(registeredPackage instanceof SynchronizationPackageImpl ? registeredPackage : SynchronizationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TenantPackage.eNS_URI);
		TenantPackageImpl theTenantPackage = (TenantPackageImpl)(registeredPackage instanceof TenantPackageImpl ? registeredPackage : TenantPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI);
		TestPackageImpl theTestPackage = (TestPackageImpl)(registeredPackage instanceof TestPackageImpl ? registeredPackage : TestPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AbilityPackage.eNS_URI);
		AbilityPackageImpl theAbilityPackage = (AbilityPackageImpl)(registeredPackage instanceof AbilityPackageImpl ? registeredPackage : AbilityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EmploymentPackage.eNS_URI);
		EmploymentPackageImpl theEmploymentPackage = (EmploymentPackageImpl)(registeredPackage instanceof EmploymentPackageImpl ? registeredPackage : EmploymentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PositionPackage.eNS_URI);
		PositionPackageImpl thePositionPackage = (PositionPackageImpl)(registeredPackage instanceof PositionPackageImpl ? registeredPackage : PositionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RecruitmentPackage.eNS_URI);
		RecruitmentPackageImpl theRecruitmentPackage = (RecruitmentPackageImpl)(registeredPackage instanceof RecruitmentPackageImpl ? registeredPackage : RecruitmentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TrainingsPackage.eNS_URI);
		TrainingsPackageImpl theTrainingsPackage = (TrainingsPackageImpl)(registeredPackage instanceof TrainingsPackageImpl ? registeredPackage : TrainingsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BomPackage.eNS_URI);
		BomPackageImpl theBomPackage = (BomPackageImpl)(registeredPackage instanceof BomPackageImpl ? registeredPackage : BomPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MrpPackage.eNS_URI);
		MrpPackageImpl theMrpPackage = (MrpPackageImpl)(registeredPackage instanceof MrpPackageImpl ? registeredPackage : MrpPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TechdataPackage.eNS_URI);
		TechdataPackageImpl theTechdataPackage = (TechdataPackageImpl)(registeredPackage instanceof TechdataPackageImpl ? registeredPackage : TechdataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CampaignPackage.eNS_URI);
		CampaignPackageImpl theCampaignPackage = (CampaignPackageImpl)(registeredPackage instanceof CampaignPackageImpl ? registeredPackage : CampaignPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContactPackage.eNS_URI);
		ContactPackageImpl theContactPackage = (ContactPackageImpl)(registeredPackage instanceof ContactPackageImpl ? registeredPackage : ContactPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OpportunityPackage.eNS_URI);
		OpportunityPackageImpl theOpportunityPackage = (OpportunityPackageImpl)(registeredPackage instanceof OpportunityPackageImpl ? registeredPackage : OpportunityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SegmentPackage.eNS_URI);
		SegmentPackageImpl theSegmentPackage = (SegmentPackageImpl)(registeredPackage instanceof SegmentPackageImpl ? registeredPackage : SegmentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TrackingPackage.eNS_URI);
		TrackingPackageImpl theTrackingPackage = (TrackingPackageImpl)(registeredPackage instanceof TrackingPackageImpl ? registeredPackage : TrackingPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI);
		OrderPackageImpl theOrderPackage = (OrderPackageImpl)(registeredPackage instanceof OrderPackageImpl ? registeredPackage : OrderPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(QuotePackage.eNS_URI);
		QuotePackageImpl theQuotePackage = (QuotePackageImpl)(registeredPackage instanceof QuotePackageImpl ? registeredPackage : QuotePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RequestPackage.eNS_URI);
		RequestPackageImpl theRequestPackage = (RequestPackageImpl)(registeredPackage instanceof RequestPackageImpl ? registeredPackage : RequestPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI);
		RequirementPackageImpl theRequirementPackage = (RequirementPackageImpl)(registeredPackage instanceof RequirementPackageImpl ? registeredPackage : RequirementPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReservationsPackage.eNS_URI);
		ReservationsPackageImpl theReservationsPackage = (ReservationsPackageImpl)(registeredPackage instanceof ReservationsPackageImpl ? registeredPackage : ReservationsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReturnPackage.eNS_URI);
		ReturnPackageImpl theReturnPackage = (ReturnPackageImpl)(registeredPackage instanceof ReturnPackageImpl ? registeredPackage : ReturnPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ShoppingcartPackage.eNS_URI);
		ShoppingcartPackageImpl theShoppingcartPackage = (ShoppingcartPackageImpl)(registeredPackage instanceof ShoppingcartPackageImpl ? registeredPackage : ShoppingcartPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ShoppinglistPackage.eNS_URI);
		ShoppinglistPackageImpl theShoppinglistPackage = (ShoppinglistPackageImpl)(registeredPackage instanceof ShoppinglistPackageImpl ? registeredPackage : ShoppinglistPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.party.PartyPackage.eNS_URI);
		org.abchip.mimo.biz.party.impl.PartyPackageImpl thePartyPackage = (org.abchip.mimo.biz.party.impl.PartyPackageImpl)(registeredPackage instanceof org.abchip.mimo.biz.party.impl.PartyPackageImpl ? registeredPackage : org.abchip.mimo.biz.party.PartyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AgreementPackage.eNS_URI);
		AgreementPackageImpl theAgreementPackage = (AgreementPackageImpl)(registeredPackage instanceof AgreementPackageImpl ? registeredPackage : AgreementPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI);
		CommunicationPackageImpl theCommunicationPackage = (CommunicationPackageImpl)(registeredPackage instanceof CommunicationPackageImpl ? registeredPackage : CommunicationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.party.contact.ContactPackage.eNS_URI);
		org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl theContactPackage_1 = (org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl)(registeredPackage instanceof org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl ? registeredPackage : org.abchip.mimo.biz.party.contact.ContactPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NeedPackage.eNS_URI);
		NeedPackageImpl theNeedPackage = (NeedPackageImpl)(registeredPackage instanceof NeedPackageImpl ? registeredPackage : NeedPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PartyPackage.eNS_URI);
		PartyPackageImpl thePartyPackage_1 = (PartyPackageImpl)(registeredPackage instanceof PartyPackageImpl ? registeredPackage : PartyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PassportPackage.eNS_URI);
		PassportPackageImpl thePassportPackage = (PassportPackageImpl)(registeredPackage instanceof PassportPackageImpl ? registeredPackage : PassportPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CatalogPackage.eNS_URI);
		CatalogPackageImpl theCatalogPackage = (CatalogPackageImpl)(registeredPackage instanceof CatalogPackageImpl ? registeredPackage : CatalogPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CategoryPackage.eNS_URI);
		CategoryPackageImpl theCategoryPackage = (CategoryPackageImpl)(registeredPackage instanceof CategoryPackageImpl ? registeredPackage : CategoryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI);
		ConfigPackageImpl theConfigPackage = (ConfigPackageImpl)(registeredPackage instanceof ConfigPackageImpl ? registeredPackage : ConfigPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CostPackage.eNS_URI);
		CostPackageImpl theCostPackage = (CostPackageImpl)(registeredPackage instanceof CostPackageImpl ? registeredPackage : CostPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FacilityPackage.eNS_URI);
		FacilityPackageImpl theFacilityPackage = (FacilityPackageImpl)(registeredPackage instanceof FacilityPackageImpl ? registeredPackage : FacilityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FeaturePackage.eNS_URI);
		FeaturePackageImpl theFeaturePackage = (FeaturePackageImpl)(registeredPackage instanceof FeaturePackageImpl ? registeredPackage : FeaturePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InventoryPackage.eNS_URI);
		InventoryPackageImpl theInventoryPackage = (InventoryPackageImpl)(registeredPackage instanceof InventoryPackageImpl ? registeredPackage : InventoryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PricePackage.eNS_URI);
		PricePackageImpl thePricePackage = (PricePackageImpl)(registeredPackage instanceof PricePackageImpl ? registeredPackage : PricePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI);
		ProductPackageImpl theProductPackage = (ProductPackageImpl)(registeredPackage instanceof ProductPackageImpl ? registeredPackage : ProductPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PromoPackage.eNS_URI);
		PromoPackageImpl thePromoPackage = (PromoPackageImpl)(registeredPackage instanceof PromoPackageImpl ? registeredPackage : PromoPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StorePackage.eNS_URI);
		StorePackageImpl theStorePackage = (StorePackageImpl)(registeredPackage instanceof StorePackageImpl ? registeredPackage : StorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SubscriptionPackage.eNS_URI);
		SubscriptionPackageImpl theSubscriptionPackage = (SubscriptionPackageImpl)(registeredPackage instanceof SubscriptionPackageImpl ? registeredPackage : SubscriptionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SupplierPackage.eNS_URI);
		SupplierPackageImpl theSupplierPackage = (SupplierPackageImpl)(registeredPackage instanceof SupplierPackageImpl ? registeredPackage : SupplierPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CertPackage.eNS_URI);
		CertPackageImpl theCertPackage = (CertPackageImpl)(registeredPackage instanceof CertPackageImpl ? registeredPackage : CertPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LoginPackage.eNS_URI);
		LoginPackageImpl theLoginPackage = (LoginPackageImpl)(registeredPackage instanceof LoginPackageImpl ? registeredPackage : LoginPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SecuritygroupPackage.eNS_URI);
		SecuritygroupPackageImpl theSecuritygroupPackage = (SecuritygroupPackageImpl)(registeredPackage instanceof SecuritygroupPackageImpl ? registeredPackage : SecuritygroupPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SchedulePackage.eNS_URI);
		SchedulePackageImpl theSchedulePackage = (SchedulePackageImpl)(registeredPackage instanceof SchedulePackageImpl ? registeredPackage : SchedulePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SemaphorePackage.eNS_URI);
		SemaphorePackageImpl theSemaphorePackage = (SemaphorePackageImpl)(registeredPackage instanceof SemaphorePackageImpl ? registeredPackage : SemaphorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(IssuancePackage.eNS_URI);
		IssuancePackageImpl theIssuancePackage = (IssuancePackageImpl)(registeredPackage instanceof IssuancePackageImpl ? registeredPackage : IssuancePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PicklistPackage.eNS_URI);
		PicklistPackageImpl thePicklistPackage = (PicklistPackageImpl)(registeredPackage instanceof PicklistPackageImpl ? registeredPackage : PicklistPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReceiptPackage.eNS_URI);
		ReceiptPackageImpl theReceiptPackage = (ReceiptPackageImpl)(registeredPackage instanceof ReceiptPackageImpl ? registeredPackage : ReceiptPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Shipment_Package.eNS_URI);
		Shipment_PackageImpl theShipment_Package = (Shipment_PackageImpl)(registeredPackage instanceof Shipment_PackageImpl ? registeredPackage : Shipment_Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(VisitPackage.eNS_URI);
		VisitPackageImpl theVisitPackage = (VisitPackageImpl)(registeredPackage instanceof VisitPackageImpl ? registeredPackage : VisitPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.webapp.website.WebsitePackage.eNS_URI);
		org.abchip.mimo.biz.webapp.website.impl.WebsitePackageImpl theWebsitePackage_1 = (org.abchip.mimo.biz.webapp.website.impl.WebsitePackageImpl)(registeredPackage instanceof org.abchip.mimo.biz.webapp.website.impl.WebsitePackageImpl ? registeredPackage : org.abchip.mimo.biz.webapp.website.WebsitePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TimesheetPackage.eNS_URI);
		TimesheetPackageImpl theTimesheetPackage = (TimesheetPackageImpl)(registeredPackage instanceof TimesheetPackageImpl ? registeredPackage : TimesheetPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(WorkeffortPackage.eNS_URI);
		WorkeffortPackageImpl theWorkeffortPackage = (WorkeffortPackageImpl)(registeredPackage instanceof WorkeffortPackageImpl ? registeredPackage : WorkeffortPackage.eINSTANCE);

		// Create package meta-data objects
		thePaymentPackage.createPackageContents();
		theBizPackage.createPackageContents();
		theAccountingPackage.createPackageContents();
		theBudgetPackage.createPackageContents();
		theFinaccountPackage.createPackageContents();
		theFixedassetPackage.createPackageContents();
		theInvoicePackage.createPackageContents();
		theLedgerPackage.createPackageContents();
		theRatePackage.createPackageContents();
		theTaxPackage.createPackageContents();
		theSessionPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theDatasourcePackage.createPackageContents();
		theEmailPackage.createPackageContents();
		theEnumPackage.createPackageContents();
		theGeoPackage.createPackageContents();
		theKeywordPackage.createPackageContents();
		theLanguagePackage.createPackageContents();
		theMethodPackage.createPackageContents();
		theNotePackage.createPackageContents();
		thePeriodPackage.createPackageContents();
		thePortalPackage.createPackageContents();
		thePropertyPackage.createPackageContents();
		theScreenPackage.createPackageContents();
		theStatusPackage.createPackageContents();
		theThemePackage.createPackageContents();
		theUomPackage.createPackageContents();
		theUserPackage.createPackageContents();
		theContentPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theDocumentPackage.createPackageContents();
		thePreferencePackage.createPackageContents();
		theSurveyPackage.createPackageContents();
		theWebsitePackage.createPackageContents();
		theEntityPackage.createPackageContents();
		theAuditPackage.createPackageContents();
		theCryptoPackage.createPackageContents();
		theGroupPackage.createPackageContents();
		theSequencePackage.createPackageContents();
		theSynchronizationPackage.createPackageContents();
		theTenantPackage.createPackageContents();
		theTestPackage.createPackageContents();
		theAbilityPackage.createPackageContents();
		theEmploymentPackage.createPackageContents();
		thePositionPackage.createPackageContents();
		theRecruitmentPackage.createPackageContents();
		theTrainingsPackage.createPackageContents();
		theBomPackage.createPackageContents();
		theMrpPackage.createPackageContents();
		theTechdataPackage.createPackageContents();
		theCampaignPackage.createPackageContents();
		theContactPackage.createPackageContents();
		theOpportunityPackage.createPackageContents();
		theSegmentPackage.createPackageContents();
		theTrackingPackage.createPackageContents();
		theOrderPackage.createPackageContents();
		theQuotePackage.createPackageContents();
		theRequestPackage.createPackageContents();
		theRequirementPackage.createPackageContents();
		theReservationsPackage.createPackageContents();
		theReturnPackage.createPackageContents();
		theShoppingcartPackage.createPackageContents();
		theShoppinglistPackage.createPackageContents();
		thePartyPackage.createPackageContents();
		theAgreementPackage.createPackageContents();
		theCommunicationPackage.createPackageContents();
		theContactPackage_1.createPackageContents();
		theNeedPackage.createPackageContents();
		thePartyPackage_1.createPackageContents();
		thePassportPackage.createPackageContents();
		theCatalogPackage.createPackageContents();
		theCategoryPackage.createPackageContents();
		theConfigPackage.createPackageContents();
		theCostPackage.createPackageContents();
		theFacilityPackage.createPackageContents();
		theFeaturePackage.createPackageContents();
		theInventoryPackage.createPackageContents();
		thePricePackage.createPackageContents();
		theProductPackage.createPackageContents();
		thePromoPackage.createPackageContents();
		theStorePackage.createPackageContents();
		theSubscriptionPackage.createPackageContents();
		theSupplierPackage.createPackageContents();
		theCertPackage.createPackageContents();
		theLoginPackage.createPackageContents();
		theSecuritygroupPackage.createPackageContents();
		theSchedulePackage.createPackageContents();
		theSemaphorePackage.createPackageContents();
		theIssuancePackage.createPackageContents();
		thePicklistPackage.createPackageContents();
		theReceiptPackage.createPackageContents();
		theShipment_Package.createPackageContents();
		theVisitPackage.createPackageContents();
		theWebsitePackage_1.createPackageContents();
		theTimesheetPackage.createPackageContents();
		theWorkeffortPackage.createPackageContents();

		// Initialize created meta-data
		thePaymentPackage.initializePackageContents();
		theBizPackage.initializePackageContents();
		theAccountingPackage.initializePackageContents();
		theBudgetPackage.initializePackageContents();
		theFinaccountPackage.initializePackageContents();
		theFixedassetPackage.initializePackageContents();
		theInvoicePackage.initializePackageContents();
		theLedgerPackage.initializePackageContents();
		theRatePackage.initializePackageContents();
		theTaxPackage.initializePackageContents();
		theSessionPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theDatasourcePackage.initializePackageContents();
		theEmailPackage.initializePackageContents();
		theEnumPackage.initializePackageContents();
		theGeoPackage.initializePackageContents();
		theKeywordPackage.initializePackageContents();
		theLanguagePackage.initializePackageContents();
		theMethodPackage.initializePackageContents();
		theNotePackage.initializePackageContents();
		thePeriodPackage.initializePackageContents();
		thePortalPackage.initializePackageContents();
		thePropertyPackage.initializePackageContents();
		theScreenPackage.initializePackageContents();
		theStatusPackage.initializePackageContents();
		theThemePackage.initializePackageContents();
		theUomPackage.initializePackageContents();
		theUserPackage.initializePackageContents();
		theContentPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theDocumentPackage.initializePackageContents();
		thePreferencePackage.initializePackageContents();
		theSurveyPackage.initializePackageContents();
		theWebsitePackage.initializePackageContents();
		theEntityPackage.initializePackageContents();
		theAuditPackage.initializePackageContents();
		theCryptoPackage.initializePackageContents();
		theGroupPackage.initializePackageContents();
		theSequencePackage.initializePackageContents();
		theSynchronizationPackage.initializePackageContents();
		theTenantPackage.initializePackageContents();
		theTestPackage.initializePackageContents();
		theAbilityPackage.initializePackageContents();
		theEmploymentPackage.initializePackageContents();
		thePositionPackage.initializePackageContents();
		theRecruitmentPackage.initializePackageContents();
		theTrainingsPackage.initializePackageContents();
		theBomPackage.initializePackageContents();
		theMrpPackage.initializePackageContents();
		theTechdataPackage.initializePackageContents();
		theCampaignPackage.initializePackageContents();
		theContactPackage.initializePackageContents();
		theOpportunityPackage.initializePackageContents();
		theSegmentPackage.initializePackageContents();
		theTrackingPackage.initializePackageContents();
		theOrderPackage.initializePackageContents();
		theQuotePackage.initializePackageContents();
		theRequestPackage.initializePackageContents();
		theRequirementPackage.initializePackageContents();
		theReservationsPackage.initializePackageContents();
		theReturnPackage.initializePackageContents();
		theShoppingcartPackage.initializePackageContents();
		theShoppinglistPackage.initializePackageContents();
		thePartyPackage.initializePackageContents();
		theAgreementPackage.initializePackageContents();
		theCommunicationPackage.initializePackageContents();
		theContactPackage_1.initializePackageContents();
		theNeedPackage.initializePackageContents();
		thePartyPackage_1.initializePackageContents();
		thePassportPackage.initializePackageContents();
		theCatalogPackage.initializePackageContents();
		theCategoryPackage.initializePackageContents();
		theConfigPackage.initializePackageContents();
		theCostPackage.initializePackageContents();
		theFacilityPackage.initializePackageContents();
		theFeaturePackage.initializePackageContents();
		theInventoryPackage.initializePackageContents();
		thePricePackage.initializePackageContents();
		theProductPackage.initializePackageContents();
		thePromoPackage.initializePackageContents();
		theStorePackage.initializePackageContents();
		theSubscriptionPackage.initializePackageContents();
		theSupplierPackage.initializePackageContents();
		theCertPackage.initializePackageContents();
		theLoginPackage.initializePackageContents();
		theSecuritygroupPackage.initializePackageContents();
		theSchedulePackage.initializePackageContents();
		theSemaphorePackage.initializePackageContents();
		theIssuancePackage.initializePackageContents();
		thePicklistPackage.initializePackageContents();
		theReceiptPackage.initializePackageContents();
		theShipment_Package.initializePackageContents();
		theVisitPackage.initializePackageContents();
		theWebsitePackage_1.initializePackageContents();
		theTimesheetPackage.initializePackageContents();
		theWorkeffortPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePaymentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PaymentPackage.eNS_URI, thePaymentPackage);
		return thePaymentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBillingAccount() {
		return billingAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBillingAccount_BillingAccountId() {
		return (EAttribute)billingAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBillingAccount_AccountCurrencyUomId() {
		return (EReference)billingAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBillingAccount_AccountLimit() {
		return (EAttribute)billingAccountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBillingAccount_ContactMechId() {
		return (EReference)billingAccountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBillingAccount_Description() {
		return (EAttribute)billingAccountEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBillingAccount_ExternalAccountId() {
		return (EAttribute)billingAccountEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBillingAccount_FromDate() {
		return (EAttribute)billingAccountEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBillingAccount_ThruDate() {
		return (EAttribute)billingAccountEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBillingAccountRole() {
		return billingAccountRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBillingAccountRole_BillingAccountId() {
		return (EReference)billingAccountRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBillingAccountRole_PartyId() {
		return (EReference)billingAccountRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBillingAccountRole_RoleTypeId() {
		return (EReference)billingAccountRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBillingAccountRole_FromDate() {
		return (EAttribute)billingAccountRoleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBillingAccountRole_ThruDate() {
		return (EAttribute)billingAccountRoleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBillingAccountTerm() {
		return billingAccountTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBillingAccountTerm_BillingAccountTermId() {
		return (EAttribute)billingAccountTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBillingAccountTerm_BillingAccountId() {
		return (EReference)billingAccountTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBillingAccountTerm_BillingAccountTermAttrs() {
		return (EReference)billingAccountTermEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBillingAccountTerm_TermDays() {
		return (EAttribute)billingAccountTermEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBillingAccountTerm_TermTypeId() {
		return (EReference)billingAccountTermEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBillingAccountTerm_TermValue() {
		return (EAttribute)billingAccountTermEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBillingAccountTerm_UomId() {
		return (EReference)billingAccountTermEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBillingAccountTermAttr() {
		return billingAccountTermAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBillingAccountTermAttr_BillingAccountTermId() {
		return (EReference)billingAccountTermAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBillingAccountTermAttr_AttrName() {
		return (EAttribute)billingAccountTermAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBillingAccountTermAttr_AttrValue() {
		return (EAttribute)billingAccountTermAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCheckAccount() {
		return checkAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckAccount_PaymentMethodId() {
		return (EAttribute)checkAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckAccount_AccountNumber() {
		return (EAttribute)checkAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckAccount_AccountType() {
		return (EAttribute)checkAccountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckAccount_BankName() {
		return (EAttribute)checkAccountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckAccount_BranchCode() {
		return (EAttribute)checkAccountEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckAccount_CompanyNameOnAccount() {
		return (EAttribute)checkAccountEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCheckAccount_ContactMechId() {
		return (EReference)checkAccountEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckAccount_NameOnAccount() {
		return (EAttribute)checkAccountEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckAccount_RoutingNumber() {
		return (EAttribute)checkAccountEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreditCard() {
		return creditCardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreditCard_CardNumber() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreditCard_CardType() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreditCard_CompanyNameOnCard() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreditCard_ConsecutiveFailedAuths() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreditCard_ConsecutiveFailedNsf() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCreditCard_ContactMechId() {
		return (EReference)creditCardEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreditCard_ExpireDate() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreditCard_FirstNameOnCard() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreditCard_IssueNumber() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreditCard_LastFailedAuthDate() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreditCard_LastFailedNsfDate() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreditCard_LastNameOnCard() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreditCard_MiddleNameOnCard() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreditCard_SuffixOnCard() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreditCard_TitleOnCard() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreditCard_ValidFromDate() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreditCardTypeGlAccount() {
		return creditCardTypeGlAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreditCardTypeGlAccount_CardType() {
		return (EAttribute)creditCardTypeGlAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreditCardTypeGlAccount_OrganizationPartyId() {
		return (EAttribute)creditCardTypeGlAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreditCardTypeGlAccount_GlAccountId() {
		return (EAttribute)creditCardTypeGlAccountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeduction() {
		return deductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeduction_DeductionId() {
		return (EAttribute)deductionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeduction_Amount() {
		return (EAttribute)deductionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeduction_DeductionTypeId() {
		return (EReference)deductionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeduction_PaymentId() {
		return (EReference)deductionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeductionType() {
		return deductionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeductionType_DeductionTypeId() {
		return (EAttribute)deductionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeductionType_Description() {
		return (EAttribute)deductionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeductionType_HasTable() {
		return (EAttribute)deductionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeductionType_ParentTypeId() {
		return (EReference)deductionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEftAccount() {
		return eftAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEftAccount_AccountNumber() {
		return (EAttribute)eftAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEftAccount_AccountType() {
		return (EAttribute)eftAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEftAccount_BankName() {
		return (EAttribute)eftAccountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEftAccount_CompanyNameOnAccount() {
		return (EAttribute)eftAccountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEftAccount_ContactMechId() {
		return (EReference)eftAccountEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEftAccount_NameOnAccount() {
		return (EAttribute)eftAccountEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEftAccount_RoutingNumber() {
		return (EAttribute)eftAccountEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEftAccount_YearsAtBank() {
		return (EAttribute)eftAccountEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGiftCard() {
		return giftCardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGiftCard_CardNumber() {
		return (EAttribute)giftCardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGiftCard_ContactMechId() {
		return (EReference)giftCardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGiftCard_ExpireDate() {
		return (EAttribute)giftCardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGiftCard_PinNumber() {
		return (EAttribute)giftCardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGiftCardFulfillment() {
		return giftCardFulfillmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGiftCardFulfillment_FulfillmentId() {
		return (EAttribute)giftCardFulfillmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGiftCardFulfillment_Amount() {
		return (EAttribute)giftCardFulfillmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGiftCardFulfillment_AuthCode() {
		return (EAttribute)giftCardFulfillmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGiftCardFulfillment_CardNumber() {
		return (EAttribute)giftCardFulfillmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGiftCardFulfillment_FulfillmentDate() {
		return (EAttribute)giftCardFulfillmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGiftCardFulfillment_MerchantId() {
		return (EAttribute)giftCardFulfillmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGiftCardFulfillment_OrderId() {
		return (EReference)giftCardFulfillmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGiftCardFulfillment_OrderItemSeqId() {
		return (EAttribute)giftCardFulfillmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGiftCardFulfillment_PartyId() {
		return (EReference)giftCardFulfillmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGiftCardFulfillment_PinNumber() {
		return (EAttribute)giftCardFulfillmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGiftCardFulfillment_ReferenceNum() {
		return (EAttribute)giftCardFulfillmentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGiftCardFulfillment_ResponseCode() {
		return (EAttribute)giftCardFulfillmentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGiftCardFulfillment_SurveyResponseId() {
		return (EReference)giftCardFulfillmentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGiftCardFulfillment_TypeEnumId() {
		return (EReference)giftCardFulfillmentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPayPalPaymentMethod() {
		return payPalPaymentMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayPalPaymentMethod_PaymentMethodId() {
		return (EAttribute)payPalPaymentMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayPalPaymentMethod_AvsAddr() {
		return (EAttribute)payPalPaymentMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayPalPaymentMethod_AvsZip() {
		return (EAttribute)payPalPaymentMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPayPalPaymentMethod_ContactMechId() {
		return (EReference)payPalPaymentMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayPalPaymentMethod_CorrelationId() {
		return (EAttribute)payPalPaymentMethodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayPalPaymentMethod_ExpressCheckoutToken() {
		return (EAttribute)payPalPaymentMethodEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayPalPaymentMethod_PayerId() {
		return (EAttribute)payPalPaymentMethodEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayPalPaymentMethod_PayerStatus() {
		return (EAttribute)payPalPaymentMethodEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayPalPaymentMethod_TransactionId() {
		return (EAttribute)payPalPaymentMethodEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPayment() {
		return paymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayment_PaymentId() {
		return (EAttribute)paymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayment_ActualCurrencyAmount() {
		return (EAttribute)paymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPayment_ActualCurrencyUomId() {
		return (EReference)paymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayment_Amount() {
		return (EAttribute)paymentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayment_Comments() {
		return (EAttribute)paymentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPayment_CurrencyUomId() {
		return (EReference)paymentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayment_EffectiveDate() {
		return (EAttribute)paymentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPayment_FinAccountTransId() {
		return (EReference)paymentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPayment_OverrideGlAccountId() {
		return (EReference)paymentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPayment_PartyIdFrom() {
		return (EReference)paymentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPayment_PartyIdTo() {
		return (EReference)paymentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPayment_PaymentAttributes() {
		return (EReference)paymentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPayment_PaymentGatewayResponseId() {
		return (EReference)paymentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPayment_PaymentMethodId() {
		return (EReference)paymentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPayment_PaymentMethodTypeId() {
		return (EReference)paymentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPayment_PaymentPreferenceId() {
		return (EReference)paymentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayment_PaymentRefNum() {
		return (EAttribute)paymentEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPayment_PaymentTypeId() {
		return (EReference)paymentEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPayment_RoleTypeIdTo() {
		return (EReference)paymentEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPayment_StatusId() {
		return (EReference)paymentEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentApplication() {
		return paymentApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentApplication_PaymentApplicationId() {
		return (EAttribute)paymentApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentApplication_AmountApplied() {
		return (EAttribute)paymentApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentApplication_BillingAccountId() {
		return (EReference)paymentApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentApplication_InvoiceId() {
		return (EReference)paymentApplicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentApplication_InvoiceItemSeqId() {
		return (EAttribute)paymentApplicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentApplication_OverrideGlAccountId() {
		return (EReference)paymentApplicationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentApplication_PaymentId() {
		return (EReference)paymentApplicationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentApplication_TaxAuthGeoId() {
		return (EReference)paymentApplicationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentApplication_ToPaymentId() {
		return (EReference)paymentApplicationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentAttribute() {
		return paymentAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentAttribute_PaymentId() {
		return (EReference)paymentAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentAttribute_AttrName() {
		return (EAttribute)paymentAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentAttribute_AttrDescription() {
		return (EAttribute)paymentAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentAttribute_AttrValue() {
		return (EAttribute)paymentAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentBudgetAllocation() {
		return paymentBudgetAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentBudgetAllocation_BudgetId() {
		return (EReference)paymentBudgetAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentBudgetAllocation_BudgetItemSeqId() {
		return (EAttribute)paymentBudgetAllocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentBudgetAllocation_PaymentId() {
		return (EReference)paymentBudgetAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentBudgetAllocation_Amount() {
		return (EAttribute)paymentBudgetAllocationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentContent() {
		return paymentContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentContent_ContentId() {
		return (EReference)paymentContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentContent_PaymentId() {
		return (EReference)paymentContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentContent_PaymentContentTypeId() {
		return (EReference)paymentContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentContent_FromDate() {
		return (EAttribute)paymentContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentContent_ThruDate() {
		return (EAttribute)paymentContentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentContentType() {
		return paymentContentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentContentType_PaymentContentTypeId() {
		return (EAttribute)paymentContentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentContentType_Description() {
		return (EAttribute)paymentContentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentContentType_HasTable() {
		return (EAttribute)paymentContentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentContentType_ParentTypeId() {
		return (EReference)paymentContentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentGatewayAuthorizeNet() {
		return paymentGatewayAuthorizeNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayAuthorizeNet_PaymentGatewayConfigId() {
		return (EAttribute)paymentGatewayAuthorizeNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayAuthorizeNet_ApiVersion() {
		return (EAttribute)paymentGatewayAuthorizeNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayAuthorizeNet_CertificateAlias() {
		return (EAttribute)paymentGatewayAuthorizeNetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayAuthorizeNet_CpDeviceType() {
		return (EAttribute)paymentGatewayAuthorizeNetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayAuthorizeNet_CpMarketType() {
		return (EAttribute)paymentGatewayAuthorizeNetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayAuthorizeNet_CpVersion() {
		return (EAttribute)paymentGatewayAuthorizeNetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayAuthorizeNet_DelimitedData() {
		return (EAttribute)paymentGatewayAuthorizeNetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayAuthorizeNet_DelimiterChar() {
		return (EAttribute)paymentGatewayAuthorizeNetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayAuthorizeNet_DuplicateWindow() {
		return (EAttribute)paymentGatewayAuthorizeNetEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayAuthorizeNet_EmailCustomer() {
		return (EAttribute)paymentGatewayAuthorizeNetEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayAuthorizeNet_EmailMerchant() {
		return (EAttribute)paymentGatewayAuthorizeNetEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayAuthorizeNet_Method() {
		return (EAttribute)paymentGatewayAuthorizeNetEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayAuthorizeNet_Pwd() {
		return (EAttribute)paymentGatewayAuthorizeNetEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayAuthorizeNet_RelayResponse() {
		return (EAttribute)paymentGatewayAuthorizeNetEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayAuthorizeNet_TestMode() {
		return (EAttribute)paymentGatewayAuthorizeNetEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayAuthorizeNet_TranKey() {
		return (EAttribute)paymentGatewayAuthorizeNetEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayAuthorizeNet_TransDescription() {
		return (EAttribute)paymentGatewayAuthorizeNetEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayAuthorizeNet_TransactionUrl() {
		return (EAttribute)paymentGatewayAuthorizeNetEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayAuthorizeNet_UserId() {
		return (EAttribute)paymentGatewayAuthorizeNetEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentGatewayClearCommerce() {
		return paymentGatewayClearCommerceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayClearCommerce_PaymentGatewayConfigId() {
		return (EAttribute)paymentGatewayClearCommerceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayClearCommerce_ClientId() {
		return (EAttribute)paymentGatewayClearCommerceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayClearCommerce_EffectiveAlias() {
		return (EAttribute)paymentGatewayClearCommerceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayClearCommerce_EnableCVM() {
		return (EAttribute)paymentGatewayClearCommerceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayClearCommerce_GroupId() {
		return (EAttribute)paymentGatewayClearCommerceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayClearCommerce_ProcessMode() {
		return (EAttribute)paymentGatewayClearCommerceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayClearCommerce_Pwd() {
		return (EAttribute)paymentGatewayClearCommerceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayClearCommerce_ServerURL() {
		return (EAttribute)paymentGatewayClearCommerceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayClearCommerce_SourceId() {
		return (EAttribute)paymentGatewayClearCommerceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayClearCommerce_UserAlias() {
		return (EAttribute)paymentGatewayClearCommerceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayClearCommerce_Username() {
		return (EAttribute)paymentGatewayClearCommerceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentGatewayConfig() {
		return paymentGatewayConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayConfig_PaymentGatewayConfigId() {
		return (EAttribute)paymentGatewayConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayConfig_Description() {
		return (EAttribute)paymentGatewayConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentGatewayConfig_PaymentGatewayConfigTypeId() {
		return (EReference)paymentGatewayConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentGatewayConfigType() {
		return paymentGatewayConfigTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayConfigType_PaymentGatewayConfigTypeId() {
		return (EAttribute)paymentGatewayConfigTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayConfigType_Description() {
		return (EAttribute)paymentGatewayConfigTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayConfigType_HasTable() {
		return (EAttribute)paymentGatewayConfigTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentGatewayConfigType_ParentTypeId() {
		return (EReference)paymentGatewayConfigTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentGatewayCyberSource() {
		return paymentGatewayCyberSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayCyberSource_PaymentGatewayConfigId() {
		return (EAttribute)paymentGatewayCyberSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayCyberSource_ApiVersion() {
		return (EAttribute)paymentGatewayCyberSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayCyberSource_AutoBill() {
		return (EAttribute)paymentGatewayCyberSourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayCyberSource_AvsDeclineCodes() {
		return (EAttribute)paymentGatewayCyberSourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayCyberSource_DisableBillAvs() {
		return (EAttribute)paymentGatewayCyberSourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayCyberSource_EnableDav() {
		return (EAttribute)paymentGatewayCyberSourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayCyberSource_FraudScore() {
		return (EAttribute)paymentGatewayCyberSourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayCyberSource_IgnoreAvs() {
		return (EAttribute)paymentGatewayCyberSourceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayCyberSource_KeysDir() {
		return (EAttribute)paymentGatewayCyberSourceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayCyberSource_KeysFile() {
		return (EAttribute)paymentGatewayCyberSourceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayCyberSource_LogDir() {
		return (EAttribute)paymentGatewayCyberSourceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayCyberSource_LogEnabled() {
		return (EAttribute)paymentGatewayCyberSourceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayCyberSource_LogFile() {
		return (EAttribute)paymentGatewayCyberSourceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayCyberSource_LogSize() {
		return (EAttribute)paymentGatewayCyberSourceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayCyberSource_MerchantContact() {
		return (EAttribute)paymentGatewayCyberSourceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayCyberSource_MerchantDescr() {
		return (EAttribute)paymentGatewayCyberSourceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayCyberSource_MerchantId() {
		return (EAttribute)paymentGatewayCyberSourceEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayCyberSource_Production() {
		return (EAttribute)paymentGatewayCyberSourceEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentGatewayEway() {
		return paymentGatewayEwayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayEway_PaymentGatewayConfigId() {
		return (EAttribute)paymentGatewayEwayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayEway_CustomerId() {
		return (EAttribute)paymentGatewayEwayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayEway_EnableBeagle() {
		return (EAttribute)paymentGatewayEwayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayEway_EnableCvn() {
		return (EAttribute)paymentGatewayEwayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayEway_RefundPwd() {
		return (EAttribute)paymentGatewayEwayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayEway_TestMode() {
		return (EAttribute)paymentGatewayEwayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentGatewayOrbital() {
		return paymentGatewayOrbitalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayOrbital_PaymentGatewayConfigId() {
		return (EAttribute)paymentGatewayOrbitalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayOrbital_AuthorizationURI() {
		return (EAttribute)paymentGatewayOrbitalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayOrbital_ConnectionPassword() {
		return (EAttribute)paymentGatewayOrbitalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayOrbital_ConnectionTimeoutSeconds() {
		return (EAttribute)paymentGatewayOrbitalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayOrbital_EngineClass() {
		return (EAttribute)paymentGatewayOrbitalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayOrbital_HostName() {
		return (EAttribute)paymentGatewayOrbitalEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayOrbital_HostNameFailover() {
		return (EAttribute)paymentGatewayOrbitalEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayOrbital_MerchantId() {
		return (EAttribute)paymentGatewayOrbitalEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayOrbital_Port() {
		return (EAttribute)paymentGatewayOrbitalEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayOrbital_PortFailover() {
		return (EAttribute)paymentGatewayOrbitalEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayOrbital_ReadTimeoutSeconds() {
		return (EAttribute)paymentGatewayOrbitalEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayOrbital_ResponseType() {
		return (EAttribute)paymentGatewayOrbitalEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayOrbital_SdkVersion() {
		return (EAttribute)paymentGatewayOrbitalEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayOrbital_SslSocketFactory() {
		return (EAttribute)paymentGatewayOrbitalEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayOrbital_Username() {
		return (EAttribute)paymentGatewayOrbitalEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentGatewayPayPal() {
		return paymentGatewayPayPalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayPal_PaymentGatewayConfigId() {
		return (EAttribute)paymentGatewayPayPalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayPal_ApiEnvironment() {
		return (EAttribute)paymentGatewayPayPalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayPal_ApiPassword() {
		return (EAttribute)paymentGatewayPayPalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayPal_ApiSignature() {
		return (EAttribute)paymentGatewayPayPalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayPal_ApiUserName() {
		return (EAttribute)paymentGatewayPayPalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayPal_BusinessEmail() {
		return (EAttribute)paymentGatewayPayPalEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayPal_CancelReturnUrl() {
		return (EAttribute)paymentGatewayPayPalEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayPal_ConfirmTemplate() {
		return (EAttribute)paymentGatewayPayPalEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayPal_ConfirmUrl() {
		return (EAttribute)paymentGatewayPayPalEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayPal_ImageUrl() {
		return (EAttribute)paymentGatewayPayPalEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayPal_NotifyUrl() {
		return (EAttribute)paymentGatewayPayPalEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayPal_RedirectUrl() {
		return (EAttribute)paymentGatewayPayPalEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayPal_RequireConfirmedShipping() {
		return (EAttribute)paymentGatewayPayPalEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayPal_ReturnUrl() {
		return (EAttribute)paymentGatewayPayPalEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayPal_ShippingCallbackUrl() {
		return (EAttribute)paymentGatewayPayPalEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentGatewayPayflowPro() {
		return paymentGatewayPayflowProEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayflowPro_PaymentGatewayConfigId() {
		return (EAttribute)paymentGatewayPayflowProEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayflowPro_CancelReturnUrl() {
		return (EAttribute)paymentGatewayPayflowProEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayflowPro_CertsPath() {
		return (EAttribute)paymentGatewayPayflowProEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayflowPro_CheckAvs() {
		return (EAttribute)paymentGatewayPayflowProEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayflowPro_CheckCvv2() {
		return (EAttribute)paymentGatewayPayflowProEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayflowPro_EnableTransmit() {
		return (EAttribute)paymentGatewayPayflowProEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayflowPro_HostAddress() {
		return (EAttribute)paymentGatewayPayflowProEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayflowPro_HostPort() {
		return (EAttribute)paymentGatewayPayflowProEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayflowPro_LogFileName() {
		return (EAttribute)paymentGatewayPayflowProEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayflowPro_LoggingLevel() {
		return (EAttribute)paymentGatewayPayflowProEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayflowPro_MaxLogFileSize() {
		return (EAttribute)paymentGatewayPayflowProEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayflowPro_Partner() {
		return (EAttribute)paymentGatewayPayflowProEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayflowPro_PreAuth() {
		return (EAttribute)paymentGatewayPayflowProEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayflowPro_ProxyAddress() {
		return (EAttribute)paymentGatewayPayflowProEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayflowPro_ProxyLogon() {
		return (EAttribute)paymentGatewayPayflowProEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayflowPro_ProxyPassword() {
		return (EAttribute)paymentGatewayPayflowProEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayflowPro_ProxyPort() {
		return (EAttribute)paymentGatewayPayflowProEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayflowPro_Pwd() {
		return (EAttribute)paymentGatewayPayflowProEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayflowPro_RedirectUrl() {
		return (EAttribute)paymentGatewayPayflowProEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayflowPro_ReturnUrl() {
		return (EAttribute)paymentGatewayPayflowProEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayflowPro_StackTraceOn() {
		return (EAttribute)paymentGatewayPayflowProEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayflowPro_Timeout() {
		return (EAttribute)paymentGatewayPayflowProEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayflowPro_UserId() {
		return (EAttribute)paymentGatewayPayflowProEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayPayflowPro_Vendor() {
		return (EAttribute)paymentGatewayPayflowProEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentGatewayRespMsg() {
		return paymentGatewayRespMsgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayRespMsg_PaymentGatewayRespMsgId() {
		return (EAttribute)paymentGatewayRespMsgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentGatewayRespMsg_PaymentGatewayResponseId() {
		return (EReference)paymentGatewayRespMsgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayRespMsg_PgrMessage() {
		return (EAttribute)paymentGatewayRespMsgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentGatewayResponse() {
		return paymentGatewayResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayResponse_PaymentGatewayResponseId() {
		return (EAttribute)paymentGatewayResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayResponse_AltReference() {
		return (EAttribute)paymentGatewayResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayResponse_Amount() {
		return (EAttribute)paymentGatewayResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentGatewayResponse_CurrencyUomId() {
		return (EReference)paymentGatewayResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayResponse_GatewayAvsResult() {
		return (EAttribute)paymentGatewayResponseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayResponse_GatewayCode() {
		return (EAttribute)paymentGatewayResponseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayResponse_GatewayCvResult() {
		return (EAttribute)paymentGatewayResponseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayResponse_GatewayFlag() {
		return (EAttribute)paymentGatewayResponseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayResponse_GatewayMessage() {
		return (EAttribute)paymentGatewayResponseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayResponse_GatewayScoreResult() {
		return (EAttribute)paymentGatewayResponseEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentGatewayResponse_OrderPaymentPreferenceId() {
		return (EReference)paymentGatewayResponseEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentGatewayResponse_PaymentMethodId() {
		return (EReference)paymentGatewayResponseEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentGatewayResponse_PaymentMethodTypeId() {
		return (EReference)paymentGatewayResponseEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentGatewayResponse_PaymentServiceTypeEnumId() {
		return (EReference)paymentGatewayResponseEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayResponse_ReferenceNum() {
		return (EAttribute)paymentGatewayResponseEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayResponse_ResultBadCardNumber() {
		return (EAttribute)paymentGatewayResponseEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayResponse_ResultBadExpire() {
		return (EAttribute)paymentGatewayResponseEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayResponse_ResultDeclined() {
		return (EAttribute)paymentGatewayResponseEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayResponse_ResultNsf() {
		return (EAttribute)paymentGatewayResponseEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayResponse_SubReference() {
		return (EAttribute)paymentGatewayResponseEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentGatewayResponse_TransCodeEnumId() {
		return (EReference)paymentGatewayResponseEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayResponse_TransactionDate() {
		return (EAttribute)paymentGatewayResponseEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentGatewaySagePay() {
		return paymentGatewaySagePayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewaySagePay_PaymentGatewayConfigId() {
		return (EAttribute)paymentGatewaySagePayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewaySagePay_AuthenticationTransType() {
		return (EAttribute)paymentGatewaySagePayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewaySagePay_AuthenticationUrl() {
		return (EAttribute)paymentGatewaySagePayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewaySagePay_AuthoriseTransType() {
		return (EAttribute)paymentGatewaySagePayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewaySagePay_AuthoriseUrl() {
		return (EAttribute)paymentGatewaySagePayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewaySagePay_ProductionHost() {
		return (EAttribute)paymentGatewaySagePayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewaySagePay_ProtocolVersion() {
		return (EAttribute)paymentGatewaySagePayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewaySagePay_RefundUrl() {
		return (EAttribute)paymentGatewaySagePayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewaySagePay_ReleaseTransType() {
		return (EAttribute)paymentGatewaySagePayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewaySagePay_ReleaseUrl() {
		return (EAttribute)paymentGatewaySagePayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewaySagePay_SagePayMode() {
		return (EAttribute)paymentGatewaySagePayEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewaySagePay_TestingHost() {
		return (EAttribute)paymentGatewaySagePayEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewaySagePay_Vendor() {
		return (EAttribute)paymentGatewaySagePayEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewaySagePay_VoidUrl() {
		return (EAttribute)paymentGatewaySagePayEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentGatewaySecurePay() {
		return paymentGatewaySecurePayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewaySecurePay_PaymentGatewayConfigId() {
		return (EAttribute)paymentGatewaySecurePayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewaySecurePay_EnableAmountRound() {
		return (EAttribute)paymentGatewaySecurePayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewaySecurePay_MerchantId() {
		return (EAttribute)paymentGatewaySecurePayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewaySecurePay_ProcessTimeout() {
		return (EAttribute)paymentGatewaySecurePayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewaySecurePay_Pwd() {
		return (EAttribute)paymentGatewaySecurePayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewaySecurePay_ServerURL() {
		return (EAttribute)paymentGatewaySecurePayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentGatewayWorldPay() {
		return paymentGatewayWorldPayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayWorldPay_PaymentGatewayConfigId() {
		return (EAttribute)paymentGatewayWorldPayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayWorldPay_AuthMode() {
		return (EAttribute)paymentGatewayWorldPayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayWorldPay_FixContact() {
		return (EAttribute)paymentGatewayWorldPayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayWorldPay_HideContact() {
		return (EAttribute)paymentGatewayWorldPayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayWorldPay_HideCurrency() {
		return (EAttribute)paymentGatewayWorldPayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayWorldPay_InstId() {
		return (EAttribute)paymentGatewayWorldPayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayWorldPay_LangId() {
		return (EAttribute)paymentGatewayWorldPayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayWorldPay_NoLanguageMenu() {
		return (EAttribute)paymentGatewayWorldPayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayWorldPay_RedirectUrl() {
		return (EAttribute)paymentGatewayWorldPayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayWorldPay_TestMode() {
		return (EAttribute)paymentGatewayWorldPayEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGatewayWorldPay_WithDelivery() {
		return (EAttribute)paymentGatewayWorldPayEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentGlAccountTypeMap() {
		return paymentGlAccountTypeMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentGlAccountTypeMap_PaymentTypeId() {
		return (EReference)paymentGlAccountTypeMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentGlAccountTypeMap_OrganizationPartyId() {
		return (EReference)paymentGlAccountTypeMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentGlAccountTypeMap_GlAccountTypeId() {
		return (EReference)paymentGlAccountTypeMapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentGroup() {
		return paymentGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGroup_PaymentGroupId() {
		return (EAttribute)paymentGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGroup_PaymentGroupName() {
		return (EAttribute)paymentGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentGroup_PaymentGroupTypeId() {
		return (EReference)paymentGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentGroupMember() {
		return paymentGroupMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentGroupMember_PaymentGroupId() {
		return (EReference)paymentGroupMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentGroupMember_PaymentId() {
		return (EReference)paymentGroupMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGroupMember_FromDate() {
		return (EAttribute)paymentGroupMemberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGroupMember_SequenceNum() {
		return (EAttribute)paymentGroupMemberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGroupMember_ThruDate() {
		return (EAttribute)paymentGroupMemberEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentGroupType() {
		return paymentGroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGroupType_PaymentGroupTypeId() {
		return (EAttribute)paymentGroupTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGroupType_Description() {
		return (EAttribute)paymentGroupTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGroupType_HasTable() {
		return (EAttribute)paymentGroupTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentGroupType_ParentTypeId() {
		return (EReference)paymentGroupTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentMethod() {
		return paymentMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentMethod_PaymentMethodId() {
		return (EAttribute)paymentMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentMethod_Description() {
		return (EAttribute)paymentMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentMethod_FinAccountId() {
		return (EReference)paymentMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentMethod_FromDate() {
		return (EAttribute)paymentMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentMethod_GlAccountId() {
		return (EReference)paymentMethodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentMethod_PartyId() {
		return (EReference)paymentMethodEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentMethod_PaymentMethodTypeId() {
		return (EReference)paymentMethodEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentMethod_ThruDate() {
		return (EAttribute)paymentMethodEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentMethodType() {
		return paymentMethodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentMethodType_PaymentMethodTypeId() {
		return (EAttribute)paymentMethodTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentMethodType_DefaultGlAccountId() {
		return (EReference)paymentMethodTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentMethodType_Description() {
		return (EAttribute)paymentMethodTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentMethodType_PaymentMethodTypeGlAccounts() {
		return (EReference)paymentMethodTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentMethodTypeGlAccount() {
		return paymentMethodTypeGlAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentMethodTypeGlAccount_PaymentMethodTypeId() {
		return (EReference)paymentMethodTypeGlAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentMethodTypeGlAccount_OrganizationPartyId() {
		return (EReference)paymentMethodTypeGlAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentMethodTypeGlAccount_GlAccountId() {
		return (EReference)paymentMethodTypeGlAccountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentType() {
		return paymentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentType_PaymentTypeId() {
		return (EAttribute)paymentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentType_Description() {
		return (EAttribute)paymentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentType_HasTable() {
		return (EAttribute)paymentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentType_ParentTypeId() {
		return (EReference)paymentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentType_PaymentGlAccountTypeMaps() {
		return (EReference)paymentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentType_PaymentTypeAttrs() {
		return (EReference)paymentTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentTypeAttr() {
		return paymentTypeAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentTypeAttr_PaymentTypeId() {
		return (EReference)paymentTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentTypeAttr_AttrName() {
		return (EAttribute)paymentTypeAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentTypeAttr_Description() {
		return (EAttribute)paymentTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueLinkKey() {
		return valueLinkKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueLinkKey_MerchantId() {
		return (EAttribute)valueLinkKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueLinkKey_CreatedByTerminal() {
		return (EAttribute)valueLinkKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueLinkKey_CreatedByUserLogin() {
		return (EAttribute)valueLinkKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueLinkKey_CreatedDate() {
		return (EAttribute)valueLinkKeyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueLinkKey_ExchangeKey() {
		return (EAttribute)valueLinkKeyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueLinkKey_LastModifiedByTerminal() {
		return (EAttribute)valueLinkKeyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueLinkKey_LastModifiedByUserLogin() {
		return (EAttribute)valueLinkKeyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueLinkKey_LastModifiedDate() {
		return (EAttribute)valueLinkKeyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueLinkKey_LastWorkingKey() {
		return (EAttribute)valueLinkKeyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueLinkKey_PrivateKey() {
		return (EAttribute)valueLinkKeyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueLinkKey_PublicKey() {
		return (EAttribute)valueLinkKeyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueLinkKey_WorkingKey() {
		return (EAttribute)valueLinkKeyEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueLinkKey_WorkingKeyIndex() {
		return (EAttribute)valueLinkKeyEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentFactory getPaymentFactory() {
		return (PaymentFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		billingAccountEClass = createEClass(BILLING_ACCOUNT);
		createEAttribute(billingAccountEClass, BILLING_ACCOUNT__BILLING_ACCOUNT_ID);
		createEReference(billingAccountEClass, BILLING_ACCOUNT__ACCOUNT_CURRENCY_UOM_ID);
		createEAttribute(billingAccountEClass, BILLING_ACCOUNT__ACCOUNT_LIMIT);
		createEReference(billingAccountEClass, BILLING_ACCOUNT__CONTACT_MECH_ID);
		createEAttribute(billingAccountEClass, BILLING_ACCOUNT__DESCRIPTION);
		createEAttribute(billingAccountEClass, BILLING_ACCOUNT__EXTERNAL_ACCOUNT_ID);
		createEAttribute(billingAccountEClass, BILLING_ACCOUNT__FROM_DATE);
		createEAttribute(billingAccountEClass, BILLING_ACCOUNT__THRU_DATE);

		billingAccountRoleEClass = createEClass(BILLING_ACCOUNT_ROLE);
		createEReference(billingAccountRoleEClass, BILLING_ACCOUNT_ROLE__BILLING_ACCOUNT_ID);
		createEReference(billingAccountRoleEClass, BILLING_ACCOUNT_ROLE__PARTY_ID);
		createEReference(billingAccountRoleEClass, BILLING_ACCOUNT_ROLE__ROLE_TYPE_ID);
		createEAttribute(billingAccountRoleEClass, BILLING_ACCOUNT_ROLE__FROM_DATE);
		createEAttribute(billingAccountRoleEClass, BILLING_ACCOUNT_ROLE__THRU_DATE);

		billingAccountTermEClass = createEClass(BILLING_ACCOUNT_TERM);
		createEAttribute(billingAccountTermEClass, BILLING_ACCOUNT_TERM__BILLING_ACCOUNT_TERM_ID);
		createEReference(billingAccountTermEClass, BILLING_ACCOUNT_TERM__BILLING_ACCOUNT_ID);
		createEReference(billingAccountTermEClass, BILLING_ACCOUNT_TERM__BILLING_ACCOUNT_TERM_ATTRS);
		createEAttribute(billingAccountTermEClass, BILLING_ACCOUNT_TERM__TERM_DAYS);
		createEReference(billingAccountTermEClass, BILLING_ACCOUNT_TERM__TERM_TYPE_ID);
		createEAttribute(billingAccountTermEClass, BILLING_ACCOUNT_TERM__TERM_VALUE);
		createEReference(billingAccountTermEClass, BILLING_ACCOUNT_TERM__UOM_ID);

		billingAccountTermAttrEClass = createEClass(BILLING_ACCOUNT_TERM_ATTR);
		createEReference(billingAccountTermAttrEClass, BILLING_ACCOUNT_TERM_ATTR__BILLING_ACCOUNT_TERM_ID);
		createEAttribute(billingAccountTermAttrEClass, BILLING_ACCOUNT_TERM_ATTR__ATTR_NAME);
		createEAttribute(billingAccountTermAttrEClass, BILLING_ACCOUNT_TERM_ATTR__ATTR_VALUE);

		checkAccountEClass = createEClass(CHECK_ACCOUNT);
		createEAttribute(checkAccountEClass, CHECK_ACCOUNT__PAYMENT_METHOD_ID);
		createEAttribute(checkAccountEClass, CHECK_ACCOUNT__ACCOUNT_NUMBER);
		createEAttribute(checkAccountEClass, CHECK_ACCOUNT__ACCOUNT_TYPE);
		createEAttribute(checkAccountEClass, CHECK_ACCOUNT__BANK_NAME);
		createEAttribute(checkAccountEClass, CHECK_ACCOUNT__BRANCH_CODE);
		createEAttribute(checkAccountEClass, CHECK_ACCOUNT__COMPANY_NAME_ON_ACCOUNT);
		createEReference(checkAccountEClass, CHECK_ACCOUNT__CONTACT_MECH_ID);
		createEAttribute(checkAccountEClass, CHECK_ACCOUNT__NAME_ON_ACCOUNT);
		createEAttribute(checkAccountEClass, CHECK_ACCOUNT__ROUTING_NUMBER);

		creditCardEClass = createEClass(CREDIT_CARD);
		createEAttribute(creditCardEClass, CREDIT_CARD__CARD_NUMBER);
		createEAttribute(creditCardEClass, CREDIT_CARD__CARD_TYPE);
		createEAttribute(creditCardEClass, CREDIT_CARD__COMPANY_NAME_ON_CARD);
		createEAttribute(creditCardEClass, CREDIT_CARD__CONSECUTIVE_FAILED_AUTHS);
		createEAttribute(creditCardEClass, CREDIT_CARD__CONSECUTIVE_FAILED_NSF);
		createEReference(creditCardEClass, CREDIT_CARD__CONTACT_MECH_ID);
		createEAttribute(creditCardEClass, CREDIT_CARD__EXPIRE_DATE);
		createEAttribute(creditCardEClass, CREDIT_CARD__FIRST_NAME_ON_CARD);
		createEAttribute(creditCardEClass, CREDIT_CARD__ISSUE_NUMBER);
		createEAttribute(creditCardEClass, CREDIT_CARD__LAST_FAILED_AUTH_DATE);
		createEAttribute(creditCardEClass, CREDIT_CARD__LAST_FAILED_NSF_DATE);
		createEAttribute(creditCardEClass, CREDIT_CARD__LAST_NAME_ON_CARD);
		createEAttribute(creditCardEClass, CREDIT_CARD__MIDDLE_NAME_ON_CARD);
		createEAttribute(creditCardEClass, CREDIT_CARD__SUFFIX_ON_CARD);
		createEAttribute(creditCardEClass, CREDIT_CARD__TITLE_ON_CARD);
		createEAttribute(creditCardEClass, CREDIT_CARD__VALID_FROM_DATE);

		creditCardTypeGlAccountEClass = createEClass(CREDIT_CARD_TYPE_GL_ACCOUNT);
		createEAttribute(creditCardTypeGlAccountEClass, CREDIT_CARD_TYPE_GL_ACCOUNT__CARD_TYPE);
		createEAttribute(creditCardTypeGlAccountEClass, CREDIT_CARD_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY_ID);
		createEAttribute(creditCardTypeGlAccountEClass, CREDIT_CARD_TYPE_GL_ACCOUNT__GL_ACCOUNT_ID);

		deductionEClass = createEClass(DEDUCTION);
		createEAttribute(deductionEClass, DEDUCTION__DEDUCTION_ID);
		createEAttribute(deductionEClass, DEDUCTION__AMOUNT);
		createEReference(deductionEClass, DEDUCTION__DEDUCTION_TYPE_ID);
		createEReference(deductionEClass, DEDUCTION__PAYMENT_ID);

		deductionTypeEClass = createEClass(DEDUCTION_TYPE);
		createEAttribute(deductionTypeEClass, DEDUCTION_TYPE__DEDUCTION_TYPE_ID);
		createEAttribute(deductionTypeEClass, DEDUCTION_TYPE__DESCRIPTION);
		createEAttribute(deductionTypeEClass, DEDUCTION_TYPE__HAS_TABLE);
		createEReference(deductionTypeEClass, DEDUCTION_TYPE__PARENT_TYPE_ID);

		eftAccountEClass = createEClass(EFT_ACCOUNT);
		createEAttribute(eftAccountEClass, EFT_ACCOUNT__ACCOUNT_NUMBER);
		createEAttribute(eftAccountEClass, EFT_ACCOUNT__ACCOUNT_TYPE);
		createEAttribute(eftAccountEClass, EFT_ACCOUNT__BANK_NAME);
		createEAttribute(eftAccountEClass, EFT_ACCOUNT__COMPANY_NAME_ON_ACCOUNT);
		createEReference(eftAccountEClass, EFT_ACCOUNT__CONTACT_MECH_ID);
		createEAttribute(eftAccountEClass, EFT_ACCOUNT__NAME_ON_ACCOUNT);
		createEAttribute(eftAccountEClass, EFT_ACCOUNT__ROUTING_NUMBER);
		createEAttribute(eftAccountEClass, EFT_ACCOUNT__YEARS_AT_BANK);

		giftCardEClass = createEClass(GIFT_CARD);
		createEAttribute(giftCardEClass, GIFT_CARD__CARD_NUMBER);
		createEReference(giftCardEClass, GIFT_CARD__CONTACT_MECH_ID);
		createEAttribute(giftCardEClass, GIFT_CARD__EXPIRE_DATE);
		createEAttribute(giftCardEClass, GIFT_CARD__PIN_NUMBER);

		giftCardFulfillmentEClass = createEClass(GIFT_CARD_FULFILLMENT);
		createEAttribute(giftCardFulfillmentEClass, GIFT_CARD_FULFILLMENT__FULFILLMENT_ID);
		createEAttribute(giftCardFulfillmentEClass, GIFT_CARD_FULFILLMENT__AMOUNT);
		createEAttribute(giftCardFulfillmentEClass, GIFT_CARD_FULFILLMENT__AUTH_CODE);
		createEAttribute(giftCardFulfillmentEClass, GIFT_CARD_FULFILLMENT__CARD_NUMBER);
		createEAttribute(giftCardFulfillmentEClass, GIFT_CARD_FULFILLMENT__FULFILLMENT_DATE);
		createEAttribute(giftCardFulfillmentEClass, GIFT_CARD_FULFILLMENT__MERCHANT_ID);
		createEReference(giftCardFulfillmentEClass, GIFT_CARD_FULFILLMENT__ORDER_ID);
		createEAttribute(giftCardFulfillmentEClass, GIFT_CARD_FULFILLMENT__ORDER_ITEM_SEQ_ID);
		createEReference(giftCardFulfillmentEClass, GIFT_CARD_FULFILLMENT__PARTY_ID);
		createEAttribute(giftCardFulfillmentEClass, GIFT_CARD_FULFILLMENT__PIN_NUMBER);
		createEAttribute(giftCardFulfillmentEClass, GIFT_CARD_FULFILLMENT__REFERENCE_NUM);
		createEAttribute(giftCardFulfillmentEClass, GIFT_CARD_FULFILLMENT__RESPONSE_CODE);
		createEReference(giftCardFulfillmentEClass, GIFT_CARD_FULFILLMENT__SURVEY_RESPONSE_ID);
		createEReference(giftCardFulfillmentEClass, GIFT_CARD_FULFILLMENT__TYPE_ENUM_ID);

		payPalPaymentMethodEClass = createEClass(PAY_PAL_PAYMENT_METHOD);
		createEAttribute(payPalPaymentMethodEClass, PAY_PAL_PAYMENT_METHOD__PAYMENT_METHOD_ID);
		createEAttribute(payPalPaymentMethodEClass, PAY_PAL_PAYMENT_METHOD__AVS_ADDR);
		createEAttribute(payPalPaymentMethodEClass, PAY_PAL_PAYMENT_METHOD__AVS_ZIP);
		createEReference(payPalPaymentMethodEClass, PAY_PAL_PAYMENT_METHOD__CONTACT_MECH_ID);
		createEAttribute(payPalPaymentMethodEClass, PAY_PAL_PAYMENT_METHOD__CORRELATION_ID);
		createEAttribute(payPalPaymentMethodEClass, PAY_PAL_PAYMENT_METHOD__EXPRESS_CHECKOUT_TOKEN);
		createEAttribute(payPalPaymentMethodEClass, PAY_PAL_PAYMENT_METHOD__PAYER_ID);
		createEAttribute(payPalPaymentMethodEClass, PAY_PAL_PAYMENT_METHOD__PAYER_STATUS);
		createEAttribute(payPalPaymentMethodEClass, PAY_PAL_PAYMENT_METHOD__TRANSACTION_ID);

		paymentEClass = createEClass(PAYMENT);
		createEAttribute(paymentEClass, PAYMENT__PAYMENT_ID);
		createEAttribute(paymentEClass, PAYMENT__ACTUAL_CURRENCY_AMOUNT);
		createEReference(paymentEClass, PAYMENT__ACTUAL_CURRENCY_UOM_ID);
		createEAttribute(paymentEClass, PAYMENT__AMOUNT);
		createEAttribute(paymentEClass, PAYMENT__COMMENTS);
		createEReference(paymentEClass, PAYMENT__CURRENCY_UOM_ID);
		createEAttribute(paymentEClass, PAYMENT__EFFECTIVE_DATE);
		createEReference(paymentEClass, PAYMENT__FIN_ACCOUNT_TRANS_ID);
		createEReference(paymentEClass, PAYMENT__OVERRIDE_GL_ACCOUNT_ID);
		createEReference(paymentEClass, PAYMENT__PARTY_ID_FROM);
		createEReference(paymentEClass, PAYMENT__PARTY_ID_TO);
		createEReference(paymentEClass, PAYMENT__PAYMENT_ATTRIBUTES);
		createEReference(paymentEClass, PAYMENT__PAYMENT_GATEWAY_RESPONSE_ID);
		createEReference(paymentEClass, PAYMENT__PAYMENT_METHOD_ID);
		createEReference(paymentEClass, PAYMENT__PAYMENT_METHOD_TYPE_ID);
		createEReference(paymentEClass, PAYMENT__PAYMENT_PREFERENCE_ID);
		createEAttribute(paymentEClass, PAYMENT__PAYMENT_REF_NUM);
		createEReference(paymentEClass, PAYMENT__PAYMENT_TYPE_ID);
		createEReference(paymentEClass, PAYMENT__ROLE_TYPE_ID_TO);
		createEReference(paymentEClass, PAYMENT__STATUS_ID);

		paymentApplicationEClass = createEClass(PAYMENT_APPLICATION);
		createEAttribute(paymentApplicationEClass, PAYMENT_APPLICATION__PAYMENT_APPLICATION_ID);
		createEAttribute(paymentApplicationEClass, PAYMENT_APPLICATION__AMOUNT_APPLIED);
		createEReference(paymentApplicationEClass, PAYMENT_APPLICATION__BILLING_ACCOUNT_ID);
		createEReference(paymentApplicationEClass, PAYMENT_APPLICATION__INVOICE_ID);
		createEAttribute(paymentApplicationEClass, PAYMENT_APPLICATION__INVOICE_ITEM_SEQ_ID);
		createEReference(paymentApplicationEClass, PAYMENT_APPLICATION__OVERRIDE_GL_ACCOUNT_ID);
		createEReference(paymentApplicationEClass, PAYMENT_APPLICATION__PAYMENT_ID);
		createEReference(paymentApplicationEClass, PAYMENT_APPLICATION__TAX_AUTH_GEO_ID);
		createEReference(paymentApplicationEClass, PAYMENT_APPLICATION__TO_PAYMENT_ID);

		paymentAttributeEClass = createEClass(PAYMENT_ATTRIBUTE);
		createEReference(paymentAttributeEClass, PAYMENT_ATTRIBUTE__PAYMENT_ID);
		createEAttribute(paymentAttributeEClass, PAYMENT_ATTRIBUTE__ATTR_NAME);
		createEAttribute(paymentAttributeEClass, PAYMENT_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(paymentAttributeEClass, PAYMENT_ATTRIBUTE__ATTR_VALUE);

		paymentBudgetAllocationEClass = createEClass(PAYMENT_BUDGET_ALLOCATION);
		createEReference(paymentBudgetAllocationEClass, PAYMENT_BUDGET_ALLOCATION__BUDGET_ID);
		createEReference(paymentBudgetAllocationEClass, PAYMENT_BUDGET_ALLOCATION__PAYMENT_ID);
		createEAttribute(paymentBudgetAllocationEClass, PAYMENT_BUDGET_ALLOCATION__BUDGET_ITEM_SEQ_ID);
		createEAttribute(paymentBudgetAllocationEClass, PAYMENT_BUDGET_ALLOCATION__AMOUNT);

		paymentContentEClass = createEClass(PAYMENT_CONTENT);
		createEReference(paymentContentEClass, PAYMENT_CONTENT__PAYMENT_ID);
		createEReference(paymentContentEClass, PAYMENT_CONTENT__CONTENT_ID);
		createEReference(paymentContentEClass, PAYMENT_CONTENT__PAYMENT_CONTENT_TYPE_ID);
		createEAttribute(paymentContentEClass, PAYMENT_CONTENT__FROM_DATE);
		createEAttribute(paymentContentEClass, PAYMENT_CONTENT__THRU_DATE);

		paymentContentTypeEClass = createEClass(PAYMENT_CONTENT_TYPE);
		createEAttribute(paymentContentTypeEClass, PAYMENT_CONTENT_TYPE__PAYMENT_CONTENT_TYPE_ID);
		createEAttribute(paymentContentTypeEClass, PAYMENT_CONTENT_TYPE__DESCRIPTION);
		createEAttribute(paymentContentTypeEClass, PAYMENT_CONTENT_TYPE__HAS_TABLE);
		createEReference(paymentContentTypeEClass, PAYMENT_CONTENT_TYPE__PARENT_TYPE_ID);

		paymentGatewayAuthorizeNetEClass = createEClass(PAYMENT_GATEWAY_AUTHORIZE_NET);
		createEAttribute(paymentGatewayAuthorizeNetEClass, PAYMENT_GATEWAY_AUTHORIZE_NET__PAYMENT_GATEWAY_CONFIG_ID);
		createEAttribute(paymentGatewayAuthorizeNetEClass, PAYMENT_GATEWAY_AUTHORIZE_NET__API_VERSION);
		createEAttribute(paymentGatewayAuthorizeNetEClass, PAYMENT_GATEWAY_AUTHORIZE_NET__CERTIFICATE_ALIAS);
		createEAttribute(paymentGatewayAuthorizeNetEClass, PAYMENT_GATEWAY_AUTHORIZE_NET__CP_DEVICE_TYPE);
		createEAttribute(paymentGatewayAuthorizeNetEClass, PAYMENT_GATEWAY_AUTHORIZE_NET__CP_MARKET_TYPE);
		createEAttribute(paymentGatewayAuthorizeNetEClass, PAYMENT_GATEWAY_AUTHORIZE_NET__CP_VERSION);
		createEAttribute(paymentGatewayAuthorizeNetEClass, PAYMENT_GATEWAY_AUTHORIZE_NET__DELIMITED_DATA);
		createEAttribute(paymentGatewayAuthorizeNetEClass, PAYMENT_GATEWAY_AUTHORIZE_NET__DELIMITER_CHAR);
		createEAttribute(paymentGatewayAuthorizeNetEClass, PAYMENT_GATEWAY_AUTHORIZE_NET__DUPLICATE_WINDOW);
		createEAttribute(paymentGatewayAuthorizeNetEClass, PAYMENT_GATEWAY_AUTHORIZE_NET__EMAIL_CUSTOMER);
		createEAttribute(paymentGatewayAuthorizeNetEClass, PAYMENT_GATEWAY_AUTHORIZE_NET__EMAIL_MERCHANT);
		createEAttribute(paymentGatewayAuthorizeNetEClass, PAYMENT_GATEWAY_AUTHORIZE_NET__METHOD);
		createEAttribute(paymentGatewayAuthorizeNetEClass, PAYMENT_GATEWAY_AUTHORIZE_NET__PWD);
		createEAttribute(paymentGatewayAuthorizeNetEClass, PAYMENT_GATEWAY_AUTHORIZE_NET__RELAY_RESPONSE);
		createEAttribute(paymentGatewayAuthorizeNetEClass, PAYMENT_GATEWAY_AUTHORIZE_NET__TEST_MODE);
		createEAttribute(paymentGatewayAuthorizeNetEClass, PAYMENT_GATEWAY_AUTHORIZE_NET__TRAN_KEY);
		createEAttribute(paymentGatewayAuthorizeNetEClass, PAYMENT_GATEWAY_AUTHORIZE_NET__TRANS_DESCRIPTION);
		createEAttribute(paymentGatewayAuthorizeNetEClass, PAYMENT_GATEWAY_AUTHORIZE_NET__TRANSACTION_URL);
		createEAttribute(paymentGatewayAuthorizeNetEClass, PAYMENT_GATEWAY_AUTHORIZE_NET__USER_ID);

		paymentGatewayClearCommerceEClass = createEClass(PAYMENT_GATEWAY_CLEAR_COMMERCE);
		createEAttribute(paymentGatewayClearCommerceEClass, PAYMENT_GATEWAY_CLEAR_COMMERCE__PAYMENT_GATEWAY_CONFIG_ID);
		createEAttribute(paymentGatewayClearCommerceEClass, PAYMENT_GATEWAY_CLEAR_COMMERCE__CLIENT_ID);
		createEAttribute(paymentGatewayClearCommerceEClass, PAYMENT_GATEWAY_CLEAR_COMMERCE__EFFECTIVE_ALIAS);
		createEAttribute(paymentGatewayClearCommerceEClass, PAYMENT_GATEWAY_CLEAR_COMMERCE__ENABLE_CVM);
		createEAttribute(paymentGatewayClearCommerceEClass, PAYMENT_GATEWAY_CLEAR_COMMERCE__GROUP_ID);
		createEAttribute(paymentGatewayClearCommerceEClass, PAYMENT_GATEWAY_CLEAR_COMMERCE__PROCESS_MODE);
		createEAttribute(paymentGatewayClearCommerceEClass, PAYMENT_GATEWAY_CLEAR_COMMERCE__PWD);
		createEAttribute(paymentGatewayClearCommerceEClass, PAYMENT_GATEWAY_CLEAR_COMMERCE__SERVER_URL);
		createEAttribute(paymentGatewayClearCommerceEClass, PAYMENT_GATEWAY_CLEAR_COMMERCE__SOURCE_ID);
		createEAttribute(paymentGatewayClearCommerceEClass, PAYMENT_GATEWAY_CLEAR_COMMERCE__USER_ALIAS);
		createEAttribute(paymentGatewayClearCommerceEClass, PAYMENT_GATEWAY_CLEAR_COMMERCE__USERNAME);

		paymentGatewayConfigEClass = createEClass(PAYMENT_GATEWAY_CONFIG);
		createEAttribute(paymentGatewayConfigEClass, PAYMENT_GATEWAY_CONFIG__PAYMENT_GATEWAY_CONFIG_ID);
		createEAttribute(paymentGatewayConfigEClass, PAYMENT_GATEWAY_CONFIG__DESCRIPTION);
		createEReference(paymentGatewayConfigEClass, PAYMENT_GATEWAY_CONFIG__PAYMENT_GATEWAY_CONFIG_TYPE_ID);

		paymentGatewayConfigTypeEClass = createEClass(PAYMENT_GATEWAY_CONFIG_TYPE);
		createEAttribute(paymentGatewayConfigTypeEClass, PAYMENT_GATEWAY_CONFIG_TYPE__PAYMENT_GATEWAY_CONFIG_TYPE_ID);
		createEAttribute(paymentGatewayConfigTypeEClass, PAYMENT_GATEWAY_CONFIG_TYPE__DESCRIPTION);
		createEAttribute(paymentGatewayConfigTypeEClass, PAYMENT_GATEWAY_CONFIG_TYPE__HAS_TABLE);
		createEReference(paymentGatewayConfigTypeEClass, PAYMENT_GATEWAY_CONFIG_TYPE__PARENT_TYPE_ID);

		paymentGatewayCyberSourceEClass = createEClass(PAYMENT_GATEWAY_CYBER_SOURCE);
		createEAttribute(paymentGatewayCyberSourceEClass, PAYMENT_GATEWAY_CYBER_SOURCE__PAYMENT_GATEWAY_CONFIG_ID);
		createEAttribute(paymentGatewayCyberSourceEClass, PAYMENT_GATEWAY_CYBER_SOURCE__API_VERSION);
		createEAttribute(paymentGatewayCyberSourceEClass, PAYMENT_GATEWAY_CYBER_SOURCE__AUTO_BILL);
		createEAttribute(paymentGatewayCyberSourceEClass, PAYMENT_GATEWAY_CYBER_SOURCE__AVS_DECLINE_CODES);
		createEAttribute(paymentGatewayCyberSourceEClass, PAYMENT_GATEWAY_CYBER_SOURCE__DISABLE_BILL_AVS);
		createEAttribute(paymentGatewayCyberSourceEClass, PAYMENT_GATEWAY_CYBER_SOURCE__ENABLE_DAV);
		createEAttribute(paymentGatewayCyberSourceEClass, PAYMENT_GATEWAY_CYBER_SOURCE__FRAUD_SCORE);
		createEAttribute(paymentGatewayCyberSourceEClass, PAYMENT_GATEWAY_CYBER_SOURCE__IGNORE_AVS);
		createEAttribute(paymentGatewayCyberSourceEClass, PAYMENT_GATEWAY_CYBER_SOURCE__KEYS_DIR);
		createEAttribute(paymentGatewayCyberSourceEClass, PAYMENT_GATEWAY_CYBER_SOURCE__KEYS_FILE);
		createEAttribute(paymentGatewayCyberSourceEClass, PAYMENT_GATEWAY_CYBER_SOURCE__LOG_DIR);
		createEAttribute(paymentGatewayCyberSourceEClass, PAYMENT_GATEWAY_CYBER_SOURCE__LOG_ENABLED);
		createEAttribute(paymentGatewayCyberSourceEClass, PAYMENT_GATEWAY_CYBER_SOURCE__LOG_FILE);
		createEAttribute(paymentGatewayCyberSourceEClass, PAYMENT_GATEWAY_CYBER_SOURCE__LOG_SIZE);
		createEAttribute(paymentGatewayCyberSourceEClass, PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_CONTACT);
		createEAttribute(paymentGatewayCyberSourceEClass, PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_DESCR);
		createEAttribute(paymentGatewayCyberSourceEClass, PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_ID);
		createEAttribute(paymentGatewayCyberSourceEClass, PAYMENT_GATEWAY_CYBER_SOURCE__PRODUCTION);

		paymentGatewayEwayEClass = createEClass(PAYMENT_GATEWAY_EWAY);
		createEAttribute(paymentGatewayEwayEClass, PAYMENT_GATEWAY_EWAY__PAYMENT_GATEWAY_CONFIG_ID);
		createEAttribute(paymentGatewayEwayEClass, PAYMENT_GATEWAY_EWAY__CUSTOMER_ID);
		createEAttribute(paymentGatewayEwayEClass, PAYMENT_GATEWAY_EWAY__ENABLE_BEAGLE);
		createEAttribute(paymentGatewayEwayEClass, PAYMENT_GATEWAY_EWAY__ENABLE_CVN);
		createEAttribute(paymentGatewayEwayEClass, PAYMENT_GATEWAY_EWAY__REFUND_PWD);
		createEAttribute(paymentGatewayEwayEClass, PAYMENT_GATEWAY_EWAY__TEST_MODE);

		paymentGatewayOrbitalEClass = createEClass(PAYMENT_GATEWAY_ORBITAL);
		createEAttribute(paymentGatewayOrbitalEClass, PAYMENT_GATEWAY_ORBITAL__PAYMENT_GATEWAY_CONFIG_ID);
		createEAttribute(paymentGatewayOrbitalEClass, PAYMENT_GATEWAY_ORBITAL__AUTHORIZATION_URI);
		createEAttribute(paymentGatewayOrbitalEClass, PAYMENT_GATEWAY_ORBITAL__CONNECTION_PASSWORD);
		createEAttribute(paymentGatewayOrbitalEClass, PAYMENT_GATEWAY_ORBITAL__CONNECTION_TIMEOUT_SECONDS);
		createEAttribute(paymentGatewayOrbitalEClass, PAYMENT_GATEWAY_ORBITAL__ENGINE_CLASS);
		createEAttribute(paymentGatewayOrbitalEClass, PAYMENT_GATEWAY_ORBITAL__HOST_NAME);
		createEAttribute(paymentGatewayOrbitalEClass, PAYMENT_GATEWAY_ORBITAL__HOST_NAME_FAILOVER);
		createEAttribute(paymentGatewayOrbitalEClass, PAYMENT_GATEWAY_ORBITAL__MERCHANT_ID);
		createEAttribute(paymentGatewayOrbitalEClass, PAYMENT_GATEWAY_ORBITAL__PORT);
		createEAttribute(paymentGatewayOrbitalEClass, PAYMENT_GATEWAY_ORBITAL__PORT_FAILOVER);
		createEAttribute(paymentGatewayOrbitalEClass, PAYMENT_GATEWAY_ORBITAL__READ_TIMEOUT_SECONDS);
		createEAttribute(paymentGatewayOrbitalEClass, PAYMENT_GATEWAY_ORBITAL__RESPONSE_TYPE);
		createEAttribute(paymentGatewayOrbitalEClass, PAYMENT_GATEWAY_ORBITAL__SDK_VERSION);
		createEAttribute(paymentGatewayOrbitalEClass, PAYMENT_GATEWAY_ORBITAL__SSL_SOCKET_FACTORY);
		createEAttribute(paymentGatewayOrbitalEClass, PAYMENT_GATEWAY_ORBITAL__USERNAME);

		paymentGatewayPayPalEClass = createEClass(PAYMENT_GATEWAY_PAY_PAL);
		createEAttribute(paymentGatewayPayPalEClass, PAYMENT_GATEWAY_PAY_PAL__PAYMENT_GATEWAY_CONFIG_ID);
		createEAttribute(paymentGatewayPayPalEClass, PAYMENT_GATEWAY_PAY_PAL__API_ENVIRONMENT);
		createEAttribute(paymentGatewayPayPalEClass, PAYMENT_GATEWAY_PAY_PAL__API_PASSWORD);
		createEAttribute(paymentGatewayPayPalEClass, PAYMENT_GATEWAY_PAY_PAL__API_SIGNATURE);
		createEAttribute(paymentGatewayPayPalEClass, PAYMENT_GATEWAY_PAY_PAL__API_USER_NAME);
		createEAttribute(paymentGatewayPayPalEClass, PAYMENT_GATEWAY_PAY_PAL__BUSINESS_EMAIL);
		createEAttribute(paymentGatewayPayPalEClass, PAYMENT_GATEWAY_PAY_PAL__CANCEL_RETURN_URL);
		createEAttribute(paymentGatewayPayPalEClass, PAYMENT_GATEWAY_PAY_PAL__CONFIRM_TEMPLATE);
		createEAttribute(paymentGatewayPayPalEClass, PAYMENT_GATEWAY_PAY_PAL__CONFIRM_URL);
		createEAttribute(paymentGatewayPayPalEClass, PAYMENT_GATEWAY_PAY_PAL__IMAGE_URL);
		createEAttribute(paymentGatewayPayPalEClass, PAYMENT_GATEWAY_PAY_PAL__NOTIFY_URL);
		createEAttribute(paymentGatewayPayPalEClass, PAYMENT_GATEWAY_PAY_PAL__REDIRECT_URL);
		createEAttribute(paymentGatewayPayPalEClass, PAYMENT_GATEWAY_PAY_PAL__REQUIRE_CONFIRMED_SHIPPING);
		createEAttribute(paymentGatewayPayPalEClass, PAYMENT_GATEWAY_PAY_PAL__RETURN_URL);
		createEAttribute(paymentGatewayPayPalEClass, PAYMENT_GATEWAY_PAY_PAL__SHIPPING_CALLBACK_URL);

		paymentGatewayPayflowProEClass = createEClass(PAYMENT_GATEWAY_PAYFLOW_PRO);
		createEAttribute(paymentGatewayPayflowProEClass, PAYMENT_GATEWAY_PAYFLOW_PRO__PAYMENT_GATEWAY_CONFIG_ID);
		createEAttribute(paymentGatewayPayflowProEClass, PAYMENT_GATEWAY_PAYFLOW_PRO__CANCEL_RETURN_URL);
		createEAttribute(paymentGatewayPayflowProEClass, PAYMENT_GATEWAY_PAYFLOW_PRO__CERTS_PATH);
		createEAttribute(paymentGatewayPayflowProEClass, PAYMENT_GATEWAY_PAYFLOW_PRO__CHECK_AVS);
		createEAttribute(paymentGatewayPayflowProEClass, PAYMENT_GATEWAY_PAYFLOW_PRO__CHECK_CVV2);
		createEAttribute(paymentGatewayPayflowProEClass, PAYMENT_GATEWAY_PAYFLOW_PRO__ENABLE_TRANSMIT);
		createEAttribute(paymentGatewayPayflowProEClass, PAYMENT_GATEWAY_PAYFLOW_PRO__HOST_ADDRESS);
		createEAttribute(paymentGatewayPayflowProEClass, PAYMENT_GATEWAY_PAYFLOW_PRO__HOST_PORT);
		createEAttribute(paymentGatewayPayflowProEClass, PAYMENT_GATEWAY_PAYFLOW_PRO__LOG_FILE_NAME);
		createEAttribute(paymentGatewayPayflowProEClass, PAYMENT_GATEWAY_PAYFLOW_PRO__LOGGING_LEVEL);
		createEAttribute(paymentGatewayPayflowProEClass, PAYMENT_GATEWAY_PAYFLOW_PRO__MAX_LOG_FILE_SIZE);
		createEAttribute(paymentGatewayPayflowProEClass, PAYMENT_GATEWAY_PAYFLOW_PRO__PARTNER);
		createEAttribute(paymentGatewayPayflowProEClass, PAYMENT_GATEWAY_PAYFLOW_PRO__PRE_AUTH);
		createEAttribute(paymentGatewayPayflowProEClass, PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_ADDRESS);
		createEAttribute(paymentGatewayPayflowProEClass, PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_LOGON);
		createEAttribute(paymentGatewayPayflowProEClass, PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_PASSWORD);
		createEAttribute(paymentGatewayPayflowProEClass, PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_PORT);
		createEAttribute(paymentGatewayPayflowProEClass, PAYMENT_GATEWAY_PAYFLOW_PRO__PWD);
		createEAttribute(paymentGatewayPayflowProEClass, PAYMENT_GATEWAY_PAYFLOW_PRO__REDIRECT_URL);
		createEAttribute(paymentGatewayPayflowProEClass, PAYMENT_GATEWAY_PAYFLOW_PRO__RETURN_URL);
		createEAttribute(paymentGatewayPayflowProEClass, PAYMENT_GATEWAY_PAYFLOW_PRO__STACK_TRACE_ON);
		createEAttribute(paymentGatewayPayflowProEClass, PAYMENT_GATEWAY_PAYFLOW_PRO__TIMEOUT);
		createEAttribute(paymentGatewayPayflowProEClass, PAYMENT_GATEWAY_PAYFLOW_PRO__USER_ID);
		createEAttribute(paymentGatewayPayflowProEClass, PAYMENT_GATEWAY_PAYFLOW_PRO__VENDOR);

		paymentGatewayRespMsgEClass = createEClass(PAYMENT_GATEWAY_RESP_MSG);
		createEAttribute(paymentGatewayRespMsgEClass, PAYMENT_GATEWAY_RESP_MSG__PAYMENT_GATEWAY_RESP_MSG_ID);
		createEReference(paymentGatewayRespMsgEClass, PAYMENT_GATEWAY_RESP_MSG__PAYMENT_GATEWAY_RESPONSE_ID);
		createEAttribute(paymentGatewayRespMsgEClass, PAYMENT_GATEWAY_RESP_MSG__PGR_MESSAGE);

		paymentGatewayResponseEClass = createEClass(PAYMENT_GATEWAY_RESPONSE);
		createEAttribute(paymentGatewayResponseEClass, PAYMENT_GATEWAY_RESPONSE__PAYMENT_GATEWAY_RESPONSE_ID);
		createEAttribute(paymentGatewayResponseEClass, PAYMENT_GATEWAY_RESPONSE__ALT_REFERENCE);
		createEAttribute(paymentGatewayResponseEClass, PAYMENT_GATEWAY_RESPONSE__AMOUNT);
		createEReference(paymentGatewayResponseEClass, PAYMENT_GATEWAY_RESPONSE__CURRENCY_UOM_ID);
		createEAttribute(paymentGatewayResponseEClass, PAYMENT_GATEWAY_RESPONSE__GATEWAY_AVS_RESULT);
		createEAttribute(paymentGatewayResponseEClass, PAYMENT_GATEWAY_RESPONSE__GATEWAY_CODE);
		createEAttribute(paymentGatewayResponseEClass, PAYMENT_GATEWAY_RESPONSE__GATEWAY_CV_RESULT);
		createEAttribute(paymentGatewayResponseEClass, PAYMENT_GATEWAY_RESPONSE__GATEWAY_FLAG);
		createEAttribute(paymentGatewayResponseEClass, PAYMENT_GATEWAY_RESPONSE__GATEWAY_MESSAGE);
		createEAttribute(paymentGatewayResponseEClass, PAYMENT_GATEWAY_RESPONSE__GATEWAY_SCORE_RESULT);
		createEReference(paymentGatewayResponseEClass, PAYMENT_GATEWAY_RESPONSE__ORDER_PAYMENT_PREFERENCE_ID);
		createEReference(paymentGatewayResponseEClass, PAYMENT_GATEWAY_RESPONSE__PAYMENT_METHOD_ID);
		createEReference(paymentGatewayResponseEClass, PAYMENT_GATEWAY_RESPONSE__PAYMENT_METHOD_TYPE_ID);
		createEReference(paymentGatewayResponseEClass, PAYMENT_GATEWAY_RESPONSE__PAYMENT_SERVICE_TYPE_ENUM_ID);
		createEAttribute(paymentGatewayResponseEClass, PAYMENT_GATEWAY_RESPONSE__REFERENCE_NUM);
		createEAttribute(paymentGatewayResponseEClass, PAYMENT_GATEWAY_RESPONSE__RESULT_BAD_CARD_NUMBER);
		createEAttribute(paymentGatewayResponseEClass, PAYMENT_GATEWAY_RESPONSE__RESULT_BAD_EXPIRE);
		createEAttribute(paymentGatewayResponseEClass, PAYMENT_GATEWAY_RESPONSE__RESULT_DECLINED);
		createEAttribute(paymentGatewayResponseEClass, PAYMENT_GATEWAY_RESPONSE__RESULT_NSF);
		createEAttribute(paymentGatewayResponseEClass, PAYMENT_GATEWAY_RESPONSE__SUB_REFERENCE);
		createEReference(paymentGatewayResponseEClass, PAYMENT_GATEWAY_RESPONSE__TRANS_CODE_ENUM_ID);
		createEAttribute(paymentGatewayResponseEClass, PAYMENT_GATEWAY_RESPONSE__TRANSACTION_DATE);

		paymentGatewaySagePayEClass = createEClass(PAYMENT_GATEWAY_SAGE_PAY);
		createEAttribute(paymentGatewaySagePayEClass, PAYMENT_GATEWAY_SAGE_PAY__PAYMENT_GATEWAY_CONFIG_ID);
		createEAttribute(paymentGatewaySagePayEClass, PAYMENT_GATEWAY_SAGE_PAY__AUTHENTICATION_TRANS_TYPE);
		createEAttribute(paymentGatewaySagePayEClass, PAYMENT_GATEWAY_SAGE_PAY__AUTHENTICATION_URL);
		createEAttribute(paymentGatewaySagePayEClass, PAYMENT_GATEWAY_SAGE_PAY__AUTHORISE_TRANS_TYPE);
		createEAttribute(paymentGatewaySagePayEClass, PAYMENT_GATEWAY_SAGE_PAY__AUTHORISE_URL);
		createEAttribute(paymentGatewaySagePayEClass, PAYMENT_GATEWAY_SAGE_PAY__PRODUCTION_HOST);
		createEAttribute(paymentGatewaySagePayEClass, PAYMENT_GATEWAY_SAGE_PAY__PROTOCOL_VERSION);
		createEAttribute(paymentGatewaySagePayEClass, PAYMENT_GATEWAY_SAGE_PAY__REFUND_URL);
		createEAttribute(paymentGatewaySagePayEClass, PAYMENT_GATEWAY_SAGE_PAY__RELEASE_TRANS_TYPE);
		createEAttribute(paymentGatewaySagePayEClass, PAYMENT_GATEWAY_SAGE_PAY__RELEASE_URL);
		createEAttribute(paymentGatewaySagePayEClass, PAYMENT_GATEWAY_SAGE_PAY__SAGE_PAY_MODE);
		createEAttribute(paymentGatewaySagePayEClass, PAYMENT_GATEWAY_SAGE_PAY__TESTING_HOST);
		createEAttribute(paymentGatewaySagePayEClass, PAYMENT_GATEWAY_SAGE_PAY__VENDOR);
		createEAttribute(paymentGatewaySagePayEClass, PAYMENT_GATEWAY_SAGE_PAY__VOID_URL);

		paymentGatewaySecurePayEClass = createEClass(PAYMENT_GATEWAY_SECURE_PAY);
		createEAttribute(paymentGatewaySecurePayEClass, PAYMENT_GATEWAY_SECURE_PAY__PAYMENT_GATEWAY_CONFIG_ID);
		createEAttribute(paymentGatewaySecurePayEClass, PAYMENT_GATEWAY_SECURE_PAY__ENABLE_AMOUNT_ROUND);
		createEAttribute(paymentGatewaySecurePayEClass, PAYMENT_GATEWAY_SECURE_PAY__MERCHANT_ID);
		createEAttribute(paymentGatewaySecurePayEClass, PAYMENT_GATEWAY_SECURE_PAY__PROCESS_TIMEOUT);
		createEAttribute(paymentGatewaySecurePayEClass, PAYMENT_GATEWAY_SECURE_PAY__PWD);
		createEAttribute(paymentGatewaySecurePayEClass, PAYMENT_GATEWAY_SECURE_PAY__SERVER_URL);

		paymentGatewayWorldPayEClass = createEClass(PAYMENT_GATEWAY_WORLD_PAY);
		createEAttribute(paymentGatewayWorldPayEClass, PAYMENT_GATEWAY_WORLD_PAY__PAYMENT_GATEWAY_CONFIG_ID);
		createEAttribute(paymentGatewayWorldPayEClass, PAYMENT_GATEWAY_WORLD_PAY__AUTH_MODE);
		createEAttribute(paymentGatewayWorldPayEClass, PAYMENT_GATEWAY_WORLD_PAY__FIX_CONTACT);
		createEAttribute(paymentGatewayWorldPayEClass, PAYMENT_GATEWAY_WORLD_PAY__HIDE_CONTACT);
		createEAttribute(paymentGatewayWorldPayEClass, PAYMENT_GATEWAY_WORLD_PAY__HIDE_CURRENCY);
		createEAttribute(paymentGatewayWorldPayEClass, PAYMENT_GATEWAY_WORLD_PAY__INST_ID);
		createEAttribute(paymentGatewayWorldPayEClass, PAYMENT_GATEWAY_WORLD_PAY__LANG_ID);
		createEAttribute(paymentGatewayWorldPayEClass, PAYMENT_GATEWAY_WORLD_PAY__NO_LANGUAGE_MENU);
		createEAttribute(paymentGatewayWorldPayEClass, PAYMENT_GATEWAY_WORLD_PAY__REDIRECT_URL);
		createEAttribute(paymentGatewayWorldPayEClass, PAYMENT_GATEWAY_WORLD_PAY__TEST_MODE);
		createEAttribute(paymentGatewayWorldPayEClass, PAYMENT_GATEWAY_WORLD_PAY__WITH_DELIVERY);

		paymentGlAccountTypeMapEClass = createEClass(PAYMENT_GL_ACCOUNT_TYPE_MAP);
		createEReference(paymentGlAccountTypeMapEClass, PAYMENT_GL_ACCOUNT_TYPE_MAP__PAYMENT_TYPE_ID);
		createEReference(paymentGlAccountTypeMapEClass, PAYMENT_GL_ACCOUNT_TYPE_MAP__ORGANIZATION_PARTY_ID);
		createEReference(paymentGlAccountTypeMapEClass, PAYMENT_GL_ACCOUNT_TYPE_MAP__GL_ACCOUNT_TYPE_ID);

		paymentGroupEClass = createEClass(PAYMENT_GROUP);
		createEAttribute(paymentGroupEClass, PAYMENT_GROUP__PAYMENT_GROUP_ID);
		createEAttribute(paymentGroupEClass, PAYMENT_GROUP__PAYMENT_GROUP_NAME);
		createEReference(paymentGroupEClass, PAYMENT_GROUP__PAYMENT_GROUP_TYPE_ID);

		paymentGroupMemberEClass = createEClass(PAYMENT_GROUP_MEMBER);
		createEReference(paymentGroupMemberEClass, PAYMENT_GROUP_MEMBER__PAYMENT_GROUP_ID);
		createEReference(paymentGroupMemberEClass, PAYMENT_GROUP_MEMBER__PAYMENT_ID);
		createEAttribute(paymentGroupMemberEClass, PAYMENT_GROUP_MEMBER__FROM_DATE);
		createEAttribute(paymentGroupMemberEClass, PAYMENT_GROUP_MEMBER__SEQUENCE_NUM);
		createEAttribute(paymentGroupMemberEClass, PAYMENT_GROUP_MEMBER__THRU_DATE);

		paymentGroupTypeEClass = createEClass(PAYMENT_GROUP_TYPE);
		createEAttribute(paymentGroupTypeEClass, PAYMENT_GROUP_TYPE__PAYMENT_GROUP_TYPE_ID);
		createEAttribute(paymentGroupTypeEClass, PAYMENT_GROUP_TYPE__DESCRIPTION);
		createEAttribute(paymentGroupTypeEClass, PAYMENT_GROUP_TYPE__HAS_TABLE);
		createEReference(paymentGroupTypeEClass, PAYMENT_GROUP_TYPE__PARENT_TYPE_ID);

		paymentMethodEClass = createEClass(PAYMENT_METHOD);
		createEAttribute(paymentMethodEClass, PAYMENT_METHOD__PAYMENT_METHOD_ID);
		createEAttribute(paymentMethodEClass, PAYMENT_METHOD__DESCRIPTION);
		createEReference(paymentMethodEClass, PAYMENT_METHOD__FIN_ACCOUNT_ID);
		createEAttribute(paymentMethodEClass, PAYMENT_METHOD__FROM_DATE);
		createEReference(paymentMethodEClass, PAYMENT_METHOD__GL_ACCOUNT_ID);
		createEReference(paymentMethodEClass, PAYMENT_METHOD__PARTY_ID);
		createEReference(paymentMethodEClass, PAYMENT_METHOD__PAYMENT_METHOD_TYPE_ID);
		createEAttribute(paymentMethodEClass, PAYMENT_METHOD__THRU_DATE);

		paymentMethodTypeEClass = createEClass(PAYMENT_METHOD_TYPE);
		createEAttribute(paymentMethodTypeEClass, PAYMENT_METHOD_TYPE__PAYMENT_METHOD_TYPE_ID);
		createEReference(paymentMethodTypeEClass, PAYMENT_METHOD_TYPE__DEFAULT_GL_ACCOUNT_ID);
		createEAttribute(paymentMethodTypeEClass, PAYMENT_METHOD_TYPE__DESCRIPTION);
		createEReference(paymentMethodTypeEClass, PAYMENT_METHOD_TYPE__PAYMENT_METHOD_TYPE_GL_ACCOUNTS);

		paymentMethodTypeGlAccountEClass = createEClass(PAYMENT_METHOD_TYPE_GL_ACCOUNT);
		createEReference(paymentMethodTypeGlAccountEClass, PAYMENT_METHOD_TYPE_GL_ACCOUNT__PAYMENT_METHOD_TYPE_ID);
		createEReference(paymentMethodTypeGlAccountEClass, PAYMENT_METHOD_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY_ID);
		createEReference(paymentMethodTypeGlAccountEClass, PAYMENT_METHOD_TYPE_GL_ACCOUNT__GL_ACCOUNT_ID);

		paymentTypeEClass = createEClass(PAYMENT_TYPE);
		createEAttribute(paymentTypeEClass, PAYMENT_TYPE__PAYMENT_TYPE_ID);
		createEAttribute(paymentTypeEClass, PAYMENT_TYPE__DESCRIPTION);
		createEAttribute(paymentTypeEClass, PAYMENT_TYPE__HAS_TABLE);
		createEReference(paymentTypeEClass, PAYMENT_TYPE__PARENT_TYPE_ID);
		createEReference(paymentTypeEClass, PAYMENT_TYPE__PAYMENT_GL_ACCOUNT_TYPE_MAPS);
		createEReference(paymentTypeEClass, PAYMENT_TYPE__PAYMENT_TYPE_ATTRS);

		paymentTypeAttrEClass = createEClass(PAYMENT_TYPE_ATTR);
		createEReference(paymentTypeAttrEClass, PAYMENT_TYPE_ATTR__PAYMENT_TYPE_ID);
		createEAttribute(paymentTypeAttrEClass, PAYMENT_TYPE_ATTR__ATTR_NAME);
		createEAttribute(paymentTypeAttrEClass, PAYMENT_TYPE_ATTR__DESCRIPTION);

		valueLinkKeyEClass = createEClass(VALUE_LINK_KEY);
		createEAttribute(valueLinkKeyEClass, VALUE_LINK_KEY__MERCHANT_ID);
		createEAttribute(valueLinkKeyEClass, VALUE_LINK_KEY__CREATED_BY_TERMINAL);
		createEAttribute(valueLinkKeyEClass, VALUE_LINK_KEY__CREATED_BY_USER_LOGIN);
		createEAttribute(valueLinkKeyEClass, VALUE_LINK_KEY__CREATED_DATE);
		createEAttribute(valueLinkKeyEClass, VALUE_LINK_KEY__EXCHANGE_KEY);
		createEAttribute(valueLinkKeyEClass, VALUE_LINK_KEY__LAST_MODIFIED_BY_TERMINAL);
		createEAttribute(valueLinkKeyEClass, VALUE_LINK_KEY__LAST_MODIFIED_BY_USER_LOGIN);
		createEAttribute(valueLinkKeyEClass, VALUE_LINK_KEY__LAST_MODIFIED_DATE);
		createEAttribute(valueLinkKeyEClass, VALUE_LINK_KEY__LAST_WORKING_KEY);
		createEAttribute(valueLinkKeyEClass, VALUE_LINK_KEY__PRIVATE_KEY);
		createEAttribute(valueLinkKeyEClass, VALUE_LINK_KEY__PUBLIC_KEY);
		createEAttribute(valueLinkKeyEClass, VALUE_LINK_KEY__WORKING_KEY);
		createEAttribute(valueLinkKeyEClass, VALUE_LINK_KEY__WORKING_KEY_INDEX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BizPackage theBizPackage = (BizPackage)EPackage.Registry.INSTANCE.getEPackage(BizPackage.eNS_URI);
		UomPackage theUomPackage = (UomPackage)EPackage.Registry.INSTANCE.getEPackage(UomPackage.eNS_URI);
		org.abchip.mimo.biz.party.contact.ContactPackage theContactPackage_1 = (org.abchip.mimo.biz.party.contact.ContactPackage)EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.party.contact.ContactPackage.eNS_URI);
		PartyPackage thePartyPackage_1 = (PartyPackage)EPackage.Registry.INSTANCE.getEPackage(PartyPackage.eNS_URI);
		AgreementPackage theAgreementPackage = (AgreementPackage)EPackage.Registry.INSTANCE.getEPackage(AgreementPackage.eNS_URI);
		OrderPackage theOrderPackage = (OrderPackage)EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI);
		SurveyPackage theSurveyPackage = (SurveyPackage)EPackage.Registry.INSTANCE.getEPackage(SurveyPackage.eNS_URI);
		EnumPackage theEnumPackage = (EnumPackage)EPackage.Registry.INSTANCE.getEPackage(EnumPackage.eNS_URI);
		FinaccountPackage theFinaccountPackage = (FinaccountPackage)EPackage.Registry.INSTANCE.getEPackage(FinaccountPackage.eNS_URI);
		LedgerPackage theLedgerPackage = (LedgerPackage)EPackage.Registry.INSTANCE.getEPackage(LedgerPackage.eNS_URI);
		StatusPackage theStatusPackage = (StatusPackage)EPackage.Registry.INSTANCE.getEPackage(StatusPackage.eNS_URI);
		InvoicePackage theInvoicePackage = (InvoicePackage)EPackage.Registry.INSTANCE.getEPackage(InvoicePackage.eNS_URI);
		GeoPackage theGeoPackage = (GeoPackage)EPackage.Registry.INSTANCE.getEPackage(GeoPackage.eNS_URI);
		BudgetPackage theBudgetPackage = (BudgetPackage)EPackage.Registry.INSTANCE.getEPackage(BudgetPackage.eNS_URI);
		ContentPackage theContentPackage = (ContentPackage)EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);
		AccountingPackage theAccountingPackage = (AccountingPackage)EPackage.Registry.INSTANCE.getEPackage(AccountingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		billingAccountEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		billingAccountRoleEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		billingAccountTermEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		billingAccountTermAttrEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		checkAccountEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		creditCardEClass.getESuperTypes().add(this.getPaymentMethod());
		creditCardTypeGlAccountEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		EGenericType g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		EGenericType g2 = createEGenericType(this.getDeductionType());
		g1.getETypeArguments().add(g2);
		deductionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getDeduction());
		g1.getETypeArguments().add(g2);
		deductionTypeEClass.getEGenericSuperTypes().add(g1);
		eftAccountEClass.getESuperTypes().add(this.getPaymentMethod());
		giftCardEClass.getESuperTypes().add(this.getPaymentMethod());
		giftCardFulfillmentEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		payPalPaymentMethodEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getPaymentType());
		g1.getETypeArguments().add(g2);
		paymentEClass.getEGenericSuperTypes().add(g1);
		paymentApplicationEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		paymentAttributeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		paymentBudgetAllocationEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getPaymentContentType());
		g1.getETypeArguments().add(g2);
		paymentContentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getPaymentContent());
		g1.getETypeArguments().add(g2);
		paymentContentTypeEClass.getEGenericSuperTypes().add(g1);
		paymentGatewayAuthorizeNetEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		paymentGatewayClearCommerceEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getPaymentGatewayConfigType());
		g1.getETypeArguments().add(g2);
		paymentGatewayConfigEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getPaymentGatewayConfig());
		g1.getETypeArguments().add(g2);
		paymentGatewayConfigTypeEClass.getEGenericSuperTypes().add(g1);
		paymentGatewayCyberSourceEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		paymentGatewayEwayEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		paymentGatewayOrbitalEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		paymentGatewayPayPalEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		paymentGatewayPayflowProEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		paymentGatewayRespMsgEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		paymentGatewayResponseEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		paymentGatewaySagePayEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		paymentGatewaySecurePayEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		paymentGatewayWorldPayEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		paymentGlAccountTypeMapEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getPaymentGroupType());
		g1.getETypeArguments().add(g2);
		paymentGroupEClass.getEGenericSuperTypes().add(g1);
		paymentGroupMemberEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getPaymentGroup());
		g1.getETypeArguments().add(g2);
		paymentGroupTypeEClass.getEGenericSuperTypes().add(g1);
		paymentMethodEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		paymentMethodTypeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		paymentMethodTypeGlAccountEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getPayment());
		g1.getETypeArguments().add(g2);
		paymentTypeEClass.getEGenericSuperTypes().add(g1);
		paymentTypeAttrEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		valueLinkKeyEClass.getESuperTypes().add(theBizPackage.getBizEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(billingAccountEClass, BillingAccount.class, "BillingAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBillingAccount_BillingAccountId(), ecorePackage.getEString(), "billingAccountId", null, 1, 1, BillingAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBillingAccount_AccountCurrencyUomId(), theUomPackage.getUom(), null, "accountCurrencyUomId", null, 0, 1, BillingAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getBillingAccount_AccountCurrencyUomId().getEKeys().add(theUomPackage.getUom_UomId());
		initEAttribute(getBillingAccount_AccountLimit(), ecorePackage.getEBigDecimal(), "accountLimit", null, 0, 1, BillingAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBillingAccount_ContactMechId(), theContactPackage_1.getContactMech(), null, "contactMechId", null, 0, 1, BillingAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getBillingAccount_ContactMechId().getEKeys().add(theContactPackage_1.getContactMech_ContactMechId());
		initEAttribute(getBillingAccount_Description(), ecorePackage.getEString(), "description", null, 0, 1, BillingAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBillingAccount_ExternalAccountId(), ecorePackage.getEString(), "externalAccountId", null, 0, 1, BillingAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBillingAccount_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, BillingAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBillingAccount_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, BillingAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(billingAccountRoleEClass, BillingAccountRole.class, "BillingAccountRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBillingAccountRole_BillingAccountId(), this.getBillingAccount(), null, "billingAccountId", null, 1, 1, BillingAccountRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getBillingAccountRole_BillingAccountId().getEKeys().add(this.getBillingAccount_BillingAccountId());
		initEReference(getBillingAccountRole_PartyId(), thePartyPackage_1.getParty(), null, "partyId", null, 1, 1, BillingAccountRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getBillingAccountRole_PartyId().getEKeys().add(thePartyPackage_1.getParty_PartyId());
		initEReference(getBillingAccountRole_RoleTypeId(), thePartyPackage_1.getRoleType(), null, "roleTypeId", null, 1, 1, BillingAccountRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getBillingAccountRole_RoleTypeId().getEKeys().add(thePartyPackage_1.getRoleType_RoleTypeId());
		initEAttribute(getBillingAccountRole_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, BillingAccountRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBillingAccountRole_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, BillingAccountRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(billingAccountTermEClass, BillingAccountTerm.class, "BillingAccountTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBillingAccountTerm_BillingAccountTermId(), ecorePackage.getEString(), "billingAccountTermId", null, 1, 1, BillingAccountTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBillingAccountTerm_BillingAccountId(), this.getBillingAccount(), null, "billingAccountId", null, 0, 1, BillingAccountTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getBillingAccountTerm_BillingAccountId().getEKeys().add(this.getBillingAccount_BillingAccountId());
		initEReference(getBillingAccountTerm_BillingAccountTermAttrs(), this.getBillingAccountTermAttr(), null, "billingAccountTermAttrs", null, 0, -1, BillingAccountTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getBillingAccountTerm_TermDays(), ecorePackage.getELong(), "termDays", null, 0, 1, BillingAccountTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBillingAccountTerm_TermTypeId(), theAgreementPackage.getTermType(), null, "termTypeId", null, 0, 1, BillingAccountTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getBillingAccountTerm_TermTypeId().getEKeys().add(theAgreementPackage.getTermType_TermTypeId());
		initEAttribute(getBillingAccountTerm_TermValue(), ecorePackage.getEBigDecimal(), "termValue", null, 0, 1, BillingAccountTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBillingAccountTerm_UomId(), theUomPackage.getUom(), null, "uomId", null, 0, 1, BillingAccountTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getBillingAccountTerm_UomId().getEKeys().add(theUomPackage.getUom_UomId());

		initEClass(billingAccountTermAttrEClass, BillingAccountTermAttr.class, "BillingAccountTermAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBillingAccountTermAttr_BillingAccountTermId(), this.getBillingAccountTerm(), null, "billingAccountTermId", null, 1, 1, BillingAccountTermAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getBillingAccountTermAttr_BillingAccountTermId().getEKeys().add(this.getBillingAccountTerm_BillingAccountTermId());
		initEAttribute(getBillingAccountTermAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, BillingAccountTermAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBillingAccountTermAttr_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, BillingAccountTermAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkAccountEClass, CheckAccount.class, "CheckAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckAccount_PaymentMethodId(), ecorePackage.getEString(), "paymentMethodId", null, 1, 1, CheckAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckAccount_AccountNumber(), ecorePackage.getEString(), "accountNumber", null, 0, 1, CheckAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckAccount_AccountType(), ecorePackage.getEString(), "accountType", null, 0, 1, CheckAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckAccount_BankName(), ecorePackage.getEString(), "bankName", null, 0, 1, CheckAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckAccount_BranchCode(), ecorePackage.getEString(), "branchCode", null, 0, 1, CheckAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckAccount_CompanyNameOnAccount(), ecorePackage.getEString(), "companyNameOnAccount", null, 0, 1, CheckAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheckAccount_ContactMechId(), theContactPackage_1.getContactMech(), null, "contactMechId", null, 0, 1, CheckAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCheckAccount_ContactMechId().getEKeys().add(theContactPackage_1.getContactMech_ContactMechId());
		initEAttribute(getCheckAccount_NameOnAccount(), ecorePackage.getEString(), "nameOnAccount", null, 0, 1, CheckAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckAccount_RoutingNumber(), ecorePackage.getEString(), "routingNumber", null, 0, 1, CheckAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(creditCardEClass, CreditCard.class, "CreditCard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreditCard_CardNumber(), ecorePackage.getEString(), "cardNumber", null, 0, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreditCard_CardType(), ecorePackage.getEString(), "cardType", null, 0, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreditCard_CompanyNameOnCard(), ecorePackage.getEString(), "companyNameOnCard", null, 0, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreditCard_ConsecutiveFailedAuths(), ecorePackage.getELong(), "consecutiveFailedAuths", null, 0, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreditCard_ConsecutiveFailedNsf(), ecorePackage.getELong(), "consecutiveFailedNsf", null, 0, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreditCard_ContactMechId(), theContactPackage_1.getContactMech(), null, "contactMechId", null, 0, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCreditCard_ContactMechId().getEKeys().add(theContactPackage_1.getContactMech_ContactMechId());
		initEAttribute(getCreditCard_ExpireDate(), ecorePackage.getEString(), "expireDate", null, 0, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreditCard_FirstNameOnCard(), ecorePackage.getEString(), "firstNameOnCard", null, 0, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreditCard_IssueNumber(), ecorePackage.getEString(), "issueNumber", null, 0, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreditCard_LastFailedAuthDate(), ecorePackage.getEDate(), "lastFailedAuthDate", null, 0, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreditCard_LastFailedNsfDate(), ecorePackage.getEDate(), "lastFailedNsfDate", null, 0, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreditCard_LastNameOnCard(), ecorePackage.getEString(), "lastNameOnCard", null, 0, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreditCard_MiddleNameOnCard(), ecorePackage.getEString(), "middleNameOnCard", null, 0, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreditCard_SuffixOnCard(), ecorePackage.getEString(), "suffixOnCard", null, 0, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreditCard_TitleOnCard(), ecorePackage.getEString(), "titleOnCard", null, 0, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreditCard_ValidFromDate(), ecorePackage.getEString(), "validFromDate", null, 0, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(creditCardTypeGlAccountEClass, CreditCardTypeGlAccount.class, "CreditCardTypeGlAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreditCardTypeGlAccount_CardType(), ecorePackage.getEString(), "cardType", null, 1, 1, CreditCardTypeGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreditCardTypeGlAccount_OrganizationPartyId(), ecorePackage.getEString(), "organizationPartyId", null, 1, 1, CreditCardTypeGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreditCardTypeGlAccount_GlAccountId(), ecorePackage.getEString(), "glAccountId", null, 0, 1, CreditCardTypeGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deductionEClass, Deduction.class, "Deduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeduction_DeductionId(), ecorePackage.getEString(), "deductionId", null, 1, 1, Deduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeduction_Amount(), ecorePackage.getEBigDecimal(), "amount", null, 0, 1, Deduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeduction_DeductionTypeId(), this.getDeductionType(), null, "deductionTypeId", null, 0, 1, Deduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getDeduction_DeductionTypeId().getEKeys().add(this.getDeductionType_DeductionTypeId());
		initEReference(getDeduction_PaymentId(), this.getPayment(), null, "paymentId", null, 0, 1, Deduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getDeduction_PaymentId().getEKeys().add(this.getPayment_PaymentId());

		initEClass(deductionTypeEClass, DeductionType.class, "DeductionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeductionType_DeductionTypeId(), ecorePackage.getEString(), "deductionTypeId", null, 1, 1, DeductionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeductionType_Description(), ecorePackage.getEString(), "description", null, 0, 1, DeductionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeductionType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, DeductionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeductionType_ParentTypeId(), this.getDeductionType(), null, "parentTypeId", null, 0, 1, DeductionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getDeductionType_ParentTypeId().getEKeys().add(this.getDeductionType_DeductionTypeId());

		initEClass(eftAccountEClass, EftAccount.class, "EftAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEftAccount_AccountNumber(), ecorePackage.getEString(), "accountNumber", null, 0, 1, EftAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEftAccount_AccountType(), ecorePackage.getEString(), "accountType", null, 0, 1, EftAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEftAccount_BankName(), ecorePackage.getEString(), "bankName", null, 0, 1, EftAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEftAccount_CompanyNameOnAccount(), ecorePackage.getEString(), "companyNameOnAccount", null, 0, 1, EftAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEftAccount_ContactMechId(), theContactPackage_1.getContactMech(), null, "contactMechId", null, 0, 1, EftAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getEftAccount_ContactMechId().getEKeys().add(theContactPackage_1.getContactMech_ContactMechId());
		initEAttribute(getEftAccount_NameOnAccount(), ecorePackage.getEString(), "nameOnAccount", null, 0, 1, EftAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEftAccount_RoutingNumber(), ecorePackage.getEString(), "routingNumber", null, 0, 1, EftAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEftAccount_YearsAtBank(), ecorePackage.getELong(), "yearsAtBank", null, 0, 1, EftAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(giftCardEClass, GiftCard.class, "GiftCard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGiftCard_CardNumber(), ecorePackage.getEString(), "cardNumber", null, 0, 1, GiftCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGiftCard_ContactMechId(), theContactPackage_1.getContactMech(), null, "contactMechId", null, 0, 1, GiftCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGiftCard_ContactMechId().getEKeys().add(theContactPackage_1.getContactMech_ContactMechId());
		initEAttribute(getGiftCard_ExpireDate(), ecorePackage.getEString(), "expireDate", null, 0, 1, GiftCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGiftCard_PinNumber(), ecorePackage.getEString(), "pinNumber", null, 0, 1, GiftCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(giftCardFulfillmentEClass, GiftCardFulfillment.class, "GiftCardFulfillment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGiftCardFulfillment_FulfillmentId(), ecorePackage.getEString(), "fulfillmentId", null, 1, 1, GiftCardFulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGiftCardFulfillment_Amount(), ecorePackage.getEBigDecimal(), "amount", null, 0, 1, GiftCardFulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGiftCardFulfillment_AuthCode(), ecorePackage.getEString(), "authCode", null, 0, 1, GiftCardFulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGiftCardFulfillment_CardNumber(), ecorePackage.getEString(), "cardNumber", null, 0, 1, GiftCardFulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGiftCardFulfillment_FulfillmentDate(), ecorePackage.getEDate(), "fulfillmentDate", null, 0, 1, GiftCardFulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGiftCardFulfillment_MerchantId(), ecorePackage.getEString(), "merchantId", null, 0, 1, GiftCardFulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGiftCardFulfillment_OrderId(), theOrderPackage.getOrderHeader(), null, "orderId", null, 0, 1, GiftCardFulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGiftCardFulfillment_OrderId().getEKeys().add(theOrderPackage.getOrderHeader_OrderId());
		initEAttribute(getGiftCardFulfillment_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, GiftCardFulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGiftCardFulfillment_PartyId(), thePartyPackage_1.getParty(), null, "partyId", null, 0, 1, GiftCardFulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGiftCardFulfillment_PartyId().getEKeys().add(thePartyPackage_1.getParty_PartyId());
		initEAttribute(getGiftCardFulfillment_PinNumber(), ecorePackage.getEString(), "pinNumber", null, 0, 1, GiftCardFulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGiftCardFulfillment_ReferenceNum(), ecorePackage.getEString(), "referenceNum", null, 0, 1, GiftCardFulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGiftCardFulfillment_ResponseCode(), ecorePackage.getEString(), "responseCode", null, 0, 1, GiftCardFulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGiftCardFulfillment_SurveyResponseId(), theSurveyPackage.getSurveyResponse(), null, "surveyResponseId", null, 0, 1, GiftCardFulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGiftCardFulfillment_SurveyResponseId().getEKeys().add(theSurveyPackage.getSurveyResponse_SurveyResponseId());
		initEReference(getGiftCardFulfillment_TypeEnumId(), theEnumPackage.getEnumeration(), null, "typeEnumId", null, 0, 1, GiftCardFulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGiftCardFulfillment_TypeEnumId().getEKeys().add(theEnumPackage.getEnumeration_EnumId());

		initEClass(payPalPaymentMethodEClass, PayPalPaymentMethod.class, "PayPalPaymentMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPayPalPaymentMethod_PaymentMethodId(), ecorePackage.getEString(), "paymentMethodId", null, 1, 1, PayPalPaymentMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayPalPaymentMethod_AvsAddr(), ecorePackage.getEBoolean(), "avsAddr", null, 0, 1, PayPalPaymentMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayPalPaymentMethod_AvsZip(), ecorePackage.getEBoolean(), "avsZip", null, 0, 1, PayPalPaymentMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPayPalPaymentMethod_ContactMechId(), theContactPackage_1.getContactMech(), null, "contactMechId", null, 0, 1, PayPalPaymentMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPayPalPaymentMethod_ContactMechId().getEKeys().add(theContactPackage_1.getContactMech_ContactMechId());
		initEAttribute(getPayPalPaymentMethod_CorrelationId(), ecorePackage.getEString(), "correlationId", null, 0, 1, PayPalPaymentMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayPalPaymentMethod_ExpressCheckoutToken(), ecorePackage.getEString(), "expressCheckoutToken", null, 0, 1, PayPalPaymentMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayPalPaymentMethod_PayerId(), ecorePackage.getEString(), "payerId", null, 0, 1, PayPalPaymentMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayPalPaymentMethod_PayerStatus(), ecorePackage.getEString(), "payerStatus", null, 0, 1, PayPalPaymentMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayPalPaymentMethod_TransactionId(), ecorePackage.getEString(), "transactionId", null, 0, 1, PayPalPaymentMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paymentEClass, Payment.class, "Payment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPayment_PaymentId(), ecorePackage.getEString(), "paymentId", null, 1, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayment_ActualCurrencyAmount(), ecorePackage.getEBigDecimal(), "actualCurrencyAmount", null, 0, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPayment_ActualCurrencyUomId(), theUomPackage.getUom(), null, "actualCurrencyUomId", null, 0, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPayment_ActualCurrencyUomId().getEKeys().add(theUomPackage.getUom_UomId());
		initEAttribute(getPayment_Amount(), ecorePackage.getEBigDecimal(), "amount", null, 0, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayment_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPayment_CurrencyUomId(), theUomPackage.getUom(), null, "currencyUomId", null, 0, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPayment_CurrencyUomId().getEKeys().add(theUomPackage.getUom_UomId());
		initEAttribute(getPayment_EffectiveDate(), ecorePackage.getEDate(), "effectiveDate", null, 0, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPayment_FinAccountTransId(), theFinaccountPackage.getFinAccountTrans(), null, "finAccountTransId", null, 0, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPayment_FinAccountTransId().getEKeys().add(theFinaccountPackage.getFinAccountTrans_FinAccountTransId());
		initEReference(getPayment_OverrideGlAccountId(), theLedgerPackage.getGlAccount(), null, "overrideGlAccountId", null, 0, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPayment_OverrideGlAccountId().getEKeys().add(theLedgerPackage.getGlAccount_GlAccountId());
		initEReference(getPayment_PartyIdFrom(), thePartyPackage_1.getParty(), null, "partyIdFrom", null, 0, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPayment_PartyIdFrom().getEKeys().add(thePartyPackage_1.getParty_PartyId());
		initEReference(getPayment_PartyIdTo(), thePartyPackage_1.getParty(), null, "partyIdTo", null, 0, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPayment_PartyIdTo().getEKeys().add(thePartyPackage_1.getParty_PartyId());
		initEReference(getPayment_PaymentAttributes(), this.getPaymentAttribute(), null, "paymentAttributes", null, 0, -1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPayment_PaymentGatewayResponseId(), this.getPaymentGatewayResponse(), null, "paymentGatewayResponseId", null, 0, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPayment_PaymentGatewayResponseId().getEKeys().add(this.getPaymentGatewayResponse_PaymentGatewayResponseId());
		initEReference(getPayment_PaymentMethodId(), this.getPaymentMethod(), null, "paymentMethodId", null, 0, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPayment_PaymentMethodId().getEKeys().add(this.getPaymentMethod_PaymentMethodId());
		initEReference(getPayment_PaymentMethodTypeId(), this.getPaymentMethodType(), null, "paymentMethodTypeId", null, 0, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPayment_PaymentMethodTypeId().getEKeys().add(this.getPaymentMethodType_PaymentMethodTypeId());
		initEReference(getPayment_PaymentPreferenceId(), theOrderPackage.getOrderPaymentPreference(), null, "paymentPreferenceId", null, 0, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPayment_PaymentPreferenceId().getEKeys().add(theOrderPackage.getOrderPaymentPreference_OrderPaymentPreferenceId());
		initEAttribute(getPayment_PaymentRefNum(), ecorePackage.getEString(), "paymentRefNum", null, 0, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPayment_PaymentTypeId(), this.getPaymentType(), null, "paymentTypeId", null, 0, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPayment_PaymentTypeId().getEKeys().add(this.getPaymentType_PaymentTypeId());
		initEReference(getPayment_RoleTypeIdTo(), thePartyPackage_1.getRoleType(), null, "roleTypeIdTo", null, 0, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPayment_RoleTypeIdTo().getEKeys().add(thePartyPackage_1.getRoleType_RoleTypeId());
		initEReference(getPayment_StatusId(), theStatusPackage.getStatusItem(), null, "statusId", null, 0, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPayment_StatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());

		initEClass(paymentApplicationEClass, PaymentApplication.class, "PaymentApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentApplication_PaymentApplicationId(), ecorePackage.getEString(), "paymentApplicationId", null, 1, 1, PaymentApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentApplication_AmountApplied(), ecorePackage.getEBigDecimal(), "amountApplied", null, 0, 1, PaymentApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaymentApplication_BillingAccountId(), this.getBillingAccount(), null, "billingAccountId", null, 0, 1, PaymentApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentApplication_BillingAccountId().getEKeys().add(this.getBillingAccount_BillingAccountId());
		initEReference(getPaymentApplication_InvoiceId(), theInvoicePackage.getInvoice(), null, "invoiceId", null, 0, 1, PaymentApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentApplication_InvoiceId().getEKeys().add(theInvoicePackage.getInvoice_InvoiceId());
		initEAttribute(getPaymentApplication_InvoiceItemSeqId(), ecorePackage.getEString(), "invoiceItemSeqId", null, 0, 1, PaymentApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaymentApplication_OverrideGlAccountId(), theLedgerPackage.getGlAccount(), null, "overrideGlAccountId", null, 0, 1, PaymentApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentApplication_OverrideGlAccountId().getEKeys().add(theLedgerPackage.getGlAccount_GlAccountId());
		initEReference(getPaymentApplication_PaymentId(), this.getPayment(), null, "paymentId", null, 0, 1, PaymentApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentApplication_PaymentId().getEKeys().add(this.getPayment_PaymentId());
		initEReference(getPaymentApplication_TaxAuthGeoId(), theGeoPackage.getGeo(), null, "taxAuthGeoId", null, 0, 1, PaymentApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentApplication_TaxAuthGeoId().getEKeys().add(theGeoPackage.getGeo_GeoId());
		initEReference(getPaymentApplication_ToPaymentId(), this.getPayment(), null, "toPaymentId", null, 0, 1, PaymentApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentApplication_ToPaymentId().getEKeys().add(this.getPayment_PaymentId());

		initEClass(paymentAttributeEClass, PaymentAttribute.class, "PaymentAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPaymentAttribute_PaymentId(), this.getPayment(), null, "paymentId", null, 1, 1, PaymentAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentAttribute_PaymentId().getEKeys().add(this.getPayment_PaymentId());
		initEAttribute(getPaymentAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, PaymentAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, PaymentAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, PaymentAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paymentBudgetAllocationEClass, PaymentBudgetAllocation.class, "PaymentBudgetAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPaymentBudgetAllocation_BudgetId(), theBudgetPackage.getBudget(), null, "budgetId", null, 1, 1, PaymentBudgetAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentBudgetAllocation_BudgetId().getEKeys().add(theBudgetPackage.getBudget_BudgetId());
		initEReference(getPaymentBudgetAllocation_PaymentId(), this.getPayment(), null, "paymentId", null, 1, 1, PaymentBudgetAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentBudgetAllocation_PaymentId().getEKeys().add(this.getPayment_PaymentId());
		initEAttribute(getPaymentBudgetAllocation_BudgetItemSeqId(), ecorePackage.getEString(), "budgetItemSeqId", null, 1, 1, PaymentBudgetAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentBudgetAllocation_Amount(), ecorePackage.getEBigDecimal(), "amount", null, 0, 1, PaymentBudgetAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paymentContentEClass, PaymentContent.class, "PaymentContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPaymentContent_PaymentId(), this.getPayment(), null, "paymentId", null, 1, 1, PaymentContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentContent_PaymentId().getEKeys().add(this.getPayment_PaymentId());
		initEReference(getPaymentContent_ContentId(), theContentPackage.getContent(), null, "contentId", null, 1, 1, PaymentContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentContent_ContentId().getEKeys().add(theContentPackage.getContent_ContentId());
		initEReference(getPaymentContent_PaymentContentTypeId(), this.getPaymentContentType(), null, "paymentContentTypeId", null, 1, 1, PaymentContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentContent_PaymentContentTypeId().getEKeys().add(this.getPaymentContentType_PaymentContentTypeId());
		initEAttribute(getPaymentContent_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, PaymentContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentContent_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, PaymentContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paymentContentTypeEClass, PaymentContentType.class, "PaymentContentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentContentType_PaymentContentTypeId(), ecorePackage.getEString(), "paymentContentTypeId", null, 1, 1, PaymentContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentContentType_Description(), ecorePackage.getEString(), "description", null, 0, 1, PaymentContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentContentType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, PaymentContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaymentContentType_ParentTypeId(), this.getPaymentContentType(), null, "parentTypeId", null, 0, 1, PaymentContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentContentType_ParentTypeId().getEKeys().add(this.getPaymentContentType_PaymentContentTypeId());

		initEClass(paymentGatewayAuthorizeNetEClass, PaymentGatewayAuthorizeNet.class, "PaymentGatewayAuthorizeNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentGatewayAuthorizeNet_PaymentGatewayConfigId(), ecorePackage.getEString(), "paymentGatewayConfigId", null, 1, 1, PaymentGatewayAuthorizeNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayAuthorizeNet_ApiVersion(), ecorePackage.getEString(), "apiVersion", null, 0, 1, PaymentGatewayAuthorizeNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayAuthorizeNet_CertificateAlias(), ecorePackage.getEString(), "certificateAlias", null, 0, 1, PaymentGatewayAuthorizeNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayAuthorizeNet_CpDeviceType(), ecorePackage.getEString(), "cpDeviceType", null, 0, 1, PaymentGatewayAuthorizeNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayAuthorizeNet_CpMarketType(), ecorePackage.getEString(), "cpMarketType", null, 0, 1, PaymentGatewayAuthorizeNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayAuthorizeNet_CpVersion(), ecorePackage.getEString(), "cpVersion", null, 0, 1, PaymentGatewayAuthorizeNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayAuthorizeNet_DelimitedData(), ecorePackage.getEString(), "delimitedData", null, 0, 1, PaymentGatewayAuthorizeNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayAuthorizeNet_DelimiterChar(), ecorePackage.getEString(), "delimiterChar", null, 0, 1, PaymentGatewayAuthorizeNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayAuthorizeNet_DuplicateWindow(), ecorePackage.getELong(), "duplicateWindow", null, 0, 1, PaymentGatewayAuthorizeNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayAuthorizeNet_EmailCustomer(), ecorePackage.getEString(), "emailCustomer", null, 0, 1, PaymentGatewayAuthorizeNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayAuthorizeNet_EmailMerchant(), ecorePackage.getEString(), "emailMerchant", null, 0, 1, PaymentGatewayAuthorizeNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayAuthorizeNet_Method(), ecorePackage.getEString(), "method", null, 0, 1, PaymentGatewayAuthorizeNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayAuthorizeNet_Pwd(), ecorePackage.getEString(), "pwd", null, 0, 1, PaymentGatewayAuthorizeNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayAuthorizeNet_RelayResponse(), ecorePackage.getEString(), "relayResponse", null, 0, 1, PaymentGatewayAuthorizeNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayAuthorizeNet_TestMode(), ecorePackage.getEString(), "testMode", null, 0, 1, PaymentGatewayAuthorizeNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayAuthorizeNet_TranKey(), ecorePackage.getEString(), "tranKey", null, 0, 1, PaymentGatewayAuthorizeNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayAuthorizeNet_TransDescription(), ecorePackage.getEString(), "transDescription", null, 0, 1, PaymentGatewayAuthorizeNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayAuthorizeNet_TransactionUrl(), ecorePackage.getEString(), "transactionUrl", null, 0, 1, PaymentGatewayAuthorizeNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayAuthorizeNet_UserId(), ecorePackage.getEString(), "userId", null, 0, 1, PaymentGatewayAuthorizeNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paymentGatewayClearCommerceEClass, PaymentGatewayClearCommerce.class, "PaymentGatewayClearCommerce", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentGatewayClearCommerce_PaymentGatewayConfigId(), ecorePackage.getEString(), "paymentGatewayConfigId", null, 1, 1, PaymentGatewayClearCommerce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayClearCommerce_ClientId(), ecorePackage.getEString(), "clientId", null, 0, 1, PaymentGatewayClearCommerce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayClearCommerce_EffectiveAlias(), ecorePackage.getEString(), "effectiveAlias", null, 0, 1, PaymentGatewayClearCommerce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayClearCommerce_EnableCVM(), ecorePackage.getEBoolean(), "enableCVM", null, 1, 1, PaymentGatewayClearCommerce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayClearCommerce_GroupId(), ecorePackage.getEString(), "groupId", null, 0, 1, PaymentGatewayClearCommerce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayClearCommerce_ProcessMode(), theAccountingPackage.getProcessMode(), "processMode", null, 1, 1, PaymentGatewayClearCommerce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayClearCommerce_Pwd(), ecorePackage.getEString(), "pwd", null, 0, 1, PaymentGatewayClearCommerce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayClearCommerce_ServerURL(), ecorePackage.getEString(), "serverURL", null, 0, 1, PaymentGatewayClearCommerce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayClearCommerce_SourceId(), ecorePackage.getEString(), "sourceId", null, 0, 1, PaymentGatewayClearCommerce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayClearCommerce_UserAlias(), ecorePackage.getEString(), "userAlias", null, 0, 1, PaymentGatewayClearCommerce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayClearCommerce_Username(), ecorePackage.getEString(), "username", null, 0, 1, PaymentGatewayClearCommerce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paymentGatewayConfigEClass, PaymentGatewayConfig.class, "PaymentGatewayConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentGatewayConfig_PaymentGatewayConfigId(), ecorePackage.getEString(), "paymentGatewayConfigId", null, 1, 1, PaymentGatewayConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayConfig_Description(), ecorePackage.getEString(), "description", null, 0, 1, PaymentGatewayConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaymentGatewayConfig_PaymentGatewayConfigTypeId(), this.getPaymentGatewayConfigType(), null, "paymentGatewayConfigTypeId", null, 0, 1, PaymentGatewayConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentGatewayConfig_PaymentGatewayConfigTypeId().getEKeys().add(this.getPaymentGatewayConfigType_PaymentGatewayConfigTypeId());

		initEClass(paymentGatewayConfigTypeEClass, PaymentGatewayConfigType.class, "PaymentGatewayConfigType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentGatewayConfigType_PaymentGatewayConfigTypeId(), ecorePackage.getEString(), "paymentGatewayConfigTypeId", null, 1, 1, PaymentGatewayConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayConfigType_Description(), ecorePackage.getEString(), "description", null, 0, 1, PaymentGatewayConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayConfigType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, PaymentGatewayConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaymentGatewayConfigType_ParentTypeId(), this.getPaymentGatewayConfigType(), null, "parentTypeId", null, 0, 1, PaymentGatewayConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentGatewayConfigType_ParentTypeId().getEKeys().add(this.getPaymentGatewayConfigType_PaymentGatewayConfigTypeId());

		initEClass(paymentGatewayCyberSourceEClass, PaymentGatewayCyberSource.class, "PaymentGatewayCyberSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentGatewayCyberSource_PaymentGatewayConfigId(), ecorePackage.getEString(), "paymentGatewayConfigId", null, 1, 1, PaymentGatewayCyberSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayCyberSource_ApiVersion(), ecorePackage.getEString(), "apiVersion", null, 0, 1, PaymentGatewayCyberSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayCyberSource_AutoBill(), ecorePackage.getEString(), "autoBill", null, 0, 1, PaymentGatewayCyberSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayCyberSource_AvsDeclineCodes(), ecorePackage.getEString(), "avsDeclineCodes", null, 0, 1, PaymentGatewayCyberSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayCyberSource_DisableBillAvs(), ecorePackage.getEBoolean(), "disableBillAvs", null, 1, 1, PaymentGatewayCyberSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayCyberSource_EnableDav(), ecorePackage.getEBoolean(), "enableDav", null, 1, 1, PaymentGatewayCyberSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayCyberSource_FraudScore(), ecorePackage.getEBoolean(), "fraudScore", null, 1, 1, PaymentGatewayCyberSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayCyberSource_IgnoreAvs(), ecorePackage.getEString(), "ignoreAvs", null, 0, 1, PaymentGatewayCyberSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayCyberSource_KeysDir(), ecorePackage.getEString(), "keysDir", null, 0, 1, PaymentGatewayCyberSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayCyberSource_KeysFile(), ecorePackage.getEString(), "keysFile", null, 0, 1, PaymentGatewayCyberSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayCyberSource_LogDir(), ecorePackage.getEString(), "logDir", null, 0, 1, PaymentGatewayCyberSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayCyberSource_LogEnabled(), ecorePackage.getEString(), "logEnabled", null, 0, 1, PaymentGatewayCyberSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayCyberSource_LogFile(), ecorePackage.getEString(), "logFile", null, 0, 1, PaymentGatewayCyberSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayCyberSource_LogSize(), ecorePackage.getELong(), "logSize", null, 0, 1, PaymentGatewayCyberSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayCyberSource_MerchantContact(), ecorePackage.getEString(), "merchantContact", null, 0, 1, PaymentGatewayCyberSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayCyberSource_MerchantDescr(), ecorePackage.getEString(), "merchantDescr", null, 0, 1, PaymentGatewayCyberSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayCyberSource_MerchantId(), ecorePackage.getEString(), "merchantId", null, 0, 1, PaymentGatewayCyberSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayCyberSource_Production(), ecorePackage.getEString(), "production", null, 0, 1, PaymentGatewayCyberSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paymentGatewayEwayEClass, PaymentGatewayEway.class, "PaymentGatewayEway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentGatewayEway_PaymentGatewayConfigId(), ecorePackage.getEString(), "paymentGatewayConfigId", null, 1, 1, PaymentGatewayEway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayEway_CustomerId(), ecorePackage.getEString(), "customerId", null, 0, 1, PaymentGatewayEway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayEway_EnableBeagle(), ecorePackage.getEString(), "enableBeagle", null, 0, 1, PaymentGatewayEway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayEway_EnableCvn(), ecorePackage.getEString(), "enableCvn", null, 0, 1, PaymentGatewayEway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayEway_RefundPwd(), ecorePackage.getEString(), "refundPwd", null, 0, 1, PaymentGatewayEway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayEway_TestMode(), ecorePackage.getEString(), "testMode", null, 0, 1, PaymentGatewayEway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paymentGatewayOrbitalEClass, PaymentGatewayOrbital.class, "PaymentGatewayOrbital", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentGatewayOrbital_PaymentGatewayConfigId(), ecorePackage.getEString(), "paymentGatewayConfigId", null, 1, 1, PaymentGatewayOrbital.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayOrbital_AuthorizationURI(), ecorePackage.getEString(), "authorizationURI", null, 0, 1, PaymentGatewayOrbital.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayOrbital_ConnectionPassword(), ecorePackage.getEString(), "connectionPassword", null, 0, 1, PaymentGatewayOrbital.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayOrbital_ConnectionTimeoutSeconds(), ecorePackage.getELong(), "connectionTimeoutSeconds", null, 0, 1, PaymentGatewayOrbital.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayOrbital_EngineClass(), ecorePackage.getEString(), "engineClass", null, 0, 1, PaymentGatewayOrbital.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayOrbital_HostName(), ecorePackage.getEString(), "hostName", null, 0, 1, PaymentGatewayOrbital.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayOrbital_HostNameFailover(), ecorePackage.getEString(), "hostNameFailover", null, 0, 1, PaymentGatewayOrbital.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayOrbital_MerchantId(), ecorePackage.getEString(), "merchantId", null, 0, 1, PaymentGatewayOrbital.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayOrbital_Port(), ecorePackage.getELong(), "port", null, 0, 1, PaymentGatewayOrbital.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayOrbital_PortFailover(), ecorePackage.getELong(), "portFailover", null, 0, 1, PaymentGatewayOrbital.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayOrbital_ReadTimeoutSeconds(), ecorePackage.getELong(), "readTimeoutSeconds", null, 0, 1, PaymentGatewayOrbital.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayOrbital_ResponseType(), ecorePackage.getEString(), "responseType", null, 0, 1, PaymentGatewayOrbital.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayOrbital_SdkVersion(), ecorePackage.getEString(), "sdkVersion", null, 0, 1, PaymentGatewayOrbital.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayOrbital_SslSocketFactory(), ecorePackage.getEString(), "sslSocketFactory", null, 0, 1, PaymentGatewayOrbital.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayOrbital_Username(), ecorePackage.getEString(), "username", null, 0, 1, PaymentGatewayOrbital.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paymentGatewayPayPalEClass, PaymentGatewayPayPal.class, "PaymentGatewayPayPal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentGatewayPayPal_PaymentGatewayConfigId(), ecorePackage.getEString(), "paymentGatewayConfigId", null, 1, 1, PaymentGatewayPayPal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayPal_ApiEnvironment(), ecorePackage.getEString(), "apiEnvironment", null, 0, 1, PaymentGatewayPayPal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayPal_ApiPassword(), ecorePackage.getEString(), "apiPassword", null, 0, 1, PaymentGatewayPayPal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayPal_ApiSignature(), ecorePackage.getEString(), "apiSignature", null, 0, 1, PaymentGatewayPayPal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayPal_ApiUserName(), ecorePackage.getEString(), "apiUserName", null, 0, 1, PaymentGatewayPayPal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayPal_BusinessEmail(), ecorePackage.getEString(), "businessEmail", null, 0, 1, PaymentGatewayPayPal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayPal_CancelReturnUrl(), ecorePackage.getEString(), "cancelReturnUrl", null, 0, 1, PaymentGatewayPayPal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayPal_ConfirmTemplate(), ecorePackage.getEString(), "confirmTemplate", null, 0, 1, PaymentGatewayPayPal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayPal_ConfirmUrl(), ecorePackage.getEString(), "confirmUrl", null, 0, 1, PaymentGatewayPayPal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayPal_ImageUrl(), ecorePackage.getEString(), "imageUrl", null, 0, 1, PaymentGatewayPayPal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayPal_NotifyUrl(), ecorePackage.getEString(), "notifyUrl", null, 0, 1, PaymentGatewayPayPal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayPal_RedirectUrl(), ecorePackage.getEString(), "redirectUrl", null, 0, 1, PaymentGatewayPayPal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayPal_RequireConfirmedShipping(), ecorePackage.getEBoolean(), "requireConfirmedShipping", null, 1, 1, PaymentGatewayPayPal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayPal_ReturnUrl(), ecorePackage.getEString(), "returnUrl", null, 0, 1, PaymentGatewayPayPal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayPal_ShippingCallbackUrl(), ecorePackage.getEString(), "shippingCallbackUrl", null, 0, 1, PaymentGatewayPayPal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paymentGatewayPayflowProEClass, PaymentGatewayPayflowPro.class, "PaymentGatewayPayflowPro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentGatewayPayflowPro_PaymentGatewayConfigId(), ecorePackage.getEString(), "paymentGatewayConfigId", null, 1, 1, PaymentGatewayPayflowPro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayflowPro_CancelReturnUrl(), ecorePackage.getEString(), "cancelReturnUrl", null, 0, 1, PaymentGatewayPayflowPro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayflowPro_CertsPath(), ecorePackage.getEString(), "certsPath", null, 0, 1, PaymentGatewayPayflowPro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayflowPro_CheckAvs(), ecorePackage.getEBoolean(), "checkAvs", null, 1, 1, PaymentGatewayPayflowPro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayflowPro_CheckCvv2(), ecorePackage.getEBoolean(), "checkCvv2", null, 1, 1, PaymentGatewayPayflowPro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayflowPro_EnableTransmit(), ecorePackage.getEString(), "enableTransmit", null, 0, 1, PaymentGatewayPayflowPro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayflowPro_HostAddress(), ecorePackage.getEString(), "hostAddress", null, 0, 1, PaymentGatewayPayflowPro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayflowPro_HostPort(), ecorePackage.getELong(), "hostPort", null, 0, 1, PaymentGatewayPayflowPro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayflowPro_LogFileName(), ecorePackage.getEString(), "logFileName", null, 0, 1, PaymentGatewayPayflowPro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayflowPro_LoggingLevel(), ecorePackage.getELong(), "loggingLevel", null, 0, 1, PaymentGatewayPayflowPro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayflowPro_MaxLogFileSize(), ecorePackage.getELong(), "maxLogFileSize", null, 0, 1, PaymentGatewayPayflowPro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayflowPro_Partner(), ecorePackage.getEString(), "partner", null, 0, 1, PaymentGatewayPayflowPro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayflowPro_PreAuth(), ecorePackage.getEBoolean(), "preAuth", null, 1, 1, PaymentGatewayPayflowPro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayflowPro_ProxyAddress(), ecorePackage.getEString(), "proxyAddress", null, 0, 1, PaymentGatewayPayflowPro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayflowPro_ProxyLogon(), ecorePackage.getEString(), "proxyLogon", null, 0, 1, PaymentGatewayPayflowPro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayflowPro_ProxyPassword(), ecorePackage.getEString(), "proxyPassword", null, 0, 1, PaymentGatewayPayflowPro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayflowPro_ProxyPort(), ecorePackage.getELong(), "proxyPort", null, 0, 1, PaymentGatewayPayflowPro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayflowPro_Pwd(), ecorePackage.getEString(), "pwd", null, 0, 1, PaymentGatewayPayflowPro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayflowPro_RedirectUrl(), ecorePackage.getEString(), "redirectUrl", null, 0, 1, PaymentGatewayPayflowPro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayflowPro_ReturnUrl(), ecorePackage.getEString(), "returnUrl", null, 0, 1, PaymentGatewayPayflowPro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayflowPro_StackTraceOn(), ecorePackage.getEBoolean(), "stackTraceOn", null, 1, 1, PaymentGatewayPayflowPro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayflowPro_Timeout(), ecorePackage.getELong(), "timeout", null, 0, 1, PaymentGatewayPayflowPro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayflowPro_UserId(), ecorePackage.getEString(), "userId", null, 0, 1, PaymentGatewayPayflowPro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayPayflowPro_Vendor(), ecorePackage.getEString(), "vendor", null, 0, 1, PaymentGatewayPayflowPro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paymentGatewayRespMsgEClass, PaymentGatewayRespMsg.class, "PaymentGatewayRespMsg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentGatewayRespMsg_PaymentGatewayRespMsgId(), ecorePackage.getEString(), "paymentGatewayRespMsgId", null, 1, 1, PaymentGatewayRespMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaymentGatewayRespMsg_PaymentGatewayResponseId(), this.getPaymentGatewayResponse(), null, "paymentGatewayResponseId", null, 0, 1, PaymentGatewayRespMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentGatewayRespMsg_PaymentGatewayResponseId().getEKeys().add(this.getPaymentGatewayResponse_PaymentGatewayResponseId());
		initEAttribute(getPaymentGatewayRespMsg_PgrMessage(), ecorePackage.getEString(), "pgrMessage", null, 0, 1, PaymentGatewayRespMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paymentGatewayResponseEClass, PaymentGatewayResponse.class, "PaymentGatewayResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentGatewayResponse_PaymentGatewayResponseId(), ecorePackage.getEString(), "paymentGatewayResponseId", null, 1, 1, PaymentGatewayResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayResponse_AltReference(), ecorePackage.getEString(), "altReference", null, 0, 1, PaymentGatewayResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayResponse_Amount(), ecorePackage.getEBigDecimal(), "amount", null, 0, 1, PaymentGatewayResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaymentGatewayResponse_CurrencyUomId(), theUomPackage.getUom(), null, "currencyUomId", null, 0, 1, PaymentGatewayResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentGatewayResponse_CurrencyUomId().getEKeys().add(theUomPackage.getUom_UomId());
		initEAttribute(getPaymentGatewayResponse_GatewayAvsResult(), ecorePackage.getEString(), "gatewayAvsResult", null, 0, 1, PaymentGatewayResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayResponse_GatewayCode(), ecorePackage.getEString(), "gatewayCode", null, 0, 1, PaymentGatewayResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayResponse_GatewayCvResult(), ecorePackage.getEString(), "gatewayCvResult", null, 0, 1, PaymentGatewayResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayResponse_GatewayFlag(), ecorePackage.getEString(), "gatewayFlag", null, 0, 1, PaymentGatewayResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayResponse_GatewayMessage(), ecorePackage.getEString(), "gatewayMessage", null, 0, 1, PaymentGatewayResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayResponse_GatewayScoreResult(), ecorePackage.getEString(), "gatewayScoreResult", null, 0, 1, PaymentGatewayResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaymentGatewayResponse_OrderPaymentPreferenceId(), theOrderPackage.getOrderPaymentPreference(), null, "orderPaymentPreferenceId", null, 0, 1, PaymentGatewayResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentGatewayResponse_OrderPaymentPreferenceId().getEKeys().add(theOrderPackage.getOrderPaymentPreference_OrderPaymentPreferenceId());
		initEReference(getPaymentGatewayResponse_PaymentMethodId(), this.getPaymentMethod(), null, "paymentMethodId", null, 0, 1, PaymentGatewayResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentGatewayResponse_PaymentMethodId().getEKeys().add(this.getPaymentMethod_PaymentMethodId());
		initEReference(getPaymentGatewayResponse_PaymentMethodTypeId(), this.getPaymentMethodType(), null, "paymentMethodTypeId", null, 0, 1, PaymentGatewayResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentGatewayResponse_PaymentMethodTypeId().getEKeys().add(this.getPaymentMethodType_PaymentMethodTypeId());
		initEReference(getPaymentGatewayResponse_PaymentServiceTypeEnumId(), theEnumPackage.getEnumeration(), null, "paymentServiceTypeEnumId", null, 0, 1, PaymentGatewayResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentGatewayResponse_PaymentServiceTypeEnumId().getEKeys().add(theEnumPackage.getEnumeration_EnumId());
		initEAttribute(getPaymentGatewayResponse_ReferenceNum(), ecorePackage.getEString(), "referenceNum", null, 0, 1, PaymentGatewayResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayResponse_ResultBadCardNumber(), ecorePackage.getEBoolean(), "resultBadCardNumber", null, 0, 1, PaymentGatewayResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayResponse_ResultBadExpire(), ecorePackage.getEBoolean(), "resultBadExpire", null, 0, 1, PaymentGatewayResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayResponse_ResultDeclined(), ecorePackage.getEBoolean(), "resultDeclined", null, 0, 1, PaymentGatewayResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayResponse_ResultNsf(), ecorePackage.getEBoolean(), "resultNsf", null, 0, 1, PaymentGatewayResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayResponse_SubReference(), ecorePackage.getEString(), "subReference", null, 0, 1, PaymentGatewayResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaymentGatewayResponse_TransCodeEnumId(), theEnumPackage.getEnumeration(), null, "transCodeEnumId", null, 0, 1, PaymentGatewayResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentGatewayResponse_TransCodeEnumId().getEKeys().add(theEnumPackage.getEnumeration_EnumId());
		initEAttribute(getPaymentGatewayResponse_TransactionDate(), ecorePackage.getEDate(), "transactionDate", null, 0, 1, PaymentGatewayResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paymentGatewaySagePayEClass, PaymentGatewaySagePay.class, "PaymentGatewaySagePay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentGatewaySagePay_PaymentGatewayConfigId(), ecorePackage.getEString(), "paymentGatewayConfigId", null, 1, 1, PaymentGatewaySagePay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewaySagePay_AuthenticationTransType(), ecorePackage.getEString(), "authenticationTransType", null, 0, 1, PaymentGatewaySagePay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewaySagePay_AuthenticationUrl(), ecorePackage.getEString(), "authenticationUrl", null, 0, 1, PaymentGatewaySagePay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewaySagePay_AuthoriseTransType(), ecorePackage.getEString(), "authoriseTransType", null, 0, 1, PaymentGatewaySagePay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewaySagePay_AuthoriseUrl(), ecorePackage.getEString(), "authoriseUrl", null, 0, 1, PaymentGatewaySagePay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewaySagePay_ProductionHost(), ecorePackage.getEString(), "productionHost", null, 0, 1, PaymentGatewaySagePay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewaySagePay_ProtocolVersion(), ecorePackage.getEString(), "protocolVersion", null, 0, 1, PaymentGatewaySagePay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewaySagePay_RefundUrl(), ecorePackage.getEString(), "refundUrl", null, 0, 1, PaymentGatewaySagePay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewaySagePay_ReleaseTransType(), ecorePackage.getEString(), "releaseTransType", null, 0, 1, PaymentGatewaySagePay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewaySagePay_ReleaseUrl(), ecorePackage.getEString(), "releaseUrl", null, 0, 1, PaymentGatewaySagePay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewaySagePay_SagePayMode(), ecorePackage.getEString(), "sagePayMode", null, 0, 1, PaymentGatewaySagePay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewaySagePay_TestingHost(), ecorePackage.getEString(), "testingHost", null, 0, 1, PaymentGatewaySagePay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewaySagePay_Vendor(), ecorePackage.getEString(), "vendor", null, 0, 1, PaymentGatewaySagePay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewaySagePay_VoidUrl(), ecorePackage.getEString(), "voidUrl", null, 0, 1, PaymentGatewaySagePay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paymentGatewaySecurePayEClass, PaymentGatewaySecurePay.class, "PaymentGatewaySecurePay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentGatewaySecurePay_PaymentGatewayConfigId(), ecorePackage.getEString(), "paymentGatewayConfigId", null, 1, 1, PaymentGatewaySecurePay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewaySecurePay_EnableAmountRound(), ecorePackage.getEBoolean(), "enableAmountRound", null, 1, 1, PaymentGatewaySecurePay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewaySecurePay_MerchantId(), ecorePackage.getEString(), "merchantId", null, 0, 1, PaymentGatewaySecurePay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewaySecurePay_ProcessTimeout(), ecorePackage.getELong(), "processTimeout", null, 0, 1, PaymentGatewaySecurePay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewaySecurePay_Pwd(), ecorePackage.getEString(), "pwd", null, 0, 1, PaymentGatewaySecurePay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewaySecurePay_ServerURL(), ecorePackage.getEString(), "serverURL", null, 0, 1, PaymentGatewaySecurePay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paymentGatewayWorldPayEClass, PaymentGatewayWorldPay.class, "PaymentGatewayWorldPay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentGatewayWorldPay_PaymentGatewayConfigId(), ecorePackage.getEString(), "paymentGatewayConfigId", null, 1, 1, PaymentGatewayWorldPay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayWorldPay_AuthMode(), theAccountingPackage.getAuthMode(), "authMode", null, 1, 1, PaymentGatewayWorldPay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayWorldPay_FixContact(), ecorePackage.getEBoolean(), "fixContact", null, 1, 1, PaymentGatewayWorldPay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayWorldPay_HideContact(), ecorePackage.getEBoolean(), "hideContact", null, 1, 1, PaymentGatewayWorldPay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayWorldPay_HideCurrency(), ecorePackage.getEBoolean(), "hideCurrency", null, 1, 1, PaymentGatewayWorldPay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayWorldPay_InstId(), ecorePackage.getEString(), "instId", null, 0, 1, PaymentGatewayWorldPay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayWorldPay_LangId(), ecorePackage.getEString(), "langId", null, 0, 1, PaymentGatewayWorldPay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayWorldPay_NoLanguageMenu(), ecorePackage.getEBoolean(), "noLanguageMenu", null, 1, 1, PaymentGatewayWorldPay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayWorldPay_RedirectUrl(), ecorePackage.getEString(), "redirectUrl", null, 0, 1, PaymentGatewayWorldPay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayWorldPay_TestMode(), ecorePackage.getELong(), "testMode", null, 0, 1, PaymentGatewayWorldPay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGatewayWorldPay_WithDelivery(), ecorePackage.getEBoolean(), "withDelivery", null, 1, 1, PaymentGatewayWorldPay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paymentGlAccountTypeMapEClass, PaymentGlAccountTypeMap.class, "PaymentGlAccountTypeMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPaymentGlAccountTypeMap_PaymentTypeId(), this.getPaymentType(), null, "paymentTypeId", null, 1, 1, PaymentGlAccountTypeMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentGlAccountTypeMap_PaymentTypeId().getEKeys().add(this.getPaymentType_PaymentTypeId());
		initEReference(getPaymentGlAccountTypeMap_OrganizationPartyId(), thePartyPackage_1.getParty(), null, "organizationPartyId", null, 1, 1, PaymentGlAccountTypeMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentGlAccountTypeMap_OrganizationPartyId().getEKeys().add(thePartyPackage_1.getParty_PartyId());
		initEReference(getPaymentGlAccountTypeMap_GlAccountTypeId(), theLedgerPackage.getGlAccountType(), null, "glAccountTypeId", null, 0, 1, PaymentGlAccountTypeMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentGlAccountTypeMap_GlAccountTypeId().getEKeys().add(theLedgerPackage.getGlAccountType_GlAccountTypeId());

		initEClass(paymentGroupEClass, PaymentGroup.class, "PaymentGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentGroup_PaymentGroupId(), ecorePackage.getEString(), "paymentGroupId", null, 1, 1, PaymentGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGroup_PaymentGroupName(), ecorePackage.getEString(), "paymentGroupName", null, 0, 1, PaymentGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaymentGroup_PaymentGroupTypeId(), this.getPaymentGroupType(), null, "paymentGroupTypeId", null, 0, 1, PaymentGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentGroup_PaymentGroupTypeId().getEKeys().add(this.getPaymentGroupType_PaymentGroupTypeId());

		initEClass(paymentGroupMemberEClass, PaymentGroupMember.class, "PaymentGroupMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPaymentGroupMember_PaymentGroupId(), this.getPaymentGroup(), null, "paymentGroupId", null, 1, 1, PaymentGroupMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentGroupMember_PaymentGroupId().getEKeys().add(this.getPaymentGroup_PaymentGroupId());
		initEReference(getPaymentGroupMember_PaymentId(), this.getPayment(), null, "paymentId", null, 1, 1, PaymentGroupMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentGroupMember_PaymentId().getEKeys().add(this.getPayment_PaymentId());
		initEAttribute(getPaymentGroupMember_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, PaymentGroupMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGroupMember_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, PaymentGroupMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGroupMember_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, PaymentGroupMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paymentGroupTypeEClass, PaymentGroupType.class, "PaymentGroupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentGroupType_PaymentGroupTypeId(), ecorePackage.getEString(), "paymentGroupTypeId", null, 1, 1, PaymentGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGroupType_Description(), ecorePackage.getEString(), "description", null, 0, 1, PaymentGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGroupType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, PaymentGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaymentGroupType_ParentTypeId(), this.getPaymentGroupType(), null, "parentTypeId", null, 0, 1, PaymentGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentGroupType_ParentTypeId().getEKeys().add(this.getPaymentGroupType_PaymentGroupTypeId());

		initEClass(paymentMethodEClass, PaymentMethod.class, "PaymentMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentMethod_PaymentMethodId(), ecorePackage.getEString(), "paymentMethodId", null, 1, 1, PaymentMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentMethod_Description(), ecorePackage.getEString(), "description", null, 0, 1, PaymentMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaymentMethod_FinAccountId(), theFinaccountPackage.getFinAccount(), null, "finAccountId", null, 0, 1, PaymentMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentMethod_FinAccountId().getEKeys().add(theFinaccountPackage.getFinAccount_FinAccountId());
		initEAttribute(getPaymentMethod_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, PaymentMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaymentMethod_GlAccountId(), theLedgerPackage.getGlAccount(), null, "glAccountId", null, 0, 1, PaymentMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentMethod_GlAccountId().getEKeys().add(theLedgerPackage.getGlAccount_GlAccountId());
		initEReference(getPaymentMethod_PartyId(), thePartyPackage_1.getParty(), null, "partyId", null, 0, 1, PaymentMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentMethod_PartyId().getEKeys().add(thePartyPackage_1.getParty_PartyId());
		initEReference(getPaymentMethod_PaymentMethodTypeId(), this.getPaymentMethodType(), null, "paymentMethodTypeId", null, 0, 1, PaymentMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentMethod_PaymentMethodTypeId().getEKeys().add(this.getPaymentMethodType_PaymentMethodTypeId());
		initEAttribute(getPaymentMethod_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, PaymentMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paymentMethodTypeEClass, PaymentMethodType.class, "PaymentMethodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentMethodType_PaymentMethodTypeId(), ecorePackage.getEString(), "paymentMethodTypeId", null, 1, 1, PaymentMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaymentMethodType_DefaultGlAccountId(), theLedgerPackage.getGlAccount(), null, "defaultGlAccountId", null, 0, 1, PaymentMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentMethodType_DefaultGlAccountId().getEKeys().add(theLedgerPackage.getGlAccount_GlAccountId());
		initEAttribute(getPaymentMethodType_Description(), ecorePackage.getEString(), "description", null, 0, 1, PaymentMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaymentMethodType_PaymentMethodTypeGlAccounts(), this.getPaymentMethodTypeGlAccount(), null, "paymentMethodTypeGlAccounts", null, 0, -1, PaymentMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(paymentMethodTypeGlAccountEClass, PaymentMethodTypeGlAccount.class, "PaymentMethodTypeGlAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPaymentMethodTypeGlAccount_PaymentMethodTypeId(), this.getPaymentMethodType(), null, "paymentMethodTypeId", null, 1, 1, PaymentMethodTypeGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentMethodTypeGlAccount_PaymentMethodTypeId().getEKeys().add(this.getPaymentMethodType_PaymentMethodTypeId());
		initEReference(getPaymentMethodTypeGlAccount_OrganizationPartyId(), thePartyPackage_1.getParty(), null, "organizationPartyId", null, 1, 1, PaymentMethodTypeGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentMethodTypeGlAccount_OrganizationPartyId().getEKeys().add(thePartyPackage_1.getParty_PartyId());
		initEReference(getPaymentMethodTypeGlAccount_GlAccountId(), theLedgerPackage.getGlAccount(), null, "glAccountId", null, 0, 1, PaymentMethodTypeGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentMethodTypeGlAccount_GlAccountId().getEKeys().add(theLedgerPackage.getGlAccount_GlAccountId());

		initEClass(paymentTypeEClass, PaymentType.class, "PaymentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentType_PaymentTypeId(), ecorePackage.getEString(), "paymentTypeId", null, 1, 1, PaymentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentType_Description(), ecorePackage.getEString(), "description", null, 0, 1, PaymentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, PaymentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaymentType_ParentTypeId(), this.getPaymentType(), null, "parentTypeId", null, 0, 1, PaymentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentType_ParentTypeId().getEKeys().add(this.getPaymentType_PaymentTypeId());
		initEReference(getPaymentType_PaymentGlAccountTypeMaps(), this.getPaymentGlAccountTypeMap(), null, "paymentGlAccountTypeMaps", null, 0, -1, PaymentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPaymentType_PaymentTypeAttrs(), this.getPaymentTypeAttr(), null, "paymentTypeAttrs", null, 0, -1, PaymentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(paymentTypeAttrEClass, PaymentTypeAttr.class, "PaymentTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPaymentTypeAttr_PaymentTypeId(), this.getPaymentType(), null, "paymentTypeId", null, 1, 1, PaymentTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPaymentTypeAttr_PaymentTypeId().getEKeys().add(this.getPaymentType_PaymentTypeId());
		initEAttribute(getPaymentTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, PaymentTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, PaymentTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueLinkKeyEClass, ValueLinkKey.class, "ValueLinkKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueLinkKey_MerchantId(), ecorePackage.getEString(), "merchantId", null, 1, 1, ValueLinkKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueLinkKey_CreatedByTerminal(), ecorePackage.getEString(), "createdByTerminal", null, 0, 1, ValueLinkKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueLinkKey_CreatedByUserLogin(), ecorePackage.getEString(), "createdByUserLogin", null, 0, 1, ValueLinkKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueLinkKey_CreatedDate(), ecorePackage.getEDate(), "createdDate", null, 0, 1, ValueLinkKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueLinkKey_ExchangeKey(), ecorePackage.getEString(), "exchangeKey", null, 0, 1, ValueLinkKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueLinkKey_LastModifiedByTerminal(), ecorePackage.getEString(), "lastModifiedByTerminal", null, 0, 1, ValueLinkKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueLinkKey_LastModifiedByUserLogin(), ecorePackage.getEString(), "lastModifiedByUserLogin", null, 0, 1, ValueLinkKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueLinkKey_LastModifiedDate(), ecorePackage.getEDate(), "lastModifiedDate", null, 0, 1, ValueLinkKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueLinkKey_LastWorkingKey(), ecorePackage.getEString(), "lastWorkingKey", null, 0, 1, ValueLinkKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueLinkKey_PrivateKey(), ecorePackage.getEString(), "privateKey", null, 0, 1, ValueLinkKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueLinkKey_PublicKey(), ecorePackage.getEString(), "publicKey", null, 0, 1, ValueLinkKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueLinkKey_WorkingKey(), ecorePackage.getEString(), "workingKey", null, 0, 1, ValueLinkKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueLinkKey_WorkingKeyIndex(), ecorePackage.getELong(), "workingKeyIndex", null, 0, 1, ValueLinkKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// mimo-ent-frame
		createMimoentframeAnnotations();
		// mimo-ent-format
		createMimoentformatAnnotations();
		// mimo-ent-slot
		createMimoentslotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>mimo-ent-frame</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMimoentframeAnnotations() {
		String source = "mimo-ent-frame";
		addAnnotation
		  (billingAccountEClass,
		   source,
		   new String[] {
			   "help", "A BillingAccount Payment Method",
			   "formula", "description"
		   });
		addAnnotation
		  (billingAccountTermAttrEClass,
		   source,
		   new String[] {
			   "title", "Billing Account Term Attribute"
		   });
		addAnnotation
		  (checkAccountEClass,
		   source,
		   new String[] {
			   "title", "Check Information"
		   });
		addAnnotation
		  (creditCardEClass,
		   source,
		   new String[] {
			   "title", "Credit Card Information",
			   "formula", "description"
		   });
		addAnnotation
		  (deductionTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (eftAccountEClass,
		   source,
		   new String[] {
			   "title", "EFT Account Information",
			   "formula", "description"
		   });
		addAnnotation
		  (giftCardEClass,
		   source,
		   new String[] {
			   "title", "Gift Card Information",
			   "formula", "description"
		   });
		addAnnotation
		  (giftCardFulfillmentEClass,
		   source,
		   new String[] {
			   "title", "Gift Card Fulfillment History"
		   });
		addAnnotation
		  (payPalPaymentMethodEClass,
		   source,
		   new String[] {
			   "help", "PayPal Payment Method Details"
		   });
		addAnnotation
		  (paymentContentTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (paymentGatewayAuthorizeNetEClass,
		   source,
		   new String[] {
			   "title", "Authorize Dot Net Payment Gateway Configuration"
		   });
		addAnnotation
		  (paymentGatewayClearCommerceEClass,
		   source,
		   new String[] {
			   "title", "Clear Commerce Payment Gateway Config"
		   });
		addAnnotation
		  (paymentGatewayConfigEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (paymentGatewayConfigTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (paymentGatewayCyberSourceEClass,
		   source,
		   new String[] {
			   "title", "CyberSource Payment Gateway Configuration"
		   });
		addAnnotation
		  (paymentGatewayEwayEClass,
		   source,
		   new String[] {
			   "title", "eWay Payment Gateway Configuration"
		   });
		addAnnotation
		  (paymentGatewayOrbitalEClass,
		   source,
		   new String[] {
			   "title", "Orbital Payment Gateway Config"
		   });
		addAnnotation
		  (paymentGatewayPayPalEClass,
		   source,
		   new String[] {
			   "title", "PayPal Payment Gateway Config"
		   });
		addAnnotation
		  (paymentGatewayPayflowProEClass,
		   source,
		   new String[] {
			   "title", "Payflow Pro Payment Gateway Config"
		   });
		addAnnotation
		  (paymentGatewayRespMsgEClass,
		   source,
		   new String[] {
			   "title", "Payment Gateway Response Message"
		   });
		addAnnotation
		  (paymentGatewaySagePayEClass,
		   source,
		   new String[] {
			   "title", "SagePay Payment Gateway Configuration"
		   });
		addAnnotation
		  (paymentGatewaySecurePayEClass,
		   source,
		   new String[] {
			   "title", "SecurePay Payment Gateway Config"
		   });
		addAnnotation
		  (paymentGatewayWorldPayEClass,
		   source,
		   new String[] {
			   "title", "RBS WorldPay Payment Gateway Config"
		   });
		addAnnotation
		  (paymentGlAccountTypeMapEClass,
		   source,
		   new String[] {
			   "title", "Maps PaymentTypes to GlAccountTypes, allowing user to configure payments and gl accounts"
		   });
		addAnnotation
		  (paymentGroupEClass,
		   source,
		   new String[] {
			   "help", "Payment Group"
		   });
		addAnnotation
		  (paymentGroupMemberEClass,
		   source,
		   new String[] {
			   "help", "Payment Group Member"
		   });
		addAnnotation
		  (paymentGroupTypeEClass,
		   source,
		   new String[] {
			   "help", "Payment Group Type",
			   "formula", "description"
		   });
		addAnnotation
		  (paymentMethodEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (paymentMethodTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "AccountingEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (paymentTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "AccountingEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (paymentTypeAttrEClass,
		   source,
		   new String[] {
			   "title", "Payment Type Attribute",
			   "formula", "description"
		   });
		addAnnotation
		  (valueLinkKeyEClass,
		   source,
		   new String[] {
			   "title", "Value Link Key Store"
		   });
	}

	/**
	 * Initializes the annotations for <b>mimo-ent-format</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMimoentformatAnnotations() {
		String source = "mimo-ent-format";
		addAnnotation
		  (getBillingAccount_BillingAccountId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getBillingAccount_AccountLimit(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getBillingAccount_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getBillingAccount_ExternalAccountId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getBillingAccountTerm_BillingAccountTermId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getBillingAccountTerm_TermDays(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getBillingAccountTerm_TermValue(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getBillingAccountTermAttr_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getBillingAccountTermAttr_AttrValue(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getCheckAccount_PaymentMethodId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getCheckAccount_AccountNumber(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getCheckAccount_AccountType(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getCheckAccount_BankName(),
		   source,
		   new String[] {
			   "type", "name",
			   "length", "100"
		   });
		addAnnotation
		  (getCheckAccount_BranchCode(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getCheckAccount_CompanyNameOnAccount(),
		   source,
		   new String[] {
			   "type", "name",
			   "length", "100"
		   });
		addAnnotation
		  (getCheckAccount_NameOnAccount(),
		   source,
		   new String[] {
			   "type", "name",
			   "length", "100"
		   });
		addAnnotation
		  (getCheckAccount_RoutingNumber(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getCreditCard_CardNumber(),
		   source,
		   new String[] {
			   "type", "credit-card-number",
			   "length", "255"
		   });
		addAnnotation
		  (getCreditCard_CardType(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getCreditCard_CompanyNameOnCard(),
		   source,
		   new String[] {
			   "type", "name",
			   "length", "100"
		   });
		addAnnotation
		  (getCreditCard_ConsecutiveFailedAuths(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getCreditCard_ConsecutiveFailedNsf(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getCreditCard_ExpireDate(),
		   source,
		   new String[] {
			   "type", "credit-card-date",
			   "length", "7"
		   });
		addAnnotation
		  (getCreditCard_FirstNameOnCard(),
		   source,
		   new String[] {
			   "type", "name",
			   "length", "100"
		   });
		addAnnotation
		  (getCreditCard_IssueNumber(),
		   source,
		   new String[] {
			   "type", "credit-card-date",
			   "length", "7"
		   });
		addAnnotation
		  (getCreditCard_LastNameOnCard(),
		   source,
		   new String[] {
			   "type", "name",
			   "length", "100"
		   });
		addAnnotation
		  (getCreditCard_MiddleNameOnCard(),
		   source,
		   new String[] {
			   "type", "name",
			   "length", "100"
		   });
		addAnnotation
		  (getCreditCard_SuffixOnCard(),
		   source,
		   new String[] {
			   "type", "name",
			   "length", "100"
		   });
		addAnnotation
		  (getCreditCard_TitleOnCard(),
		   source,
		   new String[] {
			   "type", "name",
			   "length", "100"
		   });
		addAnnotation
		  (getCreditCard_ValidFromDate(),
		   source,
		   new String[] {
			   "type", "credit-card-date",
			   "length", "7"
		   });
		addAnnotation
		  (getCreditCardTypeGlAccount_CardType(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getCreditCardTypeGlAccount_OrganizationPartyId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getCreditCardTypeGlAccount_GlAccountId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getDeduction_DeductionId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getDeduction_Amount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getDeductionType_DeductionTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getDeductionType_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getEftAccount_AccountNumber(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getEftAccount_AccountType(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getEftAccount_BankName(),
		   source,
		   new String[] {
			   "type", "name",
			   "length", "100"
		   });
		addAnnotation
		  (getEftAccount_CompanyNameOnAccount(),
		   source,
		   new String[] {
			   "type", "name",
			   "length", "100"
		   });
		addAnnotation
		  (getEftAccount_NameOnAccount(),
		   source,
		   new String[] {
			   "type", "name",
			   "length", "100"
		   });
		addAnnotation
		  (getEftAccount_RoutingNumber(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getEftAccount_YearsAtBank(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getGiftCard_CardNumber(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getGiftCard_ExpireDate(),
		   source,
		   new String[] {
			   "type", "credit-card-date",
			   "length", "7"
		   });
		addAnnotation
		  (getGiftCard_PinNumber(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getGiftCardFulfillment_FulfillmentId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getGiftCardFulfillment_Amount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getGiftCardFulfillment_AuthCode(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getGiftCardFulfillment_CardNumber(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getGiftCardFulfillment_MerchantId(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getGiftCardFulfillment_OrderItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getGiftCardFulfillment_PinNumber(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getGiftCardFulfillment_ReferenceNum(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getGiftCardFulfillment_ResponseCode(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPayPalPaymentMethod_PaymentMethodId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPayPalPaymentMethod_CorrelationId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPayPalPaymentMethod_ExpressCheckoutToken(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPayPalPaymentMethod_PayerId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPayPalPaymentMethod_PayerStatus(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPayPalPaymentMethod_TransactionId(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPayment_PaymentId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPayment_ActualCurrencyAmount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getPayment_Amount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getPayment_Comments(),
		   source,
		   new String[] {
			   "type", "comment",
			   "length", "255"
		   });
		addAnnotation
		  (getPayment_PaymentRefNum(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentApplication_PaymentApplicationId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPaymentApplication_AmountApplied(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getPaymentApplication_InvoiceItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPaymentAttribute_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentAttribute_AttrDescription(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentAttribute_AttrValue(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentBudgetAllocation_BudgetItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPaymentBudgetAllocation_Amount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getPaymentContentType_PaymentContentTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPaymentContentType_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_PaymentGatewayConfigId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_ApiVersion(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_CertificateAlias(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_CpDeviceType(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_CpMarketType(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_CpVersion(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_DelimitedData(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_DelimiterChar(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_DuplicateWindow(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_EmailCustomer(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_EmailMerchant(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_Method(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_Pwd(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_RelayResponse(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_TestMode(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_TranKey(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_TransDescription(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_TransactionUrl(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_UserId(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayClearCommerce_PaymentGatewayConfigId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPaymentGatewayClearCommerce_ClientId(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayClearCommerce_EffectiveAlias(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayClearCommerce_GroupId(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayClearCommerce_Pwd(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayClearCommerce_ServerURL(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayClearCommerce_SourceId(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayClearCommerce_UserAlias(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayClearCommerce_Username(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayConfig_PaymentGatewayConfigId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPaymentGatewayConfig_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayConfigType_PaymentGatewayConfigTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPaymentGatewayConfigType_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_PaymentGatewayConfigId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_ApiVersion(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_AutoBill(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_AvsDeclineCodes(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_IgnoreAvs(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_KeysDir(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_KeysFile(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_LogDir(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_LogEnabled(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_LogFile(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_LogSize(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_MerchantContact(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_MerchantDescr(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_MerchantId(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_Production(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayEway_PaymentGatewayConfigId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPaymentGatewayEway_CustomerId(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayEway_EnableBeagle(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayEway_EnableCvn(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayEway_RefundPwd(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayEway_TestMode(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_PaymentGatewayConfigId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_AuthorizationURI(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_ConnectionPassword(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_ConnectionTimeoutSeconds(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_EngineClass(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_HostName(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_HostNameFailover(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_MerchantId(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_Port(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_PortFailover(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_ReadTimeoutSeconds(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_ResponseType(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_SdkVersion(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_SslSocketFactory(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_Username(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayPayPal_PaymentGatewayConfigId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPaymentGatewayPayPal_ApiEnvironment(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayPayPal_ApiPassword(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayPayPal_ApiSignature(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayPayPal_ApiUserName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayPayPal_BusinessEmail(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayPayPal_CancelReturnUrl(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayPayPal_ConfirmTemplate(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayPayPal_ConfirmUrl(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayPayPal_ImageUrl(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayPayPal_NotifyUrl(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayPayPal_RedirectUrl(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayPayPal_ReturnUrl(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayPayPal_ShippingCallbackUrl(),
		   source,
		   new String[] {
			   "type", "url",
			   "length", "2000"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_PaymentGatewayConfigId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_CancelReturnUrl(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_CertsPath(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_EnableTransmit(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_HostAddress(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_HostPort(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_LogFileName(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_LoggingLevel(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_MaxLogFileSize(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_Partner(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_ProxyAddress(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_ProxyLogon(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_ProxyPassword(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_ProxyPort(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_Pwd(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_RedirectUrl(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_ReturnUrl(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_Timeout(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_UserId(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_Vendor(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayRespMsg_PaymentGatewayRespMsgId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPaymentGatewayResponse_PaymentGatewayResponseId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPaymentGatewayResponse_AltReference(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayResponse_Amount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getPaymentGatewayResponse_GatewayAvsResult(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayResponse_GatewayCode(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayResponse_GatewayCvResult(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayResponse_GatewayFlag(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayResponse_GatewayMessage(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayResponse_GatewayScoreResult(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayResponse_ReferenceNum(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayResponse_SubReference(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewaySagePay_PaymentGatewayConfigId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPaymentGatewaySagePay_AuthenticationTransType(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewaySagePay_AuthenticationUrl(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewaySagePay_AuthoriseTransType(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewaySagePay_AuthoriseUrl(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewaySagePay_ProductionHost(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewaySagePay_ProtocolVersion(),
		   source,
		   new String[] {
			   "length", "10"
		   });
		addAnnotation
		  (getPaymentGatewaySagePay_RefundUrl(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewaySagePay_ReleaseTransType(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewaySagePay_ReleaseUrl(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewaySagePay_SagePayMode(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewaySagePay_TestingHost(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewaySagePay_Vendor(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewaySagePay_VoidUrl(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewaySecurePay_PaymentGatewayConfigId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPaymentGatewaySecurePay_MerchantId(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewaySecurePay_ProcessTimeout(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getPaymentGatewaySecurePay_Pwd(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewaySecurePay_ServerURL(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayWorldPay_PaymentGatewayConfigId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPaymentGatewayWorldPay_InstId(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayWorldPay_LangId(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentGatewayWorldPay_RedirectUrl(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentGatewayWorldPay_TestMode(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getPaymentGroup_PaymentGroupId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPaymentGroup_PaymentGroupName(),
		   source,
		   new String[] {
			   "type", "name",
			   "length", "100"
		   });
		addAnnotation
		  (getPaymentGroupMember_SequenceNum(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getPaymentGroupType_PaymentGroupTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPaymentGroupType_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentMethod_PaymentMethodId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPaymentMethod_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentMethodType_PaymentMethodTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPaymentMethodType_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentType_PaymentTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getPaymentType_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getPaymentTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getPaymentTypeAttr_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getValueLinkKey_MerchantId(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getValueLinkKey_CreatedByTerminal(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getValueLinkKey_CreatedByUserLogin(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getValueLinkKey_LastModifiedByTerminal(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getValueLinkKey_LastModifiedByUserLogin(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getValueLinkKey_WorkingKeyIndex(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
	}

	/**
	 * Initializes the annotations for <b>mimo-ent-slot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMimoentslotAnnotations() {
		String source = "mimo-ent-slot";
		addAnnotation
		  (getBillingAccountRole_BillingAccountId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getBillingAccountRole_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getBillingAccountRole_RoleTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getBillingAccountRole_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getBillingAccountTermAttr_BillingAccountTermId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getBillingAccountTermAttr_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getCheckAccount_RoutingNumber(),
		   source,
		   new String[] {
			   "help", "See https://en.wikipedia.org/wiki/Bank_code"
		   });
		addAnnotation
		  (getCreditCard_CardNumber(),
		   source,
		   new String[] {
			   "encrypt", "TRUE"
		   });
		addAnnotation
		  (getCreditCard_ContactMechId(),
		   source,
		   new String[] {
			   "help", "The Billing PostalAddress"
		   });
		addAnnotation
		  (getCreditCard_IssueNumber(),
		   source,
		   new String[] {
			   "help", "Single digit number on some Switch and Maestro cards"
		   });
		addAnnotation
		  (getCreditCard_ValidFromDate(),
		   source,
		   new String[] {
			   "help", "Not common in some parts of the world."
		   });
		addAnnotation
		  (getCreditCardTypeGlAccount_CardType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getCreditCardTypeGlAccount_OrganizationPartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getEftAccount_RoutingNumber(),
		   source,
		   new String[] {
			   "help", "See https://en.wikipedia.org/wiki/Bank_code"
		   });
		addAnnotation
		  (getGiftCard_CardNumber(),
		   source,
		   new String[] {
			   "encrypt", "TRUE"
		   });
		addAnnotation
		  (getGiftCard_PinNumber(),
		   source,
		   new String[] {
			   "encrypt", "TRUE"
		   });
		addAnnotation
		  (getGiftCardFulfillment_CardNumber(),
		   source,
		   new String[] {
			   "encrypt", "TRUE"
		   });
		addAnnotation
		  (getGiftCardFulfillment_PinNumber(),
		   source,
		   new String[] {
			   "encrypt", "TRUE"
		   });
		addAnnotation
		  (getPaymentApplication_OverrideGlAccountId(),
		   source,
		   new String[] {
			   "help", "If filled in, payment is applied directly against this GL account"
		   });
		addAnnotation
		  (getPaymentAttribute_PaymentId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPaymentAttribute_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPaymentBudgetAllocation_BudgetId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPaymentBudgetAllocation_PaymentId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPaymentBudgetAllocation_BudgetItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPaymentContent_PaymentId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPaymentContent_ContentId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPaymentContent_PaymentContentTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPaymentContent_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_ApiVersion(),
		   source,
		   new String[] {
			   "help", "Target Authorize Dot Net API version"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_CertificateAlias(),
		   source,
		   new String[] {
			   "help", "Certificate Alias"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_CpDeviceType(),
		   source,
		   new String[] {
			   "help", "Card Present Device Type"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_CpMarketType(),
		   source,
		   new String[] {
			   "help", "Card Present Market Type"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_CpVersion(),
		   source,
		   new String[] {
			   "help", "Card Present Version"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_DelimitedData(),
		   source,
		   new String[] {
			   "help", "Delimited data (TRUE|FALSE)"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_DelimiterChar(),
		   source,
		   new String[] {
			   "help", "Delimited Character - the delimiter to use in the response"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_DuplicateWindow(),
		   source,
		   new String[] {
			   "help", "Check the duplicate transaction in the specified time duration which is specified in seconds. If duplicate transaction occurs in the defined time limit then return error."
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_EmailCustomer(),
		   source,
		   new String[] {
			   "help", "Email Customer? - if should send an email to the customer for each transaction (TRUE|FALSE)"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_EmailMerchant(),
		   source,
		   new String[] {
			   "help", "Email Merchant? - if should send email to the merchant for each transaction (TRUE|FALSE)"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_Method(),
		   source,
		   new String[] {
			   "help", "Method - CC for credit card processing"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_Pwd(),
		   source,
		   new String[] {
			   "encrypt", "TRUE",
			   "help", "Password - your authorize.net password"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_RelayResponse(),
		   source,
		   new String[] {
			   "help", "Relay Response? - if should relay the reposnse to a different server (TRUE|FALSE)"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_TestMode(),
		   source,
		   new String[] {
			   "help", "Test Mode - forces the url property to the test url and adds more logging info to the logs (TRUE|FALSE)"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_TranKey(),
		   source,
		   new String[] {
			   "encrypt", "TRUE",
			   "help", "Transaction Key"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_TransDescription(),
		   source,
		   new String[] {
			   "help", "Default Transaction Description"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_TransactionUrl(),
		   source,
		   new String[] {
			   "help", "Transaction URL"
		   });
		addAnnotation
		  (getPaymentGatewayAuthorizeNet_UserId(),
		   source,
		   new String[] {
			   "help", "Username - your authorize.net userid"
		   });
		addAnnotation
		  (getPaymentGatewayClearCommerce_ClientId(),
		   source,
		   new String[] {
			   "help", "Client Id of account information"
		   });
		addAnnotation
		  (getPaymentGatewayClearCommerce_EffectiveAlias(),
		   source,
		   new String[] {
			   "help", "Effective Alias of account information"
		   });
		addAnnotation
		  (getPaymentGatewayClearCommerce_EnableCVM(),
		   source,
		   new String[] {
			   "help", "Enable Card Verification Methods (CID, CVC, CVV2)"
		   });
		addAnnotation
		  (getPaymentGatewayClearCommerce_GroupId(),
		   source,
		   new String[] {
			   "help", "Useful for grouping transactions"
		   });
		addAnnotation
		  (getPaymentGatewayClearCommerce_ProcessMode(),
		   source,
		   new String[] {
			   "help", "Process mode (Y: approve / N: decline / R: random / P: production)"
		   });
		addAnnotation
		  (getPaymentGatewayClearCommerce_Pwd(),
		   source,
		   new String[] {
			   "encrypt", "TRUE",
			   "help", "Password of account informatio"
		   });
		addAnnotation
		  (getPaymentGatewayClearCommerce_ServerURL(),
		   source,
		   new String[] {
			   "help", "Server URL of the payment processor"
		   });
		addAnnotation
		  (getPaymentGatewayClearCommerce_SourceId(),
		   source,
		   new String[] {
			   "help", "Useful for tagging transactions"
		   });
		addAnnotation
		  (getPaymentGatewayClearCommerce_UserAlias(),
		   source,
		   new String[] {
			   "help", "Alias of account informatio"
		   });
		addAnnotation
		  (getPaymentGatewayClearCommerce_Username(),
		   source,
		   new String[] {
			   "help", "User name of account informatio"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_ApiVersion(),
		   source,
		   new String[] {
			   "help", "Target CyberSource API version"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_AutoBill(),
		   source,
		   new String[] {
			   "help", "Auto-Bill In Authorization (true|false)"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_AvsDeclineCodes(),
		   source,
		   new String[] {
			   "help", "AVS Decline Codes -- May not be supported any longer"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_DisableBillAvs(),
		   source,
		   new String[] {
			   "help", "Disable AVS for Capture -- May not be supported any longer"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_EnableDav(),
		   source,
		   new String[] {
			   "help", "Use DAV In Authorization -- May not be supported any longer"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_FraudScore(),
		   source,
		   new String[] {
			   "help", "Use Fraud Scoring In Authorization -- May not be supported any longer"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_IgnoreAvs(),
		   source,
		   new String[] {
			   "help", "Ignore AVS results (true|false)"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_KeysDir(),
		   source,
		   new String[] {
			   "help", "Directory of the keys from CyberSource (Generate using online tools)"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_KeysFile(),
		   source,
		   new String[] {
			   "help", "Name of the keystore (if different then \"merchantID\".p12)"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_LogDir(),
		   source,
		   new String[] {
			   "help", "Log directory"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_LogEnabled(),
		   source,
		   new String[] {
			   "help", "Log transaction information (true|false)"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_LogFile(),
		   source,
		   new String[] {
			   "help", "Log file name"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_LogSize(),
		   source,
		   new String[] {
			   "help", "Max log size (megabytes)"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_MerchantContact(),
		   source,
		   new String[] {
			   "help", "Merchant Description Contact Information - Shown on credit card statement"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_MerchantDescr(),
		   source,
		   new String[] {
			   "help", "Merchant Description - Shown on credit card statement"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_MerchantId(),
		   source,
		   new String[] {
			   "help", "You merchant ID"
		   });
		addAnnotation
		  (getPaymentGatewayCyberSource_Production(),
		   source,
		   new String[] {
			   "help", "Enable production \"mode\" (true|false)"
		   });
		addAnnotation
		  (getPaymentGatewayEway_RefundPwd(),
		   source,
		   new String[] {
			   "encrypt", "TRUE"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_AuthorizationURI(),
		   source,
		   new String[] {
			   "help", "Authorization URI"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_ConnectionPassword(),
		   source,
		   new String[] {
			   "encrypt", "TRUE",
			   "help", "Orbital Password of account information"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_ConnectionTimeoutSeconds(),
		   source,
		   new String[] {
			   "help", "Timeout"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_EngineClass(),
		   source,
		   new String[] {
			   "help", "Class for the Orbital Gateway - Default should be used - HttpsEngine"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_HostName(),
		   source,
		   new String[] {
			   "help", "Address of the payment processor"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_HostNameFailover(),
		   source,
		   new String[] {
			   "help", "Failover Address of the payment processor"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_MerchantId(),
		   source,
		   new String[] {
			   "help", "You merchant ID"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_Port(),
		   source,
		   new String[] {
			   "help", "Port of the payment processor"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_PortFailover(),
		   source,
		   new String[] {
			   "help", "Failover Port of the payment processor"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_ReadTimeoutSeconds(),
		   source,
		   new String[] {
			   "help", "Read Timeout"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_ResponseType(),
		   source,
		   new String[] {
			   "help", "Response Type (gateway|host)"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_SdkVersion(),
		   source,
		   new String[] {
			   "help", "Target Orbital Gateway API version"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_SslSocketFactory(),
		   source,
		   new String[] {
			   "help", "SSL Socket Factory (default|strict)"
		   });
		addAnnotation
		  (getPaymentGatewayOrbital_Username(),
		   source,
		   new String[] {
			   "help", "Orbital Username of account information"
		   });
		addAnnotation
		  (getPaymentGatewayPayPal_ApiEnvironment(),
		   source,
		   new String[] {
			   "help", "PayPal API Environment (valid values are: live, sandbox or beta-sandbox)"
		   });
		addAnnotation
		  (getPaymentGatewayPayPal_ApiPassword(),
		   source,
		   new String[] {
			   "help", "PayPal API Password"
		   });
		addAnnotation
		  (getPaymentGatewayPayPal_ApiSignature(),
		   source,
		   new String[] {
			   "help", "PayPal API Signature"
		   });
		addAnnotation
		  (getPaymentGatewayPayPal_ApiUserName(),
		   source,
		   new String[] {
			   "help", "PayPal API UserName"
		   });
		addAnnotation
		  (getPaymentGatewayPayPal_BusinessEmail(),
		   source,
		   new String[] {
			   "help", "Business e-mail"
		   });
		addAnnotation
		  (getPaymentGatewayPayPal_CancelReturnUrl(),
		   source,
		   new String[] {
			   "help", "Return On Cancel URL"
		   });
		addAnnotation
		  (getPaymentGatewayPayPal_ConfirmTemplate(),
		   source,
		   new String[] {
			   "help", "Thank-You / Confirm Order Template (rendered via Freemarker)"
		   });
		addAnnotation
		  (getPaymentGatewayPayPal_ConfirmUrl(),
		   source,
		   new String[] {
			   "help", "PayPal Confirm URL Sandbox/Production (JSSE must be configured to use SSL)"
		   });
		addAnnotation
		  (getPaymentGatewayPayPal_ImageUrl(),
		   source,
		   new String[] {
			   "help", "Image URL to use on PayPal"
		   });
		addAnnotation
		  (getPaymentGatewayPayPal_NotifyUrl(),
		   source,
		   new String[] {
			   "help", "Notify URL"
		   });
		addAnnotation
		  (getPaymentGatewayPayPal_RedirectUrl(),
		   source,
		   new String[] {
			   "help", "PayPal Redirect URL (Sandbox/Production)"
		   });
		addAnnotation
		  (getPaymentGatewayPayPal_RequireConfirmedShipping(),
		   source,
		   new String[] {
			   "help", "Indicates that you require that the customer\u2019s shipping address on file with PayPal be a confirmed address."
		   });
		addAnnotation
		  (getPaymentGatewayPayPal_ReturnUrl(),
		   source,
		   new String[] {
			   "help", "Return URL"
		   });
		addAnnotation
		  (getPaymentGatewayPayPal_ShippingCallbackUrl(),
		   source,
		   new String[] {
			   "help", "Specific to Express Checkout which performs callbacks to our server to retrieve shipping estimates"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_CancelReturnUrl(),
		   source,
		   new String[] {
			   "help", "Express Checkout Return On Cancel URL"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_CertsPath(),
		   source,
		   new String[] {
			   "help", "Path the the VeriSign Certificate"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_CheckAvs(),
		   source,
		   new String[] {
			   "help", "Use Address Verification"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_CheckCvv2(),
		   source,
		   new String[] {
			   "help", "Require CVV2 Verification"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_EnableTransmit(),
		   source,
		   new String[] {
			   "help", "Set to false to not transmit anything"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_HostAddress(),
		   source,
		   new String[] {
			   "help", "Address of the payment processor"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_HostPort(),
		   source,
		   new String[] {
			   "help", "Port of the payment processor"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_LogFileName(),
		   source,
		   new String[] {
			   "help", "Log file name"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_LoggingLevel(),
		   source,
		   new String[] {
			   "help", "Logging level"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_MaxLogFileSize(),
		   source,
		   new String[] {
			   "help", "Max log file size"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_Partner(),
		   source,
		   new String[] {
			   "help", "PayFlow Partner of account information"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_PreAuth(),
		   source,
		   new String[] {
			   "help", "Pre-Authorize Payments (if set to N will auto-capture)"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_ProxyAddress(),
		   source,
		   new String[] {
			   "help", "Proxy Address"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_ProxyLogon(),
		   source,
		   new String[] {
			   "help", "Proxy Logon"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_ProxyPassword(),
		   source,
		   new String[] {
			   "encrypt", "TRUE",
			   "help", "Proxy Password"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_ProxyPort(),
		   source,
		   new String[] {
			   "help", "Proxy Port"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_Pwd(),
		   source,
		   new String[] {
			   "encrypt", "TRUE",
			   "help", "PayFlow Password of account information"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_RedirectUrl(),
		   source,
		   new String[] {
			   "help", "Express Checkout Redirect URL"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_ReturnUrl(),
		   source,
		   new String[] {
			   "help", "Express Checkout Return URL"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_StackTraceOn(),
		   source,
		   new String[] {
			   "help", "Stack trace on/off"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_Timeout(),
		   source,
		   new String[] {
			   "help", "Timeout"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_UserId(),
		   source,
		   new String[] {
			   "help", "PayFlow UserID of account information"
		   });
		addAnnotation
		  (getPaymentGatewayPayflowPro_Vendor(),
		   source,
		   new String[] {
			   "help", "Vendor of account information"
		   });
		addAnnotation
		  (getPaymentGatewaySagePay_AuthenticationTransType(),
		   source,
		   new String[] {
			   "help", "Authentication type (PAYMENT/AUTHENTICATE/DEFERRED)"
		   });
		addAnnotation
		  (getPaymentGatewaySagePay_AuthenticationUrl(),
		   source,
		   new String[] {
			   "help", "Authentication Url"
		   });
		addAnnotation
		  (getPaymentGatewaySagePay_AuthoriseTransType(),
		   source,
		   new String[] {
			   "help", "Authorise type (AUTHORISE/RELEASE)"
		   });
		addAnnotation
		  (getPaymentGatewaySagePay_AuthoriseUrl(),
		   source,
		   new String[] {
			   "help", "Authorise url"
		   });
		addAnnotation
		  (getPaymentGatewaySagePay_ProductionHost(),
		   source,
		   new String[] {
			   "help", "Production Host"
		   });
		addAnnotation
		  (getPaymentGatewaySagePay_ProtocolVersion(),
		   source,
		   new String[] {
			   "help", "Protocol Version"
		   });
		addAnnotation
		  (getPaymentGatewaySagePay_RefundUrl(),
		   source,
		   new String[] {
			   "help", "Refund Url"
		   });
		addAnnotation
		  (getPaymentGatewaySagePay_ReleaseTransType(),
		   source,
		   new String[] {
			   "help", "Release type (CANCEL/ABORT)"
		   });
		addAnnotation
		  (getPaymentGatewaySagePay_ReleaseUrl(),
		   source,
		   new String[] {
			   "help", "Release Url"
		   });
		addAnnotation
		  (getPaymentGatewaySagePay_SagePayMode(),
		   source,
		   new String[] {
			   "help", "Mode (PRODUCTION/TEST)"
		   });
		addAnnotation
		  (getPaymentGatewaySagePay_TestingHost(),
		   source,
		   new String[] {
			   "help", "Testing Host"
		   });
		addAnnotation
		  (getPaymentGatewaySagePay_Vendor(),
		   source,
		   new String[] {
			   "help", "Vendor name"
		   });
		addAnnotation
		  (getPaymentGatewaySagePay_VoidUrl(),
		   source,
		   new String[] {
			   "help", "Void Url"
		   });
		addAnnotation
		  (getPaymentGatewaySecurePay_EnableAmountRound(),
		   source,
		   new String[] {
			   "help", "Enable rounds the currency amount to .00 (Y / N)"
		   });
		addAnnotation
		  (getPaymentGatewaySecurePay_MerchantId(),
		   source,
		   new String[] {
			   "help", "You merchant ID"
		   });
		addAnnotation
		  (getPaymentGatewaySecurePay_ProcessTimeout(),
		   source,
		   new String[] {
			   "help", "Process Timeout"
		   });
		addAnnotation
		  (getPaymentGatewaySecurePay_Pwd(),
		   source,
		   new String[] {
			   "encrypt", "TRUE",
			   "help", "SecurePay Password of account information"
		   });
		addAnnotation
		  (getPaymentGatewaySecurePay_ServerURL(),
		   source,
		   new String[] {
			   "help", "Server URL of the payment processor"
		   });
		addAnnotation
		  (getPaymentGatewayWorldPay_AuthMode(),
		   source,
		   new String[] {
			   "help", "Authorization Mode (A: Full-Auth / E: Pre-Auth)"
		   });
		addAnnotation
		  (getPaymentGatewayWorldPay_FixContact(),
		   source,
		   new String[] {
			   "help", "Will displace contact info on WorldPay in non-editable format"
		   });
		addAnnotation
		  (getPaymentGatewayWorldPay_HideContact(),
		   source,
		   new String[] {
			   "help", "Will hide the contact info completely"
		   });
		addAnnotation
		  (getPaymentGatewayWorldPay_HideCurrency(),
		   source,
		   new String[] {
			   "help", "This causes the currency drop down to be no hidden, so fixing the currency that the shopper must value purchase in"
		   });
		addAnnotation
		  (getPaymentGatewayWorldPay_InstId(),
		   source,
		   new String[] {
			   "encrypt", "TRUE",
			   "help", "Worldpay instance Id"
		   });
		addAnnotation
		  (getPaymentGatewayWorldPay_LangId(),
		   source,
		   new String[] {
			   "help", "The shopper\'s language choice, as a 2-character ISO 639 code, with optional regionalisation using 2-character country code separated by hyphen"
		   });
		addAnnotation
		  (getPaymentGatewayWorldPay_NoLanguageMenu(),
		   source,
		   new String[] {
			   "help", "This suppresses the display of the language menu if noLanguageMenu no you have a choice of languages enabled for your value installation"
		   });
		addAnnotation
		  (getPaymentGatewayWorldPay_RedirectUrl(),
		   source,
		   new String[] {
			   "help", "Redirect URL"
		   });
		addAnnotation
		  (getPaymentGatewayWorldPay_TestMode(),
		   source,
		   new String[] {
			   "help", "Test Mode (100: approve / 101: cancelled / 0: Live Mode (no test)"
		   });
		addAnnotation
		  (getPaymentGatewayWorldPay_WithDelivery(),
		   source,
		   new String[] {
			   "help", "Displays input fields for delivery address and withDelivery no mandate that they be filled in"
		   });
		addAnnotation
		  (getPaymentGlAccountTypeMap_PaymentTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPaymentGlAccountTypeMap_OrganizationPartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPaymentGroupMember_PaymentGroupId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPaymentGroupMember_PaymentId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPaymentGroupMember_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPaymentMethodTypeGlAccount_PaymentMethodTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPaymentMethodTypeGlAccount_OrganizationPartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPaymentTypeAttr_PaymentTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPaymentTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
	}

} //PaymentPackageImpl
