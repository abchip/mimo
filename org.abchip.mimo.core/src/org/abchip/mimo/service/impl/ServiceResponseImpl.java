/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.service.impl;

import org.abchip.mimo.service.ServicePackage;
import org.abchip.mimo.service.ServiceResponse;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.service.impl.ServiceResponseImpl#isError <em>Error</em>}</li>
 *   <li>{@link org.abchip.mimo.service.impl.ServiceResponseImpl#getErrorMessage <em>Error Message</em>}</li>
 *   <li>{@link org.abchip.mimo.service.impl.ServiceResponseImpl#getResponseMessage <em>Response Message</em>}</li>
 *   <li>{@link org.abchip.mimo.service.impl.ServiceResponseImpl#getSuccessMessage <em>Success Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ServiceResponseImpl extends ServiceMessageImpl implements ServiceResponse {
	/**
	 * The default value of the '{@link #isError() <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isError()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ERROR_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isError() <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isError()
	 * @generated
	 * @ordered
	 */
	protected boolean error = ERROR_EDEFAULT;
	/**
	 * The default value of the '{@link #getErrorMessage() <em>Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_MESSAGE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getErrorMessage() <em>Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorMessage()
	 * @generated
	 * @ordered
	 */
	protected String errorMessage = ERROR_MESSAGE_EDEFAULT;
	/**
	 * The default value of the '{@link #getResponseMessage() <em>Response Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_MESSAGE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getResponseMessage() <em>Response Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseMessage()
	 * @generated
	 * @ordered
	 */
	protected String responseMessage = RESPONSE_MESSAGE_EDEFAULT;
	/**
	 * The default value of the '{@link #getSuccessMessage() <em>Success Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String SUCCESS_MESSAGE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSuccessMessage() <em>Success Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessMessage()
	 * @generated
	 * @ordered
	 */
	protected String successMessage = SUCCESS_MESSAGE_EDEFAULT;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.SERVICE_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isError() {
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setError(boolean newError) {
		boolean oldError = error;
		error = newError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_RESPONSE__ERROR, oldError, error));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorMessage(String newErrorMessage) {
		String oldErrorMessage = errorMessage;
		errorMessage = newErrorMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_RESPONSE__ERROR_MESSAGE, oldErrorMessage, errorMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResponseMessage() {
		return responseMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseMessage(String newResponseMessage) {
		String oldResponseMessage = responseMessage;
		responseMessage = newResponseMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_RESPONSE__RESPONSE_MESSAGE, oldResponseMessage, responseMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuccessMessage() {
		return successMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuccessMessage(String newSuccessMessage) {
		String oldSuccessMessage = successMessage;
		successMessage = newSuccessMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.SERVICE_RESPONSE__SUCCESS_MESSAGE, oldSuccessMessage, successMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.SERVICE_RESPONSE__ERROR:
				return isError();
			case ServicePackage.SERVICE_RESPONSE__ERROR_MESSAGE:
				return getErrorMessage();
			case ServicePackage.SERVICE_RESPONSE__RESPONSE_MESSAGE:
				return getResponseMessage();
			case ServicePackage.SERVICE_RESPONSE__SUCCESS_MESSAGE:
				return getSuccessMessage();
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
			case ServicePackage.SERVICE_RESPONSE__ERROR:
				setError((Boolean)newValue);
				return;
			case ServicePackage.SERVICE_RESPONSE__ERROR_MESSAGE:
				setErrorMessage((String)newValue);
				return;
			case ServicePackage.SERVICE_RESPONSE__RESPONSE_MESSAGE:
				setResponseMessage((String)newValue);
				return;
			case ServicePackage.SERVICE_RESPONSE__SUCCESS_MESSAGE:
				setSuccessMessage((String)newValue);
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
			case ServicePackage.SERVICE_RESPONSE__ERROR:
				setError(ERROR_EDEFAULT);
				return;
			case ServicePackage.SERVICE_RESPONSE__ERROR_MESSAGE:
				setErrorMessage(ERROR_MESSAGE_EDEFAULT);
				return;
			case ServicePackage.SERVICE_RESPONSE__RESPONSE_MESSAGE:
				setResponseMessage(RESPONSE_MESSAGE_EDEFAULT);
				return;
			case ServicePackage.SERVICE_RESPONSE__SUCCESS_MESSAGE:
				setSuccessMessage(SUCCESS_MESSAGE_EDEFAULT);
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
			case ServicePackage.SERVICE_RESPONSE__ERROR:
				return error != ERROR_EDEFAULT;
			case ServicePackage.SERVICE_RESPONSE__ERROR_MESSAGE:
				return ERROR_MESSAGE_EDEFAULT == null ? errorMessage != null : !ERROR_MESSAGE_EDEFAULT.equals(errorMessage);
			case ServicePackage.SERVICE_RESPONSE__RESPONSE_MESSAGE:
				return RESPONSE_MESSAGE_EDEFAULT == null ? responseMessage != null : !RESPONSE_MESSAGE_EDEFAULT.equals(responseMessage);
			case ServicePackage.SERVICE_RESPONSE__SUCCESS_MESSAGE:
				return SUCCESS_MESSAGE_EDEFAULT == null ? successMessage != null : !SUCCESS_MESSAGE_EDEFAULT.equals(successMessage);
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
		result.append(" (error: ");
		result.append(error);
		result.append(", errorMessage: ");
		result.append(errorMessage);
		result.append(", responseMessage: ");
		result.append(responseMessage);
		result.append(", successMessage: ");
		result.append(successMessage);
		result.append(')');
		return result.toString();
	}

} //ServiceResponseImpl
