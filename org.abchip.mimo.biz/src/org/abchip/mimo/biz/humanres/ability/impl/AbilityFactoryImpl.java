/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.ability.impl;

import org.abchip.mimo.biz.humanres.ability.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbilityFactoryImpl extends EFactoryImpl implements AbilityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AbilityFactory init() {
		try {
			AbilityFactory theAbilityFactory = (AbilityFactory)EPackage.Registry.INSTANCE.getEFactory(AbilityPackage.eNS_URI);
			if (theAbilityFactory != null) {
				return theAbilityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AbilityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbilityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AbilityPackage.PARTY_QUAL: return (EObject)createPartyQual();
			case AbilityPackage.PARTY_QUAL_TYPE: return (EObject)createPartyQualType();
			case AbilityPackage.PARTY_RESUME: return (EObject)createPartyResume();
			case AbilityPackage.PARTY_SKILL: return (EObject)createPartySkill();
			case AbilityPackage.PERF_RATING_TYPE: return (EObject)createPerfRatingType();
			case AbilityPackage.PERF_REVIEW: return (EObject)createPerfReview();
			case AbilityPackage.PERF_REVIEW_ITEM: return (EObject)createPerfReviewItem();
			case AbilityPackage.PERF_REVIEW_ITEM_TYPE: return (EObject)createPerfReviewItemType();
			case AbilityPackage.PERFORMANCE_NOTE: return (EObject)createPerformanceNote();
			case AbilityPackage.PERSON_TRAINING: return (EObject)createPersonTraining();
			case AbilityPackage.RESPONSIBILITY_TYPE: return (EObject)createResponsibilityType();
			case AbilityPackage.SKILL_TYPE: return (EObject)createSkillType();
			case AbilityPackage.TRAINING_CLASS_TYPE: return (EObject)createTrainingClassType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyQual createPartyQual() {
		PartyQualImpl partyQual = new PartyQualImpl();
		return partyQual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyQualType createPartyQualType() {
		PartyQualTypeImpl partyQualType = new PartyQualTypeImpl();
		return partyQualType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyResume createPartyResume() {
		PartyResumeImpl partyResume = new PartyResumeImpl();
		return partyResume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartySkill createPartySkill() {
		PartySkillImpl partySkill = new PartySkillImpl();
		return partySkill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerfRatingType createPerfRatingType() {
		PerfRatingTypeImpl perfRatingType = new PerfRatingTypeImpl();
		return perfRatingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerfReview createPerfReview() {
		PerfReviewImpl perfReview = new PerfReviewImpl();
		return perfReview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerfReviewItem createPerfReviewItem() {
		PerfReviewItemImpl perfReviewItem = new PerfReviewItemImpl();
		return perfReviewItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerfReviewItemType createPerfReviewItemType() {
		PerfReviewItemTypeImpl perfReviewItemType = new PerfReviewItemTypeImpl();
		return perfReviewItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerformanceNote createPerformanceNote() {
		PerformanceNoteImpl performanceNote = new PerformanceNoteImpl();
		return performanceNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonTraining createPersonTraining() {
		PersonTrainingImpl personTraining = new PersonTrainingImpl();
		return personTraining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponsibilityType createResponsibilityType() {
		ResponsibilityTypeImpl responsibilityType = new ResponsibilityTypeImpl();
		return responsibilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkillType createSkillType() {
		SkillTypeImpl skillType = new SkillTypeImpl();
		return skillType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrainingClassType createTrainingClassType() {
		TrainingClassTypeImpl trainingClassType = new TrainingClassTypeImpl();
		return trainingClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbilityPackage getAbilityPackage() {
		return (AbilityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AbilityPackage getPackage() {
		return AbilityPackage.eINSTANCE;
	}

} //AbilityFactoryImpl
