/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.database.definition.impl;

import org.abchip.mimo.database.definition.DatabaseDefinitionPackage;
import org.abchip.mimo.database.definition.ReleaseStatement;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Release Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.definition.impl.ReleaseStatementImpl#getServerName <em>Server Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReleaseStatementImpl extends DefinitionStatementImpl implements ReleaseStatement {

	/**
	 * The default value of the '{@link #getServerName() <em>Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerName() <em>Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerName()
	 * @generated
	 * @ordered
	 */
	protected String serverName = SERVER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReleaseStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabaseDefinitionPackage.Literals.RELEASE_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServerName() {
		return serverName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerName(String newServerName) {
		String oldServerName = serverName;
		serverName = newServerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseDefinitionPackage.RELEASE_STATEMENT__SERVER_NAME, oldServerName, serverName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatabaseDefinitionPackage.RELEASE_STATEMENT__SERVER_NAME:
				return getServerName();
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
			case DatabaseDefinitionPackage.RELEASE_STATEMENT__SERVER_NAME:
				setServerName((String)newValue);
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
			case DatabaseDefinitionPackage.RELEASE_STATEMENT__SERVER_NAME:
				setServerName(SERVER_NAME_EDEFAULT);
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
			case DatabaseDefinitionPackage.RELEASE_STATEMENT__SERVER_NAME:
				return SERVER_NAME_EDEFAULT == null ? serverName != null : !SERVER_NAME_EDEFAULT.equals(serverName);
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
		result.append(" (serverName: ");
		result.append(serverName);
		result.append(')');
		return result.toString();
	}

} //ReleaseStatementImpl
