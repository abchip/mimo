/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.agreement;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Addendum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.Addendum#getAddendumId <em>Addendum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.Addendum#getAddendumCreationDate <em>Addendum Creation Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.Addendum#getAddendumEffectiveDate <em>Addendum Effective Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.Addendum#getAddendumText <em>Addendum Text</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.Addendum#getAgreementId <em>Agreement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.Addendum#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAddendum()
 * @model
 * @generated
 */
public interface Addendum extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Addendum Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addendum Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addendum Creation Date</em>' attribute.
	 * @see #setAddendumCreationDate(Date)
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAddendum_AddendumCreationDate()
	 * @model
	 * @generated
	 */
	Date getAddendumCreationDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.Addendum#getAddendumCreationDate <em>Addendum Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addendum Creation Date</em>' attribute.
	 * @see #getAddendumCreationDate()
	 * @generated
	 */
	void setAddendumCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Addendum Effective Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addendum Effective Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addendum Effective Date</em>' attribute.
	 * @see #setAddendumEffectiveDate(Date)
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAddendum_AddendumEffectiveDate()
	 * @model
	 * @generated
	 */
	Date getAddendumEffectiveDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.Addendum#getAddendumEffectiveDate <em>Addendum Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addendum Effective Date</em>' attribute.
	 * @see #getAddendumEffectiveDate()
	 * @generated
	 */
	void setAddendumEffectiveDate(Date value);

	/**
	 * Returns the value of the '<em><b>Addendum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addendum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addendum Id</em>' attribute.
	 * @see #setAddendumId(String)
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAddendum_AddendumId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getAddendumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.Addendum#getAddendumId <em>Addendum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addendum Id</em>' attribute.
	 * @see #getAddendumId()
	 * @generated
	 */
	void setAddendumId(String value);

	/**
	 * Returns the value of the '<em><b>Addendum Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addendum Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addendum Text</em>' attribute.
	 * @see #setAddendumText(String)
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAddendum_AddendumText()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getAddendumText();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.Addendum#getAddendumText <em>Addendum Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addendum Text</em>' attribute.
	 * @see #getAddendumText()
	 * @generated
	 */
	void setAddendumText(String value);

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
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAddendum_AgreementItemSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getAgreementItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.Addendum#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Item Seq Id</em>' attribute.
	 * @see #getAgreementItemSeqId()
	 * @generated
	 */
	void setAgreementItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Agreement Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Id</em>' reference.
	 * @see #setAgreementId(Agreement)
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAddendum_AgreementId()
	 * @model keys="agreementId"
	 * @generated
	 */
	Agreement getAgreementId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.Addendum#getAgreementId <em>Agreement Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Id</em>' reference.
	 * @see #getAgreementId()
	 * @generated
	 */
	void setAgreementId(Agreement value);

} // Addendum
