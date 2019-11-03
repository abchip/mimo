/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Classification Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyClassificationGroup#getPartyClassificationGroupId <em>Party Classification Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyClassificationGroup#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyClassificationGroup#getParentGroupId <em>Parent Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyClassificationGroup#getPartyClassificationTypeId <em>Party Classification Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyClassificationGroup()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface PartyClassificationGroup extends BizEntity {
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
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyClassificationGroup_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyClassificationGroup#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Parent Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Group Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Group Id</em>' attribute.
	 * @see #setParentGroupId(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyClassificationGroup_ParentGroupId()
	 * @model annotation="mimo-ent-domain frame='PartyClassificationGroup'"
	 * @generated
	 */
	String getParentGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyClassificationGroup#getParentGroupId <em>Parent Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Group Id</em>' attribute.
	 * @see #getParentGroupId()
	 * @generated
	 */
	void setParentGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Party Classification Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Classification Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Classification Type Id</em>' attribute.
	 * @see #setPartyClassificationTypeId(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyClassificationGroup_PartyClassificationTypeId()
	 * @model annotation="mimo-ent-domain frame='PartyClassificationType'"
	 * @generated
	 */
	String getPartyClassificationTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyClassificationGroup#getPartyClassificationTypeId <em>Party Classification Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Classification Type Id</em>' attribute.
	 * @see #getPartyClassificationTypeId()
	 * @generated
	 */
	void setPartyClassificationTypeId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PartyClassificationGroup' route='parentGroupId'"
	 * @generated
	 */
	List<String> childPartyClassificationGroups();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SegmentGroupClassification' route='partyClassificationGroupId'"
	 * @generated
	 */
	List<String> segmentGroupClassifications();

	/**
	 * Returns the value of the '<em><b>Party Classification Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Classification Group Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Classification Group Id</em>' attribute.
	 * @see #setPartyClassificationGroupId(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyClassificationGroup_PartyClassificationGroupId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getPartyClassificationGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyClassificationGroup#getPartyClassificationGroupId <em>Party Classification Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Classification Group Id</em>' attribute.
	 * @see #getPartyClassificationGroupId()
	 * @generated
	 */
	void setPartyClassificationGroupId(String value);

} // PartyClassificationGroup
