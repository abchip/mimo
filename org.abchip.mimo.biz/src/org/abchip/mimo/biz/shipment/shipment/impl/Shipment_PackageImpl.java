/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment.impl;

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
import org.abchip.mimo.biz.shipment.shipment.CarrierShipmentBoxType;
import org.abchip.mimo.biz.shipment.shipment.CarrierShipmentMethod;
import org.abchip.mimo.biz.shipment.shipment.Delivery;
import org.abchip.mimo.biz.shipment.shipment.Shipment;
import org.abchip.mimo.biz.shipment.shipment.ShipmentAttribute;
import org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType;
import org.abchip.mimo.biz.shipment.shipment.ShipmentContactMech;
import org.abchip.mimo.biz.shipment.shipment.ShipmentContactMechType;
import org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate;
import org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfig;
import org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfigType;
import org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl;
import org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex;
import org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps;
import org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUsps;
import org.abchip.mimo.biz.shipment.shipment.ShipmentItem;
import org.abchip.mimo.biz.shipment.shipment.ShipmentItemBilling;
import org.abchip.mimo.biz.shipment.shipment.ShipmentItemFeature;
import org.abchip.mimo.biz.shipment.shipment.ShipmentMethodType;
import org.abchip.mimo.biz.shipment.shipment.ShipmentPackage;
import org.abchip.mimo.biz.shipment.shipment.ShipmentPackageContent;
import org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg;
import org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment;
import org.abchip.mimo.biz.shipment.shipment.ShipmentStatus;
import org.abchip.mimo.biz.shipment.shipment.ShipmentTimeEstimate;
import org.abchip.mimo.biz.shipment.shipment.ShipmentType;
import org.abchip.mimo.biz.shipment.shipment.ShipmentTypeAttr;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Factory;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.abchip.mimo.biz.shipment.shipment.ShippingDocument;
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
public class Shipment_PackageImpl extends EPackageImpl implements Shipment_Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierShipmentBoxTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carrierShipmentMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deliveryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentBoxTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentContactMechEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentContactMechTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentCostEstimateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentGatewayConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentGatewayConfigTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentGatewayDhlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentGatewayFedexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentGatewayUpsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentGatewayUspsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentItemBillingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentItemFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentMethodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentPackageContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentPackageRouteSegEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentRouteSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentTimeEstimateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentTypeAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shippingDocumentEClass = null;

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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Shipment_PackageImpl() {
		super(eNS_URI, Shipment_Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Shipment_Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Shipment_Package init() {
		if (isInited) return (Shipment_Package)EPackage.Registry.INSTANCE.getEPackage(Shipment_Package.eNS_URI);

		// Obtain or create and register package
		Object registeredShipment_Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Shipment_PackageImpl theShipment_Package = registeredShipment_Package instanceof Shipment_PackageImpl ? (Shipment_PackageImpl)registeredShipment_Package : new Shipment_PackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(VisitPackage.eNS_URI);
		VisitPackageImpl theVisitPackage = (VisitPackageImpl)(registeredPackage instanceof VisitPackageImpl ? registeredPackage : VisitPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.webapp.website.WebsitePackage.eNS_URI);
		org.abchip.mimo.biz.webapp.website.impl.WebsitePackageImpl theWebsitePackage_1 = (org.abchip.mimo.biz.webapp.website.impl.WebsitePackageImpl)(registeredPackage instanceof org.abchip.mimo.biz.webapp.website.impl.WebsitePackageImpl ? registeredPackage : org.abchip.mimo.biz.webapp.website.WebsitePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TimesheetPackage.eNS_URI);
		TimesheetPackageImpl theTimesheetPackage = (TimesheetPackageImpl)(registeredPackage instanceof TimesheetPackageImpl ? registeredPackage : TimesheetPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(WorkeffortPackage.eNS_URI);
		WorkeffortPackageImpl theWorkeffortPackage = (WorkeffortPackageImpl)(registeredPackage instanceof WorkeffortPackageImpl ? registeredPackage : WorkeffortPackage.eINSTANCE);

		// Create package meta-data objects
		theShipment_Package.createPackageContents();
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
		theOrderPackage.createPackageContents();
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
		theVisitPackage.createPackageContents();
		theWebsitePackage_1.createPackageContents();
		theTimesheetPackage.createPackageContents();
		theWorkeffortPackage.createPackageContents();

		// Initialize created meta-data
		theShipment_Package.initializePackageContents();
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
		theOrderPackage.initializePackageContents();
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
		theVisitPackage.initializePackageContents();
		theWebsitePackage_1.initializePackageContents();
		theTimesheetPackage.initializePackageContents();
		theWorkeffortPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theShipment_Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Shipment_Package.eNS_URI, theShipment_Package);
		return theShipment_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCarrierShipmentBoxType() {
		return carrierShipmentBoxTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierShipmentBoxType_ShipmentBoxTypeId() {
		return (EAttribute)carrierShipmentBoxTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierShipmentBoxType_PartyId() {
		return (EAttribute)carrierShipmentBoxTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierShipmentBoxType_OversizeCode() {
		return (EAttribute)carrierShipmentBoxTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierShipmentBoxType_PackagingTypeCode() {
		return (EAttribute)carrierShipmentBoxTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCarrierShipmentMethod() {
		return carrierShipmentMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierShipmentMethod_ShipmentMethodTypeId() {
		return (EAttribute)carrierShipmentMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierShipmentMethod_PartyId() {
		return (EAttribute)carrierShipmentMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierShipmentMethod_RoleTypeId() {
		return (EAttribute)carrierShipmentMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierShipmentMethod_CarrierServiceCode() {
		return (EAttribute)carrierShipmentMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCarrierShipmentMethod_SequenceNumber() {
		return (EAttribute)carrierShipmentMethodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDelivery() {
		return deliveryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDelivery_DeliveryId() {
		return (EAttribute)deliveryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDelivery_ActualArrivalDate() {
		return (EAttribute)deliveryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDelivery_ActualStartDate() {
		return (EAttribute)deliveryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDelivery_DestFacilityId() {
		return (EAttribute)deliveryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDelivery_EndMileage() {
		return (EAttribute)deliveryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDelivery_EstimatedArrivalDate() {
		return (EAttribute)deliveryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDelivery_EstimatedStartDate() {
		return (EAttribute)deliveryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDelivery_FixedAssetId() {
		return (EAttribute)deliveryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDelivery_FuelUsed() {
		return (EAttribute)deliveryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDelivery_OriginFacilityId() {
		return (EAttribute)deliveryEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDelivery_StartMileage() {
		return (EAttribute)deliveryEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipment() {
		return shipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_ShipmentId() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_AdditionalShippingCharge() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_AddtlShippingChargeDesc() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_CreatedByUserLogin() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_CreatedDate() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_CurrencyUomId() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_DestinationContactMechId() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_DestinationFacilityId() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_DestinationTelecomNumberId() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_EstimatedArrivalDate() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_EstimatedArrivalWorkEffId() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_EstimatedReadyDate() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_EstimatedShipCost() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_EstimatedShipDate() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_EstimatedShipWorkEffId() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_HandlingInstructions() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_LastModifiedByUserLogin() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_LastModifiedDate() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_LatestCancelDate() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_OriginContactMechId() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_OriginFacilityId() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_OriginTelecomNumberId() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_PartyIdFrom() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_PartyIdTo() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_PicklistBinId() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_PrimaryOrderId() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_PrimaryReturnId() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_PrimaryShipGroupSeqId() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_ShipmentTypeId() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_StatusId() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_ShipmentAttributes() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_ShipmentContactMechs() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_ShipmentItems() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_ShipmentPackages() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_ShipmentRouteSegments() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentAttribute() {
		return shipmentAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentAttribute_ShipmentId() {
		return (EAttribute)shipmentAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentAttribute_AttrName() {
		return (EAttribute)shipmentAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentAttribute_AttrDescription() {
		return (EAttribute)shipmentAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentAttribute_AttrValue() {
		return (EAttribute)shipmentAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentBoxType() {
		return shipmentBoxTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentBoxType_ShipmentBoxTypeId() {
		return (EAttribute)shipmentBoxTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentBoxType_BoxHeight() {
		return (EAttribute)shipmentBoxTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentBoxType_BoxLength() {
		return (EAttribute)shipmentBoxTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentBoxType_BoxWeight() {
		return (EAttribute)shipmentBoxTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentBoxType_BoxWidth() {
		return (EAttribute)shipmentBoxTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentBoxType_Description() {
		return (EAttribute)shipmentBoxTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentBoxType_DimensionUomId() {
		return (EAttribute)shipmentBoxTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentBoxType_WeightUomId() {
		return (EAttribute)shipmentBoxTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentBoxType_CarrierShipmentBoxTypes() {
		return (EAttribute)shipmentBoxTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentContactMech() {
		return shipmentContactMechEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentContactMech_ShipmentId() {
		return (EAttribute)shipmentContactMechEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentContactMech_ShipmentContactMechTypeId() {
		return (EAttribute)shipmentContactMechEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentContactMech_ContactMechId() {
		return (EAttribute)shipmentContactMechEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentContactMechType() {
		return shipmentContactMechTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentContactMechType_ShipmentContactMechTypeId() {
		return (EAttribute)shipmentContactMechTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentContactMechType_Description() {
		return (EAttribute)shipmentContactMechTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentCostEstimate() {
		return shipmentCostEstimateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentCostEstimate_ShipmentCostEstimateId() {
		return (EAttribute)shipmentCostEstimateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentCostEstimate_CarrierPartyId() {
		return (EAttribute)shipmentCostEstimateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentCostEstimate_CarrierRoleTypeId() {
		return (EAttribute)shipmentCostEstimateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentCostEstimate_FeaturePercent() {
		return (EAttribute)shipmentCostEstimateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentCostEstimate_FeaturePrice() {
		return (EAttribute)shipmentCostEstimateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentCostEstimate_GeoIdFrom() {
		return (EAttribute)shipmentCostEstimateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentCostEstimate_GeoIdTo() {
		return (EAttribute)shipmentCostEstimateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentCostEstimate_OrderFlatPrice() {
		return (EAttribute)shipmentCostEstimateEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentCostEstimate_OrderItemFlatPrice() {
		return (EAttribute)shipmentCostEstimateEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentCostEstimate_OrderPricePercent() {
		return (EAttribute)shipmentCostEstimateEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentCostEstimate_OversizePrice() {
		return (EAttribute)shipmentCostEstimateEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentCostEstimate_OversizeUnit() {
		return (EAttribute)shipmentCostEstimateEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentCostEstimate_PartyId() {
		return (EAttribute)shipmentCostEstimateEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentCostEstimate_PriceBreakId() {
		return (EAttribute)shipmentCostEstimateEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentCostEstimate_PriceUnitPrice() {
		return (EAttribute)shipmentCostEstimateEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentCostEstimate_PriceUomId() {
		return (EAttribute)shipmentCostEstimateEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentCostEstimate_ProductFeatureGroupId() {
		return (EAttribute)shipmentCostEstimateEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentCostEstimate_ProductStoreId() {
		return (EAttribute)shipmentCostEstimateEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentCostEstimate_ProductStoreShipMethId() {
		return (EAttribute)shipmentCostEstimateEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentCostEstimate_QuantityBreakId() {
		return (EAttribute)shipmentCostEstimateEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentCostEstimate_QuantityUnitPrice() {
		return (EAttribute)shipmentCostEstimateEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentCostEstimate_QuantityUomId() {
		return (EAttribute)shipmentCostEstimateEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentCostEstimate_RoleTypeId() {
		return (EAttribute)shipmentCostEstimateEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentCostEstimate_ShipmentMethodTypeId() {
		return (EAttribute)shipmentCostEstimateEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentCostEstimate_ShippingPricePercent() {
		return (EAttribute)shipmentCostEstimateEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentCostEstimate_WeightBreakId() {
		return (EAttribute)shipmentCostEstimateEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentCostEstimate_WeightUnitPrice() {
		return (EAttribute)shipmentCostEstimateEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentCostEstimate_WeightUomId() {
		return (EAttribute)shipmentCostEstimateEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentGatewayConfig() {
		return shipmentGatewayConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayConfig_ShipmentGatewayConfigId() {
		return (EAttribute)shipmentGatewayConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayConfig_Description() {
		return (EAttribute)shipmentGatewayConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayConfig_ShipmentGatewayConfTypeId() {
		return (EAttribute)shipmentGatewayConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentGatewayConfigType() {
		return shipmentGatewayConfigTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayConfigType_ShipmentGatewayConfTypeId() {
		return (EAttribute)shipmentGatewayConfigTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayConfigType_Description() {
		return (EAttribute)shipmentGatewayConfigTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayConfigType_HasTable() {
		return (EAttribute)shipmentGatewayConfigTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayConfigType_ParentTypeId() {
		return (EAttribute)shipmentGatewayConfigTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentGatewayDhl() {
		return shipmentGatewayDhlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayDhl_AccessAccountNbr() {
		return (EAttribute)shipmentGatewayDhlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayDhl_AccessPassword() {
		return (EAttribute)shipmentGatewayDhlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayDhl_AccessShippingKey() {
		return (EAttribute)shipmentGatewayDhlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayDhl_AccessUserId() {
		return (EAttribute)shipmentGatewayDhlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayDhl_ConnectTimeout() {
		return (EAttribute)shipmentGatewayDhlEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayDhl_ConnectUrl() {
		return (EAttribute)shipmentGatewayDhlEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayDhl_HeadAction() {
		return (EAttribute)shipmentGatewayDhlEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayDhl_HeadVersion() {
		return (EAttribute)shipmentGatewayDhlEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayDhl_LabelImageFormat() {
		return (EAttribute)shipmentGatewayDhlEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayDhl_RateEstimateTemplate() {
		return (EAttribute)shipmentGatewayDhlEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentGatewayFedex() {
		return shipmentGatewayFedexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayFedex_AccessAccountNbr() {
		return (EAttribute)shipmentGatewayFedexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayFedex_AccessMeterNumber() {
		return (EAttribute)shipmentGatewayFedexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayFedex_AccessUserKey() {
		return (EAttribute)shipmentGatewayFedexEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayFedex_AccessUserPwd() {
		return (EAttribute)shipmentGatewayFedexEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayFedex_ConnectSoapUrl() {
		return (EAttribute)shipmentGatewayFedexEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayFedex_ConnectTimeout() {
		return (EAttribute)shipmentGatewayFedexEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayFedex_ConnectUrl() {
		return (EAttribute)shipmentGatewayFedexEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayFedex_DefaultDropoffType() {
		return (EAttribute)shipmentGatewayFedexEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayFedex_DefaultPackagingType() {
		return (EAttribute)shipmentGatewayFedexEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayFedex_LabelImageType() {
		return (EAttribute)shipmentGatewayFedexEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayFedex_RateEstimateTemplate() {
		return (EAttribute)shipmentGatewayFedexEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayFedex_TemplateShipment() {
		return (EAttribute)shipmentGatewayFedexEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayFedex_TemplateSubscription() {
		return (EAttribute)shipmentGatewayFedexEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentGatewayUps() {
		return shipmentGatewayUpsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayUps_AccessLicenseNumber() {
		return (EAttribute)shipmentGatewayUpsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayUps_AccessPassword() {
		return (EAttribute)shipmentGatewayUpsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayUps_AccessUserId() {
		return (EAttribute)shipmentGatewayUpsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayUps_BillShipperAccountNumber() {
		return (EAttribute)shipmentGatewayUpsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayUps_CodAllowCod() {
		return (EAttribute)shipmentGatewayUpsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayUps_CodFundsCode() {
		return (EAttribute)shipmentGatewayUpsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayUps_CodSurchargeAmount() {
		return (EAttribute)shipmentGatewayUpsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayUps_CodSurchargeApplyToPackage() {
		return (EAttribute)shipmentGatewayUpsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayUps_CodSurchargeCurrencyUomId() {
		return (EAttribute)shipmentGatewayUpsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayUps_ConnectTimeout() {
		return (EAttribute)shipmentGatewayUpsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayUps_ConnectUrl() {
		return (EAttribute)shipmentGatewayUpsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayUps_CustomerClassification() {
		return (EAttribute)shipmentGatewayUpsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayUps_DefaultReturnLabelMemo() {
		return (EAttribute)shipmentGatewayUpsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayUps_DefaultReturnLabelSubject() {
		return (EAttribute)shipmentGatewayUpsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayUps_MaxEstimateWeight() {
		return (EAttribute)shipmentGatewayUpsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayUps_MinEstimateWeight() {
		return (EAttribute)shipmentGatewayUpsEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayUps_SaveCertInfo() {
		return (EAttribute)shipmentGatewayUpsEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayUps_SaveCertPath() {
		return (EAttribute)shipmentGatewayUpsEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayUps_ShipperNumber() {
		return (EAttribute)shipmentGatewayUpsEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayUps_ShipperPickupType() {
		return (EAttribute)shipmentGatewayUpsEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentGatewayUsps() {
		return shipmentGatewayUspsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayUsps_AccessPassword() {
		return (EAttribute)shipmentGatewayUspsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayUsps_AccessUserId() {
		return (EAttribute)shipmentGatewayUspsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayUsps_ConnectTimeout() {
		return (EAttribute)shipmentGatewayUspsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayUsps_ConnectUrl() {
		return (EAttribute)shipmentGatewayUspsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayUsps_ConnectUrlLabels() {
		return (EAttribute)shipmentGatewayUspsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayUsps_MaxEstimateWeight() {
		return (EAttribute)shipmentGatewayUspsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentGatewayUsps_Test() {
		return (EAttribute)shipmentGatewayUspsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentItem() {
		return shipmentItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentItem_ShipmentId() {
		return (EAttribute)shipmentItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentItem_ShipmentItemSeqId() {
		return (EAttribute)shipmentItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentItem_ProductId() {
		return (EAttribute)shipmentItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentItem_Quantity() {
		return (EAttribute)shipmentItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentItem_ShipmentContentDescription() {
		return (EAttribute)shipmentItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentItemBilling() {
		return shipmentItemBillingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentItemBilling_ShipmentId() {
		return (EAttribute)shipmentItemBillingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentItemBilling_ShipmentItemSeqId() {
		return (EAttribute)shipmentItemBillingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentItemBilling_InvoiceId() {
		return (EAttribute)shipmentItemBillingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentItemBilling_InvoiceItemSeqId() {
		return (EAttribute)shipmentItemBillingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentItemFeature() {
		return shipmentItemFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentItemFeature_ShipmentId() {
		return (EAttribute)shipmentItemFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentItemFeature_ShipmentItemSeqId() {
		return (EAttribute)shipmentItemFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentItemFeature_ProductFeatureId() {
		return (EAttribute)shipmentItemFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentMethodType() {
		return shipmentMethodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentMethodType_ShipmentMethodTypeId() {
		return (EAttribute)shipmentMethodTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentMethodType_Description() {
		return (EAttribute)shipmentMethodTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentMethodType_SequenceNum() {
		return (EAttribute)shipmentMethodTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentPackage() {
		return shipmentPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackage_ShipmentId() {
		return (EAttribute)shipmentPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackage_ShipmentPackageSeqId() {
		return (EAttribute)shipmentPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackage_BoxHeight() {
		return (EAttribute)shipmentPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackage_BoxLength() {
		return (EAttribute)shipmentPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackage_BoxWidth() {
		return (EAttribute)shipmentPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackage_DateCreated() {
		return (EAttribute)shipmentPackageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackage_DimensionUomId() {
		return (EAttribute)shipmentPackageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackage_InsuredValue() {
		return (EAttribute)shipmentPackageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackage_ShipmentBoxTypeId() {
		return (EAttribute)shipmentPackageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackage_Weight() {
		return (EAttribute)shipmentPackageEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackage_WeightUomId() {
		return (EAttribute)shipmentPackageEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentPackageContent() {
		return shipmentPackageContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackageContent_ShipmentId() {
		return (EAttribute)shipmentPackageContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackageContent_ShipmentPackageSeqId() {
		return (EAttribute)shipmentPackageContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackageContent_ShipmentItemSeqId() {
		return (EAttribute)shipmentPackageContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackageContent_Quantity() {
		return (EAttribute)shipmentPackageContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackageContent_SubProductId() {
		return (EAttribute)shipmentPackageContentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackageContent_SubProductQuantity() {
		return (EAttribute)shipmentPackageContentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentPackageRouteSeg() {
		return shipmentPackageRouteSegEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackageRouteSeg_ShipmentId() {
		return (EAttribute)shipmentPackageRouteSegEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackageRouteSeg_ShipmentPackageSeqId() {
		return (EAttribute)shipmentPackageRouteSegEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackageRouteSeg_ShipmentRouteSegmentId() {
		return (EAttribute)shipmentPackageRouteSegEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackageRouteSeg_BoxNumber() {
		return (EAttribute)shipmentPackageRouteSegEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackageRouteSeg_CodAmount() {
		return (EAttribute)shipmentPackageRouteSegEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackageRouteSeg_CurrencyUomId() {
		return (EAttribute)shipmentPackageRouteSegEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackageRouteSeg_InsuredAmount() {
		return (EAttribute)shipmentPackageRouteSegEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackageRouteSeg_InternationalInvoice() {
		return (EAttribute)shipmentPackageRouteSegEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackageRouteSeg_LabelHtml() {
		return (EAttribute)shipmentPackageRouteSegEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackageRouteSeg_LabelImage() {
		return (EAttribute)shipmentPackageRouteSegEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackageRouteSeg_LabelIntlSignImage() {
		return (EAttribute)shipmentPackageRouteSegEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackageRouteSeg_LabelPrinted() {
		return (EAttribute)shipmentPackageRouteSegEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackageRouteSeg_PackageOtherCost() {
		return (EAttribute)shipmentPackageRouteSegEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackageRouteSeg_PackageServiceCost() {
		return (EAttribute)shipmentPackageRouteSegEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackageRouteSeg_PackageTransportCost() {
		return (EAttribute)shipmentPackageRouteSegEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPackageRouteSeg_TrackingCode() {
		return (EAttribute)shipmentPackageRouteSegEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentRouteSegment() {
		return shipmentRouteSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_ShipmentId() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_ShipmentRouteSegmentId() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_ActualArrivalDate() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_ActualCost() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_ActualOtherCost() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_ActualServiceCost() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_ActualStartDate() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_ActualTransportCost() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_BillingWeight() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_BillingWeightUomId() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_CarrierDeliveryZone() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_CarrierPartyId() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_CarrierRestrictionCodes() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_CarrierRestrictionDesc() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_CarrierServiceStatusId() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_CurrencyUomId() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_DeliveryId() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_DestContactMechId() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_DestFacilityId() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_DestTelecomNumberId() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_EstimatedArrivalDate() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_EstimatedStartDate() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_HomeDeliveryDate() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_HomeDeliveryType() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_LastUpdatedDate() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_OriginContactMechId() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_OriginFacilityId() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_OriginTelecomNumberId() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_ShipmentMethodTypeId() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_ThirdPartyAccountNumber() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_ThirdPartyCountryGeoCode() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_ThirdPartyPostalCode() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_TrackingDigest() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_TrackingIdNumber() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_UpdatedByUserLoginId() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentRouteSegment_UpsHighValueReport() {
		return (EAttribute)shipmentRouteSegmentEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentStatus() {
		return shipmentStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentStatus_StatusId() {
		return (EAttribute)shipmentStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentStatus_ShipmentId() {
		return (EAttribute)shipmentStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentStatus_ChangeByUserLoginId() {
		return (EAttribute)shipmentStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentStatus_StatusDate() {
		return (EAttribute)shipmentStatusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentTimeEstimate() {
		return shipmentTimeEstimateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentTimeEstimate_ShipmentMethodTypeId() {
		return (EAttribute)shipmentTimeEstimateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentTimeEstimate_PartyId() {
		return (EAttribute)shipmentTimeEstimateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentTimeEstimate_RoleTypeId() {
		return (EAttribute)shipmentTimeEstimateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentTimeEstimate_GeoIdTo() {
		return (EAttribute)shipmentTimeEstimateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentTimeEstimate_GeoIdFrom() {
		return (EAttribute)shipmentTimeEstimateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentTimeEstimate_FromDate() {
		return (EAttribute)shipmentTimeEstimateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentTimeEstimate_LeadTime() {
		return (EAttribute)shipmentTimeEstimateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentTimeEstimate_LeadTimeUomId() {
		return (EAttribute)shipmentTimeEstimateEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentTimeEstimate_SequenceNumber() {
		return (EAttribute)shipmentTimeEstimateEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentTimeEstimate_ThruDate() {
		return (EAttribute)shipmentTimeEstimateEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentType() {
		return shipmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentType_ShipmentTypeId() {
		return (EAttribute)shipmentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentType_Description() {
		return (EAttribute)shipmentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentType_HasTable() {
		return (EAttribute)shipmentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentType_ParentTypeId() {
		return (EAttribute)shipmentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentType_ShipmentTypeAttrs() {
		return (EAttribute)shipmentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentTypeAttr() {
		return shipmentTypeAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentTypeAttr_ShipmentTypeId() {
		return (EAttribute)shipmentTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentTypeAttr_AttrName() {
		return (EAttribute)shipmentTypeAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentTypeAttr_Description() {
		return (EAttribute)shipmentTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShippingDocument() {
		return shippingDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShippingDocument_Description() {
		return (EAttribute)shippingDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShippingDocument_ShipmentId() {
		return (EAttribute)shippingDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShippingDocument_ShipmentItemSeqId() {
		return (EAttribute)shippingDocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShippingDocument_ShipmentPackageSeqId() {
		return (EAttribute)shippingDocumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shipment_Factory getShipment_Factory() {
		return (Shipment_Factory)getEFactoryInstance();
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
		carrierShipmentBoxTypeEClass = createEClass(CARRIER_SHIPMENT_BOX_TYPE);
		createEAttribute(carrierShipmentBoxTypeEClass, CARRIER_SHIPMENT_BOX_TYPE__SHIPMENT_BOX_TYPE_ID);
		createEAttribute(carrierShipmentBoxTypeEClass, CARRIER_SHIPMENT_BOX_TYPE__PARTY_ID);
		createEAttribute(carrierShipmentBoxTypeEClass, CARRIER_SHIPMENT_BOX_TYPE__OVERSIZE_CODE);
		createEAttribute(carrierShipmentBoxTypeEClass, CARRIER_SHIPMENT_BOX_TYPE__PACKAGING_TYPE_CODE);

		carrierShipmentMethodEClass = createEClass(CARRIER_SHIPMENT_METHOD);
		createEAttribute(carrierShipmentMethodEClass, CARRIER_SHIPMENT_METHOD__SHIPMENT_METHOD_TYPE_ID);
		createEAttribute(carrierShipmentMethodEClass, CARRIER_SHIPMENT_METHOD__PARTY_ID);
		createEAttribute(carrierShipmentMethodEClass, CARRIER_SHIPMENT_METHOD__ROLE_TYPE_ID);
		createEAttribute(carrierShipmentMethodEClass, CARRIER_SHIPMENT_METHOD__CARRIER_SERVICE_CODE);
		createEAttribute(carrierShipmentMethodEClass, CARRIER_SHIPMENT_METHOD__SEQUENCE_NUMBER);

		deliveryEClass = createEClass(DELIVERY);
		createEAttribute(deliveryEClass, DELIVERY__DELIVERY_ID);
		createEAttribute(deliveryEClass, DELIVERY__ACTUAL_ARRIVAL_DATE);
		createEAttribute(deliveryEClass, DELIVERY__ACTUAL_START_DATE);
		createEAttribute(deliveryEClass, DELIVERY__DEST_FACILITY_ID);
		createEAttribute(deliveryEClass, DELIVERY__END_MILEAGE);
		createEAttribute(deliveryEClass, DELIVERY__ESTIMATED_ARRIVAL_DATE);
		createEAttribute(deliveryEClass, DELIVERY__ESTIMATED_START_DATE);
		createEAttribute(deliveryEClass, DELIVERY__FIXED_ASSET_ID);
		createEAttribute(deliveryEClass, DELIVERY__FUEL_USED);
		createEAttribute(deliveryEClass, DELIVERY__ORIGIN_FACILITY_ID);
		createEAttribute(deliveryEClass, DELIVERY__START_MILEAGE);

		shipmentEClass = createEClass(SHIPMENT);
		createEAttribute(shipmentEClass, SHIPMENT__SHIPMENT_ID);
		createEAttribute(shipmentEClass, SHIPMENT__ADDITIONAL_SHIPPING_CHARGE);
		createEAttribute(shipmentEClass, SHIPMENT__ADDTL_SHIPPING_CHARGE_DESC);
		createEAttribute(shipmentEClass, SHIPMENT__CREATED_BY_USER_LOGIN);
		createEAttribute(shipmentEClass, SHIPMENT__CREATED_DATE);
		createEAttribute(shipmentEClass, SHIPMENT__CURRENCY_UOM_ID);
		createEAttribute(shipmentEClass, SHIPMENT__DESTINATION_CONTACT_MECH_ID);
		createEAttribute(shipmentEClass, SHIPMENT__DESTINATION_FACILITY_ID);
		createEAttribute(shipmentEClass, SHIPMENT__DESTINATION_TELECOM_NUMBER_ID);
		createEAttribute(shipmentEClass, SHIPMENT__ESTIMATED_ARRIVAL_DATE);
		createEAttribute(shipmentEClass, SHIPMENT__ESTIMATED_ARRIVAL_WORK_EFF_ID);
		createEAttribute(shipmentEClass, SHIPMENT__ESTIMATED_READY_DATE);
		createEAttribute(shipmentEClass, SHIPMENT__ESTIMATED_SHIP_COST);
		createEAttribute(shipmentEClass, SHIPMENT__ESTIMATED_SHIP_DATE);
		createEAttribute(shipmentEClass, SHIPMENT__ESTIMATED_SHIP_WORK_EFF_ID);
		createEAttribute(shipmentEClass, SHIPMENT__HANDLING_INSTRUCTIONS);
		createEAttribute(shipmentEClass, SHIPMENT__LAST_MODIFIED_BY_USER_LOGIN);
		createEAttribute(shipmentEClass, SHIPMENT__LAST_MODIFIED_DATE);
		createEAttribute(shipmentEClass, SHIPMENT__LATEST_CANCEL_DATE);
		createEAttribute(shipmentEClass, SHIPMENT__ORIGIN_CONTACT_MECH_ID);
		createEAttribute(shipmentEClass, SHIPMENT__ORIGIN_FACILITY_ID);
		createEAttribute(shipmentEClass, SHIPMENT__ORIGIN_TELECOM_NUMBER_ID);
		createEAttribute(shipmentEClass, SHIPMENT__PARTY_ID_FROM);
		createEAttribute(shipmentEClass, SHIPMENT__PARTY_ID_TO);
		createEAttribute(shipmentEClass, SHIPMENT__PICKLIST_BIN_ID);
		createEAttribute(shipmentEClass, SHIPMENT__PRIMARY_ORDER_ID);
		createEAttribute(shipmentEClass, SHIPMENT__PRIMARY_RETURN_ID);
		createEAttribute(shipmentEClass, SHIPMENT__PRIMARY_SHIP_GROUP_SEQ_ID);
		createEAttribute(shipmentEClass, SHIPMENT__SHIPMENT_TYPE_ID);
		createEAttribute(shipmentEClass, SHIPMENT__STATUS_ID);
		createEAttribute(shipmentEClass, SHIPMENT__SHIPMENT_ATTRIBUTES);
		createEAttribute(shipmentEClass, SHIPMENT__SHIPMENT_CONTACT_MECHS);
		createEAttribute(shipmentEClass, SHIPMENT__SHIPMENT_ITEMS);
		createEAttribute(shipmentEClass, SHIPMENT__SHIPMENT_PACKAGES);
		createEAttribute(shipmentEClass, SHIPMENT__SHIPMENT_ROUTE_SEGMENTS);

		shipmentAttributeEClass = createEClass(SHIPMENT_ATTRIBUTE);
		createEAttribute(shipmentAttributeEClass, SHIPMENT_ATTRIBUTE__SHIPMENT_ID);
		createEAttribute(shipmentAttributeEClass, SHIPMENT_ATTRIBUTE__ATTR_NAME);
		createEAttribute(shipmentAttributeEClass, SHIPMENT_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(shipmentAttributeEClass, SHIPMENT_ATTRIBUTE__ATTR_VALUE);

		shipmentBoxTypeEClass = createEClass(SHIPMENT_BOX_TYPE);
		createEAttribute(shipmentBoxTypeEClass, SHIPMENT_BOX_TYPE__SHIPMENT_BOX_TYPE_ID);
		createEAttribute(shipmentBoxTypeEClass, SHIPMENT_BOX_TYPE__BOX_HEIGHT);
		createEAttribute(shipmentBoxTypeEClass, SHIPMENT_BOX_TYPE__BOX_LENGTH);
		createEAttribute(shipmentBoxTypeEClass, SHIPMENT_BOX_TYPE__BOX_WEIGHT);
		createEAttribute(shipmentBoxTypeEClass, SHIPMENT_BOX_TYPE__BOX_WIDTH);
		createEAttribute(shipmentBoxTypeEClass, SHIPMENT_BOX_TYPE__DESCRIPTION);
		createEAttribute(shipmentBoxTypeEClass, SHIPMENT_BOX_TYPE__DIMENSION_UOM_ID);
		createEAttribute(shipmentBoxTypeEClass, SHIPMENT_BOX_TYPE__WEIGHT_UOM_ID);
		createEAttribute(shipmentBoxTypeEClass, SHIPMENT_BOX_TYPE__CARRIER_SHIPMENT_BOX_TYPES);

		shipmentContactMechEClass = createEClass(SHIPMENT_CONTACT_MECH);
		createEAttribute(shipmentContactMechEClass, SHIPMENT_CONTACT_MECH__SHIPMENT_ID);
		createEAttribute(shipmentContactMechEClass, SHIPMENT_CONTACT_MECH__SHIPMENT_CONTACT_MECH_TYPE_ID);
		createEAttribute(shipmentContactMechEClass, SHIPMENT_CONTACT_MECH__CONTACT_MECH_ID);

		shipmentContactMechTypeEClass = createEClass(SHIPMENT_CONTACT_MECH_TYPE);
		createEAttribute(shipmentContactMechTypeEClass, SHIPMENT_CONTACT_MECH_TYPE__SHIPMENT_CONTACT_MECH_TYPE_ID);
		createEAttribute(shipmentContactMechTypeEClass, SHIPMENT_CONTACT_MECH_TYPE__DESCRIPTION);

		shipmentCostEstimateEClass = createEClass(SHIPMENT_COST_ESTIMATE);
		createEAttribute(shipmentCostEstimateEClass, SHIPMENT_COST_ESTIMATE__SHIPMENT_COST_ESTIMATE_ID);
		createEAttribute(shipmentCostEstimateEClass, SHIPMENT_COST_ESTIMATE__CARRIER_PARTY_ID);
		createEAttribute(shipmentCostEstimateEClass, SHIPMENT_COST_ESTIMATE__CARRIER_ROLE_TYPE_ID);
		createEAttribute(shipmentCostEstimateEClass, SHIPMENT_COST_ESTIMATE__FEATURE_PERCENT);
		createEAttribute(shipmentCostEstimateEClass, SHIPMENT_COST_ESTIMATE__FEATURE_PRICE);
		createEAttribute(shipmentCostEstimateEClass, SHIPMENT_COST_ESTIMATE__GEO_ID_FROM);
		createEAttribute(shipmentCostEstimateEClass, SHIPMENT_COST_ESTIMATE__GEO_ID_TO);
		createEAttribute(shipmentCostEstimateEClass, SHIPMENT_COST_ESTIMATE__ORDER_FLAT_PRICE);
		createEAttribute(shipmentCostEstimateEClass, SHIPMENT_COST_ESTIMATE__ORDER_ITEM_FLAT_PRICE);
		createEAttribute(shipmentCostEstimateEClass, SHIPMENT_COST_ESTIMATE__ORDER_PRICE_PERCENT);
		createEAttribute(shipmentCostEstimateEClass, SHIPMENT_COST_ESTIMATE__OVERSIZE_PRICE);
		createEAttribute(shipmentCostEstimateEClass, SHIPMENT_COST_ESTIMATE__OVERSIZE_UNIT);
		createEAttribute(shipmentCostEstimateEClass, SHIPMENT_COST_ESTIMATE__PARTY_ID);
		createEAttribute(shipmentCostEstimateEClass, SHIPMENT_COST_ESTIMATE__PRICE_BREAK_ID);
		createEAttribute(shipmentCostEstimateEClass, SHIPMENT_COST_ESTIMATE__PRICE_UNIT_PRICE);
		createEAttribute(shipmentCostEstimateEClass, SHIPMENT_COST_ESTIMATE__PRICE_UOM_ID);
		createEAttribute(shipmentCostEstimateEClass, SHIPMENT_COST_ESTIMATE__PRODUCT_FEATURE_GROUP_ID);
		createEAttribute(shipmentCostEstimateEClass, SHIPMENT_COST_ESTIMATE__PRODUCT_STORE_ID);
		createEAttribute(shipmentCostEstimateEClass, SHIPMENT_COST_ESTIMATE__PRODUCT_STORE_SHIP_METH_ID);
		createEAttribute(shipmentCostEstimateEClass, SHIPMENT_COST_ESTIMATE__QUANTITY_BREAK_ID);
		createEAttribute(shipmentCostEstimateEClass, SHIPMENT_COST_ESTIMATE__QUANTITY_UNIT_PRICE);
		createEAttribute(shipmentCostEstimateEClass, SHIPMENT_COST_ESTIMATE__QUANTITY_UOM_ID);
		createEAttribute(shipmentCostEstimateEClass, SHIPMENT_COST_ESTIMATE__ROLE_TYPE_ID);
		createEAttribute(shipmentCostEstimateEClass, SHIPMENT_COST_ESTIMATE__SHIPMENT_METHOD_TYPE_ID);
		createEAttribute(shipmentCostEstimateEClass, SHIPMENT_COST_ESTIMATE__SHIPPING_PRICE_PERCENT);
		createEAttribute(shipmentCostEstimateEClass, SHIPMENT_COST_ESTIMATE__WEIGHT_BREAK_ID);
		createEAttribute(shipmentCostEstimateEClass, SHIPMENT_COST_ESTIMATE__WEIGHT_UNIT_PRICE);
		createEAttribute(shipmentCostEstimateEClass, SHIPMENT_COST_ESTIMATE__WEIGHT_UOM_ID);

		shipmentGatewayConfigEClass = createEClass(SHIPMENT_GATEWAY_CONFIG);
		createEAttribute(shipmentGatewayConfigEClass, SHIPMENT_GATEWAY_CONFIG__SHIPMENT_GATEWAY_CONFIG_ID);
		createEAttribute(shipmentGatewayConfigEClass, SHIPMENT_GATEWAY_CONFIG__DESCRIPTION);
		createEAttribute(shipmentGatewayConfigEClass, SHIPMENT_GATEWAY_CONFIG__SHIPMENT_GATEWAY_CONF_TYPE_ID);

		shipmentGatewayConfigTypeEClass = createEClass(SHIPMENT_GATEWAY_CONFIG_TYPE);
		createEAttribute(shipmentGatewayConfigTypeEClass, SHIPMENT_GATEWAY_CONFIG_TYPE__SHIPMENT_GATEWAY_CONF_TYPE_ID);
		createEAttribute(shipmentGatewayConfigTypeEClass, SHIPMENT_GATEWAY_CONFIG_TYPE__DESCRIPTION);
		createEAttribute(shipmentGatewayConfigTypeEClass, SHIPMENT_GATEWAY_CONFIG_TYPE__HAS_TABLE);
		createEAttribute(shipmentGatewayConfigTypeEClass, SHIPMENT_GATEWAY_CONFIG_TYPE__PARENT_TYPE_ID);

		shipmentGatewayDhlEClass = createEClass(SHIPMENT_GATEWAY_DHL);
		createEAttribute(shipmentGatewayDhlEClass, SHIPMENT_GATEWAY_DHL__ACCESS_ACCOUNT_NBR);
		createEAttribute(shipmentGatewayDhlEClass, SHIPMENT_GATEWAY_DHL__ACCESS_PASSWORD);
		createEAttribute(shipmentGatewayDhlEClass, SHIPMENT_GATEWAY_DHL__ACCESS_SHIPPING_KEY);
		createEAttribute(shipmentGatewayDhlEClass, SHIPMENT_GATEWAY_DHL__ACCESS_USER_ID);
		createEAttribute(shipmentGatewayDhlEClass, SHIPMENT_GATEWAY_DHL__CONNECT_TIMEOUT);
		createEAttribute(shipmentGatewayDhlEClass, SHIPMENT_GATEWAY_DHL__CONNECT_URL);
		createEAttribute(shipmentGatewayDhlEClass, SHIPMENT_GATEWAY_DHL__HEAD_ACTION);
		createEAttribute(shipmentGatewayDhlEClass, SHIPMENT_GATEWAY_DHL__HEAD_VERSION);
		createEAttribute(shipmentGatewayDhlEClass, SHIPMENT_GATEWAY_DHL__LABEL_IMAGE_FORMAT);
		createEAttribute(shipmentGatewayDhlEClass, SHIPMENT_GATEWAY_DHL__RATE_ESTIMATE_TEMPLATE);

		shipmentGatewayFedexEClass = createEClass(SHIPMENT_GATEWAY_FEDEX);
		createEAttribute(shipmentGatewayFedexEClass, SHIPMENT_GATEWAY_FEDEX__ACCESS_ACCOUNT_NBR);
		createEAttribute(shipmentGatewayFedexEClass, SHIPMENT_GATEWAY_FEDEX__ACCESS_METER_NUMBER);
		createEAttribute(shipmentGatewayFedexEClass, SHIPMENT_GATEWAY_FEDEX__ACCESS_USER_KEY);
		createEAttribute(shipmentGatewayFedexEClass, SHIPMENT_GATEWAY_FEDEX__ACCESS_USER_PWD);
		createEAttribute(shipmentGatewayFedexEClass, SHIPMENT_GATEWAY_FEDEX__CONNECT_SOAP_URL);
		createEAttribute(shipmentGatewayFedexEClass, SHIPMENT_GATEWAY_FEDEX__CONNECT_TIMEOUT);
		createEAttribute(shipmentGatewayFedexEClass, SHIPMENT_GATEWAY_FEDEX__CONNECT_URL);
		createEAttribute(shipmentGatewayFedexEClass, SHIPMENT_GATEWAY_FEDEX__DEFAULT_DROPOFF_TYPE);
		createEAttribute(shipmentGatewayFedexEClass, SHIPMENT_GATEWAY_FEDEX__DEFAULT_PACKAGING_TYPE);
		createEAttribute(shipmentGatewayFedexEClass, SHIPMENT_GATEWAY_FEDEX__LABEL_IMAGE_TYPE);
		createEAttribute(shipmentGatewayFedexEClass, SHIPMENT_GATEWAY_FEDEX__RATE_ESTIMATE_TEMPLATE);
		createEAttribute(shipmentGatewayFedexEClass, SHIPMENT_GATEWAY_FEDEX__TEMPLATE_SHIPMENT);
		createEAttribute(shipmentGatewayFedexEClass, SHIPMENT_GATEWAY_FEDEX__TEMPLATE_SUBSCRIPTION);

		shipmentGatewayUpsEClass = createEClass(SHIPMENT_GATEWAY_UPS);
		createEAttribute(shipmentGatewayUpsEClass, SHIPMENT_GATEWAY_UPS__ACCESS_LICENSE_NUMBER);
		createEAttribute(shipmentGatewayUpsEClass, SHIPMENT_GATEWAY_UPS__ACCESS_PASSWORD);
		createEAttribute(shipmentGatewayUpsEClass, SHIPMENT_GATEWAY_UPS__ACCESS_USER_ID);
		createEAttribute(shipmentGatewayUpsEClass, SHIPMENT_GATEWAY_UPS__BILL_SHIPPER_ACCOUNT_NUMBER);
		createEAttribute(shipmentGatewayUpsEClass, SHIPMENT_GATEWAY_UPS__COD_ALLOW_COD);
		createEAttribute(shipmentGatewayUpsEClass, SHIPMENT_GATEWAY_UPS__COD_FUNDS_CODE);
		createEAttribute(shipmentGatewayUpsEClass, SHIPMENT_GATEWAY_UPS__COD_SURCHARGE_AMOUNT);
		createEAttribute(shipmentGatewayUpsEClass, SHIPMENT_GATEWAY_UPS__COD_SURCHARGE_APPLY_TO_PACKAGE);
		createEAttribute(shipmentGatewayUpsEClass, SHIPMENT_GATEWAY_UPS__COD_SURCHARGE_CURRENCY_UOM_ID);
		createEAttribute(shipmentGatewayUpsEClass, SHIPMENT_GATEWAY_UPS__CONNECT_TIMEOUT);
		createEAttribute(shipmentGatewayUpsEClass, SHIPMENT_GATEWAY_UPS__CONNECT_URL);
		createEAttribute(shipmentGatewayUpsEClass, SHIPMENT_GATEWAY_UPS__CUSTOMER_CLASSIFICATION);
		createEAttribute(shipmentGatewayUpsEClass, SHIPMENT_GATEWAY_UPS__DEFAULT_RETURN_LABEL_MEMO);
		createEAttribute(shipmentGatewayUpsEClass, SHIPMENT_GATEWAY_UPS__DEFAULT_RETURN_LABEL_SUBJECT);
		createEAttribute(shipmentGatewayUpsEClass, SHIPMENT_GATEWAY_UPS__MAX_ESTIMATE_WEIGHT);
		createEAttribute(shipmentGatewayUpsEClass, SHIPMENT_GATEWAY_UPS__MIN_ESTIMATE_WEIGHT);
		createEAttribute(shipmentGatewayUpsEClass, SHIPMENT_GATEWAY_UPS__SAVE_CERT_INFO);
		createEAttribute(shipmentGatewayUpsEClass, SHIPMENT_GATEWAY_UPS__SAVE_CERT_PATH);
		createEAttribute(shipmentGatewayUpsEClass, SHIPMENT_GATEWAY_UPS__SHIPPER_NUMBER);
		createEAttribute(shipmentGatewayUpsEClass, SHIPMENT_GATEWAY_UPS__SHIPPER_PICKUP_TYPE);

		shipmentGatewayUspsEClass = createEClass(SHIPMENT_GATEWAY_USPS);
		createEAttribute(shipmentGatewayUspsEClass, SHIPMENT_GATEWAY_USPS__ACCESS_PASSWORD);
		createEAttribute(shipmentGatewayUspsEClass, SHIPMENT_GATEWAY_USPS__ACCESS_USER_ID);
		createEAttribute(shipmentGatewayUspsEClass, SHIPMENT_GATEWAY_USPS__CONNECT_TIMEOUT);
		createEAttribute(shipmentGatewayUspsEClass, SHIPMENT_GATEWAY_USPS__CONNECT_URL);
		createEAttribute(shipmentGatewayUspsEClass, SHIPMENT_GATEWAY_USPS__CONNECT_URL_LABELS);
		createEAttribute(shipmentGatewayUspsEClass, SHIPMENT_GATEWAY_USPS__MAX_ESTIMATE_WEIGHT);
		createEAttribute(shipmentGatewayUspsEClass, SHIPMENT_GATEWAY_USPS__TEST);

		shipmentItemEClass = createEClass(SHIPMENT_ITEM);
		createEAttribute(shipmentItemEClass, SHIPMENT_ITEM__SHIPMENT_ID);
		createEAttribute(shipmentItemEClass, SHIPMENT_ITEM__SHIPMENT_ITEM_SEQ_ID);
		createEAttribute(shipmentItemEClass, SHIPMENT_ITEM__PRODUCT_ID);
		createEAttribute(shipmentItemEClass, SHIPMENT_ITEM__QUANTITY);
		createEAttribute(shipmentItemEClass, SHIPMENT_ITEM__SHIPMENT_CONTENT_DESCRIPTION);

		shipmentItemBillingEClass = createEClass(SHIPMENT_ITEM_BILLING);
		createEAttribute(shipmentItemBillingEClass, SHIPMENT_ITEM_BILLING__SHIPMENT_ID);
		createEAttribute(shipmentItemBillingEClass, SHIPMENT_ITEM_BILLING__SHIPMENT_ITEM_SEQ_ID);
		createEAttribute(shipmentItemBillingEClass, SHIPMENT_ITEM_BILLING__INVOICE_ID);
		createEAttribute(shipmentItemBillingEClass, SHIPMENT_ITEM_BILLING__INVOICE_ITEM_SEQ_ID);

		shipmentItemFeatureEClass = createEClass(SHIPMENT_ITEM_FEATURE);
		createEAttribute(shipmentItemFeatureEClass, SHIPMENT_ITEM_FEATURE__SHIPMENT_ID);
		createEAttribute(shipmentItemFeatureEClass, SHIPMENT_ITEM_FEATURE__SHIPMENT_ITEM_SEQ_ID);
		createEAttribute(shipmentItemFeatureEClass, SHIPMENT_ITEM_FEATURE__PRODUCT_FEATURE_ID);

		shipmentMethodTypeEClass = createEClass(SHIPMENT_METHOD_TYPE);
		createEAttribute(shipmentMethodTypeEClass, SHIPMENT_METHOD_TYPE__SHIPMENT_METHOD_TYPE_ID);
		createEAttribute(shipmentMethodTypeEClass, SHIPMENT_METHOD_TYPE__DESCRIPTION);
		createEAttribute(shipmentMethodTypeEClass, SHIPMENT_METHOD_TYPE__SEQUENCE_NUM);

		shipmentPackageEClass = createEClass(SHIPMENT_PACKAGE);
		createEAttribute(shipmentPackageEClass, SHIPMENT_PACKAGE__SHIPMENT_ID);
		createEAttribute(shipmentPackageEClass, SHIPMENT_PACKAGE__SHIPMENT_PACKAGE_SEQ_ID);
		createEAttribute(shipmentPackageEClass, SHIPMENT_PACKAGE__BOX_HEIGHT);
		createEAttribute(shipmentPackageEClass, SHIPMENT_PACKAGE__BOX_LENGTH);
		createEAttribute(shipmentPackageEClass, SHIPMENT_PACKAGE__BOX_WIDTH);
		createEAttribute(shipmentPackageEClass, SHIPMENT_PACKAGE__DATE_CREATED);
		createEAttribute(shipmentPackageEClass, SHIPMENT_PACKAGE__DIMENSION_UOM_ID);
		createEAttribute(shipmentPackageEClass, SHIPMENT_PACKAGE__INSURED_VALUE);
		createEAttribute(shipmentPackageEClass, SHIPMENT_PACKAGE__SHIPMENT_BOX_TYPE_ID);
		createEAttribute(shipmentPackageEClass, SHIPMENT_PACKAGE__WEIGHT);
		createEAttribute(shipmentPackageEClass, SHIPMENT_PACKAGE__WEIGHT_UOM_ID);

		shipmentPackageContentEClass = createEClass(SHIPMENT_PACKAGE_CONTENT);
		createEAttribute(shipmentPackageContentEClass, SHIPMENT_PACKAGE_CONTENT__SHIPMENT_ID);
		createEAttribute(shipmentPackageContentEClass, SHIPMENT_PACKAGE_CONTENT__SHIPMENT_PACKAGE_SEQ_ID);
		createEAttribute(shipmentPackageContentEClass, SHIPMENT_PACKAGE_CONTENT__SHIPMENT_ITEM_SEQ_ID);
		createEAttribute(shipmentPackageContentEClass, SHIPMENT_PACKAGE_CONTENT__QUANTITY);
		createEAttribute(shipmentPackageContentEClass, SHIPMENT_PACKAGE_CONTENT__SUB_PRODUCT_ID);
		createEAttribute(shipmentPackageContentEClass, SHIPMENT_PACKAGE_CONTENT__SUB_PRODUCT_QUANTITY);

		shipmentPackageRouteSegEClass = createEClass(SHIPMENT_PACKAGE_ROUTE_SEG);
		createEAttribute(shipmentPackageRouteSegEClass, SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_ID);
		createEAttribute(shipmentPackageRouteSegEClass, SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_PACKAGE_SEQ_ID);
		createEAttribute(shipmentPackageRouteSegEClass, SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_ROUTE_SEGMENT_ID);
		createEAttribute(shipmentPackageRouteSegEClass, SHIPMENT_PACKAGE_ROUTE_SEG__BOX_NUMBER);
		createEAttribute(shipmentPackageRouteSegEClass, SHIPMENT_PACKAGE_ROUTE_SEG__COD_AMOUNT);
		createEAttribute(shipmentPackageRouteSegEClass, SHIPMENT_PACKAGE_ROUTE_SEG__CURRENCY_UOM_ID);
		createEAttribute(shipmentPackageRouteSegEClass, SHIPMENT_PACKAGE_ROUTE_SEG__INSURED_AMOUNT);
		createEAttribute(shipmentPackageRouteSegEClass, SHIPMENT_PACKAGE_ROUTE_SEG__INTERNATIONAL_INVOICE);
		createEAttribute(shipmentPackageRouteSegEClass, SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_HTML);
		createEAttribute(shipmentPackageRouteSegEClass, SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_IMAGE);
		createEAttribute(shipmentPackageRouteSegEClass, SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_INTL_SIGN_IMAGE);
		createEAttribute(shipmentPackageRouteSegEClass, SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_PRINTED);
		createEAttribute(shipmentPackageRouteSegEClass, SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_OTHER_COST);
		createEAttribute(shipmentPackageRouteSegEClass, SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_SERVICE_COST);
		createEAttribute(shipmentPackageRouteSegEClass, SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_TRANSPORT_COST);
		createEAttribute(shipmentPackageRouteSegEClass, SHIPMENT_PACKAGE_ROUTE_SEG__TRACKING_CODE);

		shipmentRouteSegmentEClass = createEClass(SHIPMENT_ROUTE_SEGMENT);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__SHIPMENT_ID);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__SHIPMENT_ROUTE_SEGMENT_ID);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__ACTUAL_ARRIVAL_DATE);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__ACTUAL_COST);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__ACTUAL_OTHER_COST);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__ACTUAL_SERVICE_COST);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__ACTUAL_START_DATE);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__ACTUAL_TRANSPORT_COST);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__BILLING_WEIGHT);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__BILLING_WEIGHT_UOM_ID);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__CARRIER_DELIVERY_ZONE);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__CARRIER_PARTY_ID);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__CARRIER_RESTRICTION_CODES);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__CARRIER_RESTRICTION_DESC);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__CARRIER_SERVICE_STATUS_ID);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__CURRENCY_UOM_ID);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__DELIVERY_ID);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__DEST_CONTACT_MECH_ID);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__DEST_FACILITY_ID);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__DEST_TELECOM_NUMBER_ID);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__ESTIMATED_ARRIVAL_DATE);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__ESTIMATED_START_DATE);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__HOME_DELIVERY_DATE);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__HOME_DELIVERY_TYPE);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__LAST_UPDATED_DATE);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__ORIGIN_CONTACT_MECH_ID);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__ORIGIN_FACILITY_ID);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__ORIGIN_TELECOM_NUMBER_ID);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__SHIPMENT_METHOD_TYPE_ID);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_ACCOUNT_NUMBER);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_COUNTRY_GEO_CODE);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_POSTAL_CODE);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__TRACKING_DIGEST);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__TRACKING_ID_NUMBER);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__UPDATED_BY_USER_LOGIN_ID);
		createEAttribute(shipmentRouteSegmentEClass, SHIPMENT_ROUTE_SEGMENT__UPS_HIGH_VALUE_REPORT);

		shipmentStatusEClass = createEClass(SHIPMENT_STATUS);
		createEAttribute(shipmentStatusEClass, SHIPMENT_STATUS__STATUS_ID);
		createEAttribute(shipmentStatusEClass, SHIPMENT_STATUS__SHIPMENT_ID);
		createEAttribute(shipmentStatusEClass, SHIPMENT_STATUS__CHANGE_BY_USER_LOGIN_ID);
		createEAttribute(shipmentStatusEClass, SHIPMENT_STATUS__STATUS_DATE);

		shipmentTimeEstimateEClass = createEClass(SHIPMENT_TIME_ESTIMATE);
		createEAttribute(shipmentTimeEstimateEClass, SHIPMENT_TIME_ESTIMATE__SHIPMENT_METHOD_TYPE_ID);
		createEAttribute(shipmentTimeEstimateEClass, SHIPMENT_TIME_ESTIMATE__PARTY_ID);
		createEAttribute(shipmentTimeEstimateEClass, SHIPMENT_TIME_ESTIMATE__ROLE_TYPE_ID);
		createEAttribute(shipmentTimeEstimateEClass, SHIPMENT_TIME_ESTIMATE__GEO_ID_TO);
		createEAttribute(shipmentTimeEstimateEClass, SHIPMENT_TIME_ESTIMATE__GEO_ID_FROM);
		createEAttribute(shipmentTimeEstimateEClass, SHIPMENT_TIME_ESTIMATE__FROM_DATE);
		createEAttribute(shipmentTimeEstimateEClass, SHIPMENT_TIME_ESTIMATE__LEAD_TIME);
		createEAttribute(shipmentTimeEstimateEClass, SHIPMENT_TIME_ESTIMATE__LEAD_TIME_UOM_ID);
		createEAttribute(shipmentTimeEstimateEClass, SHIPMENT_TIME_ESTIMATE__SEQUENCE_NUMBER);
		createEAttribute(shipmentTimeEstimateEClass, SHIPMENT_TIME_ESTIMATE__THRU_DATE);

		shipmentTypeEClass = createEClass(SHIPMENT_TYPE);
		createEAttribute(shipmentTypeEClass, SHIPMENT_TYPE__SHIPMENT_TYPE_ID);
		createEAttribute(shipmentTypeEClass, SHIPMENT_TYPE__DESCRIPTION);
		createEAttribute(shipmentTypeEClass, SHIPMENT_TYPE__HAS_TABLE);
		createEAttribute(shipmentTypeEClass, SHIPMENT_TYPE__PARENT_TYPE_ID);
		createEAttribute(shipmentTypeEClass, SHIPMENT_TYPE__SHIPMENT_TYPE_ATTRS);

		shipmentTypeAttrEClass = createEClass(SHIPMENT_TYPE_ATTR);
		createEAttribute(shipmentTypeAttrEClass, SHIPMENT_TYPE_ATTR__SHIPMENT_TYPE_ID);
		createEAttribute(shipmentTypeAttrEClass, SHIPMENT_TYPE_ATTR__ATTR_NAME);
		createEAttribute(shipmentTypeAttrEClass, SHIPMENT_TYPE_ATTR__DESCRIPTION);

		shippingDocumentEClass = createEClass(SHIPPING_DOCUMENT);
		createEAttribute(shippingDocumentEClass, SHIPPING_DOCUMENT__DESCRIPTION);
		createEAttribute(shippingDocumentEClass, SHIPPING_DOCUMENT__SHIPMENT_ID);
		createEAttribute(shippingDocumentEClass, SHIPPING_DOCUMENT__SHIPMENT_ITEM_SEQ_ID);
		createEAttribute(shippingDocumentEClass, SHIPPING_DOCUMENT__SHIPMENT_PACKAGE_SEQ_ID);
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
		DocumentPackage theDocumentPackage = (DocumentPackage)EPackage.Registry.INSTANCE.getEPackage(DocumentPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		carrierShipmentBoxTypeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		carrierShipmentMethodEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		deliveryEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		EGenericType g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		EGenericType g2 = createEGenericType(this.getShipmentType());
		g1.getETypeArguments().add(g2);
		shipmentEClass.getEGenericSuperTypes().add(g1);
		shipmentAttributeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		shipmentBoxTypeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getShipmentContactMechType());
		g1.getETypeArguments().add(g2);
		shipmentContactMechEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getShipmentContactMech());
		g1.getETypeArguments().add(g2);
		shipmentContactMechTypeEClass.getEGenericSuperTypes().add(g1);
		shipmentCostEstimateEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getShipmentGatewayConfigType());
		g1.getETypeArguments().add(g2);
		shipmentGatewayConfigEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getShipmentGatewayConfig());
		g1.getETypeArguments().add(g2);
		shipmentGatewayConfigTypeEClass.getEGenericSuperTypes().add(g1);
		shipmentGatewayDhlEClass.getESuperTypes().add(this.getShipmentGatewayConfig());
		shipmentGatewayFedexEClass.getESuperTypes().add(this.getShipmentGatewayConfig());
		shipmentGatewayUpsEClass.getESuperTypes().add(this.getShipmentGatewayConfig());
		shipmentGatewayUspsEClass.getESuperTypes().add(this.getShipmentGatewayConfig());
		shipmentItemEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		shipmentItemBillingEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		shipmentItemFeatureEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		shipmentMethodTypeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		shipmentPackageEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		shipmentPackageContentEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		shipmentPackageRouteSegEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		shipmentRouteSegmentEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		shipmentStatusEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		shipmentTimeEstimateEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getShipment());
		g1.getETypeArguments().add(g2);
		shipmentTypeEClass.getEGenericSuperTypes().add(g1);
		shipmentTypeAttrEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		shippingDocumentEClass.getESuperTypes().add(theDocumentPackage.getDocument());

		// Initialize classes and features; add operations and parameters
		initEClass(carrierShipmentBoxTypeEClass, CarrierShipmentBoxType.class, "CarrierShipmentBoxType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCarrierShipmentBoxType_ShipmentBoxTypeId(), ecorePackage.getEString(), "shipmentBoxTypeId", null, 0, 1, CarrierShipmentBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarrierShipmentBoxType_PartyId(), ecorePackage.getEString(), "partyId", null, 0, 1, CarrierShipmentBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarrierShipmentBoxType_OversizeCode(), ecorePackage.getEString(), "oversizeCode", null, 0, 1, CarrierShipmentBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarrierShipmentBoxType_PackagingTypeCode(), ecorePackage.getEString(), "packagingTypeCode", null, 0, 1, CarrierShipmentBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carrierShipmentMethodEClass, CarrierShipmentMethod.class, "CarrierShipmentMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCarrierShipmentMethod_ShipmentMethodTypeId(), ecorePackage.getEString(), "shipmentMethodTypeId", null, 0, 1, CarrierShipmentMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarrierShipmentMethod_PartyId(), ecorePackage.getEString(), "partyId", null, 0, 1, CarrierShipmentMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarrierShipmentMethod_RoleTypeId(), ecorePackage.getEString(), "roleTypeId", null, 0, 1, CarrierShipmentMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarrierShipmentMethod_CarrierServiceCode(), ecorePackage.getEString(), "carrierServiceCode", null, 0, 1, CarrierShipmentMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCarrierShipmentMethod_SequenceNumber(), ecorePackage.getELong(), "sequenceNumber", null, 0, 1, CarrierShipmentMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deliveryEClass, Delivery.class, "Delivery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelivery_DeliveryId(), ecorePackage.getEString(), "deliveryId", null, 0, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelivery_ActualArrivalDate(), ecorePackage.getEDate(), "actualArrivalDate", null, 0, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelivery_ActualStartDate(), ecorePackage.getEDate(), "actualStartDate", null, 0, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelivery_DestFacilityId(), ecorePackage.getEString(), "destFacilityId", null, 0, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelivery_EndMileage(), ecorePackage.getEBigDecimal(), "endMileage", null, 0, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelivery_EstimatedArrivalDate(), ecorePackage.getEDate(), "estimatedArrivalDate", null, 0, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelivery_EstimatedStartDate(), ecorePackage.getEDate(), "estimatedStartDate", null, 0, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelivery_FixedAssetId(), ecorePackage.getEString(), "fixedAssetId", null, 0, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelivery_FuelUsed(), ecorePackage.getEBigDecimal(), "fuelUsed", null, 0, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelivery_OriginFacilityId(), ecorePackage.getEString(), "originFacilityId", null, 0, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelivery_StartMileage(), ecorePackage.getEBigDecimal(), "startMileage", null, 0, 1, Delivery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(deliveryEClass, ecorePackage.getEString(), "shipmentRouteSegments", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(shipmentEClass, Shipment.class, "Shipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipment_ShipmentId(), ecorePackage.getEString(), "shipmentId", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_AdditionalShippingCharge(), ecorePackage.getEBigDecimal(), "additionalShippingCharge", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_AddtlShippingChargeDesc(), ecorePackage.getEString(), "addtlShippingChargeDesc", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_CreatedByUserLogin(), ecorePackage.getEString(), "createdByUserLogin", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_CreatedDate(), ecorePackage.getEDate(), "createdDate", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_CurrencyUomId(), ecorePackage.getEString(), "currencyUomId", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_DestinationContactMechId(), ecorePackage.getEString(), "destinationContactMechId", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_DestinationFacilityId(), ecorePackage.getEString(), "destinationFacilityId", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_DestinationTelecomNumberId(), ecorePackage.getEString(), "destinationTelecomNumberId", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_EstimatedArrivalDate(), ecorePackage.getEDate(), "estimatedArrivalDate", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_EstimatedArrivalWorkEffId(), ecorePackage.getEString(), "estimatedArrivalWorkEffId", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_EstimatedReadyDate(), ecorePackage.getEDate(), "estimatedReadyDate", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_EstimatedShipCost(), ecorePackage.getEBigDecimal(), "estimatedShipCost", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_EstimatedShipDate(), ecorePackage.getEDate(), "estimatedShipDate", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_EstimatedShipWorkEffId(), ecorePackage.getEString(), "estimatedShipWorkEffId", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_HandlingInstructions(), ecorePackage.getEString(), "handlingInstructions", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_LastModifiedByUserLogin(), ecorePackage.getEString(), "lastModifiedByUserLogin", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_LastModifiedDate(), ecorePackage.getEDate(), "lastModifiedDate", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_LatestCancelDate(), ecorePackage.getEDate(), "latestCancelDate", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_OriginContactMechId(), ecorePackage.getEString(), "originContactMechId", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_OriginFacilityId(), ecorePackage.getEString(), "originFacilityId", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_OriginTelecomNumberId(), ecorePackage.getEString(), "originTelecomNumberId", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_PartyIdFrom(), ecorePackage.getEString(), "partyIdFrom", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_PartyIdTo(), ecorePackage.getEString(), "partyIdTo", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_PicklistBinId(), ecorePackage.getEString(), "picklistBinId", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_PrimaryOrderId(), ecorePackage.getEString(), "primaryOrderId", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_PrimaryReturnId(), ecorePackage.getEString(), "primaryReturnId", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_PrimaryShipGroupSeqId(), ecorePackage.getEString(), "primaryShipGroupSeqId", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_ShipmentTypeId(), ecorePackage.getEString(), "shipmentTypeId", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_StatusId(), ecorePackage.getEString(), "statusId", null, 0, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_ShipmentAttributes(), ecorePackage.getEString(), "shipmentAttributes", null, 0, -1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_ShipmentContactMechs(), ecorePackage.getEString(), "shipmentContactMechs", null, 0, -1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_ShipmentItems(), ecorePackage.getEString(), "shipmentItems", null, 0, -1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_ShipmentPackages(), ecorePackage.getEString(), "shipmentPackages", null, 0, -1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_ShipmentRouteSegments(), ecorePackage.getEString(), "shipmentRouteSegments", null, 0, -1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(shipmentEClass, ecorePackage.getEString(), "acctgTranss", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(shipmentEClass, ecorePackage.getEString(), "itemIssuances", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(shipmentEClass, ecorePackage.getEString(), "shipmentReceipts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(shipmentEClass, ecorePackage.getEString(), "shipmentStatuss", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(shipmentAttributeEClass, ShipmentAttribute.class, "ShipmentAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipmentAttribute_ShipmentId(), ecorePackage.getEString(), "shipmentId", null, 0, 1, ShipmentAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 0, 1, ShipmentAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, ShipmentAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, ShipmentAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipmentBoxTypeEClass, ShipmentBoxType.class, "ShipmentBoxType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipmentBoxType_ShipmentBoxTypeId(), ecorePackage.getEString(), "shipmentBoxTypeId", null, 0, 1, ShipmentBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentBoxType_BoxHeight(), ecorePackage.getEBigDecimal(), "boxHeight", null, 0, 1, ShipmentBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentBoxType_BoxLength(), ecorePackage.getEBigDecimal(), "boxLength", null, 0, 1, ShipmentBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentBoxType_BoxWeight(), ecorePackage.getEBigDecimal(), "boxWeight", null, 0, 1, ShipmentBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentBoxType_BoxWidth(), ecorePackage.getEBigDecimal(), "boxWidth", null, 0, 1, ShipmentBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentBoxType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ShipmentBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentBoxType_DimensionUomId(), ecorePackage.getEString(), "dimensionUomId", null, 0, 1, ShipmentBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentBoxType_WeightUomId(), ecorePackage.getEString(), "weightUomId", null, 0, 1, ShipmentBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentBoxType_CarrierShipmentBoxTypes(), ecorePackage.getEString(), "carrierShipmentBoxTypes", null, 0, -1, ShipmentBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(shipmentBoxTypeEClass, ecorePackage.getEString(), "defaultProducts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(shipmentBoxTypeEClass, ecorePackage.getEString(), "shipmentPackages", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(shipmentContactMechEClass, ShipmentContactMech.class, "ShipmentContactMech", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipmentContactMech_ShipmentId(), ecorePackage.getEString(), "shipmentId", null, 0, 1, ShipmentContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentContactMech_ShipmentContactMechTypeId(), ecorePackage.getEString(), "shipmentContactMechTypeId", null, 0, 1, ShipmentContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentContactMech_ContactMechId(), ecorePackage.getEString(), "contactMechId", null, 0, 1, ShipmentContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipmentContactMechTypeEClass, ShipmentContactMechType.class, "ShipmentContactMechType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipmentContactMechType_ShipmentContactMechTypeId(), ecorePackage.getEString(), "shipmentContactMechTypeId", null, 0, 1, ShipmentContactMechType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentContactMechType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ShipmentContactMechType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(shipmentContactMechTypeEClass, ecorePackage.getEString(), "shipmentContactMechs", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(shipmentCostEstimateEClass, ShipmentCostEstimate.class, "ShipmentCostEstimate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipmentCostEstimate_ShipmentCostEstimateId(), ecorePackage.getEString(), "shipmentCostEstimateId", null, 0, 1, ShipmentCostEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentCostEstimate_CarrierPartyId(), ecorePackage.getEString(), "carrierPartyId", null, 0, 1, ShipmentCostEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentCostEstimate_CarrierRoleTypeId(), ecorePackage.getEString(), "carrierRoleTypeId", null, 0, 1, ShipmentCostEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentCostEstimate_FeaturePercent(), ecorePackage.getEBigDecimal(), "featurePercent", null, 0, 1, ShipmentCostEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentCostEstimate_FeaturePrice(), ecorePackage.getEBigDecimal(), "featurePrice", null, 0, 1, ShipmentCostEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentCostEstimate_GeoIdFrom(), ecorePackage.getEString(), "geoIdFrom", null, 0, 1, ShipmentCostEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentCostEstimate_GeoIdTo(), ecorePackage.getEString(), "geoIdTo", null, 0, 1, ShipmentCostEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentCostEstimate_OrderFlatPrice(), ecorePackage.getEBigDecimal(), "orderFlatPrice", null, 0, 1, ShipmentCostEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentCostEstimate_OrderItemFlatPrice(), ecorePackage.getEBigDecimal(), "orderItemFlatPrice", null, 0, 1, ShipmentCostEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentCostEstimate_OrderPricePercent(), ecorePackage.getEBigDecimal(), "orderPricePercent", null, 0, 1, ShipmentCostEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentCostEstimate_OversizePrice(), ecorePackage.getEBigDecimal(), "oversizePrice", null, 0, 1, ShipmentCostEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentCostEstimate_OversizeUnit(), ecorePackage.getEBigDecimal(), "oversizeUnit", null, 0, 1, ShipmentCostEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentCostEstimate_PartyId(), ecorePackage.getEString(), "partyId", null, 0, 1, ShipmentCostEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentCostEstimate_PriceBreakId(), ecorePackage.getEString(), "priceBreakId", null, 0, 1, ShipmentCostEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentCostEstimate_PriceUnitPrice(), ecorePackage.getEBigDecimal(), "priceUnitPrice", null, 0, 1, ShipmentCostEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentCostEstimate_PriceUomId(), ecorePackage.getEString(), "priceUomId", null, 0, 1, ShipmentCostEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentCostEstimate_ProductFeatureGroupId(), ecorePackage.getEString(), "productFeatureGroupId", null, 0, 1, ShipmentCostEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentCostEstimate_ProductStoreId(), ecorePackage.getEString(), "productStoreId", null, 0, 1, ShipmentCostEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentCostEstimate_ProductStoreShipMethId(), ecorePackage.getEString(), "productStoreShipMethId", null, 0, 1, ShipmentCostEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentCostEstimate_QuantityBreakId(), ecorePackage.getEString(), "quantityBreakId", null, 0, 1, ShipmentCostEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentCostEstimate_QuantityUnitPrice(), ecorePackage.getEBigDecimal(), "quantityUnitPrice", null, 0, 1, ShipmentCostEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentCostEstimate_QuantityUomId(), ecorePackage.getEString(), "quantityUomId", null, 0, 1, ShipmentCostEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentCostEstimate_RoleTypeId(), ecorePackage.getEString(), "roleTypeId", null, 0, 1, ShipmentCostEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentCostEstimate_ShipmentMethodTypeId(), ecorePackage.getEString(), "shipmentMethodTypeId", null, 0, 1, ShipmentCostEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentCostEstimate_ShippingPricePercent(), ecorePackage.getEBigDecimal(), "shippingPricePercent", null, 0, 1, ShipmentCostEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentCostEstimate_WeightBreakId(), ecorePackage.getEString(), "weightBreakId", null, 0, 1, ShipmentCostEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentCostEstimate_WeightUnitPrice(), ecorePackage.getEBigDecimal(), "weightUnitPrice", null, 0, 1, ShipmentCostEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentCostEstimate_WeightUomId(), ecorePackage.getEString(), "weightUomId", null, 0, 1, ShipmentCostEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipmentGatewayConfigEClass, ShipmentGatewayConfig.class, "ShipmentGatewayConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipmentGatewayConfig_ShipmentGatewayConfigId(), ecorePackage.getEString(), "shipmentGatewayConfigId", null, 0, 1, ShipmentGatewayConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayConfig_Description(), ecorePackage.getEString(), "description", null, 0, 1, ShipmentGatewayConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayConfig_ShipmentGatewayConfTypeId(), ecorePackage.getEString(), "shipmentGatewayConfTypeId", null, 0, 1, ShipmentGatewayConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(shipmentGatewayConfigEClass, ecorePackage.getEString(), "productStoreShipmentMeths", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(shipmentGatewayConfigTypeEClass, ShipmentGatewayConfigType.class, "ShipmentGatewayConfigType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipmentGatewayConfigType_ShipmentGatewayConfTypeId(), ecorePackage.getEString(), "shipmentGatewayConfTypeId", null, 0, 1, ShipmentGatewayConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayConfigType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ShipmentGatewayConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayConfigType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, ShipmentGatewayConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayConfigType_ParentTypeId(), ecorePackage.getEString(), "parentTypeId", null, 0, 1, ShipmentGatewayConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(shipmentGatewayConfigTypeEClass, ecorePackage.getEString(), "childShipmentGatewayConfigTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(shipmentGatewayConfigTypeEClass, ecorePackage.getEString(), "shipmentGatewayConfigs", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(shipmentGatewayDhlEClass, ShipmentGatewayDhl.class, "ShipmentGatewayDhl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipmentGatewayDhl_AccessAccountNbr(), ecorePackage.getEString(), "accessAccountNbr", null, 0, 1, ShipmentGatewayDhl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayDhl_AccessPassword(), ecorePackage.getEString(), "accessPassword", null, 0, 1, ShipmentGatewayDhl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayDhl_AccessShippingKey(), ecorePackage.getEString(), "accessShippingKey", null, 0, 1, ShipmentGatewayDhl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayDhl_AccessUserId(), ecorePackage.getEString(), "accessUserId", null, 0, 1, ShipmentGatewayDhl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayDhl_ConnectTimeout(), ecorePackage.getELong(), "connectTimeout", null, 0, 1, ShipmentGatewayDhl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayDhl_ConnectUrl(), ecorePackage.getEString(), "connectUrl", null, 0, 1, ShipmentGatewayDhl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayDhl_HeadAction(), ecorePackage.getEString(), "headAction", null, 0, 1, ShipmentGatewayDhl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayDhl_HeadVersion(), ecorePackage.getEString(), "headVersion", null, 0, 1, ShipmentGatewayDhl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayDhl_LabelImageFormat(), ecorePackage.getEString(), "labelImageFormat", null, 0, 1, ShipmentGatewayDhl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayDhl_RateEstimateTemplate(), ecorePackage.getEString(), "rateEstimateTemplate", null, 0, 1, ShipmentGatewayDhl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipmentGatewayFedexEClass, ShipmentGatewayFedex.class, "ShipmentGatewayFedex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipmentGatewayFedex_AccessAccountNbr(), ecorePackage.getEString(), "accessAccountNbr", null, 0, 1, ShipmentGatewayFedex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayFedex_AccessMeterNumber(), ecorePackage.getEString(), "accessMeterNumber", null, 0, 1, ShipmentGatewayFedex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayFedex_AccessUserKey(), ecorePackage.getEString(), "accessUserKey", null, 0, 1, ShipmentGatewayFedex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayFedex_AccessUserPwd(), ecorePackage.getEString(), "accessUserPwd", null, 0, 1, ShipmentGatewayFedex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayFedex_ConnectSoapUrl(), ecorePackage.getEString(), "connectSoapUrl", null, 0, 1, ShipmentGatewayFedex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayFedex_ConnectTimeout(), ecorePackage.getELong(), "connectTimeout", null, 0, 1, ShipmentGatewayFedex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayFedex_ConnectUrl(), ecorePackage.getEString(), "connectUrl", null, 0, 1, ShipmentGatewayFedex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayFedex_DefaultDropoffType(), ecorePackage.getEString(), "defaultDropoffType", null, 0, 1, ShipmentGatewayFedex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayFedex_DefaultPackagingType(), ecorePackage.getEString(), "defaultPackagingType", null, 0, 1, ShipmentGatewayFedex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayFedex_LabelImageType(), ecorePackage.getEString(), "labelImageType", null, 0, 1, ShipmentGatewayFedex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayFedex_RateEstimateTemplate(), ecorePackage.getEString(), "rateEstimateTemplate", null, 0, 1, ShipmentGatewayFedex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayFedex_TemplateShipment(), ecorePackage.getEString(), "templateShipment", null, 0, 1, ShipmentGatewayFedex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayFedex_TemplateSubscription(), ecorePackage.getEString(), "templateSubscription", null, 0, 1, ShipmentGatewayFedex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipmentGatewayUpsEClass, ShipmentGatewayUps.class, "ShipmentGatewayUps", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipmentGatewayUps_AccessLicenseNumber(), ecorePackage.getEString(), "accessLicenseNumber", null, 0, 1, ShipmentGatewayUps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayUps_AccessPassword(), ecorePackage.getEString(), "accessPassword", null, 0, 1, ShipmentGatewayUps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayUps_AccessUserId(), ecorePackage.getEString(), "accessUserId", null, 0, 1, ShipmentGatewayUps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayUps_BillShipperAccountNumber(), ecorePackage.getEString(), "billShipperAccountNumber", null, 0, 1, ShipmentGatewayUps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayUps_CodAllowCod(), ecorePackage.getEString(), "codAllowCod", null, 0, 1, ShipmentGatewayUps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayUps_CodFundsCode(), ecorePackage.getEString(), "codFundsCode", null, 0, 1, ShipmentGatewayUps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayUps_CodSurchargeAmount(), ecorePackage.getEBigDecimal(), "codSurchargeAmount", null, 0, 1, ShipmentGatewayUps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayUps_CodSurchargeApplyToPackage(), ecorePackage.getEString(), "codSurchargeApplyToPackage", null, 0, 1, ShipmentGatewayUps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayUps_CodSurchargeCurrencyUomId(), ecorePackage.getEString(), "codSurchargeCurrencyUomId", null, 0, 1, ShipmentGatewayUps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayUps_ConnectTimeout(), ecorePackage.getELong(), "connectTimeout", null, 0, 1, ShipmentGatewayUps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayUps_ConnectUrl(), ecorePackage.getEString(), "connectUrl", null, 0, 1, ShipmentGatewayUps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayUps_CustomerClassification(), ecorePackage.getEString(), "customerClassification", null, 0, 1, ShipmentGatewayUps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayUps_DefaultReturnLabelMemo(), ecorePackage.getEString(), "defaultReturnLabelMemo", null, 0, 1, ShipmentGatewayUps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayUps_DefaultReturnLabelSubject(), ecorePackage.getEString(), "defaultReturnLabelSubject", null, 0, 1, ShipmentGatewayUps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayUps_MaxEstimateWeight(), ecorePackage.getEBigDecimal(), "maxEstimateWeight", null, 0, 1, ShipmentGatewayUps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayUps_MinEstimateWeight(), ecorePackage.getEBigDecimal(), "minEstimateWeight", null, 0, 1, ShipmentGatewayUps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayUps_SaveCertInfo(), ecorePackage.getEString(), "saveCertInfo", null, 0, 1, ShipmentGatewayUps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayUps_SaveCertPath(), ecorePackage.getEString(), "saveCertPath", null, 0, 1, ShipmentGatewayUps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayUps_ShipperNumber(), ecorePackage.getEString(), "shipperNumber", null, 0, 1, ShipmentGatewayUps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayUps_ShipperPickupType(), ecorePackage.getEString(), "shipperPickupType", null, 0, 1, ShipmentGatewayUps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipmentGatewayUspsEClass, ShipmentGatewayUsps.class, "ShipmentGatewayUsps", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipmentGatewayUsps_AccessPassword(), ecorePackage.getEString(), "accessPassword", null, 0, 1, ShipmentGatewayUsps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayUsps_AccessUserId(), ecorePackage.getEString(), "accessUserId", null, 0, 1, ShipmentGatewayUsps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayUsps_ConnectTimeout(), ecorePackage.getELong(), "connectTimeout", null, 0, 1, ShipmentGatewayUsps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayUsps_ConnectUrl(), ecorePackage.getEString(), "connectUrl", null, 0, 1, ShipmentGatewayUsps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayUsps_ConnectUrlLabels(), ecorePackage.getEString(), "connectUrlLabels", null, 0, 1, ShipmentGatewayUsps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayUsps_MaxEstimateWeight(), ecorePackage.getELong(), "maxEstimateWeight", null, 0, 1, ShipmentGatewayUsps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentGatewayUsps_Test(), ecorePackage.getEString(), "test", null, 0, 1, ShipmentGatewayUsps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipmentItemEClass, ShipmentItem.class, "ShipmentItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipmentItem_ShipmentId(), ecorePackage.getEString(), "shipmentId", null, 0, 1, ShipmentItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentItem_ShipmentItemSeqId(), ecorePackage.getEString(), "shipmentItemSeqId", null, 0, 1, ShipmentItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentItem_ProductId(), ecorePackage.getEString(), "productId", null, 0, 1, ShipmentItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentItem_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, ShipmentItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentItem_ShipmentContentDescription(), ecorePackage.getEString(), "shipmentContentDescription", null, 0, 1, ShipmentItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipmentItemBillingEClass, ShipmentItemBilling.class, "ShipmentItemBilling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipmentItemBilling_ShipmentId(), ecorePackage.getEString(), "shipmentId", null, 0, 1, ShipmentItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentItemBilling_ShipmentItemSeqId(), ecorePackage.getEString(), "shipmentItemSeqId", null, 0, 1, ShipmentItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentItemBilling_InvoiceId(), ecorePackage.getEString(), "invoiceId", null, 0, 1, ShipmentItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentItemBilling_InvoiceItemSeqId(), ecorePackage.getEString(), "invoiceItemSeqId", null, 0, 1, ShipmentItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipmentItemFeatureEClass, ShipmentItemFeature.class, "ShipmentItemFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipmentItemFeature_ShipmentId(), ecorePackage.getEString(), "shipmentId", null, 0, 1, ShipmentItemFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentItemFeature_ShipmentItemSeqId(), ecorePackage.getEString(), "shipmentItemSeqId", null, 0, 1, ShipmentItemFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentItemFeature_ProductFeatureId(), ecorePackage.getEString(), "productFeatureId", null, 0, 1, ShipmentItemFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipmentMethodTypeEClass, ShipmentMethodType.class, "ShipmentMethodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipmentMethodType_ShipmentMethodTypeId(), ecorePackage.getEString(), "shipmentMethodTypeId", null, 0, 1, ShipmentMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentMethodType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ShipmentMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentMethodType_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, ShipmentMethodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(shipmentMethodTypeEClass, ecorePackage.getEString(), "orderItemShipGroups", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(shipmentMethodTypeEClass, ecorePackage.getEString(), "picklists", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(shipmentMethodTypeEClass, ecorePackage.getEString(), "productStoreShipmentMeths", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(shipmentMethodTypeEClass, ecorePackage.getEString(), "shipmentRouteSegments", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(shipmentPackageEClass, ShipmentPackage.class, "ShipmentPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipmentPackage_ShipmentId(), ecorePackage.getEString(), "shipmentId", null, 0, 1, ShipmentPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackage_ShipmentPackageSeqId(), ecorePackage.getEString(), "shipmentPackageSeqId", null, 0, 1, ShipmentPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackage_BoxHeight(), ecorePackage.getEBigDecimal(), "boxHeight", null, 0, 1, ShipmentPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackage_BoxLength(), ecorePackage.getEBigDecimal(), "boxLength", null, 0, 1, ShipmentPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackage_BoxWidth(), ecorePackage.getEBigDecimal(), "boxWidth", null, 0, 1, ShipmentPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackage_DateCreated(), ecorePackage.getEDate(), "dateCreated", null, 0, 1, ShipmentPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackage_DimensionUomId(), ecorePackage.getEString(), "dimensionUomId", null, 0, 1, ShipmentPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackage_InsuredValue(), ecorePackage.getEBigDecimal(), "insuredValue", null, 0, 1, ShipmentPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackage_ShipmentBoxTypeId(), ecorePackage.getEString(), "shipmentBoxTypeId", null, 0, 1, ShipmentPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackage_Weight(), ecorePackage.getEBigDecimal(), "weight", null, 0, 1, ShipmentPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackage_WeightUomId(), ecorePackage.getEString(), "weightUomId", null, 0, 1, ShipmentPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipmentPackageContentEClass, ShipmentPackageContent.class, "ShipmentPackageContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipmentPackageContent_ShipmentId(), ecorePackage.getEString(), "shipmentId", null, 0, 1, ShipmentPackageContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackageContent_ShipmentPackageSeqId(), ecorePackage.getEString(), "shipmentPackageSeqId", null, 0, 1, ShipmentPackageContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackageContent_ShipmentItemSeqId(), ecorePackage.getEString(), "shipmentItemSeqId", null, 0, 1, ShipmentPackageContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackageContent_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, ShipmentPackageContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackageContent_SubProductId(), ecorePackage.getEString(), "subProductId", null, 0, 1, ShipmentPackageContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackageContent_SubProductQuantity(), ecorePackage.getEBigDecimal(), "subProductQuantity", null, 0, 1, ShipmentPackageContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipmentPackageRouteSegEClass, ShipmentPackageRouteSeg.class, "ShipmentPackageRouteSeg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipmentPackageRouteSeg_ShipmentId(), ecorePackage.getEString(), "shipmentId", null, 0, 1, ShipmentPackageRouteSeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackageRouteSeg_ShipmentPackageSeqId(), ecorePackage.getEString(), "shipmentPackageSeqId", null, 0, 1, ShipmentPackageRouteSeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackageRouteSeg_ShipmentRouteSegmentId(), ecorePackage.getEString(), "shipmentRouteSegmentId", null, 0, 1, ShipmentPackageRouteSeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackageRouteSeg_BoxNumber(), ecorePackage.getEString(), "boxNumber", null, 0, 1, ShipmentPackageRouteSeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackageRouteSeg_CodAmount(), ecorePackage.getEBigDecimal(), "codAmount", null, 0, 1, ShipmentPackageRouteSeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackageRouteSeg_CurrencyUomId(), ecorePackage.getEString(), "currencyUomId", null, 0, 1, ShipmentPackageRouteSeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackageRouteSeg_InsuredAmount(), ecorePackage.getEBigDecimal(), "insuredAmount", null, 0, 1, ShipmentPackageRouteSeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackageRouteSeg_InternationalInvoice(), ecorePackage.getEByteArray(), "internationalInvoice", null, 0, 1, ShipmentPackageRouteSeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackageRouteSeg_LabelHtml(), ecorePackage.getEString(), "labelHtml", null, 0, 1, ShipmentPackageRouteSeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackageRouteSeg_LabelImage(), ecorePackage.getEByteArray(), "labelImage", null, 0, 1, ShipmentPackageRouteSeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackageRouteSeg_LabelIntlSignImage(), ecorePackage.getEByteArray(), "labelIntlSignImage", null, 0, 1, ShipmentPackageRouteSeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackageRouteSeg_LabelPrinted(), ecorePackage.getEBoolean(), "labelPrinted", null, 0, 1, ShipmentPackageRouteSeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackageRouteSeg_PackageOtherCost(), ecorePackage.getEBigDecimal(), "packageOtherCost", null, 0, 1, ShipmentPackageRouteSeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackageRouteSeg_PackageServiceCost(), ecorePackage.getEBigDecimal(), "packageServiceCost", null, 0, 1, ShipmentPackageRouteSeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackageRouteSeg_PackageTransportCost(), ecorePackage.getEBigDecimal(), "packageTransportCost", null, 0, 1, ShipmentPackageRouteSeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentPackageRouteSeg_TrackingCode(), ecorePackage.getEString(), "trackingCode", null, 0, 1, ShipmentPackageRouteSeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipmentRouteSegmentEClass, ShipmentRouteSegment.class, "ShipmentRouteSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipmentRouteSegment_ShipmentId(), ecorePackage.getEString(), "shipmentId", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_ShipmentRouteSegmentId(), ecorePackage.getEString(), "shipmentRouteSegmentId", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_ActualArrivalDate(), ecorePackage.getEDate(), "actualArrivalDate", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_ActualCost(), ecorePackage.getEBigDecimal(), "actualCost", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_ActualOtherCost(), ecorePackage.getEBigDecimal(), "actualOtherCost", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_ActualServiceCost(), ecorePackage.getEBigDecimal(), "actualServiceCost", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_ActualStartDate(), ecorePackage.getEDate(), "actualStartDate", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_ActualTransportCost(), ecorePackage.getEBigDecimal(), "actualTransportCost", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_BillingWeight(), ecorePackage.getEBigDecimal(), "billingWeight", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_BillingWeightUomId(), ecorePackage.getEString(), "billingWeightUomId", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_CarrierDeliveryZone(), ecorePackage.getEString(), "carrierDeliveryZone", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_CarrierPartyId(), ecorePackage.getEString(), "carrierPartyId", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_CarrierRestrictionCodes(), ecorePackage.getEString(), "carrierRestrictionCodes", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_CarrierRestrictionDesc(), ecorePackage.getEString(), "carrierRestrictionDesc", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_CarrierServiceStatusId(), ecorePackage.getEString(), "carrierServiceStatusId", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_CurrencyUomId(), ecorePackage.getEString(), "currencyUomId", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_DeliveryId(), ecorePackage.getEString(), "deliveryId", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_DestContactMechId(), ecorePackage.getEString(), "destContactMechId", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_DestFacilityId(), ecorePackage.getEString(), "destFacilityId", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_DestTelecomNumberId(), ecorePackage.getEString(), "destTelecomNumberId", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_EstimatedArrivalDate(), ecorePackage.getEDate(), "estimatedArrivalDate", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_EstimatedStartDate(), ecorePackage.getEDate(), "estimatedStartDate", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_HomeDeliveryDate(), ecorePackage.getEDate(), "homeDeliveryDate", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_HomeDeliveryType(), ecorePackage.getEString(), "homeDeliveryType", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_LastUpdatedDate(), ecorePackage.getEDate(), "lastUpdatedDate", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_OriginContactMechId(), ecorePackage.getEString(), "originContactMechId", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_OriginFacilityId(), ecorePackage.getEString(), "originFacilityId", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_OriginTelecomNumberId(), ecorePackage.getEString(), "originTelecomNumberId", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_ShipmentMethodTypeId(), ecorePackage.getEString(), "shipmentMethodTypeId", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_ThirdPartyAccountNumber(), ecorePackage.getEString(), "thirdPartyAccountNumber", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_ThirdPartyCountryGeoCode(), ecorePackage.getEString(), "thirdPartyCountryGeoCode", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_ThirdPartyPostalCode(), ecorePackage.getEString(), "thirdPartyPostalCode", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_TrackingDigest(), ecorePackage.getEString(), "trackingDigest", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_TrackingIdNumber(), ecorePackage.getEString(), "trackingIdNumber", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_UpdatedByUserLoginId(), ecorePackage.getEString(), "updatedByUserLoginId", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentRouteSegment_UpsHighValueReport(), ecorePackage.getEByteArray(), "upsHighValueReport", null, 0, 1, ShipmentRouteSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipmentStatusEClass, ShipmentStatus.class, "ShipmentStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipmentStatus_StatusId(), ecorePackage.getEString(), "statusId", null, 0, 1, ShipmentStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentStatus_ShipmentId(), ecorePackage.getEString(), "shipmentId", null, 0, 1, ShipmentStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentStatus_ChangeByUserLoginId(), ecorePackage.getEString(), "changeByUserLoginId", null, 0, 1, ShipmentStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentStatus_StatusDate(), ecorePackage.getEDate(), "statusDate", null, 0, 1, ShipmentStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipmentTimeEstimateEClass, ShipmentTimeEstimate.class, "ShipmentTimeEstimate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipmentTimeEstimate_ShipmentMethodTypeId(), ecorePackage.getEString(), "shipmentMethodTypeId", null, 0, 1, ShipmentTimeEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentTimeEstimate_PartyId(), ecorePackage.getEString(), "partyId", null, 0, 1, ShipmentTimeEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentTimeEstimate_RoleTypeId(), ecorePackage.getEString(), "roleTypeId", null, 0, 1, ShipmentTimeEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentTimeEstimate_GeoIdTo(), ecorePackage.getEString(), "geoIdTo", null, 0, 1, ShipmentTimeEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentTimeEstimate_GeoIdFrom(), ecorePackage.getEString(), "geoIdFrom", null, 0, 1, ShipmentTimeEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentTimeEstimate_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, ShipmentTimeEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentTimeEstimate_LeadTime(), ecorePackage.getEBigDecimal(), "leadTime", null, 0, 1, ShipmentTimeEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentTimeEstimate_LeadTimeUomId(), ecorePackage.getEString(), "leadTimeUomId", null, 0, 1, ShipmentTimeEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentTimeEstimate_SequenceNumber(), ecorePackage.getELong(), "sequenceNumber", null, 0, 1, ShipmentTimeEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentTimeEstimate_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, ShipmentTimeEstimate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipmentTypeEClass, ShipmentType.class, "ShipmentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipmentType_ShipmentTypeId(), ecorePackage.getEString(), "shipmentTypeId", null, 0, 1, ShipmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ShipmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, ShipmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentType_ParentTypeId(), ecorePackage.getEString(), "parentTypeId", null, 0, 1, ShipmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentType_ShipmentTypeAttrs(), ecorePackage.getEString(), "shipmentTypeAttrs", null, 0, -1, ShipmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(shipmentTypeEClass, ecorePackage.getEString(), "childShipmentTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(shipmentTypeEClass, ecorePackage.getEString(), "shipments", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(shipmentTypeAttrEClass, ShipmentTypeAttr.class, "ShipmentTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipmentTypeAttr_ShipmentTypeId(), ecorePackage.getEString(), "shipmentTypeId", null, 0, 1, ShipmentTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 0, 1, ShipmentTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, ShipmentTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shippingDocumentEClass, ShippingDocument.class, "ShippingDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShippingDocument_Description(), ecorePackage.getEString(), "description", null, 0, 1, ShippingDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShippingDocument_ShipmentId(), ecorePackage.getEString(), "shipmentId", null, 0, 1, ShippingDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShippingDocument_ShipmentItemSeqId(), ecorePackage.getEString(), "shipmentItemSeqId", null, 0, 1, ShippingDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShippingDocument_ShipmentPackageSeqId(), ecorePackage.getEString(), "shipmentPackageSeqId", null, 0, 1, ShippingDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getCarrierShipmentBoxType_ShipmentBoxTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getCarrierShipmentBoxType_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getCarrierShipmentMethod_ShipmentMethodTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getCarrierShipmentMethod_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getCarrierShipmentMethod_RoleTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (deliveryEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getDelivery_DeliveryId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (shipmentEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (shipmentEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (shipmentEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (shipmentEClass.getEOperations().get(3),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getShipment_ShipmentId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipment_ShipmentAttributes(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getShipment_ShipmentContactMechs(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getShipment_ShipmentItems(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getShipment_ShipmentPackages(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getShipment_ShipmentRouteSegments(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getShipmentAttribute_ShipmentId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentAttribute_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (shipmentBoxTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (shipmentBoxTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getShipmentBoxType_ShipmentBoxTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentBoxType_CarrierShipmentBoxTypes(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getShipmentContactMech_ShipmentId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentContactMech_ShipmentContactMechTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (shipmentContactMechTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getShipmentContactMechType_ShipmentContactMechTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentCostEstimate_ShipmentCostEstimateId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (shipmentGatewayConfigEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getShipmentGatewayConfig_ShipmentGatewayConfigId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (shipmentGatewayConfigTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (shipmentGatewayConfigTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getShipmentGatewayConfigType_ShipmentGatewayConfTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentItem_ShipmentId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentItem_ShipmentItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentItemBilling_ShipmentId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentItemBilling_ShipmentItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentItemBilling_InvoiceId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentItemBilling_InvoiceItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentItemFeature_ShipmentId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentItemFeature_ShipmentItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentItemFeature_ProductFeatureId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (shipmentMethodTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (shipmentMethodTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (shipmentMethodTypeEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (shipmentMethodTypeEClass.getEOperations().get(3),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getShipmentMethodType_ShipmentMethodTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentPackage_ShipmentId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentPackage_ShipmentPackageSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentPackageContent_ShipmentId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentPackageContent_ShipmentPackageSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentPackageContent_ShipmentItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentPackageRouteSeg_ShipmentId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentPackageRouteSeg_ShipmentPackageSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentPackageRouteSeg_ShipmentRouteSegmentId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentRouteSegment_ShipmentId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentRouteSegment_ShipmentRouteSegmentId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentStatus_StatusId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentStatus_ShipmentId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentTimeEstimate_ShipmentMethodTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentTimeEstimate_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentTimeEstimate_RoleTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentTimeEstimate_GeoIdTo(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentTimeEstimate_GeoIdFrom(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentTimeEstimate_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (shipmentTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (shipmentTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getShipmentType_ShipmentTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentType_ShipmentTypeAttrs(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getShipmentTypeAttr_ShipmentTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getShipmentTypeAttr_AttrName(),
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
		  (getCarrierShipmentBoxType_ShipmentBoxTypeId(),
		   source,
		   new String[] {
			   "frame", "ShipmentBoxType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getCarrierShipmentBoxType_PartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getCarrierShipmentMethod_ShipmentMethodTypeId(),
		   source,
		   new String[] {
			   "frame", "ShipmentMethodType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getCarrierShipmentMethod_PartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (deliveryEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "ShipmentRouteSegment",
			   "route", "deliveryId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getDelivery_DestFacilityId(),
		   source,
		   new String[] {
			   "frame", "Facility"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getDelivery_FixedAssetId(),
		   source,
		   new String[] {
			   "frame", "FixedAsset"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getDelivery_OriginFacilityId(),
		   source,
		   new String[] {
			   "frame", "Facility"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (shipmentEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "AcctgTrans",
			   "route", "shipmentId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (shipmentEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "ItemIssuance",
			   "route", "shipmentId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (shipmentEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "frame", "ShipmentReceipt",
			   "route", "shipmentId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (shipmentEClass.getEOperations().get(3),
		   source,
		   new String[] {
			   "frame", "ShipmentStatus",
			   "route", "shipmentId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipment_CurrencyUomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipment_DestinationContactMechId(),
		   source,
		   new String[] {
			   "frame", "ContactMech"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipment_DestinationFacilityId(),
		   source,
		   new String[] {
			   "frame", "Facility"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipment_DestinationTelecomNumberId(),
		   source,
		   new String[] {
			   "frame", "TelecomNumber"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipment_EstimatedArrivalWorkEffId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipment_EstimatedShipWorkEffId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipment_OriginContactMechId(),
		   source,
		   new String[] {
			   "frame", "ContactMech"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipment_OriginFacilityId(),
		   source,
		   new String[] {
			   "frame", "Facility"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipment_OriginTelecomNumberId(),
		   source,
		   new String[] {
			   "frame", "TelecomNumber"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipment_PartyIdFrom(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipment_PartyIdTo(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipment_PicklistBinId(),
		   source,
		   new String[] {
			   "frame", "PicklistBin"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipment_PrimaryOrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipment_PrimaryReturnId(),
		   source,
		   new String[] {
			   "frame", "ReturnHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipment_ShipmentTypeId(),
		   source,
		   new String[] {
			   "frame", "ShipmentType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipment_StatusId(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipment_ShipmentAttributes(),
		   source,
		   new String[] {
			   "frame", "ShipmentAttribute"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipment_ShipmentContactMechs(),
		   source,
		   new String[] {
			   "frame", "ShipmentContactMech"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipment_ShipmentItems(),
		   source,
		   new String[] {
			   "frame", "ShipmentItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipment_ShipmentPackages(),
		   source,
		   new String[] {
			   "frame", "ShipmentPackage"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipment_ShipmentRouteSegments(),
		   source,
		   new String[] {
			   "frame", "ShipmentRouteSegment"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentAttribute_ShipmentId(),
		   source,
		   new String[] {
			   "frame", "Shipment"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (shipmentBoxTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "Product",
			   "route", "defaultShipmentBoxTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (shipmentBoxTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "ShipmentPackage",
			   "route", "shipmentBoxTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentBoxType_DimensionUomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentBoxType_WeightUomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentBoxType_CarrierShipmentBoxTypes(),
		   source,
		   new String[] {
			   "frame", "CarrierShipmentBoxType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentContactMech_ShipmentId(),
		   source,
		   new String[] {
			   "frame", "Shipment"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentContactMech_ShipmentContactMechTypeId(),
		   source,
		   new String[] {
			   "frame", "ShipmentContactMechType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentContactMech_ContactMechId(),
		   source,
		   new String[] {
			   "frame", "ContactMech"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (shipmentContactMechTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "ShipmentContactMech",
			   "route", "shipmentContactMechTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentCostEstimate_GeoIdFrom(),
		   source,
		   new String[] {
			   "frame", "Geo"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentCostEstimate_GeoIdTo(),
		   source,
		   new String[] {
			   "frame", "Geo"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentCostEstimate_PartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentCostEstimate_PriceBreakId(),
		   source,
		   new String[] {
			   "frame", "QuantityBreak"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentCostEstimate_PriceUomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentCostEstimate_ProductStoreShipMethId(),
		   source,
		   new String[] {
			   "frame", "ProductStoreShipmentMeth"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentCostEstimate_QuantityBreakId(),
		   source,
		   new String[] {
			   "frame", "QuantityBreak"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentCostEstimate_QuantityUomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentCostEstimate_RoleTypeId(),
		   source,
		   new String[] {
			   "frame", "RoleType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentCostEstimate_WeightBreakId(),
		   source,
		   new String[] {
			   "frame", "QuantityBreak"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentCostEstimate_WeightUomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (shipmentGatewayConfigEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "ProductStoreShipmentMeth",
			   "route", "shipmentGatewayConfigId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentGatewayConfig_ShipmentGatewayConfigId(),
		   source,
		   new String[] {
			   "frame", "ShipmentGatewayConfig"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentGatewayConfig_ShipmentGatewayConfTypeId(),
		   source,
		   new String[] {
			   "frame", "ShipmentGatewayConfigType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (shipmentGatewayConfigTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "ShipmentGatewayConfigType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (shipmentGatewayConfigTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "ShipmentGatewayConfig",
			   "route", "shipmentGatewayConfTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentGatewayConfigType_ParentTypeId(),
		   source,
		   new String[] {
			   "frame", "ShipmentGatewayConfigType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentItem_ShipmentId(),
		   source,
		   new String[] {
			   "frame", "Shipment"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentItem_ProductId(),
		   source,
		   new String[] {
			   "frame", "Product"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentItemBilling_ShipmentId(),
		   source,
		   new String[] {
			   "frame", "Shipment"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentItemBilling_InvoiceId(),
		   source,
		   new String[] {
			   "frame", "Invoice"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentItemFeature_ShipmentId(),
		   source,
		   new String[] {
			   "frame", "Shipment"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentItemFeature_ProductFeatureId(),
		   source,
		   new String[] {
			   "frame", "ProductFeature"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (shipmentMethodTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "OrderItemShipGroup",
			   "route", "shipmentMethodTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (shipmentMethodTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "Picklist",
			   "route", "shipmentMethodTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (shipmentMethodTypeEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "frame", "ProductStoreShipmentMeth",
			   "route", "shipmentMethodTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (shipmentMethodTypeEClass.getEOperations().get(3),
		   source,
		   new String[] {
			   "frame", "ShipmentRouteSegment",
			   "route", "shipmentMethodTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentPackage_ShipmentId(),
		   source,
		   new String[] {
			   "frame", "Shipment"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentPackage_DimensionUomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentPackage_ShipmentBoxTypeId(),
		   source,
		   new String[] {
			   "frame", "ShipmentBoxType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentPackage_WeightUomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentPackageContent_ShipmentId(),
		   source,
		   new String[] {
			   "frame", "Shipment"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentPackageContent_SubProductId(),
		   source,
		   new String[] {
			   "frame", "Product"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentPackageRouteSeg_ShipmentId(),
		   source,
		   new String[] {
			   "frame", "Shipment"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentPackageRouteSeg_CurrencyUomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentRouteSegment_ShipmentId(),
		   source,
		   new String[] {
			   "frame", "Shipment"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentRouteSegment_BillingWeightUomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentRouteSegment_CarrierPartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentRouteSegment_CarrierServiceStatusId(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentRouteSegment_CurrencyUomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentRouteSegment_DeliveryId(),
		   source,
		   new String[] {
			   "frame", "Delivery"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentRouteSegment_DestContactMechId(),
		   source,
		   new String[] {
			   "frame", "ContactMech"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentRouteSegment_DestFacilityId(),
		   source,
		   new String[] {
			   "frame", "Facility"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentRouteSegment_DestTelecomNumberId(),
		   source,
		   new String[] {
			   "frame", "TelecomNumber"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentRouteSegment_OriginContactMechId(),
		   source,
		   new String[] {
			   "frame", "ContactMech"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentRouteSegment_OriginFacilityId(),
		   source,
		   new String[] {
			   "frame", "Facility"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentRouteSegment_OriginTelecomNumberId(),
		   source,
		   new String[] {
			   "frame", "TelecomNumber"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentRouteSegment_ShipmentMethodTypeId(),
		   source,
		   new String[] {
			   "frame", "ShipmentMethodType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentStatus_StatusId(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentStatus_ShipmentId(),
		   source,
		   new String[] {
			   "frame", "Shipment"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentStatus_ChangeByUserLoginId(),
		   source,
		   new String[] {
			   "frame", "UserLogin"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentTimeEstimate_GeoIdTo(),
		   source,
		   new String[] {
			   "frame", "Geo"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentTimeEstimate_GeoIdFrom(),
		   source,
		   new String[] {
			   "frame", "Geo"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentTimeEstimate_LeadTimeUomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (shipmentTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "ShipmentType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (shipmentTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "Shipment",
			   "route", "shipmentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentType_ParentTypeId(),
		   source,
		   new String[] {
			   "frame", "ShipmentType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentType_ShipmentTypeAttrs(),
		   source,
		   new String[] {
			   "frame", "ShipmentTypeAttr"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getShipmentTypeAttr_ShipmentTypeId(),
		   source,
		   new String[] {
			   "frame", "ShipmentType"
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
		  (shipmentBoxTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (shipmentContactMechTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (shipmentGatewayConfigEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (shipmentGatewayConfigTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (shipmentGatewayDhlEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (shipmentGatewayFedexEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (shipmentGatewayUpsEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (shipmentGatewayUspsEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (shipmentMethodTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (shipmentTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (shipmentTypeAttrEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (shippingDocumentEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
	}

} //Shipment_PackageImpl
