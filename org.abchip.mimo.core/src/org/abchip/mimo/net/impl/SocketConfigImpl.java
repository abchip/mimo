/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.net.impl;

import org.abchip.mimo.entity.impl.EntityImpl;

import org.abchip.mimo.net.NetPackage;
import org.abchip.mimo.net.SocketConfig;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SocketConfig</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.net.impl.SocketConfigImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.abchip.mimo.net.impl.SocketConfigImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SocketConfigImpl extends EntityImpl implements SocketConfig {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocketConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetPackage.Literals.SOCKET_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress() {
		return (String)eGet(NetPackage.Literals.SOCKET_CONFIG__ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(String newAddress) {
		eSet(NetPackage.Literals.SOCKET_CONFIG__ADDRESS, newAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPort() {
		return (Integer)eGet(NetPackage.Literals.SOCKET_CONFIG__PORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPort(int newPort) {
		eSet(NetPackage.Literals.SOCKET_CONFIG__PORT, newPort);
	}

} //SocketConfigImpl
