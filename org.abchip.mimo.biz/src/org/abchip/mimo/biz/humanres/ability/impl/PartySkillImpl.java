/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Skill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PartySkillImpl#getRating <em>Rating</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PartySkillImpl#getSkillLevel <em>Skill Level</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PartySkillImpl#getStartedUsingDate <em>Started Using Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PartySkillImpl#getYearsExperience <em>Years Experience</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PartySkillImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PartySkillImpl#getSkillTypeId <em>Skill Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartySkillImpl extends BizEntityImpl implements PartySkill {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getRating() <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating()
	 * @generated
	 * @ordered
	 */
	protected static final long RATING_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRating() <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRating()
	 * @generated
	 * @ordered
	 */
	protected long rating = RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSkillLevel() <em>Skill Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkillLevel()
	 * @generated
	 * @ordered
	 */
	protected static final long SKILL_LEVEL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSkillLevel() <em>Skill Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkillLevel()
	 * @generated
	 * @ordered
	 */
	protected long skillLevel = SKILL_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartedUsingDate() <em>Started Using Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartedUsingDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date STARTED_USING_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartedUsingDate() <em>Started Using Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartedUsingDate()
	 * @generated
	 * @ordered
	 */
	protected Date startedUsingDate = STARTED_USING_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYearsExperience() <em>Years Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearsExperience()
	 * @generated
	 * @ordered
	 */
	protected static final long YEARS_EXPERIENCE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getYearsExperience() <em>Years Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearsExperience()
	 * @generated
	 * @ordered
	 */
	protected long yearsExperience = YEARS_EXPERIENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;

	/**
	 * The cached value of the '{@link #getSkillTypeId() <em>Skill Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkillTypeId()
	 * @generated
	 * @ordered
	 */
	protected SkillType skillTypeId;

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
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
			}
		}
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		partyId = newPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getRating() {
		return rating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRating(long newRating) {
		rating = newRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSkillLevel() {
		return skillLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkillLevel(long newSkillLevel) {
		skillLevel = newSkillLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkillType getSkillTypeId() {
		if (skillTypeId != null && ((EObject)skillTypeId).eIsProxy()) {
			InternalEObject oldSkillTypeId = (InternalEObject)skillTypeId;
			skillTypeId = (SkillType)eResolveProxy(oldSkillTypeId);
			if (skillTypeId != oldSkillTypeId) {
			}
		}
		return skillTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillType basicGetSkillTypeId() {
		return skillTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkillTypeId(SkillType newSkillTypeId) {
		skillTypeId = newSkillTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartedUsingDate() {
		return startedUsingDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartedUsingDate(Date newStartedUsingDate) {
		startedUsingDate = newStartedUsingDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getYearsExperience() {
		return yearsExperience;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYearsExperience(long newYearsExperience) {
		yearsExperience = newYearsExperience;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbilityPackage.PARTY_SKILL__RATING:
				return getRating();
			case AbilityPackage.PARTY_SKILL__SKILL_LEVEL:
				return getSkillLevel();
			case AbilityPackage.PARTY_SKILL__STARTED_USING_DATE:
				return getStartedUsingDate();
			case AbilityPackage.PARTY_SKILL__YEARS_EXPERIENCE:
				return getYearsExperience();
			case AbilityPackage.PARTY_SKILL__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case AbilityPackage.PARTY_SKILL__SKILL_TYPE_ID:
				if (resolve) return getSkillTypeId();
				return basicGetSkillTypeId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AbilityPackage.PARTY_SKILL__RATING:
				setRating((Long)newValue);
				return;
			case AbilityPackage.PARTY_SKILL__SKILL_LEVEL:
				setSkillLevel((Long)newValue);
				return;
			case AbilityPackage.PARTY_SKILL__STARTED_USING_DATE:
				setStartedUsingDate((Date)newValue);
				return;
			case AbilityPackage.PARTY_SKILL__YEARS_EXPERIENCE:
				setYearsExperience((Long)newValue);
				return;
			case AbilityPackage.PARTY_SKILL__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case AbilityPackage.PARTY_SKILL__SKILL_TYPE_ID:
				setSkillTypeId((SkillType)newValue);
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
			case AbilityPackage.PARTY_SKILL__RATING:
				setRating(RATING_EDEFAULT);
				return;
			case AbilityPackage.PARTY_SKILL__SKILL_LEVEL:
				setSkillLevel(SKILL_LEVEL_EDEFAULT);
				return;
			case AbilityPackage.PARTY_SKILL__STARTED_USING_DATE:
				setStartedUsingDate(STARTED_USING_DATE_EDEFAULT);
				return;
			case AbilityPackage.PARTY_SKILL__YEARS_EXPERIENCE:
				setYearsExperience(YEARS_EXPERIENCE_EDEFAULT);
				return;
			case AbilityPackage.PARTY_SKILL__PARTY_ID:
				setPartyId((Party)null);
				return;
			case AbilityPackage.PARTY_SKILL__SKILL_TYPE_ID:
				setSkillTypeId((SkillType)null);
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
			case AbilityPackage.PARTY_SKILL__RATING:
				return rating != RATING_EDEFAULT;
			case AbilityPackage.PARTY_SKILL__SKILL_LEVEL:
				return skillLevel != SKILL_LEVEL_EDEFAULT;
			case AbilityPackage.PARTY_SKILL__STARTED_USING_DATE:
				return STARTED_USING_DATE_EDEFAULT == null ? startedUsingDate != null : !STARTED_USING_DATE_EDEFAULT.equals(startedUsingDate);
			case AbilityPackage.PARTY_SKILL__YEARS_EXPERIENCE:
				return yearsExperience != YEARS_EXPERIENCE_EDEFAULT;
			case AbilityPackage.PARTY_SKILL__PARTY_ID:
				return partyId != null;
			case AbilityPackage.PARTY_SKILL__SKILL_TYPE_ID:
				return skillTypeId != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (rating: ");
		result.append(rating);
		result.append(", skillLevel: ");
		result.append(skillLevel);
		result.append(", startedUsingDate: ");
		result.append(startedUsingDate);
		result.append(", yearsExperience: ");
		result.append(yearsExperience);
		result.append(')');
		return result.toString();
	}

} //PartySkillImpl
