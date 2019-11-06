/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party.impl;

import java.util.Collection;
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;

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
	 * The default value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected String partyId = PARTY_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected Date createdDate = CREATED_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;
	/**
	 * The default value of the '{@link #getExternalId() <em>External Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalId()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getExternalId() <em>External Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalId()
	 * @generated
	 * @ordered
	 */
	protected String externalId = EXTERNAL_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #isIsUnread() <em>Is Unread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnread()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNREAD_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsUnread() <em>Is Unread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnread()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnread = IS_UNREAD_EDEFAULT;
	/**
	 * The default value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_MODIFIED_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastModifiedDate = LAST_MODIFIED_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartyTypeId() <em>Party Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyTypeId()
	 * @generated
	 * @ordered
	 */
	protected PartyType partyTypeId;
	/**
	 * The cached value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected UserLogin createdByUserLogin;
	/**
	 * The cached value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected UserLogin lastModifiedByUserLogin;
	/**
	 * The cached value of the '{@link #getPreferredCurrencyUomId() <em>Preferred Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom preferredCurrencyUomId;
	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;
	/**
	 * The cached value of the '{@link #getDataSourceId() <em>Data Source Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceId()
	 * @generated
	 * @ordered
	 */
	protected DataSource dataSourceId;
	/**
	 * The cached value of the '{@link #getPartyAttributes() <em>Party Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> partyAttributes;
	/**
	 * The cached value of the '{@link #getPartyIdentifications() <em>Party Identifications</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdentifications()
	 * @generated
	 * @ordered
	 */
	protected EList<String> partyIdentifications;
	/**
	 * The cached value of the '{@link #getPartyNameHistories() <em>Party Name Histories</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyNameHistories()
	 * @generated
	 * @ordered
	 */
	protected EList<String> partyNameHistories;
	/**
	 * The cached value of the '{@link #getPartyNotes() <em>Party Notes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> partyNotes;
	/**
	 * The cached value of the '{@link #getPartyProfileDefaults() <em>Party Profile Defaults</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyProfileDefaults()
	 * @generated
	 * @ordered
	 */
	protected EList<String> partyProfileDefaults;
	/**
	 * The cached value of the '{@link #getPartyRoles() <em>Party Roles</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<String> partyRoles;
	/**
	 * The cached value of the '{@link #getPartySkills() <em>Party Skills</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartySkills()
	 * @generated
	 * @ordered
	 */
	protected EList<String> partySkills;
	/**
	 * The cached value of the '{@link #getSupplierProductFeatures() <em>Supplier Product Features</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierProductFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<String> supplierProductFeatures;
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
		if (createdByUserLogin != null && ((EObject)createdByUserLogin).eIsProxy()) {
			InternalEObject oldCreatedByUserLogin = (InternalEObject)createdByUserLogin;
			createdByUserLogin = (UserLogin)eResolveProxy(oldCreatedByUserLogin);
			if (createdByUserLogin != oldCreatedByUserLogin) {
			}
		}
		return createdByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetCreatedByUserLogin() {
		return createdByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(UserLogin newCreatedByUserLogin) {
		createdByUserLogin = newCreatedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		createdDate = newCreatedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSource getDataSourceId() {
		if (dataSourceId != null && ((EObject)dataSourceId).eIsProxy()) {
			InternalEObject oldDataSourceId = (InternalEObject)dataSourceId;
			dataSourceId = (DataSource)eResolveProxy(oldDataSourceId);
			if (dataSourceId != oldDataSourceId) {
			}
		}
		return dataSourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource basicGetDataSourceId() {
		return dataSourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataSourceId(DataSource newDataSourceId) {
		dataSourceId = newDataSourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalId() {
		return externalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalId(String newExternalId) {
		externalId = newExternalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsUnread() {
		return isUnread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsUnread(boolean newIsUnread) {
		isUnread = newIsUnread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getLastModifiedByUserLogin() {
		if (lastModifiedByUserLogin != null && ((EObject)lastModifiedByUserLogin).eIsProxy()) {
			InternalEObject oldLastModifiedByUserLogin = (InternalEObject)lastModifiedByUserLogin;
			lastModifiedByUserLogin = (UserLogin)eResolveProxy(oldLastModifiedByUserLogin);
			if (lastModifiedByUserLogin != oldLastModifiedByUserLogin) {
			}
		}
		return lastModifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetLastModifiedByUserLogin() {
		return lastModifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(UserLogin newLastModifiedByUserLogin) {
		lastModifiedByUserLogin = newLastModifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(Date newLastModifiedDate) {
		lastModifiedDate = newLastModifiedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getPreferredCurrencyUomId() {
		if (preferredCurrencyUomId != null && ((EObject)preferredCurrencyUomId).eIsProxy()) {
			InternalEObject oldPreferredCurrencyUomId = (InternalEObject)preferredCurrencyUomId;
			preferredCurrencyUomId = (Uom)eResolveProxy(oldPreferredCurrencyUomId);
			if (preferredCurrencyUomId != oldPreferredCurrencyUomId) {
			}
		}
		return preferredCurrencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetPreferredCurrencyUomId() {
		return preferredCurrencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreferredCurrencyUomId(Uom newPreferredCurrencyUomId) {
		preferredCurrencyUomId = newPreferredCurrencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		statusId = newStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getPartyAttributes() {
		if (partyAttributes == null) {
			partyAttributes = new BasicInternalEList<String>(String.class);
		}
		return partyAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getPartyIdentifications() {
		if (partyIdentifications == null) {
			partyIdentifications = new BasicInternalEList<String>(String.class);
		}
		return partyIdentifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getPartyNameHistories() {
		if (partyNameHistories == null) {
			partyNameHistories = new BasicInternalEList<String>(String.class);
		}
		return partyNameHistories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getPartyNotes() {
		if (partyNotes == null) {
			partyNotes = new BasicInternalEList<String>(String.class);
		}
		return partyNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getPartyProfileDefaults() {
		if (partyProfileDefaults == null) {
			partyProfileDefaults = new BasicInternalEList<String>(String.class);
		}
		return partyProfileDefaults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getPartyRoles() {
		if (partyRoles == null) {
			partyRoles = new BasicInternalEList<String>(String.class);
		}
		return partyRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getPartySkills() {
		if (partySkills == null) {
			partySkills = new BasicInternalEList<String>(String.class);
		}
		return partySkills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getSupplierProductFeatures() {
		if (supplierProductFeatures == null) {
			supplierProductFeatures = new BasicInternalEList<String>(String.class);
		}
		return supplierProductFeatures;
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
	public PartyType getPartyTypeId() {
		if (partyTypeId != null && ((EObject)partyTypeId).eIsProxy()) {
			InternalEObject oldPartyTypeId = (InternalEObject)partyTypeId;
			partyTypeId = (PartyType)eResolveProxy(oldPartyTypeId);
			if (partyTypeId != oldPartyTypeId) {
			}
		}
		return partyTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartyType basicGetPartyTypeId() {
		return partyTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyTypeId(PartyType newPartyTypeId) {
		partyTypeId = newPartyTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		partyId = newPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartyPackage.PARTY__PARTY_ID:
				return getPartyId();
			case PartyPackage.PARTY__CREATED_DATE:
				return getCreatedDate();
			case PartyPackage.PARTY__DESCRIPTION:
				return getDescription();
			case PartyPackage.PARTY__EXTERNAL_ID:
				return getExternalId();
			case PartyPackage.PARTY__IS_UNREAD:
				return isIsUnread();
			case PartyPackage.PARTY__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case PartyPackage.PARTY__PARTY_TYPE_ID:
				if (resolve) return getPartyTypeId();
				return basicGetPartyTypeId();
			case PartyPackage.PARTY__CREATED_BY_USER_LOGIN:
				if (resolve) return getCreatedByUserLogin();
				return basicGetCreatedByUserLogin();
			case PartyPackage.PARTY__LAST_MODIFIED_BY_USER_LOGIN:
				if (resolve) return getLastModifiedByUserLogin();
				return basicGetLastModifiedByUserLogin();
			case PartyPackage.PARTY__PREFERRED_CURRENCY_UOM_ID:
				if (resolve) return getPreferredCurrencyUomId();
				return basicGetPreferredCurrencyUomId();
			case PartyPackage.PARTY__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case PartyPackage.PARTY__DATA_SOURCE_ID:
				if (resolve) return getDataSourceId();
				return basicGetDataSourceId();
			case PartyPackage.PARTY__PARTY_ATTRIBUTES:
				return getPartyAttributes();
			case PartyPackage.PARTY__PARTY_IDENTIFICATIONS:
				return getPartyIdentifications();
			case PartyPackage.PARTY__PARTY_NAME_HISTORIES:
				return getPartyNameHistories();
			case PartyPackage.PARTY__PARTY_NOTES:
				return getPartyNotes();
			case PartyPackage.PARTY__PARTY_PROFILE_DEFAULTS:
				return getPartyProfileDefaults();
			case PartyPackage.PARTY__PARTY_ROLES:
				return getPartyRoles();
			case PartyPackage.PARTY__PARTY_SKILLS:
				return getPartySkills();
			case PartyPackage.PARTY__SUPPLIER_PRODUCT_FEATURES:
				return getSupplierProductFeatures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PartyPackage.PARTY__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case PartyPackage.PARTY__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case PartyPackage.PARTY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PartyPackage.PARTY__EXTERNAL_ID:
				setExternalId((String)newValue);
				return;
			case PartyPackage.PARTY__IS_UNREAD:
				setIsUnread((Boolean)newValue);
				return;
			case PartyPackage.PARTY__LAST_MODIFIED_DATE:
				setLastModifiedDate((Date)newValue);
				return;
			case PartyPackage.PARTY__PARTY_TYPE_ID:
				setPartyTypeId((PartyType)newValue);
				return;
			case PartyPackage.PARTY__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((UserLogin)newValue);
				return;
			case PartyPackage.PARTY__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((UserLogin)newValue);
				return;
			case PartyPackage.PARTY__PREFERRED_CURRENCY_UOM_ID:
				setPreferredCurrencyUomId((Uom)newValue);
				return;
			case PartyPackage.PARTY__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case PartyPackage.PARTY__DATA_SOURCE_ID:
				setDataSourceId((DataSource)newValue);
				return;
			case PartyPackage.PARTY__PARTY_ATTRIBUTES:
				getPartyAttributes().clear();
				getPartyAttributes().addAll((Collection<? extends String>)newValue);
				return;
			case PartyPackage.PARTY__PARTY_IDENTIFICATIONS:
				getPartyIdentifications().clear();
				getPartyIdentifications().addAll((Collection<? extends String>)newValue);
				return;
			case PartyPackage.PARTY__PARTY_NAME_HISTORIES:
				getPartyNameHistories().clear();
				getPartyNameHistories().addAll((Collection<? extends String>)newValue);
				return;
			case PartyPackage.PARTY__PARTY_NOTES:
				getPartyNotes().clear();
				getPartyNotes().addAll((Collection<? extends String>)newValue);
				return;
			case PartyPackage.PARTY__PARTY_PROFILE_DEFAULTS:
				getPartyProfileDefaults().clear();
				getPartyProfileDefaults().addAll((Collection<? extends String>)newValue);
				return;
			case PartyPackage.PARTY__PARTY_ROLES:
				getPartyRoles().clear();
				getPartyRoles().addAll((Collection<? extends String>)newValue);
				return;
			case PartyPackage.PARTY__PARTY_SKILLS:
				getPartySkills().clear();
				getPartySkills().addAll((Collection<? extends String>)newValue);
				return;
			case PartyPackage.PARTY__SUPPLIER_PRODUCT_FEATURES:
				getSupplierProductFeatures().clear();
				getSupplierProductFeatures().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PartyPackage.PARTY__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case PartyPackage.PARTY__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case PartyPackage.PARTY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PartyPackage.PARTY__EXTERNAL_ID:
				setExternalId(EXTERNAL_ID_EDEFAULT);
				return;
			case PartyPackage.PARTY__IS_UNREAD:
				setIsUnread(IS_UNREAD_EDEFAULT);
				return;
			case PartyPackage.PARTY__LAST_MODIFIED_DATE:
				setLastModifiedDate(LAST_MODIFIED_DATE_EDEFAULT);
				return;
			case PartyPackage.PARTY__PARTY_TYPE_ID:
				setPartyTypeId((PartyType)null);
				return;
			case PartyPackage.PARTY__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((UserLogin)null);
				return;
			case PartyPackage.PARTY__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((UserLogin)null);
				return;
			case PartyPackage.PARTY__PREFERRED_CURRENCY_UOM_ID:
				setPreferredCurrencyUomId((Uom)null);
				return;
			case PartyPackage.PARTY__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case PartyPackage.PARTY__DATA_SOURCE_ID:
				setDataSourceId((DataSource)null);
				return;
			case PartyPackage.PARTY__PARTY_ATTRIBUTES:
				getPartyAttributes().clear();
				return;
			case PartyPackage.PARTY__PARTY_IDENTIFICATIONS:
				getPartyIdentifications().clear();
				return;
			case PartyPackage.PARTY__PARTY_NAME_HISTORIES:
				getPartyNameHistories().clear();
				return;
			case PartyPackage.PARTY__PARTY_NOTES:
				getPartyNotes().clear();
				return;
			case PartyPackage.PARTY__PARTY_PROFILE_DEFAULTS:
				getPartyProfileDefaults().clear();
				return;
			case PartyPackage.PARTY__PARTY_ROLES:
				getPartyRoles().clear();
				return;
			case PartyPackage.PARTY__PARTY_SKILLS:
				getPartySkills().clear();
				return;
			case PartyPackage.PARTY__SUPPLIER_PRODUCT_FEATURES:
				getSupplierProductFeatures().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PartyPackage.PARTY__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case PartyPackage.PARTY__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case PartyPackage.PARTY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PartyPackage.PARTY__EXTERNAL_ID:
				return EXTERNAL_ID_EDEFAULT == null ? externalId != null : !EXTERNAL_ID_EDEFAULT.equals(externalId);
			case PartyPackage.PARTY__IS_UNREAD:
				return isUnread != IS_UNREAD_EDEFAULT;
			case PartyPackage.PARTY__LAST_MODIFIED_DATE:
				return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
			case PartyPackage.PARTY__PARTY_TYPE_ID:
				return partyTypeId != null;
			case PartyPackage.PARTY__CREATED_BY_USER_LOGIN:
				return createdByUserLogin != null;
			case PartyPackage.PARTY__LAST_MODIFIED_BY_USER_LOGIN:
				return lastModifiedByUserLogin != null;
			case PartyPackage.PARTY__PREFERRED_CURRENCY_UOM_ID:
				return preferredCurrencyUomId != null;
			case PartyPackage.PARTY__STATUS_ID:
				return statusId != null;
			case PartyPackage.PARTY__DATA_SOURCE_ID:
				return dataSourceId != null;
			case PartyPackage.PARTY__PARTY_ATTRIBUTES:
				return partyAttributes != null && !partyAttributes.isEmpty();
			case PartyPackage.PARTY__PARTY_IDENTIFICATIONS:
				return partyIdentifications != null && !partyIdentifications.isEmpty();
			case PartyPackage.PARTY__PARTY_NAME_HISTORIES:
				return partyNameHistories != null && !partyNameHistories.isEmpty();
			case PartyPackage.PARTY__PARTY_NOTES:
				return partyNotes != null && !partyNotes.isEmpty();
			case PartyPackage.PARTY__PARTY_PROFILE_DEFAULTS:
				return partyProfileDefaults != null && !partyProfileDefaults.isEmpty();
			case PartyPackage.PARTY__PARTY_ROLES:
				return partyRoles != null && !partyRoles.isEmpty();
			case PartyPackage.PARTY__PARTY_SKILLS:
				return partySkills != null && !partySkills.isEmpty();
			case PartyPackage.PARTY__SUPPLIER_PRODUCT_FEATURES:
				return supplierProductFeatures != null && !supplierProductFeatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (partyId: ");
		result.append(partyId);
		result.append(", createdDate: ");
		result.append(createdDate);
		result.append(", description: ");
		result.append(description);
		result.append(", externalId: ");
		result.append(externalId);
		result.append(", isUnread: ");
		result.append(isUnread);
		result.append(", lastModifiedDate: ");
		result.append(lastModifiedDate);
		result.append(", partyAttributes: ");
		result.append(partyAttributes);
		result.append(", partyIdentifications: ");
		result.append(partyIdentifications);
		result.append(", partyNameHistories: ");
		result.append(partyNameHistories);
		result.append(", partyNotes: ");
		result.append(partyNotes);
		result.append(", partyProfileDefaults: ");
		result.append(partyProfileDefaults);
		result.append(", partyRoles: ");
		result.append(partyRoles);
		result.append(", partySkills: ");
		result.append(partySkills);
		result.append(", supplierProductFeatures: ");
		result.append(supplierProductFeatures);
		result.append(')');
		return result.toString();
	}

} //PartyImpl
