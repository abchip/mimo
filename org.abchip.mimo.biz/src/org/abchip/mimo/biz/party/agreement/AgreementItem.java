/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.agreement;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agreement Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.AgreementItem#getAgreementId <em>Agreement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.AgreementItem#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.AgreementItem#getAgreementImage <em>Agreement Image</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.AgreementItem#getAgreementItemTypeId <em>Agreement Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.AgreementItem#getAgreementText <em>Agreement Text</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.AgreementItem#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreementItem()
 * @model
 * @generated
 */
public interface AgreementItem extends BizEntityTyped<AgreementItemType> {
	/**
	 * Returns the value of the '<em><b>Agreement Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Image</em>' attribute.
	 * @see #setAgreementImage(Object)
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreementItem_AgreementImage()
	 * @model
	 * @generated
	 */
	Object getAgreementImage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.AgreementItem#getAgreementImage <em>Agreement Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Image</em>' attribute.
	 * @see #getAgreementImage()
	 * @generated
	 */
	void setAgreementImage(Object value);

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
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreementItem_AgreementItemSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getAgreementItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.AgreementItem#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Item Seq Id</em>' attribute.
	 * @see #getAgreementItemSeqId()
	 * @generated
	 */
	void setAgreementItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Agreement Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Text</em>' attribute.
	 * @see #setAgreementText(String)
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreementItem_AgreementText()
	 * @model
	 * @generated
	 */
	String getAgreementText();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.AgreementItem#getAgreementText <em>Agreement Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Text</em>' attribute.
	 * @see #getAgreementText()
	 * @generated
	 */
	void setAgreementText(String value);

	/**
	 * Returns the value of the '<em><b>Currency Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #setCurrencyUomId(String)
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreementItem_CurrencyUomId()
	 * @model
	 * @generated
	 */
	String getCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.AgreementItem#getCurrencyUomId <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #getCurrencyUomId()
	 * @generated
	 */
	void setCurrencyUomId(String value);

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
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreementItem_AgreementId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Agreement'"
	 * @generated
	 */
	String getAgreementId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.AgreementItem#getAgreementId <em>Agreement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Id</em>' attribute.
	 * @see #getAgreementId()
	 * @generated
	 */
	void setAgreementId(String value);

	/**
	 * Returns the value of the '<em><b>Agreement Item Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement Item Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Item Type Id</em>' attribute.
	 * @see #setAgreementItemTypeId(String)
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreementItem_AgreementItemTypeId()
	 * @model annotation="mimo-ent-domain frame='AgreementItemType'"
	 * @generated
	 */
	String getAgreementItemTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.AgreementItem#getAgreementItemTypeId <em>Agreement Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Item Type Id</em>' attribute.
	 * @see #getAgreementItemTypeId()
	 * @generated
	 */
	void setAgreementItemTypeId(String value);

} // AgreementItem
