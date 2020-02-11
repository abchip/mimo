/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.requirement.impl;

import org.abchip.mimo.biz.order.requirement.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementFactoryImpl extends EFactoryImpl implements RequirementFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RequirementFactory init() {
		try {
			RequirementFactory theRequirementFactory = (RequirementFactory)EPackage.Registry.INSTANCE.getEFactory(RequirementPackage.eNS_URI);
			if (theRequirementFactory != null) {
				return theRequirementFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RequirementFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RequirementPackage.DESIRED_FEATURE: return (EObject)createDesiredFeature();
			case RequirementPackage.ORDER_REQUIREMENT_COMMITMENT: return (EObject)createOrderRequirementCommitment();
			case RequirementPackage.REQUIREMENT: return (EObject)createRequirement();
			case RequirementPackage.REQUIREMENT_ATTRIBUTE: return (EObject)createRequirementAttribute();
			case RequirementPackage.REQUIREMENT_BUDGET_ALLOCATION: return (EObject)createRequirementBudgetAllocation();
			case RequirementPackage.REQUIREMENT_CUST_REQUEST: return (EObject)createRequirementCustRequest();
			case RequirementPackage.REQUIREMENT_ROLE: return (EObject)createRequirementRole();
			case RequirementPackage.REQUIREMENT_STATUS: return (EObject)createRequirementStatus();
			case RequirementPackage.REQUIREMENT_TYPE: return (EObject)createRequirementType();
			case RequirementPackage.REQUIREMENT_TYPE_ATTR: return (EObject)createRequirementTypeAttr();
			case RequirementPackage.WORK_REQ_FULF_TYPE: return (EObject)createWorkReqFulfType();
			case RequirementPackage.WORK_REQUIREMENT_FULFILLMENT: return (EObject)createWorkRequirementFulfillment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DesiredFeature createDesiredFeature() {
		DesiredFeatureImpl desiredFeature = new DesiredFeatureImpl();
		return desiredFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderRequirementCommitment createOrderRequirementCommitment() {
		OrderRequirementCommitmentImpl orderRequirementCommitment = new OrderRequirementCommitmentImpl();
		return orderRequirementCommitment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementAttribute createRequirementAttribute() {
		RequirementAttributeImpl requirementAttribute = new RequirementAttributeImpl();
		return requirementAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementBudgetAllocation createRequirementBudgetAllocation() {
		RequirementBudgetAllocationImpl requirementBudgetAllocation = new RequirementBudgetAllocationImpl();
		return requirementBudgetAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementCustRequest createRequirementCustRequest() {
		RequirementCustRequestImpl requirementCustRequest = new RequirementCustRequestImpl();
		return requirementCustRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementRole createRequirementRole() {
		RequirementRoleImpl requirementRole = new RequirementRoleImpl();
		return requirementRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementStatus createRequirementStatus() {
		RequirementStatusImpl requirementStatus = new RequirementStatusImpl();
		return requirementStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementType createRequirementType() {
		RequirementTypeImpl requirementType = new RequirementTypeImpl();
		return requirementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementTypeAttr createRequirementTypeAttr() {
		RequirementTypeAttrImpl requirementTypeAttr = new RequirementTypeAttrImpl();
		return requirementTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkReqFulfType createWorkReqFulfType() {
		WorkReqFulfTypeImpl workReqFulfType = new WorkReqFulfTypeImpl();
		return workReqFulfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkRequirementFulfillment createWorkRequirementFulfillment() {
		WorkRequirementFulfillmentImpl workRequirementFulfillment = new WorkRequirementFulfillmentImpl();
		return workRequirementFulfillment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementPackage getRequirementPackage() {
		return (RequirementPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RequirementPackage getPackage() {
		return RequirementPackage.eINSTANCE;
	}

} //RequirementFactoryImpl
