/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Method Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentMethodTypeImpl#getPaymentMethodTypeId <em>Payment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentMethodTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentMethodTypeImpl#getDefaultGlAccountId <em>Default Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentMethodTypeImpl#getPaymentMethodTypeGlAccounts <em>Payment Method Type Gl Accounts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentMethodTypeImpl extends BizEntityTypeImpl<PaymentMethod> implements PaymentMethodType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getPaymentMethodTypeId() <em>Payment Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_METHOD_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentMethodTypeId() <em>Payment Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected String paymentMethodTypeId = PAYMENT_METHOD_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;
	/**
	 * The cached value of the '{@link #getDefaultGlAccountId() <em>Default Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected GlAccount defaultGlAccountId;

	/**
	 * The cached value of the '{@link #getPaymentMethodTypeGlAccounts() <em>Payment Method Type Gl Accounts</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethodTypeGlAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<String> paymentMethodTypeGlAccounts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentMethodTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT_METHOD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccount getDefaultGlAccountId() {
		if (defaultGlAccountId != null && ((EObject)defaultGlAccountId).eIsProxy()) {
			InternalEObject oldDefaultGlAccountId = (InternalEObject)defaultGlAccountId;
			defaultGlAccountId = (GlAccount)eResolveProxy(oldDefaultGlAccountId);
			if (defaultGlAccountId != oldDefaultGlAccountId) {
			}
		}
		return defaultGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccount basicGetDefaultGlAccountId() {
		return defaultGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultGlAccountId(GlAccount newDefaultGlAccountId) {
		defaultGlAccountId = newDefaultGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentMethodTypeId() {
		return paymentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodTypeId(String newPaymentMethodTypeId) {
		paymentMethodTypeId = newPaymentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getPaymentMethodTypeGlAccounts() {
		if (paymentMethodTypeGlAccounts == null) {
			paymentMethodTypeGlAccounts = new BasicInternalEList<String>(String.class);
		}
		return paymentMethodTypeGlAccounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> orderPaymentPreferences() {
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
	public List<String> paymentGatewayResponses() {
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
	public List<String> paymentMethods() {
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
	public List<String> payments() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.PAYMENT_METHOD_TYPE__PAYMENT_METHOD_TYPE_ID:
				return getPaymentMethodTypeId();
			case PaymentPackage.PAYMENT_METHOD_TYPE__DESCRIPTION:
				return getDescription();
			case PaymentPackage.PAYMENT_METHOD_TYPE__DEFAULT_GL_ACCOUNT_ID:
				if (resolve) return getDefaultGlAccountId();
				return basicGetDefaultGlAccountId();
			case PaymentPackage.PAYMENT_METHOD_TYPE__PAYMENT_METHOD_TYPE_GL_ACCOUNTS:
				return getPaymentMethodTypeGlAccounts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PaymentPackage.PAYMENT_METHOD_TYPE__PAYMENT_METHOD_TYPE_ID:
				setPaymentMethodTypeId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_METHOD_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PaymentPackage.PAYMENT_METHOD_TYPE__DEFAULT_GL_ACCOUNT_ID:
				setDefaultGlAccountId((GlAccount)newValue);
				return;
			case PaymentPackage.PAYMENT_METHOD_TYPE__PAYMENT_METHOD_TYPE_GL_ACCOUNTS:
				getPaymentMethodTypeGlAccounts().clear();
				getPaymentMethodTypeGlAccounts().addAll((Collection<? extends String>)newValue);
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
			case PaymentPackage.PAYMENT_METHOD_TYPE__PAYMENT_METHOD_TYPE_ID:
				setPaymentMethodTypeId(PAYMENT_METHOD_TYPE_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_METHOD_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_METHOD_TYPE__DEFAULT_GL_ACCOUNT_ID:
				setDefaultGlAccountId((GlAccount)null);
				return;
			case PaymentPackage.PAYMENT_METHOD_TYPE__PAYMENT_METHOD_TYPE_GL_ACCOUNTS:
				getPaymentMethodTypeGlAccounts().clear();
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
			case PaymentPackage.PAYMENT_METHOD_TYPE__PAYMENT_METHOD_TYPE_ID:
				return PAYMENT_METHOD_TYPE_ID_EDEFAULT == null ? paymentMethodTypeId != null : !PAYMENT_METHOD_TYPE_ID_EDEFAULT.equals(paymentMethodTypeId);
			case PaymentPackage.PAYMENT_METHOD_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PaymentPackage.PAYMENT_METHOD_TYPE__DEFAULT_GL_ACCOUNT_ID:
				return defaultGlAccountId != null;
			case PaymentPackage.PAYMENT_METHOD_TYPE__PAYMENT_METHOD_TYPE_GL_ACCOUNTS:
				return paymentMethodTypeGlAccounts != null && !paymentMethodTypeGlAccounts.isEmpty();
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
		result.append(" (paymentMethodTypeId: ");
		result.append(paymentMethodTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", paymentMethodTypeGlAccounts: ");
		result.append(paymentMethodTypeGlAccounts);
		result.append(')');
		return result.toString();
	}

} //PaymentMethodTypeImpl
