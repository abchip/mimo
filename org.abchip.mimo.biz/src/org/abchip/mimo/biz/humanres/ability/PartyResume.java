/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.ability;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.content.content.Content;
import org.abchip.mimo.biz.party.party.Party;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Resume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PartyResume#getResumeId <em>Resume Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PartyResume#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PartyResume#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PartyResume#getResumeDate <em>Resume Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PartyResume#getResumeText <em>Resume Text</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPartyResume()
 * @model annotation="mimo-ent-frame title='Resume'"
 * @generated
 */
public interface PartyResume extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Content Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Id</em>' reference.
	 * @see #setContentId(Content)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPartyResume_ContentId()
	 * @model keys="contentId"
	 * @generated
	 */
	Content getContentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PartyResume#getContentId <em>Content Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Id</em>' reference.
	 * @see #getContentId()
	 * @generated
	 */
	void setContentId(Content value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' reference.
	 * @see #setPartyId(Party)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPartyResume_PartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PartyResume#getPartyId <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' reference.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Resume Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resume Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resume Date</em>' attribute.
	 * @see #setResumeDate(Date)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPartyResume_ResumeDate()
	 * @model
	 * @generated
	 */
	Date getResumeDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PartyResume#getResumeDate <em>Resume Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resume Date</em>' attribute.
	 * @see #getResumeDate()
	 * @generated
	 */
	void setResumeDate(Date value);

	/**
	 * Returns the value of the '<em><b>Resume Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resume Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resume Id</em>' attribute.
	 * @see #setResumeId(String)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPartyResume_ResumeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getResumeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PartyResume#getResumeId <em>Resume Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resume Id</em>' attribute.
	 * @see #getResumeId()
	 * @generated
	 */
	void setResumeId(String value);

	/**
	 * Returns the value of the '<em><b>Resume Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resume Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resume Text</em>' attribute.
	 * @see #setResumeText(String)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPartyResume_ResumeText()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getResumeText();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PartyResume#getResumeText <em>Resume Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resume Text</em>' attribute.
	 * @see #getResumeText()
	 * @generated
	 */
	void setResumeText(String value);

} // PartyResume
