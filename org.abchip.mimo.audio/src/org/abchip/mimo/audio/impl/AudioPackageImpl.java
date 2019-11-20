/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.audio.impl;

import org.abchip.mimo.MimoPackage;

import org.abchip.mimo.audio.Audio;
import org.abchip.mimo.audio.AudioFactory;
import org.abchip.mimo.audio.AudioManager;
import org.abchip.mimo.audio.AudioPackage;
import org.abchip.mimo.audio.AudioPlayer;
import org.abchip.mimo.audio.AudioRecorder;

import org.abchip.mimo.audio.AudioStyle;
import org.abchip.mimo.context.ContextPackage;

import org.abchip.mimo.entity.EntityPackage;

import org.abchip.mimo.java.JavaPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AudioPackageImpl extends EPackageImpl implements AudioPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioRecorderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioPlayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum audioStyleEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.abchip.mimo.audio.AudioPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AudioPackageImpl() {
		super(eNS_URI, AudioFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AudioPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AudioPackage init() {
		if (isInited) return (AudioPackage)EPackage.Registry.INSTANCE.getEPackage(AudioPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAudioPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AudioPackageImpl theAudioPackage = registeredAudioPackage instanceof AudioPackageImpl ? (AudioPackageImpl)registeredAudioPackage : new AudioPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		MimoPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAudioPackage.createPackageContents();

		// Initialize created meta-data
		theAudioPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAudioPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AudioPackage.eNS_URI, theAudioPackage);
		return theAudioPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAudio() {
		return audioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudio_Content() {
		return (EAttribute)audioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudio_Name() {
		return (EAttribute)audioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAudio_Text() {
		return (EAttribute)audioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAudioManager() {
		return audioManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAudioRecorder() {
		return audioRecorderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAudioPlayer() {
		return audioPlayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAudioStyle() {
		return audioStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AudioFactory getAudioFactory() {
		return (AudioFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		audioEClass = createEClass(AUDIO);
		createEAttribute(audioEClass, AUDIO__CONTENT);
		createEAttribute(audioEClass, AUDIO__NAME);
		createEAttribute(audioEClass, AUDIO__TEXT);

		audioManagerEClass = createEClass(AUDIO_MANAGER);

		audioRecorderEClass = createEClass(AUDIO_RECORDER);

		audioPlayerEClass = createEClass(AUDIO_PLAYER);

		// Create enums
		audioStyleEEnum = createEEnum(AUDIO_STYLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		ContextPackage theContextPackage = (ContextPackage)EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
		JavaPackage theJavaPackage = (JavaPackage)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		audioEClass.getESuperTypes().add(theEntityPackage.getEntityIdentifiable());
		audioEClass.getESuperTypes().add(theEntityPackage.getTextable());

		// Initialize classes and features; add operations and parameters
		initEClass(audioEClass, Audio.class, "Audio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAudio_Content(), ecorePackage.getEByteArray(), "content", null, 0, 1, Audio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudio_Name(), ecorePackage.getEString(), "name", null, 1, 1, Audio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudio_Text(), ecorePackage.getEString(), "text", null, 1, 1, Audio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audioManagerEClass, AudioManager.class, "AudioManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(audioManagerEClass, this.getAudioRecorder(), "record", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(audioManagerEClass, this.getAudioPlayer(), "play", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAudio(), "audio", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "waitEnd", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(audioManagerEClass, this.getAudioPlayer(), "play", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAudioStyle(), "style", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "text", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "start", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "waitEnd", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(audioRecorderEClass, AudioRecorder.class, "AudioRecorder", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(audioRecorderEClass, theJavaPackage.getJavaOutputStream(), "getOutputStream", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(audioRecorderEClass, ecorePackage.getEBoolean(), "isStopped", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(audioRecorderEClass, null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(audioRecorderEClass, null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(audioPlayerEClass, AudioPlayer.class, "AudioPlayer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(audioPlayerEClass, this.getAudio(), "getAudio", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(audioPlayerEClass, ecorePackage.getEBoolean(), "isStopped", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(audioPlayerEClass, null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(audioPlayerEClass, null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(audioStyleEEnum, AudioStyle.class, "AudioStyle");
		addEEnumLiteral(audioStyleEEnum, AudioStyle.A);
		addEEnumLiteral(audioStyleEEnum, AudioStyle.B);

		// Create resource
		createResource(eNS_URI);
	}

} //AudioPackageImpl
