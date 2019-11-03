/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger;

import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gl Account Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlAccountGroup#getGlAccountGroupId <em>Gl Account Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlAccountGroup#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlAccountGroup#getGlAccountGroupTypeId <em>Gl Account Group Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccountGroup()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface GlAccountGroup extends BizEntityTyped<GlAccountGroupType> {
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
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccountGroup_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountGroup#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Gl Account Group Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Account Group Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account Group Type Id</em>' attribute.
	 * @see #setGlAccountGroupTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccountGroup_GlAccountGroupTypeId()
	 * @model annotation="mimo-ent-domain frame='GlAccountGroupType'"
	 * @generated
	 */
	String getGlAccountGroupTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountGroup#getGlAccountGroupTypeId <em>Gl Account Group Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account Group Type Id</em>' attribute.
	 * @see #getGlAccountGroupTypeId()
	 * @generated
	 */
	void setGlAccountGroupTypeId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='GlAccountGroupMember' route='glAccountGroupId'"
	 * @generated
	 */
	List<String> glAccountGroupMembers();

	/**
	 * Returns the value of the '<em><b>Gl Account Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Account Group Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account Group Id</em>' attribute.
	 * @see #setGlAccountGroupId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccountGroup_GlAccountGroupId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getGlAccountGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountGroup#getGlAccountGroupId <em>Gl Account Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account Group Id</em>' attribute.
	 * @see #getGlAccountGroupId()
	 * @generated
	 */
	void setGlAccountGroupId(String value);

} // GlAccountGroup
