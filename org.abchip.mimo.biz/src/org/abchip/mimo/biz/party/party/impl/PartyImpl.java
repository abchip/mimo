/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.common.datasource.DataSource;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.PartyPackage;
import org.abchip.mimo.biz.party.party.PartyType;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyImpl#getExternalId <em>External Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyImpl#isIsUnread <em>Is Unread</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyImpl#getPartyTypeId <em>Party Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyImpl#getPreferredCurrencyUomId <em>Preferred Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyImpl#getDataSourceId <em>Data Source Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyImpl#getPartyAttributes <em>Party Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyImpl#getPartyIdentifications <em>Party Identifications</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyImpl#getPartyNameHistories <em>Party Name Histories</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyImpl#getPartyNotes <em>Party Notes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyImpl#getPartyProfileDefaults <em>Party Profile Defaults</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyImpl#getPartyRoles <em>Party Roles</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyImpl#getPartySkills <em>Party Skills</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyImpl#getSupplierProductFeatures <em>Supplier Product Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyImpl extends BizEntityTypedImpl<PartyType> implements Party {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.PARTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getCreatedByUserLogin() {
		return (UserLogin)eGet(PartyPackage.Literals.PARTY__CREATED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(UserLogin newCreatedByUserLogin) {
		eSet(PartyPackage.Literals.PARTY__CREATED_BY_USER_LOGIN, newCreatedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return (Date)eGet(PartyPackage.Literals.PARTY__CREATED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		eSet(PartyPackage.Literals.PARTY__CREATED_DATE, newCreatedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSource getDataSourceId() {
		return (DataSource)eGet(PartyPackage.Literals.PARTY__DATA_SOURCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataSourceId(DataSource newDataSourceId) {
		eSet(PartyPackage.Literals.PARTY__DATA_SOURCE_ID, newDataSourceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(PartyPackage.Literals.PARTY__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(PartyPackage.Literals.PARTY__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalId() {
		return (String)eGet(PartyPackage.Literals.PARTY__EXTERNAL_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalId(String newExternalId) {
		eSet(PartyPackage.Literals.PARTY__EXTERNAL_ID, newExternalId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsUnread() {
		return (Boolean)eGet(PartyPackage.Literals.PARTY__IS_UNREAD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsUnread(boolean newIsUnread) {
		eSet(PartyPackage.Literals.PARTY__IS_UNREAD, newIsUnread);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getLastModifiedByUserLogin() {
		return (UserLogin)eGet(PartyPackage.Literals.PARTY__LAST_MODIFIED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(UserLogin newLastModifiedByUserLogin) {
		eSet(PartyPackage.Literals.PARTY__LAST_MODIFIED_BY_USER_LOGIN, newLastModifiedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModifiedDate() {
		return (Date)eGet(PartyPackage.Literals.PARTY__LAST_MODIFIED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(Date newLastModifiedDate) {
		eSet(PartyPackage.Literals.PARTY__LAST_MODIFIED_DATE, newLastModifiedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getPreferredCurrencyUomId() {
		return (Uom)eGet(PartyPackage.Literals.PARTY__PREFERRED_CURRENCY_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreferredCurrencyUomId(Uom newPreferredCurrencyUomId) {
		eSet(PartyPackage.Literals.PARTY__PREFERRED_CURRENCY_UOM_ID, newPreferredCurrencyUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		return (StatusItem)eGet(PartyPackage.Literals.PARTY__STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		eSet(PartyPackage.Literals.PARTY__STATUS_ID, newStatusId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getPartyAttributes() {
		return (List<String>)eGet(PartyPackage.Literals.PARTY__PARTY_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getPartyIdentifications() {
		return (List<String>)eGet(PartyPackage.Literals.PARTY__PARTY_IDENTIFICATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getPartyNameHistories() {
		return (List<String>)eGet(PartyPackage.Literals.PARTY__PARTY_NAME_HISTORIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getPartyNotes() {
		return (List<String>)eGet(PartyPackage.Literals.PARTY__PARTY_NOTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getPartyProfileDefaults() {
		return (List<String>)eGet(PartyPackage.Literals.PARTY__PARTY_PROFILE_DEFAULTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getPartyRoles() {
		return (List<String>)eGet(PartyPackage.Literals.PARTY__PARTY_ROLES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getPartySkills() {
		return (List<String>)eGet(PartyPackage.Literals.PARTY__PARTY_SKILLS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getSupplierProductFeatures() {
		return (List<String>)eGet(PartyPackage.Literals.PARTY__SUPPLIER_PRODUCT_FEATURES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> acctgTransEntries() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> acctgTranss() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> applyingEmploymentApps() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> approverEmploymentApps() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> carrierOrderItemShipGroups() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> carrierShipmentBoxTypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> carrierShipmentRouteSegments() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> clientTimesheets() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> committedByContentRevisions() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> contentApprovals() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> costComponents() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> custRequestTypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> emplPositions() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> finAccountTranss() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> fixedAssets() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> fromAgreements() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> fromCommunicationEvents() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> fromCustRequests() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> fromInvoices() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> fromPayments() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> fromShipments() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> giftCardFulfillments() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> glAccountOrganizations() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> glJournals() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> glReconciliations() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> govAgencyFixedAssetRegistrations() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> internalSalesForecastHistories() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> internalSalesForecasts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> intervieweeJobInterviews() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> interviewerJobInterviews() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> inventoryItems() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> invoices() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> noteNoteDatas() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> organizationCustomTimePeriods() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> organizationFinAccountTypeGlAccounts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> organizationFinAccounts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> organizationGlAccountTypeDefaults() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> organizationInvoiceItemTypeGlAccounts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> organizationPaymentMethodTypeGlAccounts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> organizationSalesForecastHistories() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> organizationSalesForecasts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> organizationVarianceReasonGlAccounts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> originatedFromSubscriptions() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> overrideOrgInvoiceItems() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> ownerContactLists() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> ownerFacilities() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> ownerFinAccounts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> ownerInventoryItems() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> partyInvitations() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> partyPrefDocTypeTpls() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> partyResumes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> paymentGlAccountTypeMaps() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> paymentMethods() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> performedByFinAccountTranss() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> productPromoCodeParties() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> productPromoUses() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> productPromos() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> productStoreShipmentMeths() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> productStores() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> quotes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> referredByEmploymentApps() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> reorderGuidelines() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> returnHeaders() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> shipmentCostEstimates() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> shoppingLists() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> subscriptions() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> supplierOrderItemShipGroups() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> surveyResponses() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> taxAuthTaxAuthorities() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> taxAuthorityInvoiceItems() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> timeEntries() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> timesheets() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> toAgreements() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> toCommunicationEvents() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> toPartyInvitationGroupAssocs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> toPayments() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> toReturnHeaders() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> toShipments() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> userLoginHistories() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> userLogins() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> vendorOrderItemShipGroups() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> workEffortEventReminders() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PartyPackage.PARTY___ACCTG_TRANS_ENTRIES:
				return acctgTransEntries();
			case PartyPackage.PARTY___ACCTG_TRANSS:
				return acctgTranss();
			case PartyPackage.PARTY___APPLYING_EMPLOYMENT_APPS:
				return applyingEmploymentApps();
			case PartyPackage.PARTY___APPROVER_EMPLOYMENT_APPS:
				return approverEmploymentApps();
			case PartyPackage.PARTY___CARRIER_ORDER_ITEM_SHIP_GROUPS:
				return carrierOrderItemShipGroups();
			case PartyPackage.PARTY___CARRIER_SHIPMENT_BOX_TYPES:
				return carrierShipmentBoxTypes();
			case PartyPackage.PARTY___CARRIER_SHIPMENT_ROUTE_SEGMENTS:
				return carrierShipmentRouteSegments();
			case PartyPackage.PARTY___CLIENT_TIMESHEETS:
				return clientTimesheets();
			case PartyPackage.PARTY___COMMITTED_BY_CONTENT_REVISIONS:
				return committedByContentRevisions();
			case PartyPackage.PARTY___CONTENT_APPROVALS:
				return contentApprovals();
			case PartyPackage.PARTY___COST_COMPONENTS:
				return costComponents();
			case PartyPackage.PARTY___CUST_REQUEST_TYPES:
				return custRequestTypes();
			case PartyPackage.PARTY___EMPL_POSITIONS:
				return emplPositions();
			case PartyPackage.PARTY___FIN_ACCOUNT_TRANSS:
				return finAccountTranss();
			case PartyPackage.PARTY___FIXED_ASSETS:
				return fixedAssets();
			case PartyPackage.PARTY___FROM_AGREEMENTS:
				return fromAgreements();
			case PartyPackage.PARTY___FROM_COMMUNICATION_EVENTS:
				return fromCommunicationEvents();
			case PartyPackage.PARTY___FROM_CUST_REQUESTS:
				return fromCustRequests();
			case PartyPackage.PARTY___FROM_INVOICES:
				return fromInvoices();
			case PartyPackage.PARTY___FROM_PAYMENTS:
				return fromPayments();
			case PartyPackage.PARTY___FROM_SHIPMENTS:
				return fromShipments();
			case PartyPackage.PARTY___GIFT_CARD_FULFILLMENTS:
				return giftCardFulfillments();
			case PartyPackage.PARTY___GL_ACCOUNT_ORGANIZATIONS:
				return glAccountOrganizations();
			case PartyPackage.PARTY___GL_JOURNALS:
				return glJournals();
			case PartyPackage.PARTY___GL_RECONCILIATIONS:
				return glReconciliations();
			case PartyPackage.PARTY___GOV_AGENCY_FIXED_ASSET_REGISTRATIONS:
				return govAgencyFixedAssetRegistrations();
			case PartyPackage.PARTY___INTERNAL_SALES_FORECAST_HISTORIES:
				return internalSalesForecastHistories();
			case PartyPackage.PARTY___INTERNAL_SALES_FORECASTS:
				return internalSalesForecasts();
			case PartyPackage.PARTY___INTERVIEWEE_JOB_INTERVIEWS:
				return intervieweeJobInterviews();
			case PartyPackage.PARTY___INTERVIEWER_JOB_INTERVIEWS:
				return interviewerJobInterviews();
			case PartyPackage.PARTY___INVENTORY_ITEMS:
				return inventoryItems();
			case PartyPackage.PARTY___INVOICES:
				return invoices();
			case PartyPackage.PARTY___NOTE_NOTE_DATAS:
				return noteNoteDatas();
			case PartyPackage.PARTY___ORGANIZATION_CUSTOM_TIME_PERIODS:
				return organizationCustomTimePeriods();
			case PartyPackage.PARTY___ORGANIZATION_FIN_ACCOUNT_TYPE_GL_ACCOUNTS:
				return organizationFinAccountTypeGlAccounts();
			case PartyPackage.PARTY___ORGANIZATION_FIN_ACCOUNTS:
				return organizationFinAccounts();
			case PartyPackage.PARTY___ORGANIZATION_GL_ACCOUNT_TYPE_DEFAULTS:
				return organizationGlAccountTypeDefaults();
			case PartyPackage.PARTY___ORGANIZATION_INVOICE_ITEM_TYPE_GL_ACCOUNTS:
				return organizationInvoiceItemTypeGlAccounts();
			case PartyPackage.PARTY___ORGANIZATION_PAYMENT_METHOD_TYPE_GL_ACCOUNTS:
				return organizationPaymentMethodTypeGlAccounts();
			case PartyPackage.PARTY___ORGANIZATION_SALES_FORECAST_HISTORIES:
				return organizationSalesForecastHistories();
			case PartyPackage.PARTY___ORGANIZATION_SALES_FORECASTS:
				return organizationSalesForecasts();
			case PartyPackage.PARTY___ORGANIZATION_VARIANCE_REASON_GL_ACCOUNTS:
				return organizationVarianceReasonGlAccounts();
			case PartyPackage.PARTY___ORIGINATED_FROM_SUBSCRIPTIONS:
				return originatedFromSubscriptions();
			case PartyPackage.PARTY___OVERRIDE_ORG_INVOICE_ITEMS:
				return overrideOrgInvoiceItems();
			case PartyPackage.PARTY___OWNER_CONTACT_LISTS:
				return ownerContactLists();
			case PartyPackage.PARTY___OWNER_FACILITIES:
				return ownerFacilities();
			case PartyPackage.PARTY___OWNER_FIN_ACCOUNTS:
				return ownerFinAccounts();
			case PartyPackage.PARTY___OWNER_INVENTORY_ITEMS:
				return ownerInventoryItems();
			case PartyPackage.PARTY___PARTY_INVITATIONS:
				return partyInvitations();
			case PartyPackage.PARTY___PARTY_PREF_DOC_TYPE_TPLS:
				return partyPrefDocTypeTpls();
			case PartyPackage.PARTY___PARTY_RESUMES:
				return partyResumes();
			case PartyPackage.PARTY___PAYMENT_GL_ACCOUNT_TYPE_MAPS:
				return paymentGlAccountTypeMaps();
			case PartyPackage.PARTY___PAYMENT_METHODS:
				return paymentMethods();
			case PartyPackage.PARTY___PERFORMED_BY_FIN_ACCOUNT_TRANSS:
				return performedByFinAccountTranss();
			case PartyPackage.PARTY___PRODUCT_PROMO_CODE_PARTIES:
				return productPromoCodeParties();
			case PartyPackage.PARTY___PRODUCT_PROMO_USES:
				return productPromoUses();
			case PartyPackage.PARTY___PRODUCT_PROMOS:
				return productPromos();
			case PartyPackage.PARTY___PRODUCT_STORE_SHIPMENT_METHS:
				return productStoreShipmentMeths();
			case PartyPackage.PARTY___PRODUCT_STORES:
				return productStores();
			case PartyPackage.PARTY___QUOTES:
				return quotes();
			case PartyPackage.PARTY___REFERRED_BY_EMPLOYMENT_APPS:
				return referredByEmploymentApps();
			case PartyPackage.PARTY___REORDER_GUIDELINES:
				return reorderGuidelines();
			case PartyPackage.PARTY___RETURN_HEADERS:
				return returnHeaders();
			case PartyPackage.PARTY___SHIPMENT_COST_ESTIMATES:
				return shipmentCostEstimates();
			case PartyPackage.PARTY___SHOPPING_LISTS:
				return shoppingLists();
			case PartyPackage.PARTY___SUBSCRIPTIONS:
				return subscriptions();
			case PartyPackage.PARTY___SUPPLIER_ORDER_ITEM_SHIP_GROUPS:
				return supplierOrderItemShipGroups();
			case PartyPackage.PARTY___SURVEY_RESPONSES:
				return surveyResponses();
			case PartyPackage.PARTY___TAX_AUTH_TAX_AUTHORITIES:
				return taxAuthTaxAuthorities();
			case PartyPackage.PARTY___TAX_AUTHORITY_INVOICE_ITEMS:
				return taxAuthorityInvoiceItems();
			case PartyPackage.PARTY___TIME_ENTRIES:
				return timeEntries();
			case PartyPackage.PARTY___TIMESHEETS:
				return timesheets();
			case PartyPackage.PARTY___TO_AGREEMENTS:
				return toAgreements();
			case PartyPackage.PARTY___TO_COMMUNICATION_EVENTS:
				return toCommunicationEvents();
			case PartyPackage.PARTY___TO_PARTY_INVITATION_GROUP_ASSOCS:
				return toPartyInvitationGroupAssocs();
			case PartyPackage.PARTY___TO_PAYMENTS:
				return toPayments();
			case PartyPackage.PARTY___TO_RETURN_HEADERS:
				return toReturnHeaders();
			case PartyPackage.PARTY___TO_SHIPMENTS:
				return toShipments();
			case PartyPackage.PARTY___USER_LOGIN_HISTORIES:
				return userLoginHistories();
			case PartyPackage.PARTY___USER_LOGINS:
				return userLogins();
			case PartyPackage.PARTY___VENDOR_ORDER_ITEM_SHIP_GROUPS:
				return vendorOrderItemShipGroups();
			case PartyPackage.PARTY___WORK_EFFORT_EVENT_REMINDERS:
				return workEffortEventReminders();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyType getPartyTypeId() {
		return (PartyType)eGet(PartyPackage.Literals.PARTY__PARTY_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyTypeId(PartyType newPartyTypeId) {
		eSet(PartyPackage.Literals.PARTY__PARTY_TYPE_ID, newPartyTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return (String)eGet(PartyPackage.Literals.PARTY__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		eSet(PartyPackage.Literals.PARTY__PARTY_ID, newPartyId);
	}

} //PartyImpl
