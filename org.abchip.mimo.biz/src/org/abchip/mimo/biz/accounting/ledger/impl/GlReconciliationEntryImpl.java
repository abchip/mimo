/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.accounting.ledger.AcctgTrans;
import org.abchip.mimo.biz.accounting.ledger.GlReconciliation;
import org.abchip.mimo.biz.accounting.ledger.GlReconciliationEntry;
import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gl Reconciliation Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationEntryImpl#getGlReconciliationId <em>Gl Reconciliation Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationEntryImpl#getAcctgTransId <em>Acctg Trans Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationEntryImpl#getAcctgTransEntrySeqId <em>Acctg Trans Entry Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationEntryImpl#getReconciledAmount <em>Reconciled Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlReconciliationEntryImpl extends BizEntityImpl implements GlReconciliationEntry {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlReconciliationEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.GL_RECONCILIATION_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAcctgTransEntrySeqId() {
		return (String)eGet(LedgerPackage.Literals.GL_RECONCILIATION_ENTRY__ACCTG_TRANS_ENTRY_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcctgTransEntrySeqId(String newAcctgTransEntrySeqId) {
		eSet(LedgerPackage.Literals.GL_RECONCILIATION_ENTRY__ACCTG_TRANS_ENTRY_SEQ_ID, newAcctgTransEntrySeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReconciledAmount() {
		return (BigDecimal)eGet(LedgerPackage.Literals.GL_RECONCILIATION_ENTRY__RECONCILED_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReconciledAmount(BigDecimal newReconciledAmount) {
		eSet(LedgerPackage.Literals.GL_RECONCILIATION_ENTRY__RECONCILED_AMOUNT, newReconciledAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlReconciliation getGlReconciliationId() {
		return (GlReconciliation)eGet(LedgerPackage.Literals.GL_RECONCILIATION_ENTRY__GL_RECONCILIATION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlReconciliationId(GlReconciliation newGlReconciliationId) {
		eSet(LedgerPackage.Literals.GL_RECONCILIATION_ENTRY__GL_RECONCILIATION_ID, newGlReconciliationId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcctgTrans getAcctgTransId() {
		return (AcctgTrans)eGet(LedgerPackage.Literals.GL_RECONCILIATION_ENTRY__ACCTG_TRANS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcctgTransId(AcctgTrans newAcctgTransId) {
		eSet(LedgerPackage.Literals.GL_RECONCILIATION_ENTRY__ACCTG_TRANS_ID, newAcctgTransId);
	}

} //GlReconciliationEntryImpl
