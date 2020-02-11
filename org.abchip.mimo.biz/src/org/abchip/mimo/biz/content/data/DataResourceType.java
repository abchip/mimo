/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.data;

import java.util.List;
import org.abchip.mimo.biz.BizEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResourceType#getDataResourceTypeId <em>Data Resource Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResourceType#getDataResourceTypeAttrs <em>Data Resource Type Attrs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResourceType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResourceType#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResourceType#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResourceType()
 * @model annotation="mimo-ent-frame title='Data Object Type' dictionary='ContentEntityLabels' formula='description'"
 * @generated
 */
public interface DataResourceType extends BizEntityType<DataResource> {
	/**
	 * Returns the value of the '<em><b>Data Resource Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Resource Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Resource Type Id</em>' attribute.
	 * @see #setDataResourceTypeId(String)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResourceType_DataResourceTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getDataResourceTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResourceType#getDataResourceTypeId <em>Data Resource Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Resource Type Id</em>' attribute.
	 * @see #getDataResourceTypeId()
	 * @generated
	 */
	void setDataResourceTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Data Resource Type Attrs</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.content.data.DataResourceTypeAttr}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Resource Type Attrs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Resource Type Attrs</em>' reference list.
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResourceType_DataResourceTypeAttrs()
	 * @model derived="true"
	 * @generated
	 */
	List<DataResourceTypeAttr> getDataResourceTypeAttrs();

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
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResourceType_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResourceType#getDescription <em>Description</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResourceType_HasTable()
	 * @model
	 * @generated
	 */
	boolean isHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResourceType#isHasTable <em>Has Table</em>}' attribute.
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
	 * @see #setParentTypeId(DataResourceType)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResourceType_ParentTypeId()
	 * @model keys="dataResourceTypeId"
	 * @generated
	 */
	DataResourceType getParentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResourceType#getParentTypeId <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type Id</em>' reference.
	 * @see #getParentTypeId()
	 * @generated
	 */
	void setParentTypeId(DataResourceType value);

} // DataResourceType
