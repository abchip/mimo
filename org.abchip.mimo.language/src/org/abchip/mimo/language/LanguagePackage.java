/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.language;

import org.abchip.mimo.context.ContextPackage;
import org.abchip.mimo.entity.EntityPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.abchip.mimo.language.LanguageFactory
 * @model kind="package"
 * @generated
 */
public interface LanguagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "language";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/language";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mimo-lang";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LanguagePackage eINSTANCE = org.abchip.mimo.language.impl.LanguagePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.language.impl.LanguageImpl <em>Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.language.impl.LanguageImpl
	 * @see org.abchip.mimo.language.impl.LanguagePackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Iso 639 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__ISO_639_1 = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__SCOPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__TEXT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Planets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__PLANETS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Planets Cont</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__PLANETS_CONT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.language.impl.LanguageExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.language.impl.LanguageExpressionImpl
	 * @see org.abchip.mimo.language.impl.LanguagePackageImpl#getLanguageExpression()
	 * @generated
	 */
	int LANGUAGE_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Expression Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_EXPRESSION__EXPRESSION_ROW = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.language.LanguageManager <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.language.LanguageManager
	 * @see org.abchip.mimo.language.impl.LanguagePackageImpl#getLanguageManager()
	 * @generated
	 */
	int LANGUAGE_MANAGER = 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.language.LanguageParser <em>Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.language.LanguageParser
	 * @see org.abchip.mimo.language.impl.LanguagePackageImpl#getLanguageParser()
	 * @generated
	 */
	int LANGUAGE_PARSER = 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.language.LanguageParserRegistry <em>Parser Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.language.LanguageParserRegistry
	 * @see org.abchip.mimo.language.impl.LanguagePackageImpl#getLanguageParserRegistry()
	 * @generated
	 */
	int LANGUAGE_PARSER_REGISTRY = 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.language.LanguageLinearizer <em>Linearizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.language.LanguageLinearizer
	 * @see org.abchip.mimo.language.impl.LanguagePackageImpl#getLanguageLinearizer()
	 * @generated
	 */
	int LANGUAGE_LINEARIZER = 2;

	/**
	 * The number of structural features of the '<em>Linearizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_LINEARIZER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.language.LanguageLinearizerRegistry <em>Linearizer Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.language.LanguageLinearizerRegistry
	 * @see org.abchip.mimo.language.impl.LanguagePackageImpl#getLanguageLinearizerRegistry()
	 * @generated
	 */
	int LANGUAGE_LINEARIZER_REGISTRY = 3;

	/**
	 * The number of structural features of the '<em>Linearizer Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_LINEARIZER_REGISTRY_FEATURE_COUNT = ContextPackage.REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_PARSER_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Parser Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_PARSER_REGISTRY_FEATURE_COUNT = ContextPackage.REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.language.impl.LanguagePlanetImpl <em>Planet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.language.impl.LanguagePlanetImpl
	 * @see org.abchip.mimo.language.impl.LanguagePackageImpl#getLanguagePlanet()
	 * @generated
	 */
	int LANGUAGE_PLANET = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_PLANET__NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Planet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_PLANET_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.language.LanguageScope <em>Service</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.language.LanguageScope
	 * @see org.abchip.mimo.language.impl.LanguagePackageImpl#getLanguageScope()
	 * @generated
	 */
	int LANGUAGE_SCOPE = 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.language.LanguageType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.language.LanguageType
	 * @see org.abchip.mimo.language.impl.LanguagePackageImpl#getLanguageType()
	 * @generated
	 */
	int LANGUAGE_TYPE = 9;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.language.LanguageException
	 * @see org.abchip.mimo.language.impl.LanguagePackageImpl#getLanguageException()
	 * @generated
	 */
	int LANGUAGE_EXCEPTION = 10;

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.language.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language</em>'.
	 * @see org.abchip.mimo.language.Language
	 * @generated
	 */
	EClass getLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.language.Language#getIso_639_1 <em>Iso 639 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iso 639 1</em>'.
	 * @see org.abchip.mimo.language.Language#getIso_639_1()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Iso_639_1();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.language.Language#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.language.Language#getName()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.language.Language#getScope <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see org.abchip.mimo.language.Language#getScope()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Scope();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.language.Language#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.abchip.mimo.language.Language#getText()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.language.Language#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.abchip.mimo.language.Language#getType()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Type();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.language.Language#getPlanets <em>Planets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Planets</em>'.
	 * @see org.abchip.mimo.language.Language#getPlanets()
	 * @see #getLanguage()
	 * @generated
	 */
	EReference getLanguage_Planets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.language.Language#getPlanetsCont <em>Planets Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Planets Cont</em>'.
	 * @see org.abchip.mimo.language.Language#getPlanetsCont()
	 * @see #getLanguage()
	 * @generated
	 */
	EReference getLanguage_PlanetsCont();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.language.LanguageExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.abchip.mimo.language.LanguageExpression
	 * @generated
	 */
	EClass getLanguageExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.language.LanguageExpression#getExpressionRow <em>Expression Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Row</em>'.
	 * @see org.abchip.mimo.language.LanguageExpression#getExpressionRow()
	 * @see #getLanguageExpression()
	 * @generated
	 */
	EAttribute getLanguageExpression_ExpressionRow();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.language.LanguageManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see org.abchip.mimo.language.LanguageManager
	 * @generated
	 */
	EClass getLanguageManager();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.language.LanguageParser <em>Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parser</em>'.
	 * @see org.abchip.mimo.language.LanguageParser
	 * @generated
	 */
	EClass getLanguageParser();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.language.LanguageParserRegistry <em>Parser Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parser Registry</em>'.
	 * @see org.abchip.mimo.language.LanguageParserRegistry
	 * @generated
	 */
	EClass getLanguageParserRegistry();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.language.LanguageLinearizer <em>Linearizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linearizer</em>'.
	 * @see org.abchip.mimo.language.LanguageLinearizer
	 * @generated
	 */
	EClass getLanguageLinearizer();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.language.LanguageLinearizerRegistry <em>Linearizer Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linearizer Registry</em>'.
	 * @see org.abchip.mimo.language.LanguageLinearizerRegistry
	 * @generated
	 */
	EClass getLanguageLinearizerRegistry();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.language.LanguagePlanet <em>Planet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planet</em>'.
	 * @see org.abchip.mimo.language.LanguagePlanet
	 * @generated
	 */
	EClass getLanguagePlanet();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.language.LanguagePlanet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.language.LanguagePlanet#getName()
	 * @see #getLanguagePlanet()
	 * @generated
	 */
	EAttribute getLanguagePlanet_Name();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.language.LanguageScope <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service</em>'.
	 * @see org.abchip.mimo.language.LanguageScope
	 * @generated
	 */
	EEnum getLanguageScope();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.language.LanguageType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see org.abchip.mimo.language.LanguageType
	 * @generated
	 */
	EEnum getLanguageType();

	/**
	 * Returns the meta object for data type '{@link org.abchip.mimo.language.LanguageException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see org.abchip.mimo.language.LanguageException
	 * @model instanceClass="org.abchip.mimo.language.LanguageException"
	 * @generated
	 */
	EDataType getLanguageException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LanguageFactory getLanguageFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.language.impl.LanguageImpl <em>Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.language.impl.LanguageImpl
		 * @see org.abchip.mimo.language.impl.LanguagePackageImpl#getLanguage()
		 * @generated
		 */
		EClass LANGUAGE = eINSTANCE.getLanguage();
		/**
		 * The meta object literal for the '<em><b>Iso 639 1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__ISO_639_1 = eINSTANCE.getLanguage_Iso_639_1();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__NAME = eINSTANCE.getLanguage_Name();
		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__SCOPE = eINSTANCE.getLanguage_Scope();
		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__TEXT = eINSTANCE.getLanguage_Text();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__TYPE = eINSTANCE.getLanguage_Type();
		/**
		 * The meta object literal for the '<em><b>Planets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE__PLANETS = eINSTANCE.getLanguage_Planets();
		/**
		 * The meta object literal for the '<em><b>Planets Cont</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE__PLANETS_CONT = eINSTANCE.getLanguage_PlanetsCont();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.language.impl.LanguageExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.language.impl.LanguageExpressionImpl
		 * @see org.abchip.mimo.language.impl.LanguagePackageImpl#getLanguageExpression()
		 * @generated
		 */
		EClass LANGUAGE_EXPRESSION = eINSTANCE.getLanguageExpression();
		/**
		 * The meta object literal for the '<em><b>Expression Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_EXPRESSION__EXPRESSION_ROW = eINSTANCE.getLanguageExpression_ExpressionRow();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.language.LanguageManager <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.language.LanguageManager
		 * @see org.abchip.mimo.language.impl.LanguagePackageImpl#getLanguageManager()
		 * @generated
		 */
		EClass LANGUAGE_MANAGER = eINSTANCE.getLanguageManager();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.language.LanguageParser <em>Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.language.LanguageParser
		 * @see org.abchip.mimo.language.impl.LanguagePackageImpl#getLanguageParser()
		 * @generated
		 */
		EClass LANGUAGE_PARSER = eINSTANCE.getLanguageParser();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.language.LanguageParserRegistry <em>Parser Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.language.LanguageParserRegistry
		 * @see org.abchip.mimo.language.impl.LanguagePackageImpl#getLanguageParserRegistry()
		 * @generated
		 */
		EClass LANGUAGE_PARSER_REGISTRY = eINSTANCE.getLanguageParserRegistry();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.language.LanguageLinearizer <em>Linearizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.language.LanguageLinearizer
		 * @see org.abchip.mimo.language.impl.LanguagePackageImpl#getLanguageLinearizer()
		 * @generated
		 */
		EClass LANGUAGE_LINEARIZER = eINSTANCE.getLanguageLinearizer();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.language.LanguageLinearizerRegistry <em>Linearizer Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.language.LanguageLinearizerRegistry
		 * @see org.abchip.mimo.language.impl.LanguagePackageImpl#getLanguageLinearizerRegistry()
		 * @generated
		 */
		EClass LANGUAGE_LINEARIZER_REGISTRY = eINSTANCE.getLanguageLinearizerRegistry();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.language.impl.LanguagePlanetImpl <em>Planet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.language.impl.LanguagePlanetImpl
		 * @see org.abchip.mimo.language.impl.LanguagePackageImpl#getLanguagePlanet()
		 * @generated
		 */
		EClass LANGUAGE_PLANET = eINSTANCE.getLanguagePlanet();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_PLANET__NAME = eINSTANCE.getLanguagePlanet_Name();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.language.LanguageScope <em>Service</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.language.LanguageScope
		 * @see org.abchip.mimo.language.impl.LanguagePackageImpl#getLanguageScope()
		 * @generated
		 */
		EEnum LANGUAGE_SCOPE = eINSTANCE.getLanguageScope();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.language.LanguageType <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.language.LanguageType
		 * @see org.abchip.mimo.language.impl.LanguagePackageImpl#getLanguageType()
		 * @generated
		 */
		EEnum LANGUAGE_TYPE = eINSTANCE.getLanguageType();
		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.language.LanguageException
		 * @see org.abchip.mimo.language.impl.LanguagePackageImpl#getLanguageException()
		 * @generated
		 */
		EDataType LANGUAGE_EXCEPTION = eINSTANCE.getLanguageException();

	}

} //LanguagePackage
