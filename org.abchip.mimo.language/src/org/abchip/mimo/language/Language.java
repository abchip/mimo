/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.language;

import java.util.List;
import org.abchip.mimo.entity.EntityIdentifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.language.Language#getIso_639_1 <em>Iso 639 1</em>}</li>
 *   <li>{@link org.abchip.mimo.language.Language#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.language.Language#getScope <em>Scope</em>}</li>
 *   <li>{@link org.abchip.mimo.language.Language#getText <em>Text</em>}</li>
 *   <li>{@link org.abchip.mimo.language.Language#getType <em>Type</em>}</li>
 *   <li>{@link org.abchip.mimo.language.Language#getPlanets <em>Planets</em>}</li>
 *   <li>{@link org.abchip.mimo.language.Language#getPlanetsCont <em>Planets Cont</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.language.LanguagePackage#getLanguage()
 * @model
 * @generated
 */
public interface Language extends EntityIdentifiable {
	/**
	 * Returns the value of the '<em><b>Iso 639 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iso 639 1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iso 639 1</em>' attribute.
	 * @see #setIso_639_1(String)
	 * @see org.abchip.mimo.language.LanguagePackage#getLanguage_Iso_639_1()
	 * @model required="true"
	 * @generated
	 */
	String getIso_639_1();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.language.Language#getIso_639_1 <em>Iso 639 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iso 639 1</em>' attribute.
	 * @see #getIso_639_1()
	 * @generated
	 */
	void setIso_639_1(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.abchip.mimo.language.LanguagePackage#getLanguage_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.language.Language#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.language.LanguageScope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see org.abchip.mimo.language.LanguageScope
	 * @see #setScope(LanguageScope)
	 * @see org.abchip.mimo.language.LanguagePackage#getLanguage_Scope()
	 * @model required="true"
	 * @generated
	 */
	LanguageScope getScope();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.language.Language#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see org.abchip.mimo.language.LanguageScope
	 * @see #getScope()
	 * @generated
	 */
	void setScope(LanguageScope value);

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
	 * @see org.abchip.mimo.language.LanguagePackage#getLanguage_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.language.Language#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.language.LanguageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.abchip.mimo.language.LanguageType
	 * @see #setType(LanguageType)
	 * @see org.abchip.mimo.language.LanguagePackage#getLanguage_Type()
	 * @model
	 * @generated
	 */
	LanguageType getType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.language.Language#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.abchip.mimo.language.LanguageType
	 * @see #getType()
	 * @generated
	 */
	void setType(LanguageType value);

	/**
	 * Returns the value of the '<em><b>Planets</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.language.LanguagePlanet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planets</em>' reference list.
	 * @see org.abchip.mimo.language.LanguagePackage#getLanguage_Planets()
	 * @model
	 * @generated
	 */
	List<LanguagePlanet> getPlanets();

	/**
	 * Returns the value of the '<em><b>Planets Cont</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.language.LanguagePlanet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planets Cont</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planets Cont</em>' containment reference list.
	 * @see org.abchip.mimo.language.LanguagePackage#getLanguage_PlanetsCont()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	List<LanguagePlanet> getPlanetsCont();

} // Language
