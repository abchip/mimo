/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi.transmission.impl;

import org.abchip.mimo.edi.transmission.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransmissionFactoryImpl extends EFactoryImpl implements TransmissionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransmissionFactory init() {
		try {
			TransmissionFactory theTransmissionFactory = (TransmissionFactory)EPackage.Registry.INSTANCE.getEFactory(TransmissionPackage.eNS_URI);
			if (theTransmissionFactory != null) {
				return theTransmissionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TransmissionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TransmissionPackage.TRANSMITTER: return (EObject)createTransmitter();
			case TransmissionPackage.TRANSMITTER_TYPE: return (EObject)createTransmitterType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transmitter createTransmitter() {
		TransmitterImpl transmitter = new TransmitterImpl();
		return transmitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransmitterType createTransmitterType() {
		TransmitterTypeImpl transmitterType = new TransmitterTypeImpl();
		return transmitterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransmissionPackage getTransmissionPackage() {
		return (TransmissionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TransmissionPackage getPackage() {
		return TransmissionPackage.eINSTANCE;
	}

} //TransmissionFactoryImpl
