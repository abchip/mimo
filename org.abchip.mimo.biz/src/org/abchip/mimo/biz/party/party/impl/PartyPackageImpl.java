/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party.impl;

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
import org.abchip.mimo.biz.party.contact.ContactPackage;
import org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl;
import org.abchip.mimo.biz.party.need.NeedPackage;
import org.abchip.mimo.biz.party.need.impl.NeedPackageImpl;
import org.abchip.mimo.biz.party.party.AddressMatchMap;
import org.abchip.mimo.biz.party.party.Affiliate;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.PartyAttribute;
import org.abchip.mimo.biz.party.party.PartyCarrierAccount;
import org.abchip.mimo.biz.party.party.PartyClassification;
import org.abchip.mimo.biz.party.party.PartyClassificationGroup;
import org.abchip.mimo.biz.party.party.PartyClassificationType;
import org.abchip.mimo.biz.party.party.PartyContent;
import org.abchip.mimo.biz.party.party.PartyContentType;
import org.abchip.mimo.biz.party.party.PartyDataSource;
import org.abchip.mimo.biz.party.party.PartyFactory;
import org.abchip.mimo.biz.party.party.PartyGeoPoint;
import org.abchip.mimo.biz.party.party.PartyGroup;
import org.abchip.mimo.biz.party.party.PartyIcsAvsOverride;
import org.abchip.mimo.biz.party.party.PartyIdentification;
import org.abchip.mimo.biz.party.party.PartyIdentificationType;
import org.abchip.mimo.biz.party.party.PartyInvitation;
import org.abchip.mimo.biz.party.party.PartyInvitationGroupAssoc;
import org.abchip.mimo.biz.party.party.PartyInvitationRoleAssoc;
import org.abchip.mimo.biz.party.party.PartyNameHistory;
import org.abchip.mimo.biz.party.party.PartyNote;
import org.abchip.mimo.biz.party.party.PartyPackage;
import org.abchip.mimo.biz.party.party.PartyProfileDefault;
import org.abchip.mimo.biz.party.party.PartyRelationship;
import org.abchip.mimo.biz.party.party.PartyRelationshipType;
import org.abchip.mimo.biz.party.party.PartyRole;
import org.abchip.mimo.biz.party.party.PartyStatus;
import org.abchip.mimo.biz.party.party.PartyType;
import org.abchip.mimo.biz.party.party.PartyTypeAttr;
import org.abchip.mimo.biz.party.party.Person;
import org.abchip.mimo.biz.party.party.PriorityType;
import org.abchip.mimo.biz.party.party.RoleType;
import org.abchip.mimo.biz.party.party.RoleTypeAttr;
import org.abchip.mimo.biz.party.party.Vendor;
import org.abchip.mimo.biz.party.party.WebSiteRole;
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

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PartyPackageImpl extends EPackageImpl implements PartyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressMatchMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass affiliateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyCarrierAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyClassificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyClassificationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyClassificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyContentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyDataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyGeoPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyIcsAvsOverrideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyIdentificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyIdentificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyInvitationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyInvitationGroupAssocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyInvitationRoleAssocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyNameHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyProfileDefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyRelationshipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partyTypeAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priorityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleTypeAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vendorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webSiteRoleEClass = null;

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
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PartyPackageImpl() {
		super(eNS_URI, PartyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PartyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PartyPackage init() {
		if (isInited) return (PartyPackage)EPackage.Registry.INSTANCE.getEPackage(PartyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPartyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PartyPackageImpl thePartyPackage = registeredPartyPackage instanceof PartyPackageImpl ? (PartyPackageImpl)registeredPartyPackage : new PartyPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BomPackage.eNS_URI);
		BomPackageImpl theBomPackage = (BomPackageImpl)(registeredPackage instanceof BomPackageImpl ? registeredPackage : BomPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MrpPackage.eNS_URI);
		MrpPackageImpl theMrpPackage = (MrpPackageImpl)(registeredPackage instanceof MrpPackageImpl ? registeredPackage : MrpPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TechdataPackage.eNS_URI);
		TechdataPackageImpl theTechdataPackage = (TechdataPackageImpl)(registeredPackage instanceof TechdataPackageImpl ? registeredPackage : TechdataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CampaignPackage.eNS_URI);
		CampaignPackageImpl theCampaignPackage = (CampaignPackageImpl)(registeredPackage instanceof CampaignPackageImpl ? registeredPackage : CampaignPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.marketing.contact.ContactPackage.eNS_URI);
		org.abchip.mimo.biz.marketing.contact.impl.ContactPackageImpl theContactPackage = (org.abchip.mimo.biz.marketing.contact.impl.ContactPackageImpl)(registeredPackage instanceof org.abchip.mimo.biz.marketing.contact.impl.ContactPackageImpl ? registeredPackage : org.abchip.mimo.biz.marketing.contact.ContactPackage.eINSTANCE);
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContactPackage.eNS_URI);
		ContactPackageImpl theContactPackage_1 = (ContactPackageImpl)(registeredPackage instanceof ContactPackageImpl ? registeredPackage : ContactPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NeedPackage.eNS_URI);
		NeedPackageImpl theNeedPackage = (NeedPackageImpl)(registeredPackage instanceof NeedPackageImpl ? registeredPackage : NeedPackage.eINSTANCE);
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
		thePartyPackage.createPackageContents();
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
		thePartyPackage.initializePackageContents();
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
		thePartyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PartyPackage.eNS_URI, thePartyPackage);
		return thePartyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddressMatchMap() {
		return addressMatchMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressMatchMap_MapKey() {
		return (EAttribute)addressMatchMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressMatchMap_MapValue() {
		return (EAttribute)addressMatchMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressMatchMap_SequenceNum() {
		return (EAttribute)addressMatchMapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAffiliate() {
		return affiliateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffiliate_PartyId() {
		return (EAttribute)affiliateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffiliate_AffiliateDescription() {
		return (EAttribute)affiliateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffiliate_AffiliateName() {
		return (EAttribute)affiliateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffiliate_DateTimeApproved() {
		return (EAttribute)affiliateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffiliate_DateTimeCreated() {
		return (EAttribute)affiliateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffiliate_SitePageViews() {
		return (EAttribute)affiliateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffiliate_SiteType() {
		return (EAttribute)affiliateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffiliate_SiteVisitors() {
		return (EAttribute)affiliateEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffiliate_YearEstablished() {
		return (EAttribute)affiliateEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParty() {
		return partyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_PartyId() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_CreatedByUserLogin() {
		return (EReference)partyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_CreatedDate() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_DataSourceId() {
		return (EReference)partyEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_Description() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_ExternalId() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_IsUnread() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_LastModifiedByUserLogin() {
		return (EReference)partyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_LastModifiedDate() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_PartyTypeId() {
		return (EReference)partyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_PreferredCurrencyUomId() {
		return (EReference)partyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParty_StatusId() {
		return (EReference)partyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_PartyAttributes() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_PartyIdentifications() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_PartyNameHistories() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_PartyNotes() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_PartyProfileDefaults() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_PartyRoles() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_PartySkills() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParty_SupplierProductFeatures() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyAttribute() {
		return partyAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAttribute_PartyId() {
		return (EAttribute)partyAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAttribute_AttrName() {
		return (EAttribute)partyAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAttribute_AttrDescription() {
		return (EAttribute)partyAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyAttribute_AttrValue() {
		return (EAttribute)partyAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyCarrierAccount() {
		return partyCarrierAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyCarrierAccount_PartyId() {
		return (EAttribute)partyCarrierAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyCarrierAccount_CarrierPartyId() {
		return (EReference)partyCarrierAccountEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyCarrierAccount_FromDate() {
		return (EAttribute)partyCarrierAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyCarrierAccount_AccountNumber() {
		return (EAttribute)partyCarrierAccountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyCarrierAccount_ThruDate() {
		return (EAttribute)partyCarrierAccountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyClassification() {
		return partyClassificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyClassification_PartyId() {
		return (EAttribute)partyClassificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyClassification_PartyClassificationGroupId() {
		return (EReference)partyClassificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyClassification_FromDate() {
		return (EAttribute)partyClassificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyClassification_ThruDate() {
		return (EAttribute)partyClassificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyClassificationGroup() {
		return partyClassificationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyClassificationGroup_PartyClassificationGroupId() {
		return (EAttribute)partyClassificationGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyClassificationGroup_Description() {
		return (EAttribute)partyClassificationGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyClassificationGroup_ParentGroupId() {
		return (EReference)partyClassificationGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyClassificationGroup_PartyClassificationTypeId() {
		return (EReference)partyClassificationGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyClassificationType() {
		return partyClassificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyClassificationType_PartyClassificationTypeId() {
		return (EAttribute)partyClassificationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyClassificationType_Description() {
		return (EAttribute)partyClassificationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyClassificationType_HasTable() {
		return (EAttribute)partyClassificationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyClassificationType_ParentTypeId() {
		return (EReference)partyClassificationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyContent() {
		return partyContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyContent_PartyId() {
		return (EAttribute)partyContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyContent_ContentId() {
		return (EReference)partyContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyContent_PartyContentTypeId() {
		return (EReference)partyContentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyContent_FromDate() {
		return (EAttribute)partyContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyContent_ThruDate() {
		return (EAttribute)partyContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyContentType() {
		return partyContentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyContentType_PartyContentTypeId() {
		return (EAttribute)partyContentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyContentType_Description() {
		return (EAttribute)partyContentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyContentType_ParentTypeId() {
		return (EReference)partyContentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyDataSource() {
		return partyDataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyDataSource_PartyId() {
		return (EAttribute)partyDataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyDataSource_DataSourceId() {
		return (EReference)partyDataSourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyDataSource_FromDate() {
		return (EAttribute)partyDataSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyDataSource_Comments() {
		return (EAttribute)partyDataSourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyDataSource_IsCreate() {
		return (EAttribute)partyDataSourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyDataSource_VisitId() {
		return (EAttribute)partyDataSourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyGeoPoint() {
		return partyGeoPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyGeoPoint_PartyId() {
		return (EAttribute)partyGeoPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyGeoPoint_GeoPointId() {
		return (EReference)partyGeoPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyGeoPoint_FromDate() {
		return (EAttribute)partyGeoPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyGeoPoint_ThruDate() {
		return (EAttribute)partyGeoPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyGroup() {
		return partyGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyGroup_AnnualRevenue() {
		return (EAttribute)partyGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyGroup_Comments() {
		return (EAttribute)partyGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyGroup_GroupName() {
		return (EAttribute)partyGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyGroup_GroupNameLocal() {
		return (EAttribute)partyGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyGroup_LogoImageUrl() {
		return (EAttribute)partyGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyGroup_NumEmployees() {
		return (EAttribute)partyGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyGroup_OfficeSiteName() {
		return (EAttribute)partyGroupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyGroup_TickerSymbol() {
		return (EAttribute)partyGroupEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyIcsAvsOverride() {
		return partyIcsAvsOverrideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyIcsAvsOverride_PartyId() {
		return (EAttribute)partyIcsAvsOverrideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyIcsAvsOverride_AvsDeclineString() {
		return (EAttribute)partyIcsAvsOverrideEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyIdentification() {
		return partyIdentificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyIdentification_PartyId() {
		return (EAttribute)partyIdentificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyIdentification_PartyIdentificationTypeId() {
		return (EReference)partyIdentificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyIdentification_IdValue() {
		return (EAttribute)partyIdentificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyIdentificationType() {
		return partyIdentificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyIdentificationType_PartyIdentificationTypeId() {
		return (EAttribute)partyIdentificationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyIdentificationType_Description() {
		return (EAttribute)partyIdentificationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyIdentificationType_HasTable() {
		return (EAttribute)partyIdentificationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyIdentificationType_ParentTypeId() {
		return (EReference)partyIdentificationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyInvitation() {
		return partyInvitationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyInvitation_PartyInvitationId() {
		return (EAttribute)partyInvitationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyInvitation_EmailAddress() {
		return (EAttribute)partyInvitationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyInvitation_LastInviteDate() {
		return (EAttribute)partyInvitationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyInvitation_PartyId() {
		return (EAttribute)partyInvitationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyInvitation_PartyIdFrom() {
		return (EReference)partyInvitationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyInvitation_StatusId() {
		return (EReference)partyInvitationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyInvitation_ToName() {
		return (EAttribute)partyInvitationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyInvitation_PartyInvitationGroupAssocs() {
		return (EAttribute)partyInvitationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyInvitation_PartyInvitationRoleAssocs() {
		return (EAttribute)partyInvitationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyInvitationGroupAssoc() {
		return partyInvitationGroupAssocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyInvitationGroupAssoc_PartyInvitationId() {
		return (EAttribute)partyInvitationGroupAssocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyInvitationGroupAssoc_PartyIdTo() {
		return (EReference)partyInvitationGroupAssocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyInvitationRoleAssoc() {
		return partyInvitationRoleAssocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyInvitationRoleAssoc_PartyInvitationId() {
		return (EAttribute)partyInvitationRoleAssocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyInvitationRoleAssoc_RoleTypeId() {
		return (EReference)partyInvitationRoleAssocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyNameHistory() {
		return partyNameHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyNameHistory_PartyId() {
		return (EAttribute)partyNameHistoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyNameHistory_ChangeDate() {
		return (EAttribute)partyNameHistoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyNameHistory_FirstName() {
		return (EAttribute)partyNameHistoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyNameHistory_GroupName() {
		return (EAttribute)partyNameHistoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyNameHistory_LastName() {
		return (EAttribute)partyNameHistoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyNameHistory_MiddleName() {
		return (EAttribute)partyNameHistoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyNameHistory_PersonalTitle() {
		return (EAttribute)partyNameHistoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyNameHistory_Suffix() {
		return (EAttribute)partyNameHistoryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyNote() {
		return partyNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyNote_PartyId() {
		return (EAttribute)partyNoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyProfileDefault() {
		return partyProfileDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyProfileDefault_PartyId() {
		return (EAttribute)partyProfileDefaultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyProfileDefault_ProductStoreId() {
		return (EReference)partyProfileDefaultEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyProfileDefault_DefaultBillAddr() {
		return (EAttribute)partyProfileDefaultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyProfileDefault_DefaultPayMeth() {
		return (EAttribute)partyProfileDefaultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyProfileDefault_DefaultShipAddr() {
		return (EAttribute)partyProfileDefaultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyProfileDefault_DefaultShipMeth() {
		return (EAttribute)partyProfileDefaultEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyRelationship() {
		return partyRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyRelationship_PartyIdFrom() {
		return (EAttribute)partyRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyRelationship_PartyIdTo() {
		return (EReference)partyRelationshipEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyRelationship_RoleTypeIdFrom() {
		return (EReference)partyRelationshipEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyRelationship_RoleTypeIdTo() {
		return (EReference)partyRelationshipEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyRelationship_FromDate() {
		return (EAttribute)partyRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyRelationship_Comments() {
		return (EAttribute)partyRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyRelationship_PartyRelationshipTypeId() {
		return (EReference)partyRelationshipEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyRelationship_PermissionsEnumId() {
		return (EAttribute)partyRelationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyRelationship_PositionTitle() {
		return (EAttribute)partyRelationshipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyRelationship_PriorityTypeId() {
		return (EReference)partyRelationshipEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyRelationship_RelationshipName() {
		return (EAttribute)partyRelationshipEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyRelationship_SecurityGroupId() {
		return (EReference)partyRelationshipEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyRelationship_StatusId() {
		return (EReference)partyRelationshipEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyRelationship_ThruDate() {
		return (EAttribute)partyRelationshipEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyRelationshipType() {
		return partyRelationshipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyRelationshipType_PartyRelationshipTypeId() {
		return (EAttribute)partyRelationshipTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyRelationshipType_Description() {
		return (EAttribute)partyRelationshipTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyRelationshipType_HasTable() {
		return (EAttribute)partyRelationshipTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyRelationshipType_ParentTypeId() {
		return (EReference)partyRelationshipTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyRelationshipType_PartyRelationshipName() {
		return (EAttribute)partyRelationshipTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyRelationshipType_RoleTypeIdValidFrom() {
		return (EReference)partyRelationshipTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyRelationshipType_RoleTypeIdValidTo() {
		return (EReference)partyRelationshipTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyRole() {
		return partyRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyRole_PartyId() {
		return (EAttribute)partyRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyRole_RoleTypeId() {
		return (EReference)partyRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyStatus() {
		return partyStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyStatus_StatusId() {
		return (EAttribute)partyStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyStatus_PartyId() {
		return (EReference)partyStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyStatus_StatusDate() {
		return (EAttribute)partyStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyStatus_ChangeByUserLoginId() {
		return (EReference)partyStatusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyType() {
		return partyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyType_PartyTypeId() {
		return (EAttribute)partyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyType_Description() {
		return (EAttribute)partyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyType_HasTable() {
		return (EAttribute)partyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPartyType_ParentTypeId() {
		return (EReference)partyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyType_PartyTypeAttrs() {
		return (EAttribute)partyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartyTypeAttr() {
		return partyTypeAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyTypeAttr_PartyTypeId() {
		return (EAttribute)partyTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyTypeAttr_AttrName() {
		return (EAttribute)partyTypeAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPartyTypeAttr_Description() {
		return (EAttribute)partyTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_BirthDate() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_CardId() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Comments() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_DeceasedDate() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_EmploymentStatusEnumId() {
		return (EReference)personEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_ExistingCustomer() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_FirstName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_FirstNameLocal() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Gender() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Height() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_LastName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_LastNameLocal() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_MaritalStatus() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_MemberId() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_MiddleName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_MiddleNameLocal() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_MonthsWithEmployer() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_MothersMaidenName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Nickname() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Occupation() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_OtherLocal() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_PassportExpireDate() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_PassportNumber() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_PersonalTitle() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerson_ResidenceStatusEnumId() {
		return (EReference)personEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Salutation() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_SocialSecurityNumber() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Suffix() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_TotalYearsWorkExperience() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Weight() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_YearsWithEmployer() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPriorityType() {
		return priorityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPriorityType_PriorityTypeId() {
		return (EAttribute)priorityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPriorityType_Description() {
		return (EAttribute)priorityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoleType() {
		return roleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleType_RoleTypeId() {
		return (EAttribute)roleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleType_Description() {
		return (EAttribute)roleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleType_HasTable() {
		return (EAttribute)roleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoleType_ParentTypeId() {
		return (EReference)roleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleType_RoleTypeAttrs() {
		return (EAttribute)roleTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleType_ValidContactMechRoles() {
		return (EAttribute)roleTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoleTypeAttr() {
		return roleTypeAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleTypeAttr_RoleTypeId() {
		return (EAttribute)roleTypeAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleTypeAttr_AttrName() {
		return (EAttribute)roleTypeAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleTypeAttr_Description() {
		return (EAttribute)roleTypeAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVendor() {
		return vendorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVendor_PartyId() {
		return (EAttribute)vendorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVendor_ManifestCompanyName() {
		return (EAttribute)vendorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVendor_ManifestCompanyTitle() {
		return (EAttribute)vendorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVendor_ManifestLogoUrl() {
		return (EAttribute)vendorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVendor_ManifestPolicies() {
		return (EAttribute)vendorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWebSiteRole() {
		return webSiteRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSiteRole_PartyId() {
		return (EAttribute)webSiteRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWebSiteRole_RoleTypeId() {
		return (EReference)webSiteRoleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWebSiteRole_WebSiteId() {
		return (EReference)webSiteRoleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSiteRole_FromDate() {
		return (EAttribute)webSiteRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSiteRole_SequenceNum() {
		return (EAttribute)webSiteRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWebSiteRole_ThruDate() {
		return (EAttribute)webSiteRoleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyFactory getPartyFactory() {
		return (PartyFactory)getEFactoryInstance();
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
		addressMatchMapEClass = createEClass(ADDRESS_MATCH_MAP);
		createEAttribute(addressMatchMapEClass, ADDRESS_MATCH_MAP__MAP_KEY);
		createEAttribute(addressMatchMapEClass, ADDRESS_MATCH_MAP__MAP_VALUE);
		createEAttribute(addressMatchMapEClass, ADDRESS_MATCH_MAP__SEQUENCE_NUM);

		affiliateEClass = createEClass(AFFILIATE);
		createEAttribute(affiliateEClass, AFFILIATE__PARTY_ID);
		createEAttribute(affiliateEClass, AFFILIATE__AFFILIATE_DESCRIPTION);
		createEAttribute(affiliateEClass, AFFILIATE__AFFILIATE_NAME);
		createEAttribute(affiliateEClass, AFFILIATE__DATE_TIME_APPROVED);
		createEAttribute(affiliateEClass, AFFILIATE__DATE_TIME_CREATED);
		createEAttribute(affiliateEClass, AFFILIATE__SITE_PAGE_VIEWS);
		createEAttribute(affiliateEClass, AFFILIATE__SITE_TYPE);
		createEAttribute(affiliateEClass, AFFILIATE__SITE_VISITORS);
		createEAttribute(affiliateEClass, AFFILIATE__YEAR_ESTABLISHED);

		partyEClass = createEClass(PARTY);
		createEAttribute(partyEClass, PARTY__PARTY_ID);
		createEAttribute(partyEClass, PARTY__CREATED_DATE);
		createEAttribute(partyEClass, PARTY__DESCRIPTION);
		createEAttribute(partyEClass, PARTY__EXTERNAL_ID);
		createEAttribute(partyEClass, PARTY__IS_UNREAD);
		createEAttribute(partyEClass, PARTY__LAST_MODIFIED_DATE);
		createEReference(partyEClass, PARTY__PARTY_TYPE_ID);
		createEReference(partyEClass, PARTY__CREATED_BY_USER_LOGIN);
		createEReference(partyEClass, PARTY__LAST_MODIFIED_BY_USER_LOGIN);
		createEReference(partyEClass, PARTY__PREFERRED_CURRENCY_UOM_ID);
		createEReference(partyEClass, PARTY__STATUS_ID);
		createEReference(partyEClass, PARTY__DATA_SOURCE_ID);
		createEAttribute(partyEClass, PARTY__PARTY_ATTRIBUTES);
		createEAttribute(partyEClass, PARTY__PARTY_IDENTIFICATIONS);
		createEAttribute(partyEClass, PARTY__PARTY_NAME_HISTORIES);
		createEAttribute(partyEClass, PARTY__PARTY_NOTES);
		createEAttribute(partyEClass, PARTY__PARTY_PROFILE_DEFAULTS);
		createEAttribute(partyEClass, PARTY__PARTY_ROLES);
		createEAttribute(partyEClass, PARTY__PARTY_SKILLS);
		createEAttribute(partyEClass, PARTY__SUPPLIER_PRODUCT_FEATURES);

		partyAttributeEClass = createEClass(PARTY_ATTRIBUTE);
		createEAttribute(partyAttributeEClass, PARTY_ATTRIBUTE__PARTY_ID);
		createEAttribute(partyAttributeEClass, PARTY_ATTRIBUTE__ATTR_NAME);
		createEAttribute(partyAttributeEClass, PARTY_ATTRIBUTE__ATTR_DESCRIPTION);
		createEAttribute(partyAttributeEClass, PARTY_ATTRIBUTE__ATTR_VALUE);

		partyCarrierAccountEClass = createEClass(PARTY_CARRIER_ACCOUNT);
		createEAttribute(partyCarrierAccountEClass, PARTY_CARRIER_ACCOUNT__PARTY_ID);
		createEAttribute(partyCarrierAccountEClass, PARTY_CARRIER_ACCOUNT__FROM_DATE);
		createEAttribute(partyCarrierAccountEClass, PARTY_CARRIER_ACCOUNT__ACCOUNT_NUMBER);
		createEAttribute(partyCarrierAccountEClass, PARTY_CARRIER_ACCOUNT__THRU_DATE);
		createEReference(partyCarrierAccountEClass, PARTY_CARRIER_ACCOUNT__CARRIER_PARTY_ID);

		partyClassificationEClass = createEClass(PARTY_CLASSIFICATION);
		createEAttribute(partyClassificationEClass, PARTY_CLASSIFICATION__PARTY_ID);
		createEAttribute(partyClassificationEClass, PARTY_CLASSIFICATION__FROM_DATE);
		createEAttribute(partyClassificationEClass, PARTY_CLASSIFICATION__THRU_DATE);
		createEReference(partyClassificationEClass, PARTY_CLASSIFICATION__PARTY_CLASSIFICATION_GROUP_ID);

		partyClassificationGroupEClass = createEClass(PARTY_CLASSIFICATION_GROUP);
		createEAttribute(partyClassificationGroupEClass, PARTY_CLASSIFICATION_GROUP__PARTY_CLASSIFICATION_GROUP_ID);
		createEAttribute(partyClassificationGroupEClass, PARTY_CLASSIFICATION_GROUP__DESCRIPTION);
		createEReference(partyClassificationGroupEClass, PARTY_CLASSIFICATION_GROUP__PARENT_GROUP_ID);
		createEReference(partyClassificationGroupEClass, PARTY_CLASSIFICATION_GROUP__PARTY_CLASSIFICATION_TYPE_ID);

		partyClassificationTypeEClass = createEClass(PARTY_CLASSIFICATION_TYPE);
		createEAttribute(partyClassificationTypeEClass, PARTY_CLASSIFICATION_TYPE__PARTY_CLASSIFICATION_TYPE_ID);
		createEAttribute(partyClassificationTypeEClass, PARTY_CLASSIFICATION_TYPE__DESCRIPTION);
		createEAttribute(partyClassificationTypeEClass, PARTY_CLASSIFICATION_TYPE__HAS_TABLE);
		createEReference(partyClassificationTypeEClass, PARTY_CLASSIFICATION_TYPE__PARENT_TYPE_ID);

		partyContentEClass = createEClass(PARTY_CONTENT);
		createEAttribute(partyContentEClass, PARTY_CONTENT__PARTY_ID);
		createEAttribute(partyContentEClass, PARTY_CONTENT__FROM_DATE);
		createEAttribute(partyContentEClass, PARTY_CONTENT__THRU_DATE);
		createEReference(partyContentEClass, PARTY_CONTENT__CONTENT_ID);
		createEReference(partyContentEClass, PARTY_CONTENT__PARTY_CONTENT_TYPE_ID);

		partyContentTypeEClass = createEClass(PARTY_CONTENT_TYPE);
		createEAttribute(partyContentTypeEClass, PARTY_CONTENT_TYPE__PARTY_CONTENT_TYPE_ID);
		createEAttribute(partyContentTypeEClass, PARTY_CONTENT_TYPE__DESCRIPTION);
		createEReference(partyContentTypeEClass, PARTY_CONTENT_TYPE__PARENT_TYPE_ID);

		partyDataSourceEClass = createEClass(PARTY_DATA_SOURCE);
		createEAttribute(partyDataSourceEClass, PARTY_DATA_SOURCE__PARTY_ID);
		createEAttribute(partyDataSourceEClass, PARTY_DATA_SOURCE__FROM_DATE);
		createEAttribute(partyDataSourceEClass, PARTY_DATA_SOURCE__COMMENTS);
		createEAttribute(partyDataSourceEClass, PARTY_DATA_SOURCE__IS_CREATE);
		createEAttribute(partyDataSourceEClass, PARTY_DATA_SOURCE__VISIT_ID);
		createEReference(partyDataSourceEClass, PARTY_DATA_SOURCE__DATA_SOURCE_ID);

		partyGeoPointEClass = createEClass(PARTY_GEO_POINT);
		createEAttribute(partyGeoPointEClass, PARTY_GEO_POINT__PARTY_ID);
		createEAttribute(partyGeoPointEClass, PARTY_GEO_POINT__FROM_DATE);
		createEAttribute(partyGeoPointEClass, PARTY_GEO_POINT__THRU_DATE);
		createEReference(partyGeoPointEClass, PARTY_GEO_POINT__GEO_POINT_ID);

		partyGroupEClass = createEClass(PARTY_GROUP);
		createEAttribute(partyGroupEClass, PARTY_GROUP__ANNUAL_REVENUE);
		createEAttribute(partyGroupEClass, PARTY_GROUP__COMMENTS);
		createEAttribute(partyGroupEClass, PARTY_GROUP__GROUP_NAME);
		createEAttribute(partyGroupEClass, PARTY_GROUP__GROUP_NAME_LOCAL);
		createEAttribute(partyGroupEClass, PARTY_GROUP__LOGO_IMAGE_URL);
		createEAttribute(partyGroupEClass, PARTY_GROUP__NUM_EMPLOYEES);
		createEAttribute(partyGroupEClass, PARTY_GROUP__OFFICE_SITE_NAME);
		createEAttribute(partyGroupEClass, PARTY_GROUP__TICKER_SYMBOL);

		partyIcsAvsOverrideEClass = createEClass(PARTY_ICS_AVS_OVERRIDE);
		createEAttribute(partyIcsAvsOverrideEClass, PARTY_ICS_AVS_OVERRIDE__PARTY_ID);
		createEAttribute(partyIcsAvsOverrideEClass, PARTY_ICS_AVS_OVERRIDE__AVS_DECLINE_STRING);

		partyIdentificationEClass = createEClass(PARTY_IDENTIFICATION);
		createEAttribute(partyIdentificationEClass, PARTY_IDENTIFICATION__PARTY_ID);
		createEAttribute(partyIdentificationEClass, PARTY_IDENTIFICATION__ID_VALUE);
		createEReference(partyIdentificationEClass, PARTY_IDENTIFICATION__PARTY_IDENTIFICATION_TYPE_ID);

		partyIdentificationTypeEClass = createEClass(PARTY_IDENTIFICATION_TYPE);
		createEAttribute(partyIdentificationTypeEClass, PARTY_IDENTIFICATION_TYPE__PARTY_IDENTIFICATION_TYPE_ID);
		createEAttribute(partyIdentificationTypeEClass, PARTY_IDENTIFICATION_TYPE__DESCRIPTION);
		createEAttribute(partyIdentificationTypeEClass, PARTY_IDENTIFICATION_TYPE__HAS_TABLE);
		createEReference(partyIdentificationTypeEClass, PARTY_IDENTIFICATION_TYPE__PARENT_TYPE_ID);

		partyInvitationEClass = createEClass(PARTY_INVITATION);
		createEAttribute(partyInvitationEClass, PARTY_INVITATION__PARTY_INVITATION_ID);
		createEAttribute(partyInvitationEClass, PARTY_INVITATION__EMAIL_ADDRESS);
		createEAttribute(partyInvitationEClass, PARTY_INVITATION__LAST_INVITE_DATE);
		createEAttribute(partyInvitationEClass, PARTY_INVITATION__PARTY_ID);
		createEAttribute(partyInvitationEClass, PARTY_INVITATION__TO_NAME);
		createEReference(partyInvitationEClass, PARTY_INVITATION__PARTY_ID_FROM);
		createEReference(partyInvitationEClass, PARTY_INVITATION__STATUS_ID);
		createEAttribute(partyInvitationEClass, PARTY_INVITATION__PARTY_INVITATION_GROUP_ASSOCS);
		createEAttribute(partyInvitationEClass, PARTY_INVITATION__PARTY_INVITATION_ROLE_ASSOCS);

		partyInvitationGroupAssocEClass = createEClass(PARTY_INVITATION_GROUP_ASSOC);
		createEAttribute(partyInvitationGroupAssocEClass, PARTY_INVITATION_GROUP_ASSOC__PARTY_INVITATION_ID);
		createEReference(partyInvitationGroupAssocEClass, PARTY_INVITATION_GROUP_ASSOC__PARTY_ID_TO);

		partyInvitationRoleAssocEClass = createEClass(PARTY_INVITATION_ROLE_ASSOC);
		createEAttribute(partyInvitationRoleAssocEClass, PARTY_INVITATION_ROLE_ASSOC__PARTY_INVITATION_ID);
		createEReference(partyInvitationRoleAssocEClass, PARTY_INVITATION_ROLE_ASSOC__ROLE_TYPE_ID);

		partyNameHistoryEClass = createEClass(PARTY_NAME_HISTORY);
		createEAttribute(partyNameHistoryEClass, PARTY_NAME_HISTORY__PARTY_ID);
		createEAttribute(partyNameHistoryEClass, PARTY_NAME_HISTORY__CHANGE_DATE);
		createEAttribute(partyNameHistoryEClass, PARTY_NAME_HISTORY__FIRST_NAME);
		createEAttribute(partyNameHistoryEClass, PARTY_NAME_HISTORY__GROUP_NAME);
		createEAttribute(partyNameHistoryEClass, PARTY_NAME_HISTORY__LAST_NAME);
		createEAttribute(partyNameHistoryEClass, PARTY_NAME_HISTORY__MIDDLE_NAME);
		createEAttribute(partyNameHistoryEClass, PARTY_NAME_HISTORY__PERSONAL_TITLE);
		createEAttribute(partyNameHistoryEClass, PARTY_NAME_HISTORY__SUFFIX);

		partyNoteEClass = createEClass(PARTY_NOTE);
		createEAttribute(partyNoteEClass, PARTY_NOTE__PARTY_ID);

		partyProfileDefaultEClass = createEClass(PARTY_PROFILE_DEFAULT);
		createEAttribute(partyProfileDefaultEClass, PARTY_PROFILE_DEFAULT__PARTY_ID);
		createEAttribute(partyProfileDefaultEClass, PARTY_PROFILE_DEFAULT__DEFAULT_BILL_ADDR);
		createEAttribute(partyProfileDefaultEClass, PARTY_PROFILE_DEFAULT__DEFAULT_PAY_METH);
		createEAttribute(partyProfileDefaultEClass, PARTY_PROFILE_DEFAULT__DEFAULT_SHIP_ADDR);
		createEAttribute(partyProfileDefaultEClass, PARTY_PROFILE_DEFAULT__DEFAULT_SHIP_METH);
		createEReference(partyProfileDefaultEClass, PARTY_PROFILE_DEFAULT__PRODUCT_STORE_ID);

		partyRelationshipEClass = createEClass(PARTY_RELATIONSHIP);
		createEAttribute(partyRelationshipEClass, PARTY_RELATIONSHIP__PARTY_ID_FROM);
		createEAttribute(partyRelationshipEClass, PARTY_RELATIONSHIP__FROM_DATE);
		createEAttribute(partyRelationshipEClass, PARTY_RELATIONSHIP__COMMENTS);
		createEAttribute(partyRelationshipEClass, PARTY_RELATIONSHIP__PERMISSIONS_ENUM_ID);
		createEAttribute(partyRelationshipEClass, PARTY_RELATIONSHIP__POSITION_TITLE);
		createEAttribute(partyRelationshipEClass, PARTY_RELATIONSHIP__RELATIONSHIP_NAME);
		createEAttribute(partyRelationshipEClass, PARTY_RELATIONSHIP__THRU_DATE);
		createEReference(partyRelationshipEClass, PARTY_RELATIONSHIP__PARTY_ID_TO);
		createEReference(partyRelationshipEClass, PARTY_RELATIONSHIP__ROLE_TYPE_ID_FROM);
		createEReference(partyRelationshipEClass, PARTY_RELATIONSHIP__ROLE_TYPE_ID_TO);
		createEReference(partyRelationshipEClass, PARTY_RELATIONSHIP__STATUS_ID);
		createEReference(partyRelationshipEClass, PARTY_RELATIONSHIP__PRIORITY_TYPE_ID);
		createEReference(partyRelationshipEClass, PARTY_RELATIONSHIP__PARTY_RELATIONSHIP_TYPE_ID);
		createEReference(partyRelationshipEClass, PARTY_RELATIONSHIP__SECURITY_GROUP_ID);

		partyRelationshipTypeEClass = createEClass(PARTY_RELATIONSHIP_TYPE);
		createEAttribute(partyRelationshipTypeEClass, PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_TYPE_ID);
		createEAttribute(partyRelationshipTypeEClass, PARTY_RELATIONSHIP_TYPE__DESCRIPTION);
		createEAttribute(partyRelationshipTypeEClass, PARTY_RELATIONSHIP_TYPE__HAS_TABLE);
		createEAttribute(partyRelationshipTypeEClass, PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_NAME);
		createEReference(partyRelationshipTypeEClass, PARTY_RELATIONSHIP_TYPE__PARENT_TYPE_ID);
		createEReference(partyRelationshipTypeEClass, PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_FROM);
		createEReference(partyRelationshipTypeEClass, PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_TO);

		partyRoleEClass = createEClass(PARTY_ROLE);
		createEAttribute(partyRoleEClass, PARTY_ROLE__PARTY_ID);
		createEReference(partyRoleEClass, PARTY_ROLE__ROLE_TYPE_ID);

		partyStatusEClass = createEClass(PARTY_STATUS);
		createEAttribute(partyStatusEClass, PARTY_STATUS__STATUS_ID);
		createEAttribute(partyStatusEClass, PARTY_STATUS__STATUS_DATE);
		createEReference(partyStatusEClass, PARTY_STATUS__PARTY_ID);
		createEReference(partyStatusEClass, PARTY_STATUS__CHANGE_BY_USER_LOGIN_ID);

		partyTypeEClass = createEClass(PARTY_TYPE);
		createEAttribute(partyTypeEClass, PARTY_TYPE__PARTY_TYPE_ID);
		createEAttribute(partyTypeEClass, PARTY_TYPE__DESCRIPTION);
		createEAttribute(partyTypeEClass, PARTY_TYPE__HAS_TABLE);
		createEReference(partyTypeEClass, PARTY_TYPE__PARENT_TYPE_ID);
		createEAttribute(partyTypeEClass, PARTY_TYPE__PARTY_TYPE_ATTRS);

		partyTypeAttrEClass = createEClass(PARTY_TYPE_ATTR);
		createEAttribute(partyTypeAttrEClass, PARTY_TYPE_ATTR__PARTY_TYPE_ID);
		createEAttribute(partyTypeAttrEClass, PARTY_TYPE_ATTR__ATTR_NAME);
		createEAttribute(partyTypeAttrEClass, PARTY_TYPE_ATTR__DESCRIPTION);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__BIRTH_DATE);
		createEAttribute(personEClass, PERSON__CARD_ID);
		createEAttribute(personEClass, PERSON__COMMENTS);
		createEAttribute(personEClass, PERSON__DECEASED_DATE);
		createEAttribute(personEClass, PERSON__EXISTING_CUSTOMER);
		createEAttribute(personEClass, PERSON__FIRST_NAME);
		createEAttribute(personEClass, PERSON__FIRST_NAME_LOCAL);
		createEAttribute(personEClass, PERSON__GENDER);
		createEAttribute(personEClass, PERSON__HEIGHT);
		createEAttribute(personEClass, PERSON__LAST_NAME);
		createEAttribute(personEClass, PERSON__LAST_NAME_LOCAL);
		createEAttribute(personEClass, PERSON__MARITAL_STATUS);
		createEAttribute(personEClass, PERSON__MEMBER_ID);
		createEAttribute(personEClass, PERSON__MIDDLE_NAME);
		createEAttribute(personEClass, PERSON__MIDDLE_NAME_LOCAL);
		createEAttribute(personEClass, PERSON__MONTHS_WITH_EMPLOYER);
		createEAttribute(personEClass, PERSON__MOTHERS_MAIDEN_NAME);
		createEAttribute(personEClass, PERSON__NICKNAME);
		createEAttribute(personEClass, PERSON__OCCUPATION);
		createEAttribute(personEClass, PERSON__OTHER_LOCAL);
		createEAttribute(personEClass, PERSON__PASSPORT_EXPIRE_DATE);
		createEAttribute(personEClass, PERSON__PASSPORT_NUMBER);
		createEAttribute(personEClass, PERSON__PERSONAL_TITLE);
		createEAttribute(personEClass, PERSON__SALUTATION);
		createEAttribute(personEClass, PERSON__SOCIAL_SECURITY_NUMBER);
		createEAttribute(personEClass, PERSON__SUFFIX);
		createEAttribute(personEClass, PERSON__TOTAL_YEARS_WORK_EXPERIENCE);
		createEAttribute(personEClass, PERSON__WEIGHT);
		createEAttribute(personEClass, PERSON__YEARS_WITH_EMPLOYER);
		createEReference(personEClass, PERSON__EMPLOYMENT_STATUS_ENUM_ID);
		createEReference(personEClass, PERSON__RESIDENCE_STATUS_ENUM_ID);

		priorityTypeEClass = createEClass(PRIORITY_TYPE);
		createEAttribute(priorityTypeEClass, PRIORITY_TYPE__PRIORITY_TYPE_ID);
		createEAttribute(priorityTypeEClass, PRIORITY_TYPE__DESCRIPTION);

		roleTypeEClass = createEClass(ROLE_TYPE);
		createEAttribute(roleTypeEClass, ROLE_TYPE__ROLE_TYPE_ID);
		createEAttribute(roleTypeEClass, ROLE_TYPE__DESCRIPTION);
		createEAttribute(roleTypeEClass, ROLE_TYPE__HAS_TABLE);
		createEReference(roleTypeEClass, ROLE_TYPE__PARENT_TYPE_ID);
		createEAttribute(roleTypeEClass, ROLE_TYPE__ROLE_TYPE_ATTRS);
		createEAttribute(roleTypeEClass, ROLE_TYPE__VALID_CONTACT_MECH_ROLES);

		roleTypeAttrEClass = createEClass(ROLE_TYPE_ATTR);
		createEAttribute(roleTypeAttrEClass, ROLE_TYPE_ATTR__ROLE_TYPE_ID);
		createEAttribute(roleTypeAttrEClass, ROLE_TYPE_ATTR__ATTR_NAME);
		createEAttribute(roleTypeAttrEClass, ROLE_TYPE_ATTR__DESCRIPTION);

		vendorEClass = createEClass(VENDOR);
		createEAttribute(vendorEClass, VENDOR__PARTY_ID);
		createEAttribute(vendorEClass, VENDOR__MANIFEST_COMPANY_NAME);
		createEAttribute(vendorEClass, VENDOR__MANIFEST_COMPANY_TITLE);
		createEAttribute(vendorEClass, VENDOR__MANIFEST_LOGO_URL);
		createEAttribute(vendorEClass, VENDOR__MANIFEST_POLICIES);

		webSiteRoleEClass = createEClass(WEB_SITE_ROLE);
		createEAttribute(webSiteRoleEClass, WEB_SITE_ROLE__PARTY_ID);
		createEAttribute(webSiteRoleEClass, WEB_SITE_ROLE__FROM_DATE);
		createEAttribute(webSiteRoleEClass, WEB_SITE_ROLE__SEQUENCE_NUM);
		createEAttribute(webSiteRoleEClass, WEB_SITE_ROLE__THRU_DATE);
		createEReference(webSiteRoleEClass, WEB_SITE_ROLE__ROLE_TYPE_ID);
		createEReference(webSiteRoleEClass, WEB_SITE_ROLE__WEB_SITE_ID);
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
		LoginPackage theLoginPackage = (LoginPackage)EPackage.Registry.INSTANCE.getEPackage(LoginPackage.eNS_URI);
		UomPackage theUomPackage = (UomPackage)EPackage.Registry.INSTANCE.getEPackage(UomPackage.eNS_URI);
		StatusPackage theStatusPackage = (StatusPackage)EPackage.Registry.INSTANCE.getEPackage(StatusPackage.eNS_URI);
		DatasourcePackage theDatasourcePackage = (DatasourcePackage)EPackage.Registry.INSTANCE.getEPackage(DatasourcePackage.eNS_URI);
		ContentPackage theContentPackage = (ContentPackage)EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);
		GeoPackage theGeoPackage = (GeoPackage)EPackage.Registry.INSTANCE.getEPackage(GeoPackage.eNS_URI);
		StorePackage theStorePackage = (StorePackage)EPackage.Registry.INSTANCE.getEPackage(StorePackage.eNS_URI);
		SecuritygroupPackage theSecuritygroupPackage = (SecuritygroupPackage)EPackage.Registry.INSTANCE.getEPackage(SecuritygroupPackage.eNS_URI);
		EnumPackage theEnumPackage = (EnumPackage)EPackage.Registry.INSTANCE.getEPackage(EnumPackage.eNS_URI);
		org.abchip.mimo.biz.webapp.website.WebsitePackage theWebsitePackage_1 = (org.abchip.mimo.biz.webapp.website.WebsitePackage)EPackage.Registry.INSTANCE.getEPackage(org.abchip.mimo.biz.webapp.website.WebsitePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		addressMatchMapEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		affiliateEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		EGenericType g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		EGenericType g2 = createEGenericType(this.getPartyType());
		g1.getETypeArguments().add(g2);
		partyEClass.getEGenericSuperTypes().add(g1);
		partyAttributeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		partyCarrierAccountEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getPartyClassificationType());
		g1.getETypeArguments().add(g2);
		partyClassificationEClass.getEGenericSuperTypes().add(g1);
		partyClassificationGroupEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getPartyClassification());
		g1.getETypeArguments().add(g2);
		partyClassificationTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getPartyContentType());
		g1.getETypeArguments().add(g2);
		partyContentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getPartyContent());
		g1.getETypeArguments().add(g2);
		partyContentTypeEClass.getEGenericSuperTypes().add(g1);
		partyDataSourceEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		partyGeoPointEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		partyGroupEClass.getESuperTypes().add(this.getParty());
		partyIcsAvsOverrideEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getPartyIdentificationType());
		g1.getETypeArguments().add(g2);
		partyIdentificationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getPartyIdentification());
		g1.getETypeArguments().add(g2);
		partyIdentificationTypeEClass.getEGenericSuperTypes().add(g1);
		partyInvitationEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		partyInvitationGroupAssocEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		partyInvitationRoleAssocEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		partyNameHistoryEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		partyNoteEClass.getESuperTypes().add(theBizPackage.getBizEntityNote());
		partyProfileDefaultEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityTyped());
		g2 = createEGenericType(this.getPartyRelationshipType());
		g1.getETypeArguments().add(g2);
		partyRelationshipEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getPartyRelationship());
		g1.getETypeArguments().add(g2);
		partyRelationshipTypeEClass.getEGenericSuperTypes().add(g1);
		partyRoleEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		partyStatusEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		g1 = createEGenericType(theBizPackage.getBizEntityType());
		g2 = createEGenericType(this.getParty());
		g1.getETypeArguments().add(g2);
		partyTypeEClass.getEGenericSuperTypes().add(g1);
		partyTypeAttrEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		personEClass.getESuperTypes().add(this.getParty());
		priorityTypeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		roleTypeEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		roleTypeAttrEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		vendorEClass.getESuperTypes().add(theBizPackage.getBizEntity());
		webSiteRoleEClass.getESuperTypes().add(theBizPackage.getBizEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(addressMatchMapEClass, AddressMatchMap.class, "AddressMatchMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddressMatchMap_MapKey(), ecorePackage.getEString(), "mapKey", null, 1, 1, AddressMatchMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressMatchMap_MapValue(), ecorePackage.getEString(), "mapValue", null, 1, 1, AddressMatchMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressMatchMap_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, AddressMatchMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(affiliateEClass, Affiliate.class, "Affiliate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAffiliate_PartyId(), ecorePackage.getEString(), "partyId", null, 1, 1, Affiliate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffiliate_AffiliateDescription(), ecorePackage.getEString(), "affiliateDescription", null, 0, 1, Affiliate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffiliate_AffiliateName(), ecorePackage.getEString(), "affiliateName", null, 0, 1, Affiliate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffiliate_DateTimeApproved(), ecorePackage.getEDate(), "dateTimeApproved", null, 0, 1, Affiliate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffiliate_DateTimeCreated(), ecorePackage.getEDate(), "dateTimeCreated", null, 0, 1, Affiliate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffiliate_SitePageViews(), ecorePackage.getEString(), "sitePageViews", null, 0, 1, Affiliate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffiliate_SiteType(), ecorePackage.getEString(), "siteType", null, 0, 1, Affiliate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffiliate_SiteVisitors(), ecorePackage.getEString(), "siteVisitors", null, 0, 1, Affiliate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffiliate_YearEstablished(), ecorePackage.getEString(), "yearEstablished", null, 0, 1, Affiliate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyEClass, Party.class, "Party", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParty_PartyId(), ecorePackage.getEString(), "partyId", null, 1, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParty_CreatedDate(), ecorePackage.getEDate(), "createdDate", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParty_Description(), ecorePackage.getEString(), "description", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParty_ExternalId(), ecorePackage.getEString(), "externalId", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParty_IsUnread(), ecorePackage.getEBoolean(), "isUnread", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParty_LastModifiedDate(), ecorePackage.getEDate(), "lastModifiedDate", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParty_PartyTypeId(), this.getPartyType(), null, "partyTypeId", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getParty_PartyTypeId().getEKeys().add(this.getPartyType_PartyTypeId());
		initEReference(getParty_CreatedByUserLogin(), theLoginPackage.getUserLogin(), null, "createdByUserLogin", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getParty_CreatedByUserLogin().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());
		initEReference(getParty_LastModifiedByUserLogin(), theLoginPackage.getUserLogin(), null, "lastModifiedByUserLogin", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getParty_LastModifiedByUserLogin().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());
		initEReference(getParty_PreferredCurrencyUomId(), theUomPackage.getUom(), null, "preferredCurrencyUomId", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getParty_PreferredCurrencyUomId().getEKeys().add(theUomPackage.getUom_UomId());
		initEReference(getParty_StatusId(), theStatusPackage.getStatusItem(), null, "statusId", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getParty_StatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEReference(getParty_DataSourceId(), theDatasourcePackage.getDataSource(), null, "dataSourceId", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getParty_DataSourceId().getEKeys().add(theDatasourcePackage.getDataSource_DataSourceId());
		initEAttribute(getParty_PartyAttributes(), ecorePackage.getEString(), "partyAttributes", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParty_PartyIdentifications(), ecorePackage.getEString(), "partyIdentifications", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParty_PartyNameHistories(), ecorePackage.getEString(), "partyNameHistories", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParty_PartyNotes(), ecorePackage.getEString(), "partyNotes", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParty_PartyProfileDefaults(), ecorePackage.getEString(), "partyProfileDefaults", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParty_PartyRoles(), ecorePackage.getEString(), "partyRoles", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParty_PartySkills(), ecorePackage.getEString(), "partySkills", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParty_SupplierProductFeatures(), ecorePackage.getEString(), "supplierProductFeatures", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "acctgTransEntries", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "acctgTranss", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "applyingEmploymentApps", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "approverEmploymentApps", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "carrierOrderItemShipGroups", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "carrierShipmentBoxTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "carrierShipmentRouteSegments", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "clientTimesheets", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "committedByContentRevisions", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "contentApprovals", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "costComponents", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "custRequestTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "emplPositions", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "finAccountTranss", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "fixedAssets", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "fromAgreements", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "fromCommunicationEvents", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "fromCustRequests", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "fromInvoices", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "fromPayments", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "fromShipments", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "giftCardFulfillments", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "glAccountOrganizations", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "glJournals", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "glReconciliations", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "govAgencyFixedAssetRegistrations", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "internalSalesForecastHistories", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "internalSalesForecasts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "intervieweeJobInterviews", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "interviewerJobInterviews", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "inventoryItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "invoices", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "noteNoteDatas", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "organizationCustomTimePeriods", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "organizationFinAccountTypeGlAccounts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "organizationFinAccounts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "organizationGlAccountTypeDefaults", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "organizationInvoiceItemTypeGlAccounts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "organizationPaymentMethodTypeGlAccounts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "organizationSalesForecastHistories", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "organizationSalesForecasts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "organizationVarianceReasonGlAccounts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "originatedFromSubscriptions", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "overrideOrgInvoiceItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "ownerContactLists", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "ownerFacilities", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "ownerFinAccounts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "ownerInventoryItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "partyInvitations", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "partyPrefDocTypeTpls", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "partyResumes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "paymentGlAccountTypeMaps", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "paymentMethods", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "performedByFinAccountTranss", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "productPromoCodeParties", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "productPromoUses", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "productPromos", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "productStoreShipmentMeths", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "productStores", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "quotes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "referredByEmploymentApps", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "reorderGuidelines", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "returnHeaders", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "shipmentCostEstimates", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "shoppingLists", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "subscriptions", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "supplierOrderItemShipGroups", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "surveyResponses", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "taxAuthTaxAuthorities", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "taxAuthorityInvoiceItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "timeEntries", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "timesheets", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "toAgreements", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "toCommunicationEvents", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "toPartyInvitationGroupAssocs", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "toPayments", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "toReturnHeaders", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "toShipments", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "userLoginHistories", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "userLogins", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "vendorOrderItemShipGroups", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyEClass, ecorePackage.getEString(), "workEffortEventReminders", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(partyAttributeEClass, PartyAttribute.class, "PartyAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyAttribute_PartyId(), ecorePackage.getEString(), "partyId", null, 1, 1, PartyAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAttribute_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, PartyAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAttribute_AttrDescription(), ecorePackage.getEString(), "attrDescription", null, 0, 1, PartyAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyAttribute_AttrValue(), ecorePackage.getEString(), "attrValue", null, 0, 1, PartyAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyCarrierAccountEClass, PartyCarrierAccount.class, "PartyCarrierAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyCarrierAccount_PartyId(), ecorePackage.getEString(), "partyId", null, 1, 1, PartyCarrierAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyCarrierAccount_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, PartyCarrierAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyCarrierAccount_AccountNumber(), ecorePackage.getEString(), "accountNumber", null, 0, 1, PartyCarrierAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyCarrierAccount_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, PartyCarrierAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyCarrierAccount_CarrierPartyId(), this.getParty(), null, "carrierPartyId", null, 0, 1, PartyCarrierAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyCarrierAccount_CarrierPartyId().getEKeys().add(this.getParty_PartyId());

		initEClass(partyClassificationEClass, PartyClassification.class, "PartyClassification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyClassification_PartyId(), ecorePackage.getEString(), "partyId", null, 1, 1, PartyClassification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyClassification_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, PartyClassification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyClassification_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, PartyClassification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyClassification_PartyClassificationGroupId(), this.getPartyClassificationGroup(), null, "partyClassificationGroupId", null, 0, 1, PartyClassification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyClassification_PartyClassificationGroupId().getEKeys().add(this.getPartyClassificationGroup_PartyClassificationGroupId());

		initEClass(partyClassificationGroupEClass, PartyClassificationGroup.class, "PartyClassificationGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyClassificationGroup_PartyClassificationGroupId(), ecorePackage.getEString(), "partyClassificationGroupId", null, 1, 1, PartyClassificationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyClassificationGroup_Description(), ecorePackage.getEString(), "description", null, 0, 1, PartyClassificationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyClassificationGroup_ParentGroupId(), this.getPartyClassificationGroup(), null, "parentGroupId", null, 0, 1, PartyClassificationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyClassificationGroup_ParentGroupId().getEKeys().add(this.getPartyClassificationGroup_PartyClassificationGroupId());
		initEReference(getPartyClassificationGroup_PartyClassificationTypeId(), this.getPartyClassificationType(), null, "partyClassificationTypeId", null, 0, 1, PartyClassificationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyClassificationGroup_PartyClassificationTypeId().getEKeys().add(this.getPartyClassificationType_PartyClassificationTypeId());

		addEOperation(partyClassificationGroupEClass, ecorePackage.getEString(), "childPartyClassificationGroups", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyClassificationGroupEClass, ecorePackage.getEString(), "segmentGroupClassifications", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(partyClassificationTypeEClass, PartyClassificationType.class, "PartyClassificationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyClassificationType_PartyClassificationTypeId(), ecorePackage.getEString(), "partyClassificationTypeId", null, 1, 1, PartyClassificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyClassificationType_Description(), ecorePackage.getEString(), "description", null, 0, 1, PartyClassificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyClassificationType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, PartyClassificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyClassificationType_ParentTypeId(), this.getPartyClassificationType(), null, "parentTypeId", null, 0, 1, PartyClassificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyClassificationType_ParentTypeId().getEKeys().add(this.getPartyClassificationType_PartyClassificationTypeId());

		addEOperation(partyClassificationTypeEClass, ecorePackage.getEString(), "childPartyClassificationTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyClassificationTypeEClass, ecorePackage.getEString(), "partyClassificationGroups", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(partyContentEClass, PartyContent.class, "PartyContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyContent_PartyId(), ecorePackage.getEString(), "partyId", null, 1, 1, PartyContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyContent_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, PartyContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyContent_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, PartyContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyContent_ContentId(), theContentPackage.getContent(), null, "contentId", null, 0, 1, PartyContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyContent_ContentId().getEKeys().add(theContentPackage.getContent_ContentId());
		initEReference(getPartyContent_PartyContentTypeId(), this.getPartyContentType(), null, "partyContentTypeId", null, 0, 1, PartyContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyContent_PartyContentTypeId().getEKeys().add(this.getPartyContentType_PartyContentTypeId());

		initEClass(partyContentTypeEClass, PartyContentType.class, "PartyContentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyContentType_PartyContentTypeId(), ecorePackage.getEString(), "partyContentTypeId", null, 1, 1, PartyContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyContentType_Description(), ecorePackage.getEString(), "description", null, 0, 1, PartyContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyContentType_ParentTypeId(), this.getPartyContentType(), null, "parentTypeId", null, 0, 1, PartyContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyContentType_ParentTypeId().getEKeys().add(this.getPartyContentType_PartyContentTypeId());

		addEOperation(partyContentTypeEClass, ecorePackage.getEString(), "childPartyContentTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(partyDataSourceEClass, PartyDataSource.class, "PartyDataSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyDataSource_PartyId(), ecorePackage.getEString(), "partyId", null, 1, 1, PartyDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyDataSource_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, PartyDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyDataSource_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, PartyDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyDataSource_IsCreate(), ecorePackage.getEBoolean(), "isCreate", null, 0, 1, PartyDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyDataSource_VisitId(), ecorePackage.getEString(), "visitId", null, 0, 1, PartyDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyDataSource_DataSourceId(), theDatasourcePackage.getDataSource(), null, "dataSourceId", null, 0, 1, PartyDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyDataSource_DataSourceId().getEKeys().add(theDatasourcePackage.getDataSource_DataSourceId());

		initEClass(partyGeoPointEClass, PartyGeoPoint.class, "PartyGeoPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyGeoPoint_PartyId(), ecorePackage.getEString(), "partyId", null, 1, 1, PartyGeoPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyGeoPoint_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, PartyGeoPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyGeoPoint_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, PartyGeoPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyGeoPoint_GeoPointId(), theGeoPackage.getGeoPoint(), null, "geoPointId", null, 0, 1, PartyGeoPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyGeoPoint_GeoPointId().getEKeys().add(theGeoPackage.getGeoPoint_GeoPointId());

		initEClass(partyGroupEClass, PartyGroup.class, "PartyGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyGroup_AnnualRevenue(), ecorePackage.getEBigDecimal(), "annualRevenue", null, 0, 1, PartyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyGroup_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, PartyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyGroup_GroupName(), ecorePackage.getEString(), "groupName", null, 0, 1, PartyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyGroup_GroupNameLocal(), ecorePackage.getEString(), "groupNameLocal", null, 0, 1, PartyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyGroup_LogoImageUrl(), ecorePackage.getEString(), "logoImageUrl", null, 0, 1, PartyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyGroup_NumEmployees(), ecorePackage.getELong(), "numEmployees", null, 0, 1, PartyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyGroup_OfficeSiteName(), ecorePackage.getEString(), "officeSiteName", null, 0, 1, PartyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyGroup_TickerSymbol(), ecorePackage.getEString(), "tickerSymbol", null, 0, 1, PartyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyIcsAvsOverrideEClass, PartyIcsAvsOverride.class, "PartyIcsAvsOverride", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyIcsAvsOverride_PartyId(), ecorePackage.getEString(), "partyId", null, 1, 1, PartyIcsAvsOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyIcsAvsOverride_AvsDeclineString(), ecorePackage.getEString(), "avsDeclineString", null, 0, 1, PartyIcsAvsOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyIdentificationEClass, PartyIdentification.class, "PartyIdentification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyIdentification_PartyId(), ecorePackage.getEString(), "partyId", null, 1, 1, PartyIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyIdentification_IdValue(), ecorePackage.getEString(), "idValue", null, 0, 1, PartyIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyIdentification_PartyIdentificationTypeId(), this.getPartyIdentificationType(), null, "partyIdentificationTypeId", null, 0, 1, PartyIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyIdentification_PartyIdentificationTypeId().getEKeys().add(this.getPartyIdentificationType_PartyIdentificationTypeId());

		initEClass(partyIdentificationTypeEClass, PartyIdentificationType.class, "PartyIdentificationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyIdentificationType_PartyIdentificationTypeId(), ecorePackage.getEString(), "partyIdentificationTypeId", null, 1, 1, PartyIdentificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyIdentificationType_Description(), ecorePackage.getEString(), "description", null, 0, 1, PartyIdentificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyIdentificationType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, PartyIdentificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyIdentificationType_ParentTypeId(), this.getPartyIdentificationType(), null, "parentTypeId", null, 0, 1, PartyIdentificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyIdentificationType_ParentTypeId().getEKeys().add(this.getPartyIdentificationType_PartyIdentificationTypeId());

		addEOperation(partyIdentificationTypeEClass, ecorePackage.getEString(), "childPartyIdentificationTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyIdentificationTypeEClass, ecorePackage.getEString(), "partyIdentifications", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(partyInvitationEClass, PartyInvitation.class, "PartyInvitation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyInvitation_PartyInvitationId(), ecorePackage.getEString(), "partyInvitationId", null, 1, 1, PartyInvitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyInvitation_EmailAddress(), ecorePackage.getEString(), "emailAddress", null, 0, 1, PartyInvitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyInvitation_LastInviteDate(), ecorePackage.getEDate(), "lastInviteDate", null, 0, 1, PartyInvitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyInvitation_PartyId(), ecorePackage.getEString(), "partyId", null, 0, 1, PartyInvitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyInvitation_ToName(), ecorePackage.getEString(), "toName", null, 0, 1, PartyInvitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyInvitation_PartyIdFrom(), this.getParty(), null, "partyIdFrom", null, 0, 1, PartyInvitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyInvitation_PartyIdFrom().getEKeys().add(this.getParty_PartyId());
		initEReference(getPartyInvitation_StatusId(), theStatusPackage.getStatusItem(), null, "statusId", null, 0, 1, PartyInvitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyInvitation_StatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEAttribute(getPartyInvitation_PartyInvitationGroupAssocs(), ecorePackage.getEString(), "partyInvitationGroupAssocs", null, 0, -1, PartyInvitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyInvitation_PartyInvitationRoleAssocs(), ecorePackage.getEString(), "partyInvitationRoleAssocs", null, 0, -1, PartyInvitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyInvitationGroupAssocEClass, PartyInvitationGroupAssoc.class, "PartyInvitationGroupAssoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyInvitationGroupAssoc_PartyInvitationId(), ecorePackage.getEString(), "partyInvitationId", null, 1, 1, PartyInvitationGroupAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyInvitationGroupAssoc_PartyIdTo(), this.getParty(), null, "partyIdTo", null, 0, 1, PartyInvitationGroupAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyInvitationGroupAssoc_PartyIdTo().getEKeys().add(this.getParty_PartyId());

		initEClass(partyInvitationRoleAssocEClass, PartyInvitationRoleAssoc.class, "PartyInvitationRoleAssoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyInvitationRoleAssoc_PartyInvitationId(), ecorePackage.getEString(), "partyInvitationId", null, 1, 1, PartyInvitationRoleAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyInvitationRoleAssoc_RoleTypeId(), this.getRoleType(), null, "roleTypeId", null, 0, 1, PartyInvitationRoleAssoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyInvitationRoleAssoc_RoleTypeId().getEKeys().add(this.getRoleType_RoleTypeId());

		initEClass(partyNameHistoryEClass, PartyNameHistory.class, "PartyNameHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyNameHistory_PartyId(), ecorePackage.getEString(), "partyId", null, 1, 1, PartyNameHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyNameHistory_ChangeDate(), ecorePackage.getEDate(), "changeDate", null, 1, 1, PartyNameHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyNameHistory_FirstName(), ecorePackage.getEString(), "firstName", null, 0, 1, PartyNameHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyNameHistory_GroupName(), ecorePackage.getEString(), "groupName", null, 0, 1, PartyNameHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyNameHistory_LastName(), ecorePackage.getEString(), "lastName", null, 0, 1, PartyNameHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyNameHistory_MiddleName(), ecorePackage.getEString(), "middleName", null, 0, 1, PartyNameHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyNameHistory_PersonalTitle(), ecorePackage.getEString(), "personalTitle", null, 0, 1, PartyNameHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyNameHistory_Suffix(), ecorePackage.getEString(), "suffix", null, 0, 1, PartyNameHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyNoteEClass, PartyNote.class, "PartyNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyNote_PartyId(), ecorePackage.getEString(), "partyId", null, 1, 1, PartyNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partyProfileDefaultEClass, PartyProfileDefault.class, "PartyProfileDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyProfileDefault_PartyId(), ecorePackage.getEString(), "partyId", null, 1, 1, PartyProfileDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyProfileDefault_DefaultBillAddr(), ecorePackage.getEString(), "defaultBillAddr", null, 0, 1, PartyProfileDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyProfileDefault_DefaultPayMeth(), ecorePackage.getEString(), "defaultPayMeth", null, 0, 1, PartyProfileDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyProfileDefault_DefaultShipAddr(), ecorePackage.getEString(), "defaultShipAddr", null, 0, 1, PartyProfileDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyProfileDefault_DefaultShipMeth(), ecorePackage.getEString(), "defaultShipMeth", null, 0, 1, PartyProfileDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyProfileDefault_ProductStoreId(), theStorePackage.getProductStore(), null, "productStoreId", null, 0, 1, PartyProfileDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyProfileDefault_ProductStoreId().getEKeys().add(theStorePackage.getProductStore_ProductStoreId());

		initEClass(partyRelationshipEClass, PartyRelationship.class, "PartyRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyRelationship_PartyIdFrom(), ecorePackage.getEString(), "partyIdFrom", null, 1, 1, PartyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyRelationship_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, PartyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyRelationship_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, PartyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyRelationship_PermissionsEnumId(), ecorePackage.getEString(), "permissionsEnumId", null, 0, 1, PartyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyRelationship_PositionTitle(), ecorePackage.getEString(), "positionTitle", null, 0, 1, PartyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyRelationship_RelationshipName(), ecorePackage.getEString(), "relationshipName", null, 0, 1, PartyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyRelationship_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, PartyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyRelationship_PartyIdTo(), this.getParty(), null, "partyIdTo", null, 0, 1, PartyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyRelationship_PartyIdTo().getEKeys().add(this.getParty_PartyId());
		initEReference(getPartyRelationship_RoleTypeIdFrom(), this.getRoleType(), null, "roleTypeIdFrom", null, 0, 1, PartyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyRelationship_RoleTypeIdFrom().getEKeys().add(this.getRoleType_RoleTypeId());
		initEReference(getPartyRelationship_RoleTypeIdTo(), this.getRoleType(), null, "roleTypeIdTo", null, 0, 1, PartyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyRelationship_RoleTypeIdTo().getEKeys().add(this.getRoleType_RoleTypeId());
		initEReference(getPartyRelationship_StatusId(), theStatusPackage.getStatusItem(), null, "statusId", null, 0, 1, PartyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyRelationship_StatusId().getEKeys().add(theStatusPackage.getStatusItem_StatusId());
		initEReference(getPartyRelationship_PriorityTypeId(), this.getPriorityType(), null, "priorityTypeId", null, 0, 1, PartyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyRelationship_PriorityTypeId().getEKeys().add(this.getPriorityType_PriorityTypeId());
		initEReference(getPartyRelationship_PartyRelationshipTypeId(), this.getPartyRelationshipType(), null, "partyRelationshipTypeId", null, 0, 1, PartyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyRelationship_PartyRelationshipTypeId().getEKeys().add(this.getPartyRelationshipType_PartyRelationshipTypeId());
		initEReference(getPartyRelationship_SecurityGroupId(), theSecuritygroupPackage.getSecurityGroup(), null, "securityGroupId", null, 0, 1, PartyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyRelationship_SecurityGroupId().getEKeys().add(theSecuritygroupPackage.getSecurityGroup_GroupId());

		initEClass(partyRelationshipTypeEClass, PartyRelationshipType.class, "PartyRelationshipType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyRelationshipType_PartyRelationshipTypeId(), ecorePackage.getEString(), "partyRelationshipTypeId", null, 1, 1, PartyRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyRelationshipType_Description(), ecorePackage.getEString(), "description", null, 0, 1, PartyRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyRelationshipType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, PartyRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyRelationshipType_PartyRelationshipName(), ecorePackage.getEString(), "partyRelationshipName", null, 0, 1, PartyRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyRelationshipType_ParentTypeId(), this.getPartyRelationshipType(), null, "parentTypeId", null, 0, 1, PartyRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyRelationshipType_ParentTypeId().getEKeys().add(this.getPartyRelationshipType_PartyRelationshipTypeId());
		initEReference(getPartyRelationshipType_RoleTypeIdValidFrom(), this.getRoleType(), null, "roleTypeIdValidFrom", null, 0, 1, PartyRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyRelationshipType_RoleTypeIdValidFrom().getEKeys().add(this.getRoleType_RoleTypeId());
		initEReference(getPartyRelationshipType_RoleTypeIdValidTo(), this.getRoleType(), null, "roleTypeIdValidTo", null, 0, 1, PartyRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyRelationshipType_RoleTypeIdValidTo().getEKeys().add(this.getRoleType_RoleTypeId());

		addEOperation(partyRelationshipTypeEClass, ecorePackage.getEString(), "childPartyRelationshipTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(partyRoleEClass, PartyRole.class, "PartyRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyRole_PartyId(), ecorePackage.getEString(), "partyId", null, 1, 1, PartyRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyRole_RoleTypeId(), this.getRoleType(), null, "roleTypeId", null, 0, 1, PartyRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyRole_RoleTypeId().getEKeys().add(this.getRoleType_RoleTypeId());

		initEClass(partyStatusEClass, PartyStatus.class, "PartyStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyStatus_StatusId(), ecorePackage.getEString(), "statusId", null, 1, 1, PartyStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyStatus_StatusDate(), ecorePackage.getEDate(), "statusDate", null, 1, 1, PartyStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyStatus_PartyId(), this.getParty(), null, "partyId", null, 0, 1, PartyStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyStatus_PartyId().getEKeys().add(this.getParty_PartyId());
		initEReference(getPartyStatus_ChangeByUserLoginId(), theLoginPackage.getUserLogin(), null, "changeByUserLoginId", null, 0, 1, PartyStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyStatus_ChangeByUserLoginId().getEKeys().add(theLoginPackage.getUserLogin_UserLoginId());

		initEClass(partyTypeEClass, PartyType.class, "PartyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyType_PartyTypeId(), ecorePackage.getEString(), "partyTypeId", null, 1, 1, PartyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyType_Description(), ecorePackage.getEString(), "description", null, 0, 1, PartyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, PartyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartyType_ParentTypeId(), this.getPartyType(), null, "parentTypeId", null, 0, 1, PartyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPartyType_ParentTypeId().getEKeys().add(this.getPartyType_PartyTypeId());
		initEAttribute(getPartyType_PartyTypeAttrs(), ecorePackage.getEString(), "partyTypeAttrs", null, 0, -1, PartyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(partyTypeEClass, ecorePackage.getEString(), "childPartyTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(partyTypeEClass, ecorePackage.getEString(), "parties", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(partyTypeAttrEClass, PartyTypeAttr.class, "PartyTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPartyTypeAttr_PartyTypeId(), ecorePackage.getEString(), "partyTypeId", null, 1, 1, PartyTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, PartyTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartyTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, PartyTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_BirthDate(), ecorePackage.getEDate(), "birthDate", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_CardId(), ecorePackage.getEString(), "cardId", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_DeceasedDate(), ecorePackage.getEDate(), "deceasedDate", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_ExistingCustomer(), ecorePackage.getEBoolean(), "existingCustomer", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_FirstName(), ecorePackage.getEString(), "firstName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_FirstNameLocal(), ecorePackage.getEString(), "firstNameLocal", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Gender(), ecorePackage.getEBoolean(), "gender", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Height(), ecorePackage.getEDouble(), "height", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_LastName(), ecorePackage.getEString(), "lastName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_LastNameLocal(), ecorePackage.getEString(), "lastNameLocal", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_MaritalStatus(), ecorePackage.getEBoolean(), "maritalStatus", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_MemberId(), ecorePackage.getEString(), "memberId", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_MiddleName(), ecorePackage.getEString(), "middleName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_MiddleNameLocal(), ecorePackage.getEString(), "middleNameLocal", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_MonthsWithEmployer(), ecorePackage.getELong(), "monthsWithEmployer", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_MothersMaidenName(), ecorePackage.getEString(), "mothersMaidenName", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Nickname(), ecorePackage.getEString(), "nickname", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Occupation(), ecorePackage.getEString(), "occupation", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_OtherLocal(), ecorePackage.getEString(), "otherLocal", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_PassportExpireDate(), ecorePackage.getEDate(), "passportExpireDate", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_PassportNumber(), ecorePackage.getEString(), "passportNumber", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_PersonalTitle(), ecorePackage.getEString(), "personalTitle", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Salutation(), ecorePackage.getEString(), "salutation", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_SocialSecurityNumber(), ecorePackage.getEString(), "socialSecurityNumber", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Suffix(), ecorePackage.getEString(), "suffix", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_TotalYearsWorkExperience(), ecorePackage.getEDouble(), "totalYearsWorkExperience", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Weight(), ecorePackage.getEDouble(), "weight", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_YearsWithEmployer(), ecorePackage.getELong(), "yearsWithEmployer", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_EmploymentStatusEnumId(), theEnumPackage.getEnumeration(), null, "employmentStatusEnumId", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPerson_EmploymentStatusEnumId().getEKeys().add(theEnumPackage.getEnumeration_EnumId());
		initEReference(getPerson_ResidenceStatusEnumId(), theEnumPackage.getEnumeration(), null, "residenceStatusEnumId", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPerson_ResidenceStatusEnumId().getEKeys().add(theEnumPackage.getEnumeration_EnumId());

		initEClass(priorityTypeEClass, PriorityType.class, "PriorityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPriorityType_PriorityTypeId(), ecorePackage.getEString(), "priorityTypeId", null, 1, 1, PriorityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPriorityType_Description(), ecorePackage.getEString(), "description", null, 0, 1, PriorityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleTypeEClass, RoleType.class, "RoleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoleType_RoleTypeId(), ecorePackage.getEString(), "roleTypeId", null, 1, 1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleType_Description(), ecorePackage.getEString(), "description", null, 0, 1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleType_HasTable(), ecorePackage.getEBoolean(), "hasTable", null, 0, 1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleType_ParentTypeId(), this.getRoleType(), null, "parentTypeId", null, 0, 1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getRoleType_ParentTypeId().getEKeys().add(this.getRoleType_RoleTypeId());
		initEAttribute(getRoleType_RoleTypeAttrs(), ecorePackage.getEString(), "roleTypeAttrs", null, 0, -1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleType_ValidContactMechRoles(), ecorePackage.getEString(), "validContactMechRoles", null, 0, -1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(roleTypeEClass, ecorePackage.getEString(), "acctgTransEntries", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(roleTypeEClass, ecorePackage.getEString(), "acctgTranss", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(roleTypeEClass, ecorePackage.getEString(), "childRoleTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(roleTypeEClass, ecorePackage.getEString(), "contentApprovals", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(roleTypeEClass, ecorePackage.getEString(), "fixedAssets", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(roleTypeEClass, ecorePackage.getEString(), "fromAgreements", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(roleTypeEClass, ecorePackage.getEString(), "fromCommunicationEvents", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(roleTypeEClass, ecorePackage.getEString(), "glAccountOrganizations", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(roleTypeEClass, ecorePackage.getEString(), "invoices", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(roleTypeEClass, ecorePackage.getEString(), "originatedFromSubscriptions", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(roleTypeEClass, ecorePackage.getEString(), "partyInvitationRoleAssocs", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(roleTypeEClass, ecorePackage.getEString(), "partyRoles", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(roleTypeEClass, ecorePackage.getEString(), "shipmentCostEstimates", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(roleTypeEClass, ecorePackage.getEString(), "subscriptions", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(roleTypeEClass, ecorePackage.getEString(), "toAgreements", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(roleTypeEClass, ecorePackage.getEString(), "toCommunicationEvents", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(roleTypeEClass, ecorePackage.getEString(), "toPayments", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(roleTypeEClass, ecorePackage.getEString(), "validFromPartyRelationshipTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(roleTypeEClass, ecorePackage.getEString(), "validToPartyRelationshipTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(roleTypeAttrEClass, RoleTypeAttr.class, "RoleTypeAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoleTypeAttr_RoleTypeId(), ecorePackage.getEString(), "roleTypeId", null, 1, 1, RoleTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleTypeAttr_AttrName(), ecorePackage.getEString(), "attrName", null, 1, 1, RoleTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleTypeAttr_Description(), ecorePackage.getEString(), "description", null, 0, 1, RoleTypeAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vendorEClass, Vendor.class, "Vendor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVendor_PartyId(), ecorePackage.getEString(), "partyId", null, 1, 1, Vendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVendor_ManifestCompanyName(), ecorePackage.getEString(), "manifestCompanyName", null, 0, 1, Vendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVendor_ManifestCompanyTitle(), ecorePackage.getEString(), "manifestCompanyTitle", null, 0, 1, Vendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVendor_ManifestLogoUrl(), ecorePackage.getEString(), "manifestLogoUrl", null, 0, 1, Vendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVendor_ManifestPolicies(), ecorePackage.getEString(), "manifestPolicies", null, 0, 1, Vendor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webSiteRoleEClass, WebSiteRole.class, "WebSiteRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebSiteRole_PartyId(), ecorePackage.getEString(), "partyId", null, 1, 1, WebSiteRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSiteRole_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, WebSiteRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSiteRole_SequenceNum(), ecorePackage.getELong(), "sequenceNum", null, 0, 1, WebSiteRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSiteRole_ThruDate(), ecorePackage.getEDate(), "thruDate", null, 0, 1, WebSiteRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebSiteRole_RoleTypeId(), this.getRoleType(), null, "roleTypeId", null, 0, 1, WebSiteRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWebSiteRole_RoleTypeId().getEKeys().add(this.getRoleType_RoleTypeId());
		initEReference(getWebSiteRole_WebSiteId(), theWebsitePackage_1.getWebSite(), null, "webSiteId", null, 0, 1, WebSiteRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getWebSiteRole_WebSiteId().getEKeys().add(theWebsitePackage_1.getWebSite_WebSiteId());

		// Create annotations
		// mimo-ent-slot
		createMimoentslotAnnotations();
		// mimo-ent-frame
		createMimoentframeAnnotations();
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
		  (getAddressMatchMap_MapKey(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAddressMatchMap_MapValue(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getAffiliate_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(3),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(4),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(5),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(6),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(7),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(8),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(9),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(10),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(11),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(12),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(13),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(14),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(15),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(16),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(17),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(18),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(19),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(20),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(21),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(22),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(23),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(24),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(25),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(26),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(27),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(28),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(29),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(30),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(31),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(32),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(33),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(34),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(35),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(36),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(37),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(38),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(39),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(40),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(41),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(42),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(43),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(44),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(45),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(46),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(47),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(48),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(49),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(50),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(51),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(52),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(53),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(54),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(55),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(56),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(57),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(58),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(59),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(60),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(61),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(62),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(63),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(64),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(65),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(66),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(67),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(68),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(69),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(70),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(71),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(72),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(73),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(74),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(75),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(76),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(77),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(78),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(79),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(80),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(81),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getParty_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getParty_PartyAttributes(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getParty_PartyIdentifications(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getParty_PartyNameHistories(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getParty_PartyNotes(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getParty_PartyProfileDefaults(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getParty_PartyRoles(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getParty_PartySkills(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getParty_SupplierProductFeatures(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getPartyAttribute_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyAttribute_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyCarrierAccount_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyCarrierAccount_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyClassification_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyClassification_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (partyClassificationGroupEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyClassificationGroupEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getPartyClassificationGroup_PartyClassificationGroupId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (partyClassificationTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyClassificationTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getPartyClassificationType_PartyClassificationTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyContent_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyContent_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (partyContentTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getPartyContentType_PartyContentTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyDataSource_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyDataSource_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyGeoPoint_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyGeoPoint_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyIcsAvsOverride_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyIdentification_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (partyIdentificationTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyIdentificationTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getPartyIdentificationType_PartyIdentificationTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyInvitation_PartyInvitationId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyInvitation_PartyInvitationGroupAssocs(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getPartyInvitation_PartyInvitationRoleAssocs(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getPartyInvitationGroupAssoc_PartyInvitationId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyInvitationRoleAssoc_PartyInvitationId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyNameHistory_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyNameHistory_ChangeDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyNote_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyProfileDefault_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyRelationship_PartyIdFrom(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyRelationship_FromDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (partyRelationshipTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getPartyRelationshipType_PartyRelationshipTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyRole_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyStatus_StatusId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyStatus_StatusDate(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (partyTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (partyTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getPartyType_PartyTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyType_PartyTypeAttrs(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getPartyTypeAttr_PartyTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPartyTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getPriorityType_PriorityTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(3),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(4),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(5),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(6),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(7),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(8),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(9),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(10),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(11),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(12),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(13),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(14),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(15),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(16),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(17),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(18),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getRoleType_RoleTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getRoleType_RoleTypeAttrs(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getRoleType_ValidContactMechRoles(),
		   source,
		   new String[] {
			   "derived", "true"
		   });
		addAnnotation
		  (getRoleTypeAttr_RoleTypeId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getRoleTypeAttr_AttrName(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getVendor_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWebSiteRole_PartyId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
		addAnnotation
		  (getWebSiteRole_FromDate(),
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
		  (partyEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "AcctgTransEntry",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "AcctgTrans",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "frame", "EmploymentApp",
			   "route", "applyingPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(3),
		   source,
		   new String[] {
			   "frame", "EmploymentApp",
			   "route", "approverPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(4),
		   source,
		   new String[] {
			   "frame", "OrderItemShipGroup",
			   "route", "carrierPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(5),
		   source,
		   new String[] {
			   "frame", "CarrierShipmentBoxType",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(6),
		   source,
		   new String[] {
			   "frame", "ShipmentRouteSegment",
			   "route", "carrierPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(7),
		   source,
		   new String[] {
			   "frame", "Timesheet",
			   "route", "clientPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(8),
		   source,
		   new String[] {
			   "frame", "ContentRevision",
			   "route", "committedByPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(9),
		   source,
		   new String[] {
			   "frame", "ContentApproval",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(10),
		   source,
		   new String[] {
			   "frame", "CostComponent",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(11),
		   source,
		   new String[] {
			   "frame", "CustRequestType",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(12),
		   source,
		   new String[] {
			   "frame", "EmplPosition",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(13),
		   source,
		   new String[] {
			   "frame", "FinAccountTrans",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(14),
		   source,
		   new String[] {
			   "frame", "FixedAsset",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(15),
		   source,
		   new String[] {
			   "frame", "Agreement",
			   "route", "partyIdFrom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(16),
		   source,
		   new String[] {
			   "frame", "CommunicationEvent",
			   "route", "partyIdFrom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(17),
		   source,
		   new String[] {
			   "frame", "CustRequest",
			   "route", "fromPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(18),
		   source,
		   new String[] {
			   "frame", "Invoice",
			   "route", "partyIdFrom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(19),
		   source,
		   new String[] {
			   "frame", "Payment",
			   "route", "partyIdFrom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(20),
		   source,
		   new String[] {
			   "frame", "Shipment",
			   "route", "partyIdFrom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(21),
		   source,
		   new String[] {
			   "frame", "GiftCardFulfillment",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(22),
		   source,
		   new String[] {
			   "frame", "GlAccountOrganization",
			   "route", "organizationPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(23),
		   source,
		   new String[] {
			   "frame", "GlJournal",
			   "route", "organizationPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(24),
		   source,
		   new String[] {
			   "frame", "GlReconciliation",
			   "route", "organizationPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(25),
		   source,
		   new String[] {
			   "frame", "FixedAssetRegistration",
			   "route", "govAgencyPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(26),
		   source,
		   new String[] {
			   "frame", "SalesForecastHistory",
			   "route", "internalPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(27),
		   source,
		   new String[] {
			   "frame", "SalesForecast",
			   "route", "internalPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(28),
		   source,
		   new String[] {
			   "frame", "JobInterview",
			   "route", "jobIntervieweePartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(29),
		   source,
		   new String[] {
			   "frame", "JobInterview",
			   "route", "jobInterviewerPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(30),
		   source,
		   new String[] {
			   "frame", "InventoryItem",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(31),
		   source,
		   new String[] {
			   "frame", "Invoice",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(32),
		   source,
		   new String[] {
			   "frame", "NoteData",
			   "route", "noteParty"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(33),
		   source,
		   new String[] {
			   "frame", "CustomTimePeriod",
			   "route", "organizationPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(34),
		   source,
		   new String[] {
			   "frame", "FinAccountTypeGlAccount",
			   "route", "organizationPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(35),
		   source,
		   new String[] {
			   "frame", "FinAccount",
			   "route", "organizationPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(36),
		   source,
		   new String[] {
			   "frame", "GlAccountTypeDefault",
			   "route", "organizationPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(37),
		   source,
		   new String[] {
			   "frame", "InvoiceItemTypeGlAccount",
			   "route", "organizationPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(38),
		   source,
		   new String[] {
			   "frame", "PaymentMethodTypeGlAccount",
			   "route", "organizationPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(39),
		   source,
		   new String[] {
			   "frame", "SalesForecastHistory",
			   "route", "organizationPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(40),
		   source,
		   new String[] {
			   "frame", "SalesForecast",
			   "route", "organizationPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(41),
		   source,
		   new String[] {
			   "frame", "VarianceReasonGlAccount",
			   "route", "organizationPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(42),
		   source,
		   new String[] {
			   "frame", "Subscription",
			   "route", "originatedFromPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(43),
		   source,
		   new String[] {
			   "frame", "InvoiceItem",
			   "route", "overrideOrgPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(44),
		   source,
		   new String[] {
			   "frame", "ContactList",
			   "route", "ownerPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(45),
		   source,
		   new String[] {
			   "frame", "Facility",
			   "route", "ownerPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(46),
		   source,
		   new String[] {
			   "frame", "FinAccount",
			   "route", "ownerPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(47),
		   source,
		   new String[] {
			   "frame", "InventoryItem",
			   "route", "ownerPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(48),
		   source,
		   new String[] {
			   "frame", "PartyInvitation",
			   "route", "partyIdFrom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(49),
		   source,
		   new String[] {
			   "frame", "PartyPrefDocTypeTpl",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(50),
		   source,
		   new String[] {
			   "frame", "PartyResume",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(51),
		   source,
		   new String[] {
			   "frame", "PaymentGlAccountTypeMap",
			   "route", "organizationPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(52),
		   source,
		   new String[] {
			   "frame", "PaymentMethod",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(53),
		   source,
		   new String[] {
			   "frame", "FinAccountTrans",
			   "route", "performedByPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(54),
		   source,
		   new String[] {
			   "frame", "ProductPromoCodeParty",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(55),
		   source,
		   new String[] {
			   "frame", "ProductPromoUse",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(56),
		   source,
		   new String[] {
			   "frame", "ProductPromo",
			   "route", "overrideOrgPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(57),
		   source,
		   new String[] {
			   "frame", "ProductStoreShipmentMeth",
			   "route", "companyPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(58),
		   source,
		   new String[] {
			   "frame", "ProductStore",
			   "route", "payToPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(59),
		   source,
		   new String[] {
			   "frame", "Quote",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(60),
		   source,
		   new String[] {
			   "frame", "EmploymentApp",
			   "route", "referredByPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(61),
		   source,
		   new String[] {
			   "frame", "ReorderGuideline",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(62),
		   source,
		   new String[] {
			   "frame", "ReturnHeader",
			   "route", "fromPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(63),
		   source,
		   new String[] {
			   "frame", "ShipmentCostEstimate",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(64),
		   source,
		   new String[] {
			   "frame", "ShoppingList",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(65),
		   source,
		   new String[] {
			   "frame", "Subscription",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(66),
		   source,
		   new String[] {
			   "frame", "OrderItemShipGroup",
			   "route", "supplierPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(67),
		   source,
		   new String[] {
			   "frame", "SurveyResponse",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(68),
		   source,
		   new String[] {
			   "frame", "TaxAuthority",
			   "route", "taxAuthPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(69),
		   source,
		   new String[] {
			   "frame", "InvoiceItem",
			   "route", "taxAuthPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(70),
		   source,
		   new String[] {
			   "frame", "TimeEntry",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(71),
		   source,
		   new String[] {
			   "frame", "Timesheet",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(72),
		   source,
		   new String[] {
			   "frame", "Agreement",
			   "route", "partyIdTo"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(73),
		   source,
		   new String[] {
			   "frame", "CommunicationEvent",
			   "route", "partyIdTo"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(74),
		   source,
		   new String[] {
			   "frame", "PartyInvitationGroupAssoc",
			   "route", "partyIdTo"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(75),
		   source,
		   new String[] {
			   "frame", "Payment",
			   "route", "partyIdTo"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(76),
		   source,
		   new String[] {
			   "frame", "ReturnHeader",
			   "route", "toPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(77),
		   source,
		   new String[] {
			   "frame", "Shipment",
			   "route", "partyIdTo"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(78),
		   source,
		   new String[] {
			   "frame", "UserLoginHistory",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(79),
		   source,
		   new String[] {
			   "frame", "UserLogin",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(80),
		   source,
		   new String[] {
			   "frame", "OrderItemShipGroup",
			   "route", "vendorPartyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyEClass.getEOperations().get(81),
		   source,
		   new String[] {
			   "frame", "WorkEffortEventReminder",
			   "route", "partyId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getParty_PartyAttributes(),
		   source,
		   new String[] {
			   "frame", "PartyAttribute"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getParty_PartyIdentifications(),
		   source,
		   new String[] {
			   "frame", "PartyIdentification"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getParty_PartyNameHistories(),
		   source,
		   new String[] {
			   "frame", "PartyNameHistory"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getParty_PartyNotes(),
		   source,
		   new String[] {
			   "frame", "PartyNote"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getParty_PartyProfileDefaults(),
		   source,
		   new String[] {
			   "frame", "PartyProfileDefault"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getParty_PartyRoles(),
		   source,
		   new String[] {
			   "frame", "PartyRole"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getParty_PartySkills(),
		   source,
		   new String[] {
			   "frame", "PartySkill"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getParty_SupplierProductFeatures(),
		   source,
		   new String[] {
			   "frame", "SupplierProductFeature"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyClassificationGroupEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "PartyClassificationGroup",
			   "route", "parentGroupId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyClassificationGroupEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "SegmentGroupClassification",
			   "route", "partyClassificationGroupId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyClassificationTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "PartyClassificationType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyClassificationTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "PartyClassificationGroup",
			   "route", "partyClassificationTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyContentTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "PartyContentType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyIdentificationTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "PartyIdentificationType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyIdentificationTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "PartyIdentification",
			   "route", "partyIdentificationTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getPartyInvitation_PartyInvitationGroupAssocs(),
		   source,
		   new String[] {
			   "frame", "PartyInvitationGroupAssoc"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getPartyInvitation_PartyInvitationRoleAssocs(),
		   source,
		   new String[] {
			   "frame", "PartyInvitationRoleAssoc"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyRelationshipTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "PartyRelationshipType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "PartyType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (partyTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "Party",
			   "route", "partyTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getPartyType_PartyTypeAttrs(),
		   source,
		   new String[] {
			   "frame", "PartyTypeAttr"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(0),
		   source,
		   new String[] {
			   "frame", "AcctgTransEntry",
			   "route", "roleTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(1),
		   source,
		   new String[] {
			   "frame", "AcctgTrans",
			   "route", "roleTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(2),
		   source,
		   new String[] {
			   "frame", "RoleType",
			   "route", "parentTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(3),
		   source,
		   new String[] {
			   "frame", "ContentApproval",
			   "route", "roleTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(4),
		   source,
		   new String[] {
			   "frame", "FixedAsset",
			   "route", "roleTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(5),
		   source,
		   new String[] {
			   "frame", "Agreement",
			   "route", "roleTypeIdFrom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(6),
		   source,
		   new String[] {
			   "frame", "CommunicationEvent",
			   "route", "roleTypeIdFrom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(7),
		   source,
		   new String[] {
			   "frame", "GlAccountOrganization",
			   "route", "roleTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(8),
		   source,
		   new String[] {
			   "frame", "Invoice",
			   "route", "roleTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(9),
		   source,
		   new String[] {
			   "frame", "Subscription",
			   "route", "originatedFromRoleTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(10),
		   source,
		   new String[] {
			   "frame", "PartyInvitationRoleAssoc",
			   "route", "roleTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(11),
		   source,
		   new String[] {
			   "frame", "PartyRole",
			   "route", "roleTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(12),
		   source,
		   new String[] {
			   "frame", "ShipmentCostEstimate",
			   "route", "roleTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(13),
		   source,
		   new String[] {
			   "frame", "Subscription",
			   "route", "roleTypeId"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(14),
		   source,
		   new String[] {
			   "frame", "Agreement",
			   "route", "roleTypeIdTo"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(15),
		   source,
		   new String[] {
			   "frame", "CommunicationEvent",
			   "route", "roleTypeIdTo"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(16),
		   source,
		   new String[] {
			   "frame", "Payment",
			   "route", "roleTypeIdTo"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(17),
		   source,
		   new String[] {
			   "frame", "PartyRelationshipType",
			   "route", "roleTypeIdValidFrom"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (roleTypeEClass.getEOperations().get(18),
		   source,
		   new String[] {
			   "frame", "PartyRelationshipType",
			   "route", "roleTypeIdValidTo"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getRoleType_RoleTypeAttrs(),
		   source,
		   new String[] {
			   "frame", "RoleTypeAttr"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
		addAnnotation
		  (getRoleType_ValidContactMechRoles(),
		   source,
		   new String[] {
			   "frame", "ValidContactMechRole"
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
		  (partyEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (partyClassificationGroupEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (partyClassificationTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (partyContentTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (partyGroupEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (partyIdentificationTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (partyRelationshipTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (partyTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (partyTypeAttrEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (personEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (priorityTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (roleTypeEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
		addAnnotation
		  (roleTypeAttrEClass,
		   source,
		   new String[] {
			   "formula", "description"
		   });
	}

} //PartyPackageImpl