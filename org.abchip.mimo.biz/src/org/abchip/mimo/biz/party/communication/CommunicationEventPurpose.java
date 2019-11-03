/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.communication;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Event Purpose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEventPurpose#getCommunicationEventPrpTypId <em>Communication Event Prp Typ Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEventPurpose#getCommunicationEventId <em>Communication Event Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEventPurpose#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEventPurpose()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface CommunicationEventPurpose extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEventPurpose_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEventPurpose#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Communication Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Event Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Event Id</em>' attribute.
	 * @see #setCommunicationEventId(String)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEventPurpose_CommunicationEventId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='CommunicationEvent'"
	 * @generated
	 */
	String getCommunicationEventId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEventPurpose#getCommunicationEventId <em>Communication Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Event Id</em>' attribute.
	 * @see #getCommunicationEventId()
	 * @generated
	 */
	void setCommunicationEventId(String value);

	/**
	 * Returns the value of the '<em><b>Communication Event Prp Typ Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Event Prp Typ Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Event Prp Typ Id</em>' attribute.
	 * @see #setCommunicationEventPrpTypId(String)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEventPurpose_CommunicationEventPrpTypId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='CommunicationEventPrpTyp'"
	 * @generated
	 */
	String getCommunicationEventPrpTypId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEventPurpose#getCommunicationEventPrpTypId <em>Communication Event Prp Typ Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Event Prp Typ Id</em>' attribute.
	 * @see #getCommunicationEventPrpTypId()
	 * @generated
	 */
	void setCommunicationEventPrpTypId(String value);

} // CommunicationEventPurpose
