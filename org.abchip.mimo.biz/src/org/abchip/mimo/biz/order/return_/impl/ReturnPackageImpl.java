/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.return_.impl;

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
import org.abchip.mimo.biz.order.return_.CommunicationEventReturn;
import org.abchip.mimo.biz.order.return_.ReturnAdjustment;
import org.abchip.mimo.biz.order.return_.ReturnAdjustmentType;
import org.abchip.mimo.biz.order.return_.ReturnContactMech;
import org.abchip.mimo.biz.order.return_.ReturnFactory;
import org.abchip.mimo.biz.order.return_.ReturnHeader;
import org.abchip.mimo.biz.order.return_.ReturnHeaderType;
import org.abchip.mimo.biz.order.return_.ReturnItem;
import org.abchip.mimo.biz.order.return_.ReturnItemBilling;
import org.abchip.mimo.biz.order.return_.ReturnItemResponse;
import org.abchip.mimo.biz.order.return_.ReturnItemShipment;
import org.abchip.mimo.biz.order.return_.ReturnItemType;
import org.abchip.mimo.biz.order.return_.ReturnItemTypeMap;
import org.abchip.mimo.biz.order.return_.ReturnPackage;
import org.abchip.mimo.biz.order.return_.ReturnReason;
import org.abchip.mimo.biz.order.return_.ReturnStatus;
import org.abchip.mimo.biz.order.return_.ReturnType;
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
public class ReturnPackageImpl extends EPackageImpl implements ReturnPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationEventReturnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnAdjustmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnAdjustmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnContactMechEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnHeaderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnItemBillingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnItemResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnItemShipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnItemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnItemTypeMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnReasonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnTypeEClass = null;

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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReturnPackageImpl() {
		super(eNS_URI, ReturnFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ReturnPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReturnPackage init() {
		if (isInited) return (ReturnPackage)EPackage.Registry.INSTANCE.getEPackage(ReturnPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredReturnPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ReturnPackageImpl theReturnPackage = registeredReturnPackage instanceof ReturnPackageImpl ? (ReturnPackageImpl)registeredReturnPackage : new ReturnPackageImpl();

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
		theReturnPackage.createPackageContents();
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
		theReturnPackage.initializePackageContents();
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
		theReturnPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReturnPackage.eNS_URI, theReturnPackage);
		return theReturnPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommunicationEventReturn() {
		return communicationEventReturnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicationEventReturn_ReturnId() {
		return (EReference)communicationEventReturnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicationEventReturn_CommunicationEventId() {
		return (EReference)communicationEventReturnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnAdjustment() {
		return returnAdjustmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnAdjustment_ReturnAdjustmentId() {
		return (EAttribute)returnAdjustmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnAdjustment_Amount() {
		return (EAttribute)returnAdjustmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnAdjustment_Comments() {
		return (EAttribute)returnAdjustmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnAdjustment_CorrespondingProductId() {
		return (EAttribute)returnAdjustmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnAdjustment_CreatedByUserLogin() {
		return (EReference)returnAdjustmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnAdjustment_CreatedDate() {
		return (EAttribute)returnAdjustmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnAdjustment_CustomerReferenceId() {
		return (EAttribute)returnAdjustmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnAdjustment_Description() {
		return (EAttribute)returnAdjustmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnAdjustment_ExemptAmount() {
		return (EAttribute)returnAdjustmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnAdjustment_IncludeInShipping() {
		return (EAttribute)returnAdjustmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnAdjustment_IncludeInTax() {
		return (EAttribute)returnAdjustmentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnAdjustment_LastModifiedByUserLogin() {
		return (EAttribute)returnAdjustmentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnAdjustment_LastModifiedDate() {
		return (EAttribute)returnAdjustmentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnAdjustment_OrderAdjustmentId() {
		return (EReference)returnAdjustmentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnAdjustment_OverrideGlAccountId() {
		return (EReference)returnAdjustmentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnAdjustment_PrimaryGeoId() {
		return (EReference)returnAdjustmentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnAdjustment_ProductFeatureId() {
		return (EAttribute)returnAdjustmentEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnAdjustment_ProductPromoActionSeqId() {
		return (EAttribute)returnAdjustmentEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnAdjustment_ProductPromoId() {
		return (EReference)returnAdjustmentEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnAdjustment_ProductPromoRuleId() {
		return (EAttribute)returnAdjustmentEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnAdjustment_ReturnAdjustmentTypeId() {
		return (EReference)returnAdjustmentEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnAdjustment_ReturnId() {
		return (EReference)returnAdjustmentEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnAdjustment_ReturnItemSeqId() {
		return (EAttribute)returnAdjustmentEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnAdjustment_ReturnTypeId() {
		return (EReference)returnAdjustmentEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnAdjustment_SecondaryGeoId() {
		return (EReference)returnAdjustmentEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnAdjustment_ShipGroupSeqId() {
		return (EAttribute)returnAdjustmentEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnAdjustment_SourcePercentage() {
		return (EAttribute)returnAdjustmentEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnAdjustment_SourceReferenceId() {
		return (EAttribute)returnAdjustmentEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnAdjustment_TaxAuthGeoId() {
		return (EAttribute)returnAdjustmentEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnAdjustment_TaxAuthPartyId() {
		return (EAttribute)returnAdjustmentEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnAdjustment_TaxAuthorityRateSeqId() {
		return (EReference)returnAdjustmentEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnAdjustmentType() {
		return returnAdjustmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnAdjustmentType_ReturnAdjustmentTypeId() {
		return (EAttribute)returnAdjustmentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnAdjustmentType_Description() {
		return (EAttribute)returnAdjustmentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnAdjustmentType_HasTable() {
		return (EAttribute)returnAdjustmentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnAdjustmentType_ParentTypeId() {
		return (EReference)returnAdjustmentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnContactMech() {
		return returnContactMechEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnContactMech_ReturnId() {
		return (EReference)returnContactMechEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnContactMech_ContactMechPurposeTypeId() {
		return (EReference)returnContactMechEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnContactMech_ContactMechId() {
		return (EReference)returnContactMechEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnHeader() {
		return returnHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnHeader_ReturnId() {
		return (EAttribute)returnHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnHeader_BillingAccountId() {
		return (EReference)returnHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnHeader_CommunicationEventReturns() {
		return (EReference)returnHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnHeader_CreatedBy() {
		return (EReference)returnHeaderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnHeader_CurrencyUomId() {
		return (EReference)returnHeaderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnHeader_DestinationFacilityId() {
		return (EReference)returnHeaderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnHeader_EntryDate() {
		return (EAttribute)returnHeaderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnHeader_FinAccountId() {
		return (EReference)returnHeaderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnHeader_FromPartyId() {
		return (EReference)returnHeaderEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnHeader_NeedsInventoryReceive() {
		return (EAttribute)returnHeaderEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnHeader_OriginContactMechId() {
		return (EReference)returnHeaderEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnHeader_PaymentMethodId() {
		return (EReference)returnHeaderEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnHeader_ReturnHeaderTypeId() {
		return (EReference)returnHeaderEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnHeader_ReturnItems() {
		return (EReference)returnHeaderEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnHeader_StatusId() {
		return (EReference)returnHeaderEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnHeader_SupplierRmaId() {
		return (EAttribute)returnHeaderEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnHeader_ToPartyId() {
		return (EReference)returnHeaderEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnHeaderType() {
		return returnHeaderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnHeaderType_ReturnHeaderTypeId() {
		return (EAttribute)returnHeaderTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnHeaderType_Description() {
		return (EAttribute)returnHeaderTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnHeaderType_ParentTypeId() {
		return (EReference)returnHeaderTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnItem() {
		return returnItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnItem_ReturnId() {
		return (EReference)returnItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnItem_ReturnItemSeqId() {
		return (EAttribute)returnItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnItem_Description() {
		return (EAttribute)returnItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnItem_ExpectedItemStatus() {
		return (EReference)returnItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnItem_OrderId() {
		return (EReference)returnItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnItem_OrderItemSeqId() {
		return (EAttribute)returnItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnItem_ProductId() {
		return (EReference)returnItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnItem_ReceivedQuantity() {
		return (EAttribute)returnItemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnItem_ReturnItemResponseId() {
		return (EReference)returnItemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnItem_ReturnItemTypeId() {
		return (EReference)returnItemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnItem_ReturnPrice() {
		return (EAttribute)returnItemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnItem_ReturnQuantity() {
		return (EAttribute)returnItemEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnItem_ReturnReasonId() {
		return (EReference)returnItemEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnItem_ReturnTypeId() {
		return (EReference)returnItemEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnItem_StatusId() {
		return (EReference)returnItemEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnItemBilling() {
		return returnItemBillingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnItemBilling_ReturnId() {
		return (EReference)returnItemBillingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnItemBilling_ReturnItemSeqId() {
		return (EAttribute)returnItemBillingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnItemBilling_InvoiceId() {
		return (EReference)returnItemBillingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnItemBilling_InvoiceItemSeqId() {
		return (EAttribute)returnItemBillingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnItemBilling_Amount() {
		return (EAttribute)returnItemBillingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnItemBilling_Quantity() {
		return (EAttribute)returnItemBillingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnItemBilling_ShipmentReceiptId() {
		return (EReference)returnItemBillingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnItemResponse() {
		return returnItemResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnItemResponse_ReturnItemResponseId() {
		return (EAttribute)returnItemResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnItemResponse_BillingAccountId() {
		return (EReference)returnItemResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnItemResponse_FinAccountTransId() {
		return (EReference)returnItemResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnItemResponse_OrderPaymentPreferenceId() {
		return (EReference)returnItemResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnItemResponse_PaymentId() {
		return (EReference)returnItemResponseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnItemResponse_ReplacementOrderId() {
		return (EReference)returnItemResponseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnItemResponse_ResponseAmount() {
		return (EAttribute)returnItemResponseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnItemResponse_ResponseDate() {
		return (EAttribute)returnItemResponseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnItemShipment() {
		return returnItemShipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnItemShipment_ReturnId() {
		return (EReference)returnItemShipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnItemShipment_ReturnItemSeqId() {
		return (EAttribute)returnItemShipmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnItemShipment_ShipmentId() {
		return (EReference)returnItemShipmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnItemShipment_ShipmentItemSeqId() {
		return (EAttribute)returnItemShipmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnItemShipment_Quantity() {
		return (EAttribute)returnItemShipmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnItemType() {
		return returnItemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnItemType_ReturnItemTypeId() {
		return (EAttribute)returnItemTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnItemType_Description() {
		return (EAttribute)returnItemTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnItemType_ParentTypeId() {
		return (EReference)returnItemTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnItemTypeMap() {
		return returnItemTypeMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnItemTypeMap_ReturnItemMapKey() {
		return (EAttribute)returnItemTypeMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnItemTypeMap_ReturnHeaderTypeId() {
		return (EReference)returnItemTypeMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnItemTypeMap_ReturnItemTypeId() {
		return (EReference)returnItemTypeMapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnReason() {
		return returnReasonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnReason_ReturnReasonId() {
		return (EAttribute)returnReasonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnReason_Description() {
		return (EAttribute)returnReasonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnReason_SequenceId() {
		return (EAttribute)returnReasonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnStatus() {
		return returnStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnStatus_ReturnStatusId() {
		return (EAttribute)returnStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnStatus_ChangeByUserLoginId() {
		return (EReference)returnStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnStatus_ReturnId() {
		return (EReference)returnStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnStatus_ReturnItemSeqId() {
		return (EAttribute)returnStatusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnStatus_StatusDatetime() {
		return (EAttribute)returnStatusEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnStatus_StatusId() {
		return (EReference)returnStatusEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnType() {
		return returnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnType_ReturnTypeId() {
		return (EAttribute)returnTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnType_Description() {
		return (EAttribute)returnTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnType_SequenceId() {
		return (EAttribute)returnTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnFactory getReturnFactory() {
		return (ReturnFactory)getEFactoryInstance();
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
		communicationEventReturnEClass = createEClass(COMMUNICATION_EVENT_RETURN);
		createEReference(communicationEventReturnEClass, COMMUNICATION_EVENT_RETURN__RETURN_ID);
		createEReference(communicationEventReturnEClass, COMMUNICATION_EVENT_RETURN__COMMUNICATION_EVENT_ID);

		returnAdjustmentEClass = createEClass(RETURN_ADJUSTMENT);
		createEAttribute(returnAdjustmentEClass, RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_ID);
		createEAttribute(returnAdjustmentEClass, RETURN_ADJUSTMENT__AMOUNT);
		createEAttribute(returnAdjustmentEClass, RETURN_ADJUSTMENT__COMMENTS);
		createEAttribute(returnAdjustmentEClass, RETURN_ADJUSTMENT__CORRESPONDING_PRODUCT_ID);
		createEReference(returnAdjustmentEClass, RETURN_ADJUSTMENT__CREATED_BY_USER_LOGIN);
		createEAttribute(returnAdjustmentEClass, RETURN_ADJUSTMENT__CREATED_DATE);
		createEAttribute(returnAdjustmentEClass, RETURN_ADJUSTMENT__CUSTOMER_REFERENCE_ID);
		createEAttribute(returnAdjustmentEClass, RETURN_ADJUSTMENT__DESCRIPTION);
		createEAttribute(returnAdjustmentEClass, RETURN_ADJUSTMENT__EXEMPT_AMOUNT);
		createEAttribute(returnAdjustmentEClass, RETURN_ADJUSTMENT__INCLUDE_IN_SHIPPING);
		createEAttribute(returnAdjustmentEClass, RETURN_ADJUSTMENT__INCLUDE_IN_TAX);
		createEAttribute(returnAdjustmentEClass, RETURN_ADJUSTMENT__LAST_MODIFIED_BY_USER_LOGIN);
		createEAttribute(returnAdjustmentEClass, RETURN_ADJUSTMENT__LAST_MODIFIED_DATE);
		createEReference(returnAdjustmentEClass, RETURN_ADJUSTMENT__ORDER_ADJUSTMENT_ID);
		createEReference(returnAdjustmentEClass, RETURN_ADJUSTMENT__OVERRIDE_GL_ACCOUNT_ID);
		createEReference(returnAdjustmentEClass, RETURN_ADJUSTMENT__PRIMARY_GEO_ID);
		createEAttribute(returnAdjustmentEClass, RETURN_ADJUSTMENT__PRODUCT_FEATURE_ID);
		createEAttribute(returnAdjustmentEClass, RETURN_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID);
		createEReference(returnAdjustmentEClass, RETURN_ADJUSTMENT__PRODUCT_PROMO_ID);
		createEAttribute(returnAdjustmentEClass, RETURN_ADJUSTMENT__PRODUCT_PROMO_RULE_ID);
		createEReference(returnAdjustmentEClass, RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_TYPE_ID);
		createEReference(returnAdjustmentEClass, RETURN_ADJUSTMENT__RETURN_ID);
		createEAttribute(returnAdjustmentEClass, RETURN_ADJUSTMENT__RETURN_ITEM_SEQ_ID);
		createEReference(returnAdjustmentEClass, RETURN_ADJUSTMENT__RETURN_TYPE_ID);
		createEReference(returnAdjustmentEClass, RETURN_ADJUSTMENT__SECONDARY_GEO_ID);
		createEAttribute(returnAdjustmentEClass, RETURN_ADJUSTMENT__SHIP_GROUP_SEQ_ID);
		createEAttribute(returnAdjustmentEClass, RETURN_ADJUSTMENT__SOURCE_PERCENTAGE);
		createEAttribute(returnAdjustmentEClass, RETURN_ADJUSTMENT__SOURCE_REFERENCE_ID);
		createEAttribute(returnAdjustmentEClass, RETURN_ADJUSTMENT__TAX_AUTH_GEO_ID);
		createEAttribute(returnAdjustmentEClass, RETURN_ADJUSTMENT__TAX_AUTH_PARTY_ID);
		createEReference(returnAdjustmentEClass, RETURN_ADJUSTMENT__TAX_AUTHORITY_RATE_SEQ_ID);

		returnAdjustmentTypeEClass = createEClass(RETURN_ADJUSTMENT_TYPE);
		createEAttribute(returnAdjustmentTypeEClass, RETURN_ADJUSTMENT_TYPE__RETURN_ADJUSTMENT_TYPE_ID);
		createEAttribute(returnAdjustmentTypeEClass, RETURN_ADJUSTMENT_TYPE__DESCRIPTION);
		createEAttribute(returnAdjustmentTypeEClass, RETURN_ADJUSTMENT_TYPE__HAS_TABLE);
		createEReference(returnAdjustmentTypeEClass, RETURN_ADJUSTMENT_TYPE__PARENT_TYPE_ID);

		returnContactMechEClass = createEClass(RETURN_CONTACT_MECH);
		createEReference(returnContactMechEClass, RETURN_CONTACT_MECH__RETURN_ID);
		createEReference(returnContactMechEClass, RETURN_CONTACT_MECH__CONTACT_MECH_ID);
		createEReference(returnContactMechEClass, RETURN_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE_ID);

		returnHeaderEClass = createEClass(RETURN_HEADER);
		createEAttribute(returnHeaderEClass, RETURN_HEADER__RETURN_ID);
		createEReference(returnHeaderEClass, RETURN_HEADER__BILLING_ACCOUNT_ID);
		createEReference(returnHeaderEClass, RETURN_HEADER__COMMUNICATION_EVENT_RETURNS);
		createEReference(returnHeaderEClass, RETURN_HEADER__CREATED_BY);
		createEReference(returnHeaderEClass, RETURN_HEADER__CURRENCY_UOM_ID);
		createEReference(returnHeaderEClass, RETURN_HEADER__DESTINATION_FACILITY_ID);
		createEAttribute(returnHeaderEClass, RETURN_HEADER__ENTRY_DATE);
		createEReference(returnHeaderEClass, RETURN_HEADER__FIN_ACCOUNT_ID);
		createEReference(returnHeaderEClass, RETURN_HEADER__FROM_PARTY_ID);
		createEAttribute(returnHeaderEClass, RETURN_HEADER__NEEDS_INVENTORY_RECEIVE);
		createEReference(returnHeaderEClass, RETURN_HEADER__ORIGIN_CONTACT_MECH_ID);
		createEReference(returnHeaderEClass, RETURN_HEADER__PAYMENT_METHOD_ID);
		createEReference(returnHeaderEClass, RETURN_HEADER__RETURN_HEADER_TYPE_ID);
		createEReference(returnHeaderEClass, RETURN_HEADER__RETURN_ITEMS);
		createEReference(returnHeaderEClass, RETURN_HEADER__STATUS_ID);
		createEAttribute(returnHeaderEClass, RETURN_HEADER__SUPPLIER_RMA_ID);
		createEReference(returnHeaderEClass, RETURN_HEADER__TO_PARTY_ID);

		returnHeaderTypeEClass = createEClass(RETURN_HEADER_TYPE);
		createEAttribute(returnHeaderTypeEClass, RETURN_HEADER_TYPE__RETURN_HEADER_TYPE_ID);
		createEAttribute(returnHeaderTypeEClass, RETURN_HEADER_TYPE__DESCRIPTION);
		createEReference(returnHeaderTypeEClass, RETURN_HEADER_TYPE__PARENT_TYPE_ID);

		returnItemEClass = createEClass(RETURN_ITEM);
		createEReference(returnItemEClass, RETURN_ITEM__RETURN_ID);
		createEAttribute(returnItemEClass, RETURN_ITEM__RETURN_ITEM_SEQ_ID);
		createEAttribute(returnItemEClass, RETURN_ITEM__DESCRIPTION);
		createEReference(returnItemEClass, RETURN_ITEM__EXPECTED_ITEM_STATUS);
		createEReference(returnItemEClass, RETURN_ITEM__ORDER_ID);
		createEAttribute(returnItemEClass, RETURN_ITEM__ORDER_ITEM_SEQ_ID);
		createEReference(returnItemEClass, RETURN_ITEM__PRODUCT_ID);
		createEAttribute(returnItemEClass, RETURN_ITEM__RECEIVED_QUANTITY);
		createEReference(returnItemEClass, RETURN_ITEM__RETURN_ITEM_RESPONSE_ID);
		createEReference(returnItemEClass, RETURN_ITEM__RETURN_ITEM_TYPE_ID);
		createEAttribute(returnItemEClass, RETURN_ITEM__RETURN_PRICE);
		createEAttribute(returnItemEClass, RETURN_ITEM__RETURN_QUANTITY);
		createEReference(returnItemEClass, RETURN_ITEM__RETURN_REASON_ID);
		createEReference(returnItemEClass, RETURN_ITEM__RETURN_TYPE_ID);
		createEReference(returnItemEClass, RETURN_ITEM__STATUS_ID);

		returnItemBillingEClass = createEClass(RETURN_ITEM_BILLING);
		createEReference(returnItemBillingEClass, RETURN_ITEM_BILLING__RETURN_ID);
		createEReference(returnItemBillingEClass, RETURN_ITEM_BILLING__INVOICE_ID);
		createEAttribute(returnItemBillingEClass, RETURN_ITEM_BILLING__INVOICE_ITEM_SEQ_ID);
		createEAttribute(returnItemBillingEClass, RETURN_ITEM_BILLING__RETURN_ITEM_SEQ_ID);
		createEAttribute(returnItemBillingEClass, RETURN_ITEM_BILLING__AMOUNT);
		createEAttribute(returnItemBillingEClass, RETURN_ITEM_BILLING__QUANTITY);
		createEReference(returnItemBillingEClass, RETURN_ITEM_BILLING__SHIPMENT_RECEIPT_ID);

		returnItemResponseEClass = createEClass(RETURN_ITEM_RESPONSE);
		createEAttribute(returnItemResponseEClass, RETURN_ITEM_RESPONSE__RETURN_ITEM_RESPONSE_ID);
		createEReference(returnItemResponseEClass, RETURN_ITEM_RESPONSE__BILLING_ACCOUNT_ID);
		createEReference(returnItemResponseEClass, RETURN_ITEM_RESPONSE__FIN_ACCOUNT_TRANS_ID);
		createEReference(returnItemResponseEClass, RETURN_ITEM_RESPONSE__ORDER_PAYMENT_PREFERENCE_ID);
		createEReference(returnItemResponseEClass, RETURN_ITEM_RESPONSE__PAYMENT_ID);
		createEReference(returnItemResponseEClass, RETURN_ITEM_RESPONSE__REPLACEMENT_ORDER_ID);
		createEAttribute(returnItemResponseEClass, RETURN_ITEM_RESPONSE__RESPONSE_AMOUNT);
		createEAttribute(returnItemResponseEClass, RETURN_ITEM_RESPONSE__RESPONSE_DATE);

		returnItemShipmentEClass = createEClass(RETURN_ITEM_SHIPMENT);
		createEReference(returnItemShipmentEClass, RETURN_ITEM_SHIPMENT__RETURN_ID);
		createEReference(returnItemShipmentEClass, RETURN_ITEM_SHIPMENT__SHIPMENT_ID);
		createEAttribute(returnItemShipmentEClass, RETURN_ITEM_SHIPMENT__RETURN_ITEM_SEQ_ID);
		createEAttribute(returnItemShipmentEClass, RETURN_ITEM_SHIPMENT__SHIPMENT_ITEM_SEQ_ID);
		createEAttribute(returnItemShipmentEClass, RETURN_ITEM_SHIPMENT__QUANTITY);

		returnItemTypeEClass = createEClass(RETURN_ITEM_TYPE);
		createEAttribute(returnItemTypeEClass, RETURN_ITEM_TYPE__RETURN_ITEM_TYPE_ID);
		createEAttribute(returnItemTypeEClass, RETURN_ITEM_TYPE__DESCRIPTION);
		createEReference(returnItemTypeEClass, RETURN_ITEM_TYPE__PARENT_TYPE_ID);

		returnItemTypeMapEClass = createEClass(RETURN_ITEM_TYPE_MAP);
		createEReference(returnItemTypeMapEClass, RETURN_ITEM_TYPE_MAP__RETURN_HEADER_TYPE_ID);
		createEAttribute(returnItemTypeMapEClass, RETURN_ITEM_TYPE_MAP__RETURN_ITEM_MAP_KEY);
		createEReference(returnItemTypeMapEClass, RETURN_ITEM_TYPE_MAP__RETURN_ITEM_TYPE_ID);

		returnReasonEClass = createEClass(RETURN_REASON);
		createEAttribute(returnReasonEClass, RETURN_REASON__RETURN_REASON_ID);
		createEAttribute(returnReasonEClass, RETURN_REASON__DESCRIPTION);
		createEAttribute(returnReasonEClass, RETURN_REASON__SEQUENCE_ID);

		returnStatusEClass = createEClass(RETURN_STATUS);
		createEAttribute(returnStatusEClass, RETURN_STATUS__RETURN_STATUS_ID);
		createEReference(returnStatusEClass, RETURN_STATUS__CHANGE_BY_USER_LOGIN_ID);
		createEReference(returnStatusEClass, RETURN_STATUS__RETURN_ID);
		createEAttribute(returnStatusEClass, RETURN_STATUS__RETURN_ITEM_SEQ_ID);
		createEAttribute(returnStatusEClass, RETURN_STATUS__STATUS_DATETIME);
		createEReference(returnStatusEClass, RETURN_STATUS__STATUS_ID);

		returnTypeEClass = createEClass(RETURN_TYPE);
		createEAttribute(returnTypeEClass, RETURN_TYPE__RETURN_TYPE_ID);
		createEAttribute(returnTypeEClass, RETURN_TYPE__DESCRIPTION);
		createEAttribute(returnTypeEClass, RETURN_TYPE__SEQUENCE_ID);
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
		OrderPackage theOrderPackage = (OrderPackage)EPackage.Registry.INSTANCE.getEPackage(OrderPackage.eNS_URI);
		LedgerPackage theLedgerPackage = (LedgerPackage)EPackage.Registry.INSTANCE.getEPackage(LedgerPackage.eNS_URI);
		GeoPackage theGeoPackage = (GeoPackage)EPackage.Registry.INSTANCE.getEPackage(GeoPackage.eNS_URI);
		PromoPackage thePromoPackage = (PromoPackage)EPackage.Registry.INSTANCE.getEPackage(PromoPackage.eNS_URI);
		TaxPackage theTaxPackage = (TaxPackage)EPackage.Registry.INSTANCE.getEPackage(TaxPackage.eNS_URI);
		org.abchip.mimo.biz.party.contact.ContactPackage theContactPackage_1 = (org.abchip.mimo.biz.party.contact.ContactPackage)EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.party.contact.ContactPackage.eNS_URI);
		PaymentPackage thePaymentPackage = (PaymentPackage)EPackage.Registry.INSTANCE.getEPackage(PaymentPackage.eNS_URI);
		UomPackage theUomPackage = (UomPackage)EPackage.Registry.INSTANCE.getEPackage(UomPackage.eNS_URI);
		FacilityPackage theFacilityPackage = (FacilityPackage)EPackage.Registry.INSTANCE.getEPackage(FacilityPackage.eNS_URI);
		FinaccountPackage theFinaccountPackage = (FinaccountPackage)EPackage.Registry.INSTANCE.getEPackage(FinaccountPackage.eNS_URI);
		PartyPackage thePartyPackage_1 = (PartyPackage)EPackage.Registry.INSTANCE.getEPackage(PartyPackage.eNS_URI);
		StatusPackage theStatusPackage = (StatusPackage)EPackage.Registry.INSTANCE.getEPackage(StatusPackage.eNS_URI);
		ProductPackage theProductPackage = (ProductPackage)EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI);
		InvoicePackage theInvoicePackage = (InvoicePackage)EPackage.Registry.INSTANCE.getEPackage(InvoicePackage.eNS_URI);
		ReceiptPackage theReceiptPackage = (ReceiptPackage)EPackage.Registry.INSTANCE.getEPackage(ReceiptPackage.eNS_URI);
		Shipment_Package theShipment_Package = (Shipment_Package)EPackage.Registry.INSTANCE.getEPackage(Shipment_Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		communicationEventReturnEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		EGenericType g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		EGenericType g2 = createEGenericType(this.getReturnAdjustmentType());
		g1.getETypeArguments().add(g2);
		returnAdjustmentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getReturnAdjustment());
		g1.getETypeArguments().add(g2);
		returnAdjustmentTypeEClass.getEGenericSuperTypes().add(g1);
		returnContactMechEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		returnHeaderEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		returnHeaderTypeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		returnItemEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		returnItemBillingEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		returnItemResponseEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		returnItemShipmentEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		returnItemTypeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		returnItemTypeMapEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		returnReasonEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		returnStatusEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		returnTypeEClass.getESuperTypes().add(theBizPackage.getBizEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(communicationEventReturnEClass, CommunicationEventReturn.class, "CommunicationEventReturn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationEventReturn_ReturnId(), this.getReturnHeader(), null, "returnId", null, 1, 1, CommunicationEventReturn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCommunicationEventReturn_ReturnId().getEKeys().add(this.getReturnHeader_ReturnId());
		initEReference(getCommunicationEventReturn_CommunicationEventId(), theCommunicationPackage.getCommunicationEvent(), null, "communicationEventId", null, 1, 1, CommunicationEventReturn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCommunicationEventReturn_CommunicationEventId().getEKeys().add(theCommunicationPackage.getCommunicationEvent_CommunicationEventId());

		initEClass(returnAdjustmentEClass, ReturnAdjustment.class, "ReturnAdjustment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReturnAdjustment_ReturnAdjustmentId(), ecorePackage.getEString(), "returnAdjustmentId", null, 1, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnAdjustment_Amount(), ecorePackage.getEBigDecimal(), "amount", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnAdjustment_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnAdjustment_CorrespondingProductId(), ecorePackage.getEString(), "correspondingProductId", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnAdjustment_CreatedByUserLogin(), theLoginPackage.getUserLogin(), null, "createdByUserLogin", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnAdjustment_CreatedByUserLogin().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());
		initEAttribute(getReturnAdjustment_CreatedDate(), ecorePackage.getEDate(), "createdDate", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnAdjustment_CustomerReferenceId(), ecorePackage.getEString(), "customerReferenceId", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnAdjustment_Description(), ecorePackage.getEString(), "description", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnAdjustment_ExemptAmount(), ecorePackage.getEBigDecimal(), "exemptAmount", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnAdjustment_IncludeInShipping(), ecorePackage.getEBoolean(), "includeInShipping", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnAdjustment_IncludeInTax(), ecorePackage.getEBoolean(), "includeInTax", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnAdjustment_LastModifiedByUserLogin(), ecorePackage.getEString(), "lastModifiedByUserLogin", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnAdjustment_LastModifiedDate(), ecorePackage.getEDate(), "lastModifiedDate", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnAdjustment_OrderAdjustmentId(), theOrderPackage.getOrderAdjustment(), null, "orderAdjustmentId", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnAdjustment_OrderAdjustmentId().getEKeys().add(theOrderPackage.getOrderAdjustment_OrderAdjustmentId());
		initEReference(getReturnAdjustment_OverrideGlAccountId(), theLedgerPackage.getGlAccount(), null, "overrideGlAccountId", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnAdjustment_OverrideGlAccountId().getEKeys().add(theLedgerPackage.getGlAccount_GlAccountId());
		initEReference(getReturnAdjustment_PrimaryGeoId(), theGeoPackage.getGeo(), null, "primaryGeoId", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnAdjustment_PrimaryGeoId().getEKeys().add(theGeoPackage.getGeo_GeoId());
		initEAttribute(getReturnAdjustment_ProductFeatureId(), ecorePackage.getEString(), "productFeatureId", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnAdjustment_ProductPromoActionSeqId(), ecorePackage.getEString(), "productPromoActionSeqId", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnAdjustment_ProductPromoId(), thePromoPackage.getProductPromo(), null, "productPromoId", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnAdjustment_ProductPromoId().getEKeys().add(thePromoPackage.getProductPromo_ProductPromoId());
		initEAttribute(getReturnAdjustment_ProductPromoRuleId(), ecorePackage.getEString(), "productPromoRuleId", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnAdjustment_ReturnAdjustmentTypeId(), this.getReturnAdjustmentType(), null, "returnAdjustmentTypeId", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnAdjustment_ReturnAdjustmentTypeId().getEKeys().add(this.getReturnAdjustmentType_ReturnAdjustmentTypeId());
		initEReference(getReturnAdjustment_ReturnId(), this.getReturnHeader(), null, "returnId", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnAdjustment_ReturnId().getEKeys().add(this.getReturnHeader_ReturnId());
		initEAttribute(getReturnAdjustment_ReturnItemSeqId(), ecorePackage.getEString(), "returnItemSeqId", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnAdjustment_ReturnTypeId(), this.getReturnType(), null, "returnTypeId", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnAdjustment_ReturnTypeId().getEKeys().add(this.getReturnType_ReturnTypeId());
		initEReference(getReturnAdjustment_SecondaryGeoId(), theGeoPackage.getGeo(), null, "secondaryGeoId", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnAdjustment_SecondaryGeoId().getEKeys().add(theGeoPackage.getGeo_GeoId());
		initEAttribute(getReturnAdjustment_ShipGroupSeqId(), ecorePackage.getEString(), "shipGroupSeqId", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnAdjustment_SourcePercentage(), ecorePackage.getEBigDecimal(), "sourcePercentage", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnAdjustment_SourceReferenceId(), ecorePackage.getEString(), "sourceReferenceId", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnAdjustment_TaxAuthGeoId(), ecorePackage.getEString(), "taxAuthGeoId", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnAdjustment_TaxAuthPartyId(), ecorePackage.getEString(), "taxAuthPartyId", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnAdjustment_TaxAuthorityRateSeqId(), theTaxPackage.getTaxAuthorityRateProduct(), null, "taxAuthorityRateSeqId", null, 0, 1, ReturnAdjustment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnAdjustment_TaxAuthorityRateSeqId().getEKeys().add(theTaxPackage.getTaxAuthorityRateProduct_TaxAuthorityRateSeqId());

		initEClass(returnAdjustmentTypeEClass, ReturnAdjustmentType.class, "ReturnAdjustmentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReturnAdjustmentType_ReturnAdjustmentTypeId(), ecorePackage.getEString(), "returnAdjustmentTypeId", null, 1, 1, ReturnAdjustmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnAdjustmentType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ReturnAdjustmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnAdjustmentType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, ReturnAdjustmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnAdjustmentType_ParentTypeId(), this.getReturnAdjustmentType(), null, "parentTypeId", null, 0, 1, ReturnAdjustmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnAdjustmentType_ParentTypeId().getEKeys().add(this.getReturnAdjustmentType_ReturnAdjustmentTypeId());

		initEClass(returnContactMechEClass, ReturnContactMech.class, "ReturnContactMech", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnContactMech_ReturnId(), this.getReturnHeader(), null, "returnId", null, 1, 1, ReturnContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnContactMech_ReturnId().getEKeys().add(this.getReturnHeader_ReturnId());
		initEReference(getReturnContactMech_ContactMechId(), theContactPackage_1.getContactMech(), null, "contactMechId", null, 1, 1, ReturnContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnContactMech_ContactMechId().getEKeys().add(theContactPackage_1.getContactMech_ContactMechId());
		initEReference(getReturnContactMech_ContactMechPurposeTypeId(), theContactPackage_1.getContactMechPurposeType(), null, "contactMechPurposeTypeId", null, 1, 1, ReturnContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnContactMech_ContactMechPurposeTypeId().getEKeys().add(theContactPackage_1.getContactMechPurposeType_ContactMechPurposeTypeId());

		initEClass(returnHeaderEClass, ReturnHeader.class, "ReturnHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReturnHeader_ReturnId(), ecorePackage.getEString(), "returnId", null, 1, 1, ReturnHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnHeader_BillingAccountId(), thePaymentPackage.getBillingAccount(), null, "billingAccountId", null, 0, 1, ReturnHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnHeader_BillingAccountId().getEKeys().add(thePaymentPackage.getBillingAccount_BillingAccountId());
		initEReference(getReturnHeader_CommunicationEventReturns(), this.getCommunicationEventReturn(), null, "communicationEventReturns", null, 0, -1, ReturnHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getReturnHeader_CreatedBy(), theLoginPackage.getUserLogin(), null, "createdBy", null, 0, 1, ReturnHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnHeader_CreatedBy().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());
		initEReference(getReturnHeader_CurrencyUomId(), theUomPackage.getUom(), null, "currencyUomId", null, 0, 1, ReturnHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnHeader_CurrencyUomId().getEKeys().add(theUomPackage.getUom_UomId());
		initEReference(getReturnHeader_DestinationFacilityId(), theFacilityPackage.getFacility(), null, "destinationFacilityId", null, 0, 1, ReturnHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnHeader_DestinationFacilityId().getEKeys().add(theFacilityPackage.getFacility_FacilityId());
		initEAttribute(getReturnHeader_EntryDate(), ecorePackage.getEDate(), "entryDate", null, 0, 1, ReturnHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnHeader_FinAccountId(), theFinaccountPackage.getFinAccount(), null, "finAccountId", null, 0, 1, ReturnHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnHeader_FinAccountId().getEKeys().add(theFinaccountPackage.getFinAccount_FinAccountId());
		initEReference(getReturnHeader_FromPartyId(), thePartyPackage_1.getParty(), null, "fromPartyId", null, 0, 1, ReturnHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnHeader_FromPartyId().getEKeys().add(thePartyPackage_1.getParty_PartyId());
		initEAttribute(getReturnHeader_NeedsInventoryReceive(), ecorePackage.getEBoolean(), "needsInventoryReceive", null, 0, 1, ReturnHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnHeader_OriginContactMechId(), theContactPackage_1.getContactMech(), null, "originContactMechId", null, 0, 1, ReturnHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnHeader_OriginContactMechId().getEKeys().add(theContactPackage_1.getContactMech_ContactMechId());
		initEReference(getReturnHeader_PaymentMethodId(), thePaymentPackage.getPaymentMethod(), null, "paymentMethodId", null, 0, 1, ReturnHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnHeader_PaymentMethodId().getEKeys().add(thePaymentPackage.getPaymentMethod_PaymentMethodId());
		initEReference(getReturnHeader_ReturnHeaderTypeId(), this.getReturnHeaderType(), null, "returnHeaderTypeId", null, 0, 1, ReturnHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnHeader_ReturnHeaderTypeId().getEKeys().add(this.getReturnHeaderType_ReturnHeaderTypeId());
		initEReference(getReturnHeader_ReturnItems(), this.getReturnItem(), null, "returnItems", null, 0, -1, ReturnHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getReturnHeader_StatusId(), theStatusPackage.getStatusItem(), null, "statusId", null, 0, 1, ReturnHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnHeader_StatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEAttribute(getReturnHeader_SupplierRmaId(), ecorePackage.getEString(), "supplierRmaId", null, 0, 1, ReturnHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnHeader_ToPartyId(), thePartyPackage_1.getParty(), null, "toPartyId", null, 0, 1, ReturnHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnHeader_ToPartyId().getEKeys().add(thePartyPackage_1.getParty_PartyId());

		initEClass(returnHeaderTypeEClass, ReturnHeaderType.class, "ReturnHeaderType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReturnHeaderType_ReturnHeaderTypeId(), ecorePackage.getEString(), "returnHeaderTypeId", null, 1, 1, ReturnHeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnHeaderType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ReturnHeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnHeaderType_ParentTypeId(), this.getReturnHeaderType(), null, "parentTypeId", null, 0, 1, ReturnHeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnHeaderType_ParentTypeId().getEKeys().add(this.getReturnHeaderType_ReturnHeaderTypeId());

		initEClass(returnItemEClass, ReturnItem.class, "ReturnItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnItem_ReturnId(), this.getReturnHeader(), null, "returnId", null, 1, 1, ReturnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnItem_ReturnId().getEKeys().add(this.getReturnHeader_ReturnId());
		initEAttribute(getReturnItem_ReturnItemSeqId(), ecorePackage.getEString(), "returnItemSeqId", null, 1, 1, ReturnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnItem_Description(), ecorePackage.getEString(), "description", null, 0, 1, ReturnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnItem_ExpectedItemStatus(), theStatusPackage.getStatusItem(), null, "expectedItemStatus", null, 0, 1, ReturnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnItem_ExpectedItemStatus().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEReference(getReturnItem_OrderId(), theOrderPackage.getOrderHeader(), null, "orderId", null, 0, 1, ReturnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnItem_OrderId().getEKeys().add(theOrderPackage.getOrderHeader_OrderId());
		initEAttribute(getReturnItem_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, ReturnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnItem_ProductId(), theProductPackage.getProduct(), null, "productId", null, 0, 1, ReturnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnItem_ProductId().getEKeys().add(theProductPackage.getProduct_ProductId());
		initEAttribute(getReturnItem_ReceivedQuantity(), ecorePackage.getEBigDecimal(), "receivedQuantity", null, 0, 1, ReturnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnItem_ReturnItemResponseId(), this.getReturnItemResponse(), null, "returnItemResponseId", null, 0, 1, ReturnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnItem_ReturnItemResponseId().getEKeys().add(this.getReturnItemResponse_ReturnItemResponseId());
		initEReference(getReturnItem_ReturnItemTypeId(), this.getReturnItemType(), null, "returnItemTypeId", null, 0, 1, ReturnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnItem_ReturnItemTypeId().getEKeys().add(this.getReturnItemType_ReturnItemTypeId());
		initEAttribute(getReturnItem_ReturnPrice(), ecorePackage.getEBigDecimal(), "returnPrice", null, 0, 1, ReturnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnItem_ReturnQuantity(), ecorePackage.getEBigDecimal(), "returnQuantity", null, 0, 1, ReturnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnItem_ReturnReasonId(), this.getReturnReason(), null, "returnReasonId", null, 0, 1, ReturnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnItem_ReturnReasonId().getEKeys().add(this.getReturnReason_ReturnReasonId());
		initEReference(getReturnItem_ReturnTypeId(), this.getReturnType(), null, "returnTypeId", null, 0, 1, ReturnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnItem_ReturnTypeId().getEKeys().add(this.getReturnType_ReturnTypeId());
		initEReference(getReturnItem_StatusId(), theStatusPackage.getStatusItem(), null, "statusId", null, 0, 1, ReturnItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnItem_StatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());

		initEClass(returnItemBillingEClass, ReturnItemBilling.class, "ReturnItemBilling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnItemBilling_ReturnId(), this.getReturnHeader(), null, "returnId", null, 1, 1, ReturnItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnItemBilling_ReturnId().getEKeys().add(this.getReturnHeader_ReturnId());
		initEReference(getReturnItemBilling_InvoiceId(), theInvoicePackage.getInvoice(), null, "invoiceId", null, 1, 1, ReturnItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnItemBilling_InvoiceId().getEKeys().add(theInvoicePackage.getInvoice_InvoiceId());
		initEAttribute(getReturnItemBilling_InvoiceItemSeqId(), ecorePackage.getEString(), "invoiceItemSeqId", null, 1, 1, ReturnItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnItemBilling_ReturnItemSeqId(), ecorePackage.getEString(), "returnItemSeqId", null, 1, 1, ReturnItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnItemBilling_Amount(), ecorePackage.getEBigDecimal(), "amount", null, 0, 1, ReturnItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnItemBilling_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, ReturnItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnItemBilling_ShipmentReceiptId(), theReceiptPackage.getShipmentReceipt(), null, "shipmentReceiptId", null, 0, 1, ReturnItemBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnItemBilling_ShipmentReceiptId().getEKeys().add(theReceiptPackage.getShipmentReceipt_ReceiptId());

		initEClass(returnItemResponseEClass, ReturnItemResponse.class, "ReturnItemResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReturnItemResponse_ReturnItemResponseId(), ecorePackage.getEString(), "returnItemResponseId", null, 1, 1, ReturnItemResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnItemResponse_BillingAccountId(), thePaymentPackage.getBillingAccount(), null, "billingAccountId", null, 0, 1, ReturnItemResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnItemResponse_BillingAccountId().getEKeys().add(thePaymentPackage.getBillingAccount_BillingAccountId());
		initEReference(getReturnItemResponse_FinAccountTransId(), theFinaccountPackage.getFinAccountTrans(), null, "finAccountTransId", null, 0, 1, ReturnItemResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnItemResponse_FinAccountTransId().getEKeys().add(theFinaccountPackage.getFinAccountTrans_FinAccountTransId());
		initEReference(getReturnItemResponse_OrderPaymentPreferenceId(), theOrderPackage.getOrderPaymentPreference(), null, "orderPaymentPreferenceId", null, 0, 1, ReturnItemResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnItemResponse_OrderPaymentPreferenceId().getEKeys().add(theOrderPackage.getOrderPaymentPreference_OrderPaymentPreferenceId());
		initEReference(getReturnItemResponse_PaymentId(), thePaymentPackage.getPayment(), null, "paymentId", null, 0, 1, ReturnItemResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnItemResponse_PaymentId().getEKeys().add(thePaymentPackage.getPayment_PaymentId());
		initEReference(getReturnItemResponse_ReplacementOrderId(), theOrderPackage.getOrderHeader(), null, "replacementOrderId", null, 0, 1, ReturnItemResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnItemResponse_ReplacementOrderId().getEKeys().add(theOrderPackage.getOrderHeader_OrderId());
		initEAttribute(getReturnItemResponse_ResponseAmount(), ecorePackage.getEBigDecimal(), "responseAmount", null, 0, 1, ReturnItemResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnItemResponse_ResponseDate(), ecorePackage.getEDate(), "responseDate", null, 0, 1, ReturnItemResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnItemShipmentEClass, ReturnItemShipment.class, "ReturnItemShipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnItemShipment_ReturnId(), this.getReturnHeader(), null, "returnId", null, 1, 1, ReturnItemShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnItemShipment_ReturnId().getEKeys().add(this.getReturnHeader_ReturnId());
		initEReference(getReturnItemShipment_ShipmentId(), theShipment_Package.getShipment(), null, "shipmentId", null, 1, 1, ReturnItemShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnItemShipment_ShipmentId().getEKeys().add(theShipment_Package.getShipment_ShipmentId());
		initEAttribute(getReturnItemShipment_ReturnItemSeqId(), ecorePackage.getEString(), "returnItemSeqId", null, 1, 1, ReturnItemShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnItemShipment_ShipmentItemSeqId(), ecorePackage.getEString(), "shipmentItemSeqId", null, 1, 1, ReturnItemShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnItemShipment_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, ReturnItemShipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnItemTypeEClass, ReturnItemType.class, "ReturnItemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReturnItemType_ReturnItemTypeId(), ecorePackage.getEString(), "returnItemTypeId", null, 1, 1, ReturnItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnItemType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ReturnItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnItemType_ParentTypeId(), this.getReturnItemType(), null, "parentTypeId", null, 0, 1, ReturnItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnItemType_ParentTypeId().getEKeys().add(this.getReturnItemType_ReturnItemTypeId());

		initEClass(returnItemTypeMapEClass, ReturnItemTypeMap.class, "ReturnItemTypeMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnItemTypeMap_ReturnHeaderTypeId(), this.getReturnHeaderType(), null, "returnHeaderTypeId", null, 1, 1, ReturnItemTypeMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnItemTypeMap_ReturnHeaderTypeId().getEKeys().add(this.getReturnHeaderType_ReturnHeaderTypeId());
		initEAttribute(getReturnItemTypeMap_ReturnItemMapKey(), ecorePackage.getEString(), "returnItemMapKey", null, 1, 1, ReturnItemTypeMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnItemTypeMap_ReturnItemTypeId(), this.getReturnItemType(), null, "returnItemTypeId", null, 0, 1, ReturnItemTypeMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnItemTypeMap_ReturnItemTypeId().getEKeys().add(this.getReturnItemType_ReturnItemTypeId());

		initEClass(returnReasonEClass, ReturnReason.class, "ReturnReason", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReturnReason_ReturnReasonId(), ecorePackage.getEString(), "returnReasonId", null, 1, 1, ReturnReason.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnReason_Description(), ecorePackage.getEString(), "description", null, 0, 1, ReturnReason.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnReason_SequenceId(), ecorePackage.getEString(), "sequenceId", null, 0, 1, ReturnReason.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnStatusEClass, ReturnStatus.class, "ReturnStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReturnStatus_ReturnStatusId(), ecorePackage.getEString(), "returnStatusId", null, 1, 1, ReturnStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnStatus_ChangeByUserLoginId(), theLoginPackage.getUserLogin(), null, "changeByUserLoginId", null, 0, 1, ReturnStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnStatus_ChangeByUserLoginId().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());
		initEReference(getReturnStatus_ReturnId(), this.getReturnHeader(), null, "returnId", null, 0, 1, ReturnStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnStatus_ReturnId().getEKeys().add(this.getReturnHeader_ReturnId());
		initEAttribute(getReturnStatus_ReturnItemSeqId(), ecorePackage.getEString(), "returnItemSeqId", null, 0, 1, ReturnStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnStatus_StatusDatetime(), ecorePackage.getEDate(), "statusDatetime", null, 0, 1, ReturnStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnStatus_StatusId(), theStatusPackage.getStatusItem(), null, "statusId", null, 0, 1, ReturnStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getReturnStatus_StatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());

		initEClass(returnTypeEClass, ReturnType.class, "ReturnType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReturnType_ReturnTypeId(), ecorePackage.getEString(), "returnTypeId", null, 1, 1, ReturnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ReturnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReturnType_SequenceId(), ecorePackage.getEString(), "sequenceId", null, 0, 1, ReturnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// mimo-ent-slot
		createMimoentslotAnnotations();
		// mimo-ent-frame
		createMimoentframeAnnotations();
		// mimo-ent-format
		createMimoentformatAnnotations();
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
		  (getCommunicationEventReturn_ReturnId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getCommunicationEventReturn_CommunicationEventId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getReturnAdjustment_CustomerReferenceId(),
		   source,
		   new String[] {
			   "help", "for tax entries this is partyTaxId"
		   });
		addAnnotation
		  (getReturnAdjustment_ExemptAmount(),
		   source,
		   new String[] {
			   "help", "an amount that would normally apply, but not to this order; for tax exemption represents the what the tax would have been"
		   });
		addAnnotation
		  (getReturnAdjustment_OverrideGlAccountId(),
		   source,
		   new String[] {
			   "help", "used to specify the override or actual glAccountId used for the adjustment, avoids problems if configuration changes after initial posting, etc"
		   });
		addAnnotation
		  (getReturnAdjustment_PrimaryGeoId(),
		   source,
		   new String[] {
			   "help", "for tax entries this is the primary jurisdiction Geo (the smallest or most local Geo that this tax is for, usually a state/province, perhaps a county or a city)"
		   });
		addAnnotation
		  (getReturnAdjustment_ReturnTypeId(),
		   source,
		   new String[] {
			   "help", "actually used for disbursement type: store credit, cash refund, exchange"
		   });
		addAnnotation
		  (getReturnAdjustment_SecondaryGeoId(),
		   source,
		   new String[] {
			   "help", "for tax entries this is the secondary jurisdiction Geo (usually a country, or other Geo that the primary is within)"
		   });
		addAnnotation
		  (getReturnAdjustment_SourcePercentage(),
		   source,
		   new String[] {
			   "help", "for tax entries this is the tax percentage"
		   });
		addAnnotation
		  (getReturnAdjustment_TaxAuthGeoId(),
		   source,
		   new String[] {
			   "help", "these taxAuth fields deprecate the primaryGeoId and secondaryGeoId fields and will be used with the newer tax calc stuff"
		   });
		addAnnotation
		  (getReturnContactMech_ReturnId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getReturnContactMech_ContactMechId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getReturnContactMech_ContactMechPurposeTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getReturnItem_ReturnId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getReturnItem_ReturnItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getReturnItem_ProductId(),
		   source,
		   new String[] {
			   "help", "we need this field to be able to figure out net sales of a product"
		   });
		addAnnotation
		  (getReturnItem_ReceivedQuantity(),
		   source,
		   new String[] {
			   "audit", "true",
			   "help", "actually received from the customer"
		   });
		addAnnotation
		  (getReturnItem_ReturnItemTypeId(),
		   source,
		   new String[] {
			   "help", "what is returned: a product, a service, etc"
		   });
		addAnnotation
		  (getReturnItem_ReturnPrice(),
		   source,
		   new String[] {
			   "audit", "true"
		   });
		addAnnotation
		  (getReturnItem_ReturnQuantity(),
		   source,
		   new String[] {
			   "audit", "true",
			   "help", "promised by the customer"
		   });
		addAnnotation
		  (getReturnItem_ReturnReasonId(),
		   source,
		   new String[] {
			   "audit", "true",
			   "help", "why item is returned: did not like, wrong item, damaged, etc. etc."
		   });
		addAnnotation
		  (getReturnItem_ReturnTypeId(),
		   source,
		   new String[] {
			   "audit", "true",
			   "help", "actually used for disbursement type: store credit, cash refund, exchange"
		   });
		addAnnotation
		  (getReturnItemBilling_ReturnId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getReturnItemBilling_InvoiceId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getReturnItemBilling_InvoiceItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getReturnItemBilling_ReturnItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getReturnItemShipment_ReturnId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getReturnItemShipment_ShipmentId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getReturnItemShipment_ReturnItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getReturnItemShipment_ShipmentItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getReturnItemTypeMap_ReturnHeaderTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getReturnItemTypeMap_ReturnItemMapKey(),
		   source,
		   new String[] {
			   "key", "true"
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
		  (returnAdjustmentEClass,
		   source,
		   new String[] {
			   "help", "Tax, shipping, and promotional adjustments which are carried over from the order to the return.\n        Note that both includeInTax and includeInShipping should default to true, except in the case where this adjustment is a tax or shipping adjustment\n        then should be ignored.",
			   "formula", "description"
		   });
		addAnnotation
		  (returnAdjustmentTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "OrderEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (returnContactMechEClass,
		   source,
		   new String[] {
			   "title", "Retrun Contact Mechanism"
		   });
		addAnnotation
		  (returnHeaderEClass,
		   source,
		   new String[] {
			   "title", "Return"
		   });
		addAnnotation
		  (returnHeaderTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (returnItemEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (returnItemBillingEClass,
		   source,
		   new String[] {
			   "title", "Records the quantity and amount returned to an inventory item from a return item."
		   });
		addAnnotation
		  (returnItemResponseEClass,
		   source,
		   new String[] {
			   "help", "Records what was done with a return: whether a replacement order, a payment, or a billing account credit was issued",
			   "title", "The Return Item Response"
		   });
		addAnnotation
		  (returnItemShipmentEClass,
		   source,
		   new String[] {
			   "title", "Return Item And Shipment Association"
		   });
		addAnnotation
		  (returnItemTypeEClass,
		   source,
		   new String[] {
			   "help", "ReturnItemType records the type of a ReturnItem",
			   "formula", "description"
		   });
		addAnnotation
		  (returnItemTypeMapEClass,
		   source,
		   new String[] {
			   "help", "Mapping between productTypeId and returnItemTypeId for product order items, orderItemTypeId and returnItemTypeId for other\n          order items, or orderAdjustmentTypeId and returnAdjustmentTypeId.  Separate mappings for different types of returns (customer vs. vendor)"
		   });
		addAnnotation
		  (returnReasonEClass,
		   source,
		   new String[] {
			   "dictionary", "OrderEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (returnStatusEClass,
		   source,
		   new String[] {
			   "title", "Return Status History"
		   });
		addAnnotation
		  (returnTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "OrderEntityLabels",
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
		  (getReturnAdjustment_ReturnAdjustmentId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getReturnAdjustment_Amount(),
		   source,
		   new String[] {
			   "type", "currency-precise",
			   "precision", "18",
			   "scale", "3"
		   });
		addAnnotation
		  (getReturnAdjustment_Comments(),
		   source,
		   new String[] {
			   "type", "comment",
			   "length", "255"
		   });
		addAnnotation
		  (getReturnAdjustment_CorrespondingProductId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getReturnAdjustment_CustomerReferenceId(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getReturnAdjustment_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getReturnAdjustment_ExemptAmount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getReturnAdjustment_LastModifiedByUserLogin(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getReturnAdjustment_ProductFeatureId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getReturnAdjustment_ProductPromoActionSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getReturnAdjustment_ProductPromoRuleId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getReturnAdjustment_ReturnItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getReturnAdjustment_ShipGroupSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getReturnAdjustment_SourcePercentage(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getReturnAdjustment_SourceReferenceId(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getReturnAdjustment_TaxAuthGeoId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getReturnAdjustment_TaxAuthPartyId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getReturnAdjustmentType_ReturnAdjustmentTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getReturnAdjustmentType_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getReturnHeader_ReturnId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getReturnHeader_SupplierRmaId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getReturnHeaderType_ReturnHeaderTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getReturnHeaderType_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getReturnItem_ReturnItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getReturnItem_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getReturnItem_OrderItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getReturnItem_ReceivedQuantity(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getReturnItem_ReturnPrice(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getReturnItem_ReturnQuantity(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getReturnItemBilling_InvoiceItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getReturnItemBilling_ReturnItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getReturnItemBilling_Amount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getReturnItemBilling_Quantity(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getReturnItemResponse_ReturnItemResponseId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getReturnItemResponse_ResponseAmount(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getReturnItemShipment_ReturnItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getReturnItemShipment_ShipmentItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getReturnItemShipment_Quantity(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getReturnItemType_ReturnItemTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getReturnItemType_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getReturnItemTypeMap_ReturnItemMapKey(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getReturnReason_ReturnReasonId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getReturnReason_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getReturnReason_SequenceId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getReturnStatus_ReturnStatusId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getReturnStatus_ReturnItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getReturnType_ReturnTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getReturnType_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getReturnType_SequenceId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
	}

} //ReturnPackageImpl
