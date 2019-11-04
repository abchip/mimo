/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Settlement Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.SettlementTerm#getSettlementTermId <em>Settlement Term Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.SettlementTerm#getTermName <em>Term Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.SettlementTerm#getTermValue <em>Term Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.SettlementTerm#getUomId <em>Uom Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getSettlementTerm()
 * @model
 * @generated
 */
public interface SettlementTerm extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Term Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term Name</em>' attribute.
	 * @see #setTermName(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getSettlementTerm_TermName()
	 * @model
	 * @generated
	 */
	String getTermName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.SettlementTerm#getTermName <em>Term Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Name</em>' attribute.
	 * @see #getTermName()
	 * @generated
	 */
	void setTermName(String value);

	/**
	 * Returns the value of the '<em><b>Term Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term Value</em>' attribute.
	 * @see #setTermValue(long)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getSettlementTerm_TermValue()
	 * @model
	 * @generated
	 */
	long getTermValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.SettlementTerm#getTermValue <em>Term Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Value</em>' attribute.
	 * @see #getTermValue()
	 * @generated
	 */
	void setTermValue(long value);

	/**
	 * Returns the value of the '<em><b>Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom Id</em>' attribute.
	 * @see #setUomId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getSettlementTerm_UomId()
	 * @model
	 * @generated
	 */
	String getUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.SettlementTerm#getUomId <em>Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom Id</em>' attribute.
	 * @see #getUomId()
	 * @generated
	 */
	void setUomId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='AcctgTransEntry' route='settlementTermId'"
	 * @generated
	 */
	List<String> acctgTransEntries();

	/**
	 * Returns the value of the '<em><b>Settlement Term Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settlement Term Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settlement Term Id</em>' attribute.
	 * @see #setSettlementTermId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getSettlementTerm_SettlementTermId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getSettlementTermId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.SettlementTerm#getSettlementTermId <em>Settlement Term Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settlement Term Id</em>' attribute.
	 * @see #getSettlementTermId()
	 * @generated
	 */
	void setSettlementTermId(String value);

} // SettlementTerm