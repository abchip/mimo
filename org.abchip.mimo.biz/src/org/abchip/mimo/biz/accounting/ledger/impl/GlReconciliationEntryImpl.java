/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gl Reconciliation Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationEntryImpl#getAcctgTransEntrySeqId <em>Acctg Trans Entry Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationEntryImpl#getReconciledAmount <em>Reconciled Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationEntryImpl#getGlReconciliationId <em>Gl Reconciliation Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationEntryImpl#getAcctgTransId <em>Acctg Trans Id</em>}</li>
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
	 * The default value of the '{@link #getAcctgTransEntrySeqId() <em>Acctg Trans Entry Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcctgTransEntrySeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCTG_TRANS_ENTRY_SEQ_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAcctgTransEntrySeqId() <em>Acctg Trans Entry Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcctgTransEntrySeqId()
	 * @generated
	 * @ordered
	 */
	protected String acctgTransEntrySeqId = ACCTG_TRANS_ENTRY_SEQ_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getReconciledAmount() <em>Reconciled Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconciledAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RECONCILED_AMOUNT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getReconciledAmount() <em>Reconciled Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconciledAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal reconciledAmount = RECONCILED_AMOUNT_EDEFAULT;
	/**
	 * The cached value of the '{@link #getGlReconciliationId() <em>Gl Reconciliation Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlReconciliationId()
	 * @generated
	 * @ordered
	 */
	protected GlReconciliation glReconciliationId;
	/**
	 * The cached value of the '{@link #getAcctgTransId() <em>Acctg Trans Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcctgTransId()
	 * @generated
	 * @ordered
	 */
	protected AcctgTrans acctgTransId;

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
		return acctgTransEntrySeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcctgTransEntrySeqId(String newAcctgTransEntrySeqId) {
		String oldAcctgTransEntrySeqId = acctgTransEntrySeqId;
		acctgTransEntrySeqId = newAcctgTransEntrySeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_RECONCILIATION_ENTRY__ACCTG_TRANS_ENTRY_SEQ_ID, oldAcctgTransEntrySeqId, acctgTransEntrySeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReconciledAmount() {
		return reconciledAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReconciledAmount(BigDecimal newReconciledAmount) {
		BigDecimal oldReconciledAmount = reconciledAmount;
		reconciledAmount = newReconciledAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_RECONCILIATION_ENTRY__RECONCILED_AMOUNT, oldReconciledAmount, reconciledAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlReconciliation getGlReconciliationId() {
		if (glReconciliationId != null && ((EObject)glReconciliationId).eIsProxy()) {
			InternalEObject oldGlReconciliationId = (InternalEObject)glReconciliationId;
			glReconciliationId = (GlReconciliation)eResolveProxy(oldGlReconciliationId);
			if (glReconciliationId != oldGlReconciliationId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.GL_RECONCILIATION_ENTRY__GL_RECONCILIATION_ID, oldGlReconciliationId, glReconciliationId));
			}
		}
		return glReconciliationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlReconciliation basicGetGlReconciliationId() {
		return glReconciliationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlReconciliationId(GlReconciliation newGlReconciliationId) {
		GlReconciliation oldGlReconciliationId = glReconciliationId;
		glReconciliationId = newGlReconciliationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_RECONCILIATION_ENTRY__GL_RECONCILIATION_ID, oldGlReconciliationId, glReconciliationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcctgTrans getAcctgTransId() {
		if (acctgTransId != null && ((EObject)acctgTransId).eIsProxy()) {
			InternalEObject oldAcctgTransId = (InternalEObject)acctgTransId;
			acctgTransId = (AcctgTrans)eResolveProxy(oldAcctgTransId);
			if (acctgTransId != oldAcctgTransId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.GL_RECONCILIATION_ENTRY__ACCTG_TRANS_ID, oldAcctgTransId, acctgTransId));
			}
		}
		return acctgTransId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcctgTrans basicGetAcctgTransId() {
		return acctgTransId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcctgTransId(AcctgTrans newAcctgTransId) {
		AcctgTrans oldAcctgTransId = acctgTransId;
		acctgTransId = newAcctgTransId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.GL_RECONCILIATION_ENTRY__ACCTG_TRANS_ID, oldAcctgTransId, acctgTransId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LedgerPackage.GL_RECONCILIATION_ENTRY__ACCTG_TRANS_ENTRY_SEQ_ID:
				return getAcctgTransEntrySeqId();
			case LedgerPackage.GL_RECONCILIATION_ENTRY__RECONCILED_AMOUNT:
				return getReconciledAmount();
			case LedgerPackage.GL_RECONCILIATION_ENTRY__GL_RECONCILIATION_ID:
				if (resolve) return getGlReconciliationId();
				return basicGetGlReconciliationId();
			case LedgerPackage.GL_RECONCILIATION_ENTRY__ACCTG_TRANS_ID:
				if (resolve) return getAcctgTransId();
				return basicGetAcctgTransId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LedgerPackage.GL_RECONCILIATION_ENTRY__ACCTG_TRANS_ENTRY_SEQ_ID:
				setAcctgTransEntrySeqId((String)newValue);
				return;
			case LedgerPackage.GL_RECONCILIATION_ENTRY__RECONCILED_AMOUNT:
				setReconciledAmount((BigDecimal)newValue);
				return;
			case LedgerPackage.GL_RECONCILIATION_ENTRY__GL_RECONCILIATION_ID:
				setGlReconciliationId((GlReconciliation)newValue);
				return;
			case LedgerPackage.GL_RECONCILIATION_ENTRY__ACCTG_TRANS_ID:
				setAcctgTransId((AcctgTrans)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LedgerPackage.GL_RECONCILIATION_ENTRY__ACCTG_TRANS_ENTRY_SEQ_ID:
				setAcctgTransEntrySeqId(ACCTG_TRANS_ENTRY_SEQ_ID_EDEFAULT);
				return;
			case LedgerPackage.GL_RECONCILIATION_ENTRY__RECONCILED_AMOUNT:
				setReconciledAmount(RECONCILED_AMOUNT_EDEFAULT);
				return;
			case LedgerPackage.GL_RECONCILIATION_ENTRY__GL_RECONCILIATION_ID:
				setGlReconciliationId((GlReconciliation)null);
				return;
			case LedgerPackage.GL_RECONCILIATION_ENTRY__ACCTG_TRANS_ID:
				setAcctgTransId((AcctgTrans)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LedgerPackage.GL_RECONCILIATION_ENTRY__ACCTG_TRANS_ENTRY_SEQ_ID:
				return ACCTG_TRANS_ENTRY_SEQ_ID_EDEFAULT == null ? acctgTransEntrySeqId != null : !ACCTG_TRANS_ENTRY_SEQ_ID_EDEFAULT.equals(acctgTransEntrySeqId);
			case LedgerPackage.GL_RECONCILIATION_ENTRY__RECONCILED_AMOUNT:
				return RECONCILED_AMOUNT_EDEFAULT == null ? reconciledAmount != null : !RECONCILED_AMOUNT_EDEFAULT.equals(reconciledAmount);
			case LedgerPackage.GL_RECONCILIATION_ENTRY__GL_RECONCILIATION_ID:
				return glReconciliationId != null;
			case LedgerPackage.GL_RECONCILIATION_ENTRY__ACCTG_TRANS_ID:
				return acctgTransId != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (acctgTransEntrySeqId: ");
		result.append(acctgTransEntrySeqId);
		result.append(", reconciledAmount: ");
		result.append(reconciledAmount);
		result.append(')');
		return result.toString();
	}

} //GlReconciliationEntryImpl
