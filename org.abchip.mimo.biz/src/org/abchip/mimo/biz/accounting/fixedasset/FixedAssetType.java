/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.fixedasset;

import java.util.List;

import org.abchip.mimo.biz.BizEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Asset Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetType#getFixedAssetTypeId <em>Fixed Asset Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetType#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetType#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetType#getFixedAssetTypeAttrs <em>Fixed Asset Type Attrs</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface FixedAssetType extends BizEntityType<FixedAsset> {
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
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetType#getDescription <em>Description</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetType_HasTable()
	 * @model
	 * @generated
	 */
	boolean isHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetType#isHasTable <em>Has Table</em>}' attribute.
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
	 * If the meaning of the '<em>Parent Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type Id</em>' reference.
	 * @see #setParentTypeId(FixedAssetType)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetType_ParentTypeId()
	 * @model keys="fixedAssetTypeId"
	 * @generated
	 */
	FixedAssetType getParentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetType#getParentTypeId <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type Id</em>' reference.
	 * @see #getParentTypeId()
	 * @generated
	 */
	void setParentTypeId(FixedAssetType value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset Type Attrs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Type Attrs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Type Attrs</em>' attribute list.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetType_FixedAssetTypeAttrs()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FixedAssetTypeAttr'"
	 * @generated
	 */
	List<String> getFixedAssetTypeAttrs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FixedAssetType' route='parentTypeId'"
	 * @generated
	 */
	List<String> childFixedAssetTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FixedAsset' route='fixedAssetTypeId'"
	 * @generated
	 */
	List<String> fixedAssets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='WorkEffortFixedAssetStd' route='fixedAssetTypeId'"
	 * @generated
	 */
	List<String> workEffortFixedAssetStds();

	/**
	 * Returns the value of the '<em><b>Fixed Asset Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Type Id</em>' attribute.
	 * @see #setFixedAssetTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetType_FixedAssetTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getFixedAssetTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetType#getFixedAssetTypeId <em>Fixed Asset Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset Type Id</em>' attribute.
	 * @see #getFixedAssetTypeId()
	 * @generated
	 */
	void setFixedAssetTypeId(String value);

} // FixedAssetType
