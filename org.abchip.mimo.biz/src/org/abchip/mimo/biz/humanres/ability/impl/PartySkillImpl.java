/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.ability.impl;

import java.util.Date;

import org.abchip.mimo.biz.humanres.ability.AbilityPackage;
import org.abchip.mimo.biz.humanres.ability.PartySkill;
import org.abchip.mimo.biz.humanres.ability.SkillType;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Skill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PartySkillImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PartySkillImpl#getSkillTypeId <em>Skill Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PartySkillImpl#getRating <em>Rating</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PartySkillImpl#getSkillLevel <em>Skill Level</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PartySkillImpl#getStartedUsingDate <em>Started Using Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PartySkillImpl#getYearsExperience <em>Years Experience</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartySkillImpl extends BizEntityTypedImpl<SkillType> implements PartySkill {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartySkillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbilityPackage.Literals.PARTY_SKILL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		return (Party)eGet(AbilityPackage.Literals.PARTY_SKILL__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		eSet(AbilityPackage.Literals.PARTY_SKILL__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getRating() {
		return (Long)eGet(AbilityPackage.Literals.PARTY_SKILL__RATING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRating(long newRating) {
		eSet(AbilityPackage.Literals.PARTY_SKILL__RATING, newRating);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSkillLevel() {
		return (Long)eGet(AbilityPackage.Literals.PARTY_SKILL__SKILL_LEVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkillLevel(long newSkillLevel) {
		eSet(AbilityPackage.Literals.PARTY_SKILL__SKILL_LEVEL, newSkillLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkillType getSkillTypeId() {
		return (SkillType)eGet(AbilityPackage.Literals.PARTY_SKILL__SKILL_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkillTypeId(SkillType newSkillTypeId) {
		eSet(AbilityPackage.Literals.PARTY_SKILL__SKILL_TYPE_ID, newSkillTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartedUsingDate() {
		return (Date)eGet(AbilityPackage.Literals.PARTY_SKILL__STARTED_USING_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartedUsingDate(Date newStartedUsingDate) {
		eSet(AbilityPackage.Literals.PARTY_SKILL__STARTED_USING_DATE, newStartedUsingDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getYearsExperience() {
		return (Long)eGet(AbilityPackage.Literals.PARTY_SKILL__YEARS_EXPERIENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYearsExperience(long newYearsExperience) {
		eSet(AbilityPackage.Literals.PARTY_SKILL__YEARS_EXPERIENCE, newYearsExperience);
	}

} //PartySkillImpl
