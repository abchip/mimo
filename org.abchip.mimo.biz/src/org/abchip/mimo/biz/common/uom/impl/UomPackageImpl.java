/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.uom.impl;

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
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.common.uom.UomConversion;
import org.abchip.mimo.biz.common.uom.UomConversionDated;
import org.abchip.mimo.biz.common.uom.UomFactory;
import org.abchip.mimo.biz.common.uom.UomGroup;
import org.abchip.mimo.biz.common.uom.UomPackage;
import org.abchip.mimo.biz.common.uom.UomType;
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
public class UomPackageImpl extends EPackageImpl implements UomPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uomConversionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uomConversionDatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uomGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uomTypeEClass = null;

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
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UomPackageImpl() {
		super(eNS_URI, UomFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UomPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UomPackage init() {
		if (isInited) return (UomPackage)EPackage.Registry.INSTANCE.getEPackage(UomPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUomPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UomPackageImpl theUomPackage = registeredUomPackage instanceof UomPackageImpl ? (UomPackageImpl)registeredUomPackage : new UomPackageImpl();

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
		theUomPackage.createPackageContents();
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
		theUomPackage.initializePackageContents();
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
		theUomPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UomPackage.eNS_URI, theUomPackage);
		return theUomPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUom() {
		return uomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUom_UomId() {
		return (EAttribute)uomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUom_Abbreviation() {
		return (EAttribute)uomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUom_Description() {
		return (EAttribute)uomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUom_NumericCode() {
		return (EAttribute)uomEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUom_UomTypeId() {
		return (EReference)uomEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUom_MainUomConversions() {
		return (EReference)uomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUomConversion() {
		return uomConversionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUomConversion_UomId() {
		return (EReference)uomConversionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUomConversion_UomIdTo() {
		return (EReference)uomConversionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomConversion_ConversionFactor() {
		return (EAttribute)uomConversionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUomConversion_CustomMethodId() {
		return (EReference)uomConversionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomConversion_DecimalScale() {
		return (EAttribute)uomConversionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomConversion_RoundingMode() {
		return (EAttribute)uomConversionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUomConversionDated() {
		return uomConversionDatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUomConversionDated_UomId() {
		return (EReference)uomConversionDatedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUomConversionDated_UomIdTo() {
		return (EReference)uomConversionDatedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomConversionDated_FromDate() {
		return (EAttribute)uomConversionDatedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomConversionDated_ConversionFactor() {
		return (EAttribute)uomConversionDatedEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUomConversionDated_CustomMethodId() {
		return (EReference)uomConversionDatedEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomConversionDated_DecimalScale() {
		return (EAttribute)uomConversionDatedEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUomConversionDated_PurposeEnumId() {
		return (EReference)uomConversionDatedEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomConversionDated_RoundingMode() {
		return (EAttribute)uomConversionDatedEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomConversionDated_ThruDate() {
		return (EAttribute)uomConversionDatedEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUomGroup() {
		return uomGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomGroup_UomGroupId() {
		return (EAttribute)uomGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUomGroup_UomId() {
		return (EReference)uomGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUomType() {
		return uomTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomType_UomTypeId() {
		return (EAttribute)uomTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomType_Description() {
		return (EAttribute)uomTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUomType_HasTable() {
		return (EAttribute)uomTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUomType_ParentTypeId() {
		return (EReference)uomTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UomFactory getUomFactory() {
		return (UomFactory)getEFactoryInstance();
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
		uomEClass = createEClass(UOM);
		createEAttribute(uomEClass, UOM__UOM_ID);
		createEAttribute(uomEClass, UOM__ABBREVIATION);
		createEAttribute(uomEClass, UOM__DESCRIPTION);
		createEReference(uomEClass, UOM__MAIN_UOM_CONVERSIONS);
		createEAttribute(uomEClass, UOM__NUMERIC_CODE);
		createEReference(uomEClass, UOM__UOM_TYPE_ID);

		uomConversionEClass = createEClass(UOM_CONVERSION);
		createEReference(uomConversionEClass, UOM_CONVERSION__UOM_ID);
		createEReference(uomConversionEClass, UOM_CONVERSION__UOM_ID_TO);
		createEAttribute(uomConversionEClass, UOM_CONVERSION__CONVERSION_FACTOR);
		createEReference(uomConversionEClass, UOM_CONVERSION__CUSTOM_METHOD_ID);
		createEAttribute(uomConversionEClass, UOM_CONVERSION__DECIMAL_SCALE);
		createEAttribute(uomConversionEClass, UOM_CONVERSION__ROUNDING_MODE);

		uomConversionDatedEClass = createEClass(UOM_CONVERSION_DATED);
		createEReference(uomConversionDatedEClass, UOM_CONVERSION_DATED__UOM_ID);
		createEReference(uomConversionDatedEClass, UOM_CONVERSION_DATED__UOM_ID_TO);
		createEAttribute(uomConversionDatedEClass, UOM_CONVERSION_DATED__FROM_DATE);
		createEAttribute(uomConversionDatedEClass, UOM_CONVERSION_DATED__CONVERSION_FACTOR);
		createEReference(uomConversionDatedEClass, UOM_CONVERSION_DATED__CUSTOM_METHOD_ID);
		createEAttribute(uomConversionDatedEClass, UOM_CONVERSION_DATED__DECIMAL_SCALE);
		createEReference(uomConversionDatedEClass, UOM_CONVERSION_DATED__PURPOSE_ENUM_ID);
		createEAttribute(uomConversionDatedEClass, UOM_CONVERSION_DATED__ROUNDING_MODE);
		createEAttribute(uomConversionDatedEClass, UOM_CONVERSION_DATED__THRU_DATE);

		uomGroupEClass = createEClass(UOM_GROUP);
		createEReference(uomGroupEClass, UOM_GROUP__UOM_ID);
		createEAttribute(uomGroupEClass, UOM_GROUP__UOM_GROUP_ID);

		uomTypeEClass = createEClass(UOM_TYPE);
		createEAttribute(uomTypeEClass, UOM_TYPE__UOM_TYPE_ID);
		createEAttribute(uomTypeEClass, UOM_TYPE__DESCRIPTION);
		createEAttribute(uomTypeEClass, UOM_TYPE__HAS_TABLE);
		createEReference(uomTypeEClass, UOM_TYPE__PARENT_TYPE_ID);
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
		PaymentPackage thePaymentPackage = (PaymentPackage)EPackage.Registry.INSTANCE.getEPackage(PaymentPackage.eNS_URI);
		SubscriptionPackage theSubscriptionPackage = (SubscriptionPackage)EPackage.Registry.INSTANCE.getEPackage(SubscriptionPackage.eNS_URI);
		Shipment_Package theShipment_Package = (Shipment_Package)EPackage.Registry.INSTANCE.getEPackage(Shipment_Package.eNS_URI);
		CostPackage theCostPackage = (CostPackage)EPackage.Registry.INSTANCE.getEPackage(CostPackage.eNS_URI);
		LedgerPackage theLedgerPackage = (LedgerPackage)EPackage.Registry.INSTANCE.getEPackage(LedgerPackage.eNS_URI);
		RequestPackage theRequestPackage = (RequestPackage)EPackage.Registry.INSTANCE.getEPackage(RequestPackage.eNS_URI);
		FinaccountPackage theFinaccountPackage = (FinaccountPackage)EPackage.Registry.INSTANCE.getEPackage(FinaccountPackage.eNS_URI);
		InventoryPackage theInventoryPackage = (InventoryPackage)EPackage.Registry.INSTANCE.getEPackage(InventoryPackage.eNS_URI);
		InvoicePackage theInvoicePackage = (InvoicePackage)EPackage.Registry.INSTANCE.getEPackage(InvoicePackage.eNS_URI);
		ProductPackage theProductPackage = (ProductPackage)EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI);
		FacilityPackage theFacilityPackage = (FacilityPackage)EPackage.Registry.INSTANCE.getEPackage(FacilityPackage.eNS_URI);
		GeoPackage theGeoPackage = (GeoPackage)EPackage.Registry.INSTANCE.getEPackage(GeoPackage.eNS_URI);
		FixedassetPackage theFixedassetPackage = (FixedassetPackage)EPackage.Registry.INSTANCE.getEPackage(FixedassetPackage.eNS_URI);
		CampaignPackage theCampaignPackage = (CampaignPackage)EPackage.Registry.INSTANCE.getEPackage(CampaignPackage.eNS_URI);
		WorkeffortPackage theWorkeffortPackage = (WorkeffortPackage)EPackage.Registry.INSTANCE.getEPackage(WorkeffortPackage.eNS_URI);
		OrderPackage theOrderPackage = (OrderPackage)EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI);
		PartyPackage thePartyPackage = (PartyPackage)EPackage.Registry.INSTANCE.getEPackage(PartyPackage.eNS_URI);
		PeriodPackage thePeriodPackage = (PeriodPackage)EPackage.Registry.INSTANCE.getEPackage(PeriodPackage.eNS_URI);
		FeaturePackage theFeaturePackage = (FeaturePackage)EPackage.Registry.INSTANCE.getEPackage(FeaturePackage.eNS_URI);
		StorePackage theStorePackage = (StorePackage)EPackage.Registry.INSTANCE.getEPackage(StorePackage.eNS_URI);
		OpportunityPackage theOpportunityPackage = (OpportunityPackage)EPackage.Registry.INSTANCE.getEPackage(OpportunityPackage.eNS_URI);
		QuotePackage theQuotePackage = (QuotePackage)EPackage.Registry.INSTANCE.getEPackage(QuotePackage.eNS_URI);
		ReturnPackage theReturnPackage = (ReturnPackage)EPackage.Registry.INSTANCE.getEPackage(ReturnPackage.eNS_URI);
		SupplierPackage theSupplierPackage = (SupplierPackage)EPackage.Registry.INSTANCE.getEPackage(SupplierPackage.eNS_URI);
		MethodPackage theMethodPackage = (MethodPackage)EPackage.Registry.INSTANCE.getEPackage(MethodPackage.eNS_URI);
		EnumPackage theEnumPackage = (EnumPackage)EPackage.Registry.INSTANCE.getEPackage(EnumPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		EGenericType g2 = createEGenericType(this.getUomType());
		g1.getETypeArguments().add(g2);
		uomEClass.getEGenericSuperTypes().add(g1);
		uomConversionEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		uomConversionDatedEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		uomGroupEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getUom());
		g1.getETypeArguments().add(g2);
		uomTypeEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(uomEClass, Uom.class, "Uom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUom_UomId(), ecorePackage.getEString(), "uomId", null, 1, 1, Uom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUom_Abbreviation(), ecorePackage.getEString(), "abbreviation", null, 0, 1, Uom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUom_Description(), ecorePackage.getEString(), "description", null, 0, 1, Uom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUom_MainUomConversions(), this.getUomConversion(), null, "mainUomConversions", null, 0, -1, Uom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUom_NumericCode(), ecorePackage.getELong(), "numericCode", null, 0, 1, Uom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUom_UomTypeId(), this.getUomType(), null, "uomTypeId", null, 0, 1, Uom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getUom_UomTypeId().getEKeys().add(this.getUomType_UomTypeId());

		addEOperation(uomEClass, thePaymentPackage.getPayment(), "actualCurrencyPayments", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theSubscriptionPackage.getSubscription(), "availableTimeSubscriptions", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, thePaymentPackage.getBillingAccountTerm(), "billingAccountTerms", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, thePaymentPackage.getBillingAccount(), "billingAccounts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theShipment_Package.getShipmentRouteSegment(), "billingWeightShipmentRouteSegments", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theSubscriptionPackage.getSubscription(), "cancelTimeSubscriptions", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, this.getUomConversion(), "convToUomConversions", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theCostPackage.getCostComponentCalc(), "costComponentCalcs", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theLedgerPackage.getAcctgTransEntry(), "currencyAcctgTransEntries", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theCostPackage.getCostComponent(), "currencyCostComponents", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theRequestPackage.getCustRequest(), "currencyCustRequests", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theFinaccountPackage.getFinAccount(), "currencyFinAccounts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theInventoryPackage.getInventoryItem(), "currencyInventoryItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theInvoicePackage.getInvoice(), "currencyInvoices", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, thePaymentPackage.getPayment(), "currencyPayments", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theShipment_Package.getShipmentRouteSegment(), "currencyShipmentRouteSegments", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theShipment_Package.getShipment(), "currencyShipments", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theProductPackage.getProductMeterType(), "defaultProductMeterTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theProductPackage.getProduct(), "depthProducts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theProductPackage.getProduct(), "diameterProducts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theFacilityPackage.getFacility(), "dimensionFacilities", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theShipment_Package.getShipmentBoxType(), "dimensionShipmentBoxTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theShipment_Package.getShipmentPackage(), "dimensionShipmentPackages", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theGeoPackage.getGeoPoint(), "elevationGeoPoints", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theFacilityPackage.getFacility(), "facilitySizeFacilities", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theFixedassetPackage.getFixedAsset(), "fixedAssets", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theSubscriptionPackage.getSubscription(), "gracePeriodSubscriptions", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theProductPackage.getProduct(), "heightProducts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theFixedassetPackage.getFixedAssetMaint(), "intervalFixedAssetMaints", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theProductPackage.getProductMaint(), "intervalProductMaints", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theInventoryPackage.getInventoryItem(), "inventoryItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theInvoicePackage.getInvoiceItem(), "invoiceItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theCampaignPackage.getMarketingCampaign(), "marketingCampaigns", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theSubscriptionPackage.getSubscription(), "maxLifeTimeSubscriptions", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theRequestPackage.getCustRequest(), "maximumAmountCustRequests", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theProductPackage.getProductMeter(), "meterProductMeters", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theWorkeffortPackage.getWorkEffort(), "moneyWorkEfforts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theOrderPackage.getOrderHeader(), "orderHeaders", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theLedgerPackage.getAcctgTransEntry(), "origCurrencyAcctgTransEntries", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, thePartyPackage.getParty(), "parties", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theLedgerPackage.getPartyAcctgPreference(), "partyAcctgPreferences", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, thePaymentPackage.getPaymentGatewayResponse(), "paymentGatewayResponses", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, thePeriodPackage.getPeriodType(), "periodTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theShipment_Package.getShipmentCostEstimate(), "priceShipmentCostEstimates", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theFeaturePackage.getProductFeature(), "productFeatures", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theStorePackage.getProductStore(), "productStores", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theProductPackage.getProduct(), "quantityProducts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theOpportunityPackage.getSalesForecastDetail(), "quantitySalesForecastDetails", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theShipment_Package.getShipmentCostEstimate(), "quantityShipmentCostEstimates", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theQuotePackage.getQuoteItem(), "quoteItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theQuotePackage.getQuote(), "quotes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theOrderPackage.getOrderItem(), "recurringFreqOrderItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theReturnPackage.getReturnHeader(), "returnHeaders", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theOpportunityPackage.getSalesForecastHistory(), "salesForecastHistories", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theOpportunityPackage.getSalesForecast(), "salesForecasts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theOpportunityPackage.getSalesOpportunity(), "salesOpportunities", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theOpportunityPackage.getSalesOpportunityHistory(), "salesOpportunityHistories", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theSupplierPackage.getSupplierProductFeature(), "supplierProductFeatures", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theOrderPackage.getOrderDeliverySchedule(), "totalCubicOrderDeliverySchedules", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theOrderPackage.getOrderDeliverySchedule(), "totalWeightOrderDeliverySchedules", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, this.getUomGroup(), "uomGroups", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theSubscriptionPackage.getSubscription(), "useTimeSubscriptions", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theFacilityPackage.getFacility(), "weightFacilities", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theProductPackage.getProduct(), "weightProducts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theShipment_Package.getShipmentBoxType(), "weightShipmentBoxTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theShipment_Package.getShipmentCostEstimate(), "weightShipmentCostEstimates", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theShipment_Package.getShipmentPackage(), "weightShipmentPackages", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomEClass, theProductPackage.getProduct(), "widthProducts", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(uomConversionEClass, UomConversion.class, "UomConversion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUomConversion_UomId(), this.getUom(), null, "uomId", null, 1, 1, UomConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getUomConversion_UomId().getEKeys().add(this.getUom_UomId());
		initEReference(getUomConversion_UomIdTo(), this.getUom(), null, "uomIdTo", null, 1, 1, UomConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getUomConversion_UomIdTo().getEKeys().add(this.getUom_UomId());
		initEAttribute(getUomConversion_ConversionFactor(), ecorePackage.getEDouble(), "conversionFactor", null, 0, 1, UomConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUomConversion_CustomMethodId(), theMethodPackage.getCustomMethod(), null, "customMethodId", null, 0, 1, UomConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getUomConversion_CustomMethodId().getEKeys().add(theMethodPackage.getCustomMethod_CustomMethodId());
		initEAttribute(getUomConversion_DecimalScale(), ecorePackage.getELong(), "decimalScale", null, 0, 1, UomConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomConversion_RoundingMode(), ecorePackage.getEString(), "roundingMode", null, 0, 1, UomConversion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uomConversionDatedEClass, UomConversionDated.class, "UomConversionDated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUomConversionDated_UomId(), this.getUom(), null, "uomId", null, 1, 1, UomConversionDated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getUomConversionDated_UomId().getEKeys().add(this.getUom_UomId());
		initEReference(getUomConversionDated_UomIdTo(), this.getUom(), null, "uomIdTo", null, 1, 1, UomConversionDated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getUomConversionDated_UomIdTo().getEKeys().add(this.getUom_UomId());
		initEAttribute(getUomConversionDated_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, UomConversionDated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomConversionDated_ConversionFactor(), ecorePackage.getEDouble(), "conversionFactor", null, 0, 1, UomConversionDated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUomConversionDated_CustomMethodId(), theMethodPackage.getCustomMethod(), null, "customMethodId", null, 0, 1, UomConversionDated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getUomConversionDated_CustomMethodId().getEKeys().add(theMethodPackage.getCustomMethod_CustomMethodId());
		initEAttribute(getUomConversionDated_DecimalScale(), ecorePackage.getELong(), "decimalScale", null, 0, 1, UomConversionDated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUomConversionDated_PurposeEnumId(), theEnumPackage.getEnumeration(), null, "purposeEnumId", null, 0, 1, UomConversionDated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getUomConversionDated_PurposeEnumId().getEKeys().add(theEnumPackage.getEnumeration_EnumId());
		initEAttribute(getUomConversionDated_RoundingMode(), ecorePackage.getEString(), "roundingMode", null, 0, 1, UomConversionDated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomConversionDated_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, UomConversionDated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uomGroupEClass, UomGroup.class, "UomGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUomGroup_UomId(), this.getUom(), null, "uomId", null, 1, 1, UomGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getUomGroup_UomId().getEKeys().add(this.getUom_UomId());
		initEAttribute(getUomGroup_UomGroupId(), ecorePackage.getEString(), "uomGroupId", null, 1, 1, UomGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uomTypeEClass, UomType.class, "UomType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUomType_UomTypeId(), ecorePackage.getEString(), "uomTypeId", null, 1, 1, UomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomType_Description(), ecorePackage.getEString(), "description", null, 0, 1, UomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUomType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, UomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUomType_ParentTypeId(), this.getUomType(), null, "parentTypeId", null, 0, 1, UomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getUomType_ParentTypeId().getEKeys().add(this.getUomType_UomTypeId());

		addEOperation(uomTypeEClass, theProductPackage.getProduct(), "amountProducts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomTypeEClass, this.getUomType(), "childUomTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(uomTypeEClass, this.getUom(), "uoms", 0, -1, IS_UNIQUE, IS_ORDERED);

		// Create annotations
		// mimo-ent-frame
		createMimoentframeAnnotations();
		// mimo-ent-slot
		createMimoentslotAnnotations();
		// mimo-ent-domain
		createMimoentdomainAnnotations();
		// mimo-ent-format
		createMimoentformatAnnotations();
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
		  (uomEClass,
		   source,
		   new String[] {
			   "title", "Unit Of Measure",
			   "dictionary", "CommonEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (uomConversionEClass,
		   source,
		   new String[] {
			   "title", "Unit Of Measure Conversion Type"
		   });
		addAnnotation
		  (uomConversionDatedEClass,
		   source,
		   new String[] {
			   "title", "Unit Of Measure Conversion Entity for those Units of Measure whose conversion values change over time (ie, currencies)"
		   });
		addAnnotation
		  (uomGroupEClass,
		   source,
		   new String[] {
			   "title", "Unit Of Measure Group",
			   "dictionary", "CommonEntityLabels"
		   });
		addAnnotation
		  (uomTypeEClass,
		   source,
		   new String[] {
			   "title", "Unit Of Measure Type",
			   "dictionary", "CommonEntityLabels",
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
		  (getUom_UomId(),
		   source,
		   new String[] {
			   "type", "id",
			   "length", "20"
		   });
		addAnnotation
		  (getUom_Abbreviation(),
		   source,
		   new String[] {
			   "type", "short-varchar",
			   "length", "60"
		   });
		addAnnotation
		  (getUom_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getUom_NumericCode(),
		   source,
		   new String[] {
			   "type", "numeric",
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getUomConversion_ConversionFactor(),
		   source,
		   new String[] {
			   "type", "floating-point"
		   });
		addAnnotation
		  (getUomConversion_DecimalScale(),
		   source,
		   new String[] {
			   "type", "numeric",
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getUomConversion_RoundingMode(),
		   source,
		   new String[] {
			   "type", "id",
			   "length", "20"
		   });
		addAnnotation
		  (getUomConversionDated_FromDate(),
		   source,
		   new String[] {
			   "type", "date-time"
		   });
		addAnnotation
		  (getUomConversionDated_ConversionFactor(),
		   source,
		   new String[] {
			   "type", "floating-point"
		   });
		addAnnotation
		  (getUomConversionDated_DecimalScale(),
		   source,
		   new String[] {
			   "type", "numeric",
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getUomConversionDated_RoundingMode(),
		   source,
		   new String[] {
			   "type", "id",
			   "length", "20"
		   });
		addAnnotation
		  (getUomConversionDated_ThruDate(),
		   source,
		   new String[] {
			   "type", "date-time"
		   });
		addAnnotation
		  (getUomGroup_UomGroupId(),
		   source,
		   new String[] {
			   "type", "id",
			   "length", "20"
		   });
		addAnnotation
		  (getUomType_UomTypeId(),
		   source,
		   new String[] {
			   "type", "id",
			   "length", "20"
		   });
		addAnnotation
		  (getUomType_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getUomType_HasTable(),
		   source,
		   new String[] {
			   "type", "indicator",
			   "length", "1"
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
		  (uomEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(3),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(4),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(5),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(6),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(7),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(8),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(9),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(10),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(11),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(12),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(13),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(14),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(15),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(16),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(17),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(18),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(19),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(20),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(21),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(22),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(23),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(24),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(25),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(26),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(27),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(28),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(29),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(30),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(31),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(32),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(33),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(34),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(35),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(36),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(37),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(38),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(39),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(40),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(41),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(42),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(43),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(44),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(45),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(46),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(47),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(48),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(49),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(50),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(51),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(52),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(53),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(54),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(55),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(56),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(57),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(58),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(59),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(60),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(61),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(62),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(63),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(64),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(65),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(66),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(67),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getUom_MainUomConversions(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getUomConversion_UomId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getUomConversion_UomIdTo(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getUomConversionDated_UomId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getUomConversionDated_UomIdTo(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getUomConversionDated_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getUomGroup_UomId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getUomGroup_UomGroupId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (uomTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (uomTypeEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "derived", "true"
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
		  (uomEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "Payment",
			   "route", "actualCurrencyUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "Subscription",
			   "route", "availableTimeUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "frame", "BillingAccountTerm",
			   "route", "uomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(3),
		   source,
		   new String[] {
			   "frame", "BillingAccount",
			   "route", "accountCurrencyUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(4),
		   source,
		   new String[] {
			   "frame", "ShipmentRouteSegment",
			   "route", "billingWeightUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(5),
		   source,
		   new String[] {
			   "frame", "Subscription",
			   "route", "canclAutmExtTimeUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(6),
		   source,
		   new String[] {
			   "frame", "UomConversion",
			   "route", "uomIdTo"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(7),
		   source,
		   new String[] {
			   "frame", "CostComponentCalc",
			   "route", "currencyUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(8),
		   source,
		   new String[] {
			   "frame", "AcctgTransEntry",
			   "route", "currencyUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(9),
		   source,
		   new String[] {
			   "frame", "CostComponent",
			   "route", "costUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(10),
		   source,
		   new String[] {
			   "frame", "CustRequest",
			   "route", "currencyUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(11),
		   source,
		   new String[] {
			   "frame", "FinAccount",
			   "route", "currencyUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(12),
		   source,
		   new String[] {
			   "frame", "InventoryItem",
			   "route", "currencyUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(13),
		   source,
		   new String[] {
			   "frame", "Invoice",
			   "route", "currencyUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(14),
		   source,
		   new String[] {
			   "frame", "Payment",
			   "route", "currencyUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(15),
		   source,
		   new String[] {
			   "frame", "ShipmentRouteSegment",
			   "route", "currencyUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(16),
		   source,
		   new String[] {
			   "frame", "Shipment",
			   "route", "currencyUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(17),
		   source,
		   new String[] {
			   "frame", "ProductMeterType",
			   "route", "defaultUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(18),
		   source,
		   new String[] {
			   "frame", "Product",
			   "route", "depthUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(19),
		   source,
		   new String[] {
			   "frame", "Product",
			   "route", "diameterUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(20),
		   source,
		   new String[] {
			   "frame", "Facility",
			   "route", "defaultDimensionUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(21),
		   source,
		   new String[] {
			   "frame", "ShipmentBoxType",
			   "route", "dimensionUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(22),
		   source,
		   new String[] {
			   "frame", "ShipmentPackage",
			   "route", "dimensionUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(23),
		   source,
		   new String[] {
			   "frame", "GeoPoint",
			   "route", "elevationUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(24),
		   source,
		   new String[] {
			   "frame", "Facility",
			   "route", "facilitySizeUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(25),
		   source,
		   new String[] {
			   "frame", "FixedAsset",
			   "route", "uomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(26),
		   source,
		   new String[] {
			   "frame", "Subscription",
			   "route", "gracePeriodOnExpiryUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(27),
		   source,
		   new String[] {
			   "frame", "Product",
			   "route", "heightUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(28),
		   source,
		   new String[] {
			   "frame", "FixedAssetMaint",
			   "route", "intervalUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(29),
		   source,
		   new String[] {
			   "frame", "ProductMaint",
			   "route", "intervalUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(30),
		   source,
		   new String[] {
			   "frame", "InventoryItem",
			   "route", "uomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(31),
		   source,
		   new String[] {
			   "frame", "InvoiceItem",
			   "route", "uomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(32),
		   source,
		   new String[] {
			   "frame", "MarketingCampaign",
			   "route", "currencyUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(33),
		   source,
		   new String[] {
			   "frame", "Subscription",
			   "route", "maxLifeTimeUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(34),
		   source,
		   new String[] {
			   "frame", "CustRequest",
			   "route", "maximumAmountUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(35),
		   source,
		   new String[] {
			   "frame", "ProductMeter",
			   "route", "meterUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(36),
		   source,
		   new String[] {
			   "frame", "WorkEffort",
			   "route", "moneyUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(37),
		   source,
		   new String[] {
			   "frame", "OrderHeader",
			   "route", "currencyUom"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(38),
		   source,
		   new String[] {
			   "frame", "AcctgTransEntry",
			   "route", "origCurrencyUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(39),
		   source,
		   new String[] {
			   "frame", "Party",
			   "route", "preferredCurrencyUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(40),
		   source,
		   new String[] {
			   "frame", "PartyAcctgPreference",
			   "route", "baseCurrencyUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(41),
		   source,
		   new String[] {
			   "frame", "PaymentGatewayResponse",
			   "route", "currencyUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(42),
		   source,
		   new String[] {
			   "frame", "PeriodType",
			   "route", "uomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(43),
		   source,
		   new String[] {
			   "frame", "ShipmentCostEstimate",
			   "route", "priceUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(44),
		   source,
		   new String[] {
			   "frame", "ProductFeature",
			   "route", "uomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(45),
		   source,
		   new String[] {
			   "frame", "ProductStore",
			   "route", "defaultCurrencyUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(46),
		   source,
		   new String[] {
			   "frame", "Product",
			   "route", "quantityUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(47),
		   source,
		   new String[] {
			   "frame", "SalesForecastDetail",
			   "route", "quantityUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(48),
		   source,
		   new String[] {
			   "frame", "ShipmentCostEstimate",
			   "route", "quantityUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(49),
		   source,
		   new String[] {
			   "frame", "QuoteItem",
			   "route", "uomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(50),
		   source,
		   new String[] {
			   "frame", "Quote",
			   "route", "currencyUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(51),
		   source,
		   new String[] {
			   "frame", "OrderItem",
			   "route", "recurringFreqUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(52),
		   source,
		   new String[] {
			   "frame", "ReturnHeader",
			   "route", "currencyUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(53),
		   source,
		   new String[] {
			   "frame", "SalesForecastHistory",
			   "route", "currencyUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(54),
		   source,
		   new String[] {
			   "frame", "SalesForecast",
			   "route", "currencyUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(55),
		   source,
		   new String[] {
			   "frame", "SalesOpportunity",
			   "route", "currencyUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(56),
		   source,
		   new String[] {
			   "frame", "SalesOpportunityHistory",
			   "route", "currencyUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(57),
		   source,
		   new String[] {
			   "frame", "SupplierProductFeature",
			   "route", "uomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(58),
		   source,
		   new String[] {
			   "frame", "OrderDeliverySchedule",
			   "route", "totalCubicUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(59),
		   source,
		   new String[] {
			   "frame", "OrderDeliverySchedule",
			   "route", "totalWeightUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(60),
		   source,
		   new String[] {
			   "frame", "UomGroup",
			   "route", "uomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(61),
		   source,
		   new String[] {
			   "frame", "Subscription",
			   "route", "useTimeUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(62),
		   source,
		   new String[] {
			   "frame", "Facility",
			   "route", "defaultWeightUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(63),
		   source,
		   new String[] {
			   "frame", "Product",
			   "route", "weightUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(64),
		   source,
		   new String[] {
			   "frame", "ShipmentBoxType",
			   "route", "weightUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(65),
		   source,
		   new String[] {
			   "frame", "ShipmentCostEstimate",
			   "route", "weightUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(66),
		   source,
		   new String[] {
			   "frame", "ShipmentPackage",
			   "route", "weightUomId"
		   });
		addAnnotation
		  (uomEClass.getEOperations().get(67),
		   source,
		   new String[] {
			   "frame", "Product",
			   "route", "widthUomId"
		   });
		addAnnotation
		  (getUom_MainUomConversions(),
		   source,
		   new String[] {
			   "frame", "UomConversion"
		   });
		addAnnotation
		  (uomTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "Product",
			   "route", "amountUomTypeId"
		   });
		addAnnotation
		  (uomTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "UomType",
			   "route", "parentTypeId"
		   });
		addAnnotation
		  (uomTypeEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "frame", "Uom",
			   "route", "uomTypeId"
		   });
	}

} //UomPackageImpl
