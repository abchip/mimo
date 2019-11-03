/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.ability;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skill Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.SkillType#getSkillTypeId <em>Skill Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.SkillType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.SkillType#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.SkillType#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getSkillType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface SkillType extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getSkillType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.SkillType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Table</em>' attribute.
	 * @see #setHasTable(boolean)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getSkillType_HasTable()
	 * @model
	 * @generated
	 */
	boolean isHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.SkillType#isHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #isHasTable()
	 * @generated
	 */
	void setHasTable(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type Id</em>' attribute.
	 * @see #setParentTypeId(String)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getSkillType_ParentTypeId()
	 * @model annotation="mimo-ent-domain frame='SkillType'"
	 * @generated
	 */
	String getParentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.SkillType#getParentTypeId <em>Parent Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type Id</em>' attribute.
	 * @see #getParentTypeId()
	 * @generated
	 */
	void setParentTypeId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SkillType' route='parentTypeId'"
	 * @generated
	 */
	List<String> childSkillTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='JobRequisition' route='skillTypeId'"
	 * @generated
	 */
	List<String> jobRequisitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PartySkill' route='skillTypeId'"
	 * @generated
	 */
	List<String> partySkills();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='QuoteItem' route='skillTypeId'"
	 * @generated
	 */
	List<String> quoteItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='WorkEffortSkillStandard' route='skillTypeId'"
	 * @generated
	 */
	List<String> workEffortSkillStandards();

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
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getSkillType_SkillTypeId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getSkillTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.SkillType#getSkillTypeId <em>Skill Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill Type Id</em>' attribute.
	 * @see #getSkillTypeId()
	 * @generated
	 */
	void setSkillTypeId(String value);

} // SkillType
