/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.request.impl;

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
import org.abchip.mimo.biz.order.order.OrderPackage;
import org.abchip.mimo.biz.order.order.impl.OrderPackageImpl;
import org.abchip.mimo.biz.order.quote.QuotePackage;
import org.abchip.mimo.biz.order.quote.impl.QuotePackageImpl;
import org.abchip.mimo.biz.order.request.CustRequest;
import org.abchip.mimo.biz.order.request.CustRequestAttribute;
import org.abchip.mimo.biz.order.request.CustRequestCategory;
import org.abchip.mimo.biz.order.request.CustRequestCommEvent;
import org.abchip.mimo.biz.order.request.CustRequestContent;
import org.abchip.mimo.biz.order.request.CustRequestItem;
import org.abchip.mimo.biz.order.request.CustRequestItemNote;
import org.abchip.mimo.biz.order.request.CustRequestItemWorkEffort;
import org.abchip.mimo.biz.order.request.CustRequestNote;
import org.abchip.mimo.biz.order.request.CustRequestParty;
import org.abchip.mimo.biz.order.request.CustRequestResolution;
import org.abchip.mimo.biz.order.request.CustRequestStatus;
import org.abchip.mimo.biz.order.request.CustRequestType;
import org.abchip.mimo.biz.order.request.CustRequestTypeAttr;
import org.abchip.mimo.biz.order.request.CustRequestWorkEffort;
import org.abchip.mimo.biz.order.request.RequestFactory;
import org.abchip.mimo.biz.order.request.RequestPackage;
import org.abchip.mimo.biz.order.request.RespondingParty;
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
public class RequestPackageImpl extends EPackageImpl implements RequestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass custRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass custRequestAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass custRequestCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass custRequestCommEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass custRequestContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass custRequestItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass custRequestItemNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass custRequestItemWorkEffortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass custRequestNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass custRequestPartyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass custRequestResolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass custRequestStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass custRequestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass custRequestTypeAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass custRequestWorkEffortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass respondingPartyEClass = null;

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
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RequestPackageImpl() {
		super(eNS_URI, RequestFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RequestPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RequestPackage init() {
		if (isInited) return (RequestPackage)EPackage.Registry.INSTANCE.getEPackage(RequestPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRequestPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RequestPackageImpl theRequestPackage = registeredRequestPackage instanceof RequestPackageImpl ? (RequestPackageImpl)registeredRequestPackage : new RequestPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI);
		OrderPackageImpl theOrderPackage = (OrderPackageImpl)(registeredPackage instanceof OrderPackageImpl ? registeredPackage : OrderPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(QuotePackage.eNS_URI);
		QuotePackageImpl theQuotePackage = (QuotePackageImpl)(registeredPackage instanceof QuotePackageImpl ? registeredPackage : QuotePackage.eINSTANCE);
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
		theRequestPackage.createPackageContents();
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
		theOrderPackage.createPackageContents();
		theQuotePackage.createPackageContents();
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
		theRequestPackage.initializePackageContents();
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
		theOrderPackage.initializePackageContents();
		theQuotePackage.initializePackageContents();
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
		theRequestPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RequestPackage.eNS_URI, theRequestPackage);
		return theRequestPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustRequest() {
		return custRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequest_CustRequestId() {
		return (EAttribute)custRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequest_ClosedDateTime() {
		return (EAttribute)custRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequest_CreatedByUserLogin() {
		return (EAttribute)custRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequest_CreatedDate() {
		return (EAttribute)custRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequest_CurrencyUomId() {
		return (EReference)custRequestEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequest_CustRequestCategoryId() {
		return (EReference)custRequestEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequest_CustRequestDate() {
		return (EAttribute)custRequestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequest_CustRequestName() {
		return (EAttribute)custRequestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequest_CustRequestTypeId() {
		return (EReference)custRequestEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequest_Description() {
		return (EAttribute)custRequestEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequest_FromPartyId() {
		return (EReference)custRequestEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequest_FulfillContactMechId() {
		return (EReference)custRequestEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequest_InternalComment() {
		return (EAttribute)custRequestEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequest_LastModifiedByUserLogin() {
		return (EAttribute)custRequestEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequest_LastModifiedDate() {
		return (EAttribute)custRequestEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequest_MaximumAmountUomId() {
		return (EReference)custRequestEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequest_OpenDateTime() {
		return (EAttribute)custRequestEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequest_Priority() {
		return (EAttribute)custRequestEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequest_ProductStoreId() {
		return (EReference)custRequestEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequest_Reason() {
		return (EAttribute)custRequestEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequest_ResponseRequiredDate() {
		return (EAttribute)custRequestEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequest_SalesChannelEnumId() {
		return (EReference)custRequestEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequest_StatusId() {
		return (EReference)custRequestEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequest_CustRequestAttributes() {
		return (EAttribute)custRequestEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequest_CustRequestCommEvents() {
		return (EAttribute)custRequestEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequest_CustRequestItems() {
		return (EAttribute)custRequestEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequest_CustRequestNotes() {
		return (EAttribute)custRequestEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequest_CustRequestWorkEfforts() {
		return (EAttribute)custRequestEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCustRequest__CustRequestStatuss() {
		return custRequestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCustRequest__QuoteItems() {
		return custRequestEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustRequestAttribute() {
		return custRequestAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequestAttribute_CustRequestId() {
		return (EReference)custRequestAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestAttribute_AttrName() {
		return (EAttribute)custRequestAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestAttribute_AttrDescription() {
		return (EAttribute)custRequestAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestAttribute_AttrValue() {
		return (EAttribute)custRequestAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustRequestCategory() {
		return custRequestCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestCategory_CustRequestCategoryId() {
		return (EAttribute)custRequestCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequestCategory_CustRequestTypeId() {
		return (EReference)custRequestCategoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCustRequestCategory__CustRequests() {
		return custRequestCategoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestCategory_Description() {
		return (EAttribute)custRequestCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustRequestCommEvent() {
		return custRequestCommEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequestCommEvent_CustRequestId() {
		return (EReference)custRequestCommEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequestCommEvent_CommunicationEventId() {
		return (EReference)custRequestCommEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustRequestContent() {
		return custRequestContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequestContent_CustRequestId() {
		return (EReference)custRequestContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequestContent_ContentId() {
		return (EReference)custRequestContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestContent_FromDate() {
		return (EAttribute)custRequestContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestContent_ThruDate() {
		return (EAttribute)custRequestContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustRequestItem() {
		return custRequestItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequestItem_CustRequestId() {
		return (EReference)custRequestItemEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestItem_CustRequestItemSeqId() {
		return (EAttribute)custRequestItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestItem_ConfigId() {
		return (EAttribute)custRequestItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequestItem_CustRequestResolutionId() {
		return (EReference)custRequestItemEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestItem_Description() {
		return (EAttribute)custRequestItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestItem_MaximumAmount() {
		return (EAttribute)custRequestItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestItem_Priority() {
		return (EAttribute)custRequestItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequestItem_ProductId() {
		return (EReference)custRequestItemEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestItem_Quantity() {
		return (EAttribute)custRequestItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestItem_RequiredByDate() {
		return (EAttribute)custRequestItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestItem_ReservLength() {
		return (EAttribute)custRequestItemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestItem_ReservPersons() {
		return (EAttribute)custRequestItemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestItem_ReservStart() {
		return (EAttribute)custRequestItemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestItem_SelectedAmount() {
		return (EAttribute)custRequestItemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestItem_SequenceNum() {
		return (EAttribute)custRequestItemEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequestItem_StatusId() {
		return (EReference)custRequestItemEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestItem_Story() {
		return (EAttribute)custRequestItemEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustRequestItemNote() {
		return custRequestItemNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestItemNote_CustRequestId() {
		return (EAttribute)custRequestItemNoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestItemNote_CustRequestItemSeqId() {
		return (EAttribute)custRequestItemNoteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustRequestItemWorkEffort() {
		return custRequestItemWorkEffortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequestItemWorkEffort_CustRequestId() {
		return (EReference)custRequestItemWorkEffortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestItemWorkEffort_CustRequestItemSeqId() {
		return (EAttribute)custRequestItemWorkEffortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequestItemWorkEffort_WorkEffortId() {
		return (EReference)custRequestItemWorkEffortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustRequestNote() {
		return custRequestNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequestNote_CustRequestId() {
		return (EReference)custRequestNoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustRequestParty() {
		return custRequestPartyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequestParty_CustRequestId() {
		return (EReference)custRequestPartyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequestParty_PartyId() {
		return (EReference)custRequestPartyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequestParty_RoleTypeId() {
		return (EReference)custRequestPartyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestParty_FromDate() {
		return (EAttribute)custRequestPartyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestParty_ThruDate() {
		return (EAttribute)custRequestPartyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustRequestResolution() {
		return custRequestResolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestResolution_CustRequestResolutionId() {
		return (EAttribute)custRequestResolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequestResolution_CustRequestTypeId() {
		return (EReference)custRequestResolutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCustRequestResolution__CustRequestItems() {
		return custRequestResolutionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestResolution_Description() {
		return (EAttribute)custRequestResolutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustRequestStatus() {
		return custRequestStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestStatus_CustRequestStatusId() {
		return (EAttribute)custRequestStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequestStatus_ChangeByUserLoginId() {
		return (EReference)custRequestStatusEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequestStatus_CustRequestId() {
		return (EReference)custRequestStatusEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestStatus_CustRequestItemSeqId() {
		return (EAttribute)custRequestStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestStatus_StatusDate() {
		return (EAttribute)custRequestStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequestStatus_StatusId() {
		return (EReference)custRequestStatusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustRequestType() {
		return custRequestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestType_CustRequestTypeId() {
		return (EAttribute)custRequestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestType_Description() {
		return (EAttribute)custRequestTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestType_HasTable() {
		return (EAttribute)custRequestTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequestType_ParentTypeId() {
		return (EReference)custRequestTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequestType_PartyId() {
		return (EReference)custRequestTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestType_CustRequestTypeAttrs() {
		return (EAttribute)custRequestTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCustRequestType__ChildCustRequestTypes() {
		return custRequestTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCustRequestType__CustRequestCategories() {
		return custRequestTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCustRequestType__CustRequestResolutions() {
		return custRequestTypeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCustRequestType__CustRequests() {
		return custRequestTypeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustRequestTypeAttr() {
		return custRequestTypeAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequestTypeAttr_CustRequestTypeId() {
		return (EReference)custRequestTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestTypeAttr_AttrName() {
		return (EAttribute)custRequestTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustRequestTypeAttr_Description() {
		return (EAttribute)custRequestTypeAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustRequestWorkEffort() {
		return custRequestWorkEffortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequestWorkEffort_CustRequestId() {
		return (EReference)custRequestWorkEffortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustRequestWorkEffort_WorkEffortId() {
		return (EReference)custRequestWorkEffortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRespondingParty() {
		return respondingPartyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRespondingParty_RespondingPartySeqId() {
		return (EAttribute)respondingPartyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRespondingParty_CustRequestId() {
		return (EReference)respondingPartyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRespondingParty_PartyId() {
		return (EReference)respondingPartyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRespondingParty_ContactMechId() {
		return (EReference)respondingPartyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRespondingParty_DateSent() {
		return (EAttribute)respondingPartyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestFactory getRequestFactory() {
		return (RequestFactory)getEFactoryInstance();
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
		custRequestEClass = createEClass(CUST_REQUEST);
		createEAttribute(custRequestEClass, CUST_REQUEST__CUST_REQUEST_ID);
		createEAttribute(custRequestEClass, CUST_REQUEST__CLOSED_DATE_TIME);
		createEAttribute(custRequestEClass, CUST_REQUEST__CREATED_BY_USER_LOGIN);
		createEAttribute(custRequestEClass, CUST_REQUEST__CREATED_DATE);
		createEAttribute(custRequestEClass, CUST_REQUEST__CUST_REQUEST_DATE);
		createEAttribute(custRequestEClass, CUST_REQUEST__CUST_REQUEST_NAME);
		createEAttribute(custRequestEClass, CUST_REQUEST__DESCRIPTION);
		createEAttribute(custRequestEClass, CUST_REQUEST__INTERNAL_COMMENT);
		createEAttribute(custRequestEClass, CUST_REQUEST__LAST_MODIFIED_BY_USER_LOGIN);
		createEAttribute(custRequestEClass, CUST_REQUEST__LAST_MODIFIED_DATE);
		createEAttribute(custRequestEClass, CUST_REQUEST__OPEN_DATE_TIME);
		createEAttribute(custRequestEClass, CUST_REQUEST__PRIORITY);
		createEAttribute(custRequestEClass, CUST_REQUEST__REASON);
		createEAttribute(custRequestEClass, CUST_REQUEST__RESPONSE_REQUIRED_DATE);
		createEReference(custRequestEClass, CUST_REQUEST__CUST_REQUEST_TYPE_ID);
		createEReference(custRequestEClass, CUST_REQUEST__CUST_REQUEST_CATEGORY_ID);
		createEReference(custRequestEClass, CUST_REQUEST__STATUS_ID);
		createEReference(custRequestEClass, CUST_REQUEST__FROM_PARTY_ID);
		createEReference(custRequestEClass, CUST_REQUEST__MAXIMUM_AMOUNT_UOM_ID);
		createEReference(custRequestEClass, CUST_REQUEST__PRODUCT_STORE_ID);
		createEReference(custRequestEClass, CUST_REQUEST__SALES_CHANNEL_ENUM_ID);
		createEReference(custRequestEClass, CUST_REQUEST__FULFILL_CONTACT_MECH_ID);
		createEReference(custRequestEClass, CUST_REQUEST__CURRENCY_UOM_ID);
		createEAttribute(custRequestEClass, CUST_REQUEST__CUST_REQUEST_ATTRIBUTES);
		createEAttribute(custRequestEClass, CUST_REQUEST__CUST_REQUEST_COMM_EVENTS);
		createEAttribute(custRequestEClass, CUST_REQUEST__CUST_REQUEST_ITEMS);
		createEAttribute(custRequestEClass, CUST_REQUEST__CUST_REQUEST_NOTES);
		createEAttribute(custRequestEClass, CUST_REQUEST__CUST_REQUEST_WORK_EFFORTS);
		createEOperation(custRequestEClass, CUST_REQUEST___CUST_REQUEST_STATUSS);
		createEOperation(custRequestEClass, CUST_REQUEST___QUOTE_ITEMS);

		custRequestAttributeEClass = createEClass(CUST_REQUEST_ATTRIBUTE);
		createEAttribute(custRequestAttributeEClass, CUST_REQUEST_ATTRIBUTE__ATTR_NAME);
		createEAttribute(custRequestAttributeEClass, CUST_REQUEST_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(custRequestAttributeEClass, CUST_REQUEST_ATTRIBUTE__ATTR_VALUE);
		createEReference(custRequestAttributeEClass, CUST_REQUEST_ATTRIBUTE__CUST_REQUEST_ID);

		custRequestCategoryEClass = createEClass(CUST_REQUEST_CATEGORY);
		createEAttribute(custRequestCategoryEClass, CUST_REQUEST_CATEGORY__CUST_REQUEST_CATEGORY_ID);
		createEAttribute(custRequestCategoryEClass, CUST_REQUEST_CATEGORY__DESCRIPTION);
		createEReference(custRequestCategoryEClass, CUST_REQUEST_CATEGORY__CUST_REQUEST_TYPE_ID);
		createEOperation(custRequestCategoryEClass, CUST_REQUEST_CATEGORY___CUST_REQUESTS);

		custRequestCommEventEClass = createEClass(CUST_REQUEST_COMM_EVENT);
		createEReference(custRequestCommEventEClass, CUST_REQUEST_COMM_EVENT__CUST_REQUEST_ID);
		createEReference(custRequestCommEventEClass, CUST_REQUEST_COMM_EVENT__COMMUNICATION_EVENT_ID);

		custRequestContentEClass = createEClass(CUST_REQUEST_CONTENT);
		createEAttribute(custRequestContentEClass, CUST_REQUEST_CONTENT__FROM_DATE);
		createEAttribute(custRequestContentEClass, CUST_REQUEST_CONTENT__THRU_DATE);
		createEReference(custRequestContentEClass, CUST_REQUEST_CONTENT__CUST_REQUEST_ID);
		createEReference(custRequestContentEClass, CUST_REQUEST_CONTENT__CONTENT_ID);

		custRequestItemEClass = createEClass(CUST_REQUEST_ITEM);
		createEAttribute(custRequestItemEClass, CUST_REQUEST_ITEM__CUST_REQUEST_ITEM_SEQ_ID);
		createEAttribute(custRequestItemEClass, CUST_REQUEST_ITEM__CONFIG_ID);
		createEAttribute(custRequestItemEClass, CUST_REQUEST_ITEM__DESCRIPTION);
		createEAttribute(custRequestItemEClass, CUST_REQUEST_ITEM__MAXIMUM_AMOUNT);
		createEAttribute(custRequestItemEClass, CUST_REQUEST_ITEM__PRIORITY);
		createEAttribute(custRequestItemEClass, CUST_REQUEST_ITEM__QUANTITY);
		createEAttribute(custRequestItemEClass, CUST_REQUEST_ITEM__REQUIRED_BY_DATE);
		createEAttribute(custRequestItemEClass, CUST_REQUEST_ITEM__RESERV_LENGTH);
		createEAttribute(custRequestItemEClass, CUST_REQUEST_ITEM__RESERV_PERSONS);
		createEAttribute(custRequestItemEClass, CUST_REQUEST_ITEM__RESERV_START);
		createEAttribute(custRequestItemEClass, CUST_REQUEST_ITEM__SELECTED_AMOUNT);
		createEAttribute(custRequestItemEClass, CUST_REQUEST_ITEM__SEQUENCE_NUM);
		createEAttribute(custRequestItemEClass, CUST_REQUEST_ITEM__STORY);
		createEReference(custRequestItemEClass, CUST_REQUEST_ITEM__CUST_REQUEST_ID);
		createEReference(custRequestItemEClass, CUST_REQUEST_ITEM__STATUS_ID);
		createEReference(custRequestItemEClass, CUST_REQUEST_ITEM__CUST_REQUEST_RESOLUTION_ID);
		createEReference(custRequestItemEClass, CUST_REQUEST_ITEM__PRODUCT_ID);

		custRequestItemNoteEClass = createEClass(CUST_REQUEST_ITEM_NOTE);
		createEAttribute(custRequestItemNoteEClass, CUST_REQUEST_ITEM_NOTE__CUST_REQUEST_ID);
		createEAttribute(custRequestItemNoteEClass, CUST_REQUEST_ITEM_NOTE__CUST_REQUEST_ITEM_SEQ_ID);

		custRequestItemWorkEffortEClass = createEClass(CUST_REQUEST_ITEM_WORK_EFFORT);
		createEAttribute(custRequestItemWorkEffortEClass, CUST_REQUEST_ITEM_WORK_EFFORT__CUST_REQUEST_ITEM_SEQ_ID);
		createEReference(custRequestItemWorkEffortEClass, CUST_REQUEST_ITEM_WORK_EFFORT__CUST_REQUEST_ID);
		createEReference(custRequestItemWorkEffortEClass, CUST_REQUEST_ITEM_WORK_EFFORT__WORK_EFFORT_ID);

		custRequestNoteEClass = createEClass(CUST_REQUEST_NOTE);
		createEReference(custRequestNoteEClass, CUST_REQUEST_NOTE__CUST_REQUEST_ID);

		custRequestPartyEClass = createEClass(CUST_REQUEST_PARTY);
		createEAttribute(custRequestPartyEClass, CUST_REQUEST_PARTY__FROM_DATE);
		createEAttribute(custRequestPartyEClass, CUST_REQUEST_PARTY__THRU_DATE);
		createEReference(custRequestPartyEClass, CUST_REQUEST_PARTY__CUST_REQUEST_ID);
		createEReference(custRequestPartyEClass, CUST_REQUEST_PARTY__PARTY_ID);
		createEReference(custRequestPartyEClass, CUST_REQUEST_PARTY__ROLE_TYPE_ID);

		custRequestResolutionEClass = createEClass(CUST_REQUEST_RESOLUTION);
		createEAttribute(custRequestResolutionEClass, CUST_REQUEST_RESOLUTION__CUST_REQUEST_RESOLUTION_ID);
		createEAttribute(custRequestResolutionEClass, CUST_REQUEST_RESOLUTION__DESCRIPTION);
		createEReference(custRequestResolutionEClass, CUST_REQUEST_RESOLUTION__CUST_REQUEST_TYPE_ID);
		createEOperation(custRequestResolutionEClass, CUST_REQUEST_RESOLUTION___CUST_REQUEST_ITEMS);

		custRequestStatusEClass = createEClass(CUST_REQUEST_STATUS);
		createEAttribute(custRequestStatusEClass, CUST_REQUEST_STATUS__CUST_REQUEST_STATUS_ID);
		createEAttribute(custRequestStatusEClass, CUST_REQUEST_STATUS__CUST_REQUEST_ITEM_SEQ_ID);
		createEAttribute(custRequestStatusEClass, CUST_REQUEST_STATUS__STATUS_DATE);
		createEReference(custRequestStatusEClass, CUST_REQUEST_STATUS__STATUS_ID);
		createEReference(custRequestStatusEClass, CUST_REQUEST_STATUS__CUST_REQUEST_ID);
		createEReference(custRequestStatusEClass, CUST_REQUEST_STATUS__CHANGE_BY_USER_LOGIN_ID);

		custRequestTypeEClass = createEClass(CUST_REQUEST_TYPE);
		createEAttribute(custRequestTypeEClass, CUST_REQUEST_TYPE__CUST_REQUEST_TYPE_ID);
		createEAttribute(custRequestTypeEClass, CUST_REQUEST_TYPE__DESCRIPTION);
		createEAttribute(custRequestTypeEClass, CUST_REQUEST_TYPE__HAS_TABLE);
		createEReference(custRequestTypeEClass, CUST_REQUEST_TYPE__PARENT_TYPE_ID);
		createEReference(custRequestTypeEClass, CUST_REQUEST_TYPE__PARTY_ID);
		createEAttribute(custRequestTypeEClass, CUST_REQUEST_TYPE__CUST_REQUEST_TYPE_ATTRS);
		createEOperation(custRequestTypeEClass, CUST_REQUEST_TYPE___CHILD_CUST_REQUEST_TYPES);
		createEOperation(custRequestTypeEClass, CUST_REQUEST_TYPE___CUST_REQUEST_CATEGORIES);
		createEOperation(custRequestTypeEClass, CUST_REQUEST_TYPE___CUST_REQUEST_RESOLUTIONS);
		createEOperation(custRequestTypeEClass, CUST_REQUEST_TYPE___CUST_REQUESTS);

		custRequestTypeAttrEClass = createEClass(CUST_REQUEST_TYPE_ATTR);
		createEAttribute(custRequestTypeAttrEClass, CUST_REQUEST_TYPE_ATTR__ATTR_NAME);
		createEAttribute(custRequestTypeAttrEClass, CUST_REQUEST_TYPE_ATTR__DESCRIPTION);
		createEReference(custRequestTypeAttrEClass, CUST_REQUEST_TYPE_ATTR__CUST_REQUEST_TYPE_ID);

		custRequestWorkEffortEClass = createEClass(CUST_REQUEST_WORK_EFFORT);
		createEReference(custRequestWorkEffortEClass, CUST_REQUEST_WORK_EFFORT__CUST_REQUEST_ID);
		createEReference(custRequestWorkEffortEClass, CUST_REQUEST_WORK_EFFORT__WORK_EFFORT_ID);

		respondingPartyEClass = createEClass(RESPONDING_PARTY);
		createEAttribute(respondingPartyEClass, RESPONDING_PARTY__RESPONDING_PARTY_SEQ_ID);
		createEAttribute(respondingPartyEClass, RESPONDING_PARTY__DATE_SENT);
		createEReference(respondingPartyEClass, RESPONDING_PARTY__CUST_REQUEST_ID);
		createEReference(respondingPartyEClass, RESPONDING_PARTY__PARTY_ID);
		createEReference(respondingPartyEClass, RESPONDING_PARTY__CONTACT_MECH_ID);
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
		StatusPackage theStatusPackage = (StatusPackage)EPackage.Registry.INSTANCE.getEPackage(StatusPackage.eNS_URI);
		PartyPackage thePartyPackage = (PartyPackage)EPackage.Registry.INSTANCE.getEPackage(PartyPackage.eNS_URI);
		UomPackage theUomPackage = (UomPackage)EPackage.Registry.INSTANCE.getEPackage(UomPackage.eNS_URI);
		StorePackage theStorePackage = (StorePackage)EPackage.Registry.INSTANCE.getEPackage(StorePackage.eNS_URI);
		EnumPackage theEnumPackage = (EnumPackage)EPackage.Registry.INSTANCE.getEPackage(EnumPackage.eNS_URI);
		org.abchip.mimo.biz.party.contact.ContactPackage theContactPackage_1 = (org.abchip.mimo.biz.party.contact.ContactPackage)EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.party.contact.ContactPackage.eNS_URI);
		CommunicationPackage theCommunicationPackage = (CommunicationPackage)EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI);
		ContentPackage theContentPackage = (ContentPackage)EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);
		ProductPackage theProductPackage = (ProductPackage)EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI);
		WorkeffortPackage theWorkeffortPackage = (WorkeffortPackage)EPackage.Registry.INSTANCE.getEPackage(WorkeffortPackage.eNS_URI);
		LoginPackage theLoginPackage = (LoginPackage)EPackage.Registry.INSTANCE.getEPackage(LoginPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		EGenericType g2 = createEGenericType(this.getCustRequestType());
		g1.getETypeArguments().add(g2);
		custRequestEClass.getEGenericSuperTypes().add(g1);
		custRequestAttributeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		custRequestCategoryEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		custRequestCommEventEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		custRequestContentEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		custRequestItemEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		custRequestItemNoteEClass.getESuperTypes().add(theBizPackage.getBizEntityNote());
		custRequestItemWorkEffortEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		custRequestNoteEClass.getESuperTypes().add(theBizPackage.getBizEntityNote());
		custRequestPartyEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		custRequestResolutionEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		custRequestStatusEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getCustRequest());
		g1.getETypeArguments().add(g2);
		custRequestTypeEClass.getEGenericSuperTypes().add(g1);
		custRequestTypeAttrEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		custRequestWorkEffortEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		respondingPartyEClass.getESuperTypes().add(theBizPackage.getBizEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(custRequestEClass, CustRequest.class, "CustRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustRequest_CustRequestId(), ecorePackage.getEString(), "custRequestId", null, 1, 1, CustRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequest_ClosedDateTime(), ecorePackage.getEDate(), "closedDateTime", null, 0, 1, CustRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequest_CreatedByUserLogin(), ecorePackage.getEString(), "createdByUserLogin", null, 0, 1, CustRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequest_CreatedDate(), ecorePackage.getEDate(), "createdDate", null, 0, 1, CustRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequest_CustRequestDate(), ecorePackage.getEDate(), "custRequestDate", null, 0, 1, CustRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequest_CustRequestName(), ecorePackage.getEString(), "custRequestName", null, 0, 1, CustRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequest_Description(), ecorePackage.getEString(), "description", null, 0, 1, CustRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequest_InternalComment(), ecorePackage.getEString(), "internalComment", null, 0, 1, CustRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequest_LastModifiedByUserLogin(), ecorePackage.getEString(), "lastModifiedByUserLogin", null, 0, 1, CustRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequest_LastModifiedDate(), ecorePackage.getEDate(), "lastModifiedDate", null, 0, 1, CustRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequest_OpenDateTime(), ecorePackage.getEDate(), "openDateTime", null, 0, 1, CustRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequest_Priority(), ecorePackage.getELong(), "priority", null, 0, 1, CustRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequest_Reason(), ecorePackage.getEString(), "reason", null, 0, 1, CustRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequest_ResponseRequiredDate(), ecorePackage.getEDate(), "responseRequiredDate", null, 0, 1, CustRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustRequest_CustRequestTypeId(), this.getCustRequestType(), null, "custRequestTypeId", null, 0, 1, CustRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequest_CustRequestTypeId().getEKeys().add(this.getCustRequestType_CustRequestTypeId());
		initEReference(getCustRequest_CustRequestCategoryId(), this.getCustRequestCategory(), null, "custRequestCategoryId", null, 0, 1, CustRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequest_CustRequestCategoryId().getEKeys().add(this.getCustRequestCategory_CustRequestCategoryId());
		initEReference(getCustRequest_StatusId(), theStatusPackage.getStatusItem(), null, "statusId", null, 0, 1, CustRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequest_StatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEReference(getCustRequest_FromPartyId(), thePartyPackage.getParty(), null, "fromPartyId", null, 0, 1, CustRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequest_FromPartyId().getEKeys().add(thePartyPackage.getParty_PartyId());
		initEReference(getCustRequest_MaximumAmountUomId(), theUomPackage.getUom(), null, "maximumAmountUomId", null, 0, 1, CustRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequest_MaximumAmountUomId().getEKeys().add(theUomPackage.getUom_UomId());
		initEReference(getCustRequest_ProductStoreId(), theStorePackage.getProductStore(), null, "productStoreId", null, 0, 1, CustRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequest_ProductStoreId().getEKeys().add(theStorePackage.getProductStore_ProductStoreId());
		initEReference(getCustRequest_SalesChannelEnumId(), theEnumPackage.getEnumeration(), null, "salesChannelEnumId", null, 0, 1, CustRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequest_SalesChannelEnumId().getEKeys().add(theEnumPackage.getEnumeration_EnumId());
		initEReference(getCustRequest_FulfillContactMechId(), theContactPackage_1.getContactMech(), null, "fulfillContactMechId", null, 0, 1, CustRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequest_FulfillContactMechId().getEKeys().add(theContactPackage_1.getContactMech_ContactMechId());
		initEReference(getCustRequest_CurrencyUomId(), theUomPackage.getUom(), null, "currencyUomId", null, 0, 1, CustRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequest_CurrencyUomId().getEKeys().add(theUomPackage.getUom_UomId());
		initEAttribute(getCustRequest_CustRequestAttributes(), ecorePackage.getEString(), "custRequestAttributes", null, 0, -1, CustRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequest_CustRequestCommEvents(), ecorePackage.getEString(), "custRequestCommEvents", null, 0, -1, CustRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequest_CustRequestItems(), ecorePackage.getEString(), "custRequestItems", null, 0, -1, CustRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequest_CustRequestNotes(), ecorePackage.getEString(), "custRequestNotes", null, 0, -1, CustRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequest_CustRequestWorkEfforts(), ecorePackage.getEString(), "custRequestWorkEfforts", null, 0, -1, CustRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCustRequest__CustRequestStatuss(), ecorePackage.getEString(), "custRequestStatuss", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCustRequest__QuoteItems(), ecorePackage.getEString(), "quoteItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(custRequestAttributeEClass, CustRequestAttribute.class, "CustRequestAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustRequestAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, CustRequestAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequestAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, CustRequestAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequestAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, CustRequestAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustRequestAttribute_CustRequestId(), this.getCustRequest(), null, "custRequestId", null, 0, 1, CustRequestAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequestAttribute_CustRequestId().getEKeys().add(this.getCustRequest_CustRequestId());

		initEClass(custRequestCategoryEClass, CustRequestCategory.class, "CustRequestCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustRequestCategory_CustRequestCategoryId(), ecorePackage.getEString(), "custRequestCategoryId", null, 1, 1, CustRequestCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequestCategory_Description(), ecorePackage.getEString(), "description", null, 0, 1, CustRequestCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustRequestCategory_CustRequestTypeId(), this.getCustRequestType(), null, "custRequestTypeId", null, 0, 1, CustRequestCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequestCategory_CustRequestTypeId().getEKeys().add(this.getCustRequestType_CustRequestTypeId());

		initEOperation(getCustRequestCategory__CustRequests(), ecorePackage.getEString(), "custRequests", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(custRequestCommEventEClass, CustRequestCommEvent.class, "CustRequestCommEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustRequestCommEvent_CustRequestId(), this.getCustRequest(), null, "custRequestId", null, 0, 1, CustRequestCommEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequestCommEvent_CustRequestId().getEKeys().add(this.getCustRequest_CustRequestId());
		initEReference(getCustRequestCommEvent_CommunicationEventId(), theCommunicationPackage.getCommunicationEvent(), null, "communicationEventId", null, 0, 1, CustRequestCommEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequestCommEvent_CommunicationEventId().getEKeys().add(theCommunicationPackage.getCommunicationEvent_CommunicationEventId());

		initEClass(custRequestContentEClass, CustRequestContent.class, "CustRequestContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustRequestContent_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, CustRequestContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequestContent_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, CustRequestContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustRequestContent_CustRequestId(), this.getCustRequest(), null, "custRequestId", null, 0, 1, CustRequestContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequestContent_CustRequestId().getEKeys().add(this.getCustRequest_CustRequestId());
		initEReference(getCustRequestContent_ContentId(), theContentPackage.getContent(), null, "contentId", null, 0, 1, CustRequestContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequestContent_ContentId().getEKeys().add(theContentPackage.getContent_ContentId());

		initEClass(custRequestItemEClass, CustRequestItem.class, "CustRequestItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustRequestItem_CustRequestItemSeqId(), ecorePackage.getEString(), "custRequestItemSeqId", null, 1, 1, CustRequestItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequestItem_ConfigId(), ecorePackage.getEString(), "configId", null, 0, 1, CustRequestItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequestItem_Description(), ecorePackage.getEString(), "description", null, 0, 1, CustRequestItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequestItem_MaximumAmount(), ecorePackage.getEBigDecimal(), "maximumAmount", null, 0, 1, CustRequestItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequestItem_Priority(), ecorePackage.getELong(), "priority", null, 0, 1, CustRequestItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequestItem_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, CustRequestItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequestItem_RequiredByDate(), ecorePackage.getEDate(), "requiredByDate", null, 0, 1, CustRequestItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequestItem_ReservLength(), ecorePackage.getEBigDecimal(), "reservLength", null, 0, 1, CustRequestItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequestItem_ReservPersons(), ecorePackage.getEBigDecimal(), "reservPersons", null, 0, 1, CustRequestItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequestItem_ReservStart(), ecorePackage.getEDate(), "reservStart", null, 0, 1, CustRequestItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequestItem_SelectedAmount(), ecorePackage.getEBigDecimal(), "selectedAmount", null, 0, 1, CustRequestItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequestItem_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, CustRequestItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequestItem_Story(), ecorePackage.getEString(), "story", null, 0, 1, CustRequestItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustRequestItem_CustRequestId(), this.getCustRequest(), null, "custRequestId", null, 0, 1, CustRequestItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequestItem_CustRequestId().getEKeys().add(this.getCustRequest_CustRequestId());
		initEReference(getCustRequestItem_StatusId(), theStatusPackage.getStatusItem(), null, "statusId", null, 0, 1, CustRequestItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequestItem_StatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEReference(getCustRequestItem_CustRequestResolutionId(), this.getCustRequestResolution(), null, "custRequestResolutionId", null, 0, 1, CustRequestItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequestItem_CustRequestResolutionId().getEKeys().add(this.getCustRequestResolution_CustRequestResolutionId());
		initEReference(getCustRequestItem_ProductId(), theProductPackage.getProduct(), null, "productId", null, 0, 1, CustRequestItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequestItem_ProductId().getEKeys().add(theProductPackage.getProduct_ProductId());

		initEClass(custRequestItemNoteEClass, CustRequestItemNote.class, "CustRequestItemNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustRequestItemNote_CustRequestId(), ecorePackage.getEString(), "custRequestId", null, 1, 1, CustRequestItemNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequestItemNote_CustRequestItemSeqId(), ecorePackage.getEString(), "custRequestItemSeqId", null, 1, 1, CustRequestItemNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(custRequestItemWorkEffortEClass, CustRequestItemWorkEffort.class, "CustRequestItemWorkEffort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustRequestItemWorkEffort_CustRequestItemSeqId(), ecorePackage.getEString(), "custRequestItemSeqId", null, 1, 1, CustRequestItemWorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustRequestItemWorkEffort_CustRequestId(), this.getCustRequest(), null, "custRequestId", null, 0, 1, CustRequestItemWorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequestItemWorkEffort_CustRequestId().getEKeys().add(this.getCustRequest_CustRequestId());
		initEReference(getCustRequestItemWorkEffort_WorkEffortId(), theWorkeffortPackage.getWorkEffort(), null, "workEffortId", null, 0, 1, CustRequestItemWorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequestItemWorkEffort_WorkEffortId().getEKeys().add(theWorkeffortPackage.getWorkEffort_WorkEffortId());

		initEClass(custRequestNoteEClass, CustRequestNote.class, "CustRequestNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustRequestNote_CustRequestId(), this.getCustRequest(), null, "custRequestId", null, 0, 1, CustRequestNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequestNote_CustRequestId().getEKeys().add(this.getCustRequest_CustRequestId());

		initEClass(custRequestPartyEClass, CustRequestParty.class, "CustRequestParty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustRequestParty_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, CustRequestParty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequestParty_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, CustRequestParty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustRequestParty_CustRequestId(), this.getCustRequest(), null, "custRequestId", null, 0, 1, CustRequestParty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequestParty_CustRequestId().getEKeys().add(this.getCustRequest_CustRequestId());
		initEReference(getCustRequestParty_PartyId(), thePartyPackage.getParty(), null, "partyId", null, 0, 1, CustRequestParty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequestParty_PartyId().getEKeys().add(thePartyPackage.getParty_PartyId());
		initEReference(getCustRequestParty_RoleTypeId(), thePartyPackage.getRoleType(), null, "roleTypeId", null, 0, 1, CustRequestParty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequestParty_RoleTypeId().getEKeys().add(thePartyPackage.getRoleType_RoleTypeId());

		initEClass(custRequestResolutionEClass, CustRequestResolution.class, "CustRequestResolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustRequestResolution_CustRequestResolutionId(), ecorePackage.getEString(), "custRequestResolutionId", null, 1, 1, CustRequestResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequestResolution_Description(), ecorePackage.getEString(), "description", null, 0, 1, CustRequestResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustRequestResolution_CustRequestTypeId(), this.getCustRequestType(), null, "custRequestTypeId", null, 0, 1, CustRequestResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequestResolution_CustRequestTypeId().getEKeys().add(this.getCustRequestType_CustRequestTypeId());

		initEOperation(getCustRequestResolution__CustRequestItems(), ecorePackage.getEString(), "custRequestItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(custRequestStatusEClass, CustRequestStatus.class, "CustRequestStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustRequestStatus_CustRequestStatusId(), ecorePackage.getEString(), "custRequestStatusId", null, 1, 1, CustRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequestStatus_CustRequestItemSeqId(), ecorePackage.getEString(), "custRequestItemSeqId", null, 0, 1, CustRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequestStatus_StatusDate(), ecorePackage.getEDate(), "statusDate", null, 0, 1, CustRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustRequestStatus_StatusId(), theStatusPackage.getStatusItem(), null, "statusId", null, 0, 1, CustRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequestStatus_StatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEReference(getCustRequestStatus_CustRequestId(), this.getCustRequest(), null, "custRequestId", null, 0, 1, CustRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequestStatus_CustRequestId().getEKeys().add(this.getCustRequest_CustRequestId());
		initEReference(getCustRequestStatus_ChangeByUserLoginId(), theLoginPackage.getUserLogin(), null, "changeByUserLoginId", null, 0, 1, CustRequestStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequestStatus_ChangeByUserLoginId().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());

		initEClass(custRequestTypeEClass, CustRequestType.class, "CustRequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustRequestType_CustRequestTypeId(), ecorePackage.getEString(), "custRequestTypeId", null, 1, 1, CustRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequestType_Description(), ecorePackage.getEString(), "description", null, 0, 1, CustRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequestType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, CustRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustRequestType_ParentTypeId(), this.getCustRequestType(), null, "parentTypeId", null, 0, 1, CustRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequestType_ParentTypeId().getEKeys().add(this.getCustRequestType_CustRequestTypeId());
		initEReference(getCustRequestType_PartyId(), thePartyPackage.getParty(), null, "partyId", null, 0, 1, CustRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequestType_PartyId().getEKeys().add(thePartyPackage.getParty_PartyId());
		initEAttribute(getCustRequestType_CustRequestTypeAttrs(), ecorePackage.getEString(), "custRequestTypeAttrs", null, 0, -1, CustRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCustRequestType__ChildCustRequestTypes(), ecorePackage.getEString(), "childCustRequestTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCustRequestType__CustRequestCategories(), ecorePackage.getEString(), "custRequestCategories", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCustRequestType__CustRequestResolutions(), ecorePackage.getEString(), "custRequestResolutions", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCustRequestType__CustRequests(), ecorePackage.getEString(), "custRequests", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(custRequestTypeAttrEClass, CustRequestTypeAttr.class, "CustRequestTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustRequestTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, CustRequestTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustRequestTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, CustRequestTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustRequestTypeAttr_CustRequestTypeId(), this.getCustRequestType(), null, "custRequestTypeId", null, 0, 1, CustRequestTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequestTypeAttr_CustRequestTypeId().getEKeys().add(this.getCustRequestType_CustRequestTypeId());

		initEClass(custRequestWorkEffortEClass, CustRequestWorkEffort.class, "CustRequestWorkEffort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustRequestWorkEffort_CustRequestId(), this.getCustRequest(), null, "custRequestId", null, 0, 1, CustRequestWorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequestWorkEffort_CustRequestId().getEKeys().add(this.getCustRequest_CustRequestId());
		initEReference(getCustRequestWorkEffort_WorkEffortId(), theWorkeffortPackage.getWorkEffort(), null, "workEffortId", null, 0, 1, CustRequestWorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCustRequestWorkEffort_WorkEffortId().getEKeys().add(theWorkeffortPackage.getWorkEffort_WorkEffortId());

		initEClass(respondingPartyEClass, RespondingParty.class, "RespondingParty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRespondingParty_RespondingPartySeqId(), ecorePackage.getEString(), "respondingPartySeqId", null, 1, 1, RespondingParty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRespondingParty_DateSent(), ecorePackage.getEDate(), "dateSent", null, 0, 1, RespondingParty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRespondingParty_CustRequestId(), this.getCustRequest(), null, "custRequestId", null, 0, 1, RespondingParty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getRespondingParty_CustRequestId().getEKeys().add(this.getCustRequest_CustRequestId());
		initEReference(getRespondingParty_PartyId(), thePartyPackage.getParty(), null, "partyId", null, 0, 1, RespondingParty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getRespondingParty_PartyId().getEKeys().add(thePartyPackage.getParty_PartyId());
		initEReference(getRespondingParty_ContactMechId(), theContactPackage_1.getContactMech(), null, "contactMechId", null, 0, 1, RespondingParty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getRespondingParty_ContactMechId().getEKeys().add(theContactPackage_1.getContactMech_ContactMechId());

		// Create annotations
		// mimo-ent-frame
		createMimoentframeAnnotations();
		// mimo-ent-slot
		createMimoentslotAnnotations();
		// mimo-ent-domain
		createMimoentdomainAnnotations();
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
		  (custRequestEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (custRequestCategoryEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (custRequestItemEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (custRequestResolutionEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (custRequestTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (custRequestTypeAttrEClass,
		   source,
		   new String[] {
			   "formula", "description"
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
		  (getCustRequest__CustRequestStatuss(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getCustRequest__QuoteItems(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getCustRequest_CustRequestId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getCustRequest_CustRequestAttributes(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getCustRequest_CustRequestCommEvents(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getCustRequest_CustRequestItems(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getCustRequest_CustRequestNotes(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getCustRequest_CustRequestWorkEfforts(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getCustRequestAttribute_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getCustRequestCategory__CustRequests(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getCustRequestCategory_CustRequestCategoryId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getCustRequestContent_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getCustRequestItem_CustRequestItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getCustRequestItemNote_CustRequestId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getCustRequestItemNote_CustRequestItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getCustRequestItemWorkEffort_CustRequestItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getCustRequestParty_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getCustRequestResolution__CustRequestItems(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getCustRequestResolution_CustRequestResolutionId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getCustRequestStatus_CustRequestStatusId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getCustRequestType__ChildCustRequestTypes(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getCustRequestType__CustRequestCategories(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getCustRequestType__CustRequestResolutions(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getCustRequestType__CustRequests(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getCustRequestType_CustRequestTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getCustRequestType_CustRequestTypeAttrs(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getCustRequestTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getRespondingParty_RespondingPartySeqId(),
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
		  (getCustRequest__CustRequestStatuss(),
		   source,
		   new String[] {
			   "frame", "CustRequestStatus",
			   "route", "custRequestId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getCustRequest__QuoteItems(),
		   source,
		   new String[] {
			   "frame", "QuoteItem",
			   "route", "custRequestId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getCustRequest_CustRequestAttributes(),
		   source,
		   new String[] {
			   "frame", "CustRequestAttribute"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getCustRequest_CustRequestCommEvents(),
		   source,
		   new String[] {
			   "frame", "CustRequestCommEvent"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getCustRequest_CustRequestItems(),
		   source,
		   new String[] {
			   "frame", "CustRequestItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getCustRequest_CustRequestNotes(),
		   source,
		   new String[] {
			   "frame", "CustRequestNote"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getCustRequest_CustRequestWorkEfforts(),
		   source,
		   new String[] {
			   "frame", "CustRequestWorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getCustRequestCategory__CustRequests(),
		   source,
		   new String[] {
			   "frame", "CustRequest",
			   "route", "custRequestCategoryId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getCustRequestResolution__CustRequestItems(),
		   source,
		   new String[] {
			   "frame", "CustRequestItem",
			   "route", "custRequestResolutionId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getCustRequestType__ChildCustRequestTypes(),
		   source,
		   new String[] {
			   "frame", "CustRequestType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getCustRequestType__CustRequestCategories(),
		   source,
		   new String[] {
			   "frame", "CustRequestCategory",
			   "route", "custRequestTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getCustRequestType__CustRequestResolutions(),
		   source,
		   new String[] {
			   "frame", "CustRequestResolution",
			   "route", "custRequestTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getCustRequestType__CustRequests(),
		   source,
		   new String[] {
			   "frame", "CustRequest",
			   "route", "custRequestTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getCustRequestType_CustRequestTypeAttrs(),
		   source,
		   new String[] {
			   "frame", "CustRequestTypeAttr"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
	}

} //RequestPackageImpl
