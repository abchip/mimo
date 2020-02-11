/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.ability;

import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.biz.party.party.Party;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perf Review Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PerfReviewItem#getEmployeePartyId <em>Employee Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PerfReviewItem#getEmployeeRoleTypeId <em>Employee Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PerfReviewItem#getPerfReviewId <em>Perf Review Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PerfReviewItem#getPerfReviewItemSeqId <em>Perf Review Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PerfReviewItem#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PerfReviewItem#getPerfRatingTypeId <em>Perf Rating Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.PerfReviewItem#getPerfReviewItemTypeId <em>Perf Review Item Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPerfReviewItem()
 * @model annotation="mimo-ent-frame title='Performance Review Item'"
 * @generated
 */
public interface PerfReviewItem extends BizEntityTyped<PerfReviewItemType> {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPerfReviewItem_Comments()
	 * @model annotation="mimo-ent-format type='comment' length='255'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PerfReviewItem#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Employee Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee Party Id</em>' reference.
	 * @see #setEmployeePartyId(Party)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPerfReviewItem_EmployeePartyId()
	 * @model keys="partyId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getEmployeePartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PerfReviewItem#getEmployeePartyId <em>Employee Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee Party Id</em>' reference.
	 * @see #getEmployeePartyId()
	 * @generated
	 */
	void setEmployeePartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Employee Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee Role Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee Role Type Id</em>' attribute.
	 * @see #setEmployeeRoleTypeId(String)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPerfReviewItem_EmployeeRoleTypeId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getEmployeeRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PerfReviewItem#getEmployeeRoleTypeId <em>Employee Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee Role Type Id</em>' attribute.
	 * @see #getEmployeeRoleTypeId()
	 * @generated
	 */
	void setEmployeeRoleTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Perf Rating Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perf Rating Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perf Rating Type Id</em>' reference.
	 * @see #setPerfRatingTypeId(PerfRatingType)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPerfReviewItem_PerfRatingTypeId()
	 * @model keys="perfRatingTypeId"
	 * @generated
	 */
	PerfRatingType getPerfRatingTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PerfReviewItem#getPerfRatingTypeId <em>Perf Rating Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perf Rating Type Id</em>' reference.
	 * @see #getPerfRatingTypeId()
	 * @generated
	 */
	void setPerfRatingTypeId(PerfRatingType value);

	/**
	 * Returns the value of the '<em><b>Perf Review Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perf Review Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perf Review Id</em>' attribute.
	 * @see #setPerfReviewId(String)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPerfReviewItem_PerfReviewId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPerfReviewId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PerfReviewItem#getPerfReviewId <em>Perf Review Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perf Review Id</em>' attribute.
	 * @see #getPerfReviewId()
	 * @generated
	 */
	void setPerfReviewId(String value);

	/**
	 * Returns the value of the '<em><b>Perf Review Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perf Review Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perf Review Item Seq Id</em>' attribute.
	 * @see #setPerfReviewItemSeqId(String)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPerfReviewItem_PerfReviewItemSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPerfReviewItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PerfReviewItem#getPerfReviewItemSeqId <em>Perf Review Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perf Review Item Seq Id</em>' attribute.
	 * @see #getPerfReviewItemSeqId()
	 * @generated
	 */
	void setPerfReviewItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Perf Review Item Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perf Review Item Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perf Review Item Type Id</em>' reference.
	 * @see #setPerfReviewItemTypeId(PerfReviewItemType)
	 * @see org.abchip.mimo.biz.humanres.ability.AbilityPackage#getPerfReviewItem_PerfReviewItemTypeId()
	 * @model keys="perfReviewItemTypeId"
	 * @generated
	 */
	PerfReviewItemType getPerfReviewItemTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.ability.PerfReviewItem#getPerfReviewItemTypeId <em>Perf Review Item Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perf Review Item Type Id</em>' reference.
	 * @see #getPerfReviewItemTypeId()
	 * @generated
	 */
	void setPerfReviewItemTypeId(PerfReviewItemType value);

} // PerfReviewItem
