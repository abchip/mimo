/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.requirement;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.order.requirement.RequirementPackage
 * @generated
 */
public interface RequirementFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequirementFactory eINSTANCE = org.abchip.mimo.biz.order.requirement.impl.RequirementFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Desired Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Desired Feature</em>'.
	 * @generated
	 */
	DesiredFeature createDesiredFeature();

	/**
	 * Returns a new object of class '<em>Order Requirement Commitment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order Requirement Commitment</em>'.
	 * @generated
	 */
	OrderRequirementCommitment createOrderRequirementCommitment();

	/**
	 * Returns a new object of class '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement</em>'.
	 * @generated
	 */
	Requirement createRequirement();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	RequirementAttribute createRequirementAttribute();

	/**
	 * Returns a new object of class '<em>Budget Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Budget Allocation</em>'.
	 * @generated
	 */
	RequirementBudgetAllocation createRequirementBudgetAllocation();

	/**
	 * Returns a new object of class '<em>Cust Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cust Request</em>'.
	 * @generated
	 */
	RequirementCustRequest createRequirementCustRequest();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	RequirementRole createRequirementRole();

	/**
	 * Returns a new object of class '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status</em>'.
	 * @generated
	 */
	RequirementStatus createRequirementStatus();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	RequirementType createRequirementType();

	/**
	 * Returns a new object of class '<em>Type Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Attr</em>'.
	 * @generated
	 */
	RequirementTypeAttr createRequirementTypeAttr();

	/**
	 * Returns a new object of class '<em>Work Req Fulf Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Req Fulf Type</em>'.
	 * @generated
	 */
	WorkReqFulfType createWorkReqFulfType();

	/**
	 * Returns a new object of class '<em>Work Requirement Fulfillment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Requirement Fulfillment</em>'.
	 * @generated
	 */
	WorkRequirementFulfillment createWorkRequirementFulfillment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RequirementPackage getRequirementPackage();

} //RequirementFactory
