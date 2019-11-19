/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.audio;

import java.io.OutputStream;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recording</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.audio.AudioPackage#getAudioRecorder()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AudioRecorder {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.abchip.mimo.java.JavaOutputStream"
	 * @generated
	 */
	OutputStream getOutputStream();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void stop();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isStopped();

} // AudioRecorder
