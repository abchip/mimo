/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.application.impl;

import org.abchip.mimo.application.ApplicationPackage;
import org.abchip.mimo.application.HttpServiceConfig;
import org.abchip.mimo.application.SocketConfig;

import org.abchip.mimo.entity.impl.EntityImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Http Service Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.application.impl.HttpServiceConfigImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.abchip.mimo.application.impl.HttpServiceConfigImpl#getSocket <em>Socket</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HttpServiceConfigImpl extends EntityImpl implements HttpServiceConfig {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSocket() <em>Socket</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocket()
	 * @generated
	 * @ordered
	 */
	protected SocketConfig socket;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HttpServiceConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.HTTP_SERVICE_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.HTTP_SERVICE_CONFIG__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SocketConfig getSocket() {
		if (socket != null && ((EObject)socket).eIsProxy()) {
			InternalEObject oldSocket = (InternalEObject)socket;
			socket = (SocketConfig)eResolveProxy(oldSocket);
			if (socket != oldSocket) {
				InternalEObject newSocket = (InternalEObject)socket;
				NotificationChain msgs = oldSocket.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.HTTP_SERVICE_CONFIG__SOCKET, null, null);
				if (newSocket.eInternalContainer() == null) {
					msgs = newSocket.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.HTTP_SERVICE_CONFIG__SOCKET, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.HTTP_SERVICE_CONFIG__SOCKET, oldSocket, socket));
			}
		}
		return socket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocketConfig basicGetSocket() {
		return socket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSocket(SocketConfig newSocket, NotificationChain msgs) {
		SocketConfig oldSocket = socket;
		socket = newSocket;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.HTTP_SERVICE_CONFIG__SOCKET, oldSocket, newSocket);
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
	public void setSocket(SocketConfig newSocket) {
		if (newSocket != socket) {
			NotificationChain msgs = null;
			if (socket != null)
				msgs = ((InternalEObject)socket).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.HTTP_SERVICE_CONFIG__SOCKET, null, msgs);
			if (newSocket != null)
				msgs = ((InternalEObject)newSocket).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.HTTP_SERVICE_CONFIG__SOCKET, null, msgs);
			msgs = basicSetSocket(newSocket, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.HTTP_SERVICE_CONFIG__SOCKET, newSocket, newSocket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.HTTP_SERVICE_CONFIG__SOCKET:
				return basicSetSocket(null, msgs);
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
			case ApplicationPackage.HTTP_SERVICE_CONFIG__PATH:
				return getPath();
			case ApplicationPackage.HTTP_SERVICE_CONFIG__SOCKET:
				if (resolve) return getSocket();
				return basicGetSocket();
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
			case ApplicationPackage.HTTP_SERVICE_CONFIG__PATH:
				setPath((String)newValue);
				return;
			case ApplicationPackage.HTTP_SERVICE_CONFIG__SOCKET:
				setSocket((SocketConfig)newValue);
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
			case ApplicationPackage.HTTP_SERVICE_CONFIG__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case ApplicationPackage.HTTP_SERVICE_CONFIG__SOCKET:
				setSocket((SocketConfig)null);
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
			case ApplicationPackage.HTTP_SERVICE_CONFIG__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case ApplicationPackage.HTTP_SERVICE_CONFIG__SOCKET:
				return socket != null;
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
		result.append(" (path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //HttpServiceConfigImpl
