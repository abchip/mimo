/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.need;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Need</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.need.PartyNeed#getPartyNeedId <em>Party Need Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.PartyNeed#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.PartyNeed#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.PartyNeed#getCommunicationEventId <em>Communication Event Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.PartyNeed#getDatetimeRecorded <em>Datetime Recorded</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.PartyNeed#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.PartyNeed#getNeedTypeId <em>Need Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.PartyNeed#getPartyTypeId <em>Party Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.PartyNeed#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.PartyNeed#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.need.PartyNeed#getVisitId <em>Visit Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.need.NeedPackage#getPartyNeed()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface PartyNeed extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Datetime Recorded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datetime Recorded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datetime Recorded</em>' attribute.
	 * @see #setDatetimeRecorded(Date)
	 * @see org.abchip.mimo.biz.party.need.NeedPackage#getPartyNeed_DatetimeRecorded()
	 * @model
	 * @generated
	 */
	Date getDatetimeRecorded();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.need.PartyNeed#getDatetimeRecorded <em>Datetime Recorded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datetime Recorded</em>' attribute.
	 * @see #getDatetimeRecorded()
	 * @generated
	 */
	void setDatetimeRecorded(Date value);

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
	 * @see org.abchip.mimo.biz.party.need.NeedPackage#getPartyNeed_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.need.PartyNeed#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see org.abchip.mimo.biz.party.need.NeedPackage#getPartyNeed_PartyId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.need.PartyNeed#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Party Need Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Need Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Need Id</em>' attribute.
	 * @see #setPartyNeedId(String)
	 * @see org.abchip.mimo.biz.party.need.NeedPackage#getPartyNeed_PartyNeedId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getPartyNeedId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.need.PartyNeed#getPartyNeedId <em>Party Need Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Need Id</em>' attribute.
	 * @see #getPartyNeedId()
	 * @generated
	 */
	void setPartyNeedId(String value);

	/**
	 * Returns the value of the '<em><b>Party Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Type Id</em>' attribute.
	 * @see #setPartyTypeId(String)
	 * @see org.abchip.mimo.biz.party.need.NeedPackage#getPartyNeed_PartyTypeId()
	 * @model annotation="mimo-ent-domain frame='PartyType'"
	 * @generated
	 */
	String getPartyTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.need.PartyNeed#getPartyTypeId <em>Party Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Type Id</em>' attribute.
	 * @see #getPartyTypeId()
	 * @generated
	 */
	void setPartyTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Product Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Category Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Category Id</em>' attribute.
	 * @see #setProductCategoryId(String)
	 * @see org.abchip.mimo.biz.party.need.NeedPackage#getPartyNeed_ProductCategoryId()
	 * @model annotation="mimo-ent-domain frame='ProductCategory'"
	 * @generated
	 */
	String getProductCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.need.PartyNeed#getProductCategoryId <em>Product Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Category Id</em>' attribute.
	 * @see #getProductCategoryId()
	 * @generated
	 */
	void setProductCategoryId(String value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' attribute.
	 * @see #setProductId(String)
	 * @see org.abchip.mimo.biz.party.need.NeedPackage#getPartyNeed_ProductId()
	 * @model annotation="mimo-ent-domain frame='Product'"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.need.PartyNeed#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

	/**
	 * Returns the value of the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id</em>' attribute.
	 * @see #setRoleTypeId(String)
	 * @see org.abchip.mimo.biz.party.need.NeedPackage#getPartyNeed_RoleTypeId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='RoleType'"
	 * @generated
	 */
	String getRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.need.PartyNeed#getRoleTypeId <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id</em>' attribute.
	 * @see #getRoleTypeId()
	 * @generated
	 */
	void setRoleTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Visit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visit Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visit Id</em>' attribute.
	 * @see #setVisitId(String)
	 * @see org.abchip.mimo.biz.party.need.NeedPackage#getPartyNeed_VisitId()
	 * @model
	 * @generated
	 */
	String getVisitId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.need.PartyNeed#getVisitId <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visit Id</em>' attribute.
	 * @see #getVisitId()
	 * @generated
	 */
	void setVisitId(String value);

	/**
	 * Returns the value of the '<em><b>Need Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Need Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Need Type Id</em>' attribute.
	 * @see #setNeedTypeId(String)
	 * @see org.abchip.mimo.biz.party.need.NeedPackage#getPartyNeed_NeedTypeId()
	 * @model annotation="mimo-ent-domain frame='NeedType'"
	 * @generated
	 */
	String getNeedTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.need.PartyNeed#getNeedTypeId <em>Need Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Need Type Id</em>' attribute.
	 * @see #getNeedTypeId()
	 * @generated
	 */
	void setNeedTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Communication Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Event Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Event Id</em>' attribute.
	 * @see #setCommunicationEventId(String)
	 * @see org.abchip.mimo.biz.party.need.NeedPackage#getPartyNeed_CommunicationEventId()
	 * @model annotation="mimo-ent-domain frame='CommunicationEvent'"
	 * @generated
	 */
	String getCommunicationEventId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.need.PartyNeed#getCommunicationEventId <em>Communication Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Event Id</em>' attribute.
	 * @see #getCommunicationEventId()
	 * @generated
	 */
	void setCommunicationEventId(String value);

} // PartyNeed
