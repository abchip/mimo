/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party;

import org.abchip.mimo.biz.BizEntityNote;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyNote#getPartyId <em>Party Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyNote()
 * @model
 * @generated
 */
public interface PartyNote extends BizEntityNote {
	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyNote_PartyId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyNote#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

} // PartyNote
