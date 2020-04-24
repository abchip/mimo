/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.service.impl;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.service.ServicePackage;
import org.abchip.mimo.service.ServiceRequest;
import org.abchip.mimo.service.ServiceResponse;
import org.abchip.mimo.util.Strings;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Request</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.abchip.mimo.service.impl.ServiceRequestImpl#getTenant
 * <em>Tenant</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ServiceRequestImpl<V extends ServiceResponse> extends ServiceMessageImpl implements ServiceRequest<V> {
	/**
	 * The default value of the '{@link #getTenant() <em>Tenant</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTenant()
	 * @generated
	 * @ordered
	 */
	protected static final String TENANT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTenant() <em>Tenant</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTenant()
	 * @generated
	 * @ordered
	 */
	protected String tenant = TENANT_EDEFAULT;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ServiceRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.SERVICE_REQUEST;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getTenant() {
		return tenant;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean isPrepared() {
		return getContext() != null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract void init(Context context, String tenant);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract V prepareResponse();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getServiceName() {
		return Strings.firstToLower(this.isa().getID());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ServicePackage.SERVICE_REQUEST__TENANT:
			return getTenant();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ServicePackage.SERVICE_REQUEST__TENANT:
			return TENANT_EDEFAULT == null ? tenant != null : !TENANT_EDEFAULT.equals(tenant);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (tenant: ");
		result.append(tenant);
		result.append(')');
		return result.toString();
	}

} // ServiceRequestImpl
