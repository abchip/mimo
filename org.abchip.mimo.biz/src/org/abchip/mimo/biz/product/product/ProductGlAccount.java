/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.accounting.ledger.GlAccountType;
import org.abchip.mimo.biz.party.party.Party;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Gl Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductGlAccount#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductGlAccount#getOrganizationPartyId <em>Organization Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductGlAccount#getGlAccountTypeId <em>Gl Account Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductGlAccount#getGlAccountId <em>Gl Account Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductGlAccount()
 * @model
 * @generated
 */
public interface ProductGlAccount extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Account Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account Id</em>' reference.
	 * @see #setGlAccountId(GlAccount)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductGlAccount_GlAccountId()
	 * @model keys="glAccountId"
	 * @generated
	 */
	GlAccount getGlAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductGlAccount#getGlAccountId <em>Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account Id</em>' reference.
	 * @see #getGlAccountId()
	 * @generated
	 */
	void setGlAccountId(GlAccount value);

	/**
	 * Returns the value of the '<em><b>Gl Account Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Account Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account Type Id</em>' reference.
	 * @see #setGlAccountTypeId(GlAccountType)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductGlAccount_GlAccountTypeId()
	 * @model keys="glAccountTypeId"
	 * @generated
	 */
	GlAccountType getGlAccountTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductGlAccount#getGlAccountTypeId <em>Gl Account Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account Type Id</em>' reference.
	 * @see #getGlAccountTypeId()
	 * @generated
	 */
	void setGlAccountTypeId(GlAccountType value);

	/**
	 * Returns the value of the '<em><b>Organization Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Party Id</em>' reference.
	 * @see #setOrganizationPartyId(Party)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductGlAccount_OrganizationPartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getOrganizationPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductGlAccount#getOrganizationPartyId <em>Organization Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Party Id</em>' reference.
	 * @see #getOrganizationPartyId()
	 * @generated
	 */
	void setOrganizationPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' attribute.
	 * @see #setProductId(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductGlAccount_ProductId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductGlAccount#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

} // ProductGlAccount