/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi.impl;

import org.abchip.mimo.context.Context;

import org.abchip.mimo.edi.DataInterchangeException;
import org.abchip.mimo.edi.EDIPackage;
import org.abchip.mimo.edi.Transmitter;

import org.abchip.mimo.edi.message.Message;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transmitter</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TransmitterImpl extends MinimalEObjectImpl.Container implements Transmitter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransmitterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDIPackage.Literals.TRANSMITTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public abstract void transmitMessage(Context context, Message message) throws DataInterchangeException;

} //TransmitterImpl
