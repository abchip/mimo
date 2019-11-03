/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.budget;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Budget Review</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetReview#getBudgetId <em>Budget Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetReview#getBudgetReviewId <em>Budget Review Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetReview#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetReview#getBudgetReviewResultTypeId <em>Budget Review Result Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetReview#getReviewDate <em>Review Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetReview()
 * @model
 * @generated
 */
public interface BudgetReview extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Budget Review Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Review Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Review Id</em>' attribute.
	 * @see #setBudgetReviewId(String)
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetReview_BudgetReviewId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getBudgetReviewId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetReview#getBudgetReviewId <em>Budget Review Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Review Id</em>' attribute.
	 * @see #getBudgetReviewId()
	 * @generated
	 */
	void setBudgetReviewId(String value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetReview_PartyId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetReview#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Review Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Review Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Review Date</em>' attribute.
	 * @see #setReviewDate(Date)
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetReview_ReviewDate()
	 * @model
	 * @generated
	 */
	Date getReviewDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetReview#getReviewDate <em>Review Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Review Date</em>' attribute.
	 * @see #getReviewDate()
	 * @generated
	 */
	void setReviewDate(Date value);

	/**
	 * Returns the value of the '<em><b>Budget Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Id</em>' attribute.
	 * @see #setBudgetId(String)
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetReview_BudgetId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Budget'"
	 * @generated
	 */
	String getBudgetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetReview#getBudgetId <em>Budget Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Id</em>' attribute.
	 * @see #getBudgetId()
	 * @generated
	 */
	void setBudgetId(String value);

	/**
	 * Returns the value of the '<em><b>Budget Review Result Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Review Result Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Review Result Type Id</em>' attribute.
	 * @see #setBudgetReviewResultTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetReview_BudgetReviewResultTypeId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='BudgetReviewResultType'"
	 * @generated
	 */
	String getBudgetReviewResultTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetReview#getBudgetReviewResultTypeId <em>Budget Review Result Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Review Result Type Id</em>' attribute.
	 * @see #getBudgetReviewResultTypeId()
	 * @generated
	 */
	void setBudgetReviewResultTypeId(String value);

} // BudgetReview
