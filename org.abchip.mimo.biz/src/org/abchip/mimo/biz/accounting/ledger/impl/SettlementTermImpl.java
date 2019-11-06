/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger.impl;

import java.util.List;

import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.accounting.ledger.SettlementTerm;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Settlement Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.SettlementTermImpl#getSettlementTermId <em>Settlement Term Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.SettlementTermImpl#getTermName <em>Term Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.SettlementTermImpl#getTermValue <em>Term Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.SettlementTermImpl#getUomId <em>Uom Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SettlementTermImpl extends BizEntityImpl implements SettlementTerm {
	/**
	 * The default value of the '{@link #getSettlementTermId() <em>Settlement Term Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettlementTermId()
	 * @generated
	 * @ordered
	 */
	protected static final String SETTLEMENT_TERM_ID_EDEFAULT = null;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getSettlementTermId() <em>Settlement Term Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettlementTermId()
	 * @generated
	 * @ordered
	 */
	protected String settlementTermId = SETTLEMENT_TERM_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getTermName() <em>Term Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermName()
	 * @generated
	 * @ordered
	 */
	protected static final String TERM_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTermName() <em>Term Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermName()
	 * @generated
	 * @ordered
	 */
	protected String termName = TERM_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getTermValue() <em>Term Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermValue()
	 * @generated
	 * @ordered
	 */
	protected static final long TERM_VALUE_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getTermValue() <em>Term Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermValue()
	 * @generated
	 * @ordered
	 */
	protected long termValue = TERM_VALUE_EDEFAULT;
	/**
	 * The default value of the '{@link #getUomId() <em>Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String UOM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUomId() <em>Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUomId()
	 * @generated
	 * @ordered
	 */
	protected String uomId = UOM_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SettlementTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.SETTLEMENT_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTermName() {
		return termName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTermName(String newTermName) {
		termName = newTermName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTermValue() {
		return termValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTermValue(long newTermValue) {
		termValue = newTermValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUomId() {
		return uomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUomId(String newUomId) {
		uomId = newUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> acctgTransEntries() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSettlementTermId() {
		return settlementTermId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSettlementTermId(String newSettlementTermId) {
		settlementTermId = newSettlementTermId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LedgerPackage.SETTLEMENT_TERM__SETTLEMENT_TERM_ID:
				return getSettlementTermId();
			case LedgerPackage.SETTLEMENT_TERM__TERM_NAME:
				return getTermName();
			case LedgerPackage.SETTLEMENT_TERM__TERM_VALUE:
				return getTermValue();
			case LedgerPackage.SETTLEMENT_TERM__UOM_ID:
				return getUomId();
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
			case LedgerPackage.SETTLEMENT_TERM__SETTLEMENT_TERM_ID:
				setSettlementTermId((String)newValue);
				return;
			case LedgerPackage.SETTLEMENT_TERM__TERM_NAME:
				setTermName((String)newValue);
				return;
			case LedgerPackage.SETTLEMENT_TERM__TERM_VALUE:
				setTermValue((Long)newValue);
				return;
			case LedgerPackage.SETTLEMENT_TERM__UOM_ID:
				setUomId((String)newValue);
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
			case LedgerPackage.SETTLEMENT_TERM__SETTLEMENT_TERM_ID:
				setSettlementTermId(SETTLEMENT_TERM_ID_EDEFAULT);
				return;
			case LedgerPackage.SETTLEMENT_TERM__TERM_NAME:
				setTermName(TERM_NAME_EDEFAULT);
				return;
			case LedgerPackage.SETTLEMENT_TERM__TERM_VALUE:
				setTermValue(TERM_VALUE_EDEFAULT);
				return;
			case LedgerPackage.SETTLEMENT_TERM__UOM_ID:
				setUomId(UOM_ID_EDEFAULT);
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
			case LedgerPackage.SETTLEMENT_TERM__SETTLEMENT_TERM_ID:
				return SETTLEMENT_TERM_ID_EDEFAULT == null ? settlementTermId != null : !SETTLEMENT_TERM_ID_EDEFAULT.equals(settlementTermId);
			case LedgerPackage.SETTLEMENT_TERM__TERM_NAME:
				return TERM_NAME_EDEFAULT == null ? termName != null : !TERM_NAME_EDEFAULT.equals(termName);
			case LedgerPackage.SETTLEMENT_TERM__TERM_VALUE:
				return termValue != TERM_VALUE_EDEFAULT;
			case LedgerPackage.SETTLEMENT_TERM__UOM_ID:
				return UOM_ID_EDEFAULT == null ? uomId != null : !UOM_ID_EDEFAULT.equals(uomId);
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
		result.append(" (settlementTermId: ");
		result.append(settlementTermId);
		result.append(", termName: ");
		result.append(termName);
		result.append(", termValue: ");
		result.append(termValue);
		result.append(", uomId: ");
		result.append(uomId);
		result.append(')');
		return result.toString();
	}

} //SettlementTermImpl
