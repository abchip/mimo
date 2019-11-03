/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gl Account Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategory#getGlAccountCategoryId <em>Gl Account Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategory#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategory#getGlAccountCategoryTypeId <em>Gl Account Category Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccountCategory()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface GlAccountCategory extends BizEntityTyped<GlAccountCategoryType> {
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
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccountCategory_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategory#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Gl Account Category Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Account Category Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account Category Type Id</em>' attribute.
	 * @see #setGlAccountCategoryTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccountCategory_GlAccountCategoryTypeId()
	 * @model annotation="mimo-ent-domain frame='GlAccountCategoryType'"
	 * @generated
	 */
	String getGlAccountCategoryTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategory#getGlAccountCategoryTypeId <em>Gl Account Category Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account Category Type Id</em>' attribute.
	 * @see #getGlAccountCategoryTypeId()
	 * @generated
	 */
	void setGlAccountCategoryTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Gl Account Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Account Category Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account Category Id</em>' attribute.
	 * @see #setGlAccountCategoryId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccountCategory_GlAccountCategoryId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getGlAccountCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategory#getGlAccountCategoryId <em>Gl Account Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account Category Id</em>' attribute.
	 * @see #getGlAccountCategoryId()
	 * @generated
	 */
	void setGlAccountCategoryId(String value);

} // GlAccountCategory
