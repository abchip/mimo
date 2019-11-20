/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.audio;

import org.abchip.mimo.entity.EntityPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.audio.AudioFactory
 * @model kind="package"
 * @generated
 */
public interface AudioPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "audio";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/audio";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mimo-audio";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AudioPackage eINSTANCE = org.abchip.mimo.audio.impl.AudioPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.audio.impl.AudioImpl <em>Audio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.audio.impl.AudioImpl
	 * @see org.abchip.mimo.audio.impl.AudioPackageImpl#getAudio()
	 * @generated
	 */
	int AUDIO = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__CONTENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__TEXT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Audio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.audio.AudioManager <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.audio.AudioManager
	 * @see org.abchip.mimo.audio.impl.AudioPackageImpl#getAudioManager()
	 * @generated
	 */
	int AUDIO_MANAGER = 1;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.audio.AudioRecorder <em>Recorder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.audio.AudioRecorder
	 * @see org.abchip.mimo.audio.impl.AudioPackageImpl#getAudioRecorder()
	 * @generated
	 */
	int AUDIO_RECORDER = 2;

	/**
	 * The number of structural features of the '<em>Recorder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_RECORDER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.audio.AudioPlayer <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.audio.AudioPlayer
	 * @see org.abchip.mimo.audio.impl.AudioPackageImpl#getAudioPlayer()
	 * @generated
	 */
	int AUDIO_PLAYER = 3;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_PLAYER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.audio.AudioStyle <em>Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.audio.AudioStyle
	 * @see org.abchip.mimo.audio.impl.AudioPackageImpl#getAudioStyle()
	 * @generated
	 */
	int AUDIO_STYLE = 4;

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.audio.Audio <em>Audio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio</em>'.
	 * @see org.abchip.mimo.audio.Audio
	 * @generated
	 */
	EClass getAudio();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.audio.Audio#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.abchip.mimo.audio.Audio#getContent()
	 * @see #getAudio()
	 * @generated
	 */
	EAttribute getAudio_Content();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.audio.Audio#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.audio.Audio#getName()
	 * @see #getAudio()
	 * @generated
	 */
	EAttribute getAudio_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.audio.Audio#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.abchip.mimo.audio.Audio#getText()
	 * @see #getAudio()
	 * @generated
	 */
	EAttribute getAudio_Text();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.audio.AudioManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see org.abchip.mimo.audio.AudioManager
	 * @generated
	 */
	EClass getAudioManager();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.audio.AudioRecorder <em>Recorder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recorder</em>'.
	 * @see org.abchip.mimo.audio.AudioRecorder
	 * @generated
	 */
	EClass getAudioRecorder();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.audio.AudioPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see org.abchip.mimo.audio.AudioPlayer
	 * @generated
	 */
	EClass getAudioPlayer();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.audio.AudioStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Style</em>'.
	 * @see org.abchip.mimo.audio.AudioStyle
	 * @generated
	 */
	EEnum getAudioStyle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AudioFactory getAudioFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.audio.impl.AudioImpl <em>Audio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.audio.impl.AudioImpl
		 * @see org.abchip.mimo.audio.impl.AudioPackageImpl#getAudio()
		 * @generated
		 */
		EClass AUDIO = eINSTANCE.getAudio();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO__CONTENT = eINSTANCE.getAudio_Content();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO__NAME = eINSTANCE.getAudio_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO__TEXT = eINSTANCE.getAudio_Text();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.audio.AudioManager <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.audio.AudioManager
		 * @see org.abchip.mimo.audio.impl.AudioPackageImpl#getAudioManager()
		 * @generated
		 */
		EClass AUDIO_MANAGER = eINSTANCE.getAudioManager();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.audio.AudioRecorder <em>Recorder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.audio.AudioRecorder
		 * @see org.abchip.mimo.audio.impl.AudioPackageImpl#getAudioRecorder()
		 * @generated
		 */
		EClass AUDIO_RECORDER = eINSTANCE.getAudioRecorder();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.audio.AudioPlayer <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.audio.AudioPlayer
		 * @see org.abchip.mimo.audio.impl.AudioPackageImpl#getAudioPlayer()
		 * @generated
		 */
		EClass AUDIO_PLAYER = eINSTANCE.getAudioPlayer();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.audio.AudioStyle <em>Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.audio.AudioStyle
		 * @see org.abchip.mimo.audio.impl.AudioPackageImpl#getAudioStyle()
		 * @generated
		 */
		EEnum AUDIO_STYLE = eINSTANCE.getAudioStyle();

	}

} //AudioPackage
