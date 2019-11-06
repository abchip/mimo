/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party.impl;

import java.util.Date;

import org.abchip.mimo.biz.common.datasource.DataSource;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.PartyDataSource;
import org.abchip.mimo.biz.party.party.PartyPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Data Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyDataSourceImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyDataSourceImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyDataSourceImpl#isIsCreate <em>Is Create</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyDataSourceImpl#getVisitId <em>Visit Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyDataSourceImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyDataSourceImpl#getDataSourceId <em>Data Source Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyDataSourceImpl extends BizEntityImpl implements PartyDataSource {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;
	/**
	 * The default value of the '{@link #isIsCreate() <em>Is Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCreate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CREATE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsCreate() <em>Is Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCreate()
	 * @generated
	 * @ordered
	 */
	protected boolean isCreate = IS_CREATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getVisitId() <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitId()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getVisitId() <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitId()
	 * @generated
	 * @ordered
	 */
	protected String visitId = VISIT_ID_EDEFAULT;
	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyDataSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.PARTY_DATA_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		comments = newComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsCreate() {
		return isCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsCreate(boolean newIsCreate) {
		isCreate = newIsCreate;
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
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		fromDate = newFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVisitId() {
		return visitId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisitId(String newVisitId) {
		visitId = newVisitId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
			}
		}
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
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
			case PartyPackage.PARTY_DATA_SOURCE__FROM_DATE:
				return getFromDate();
			case PartyPackage.PARTY_DATA_SOURCE__COMMENTS:
				return getComments();
			case PartyPackage.PARTY_DATA_SOURCE__IS_CREATE:
				return isIsCreate();
			case PartyPackage.PARTY_DATA_SOURCE__VISIT_ID:
				return getVisitId();
			case PartyPackage.PARTY_DATA_SOURCE__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case PartyPackage.PARTY_DATA_SOURCE__DATA_SOURCE_ID:
				if (resolve) return getDataSourceId();
				return basicGetDataSourceId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PartyPackage.PARTY_DATA_SOURCE__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case PartyPackage.PARTY_DATA_SOURCE__COMMENTS:
				setComments((String)newValue);
				return;
			case PartyPackage.PARTY_DATA_SOURCE__IS_CREATE:
				setIsCreate((Boolean)newValue);
				return;
			case PartyPackage.PARTY_DATA_SOURCE__VISIT_ID:
				setVisitId((String)newValue);
				return;
			case PartyPackage.PARTY_DATA_SOURCE__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case PartyPackage.PARTY_DATA_SOURCE__DATA_SOURCE_ID:
				setDataSourceId((DataSource)newValue);
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
			case PartyPackage.PARTY_DATA_SOURCE__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case PartyPackage.PARTY_DATA_SOURCE__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case PartyPackage.PARTY_DATA_SOURCE__IS_CREATE:
				setIsCreate(IS_CREATE_EDEFAULT);
				return;
			case PartyPackage.PARTY_DATA_SOURCE__VISIT_ID:
				setVisitId(VISIT_ID_EDEFAULT);
				return;
			case PartyPackage.PARTY_DATA_SOURCE__PARTY_ID:
				setPartyId((Party)null);
				return;
			case PartyPackage.PARTY_DATA_SOURCE__DATA_SOURCE_ID:
				setDataSourceId((DataSource)null);
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
			case PartyPackage.PARTY_DATA_SOURCE__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case PartyPackage.PARTY_DATA_SOURCE__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case PartyPackage.PARTY_DATA_SOURCE__IS_CREATE:
				return isCreate != IS_CREATE_EDEFAULT;
			case PartyPackage.PARTY_DATA_SOURCE__VISIT_ID:
				return VISIT_ID_EDEFAULT == null ? visitId != null : !VISIT_ID_EDEFAULT.equals(visitId);
			case PartyPackage.PARTY_DATA_SOURCE__PARTY_ID:
				return partyId != null;
			case PartyPackage.PARTY_DATA_SOURCE__DATA_SOURCE_ID:
				return dataSourceId != null;
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
		result.append(" (fromDate: ");
		result.append(fromDate);
		result.append(", comments: ");
		result.append(comments);
		result.append(", isCreate: ");
		result.append(isCreate);
		result.append(", visitId: ");
		result.append(visitId);
		result.append(')');
		return result.toString();
	}

} //PartyDataSourceImpl
