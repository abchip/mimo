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
import org.abchip.mimo.biz.order.request.RequestPackage;
import org.abchip.mimo.biz.order.request.RespondingParty;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Responding Party</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.RespondingPartyImpl#getRespondingPartySeqId <em>Responding Party Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.RespondingPartyImpl#getCustRequestId <em>Cust Request Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.RespondingPartyImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.RespondingPartyImpl#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.RespondingPartyImpl#getDateSent <em>Date Sent</em>}</li>
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
	 * The default value of the '{@link #getCustRequestId() <em>Cust Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUST_REQUEST_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustRequestId() <em>Cust Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestId()
	 * @generated
	 * @ordered
	 */
	protected String custRequestId = CUST_REQUEST_ID_EDEFAULT;

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
	 * The default value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_MECH_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected String contactMechId = CONTACT_MECH_ID_EDEFAULT;

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
	public String getContactMechId() {
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(String newContactMechId) {
		String oldContactMechId = contactMechId;
		contactMechId = newContactMechId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.RESPONDING_PARTY__CONTACT_MECH_ID, oldContactMechId, contactMechId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustRequestId() {
		return custRequestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustRequestId(String newCustRequestId) {
		String oldCustRequestId = custRequestId;
		custRequestId = newCustRequestId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.RESPONDING_PARTY__CUST_REQUEST_ID, oldCustRequestId, custRequestId));
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
		Date oldDateSent = dateSent;
		dateSent = newDateSent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.RESPONDING_PARTY__DATE_SENT, oldDateSent, dateSent));
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
		String oldPartyId = partyId;
		partyId = newPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.RESPONDING_PARTY__PARTY_ID, oldPartyId, partyId));
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
		String oldRespondingPartySeqId = respondingPartySeqId;
		respondingPartySeqId = newRespondingPartySeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.RESPONDING_PARTY__RESPONDING_PARTY_SEQ_ID, oldRespondingPartySeqId, respondingPartySeqId));
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
			case RequestPackage.RESPONDING_PARTY__CUST_REQUEST_ID:
				return getCustRequestId();
			case RequestPackage.RESPONDING_PARTY__PARTY_ID:
				return getPartyId();
			case RequestPackage.RESPONDING_PARTY__CONTACT_MECH_ID:
				return getContactMechId();
			case RequestPackage.RESPONDING_PARTY__DATE_SENT:
				return getDateSent();
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
			case RequestPackage.RESPONDING_PARTY__CUST_REQUEST_ID:
				setCustRequestId((String)newValue);
				return;
			case RequestPackage.RESPONDING_PARTY__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case RequestPackage.RESPONDING_PARTY__CONTACT_MECH_ID:
				setContactMechId((String)newValue);
				return;
			case RequestPackage.RESPONDING_PARTY__DATE_SENT:
				setDateSent((Date)newValue);
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
			case RequestPackage.RESPONDING_PARTY__CUST_REQUEST_ID:
				setCustRequestId(CUST_REQUEST_ID_EDEFAULT);
				return;
			case RequestPackage.RESPONDING_PARTY__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case RequestPackage.RESPONDING_PARTY__CONTACT_MECH_ID:
				setContactMechId(CONTACT_MECH_ID_EDEFAULT);
				return;
			case RequestPackage.RESPONDING_PARTY__DATE_SENT:
				setDateSent(DATE_SENT_EDEFAULT);
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
			case RequestPackage.RESPONDING_PARTY__CUST_REQUEST_ID:
				return CUST_REQUEST_ID_EDEFAULT == null ? custRequestId != null : !CUST_REQUEST_ID_EDEFAULT.equals(custRequestId);
			case RequestPackage.RESPONDING_PARTY__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case RequestPackage.RESPONDING_PARTY__CONTACT_MECH_ID:
				return CONTACT_MECH_ID_EDEFAULT == null ? contactMechId != null : !CONTACT_MECH_ID_EDEFAULT.equals(contactMechId);
			case RequestPackage.RESPONDING_PARTY__DATE_SENT:
				return DATE_SENT_EDEFAULT == null ? dateSent != null : !DATE_SENT_EDEFAULT.equals(dateSent);
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
		result.append(", custRequestId: ");
		result.append(custRequestId);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", contactMechId: ");
		result.append(contactMechId);
		result.append(", dateSent: ");
		result.append(dateSent);
		result.append(')');
		return result.toString();
	}

} //RespondingPartyImpl
