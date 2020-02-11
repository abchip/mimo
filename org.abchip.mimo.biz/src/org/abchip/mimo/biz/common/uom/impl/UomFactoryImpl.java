/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.uom.impl;

import org.abchip.mimo.biz.common.uom.*;
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
public class UomFactoryImpl extends EFactoryImpl implements UomFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UomFactory init() {
		try {
			UomFactory theUomFactory = (UomFactory)EPackage.Registry.INSTANCE.getEFactory(UomPackage.eNS_URI);
			if (theUomFactory != null) {
				return theUomFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UomFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UomFactoryImpl() {
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
			case UomPackage.UOM: return (EObject)createUom();
			case UomPackage.UOM_CONVERSION: return (EObject)createUomConversion();
			case UomPackage.UOM_CONVERSION_DATED: return (EObject)createUomConversionDated();
			case UomPackage.UOM_GROUP: return (EObject)createUomGroup();
			case UomPackage.UOM_TYPE: return (EObject)createUomType();
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
	public Uom createUom() {
		UomImpl uom = new UomImpl();
		return uom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UomConversion createUomConversion() {
		UomConversionImpl uomConversion = new UomConversionImpl();
		return uomConversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UomConversionDated createUomConversionDated() {
		UomConversionDatedImpl uomConversionDated = new UomConversionDatedImpl();
		return uomConversionDated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UomGroup createUomGroup() {
		UomGroupImpl uomGroup = new UomGroupImpl();
		return uomGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UomType createUomType() {
		UomTypeImpl uomType = new UomTypeImpl();
		return uomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UomPackage getUomPackage() {
		return (UomPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UomPackage getPackage() {
		return UomPackage.eINSTANCE;
	}

} //UomFactoryImpl
