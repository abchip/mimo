/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.server;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.server.ServerPackage#getJobListener()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface JobListener {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model eventRequired="true"
	 * @generated
	 */
	void handleEvent(JobEvent event);

} // JobListener
