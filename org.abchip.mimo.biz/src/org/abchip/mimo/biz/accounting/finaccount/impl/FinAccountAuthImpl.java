/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.finaccount.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.accounting.finaccount.FinAccount;
import org.abchip.mimo.biz.accounting.finaccount.FinAccountAuth;
import org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fin Account Auth</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountAuthImpl#getFinAccountAuthId <em>Fin Account Auth Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountAuthImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountAuthImpl#getAuthorizationDate <em>Authorization Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountAuthImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountAuthImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountAuthImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountAuthImpl#getFinAccountId <em>Fin Account Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinAccountAuthImpl extends BizEntityImpl implements FinAccountAuth {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getFinAccountAuthId() <em>Fin Account Auth Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountAuthId()
	 * @generated
	 * @ordered
	 */
	protected static final String FIN_ACCOUNT_AUTH_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinAccountAuthId() <em>Fin Account Auth Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountAuthId()
	 * @generated
	 * @ordered
	 */
	protected String finAccountAuthId = FIN_ACCOUNT_AUTH_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal AMOUNT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal amount = AMOUNT_EDEFAULT;
	/**
	 * The default value of the '{@link #getAuthorizationDate() <em>Authorization Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date AUTHORIZATION_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAuthorizationDate() <em>Authorization Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationDate()
	 * @generated
	 * @ordered
	 */
	protected Date authorizationDate = AUTHORIZATION_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_UOM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected String currencyUomId = CURRENCY_UOM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getFinAccountId() <em>Fin Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountId()
	 * @generated
	 * @ordered
	 */
	protected FinAccount finAccountId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinAccountAuthImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinaccountPackage.Literals.FIN_ACCOUNT_AUTH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(BigDecimal newAmount) {
		BigDecimal oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinaccountPackage.FIN_ACCOUNT_AUTH__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getAuthorizationDate() {
		return authorizationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorizationDate(Date newAuthorizationDate) {
		Date oldAuthorizationDate = authorizationDate;
		authorizationDate = newAuthorizationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinaccountPackage.FIN_ACCOUNT_AUTH__AUTHORIZATION_DATE, oldAuthorizationDate, authorizationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrencyUomId() {
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(String newCurrencyUomId) {
		String oldCurrencyUomId = currencyUomId;
		currencyUomId = newCurrencyUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinaccountPackage.FIN_ACCOUNT_AUTH__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFinAccountAuthId() {
		return finAccountAuthId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountAuthId(String newFinAccountAuthId) {
		String oldFinAccountAuthId = finAccountAuthId;
		finAccountAuthId = newFinAccountAuthId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinaccountPackage.FIN_ACCOUNT_AUTH__FIN_ACCOUNT_AUTH_ID, oldFinAccountAuthId, finAccountAuthId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinaccountPackage.FIN_ACCOUNT_AUTH__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinaccountPackage.FIN_ACCOUNT_AUTH__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccount getFinAccountId() {
		if (finAccountId != null && ((EObject)finAccountId).eIsProxy()) {
			InternalEObject oldFinAccountId = (InternalEObject)finAccountId;
			finAccountId = (FinAccount)eResolveProxy(oldFinAccountId);
			if (finAccountId != oldFinAccountId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinaccountPackage.FIN_ACCOUNT_AUTH__FIN_ACCOUNT_ID, oldFinAccountId, finAccountId));
			}
		}
		return finAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinAccount basicGetFinAccountId() {
		return finAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountId(FinAccount newFinAccountId) {
		FinAccount oldFinAccountId = finAccountId;
		finAccountId = newFinAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinaccountPackage.FIN_ACCOUNT_AUTH__FIN_ACCOUNT_ID, oldFinAccountId, finAccountId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinaccountPackage.FIN_ACCOUNT_AUTH__FIN_ACCOUNT_AUTH_ID:
				return getFinAccountAuthId();
			case FinaccountPackage.FIN_ACCOUNT_AUTH__AMOUNT:
				return getAmount();
			case FinaccountPackage.FIN_ACCOUNT_AUTH__AUTHORIZATION_DATE:
				return getAuthorizationDate();
			case FinaccountPackage.FIN_ACCOUNT_AUTH__CURRENCY_UOM_ID:
				return getCurrencyUomId();
			case FinaccountPackage.FIN_ACCOUNT_AUTH__FROM_DATE:
				return getFromDate();
			case FinaccountPackage.FIN_ACCOUNT_AUTH__THRU_DATE:
				return getThruDate();
			case FinaccountPackage.FIN_ACCOUNT_AUTH__FIN_ACCOUNT_ID:
				if (resolve) return getFinAccountId();
				return basicGetFinAccountId();
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
			case FinaccountPackage.FIN_ACCOUNT_AUTH__FIN_ACCOUNT_AUTH_ID:
				setFinAccountAuthId((String)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_AUTH__AMOUNT:
				setAmount((BigDecimal)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_AUTH__AUTHORIZATION_DATE:
				setAuthorizationDate((Date)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_AUTH__CURRENCY_UOM_ID:
				setCurrencyUomId((String)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_AUTH__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_AUTH__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_AUTH__FIN_ACCOUNT_ID:
				setFinAccountId((FinAccount)newValue);
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
			case FinaccountPackage.FIN_ACCOUNT_AUTH__FIN_ACCOUNT_AUTH_ID:
				setFinAccountAuthId(FIN_ACCOUNT_AUTH_ID_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_AUTH__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_AUTH__AUTHORIZATION_DATE:
				setAuthorizationDate(AUTHORIZATION_DATE_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_AUTH__CURRENCY_UOM_ID:
				setCurrencyUomId(CURRENCY_UOM_ID_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_AUTH__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_AUTH__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_AUTH__FIN_ACCOUNT_ID:
				setFinAccountId((FinAccount)null);
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
			case FinaccountPackage.FIN_ACCOUNT_AUTH__FIN_ACCOUNT_AUTH_ID:
				return FIN_ACCOUNT_AUTH_ID_EDEFAULT == null ? finAccountAuthId != null : !FIN_ACCOUNT_AUTH_ID_EDEFAULT.equals(finAccountAuthId);
			case FinaccountPackage.FIN_ACCOUNT_AUTH__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case FinaccountPackage.FIN_ACCOUNT_AUTH__AUTHORIZATION_DATE:
				return AUTHORIZATION_DATE_EDEFAULT == null ? authorizationDate != null : !AUTHORIZATION_DATE_EDEFAULT.equals(authorizationDate);
			case FinaccountPackage.FIN_ACCOUNT_AUTH__CURRENCY_UOM_ID:
				return CURRENCY_UOM_ID_EDEFAULT == null ? currencyUomId != null : !CURRENCY_UOM_ID_EDEFAULT.equals(currencyUomId);
			case FinaccountPackage.FIN_ACCOUNT_AUTH__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case FinaccountPackage.FIN_ACCOUNT_AUTH__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case FinaccountPackage.FIN_ACCOUNT_AUTH__FIN_ACCOUNT_ID:
				return finAccountId != null;
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
		result.append(" (finAccountAuthId: ");
		result.append(finAccountAuthId);
		result.append(", amount: ");
		result.append(amount);
		result.append(", authorizationDate: ");
		result.append(authorizationDate);
		result.append(", currencyUomId: ");
		result.append(currencyUomId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //FinAccountAuthImpl
