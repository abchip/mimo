/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.status.impl;

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
import org.abchip.mimo.biz.common.status.StatusFactory;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.status.StatusPackage;
import org.abchip.mimo.biz.common.status.StatusType;
import org.abchip.mimo.biz.common.status.StatusValidChange;
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
public class StatusPackageImpl extends EPackageImpl implements StatusPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusValidChangeEClass = null;

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
	 * @see org.abchip.mimo.biz.common.status.StatusPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatusPackageImpl() {
		super(eNS_URI, StatusFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatusPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatusPackage init() {
		if (isInited) return (StatusPackage)EPackage.Registry.INSTANCE.getEPackage(StatusPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStatusPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StatusPackageImpl theStatusPackage = registeredStatusPackage instanceof StatusPackageImpl ? (StatusPackageImpl)registeredStatusPackage : new StatusPackageImpl();

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
		theStatusPackage.createPackageContents();
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
		theStatusPackage.initializePackageContents();
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
		theStatusPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatusPackage.eNS_URI, theStatusPackage);
		return theStatusPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatusItem() {
		return statusItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusItem_StatusId() {
		return (EAttribute)statusItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusItem_Description() {
		return (EAttribute)statusItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusItem_SequenceId() {
		return (EAttribute)statusItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusItem_StatusCode() {
		return (EAttribute)statusItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatusItem_StatusTypeId() {
		return (EReference)statusItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusItem_ShipmentStatuss() {
		return (EAttribute)statusItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusItem_MainStatusValidChanges() {
		return (EAttribute)statusItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__AcctgTransEntries() {
		return statusItemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__AcctgTranss() {
		return statusItemEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__ApprovalContentApprovals() {
		return statusItemEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__BudgetStatuss() {
		return statusItemEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__CarrierServiceShipmentRouteSegments() {
		return statusItemEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__CommunicationEvents() {
		return statusItemEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__Contents() {
		return statusItemEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__CurrentWorkEfforts() {
		return statusItemEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__CustRequestItems() {
		return statusItemEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__CustRequestStatuss() {
		return statusItemEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__CustRequests() {
		return statusItemEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__DataResources() {
		return statusItemEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__DigitalItemApprovedProductStores() {
		return statusItemEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__EmplPositions() {
		return statusItemEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__EmploymentApps() {
		return statusItemEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__FinAccountTranss() {
		return statusItemEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__FixedAssetMaints() {
		return statusItemEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__GlReconciliations() {
		return statusItemEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__HeaderApprovedProductStores() {
		return statusItemEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__HeaderCancelProductStores() {
		return statusItemEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__HeaderDeclinedProductStores() {
		return statusItemEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__InventoryItems() {
		return statusItemEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__InventoryReturnItems() {
		return statusItemEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__InventoryTransfers() {
		return statusItemEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__Invoices() {
		return statusItemEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__ItemApprovedProductStores() {
		return statusItemEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__ItemCancelProductStores() {
		return statusItemEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__ItemDeclinedProductStores() {
		return statusItemEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__JobSandboxs() {
		return statusItemEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__MarketingCampaigns() {
		return statusItemEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__OrderDeliverySchedules() {
		return statusItemEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__OrderHeaders() {
		return statusItemEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__OrderItems() {
		return statusItemEClass.getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__OrderPaymentPreferences() {
		return statusItemEClass.getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__OrderStatuss() {
		return statusItemEClass.getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__Parties() {
		return statusItemEClass.getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__PartyInvitations() {
		return statusItemEClass.getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__Payments() {
		return statusItemEClass.getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__PicklistStatusHistories() {
		return statusItemEClass.getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__Picklists() {
		return statusItemEClass.getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__ProductGroupOrders() {
		return statusItemEClass.getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__ProductReviews() {
		return statusItemEClass.getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__Quotes() {
		return statusItemEClass.getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__RequirementStatuss() {
		return statusItemEClass.getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__Requirements() {
		return statusItemEClass.getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__ReturnHeaders() {
		return statusItemEClass.getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__ReturnItems() {
		return statusItemEClass.getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__ReturnStatuss() {
		return statusItemEClass.getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__Shipments() {
		return statusItemEClass.getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__SurveyResponses() {
		return statusItemEClass.getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__SyncOrderHeaders() {
		return statusItemEClass.getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__SyncOrderItems() {
		return statusItemEClass.getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__TestingStatuss() {
		return statusItemEClass.getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__Timesheets() {
		return statusItemEClass.getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__ToPicklistStatusHistories() {
		return statusItemEClass.getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__ToStatusValidChanges() {
		return statusItemEClass.getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__UnemploymentClaims() {
		return statusItemEClass.getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusItem__WorkEffortInventoryAssigns() {
		return statusItemEClass.getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatusType() {
		return statusTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusType_StatusTypeId() {
		return (EAttribute)statusTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusType_Description() {
		return (EAttribute)statusTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusType_HasTable() {
		return (EAttribute)statusTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatusType_ParentTypeId() {
		return (EReference)statusTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusType__ChildStatusTypes() {
		return statusTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStatusType__StatusItems() {
		return statusTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatusValidChange() {
		return statusValidChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatusValidChange_StatusId() {
		return (EReference)statusValidChangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatusValidChange_StatusIdTo() {
		return (EReference)statusValidChangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusValidChange_ConditionExpression() {
		return (EAttribute)statusValidChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatusValidChange_TransitionName() {
		return (EAttribute)statusValidChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusFactory getStatusFactory() {
		return (StatusFactory)getEFactoryInstance();
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
		statusItemEClass = createEClass(STATUS_ITEM);
		createEAttribute(statusItemEClass, STATUS_ITEM__STATUS_ID);
		createEAttribute(statusItemEClass, STATUS_ITEM__DESCRIPTION);
		createEAttribute(statusItemEClass, STATUS_ITEM__SEQUENCE_ID);
		createEAttribute(statusItemEClass, STATUS_ITEM__STATUS_CODE);
		createEReference(statusItemEClass, STATUS_ITEM__STATUS_TYPE_ID);
		createEAttribute(statusItemEClass, STATUS_ITEM__SHIPMENT_STATUSS);
		createEAttribute(statusItemEClass, STATUS_ITEM__MAIN_STATUS_VALID_CHANGES);
		createEOperation(statusItemEClass, STATUS_ITEM___ACCTG_TRANS_ENTRIES);
		createEOperation(statusItemEClass, STATUS_ITEM___ACCTG_TRANSS);
		createEOperation(statusItemEClass, STATUS_ITEM___APPROVAL_CONTENT_APPROVALS);
		createEOperation(statusItemEClass, STATUS_ITEM___BUDGET_STATUSS);
		createEOperation(statusItemEClass, STATUS_ITEM___CARRIER_SERVICE_SHIPMENT_ROUTE_SEGMENTS);
		createEOperation(statusItemEClass, STATUS_ITEM___COMMUNICATION_EVENTS);
		createEOperation(statusItemEClass, STATUS_ITEM___CONTENTS);
		createEOperation(statusItemEClass, STATUS_ITEM___CURRENT_WORK_EFFORTS);
		createEOperation(statusItemEClass, STATUS_ITEM___CUST_REQUEST_ITEMS);
		createEOperation(statusItemEClass, STATUS_ITEM___CUST_REQUEST_STATUSS);
		createEOperation(statusItemEClass, STATUS_ITEM___CUST_REQUESTS);
		createEOperation(statusItemEClass, STATUS_ITEM___DATA_RESOURCES);
		createEOperation(statusItemEClass, STATUS_ITEM___DIGITAL_ITEM_APPROVED_PRODUCT_STORES);
		createEOperation(statusItemEClass, STATUS_ITEM___EMPL_POSITIONS);
		createEOperation(statusItemEClass, STATUS_ITEM___EMPLOYMENT_APPS);
		createEOperation(statusItemEClass, STATUS_ITEM___FIN_ACCOUNT_TRANSS);
		createEOperation(statusItemEClass, STATUS_ITEM___FIXED_ASSET_MAINTS);
		createEOperation(statusItemEClass, STATUS_ITEM___GL_RECONCILIATIONS);
		createEOperation(statusItemEClass, STATUS_ITEM___HEADER_APPROVED_PRODUCT_STORES);
		createEOperation(statusItemEClass, STATUS_ITEM___HEADER_CANCEL_PRODUCT_STORES);
		createEOperation(statusItemEClass, STATUS_ITEM___HEADER_DECLINED_PRODUCT_STORES);
		createEOperation(statusItemEClass, STATUS_ITEM___INVENTORY_ITEMS);
		createEOperation(statusItemEClass, STATUS_ITEM___INVENTORY_RETURN_ITEMS);
		createEOperation(statusItemEClass, STATUS_ITEM___INVENTORY_TRANSFERS);
		createEOperation(statusItemEClass, STATUS_ITEM___INVOICES);
		createEOperation(statusItemEClass, STATUS_ITEM___ITEM_APPROVED_PRODUCT_STORES);
		createEOperation(statusItemEClass, STATUS_ITEM___ITEM_CANCEL_PRODUCT_STORES);
		createEOperation(statusItemEClass, STATUS_ITEM___ITEM_DECLINED_PRODUCT_STORES);
		createEOperation(statusItemEClass, STATUS_ITEM___JOB_SANDBOXS);
		createEOperation(statusItemEClass, STATUS_ITEM___MARKETING_CAMPAIGNS);
		createEOperation(statusItemEClass, STATUS_ITEM___ORDER_DELIVERY_SCHEDULES);
		createEOperation(statusItemEClass, STATUS_ITEM___ORDER_HEADERS);
		createEOperation(statusItemEClass, STATUS_ITEM___ORDER_ITEMS);
		createEOperation(statusItemEClass, STATUS_ITEM___ORDER_PAYMENT_PREFERENCES);
		createEOperation(statusItemEClass, STATUS_ITEM___ORDER_STATUSS);
		createEOperation(statusItemEClass, STATUS_ITEM___PARTIES);
		createEOperation(statusItemEClass, STATUS_ITEM___PARTY_INVITATIONS);
		createEOperation(statusItemEClass, STATUS_ITEM___PAYMENTS);
		createEOperation(statusItemEClass, STATUS_ITEM___PICKLIST_STATUS_HISTORIES);
		createEOperation(statusItemEClass, STATUS_ITEM___PICKLISTS);
		createEOperation(statusItemEClass, STATUS_ITEM___PRODUCT_GROUP_ORDERS);
		createEOperation(statusItemEClass, STATUS_ITEM___PRODUCT_REVIEWS);
		createEOperation(statusItemEClass, STATUS_ITEM___QUOTES);
		createEOperation(statusItemEClass, STATUS_ITEM___REQUIREMENT_STATUSS);
		createEOperation(statusItemEClass, STATUS_ITEM___REQUIREMENTS);
		createEOperation(statusItemEClass, STATUS_ITEM___RETURN_HEADERS);
		createEOperation(statusItemEClass, STATUS_ITEM___RETURN_ITEMS);
		createEOperation(statusItemEClass, STATUS_ITEM___RETURN_STATUSS);
		createEOperation(statusItemEClass, STATUS_ITEM___SHIPMENTS);
		createEOperation(statusItemEClass, STATUS_ITEM___SURVEY_RESPONSES);
		createEOperation(statusItemEClass, STATUS_ITEM___SYNC_ORDER_HEADERS);
		createEOperation(statusItemEClass, STATUS_ITEM___SYNC_ORDER_ITEMS);
		createEOperation(statusItemEClass, STATUS_ITEM___TESTING_STATUSS);
		createEOperation(statusItemEClass, STATUS_ITEM___TIMESHEETS);
		createEOperation(statusItemEClass, STATUS_ITEM___TO_PICKLIST_STATUS_HISTORIES);
		createEOperation(statusItemEClass, STATUS_ITEM___TO_STATUS_VALID_CHANGES);
		createEOperation(statusItemEClass, STATUS_ITEM___UNEMPLOYMENT_CLAIMS);
		createEOperation(statusItemEClass, STATUS_ITEM___WORK_EFFORT_INVENTORY_ASSIGNS);

		statusTypeEClass = createEClass(STATUS_TYPE);
		createEAttribute(statusTypeEClass, STATUS_TYPE__STATUS_TYPE_ID);
		createEAttribute(statusTypeEClass, STATUS_TYPE__DESCRIPTION);
		createEAttribute(statusTypeEClass, STATUS_TYPE__HAS_TABLE);
		createEReference(statusTypeEClass, STATUS_TYPE__PARENT_TYPE_ID);
		createEOperation(statusTypeEClass, STATUS_TYPE___CHILD_STATUS_TYPES);
		createEOperation(statusTypeEClass, STATUS_TYPE___STATUS_ITEMS);

		statusValidChangeEClass = createEClass(STATUS_VALID_CHANGE);
		createEAttribute(statusValidChangeEClass, STATUS_VALID_CHANGE__CONDITION_EXPRESSION);
		createEAttribute(statusValidChangeEClass, STATUS_VALID_CHANGE__TRANSITION_NAME);
		createEReference(statusValidChangeEClass, STATUS_VALID_CHANGE__STATUS_ID);
		createEReference(statusValidChangeEClass, STATUS_VALID_CHANGE__STATUS_ID_TO);
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
		EGenericType g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		EGenericType g2 = createEGenericType(this.getStatusType());
		g1.getETypeArguments().add(g2);
		statusItemEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getStatusItem());
		g1.getETypeArguments().add(g2);
		statusTypeEClass.getEGenericSuperTypes().add(g1);
		statusValidChangeEClass.getESuperTypes().add(theBizPackage.getBizEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(statusItemEClass, StatusItem.class, "StatusItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatusItem_StatusId(), ecorePackage.getEString(), "statusId", null, 1, 1, StatusItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatusItem_Description(), ecorePackage.getEString(), "description", null, 0, 1, StatusItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatusItem_SequenceId(), ecorePackage.getEString(), "sequenceId", null, 0, 1, StatusItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatusItem_StatusCode(), ecorePackage.getEString(), "statusCode", null, 0, 1, StatusItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatusItem_StatusTypeId(), this.getStatusType(), null, "statusTypeId", null, 0, 1, StatusItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getStatusItem_StatusTypeId().getEKeys().add(this.getStatusType_StatusTypeId());
		initEAttribute(getStatusItem_ShipmentStatuss(), ecorePackage.getEString(), "shipmentStatuss", null, 0, -1, StatusItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatusItem_MainStatusValidChanges(), ecorePackage.getEString(), "mainStatusValidChanges", null, 0, -1, StatusItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getStatusItem__AcctgTransEntries(), ecorePackage.getEString(), "acctgTransEntries", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__AcctgTranss(), ecorePackage.getEString(), "acctgTranss", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__ApprovalContentApprovals(), ecorePackage.getEString(), "approvalContentApprovals", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__BudgetStatuss(), ecorePackage.getEString(), "budgetStatuss", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__CarrierServiceShipmentRouteSegments(), ecorePackage.getEString(), "carrierServiceShipmentRouteSegments", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__CommunicationEvents(), ecorePackage.getEString(), "communicationEvents", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__Contents(), ecorePackage.getEString(), "contents", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__CurrentWorkEfforts(), ecorePackage.getEString(), "currentWorkEfforts", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__CustRequestItems(), ecorePackage.getEString(), "custRequestItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__CustRequestStatuss(), ecorePackage.getEString(), "custRequestStatuss", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__CustRequests(), ecorePackage.getEString(), "custRequests", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__DataResources(), ecorePackage.getEString(), "dataResources", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__DigitalItemApprovedProductStores(), ecorePackage.getEString(), "digitalItemApprovedProductStores", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__EmplPositions(), ecorePackage.getEString(), "emplPositions", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__EmploymentApps(), ecorePackage.getEString(), "employmentApps", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__FinAccountTranss(), ecorePackage.getEString(), "finAccountTranss", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__FixedAssetMaints(), ecorePackage.getEString(), "fixedAssetMaints", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__GlReconciliations(), ecorePackage.getEString(), "glReconciliations", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__HeaderApprovedProductStores(), ecorePackage.getEString(), "headerApprovedProductStores", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__HeaderCancelProductStores(), ecorePackage.getEString(), "headerCancelProductStores", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__HeaderDeclinedProductStores(), ecorePackage.getEString(), "headerDeclinedProductStores", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__InventoryItems(), ecorePackage.getEString(), "inventoryItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__InventoryReturnItems(), ecorePackage.getEString(), "inventoryReturnItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__InventoryTransfers(), ecorePackage.getEString(), "inventoryTransfers", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__Invoices(), ecorePackage.getEString(), "invoices", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__ItemApprovedProductStores(), ecorePackage.getEString(), "itemApprovedProductStores", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__ItemCancelProductStores(), ecorePackage.getEString(), "itemCancelProductStores", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__ItemDeclinedProductStores(), ecorePackage.getEString(), "itemDeclinedProductStores", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__JobSandboxs(), ecorePackage.getEString(), "jobSandboxs", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__MarketingCampaigns(), ecorePackage.getEString(), "marketingCampaigns", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__OrderDeliverySchedules(), ecorePackage.getEString(), "orderDeliverySchedules", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__OrderHeaders(), ecorePackage.getEString(), "orderHeaders", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__OrderItems(), ecorePackage.getEString(), "orderItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__OrderPaymentPreferences(), ecorePackage.getEString(), "orderPaymentPreferences", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__OrderStatuss(), ecorePackage.getEString(), "orderStatuss", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__Parties(), ecorePackage.getEString(), "parties", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__PartyInvitations(), ecorePackage.getEString(), "partyInvitations", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__Payments(), ecorePackage.getEString(), "payments", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__PicklistStatusHistories(), ecorePackage.getEString(), "picklistStatusHistories", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__Picklists(), ecorePackage.getEString(), "picklists", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__ProductGroupOrders(), ecorePackage.getEString(), "productGroupOrders", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__ProductReviews(), ecorePackage.getEString(), "productReviews", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__Quotes(), ecorePackage.getEString(), "quotes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__RequirementStatuss(), ecorePackage.getEString(), "requirementStatuss", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__Requirements(), ecorePackage.getEString(), "requirements", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__ReturnHeaders(), ecorePackage.getEString(), "returnHeaders", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__ReturnItems(), ecorePackage.getEString(), "returnItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__ReturnStatuss(), ecorePackage.getEString(), "returnStatuss", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__Shipments(), ecorePackage.getEString(), "shipments", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__SurveyResponses(), ecorePackage.getEString(), "surveyResponses", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__SyncOrderHeaders(), ecorePackage.getEString(), "syncOrderHeaders", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__SyncOrderItems(), ecorePackage.getEString(), "syncOrderItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__TestingStatuss(), ecorePackage.getEString(), "testingStatuss", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__Timesheets(), ecorePackage.getEString(), "timesheets", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__ToPicklistStatusHistories(), ecorePackage.getEString(), "toPicklistStatusHistories", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__ToStatusValidChanges(), ecorePackage.getEString(), "toStatusValidChanges", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__UnemploymentClaims(), ecorePackage.getEString(), "unemploymentClaims", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusItem__WorkEffortInventoryAssigns(), ecorePackage.getEString(), "workEffortInventoryAssigns", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(statusTypeEClass, StatusType.class, "StatusType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatusType_StatusTypeId(), ecorePackage.getEString(), "statusTypeId", null, 1, 1, StatusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatusType_Description(), ecorePackage.getEString(), "description", null, 0, 1, StatusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatusType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, StatusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatusType_ParentTypeId(), this.getStatusType(), null, "parentTypeId", null, 0, 1, StatusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getStatusType_ParentTypeId().getEKeys().add(this.getStatusType_StatusTypeId());

		initEOperation(getStatusType__ChildStatusTypes(), ecorePackage.getEString(), "childStatusTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStatusType__StatusItems(), ecorePackage.getEString(), "statusItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(statusValidChangeEClass, StatusValidChange.class, "StatusValidChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatusValidChange_ConditionExpression(), ecorePackage.getEString(), "conditionExpression", null, 0, 1, StatusValidChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatusValidChange_TransitionName(), ecorePackage.getEString(), "transitionName", null, 0, 1, StatusValidChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatusValidChange_StatusId(), this.getStatusItem(), null, "statusId", null, 0, 1, StatusValidChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getStatusValidChange_StatusId().getEKeys().add(this.getStatusItem_StatusId());
		initEReference(getStatusValidChange_StatusIdTo(), this.getStatusItem(), null, "statusIdTo", null, 0, 1, StatusValidChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getStatusValidChange_StatusIdTo().getEKeys().add(this.getStatusItem_StatusId());

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
		  (statusItemEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (statusTypeEClass,
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
		  (getStatusItem__AcctgTransEntries(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__AcctgTranss(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__ApprovalContentApprovals(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__BudgetStatuss(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__CarrierServiceShipmentRouteSegments(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__CommunicationEvents(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__Contents(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__CurrentWorkEfforts(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__CustRequestItems(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__CustRequestStatuss(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__CustRequests(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__DataResources(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__DigitalItemApprovedProductStores(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__EmplPositions(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__EmploymentApps(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__FinAccountTranss(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__FixedAssetMaints(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__GlReconciliations(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__HeaderApprovedProductStores(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__HeaderCancelProductStores(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__HeaderDeclinedProductStores(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__InventoryItems(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__InventoryReturnItems(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__InventoryTransfers(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__Invoices(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__ItemApprovedProductStores(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__ItemCancelProductStores(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__ItemDeclinedProductStores(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__JobSandboxs(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__MarketingCampaigns(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__OrderDeliverySchedules(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__OrderHeaders(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__OrderItems(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__OrderPaymentPreferences(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__OrderStatuss(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__Parties(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__PartyInvitations(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__Payments(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__PicklistStatusHistories(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__Picklists(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__ProductGroupOrders(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__ProductReviews(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__Quotes(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__RequirementStatuss(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__Requirements(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__ReturnHeaders(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__ReturnItems(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__ReturnStatuss(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__Shipments(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__SurveyResponses(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__SyncOrderHeaders(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__SyncOrderItems(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__TestingStatuss(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__Timesheets(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__ToPicklistStatusHistories(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__ToStatusValidChanges(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__UnemploymentClaims(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem__WorkEffortInventoryAssigns(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem_StatusId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getStatusItem_ShipmentStatuss(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusItem_MainStatusValidChanges(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusType__ChildStatusTypes(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusType__StatusItems(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getStatusType_StatusTypeId(),
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
		  (getStatusItem__AcctgTransEntries(),
		   source,
		   new String[] {
			   "frame", "AcctgTransEntry",
			   "route", "reconcileStatusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__AcctgTranss(),
		   source,
		   new String[] {
			   "frame", "AcctgTrans",
			   "route", "groupStatusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__ApprovalContentApprovals(),
		   source,
		   new String[] {
			   "frame", "ContentApproval",
			   "route", "approvalStatusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__BudgetStatuss(),
		   source,
		   new String[] {
			   "frame", "BudgetStatus",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__CarrierServiceShipmentRouteSegments(),
		   source,
		   new String[] {
			   "frame", "ShipmentRouteSegment",
			   "route", "carrierServiceStatusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__CommunicationEvents(),
		   source,
		   new String[] {
			   "frame", "CommunicationEvent",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__Contents(),
		   source,
		   new String[] {
			   "frame", "Content",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__CurrentWorkEfforts(),
		   source,
		   new String[] {
			   "frame", "WorkEffort",
			   "route", "currentStatusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__CustRequestItems(),
		   source,
		   new String[] {
			   "frame", "CustRequestItem",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__CustRequestStatuss(),
		   source,
		   new String[] {
			   "frame", "CustRequestStatus",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__CustRequests(),
		   source,
		   new String[] {
			   "frame", "CustRequest",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__DataResources(),
		   source,
		   new String[] {
			   "frame", "DataResource",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__DigitalItemApprovedProductStores(),
		   source,
		   new String[] {
			   "frame", "ProductStore",
			   "route", "digitalItemApprovedStatus"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__EmplPositions(),
		   source,
		   new String[] {
			   "frame", "EmplPosition",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__EmploymentApps(),
		   source,
		   new String[] {
			   "frame", "EmploymentApp",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__FinAccountTranss(),
		   source,
		   new String[] {
			   "frame", "FinAccountTrans",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__FixedAssetMaints(),
		   source,
		   new String[] {
			   "frame", "FixedAssetMaint",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__GlReconciliations(),
		   source,
		   new String[] {
			   "frame", "GlReconciliation",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__HeaderApprovedProductStores(),
		   source,
		   new String[] {
			   "frame", "ProductStore",
			   "route", "headerApprovedStatus"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__HeaderCancelProductStores(),
		   source,
		   new String[] {
			   "frame", "ProductStore",
			   "route", "headerCancelStatus"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__HeaderDeclinedProductStores(),
		   source,
		   new String[] {
			   "frame", "ProductStore",
			   "route", "headerDeclinedStatus"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__InventoryItems(),
		   source,
		   new String[] {
			   "frame", "InventoryItem",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__InventoryReturnItems(),
		   source,
		   new String[] {
			   "frame", "ReturnItem",
			   "route", "expectedItemStatus"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__InventoryTransfers(),
		   source,
		   new String[] {
			   "frame", "InventoryTransfer",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__Invoices(),
		   source,
		   new String[] {
			   "frame", "Invoice",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__ItemApprovedProductStores(),
		   source,
		   new String[] {
			   "frame", "ProductStore",
			   "route", "itemApprovedStatus"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__ItemCancelProductStores(),
		   source,
		   new String[] {
			   "frame", "ProductStore",
			   "route", "itemCancelStatus"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__ItemDeclinedProductStores(),
		   source,
		   new String[] {
			   "frame", "ProductStore",
			   "route", "itemDeclinedStatus"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__JobSandboxs(),
		   source,
		   new String[] {
			   "frame", "JobSandbox",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__MarketingCampaigns(),
		   source,
		   new String[] {
			   "frame", "MarketingCampaign",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__OrderDeliverySchedules(),
		   source,
		   new String[] {
			   "frame", "OrderDeliverySchedule",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__OrderHeaders(),
		   source,
		   new String[] {
			   "frame", "OrderHeader",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__OrderItems(),
		   source,
		   new String[] {
			   "frame", "OrderItem",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__OrderPaymentPreferences(),
		   source,
		   new String[] {
			   "frame", "OrderPaymentPreference",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__OrderStatuss(),
		   source,
		   new String[] {
			   "frame", "OrderStatus",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__Parties(),
		   source,
		   new String[] {
			   "frame", "Party",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__PartyInvitations(),
		   source,
		   new String[] {
			   "frame", "PartyInvitation",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__Payments(),
		   source,
		   new String[] {
			   "frame", "Payment",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__PicklistStatusHistories(),
		   source,
		   new String[] {
			   "frame", "PicklistStatusHistory",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__Picklists(),
		   source,
		   new String[] {
			   "frame", "Picklist",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__ProductGroupOrders(),
		   source,
		   new String[] {
			   "frame", "ProductGroupOrder",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__ProductReviews(),
		   source,
		   new String[] {
			   "frame", "ProductReview",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__Quotes(),
		   source,
		   new String[] {
			   "frame", "Quote",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__RequirementStatuss(),
		   source,
		   new String[] {
			   "frame", "RequirementStatus",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__Requirements(),
		   source,
		   new String[] {
			   "frame", "Requirement",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__ReturnHeaders(),
		   source,
		   new String[] {
			   "frame", "ReturnHeader",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__ReturnItems(),
		   source,
		   new String[] {
			   "frame", "ReturnItem",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__ReturnStatuss(),
		   source,
		   new String[] {
			   "frame", "ReturnStatus",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__Shipments(),
		   source,
		   new String[] {
			   "frame", "Shipment",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__SurveyResponses(),
		   source,
		   new String[] {
			   "frame", "SurveyResponse",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__SyncOrderHeaders(),
		   source,
		   new String[] {
			   "frame", "OrderHeader",
			   "route", "syncStatusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__SyncOrderItems(),
		   source,
		   new String[] {
			   "frame", "OrderItem",
			   "route", "syncStatusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__TestingStatuss(),
		   source,
		   new String[] {
			   "frame", "TestingStatus",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__Timesheets(),
		   source,
		   new String[] {
			   "frame", "Timesheet",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__ToPicklistStatusHistories(),
		   source,
		   new String[] {
			   "frame", "PicklistStatusHistory",
			   "route", "statusIdTo"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__ToStatusValidChanges(),
		   source,
		   new String[] {
			   "frame", "StatusValidChange",
			   "route", "statusIdTo"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__UnemploymentClaims(),
		   source,
		   new String[] {
			   "frame", "UnemploymentClaim",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem__WorkEffortInventoryAssigns(),
		   source,
		   new String[] {
			   "frame", "WorkEffortInventoryAssign",
			   "route", "statusId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem_ShipmentStatuss(),
		   source,
		   new String[] {
			   "frame", "ShipmentStatus"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusItem_MainStatusValidChanges(),
		   source,
		   new String[] {
			   "frame", "StatusValidChange"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusType__ChildStatusTypes(),
		   source,
		   new String[] {
			   "frame", "StatusType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getStatusType__StatusItems(),
		   source,
		   new String[] {
			   "frame", "StatusItem",
			   "route", "statusTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
	}

} //StatusPackageImpl
