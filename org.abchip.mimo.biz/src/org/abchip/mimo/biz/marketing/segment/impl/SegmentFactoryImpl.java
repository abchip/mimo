/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.segment.impl;

import org.abchip.mimo.biz.marketing.segment.*;
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
public class SegmentFactoryImpl extends EFactoryImpl implements SegmentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SegmentFactory init() {
		try {
			SegmentFactory theSegmentFactory = (SegmentFactory)EPackage.Registry.INSTANCE.getEFactory(SegmentPackage.eNS_URI);
			if (theSegmentFactory != null) {
				return theSegmentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SegmentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentFactoryImpl() {
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
			case SegmentPackage.SEGMENT_GROUP: return (EObject)createSegmentGroup();
			case SegmentPackage.SEGMENT_GROUP_CLASSIFICATION: return (EObject)createSegmentGroupClassification();
			case SegmentPackage.SEGMENT_GROUP_GEO: return (EObject)createSegmentGroupGeo();
			case SegmentPackage.SEGMENT_GROUP_ROLE: return (EObject)createSegmentGroupRole();
			case SegmentPackage.SEGMENT_GROUP_TYPE: return (EObject)createSegmentGroupType();
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
	public SegmentGroup createSegmentGroup() {
		SegmentGroupImpl segmentGroup = new SegmentGroupImpl();
		return segmentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SegmentGroupClassification createSegmentGroupClassification() {
		SegmentGroupClassificationImpl segmentGroupClassification = new SegmentGroupClassificationImpl();
		return segmentGroupClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SegmentGroupGeo createSegmentGroupGeo() {
		SegmentGroupGeoImpl segmentGroupGeo = new SegmentGroupGeoImpl();
		return segmentGroupGeo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SegmentGroupRole createSegmentGroupRole() {
		SegmentGroupRoleImpl segmentGroupRole = new SegmentGroupRoleImpl();
		return segmentGroupRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SegmentGroupType createSegmentGroupType() {
		SegmentGroupTypeImpl segmentGroupType = new SegmentGroupTypeImpl();
		return segmentGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SegmentPackage getSegmentPackage() {
		return (SegmentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SegmentPackage getPackage() {
		return SegmentPackage.eINSTANCE;
	}

} //SegmentFactoryImpl
