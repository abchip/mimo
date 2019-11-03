/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gl Account Category Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryMember#getGlAccountId <em>Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryMember#getGlAccountCategoryId <em>Gl Account Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryMember#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryMember#getAmountPercentage <em>Amount Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryMember#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccountCategoryMember()
 * @model
 * @generated
 */
public interface GlAccountCategoryMember extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Amount Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Percentage</em>' attribute.
	 * @see #setAmountPercentage(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccountCategoryMember_AmountPercentage()
	 * @model
	 * @generated
	 */
	BigDecimal getAmountPercentage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryMember#getAmountPercentage <em>Amount Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Percentage</em>' attribute.
	 * @see #getAmountPercentage()
	 * @generated
	 */
	void setAmountPercentage(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccountCategoryMember_FromDate()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryMember#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccountCategoryMember_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryMember#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Gl Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Account Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account Id</em>' attribute.
	 * @see #setGlAccountId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccountCategoryMember_GlAccountId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='GlAccount'"
	 * @generated
	 */
	String getGlAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryMember#getGlAccountId <em>Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account Id</em>' attribute.
	 * @see #getGlAccountId()
	 * @generated
	 */
	void setGlAccountId(String value);

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
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlAccountCategoryMember_GlAccountCategoryId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='GlAccountCategory'"
	 * @generated
	 */
	String getGlAccountCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryMember#getGlAccountCategoryId <em>Gl Account Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account Category Id</em>' attribute.
	 * @see #getGlAccountCategoryId()
	 * @generated
	 */
	void setGlAccountCategoryId(String value);

} // GlAccountCategoryMember
