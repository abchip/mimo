/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.agreement;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agreement Work Effort Applic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.AgreementWorkEffortApplic#getAgreementId <em>Agreement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.AgreementWorkEffortApplic#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.AgreementWorkEffortApplic#getWorkEffortId <em>Work Effort Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreementWorkEffortApplic()
 * @model
 * @generated
 */
public interface AgreementWorkEffortApplic extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Agreement Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Item Seq Id</em>' attribute.
	 * @see #setAgreementItemSeqId(String)
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreementWorkEffortApplic_AgreementItemSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getAgreementItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.AgreementWorkEffortApplic#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Item Seq Id</em>' attribute.
	 * @see #getAgreementItemSeqId()
	 * @generated
	 */
	void setAgreementItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Work Effort Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Id</em>' attribute.
	 * @see #setWorkEffortId(String)
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreementWorkEffortApplic_WorkEffortId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='WorkEffort'"
	 * @generated
	 */
	String getWorkEffortId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.AgreementWorkEffortApplic#getWorkEffortId <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Id</em>' attribute.
	 * @see #getWorkEffortId()
	 * @generated
	 */
	void setWorkEffortId(String value);

	/**
	 * Returns the value of the '<em><b>Agreement Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Id</em>' attribute.
	 * @see #setAgreementId(String)
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreementWorkEffortApplic_AgreementId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Agreement'"
	 * @generated
	 */
	String getAgreementId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.AgreementWorkEffortApplic#getAgreementId <em>Agreement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Id</em>' attribute.
	 * @see #getAgreementId()
	 * @generated
	 */
	void setAgreementId(String value);

} // AgreementWorkEffortApplic
