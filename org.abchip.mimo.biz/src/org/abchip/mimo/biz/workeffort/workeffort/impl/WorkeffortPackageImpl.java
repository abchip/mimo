/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort.impl;

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
import org.abchip.mimo.biz.workeffort.workeffort.ApplicationSandbox;
import org.abchip.mimo.biz.workeffort.workeffort.CommunicationEventWorkEff;
import org.abchip.mimo.biz.workeffort.workeffort.Deliverable;
import org.abchip.mimo.biz.workeffort.workeffort.DeliverableType;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssoc;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocAttribute;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocType;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAssocTypeAttr;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortAttribute;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortBilling;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContactMech;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContent;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortContentType;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortCostCalc;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortDeliverableProd;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortEventReminder;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetAssign;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortFixedAssetStd;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandard;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortGoodStandardType;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortIcalData;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortInventoryAssign;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortInventoryProduced;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortKeyword;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortNote;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPurposeType;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortReview;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchConstraint;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSearchResult;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSkillStandard;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortStatus;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortSurveyAppl;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortTransBox;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortType;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortTypeAttr;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortFactory;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
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
public class WorkeffortPackageImpl extends EPackageImpl implements WorkeffortPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationSandboxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationEventWorkEffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deliverableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deliverableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortAssocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortAssocAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortAssocTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortAssocTypeAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortBillingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortContactMechEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortContentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortCostCalcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortDeliverableProdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortEventReminderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortFixedAssetAssignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortFixedAssetStdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortGoodStandardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortGoodStandardTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortIcalDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortInventoryAssignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortInventoryProducedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortKeywordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortPartyAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortPurposeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortReviewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortSearchConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortSearchResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortSkillStandardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortSurveyApplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortTransBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workEffortTypeAttrEClass = null;

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
	 * @see org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WorkeffortPackageImpl() {
		super(eNS_URI, WorkeffortFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WorkeffortPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WorkeffortPackage init() {
		if (isInited) return (WorkeffortPackage)EPackage.Registry.INSTANCE.getEPackage(WorkeffortPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWorkeffortPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		WorkeffortPackageImpl theWorkeffortPackage = registeredWorkeffortPackage instanceof WorkeffortPackageImpl ? (WorkeffortPackageImpl)registeredWorkeffortPackage : new WorkeffortPackageImpl();

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

		// Create package meta-data objects
		theWorkeffortPackage.createPackageContents();
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

		// Initialize created meta-data
		theWorkeffortPackage.initializePackageContents();
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

		// Mark meta-data to indicate it can't be changed
		theWorkeffortPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WorkeffortPackage.eNS_URI, theWorkeffortPackage);
		return theWorkeffortPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApplicationSandbox() {
		return applicationSandboxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationSandbox_ApplicationId() {
		return (EAttribute)applicationSandboxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationSandbox_FromDate() {
		return (EAttribute)applicationSandboxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationSandbox_PartyId() {
		return (EAttribute)applicationSandboxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationSandbox_RoleTypeId() {
		return (EAttribute)applicationSandboxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationSandbox_RuntimeDataId() {
		return (EAttribute)applicationSandboxEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApplicationSandbox_WorkEffortId() {
		return (EAttribute)applicationSandboxEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommunicationEventWorkEff() {
		return communicationEventWorkEffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationEventWorkEff_WorkEffortId() {
		return (EAttribute)communicationEventWorkEffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationEventWorkEff_CommunicationEventId() {
		return (EAttribute)communicationEventWorkEffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationEventWorkEff_Description() {
		return (EAttribute)communicationEventWorkEffEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeliverable() {
		return deliverableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeliverable_DeliverableId() {
		return (EAttribute)deliverableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeliverable_DeliverableName() {
		return (EAttribute)deliverableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeliverable_DeliverableTypeId() {
		return (EAttribute)deliverableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeliverable_Description() {
		return (EAttribute)deliverableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeliverableType() {
		return deliverableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeliverableType_DeliverableTypeId() {
		return (EAttribute)deliverableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeliverableType_Description() {
		return (EAttribute)deliverableTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffort() {
		return workEffortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_WorkEffortId() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_AccommodationMapId() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_AccommodationSpotId() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_ActualCompletionDate() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_ActualMilliSeconds() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_ActualSetupMillis() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_ActualStartDate() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_CreatedByUserLogin() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_CreatedDate() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_CurrentStatusId() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_Description() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_EstimateCalcMethod() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_EstimatedCompletionDate() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_EstimatedMilliSeconds() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_EstimatedSetupMillis() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_EstimatedStartDate() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_FacilityId() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_FixedAssetId() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_InfoUrl() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_LastModifiedByUserLogin() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_LastModifiedDate() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_LastStatusUpdate() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_LocationDesc() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_MoneyUomId() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_NoteId() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_PercentComplete() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_Priority() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_QuantityProduced() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_QuantityRejected() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_QuantityToProduce() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_RecurrenceInfoId() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_Reserv2ndPPPerc() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_ReservNthPPPerc() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_ReservPersons() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_RevisionNumber() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_RuntimeDataId() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_ScopeEnumId() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_SendNotificationEmail() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_ServiceLoaderName() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_ShowAsEnumId() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_SourceReferenceId() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_SpecialTerms() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_TempExprId() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_TimeTransparency() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_TotalMilliSecondsAllowed() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_TotalMoneyAllowed() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_UniversalId() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_WorkEffortName() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_WorkEffortParentId() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_WorkEffortPurposeTypeId() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_WorkEffortTypeId() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_CommunicationEventWorkEffs() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_WorkEffortAttributes() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_WorkEffortDeliverableProds() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_WorkEffortEventReminders() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_WorkEffortFixedAssetStds() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_WorkEffortInventoryAssigns() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_WorkEffortInventoryProduceds() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_WorkEffortKeywords() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_WorkEffortNotes() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_WorkEffortSkillStandards() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortAssoc() {
		return workEffortAssocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortAssoc_WorkEffortIdFrom() {
		return (EAttribute)workEffortAssocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortAssoc_WorkEffortIdTo() {
		return (EAttribute)workEffortAssocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortAssoc_WorkEffortAssocTypeId() {
		return (EAttribute)workEffortAssocEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortAssoc_FromDate() {
		return (EAttribute)workEffortAssocEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortAssoc_SequenceNum() {
		return (EAttribute)workEffortAssocEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortAssoc_ThruDate() {
		return (EAttribute)workEffortAssocEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortAssocAttribute() {
		return workEffortAssocAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortAssocAttribute_WorkEffortIdFrom() {
		return (EAttribute)workEffortAssocAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortAssocAttribute_WorkEffortIdTo() {
		return (EAttribute)workEffortAssocAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortAssocAttribute_WorkEffortAssocTypeId() {
		return (EAttribute)workEffortAssocAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortAssocAttribute_AttrName() {
		return (EAttribute)workEffortAssocAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortAssocAttribute_AttrDescription() {
		return (EAttribute)workEffortAssocAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortAssocAttribute_AttrValue() {
		return (EAttribute)workEffortAssocAttributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortAssocAttribute_FromDate() {
		return (EAttribute)workEffortAssocAttributeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortAssocType() {
		return workEffortAssocTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortAssocType_WorkEffortAssocTypeId() {
		return (EAttribute)workEffortAssocTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortAssocType_Description() {
		return (EAttribute)workEffortAssocTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortAssocType_HasTable() {
		return (EAttribute)workEffortAssocTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortAssocType_ParentTypeId() {
		return (EAttribute)workEffortAssocTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortAssocType_WorkEffortAssocTypeAttrs() {
		return (EAttribute)workEffortAssocTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortAssocTypeAttr() {
		return workEffortAssocTypeAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortAssocTypeAttr_WorkEffortAssocTypeId() {
		return (EAttribute)workEffortAssocTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortAssocTypeAttr_AttrName() {
		return (EAttribute)workEffortAssocTypeAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortAssocTypeAttr_Description() {
		return (EAttribute)workEffortAssocTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortAttribute() {
		return workEffortAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortAttribute_WorkEffortId() {
		return (EAttribute)workEffortAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortAttribute_AttrName() {
		return (EAttribute)workEffortAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortAttribute_AttrDescription() {
		return (EAttribute)workEffortAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortAttribute_AttrValue() {
		return (EAttribute)workEffortAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortBilling() {
		return workEffortBillingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortBilling_WorkEffortId() {
		return (EAttribute)workEffortBillingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortBilling_InvoiceId() {
		return (EAttribute)workEffortBillingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortBilling_InvoiceItemSeqId() {
		return (EAttribute)workEffortBillingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortBilling_Percentage() {
		return (EAttribute)workEffortBillingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortContactMech() {
		return workEffortContactMechEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortContactMech_WorkEffortId() {
		return (EAttribute)workEffortContactMechEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortContactMech_ContactMechId() {
		return (EAttribute)workEffortContactMechEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortContactMech_FromDate() {
		return (EAttribute)workEffortContactMechEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortContactMech_Comments() {
		return (EAttribute)workEffortContactMechEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortContactMech_ThruDate() {
		return (EAttribute)workEffortContactMechEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortContent() {
		return workEffortContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortContent_WorkEffortId() {
		return (EAttribute)workEffortContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortContent_ContentId() {
		return (EAttribute)workEffortContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortContent_WorkEffortContentTypeId() {
		return (EAttribute)workEffortContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortContent_FromDate() {
		return (EAttribute)workEffortContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortContent_ThruDate() {
		return (EAttribute)workEffortContentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortContentType() {
		return workEffortContentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortContentType_WorkEffortContentTypeId() {
		return (EAttribute)workEffortContentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortContentType_Description() {
		return (EAttribute)workEffortContentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortContentType_ParentTypeId() {
		return (EAttribute)workEffortContentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortCostCalc() {
		return workEffortCostCalcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortCostCalc_WorkEffortId() {
		return (EAttribute)workEffortCostCalcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortCostCalc_CostComponentTypeId() {
		return (EAttribute)workEffortCostCalcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortCostCalc_FromDate() {
		return (EAttribute)workEffortCostCalcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortCostCalc_CostComponentCalcId() {
		return (EAttribute)workEffortCostCalcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortCostCalc_ThruDate() {
		return (EAttribute)workEffortCostCalcEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortDeliverableProd() {
		return workEffortDeliverableProdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortDeliverableProd_WorkEffortId() {
		return (EAttribute)workEffortDeliverableProdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortDeliverableProd_DeliverableId() {
		return (EAttribute)workEffortDeliverableProdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortEventReminder() {
		return workEffortEventReminderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortEventReminder_WorkEffortId() {
		return (EAttribute)workEffortEventReminderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortEventReminder_SequenceId() {
		return (EAttribute)workEffortEventReminderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortEventReminder_ContactMechId() {
		return (EAttribute)workEffortEventReminderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortEventReminder_CurrentCount() {
		return (EAttribute)workEffortEventReminderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortEventReminder_LocaleId() {
		return (EAttribute)workEffortEventReminderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortEventReminder_PartyId() {
		return (EAttribute)workEffortEventReminderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortEventReminder_ReminderDateTime() {
		return (EAttribute)workEffortEventReminderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortEventReminder_ReminderOffset() {
		return (EAttribute)workEffortEventReminderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortEventReminder_RepeatCount() {
		return (EAttribute)workEffortEventReminderEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortEventReminder_RepeatInterval() {
		return (EAttribute)workEffortEventReminderEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortEventReminder_TimeZoneId() {
		return (EAttribute)workEffortEventReminderEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortFixedAssetAssign() {
		return workEffortFixedAssetAssignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortFixedAssetAssign_WorkEffortId() {
		return (EAttribute)workEffortFixedAssetAssignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortFixedAssetAssign_FixedAssetId() {
		return (EAttribute)workEffortFixedAssetAssignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortFixedAssetAssign_FromDate() {
		return (EAttribute)workEffortFixedAssetAssignEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortFixedAssetAssign_AllocatedCost() {
		return (EAttribute)workEffortFixedAssetAssignEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortFixedAssetAssign_AvailabilityStatusId() {
		return (EAttribute)workEffortFixedAssetAssignEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortFixedAssetAssign_Comments() {
		return (EAttribute)workEffortFixedAssetAssignEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortFixedAssetAssign_StatusId() {
		return (EAttribute)workEffortFixedAssetAssignEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortFixedAssetAssign_ThruDate() {
		return (EAttribute)workEffortFixedAssetAssignEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortFixedAssetStd() {
		return workEffortFixedAssetStdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortFixedAssetStd_WorkEffortId() {
		return (EAttribute)workEffortFixedAssetStdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortFixedAssetStd_FixedAssetTypeId() {
		return (EAttribute)workEffortFixedAssetStdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortFixedAssetStd_EstimatedCost() {
		return (EAttribute)workEffortFixedAssetStdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortFixedAssetStd_EstimatedDuration() {
		return (EAttribute)workEffortFixedAssetStdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortFixedAssetStd_EstimatedQuantity() {
		return (EAttribute)workEffortFixedAssetStdEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortGoodStandard() {
		return workEffortGoodStandardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortGoodStandard_WorkEffortId() {
		return (EAttribute)workEffortGoodStandardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortGoodStandard_ProductId() {
		return (EAttribute)workEffortGoodStandardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortGoodStandard_WorkEffortGoodStdTypeId() {
		return (EAttribute)workEffortGoodStandardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortGoodStandard_FromDate() {
		return (EAttribute)workEffortGoodStandardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortGoodStandard_EstimatedCost() {
		return (EAttribute)workEffortGoodStandardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortGoodStandard_EstimatedQuantity() {
		return (EAttribute)workEffortGoodStandardEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortGoodStandard_StatusId() {
		return (EAttribute)workEffortGoodStandardEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortGoodStandard_ThruDate() {
		return (EAttribute)workEffortGoodStandardEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortGoodStandardType() {
		return workEffortGoodStandardTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortGoodStandardType_WorkEffortGoodStdTypeId() {
		return (EAttribute)workEffortGoodStandardTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortGoodStandardType_Description() {
		return (EAttribute)workEffortGoodStandardTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortGoodStandardType_HasTable() {
		return (EAttribute)workEffortGoodStandardTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortGoodStandardType_ParentTypeId() {
		return (EAttribute)workEffortGoodStandardTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortIcalData() {
		return workEffortIcalDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortIcalData_WorkEffortId() {
		return (EAttribute)workEffortIcalDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortIcalData_IcalData() {
		return (EAttribute)workEffortIcalDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortInventoryAssign() {
		return workEffortInventoryAssignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortInventoryAssign_WorkEffortId() {
		return (EAttribute)workEffortInventoryAssignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortInventoryAssign_InventoryItemId() {
		return (EAttribute)workEffortInventoryAssignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortInventoryAssign_Quantity() {
		return (EAttribute)workEffortInventoryAssignEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortInventoryAssign_StatusId() {
		return (EAttribute)workEffortInventoryAssignEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortInventoryProduced() {
		return workEffortInventoryProducedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortInventoryProduced_WorkEffortId() {
		return (EAttribute)workEffortInventoryProducedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortInventoryProduced_InventoryItemId() {
		return (EAttribute)workEffortInventoryProducedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortKeyword() {
		return workEffortKeywordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortKeyword_WorkEffortId() {
		return (EAttribute)workEffortKeywordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortKeyword_Keyword() {
		return (EAttribute)workEffortKeywordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortKeyword_RelevancyWeight() {
		return (EAttribute)workEffortKeywordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortNote() {
		return workEffortNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortNote_WorkEffortId() {
		return (EAttribute)workEffortNoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortNote_InternalNote() {
		return (EAttribute)workEffortNoteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortPartyAssignment() {
		return workEffortPartyAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortPartyAssignment_WorkEffortId() {
		return (EAttribute)workEffortPartyAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortPartyAssignment_PartyId() {
		return (EAttribute)workEffortPartyAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortPartyAssignment_RoleTypeId() {
		return (EAttribute)workEffortPartyAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortPartyAssignment_FromDate() {
		return (EAttribute)workEffortPartyAssignmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortPartyAssignment_AssignedByUserLoginId() {
		return (EAttribute)workEffortPartyAssignmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortPartyAssignment_AvailabilityStatusId() {
		return (EAttribute)workEffortPartyAssignmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortPartyAssignment_Comments() {
		return (EAttribute)workEffortPartyAssignmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortPartyAssignment_DelegateReasonEnumId() {
		return (EAttribute)workEffortPartyAssignmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortPartyAssignment_ExpectationEnumId() {
		return (EAttribute)workEffortPartyAssignmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortPartyAssignment_FacilityId() {
		return (EAttribute)workEffortPartyAssignmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortPartyAssignment_MustRsvp() {
		return (EAttribute)workEffortPartyAssignmentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortPartyAssignment_StatusDateTime() {
		return (EAttribute)workEffortPartyAssignmentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortPartyAssignment_StatusId() {
		return (EAttribute)workEffortPartyAssignmentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortPartyAssignment_ThruDate() {
		return (EAttribute)workEffortPartyAssignmentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortPurposeType() {
		return workEffortPurposeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortPurposeType_WorkEffortPurposeTypeId() {
		return (EAttribute)workEffortPurposeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortPurposeType_Description() {
		return (EAttribute)workEffortPurposeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortPurposeType_ParentTypeId() {
		return (EAttribute)workEffortPurposeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortReview() {
		return workEffortReviewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortReview_WorkEffortId() {
		return (EAttribute)workEffortReviewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortReview_UserLoginId() {
		return (EAttribute)workEffortReviewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortReview_ReviewDate() {
		return (EAttribute)workEffortReviewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortReview_PostedAnonymous() {
		return (EAttribute)workEffortReviewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortReview_Rating() {
		return (EAttribute)workEffortReviewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortReview_ReviewText() {
		return (EAttribute)workEffortReviewEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortReview_StatusId() {
		return (EAttribute)workEffortReviewEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortSearchConstraint() {
		return workEffortSearchConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortSearchConstraint_WorkEffortSearchResultId() {
		return (EAttribute)workEffortSearchConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortSearchConstraint_ConstraintSeqId() {
		return (EAttribute)workEffortSearchConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortSearchConstraint_AnyPrefix() {
		return (EAttribute)workEffortSearchConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortSearchConstraint_AnySuffix() {
		return (EAttribute)workEffortSearchConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortSearchConstraint_ConstraintName() {
		return (EAttribute)workEffortSearchConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortSearchConstraint_HighValue() {
		return (EAttribute)workEffortSearchConstraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortSearchConstraint_IncludeSubWorkEfforts() {
		return (EAttribute)workEffortSearchConstraintEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortSearchConstraint_InfoString() {
		return (EAttribute)workEffortSearchConstraintEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortSearchConstraint_IsAnd() {
		return (EAttribute)workEffortSearchConstraintEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortSearchConstraint_LowValue() {
		return (EAttribute)workEffortSearchConstraintEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortSearchConstraint_RemoveStems() {
		return (EAttribute)workEffortSearchConstraintEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortSearchResult() {
		return workEffortSearchResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortSearchResult_WorkEffortSearchResultId() {
		return (EAttribute)workEffortSearchResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortSearchResult_IsAscending() {
		return (EAttribute)workEffortSearchResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortSearchResult_NumResults() {
		return (EAttribute)workEffortSearchResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortSearchResult_OrderByName() {
		return (EAttribute)workEffortSearchResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortSearchResult_SearchDate() {
		return (EAttribute)workEffortSearchResultEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortSearchResult_SecondsTotal() {
		return (EAttribute)workEffortSearchResultEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortSearchResult_VisitId() {
		return (EAttribute)workEffortSearchResultEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortSearchResult_WorkEffortSearchConstraints() {
		return (EAttribute)workEffortSearchResultEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortSkillStandard() {
		return workEffortSkillStandardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortSkillStandard_WorkEffortId() {
		return (EAttribute)workEffortSkillStandardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortSkillStandard_SkillTypeId() {
		return (EAttribute)workEffortSkillStandardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortSkillStandard_EstimatedCost() {
		return (EAttribute)workEffortSkillStandardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortSkillStandard_EstimatedDuration() {
		return (EAttribute)workEffortSkillStandardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortSkillStandard_EstimatedNumPeople() {
		return (EAttribute)workEffortSkillStandardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortStatus() {
		return workEffortStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortStatus_WorkEffortId() {
		return (EAttribute)workEffortStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortStatus_StatusId() {
		return (EAttribute)workEffortStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortStatus_StatusDatetime() {
		return (EAttribute)workEffortStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortStatus_Reason() {
		return (EAttribute)workEffortStatusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortStatus_SetByUserLogin() {
		return (EAttribute)workEffortStatusEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortSurveyAppl() {
		return workEffortSurveyApplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortSurveyAppl_WorkEffortId() {
		return (EAttribute)workEffortSurveyApplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortSurveyAppl_SurveyId() {
		return (EAttribute)workEffortSurveyApplEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortSurveyAppl_FromDate() {
		return (EAttribute)workEffortSurveyApplEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortSurveyAppl_ThruDate() {
		return (EAttribute)workEffortSurveyApplEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortTransBox() {
		return workEffortTransBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortTransBox_ProcessWorkEffortId() {
		return (EAttribute)workEffortTransBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortTransBox_ToActivityId() {
		return (EAttribute)workEffortTransBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortTransBox_TransitionId() {
		return (EAttribute)workEffortTransBoxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortType() {
		return workEffortTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortType_WorkEffortTypeId() {
		return (EAttribute)workEffortTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortType_Description() {
		return (EAttribute)workEffortTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortType_HasTable() {
		return (EAttribute)workEffortTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortType_ParentTypeId() {
		return (EAttribute)workEffortTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortType_WorkEffortTypeAttrs() {
		return (EAttribute)workEffortTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkEffortTypeAttr() {
		return workEffortTypeAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortTypeAttr_WorkEffortTypeId() {
		return (EAttribute)workEffortTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortTypeAttr_AttrName() {
		return (EAttribute)workEffortTypeAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortTypeAttr_Description() {
		return (EAttribute)workEffortTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkeffortFactory getWorkeffortFactory() {
		return (WorkeffortFactory)getEFactoryInstance();
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
		applicationSandboxEClass = createEClass(APPLICATION_SANDBOX);
		createEAttribute(applicationSandboxEClass, APPLICATION_SANDBOX__APPLICATION_ID);
		createEAttribute(applicationSandboxEClass, APPLICATION_SANDBOX__FROM_DATE);
		createEAttribute(applicationSandboxEClass, APPLICATION_SANDBOX__PARTY_ID);
		createEAttribute(applicationSandboxEClass, APPLICATION_SANDBOX__ROLE_TYPE_ID);
		createEAttribute(applicationSandboxEClass, APPLICATION_SANDBOX__RUNTIME_DATA_ID);
		createEAttribute(applicationSandboxEClass, APPLICATION_SANDBOX__WORK_EFFORT_ID);

		communicationEventWorkEffEClass = createEClass(COMMUNICATION_EVENT_WORK_EFF);
		createEAttribute(communicationEventWorkEffEClass, COMMUNICATION_EVENT_WORK_EFF__WORK_EFFORT_ID);
		createEAttribute(communicationEventWorkEffEClass, COMMUNICATION_EVENT_WORK_EFF__COMMUNICATION_EVENT_ID);
		createEAttribute(communicationEventWorkEffEClass, COMMUNICATION_EVENT_WORK_EFF__DESCRIPTION);

		deliverableEClass = createEClass(DELIVERABLE);
		createEAttribute(deliverableEClass, DELIVERABLE__DELIVERABLE_ID);
		createEAttribute(deliverableEClass, DELIVERABLE__DELIVERABLE_NAME);
		createEAttribute(deliverableEClass, DELIVERABLE__DELIVERABLE_TYPE_ID);
		createEAttribute(deliverableEClass, DELIVERABLE__DESCRIPTION);

		deliverableTypeEClass = createEClass(DELIVERABLE_TYPE);
		createEAttribute(deliverableTypeEClass, DELIVERABLE_TYPE__DELIVERABLE_TYPE_ID);
		createEAttribute(deliverableTypeEClass, DELIVERABLE_TYPE__DESCRIPTION);

		workEffortEClass = createEClass(WORK_EFFORT);
		createEAttribute(workEffortEClass, WORK_EFFORT__WORK_EFFORT_ID);
		createEAttribute(workEffortEClass, WORK_EFFORT__ACCOMMODATION_MAP_ID);
		createEAttribute(workEffortEClass, WORK_EFFORT__ACCOMMODATION_SPOT_ID);
		createEAttribute(workEffortEClass, WORK_EFFORT__ACTUAL_COMPLETION_DATE);
		createEAttribute(workEffortEClass, WORK_EFFORT__ACTUAL_MILLI_SECONDS);
		createEAttribute(workEffortEClass, WORK_EFFORT__ACTUAL_SETUP_MILLIS);
		createEAttribute(workEffortEClass, WORK_EFFORT__ACTUAL_START_DATE);
		createEAttribute(workEffortEClass, WORK_EFFORT__CREATED_BY_USER_LOGIN);
		createEAttribute(workEffortEClass, WORK_EFFORT__CREATED_DATE);
		createEAttribute(workEffortEClass, WORK_EFFORT__CURRENT_STATUS_ID);
		createEAttribute(workEffortEClass, WORK_EFFORT__DESCRIPTION);
		createEAttribute(workEffortEClass, WORK_EFFORT__ESTIMATE_CALC_METHOD);
		createEAttribute(workEffortEClass, WORK_EFFORT__ESTIMATED_COMPLETION_DATE);
		createEAttribute(workEffortEClass, WORK_EFFORT__ESTIMATED_MILLI_SECONDS);
		createEAttribute(workEffortEClass, WORK_EFFORT__ESTIMATED_SETUP_MILLIS);
		createEAttribute(workEffortEClass, WORK_EFFORT__ESTIMATED_START_DATE);
		createEAttribute(workEffortEClass, WORK_EFFORT__FACILITY_ID);
		createEAttribute(workEffortEClass, WORK_EFFORT__FIXED_ASSET_ID);
		createEAttribute(workEffortEClass, WORK_EFFORT__INFO_URL);
		createEAttribute(workEffortEClass, WORK_EFFORT__LAST_MODIFIED_BY_USER_LOGIN);
		createEAttribute(workEffortEClass, WORK_EFFORT__LAST_MODIFIED_DATE);
		createEAttribute(workEffortEClass, WORK_EFFORT__LAST_STATUS_UPDATE);
		createEAttribute(workEffortEClass, WORK_EFFORT__LOCATION_DESC);
		createEAttribute(workEffortEClass, WORK_EFFORT__MONEY_UOM_ID);
		createEAttribute(workEffortEClass, WORK_EFFORT__NOTE_ID);
		createEAttribute(workEffortEClass, WORK_EFFORT__PERCENT_COMPLETE);
		createEAttribute(workEffortEClass, WORK_EFFORT__PRIORITY);
		createEAttribute(workEffortEClass, WORK_EFFORT__QUANTITY_PRODUCED);
		createEAttribute(workEffortEClass, WORK_EFFORT__QUANTITY_REJECTED);
		createEAttribute(workEffortEClass, WORK_EFFORT__QUANTITY_TO_PRODUCE);
		createEAttribute(workEffortEClass, WORK_EFFORT__RECURRENCE_INFO_ID);
		createEAttribute(workEffortEClass, WORK_EFFORT__RESERV2ND_PP_PERC);
		createEAttribute(workEffortEClass, WORK_EFFORT__RESERV_NTH_PP_PERC);
		createEAttribute(workEffortEClass, WORK_EFFORT__RESERV_PERSONS);
		createEAttribute(workEffortEClass, WORK_EFFORT__REVISION_NUMBER);
		createEAttribute(workEffortEClass, WORK_EFFORT__RUNTIME_DATA_ID);
		createEAttribute(workEffortEClass, WORK_EFFORT__SCOPE_ENUM_ID);
		createEAttribute(workEffortEClass, WORK_EFFORT__SEND_NOTIFICATION_EMAIL);
		createEAttribute(workEffortEClass, WORK_EFFORT__SERVICE_LOADER_NAME);
		createEAttribute(workEffortEClass, WORK_EFFORT__SHOW_AS_ENUM_ID);
		createEAttribute(workEffortEClass, WORK_EFFORT__SOURCE_REFERENCE_ID);
		createEAttribute(workEffortEClass, WORK_EFFORT__SPECIAL_TERMS);
		createEAttribute(workEffortEClass, WORK_EFFORT__TEMP_EXPR_ID);
		createEAttribute(workEffortEClass, WORK_EFFORT__TIME_TRANSPARENCY);
		createEAttribute(workEffortEClass, WORK_EFFORT__TOTAL_MILLI_SECONDS_ALLOWED);
		createEAttribute(workEffortEClass, WORK_EFFORT__TOTAL_MONEY_ALLOWED);
		createEAttribute(workEffortEClass, WORK_EFFORT__UNIVERSAL_ID);
		createEAttribute(workEffortEClass, WORK_EFFORT__WORK_EFFORT_NAME);
		createEAttribute(workEffortEClass, WORK_EFFORT__WORK_EFFORT_PARENT_ID);
		createEAttribute(workEffortEClass, WORK_EFFORT__WORK_EFFORT_PURPOSE_TYPE_ID);
		createEAttribute(workEffortEClass, WORK_EFFORT__WORK_EFFORT_TYPE_ID);
		createEAttribute(workEffortEClass, WORK_EFFORT__COMMUNICATION_EVENT_WORK_EFFS);
		createEAttribute(workEffortEClass, WORK_EFFORT__WORK_EFFORT_ATTRIBUTES);
		createEAttribute(workEffortEClass, WORK_EFFORT__WORK_EFFORT_DELIVERABLE_PRODS);
		createEAttribute(workEffortEClass, WORK_EFFORT__WORK_EFFORT_EVENT_REMINDERS);
		createEAttribute(workEffortEClass, WORK_EFFORT__WORK_EFFORT_FIXED_ASSET_STDS);
		createEAttribute(workEffortEClass, WORK_EFFORT__WORK_EFFORT_INVENTORY_ASSIGNS);
		createEAttribute(workEffortEClass, WORK_EFFORT__WORK_EFFORT_INVENTORY_PRODUCEDS);
		createEAttribute(workEffortEClass, WORK_EFFORT__WORK_EFFORT_KEYWORDS);
		createEAttribute(workEffortEClass, WORK_EFFORT__WORK_EFFORT_NOTES);
		createEAttribute(workEffortEClass, WORK_EFFORT__WORK_EFFORT_SKILL_STANDARDS);

		workEffortAssocEClass = createEClass(WORK_EFFORT_ASSOC);
		createEAttribute(workEffortAssocEClass, WORK_EFFORT_ASSOC__WORK_EFFORT_ID_FROM);
		createEAttribute(workEffortAssocEClass, WORK_EFFORT_ASSOC__WORK_EFFORT_ID_TO);
		createEAttribute(workEffortAssocEClass, WORK_EFFORT_ASSOC__WORK_EFFORT_ASSOC_TYPE_ID);
		createEAttribute(workEffortAssocEClass, WORK_EFFORT_ASSOC__FROM_DATE);
		createEAttribute(workEffortAssocEClass, WORK_EFFORT_ASSOC__SEQUENCE_NUM);
		createEAttribute(workEffortAssocEClass, WORK_EFFORT_ASSOC__THRU_DATE);

		workEffortAssocAttributeEClass = createEClass(WORK_EFFORT_ASSOC_ATTRIBUTE);
		createEAttribute(workEffortAssocAttributeEClass, WORK_EFFORT_ASSOC_ATTRIBUTE__WORK_EFFORT_ID_FROM);
		createEAttribute(workEffortAssocAttributeEClass, WORK_EFFORT_ASSOC_ATTRIBUTE__WORK_EFFORT_ID_TO);
		createEAttribute(workEffortAssocAttributeEClass, WORK_EFFORT_ASSOC_ATTRIBUTE__WORK_EFFORT_ASSOC_TYPE_ID);
		createEAttribute(workEffortAssocAttributeEClass, WORK_EFFORT_ASSOC_ATTRIBUTE__ATTR_NAME);
		createEAttribute(workEffortAssocAttributeEClass, WORK_EFFORT_ASSOC_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(workEffortAssocAttributeEClass, WORK_EFFORT_ASSOC_ATTRIBUTE__ATTR_VALUE);
		createEAttribute(workEffortAssocAttributeEClass, WORK_EFFORT_ASSOC_ATTRIBUTE__FROM_DATE);

		workEffortAssocTypeEClass = createEClass(WORK_EFFORT_ASSOC_TYPE);
		createEAttribute(workEffortAssocTypeEClass, WORK_EFFORT_ASSOC_TYPE__WORK_EFFORT_ASSOC_TYPE_ID);
		createEAttribute(workEffortAssocTypeEClass, WORK_EFFORT_ASSOC_TYPE__DESCRIPTION);
		createEAttribute(workEffortAssocTypeEClass, WORK_EFFORT_ASSOC_TYPE__HAS_TABLE);
		createEAttribute(workEffortAssocTypeEClass, WORK_EFFORT_ASSOC_TYPE__PARENT_TYPE_ID);
		createEAttribute(workEffortAssocTypeEClass, WORK_EFFORT_ASSOC_TYPE__WORK_EFFORT_ASSOC_TYPE_ATTRS);

		workEffortAssocTypeAttrEClass = createEClass(WORK_EFFORT_ASSOC_TYPE_ATTR);
		createEAttribute(workEffortAssocTypeAttrEClass, WORK_EFFORT_ASSOC_TYPE_ATTR__WORK_EFFORT_ASSOC_TYPE_ID);
		createEAttribute(workEffortAssocTypeAttrEClass, WORK_EFFORT_ASSOC_TYPE_ATTR__ATTR_NAME);
		createEAttribute(workEffortAssocTypeAttrEClass, WORK_EFFORT_ASSOC_TYPE_ATTR__DESCRIPTION);

		workEffortAttributeEClass = createEClass(WORK_EFFORT_ATTRIBUTE);
		createEAttribute(workEffortAttributeEClass, WORK_EFFORT_ATTRIBUTE__WORK_EFFORT_ID);
		createEAttribute(workEffortAttributeEClass, WORK_EFFORT_ATTRIBUTE__ATTR_NAME);
		createEAttribute(workEffortAttributeEClass, WORK_EFFORT_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(workEffortAttributeEClass, WORK_EFFORT_ATTRIBUTE__ATTR_VALUE);

		workEffortBillingEClass = createEClass(WORK_EFFORT_BILLING);
		createEAttribute(workEffortBillingEClass, WORK_EFFORT_BILLING__WORK_EFFORT_ID);
		createEAttribute(workEffortBillingEClass, WORK_EFFORT_BILLING__INVOICE_ID);
		createEAttribute(workEffortBillingEClass, WORK_EFFORT_BILLING__INVOICE_ITEM_SEQ_ID);
		createEAttribute(workEffortBillingEClass, WORK_EFFORT_BILLING__PERCENTAGE);

		workEffortContactMechEClass = createEClass(WORK_EFFORT_CONTACT_MECH);
		createEAttribute(workEffortContactMechEClass, WORK_EFFORT_CONTACT_MECH__WORK_EFFORT_ID);
		createEAttribute(workEffortContactMechEClass, WORK_EFFORT_CONTACT_MECH__CONTACT_MECH_ID);
		createEAttribute(workEffortContactMechEClass, WORK_EFFORT_CONTACT_MECH__FROM_DATE);
		createEAttribute(workEffortContactMechEClass, WORK_EFFORT_CONTACT_MECH__COMMENTS);
		createEAttribute(workEffortContactMechEClass, WORK_EFFORT_CONTACT_MECH__THRU_DATE);

		workEffortContentEClass = createEClass(WORK_EFFORT_CONTENT);
		createEAttribute(workEffortContentEClass, WORK_EFFORT_CONTENT__WORK_EFFORT_ID);
		createEAttribute(workEffortContentEClass, WORK_EFFORT_CONTENT__CONTENT_ID);
		createEAttribute(workEffortContentEClass, WORK_EFFORT_CONTENT__WORK_EFFORT_CONTENT_TYPE_ID);
		createEAttribute(workEffortContentEClass, WORK_EFFORT_CONTENT__FROM_DATE);
		createEAttribute(workEffortContentEClass, WORK_EFFORT_CONTENT__THRU_DATE);

		workEffortContentTypeEClass = createEClass(WORK_EFFORT_CONTENT_TYPE);
		createEAttribute(workEffortContentTypeEClass, WORK_EFFORT_CONTENT_TYPE__WORK_EFFORT_CONTENT_TYPE_ID);
		createEAttribute(workEffortContentTypeEClass, WORK_EFFORT_CONTENT_TYPE__DESCRIPTION);
		createEAttribute(workEffortContentTypeEClass, WORK_EFFORT_CONTENT_TYPE__PARENT_TYPE_ID);

		workEffortCostCalcEClass = createEClass(WORK_EFFORT_COST_CALC);
		createEAttribute(workEffortCostCalcEClass, WORK_EFFORT_COST_CALC__WORK_EFFORT_ID);
		createEAttribute(workEffortCostCalcEClass, WORK_EFFORT_COST_CALC__COST_COMPONENT_TYPE_ID);
		createEAttribute(workEffortCostCalcEClass, WORK_EFFORT_COST_CALC__FROM_DATE);
		createEAttribute(workEffortCostCalcEClass, WORK_EFFORT_COST_CALC__COST_COMPONENT_CALC_ID);
		createEAttribute(workEffortCostCalcEClass, WORK_EFFORT_COST_CALC__THRU_DATE);

		workEffortDeliverableProdEClass = createEClass(WORK_EFFORT_DELIVERABLE_PROD);
		createEAttribute(workEffortDeliverableProdEClass, WORK_EFFORT_DELIVERABLE_PROD__WORK_EFFORT_ID);
		createEAttribute(workEffortDeliverableProdEClass, WORK_EFFORT_DELIVERABLE_PROD__DELIVERABLE_ID);

		workEffortEventReminderEClass = createEClass(WORK_EFFORT_EVENT_REMINDER);
		createEAttribute(workEffortEventReminderEClass, WORK_EFFORT_EVENT_REMINDER__WORK_EFFORT_ID);
		createEAttribute(workEffortEventReminderEClass, WORK_EFFORT_EVENT_REMINDER__SEQUENCE_ID);
		createEAttribute(workEffortEventReminderEClass, WORK_EFFORT_EVENT_REMINDER__CONTACT_MECH_ID);
		createEAttribute(workEffortEventReminderEClass, WORK_EFFORT_EVENT_REMINDER__CURRENT_COUNT);
		createEAttribute(workEffortEventReminderEClass, WORK_EFFORT_EVENT_REMINDER__LOCALE_ID);
		createEAttribute(workEffortEventReminderEClass, WORK_EFFORT_EVENT_REMINDER__PARTY_ID);
		createEAttribute(workEffortEventReminderEClass, WORK_EFFORT_EVENT_REMINDER__REMINDER_DATE_TIME);
		createEAttribute(workEffortEventReminderEClass, WORK_EFFORT_EVENT_REMINDER__REMINDER_OFFSET);
		createEAttribute(workEffortEventReminderEClass, WORK_EFFORT_EVENT_REMINDER__REPEAT_COUNT);
		createEAttribute(workEffortEventReminderEClass, WORK_EFFORT_EVENT_REMINDER__REPEAT_INTERVAL);
		createEAttribute(workEffortEventReminderEClass, WORK_EFFORT_EVENT_REMINDER__TIME_ZONE_ID);

		workEffortFixedAssetAssignEClass = createEClass(WORK_EFFORT_FIXED_ASSET_ASSIGN);
		createEAttribute(workEffortFixedAssetAssignEClass, WORK_EFFORT_FIXED_ASSET_ASSIGN__WORK_EFFORT_ID);
		createEAttribute(workEffortFixedAssetAssignEClass, WORK_EFFORT_FIXED_ASSET_ASSIGN__FIXED_ASSET_ID);
		createEAttribute(workEffortFixedAssetAssignEClass, WORK_EFFORT_FIXED_ASSET_ASSIGN__FROM_DATE);
		createEAttribute(workEffortFixedAssetAssignEClass, WORK_EFFORT_FIXED_ASSET_ASSIGN__ALLOCATED_COST);
		createEAttribute(workEffortFixedAssetAssignEClass, WORK_EFFORT_FIXED_ASSET_ASSIGN__AVAILABILITY_STATUS_ID);
		createEAttribute(workEffortFixedAssetAssignEClass, WORK_EFFORT_FIXED_ASSET_ASSIGN__COMMENTS);
		createEAttribute(workEffortFixedAssetAssignEClass, WORK_EFFORT_FIXED_ASSET_ASSIGN__STATUS_ID);
		createEAttribute(workEffortFixedAssetAssignEClass, WORK_EFFORT_FIXED_ASSET_ASSIGN__THRU_DATE);

		workEffortFixedAssetStdEClass = createEClass(WORK_EFFORT_FIXED_ASSET_STD);
		createEAttribute(workEffortFixedAssetStdEClass, WORK_EFFORT_FIXED_ASSET_STD__WORK_EFFORT_ID);
		createEAttribute(workEffortFixedAssetStdEClass, WORK_EFFORT_FIXED_ASSET_STD__FIXED_ASSET_TYPE_ID);
		createEAttribute(workEffortFixedAssetStdEClass, WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_COST);
		createEAttribute(workEffortFixedAssetStdEClass, WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_DURATION);
		createEAttribute(workEffortFixedAssetStdEClass, WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_QUANTITY);

		workEffortGoodStandardEClass = createEClass(WORK_EFFORT_GOOD_STANDARD);
		createEAttribute(workEffortGoodStandardEClass, WORK_EFFORT_GOOD_STANDARD__WORK_EFFORT_ID);
		createEAttribute(workEffortGoodStandardEClass, WORK_EFFORT_GOOD_STANDARD__PRODUCT_ID);
		createEAttribute(workEffortGoodStandardEClass, WORK_EFFORT_GOOD_STANDARD__WORK_EFFORT_GOOD_STD_TYPE_ID);
		createEAttribute(workEffortGoodStandardEClass, WORK_EFFORT_GOOD_STANDARD__FROM_DATE);
		createEAttribute(workEffortGoodStandardEClass, WORK_EFFORT_GOOD_STANDARD__ESTIMATED_COST);
		createEAttribute(workEffortGoodStandardEClass, WORK_EFFORT_GOOD_STANDARD__ESTIMATED_QUANTITY);
		createEAttribute(workEffortGoodStandardEClass, WORK_EFFORT_GOOD_STANDARD__STATUS_ID);
		createEAttribute(workEffortGoodStandardEClass, WORK_EFFORT_GOOD_STANDARD__THRU_DATE);

		workEffortGoodStandardTypeEClass = createEClass(WORK_EFFORT_GOOD_STANDARD_TYPE);
		createEAttribute(workEffortGoodStandardTypeEClass, WORK_EFFORT_GOOD_STANDARD_TYPE__WORK_EFFORT_GOOD_STD_TYPE_ID);
		createEAttribute(workEffortGoodStandardTypeEClass, WORK_EFFORT_GOOD_STANDARD_TYPE__DESCRIPTION);
		createEAttribute(workEffortGoodStandardTypeEClass, WORK_EFFORT_GOOD_STANDARD_TYPE__HAS_TABLE);
		createEAttribute(workEffortGoodStandardTypeEClass, WORK_EFFORT_GOOD_STANDARD_TYPE__PARENT_TYPE_ID);

		workEffortIcalDataEClass = createEClass(WORK_EFFORT_ICAL_DATA);
		createEAttribute(workEffortIcalDataEClass, WORK_EFFORT_ICAL_DATA__WORK_EFFORT_ID);
		createEAttribute(workEffortIcalDataEClass, WORK_EFFORT_ICAL_DATA__ICAL_DATA);

		workEffortInventoryAssignEClass = createEClass(WORK_EFFORT_INVENTORY_ASSIGN);
		createEAttribute(workEffortInventoryAssignEClass, WORK_EFFORT_INVENTORY_ASSIGN__WORK_EFFORT_ID);
		createEAttribute(workEffortInventoryAssignEClass, WORK_EFFORT_INVENTORY_ASSIGN__INVENTORY_ITEM_ID);
		createEAttribute(workEffortInventoryAssignEClass, WORK_EFFORT_INVENTORY_ASSIGN__QUANTITY);
		createEAttribute(workEffortInventoryAssignEClass, WORK_EFFORT_INVENTORY_ASSIGN__STATUS_ID);

		workEffortInventoryProducedEClass = createEClass(WORK_EFFORT_INVENTORY_PRODUCED);
		createEAttribute(workEffortInventoryProducedEClass, WORK_EFFORT_INVENTORY_PRODUCED__WORK_EFFORT_ID);
		createEAttribute(workEffortInventoryProducedEClass, WORK_EFFORT_INVENTORY_PRODUCED__INVENTORY_ITEM_ID);

		workEffortKeywordEClass = createEClass(WORK_EFFORT_KEYWORD);
		createEAttribute(workEffortKeywordEClass, WORK_EFFORT_KEYWORD__WORK_EFFORT_ID);
		createEAttribute(workEffortKeywordEClass, WORK_EFFORT_KEYWORD__KEYWORD);
		createEAttribute(workEffortKeywordEClass, WORK_EFFORT_KEYWORD__RELEVANCY_WEIGHT);

		workEffortNoteEClass = createEClass(WORK_EFFORT_NOTE);
		createEAttribute(workEffortNoteEClass, WORK_EFFORT_NOTE__WORK_EFFORT_ID);
		createEAttribute(workEffortNoteEClass, WORK_EFFORT_NOTE__INTERNAL_NOTE);

		workEffortPartyAssignmentEClass = createEClass(WORK_EFFORT_PARTY_ASSIGNMENT);
		createEAttribute(workEffortPartyAssignmentEClass, WORK_EFFORT_PARTY_ASSIGNMENT__WORK_EFFORT_ID);
		createEAttribute(workEffortPartyAssignmentEClass, WORK_EFFORT_PARTY_ASSIGNMENT__PARTY_ID);
		createEAttribute(workEffortPartyAssignmentEClass, WORK_EFFORT_PARTY_ASSIGNMENT__ROLE_TYPE_ID);
		createEAttribute(workEffortPartyAssignmentEClass, WORK_EFFORT_PARTY_ASSIGNMENT__FROM_DATE);
		createEAttribute(workEffortPartyAssignmentEClass, WORK_EFFORT_PARTY_ASSIGNMENT__ASSIGNED_BY_USER_LOGIN_ID);
		createEAttribute(workEffortPartyAssignmentEClass, WORK_EFFORT_PARTY_ASSIGNMENT__AVAILABILITY_STATUS_ID);
		createEAttribute(workEffortPartyAssignmentEClass, WORK_EFFORT_PARTY_ASSIGNMENT__COMMENTS);
		createEAttribute(workEffortPartyAssignmentEClass, WORK_EFFORT_PARTY_ASSIGNMENT__DELEGATE_REASON_ENUM_ID);
		createEAttribute(workEffortPartyAssignmentEClass, WORK_EFFORT_PARTY_ASSIGNMENT__EXPECTATION_ENUM_ID);
		createEAttribute(workEffortPartyAssignmentEClass, WORK_EFFORT_PARTY_ASSIGNMENT__FACILITY_ID);
		createEAttribute(workEffortPartyAssignmentEClass, WORK_EFFORT_PARTY_ASSIGNMENT__MUST_RSVP);
		createEAttribute(workEffortPartyAssignmentEClass, WORK_EFFORT_PARTY_ASSIGNMENT__STATUS_DATE_TIME);
		createEAttribute(workEffortPartyAssignmentEClass, WORK_EFFORT_PARTY_ASSIGNMENT__STATUS_ID);
		createEAttribute(workEffortPartyAssignmentEClass, WORK_EFFORT_PARTY_ASSIGNMENT__THRU_DATE);

		workEffortPurposeTypeEClass = createEClass(WORK_EFFORT_PURPOSE_TYPE);
		createEAttribute(workEffortPurposeTypeEClass, WORK_EFFORT_PURPOSE_TYPE__WORK_EFFORT_PURPOSE_TYPE_ID);
		createEAttribute(workEffortPurposeTypeEClass, WORK_EFFORT_PURPOSE_TYPE__DESCRIPTION);
		createEAttribute(workEffortPurposeTypeEClass, WORK_EFFORT_PURPOSE_TYPE__PARENT_TYPE_ID);

		workEffortReviewEClass = createEClass(WORK_EFFORT_REVIEW);
		createEAttribute(workEffortReviewEClass, WORK_EFFORT_REVIEW__WORK_EFFORT_ID);
		createEAttribute(workEffortReviewEClass, WORK_EFFORT_REVIEW__USER_LOGIN_ID);
		createEAttribute(workEffortReviewEClass, WORK_EFFORT_REVIEW__REVIEW_DATE);
		createEAttribute(workEffortReviewEClass, WORK_EFFORT_REVIEW__POSTED_ANONYMOUS);
		createEAttribute(workEffortReviewEClass, WORK_EFFORT_REVIEW__RATING);
		createEAttribute(workEffortReviewEClass, WORK_EFFORT_REVIEW__REVIEW_TEXT);
		createEAttribute(workEffortReviewEClass, WORK_EFFORT_REVIEW__STATUS_ID);

		workEffortSearchConstraintEClass = createEClass(WORK_EFFORT_SEARCH_CONSTRAINT);
		createEAttribute(workEffortSearchConstraintEClass, WORK_EFFORT_SEARCH_CONSTRAINT__WORK_EFFORT_SEARCH_RESULT_ID);
		createEAttribute(workEffortSearchConstraintEClass, WORK_EFFORT_SEARCH_CONSTRAINT__CONSTRAINT_SEQ_ID);
		createEAttribute(workEffortSearchConstraintEClass, WORK_EFFORT_SEARCH_CONSTRAINT__ANY_PREFIX);
		createEAttribute(workEffortSearchConstraintEClass, WORK_EFFORT_SEARCH_CONSTRAINT__ANY_SUFFIX);
		createEAttribute(workEffortSearchConstraintEClass, WORK_EFFORT_SEARCH_CONSTRAINT__CONSTRAINT_NAME);
		createEAttribute(workEffortSearchConstraintEClass, WORK_EFFORT_SEARCH_CONSTRAINT__HIGH_VALUE);
		createEAttribute(workEffortSearchConstraintEClass, WORK_EFFORT_SEARCH_CONSTRAINT__INCLUDE_SUB_WORK_EFFORTS);
		createEAttribute(workEffortSearchConstraintEClass, WORK_EFFORT_SEARCH_CONSTRAINT__INFO_STRING);
		createEAttribute(workEffortSearchConstraintEClass, WORK_EFFORT_SEARCH_CONSTRAINT__IS_AND);
		createEAttribute(workEffortSearchConstraintEClass, WORK_EFFORT_SEARCH_CONSTRAINT__LOW_VALUE);
		createEAttribute(workEffortSearchConstraintEClass, WORK_EFFORT_SEARCH_CONSTRAINT__REMOVE_STEMS);

		workEffortSearchResultEClass = createEClass(WORK_EFFORT_SEARCH_RESULT);
		createEAttribute(workEffortSearchResultEClass, WORK_EFFORT_SEARCH_RESULT__WORK_EFFORT_SEARCH_RESULT_ID);
		createEAttribute(workEffortSearchResultEClass, WORK_EFFORT_SEARCH_RESULT__IS_ASCENDING);
		createEAttribute(workEffortSearchResultEClass, WORK_EFFORT_SEARCH_RESULT__NUM_RESULTS);
		createEAttribute(workEffortSearchResultEClass, WORK_EFFORT_SEARCH_RESULT__ORDER_BY_NAME);
		createEAttribute(workEffortSearchResultEClass, WORK_EFFORT_SEARCH_RESULT__SEARCH_DATE);
		createEAttribute(workEffortSearchResultEClass, WORK_EFFORT_SEARCH_RESULT__SECONDS_TOTAL);
		createEAttribute(workEffortSearchResultEClass, WORK_EFFORT_SEARCH_RESULT__VISIT_ID);
		createEAttribute(workEffortSearchResultEClass, WORK_EFFORT_SEARCH_RESULT__WORK_EFFORT_SEARCH_CONSTRAINTS);

		workEffortSkillStandardEClass = createEClass(WORK_EFFORT_SKILL_STANDARD);
		createEAttribute(workEffortSkillStandardEClass, WORK_EFFORT_SKILL_STANDARD__WORK_EFFORT_ID);
		createEAttribute(workEffortSkillStandardEClass, WORK_EFFORT_SKILL_STANDARD__SKILL_TYPE_ID);
		createEAttribute(workEffortSkillStandardEClass, WORK_EFFORT_SKILL_STANDARD__ESTIMATED_COST);
		createEAttribute(workEffortSkillStandardEClass, WORK_EFFORT_SKILL_STANDARD__ESTIMATED_DURATION);
		createEAttribute(workEffortSkillStandardEClass, WORK_EFFORT_SKILL_STANDARD__ESTIMATED_NUM_PEOPLE);

		workEffortStatusEClass = createEClass(WORK_EFFORT_STATUS);
		createEAttribute(workEffortStatusEClass, WORK_EFFORT_STATUS__WORK_EFFORT_ID);
		createEAttribute(workEffortStatusEClass, WORK_EFFORT_STATUS__STATUS_ID);
		createEAttribute(workEffortStatusEClass, WORK_EFFORT_STATUS__STATUS_DATETIME);
		createEAttribute(workEffortStatusEClass, WORK_EFFORT_STATUS__REASON);
		createEAttribute(workEffortStatusEClass, WORK_EFFORT_STATUS__SET_BY_USER_LOGIN);

		workEffortSurveyApplEClass = createEClass(WORK_EFFORT_SURVEY_APPL);
		createEAttribute(workEffortSurveyApplEClass, WORK_EFFORT_SURVEY_APPL__WORK_EFFORT_ID);
		createEAttribute(workEffortSurveyApplEClass, WORK_EFFORT_SURVEY_APPL__SURVEY_ID);
		createEAttribute(workEffortSurveyApplEClass, WORK_EFFORT_SURVEY_APPL__FROM_DATE);
		createEAttribute(workEffortSurveyApplEClass, WORK_EFFORT_SURVEY_APPL__THRU_DATE);

		workEffortTransBoxEClass = createEClass(WORK_EFFORT_TRANS_BOX);
		createEAttribute(workEffortTransBoxEClass, WORK_EFFORT_TRANS_BOX__PROCESS_WORK_EFFORT_ID);
		createEAttribute(workEffortTransBoxEClass, WORK_EFFORT_TRANS_BOX__TO_ACTIVITY_ID);
		createEAttribute(workEffortTransBoxEClass, WORK_EFFORT_TRANS_BOX__TRANSITION_ID);

		workEffortTypeEClass = createEClass(WORK_EFFORT_TYPE);
		createEAttribute(workEffortTypeEClass, WORK_EFFORT_TYPE__WORK_EFFORT_TYPE_ID);
		createEAttribute(workEffortTypeEClass, WORK_EFFORT_TYPE__DESCRIPTION);
		createEAttribute(workEffortTypeEClass, WORK_EFFORT_TYPE__HAS_TABLE);
		createEAttribute(workEffortTypeEClass, WORK_EFFORT_TYPE__PARENT_TYPE_ID);
		createEAttribute(workEffortTypeEClass, WORK_EFFORT_TYPE__WORK_EFFORT_TYPE_ATTRS);

		workEffortTypeAttrEClass = createEClass(WORK_EFFORT_TYPE_ATTR);
		createEAttribute(workEffortTypeAttrEClass, WORK_EFFORT_TYPE_ATTR__WORK_EFFORT_TYPE_ID);
		createEAttribute(workEffortTypeAttrEClass, WORK_EFFORT_TYPE_ATTR__ATTR_NAME);
		createEAttribute(workEffortTypeAttrEClass, WORK_EFFORT_TYPE_ATTR__DESCRIPTION);
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
		applicationSandboxEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		communicationEventWorkEffEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		EGenericType g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		EGenericType g2 = createEGenericType(this.getDeliverableType());
		g1.getETypeArguments().add(g2);
		deliverableEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getDeliverable());
		g1.getETypeArguments().add(g2);
		deliverableTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getWorkEffortType());
		g1.getETypeArguments().add(g2);
		workEffortEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getWorkEffortAssocType());
		g1.getETypeArguments().add(g2);
		workEffortAssocEClass.getEGenericSuperTypes().add(g1);
		workEffortAssocAttributeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getWorkEffortAssoc());
		g1.getETypeArguments().add(g2);
		workEffortAssocTypeEClass.getEGenericSuperTypes().add(g1);
		workEffortAssocTypeAttrEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		workEffortAttributeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		workEffortBillingEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		workEffortContactMechEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getWorkEffortContentType());
		g1.getETypeArguments().add(g2);
		workEffortContentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getWorkEffortContent());
		g1.getETypeArguments().add(g2);
		workEffortContentTypeEClass.getEGenericSuperTypes().add(g1);
		workEffortCostCalcEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		workEffortDeliverableProdEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		workEffortEventReminderEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		workEffortFixedAssetAssignEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		workEffortFixedAssetStdEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getWorkEffortGoodStandardType());
		g1.getETypeArguments().add(g2);
		workEffortGoodStandardEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getWorkEffortGoodStandard());
		g1.getETypeArguments().add(g2);
		workEffortGoodStandardTypeEClass.getEGenericSuperTypes().add(g1);
		workEffortIcalDataEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		workEffortInventoryAssignEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		workEffortInventoryProducedEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		workEffortKeywordEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		workEffortNoteEClass.getESuperTypes().add(theBizPackage.getBizEntityNote());
		workEffortPartyAssignmentEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		workEffortPurposeTypeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		workEffortReviewEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		workEffortSearchConstraintEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		workEffortSearchResultEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		workEffortSkillStandardEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		workEffortStatusEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		workEffortSurveyApplEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		workEffortTransBoxEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getWorkEffort());
		g1.getETypeArguments().add(g2);
		workEffortTypeEClass.getEGenericSuperTypes().add(g1);
		workEffortTypeAttrEClass.getESuperTypes().add(theBizPackage.getBizEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(applicationSandboxEClass, ApplicationSandbox.class, "ApplicationSandbox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationSandbox_ApplicationId(), ecorePackage.getEString(), "applicationId", null, 1, 1, ApplicationSandbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationSandbox_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, ApplicationSandbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationSandbox_PartyId(), ecorePackage.getEString(), "partyId", null, 0, 1, ApplicationSandbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationSandbox_RoleTypeId(), ecorePackage.getEString(), "roleTypeId", null, 0, 1, ApplicationSandbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationSandbox_RuntimeDataId(), ecorePackage.getEString(), "runtimeDataId", null, 0, 1, ApplicationSandbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationSandbox_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 0, 1, ApplicationSandbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationEventWorkEffEClass, CommunicationEventWorkEff.class, "CommunicationEventWorkEff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicationEventWorkEff_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 1, 1, CommunicationEventWorkEff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationEventWorkEff_CommunicationEventId(), ecorePackage.getEString(), "communicationEventId", null, 1, 1, CommunicationEventWorkEff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationEventWorkEff_Description(), ecorePackage.getEString(), "description", null, 0, 1, CommunicationEventWorkEff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deliverableEClass, Deliverable.class, "Deliverable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeliverable_DeliverableId(), ecorePackage.getEString(), "deliverableId", null, 1, 1, Deliverable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeliverable_DeliverableName(), ecorePackage.getEString(), "deliverableName", null, 0, 1, Deliverable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeliverable_DeliverableTypeId(), ecorePackage.getEString(), "deliverableTypeId", null, 0, 1, Deliverable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeliverable_Description(), ecorePackage.getEString(), "description", null, 0, 1, Deliverable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(deliverableEClass, ecorePackage.getEString(), "requirements", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deliverableEClass, ecorePackage.getEString(), "workEffortDeliverableProds", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(deliverableTypeEClass, DeliverableType.class, "DeliverableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeliverableType_DeliverableTypeId(), ecorePackage.getEString(), "deliverableTypeId", null, 1, 1, DeliverableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeliverableType_Description(), ecorePackage.getEString(), "description", null, 0, 1, DeliverableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(deliverableTypeEClass, ecorePackage.getEString(), "deliverables", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(deliverableTypeEClass, ecorePackage.getEString(), "quoteItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(workEffortEClass, WorkEffort.class, "WorkEffort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffort_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 1, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_AccommodationMapId(), ecorePackage.getEString(), "accommodationMapId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_AccommodationSpotId(), ecorePackage.getEString(), "accommodationSpotId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_ActualCompletionDate(), ecorePackage.getEDate(), "actualCompletionDate", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_ActualMilliSeconds(), ecorePackage.getEDouble(), "actualMilliSeconds", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_ActualSetupMillis(), ecorePackage.getEDouble(), "actualSetupMillis", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_ActualStartDate(), ecorePackage.getEDate(), "actualStartDate", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_CreatedByUserLogin(), ecorePackage.getEString(), "createdByUserLogin", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_CreatedDate(), ecorePackage.getEDate(), "createdDate", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_CurrentStatusId(), ecorePackage.getEString(), "currentStatusId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_Description(), ecorePackage.getEString(), "description", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_EstimateCalcMethod(), ecorePackage.getEString(), "estimateCalcMethod", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_EstimatedCompletionDate(), ecorePackage.getEDate(), "estimatedCompletionDate", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_EstimatedMilliSeconds(), ecorePackage.getEDouble(), "estimatedMilliSeconds", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_EstimatedSetupMillis(), ecorePackage.getEDouble(), "estimatedSetupMillis", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_EstimatedStartDate(), ecorePackage.getEDate(), "estimatedStartDate", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_FacilityId(), ecorePackage.getEString(), "facilityId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_FixedAssetId(), ecorePackage.getEString(), "fixedAssetId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_InfoUrl(), ecorePackage.getEString(), "infoUrl", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_LastModifiedByUserLogin(), ecorePackage.getEString(), "lastModifiedByUserLogin", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_LastModifiedDate(), ecorePackage.getEDate(), "lastModifiedDate", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_LastStatusUpdate(), ecorePackage.getEDate(), "lastStatusUpdate", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_LocationDesc(), ecorePackage.getEString(), "locationDesc", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_MoneyUomId(), ecorePackage.getEString(), "moneyUomId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_NoteId(), ecorePackage.getEString(), "noteId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_PercentComplete(), ecorePackage.getELong(), "percentComplete", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_Priority(), ecorePackage.getELong(), "priority", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_QuantityProduced(), ecorePackage.getEBigDecimal(), "quantityProduced", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_QuantityRejected(), ecorePackage.getEBigDecimal(), "quantityRejected", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_QuantityToProduce(), ecorePackage.getEBigDecimal(), "quantityToProduce", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_RecurrenceInfoId(), ecorePackage.getEString(), "recurrenceInfoId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_Reserv2ndPPPerc(), ecorePackage.getEBigDecimal(), "reserv2ndPPPerc", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_ReservNthPPPerc(), ecorePackage.getEBigDecimal(), "reservNthPPPerc", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_ReservPersons(), ecorePackage.getEBigDecimal(), "reservPersons", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_RevisionNumber(), ecorePackage.getELong(), "revisionNumber", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_RuntimeDataId(), ecorePackage.getEString(), "runtimeDataId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_ScopeEnumId(), ecorePackage.getEString(), "scopeEnumId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_SendNotificationEmail(), ecorePackage.getEBoolean(), "sendNotificationEmail", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_ServiceLoaderName(), ecorePackage.getEString(), "serviceLoaderName", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_ShowAsEnumId(), ecorePackage.getEString(), "showAsEnumId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_SourceReferenceId(), ecorePackage.getEString(), "sourceReferenceId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_SpecialTerms(), ecorePackage.getEString(), "specialTerms", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_TempExprId(), ecorePackage.getEString(), "tempExprId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_TimeTransparency(), ecorePackage.getELong(), "timeTransparency", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_TotalMilliSecondsAllowed(), ecorePackage.getEDouble(), "totalMilliSecondsAllowed", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_TotalMoneyAllowed(), ecorePackage.getEBigDecimal(), "totalMoneyAllowed", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_UniversalId(), ecorePackage.getEString(), "universalId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_WorkEffortName(), ecorePackage.getEString(), "workEffortName", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_WorkEffortParentId(), ecorePackage.getEString(), "workEffortParentId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_WorkEffortPurposeTypeId(), ecorePackage.getEString(), "workEffortPurposeTypeId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_WorkEffortTypeId(), ecorePackage.getEString(), "workEffortTypeId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_CommunicationEventWorkEffs(), ecorePackage.getEString(), "communicationEventWorkEffs", null, 0, -1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_WorkEffortAttributes(), ecorePackage.getEString(), "workEffortAttributes", null, 0, -1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_WorkEffortDeliverableProds(), ecorePackage.getEString(), "workEffortDeliverableProds", null, 0, -1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_WorkEffortEventReminders(), ecorePackage.getEString(), "workEffortEventReminders", null, 0, -1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_WorkEffortFixedAssetStds(), ecorePackage.getEString(), "workEffortFixedAssetStds", null, 0, -1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_WorkEffortInventoryAssigns(), ecorePackage.getEString(), "workEffortInventoryAssigns", null, 0, -1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_WorkEffortInventoryProduceds(), ecorePackage.getEString(), "workEffortInventoryProduceds", null, 0, -1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_WorkEffortKeywords(), ecorePackage.getEString(), "workEffortKeywords", null, 0, -1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_WorkEffortNotes(), ecorePackage.getEString(), "workEffortNotes", null, 0, -1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_WorkEffortSkillStandards(), ecorePackage.getEString(), "workEffortSkillStandards", null, 0, -1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(workEffortEClass, ecorePackage.getEString(), "acctgTranss", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workEffortEClass, ecorePackage.getEString(), "childWorkEfforts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workEffortEClass, ecorePackage.getEString(), "costComponents", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workEffortEClass, ecorePackage.getEString(), "custRequestWorkEfforts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workEffortEClass, ecorePackage.getEString(), "estimatedArrivalShipments", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workEffortEClass, ecorePackage.getEString(), "estimatedShipShipments", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workEffortEClass, ecorePackage.getEString(), "inventoryItemDetails", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workEffortEClass, ecorePackage.getEString(), "maintTemplateProductMaints", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workEffortEClass, ecorePackage.getEString(), "orderHeaderWorkEfforts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workEffortEClass, ecorePackage.getEString(), "quoteItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workEffortEClass, ecorePackage.getEString(), "quoteWorkEfforts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workEffortEClass, ecorePackage.getEString(), "salesOpportunityWorkEfforts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workEffortEClass, ecorePackage.getEString(), "scheduleFixedAssetMaints", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workEffortEClass, ecorePackage.getEString(), "shoppingListWorkEfforts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workEffortEClass, ecorePackage.getEString(), "timeEntries", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workEffortEClass, ecorePackage.getEString(), "workRequirementFulfillments", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(workEffortAssocEClass, WorkEffortAssoc.class, "WorkEffortAssoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortAssoc_WorkEffortIdFrom(), ecorePackage.getEString(), "workEffortIdFrom", null, 1, 1, WorkEffortAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAssoc_WorkEffortIdTo(), ecorePackage.getEString(), "workEffortIdTo", null, 1, 1, WorkEffortAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAssoc_WorkEffortAssocTypeId(), ecorePackage.getEString(), "workEffortAssocTypeId", null, 1, 1, WorkEffortAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAssoc_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, WorkEffortAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAssoc_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, WorkEffortAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAssoc_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, WorkEffortAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortAssocAttributeEClass, WorkEffortAssocAttribute.class, "WorkEffortAssocAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortAssocAttribute_WorkEffortIdFrom(), ecorePackage.getEString(), "workEffortIdFrom", null, 1, 1, WorkEffortAssocAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAssocAttribute_WorkEffortIdTo(), ecorePackage.getEString(), "workEffortIdTo", null, 1, 1, WorkEffortAssocAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAssocAttribute_WorkEffortAssocTypeId(), ecorePackage.getEString(), "workEffortAssocTypeId", null, 1, 1, WorkEffortAssocAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAssocAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, WorkEffortAssocAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAssocAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, WorkEffortAssocAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAssocAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, WorkEffortAssocAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAssocAttribute_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, WorkEffortAssocAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortAssocTypeEClass, WorkEffortAssocType.class, "WorkEffortAssocType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortAssocType_WorkEffortAssocTypeId(), ecorePackage.getEString(), "workEffortAssocTypeId", null, 1, 1, WorkEffortAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAssocType_Description(), ecorePackage.getEString(), "description", null, 0, 1, WorkEffortAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAssocType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, WorkEffortAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAssocType_ParentTypeId(), ecorePackage.getEString(), "parentTypeId", null, 0, 1, WorkEffortAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAssocType_WorkEffortAssocTypeAttrs(), ecorePackage.getEString(), "workEffortAssocTypeAttrs", null, 0, -1, WorkEffortAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(workEffortAssocTypeEClass, ecorePackage.getEString(), "childWorkEffortAssocTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(workEffortAssocTypeAttrEClass, WorkEffortAssocTypeAttr.class, "WorkEffortAssocTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortAssocTypeAttr_WorkEffortAssocTypeId(), ecorePackage.getEString(), "workEffortAssocTypeId", null, 1, 1, WorkEffortAssocTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAssocTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, WorkEffortAssocTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAssocTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, WorkEffortAssocTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortAttributeEClass, WorkEffortAttribute.class, "WorkEffortAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortAttribute_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 1, 1, WorkEffortAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, WorkEffortAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, WorkEffortAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, WorkEffortAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortBillingEClass, WorkEffortBilling.class, "WorkEffortBilling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortBilling_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 1, 1, WorkEffortBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortBilling_InvoiceId(), ecorePackage.getEString(), "invoiceId", null, 1, 1, WorkEffortBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortBilling_InvoiceItemSeqId(), ecorePackage.getEString(), "invoiceItemSeqId", null, 1, 1, WorkEffortBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortBilling_Percentage(), ecorePackage.getEDouble(), "percentage", null, 0, 1, WorkEffortBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortContactMechEClass, WorkEffortContactMech.class, "WorkEffortContactMech", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortContactMech_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 1, 1, WorkEffortContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortContactMech_ContactMechId(), ecorePackage.getEString(), "contactMechId", null, 1, 1, WorkEffortContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortContactMech_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, WorkEffortContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortContactMech_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, WorkEffortContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortContactMech_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, WorkEffortContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortContentEClass, WorkEffortContent.class, "WorkEffortContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortContent_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 1, 1, WorkEffortContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortContent_ContentId(), ecorePackage.getEString(), "contentId", null, 1, 1, WorkEffortContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortContent_WorkEffortContentTypeId(), ecorePackage.getEString(), "workEffortContentTypeId", null, 1, 1, WorkEffortContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortContent_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, WorkEffortContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortContent_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, WorkEffortContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortContentTypeEClass, WorkEffortContentType.class, "WorkEffortContentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortContentType_WorkEffortContentTypeId(), ecorePackage.getEString(), "workEffortContentTypeId", null, 1, 1, WorkEffortContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortContentType_Description(), ecorePackage.getEString(), "description", null, 0, 1, WorkEffortContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortContentType_ParentTypeId(), ecorePackage.getEString(), "parentTypeId", null, 0, 1, WorkEffortContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(workEffortContentTypeEClass, ecorePackage.getEString(), "childWorkEffortContentTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(workEffortCostCalcEClass, WorkEffortCostCalc.class, "WorkEffortCostCalc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortCostCalc_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 1, 1, WorkEffortCostCalc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortCostCalc_CostComponentTypeId(), ecorePackage.getEString(), "costComponentTypeId", null, 1, 1, WorkEffortCostCalc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortCostCalc_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, WorkEffortCostCalc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortCostCalc_CostComponentCalcId(), ecorePackage.getEString(), "costComponentCalcId", null, 0, 1, WorkEffortCostCalc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortCostCalc_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, WorkEffortCostCalc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortDeliverableProdEClass, WorkEffortDeliverableProd.class, "WorkEffortDeliverableProd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortDeliverableProd_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 1, 1, WorkEffortDeliverableProd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortDeliverableProd_DeliverableId(), ecorePackage.getEString(), "deliverableId", null, 1, 1, WorkEffortDeliverableProd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortEventReminderEClass, WorkEffortEventReminder.class, "WorkEffortEventReminder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortEventReminder_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 1, 1, WorkEffortEventReminder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortEventReminder_SequenceId(), ecorePackage.getEString(), "sequenceId", null, 1, 1, WorkEffortEventReminder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortEventReminder_ContactMechId(), ecorePackage.getEString(), "contactMechId", null, 0, 1, WorkEffortEventReminder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortEventReminder_CurrentCount(), ecorePackage.getELong(), "currentCount", null, 0, 1, WorkEffortEventReminder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortEventReminder_LocaleId(), ecorePackage.getEString(), "localeId", null, 0, 1, WorkEffortEventReminder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortEventReminder_PartyId(), ecorePackage.getEString(), "partyId", null, 0, 1, WorkEffortEventReminder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortEventReminder_ReminderDateTime(), ecorePackage.getEDate(), "reminderDateTime", null, 0, 1, WorkEffortEventReminder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortEventReminder_ReminderOffset(), ecorePackage.getELong(), "reminderOffset", null, 0, 1, WorkEffortEventReminder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortEventReminder_RepeatCount(), ecorePackage.getELong(), "repeatCount", null, 0, 1, WorkEffortEventReminder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortEventReminder_RepeatInterval(), ecorePackage.getELong(), "repeatInterval", null, 0, 1, WorkEffortEventReminder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortEventReminder_TimeZoneId(), ecorePackage.getEString(), "timeZoneId", null, 0, 1, WorkEffortEventReminder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortFixedAssetAssignEClass, WorkEffortFixedAssetAssign.class, "WorkEffortFixedAssetAssign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortFixedAssetAssign_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 1, 1, WorkEffortFixedAssetAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortFixedAssetAssign_FixedAssetId(), ecorePackage.getEString(), "fixedAssetId", null, 1, 1, WorkEffortFixedAssetAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortFixedAssetAssign_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, WorkEffortFixedAssetAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortFixedAssetAssign_AllocatedCost(), ecorePackage.getEBigDecimal(), "allocatedCost", null, 0, 1, WorkEffortFixedAssetAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortFixedAssetAssign_AvailabilityStatusId(), ecorePackage.getEString(), "availabilityStatusId", null, 0, 1, WorkEffortFixedAssetAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortFixedAssetAssign_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, WorkEffortFixedAssetAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortFixedAssetAssign_StatusId(), ecorePackage.getEString(), "statusId", null, 0, 1, WorkEffortFixedAssetAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortFixedAssetAssign_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, WorkEffortFixedAssetAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortFixedAssetStdEClass, WorkEffortFixedAssetStd.class, "WorkEffortFixedAssetStd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortFixedAssetStd_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 1, 1, WorkEffortFixedAssetStd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortFixedAssetStd_FixedAssetTypeId(), ecorePackage.getEString(), "fixedAssetTypeId", null, 1, 1, WorkEffortFixedAssetStd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortFixedAssetStd_EstimatedCost(), ecorePackage.getEBigDecimal(), "estimatedCost", null, 0, 1, WorkEffortFixedAssetStd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortFixedAssetStd_EstimatedDuration(), ecorePackage.getEDouble(), "estimatedDuration", null, 0, 1, WorkEffortFixedAssetStd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortFixedAssetStd_EstimatedQuantity(), ecorePackage.getEDouble(), "estimatedQuantity", null, 0, 1, WorkEffortFixedAssetStd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortGoodStandardEClass, WorkEffortGoodStandard.class, "WorkEffortGoodStandard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortGoodStandard_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 1, 1, WorkEffortGoodStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortGoodStandard_ProductId(), ecorePackage.getEString(), "productId", null, 1, 1, WorkEffortGoodStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortGoodStandard_WorkEffortGoodStdTypeId(), ecorePackage.getEString(), "workEffortGoodStdTypeId", null, 1, 1, WorkEffortGoodStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortGoodStandard_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, WorkEffortGoodStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortGoodStandard_EstimatedCost(), ecorePackage.getEBigDecimal(), "estimatedCost", null, 0, 1, WorkEffortGoodStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortGoodStandard_EstimatedQuantity(), ecorePackage.getEDouble(), "estimatedQuantity", null, 0, 1, WorkEffortGoodStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortGoodStandard_StatusId(), ecorePackage.getEString(), "statusId", null, 0, 1, WorkEffortGoodStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortGoodStandard_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, WorkEffortGoodStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortGoodStandardTypeEClass, WorkEffortGoodStandardType.class, "WorkEffortGoodStandardType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortGoodStandardType_WorkEffortGoodStdTypeId(), ecorePackage.getEString(), "workEffortGoodStdTypeId", null, 1, 1, WorkEffortGoodStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortGoodStandardType_Description(), ecorePackage.getEString(), "description", null, 0, 1, WorkEffortGoodStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortGoodStandardType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, WorkEffortGoodStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortGoodStandardType_ParentTypeId(), ecorePackage.getEString(), "parentTypeId", null, 0, 1, WorkEffortGoodStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(workEffortGoodStandardTypeEClass, ecorePackage.getEString(), "childWorkEffortGoodStandardTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(workEffortIcalDataEClass, WorkEffortIcalData.class, "WorkEffortIcalData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortIcalData_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 1, 1, WorkEffortIcalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortIcalData_IcalData(), ecorePackage.getEString(), "icalData", null, 0, 1, WorkEffortIcalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortInventoryAssignEClass, WorkEffortInventoryAssign.class, "WorkEffortInventoryAssign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortInventoryAssign_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 1, 1, WorkEffortInventoryAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortInventoryAssign_InventoryItemId(), ecorePackage.getEString(), "inventoryItemId", null, 1, 1, WorkEffortInventoryAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortInventoryAssign_Quantity(), ecorePackage.getEDouble(), "quantity", null, 0, 1, WorkEffortInventoryAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortInventoryAssign_StatusId(), ecorePackage.getEString(), "statusId", null, 0, 1, WorkEffortInventoryAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortInventoryProducedEClass, WorkEffortInventoryProduced.class, "WorkEffortInventoryProduced", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortInventoryProduced_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 1, 1, WorkEffortInventoryProduced.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortInventoryProduced_InventoryItemId(), ecorePackage.getEString(), "inventoryItemId", null, 1, 1, WorkEffortInventoryProduced.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortKeywordEClass, WorkEffortKeyword.class, "WorkEffortKeyword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortKeyword_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 1, 1, WorkEffortKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortKeyword_Keyword(), ecorePackage.getEString(), "keyword", null, 1, 1, WorkEffortKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortKeyword_RelevancyWeight(), ecorePackage.getELong(), "relevancyWeight", null, 0, 1, WorkEffortKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortNoteEClass, WorkEffortNote.class, "WorkEffortNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortNote_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 1, 1, WorkEffortNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortNote_InternalNote(), ecorePackage.getEBoolean(), "internalNote", null, 0, 1, WorkEffortNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortPartyAssignmentEClass, WorkEffortPartyAssignment.class, "WorkEffortPartyAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortPartyAssignment_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 1, 1, WorkEffortPartyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortPartyAssignment_PartyId(), ecorePackage.getEString(), "partyId", null, 1, 1, WorkEffortPartyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortPartyAssignment_RoleTypeId(), ecorePackage.getEString(), "roleTypeId", null, 1, 1, WorkEffortPartyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortPartyAssignment_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, WorkEffortPartyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortPartyAssignment_AssignedByUserLoginId(), ecorePackage.getEString(), "assignedByUserLoginId", null, 0, 1, WorkEffortPartyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortPartyAssignment_AvailabilityStatusId(), ecorePackage.getEString(), "availabilityStatusId", null, 0, 1, WorkEffortPartyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortPartyAssignment_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, WorkEffortPartyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortPartyAssignment_DelegateReasonEnumId(), ecorePackage.getEString(), "delegateReasonEnumId", null, 0, 1, WorkEffortPartyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortPartyAssignment_ExpectationEnumId(), ecorePackage.getEString(), "expectationEnumId", null, 0, 1, WorkEffortPartyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortPartyAssignment_FacilityId(), ecorePackage.getEString(), "facilityId", null, 0, 1, WorkEffortPartyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortPartyAssignment_MustRsvp(), ecorePackage.getEBoolean(), "mustRsvp", null, 0, 1, WorkEffortPartyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortPartyAssignment_StatusDateTime(), ecorePackage.getEDate(), "statusDateTime", null, 0, 1, WorkEffortPartyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortPartyAssignment_StatusId(), ecorePackage.getEString(), "statusId", null, 0, 1, WorkEffortPartyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortPartyAssignment_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, WorkEffortPartyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortPurposeTypeEClass, WorkEffortPurposeType.class, "WorkEffortPurposeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortPurposeType_WorkEffortPurposeTypeId(), ecorePackage.getEString(), "workEffortPurposeTypeId", null, 1, 1, WorkEffortPurposeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortPurposeType_Description(), ecorePackage.getEString(), "description", null, 0, 1, WorkEffortPurposeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortPurposeType_ParentTypeId(), ecorePackage.getEString(), "parentTypeId", null, 0, 1, WorkEffortPurposeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(workEffortPurposeTypeEClass, ecorePackage.getEString(), "childWorkEffortPurposeTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workEffortPurposeTypeEClass, ecorePackage.getEString(), "workEfforts", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(workEffortReviewEClass, WorkEffortReview.class, "WorkEffortReview", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortReview_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 1, 1, WorkEffortReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortReview_UserLoginId(), ecorePackage.getEString(), "userLoginId", null, 1, 1, WorkEffortReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortReview_ReviewDate(), ecorePackage.getEDate(), "reviewDate", null, 1, 1, WorkEffortReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortReview_PostedAnonymous(), ecorePackage.getEBoolean(), "postedAnonymous", null, 0, 1, WorkEffortReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortReview_Rating(), ecorePackage.getEDouble(), "rating", null, 0, 1, WorkEffortReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortReview_ReviewText(), ecorePackage.getEString(), "reviewText", null, 0, 1, WorkEffortReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortReview_StatusId(), ecorePackage.getEString(), "statusId", null, 0, 1, WorkEffortReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortSearchConstraintEClass, WorkEffortSearchConstraint.class, "WorkEffortSearchConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortSearchConstraint_WorkEffortSearchResultId(), ecorePackage.getEString(), "workEffortSearchResultId", null, 1, 1, WorkEffortSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSearchConstraint_ConstraintSeqId(), ecorePackage.getEString(), "constraintSeqId", null, 1, 1, WorkEffortSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSearchConstraint_AnyPrefix(), ecorePackage.getEBoolean(), "anyPrefix", null, 0, 1, WorkEffortSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSearchConstraint_AnySuffix(), ecorePackage.getEBoolean(), "anySuffix", null, 0, 1, WorkEffortSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSearchConstraint_ConstraintName(), ecorePackage.getEString(), "constraintName", null, 0, 1, WorkEffortSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSearchConstraint_HighValue(), ecorePackage.getEString(), "highValue", null, 0, 1, WorkEffortSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSearchConstraint_IncludeSubWorkEfforts(), ecorePackage.getEBoolean(), "includeSubWorkEfforts", null, 0, 1, WorkEffortSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSearchConstraint_InfoString(), ecorePackage.getEString(), "infoString", null, 0, 1, WorkEffortSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSearchConstraint_IsAnd(), ecorePackage.getEBoolean(), "isAnd", null, 0, 1, WorkEffortSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSearchConstraint_LowValue(), ecorePackage.getEString(), "lowValue", null, 0, 1, WorkEffortSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSearchConstraint_RemoveStems(), ecorePackage.getEBoolean(), "removeStems", null, 0, 1, WorkEffortSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortSearchResultEClass, WorkEffortSearchResult.class, "WorkEffortSearchResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortSearchResult_WorkEffortSearchResultId(), ecorePackage.getEString(), "workEffortSearchResultId", null, 1, 1, WorkEffortSearchResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSearchResult_IsAscending(), ecorePackage.getEBoolean(), "isAscending", null, 0, 1, WorkEffortSearchResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSearchResult_NumResults(), ecorePackage.getELong(), "numResults", null, 0, 1, WorkEffortSearchResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSearchResult_OrderByName(), ecorePackage.getEString(), "orderByName", null, 0, 1, WorkEffortSearchResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSearchResult_SearchDate(), ecorePackage.getEDate(), "searchDate", null, 0, 1, WorkEffortSearchResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSearchResult_SecondsTotal(), ecorePackage.getEDouble(), "secondsTotal", null, 0, 1, WorkEffortSearchResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSearchResult_VisitId(), ecorePackage.getEString(), "visitId", null, 0, 1, WorkEffortSearchResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSearchResult_WorkEffortSearchConstraints(), ecorePackage.getEString(), "workEffortSearchConstraints", null, 0, -1, WorkEffortSearchResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortSkillStandardEClass, WorkEffortSkillStandard.class, "WorkEffortSkillStandard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortSkillStandard_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 1, 1, WorkEffortSkillStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSkillStandard_SkillTypeId(), ecorePackage.getEString(), "skillTypeId", null, 1, 1, WorkEffortSkillStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSkillStandard_EstimatedCost(), ecorePackage.getEBigDecimal(), "estimatedCost", null, 0, 1, WorkEffortSkillStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSkillStandard_EstimatedDuration(), ecorePackage.getEDouble(), "estimatedDuration", null, 0, 1, WorkEffortSkillStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSkillStandard_EstimatedNumPeople(), ecorePackage.getEDouble(), "estimatedNumPeople", null, 0, 1, WorkEffortSkillStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortStatusEClass, WorkEffortStatus.class, "WorkEffortStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortStatus_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 1, 1, WorkEffortStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortStatus_StatusId(), ecorePackage.getEString(), "statusId", null, 1, 1, WorkEffortStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortStatus_StatusDatetime(), ecorePackage.getEDate(), "statusDatetime", null, 1, 1, WorkEffortStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortStatus_Reason(), ecorePackage.getEString(), "reason", null, 0, 1, WorkEffortStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortStatus_SetByUserLogin(), ecorePackage.getEString(), "setByUserLogin", null, 0, 1, WorkEffortStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortSurveyApplEClass, WorkEffortSurveyAppl.class, "WorkEffortSurveyAppl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortSurveyAppl_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 1, 1, WorkEffortSurveyAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSurveyAppl_SurveyId(), ecorePackage.getEString(), "surveyId", null, 1, 1, WorkEffortSurveyAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSurveyAppl_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, WorkEffortSurveyAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSurveyAppl_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, WorkEffortSurveyAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortTransBoxEClass, WorkEffortTransBox.class, "WorkEffortTransBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortTransBox_ProcessWorkEffortId(), ecorePackage.getEString(), "processWorkEffortId", null, 1, 1, WorkEffortTransBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortTransBox_ToActivityId(), ecorePackage.getEString(), "toActivityId", null, 1, 1, WorkEffortTransBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortTransBox_TransitionId(), ecorePackage.getEString(), "transitionId", null, 1, 1, WorkEffortTransBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortTypeEClass, WorkEffortType.class, "WorkEffortType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortType_WorkEffortTypeId(), ecorePackage.getEString(), "workEffortTypeId", null, 1, 1, WorkEffortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortType_Description(), ecorePackage.getEString(), "description", null, 0, 1, WorkEffortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, WorkEffortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortType_ParentTypeId(), ecorePackage.getEString(), "parentTypeId", null, 0, 1, WorkEffortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortType_WorkEffortTypeAttrs(), ecorePackage.getEString(), "workEffortTypeAttrs", null, 0, -1, WorkEffortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(workEffortTypeEClass, ecorePackage.getEString(), "childWorkEffortTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(workEffortTypeEClass, ecorePackage.getEString(), "workEfforts", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(workEffortTypeAttrEClass, WorkEffortTypeAttr.class, "WorkEffortTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortTypeAttr_WorkEffortTypeId(), ecorePackage.getEString(), "workEffortTypeId", null, 1, 1, WorkEffortTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, WorkEffortTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, WorkEffortTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getApplicationSandbox_ApplicationId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getCommunicationEventWorkEff_WorkEffortId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getCommunicationEventWorkEff_CommunicationEventId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (deliverableEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (deliverableEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getDeliverable_DeliverableId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (deliverableTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (deliverableTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getDeliverableType_DeliverableTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(3),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(4),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(5),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(6),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(7),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(8),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(9),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(10),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(11),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(12),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(13),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(14),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(15),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getWorkEffort_WorkEffortId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffort_CommunicationEventWorkEffs(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getWorkEffort_WorkEffortAttributes(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getWorkEffort_WorkEffortDeliverableProds(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getWorkEffort_WorkEffortEventReminders(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getWorkEffort_WorkEffortFixedAssetStds(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getWorkEffort_WorkEffortInventoryAssigns(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getWorkEffort_WorkEffortInventoryProduceds(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getWorkEffort_WorkEffortKeywords(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getWorkEffort_WorkEffortNotes(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getWorkEffort_WorkEffortSkillStandards(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getWorkEffortAssoc_WorkEffortIdFrom(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortAssoc_WorkEffortIdTo(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortAssoc_WorkEffortAssocTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortAssoc_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortAssocAttribute_WorkEffortIdFrom(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortAssocAttribute_WorkEffortIdTo(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortAssocAttribute_WorkEffortAssocTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortAssocAttribute_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (workEffortAssocTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getWorkEffortAssocType_WorkEffortAssocTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortAssocType_WorkEffortAssocTypeAttrs(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getWorkEffortAssocTypeAttr_WorkEffortAssocTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortAssocTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortAttribute_WorkEffortId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortAttribute_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortBilling_WorkEffortId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortBilling_InvoiceId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortBilling_InvoiceItemSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortContactMech_WorkEffortId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortContactMech_ContactMechId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortContactMech_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortContent_WorkEffortId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortContent_ContentId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortContent_WorkEffortContentTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortContent_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (workEffortContentTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getWorkEffortContentType_WorkEffortContentTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortCostCalc_WorkEffortId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortCostCalc_CostComponentTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortCostCalc_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortDeliverableProd_WorkEffortId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortDeliverableProd_DeliverableId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortEventReminder_WorkEffortId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortEventReminder_SequenceId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortFixedAssetAssign_WorkEffortId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortFixedAssetAssign_FixedAssetId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortFixedAssetAssign_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortFixedAssetStd_WorkEffortId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortFixedAssetStd_FixedAssetTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortGoodStandard_WorkEffortId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortGoodStandard_ProductId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortGoodStandard_WorkEffortGoodStdTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortGoodStandard_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (workEffortGoodStandardTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getWorkEffortGoodStandardType_WorkEffortGoodStdTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortIcalData_WorkEffortId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortInventoryAssign_WorkEffortId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortInventoryAssign_InventoryItemId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortInventoryProduced_WorkEffortId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortInventoryProduced_InventoryItemId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortKeyword_WorkEffortId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortKeyword_Keyword(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortNote_WorkEffortId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortPartyAssignment_WorkEffortId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortPartyAssignment_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortPartyAssignment_RoleTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortPartyAssignment_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (workEffortPurposeTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (workEffortPurposeTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getWorkEffortPurposeType_WorkEffortPurposeTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortReview_WorkEffortId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortReview_UserLoginId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortReview_ReviewDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortSearchConstraint_WorkEffortSearchResultId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortSearchConstraint_ConstraintSeqId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortSearchResult_WorkEffortSearchResultId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortSearchResult_WorkEffortSearchConstraints(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getWorkEffortSkillStandard_WorkEffortId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortSkillStandard_SkillTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortStatus_WorkEffortId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortStatus_StatusId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortStatus_StatusDatetime(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortSurveyAppl_WorkEffortId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortSurveyAppl_SurveyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortSurveyAppl_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortTransBox_ProcessWorkEffortId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortTransBox_ToActivityId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortTransBox_TransitionId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (workEffortTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (workEffortTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getWorkEffortType_WorkEffortTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortType_WorkEffortTypeAttrs(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getWorkEffortTypeAttr_WorkEffortTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortTypeAttr_AttrName(),
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
		  (getApplicationSandbox_RuntimeDataId(),
		   source,
		   new String[] {
			   "frame", "RuntimeData"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getCommunicationEventWorkEff_WorkEffortId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getCommunicationEventWorkEff_CommunicationEventId(),
		   source,
		   new String[] {
			   "frame", "CommunicationEvent"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (deliverableEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "Requirement",
			   "route", "deliverableId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (deliverableEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "WorkEffortDeliverableProd",
			   "route", "deliverableId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getDeliverable_DeliverableTypeId(),
		   source,
		   new String[] {
			   "frame", "DeliverableType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (deliverableTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "Deliverable",
			   "route", "deliverableTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (deliverableTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "QuoteItem",
			   "route", "deliverableTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "AcctgTrans",
			   "route", "workEffortId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "WorkEffort",
			   "route", "workEffortParentId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "frame", "CostComponent",
			   "route", "workEffortId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(3),
		   source,
		   new String[] {
			   "frame", "CustRequestWorkEffort",
			   "route", "workEffortId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(4),
		   source,
		   new String[] {
			   "frame", "Shipment",
			   "route", "estimatedArrivalWorkEffId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(5),
		   source,
		   new String[] {
			   "frame", "Shipment",
			   "route", "estimatedShipWorkEffId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(6),
		   source,
		   new String[] {
			   "frame", "InventoryItemDetail",
			   "route", "workEffortId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(7),
		   source,
		   new String[] {
			   "frame", "ProductMaint",
			   "route", "maintTemplateWorkEffortId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(8),
		   source,
		   new String[] {
			   "frame", "OrderHeaderWorkEffort",
			   "route", "workEffortId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(9),
		   source,
		   new String[] {
			   "frame", "QuoteItem",
			   "route", "workEffortId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(10),
		   source,
		   new String[] {
			   "frame", "QuoteWorkEffort",
			   "route", "workEffortId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(11),
		   source,
		   new String[] {
			   "frame", "SalesOpportunityWorkEffort",
			   "route", "workEffortId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(12),
		   source,
		   new String[] {
			   "frame", "FixedAssetMaint",
			   "route", "scheduleWorkEffortId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(13),
		   source,
		   new String[] {
			   "frame", "ShoppingListWorkEffort",
			   "route", "workEffortId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(14),
		   source,
		   new String[] {
			   "frame", "TimeEntry",
			   "route", "workEffortId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (workEffortEClass.getEOperations().get(15),
		   source,
		   new String[] {
			   "frame", "WorkRequirementFulfillment",
			   "route", "workEffortId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffort_AccommodationMapId(),
		   source,
		   new String[] {
			   "frame", "AccommodationMap"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffort_AccommodationSpotId(),
		   source,
		   new String[] {
			   "frame", "AccommodationSpot"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffort_CurrentStatusId(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffort_EstimateCalcMethod(),
		   source,
		   new String[] {
			   "frame", "CustomMethod"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffort_FacilityId(),
		   source,
		   new String[] {
			   "frame", "Facility"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffort_FixedAssetId(),
		   source,
		   new String[] {
			   "frame", "FixedAsset"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffort_MoneyUomId(),
		   source,
		   new String[] {
			   "frame", "Uom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffort_NoteId(),
		   source,
		   new String[] {
			   "frame", "NoteData"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffort_RecurrenceInfoId(),
		   source,
		   new String[] {
			   "frame", "RecurrenceInfo"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffort_RuntimeDataId(),
		   source,
		   new String[] {
			   "frame", "RuntimeData"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffort_ScopeEnumId(),
		   source,
		   new String[] {
			   "frame", "Enumeration"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffort_TempExprId(),
		   source,
		   new String[] {
			   "frame", "TemporalExpression"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffort_WorkEffortParentId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffort_WorkEffortPurposeTypeId(),
		   source,
		   new String[] {
			   "frame", "WorkEffortPurposeType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffort_WorkEffortTypeId(),
		   source,
		   new String[] {
			   "frame", "WorkEffortType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffort_CommunicationEventWorkEffs(),
		   source,
		   new String[] {
			   "frame", "CommunicationEventWorkEff"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffort_WorkEffortAttributes(),
		   source,
		   new String[] {
			   "frame", "WorkEffortAttribute"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffort_WorkEffortDeliverableProds(),
		   source,
		   new String[] {
			   "frame", "WorkEffortDeliverableProd"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffort_WorkEffortEventReminders(),
		   source,
		   new String[] {
			   "frame", "WorkEffortEventReminder"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffort_WorkEffortFixedAssetStds(),
		   source,
		   new String[] {
			   "frame", "WorkEffortFixedAssetStd"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffort_WorkEffortInventoryAssigns(),
		   source,
		   new String[] {
			   "frame", "WorkEffortInventoryAssign"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffort_WorkEffortInventoryProduceds(),
		   source,
		   new String[] {
			   "frame", "WorkEffortInventoryProduced"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffort_WorkEffortKeywords(),
		   source,
		   new String[] {
			   "frame", "WorkEffortKeyword"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffort_WorkEffortNotes(),
		   source,
		   new String[] {
			   "frame", "WorkEffortNote"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffort_WorkEffortSkillStandards(),
		   source,
		   new String[] {
			   "frame", "WorkEffortSkillStandard"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortAssoc_WorkEffortIdFrom(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortAssoc_WorkEffortIdTo(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortAssoc_WorkEffortAssocTypeId(),
		   source,
		   new String[] {
			   "frame", "WorkEffortAssocType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (workEffortAssocTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "WorkEffortAssocType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortAssocType_ParentTypeId(),
		   source,
		   new String[] {
			   "frame", "WorkEffortAssocType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortAssocType_WorkEffortAssocTypeAttrs(),
		   source,
		   new String[] {
			   "frame", "WorkEffortAssocTypeAttr"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortAssocTypeAttr_WorkEffortAssocTypeId(),
		   source,
		   new String[] {
			   "frame", "WorkEffortAssocType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortAttribute_WorkEffortId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortBilling_WorkEffortId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortBilling_InvoiceId(),
		   source,
		   new String[] {
			   "frame", "Invoice"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortContactMech_WorkEffortId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortContactMech_ContactMechId(),
		   source,
		   new String[] {
			   "frame", "ContactMech"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortContent_WorkEffortId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortContent_ContentId(),
		   source,
		   new String[] {
			   "frame", "Content"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortContent_WorkEffortContentTypeId(),
		   source,
		   new String[] {
			   "frame", "WorkEffortContentType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (workEffortContentTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "WorkEffortContentType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortContentType_ParentTypeId(),
		   source,
		   new String[] {
			   "frame", "WorkEffortContentType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortCostCalc_WorkEffortId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortCostCalc_CostComponentTypeId(),
		   source,
		   new String[] {
			   "frame", "CostComponentType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortCostCalc_CostComponentCalcId(),
		   source,
		   new String[] {
			   "frame", "CostComponentCalc"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortDeliverableProd_WorkEffortId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortDeliverableProd_DeliverableId(),
		   source,
		   new String[] {
			   "frame", "Deliverable"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortEventReminder_WorkEffortId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortEventReminder_ContactMechId(),
		   source,
		   new String[] {
			   "frame", "ContactMech"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortEventReminder_PartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortFixedAssetAssign_WorkEffortId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortFixedAssetAssign_FixedAssetId(),
		   source,
		   new String[] {
			   "frame", "FixedAsset"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortFixedAssetAssign_AvailabilityStatusId(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortFixedAssetAssign_StatusId(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortFixedAssetStd_WorkEffortId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortFixedAssetStd_FixedAssetTypeId(),
		   source,
		   new String[] {
			   "frame", "FixedAssetType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortGoodStandard_WorkEffortId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortGoodStandard_ProductId(),
		   source,
		   new String[] {
			   "frame", "Product"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortGoodStandard_WorkEffortGoodStdTypeId(),
		   source,
		   new String[] {
			   "frame", "WorkEffortGoodStandardType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortGoodStandard_StatusId(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (workEffortGoodStandardTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "WorkEffortGoodStandardType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortGoodStandardType_ParentTypeId(),
		   source,
		   new String[] {
			   "frame", "WorkEffortGoodStandardType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortIcalData_WorkEffortId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortInventoryAssign_WorkEffortId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortInventoryAssign_InventoryItemId(),
		   source,
		   new String[] {
			   "frame", "InventoryItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortInventoryAssign_StatusId(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortInventoryProduced_WorkEffortId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortInventoryProduced_InventoryItemId(),
		   source,
		   new String[] {
			   "frame", "InventoryItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortKeyword_WorkEffortId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortNote_WorkEffortId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortPartyAssignment_WorkEffortId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortPartyAssignment_PartyId(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortPartyAssignment_RoleTypeId(),
		   source,
		   new String[] {
			   "frame", "RoleType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortPartyAssignment_AssignedByUserLoginId(),
		   source,
		   new String[] {
			   "frame", "UserLogin"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortPartyAssignment_AvailabilityStatusId(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortPartyAssignment_DelegateReasonEnumId(),
		   source,
		   new String[] {
			   "frame", "Enumeration"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortPartyAssignment_ExpectationEnumId(),
		   source,
		   new String[] {
			   "frame", "Enumeration"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortPartyAssignment_FacilityId(),
		   source,
		   new String[] {
			   "frame", "Facility"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortPartyAssignment_StatusId(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (workEffortPurposeTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "WorkEffortPurposeType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (workEffortPurposeTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "WorkEffort",
			   "route", "workEffortPurposeTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortPurposeType_ParentTypeId(),
		   source,
		   new String[] {
			   "frame", "WorkEffortPurposeType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortReview_WorkEffortId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortReview_UserLoginId(),
		   source,
		   new String[] {
			   "frame", "UserLogin"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortReview_StatusId(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortSearchConstraint_WorkEffortSearchResultId(),
		   source,
		   new String[] {
			   "frame", "WorkEffortSearchResult"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortSearchResult_WorkEffortSearchConstraints(),
		   source,
		   new String[] {
			   "frame", "WorkEffortSearchConstraint"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortSkillStandard_WorkEffortId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortSkillStandard_SkillTypeId(),
		   source,
		   new String[] {
			   "frame", "SkillType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortStatus_WorkEffortId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortStatus_StatusId(),
		   source,
		   new String[] {
			   "frame", "StatusItem"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortStatus_SetByUserLogin(),
		   source,
		   new String[] {
			   "frame", "UserLogin"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortSurveyAppl_WorkEffortId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortSurveyAppl_SurveyId(),
		   source,
		   new String[] {
			   "frame", "Survey"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortTransBox_ProcessWorkEffortId(),
		   source,
		   new String[] {
			   "frame", "WorkEffort"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (workEffortTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "WorkEffortType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (workEffortTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "WorkEffort",
			   "route", "workEffortTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortType_ParentTypeId(),
		   source,
		   new String[] {
			   "frame", "WorkEffortType"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortType_WorkEffortTypeAttrs(),
		   source,
		   new String[] {
			   "frame", "WorkEffortTypeAttr"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getWorkEffortTypeAttr_WorkEffortTypeId(),
		   source,
		   new String[] {
			   "frame", "WorkEffortType"
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
		  (communicationEventWorkEffEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (deliverableEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (deliverableTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (workEffortEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (workEffortAssocTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (workEffortAssocTypeAttrEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (workEffortContentTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (workEffortGoodStandardTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (workEffortPurposeTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (workEffortTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (workEffortTypeAttrEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
	}

} //WorkeffortPackageImpl
