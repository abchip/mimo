/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger.impl;

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
import org.abchip.mimo.biz.accounting.ledger.AcctgTrans;
import org.abchip.mimo.biz.accounting.ledger.AcctgTransAttribute;
import org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry;
import org.abchip.mimo.biz.accounting.ledger.AcctgTransEntryType;
import org.abchip.mimo.biz.accounting.ledger.AcctgTransType;
import org.abchip.mimo.biz.accounting.ledger.AcctgTransTypeAttr;
import org.abchip.mimo.biz.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.accounting.ledger.GlAccountCategory;
import org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryMember;
import org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryType;
import org.abchip.mimo.biz.accounting.ledger.GlAccountClass;
import org.abchip.mimo.biz.accounting.ledger.GlAccountGroup;
import org.abchip.mimo.biz.accounting.ledger.GlAccountGroupMember;
import org.abchip.mimo.biz.accounting.ledger.GlAccountGroupType;
import org.abchip.mimo.biz.accounting.ledger.GlAccountHistory;
import org.abchip.mimo.biz.accounting.ledger.GlAccountOrganization;
import org.abchip.mimo.biz.accounting.ledger.GlAccountRole;
import org.abchip.mimo.biz.accounting.ledger.GlAccountType;
import org.abchip.mimo.biz.accounting.ledger.GlAccountTypeDefault;
import org.abchip.mimo.biz.accounting.ledger.GlBudgetXref;
import org.abchip.mimo.biz.accounting.ledger.GlFiscalType;
import org.abchip.mimo.biz.accounting.ledger.GlJournal;
import org.abchip.mimo.biz.accounting.ledger.GlReconciliation;
import org.abchip.mimo.biz.accounting.ledger.GlReconciliationEntry;
import org.abchip.mimo.biz.accounting.ledger.GlResourceType;
import org.abchip.mimo.biz.accounting.ledger.GlXbrlClass;
import org.abchip.mimo.biz.accounting.ledger.LedgerFactory;
import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference;
import org.abchip.mimo.biz.accounting.ledger.PartyGlAccount;
import org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl;
import org.abchip.mimo.biz.accounting.ledger.ProductAverageCost;
import org.abchip.mimo.biz.accounting.ledger.ProductAverageCostType;
import org.abchip.mimo.biz.accounting.ledger.SettlementTerm;
import org.abchip.mimo.biz.accounting.ledger.VarianceReasonGlAccount;
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
public class LedgerPackageImpl extends EPackageImpl implements LedgerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acctgTransEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acctgTransAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acctgTransEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acctgTransEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acctgTransTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acctgTransTypeAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glAccountCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glAccountCategoryMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glAccountCategoryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glAccountClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glAccountGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glAccountGroupMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glAccountGroupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glAccountHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glAccountOrganizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glAccountRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glAccountTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glAccountTypeDefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glBudgetXrefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glFiscalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glJournalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glReconciliationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glReconciliationEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glResourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glXbrlClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyAcctgPreferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyGlAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyPrefDocTypeTplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productAverageCostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productAverageCostTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass settlementTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varianceReasonGlAccountEClass = null;

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
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LedgerPackageImpl() {
		super(eNS_URI, LedgerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LedgerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LedgerPackage init() {
		if (isInited) return (LedgerPackage)EPackage.Registry.INSTANCE.getEPackage(LedgerPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLedgerPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LedgerPackageImpl theLedgerPackage = registeredLedgerPackage instanceof LedgerPackageImpl ? (LedgerPackageImpl)registeredLedgerPackage : new LedgerPackageImpl();

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
		theLedgerPackage.createPackageContents();
		theBizPackage.createPackageContents();
		theBudgetPackage.createPackageContents();
		theFinaccountPackage.createPackageContents();
		theFixedassetPackage.createPackageContents();
		theInvoicePackage.createPackageContents();
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
		theLedgerPackage.initializePackageContents();
		theBizPackage.initializePackageContents();
		theBudgetPackage.initializePackageContents();
		theFinaccountPackage.initializePackageContents();
		theFixedassetPackage.initializePackageContents();
		theInvoicePackage.initializePackageContents();
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
		theLedgerPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LedgerPackage.eNS_URI, theLedgerPackage);
		return theLedgerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAcctgTrans() {
		return acctgTransEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_AcctgTransId() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_AcctgTransTypeId() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_CreatedByUserLogin() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_CreatedDate() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_Description() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_FinAccountTransId() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_FixedAssetId() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_GlFiscalTypeId() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_GlJournalId() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_GroupStatusId() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_InventoryItemId() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_InvoiceId() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_IsPosted() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_LastModifiedByUserLogin() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_LastModifiedDate() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_PartyId() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_PaymentId() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_PhysicalInventoryId() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_PostedDate() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_ReceiptId() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_RoleTypeId() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_ScheduledPostingDate() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_ShipmentId() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_TheirAcctgTransId() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_TransactionDate() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_VoucherDate() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_VoucherRef() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_WorkEffortId() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_AcctgTransAttributes() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTrans_AcctgTransEntries() {
		return (EAttribute)acctgTransEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAcctgTransAttribute() {
		return acctgTransAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransAttribute_AcctgTransId() {
		return (EAttribute)acctgTransAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransAttribute_AttrName() {
		return (EAttribute)acctgTransAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransAttribute_AttrDescription() {
		return (EAttribute)acctgTransAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransAttribute_AttrValue() {
		return (EAttribute)acctgTransAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAcctgTransEntry() {
		return acctgTransEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_AcctgTransId() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_AcctgTransEntrySeqId() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_AcctgTransEntryTypeId() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_Amount() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_CurrencyUomId() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_DebitCreditFlag() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_Description() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_DueDate() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_GlAccountId() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_GlAccountTypeId() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_GroupId() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_InventoryItemId() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_IsSummary() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_OrganizationPartyId() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_OrigAmount() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_OrigCurrencyUomId() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_PartyId() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_ProductId() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_ReconcileStatusId() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_RoleTypeId() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_SettlementTermId() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_TaxId() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_TheirPartyId() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_TheirProductId() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntry_VoucherRef() {
		return (EAttribute)acctgTransEntryEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAcctgTransEntryType() {
		return acctgTransEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntryType_AcctgTransEntryTypeId() {
		return (EAttribute)acctgTransEntryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntryType_Description() {
		return (EAttribute)acctgTransEntryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntryType_HasTable() {
		return (EAttribute)acctgTransEntryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransEntryType_ParentTypeId() {
		return (EAttribute)acctgTransEntryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAcctgTransType() {
		return acctgTransTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransType_AcctgTransTypeId() {
		return (EAttribute)acctgTransTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransType_Description() {
		return (EAttribute)acctgTransTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransType_HasTable() {
		return (EAttribute)acctgTransTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransType_ParentTypeId() {
		return (EAttribute)acctgTransTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransType_AcctgTransTypeAttrs() {
		return (EAttribute)acctgTransTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAcctgTransTypeAttr() {
		return acctgTransTypeAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransTypeAttr_AcctgTransTypeId() {
		return (EAttribute)acctgTransTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransTypeAttr_AttrName() {
		return (EAttribute)acctgTransTypeAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAcctgTransTypeAttr_Description() {
		return (EAttribute)acctgTransTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlAccount() {
		return glAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccount_GlAccountId() {
		return (EAttribute)glAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccount_AccountCode() {
		return (EAttribute)glAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccount_AccountName() {
		return (EAttribute)glAccountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccount_Description() {
		return (EAttribute)glAccountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccount_ExternalId() {
		return (EAttribute)glAccountEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccount_GlAccountClassId() {
		return (EAttribute)glAccountEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccount_GlAccountTypeId() {
		return (EAttribute)glAccountEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccount_GlResourceTypeId() {
		return (EAttribute)glAccountEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccount_GlXbrlClassId() {
		return (EAttribute)glAccountEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccount_ParentGlAccountId() {
		return (EAttribute)glAccountEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccount_ProductId() {
		return (EAttribute)glAccountEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccount_GlAccountGroupMembers() {
		return (EAttribute)glAccountEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccount_GlAccountOrganizations() {
		return (EAttribute)glAccountEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlAccountCategory() {
		return glAccountCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountCategory_GlAccountCategoryId() {
		return (EAttribute)glAccountCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountCategory_Description() {
		return (EAttribute)glAccountCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountCategory_GlAccountCategoryTypeId() {
		return (EAttribute)glAccountCategoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlAccountCategoryMember() {
		return glAccountCategoryMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountCategoryMember_GlAccountId() {
		return (EAttribute)glAccountCategoryMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountCategoryMember_GlAccountCategoryId() {
		return (EAttribute)glAccountCategoryMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountCategoryMember_FromDate() {
		return (EAttribute)glAccountCategoryMemberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountCategoryMember_AmountPercentage() {
		return (EAttribute)glAccountCategoryMemberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountCategoryMember_ThruDate() {
		return (EAttribute)glAccountCategoryMemberEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlAccountCategoryType() {
		return glAccountCategoryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountCategoryType_GlAccountCategoryTypeId() {
		return (EAttribute)glAccountCategoryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountCategoryType_Description() {
		return (EAttribute)glAccountCategoryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlAccountClass() {
		return glAccountClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountClass_GlAccountClassId() {
		return (EAttribute)glAccountClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountClass_Description() {
		return (EAttribute)glAccountClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountClass_IsAssetClass() {
		return (EAttribute)glAccountClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountClass_ParentClassId() {
		return (EAttribute)glAccountClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountClass_SequenceNum() {
		return (EAttribute)glAccountClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlAccountGroup() {
		return glAccountGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountGroup_GlAccountGroupId() {
		return (EAttribute)glAccountGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountGroup_Description() {
		return (EAttribute)glAccountGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountGroup_GlAccountGroupTypeId() {
		return (EAttribute)glAccountGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlAccountGroupMember() {
		return glAccountGroupMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountGroupMember_GlAccountId() {
		return (EAttribute)glAccountGroupMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountGroupMember_GlAccountGroupTypeId() {
		return (EAttribute)glAccountGroupMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountGroupMember_GlAccountGroupId() {
		return (EAttribute)glAccountGroupMemberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlAccountGroupType() {
		return glAccountGroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountGroupType_GlAccountGroupTypeId() {
		return (EAttribute)glAccountGroupTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountGroupType_Description() {
		return (EAttribute)glAccountGroupTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlAccountHistory() {
		return glAccountHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountHistory_GlAccountId() {
		return (EAttribute)glAccountHistoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountHistory_OrganizationPartyId() {
		return (EAttribute)glAccountHistoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountHistory_CustomTimePeriodId() {
		return (EAttribute)glAccountHistoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountHistory_EndingBalance() {
		return (EAttribute)glAccountHistoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountHistory_OpeningBalance() {
		return (EAttribute)glAccountHistoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountHistory_PostedCredits() {
		return (EAttribute)glAccountHistoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountHistory_PostedDebits() {
		return (EAttribute)glAccountHistoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlAccountOrganization() {
		return glAccountOrganizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountOrganization_GlAccountId() {
		return (EAttribute)glAccountOrganizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountOrganization_OrganizationPartyId() {
		return (EAttribute)glAccountOrganizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountOrganization_FromDate() {
		return (EAttribute)glAccountOrganizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountOrganization_RoleTypeId() {
		return (EAttribute)glAccountOrganizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountOrganization_ThruDate() {
		return (EAttribute)glAccountOrganizationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlAccountRole() {
		return glAccountRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountRole_GlAccountId() {
		return (EAttribute)glAccountRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountRole_PartyId() {
		return (EAttribute)glAccountRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountRole_RoleTypeId() {
		return (EAttribute)glAccountRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountRole_FromDate() {
		return (EAttribute)glAccountRoleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountRole_ThruDate() {
		return (EAttribute)glAccountRoleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlAccountType() {
		return glAccountTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountType_GlAccountTypeId() {
		return (EAttribute)glAccountTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountType_Description() {
		return (EAttribute)glAccountTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountType_HasTable() {
		return (EAttribute)glAccountTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountType_ParentTypeId() {
		return (EAttribute)glAccountTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountType_GlAccountTypeDefaults() {
		return (EAttribute)glAccountTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlAccountTypeDefault() {
		return glAccountTypeDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountTypeDefault_GlAccountTypeId() {
		return (EAttribute)glAccountTypeDefaultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountTypeDefault_OrganizationPartyId() {
		return (EAttribute)glAccountTypeDefaultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlAccountTypeDefault_GlAccountId() {
		return (EAttribute)glAccountTypeDefaultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlBudgetXref() {
		return glBudgetXrefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlBudgetXref_GlAccountId() {
		return (EAttribute)glBudgetXrefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlBudgetXref_BudgetItemTypeId() {
		return (EAttribute)glBudgetXrefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlBudgetXref_FromDate() {
		return (EAttribute)glBudgetXrefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlBudgetXref_AllocationPercentage() {
		return (EAttribute)glBudgetXrefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlBudgetXref_ThruDate() {
		return (EAttribute)glBudgetXrefEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlFiscalType() {
		return glFiscalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlFiscalType_GlFiscalTypeId() {
		return (EAttribute)glFiscalTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlFiscalType_Description() {
		return (EAttribute)glFiscalTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlJournal() {
		return glJournalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlJournal_GlJournalId() {
		return (EAttribute)glJournalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlJournal_GlJournalName() {
		return (EAttribute)glJournalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlJournal_IsPosted() {
		return (EAttribute)glJournalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlJournal_OrganizationPartyId() {
		return (EAttribute)glJournalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlJournal_PostedDate() {
		return (EAttribute)glJournalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlReconciliation() {
		return glReconciliationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliation_GlReconciliationId() {
		return (EAttribute)glReconciliationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliation_CreatedByUserLogin() {
		return (EAttribute)glReconciliationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliation_CreatedDate() {
		return (EAttribute)glReconciliationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliation_Description() {
		return (EAttribute)glReconciliationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliation_GlAccountId() {
		return (EAttribute)glReconciliationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliation_GlReconciliationName() {
		return (EAttribute)glReconciliationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliation_LastModifiedByUserLogin() {
		return (EAttribute)glReconciliationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliation_LastModifiedDate() {
		return (EAttribute)glReconciliationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliation_OpeningBalance() {
		return (EAttribute)glReconciliationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliation_OrganizationPartyId() {
		return (EAttribute)glReconciliationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliation_ReconciledBalance() {
		return (EAttribute)glReconciliationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliation_ReconciledDate() {
		return (EAttribute)glReconciliationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliation_StatusId() {
		return (EAttribute)glReconciliationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlReconciliationEntry() {
		return glReconciliationEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliationEntry_GlReconciliationId() {
		return (EAttribute)glReconciliationEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliationEntry_AcctgTransId() {
		return (EAttribute)glReconciliationEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliationEntry_AcctgTransEntrySeqId() {
		return (EAttribute)glReconciliationEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlReconciliationEntry_ReconciledAmount() {
		return (EAttribute)glReconciliationEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlResourceType() {
		return glResourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlResourceType_GlResourceTypeId() {
		return (EAttribute)glResourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlResourceType_Description() {
		return (EAttribute)glResourceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlXbrlClass() {
		return glXbrlClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlXbrlClass_GlXbrlClassId() {
		return (EAttribute)glXbrlClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlXbrlClass_Description() {
		return (EAttribute)glXbrlClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyAcctgPreference() {
		return partyAcctgPreferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_PartyId() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_BaseCurrencyUomId() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_CogsMethodId() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_EnableAccounting() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_ErrorGlJournalId() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_FiscalYearStartDay() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_FiscalYearStartMonth() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_InvoiceIdPrefix() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_InvoiceSeqCustMethId() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_LastInvoiceNumber() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_LastInvoiceRestartDate() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_LastOrderNumber() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_LastQuoteNumber() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_OldInvoiceSequenceEnumId() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_OldOrderSequenceEnumId() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_OldQuoteSequenceEnumId() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_OrderIdPrefix() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_OrderSeqCustMethId() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_QuoteIdPrefix() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_QuoteSeqCustMethId() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_RefundPaymentMethodId() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_TaxFormId() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAcctgPreference_UseInvoiceIdForReturns() {
		return (EAttribute)partyAcctgPreferenceEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyGlAccount() {
		return partyGlAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyGlAccount_OrganizationPartyId() {
		return (EAttribute)partyGlAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyGlAccount_PartyId() {
		return (EAttribute)partyGlAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyGlAccount_RoleTypeId() {
		return (EAttribute)partyGlAccountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyGlAccount_GlAccountTypeId() {
		return (EAttribute)partyGlAccountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyGlAccount_GlAccountId() {
		return (EAttribute)partyGlAccountEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyPrefDocTypeTpl() {
		return partyPrefDocTypeTplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyPrefDocTypeTpl_PartyPrefDocTypeTplId() {
		return (EAttribute)partyPrefDocTypeTplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyPrefDocTypeTpl_CustomScreenId() {
		return (EAttribute)partyPrefDocTypeTplEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyPrefDocTypeTpl_FromDate() {
		return (EAttribute)partyPrefDocTypeTplEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyPrefDocTypeTpl_InvoiceTypeId() {
		return (EAttribute)partyPrefDocTypeTplEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyPrefDocTypeTpl_OrderTypeId() {
		return (EAttribute)partyPrefDocTypeTplEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyPrefDocTypeTpl_PartyId() {
		return (EAttribute)partyPrefDocTypeTplEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyPrefDocTypeTpl_QuoteTypeId() {
		return (EAttribute)partyPrefDocTypeTplEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyPrefDocTypeTpl_ThruDate() {
		return (EAttribute)partyPrefDocTypeTplEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductAverageCost() {
		return productAverageCostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAverageCost_ProductAverageCostTypeId() {
		return (EAttribute)productAverageCostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAverageCost_OrganizationPartyId() {
		return (EAttribute)productAverageCostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAverageCost_ProductId() {
		return (EAttribute)productAverageCostEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAverageCost_FacilityId() {
		return (EAttribute)productAverageCostEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAverageCost_FromDate() {
		return (EAttribute)productAverageCostEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAverageCost_AverageCost() {
		return (EAttribute)productAverageCostEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAverageCost_ThruDate() {
		return (EAttribute)productAverageCostEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductAverageCostType() {
		return productAverageCostTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAverageCostType_ProductAverageCostTypeId() {
		return (EAttribute)productAverageCostTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAverageCostType_Description() {
		return (EAttribute)productAverageCostTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAverageCostType_HasTable() {
		return (EAttribute)productAverageCostTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductAverageCostType_ParentTypeId() {
		return (EAttribute)productAverageCostTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSettlementTerm() {
		return settlementTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSettlementTerm_SettlementTermId() {
		return (EAttribute)settlementTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSettlementTerm_TermName() {
		return (EAttribute)settlementTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSettlementTerm_TermValue() {
		return (EAttribute)settlementTermEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSettlementTerm_UomId() {
		return (EAttribute)settlementTermEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVarianceReasonGlAccount() {
		return varianceReasonGlAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVarianceReasonGlAccount_VarianceReasonId() {
		return (EAttribute)varianceReasonGlAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVarianceReasonGlAccount_OrganizationPartyId() {
		return (EAttribute)varianceReasonGlAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVarianceReasonGlAccount_GlAccountId() {
		return (EAttribute)varianceReasonGlAccountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LedgerFactory getLedgerFactory() {
		return (LedgerFactory)getEFactoryInstance();
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
		acctgTransEClass = createEClass(ACCTG_TRANS);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__ACCTG_TRANS_ID);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__ACCTG_TRANS_TYPE_ID);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__CREATED_BY_USER_LOGIN);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__CREATED_DATE);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__DESCRIPTION);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__FIN_ACCOUNT_TRANS_ID);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__FIXED_ASSET_ID);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__GL_FISCAL_TYPE_ID);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__GL_JOURNAL_ID);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__GROUP_STATUS_ID);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__INVENTORY_ITEM_ID);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__INVOICE_ID);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__IS_POSTED);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__LAST_MODIFIED_BY_USER_LOGIN);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__LAST_MODIFIED_DATE);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__PARTY_ID);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__PAYMENT_ID);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__PHYSICAL_INVENTORY_ID);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__POSTED_DATE);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__RECEIPT_ID);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__ROLE_TYPE_ID);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__SCHEDULED_POSTING_DATE);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__SHIPMENT_ID);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__THEIR_ACCTG_TRANS_ID);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__TRANSACTION_DATE);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__VOUCHER_DATE);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__VOUCHER_REF);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__WORK_EFFORT_ID);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__ACCTG_TRANS_ATTRIBUTES);
		createEAttribute(acctgTransEClass, ACCTG_TRANS__ACCTG_TRANS_ENTRIES);

		acctgTransAttributeEClass = createEClass(ACCTG_TRANS_ATTRIBUTE);
		createEAttribute(acctgTransAttributeEClass, ACCTG_TRANS_ATTRIBUTE__ACCTG_TRANS_ID);
		createEAttribute(acctgTransAttributeEClass, ACCTG_TRANS_ATTRIBUTE__ATTR_NAME);
		createEAttribute(acctgTransAttributeEClass, ACCTG_TRANS_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(acctgTransAttributeEClass, ACCTG_TRANS_ATTRIBUTE__ATTR_VALUE);

		acctgTransEntryEClass = createEClass(ACCTG_TRANS_ENTRY);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__ACCTG_TRANS_ID);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__ACCTG_TRANS_ENTRY_SEQ_ID);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__ACCTG_TRANS_ENTRY_TYPE_ID);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__AMOUNT);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__CURRENCY_UOM_ID);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__DEBIT_CREDIT_FLAG);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__DESCRIPTION);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__DUE_DATE);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__GL_ACCOUNT_ID);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__GL_ACCOUNT_TYPE_ID);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__GROUP_ID);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__INVENTORY_ITEM_ID);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__IS_SUMMARY);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__ORGANIZATION_PARTY_ID);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__ORIG_AMOUNT);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__ORIG_CURRENCY_UOM_ID);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__PARTY_ID);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__PRODUCT_ID);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__RECONCILE_STATUS_ID);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__ROLE_TYPE_ID);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__SETTLEMENT_TERM_ID);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__TAX_ID);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__THEIR_PARTY_ID);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__THEIR_PRODUCT_ID);
		createEAttribute(acctgTransEntryEClass, ACCTG_TRANS_ENTRY__VOUCHER_REF);

		acctgTransEntryTypeEClass = createEClass(ACCTG_TRANS_ENTRY_TYPE);
		createEAttribute(acctgTransEntryTypeEClass, ACCTG_TRANS_ENTRY_TYPE__ACCTG_TRANS_ENTRY_TYPE_ID);
		createEAttribute(acctgTransEntryTypeEClass, ACCTG_TRANS_ENTRY_TYPE__DESCRIPTION);
		createEAttribute(acctgTransEntryTypeEClass, ACCTG_TRANS_ENTRY_TYPE__HAS_TABLE);
		createEAttribute(acctgTransEntryTypeEClass, ACCTG_TRANS_ENTRY_TYPE__PARENT_TYPE_ID);

		acctgTransTypeEClass = createEClass(ACCTG_TRANS_TYPE);
		createEAttribute(acctgTransTypeEClass, ACCTG_TRANS_TYPE__ACCTG_TRANS_TYPE_ID);
		createEAttribute(acctgTransTypeEClass, ACCTG_TRANS_TYPE__DESCRIPTION);
		createEAttribute(acctgTransTypeEClass, ACCTG_TRANS_TYPE__HAS_TABLE);
		createEAttribute(acctgTransTypeEClass, ACCTG_TRANS_TYPE__PARENT_TYPE_ID);
		createEAttribute(acctgTransTypeEClass, ACCTG_TRANS_TYPE__ACCTG_TRANS_TYPE_ATTRS);

		acctgTransTypeAttrEClass = createEClass(ACCTG_TRANS_TYPE_ATTR);
		createEAttribute(acctgTransTypeAttrEClass, ACCTG_TRANS_TYPE_ATTR__ACCTG_TRANS_TYPE_ID);
		createEAttribute(acctgTransTypeAttrEClass, ACCTG_TRANS_TYPE_ATTR__ATTR_NAME);
		createEAttribute(acctgTransTypeAttrEClass, ACCTG_TRANS_TYPE_ATTR__DESCRIPTION);

		glAccountEClass = createEClass(GL_ACCOUNT);
		createEAttribute(glAccountEClass, GL_ACCOUNT__GL_ACCOUNT_ID);
		createEAttribute(glAccountEClass, GL_ACCOUNT__ACCOUNT_CODE);
		createEAttribute(glAccountEClass, GL_ACCOUNT__ACCOUNT_NAME);
		createEAttribute(glAccountEClass, GL_ACCOUNT__DESCRIPTION);
		createEAttribute(glAccountEClass, GL_ACCOUNT__EXTERNAL_ID);
		createEAttribute(glAccountEClass, GL_ACCOUNT__GL_ACCOUNT_CLASS_ID);
		createEAttribute(glAccountEClass, GL_ACCOUNT__GL_ACCOUNT_TYPE_ID);
		createEAttribute(glAccountEClass, GL_ACCOUNT__GL_RESOURCE_TYPE_ID);
		createEAttribute(glAccountEClass, GL_ACCOUNT__GL_XBRL_CLASS_ID);
		createEAttribute(glAccountEClass, GL_ACCOUNT__PARENT_GL_ACCOUNT_ID);
		createEAttribute(glAccountEClass, GL_ACCOUNT__PRODUCT_ID);
		createEAttribute(glAccountEClass, GL_ACCOUNT__GL_ACCOUNT_GROUP_MEMBERS);
		createEAttribute(glAccountEClass, GL_ACCOUNT__GL_ACCOUNT_ORGANIZATIONS);

		glAccountCategoryEClass = createEClass(GL_ACCOUNT_CATEGORY);
		createEAttribute(glAccountCategoryEClass, GL_ACCOUNT_CATEGORY__GL_ACCOUNT_CATEGORY_ID);
		createEAttribute(glAccountCategoryEClass, GL_ACCOUNT_CATEGORY__DESCRIPTION);
		createEAttribute(glAccountCategoryEClass, GL_ACCOUNT_CATEGORY__GL_ACCOUNT_CATEGORY_TYPE_ID);

		glAccountCategoryMemberEClass = createEClass(GL_ACCOUNT_CATEGORY_MEMBER);
		createEAttribute(glAccountCategoryMemberEClass, GL_ACCOUNT_CATEGORY_MEMBER__GL_ACCOUNT_ID);
		createEAttribute(glAccountCategoryMemberEClass, GL_ACCOUNT_CATEGORY_MEMBER__GL_ACCOUNT_CATEGORY_ID);
		createEAttribute(glAccountCategoryMemberEClass, GL_ACCOUNT_CATEGORY_MEMBER__FROM_DATE);
		createEAttribute(glAccountCategoryMemberEClass, GL_ACCOUNT_CATEGORY_MEMBER__AMOUNT_PERCENTAGE);
		createEAttribute(glAccountCategoryMemberEClass, GL_ACCOUNT_CATEGORY_MEMBER__THRU_DATE);

		glAccountCategoryTypeEClass = createEClass(GL_ACCOUNT_CATEGORY_TYPE);
		createEAttribute(glAccountCategoryTypeEClass, GL_ACCOUNT_CATEGORY_TYPE__GL_ACCOUNT_CATEGORY_TYPE_ID);
		createEAttribute(glAccountCategoryTypeEClass, GL_ACCOUNT_CATEGORY_TYPE__DESCRIPTION);

		glAccountClassEClass = createEClass(GL_ACCOUNT_CLASS);
		createEAttribute(glAccountClassEClass, GL_ACCOUNT_CLASS__GL_ACCOUNT_CLASS_ID);
		createEAttribute(glAccountClassEClass, GL_ACCOUNT_CLASS__DESCRIPTION);
		createEAttribute(glAccountClassEClass, GL_ACCOUNT_CLASS__IS_ASSET_CLASS);
		createEAttribute(glAccountClassEClass, GL_ACCOUNT_CLASS__PARENT_CLASS_ID);
		createEAttribute(glAccountClassEClass, GL_ACCOUNT_CLASS__SEQUENCE_NUM);

		glAccountGroupEClass = createEClass(GL_ACCOUNT_GROUP);
		createEAttribute(glAccountGroupEClass, GL_ACCOUNT_GROUP__GL_ACCOUNT_GROUP_ID);
		createEAttribute(glAccountGroupEClass, GL_ACCOUNT_GROUP__DESCRIPTION);
		createEAttribute(glAccountGroupEClass, GL_ACCOUNT_GROUP__GL_ACCOUNT_GROUP_TYPE_ID);

		glAccountGroupMemberEClass = createEClass(GL_ACCOUNT_GROUP_MEMBER);
		createEAttribute(glAccountGroupMemberEClass, GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_ID);
		createEAttribute(glAccountGroupMemberEClass, GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_GROUP_TYPE_ID);
		createEAttribute(glAccountGroupMemberEClass, GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_GROUP_ID);

		glAccountGroupTypeEClass = createEClass(GL_ACCOUNT_GROUP_TYPE);
		createEAttribute(glAccountGroupTypeEClass, GL_ACCOUNT_GROUP_TYPE__GL_ACCOUNT_GROUP_TYPE_ID);
		createEAttribute(glAccountGroupTypeEClass, GL_ACCOUNT_GROUP_TYPE__DESCRIPTION);

		glAccountHistoryEClass = createEClass(GL_ACCOUNT_HISTORY);
		createEAttribute(glAccountHistoryEClass, GL_ACCOUNT_HISTORY__GL_ACCOUNT_ID);
		createEAttribute(glAccountHistoryEClass, GL_ACCOUNT_HISTORY__ORGANIZATION_PARTY_ID);
		createEAttribute(glAccountHistoryEClass, GL_ACCOUNT_HISTORY__CUSTOM_TIME_PERIOD_ID);
		createEAttribute(glAccountHistoryEClass, GL_ACCOUNT_HISTORY__ENDING_BALANCE);
		createEAttribute(glAccountHistoryEClass, GL_ACCOUNT_HISTORY__OPENING_BALANCE);
		createEAttribute(glAccountHistoryEClass, GL_ACCOUNT_HISTORY__POSTED_CREDITS);
		createEAttribute(glAccountHistoryEClass, GL_ACCOUNT_HISTORY__POSTED_DEBITS);

		glAccountOrganizationEClass = createEClass(GL_ACCOUNT_ORGANIZATION);
		createEAttribute(glAccountOrganizationEClass, GL_ACCOUNT_ORGANIZATION__GL_ACCOUNT_ID);
		createEAttribute(glAccountOrganizationEClass, GL_ACCOUNT_ORGANIZATION__ORGANIZATION_PARTY_ID);
		createEAttribute(glAccountOrganizationEClass, GL_ACCOUNT_ORGANIZATION__FROM_DATE);
		createEAttribute(glAccountOrganizationEClass, GL_ACCOUNT_ORGANIZATION__ROLE_TYPE_ID);
		createEAttribute(glAccountOrganizationEClass, GL_ACCOUNT_ORGANIZATION__THRU_DATE);

		glAccountRoleEClass = createEClass(GL_ACCOUNT_ROLE);
		createEAttribute(glAccountRoleEClass, GL_ACCOUNT_ROLE__GL_ACCOUNT_ID);
		createEAttribute(glAccountRoleEClass, GL_ACCOUNT_ROLE__PARTY_ID);
		createEAttribute(glAccountRoleEClass, GL_ACCOUNT_ROLE__ROLE_TYPE_ID);
		createEAttribute(glAccountRoleEClass, GL_ACCOUNT_ROLE__FROM_DATE);
		createEAttribute(glAccountRoleEClass, GL_ACCOUNT_ROLE__THRU_DATE);

		glAccountTypeEClass = createEClass(GL_ACCOUNT_TYPE);
		createEAttribute(glAccountTypeEClass, GL_ACCOUNT_TYPE__GL_ACCOUNT_TYPE_ID);
		createEAttribute(glAccountTypeEClass, GL_ACCOUNT_TYPE__DESCRIPTION);
		createEAttribute(glAccountTypeEClass, GL_ACCOUNT_TYPE__HAS_TABLE);
		createEAttribute(glAccountTypeEClass, GL_ACCOUNT_TYPE__PARENT_TYPE_ID);
		createEAttribute(glAccountTypeEClass, GL_ACCOUNT_TYPE__GL_ACCOUNT_TYPE_DEFAULTS);

		glAccountTypeDefaultEClass = createEClass(GL_ACCOUNT_TYPE_DEFAULT);
		createEAttribute(glAccountTypeDefaultEClass, GL_ACCOUNT_TYPE_DEFAULT__GL_ACCOUNT_TYPE_ID);
		createEAttribute(glAccountTypeDefaultEClass, GL_ACCOUNT_TYPE_DEFAULT__ORGANIZATION_PARTY_ID);
		createEAttribute(glAccountTypeDefaultEClass, GL_ACCOUNT_TYPE_DEFAULT__GL_ACCOUNT_ID);

		glBudgetXrefEClass = createEClass(GL_BUDGET_XREF);
		createEAttribute(glBudgetXrefEClass, GL_BUDGET_XREF__GL_ACCOUNT_ID);
		createEAttribute(glBudgetXrefEClass, GL_BUDGET_XREF__BUDGET_ITEM_TYPE_ID);
		createEAttribute(glBudgetXrefEClass, GL_BUDGET_XREF__FROM_DATE);
		createEAttribute(glBudgetXrefEClass, GL_BUDGET_XREF__ALLOCATION_PERCENTAGE);
		createEAttribute(glBudgetXrefEClass, GL_BUDGET_XREF__THRU_DATE);

		glFiscalTypeEClass = createEClass(GL_FISCAL_TYPE);
		createEAttribute(glFiscalTypeEClass, GL_FISCAL_TYPE__GL_FISCAL_TYPE_ID);
		createEAttribute(glFiscalTypeEClass, GL_FISCAL_TYPE__DESCRIPTION);

		glJournalEClass = createEClass(GL_JOURNAL);
		createEAttribute(glJournalEClass, GL_JOURNAL__GL_JOURNAL_ID);
		createEAttribute(glJournalEClass, GL_JOURNAL__GL_JOURNAL_NAME);
		createEAttribute(glJournalEClass, GL_JOURNAL__IS_POSTED);
		createEAttribute(glJournalEClass, GL_JOURNAL__ORGANIZATION_PARTY_ID);
		createEAttribute(glJournalEClass, GL_JOURNAL__POSTED_DATE);

		glReconciliationEClass = createEClass(GL_RECONCILIATION);
		createEAttribute(glReconciliationEClass, GL_RECONCILIATION__GL_RECONCILIATION_ID);
		createEAttribute(glReconciliationEClass, GL_RECONCILIATION__CREATED_BY_USER_LOGIN);
		createEAttribute(glReconciliationEClass, GL_RECONCILIATION__CREATED_DATE);
		createEAttribute(glReconciliationEClass, GL_RECONCILIATION__DESCRIPTION);
		createEAttribute(glReconciliationEClass, GL_RECONCILIATION__GL_ACCOUNT_ID);
		createEAttribute(glReconciliationEClass, GL_RECONCILIATION__GL_RECONCILIATION_NAME);
		createEAttribute(glReconciliationEClass, GL_RECONCILIATION__LAST_MODIFIED_BY_USER_LOGIN);
		createEAttribute(glReconciliationEClass, GL_RECONCILIATION__LAST_MODIFIED_DATE);
		createEAttribute(glReconciliationEClass, GL_RECONCILIATION__OPENING_BALANCE);
		createEAttribute(glReconciliationEClass, GL_RECONCILIATION__ORGANIZATION_PARTY_ID);
		createEAttribute(glReconciliationEClass, GL_RECONCILIATION__RECONCILED_BALANCE);
		createEAttribute(glReconciliationEClass, GL_RECONCILIATION__RECONCILED_DATE);
		createEAttribute(glReconciliationEClass, GL_RECONCILIATION__STATUS_ID);

		glReconciliationEntryEClass = createEClass(GL_RECONCILIATION_ENTRY);
		createEAttribute(glReconciliationEntryEClass, GL_RECONCILIATION_ENTRY__GL_RECONCILIATION_ID);
		createEAttribute(glReconciliationEntryEClass, GL_RECONCILIATION_ENTRY__ACCTG_TRANS_ID);
		createEAttribute(glReconciliationEntryEClass, GL_RECONCILIATION_ENTRY__ACCTG_TRANS_ENTRY_SEQ_ID);
		createEAttribute(glReconciliationEntryEClass, GL_RECONCILIATION_ENTRY__RECONCILED_AMOUNT);

		glResourceTypeEClass = createEClass(GL_RESOURCE_TYPE);
		createEAttribute(glResourceTypeEClass, GL_RESOURCE_TYPE__GL_RESOURCE_TYPE_ID);
		createEAttribute(glResourceTypeEClass, GL_RESOURCE_TYPE__DESCRIPTION);

		glXbrlClassEClass = createEClass(GL_XBRL_CLASS);
		createEAttribute(glXbrlClassEClass, GL_XBRL_CLASS__GL_XBRL_CLASS_ID);
		createEAttribute(glXbrlClassEClass, GL_XBRL_CLASS__DESCRIPTION);

		partyAcctgPreferenceEClass = createEClass(PARTY_ACCTG_PREFERENCE);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__PARTY_ID);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__BASE_CURRENCY_UOM_ID);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__COGS_METHOD_ID);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__ENABLE_ACCOUNTING);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__ERROR_GL_JOURNAL_ID);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_DAY);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_MONTH);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__INVOICE_ID_PREFIX);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__INVOICE_SEQ_CUST_METH_ID);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__LAST_INVOICE_NUMBER);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__LAST_INVOICE_RESTART_DATE);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__LAST_ORDER_NUMBER);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__LAST_QUOTE_NUMBER);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__OLD_INVOICE_SEQUENCE_ENUM_ID);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__OLD_ORDER_SEQUENCE_ENUM_ID);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__OLD_QUOTE_SEQUENCE_ENUM_ID);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__ORDER_ID_PREFIX);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__ORDER_SEQ_CUST_METH_ID);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__QUOTE_ID_PREFIX);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__QUOTE_SEQ_CUST_METH_ID);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__REFUND_PAYMENT_METHOD_ID);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__TAX_FORM_ID);
		createEAttribute(partyAcctgPreferenceEClass, PARTY_ACCTG_PREFERENCE__USE_INVOICE_ID_FOR_RETURNS);

		partyGlAccountEClass = createEClass(PARTY_GL_ACCOUNT);
		createEAttribute(partyGlAccountEClass, PARTY_GL_ACCOUNT__ORGANIZATION_PARTY_ID);
		createEAttribute(partyGlAccountEClass, PARTY_GL_ACCOUNT__PARTY_ID);
		createEAttribute(partyGlAccountEClass, PARTY_GL_ACCOUNT__ROLE_TYPE_ID);
		createEAttribute(partyGlAccountEClass, PARTY_GL_ACCOUNT__GL_ACCOUNT_TYPE_ID);
		createEAttribute(partyGlAccountEClass, PARTY_GL_ACCOUNT__GL_ACCOUNT_ID);

		partyPrefDocTypeTplEClass = createEClass(PARTY_PREF_DOC_TYPE_TPL);
		createEAttribute(partyPrefDocTypeTplEClass, PARTY_PREF_DOC_TYPE_TPL__PARTY_PREF_DOC_TYPE_TPL_ID);
		createEAttribute(partyPrefDocTypeTplEClass, PARTY_PREF_DOC_TYPE_TPL__CUSTOM_SCREEN_ID);
		createEAttribute(partyPrefDocTypeTplEClass, PARTY_PREF_DOC_TYPE_TPL__FROM_DATE);
		createEAttribute(partyPrefDocTypeTplEClass, PARTY_PREF_DOC_TYPE_TPL__INVOICE_TYPE_ID);
		createEAttribute(partyPrefDocTypeTplEClass, PARTY_PREF_DOC_TYPE_TPL__ORDER_TYPE_ID);
		createEAttribute(partyPrefDocTypeTplEClass, PARTY_PREF_DOC_TYPE_TPL__PARTY_ID);
		createEAttribute(partyPrefDocTypeTplEClass, PARTY_PREF_DOC_TYPE_TPL__QUOTE_TYPE_ID);
		createEAttribute(partyPrefDocTypeTplEClass, PARTY_PREF_DOC_TYPE_TPL__THRU_DATE);

		productAverageCostEClass = createEClass(PRODUCT_AVERAGE_COST);
		createEAttribute(productAverageCostEClass, PRODUCT_AVERAGE_COST__PRODUCT_AVERAGE_COST_TYPE_ID);
		createEAttribute(productAverageCostEClass, PRODUCT_AVERAGE_COST__ORGANIZATION_PARTY_ID);
		createEAttribute(productAverageCostEClass, PRODUCT_AVERAGE_COST__PRODUCT_ID);
		createEAttribute(productAverageCostEClass, PRODUCT_AVERAGE_COST__FACILITY_ID);
		createEAttribute(productAverageCostEClass, PRODUCT_AVERAGE_COST__FROM_DATE);
		createEAttribute(productAverageCostEClass, PRODUCT_AVERAGE_COST__AVERAGE_COST);
		createEAttribute(productAverageCostEClass, PRODUCT_AVERAGE_COST__THRU_DATE);

		productAverageCostTypeEClass = createEClass(PRODUCT_AVERAGE_COST_TYPE);
		createEAttribute(productAverageCostTypeEClass, PRODUCT_AVERAGE_COST_TYPE__PRODUCT_AVERAGE_COST_TYPE_ID);
		createEAttribute(productAverageCostTypeEClass, PRODUCT_AVERAGE_COST_TYPE__DESCRIPTION);
		createEAttribute(productAverageCostTypeEClass, PRODUCT_AVERAGE_COST_TYPE__HAS_TABLE);
		createEAttribute(productAverageCostTypeEClass, PRODUCT_AVERAGE_COST_TYPE__PARENT_TYPE_ID);

		settlementTermEClass = createEClass(SETTLEMENT_TERM);
		createEAttribute(settlementTermEClass, SETTLEMENT_TERM__SETTLEMENT_TERM_ID);
		createEAttribute(settlementTermEClass, SETTLEMENT_TERM__TERM_NAME);
		createEAttribute(settlementTermEClass, SETTLEMENT_TERM__TERM_VALUE);
		createEAttribute(settlementTermEClass, SETTLEMENT_TERM__UOM_ID);

		varianceReasonGlAccountEClass = createEClass(VARIANCE_REASON_GL_ACCOUNT);
		createEAttribute(varianceReasonGlAccountEClass, VARIANCE_REASON_GL_ACCOUNT__VARIANCE_REASON_ID);
		createEAttribute(varianceReasonGlAccountEClass, VARIANCE_REASON_GL_ACCOUNT__ORGANIZATION_PARTY_ID);
		createEAttribute(varianceReasonGlAccountEClass, VARIANCE_REASON_GL_ACCOUNT__GL_ACCOUNT_ID);
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
		EGenericType g2 = createEGenericType(this.getAcctgTransType());
		g1.getETypeArguments().add(g2);
		acctgTransEClass.getEGenericSuperTypes().add(g1);
		acctgTransAttributeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getAcctgTransEntryType());
		g1.getETypeArguments().add(g2);
		acctgTransEntryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getAcctgTransEntry());
		g1.getETypeArguments().add(g2);
		acctgTransEntryTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getAcctgTrans());
		g1.getETypeArguments().add(g2);
		acctgTransTypeEClass.getEGenericSuperTypes().add(g1);
		acctgTransTypeAttrEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getGlAccountType());
		g1.getETypeArguments().add(g2);
		glAccountEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getGlAccountCategoryType());
		g1.getETypeArguments().add(g2);
		glAccountCategoryEClass.getEGenericSuperTypes().add(g1);
		glAccountCategoryMemberEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getGlAccountCategory());
		g1.getETypeArguments().add(g2);
		glAccountCategoryTypeEClass.getEGenericSuperTypes().add(g1);
		glAccountClassEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getGlAccountGroupType());
		g1.getETypeArguments().add(g2);
		glAccountGroupEClass.getEGenericSuperTypes().add(g1);
		glAccountGroupMemberEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getGlAccountGroup());
		g1.getETypeArguments().add(g2);
		glAccountGroupTypeEClass.getEGenericSuperTypes().add(g1);
		glAccountHistoryEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		glAccountOrganizationEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		glAccountRoleEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getGlAccount());
		g1.getETypeArguments().add(g2);
		glAccountTypeEClass.getEGenericSuperTypes().add(g1);
		glAccountTypeDefaultEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		glBudgetXrefEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		glFiscalTypeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		glJournalEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		glReconciliationEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		glReconciliationEntryEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		glResourceTypeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		glXbrlClassEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		partyAcctgPreferenceEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		partyGlAccountEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		partyPrefDocTypeTplEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getProductAverageCostType());
		g1.getETypeArguments().add(g2);
		productAverageCostEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getProductAverageCost());
		g1.getETypeArguments().add(g2);
		productAverageCostTypeEClass.getEGenericSuperTypes().add(g1);
		settlementTermEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		varianceReasonGlAccountEClass.getESuperTypes().add(theBizPackage.getBizEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(acctgTransEClass, AcctgTrans.class, "AcctgTrans", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcctgTrans_AcctgTransId(), ecorePackage.getEString(), "acctgTransId", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_AcctgTransTypeId(), ecorePackage.getEString(), "acctgTransTypeId", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_CreatedByUserLogin(), ecorePackage.getEString(), "createdByUserLogin", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_CreatedDate(), ecorePackage.getEDate(), "createdDate", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_Description(), ecorePackage.getEString(), "description", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_FinAccountTransId(), ecorePackage.getEString(), "finAccountTransId", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_FixedAssetId(), ecorePackage.getEString(), "fixedAssetId", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_GlFiscalTypeId(), ecorePackage.getEString(), "glFiscalTypeId", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_GlJournalId(), ecorePackage.getEString(), "glJournalId", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_GroupStatusId(), ecorePackage.getEString(), "groupStatusId", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_InventoryItemId(), ecorePackage.getEString(), "inventoryItemId", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_InvoiceId(), ecorePackage.getEString(), "invoiceId", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_IsPosted(), ecorePackage.getEBoolean(), "isPosted", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_LastModifiedByUserLogin(), ecorePackage.getEString(), "lastModifiedByUserLogin", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_LastModifiedDate(), ecorePackage.getEDate(), "lastModifiedDate", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_PartyId(), ecorePackage.getEString(), "partyId", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_PaymentId(), ecorePackage.getEString(), "paymentId", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_PhysicalInventoryId(), ecorePackage.getEString(), "physicalInventoryId", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_PostedDate(), ecorePackage.getEDate(), "postedDate", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_ReceiptId(), ecorePackage.getEString(), "receiptId", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_RoleTypeId(), ecorePackage.getEString(), "roleTypeId", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_ScheduledPostingDate(), ecorePackage.getEDate(), "scheduledPostingDate", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_ShipmentId(), ecorePackage.getEString(), "shipmentId", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_TheirAcctgTransId(), ecorePackage.getEString(), "theirAcctgTransId", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_TransactionDate(), ecorePackage.getEDate(), "transactionDate", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_VoucherDate(), ecorePackage.getEDate(), "voucherDate", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_VoucherRef(), ecorePackage.getEString(), "voucherRef", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 0, 1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_AcctgTransAttributes(), ecorePackage.getEString(), "acctgTransAttributes", null, 0, -1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTrans_AcctgTransEntries(), ecorePackage.getEString(), "acctgTransEntries", null, 0, -1, AcctgTrans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acctgTransAttributeEClass, AcctgTransAttribute.class, "AcctgTransAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcctgTransAttribute_AcctgTransId(), ecorePackage.getEString(), "acctgTransId", null, 0, 1, AcctgTransAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 0, 1, AcctgTransAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, AcctgTransAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, AcctgTransAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acctgTransEntryEClass, AcctgTransEntry.class, "AcctgTransEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcctgTransEntry_AcctgTransId(), ecorePackage.getEString(), "acctgTransId", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_AcctgTransEntrySeqId(), ecorePackage.getEString(), "acctgTransEntrySeqId", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_AcctgTransEntryTypeId(), ecorePackage.getEString(), "acctgTransEntryTypeId", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_Amount(), ecorePackage.getEBigDecimal(), "amount", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_CurrencyUomId(), ecorePackage.getEString(), "currencyUomId", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_DebitCreditFlag(), ecorePackage.getEBoolean(), "debitCreditFlag", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_Description(), ecorePackage.getEString(), "description", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_DueDate(), ecorePackage.getEDate(), "dueDate", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_GlAccountId(), ecorePackage.getEString(), "glAccountId", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_GlAccountTypeId(), ecorePackage.getEString(), "glAccountTypeId", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_GroupId(), ecorePackage.getEString(), "groupId", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_InventoryItemId(), ecorePackage.getEString(), "inventoryItemId", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_IsSummary(), ecorePackage.getEBoolean(), "isSummary", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_OrganizationPartyId(), ecorePackage.getEString(), "organizationPartyId", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_OrigAmount(), ecorePackage.getEBigDecimal(), "origAmount", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_OrigCurrencyUomId(), ecorePackage.getEString(), "origCurrencyUomId", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_PartyId(), ecorePackage.getEString(), "partyId", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_ProductId(), ecorePackage.getEString(), "productId", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_ReconcileStatusId(), ecorePackage.getEString(), "reconcileStatusId", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_RoleTypeId(), ecorePackage.getEString(), "roleTypeId", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_SettlementTermId(), ecorePackage.getEString(), "settlementTermId", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_TaxId(), ecorePackage.getEString(), "taxId", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_TheirPartyId(), ecorePackage.getEString(), "theirPartyId", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_TheirProductId(), ecorePackage.getEString(), "theirProductId", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntry_VoucherRef(), ecorePackage.getEString(), "voucherRef", null, 0, 1, AcctgTransEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acctgTransEntryTypeEClass, AcctgTransEntryType.class, "AcctgTransEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcctgTransEntryType_AcctgTransEntryTypeId(), ecorePackage.getEString(), "acctgTransEntryTypeId", null, 0, 1, AcctgTransEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntryType_Description(), ecorePackage.getEString(), "description", null, 0, 1, AcctgTransEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntryType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, AcctgTransEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransEntryType_ParentTypeId(), ecorePackage.getEString(), "parentTypeId", null, 0, 1, AcctgTransEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(acctgTransEntryTypeEClass, ecorePackage.getEString(), "acctgTransEntries", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(acctgTransEntryTypeEClass, ecorePackage.getEString(), "childAcctgTransEntryTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(acctgTransTypeEClass, AcctgTransType.class, "AcctgTransType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcctgTransType_AcctgTransTypeId(), ecorePackage.getEString(), "acctgTransTypeId", null, 0, 1, AcctgTransType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransType_Description(), ecorePackage.getEString(), "description", null, 0, 1, AcctgTransType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, AcctgTransType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransType_ParentTypeId(), ecorePackage.getEString(), "parentTypeId", null, 0, 1, AcctgTransType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransType_AcctgTransTypeAttrs(), ecorePackage.getEString(), "acctgTransTypeAttrs", null, 0, -1, AcctgTransType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(acctgTransTypeEClass, ecorePackage.getEString(), "acctgTranss", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(acctgTransTypeEClass, ecorePackage.getEString(), "childAcctgTransTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(acctgTransTypeAttrEClass, AcctgTransTypeAttr.class, "AcctgTransTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcctgTransTypeAttr_AcctgTransTypeId(), ecorePackage.getEString(), "acctgTransTypeId", null, 0, 1, AcctgTransTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 0, 1, AcctgTransTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcctgTransTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, AcctgTransTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glAccountEClass, GlAccount.class, "GlAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlAccount_GlAccountId(), ecorePackage.getEString(), "glAccountId", null, 0, 1, GlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccount_AccountCode(), ecorePackage.getEString(), "accountCode", null, 0, 1, GlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccount_AccountName(), ecorePackage.getEString(), "accountName", null, 0, 1, GlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccount_Description(), ecorePackage.getEString(), "description", null, 0, 1, GlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccount_ExternalId(), ecorePackage.getEString(), "externalId", null, 0, 1, GlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccount_GlAccountClassId(), ecorePackage.getEString(), "glAccountClassId", null, 0, 1, GlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccount_GlAccountTypeId(), ecorePackage.getEString(), "glAccountTypeId", null, 0, 1, GlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccount_GlResourceTypeId(), ecorePackage.getEString(), "glResourceTypeId", null, 0, 1, GlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccount_GlXbrlClassId(), ecorePackage.getEString(), "glXbrlClassId", null, 0, 1, GlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccount_ParentGlAccountId(), ecorePackage.getEString(), "parentGlAccountId", null, 0, 1, GlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccount_ProductId(), ecorePackage.getEString(), "productId", null, 0, 1, GlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccount_GlAccountGroupMembers(), ecorePackage.getEString(), "glAccountGroupMembers", null, 0, -1, GlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccount_GlAccountOrganizations(), ecorePackage.getEString(), "glAccountOrganizations", null, 0, -1, GlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(glAccountEClass, ecorePackage.getEString(), "acctgTransEntries", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(glAccountEClass, ecorePackage.getEString(), "childGlAccounts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(glAccountEClass, ecorePackage.getEString(), "defaultInvoiceItemTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(glAccountEClass, ecorePackage.getEString(), "defaultPaymentMethodTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(glAccountEClass, ecorePackage.getEString(), "finAccountTypeGlAccounts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(glAccountEClass, ecorePackage.getEString(), "glAccountTypeDefaults", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(glAccountEClass, ecorePackage.getEString(), "glReconciliations", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(glAccountEClass, ecorePackage.getEString(), "invoiceItemTypeGlAccounts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(glAccountEClass, ecorePackage.getEString(), "overrideInvoiceItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(glAccountEClass, ecorePackage.getEString(), "overrideOrderAdjustments", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(glAccountEClass, ecorePackage.getEString(), "overrideOrderItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(glAccountEClass, ecorePackage.getEString(), "overrideQuoteAdjustments", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(glAccountEClass, ecorePackage.getEString(), "overrideReturnAdjustments", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(glAccountEClass, ecorePackage.getEString(), "paymentApplications", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(glAccountEClass, ecorePackage.getEString(), "paymentMethodTypeGlAccounts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(glAccountEClass, ecorePackage.getEString(), "paymentMethods", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(glAccountEClass, ecorePackage.getEString(), "payments", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(glAccountEClass, ecorePackage.getEString(), "postToFinAccounts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(glAccountEClass, ecorePackage.getEString(), "varianceReasonGlAccounts", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(glAccountCategoryEClass, GlAccountCategory.class, "GlAccountCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlAccountCategory_GlAccountCategoryId(), ecorePackage.getEString(), "glAccountCategoryId", null, 0, 1, GlAccountCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountCategory_Description(), ecorePackage.getEString(), "description", null, 0, 1, GlAccountCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountCategory_GlAccountCategoryTypeId(), ecorePackage.getEString(), "glAccountCategoryTypeId", null, 0, 1, GlAccountCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glAccountCategoryMemberEClass, GlAccountCategoryMember.class, "GlAccountCategoryMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlAccountCategoryMember_GlAccountId(), ecorePackage.getEString(), "glAccountId", null, 0, 1, GlAccountCategoryMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountCategoryMember_GlAccountCategoryId(), ecorePackage.getEString(), "glAccountCategoryId", null, 0, 1, GlAccountCategoryMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountCategoryMember_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, GlAccountCategoryMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountCategoryMember_AmountPercentage(), ecorePackage.getEBigDecimal(), "amountPercentage", null, 0, 1, GlAccountCategoryMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountCategoryMember_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, GlAccountCategoryMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glAccountCategoryTypeEClass, GlAccountCategoryType.class, "GlAccountCategoryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlAccountCategoryType_GlAccountCategoryTypeId(), ecorePackage.getEString(), "glAccountCategoryTypeId", null, 0, 1, GlAccountCategoryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountCategoryType_Description(), ecorePackage.getEString(), "description", null, 0, 1, GlAccountCategoryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(glAccountCategoryTypeEClass, ecorePackage.getEString(), "glAccountCategories", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(glAccountClassEClass, GlAccountClass.class, "GlAccountClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlAccountClass_GlAccountClassId(), ecorePackage.getEString(), "glAccountClassId", null, 0, 1, GlAccountClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountClass_Description(), ecorePackage.getEString(), "description", null, 0, 1, GlAccountClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountClass_IsAssetClass(), ecorePackage.getEBoolean(), "isAssetClass", null, 0, 1, GlAccountClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountClass_ParentClassId(), ecorePackage.getEString(), "parentClassId", null, 0, 1, GlAccountClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountClass_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, GlAccountClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(glAccountClassEClass, ecorePackage.getEString(), "childGlAccountClasses", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(glAccountClassEClass, ecorePackage.getEString(), "glAccounts", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(glAccountGroupEClass, GlAccountGroup.class, "GlAccountGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlAccountGroup_GlAccountGroupId(), ecorePackage.getEString(), "glAccountGroupId", null, 0, 1, GlAccountGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountGroup_Description(), ecorePackage.getEString(), "description", null, 0, 1, GlAccountGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountGroup_GlAccountGroupTypeId(), ecorePackage.getEString(), "glAccountGroupTypeId", null, 0, 1, GlAccountGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(glAccountGroupEClass, ecorePackage.getEString(), "glAccountGroupMembers", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(glAccountGroupMemberEClass, GlAccountGroupMember.class, "GlAccountGroupMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlAccountGroupMember_GlAccountId(), ecorePackage.getEString(), "glAccountId", null, 0, 1, GlAccountGroupMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountGroupMember_GlAccountGroupTypeId(), ecorePackage.getEString(), "glAccountGroupTypeId", null, 0, 1, GlAccountGroupMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountGroupMember_GlAccountGroupId(), ecorePackage.getEString(), "glAccountGroupId", null, 0, 1, GlAccountGroupMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glAccountGroupTypeEClass, GlAccountGroupType.class, "GlAccountGroupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlAccountGroupType_GlAccountGroupTypeId(), ecorePackage.getEString(), "glAccountGroupTypeId", null, 0, 1, GlAccountGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountGroupType_Description(), ecorePackage.getEString(), "description", null, 0, 1, GlAccountGroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(glAccountGroupTypeEClass, ecorePackage.getEString(), "glAccountGroupMembers", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(glAccountGroupTypeEClass, ecorePackage.getEString(), "glAccountGroups", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(glAccountHistoryEClass, GlAccountHistory.class, "GlAccountHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlAccountHistory_GlAccountId(), ecorePackage.getEString(), "glAccountId", null, 0, 1, GlAccountHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountHistory_OrganizationPartyId(), ecorePackage.getEString(), "organizationPartyId", null, 0, 1, GlAccountHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountHistory_CustomTimePeriodId(), ecorePackage.getEString(), "customTimePeriodId", null, 0, 1, GlAccountHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountHistory_EndingBalance(), ecorePackage.getEBigDecimal(), "endingBalance", null, 0, 1, GlAccountHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountHistory_OpeningBalance(), ecorePackage.getEBigDecimal(), "openingBalance", null, 0, 1, GlAccountHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountHistory_PostedCredits(), ecorePackage.getEBigDecimal(), "postedCredits", null, 0, 1, GlAccountHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountHistory_PostedDebits(), ecorePackage.getEBigDecimal(), "postedDebits", null, 0, 1, GlAccountHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glAccountOrganizationEClass, GlAccountOrganization.class, "GlAccountOrganization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlAccountOrganization_GlAccountId(), ecorePackage.getEString(), "glAccountId", null, 0, 1, GlAccountOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountOrganization_OrganizationPartyId(), ecorePackage.getEString(), "organizationPartyId", null, 0, 1, GlAccountOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountOrganization_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, GlAccountOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountOrganization_RoleTypeId(), ecorePackage.getEString(), "roleTypeId", null, 0, 1, GlAccountOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountOrganization_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, GlAccountOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glAccountRoleEClass, GlAccountRole.class, "GlAccountRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlAccountRole_GlAccountId(), ecorePackage.getEString(), "glAccountId", null, 0, 1, GlAccountRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountRole_PartyId(), ecorePackage.getEString(), "partyId", null, 0, 1, GlAccountRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountRole_RoleTypeId(), ecorePackage.getEString(), "roleTypeId", null, 0, 1, GlAccountRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountRole_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, GlAccountRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountRole_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, GlAccountRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glAccountTypeEClass, GlAccountType.class, "GlAccountType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlAccountType_GlAccountTypeId(), ecorePackage.getEString(), "glAccountTypeId", null, 0, 1, GlAccountType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountType_Description(), ecorePackage.getEString(), "description", null, 0, 1, GlAccountType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, GlAccountType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountType_ParentTypeId(), ecorePackage.getEString(), "parentTypeId", null, 0, 1, GlAccountType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountType_GlAccountTypeDefaults(), ecorePackage.getEString(), "glAccountTypeDefaults", null, 0, -1, GlAccountType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(glAccountTypeEClass, ecorePackage.getEString(), "acctgTransEntries", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(glAccountTypeEClass, ecorePackage.getEString(), "childGlAccountTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(glAccountTypeEClass, ecorePackage.getEString(), "costCostComponentCalcs", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(glAccountTypeEClass, ecorePackage.getEString(), "glAccounts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(glAccountTypeEClass, ecorePackage.getEString(), "offsettingCostComponentCalcs", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(glAccountTypeEClass, ecorePackage.getEString(), "paymentGlAccountTypeMaps", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(glAccountTypeDefaultEClass, GlAccountTypeDefault.class, "GlAccountTypeDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlAccountTypeDefault_GlAccountTypeId(), ecorePackage.getEString(), "glAccountTypeId", null, 0, 1, GlAccountTypeDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountTypeDefault_OrganizationPartyId(), ecorePackage.getEString(), "organizationPartyId", null, 0, 1, GlAccountTypeDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlAccountTypeDefault_GlAccountId(), ecorePackage.getEString(), "glAccountId", null, 0, 1, GlAccountTypeDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glBudgetXrefEClass, GlBudgetXref.class, "GlBudgetXref", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlBudgetXref_GlAccountId(), ecorePackage.getEString(), "glAccountId", null, 0, 1, GlBudgetXref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlBudgetXref_BudgetItemTypeId(), ecorePackage.getEString(), "budgetItemTypeId", null, 0, 1, GlBudgetXref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlBudgetXref_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, GlBudgetXref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlBudgetXref_AllocationPercentage(), ecorePackage.getEBigDecimal(), "allocationPercentage", null, 0, 1, GlBudgetXref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlBudgetXref_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, GlBudgetXref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glFiscalTypeEClass, GlFiscalType.class, "GlFiscalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlFiscalType_GlFiscalTypeId(), ecorePackage.getEString(), "glFiscalTypeId", null, 0, 1, GlFiscalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlFiscalType_Description(), ecorePackage.getEString(), "description", null, 0, 1, GlFiscalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(glFiscalTypeEClass, ecorePackage.getEString(), "acctgTranss", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(glJournalEClass, GlJournal.class, "GlJournal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlJournal_GlJournalId(), ecorePackage.getEString(), "glJournalId", null, 0, 1, GlJournal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlJournal_GlJournalName(), ecorePackage.getEString(), "glJournalName", null, 0, 1, GlJournal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlJournal_IsPosted(), ecorePackage.getEBoolean(), "isPosted", null, 0, 1, GlJournal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlJournal_OrganizationPartyId(), ecorePackage.getEString(), "organizationPartyId", null, 0, 1, GlJournal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlJournal_PostedDate(), ecorePackage.getEDate(), "postedDate", null, 0, 1, GlJournal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(glJournalEClass, ecorePackage.getEString(), "acctgTranss", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(glJournalEClass, ecorePackage.getEString(), "partyAcctgPreferences", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(glReconciliationEClass, GlReconciliation.class, "GlReconciliation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlReconciliation_GlReconciliationId(), ecorePackage.getEString(), "glReconciliationId", null, 0, 1, GlReconciliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlReconciliation_CreatedByUserLogin(), ecorePackage.getEString(), "createdByUserLogin", null, 0, 1, GlReconciliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlReconciliation_CreatedDate(), ecorePackage.getEDate(), "createdDate", null, 0, 1, GlReconciliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlReconciliation_Description(), ecorePackage.getEString(), "description", null, 0, 1, GlReconciliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlReconciliation_GlAccountId(), ecorePackage.getEString(), "glAccountId", null, 0, 1, GlReconciliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlReconciliation_GlReconciliationName(), ecorePackage.getEString(), "glReconciliationName", null, 0, 1, GlReconciliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlReconciliation_LastModifiedByUserLogin(), ecorePackage.getEString(), "lastModifiedByUserLogin", null, 0, 1, GlReconciliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlReconciliation_LastModifiedDate(), ecorePackage.getEDate(), "lastModifiedDate", null, 0, 1, GlReconciliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlReconciliation_OpeningBalance(), ecorePackage.getEBigDecimal(), "openingBalance", null, 0, 1, GlReconciliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlReconciliation_OrganizationPartyId(), ecorePackage.getEString(), "organizationPartyId", null, 0, 1, GlReconciliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlReconciliation_ReconciledBalance(), ecorePackage.getEBigDecimal(), "reconciledBalance", null, 0, 1, GlReconciliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlReconciliation_ReconciledDate(), ecorePackage.getEDate(), "reconciledDate", null, 0, 1, GlReconciliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlReconciliation_StatusId(), ecorePackage.getEString(), "statusId", null, 0, 1, GlReconciliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(glReconciliationEClass, ecorePackage.getEString(), "finAccountTranss", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(glReconciliationEntryEClass, GlReconciliationEntry.class, "GlReconciliationEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlReconciliationEntry_GlReconciliationId(), ecorePackage.getEString(), "glReconciliationId", null, 0, 1, GlReconciliationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlReconciliationEntry_AcctgTransId(), ecorePackage.getEString(), "acctgTransId", null, 0, 1, GlReconciliationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlReconciliationEntry_AcctgTransEntrySeqId(), ecorePackage.getEString(), "acctgTransEntrySeqId", null, 0, 1, GlReconciliationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlReconciliationEntry_ReconciledAmount(), ecorePackage.getEBigDecimal(), "reconciledAmount", null, 0, 1, GlReconciliationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glResourceTypeEClass, GlResourceType.class, "GlResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlResourceType_GlResourceTypeId(), ecorePackage.getEString(), "glResourceTypeId", null, 0, 1, GlResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlResourceType_Description(), ecorePackage.getEString(), "description", null, 0, 1, GlResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(glResourceTypeEClass, ecorePackage.getEString(), "glAccounts", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(glXbrlClassEClass, GlXbrlClass.class, "GlXbrlClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlXbrlClass_GlXbrlClassId(), ecorePackage.getEString(), "glXbrlClassId", null, 0, 1, GlXbrlClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlXbrlClass_Description(), ecorePackage.getEString(), "description", null, 0, 1, GlXbrlClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(glXbrlClassEClass, ecorePackage.getEString(), "glAccounts", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(partyAcctgPreferenceEClass, PartyAcctgPreference.class, "PartyAcctgPreference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyAcctgPreference_PartyId(), ecorePackage.getEString(), "partyId", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_BaseCurrencyUomId(), ecorePackage.getEString(), "baseCurrencyUomId", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_CogsMethodId(), ecorePackage.getEString(), "cogsMethodId", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_EnableAccounting(), ecorePackage.getEBoolean(), "enableAccounting", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_ErrorGlJournalId(), ecorePackage.getEString(), "errorGlJournalId", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_FiscalYearStartDay(), ecorePackage.getELong(), "fiscalYearStartDay", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_FiscalYearStartMonth(), ecorePackage.getELong(), "fiscalYearStartMonth", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_InvoiceIdPrefix(), ecorePackage.getEString(), "invoiceIdPrefix", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_InvoiceSeqCustMethId(), ecorePackage.getEString(), "invoiceSeqCustMethId", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_LastInvoiceNumber(), ecorePackage.getELong(), "lastInvoiceNumber", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_LastInvoiceRestartDate(), ecorePackage.getEDate(), "lastInvoiceRestartDate", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_LastOrderNumber(), ecorePackage.getELong(), "lastOrderNumber", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_LastQuoteNumber(), ecorePackage.getELong(), "lastQuoteNumber", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_OldInvoiceSequenceEnumId(), ecorePackage.getEString(), "oldInvoiceSequenceEnumId", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_OldOrderSequenceEnumId(), ecorePackage.getEString(), "oldOrderSequenceEnumId", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_OldQuoteSequenceEnumId(), ecorePackage.getEString(), "oldQuoteSequenceEnumId", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_OrderIdPrefix(), ecorePackage.getEString(), "orderIdPrefix", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_OrderSeqCustMethId(), ecorePackage.getEString(), "orderSeqCustMethId", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_QuoteIdPrefix(), ecorePackage.getEString(), "quoteIdPrefix", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_QuoteSeqCustMethId(), ecorePackage.getEString(), "quoteSeqCustMethId", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_RefundPaymentMethodId(), ecorePackage.getEString(), "refundPaymentMethodId", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_TaxFormId(), ecorePackage.getEString(), "taxFormId", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAcctgPreference_UseInvoiceIdForReturns(), ecorePackage.getEBoolean(), "useInvoiceIdForReturns", null, 0, 1, PartyAcctgPreference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(partyAcctgPreferenceEClass, ecorePackage.getEString(), "partyPrefDocTypeTpls", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(partyGlAccountEClass, PartyGlAccount.class, "PartyGlAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyGlAccount_OrganizationPartyId(), ecorePackage.getEString(), "organizationPartyId", null, 0, 1, PartyGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyGlAccount_PartyId(), ecorePackage.getEString(), "partyId", null, 0, 1, PartyGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyGlAccount_RoleTypeId(), ecorePackage.getEString(), "roleTypeId", null, 0, 1, PartyGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyGlAccount_GlAccountTypeId(), ecorePackage.getEString(), "glAccountTypeId", null, 0, 1, PartyGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyGlAccount_GlAccountId(), ecorePackage.getEString(), "glAccountId", null, 0, 1, PartyGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyPrefDocTypeTplEClass, PartyPrefDocTypeTpl.class, "PartyPrefDocTypeTpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyPrefDocTypeTpl_PartyPrefDocTypeTplId(), ecorePackage.getEString(), "partyPrefDocTypeTplId", null, 0, 1, PartyPrefDocTypeTpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyPrefDocTypeTpl_CustomScreenId(), ecorePackage.getEString(), "customScreenId", null, 0, 1, PartyPrefDocTypeTpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyPrefDocTypeTpl_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, PartyPrefDocTypeTpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyPrefDocTypeTpl_InvoiceTypeId(), ecorePackage.getEString(), "invoiceTypeId", null, 0, 1, PartyPrefDocTypeTpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyPrefDocTypeTpl_OrderTypeId(), ecorePackage.getEString(), "orderTypeId", null, 0, 1, PartyPrefDocTypeTpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyPrefDocTypeTpl_PartyId(), ecorePackage.getEString(), "partyId", null, 0, 1, PartyPrefDocTypeTpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyPrefDocTypeTpl_QuoteTypeId(), ecorePackage.getEString(), "quoteTypeId", null, 0, 1, PartyPrefDocTypeTpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyPrefDocTypeTpl_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, PartyPrefDocTypeTpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productAverageCostEClass, ProductAverageCost.class, "ProductAverageCost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductAverageCost_ProductAverageCostTypeId(), ecorePackage.getEString(), "productAverageCostTypeId", null, 0, 1, ProductAverageCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAverageCost_OrganizationPartyId(), ecorePackage.getEString(), "organizationPartyId", null, 0, 1, ProductAverageCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAverageCost_ProductId(), ecorePackage.getEString(), "productId", null, 0, 1, ProductAverageCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAverageCost_FacilityId(), ecorePackage.getEString(), "facilityId", null, 0, 1, ProductAverageCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAverageCost_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, ProductAverageCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAverageCost_AverageCost(), ecorePackage.getEBigDecimal(), "averageCost", null, 0, 1, ProductAverageCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAverageCost_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, ProductAverageCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productAverageCostTypeEClass, ProductAverageCostType.class, "ProductAverageCostType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductAverageCostType_ProductAverageCostTypeId(), ecorePackage.getEString(), "productAverageCostTypeId", null, 0, 1, ProductAverageCostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAverageCostType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProductAverageCostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAverageCostType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, ProductAverageCostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductAverageCostType_ParentTypeId(), ecorePackage.getEString(), "parentTypeId", null, 0, 1, ProductAverageCostType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(productAverageCostTypeEClass, ecorePackage.getEString(), "childProductAverageCostTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(settlementTermEClass, SettlementTerm.class, "SettlementTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSettlementTerm_SettlementTermId(), ecorePackage.getEString(), "settlementTermId", null, 0, 1, SettlementTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettlementTerm_TermName(), ecorePackage.getEString(), "termName", null, 0, 1, SettlementTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettlementTerm_TermValue(), ecorePackage.getELong(), "termValue", null, 0, 1, SettlementTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettlementTerm_UomId(), ecorePackage.getEString(), "uomId", null, 0, 1, SettlementTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(settlementTermEClass, ecorePackage.getEString(), "acctgTransEntries", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(varianceReasonGlAccountEClass, VarianceReasonGlAccount.class, "VarianceReasonGlAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVarianceReasonGlAccount_VarianceReasonId(), ecorePackage.getEString(), "varianceReasonId", null, 0, 1, VarianceReasonGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVarianceReasonGlAccount_OrganizationPartyId(), ecorePackage.getEString(), "organizationPartyId", null, 0, 1, VarianceReasonGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVarianceReasonGlAccount_GlAccountId(), ecorePackage.getEString(), "glAccountId", null, 0, 1, VarianceReasonGlAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (acctgTransEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (acctgTransEntryEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (acctgTransEntryTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (acctgTransTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (acctgTransTypeAttrEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (glAccountEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (glAccountCategoryEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (glAccountCategoryTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (glAccountClassEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (glAccountGroupEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (glAccountGroupTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (glAccountTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (glFiscalTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (glReconciliationEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (glResourceTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (glXbrlClassEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (productAverageCostTypeEClass,
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
		  (getAcctgTrans_AcctgTransId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAcctgTrans_AcctgTransAttributes(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getAcctgTrans_AcctgTransEntries(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getAcctgTransAttribute_AcctgTransId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAcctgTransAttribute_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAcctgTransEntry_AcctgTransId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAcctgTransEntry_AcctgTransEntrySeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (acctgTransEntryTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (acctgTransEntryTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getAcctgTransEntryType_AcctgTransEntryTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (acctgTransTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (acctgTransTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getAcctgTransType_AcctgTransTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAcctgTransType_AcctgTransTypeAttrs(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getAcctgTransTypeAttr_AcctgTransTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAcctgTransTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(3),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(4),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(5),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(6),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(7),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(8),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(9),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(10),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(11),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(12),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(13),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(14),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(15),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(16),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(17),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(18),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getGlAccount_GlAccountId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccount_GlAccountGroupMembers(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getGlAccount_GlAccountOrganizations(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getGlAccountCategory_GlAccountCategoryId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountCategoryMember_GlAccountId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountCategoryMember_GlAccountCategoryId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountCategoryMember_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (glAccountCategoryTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getGlAccountCategoryType_GlAccountCategoryTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (glAccountClassEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (glAccountClassEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getGlAccountClass_GlAccountClassId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (glAccountGroupEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getGlAccountGroup_GlAccountGroupId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountGroupMember_GlAccountId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountGroupMember_GlAccountGroupTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (glAccountGroupTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (glAccountGroupTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getGlAccountGroupType_GlAccountGroupTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountHistory_GlAccountId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountHistory_OrganizationPartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountHistory_CustomTimePeriodId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountOrganization_GlAccountId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountOrganization_OrganizationPartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountRole_GlAccountId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountRole_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountRole_RoleTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountRole_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (glAccountTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (glAccountTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (glAccountTypeEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (glAccountTypeEClass.getEOperations().get(3),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (glAccountTypeEClass.getEOperations().get(4),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (glAccountTypeEClass.getEOperations().get(5),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getGlAccountType_GlAccountTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountType_GlAccountTypeDefaults(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getGlAccountTypeDefault_GlAccountTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlAccountTypeDefault_OrganizationPartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlBudgetXref_GlAccountId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlBudgetXref_BudgetItemTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlBudgetXref_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (glFiscalTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getGlFiscalType_GlFiscalTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (glJournalEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (glJournalEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getGlJournal_GlJournalId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (glReconciliationEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getGlReconciliation_GlReconciliationId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlReconciliationEntry_GlReconciliationId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlReconciliationEntry_AcctgTransId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getGlReconciliationEntry_AcctgTransEntrySeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (glResourceTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getGlResourceType_GlResourceTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (glXbrlClassEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getGlXbrlClass_GlXbrlClassId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (partyAcctgPreferenceEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getPartyAcctgPreference_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyGlAccount_OrganizationPartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyGlAccount_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyGlAccount_RoleTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyGlAccount_GlAccountTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyPrefDocTypeTpl_PartyPrefDocTypeTplId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductAverageCost_ProductAverageCostTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductAverageCost_OrganizationPartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductAverageCost_ProductId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductAverageCost_FacilityId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getProductAverageCost_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (productAverageCostTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getProductAverageCostType_ProductAverageCostTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (settlementTermEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getSettlementTerm_SettlementTermId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getVarianceReasonGlAccount_VarianceReasonId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getVarianceReasonGlAccount_OrganizationPartyId(),
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
		  (getAcctgTrans_AcctgTransTypeId(),
		   source,
		   new String[] {
			   "frame", "AcctgTransType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTrans_FinAccountTransId(),
		   source,
		   new String[] {
			   "frame", "FinAccountTrans"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTrans_FixedAssetId(),
		   source,
		   new String[] {
			   "frame", "FixedAsset"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTrans_GlFiscalTypeId(),
		   source,
		   new String[] {
			   "frame", "GlFiscalType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTrans_GlJournalId(),
		   source,
		   new String[] {
			   "frame", "GlJournal"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTrans_GroupStatusId(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTrans_InventoryItemId(),
		   source,
		   new String[] {
			   "frame", "InventoryItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTrans_InvoiceId(),
		   source,
		   new String[] {
			   "frame", "Invoice"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTrans_PartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTrans_PaymentId(),
		   source,
		   new String[] {
			   "frame", "Payment"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTrans_PhysicalInventoryId(),
		   source,
		   new String[] {
			   "frame", "PhysicalInventory"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTrans_ReceiptId(),
		   source,
		   new String[] {
			   "frame", "ShipmentReceipt"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTrans_RoleTypeId(),
		   source,
		   new String[] {
			   "frame", "RoleType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTrans_ShipmentId(),
		   source,
		   new String[] {
			   "frame", "Shipment"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTrans_WorkEffortId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTrans_AcctgTransAttributes(),
		   source,
		   new String[] {
			   "frame", "AcctgTransAttribute"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTrans_AcctgTransEntries(),
		   source,
		   new String[] {
			   "frame", "AcctgTransEntry"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTransAttribute_AcctgTransId(),
		   source,
		   new String[] {
			   "frame", "AcctgTrans"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTransEntry_AcctgTransId(),
		   source,
		   new String[] {
			   "frame", "AcctgTrans"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTransEntry_AcctgTransEntryTypeId(),
		   source,
		   new String[] {
			   "frame", "AcctgTransEntryType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTransEntry_CurrencyUomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTransEntry_GlAccountId(),
		   source,
		   new String[] {
			   "frame", "GlAccount"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTransEntry_GlAccountTypeId(),
		   source,
		   new String[] {
			   "frame", "GlAccountType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTransEntry_InventoryItemId(),
		   source,
		   new String[] {
			   "frame", "InventoryItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTransEntry_OrigCurrencyUomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTransEntry_PartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTransEntry_ReconcileStatusId(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTransEntry_RoleTypeId(),
		   source,
		   new String[] {
			   "frame", "RoleType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTransEntry_SettlementTermId(),
		   source,
		   new String[] {
			   "frame", "SettlementTerm"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (acctgTransEntryTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "AcctgTransEntry",
			   "route", "acctgTransEntryTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (acctgTransEntryTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "AcctgTransEntryType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTransEntryType_ParentTypeId(),
		   source,
		   new String[] {
			   "frame", "AcctgTransEntryType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (acctgTransTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "AcctgTrans",
			   "route", "acctgTransTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (acctgTransTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "AcctgTransType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTransType_ParentTypeId(),
		   source,
		   new String[] {
			   "frame", "AcctgTransType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTransType_AcctgTransTypeAttrs(),
		   source,
		   new String[] {
			   "frame", "AcctgTransTypeAttr"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getAcctgTransTypeAttr_AcctgTransTypeId(),
		   source,
		   new String[] {
			   "frame", "AcctgTransType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "AcctgTransEntry",
			   "route", "glAccountId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "GlAccount",
			   "route", "parentGlAccountId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "frame", "InvoiceItemType",
			   "route", "defaultGlAccountId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(3),
		   source,
		   new String[] {
			   "frame", "PaymentMethodType",
			   "route", "defaultGlAccountId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(4),
		   source,
		   new String[] {
			   "frame", "FinAccountTypeGlAccount",
			   "route", "glAccountId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(5),
		   source,
		   new String[] {
			   "frame", "GlAccountTypeDefault",
			   "route", "glAccountId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(6),
		   source,
		   new String[] {
			   "frame", "GlReconciliation",
			   "route", "glAccountId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(7),
		   source,
		   new String[] {
			   "frame", "InvoiceItemTypeGlAccount",
			   "route", "glAccountId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(8),
		   source,
		   new String[] {
			   "frame", "InvoiceItem",
			   "route", "overrideGlAccountId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(9),
		   source,
		   new String[] {
			   "frame", "OrderAdjustment",
			   "route", "overrideGlAccountId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(10),
		   source,
		   new String[] {
			   "frame", "OrderItem",
			   "route", "overrideGlAccountId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(11),
		   source,
		   new String[] {
			   "frame", "QuoteAdjustment",
			   "route", "overrideGlAccountId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(12),
		   source,
		   new String[] {
			   "frame", "ReturnAdjustment",
			   "route", "overrideGlAccountId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(13),
		   source,
		   new String[] {
			   "frame", "PaymentApplication",
			   "route", "overrideGlAccountId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(14),
		   source,
		   new String[] {
			   "frame", "PaymentMethodTypeGlAccount",
			   "route", "glAccountId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(15),
		   source,
		   new String[] {
			   "frame", "PaymentMethod",
			   "route", "glAccountId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(16),
		   source,
		   new String[] {
			   "frame", "Payment",
			   "route", "overrideGlAccountId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(17),
		   source,
		   new String[] {
			   "frame", "FinAccount",
			   "route", "postToGlAccountId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountEClass.getEOperations().get(18),
		   source,
		   new String[] {
			   "frame", "VarianceReasonGlAccount",
			   "route", "glAccountId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccount_GlAccountClassId(),
		   source,
		   new String[] {
			   "frame", "GlAccountClass"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccount_GlAccountTypeId(),
		   source,
		   new String[] {
			   "frame", "GlAccountType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccount_GlResourceTypeId(),
		   source,
		   new String[] {
			   "frame", "GlResourceType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccount_GlXbrlClassId(),
		   source,
		   new String[] {
			   "frame", "GlXbrlClass"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccount_ParentGlAccountId(),
		   source,
		   new String[] {
			   "frame", "GlAccount"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccount_GlAccountGroupMembers(),
		   source,
		   new String[] {
			   "frame", "GlAccountGroupMember"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccount_GlAccountOrganizations(),
		   source,
		   new String[] {
			   "frame", "GlAccountOrganization"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccountCategory_GlAccountCategoryTypeId(),
		   source,
		   new String[] {
			   "frame", "GlAccountCategoryType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccountCategoryMember_GlAccountId(),
		   source,
		   new String[] {
			   "frame", "GlAccount"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccountCategoryMember_GlAccountCategoryId(),
		   source,
		   new String[] {
			   "frame", "GlAccountCategory"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountCategoryTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "GlAccountCategory",
			   "route", "glAccountCategoryTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountClassEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "GlAccountClass",
			   "route", "parentClassId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountClassEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "GlAccount",
			   "route", "glAccountClassId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccountClass_ParentClassId(),
		   source,
		   new String[] {
			   "frame", "GlAccountClass"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountGroupEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "GlAccountGroupMember",
			   "route", "glAccountGroupId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccountGroup_GlAccountGroupTypeId(),
		   source,
		   new String[] {
			   "frame", "GlAccountGroupType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccountGroupMember_GlAccountId(),
		   source,
		   new String[] {
			   "frame", "GlAccount"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccountGroupMember_GlAccountGroupTypeId(),
		   source,
		   new String[] {
			   "frame", "GlAccountGroupType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccountGroupMember_GlAccountGroupId(),
		   source,
		   new String[] {
			   "frame", "GlAccountGroup"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountGroupTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "GlAccountGroupMember",
			   "route", "glAccountGroupTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountGroupTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "GlAccountGroup",
			   "route", "glAccountGroupTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccountHistory_GlAccountId(),
		   source,
		   new String[] {
			   "frame", "GlAccount"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccountHistory_OrganizationPartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccountHistory_CustomTimePeriodId(),
		   source,
		   new String[] {
			   "frame", "CustomTimePeriod"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccountOrganization_GlAccountId(),
		   source,
		   new String[] {
			   "frame", "GlAccount"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccountOrganization_OrganizationPartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccountOrganization_RoleTypeId(),
		   source,
		   new String[] {
			   "frame", "RoleType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccountRole_GlAccountId(),
		   source,
		   new String[] {
			   "frame", "GlAccount"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccountRole_PartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccountRole_RoleTypeId(),
		   source,
		   new String[] {
			   "frame", "RoleType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "AcctgTransEntry",
			   "route", "glAccountTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "GlAccountType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountTypeEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "frame", "CostComponentCalc",
			   "route", "costGlAccountTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountTypeEClass.getEOperations().get(3),
		   source,
		   new String[] {
			   "frame", "GlAccount",
			   "route", "glAccountTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountTypeEClass.getEOperations().get(4),
		   source,
		   new String[] {
			   "frame", "CostComponentCalc",
			   "route", "offsettingGlAccountTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glAccountTypeEClass.getEOperations().get(5),
		   source,
		   new String[] {
			   "frame", "PaymentGlAccountTypeMap",
			   "route", "glAccountTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccountType_ParentTypeId(),
		   source,
		   new String[] {
			   "frame", "GlAccountType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccountType_GlAccountTypeDefaults(),
		   source,
		   new String[] {
			   "frame", "GlAccountTypeDefault"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccountTypeDefault_GlAccountTypeId(),
		   source,
		   new String[] {
			   "frame", "GlAccountType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccountTypeDefault_OrganizationPartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlAccountTypeDefault_GlAccountId(),
		   source,
		   new String[] {
			   "frame", "GlAccount"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlBudgetXref_GlAccountId(),
		   source,
		   new String[] {
			   "frame", "GlAccount"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlBudgetXref_BudgetItemTypeId(),
		   source,
		   new String[] {
			   "frame", "BudgetItemType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glFiscalTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "AcctgTrans",
			   "route", "glFiscalTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glJournalEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "AcctgTrans",
			   "route", "glJournalId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glJournalEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "PartyAcctgPreference",
			   "route", "errorGlJournalId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlJournal_OrganizationPartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glReconciliationEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "FinAccountTrans",
			   "route", "glReconciliationId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlReconciliation_GlAccountId(),
		   source,
		   new String[] {
			   "frame", "GlAccount"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlReconciliation_OrganizationPartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlReconciliation_StatusId(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlReconciliationEntry_GlReconciliationId(),
		   source,
		   new String[] {
			   "frame", "GlReconciliation"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getGlReconciliationEntry_AcctgTransId(),
		   source,
		   new String[] {
			   "frame", "AcctgTrans"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glResourceTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "GlAccount",
			   "route", "glResourceTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (glXbrlClassEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "GlAccount",
			   "route", "glXbrlClassId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyAcctgPreferenceEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "PartyPrefDocTypeTpl",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getPartyAcctgPreference_PartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getPartyAcctgPreference_BaseCurrencyUomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getPartyAcctgPreference_CogsMethodId(),
		   source,
		   new String[] {
			   "frame", "Enumeration"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getPartyAcctgPreference_ErrorGlJournalId(),
		   source,
		   new String[] {
			   "frame", "GlJournal"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getPartyAcctgPreference_InvoiceSeqCustMethId(),
		   source,
		   new String[] {
			   "frame", "CustomMethod"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getPartyAcctgPreference_OldInvoiceSequenceEnumId(),
		   source,
		   new String[] {
			   "frame", "Enumeration"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getPartyAcctgPreference_OldOrderSequenceEnumId(),
		   source,
		   new String[] {
			   "frame", "Enumeration"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getPartyAcctgPreference_OldQuoteSequenceEnumId(),
		   source,
		   new String[] {
			   "frame", "Enumeration"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getPartyAcctgPreference_OrderSeqCustMethId(),
		   source,
		   new String[] {
			   "frame", "CustomMethod"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getPartyAcctgPreference_QuoteSeqCustMethId(),
		   source,
		   new String[] {
			   "frame", "CustomMethod"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getPartyAcctgPreference_RefundPaymentMethodId(),
		   source,
		   new String[] {
			   "frame", "PaymentMethod"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getPartyAcctgPreference_TaxFormId(),
		   source,
		   new String[] {
			   "frame", "Enumeration"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getPartyGlAccount_OrganizationPartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getPartyGlAccount_PartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getPartyGlAccount_RoleTypeId(),
		   source,
		   new String[] {
			   "frame", "RoleType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getPartyGlAccount_GlAccountTypeId(),
		   source,
		   new String[] {
			   "frame", "GlAccountType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getPartyGlAccount_GlAccountId(),
		   source,
		   new String[] {
			   "frame", "GlAccount"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getPartyPrefDocTypeTpl_InvoiceTypeId(),
		   source,
		   new String[] {
			   "frame", "InvoiceType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getPartyPrefDocTypeTpl_OrderTypeId(),
		   source,
		   new String[] {
			   "frame", "OrderType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getPartyPrefDocTypeTpl_PartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getPartyPrefDocTypeTpl_QuoteTypeId(),
		   source,
		   new String[] {
			   "frame", "QuoteType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductAverageCost_ProductAverageCostTypeId(),
		   source,
		   new String[] {
			   "frame", "ProductAverageCostType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductAverageCost_OrganizationPartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductAverageCost_ProductId(),
		   source,
		   new String[] {
			   "frame", "Product"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductAverageCost_FacilityId(),
		   source,
		   new String[] {
			   "frame", "Facility"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (productAverageCostTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "ProductAverageCostType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getProductAverageCostType_ParentTypeId(),
		   source,
		   new String[] {
			   "frame", "ProductAverageCostType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (settlementTermEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "AcctgTransEntry",
			   "route", "settlementTermId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getVarianceReasonGlAccount_VarianceReasonId(),
		   source,
		   new String[] {
			   "frame", "VarianceReason"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getVarianceReasonGlAccount_OrganizationPartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getVarianceReasonGlAccount_GlAccountId(),
		   source,
		   new String[] {
			   "frame", "GlAccount"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
	}

} //LedgerPackageImpl
