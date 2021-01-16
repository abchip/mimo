/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.server;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.server.ServerPackage#getSystemManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SystemManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.server.ServerException" systemRequired="true"
	 * @generated
	 */
	Job start(org.abchip.mimo.server.System system) throws ServerException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.server.ServerException"
	 * @generated
	 */
	void stop() throws ServerException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listenerRequired="true"
	 * @generated
	 */
	void registerListener(SystemListener listener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model statusRequired="true"
	 * @generated
	 */
	void updateStatus(SystemStatus status);

} // SystemManager
