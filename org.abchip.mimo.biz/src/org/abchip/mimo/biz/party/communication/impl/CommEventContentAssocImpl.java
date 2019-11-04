/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.communication.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.communication.CommContentAssocType;
import org.abchip.mimo.biz.party.communication.CommEventContentAssoc;
import org.abchip.mimo.biz.party.communication.CommunicationEvent;
import org.abchip.mimo.biz.party.communication.CommunicationPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comm Event Content Assoc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommEventContentAssocImpl#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommEventContentAssocImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommEventContentAssocImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommEventContentAssocImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommEventContentAssocImpl#getCommunicationEventId <em>Communication Event Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommEventContentAssocImpl#getCommContentAssocTypeId <em>Comm Content Assoc Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommEventContentAssocImpl extends BizEntityImpl implements CommEventContentAssoc {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getContentId() <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getContentId() <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected String contentId = CONTENT_ID_EDEFAULT;
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
	 * The default value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected static final long SEQUENCE_NUM_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected long sequenceNum = SEQUENCE_NUM_EDEFAULT;
	/**
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getCommunicationEventId() <em>Communication Event Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationEventId()
	 * @generated
	 * @ordered
	 */
	protected CommunicationEvent communicationEventId;
	/**
	 * The cached value of the '{@link #getCommContentAssocTypeId() <em>Comm Content Assoc Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommContentAssocTypeId()
	 * @generated
	 * @ordered
	 */
	protected CommContentAssocType commContentAssocTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommEventContentAssocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.COMM_EVENT_CONTENT_ASSOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentId() {
		return contentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentId(String newContentId) {
		String oldContentId = contentId;
		contentId = newContentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__CONTENT_ID, oldContentId, contentId));
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
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceNum() {
		return sequenceNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNum(long newSequenceNum) {
		long oldSequenceNum = sequenceNum;
		sequenceNum = newSequenceNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__SEQUENCE_NUM, oldSequenceNum, sequenceNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationEvent getCommunicationEventId() {
		if (communicationEventId != null && ((EObject)communicationEventId).eIsProxy()) {
			InternalEObject oldCommunicationEventId = (InternalEObject)communicationEventId;
			communicationEventId = (CommunicationEvent)eResolveProxy(oldCommunicationEventId);
			if (communicationEventId != oldCommunicationEventId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__COMMUNICATION_EVENT_ID, oldCommunicationEventId, communicationEventId));
			}
		}
		return communicationEventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationEvent basicGetCommunicationEventId() {
		return communicationEventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunicationEventId(CommunicationEvent newCommunicationEventId) {
		CommunicationEvent oldCommunicationEventId = communicationEventId;
		communicationEventId = newCommunicationEventId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__COMMUNICATION_EVENT_ID, oldCommunicationEventId, communicationEventId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommContentAssocType getCommContentAssocTypeId() {
		if (commContentAssocTypeId != null && ((EObject)commContentAssocTypeId).eIsProxy()) {
			InternalEObject oldCommContentAssocTypeId = (InternalEObject)commContentAssocTypeId;
			commContentAssocTypeId = (CommContentAssocType)eResolveProxy(oldCommContentAssocTypeId);
			if (commContentAssocTypeId != oldCommContentAssocTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__COMM_CONTENT_ASSOC_TYPE_ID, oldCommContentAssocTypeId, commContentAssocTypeId));
			}
		}
		return commContentAssocTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommContentAssocType basicGetCommContentAssocTypeId() {
		return commContentAssocTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommContentAssocTypeId(CommContentAssocType newCommContentAssocTypeId) {
		CommContentAssocType oldCommContentAssocTypeId = commContentAssocTypeId;
		commContentAssocTypeId = newCommContentAssocTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__COMM_CONTENT_ASSOC_TYPE_ID, oldCommContentAssocTypeId, commContentAssocTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__CONTENT_ID:
				return getContentId();
			case CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__FROM_DATE:
				return getFromDate();
			case CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__SEQUENCE_NUM:
				return getSequenceNum();
			case CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__THRU_DATE:
				return getThruDate();
			case CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__COMMUNICATION_EVENT_ID:
				if (resolve) return getCommunicationEventId();
				return basicGetCommunicationEventId();
			case CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__COMM_CONTENT_ASSOC_TYPE_ID:
				if (resolve) return getCommContentAssocTypeId();
				return basicGetCommContentAssocTypeId();
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
			case CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__CONTENT_ID:
				setContentId((String)newValue);
				return;
			case CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__COMMUNICATION_EVENT_ID:
				setCommunicationEventId((CommunicationEvent)newValue);
				return;
			case CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__COMM_CONTENT_ASSOC_TYPE_ID:
				setCommContentAssocTypeId((CommContentAssocType)newValue);
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
			case CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__CONTENT_ID:
				setContentId(CONTENT_ID_EDEFAULT);
				return;
			case CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__COMMUNICATION_EVENT_ID:
				setCommunicationEventId((CommunicationEvent)null);
				return;
			case CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__COMM_CONTENT_ASSOC_TYPE_ID:
				setCommContentAssocTypeId((CommContentAssocType)null);
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
			case CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__CONTENT_ID:
				return CONTENT_ID_EDEFAULT == null ? contentId != null : !CONTENT_ID_EDEFAULT.equals(contentId);
			case CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__COMMUNICATION_EVENT_ID:
				return communicationEventId != null;
			case CommunicationPackage.COMM_EVENT_CONTENT_ASSOC__COMM_CONTENT_ASSOC_TYPE_ID:
				return commContentAssocTypeId != null;
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
		result.append(" (contentId: ");
		result.append(contentId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //CommEventContentAssocImpl
