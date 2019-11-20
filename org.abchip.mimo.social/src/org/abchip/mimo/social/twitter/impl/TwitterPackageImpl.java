/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.social.twitter.impl;

import org.abchip.mimo.MimoPackage;

import org.abchip.mimo.context.ContextPackage;
import org.abchip.mimo.entity.EntityPackage;

import org.abchip.mimo.social.twitter.Tweet;
import org.abchip.mimo.social.twitter.TwitterFactory;
import org.abchip.mimo.social.twitter.TwitterManager;
import org.abchip.mimo.social.twitter.TwitterPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TwitterPackageImpl extends EPackageImpl implements TwitterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tweetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twitterManagerEClass = null;

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
	 * @see org.abchip.mimo.social.twitter.TwitterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TwitterPackageImpl() {
		super(eNS_URI, TwitterFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TwitterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TwitterPackage init() {
		if (isInited) return (TwitterPackage)EPackage.Registry.INSTANCE.getEPackage(TwitterPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTwitterPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TwitterPackageImpl theTwitterPackage = registeredTwitterPackage instanceof TwitterPackageImpl ? (TwitterPackageImpl)registeredTwitterPackage : new TwitterPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		MimoPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTwitterPackage.createPackageContents();

		// Initialize created meta-data
		theTwitterPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTwitterPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TwitterPackage.eNS_URI, theTwitterPackage);
		return theTwitterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTweet() {
		return tweetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTweet_Date() {
		return (EAttribute)tweetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTweet_Entities() {
		return (EAttribute)tweetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTweet_Geolocation() {
		return (EAttribute)tweetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTweet_Hashtags() {
		return (EAttribute)tweetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTweet_Id() {
		return (EAttribute)tweetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTweet_Language() {
		return (EAttribute)tweetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTweet_Medias() {
		return (EAttribute)tweetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTweet_Place() {
		return (EAttribute)tweetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTweet_Symbols() {
		return (EAttribute)tweetEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTweet_Text() {
		return (EAttribute)tweetEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTweet_User() {
		return (EAttribute)tweetEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTweet_UserMentions() {
		return (EAttribute)tweetEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTwitterManager() {
		return twitterManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TwitterFactory getTwitterFactory() {
		return (TwitterFactory)getEFactoryInstance();
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
		tweetEClass = createEClass(TWEET);
		createEAttribute(tweetEClass, TWEET__DATE);
		createEAttribute(tweetEClass, TWEET__ENTITIES);
		createEAttribute(tweetEClass, TWEET__GEOLOCATION);
		createEAttribute(tweetEClass, TWEET__HASHTAGS);
		createEAttribute(tweetEClass, TWEET__ID);
		createEAttribute(tweetEClass, TWEET__LANGUAGE);
		createEAttribute(tweetEClass, TWEET__MEDIAS);
		createEAttribute(tweetEClass, TWEET__PLACE);
		createEAttribute(tweetEClass, TWEET__SYMBOLS);
		createEAttribute(tweetEClass, TWEET__TEXT);
		createEAttribute(tweetEClass, TWEET__USER);
		createEAttribute(tweetEClass, TWEET__USER_MENTIONS);

		twitterManagerEClass = createEClass(TWITTER_MANAGER);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tweetEClass.getESuperTypes().add(theEntityPackage.getEntityIdentifiable());

		// Initialize classes and features; add operations and parameters
		initEClass(tweetEClass, Tweet.class, "Tweet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTweet_Date(), ecorePackage.getEDate(), "date", null, 1, 1, Tweet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTweet_Entities(), ecorePackage.getEString(), "entities", "*USER", 0, -1, Tweet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTweet_Geolocation(), ecorePackage.getEString(), "geolocation", "*USER", 0, 1, Tweet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTweet_Hashtags(), ecorePackage.getEString(), "hashtags", "*USER", 0, -1, Tweet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTweet_Id(), ecorePackage.getELong(), "id", null, 1, 1, Tweet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTweet_Language(), ecorePackage.getEString(), "language", "*USER", 1, 1, Tweet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTweet_Medias(), ecorePackage.getEString(), "medias", "*USER", 0, -1, Tweet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTweet_Place(), ecorePackage.getEString(), "place", "*USER", 0, 1, Tweet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTweet_Symbols(), ecorePackage.getEString(), "symbols", "*USER", 0, -1, Tweet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTweet_Text(), ecorePackage.getEString(), "text", null, 1, 1, Tweet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTweet_User(), ecorePackage.getEString(), "user", "*USER", 1, 1, Tweet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTweet_UserMentions(), ecorePackage.getEString(), "userMentions", "*USER", 0, -1, Tweet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(twitterManagerEClass, TwitterManager.class, "TwitterManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(twitterManagerEClass, null, "search", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "language", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "query", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "maxNumber", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theEntityPackage.getEntityIterator());
		EGenericType g2 = createEGenericType(this.getTweet());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		// Create resource
		createResource(eNS_URI);
	}

} //TwitterPackageImpl
