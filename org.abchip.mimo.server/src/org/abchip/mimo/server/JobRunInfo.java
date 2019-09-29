/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.server;

import org.abchip.mimo.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Run Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.server.JobRunInfo#getMemorySize <em>Memory Size</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.server.ServerPackage#getJobRunInfo()
 * @model
 * @generated
 */
public interface JobRunInfo extends Entity {
	/**
	 * Returns the value of the '<em><b>Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Size</em>' attribute.
	 * @see #setMemorySize(long)
	 * @see org.abchip.mimo.server.ServerPackage#getJobRunInfo_MemorySize()
	 * @model
	 * @generated
	 */
	long getMemorySize();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.JobRunInfo#getMemorySize <em>Memory Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Size</em>' attribute.
	 * @see #getMemorySize()
	 * @generated
	 */
	void setMemorySize(long value);

} // JobRunInfo
