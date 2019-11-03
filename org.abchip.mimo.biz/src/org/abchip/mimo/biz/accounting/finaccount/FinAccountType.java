/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.finaccount;

import java.util.List;

import org.abchip.mimo.biz.BizEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fin Account Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountType#getFinAccountTypeId <em>Fin Account Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountType#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountType#isIsRefundable <em>Is Refundable</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountType#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountType#getReplenishEnumId <em>Replenish Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountType#getFinAccountTypeAttrs <em>Fin Account Type Attrs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountType#getFinAccountTypeGlAccounts <em>Fin Account Type Gl Accounts</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccountType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface FinAccountType extends BizEntityType<FinAccount> {
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
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccountType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountType#getDescription <em>Description</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccountType_HasTable()
	 * @model
	 * @generated
	 */
	boolean isHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountType#isHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #isHasTable()
	 * @generated
	 */
	void setHasTable(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Refundable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Refundable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Refundable</em>' attribute.
	 * @see #setIsRefundable(boolean)
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccountType_IsRefundable()
	 * @model
	 * @generated
	 */
	boolean isIsRefundable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountType#isIsRefundable <em>Is Refundable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Refundable</em>' attribute.
	 * @see #isIsRefundable()
	 * @generated
	 */
	void setIsRefundable(boolean value);

	/**
	 * Returns the value of the '<em><b>Replenish Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replenish Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replenish Enum Id</em>' attribute.
	 * @see #setReplenishEnumId(String)
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccountType_ReplenishEnumId()
	 * @model
	 * @generated
	 */
	String getReplenishEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountType#getReplenishEnumId <em>Replenish Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replenish Enum Id</em>' attribute.
	 * @see #getReplenishEnumId()
	 * @generated
	 */
	void setReplenishEnumId(String value);

	/**
	 * Returns the value of the '<em><b>Fin Account Type Attrs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Account Type Attrs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Type Attrs</em>' attribute list.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccountType_FinAccountTypeAttrs()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FinAccountTypeAttr'"
	 * @generated
	 */
	List<String> getFinAccountTypeAttrs();

	/**
	 * Returns the value of the '<em><b>Fin Account Type Gl Accounts</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Account Type Gl Accounts</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Type Gl Accounts</em>' attribute list.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccountType_FinAccountTypeGlAccounts()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FinAccountTypeGlAccount'"
	 * @generated
	 */
	List<String> getFinAccountTypeGlAccounts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FinAccountType' route='parentTypeId'"
	 * @generated
	 */
	List<String> childFinAccountTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FinAccount' route='finAccountTypeId'"
	 * @generated
	 */
	List<String> finAccounts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductStoreFinActSetting' route='finAccountTypeId'"
	 * @generated
	 */
	List<String> productStoreFinActSettings();

	/**
	 * Returns the value of the '<em><b>Parent Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type Id</em>' attribute.
	 * @see #setParentTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccountType_ParentTypeId()
	 * @model annotation="mimo-ent-domain frame='FinAccountType'"
	 * @generated
	 */
	String getParentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountType#getParentTypeId <em>Parent Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type Id</em>' attribute.
	 * @see #getParentTypeId()
	 * @generated
	 */
	void setParentTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Fin Account Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Account Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Type Id</em>' attribute.
	 * @see #setFinAccountTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage#getFinAccountType_FinAccountTypeId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getFinAccountTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountType#getFinAccountTypeId <em>Fin Account Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account Type Id</em>' attribute.
	 * @see #getFinAccountTypeId()
	 * @generated
	 */
	void setFinAccountTypeId(String value);

} // FinAccountType
