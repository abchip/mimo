/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.agreement;

import java.util.List;

import org.abchip.mimo.biz.BizEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agreement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.AgreementType#getAgreementTypeId <em>Agreement Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.AgreementType#getAgreementTypeAttrs <em>Agreement Type Attrs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.AgreementType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.AgreementType#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.AgreementType#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreementType()
 * @model annotation="mimo-ent-frame dictionary='PartyEntityLabels' formula='description'"
 * @generated
 */
public interface AgreementType extends BizEntityType<Agreement> {
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
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreementType_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.AgreementType#getDescription <em>Description</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreementType_HasTable()
	 * @model annotation="mimo-ent-format type='indicator' length='1'"
	 * @generated
	 */
	boolean isHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.AgreementType#isHasTable <em>Has Table</em>}' attribute.
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
	 * @see #setParentTypeId(AgreementType)
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreementType_ParentTypeId()
	 * @model keys="agreementTypeId"
	 * @generated
	 */
	AgreementType getParentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.AgreementType#getParentTypeId <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type Id</em>' reference.
	 * @see #getParentTypeId()
	 * @generated
	 */
	void setParentTypeId(AgreementType value);

	/**
	 * Returns the value of the '<em><b>Agreement Type Attrs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement Type Attrs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Type Attrs</em>' attribute list.
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreementType_AgreementTypeAttrs()
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='AgreementTypeAttr'"
	 * @generated
	 */
	List<String> getAgreementTypeAttrs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Agreement' route='agreementTypeId'"
	 * @generated
	 */
	List<String> agreements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='AgreementType' route='parentTypeId'"
	 * @generated
	 */
	List<String> childAgreementTypes();

	/**
	 * Returns the value of the '<em><b>Agreement Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Type Id</em>' attribute.
	 * @see #setAgreementTypeId(String)
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreementType_AgreementTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 * @generated
	 */
	String getAgreementTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.AgreementType#getAgreementTypeId <em>Agreement Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Type Id</em>' attribute.
	 * @see #getAgreementTypeId()
	 * @generated
	 */
	void setAgreementTypeId(String value);

} // AgreementType
