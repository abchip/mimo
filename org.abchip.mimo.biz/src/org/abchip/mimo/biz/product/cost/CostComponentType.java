/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.cost;

import java.util.List;

import org.abchip.mimo.biz.BizEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponentType#getCostComponentTypeId <em>Cost Component Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponentType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponentType#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponentType#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.cost.CostComponentType#getCostComponentTypeAttrs <em>Cost Component Type Attrs</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponentType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface CostComponentType extends BizEntityType<CostComponent> {
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
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponentType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponentType#getDescription <em>Description</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponentType_HasTable()
	 * @model
	 * @generated
	 */
	boolean isHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponentType#isHasTable <em>Has Table</em>}' attribute.
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
	 * @see #setParentTypeId(CostComponentType)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponentType_ParentTypeId()
	 * @model keys="costComponentTypeId"
	 * @generated
	 */
	CostComponentType getParentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponentType#getParentTypeId <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type Id</em>' reference.
	 * @see #getParentTypeId()
	 * @generated
	 */
	void setParentTypeId(CostComponentType value);

	/**
	 * Returns the value of the '<em><b>Cost Component Type Attrs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Component Type Attrs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Component Type Attrs</em>' attribute list.
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponentType_CostComponentTypeAttrs()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CostComponentTypeAttr'"
	 * @generated
	 */
	List<String> getCostComponentTypeAttrs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CostComponentType' route='parentTypeId'"
	 * @generated
	 */
	List<String> childCostComponentTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CostComponent' route='costComponentTypeId'"
	 * @generated
	 */
	List<String> costComponents();

	/**
	 * Returns the value of the '<em><b>Cost Component Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Component Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Component Type Id</em>' attribute.
	 * @see #setCostComponentTypeId(String)
	 * @see org.abchip.mimo.biz.product.cost.CostPackage#getCostComponentType_CostComponentTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getCostComponentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.cost.CostComponentType#getCostComponentTypeId <em>Cost Component Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Component Type Id</em>' attribute.
	 * @see #getCostComponentTypeId()
	 * @generated
	 */
	void setCostComponentTypeId(String value);

} // CostComponentType
