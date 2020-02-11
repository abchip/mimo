/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.cost.impl;

import org.abchip.mimo.biz.product.cost.*;
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
public class CostFactoryImpl extends EFactoryImpl implements CostFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CostFactory init() {
		try {
			CostFactory theCostFactory = (CostFactory)EPackage.Registry.INSTANCE.getEFactory(CostPackage.eNS_URI);
			if (theCostFactory != null) {
				return theCostFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CostFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CostFactoryImpl() {
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
			case CostPackage.COST_COMPONENT: return (EObject)createCostComponent();
			case CostPackage.COST_COMPONENT_ATTRIBUTE: return (EObject)createCostComponentAttribute();
			case CostPackage.COST_COMPONENT_CALC: return (EObject)createCostComponentCalc();
			case CostPackage.COST_COMPONENT_TYPE: return (EObject)createCostComponentType();
			case CostPackage.COST_COMPONENT_TYPE_ATTR: return (EObject)createCostComponentTypeAttr();
			case CostPackage.PRODUCT_COST_COMPONENT_CALC: return (EObject)createProductCostComponentCalc();
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
	public CostComponent createCostComponent() {
		CostComponentImpl costComponent = new CostComponentImpl();
		return costComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostComponentAttribute createCostComponentAttribute() {
		CostComponentAttributeImpl costComponentAttribute = new CostComponentAttributeImpl();
		return costComponentAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostComponentCalc createCostComponentCalc() {
		CostComponentCalcImpl costComponentCalc = new CostComponentCalcImpl();
		return costComponentCalc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostComponentType createCostComponentType() {
		CostComponentTypeImpl costComponentType = new CostComponentTypeImpl();
		return costComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostComponentTypeAttr createCostComponentTypeAttr() {
		CostComponentTypeAttrImpl costComponentTypeAttr = new CostComponentTypeAttrImpl();
		return costComponentTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCostComponentCalc createProductCostComponentCalc() {
		ProductCostComponentCalcImpl productCostComponentCalc = new ProductCostComponentCalcImpl();
		return productCostComponentCalc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostPackage getCostPackage() {
		return (CostPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CostPackage getPackage() {
		return CostPackage.eINSTANCE;
	}

} //CostFactoryImpl
