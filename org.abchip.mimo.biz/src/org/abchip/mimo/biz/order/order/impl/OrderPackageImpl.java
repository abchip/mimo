/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order.impl;

import org.abchip.mimo.MimoPackage;
import org.abchip.mimo.biz.BizPackage;
import org.abchip.mimo.biz.accounting.budget.BudgetPackage;
import org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl;
import org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage;
import org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountPackageImpl;
import org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage;
import org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl;
import org.abchip.mimo.biz.accounting.invoice.InvoicePackage;
import org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl;
import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl;
import org.abchip.mimo.biz.accounting.rate.RatePackage;
import org.abchip.mimo.biz.accounting.rate.impl.RatePackageImpl;
import org.abchip.mimo.biz.accounting.tax.TaxPackage;
import org.abchip.mimo.biz.accounting.tax.impl.TaxPackageImpl;
import org.abchip.mimo.biz.catalina.session.SessionPackage;
import org.abchip.mimo.biz.catalina.session.impl.SessionPackageImpl;
import org.abchip.mimo.biz.common.datasource.DatasourcePackage;
import org.abchip.mimo.biz.common.datasource.impl.DatasourcePackageImpl;
import org.abchip.mimo.biz.common.email.EmailPackage;
import org.abchip.mimo.biz.common.email.impl.EmailPackageImpl;
import org.abchip.mimo.biz.common.enum_.EnumPackage;
import org.abchip.mimo.biz.common.enum_.impl.EnumPackageImpl;
import org.abchip.mimo.biz.common.geo.GeoPackage;
import org.abchip.mimo.biz.common.geo.impl.GeoPackageImpl;
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
import org.abchip.mimo.biz.order.order.CommunicationEventOrder;
import org.abchip.mimo.biz.order.order.OrderAdjustment;
import org.abchip.mimo.biz.order.order.OrderAdjustmentAttribute;
import org.abchip.mimo.biz.order.order.OrderAdjustmentBilling;
import org.abchip.mimo.biz.order.order.OrderAdjustmentType;
import org.abchip.mimo.biz.order.order.OrderAdjustmentTypeAttr;
import org.abchip.mimo.biz.order.order.OrderAttribute;
import org.abchip.mimo.biz.order.order.OrderBlacklist;
import org.abchip.mimo.biz.order.order.OrderBlacklistType;
import org.abchip.mimo.biz.order.order.OrderContactMech;
import org.abchip.mimo.biz.order.order.OrderContent;
import org.abchip.mimo.biz.order.order.OrderContentType;
import org.abchip.mimo.biz.order.order.OrderDeliverySchedule;
import org.abchip.mimo.biz.order.order.OrderFactory;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.order.order.OrderHeaderNote;
import org.abchip.mimo.biz.order.order.OrderHeaderWorkEffort;
import org.abchip.mimo.biz.order.order.OrderItem;
import org.abchip.mimo.biz.order.order.OrderItemAssoc;
import org.abchip.mimo.biz.order.order.OrderItemAssocType;
import org.abchip.mimo.biz.order.order.OrderItemAttribute;
import org.abchip.mimo.biz.order.order.OrderItemBilling;
import org.abchip.mimo.biz.order.order.OrderItemChange;
import org.abchip.mimo.biz.order.order.OrderItemContactMech;
import org.abchip.mimo.biz.order.order.OrderItemGroup;
import org.abchip.mimo.biz.order.order.OrderItemGroupOrder;
import org.abchip.mimo.biz.order.order.OrderItemPriceInfo;
import org.abchip.mimo.biz.order.order.OrderItemRole;
import org.abchip.mimo.biz.order.order.OrderItemShipGroup;
import org.abchip.mimo.biz.order.order.OrderItemShipGroupAssoc;
import org.abchip.mimo.biz.order.order.OrderItemShipGrpInvRes;
import org.abchip.mimo.biz.order.order.OrderItemType;
import org.abchip.mimo.biz.order.order.OrderItemTypeAttr;
import org.abchip.mimo.biz.order.order.OrderNotification;
import org.abchip.mimo.biz.order.order.OrderPackage;
import org.abchip.mimo.biz.order.order.OrderPaymentPreference;
import org.abchip.mimo.biz.order.order.OrderProductPromoCode;
import org.abchip.mimo.biz.order.order.OrderRole;
import org.abchip.mimo.biz.order.order.OrderShipment;
import org.abchip.mimo.biz.order.order.OrderStatus;
import org.abchip.mimo.biz.order.order.OrderSummaryEntry;
import org.abchip.mimo.biz.order.order.OrderTerm;
import org.abchip.mimo.biz.order.order.OrderTermAttribute;
import org.abchip.mimo.biz.order.order.OrderType;
import org.abchip.mimo.biz.order.order.OrderTypeAttr;
import org.abchip.mimo.biz.order.order.ProductOrderItem;
import org.abchip.mimo.biz.order.order.WorkOrderItemFulfillment;
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
import org.abchip.mimo.entity.EntityPackage;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrderPackageImpl extends EPackageImpl implements OrderPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationEventOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderAdjustmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderAdjustmentAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderAdjustmentBillingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderAdjustmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderAdjustmentTypeAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderBlacklistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderBlacklistTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderContactMechEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderContentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderDeliveryScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderHeaderNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderHeaderWorkEffortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemAssocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemAssocTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemBillingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemContactMechEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemGroupOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemPriceInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemShipGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemShipGroupAssocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemShipGrpInvResEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderItemTypeAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderNotificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderPaymentPreferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderProductPromoCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderShipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderSummaryEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderTermAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderTypeAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productOrderItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workOrderItemFulfillmentEClass = null;

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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OrderPackageImpl() {
		super(eNS_URI, OrderFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OrderPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OrderPackage init() {
		if (isInited) return (OrderPackage)EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOrderPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OrderPackageImpl theOrderPackage = registeredOrderPackage instanceof OrderPackageImpl ? (OrderPackageImpl)registeredOrderPackage : new OrderPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		MimoPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BizPackage.eNS_URI);
		BizPackageImpl theBizPackage = (BizPackageImpl)(registeredPackage instanceof BizPackageImpl ? registeredPackage : BizPackage.eINSTANCE);
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PaymentPackage.eNS_URI);
		PaymentPackageImpl thePaymentPackage = (PaymentPackageImpl)(registeredPackage instanceof PaymentPackageImpl ? registeredPackage : PaymentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RatePackage.eNS_URI);
		RatePackageImpl theRatePackage = (RatePackageImpl)(registeredPackage instanceof RatePackageImpl ? registeredPackage : RatePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TaxPackage.eNS_URI);
		TaxPackageImpl theTaxPackage = (TaxPackageImpl)(registeredPackage instanceof TaxPackageImpl ? registeredPackage : TaxPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SessionPackage.eNS_URI);
		SessionPackageImpl theSessionPackage = (SessionPackageImpl)(registeredPackage instanceof SessionPackageImpl ? registeredPackage : SessionPackage.eINSTANCE);
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.entity.EntityPackage.eNS_URI);
		EntityPackageImpl theEntityPackage = (EntityPackageImpl)(registeredPackage instanceof EntityPackageImpl ? registeredPackage : org.abchip.mimo.biz.entity.EntityPackage.eINSTANCE);
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BomPackage.eNS_URI);
		BomPackageImpl theBomPackage = (BomPackageImpl)(registeredPackage instanceof BomPackageImpl ? registeredPackage : BomPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MrpPackage.eNS_URI);
		MrpPackageImpl theMrpPackage = (MrpPackageImpl)(registeredPackage instanceof MrpPackageImpl ? registeredPackage : MrpPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TechdataPackage.eNS_URI);
		TechdataPackageImpl theTechdataPackage = (TechdataPackageImpl)(registeredPackage instanceof TechdataPackageImpl ? registeredPackage : TechdataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AgreementPackage.eNS_URI);
		AgreementPackageImpl theAgreementPackage = (AgreementPackageImpl)(registeredPackage instanceof AgreementPackageImpl ? registeredPackage : AgreementPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI);
		CommunicationPackageImpl theCommunicationPackage = (CommunicationPackageImpl)(registeredPackage instanceof CommunicationPackageImpl ? registeredPackage : CommunicationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.party.contact.ContactPackage.eNS_URI);
		org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl theContactPackage_1 = (org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl)(registeredPackage instanceof org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl ? registeredPackage : org.abchip.mimo.biz.party.contact.ContactPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NeedPackage.eNS_URI);
		NeedPackageImpl theNeedPackage = (NeedPackageImpl)(registeredPackage instanceof NeedPackageImpl ? registeredPackage : NeedPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PartyPackage.eNS_URI);
		PartyPackageImpl thePartyPackage = (PartyPackageImpl)(registeredPackage instanceof PartyPackageImpl ? registeredPackage : PartyPackage.eINSTANCE);
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
		theOrderPackage.createPackageContents();
		theBizPackage.createPackageContents();
		theBudgetPackage.createPackageContents();
		theFinaccountPackage.createPackageContents();
		theFixedassetPackage.createPackageContents();
		theInvoicePackage.createPackageContents();
		theLedgerPackage.createPackageContents();
		thePaymentPackage.createPackageContents();
		theRatePackage.createPackageContents();
		theTaxPackage.createPackageContents();
		theSessionPackage.createPackageContents();
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
		theQuotePackage.createPackageContents();
		theRequestPackage.createPackageContents();
		theRequirementPackage.createPackageContents();
		theReservationsPackage.createPackageContents();
		theReturnPackage.createPackageContents();
		theShoppingcartPackage.createPackageContents();
		theShoppinglistPackage.createPackageContents();
		theCampaignPackage.createPackageContents();
		theContactPackage.createPackageContents();
		theOpportunityPackage.createPackageContents();
		theSegmentPackage.createPackageContents();
		theTrackingPackage.createPackageContents();
		theBomPackage.createPackageContents();
		theMrpPackage.createPackageContents();
		theTechdataPackage.createPackageContents();
		theAgreementPackage.createPackageContents();
		theCommunicationPackage.createPackageContents();
		theContactPackage_1.createPackageContents();
		theNeedPackage.createPackageContents();
		thePartyPackage.createPackageContents();
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
		theOrderPackage.initializePackageContents();
		theBizPackage.initializePackageContents();
		theBudgetPackage.initializePackageContents();
		theFinaccountPackage.initializePackageContents();
		theFixedassetPackage.initializePackageContents();
		theInvoicePackage.initializePackageContents();
		theLedgerPackage.initializePackageContents();
		thePaymentPackage.initializePackageContents();
		theRatePackage.initializePackageContents();
		theTaxPackage.initializePackageContents();
		theSessionPackage.initializePackageContents();
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
		theQuotePackage.initializePackageContents();
		theRequestPackage.initializePackageContents();
		theRequirementPackage.initializePackageContents();
		theReservationsPackage.initializePackageContents();
		theReturnPackage.initializePackageContents();
		theShoppingcartPackage.initializePackageContents();
		theShoppinglistPackage.initializePackageContents();
		theCampaignPackage.initializePackageContents();
		theContactPackage.initializePackageContents();
		theOpportunityPackage.initializePackageContents();
		theSegmentPackage.initializePackageContents();
		theTrackingPackage.initializePackageContents();
		theBomPackage.initializePackageContents();
		theMrpPackage.initializePackageContents();
		theTechdataPackage.initializePackageContents();
		theAgreementPackage.initializePackageContents();
		theCommunicationPackage.initializePackageContents();
		theContactPackage_1.initializePackageContents();
		theNeedPackage.initializePackageContents();
		thePartyPackage.initializePackageContents();
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
		theOrderPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OrderPackage.eNS_URI, theOrderPackage);
		return theOrderPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommunicationEventOrder() {
		return communicationEventOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationEventOrder_OrderId() {
		return (EAttribute)communicationEventOrderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationEventOrder_CommunicationEventId() {
		return (EAttribute)communicationEventOrderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderAdjustment() {
		return orderAdjustmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_OrderAdjustmentId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_Amount() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_AmountAlreadyIncluded() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_Comments() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_CorrespondingProductId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_CreatedByUserLogin() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_CreatedDate() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_CustomerReferenceId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_Description() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_ExemptAmount() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_IncludeInShipping() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_IncludeInTax() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_IsManual() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_LastModifiedByUserLogin() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_LastModifiedDate() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_OldAmountPerQuantity() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_OldPercentage() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_OrderAdjustmentTypeId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_OrderId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_OrderItemSeqId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_OriginalAdjustmentId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_OverrideGlAccountId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_PrimaryGeoId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_ProductFeatureId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_ProductPromoActionSeqId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_ProductPromoId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_ProductPromoRuleId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_RecurringAmount() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_SecondaryGeoId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_ShipGroupSeqId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_SourcePercentage() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_SourceReferenceId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_TaxAuthGeoId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_TaxAuthPartyId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_TaxAuthorityRateSeqId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_OrderAdjustmentAttributes() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderAdjustmentAttribute() {
		return orderAdjustmentAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentAttribute_OrderAdjustmentId() {
		return (EAttribute)orderAdjustmentAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentAttribute_AttrName() {
		return (EAttribute)orderAdjustmentAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentAttribute_AttrDescription() {
		return (EAttribute)orderAdjustmentAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentAttribute_AttrValue() {
		return (EAttribute)orderAdjustmentAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderAdjustmentBilling() {
		return orderAdjustmentBillingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentBilling_OrderAdjustmentId() {
		return (EAttribute)orderAdjustmentBillingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentBilling_InvoiceId() {
		return (EAttribute)orderAdjustmentBillingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentBilling_InvoiceItemSeqId() {
		return (EAttribute)orderAdjustmentBillingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentBilling_Amount() {
		return (EAttribute)orderAdjustmentBillingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderAdjustmentType() {
		return orderAdjustmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentType_OrderAdjustmentTypeId() {
		return (EAttribute)orderAdjustmentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentType_Description() {
		return (EAttribute)orderAdjustmentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentType_HasTable() {
		return (EAttribute)orderAdjustmentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentType_ParentTypeId() {
		return (EAttribute)orderAdjustmentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentType_OrderAdjustmentTypeAttrs() {
		return (EAttribute)orderAdjustmentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderAdjustmentTypeAttr() {
		return orderAdjustmentTypeAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentTypeAttr_OrderAdjustmentTypeId() {
		return (EAttribute)orderAdjustmentTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentTypeAttr_AttrName() {
		return (EAttribute)orderAdjustmentTypeAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentTypeAttr_Description() {
		return (EAttribute)orderAdjustmentTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderAttribute() {
		return orderAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAttribute_OrderId() {
		return (EAttribute)orderAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAttribute_AttrName() {
		return (EAttribute)orderAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAttribute_AttrDescription() {
		return (EAttribute)orderAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAttribute_AttrValue() {
		return (EAttribute)orderAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderBlacklist() {
		return orderBlacklistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderBlacklist_BlacklistString() {
		return (EAttribute)orderBlacklistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderBlacklist_OrderBlacklistTypeId() {
		return (EAttribute)orderBlacklistEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderBlacklistType() {
		return orderBlacklistTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderBlacklistType_OrderBlacklistTypeId() {
		return (EAttribute)orderBlacklistTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderBlacklistType_Description() {
		return (EAttribute)orderBlacklistTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderContactMech() {
		return orderContactMechEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderContactMech_OrderId() {
		return (EAttribute)orderContactMechEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderContactMech_ContactMechPurposeTypeId() {
		return (EAttribute)orderContactMechEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderContactMech_ContactMechId() {
		return (EAttribute)orderContactMechEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderContent() {
		return orderContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderContent_ContentId() {
		return (EAttribute)orderContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderContent_OrderId() {
		return (EAttribute)orderContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderContent_OrderItemSeqId() {
		return (EAttribute)orderContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderContent_OrderContentTypeId() {
		return (EAttribute)orderContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderContent_FromDate() {
		return (EAttribute)orderContentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderContent_ThruDate() {
		return (EAttribute)orderContentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderContentType() {
		return orderContentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderContentType_OrderContentTypeId() {
		return (EAttribute)orderContentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderContentType_Description() {
		return (EAttribute)orderContentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderContentType_HasTable() {
		return (EAttribute)orderContentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderContentType_ParentTypeId() {
		return (EAttribute)orderContentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderDeliverySchedule() {
		return orderDeliveryScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderDeliverySchedule_OrderId() {
		return (EAttribute)orderDeliveryScheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderDeliverySchedule_OrderItemSeqId() {
		return (EAttribute)orderDeliveryScheduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderDeliverySchedule_Cartons() {
		return (EAttribute)orderDeliveryScheduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderDeliverySchedule_EstimatedReadyDate() {
		return (EAttribute)orderDeliveryScheduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderDeliverySchedule_SkidsPallets() {
		return (EAttribute)orderDeliveryScheduleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderDeliverySchedule_StatusId() {
		return (EAttribute)orderDeliveryScheduleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderDeliverySchedule_TotalCubicSize() {
		return (EAttribute)orderDeliveryScheduleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderDeliverySchedule_TotalCubicUomId() {
		return (EAttribute)orderDeliveryScheduleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderDeliverySchedule_TotalWeight() {
		return (EAttribute)orderDeliveryScheduleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderDeliverySchedule_TotalWeightUomId() {
		return (EAttribute)orderDeliveryScheduleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderDeliverySchedule_UnitsPieces() {
		return (EAttribute)orderDeliveryScheduleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderHeader() {
		return orderHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_OrderId() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_AgreementId() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_AutoOrderShoppingListId() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_BillingAccountId() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_CreatedBy() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_CurrencyUom() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_EntryDate() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_ExternalId() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_FirstAttemptOrderId() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_GrandTotal() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_InternalCode() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_InvoicePerShipment() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_IsRushOrder() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_IsViewed() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_NeedsInventoryIssuance() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_OrderDate() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_OrderName() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_OrderTypeId() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_OriginFacilityId() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_PickSheetPrintedDate() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_Priority() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_ProductStoreId() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_RemainingSubTotal() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_SalesChannelEnumId() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_StatusId() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_SyncStatusId() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_TerminalId() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_TransactionId() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_VisitId() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_WebSiteId() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_CommunicationEventOrders() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_OrderAttributes() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_OrderDeliverySchedules() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_OrderHeaderNotes() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_OrderHeaderWorkEfforts() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_OrderItems() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_OrderItemGroups() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_OrderItemShipGroups() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_OrderProductPromoCodes() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_ProductPromoUses() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_TrackingCodeOrders() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderHeaderNote() {
		return orderHeaderNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeaderNote_OrderId() {
		return (EAttribute)orderHeaderNoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeaderNote_InternalNote() {
		return (EAttribute)orderHeaderNoteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderHeaderWorkEffort() {
		return orderHeaderWorkEffortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeaderWorkEffort_OrderId() {
		return (EAttribute)orderHeaderWorkEffortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeaderWorkEffort_WorkEffortId() {
		return (EAttribute)orderHeaderWorkEffortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItem() {
		return orderItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_OrderId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_OrderItemSeqId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_AutoCancelDate() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_BudgetId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_BudgetItemSeqId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_CancelBackOrderDate() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_CancelQuantity() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ChangeByUserLoginId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_Comments() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_CorrespondingPoId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_DeploymentId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_DontCancelSetDate() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_DontCancelSetUserLogin() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_EstimatedDeliveryDate() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_EstimatedShipDate() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ExternalId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_FromInventoryItemId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_IsItemGroupPrimary() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_IsModifiedPrice() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_IsPromo() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ItemDescription() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_OrderItemGroupSeqId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_OrderItemTypeId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_OverrideGlAccountId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ProdCatalogId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ProductCategoryId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ProductFeatureId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ProductId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_Quantity() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_QuoteId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_QuoteItemSeqId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_RecurringFreqUomId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ReserveAfterDate() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_SalesOpportunityId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_SelectedAmount() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ShipAfterDate() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ShipBeforeDate() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ShoppingListId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ShoppingListItemSeqId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_StatusId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_SubscriptionId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_SupplierProductId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_SyncStatusId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_UnitAverageCost() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_UnitListPrice() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_UnitPrice() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_UnitRecurringPrice() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemAssoc() {
		return orderItemAssocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAssoc_OrderId() {
		return (EAttribute)orderItemAssocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAssoc_OrderItemSeqId() {
		return (EAttribute)orderItemAssocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAssoc_ShipGroupSeqId() {
		return (EAttribute)orderItemAssocEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAssoc_ToOrderId() {
		return (EAttribute)orderItemAssocEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAssoc_ToOrderItemSeqId() {
		return (EAttribute)orderItemAssocEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAssoc_ToShipGroupSeqId() {
		return (EAttribute)orderItemAssocEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAssoc_OrderItemAssocTypeId() {
		return (EAttribute)orderItemAssocEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAssoc_Quantity() {
		return (EAttribute)orderItemAssocEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemAssocType() {
		return orderItemAssocTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAssocType_OrderItemAssocTypeId() {
		return (EAttribute)orderItemAssocTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAssocType_Description() {
		return (EAttribute)orderItemAssocTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAssocType_HasTable() {
		return (EAttribute)orderItemAssocTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAssocType_ParentTypeId() {
		return (EAttribute)orderItemAssocTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemAttribute() {
		return orderItemAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAttribute_OrderId() {
		return (EAttribute)orderItemAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAttribute_OrderItemSeqId() {
		return (EAttribute)orderItemAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAttribute_AttrName() {
		return (EAttribute)orderItemAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAttribute_AttrDescription() {
		return (EAttribute)orderItemAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAttribute_AttrValue() {
		return (EAttribute)orderItemAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemBilling() {
		return orderItemBillingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemBilling_OrderId() {
		return (EAttribute)orderItemBillingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemBilling_OrderItemSeqId() {
		return (EAttribute)orderItemBillingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemBilling_InvoiceId() {
		return (EAttribute)orderItemBillingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemBilling_InvoiceItemSeqId() {
		return (EAttribute)orderItemBillingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemBilling_Amount() {
		return (EAttribute)orderItemBillingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemBilling_ItemIssuanceId() {
		return (EAttribute)orderItemBillingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemBilling_Quantity() {
		return (EAttribute)orderItemBillingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemBilling_ShipmentReceiptId() {
		return (EAttribute)orderItemBillingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemChange() {
		return orderItemChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemChange_OrderItemChangeId() {
		return (EAttribute)orderItemChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemChange_CancelQuantity() {
		return (EAttribute)orderItemChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemChange_ChangeComments() {
		return (EAttribute)orderItemChangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemChange_ChangeDatetime() {
		return (EAttribute)orderItemChangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemChange_ChangeTypeEnumId() {
		return (EAttribute)orderItemChangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemChange_ChangeUserLogin() {
		return (EAttribute)orderItemChangeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemChange_ItemDescription() {
		return (EAttribute)orderItemChangeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemChange_OrderId() {
		return (EAttribute)orderItemChangeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemChange_OrderItemSeqId() {
		return (EAttribute)orderItemChangeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemChange_Quantity() {
		return (EAttribute)orderItemChangeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemChange_ReasonEnumId() {
		return (EAttribute)orderItemChangeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemChange_UnitPrice() {
		return (EAttribute)orderItemChangeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemContactMech() {
		return orderItemContactMechEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemContactMech_OrderId() {
		return (EAttribute)orderItemContactMechEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemContactMech_OrderItemSeqId() {
		return (EAttribute)orderItemContactMechEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemContactMech_ContactMechPurposeTypeId() {
		return (EAttribute)orderItemContactMechEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemContactMech_ContactMechId() {
		return (EAttribute)orderItemContactMechEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemGroup() {
		return orderItemGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemGroup_OrderId() {
		return (EAttribute)orderItemGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemGroup_OrderItemGroupSeqId() {
		return (EAttribute)orderItemGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemGroup_GroupName() {
		return (EAttribute)orderItemGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemGroup_ParentGroupSeqId() {
		return (EAttribute)orderItemGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemGroupOrder() {
		return orderItemGroupOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemGroupOrder_OrderId() {
		return (EAttribute)orderItemGroupOrderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemGroupOrder_OrderItemSeqId() {
		return (EAttribute)orderItemGroupOrderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemGroupOrder_GroupOrderId() {
		return (EAttribute)orderItemGroupOrderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemPriceInfo() {
		return orderItemPriceInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemPriceInfo_OrderItemPriceInfoId() {
		return (EAttribute)orderItemPriceInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemPriceInfo_Description() {
		return (EAttribute)orderItemPriceInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemPriceInfo_ModifyAmount() {
		return (EAttribute)orderItemPriceInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemPriceInfo_OrderId() {
		return (EAttribute)orderItemPriceInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemPriceInfo_OrderItemSeqId() {
		return (EAttribute)orderItemPriceInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemPriceInfo_ProductPriceActionSeqId() {
		return (EAttribute)orderItemPriceInfoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemPriceInfo_ProductPriceRuleId() {
		return (EAttribute)orderItemPriceInfoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemPriceInfo_RateCode() {
		return (EAttribute)orderItemPriceInfoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemRole() {
		return orderItemRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemRole_OrderId() {
		return (EAttribute)orderItemRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemRole_OrderItemSeqId() {
		return (EAttribute)orderItemRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemRole_PartyId() {
		return (EAttribute)orderItemRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemRole_RoleTypeId() {
		return (EAttribute)orderItemRoleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemShipGroup() {
		return orderItemShipGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_OrderId() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_ShipGroupSeqId() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_CarrierPartyId() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_CarrierRoleTypeId() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_ContactMechId() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_EstimatedDeliveryDate() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_EstimatedShipDate() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_FacilityId() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_GiftMessage() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_IsGift() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_MaySplit() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_ShipAfterDate() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_ShipByDate() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_ShipmentMethodTypeId() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_ShippingInstructions() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_SupplierAgreementId() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_SupplierPartyId() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_TelecomContactMechId() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_TrackingNumber() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_VendorPartyId() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemShipGroupAssoc() {
		return orderItemShipGroupAssocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroupAssoc_OrderId() {
		return (EAttribute)orderItemShipGroupAssocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroupAssoc_OrderItemSeqId() {
		return (EAttribute)orderItemShipGroupAssocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroupAssoc_ShipGroupSeqId() {
		return (EAttribute)orderItemShipGroupAssocEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroupAssoc_CancelQuantity() {
		return (EAttribute)orderItemShipGroupAssocEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroupAssoc_Quantity() {
		return (EAttribute)orderItemShipGroupAssocEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemShipGrpInvRes() {
		return orderItemShipGrpInvResEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_OrderId() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_ShipGroupSeqId() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_OrderItemSeqId() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_InventoryItemId() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_CreatedDatetime() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_CurrentPromisedDate() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_OldPickStartDate() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_Priority() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_PromisedDatetime() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_Quantity() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_QuantityNotAvailable() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_ReserveOrderEnumId() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_ReservedDatetime() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_SequenceId() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemType() {
		return orderItemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemType_OrderItemTypeId() {
		return (EAttribute)orderItemTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemType_Description() {
		return (EAttribute)orderItemTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemType_HasTable() {
		return (EAttribute)orderItemTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemType_ParentTypeId() {
		return (EAttribute)orderItemTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemType_OrderItemTypeAttrs() {
		return (EAttribute)orderItemTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderItemTypeAttr() {
		return orderItemTypeAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemTypeAttr_OrderItemTypeId() {
		return (EAttribute)orderItemTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemTypeAttr_AttrName() {
		return (EAttribute)orderItemTypeAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemTypeAttr_Description() {
		return (EAttribute)orderItemTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderNotification() {
		return orderNotificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderNotification_OrderNotificationId() {
		return (EAttribute)orderNotificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderNotification_Comments() {
		return (EAttribute)orderNotificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderNotification_EmailType() {
		return (EAttribute)orderNotificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderNotification_NotificationDate() {
		return (EAttribute)orderNotificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderNotification_OrderId() {
		return (EAttribute)orderNotificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderPaymentPreference() {
		return orderPaymentPreferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_OrderPaymentPreferenceId() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_BillingPostalCode() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_CreatedByUserLogin() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_CreatedDate() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_FinAccountId() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_LastModifiedByUserLogin() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_LastModifiedDate() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_ManualAuthCode() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_ManualRefNum() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_MaxAmount() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_NeedsNsfRetry() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_OrderId() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_OrderItemSeqId() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_OverflowFlag() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_PaymentMethodId() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_PaymentMethodTypeId() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_PresentFlag() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_ProcessAttempt() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_ProductPricePurposeId() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_SecurityCode() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_ShipGroupSeqId() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_StatusId() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_SwipedFlag() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_Track2() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderProductPromoCode() {
		return orderProductPromoCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderProductPromoCode_OrderId() {
		return (EAttribute)orderProductPromoCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderProductPromoCode_ProductPromoCodeId() {
		return (EAttribute)orderProductPromoCodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderRole() {
		return orderRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderRole_OrderId() {
		return (EAttribute)orderRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderRole_PartyId() {
		return (EAttribute)orderRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderRole_RoleTypeId() {
		return (EAttribute)orderRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderShipment() {
		return orderShipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderShipment_OrderId() {
		return (EAttribute)orderShipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderShipment_OrderItemSeqId() {
		return (EAttribute)orderShipmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderShipment_ShipGroupSeqId() {
		return (EAttribute)orderShipmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderShipment_ShipmentId() {
		return (EAttribute)orderShipmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderShipment_ShipmentItemSeqId() {
		return (EAttribute)orderShipmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderShipment_Quantity() {
		return (EAttribute)orderShipmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderStatus() {
		return orderStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderStatus_OrderStatusId() {
		return (EAttribute)orderStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderStatus_ChangeReason() {
		return (EAttribute)orderStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderStatus_OrderId() {
		return (EAttribute)orderStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderStatus_OrderItemSeqId() {
		return (EAttribute)orderStatusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderStatus_OrderPaymentPreferenceId() {
		return (EAttribute)orderStatusEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderStatus_StatusDatetime() {
		return (EAttribute)orderStatusEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderStatus_StatusId() {
		return (EAttribute)orderStatusEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderStatus_StatusUserLogin() {
		return (EAttribute)orderStatusEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderSummaryEntry() {
		return orderSummaryEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderSummaryEntry_EntryDate() {
		return (EAttribute)orderSummaryEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderSummaryEntry_ProductId() {
		return (EAttribute)orderSummaryEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderSummaryEntry_FacilityId() {
		return (EAttribute)orderSummaryEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderSummaryEntry_GrossSales() {
		return (EAttribute)orderSummaryEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderSummaryEntry_ProductCost() {
		return (EAttribute)orderSummaryEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderSummaryEntry_TotalQuantity() {
		return (EAttribute)orderSummaryEntryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderTerm() {
		return orderTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTerm_TermTypeId() {
		return (EAttribute)orderTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTerm_OrderId() {
		return (EAttribute)orderTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTerm_OrderItemSeqId() {
		return (EAttribute)orderTermEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTerm_Description() {
		return (EAttribute)orderTermEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTerm_TermDays() {
		return (EAttribute)orderTermEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTerm_TermValue() {
		return (EAttribute)orderTermEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTerm_TextValue() {
		return (EAttribute)orderTermEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTerm_UomId() {
		return (EAttribute)orderTermEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderTermAttribute() {
		return orderTermAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTermAttribute_TermTypeId() {
		return (EAttribute)orderTermAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTermAttribute_OrderId() {
		return (EAttribute)orderTermAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTermAttribute_OrderItemSeqId() {
		return (EAttribute)orderTermAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTermAttribute_AttrName() {
		return (EAttribute)orderTermAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTermAttribute_AttrDescription() {
		return (EAttribute)orderTermAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTermAttribute_AttrValue() {
		return (EAttribute)orderTermAttributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderType() {
		return orderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderType_OrderTypeId() {
		return (EAttribute)orderTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderType_Description() {
		return (EAttribute)orderTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderType_HasTable() {
		return (EAttribute)orderTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderType_ParentTypeId() {
		return (EAttribute)orderTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderType_OrderTypeAttrs() {
		return (EAttribute)orderTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderTypeAttr() {
		return orderTypeAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTypeAttr_OrderTypeId() {
		return (EAttribute)orderTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTypeAttr_AttrName() {
		return (EAttribute)orderTypeAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTypeAttr_Description() {
		return (EAttribute)orderTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductOrderItem() {
		return productOrderItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductOrderItem_OrderId() {
		return (EAttribute)productOrderItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductOrderItem_OrderItemSeqId() {
		return (EAttribute)productOrderItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductOrderItem_EngagementId() {
		return (EAttribute)productOrderItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductOrderItem_EngagementItemSeqId() {
		return (EAttribute)productOrderItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductOrderItem_ProductId() {
		return (EAttribute)productOrderItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkOrderItemFulfillment() {
		return workOrderItemFulfillmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkOrderItemFulfillment_WorkEffortId() {
		return (EAttribute)workOrderItemFulfillmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkOrderItemFulfillment_OrderId() {
		return (EAttribute)workOrderItemFulfillmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkOrderItemFulfillment_OrderItemSeqId() {
		return (EAttribute)workOrderItemFulfillmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkOrderItemFulfillment_ShipGroupSeqId() {
		return (EAttribute)workOrderItemFulfillmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderFactory getOrderFactory() {
		return (OrderFactory)getEFactoryInstance();
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
		communicationEventOrderEClass = createEClass(COMMUNICATION_EVENT_ORDER);
		createEAttribute(communicationEventOrderEClass, COMMUNICATION_EVENT_ORDER__ORDER_ID);
		createEAttribute(communicationEventOrderEClass, COMMUNICATION_EVENT_ORDER__COMMUNICATION_EVENT_ID);

		orderAdjustmentEClass = createEClass(ORDER_ADJUSTMENT);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__AMOUNT);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__AMOUNT_ALREADY_INCLUDED);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__COMMENTS);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__CORRESPONDING_PRODUCT_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__CREATED_BY_USER_LOGIN);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__CREATED_DATE);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__CUSTOMER_REFERENCE_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__DESCRIPTION);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__EXEMPT_AMOUNT);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__INCLUDE_IN_SHIPPING);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__INCLUDE_IN_TAX);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__IS_MANUAL);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__LAST_MODIFIED_BY_USER_LOGIN);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__LAST_MODIFIED_DATE);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__OLD_AMOUNT_PER_QUANTITY);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__OLD_PERCENTAGE);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_TYPE_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__ORDER_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__ORIGINAL_ADJUSTMENT_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__OVERRIDE_GL_ACCOUNT_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__PRIMARY_GEO_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__PRODUCT_FEATURE_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__PRODUCT_PROMO_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__PRODUCT_PROMO_RULE_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__RECURRING_AMOUNT);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__SECONDARY_GEO_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__SHIP_GROUP_SEQ_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__SOURCE_PERCENTAGE);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__SOURCE_REFERENCE_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__TAX_AUTH_GEO_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__TAX_AUTH_PARTY_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__TAX_AUTHORITY_RATE_SEQ_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_ATTRIBUTES);

		orderAdjustmentAttributeEClass = createEClass(ORDER_ADJUSTMENT_ATTRIBUTE);
		createEAttribute(orderAdjustmentAttributeEClass, ORDER_ADJUSTMENT_ATTRIBUTE__ORDER_ADJUSTMENT_ID);
		createEAttribute(orderAdjustmentAttributeEClass, ORDER_ADJUSTMENT_ATTRIBUTE__ATTR_NAME);
		createEAttribute(orderAdjustmentAttributeEClass, ORDER_ADJUSTMENT_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(orderAdjustmentAttributeEClass, ORDER_ADJUSTMENT_ATTRIBUTE__ATTR_VALUE);

		orderAdjustmentBillingEClass = createEClass(ORDER_ADJUSTMENT_BILLING);
		createEAttribute(orderAdjustmentBillingEClass, ORDER_ADJUSTMENT_BILLING__ORDER_ADJUSTMENT_ID);
		createEAttribute(orderAdjustmentBillingEClass, ORDER_ADJUSTMENT_BILLING__INVOICE_ID);
		createEAttribute(orderAdjustmentBillingEClass, ORDER_ADJUSTMENT_BILLING__INVOICE_ITEM_SEQ_ID);
		createEAttribute(orderAdjustmentBillingEClass, ORDER_ADJUSTMENT_BILLING__AMOUNT);

		orderAdjustmentTypeEClass = createEClass(ORDER_ADJUSTMENT_TYPE);
		createEAttribute(orderAdjustmentTypeEClass, ORDER_ADJUSTMENT_TYPE__ORDER_ADJUSTMENT_TYPE_ID);
		createEAttribute(orderAdjustmentTypeEClass, ORDER_ADJUSTMENT_TYPE__DESCRIPTION);
		createEAttribute(orderAdjustmentTypeEClass, ORDER_ADJUSTMENT_TYPE__HAS_TABLE);
		createEAttribute(orderAdjustmentTypeEClass, ORDER_ADJUSTMENT_TYPE__PARENT_TYPE_ID);
		createEAttribute(orderAdjustmentTypeEClass, ORDER_ADJUSTMENT_TYPE__ORDER_ADJUSTMENT_TYPE_ATTRS);

		orderAdjustmentTypeAttrEClass = createEClass(ORDER_ADJUSTMENT_TYPE_ATTR);
		createEAttribute(orderAdjustmentTypeAttrEClass, ORDER_ADJUSTMENT_TYPE_ATTR__ORDER_ADJUSTMENT_TYPE_ID);
		createEAttribute(orderAdjustmentTypeAttrEClass, ORDER_ADJUSTMENT_TYPE_ATTR__ATTR_NAME);
		createEAttribute(orderAdjustmentTypeAttrEClass, ORDER_ADJUSTMENT_TYPE_ATTR__DESCRIPTION);

		orderAttributeEClass = createEClass(ORDER_ATTRIBUTE);
		createEAttribute(orderAttributeEClass, ORDER_ATTRIBUTE__ORDER_ID);
		createEAttribute(orderAttributeEClass, ORDER_ATTRIBUTE__ATTR_NAME);
		createEAttribute(orderAttributeEClass, ORDER_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(orderAttributeEClass, ORDER_ATTRIBUTE__ATTR_VALUE);

		orderBlacklistEClass = createEClass(ORDER_BLACKLIST);
		createEAttribute(orderBlacklistEClass, ORDER_BLACKLIST__BLACKLIST_STRING);
		createEAttribute(orderBlacklistEClass, ORDER_BLACKLIST__ORDER_BLACKLIST_TYPE_ID);

		orderBlacklistTypeEClass = createEClass(ORDER_BLACKLIST_TYPE);
		createEAttribute(orderBlacklistTypeEClass, ORDER_BLACKLIST_TYPE__ORDER_BLACKLIST_TYPE_ID);
		createEAttribute(orderBlacklistTypeEClass, ORDER_BLACKLIST_TYPE__DESCRIPTION);

		orderContactMechEClass = createEClass(ORDER_CONTACT_MECH);
		createEAttribute(orderContactMechEClass, ORDER_CONTACT_MECH__ORDER_ID);
		createEAttribute(orderContactMechEClass, ORDER_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE_ID);
		createEAttribute(orderContactMechEClass, ORDER_CONTACT_MECH__CONTACT_MECH_ID);

		orderContentEClass = createEClass(ORDER_CONTENT);
		createEAttribute(orderContentEClass, ORDER_CONTENT__CONTENT_ID);
		createEAttribute(orderContentEClass, ORDER_CONTENT__ORDER_ID);
		createEAttribute(orderContentEClass, ORDER_CONTENT__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderContentEClass, ORDER_CONTENT__ORDER_CONTENT_TYPE_ID);
		createEAttribute(orderContentEClass, ORDER_CONTENT__FROM_DATE);
		createEAttribute(orderContentEClass, ORDER_CONTENT__THRU_DATE);

		orderContentTypeEClass = createEClass(ORDER_CONTENT_TYPE);
		createEAttribute(orderContentTypeEClass, ORDER_CONTENT_TYPE__ORDER_CONTENT_TYPE_ID);
		createEAttribute(orderContentTypeEClass, ORDER_CONTENT_TYPE__DESCRIPTION);
		createEAttribute(orderContentTypeEClass, ORDER_CONTENT_TYPE__HAS_TABLE);
		createEAttribute(orderContentTypeEClass, ORDER_CONTENT_TYPE__PARENT_TYPE_ID);

		orderDeliveryScheduleEClass = createEClass(ORDER_DELIVERY_SCHEDULE);
		createEAttribute(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__ORDER_ID);
		createEAttribute(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__CARTONS);
		createEAttribute(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__ESTIMATED_READY_DATE);
		createEAttribute(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__SKIDS_PALLETS);
		createEAttribute(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__STATUS_ID);
		createEAttribute(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__TOTAL_CUBIC_SIZE);
		createEAttribute(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__TOTAL_CUBIC_UOM_ID);
		createEAttribute(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__TOTAL_WEIGHT);
		createEAttribute(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__TOTAL_WEIGHT_UOM_ID);
		createEAttribute(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__UNITS_PIECES);

		orderHeaderEClass = createEClass(ORDER_HEADER);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__ORDER_ID);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__AGREEMENT_ID);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__AUTO_ORDER_SHOPPING_LIST_ID);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__BILLING_ACCOUNT_ID);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__CREATED_BY);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__CURRENCY_UOM);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__ENTRY_DATE);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__EXTERNAL_ID);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__FIRST_ATTEMPT_ORDER_ID);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__GRAND_TOTAL);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__INTERNAL_CODE);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__INVOICE_PER_SHIPMENT);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__IS_RUSH_ORDER);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__IS_VIEWED);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__NEEDS_INVENTORY_ISSUANCE);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__ORDER_DATE);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__ORDER_NAME);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__ORDER_TYPE_ID);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__ORIGIN_FACILITY_ID);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__PICK_SHEET_PRINTED_DATE);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__PRIORITY);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__PRODUCT_STORE_ID);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__REMAINING_SUB_TOTAL);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__SALES_CHANNEL_ENUM_ID);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__STATUS_ID);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__SYNC_STATUS_ID);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__TERMINAL_ID);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__TRANSACTION_ID);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__VISIT_ID);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__WEB_SITE_ID);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__COMMUNICATION_EVENT_ORDERS);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__ORDER_ATTRIBUTES);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__ORDER_DELIVERY_SCHEDULES);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__ORDER_HEADER_NOTES);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__ORDER_HEADER_WORK_EFFORTS);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__ORDER_ITEMS);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__ORDER_ITEM_GROUPS);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__ORDER_ITEM_SHIP_GROUPS);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__ORDER_PRODUCT_PROMO_CODES);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__PRODUCT_PROMO_USES);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__TRACKING_CODE_ORDERS);

		orderHeaderNoteEClass = createEClass(ORDER_HEADER_NOTE);
		createEAttribute(orderHeaderNoteEClass, ORDER_HEADER_NOTE__ORDER_ID);
		createEAttribute(orderHeaderNoteEClass, ORDER_HEADER_NOTE__INTERNAL_NOTE);

		orderHeaderWorkEffortEClass = createEClass(ORDER_HEADER_WORK_EFFORT);
		createEAttribute(orderHeaderWorkEffortEClass, ORDER_HEADER_WORK_EFFORT__ORDER_ID);
		createEAttribute(orderHeaderWorkEffortEClass, ORDER_HEADER_WORK_EFFORT__WORK_EFFORT_ID);

		orderItemEClass = createEClass(ORDER_ITEM);
		createEAttribute(orderItemEClass, ORDER_ITEM__ORDER_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__AUTO_CANCEL_DATE);
		createEAttribute(orderItemEClass, ORDER_ITEM__BUDGET_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__BUDGET_ITEM_SEQ_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__CANCEL_BACK_ORDER_DATE);
		createEAttribute(orderItemEClass, ORDER_ITEM__CANCEL_QUANTITY);
		createEAttribute(orderItemEClass, ORDER_ITEM__CHANGE_BY_USER_LOGIN_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__COMMENTS);
		createEAttribute(orderItemEClass, ORDER_ITEM__CORRESPONDING_PO_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__DEPLOYMENT_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__DONT_CANCEL_SET_DATE);
		createEAttribute(orderItemEClass, ORDER_ITEM__DONT_CANCEL_SET_USER_LOGIN);
		createEAttribute(orderItemEClass, ORDER_ITEM__ESTIMATED_DELIVERY_DATE);
		createEAttribute(orderItemEClass, ORDER_ITEM__ESTIMATED_SHIP_DATE);
		createEAttribute(orderItemEClass, ORDER_ITEM__EXTERNAL_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__FROM_INVENTORY_ITEM_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__IS_ITEM_GROUP_PRIMARY);
		createEAttribute(orderItemEClass, ORDER_ITEM__IS_MODIFIED_PRICE);
		createEAttribute(orderItemEClass, ORDER_ITEM__IS_PROMO);
		createEAttribute(orderItemEClass, ORDER_ITEM__ITEM_DESCRIPTION);
		createEAttribute(orderItemEClass, ORDER_ITEM__ORDER_ITEM_GROUP_SEQ_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__ORDER_ITEM_TYPE_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__OVERRIDE_GL_ACCOUNT_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__PROD_CATALOG_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__PRODUCT_CATEGORY_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__PRODUCT_FEATURE_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__PRODUCT_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__QUANTITY);
		createEAttribute(orderItemEClass, ORDER_ITEM__QUOTE_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__QUOTE_ITEM_SEQ_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__RECURRING_FREQ_UOM_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__RESERVE_AFTER_DATE);
		createEAttribute(orderItemEClass, ORDER_ITEM__SALES_OPPORTUNITY_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__SELECTED_AMOUNT);
		createEAttribute(orderItemEClass, ORDER_ITEM__SHIP_AFTER_DATE);
		createEAttribute(orderItemEClass, ORDER_ITEM__SHIP_BEFORE_DATE);
		createEAttribute(orderItemEClass, ORDER_ITEM__SHOPPING_LIST_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__SHOPPING_LIST_ITEM_SEQ_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__STATUS_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__SUBSCRIPTION_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__SUPPLIER_PRODUCT_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__SYNC_STATUS_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__UNIT_AVERAGE_COST);
		createEAttribute(orderItemEClass, ORDER_ITEM__UNIT_LIST_PRICE);
		createEAttribute(orderItemEClass, ORDER_ITEM__UNIT_PRICE);
		createEAttribute(orderItemEClass, ORDER_ITEM__UNIT_RECURRING_PRICE);

		orderItemAssocEClass = createEClass(ORDER_ITEM_ASSOC);
		createEAttribute(orderItemAssocEClass, ORDER_ITEM_ASSOC__ORDER_ID);
		createEAttribute(orderItemAssocEClass, ORDER_ITEM_ASSOC__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemAssocEClass, ORDER_ITEM_ASSOC__SHIP_GROUP_SEQ_ID);
		createEAttribute(orderItemAssocEClass, ORDER_ITEM_ASSOC__TO_ORDER_ID);
		createEAttribute(orderItemAssocEClass, ORDER_ITEM_ASSOC__TO_ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemAssocEClass, ORDER_ITEM_ASSOC__TO_SHIP_GROUP_SEQ_ID);
		createEAttribute(orderItemAssocEClass, ORDER_ITEM_ASSOC__ORDER_ITEM_ASSOC_TYPE_ID);
		createEAttribute(orderItemAssocEClass, ORDER_ITEM_ASSOC__QUANTITY);

		orderItemAssocTypeEClass = createEClass(ORDER_ITEM_ASSOC_TYPE);
		createEAttribute(orderItemAssocTypeEClass, ORDER_ITEM_ASSOC_TYPE__ORDER_ITEM_ASSOC_TYPE_ID);
		createEAttribute(orderItemAssocTypeEClass, ORDER_ITEM_ASSOC_TYPE__DESCRIPTION);
		createEAttribute(orderItemAssocTypeEClass, ORDER_ITEM_ASSOC_TYPE__HAS_TABLE);
		createEAttribute(orderItemAssocTypeEClass, ORDER_ITEM_ASSOC_TYPE__PARENT_TYPE_ID);

		orderItemAttributeEClass = createEClass(ORDER_ITEM_ATTRIBUTE);
		createEAttribute(orderItemAttributeEClass, ORDER_ITEM_ATTRIBUTE__ORDER_ID);
		createEAttribute(orderItemAttributeEClass, ORDER_ITEM_ATTRIBUTE__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemAttributeEClass, ORDER_ITEM_ATTRIBUTE__ATTR_NAME);
		createEAttribute(orderItemAttributeEClass, ORDER_ITEM_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(orderItemAttributeEClass, ORDER_ITEM_ATTRIBUTE__ATTR_VALUE);

		orderItemBillingEClass = createEClass(ORDER_ITEM_BILLING);
		createEAttribute(orderItemBillingEClass, ORDER_ITEM_BILLING__ORDER_ID);
		createEAttribute(orderItemBillingEClass, ORDER_ITEM_BILLING__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemBillingEClass, ORDER_ITEM_BILLING__INVOICE_ID);
		createEAttribute(orderItemBillingEClass, ORDER_ITEM_BILLING__INVOICE_ITEM_SEQ_ID);
		createEAttribute(orderItemBillingEClass, ORDER_ITEM_BILLING__AMOUNT);
		createEAttribute(orderItemBillingEClass, ORDER_ITEM_BILLING__ITEM_ISSUANCE_ID);
		createEAttribute(orderItemBillingEClass, ORDER_ITEM_BILLING__QUANTITY);
		createEAttribute(orderItemBillingEClass, ORDER_ITEM_BILLING__SHIPMENT_RECEIPT_ID);

		orderItemChangeEClass = createEClass(ORDER_ITEM_CHANGE);
		createEAttribute(orderItemChangeEClass, ORDER_ITEM_CHANGE__ORDER_ITEM_CHANGE_ID);
		createEAttribute(orderItemChangeEClass, ORDER_ITEM_CHANGE__CANCEL_QUANTITY);
		createEAttribute(orderItemChangeEClass, ORDER_ITEM_CHANGE__CHANGE_COMMENTS);
		createEAttribute(orderItemChangeEClass, ORDER_ITEM_CHANGE__CHANGE_DATETIME);
		createEAttribute(orderItemChangeEClass, ORDER_ITEM_CHANGE__CHANGE_TYPE_ENUM_ID);
		createEAttribute(orderItemChangeEClass, ORDER_ITEM_CHANGE__CHANGE_USER_LOGIN);
		createEAttribute(orderItemChangeEClass, ORDER_ITEM_CHANGE__ITEM_DESCRIPTION);
		createEAttribute(orderItemChangeEClass, ORDER_ITEM_CHANGE__ORDER_ID);
		createEAttribute(orderItemChangeEClass, ORDER_ITEM_CHANGE__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemChangeEClass, ORDER_ITEM_CHANGE__QUANTITY);
		createEAttribute(orderItemChangeEClass, ORDER_ITEM_CHANGE__REASON_ENUM_ID);
		createEAttribute(orderItemChangeEClass, ORDER_ITEM_CHANGE__UNIT_PRICE);

		orderItemContactMechEClass = createEClass(ORDER_ITEM_CONTACT_MECH);
		createEAttribute(orderItemContactMechEClass, ORDER_ITEM_CONTACT_MECH__ORDER_ID);
		createEAttribute(orderItemContactMechEClass, ORDER_ITEM_CONTACT_MECH__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemContactMechEClass, ORDER_ITEM_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE_ID);
		createEAttribute(orderItemContactMechEClass, ORDER_ITEM_CONTACT_MECH__CONTACT_MECH_ID);

		orderItemGroupEClass = createEClass(ORDER_ITEM_GROUP);
		createEAttribute(orderItemGroupEClass, ORDER_ITEM_GROUP__ORDER_ID);
		createEAttribute(orderItemGroupEClass, ORDER_ITEM_GROUP__ORDER_ITEM_GROUP_SEQ_ID);
		createEAttribute(orderItemGroupEClass, ORDER_ITEM_GROUP__GROUP_NAME);
		createEAttribute(orderItemGroupEClass, ORDER_ITEM_GROUP__PARENT_GROUP_SEQ_ID);

		orderItemGroupOrderEClass = createEClass(ORDER_ITEM_GROUP_ORDER);
		createEAttribute(orderItemGroupOrderEClass, ORDER_ITEM_GROUP_ORDER__ORDER_ID);
		createEAttribute(orderItemGroupOrderEClass, ORDER_ITEM_GROUP_ORDER__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemGroupOrderEClass, ORDER_ITEM_GROUP_ORDER__GROUP_ORDER_ID);

		orderItemPriceInfoEClass = createEClass(ORDER_ITEM_PRICE_INFO);
		createEAttribute(orderItemPriceInfoEClass, ORDER_ITEM_PRICE_INFO__ORDER_ITEM_PRICE_INFO_ID);
		createEAttribute(orderItemPriceInfoEClass, ORDER_ITEM_PRICE_INFO__DESCRIPTION);
		createEAttribute(orderItemPriceInfoEClass, ORDER_ITEM_PRICE_INFO__MODIFY_AMOUNT);
		createEAttribute(orderItemPriceInfoEClass, ORDER_ITEM_PRICE_INFO__ORDER_ID);
		createEAttribute(orderItemPriceInfoEClass, ORDER_ITEM_PRICE_INFO__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemPriceInfoEClass, ORDER_ITEM_PRICE_INFO__PRODUCT_PRICE_ACTION_SEQ_ID);
		createEAttribute(orderItemPriceInfoEClass, ORDER_ITEM_PRICE_INFO__PRODUCT_PRICE_RULE_ID);
		createEAttribute(orderItemPriceInfoEClass, ORDER_ITEM_PRICE_INFO__RATE_CODE);

		orderItemRoleEClass = createEClass(ORDER_ITEM_ROLE);
		createEAttribute(orderItemRoleEClass, ORDER_ITEM_ROLE__ORDER_ID);
		createEAttribute(orderItemRoleEClass, ORDER_ITEM_ROLE__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemRoleEClass, ORDER_ITEM_ROLE__PARTY_ID);
		createEAttribute(orderItemRoleEClass, ORDER_ITEM_ROLE__ROLE_TYPE_ID);

		orderItemShipGroupEClass = createEClass(ORDER_ITEM_SHIP_GROUP);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__ORDER_ID);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__SHIP_GROUP_SEQ_ID);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__CARRIER_PARTY_ID);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__CARRIER_ROLE_TYPE_ID);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__CONTACT_MECH_ID);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__ESTIMATED_DELIVERY_DATE);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__ESTIMATED_SHIP_DATE);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__FACILITY_ID);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__GIFT_MESSAGE);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__IS_GIFT);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__MAY_SPLIT);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__SHIP_AFTER_DATE);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__SHIP_BY_DATE);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__SHIPMENT_METHOD_TYPE_ID);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__SHIPPING_INSTRUCTIONS);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__SUPPLIER_AGREEMENT_ID);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__SUPPLIER_PARTY_ID);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__TELECOM_CONTACT_MECH_ID);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__TRACKING_NUMBER);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__VENDOR_PARTY_ID);

		orderItemShipGroupAssocEClass = createEClass(ORDER_ITEM_SHIP_GROUP_ASSOC);
		createEAttribute(orderItemShipGroupAssocEClass, ORDER_ITEM_SHIP_GROUP_ASSOC__ORDER_ID);
		createEAttribute(orderItemShipGroupAssocEClass, ORDER_ITEM_SHIP_GROUP_ASSOC__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemShipGroupAssocEClass, ORDER_ITEM_SHIP_GROUP_ASSOC__SHIP_GROUP_SEQ_ID);
		createEAttribute(orderItemShipGroupAssocEClass, ORDER_ITEM_SHIP_GROUP_ASSOC__CANCEL_QUANTITY);
		createEAttribute(orderItemShipGroupAssocEClass, ORDER_ITEM_SHIP_GROUP_ASSOC__QUANTITY);

		orderItemShipGrpInvResEClass = createEClass(ORDER_ITEM_SHIP_GRP_INV_RES);
		createEAttribute(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__ORDER_ID);
		createEAttribute(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__SHIP_GROUP_SEQ_ID);
		createEAttribute(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__INVENTORY_ITEM_ID);
		createEAttribute(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__CREATED_DATETIME);
		createEAttribute(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__CURRENT_PROMISED_DATE);
		createEAttribute(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__OLD_PICK_START_DATE);
		createEAttribute(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__PRIORITY);
		createEAttribute(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__PROMISED_DATETIME);
		createEAttribute(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__QUANTITY);
		createEAttribute(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__QUANTITY_NOT_AVAILABLE);
		createEAttribute(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__RESERVE_ORDER_ENUM_ID);
		createEAttribute(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__RESERVED_DATETIME);
		createEAttribute(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__SEQUENCE_ID);

		orderItemTypeEClass = createEClass(ORDER_ITEM_TYPE);
		createEAttribute(orderItemTypeEClass, ORDER_ITEM_TYPE__ORDER_ITEM_TYPE_ID);
		createEAttribute(orderItemTypeEClass, ORDER_ITEM_TYPE__DESCRIPTION);
		createEAttribute(orderItemTypeEClass, ORDER_ITEM_TYPE__HAS_TABLE);
		createEAttribute(orderItemTypeEClass, ORDER_ITEM_TYPE__PARENT_TYPE_ID);
		createEAttribute(orderItemTypeEClass, ORDER_ITEM_TYPE__ORDER_ITEM_TYPE_ATTRS);

		orderItemTypeAttrEClass = createEClass(ORDER_ITEM_TYPE_ATTR);
		createEAttribute(orderItemTypeAttrEClass, ORDER_ITEM_TYPE_ATTR__ORDER_ITEM_TYPE_ID);
		createEAttribute(orderItemTypeAttrEClass, ORDER_ITEM_TYPE_ATTR__ATTR_NAME);
		createEAttribute(orderItemTypeAttrEClass, ORDER_ITEM_TYPE_ATTR__DESCRIPTION);

		orderNotificationEClass = createEClass(ORDER_NOTIFICATION);
		createEAttribute(orderNotificationEClass, ORDER_NOTIFICATION__ORDER_NOTIFICATION_ID);
		createEAttribute(orderNotificationEClass, ORDER_NOTIFICATION__COMMENTS);
		createEAttribute(orderNotificationEClass, ORDER_NOTIFICATION__EMAIL_TYPE);
		createEAttribute(orderNotificationEClass, ORDER_NOTIFICATION__NOTIFICATION_DATE);
		createEAttribute(orderNotificationEClass, ORDER_NOTIFICATION__ORDER_ID);

		orderPaymentPreferenceEClass = createEClass(ORDER_PAYMENT_PREFERENCE);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__ORDER_PAYMENT_PREFERENCE_ID);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__BILLING_POSTAL_CODE);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__CREATED_BY_USER_LOGIN);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__CREATED_DATE);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__FIN_ACCOUNT_ID);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__LAST_MODIFIED_BY_USER_LOGIN);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__LAST_MODIFIED_DATE);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__MANUAL_AUTH_CODE);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__MANUAL_REF_NUM);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__MAX_AMOUNT);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__NEEDS_NSF_RETRY);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__ORDER_ID);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__OVERFLOW_FLAG);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_ID);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_TYPE_ID);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__PRESENT_FLAG);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__PROCESS_ATTEMPT);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__PRODUCT_PRICE_PURPOSE_ID);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__SECURITY_CODE);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__SHIP_GROUP_SEQ_ID);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__STATUS_ID);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__SWIPED_FLAG);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__TRACK2);

		orderProductPromoCodeEClass = createEClass(ORDER_PRODUCT_PROMO_CODE);
		createEAttribute(orderProductPromoCodeEClass, ORDER_PRODUCT_PROMO_CODE__ORDER_ID);
		createEAttribute(orderProductPromoCodeEClass, ORDER_PRODUCT_PROMO_CODE__PRODUCT_PROMO_CODE_ID);

		orderRoleEClass = createEClass(ORDER_ROLE);
		createEAttribute(orderRoleEClass, ORDER_ROLE__ORDER_ID);
		createEAttribute(orderRoleEClass, ORDER_ROLE__PARTY_ID);
		createEAttribute(orderRoleEClass, ORDER_ROLE__ROLE_TYPE_ID);

		orderShipmentEClass = createEClass(ORDER_SHIPMENT);
		createEAttribute(orderShipmentEClass, ORDER_SHIPMENT__ORDER_ID);
		createEAttribute(orderShipmentEClass, ORDER_SHIPMENT__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderShipmentEClass, ORDER_SHIPMENT__SHIP_GROUP_SEQ_ID);
		createEAttribute(orderShipmentEClass, ORDER_SHIPMENT__SHIPMENT_ID);
		createEAttribute(orderShipmentEClass, ORDER_SHIPMENT__SHIPMENT_ITEM_SEQ_ID);
		createEAttribute(orderShipmentEClass, ORDER_SHIPMENT__QUANTITY);

		orderStatusEClass = createEClass(ORDER_STATUS);
		createEAttribute(orderStatusEClass, ORDER_STATUS__ORDER_STATUS_ID);
		createEAttribute(orderStatusEClass, ORDER_STATUS__CHANGE_REASON);
		createEAttribute(orderStatusEClass, ORDER_STATUS__ORDER_ID);
		createEAttribute(orderStatusEClass, ORDER_STATUS__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderStatusEClass, ORDER_STATUS__ORDER_PAYMENT_PREFERENCE_ID);
		createEAttribute(orderStatusEClass, ORDER_STATUS__STATUS_DATETIME);
		createEAttribute(orderStatusEClass, ORDER_STATUS__STATUS_ID);
		createEAttribute(orderStatusEClass, ORDER_STATUS__STATUS_USER_LOGIN);

		orderSummaryEntryEClass = createEClass(ORDER_SUMMARY_ENTRY);
		createEAttribute(orderSummaryEntryEClass, ORDER_SUMMARY_ENTRY__ENTRY_DATE);
		createEAttribute(orderSummaryEntryEClass, ORDER_SUMMARY_ENTRY__PRODUCT_ID);
		createEAttribute(orderSummaryEntryEClass, ORDER_SUMMARY_ENTRY__FACILITY_ID);
		createEAttribute(orderSummaryEntryEClass, ORDER_SUMMARY_ENTRY__GROSS_SALES);
		createEAttribute(orderSummaryEntryEClass, ORDER_SUMMARY_ENTRY__PRODUCT_COST);
		createEAttribute(orderSummaryEntryEClass, ORDER_SUMMARY_ENTRY__TOTAL_QUANTITY);

		orderTermEClass = createEClass(ORDER_TERM);
		createEAttribute(orderTermEClass, ORDER_TERM__TERM_TYPE_ID);
		createEAttribute(orderTermEClass, ORDER_TERM__ORDER_ID);
		createEAttribute(orderTermEClass, ORDER_TERM__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderTermEClass, ORDER_TERM__DESCRIPTION);
		createEAttribute(orderTermEClass, ORDER_TERM__TERM_DAYS);
		createEAttribute(orderTermEClass, ORDER_TERM__TERM_VALUE);
		createEAttribute(orderTermEClass, ORDER_TERM__TEXT_VALUE);
		createEAttribute(orderTermEClass, ORDER_TERM__UOM_ID);

		orderTermAttributeEClass = createEClass(ORDER_TERM_ATTRIBUTE);
		createEAttribute(orderTermAttributeEClass, ORDER_TERM_ATTRIBUTE__TERM_TYPE_ID);
		createEAttribute(orderTermAttributeEClass, ORDER_TERM_ATTRIBUTE__ORDER_ID);
		createEAttribute(orderTermAttributeEClass, ORDER_TERM_ATTRIBUTE__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderTermAttributeEClass, ORDER_TERM_ATTRIBUTE__ATTR_NAME);
		createEAttribute(orderTermAttributeEClass, ORDER_TERM_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(orderTermAttributeEClass, ORDER_TERM_ATTRIBUTE__ATTR_VALUE);

		orderTypeEClass = createEClass(ORDER_TYPE);
		createEAttribute(orderTypeEClass, ORDER_TYPE__ORDER_TYPE_ID);
		createEAttribute(orderTypeEClass, ORDER_TYPE__DESCRIPTION);
		createEAttribute(orderTypeEClass, ORDER_TYPE__HAS_TABLE);
		createEAttribute(orderTypeEClass, ORDER_TYPE__PARENT_TYPE_ID);
		createEAttribute(orderTypeEClass, ORDER_TYPE__ORDER_TYPE_ATTRS);

		orderTypeAttrEClass = createEClass(ORDER_TYPE_ATTR);
		createEAttribute(orderTypeAttrEClass, ORDER_TYPE_ATTR__ORDER_TYPE_ID);
		createEAttribute(orderTypeAttrEClass, ORDER_TYPE_ATTR__ATTR_NAME);
		createEAttribute(orderTypeAttrEClass, ORDER_TYPE_ATTR__DESCRIPTION);

		productOrderItemEClass = createEClass(PRODUCT_ORDER_ITEM);
		createEAttribute(productOrderItemEClass, PRODUCT_ORDER_ITEM__ORDER_ID);
		createEAttribute(productOrderItemEClass, PRODUCT_ORDER_ITEM__ORDER_ITEM_SEQ_ID);
		createEAttribute(productOrderItemEClass, PRODUCT_ORDER_ITEM__ENGAGEMENT_ID);
		createEAttribute(productOrderItemEClass, PRODUCT_ORDER_ITEM__ENGAGEMENT_ITEM_SEQ_ID);
		createEAttribute(productOrderItemEClass, PRODUCT_ORDER_ITEM__PRODUCT_ID);

		workOrderItemFulfillmentEClass = createEClass(WORK_ORDER_ITEM_FULFILLMENT);
		createEAttribute(workOrderItemFulfillmentEClass, WORK_ORDER_ITEM_FULFILLMENT__WORK_EFFORT_ID);
		createEAttribute(workOrderItemFulfillmentEClass, WORK_ORDER_ITEM_FULFILLMENT__ORDER_ID);
		createEAttribute(workOrderItemFulfillmentEClass, WORK_ORDER_ITEM_FULFILLMENT__ORDER_ITEM_SEQ_ID);
		createEAttribute(workOrderItemFulfillmentEClass, WORK_ORDER_ITEM_FULFILLMENT__SHIP_GROUP_SEQ_ID);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		communicationEventOrderEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		EGenericType g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		EGenericType g2 = createEGenericType(this.getOrderAdjustmentType());
		g1.getETypeArguments().add(g2);
		orderAdjustmentEClass.getEGenericSuperTypes().add(g1);
		orderAdjustmentAttributeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		orderAdjustmentBillingEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getOrderAdjustment());
		g1.getETypeArguments().add(g2);
		orderAdjustmentTypeEClass.getEGenericSuperTypes().add(g1);
		orderAdjustmentTypeAttrEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		orderAttributeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getOrderBlacklistType());
		g1.getETypeArguments().add(g2);
		orderBlacklistEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getOrderBlacklist());
		g1.getETypeArguments().add(g2);
		orderBlacklistTypeEClass.getEGenericSuperTypes().add(g1);
		orderContactMechEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getOrderContentType());
		g1.getETypeArguments().add(g2);
		orderContentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getOrderContent());
		g1.getETypeArguments().add(g2);
		orderContentTypeEClass.getEGenericSuperTypes().add(g1);
		orderDeliveryScheduleEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getOrderType());
		g1.getETypeArguments().add(g2);
		orderHeaderEClass.getEGenericSuperTypes().add(g1);
		orderHeaderNoteEClass.getESuperTypes().add(theBizPackage.getBizEntityNote());
		orderHeaderWorkEffortEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getOrderItemType());
		g1.getETypeArguments().add(g2);
		orderItemEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getOrderItemAssocType());
		g1.getETypeArguments().add(g2);
		orderItemAssocEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getOrderItemAssoc());
		g1.getETypeArguments().add(g2);
		orderItemAssocTypeEClass.getEGenericSuperTypes().add(g1);
		orderItemAttributeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		orderItemBillingEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		orderItemChangeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		orderItemContactMechEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		orderItemGroupEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		orderItemGroupOrderEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		orderItemPriceInfoEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		orderItemRoleEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		orderItemShipGroupEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		orderItemShipGroupAssocEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		orderItemShipGrpInvResEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getOrderItem());
		g1.getETypeArguments().add(g2);
		orderItemTypeEClass.getEGenericSuperTypes().add(g1);
		orderItemTypeAttrEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		orderNotificationEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		orderPaymentPreferenceEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		orderProductPromoCodeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		orderRoleEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		orderShipmentEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		orderStatusEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		orderSummaryEntryEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		orderTermEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		orderTermAttributeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getOrderHeader());
		g1.getETypeArguments().add(g2);
		orderTypeEClass.getEGenericSuperTypes().add(g1);
		orderTypeAttrEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		productOrderItemEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		workOrderItemFulfillmentEClass.getESuperTypes().add(theBizPackage.getBizEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(communicationEventOrderEClass, CommunicationEventOrder.class, "CommunicationEventOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicationEventOrder_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, CommunicationEventOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationEventOrder_CommunicationEventId(), ecorePackage.getEString(), "communicationEventId", null, 0, 1, CommunicationEventOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderAdjustmentEClass, OrderAdjustment.class, "OrderAdjustment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderAdjustment_OrderAdjustmentId(), ecorePackage.getEString(), "orderAdjustmentId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_Amount(), ecorePackage.getEBigDecimal(), "amount", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_AmountAlreadyIncluded(), ecorePackage.getEBigDecimal(), "amountAlreadyIncluded", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_CorrespondingProductId(), ecorePackage.getEString(), "correspondingProductId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_CreatedByUserLogin(), ecorePackage.getEString(), "createdByUserLogin", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_CreatedDate(), ecorePackage.getEDate(), "createdDate", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_CustomerReferenceId(), ecorePackage.getEString(), "customerReferenceId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_ExemptAmount(), ecorePackage.getEBigDecimal(), "exemptAmount", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_IncludeInShipping(), ecorePackage.getEBoolean(), "includeInShipping", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_IncludeInTax(), ecorePackage.getEBoolean(), "includeInTax", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_IsManual(), ecorePackage.getEBoolean(), "isManual", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_LastModifiedByUserLogin(), ecorePackage.getEString(), "lastModifiedByUserLogin", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_LastModifiedDate(), ecorePackage.getEDate(), "lastModifiedDate", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_OldAmountPerQuantity(), ecorePackage.getEBigDecimal(), "oldAmountPerQuantity", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_OldPercentage(), ecorePackage.getEDouble(), "oldPercentage", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_OrderAdjustmentTypeId(), ecorePackage.getEString(), "orderAdjustmentTypeId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_OriginalAdjustmentId(), ecorePackage.getEString(), "originalAdjustmentId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_OverrideGlAccountId(), ecorePackage.getEString(), "overrideGlAccountId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_PrimaryGeoId(), ecorePackage.getEString(), "primaryGeoId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_ProductFeatureId(), ecorePackage.getEString(), "productFeatureId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_ProductPromoActionSeqId(), ecorePackage.getEString(), "productPromoActionSeqId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_ProductPromoId(), ecorePackage.getEString(), "productPromoId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_ProductPromoRuleId(), ecorePackage.getEString(), "productPromoRuleId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_RecurringAmount(), ecorePackage.getEBigDecimal(), "recurringAmount", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_SecondaryGeoId(), ecorePackage.getEString(), "secondaryGeoId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_ShipGroupSeqId(), ecorePackage.getEString(), "shipGroupSeqId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_SourcePercentage(), ecorePackage.getEBigDecimal(), "sourcePercentage", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_SourceReferenceId(), ecorePackage.getEString(), "sourceReferenceId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_TaxAuthGeoId(), ecorePackage.getEString(), "taxAuthGeoId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_TaxAuthPartyId(), ecorePackage.getEString(), "taxAuthPartyId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_TaxAuthorityRateSeqId(), ecorePackage.getEString(), "taxAuthorityRateSeqId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_OrderAdjustmentAttributes(), ecorePackage.getEString(), "orderAdjustmentAttributes", null, 0, -1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(orderAdjustmentEClass, ecorePackage.getEString(), "returnAdjustments", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(orderAdjustmentAttributeEClass, OrderAdjustmentAttribute.class, "OrderAdjustmentAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderAdjustmentAttribute_OrderAdjustmentId(), ecorePackage.getEString(), "orderAdjustmentId", null, 0, 1, OrderAdjustmentAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustmentAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 0, 1, OrderAdjustmentAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustmentAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, OrderAdjustmentAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustmentAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, OrderAdjustmentAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderAdjustmentBillingEClass, OrderAdjustmentBilling.class, "OrderAdjustmentBilling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderAdjustmentBilling_OrderAdjustmentId(), ecorePackage.getEString(), "orderAdjustmentId", null, 0, 1, OrderAdjustmentBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustmentBilling_InvoiceId(), ecorePackage.getEString(), "invoiceId", null, 0, 1, OrderAdjustmentBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustmentBilling_InvoiceItemSeqId(), ecorePackage.getEString(), "invoiceItemSeqId", null, 0, 1, OrderAdjustmentBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustmentBilling_Amount(), ecorePackage.getEBigDecimal(), "amount", null, 0, 1, OrderAdjustmentBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderAdjustmentTypeEClass, OrderAdjustmentType.class, "OrderAdjustmentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderAdjustmentType_OrderAdjustmentTypeId(), ecorePackage.getEString(), "orderAdjustmentTypeId", null, 0, 1, OrderAdjustmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustmentType_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderAdjustmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustmentType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, OrderAdjustmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustmentType_ParentTypeId(), ecorePackage.getEString(), "parentTypeId", null, 0, 1, OrderAdjustmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustmentType_OrderAdjustmentTypeAttrs(), ecorePackage.getEString(), "orderAdjustmentTypeAttrs", null, 0, -1, OrderAdjustmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(orderAdjustmentTypeEClass, ecorePackage.getEString(), "childOrderAdjustmentTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(orderAdjustmentTypeEClass, ecorePackage.getEString(), "orderAdjustments", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(orderAdjustmentTypeEClass, ecorePackage.getEString(), "quoteAdjustments", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(orderAdjustmentTypeAttrEClass, OrderAdjustmentTypeAttr.class, "OrderAdjustmentTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderAdjustmentTypeAttr_OrderAdjustmentTypeId(), ecorePackage.getEString(), "orderAdjustmentTypeId", null, 0, 1, OrderAdjustmentTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustmentTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 0, 1, OrderAdjustmentTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustmentTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderAdjustmentTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderAttributeEClass, OrderAttribute.class, "OrderAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderAttribute_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 0, 1, OrderAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, OrderAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, OrderAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderBlacklistEClass, OrderBlacklist.class, "OrderBlacklist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderBlacklist_BlacklistString(), ecorePackage.getEString(), "blacklistString", null, 0, 1, OrderBlacklist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderBlacklist_OrderBlacklistTypeId(), ecorePackage.getEString(), "orderBlacklistTypeId", null, 0, 1, OrderBlacklist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderBlacklistTypeEClass, OrderBlacklistType.class, "OrderBlacklistType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderBlacklistType_OrderBlacklistTypeId(), ecorePackage.getEString(), "orderBlacklistTypeId", null, 0, 1, OrderBlacklistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderBlacklistType_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderBlacklistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(orderBlacklistTypeEClass, ecorePackage.getEString(), "orderBlacklists", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(orderContactMechEClass, OrderContactMech.class, "OrderContactMech", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderContactMech_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderContactMech_ContactMechPurposeTypeId(), ecorePackage.getEString(), "contactMechPurposeTypeId", null, 0, 1, OrderContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderContactMech_ContactMechId(), ecorePackage.getEString(), "contactMechId", null, 0, 1, OrderContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderContentEClass, OrderContent.class, "OrderContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderContent_ContentId(), ecorePackage.getEString(), "contentId", null, 0, 1, OrderContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderContent_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderContent_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderContent_OrderContentTypeId(), ecorePackage.getEString(), "orderContentTypeId", null, 0, 1, OrderContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderContent_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, OrderContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderContent_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, OrderContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderContentTypeEClass, OrderContentType.class, "OrderContentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderContentType_OrderContentTypeId(), ecorePackage.getEString(), "orderContentTypeId", null, 0, 1, OrderContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderContentType_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderContentType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, OrderContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderContentType_ParentTypeId(), ecorePackage.getEString(), "parentTypeId", null, 0, 1, OrderContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(orderContentTypeEClass, ecorePackage.getEString(), "childOrderContentTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(orderDeliveryScheduleEClass, OrderDeliverySchedule.class, "OrderDeliverySchedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderDeliverySchedule_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDeliverySchedule_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDeliverySchedule_Cartons(), ecorePackage.getELong(), "cartons", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDeliverySchedule_EstimatedReadyDate(), ecorePackage.getEDate(), "estimatedReadyDate", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDeliverySchedule_SkidsPallets(), ecorePackage.getELong(), "skidsPallets", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDeliverySchedule_StatusId(), ecorePackage.getEString(), "statusId", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDeliverySchedule_TotalCubicSize(), ecorePackage.getEBigDecimal(), "totalCubicSize", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDeliverySchedule_TotalCubicUomId(), ecorePackage.getEString(), "totalCubicUomId", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDeliverySchedule_TotalWeight(), ecorePackage.getEBigDecimal(), "totalWeight", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDeliverySchedule_TotalWeightUomId(), ecorePackage.getEString(), "totalWeightUomId", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDeliverySchedule_UnitsPieces(), ecorePackage.getEBigDecimal(), "unitsPieces", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderHeaderEClass, OrderHeader.class, "OrderHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderHeader_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_AgreementId(), ecorePackage.getEString(), "agreementId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_AutoOrderShoppingListId(), ecorePackage.getEString(), "autoOrderShoppingListId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_BillingAccountId(), ecorePackage.getEString(), "billingAccountId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_CreatedBy(), ecorePackage.getEString(), "createdBy", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_CurrencyUom(), ecorePackage.getEString(), "currencyUom", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_EntryDate(), ecorePackage.getEDate(), "entryDate", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_ExternalId(), ecorePackage.getEString(), "externalId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_FirstAttemptOrderId(), ecorePackage.getEString(), "firstAttemptOrderId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_GrandTotal(), ecorePackage.getEBigDecimal(), "grandTotal", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_InternalCode(), ecorePackage.getEString(), "internalCode", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_InvoicePerShipment(), ecorePackage.getEBoolean(), "invoicePerShipment", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_IsRushOrder(), ecorePackage.getEBoolean(), "isRushOrder", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_IsViewed(), ecorePackage.getEBoolean(), "isViewed", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_NeedsInventoryIssuance(), ecorePackage.getEBoolean(), "needsInventoryIssuance", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_OrderDate(), ecorePackage.getEDate(), "orderDate", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_OrderName(), ecorePackage.getEString(), "orderName", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_OrderTypeId(), ecorePackage.getEString(), "orderTypeId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_OriginFacilityId(), ecorePackage.getEString(), "originFacilityId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_PickSheetPrintedDate(), ecorePackage.getEDate(), "pickSheetPrintedDate", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_Priority(), ecorePackage.getEBoolean(), "priority", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_ProductStoreId(), ecorePackage.getEString(), "productStoreId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_RemainingSubTotal(), ecorePackage.getEBigDecimal(), "remainingSubTotal", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_SalesChannelEnumId(), ecorePackage.getEString(), "salesChannelEnumId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_StatusId(), ecorePackage.getEString(), "statusId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_SyncStatusId(), ecorePackage.getEString(), "syncStatusId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_TerminalId(), ecorePackage.getEString(), "terminalId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_TransactionId(), ecorePackage.getEString(), "transactionId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_VisitId(), ecorePackage.getEString(), "visitId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_WebSiteId(), ecorePackage.getEString(), "webSiteId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_CommunicationEventOrders(), ecorePackage.getEString(), "communicationEventOrders", null, 0, -1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_OrderAttributes(), ecorePackage.getEString(), "orderAttributes", null, 0, -1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_OrderDeliverySchedules(), ecorePackage.getEString(), "orderDeliverySchedules", null, 0, -1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_OrderHeaderNotes(), ecorePackage.getEString(), "orderHeaderNotes", null, 0, -1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_OrderHeaderWorkEfforts(), ecorePackage.getEString(), "orderHeaderWorkEfforts", null, 0, -1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_OrderItems(), ecorePackage.getEString(), "orderItems", null, 0, -1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_OrderItemGroups(), ecorePackage.getEString(), "orderItemGroups", null, 0, -1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_OrderItemShipGroups(), ecorePackage.getEString(), "orderItemShipGroups", null, 0, -1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_OrderProductPromoCodes(), ecorePackage.getEString(), "orderProductPromoCodes", null, 0, -1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_ProductPromoUses(), ecorePackage.getEString(), "productPromoUses", null, 0, -1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_TrackingCodeOrders(), ecorePackage.getEString(), "trackingCodeOrders", null, 0, -1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(orderHeaderEClass, ecorePackage.getEString(), "acquireFixedAssets", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(orderHeaderEClass, ecorePackage.getEString(), "giftCardFulfillments", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(orderHeaderEClass, ecorePackage.getEString(), "itemIssuances", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(orderHeaderEClass, ecorePackage.getEString(), "orderAdjustments", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(orderHeaderEClass, ecorePackage.getEString(), "orderItemChanges", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(orderHeaderEClass, ecorePackage.getEString(), "orderItemPriceInfos", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(orderHeaderEClass, ecorePackage.getEString(), "orderNotifications", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(orderHeaderEClass, ecorePackage.getEString(), "orderPaymentPreferences", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(orderHeaderEClass, ecorePackage.getEString(), "orderStatuss", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(orderHeaderEClass, ecorePackage.getEString(), "primaryPicklistBins", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(orderHeaderEClass, ecorePackage.getEString(), "primaryShipments", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(orderHeaderEClass, ecorePackage.getEString(), "purchaseFixedAssetMaints", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(orderHeaderEClass, ecorePackage.getEString(), "replacementReturnItemResponses", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(orderHeaderEClass, ecorePackage.getEString(), "returnItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(orderHeaderEClass, ecorePackage.getEString(), "shipmentReceipts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(orderHeaderEClass, ecorePackage.getEString(), "subscriptions", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(orderHeaderEClass, ecorePackage.getEString(), "surveyResponses", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(orderHeaderNoteEClass, OrderHeaderNote.class, "OrderHeaderNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderHeaderNote_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderHeaderNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeaderNote_InternalNote(), ecorePackage.getEBoolean(), "internalNote", null, 0, 1, OrderHeaderNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderHeaderWorkEffortEClass, OrderHeaderWorkEffort.class, "OrderHeaderWorkEffort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderHeaderWorkEffort_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderHeaderWorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeaderWorkEffort_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 0, 1, OrderHeaderWorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemEClass, OrderItem.class, "OrderItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItem_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_AutoCancelDate(), ecorePackage.getEDate(), "autoCancelDate", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_BudgetId(), ecorePackage.getEString(), "budgetId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_BudgetItemSeqId(), ecorePackage.getEString(), "budgetItemSeqId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_CancelBackOrderDate(), ecorePackage.getEDate(), "cancelBackOrderDate", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_CancelQuantity(), ecorePackage.getEBigDecimal(), "cancelQuantity", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ChangeByUserLoginId(), ecorePackage.getEString(), "changeByUserLoginId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_CorrespondingPoId(), ecorePackage.getEString(), "correspondingPoId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_DeploymentId(), ecorePackage.getEString(), "deploymentId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_DontCancelSetDate(), ecorePackage.getEDate(), "dontCancelSetDate", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_DontCancelSetUserLogin(), ecorePackage.getEString(), "dontCancelSetUserLogin", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_EstimatedDeliveryDate(), ecorePackage.getEDate(), "estimatedDeliveryDate", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_EstimatedShipDate(), ecorePackage.getEDate(), "estimatedShipDate", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ExternalId(), ecorePackage.getEString(), "externalId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_FromInventoryItemId(), ecorePackage.getEString(), "fromInventoryItemId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_IsItemGroupPrimary(), ecorePackage.getEBoolean(), "isItemGroupPrimary", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_IsModifiedPrice(), ecorePackage.getEBoolean(), "isModifiedPrice", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_IsPromo(), ecorePackage.getEBoolean(), "isPromo", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ItemDescription(), ecorePackage.getEString(), "itemDescription", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_OrderItemGroupSeqId(), ecorePackage.getEString(), "orderItemGroupSeqId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_OrderItemTypeId(), ecorePackage.getEString(), "orderItemTypeId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_OverrideGlAccountId(), ecorePackage.getEString(), "overrideGlAccountId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ProdCatalogId(), ecorePackage.getEString(), "prodCatalogId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ProductCategoryId(), ecorePackage.getEString(), "productCategoryId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ProductFeatureId(), ecorePackage.getEString(), "productFeatureId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ProductId(), ecorePackage.getEString(), "productId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_QuoteId(), ecorePackage.getEString(), "quoteId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_QuoteItemSeqId(), ecorePackage.getEString(), "quoteItemSeqId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_RecurringFreqUomId(), ecorePackage.getEString(), "recurringFreqUomId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ReserveAfterDate(), ecorePackage.getEDate(), "reserveAfterDate", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_SalesOpportunityId(), ecorePackage.getEString(), "salesOpportunityId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_SelectedAmount(), ecorePackage.getEBigDecimal(), "selectedAmount", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ShipAfterDate(), ecorePackage.getEDate(), "shipAfterDate", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ShipBeforeDate(), ecorePackage.getEDate(), "shipBeforeDate", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ShoppingListId(), ecorePackage.getEString(), "shoppingListId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ShoppingListItemSeqId(), ecorePackage.getEString(), "shoppingListItemSeqId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_StatusId(), ecorePackage.getEString(), "statusId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_SubscriptionId(), ecorePackage.getEString(), "subscriptionId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_SupplierProductId(), ecorePackage.getEString(), "supplierProductId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_SyncStatusId(), ecorePackage.getEString(), "syncStatusId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_UnitAverageCost(), ecorePackage.getEBigDecimal(), "unitAverageCost", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_UnitListPrice(), ecorePackage.getEBigDecimal(), "unitListPrice", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_UnitPrice(), ecorePackage.getEBigDecimal(), "unitPrice", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_UnitRecurringPrice(), ecorePackage.getEBigDecimal(), "unitRecurringPrice", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemAssocEClass, OrderItemAssoc.class, "OrderItemAssoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemAssoc_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderItemAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAssoc_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderItemAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAssoc_ShipGroupSeqId(), ecorePackage.getEString(), "shipGroupSeqId", null, 0, 1, OrderItemAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAssoc_ToOrderId(), ecorePackage.getEString(), "toOrderId", null, 0, 1, OrderItemAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAssoc_ToOrderItemSeqId(), ecorePackage.getEString(), "toOrderItemSeqId", null, 0, 1, OrderItemAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAssoc_ToShipGroupSeqId(), ecorePackage.getEString(), "toShipGroupSeqId", null, 0, 1, OrderItemAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAssoc_OrderItemAssocTypeId(), ecorePackage.getEString(), "orderItemAssocTypeId", null, 0, 1, OrderItemAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAssoc_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, OrderItemAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemAssocTypeEClass, OrderItemAssocType.class, "OrderItemAssocType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemAssocType_OrderItemAssocTypeId(), ecorePackage.getEString(), "orderItemAssocTypeId", null, 0, 1, OrderItemAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAssocType_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderItemAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAssocType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, OrderItemAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAssocType_ParentTypeId(), ecorePackage.getEString(), "parentTypeId", null, 0, 1, OrderItemAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(orderItemAssocTypeEClass, ecorePackage.getEString(), "childOrderItemAssocTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(orderItemAttributeEClass, OrderItemAttribute.class, "OrderItemAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemAttribute_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderItemAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAttribute_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderItemAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 0, 1, OrderItemAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, OrderItemAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, OrderItemAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemBillingEClass, OrderItemBilling.class, "OrderItemBilling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemBilling_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemBilling_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemBilling_InvoiceId(), ecorePackage.getEString(), "invoiceId", null, 0, 1, OrderItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemBilling_InvoiceItemSeqId(), ecorePackage.getEString(), "invoiceItemSeqId", null, 0, 1, OrderItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemBilling_Amount(), ecorePackage.getEBigDecimal(), "amount", null, 0, 1, OrderItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemBilling_ItemIssuanceId(), ecorePackage.getEString(), "itemIssuanceId", null, 0, 1, OrderItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemBilling_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, OrderItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemBilling_ShipmentReceiptId(), ecorePackage.getEString(), "shipmentReceiptId", null, 0, 1, OrderItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemChangeEClass, OrderItemChange.class, "OrderItemChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemChange_OrderItemChangeId(), ecorePackage.getEString(), "orderItemChangeId", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemChange_CancelQuantity(), ecorePackage.getEBigDecimal(), "cancelQuantity", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemChange_ChangeComments(), ecorePackage.getEString(), "changeComments", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemChange_ChangeDatetime(), ecorePackage.getEDate(), "changeDatetime", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemChange_ChangeTypeEnumId(), ecorePackage.getEString(), "changeTypeEnumId", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemChange_ChangeUserLogin(), ecorePackage.getEString(), "changeUserLogin", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemChange_ItemDescription(), ecorePackage.getEString(), "itemDescription", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemChange_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemChange_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemChange_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemChange_ReasonEnumId(), ecorePackage.getEString(), "reasonEnumId", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemChange_UnitPrice(), ecorePackage.getEBigDecimal(), "unitPrice", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemContactMechEClass, OrderItemContactMech.class, "OrderItemContactMech", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemContactMech_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderItemContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemContactMech_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderItemContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemContactMech_ContactMechPurposeTypeId(), ecorePackage.getEString(), "contactMechPurposeTypeId", null, 0, 1, OrderItemContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemContactMech_ContactMechId(), ecorePackage.getEString(), "contactMechId", null, 0, 1, OrderItemContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemGroupEClass, OrderItemGroup.class, "OrderItemGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemGroup_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderItemGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemGroup_OrderItemGroupSeqId(), ecorePackage.getEString(), "orderItemGroupSeqId", null, 0, 1, OrderItemGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemGroup_GroupName(), ecorePackage.getEString(), "groupName", null, 0, 1, OrderItemGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemGroup_ParentGroupSeqId(), ecorePackage.getEString(), "parentGroupSeqId", null, 0, 1, OrderItemGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemGroupOrderEClass, OrderItemGroupOrder.class, "OrderItemGroupOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemGroupOrder_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderItemGroupOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemGroupOrder_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderItemGroupOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemGroupOrder_GroupOrderId(), ecorePackage.getEString(), "groupOrderId", null, 0, 1, OrderItemGroupOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemPriceInfoEClass, OrderItemPriceInfo.class, "OrderItemPriceInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemPriceInfo_OrderItemPriceInfoId(), ecorePackage.getEString(), "orderItemPriceInfoId", null, 0, 1, OrderItemPriceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemPriceInfo_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderItemPriceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemPriceInfo_ModifyAmount(), ecorePackage.getEBigDecimal(), "modifyAmount", null, 0, 1, OrderItemPriceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemPriceInfo_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderItemPriceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemPriceInfo_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderItemPriceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemPriceInfo_ProductPriceActionSeqId(), ecorePackage.getEString(), "productPriceActionSeqId", null, 0, 1, OrderItemPriceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemPriceInfo_ProductPriceRuleId(), ecorePackage.getEString(), "productPriceRuleId", null, 0, 1, OrderItemPriceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemPriceInfo_RateCode(), ecorePackage.getEString(), "rateCode", null, 0, 1, OrderItemPriceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemRoleEClass, OrderItemRole.class, "OrderItemRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemRole_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderItemRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemRole_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderItemRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemRole_PartyId(), ecorePackage.getEString(), "partyId", null, 0, 1, OrderItemRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemRole_RoleTypeId(), ecorePackage.getEString(), "roleTypeId", null, 0, 1, OrderItemRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemShipGroupEClass, OrderItemShipGroup.class, "OrderItemShipGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemShipGroup_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_ShipGroupSeqId(), ecorePackage.getEString(), "shipGroupSeqId", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_CarrierPartyId(), ecorePackage.getEString(), "carrierPartyId", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_CarrierRoleTypeId(), ecorePackage.getEString(), "carrierRoleTypeId", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_ContactMechId(), ecorePackage.getEString(), "contactMechId", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_EstimatedDeliveryDate(), ecorePackage.getEDate(), "estimatedDeliveryDate", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_EstimatedShipDate(), ecorePackage.getEDate(), "estimatedShipDate", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_FacilityId(), ecorePackage.getEString(), "facilityId", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_GiftMessage(), ecorePackage.getEString(), "giftMessage", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_IsGift(), ecorePackage.getEBoolean(), "isGift", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_MaySplit(), ecorePackage.getEBoolean(), "maySplit", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_ShipAfterDate(), ecorePackage.getEDate(), "shipAfterDate", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_ShipByDate(), ecorePackage.getEDate(), "shipByDate", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_ShipmentMethodTypeId(), ecorePackage.getEString(), "shipmentMethodTypeId", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_ShippingInstructions(), ecorePackage.getEString(), "shippingInstructions", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_SupplierAgreementId(), ecorePackage.getEString(), "supplierAgreementId", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_SupplierPartyId(), ecorePackage.getEString(), "supplierPartyId", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_TelecomContactMechId(), ecorePackage.getEString(), "telecomContactMechId", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_TrackingNumber(), ecorePackage.getEString(), "trackingNumber", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_VendorPartyId(), ecorePackage.getEString(), "vendorPartyId", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemShipGroupAssocEClass, OrderItemShipGroupAssoc.class, "OrderItemShipGroupAssoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemShipGroupAssoc_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderItemShipGroupAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroupAssoc_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderItemShipGroupAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroupAssoc_ShipGroupSeqId(), ecorePackage.getEString(), "shipGroupSeqId", null, 0, 1, OrderItemShipGroupAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroupAssoc_CancelQuantity(), ecorePackage.getEBigDecimal(), "cancelQuantity", null, 0, 1, OrderItemShipGroupAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroupAssoc_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, OrderItemShipGroupAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemShipGrpInvResEClass, OrderItemShipGrpInvRes.class, "OrderItemShipGrpInvRes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemShipGrpInvRes_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGrpInvRes_ShipGroupSeqId(), ecorePackage.getEString(), "shipGroupSeqId", null, 0, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGrpInvRes_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGrpInvRes_InventoryItemId(), ecorePackage.getEString(), "inventoryItemId", null, 0, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGrpInvRes_CreatedDatetime(), ecorePackage.getEDate(), "createdDatetime", null, 0, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGrpInvRes_CurrentPromisedDate(), ecorePackage.getEDate(), "currentPromisedDate", null, 0, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGrpInvRes_OldPickStartDate(), ecorePackage.getEDate(), "oldPickStartDate", null, 0, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGrpInvRes_Priority(), ecorePackage.getEBoolean(), "priority", null, 0, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGrpInvRes_PromisedDatetime(), ecorePackage.getEDate(), "promisedDatetime", null, 0, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGrpInvRes_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGrpInvRes_QuantityNotAvailable(), ecorePackage.getEBigDecimal(), "quantityNotAvailable", null, 0, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGrpInvRes_ReserveOrderEnumId(), ecorePackage.getEString(), "reserveOrderEnumId", null, 0, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGrpInvRes_ReservedDatetime(), ecorePackage.getEDate(), "reservedDatetime", null, 0, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGrpInvRes_SequenceId(), ecorePackage.getELong(), "sequenceId", null, 0, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemTypeEClass, OrderItemType.class, "OrderItemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemType_OrderItemTypeId(), ecorePackage.getEString(), "orderItemTypeId", null, 0, 1, OrderItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemType_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, OrderItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemType_ParentTypeId(), ecorePackage.getEString(), "parentTypeId", null, 0, 1, OrderItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemType_OrderItemTypeAttrs(), ecorePackage.getEString(), "orderItemTypeAttrs", null, 0, -1, OrderItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(orderItemTypeEClass, ecorePackage.getEString(), "childOrderItemTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(orderItemTypeEClass, ecorePackage.getEString(), "orderItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(orderItemTypeAttrEClass, OrderItemTypeAttr.class, "OrderItemTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemTypeAttr_OrderItemTypeId(), ecorePackage.getEString(), "orderItemTypeId", null, 0, 1, OrderItemTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 0, 1, OrderItemTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderItemTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderNotificationEClass, OrderNotification.class, "OrderNotification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderNotification_OrderNotificationId(), ecorePackage.getEString(), "orderNotificationId", null, 0, 1, OrderNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderNotification_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, OrderNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderNotification_EmailType(), ecorePackage.getEString(), "emailType", null, 0, 1, OrderNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderNotification_NotificationDate(), ecorePackage.getEDate(), "notificationDate", null, 0, 1, OrderNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderNotification_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderPaymentPreferenceEClass, OrderPaymentPreference.class, "OrderPaymentPreference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderPaymentPreference_OrderPaymentPreferenceId(), ecorePackage.getEString(), "orderPaymentPreferenceId", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_BillingPostalCode(), ecorePackage.getEString(), "billingPostalCode", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_CreatedByUserLogin(), ecorePackage.getEString(), "createdByUserLogin", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_CreatedDate(), ecorePackage.getEDate(), "createdDate", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_FinAccountId(), ecorePackage.getEString(), "finAccountId", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_LastModifiedByUserLogin(), ecorePackage.getEString(), "lastModifiedByUserLogin", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_LastModifiedDate(), ecorePackage.getEDate(), "lastModifiedDate", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_ManualAuthCode(), ecorePackage.getEString(), "manualAuthCode", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_ManualRefNum(), ecorePackage.getEString(), "manualRefNum", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_MaxAmount(), ecorePackage.getEBigDecimal(), "maxAmount", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_NeedsNsfRetry(), ecorePackage.getEBoolean(), "needsNsfRetry", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_OverflowFlag(), ecorePackage.getEBoolean(), "overflowFlag", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_PaymentMethodId(), ecorePackage.getEString(), "paymentMethodId", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_PaymentMethodTypeId(), ecorePackage.getEString(), "paymentMethodTypeId", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_PresentFlag(), ecorePackage.getEBoolean(), "presentFlag", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_ProcessAttempt(), ecorePackage.getELong(), "processAttempt", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_ProductPricePurposeId(), ecorePackage.getEString(), "productPricePurposeId", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_SecurityCode(), ecorePackage.getEString(), "securityCode", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_ShipGroupSeqId(), ecorePackage.getEString(), "shipGroupSeqId", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_StatusId(), ecorePackage.getEString(), "statusId", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_SwipedFlag(), ecorePackage.getEBoolean(), "swipedFlag", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_Track2(), ecorePackage.getEString(), "track2", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(orderPaymentPreferenceEClass, ecorePackage.getEString(), "orderStatuss", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(orderPaymentPreferenceEClass, ecorePackage.getEString(), "paymentGatewayResponses", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(orderPaymentPreferenceEClass, ecorePackage.getEString(), "payments", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(orderPaymentPreferenceEClass, ecorePackage.getEString(), "returnItemResponses", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(orderProductPromoCodeEClass, OrderProductPromoCode.class, "OrderProductPromoCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderProductPromoCode_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderProductPromoCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderProductPromoCode_ProductPromoCodeId(), ecorePackage.getEString(), "productPromoCodeId", null, 0, 1, OrderProductPromoCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderRoleEClass, OrderRole.class, "OrderRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderRole_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderRole_PartyId(), ecorePackage.getEString(), "partyId", null, 0, 1, OrderRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderRole_RoleTypeId(), ecorePackage.getEString(), "roleTypeId", null, 0, 1, OrderRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderShipmentEClass, OrderShipment.class, "OrderShipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderShipment_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderShipment_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderShipment_ShipGroupSeqId(), ecorePackage.getEString(), "shipGroupSeqId", null, 0, 1, OrderShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderShipment_ShipmentId(), ecorePackage.getEString(), "shipmentId", null, 0, 1, OrderShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderShipment_ShipmentItemSeqId(), ecorePackage.getEString(), "shipmentItemSeqId", null, 0, 1, OrderShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderShipment_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, OrderShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderStatusEClass, OrderStatus.class, "OrderStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderStatus_OrderStatusId(), ecorePackage.getEString(), "orderStatusId", null, 0, 1, OrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderStatus_ChangeReason(), ecorePackage.getEString(), "changeReason", null, 0, 1, OrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderStatus_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderStatus_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderStatus_OrderPaymentPreferenceId(), ecorePackage.getEString(), "orderPaymentPreferenceId", null, 0, 1, OrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderStatus_StatusDatetime(), ecorePackage.getEDate(), "statusDatetime", null, 0, 1, OrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderStatus_StatusId(), ecorePackage.getEString(), "statusId", null, 0, 1, OrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderStatus_StatusUserLogin(), ecorePackage.getEString(), "statusUserLogin", null, 0, 1, OrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderSummaryEntryEClass, OrderSummaryEntry.class, "OrderSummaryEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderSummaryEntry_EntryDate(), ecorePackage.getEDate(), "entryDate", null, 0, 1, OrderSummaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderSummaryEntry_ProductId(), ecorePackage.getEString(), "productId", null, 0, 1, OrderSummaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderSummaryEntry_FacilityId(), ecorePackage.getEString(), "facilityId", null, 0, 1, OrderSummaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderSummaryEntry_GrossSales(), ecorePackage.getEBigDecimal(), "grossSales", null, 0, 1, OrderSummaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderSummaryEntry_ProductCost(), ecorePackage.getEBigDecimal(), "productCost", null, 0, 1, OrderSummaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderSummaryEntry_TotalQuantity(), ecorePackage.getEBigDecimal(), "totalQuantity", null, 0, 1, OrderSummaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderTermEClass, OrderTerm.class, "OrderTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderTerm_TermTypeId(), ecorePackage.getEString(), "termTypeId", null, 0, 1, OrderTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTerm_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTerm_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTerm_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTerm_TermDays(), ecorePackage.getELong(), "termDays", null, 0, 1, OrderTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTerm_TermValue(), ecorePackage.getEBigDecimal(), "termValue", null, 0, 1, OrderTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTerm_TextValue(), ecorePackage.getEString(), "textValue", null, 0, 1, OrderTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTerm_UomId(), ecorePackage.getEString(), "uomId", null, 0, 1, OrderTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderTermAttributeEClass, OrderTermAttribute.class, "OrderTermAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderTermAttribute_TermTypeId(), ecorePackage.getEString(), "termTypeId", null, 0, 1, OrderTermAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTermAttribute_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, OrderTermAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTermAttribute_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderTermAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTermAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 0, 1, OrderTermAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTermAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, OrderTermAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTermAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, OrderTermAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderTypeEClass, OrderType.class, "OrderType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderType_OrderTypeId(), ecorePackage.getEString(), "orderTypeId", null, 0, 1, OrderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderType_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, OrderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderType_ParentTypeId(), ecorePackage.getEString(), "parentTypeId", null, 0, 1, OrderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderType_OrderTypeAttrs(), ecorePackage.getEString(), "orderTypeAttrs", null, 0, -1, OrderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(orderTypeEClass, ecorePackage.getEString(), "childOrderTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(orderTypeEClass, ecorePackage.getEString(), "orderHeaders", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(orderTypeEClass, ecorePackage.getEString(), "partyPrefDocTypeTpls", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(orderTypeAttrEClass, OrderTypeAttr.class, "OrderTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderTypeAttr_OrderTypeId(), ecorePackage.getEString(), "orderTypeId", null, 0, 1, OrderTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 0, 1, OrderTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productOrderItemEClass, ProductOrderItem.class, "ProductOrderItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductOrderItem_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, ProductOrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductOrderItem_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, ProductOrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductOrderItem_EngagementId(), ecorePackage.getEString(), "engagementId", null, 0, 1, ProductOrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductOrderItem_EngagementItemSeqId(), ecorePackage.getEString(), "engagementItemSeqId", null, 0, 1, ProductOrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductOrderItem_ProductId(), ecorePackage.getEString(), "productId", null, 0, 1, ProductOrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workOrderItemFulfillmentEClass, WorkOrderItemFulfillment.class, "WorkOrderItemFulfillment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkOrderItemFulfillment_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 0, 1, WorkOrderItemFulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkOrderItemFulfillment_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, WorkOrderItemFulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkOrderItemFulfillment_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, WorkOrderItemFulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkOrderItemFulfillment_ShipGroupSeqId(), ecorePackage.getEString(), "shipGroupSeqId", null, 0, 1, WorkOrderItemFulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// mimo-ent-slot
		createMimoentslotAnnotations();
		// mimo-ent-domain
		createMimoentdomainAnnotations();
		// mimo-ent-frame
		createMimoentframeAnnotations();
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
		  (getCommunicationEventOrder_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getCommunicationEventOrder_CommunicationEventId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (orderAdjustmentEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderAdjustment_OrderAdjustmentId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderAdjustment_OrderAdjustmentAttributes(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderAdjustmentAttribute_OrderAdjustmentId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderAdjustmentAttribute_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderAdjustmentBilling_OrderAdjustmentId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderAdjustmentBilling_InvoiceId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderAdjustmentBilling_InvoiceItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (orderAdjustmentTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (orderAdjustmentTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (orderAdjustmentTypeEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderAdjustmentType_OrderAdjustmentTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderAdjustmentType_OrderAdjustmentTypeAttrs(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderAdjustmentTypeAttr_OrderAdjustmentTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderAdjustmentTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderAttribute_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderAttribute_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderBlacklist_BlacklistString(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderBlacklist_OrderBlacklistTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (orderBlacklistTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderBlacklistType_OrderBlacklistTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderContactMech_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderContactMech_ContactMechPurposeTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderContactMech_ContactMechId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderContent_ContentId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderContent_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderContent_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderContent_OrderContentTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderContent_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (orderContentTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderContentType_OrderContentTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderDeliverySchedule_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderDeliverySchedule_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(3),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(4),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(5),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(6),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(7),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(8),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(9),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(10),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(11),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(12),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(13),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(14),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(15),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(16),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderHeader_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderHeader_CommunicationEventOrders(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderHeader_OrderAttributes(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderHeader_OrderDeliverySchedules(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderHeader_OrderHeaderNotes(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderHeader_OrderHeaderWorkEfforts(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderHeader_OrderItems(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderHeader_OrderItemGroups(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderHeader_OrderItemShipGroups(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderHeader_OrderProductPromoCodes(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderHeader_ProductPromoUses(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderHeader_TrackingCodeOrders(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderHeaderNote_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderHeaderWorkEffort_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderHeaderWorkEffort_WorkEffortId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItem_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItem_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemAssoc_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemAssoc_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemAssoc_ShipGroupSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemAssoc_ToOrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemAssoc_ToOrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemAssoc_ToShipGroupSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemAssoc_OrderItemAssocTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (orderItemAssocTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderItemAssocType_OrderItemAssocTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemAttribute_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemAttribute_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemAttribute_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemBilling_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemBilling_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemBilling_InvoiceId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemBilling_InvoiceItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemChange_OrderItemChangeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemContactMech_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemContactMech_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemContactMech_ContactMechPurposeTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemGroup_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemGroup_OrderItemGroupSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemGroupOrder_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemGroupOrder_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemGroupOrder_GroupOrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemPriceInfo_OrderItemPriceInfoId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemRole_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemRole_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemRole_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemRole_RoleTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemShipGroup_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemShipGroup_ShipGroupSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemShipGroupAssoc_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemShipGroupAssoc_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemShipGroupAssoc_ShipGroupSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemShipGrpInvRes_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemShipGrpInvRes_ShipGroupSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemShipGrpInvRes_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemShipGrpInvRes_InventoryItemId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (orderItemTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (orderItemTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderItemType_OrderItemTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemType_OrderItemTypeAttrs(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderItemTypeAttr_OrderItemTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderItemTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderNotification_OrderNotificationId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (orderPaymentPreferenceEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (orderPaymentPreferenceEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (orderPaymentPreferenceEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (orderPaymentPreferenceEClass.getEOperations().get(3),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderPaymentPreference_OrderPaymentPreferenceId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderProductPromoCode_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderProductPromoCode_ProductPromoCodeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderRole_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderRole_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderRole_RoleTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderShipment_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderShipment_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderShipment_ShipGroupSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderShipment_ShipmentId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderShipment_ShipmentItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderStatus_OrderStatusId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderSummaryEntry_EntryDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderSummaryEntry_ProductId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderSummaryEntry_FacilityId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderTerm_TermTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderTerm_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderTerm_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderTermAttribute_TermTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderTermAttribute_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderTermAttribute_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderTermAttribute_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (orderTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (orderTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (orderTypeEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderType_OrderTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderType_OrderTypeAttrs(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderTypeAttr_OrderTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductOrderItem_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductOrderItem_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductOrderItem_EngagementId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductOrderItem_EngagementItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkOrderItemFulfillment_WorkEffortId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkOrderItemFulfillment_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkOrderItemFulfillment_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
	}

	/**
	 * Initializes the annotations for <b>mimo-ent-domain</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMimoentdomainAnnotations() {
		String source = "mimo-ent-domain";
		addAnnotation
		  (getCommunicationEventOrder_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getCommunicationEventOrder_CommunicationEventId(),
		   source,
		   new String[] {
			   "frame", "CommunicationEvent"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderAdjustmentEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "ReturnAdjustment",
			   "route", "orderAdjustmentId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderAdjustment_CreatedByUserLogin(),
		   source,
		   new String[] {
			   "frame", "UserLogin"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderAdjustment_OrderAdjustmentTypeId(),
		   source,
		   new String[] {
			   "frame", "OrderAdjustmentType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderAdjustment_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderAdjustment_OriginalAdjustmentId(),
		   source,
		   new String[] {
			   "frame", "OrderAdjustment"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderAdjustment_OverrideGlAccountId(),
		   source,
		   new String[] {
			   "frame", "GlAccount"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderAdjustment_PrimaryGeoId(),
		   source,
		   new String[] {
			   "frame", "Geo"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderAdjustment_ProductPromoId(),
		   source,
		   new String[] {
			   "frame", "ProductPromo"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderAdjustment_SecondaryGeoId(),
		   source,
		   new String[] {
			   "frame", "Geo"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderAdjustment_TaxAuthorityRateSeqId(),
		   source,
		   new String[] {
			   "frame", "TaxAuthorityRateProduct"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderAdjustment_OrderAdjustmentAttributes(),
		   source,
		   new String[] {
			   "frame", "OrderAdjustmentAttribute"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderAdjustmentAttribute_OrderAdjustmentId(),
		   source,
		   new String[] {
			   "frame", "OrderAdjustment"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderAdjustmentBilling_OrderAdjustmentId(),
		   source,
		   new String[] {
			   "frame", "OrderAdjustment"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderAdjustmentBilling_InvoiceId(),
		   source,
		   new String[] {
			   "frame", "Invoice"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderAdjustmentTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "OrderAdjustmentType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderAdjustmentTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "OrderAdjustment",
			   "route", "orderAdjustmentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderAdjustmentTypeEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "frame", "QuoteAdjustment",
			   "route", "quoteAdjustmentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderAdjustmentType_ParentTypeId(),
		   source,
		   new String[] {
			   "frame", "OrderAdjustmentType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderAdjustmentType_OrderAdjustmentTypeAttrs(),
		   source,
		   new String[] {
			   "frame", "OrderAdjustmentTypeAttr"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderAdjustmentTypeAttr_OrderAdjustmentTypeId(),
		   source,
		   new String[] {
			   "frame", "OrderAdjustmentType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderAttribute_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderBlacklist_OrderBlacklistTypeId(),
		   source,
		   new String[] {
			   "frame", "OrderBlacklistType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderBlacklistTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "OrderBlacklist",
			   "route", "orderBlacklistTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderContactMech_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderContactMech_ContactMechPurposeTypeId(),
		   source,
		   new String[] {
			   "frame", "ContactMechPurposeType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderContactMech_ContactMechId(),
		   source,
		   new String[] {
			   "frame", "ContactMech"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderContent_ContentId(),
		   source,
		   new String[] {
			   "frame", "Content"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderContent_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderContent_OrderContentTypeId(),
		   source,
		   new String[] {
			   "frame", "OrderContentType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderContentTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "OrderContentType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderContentType_ParentTypeId(),
		   source,
		   new String[] {
			   "frame", "OrderContentType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderDeliverySchedule_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderDeliverySchedule_StatusId(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderDeliverySchedule_TotalCubicUomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderDeliverySchedule_TotalWeightUomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "FixedAsset",
			   "route", "acquireOrderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "GiftCardFulfillment",
			   "route", "orderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "frame", "ItemIssuance",
			   "route", "orderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(3),
		   source,
		   new String[] {
			   "frame", "OrderAdjustment",
			   "route", "orderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(4),
		   source,
		   new String[] {
			   "frame", "OrderItemChange",
			   "route", "orderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(5),
		   source,
		   new String[] {
			   "frame", "OrderItemPriceInfo",
			   "route", "orderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(6),
		   source,
		   new String[] {
			   "frame", "OrderNotification",
			   "route", "orderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(7),
		   source,
		   new String[] {
			   "frame", "OrderPaymentPreference",
			   "route", "orderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(8),
		   source,
		   new String[] {
			   "frame", "OrderStatus",
			   "route", "orderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(9),
		   source,
		   new String[] {
			   "frame", "PicklistBin",
			   "route", "primaryOrderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(10),
		   source,
		   new String[] {
			   "frame", "Shipment",
			   "route", "primaryOrderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(11),
		   source,
		   new String[] {
			   "frame", "FixedAssetMaint",
			   "route", "purchaseOrderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(12),
		   source,
		   new String[] {
			   "frame", "ReturnItemResponse",
			   "route", "replacementOrderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(13),
		   source,
		   new String[] {
			   "frame", "ReturnItem",
			   "route", "orderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(14),
		   source,
		   new String[] {
			   "frame", "ShipmentReceipt",
			   "route", "orderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(15),
		   source,
		   new String[] {
			   "frame", "Subscription",
			   "route", "orderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderHeaderEClass.getEOperations().get(16),
		   source,
		   new String[] {
			   "frame", "SurveyResponse",
			   "route", "orderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader_AutoOrderShoppingListId(),
		   source,
		   new String[] {
			   "frame", "ShoppingList"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader_BillingAccountId(),
		   source,
		   new String[] {
			   "frame", "BillingAccount"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader_CreatedBy(),
		   source,
		   new String[] {
			   "frame", "UserLogin"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader_CurrencyUom(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader_OrderTypeId(),
		   source,
		   new String[] {
			   "frame", "OrderType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader_OriginFacilityId(),
		   source,
		   new String[] {
			   "frame", "Facility"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader_ProductStoreId(),
		   source,
		   new String[] {
			   "frame", "ProductStore"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader_SalesChannelEnumId(),
		   source,
		   new String[] {
			   "frame", "Enumeration"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader_StatusId(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader_SyncStatusId(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader_WebSiteId(),
		   source,
		   new String[] {
			   "frame", "WebSite"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader_CommunicationEventOrders(),
		   source,
		   new String[] {
			   "frame", "CommunicationEventOrder"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader_OrderAttributes(),
		   source,
		   new String[] {
			   "frame", "OrderAttribute"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader_OrderDeliverySchedules(),
		   source,
		   new String[] {
			   "frame", "OrderDeliverySchedule"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader_OrderHeaderNotes(),
		   source,
		   new String[] {
			   "frame", "OrderHeaderNote"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader_OrderHeaderWorkEfforts(),
		   source,
		   new String[] {
			   "frame", "OrderHeaderWorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader_OrderItems(),
		   source,
		   new String[] {
			   "frame", "OrderItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader_OrderItemGroups(),
		   source,
		   new String[] {
			   "frame", "OrderItemGroup"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader_OrderItemShipGroups(),
		   source,
		   new String[] {
			   "frame", "OrderItemShipGroup"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader_OrderProductPromoCodes(),
		   source,
		   new String[] {
			   "frame", "OrderProductPromoCode"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader_ProductPromoUses(),
		   source,
		   new String[] {
			   "frame", "ProductPromoUse"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader_TrackingCodeOrders(),
		   source,
		   new String[] {
			   "frame", "TrackingCodeOrder"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeaderNote_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeaderWorkEffort_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeaderWorkEffort_WorkEffortId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItem_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItem_ChangeByUserLoginId(),
		   source,
		   new String[] {
			   "frame", "UserLogin"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItem_DontCancelSetUserLogin(),
		   source,
		   new String[] {
			   "frame", "UserLogin"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItem_FromInventoryItemId(),
		   source,
		   new String[] {
			   "frame", "InventoryItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItem_OrderItemTypeId(),
		   source,
		   new String[] {
			   "frame", "OrderItemType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItem_OverrideGlAccountId(),
		   source,
		   new String[] {
			   "frame", "GlAccount"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItem_ProductId(),
		   source,
		   new String[] {
			   "frame", "Product"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItem_RecurringFreqUomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItem_SalesOpportunityId(),
		   source,
		   new String[] {
			   "frame", "SalesOpportunity"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItem_StatusId(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItem_SyncStatusId(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemAssoc_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemAssoc_ToOrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemAssoc_OrderItemAssocTypeId(),
		   source,
		   new String[] {
			   "frame", "OrderItemAssocType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderItemAssocTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "OrderItemAssocType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemAssocType_ParentTypeId(),
		   source,
		   new String[] {
			   "frame", "OrderItemAssocType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemBilling_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemBilling_InvoiceId(),
		   source,
		   new String[] {
			   "frame", "Invoice"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemBilling_ItemIssuanceId(),
		   source,
		   new String[] {
			   "frame", "ItemIssuance"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemBilling_ShipmentReceiptId(),
		   source,
		   new String[] {
			   "frame", "ShipmentReceipt"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemChange_ChangeUserLogin(),
		   source,
		   new String[] {
			   "frame", "UserLogin"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemChange_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemContactMech_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemContactMech_ContactMechPurposeTypeId(),
		   source,
		   new String[] {
			   "frame", "ContactMechPurposeType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemContactMech_ContactMechId(),
		   source,
		   new String[] {
			   "frame", "ContactMech"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemGroup_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemGroupOrder_GroupOrderId(),
		   source,
		   new String[] {
			   "frame", "ProductGroupOrder"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemPriceInfo_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemPriceInfo_ProductPriceRuleId(),
		   source,
		   new String[] {
			   "frame", "ProductPriceRule"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemRole_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemRole_PartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemRole_RoleTypeId(),
		   source,
		   new String[] {
			   "frame", "RoleType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemShipGroup_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemShipGroup_CarrierPartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemShipGroup_ContactMechId(),
		   source,
		   new String[] {
			   "frame", "ContactMech"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemShipGroup_FacilityId(),
		   source,
		   new String[] {
			   "frame", "Facility"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemShipGroup_ShipmentMethodTypeId(),
		   source,
		   new String[] {
			   "frame", "ShipmentMethodType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemShipGroup_SupplierAgreementId(),
		   source,
		   new String[] {
			   "frame", "Agreement"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemShipGroup_SupplierPartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemShipGroup_TelecomContactMechId(),
		   source,
		   new String[] {
			   "frame", "ContactMech"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemShipGroup_VendorPartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemShipGroupAssoc_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemShipGrpInvRes_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemShipGrpInvRes_InventoryItemId(),
		   source,
		   new String[] {
			   "frame", "InventoryItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderItemTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "OrderItemType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderItemTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "OrderItem",
			   "route", "orderItemTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemType_ParentTypeId(),
		   source,
		   new String[] {
			   "frame", "OrderItemType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemType_OrderItemTypeAttrs(),
		   source,
		   new String[] {
			   "frame", "OrderItemTypeAttr"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemTypeAttr_OrderItemTypeId(),
		   source,
		   new String[] {
			   "frame", "OrderItemType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderNotification_EmailType(),
		   source,
		   new String[] {
			   "frame", "Enumeration"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderNotification_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderPaymentPreferenceEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "OrderStatus",
			   "route", "orderPaymentPreferenceId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderPaymentPreferenceEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "PaymentGatewayResponse",
			   "route", "orderPaymentPreferenceId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderPaymentPreferenceEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "frame", "Payment",
			   "route", "paymentPreferenceId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderPaymentPreferenceEClass.getEOperations().get(3),
		   source,
		   new String[] {
			   "frame", "ReturnItemResponse",
			   "route", "orderPaymentPreferenceId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderPaymentPreference_CreatedByUserLogin(),
		   source,
		   new String[] {
			   "frame", "UserLogin"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderPaymentPreference_FinAccountId(),
		   source,
		   new String[] {
			   "frame", "FinAccount"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderPaymentPreference_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderPaymentPreference_PaymentMethodId(),
		   source,
		   new String[] {
			   "frame", "PaymentMethod"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderPaymentPreference_PaymentMethodTypeId(),
		   source,
		   new String[] {
			   "frame", "PaymentMethodType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderPaymentPreference_ProductPricePurposeId(),
		   source,
		   new String[] {
			   "frame", "ProductPricePurpose"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderPaymentPreference_StatusId(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderProductPromoCode_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderProductPromoCode_ProductPromoCodeId(),
		   source,
		   new String[] {
			   "frame", "ProductPromoCode"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderRole_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderRole_PartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderRole_RoleTypeId(),
		   source,
		   new String[] {
			   "frame", "RoleType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderShipment_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderShipment_ShipmentId(),
		   source,
		   new String[] {
			   "frame", "Shipment"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderStatus_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderStatus_OrderPaymentPreferenceId(),
		   source,
		   new String[] {
			   "frame", "OrderPaymentPreference"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderStatus_StatusId(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderStatus_StatusUserLogin(),
		   source,
		   new String[] {
			   "frame", "UserLogin"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderSummaryEntry_ProductId(),
		   source,
		   new String[] {
			   "frame", "Product"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderSummaryEntry_FacilityId(),
		   source,
		   new String[] {
			   "frame", "Facility"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderTerm_TermTypeId(),
		   source,
		   new String[] {
			   "frame", "TermType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderTerm_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderTerm_UomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "OrderType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "OrderHeader",
			   "route", "orderTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (orderTypeEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "frame", "PartyPrefDocTypeTpl",
			   "route", "orderTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderType_ParentTypeId(),
		   source,
		   new String[] {
			   "frame", "OrderType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderType_OrderTypeAttrs(),
		   source,
		   new String[] {
			   "frame", "OrderTypeAttr"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderTypeAttr_OrderTypeId(),
		   source,
		   new String[] {
			   "frame", "OrderType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductOrderItem_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductOrderItem_EngagementId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductOrderItem_ProductId(),
		   source,
		   new String[] {
			   "frame", "Product"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkOrderItemFulfillment_WorkEffortId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkOrderItemFulfillment_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
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
		  (orderAdjustmentEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (orderAdjustmentTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (orderAdjustmentTypeAttrEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (orderBlacklistTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (orderContentTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (orderItemAssocTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (orderItemPriceInfoEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (orderItemTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (orderItemTypeAttrEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (orderTermEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (orderTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (orderTypeAttrEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
	}

} //OrderPackageImpl
