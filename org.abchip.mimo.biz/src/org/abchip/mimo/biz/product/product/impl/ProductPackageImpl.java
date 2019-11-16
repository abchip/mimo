/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product.impl;

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
import org.abchip.mimo.biz.product.product.GoodIdentification;
import org.abchip.mimo.biz.product.product.GoodIdentificationType;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.product.product.ProductAssoc;
import org.abchip.mimo.biz.product.product.ProductAssocType;
import org.abchip.mimo.biz.product.product.ProductAttribute;
import org.abchip.mimo.biz.product.product.ProductCalculatedInfo;
import org.abchip.mimo.biz.product.product.ProductContent;
import org.abchip.mimo.biz.product.product.ProductContentType;
import org.abchip.mimo.biz.product.product.ProductFactory;
import org.abchip.mimo.biz.product.product.ProductGeo;
import org.abchip.mimo.biz.product.product.ProductGlAccount;
import org.abchip.mimo.biz.product.product.ProductGroupOrder;
import org.abchip.mimo.biz.product.product.ProductKeyword;
import org.abchip.mimo.biz.product.product.ProductMaint;
import org.abchip.mimo.biz.product.product.ProductMaintType;
import org.abchip.mimo.biz.product.product.ProductMeter;
import org.abchip.mimo.biz.product.product.ProductMeterType;
import org.abchip.mimo.biz.product.product.ProductPackage;
import org.abchip.mimo.biz.product.product.ProductReview;
import org.abchip.mimo.biz.product.product.ProductRole;
import org.abchip.mimo.biz.product.product.ProductSearchConstraint;
import org.abchip.mimo.biz.product.product.ProductSearchResult;
import org.abchip.mimo.biz.product.product.ProductType;
import org.abchip.mimo.biz.product.product.ProductTypeAttr;
import org.abchip.mimo.biz.product.product.VendorProduct;
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
public class ProductPackageImpl extends EPackageImpl implements ProductPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goodIdentificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goodIdentificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productAssocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productAssocTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productCalculatedInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productContentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productGeoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productGlAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productGroupOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productKeywordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productMaintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productMaintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productMeterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productMeterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productReviewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productSearchConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productSearchResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productTypeAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vendorProductEClass = null;

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
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProductPackageImpl() {
		super(eNS_URI, ProductFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProductPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProductPackage init() {
		if (isInited) return (ProductPackage)EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredProductPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ProductPackageImpl theProductPackage = registeredProductPackage instanceof ProductPackageImpl ? (ProductPackageImpl)registeredProductPackage : new ProductPackageImpl();

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
		theProductPackage.createPackageContents();
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
		theProductPackage.initializePackageContents();
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
		theProductPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProductPackage.eNS_URI, theProductPackage);
		return theProductPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGoodIdentification() {
		return goodIdentificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGoodIdentification_GoodIdentificationTypeId() {
		return (EReference)goodIdentificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGoodIdentification_ProductId() {
		return (EReference)goodIdentificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGoodIdentification_IdValue() {
		return (EAttribute)goodIdentificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGoodIdentificationType() {
		return goodIdentificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGoodIdentificationType_GoodIdentificationTypeId() {
		return (EAttribute)goodIdentificationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGoodIdentificationType_Description() {
		return (EAttribute)goodIdentificationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGoodIdentificationType_HasTable() {
		return (EAttribute)goodIdentificationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGoodIdentificationType_ParentTypeId() {
		return (EReference)goodIdentificationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGoodIdentificationType_GoodIdentifications() {
		return (EAttribute)goodIdentificationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGoodIdentificationType__ChildGoodIdentificationTypes() {
		return goodIdentificationTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ProductId() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_AmountUomTypeId() {
		return (EReference)productEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_AutoCreateKeywords() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_BillOfMaterialLevel() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_BrandName() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ChargeShipping() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Comments() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ConfigId() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_CreatedByUserLogin() {
		return (EReference)productEClass.getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_CreatedDate() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_DefaultShipmentBoxTypeId() {
		return (EReference)productEClass.getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_DepthUomId() {
		return (EReference)productEClass.getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Description() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_DetailImageUrl() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_DetailScreen() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_DiameterUomId() {
		return (EReference)productEClass.getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_FacilityId() {
		return (EReference)productEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_FixedAmount() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_HeightUomId() {
		return (EReference)productEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_InShippingBox() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_IncludeInPromotions() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_InternalName() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_IntroductionDate() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_InventoryItemTypeId() {
		return (EReference)productEClass.getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_InventoryMessage() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_IsVariant() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_IsVirtual() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_LargeImageUrl() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_LastModifiedByUserLogin() {
		return (EReference)productEClass.getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_LastModifiedDate() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_LongDescription() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_LotIdFilledIn() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_MediumImageUrl() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_OrderDecimalQuantity() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_OriginGeoId() {
		return (EReference)productEClass.getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_OriginalImageUrl() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_PiecesIncluded() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_PriceDetailText() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_PrimaryProductCategoryId() {
		return (EReference)productEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ProductDepth() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ProductDiameter() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ProductHeight() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ProductName() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ProductRating() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_ProductTypeId() {
		return (EReference)productEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ProductWeight() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ProductWidth() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_QuantityIncluded() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_QuantityUomId() {
		return (EReference)productEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_RatingTypeEnum() {
		return (EReference)productEClass.getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ReleaseDate() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_RequireAmount() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_RequireInventory() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_RequirementMethodEnumId() {
		return (EReference)productEClass.getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Reserv2ndPPPerc() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ReservMaxPersons() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ReservNthPPPerc() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Returnable() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_SalesDiscWhenNotAvail() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_SalesDiscontinuationDate() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ShippingDepth() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ShippingHeight() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ShippingWeight() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ShippingWidth() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_SmallImageUrl() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_SupportDiscontinuationDate() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Taxable() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_VirtualVariantMethodEnum() {
		return (EReference)productEClass.getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_WeightUomId() {
		return (EReference)productEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_WidthUomId() {
		return (EReference)productEClass.getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_CommunicationEventProducts() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ProductAttributes() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ProductFacilities() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ProductGeos() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ProductMaints() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_ProductMeters() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__Agreements() {
		return productEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__CartAbandonedLines() {
		return productEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__CostComponents() {
		return productEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__CustRequestItems() {
		return productEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__GoodIdentifications() {
		return productEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__InstanceOfFixedAssets() {
		return productEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__InventoryItems() {
		return productEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__InvoiceItems() {
		return productEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__OrderItems() {
		return productEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__ProductForProductManufacturingRules() {
		return productEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__ProductGroupOrders() {
		return productEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__ProductInProductManufacturingRules() {
		return productEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__ProductManufacturingRules() {
		return productEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__ProductProductConfigStatss() {
		return productEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__ProductReviews() {
		return productEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__ProductStoreSurveyAppls() {
		return productEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__ProductSubstProductManufacturingRules() {
		return productEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__QuoteItems() {
		return productEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__ReorderGuidelines() {
		return productEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__Requirements() {
		return productEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__ReturnItems() {
		return productEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__SalesForecastDetails() {
		return productEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__ShipmentItems() {
		return productEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__ShipmentReceipts() {
		return productEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__ShoppingListItems() {
		return productEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__Subscriptions() {
		return productEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductAssoc() {
		return productAssocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductAssoc_ProductId() {
		return (EReference)productAssocEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductAssoc_ProductIdTo() {
		return (EReference)productAssocEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductAssoc_ProductAssocTypeId() {
		return (EReference)productAssocEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAssoc_FromDate() {
		return (EAttribute)productAssocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductAssoc_EstimateCalcMethod() {
		return (EReference)productAssocEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAssoc_Instruction() {
		return (EAttribute)productAssocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAssoc_Quantity() {
		return (EAttribute)productAssocEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAssoc_Reason() {
		return (EAttribute)productAssocEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductAssoc_RecurrenceInfoId() {
		return (EReference)productAssocEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductAssoc_RoutingWorkEffortId() {
		return (EReference)productAssocEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAssoc_ScrapFactor() {
		return (EAttribute)productAssocEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAssoc_SequenceNum() {
		return (EAttribute)productAssocEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAssoc_ThruDate() {
		return (EAttribute)productAssocEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductAssocType() {
		return productAssocTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAssocType_ProductAssocTypeId() {
		return (EAttribute)productAssocTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAssocType_Description() {
		return (EAttribute)productAssocTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAssocType_HasTable() {
		return (EAttribute)productAssocTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductAssocType_ParentTypeId() {
		return (EReference)productAssocTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProductAssocType__ChildProductAssocTypes() {
		return productAssocTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductAttribute() {
		return productAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductAttribute_ProductId() {
		return (EReference)productAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAttribute_AttrName() {
		return (EAttribute)productAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAttribute_AttrDescription() {
		return (EAttribute)productAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAttribute_AttrType() {
		return (EAttribute)productAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAttribute_AttrValue() {
		return (EAttribute)productAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductCalculatedInfo() {
		return productCalculatedInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductCalculatedInfo_ProductId() {
		return (EReference)productCalculatedInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductCalculatedInfo_AverageCustomerRating() {
		return (EAttribute)productCalculatedInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductCalculatedInfo_TotalQuantityOrdered() {
		return (EAttribute)productCalculatedInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductCalculatedInfo_TotalTimesViewed() {
		return (EAttribute)productCalculatedInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductContent() {
		return productContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductContent_ProductId() {
		return (EReference)productContentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductContent_ContentId() {
		return (EReference)productContentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductContent_ProductContentTypeId() {
		return (EReference)productContentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductContent_FromDate() {
		return (EAttribute)productContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductContent_PurchaseFromDate() {
		return (EAttribute)productContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductContent_PurchaseThruDate() {
		return (EAttribute)productContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductContent_SequenceNum() {
		return (EAttribute)productContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductContent_ThruDate() {
		return (EAttribute)productContentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductContent_UseCountLimit() {
		return (EAttribute)productContentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductContent_UseRoleTypeId() {
		return (EReference)productContentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductContent_UseTime() {
		return (EAttribute)productContentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductContent_UseTimeUomId() {
		return (EReference)productContentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductContentType() {
		return productContentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductContentType_ProductContentTypeId() {
		return (EAttribute)productContentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductContentType_Description() {
		return (EAttribute)productContentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductContentType_HasTable() {
		return (EAttribute)productContentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductContentType_ParentTypeId() {
		return (EReference)productContentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProductContentType__ChildProductContentTypes() {
		return productContentTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductGeo() {
		return productGeoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductGeo_ProductId() {
		return (EReference)productGeoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductGeo_GeoId() {
		return (EReference)productGeoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductGeo_Description() {
		return (EAttribute)productGeoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductGeo_ProductGeoEnumId() {
		return (EReference)productGeoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductGlAccount() {
		return productGlAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductGlAccount_ProductId() {
		return (EReference)productGlAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductGlAccount_OrganizationPartyId() {
		return (EReference)productGlAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductGlAccount_GlAccountTypeId() {
		return (EReference)productGlAccountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductGlAccount_GlAccountId() {
		return (EReference)productGlAccountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductGroupOrder() {
		return productGroupOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductGroupOrder_GroupOrderId() {
		return (EAttribute)productGroupOrderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductGroupOrder_FromDate() {
		return (EAttribute)productGroupOrderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductGroupOrder_JobId() {
		return (EReference)productGroupOrderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductGroupOrder_ProductId() {
		return (EReference)productGroupOrderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductGroupOrder_ReqOrderQty() {
		return (EAttribute)productGroupOrderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductGroupOrder_SoldOrderQty() {
		return (EAttribute)productGroupOrderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductGroupOrder_StatusId() {
		return (EReference)productGroupOrderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductGroupOrder_ThruDate() {
		return (EAttribute)productGroupOrderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductKeyword() {
		return productKeywordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductKeyword_ProductId() {
		return (EReference)productKeywordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductKeyword_Keyword() {
		return (EAttribute)productKeywordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductKeyword_KeywordTypeId() {
		return (EReference)productKeywordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductKeyword_RelevancyWeight() {
		return (EAttribute)productKeywordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductKeyword_StatusId() {
		return (EReference)productKeywordEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductMaint() {
		return productMaintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductMaint_ProductId() {
		return (EReference)productMaintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductMaint_ProductMaintSeqId() {
		return (EAttribute)productMaintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductMaint_IntervalMeterTypeId() {
		return (EReference)productMaintEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductMaint_IntervalQuantity() {
		return (EAttribute)productMaintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductMaint_IntervalUomId() {
		return (EReference)productMaintEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductMaint_MaintName() {
		return (EAttribute)productMaintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductMaint_MaintTemplateWorkEffortId() {
		return (EReference)productMaintEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductMaint_ProductMaintTypeId() {
		return (EReference)productMaintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductMaint_RepeatCount() {
		return (EAttribute)productMaintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductMaintType() {
		return productMaintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductMaintType_ProductMaintTypeId() {
		return (EAttribute)productMaintTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductMaintType_Description() {
		return (EAttribute)productMaintTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductMaintType_ParentTypeId() {
		return (EReference)productMaintTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProductMaintType__ChildProductMaintTypes() {
		return productMaintTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProductMaintType__FixedAssetMaints() {
		return productMaintTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProductMaintType__ProductMaints() {
		return productMaintTypeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductMeter() {
		return productMeterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductMeter_ProductId() {
		return (EReference)productMeterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductMeter_ProductMeterTypeId() {
		return (EReference)productMeterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductMeter_MeterName() {
		return (EAttribute)productMeterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductMeter_MeterUomId() {
		return (EReference)productMeterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductMeterType() {
		return productMeterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductMeterType_ProductMeterTypeId() {
		return (EAttribute)productMeterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductMeterType_DefaultUomId() {
		return (EReference)productMeterTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProductMeterType__IntervalFixedAssetMaints() {
		return productMeterTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProductMeterType__IntervalProductMaints() {
		return productMeterTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProductMeterType__ProductMeters() {
		return productMeterTypeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductMeterType_Description() {
		return (EAttribute)productMeterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductReview() {
		return productReviewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductReview_ProductReviewId() {
		return (EAttribute)productReviewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductReview_PostedAnonymous() {
		return (EAttribute)productReviewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductReview_PostedDateTime() {
		return (EAttribute)productReviewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductReview_ProductId() {
		return (EReference)productReviewEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductReview_ProductRating() {
		return (EAttribute)productReviewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductReview_ProductReview() {
		return (EAttribute)productReviewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductReview_ProductStoreId() {
		return (EReference)productReviewEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductReview_StatusId() {
		return (EReference)productReviewEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductReview_UserLoginId() {
		return (EReference)productReviewEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductRole() {
		return productRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductRole_ProductId() {
		return (EReference)productRoleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductRole_PartyId() {
		return (EReference)productRoleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductRole_RoleTypeId() {
		return (EReference)productRoleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductRole_FromDate() {
		return (EAttribute)productRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductRole_Comments() {
		return (EAttribute)productRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductRole_SequenceNum() {
		return (EAttribute)productRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductRole_ThruDate() {
		return (EAttribute)productRoleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductSearchConstraint() {
		return productSearchConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductSearchConstraint_ProductSearchResultId() {
		return (EReference)productSearchConstraintEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchConstraint_ConstraintSeqId() {
		return (EAttribute)productSearchConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchConstraint_AnyPrefix() {
		return (EAttribute)productSearchConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchConstraint_AnySuffix() {
		return (EAttribute)productSearchConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchConstraint_ConstraintName() {
		return (EAttribute)productSearchConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchConstraint_HighValue() {
		return (EAttribute)productSearchConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchConstraint_IncludeSubCategories() {
		return (EAttribute)productSearchConstraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchConstraint_InfoString() {
		return (EAttribute)productSearchConstraintEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchConstraint_IsAnd() {
		return (EAttribute)productSearchConstraintEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchConstraint_LowValue() {
		return (EAttribute)productSearchConstraintEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchConstraint_RemoveStems() {
		return (EAttribute)productSearchConstraintEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductSearchResult() {
		return productSearchResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchResult_ProductSearchResultId() {
		return (EAttribute)productSearchResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchResult_IsAscending() {
		return (EAttribute)productSearchResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchResult_NumResults() {
		return (EAttribute)productSearchResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchResult_OrderByName() {
		return (EAttribute)productSearchResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchResult_SearchDate() {
		return (EAttribute)productSearchResultEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchResult_SecondsTotal() {
		return (EAttribute)productSearchResultEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchResult_VisitId() {
		return (EAttribute)productSearchResultEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductSearchResult_ProductSearchConstraints() {
		return (EAttribute)productSearchResultEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductType() {
		return productTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductType_ProductTypeId() {
		return (EAttribute)productTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductType_Description() {
		return (EAttribute)productTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductType_HasTable() {
		return (EAttribute)productTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductType_IsDigital() {
		return (EAttribute)productTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductType_IsPhysical() {
		return (EAttribute)productTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductType_ParentTypeId() {
		return (EReference)productTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductType_ProductTypeAttrs() {
		return (EAttribute)productTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProductType__ChildProductTypes() {
		return productTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProductType__Products() {
		return productTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductTypeAttr() {
		return productTypeAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductTypeAttr_ProductTypeId() {
		return (EReference)productTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductTypeAttr_AttrName() {
		return (EAttribute)productTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductTypeAttr_Description() {
		return (EAttribute)productTypeAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVendorProduct() {
		return vendorProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVendorProduct_ProductId() {
		return (EReference)vendorProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVendorProduct_VendorPartyId() {
		return (EReference)vendorProductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVendorProduct_ProductStoreGroupId() {
		return (EReference)vendorProductEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFactory getProductFactory() {
		return (ProductFactory)getEFactoryInstance();
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
		goodIdentificationEClass = createEClass(GOOD_IDENTIFICATION);
		createEAttribute(goodIdentificationEClass, GOOD_IDENTIFICATION__ID_VALUE);
		createEReference(goodIdentificationEClass, GOOD_IDENTIFICATION__GOOD_IDENTIFICATION_TYPE_ID);
		createEReference(goodIdentificationEClass, GOOD_IDENTIFICATION__PRODUCT_ID);

		goodIdentificationTypeEClass = createEClass(GOOD_IDENTIFICATION_TYPE);
		createEAttribute(goodIdentificationTypeEClass, GOOD_IDENTIFICATION_TYPE__GOOD_IDENTIFICATION_TYPE_ID);
		createEAttribute(goodIdentificationTypeEClass, GOOD_IDENTIFICATION_TYPE__DESCRIPTION);
		createEAttribute(goodIdentificationTypeEClass, GOOD_IDENTIFICATION_TYPE__HAS_TABLE);
		createEReference(goodIdentificationTypeEClass, GOOD_IDENTIFICATION_TYPE__PARENT_TYPE_ID);
		createEAttribute(goodIdentificationTypeEClass, GOOD_IDENTIFICATION_TYPE__GOOD_IDENTIFICATIONS);
		createEOperation(goodIdentificationTypeEClass, GOOD_IDENTIFICATION_TYPE___CHILD_GOOD_IDENTIFICATION_TYPES);

		productEClass = createEClass(PRODUCT);
		createEAttribute(productEClass, PRODUCT__PRODUCT_ID);
		createEAttribute(productEClass, PRODUCT__AUTO_CREATE_KEYWORDS);
		createEAttribute(productEClass, PRODUCT__BILL_OF_MATERIAL_LEVEL);
		createEAttribute(productEClass, PRODUCT__BRAND_NAME);
		createEAttribute(productEClass, PRODUCT__CHARGE_SHIPPING);
		createEAttribute(productEClass, PRODUCT__COMMENTS);
		createEAttribute(productEClass, PRODUCT__CONFIG_ID);
		createEAttribute(productEClass, PRODUCT__CREATED_DATE);
		createEAttribute(productEClass, PRODUCT__DESCRIPTION);
		createEAttribute(productEClass, PRODUCT__DETAIL_IMAGE_URL);
		createEAttribute(productEClass, PRODUCT__DETAIL_SCREEN);
		createEAttribute(productEClass, PRODUCT__FIXED_AMOUNT);
		createEAttribute(productEClass, PRODUCT__IN_SHIPPING_BOX);
		createEAttribute(productEClass, PRODUCT__INCLUDE_IN_PROMOTIONS);
		createEAttribute(productEClass, PRODUCT__INTERNAL_NAME);
		createEAttribute(productEClass, PRODUCT__INTRODUCTION_DATE);
		createEAttribute(productEClass, PRODUCT__INVENTORY_MESSAGE);
		createEAttribute(productEClass, PRODUCT__IS_VARIANT);
		createEAttribute(productEClass, PRODUCT__IS_VIRTUAL);
		createEAttribute(productEClass, PRODUCT__LARGE_IMAGE_URL);
		createEAttribute(productEClass, PRODUCT__LAST_MODIFIED_DATE);
		createEAttribute(productEClass, PRODUCT__LONG_DESCRIPTION);
		createEAttribute(productEClass, PRODUCT__LOT_ID_FILLED_IN);
		createEAttribute(productEClass, PRODUCT__MEDIUM_IMAGE_URL);
		createEAttribute(productEClass, PRODUCT__ORDER_DECIMAL_QUANTITY);
		createEAttribute(productEClass, PRODUCT__ORIGINAL_IMAGE_URL);
		createEAttribute(productEClass, PRODUCT__PIECES_INCLUDED);
		createEAttribute(productEClass, PRODUCT__PRICE_DETAIL_TEXT);
		createEAttribute(productEClass, PRODUCT__PRODUCT_DEPTH);
		createEAttribute(productEClass, PRODUCT__PRODUCT_DIAMETER);
		createEAttribute(productEClass, PRODUCT__PRODUCT_HEIGHT);
		createEAttribute(productEClass, PRODUCT__PRODUCT_NAME);
		createEAttribute(productEClass, PRODUCT__PRODUCT_RATING);
		createEAttribute(productEClass, PRODUCT__PRODUCT_WEIGHT);
		createEAttribute(productEClass, PRODUCT__PRODUCT_WIDTH);
		createEAttribute(productEClass, PRODUCT__QUANTITY_INCLUDED);
		createEAttribute(productEClass, PRODUCT__RELEASE_DATE);
		createEAttribute(productEClass, PRODUCT__REQUIRE_AMOUNT);
		createEAttribute(productEClass, PRODUCT__REQUIRE_INVENTORY);
		createEAttribute(productEClass, PRODUCT__RESERV2ND_PP_PERC);
		createEAttribute(productEClass, PRODUCT__RESERV_MAX_PERSONS);
		createEAttribute(productEClass, PRODUCT__RESERV_NTH_PP_PERC);
		createEAttribute(productEClass, PRODUCT__RETURNABLE);
		createEAttribute(productEClass, PRODUCT__SALES_DISC_WHEN_NOT_AVAIL);
		createEAttribute(productEClass, PRODUCT__SALES_DISCONTINUATION_DATE);
		createEAttribute(productEClass, PRODUCT__SHIPPING_DEPTH);
		createEAttribute(productEClass, PRODUCT__SHIPPING_HEIGHT);
		createEAttribute(productEClass, PRODUCT__SHIPPING_WEIGHT);
		createEAttribute(productEClass, PRODUCT__SHIPPING_WIDTH);
		createEAttribute(productEClass, PRODUCT__SMALL_IMAGE_URL);
		createEAttribute(productEClass, PRODUCT__SUPPORT_DISCONTINUATION_DATE);
		createEAttribute(productEClass, PRODUCT__TAXABLE);
		createEReference(productEClass, PRODUCT__PRODUCT_TYPE_ID);
		createEReference(productEClass, PRODUCT__PRIMARY_PRODUCT_CATEGORY_ID);
		createEReference(productEClass, PRODUCT__FACILITY_ID);
		createEReference(productEClass, PRODUCT__QUANTITY_UOM_ID);
		createEReference(productEClass, PRODUCT__AMOUNT_UOM_TYPE_ID);
		createEReference(productEClass, PRODUCT__WEIGHT_UOM_ID);
		createEReference(productEClass, PRODUCT__HEIGHT_UOM_ID);
		createEReference(productEClass, PRODUCT__WIDTH_UOM_ID);
		createEReference(productEClass, PRODUCT__DEPTH_UOM_ID);
		createEReference(productEClass, PRODUCT__DIAMETER_UOM_ID);
		createEReference(productEClass, PRODUCT__VIRTUAL_VARIANT_METHOD_ENUM);
		createEReference(productEClass, PRODUCT__RATING_TYPE_ENUM);
		createEReference(productEClass, PRODUCT__REQUIREMENT_METHOD_ENUM_ID);
		createEReference(productEClass, PRODUCT__ORIGIN_GEO_ID);
		createEReference(productEClass, PRODUCT__CREATED_BY_USER_LOGIN);
		createEReference(productEClass, PRODUCT__LAST_MODIFIED_BY_USER_LOGIN);
		createEReference(productEClass, PRODUCT__DEFAULT_SHIPMENT_BOX_TYPE_ID);
		createEReference(productEClass, PRODUCT__INVENTORY_ITEM_TYPE_ID);
		createEAttribute(productEClass, PRODUCT__COMMUNICATION_EVENT_PRODUCTS);
		createEAttribute(productEClass, PRODUCT__PRODUCT_ATTRIBUTES);
		createEAttribute(productEClass, PRODUCT__PRODUCT_FACILITIES);
		createEAttribute(productEClass, PRODUCT__PRODUCT_GEOS);
		createEAttribute(productEClass, PRODUCT__PRODUCT_MAINTS);
		createEAttribute(productEClass, PRODUCT__PRODUCT_METERS);
		createEOperation(productEClass, PRODUCT___AGREEMENTS);
		createEOperation(productEClass, PRODUCT___CART_ABANDONED_LINES);
		createEOperation(productEClass, PRODUCT___COST_COMPONENTS);
		createEOperation(productEClass, PRODUCT___CUST_REQUEST_ITEMS);
		createEOperation(productEClass, PRODUCT___GOOD_IDENTIFICATIONS);
		createEOperation(productEClass, PRODUCT___INSTANCE_OF_FIXED_ASSETS);
		createEOperation(productEClass, PRODUCT___INVENTORY_ITEMS);
		createEOperation(productEClass, PRODUCT___INVOICE_ITEMS);
		createEOperation(productEClass, PRODUCT___ORDER_ITEMS);
		createEOperation(productEClass, PRODUCT___PRODUCT_FOR_PRODUCT_MANUFACTURING_RULES);
		createEOperation(productEClass, PRODUCT___PRODUCT_GROUP_ORDERS);
		createEOperation(productEClass, PRODUCT___PRODUCT_IN_PRODUCT_MANUFACTURING_RULES);
		createEOperation(productEClass, PRODUCT___PRODUCT_MANUFACTURING_RULES);
		createEOperation(productEClass, PRODUCT___PRODUCT_PRODUCT_CONFIG_STATSS);
		createEOperation(productEClass, PRODUCT___PRODUCT_REVIEWS);
		createEOperation(productEClass, PRODUCT___PRODUCT_STORE_SURVEY_APPLS);
		createEOperation(productEClass, PRODUCT___PRODUCT_SUBST_PRODUCT_MANUFACTURING_RULES);
		createEOperation(productEClass, PRODUCT___QUOTE_ITEMS);
		createEOperation(productEClass, PRODUCT___REORDER_GUIDELINES);
		createEOperation(productEClass, PRODUCT___REQUIREMENTS);
		createEOperation(productEClass, PRODUCT___RETURN_ITEMS);
		createEOperation(productEClass, PRODUCT___SALES_FORECAST_DETAILS);
		createEOperation(productEClass, PRODUCT___SHIPMENT_ITEMS);
		createEOperation(productEClass, PRODUCT___SHIPMENT_RECEIPTS);
		createEOperation(productEClass, PRODUCT___SHOPPING_LIST_ITEMS);
		createEOperation(productEClass, PRODUCT___SUBSCRIPTIONS);

		productAssocEClass = createEClass(PRODUCT_ASSOC);
		createEAttribute(productAssocEClass, PRODUCT_ASSOC__FROM_DATE);
		createEAttribute(productAssocEClass, PRODUCT_ASSOC__INSTRUCTION);
		createEAttribute(productAssocEClass, PRODUCT_ASSOC__QUANTITY);
		createEAttribute(productAssocEClass, PRODUCT_ASSOC__REASON);
		createEAttribute(productAssocEClass, PRODUCT_ASSOC__SCRAP_FACTOR);
		createEAttribute(productAssocEClass, PRODUCT_ASSOC__SEQUENCE_NUM);
		createEAttribute(productAssocEClass, PRODUCT_ASSOC__THRU_DATE);
		createEReference(productAssocEClass, PRODUCT_ASSOC__PRODUCT_ASSOC_TYPE_ID);
		createEReference(productAssocEClass, PRODUCT_ASSOC__PRODUCT_ID);
		createEReference(productAssocEClass, PRODUCT_ASSOC__PRODUCT_ID_TO);
		createEReference(productAssocEClass, PRODUCT_ASSOC__ROUTING_WORK_EFFORT_ID);
		createEReference(productAssocEClass, PRODUCT_ASSOC__ESTIMATE_CALC_METHOD);
		createEReference(productAssocEClass, PRODUCT_ASSOC__RECURRENCE_INFO_ID);

		productAssocTypeEClass = createEClass(PRODUCT_ASSOC_TYPE);
		createEAttribute(productAssocTypeEClass, PRODUCT_ASSOC_TYPE__PRODUCT_ASSOC_TYPE_ID);
		createEAttribute(productAssocTypeEClass, PRODUCT_ASSOC_TYPE__DESCRIPTION);
		createEAttribute(productAssocTypeEClass, PRODUCT_ASSOC_TYPE__HAS_TABLE);
		createEReference(productAssocTypeEClass, PRODUCT_ASSOC_TYPE__PARENT_TYPE_ID);
		createEOperation(productAssocTypeEClass, PRODUCT_ASSOC_TYPE___CHILD_PRODUCT_ASSOC_TYPES);

		productAttributeEClass = createEClass(PRODUCT_ATTRIBUTE);
		createEAttribute(productAttributeEClass, PRODUCT_ATTRIBUTE__ATTR_NAME);
		createEAttribute(productAttributeEClass, PRODUCT_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(productAttributeEClass, PRODUCT_ATTRIBUTE__ATTR_TYPE);
		createEAttribute(productAttributeEClass, PRODUCT_ATTRIBUTE__ATTR_VALUE);
		createEReference(productAttributeEClass, PRODUCT_ATTRIBUTE__PRODUCT_ID);

		productCalculatedInfoEClass = createEClass(PRODUCT_CALCULATED_INFO);
		createEAttribute(productCalculatedInfoEClass, PRODUCT_CALCULATED_INFO__AVERAGE_CUSTOMER_RATING);
		createEAttribute(productCalculatedInfoEClass, PRODUCT_CALCULATED_INFO__TOTAL_QUANTITY_ORDERED);
		createEAttribute(productCalculatedInfoEClass, PRODUCT_CALCULATED_INFO__TOTAL_TIMES_VIEWED);
		createEReference(productCalculatedInfoEClass, PRODUCT_CALCULATED_INFO__PRODUCT_ID);

		productContentEClass = createEClass(PRODUCT_CONTENT);
		createEAttribute(productContentEClass, PRODUCT_CONTENT__FROM_DATE);
		createEAttribute(productContentEClass, PRODUCT_CONTENT__PURCHASE_FROM_DATE);
		createEAttribute(productContentEClass, PRODUCT_CONTENT__PURCHASE_THRU_DATE);
		createEAttribute(productContentEClass, PRODUCT_CONTENT__SEQUENCE_NUM);
		createEAttribute(productContentEClass, PRODUCT_CONTENT__THRU_DATE);
		createEAttribute(productContentEClass, PRODUCT_CONTENT__USE_COUNT_LIMIT);
		createEAttribute(productContentEClass, PRODUCT_CONTENT__USE_TIME);
		createEReference(productContentEClass, PRODUCT_CONTENT__PRODUCT_ID);
		createEReference(productContentEClass, PRODUCT_CONTENT__CONTENT_ID);
		createEReference(productContentEClass, PRODUCT_CONTENT__PRODUCT_CONTENT_TYPE_ID);
		createEReference(productContentEClass, PRODUCT_CONTENT__USE_ROLE_TYPE_ID);
		createEReference(productContentEClass, PRODUCT_CONTENT__USE_TIME_UOM_ID);

		productContentTypeEClass = createEClass(PRODUCT_CONTENT_TYPE);
		createEAttribute(productContentTypeEClass, PRODUCT_CONTENT_TYPE__PRODUCT_CONTENT_TYPE_ID);
		createEAttribute(productContentTypeEClass, PRODUCT_CONTENT_TYPE__DESCRIPTION);
		createEAttribute(productContentTypeEClass, PRODUCT_CONTENT_TYPE__HAS_TABLE);
		createEReference(productContentTypeEClass, PRODUCT_CONTENT_TYPE__PARENT_TYPE_ID);
		createEOperation(productContentTypeEClass, PRODUCT_CONTENT_TYPE___CHILD_PRODUCT_CONTENT_TYPES);

		productGeoEClass = createEClass(PRODUCT_GEO);
		createEAttribute(productGeoEClass, PRODUCT_GEO__DESCRIPTION);
		createEReference(productGeoEClass, PRODUCT_GEO__PRODUCT_ID);
		createEReference(productGeoEClass, PRODUCT_GEO__GEO_ID);
		createEReference(productGeoEClass, PRODUCT_GEO__PRODUCT_GEO_ENUM_ID);

		productGlAccountEClass = createEClass(PRODUCT_GL_ACCOUNT);
		createEReference(productGlAccountEClass, PRODUCT_GL_ACCOUNT__PRODUCT_ID);
		createEReference(productGlAccountEClass, PRODUCT_GL_ACCOUNT__ORGANIZATION_PARTY_ID);
		createEReference(productGlAccountEClass, PRODUCT_GL_ACCOUNT__GL_ACCOUNT_TYPE_ID);
		createEReference(productGlAccountEClass, PRODUCT_GL_ACCOUNT__GL_ACCOUNT_ID);

		productGroupOrderEClass = createEClass(PRODUCT_GROUP_ORDER);
		createEAttribute(productGroupOrderEClass, PRODUCT_GROUP_ORDER__GROUP_ORDER_ID);
		createEAttribute(productGroupOrderEClass, PRODUCT_GROUP_ORDER__FROM_DATE);
		createEAttribute(productGroupOrderEClass, PRODUCT_GROUP_ORDER__REQ_ORDER_QTY);
		createEAttribute(productGroupOrderEClass, PRODUCT_GROUP_ORDER__SOLD_ORDER_QTY);
		createEAttribute(productGroupOrderEClass, PRODUCT_GROUP_ORDER__THRU_DATE);
		createEReference(productGroupOrderEClass, PRODUCT_GROUP_ORDER__PRODUCT_ID);
		createEReference(productGroupOrderEClass, PRODUCT_GROUP_ORDER__STATUS_ID);
		createEReference(productGroupOrderEClass, PRODUCT_GROUP_ORDER__JOB_ID);

		productKeywordEClass = createEClass(PRODUCT_KEYWORD);
		createEAttribute(productKeywordEClass, PRODUCT_KEYWORD__KEYWORD);
		createEAttribute(productKeywordEClass, PRODUCT_KEYWORD__RELEVANCY_WEIGHT);
		createEReference(productKeywordEClass, PRODUCT_KEYWORD__PRODUCT_ID);
		createEReference(productKeywordEClass, PRODUCT_KEYWORD__KEYWORD_TYPE_ID);
		createEReference(productKeywordEClass, PRODUCT_KEYWORD__STATUS_ID);

		productMaintEClass = createEClass(PRODUCT_MAINT);
		createEAttribute(productMaintEClass, PRODUCT_MAINT__PRODUCT_MAINT_SEQ_ID);
		createEAttribute(productMaintEClass, PRODUCT_MAINT__INTERVAL_QUANTITY);
		createEAttribute(productMaintEClass, PRODUCT_MAINT__MAINT_NAME);
		createEAttribute(productMaintEClass, PRODUCT_MAINT__REPEAT_COUNT);
		createEReference(productMaintEClass, PRODUCT_MAINT__PRODUCT_ID);
		createEReference(productMaintEClass, PRODUCT_MAINT__PRODUCT_MAINT_TYPE_ID);
		createEReference(productMaintEClass, PRODUCT_MAINT__MAINT_TEMPLATE_WORK_EFFORT_ID);
		createEReference(productMaintEClass, PRODUCT_MAINT__INTERVAL_UOM_ID);
		createEReference(productMaintEClass, PRODUCT_MAINT__INTERVAL_METER_TYPE_ID);

		productMaintTypeEClass = createEClass(PRODUCT_MAINT_TYPE);
		createEAttribute(productMaintTypeEClass, PRODUCT_MAINT_TYPE__PRODUCT_MAINT_TYPE_ID);
		createEAttribute(productMaintTypeEClass, PRODUCT_MAINT_TYPE__DESCRIPTION);
		createEReference(productMaintTypeEClass, PRODUCT_MAINT_TYPE__PARENT_TYPE_ID);
		createEOperation(productMaintTypeEClass, PRODUCT_MAINT_TYPE___CHILD_PRODUCT_MAINT_TYPES);
		createEOperation(productMaintTypeEClass, PRODUCT_MAINT_TYPE___FIXED_ASSET_MAINTS);
		createEOperation(productMaintTypeEClass, PRODUCT_MAINT_TYPE___PRODUCT_MAINTS);

		productMeterEClass = createEClass(PRODUCT_METER);
		createEAttribute(productMeterEClass, PRODUCT_METER__METER_NAME);
		createEReference(productMeterEClass, PRODUCT_METER__PRODUCT_ID);
		createEReference(productMeterEClass, PRODUCT_METER__PRODUCT_METER_TYPE_ID);
		createEReference(productMeterEClass, PRODUCT_METER__METER_UOM_ID);

		productMeterTypeEClass = createEClass(PRODUCT_METER_TYPE);
		createEAttribute(productMeterTypeEClass, PRODUCT_METER_TYPE__PRODUCT_METER_TYPE_ID);
		createEAttribute(productMeterTypeEClass, PRODUCT_METER_TYPE__DESCRIPTION);
		createEReference(productMeterTypeEClass, PRODUCT_METER_TYPE__DEFAULT_UOM_ID);
		createEOperation(productMeterTypeEClass, PRODUCT_METER_TYPE___INTERVAL_FIXED_ASSET_MAINTS);
		createEOperation(productMeterTypeEClass, PRODUCT_METER_TYPE___INTERVAL_PRODUCT_MAINTS);
		createEOperation(productMeterTypeEClass, PRODUCT_METER_TYPE___PRODUCT_METERS);

		productReviewEClass = createEClass(PRODUCT_REVIEW);
		createEAttribute(productReviewEClass, PRODUCT_REVIEW__PRODUCT_REVIEW_ID);
		createEAttribute(productReviewEClass, PRODUCT_REVIEW__POSTED_ANONYMOUS);
		createEAttribute(productReviewEClass, PRODUCT_REVIEW__POSTED_DATE_TIME);
		createEAttribute(productReviewEClass, PRODUCT_REVIEW__PRODUCT_RATING);
		createEAttribute(productReviewEClass, PRODUCT_REVIEW__PRODUCT_REVIEW);
		createEReference(productReviewEClass, PRODUCT_REVIEW__PRODUCT_STORE_ID);
		createEReference(productReviewEClass, PRODUCT_REVIEW__PRODUCT_ID);
		createEReference(productReviewEClass, PRODUCT_REVIEW__USER_LOGIN_ID);
		createEReference(productReviewEClass, PRODUCT_REVIEW__STATUS_ID);

		productRoleEClass = createEClass(PRODUCT_ROLE);
		createEAttribute(productRoleEClass, PRODUCT_ROLE__FROM_DATE);
		createEAttribute(productRoleEClass, PRODUCT_ROLE__COMMENTS);
		createEAttribute(productRoleEClass, PRODUCT_ROLE__SEQUENCE_NUM);
		createEAttribute(productRoleEClass, PRODUCT_ROLE__THRU_DATE);
		createEReference(productRoleEClass, PRODUCT_ROLE__PARTY_ID);
		createEReference(productRoleEClass, PRODUCT_ROLE__ROLE_TYPE_ID);
		createEReference(productRoleEClass, PRODUCT_ROLE__PRODUCT_ID);

		productSearchConstraintEClass = createEClass(PRODUCT_SEARCH_CONSTRAINT);
		createEAttribute(productSearchConstraintEClass, PRODUCT_SEARCH_CONSTRAINT__CONSTRAINT_SEQ_ID);
		createEAttribute(productSearchConstraintEClass, PRODUCT_SEARCH_CONSTRAINT__ANY_PREFIX);
		createEAttribute(productSearchConstraintEClass, PRODUCT_SEARCH_CONSTRAINT__ANY_SUFFIX);
		createEAttribute(productSearchConstraintEClass, PRODUCT_SEARCH_CONSTRAINT__CONSTRAINT_NAME);
		createEAttribute(productSearchConstraintEClass, PRODUCT_SEARCH_CONSTRAINT__HIGH_VALUE);
		createEAttribute(productSearchConstraintEClass, PRODUCT_SEARCH_CONSTRAINT__INCLUDE_SUB_CATEGORIES);
		createEAttribute(productSearchConstraintEClass, PRODUCT_SEARCH_CONSTRAINT__INFO_STRING);
		createEAttribute(productSearchConstraintEClass, PRODUCT_SEARCH_CONSTRAINT__IS_AND);
		createEAttribute(productSearchConstraintEClass, PRODUCT_SEARCH_CONSTRAINT__LOW_VALUE);
		createEAttribute(productSearchConstraintEClass, PRODUCT_SEARCH_CONSTRAINT__REMOVE_STEMS);
		createEReference(productSearchConstraintEClass, PRODUCT_SEARCH_CONSTRAINT__PRODUCT_SEARCH_RESULT_ID);

		productSearchResultEClass = createEClass(PRODUCT_SEARCH_RESULT);
		createEAttribute(productSearchResultEClass, PRODUCT_SEARCH_RESULT__PRODUCT_SEARCH_RESULT_ID);
		createEAttribute(productSearchResultEClass, PRODUCT_SEARCH_RESULT__IS_ASCENDING);
		createEAttribute(productSearchResultEClass, PRODUCT_SEARCH_RESULT__NUM_RESULTS);
		createEAttribute(productSearchResultEClass, PRODUCT_SEARCH_RESULT__ORDER_BY_NAME);
		createEAttribute(productSearchResultEClass, PRODUCT_SEARCH_RESULT__SEARCH_DATE);
		createEAttribute(productSearchResultEClass, PRODUCT_SEARCH_RESULT__SECONDS_TOTAL);
		createEAttribute(productSearchResultEClass, PRODUCT_SEARCH_RESULT__VISIT_ID);
		createEAttribute(productSearchResultEClass, PRODUCT_SEARCH_RESULT__PRODUCT_SEARCH_CONSTRAINTS);

		productTypeEClass = createEClass(PRODUCT_TYPE);
		createEAttribute(productTypeEClass, PRODUCT_TYPE__PRODUCT_TYPE_ID);
		createEAttribute(productTypeEClass, PRODUCT_TYPE__DESCRIPTION);
		createEAttribute(productTypeEClass, PRODUCT_TYPE__HAS_TABLE);
		createEAttribute(productTypeEClass, PRODUCT_TYPE__IS_DIGITAL);
		createEAttribute(productTypeEClass, PRODUCT_TYPE__IS_PHYSICAL);
		createEReference(productTypeEClass, PRODUCT_TYPE__PARENT_TYPE_ID);
		createEAttribute(productTypeEClass, PRODUCT_TYPE__PRODUCT_TYPE_ATTRS);
		createEOperation(productTypeEClass, PRODUCT_TYPE___CHILD_PRODUCT_TYPES);
		createEOperation(productTypeEClass, PRODUCT_TYPE___PRODUCTS);

		productTypeAttrEClass = createEClass(PRODUCT_TYPE_ATTR);
		createEAttribute(productTypeAttrEClass, PRODUCT_TYPE_ATTR__ATTR_NAME);
		createEAttribute(productTypeAttrEClass, PRODUCT_TYPE_ATTR__DESCRIPTION);
		createEReference(productTypeAttrEClass, PRODUCT_TYPE_ATTR__PRODUCT_TYPE_ID);

		vendorProductEClass = createEClass(VENDOR_PRODUCT);
		createEReference(vendorProductEClass, VENDOR_PRODUCT__PRODUCT_ID);
		createEReference(vendorProductEClass, VENDOR_PRODUCT__VENDOR_PARTY_ID);
		createEReference(vendorProductEClass, VENDOR_PRODUCT__PRODUCT_STORE_GROUP_ID);
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
		CategoryPackage theCategoryPackage = (CategoryPackage)EPackage.Registry.INSTANCE.getEPackage(CategoryPackage.eNS_URI);
		FacilityPackage theFacilityPackage = (FacilityPackage)EPackage.Registry.INSTANCE.getEPackage(FacilityPackage.eNS_URI);
		UomPackage theUomPackage = (UomPackage)EPackage.Registry.INSTANCE.getEPackage(UomPackage.eNS_URI);
		EnumPackage theEnumPackage = (EnumPackage)EPackage.Registry.INSTANCE.getEPackage(EnumPackage.eNS_URI);
		GeoPackage theGeoPackage = (GeoPackage)EPackage.Registry.INSTANCE.getEPackage(GeoPackage.eNS_URI);
		LoginPackage theLoginPackage = (LoginPackage)EPackage.Registry.INSTANCE.getEPackage(LoginPackage.eNS_URI);
		Shipment_Package theShipment_Package = (Shipment_Package)EPackage.Registry.INSTANCE.getEPackage(Shipment_Package.eNS_URI);
		InventoryPackage theInventoryPackage = (InventoryPackage)EPackage.Registry.INSTANCE.getEPackage(InventoryPackage.eNS_URI);
		WorkeffortPackage theWorkeffortPackage = (WorkeffortPackage)EPackage.Registry.INSTANCE.getEPackage(WorkeffortPackage.eNS_URI);
		MethodPackage theMethodPackage = (MethodPackage)EPackage.Registry.INSTANCE.getEPackage(MethodPackage.eNS_URI);
		SchedulePackage theSchedulePackage = (SchedulePackage)EPackage.Registry.INSTANCE.getEPackage(SchedulePackage.eNS_URI);
		ContentPackage theContentPackage = (ContentPackage)EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);
		PartyPackage thePartyPackage = (PartyPackage)EPackage.Registry.INSTANCE.getEPackage(PartyPackage.eNS_URI);
		LedgerPackage theLedgerPackage = (LedgerPackage)EPackage.Registry.INSTANCE.getEPackage(LedgerPackage.eNS_URI);
		StatusPackage theStatusPackage = (StatusPackage)EPackage.Registry.INSTANCE.getEPackage(StatusPackage.eNS_URI);
		StorePackage theStorePackage = (StorePackage)EPackage.Registry.INSTANCE.getEPackage(StorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		EGenericType g2 = createEGenericType(this.getGoodIdentificationType());
		g1.getETypeArguments().add(g2);
		goodIdentificationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getGoodIdentification());
		g1.getETypeArguments().add(g2);
		goodIdentificationTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getProductType());
		g1.getETypeArguments().add(g2);
		productEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getProductAssocType());
		g1.getETypeArguments().add(g2);
		productAssocEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getProductAssoc());
		g1.getETypeArguments().add(g2);
		productAssocTypeEClass.getEGenericSuperTypes().add(g1);
		productAttributeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		productCalculatedInfoEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getProductContentType());
		g1.getETypeArguments().add(g2);
		productContentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getProductContent());
		g1.getETypeArguments().add(g2);
		productContentTypeEClass.getEGenericSuperTypes().add(g1);
		productGeoEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		productGlAccountEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		productGroupOrderEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		productKeywordEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getProductMaintType());
		g1.getETypeArguments().add(g2);
		productMaintEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getProductMaint());
		g1.getETypeArguments().add(g2);
		productMaintTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getProductMeterType());
		g1.getETypeArguments().add(g2);
		productMeterEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getProductMeter());
		g1.getETypeArguments().add(g2);
		productMeterTypeEClass.getEGenericSuperTypes().add(g1);
		productReviewEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		productRoleEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		productSearchConstraintEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		productSearchResultEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getProduct());
		g1.getETypeArguments().add(g2);
		productTypeEClass.getEGenericSuperTypes().add(g1);
		productTypeAttrEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		vendorProductEClass.getESuperTypes().add(theBizPackage.getBizEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(goodIdentificationEClass, GoodIdentification.class, "GoodIdentification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoodIdentification_IdValue(), ecorePackage.getEString(), "idValue", null, 0, 1, GoodIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoodIdentification_GoodIdentificationTypeId(), this.getGoodIdentificationType(), null, "goodIdentificationTypeId", null, 0, 1, GoodIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGoodIdentification_GoodIdentificationTypeId().getEKeys().add(this.getGoodIdentificationType_GoodIdentificationTypeId());
		initEReference(getGoodIdentification_ProductId(), this.getProduct(), null, "productId", null, 0, 1, GoodIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGoodIdentification_ProductId().getEKeys().add(this.getProduct_ProductId());

		initEClass(goodIdentificationTypeEClass, GoodIdentificationType.class, "GoodIdentificationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoodIdentificationType_GoodIdentificationTypeId(), ecorePackage.getEString(), "goodIdentificationTypeId", null, 1, 1, GoodIdentificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoodIdentificationType_Description(), ecorePackage.getEString(), "description", null, 0, 1, GoodIdentificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoodIdentificationType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, GoodIdentificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoodIdentificationType_ParentTypeId(), this.getGoodIdentificationType(), null, "parentTypeId", null, 0, 1, GoodIdentificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGoodIdentificationType_ParentTypeId().getEKeys().add(this.getGoodIdentificationType_GoodIdentificationTypeId());
		initEAttribute(getGoodIdentificationType_GoodIdentifications(), ecorePackage.getEString(), "goodIdentifications", null, 0, -1, GoodIdentificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGoodIdentificationType__ChildGoodIdentificationTypes(), ecorePackage.getEString(), "childGoodIdentificationTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProduct_ProductId(), ecorePackage.getEString(), "productId", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_AutoCreateKeywords(), ecorePackage.getEBoolean(), "autoCreateKeywords", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_BillOfMaterialLevel(), ecorePackage.getELong(), "billOfMaterialLevel", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_BrandName(), ecorePackage.getEString(), "brandName", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ChargeShipping(), ecorePackage.getEBoolean(), "chargeShipping", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ConfigId(), ecorePackage.getEString(), "configId", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_CreatedDate(), ecorePackage.getEDate(), "createdDate", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_Description(), ecorePackage.getEString(), "description", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_DetailImageUrl(), ecorePackage.getEString(), "detailImageUrl", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_DetailScreen(), ecorePackage.getEString(), "detailScreen", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_FixedAmount(), ecorePackage.getEBigDecimal(), "fixedAmount", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_InShippingBox(), ecorePackage.getEBoolean(), "inShippingBox", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_IncludeInPromotions(), ecorePackage.getEBoolean(), "includeInPromotions", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_InternalName(), ecorePackage.getEString(), "internalName", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_IntroductionDate(), ecorePackage.getEDate(), "introductionDate", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_InventoryMessage(), ecorePackage.getEString(), "inventoryMessage", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_IsVariant(), ecorePackage.getEBoolean(), "isVariant", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_IsVirtual(), ecorePackage.getEBoolean(), "isVirtual", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_LargeImageUrl(), ecorePackage.getEString(), "largeImageUrl", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_LastModifiedDate(), ecorePackage.getEDate(), "lastModifiedDate", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_LongDescription(), ecorePackage.getEString(), "longDescription", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_LotIdFilledIn(), ecorePackage.getEString(), "lotIdFilledIn", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_MediumImageUrl(), ecorePackage.getEString(), "mediumImageUrl", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_OrderDecimalQuantity(), ecorePackage.getEBoolean(), "orderDecimalQuantity", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_OriginalImageUrl(), ecorePackage.getEString(), "originalImageUrl", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_PiecesIncluded(), ecorePackage.getELong(), "piecesIncluded", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_PriceDetailText(), ecorePackage.getEString(), "priceDetailText", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ProductDepth(), ecorePackage.getEBigDecimal(), "productDepth", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ProductDiameter(), ecorePackage.getEBigDecimal(), "productDiameter", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ProductHeight(), ecorePackage.getEBigDecimal(), "productHeight", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ProductName(), ecorePackage.getEString(), "productName", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ProductRating(), ecorePackage.getEBigDecimal(), "productRating", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ProductWeight(), ecorePackage.getEBigDecimal(), "productWeight", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ProductWidth(), ecorePackage.getEBigDecimal(), "productWidth", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_QuantityIncluded(), ecorePackage.getEBigDecimal(), "quantityIncluded", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ReleaseDate(), ecorePackage.getEDate(), "releaseDate", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_RequireAmount(), ecorePackage.getEBoolean(), "requireAmount", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_RequireInventory(), ecorePackage.getEBoolean(), "requireInventory", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_Reserv2ndPPPerc(), ecorePackage.getEBigDecimal(), "reserv2ndPPPerc", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ReservMaxPersons(), ecorePackage.getEBigDecimal(), "reservMaxPersons", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ReservNthPPPerc(), ecorePackage.getEBigDecimal(), "reservNthPPPerc", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_Returnable(), ecorePackage.getEBoolean(), "returnable", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_SalesDiscWhenNotAvail(), ecorePackage.getEBoolean(), "salesDiscWhenNotAvail", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_SalesDiscontinuationDate(), ecorePackage.getEDate(), "salesDiscontinuationDate", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ShippingDepth(), ecorePackage.getEBigDecimal(), "shippingDepth", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ShippingHeight(), ecorePackage.getEBigDecimal(), "shippingHeight", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ShippingWeight(), ecorePackage.getEBigDecimal(), "shippingWeight", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ShippingWidth(), ecorePackage.getEBigDecimal(), "shippingWidth", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_SmallImageUrl(), ecorePackage.getEString(), "smallImageUrl", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_SupportDiscontinuationDate(), ecorePackage.getEDate(), "supportDiscontinuationDate", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_Taxable(), ecorePackage.getEBoolean(), "taxable", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_ProductTypeId(), this.getProductType(), null, "productTypeId", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_ProductTypeId().getEKeys().add(this.getProductType_ProductTypeId());
		initEReference(getProduct_PrimaryProductCategoryId(), theCategoryPackage.getProductCategory(), null, "primaryProductCategoryId", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_PrimaryProductCategoryId().getEKeys().add(theCategoryPackage.getProductCategory_ProductCategoryId());
		initEReference(getProduct_FacilityId(), theFacilityPackage.getFacility(), null, "facilityId", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_FacilityId().getEKeys().add(theFacilityPackage.getFacility_FacilityId());
		initEReference(getProduct_QuantityUomId(), theUomPackage.getUom(), null, "quantityUomId", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_QuantityUomId().getEKeys().add(theUomPackage.getUom_UomId());
		initEReference(getProduct_AmountUomTypeId(), theUomPackage.getUomType(), null, "amountUomTypeId", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_AmountUomTypeId().getEKeys().add(theUomPackage.getUomType_UomTypeId());
		initEReference(getProduct_WeightUomId(), theUomPackage.getUom(), null, "weightUomId", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_WeightUomId().getEKeys().add(theUomPackage.getUom_UomId());
		initEReference(getProduct_HeightUomId(), theUomPackage.getUom(), null, "heightUomId", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_HeightUomId().getEKeys().add(theUomPackage.getUom_UomId());
		initEReference(getProduct_WidthUomId(), theUomPackage.getUom(), null, "widthUomId", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_WidthUomId().getEKeys().add(theUomPackage.getUom_UomId());
		initEReference(getProduct_DepthUomId(), theUomPackage.getUom(), null, "depthUomId", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_DepthUomId().getEKeys().add(theUomPackage.getUom_UomId());
		initEReference(getProduct_DiameterUomId(), theUomPackage.getUom(), null, "diameterUomId", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_DiameterUomId().getEKeys().add(theUomPackage.getUom_UomId());
		initEReference(getProduct_VirtualVariantMethodEnum(), theEnumPackage.getEnumeration(), null, "virtualVariantMethodEnum", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_VirtualVariantMethodEnum().getEKeys().add(theEnumPackage.getEnumeration_EnumId());
		initEReference(getProduct_RatingTypeEnum(), theEnumPackage.getEnumeration(), null, "ratingTypeEnum", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_RatingTypeEnum().getEKeys().add(theEnumPackage.getEnumeration_EnumId());
		initEReference(getProduct_RequirementMethodEnumId(), theEnumPackage.getEnumeration(), null, "requirementMethodEnumId", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_RequirementMethodEnumId().getEKeys().add(theEnumPackage.getEnumeration_EnumId());
		initEReference(getProduct_OriginGeoId(), theGeoPackage.getGeo(), null, "originGeoId", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_OriginGeoId().getEKeys().add(theGeoPackage.getGeo_GeoId());
		initEReference(getProduct_CreatedByUserLogin(), theLoginPackage.getUserLogin(), null, "createdByUserLogin", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_CreatedByUserLogin().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());
		initEReference(getProduct_LastModifiedByUserLogin(), theLoginPackage.getUserLogin(), null, "lastModifiedByUserLogin", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_LastModifiedByUserLogin().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());
		initEReference(getProduct_DefaultShipmentBoxTypeId(), theShipment_Package.getShipmentBoxType(), null, "defaultShipmentBoxTypeId", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_DefaultShipmentBoxTypeId().getEKeys().add(theShipment_Package.getShipmentBoxType_ShipmentBoxTypeId());
		initEReference(getProduct_InventoryItemTypeId(), theInventoryPackage.getInventoryItemType(), null, "inventoryItemTypeId", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProduct_InventoryItemTypeId().getEKeys().add(theInventoryPackage.getInventoryItemType_InventoryItemTypeId());
		initEAttribute(getProduct_CommunicationEventProducts(), ecorePackage.getEString(), "communicationEventProducts", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ProductAttributes(), ecorePackage.getEString(), "productAttributes", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ProductFacilities(), ecorePackage.getEString(), "productFacilities", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ProductGeos(), ecorePackage.getEString(), "productGeos", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ProductMaints(), ecorePackage.getEString(), "productMaints", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_ProductMeters(), ecorePackage.getEString(), "productMeters", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getProduct__Agreements(), ecorePackage.getEString(), "agreements", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProduct__CartAbandonedLines(), ecorePackage.getEString(), "cartAbandonedLines", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProduct__CostComponents(), ecorePackage.getEString(), "costComponents", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProduct__CustRequestItems(), ecorePackage.getEString(), "custRequestItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProduct__GoodIdentifications(), ecorePackage.getEString(), "goodIdentifications", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProduct__InstanceOfFixedAssets(), ecorePackage.getEString(), "instanceOfFixedAssets", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProduct__InventoryItems(), ecorePackage.getEString(), "inventoryItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProduct__InvoiceItems(), ecorePackage.getEString(), "invoiceItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProduct__OrderItems(), ecorePackage.getEString(), "orderItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProduct__ProductForProductManufacturingRules(), ecorePackage.getEString(), "productForProductManufacturingRules", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProduct__ProductGroupOrders(), ecorePackage.getEString(), "productGroupOrders", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProduct__ProductInProductManufacturingRules(), ecorePackage.getEString(), "productInProductManufacturingRules", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProduct__ProductManufacturingRules(), ecorePackage.getEString(), "productManufacturingRules", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProduct__ProductProductConfigStatss(), ecorePackage.getEString(), "productProductConfigStatss", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProduct__ProductReviews(), ecorePackage.getEString(), "productReviews", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProduct__ProductStoreSurveyAppls(), ecorePackage.getEString(), "productStoreSurveyAppls", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProduct__ProductSubstProductManufacturingRules(), ecorePackage.getEString(), "productSubstProductManufacturingRules", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProduct__QuoteItems(), ecorePackage.getEString(), "quoteItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProduct__ReorderGuidelines(), ecorePackage.getEString(), "reorderGuidelines", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProduct__Requirements(), ecorePackage.getEString(), "requirements", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProduct__ReturnItems(), ecorePackage.getEString(), "returnItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProduct__SalesForecastDetails(), ecorePackage.getEString(), "salesForecastDetails", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProduct__ShipmentItems(), ecorePackage.getEString(), "shipmentItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProduct__ShipmentReceipts(), ecorePackage.getEString(), "shipmentReceipts", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProduct__ShoppingListItems(), ecorePackage.getEString(), "shoppingListItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProduct__Subscriptions(), ecorePackage.getEString(), "subscriptions", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(productAssocEClass, ProductAssoc.class, "ProductAssoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductAssoc_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, ProductAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAssoc_Instruction(), ecorePackage.getEString(), "instruction", null, 0, 1, ProductAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAssoc_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 0, 1, ProductAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAssoc_Reason(), ecorePackage.getEString(), "reason", null, 0, 1, ProductAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAssoc_ScrapFactor(), ecorePackage.getEBigDecimal(), "scrapFactor", null, 0, 1, ProductAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAssoc_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, ProductAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAssoc_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, ProductAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductAssoc_ProductAssocTypeId(), this.getProductAssocType(), null, "productAssocTypeId", null, 0, 1, ProductAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductAssoc_ProductAssocTypeId().getEKeys().add(this.getProductAssocType_ProductAssocTypeId());
		initEReference(getProductAssoc_ProductId(), this.getProduct(), null, "productId", null, 0, 1, ProductAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductAssoc_ProductId().getEKeys().add(this.getProduct_ProductId());
		initEReference(getProductAssoc_ProductIdTo(), this.getProduct(), null, "productIdTo", null, 0, 1, ProductAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductAssoc_ProductIdTo().getEKeys().add(this.getProduct_ProductId());
		initEReference(getProductAssoc_RoutingWorkEffortId(), theWorkeffortPackage.getWorkEffort(), null, "routingWorkEffortId", null, 0, 1, ProductAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductAssoc_RoutingWorkEffortId().getEKeys().add(theWorkeffortPackage.getWorkEffort_WorkEffortId());
		initEReference(getProductAssoc_EstimateCalcMethod(), theMethodPackage.getCustomMethod(), null, "estimateCalcMethod", null, 0, 1, ProductAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductAssoc_EstimateCalcMethod().getEKeys().add(theMethodPackage.getCustomMethod_CustomMethodId());
		initEReference(getProductAssoc_RecurrenceInfoId(), theSchedulePackage.getRecurrenceInfo(), null, "recurrenceInfoId", null, 0, 1, ProductAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductAssoc_RecurrenceInfoId().getEKeys().add(theSchedulePackage.getRecurrenceInfo_RecurrenceInfoId());

		initEClass(productAssocTypeEClass, ProductAssocType.class, "ProductAssocType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductAssocType_ProductAssocTypeId(), ecorePackage.getEString(), "productAssocTypeId", null, 1, 1, ProductAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAssocType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProductAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAssocType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, ProductAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductAssocType_ParentTypeId(), this.getProductAssocType(), null, "parentTypeId", null, 0, 1, ProductAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductAssocType_ParentTypeId().getEKeys().add(this.getProductAssocType_ProductAssocTypeId());

		initEOperation(getProductAssocType__ChildProductAssocTypes(), ecorePackage.getEString(), "childProductAssocTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(productAttributeEClass, ProductAttribute.class, "ProductAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, ProductAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, ProductAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAttribute_AttrType(), ecorePackage.getEString(), "attrType", null, 0, 1, ProductAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, ProductAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductAttribute_ProductId(), this.getProduct(), null, "productId", null, 0, 1, ProductAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductAttribute_ProductId().getEKeys().add(this.getProduct_ProductId());

		initEClass(productCalculatedInfoEClass, ProductCalculatedInfo.class, "ProductCalculatedInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductCalculatedInfo_AverageCustomerRating(), ecorePackage.getEBigDecimal(), "averageCustomerRating", null, 0, 1, ProductCalculatedInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductCalculatedInfo_TotalQuantityOrdered(), ecorePackage.getEBigDecimal(), "totalQuantityOrdered", null, 0, 1, ProductCalculatedInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductCalculatedInfo_TotalTimesViewed(), ecorePackage.getELong(), "totalTimesViewed", null, 0, 1, ProductCalculatedInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductCalculatedInfo_ProductId(), this.getProduct(), null, "productId", null, 0, 1, ProductCalculatedInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductCalculatedInfo_ProductId().getEKeys().add(this.getProduct_ProductId());

		initEClass(productContentEClass, ProductContent.class, "ProductContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductContent_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, ProductContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductContent_PurchaseFromDate(), ecorePackage.getEDate(), "purchaseFromDate", null, 0, 1, ProductContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductContent_PurchaseThruDate(), ecorePackage.getEDate(), "purchaseThruDate", null, 0, 1, ProductContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductContent_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, ProductContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductContent_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, ProductContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductContent_UseCountLimit(), ecorePackage.getELong(), "useCountLimit", null, 0, 1, ProductContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductContent_UseTime(), ecorePackage.getELong(), "useTime", null, 0, 1, ProductContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductContent_ProductId(), this.getProduct(), null, "productId", null, 0, 1, ProductContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductContent_ProductId().getEKeys().add(this.getProduct_ProductId());
		initEReference(getProductContent_ContentId(), theContentPackage.getContent(), null, "contentId", null, 0, 1, ProductContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductContent_ContentId().getEKeys().add(theContentPackage.getContent_ContentId());
		initEReference(getProductContent_ProductContentTypeId(), this.getProductContentType(), null, "productContentTypeId", null, 0, 1, ProductContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductContent_ProductContentTypeId().getEKeys().add(this.getProductContentType_ProductContentTypeId());
		initEReference(getProductContent_UseRoleTypeId(), thePartyPackage.getRoleType(), null, "useRoleTypeId", null, 0, 1, ProductContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductContent_UseRoleTypeId().getEKeys().add(thePartyPackage.getRoleType_RoleTypeId());
		initEReference(getProductContent_UseTimeUomId(), theUomPackage.getUom(), null, "useTimeUomId", null, 0, 1, ProductContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductContent_UseTimeUomId().getEKeys().add(theUomPackage.getUom_UomId());

		initEClass(productContentTypeEClass, ProductContentType.class, "ProductContentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductContentType_ProductContentTypeId(), ecorePackage.getEString(), "productContentTypeId", null, 1, 1, ProductContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductContentType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProductContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductContentType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, ProductContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductContentType_ParentTypeId(), this.getProductContentType(), null, "parentTypeId", null, 0, 1, ProductContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductContentType_ParentTypeId().getEKeys().add(this.getProductContentType_ProductContentTypeId());

		initEOperation(getProductContentType__ChildProductContentTypes(), ecorePackage.getEString(), "childProductContentTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(productGeoEClass, ProductGeo.class, "ProductGeo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductGeo_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProductGeo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductGeo_ProductId(), this.getProduct(), null, "productId", null, 0, 1, ProductGeo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductGeo_ProductId().getEKeys().add(this.getProduct_ProductId());
		initEReference(getProductGeo_GeoId(), theGeoPackage.getGeo(), null, "geoId", null, 0, 1, ProductGeo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductGeo_GeoId().getEKeys().add(theGeoPackage.getGeo_GeoId());
		initEReference(getProductGeo_ProductGeoEnumId(), theEnumPackage.getEnumeration(), null, "productGeoEnumId", null, 0, 1, ProductGeo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductGeo_ProductGeoEnumId().getEKeys().add(theEnumPackage.getEnumeration_EnumId());

		initEClass(productGlAccountEClass, ProductGlAccount.class, "ProductGlAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductGlAccount_ProductId(), this.getProduct(), null, "productId", null, 0, 1, ProductGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductGlAccount_ProductId().getEKeys().add(this.getProduct_ProductId());
		initEReference(getProductGlAccount_OrganizationPartyId(), thePartyPackage.getParty(), null, "organizationPartyId", null, 0, 1, ProductGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductGlAccount_OrganizationPartyId().getEKeys().add(thePartyPackage.getParty_PartyId());
		initEReference(getProductGlAccount_GlAccountTypeId(), theLedgerPackage.getGlAccountType(), null, "glAccountTypeId", null, 0, 1, ProductGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductGlAccount_GlAccountTypeId().getEKeys().add(theLedgerPackage.getGlAccountType_GlAccountTypeId());
		initEReference(getProductGlAccount_GlAccountId(), theLedgerPackage.getGlAccount(), null, "glAccountId", null, 0, 1, ProductGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductGlAccount_GlAccountId().getEKeys().add(theLedgerPackage.getGlAccount_GlAccountId());

		initEClass(productGroupOrderEClass, ProductGroupOrder.class, "ProductGroupOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductGroupOrder_GroupOrderId(), ecorePackage.getEString(), "groupOrderId", null, 1, 1, ProductGroupOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductGroupOrder_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, ProductGroupOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductGroupOrder_ReqOrderQty(), ecorePackage.getEBigDecimal(), "reqOrderQty", null, 0, 1, ProductGroupOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductGroupOrder_SoldOrderQty(), ecorePackage.getEBigDecimal(), "soldOrderQty", null, 0, 1, ProductGroupOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductGroupOrder_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, ProductGroupOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductGroupOrder_ProductId(), this.getProduct(), null, "productId", null, 0, 1, ProductGroupOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductGroupOrder_ProductId().getEKeys().add(this.getProduct_ProductId());
		initEReference(getProductGroupOrder_StatusId(), theStatusPackage.getStatusItem(), null, "statusId", null, 0, 1, ProductGroupOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductGroupOrder_StatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEReference(getProductGroupOrder_JobId(), theSchedulePackage.getJobSandbox(), null, "jobId", null, 0, 1, ProductGroupOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductGroupOrder_JobId().getEKeys().add(theSchedulePackage.getJobSandbox_JobId());

		initEClass(productKeywordEClass, ProductKeyword.class, "ProductKeyword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductKeyword_Keyword(), ecorePackage.getEString(), "keyword", null, 1, 1, ProductKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductKeyword_RelevancyWeight(), ecorePackage.getELong(), "relevancyWeight", null, 0, 1, ProductKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductKeyword_ProductId(), this.getProduct(), null, "productId", null, 0, 1, ProductKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductKeyword_ProductId().getEKeys().add(this.getProduct_ProductId());
		initEReference(getProductKeyword_KeywordTypeId(), theEnumPackage.getEnumeration(), null, "keywordTypeId", null, 0, 1, ProductKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductKeyword_KeywordTypeId().getEKeys().add(theEnumPackage.getEnumeration_EnumId());
		initEReference(getProductKeyword_StatusId(), theStatusPackage.getStatusItem(), null, "statusId", null, 0, 1, ProductKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductKeyword_StatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());

		initEClass(productMaintEClass, ProductMaint.class, "ProductMaint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductMaint_ProductMaintSeqId(), ecorePackage.getEString(), "productMaintSeqId", null, 1, 1, ProductMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductMaint_IntervalQuantity(), ecorePackage.getEBigDecimal(), "intervalQuantity", null, 0, 1, ProductMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductMaint_MaintName(), ecorePackage.getEString(), "maintName", null, 0, 1, ProductMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductMaint_RepeatCount(), ecorePackage.getELong(), "repeatCount", null, 0, 1, ProductMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductMaint_ProductId(), this.getProduct(), null, "productId", null, 0, 1, ProductMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductMaint_ProductId().getEKeys().add(this.getProduct_ProductId());
		initEReference(getProductMaint_ProductMaintTypeId(), this.getProductMaintType(), null, "productMaintTypeId", null, 0, 1, ProductMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductMaint_ProductMaintTypeId().getEKeys().add(this.getProductMaintType_ProductMaintTypeId());
		initEReference(getProductMaint_MaintTemplateWorkEffortId(), theWorkeffortPackage.getWorkEffort(), null, "maintTemplateWorkEffortId", null, 0, 1, ProductMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductMaint_MaintTemplateWorkEffortId().getEKeys().add(theWorkeffortPackage.getWorkEffort_WorkEffortId());
		initEReference(getProductMaint_IntervalUomId(), theUomPackage.getUom(), null, "intervalUomId", null, 0, 1, ProductMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductMaint_IntervalUomId().getEKeys().add(theUomPackage.getUom_UomId());
		initEReference(getProductMaint_IntervalMeterTypeId(), this.getProductMeterType(), null, "intervalMeterTypeId", null, 0, 1, ProductMaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductMaint_IntervalMeterTypeId().getEKeys().add(this.getProductMeterType_ProductMeterTypeId());

		initEClass(productMaintTypeEClass, ProductMaintType.class, "ProductMaintType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductMaintType_ProductMaintTypeId(), ecorePackage.getEString(), "productMaintTypeId", null, 1, 1, ProductMaintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductMaintType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProductMaintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductMaintType_ParentTypeId(), this.getProductMaintType(), null, "parentTypeId", null, 0, 1, ProductMaintType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductMaintType_ParentTypeId().getEKeys().add(this.getProductMaintType_ProductMaintTypeId());

		initEOperation(getProductMaintType__ChildProductMaintTypes(), ecorePackage.getEString(), "childProductMaintTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProductMaintType__FixedAssetMaints(), ecorePackage.getEString(), "fixedAssetMaints", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProductMaintType__ProductMaints(), ecorePackage.getEString(), "productMaints", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(productMeterEClass, ProductMeter.class, "ProductMeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductMeter_MeterName(), ecorePackage.getEString(), "meterName", null, 0, 1, ProductMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductMeter_ProductId(), this.getProduct(), null, "productId", null, 0, 1, ProductMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductMeter_ProductId().getEKeys().add(this.getProduct_ProductId());
		initEReference(getProductMeter_ProductMeterTypeId(), this.getProductMeterType(), null, "productMeterTypeId", null, 0, 1, ProductMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductMeter_ProductMeterTypeId().getEKeys().add(this.getProductMeterType_ProductMeterTypeId());
		initEReference(getProductMeter_MeterUomId(), theUomPackage.getUom(), null, "meterUomId", null, 0, 1, ProductMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductMeter_MeterUomId().getEKeys().add(theUomPackage.getUom_UomId());

		initEClass(productMeterTypeEClass, ProductMeterType.class, "ProductMeterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductMeterType_ProductMeterTypeId(), ecorePackage.getEString(), "productMeterTypeId", null, 1, 1, ProductMeterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductMeterType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProductMeterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductMeterType_DefaultUomId(), theUomPackage.getUom(), null, "defaultUomId", null, 0, 1, ProductMeterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductMeterType_DefaultUomId().getEKeys().add(theUomPackage.getUom_UomId());

		initEOperation(getProductMeterType__IntervalFixedAssetMaints(), ecorePackage.getEString(), "intervalFixedAssetMaints", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProductMeterType__IntervalProductMaints(), ecorePackage.getEString(), "intervalProductMaints", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProductMeterType__ProductMeters(), ecorePackage.getEString(), "productMeters", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(productReviewEClass, ProductReview.class, "ProductReview", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductReview_ProductReviewId(), ecorePackage.getEString(), "productReviewId", null, 1, 1, ProductReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductReview_PostedAnonymous(), ecorePackage.getEBoolean(), "postedAnonymous", null, 0, 1, ProductReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductReview_PostedDateTime(), ecorePackage.getEDate(), "postedDateTime", null, 0, 1, ProductReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductReview_ProductRating(), ecorePackage.getEBigDecimal(), "productRating", null, 0, 1, ProductReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductReview_ProductReview(), ecorePackage.getEString(), "productReview", null, 0, 1, ProductReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductReview_ProductStoreId(), theStorePackage.getProductStore(), null, "productStoreId", null, 0, 1, ProductReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductReview_ProductStoreId().getEKeys().add(theStorePackage.getProductStore_ProductStoreId());
		initEReference(getProductReview_ProductId(), this.getProduct(), null, "productId", null, 0, 1, ProductReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductReview_ProductId().getEKeys().add(this.getProduct_ProductId());
		initEReference(getProductReview_UserLoginId(), theLoginPackage.getUserLogin(), null, "userLoginId", null, 0, 1, ProductReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductReview_UserLoginId().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());
		initEReference(getProductReview_StatusId(), theStatusPackage.getStatusItem(), null, "statusId", null, 0, 1, ProductReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductReview_StatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());

		initEClass(productRoleEClass, ProductRole.class, "ProductRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductRole_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, ProductRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductRole_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, ProductRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductRole_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, ProductRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductRole_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, ProductRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductRole_PartyId(), thePartyPackage.getParty(), null, "partyId", null, 0, 1, ProductRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductRole_PartyId().getEKeys().add(thePartyPackage.getParty_PartyId());
		initEReference(getProductRole_RoleTypeId(), thePartyPackage.getRoleType(), null, "roleTypeId", null, 0, 1, ProductRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductRole_RoleTypeId().getEKeys().add(thePartyPackage.getRoleType_RoleTypeId());
		initEReference(getProductRole_ProductId(), this.getProduct(), null, "productId", null, 0, 1, ProductRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductRole_ProductId().getEKeys().add(this.getProduct_ProductId());

		initEClass(productSearchConstraintEClass, ProductSearchConstraint.class, "ProductSearchConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductSearchConstraint_ConstraintSeqId(), ecorePackage.getEString(), "constraintSeqId", null, 1, 1, ProductSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchConstraint_AnyPrefix(), ecorePackage.getEBoolean(), "anyPrefix", null, 0, 1, ProductSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchConstraint_AnySuffix(), ecorePackage.getEBoolean(), "anySuffix", null, 0, 1, ProductSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchConstraint_ConstraintName(), ecorePackage.getEString(), "constraintName", null, 0, 1, ProductSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchConstraint_HighValue(), ecorePackage.getEString(), "highValue", null, 0, 1, ProductSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchConstraint_IncludeSubCategories(), ecorePackage.getEBoolean(), "includeSubCategories", null, 0, 1, ProductSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchConstraint_InfoString(), ecorePackage.getEString(), "infoString", null, 0, 1, ProductSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchConstraint_IsAnd(), ecorePackage.getEBoolean(), "isAnd", null, 0, 1, ProductSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchConstraint_LowValue(), ecorePackage.getEString(), "lowValue", null, 0, 1, ProductSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchConstraint_RemoveStems(), ecorePackage.getEBoolean(), "removeStems", null, 0, 1, ProductSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductSearchConstraint_ProductSearchResultId(), this.getProductSearchResult(), null, "productSearchResultId", null, 0, 1, ProductSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductSearchConstraint_ProductSearchResultId().getEKeys().add(this.getProductSearchResult_ProductSearchResultId());

		initEClass(productSearchResultEClass, ProductSearchResult.class, "ProductSearchResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductSearchResult_ProductSearchResultId(), ecorePackage.getEString(), "productSearchResultId", null, 1, 1, ProductSearchResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchResult_IsAscending(), ecorePackage.getEBoolean(), "isAscending", null, 0, 1, ProductSearchResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchResult_NumResults(), ecorePackage.getELong(), "numResults", null, 0, 1, ProductSearchResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchResult_OrderByName(), ecorePackage.getEString(), "orderByName", null, 0, 1, ProductSearchResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchResult_SearchDate(), ecorePackage.getEDate(), "searchDate", null, 0, 1, ProductSearchResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchResult_SecondsTotal(), ecorePackage.getEDouble(), "secondsTotal", null, 0, 1, ProductSearchResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchResult_VisitId(), ecorePackage.getEString(), "visitId", null, 0, 1, ProductSearchResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductSearchResult_ProductSearchConstraints(), ecorePackage.getEString(), "productSearchConstraints", null, 0, -1, ProductSearchResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productTypeEClass, ProductType.class, "ProductType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductType_ProductTypeId(), ecorePackage.getEString(), "productTypeId", null, 1, 1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductType_IsDigital(), ecorePackage.getEBoolean(), "isDigital", null, 0, 1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductType_IsPhysical(), ecorePackage.getEBoolean(), "isPhysical", null, 0, 1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductType_ParentTypeId(), this.getProductType(), null, "parentTypeId", null, 0, 1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductType_ParentTypeId().getEKeys().add(this.getProductType_ProductTypeId());
		initEAttribute(getProductType_ProductTypeAttrs(), ecorePackage.getEString(), "productTypeAttrs", null, 0, -1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getProductType__ChildProductTypes(), ecorePackage.getEString(), "childProductTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProductType__Products(), ecorePackage.getEString(), "products", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(productTypeAttrEClass, ProductTypeAttr.class, "ProductTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, ProductTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProductTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductTypeAttr_ProductTypeId(), this.getProductType(), null, "productTypeId", null, 0, 1, ProductTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProductTypeAttr_ProductTypeId().getEKeys().add(this.getProductType_ProductTypeId());

		initEClass(vendorProductEClass, VendorProduct.class, "VendorProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVendorProduct_ProductId(), this.getProduct(), null, "productId", null, 0, 1, VendorProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getVendorProduct_ProductId().getEKeys().add(this.getProduct_ProductId());
		initEReference(getVendorProduct_VendorPartyId(), thePartyPackage.getParty(), null, "vendorPartyId", null, 0, 1, VendorProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getVendorProduct_VendorPartyId().getEKeys().add(thePartyPackage.getParty_PartyId());
		initEReference(getVendorProduct_ProductStoreGroupId(), theStorePackage.getProductStoreGroup(), null, "productStoreGroupId", null, 0, 1, VendorProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getVendorProduct_ProductStoreGroupId().getEKeys().add(theStorePackage.getProductStoreGroup_ProductStoreGroupId());

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
		  (getGoodIdentificationType__ChildGoodIdentificationTypes(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getGoodIdentificationType_GoodIdentificationTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGoodIdentificationType_GoodIdentifications(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct__Agreements(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct__CartAbandonedLines(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct__CostComponents(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct__CustRequestItems(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct__GoodIdentifications(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct__InstanceOfFixedAssets(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct__InventoryItems(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct__InvoiceItems(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct__OrderItems(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct__ProductForProductManufacturingRules(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct__ProductGroupOrders(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct__ProductInProductManufacturingRules(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct__ProductManufacturingRules(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct__ProductProductConfigStatss(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct__ProductReviews(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct__ProductStoreSurveyAppls(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct__ProductSubstProductManufacturingRules(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct__QuoteItems(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct__ReorderGuidelines(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct__Requirements(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct__ReturnItems(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct__SalesForecastDetails(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct__ShipmentItems(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct__ShipmentReceipts(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct__ShoppingListItems(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct__Subscriptions(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct_ProductId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProduct_CommunicationEventProducts(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct_ProductAttributes(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct_ProductFacilities(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct_ProductGeos(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct_ProductMaints(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProduct_ProductMeters(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProductAssoc_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductAssocType__ChildProductAssocTypes(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProductAssocType_ProductAssocTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductAttribute_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductContent_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductContentType__ChildProductContentTypes(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProductContentType_ProductContentTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductGroupOrder_GroupOrderId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductKeyword_Keyword(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductMaint_ProductMaintSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductMaintType__ChildProductMaintTypes(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProductMaintType__FixedAssetMaints(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProductMaintType__ProductMaints(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProductMaintType_ProductMaintTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductMeterType__IntervalFixedAssetMaints(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProductMeterType__IntervalProductMaints(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProductMeterType__ProductMeters(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProductMeterType_ProductMeterTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductReview_ProductReviewId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductRole_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductSearchConstraint_ConstraintSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductSearchResult_ProductSearchResultId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductSearchResult_ProductSearchConstraints(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProductType__ChildProductTypes(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProductType__Products(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProductType_ProductTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductType_ProductTypeAttrs(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProductTypeAttr_AttrName(),
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
		  (getGoodIdentificationType__ChildGoodIdentificationTypes(),
		   source,
		   new String[] {
			   "frame", "GoodIdentificationType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGoodIdentificationType_GoodIdentifications(),
		   source,
		   new String[] {
			   "frame", "GoodIdentification"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct__Agreements(),
		   source,
		   new String[] {
			   "frame", "Agreement",
			   "route", "productId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct__CartAbandonedLines(),
		   source,
		   new String[] {
			   "frame", "CartAbandonedLine",
			   "route", "productId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct__CostComponents(),
		   source,
		   new String[] {
			   "frame", "CostComponent",
			   "route", "productId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct__CustRequestItems(),
		   source,
		   new String[] {
			   "frame", "CustRequestItem",
			   "route", "productId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct__GoodIdentifications(),
		   source,
		   new String[] {
			   "frame", "GoodIdentification",
			   "route", "productId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct__InstanceOfFixedAssets(),
		   source,
		   new String[] {
			   "frame", "FixedAsset",
			   "route", "instanceOfProductId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct__InventoryItems(),
		   source,
		   new String[] {
			   "frame", "InventoryItem",
			   "route", "productId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct__InvoiceItems(),
		   source,
		   new String[] {
			   "frame", "InvoiceItem",
			   "route", "productId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct__OrderItems(),
		   source,
		   new String[] {
			   "frame", "OrderItem",
			   "route", "productId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct__ProductForProductManufacturingRules(),
		   source,
		   new String[] {
			   "frame", "ProductManufacturingRule",
			   "route", "productIdFor"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct__ProductGroupOrders(),
		   source,
		   new String[] {
			   "frame", "ProductGroupOrder",
			   "route", "productId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct__ProductInProductManufacturingRules(),
		   source,
		   new String[] {
			   "frame", "ProductManufacturingRule",
			   "route", "productIdIn"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct__ProductManufacturingRules(),
		   source,
		   new String[] {
			   "frame", "ProductManufacturingRule",
			   "route", "productId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct__ProductProductConfigStatss(),
		   source,
		   new String[] {
			   "frame", "ProductConfigStats",
			   "route", "productId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct__ProductReviews(),
		   source,
		   new String[] {
			   "frame", "ProductReview",
			   "route", "productId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct__ProductStoreSurveyAppls(),
		   source,
		   new String[] {
			   "frame", "ProductStoreSurveyAppl",
			   "route", "productId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct__ProductSubstProductManufacturingRules(),
		   source,
		   new String[] {
			   "frame", "ProductManufacturingRule",
			   "route", "productIdInSubst"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct__QuoteItems(),
		   source,
		   new String[] {
			   "frame", "QuoteItem",
			   "route", "productId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct__ReorderGuidelines(),
		   source,
		   new String[] {
			   "frame", "ReorderGuideline",
			   "route", "productId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct__Requirements(),
		   source,
		   new String[] {
			   "frame", "Requirement",
			   "route", "productId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct__ReturnItems(),
		   source,
		   new String[] {
			   "frame", "ReturnItem",
			   "route", "productId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct__SalesForecastDetails(),
		   source,
		   new String[] {
			   "frame", "SalesForecastDetail",
			   "route", "productId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct__ShipmentItems(),
		   source,
		   new String[] {
			   "frame", "ShipmentItem",
			   "route", "productId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct__ShipmentReceipts(),
		   source,
		   new String[] {
			   "frame", "ShipmentReceipt",
			   "route", "productId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct__ShoppingListItems(),
		   source,
		   new String[] {
			   "frame", "ShoppingListItem",
			   "route", "productId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct__Subscriptions(),
		   source,
		   new String[] {
			   "frame", "Subscription",
			   "route", "productId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct_CommunicationEventProducts(),
		   source,
		   new String[] {
			   "frame", "CommunicationEventProduct"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct_ProductAttributes(),
		   source,
		   new String[] {
			   "frame", "ProductAttribute"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct_ProductFacilities(),
		   source,
		   new String[] {
			   "frame", "ProductFacility"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct_ProductGeos(),
		   source,
		   new String[] {
			   "frame", "ProductGeo"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct_ProductMaints(),
		   source,
		   new String[] {
			   "frame", "ProductMaint"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProduct_ProductMeters(),
		   source,
		   new String[] {
			   "frame", "ProductMeter"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductAssocType__ChildProductAssocTypes(),
		   source,
		   new String[] {
			   "frame", "ProductAssocType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductContentType__ChildProductContentTypes(),
		   source,
		   new String[] {
			   "frame", "ProductContentType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductMaintType__ChildProductMaintTypes(),
		   source,
		   new String[] {
			   "frame", "ProductMaintType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductMaintType__FixedAssetMaints(),
		   source,
		   new String[] {
			   "frame", "FixedAssetMaint",
			   "route", "productMaintTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductMaintType__ProductMaints(),
		   source,
		   new String[] {
			   "frame", "ProductMaint",
			   "route", "productMaintTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductMeterType__IntervalFixedAssetMaints(),
		   source,
		   new String[] {
			   "frame", "FixedAssetMaint",
			   "route", "intervalMeterTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductMeterType__IntervalProductMaints(),
		   source,
		   new String[] {
			   "frame", "ProductMaint",
			   "route", "intervalMeterTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductMeterType__ProductMeters(),
		   source,
		   new String[] {
			   "frame", "ProductMeter",
			   "route", "productMeterTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductSearchResult_ProductSearchConstraints(),
		   source,
		   new String[] {
			   "frame", "ProductSearchConstraint"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductType__ChildProductTypes(),
		   source,
		   new String[] {
			   "frame", "ProductType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductType__Products(),
		   source,
		   new String[] {
			   "frame", "Product",
			   "route", "productTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductType_ProductTypeAttrs(),
		   source,
		   new String[] {
			   "frame", "ProductTypeAttr"
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
		  (goodIdentificationTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (productEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (productAssocTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (productContentTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (productGeoEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (productMaintTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (productMeterTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (productTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (productTypeAttrEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
	}

} //ProductPackageImpl
