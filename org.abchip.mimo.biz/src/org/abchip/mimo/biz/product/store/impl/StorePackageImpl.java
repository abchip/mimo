/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store.impl;

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
import org.abchip.mimo.biz.product.store.ProductStore;
import org.abchip.mimo.biz.product.store.ProductStoreCatalog;
import org.abchip.mimo.biz.product.store.ProductStoreEmailSetting;
import org.abchip.mimo.biz.product.store.ProductStoreFacility;
import org.abchip.mimo.biz.product.store.ProductStoreFinActSetting;
import org.abchip.mimo.biz.product.store.ProductStoreGroup;
import org.abchip.mimo.biz.product.store.ProductStoreGroupMember;
import org.abchip.mimo.biz.product.store.ProductStoreGroupRole;
import org.abchip.mimo.biz.product.store.ProductStoreGroupRollup;
import org.abchip.mimo.biz.product.store.ProductStoreGroupType;
import org.abchip.mimo.biz.product.store.ProductStoreKeywordOvrd;
import org.abchip.mimo.biz.product.store.ProductStorePaymentSetting;
import org.abchip.mimo.biz.product.store.ProductStorePromoAppl;
import org.abchip.mimo.biz.product.store.ProductStoreRole;
import org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth;
import org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl;
import org.abchip.mimo.biz.product.store.ProductStoreVendorPayment;
import org.abchip.mimo.biz.product.store.ProductStoreVendorShipment;
import org.abchip.mimo.biz.product.store.StoreFactory;
import org.abchip.mimo.biz.product.store.StorePackage;
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
public class StorePackageImpl extends EPackageImpl implements StorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productStoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productStoreCatalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productStoreEmailSettingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productStoreFacilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productStoreFinActSettingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productStoreGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productStoreGroupMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productStoreGroupRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productStoreGroupRollupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productStoreGroupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productStoreKeywordOvrdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productStorePaymentSettingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productStorePromoApplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productStoreRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productStoreShipmentMethEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productStoreSurveyApplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productStoreVendorPaymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productStoreVendorShipmentEClass = null;

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
	 * @see org.abchip.mimo.biz.product.store.StorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StorePackageImpl() {
		super(eNS_URI, StoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StorePackage init() {
		if (isInited) return (StorePackage)EPackage.Registry.INSTANCE.getEPackage(StorePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStorePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StorePackageImpl theStorePackage = registeredStorePackage instanceof StorePackageImpl ? (StorePackageImpl)registeredStorePackage : new StorePackageImpl();

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
		theStorePackage.createPackageContents();
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
		theStorePackage.initializePackageContents();
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
		theStorePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StorePackage.eNS_URI, theStorePackage);
		return theStorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductStore() {
		return productStoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_ProductStoreId() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_AddToCartRemoveIncompat() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_AddToCartReplaceUpsell() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_AllowComment() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_AllowPassword() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_AuthDeclinedMessage() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_AuthErrorMessage() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_AuthFraudMessage() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_AutoApproveInvoice() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_AutoApproveOrder() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_AutoApproveReviews() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_AutoInvoiceDigitalItems() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_AutoOrderCcTryExp() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_AutoOrderCcTryLaterMax() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_AutoOrderCcTryLaterNsf() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_AutoOrderCcTryOtherCards() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_AutoSaveCart() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_BalanceResOnOrderCreation() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_CheckGcBalance() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_CheckInventory() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_CompanyName() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_DaysToCancelNonPay() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_DefaultCurrencyUomId() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_DefaultLocaleString() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_DefaultPassword() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_DefaultSalesChannelEnumId() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_DefaultTimeZoneString() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_DigProdUploadCategoryId() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_DigitalItemApprovedStatus() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_EnableAutoSuggestionList() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_EnableDigProdUpload() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_ExplodeOrderItems() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_HeaderApprovedStatus() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_HeaderCancelStatus() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_HeaderDeclinedStatus() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_InventoryFacilityId() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_IsDemoStore() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_IsImmediatelyFulfilled() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_ItemApprovedStatus() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_ItemCancelStatus() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_ItemDeclinedStatus() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_ManagedByLot() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_ManualAuthIsCapture() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_OldHeaderLogo() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_OldHeaderMiddleBackground() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_OldHeaderRightBackground() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_OldStyleSheet() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_OneInventoryFacility() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_OrderDecimalQuantity() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_OrderNumberPrefix() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_PayToPartyId() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_PrimaryStoreGroupId() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_ProdSearchExcludeVariants() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_ProrateShipping() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_ProrateTaxes() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_ReqReturnInventoryReceive() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_ReqShipAddrForDigItems() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_RequireCustomerRole() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_RequireInventory() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_RequirementMethodEnumId() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_ReserveInventory() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_ReserveOrderEnumId() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_RetryFailedAuths() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_SelectPaymentTypePerItem() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_SetOwnerUponIssuance() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_ShipIfCaptureFails() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_ShowCheckoutGiftOptions() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_ShowOutOfStockProducts() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_ShowPricesWithVatTax() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_ShowTaxIsExempt() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_SplitPayPrefPerShpGrp() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_StoreCreditAccountEnumId() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_StoreCreditValidDays() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_StoreName() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_Subtitle() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_Title() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_UsePrimaryEmailUsername() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_VatTaxAuthGeoId() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_VatTaxAuthPartyId() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_ViewCartOnAdd() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_VisualThemeId() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_OAuth2GitHubs() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_OAuth2Googles() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_OAuth2LinkedIns() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_ProductStoreEmailSettings() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStore_ProductStoreFinActSettings() {
		return (EAttribute)productStoreEClass.getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductStoreCatalog() {
		return productStoreCatalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreCatalog_ProductStoreId() {
		return (EAttribute)productStoreCatalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreCatalog_ProdCatalogId() {
		return (EAttribute)productStoreCatalogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreCatalog_FromDate() {
		return (EAttribute)productStoreCatalogEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreCatalog_SequenceNum() {
		return (EAttribute)productStoreCatalogEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreCatalog_ThruDate() {
		return (EAttribute)productStoreCatalogEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductStoreEmailSetting() {
		return productStoreEmailSettingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreEmailSetting_ProductStoreId() {
		return (EAttribute)productStoreEmailSettingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreEmailSetting_EmailType() {
		return (EAttribute)productStoreEmailSettingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreEmailSetting_BccAddress() {
		return (EAttribute)productStoreEmailSettingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreEmailSetting_BodyScreenLocation() {
		return (EAttribute)productStoreEmailSettingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreEmailSetting_CcAddress() {
		return (EAttribute)productStoreEmailSettingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreEmailSetting_ContentType() {
		return (EAttribute)productStoreEmailSettingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreEmailSetting_FromAddress() {
		return (EAttribute)productStoreEmailSettingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreEmailSetting_Subject() {
		return (EAttribute)productStoreEmailSettingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreEmailSetting_XslfoAttachScreenLocation() {
		return (EAttribute)productStoreEmailSettingEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductStoreFacility() {
		return productStoreFacilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreFacility_ProductStoreId() {
		return (EAttribute)productStoreFacilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreFacility_FacilityId() {
		return (EAttribute)productStoreFacilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreFacility_FromDate() {
		return (EAttribute)productStoreFacilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreFacility_SequenceNum() {
		return (EAttribute)productStoreFacilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreFacility_ThruDate() {
		return (EAttribute)productStoreFacilityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductStoreFinActSetting() {
		return productStoreFinActSettingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreFinActSetting_ProductStoreId() {
		return (EAttribute)productStoreFinActSettingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreFinActSetting_FinAccountTypeId() {
		return (EAttribute)productStoreFinActSettingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreFinActSetting_AccountCodeLength() {
		return (EAttribute)productStoreFinActSettingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreFinActSetting_AccountValidDays() {
		return (EAttribute)productStoreFinActSettingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreFinActSetting_AllowAuthToNegative() {
		return (EAttribute)productStoreFinActSettingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreFinActSetting_AuthValidDays() {
		return (EAttribute)productStoreFinActSettingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreFinActSetting_MinBalance() {
		return (EAttribute)productStoreFinActSettingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreFinActSetting_PinCodeLength() {
		return (EAttribute)productStoreFinActSettingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreFinActSetting_PurchSurveyCopyMe() {
		return (EAttribute)productStoreFinActSettingEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreFinActSetting_PurchSurveySendTo() {
		return (EAttribute)productStoreFinActSettingEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreFinActSetting_PurchaseSurveyId() {
		return (EAttribute)productStoreFinActSettingEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreFinActSetting_ReplenishMethodEnumId() {
		return (EAttribute)productStoreFinActSettingEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreFinActSetting_ReplenishThreshold() {
		return (EAttribute)productStoreFinActSettingEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreFinActSetting_RequirePinCode() {
		return (EAttribute)productStoreFinActSettingEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreFinActSetting_ValidateGCFinAcct() {
		return (EAttribute)productStoreFinActSettingEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductStoreGroup() {
		return productStoreGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreGroup_ProductStoreGroupId() {
		return (EAttribute)productStoreGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreGroup_Description() {
		return (EAttribute)productStoreGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreGroup_PrimaryParentGroupId() {
		return (EAttribute)productStoreGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreGroup_ProductStoreGroupName() {
		return (EAttribute)productStoreGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreGroup_ProductStoreGroupTypeId() {
		return (EAttribute)productStoreGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductStoreGroupMember() {
		return productStoreGroupMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreGroupMember_ProductStoreId() {
		return (EAttribute)productStoreGroupMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreGroupMember_ProductStoreGroupId() {
		return (EAttribute)productStoreGroupMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreGroupMember_FromDate() {
		return (EAttribute)productStoreGroupMemberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreGroupMember_SequenceNum() {
		return (EAttribute)productStoreGroupMemberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreGroupMember_ThruDate() {
		return (EAttribute)productStoreGroupMemberEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductStoreGroupRole() {
		return productStoreGroupRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreGroupRole_ProductStoreGroupId() {
		return (EAttribute)productStoreGroupRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreGroupRole_PartyId() {
		return (EAttribute)productStoreGroupRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreGroupRole_RoleTypeId() {
		return (EAttribute)productStoreGroupRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductStoreGroupRollup() {
		return productStoreGroupRollupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreGroupRollup_ProductStoreGroupId() {
		return (EAttribute)productStoreGroupRollupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreGroupRollup_ParentGroupId() {
		return (EAttribute)productStoreGroupRollupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreGroupRollup_FromDate() {
		return (EAttribute)productStoreGroupRollupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreGroupRollup_SequenceNum() {
		return (EAttribute)productStoreGroupRollupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreGroupRollup_ThruDate() {
		return (EAttribute)productStoreGroupRollupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductStoreGroupType() {
		return productStoreGroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreGroupType_ProductStoreGroupTypeId() {
		return (EAttribute)productStoreGroupTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreGroupType_Description() {
		return (EAttribute)productStoreGroupTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductStoreKeywordOvrd() {
		return productStoreKeywordOvrdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreKeywordOvrd_ProductStoreId() {
		return (EAttribute)productStoreKeywordOvrdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreKeywordOvrd_Keyword() {
		return (EAttribute)productStoreKeywordOvrdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreKeywordOvrd_FromDate() {
		return (EAttribute)productStoreKeywordOvrdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreKeywordOvrd_Target() {
		return (EAttribute)productStoreKeywordOvrdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreKeywordOvrd_TargetTypeEnumId() {
		return (EAttribute)productStoreKeywordOvrdEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreKeywordOvrd_ThruDate() {
		return (EAttribute)productStoreKeywordOvrdEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductStorePaymentSetting() {
		return productStorePaymentSettingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStorePaymentSetting_ProductStoreId() {
		return (EAttribute)productStorePaymentSettingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStorePaymentSetting_PaymentMethodTypeId() {
		return (EAttribute)productStorePaymentSettingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStorePaymentSetting_PaymentServiceTypeEnumId() {
		return (EAttribute)productStorePaymentSettingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStorePaymentSetting_ApplyToAllProducts() {
		return (EAttribute)productStorePaymentSettingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStorePaymentSetting_PaymentCustomMethodId() {
		return (EAttribute)productStorePaymentSettingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStorePaymentSetting_PaymentGatewayConfigId() {
		return (EAttribute)productStorePaymentSettingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStorePaymentSetting_PaymentPropertiesPath() {
		return (EAttribute)productStorePaymentSettingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStorePaymentSetting_PaymentService() {
		return (EAttribute)productStorePaymentSettingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductStorePromoAppl() {
		return productStorePromoApplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStorePromoAppl_ProductStoreId() {
		return (EAttribute)productStorePromoApplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStorePromoAppl_ProductPromoId() {
		return (EAttribute)productStorePromoApplEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStorePromoAppl_FromDate() {
		return (EAttribute)productStorePromoApplEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStorePromoAppl_ManualOnly() {
		return (EAttribute)productStorePromoApplEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStorePromoAppl_SequenceNum() {
		return (EAttribute)productStorePromoApplEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStorePromoAppl_ThruDate() {
		return (EAttribute)productStorePromoApplEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductStoreRole() {
		return productStoreRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreRole_PartyId() {
		return (EAttribute)productStoreRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreRole_RoleTypeId() {
		return (EAttribute)productStoreRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreRole_ProductStoreId() {
		return (EAttribute)productStoreRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreRole_FromDate() {
		return (EAttribute)productStoreRoleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreRole_SequenceNum() {
		return (EAttribute)productStoreRoleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreRole_ThruDate() {
		return (EAttribute)productStoreRoleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductStoreShipmentMeth() {
		return productStoreShipmentMethEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreShipmentMeth_ProductStoreShipMethId() {
		return (EAttribute)productStoreShipmentMethEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreShipmentMeth_AllowCompanyAddr() {
		return (EAttribute)productStoreShipmentMethEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreShipmentMeth_AllowUspsAddr() {
		return (EAttribute)productStoreShipmentMethEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreShipmentMeth_AllowancePercent() {
		return (EAttribute)productStoreShipmentMethEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreShipmentMeth_CompanyPartyId() {
		return (EAttribute)productStoreShipmentMethEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreShipmentMeth_ConfigProps() {
		return (EAttribute)productStoreShipmentMethEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreShipmentMeth_ExcludeFeatureGroup() {
		return (EAttribute)productStoreShipmentMethEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreShipmentMeth_ExcludeGeoId() {
		return (EAttribute)productStoreShipmentMethEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreShipmentMeth_IncludeFeatureGroup() {
		return (EAttribute)productStoreShipmentMethEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreShipmentMeth_IncludeGeoId() {
		return (EAttribute)productStoreShipmentMethEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreShipmentMeth_IncludeNoChargeItems() {
		return (EAttribute)productStoreShipmentMethEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreShipmentMeth_MaxSize() {
		return (EAttribute)productStoreShipmentMethEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreShipmentMeth_MaxTotal() {
		return (EAttribute)productStoreShipmentMethEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreShipmentMeth_MaxWeight() {
		return (EAttribute)productStoreShipmentMethEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreShipmentMeth_MinSize() {
		return (EAttribute)productStoreShipmentMethEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreShipmentMeth_MinTotal() {
		return (EAttribute)productStoreShipmentMethEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreShipmentMeth_MinWeight() {
		return (EAttribute)productStoreShipmentMethEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreShipmentMeth_MinimumPrice() {
		return (EAttribute)productStoreShipmentMethEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreShipmentMeth_PartyId() {
		return (EAttribute)productStoreShipmentMethEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreShipmentMeth_ProductStoreId() {
		return (EAttribute)productStoreShipmentMethEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreShipmentMeth_RequireCompanyAddr() {
		return (EAttribute)productStoreShipmentMethEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreShipmentMeth_RequireUspsAddr() {
		return (EAttribute)productStoreShipmentMethEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreShipmentMeth_RoleTypeId() {
		return (EAttribute)productStoreShipmentMethEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreShipmentMeth_SequenceNumber() {
		return (EAttribute)productStoreShipmentMethEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreShipmentMeth_ServiceName() {
		return (EAttribute)productStoreShipmentMethEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreShipmentMeth_ShipmentCustomMethodId() {
		return (EAttribute)productStoreShipmentMethEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreShipmentMeth_ShipmentGatewayConfigId() {
		return (EAttribute)productStoreShipmentMethEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreShipmentMeth_ShipmentMethodTypeId() {
		return (EAttribute)productStoreShipmentMethEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductStoreSurveyAppl() {
		return productStoreSurveyApplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreSurveyAppl_ProductStoreSurveyId() {
		return (EAttribute)productStoreSurveyApplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreSurveyAppl_FromDate() {
		return (EAttribute)productStoreSurveyApplEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreSurveyAppl_GroupName() {
		return (EAttribute)productStoreSurveyApplEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreSurveyAppl_ProductCategoryId() {
		return (EAttribute)productStoreSurveyApplEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreSurveyAppl_ProductId() {
		return (EAttribute)productStoreSurveyApplEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreSurveyAppl_ProductStoreId() {
		return (EAttribute)productStoreSurveyApplEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreSurveyAppl_ResultTemplate() {
		return (EAttribute)productStoreSurveyApplEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreSurveyAppl_SequenceNum() {
		return (EAttribute)productStoreSurveyApplEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreSurveyAppl_SurveyApplTypeId() {
		return (EAttribute)productStoreSurveyApplEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreSurveyAppl_SurveyId() {
		return (EAttribute)productStoreSurveyApplEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreSurveyAppl_SurveyTemplate() {
		return (EAttribute)productStoreSurveyApplEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreSurveyAppl_ThruDate() {
		return (EAttribute)productStoreSurveyApplEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductStoreVendorPayment() {
		return productStoreVendorPaymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreVendorPayment_ProductStoreId() {
		return (EAttribute)productStoreVendorPaymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreVendorPayment_VendorPartyId() {
		return (EAttribute)productStoreVendorPaymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreVendorPayment_PaymentMethodTypeId() {
		return (EAttribute)productStoreVendorPaymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreVendorPayment_CreditCardEnumId() {
		return (EAttribute)productStoreVendorPaymentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductStoreVendorShipment() {
		return productStoreVendorShipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreVendorShipment_ProductStoreId() {
		return (EAttribute)productStoreVendorShipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreVendorShipment_VendorPartyId() {
		return (EAttribute)productStoreVendorShipmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreVendorShipment_ShipmentMethodTypeId() {
		return (EAttribute)productStoreVendorShipmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductStoreVendorShipment_CarrierPartyId() {
		return (EAttribute)productStoreVendorShipmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StoreFactory getStoreFactory() {
		return (StoreFactory)getEFactoryInstance();
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
		productStoreEClass = createEClass(PRODUCT_STORE);
		createEAttribute(productStoreEClass, PRODUCT_STORE__PRODUCT_STORE_ID);
		createEAttribute(productStoreEClass, PRODUCT_STORE__ADD_TO_CART_REMOVE_INCOMPAT);
		createEAttribute(productStoreEClass, PRODUCT_STORE__ADD_TO_CART_REPLACE_UPSELL);
		createEAttribute(productStoreEClass, PRODUCT_STORE__ALLOW_COMMENT);
		createEAttribute(productStoreEClass, PRODUCT_STORE__ALLOW_PASSWORD);
		createEAttribute(productStoreEClass, PRODUCT_STORE__AUTH_DECLINED_MESSAGE);
		createEAttribute(productStoreEClass, PRODUCT_STORE__AUTH_ERROR_MESSAGE);
		createEAttribute(productStoreEClass, PRODUCT_STORE__AUTH_FRAUD_MESSAGE);
		createEAttribute(productStoreEClass, PRODUCT_STORE__AUTO_APPROVE_INVOICE);
		createEAttribute(productStoreEClass, PRODUCT_STORE__AUTO_APPROVE_ORDER);
		createEAttribute(productStoreEClass, PRODUCT_STORE__AUTO_APPROVE_REVIEWS);
		createEAttribute(productStoreEClass, PRODUCT_STORE__AUTO_INVOICE_DIGITAL_ITEMS);
		createEAttribute(productStoreEClass, PRODUCT_STORE__AUTO_ORDER_CC_TRY_EXP);
		createEAttribute(productStoreEClass, PRODUCT_STORE__AUTO_ORDER_CC_TRY_LATER_MAX);
		createEAttribute(productStoreEClass, PRODUCT_STORE__AUTO_ORDER_CC_TRY_LATER_NSF);
		createEAttribute(productStoreEClass, PRODUCT_STORE__AUTO_ORDER_CC_TRY_OTHER_CARDS);
		createEAttribute(productStoreEClass, PRODUCT_STORE__AUTO_SAVE_CART);
		createEAttribute(productStoreEClass, PRODUCT_STORE__BALANCE_RES_ON_ORDER_CREATION);
		createEAttribute(productStoreEClass, PRODUCT_STORE__CHECK_GC_BALANCE);
		createEAttribute(productStoreEClass, PRODUCT_STORE__CHECK_INVENTORY);
		createEAttribute(productStoreEClass, PRODUCT_STORE__COMPANY_NAME);
		createEAttribute(productStoreEClass, PRODUCT_STORE__DAYS_TO_CANCEL_NON_PAY);
		createEAttribute(productStoreEClass, PRODUCT_STORE__DEFAULT_CURRENCY_UOM_ID);
		createEAttribute(productStoreEClass, PRODUCT_STORE__DEFAULT_LOCALE_STRING);
		createEAttribute(productStoreEClass, PRODUCT_STORE__DEFAULT_PASSWORD);
		createEAttribute(productStoreEClass, PRODUCT_STORE__DEFAULT_SALES_CHANNEL_ENUM_ID);
		createEAttribute(productStoreEClass, PRODUCT_STORE__DEFAULT_TIME_ZONE_STRING);
		createEAttribute(productStoreEClass, PRODUCT_STORE__DIG_PROD_UPLOAD_CATEGORY_ID);
		createEAttribute(productStoreEClass, PRODUCT_STORE__DIGITAL_ITEM_APPROVED_STATUS);
		createEAttribute(productStoreEClass, PRODUCT_STORE__ENABLE_AUTO_SUGGESTION_LIST);
		createEAttribute(productStoreEClass, PRODUCT_STORE__ENABLE_DIG_PROD_UPLOAD);
		createEAttribute(productStoreEClass, PRODUCT_STORE__EXPLODE_ORDER_ITEMS);
		createEAttribute(productStoreEClass, PRODUCT_STORE__HEADER_APPROVED_STATUS);
		createEAttribute(productStoreEClass, PRODUCT_STORE__HEADER_CANCEL_STATUS);
		createEAttribute(productStoreEClass, PRODUCT_STORE__HEADER_DECLINED_STATUS);
		createEAttribute(productStoreEClass, PRODUCT_STORE__INVENTORY_FACILITY_ID);
		createEAttribute(productStoreEClass, PRODUCT_STORE__IS_DEMO_STORE);
		createEAttribute(productStoreEClass, PRODUCT_STORE__IS_IMMEDIATELY_FULFILLED);
		createEAttribute(productStoreEClass, PRODUCT_STORE__ITEM_APPROVED_STATUS);
		createEAttribute(productStoreEClass, PRODUCT_STORE__ITEM_CANCEL_STATUS);
		createEAttribute(productStoreEClass, PRODUCT_STORE__ITEM_DECLINED_STATUS);
		createEAttribute(productStoreEClass, PRODUCT_STORE__MANAGED_BY_LOT);
		createEAttribute(productStoreEClass, PRODUCT_STORE__MANUAL_AUTH_IS_CAPTURE);
		createEAttribute(productStoreEClass, PRODUCT_STORE__OLD_HEADER_LOGO);
		createEAttribute(productStoreEClass, PRODUCT_STORE__OLD_HEADER_MIDDLE_BACKGROUND);
		createEAttribute(productStoreEClass, PRODUCT_STORE__OLD_HEADER_RIGHT_BACKGROUND);
		createEAttribute(productStoreEClass, PRODUCT_STORE__OLD_STYLE_SHEET);
		createEAttribute(productStoreEClass, PRODUCT_STORE__ONE_INVENTORY_FACILITY);
		createEAttribute(productStoreEClass, PRODUCT_STORE__ORDER_DECIMAL_QUANTITY);
		createEAttribute(productStoreEClass, PRODUCT_STORE__ORDER_NUMBER_PREFIX);
		createEAttribute(productStoreEClass, PRODUCT_STORE__PAY_TO_PARTY_ID);
		createEAttribute(productStoreEClass, PRODUCT_STORE__PRIMARY_STORE_GROUP_ID);
		createEAttribute(productStoreEClass, PRODUCT_STORE__PROD_SEARCH_EXCLUDE_VARIANTS);
		createEAttribute(productStoreEClass, PRODUCT_STORE__PRORATE_SHIPPING);
		createEAttribute(productStoreEClass, PRODUCT_STORE__PRORATE_TAXES);
		createEAttribute(productStoreEClass, PRODUCT_STORE__REQ_RETURN_INVENTORY_RECEIVE);
		createEAttribute(productStoreEClass, PRODUCT_STORE__REQ_SHIP_ADDR_FOR_DIG_ITEMS);
		createEAttribute(productStoreEClass, PRODUCT_STORE__REQUIRE_CUSTOMER_ROLE);
		createEAttribute(productStoreEClass, PRODUCT_STORE__REQUIRE_INVENTORY);
		createEAttribute(productStoreEClass, PRODUCT_STORE__REQUIREMENT_METHOD_ENUM_ID);
		createEAttribute(productStoreEClass, PRODUCT_STORE__RESERVE_INVENTORY);
		createEAttribute(productStoreEClass, PRODUCT_STORE__RESERVE_ORDER_ENUM_ID);
		createEAttribute(productStoreEClass, PRODUCT_STORE__RETRY_FAILED_AUTHS);
		createEAttribute(productStoreEClass, PRODUCT_STORE__SELECT_PAYMENT_TYPE_PER_ITEM);
		createEAttribute(productStoreEClass, PRODUCT_STORE__SET_OWNER_UPON_ISSUANCE);
		createEAttribute(productStoreEClass, PRODUCT_STORE__SHIP_IF_CAPTURE_FAILS);
		createEAttribute(productStoreEClass, PRODUCT_STORE__SHOW_CHECKOUT_GIFT_OPTIONS);
		createEAttribute(productStoreEClass, PRODUCT_STORE__SHOW_OUT_OF_STOCK_PRODUCTS);
		createEAttribute(productStoreEClass, PRODUCT_STORE__SHOW_PRICES_WITH_VAT_TAX);
		createEAttribute(productStoreEClass, PRODUCT_STORE__SHOW_TAX_IS_EXEMPT);
		createEAttribute(productStoreEClass, PRODUCT_STORE__SPLIT_PAY_PREF_PER_SHP_GRP);
		createEAttribute(productStoreEClass, PRODUCT_STORE__STORE_CREDIT_ACCOUNT_ENUM_ID);
		createEAttribute(productStoreEClass, PRODUCT_STORE__STORE_CREDIT_VALID_DAYS);
		createEAttribute(productStoreEClass, PRODUCT_STORE__STORE_NAME);
		createEAttribute(productStoreEClass, PRODUCT_STORE__SUBTITLE);
		createEAttribute(productStoreEClass, PRODUCT_STORE__TITLE);
		createEAttribute(productStoreEClass, PRODUCT_STORE__USE_PRIMARY_EMAIL_USERNAME);
		createEAttribute(productStoreEClass, PRODUCT_STORE__VAT_TAX_AUTH_GEO_ID);
		createEAttribute(productStoreEClass, PRODUCT_STORE__VAT_TAX_AUTH_PARTY_ID);
		createEAttribute(productStoreEClass, PRODUCT_STORE__VIEW_CART_ON_ADD);
		createEAttribute(productStoreEClass, PRODUCT_STORE__VISUAL_THEME_ID);
		createEAttribute(productStoreEClass, PRODUCT_STORE__OAUTH2_GIT_HUBS);
		createEAttribute(productStoreEClass, PRODUCT_STORE__OAUTH2_GOOGLES);
		createEAttribute(productStoreEClass, PRODUCT_STORE__OAUTH2_LINKED_INS);
		createEAttribute(productStoreEClass, PRODUCT_STORE__PRODUCT_STORE_EMAIL_SETTINGS);
		createEAttribute(productStoreEClass, PRODUCT_STORE__PRODUCT_STORE_FIN_ACT_SETTINGS);

		productStoreCatalogEClass = createEClass(PRODUCT_STORE_CATALOG);
		createEAttribute(productStoreCatalogEClass, PRODUCT_STORE_CATALOG__PRODUCT_STORE_ID);
		createEAttribute(productStoreCatalogEClass, PRODUCT_STORE_CATALOG__PROD_CATALOG_ID);
		createEAttribute(productStoreCatalogEClass, PRODUCT_STORE_CATALOG__FROM_DATE);
		createEAttribute(productStoreCatalogEClass, PRODUCT_STORE_CATALOG__SEQUENCE_NUM);
		createEAttribute(productStoreCatalogEClass, PRODUCT_STORE_CATALOG__THRU_DATE);

		productStoreEmailSettingEClass = createEClass(PRODUCT_STORE_EMAIL_SETTING);
		createEAttribute(productStoreEmailSettingEClass, PRODUCT_STORE_EMAIL_SETTING__PRODUCT_STORE_ID);
		createEAttribute(productStoreEmailSettingEClass, PRODUCT_STORE_EMAIL_SETTING__EMAIL_TYPE);
		createEAttribute(productStoreEmailSettingEClass, PRODUCT_STORE_EMAIL_SETTING__BCC_ADDRESS);
		createEAttribute(productStoreEmailSettingEClass, PRODUCT_STORE_EMAIL_SETTING__BODY_SCREEN_LOCATION);
		createEAttribute(productStoreEmailSettingEClass, PRODUCT_STORE_EMAIL_SETTING__CC_ADDRESS);
		createEAttribute(productStoreEmailSettingEClass, PRODUCT_STORE_EMAIL_SETTING__CONTENT_TYPE);
		createEAttribute(productStoreEmailSettingEClass, PRODUCT_STORE_EMAIL_SETTING__FROM_ADDRESS);
		createEAttribute(productStoreEmailSettingEClass, PRODUCT_STORE_EMAIL_SETTING__SUBJECT);
		createEAttribute(productStoreEmailSettingEClass, PRODUCT_STORE_EMAIL_SETTING__XSLFO_ATTACH_SCREEN_LOCATION);

		productStoreFacilityEClass = createEClass(PRODUCT_STORE_FACILITY);
		createEAttribute(productStoreFacilityEClass, PRODUCT_STORE_FACILITY__PRODUCT_STORE_ID);
		createEAttribute(productStoreFacilityEClass, PRODUCT_STORE_FACILITY__FACILITY_ID);
		createEAttribute(productStoreFacilityEClass, PRODUCT_STORE_FACILITY__FROM_DATE);
		createEAttribute(productStoreFacilityEClass, PRODUCT_STORE_FACILITY__SEQUENCE_NUM);
		createEAttribute(productStoreFacilityEClass, PRODUCT_STORE_FACILITY__THRU_DATE);

		productStoreFinActSettingEClass = createEClass(PRODUCT_STORE_FIN_ACT_SETTING);
		createEAttribute(productStoreFinActSettingEClass, PRODUCT_STORE_FIN_ACT_SETTING__PRODUCT_STORE_ID);
		createEAttribute(productStoreFinActSettingEClass, PRODUCT_STORE_FIN_ACT_SETTING__FIN_ACCOUNT_TYPE_ID);
		createEAttribute(productStoreFinActSettingEClass, PRODUCT_STORE_FIN_ACT_SETTING__ACCOUNT_CODE_LENGTH);
		createEAttribute(productStoreFinActSettingEClass, PRODUCT_STORE_FIN_ACT_SETTING__ACCOUNT_VALID_DAYS);
		createEAttribute(productStoreFinActSettingEClass, PRODUCT_STORE_FIN_ACT_SETTING__ALLOW_AUTH_TO_NEGATIVE);
		createEAttribute(productStoreFinActSettingEClass, PRODUCT_STORE_FIN_ACT_SETTING__AUTH_VALID_DAYS);
		createEAttribute(productStoreFinActSettingEClass, PRODUCT_STORE_FIN_ACT_SETTING__MIN_BALANCE);
		createEAttribute(productStoreFinActSettingEClass, PRODUCT_STORE_FIN_ACT_SETTING__PIN_CODE_LENGTH);
		createEAttribute(productStoreFinActSettingEClass, PRODUCT_STORE_FIN_ACT_SETTING__PURCH_SURVEY_COPY_ME);
		createEAttribute(productStoreFinActSettingEClass, PRODUCT_STORE_FIN_ACT_SETTING__PURCH_SURVEY_SEND_TO);
		createEAttribute(productStoreFinActSettingEClass, PRODUCT_STORE_FIN_ACT_SETTING__PURCHASE_SURVEY_ID);
		createEAttribute(productStoreFinActSettingEClass, PRODUCT_STORE_FIN_ACT_SETTING__REPLENISH_METHOD_ENUM_ID);
		createEAttribute(productStoreFinActSettingEClass, PRODUCT_STORE_FIN_ACT_SETTING__REPLENISH_THRESHOLD);
		createEAttribute(productStoreFinActSettingEClass, PRODUCT_STORE_FIN_ACT_SETTING__REQUIRE_PIN_CODE);
		createEAttribute(productStoreFinActSettingEClass, PRODUCT_STORE_FIN_ACT_SETTING__VALIDATE_GC_FIN_ACCT);

		productStoreGroupEClass = createEClass(PRODUCT_STORE_GROUP);
		createEAttribute(productStoreGroupEClass, PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_ID);
		createEAttribute(productStoreGroupEClass, PRODUCT_STORE_GROUP__DESCRIPTION);
		createEAttribute(productStoreGroupEClass, PRODUCT_STORE_GROUP__PRIMARY_PARENT_GROUP_ID);
		createEAttribute(productStoreGroupEClass, PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_NAME);
		createEAttribute(productStoreGroupEClass, PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_TYPE_ID);

		productStoreGroupMemberEClass = createEClass(PRODUCT_STORE_GROUP_MEMBER);
		createEAttribute(productStoreGroupMemberEClass, PRODUCT_STORE_GROUP_MEMBER__PRODUCT_STORE_ID);
		createEAttribute(productStoreGroupMemberEClass, PRODUCT_STORE_GROUP_MEMBER__PRODUCT_STORE_GROUP_ID);
		createEAttribute(productStoreGroupMemberEClass, PRODUCT_STORE_GROUP_MEMBER__FROM_DATE);
		createEAttribute(productStoreGroupMemberEClass, PRODUCT_STORE_GROUP_MEMBER__SEQUENCE_NUM);
		createEAttribute(productStoreGroupMemberEClass, PRODUCT_STORE_GROUP_MEMBER__THRU_DATE);

		productStoreGroupRoleEClass = createEClass(PRODUCT_STORE_GROUP_ROLE);
		createEAttribute(productStoreGroupRoleEClass, PRODUCT_STORE_GROUP_ROLE__PRODUCT_STORE_GROUP_ID);
		createEAttribute(productStoreGroupRoleEClass, PRODUCT_STORE_GROUP_ROLE__PARTY_ID);
		createEAttribute(productStoreGroupRoleEClass, PRODUCT_STORE_GROUP_ROLE__ROLE_TYPE_ID);

		productStoreGroupRollupEClass = createEClass(PRODUCT_STORE_GROUP_ROLLUP);
		createEAttribute(productStoreGroupRollupEClass, PRODUCT_STORE_GROUP_ROLLUP__PRODUCT_STORE_GROUP_ID);
		createEAttribute(productStoreGroupRollupEClass, PRODUCT_STORE_GROUP_ROLLUP__PARENT_GROUP_ID);
		createEAttribute(productStoreGroupRollupEClass, PRODUCT_STORE_GROUP_ROLLUP__FROM_DATE);
		createEAttribute(productStoreGroupRollupEClass, PRODUCT_STORE_GROUP_ROLLUP__SEQUENCE_NUM);
		createEAttribute(productStoreGroupRollupEClass, PRODUCT_STORE_GROUP_ROLLUP__THRU_DATE);

		productStoreGroupTypeEClass = createEClass(PRODUCT_STORE_GROUP_TYPE);
		createEAttribute(productStoreGroupTypeEClass, PRODUCT_STORE_GROUP_TYPE__PRODUCT_STORE_GROUP_TYPE_ID);
		createEAttribute(productStoreGroupTypeEClass, PRODUCT_STORE_GROUP_TYPE__DESCRIPTION);

		productStoreKeywordOvrdEClass = createEClass(PRODUCT_STORE_KEYWORD_OVRD);
		createEAttribute(productStoreKeywordOvrdEClass, PRODUCT_STORE_KEYWORD_OVRD__PRODUCT_STORE_ID);
		createEAttribute(productStoreKeywordOvrdEClass, PRODUCT_STORE_KEYWORD_OVRD__KEYWORD);
		createEAttribute(productStoreKeywordOvrdEClass, PRODUCT_STORE_KEYWORD_OVRD__FROM_DATE);
		createEAttribute(productStoreKeywordOvrdEClass, PRODUCT_STORE_KEYWORD_OVRD__TARGET);
		createEAttribute(productStoreKeywordOvrdEClass, PRODUCT_STORE_KEYWORD_OVRD__TARGET_TYPE_ENUM_ID);
		createEAttribute(productStoreKeywordOvrdEClass, PRODUCT_STORE_KEYWORD_OVRD__THRU_DATE);

		productStorePaymentSettingEClass = createEClass(PRODUCT_STORE_PAYMENT_SETTING);
		createEAttribute(productStorePaymentSettingEClass, PRODUCT_STORE_PAYMENT_SETTING__PRODUCT_STORE_ID);
		createEAttribute(productStorePaymentSettingEClass, PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_METHOD_TYPE_ID);
		createEAttribute(productStorePaymentSettingEClass, PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_SERVICE_TYPE_ENUM_ID);
		createEAttribute(productStorePaymentSettingEClass, PRODUCT_STORE_PAYMENT_SETTING__APPLY_TO_ALL_PRODUCTS);
		createEAttribute(productStorePaymentSettingEClass, PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_CUSTOM_METHOD_ID);
		createEAttribute(productStorePaymentSettingEClass, PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_GATEWAY_CONFIG_ID);
		createEAttribute(productStorePaymentSettingEClass, PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_PROPERTIES_PATH);
		createEAttribute(productStorePaymentSettingEClass, PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_SERVICE);

		productStorePromoApplEClass = createEClass(PRODUCT_STORE_PROMO_APPL);
		createEAttribute(productStorePromoApplEClass, PRODUCT_STORE_PROMO_APPL__PRODUCT_STORE_ID);
		createEAttribute(productStorePromoApplEClass, PRODUCT_STORE_PROMO_APPL__PRODUCT_PROMO_ID);
		createEAttribute(productStorePromoApplEClass, PRODUCT_STORE_PROMO_APPL__FROM_DATE);
		createEAttribute(productStorePromoApplEClass, PRODUCT_STORE_PROMO_APPL__MANUAL_ONLY);
		createEAttribute(productStorePromoApplEClass, PRODUCT_STORE_PROMO_APPL__SEQUENCE_NUM);
		createEAttribute(productStorePromoApplEClass, PRODUCT_STORE_PROMO_APPL__THRU_DATE);

		productStoreRoleEClass = createEClass(PRODUCT_STORE_ROLE);
		createEAttribute(productStoreRoleEClass, PRODUCT_STORE_ROLE__PARTY_ID);
		createEAttribute(productStoreRoleEClass, PRODUCT_STORE_ROLE__ROLE_TYPE_ID);
		createEAttribute(productStoreRoleEClass, PRODUCT_STORE_ROLE__PRODUCT_STORE_ID);
		createEAttribute(productStoreRoleEClass, PRODUCT_STORE_ROLE__FROM_DATE);
		createEAttribute(productStoreRoleEClass, PRODUCT_STORE_ROLE__SEQUENCE_NUM);
		createEAttribute(productStoreRoleEClass, PRODUCT_STORE_ROLE__THRU_DATE);

		productStoreShipmentMethEClass = createEClass(PRODUCT_STORE_SHIPMENT_METH);
		createEAttribute(productStoreShipmentMethEClass, PRODUCT_STORE_SHIPMENT_METH__PRODUCT_STORE_SHIP_METH_ID);
		createEAttribute(productStoreShipmentMethEClass, PRODUCT_STORE_SHIPMENT_METH__ALLOW_COMPANY_ADDR);
		createEAttribute(productStoreShipmentMethEClass, PRODUCT_STORE_SHIPMENT_METH__ALLOW_USPS_ADDR);
		createEAttribute(productStoreShipmentMethEClass, PRODUCT_STORE_SHIPMENT_METH__ALLOWANCE_PERCENT);
		createEAttribute(productStoreShipmentMethEClass, PRODUCT_STORE_SHIPMENT_METH__COMPANY_PARTY_ID);
		createEAttribute(productStoreShipmentMethEClass, PRODUCT_STORE_SHIPMENT_METH__CONFIG_PROPS);
		createEAttribute(productStoreShipmentMethEClass, PRODUCT_STORE_SHIPMENT_METH__EXCLUDE_FEATURE_GROUP);
		createEAttribute(productStoreShipmentMethEClass, PRODUCT_STORE_SHIPMENT_METH__EXCLUDE_GEO_ID);
		createEAttribute(productStoreShipmentMethEClass, PRODUCT_STORE_SHIPMENT_METH__INCLUDE_FEATURE_GROUP);
		createEAttribute(productStoreShipmentMethEClass, PRODUCT_STORE_SHIPMENT_METH__INCLUDE_GEO_ID);
		createEAttribute(productStoreShipmentMethEClass, PRODUCT_STORE_SHIPMENT_METH__INCLUDE_NO_CHARGE_ITEMS);
		createEAttribute(productStoreShipmentMethEClass, PRODUCT_STORE_SHIPMENT_METH__MAX_SIZE);
		createEAttribute(productStoreShipmentMethEClass, PRODUCT_STORE_SHIPMENT_METH__MAX_TOTAL);
		createEAttribute(productStoreShipmentMethEClass, PRODUCT_STORE_SHIPMENT_METH__MAX_WEIGHT);
		createEAttribute(productStoreShipmentMethEClass, PRODUCT_STORE_SHIPMENT_METH__MIN_SIZE);
		createEAttribute(productStoreShipmentMethEClass, PRODUCT_STORE_SHIPMENT_METH__MIN_TOTAL);
		createEAttribute(productStoreShipmentMethEClass, PRODUCT_STORE_SHIPMENT_METH__MIN_WEIGHT);
		createEAttribute(productStoreShipmentMethEClass, PRODUCT_STORE_SHIPMENT_METH__MINIMUM_PRICE);
		createEAttribute(productStoreShipmentMethEClass, PRODUCT_STORE_SHIPMENT_METH__PARTY_ID);
		createEAttribute(productStoreShipmentMethEClass, PRODUCT_STORE_SHIPMENT_METH__PRODUCT_STORE_ID);
		createEAttribute(productStoreShipmentMethEClass, PRODUCT_STORE_SHIPMENT_METH__REQUIRE_COMPANY_ADDR);
		createEAttribute(productStoreShipmentMethEClass, PRODUCT_STORE_SHIPMENT_METH__REQUIRE_USPS_ADDR);
		createEAttribute(productStoreShipmentMethEClass, PRODUCT_STORE_SHIPMENT_METH__ROLE_TYPE_ID);
		createEAttribute(productStoreShipmentMethEClass, PRODUCT_STORE_SHIPMENT_METH__SEQUENCE_NUMBER);
		createEAttribute(productStoreShipmentMethEClass, PRODUCT_STORE_SHIPMENT_METH__SERVICE_NAME);
		createEAttribute(productStoreShipmentMethEClass, PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_CUSTOM_METHOD_ID);
		createEAttribute(productStoreShipmentMethEClass, PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_GATEWAY_CONFIG_ID);
		createEAttribute(productStoreShipmentMethEClass, PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_METHOD_TYPE_ID);

		productStoreSurveyApplEClass = createEClass(PRODUCT_STORE_SURVEY_APPL);
		createEAttribute(productStoreSurveyApplEClass, PRODUCT_STORE_SURVEY_APPL__PRODUCT_STORE_SURVEY_ID);
		createEAttribute(productStoreSurveyApplEClass, PRODUCT_STORE_SURVEY_APPL__FROM_DATE);
		createEAttribute(productStoreSurveyApplEClass, PRODUCT_STORE_SURVEY_APPL__GROUP_NAME);
		createEAttribute(productStoreSurveyApplEClass, PRODUCT_STORE_SURVEY_APPL__PRODUCT_CATEGORY_ID);
		createEAttribute(productStoreSurveyApplEClass, PRODUCT_STORE_SURVEY_APPL__PRODUCT_ID);
		createEAttribute(productStoreSurveyApplEClass, PRODUCT_STORE_SURVEY_APPL__PRODUCT_STORE_ID);
		createEAttribute(productStoreSurveyApplEClass, PRODUCT_STORE_SURVEY_APPL__RESULT_TEMPLATE);
		createEAttribute(productStoreSurveyApplEClass, PRODUCT_STORE_SURVEY_APPL__SEQUENCE_NUM);
		createEAttribute(productStoreSurveyApplEClass, PRODUCT_STORE_SURVEY_APPL__SURVEY_APPL_TYPE_ID);
		createEAttribute(productStoreSurveyApplEClass, PRODUCT_STORE_SURVEY_APPL__SURVEY_ID);
		createEAttribute(productStoreSurveyApplEClass, PRODUCT_STORE_SURVEY_APPL__SURVEY_TEMPLATE);
		createEAttribute(productStoreSurveyApplEClass, PRODUCT_STORE_SURVEY_APPL__THRU_DATE);

		productStoreVendorPaymentEClass = createEClass(PRODUCT_STORE_VENDOR_PAYMENT);
		createEAttribute(productStoreVendorPaymentEClass, PRODUCT_STORE_VENDOR_PAYMENT__PRODUCT_STORE_ID);
		createEAttribute(productStoreVendorPaymentEClass, PRODUCT_STORE_VENDOR_PAYMENT__VENDOR_PARTY_ID);
		createEAttribute(productStoreVendorPaymentEClass, PRODUCT_STORE_VENDOR_PAYMENT__PAYMENT_METHOD_TYPE_ID);
		createEAttribute(productStoreVendorPaymentEClass, PRODUCT_STORE_VENDOR_PAYMENT__CREDIT_CARD_ENUM_ID);

		productStoreVendorShipmentEClass = createEClass(PRODUCT_STORE_VENDOR_SHIPMENT);
		createEAttribute(productStoreVendorShipmentEClass, PRODUCT_STORE_VENDOR_SHIPMENT__PRODUCT_STORE_ID);
		createEAttribute(productStoreVendorShipmentEClass, PRODUCT_STORE_VENDOR_SHIPMENT__VENDOR_PARTY_ID);
		createEAttribute(productStoreVendorShipmentEClass, PRODUCT_STORE_VENDOR_SHIPMENT__SHIPMENT_METHOD_TYPE_ID);
		createEAttribute(productStoreVendorShipmentEClass, PRODUCT_STORE_VENDOR_SHIPMENT__CARRIER_PARTY_ID);
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
		productStoreEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		productStoreCatalogEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		productStoreEmailSettingEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		productStoreFacilityEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		productStoreFinActSettingEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		EGenericType g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		EGenericType g2 = createEGenericType(this.getProductStoreGroupType());
		g1.getETypeArguments().add(g2);
		productStoreGroupEClass.getEGenericSuperTypes().add(g1);
		productStoreGroupMemberEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		productStoreGroupRoleEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		productStoreGroupRollupEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getProductStoreGroup());
		g1.getETypeArguments().add(g2);
		productStoreGroupTypeEClass.getEGenericSuperTypes().add(g1);
		productStoreKeywordOvrdEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		productStorePaymentSettingEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		productStorePromoApplEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		productStoreRoleEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		productStoreShipmentMethEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		productStoreSurveyApplEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		productStoreVendorPaymentEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		productStoreVendorShipmentEClass.getESuperTypes().add(theBizPackage.getBizEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(productStoreEClass, ProductStore.class, "ProductStore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductStore_ProductStoreId(), ecorePackage.getEString(), "productStoreId", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_AddToCartRemoveIncompat(), ecorePackage.getEBoolean(), "addToCartRemoveIncompat", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_AddToCartReplaceUpsell(), ecorePackage.getEBoolean(), "addToCartReplaceUpsell", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_AllowComment(), ecorePackage.getEBoolean(), "allowComment", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_AllowPassword(), ecorePackage.getEBoolean(), "allowPassword", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_AuthDeclinedMessage(), ecorePackage.getEString(), "authDeclinedMessage", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_AuthErrorMessage(), ecorePackage.getEString(), "authErrorMessage", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_AuthFraudMessage(), ecorePackage.getEString(), "authFraudMessage", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_AutoApproveInvoice(), ecorePackage.getEBoolean(), "autoApproveInvoice", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_AutoApproveOrder(), ecorePackage.getEBoolean(), "autoApproveOrder", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_AutoApproveReviews(), ecorePackage.getEBoolean(), "autoApproveReviews", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_AutoInvoiceDigitalItems(), ecorePackage.getEBoolean(), "autoInvoiceDigitalItems", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_AutoOrderCcTryExp(), ecorePackage.getEBoolean(), "autoOrderCcTryExp", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_AutoOrderCcTryLaterMax(), ecorePackage.getELong(), "autoOrderCcTryLaterMax", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_AutoOrderCcTryLaterNsf(), ecorePackage.getEBoolean(), "autoOrderCcTryLaterNsf", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_AutoOrderCcTryOtherCards(), ecorePackage.getEBoolean(), "autoOrderCcTryOtherCards", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_AutoSaveCart(), ecorePackage.getEBoolean(), "autoSaveCart", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_BalanceResOnOrderCreation(), ecorePackage.getEBoolean(), "balanceResOnOrderCreation", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_CheckGcBalance(), ecorePackage.getEBoolean(), "checkGcBalance", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_CheckInventory(), ecorePackage.getEBoolean(), "checkInventory", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_CompanyName(), ecorePackage.getEString(), "companyName", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_DaysToCancelNonPay(), ecorePackage.getELong(), "daysToCancelNonPay", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_DefaultCurrencyUomId(), ecorePackage.getEString(), "defaultCurrencyUomId", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_DefaultLocaleString(), ecorePackage.getEString(), "defaultLocaleString", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_DefaultPassword(), ecorePackage.getEString(), "defaultPassword", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_DefaultSalesChannelEnumId(), ecorePackage.getEString(), "defaultSalesChannelEnumId", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_DefaultTimeZoneString(), ecorePackage.getEString(), "defaultTimeZoneString", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_DigProdUploadCategoryId(), ecorePackage.getEString(), "digProdUploadCategoryId", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_DigitalItemApprovedStatus(), ecorePackage.getEString(), "digitalItemApprovedStatus", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_EnableAutoSuggestionList(), ecorePackage.getEBoolean(), "enableAutoSuggestionList", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_EnableDigProdUpload(), ecorePackage.getEBoolean(), "enableDigProdUpload", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_ExplodeOrderItems(), ecorePackage.getEBoolean(), "explodeOrderItems", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_HeaderApprovedStatus(), ecorePackage.getEString(), "headerApprovedStatus", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_HeaderCancelStatus(), ecorePackage.getEString(), "headerCancelStatus", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_HeaderDeclinedStatus(), ecorePackage.getEString(), "headerDeclinedStatus", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_InventoryFacilityId(), ecorePackage.getEString(), "inventoryFacilityId", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_IsDemoStore(), ecorePackage.getEBoolean(), "isDemoStore", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_IsImmediatelyFulfilled(), ecorePackage.getEBoolean(), "isImmediatelyFulfilled", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_ItemApprovedStatus(), ecorePackage.getEString(), "itemApprovedStatus", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_ItemCancelStatus(), ecorePackage.getEString(), "itemCancelStatus", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_ItemDeclinedStatus(), ecorePackage.getEString(), "itemDeclinedStatus", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_ManagedByLot(), ecorePackage.getEBoolean(), "managedByLot", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_ManualAuthIsCapture(), ecorePackage.getEBoolean(), "manualAuthIsCapture", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_OldHeaderLogo(), ecorePackage.getEString(), "oldHeaderLogo", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_OldHeaderMiddleBackground(), ecorePackage.getEString(), "oldHeaderMiddleBackground", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_OldHeaderRightBackground(), ecorePackage.getEString(), "oldHeaderRightBackground", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_OldStyleSheet(), ecorePackage.getEString(), "oldStyleSheet", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_OneInventoryFacility(), ecorePackage.getEBoolean(), "oneInventoryFacility", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_OrderDecimalQuantity(), ecorePackage.getEBoolean(), "orderDecimalQuantity", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_OrderNumberPrefix(), ecorePackage.getEString(), "orderNumberPrefix", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_PayToPartyId(), ecorePackage.getEString(), "payToPartyId", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_PrimaryStoreGroupId(), ecorePackage.getEString(), "primaryStoreGroupId", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_ProdSearchExcludeVariants(), ecorePackage.getEBoolean(), "prodSearchExcludeVariants", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_ProrateShipping(), ecorePackage.getEBoolean(), "prorateShipping", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_ProrateTaxes(), ecorePackage.getEBoolean(), "prorateTaxes", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_ReqReturnInventoryReceive(), ecorePackage.getEBoolean(), "reqReturnInventoryReceive", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_ReqShipAddrForDigItems(), ecorePackage.getEBoolean(), "reqShipAddrForDigItems", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_RequireCustomerRole(), ecorePackage.getEBoolean(), "requireCustomerRole", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_RequireInventory(), ecorePackage.getEBoolean(), "requireInventory", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_RequirementMethodEnumId(), ecorePackage.getEString(), "requirementMethodEnumId", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_ReserveInventory(), ecorePackage.getEBoolean(), "reserveInventory", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_ReserveOrderEnumId(), ecorePackage.getEString(), "reserveOrderEnumId", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_RetryFailedAuths(), ecorePackage.getEBoolean(), "retryFailedAuths", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_SelectPaymentTypePerItem(), ecorePackage.getEBoolean(), "selectPaymentTypePerItem", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_SetOwnerUponIssuance(), ecorePackage.getEBoolean(), "setOwnerUponIssuance", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_ShipIfCaptureFails(), ecorePackage.getEBoolean(), "shipIfCaptureFails", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_ShowCheckoutGiftOptions(), ecorePackage.getEBoolean(), "showCheckoutGiftOptions", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_ShowOutOfStockProducts(), ecorePackage.getEBoolean(), "showOutOfStockProducts", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_ShowPricesWithVatTax(), ecorePackage.getEBoolean(), "showPricesWithVatTax", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_ShowTaxIsExempt(), ecorePackage.getEBoolean(), "showTaxIsExempt", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_SplitPayPrefPerShpGrp(), ecorePackage.getEBoolean(), "splitPayPrefPerShpGrp", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_StoreCreditAccountEnumId(), ecorePackage.getEString(), "storeCreditAccountEnumId", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_StoreCreditValidDays(), ecorePackage.getELong(), "storeCreditValidDays", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_StoreName(), ecorePackage.getEString(), "storeName", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_Subtitle(), ecorePackage.getEString(), "subtitle", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_Title(), ecorePackage.getEString(), "title", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_UsePrimaryEmailUsername(), ecorePackage.getEBoolean(), "usePrimaryEmailUsername", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_VatTaxAuthGeoId(), ecorePackage.getEString(), "vatTaxAuthGeoId", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_VatTaxAuthPartyId(), ecorePackage.getEString(), "vatTaxAuthPartyId", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_ViewCartOnAdd(), ecorePackage.getEBoolean(), "viewCartOnAdd", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_VisualThemeId(), ecorePackage.getEString(), "visualThemeId", null, 0, 1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_OAuth2GitHubs(), ecorePackage.getEString(), "oAuth2GitHubs", null, 0, -1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_OAuth2Googles(), ecorePackage.getEString(), "oAuth2Googles", null, 0, -1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_OAuth2LinkedIns(), ecorePackage.getEString(), "oAuth2LinkedIns", null, 0, -1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_ProductStoreEmailSettings(), ecorePackage.getEString(), "productStoreEmailSettings", null, 0, -1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStore_ProductStoreFinActSettings(), ecorePackage.getEString(), "productStoreFinActSettings", null, 0, -1, ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(productStoreEClass, ecorePackage.getEString(), "custRequests", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(productStoreEClass, ecorePackage.getEString(), "gitHubUsers", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(productStoreEClass, ecorePackage.getEString(), "googleUsers", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(productStoreEClass, ecorePackage.getEString(), "linkedInUsers", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(productStoreEClass, ecorePackage.getEString(), "orderHeaders", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(productStoreEClass, ecorePackage.getEString(), "partyProfileDefaults", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(productStoreEClass, ecorePackage.getEString(), "productReviews", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(productStoreEClass, ecorePackage.getEString(), "productStoreSurveyAppls", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(productStoreEClass, ecorePackage.getEString(), "quotes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(productStoreEClass, ecorePackage.getEString(), "segmentGroups", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(productStoreEClass, ecorePackage.getEString(), "shoppingLists", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(productStoreEClass, ecorePackage.getEString(), "taxAuthorityRateProducts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(productStoreEClass, ecorePackage.getEString(), "webSites", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(productStoreCatalogEClass, ProductStoreCatalog.class, "ProductStoreCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductStoreCatalog_ProductStoreId(), ecorePackage.getEString(), "productStoreId", null, 0, 1, ProductStoreCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreCatalog_ProdCatalogId(), ecorePackage.getEString(), "prodCatalogId", null, 0, 1, ProductStoreCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreCatalog_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, ProductStoreCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreCatalog_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, ProductStoreCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreCatalog_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, ProductStoreCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productStoreEmailSettingEClass, ProductStoreEmailSetting.class, "ProductStoreEmailSetting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductStoreEmailSetting_ProductStoreId(), ecorePackage.getEString(), "productStoreId", null, 0, 1, ProductStoreEmailSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreEmailSetting_EmailType(), ecorePackage.getEString(), "emailType", null, 0, 1, ProductStoreEmailSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreEmailSetting_BccAddress(), ecorePackage.getEString(), "bccAddress", null, 0, 1, ProductStoreEmailSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreEmailSetting_BodyScreenLocation(), ecorePackage.getEString(), "bodyScreenLocation", null, 0, 1, ProductStoreEmailSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreEmailSetting_CcAddress(), ecorePackage.getEString(), "ccAddress", null, 0, 1, ProductStoreEmailSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreEmailSetting_ContentType(), ecorePackage.getEString(), "contentType", null, 0, 1, ProductStoreEmailSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreEmailSetting_FromAddress(), ecorePackage.getEString(), "fromAddress", null, 0, 1, ProductStoreEmailSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreEmailSetting_Subject(), ecorePackage.getEString(), "subject", null, 0, 1, ProductStoreEmailSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreEmailSetting_XslfoAttachScreenLocation(), ecorePackage.getEString(), "xslfoAttachScreenLocation", null, 0, 1, ProductStoreEmailSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productStoreFacilityEClass, ProductStoreFacility.class, "ProductStoreFacility", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductStoreFacility_ProductStoreId(), ecorePackage.getEString(), "productStoreId", null, 0, 1, ProductStoreFacility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreFacility_FacilityId(), ecorePackage.getEString(), "facilityId", null, 0, 1, ProductStoreFacility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreFacility_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, ProductStoreFacility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreFacility_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, ProductStoreFacility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreFacility_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, ProductStoreFacility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productStoreFinActSettingEClass, ProductStoreFinActSetting.class, "ProductStoreFinActSetting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductStoreFinActSetting_ProductStoreId(), ecorePackage.getEString(), "productStoreId", null, 0, 1, ProductStoreFinActSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreFinActSetting_FinAccountTypeId(), ecorePackage.getEString(), "finAccountTypeId", null, 0, 1, ProductStoreFinActSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreFinActSetting_AccountCodeLength(), ecorePackage.getELong(), "accountCodeLength", null, 0, 1, ProductStoreFinActSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreFinActSetting_AccountValidDays(), ecorePackage.getELong(), "accountValidDays", null, 0, 1, ProductStoreFinActSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreFinActSetting_AllowAuthToNegative(), ecorePackage.getEBoolean(), "allowAuthToNegative", null, 0, 1, ProductStoreFinActSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreFinActSetting_AuthValidDays(), ecorePackage.getELong(), "authValidDays", null, 0, 1, ProductStoreFinActSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreFinActSetting_MinBalance(), ecorePackage.getEBigDecimal(), "minBalance", null, 0, 1, ProductStoreFinActSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreFinActSetting_PinCodeLength(), ecorePackage.getELong(), "pinCodeLength", null, 0, 1, ProductStoreFinActSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreFinActSetting_PurchSurveyCopyMe(), ecorePackage.getEString(), "purchSurveyCopyMe", null, 0, 1, ProductStoreFinActSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreFinActSetting_PurchSurveySendTo(), ecorePackage.getEString(), "purchSurveySendTo", null, 0, 1, ProductStoreFinActSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreFinActSetting_PurchaseSurveyId(), ecorePackage.getEString(), "purchaseSurveyId", null, 0, 1, ProductStoreFinActSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreFinActSetting_ReplenishMethodEnumId(), ecorePackage.getEString(), "replenishMethodEnumId", null, 0, 1, ProductStoreFinActSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreFinActSetting_ReplenishThreshold(), ecorePackage.getEBigDecimal(), "replenishThreshold", null, 0, 1, ProductStoreFinActSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreFinActSetting_RequirePinCode(), ecorePackage.getEBoolean(), "requirePinCode", null, 0, 1, ProductStoreFinActSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreFinActSetting_ValidateGCFinAcct(), ecorePackage.getEBoolean(), "validateGCFinAcct", null, 0, 1, ProductStoreFinActSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productStoreGroupEClass, ProductStoreGroup.class, "ProductStoreGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductStoreGroup_ProductStoreGroupId(), ecorePackage.getEString(), "productStoreGroupId", null, 0, 1, ProductStoreGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreGroup_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProductStoreGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreGroup_PrimaryParentGroupId(), ecorePackage.getEString(), "primaryParentGroupId", null, 0, 1, ProductStoreGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreGroup_ProductStoreGroupName(), ecorePackage.getEString(), "productStoreGroupName", null, 0, 1, ProductStoreGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreGroup_ProductStoreGroupTypeId(), ecorePackage.getEString(), "productStoreGroupTypeId", null, 0, 1, ProductStoreGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(productStoreGroupEClass, ecorePackage.getEString(), "primaryProductStores", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(productStoreGroupMemberEClass, ProductStoreGroupMember.class, "ProductStoreGroupMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductStoreGroupMember_ProductStoreId(), ecorePackage.getEString(), "productStoreId", null, 0, 1, ProductStoreGroupMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreGroupMember_ProductStoreGroupId(), ecorePackage.getEString(), "productStoreGroupId", null, 0, 1, ProductStoreGroupMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreGroupMember_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, ProductStoreGroupMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreGroupMember_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, ProductStoreGroupMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreGroupMember_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, ProductStoreGroupMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productStoreGroupRoleEClass, ProductStoreGroupRole.class, "ProductStoreGroupRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductStoreGroupRole_ProductStoreGroupId(), ecorePackage.getEString(), "productStoreGroupId", null, 0, 1, ProductStoreGroupRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreGroupRole_PartyId(), ecorePackage.getEString(), "partyId", null, 0, 1, ProductStoreGroupRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreGroupRole_RoleTypeId(), ecorePackage.getEString(), "roleTypeId", null, 0, 1, ProductStoreGroupRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productStoreGroupRollupEClass, ProductStoreGroupRollup.class, "ProductStoreGroupRollup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductStoreGroupRollup_ProductStoreGroupId(), ecorePackage.getEString(), "productStoreGroupId", null, 0, 1, ProductStoreGroupRollup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreGroupRollup_ParentGroupId(), ecorePackage.getEString(), "parentGroupId", null, 0, 1, ProductStoreGroupRollup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreGroupRollup_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, ProductStoreGroupRollup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreGroupRollup_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, ProductStoreGroupRollup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreGroupRollup_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, ProductStoreGroupRollup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productStoreGroupTypeEClass, ProductStoreGroupType.class, "ProductStoreGroupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductStoreGroupType_ProductStoreGroupTypeId(), ecorePackage.getEString(), "productStoreGroupTypeId", null, 0, 1, ProductStoreGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreGroupType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProductStoreGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(productStoreGroupTypeEClass, ecorePackage.getEString(), "productStoreGroups", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(productStoreKeywordOvrdEClass, ProductStoreKeywordOvrd.class, "ProductStoreKeywordOvrd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductStoreKeywordOvrd_ProductStoreId(), ecorePackage.getEString(), "productStoreId", null, 0, 1, ProductStoreKeywordOvrd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreKeywordOvrd_Keyword(), ecorePackage.getEString(), "keyword", null, 0, 1, ProductStoreKeywordOvrd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreKeywordOvrd_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, ProductStoreKeywordOvrd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreKeywordOvrd_Target(), ecorePackage.getEString(), "target", null, 0, 1, ProductStoreKeywordOvrd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreKeywordOvrd_TargetTypeEnumId(), ecorePackage.getEString(), "targetTypeEnumId", null, 0, 1, ProductStoreKeywordOvrd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreKeywordOvrd_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, ProductStoreKeywordOvrd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productStorePaymentSettingEClass, ProductStorePaymentSetting.class, "ProductStorePaymentSetting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductStorePaymentSetting_ProductStoreId(), ecorePackage.getEString(), "productStoreId", null, 0, 1, ProductStorePaymentSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStorePaymentSetting_PaymentMethodTypeId(), ecorePackage.getEString(), "paymentMethodTypeId", null, 0, 1, ProductStorePaymentSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStorePaymentSetting_PaymentServiceTypeEnumId(), ecorePackage.getEString(), "paymentServiceTypeEnumId", null, 0, 1, ProductStorePaymentSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStorePaymentSetting_ApplyToAllProducts(), ecorePackage.getEBoolean(), "applyToAllProducts", null, 0, 1, ProductStorePaymentSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStorePaymentSetting_PaymentCustomMethodId(), ecorePackage.getEString(), "paymentCustomMethodId", null, 0, 1, ProductStorePaymentSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStorePaymentSetting_PaymentGatewayConfigId(), ecorePackage.getEString(), "paymentGatewayConfigId", null, 0, 1, ProductStorePaymentSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStorePaymentSetting_PaymentPropertiesPath(), ecorePackage.getEString(), "paymentPropertiesPath", null, 0, 1, ProductStorePaymentSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStorePaymentSetting_PaymentService(), ecorePackage.getEString(), "paymentService", null, 0, 1, ProductStorePaymentSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productStorePromoApplEClass, ProductStorePromoAppl.class, "ProductStorePromoAppl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductStorePromoAppl_ProductStoreId(), ecorePackage.getEString(), "productStoreId", null, 0, 1, ProductStorePromoAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStorePromoAppl_ProductPromoId(), ecorePackage.getEString(), "productPromoId", null, 0, 1, ProductStorePromoAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStorePromoAppl_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, ProductStorePromoAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStorePromoAppl_ManualOnly(), ecorePackage.getEBoolean(), "manualOnly", null, 0, 1, ProductStorePromoAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStorePromoAppl_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, ProductStorePromoAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStorePromoAppl_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, ProductStorePromoAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productStoreRoleEClass, ProductStoreRole.class, "ProductStoreRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductStoreRole_PartyId(), ecorePackage.getEString(), "partyId", null, 0, 1, ProductStoreRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreRole_RoleTypeId(), ecorePackage.getEString(), "roleTypeId", null, 0, 1, ProductStoreRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreRole_ProductStoreId(), ecorePackage.getEString(), "productStoreId", null, 0, 1, ProductStoreRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreRole_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, ProductStoreRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreRole_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, ProductStoreRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreRole_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, ProductStoreRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productStoreShipmentMethEClass, ProductStoreShipmentMeth.class, "ProductStoreShipmentMeth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductStoreShipmentMeth_ProductStoreShipMethId(), ecorePackage.getEString(), "productStoreShipMethId", null, 0, 1, ProductStoreShipmentMeth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreShipmentMeth_AllowCompanyAddr(), ecorePackage.getEBoolean(), "allowCompanyAddr", null, 0, 1, ProductStoreShipmentMeth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreShipmentMeth_AllowUspsAddr(), ecorePackage.getEBoolean(), "allowUspsAddr", null, 0, 1, ProductStoreShipmentMeth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreShipmentMeth_AllowancePercent(), ecorePackage.getEBigDecimal(), "allowancePercent", null, 0, 1, ProductStoreShipmentMeth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreShipmentMeth_CompanyPartyId(), ecorePackage.getEString(), "companyPartyId", null, 0, 1, ProductStoreShipmentMeth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreShipmentMeth_ConfigProps(), ecorePackage.getEString(), "configProps", null, 0, 1, ProductStoreShipmentMeth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreShipmentMeth_ExcludeFeatureGroup(), ecorePackage.getEString(), "excludeFeatureGroup", null, 0, 1, ProductStoreShipmentMeth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreShipmentMeth_ExcludeGeoId(), ecorePackage.getEString(), "excludeGeoId", null, 0, 1, ProductStoreShipmentMeth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreShipmentMeth_IncludeFeatureGroup(), ecorePackage.getEString(), "includeFeatureGroup", null, 0, 1, ProductStoreShipmentMeth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreShipmentMeth_IncludeGeoId(), ecorePackage.getEString(), "includeGeoId", null, 0, 1, ProductStoreShipmentMeth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreShipmentMeth_IncludeNoChargeItems(), ecorePackage.getEBoolean(), "includeNoChargeItems", null, 0, 1, ProductStoreShipmentMeth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreShipmentMeth_MaxSize(), ecorePackage.getEBigDecimal(), "maxSize", null, 0, 1, ProductStoreShipmentMeth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreShipmentMeth_MaxTotal(), ecorePackage.getEBigDecimal(), "maxTotal", null, 0, 1, ProductStoreShipmentMeth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreShipmentMeth_MaxWeight(), ecorePackage.getEBigDecimal(), "maxWeight", null, 0, 1, ProductStoreShipmentMeth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreShipmentMeth_MinSize(), ecorePackage.getEBigDecimal(), "minSize", null, 0, 1, ProductStoreShipmentMeth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreShipmentMeth_MinTotal(), ecorePackage.getEBigDecimal(), "minTotal", null, 0, 1, ProductStoreShipmentMeth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreShipmentMeth_MinWeight(), ecorePackage.getEBigDecimal(), "minWeight", null, 0, 1, ProductStoreShipmentMeth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreShipmentMeth_MinimumPrice(), ecorePackage.getEBigDecimal(), "minimumPrice", null, 0, 1, ProductStoreShipmentMeth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreShipmentMeth_PartyId(), ecorePackage.getEString(), "partyId", null, 0, 1, ProductStoreShipmentMeth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreShipmentMeth_ProductStoreId(), ecorePackage.getEString(), "productStoreId", null, 0, 1, ProductStoreShipmentMeth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreShipmentMeth_RequireCompanyAddr(), ecorePackage.getEBoolean(), "requireCompanyAddr", null, 0, 1, ProductStoreShipmentMeth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreShipmentMeth_RequireUspsAddr(), ecorePackage.getEBoolean(), "requireUspsAddr", null, 0, 1, ProductStoreShipmentMeth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreShipmentMeth_RoleTypeId(), ecorePackage.getEString(), "roleTypeId", null, 0, 1, ProductStoreShipmentMeth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreShipmentMeth_SequenceNumber(), ecorePackage.getELong(), "sequenceNumber", null, 0, 1, ProductStoreShipmentMeth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreShipmentMeth_ServiceName(), ecorePackage.getEString(), "serviceName", null, 0, 1, ProductStoreShipmentMeth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreShipmentMeth_ShipmentCustomMethodId(), ecorePackage.getEString(), "shipmentCustomMethodId", null, 0, 1, ProductStoreShipmentMeth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreShipmentMeth_ShipmentGatewayConfigId(), ecorePackage.getEString(), "shipmentGatewayConfigId", null, 0, 1, ProductStoreShipmentMeth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreShipmentMeth_ShipmentMethodTypeId(), ecorePackage.getEString(), "shipmentMethodTypeId", null, 0, 1, ProductStoreShipmentMeth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(productStoreShipmentMethEClass, ecorePackage.getEString(), "shipmentCostEstimates", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(productStoreSurveyApplEClass, ProductStoreSurveyAppl.class, "ProductStoreSurveyAppl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductStoreSurveyAppl_ProductStoreSurveyId(), ecorePackage.getEString(), "productStoreSurveyId", null, 0, 1, ProductStoreSurveyAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreSurveyAppl_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, ProductStoreSurveyAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreSurveyAppl_GroupName(), ecorePackage.getEString(), "groupName", null, 0, 1, ProductStoreSurveyAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreSurveyAppl_ProductCategoryId(), ecorePackage.getEString(), "productCategoryId", null, 0, 1, ProductStoreSurveyAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreSurveyAppl_ProductId(), ecorePackage.getEString(), "productId", null, 0, 1, ProductStoreSurveyAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreSurveyAppl_ProductStoreId(), ecorePackage.getEString(), "productStoreId", null, 0, 1, ProductStoreSurveyAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreSurveyAppl_ResultTemplate(), ecorePackage.getEString(), "resultTemplate", null, 0, 1, ProductStoreSurveyAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreSurveyAppl_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, ProductStoreSurveyAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreSurveyAppl_SurveyApplTypeId(), ecorePackage.getEString(), "surveyApplTypeId", null, 0, 1, ProductStoreSurveyAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreSurveyAppl_SurveyId(), ecorePackage.getEString(), "surveyId", null, 0, 1, ProductStoreSurveyAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreSurveyAppl_SurveyTemplate(), ecorePackage.getEString(), "surveyTemplate", null, 0, 1, ProductStoreSurveyAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreSurveyAppl_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, ProductStoreSurveyAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productStoreVendorPaymentEClass, ProductStoreVendorPayment.class, "ProductStoreVendorPayment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductStoreVendorPayment_ProductStoreId(), ecorePackage.getEString(), "productStoreId", null, 0, 1, ProductStoreVendorPayment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreVendorPayment_VendorPartyId(), ecorePackage.getEString(), "vendorPartyId", null, 0, 1, ProductStoreVendorPayment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreVendorPayment_PaymentMethodTypeId(), ecorePackage.getEString(), "paymentMethodTypeId", null, 0, 1, ProductStoreVendorPayment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreVendorPayment_CreditCardEnumId(), ecorePackage.getEString(), "creditCardEnumId", null, 0, 1, ProductStoreVendorPayment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productStoreVendorShipmentEClass, ProductStoreVendorShipment.class, "ProductStoreVendorShipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductStoreVendorShipment_ProductStoreId(), ecorePackage.getEString(), "productStoreId", null, 0, 1, ProductStoreVendorShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreVendorShipment_VendorPartyId(), ecorePackage.getEString(), "vendorPartyId", null, 0, 1, ProductStoreVendorShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreVendorShipment_ShipmentMethodTypeId(), ecorePackage.getEString(), "shipmentMethodTypeId", null, 0, 1, ProductStoreVendorShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductStoreVendorShipment_CarrierPartyId(), ecorePackage.getEString(), "carrierPartyId", null, 0, 1, ProductStoreVendorShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (productStoreEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (productStoreEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (productStoreEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (productStoreEClass.getEOperations().get(3),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (productStoreEClass.getEOperations().get(4),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (productStoreEClass.getEOperations().get(5),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (productStoreEClass.getEOperations().get(6),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (productStoreEClass.getEOperations().get(7),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (productStoreEClass.getEOperations().get(8),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (productStoreEClass.getEOperations().get(9),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (productStoreEClass.getEOperations().get(10),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (productStoreEClass.getEOperations().get(11),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (productStoreEClass.getEOperations().get(12),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProductStore_ProductStoreId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStore_OAuth2GitHubs(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProductStore_OAuth2Googles(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProductStore_OAuth2LinkedIns(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProductStore_ProductStoreEmailSettings(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProductStore_ProductStoreFinActSettings(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProductStoreCatalog_ProductStoreId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreCatalog_ProdCatalogId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreCatalog_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreEmailSetting_ProductStoreId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreEmailSetting_EmailType(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreFacility_ProductStoreId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreFacility_FacilityId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreFacility_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreFinActSetting_ProductStoreId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreFinActSetting_FinAccountTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (productStoreGroupEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProductStoreGroup_ProductStoreGroupId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreGroupMember_ProductStoreId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreGroupMember_ProductStoreGroupId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreGroupMember_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreGroupRole_ProductStoreGroupId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreGroupRole_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreGroupRole_RoleTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreGroupRollup_ProductStoreGroupId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreGroupRollup_ParentGroupId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreGroupRollup_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (productStoreGroupTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProductStoreGroupType_ProductStoreGroupTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreKeywordOvrd_ProductStoreId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreKeywordOvrd_Keyword(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreKeywordOvrd_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStorePaymentSetting_ProductStoreId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStorePaymentSetting_PaymentMethodTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStorePaymentSetting_PaymentServiceTypeEnumId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStorePromoAppl_ProductStoreId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStorePromoAppl_ProductPromoId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStorePromoAppl_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreRole_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreRole_RoleTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreRole_ProductStoreId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreRole_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (productStoreShipmentMethEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProductStoreShipmentMeth_ProductStoreShipMethId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreSurveyAppl_ProductStoreSurveyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreVendorPayment_ProductStoreId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreVendorPayment_VendorPartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreVendorPayment_PaymentMethodTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreVendorPayment_CreditCardEnumId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreVendorShipment_ProductStoreId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreVendorShipment_VendorPartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreVendorShipment_ShipmentMethodTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductStoreVendorShipment_CarrierPartyId(),
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
		  (productStoreEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "CustRequest",
			   "route", "productStoreId"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (productStoreEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "GitHubUser",
			   "route", "productStoreId"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (productStoreEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "frame", "GoogleUser",
			   "route", "productStoreId"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (productStoreEClass.getEOperations().get(3),
		   source,
		   new String[] {
			   "frame", "LinkedInUser",
			   "route", "productStoreId"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (productStoreEClass.getEOperations().get(4),
		   source,
		   new String[] {
			   "frame", "OrderHeader",
			   "route", "productStoreId"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (productStoreEClass.getEOperations().get(5),
		   source,
		   new String[] {
			   "frame", "PartyProfileDefault",
			   "route", "productStoreId"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (productStoreEClass.getEOperations().get(6),
		   source,
		   new String[] {
			   "frame", "ProductReview",
			   "route", "productStoreId"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (productStoreEClass.getEOperations().get(7),
		   source,
		   new String[] {
			   "frame", "ProductStoreSurveyAppl",
			   "route", "productStoreId"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (productStoreEClass.getEOperations().get(8),
		   source,
		   new String[] {
			   "frame", "Quote",
			   "route", "productStoreId"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (productStoreEClass.getEOperations().get(9),
		   source,
		   new String[] {
			   "frame", "SegmentGroup",
			   "route", "productStoreId"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (productStoreEClass.getEOperations().get(10),
		   source,
		   new String[] {
			   "frame", "ShoppingList",
			   "route", "productStoreId"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (productStoreEClass.getEOperations().get(11),
		   source,
		   new String[] {
			   "frame", "TaxAuthorityRateProduct",
			   "route", "productStoreId"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (productStoreEClass.getEOperations().get(12),
		   source,
		   new String[] {
			   "frame", "WebSite",
			   "route", "productStoreId"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStore_DefaultCurrencyUomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStore_DefaultSalesChannelEnumId(),
		   source,
		   new String[] {
			   "frame", "Enumeration"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStore_DigitalItemApprovedStatus(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStore_HeaderApprovedStatus(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStore_HeaderCancelStatus(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStore_HeaderDeclinedStatus(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStore_InventoryFacilityId(),
		   source,
		   new String[] {
			   "frame", "Facility"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStore_ItemApprovedStatus(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStore_ItemCancelStatus(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStore_ItemDeclinedStatus(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStore_PayToPartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStore_PrimaryStoreGroupId(),
		   source,
		   new String[] {
			   "frame", "ProductStoreGroup"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStore_RequirementMethodEnumId(),
		   source,
		   new String[] {
			   "frame", "Enumeration"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStore_ReserveOrderEnumId(),
		   source,
		   new String[] {
			   "frame", "Enumeration"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStore_StoreCreditAccountEnumId(),
		   source,
		   new String[] {
			   "frame", "Enumeration"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStore_OAuth2GitHubs(),
		   source,
		   new String[] {
			   "frame", "OAuth2GitHub"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStore_OAuth2Googles(),
		   source,
		   new String[] {
			   "frame", "OAuth2Google"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStore_OAuth2LinkedIns(),
		   source,
		   new String[] {
			   "frame", "OAuth2LinkedIn"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStore_ProductStoreEmailSettings(),
		   source,
		   new String[] {
			   "frame", "ProductStoreEmailSetting"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStore_ProductStoreFinActSettings(),
		   source,
		   new String[] {
			   "frame", "ProductStoreFinActSetting"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreCatalog_ProductStoreId(),
		   source,
		   new String[] {
			   "frame", "ProductStore"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreCatalog_ProdCatalogId(),
		   source,
		   new String[] {
			   "frame", "ProdCatalog"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreEmailSetting_ProductStoreId(),
		   source,
		   new String[] {
			   "frame", "ProductStore"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreEmailSetting_EmailType(),
		   source,
		   new String[] {
			   "frame", "Enumeration"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreFacility_ProductStoreId(),
		   source,
		   new String[] {
			   "frame", "ProductStore"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreFacility_FacilityId(),
		   source,
		   new String[] {
			   "frame", "Facility"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreFinActSetting_ProductStoreId(),
		   source,
		   new String[] {
			   "frame", "ProductStore"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreFinActSetting_FinAccountTypeId(),
		   source,
		   new String[] {
			   "frame", "FinAccountType"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreFinActSetting_PurchaseSurveyId(),
		   source,
		   new String[] {
			   "frame", "Survey"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreFinActSetting_ReplenishMethodEnumId(),
		   source,
		   new String[] {
			   "frame", "Enumeration"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (productStoreGroupEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "ProductStore",
			   "route", "primaryStoreGroupId"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreGroup_PrimaryParentGroupId(),
		   source,
		   new String[] {
			   "frame", "ProductStoreGroup"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreGroup_ProductStoreGroupTypeId(),
		   source,
		   new String[] {
			   "frame", "ProductStoreGroupType"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreGroupMember_ProductStoreId(),
		   source,
		   new String[] {
			   "frame", "ProductStore"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreGroupMember_ProductStoreGroupId(),
		   source,
		   new String[] {
			   "frame", "ProductStoreGroup"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreGroupRole_ProductStoreGroupId(),
		   source,
		   new String[] {
			   "frame", "ProductStoreGroup"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreGroupRole_PartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreGroupRole_RoleTypeId(),
		   source,
		   new String[] {
			   "frame", "RoleType"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreGroupRollup_ProductStoreGroupId(),
		   source,
		   new String[] {
			   "frame", "ProductStoreGroup"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreGroupRollup_ParentGroupId(),
		   source,
		   new String[] {
			   "frame", "ProductStoreGroup"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (productStoreGroupTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "ProductStoreGroup",
			   "route", "productStoreGroupTypeId"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreKeywordOvrd_ProductStoreId(),
		   source,
		   new String[] {
			   "frame", "ProductStore"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreKeywordOvrd_TargetTypeEnumId(),
		   source,
		   new String[] {
			   "frame", "Enumeration"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStorePaymentSetting_ProductStoreId(),
		   source,
		   new String[] {
			   "frame", "ProductStore"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStorePaymentSetting_PaymentMethodTypeId(),
		   source,
		   new String[] {
			   "frame", "PaymentMethodType"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStorePaymentSetting_PaymentServiceTypeEnumId(),
		   source,
		   new String[] {
			   "frame", "Enumeration"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStorePaymentSetting_PaymentCustomMethodId(),
		   source,
		   new String[] {
			   "frame", "CustomMethod"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStorePaymentSetting_PaymentGatewayConfigId(),
		   source,
		   new String[] {
			   "frame", "PaymentGatewayConfig"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStorePromoAppl_ProductStoreId(),
		   source,
		   new String[] {
			   "frame", "ProductStore"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStorePromoAppl_ProductPromoId(),
		   source,
		   new String[] {
			   "frame", "ProductPromo"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreRole_PartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreRole_RoleTypeId(),
		   source,
		   new String[] {
			   "frame", "RoleType"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreRole_ProductStoreId(),
		   source,
		   new String[] {
			   "frame", "ProductStore"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (productStoreShipmentMethEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "ShipmentCostEstimate",
			   "route", "productStoreShipMethId"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreShipmentMeth_CompanyPartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreShipmentMeth_ExcludeGeoId(),
		   source,
		   new String[] {
			   "frame", "Geo"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreShipmentMeth_IncludeGeoId(),
		   source,
		   new String[] {
			   "frame", "Geo"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreShipmentMeth_ShipmentCustomMethodId(),
		   source,
		   new String[] {
			   "frame", "CustomMethod"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreShipmentMeth_ShipmentGatewayConfigId(),
		   source,
		   new String[] {
			   "frame", "ShipmentGatewayConfig"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreShipmentMeth_ShipmentMethodTypeId(),
		   source,
		   new String[] {
			   "frame", "ShipmentMethodType"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreSurveyAppl_ProductCategoryId(),
		   source,
		   new String[] {
			   "frame", "ProductCategory"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreSurveyAppl_ProductId(),
		   source,
		   new String[] {
			   "frame", "Product"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreSurveyAppl_ProductStoreId(),
		   source,
		   new String[] {
			   "frame", "ProductStore"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreSurveyAppl_SurveyApplTypeId(),
		   source,
		   new String[] {
			   "frame", "SurveyApplType"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreSurveyAppl_SurveyId(),
		   source,
		   new String[] {
			   "frame", "Survey"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreVendorPayment_ProductStoreId(),
		   source,
		   new String[] {
			   "frame", "ProductStore"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreVendorPayment_VendorPartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreVendorPayment_PaymentMethodTypeId(),
		   source,
		   new String[] {
			   "frame", "PaymentMethodType"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreVendorPayment_CreditCardEnumId(),
		   source,
		   new String[] {
			   "frame", "Enumeration"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreVendorShipment_ProductStoreId(),
		   source,
		   new String[] {
			   "frame", "ProductStore"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreVendorShipment_VendorPartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreVendorShipment_ShipmentMethodTypeId(),
		   source,
		   new String[] {
			   "frame", "ShipmentMethodType"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductStoreVendorShipment_CarrierPartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(org.abchip.mimo.entity.EntityPackage.eNS_URI).appendFragment("//entity/Domain")
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
		  (productStoreGroupEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (productStoreGroupTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
	}

} //StorePackageImpl
