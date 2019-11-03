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
 * @model
 * @generated
 */
public interface PartyResume extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Content Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Id</em>' attribute.
	 * @see #setContentId(String)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPartyResume_ContentId()
	 * @model annotation="mimo-ent-domain frame='Content'"
	 * @generated
	 */
	String getContentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PartyResume#getContentId <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Id</em>' attribute.
	 * @see #getContentId()
	 * @generated
	 */
	void setContentId(String value);

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
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPartyResume_PartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PartyResume#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

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
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
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
	 * @model
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
