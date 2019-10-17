/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi.transmission;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.edi.transmission.TransmissionPackage
 * @generated
 */
public interface TransmissionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransmissionFactory eINSTANCE = org.abchip.mimo.edi.transmission.impl.TransmissionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Transmitter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transmitter</em>'.
	 * @generated
	 */
	Transmitter createTransmitter();

	/**
	 * Returns a new object of class '<em>Transmitter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transmitter Type</em>'.
	 * @generated
	 */
	TransmitterType createTransmitterType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TransmissionPackage getTransmissionPackage();

} //TransmissionFactory
