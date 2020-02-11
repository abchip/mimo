/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort.impl;

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

		// Create package meta-data objects
		theWorkeffortPackage.createPackageContents();
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

		// Initialize created meta-data
		theWorkeffortPackage.initializePackageContents();
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
	public EReference getApplicationSandbox_RuntimeDataId() {
		return (EReference)applicationSandboxEClass.getEStructuralFeatures().get(4);
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
	public EReference getCommunicationEventWorkEff_WorkEffortId() {
		return (EReference)communicationEventWorkEffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicationEventWorkEff_CommunicationEventId() {
		return (EReference)communicationEventWorkEffEClass.getEStructuralFeatures().get(1);
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
	public EReference getDeliverable_DeliverableTypeId() {
		return (EReference)deliverableEClass.getEStructuralFeatures().get(2);
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
	public EReference getWorkEffort_AccommodationMapId() {
		return (EReference)workEffortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffort_AccommodationSpotId() {
		return (EReference)workEffortEClass.getEStructuralFeatures().get(2);
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
	public EReference getWorkEffort_CommunicationEventWorkEffs() {
		return (EReference)workEffortEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_CreatedByUserLogin() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_CreatedDate() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffort_CurrentStatusId() {
		return (EReference)workEffortEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_Description() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffort_EstimateCalcMethod() {
		return (EReference)workEffortEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_EstimatedCompletionDate() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_EstimatedMilliSeconds() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_EstimatedSetupMillis() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_EstimatedStartDate() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffort_FacilityId() {
		return (EReference)workEffortEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffort_FixedAssetId() {
		return (EReference)workEffortEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_InfoUrl() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_LastModifiedByUserLogin() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_LastModifiedDate() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_LastStatusUpdate() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_LocationDesc() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffort_MoneyUomId() {
		return (EReference)workEffortEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffort_NoteId() {
		return (EReference)workEffortEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_PercentComplete() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_Priority() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_QuantityProduced() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_QuantityRejected() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_QuantityToProduce() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffort_RecurrenceInfoId() {
		return (EReference)workEffortEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_Reserv2ndPPPerc() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_ReservNthPPPerc() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_ReservPersons() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_RevisionNumber() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffort_RuntimeDataId() {
		return (EReference)workEffortEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffort_ScopeEnumId() {
		return (EReference)workEffortEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_SendNotificationEmail() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_ServiceLoaderName() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_ShowAsEnumId() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_SourceReferenceId() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_SpecialTerms() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffort_TempExprId() {
		return (EReference)workEffortEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_TimeTransparency() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_TotalMilliSecondsAllowed() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_TotalMoneyAllowed() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_UniversalId() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffort_WorkEffortAttributes() {
		return (EReference)workEffortEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffort_WorkEffortDeliverableProds() {
		return (EReference)workEffortEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffort_WorkEffortEventReminders() {
		return (EReference)workEffortEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffort_WorkEffortFixedAssetStds() {
		return (EReference)workEffortEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffort_WorkEffortInventoryAssigns() {
		return (EReference)workEffortEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffort_WorkEffortInventoryProduceds() {
		return (EReference)workEffortEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffort_WorkEffortKeywords() {
		return (EReference)workEffortEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffort_WorkEffortName() {
		return (EAttribute)workEffortEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffort_WorkEffortNotes() {
		return (EReference)workEffortEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffort_WorkEffortParentId() {
		return (EReference)workEffortEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffort_WorkEffortPurposeTypeId() {
		return (EReference)workEffortEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffort_WorkEffortSkillStandards() {
		return (EReference)workEffortEClass.getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffort_WorkEffortTypeId() {
		return (EReference)workEffortEClass.getEStructuralFeatures().get(60);
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
	public EReference getWorkEffortAssoc_WorkEffortIdFrom() {
		return (EReference)workEffortAssocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffortAssoc_WorkEffortIdTo() {
		return (EReference)workEffortAssocEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffortAssoc_WorkEffortAssocTypeId() {
		return (EReference)workEffortAssocEClass.getEStructuralFeatures().get(0);
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
		return (EAttribute)workEffortAssocAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortAssocAttribute_WorkEffortIdTo() {
		return (EAttribute)workEffortAssocAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortAssocAttribute_WorkEffortAssocTypeId() {
		return (EAttribute)workEffortAssocAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkEffortAssocAttribute_AttrName() {
		return (EAttribute)workEffortAssocAttributeEClass.getEStructuralFeatures().get(0);
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
	public EReference getWorkEffortAssocType_ParentTypeId() {
		return (EReference)workEffortAssocTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffortAssocType_WorkEffortAssocTypeAttrs() {
		return (EReference)workEffortAssocTypeEClass.getEStructuralFeatures().get(4);
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
	public EReference getWorkEffortAssocTypeAttr_WorkEffortAssocTypeId() {
		return (EReference)workEffortAssocTypeAttrEClass.getEStructuralFeatures().get(0);
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
	public EReference getWorkEffortAttribute_WorkEffortId() {
		return (EReference)workEffortAttributeEClass.getEStructuralFeatures().get(0);
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
	public EReference getWorkEffortBilling_WorkEffortId() {
		return (EReference)workEffortBillingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffortBilling_InvoiceId() {
		return (EReference)workEffortBillingEClass.getEStructuralFeatures().get(1);
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
	public EReference getWorkEffortContactMech_WorkEffortId() {
		return (EReference)workEffortContactMechEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffortContactMech_ContactMechId() {
		return (EReference)workEffortContactMechEClass.getEStructuralFeatures().get(1);
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
	public EReference getWorkEffortContent_WorkEffortId() {
		return (EReference)workEffortContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffortContent_ContentId() {
		return (EReference)workEffortContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffortContent_WorkEffortContentTypeId() {
		return (EReference)workEffortContentEClass.getEStructuralFeatures().get(2);
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
	public EReference getWorkEffortContentType_ParentTypeId() {
		return (EReference)workEffortContentTypeEClass.getEStructuralFeatures().get(2);
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
	public EReference getWorkEffortCostCalc_WorkEffortId() {
		return (EReference)workEffortCostCalcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffortCostCalc_CostComponentTypeId() {
		return (EReference)workEffortCostCalcEClass.getEStructuralFeatures().get(1);
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
	public EReference getWorkEffortCostCalc_CostComponentCalcId() {
		return (EReference)workEffortCostCalcEClass.getEStructuralFeatures().get(3);
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
	public EReference getWorkEffortDeliverableProd_WorkEffortId() {
		return (EReference)workEffortDeliverableProdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffortDeliverableProd_DeliverableId() {
		return (EReference)workEffortDeliverableProdEClass.getEStructuralFeatures().get(1);
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
	public EReference getWorkEffortEventReminder_WorkEffortId() {
		return (EReference)workEffortEventReminderEClass.getEStructuralFeatures().get(0);
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
	public EReference getWorkEffortEventReminder_ContactMechId() {
		return (EReference)workEffortEventReminderEClass.getEStructuralFeatures().get(2);
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
	public EReference getWorkEffortEventReminder_PartyId() {
		return (EReference)workEffortEventReminderEClass.getEStructuralFeatures().get(5);
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
	public EReference getWorkEffortFixedAssetAssign_WorkEffortId() {
		return (EReference)workEffortFixedAssetAssignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffortFixedAssetAssign_FixedAssetId() {
		return (EReference)workEffortFixedAssetAssignEClass.getEStructuralFeatures().get(1);
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
	public EReference getWorkEffortFixedAssetAssign_AvailabilityStatusId() {
		return (EReference)workEffortFixedAssetAssignEClass.getEStructuralFeatures().get(4);
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
	public EReference getWorkEffortFixedAssetAssign_StatusId() {
		return (EReference)workEffortFixedAssetAssignEClass.getEStructuralFeatures().get(6);
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
	public EReference getWorkEffortFixedAssetStd_WorkEffortId() {
		return (EReference)workEffortFixedAssetStdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffortFixedAssetStd_FixedAssetTypeId() {
		return (EReference)workEffortFixedAssetStdEClass.getEStructuralFeatures().get(1);
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
	public EReference getWorkEffortGoodStandard_WorkEffortId() {
		return (EReference)workEffortGoodStandardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffortGoodStandard_ProductId() {
		return (EReference)workEffortGoodStandardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffortGoodStandard_WorkEffortGoodStdTypeId() {
		return (EReference)workEffortGoodStandardEClass.getEStructuralFeatures().get(1);
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
	public EReference getWorkEffortGoodStandard_StatusId() {
		return (EReference)workEffortGoodStandardEClass.getEStructuralFeatures().get(6);
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
	public EReference getWorkEffortGoodStandardType_ParentTypeId() {
		return (EReference)workEffortGoodStandardTypeEClass.getEStructuralFeatures().get(3);
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
	public EReference getWorkEffortInventoryAssign_WorkEffortId() {
		return (EReference)workEffortInventoryAssignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffortInventoryAssign_InventoryItemId() {
		return (EReference)workEffortInventoryAssignEClass.getEStructuralFeatures().get(1);
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
	public EReference getWorkEffortInventoryAssign_StatusId() {
		return (EReference)workEffortInventoryAssignEClass.getEStructuralFeatures().get(3);
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
	public EReference getWorkEffortInventoryProduced_WorkEffortId() {
		return (EReference)workEffortInventoryProducedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffortInventoryProduced_InventoryItemId() {
		return (EReference)workEffortInventoryProducedEClass.getEStructuralFeatures().get(1);
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
	public EReference getWorkEffortKeyword_WorkEffortId() {
		return (EReference)workEffortKeywordEClass.getEStructuralFeatures().get(0);
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
	public EReference getWorkEffortNote_WorkEffortId() {
		return (EReference)workEffortNoteEClass.getEStructuralFeatures().get(0);
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
	public EReference getWorkEffortPartyAssignment_WorkEffortId() {
		return (EReference)workEffortPartyAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffortPartyAssignment_PartyId() {
		return (EReference)workEffortPartyAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffortPartyAssignment_RoleTypeId() {
		return (EReference)workEffortPartyAssignmentEClass.getEStructuralFeatures().get(2);
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
	public EReference getWorkEffortPartyAssignment_AssignedByUserLoginId() {
		return (EReference)workEffortPartyAssignmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffortPartyAssignment_AvailabilityStatusId() {
		return (EReference)workEffortPartyAssignmentEClass.getEStructuralFeatures().get(5);
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
	public EReference getWorkEffortPartyAssignment_DelegateReasonEnumId() {
		return (EReference)workEffortPartyAssignmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffortPartyAssignment_ExpectationEnumId() {
		return (EReference)workEffortPartyAssignmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffortPartyAssignment_FacilityId() {
		return (EReference)workEffortPartyAssignmentEClass.getEStructuralFeatures().get(9);
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
	public EReference getWorkEffortPartyAssignment_StatusId() {
		return (EReference)workEffortPartyAssignmentEClass.getEStructuralFeatures().get(12);
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
	public EReference getWorkEffortPurposeType_ParentTypeId() {
		return (EReference)workEffortPurposeTypeEClass.getEStructuralFeatures().get(2);
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
	public EReference getWorkEffortReview_WorkEffortId() {
		return (EReference)workEffortReviewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffortReview_UserLoginId() {
		return (EReference)workEffortReviewEClass.getEStructuralFeatures().get(1);
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
	public EReference getWorkEffortReview_StatusId() {
		return (EReference)workEffortReviewEClass.getEStructuralFeatures().get(6);
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
	public EReference getWorkEffortSearchConstraint_WorkEffortSearchResultId() {
		return (EReference)workEffortSearchConstraintEClass.getEStructuralFeatures().get(0);
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
	public EReference getWorkEffortSearchResult_WorkEffortSearchConstraints() {
		return (EReference)workEffortSearchResultEClass.getEStructuralFeatures().get(7);
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
	public EReference getWorkEffortSkillStandard_WorkEffortId() {
		return (EReference)workEffortSkillStandardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffortSkillStandard_SkillTypeId() {
		return (EReference)workEffortSkillStandardEClass.getEStructuralFeatures().get(1);
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
	public EReference getWorkEffortStatus_WorkEffortId() {
		return (EReference)workEffortStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffortStatus_StatusId() {
		return (EReference)workEffortStatusEClass.getEStructuralFeatures().get(1);
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
	public EReference getWorkEffortStatus_SetByUserLogin() {
		return (EReference)workEffortStatusEClass.getEStructuralFeatures().get(4);
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
	public EReference getWorkEffortSurveyAppl_WorkEffortId() {
		return (EReference)workEffortSurveyApplEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffortSurveyAppl_SurveyId() {
		return (EReference)workEffortSurveyApplEClass.getEStructuralFeatures().get(0);
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
	public EReference getWorkEffortTransBox_ProcessWorkEffortId() {
		return (EReference)workEffortTransBoxEClass.getEStructuralFeatures().get(0);
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
	public EReference getWorkEffortType_ParentTypeId() {
		return (EReference)workEffortTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkEffortType_WorkEffortTypeAttrs() {
		return (EReference)workEffortTypeEClass.getEStructuralFeatures().get(4);
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
	public EReference getWorkEffortTypeAttr_WorkEffortTypeId() {
		return (EReference)workEffortTypeAttrEClass.getEStructuralFeatures().get(0);
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
		createEReference(applicationSandboxEClass, APPLICATION_SANDBOX__RUNTIME_DATA_ID);
		createEAttribute(applicationSandboxEClass, APPLICATION_SANDBOX__WORK_EFFORT_ID);

		communicationEventWorkEffEClass = createEClass(COMMUNICATION_EVENT_WORK_EFF);
		createEReference(communicationEventWorkEffEClass, COMMUNICATION_EVENT_WORK_EFF__WORK_EFFORT_ID);
		createEReference(communicationEventWorkEffEClass, COMMUNICATION_EVENT_WORK_EFF__COMMUNICATION_EVENT_ID);
		createEAttribute(communicationEventWorkEffEClass, COMMUNICATION_EVENT_WORK_EFF__DESCRIPTION);

		deliverableEClass = createEClass(DELIVERABLE);
		createEAttribute(deliverableEClass, DELIVERABLE__DELIVERABLE_ID);
		createEAttribute(deliverableEClass, DELIVERABLE__DELIVERABLE_NAME);
		createEReference(deliverableEClass, DELIVERABLE__DELIVERABLE_TYPE_ID);
		createEAttribute(deliverableEClass, DELIVERABLE__DESCRIPTION);

		deliverableTypeEClass = createEClass(DELIVERABLE_TYPE);
		createEAttribute(deliverableTypeEClass, DELIVERABLE_TYPE__DELIVERABLE_TYPE_ID);
		createEAttribute(deliverableTypeEClass, DELIVERABLE_TYPE__DESCRIPTION);

		workEffortEClass = createEClass(WORK_EFFORT);
		createEAttribute(workEffortEClass, WORK_EFFORT__WORK_EFFORT_ID);
		createEReference(workEffortEClass, WORK_EFFORT__ACCOMMODATION_MAP_ID);
		createEReference(workEffortEClass, WORK_EFFORT__ACCOMMODATION_SPOT_ID);
		createEAttribute(workEffortEClass, WORK_EFFORT__ACTUAL_COMPLETION_DATE);
		createEAttribute(workEffortEClass, WORK_EFFORT__ACTUAL_MILLI_SECONDS);
		createEAttribute(workEffortEClass, WORK_EFFORT__ACTUAL_SETUP_MILLIS);
		createEAttribute(workEffortEClass, WORK_EFFORT__ACTUAL_START_DATE);
		createEReference(workEffortEClass, WORK_EFFORT__COMMUNICATION_EVENT_WORK_EFFS);
		createEAttribute(workEffortEClass, WORK_EFFORT__CREATED_BY_USER_LOGIN);
		createEAttribute(workEffortEClass, WORK_EFFORT__CREATED_DATE);
		createEReference(workEffortEClass, WORK_EFFORT__CURRENT_STATUS_ID);
		createEAttribute(workEffortEClass, WORK_EFFORT__DESCRIPTION);
		createEReference(workEffortEClass, WORK_EFFORT__ESTIMATE_CALC_METHOD);
		createEAttribute(workEffortEClass, WORK_EFFORT__ESTIMATED_COMPLETION_DATE);
		createEAttribute(workEffortEClass, WORK_EFFORT__ESTIMATED_MILLI_SECONDS);
		createEAttribute(workEffortEClass, WORK_EFFORT__ESTIMATED_SETUP_MILLIS);
		createEAttribute(workEffortEClass, WORK_EFFORT__ESTIMATED_START_DATE);
		createEReference(workEffortEClass, WORK_EFFORT__FACILITY_ID);
		createEReference(workEffortEClass, WORK_EFFORT__FIXED_ASSET_ID);
		createEAttribute(workEffortEClass, WORK_EFFORT__INFO_URL);
		createEAttribute(workEffortEClass, WORK_EFFORT__LAST_MODIFIED_BY_USER_LOGIN);
		createEAttribute(workEffortEClass, WORK_EFFORT__LAST_MODIFIED_DATE);
		createEAttribute(workEffortEClass, WORK_EFFORT__LAST_STATUS_UPDATE);
		createEAttribute(workEffortEClass, WORK_EFFORT__LOCATION_DESC);
		createEReference(workEffortEClass, WORK_EFFORT__MONEY_UOM_ID);
		createEReference(workEffortEClass, WORK_EFFORT__NOTE_ID);
		createEAttribute(workEffortEClass, WORK_EFFORT__PERCENT_COMPLETE);
		createEAttribute(workEffortEClass, WORK_EFFORT__PRIORITY);
		createEAttribute(workEffortEClass, WORK_EFFORT__QUANTITY_PRODUCED);
		createEAttribute(workEffortEClass, WORK_EFFORT__QUANTITY_REJECTED);
		createEAttribute(workEffortEClass, WORK_EFFORT__QUANTITY_TO_PRODUCE);
		createEReference(workEffortEClass, WORK_EFFORT__RECURRENCE_INFO_ID);
		createEAttribute(workEffortEClass, WORK_EFFORT__RESERV2ND_PP_PERC);
		createEAttribute(workEffortEClass, WORK_EFFORT__RESERV_NTH_PP_PERC);
		createEAttribute(workEffortEClass, WORK_EFFORT__RESERV_PERSONS);
		createEAttribute(workEffortEClass, WORK_EFFORT__REVISION_NUMBER);
		createEReference(workEffortEClass, WORK_EFFORT__RUNTIME_DATA_ID);
		createEReference(workEffortEClass, WORK_EFFORT__SCOPE_ENUM_ID);
		createEAttribute(workEffortEClass, WORK_EFFORT__SEND_NOTIFICATION_EMAIL);
		createEAttribute(workEffortEClass, WORK_EFFORT__SERVICE_LOADER_NAME);
		createEAttribute(workEffortEClass, WORK_EFFORT__SHOW_AS_ENUM_ID);
		createEAttribute(workEffortEClass, WORK_EFFORT__SOURCE_REFERENCE_ID);
		createEAttribute(workEffortEClass, WORK_EFFORT__SPECIAL_TERMS);
		createEReference(workEffortEClass, WORK_EFFORT__TEMP_EXPR_ID);
		createEAttribute(workEffortEClass, WORK_EFFORT__TIME_TRANSPARENCY);
		createEAttribute(workEffortEClass, WORK_EFFORT__TOTAL_MILLI_SECONDS_ALLOWED);
		createEAttribute(workEffortEClass, WORK_EFFORT__TOTAL_MONEY_ALLOWED);
		createEAttribute(workEffortEClass, WORK_EFFORT__UNIVERSAL_ID);
		createEReference(workEffortEClass, WORK_EFFORT__WORK_EFFORT_ATTRIBUTES);
		createEReference(workEffortEClass, WORK_EFFORT__WORK_EFFORT_DELIVERABLE_PRODS);
		createEReference(workEffortEClass, WORK_EFFORT__WORK_EFFORT_EVENT_REMINDERS);
		createEReference(workEffortEClass, WORK_EFFORT__WORK_EFFORT_FIXED_ASSET_STDS);
		createEReference(workEffortEClass, WORK_EFFORT__WORK_EFFORT_INVENTORY_ASSIGNS);
		createEReference(workEffortEClass, WORK_EFFORT__WORK_EFFORT_INVENTORY_PRODUCEDS);
		createEReference(workEffortEClass, WORK_EFFORT__WORK_EFFORT_KEYWORDS);
		createEAttribute(workEffortEClass, WORK_EFFORT__WORK_EFFORT_NAME);
		createEReference(workEffortEClass, WORK_EFFORT__WORK_EFFORT_NOTES);
		createEReference(workEffortEClass, WORK_EFFORT__WORK_EFFORT_PARENT_ID);
		createEReference(workEffortEClass, WORK_EFFORT__WORK_EFFORT_PURPOSE_TYPE_ID);
		createEReference(workEffortEClass, WORK_EFFORT__WORK_EFFORT_SKILL_STANDARDS);
		createEReference(workEffortEClass, WORK_EFFORT__WORK_EFFORT_TYPE_ID);

		workEffortAssocEClass = createEClass(WORK_EFFORT_ASSOC);
		createEReference(workEffortAssocEClass, WORK_EFFORT_ASSOC__WORK_EFFORT_ASSOC_TYPE_ID);
		createEReference(workEffortAssocEClass, WORK_EFFORT_ASSOC__WORK_EFFORT_ID_FROM);
		createEReference(workEffortAssocEClass, WORK_EFFORT_ASSOC__WORK_EFFORT_ID_TO);
		createEAttribute(workEffortAssocEClass, WORK_EFFORT_ASSOC__FROM_DATE);
		createEAttribute(workEffortAssocEClass, WORK_EFFORT_ASSOC__SEQUENCE_NUM);
		createEAttribute(workEffortAssocEClass, WORK_EFFORT_ASSOC__THRU_DATE);

		workEffortAssocAttributeEClass = createEClass(WORK_EFFORT_ASSOC_ATTRIBUTE);
		createEAttribute(workEffortAssocAttributeEClass, WORK_EFFORT_ASSOC_ATTRIBUTE__ATTR_NAME);
		createEAttribute(workEffortAssocAttributeEClass, WORK_EFFORT_ASSOC_ATTRIBUTE__WORK_EFFORT_ASSOC_TYPE_ID);
		createEAttribute(workEffortAssocAttributeEClass, WORK_EFFORT_ASSOC_ATTRIBUTE__WORK_EFFORT_ID_FROM);
		createEAttribute(workEffortAssocAttributeEClass, WORK_EFFORT_ASSOC_ATTRIBUTE__WORK_EFFORT_ID_TO);
		createEAttribute(workEffortAssocAttributeEClass, WORK_EFFORT_ASSOC_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(workEffortAssocAttributeEClass, WORK_EFFORT_ASSOC_ATTRIBUTE__ATTR_VALUE);
		createEAttribute(workEffortAssocAttributeEClass, WORK_EFFORT_ASSOC_ATTRIBUTE__FROM_DATE);

		workEffortAssocTypeEClass = createEClass(WORK_EFFORT_ASSOC_TYPE);
		createEAttribute(workEffortAssocTypeEClass, WORK_EFFORT_ASSOC_TYPE__WORK_EFFORT_ASSOC_TYPE_ID);
		createEAttribute(workEffortAssocTypeEClass, WORK_EFFORT_ASSOC_TYPE__DESCRIPTION);
		createEAttribute(workEffortAssocTypeEClass, WORK_EFFORT_ASSOC_TYPE__HAS_TABLE);
		createEReference(workEffortAssocTypeEClass, WORK_EFFORT_ASSOC_TYPE__PARENT_TYPE_ID);
		createEReference(workEffortAssocTypeEClass, WORK_EFFORT_ASSOC_TYPE__WORK_EFFORT_ASSOC_TYPE_ATTRS);

		workEffortAssocTypeAttrEClass = createEClass(WORK_EFFORT_ASSOC_TYPE_ATTR);
		createEReference(workEffortAssocTypeAttrEClass, WORK_EFFORT_ASSOC_TYPE_ATTR__WORK_EFFORT_ASSOC_TYPE_ID);
		createEAttribute(workEffortAssocTypeAttrEClass, WORK_EFFORT_ASSOC_TYPE_ATTR__ATTR_NAME);
		createEAttribute(workEffortAssocTypeAttrEClass, WORK_EFFORT_ASSOC_TYPE_ATTR__DESCRIPTION);

		workEffortAttributeEClass = createEClass(WORK_EFFORT_ATTRIBUTE);
		createEReference(workEffortAttributeEClass, WORK_EFFORT_ATTRIBUTE__WORK_EFFORT_ID);
		createEAttribute(workEffortAttributeEClass, WORK_EFFORT_ATTRIBUTE__ATTR_NAME);
		createEAttribute(workEffortAttributeEClass, WORK_EFFORT_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(workEffortAttributeEClass, WORK_EFFORT_ATTRIBUTE__ATTR_VALUE);

		workEffortBillingEClass = createEClass(WORK_EFFORT_BILLING);
		createEReference(workEffortBillingEClass, WORK_EFFORT_BILLING__WORK_EFFORT_ID);
		createEReference(workEffortBillingEClass, WORK_EFFORT_BILLING__INVOICE_ID);
		createEAttribute(workEffortBillingEClass, WORK_EFFORT_BILLING__INVOICE_ITEM_SEQ_ID);
		createEAttribute(workEffortBillingEClass, WORK_EFFORT_BILLING__PERCENTAGE);

		workEffortContactMechEClass = createEClass(WORK_EFFORT_CONTACT_MECH);
		createEReference(workEffortContactMechEClass, WORK_EFFORT_CONTACT_MECH__WORK_EFFORT_ID);
		createEReference(workEffortContactMechEClass, WORK_EFFORT_CONTACT_MECH__CONTACT_MECH_ID);
		createEAttribute(workEffortContactMechEClass, WORK_EFFORT_CONTACT_MECH__FROM_DATE);
		createEAttribute(workEffortContactMechEClass, WORK_EFFORT_CONTACT_MECH__COMMENTS);
		createEAttribute(workEffortContactMechEClass, WORK_EFFORT_CONTACT_MECH__THRU_DATE);

		workEffortContentEClass = createEClass(WORK_EFFORT_CONTENT);
		createEReference(workEffortContentEClass, WORK_EFFORT_CONTENT__WORK_EFFORT_ID);
		createEReference(workEffortContentEClass, WORK_EFFORT_CONTENT__CONTENT_ID);
		createEReference(workEffortContentEClass, WORK_EFFORT_CONTENT__WORK_EFFORT_CONTENT_TYPE_ID);
		createEAttribute(workEffortContentEClass, WORK_EFFORT_CONTENT__FROM_DATE);
		createEAttribute(workEffortContentEClass, WORK_EFFORT_CONTENT__THRU_DATE);

		workEffortContentTypeEClass = createEClass(WORK_EFFORT_CONTENT_TYPE);
		createEAttribute(workEffortContentTypeEClass, WORK_EFFORT_CONTENT_TYPE__WORK_EFFORT_CONTENT_TYPE_ID);
		createEAttribute(workEffortContentTypeEClass, WORK_EFFORT_CONTENT_TYPE__DESCRIPTION);
		createEReference(workEffortContentTypeEClass, WORK_EFFORT_CONTENT_TYPE__PARENT_TYPE_ID);

		workEffortCostCalcEClass = createEClass(WORK_EFFORT_COST_CALC);
		createEReference(workEffortCostCalcEClass, WORK_EFFORT_COST_CALC__WORK_EFFORT_ID);
		createEReference(workEffortCostCalcEClass, WORK_EFFORT_COST_CALC__COST_COMPONENT_TYPE_ID);
		createEAttribute(workEffortCostCalcEClass, WORK_EFFORT_COST_CALC__FROM_DATE);
		createEReference(workEffortCostCalcEClass, WORK_EFFORT_COST_CALC__COST_COMPONENT_CALC_ID);
		createEAttribute(workEffortCostCalcEClass, WORK_EFFORT_COST_CALC__THRU_DATE);

		workEffortDeliverableProdEClass = createEClass(WORK_EFFORT_DELIVERABLE_PROD);
		createEReference(workEffortDeliverableProdEClass, WORK_EFFORT_DELIVERABLE_PROD__WORK_EFFORT_ID);
		createEReference(workEffortDeliverableProdEClass, WORK_EFFORT_DELIVERABLE_PROD__DELIVERABLE_ID);

		workEffortEventReminderEClass = createEClass(WORK_EFFORT_EVENT_REMINDER);
		createEReference(workEffortEventReminderEClass, WORK_EFFORT_EVENT_REMINDER__WORK_EFFORT_ID);
		createEAttribute(workEffortEventReminderEClass, WORK_EFFORT_EVENT_REMINDER__SEQUENCE_ID);
		createEReference(workEffortEventReminderEClass, WORK_EFFORT_EVENT_REMINDER__CONTACT_MECH_ID);
		createEAttribute(workEffortEventReminderEClass, WORK_EFFORT_EVENT_REMINDER__CURRENT_COUNT);
		createEAttribute(workEffortEventReminderEClass, WORK_EFFORT_EVENT_REMINDER__LOCALE_ID);
		createEReference(workEffortEventReminderEClass, WORK_EFFORT_EVENT_REMINDER__PARTY_ID);
		createEAttribute(workEffortEventReminderEClass, WORK_EFFORT_EVENT_REMINDER__REMINDER_DATE_TIME);
		createEAttribute(workEffortEventReminderEClass, WORK_EFFORT_EVENT_REMINDER__REMINDER_OFFSET);
		createEAttribute(workEffortEventReminderEClass, WORK_EFFORT_EVENT_REMINDER__REPEAT_COUNT);
		createEAttribute(workEffortEventReminderEClass, WORK_EFFORT_EVENT_REMINDER__REPEAT_INTERVAL);
		createEAttribute(workEffortEventReminderEClass, WORK_EFFORT_EVENT_REMINDER__TIME_ZONE_ID);

		workEffortFixedAssetAssignEClass = createEClass(WORK_EFFORT_FIXED_ASSET_ASSIGN);
		createEReference(workEffortFixedAssetAssignEClass, WORK_EFFORT_FIXED_ASSET_ASSIGN__WORK_EFFORT_ID);
		createEReference(workEffortFixedAssetAssignEClass, WORK_EFFORT_FIXED_ASSET_ASSIGN__FIXED_ASSET_ID);
		createEAttribute(workEffortFixedAssetAssignEClass, WORK_EFFORT_FIXED_ASSET_ASSIGN__FROM_DATE);
		createEAttribute(workEffortFixedAssetAssignEClass, WORK_EFFORT_FIXED_ASSET_ASSIGN__ALLOCATED_COST);
		createEReference(workEffortFixedAssetAssignEClass, WORK_EFFORT_FIXED_ASSET_ASSIGN__AVAILABILITY_STATUS_ID);
		createEAttribute(workEffortFixedAssetAssignEClass, WORK_EFFORT_FIXED_ASSET_ASSIGN__COMMENTS);
		createEReference(workEffortFixedAssetAssignEClass, WORK_EFFORT_FIXED_ASSET_ASSIGN__STATUS_ID);
		createEAttribute(workEffortFixedAssetAssignEClass, WORK_EFFORT_FIXED_ASSET_ASSIGN__THRU_DATE);

		workEffortFixedAssetStdEClass = createEClass(WORK_EFFORT_FIXED_ASSET_STD);
		createEReference(workEffortFixedAssetStdEClass, WORK_EFFORT_FIXED_ASSET_STD__WORK_EFFORT_ID);
		createEReference(workEffortFixedAssetStdEClass, WORK_EFFORT_FIXED_ASSET_STD__FIXED_ASSET_TYPE_ID);
		createEAttribute(workEffortFixedAssetStdEClass, WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_COST);
		createEAttribute(workEffortFixedAssetStdEClass, WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_DURATION);
		createEAttribute(workEffortFixedAssetStdEClass, WORK_EFFORT_FIXED_ASSET_STD__ESTIMATED_QUANTITY);

		workEffortGoodStandardEClass = createEClass(WORK_EFFORT_GOOD_STANDARD);
		createEReference(workEffortGoodStandardEClass, WORK_EFFORT_GOOD_STANDARD__WORK_EFFORT_ID);
		createEReference(workEffortGoodStandardEClass, WORK_EFFORT_GOOD_STANDARD__WORK_EFFORT_GOOD_STD_TYPE_ID);
		createEReference(workEffortGoodStandardEClass, WORK_EFFORT_GOOD_STANDARD__PRODUCT_ID);
		createEAttribute(workEffortGoodStandardEClass, WORK_EFFORT_GOOD_STANDARD__FROM_DATE);
		createEAttribute(workEffortGoodStandardEClass, WORK_EFFORT_GOOD_STANDARD__ESTIMATED_COST);
		createEAttribute(workEffortGoodStandardEClass, WORK_EFFORT_GOOD_STANDARD__ESTIMATED_QUANTITY);
		createEReference(workEffortGoodStandardEClass, WORK_EFFORT_GOOD_STANDARD__STATUS_ID);
		createEAttribute(workEffortGoodStandardEClass, WORK_EFFORT_GOOD_STANDARD__THRU_DATE);

		workEffortGoodStandardTypeEClass = createEClass(WORK_EFFORT_GOOD_STANDARD_TYPE);
		createEAttribute(workEffortGoodStandardTypeEClass, WORK_EFFORT_GOOD_STANDARD_TYPE__WORK_EFFORT_GOOD_STD_TYPE_ID);
		createEAttribute(workEffortGoodStandardTypeEClass, WORK_EFFORT_GOOD_STANDARD_TYPE__DESCRIPTION);
		createEAttribute(workEffortGoodStandardTypeEClass, WORK_EFFORT_GOOD_STANDARD_TYPE__HAS_TABLE);
		createEReference(workEffortGoodStandardTypeEClass, WORK_EFFORT_GOOD_STANDARD_TYPE__PARENT_TYPE_ID);

		workEffortIcalDataEClass = createEClass(WORK_EFFORT_ICAL_DATA);
		createEAttribute(workEffortIcalDataEClass, WORK_EFFORT_ICAL_DATA__WORK_EFFORT_ID);
		createEAttribute(workEffortIcalDataEClass, WORK_EFFORT_ICAL_DATA__ICAL_DATA);

		workEffortInventoryAssignEClass = createEClass(WORK_EFFORT_INVENTORY_ASSIGN);
		createEReference(workEffortInventoryAssignEClass, WORK_EFFORT_INVENTORY_ASSIGN__WORK_EFFORT_ID);
		createEReference(workEffortInventoryAssignEClass, WORK_EFFORT_INVENTORY_ASSIGN__INVENTORY_ITEM_ID);
		createEAttribute(workEffortInventoryAssignEClass, WORK_EFFORT_INVENTORY_ASSIGN__QUANTITY);
		createEReference(workEffortInventoryAssignEClass, WORK_EFFORT_INVENTORY_ASSIGN__STATUS_ID);

		workEffortInventoryProducedEClass = createEClass(WORK_EFFORT_INVENTORY_PRODUCED);
		createEReference(workEffortInventoryProducedEClass, WORK_EFFORT_INVENTORY_PRODUCED__WORK_EFFORT_ID);
		createEReference(workEffortInventoryProducedEClass, WORK_EFFORT_INVENTORY_PRODUCED__INVENTORY_ITEM_ID);

		workEffortKeywordEClass = createEClass(WORK_EFFORT_KEYWORD);
		createEReference(workEffortKeywordEClass, WORK_EFFORT_KEYWORD__WORK_EFFORT_ID);
		createEAttribute(workEffortKeywordEClass, WORK_EFFORT_KEYWORD__KEYWORD);
		createEAttribute(workEffortKeywordEClass, WORK_EFFORT_KEYWORD__RELEVANCY_WEIGHT);

		workEffortNoteEClass = createEClass(WORK_EFFORT_NOTE);
		createEReference(workEffortNoteEClass, WORK_EFFORT_NOTE__WORK_EFFORT_ID);
		createEAttribute(workEffortNoteEClass, WORK_EFFORT_NOTE__INTERNAL_NOTE);

		workEffortPartyAssignmentEClass = createEClass(WORK_EFFORT_PARTY_ASSIGNMENT);
		createEReference(workEffortPartyAssignmentEClass, WORK_EFFORT_PARTY_ASSIGNMENT__WORK_EFFORT_ID);
		createEReference(workEffortPartyAssignmentEClass, WORK_EFFORT_PARTY_ASSIGNMENT__PARTY_ID);
		createEReference(workEffortPartyAssignmentEClass, WORK_EFFORT_PARTY_ASSIGNMENT__ROLE_TYPE_ID);
		createEAttribute(workEffortPartyAssignmentEClass, WORK_EFFORT_PARTY_ASSIGNMENT__FROM_DATE);
		createEReference(workEffortPartyAssignmentEClass, WORK_EFFORT_PARTY_ASSIGNMENT__ASSIGNED_BY_USER_LOGIN_ID);
		createEReference(workEffortPartyAssignmentEClass, WORK_EFFORT_PARTY_ASSIGNMENT__AVAILABILITY_STATUS_ID);
		createEAttribute(workEffortPartyAssignmentEClass, WORK_EFFORT_PARTY_ASSIGNMENT__COMMENTS);
		createEReference(workEffortPartyAssignmentEClass, WORK_EFFORT_PARTY_ASSIGNMENT__DELEGATE_REASON_ENUM_ID);
		createEReference(workEffortPartyAssignmentEClass, WORK_EFFORT_PARTY_ASSIGNMENT__EXPECTATION_ENUM_ID);
		createEReference(workEffortPartyAssignmentEClass, WORK_EFFORT_PARTY_ASSIGNMENT__FACILITY_ID);
		createEAttribute(workEffortPartyAssignmentEClass, WORK_EFFORT_PARTY_ASSIGNMENT__MUST_RSVP);
		createEAttribute(workEffortPartyAssignmentEClass, WORK_EFFORT_PARTY_ASSIGNMENT__STATUS_DATE_TIME);
		createEReference(workEffortPartyAssignmentEClass, WORK_EFFORT_PARTY_ASSIGNMENT__STATUS_ID);
		createEAttribute(workEffortPartyAssignmentEClass, WORK_EFFORT_PARTY_ASSIGNMENT__THRU_DATE);

		workEffortPurposeTypeEClass = createEClass(WORK_EFFORT_PURPOSE_TYPE);
		createEAttribute(workEffortPurposeTypeEClass, WORK_EFFORT_PURPOSE_TYPE__WORK_EFFORT_PURPOSE_TYPE_ID);
		createEAttribute(workEffortPurposeTypeEClass, WORK_EFFORT_PURPOSE_TYPE__DESCRIPTION);
		createEReference(workEffortPurposeTypeEClass, WORK_EFFORT_PURPOSE_TYPE__PARENT_TYPE_ID);

		workEffortReviewEClass = createEClass(WORK_EFFORT_REVIEW);
		createEReference(workEffortReviewEClass, WORK_EFFORT_REVIEW__WORK_EFFORT_ID);
		createEReference(workEffortReviewEClass, WORK_EFFORT_REVIEW__USER_LOGIN_ID);
		createEAttribute(workEffortReviewEClass, WORK_EFFORT_REVIEW__REVIEW_DATE);
		createEAttribute(workEffortReviewEClass, WORK_EFFORT_REVIEW__POSTED_ANONYMOUS);
		createEAttribute(workEffortReviewEClass, WORK_EFFORT_REVIEW__RATING);
		createEAttribute(workEffortReviewEClass, WORK_EFFORT_REVIEW__REVIEW_TEXT);
		createEReference(workEffortReviewEClass, WORK_EFFORT_REVIEW__STATUS_ID);

		workEffortSearchConstraintEClass = createEClass(WORK_EFFORT_SEARCH_CONSTRAINT);
		createEReference(workEffortSearchConstraintEClass, WORK_EFFORT_SEARCH_CONSTRAINT__WORK_EFFORT_SEARCH_RESULT_ID);
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
		createEReference(workEffortSearchResultEClass, WORK_EFFORT_SEARCH_RESULT__WORK_EFFORT_SEARCH_CONSTRAINTS);

		workEffortSkillStandardEClass = createEClass(WORK_EFFORT_SKILL_STANDARD);
		createEReference(workEffortSkillStandardEClass, WORK_EFFORT_SKILL_STANDARD__WORK_EFFORT_ID);
		createEReference(workEffortSkillStandardEClass, WORK_EFFORT_SKILL_STANDARD__SKILL_TYPE_ID);
		createEAttribute(workEffortSkillStandardEClass, WORK_EFFORT_SKILL_STANDARD__ESTIMATED_COST);
		createEAttribute(workEffortSkillStandardEClass, WORK_EFFORT_SKILL_STANDARD__ESTIMATED_DURATION);
		createEAttribute(workEffortSkillStandardEClass, WORK_EFFORT_SKILL_STANDARD__ESTIMATED_NUM_PEOPLE);

		workEffortStatusEClass = createEClass(WORK_EFFORT_STATUS);
		createEReference(workEffortStatusEClass, WORK_EFFORT_STATUS__WORK_EFFORT_ID);
		createEReference(workEffortStatusEClass, WORK_EFFORT_STATUS__STATUS_ID);
		createEAttribute(workEffortStatusEClass, WORK_EFFORT_STATUS__STATUS_DATETIME);
		createEAttribute(workEffortStatusEClass, WORK_EFFORT_STATUS__REASON);
		createEReference(workEffortStatusEClass, WORK_EFFORT_STATUS__SET_BY_USER_LOGIN);

		workEffortSurveyApplEClass = createEClass(WORK_EFFORT_SURVEY_APPL);
		createEReference(workEffortSurveyApplEClass, WORK_EFFORT_SURVEY_APPL__SURVEY_ID);
		createEReference(workEffortSurveyApplEClass, WORK_EFFORT_SURVEY_APPL__WORK_EFFORT_ID);
		createEAttribute(workEffortSurveyApplEClass, WORK_EFFORT_SURVEY_APPL__FROM_DATE);
		createEAttribute(workEffortSurveyApplEClass, WORK_EFFORT_SURVEY_APPL__THRU_DATE);

		workEffortTransBoxEClass = createEClass(WORK_EFFORT_TRANS_BOX);
		createEReference(workEffortTransBoxEClass, WORK_EFFORT_TRANS_BOX__PROCESS_WORK_EFFORT_ID);
		createEAttribute(workEffortTransBoxEClass, WORK_EFFORT_TRANS_BOX__TO_ACTIVITY_ID);
		createEAttribute(workEffortTransBoxEClass, WORK_EFFORT_TRANS_BOX__TRANSITION_ID);

		workEffortTypeEClass = createEClass(WORK_EFFORT_TYPE);
		createEAttribute(workEffortTypeEClass, WORK_EFFORT_TYPE__WORK_EFFORT_TYPE_ID);
		createEAttribute(workEffortTypeEClass, WORK_EFFORT_TYPE__DESCRIPTION);
		createEAttribute(workEffortTypeEClass, WORK_EFFORT_TYPE__HAS_TABLE);
		createEReference(workEffortTypeEClass, WORK_EFFORT_TYPE__PARENT_TYPE_ID);
		createEReference(workEffortTypeEClass, WORK_EFFORT_TYPE__WORK_EFFORT_TYPE_ATTRS);

		workEffortTypeAttrEClass = createEClass(WORK_EFFORT_TYPE_ATTR);
		createEReference(workEffortTypeAttrEClass, WORK_EFFORT_TYPE_ATTR__WORK_EFFORT_TYPE_ID);
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
		SchedulePackage theSchedulePackage = (SchedulePackage)EPackage.Registry.INSTANCE.getEPackage(SchedulePackage.eNS_URI);
		CommunicationPackage theCommunicationPackage = (CommunicationPackage)EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI);
		FixedassetPackage theFixedassetPackage = (FixedassetPackage)EPackage.Registry.INSTANCE.getEPackage(FixedassetPackage.eNS_URI);
		ReservationsPackage theReservationsPackage = (ReservationsPackage)EPackage.Registry.INSTANCE.getEPackage(ReservationsPackage.eNS_URI);
		StatusPackage theStatusPackage = (StatusPackage)EPackage.Registry.INSTANCE.getEPackage(StatusPackage.eNS_URI);
		MethodPackage theMethodPackage = (MethodPackage)EPackage.Registry.INSTANCE.getEPackage(MethodPackage.eNS_URI);
		FacilityPackage theFacilityPackage = (FacilityPackage)EPackage.Registry.INSTANCE.getEPackage(FacilityPackage.eNS_URI);
		UomPackage theUomPackage = (UomPackage)EPackage.Registry.INSTANCE.getEPackage(UomPackage.eNS_URI);
		NotePackage theNotePackage = (NotePackage)EPackage.Registry.INSTANCE.getEPackage(NotePackage.eNS_URI);
		EnumPackage theEnumPackage = (EnumPackage)EPackage.Registry.INSTANCE.getEPackage(EnumPackage.eNS_URI);
		InvoicePackage theInvoicePackage = (InvoicePackage)EPackage.Registry.INSTANCE.getEPackage(InvoicePackage.eNS_URI);
		org.abchip.mimo.biz.party.contact.ContactPackage theContactPackage_1 = (org.abchip.mimo.biz.party.contact.ContactPackage)EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.party.contact.ContactPackage.eNS_URI);
		ContentPackage theContentPackage = (ContentPackage)EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);
		CostPackage theCostPackage = (CostPackage)EPackage.Registry.INSTANCE.getEPackage(CostPackage.eNS_URI);
		PartyPackage thePartyPackage_1 = (PartyPackage)EPackage.Registry.INSTANCE.getEPackage(PartyPackage.eNS_URI);
		ProductPackage theProductPackage = (ProductPackage)EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI);
		InventoryPackage theInventoryPackage = (InventoryPackage)EPackage.Registry.INSTANCE.getEPackage(InventoryPackage.eNS_URI);
		LoginPackage theLoginPackage = (LoginPackage)EPackage.Registry.INSTANCE.getEPackage(LoginPackage.eNS_URI);
		AbilityPackage theAbilityPackage = (AbilityPackage)EPackage.Registry.INSTANCE.getEPackage(AbilityPackage.eNS_URI);
		SurveyPackage theSurveyPackage = (SurveyPackage)EPackage.Registry.INSTANCE.getEPackage(SurveyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		applicationSandboxEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		communicationEventWorkEffEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		deliverableEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		deliverableTypeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		EGenericType g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		EGenericType g2 = createEGenericType(this.getWorkEffortType());
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
		workEffortContentEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		workEffortContentTypeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
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
		initEReference(getApplicationSandbox_RuntimeDataId(), theSchedulePackage.getRuntimeData(), null, "runtimeDataId", null, 0, 1, ApplicationSandbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getApplicationSandbox_RuntimeDataId().getEKeys().add(theSchedulePackage.getRuntimeData_RuntimeDataId());
		initEAttribute(getApplicationSandbox_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 0, 1, ApplicationSandbox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationEventWorkEffEClass, CommunicationEventWorkEff.class, "CommunicationEventWorkEff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationEventWorkEff_WorkEffortId(), this.getWorkEffort(), null, "workEffortId", null, 1, 1, CommunicationEventWorkEff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCommunicationEventWorkEff_WorkEffortId().getEKeys().add(this.getWorkEffort_WorkEffortId());
		initEReference(getCommunicationEventWorkEff_CommunicationEventId(), theCommunicationPackage.getCommunicationEvent(), null, "communicationEventId", null, 1, 1, CommunicationEventWorkEff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCommunicationEventWorkEff_CommunicationEventId().getEKeys().add(theCommunicationPackage.getCommunicationEvent_CommunicationEventId());
		initEAttribute(getCommunicationEventWorkEff_Description(), ecorePackage.getEString(), "description", null, 0, 1, CommunicationEventWorkEff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deliverableEClass, Deliverable.class, "Deliverable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeliverable_DeliverableId(), ecorePackage.getEString(), "deliverableId", null, 1, 1, Deliverable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeliverable_DeliverableName(), ecorePackage.getEString(), "deliverableName", null, 0, 1, Deliverable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeliverable_DeliverableTypeId(), this.getDeliverableType(), null, "deliverableTypeId", null, 0, 1, Deliverable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getDeliverable_DeliverableTypeId().getEKeys().add(this.getDeliverableType_DeliverableTypeId());
		initEAttribute(getDeliverable_Description(), ecorePackage.getEString(), "description", null, 0, 1, Deliverable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deliverableTypeEClass, DeliverableType.class, "DeliverableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeliverableType_DeliverableTypeId(), ecorePackage.getEString(), "deliverableTypeId", null, 1, 1, DeliverableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeliverableType_Description(), ecorePackage.getEString(), "description", null, 0, 1, DeliverableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortEClass, WorkEffort.class, "WorkEffort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffort_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 1, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffort_AccommodationMapId(), theFixedassetPackage.getAccommodationMap(), null, "accommodationMapId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffort_AccommodationMapId().getEKeys().add(theFixedassetPackage.getAccommodationMap_AccommodationMapId());
		initEReference(getWorkEffort_AccommodationSpotId(), theReservationsPackage.getAccommodationSpot(), null, "accommodationSpotId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffort_AccommodationSpotId().getEKeys().add(theReservationsPackage.getAccommodationSpot_AccommodationSpotId());
		initEAttribute(getWorkEffort_ActualCompletionDate(), ecorePackage.getEDate(), "actualCompletionDate", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_ActualMilliSeconds(), ecorePackage.getEDouble(), "actualMilliSeconds", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_ActualSetupMillis(), ecorePackage.getEDouble(), "actualSetupMillis", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_ActualStartDate(), ecorePackage.getEDate(), "actualStartDate", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffort_CommunicationEventWorkEffs(), this.getCommunicationEventWorkEff(), null, "communicationEventWorkEffs", null, 0, -1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_CreatedByUserLogin(), ecorePackage.getEString(), "createdByUserLogin", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_CreatedDate(), ecorePackage.getEDate(), "createdDate", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffort_CurrentStatusId(), theStatusPackage.getStatusItem(), null, "currentStatusId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffort_CurrentStatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEAttribute(getWorkEffort_Description(), ecorePackage.getEString(), "description", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffort_EstimateCalcMethod(), theMethodPackage.getCustomMethod(), null, "estimateCalcMethod", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffort_EstimateCalcMethod().getEKeys().add(theMethodPackage.getCustomMethod_CustomMethodId());
		initEAttribute(getWorkEffort_EstimatedCompletionDate(), ecorePackage.getEDate(), "estimatedCompletionDate", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_EstimatedMilliSeconds(), ecorePackage.getEDouble(), "estimatedMilliSeconds", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_EstimatedSetupMillis(), ecorePackage.getEDouble(), "estimatedSetupMillis", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_EstimatedStartDate(), ecorePackage.getEDate(), "estimatedStartDate", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffort_FacilityId(), theFacilityPackage.getFacility(), null, "facilityId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffort_FacilityId().getEKeys().add(theFacilityPackage.getFacility_FacilityId());
		initEReference(getWorkEffort_FixedAssetId(), theFixedassetPackage.getFixedAsset(), null, "fixedAssetId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffort_FixedAssetId().getEKeys().add(theFixedassetPackage.getFixedAsset_FixedAssetId());
		initEAttribute(getWorkEffort_InfoUrl(), ecorePackage.getEString(), "infoUrl", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_LastModifiedByUserLogin(), ecorePackage.getEString(), "lastModifiedByUserLogin", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_LastModifiedDate(), ecorePackage.getEDate(), "lastModifiedDate", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_LastStatusUpdate(), ecorePackage.getEDate(), "lastStatusUpdate", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_LocationDesc(), ecorePackage.getEString(), "locationDesc", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffort_MoneyUomId(), theUomPackage.getUom(), null, "moneyUomId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffort_MoneyUomId().getEKeys().add(theUomPackage.getUom_UomId());
		initEReference(getWorkEffort_NoteId(), theNotePackage.getNoteData(), null, "noteId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffort_NoteId().getEKeys().add(theNotePackage.getNoteData_NoteId());
		initEAttribute(getWorkEffort_PercentComplete(), ecorePackage.getELong(), "percentComplete", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_Priority(), ecorePackage.getELong(), "priority", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_QuantityProduced(), ecorePackage.getEBigDecimal(), "quantityProduced", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_QuantityRejected(), ecorePackage.getEBigDecimal(), "quantityRejected", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_QuantityToProduce(), ecorePackage.getEBigDecimal(), "quantityToProduce", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffort_RecurrenceInfoId(), theSchedulePackage.getRecurrenceInfo(), null, "recurrenceInfoId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffort_RecurrenceInfoId().getEKeys().add(theSchedulePackage.getRecurrenceInfo_RecurrenceInfoId());
		initEAttribute(getWorkEffort_Reserv2ndPPPerc(), ecorePackage.getEBigDecimal(), "reserv2ndPPPerc", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_ReservNthPPPerc(), ecorePackage.getEBigDecimal(), "reservNthPPPerc", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_ReservPersons(), ecorePackage.getEBigDecimal(), "reservPersons", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_RevisionNumber(), ecorePackage.getELong(), "revisionNumber", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffort_RuntimeDataId(), theSchedulePackage.getRuntimeData(), null, "runtimeDataId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffort_RuntimeDataId().getEKeys().add(theSchedulePackage.getRuntimeData_RuntimeDataId());
		initEReference(getWorkEffort_ScopeEnumId(), theEnumPackage.getEnumeration(), null, "scopeEnumId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffort_ScopeEnumId().getEKeys().add(theEnumPackage.getEnumeration_EnumId());
		initEAttribute(getWorkEffort_SendNotificationEmail(), ecorePackage.getEBoolean(), "sendNotificationEmail", null, 1, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_ServiceLoaderName(), ecorePackage.getEString(), "serviceLoaderName", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_ShowAsEnumId(), ecorePackage.getEString(), "showAsEnumId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_SourceReferenceId(), ecorePackage.getEString(), "sourceReferenceId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_SpecialTerms(), ecorePackage.getEString(), "specialTerms", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffort_TempExprId(), theSchedulePackage.getTemporalExpression(), null, "tempExprId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffort_TempExprId().getEKeys().add(theSchedulePackage.getTemporalExpression_TempExprId());
		initEAttribute(getWorkEffort_TimeTransparency(), ecorePackage.getELong(), "timeTransparency", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_TotalMilliSecondsAllowed(), ecorePackage.getEDouble(), "totalMilliSecondsAllowed", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_TotalMoneyAllowed(), ecorePackage.getEBigDecimal(), "totalMoneyAllowed", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_UniversalId(), ecorePackage.getEString(), "universalId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffort_WorkEffortAttributes(), this.getWorkEffortAttribute(), null, "workEffortAttributes", null, 0, -1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffort_WorkEffortDeliverableProds(), this.getWorkEffortDeliverableProd(), null, "workEffortDeliverableProds", null, 0, -1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffort_WorkEffortEventReminders(), this.getWorkEffortEventReminder(), null, "workEffortEventReminders", null, 0, -1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffort_WorkEffortFixedAssetStds(), this.getWorkEffortFixedAssetStd(), null, "workEffortFixedAssetStds", null, 0, -1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffort_WorkEffortInventoryAssigns(), this.getWorkEffortInventoryAssign(), null, "workEffortInventoryAssigns", null, 0, -1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffort_WorkEffortInventoryProduceds(), this.getWorkEffortInventoryProduced(), null, "workEffortInventoryProduceds", null, 0, -1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffort_WorkEffortKeywords(), this.getWorkEffortKeyword(), null, "workEffortKeywords", null, 0, -1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffort_WorkEffortName(), ecorePackage.getEString(), "workEffortName", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffort_WorkEffortNotes(), this.getWorkEffortNote(), null, "workEffortNotes", null, 0, -1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffort_WorkEffortParentId(), this.getWorkEffort(), null, "workEffortParentId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffort_WorkEffortParentId().getEKeys().add(this.getWorkEffort_WorkEffortId());
		initEReference(getWorkEffort_WorkEffortPurposeTypeId(), this.getWorkEffortPurposeType(), null, "workEffortPurposeTypeId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffort_WorkEffortPurposeTypeId().getEKeys().add(this.getWorkEffortPurposeType_WorkEffortPurposeTypeId());
		initEReference(getWorkEffort_WorkEffortSkillStandards(), this.getWorkEffortSkillStandard(), null, "workEffortSkillStandards", null, 0, -1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffort_WorkEffortTypeId(), this.getWorkEffortType(), null, "workEffortTypeId", null, 0, 1, WorkEffort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffort_WorkEffortTypeId().getEKeys().add(this.getWorkEffortType_WorkEffortTypeId());

		initEClass(workEffortAssocEClass, WorkEffortAssoc.class, "WorkEffortAssoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkEffortAssoc_WorkEffortAssocTypeId(), this.getWorkEffortAssocType(), null, "workEffortAssocTypeId", null, 1, 1, WorkEffortAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortAssoc_WorkEffortAssocTypeId().getEKeys().add(this.getWorkEffortAssocType_WorkEffortAssocTypeId());
		initEReference(getWorkEffortAssoc_WorkEffortIdFrom(), this.getWorkEffort(), null, "workEffortIdFrom", null, 1, 1, WorkEffortAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortAssoc_WorkEffortIdFrom().getEKeys().add(this.getWorkEffort_WorkEffortId());
		initEReference(getWorkEffortAssoc_WorkEffortIdTo(), this.getWorkEffort(), null, "workEffortIdTo", null, 1, 1, WorkEffortAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortAssoc_WorkEffortIdTo().getEKeys().add(this.getWorkEffort_WorkEffortId());
		initEAttribute(getWorkEffortAssoc_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, WorkEffortAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAssoc_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, WorkEffortAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAssoc_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, WorkEffortAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortAssocAttributeEClass, WorkEffortAssocAttribute.class, "WorkEffortAssocAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortAssocAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, WorkEffortAssocAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAssocAttribute_WorkEffortAssocTypeId(), ecorePackage.getEString(), "workEffortAssocTypeId", null, 1, 1, WorkEffortAssocAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAssocAttribute_WorkEffortIdFrom(), ecorePackage.getEString(), "workEffortIdFrom", null, 1, 1, WorkEffortAssocAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAssocAttribute_WorkEffortIdTo(), ecorePackage.getEString(), "workEffortIdTo", null, 1, 1, WorkEffortAssocAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAssocAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, WorkEffortAssocAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAssocAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, WorkEffortAssocAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAssocAttribute_FromDate(), ecorePackage.getEDate(), "fromDate", null, 0, 1, WorkEffortAssocAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortAssocTypeEClass, WorkEffortAssocType.class, "WorkEffortAssocType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortAssocType_WorkEffortAssocTypeId(), ecorePackage.getEString(), "workEffortAssocTypeId", null, 1, 1, WorkEffortAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAssocType_Description(), ecorePackage.getEString(), "description", null, 0, 1, WorkEffortAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAssocType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, WorkEffortAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffortAssocType_ParentTypeId(), this.getWorkEffortAssocType(), null, "parentTypeId", null, 0, 1, WorkEffortAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortAssocType_ParentTypeId().getEKeys().add(this.getWorkEffortAssocType_WorkEffortAssocTypeId());
		initEReference(getWorkEffortAssocType_WorkEffortAssocTypeAttrs(), this.getWorkEffortAssocTypeAttr(), null, "workEffortAssocTypeAttrs", null, 0, -1, WorkEffortAssocType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(workEffortAssocTypeAttrEClass, WorkEffortAssocTypeAttr.class, "WorkEffortAssocTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkEffortAssocTypeAttr_WorkEffortAssocTypeId(), this.getWorkEffortAssocType(), null, "workEffortAssocTypeId", null, 1, 1, WorkEffortAssocTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortAssocTypeAttr_WorkEffortAssocTypeId().getEKeys().add(this.getWorkEffortAssocType_WorkEffortAssocTypeId());
		initEAttribute(getWorkEffortAssocTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, WorkEffortAssocTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAssocTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, WorkEffortAssocTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortAttributeEClass, WorkEffortAttribute.class, "WorkEffortAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkEffortAttribute_WorkEffortId(), this.getWorkEffort(), null, "workEffortId", null, 1, 1, WorkEffortAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortAttribute_WorkEffortId().getEKeys().add(this.getWorkEffort_WorkEffortId());
		initEAttribute(getWorkEffortAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, WorkEffortAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, WorkEffortAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, WorkEffortAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortBillingEClass, WorkEffortBilling.class, "WorkEffortBilling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkEffortBilling_WorkEffortId(), this.getWorkEffort(), null, "workEffortId", null, 1, 1, WorkEffortBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortBilling_WorkEffortId().getEKeys().add(this.getWorkEffort_WorkEffortId());
		initEReference(getWorkEffortBilling_InvoiceId(), theInvoicePackage.getInvoice(), null, "invoiceId", null, 1, 1, WorkEffortBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortBilling_InvoiceId().getEKeys().add(theInvoicePackage.getInvoice_InvoiceId());
		initEAttribute(getWorkEffortBilling_InvoiceItemSeqId(), ecorePackage.getEString(), "invoiceItemSeqId", null, 1, 1, WorkEffortBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortBilling_Percentage(), ecorePackage.getEDouble(), "percentage", null, 0, 1, WorkEffortBilling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortContactMechEClass, WorkEffortContactMech.class, "WorkEffortContactMech", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkEffortContactMech_WorkEffortId(), this.getWorkEffort(), null, "workEffortId", null, 1, 1, WorkEffortContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortContactMech_WorkEffortId().getEKeys().add(this.getWorkEffort_WorkEffortId());
		initEReference(getWorkEffortContactMech_ContactMechId(), theContactPackage_1.getContactMech(), null, "contactMechId", null, 1, 1, WorkEffortContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortContactMech_ContactMechId().getEKeys().add(theContactPackage_1.getContactMech_ContactMechId());
		initEAttribute(getWorkEffortContactMech_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, WorkEffortContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortContactMech_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, WorkEffortContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortContactMech_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, WorkEffortContactMech.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortContentEClass, WorkEffortContent.class, "WorkEffortContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkEffortContent_WorkEffortId(), this.getWorkEffort(), null, "workEffortId", null, 1, 1, WorkEffortContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortContent_WorkEffortId().getEKeys().add(this.getWorkEffort_WorkEffortId());
		initEReference(getWorkEffortContent_ContentId(), theContentPackage.getContent(), null, "contentId", null, 1, 1, WorkEffortContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortContent_ContentId().getEKeys().add(theContentPackage.getContent_ContentId());
		initEReference(getWorkEffortContent_WorkEffortContentTypeId(), this.getWorkEffortContentType(), null, "workEffortContentTypeId", null, 1, 1, WorkEffortContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortContent_WorkEffortContentTypeId().getEKeys().add(this.getWorkEffortContentType_WorkEffortContentTypeId());
		initEAttribute(getWorkEffortContent_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, WorkEffortContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortContent_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, WorkEffortContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortContentTypeEClass, WorkEffortContentType.class, "WorkEffortContentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortContentType_WorkEffortContentTypeId(), ecorePackage.getEString(), "workEffortContentTypeId", null, 1, 1, WorkEffortContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortContentType_Description(), ecorePackage.getEString(), "description", null, 0, 1, WorkEffortContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffortContentType_ParentTypeId(), this.getWorkEffortContentType(), null, "parentTypeId", null, 0, 1, WorkEffortContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortContentType_ParentTypeId().getEKeys().add(this.getWorkEffortContentType_WorkEffortContentTypeId());

		initEClass(workEffortCostCalcEClass, WorkEffortCostCalc.class, "WorkEffortCostCalc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkEffortCostCalc_WorkEffortId(), this.getWorkEffort(), null, "workEffortId", null, 1, 1, WorkEffortCostCalc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortCostCalc_WorkEffortId().getEKeys().add(this.getWorkEffort_WorkEffortId());
		initEReference(getWorkEffortCostCalc_CostComponentTypeId(), theCostPackage.getCostComponentType(), null, "costComponentTypeId", null, 1, 1, WorkEffortCostCalc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortCostCalc_CostComponentTypeId().getEKeys().add(theCostPackage.getCostComponentType_CostComponentTypeId());
		initEAttribute(getWorkEffortCostCalc_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, WorkEffortCostCalc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffortCostCalc_CostComponentCalcId(), theCostPackage.getCostComponentCalc(), null, "costComponentCalcId", null, 0, 1, WorkEffortCostCalc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortCostCalc_CostComponentCalcId().getEKeys().add(theCostPackage.getCostComponentCalc_CostComponentCalcId());
		initEAttribute(getWorkEffortCostCalc_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, WorkEffortCostCalc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortDeliverableProdEClass, WorkEffortDeliverableProd.class, "WorkEffortDeliverableProd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkEffortDeliverableProd_WorkEffortId(), this.getWorkEffort(), null, "workEffortId", null, 1, 1, WorkEffortDeliverableProd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortDeliverableProd_WorkEffortId().getEKeys().add(this.getWorkEffort_WorkEffortId());
		initEReference(getWorkEffortDeliverableProd_DeliverableId(), this.getDeliverable(), null, "deliverableId", null, 1, 1, WorkEffortDeliverableProd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortDeliverableProd_DeliverableId().getEKeys().add(this.getDeliverable_DeliverableId());

		initEClass(workEffortEventReminderEClass, WorkEffortEventReminder.class, "WorkEffortEventReminder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkEffortEventReminder_WorkEffortId(), this.getWorkEffort(), null, "workEffortId", null, 1, 1, WorkEffortEventReminder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortEventReminder_WorkEffortId().getEKeys().add(this.getWorkEffort_WorkEffortId());
		initEAttribute(getWorkEffortEventReminder_SequenceId(), ecorePackage.getEString(), "sequenceId", null, 1, 1, WorkEffortEventReminder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffortEventReminder_ContactMechId(), theContactPackage_1.getContactMech(), null, "contactMechId", null, 0, 1, WorkEffortEventReminder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortEventReminder_ContactMechId().getEKeys().add(theContactPackage_1.getContactMech_ContactMechId());
		initEAttribute(getWorkEffortEventReminder_CurrentCount(), ecorePackage.getELong(), "currentCount", null, 0, 1, WorkEffortEventReminder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortEventReminder_LocaleId(), ecorePackage.getEString(), "localeId", null, 0, 1, WorkEffortEventReminder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffortEventReminder_PartyId(), thePartyPackage_1.getParty(), null, "partyId", null, 0, 1, WorkEffortEventReminder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortEventReminder_PartyId().getEKeys().add(thePartyPackage_1.getParty_PartyId());
		initEAttribute(getWorkEffortEventReminder_ReminderDateTime(), ecorePackage.getEDate(), "reminderDateTime", null, 0, 1, WorkEffortEventReminder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortEventReminder_ReminderOffset(), ecorePackage.getELong(), "reminderOffset", null, 0, 1, WorkEffortEventReminder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortEventReminder_RepeatCount(), ecorePackage.getELong(), "repeatCount", null, 0, 1, WorkEffortEventReminder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortEventReminder_RepeatInterval(), ecorePackage.getELong(), "repeatInterval", null, 0, 1, WorkEffortEventReminder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortEventReminder_TimeZoneId(), ecorePackage.getEString(), "timeZoneId", null, 0, 1, WorkEffortEventReminder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortFixedAssetAssignEClass, WorkEffortFixedAssetAssign.class, "WorkEffortFixedAssetAssign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkEffortFixedAssetAssign_WorkEffortId(), this.getWorkEffort(), null, "workEffortId", null, 1, 1, WorkEffortFixedAssetAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortFixedAssetAssign_WorkEffortId().getEKeys().add(this.getWorkEffort_WorkEffortId());
		initEReference(getWorkEffortFixedAssetAssign_FixedAssetId(), theFixedassetPackage.getFixedAsset(), null, "fixedAssetId", null, 1, 1, WorkEffortFixedAssetAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortFixedAssetAssign_FixedAssetId().getEKeys().add(theFixedassetPackage.getFixedAsset_FixedAssetId());
		initEAttribute(getWorkEffortFixedAssetAssign_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, WorkEffortFixedAssetAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortFixedAssetAssign_AllocatedCost(), ecorePackage.getEBigDecimal(), "allocatedCost", null, 0, 1, WorkEffortFixedAssetAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffortFixedAssetAssign_AvailabilityStatusId(), theStatusPackage.getStatusItem(), null, "availabilityStatusId", null, 0, 1, WorkEffortFixedAssetAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortFixedAssetAssign_AvailabilityStatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEAttribute(getWorkEffortFixedAssetAssign_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, WorkEffortFixedAssetAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffortFixedAssetAssign_StatusId(), theStatusPackage.getStatusItem(), null, "statusId", null, 0, 1, WorkEffortFixedAssetAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortFixedAssetAssign_StatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEAttribute(getWorkEffortFixedAssetAssign_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, WorkEffortFixedAssetAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortFixedAssetStdEClass, WorkEffortFixedAssetStd.class, "WorkEffortFixedAssetStd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkEffortFixedAssetStd_WorkEffortId(), this.getWorkEffort(), null, "workEffortId", null, 1, 1, WorkEffortFixedAssetStd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortFixedAssetStd_WorkEffortId().getEKeys().add(this.getWorkEffort_WorkEffortId());
		initEReference(getWorkEffortFixedAssetStd_FixedAssetTypeId(), theFixedassetPackage.getFixedAssetType(), null, "fixedAssetTypeId", null, 1, 1, WorkEffortFixedAssetStd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortFixedAssetStd_FixedAssetTypeId().getEKeys().add(theFixedassetPackage.getFixedAssetType_FixedAssetTypeId());
		initEAttribute(getWorkEffortFixedAssetStd_EstimatedCost(), ecorePackage.getEBigDecimal(), "estimatedCost", null, 0, 1, WorkEffortFixedAssetStd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortFixedAssetStd_EstimatedDuration(), ecorePackage.getEDouble(), "estimatedDuration", null, 0, 1, WorkEffortFixedAssetStd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortFixedAssetStd_EstimatedQuantity(), ecorePackage.getEDouble(), "estimatedQuantity", null, 0, 1, WorkEffortFixedAssetStd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortGoodStandardEClass, WorkEffortGoodStandard.class, "WorkEffortGoodStandard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkEffortGoodStandard_WorkEffortId(), this.getWorkEffort(), null, "workEffortId", null, 1, 1, WorkEffortGoodStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortGoodStandard_WorkEffortId().getEKeys().add(this.getWorkEffort_WorkEffortId());
		initEReference(getWorkEffortGoodStandard_WorkEffortGoodStdTypeId(), this.getWorkEffortGoodStandardType(), null, "workEffortGoodStdTypeId", null, 1, 1, WorkEffortGoodStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortGoodStandard_WorkEffortGoodStdTypeId().getEKeys().add(this.getWorkEffortGoodStandardType_WorkEffortGoodStdTypeId());
		initEReference(getWorkEffortGoodStandard_ProductId(), theProductPackage.getProduct(), null, "productId", null, 1, 1, WorkEffortGoodStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortGoodStandard_ProductId().getEKeys().add(theProductPackage.getProduct_ProductId());
		initEAttribute(getWorkEffortGoodStandard_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, WorkEffortGoodStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortGoodStandard_EstimatedCost(), ecorePackage.getEBigDecimal(), "estimatedCost", null, 0, 1, WorkEffortGoodStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortGoodStandard_EstimatedQuantity(), ecorePackage.getEDouble(), "estimatedQuantity", null, 0, 1, WorkEffortGoodStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffortGoodStandard_StatusId(), theStatusPackage.getStatusItem(), null, "statusId", null, 0, 1, WorkEffortGoodStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortGoodStandard_StatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEAttribute(getWorkEffortGoodStandard_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, WorkEffortGoodStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortGoodStandardTypeEClass, WorkEffortGoodStandardType.class, "WorkEffortGoodStandardType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortGoodStandardType_WorkEffortGoodStdTypeId(), ecorePackage.getEString(), "workEffortGoodStdTypeId", null, 1, 1, WorkEffortGoodStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortGoodStandardType_Description(), ecorePackage.getEString(), "description", null, 0, 1, WorkEffortGoodStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortGoodStandardType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, WorkEffortGoodStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffortGoodStandardType_ParentTypeId(), this.getWorkEffortGoodStandardType(), null, "parentTypeId", null, 0, 1, WorkEffortGoodStandardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortGoodStandardType_ParentTypeId().getEKeys().add(this.getWorkEffortGoodStandardType_WorkEffortGoodStdTypeId());

		initEClass(workEffortIcalDataEClass, WorkEffortIcalData.class, "WorkEffortIcalData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortIcalData_WorkEffortId(), ecorePackage.getEString(), "workEffortId", null, 1, 1, WorkEffortIcalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortIcalData_IcalData(), ecorePackage.getEString(), "icalData", null, 0, 1, WorkEffortIcalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortInventoryAssignEClass, WorkEffortInventoryAssign.class, "WorkEffortInventoryAssign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkEffortInventoryAssign_WorkEffortId(), this.getWorkEffort(), null, "workEffortId", null, 1, 1, WorkEffortInventoryAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortInventoryAssign_WorkEffortId().getEKeys().add(this.getWorkEffort_WorkEffortId());
		initEReference(getWorkEffortInventoryAssign_InventoryItemId(), theInventoryPackage.getInventoryItem(), null, "inventoryItemId", null, 1, 1, WorkEffortInventoryAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortInventoryAssign_InventoryItemId().getEKeys().add(theInventoryPackage.getInventoryItem_InventoryItemId());
		initEAttribute(getWorkEffortInventoryAssign_Quantity(), ecorePackage.getEDouble(), "quantity", null, 0, 1, WorkEffortInventoryAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffortInventoryAssign_StatusId(), theStatusPackage.getStatusItem(), null, "statusId", null, 0, 1, WorkEffortInventoryAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortInventoryAssign_StatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());

		initEClass(workEffortInventoryProducedEClass, WorkEffortInventoryProduced.class, "WorkEffortInventoryProduced", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkEffortInventoryProduced_WorkEffortId(), this.getWorkEffort(), null, "workEffortId", null, 1, 1, WorkEffortInventoryProduced.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortInventoryProduced_WorkEffortId().getEKeys().add(this.getWorkEffort_WorkEffortId());
		initEReference(getWorkEffortInventoryProduced_InventoryItemId(), theInventoryPackage.getInventoryItem(), null, "inventoryItemId", null, 1, 1, WorkEffortInventoryProduced.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortInventoryProduced_InventoryItemId().getEKeys().add(theInventoryPackage.getInventoryItem_InventoryItemId());

		initEClass(workEffortKeywordEClass, WorkEffortKeyword.class, "WorkEffortKeyword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkEffortKeyword_WorkEffortId(), this.getWorkEffort(), null, "workEffortId", null, 1, 1, WorkEffortKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortKeyword_WorkEffortId().getEKeys().add(this.getWorkEffort_WorkEffortId());
		initEAttribute(getWorkEffortKeyword_Keyword(), ecorePackage.getEString(), "keyword", null, 1, 1, WorkEffortKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortKeyword_RelevancyWeight(), ecorePackage.getELong(), "relevancyWeight", null, 0, 1, WorkEffortKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortNoteEClass, WorkEffortNote.class, "WorkEffortNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkEffortNote_WorkEffortId(), this.getWorkEffort(), null, "workEffortId", null, 1, 1, WorkEffortNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortNote_WorkEffortId().getEKeys().add(this.getWorkEffort_WorkEffortId());
		initEAttribute(getWorkEffortNote_InternalNote(), ecorePackage.getEBoolean(), "internalNote", null, 1, 1, WorkEffortNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortPartyAssignmentEClass, WorkEffortPartyAssignment.class, "WorkEffortPartyAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkEffortPartyAssignment_WorkEffortId(), this.getWorkEffort(), null, "workEffortId", null, 1, 1, WorkEffortPartyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortPartyAssignment_WorkEffortId().getEKeys().add(this.getWorkEffort_WorkEffortId());
		initEReference(getWorkEffortPartyAssignment_PartyId(), thePartyPackage_1.getParty(), null, "partyId", null, 1, 1, WorkEffortPartyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortPartyAssignment_PartyId().getEKeys().add(thePartyPackage_1.getParty_PartyId());
		initEReference(getWorkEffortPartyAssignment_RoleTypeId(), thePartyPackage_1.getRoleType(), null, "roleTypeId", null, 1, 1, WorkEffortPartyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortPartyAssignment_RoleTypeId().getEKeys().add(thePartyPackage_1.getRoleType_RoleTypeId());
		initEAttribute(getWorkEffortPartyAssignment_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, WorkEffortPartyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffortPartyAssignment_AssignedByUserLoginId(), theLoginPackage.getUserLogin(), null, "assignedByUserLoginId", null, 0, 1, WorkEffortPartyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortPartyAssignment_AssignedByUserLoginId().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());
		initEReference(getWorkEffortPartyAssignment_AvailabilityStatusId(), theStatusPackage.getStatusItem(), null, "availabilityStatusId", null, 0, 1, WorkEffortPartyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortPartyAssignment_AvailabilityStatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEAttribute(getWorkEffortPartyAssignment_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, WorkEffortPartyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffortPartyAssignment_DelegateReasonEnumId(), theEnumPackage.getEnumeration(), null, "delegateReasonEnumId", null, 0, 1, WorkEffortPartyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortPartyAssignment_DelegateReasonEnumId().getEKeys().add(theEnumPackage.getEnumeration_EnumId());
		initEReference(getWorkEffortPartyAssignment_ExpectationEnumId(), theEnumPackage.getEnumeration(), null, "expectationEnumId", null, 0, 1, WorkEffortPartyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortPartyAssignment_ExpectationEnumId().getEKeys().add(theEnumPackage.getEnumeration_EnumId());
		initEReference(getWorkEffortPartyAssignment_FacilityId(), theFacilityPackage.getFacility(), null, "facilityId", null, 0, 1, WorkEffortPartyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortPartyAssignment_FacilityId().getEKeys().add(theFacilityPackage.getFacility_FacilityId());
		initEAttribute(getWorkEffortPartyAssignment_MustRsvp(), ecorePackage.getEBoolean(), "mustRsvp", null, 0, 1, WorkEffortPartyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortPartyAssignment_StatusDateTime(), ecorePackage.getEDate(), "statusDateTime", null, 0, 1, WorkEffortPartyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffortPartyAssignment_StatusId(), theStatusPackage.getStatusItem(), null, "statusId", null, 0, 1, WorkEffortPartyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortPartyAssignment_StatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEAttribute(getWorkEffortPartyAssignment_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, WorkEffortPartyAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortPurposeTypeEClass, WorkEffortPurposeType.class, "WorkEffortPurposeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortPurposeType_WorkEffortPurposeTypeId(), ecorePackage.getEString(), "workEffortPurposeTypeId", null, 1, 1, WorkEffortPurposeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortPurposeType_Description(), ecorePackage.getEString(), "description", null, 0, 1, WorkEffortPurposeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffortPurposeType_ParentTypeId(), this.getWorkEffortPurposeType(), null, "parentTypeId", null, 0, 1, WorkEffortPurposeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortPurposeType_ParentTypeId().getEKeys().add(this.getWorkEffortPurposeType_WorkEffortPurposeTypeId());

		initEClass(workEffortReviewEClass, WorkEffortReview.class, "WorkEffortReview", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkEffortReview_WorkEffortId(), this.getWorkEffort(), null, "workEffortId", null, 1, 1, WorkEffortReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortReview_WorkEffortId().getEKeys().add(this.getWorkEffort_WorkEffortId());
		initEReference(getWorkEffortReview_UserLoginId(), theLoginPackage.getUserLogin(), null, "userLoginId", null, 1, 1, WorkEffortReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortReview_UserLoginId().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());
		initEAttribute(getWorkEffortReview_ReviewDate(), ecorePackage.getEDate(), "reviewDate", null, 1, 1, WorkEffortReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortReview_PostedAnonymous(), ecorePackage.getEBoolean(), "postedAnonymous", null, 1, 1, WorkEffortReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortReview_Rating(), ecorePackage.getEDouble(), "rating", null, 0, 1, WorkEffortReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortReview_ReviewText(), ecorePackage.getEString(), "reviewText", null, 0, 1, WorkEffortReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffortReview_StatusId(), theStatusPackage.getStatusItem(), null, "statusId", null, 0, 1, WorkEffortReview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortReview_StatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());

		initEClass(workEffortSearchConstraintEClass, WorkEffortSearchConstraint.class, "WorkEffortSearchConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkEffortSearchConstraint_WorkEffortSearchResultId(), this.getWorkEffortSearchResult(), null, "workEffortSearchResultId", null, 1, 1, WorkEffortSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortSearchConstraint_WorkEffortSearchResultId().getEKeys().add(this.getWorkEffortSearchResult_WorkEffortSearchResultId());
		initEAttribute(getWorkEffortSearchConstraint_ConstraintSeqId(), ecorePackage.getEString(), "constraintSeqId", null, 1, 1, WorkEffortSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSearchConstraint_AnyPrefix(), ecorePackage.getEString(), "anyPrefix", null, 0, 1, WorkEffortSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSearchConstraint_AnySuffix(), ecorePackage.getEString(), "anySuffix", null, 0, 1, WorkEffortSearchConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEReference(getWorkEffortSearchResult_WorkEffortSearchConstraints(), this.getWorkEffortSearchConstraint(), null, "workEffortSearchConstraints", null, 0, -1, WorkEffortSearchResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(workEffortSkillStandardEClass, WorkEffortSkillStandard.class, "WorkEffortSkillStandard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkEffortSkillStandard_WorkEffortId(), this.getWorkEffort(), null, "workEffortId", null, 1, 1, WorkEffortSkillStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortSkillStandard_WorkEffortId().getEKeys().add(this.getWorkEffort_WorkEffortId());
		initEReference(getWorkEffortSkillStandard_SkillTypeId(), theAbilityPackage.getSkillType(), null, "skillTypeId", null, 1, 1, WorkEffortSkillStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortSkillStandard_SkillTypeId().getEKeys().add(theAbilityPackage.getSkillType_SkillTypeId());
		initEAttribute(getWorkEffortSkillStandard_EstimatedCost(), ecorePackage.getEBigDecimal(), "estimatedCost", null, 0, 1, WorkEffortSkillStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSkillStandard_EstimatedDuration(), ecorePackage.getEDouble(), "estimatedDuration", null, 0, 1, WorkEffortSkillStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSkillStandard_EstimatedNumPeople(), ecorePackage.getEDouble(), "estimatedNumPeople", null, 0, 1, WorkEffortSkillStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortStatusEClass, WorkEffortStatus.class, "WorkEffortStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkEffortStatus_WorkEffortId(), this.getWorkEffort(), null, "workEffortId", null, 1, 1, WorkEffortStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortStatus_WorkEffortId().getEKeys().add(this.getWorkEffort_WorkEffortId());
		initEReference(getWorkEffortStatus_StatusId(), theStatusPackage.getStatusItem(), null, "statusId", null, 1, 1, WorkEffortStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortStatus_StatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEAttribute(getWorkEffortStatus_StatusDatetime(), ecorePackage.getEDate(), "statusDatetime", null, 1, 1, WorkEffortStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortStatus_Reason(), ecorePackage.getEString(), "reason", null, 0, 1, WorkEffortStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffortStatus_SetByUserLogin(), theLoginPackage.getUserLogin(), null, "setByUserLogin", null, 0, 1, WorkEffortStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortStatus_SetByUserLogin().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());

		initEClass(workEffortSurveyApplEClass, WorkEffortSurveyAppl.class, "WorkEffortSurveyAppl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkEffortSurveyAppl_SurveyId(), theSurveyPackage.getSurvey(), null, "surveyId", null, 1, 1, WorkEffortSurveyAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortSurveyAppl_SurveyId().getEKeys().add(theSurveyPackage.getSurvey_SurveyId());
		initEReference(getWorkEffortSurveyAppl_WorkEffortId(), this.getWorkEffort(), null, "workEffortId", null, 1, 1, WorkEffortSurveyAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortSurveyAppl_WorkEffortId().getEKeys().add(this.getWorkEffort_WorkEffortId());
		initEAttribute(getWorkEffortSurveyAppl_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, WorkEffortSurveyAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortSurveyAppl_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, WorkEffortSurveyAppl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortTransBoxEClass, WorkEffortTransBox.class, "WorkEffortTransBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkEffortTransBox_ProcessWorkEffortId(), this.getWorkEffort(), null, "processWorkEffortId", null, 1, 1, WorkEffortTransBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortTransBox_ProcessWorkEffortId().getEKeys().add(this.getWorkEffort_WorkEffortId());
		initEAttribute(getWorkEffortTransBox_ToActivityId(), ecorePackage.getEString(), "toActivityId", null, 1, 1, WorkEffortTransBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortTransBox_TransitionId(), ecorePackage.getEString(), "transitionId", null, 1, 1, WorkEffortTransBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workEffortTypeEClass, WorkEffortType.class, "WorkEffortType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkEffortType_WorkEffortTypeId(), ecorePackage.getEString(), "workEffortTypeId", null, 1, 1, WorkEffortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortType_Description(), ecorePackage.getEString(), "description", null, 0, 1, WorkEffortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, WorkEffortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkEffortType_ParentTypeId(), this.getWorkEffortType(), null, "parentTypeId", null, 0, 1, WorkEffortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortType_ParentTypeId().getEKeys().add(this.getWorkEffortType_WorkEffortTypeId());
		initEReference(getWorkEffortType_WorkEffortTypeAttrs(), this.getWorkEffortTypeAttr(), null, "workEffortTypeAttrs", null, 0, -1, WorkEffortType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(workEffortTypeAttrEClass, WorkEffortTypeAttr.class, "WorkEffortTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkEffortTypeAttr_WorkEffortTypeId(), this.getWorkEffortType(), null, "workEffortTypeId", null, 1, 1, WorkEffortTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWorkEffortTypeAttr_WorkEffortTypeId().getEKeys().add(this.getWorkEffortType_WorkEffortTypeId());
		initEAttribute(getWorkEffortTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, WorkEffortTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkEffortTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, WorkEffortTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// mimo-ent-frame
		createMimoentframeAnnotations();
		// mimo-ent-format
		createMimoentformatAnnotations();
		// mimo-ent-slot
		createMimoentslotAnnotations();
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
		  (getApplicationSandbox_ApplicationId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getApplicationSandbox_PartyId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getApplicationSandbox_RoleTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getApplicationSandbox_WorkEffortId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getCommunicationEventWorkEff_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getDeliverable_DeliverableId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getDeliverable_DeliverableName(),
		   source,
		   new String[] {
			   "type", "name",
			   "length", "100"
		   });
		addAnnotation
		  (getDeliverable_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getDeliverableType_DeliverableTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getDeliverableType_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getWorkEffort_WorkEffortId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getWorkEffort_CreatedByUserLogin(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getWorkEffort_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getWorkEffort_InfoUrl(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getWorkEffort_LastModifiedByUserLogin(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getWorkEffort_LocationDesc(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getWorkEffort_PercentComplete(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getWorkEffort_Priority(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getWorkEffort_QuantityProduced(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getWorkEffort_QuantityRejected(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getWorkEffort_QuantityToProduce(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getWorkEffort_Reserv2ndPPPerc(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getWorkEffort_ReservNthPPPerc(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getWorkEffort_ReservPersons(),
		   source,
		   new String[] {
			   "type", "fixed-point",
			   "precision", "18",
			   "scale", "6"
		   });
		addAnnotation
		  (getWorkEffort_RevisionNumber(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getWorkEffort_ServiceLoaderName(),
		   source,
		   new String[] {
			   "type", "name",
			   "length", "100"
		   });
		addAnnotation
		  (getWorkEffort_ShowAsEnumId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getWorkEffort_SourceReferenceId(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getWorkEffort_SpecialTerms(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getWorkEffort_TimeTransparency(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getWorkEffort_TotalMoneyAllowed(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getWorkEffort_UniversalId(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getWorkEffort_WorkEffortName(),
		   source,
		   new String[] {
			   "type", "name",
			   "length", "100"
		   });
		addAnnotation
		  (getWorkEffortAssoc_SequenceNum(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getWorkEffortAssocAttribute_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getWorkEffortAssocAttribute_WorkEffortAssocTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getWorkEffortAssocAttribute_WorkEffortIdFrom(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getWorkEffortAssocAttribute_WorkEffortIdTo(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getWorkEffortAssocAttribute_AttrDescription(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getWorkEffortAssocAttribute_AttrValue(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getWorkEffortAssocType_WorkEffortAssocTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getWorkEffortAssocType_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getWorkEffortAssocTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getWorkEffortAssocTypeAttr_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getWorkEffortAttribute_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getWorkEffortAttribute_AttrDescription(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getWorkEffortAttribute_AttrValue(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getWorkEffortBilling_InvoiceItemSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getWorkEffortContactMech_Comments(),
		   source,
		   new String[] {
			   "type", "comment",
			   "length", "255"
		   });
		addAnnotation
		  (getWorkEffortContentType_WorkEffortContentTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getWorkEffortContentType_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getWorkEffortEventReminder_SequenceId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getWorkEffortEventReminder_CurrentCount(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getWorkEffortEventReminder_LocaleId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getWorkEffortEventReminder_ReminderOffset(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getWorkEffortEventReminder_RepeatCount(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getWorkEffortEventReminder_RepeatInterval(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getWorkEffortEventReminder_TimeZoneId(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getWorkEffortFixedAssetAssign_AllocatedCost(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getWorkEffortFixedAssetAssign_Comments(),
		   source,
		   new String[] {
			   "type", "comment",
			   "length", "255"
		   });
		addAnnotation
		  (getWorkEffortFixedAssetStd_EstimatedCost(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getWorkEffortGoodStandard_EstimatedCost(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getWorkEffortGoodStandardType_WorkEffortGoodStdTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getWorkEffortGoodStandardType_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getWorkEffortIcalData_WorkEffortId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getWorkEffortKeyword_Keyword(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getWorkEffortKeyword_RelevancyWeight(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getWorkEffortPartyAssignment_Comments(),
		   source,
		   new String[] {
			   "type", "comment",
			   "length", "255"
		   });
		addAnnotation
		  (getWorkEffortPurposeType_WorkEffortPurposeTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getWorkEffortPurposeType_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getWorkEffortSearchConstraint_ConstraintSeqId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getWorkEffortSearchConstraint_ConstraintName(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getWorkEffortSearchConstraint_HighValue(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getWorkEffortSearchConstraint_InfoString(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getWorkEffortSearchConstraint_LowValue(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getWorkEffortSearchResult_WorkEffortSearchResultId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getWorkEffortSearchResult_NumResults(),
		   source,
		   new String[] {
			   "precision", "20",
			   "scale", "0"
		   });
		addAnnotation
		  (getWorkEffortSearchResult_OrderByName(),
		   source,
		   new String[] {
			   "length", "255"
		   });
		addAnnotation
		  (getWorkEffortSearchResult_VisitId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getWorkEffortSkillStandard_EstimatedCost(),
		   source,
		   new String[] {
			   "type", "currency-amount",
			   "precision", "18",
			   "scale", "2"
		   });
		addAnnotation
		  (getWorkEffortStatus_Reason(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getWorkEffortTransBox_ToActivityId(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getWorkEffortTransBox_TransitionId(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getWorkEffortType_WorkEffortTypeId(),
		   source,
		   new String[] {
			   "length", "20"
		   });
		addAnnotation
		  (getWorkEffortType_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
		   });
		addAnnotation
		  (getWorkEffortTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "length", "60"
		   });
		addAnnotation
		  (getWorkEffortTypeAttr_Description(),
		   source,
		   new String[] {
			   "type", "description",
			   "length", "255"
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
		  (getWorkEffort_FixedAssetId(),
		   source,
		   new String[] {
			   "help", "Deprecated - use the WorkEffortFixedAssetAssign entity instead"
		   });
		addAnnotation
		  (getWorkEffort_RecurrenceInfoId(),
		   source,
		   new String[] {
			   "help", "Deprecated - use the tempExprId field instead"
		   });
		addAnnotation
		  (getWorkEffort_Reserv2ndPPPerc(),
		   source,
		   new String[] {
			   "help", "reservationSecondPersonPricePercentage: percentage of the end price for the 2nd person renting this asset connected to the workEffort"
		   });
		addAnnotation
		  (getWorkEffort_ReservNthPPPerc(),
		   source,
		   new String[] {
			   "help", "reservationNthPersonPricePercentage: percentage of the end price for the Nth (2+) person renting this asset connected to the workEffort"
		   });
		addAnnotation
		  (getWorkEffort_ReservPersons(),
		   source,
		   new String[] {
			   "help", "the number of persons renting the attached asset"
		   });
		addAnnotation
		  (getWorkEffort_TimeTransparency(),
		   source,
		   new String[] {
			   "help", "Deprecated - use the availabilityStatusId field in the assignment entities instead"
		   });
		addAnnotation
		  (getWorkEffort_WorkEffortParentId(),
		   source,
		   new String[] {
			   "help", "The primary parent (or the like); it should be one of the parent WorkEfforts already setup in WorkEffortAssoc"
		   });
		addAnnotation
		  (getWorkEffortAssoc_WorkEffortAssocTypeId(),
		   source,
		   new String[] {
			   "key", "true"
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
		  (getWorkEffortAssoc_FromDate(),
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
		  (getWorkEffortAssocAttribute_WorkEffortAssocTypeId(),
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
		  (getWorkEffortEventReminder_PartyId(),
		   source,
		   new String[] {
			   "help", "The party this reminder is assigned to"
		   });
		addAnnotation
		  (getWorkEffortEventReminder_ReminderOffset(),
		   source,
		   new String[] {
			   "help", "The millisecond offset from the event to activate a reminder"
		   });
		addAnnotation
		  (getWorkEffortEventReminder_RepeatInterval(),
		   source,
		   new String[] {
			   "help", "The millisecond interval between reminder repeats"
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
		  (getWorkEffortFixedAssetAssign_AvailabilityStatusId(),
		   source,
		   new String[] {
			   "help", "Points to StatusItem value with statusTypeId=\"WEFA_AVAILABILITY\""
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
		  (getWorkEffortGoodStandard_WorkEffortGoodStdTypeId(),
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
		  (getWorkEffortGoodStandard_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWorkEffortIcalData_IcalData(),
		   source,
		   new String[] {
			   "help", "iCalender Data"
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
		  (getWorkEffortPartyAssignment_AvailabilityStatusId(),
		   source,
		   new String[] {
			   "help", "Points to StatusItem value with statusTypeId=\"WEPA_AVAILABILITY\""
		   });
		addAnnotation
		  (getWorkEffortPartyAssignment_DelegateReasonEnumId(),
		   source,
		   new String[] {
			   "help", "Point to Enumeration value with enumTypeId=\"WORK_EFF_DEL_REAS\""
		   });
		addAnnotation
		  (getWorkEffortPartyAssignment_ExpectationEnumId(),
		   source,
		   new String[] {
			   "help", "Point to Enumeration value with enumTypeId=\"WORK_EFF_EXPECT\""
		   });
		addAnnotation
		  (getWorkEffortPartyAssignment_StatusId(),
		   source,
		   new String[] {
			   "help", "Point to StatusItem value with statusTypeId=\"PRTYASGN_STATUS\""
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
		  (getWorkEffortSurveyAppl_SurveyId(),
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
	 * Initializes the annotations for <b>mimo-ent-frame</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMimoentframeAnnotations() {
		String source = "mimo-ent-frame";
		addAnnotation
		  (applicationSandboxEClass,
		   source,
		   new String[] {
			   "title", "WorkEffort Application Sandbox"
		   });
		addAnnotation
		  (communicationEventWorkEffEClass,
		   source,
		   new String[] {
			   "title", "Communication Event Work Effort",
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
		  (workEffortAssocEClass,
		   source,
		   new String[] {
			   "title", "Work Effort Association"
		   });
		addAnnotation
		  (workEffortAssocAttributeEClass,
		   source,
		   new String[] {
			   "title", "Work Effort Association Attribute"
		   });
		addAnnotation
		  (workEffortAssocTypeEClass,
		   source,
		   new String[] {
			   "title", "Work Effort Association Type",
			   "dictionary", "WorkEffortEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (workEffortAssocTypeAttrEClass,
		   source,
		   new String[] {
			   "title", "Work Effort Association Type Attribute",
			   "dictionary", "WorkEffortEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (workEffortContactMechEClass,
		   source,
		   new String[] {
			   "title", "WorkEffort Contact Mechanism"
		   });
		addAnnotation
		  (workEffortContentTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (workEffortCostCalcEClass,
		   source,
		   new String[] {
			   "title", "Work Effort Cost Calculation"
		   });
		addAnnotation
		  (workEffortDeliverableProdEClass,
		   source,
		   new String[] {
			   "title", "Work Effort Deliverable Produced"
		   });
		addAnnotation
		  (workEffortFixedAssetAssignEClass,
		   source,
		   new String[] {
			   "title", "Work Effort Fixed Asset Assignment"
		   });
		addAnnotation
		  (workEffortFixedAssetStdEClass,
		   source,
		   new String[] {
			   "title", "Work Effort Fixed Asset Standard"
		   });
		addAnnotation
		  (workEffortGoodStandardTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (workEffortIcalDataEClass,
		   source,
		   new String[] {
			   "title", "Work Effort iCalendar Data"
		   });
		addAnnotation
		  (workEffortInventoryAssignEClass,
		   source,
		   new String[] {
			   "title", "Work Effort Inventory Assignment"
		   });
		addAnnotation
		  (workEffortPurposeTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "WorkEffortEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (workEffortSearchConstraintEClass,
		   source,
		   new String[] {
			   "title", "WorkEffort Search Result Constraint"
		   });
		addAnnotation
		  (workEffortTransBoxEClass,
		   source,
		   new String[] {
			   "title", "Work Effort Transition Box"
		   });
		addAnnotation
		  (workEffortTypeEClass,
		   source,
		   new String[] {
			   "dictionary", "WorkEffortEntityLabels",
			   "formula", "description"
		   });
		addAnnotation
		  (workEffortTypeAttrEClass,
		   source,
		   new String[] {
			   "title", "Work Effort Type Attribute",
			   "formula", "description"
		   });
	}

} //WorkeffortPackageImpl
