/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.fixedasset.impl;

import org.abchip.mimo.MimoPackage;
import org.abchip.mimo.biz.BizPackage;
import org.abchip.mimo.biz.accounting.budget.BudgetPackage;
import org.abchip.mimo.biz.accounting.budget.impl.BudgetPackageImpl;
import org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage;
import org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountPackageImpl;
import org.abchip.mimo.biz.accounting.fixedasset.AccommodationClass;
import org.abchip.mimo.biz.accounting.fixedasset.AccommodationMap;
import org.abchip.mimo.biz.accounting.fixedasset.AccommodationMapType;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetAttribute;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetDepMethod;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetGeoPoint;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetIdent;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetIdentType;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaintOrder;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMeter;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProduct;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProductType;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetRegistration;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetStdCost;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetStdCostType;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetType;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeAttr;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount;
import org.abchip.mimo.biz.accounting.fixedasset.FixedassetFactory;
import org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage;
import org.abchip.mimo.biz.accounting.fixedasset.PartyFixedAssetAssignment;
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
public class FixedassetPackageImpl extends EPackageImpl implements FixedassetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accommodationClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accommodationMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accommodationMapTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetDepMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetGeoPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetIdentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetIdentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetMaintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetMaintOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetMeterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetProductTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetRegistrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetStdCostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetStdCostTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetTypeAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetTypeGlAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyFixedAssetAssignmentEClass = null;

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
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FixedassetPackageImpl() {
		super(eNS_URI, FixedassetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FixedassetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FixedassetPackage init() {
		if (isInited) return (FixedassetPackage)EPackage.Registry.INSTANCE.getEPackage(FixedassetPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFixedassetPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FixedassetPackageImpl theFixedassetPackage = registeredFixedassetPackage instanceof FixedassetPackageImpl ? (FixedassetPackageImpl)registeredFixedassetPackage : new FixedassetPackageImpl();

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
		theFixedassetPackage.createPackageContents();
		theBizPackage.createPackageContents();
		theBudgetPackage.createPackageContents();
		theFinaccountPackage.createPackageContents();
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
		theShipment_Package.createPackageContents();
		theVisitPackage.createPackageContents();
		theWebsitePackage_1.createPackageContents();
		theTimesheetPackage.createPackageContents();
		theWorkeffortPackage.createPackageContents();

		// Initialize created meta-data
		theFixedassetPackage.initializePackageContents();
		theBizPackage.initializePackageContents();
		theBudgetPackage.initializePackageContents();
		theFinaccountPackage.initializePackageContents();
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
		theShipment_Package.initializePackageContents();
		theVisitPackage.initializePackageContents();
		theWebsitePackage_1.initializePackageContents();
		theTimesheetPackage.initializePackageContents();
		theWorkeffortPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFixedassetPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FixedassetPackage.eNS_URI, theFixedassetPackage);
		return theFixedassetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccommodationClass() {
		return accommodationClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccommodationClass_AccommodationClassId() {
		return (EAttribute)accommodationClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccommodationClass_Description() {
		return (EAttribute)accommodationClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccommodationClass_ParentClassId() {
		return (EAttribute)accommodationClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccommodationMap() {
		return accommodationMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccommodationMap_AccommodationMapId() {
		return (EAttribute)accommodationMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccommodationMap_AccommodationClassId() {
		return (EAttribute)accommodationMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccommodationMap_AccommodationMapTypeId() {
		return (EAttribute)accommodationMapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccommodationMap_FixedAssetId() {
		return (EAttribute)accommodationMapEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccommodationMap_NumberOfSpaces() {
		return (EAttribute)accommodationMapEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccommodationMapType() {
		return accommodationMapTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccommodationMapType_AccommodationMapTypeId() {
		return (EAttribute)accommodationMapTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccommodationMapType_Description() {
		return (EAttribute)accommodationMapTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAsset() {
		return fixedAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_FixedAssetId() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_AcquireOrderId() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_AcquireOrderItemSeqId() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_ActualEndOfLife() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_CalendarId() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_ClassEnumId() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_DateAcquired() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_DateLastServiced() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_DateNextService() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_Depreciation() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_ExpectedEndOfLife() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_FixedAssetName() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_FixedAssetTypeId() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_InstanceOfProductId() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_LocatedAtFacilityId() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_LocatedAtLocationSeqId() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_ParentFixedAssetId() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_PartyId() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_ProductionCapacity() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_PurchaseCost() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_PurchaseCostUomId() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_RoleTypeId() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_SalvageValue() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_SerialNumber() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_UomId() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_FixedAssetAttributes() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_FixedAssetIdents() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_FixedAssetMaints() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAsset_FixedAssetRegistrations() {
		return (EAttribute)fixedAssetEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetAttribute() {
		return fixedAssetAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetAttribute_FixedAssetId() {
		return (EAttribute)fixedAssetAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetAttribute_AttrName() {
		return (EAttribute)fixedAssetAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetAttribute_AttrDescription() {
		return (EAttribute)fixedAssetAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetAttribute_AttrValue() {
		return (EAttribute)fixedAssetAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetDepMethod() {
		return fixedAssetDepMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetDepMethod_DepreciationCustomMethodId() {
		return (EAttribute)fixedAssetDepMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetDepMethod_FixedAssetId() {
		return (EAttribute)fixedAssetDepMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetDepMethod_FromDate() {
		return (EAttribute)fixedAssetDepMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetDepMethod_ThruDate() {
		return (EAttribute)fixedAssetDepMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetGeoPoint() {
		return fixedAssetGeoPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetGeoPoint_FixedAssetId() {
		return (EAttribute)fixedAssetGeoPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetGeoPoint_GeoPointId() {
		return (EAttribute)fixedAssetGeoPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetGeoPoint_FromDate() {
		return (EAttribute)fixedAssetGeoPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetGeoPoint_ThruDate() {
		return (EAttribute)fixedAssetGeoPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetIdent() {
		return fixedAssetIdentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetIdent_FixedAssetId() {
		return (EAttribute)fixedAssetIdentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetIdent_FixedAssetIdentTypeId() {
		return (EAttribute)fixedAssetIdentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetIdent_IdValue() {
		return (EAttribute)fixedAssetIdentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetIdentType() {
		return fixedAssetIdentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetIdentType_FixedAssetIdentTypeId() {
		return (EAttribute)fixedAssetIdentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetIdentType_Description() {
		return (EAttribute)fixedAssetIdentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetMaint() {
		return fixedAssetMaintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMaint_FixedAssetId() {
		return (EAttribute)fixedAssetMaintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMaint_MaintHistSeqId() {
		return (EAttribute)fixedAssetMaintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMaint_IntervalMeterTypeId() {
		return (EAttribute)fixedAssetMaintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMaint_IntervalQuantity() {
		return (EAttribute)fixedAssetMaintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMaint_IntervalUomId() {
		return (EAttribute)fixedAssetMaintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMaint_ProductMaintSeqId() {
		return (EAttribute)fixedAssetMaintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMaint_ProductMaintTypeId() {
		return (EAttribute)fixedAssetMaintEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMaint_PurchaseOrderId() {
		return (EAttribute)fixedAssetMaintEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMaint_ScheduleWorkEffortId() {
		return (EAttribute)fixedAssetMaintEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMaint_StatusId() {
		return (EAttribute)fixedAssetMaintEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetMaintOrder() {
		return fixedAssetMaintOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMaintOrder_FixedAssetId() {
		return (EAttribute)fixedAssetMaintOrderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMaintOrder_MaintHistSeqId() {
		return (EAttribute)fixedAssetMaintOrderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMaintOrder_OrderId() {
		return (EAttribute)fixedAssetMaintOrderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMaintOrder_OrderItemSeqId() {
		return (EAttribute)fixedAssetMaintOrderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetMeter() {
		return fixedAssetMeterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMeter_FixedAssetId() {
		return (EAttribute)fixedAssetMeterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMeter_ProductMeterTypeId() {
		return (EAttribute)fixedAssetMeterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMeter_ReadingDate() {
		return (EAttribute)fixedAssetMeterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMeter_MaintHistSeqId() {
		return (EAttribute)fixedAssetMeterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMeter_MeterValue() {
		return (EAttribute)fixedAssetMeterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMeter_ReadingReasonEnumId() {
		return (EAttribute)fixedAssetMeterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetMeter_WorkEffortId() {
		return (EAttribute)fixedAssetMeterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetProduct() {
		return fixedAssetProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetProduct_FixedAssetId() {
		return (EAttribute)fixedAssetProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetProduct_ProductId() {
		return (EAttribute)fixedAssetProductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetProduct_FixedAssetProductTypeId() {
		return (EAttribute)fixedAssetProductEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetProduct_FromDate() {
		return (EAttribute)fixedAssetProductEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetProduct_Comments() {
		return (EAttribute)fixedAssetProductEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetProduct_Quantity() {
		return (EAttribute)fixedAssetProductEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetProduct_QuantityUomId() {
		return (EAttribute)fixedAssetProductEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetProduct_SequenceNum() {
		return (EAttribute)fixedAssetProductEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetProduct_ThruDate() {
		return (EAttribute)fixedAssetProductEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetProductType() {
		return fixedAssetProductTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetProductType_FixedAssetProductTypeId() {
		return (EAttribute)fixedAssetProductTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetProductType_Description() {
		return (EAttribute)fixedAssetProductTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetRegistration() {
		return fixedAssetRegistrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetRegistration_FixedAssetId() {
		return (EAttribute)fixedAssetRegistrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetRegistration_FromDate() {
		return (EAttribute)fixedAssetRegistrationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetRegistration_GovAgencyPartyId() {
		return (EAttribute)fixedAssetRegistrationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetRegistration_LicenseNumber() {
		return (EAttribute)fixedAssetRegistrationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetRegistration_RegistrationDate() {
		return (EAttribute)fixedAssetRegistrationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetRegistration_RegistrationNumber() {
		return (EAttribute)fixedAssetRegistrationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetRegistration_ThruDate() {
		return (EAttribute)fixedAssetRegistrationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetStdCost() {
		return fixedAssetStdCostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetStdCost_FixedAssetId() {
		return (EAttribute)fixedAssetStdCostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetStdCost_FixedAssetStdCostTypeId() {
		return (EAttribute)fixedAssetStdCostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetStdCost_FromDate() {
		return (EAttribute)fixedAssetStdCostEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetStdCost_Amount() {
		return (EAttribute)fixedAssetStdCostEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetStdCost_AmountUomId() {
		return (EAttribute)fixedAssetStdCostEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetStdCost_ThruDate() {
		return (EAttribute)fixedAssetStdCostEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetStdCostType() {
		return fixedAssetStdCostTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetStdCostType_FixedAssetStdCostTypeId() {
		return (EAttribute)fixedAssetStdCostTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetStdCostType_Description() {
		return (EAttribute)fixedAssetStdCostTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetStdCostType_HasTable() {
		return (EAttribute)fixedAssetStdCostTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetStdCostType_ParentTypeId() {
		return (EAttribute)fixedAssetStdCostTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetType() {
		return fixedAssetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetType_FixedAssetTypeId() {
		return (EAttribute)fixedAssetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetType_Description() {
		return (EAttribute)fixedAssetTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetType_HasTable() {
		return (EAttribute)fixedAssetTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetType_ParentTypeId() {
		return (EAttribute)fixedAssetTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetType_FixedAssetTypeAttrs() {
		return (EAttribute)fixedAssetTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetTypeAttr() {
		return fixedAssetTypeAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetTypeAttr_FixedAssetTypeId() {
		return (EAttribute)fixedAssetTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetTypeAttr_AttrName() {
		return (EAttribute)fixedAssetTypeAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetTypeAttr_Description() {
		return (EAttribute)fixedAssetTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedAssetTypeGlAccount() {
		return fixedAssetTypeGlAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetTypeGlAccount_FixedAssetTypeId() {
		return (EAttribute)fixedAssetTypeGlAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetTypeGlAccount_FixedAssetId() {
		return (EAttribute)fixedAssetTypeGlAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetTypeGlAccount_OrganizationPartyId() {
		return (EAttribute)fixedAssetTypeGlAccountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetTypeGlAccount_AccDepGlAccountId() {
		return (EAttribute)fixedAssetTypeGlAccountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetTypeGlAccount_AssetGlAccountId() {
		return (EAttribute)fixedAssetTypeGlAccountEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetTypeGlAccount_DepGlAccountId() {
		return (EAttribute)fixedAssetTypeGlAccountEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetTypeGlAccount_LossGlAccountId() {
		return (EAttribute)fixedAssetTypeGlAccountEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFixedAssetTypeGlAccount_ProfitGlAccountId() {
		return (EAttribute)fixedAssetTypeGlAccountEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyFixedAssetAssignment() {
		return partyFixedAssetAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyFixedAssetAssignment_PartyId() {
		return (EAttribute)partyFixedAssetAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyFixedAssetAssignment_RoleTypeId() {
		return (EAttribute)partyFixedAssetAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyFixedAssetAssignment_FixedAssetId() {
		return (EAttribute)partyFixedAssetAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyFixedAssetAssignment_FromDate() {
		return (EAttribute)partyFixedAssetAssignmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyFixedAssetAssignment_AllocatedDate() {
		return (EAttribute)partyFixedAssetAssignmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyFixedAssetAssignment_Comments() {
		return (EAttribute)partyFixedAssetAssignmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyFixedAssetAssignment_StatusId() {
		return (EAttribute)partyFixedAssetAssignmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyFixedAssetAssignment_ThruDate() {
		return (EAttribute)partyFixedAssetAssignmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedassetFactory getFixedassetFactory() {
		return (FixedassetFactory)getEFactoryInstance();
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
		accommodationClassEClass = createEClass(ACCOMMODATION_CLASS);
		createEAttribute(accommodationClassEClass, ACCOMMODATION_CLASS__ACCOMMODATION_CLASS_ID);
		createEAttribute(accommodationClassEClass, ACCOMMODATION_CLASS__DESCRIPTION);
		createEAttribute(accommodationClassEClass, ACCOMMODATION_CLASS__PARENT_CLASS_ID);

		accommodationMapEClass = createEClass(ACCOMMODATION_MAP);
		createEAttribute(accommodationMapEClass, ACCOMMODATION_MAP__ACCOMMODATION_MAP_ID);
		createEAttribute(accommodationMapEClass, ACCOMMODATION_MAP__ACCOMMODATION_CLASS_ID);
		createEAttribute(accommodationMapEClass, ACCOMMODATION_MAP__ACCOMMODATION_MAP_TYPE_ID);
		createEAttribute(accommodationMapEClass, ACCOMMODATION_MAP__FIXED_ASSET_ID);
		createEAttribute(accommodationMapEClass, ACCOMMODATION_MAP__NUMBER_OF_SPACES);

		accommodationMapTypeEClass = createEClass(ACCOMMODATION_MAP_TYPE);
		createEAttribute(accommodationMapTypeEClass, ACCOMMODATION_MAP_TYPE__ACCOMMODATION_MAP_TYPE_ID);
		createEAttribute(accommodationMapTypeEClass, ACCOMMODATION_MAP_TYPE__DESCRIPTION);

		fixedAssetEClass = createEClass(FIXED_ASSET);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__FIXED_ASSET_ID);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__ACQUIRE_ORDER_ID);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__ACQUIRE_ORDER_ITEM_SEQ_ID);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__ACTUAL_END_OF_LIFE);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__CALENDAR_ID);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__CLASS_ENUM_ID);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__DATE_ACQUIRED);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__DATE_LAST_SERVICED);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__DATE_NEXT_SERVICE);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__DEPRECIATION);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__EXPECTED_END_OF_LIFE);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__FIXED_ASSET_NAME);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__FIXED_ASSET_TYPE_ID);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__INSTANCE_OF_PRODUCT_ID);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__LOCATED_AT_FACILITY_ID);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__LOCATED_AT_LOCATION_SEQ_ID);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__PARENT_FIXED_ASSET_ID);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__PARTY_ID);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__PRODUCTION_CAPACITY);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__PURCHASE_COST);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__PURCHASE_COST_UOM_ID);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__ROLE_TYPE_ID);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__SALVAGE_VALUE);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__SERIAL_NUMBER);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__UOM_ID);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__FIXED_ASSET_ATTRIBUTES);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__FIXED_ASSET_IDENTS);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__FIXED_ASSET_MAINTS);
		createEAttribute(fixedAssetEClass, FIXED_ASSET__FIXED_ASSET_REGISTRATIONS);

		fixedAssetAttributeEClass = createEClass(FIXED_ASSET_ATTRIBUTE);
		createEAttribute(fixedAssetAttributeEClass, FIXED_ASSET_ATTRIBUTE__FIXED_ASSET_ID);
		createEAttribute(fixedAssetAttributeEClass, FIXED_ASSET_ATTRIBUTE__ATTR_NAME);
		createEAttribute(fixedAssetAttributeEClass, FIXED_ASSET_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(fixedAssetAttributeEClass, FIXED_ASSET_ATTRIBUTE__ATTR_VALUE);

		fixedAssetDepMethodEClass = createEClass(FIXED_ASSET_DEP_METHOD);
		createEAttribute(fixedAssetDepMethodEClass, FIXED_ASSET_DEP_METHOD__DEPRECIATION_CUSTOM_METHOD_ID);
		createEAttribute(fixedAssetDepMethodEClass, FIXED_ASSET_DEP_METHOD__FIXED_ASSET_ID);
		createEAttribute(fixedAssetDepMethodEClass, FIXED_ASSET_DEP_METHOD__FROM_DATE);
		createEAttribute(fixedAssetDepMethodEClass, FIXED_ASSET_DEP_METHOD__THRU_DATE);

		fixedAssetGeoPointEClass = createEClass(FIXED_ASSET_GEO_POINT);
		createEAttribute(fixedAssetGeoPointEClass, FIXED_ASSET_GEO_POINT__FIXED_ASSET_ID);
		createEAttribute(fixedAssetGeoPointEClass, FIXED_ASSET_GEO_POINT__GEO_POINT_ID);
		createEAttribute(fixedAssetGeoPointEClass, FIXED_ASSET_GEO_POINT__FROM_DATE);
		createEAttribute(fixedAssetGeoPointEClass, FIXED_ASSET_GEO_POINT__THRU_DATE);

		fixedAssetIdentEClass = createEClass(FIXED_ASSET_IDENT);
		createEAttribute(fixedAssetIdentEClass, FIXED_ASSET_IDENT__FIXED_ASSET_ID);
		createEAttribute(fixedAssetIdentEClass, FIXED_ASSET_IDENT__FIXED_ASSET_IDENT_TYPE_ID);
		createEAttribute(fixedAssetIdentEClass, FIXED_ASSET_IDENT__ID_VALUE);

		fixedAssetIdentTypeEClass = createEClass(FIXED_ASSET_IDENT_TYPE);
		createEAttribute(fixedAssetIdentTypeEClass, FIXED_ASSET_IDENT_TYPE__FIXED_ASSET_IDENT_TYPE_ID);
		createEAttribute(fixedAssetIdentTypeEClass, FIXED_ASSET_IDENT_TYPE__DESCRIPTION);

		fixedAssetMaintEClass = createEClass(FIXED_ASSET_MAINT);
		createEAttribute(fixedAssetMaintEClass, FIXED_ASSET_MAINT__FIXED_ASSET_ID);
		createEAttribute(fixedAssetMaintEClass, FIXED_ASSET_MAINT__MAINT_HIST_SEQ_ID);
		createEAttribute(fixedAssetMaintEClass, FIXED_ASSET_MAINT__INTERVAL_METER_TYPE_ID);
		createEAttribute(fixedAssetMaintEClass, FIXED_ASSET_MAINT__INTERVAL_QUANTITY);
		createEAttribute(fixedAssetMaintEClass, FIXED_ASSET_MAINT__INTERVAL_UOM_ID);
		createEAttribute(fixedAssetMaintEClass, FIXED_ASSET_MAINT__PRODUCT_MAINT_SEQ_ID);
		createEAttribute(fixedAssetMaintEClass, FIXED_ASSET_MAINT__PRODUCT_MAINT_TYPE_ID);
		createEAttribute(fixedAssetMaintEClass, FIXED_ASSET_MAINT__PURCHASE_ORDER_ID);
		createEAttribute(fixedAssetMaintEClass, FIXED_ASSET_MAINT__SCHEDULE_WORK_EFFORT_ID);
		createEAttribute(fixedAssetMaintEClass, FIXED_ASSET_MAINT__STATUS_ID);

		fixedAssetMaintOrderEClass = createEClass(FIXED_ASSET_MAINT_ORDER);
		createEAttribute(fixedAssetMaintOrderEClass, FIXED_ASSET_MAINT_ORDER__FIXED_ASSET_ID);
		createEAttribute(fixedAssetMaintOrderEClass, FIXED_ASSET_MAINT_ORDER__MAINT_HIST_SEQ_ID);
		createEAttribute(fixedAssetMaintOrderEClass, FIXED_ASSET_MAINT_ORDER__ORDER_ID);
		createEAttribute(fixedAssetMaintOrderEClass, FIXED_ASSET_MAINT_ORDER__ORDER_ITEM_SEQ_ID);

		fixedAssetMeterEClass = createEClass(FIXED_ASSET_METER);
		createEAttribute(fixedAssetMeterEClass, FIXED_ASSET_METER__FIXED_ASSET_ID);
		createEAttribute(fixedAssetMeterEClass, FIXED_ASSET_METER__PRODUCT_METER_TYPE_ID);
		createEAttribute(fixedAssetMeterEClass, FIXED_ASSET_METER__READING_DATE);
		createEAttribute(fixedAssetMeterEClass, FIXED_ASSET_METER__MAINT_HIST_SEQ_ID);
		createEAttribute(fixedAssetMeterEClass, FIXED_ASSET_METER__METER_VALUE);
		createEAttribute(fixedAssetMeterEClass, FIXED_ASSET_METER__READING_REASON_ENUM_ID);
		createEAttribute(fixedAssetMeterEClass, FIXED_ASSET_METER__WORK_EFFORT_ID);

		fixedAssetProductEClass = createEClass(FIXED_ASSET_PRODUCT);
		createEAttribute(fixedAssetProductEClass, FIXED_ASSET_PRODUCT__FIXED_ASSET_ID);
		createEAttribute(fixedAssetProductEClass, FIXED_ASSET_PRODUCT__PRODUCT_ID);
		createEAttribute(fixedAssetProductEClass, FIXED_ASSET_PRODUCT__FIXED_ASSET_PRODUCT_TYPE_ID);
		createEAttribute(fixedAssetProductEClass, FIXED_ASSET_PRODUCT__FROM_DATE);
		createEAttribute(fixedAssetProductEClass, FIXED_ASSET_PRODUCT__COMMENTS);
		createEAttribute(fixedAssetProductEClass, FIXED_ASSET_PRODUCT__QUANTITY);
		createEAttribute(fixedAssetProductEClass, FIXED_ASSET_PRODUCT__QUANTITY_UOM_ID);
		createEAttribute(fixedAssetProductEClass, FIXED_ASSET_PRODUCT__SEQUENCE_NUM);
		createEAttribute(fixedAssetProductEClass, FIXED_ASSET_PRODUCT__THRU_DATE);

		fixedAssetProductTypeEClass = createEClass(FIXED_ASSET_PRODUCT_TYPE);
		createEAttribute(fixedAssetProductTypeEClass, FIXED_ASSET_PRODUCT_TYPE__FIXED_ASSET_PRODUCT_TYPE_ID);
		createEAttribute(fixedAssetProductTypeEClass, FIXED_ASSET_PRODUCT_TYPE__DESCRIPTION);

		fixedAssetRegistrationEClass = createEClass(FIXED_ASSET_REGISTRATION);
		createEAttribute(fixedAssetRegistrationEClass, FIXED_ASSET_REGISTRATION__FIXED_ASSET_ID);
		createEAttribute(fixedAssetRegistrationEClass, FIXED_ASSET_REGISTRATION__FROM_DATE);
		createEAttribute(fixedAssetRegistrationEClass, FIXED_ASSET_REGISTRATION__GOV_AGENCY_PARTY_ID);
		createEAttribute(fixedAssetRegistrationEClass, FIXED_ASSET_REGISTRATION__LICENSE_NUMBER);
		createEAttribute(fixedAssetRegistrationEClass, FIXED_ASSET_REGISTRATION__REGISTRATION_DATE);
		createEAttribute(fixedAssetRegistrationEClass, FIXED_ASSET_REGISTRATION__REGISTRATION_NUMBER);
		createEAttribute(fixedAssetRegistrationEClass, FIXED_ASSET_REGISTRATION__THRU_DATE);

		fixedAssetStdCostEClass = createEClass(FIXED_ASSET_STD_COST);
		createEAttribute(fixedAssetStdCostEClass, FIXED_ASSET_STD_COST__FIXED_ASSET_ID);
		createEAttribute(fixedAssetStdCostEClass, FIXED_ASSET_STD_COST__FIXED_ASSET_STD_COST_TYPE_ID);
		createEAttribute(fixedAssetStdCostEClass, FIXED_ASSET_STD_COST__FROM_DATE);
		createEAttribute(fixedAssetStdCostEClass, FIXED_ASSET_STD_COST__AMOUNT);
		createEAttribute(fixedAssetStdCostEClass, FIXED_ASSET_STD_COST__AMOUNT_UOM_ID);
		createEAttribute(fixedAssetStdCostEClass, FIXED_ASSET_STD_COST__THRU_DATE);

		fixedAssetStdCostTypeEClass = createEClass(FIXED_ASSET_STD_COST_TYPE);
		createEAttribute(fixedAssetStdCostTypeEClass, FIXED_ASSET_STD_COST_TYPE__FIXED_ASSET_STD_COST_TYPE_ID);
		createEAttribute(fixedAssetStdCostTypeEClass, FIXED_ASSET_STD_COST_TYPE__DESCRIPTION);
		createEAttribute(fixedAssetStdCostTypeEClass, FIXED_ASSET_STD_COST_TYPE__HAS_TABLE);
		createEAttribute(fixedAssetStdCostTypeEClass, FIXED_ASSET_STD_COST_TYPE__PARENT_TYPE_ID);

		fixedAssetTypeEClass = createEClass(FIXED_ASSET_TYPE);
		createEAttribute(fixedAssetTypeEClass, FIXED_ASSET_TYPE__FIXED_ASSET_TYPE_ID);
		createEAttribute(fixedAssetTypeEClass, FIXED_ASSET_TYPE__DESCRIPTION);
		createEAttribute(fixedAssetTypeEClass, FIXED_ASSET_TYPE__HAS_TABLE);
		createEAttribute(fixedAssetTypeEClass, FIXED_ASSET_TYPE__PARENT_TYPE_ID);
		createEAttribute(fixedAssetTypeEClass, FIXED_ASSET_TYPE__FIXED_ASSET_TYPE_ATTRS);

		fixedAssetTypeAttrEClass = createEClass(FIXED_ASSET_TYPE_ATTR);
		createEAttribute(fixedAssetTypeAttrEClass, FIXED_ASSET_TYPE_ATTR__FIXED_ASSET_TYPE_ID);
		createEAttribute(fixedAssetTypeAttrEClass, FIXED_ASSET_TYPE_ATTR__ATTR_NAME);
		createEAttribute(fixedAssetTypeAttrEClass, FIXED_ASSET_TYPE_ATTR__DESCRIPTION);

		fixedAssetTypeGlAccountEClass = createEClass(FIXED_ASSET_TYPE_GL_ACCOUNT);
		createEAttribute(fixedAssetTypeGlAccountEClass, FIXED_ASSET_TYPE_GL_ACCOUNT__FIXED_ASSET_TYPE_ID);
		createEAttribute(fixedAssetTypeGlAccountEClass, FIXED_ASSET_TYPE_GL_ACCOUNT__FIXED_ASSET_ID);
		createEAttribute(fixedAssetTypeGlAccountEClass, FIXED_ASSET_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY_ID);
		createEAttribute(fixedAssetTypeGlAccountEClass, FIXED_ASSET_TYPE_GL_ACCOUNT__ACC_DEP_GL_ACCOUNT_ID);
		createEAttribute(fixedAssetTypeGlAccountEClass, FIXED_ASSET_TYPE_GL_ACCOUNT__ASSET_GL_ACCOUNT_ID);
		createEAttribute(fixedAssetTypeGlAccountEClass, FIXED_ASSET_TYPE_GL_ACCOUNT__DEP_GL_ACCOUNT_ID);
		createEAttribute(fixedAssetTypeGlAccountEClass, FIXED_ASSET_TYPE_GL_ACCOUNT__LOSS_GL_ACCOUNT_ID);
		createEAttribute(fixedAssetTypeGlAccountEClass, FIXED_ASSET_TYPE_GL_ACCOUNT__PROFIT_GL_ACCOUNT_ID);

		partyFixedAssetAssignmentEClass = createEClass(PARTY_FIXED_ASSET_ASSIGNMENT);
		createEAttribute(partyFixedAssetAssignmentEClass, PARTY_FIXED_ASSET_ASSIGNMENT__PARTY_ID);
		createEAttribute(partyFixedAssetAssignmentEClass, PARTY_FIXED_ASSET_ASSIGNMENT__ROLE_TYPE_ID);
		createEAttribute(partyFixedAssetAssignmentEClass, PARTY_FIXED_ASSET_ASSIGNMENT__FIXED_ASSET_ID);
		createEAttribute(partyFixedAssetAssignmentEClass, PARTY_FIXED_ASSET_ASSIGNMENT__FROM_DATE);
		createEAttribute(partyFixedAssetAssignmentEClass, PARTY_FIXED_ASSET_ASSIGNMENT__ALLOCATED_DATE);
		createEAttribute(partyFixedAssetAssignmentEClass, PARTY_FIXED_ASSET_ASSIGNMENT__COMMENTS);
		createEAttribute(partyFixedAssetAssignmentEClass, PARTY_FIXED_ASSET_ASSIGNMENT__STATUS_ID);
		createEAttribute(partyFixedAssetAssignmentEClass, PARTY_FIXED_ASSET_ASSIGNMENT__THRU_DATE);
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
		accommodationClassEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		EGenericType g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		EGenericType g2 = createEGenericType(this.getAccommodationMapType());
		g1.getETypeArguments().add(g2);
		accommodationMapEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getAccommodationMap());
		g1.getETypeArguments().add(g2);
		accommodationMapTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getFixedAssetType());
		g1.getETypeArguments().add(g2);
		fixedAssetEClass.getEGenericSuperTypes().add(g1);
		fixedAssetAttributeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		fixedAssetDepMethodEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		fixedAssetGeoPointEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getFixedAssetIdentType());
		g1.getETypeArguments().add(g2);
		fixedAssetIdentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getFixedAssetIdent());
		g1.getETypeArguments().add(g2);
		fixedAssetIdentTypeEClass.getEGenericSuperTypes().add(g1);
		fixedAssetMaintEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		fixedAssetMaintOrderEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		fixedAssetMeterEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getFixedAssetProductType());
		g1.getETypeArguments().add(g2);
		fixedAssetProductEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getFixedAssetProduct());
		g1.getETypeArguments().add(g2);
		fixedAssetProductTypeEClass.getEGenericSuperTypes().add(g1);
		fixedAssetRegistrationEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getFixedAssetStdCostType());
		g1.getETypeArguments().add(g2);
		fixedAssetStdCostEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getFixedAssetStdCost());
		g1.getETypeArguments().add(g2);
		fixedAssetStdCostTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getFixedAsset());
		g1.getETypeArguments().add(g2);
		fixedAssetTypeEClass.getEGenericSuperTypes().add(g1);
		fixedAssetTypeAttrEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		fixedAssetTypeGlAccountEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		partyFixedAssetAssignmentEClass.getESuperTypes().add(theBizPackage.getBizEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(accommodationClassEClass, AccommodationClass.class, "AccommodationClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccommodationClass_AccommodationClassId(), ecorePackage.getEString(), "accommodationClassId", null, 0, 1, AccommodationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccommodationClass_Description(), ecorePackage.getEString(), "description", null, 0, 1, AccommodationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccommodationClass_ParentClassId(), ecorePackage.getEString(), "parentClassId", null, 0, 1, AccommodationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(accommodationClassEClass, ecorePackage.getEString(), "accommodationMaps", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(accommodationClassEClass, ecorePackage.getEString(), "accommodationSpots", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(accommodationClassEClass, ecorePackage.getEString(), "childAccommodationClasses", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(accommodationMapEClass, AccommodationMap.class, "AccommodationMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccommodationMap_AccommodationMapId(), ecorePackage.getEString(), "accommodationMapId", null, 0, 1, AccommodationMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccommodationMap_AccommodationClassId(), ecorePackage.getEString(), "accommodationClassId", null, 0, 1, AccommodationMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccommodationMap_AccommodationMapTypeId(), ecorePackage.getEString(), "accommodationMapTypeId", null, 0, 1, AccommodationMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccommodationMap_FixedAssetId(), ecorePackage.getEString(), "fixedAssetId", null, 0, 1, AccommodationMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccommodationMap_NumberOfSpaces(), ecorePackage.getELong(), "numberOfSpaces", null, 0, 1, AccommodationMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(accommodationMapEClass, ecorePackage.getEString(), "workEfforts", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(accommodationMapTypeEClass, AccommodationMapType.class, "AccommodationMapType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccommodationMapType_AccommodationMapTypeId(), ecorePackage.getEString(), "accommodationMapTypeId", null, 0, 1, AccommodationMapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccommodationMapType_Description(), ecorePackage.getEString(), "description", null, 0, 1, AccommodationMapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(accommodationMapTypeEClass, ecorePackage.getEString(), "accommodationMaps", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(fixedAssetEClass, FixedAsset.class, "FixedAsset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedAsset_FixedAssetId(), ecorePackage.getEString(), "fixedAssetId", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_AcquireOrderId(), ecorePackage.getEString(), "acquireOrderId", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_AcquireOrderItemSeqId(), ecorePackage.getEString(), "acquireOrderItemSeqId", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_ActualEndOfLife(), ecorePackage.getEDate(), "actualEndOfLife", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_CalendarId(), ecorePackage.getEString(), "calendarId", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_ClassEnumId(), ecorePackage.getEString(), "classEnumId", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_DateAcquired(), ecorePackage.getEDate(), "dateAcquired", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_DateLastServiced(), ecorePackage.getEDate(), "dateLastServiced", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_DateNextService(), ecorePackage.getEDate(), "dateNextService", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_Depreciation(), ecorePackage.getEBigDecimal(), "depreciation", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_ExpectedEndOfLife(), ecorePackage.getEDate(), "expectedEndOfLife", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_FixedAssetName(), ecorePackage.getEString(), "fixedAssetName", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_FixedAssetTypeId(), ecorePackage.getEString(), "fixedAssetTypeId", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_InstanceOfProductId(), ecorePackage.getEString(), "instanceOfProductId", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_LocatedAtFacilityId(), ecorePackage.getEString(), "locatedAtFacilityId", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_LocatedAtLocationSeqId(), ecorePackage.getEString(), "locatedAtLocationSeqId", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_ParentFixedAssetId(), ecorePackage.getEString(), "parentFixedAssetId", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_PartyId(), ecorePackage.getEString(), "partyId", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_ProductionCapacity(), ecorePackage.getEBigDecimal(), "productionCapacity", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_PurchaseCost(), ecorePackage.getEBigDecimal(), "purchaseCost", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_PurchaseCostUomId(), ecorePackage.getEString(), "purchaseCostUomId", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_RoleTypeId(), ecorePackage.getEString(), "roleTypeId", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_SalvageValue(), ecorePackage.getEBigDecimal(), "salvageValue", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_SerialNumber(), ecorePackage.getEString(), "serialNumber", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_UomId(), ecorePackage.getEString(), "uomId", null, 0, 1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_FixedAssetAttributes(), ecorePackage.getEString(), "fixedAssetAttributes", null, 0, -1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_FixedAssetIdents(), ecorePackage.getEString(), "fixedAssetIdents", null, 0, -1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_FixedAssetMaints(), ecorePackage.getEString(), "fixedAssetMaints", null, 0, -1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAsset_FixedAssetRegistrations(), ecorePackage.getEString(), "fixedAssetRegistrations", null, 0, -1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(fixedAssetEClass, ecorePackage.getEString(), "accommodationMaps", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(fixedAssetEClass, ecorePackage.getEString(), "accommodationSpots", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(fixedAssetEClass, ecorePackage.getEString(), "acctgTranss", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(fixedAssetEClass, ecorePackage.getEString(), "childFixedAssets", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(fixedAssetEClass, ecorePackage.getEString(), "costComponents", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(fixedAssetEClass, ecorePackage.getEString(), "deliveries", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(fixedAssetEClass, ecorePackage.getEString(), "fixedAssetDepMethods", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(fixedAssetEClass, ecorePackage.getEString(), "fixedAssetInventoryItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(fixedAssetEClass, ecorePackage.getEString(), "requirements", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(fixedAssetEClass, ecorePackage.getEString(), "workEfforts", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(fixedAssetAttributeEClass, FixedAssetAttribute.class, "FixedAssetAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedAssetAttribute_FixedAssetId(), ecorePackage.getEString(), "fixedAssetId", null, 0, 1, FixedAssetAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 0, 1, FixedAssetAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, FixedAssetAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, FixedAssetAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetDepMethodEClass, FixedAssetDepMethod.class, "FixedAssetDepMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedAssetDepMethod_DepreciationCustomMethodId(), ecorePackage.getEString(), "depreciationCustomMethodId", null, 0, 1, FixedAssetDepMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetDepMethod_FixedAssetId(), ecorePackage.getEString(), "fixedAssetId", null, 0, 1, FixedAssetDepMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetDepMethod_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, FixedAssetDepMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetDepMethod_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, FixedAssetDepMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetGeoPointEClass, FixedAssetGeoPoint.class, "FixedAssetGeoPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedAssetGeoPoint_FixedAssetId(), ecorePackage.getEString(), "fixedAssetId", null, 0, 1, FixedAssetGeoPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetGeoPoint_GeoPointId(), ecorePackage.getEString(), "geoPointId", null, 0, 1, FixedAssetGeoPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetGeoPoint_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, FixedAssetGeoPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetGeoPoint_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, FixedAssetGeoPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetIdentEClass, FixedAssetIdent.class, "FixedAssetIdent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedAssetIdent_FixedAssetId(), ecorePackage.getEString(), "fixedAssetId", null, 0, 1, FixedAssetIdent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetIdent_FixedAssetIdentTypeId(), ecorePackage.getEString(), "fixedAssetIdentTypeId", null, 0, 1, FixedAssetIdent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetIdent_IdValue(), ecorePackage.getEString(), "idValue", null, 0, 1, FixedAssetIdent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetIdentTypeEClass, FixedAssetIdentType.class, "FixedAssetIdentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedAssetIdentType_FixedAssetIdentTypeId(), ecorePackage.getEString(), "fixedAssetIdentTypeId", null, 0, 1, FixedAssetIdentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetIdentType_Description(), ecorePackage.getEString(), "description", null, 0, 1, FixedAssetIdentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(fixedAssetIdentTypeEClass, ecorePackage.getEString(), "fixedAssetIdents", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(fixedAssetMaintEClass, FixedAssetMaint.class, "FixedAssetMaint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedAssetMaint_FixedAssetId(), ecorePackage.getEString(), "fixedAssetId", null, 0, 1, FixedAssetMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMaint_MaintHistSeqId(), ecorePackage.getEString(), "maintHistSeqId", null, 0, 1, FixedAssetMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMaint_IntervalMeterTypeId(), ecorePackage.getEString(), "intervalMeterTypeId", null, 0, 1, FixedAssetMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMaint_IntervalQuantity(), ecorePackage.getEBigDecimal(), "intervalQuantity", null, 0, 1, FixedAssetMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMaint_IntervalUomId(), ecorePackage.getEString(), "intervalUomId", null, 0, 1, FixedAssetMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMaint_ProductMaintSeqId(), ecorePackage.getEString(), "productMaintSeqId", null, 0, 1, FixedAssetMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMaint_ProductMaintTypeId(), ecorePackage.getEString(), "productMaintTypeId", null, 0, 1, FixedAssetMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMaint_PurchaseOrderId(), ecorePackage.getEString(), "purchaseOrderId", null, 0, 1, FixedAssetMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMaint_ScheduleWorkEffortId(), ecorePackage.getEString(), "scheduleWorkEffortId", null, 0, 1, FixedAssetMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMaint_StatusId(), ecorePackage.getEString(), "statusId", null, 0, 1, FixedAssetMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetMaintOrderEClass, FixedAssetMaintOrder.class, "FixedAssetMaintOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedAssetMaintOrder_FixedAssetId(), ecorePackage.getEString(), "fixedAssetId", null, 0, 1, FixedAssetMaintOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMaintOrder_MaintHistSeqId(), ecorePackage.getEString(), "maintHistSeqId", null, 0, 1, FixedAssetMaintOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMaintOrder_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, FixedAssetMaintOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMaintOrder_OrderItemSeqId(), ecorePackage.getEString(), "orderItemSeqId", null, 0, 1, FixedAssetMaintOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetMeterEClass, FixedAssetMeter.class, "FixedAssetMeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedAssetMeter_FixedAssetId(), ecorePackage.getEString(), "fixedAssetId", null, 0, 1, FixedAssetMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMeter_ProductMeterTypeId(), ecorePackage.getEString(), "productMeterTypeId", null, 0, 1, FixedAssetMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMeter_ReadingDate(), ecorePackage.getEDate(), "readingDate", null, 0, 1, FixedAssetMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMeter_MaintHistSeqId(), ecorePackage.getEString(), "maintHistSeqId", null, 0, 1, FixedAssetMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMeter_MeterValue(), ecorePackage.getEBigDecimal(), "meterValue", null, 0, 1, FixedAssetMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMeter_ReadingReasonEnumId(), ecorePackage.getEString(), "readingReasonEnumId", null, 0, 1, FixedAssetMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetMeter_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 0, 1, FixedAssetMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetProductEClass, FixedAssetProduct.class, "FixedAssetProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedAssetProduct_FixedAssetId(), ecorePackage.getEString(), "fixedAssetId", null, 0, 1, FixedAssetProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetProduct_ProductId(), ecorePackage.getEString(), "productId", null, 0, 1, FixedAssetProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetProduct_FixedAssetProductTypeId(), ecorePackage.getEString(), "fixedAssetProductTypeId", null, 0, 1, FixedAssetProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetProduct_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, FixedAssetProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetProduct_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, FixedAssetProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetProduct_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, FixedAssetProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetProduct_QuantityUomId(), ecorePackage.getEString(), "quantityUomId", null, 0, 1, FixedAssetProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetProduct_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, FixedAssetProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetProduct_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, FixedAssetProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetProductTypeEClass, FixedAssetProductType.class, "FixedAssetProductType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedAssetProductType_FixedAssetProductTypeId(), ecorePackage.getEString(), "fixedAssetProductTypeId", null, 0, 1, FixedAssetProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetProductType_Description(), ecorePackage.getEString(), "description", null, 0, 1, FixedAssetProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetRegistrationEClass, FixedAssetRegistration.class, "FixedAssetRegistration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedAssetRegistration_FixedAssetId(), ecorePackage.getEString(), "fixedAssetId", null, 0, 1, FixedAssetRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetRegistration_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, FixedAssetRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetRegistration_GovAgencyPartyId(), ecorePackage.getEString(), "govAgencyPartyId", null, 0, 1, FixedAssetRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetRegistration_LicenseNumber(), ecorePackage.getEString(), "licenseNumber", null, 0, 1, FixedAssetRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetRegistration_RegistrationDate(), ecorePackage.getEDate(), "registrationDate", null, 0, 1, FixedAssetRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetRegistration_RegistrationNumber(), ecorePackage.getEString(), "registrationNumber", null, 0, 1, FixedAssetRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetRegistration_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, FixedAssetRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetStdCostEClass, FixedAssetStdCost.class, "FixedAssetStdCost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedAssetStdCost_FixedAssetId(), ecorePackage.getEString(), "fixedAssetId", null, 0, 1, FixedAssetStdCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetStdCost_FixedAssetStdCostTypeId(), ecorePackage.getEString(), "fixedAssetStdCostTypeId", null, 0, 1, FixedAssetStdCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetStdCost_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, FixedAssetStdCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetStdCost_Amount(), ecorePackage.getEBigDecimal(), "amount", null, 0, 1, FixedAssetStdCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetStdCost_AmountUomId(), ecorePackage.getEString(), "amountUomId", null, 0, 1, FixedAssetStdCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetStdCost_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, FixedAssetStdCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetStdCostTypeEClass, FixedAssetStdCostType.class, "FixedAssetStdCostType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedAssetStdCostType_FixedAssetStdCostTypeId(), ecorePackage.getEString(), "fixedAssetStdCostTypeId", null, 0, 1, FixedAssetStdCostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetStdCostType_Description(), ecorePackage.getEString(), "description", null, 0, 1, FixedAssetStdCostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetStdCostType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, FixedAssetStdCostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetStdCostType_ParentTypeId(), ecorePackage.getEString(), "parentTypeId", null, 0, 1, FixedAssetStdCostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(fixedAssetStdCostTypeEClass, ecorePackage.getEString(), "childFixedAssetStdCostTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(fixedAssetTypeEClass, FixedAssetType.class, "FixedAssetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedAssetType_FixedAssetTypeId(), ecorePackage.getEString(), "fixedAssetTypeId", null, 0, 1, FixedAssetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetType_Description(), ecorePackage.getEString(), "description", null, 0, 1, FixedAssetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, FixedAssetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetType_ParentTypeId(), ecorePackage.getEString(), "parentTypeId", null, 0, 1, FixedAssetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetType_FixedAssetTypeAttrs(), ecorePackage.getEString(), "fixedAssetTypeAttrs", null, 0, -1, FixedAssetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(fixedAssetTypeEClass, ecorePackage.getEString(), "childFixedAssetTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(fixedAssetTypeEClass, ecorePackage.getEString(), "fixedAssets", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(fixedAssetTypeEClass, ecorePackage.getEString(), "workEffortFixedAssetStds", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(fixedAssetTypeAttrEClass, FixedAssetTypeAttr.class, "FixedAssetTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedAssetTypeAttr_FixedAssetTypeId(), ecorePackage.getEString(), "fixedAssetTypeId", null, 0, 1, FixedAssetTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 0, 1, FixedAssetTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, FixedAssetTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedAssetTypeGlAccountEClass, FixedAssetTypeGlAccount.class, "FixedAssetTypeGlAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedAssetTypeGlAccount_FixedAssetTypeId(), ecorePackage.getEString(), "fixedAssetTypeId", null, 0, 1, FixedAssetTypeGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetTypeGlAccount_FixedAssetId(), ecorePackage.getEString(), "fixedAssetId", null, 0, 1, FixedAssetTypeGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetTypeGlAccount_OrganizationPartyId(), ecorePackage.getEString(), "organizationPartyId", null, 0, 1, FixedAssetTypeGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetTypeGlAccount_AccDepGlAccountId(), ecorePackage.getEString(), "accDepGlAccountId", null, 0, 1, FixedAssetTypeGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetTypeGlAccount_AssetGlAccountId(), ecorePackage.getEString(), "assetGlAccountId", null, 0, 1, FixedAssetTypeGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetTypeGlAccount_DepGlAccountId(), ecorePackage.getEString(), "depGlAccountId", null, 0, 1, FixedAssetTypeGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetTypeGlAccount_LossGlAccountId(), ecorePackage.getEString(), "lossGlAccountId", null, 0, 1, FixedAssetTypeGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedAssetTypeGlAccount_ProfitGlAccountId(), ecorePackage.getEString(), "profitGlAccountId", null, 0, 1, FixedAssetTypeGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyFixedAssetAssignmentEClass, PartyFixedAssetAssignment.class, "PartyFixedAssetAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyFixedAssetAssignment_PartyId(), ecorePackage.getEString(), "partyId", null, 0, 1, PartyFixedAssetAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyFixedAssetAssignment_RoleTypeId(), ecorePackage.getEString(), "roleTypeId", null, 0, 1, PartyFixedAssetAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyFixedAssetAssignment_FixedAssetId(), ecorePackage.getEString(), "fixedAssetId", null, 0, 1, PartyFixedAssetAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyFixedAssetAssignment_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, PartyFixedAssetAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyFixedAssetAssignment_AllocatedDate(), ecorePackage.getEDate(), "allocatedDate", null, 0, 1, PartyFixedAssetAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyFixedAssetAssignment_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, PartyFixedAssetAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyFixedAssetAssignment_StatusId(), ecorePackage.getEString(), "statusId", null, 0, 1, PartyFixedAssetAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyFixedAssetAssignment_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, PartyFixedAssetAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (accommodationClassEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (accommodationMapTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (fixedAssetIdentTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (fixedAssetProductTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (fixedAssetStdCostTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (fixedAssetTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (fixedAssetTypeAttrEClass,
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
		  (accommodationClassEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (accommodationClassEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (accommodationClassEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getAccommodationClass_AccommodationClassId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (accommodationMapEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getAccommodationMap_AccommodationMapId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (accommodationMapTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getAccommodationMapType_AccommodationMapTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (fixedAssetEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (fixedAssetEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (fixedAssetEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (fixedAssetEClass.getEOperations().get(3),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (fixedAssetEClass.getEOperations().get(4),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (fixedAssetEClass.getEOperations().get(5),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (fixedAssetEClass.getEOperations().get(6),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (fixedAssetEClass.getEOperations().get(7),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (fixedAssetEClass.getEOperations().get(8),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (fixedAssetEClass.getEOperations().get(9),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getFixedAsset_FixedAssetId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAsset_FixedAssetAttributes(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getFixedAsset_FixedAssetIdents(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getFixedAsset_FixedAssetMaints(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getFixedAsset_FixedAssetRegistrations(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getFixedAssetAttribute_FixedAssetId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetAttribute_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetDepMethod_DepreciationCustomMethodId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetDepMethod_FixedAssetId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetGeoPoint_FixedAssetId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetGeoPoint_GeoPointId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetGeoPoint_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetIdent_FixedAssetId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetIdent_FixedAssetIdentTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (fixedAssetIdentTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getFixedAssetIdentType_FixedAssetIdentTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetMaint_FixedAssetId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetMaint_MaintHistSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetMaintOrder_FixedAssetId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetMaintOrder_MaintHistSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetMaintOrder_OrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetMaintOrder_OrderItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetMeter_FixedAssetId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetMeter_ProductMeterTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetMeter_ReadingDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetProduct_FixedAssetId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetProduct_ProductId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetProduct_FixedAssetProductTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetProduct_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetProductType_FixedAssetProductTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetRegistration_FixedAssetId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetRegistration_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetStdCost_FixedAssetId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetStdCost_FixedAssetStdCostTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetStdCost_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (fixedAssetStdCostTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getFixedAssetStdCostType_FixedAssetStdCostTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (fixedAssetTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (fixedAssetTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (fixedAssetTypeEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getFixedAssetType_FixedAssetTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetType_FixedAssetTypeAttrs(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getFixedAssetTypeAttr_FixedAssetTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetTypeGlAccount_FixedAssetTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetTypeGlAccount_FixedAssetId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getFixedAssetTypeGlAccount_OrganizationPartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyFixedAssetAssignment_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyFixedAssetAssignment_RoleTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyFixedAssetAssignment_FixedAssetId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyFixedAssetAssignment_FromDate(),
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
		  (accommodationClassEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "AccommodationMap",
			   "route", "accommodationClassId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (accommodationClassEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "AccommodationSpot",
			   "route", "accommodationClassId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (accommodationClassEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "frame", "AccommodationClass",
			   "route", "parentClassId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAccommodationClass_ParentClassId(),
		   source,
		   new String[] {
			   "frame", "AccommodationClass"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (accommodationMapEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "WorkEffort",
			   "route", "accommodationMapId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAccommodationMap_AccommodationClassId(),
		   source,
		   new String[] {
			   "frame", "AccommodationClass"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAccommodationMap_AccommodationMapTypeId(),
		   source,
		   new String[] {
			   "frame", "AccommodationMapType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAccommodationMap_FixedAssetId(),
		   source,
		   new String[] {
			   "frame", "FixedAsset"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (accommodationMapTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "AccommodationMap",
			   "route", "accommodationMapTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (fixedAssetEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "AccommodationMap",
			   "route", "fixedAssetId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (fixedAssetEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "AccommodationSpot",
			   "route", "fixedAssetId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (fixedAssetEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "frame", "AcctgTrans",
			   "route", "fixedAssetId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (fixedAssetEClass.getEOperations().get(3),
		   source,
		   new String[] {
			   "frame", "FixedAsset",
			   "route", "parentFixedAssetId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (fixedAssetEClass.getEOperations().get(4),
		   source,
		   new String[] {
			   "frame", "CostComponent",
			   "route", "fixedAssetId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (fixedAssetEClass.getEOperations().get(5),
		   source,
		   new String[] {
			   "frame", "Delivery",
			   "route", "fixedAssetId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (fixedAssetEClass.getEOperations().get(6),
		   source,
		   new String[] {
			   "frame", "FixedAssetDepMethod",
			   "route", "fixedAssetId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (fixedAssetEClass.getEOperations().get(7),
		   source,
		   new String[] {
			   "frame", "InventoryItem",
			   "route", "fixedAssetId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (fixedAssetEClass.getEOperations().get(8),
		   source,
		   new String[] {
			   "frame", "Requirement",
			   "route", "fixedAssetId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (fixedAssetEClass.getEOperations().get(9),
		   source,
		   new String[] {
			   "frame", "WorkEffort",
			   "route", "fixedAssetId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAsset_AcquireOrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAsset_CalendarId(),
		   source,
		   new String[] {
			   "frame", "TechDataCalendar"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAsset_ClassEnumId(),
		   source,
		   new String[] {
			   "frame", "Enumeration"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAsset_FixedAssetTypeId(),
		   source,
		   new String[] {
			   "frame", "FixedAssetType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAsset_InstanceOfProductId(),
		   source,
		   new String[] {
			   "frame", "Product"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAsset_LocatedAtFacilityId(),
		   source,
		   new String[] {
			   "frame", "Facility"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAsset_ParentFixedAssetId(),
		   source,
		   new String[] {
			   "frame", "FixedAsset"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAsset_PartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAsset_RoleTypeId(),
		   source,
		   new String[] {
			   "frame", "RoleType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAsset_UomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAsset_FixedAssetAttributes(),
		   source,
		   new String[] {
			   "frame", "FixedAssetAttribute"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAsset_FixedAssetIdents(),
		   source,
		   new String[] {
			   "frame", "FixedAssetIdent"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAsset_FixedAssetMaints(),
		   source,
		   new String[] {
			   "frame", "FixedAssetMaint"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAsset_FixedAssetRegistrations(),
		   source,
		   new String[] {
			   "frame", "FixedAssetRegistration"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetAttribute_FixedAssetId(),
		   source,
		   new String[] {
			   "frame", "FixedAsset"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetDepMethod_DepreciationCustomMethodId(),
		   source,
		   new String[] {
			   "frame", "CustomMethod"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetDepMethod_FixedAssetId(),
		   source,
		   new String[] {
			   "frame", "FixedAsset"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetGeoPoint_FixedAssetId(),
		   source,
		   new String[] {
			   "frame", "FixedAsset"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetGeoPoint_GeoPointId(),
		   source,
		   new String[] {
			   "frame", "GeoPoint"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetIdent_FixedAssetId(),
		   source,
		   new String[] {
			   "frame", "FixedAsset"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetIdent_FixedAssetIdentTypeId(),
		   source,
		   new String[] {
			   "frame", "FixedAssetIdentType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (fixedAssetIdentTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "FixedAssetIdent",
			   "route", "fixedAssetIdentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetMaint_FixedAssetId(),
		   source,
		   new String[] {
			   "frame", "FixedAsset"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetMaint_IntervalMeterTypeId(),
		   source,
		   new String[] {
			   "frame", "ProductMeterType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetMaint_IntervalUomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetMaint_ProductMaintTypeId(),
		   source,
		   new String[] {
			   "frame", "ProductMaintType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetMaint_PurchaseOrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetMaint_ScheduleWorkEffortId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetMaint_StatusId(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetMaintOrder_FixedAssetId(),
		   source,
		   new String[] {
			   "frame", "FixedAsset"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetMaintOrder_OrderId(),
		   source,
		   new String[] {
			   "frame", "OrderHeader"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetMeter_ProductMeterTypeId(),
		   source,
		   new String[] {
			   "frame", "ProductMeterType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetProduct_FixedAssetId(),
		   source,
		   new String[] {
			   "frame", "FixedAsset"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetProduct_ProductId(),
		   source,
		   new String[] {
			   "frame", "Product"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetProduct_FixedAssetProductTypeId(),
		   source,
		   new String[] {
			   "frame", "FixedAssetProductType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetProduct_QuantityUomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetRegistration_FixedAssetId(),
		   source,
		   new String[] {
			   "frame", "FixedAsset"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetRegistration_GovAgencyPartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetStdCost_FixedAssetId(),
		   source,
		   new String[] {
			   "frame", "FixedAsset"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetStdCost_FixedAssetStdCostTypeId(),
		   source,
		   new String[] {
			   "frame", "FixedAssetStdCostType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetStdCost_AmountUomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (fixedAssetStdCostTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "FixedAssetStdCostType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetStdCostType_ParentTypeId(),
		   source,
		   new String[] {
			   "frame", "FixedAssetStdCostType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (fixedAssetTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "FixedAssetType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (fixedAssetTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "FixedAsset",
			   "route", "fixedAssetTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (fixedAssetTypeEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "frame", "WorkEffortFixedAssetStd",
			   "route", "fixedAssetTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetType_ParentTypeId(),
		   source,
		   new String[] {
			   "frame", "FixedAssetType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetType_FixedAssetTypeAttrs(),
		   source,
		   new String[] {
			   "frame", "FixedAssetTypeAttr"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetTypeAttr_FixedAssetTypeId(),
		   source,
		   new String[] {
			   "frame", "FixedAssetType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetTypeGlAccount_FixedAssetTypeId(),
		   source,
		   new String[] {
			   "frame", "FixedAssetType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetTypeGlAccount_FixedAssetId(),
		   source,
		   new String[] {
			   "frame", "FixedAsset"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetTypeGlAccount_OrganizationPartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetTypeGlAccount_AccDepGlAccountId(),
		   source,
		   new String[] {
			   "frame", "GlAccount"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetTypeGlAccount_AssetGlAccountId(),
		   source,
		   new String[] {
			   "frame", "GlAccount"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetTypeGlAccount_DepGlAccountId(),
		   source,
		   new String[] {
			   "frame", "GlAccount"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetTypeGlAccount_LossGlAccountId(),
		   source,
		   new String[] {
			   "frame", "GlAccount"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getFixedAssetTypeGlAccount_ProfitGlAccountId(),
		   source,
		   new String[] {
			   "frame", "GlAccount"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getPartyFixedAssetAssignment_PartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getPartyFixedAssetAssignment_RoleTypeId(),
		   source,
		   new String[] {
			   "frame", "RoleType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getPartyFixedAssetAssignment_FixedAssetId(),
		   source,
		   new String[] {
			   "frame", "FixedAsset"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getPartyFixedAssetAssignment_StatusId(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
	}

} //FixedassetPackageImpl
