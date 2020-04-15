/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.service.reg;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.service.reg.ServiceRegistryReg#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.abchip.mimo.service.reg.ServiceRegistryReg#getInterfaceName <em>Interface Name</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.service.reg.RegPackage#getServiceRegistryReg()
 * @model
 * @generated
 */
public interface ServiceRegistryReg extends ServiceReg {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.service.reg.ServiceRegistryEntryReg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see org.abchip.mimo.service.reg.RegPackage#getServiceRegistryReg_Entries()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	List<ServiceRegistryEntryReg> getEntries();

	/**
	 * Returns the value of the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Name</em>' attribute.
	 * @see #setInterfaceName(String)
	 * @see org.abchip.mimo.service.reg.RegPackage#getServiceRegistryReg_InterfaceName()
	 * @model required="true"
	 * @generated
	 */
	@Override
	String getInterfaceName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.service.reg.ServiceRegistryReg#getInterfaceName <em>Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Name</em>' attribute.
	 * @see #getInterfaceName()
	 * @generated
	 */
	void setInterfaceName(String value);

} // Registry
