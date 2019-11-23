/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.request;

import java.util.List;

import org.abchip.mimo.biz.BizEntityType;
import org.abchip.mimo.biz.party.party.Party;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cust Request Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequestType#getCustRequestTypeId <em>Cust Request Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequestType#getCustRequestTypeAttrs <em>Cust Request Type Attrs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequestType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequestType#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequestType#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequestType#getPartyId <em>Party Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequestType()
 * @model annotation="mimo-ent-frame title='Customer Request Type' dictionary='OrderEntityLabels' formula='description'"
 * @generated
 */
public interface CustRequestType extends BizEntityType<CustRequest> {
	/**
	 * Returns the value of the '<em><b>Cust Request Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Type Id</em>' attribute.
	 * @see #setCustRequestTypeId(String)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequestType_CustRequestTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 * @generated
	 */
	String getCustRequestTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequestType#getCustRequestTypeId <em>Cust Request Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Type Id</em>' attribute.
	 * @see #getCustRequestTypeId()
	 * @generated
	 */
	void setCustRequestTypeId(String value);

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
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequestType_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequestType#getDescription <em>Description</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequestType_HasTable()
	 * @model annotation="mimo-ent-format type='indicator' length='1'"
	 * @generated
	 */
	boolean isHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequestType#isHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #isHasTable()
	 * @generated
	 */
	void setHasTable(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type Id</em>' reference.
	 * @see #setParentTypeId(CustRequestType)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequestType_ParentTypeId()
	 * @model keys="custRequestTypeId"
	 * @generated
	 */
	CustRequestType getParentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequestType#getParentTypeId <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type Id</em>' reference.
	 * @see #getParentTypeId()
	 * @generated
	 */
	void setParentTypeId(CustRequestType value);

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
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequestType_PartyId()
	 * @model keys="partyId"
	 *        annotation="mimo-ent-slot help='party or party group(via partyRelationShip entity) responsible for responding to the communication request of this particular type'"
	 * @generated
	 */
	Party getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequestType#getPartyId <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' reference.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Cust Request Type Attrs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Type Attrs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Type Attrs</em>' attribute list.
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequestType_CustRequestTypeAttrs()
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CustRequestTypeAttr'"
	 * @generated
	 */
	List<String> getCustRequestTypeAttrs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CustRequestType' route='parentTypeId'"
	 * @generated
	 */
	List<String> childCustRequestTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CustRequestCategory' route='custRequestTypeId'"
	 * @generated
	 */
	List<String> custRequestCategories();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CustRequestResolution' route='custRequestTypeId'"
	 * @generated
	 */
	List<String> custRequestResolutions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CustRequest' route='custRequestTypeId'"
	 * @generated
	 */
	List<String> custRequests();

} // CustRequestType
