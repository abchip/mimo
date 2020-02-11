/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.ability;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage
 * @generated
 */
public interface AbilityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbilityFactory eINSTANCE = org.abchip.mimo.biz.humanres.ability.impl.AbilityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Party Qual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Party Qual</em>'.
	 * @generated
	 */
	PartyQual createPartyQual();

	/**
	 * Returns a new object of class '<em>Party Qual Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Party Qual Type</em>'.
	 * @generated
	 */
	PartyQualType createPartyQualType();

	/**
	 * Returns a new object of class '<em>Party Resume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Party Resume</em>'.
	 * @generated
	 */
	PartyResume createPartyResume();

	/**
	 * Returns a new object of class '<em>Party Skill</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Party Skill</em>'.
	 * @generated
	 */
	PartySkill createPartySkill();

	/**
	 * Returns a new object of class '<em>Perf Rating Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perf Rating Type</em>'.
	 * @generated
	 */
	PerfRatingType createPerfRatingType();

	/**
	 * Returns a new object of class '<em>Perf Review</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perf Review</em>'.
	 * @generated
	 */
	PerfReview createPerfReview();

	/**
	 * Returns a new object of class '<em>Perf Review Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perf Review Item</em>'.
	 * @generated
	 */
	PerfReviewItem createPerfReviewItem();

	/**
	 * Returns a new object of class '<em>Perf Review Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perf Review Item Type</em>'.
	 * @generated
	 */
	PerfReviewItemType createPerfReviewItemType();

	/**
	 * Returns a new object of class '<em>Performance Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Performance Note</em>'.
	 * @generated
	 */
	PerformanceNote createPerformanceNote();

	/**
	 * Returns a new object of class '<em>Person Training</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person Training</em>'.
	 * @generated
	 */
	PersonTraining createPersonTraining();

	/**
	 * Returns a new object of class '<em>Responsibility Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Responsibility Type</em>'.
	 * @generated
	 */
	ResponsibilityType createResponsibilityType();

	/**
	 * Returns a new object of class '<em>Skill Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skill Type</em>'.
	 * @generated
	 */
	SkillType createSkillType();

	/**
	 * Returns a new object of class '<em>Training Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Training Class Type</em>'.
	 * @generated
	 */
	TrainingClassType createTrainingClassType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AbilityPackage getAbilityPackage();

} //AbilityFactory
