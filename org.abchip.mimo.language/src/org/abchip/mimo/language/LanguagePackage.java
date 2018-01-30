/**
 * Copyright (c) 2017, 2018 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.language;

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
	int LANGUAGE__ISO_639_1 = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__NAME = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__SCOPE = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__TEXT = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__TYPE = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_COUNT = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 5;

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
	int LANGUAGE_MANAGER = 2;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.language.LanguageParser <em>Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.language.LanguageParser
	 * @see org.abchip.mimo.language.impl.LanguagePackageImpl#getLanguageParser()
	 * @generated
	 */
	int LANGUAGE_PARSER = 3;

	/**
	 * The number of structural features of the '<em>Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_PARSER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.language.LanguageParserRegistry <em>Parser Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.language.LanguageParserRegistry
	 * @see org.abchip.mimo.language.impl.LanguagePackageImpl#getLanguageParserRegistry()
	 * @generated
	 */
	int LANGUAGE_PARSER_REGISTRY = 4;

	/**
	 * The number of structural features of the '<em>Parser Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_PARSER_REGISTRY_FEATURE_COUNT = EntityPackage.ENTITY_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.language.LanguageLinearizer <em>Linearizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.language.LanguageLinearizer
	 * @see org.abchip.mimo.language.impl.LanguagePackageImpl#getLanguageLinearizer()
	 * @generated
	 */
	int LANGUAGE_LINEARIZER = 5;

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
	int LANGUAGE_LINEARIZER_REGISTRY = 6;

	/**
	 * The number of structural features of the '<em>Linearizer Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_LINEARIZER_REGISTRY_FEATURE_COUNT = EntityPackage.ENTITY_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.language.LanguageScope <em>Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.language.LanguageScope
	 * @see org.abchip.mimo.language.impl.LanguagePackageImpl#getLanguageScope()
	 * @generated
	 */
	int LANGUAGE_SCOPE = 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.language.LanguageType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.language.LanguageType
	 * @see org.abchip.mimo.language.impl.LanguagePackageImpl#getLanguageType()
	 * @generated
	 */
	int LANGUAGE_TYPE = 8;

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
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.language.Language#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
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
	 * Returns the meta object for enum '{@link org.abchip.mimo.language.LanguageScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scope</em>'.
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
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
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
		 * The meta object literal for the '{@link org.abchip.mimo.language.LanguageScope <em>Scope</em>}' enum.
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

	}

} //LanguagePackage