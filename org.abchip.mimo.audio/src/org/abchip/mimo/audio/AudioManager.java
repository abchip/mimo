/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.audio;

import org.abchip.mimo.context.Context;

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
	 * @model contextRequired="true"
	 * @generated
	 */
	AudioRecorder record(Context context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" audioRequired="true" startRequired="true" waitEndRequired="true"
	 * @generated
	 */
	AudioPlayer play(Context context, Audio audio, boolean start, boolean waitEnd);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" styleRequired="true" textRequired="true" startRequired="true" waitEndRequired="true"
	 * @generated
	 */
	AudioPlayer play(Context context, AudioStyle style, String text, boolean start, boolean waitEnd);

} // AudioManager
