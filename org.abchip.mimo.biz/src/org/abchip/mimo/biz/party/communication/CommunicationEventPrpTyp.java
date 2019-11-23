/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.communication;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Event Prp Typ</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEventPrpTyp#getCommunicationEventPrpTypId <em>Communication Event Prp Typ Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEventPrpTyp#getCommunicationEventPurposes <em>Communication Event Purposes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEventPrpTyp#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEventPrpTyp#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEventPrpTyp#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEventPrpTyp()
 * @model annotation="mimo-ent-frame title='Communication Event Purpose Type' dictionary='PartyEntityLabels' formula='description'"
 * @generated
 */
public interface CommunicationEventPrpTyp extends BizEntity {
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
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEventPrpTyp_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEventPrpTyp#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Table</em>' attribute.
	 * @see #setHasTable(boolean)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEventPrpTyp_HasTable()
	 * @model annotation="mimo-ent-format type='indicator' length='1'"
	 * @generated
	 */
	boolean isHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEventPrpTyp#isHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #isHasTable()
	 * @generated
	 */
	void setHasTable(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type Id</em>' reference.
	 * @see #setParentTypeId(CommunicationEventPrpTyp)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEventPrpTyp_ParentTypeId()
	 * @model keys="communicationEventPrpTypId"
	 * @generated
	 */
	CommunicationEventPrpTyp getParentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEventPrpTyp#getParentTypeId <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type Id</em>' reference.
	 * @see #getParentTypeId()
	 * @generated
	 */
	void setParentTypeId(CommunicationEventPrpTyp value);

	/**
	 * Returns the value of the '<em><b>Communication Event Purposes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Event Purposes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Event Purposes</em>' attribute list.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEventPrpTyp_CommunicationEventPurposes()
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CommunicationEventPurpose'"
	 * @generated
	 */
	List<String> getCommunicationEventPurposes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CommunicationEventPrpTyp' route='parentTypeId'"
	 * @generated
	 */
	List<String> childCommunicationEventPrpTyps();

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
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEventPrpTyp_CommunicationEventPrpTypId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 * @generated
	 */
	String getCommunicationEventPrpTypId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEventPrpTyp#getCommunicationEventPrpTypId <em>Communication Event Prp Typ Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Event Prp Typ Id</em>' attribute.
	 * @see #getCommunicationEventPrpTypId()
	 * @generated
	 */
	void setCommunicationEventPrpTypId(String value);

} // CommunicationEventPrpTyp
