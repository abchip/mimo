/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.request;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.party.communication.CommunicationEvent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cust Request Comm Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequestCommEvent#getCustRequestId <em>Cust Request Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequestCommEvent#getCommunicationEventId <em>Communication Event Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequestCommEvent()
 * @model annotation="mimo-ent-frame title='Customer Request Communication Event'"
 * @generated
 */
public interface CustRequestCommEvent extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Communication Event Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Event Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Event Id</em>' reference.
	 * @see #setCommunicationEventId(CommunicationEvent)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequestCommEvent_CommunicationEventId()
	 * @model keys="communicationEventId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	CommunicationEvent getCommunicationEventId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequestCommEvent#getCommunicationEventId <em>Communication Event Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Event Id</em>' reference.
	 * @see #getCommunicationEventId()
	 * @generated
	 */
	void setCommunicationEventId(CommunicationEvent value);

	/**
	 * Returns the value of the '<em><b>Cust Request Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Id</em>' reference.
	 * @see #setCustRequestId(CustRequest)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequestCommEvent_CustRequestId()
	 * @model keys="custRequestId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	CustRequest getCustRequestId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequestCommEvent#getCustRequestId <em>Cust Request Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Id</em>' reference.
	 * @see #getCustRequestId()
	 * @generated
	 */
	void setCustRequestId(CustRequest value);

} // CustRequestCommEvent
