/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party;

import java.util.List;

import org.abchip.mimo.biz.BizEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Content Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyContentType#getPartyContentTypeId <em>Party Content Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyContentType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyContentType#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyContentType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface PartyContentType extends BizEntityType<PartyContent> {
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
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyContentType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyContentType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type Id</em>' reference.
	 * @see #setParentTypeId(PartyContentType)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyContentType_ParentTypeId()
	 * @model keys="partyContentTypeId"
	 * @generated
	 */
	PartyContentType getParentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyContentType#getParentTypeId <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type Id</em>' reference.
	 * @see #getParentTypeId()
	 * @generated
	 */
	void setParentTypeId(PartyContentType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PartyContentType' route='parentTypeId'"
	 * @generated
	 */
	List<String> childPartyContentTypes();

	/**
	 * Returns the value of the '<em><b>Party Content Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Content Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Content Type Id</em>' attribute.
	 * @see #setPartyContentTypeId(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyContentType_PartyContentTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getPartyContentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyContentType#getPartyContentTypeId <em>Party Content Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Content Type Id</em>' attribute.
	 * @see #getPartyContentTypeId()
	 * @generated
	 */
	void setPartyContentTypeId(String value);

} // PartyContentType
