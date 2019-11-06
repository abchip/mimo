/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.request.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.request.CustRequest;
import org.abchip.mimo.biz.order.request.RequestPackage;
import org.abchip.mimo.biz.order.request.RespondingParty;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Responding Party</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.RespondingPartyImpl#getRespondingPartySeqId <em>Responding Party Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.RespondingPartyImpl#getDateSent <em>Date Sent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.RespondingPartyImpl#getCustRequestId <em>Cust Request Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.RespondingPartyImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.RespondingPartyImpl#getContactMechId <em>Contact Mech Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RespondingPartyImpl extends BizEntityImpl implements RespondingParty {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getRespondingPartySeqId() <em>Responding Party Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespondingPartySeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONDING_PARTY_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRespondingPartySeqId() <em>Responding Party Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespondingPartySeqId()
	 * @generated
	 * @ordered
	 */
	protected String respondingPartySeqId = RESPONDING_PARTY_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateSent() <em>Date Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateSent()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_SENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateSent() <em>Date Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateSent()
	 * @generated
	 * @ordered
	 */
	protected Date dateSent = DATE_SENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustRequestId() <em>Cust Request Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestId()
	 * @generated
	 * @ordered
	 */
	protected CustRequest custRequestId;

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
	 * The cached value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected ContactMech contactMechId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RespondingPartyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequestPackage.Literals.RESPONDING_PARTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getContactMechId() {
		if (contactMechId != null && ((EObject)contactMechId).eIsProxy()) {
			InternalEObject oldContactMechId = (InternalEObject)contactMechId;
			contactMechId = (ContactMech)eResolveProxy(oldContactMechId);
			if (contactMechId != oldContactMechId) {
			}
		}
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactMech basicGetContactMechId() {
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(ContactMech newContactMechId) {
		contactMechId = newContactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustRequest getCustRequestId() {
		if (custRequestId != null && ((EObject)custRequestId).eIsProxy()) {
			InternalEObject oldCustRequestId = (InternalEObject)custRequestId;
			custRequestId = (CustRequest)eResolveProxy(oldCustRequestId);
			if (custRequestId != oldCustRequestId) {
			}
		}
		return custRequestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustRequest basicGetCustRequestId() {
		return custRequestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustRequestId(CustRequest newCustRequestId) {
		custRequestId = newCustRequestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateSent() {
		return dateSent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateSent(Date newDateSent) {
		dateSent = newDateSent;
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
	public String getRespondingPartySeqId() {
		return respondingPartySeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRespondingPartySeqId(String newRespondingPartySeqId) {
		respondingPartySeqId = newRespondingPartySeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequestPackage.RESPONDING_PARTY__RESPONDING_PARTY_SEQ_ID:
				return getRespondingPartySeqId();
			case RequestPackage.RESPONDING_PARTY__DATE_SENT:
				return getDateSent();
			case RequestPackage.RESPONDING_PARTY__CUST_REQUEST_ID:
				if (resolve) return getCustRequestId();
				return basicGetCustRequestId();
			case RequestPackage.RESPONDING_PARTY__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case RequestPackage.RESPONDING_PARTY__CONTACT_MECH_ID:
				if (resolve) return getContactMechId();
				return basicGetContactMechId();
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
			case RequestPackage.RESPONDING_PARTY__RESPONDING_PARTY_SEQ_ID:
				setRespondingPartySeqId((String)newValue);
				return;
			case RequestPackage.RESPONDING_PARTY__DATE_SENT:
				setDateSent((Date)newValue);
				return;
			case RequestPackage.RESPONDING_PARTY__CUST_REQUEST_ID:
				setCustRequestId((CustRequest)newValue);
				return;
			case RequestPackage.RESPONDING_PARTY__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case RequestPackage.RESPONDING_PARTY__CONTACT_MECH_ID:
				setContactMechId((ContactMech)newValue);
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
			case RequestPackage.RESPONDING_PARTY__RESPONDING_PARTY_SEQ_ID:
				setRespondingPartySeqId(RESPONDING_PARTY_SEQ_ID_EDEFAULT);
				return;
			case RequestPackage.RESPONDING_PARTY__DATE_SENT:
				setDateSent(DATE_SENT_EDEFAULT);
				return;
			case RequestPackage.RESPONDING_PARTY__CUST_REQUEST_ID:
				setCustRequestId((CustRequest)null);
				return;
			case RequestPackage.RESPONDING_PARTY__PARTY_ID:
				setPartyId((Party)null);
				return;
			case RequestPackage.RESPONDING_PARTY__CONTACT_MECH_ID:
				setContactMechId((ContactMech)null);
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
			case RequestPackage.RESPONDING_PARTY__RESPONDING_PARTY_SEQ_ID:
				return RESPONDING_PARTY_SEQ_ID_EDEFAULT == null ? respondingPartySeqId != null : !RESPONDING_PARTY_SEQ_ID_EDEFAULT.equals(respondingPartySeqId);
			case RequestPackage.RESPONDING_PARTY__DATE_SENT:
				return DATE_SENT_EDEFAULT == null ? dateSent != null : !DATE_SENT_EDEFAULT.equals(dateSent);
			case RequestPackage.RESPONDING_PARTY__CUST_REQUEST_ID:
				return custRequestId != null;
			case RequestPackage.RESPONDING_PARTY__PARTY_ID:
				return partyId != null;
			case RequestPackage.RESPONDING_PARTY__CONTACT_MECH_ID:
				return contactMechId != null;
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
		result.append(" (respondingPartySeqId: ");
		result.append(respondingPartySeqId);
		result.append(", dateSent: ");
		result.append(dateSent);
		result.append(')');
		return result.toString();
	}

} //RespondingPartyImpl
