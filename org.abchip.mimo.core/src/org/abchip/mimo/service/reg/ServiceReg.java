/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.service.reg;

import org.abchip.mimo.entity.Entity;

import org.abchip.mimo.service.ServiceStatus;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Reg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.service.reg.ServiceReg#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.abchip.mimo.service.reg.ServiceReg#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.service.reg.RegPackage#getServiceReg()
 * @model abstract="true"
 * @generated
 */
public interface ServiceReg extends Entity {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see org.abchip.mimo.service.reg.RegPackage#getServiceReg_ClassName()
	 * @model required="true"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.service.reg.ServiceReg#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.service.ServiceStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.abchip.mimo.service.ServiceStatus
	 * @see #setStatus(ServiceStatus)
	 * @see org.abchip.mimo.service.reg.RegPackage#getServiceReg_Status()
	 * @model required="true"
	 * @generated
	 */
	ServiceStatus getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.service.reg.ServiceReg#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.abchip.mimo.service.ServiceStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ServiceStatus value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getInterfaceName();

} // ServiceReg
