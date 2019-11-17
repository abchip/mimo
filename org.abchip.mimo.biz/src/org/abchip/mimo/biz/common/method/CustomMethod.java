/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.method;

import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.method.CustomMethod#getCustomMethodId <em>Custom Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.method.CustomMethod#getCustomMethodName <em>Custom Method Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.method.CustomMethod#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.method.CustomMethod#getCustomMethodTypeId <em>Custom Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.method.CustomMethod#getFixedAssetDepMethods <em>Fixed Asset Dep Methods</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.method.MethodPackage#getCustomMethod()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface CustomMethod extends BizEntityTyped<CustomMethodType> {
	/**
	 * Returns the value of the '<em><b>Custom Method Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Method Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Method Id</em>' attribute.
	 * @see #setCustomMethodId(String)
	 * @see org.abchip.mimo.biz.common.method.MethodPackage#getCustomMethod_CustomMethodId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getCustomMethodId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.method.CustomMethod#getCustomMethodId <em>Custom Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Method Id</em>' attribute.
	 * @see #getCustomMethodId()
	 * @generated
	 */
	void setCustomMethodId(String value);

	/**
	 * Returns the value of the '<em><b>Custom Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Method Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Method Name</em>' attribute.
	 * @see #setCustomMethodName(String)
	 * @see org.abchip.mimo.biz.common.method.MethodPackage#getCustomMethod_CustomMethodName()
	 * @model annotation="mimo-ent-format type='long-varchar' length='255'"
	 * @generated
	 */
	String getCustomMethodName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.method.CustomMethod#getCustomMethodName <em>Custom Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Method Name</em>' attribute.
	 * @see #getCustomMethodName()
	 * @generated
	 */
	void setCustomMethodName(String value);

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
	 * @see org.abchip.mimo.biz.common.method.MethodPackage#getCustomMethod_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.method.CustomMethod#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset Dep Methods</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Dep Methods</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Dep Methods</em>' attribute list.
	 * @see org.abchip.mimo.biz.common.method.MethodPackage#getCustomMethod_FixedAssetDepMethods()
	 * @model required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FixedAssetDepMethod'"
	 * @generated
	 */
	List<String> getFixedAssetDepMethods();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Content' route='customMethodId'"
	 * @generated
	 */
	List<String> contents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CostComponentCalc' route='costCustomMethodId'"
	 * @generated
	 */
	List<String> costComponentCalcs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PartyAcctgPreference' route='invoiceSeqCustMethId'"
	 * @generated
	 */
	List<String> invoicePartyAcctgPreferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PartyAcctgPreference' route='orderSeqCustMethId'"
	 * @generated
	 */
	List<String> orderPartyAcctgPreferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductStoreShipmentMeth' route='shipmentCustomMethodId'"
	 * @generated
	 */
	List<String> productStoreShipmentMeths();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PartyAcctgPreference' route='quoteSeqCustMethId'"
	 * @generated
	 */
	List<String> quotePartyAcctgPreferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='UomConversion' route='customMethodId'"
	 * @generated
	 */
	List<String> uomCustomMethodUomConversions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='WorkEffort' route='estimateCalcMethod'"
	 * @generated
	 */
	List<String> workEfforts();

	/**
	 * Returns the value of the '<em><b>Custom Method Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Method Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Method Type Id</em>' reference.
	 * @see #setCustomMethodTypeId(CustomMethodType)
	 * @see org.abchip.mimo.biz.common.method.MethodPackage#getCustomMethod_CustomMethodTypeId()
	 * @model keys="customMethodTypeId"
	 * @generated
	 */
	CustomMethodType getCustomMethodTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.method.CustomMethod#getCustomMethodTypeId <em>Custom Method Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Method Type Id</em>' reference.
	 * @see #getCustomMethodTypeId()
	 * @generated
	 */
	void setCustomMethodTypeId(CustomMethodType value);

} // CustomMethod
