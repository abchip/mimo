/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.social.twitter.impl;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.impl.EntityNameableImpl;

import org.abchip.mimo.social.twitter.Tweet;
import org.abchip.mimo.social.twitter.TwitterPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tweet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.social.twitter.impl.TweetImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.abchip.mimo.social.twitter.impl.TweetImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link org.abchip.mimo.social.twitter.impl.TweetImpl#getGeolocation <em>Geolocation</em>}</li>
 *   <li>{@link org.abchip.mimo.social.twitter.impl.TweetImpl#getHashtags <em>Hashtags</em>}</li>
 *   <li>{@link org.abchip.mimo.social.twitter.impl.TweetImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.abchip.mimo.social.twitter.impl.TweetImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.abchip.mimo.social.twitter.impl.TweetImpl#getMedias <em>Medias</em>}</li>
 *   <li>{@link org.abchip.mimo.social.twitter.impl.TweetImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link org.abchip.mimo.social.twitter.impl.TweetImpl#getSymbols <em>Symbols</em>}</li>
 *   <li>{@link org.abchip.mimo.social.twitter.impl.TweetImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.abchip.mimo.social.twitter.impl.TweetImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.abchip.mimo.social.twitter.impl.TweetImpl#getUserMentions <em>User Mentions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TweetImpl extends EntityNameableImpl implements Tweet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<String> entities;

	/**
	 * The default value of the '{@link #getGeolocation() <em>Geolocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeolocation()
	 * @generated
	 * @ordered
	 */
	protected static final String GEOLOCATION_EDEFAULT = "*USER";

	/**
	 * The cached value of the '{@link #getGeolocation() <em>Geolocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeolocation()
	 * @generated
	 * @ordered
	 */
	protected String geolocation = GEOLOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHashtags() <em>Hashtags</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashtags()
	 * @generated
	 * @ordered
	 */
	protected EList<String> hashtags;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = "*USER";

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMedias() <em>Medias</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedias()
	 * @generated
	 * @ordered
	 */
	protected EList<String> medias;

	/**
	 * The default value of the '{@link #getPlace() <em>Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACE_EDEFAULT = "*USER";

	/**
	 * The cached value of the '{@link #getPlace() <em>Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected String place = PLACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSymbols() <em>Symbols</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbols()
	 * @generated
	 * @ordered
	 */
	protected EList<String> symbols;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = "*USER";

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUserMentions() <em>User Mentions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserMentions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> userMentions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TweetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterPackage.Literals.TWEET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public Frame<Tweet> isa() {
		return (Frame<Tweet>) super.isa();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterPackage.TWEET__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getEntities() {
		if (entities == null) {
			entities = new EDataTypeUniqueEList<String>(String.class, this, TwitterPackage.TWEET__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeolocation() {
		return geolocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeolocation(String newGeolocation) {
		String oldGeolocation = geolocation;
		geolocation = newGeolocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterPackage.TWEET__GEOLOCATION, oldGeolocation, geolocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getHashtags() {
		if (hashtags == null) {
			hashtags = new EDataTypeUniqueEList<String>(String.class, this, TwitterPackage.TWEET__HASHTAGS);
		}
		return hashtags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterPackage.TWEET__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterPackage.TWEET__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getMedias() {
		if (medias == null) {
			medias = new EDataTypeUniqueEList<String>(String.class, this, TwitterPackage.TWEET__MEDIAS);
		}
		return medias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlace(String newPlace) {
		String oldPlace = place;
		place = newPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterPackage.TWEET__PLACE, oldPlace, place));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getSymbols() {
		if (symbols == null) {
			symbols = new EDataTypeUniqueEList<String>(String.class, this, TwitterPackage.TWEET__SYMBOLS);
		}
		return symbols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterPackage.TWEET__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterPackage.TWEET__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getUserMentions() {
		if (userMentions == null) {
			userMentions = new EDataTypeUniqueEList<String>(String.class, this, TwitterPackage.TWEET__USER_MENTIONS);
		}
		return userMentions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TwitterPackage.TWEET__DATE:
				return getDate();
			case TwitterPackage.TWEET__ENTITIES:
				return getEntities();
			case TwitterPackage.TWEET__GEOLOCATION:
				return getGeolocation();
			case TwitterPackage.TWEET__HASHTAGS:
				return getHashtags();
			case TwitterPackage.TWEET__ID:
				return getId();
			case TwitterPackage.TWEET__LANGUAGE:
				return getLanguage();
			case TwitterPackage.TWEET__MEDIAS:
				return getMedias();
			case TwitterPackage.TWEET__PLACE:
				return getPlace();
			case TwitterPackage.TWEET__SYMBOLS:
				return getSymbols();
			case TwitterPackage.TWEET__TEXT:
				return getText();
			case TwitterPackage.TWEET__USER:
				return getUser();
			case TwitterPackage.TWEET__USER_MENTIONS:
				return getUserMentions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TwitterPackage.TWEET__DATE:
				setDate((Date)newValue);
				return;
			case TwitterPackage.TWEET__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends String>)newValue);
				return;
			case TwitterPackage.TWEET__GEOLOCATION:
				setGeolocation((String)newValue);
				return;
			case TwitterPackage.TWEET__HASHTAGS:
				getHashtags().clear();
				getHashtags().addAll((Collection<? extends String>)newValue);
				return;
			case TwitterPackage.TWEET__ID:
				setId((Long)newValue);
				return;
			case TwitterPackage.TWEET__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case TwitterPackage.TWEET__MEDIAS:
				getMedias().clear();
				getMedias().addAll((Collection<? extends String>)newValue);
				return;
			case TwitterPackage.TWEET__PLACE:
				setPlace((String)newValue);
				return;
			case TwitterPackage.TWEET__SYMBOLS:
				getSymbols().clear();
				getSymbols().addAll((Collection<? extends String>)newValue);
				return;
			case TwitterPackage.TWEET__TEXT:
				setText((String)newValue);
				return;
			case TwitterPackage.TWEET__USER:
				setUser((String)newValue);
				return;
			case TwitterPackage.TWEET__USER_MENTIONS:
				getUserMentions().clear();
				getUserMentions().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TwitterPackage.TWEET__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case TwitterPackage.TWEET__ENTITIES:
				getEntities().clear();
				return;
			case TwitterPackage.TWEET__GEOLOCATION:
				setGeolocation(GEOLOCATION_EDEFAULT);
				return;
			case TwitterPackage.TWEET__HASHTAGS:
				getHashtags().clear();
				return;
			case TwitterPackage.TWEET__ID:
				setId(ID_EDEFAULT);
				return;
			case TwitterPackage.TWEET__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case TwitterPackage.TWEET__MEDIAS:
				getMedias().clear();
				return;
			case TwitterPackage.TWEET__PLACE:
				setPlace(PLACE_EDEFAULT);
				return;
			case TwitterPackage.TWEET__SYMBOLS:
				getSymbols().clear();
				return;
			case TwitterPackage.TWEET__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case TwitterPackage.TWEET__USER:
				setUser(USER_EDEFAULT);
				return;
			case TwitterPackage.TWEET__USER_MENTIONS:
				getUserMentions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TwitterPackage.TWEET__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case TwitterPackage.TWEET__ENTITIES:
				return entities != null && !entities.isEmpty();
			case TwitterPackage.TWEET__GEOLOCATION:
				return GEOLOCATION_EDEFAULT == null ? geolocation != null : !GEOLOCATION_EDEFAULT.equals(geolocation);
			case TwitterPackage.TWEET__HASHTAGS:
				return hashtags != null && !hashtags.isEmpty();
			case TwitterPackage.TWEET__ID:
				return id != ID_EDEFAULT;
			case TwitterPackage.TWEET__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case TwitterPackage.TWEET__MEDIAS:
				return medias != null && !medias.isEmpty();
			case TwitterPackage.TWEET__PLACE:
				return PLACE_EDEFAULT == null ? place != null : !PLACE_EDEFAULT.equals(place);
			case TwitterPackage.TWEET__SYMBOLS:
				return symbols != null && !symbols.isEmpty();
			case TwitterPackage.TWEET__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case TwitterPackage.TWEET__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
			case TwitterPackage.TWEET__USER_MENTIONS:
				return userMentions != null && !userMentions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (date: ");
		result.append(date);
		result.append(", entities: ");
		result.append(entities);
		result.append(", geolocation: ");
		result.append(geolocation);
		result.append(", hashtags: ");
		result.append(hashtags);
		result.append(", id: ");
		result.append(id);
		result.append(", language: ");
		result.append(language);
		result.append(", medias: ");
		result.append(medias);
		result.append(", place: ");
		result.append(place);
		result.append(", symbols: ");
		result.append(symbols);
		result.append(", text: ");
		result.append(text);
		result.append(", user: ");
		result.append(user);
		result.append(", userMentions: ");
		result.append(userMentions);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getName() {
		return Long.toString(getId());
	}
} //TweetImpl
