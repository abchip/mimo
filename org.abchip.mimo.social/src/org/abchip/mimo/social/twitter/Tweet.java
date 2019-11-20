/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.social.twitter;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Textable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tweet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.social.twitter.Tweet#getDate <em>Date</em>}</li>
 *   <li>{@link org.abchip.mimo.social.twitter.Tweet#getEntities <em>Entities</em>}</li>
 *   <li>{@link org.abchip.mimo.social.twitter.Tweet#getGeolocation <em>Geolocation</em>}</li>
 *   <li>{@link org.abchip.mimo.social.twitter.Tweet#getHashtags <em>Hashtags</em>}</li>
 *   <li>{@link org.abchip.mimo.social.twitter.Tweet#getId <em>Id</em>}</li>
 *   <li>{@link org.abchip.mimo.social.twitter.Tweet#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.abchip.mimo.social.twitter.Tweet#getMedias <em>Medias</em>}</li>
 *   <li>{@link org.abchip.mimo.social.twitter.Tweet#getPlace <em>Place</em>}</li>
 *   <li>{@link org.abchip.mimo.social.twitter.Tweet#getSymbols <em>Symbols</em>}</li>
 *   <li>{@link org.abchip.mimo.social.twitter.Tweet#getText <em>Text</em>}</li>
 *   <li>{@link org.abchip.mimo.social.twitter.Tweet#getUser <em>User</em>}</li>
 *   <li>{@link org.abchip.mimo.social.twitter.Tweet#getUserMentions <em>User Mentions</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.social.twitter.TwitterPackage#getTweet()
 * @model
 * @generated
 */
public interface Tweet extends EntityIdentifiable, Textable {
	
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see org.abchip.mimo.social.twitter.TwitterPackage#getTweet_Date()
	 * @model required="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.social.twitter.Tweet#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' attribute list.
	 * @see org.abchip.mimo.social.twitter.TwitterPackage#getTweet_Entities()
	 * @model default="*USER" derived="true"
	 * @generated
	 */
	List<String> getEntities();

	/**
	 * Returns the value of the '<em><b>Geolocation</b></em>' attribute.
	 * The default value is <code>"*USER"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geolocation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geolocation</em>' attribute.
	 * @see #setGeolocation(String)
	 * @see org.abchip.mimo.social.twitter.TwitterPackage#getTweet_Geolocation()
	 * @model default="*USER" derived="true"
	 * @generated
	 */
	String getGeolocation();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.social.twitter.Tweet#getGeolocation <em>Geolocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geolocation</em>' attribute.
	 * @see #getGeolocation()
	 * @generated
	 */
	void setGeolocation(String value);

	/**
	 * Returns the value of the '<em><b>Hashtags</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hashtags</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hashtags</em>' attribute list.
	 * @see org.abchip.mimo.social.twitter.TwitterPackage#getTweet_Hashtags()
	 * @model default="*USER" derived="true"
	 * @generated
	 */
	List<String> getHashtags();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see org.abchip.mimo.social.twitter.TwitterPackage#getTweet_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.social.twitter.Tweet#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The default value is <code>"*USER"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.abchip.mimo.social.twitter.TwitterPackage#getTweet_Language()
	 * @model default="*USER" required="true" derived="true"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.social.twitter.Tweet#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Medias</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medias</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medias</em>' attribute list.
	 * @see org.abchip.mimo.social.twitter.TwitterPackage#getTweet_Medias()
	 * @model default="*USER" derived="true"
	 * @generated
	 */
	List<String> getMedias();

	/**
	 * Returns the value of the '<em><b>Place</b></em>' attribute.
	 * The default value is <code>"*USER"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' attribute.
	 * @see #setPlace(String)
	 * @see org.abchip.mimo.social.twitter.TwitterPackage#getTweet_Place()
	 * @model default="*USER" derived="true"
	 * @generated
	 */
	String getPlace();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.social.twitter.Tweet#getPlace <em>Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' attribute.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(String value);

	/**
	 * Returns the value of the '<em><b>Symbols</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbols</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbols</em>' attribute list.
	 * @see org.abchip.mimo.social.twitter.TwitterPackage#getTweet_Symbols()
	 * @model default="*USER" derived="true"
	 * @generated
	 */
	List<String> getSymbols();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.abchip.mimo.social.twitter.TwitterPackage#getTweet_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.social.twitter.Tweet#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * The default value is <code>"*USER"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see org.abchip.mimo.social.twitter.TwitterPackage#getTweet_User()
	 * @model default="*USER" required="true" derived="true"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.social.twitter.Tweet#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>User Mentions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Mentions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Mentions</em>' attribute list.
	 * @see org.abchip.mimo.social.twitter.TwitterPackage#getTweet_UserMentions()
	 * @model default="*USER" derived="true"
	 * @generated
	 */
	List<String> getUserMentions();

} // Tweet
