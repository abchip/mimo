/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.passport.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.passport.PassportPackage;
import org.abchip.mimo.biz.passport.ThirdPartyLogin;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Third Party Login</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.ThirdPartyLoginImpl#getLoginMethTypeId <em>Login Meth Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.ThirdPartyLoginImpl#getLoginProviderId <em>Login Provider Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.ThirdPartyLoginImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.ThirdPartyLoginImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.ThirdPartyLoginImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.ThirdPartyLoginImpl#getProductStoreId <em>Product Store Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThirdPartyLoginImpl extends BizEntityImpl implements ThirdPartyLogin {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getLoginMethTypeId() <em>Login Meth Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginMethTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGIN_METH_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoginMethTypeId() <em>Login Meth Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginMethTypeId()
	 * @generated
	 * @ordered
	 */
	protected String loginMethTypeId = LOGIN_METH_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoginProviderId() <em>Login Provider Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginProviderId()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGIN_PROVIDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoginProviderId() <em>Login Provider Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginProviderId()
	 * @generated
	 * @ordered
	 */
	protected String loginProviderId = LOGIN_PROVIDER_ID_EDEFAULT;

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
	 * The default value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected static final long SEQUENCE_NUM_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected long sequenceNum = SEQUENCE_NUM_EDEFAULT;

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
	 * The cached value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected ProductStore productStoreId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThirdPartyLoginImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PassportPackage.Literals.THIRD_PARTY_LOGIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStore getProductStoreId() {
		if (productStoreId != null && ((EObject)productStoreId).eIsProxy()) {
			InternalEObject oldProductStoreId = (InternalEObject)productStoreId;
			productStoreId = (ProductStore)eResolveProxy(oldProductStoreId);
			if (productStoreId != oldProductStoreId) {
			}
		}
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductStore basicGetProductStoreId() {
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(ProductStore newProductStoreId) {
		productStoreId = newProductStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLoginMethTypeId() {
		return loginMethTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoginMethTypeId(String newLoginMethTypeId) {
		loginMethTypeId = newLoginMethTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLoginProviderId() {
		return loginProviderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoginProviderId(String newLoginProviderId) {
		loginProviderId = newLoginProviderId;
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
		fromDate = newFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceNum() {
		return sequenceNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNum(long newSequenceNum) {
		sequenceNum = newSequenceNum;
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
		thruDate = newThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PassportPackage.THIRD_PARTY_LOGIN__LOGIN_METH_TYPE_ID:
				return getLoginMethTypeId();
			case PassportPackage.THIRD_PARTY_LOGIN__LOGIN_PROVIDER_ID:
				return getLoginProviderId();
			case PassportPackage.THIRD_PARTY_LOGIN__FROM_DATE:
				return getFromDate();
			case PassportPackage.THIRD_PARTY_LOGIN__SEQUENCE_NUM:
				return getSequenceNum();
			case PassportPackage.THIRD_PARTY_LOGIN__THRU_DATE:
				return getThruDate();
			case PassportPackage.THIRD_PARTY_LOGIN__PRODUCT_STORE_ID:
				if (resolve) return getProductStoreId();
				return basicGetProductStoreId();
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
			case PassportPackage.THIRD_PARTY_LOGIN__LOGIN_METH_TYPE_ID:
				setLoginMethTypeId((String)newValue);
				return;
			case PassportPackage.THIRD_PARTY_LOGIN__LOGIN_PROVIDER_ID:
				setLoginProviderId((String)newValue);
				return;
			case PassportPackage.THIRD_PARTY_LOGIN__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case PassportPackage.THIRD_PARTY_LOGIN__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case PassportPackage.THIRD_PARTY_LOGIN__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case PassportPackage.THIRD_PARTY_LOGIN__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)newValue);
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
			case PassportPackage.THIRD_PARTY_LOGIN__LOGIN_METH_TYPE_ID:
				setLoginMethTypeId(LOGIN_METH_TYPE_ID_EDEFAULT);
				return;
			case PassportPackage.THIRD_PARTY_LOGIN__LOGIN_PROVIDER_ID:
				setLoginProviderId(LOGIN_PROVIDER_ID_EDEFAULT);
				return;
			case PassportPackage.THIRD_PARTY_LOGIN__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case PassportPackage.THIRD_PARTY_LOGIN__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case PassportPackage.THIRD_PARTY_LOGIN__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case PassportPackage.THIRD_PARTY_LOGIN__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)null);
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
			case PassportPackage.THIRD_PARTY_LOGIN__LOGIN_METH_TYPE_ID:
				return LOGIN_METH_TYPE_ID_EDEFAULT == null ? loginMethTypeId != null : !LOGIN_METH_TYPE_ID_EDEFAULT.equals(loginMethTypeId);
			case PassportPackage.THIRD_PARTY_LOGIN__LOGIN_PROVIDER_ID:
				return LOGIN_PROVIDER_ID_EDEFAULT == null ? loginProviderId != null : !LOGIN_PROVIDER_ID_EDEFAULT.equals(loginProviderId);
			case PassportPackage.THIRD_PARTY_LOGIN__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case PassportPackage.THIRD_PARTY_LOGIN__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case PassportPackage.THIRD_PARTY_LOGIN__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case PassportPackage.THIRD_PARTY_LOGIN__PRODUCT_STORE_ID:
				return productStoreId != null;
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
		result.append(" (loginMethTypeId: ");
		result.append(loginMethTypeId);
		result.append(", loginProviderId: ");
		result.append(loginProviderId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //ThirdPartyLoginImpl
