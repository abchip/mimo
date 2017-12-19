/**
 * Copyright (c) 2017, 2018 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.audio;

import org.abchip.mimo.context.ContextProvider;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.audio.AudioPackage#getAudioManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AudioManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true"
	 * @generated
	 */
	AudioRecorder record(ContextProvider contextProvider);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" audioRequired="true" startRequired="true" waitEndRequired="true"
	 * @generated
	 */
	AudioPlayer play(ContextProvider contextProvider, Audio audio, boolean start, boolean waitEnd);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" styleRequired="true" textRequired="true" startRequired="true" waitEndRequired="true"
	 * @generated
	 */
	AudioPlayer play(ContextProvider contextProvider, AudioStyle style, String text, boolean start, boolean waitEnd);

} // AudioManager
