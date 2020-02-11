/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.social.twitter;

import org.abchip.mimo.entity.EntityPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.abchip.mimo.social.twitter.TwitterFactory
 * @model kind="package"
 * @generated
 */
public interface TwitterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "twitter";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/social/twitter";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mimo-soc-twitter";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TwitterPackage eINSTANCE = org.abchip.mimo.social.twitter.impl.TwitterPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.social.twitter.impl.TweetImpl <em>Tweet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.social.twitter.impl.TweetImpl
	 * @see org.abchip.mimo.social.twitter.impl.TwitterPackageImpl#getTweet()
	 * @generated
	 */
	int TWEET = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET__DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET__ENTITIES = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Geolocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET__GEOLOCATION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hashtags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET__HASHTAGS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET__ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET__LANGUAGE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Medias</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET__MEDIAS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET__PLACE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Symbols</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET__SYMBOLS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET__TEXT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET__USER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>User Mentions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET__USER_MENTIONS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Tweet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWEET_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;


	/**
	 * The meta object id for the '{@link org.abchip.mimo.social.twitter.TwitterManager <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.social.twitter.TwitterManager
	 * @see org.abchip.mimo.social.twitter.impl.TwitterPackageImpl#getTwitterManager()
	 * @generated
	 */
	int TWITTER_MANAGER = 1;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWITTER_MANAGER_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.social.twitter.Tweet <em>Tweet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tweet</em>'.
	 * @see org.abchip.mimo.social.twitter.Tweet
	 * @generated
	 */
	EClass getTweet();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.social.twitter.Tweet#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.abchip.mimo.social.twitter.Tweet#getDate()
	 * @see #getTweet()
	 * @generated
	 */
	EAttribute getTweet_Date();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.social.twitter.Tweet#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Entities</em>'.
	 * @see org.abchip.mimo.social.twitter.Tweet#getEntities()
	 * @see #getTweet()
	 * @generated
	 */
	EAttribute getTweet_Entities();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.social.twitter.Tweet#getGeolocation <em>Geolocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geolocation</em>'.
	 * @see org.abchip.mimo.social.twitter.Tweet#getGeolocation()
	 * @see #getTweet()
	 * @generated
	 */
	EAttribute getTweet_Geolocation();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.social.twitter.Tweet#getHashtags <em>Hashtags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Hashtags</em>'.
	 * @see org.abchip.mimo.social.twitter.Tweet#getHashtags()
	 * @see #getTweet()
	 * @generated
	 */
	EAttribute getTweet_Hashtags();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.social.twitter.Tweet#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.abchip.mimo.social.twitter.Tweet#getId()
	 * @see #getTweet()
	 * @generated
	 */
	EAttribute getTweet_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.social.twitter.Tweet#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.abchip.mimo.social.twitter.Tweet#getLanguage()
	 * @see #getTweet()
	 * @generated
	 */
	EAttribute getTweet_Language();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.social.twitter.Tweet#getMedias <em>Medias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Medias</em>'.
	 * @see org.abchip.mimo.social.twitter.Tweet#getMedias()
	 * @see #getTweet()
	 * @generated
	 */
	EAttribute getTweet_Medias();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.social.twitter.Tweet#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Place</em>'.
	 * @see org.abchip.mimo.social.twitter.Tweet#getPlace()
	 * @see #getTweet()
	 * @generated
	 */
	EAttribute getTweet_Place();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.social.twitter.Tweet#getSymbols <em>Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Symbols</em>'.
	 * @see org.abchip.mimo.social.twitter.Tweet#getSymbols()
	 * @see #getTweet()
	 * @generated
	 */
	EAttribute getTweet_Symbols();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.social.twitter.Tweet#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.abchip.mimo.social.twitter.Tweet#getText()
	 * @see #getTweet()
	 * @generated
	 */
	EAttribute getTweet_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.social.twitter.Tweet#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.abchip.mimo.social.twitter.Tweet#getUser()
	 * @see #getTweet()
	 * @generated
	 */
	EAttribute getTweet_User();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.social.twitter.Tweet#getUserMentions <em>User Mentions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>User Mentions</em>'.
	 * @see org.abchip.mimo.social.twitter.Tweet#getUserMentions()
	 * @see #getTweet()
	 * @generated
	 */
	EAttribute getTweet_UserMentions();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.social.twitter.TwitterManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see org.abchip.mimo.social.twitter.TwitterManager
	 * @generated
	 */
	EClass getTwitterManager();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TwitterFactory getTwitterFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.social.twitter.impl.TweetImpl <em>Tweet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.social.twitter.impl.TweetImpl
		 * @see org.abchip.mimo.social.twitter.impl.TwitterPackageImpl#getTweet()
		 * @generated
		 */
		EClass TWEET = eINSTANCE.getTweet();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWEET__DATE = eINSTANCE.getTweet_Date();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWEET__ENTITIES = eINSTANCE.getTweet_Entities();

		/**
		 * The meta object literal for the '<em><b>Geolocation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWEET__GEOLOCATION = eINSTANCE.getTweet_Geolocation();

		/**
		 * The meta object literal for the '<em><b>Hashtags</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWEET__HASHTAGS = eINSTANCE.getTweet_Hashtags();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWEET__ID = eINSTANCE.getTweet_Id();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWEET__LANGUAGE = eINSTANCE.getTweet_Language();

		/**
		 * The meta object literal for the '<em><b>Medias</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWEET__MEDIAS = eINSTANCE.getTweet_Medias();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWEET__PLACE = eINSTANCE.getTweet_Place();

		/**
		 * The meta object literal for the '<em><b>Symbols</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWEET__SYMBOLS = eINSTANCE.getTweet_Symbols();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWEET__TEXT = eINSTANCE.getTweet_Text();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWEET__USER = eINSTANCE.getTweet_User();

		/**
		 * The meta object literal for the '<em><b>User Mentions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWEET__USER_MENTIONS = eINSTANCE.getTweet_UserMentions();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.social.twitter.TwitterManager <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.social.twitter.TwitterManager
		 * @see org.abchip.mimo.social.twitter.impl.TwitterPackageImpl#getTwitterManager()
		 * @generated
		 */
		EClass TWITTER_MANAGER = eINSTANCE.getTwitterManager();

	}

} //TwitterPackage
