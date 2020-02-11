/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.requirement;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.product.feature.ProductFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Desired Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.DesiredFeature#getRequirementId <em>Requirement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.DesiredFeature#getDesiredFeatureId <em>Desired Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.DesiredFeature#isOptionalInd <em>Optional Ind</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.DesiredFeature#getProductFeatureId <em>Product Feature Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.requirement.RequirementPackage#getDesiredFeature()
 * @model
 * @generated
 */
public interface DesiredFeature extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Desired Feature Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desired Feature Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desired Feature Id</em>' attribute.
	 * @see #setDesiredFeatureId(String)
	 * @see org.abchip.mimo.biz.order.requirement.RequirementPackage#getDesiredFeature_DesiredFeatureId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getDesiredFeatureId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.requirement.DesiredFeature#getDesiredFeatureId <em>Desired Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desired Feature Id</em>' attribute.
	 * @see #getDesiredFeatureId()
	 * @generated
	 */
	void setDesiredFeatureId(String value);

	/**
	 * Returns the value of the '<em><b>Optional Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional Ind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Ind</em>' attribute.
	 * @see #setOptionalInd(boolean)
	 * @see org.abchip.mimo.biz.order.requirement.RequirementPackage#getDesiredFeature_OptionalInd()
	 * @model
	 * @generated
	 */
	boolean isOptionalInd();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.requirement.DesiredFeature#isOptionalInd <em>Optional Ind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional Ind</em>' attribute.
	 * @see #isOptionalInd()
	 * @generated
	 */
	void setOptionalInd(boolean value);

	/**
	 * Returns the value of the '<em><b>Product Feature Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Feature Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature Id</em>' reference.
	 * @see #setProductFeatureId(ProductFeature)
	 * @see org.abchip.mimo.biz.order.requirement.RequirementPackage#getDesiredFeature_ProductFeatureId()
	 * @model keys="productFeatureId"
	 * @generated
	 */
	ProductFeature getProductFeatureId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.requirement.DesiredFeature#getProductFeatureId <em>Product Feature Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature Id</em>' reference.
	 * @see #getProductFeatureId()
	 * @generated
	 */
	void setProductFeatureId(ProductFeature value);

	/**
	 * Returns the value of the '<em><b>Requirement Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Id</em>' reference.
	 * @see #setRequirementId(Requirement)
	 * @see org.abchip.mimo.biz.order.requirement.RequirementPackage#getDesiredFeature_RequirementId()
	 * @model keys="requirementId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Requirement getRequirementId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.requirement.DesiredFeature#getRequirementId <em>Requirement Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Id</em>' reference.
	 * @see #getRequirementId()
	 * @generated
	 */
	void setRequirementId(Requirement value);

} // DesiredFeature
