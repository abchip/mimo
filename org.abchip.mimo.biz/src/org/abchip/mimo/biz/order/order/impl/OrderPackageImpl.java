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
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
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
		theQuotePackage.createPackageContents();
		theRequestPackage.createPackageContents();
		theRequirementPackage.createPackageContents();
		theReservationsPackage.createPackageContents();
		theReturnPackage.createPackageContents();
		theShoppingcartPackage.createPackageContents();
		theShoppinglistPackage.createPackageContents();
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
		theQuotePackage.initializePackageContents();
		theRequestPackage.initializePackageContents();
		theRequirementPackage.initializePackageContents();
		theReservationsPackage.initializePackageContents();
		theReturnPackage.initializePackageContents();
		theShoppingcartPackage.initializePackageContents();
		theShoppinglistPackage.initializePackageContents();
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
	public EReference getCommunicationEventOrder_OrderId() {
		return (EReference)communicationEventOrderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicationEventOrder_CommunicationEventId() {
		return (EReference)communicationEventOrderEClass.getEStructuralFeatures().get(1);
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
	public EReference getOrderAdjustment_CreatedByUserLogin() {
		return (EReference)orderAdjustmentEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_CreatedDate() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_CustomerReferenceId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_Description() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_ExemptAmount() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_IncludeInShipping() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_IncludeInTax() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_IsManual() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_LastModifiedByUserLogin() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_LastModifiedDate() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_OldAmountPerQuantity() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_OldPercentage() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderAdjustment_OrderAdjustmentTypeId() {
		return (EReference)orderAdjustmentEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderAdjustment_OrderId() {
		return (EReference)orderAdjustmentEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_OrderItemSeqId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderAdjustment_OriginalAdjustmentId() {
		return (EReference)orderAdjustmentEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderAdjustment_OverrideGlAccountId() {
		return (EReference)orderAdjustmentEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderAdjustment_PrimaryGeoId() {
		return (EReference)orderAdjustmentEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_ProductFeatureId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_ProductPromoActionSeqId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderAdjustment_ProductPromoId() {
		return (EReference)orderAdjustmentEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_ProductPromoRuleId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_RecurringAmount() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderAdjustment_SecondaryGeoId() {
		return (EReference)orderAdjustmentEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_ShipGroupSeqId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_SourcePercentage() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_SourceReferenceId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_TaxAuthGeoId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustment_TaxAuthPartyId() {
		return (EAttribute)orderAdjustmentEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderAdjustment_TaxAuthorityRateSeqId() {
		return (EReference)orderAdjustmentEClass.getEStructuralFeatures().get(33);
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
	public EOperation getOrderAdjustment__ReturnAdjustments() {
		return orderAdjustmentEClass.getEOperations().get(0);
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
	public EReference getOrderAdjustmentAttribute_OrderAdjustmentId() {
		return (EReference)orderAdjustmentAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentAttribute_AttrName() {
		return (EAttribute)orderAdjustmentAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentAttribute_AttrDescription() {
		return (EAttribute)orderAdjustmentAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentAttribute_AttrValue() {
		return (EAttribute)orderAdjustmentAttributeEClass.getEStructuralFeatures().get(2);
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
	public EReference getOrderAdjustmentBilling_OrderAdjustmentId() {
		return (EReference)orderAdjustmentBillingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderAdjustmentBilling_InvoiceId() {
		return (EReference)orderAdjustmentBillingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentBilling_InvoiceItemSeqId() {
		return (EAttribute)orderAdjustmentBillingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentBilling_Amount() {
		return (EAttribute)orderAdjustmentBillingEClass.getEStructuralFeatures().get(1);
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
	public EReference getOrderAdjustmentType_ParentTypeId() {
		return (EReference)orderAdjustmentTypeEClass.getEStructuralFeatures().get(3);
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
	public EOperation getOrderAdjustmentType__ChildOrderAdjustmentTypes() {
		return orderAdjustmentTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrderAdjustmentType__OrderAdjustments() {
		return orderAdjustmentTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrderAdjustmentType__QuoteAdjustments() {
		return orderAdjustmentTypeEClass.getEOperations().get(2);
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
	public EReference getOrderAdjustmentTypeAttr_OrderAdjustmentTypeId() {
		return (EReference)orderAdjustmentTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentTypeAttr_AttrName() {
		return (EAttribute)orderAdjustmentTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAdjustmentTypeAttr_Description() {
		return (EAttribute)orderAdjustmentTypeAttrEClass.getEStructuralFeatures().get(1);
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
	public EReference getOrderAttribute_OrderId() {
		return (EReference)orderAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAttribute_AttrName() {
		return (EAttribute)orderAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAttribute_AttrDescription() {
		return (EAttribute)orderAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderAttribute_AttrValue() {
		return (EAttribute)orderAttributeEClass.getEStructuralFeatures().get(2);
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
	public EReference getOrderBlacklist_OrderBlacklistTypeId() {
		return (EReference)orderBlacklistEClass.getEStructuralFeatures().get(1);
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
	public EOperation getOrderBlacklistType__OrderBlacklists() {
		return orderBlacklistTypeEClass.getEOperations().get(0);
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
	public EReference getOrderContactMech_OrderId() {
		return (EReference)orderContactMechEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderContactMech_ContactMechPurposeTypeId() {
		return (EReference)orderContactMechEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderContactMech_ContactMechId() {
		return (EReference)orderContactMechEClass.getEStructuralFeatures().get(1);
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
	public EReference getOrderContent_ContentId() {
		return (EReference)orderContentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderContent_OrderId() {
		return (EReference)orderContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderContent_OrderItemSeqId() {
		return (EAttribute)orderContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderContent_OrderContentTypeId() {
		return (EReference)orderContentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderContent_FromDate() {
		return (EAttribute)orderContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderContent_ThruDate() {
		return (EAttribute)orderContentEClass.getEStructuralFeatures().get(2);
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
	public EReference getOrderContentType_ParentTypeId() {
		return (EReference)orderContentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrderContentType__ChildOrderContentTypes() {
		return orderContentTypeEClass.getEOperations().get(0);
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
	public EReference getOrderDeliverySchedule_OrderId() {
		return (EReference)orderDeliveryScheduleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderDeliverySchedule_OrderItemSeqId() {
		return (EAttribute)orderDeliveryScheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderDeliverySchedule_Cartons() {
		return (EAttribute)orderDeliveryScheduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderDeliverySchedule_EstimatedReadyDate() {
		return (EAttribute)orderDeliveryScheduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderDeliverySchedule_SkidsPallets() {
		return (EAttribute)orderDeliveryScheduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderDeliverySchedule_StatusId() {
		return (EReference)orderDeliveryScheduleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderDeliverySchedule_TotalCubicSize() {
		return (EAttribute)orderDeliveryScheduleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderDeliverySchedule_TotalCubicUomId() {
		return (EReference)orderDeliveryScheduleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderDeliverySchedule_TotalWeight() {
		return (EAttribute)orderDeliveryScheduleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderDeliverySchedule_TotalWeightUomId() {
		return (EReference)orderDeliveryScheduleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderDeliverySchedule_UnitsPieces() {
		return (EAttribute)orderDeliveryScheduleEClass.getEStructuralFeatures().get(6);
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
	public EReference getOrderHeader_AutoOrderShoppingListId() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_BillingAccountId() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_CreatedBy() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_CurrencyUom() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_EntryDate() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_ExternalId() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_FirstAttemptOrderId() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_GrandTotal() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_InternalCode() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_InvoicePerShipment() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_IsRushOrder() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_IsViewed() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_NeedsInventoryIssuance() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_OrderDate() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_OrderName() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_OrderTypeId() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_OriginFacilityId() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_PickSheetPrintedDate() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_Priority() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_ProductStoreId() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_RemainingSubTotal() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_SalesChannelEnumId() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_StatusId() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_SyncStatusId() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_TerminalId() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_TransactionId() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeader_VisitId() {
		return (EAttribute)orderHeaderEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeader_WebSiteId() {
		return (EReference)orderHeaderEClass.getEStructuralFeatures().get(29);
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
	public EOperation getOrderHeader__AcquireFixedAssets() {
		return orderHeaderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrderHeader__GiftCardFulfillments() {
		return orderHeaderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrderHeader__ItemIssuances() {
		return orderHeaderEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrderHeader__OrderAdjustments() {
		return orderHeaderEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrderHeader__OrderItemChanges() {
		return orderHeaderEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrderHeader__OrderItemPriceInfos() {
		return orderHeaderEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrderHeader__OrderNotifications() {
		return orderHeaderEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrderHeader__OrderPaymentPreferences() {
		return orderHeaderEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrderHeader__OrderStatuss() {
		return orderHeaderEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrderHeader__PrimaryPicklistBins() {
		return orderHeaderEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrderHeader__PrimaryShipments() {
		return orderHeaderEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrderHeader__PurchaseFixedAssetMaints() {
		return orderHeaderEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrderHeader__ReplacementReturnItemResponses() {
		return orderHeaderEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrderHeader__ReturnItems() {
		return orderHeaderEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrderHeader__ShipmentReceipts() {
		return orderHeaderEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrderHeader__Subscriptions() {
		return orderHeaderEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrderHeader__SurveyResponses() {
		return orderHeaderEClass.getEOperations().get(16);
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
	public EReference getOrderHeaderNote_OrderId() {
		return (EReference)orderHeaderNoteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderHeaderNote_InternalNote() {
		return (EAttribute)orderHeaderNoteEClass.getEStructuralFeatures().get(0);
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
	public EReference getOrderHeaderWorkEffort_OrderId() {
		return (EReference)orderHeaderWorkEffortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderHeaderWorkEffort_WorkEffortId() {
		return (EReference)orderHeaderWorkEffortEClass.getEStructuralFeatures().get(1);
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
	public EReference getOrderItem_OrderId() {
		return (EReference)orderItemEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_OrderItemSeqId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_AutoCancelDate() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_BudgetId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_BudgetItemSeqId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_CancelBackOrderDate() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_CancelQuantity() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItem_ChangeByUserLoginId() {
		return (EReference)orderItemEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_Comments() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_CorrespondingPoId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_DeploymentId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_DontCancelSetDate() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItem_DontCancelSetUserLogin() {
		return (EReference)orderItemEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_EstimatedDeliveryDate() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_EstimatedShipDate() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ExternalId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItem_FromInventoryItemId() {
		return (EReference)orderItemEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_IsItemGroupPrimary() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_IsModifiedPrice() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_IsPromo() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ItemDescription() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_OrderItemGroupSeqId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItem_OrderItemTypeId() {
		return (EReference)orderItemEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItem_OverrideGlAccountId() {
		return (EReference)orderItemEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ProdCatalogId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ProductCategoryId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ProductFeatureId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItem_ProductId() {
		return (EReference)orderItemEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_Quantity() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_QuoteId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_QuoteItemSeqId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItem_RecurringFreqUomId() {
		return (EReference)orderItemEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ReserveAfterDate() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItem_SalesOpportunityId() {
		return (EReference)orderItemEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_SelectedAmount() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ShipAfterDate() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ShipBeforeDate() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ShoppingListId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_ShoppingListItemSeqId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItem_StatusId() {
		return (EReference)orderItemEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_SubscriptionId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_SupplierProductId() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItem_SyncStatusId() {
		return (EReference)orderItemEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_UnitAverageCost() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_UnitListPrice() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_UnitPrice() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItem_UnitRecurringPrice() {
		return (EAttribute)orderItemEClass.getEStructuralFeatures().get(35);
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
	public EReference getOrderItemAssoc_OrderId() {
		return (EReference)orderItemAssocEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAssoc_OrderItemSeqId() {
		return (EAttribute)orderItemAssocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAssoc_ShipGroupSeqId() {
		return (EAttribute)orderItemAssocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemAssoc_ToOrderId() {
		return (EReference)orderItemAssocEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAssoc_ToOrderItemSeqId() {
		return (EAttribute)orderItemAssocEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAssoc_ToShipGroupSeqId() {
		return (EAttribute)orderItemAssocEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemAssoc_OrderItemAssocTypeId() {
		return (EReference)orderItemAssocEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemAssoc_Quantity() {
		return (EAttribute)orderItemAssocEClass.getEStructuralFeatures().get(4);
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
	public EReference getOrderItemAssocType_ParentTypeId() {
		return (EReference)orderItemAssocTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrderItemAssocType__ChildOrderItemAssocTypes() {
		return orderItemAssocTypeEClass.getEOperations().get(0);
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
	public EReference getOrderItemBilling_OrderId() {
		return (EReference)orderItemBillingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemBilling_OrderItemSeqId() {
		return (EAttribute)orderItemBillingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemBilling_InvoiceId() {
		return (EReference)orderItemBillingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemBilling_InvoiceItemSeqId() {
		return (EAttribute)orderItemBillingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemBilling_Amount() {
		return (EAttribute)orderItemBillingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemBilling_ItemIssuanceId() {
		return (EReference)orderItemBillingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemBilling_Quantity() {
		return (EAttribute)orderItemBillingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemBilling_ShipmentReceiptId() {
		return (EReference)orderItemBillingEClass.getEStructuralFeatures().get(6);
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
	public EReference getOrderItemChange_ChangeTypeEnumId() {
		return (EReference)orderItemChangeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemChange_ChangeUserLogin() {
		return (EReference)orderItemChangeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemChange_ItemDescription() {
		return (EAttribute)orderItemChangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemChange_OrderId() {
		return (EReference)orderItemChangeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemChange_OrderItemSeqId() {
		return (EAttribute)orderItemChangeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemChange_Quantity() {
		return (EAttribute)orderItemChangeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemChange_ReasonEnumId() {
		return (EReference)orderItemChangeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemChange_UnitPrice() {
		return (EAttribute)orderItemChangeEClass.getEStructuralFeatures().get(7);
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
	public EReference getOrderItemContactMech_OrderId() {
		return (EReference)orderItemContactMechEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemContactMech_OrderItemSeqId() {
		return (EAttribute)orderItemContactMechEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemContactMech_ContactMechPurposeTypeId() {
		return (EReference)orderItemContactMechEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemContactMech_ContactMechId() {
		return (EReference)orderItemContactMechEClass.getEStructuralFeatures().get(2);
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
	public EReference getOrderItemGroup_OrderId() {
		return (EReference)orderItemGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemGroup_OrderItemGroupSeqId() {
		return (EAttribute)orderItemGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemGroup_GroupName() {
		return (EAttribute)orderItemGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemGroup_ParentGroupSeqId() {
		return (EAttribute)orderItemGroupEClass.getEStructuralFeatures().get(2);
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
	public EReference getOrderItemGroupOrder_GroupOrderId() {
		return (EReference)orderItemGroupOrderEClass.getEStructuralFeatures().get(2);
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
	public EReference getOrderItemPriceInfo_OrderId() {
		return (EReference)orderItemPriceInfoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemPriceInfo_OrderItemSeqId() {
		return (EAttribute)orderItemPriceInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemPriceInfo_ProductPriceActionSeqId() {
		return (EAttribute)orderItemPriceInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemPriceInfo_ProductPriceRuleId() {
		return (EReference)orderItemPriceInfoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemPriceInfo_RateCode() {
		return (EAttribute)orderItemPriceInfoEClass.getEStructuralFeatures().get(5);
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
	public EReference getOrderItemRole_OrderId() {
		return (EReference)orderItemRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemRole_OrderItemSeqId() {
		return (EAttribute)orderItemRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemRole_PartyId() {
		return (EReference)orderItemRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemRole_RoleTypeId() {
		return (EReference)orderItemRoleEClass.getEStructuralFeatures().get(3);
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
	public EReference getOrderItemShipGroup_OrderId() {
		return (EReference)orderItemShipGroupEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_ShipGroupSeqId() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemShipGroup_CarrierPartyId() {
		return (EReference)orderItemShipGroupEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_CarrierRoleTypeId() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemShipGroup_ContactMechId() {
		return (EReference)orderItemShipGroupEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_EstimatedDeliveryDate() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_EstimatedShipDate() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemShipGroup_FacilityId() {
		return (EReference)orderItemShipGroupEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_GiftMessage() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_IsGift() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_MaySplit() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_ShipAfterDate() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_ShipByDate() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemShipGroup_ShipmentMethodTypeId() {
		return (EReference)orderItemShipGroupEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_ShippingInstructions() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemShipGroup_SupplierAgreementId() {
		return (EReference)orderItemShipGroupEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemShipGroup_SupplierPartyId() {
		return (EReference)orderItemShipGroupEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemShipGroup_TelecomContactMechId() {
		return (EReference)orderItemShipGroupEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroup_TrackingNumber() {
		return (EAttribute)orderItemShipGroupEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemShipGroup_VendorPartyId() {
		return (EReference)orderItemShipGroupEClass.getEStructuralFeatures().get(14);
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
	public EReference getOrderItemShipGroupAssoc_OrderId() {
		return (EReference)orderItemShipGroupAssocEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroupAssoc_OrderItemSeqId() {
		return (EAttribute)orderItemShipGroupAssocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroupAssoc_ShipGroupSeqId() {
		return (EAttribute)orderItemShipGroupAssocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroupAssoc_CancelQuantity() {
		return (EAttribute)orderItemShipGroupAssocEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGroupAssoc_Quantity() {
		return (EAttribute)orderItemShipGroupAssocEClass.getEStructuralFeatures().get(3);
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
	public EReference getOrderItemShipGrpInvRes_OrderId() {
		return (EReference)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_ShipGroupSeqId() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_OrderItemSeqId() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderItemShipGrpInvRes_InventoryItemId() {
		return (EReference)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_CreatedDatetime() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_CurrentPromisedDate() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_OldPickStartDate() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_Priority() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_PromisedDatetime() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_Quantity() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_QuantityNotAvailable() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_ReserveOrderEnumId() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_ReservedDatetime() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemShipGrpInvRes_SequenceId() {
		return (EAttribute)orderItemShipGrpInvResEClass.getEStructuralFeatures().get(11);
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
	public EReference getOrderItemType_ParentTypeId() {
		return (EReference)orderItemTypeEClass.getEStructuralFeatures().get(3);
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
	public EOperation getOrderItemType__ChildOrderItemTypes() {
		return orderItemTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrderItemType__OrderItems() {
		return orderItemTypeEClass.getEOperations().get(1);
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
	public EReference getOrderItemTypeAttr_OrderItemTypeId() {
		return (EReference)orderItemTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemTypeAttr_AttrName() {
		return (EAttribute)orderItemTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderItemTypeAttr_Description() {
		return (EAttribute)orderItemTypeAttrEClass.getEStructuralFeatures().get(1);
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
	public EReference getOrderNotification_EmailType() {
		return (EReference)orderNotificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderNotification_NotificationDate() {
		return (EAttribute)orderNotificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderNotification_OrderId() {
		return (EReference)orderNotificationEClass.getEStructuralFeatures().get(3);
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
	public EReference getOrderPaymentPreference_CreatedByUserLogin() {
		return (EReference)orderPaymentPreferenceEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrderPaymentPreference__OrderStatuss() {
		return orderPaymentPreferenceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrderPaymentPreference__PaymentGatewayResponses() {
		return orderPaymentPreferenceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrderPaymentPreference__Payments() {
		return orderPaymentPreferenceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrderPaymentPreference__ReturnItemResponses() {
		return orderPaymentPreferenceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_CreatedDate() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderPaymentPreference_FinAccountId() {
		return (EReference)orderPaymentPreferenceEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_LastModifiedByUserLogin() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_LastModifiedDate() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_ManualAuthCode() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_ManualRefNum() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_MaxAmount() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_NeedsNsfRetry() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderPaymentPreference_OrderId() {
		return (EReference)orderPaymentPreferenceEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_OrderItemSeqId() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_OverflowFlag() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderPaymentPreference_PaymentMethodId() {
		return (EReference)orderPaymentPreferenceEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderPaymentPreference_PaymentMethodTypeId() {
		return (EReference)orderPaymentPreferenceEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_PresentFlag() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_ProcessAttempt() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderPaymentPreference_ProductPricePurposeId() {
		return (EReference)orderPaymentPreferenceEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_SecurityCode() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_ShipGroupSeqId() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderPaymentPreference_StatusId() {
		return (EReference)orderPaymentPreferenceEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_SwipedFlag() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderPaymentPreference_Track2() {
		return (EAttribute)orderPaymentPreferenceEClass.getEStructuralFeatures().get(16);
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
	public EReference getOrderProductPromoCode_OrderId() {
		return (EReference)orderProductPromoCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderProductPromoCode_ProductPromoCodeId() {
		return (EReference)orderProductPromoCodeEClass.getEStructuralFeatures().get(1);
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
	public EReference getOrderRole_OrderId() {
		return (EReference)orderRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderRole_PartyId() {
		return (EReference)orderRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderRole_RoleTypeId() {
		return (EReference)orderRoleEClass.getEStructuralFeatures().get(2);
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
	public EReference getOrderShipment_OrderId() {
		return (EReference)orderShipmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderShipment_OrderItemSeqId() {
		return (EAttribute)orderShipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderShipment_ShipGroupSeqId() {
		return (EAttribute)orderShipmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderShipment_ShipmentId() {
		return (EReference)orderShipmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderShipment_ShipmentItemSeqId() {
		return (EAttribute)orderShipmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderShipment_Quantity() {
		return (EAttribute)orderShipmentEClass.getEStructuralFeatures().get(3);
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
	public EReference getOrderStatus_OrderId() {
		return (EReference)orderStatusEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderStatus_OrderItemSeqId() {
		return (EAttribute)orderStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderStatus_OrderPaymentPreferenceId() {
		return (EReference)orderStatusEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderStatus_StatusDatetime() {
		return (EAttribute)orderStatusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderStatus_StatusId() {
		return (EReference)orderStatusEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderStatus_StatusUserLogin() {
		return (EReference)orderStatusEClass.getEStructuralFeatures().get(7);
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
	public EReference getOrderSummaryEntry_ProductId() {
		return (EReference)orderSummaryEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderSummaryEntry_FacilityId() {
		return (EReference)orderSummaryEntryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderSummaryEntry_GrossSales() {
		return (EAttribute)orderSummaryEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderSummaryEntry_ProductCost() {
		return (EAttribute)orderSummaryEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderSummaryEntry_TotalQuantity() {
		return (EAttribute)orderSummaryEntryEClass.getEStructuralFeatures().get(3);
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
	public EReference getOrderTerm_TermTypeId() {
		return (EReference)orderTermEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderTerm_OrderId() {
		return (EReference)orderTermEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTerm_OrderItemSeqId() {
		return (EAttribute)orderTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTerm_Description() {
		return (EAttribute)orderTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTerm_TermDays() {
		return (EAttribute)orderTermEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTerm_TermValue() {
		return (EAttribute)orderTermEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTerm_TextValue() {
		return (EAttribute)orderTermEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderTerm_UomId() {
		return (EReference)orderTermEClass.getEStructuralFeatures().get(5);
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
	public EReference getOrderType_ParentTypeId() {
		return (EReference)orderTypeEClass.getEStructuralFeatures().get(3);
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
	public EOperation getOrderType__ChildOrderTypes() {
		return orderTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrderType__OrderHeaders() {
		return orderTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrderType__PartyPrefDocTypeTpls() {
		return orderTypeEClass.getEOperations().get(2);
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
	public EReference getOrderTypeAttr_OrderTypeId() {
		return (EReference)orderTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTypeAttr_AttrName() {
		return (EAttribute)orderTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderTypeAttr_Description() {
		return (EAttribute)orderTypeAttrEClass.getEStructuralFeatures().get(1);
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
	public EReference getProductOrderItem_OrderId() {
		return (EReference)productOrderItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductOrderItem_OrderItemSeqId() {
		return (EAttribute)productOrderItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductOrderItem_EngagementId() {
		return (EReference)productOrderItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductOrderItem_EngagementItemSeqId() {
		return (EAttribute)productOrderItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductOrderItem_ProductId() {
		return (EReference)productOrderItemEClass.getEStructuralFeatures().get(3);
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
	public EReference getWorkOrderItemFulfillment_WorkEffortId() {
		return (EReference)workOrderItemFulfillmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkOrderItemFulfillment_OrderId() {
		return (EReference)workOrderItemFulfillmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkOrderItemFulfillment_OrderItemSeqId() {
		return (EAttribute)workOrderItemFulfillmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkOrderItemFulfillment_ShipGroupSeqId() {
		return (EAttribute)workOrderItemFulfillmentEClass.getEStructuralFeatures().get(1);
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
		createEReference(communicationEventOrderEClass, COMMUNICATION_EVENT_ORDER__ORDER_ID);
		createEReference(communicationEventOrderEClass, COMMUNICATION_EVENT_ORDER__COMMUNICATION_EVENT_ID);

		orderAdjustmentEClass = createEClass(ORDER_ADJUSTMENT);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__AMOUNT);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__AMOUNT_ALREADY_INCLUDED);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__COMMENTS);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__CORRESPONDING_PRODUCT_ID);
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
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__PRODUCT_FEATURE_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__PRODUCT_PROMO_RULE_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__RECURRING_AMOUNT);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__SHIP_GROUP_SEQ_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__SOURCE_PERCENTAGE);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__SOURCE_REFERENCE_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__TAX_AUTH_GEO_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__TAX_AUTH_PARTY_ID);
		createEReference(orderAdjustmentEClass, ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_TYPE_ID);
		createEReference(orderAdjustmentEClass, ORDER_ADJUSTMENT__ORDER_ID);
		createEReference(orderAdjustmentEClass, ORDER_ADJUSTMENT__CREATED_BY_USER_LOGIN);
		createEReference(orderAdjustmentEClass, ORDER_ADJUSTMENT__PRODUCT_PROMO_ID);
		createEReference(orderAdjustmentEClass, ORDER_ADJUSTMENT__PRIMARY_GEO_ID);
		createEReference(orderAdjustmentEClass, ORDER_ADJUSTMENT__SECONDARY_GEO_ID);
		createEReference(orderAdjustmentEClass, ORDER_ADJUSTMENT__OVERRIDE_GL_ACCOUNT_ID);
		createEReference(orderAdjustmentEClass, ORDER_ADJUSTMENT__TAX_AUTHORITY_RATE_SEQ_ID);
		createEReference(orderAdjustmentEClass, ORDER_ADJUSTMENT__ORIGINAL_ADJUSTMENT_ID);
		createEAttribute(orderAdjustmentEClass, ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_ATTRIBUTES);
		createEOperation(orderAdjustmentEClass, ORDER_ADJUSTMENT___RETURN_ADJUSTMENTS);

		orderAdjustmentAttributeEClass = createEClass(ORDER_ADJUSTMENT_ATTRIBUTE);
		createEAttribute(orderAdjustmentAttributeEClass, ORDER_ADJUSTMENT_ATTRIBUTE__ATTR_NAME);
		createEAttribute(orderAdjustmentAttributeEClass, ORDER_ADJUSTMENT_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(orderAdjustmentAttributeEClass, ORDER_ADJUSTMENT_ATTRIBUTE__ATTR_VALUE);
		createEReference(orderAdjustmentAttributeEClass, ORDER_ADJUSTMENT_ATTRIBUTE__ORDER_ADJUSTMENT_ID);

		orderAdjustmentBillingEClass = createEClass(ORDER_ADJUSTMENT_BILLING);
		createEAttribute(orderAdjustmentBillingEClass, ORDER_ADJUSTMENT_BILLING__INVOICE_ITEM_SEQ_ID);
		createEAttribute(orderAdjustmentBillingEClass, ORDER_ADJUSTMENT_BILLING__AMOUNT);
		createEReference(orderAdjustmentBillingEClass, ORDER_ADJUSTMENT_BILLING__ORDER_ADJUSTMENT_ID);
		createEReference(orderAdjustmentBillingEClass, ORDER_ADJUSTMENT_BILLING__INVOICE_ID);

		orderAdjustmentTypeEClass = createEClass(ORDER_ADJUSTMENT_TYPE);
		createEAttribute(orderAdjustmentTypeEClass, ORDER_ADJUSTMENT_TYPE__ORDER_ADJUSTMENT_TYPE_ID);
		createEAttribute(orderAdjustmentTypeEClass, ORDER_ADJUSTMENT_TYPE__DESCRIPTION);
		createEAttribute(orderAdjustmentTypeEClass, ORDER_ADJUSTMENT_TYPE__HAS_TABLE);
		createEReference(orderAdjustmentTypeEClass, ORDER_ADJUSTMENT_TYPE__PARENT_TYPE_ID);
		createEAttribute(orderAdjustmentTypeEClass, ORDER_ADJUSTMENT_TYPE__ORDER_ADJUSTMENT_TYPE_ATTRS);
		createEOperation(orderAdjustmentTypeEClass, ORDER_ADJUSTMENT_TYPE___CHILD_ORDER_ADJUSTMENT_TYPES);
		createEOperation(orderAdjustmentTypeEClass, ORDER_ADJUSTMENT_TYPE___ORDER_ADJUSTMENTS);
		createEOperation(orderAdjustmentTypeEClass, ORDER_ADJUSTMENT_TYPE___QUOTE_ADJUSTMENTS);

		orderAdjustmentTypeAttrEClass = createEClass(ORDER_ADJUSTMENT_TYPE_ATTR);
		createEAttribute(orderAdjustmentTypeAttrEClass, ORDER_ADJUSTMENT_TYPE_ATTR__ATTR_NAME);
		createEAttribute(orderAdjustmentTypeAttrEClass, ORDER_ADJUSTMENT_TYPE_ATTR__DESCRIPTION);
		createEReference(orderAdjustmentTypeAttrEClass, ORDER_ADJUSTMENT_TYPE_ATTR__ORDER_ADJUSTMENT_TYPE_ID);

		orderAttributeEClass = createEClass(ORDER_ATTRIBUTE);
		createEAttribute(orderAttributeEClass, ORDER_ATTRIBUTE__ATTR_NAME);
		createEAttribute(orderAttributeEClass, ORDER_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(orderAttributeEClass, ORDER_ATTRIBUTE__ATTR_VALUE);
		createEReference(orderAttributeEClass, ORDER_ATTRIBUTE__ORDER_ID);

		orderBlacklistEClass = createEClass(ORDER_BLACKLIST);
		createEAttribute(orderBlacklistEClass, ORDER_BLACKLIST__BLACKLIST_STRING);
		createEReference(orderBlacklistEClass, ORDER_BLACKLIST__ORDER_BLACKLIST_TYPE_ID);

		orderBlacklistTypeEClass = createEClass(ORDER_BLACKLIST_TYPE);
		createEAttribute(orderBlacklistTypeEClass, ORDER_BLACKLIST_TYPE__ORDER_BLACKLIST_TYPE_ID);
		createEAttribute(orderBlacklistTypeEClass, ORDER_BLACKLIST_TYPE__DESCRIPTION);
		createEOperation(orderBlacklistTypeEClass, ORDER_BLACKLIST_TYPE___ORDER_BLACKLISTS);

		orderContactMechEClass = createEClass(ORDER_CONTACT_MECH);
		createEReference(orderContactMechEClass, ORDER_CONTACT_MECH__ORDER_ID);
		createEReference(orderContactMechEClass, ORDER_CONTACT_MECH__CONTACT_MECH_ID);
		createEReference(orderContactMechEClass, ORDER_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE_ID);

		orderContentEClass = createEClass(ORDER_CONTENT);
		createEAttribute(orderContentEClass, ORDER_CONTENT__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderContentEClass, ORDER_CONTENT__FROM_DATE);
		createEAttribute(orderContentEClass, ORDER_CONTENT__THRU_DATE);
		createEReference(orderContentEClass, ORDER_CONTENT__ORDER_ID);
		createEReference(orderContentEClass, ORDER_CONTENT__CONTENT_ID);
		createEReference(orderContentEClass, ORDER_CONTENT__ORDER_CONTENT_TYPE_ID);

		orderContentTypeEClass = createEClass(ORDER_CONTENT_TYPE);
		createEAttribute(orderContentTypeEClass, ORDER_CONTENT_TYPE__ORDER_CONTENT_TYPE_ID);
		createEAttribute(orderContentTypeEClass, ORDER_CONTENT_TYPE__DESCRIPTION);
		createEAttribute(orderContentTypeEClass, ORDER_CONTENT_TYPE__HAS_TABLE);
		createEReference(orderContentTypeEClass, ORDER_CONTENT_TYPE__PARENT_TYPE_ID);
		createEOperation(orderContentTypeEClass, ORDER_CONTENT_TYPE___CHILD_ORDER_CONTENT_TYPES);

		orderDeliveryScheduleEClass = createEClass(ORDER_DELIVERY_SCHEDULE);
		createEAttribute(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__CARTONS);
		createEAttribute(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__ESTIMATED_READY_DATE);
		createEAttribute(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__SKIDS_PALLETS);
		createEAttribute(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__TOTAL_CUBIC_SIZE);
		createEAttribute(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__TOTAL_WEIGHT);
		createEAttribute(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__UNITS_PIECES);
		createEReference(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__ORDER_ID);
		createEReference(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__TOTAL_CUBIC_UOM_ID);
		createEReference(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__TOTAL_WEIGHT_UOM_ID);
		createEReference(orderDeliveryScheduleEClass, ORDER_DELIVERY_SCHEDULE__STATUS_ID);

		orderHeaderEClass = createEClass(ORDER_HEADER);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__ORDER_ID);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__AGREEMENT_ID);
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
		createEAttribute(orderHeaderEClass, ORDER_HEADER__PICK_SHEET_PRINTED_DATE);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__PRIORITY);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__REMAINING_SUB_TOTAL);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__TERMINAL_ID);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__TRANSACTION_ID);
		createEAttribute(orderHeaderEClass, ORDER_HEADER__VISIT_ID);
		createEReference(orderHeaderEClass, ORDER_HEADER__ORDER_TYPE_ID);
		createEReference(orderHeaderEClass, ORDER_HEADER__SALES_CHANNEL_ENUM_ID);
		createEReference(orderHeaderEClass, ORDER_HEADER__ORIGIN_FACILITY_ID);
		createEReference(orderHeaderEClass, ORDER_HEADER__BILLING_ACCOUNT_ID);
		createEReference(orderHeaderEClass, ORDER_HEADER__PRODUCT_STORE_ID);
		createEReference(orderHeaderEClass, ORDER_HEADER__AUTO_ORDER_SHOPPING_LIST_ID);
		createEReference(orderHeaderEClass, ORDER_HEADER__CREATED_BY);
		createEReference(orderHeaderEClass, ORDER_HEADER__STATUS_ID);
		createEReference(orderHeaderEClass, ORDER_HEADER__SYNC_STATUS_ID);
		createEReference(orderHeaderEClass, ORDER_HEADER__CURRENCY_UOM);
		createEReference(orderHeaderEClass, ORDER_HEADER__WEB_SITE_ID);
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
		createEOperation(orderHeaderEClass, ORDER_HEADER___ACQUIRE_FIXED_ASSETS);
		createEOperation(orderHeaderEClass, ORDER_HEADER___GIFT_CARD_FULFILLMENTS);
		createEOperation(orderHeaderEClass, ORDER_HEADER___ITEM_ISSUANCES);
		createEOperation(orderHeaderEClass, ORDER_HEADER___ORDER_ADJUSTMENTS);
		createEOperation(orderHeaderEClass, ORDER_HEADER___ORDER_ITEM_CHANGES);
		createEOperation(orderHeaderEClass, ORDER_HEADER___ORDER_ITEM_PRICE_INFOS);
		createEOperation(orderHeaderEClass, ORDER_HEADER___ORDER_NOTIFICATIONS);
		createEOperation(orderHeaderEClass, ORDER_HEADER___ORDER_PAYMENT_PREFERENCES);
		createEOperation(orderHeaderEClass, ORDER_HEADER___ORDER_STATUSS);
		createEOperation(orderHeaderEClass, ORDER_HEADER___PRIMARY_PICKLIST_BINS);
		createEOperation(orderHeaderEClass, ORDER_HEADER___PRIMARY_SHIPMENTS);
		createEOperation(orderHeaderEClass, ORDER_HEADER___PURCHASE_FIXED_ASSET_MAINTS);
		createEOperation(orderHeaderEClass, ORDER_HEADER___REPLACEMENT_RETURN_ITEM_RESPONSES);
		createEOperation(orderHeaderEClass, ORDER_HEADER___RETURN_ITEMS);
		createEOperation(orderHeaderEClass, ORDER_HEADER___SHIPMENT_RECEIPTS);
		createEOperation(orderHeaderEClass, ORDER_HEADER___SUBSCRIPTIONS);
		createEOperation(orderHeaderEClass, ORDER_HEADER___SURVEY_RESPONSES);

		orderHeaderNoteEClass = createEClass(ORDER_HEADER_NOTE);
		createEAttribute(orderHeaderNoteEClass, ORDER_HEADER_NOTE__INTERNAL_NOTE);
		createEReference(orderHeaderNoteEClass, ORDER_HEADER_NOTE__ORDER_ID);

		orderHeaderWorkEffortEClass = createEClass(ORDER_HEADER_WORK_EFFORT);
		createEReference(orderHeaderWorkEffortEClass, ORDER_HEADER_WORK_EFFORT__ORDER_ID);
		createEReference(orderHeaderWorkEffortEClass, ORDER_HEADER_WORK_EFFORT__WORK_EFFORT_ID);

		orderItemEClass = createEClass(ORDER_ITEM);
		createEAttribute(orderItemEClass, ORDER_ITEM__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__AUTO_CANCEL_DATE);
		createEAttribute(orderItemEClass, ORDER_ITEM__BUDGET_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__BUDGET_ITEM_SEQ_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__CANCEL_BACK_ORDER_DATE);
		createEAttribute(orderItemEClass, ORDER_ITEM__CANCEL_QUANTITY);
		createEAttribute(orderItemEClass, ORDER_ITEM__COMMENTS);
		createEAttribute(orderItemEClass, ORDER_ITEM__CORRESPONDING_PO_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__DEPLOYMENT_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__DONT_CANCEL_SET_DATE);
		createEAttribute(orderItemEClass, ORDER_ITEM__ESTIMATED_DELIVERY_DATE);
		createEAttribute(orderItemEClass, ORDER_ITEM__ESTIMATED_SHIP_DATE);
		createEAttribute(orderItemEClass, ORDER_ITEM__EXTERNAL_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__IS_ITEM_GROUP_PRIMARY);
		createEAttribute(orderItemEClass, ORDER_ITEM__IS_MODIFIED_PRICE);
		createEAttribute(orderItemEClass, ORDER_ITEM__IS_PROMO);
		createEAttribute(orderItemEClass, ORDER_ITEM__ITEM_DESCRIPTION);
		createEAttribute(orderItemEClass, ORDER_ITEM__ORDER_ITEM_GROUP_SEQ_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__PROD_CATALOG_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__PRODUCT_CATEGORY_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__PRODUCT_FEATURE_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__QUANTITY);
		createEAttribute(orderItemEClass, ORDER_ITEM__QUOTE_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__QUOTE_ITEM_SEQ_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__RESERVE_AFTER_DATE);
		createEAttribute(orderItemEClass, ORDER_ITEM__SELECTED_AMOUNT);
		createEAttribute(orderItemEClass, ORDER_ITEM__SHIP_AFTER_DATE);
		createEAttribute(orderItemEClass, ORDER_ITEM__SHIP_BEFORE_DATE);
		createEAttribute(orderItemEClass, ORDER_ITEM__SHOPPING_LIST_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__SHOPPING_LIST_ITEM_SEQ_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__SUBSCRIPTION_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__SUPPLIER_PRODUCT_ID);
		createEAttribute(orderItemEClass, ORDER_ITEM__UNIT_AVERAGE_COST);
		createEAttribute(orderItemEClass, ORDER_ITEM__UNIT_LIST_PRICE);
		createEAttribute(orderItemEClass, ORDER_ITEM__UNIT_PRICE);
		createEAttribute(orderItemEClass, ORDER_ITEM__UNIT_RECURRING_PRICE);
		createEReference(orderItemEClass, ORDER_ITEM__ORDER_ID);
		createEReference(orderItemEClass, ORDER_ITEM__ORDER_ITEM_TYPE_ID);
		createEReference(orderItemEClass, ORDER_ITEM__PRODUCT_ID);
		createEReference(orderItemEClass, ORDER_ITEM__FROM_INVENTORY_ITEM_ID);
		createEReference(orderItemEClass, ORDER_ITEM__RECURRING_FREQ_UOM_ID);
		createEReference(orderItemEClass, ORDER_ITEM__STATUS_ID);
		createEReference(orderItemEClass, ORDER_ITEM__SYNC_STATUS_ID);
		createEReference(orderItemEClass, ORDER_ITEM__DONT_CANCEL_SET_USER_LOGIN);
		createEReference(orderItemEClass, ORDER_ITEM__OVERRIDE_GL_ACCOUNT_ID);
		createEReference(orderItemEClass, ORDER_ITEM__SALES_OPPORTUNITY_ID);
		createEReference(orderItemEClass, ORDER_ITEM__CHANGE_BY_USER_LOGIN_ID);

		orderItemAssocEClass = createEClass(ORDER_ITEM_ASSOC);
		createEAttribute(orderItemAssocEClass, ORDER_ITEM_ASSOC__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemAssocEClass, ORDER_ITEM_ASSOC__SHIP_GROUP_SEQ_ID);
		createEAttribute(orderItemAssocEClass, ORDER_ITEM_ASSOC__TO_ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemAssocEClass, ORDER_ITEM_ASSOC__TO_SHIP_GROUP_SEQ_ID);
		createEAttribute(orderItemAssocEClass, ORDER_ITEM_ASSOC__QUANTITY);
		createEReference(orderItemAssocEClass, ORDER_ITEM_ASSOC__ORDER_ITEM_ASSOC_TYPE_ID);
		createEReference(orderItemAssocEClass, ORDER_ITEM_ASSOC__ORDER_ID);
		createEReference(orderItemAssocEClass, ORDER_ITEM_ASSOC__TO_ORDER_ID);

		orderItemAssocTypeEClass = createEClass(ORDER_ITEM_ASSOC_TYPE);
		createEAttribute(orderItemAssocTypeEClass, ORDER_ITEM_ASSOC_TYPE__ORDER_ITEM_ASSOC_TYPE_ID);
		createEAttribute(orderItemAssocTypeEClass, ORDER_ITEM_ASSOC_TYPE__DESCRIPTION);
		createEAttribute(orderItemAssocTypeEClass, ORDER_ITEM_ASSOC_TYPE__HAS_TABLE);
		createEReference(orderItemAssocTypeEClass, ORDER_ITEM_ASSOC_TYPE__PARENT_TYPE_ID);
		createEOperation(orderItemAssocTypeEClass, ORDER_ITEM_ASSOC_TYPE___CHILD_ORDER_ITEM_ASSOC_TYPES);

		orderItemAttributeEClass = createEClass(ORDER_ITEM_ATTRIBUTE);
		createEAttribute(orderItemAttributeEClass, ORDER_ITEM_ATTRIBUTE__ORDER_ID);
		createEAttribute(orderItemAttributeEClass, ORDER_ITEM_ATTRIBUTE__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemAttributeEClass, ORDER_ITEM_ATTRIBUTE__ATTR_NAME);
		createEAttribute(orderItemAttributeEClass, ORDER_ITEM_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(orderItemAttributeEClass, ORDER_ITEM_ATTRIBUTE__ATTR_VALUE);

		orderItemBillingEClass = createEClass(ORDER_ITEM_BILLING);
		createEAttribute(orderItemBillingEClass, ORDER_ITEM_BILLING__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemBillingEClass, ORDER_ITEM_BILLING__INVOICE_ITEM_SEQ_ID);
		createEAttribute(orderItemBillingEClass, ORDER_ITEM_BILLING__AMOUNT);
		createEAttribute(orderItemBillingEClass, ORDER_ITEM_BILLING__QUANTITY);
		createEReference(orderItemBillingEClass, ORDER_ITEM_BILLING__ORDER_ID);
		createEReference(orderItemBillingEClass, ORDER_ITEM_BILLING__INVOICE_ID);
		createEReference(orderItemBillingEClass, ORDER_ITEM_BILLING__SHIPMENT_RECEIPT_ID);
		createEReference(orderItemBillingEClass, ORDER_ITEM_BILLING__ITEM_ISSUANCE_ID);

		orderItemChangeEClass = createEClass(ORDER_ITEM_CHANGE);
		createEAttribute(orderItemChangeEClass, ORDER_ITEM_CHANGE__ORDER_ITEM_CHANGE_ID);
		createEAttribute(orderItemChangeEClass, ORDER_ITEM_CHANGE__CANCEL_QUANTITY);
		createEAttribute(orderItemChangeEClass, ORDER_ITEM_CHANGE__CHANGE_COMMENTS);
		createEAttribute(orderItemChangeEClass, ORDER_ITEM_CHANGE__CHANGE_DATETIME);
		createEAttribute(orderItemChangeEClass, ORDER_ITEM_CHANGE__ITEM_DESCRIPTION);
		createEAttribute(orderItemChangeEClass, ORDER_ITEM_CHANGE__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemChangeEClass, ORDER_ITEM_CHANGE__QUANTITY);
		createEAttribute(orderItemChangeEClass, ORDER_ITEM_CHANGE__UNIT_PRICE);
		createEReference(orderItemChangeEClass, ORDER_ITEM_CHANGE__ORDER_ID);
		createEReference(orderItemChangeEClass, ORDER_ITEM_CHANGE__CHANGE_TYPE_ENUM_ID);
		createEReference(orderItemChangeEClass, ORDER_ITEM_CHANGE__REASON_ENUM_ID);
		createEReference(orderItemChangeEClass, ORDER_ITEM_CHANGE__CHANGE_USER_LOGIN);

		orderItemContactMechEClass = createEClass(ORDER_ITEM_CONTACT_MECH);
		createEAttribute(orderItemContactMechEClass, ORDER_ITEM_CONTACT_MECH__ORDER_ITEM_SEQ_ID);
		createEReference(orderItemContactMechEClass, ORDER_ITEM_CONTACT_MECH__ORDER_ID);
		createEReference(orderItemContactMechEClass, ORDER_ITEM_CONTACT_MECH__CONTACT_MECH_ID);
		createEReference(orderItemContactMechEClass, ORDER_ITEM_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE_ID);

		orderItemGroupEClass = createEClass(ORDER_ITEM_GROUP);
		createEAttribute(orderItemGroupEClass, ORDER_ITEM_GROUP__ORDER_ITEM_GROUP_SEQ_ID);
		createEAttribute(orderItemGroupEClass, ORDER_ITEM_GROUP__GROUP_NAME);
		createEAttribute(orderItemGroupEClass, ORDER_ITEM_GROUP__PARENT_GROUP_SEQ_ID);
		createEReference(orderItemGroupEClass, ORDER_ITEM_GROUP__ORDER_ID);

		orderItemGroupOrderEClass = createEClass(ORDER_ITEM_GROUP_ORDER);
		createEAttribute(orderItemGroupOrderEClass, ORDER_ITEM_GROUP_ORDER__ORDER_ID);
		createEAttribute(orderItemGroupOrderEClass, ORDER_ITEM_GROUP_ORDER__ORDER_ITEM_SEQ_ID);
		createEReference(orderItemGroupOrderEClass, ORDER_ITEM_GROUP_ORDER__GROUP_ORDER_ID);

		orderItemPriceInfoEClass = createEClass(ORDER_ITEM_PRICE_INFO);
		createEAttribute(orderItemPriceInfoEClass, ORDER_ITEM_PRICE_INFO__ORDER_ITEM_PRICE_INFO_ID);
		createEAttribute(orderItemPriceInfoEClass, ORDER_ITEM_PRICE_INFO__DESCRIPTION);
		createEAttribute(orderItemPriceInfoEClass, ORDER_ITEM_PRICE_INFO__MODIFY_AMOUNT);
		createEAttribute(orderItemPriceInfoEClass, ORDER_ITEM_PRICE_INFO__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemPriceInfoEClass, ORDER_ITEM_PRICE_INFO__PRODUCT_PRICE_ACTION_SEQ_ID);
		createEAttribute(orderItemPriceInfoEClass, ORDER_ITEM_PRICE_INFO__RATE_CODE);
		createEReference(orderItemPriceInfoEClass, ORDER_ITEM_PRICE_INFO__ORDER_ID);
		createEReference(orderItemPriceInfoEClass, ORDER_ITEM_PRICE_INFO__PRODUCT_PRICE_RULE_ID);

		orderItemRoleEClass = createEClass(ORDER_ITEM_ROLE);
		createEAttribute(orderItemRoleEClass, ORDER_ITEM_ROLE__ORDER_ITEM_SEQ_ID);
		createEReference(orderItemRoleEClass, ORDER_ITEM_ROLE__ORDER_ID);
		createEReference(orderItemRoleEClass, ORDER_ITEM_ROLE__PARTY_ID);
		createEReference(orderItemRoleEClass, ORDER_ITEM_ROLE__ROLE_TYPE_ID);

		orderItemShipGroupEClass = createEClass(ORDER_ITEM_SHIP_GROUP);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__SHIP_GROUP_SEQ_ID);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__CARRIER_ROLE_TYPE_ID);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__ESTIMATED_DELIVERY_DATE);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__ESTIMATED_SHIP_DATE);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__GIFT_MESSAGE);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__IS_GIFT);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__MAY_SPLIT);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__SHIP_AFTER_DATE);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__SHIP_BY_DATE);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__SHIPPING_INSTRUCTIONS);
		createEAttribute(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__TRACKING_NUMBER);
		createEReference(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__ORDER_ID);
		createEReference(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__SUPPLIER_PARTY_ID);
		createEReference(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__SUPPLIER_AGREEMENT_ID);
		createEReference(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__VENDOR_PARTY_ID);
		createEReference(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__CARRIER_PARTY_ID);
		createEReference(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__FACILITY_ID);
		createEReference(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__SHIPMENT_METHOD_TYPE_ID);
		createEReference(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__CONTACT_MECH_ID);
		createEReference(orderItemShipGroupEClass, ORDER_ITEM_SHIP_GROUP__TELECOM_CONTACT_MECH_ID);

		orderItemShipGroupAssocEClass = createEClass(ORDER_ITEM_SHIP_GROUP_ASSOC);
		createEAttribute(orderItemShipGroupAssocEClass, ORDER_ITEM_SHIP_GROUP_ASSOC__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderItemShipGroupAssocEClass, ORDER_ITEM_SHIP_GROUP_ASSOC__SHIP_GROUP_SEQ_ID);
		createEAttribute(orderItemShipGroupAssocEClass, ORDER_ITEM_SHIP_GROUP_ASSOC__CANCEL_QUANTITY);
		createEAttribute(orderItemShipGroupAssocEClass, ORDER_ITEM_SHIP_GROUP_ASSOC__QUANTITY);
		createEReference(orderItemShipGroupAssocEClass, ORDER_ITEM_SHIP_GROUP_ASSOC__ORDER_ID);

		orderItemShipGrpInvResEClass = createEClass(ORDER_ITEM_SHIP_GRP_INV_RES);
		createEAttribute(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__SHIP_GROUP_SEQ_ID);
		createEAttribute(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__ORDER_ITEM_SEQ_ID);
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
		createEReference(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__ORDER_ID);
		createEReference(orderItemShipGrpInvResEClass, ORDER_ITEM_SHIP_GRP_INV_RES__INVENTORY_ITEM_ID);

		orderItemTypeEClass = createEClass(ORDER_ITEM_TYPE);
		createEAttribute(orderItemTypeEClass, ORDER_ITEM_TYPE__ORDER_ITEM_TYPE_ID);
		createEAttribute(orderItemTypeEClass, ORDER_ITEM_TYPE__DESCRIPTION);
		createEAttribute(orderItemTypeEClass, ORDER_ITEM_TYPE__HAS_TABLE);
		createEReference(orderItemTypeEClass, ORDER_ITEM_TYPE__PARENT_TYPE_ID);
		createEAttribute(orderItemTypeEClass, ORDER_ITEM_TYPE__ORDER_ITEM_TYPE_ATTRS);
		createEOperation(orderItemTypeEClass, ORDER_ITEM_TYPE___CHILD_ORDER_ITEM_TYPES);
		createEOperation(orderItemTypeEClass, ORDER_ITEM_TYPE___ORDER_ITEMS);

		orderItemTypeAttrEClass = createEClass(ORDER_ITEM_TYPE_ATTR);
		createEAttribute(orderItemTypeAttrEClass, ORDER_ITEM_TYPE_ATTR__ATTR_NAME);
		createEAttribute(orderItemTypeAttrEClass, ORDER_ITEM_TYPE_ATTR__DESCRIPTION);
		createEReference(orderItemTypeAttrEClass, ORDER_ITEM_TYPE_ATTR__ORDER_ITEM_TYPE_ID);

		orderNotificationEClass = createEClass(ORDER_NOTIFICATION);
		createEAttribute(orderNotificationEClass, ORDER_NOTIFICATION__ORDER_NOTIFICATION_ID);
		createEAttribute(orderNotificationEClass, ORDER_NOTIFICATION__COMMENTS);
		createEAttribute(orderNotificationEClass, ORDER_NOTIFICATION__NOTIFICATION_DATE);
		createEReference(orderNotificationEClass, ORDER_NOTIFICATION__ORDER_ID);
		createEReference(orderNotificationEClass, ORDER_NOTIFICATION__EMAIL_TYPE);

		orderPaymentPreferenceEClass = createEClass(ORDER_PAYMENT_PREFERENCE);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__ORDER_PAYMENT_PREFERENCE_ID);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__BILLING_POSTAL_CODE);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__CREATED_DATE);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__LAST_MODIFIED_BY_USER_LOGIN);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__LAST_MODIFIED_DATE);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__MANUAL_AUTH_CODE);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__MANUAL_REF_NUM);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__MAX_AMOUNT);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__NEEDS_NSF_RETRY);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__OVERFLOW_FLAG);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__PRESENT_FLAG);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__PROCESS_ATTEMPT);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__SECURITY_CODE);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__SHIP_GROUP_SEQ_ID);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__SWIPED_FLAG);
		createEAttribute(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__TRACK2);
		createEReference(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__ORDER_ID);
		createEReference(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__PRODUCT_PRICE_PURPOSE_ID);
		createEReference(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_TYPE_ID);
		createEReference(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_ID);
		createEReference(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__FIN_ACCOUNT_ID);
		createEReference(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__STATUS_ID);
		createEReference(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE__CREATED_BY_USER_LOGIN);
		createEOperation(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE___ORDER_STATUSS);
		createEOperation(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE___PAYMENT_GATEWAY_RESPONSES);
		createEOperation(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE___PAYMENTS);
		createEOperation(orderPaymentPreferenceEClass, ORDER_PAYMENT_PREFERENCE___RETURN_ITEM_RESPONSES);

		orderProductPromoCodeEClass = createEClass(ORDER_PRODUCT_PROMO_CODE);
		createEReference(orderProductPromoCodeEClass, ORDER_PRODUCT_PROMO_CODE__ORDER_ID);
		createEReference(orderProductPromoCodeEClass, ORDER_PRODUCT_PROMO_CODE__PRODUCT_PROMO_CODE_ID);

		orderRoleEClass = createEClass(ORDER_ROLE);
		createEReference(orderRoleEClass, ORDER_ROLE__ORDER_ID);
		createEReference(orderRoleEClass, ORDER_ROLE__PARTY_ID);
		createEReference(orderRoleEClass, ORDER_ROLE__ROLE_TYPE_ID);

		orderShipmentEClass = createEClass(ORDER_SHIPMENT);
		createEAttribute(orderShipmentEClass, ORDER_SHIPMENT__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderShipmentEClass, ORDER_SHIPMENT__SHIP_GROUP_SEQ_ID);
		createEAttribute(orderShipmentEClass, ORDER_SHIPMENT__SHIPMENT_ITEM_SEQ_ID);
		createEAttribute(orderShipmentEClass, ORDER_SHIPMENT__QUANTITY);
		createEReference(orderShipmentEClass, ORDER_SHIPMENT__ORDER_ID);
		createEReference(orderShipmentEClass, ORDER_SHIPMENT__SHIPMENT_ID);

		orderStatusEClass = createEClass(ORDER_STATUS);
		createEAttribute(orderStatusEClass, ORDER_STATUS__ORDER_STATUS_ID);
		createEAttribute(orderStatusEClass, ORDER_STATUS__CHANGE_REASON);
		createEAttribute(orderStatusEClass, ORDER_STATUS__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderStatusEClass, ORDER_STATUS__STATUS_DATETIME);
		createEReference(orderStatusEClass, ORDER_STATUS__STATUS_ID);
		createEReference(orderStatusEClass, ORDER_STATUS__ORDER_ID);
		createEReference(orderStatusEClass, ORDER_STATUS__ORDER_PAYMENT_PREFERENCE_ID);
		createEReference(orderStatusEClass, ORDER_STATUS__STATUS_USER_LOGIN);

		orderSummaryEntryEClass = createEClass(ORDER_SUMMARY_ENTRY);
		createEAttribute(orderSummaryEntryEClass, ORDER_SUMMARY_ENTRY__ENTRY_DATE);
		createEAttribute(orderSummaryEntryEClass, ORDER_SUMMARY_ENTRY__GROSS_SALES);
		createEAttribute(orderSummaryEntryEClass, ORDER_SUMMARY_ENTRY__PRODUCT_COST);
		createEAttribute(orderSummaryEntryEClass, ORDER_SUMMARY_ENTRY__TOTAL_QUANTITY);
		createEReference(orderSummaryEntryEClass, ORDER_SUMMARY_ENTRY__PRODUCT_ID);
		createEReference(orderSummaryEntryEClass, ORDER_SUMMARY_ENTRY__FACILITY_ID);

		orderTermEClass = createEClass(ORDER_TERM);
		createEAttribute(orderTermEClass, ORDER_TERM__ORDER_ITEM_SEQ_ID);
		createEAttribute(orderTermEClass, ORDER_TERM__DESCRIPTION);
		createEAttribute(orderTermEClass, ORDER_TERM__TERM_DAYS);
		createEAttribute(orderTermEClass, ORDER_TERM__TERM_VALUE);
		createEAttribute(orderTermEClass, ORDER_TERM__TEXT_VALUE);
		createEReference(orderTermEClass, ORDER_TERM__UOM_ID);
		createEReference(orderTermEClass, ORDER_TERM__ORDER_ID);
		createEReference(orderTermEClass, ORDER_TERM__TERM_TYPE_ID);

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
		createEReference(orderTypeEClass, ORDER_TYPE__PARENT_TYPE_ID);
		createEAttribute(orderTypeEClass, ORDER_TYPE__ORDER_TYPE_ATTRS);
		createEOperation(orderTypeEClass, ORDER_TYPE___CHILD_ORDER_TYPES);
		createEOperation(orderTypeEClass, ORDER_TYPE___ORDER_HEADERS);
		createEOperation(orderTypeEClass, ORDER_TYPE___PARTY_PREF_DOC_TYPE_TPLS);

		orderTypeAttrEClass = createEClass(ORDER_TYPE_ATTR);
		createEAttribute(orderTypeAttrEClass, ORDER_TYPE_ATTR__ATTR_NAME);
		createEAttribute(orderTypeAttrEClass, ORDER_TYPE_ATTR__DESCRIPTION);
		createEReference(orderTypeAttrEClass, ORDER_TYPE_ATTR__ORDER_TYPE_ID);

		productOrderItemEClass = createEClass(PRODUCT_ORDER_ITEM);
		createEAttribute(productOrderItemEClass, PRODUCT_ORDER_ITEM__ORDER_ITEM_SEQ_ID);
		createEAttribute(productOrderItemEClass, PRODUCT_ORDER_ITEM__ENGAGEMENT_ITEM_SEQ_ID);
		createEReference(productOrderItemEClass, PRODUCT_ORDER_ITEM__ORDER_ID);
		createEReference(productOrderItemEClass, PRODUCT_ORDER_ITEM__PRODUCT_ID);
		createEReference(productOrderItemEClass, PRODUCT_ORDER_ITEM__ENGAGEMENT_ID);

		workOrderItemFulfillmentEClass = createEClass(WORK_ORDER_ITEM_FULFILLMENT);
		createEAttribute(workOrderItemFulfillmentEClass, WORK_ORDER_ITEM_FULFILLMENT__ORDER_ITEM_SEQ_ID);
		createEAttribute(workOrderItemFulfillmentEClass, WORK_ORDER_ITEM_FULFILLMENT__SHIP_GROUP_SEQ_ID);
		createEReference(workOrderItemFulfillmentEClass, WORK_ORDER_ITEM_FULFILLMENT__ORDER_ID);
		createEReference(workOrderItemFulfillmentEClass, WORK_ORDER_ITEM_FULFILLMENT__WORK_EFFORT_ID);
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
		CommunicationPackage theCommunicationPackage = (CommunicationPackage)EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI);
		LoginPackage theLoginPackage = (LoginPackage)EPackage.Registry.INSTANCE.getEPackage(LoginPackage.eNS_URI);
		PromoPackage thePromoPackage = (PromoPackage)EPackage.Registry.INSTANCE.getEPackage(PromoPackage.eNS_URI);
		GeoPackage theGeoPackage = (GeoPackage)EPackage.Registry.INSTANCE.getEPackage(GeoPackage.eNS_URI);
		LedgerPackage theLedgerPackage = (LedgerPackage)EPackage.Registry.INSTANCE.getEPackage(LedgerPackage.eNS_URI);
		TaxPackage theTaxPackage = (TaxPackage)EPackage.Registry.INSTANCE.getEPackage(TaxPackage.eNS_URI);
		InvoicePackage theInvoicePackage = (InvoicePackage)EPackage.Registry.INSTANCE.getEPackage(InvoicePackage.eNS_URI);
		org.abchip.mimo.biz.party.contact.ContactPackage theContactPackage_1 = (org.abchip.mimo.biz.party.contact.ContactPackage)EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.party.contact.ContactPackage.eNS_URI);
		ContentPackage theContentPackage = (ContentPackage)EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);
		UomPackage theUomPackage = (UomPackage)EPackage.Registry.INSTANCE.getEPackage(UomPackage.eNS_URI);
		StatusPackage theStatusPackage = (StatusPackage)EPackage.Registry.INSTANCE.getEPackage(StatusPackage.eNS_URI);
		EnumPackage theEnumPackage = (EnumPackage)EPackage.Registry.INSTANCE.getEPackage(EnumPackage.eNS_URI);
		FacilityPackage theFacilityPackage = (FacilityPackage)EPackage.Registry.INSTANCE.getEPackage(FacilityPackage.eNS_URI);
		PaymentPackage thePaymentPackage = (PaymentPackage)EPackage.Registry.INSTANCE.getEPackage(PaymentPackage.eNS_URI);
		StorePackage theStorePackage = (StorePackage)EPackage.Registry.INSTANCE.getEPackage(StorePackage.eNS_URI);
		ShoppinglistPackage theShoppinglistPackage = (ShoppinglistPackage)EPackage.Registry.INSTANCE.getEPackage(ShoppinglistPackage.eNS_URI);
		org.abchip.mimo.biz.webapp.website.WebsitePackage theWebsitePackage_1 = (org.abchip.mimo.biz.webapp.website.WebsitePackage)EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.webapp.website.WebsitePackage.eNS_URI);
		WorkeffortPackage theWorkeffortPackage = (WorkeffortPackage)EPackage.Registry.INSTANCE.getEPackage(WorkeffortPackage.eNS_URI);
		ProductPackage theProductPackage = (ProductPackage)EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI);
		InventoryPackage theInventoryPackage = (InventoryPackage)EPackage.Registry.INSTANCE.getEPackage(InventoryPackage.eNS_URI);
		OpportunityPackage theOpportunityPackage = (OpportunityPackage)EPackage.Registry.INSTANCE.getEPackage(OpportunityPackage.eNS_URI);
		ReceiptPackage theReceiptPackage = (ReceiptPackage)EPackage.Registry.INSTANCE.getEPackage(ReceiptPackage.eNS_URI);
		IssuancePackage theIssuancePackage = (IssuancePackage)EPackage.Registry.INSTANCE.getEPackage(IssuancePackage.eNS_URI);
		PricePackage thePricePackage = (PricePackage)EPackage.Registry.INSTANCE.getEPackage(PricePackage.eNS_URI);
		PartyPackage thePartyPackage = (PartyPackage)EPackage.Registry.INSTANCE.getEPackage(PartyPackage.eNS_URI);
		AgreementPackage theAgreementPackage = (AgreementPackage)EPackage.Registry.INSTANCE.getEPackage(AgreementPackage.eNS_URI);
		Shipment_Package theShipment_Package = (Shipment_Package)EPackage.Registry.INSTANCE.getEPackage(Shipment_Package.eNS_URI);
		FinaccountPackage theFinaccountPackage = (FinaccountPackage)EPackage.Registry.INSTANCE.getEPackage(FinaccountPackage.eNS_URI);

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

		// Initialize classes, features, and operations; add parameters
		initEClass(communicationEventOrderEClass, CommunicationEventOrder.class, "CommunicationEventOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationEventOrder_OrderId(), this.getOrderHeader(), null, "orderId", null, 0, 1, CommunicationEventOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCommunicationEventOrder_OrderId().getEKeys().add(this.getOrderHeader_OrderId());
		initEReference(getCommunicationEventOrder_CommunicationEventId(), theCommunicationPackage.getCommunicationEvent(), null, "communicationEventId", null, 0, 1, CommunicationEventOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCommunicationEventOrder_CommunicationEventId().getEKeys().add(theCommunicationPackage.getCommunicationEvent_CommunicationEventId());

		initEClass(orderAdjustmentEClass, OrderAdjustment.class, "OrderAdjustment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderAdjustment_OrderAdjustmentId(), ecorePackage.getEString(), "orderAdjustmentId", null, 1, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_Amount(), ecorePackage.getEBigDecimal(), "amount", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_AmountAlreadyIncluded(), ecorePackage.getEBigDecimal(), "amountAlreadyIncluded", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_CorrespondingProductId(), ecorePackage.getEString(), "correspondingProductId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEAttribute(getOrderAdjustment_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_ProductFeatureId(), ecorePackage.getEString(), "productFeatureId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_ProductPromoActionSeqId(), ecorePackage.getEString(), "productPromoActionSeqId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_ProductPromoRuleId(), ecorePackage.getEString(), "productPromoRuleId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_RecurringAmount(), ecorePackage.getEBigDecimal(), "recurringAmount", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_ShipGroupSeqId(), ecorePackage.getEString(), "shipGroupSeqId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_SourcePercentage(), ecorePackage.getEBigDecimal(), "sourcePercentage", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_SourceReferenceId(), ecorePackage.getEString(), "sourceReferenceId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_TaxAuthGeoId(), ecorePackage.getEString(), "taxAuthGeoId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustment_TaxAuthPartyId(), ecorePackage.getEString(), "taxAuthPartyId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderAdjustment_OrderAdjustmentTypeId(), this.getOrderAdjustmentType(), null, "orderAdjustmentTypeId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderAdjustment_OrderAdjustmentTypeId().getEKeys().add(this.getOrderAdjustmentType_OrderAdjustmentTypeId());
		initEReference(getOrderAdjustment_OrderId(), this.getOrderHeader(), null, "orderId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderAdjustment_OrderId().getEKeys().add(this.getOrderHeader_OrderId());
		initEReference(getOrderAdjustment_CreatedByUserLogin(), theLoginPackage.getUserLogin(), null, "createdByUserLogin", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderAdjustment_CreatedByUserLogin().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());
		initEReference(getOrderAdjustment_ProductPromoId(), thePromoPackage.getProductPromo(), null, "productPromoId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderAdjustment_ProductPromoId().getEKeys().add(thePromoPackage.getProductPromo_ProductPromoId());
		initEReference(getOrderAdjustment_PrimaryGeoId(), theGeoPackage.getGeo(), null, "primaryGeoId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderAdjustment_PrimaryGeoId().getEKeys().add(theGeoPackage.getGeo_GeoId());
		initEReference(getOrderAdjustment_SecondaryGeoId(), theGeoPackage.getGeo(), null, "secondaryGeoId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderAdjustment_SecondaryGeoId().getEKeys().add(theGeoPackage.getGeo_GeoId());
		initEReference(getOrderAdjustment_OverrideGlAccountId(), theLedgerPackage.getGlAccount(), null, "overrideGlAccountId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderAdjustment_OverrideGlAccountId().getEKeys().add(theLedgerPackage.getGlAccount_GlAccountId());
		initEReference(getOrderAdjustment_TaxAuthorityRateSeqId(), theTaxPackage.getTaxAuthorityRateProduct(), null, "taxAuthorityRateSeqId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderAdjustment_TaxAuthorityRateSeqId().getEKeys().add(theTaxPackage.getTaxAuthorityRateProduct_TaxAuthorityRateSeqId());
		initEReference(getOrderAdjustment_OriginalAdjustmentId(), this.getOrderAdjustment(), null, "originalAdjustmentId", null, 0, 1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderAdjustment_OriginalAdjustmentId().getEKeys().add(this.getOrderAdjustment_OrderAdjustmentId());
		initEAttribute(getOrderAdjustment_OrderAdjustmentAttributes(), ecorePackage.getEString(), "orderAdjustmentAttributes", null, 0, -1, OrderAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOrderAdjustment__ReturnAdjustments(), ecorePackage.getEString(), "returnAdjustments", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(orderAdjustmentAttributeEClass, OrderAdjustmentAttribute.class, "OrderAdjustmentAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderAdjustmentAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, OrderAdjustmentAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustmentAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, OrderAdjustmentAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustmentAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, OrderAdjustmentAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderAdjustmentAttribute_OrderAdjustmentId(), this.getOrderAdjustment(), null, "orderAdjustmentId", null, 0, 1, OrderAdjustmentAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderAdjustmentAttribute_OrderAdjustmentId().getEKeys().add(this.getOrderAdjustment_OrderAdjustmentId());

		initEClass(orderAdjustmentBillingEClass, OrderAdjustmentBilling.class, "OrderAdjustmentBilling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderAdjustmentBilling_InvoiceItemSeqId(), ecorePackage.getEString(), "invoiceItemSeqId", null, 1, 1, OrderAdjustmentBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustmentBilling_Amount(), ecorePackage.getEBigDecimal(), "amount", null, 0, 1, OrderAdjustmentBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderAdjustmentBilling_OrderAdjustmentId(), this.getOrderAdjustment(), null, "orderAdjustmentId", null, 0, 1, OrderAdjustmentBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderAdjustmentBilling_OrderAdjustmentId().getEKeys().add(this.getOrderAdjustment_OrderAdjustmentId());
		initEReference(getOrderAdjustmentBilling_InvoiceId(), theInvoicePackage.getInvoice(), null, "invoiceId", null, 0, 1, OrderAdjustmentBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderAdjustmentBilling_InvoiceId().getEKeys().add(theInvoicePackage.getInvoice_InvoiceId());

		initEClass(orderAdjustmentTypeEClass, OrderAdjustmentType.class, "OrderAdjustmentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderAdjustmentType_OrderAdjustmentTypeId(), ecorePackage.getEString(), "orderAdjustmentTypeId", null, 1, 1, OrderAdjustmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustmentType_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderAdjustmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustmentType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, OrderAdjustmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderAdjustmentType_ParentTypeId(), this.getOrderAdjustmentType(), null, "parentTypeId", null, 0, 1, OrderAdjustmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderAdjustmentType_ParentTypeId().getEKeys().add(this.getOrderAdjustmentType_OrderAdjustmentTypeId());
		initEAttribute(getOrderAdjustmentType_OrderAdjustmentTypeAttrs(), ecorePackage.getEString(), "orderAdjustmentTypeAttrs", null, 0, -1, OrderAdjustmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOrderAdjustmentType__ChildOrderAdjustmentTypes(), ecorePackage.getEString(), "childOrderAdjustmentTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrderAdjustmentType__OrderAdjustments(), ecorePackage.getEString(), "orderAdjustments", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrderAdjustmentType__QuoteAdjustments(), ecorePackage.getEString(), "quoteAdjustments", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(orderAdjustmentTypeAttrEClass, OrderAdjustmentTypeAttr.class, "OrderAdjustmentTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderAdjustmentTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, OrderAdjustmentTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAdjustmentTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderAdjustmentTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderAdjustmentTypeAttr_OrderAdjustmentTypeId(), this.getOrderAdjustmentType(), null, "orderAdjustmentTypeId", null, 0, 1, OrderAdjustmentTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderAdjustmentTypeAttr_OrderAdjustmentTypeId().getEKeys().add(this.getOrderAdjustmentType_OrderAdjustmentTypeId());

		initEClass(orderAttributeEClass, OrderAttribute.class, "OrderAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, OrderAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, OrderAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, OrderAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderAttribute_OrderId(), this.getOrderHeader(), null, "orderId", null, 0, 1, OrderAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderAttribute_OrderId().getEKeys().add(this.getOrderHeader_OrderId());

		initEClass(orderBlacklistEClass, OrderBlacklist.class, "OrderBlacklist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderBlacklist_BlacklistString(), ecorePackage.getEString(), "blacklistString", null, 1, 1, OrderBlacklist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderBlacklist_OrderBlacklistTypeId(), this.getOrderBlacklistType(), null, "orderBlacklistTypeId", null, 0, 1, OrderBlacklist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderBlacklist_OrderBlacklistTypeId().getEKeys().add(this.getOrderBlacklistType_OrderBlacklistTypeId());

		initEClass(orderBlacklistTypeEClass, OrderBlacklistType.class, "OrderBlacklistType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderBlacklistType_OrderBlacklistTypeId(), ecorePackage.getEString(), "orderBlacklistTypeId", null, 1, 1, OrderBlacklistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderBlacklistType_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderBlacklistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOrderBlacklistType__OrderBlacklists(), ecorePackage.getEString(), "orderBlacklists", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(orderContactMechEClass, OrderContactMech.class, "OrderContactMech", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderContactMech_OrderId(), this.getOrderHeader(), null, "orderId", null, 0, 1, OrderContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderContactMech_OrderId().getEKeys().add(this.getOrderHeader_OrderId());
		initEReference(getOrderContactMech_ContactMechId(), theContactPackage_1.getContactMech(), null, "contactMechId", null, 0, 1, OrderContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderContactMech_ContactMechId().getEKeys().add(theContactPackage_1.getContactMech_ContactMechId());
		initEReference(getOrderContactMech_ContactMechPurposeTypeId(), theContactPackage_1.getContactMechPurposeType(), null, "contactMechPurposeTypeId", null, 0, 1, OrderContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderContactMech_ContactMechPurposeTypeId().getEKeys().add(theContactPackage_1.getContactMechPurposeType_ContactMechPurposeTypeId());

		initEClass(orderContentEClass, OrderContent.class, "OrderContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderContent_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, OrderContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderContent_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, OrderContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderContent_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, OrderContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderContent_OrderId(), this.getOrderHeader(), null, "orderId", null, 0, 1, OrderContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderContent_OrderId().getEKeys().add(this.getOrderHeader_OrderId());
		initEReference(getOrderContent_ContentId(), theContentPackage.getContent(), null, "contentId", null, 0, 1, OrderContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderContent_ContentId().getEKeys().add(theContentPackage.getContent_ContentId());
		initEReference(getOrderContent_OrderContentTypeId(), this.getOrderContentType(), null, "orderContentTypeId", null, 0, 1, OrderContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderContent_OrderContentTypeId().getEKeys().add(this.getOrderContentType_OrderContentTypeId());

		initEClass(orderContentTypeEClass, OrderContentType.class, "OrderContentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderContentType_OrderContentTypeId(), ecorePackage.getEString(), "orderContentTypeId", null, 1, 1, OrderContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderContentType_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderContentType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, OrderContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderContentType_ParentTypeId(), this.getOrderContentType(), null, "parentTypeId", null, 0, 1, OrderContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderContentType_ParentTypeId().getEKeys().add(this.getOrderContentType_OrderContentTypeId());

		initEOperation(getOrderContentType__ChildOrderContentTypes(), ecorePackage.getEString(), "childOrderContentTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(orderDeliveryScheduleEClass, OrderDeliverySchedule.class, "OrderDeliverySchedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderDeliverySchedule_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDeliverySchedule_Cartons(), ecorePackage.getELong(), "cartons", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDeliverySchedule_EstimatedReadyDate(), ecorePackage.getEDate(), "estimatedReadyDate", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDeliverySchedule_SkidsPallets(), ecorePackage.getELong(), "skidsPallets", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDeliverySchedule_TotalCubicSize(), ecorePackage.getEBigDecimal(), "totalCubicSize", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDeliverySchedule_TotalWeight(), ecorePackage.getEBigDecimal(), "totalWeight", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderDeliverySchedule_UnitsPieces(), ecorePackage.getEBigDecimal(), "unitsPieces", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderDeliverySchedule_OrderId(), this.getOrderHeader(), null, "orderId", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderDeliverySchedule_OrderId().getEKeys().add(this.getOrderHeader_OrderId());
		initEReference(getOrderDeliverySchedule_TotalCubicUomId(), theUomPackage.getUom(), null, "totalCubicUomId", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderDeliverySchedule_TotalCubicUomId().getEKeys().add(theUomPackage.getUom_UomId());
		initEReference(getOrderDeliverySchedule_TotalWeightUomId(), theUomPackage.getUom(), null, "totalWeightUomId", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderDeliverySchedule_TotalWeightUomId().getEKeys().add(theUomPackage.getUom_UomId());
		initEReference(getOrderDeliverySchedule_StatusId(), theStatusPackage.getStatusItem(), null, "statusId", null, 0, 1, OrderDeliverySchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderDeliverySchedule_StatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());

		initEClass(orderHeaderEClass, OrderHeader.class, "OrderHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderHeader_OrderId(), ecorePackage.getEString(), "orderId", null, 1, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_AgreementId(), ecorePackage.getEString(), "agreementId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEAttribute(getOrderHeader_PickSheetPrintedDate(), ecorePackage.getEDate(), "pickSheetPrintedDate", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_Priority(), ecorePackage.getEBoolean(), "priority", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_RemainingSubTotal(), ecorePackage.getEBigDecimal(), "remainingSubTotal", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_TerminalId(), ecorePackage.getEString(), "terminalId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_TransactionId(), ecorePackage.getEString(), "transactionId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderHeader_VisitId(), ecorePackage.getEString(), "visitId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderHeader_OrderTypeId(), this.getOrderType(), null, "orderTypeId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderHeader_OrderTypeId().getEKeys().add(this.getOrderType_OrderTypeId());
		initEReference(getOrderHeader_SalesChannelEnumId(), theEnumPackage.getEnumeration(), null, "salesChannelEnumId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderHeader_SalesChannelEnumId().getEKeys().add(theEnumPackage.getEnumeration_EnumId());
		initEReference(getOrderHeader_OriginFacilityId(), theFacilityPackage.getFacility(), null, "originFacilityId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderHeader_OriginFacilityId().getEKeys().add(theFacilityPackage.getFacility_FacilityId());
		initEReference(getOrderHeader_BillingAccountId(), thePaymentPackage.getBillingAccount(), null, "billingAccountId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderHeader_BillingAccountId().getEKeys().add(thePaymentPackage.getBillingAccount_BillingAccountId());
		initEReference(getOrderHeader_ProductStoreId(), theStorePackage.getProductStore(), null, "productStoreId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderHeader_ProductStoreId().getEKeys().add(theStorePackage.getProductStore_ProductStoreId());
		initEReference(getOrderHeader_AutoOrderShoppingListId(), theShoppinglistPackage.getShoppingList(), null, "autoOrderShoppingListId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderHeader_AutoOrderShoppingListId().getEKeys().add(theShoppinglistPackage.getShoppingList_ShoppingListId());
		initEReference(getOrderHeader_CreatedBy(), theLoginPackage.getUserLogin(), null, "createdBy", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderHeader_CreatedBy().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());
		initEReference(getOrderHeader_StatusId(), theStatusPackage.getStatusItem(), null, "statusId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderHeader_StatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEReference(getOrderHeader_SyncStatusId(), theStatusPackage.getStatusItem(), null, "syncStatusId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderHeader_SyncStatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEReference(getOrderHeader_CurrencyUom(), theUomPackage.getUom(), null, "currencyUom", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderHeader_CurrencyUom().getEKeys().add(theUomPackage.getUom_UomId());
		initEReference(getOrderHeader_WebSiteId(), theWebsitePackage_1.getWebSite(), null, "webSiteId", null, 0, 1, OrderHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderHeader_WebSiteId().getEKeys().add(theWebsitePackage_1.getWebSite_WebSiteId());
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

		initEOperation(getOrderHeader__AcquireFixedAssets(), ecorePackage.getEString(), "acquireFixedAssets", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrderHeader__GiftCardFulfillments(), ecorePackage.getEString(), "giftCardFulfillments", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrderHeader__ItemIssuances(), ecorePackage.getEString(), "itemIssuances", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrderHeader__OrderAdjustments(), ecorePackage.getEString(), "orderAdjustments", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrderHeader__OrderItemChanges(), ecorePackage.getEString(), "orderItemChanges", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrderHeader__OrderItemPriceInfos(), ecorePackage.getEString(), "orderItemPriceInfos", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrderHeader__OrderNotifications(), ecorePackage.getEString(), "orderNotifications", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrderHeader__OrderPaymentPreferences(), ecorePackage.getEString(), "orderPaymentPreferences", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrderHeader__OrderStatuss(), ecorePackage.getEString(), "orderStatuss", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrderHeader__PrimaryPicklistBins(), ecorePackage.getEString(), "primaryPicklistBins", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrderHeader__PrimaryShipments(), ecorePackage.getEString(), "primaryShipments", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrderHeader__PurchaseFixedAssetMaints(), ecorePackage.getEString(), "purchaseFixedAssetMaints", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrderHeader__ReplacementReturnItemResponses(), ecorePackage.getEString(), "replacementReturnItemResponses", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrderHeader__ReturnItems(), ecorePackage.getEString(), "returnItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrderHeader__ShipmentReceipts(), ecorePackage.getEString(), "shipmentReceipts", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrderHeader__Subscriptions(), ecorePackage.getEString(), "subscriptions", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrderHeader__SurveyResponses(), ecorePackage.getEString(), "surveyResponses", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(orderHeaderNoteEClass, OrderHeaderNote.class, "OrderHeaderNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderHeaderNote_InternalNote(), ecorePackage.getEBoolean(), "internalNote", null, 0, 1, OrderHeaderNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderHeaderNote_OrderId(), this.getOrderHeader(), null, "orderId", null, 0, 1, OrderHeaderNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderHeaderNote_OrderId().getEKeys().add(this.getOrderHeader_OrderId());

		initEClass(orderHeaderWorkEffortEClass, OrderHeaderWorkEffort.class, "OrderHeaderWorkEffort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderHeaderWorkEffort_OrderId(), this.getOrderHeader(), null, "orderId", null, 0, 1, OrderHeaderWorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderHeaderWorkEffort_OrderId().getEKeys().add(this.getOrderHeader_OrderId());
		initEReference(getOrderHeaderWorkEffort_WorkEffortId(), theWorkeffortPackage.getWorkEffort(), null, "workEffortId", null, 0, 1, OrderHeaderWorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderHeaderWorkEffort_WorkEffortId().getEKeys().add(theWorkeffortPackage.getWorkEffort_WorkEffortId());

		initEClass(orderItemEClass, OrderItem.class, "OrderItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItem_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_AutoCancelDate(), ecorePackage.getEDate(), "autoCancelDate", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_BudgetId(), ecorePackage.getEString(), "budgetId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_BudgetItemSeqId(), ecorePackage.getEString(), "budgetItemSeqId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_CancelBackOrderDate(), ecorePackage.getEDate(), "cancelBackOrderDate", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_CancelQuantity(), ecorePackage.getEBigDecimal(), "cancelQuantity", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_CorrespondingPoId(), ecorePackage.getEString(), "correspondingPoId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_DeploymentId(), ecorePackage.getEString(), "deploymentId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_DontCancelSetDate(), ecorePackage.getEDate(), "dontCancelSetDate", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_EstimatedDeliveryDate(), ecorePackage.getEDate(), "estimatedDeliveryDate", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_EstimatedShipDate(), ecorePackage.getEDate(), "estimatedShipDate", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ExternalId(), ecorePackage.getEString(), "externalId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_IsItemGroupPrimary(), ecorePackage.getEBoolean(), "isItemGroupPrimary", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_IsModifiedPrice(), ecorePackage.getEBoolean(), "isModifiedPrice", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_IsPromo(), ecorePackage.getEBoolean(), "isPromo", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ItemDescription(), ecorePackage.getEString(), "itemDescription", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_OrderItemGroupSeqId(), ecorePackage.getEString(), "orderItemGroupSeqId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ProdCatalogId(), ecorePackage.getEString(), "prodCatalogId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ProductCategoryId(), ecorePackage.getEString(), "productCategoryId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ProductFeatureId(), ecorePackage.getEString(), "productFeatureId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_QuoteId(), ecorePackage.getEString(), "quoteId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_QuoteItemSeqId(), ecorePackage.getEString(), "quoteItemSeqId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ReserveAfterDate(), ecorePackage.getEDate(), "reserveAfterDate", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_SelectedAmount(), ecorePackage.getEBigDecimal(), "selectedAmount", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ShipAfterDate(), ecorePackage.getEDate(), "shipAfterDate", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ShipBeforeDate(), ecorePackage.getEDate(), "shipBeforeDate", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ShoppingListId(), ecorePackage.getEString(), "shoppingListId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_ShoppingListItemSeqId(), ecorePackage.getEString(), "shoppingListItemSeqId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_SubscriptionId(), ecorePackage.getEString(), "subscriptionId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_SupplierProductId(), ecorePackage.getEString(), "supplierProductId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_UnitAverageCost(), ecorePackage.getEBigDecimal(), "unitAverageCost", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_UnitListPrice(), ecorePackage.getEBigDecimal(), "unitListPrice", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_UnitPrice(), ecorePackage.getEBigDecimal(), "unitPrice", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItem_UnitRecurringPrice(), ecorePackage.getEBigDecimal(), "unitRecurringPrice", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItem_OrderId(), this.getOrderHeader(), null, "orderId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItem_OrderId().getEKeys().add(this.getOrderHeader_OrderId());
		initEReference(getOrderItem_OrderItemTypeId(), this.getOrderItemType(), null, "orderItemTypeId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItem_OrderItemTypeId().getEKeys().add(this.getOrderItemType_OrderItemTypeId());
		initEReference(getOrderItem_ProductId(), theProductPackage.getProduct(), null, "productId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItem_ProductId().getEKeys().add(theProductPackage.getProduct_ProductId());
		initEReference(getOrderItem_FromInventoryItemId(), theInventoryPackage.getInventoryItem(), null, "fromInventoryItemId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItem_FromInventoryItemId().getEKeys().add(theInventoryPackage.getInventoryItem_InventoryItemId());
		initEReference(getOrderItem_RecurringFreqUomId(), theUomPackage.getUom(), null, "recurringFreqUomId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItem_RecurringFreqUomId().getEKeys().add(theUomPackage.getUom_UomId());
		initEReference(getOrderItem_StatusId(), theStatusPackage.getStatusItem(), null, "statusId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItem_StatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEReference(getOrderItem_SyncStatusId(), theStatusPackage.getStatusItem(), null, "syncStatusId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItem_SyncStatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEReference(getOrderItem_DontCancelSetUserLogin(), theLoginPackage.getUserLogin(), null, "dontCancelSetUserLogin", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItem_DontCancelSetUserLogin().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());
		initEReference(getOrderItem_OverrideGlAccountId(), theLedgerPackage.getGlAccount(), null, "overrideGlAccountId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItem_OverrideGlAccountId().getEKeys().add(theLedgerPackage.getGlAccount_GlAccountId());
		initEReference(getOrderItem_SalesOpportunityId(), theOpportunityPackage.getSalesOpportunity(), null, "salesOpportunityId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItem_SalesOpportunityId().getEKeys().add(theOpportunityPackage.getSalesOpportunity_SalesOpportunityId());
		initEReference(getOrderItem_ChangeByUserLoginId(), theLoginPackage.getUserLogin(), null, "changeByUserLoginId", null, 0, 1, OrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItem_ChangeByUserLoginId().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());

		initEClass(orderItemAssocEClass, OrderItemAssoc.class, "OrderItemAssoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemAssoc_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, OrderItemAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAssoc_ShipGroupSeqId(), ecorePackage.getEString(), "shipGroupSeqId", null, 1, 1, OrderItemAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAssoc_ToOrderItemSeqId(), ecorePackage.getEString(), "toOrderItemSeqId", null, 1, 1, OrderItemAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAssoc_ToShipGroupSeqId(), ecorePackage.getEString(), "toShipGroupSeqId", null, 1, 1, OrderItemAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAssoc_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, OrderItemAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemAssoc_OrderItemAssocTypeId(), this.getOrderItemAssocType(), null, "orderItemAssocTypeId", null, 0, 1, OrderItemAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemAssoc_OrderItemAssocTypeId().getEKeys().add(this.getOrderItemAssocType_OrderItemAssocTypeId());
		initEReference(getOrderItemAssoc_OrderId(), this.getOrderHeader(), null, "orderId", null, 0, 1, OrderItemAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemAssoc_OrderId().getEKeys().add(this.getOrderHeader_OrderId());
		initEReference(getOrderItemAssoc_ToOrderId(), this.getOrderHeader(), null, "toOrderId", null, 0, 1, OrderItemAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemAssoc_ToOrderId().getEKeys().add(this.getOrderHeader_OrderId());

		initEClass(orderItemAssocTypeEClass, OrderItemAssocType.class, "OrderItemAssocType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemAssocType_OrderItemAssocTypeId(), ecorePackage.getEString(), "orderItemAssocTypeId", null, 1, 1, OrderItemAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAssocType_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderItemAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAssocType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, OrderItemAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemAssocType_ParentTypeId(), this.getOrderItemAssocType(), null, "parentTypeId", null, 0, 1, OrderItemAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemAssocType_ParentTypeId().getEKeys().add(this.getOrderItemAssocType_OrderItemAssocTypeId());

		initEOperation(getOrderItemAssocType__ChildOrderItemAssocTypes(), ecorePackage.getEString(), "childOrderItemAssocTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(orderItemAttributeEClass, OrderItemAttribute.class, "OrderItemAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemAttribute_OrderId(), ecorePackage.getEString(), "orderId", null, 1, 1, OrderItemAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAttribute_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, OrderItemAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, OrderItemAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, OrderItemAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, OrderItemAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderItemBillingEClass, OrderItemBilling.class, "OrderItemBilling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemBilling_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, OrderItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemBilling_InvoiceItemSeqId(), ecorePackage.getEString(), "invoiceItemSeqId", null, 1, 1, OrderItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemBilling_Amount(), ecorePackage.getEBigDecimal(), "amount", null, 0, 1, OrderItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemBilling_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, OrderItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemBilling_OrderId(), this.getOrderHeader(), null, "orderId", null, 0, 1, OrderItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemBilling_OrderId().getEKeys().add(this.getOrderHeader_OrderId());
		initEReference(getOrderItemBilling_InvoiceId(), theInvoicePackage.getInvoice(), null, "invoiceId", null, 0, 1, OrderItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemBilling_InvoiceId().getEKeys().add(theInvoicePackage.getInvoice_InvoiceId());
		initEReference(getOrderItemBilling_ShipmentReceiptId(), theReceiptPackage.getShipmentReceipt(), null, "shipmentReceiptId", null, 0, 1, OrderItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemBilling_ShipmentReceiptId().getEKeys().add(theReceiptPackage.getShipmentReceipt_ReceiptId());
		initEReference(getOrderItemBilling_ItemIssuanceId(), theIssuancePackage.getItemIssuance(), null, "itemIssuanceId", null, 0, 1, OrderItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemBilling_ItemIssuanceId().getEKeys().add(theIssuancePackage.getItemIssuance_ItemIssuanceId());

		initEClass(orderItemChangeEClass, OrderItemChange.class, "OrderItemChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemChange_OrderItemChangeId(), ecorePackage.getEString(), "orderItemChangeId", null, 1, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemChange_CancelQuantity(), ecorePackage.getEBigDecimal(), "cancelQuantity", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemChange_ChangeComments(), ecorePackage.getEString(), "changeComments", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemChange_ChangeDatetime(), ecorePackage.getEDate(), "changeDatetime", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemChange_ItemDescription(), ecorePackage.getEString(), "itemDescription", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemChange_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemChange_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemChange_UnitPrice(), ecorePackage.getEBigDecimal(), "unitPrice", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemChange_OrderId(), this.getOrderHeader(), null, "orderId", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemChange_OrderId().getEKeys().add(this.getOrderHeader_OrderId());
		initEReference(getOrderItemChange_ChangeTypeEnumId(), theEnumPackage.getEnumeration(), null, "changeTypeEnumId", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemChange_ChangeTypeEnumId().getEKeys().add(theEnumPackage.getEnumeration_EnumId());
		initEReference(getOrderItemChange_ReasonEnumId(), theEnumPackage.getEnumeration(), null, "reasonEnumId", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemChange_ReasonEnumId().getEKeys().add(theEnumPackage.getEnumeration_EnumId());
		initEReference(getOrderItemChange_ChangeUserLogin(), theLoginPackage.getUserLogin(), null, "changeUserLogin", null, 0, 1, OrderItemChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemChange_ChangeUserLogin().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());

		initEClass(orderItemContactMechEClass, OrderItemContactMech.class, "OrderItemContactMech", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemContactMech_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, OrderItemContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemContactMech_OrderId(), this.getOrderHeader(), null, "orderId", null, 0, 1, OrderItemContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemContactMech_OrderId().getEKeys().add(this.getOrderHeader_OrderId());
		initEReference(getOrderItemContactMech_ContactMechId(), theContactPackage_1.getContactMech(), null, "contactMechId", null, 0, 1, OrderItemContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemContactMech_ContactMechId().getEKeys().add(theContactPackage_1.getContactMech_ContactMechId());
		initEReference(getOrderItemContactMech_ContactMechPurposeTypeId(), theContactPackage_1.getContactMechPurposeType(), null, "contactMechPurposeTypeId", null, 0, 1, OrderItemContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemContactMech_ContactMechPurposeTypeId().getEKeys().add(theContactPackage_1.getContactMechPurposeType_ContactMechPurposeTypeId());

		initEClass(orderItemGroupEClass, OrderItemGroup.class, "OrderItemGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemGroup_OrderItemGroupSeqId(), ecorePackage.getEString(), "orderItemGroupSeqId", null, 1, 1, OrderItemGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemGroup_GroupName(), ecorePackage.getEString(), "groupName", null, 0, 1, OrderItemGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemGroup_ParentGroupSeqId(), ecorePackage.getEString(), "parentGroupSeqId", null, 0, 1, OrderItemGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemGroup_OrderId(), this.getOrderHeader(), null, "orderId", null, 0, 1, OrderItemGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemGroup_OrderId().getEKeys().add(this.getOrderHeader_OrderId());

		initEClass(orderItemGroupOrderEClass, OrderItemGroupOrder.class, "OrderItemGroupOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemGroupOrder_OrderId(), ecorePackage.getEString(), "orderId", null, 1, 1, OrderItemGroupOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemGroupOrder_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, OrderItemGroupOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemGroupOrder_GroupOrderId(), theProductPackage.getProductGroupOrder(), null, "groupOrderId", null, 0, 1, OrderItemGroupOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemGroupOrder_GroupOrderId().getEKeys().add(theProductPackage.getProductGroupOrder_GroupOrderId());

		initEClass(orderItemPriceInfoEClass, OrderItemPriceInfo.class, "OrderItemPriceInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemPriceInfo_OrderItemPriceInfoId(), ecorePackage.getEString(), "orderItemPriceInfoId", null, 1, 1, OrderItemPriceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemPriceInfo_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderItemPriceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemPriceInfo_ModifyAmount(), ecorePackage.getEBigDecimal(), "modifyAmount", null, 0, 1, OrderItemPriceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemPriceInfo_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderItemPriceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemPriceInfo_ProductPriceActionSeqId(), ecorePackage.getEString(), "productPriceActionSeqId", null, 0, 1, OrderItemPriceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemPriceInfo_RateCode(), ecorePackage.getEString(), "rateCode", null, 0, 1, OrderItemPriceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemPriceInfo_OrderId(), this.getOrderHeader(), null, "orderId", null, 0, 1, OrderItemPriceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemPriceInfo_OrderId().getEKeys().add(this.getOrderHeader_OrderId());
		initEReference(getOrderItemPriceInfo_ProductPriceRuleId(), thePricePackage.getProductPriceRule(), null, "productPriceRuleId", null, 0, 1, OrderItemPriceInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemPriceInfo_ProductPriceRuleId().getEKeys().add(thePricePackage.getProductPriceRule_ProductPriceRuleId());

		initEClass(orderItemRoleEClass, OrderItemRole.class, "OrderItemRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemRole_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, OrderItemRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemRole_OrderId(), this.getOrderHeader(), null, "orderId", null, 0, 1, OrderItemRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemRole_OrderId().getEKeys().add(this.getOrderHeader_OrderId());
		initEReference(getOrderItemRole_PartyId(), thePartyPackage.getParty(), null, "partyId", null, 0, 1, OrderItemRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemRole_PartyId().getEKeys().add(thePartyPackage.getParty_PartyId());
		initEReference(getOrderItemRole_RoleTypeId(), thePartyPackage.getRoleType(), null, "roleTypeId", null, 0, 1, OrderItemRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemRole_RoleTypeId().getEKeys().add(thePartyPackage.getRoleType_RoleTypeId());

		initEClass(orderItemShipGroupEClass, OrderItemShipGroup.class, "OrderItemShipGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemShipGroup_ShipGroupSeqId(), ecorePackage.getEString(), "shipGroupSeqId", null, 1, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_CarrierRoleTypeId(), ecorePackage.getEString(), "carrierRoleTypeId", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_EstimatedDeliveryDate(), ecorePackage.getEDate(), "estimatedDeliveryDate", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_EstimatedShipDate(), ecorePackage.getEDate(), "estimatedShipDate", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_GiftMessage(), ecorePackage.getEString(), "giftMessage", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_IsGift(), ecorePackage.getEBoolean(), "isGift", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_MaySplit(), ecorePackage.getEBoolean(), "maySplit", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_ShipAfterDate(), ecorePackage.getEDate(), "shipAfterDate", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_ShipByDate(), ecorePackage.getEDate(), "shipByDate", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_ShippingInstructions(), ecorePackage.getEString(), "shippingInstructions", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroup_TrackingNumber(), ecorePackage.getEString(), "trackingNumber", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemShipGroup_OrderId(), this.getOrderHeader(), null, "orderId", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemShipGroup_OrderId().getEKeys().add(this.getOrderHeader_OrderId());
		initEReference(getOrderItemShipGroup_SupplierPartyId(), thePartyPackage.getParty(), null, "supplierPartyId", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemShipGroup_SupplierPartyId().getEKeys().add(thePartyPackage.getParty_PartyId());
		initEReference(getOrderItemShipGroup_SupplierAgreementId(), theAgreementPackage.getAgreement(), null, "supplierAgreementId", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemShipGroup_SupplierAgreementId().getEKeys().add(theAgreementPackage.getAgreement_AgreementId());
		initEReference(getOrderItemShipGroup_VendorPartyId(), thePartyPackage.getParty(), null, "vendorPartyId", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemShipGroup_VendorPartyId().getEKeys().add(thePartyPackage.getParty_PartyId());
		initEReference(getOrderItemShipGroup_CarrierPartyId(), thePartyPackage.getParty(), null, "carrierPartyId", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemShipGroup_CarrierPartyId().getEKeys().add(thePartyPackage.getParty_PartyId());
		initEReference(getOrderItemShipGroup_FacilityId(), theFacilityPackage.getFacility(), null, "facilityId", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemShipGroup_FacilityId().getEKeys().add(theFacilityPackage.getFacility_FacilityId());
		initEReference(getOrderItemShipGroup_ShipmentMethodTypeId(), theShipment_Package.getShipmentMethodType(), null, "shipmentMethodTypeId", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemShipGroup_ShipmentMethodTypeId().getEKeys().add(theShipment_Package.getShipmentMethodType_ShipmentMethodTypeId());
		initEReference(getOrderItemShipGroup_ContactMechId(), theContactPackage_1.getContactMech(), null, "contactMechId", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemShipGroup_ContactMechId().getEKeys().add(theContactPackage_1.getContactMech_ContactMechId());
		initEReference(getOrderItemShipGroup_TelecomContactMechId(), theContactPackage_1.getContactMech(), null, "telecomContactMechId", null, 0, 1, OrderItemShipGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemShipGroup_TelecomContactMechId().getEKeys().add(theContactPackage_1.getContactMech_ContactMechId());

		initEClass(orderItemShipGroupAssocEClass, OrderItemShipGroupAssoc.class, "OrderItemShipGroupAssoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemShipGroupAssoc_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, OrderItemShipGroupAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroupAssoc_ShipGroupSeqId(), ecorePackage.getEString(), "shipGroupSeqId", null, 1, 1, OrderItemShipGroupAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroupAssoc_CancelQuantity(), ecorePackage.getEBigDecimal(), "cancelQuantity", null, 0, 1, OrderItemShipGroupAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGroupAssoc_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, OrderItemShipGroupAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemShipGroupAssoc_OrderId(), this.getOrderHeader(), null, "orderId", null, 0, 1, OrderItemShipGroupAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemShipGroupAssoc_OrderId().getEKeys().add(this.getOrderHeader_OrderId());

		initEClass(orderItemShipGrpInvResEClass, OrderItemShipGrpInvRes.class, "OrderItemShipGrpInvRes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemShipGrpInvRes_ShipGroupSeqId(), ecorePackage.getEString(), "shipGroupSeqId", null, 1, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemShipGrpInvRes_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEReference(getOrderItemShipGrpInvRes_OrderId(), this.getOrderHeader(), null, "orderId", null, 0, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemShipGrpInvRes_OrderId().getEKeys().add(this.getOrderHeader_OrderId());
		initEReference(getOrderItemShipGrpInvRes_InventoryItemId(), theInventoryPackage.getInventoryItem(), null, "inventoryItemId", null, 0, 1, OrderItemShipGrpInvRes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemShipGrpInvRes_InventoryItemId().getEKeys().add(theInventoryPackage.getInventoryItem_InventoryItemId());

		initEClass(orderItemTypeEClass, OrderItemType.class, "OrderItemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemType_OrderItemTypeId(), ecorePackage.getEString(), "orderItemTypeId", null, 1, 1, OrderItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemType_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, OrderItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemType_ParentTypeId(), this.getOrderItemType(), null, "parentTypeId", null, 0, 1, OrderItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemType_ParentTypeId().getEKeys().add(this.getOrderItemType_OrderItemTypeId());
		initEAttribute(getOrderItemType_OrderItemTypeAttrs(), ecorePackage.getEString(), "orderItemTypeAttrs", null, 0, -1, OrderItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOrderItemType__ChildOrderItemTypes(), ecorePackage.getEString(), "childOrderItemTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrderItemType__OrderItems(), ecorePackage.getEString(), "orderItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(orderItemTypeAttrEClass, OrderItemTypeAttr.class, "OrderItemTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderItemTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, OrderItemTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderItemTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderItemTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderItemTypeAttr_OrderItemTypeId(), this.getOrderItemType(), null, "orderItemTypeId", null, 0, 1, OrderItemTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderItemTypeAttr_OrderItemTypeId().getEKeys().add(this.getOrderItemType_OrderItemTypeId());

		initEClass(orderNotificationEClass, OrderNotification.class, "OrderNotification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderNotification_OrderNotificationId(), ecorePackage.getEString(), "orderNotificationId", null, 1, 1, OrderNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderNotification_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, OrderNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderNotification_NotificationDate(), ecorePackage.getEDate(), "notificationDate", null, 0, 1, OrderNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderNotification_OrderId(), this.getOrderHeader(), null, "orderId", null, 0, 1, OrderNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderNotification_OrderId().getEKeys().add(this.getOrderHeader_OrderId());
		initEReference(getOrderNotification_EmailType(), theEnumPackage.getEnumeration(), null, "emailType", null, 0, 1, OrderNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderNotification_EmailType().getEKeys().add(theEnumPackage.getEnumeration_EnumId());

		initEClass(orderPaymentPreferenceEClass, OrderPaymentPreference.class, "OrderPaymentPreference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderPaymentPreference_OrderPaymentPreferenceId(), ecorePackage.getEString(), "orderPaymentPreferenceId", null, 1, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_BillingPostalCode(), ecorePackage.getEString(), "billingPostalCode", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_CreatedDate(), ecorePackage.getEDate(), "createdDate", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_LastModifiedByUserLogin(), ecorePackage.getEString(), "lastModifiedByUserLogin", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_LastModifiedDate(), ecorePackage.getEDate(), "lastModifiedDate", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_ManualAuthCode(), ecorePackage.getEString(), "manualAuthCode", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_ManualRefNum(), ecorePackage.getEString(), "manualRefNum", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_MaxAmount(), ecorePackage.getEBigDecimal(), "maxAmount", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_NeedsNsfRetry(), ecorePackage.getEBoolean(), "needsNsfRetry", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_OverflowFlag(), ecorePackage.getEBoolean(), "overflowFlag", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_PresentFlag(), ecorePackage.getEBoolean(), "presentFlag", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_ProcessAttempt(), ecorePackage.getELong(), "processAttempt", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_SecurityCode(), ecorePackage.getEString(), "securityCode", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_ShipGroupSeqId(), ecorePackage.getEString(), "shipGroupSeqId", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_SwipedFlag(), ecorePackage.getEBoolean(), "swipedFlag", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderPaymentPreference_Track2(), ecorePackage.getEString(), "track2", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderPaymentPreference_OrderId(), this.getOrderHeader(), null, "orderId", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderPaymentPreference_OrderId().getEKeys().add(this.getOrderHeader_OrderId());
		initEReference(getOrderPaymentPreference_ProductPricePurposeId(), thePricePackage.getProductPricePurpose(), null, "productPricePurposeId", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderPaymentPreference_ProductPricePurposeId().getEKeys().add(thePricePackage.getProductPricePurpose_ProductPricePurposeId());
		initEReference(getOrderPaymentPreference_PaymentMethodTypeId(), thePaymentPackage.getPaymentMethodType(), null, "paymentMethodTypeId", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderPaymentPreference_PaymentMethodTypeId().getEKeys().add(thePaymentPackage.getPaymentMethodType_PaymentMethodTypeId());
		initEReference(getOrderPaymentPreference_PaymentMethodId(), thePaymentPackage.getPaymentMethod(), null, "paymentMethodId", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderPaymentPreference_PaymentMethodId().getEKeys().add(thePaymentPackage.getPaymentMethod_PaymentMethodId());
		initEReference(getOrderPaymentPreference_FinAccountId(), theFinaccountPackage.getFinAccount(), null, "finAccountId", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderPaymentPreference_FinAccountId().getEKeys().add(theFinaccountPackage.getFinAccount_FinAccountId());
		initEReference(getOrderPaymentPreference_StatusId(), theStatusPackage.getStatusItem(), null, "statusId", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderPaymentPreference_StatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEReference(getOrderPaymentPreference_CreatedByUserLogin(), theLoginPackage.getUserLogin(), null, "createdByUserLogin", null, 0, 1, OrderPaymentPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderPaymentPreference_CreatedByUserLogin().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());

		initEOperation(getOrderPaymentPreference__OrderStatuss(), ecorePackage.getEString(), "orderStatuss", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrderPaymentPreference__PaymentGatewayResponses(), ecorePackage.getEString(), "paymentGatewayResponses", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrderPaymentPreference__Payments(), ecorePackage.getEString(), "payments", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrderPaymentPreference__ReturnItemResponses(), ecorePackage.getEString(), "returnItemResponses", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(orderProductPromoCodeEClass, OrderProductPromoCode.class, "OrderProductPromoCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderProductPromoCode_OrderId(), this.getOrderHeader(), null, "orderId", null, 0, 1, OrderProductPromoCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderProductPromoCode_OrderId().getEKeys().add(this.getOrderHeader_OrderId());
		initEReference(getOrderProductPromoCode_ProductPromoCodeId(), thePromoPackage.getProductPromoCode(), null, "productPromoCodeId", null, 0, 1, OrderProductPromoCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderProductPromoCode_ProductPromoCodeId().getEKeys().add(thePromoPackage.getProductPromoCode_ProductPromoCodeId());

		initEClass(orderRoleEClass, OrderRole.class, "OrderRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderRole_OrderId(), this.getOrderHeader(), null, "orderId", null, 0, 1, OrderRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderRole_OrderId().getEKeys().add(this.getOrderHeader_OrderId());
		initEReference(getOrderRole_PartyId(), thePartyPackage.getParty(), null, "partyId", null, 0, 1, OrderRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderRole_PartyId().getEKeys().add(thePartyPackage.getParty_PartyId());
		initEReference(getOrderRole_RoleTypeId(), thePartyPackage.getRoleType(), null, "roleTypeId", null, 0, 1, OrderRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderRole_RoleTypeId().getEKeys().add(thePartyPackage.getRoleType_RoleTypeId());

		initEClass(orderShipmentEClass, OrderShipment.class, "OrderShipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderShipment_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, OrderShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderShipment_ShipGroupSeqId(), ecorePackage.getEString(), "shipGroupSeqId", null, 1, 1, OrderShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderShipment_ShipmentItemSeqId(), ecorePackage.getEString(), "shipmentItemSeqId", null, 1, 1, OrderShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderShipment_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, OrderShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderShipment_OrderId(), this.getOrderHeader(), null, "orderId", null, 0, 1, OrderShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderShipment_OrderId().getEKeys().add(this.getOrderHeader_OrderId());
		initEReference(getOrderShipment_ShipmentId(), theShipment_Package.getShipment(), null, "shipmentId", null, 0, 1, OrderShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderShipment_ShipmentId().getEKeys().add(theShipment_Package.getShipment_ShipmentId());

		initEClass(orderStatusEClass, OrderStatus.class, "OrderStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderStatus_OrderStatusId(), ecorePackage.getEString(), "orderStatusId", null, 1, 1, OrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderStatus_ChangeReason(), ecorePackage.getEString(), "changeReason", null, 0, 1, OrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderStatus_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, OrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderStatus_StatusDatetime(), ecorePackage.getEDate(), "statusDatetime", null, 0, 1, OrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderStatus_StatusId(), theStatusPackage.getStatusItem(), null, "statusId", null, 0, 1, OrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderStatus_StatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEReference(getOrderStatus_OrderId(), this.getOrderHeader(), null, "orderId", null, 0, 1, OrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderStatus_OrderId().getEKeys().add(this.getOrderHeader_OrderId());
		initEReference(getOrderStatus_OrderPaymentPreferenceId(), this.getOrderPaymentPreference(), null, "orderPaymentPreferenceId", null, 0, 1, OrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderStatus_OrderPaymentPreferenceId().getEKeys().add(this.getOrderPaymentPreference_OrderPaymentPreferenceId());
		initEReference(getOrderStatus_StatusUserLogin(), theLoginPackage.getUserLogin(), null, "statusUserLogin", null, 0, 1, OrderStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderStatus_StatusUserLogin().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());

		initEClass(orderSummaryEntryEClass, OrderSummaryEntry.class, "OrderSummaryEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderSummaryEntry_EntryDate(), ecorePackage.getEDate(), "entryDate", null, 1, 1, OrderSummaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderSummaryEntry_GrossSales(), ecorePackage.getEBigDecimal(), "grossSales", null, 0, 1, OrderSummaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderSummaryEntry_ProductCost(), ecorePackage.getEBigDecimal(), "productCost", null, 0, 1, OrderSummaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderSummaryEntry_TotalQuantity(), ecorePackage.getEBigDecimal(), "totalQuantity", null, 0, 1, OrderSummaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderSummaryEntry_ProductId(), theProductPackage.getProduct(), null, "productId", null, 0, 1, OrderSummaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderSummaryEntry_ProductId().getEKeys().add(theProductPackage.getProduct_ProductId());
		initEReference(getOrderSummaryEntry_FacilityId(), theFacilityPackage.getFacility(), null, "facilityId", null, 0, 1, OrderSummaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderSummaryEntry_FacilityId().getEKeys().add(theFacilityPackage.getFacility_FacilityId());

		initEClass(orderTermEClass, OrderTerm.class, "OrderTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderTerm_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, OrderTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTerm_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTerm_TermDays(), ecorePackage.getELong(), "termDays", null, 0, 1, OrderTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTerm_TermValue(), ecorePackage.getEBigDecimal(), "termValue", null, 0, 1, OrderTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTerm_TextValue(), ecorePackage.getEString(), "textValue", null, 0, 1, OrderTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderTerm_UomId(), theUomPackage.getUom(), null, "uomId", null, 0, 1, OrderTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderTerm_UomId().getEKeys().add(theUomPackage.getUom_UomId());
		initEReference(getOrderTerm_OrderId(), this.getOrderHeader(), null, "orderId", null, 0, 1, OrderTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderTerm_OrderId().getEKeys().add(this.getOrderHeader_OrderId());
		initEReference(getOrderTerm_TermTypeId(), theAgreementPackage.getTermType(), null, "termTypeId", null, 0, 1, OrderTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderTerm_TermTypeId().getEKeys().add(theAgreementPackage.getTermType_TermTypeId());

		initEClass(orderTermAttributeEClass, OrderTermAttribute.class, "OrderTermAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderTermAttribute_TermTypeId(), ecorePackage.getEString(), "termTypeId", null, 1, 1, OrderTermAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTermAttribute_OrderId(), ecorePackage.getEString(), "orderId", null, 1, 1, OrderTermAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTermAttribute_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, OrderTermAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTermAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, OrderTermAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTermAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, OrderTermAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTermAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, OrderTermAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderTypeEClass, OrderType.class, "OrderType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderType_OrderTypeId(), ecorePackage.getEString(), "orderTypeId", null, 1, 1, OrderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderType_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, OrderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderType_ParentTypeId(), this.getOrderType(), null, "parentTypeId", null, 0, 1, OrderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderType_ParentTypeId().getEKeys().add(this.getOrderType_OrderTypeId());
		initEAttribute(getOrderType_OrderTypeAttrs(), ecorePackage.getEString(), "orderTypeAttrs", null, 0, -1, OrderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOrderType__ChildOrderTypes(), ecorePackage.getEString(), "childOrderTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrderType__OrderHeaders(), ecorePackage.getEString(), "orderHeaders", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrderType__PartyPrefDocTypeTpls(), ecorePackage.getEString(), "partyPrefDocTypeTpls", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(orderTypeAttrEClass, OrderTypeAttr.class, "OrderTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, OrderTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrderTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderTypeAttr_OrderTypeId(), this.getOrderType(), null, "orderTypeId", null, 0, 1, OrderTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOrderTypeAttr_OrderTypeId().getEKeys().add(this.getOrderType_OrderTypeId());

		initEClass(productOrderItemEClass, ProductOrderItem.class, "ProductOrderItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductOrderItem_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, ProductOrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductOrderItem_EngagementItemSeqId(), ecorePackage.getEString(), "engagementItemSeqId", null, 1, 1, ProductOrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductOrderItem_OrderId(), this.getOrderHeader(), null, "orderId", null, 0, 1, ProductOrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductOrderItem_OrderId().getEKeys().add(this.getOrderHeader_OrderId());
		initEReference(getProductOrderItem_ProductId(), theProductPackage.getProduct(), null, "productId", null, 0, 1, ProductOrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductOrderItem_ProductId().getEKeys().add(theProductPackage.getProduct_ProductId());
		initEReference(getProductOrderItem_EngagementId(), this.getOrderHeader(), null, "engagementId", null, 0, 1, ProductOrderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductOrderItem_EngagementId().getEKeys().add(this.getOrderHeader_OrderId());

		initEClass(workOrderItemFulfillmentEClass, WorkOrderItemFulfillment.class, "WorkOrderItemFulfillment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkOrderItemFulfillment_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 1, 1, WorkOrderItemFulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkOrderItemFulfillment_ShipGroupSeqId(), ecorePackage.getEString(), "shipGroupSeqId", null, 0, 1, WorkOrderItemFulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkOrderItemFulfillment_OrderId(), this.getOrderHeader(), null, "orderId", null, 0, 1, WorkOrderItemFulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkOrderItemFulfillment_OrderId().getEKeys().add(this.getOrderHeader_OrderId());
		initEReference(getWorkOrderItemFulfillment_WorkEffortId(), theWorkeffortPackage.getWorkEffort(), null, "workEffortId", null, 0, 1, WorkOrderItemFulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkOrderItemFulfillment_WorkEffortId().getEKeys().add(theWorkeffortPackage.getWorkEffort_WorkEffortId());

		// Create annotations
		// mimo-ent-frame
		createMimoentframeAnnotations();
		// mimo-ent-slot
		createMimoentslotAnnotations();
		// mimo-ent-domain
		createMimoentdomainAnnotations();
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
		  (getOrderAdjustment__ReturnAdjustments(),
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
		  (getOrderAdjustmentAttribute_AttrName(),
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
		  (getOrderAdjustmentType__ChildOrderAdjustmentTypes(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderAdjustmentType__OrderAdjustments(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderAdjustmentType__QuoteAdjustments(),
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
		  (getOrderAdjustmentTypeAttr_AttrName(),
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
		  (getOrderBlacklistType__OrderBlacklists(),
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
		  (getOrderContent_OrderItemSeqId(),
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
		  (getOrderContentType__ChildOrderContentTypes(),
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
		  (getOrderDeliverySchedule_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getOrderHeader__AcquireFixedAssets(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderHeader__GiftCardFulfillments(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderHeader__ItemIssuances(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderHeader__OrderAdjustments(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderHeader__OrderItemChanges(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderHeader__OrderItemPriceInfos(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderHeader__OrderNotifications(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderHeader__OrderPaymentPreferences(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderHeader__OrderStatuss(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderHeader__PrimaryPicklistBins(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderHeader__PrimaryShipments(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderHeader__PurchaseFixedAssetMaints(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderHeader__ReplacementReturnItemResponses(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderHeader__ReturnItems(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderHeader__ShipmentReceipts(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderHeader__Subscriptions(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderHeader__SurveyResponses(),
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
		  (getOrderItem_OrderItemSeqId(),
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
		  (getOrderItemAssocType__ChildOrderItemAssocTypes(),
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
		  (getOrderItemBilling_OrderItemSeqId(),
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
		  (getOrderItemContactMech_OrderItemSeqId(),
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
		  (getOrderItemPriceInfo_OrderItemPriceInfoId(),
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
		  (getOrderItemShipGroup_ShipGroupSeqId(),
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
		  (getOrderItemType__ChildOrderItemTypes(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderItemType__OrderItems(),
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
		  (getOrderPaymentPreference__OrderStatuss(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderPaymentPreference__PaymentGatewayResponses(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderPaymentPreference__Payments(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderPaymentPreference__ReturnItemResponses(),
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
		  (getOrderType__ChildOrderTypes(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderType__OrderHeaders(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getOrderType__PartyPrefDocTypeTpls(),
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
		  (getOrderTypeAttr_AttrName(),
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
		  (getProductOrderItem_EngagementItemSeqId(),
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
		  (getOrderAdjustment__ReturnAdjustments(),
		   source,
		   new String[] {
			   "frame", "ReturnAdjustment",
			   "route", "orderAdjustmentId"
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
		  (getOrderAdjustmentType__ChildOrderAdjustmentTypes(),
		   source,
		   new String[] {
			   "frame", "OrderAdjustmentType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderAdjustmentType__OrderAdjustments(),
		   source,
		   new String[] {
			   "frame", "OrderAdjustment",
			   "route", "orderAdjustmentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderAdjustmentType__QuoteAdjustments(),
		   source,
		   new String[] {
			   "frame", "QuoteAdjustment",
			   "route", "quoteAdjustmentTypeId"
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
		  (getOrderBlacklistType__OrderBlacklists(),
		   source,
		   new String[] {
			   "frame", "OrderBlacklist",
			   "route", "orderBlacklistTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderContentType__ChildOrderContentTypes(),
		   source,
		   new String[] {
			   "frame", "OrderContentType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader__AcquireFixedAssets(),
		   source,
		   new String[] {
			   "frame", "FixedAsset",
			   "route", "acquireOrderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader__GiftCardFulfillments(),
		   source,
		   new String[] {
			   "frame", "GiftCardFulfillment",
			   "route", "orderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader__ItemIssuances(),
		   source,
		   new String[] {
			   "frame", "ItemIssuance",
			   "route", "orderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader__OrderAdjustments(),
		   source,
		   new String[] {
			   "frame", "OrderAdjustment",
			   "route", "orderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader__OrderItemChanges(),
		   source,
		   new String[] {
			   "frame", "OrderItemChange",
			   "route", "orderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader__OrderItemPriceInfos(),
		   source,
		   new String[] {
			   "frame", "OrderItemPriceInfo",
			   "route", "orderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader__OrderNotifications(),
		   source,
		   new String[] {
			   "frame", "OrderNotification",
			   "route", "orderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader__OrderPaymentPreferences(),
		   source,
		   new String[] {
			   "frame", "OrderPaymentPreference",
			   "route", "orderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader__OrderStatuss(),
		   source,
		   new String[] {
			   "frame", "OrderStatus",
			   "route", "orderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader__PrimaryPicklistBins(),
		   source,
		   new String[] {
			   "frame", "PicklistBin",
			   "route", "primaryOrderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader__PrimaryShipments(),
		   source,
		   new String[] {
			   "frame", "Shipment",
			   "route", "primaryOrderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader__PurchaseFixedAssetMaints(),
		   source,
		   new String[] {
			   "frame", "FixedAssetMaint",
			   "route", "purchaseOrderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader__ReplacementReturnItemResponses(),
		   source,
		   new String[] {
			   "frame", "ReturnItemResponse",
			   "route", "replacementOrderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader__ReturnItems(),
		   source,
		   new String[] {
			   "frame", "ReturnItem",
			   "route", "orderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader__ShipmentReceipts(),
		   source,
		   new String[] {
			   "frame", "ShipmentReceipt",
			   "route", "orderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader__Subscriptions(),
		   source,
		   new String[] {
			   "frame", "Subscription",
			   "route", "orderId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderHeader__SurveyResponses(),
		   source,
		   new String[] {
			   "frame", "SurveyResponse",
			   "route", "orderId"
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
		  (getOrderItemAssocType__ChildOrderItemAssocTypes(),
		   source,
		   new String[] {
			   "frame", "OrderItemAssocType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemType__ChildOrderItemTypes(),
		   source,
		   new String[] {
			   "frame", "OrderItemType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderItemType__OrderItems(),
		   source,
		   new String[] {
			   "frame", "OrderItem",
			   "route", "orderItemTypeId"
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
		  (getOrderPaymentPreference__OrderStatuss(),
		   source,
		   new String[] {
			   "frame", "OrderStatus",
			   "route", "orderPaymentPreferenceId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderPaymentPreference__PaymentGatewayResponses(),
		   source,
		   new String[] {
			   "frame", "PaymentGatewayResponse",
			   "route", "orderPaymentPreferenceId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderPaymentPreference__Payments(),
		   source,
		   new String[] {
			   "frame", "Payment",
			   "route", "paymentPreferenceId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderPaymentPreference__ReturnItemResponses(),
		   source,
		   new String[] {
			   "frame", "ReturnItemResponse",
			   "route", "orderPaymentPreferenceId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderType__ChildOrderTypes(),
		   source,
		   new String[] {
			   "frame", "OrderType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderType__OrderHeaders(),
		   source,
		   new String[] {
			   "frame", "OrderHeader",
			   "route", "orderTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getOrderType__PartyPrefDocTypeTpls(),
		   source,
		   new String[] {
			   "frame", "PartyPrefDocTypeTpl",
			   "route", "orderTypeId"
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
