/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.opportunity.impl;

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
import org.abchip.mimo.biz.marketing.opportunity.OpportunityFactory;
import org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage;
import org.abchip.mimo.biz.marketing.opportunity.SalesForecast;
import org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail;
import org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory;
import org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity;
import org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityCompetitor;
import org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory;
import org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityQuote;
import org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityRole;
import org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityStage;
import org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityTrckCode;
import org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityWorkEffort;
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
import org.abchip.mimo.entity.EntityPackage;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpportunityPackageImpl extends EPackageImpl implements OpportunityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesForecastEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesForecastDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesForecastHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesOpportunityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesOpportunityCompetitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesOpportunityHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesOpportunityQuoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesOpportunityRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesOpportunityStageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesOpportunityTrckCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salesOpportunityWorkEffortEClass = null;

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
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OpportunityPackageImpl() {
		super(eNS_URI, OpportunityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OpportunityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OpportunityPackage init() {
		if (isInited) return (OpportunityPackage)EPackage.Registry.INSTANCE.getEPackage(OpportunityPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOpportunityPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OpportunityPackageImpl theOpportunityPackage = registeredOpportunityPackage instanceof OpportunityPackageImpl ? (OpportunityPackageImpl)registeredOpportunityPackage : new OpportunityPackageImpl();

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
		theOpportunityPackage.createPackageContents();
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
		theOpportunityPackage.initializePackageContents();
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
		theOpportunityPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OpportunityPackage.eNS_URI, theOpportunityPackage);
		return theOpportunityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSalesForecast() {
		return salesForecastEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecast_SalesForecastId() {
		return (EAttribute)salesForecastEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecast_BestCaseAmount() {
		return (EAttribute)salesForecastEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecast_ClosedAmount() {
		return (EAttribute)salesForecastEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecast_CreatedByUserLoginId() {
		return (EAttribute)salesForecastEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecast_CurrencyUomId() {
		return (EAttribute)salesForecastEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecast_CustomTimePeriodId() {
		return (EAttribute)salesForecastEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecast_ForecastAmount() {
		return (EAttribute)salesForecastEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecast_InternalPartyId() {
		return (EAttribute)salesForecastEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecast_ModifiedByUserLoginId() {
		return (EAttribute)salesForecastEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecast_OrganizationPartyId() {
		return (EAttribute)salesForecastEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecast_ParentSalesForecastId() {
		return (EAttribute)salesForecastEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecast_PercentOfQuotaClosed() {
		return (EAttribute)salesForecastEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecast_PercentOfQuotaForecast() {
		return (EAttribute)salesForecastEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecast_PipelineAmount() {
		return (EAttribute)salesForecastEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecast_QuotaAmount() {
		return (EAttribute)salesForecastEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecast_SalesForecastDetails() {
		return (EAttribute)salesForecastEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSalesForecastDetail() {
		return salesForecastDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastDetail_SalesForecastId() {
		return (EAttribute)salesForecastDetailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastDetail_SalesForecastDetailId() {
		return (EAttribute)salesForecastDetailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastDetail_Amount() {
		return (EAttribute)salesForecastDetailEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastDetail_ProductCategoryId() {
		return (EAttribute)salesForecastDetailEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastDetail_ProductId() {
		return (EAttribute)salesForecastDetailEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastDetail_Quantity() {
		return (EAttribute)salesForecastDetailEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastDetail_QuantityUomId() {
		return (EAttribute)salesForecastDetailEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSalesForecastHistory() {
		return salesForecastHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastHistory_SalesForecastHistoryId() {
		return (EAttribute)salesForecastHistoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastHistory_BestCaseAmount() {
		return (EAttribute)salesForecastHistoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastHistory_ChangeNote() {
		return (EAttribute)salesForecastHistoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastHistory_ClosedAmount() {
		return (EAttribute)salesForecastHistoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastHistory_CurrencyUomId() {
		return (EAttribute)salesForecastHistoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastHistory_CustomTimePeriodId() {
		return (EAttribute)salesForecastHistoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastHistory_ForecastAmount() {
		return (EAttribute)salesForecastHistoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastHistory_InternalPartyId() {
		return (EAttribute)salesForecastHistoryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastHistory_ModifiedByUserLoginId() {
		return (EAttribute)salesForecastHistoryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastHistory_ModifiedTimestamp() {
		return (EAttribute)salesForecastHistoryEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastHistory_OrganizationPartyId() {
		return (EAttribute)salesForecastHistoryEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastHistory_ParentSalesForecastId() {
		return (EAttribute)salesForecastHistoryEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastHistory_PercentOfQuotaClosed() {
		return (EAttribute)salesForecastHistoryEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastHistory_PercentOfQuotaForecast() {
		return (EAttribute)salesForecastHistoryEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastHistory_QuotaAmount() {
		return (EAttribute)salesForecastHistoryEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesForecastHistory_SalesForecastId() {
		return (EAttribute)salesForecastHistoryEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSalesOpportunity() {
		return salesOpportunityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunity_SalesOpportunityId() {
		return (EAttribute)salesOpportunityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunity_CreatedByUserLogin() {
		return (EAttribute)salesOpportunityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunity_CurrencyUomId() {
		return (EAttribute)salesOpportunityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunity_DataSourceId() {
		return (EAttribute)salesOpportunityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunity_Description() {
		return (EAttribute)salesOpportunityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunity_EstimatedAmount() {
		return (EAttribute)salesOpportunityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunity_EstimatedCloseDate() {
		return (EAttribute)salesOpportunityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunity_EstimatedProbability() {
		return (EAttribute)salesOpportunityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunity_MarketingCampaignId() {
		return (EAttribute)salesOpportunityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunity_NextStep() {
		return (EAttribute)salesOpportunityEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunity_NextStepDate() {
		return (EAttribute)salesOpportunityEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunity_OpportunityName() {
		return (EAttribute)salesOpportunityEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunity_OpportunityStageId() {
		return (EAttribute)salesOpportunityEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunity_TypeEnumId() {
		return (EAttribute)salesOpportunityEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunity_SalesOpportunityCompetitors() {
		return (EAttribute)salesOpportunityEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunity_SalesOpportunityQuotes() {
		return (EAttribute)salesOpportunityEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunity_SalesOpportunityTrckCodes() {
		return (EAttribute)salesOpportunityEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunity_SalesOpportunityWorkEfforts() {
		return (EAttribute)salesOpportunityEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSalesOpportunityCompetitor() {
		return salesOpportunityCompetitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityCompetitor_SalesOpportunityId() {
		return (EAttribute)salesOpportunityCompetitorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityCompetitor_CompetitorPartyId() {
		return (EAttribute)salesOpportunityCompetitorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityCompetitor_PositionEnumId() {
		return (EAttribute)salesOpportunityCompetitorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityCompetitor_Strengths() {
		return (EAttribute)salesOpportunityCompetitorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityCompetitor_Weaknesses() {
		return (EAttribute)salesOpportunityCompetitorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSalesOpportunityHistory() {
		return salesOpportunityHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityHistory_SalesOpportunityHistoryId() {
		return (EAttribute)salesOpportunityHistoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityHistory_ChangeNote() {
		return (EAttribute)salesOpportunityHistoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityHistory_CurrencyUomId() {
		return (EAttribute)salesOpportunityHistoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityHistory_Description() {
		return (EAttribute)salesOpportunityHistoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityHistory_EstimatedAmount() {
		return (EAttribute)salesOpportunityHistoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityHistory_EstimatedCloseDate() {
		return (EAttribute)salesOpportunityHistoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityHistory_EstimatedProbability() {
		return (EAttribute)salesOpportunityHistoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityHistory_ModifiedByUserLogin() {
		return (EAttribute)salesOpportunityHistoryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityHistory_ModifiedTimestamp() {
		return (EAttribute)salesOpportunityHistoryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityHistory_NextStep() {
		return (EAttribute)salesOpportunityHistoryEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityHistory_OpportunityStageId() {
		return (EAttribute)salesOpportunityHistoryEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityHistory_SalesOpportunityId() {
		return (EAttribute)salesOpportunityHistoryEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSalesOpportunityQuote() {
		return salesOpportunityQuoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityQuote_SalesOpportunityId() {
		return (EAttribute)salesOpportunityQuoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityQuote_QuoteId() {
		return (EAttribute)salesOpportunityQuoteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSalesOpportunityRole() {
		return salesOpportunityRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityRole_SalesOpportunityId() {
		return (EAttribute)salesOpportunityRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityRole_PartyId() {
		return (EAttribute)salesOpportunityRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityRole_RoleTypeId() {
		return (EAttribute)salesOpportunityRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSalesOpportunityStage() {
		return salesOpportunityStageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityStage_OpportunityStageId() {
		return (EAttribute)salesOpportunityStageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityStage_DefaultProbability() {
		return (EAttribute)salesOpportunityStageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityStage_Description() {
		return (EAttribute)salesOpportunityStageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityStage_SequenceNum() {
		return (EAttribute)salesOpportunityStageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSalesOpportunityTrckCode() {
		return salesOpportunityTrckCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityTrckCode_SalesOpportunityId() {
		return (EAttribute)salesOpportunityTrckCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityTrckCode_TrackingCodeId() {
		return (EAttribute)salesOpportunityTrckCodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityTrckCode_ReceivedDate() {
		return (EAttribute)salesOpportunityTrckCodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSalesOpportunityWorkEffort() {
		return salesOpportunityWorkEffortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityWorkEffort_SalesOpportunityId() {
		return (EAttribute)salesOpportunityWorkEffortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSalesOpportunityWorkEffort_WorkEffortId() {
		return (EAttribute)salesOpportunityWorkEffortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpportunityFactory getOpportunityFactory() {
		return (OpportunityFactory)getEFactoryInstance();
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
		salesForecastEClass = createEClass(SALES_FORECAST);
		createEAttribute(salesForecastEClass, SALES_FORECAST__SALES_FORECAST_ID);
		createEAttribute(salesForecastEClass, SALES_FORECAST__BEST_CASE_AMOUNT);
		createEAttribute(salesForecastEClass, SALES_FORECAST__CLOSED_AMOUNT);
		createEAttribute(salesForecastEClass, SALES_FORECAST__CREATED_BY_USER_LOGIN_ID);
		createEAttribute(salesForecastEClass, SALES_FORECAST__CURRENCY_UOM_ID);
		createEAttribute(salesForecastEClass, SALES_FORECAST__CUSTOM_TIME_PERIOD_ID);
		createEAttribute(salesForecastEClass, SALES_FORECAST__FORECAST_AMOUNT);
		createEAttribute(salesForecastEClass, SALES_FORECAST__INTERNAL_PARTY_ID);
		createEAttribute(salesForecastEClass, SALES_FORECAST__MODIFIED_BY_USER_LOGIN_ID);
		createEAttribute(salesForecastEClass, SALES_FORECAST__ORGANIZATION_PARTY_ID);
		createEAttribute(salesForecastEClass, SALES_FORECAST__PARENT_SALES_FORECAST_ID);
		createEAttribute(salesForecastEClass, SALES_FORECAST__PERCENT_OF_QUOTA_CLOSED);
		createEAttribute(salesForecastEClass, SALES_FORECAST__PERCENT_OF_QUOTA_FORECAST);
		createEAttribute(salesForecastEClass, SALES_FORECAST__PIPELINE_AMOUNT);
		createEAttribute(salesForecastEClass, SALES_FORECAST__QUOTA_AMOUNT);
		createEAttribute(salesForecastEClass, SALES_FORECAST__SALES_FORECAST_DETAILS);

		salesForecastDetailEClass = createEClass(SALES_FORECAST_DETAIL);
		createEAttribute(salesForecastDetailEClass, SALES_FORECAST_DETAIL__SALES_FORECAST_ID);
		createEAttribute(salesForecastDetailEClass, SALES_FORECAST_DETAIL__SALES_FORECAST_DETAIL_ID);
		createEAttribute(salesForecastDetailEClass, SALES_FORECAST_DETAIL__AMOUNT);
		createEAttribute(salesForecastDetailEClass, SALES_FORECAST_DETAIL__PRODUCT_CATEGORY_ID);
		createEAttribute(salesForecastDetailEClass, SALES_FORECAST_DETAIL__PRODUCT_ID);
		createEAttribute(salesForecastDetailEClass, SALES_FORECAST_DETAIL__QUANTITY);
		createEAttribute(salesForecastDetailEClass, SALES_FORECAST_DETAIL__QUANTITY_UOM_ID);

		salesForecastHistoryEClass = createEClass(SALES_FORECAST_HISTORY);
		createEAttribute(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__SALES_FORECAST_HISTORY_ID);
		createEAttribute(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__BEST_CASE_AMOUNT);
		createEAttribute(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__CHANGE_NOTE);
		createEAttribute(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__CLOSED_AMOUNT);
		createEAttribute(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__CURRENCY_UOM_ID);
		createEAttribute(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__CUSTOM_TIME_PERIOD_ID);
		createEAttribute(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__FORECAST_AMOUNT);
		createEAttribute(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__INTERNAL_PARTY_ID);
		createEAttribute(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__MODIFIED_BY_USER_LOGIN_ID);
		createEAttribute(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__MODIFIED_TIMESTAMP);
		createEAttribute(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__ORGANIZATION_PARTY_ID);
		createEAttribute(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__PARENT_SALES_FORECAST_ID);
		createEAttribute(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_CLOSED);
		createEAttribute(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_FORECAST);
		createEAttribute(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__QUOTA_AMOUNT);
		createEAttribute(salesForecastHistoryEClass, SALES_FORECAST_HISTORY__SALES_FORECAST_ID);

		salesOpportunityEClass = createEClass(SALES_OPPORTUNITY);
		createEAttribute(salesOpportunityEClass, SALES_OPPORTUNITY__SALES_OPPORTUNITY_ID);
		createEAttribute(salesOpportunityEClass, SALES_OPPORTUNITY__CREATED_BY_USER_LOGIN);
		createEAttribute(salesOpportunityEClass, SALES_OPPORTUNITY__CURRENCY_UOM_ID);
		createEAttribute(salesOpportunityEClass, SALES_OPPORTUNITY__DATA_SOURCE_ID);
		createEAttribute(salesOpportunityEClass, SALES_OPPORTUNITY__DESCRIPTION);
		createEAttribute(salesOpportunityEClass, SALES_OPPORTUNITY__ESTIMATED_AMOUNT);
		createEAttribute(salesOpportunityEClass, SALES_OPPORTUNITY__ESTIMATED_CLOSE_DATE);
		createEAttribute(salesOpportunityEClass, SALES_OPPORTUNITY__ESTIMATED_PROBABILITY);
		createEAttribute(salesOpportunityEClass, SALES_OPPORTUNITY__MARKETING_CAMPAIGN_ID);
		createEAttribute(salesOpportunityEClass, SALES_OPPORTUNITY__NEXT_STEP);
		createEAttribute(salesOpportunityEClass, SALES_OPPORTUNITY__NEXT_STEP_DATE);
		createEAttribute(salesOpportunityEClass, SALES_OPPORTUNITY__OPPORTUNITY_NAME);
		createEAttribute(salesOpportunityEClass, SALES_OPPORTUNITY__OPPORTUNITY_STAGE_ID);
		createEAttribute(salesOpportunityEClass, SALES_OPPORTUNITY__TYPE_ENUM_ID);
		createEAttribute(salesOpportunityEClass, SALES_OPPORTUNITY__SALES_OPPORTUNITY_COMPETITORS);
		createEAttribute(salesOpportunityEClass, SALES_OPPORTUNITY__SALES_OPPORTUNITY_QUOTES);
		createEAttribute(salesOpportunityEClass, SALES_OPPORTUNITY__SALES_OPPORTUNITY_TRCK_CODES);
		createEAttribute(salesOpportunityEClass, SALES_OPPORTUNITY__SALES_OPPORTUNITY_WORK_EFFORTS);

		salesOpportunityCompetitorEClass = createEClass(SALES_OPPORTUNITY_COMPETITOR);
		createEAttribute(salesOpportunityCompetitorEClass, SALES_OPPORTUNITY_COMPETITOR__SALES_OPPORTUNITY_ID);
		createEAttribute(salesOpportunityCompetitorEClass, SALES_OPPORTUNITY_COMPETITOR__COMPETITOR_PARTY_ID);
		createEAttribute(salesOpportunityCompetitorEClass, SALES_OPPORTUNITY_COMPETITOR__POSITION_ENUM_ID);
		createEAttribute(salesOpportunityCompetitorEClass, SALES_OPPORTUNITY_COMPETITOR__STRENGTHS);
		createEAttribute(salesOpportunityCompetitorEClass, SALES_OPPORTUNITY_COMPETITOR__WEAKNESSES);

		salesOpportunityHistoryEClass = createEClass(SALES_OPPORTUNITY_HISTORY);
		createEAttribute(salesOpportunityHistoryEClass, SALES_OPPORTUNITY_HISTORY__SALES_OPPORTUNITY_HISTORY_ID);
		createEAttribute(salesOpportunityHistoryEClass, SALES_OPPORTUNITY_HISTORY__CHANGE_NOTE);
		createEAttribute(salesOpportunityHistoryEClass, SALES_OPPORTUNITY_HISTORY__CURRENCY_UOM_ID);
		createEAttribute(salesOpportunityHistoryEClass, SALES_OPPORTUNITY_HISTORY__DESCRIPTION);
		createEAttribute(salesOpportunityHistoryEClass, SALES_OPPORTUNITY_HISTORY__ESTIMATED_AMOUNT);
		createEAttribute(salesOpportunityHistoryEClass, SALES_OPPORTUNITY_HISTORY__ESTIMATED_CLOSE_DATE);
		createEAttribute(salesOpportunityHistoryEClass, SALES_OPPORTUNITY_HISTORY__ESTIMATED_PROBABILITY);
		createEAttribute(salesOpportunityHistoryEClass, SALES_OPPORTUNITY_HISTORY__MODIFIED_BY_USER_LOGIN);
		createEAttribute(salesOpportunityHistoryEClass, SALES_OPPORTUNITY_HISTORY__MODIFIED_TIMESTAMP);
		createEAttribute(salesOpportunityHistoryEClass, SALES_OPPORTUNITY_HISTORY__NEXT_STEP);
		createEAttribute(salesOpportunityHistoryEClass, SALES_OPPORTUNITY_HISTORY__OPPORTUNITY_STAGE_ID);
		createEAttribute(salesOpportunityHistoryEClass, SALES_OPPORTUNITY_HISTORY__SALES_OPPORTUNITY_ID);

		salesOpportunityQuoteEClass = createEClass(SALES_OPPORTUNITY_QUOTE);
		createEAttribute(salesOpportunityQuoteEClass, SALES_OPPORTUNITY_QUOTE__SALES_OPPORTUNITY_ID);
		createEAttribute(salesOpportunityQuoteEClass, SALES_OPPORTUNITY_QUOTE__QUOTE_ID);

		salesOpportunityRoleEClass = createEClass(SALES_OPPORTUNITY_ROLE);
		createEAttribute(salesOpportunityRoleEClass, SALES_OPPORTUNITY_ROLE__SALES_OPPORTUNITY_ID);
		createEAttribute(salesOpportunityRoleEClass, SALES_OPPORTUNITY_ROLE__PARTY_ID);
		createEAttribute(salesOpportunityRoleEClass, SALES_OPPORTUNITY_ROLE__ROLE_TYPE_ID);

		salesOpportunityStageEClass = createEClass(SALES_OPPORTUNITY_STAGE);
		createEAttribute(salesOpportunityStageEClass, SALES_OPPORTUNITY_STAGE__OPPORTUNITY_STAGE_ID);
		createEAttribute(salesOpportunityStageEClass, SALES_OPPORTUNITY_STAGE__DEFAULT_PROBABILITY);
		createEAttribute(salesOpportunityStageEClass, SALES_OPPORTUNITY_STAGE__DESCRIPTION);
		createEAttribute(salesOpportunityStageEClass, SALES_OPPORTUNITY_STAGE__SEQUENCE_NUM);

		salesOpportunityTrckCodeEClass = createEClass(SALES_OPPORTUNITY_TRCK_CODE);
		createEAttribute(salesOpportunityTrckCodeEClass, SALES_OPPORTUNITY_TRCK_CODE__SALES_OPPORTUNITY_ID);
		createEAttribute(salesOpportunityTrckCodeEClass, SALES_OPPORTUNITY_TRCK_CODE__TRACKING_CODE_ID);
		createEAttribute(salesOpportunityTrckCodeEClass, SALES_OPPORTUNITY_TRCK_CODE__RECEIVED_DATE);

		salesOpportunityWorkEffortEClass = createEClass(SALES_OPPORTUNITY_WORK_EFFORT);
		createEAttribute(salesOpportunityWorkEffortEClass, SALES_OPPORTUNITY_WORK_EFFORT__SALES_OPPORTUNITY_ID);
		createEAttribute(salesOpportunityWorkEffortEClass, SALES_OPPORTUNITY_WORK_EFFORT__WORK_EFFORT_ID);
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
		salesForecastEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		salesForecastDetailEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		salesForecastHistoryEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		salesOpportunityEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		salesOpportunityCompetitorEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		salesOpportunityHistoryEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		salesOpportunityQuoteEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		salesOpportunityRoleEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		salesOpportunityStageEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		salesOpportunityTrckCodeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		salesOpportunityWorkEffortEClass.getESuperTypes().add(theBizPackage.getBizEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(salesForecastEClass, SalesForecast.class, "SalesForecast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSalesForecast_SalesForecastId(), ecorePackage.getEString(), "salesForecastId", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecast_BestCaseAmount(), ecorePackage.getEBigDecimal(), "bestCaseAmount", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecast_ClosedAmount(), ecorePackage.getEBigDecimal(), "closedAmount", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecast_CreatedByUserLoginId(), ecorePackage.getEString(), "createdByUserLoginId", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecast_CurrencyUomId(), ecorePackage.getEString(), "currencyUomId", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecast_CustomTimePeriodId(), ecorePackage.getEString(), "customTimePeriodId", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecast_ForecastAmount(), ecorePackage.getEBigDecimal(), "forecastAmount", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecast_InternalPartyId(), ecorePackage.getEString(), "internalPartyId", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecast_ModifiedByUserLoginId(), ecorePackage.getEString(), "modifiedByUserLoginId", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecast_OrganizationPartyId(), ecorePackage.getEString(), "organizationPartyId", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecast_ParentSalesForecastId(), ecorePackage.getEString(), "parentSalesForecastId", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecast_PercentOfQuotaClosed(), ecorePackage.getEBigDecimal(), "percentOfQuotaClosed", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecast_PercentOfQuotaForecast(), ecorePackage.getEBigDecimal(), "percentOfQuotaForecast", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecast_PipelineAmount(), ecorePackage.getEBigDecimal(), "pipelineAmount", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecast_QuotaAmount(), ecorePackage.getEBigDecimal(), "quotaAmount", null, 0, 1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecast_SalesForecastDetails(), ecorePackage.getEString(), "salesForecastDetails", null, 0, -1, SalesForecast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(salesForecastEClass, ecorePackage.getEString(), "childSalesForecasts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(salesForecastEClass, ecorePackage.getEString(), "salesForecastHistories", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(salesForecastDetailEClass, SalesForecastDetail.class, "SalesForecastDetail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSalesForecastDetail_SalesForecastId(), ecorePackage.getEString(), "salesForecastId", null, 0, 1, SalesForecastDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecastDetail_SalesForecastDetailId(), ecorePackage.getEString(), "salesForecastDetailId", null, 0, 1, SalesForecastDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecastDetail_Amount(), ecorePackage.getEBigDecimal(), "amount", null, 0, 1, SalesForecastDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecastDetail_ProductCategoryId(), ecorePackage.getEString(), "productCategoryId", null, 0, 1, SalesForecastDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecastDetail_ProductId(), ecorePackage.getEString(), "productId", null, 0, 1, SalesForecastDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecastDetail_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, SalesForecastDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecastDetail_QuantityUomId(), ecorePackage.getEString(), "quantityUomId", null, 0, 1, SalesForecastDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(salesForecastHistoryEClass, SalesForecastHistory.class, "SalesForecastHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSalesForecastHistory_SalesForecastHistoryId(), ecorePackage.getEString(), "salesForecastHistoryId", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecastHistory_BestCaseAmount(), ecorePackage.getEBigDecimal(), "bestCaseAmount", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecastHistory_ChangeNote(), ecorePackage.getEString(), "changeNote", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecastHistory_ClosedAmount(), ecorePackage.getEBigDecimal(), "closedAmount", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecastHistory_CurrencyUomId(), ecorePackage.getEString(), "currencyUomId", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecastHistory_CustomTimePeriodId(), ecorePackage.getEString(), "customTimePeriodId", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecastHistory_ForecastAmount(), ecorePackage.getEBigDecimal(), "forecastAmount", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecastHistory_InternalPartyId(), ecorePackage.getEString(), "internalPartyId", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecastHistory_ModifiedByUserLoginId(), ecorePackage.getEString(), "modifiedByUserLoginId", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecastHistory_ModifiedTimestamp(), ecorePackage.getEDate(), "modifiedTimestamp", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecastHistory_OrganizationPartyId(), ecorePackage.getEString(), "organizationPartyId", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecastHistory_ParentSalesForecastId(), ecorePackage.getEString(), "parentSalesForecastId", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecastHistory_PercentOfQuotaClosed(), ecorePackage.getEBigDecimal(), "percentOfQuotaClosed", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecastHistory_PercentOfQuotaForecast(), ecorePackage.getEBigDecimal(), "percentOfQuotaForecast", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecastHistory_QuotaAmount(), ecorePackage.getEBigDecimal(), "quotaAmount", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesForecastHistory_SalesForecastId(), ecorePackage.getEString(), "salesForecastId", null, 0, 1, SalesForecastHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(salesOpportunityEClass, SalesOpportunity.class, "SalesOpportunity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSalesOpportunity_SalesOpportunityId(), ecorePackage.getEString(), "salesOpportunityId", null, 0, 1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunity_CreatedByUserLogin(), ecorePackage.getEString(), "createdByUserLogin", null, 0, 1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunity_CurrencyUomId(), ecorePackage.getEString(), "currencyUomId", null, 0, 1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunity_DataSourceId(), ecorePackage.getEString(), "dataSourceId", null, 0, 1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunity_Description(), ecorePackage.getEString(), "description", null, 0, 1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunity_EstimatedAmount(), ecorePackage.getEBigDecimal(), "estimatedAmount", null, 0, 1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunity_EstimatedCloseDate(), ecorePackage.getEDate(), "estimatedCloseDate", null, 0, 1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunity_EstimatedProbability(), ecorePackage.getEBigDecimal(), "estimatedProbability", null, 0, 1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunity_MarketingCampaignId(), ecorePackage.getEString(), "marketingCampaignId", null, 0, 1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunity_NextStep(), ecorePackage.getEString(), "nextStep", null, 0, 1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunity_NextStepDate(), ecorePackage.getEDate(), "nextStepDate", null, 0, 1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunity_OpportunityName(), ecorePackage.getEString(), "opportunityName", null, 0, 1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunity_OpportunityStageId(), ecorePackage.getEString(), "opportunityStageId", null, 0, 1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunity_TypeEnumId(), ecorePackage.getEString(), "typeEnumId", null, 0, 1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunity_SalesOpportunityCompetitors(), ecorePackage.getEString(), "salesOpportunityCompetitors", null, 0, -1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunity_SalesOpportunityQuotes(), ecorePackage.getEString(), "salesOpportunityQuotes", null, 0, -1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunity_SalesOpportunityTrckCodes(), ecorePackage.getEString(), "salesOpportunityTrckCodes", null, 0, -1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunity_SalesOpportunityWorkEfforts(), ecorePackage.getEString(), "salesOpportunityWorkEfforts", null, 0, -1, SalesOpportunity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(salesOpportunityEClass, ecorePackage.getEString(), "invoiceItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(salesOpportunityEClass, ecorePackage.getEString(), "orderItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(salesOpportunityEClass, ecorePackage.getEString(), "salesOpportunityHistories", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(salesOpportunityCompetitorEClass, SalesOpportunityCompetitor.class, "SalesOpportunityCompetitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSalesOpportunityCompetitor_SalesOpportunityId(), ecorePackage.getEString(), "salesOpportunityId", null, 0, 1, SalesOpportunityCompetitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityCompetitor_CompetitorPartyId(), ecorePackage.getEString(), "competitorPartyId", null, 0, 1, SalesOpportunityCompetitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityCompetitor_PositionEnumId(), ecorePackage.getEString(), "positionEnumId", null, 0, 1, SalesOpportunityCompetitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityCompetitor_Strengths(), ecorePackage.getEString(), "strengths", null, 0, 1, SalesOpportunityCompetitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityCompetitor_Weaknesses(), ecorePackage.getEString(), "weaknesses", null, 0, 1, SalesOpportunityCompetitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(salesOpportunityHistoryEClass, SalesOpportunityHistory.class, "SalesOpportunityHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSalesOpportunityHistory_SalesOpportunityHistoryId(), ecorePackage.getEString(), "salesOpportunityHistoryId", null, 0, 1, SalesOpportunityHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityHistory_ChangeNote(), ecorePackage.getEString(), "changeNote", null, 0, 1, SalesOpportunityHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityHistory_CurrencyUomId(), ecorePackage.getEString(), "currencyUomId", null, 0, 1, SalesOpportunityHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityHistory_Description(), ecorePackage.getEString(), "description", null, 0, 1, SalesOpportunityHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityHistory_EstimatedAmount(), ecorePackage.getEBigDecimal(), "estimatedAmount", null, 0, 1, SalesOpportunityHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityHistory_EstimatedCloseDate(), ecorePackage.getEDate(), "estimatedCloseDate", null, 0, 1, SalesOpportunityHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityHistory_EstimatedProbability(), ecorePackage.getEBigDecimal(), "estimatedProbability", null, 0, 1, SalesOpportunityHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityHistory_ModifiedByUserLogin(), ecorePackage.getEString(), "modifiedByUserLogin", null, 0, 1, SalesOpportunityHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityHistory_ModifiedTimestamp(), ecorePackage.getEDate(), "modifiedTimestamp", null, 0, 1, SalesOpportunityHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityHistory_NextStep(), ecorePackage.getEString(), "nextStep", null, 0, 1, SalesOpportunityHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityHistory_OpportunityStageId(), ecorePackage.getEString(), "opportunityStageId", null, 0, 1, SalesOpportunityHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityHistory_SalesOpportunityId(), ecorePackage.getEString(), "salesOpportunityId", null, 0, 1, SalesOpportunityHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(salesOpportunityQuoteEClass, SalesOpportunityQuote.class, "SalesOpportunityQuote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSalesOpportunityQuote_SalesOpportunityId(), ecorePackage.getEString(), "salesOpportunityId", null, 0, 1, SalesOpportunityQuote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityQuote_QuoteId(), ecorePackage.getEString(), "quoteId", null, 0, 1, SalesOpportunityQuote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(salesOpportunityRoleEClass, SalesOpportunityRole.class, "SalesOpportunityRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSalesOpportunityRole_SalesOpportunityId(), ecorePackage.getEString(), "salesOpportunityId", null, 0, 1, SalesOpportunityRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityRole_PartyId(), ecorePackage.getEString(), "partyId", null, 0, 1, SalesOpportunityRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityRole_RoleTypeId(), ecorePackage.getEString(), "roleTypeId", null, 0, 1, SalesOpportunityRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(salesOpportunityStageEClass, SalesOpportunityStage.class, "SalesOpportunityStage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSalesOpportunityStage_OpportunityStageId(), ecorePackage.getEString(), "opportunityStageId", null, 0, 1, SalesOpportunityStage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityStage_DefaultProbability(), ecorePackage.getEBigDecimal(), "defaultProbability", null, 0, 1, SalesOpportunityStage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityStage_Description(), ecorePackage.getEString(), "description", null, 0, 1, SalesOpportunityStage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityStage_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, SalesOpportunityStage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(salesOpportunityStageEClass, ecorePackage.getEString(), "salesOpportunities", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(salesOpportunityStageEClass, ecorePackage.getEString(), "salesOpportunityHistories", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(salesOpportunityTrckCodeEClass, SalesOpportunityTrckCode.class, "SalesOpportunityTrckCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSalesOpportunityTrckCode_SalesOpportunityId(), ecorePackage.getEString(), "salesOpportunityId", null, 0, 1, SalesOpportunityTrckCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityTrckCode_TrackingCodeId(), ecorePackage.getEString(), "trackingCodeId", null, 0, 1, SalesOpportunityTrckCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityTrckCode_ReceivedDate(), ecorePackage.getEDate(), "receivedDate", null, 0, 1, SalesOpportunityTrckCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(salesOpportunityWorkEffortEClass, SalesOpportunityWorkEffort.class, "SalesOpportunityWorkEffort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSalesOpportunityWorkEffort_SalesOpportunityId(), ecorePackage.getEString(), "salesOpportunityId", null, 0, 1, SalesOpportunityWorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSalesOpportunityWorkEffort_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 0, 1, SalesOpportunityWorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (salesForecastEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (salesForecastEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getSalesForecast_SalesForecastId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSalesForecast_SalesForecastDetails(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getSalesForecastDetail_SalesForecastId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSalesForecastDetail_SalesForecastDetailId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSalesForecastHistory_SalesForecastHistoryId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (salesOpportunityEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (salesOpportunityEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (salesOpportunityEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getSalesOpportunity_SalesOpportunityId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSalesOpportunity_SalesOpportunityCompetitors(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getSalesOpportunity_SalesOpportunityQuotes(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getSalesOpportunity_SalesOpportunityTrckCodes(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getSalesOpportunity_SalesOpportunityWorkEfforts(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getSalesOpportunityCompetitor_SalesOpportunityId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSalesOpportunityCompetitor_CompetitorPartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSalesOpportunityHistory_SalesOpportunityHistoryId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSalesOpportunityQuote_SalesOpportunityId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSalesOpportunityQuote_QuoteId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSalesOpportunityRole_SalesOpportunityId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSalesOpportunityRole_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSalesOpportunityRole_RoleTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (salesOpportunityStageEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (salesOpportunityStageEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getSalesOpportunityStage_OpportunityStageId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSalesOpportunityTrckCode_SalesOpportunityId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSalesOpportunityTrckCode_TrackingCodeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSalesOpportunityWorkEffort_SalesOpportunityId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSalesOpportunityWorkEffort_WorkEffortId(),
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
		  (salesForecastEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "SalesForecast",
			   "route", "parentSalesForecastId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (salesForecastEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "SalesForecastHistory",
			   "route", "salesForecastId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesForecast_CreatedByUserLoginId(),
		   source,
		   new String[] {
			   "frame", "UserLogin"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesForecast_CurrencyUomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesForecast_CustomTimePeriodId(),
		   source,
		   new String[] {
			   "frame", "CustomTimePeriod"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesForecast_InternalPartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesForecast_ModifiedByUserLoginId(),
		   source,
		   new String[] {
			   "frame", "UserLogin"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesForecast_OrganizationPartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesForecast_ParentSalesForecastId(),
		   source,
		   new String[] {
			   "frame", "SalesForecast"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesForecast_SalesForecastDetails(),
		   source,
		   new String[] {
			   "frame", "SalesForecastDetail"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesForecastDetail_SalesForecastId(),
		   source,
		   new String[] {
			   "frame", "SalesForecast"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesForecastDetail_ProductCategoryId(),
		   source,
		   new String[] {
			   "frame", "ProductCategory"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesForecastDetail_ProductId(),
		   source,
		   new String[] {
			   "frame", "Product"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesForecastDetail_QuantityUomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesForecastHistory_CurrencyUomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesForecastHistory_CustomTimePeriodId(),
		   source,
		   new String[] {
			   "frame", "CustomTimePeriod"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesForecastHistory_InternalPartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesForecastHistory_ModifiedByUserLoginId(),
		   source,
		   new String[] {
			   "frame", "UserLogin"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesForecastHistory_OrganizationPartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesForecastHistory_SalesForecastId(),
		   source,
		   new String[] {
			   "frame", "SalesForecast"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (salesOpportunityEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "InvoiceItem",
			   "route", "salesOpportunityId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (salesOpportunityEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "OrderItem",
			   "route", "salesOpportunityId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (salesOpportunityEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "frame", "SalesOpportunityHistory",
			   "route", "salesOpportunityId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesOpportunity_CreatedByUserLogin(),
		   source,
		   new String[] {
			   "frame", "UserLogin"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesOpportunity_CurrencyUomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesOpportunity_MarketingCampaignId(),
		   source,
		   new String[] {
			   "frame", "MarketingCampaign"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesOpportunity_OpportunityStageId(),
		   source,
		   new String[] {
			   "frame", "SalesOpportunityStage"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesOpportunity_TypeEnumId(),
		   source,
		   new String[] {
			   "frame", "Enumeration"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesOpportunity_SalesOpportunityCompetitors(),
		   source,
		   new String[] {
			   "frame", "SalesOpportunityCompetitor"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesOpportunity_SalesOpportunityQuotes(),
		   source,
		   new String[] {
			   "frame", "SalesOpportunityQuote"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesOpportunity_SalesOpportunityTrckCodes(),
		   source,
		   new String[] {
			   "frame", "SalesOpportunityTrckCode"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesOpportunity_SalesOpportunityWorkEfforts(),
		   source,
		   new String[] {
			   "frame", "SalesOpportunityWorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesOpportunityCompetitor_SalesOpportunityId(),
		   source,
		   new String[] {
			   "frame", "SalesOpportunity"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesOpportunityHistory_CurrencyUomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesOpportunityHistory_ModifiedByUserLogin(),
		   source,
		   new String[] {
			   "frame", "UserLogin"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesOpportunityHistory_OpportunityStageId(),
		   source,
		   new String[] {
			   "frame", "SalesOpportunityStage"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesOpportunityHistory_SalesOpportunityId(),
		   source,
		   new String[] {
			   "frame", "SalesOpportunity"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesOpportunityQuote_SalesOpportunityId(),
		   source,
		   new String[] {
			   "frame", "SalesOpportunity"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesOpportunityQuote_QuoteId(),
		   source,
		   new String[] {
			   "frame", "Quote"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesOpportunityRole_SalesOpportunityId(),
		   source,
		   new String[] {
			   "frame", "SalesOpportunity"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesOpportunityRole_PartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesOpportunityRole_RoleTypeId(),
		   source,
		   new String[] {
			   "frame", "RoleType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (salesOpportunityStageEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "SalesOpportunity",
			   "route", "opportunityStageId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (salesOpportunityStageEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "SalesOpportunityHistory",
			   "route", "opportunityStageId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesOpportunityTrckCode_SalesOpportunityId(),
		   source,
		   new String[] {
			   "frame", "SalesOpportunity"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesOpportunityWorkEffort_SalesOpportunityId(),
		   source,
		   new String[] {
			   "frame", "SalesOpportunity"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getSalesOpportunityWorkEffort_WorkEffortId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
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
		  (salesOpportunityEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (salesOpportunityHistoryEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (salesOpportunityStageEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
	}

} //OpportunityPackageImpl
