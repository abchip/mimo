/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.ability;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Skill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PartySkill#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PartySkill#getSkillTypeId <em>Skill Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PartySkill#getRating <em>Rating</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PartySkill#getSkillLevel <em>Skill Level</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PartySkill#getStartedUsingDate <em>Started Using Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PartySkill#getYearsExperience <em>Years Experience</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPartySkill()
 * @model
 * @generated
 */
public interface PartySkill extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPartySkill_PartyId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PartySkill#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rating</em>' attribute.
	 * @see #setRating(long)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPartySkill_Rating()
	 * @model
	 * @generated
	 */
	long getRating();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PartySkill#getRating <em>Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rating</em>' attribute.
	 * @see #getRating()
	 * @generated
	 */
	void setRating(long value);

	/**
	 * Returns the value of the '<em><b>Skill Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skill Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill Level</em>' attribute.
	 * @see #setSkillLevel(long)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPartySkill_SkillLevel()
	 * @model
	 * @generated
	 */
	long getSkillLevel();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PartySkill#getSkillLevel <em>Skill Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill Level</em>' attribute.
	 * @see #getSkillLevel()
	 * @generated
	 */
	void setSkillLevel(long value);

	/**
	 * Returns the value of the '<em><b>Skill Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skill Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill Type Id</em>' attribute.
	 * @see #setSkillTypeId(String)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPartySkill_SkillTypeId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='SkillType'"
	 * @generated
	 */
	String getSkillTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PartySkill#getSkillTypeId <em>Skill Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill Type Id</em>' attribute.
	 * @see #getSkillTypeId()
	 * @generated
	 */
	void setSkillTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Started Using Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started Using Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started Using Date</em>' attribute.
	 * @see #setStartedUsingDate(Date)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPartySkill_StartedUsingDate()
	 * @model
	 * @generated
	 */
	Date getStartedUsingDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PartySkill#getStartedUsingDate <em>Started Using Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Started Using Date</em>' attribute.
	 * @see #getStartedUsingDate()
	 * @generated
	 */
	void setStartedUsingDate(Date value);

	/**
	 * Returns the value of the '<em><b>Years Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Years Experience</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Years Experience</em>' attribute.
	 * @see #setYearsExperience(long)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPartySkill_YearsExperience()
	 * @model
	 * @generated
	 */
	long getYearsExperience();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PartySkill#getYearsExperience <em>Years Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Years Experience</em>' attribute.
	 * @see #getYearsExperience()
	 * @generated
	 */
	void setYearsExperience(long value);

} // PartySkill
