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

import org.abchip.mimo.biz.accounting.payment.Payment;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.accounting.payment.PaymentType;
import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentTypeImpl#getPaymentTypeId <em>Payment Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentTypeImpl#getPaymentGlAccountTypeMaps <em>Payment Gl Account Type Maps</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentTypeImpl#getPaymentTypeAttrs <em>Payment Type Attrs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentTypeImpl extends BizEntityTypeImpl<Payment> implements PaymentType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getPaymentTypeId() <em>Payment Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPaymentTypeId() <em>Payment Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentTypeId()
	 * @generated
	 * @ordered
	 */
	protected String paymentTypeId = PAYMENT_TYPE_ID_EDEFAULT;
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
	 * The default value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_TABLE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected boolean hasTable = HAS_TABLE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected PaymentType parentTypeId;

	/**
	 * The cached value of the '{@link #getPaymentGlAccountTypeMaps() <em>Payment Gl Account Type Maps</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentGlAccountTypeMaps()
	 * @generated
	 * @ordered
	 */
	protected EList<String> paymentGlAccountTypeMaps;
	/**
	 * The cached value of the '{@link #getPaymentTypeAttrs() <em>Payment Type Attrs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentTypeAttrs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> paymentTypeAttrs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT_TYPE;
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
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return hasTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		boolean oldHasTable = hasTable;
		hasTable = newHasTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_TYPE__HAS_TABLE, oldHasTable, hasTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (PaymentType)eResolveProxy(oldParentTypeId);
			if (parentTypeId != oldParentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
			}
		}
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(PaymentType newParentTypeId) {
		PaymentType oldParentTypeId = parentTypeId;
		parentTypeId = newParentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentTypeId() {
		return paymentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentTypeId(String newPaymentTypeId) {
		String oldPaymentTypeId = paymentTypeId;
		paymentTypeId = newPaymentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_TYPE__PAYMENT_TYPE_ID, oldPaymentTypeId, paymentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getPaymentGlAccountTypeMaps() {
		if (paymentGlAccountTypeMaps == null) {
			paymentGlAccountTypeMaps = new EDataTypeUniqueEList<String>(String.class, this, PaymentPackage.PAYMENT_TYPE__PAYMENT_GL_ACCOUNT_TYPE_MAPS);
		}
		return paymentGlAccountTypeMaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getPaymentTypeAttrs() {
		if (paymentTypeAttrs == null) {
			paymentTypeAttrs = new EDataTypeUniqueEList<String>(String.class, this, PaymentPackage.PAYMENT_TYPE__PAYMENT_TYPE_ATTRS);
		}
		return paymentTypeAttrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childPaymentTypes() {
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
			case PaymentPackage.PAYMENT_TYPE__PAYMENT_TYPE_ID:
				return getPaymentTypeId();
			case PaymentPackage.PAYMENT_TYPE__DESCRIPTION:
				return getDescription();
			case PaymentPackage.PAYMENT_TYPE__HAS_TABLE:
				return isHasTable();
			case PaymentPackage.PAYMENT_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
			case PaymentPackage.PAYMENT_TYPE__PAYMENT_GL_ACCOUNT_TYPE_MAPS:
				return getPaymentGlAccountTypeMaps();
			case PaymentPackage.PAYMENT_TYPE__PAYMENT_TYPE_ATTRS:
				return getPaymentTypeAttrs();
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
			case PaymentPackage.PAYMENT_TYPE__PAYMENT_TYPE_ID:
				setPaymentTypeId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PaymentPackage.PAYMENT_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case PaymentPackage.PAYMENT_TYPE__PARENT_TYPE_ID:
				setParentTypeId((PaymentType)newValue);
				return;
			case PaymentPackage.PAYMENT_TYPE__PAYMENT_GL_ACCOUNT_TYPE_MAPS:
				getPaymentGlAccountTypeMaps().clear();
				getPaymentGlAccountTypeMaps().addAll((Collection<? extends String>)newValue);
				return;
			case PaymentPackage.PAYMENT_TYPE__PAYMENT_TYPE_ATTRS:
				getPaymentTypeAttrs().clear();
				getPaymentTypeAttrs().addAll((Collection<? extends String>)newValue);
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
			case PaymentPackage.PAYMENT_TYPE__PAYMENT_TYPE_ID:
				setPaymentTypeId(PAYMENT_TYPE_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_TYPE__PARENT_TYPE_ID:
				setParentTypeId((PaymentType)null);
				return;
			case PaymentPackage.PAYMENT_TYPE__PAYMENT_GL_ACCOUNT_TYPE_MAPS:
				getPaymentGlAccountTypeMaps().clear();
				return;
			case PaymentPackage.PAYMENT_TYPE__PAYMENT_TYPE_ATTRS:
				getPaymentTypeAttrs().clear();
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
			case PaymentPackage.PAYMENT_TYPE__PAYMENT_TYPE_ID:
				return PAYMENT_TYPE_ID_EDEFAULT == null ? paymentTypeId != null : !PAYMENT_TYPE_ID_EDEFAULT.equals(paymentTypeId);
			case PaymentPackage.PAYMENT_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PaymentPackage.PAYMENT_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case PaymentPackage.PAYMENT_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
			case PaymentPackage.PAYMENT_TYPE__PAYMENT_GL_ACCOUNT_TYPE_MAPS:
				return paymentGlAccountTypeMaps != null && !paymentGlAccountTypeMaps.isEmpty();
			case PaymentPackage.PAYMENT_TYPE__PAYMENT_TYPE_ATTRS:
				return paymentTypeAttrs != null && !paymentTypeAttrs.isEmpty();
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
		result.append(" (paymentTypeId: ");
		result.append(paymentTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(", paymentGlAccountTypeMaps: ");
		result.append(paymentGlAccountTypeMaps);
		result.append(", paymentTypeAttrs: ");
		result.append(paymentTypeAttrs);
		result.append(')');
		return result.toString();
	}

} //PaymentTypeImpl
