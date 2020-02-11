/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.agreement;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.RoleType;
import org.abchip.mimo.biz.product.product.Product;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agreement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.Agreement#getAgreementId <em>Agreement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.Agreement#getAgreementAttributes <em>Agreement Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.Agreement#getAgreementDate <em>Agreement Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.Agreement#getAgreementItems <em>Agreement Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.Agreement#getAgreementTypeId <em>Agreement Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.Agreement#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.Agreement#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.Agreement#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.Agreement#getPartyIdTo <em>Party Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.Agreement#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.Agreement#getRoleTypeIdFrom <em>Role Type Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.Agreement#getRoleTypeIdTo <em>Role Type Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.Agreement#getTextData <em>Text Data</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.Agreement#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreement()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface Agreement extends BizEntityTyped<AgreementType> {
	/**
	 * Returns the value of the '<em><b>Agreement Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Date</em>' attribute.
	 * @see #setAgreementDate(Date)
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreement_AgreementDate()
	 * @model
	 * @generated
	 */
	Date getAgreementDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.Agreement#getAgreementDate <em>Agreement Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Date</em>' attribute.
	 * @see #getAgreementDate()
	 * @generated
	 */
	void setAgreementDate(Date value);

	/**
	 * Returns the value of the '<em><b>Agreement Items</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.party.agreement.AgreementItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Items</em>' reference list.
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreement_AgreementItems()
	 * @model derived="true"
	 * @generated
	 */
	List<AgreementItem> getAgreementItems();

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
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreement_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.Agreement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreement_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.Agreement#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Party Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id From</em>' reference.
	 * @see #setPartyIdFrom(Party)
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreement_PartyIdFrom()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getPartyIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.Agreement#getPartyIdFrom <em>Party Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id From</em>' reference.
	 * @see #getPartyIdFrom()
	 * @generated
	 */
	void setPartyIdFrom(Party value);

	/**
	 * Returns the value of the '<em><b>Party Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id To</em>' reference.
	 * @see #setPartyIdTo(Party)
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreement_PartyIdTo()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getPartyIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.Agreement#getPartyIdTo <em>Party Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id To</em>' reference.
	 * @see #getPartyIdTo()
	 * @generated
	 */
	void setPartyIdTo(Party value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' reference.
	 * @see #setProductId(Product)
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreement_ProductId()
	 * @model keys="productId"
	 * @generated
	 */
	Product getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.Agreement#getProductId <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' reference.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(Product value);

	/**
	 * Returns the value of the '<em><b>Role Type Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id From</em>' reference.
	 * @see #setRoleTypeIdFrom(RoleType)
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreement_RoleTypeIdFrom()
	 * @model keys="roleTypeId"
	 * @generated
	 */
	RoleType getRoleTypeIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.Agreement#getRoleTypeIdFrom <em>Role Type Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id From</em>' reference.
	 * @see #getRoleTypeIdFrom()
	 * @generated
	 */
	void setRoleTypeIdFrom(RoleType value);

	/**
	 * Returns the value of the '<em><b>Role Type Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id To</em>' reference.
	 * @see #setRoleTypeIdTo(RoleType)
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreement_RoleTypeIdTo()
	 * @model keys="roleTypeId"
	 * @generated
	 */
	RoleType getRoleTypeIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.Agreement#getRoleTypeIdTo <em>Role Type Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id To</em>' reference.
	 * @see #getRoleTypeIdTo()
	 * @generated
	 */
	void setRoleTypeIdTo(RoleType value);

	/**
	 * Returns the value of the '<em><b>Text Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Data</em>' attribute.
	 * @see #setTextData(String)
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreement_TextData()
	 * @model
	 * @generated
	 */
	String getTextData();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.Agreement#getTextData <em>Text Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Data</em>' attribute.
	 * @see #getTextData()
	 * @generated
	 */
	void setTextData(String value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreement_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.Agreement#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Agreement Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Type Id</em>' reference.
	 * @see #setAgreementTypeId(AgreementType)
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreement_AgreementTypeId()
	 * @model keys="agreementTypeId"
	 * @generated
	 */
	AgreementType getAgreementTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.Agreement#getAgreementTypeId <em>Agreement Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Type Id</em>' reference.
	 * @see #getAgreementTypeId()
	 * @generated
	 */
	void setAgreementTypeId(AgreementType value);

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
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreement_AgreementId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getAgreementId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.agreement.Agreement#getAgreementId <em>Agreement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Id</em>' attribute.
	 * @see #getAgreementId()
	 * @generated
	 */
	void setAgreementId(String value);

	/**
	 * Returns the value of the '<em><b>Agreement Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.party.agreement.AgreementAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.party.agreement.AgreementPackage#getAgreement_AgreementAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<AgreementAttribute> getAgreementAttributes();

} // Agreement
