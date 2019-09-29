/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.server.impl;

import java.lang.management.ManagementFactory;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.entity.impl.EntityNameableImpl;
import org.abchip.mimo.server.ServerPackage;
import org.abchip.mimo.server.SystemStatus;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.server.impl.SystemImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.abchip.mimo.server.impl.SystemImpl#getLastJobNumber <em>Last Job Number</em>}</li>
 *   <li>{@link org.abchip.mimo.server.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.server.impl.SystemImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.abchip.mimo.server.impl.SystemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.server.impl.SystemImpl#getSystemUser <em>System User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends EntityNameableImpl implements org.abchip.mimo.server.System {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Context context;

	/**
	 * The default value of the '{@link #getLastJobNumber() <em>Last Job Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastJobNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int LAST_JOB_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLastJobNumber() <em>Last Job Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastJobNumber()
	 * @generated
	 * @ordered
	 */
	protected int lastJobNumber = LAST_JOB_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final SystemStatus STATUS_EDEFAULT = SystemStatus.STOPPED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected SystemStatus status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemUser() <em>System User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUser()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemUser() <em>System User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUser()
	 * @generated
	 * @ordered
	 */
	protected String systemUser = SYSTEM_USER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServerPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Context getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Context newContext, NotificationChain msgs) {
		Context oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServerPackage.SYSTEM__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(Context newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServerPackage.SYSTEM__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServerPackage.SYSTEM__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.SYSTEM__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLastJobNumber() {
		return lastJobNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastJobNumber(int newLastJobNumber) {
		int oldLastJobNumber = lastJobNumber;
		lastJobNumber = newLastJobNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.SYSTEM__LAST_JOB_NUMBER, oldLastJobNumber, lastJobNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.SYSTEM__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(SystemStatus newStatus) {
		SystemStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.SYSTEM__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemUser() {
		return systemUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemUser(String newSystemUser) {
		String oldSystemUser = systemUser;
		systemUser = newSystemUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.SYSTEM__SYSTEM_USER, oldSystemUser, systemUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getAvailableProcessors() {
		return ManagementFactory.getOperatingSystemMXBean().getAvailableProcessors();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getLoadAverage() {
		return ManagementFactory.getOperatingSystemMXBean().getSystemLoadAverage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextDescription getContextDescription() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServerPackage.SYSTEM__CONTEXT:
				return basicSetContext(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServerPackage.SYSTEM__CONTEXT:
				return getContext();
			case ServerPackage.SYSTEM__LAST_JOB_NUMBER:
				return getLastJobNumber();
			case ServerPackage.SYSTEM__NAME:
				return getName();
			case ServerPackage.SYSTEM__PORT:
				return getPort();
			case ServerPackage.SYSTEM__STATUS:
				return getStatus();
			case ServerPackage.SYSTEM__SYSTEM_USER:
				return getSystemUser();
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
			case ServerPackage.SYSTEM__CONTEXT:
				setContext((Context)newValue);
				return;
			case ServerPackage.SYSTEM__LAST_JOB_NUMBER:
				setLastJobNumber((Integer)newValue);
				return;
			case ServerPackage.SYSTEM__NAME:
				setName((String)newValue);
				return;
			case ServerPackage.SYSTEM__PORT:
				setPort((Integer)newValue);
				return;
			case ServerPackage.SYSTEM__STATUS:
				setStatus((SystemStatus)newValue);
				return;
			case ServerPackage.SYSTEM__SYSTEM_USER:
				setSystemUser((String)newValue);
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
			case ServerPackage.SYSTEM__CONTEXT:
				setContext((Context)null);
				return;
			case ServerPackage.SYSTEM__LAST_JOB_NUMBER:
				setLastJobNumber(LAST_JOB_NUMBER_EDEFAULT);
				return;
			case ServerPackage.SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ServerPackage.SYSTEM__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case ServerPackage.SYSTEM__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ServerPackage.SYSTEM__SYSTEM_USER:
				setSystemUser(SYSTEM_USER_EDEFAULT);
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
			case ServerPackage.SYSTEM__CONTEXT:
				return context != null;
			case ServerPackage.SYSTEM__LAST_JOB_NUMBER:
				return lastJobNumber != LAST_JOB_NUMBER_EDEFAULT;
			case ServerPackage.SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ServerPackage.SYSTEM__PORT:
				return port != PORT_EDEFAULT;
			case ServerPackage.SYSTEM__STATUS:
				return status != STATUS_EDEFAULT;
			case ServerPackage.SYSTEM__SYSTEM_USER:
				return SYSTEM_USER_EDEFAULT == null ? systemUser != null : !SYSTEM_USER_EDEFAULT.equals(systemUser);
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
		result.append(" (lastJobNumber: ");
		result.append(lastJobNumber);
		result.append(", name: ");
		result.append(name);
		result.append(", port: ");
		result.append(port);
		result.append(", status: ");
		result.append(status);
		result.append(", systemUser: ");
		result.append(systemUser);
		result.append(')');
		return result.toString();
	}

} //SystemImpl
