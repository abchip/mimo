/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.survey.impl;

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
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl;
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
import org.abchip.mimo.biz.content.survey.Survey;
import org.abchip.mimo.biz.content.survey.SurveyApplType;
import org.abchip.mimo.biz.content.survey.SurveyFactory;
import org.abchip.mimo.biz.content.survey.SurveyMultiResp;
import org.abchip.mimo.biz.content.survey.SurveyMultiRespColumn;
import org.abchip.mimo.biz.content.survey.SurveyPackage;
import org.abchip.mimo.biz.content.survey.SurveyPage;
import org.abchip.mimo.biz.content.survey.SurveyQuestion;
import org.abchip.mimo.biz.content.survey.SurveyQuestionAppl;
import org.abchip.mimo.biz.content.survey.SurveyQuestionCategory;
import org.abchip.mimo.biz.content.survey.SurveyQuestionOption;
import org.abchip.mimo.biz.content.survey.SurveyQuestionType;
import org.abchip.mimo.biz.content.survey.SurveyResponse;
import org.abchip.mimo.biz.content.survey.SurveyResponseAnswer;
import org.abchip.mimo.biz.content.survey.SurveyTrigger;
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
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SurveyPackageImpl extends EPackageImpl implements SurveyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surveyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surveyApplTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surveyMultiRespEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surveyMultiRespColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surveyPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surveyQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surveyQuestionApplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surveyQuestionCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surveyQuestionOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surveyQuestionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surveyResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surveyResponseAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surveyTriggerEClass = null;

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
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SurveyPackageImpl() {
		super(eNS_URI, SurveyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SurveyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SurveyPackage init() {
		if (isInited) return (SurveyPackage)EPackage.Registry.INSTANCE.getEPackage(SurveyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSurveyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SurveyPackageImpl theSurveyPackage = registeredSurveyPackage instanceof SurveyPackageImpl ? (SurveyPackageImpl)registeredSurveyPackage : new SurveyPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PaymentPackage.eNS_URI);
		PaymentPackageImpl thePaymentPackage = (PaymentPackageImpl)(registeredPackage instanceof PaymentPackageImpl ? registeredPackage : PaymentPackage.eINSTANCE);
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
		theSurveyPackage.createPackageContents();
		theBizPackage.createPackageContents();
		theAccountingPackage.createPackageContents();
		theBudgetPackage.createPackageContents();
		theFinaccountPackage.createPackageContents();
		theFixedassetPackage.createPackageContents();
		theInvoicePackage.createPackageContents();
		theLedgerPackage.createPackageContents();
		thePaymentPackage.createPackageContents();
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
		theSurveyPackage.initializePackageContents();
		theBizPackage.initializePackageContents();
		theAccountingPackage.initializePackageContents();
		theBudgetPackage.initializePackageContents();
		theFinaccountPackage.initializePackageContents();
		theFixedassetPackage.initializePackageContents();
		theInvoicePackage.initializePackageContents();
		theLedgerPackage.initializePackageContents();
		thePaymentPackage.initializePackageContents();
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
		theSurveyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SurveyPackage.eNS_URI, theSurveyPackage);
		return theSurveyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSurvey() {
		return surveyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurvey_SurveyId() {
		return (EAttribute)surveyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurvey_AcroFormContentId() {
		return (EAttribute)surveyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurvey_AllowMultiple() {
		return (EAttribute)surveyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurvey_AllowUpdate() {
		return (EAttribute)surveyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurvey_Comments() {
		return (EAttribute)surveyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurvey_Description() {
		return (EAttribute)surveyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurvey_IsAnonymous() {
		return (EAttribute)surveyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurvey_ResponseService() {
		return (EAttribute)surveyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurvey_SubmitCaption() {
		return (EAttribute)surveyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSurvey_SurveyMultiResps() {
		return (EReference)surveyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurvey_SurveyName() {
		return (EAttribute)surveyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSurvey_SurveyPages() {
		return (EReference)surveyEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSurveyApplType() {
		return surveyApplTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyApplType_SurveyApplTypeId() {
		return (EAttribute)surveyApplTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyApplType_Description() {
		return (EAttribute)surveyApplTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSurveyMultiResp() {
		return surveyMultiRespEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSurveyMultiResp_SurveyId() {
		return (EReference)surveyMultiRespEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyMultiResp_SurveyMultiRespId() {
		return (EAttribute)surveyMultiRespEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyMultiResp_MultiRespTitle() {
		return (EAttribute)surveyMultiRespEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSurveyMultiRespColumn() {
		return surveyMultiRespColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyMultiRespColumn_SurveyId() {
		return (EAttribute)surveyMultiRespColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyMultiRespColumn_SurveyMultiRespId() {
		return (EAttribute)surveyMultiRespColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyMultiRespColumn_SurveyMultiRespColId() {
		return (EAttribute)surveyMultiRespColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyMultiRespColumn_ColumnTitle() {
		return (EAttribute)surveyMultiRespColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyMultiRespColumn_SequenceNum() {
		return (EAttribute)surveyMultiRespColumnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSurveyPage() {
		return surveyPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSurveyPage_SurveyId() {
		return (EReference)surveyPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyPage_SurveyPageSeqId() {
		return (EAttribute)surveyPageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyPage_PageName() {
		return (EAttribute)surveyPageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyPage_SequenceNum() {
		return (EAttribute)surveyPageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSurveyQuestion() {
		return surveyQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyQuestion_SurveyQuestionId() {
		return (EAttribute)surveyQuestionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyQuestion_Description() {
		return (EAttribute)surveyQuestionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyQuestion_EnumTypeId() {
		return (EAttribute)surveyQuestionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyQuestion_FormatString() {
		return (EAttribute)surveyQuestionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSurveyQuestion_GeoId() {
		return (EReference)surveyQuestionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyQuestion_Hint() {
		return (EAttribute)surveyQuestionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyQuestion_Question() {
		return (EAttribute)surveyQuestionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSurveyQuestion_SurveyQuestionCategoryId() {
		return (EReference)surveyQuestionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSurveyQuestion_SurveyQuestionOptions() {
		return (EReference)surveyQuestionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSurveyQuestion_SurveyQuestionTypeId() {
		return (EReference)surveyQuestionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSurveyQuestionAppl() {
		return surveyQuestionApplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSurveyQuestionAppl_SurveyId() {
		return (EReference)surveyQuestionApplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSurveyQuestionAppl_SurveyQuestionId() {
		return (EReference)surveyQuestionApplEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyQuestionAppl_FromDate() {
		return (EAttribute)surveyQuestionApplEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyQuestionAppl_ExternalFieldRef() {
		return (EAttribute)surveyQuestionApplEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyQuestionAppl_RequiredField() {
		return (EAttribute)surveyQuestionApplEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyQuestionAppl_SequenceNum() {
		return (EAttribute)surveyQuestionApplEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyQuestionAppl_SurveyMultiRespColId() {
		return (EAttribute)surveyQuestionApplEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyQuestionAppl_SurveyMultiRespId() {
		return (EAttribute)surveyQuestionApplEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyQuestionAppl_SurveyPageSeqId() {
		return (EAttribute)surveyQuestionApplEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyQuestionAppl_ThruDate() {
		return (EAttribute)surveyQuestionApplEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyQuestionAppl_WithSurveyOptionSeqId() {
		return (EAttribute)surveyQuestionApplEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyQuestionAppl_WithSurveyQuestionId() {
		return (EAttribute)surveyQuestionApplEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSurveyQuestionCategory() {
		return surveyQuestionCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyQuestionCategory_SurveyQuestionCategoryId() {
		return (EAttribute)surveyQuestionCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyQuestionCategory_Description() {
		return (EAttribute)surveyQuestionCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSurveyQuestionCategory_ParentCategoryId() {
		return (EReference)surveyQuestionCategoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSurveyQuestionOption() {
		return surveyQuestionOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSurveyQuestionOption_SurveyQuestionId() {
		return (EReference)surveyQuestionOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyQuestionOption_SurveyOptionSeqId() {
		return (EAttribute)surveyQuestionOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyQuestionOption_AmountBase() {
		return (EAttribute)surveyQuestionOptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyQuestionOption_AmountBaseUomId() {
		return (EAttribute)surveyQuestionOptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyQuestionOption_Description() {
		return (EAttribute)surveyQuestionOptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyQuestionOption_Duration() {
		return (EAttribute)surveyQuestionOptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyQuestionOption_DurationUomId() {
		return (EAttribute)surveyQuestionOptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyQuestionOption_SequenceNum() {
		return (EAttribute)surveyQuestionOptionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyQuestionOption_WeightFactor() {
		return (EAttribute)surveyQuestionOptionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSurveyQuestionType() {
		return surveyQuestionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyQuestionType_SurveyQuestionTypeId() {
		return (EAttribute)surveyQuestionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyQuestionType_Description() {
		return (EAttribute)surveyQuestionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSurveyResponse() {
		return surveyResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyResponse_SurveyResponseId() {
		return (EAttribute)surveyResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyResponse_GeneralFeedback() {
		return (EAttribute)surveyResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyResponse_LastModifiedDate() {
		return (EAttribute)surveyResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSurveyResponse_OrderId() {
		return (EReference)surveyResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyResponse_OrderItemSeqId() {
		return (EAttribute)surveyResponseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSurveyResponse_PartyId() {
		return (EReference)surveyResponseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyResponse_ReferenceId() {
		return (EAttribute)surveyResponseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyResponse_ResponseDate() {
		return (EAttribute)surveyResponseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSurveyResponse_StatusId() {
		return (EReference)surveyResponseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSurveyResponse_SurveyId() {
		return (EReference)surveyResponseEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSurveyResponseAnswer() {
		return surveyResponseAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSurveyResponseAnswer_SurveyResponseId() {
		return (EReference)surveyResponseAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSurveyResponseAnswer_SurveyQuestionId() {
		return (EReference)surveyResponseAnswerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyResponseAnswer_SurveyMultiRespColId() {
		return (EAttribute)surveyResponseAnswerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyResponseAnswer_AmountBase() {
		return (EAttribute)surveyResponseAnswerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyResponseAnswer_AmountBaseUomId() {
		return (EAttribute)surveyResponseAnswerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyResponseAnswer_AnsweredDate() {
		return (EAttribute)surveyResponseAnswerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyResponseAnswer_BooleanResponse() {
		return (EAttribute)surveyResponseAnswerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSurveyResponseAnswer_ContentId() {
		return (EReference)surveyResponseAnswerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyResponseAnswer_CurrencyResponse() {
		return (EAttribute)surveyResponseAnswerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyResponseAnswer_Duration() {
		return (EAttribute)surveyResponseAnswerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyResponseAnswer_DurationUomId() {
		return (EAttribute)surveyResponseAnswerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyResponseAnswer_FloatResponse() {
		return (EAttribute)surveyResponseAnswerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyResponseAnswer_NumericResponse() {
		return (EAttribute)surveyResponseAnswerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyResponseAnswer_SequenceNum() {
		return (EAttribute)surveyResponseAnswerEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyResponseAnswer_SurveyMultiRespId() {
		return (EAttribute)surveyResponseAnswerEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyResponseAnswer_SurveyOptionSeqId() {
		return (EAttribute)surveyResponseAnswerEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyResponseAnswer_TextResponse() {
		return (EAttribute)surveyResponseAnswerEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyResponseAnswer_WeightFactor() {
		return (EAttribute)surveyResponseAnswerEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSurveyTrigger() {
		return surveyTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSurveyTrigger_SurveyId() {
		return (EReference)surveyTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSurveyTrigger_SurveyApplTypeId() {
		return (EReference)surveyTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyTrigger_FromDate() {
		return (EAttribute)surveyTriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSurveyTrigger_ThruDate() {
		return (EAttribute)surveyTriggerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyFactory getSurveyFactory() {
		return (SurveyFactory)getEFactoryInstance();
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
		surveyEClass = createEClass(SURVEY);
		createEAttribute(surveyEClass, SURVEY__SURVEY_ID);
		createEAttribute(surveyEClass, SURVEY__ACRO_FORM_CONTENT_ID);
		createEAttribute(surveyEClass, SURVEY__ALLOW_MULTIPLE);
		createEAttribute(surveyEClass, SURVEY__ALLOW_UPDATE);
		createEAttribute(surveyEClass, SURVEY__COMMENTS);
		createEAttribute(surveyEClass, SURVEY__DESCRIPTION);
		createEAttribute(surveyEClass, SURVEY__IS_ANONYMOUS);
		createEAttribute(surveyEClass, SURVEY__RESPONSE_SERVICE);
		createEAttribute(surveyEClass, SURVEY__SUBMIT_CAPTION);
		createEReference(surveyEClass, SURVEY__SURVEY_MULTI_RESPS);
		createEAttribute(surveyEClass, SURVEY__SURVEY_NAME);
		createEReference(surveyEClass, SURVEY__SURVEY_PAGES);

		surveyApplTypeEClass = createEClass(SURVEY_APPL_TYPE);
		createEAttribute(surveyApplTypeEClass, SURVEY_APPL_TYPE__SURVEY_APPL_TYPE_ID);
		createEAttribute(surveyApplTypeEClass, SURVEY_APPL_TYPE__DESCRIPTION);

		surveyMultiRespEClass = createEClass(SURVEY_MULTI_RESP);
		createEReference(surveyMultiRespEClass, SURVEY_MULTI_RESP__SURVEY_ID);
		createEAttribute(surveyMultiRespEClass, SURVEY_MULTI_RESP__SURVEY_MULTI_RESP_ID);
		createEAttribute(surveyMultiRespEClass, SURVEY_MULTI_RESP__MULTI_RESP_TITLE);

		surveyMultiRespColumnEClass = createEClass(SURVEY_MULTI_RESP_COLUMN);
		createEAttribute(surveyMultiRespColumnEClass, SURVEY_MULTI_RESP_COLUMN__SURVEY_ID);
		createEAttribute(surveyMultiRespColumnEClass, SURVEY_MULTI_RESP_COLUMN__SURVEY_MULTI_RESP_COL_ID);
		createEAttribute(surveyMultiRespColumnEClass, SURVEY_MULTI_RESP_COLUMN__SURVEY_MULTI_RESP_ID);
		createEAttribute(surveyMultiRespColumnEClass, SURVEY_MULTI_RESP_COLUMN__COLUMN_TITLE);
		createEAttribute(surveyMultiRespColumnEClass, SURVEY_MULTI_RESP_COLUMN__SEQUENCE_NUM);

		surveyPageEClass = createEClass(SURVEY_PAGE);
		createEReference(surveyPageEClass, SURVEY_PAGE__SURVEY_ID);
		createEAttribute(surveyPageEClass, SURVEY_PAGE__SURVEY_PAGE_SEQ_ID);
		createEAttribute(surveyPageEClass, SURVEY_PAGE__PAGE_NAME);
		createEAttribute(surveyPageEClass, SURVEY_PAGE__SEQUENCE_NUM);

		surveyQuestionEClass = createEClass(SURVEY_QUESTION);
		createEAttribute(surveyQuestionEClass, SURVEY_QUESTION__SURVEY_QUESTION_ID);
		createEAttribute(surveyQuestionEClass, SURVEY_QUESTION__DESCRIPTION);
		createEAttribute(surveyQuestionEClass, SURVEY_QUESTION__ENUM_TYPE_ID);
		createEAttribute(surveyQuestionEClass, SURVEY_QUESTION__FORMAT_STRING);
		createEReference(surveyQuestionEClass, SURVEY_QUESTION__GEO_ID);
		createEAttribute(surveyQuestionEClass, SURVEY_QUESTION__HINT);
		createEAttribute(surveyQuestionEClass, SURVEY_QUESTION__QUESTION);
		createEReference(surveyQuestionEClass, SURVEY_QUESTION__SURVEY_QUESTION_CATEGORY_ID);
		createEReference(surveyQuestionEClass, SURVEY_QUESTION__SURVEY_QUESTION_OPTIONS);
		createEReference(surveyQuestionEClass, SURVEY_QUESTION__SURVEY_QUESTION_TYPE_ID);

		surveyQuestionApplEClass = createEClass(SURVEY_QUESTION_APPL);
		createEReference(surveyQuestionApplEClass, SURVEY_QUESTION_APPL__SURVEY_ID);
		createEReference(surveyQuestionApplEClass, SURVEY_QUESTION_APPL__SURVEY_QUESTION_ID);
		createEAttribute(surveyQuestionApplEClass, SURVEY_QUESTION_APPL__FROM_DATE);
		createEAttribute(surveyQuestionApplEClass, SURVEY_QUESTION_APPL__EXTERNAL_FIELD_REF);
		createEAttribute(surveyQuestionApplEClass, SURVEY_QUESTION_APPL__REQUIRED_FIELD);
		createEAttribute(surveyQuestionApplEClass, SURVEY_QUESTION_APPL__SEQUENCE_NUM);
		createEAttribute(surveyQuestionApplEClass, SURVEY_QUESTION_APPL__SURVEY_MULTI_RESP_COL_ID);
		createEAttribute(surveyQuestionApplEClass, SURVEY_QUESTION_APPL__SURVEY_MULTI_RESP_ID);
		createEAttribute(surveyQuestionApplEClass, SURVEY_QUESTION_APPL__SURVEY_PAGE_SEQ_ID);
		createEAttribute(surveyQuestionApplEClass, SURVEY_QUESTION_APPL__THRU_DATE);
		createEAttribute(surveyQuestionApplEClass, SURVEY_QUESTION_APPL__WITH_SURVEY_OPTION_SEQ_ID);
		createEAttribute(surveyQuestionApplEClass, SURVEY_QUESTION_APPL__WITH_SURVEY_QUESTION_ID);

		surveyQuestionCategoryEClass = createEClass(SURVEY_QUESTION_CATEGORY);
		createEAttribute(surveyQuestionCategoryEClass, SURVEY_QUESTION_CATEGORY__SURVEY_QUESTION_CATEGORY_ID);
		createEAttribute(surveyQuestionCategoryEClass, SURVEY_QUESTION_CATEGORY__DESCRIPTION);
		createEReference(surveyQuestionCategoryEClass, SURVEY_QUESTION_CATEGORY__PARENT_CATEGORY_ID);

		surveyQuestionOptionEClass = createEClass(SURVEY_QUESTION_OPTION);
		createEReference(surveyQuestionOptionEClass, SURVEY_QUESTION_OPTION__SURVEY_QUESTION_ID);
		createEAttribute(surveyQuestionOptionEClass, SURVEY_QUESTION_OPTION__SURVEY_OPTION_SEQ_ID);
		createEAttribute(surveyQuestionOptionEClass, SURVEY_QUESTION_OPTION__AMOUNT_BASE);
		createEAttribute(surveyQuestionOptionEClass, SURVEY_QUESTION_OPTION__AMOUNT_BASE_UOM_ID);
		createEAttribute(surveyQuestionOptionEClass, SURVEY_QUESTION_OPTION__DESCRIPTION);
		createEAttribute(surveyQuestionOptionEClass, SURVEY_QUESTION_OPTION__DURATION);
		createEAttribute(surveyQuestionOptionEClass, SURVEY_QUESTION_OPTION__DURATION_UOM_ID);
		createEAttribute(surveyQuestionOptionEClass, SURVEY_QUESTION_OPTION__SEQUENCE_NUM);
		createEAttribute(surveyQuestionOptionEClass, SURVEY_QUESTION_OPTION__WEIGHT_FACTOR);

		surveyQuestionTypeEClass = createEClass(SURVEY_QUESTION_TYPE);
		createEAttribute(surveyQuestionTypeEClass, SURVEY_QUESTION_TYPE__SURVEY_QUESTION_TYPE_ID);
		createEAttribute(surveyQuestionTypeEClass, SURVEY_QUESTION_TYPE__DESCRIPTION);

		surveyResponseEClass = createEClass(SURVEY_RESPONSE);
		createEAttribute(surveyResponseEClass, SURVEY_RESPONSE__SURVEY_RESPONSE_ID);
		createEAttribute(surveyResponseEClass, SURVEY_RESPONSE__GENERAL_FEEDBACK);
		createEAttribute(surveyResponseEClass, SURVEY_RESPONSE__LAST_MODIFIED_DATE);
		createEReference(surveyResponseEClass, SURVEY_RESPONSE__ORDER_ID);
		createEAttribute(surveyResponseEClass, SURVEY_RESPONSE__ORDER_ITEM_SEQ_ID);
		createEReference(surveyResponseEClass, SURVEY_RESPONSE__PARTY_ID);
		createEAttribute(surveyResponseEClass, SURVEY_RESPONSE__REFERENCE_ID);
		createEAttribute(surveyResponseEClass, SURVEY_RESPONSE__RESPONSE_DATE);
		createEReference(surveyResponseEClass, SURVEY_RESPONSE__STATUS_ID);
		createEReference(surveyResponseEClass, SURVEY_RESPONSE__SURVEY_ID);

		surveyResponseAnswerEClass = createEClass(SURVEY_RESPONSE_ANSWER);
		createEReference(surveyResponseAnswerEClass, SURVEY_RESPONSE_ANSWER__SURVEY_RESPONSE_ID);
		createEReference(surveyResponseAnswerEClass, SURVEY_RESPONSE_ANSWER__SURVEY_QUESTION_ID);
		createEAttribute(surveyResponseAnswerEClass, SURVEY_RESPONSE_ANSWER__SURVEY_MULTI_RESP_COL_ID);
		createEAttribute(surveyResponseAnswerEClass, SURVEY_RESPONSE_ANSWER__AMOUNT_BASE);
		createEAttribute(surveyResponseAnswerEClass, SURVEY_RESPONSE_ANSWER__AMOUNT_BASE_UOM_ID);
		createEAttribute(surveyResponseAnswerEClass, SURVEY_RESPONSE_ANSWER__ANSWERED_DATE);
		createEAttribute(surveyResponseAnswerEClass, SURVEY_RESPONSE_ANSWER__BOOLEAN_RESPONSE);
		createEReference(surveyResponseAnswerEClass, SURVEY_RESPONSE_ANSWER__CONTENT_ID);
		createEAttribute(surveyResponseAnswerEClass, SURVEY_RESPONSE_ANSWER__CURRENCY_RESPONSE);
		createEAttribute(surveyResponseAnswerEClass, SURVEY_RESPONSE_ANSWER__DURATION);
		createEAttribute(surveyResponseAnswerEClass, SURVEY_RESPONSE_ANSWER__DURATION_UOM_ID);
		createEAttribute(surveyResponseAnswerEClass, SURVEY_RESPONSE_ANSWER__FLOAT_RESPONSE);
		createEAttribute(surveyResponseAnswerEClass, SURVEY_RESPONSE_ANSWER__NUMERIC_RESPONSE);
		createEAttribute(surveyResponseAnswerEClass, SURVEY_RESPONSE_ANSWER__SEQUENCE_NUM);
		createEAttribute(surveyResponseAnswerEClass, SURVEY_RESPONSE_ANSWER__SURVEY_MULTI_RESP_ID);
		createEAttribute(surveyResponseAnswerEClass, SURVEY_RESPONSE_ANSWER__SURVEY_OPTION_SEQ_ID);
		createEAttribute(surveyResponseAnswerEClass, SURVEY_RESPONSE_ANSWER__TEXT_RESPONSE);
		createEAttribute(surveyResponseAnswerEClass, SURVEY_RESPONSE_ANSWER__WEIGHT_FACTOR);

		surveyTriggerEClass = createEClass(SURVEY_TRIGGER);
		createEReference(surveyTriggerEClass, SURVEY_TRIGGER__SURVEY_ID);
		createEReference(surveyTriggerEClass, SURVEY_TRIGGER__SURVEY_APPL_TYPE_ID);
		createEAttribute(surveyTriggerEClass, SURVEY_TRIGGER__FROM_DATE);
		createEAttribute(surveyTriggerEClass, SURVEY_TRIGGER__THRU_DATE);
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
		GeoPackage theGeoPackage = (GeoPackage)EPackage.Registry.INSTANCE.getEPackage(GeoPackage.eNS_URI);
		OrderPackage theOrderPackage = (OrderPackage)EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI);
		PartyPackage thePartyPackage_1 = (PartyPackage)EPackage.Registry.INSTANCE.getEPackage(PartyPackage.eNS_URI);
		StatusPackage theStatusPackage = (StatusPackage)EPackage.Registry.INSTANCE.getEPackage(StatusPackage.eNS_URI);
		ContentPackage theContentPackage = (ContentPackage)EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		surveyEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		surveyApplTypeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		surveyMultiRespEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		surveyMultiRespColumnEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		surveyPageEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		surveyQuestionEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		surveyQuestionApplEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		surveyQuestionCategoryEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		surveyQuestionOptionEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		surveyQuestionTypeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		surveyResponseEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		surveyResponseAnswerEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		surveyTriggerEClass.getESuperTypes().add(theBizPackage.getBizEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(surveyEClass, Survey.class, "Survey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSurvey_SurveyId(), ecorePackage.getEString(), "surveyId", null, 1, 1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurvey_AcroFormContentId(), ecorePackage.getEString(), "acroFormContentId", null, 0, 1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurvey_AllowMultiple(), ecorePackage.getEBoolean(), "allowMultiple", null, 1, 1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurvey_AllowUpdate(), ecorePackage.getEBoolean(), "allowUpdate", null, 1, 1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurvey_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurvey_Description(), ecorePackage.getEString(), "description", null, 0, 1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurvey_IsAnonymous(), ecorePackage.getEBoolean(), "isAnonymous", null, 1, 1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurvey_ResponseService(), ecorePackage.getEString(), "responseService", null, 0, 1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurvey_SubmitCaption(), ecorePackage.getEString(), "submitCaption", null, 0, 1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSurvey_SurveyMultiResps(), this.getSurveyMultiResp(), null, "surveyMultiResps", null, 0, -1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurvey_SurveyName(), ecorePackage.getEString(), "surveyName", null, 0, 1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSurvey_SurveyPages(), this.getSurveyPage(), null, "surveyPages", null, 0, -1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(surveyApplTypeEClass, SurveyApplType.class, "SurveyApplType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSurveyApplType_SurveyApplTypeId(), ecorePackage.getEString(), "surveyApplTypeId", null, 1, 1, SurveyApplType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyApplType_Description(), ecorePackage.getEString(), "description", null, 0, 1, SurveyApplType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(surveyMultiRespEClass, SurveyMultiResp.class, "SurveyMultiResp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSurveyMultiResp_SurveyId(), this.getSurvey(), null, "surveyId", null, 1, 1, SurveyMultiResp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSurveyMultiResp_SurveyId().getEKeys().add(this.getSurvey_SurveyId());
		initEAttribute(getSurveyMultiResp_SurveyMultiRespId(), ecorePackage.getEString(), "surveyMultiRespId", null, 1, 1, SurveyMultiResp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyMultiResp_MultiRespTitle(), ecorePackage.getEString(), "multiRespTitle", null, 0, 1, SurveyMultiResp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(surveyMultiRespColumnEClass, SurveyMultiRespColumn.class, "SurveyMultiRespColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSurveyMultiRespColumn_SurveyId(), ecorePackage.getEString(), "surveyId", null, 1, 1, SurveyMultiRespColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyMultiRespColumn_SurveyMultiRespColId(), ecorePackage.getEString(), "surveyMultiRespColId", null, 1, 1, SurveyMultiRespColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyMultiRespColumn_SurveyMultiRespId(), ecorePackage.getEString(), "surveyMultiRespId", null, 1, 1, SurveyMultiRespColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyMultiRespColumn_ColumnTitle(), ecorePackage.getEString(), "columnTitle", null, 0, 1, SurveyMultiRespColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyMultiRespColumn_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, SurveyMultiRespColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(surveyPageEClass, SurveyPage.class, "SurveyPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSurveyPage_SurveyId(), this.getSurvey(), null, "surveyId", null, 1, 1, SurveyPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSurveyPage_SurveyId().getEKeys().add(this.getSurvey_SurveyId());
		initEAttribute(getSurveyPage_SurveyPageSeqId(), ecorePackage.getEString(), "surveyPageSeqId", null, 1, 1, SurveyPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyPage_PageName(), ecorePackage.getEString(), "pageName", null, 0, 1, SurveyPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyPage_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, SurveyPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(surveyQuestionEClass, SurveyQuestion.class, "SurveyQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSurveyQuestion_SurveyQuestionId(), ecorePackage.getEString(), "surveyQuestionId", null, 1, 1, SurveyQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyQuestion_Description(), ecorePackage.getEString(), "description", null, 0, 1, SurveyQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyQuestion_EnumTypeId(), ecorePackage.getEString(), "enumTypeId", null, 0, 1, SurveyQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyQuestion_FormatString(), ecorePackage.getEString(), "formatString", null, 0, 1, SurveyQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSurveyQuestion_GeoId(), theGeoPackage.getGeo(), null, "geoId", null, 0, 1, SurveyQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSurveyQuestion_GeoId().getEKeys().add(theGeoPackage.getGeo_GeoId());
		initEAttribute(getSurveyQuestion_Hint(), ecorePackage.getEString(), "hint", null, 0, 1, SurveyQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyQuestion_Question(), ecorePackage.getEString(), "question", null, 0, 1, SurveyQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSurveyQuestion_SurveyQuestionCategoryId(), this.getSurveyQuestionCategory(), null, "surveyQuestionCategoryId", null, 0, 1, SurveyQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSurveyQuestion_SurveyQuestionCategoryId().getEKeys().add(this.getSurveyQuestionCategory_SurveyQuestionCategoryId());
		initEReference(getSurveyQuestion_SurveyQuestionOptions(), this.getSurveyQuestionOption(), null, "surveyQuestionOptions", null, 0, -1, SurveyQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSurveyQuestion_SurveyQuestionTypeId(), this.getSurveyQuestionType(), null, "surveyQuestionTypeId", null, 0, 1, SurveyQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSurveyQuestion_SurveyQuestionTypeId().getEKeys().add(this.getSurveyQuestionType_SurveyQuestionTypeId());

		initEClass(surveyQuestionApplEClass, SurveyQuestionAppl.class, "SurveyQuestionAppl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSurveyQuestionAppl_SurveyId(), this.getSurvey(), null, "surveyId", null, 1, 1, SurveyQuestionAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSurveyQuestionAppl_SurveyId().getEKeys().add(this.getSurvey_SurveyId());
		initEReference(getSurveyQuestionAppl_SurveyQuestionId(), this.getSurveyQuestion(), null, "surveyQuestionId", null, 1, 1, SurveyQuestionAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSurveyQuestionAppl_SurveyQuestionId().getEKeys().add(this.getSurveyQuestion_SurveyQuestionId());
		initEAttribute(getSurveyQuestionAppl_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, SurveyQuestionAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyQuestionAppl_ExternalFieldRef(), ecorePackage.getEString(), "externalFieldRef", null, 0, 1, SurveyQuestionAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyQuestionAppl_RequiredField(), ecorePackage.getEBoolean(), "requiredField", null, 0, 1, SurveyQuestionAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyQuestionAppl_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, SurveyQuestionAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyQuestionAppl_SurveyMultiRespColId(), ecorePackage.getEString(), "surveyMultiRespColId", null, 0, 1, SurveyQuestionAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyQuestionAppl_SurveyMultiRespId(), ecorePackage.getEString(), "surveyMultiRespId", null, 0, 1, SurveyQuestionAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyQuestionAppl_SurveyPageSeqId(), ecorePackage.getEString(), "surveyPageSeqId", null, 0, 1, SurveyQuestionAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyQuestionAppl_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, SurveyQuestionAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyQuestionAppl_WithSurveyOptionSeqId(), ecorePackage.getEString(), "withSurveyOptionSeqId", null, 0, 1, SurveyQuestionAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyQuestionAppl_WithSurveyQuestionId(), ecorePackage.getEString(), "withSurveyQuestionId", null, 0, 1, SurveyQuestionAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(surveyQuestionCategoryEClass, SurveyQuestionCategory.class, "SurveyQuestionCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSurveyQuestionCategory_SurveyQuestionCategoryId(), ecorePackage.getEString(), "surveyQuestionCategoryId", null, 1, 1, SurveyQuestionCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyQuestionCategory_Description(), ecorePackage.getEString(), "description", null, 0, 1, SurveyQuestionCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSurveyQuestionCategory_ParentCategoryId(), this.getSurveyQuestionCategory(), null, "parentCategoryId", null, 0, 1, SurveyQuestionCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSurveyQuestionCategory_ParentCategoryId().getEKeys().add(this.getSurveyQuestionCategory_SurveyQuestionCategoryId());

		initEClass(surveyQuestionOptionEClass, SurveyQuestionOption.class, "SurveyQuestionOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSurveyQuestionOption_SurveyQuestionId(), this.getSurveyQuestion(), null, "surveyQuestionId", null, 1, 1, SurveyQuestionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSurveyQuestionOption_SurveyQuestionId().getEKeys().add(this.getSurveyQuestion_SurveyQuestionId());
		initEAttribute(getSurveyQuestionOption_SurveyOptionSeqId(), ecorePackage.getEString(), "surveyOptionSeqId", null, 1, 1, SurveyQuestionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyQuestionOption_AmountBase(), ecorePackage.getEBigDecimal(), "amountBase", null, 0, 1, SurveyQuestionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyQuestionOption_AmountBaseUomId(), ecorePackage.getEString(), "amountBaseUomId", null, 0, 1, SurveyQuestionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyQuestionOption_Description(), ecorePackage.getEString(), "description", null, 0, 1, SurveyQuestionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyQuestionOption_Duration(), ecorePackage.getELong(), "duration", null, 0, 1, SurveyQuestionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyQuestionOption_DurationUomId(), ecorePackage.getEString(), "durationUomId", null, 0, 1, SurveyQuestionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyQuestionOption_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, SurveyQuestionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyQuestionOption_WeightFactor(), ecorePackage.getEDouble(), "weightFactor", null, 0, 1, SurveyQuestionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(surveyQuestionTypeEClass, SurveyQuestionType.class, "SurveyQuestionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSurveyQuestionType_SurveyQuestionTypeId(), ecorePackage.getEString(), "surveyQuestionTypeId", null, 1, 1, SurveyQuestionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyQuestionType_Description(), ecorePackage.getEString(), "description", null, 0, 1, SurveyQuestionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(surveyResponseEClass, SurveyResponse.class, "SurveyResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSurveyResponse_SurveyResponseId(), ecorePackage.getEString(), "surveyResponseId", null, 1, 1, SurveyResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyResponse_GeneralFeedback(), ecorePackage.getEString(), "generalFeedback", null, 0, 1, SurveyResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyResponse_LastModifiedDate(), ecorePackage.getEDate(), "lastModifiedDate", null, 0, 1, SurveyResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSurveyResponse_OrderId(), theOrderPackage.getOrderHeader(), null, "orderId", null, 0, 1, SurveyResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSurveyResponse_OrderId().getEKeys().add(theOrderPackage.getOrderHeader_OrderId());
		initEAttribute(getSurveyResponse_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, SurveyResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSurveyResponse_PartyId(), thePartyPackage_1.getParty(), null, "partyId", null, 0, 1, SurveyResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSurveyResponse_PartyId().getEKeys().add(thePartyPackage_1.getParty_PartyId());
		initEAttribute(getSurveyResponse_ReferenceId(), ecorePackage.getEString(), "referenceId", null, 0, 1, SurveyResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyResponse_ResponseDate(), ecorePackage.getEDate(), "responseDate", null, 0, 1, SurveyResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSurveyResponse_StatusId(), theStatusPackage.getStatusItem(), null, "statusId", null, 0, 1, SurveyResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSurveyResponse_StatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEReference(getSurveyResponse_SurveyId(), this.getSurvey(), null, "surveyId", null, 0, 1, SurveyResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSurveyResponse_SurveyId().getEKeys().add(this.getSurvey_SurveyId());

		initEClass(surveyResponseAnswerEClass, SurveyResponseAnswer.class, "SurveyResponseAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSurveyResponseAnswer_SurveyResponseId(), this.getSurveyResponse(), null, "surveyResponseId", null, 1, 1, SurveyResponseAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSurveyResponseAnswer_SurveyResponseId().getEKeys().add(this.getSurveyResponse_SurveyResponseId());
		initEReference(getSurveyResponseAnswer_SurveyQuestionId(), this.getSurveyQuestion(), null, "surveyQuestionId", null, 1, 1, SurveyResponseAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSurveyResponseAnswer_SurveyQuestionId().getEKeys().add(this.getSurveyQuestion_SurveyQuestionId());
		initEAttribute(getSurveyResponseAnswer_SurveyMultiRespColId(), ecorePackage.getEString(), "surveyMultiRespColId", null, 1, 1, SurveyResponseAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyResponseAnswer_AmountBase(), ecorePackage.getEBigDecimal(), "amountBase", null, 0, 1, SurveyResponseAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyResponseAnswer_AmountBaseUomId(), ecorePackage.getEString(), "amountBaseUomId", null, 0, 1, SurveyResponseAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyResponseAnswer_AnsweredDate(), ecorePackage.getEDate(), "answeredDate", null, 0, 1, SurveyResponseAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyResponseAnswer_BooleanResponse(), ecorePackage.getEBoolean(), "booleanResponse", null, 0, 1, SurveyResponseAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSurveyResponseAnswer_ContentId(), theContentPackage.getContent(), null, "contentId", null, 0, 1, SurveyResponseAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSurveyResponseAnswer_ContentId().getEKeys().add(theContentPackage.getContent_ContentId());
		initEAttribute(getSurveyResponseAnswer_CurrencyResponse(), ecorePackage.getEBigDecimal(), "currencyResponse", null, 0, 1, SurveyResponseAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyResponseAnswer_Duration(), ecorePackage.getELong(), "duration", null, 0, 1, SurveyResponseAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyResponseAnswer_DurationUomId(), ecorePackage.getEString(), "durationUomId", null, 0, 1, SurveyResponseAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyResponseAnswer_FloatResponse(), ecorePackage.getEDouble(), "floatResponse", null, 0, 1, SurveyResponseAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyResponseAnswer_NumericResponse(), ecorePackage.getELong(), "numericResponse", null, 0, 1, SurveyResponseAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyResponseAnswer_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, SurveyResponseAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyResponseAnswer_SurveyMultiRespId(), ecorePackage.getEString(), "surveyMultiRespId", null, 0, 1, SurveyResponseAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyResponseAnswer_SurveyOptionSeqId(), ecorePackage.getEString(), "surveyOptionSeqId", null, 0, 1, SurveyResponseAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyResponseAnswer_TextResponse(), ecorePackage.getEString(), "textResponse", null, 0, 1, SurveyResponseAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyResponseAnswer_WeightFactor(), ecorePackage.getEDouble(), "weightFactor", null, 0, 1, SurveyResponseAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(surveyTriggerEClass, SurveyTrigger.class, "SurveyTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSurveyTrigger_SurveyId(), this.getSurvey(), null, "surveyId", null, 1, 1, SurveyTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSurveyTrigger_SurveyId().getEKeys().add(this.getSurvey_SurveyId());
		initEReference(getSurveyTrigger_SurveyApplTypeId(), this.getSurveyApplType(), null, "surveyApplTypeId", null, 1, 1, SurveyTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSurveyTrigger_SurveyApplTypeId().getEKeys().add(this.getSurveyApplType_SurveyApplTypeId());
		initEAttribute(getSurveyTrigger_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, SurveyTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurveyTrigger_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, SurveyTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (surveyEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (surveyApplTypeEClass,
		   source,
		   new String[] {
			   "title", "Survey Application Type",
			   "dictionary", "ContentEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (surveyMultiRespEClass,
		   source,
		   new String[] {
			   "title", "Survey Multi-Response Group"
		   });
		addAnnotation
		  (surveyMultiRespColumnEClass,
		   source,
		   new String[] {
			   "title", "Survey Multi-Response Group Column/Category"
		   });
		addAnnotation
		  (surveyPageEClass,
		   source,
		   new String[] {
			   "title", "Survey Page Type"
		   });
		addAnnotation
		  (surveyQuestionEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (surveyQuestionApplEClass,
		   source,
		   new String[] {
			   "title", "Survey Question Application"
		   });
		addAnnotation
		  (surveyQuestionCategoryEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (surveyQuestionOptionEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (surveyQuestionTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "ContentEntityLabels",
			   "formula", "description"
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
		  (getSurvey_SurveyId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSurvey_AcroFormContentId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSurvey_Comments(),
		   source,
		   new String[] {
			   "type", "comment",
			   "length", "255"
		   });
		addAnnotation
		  (getSurvey_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getSurvey_ResponseService(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getSurvey_SubmitCaption(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getSurvey_SurveyName(),
		   source,
		   new String[] {
			   "type", "name",
			   "length", "100"
		   });
		addAnnotation
		  (getSurveyApplType_SurveyApplTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSurveyApplType_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getSurveyMultiResp_SurveyMultiRespId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSurveyMultiResp_MultiRespTitle(),
		   source,
		   new String[] {
			   "type", "name",
			   "length", "100"
		   });
		addAnnotation
		  (getSurveyMultiRespColumn_SurveyId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSurveyMultiRespColumn_SurveyMultiRespColId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSurveyMultiRespColumn_SurveyMultiRespId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSurveyMultiRespColumn_ColumnTitle(),
		   source,
		   new String[] {
			   "type", "name",
			   "length", "100"
		   });
		addAnnotation
		  (getSurveyMultiRespColumn_SequenceNum(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getSurveyPage_SurveyPageSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSurveyPage_PageName(),
		   source,
		   new String[] {
			   "type", "name",
			   "length", "100"
		   });
		addAnnotation
		  (getSurveyPage_SequenceNum(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getSurveyQuestion_SurveyQuestionId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSurveyQuestion_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getSurveyQuestion_EnumTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSurveyQuestion_FormatString(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getSurveyQuestionAppl_ExternalFieldRef(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getSurveyQuestionAppl_SequenceNum(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getSurveyQuestionAppl_SurveyMultiRespColId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSurveyQuestionAppl_SurveyMultiRespId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSurveyQuestionAppl_SurveyPageSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSurveyQuestionAppl_WithSurveyOptionSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSurveyQuestionAppl_WithSurveyQuestionId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSurveyQuestionCategory_SurveyQuestionCategoryId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSurveyQuestionCategory_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getSurveyQuestionOption_SurveyOptionSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSurveyQuestionOption_AmountBase(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getSurveyQuestionOption_AmountBaseUomId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSurveyQuestionOption_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getSurveyQuestionOption_Duration(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getSurveyQuestionOption_DurationUomId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSurveyQuestionOption_SequenceNum(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getSurveyQuestionType_SurveyQuestionTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSurveyQuestionType_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getSurveyResponse_SurveyResponseId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSurveyResponse_OrderItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSurveyResponse_ReferenceId(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getSurveyResponseAnswer_SurveyMultiRespColId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSurveyResponseAnswer_AmountBase(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getSurveyResponseAnswer_AmountBaseUomId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSurveyResponseAnswer_CurrencyResponse(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getSurveyResponseAnswer_Duration(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getSurveyResponseAnswer_DurationUomId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSurveyResponseAnswer_NumericResponse(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getSurveyResponseAnswer_SequenceNum(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getSurveyResponseAnswer_SurveyMultiRespId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getSurveyResponseAnswer_SurveyOptionSeqId(),
		   source,
		   new String[] {
			   "length", "20"
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
		  (getSurvey_AcroFormContentId(),
		   source,
		   new String[] {
			   "help", "Points to PDF with AcroForm"
		   });
		addAnnotation
		  (getSurvey_AllowMultiple(),
		   source,
		   new String[] {
			   "help", "Allow multiple responses to this survey (if Y), or just a single answer (if N)?"
		   });
		addAnnotation
		  (getSurvey_AllowUpdate(),
		   source,
		   new String[] {
			   "help", "Allow change to responses?"
		   });
		addAnnotation
		  (getSurvey_IsAnonymous(),
		   source,
		   new String[] {
			   "help", "Allow response to the survey without login?"
		   });
		addAnnotation
		  (getSurveyMultiResp_SurveyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSurveyMultiResp_SurveyMultiRespId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSurveyMultiRespColumn_SurveyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSurveyMultiRespColumn_SurveyMultiRespColId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSurveyMultiRespColumn_SurveyMultiRespId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSurveyPage_SurveyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSurveyPage_SurveyPageSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSurveyQuestionAppl_SurveyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSurveyQuestionAppl_SurveyQuestionId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSurveyQuestionAppl_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSurveyQuestionAppl_ExternalFieldRef(),
		   source,
		   new String[] {
			   "help", "External field ID/reference; for AcroForms used to track the field ID"
		   });
		addAnnotation
		  (getSurveyQuestionAppl_SurveyMultiRespColId(),
		   source,
		   new String[] {
			   "help", "Used to optionally associate this question to a specific column in the Multi-Response set; with this you can associate a single question to each cell in the question/column grid; this is useful for AcroForm round trips where the target PDF needs a question associated with each cell, or even the same question applied with different externalFieldRef values."
		   });
		addAnnotation
		  (getSurveyQuestionAppl_WithSurveyQuestionId(),
		   source,
		   new String[] {
			   "help", "These two with* fields are used to specify that this question should only appear if the with option has been selected for the with question."
		   });
		addAnnotation
		  (getSurveyQuestionOption_SurveyQuestionId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSurveyQuestionOption_SurveyOptionSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSurveyResponseAnswer_SurveyResponseId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSurveyResponseAnswer_SurveyQuestionId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSurveyResponseAnswer_SurveyMultiRespColId(),
		   source,
		   new String[] {
			   "key", "true",
			   "help", "This is needed to support multiple responses for different MultiResp Columns; if not part of a MultiResp will be _NA_"
		   });
		addAnnotation
		  (getSurveyResponseAnswer_SurveyMultiRespId(),
		   source,
		   new String[] {
			   "help", "This is not part of the primary key, but should be populated so that the SurveyMultiRespColumn can be more easily looked up."
		   });
		addAnnotation
		  (getSurveyTrigger_SurveyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSurveyTrigger_SurveyApplTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getSurveyTrigger_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
	}

} //SurveyPackageImpl
