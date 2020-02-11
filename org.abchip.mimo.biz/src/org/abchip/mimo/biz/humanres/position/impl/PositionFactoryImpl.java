/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.position.impl;

import org.abchip.mimo.biz.humanres.position.*;
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
public class PositionFactoryImpl extends EFactoryImpl implements PositionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PositionFactory init() {
		try {
			PositionFactory thePositionFactory = (PositionFactory)EPackage.Registry.INSTANCE.getEFactory(PositionPackage.eNS_URI);
			if (thePositionFactory != null) {
				return thePositionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PositionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionFactoryImpl() {
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
			case PositionPackage.EMPL_POSITION: return (EObject)createEmplPosition();
			case PositionPackage.EMPL_POSITION_CLASS_TYPE: return (EObject)createEmplPositionClassType();
			case PositionPackage.EMPL_POSITION_FULFILLMENT: return (EObject)createEmplPositionFulfillment();
			case PositionPackage.EMPL_POSITION_REPORTING_STRUCT: return (EObject)createEmplPositionReportingStruct();
			case PositionPackage.EMPL_POSITION_RESPONSIBILITY: return (EObject)createEmplPositionResponsibility();
			case PositionPackage.EMPL_POSITION_TYPE: return (EObject)createEmplPositionType();
			case PositionPackage.EMPL_POSITION_TYPE_CLASS: return (EObject)createEmplPositionTypeClass();
			case PositionPackage.EMPL_POSITION_TYPE_RATE: return (EObject)createEmplPositionTypeRate();
			case PositionPackage.VALID_RESPONSIBILITY: return (EObject)createValidResponsibility();
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
	public EmplPosition createEmplPosition() {
		EmplPositionImpl emplPosition = new EmplPositionImpl();
		return emplPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmplPositionClassType createEmplPositionClassType() {
		EmplPositionClassTypeImpl emplPositionClassType = new EmplPositionClassTypeImpl();
		return emplPositionClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmplPositionFulfillment createEmplPositionFulfillment() {
		EmplPositionFulfillmentImpl emplPositionFulfillment = new EmplPositionFulfillmentImpl();
		return emplPositionFulfillment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmplPositionReportingStruct createEmplPositionReportingStruct() {
		EmplPositionReportingStructImpl emplPositionReportingStruct = new EmplPositionReportingStructImpl();
		return emplPositionReportingStruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmplPositionResponsibility createEmplPositionResponsibility() {
		EmplPositionResponsibilityImpl emplPositionResponsibility = new EmplPositionResponsibilityImpl();
		return emplPositionResponsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmplPositionType createEmplPositionType() {
		EmplPositionTypeImpl emplPositionType = new EmplPositionTypeImpl();
		return emplPositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmplPositionTypeClass createEmplPositionTypeClass() {
		EmplPositionTypeClassImpl emplPositionTypeClass = new EmplPositionTypeClassImpl();
		return emplPositionTypeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmplPositionTypeRate createEmplPositionTypeRate() {
		EmplPositionTypeRateImpl emplPositionTypeRate = new EmplPositionTypeRateImpl();
		return emplPositionTypeRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidResponsibility createValidResponsibility() {
		ValidResponsibilityImpl validResponsibility = new ValidResponsibilityImpl();
		return validResponsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositionPackage getPositionPackage() {
		return (PositionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PositionPackage getPackage() {
		return PositionPackage.eINSTANCE;
	}

} //PositionFactoryImpl
