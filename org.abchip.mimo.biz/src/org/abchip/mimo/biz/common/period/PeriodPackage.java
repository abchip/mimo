/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.period;

import org.abchip.mimo.biz.BizPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.common.period.PeriodFactory
 * @model kind="package"
 * @generated
 */
public interface PeriodPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "period";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/common/period";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-period";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PeriodPackage eINSTANCE = org.abchip.mimo.biz.common.period.impl.PeriodPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.period.impl.CustomTimePeriodImpl <em>Custom Time Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.period.impl.CustomTimePeriodImpl
	 * @see org.abchip.mimo.biz.common.period.impl.PeriodPackageImpl#getCustomTimePeriod()
	 * @generated
	 */
	int CUSTOM_TIME_PERIOD = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TIME_PERIOD__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TIME_PERIOD__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TIME_PERIOD__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TIME_PERIOD__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Custom Time Period Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TIME_PERIOD__CUSTOM_TIME_PERIOD_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TIME_PERIOD__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TIME_PERIOD__IS_CLOSED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Organization Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TIME_PERIOD__ORGANIZATION_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Period Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TIME_PERIOD__PARENT_PERIOD_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Period Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TIME_PERIOD__PERIOD_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Period Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TIME_PERIOD__PERIOD_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Period Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TIME_PERIOD__PERIOD_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TIME_PERIOD__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Custom Time Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TIME_PERIOD_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.period.impl.PeriodTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.period.impl.PeriodTypeImpl
	 * @see org.abchip.mimo.biz.common.period.impl.PeriodPackageImpl#getPeriodType()
	 * @generated
	 */
	int PERIOD_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Period Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_TYPE__PERIOD_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Period Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_TYPE__PERIOD_LENGTH = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_TYPE__UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.period.CustomTimePeriod <em>Custom Time Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Time Period</em>'.
	 * @see org.abchip.mimo.biz.common.period.CustomTimePeriod
	 * @generated
	 */
	EClass getCustomTimePeriod();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.period.CustomTimePeriod#getCustomTimePeriodId <em>Custom Time Period Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Time Period Id</em>'.
	 * @see org.abchip.mimo.biz.common.period.CustomTimePeriod#getCustomTimePeriodId()
	 * @see #getCustomTimePeriod()
	 * @generated
	 */
	EAttribute getCustomTimePeriod_CustomTimePeriodId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.period.CustomTimePeriod#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.common.period.CustomTimePeriod#getFromDate()
	 * @see #getCustomTimePeriod()
	 * @generated
	 */
	EAttribute getCustomTimePeriod_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.period.CustomTimePeriod#isIsClosed <em>Is Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Closed</em>'.
	 * @see org.abchip.mimo.biz.common.period.CustomTimePeriod#isIsClosed()
	 * @see #getCustomTimePeriod()
	 * @generated
	 */
	EAttribute getCustomTimePeriod_IsClosed();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.period.CustomTimePeriod#getOrganizationPartyId <em>Organization Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization Party Id</em>'.
	 * @see org.abchip.mimo.biz.common.period.CustomTimePeriod#getOrganizationPartyId()
	 * @see #getCustomTimePeriod()
	 * @generated
	 */
	EReference getCustomTimePeriod_OrganizationPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.period.CustomTimePeriod#getParentPeriodId <em>Parent Period Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Period Id</em>'.
	 * @see org.abchip.mimo.biz.common.period.CustomTimePeriod#getParentPeriodId()
	 * @see #getCustomTimePeriod()
	 * @generated
	 */
	EReference getCustomTimePeriod_ParentPeriodId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.period.CustomTimePeriod#getPeriodName <em>Period Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period Name</em>'.
	 * @see org.abchip.mimo.biz.common.period.CustomTimePeriod#getPeriodName()
	 * @see #getCustomTimePeriod()
	 * @generated
	 */
	EAttribute getCustomTimePeriod_PeriodName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.period.CustomTimePeriod#getPeriodNum <em>Period Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period Num</em>'.
	 * @see org.abchip.mimo.biz.common.period.CustomTimePeriod#getPeriodNum()
	 * @see #getCustomTimePeriod()
	 * @generated
	 */
	EAttribute getCustomTimePeriod_PeriodNum();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.period.CustomTimePeriod#getPeriodTypeId <em>Period Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Period Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.period.CustomTimePeriod#getPeriodTypeId()
	 * @see #getCustomTimePeriod()
	 * @generated
	 */
	EReference getCustomTimePeriod_PeriodTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.period.CustomTimePeriod#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.common.period.CustomTimePeriod#getThruDate()
	 * @see #getCustomTimePeriod()
	 * @generated
	 */
	EAttribute getCustomTimePeriod_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.period.PeriodType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.biz.common.period.PeriodType
	 * @generated
	 */
	EClass getPeriodType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.period.PeriodType#getPeriodTypeId <em>Period Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.period.PeriodType#getPeriodTypeId()
	 * @see #getPeriodType()
	 * @generated
	 */
	EAttribute getPeriodType_PeriodTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.period.PeriodType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.common.period.PeriodType#getDescription()
	 * @see #getPeriodType()
	 * @generated
	 */
	EAttribute getPeriodType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.period.PeriodType#getPeriodLength <em>Period Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period Length</em>'.
	 * @see org.abchip.mimo.biz.common.period.PeriodType#getPeriodLength()
	 * @see #getPeriodType()
	 * @generated
	 */
	EAttribute getPeriodType_PeriodLength();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.period.PeriodType#getUomId <em>Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom Id</em>'.
	 * @see org.abchip.mimo.biz.common.period.PeriodType#getUomId()
	 * @see #getPeriodType()
	 * @generated
	 */
	EReference getPeriodType_UomId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PeriodFactory getPeriodFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.period.impl.CustomTimePeriodImpl <em>Custom Time Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.period.impl.CustomTimePeriodImpl
		 * @see org.abchip.mimo.biz.common.period.impl.PeriodPackageImpl#getCustomTimePeriod()
		 * @generated
		 */
		EClass CUSTOM_TIME_PERIOD = eINSTANCE.getCustomTimePeriod();

		/**
		 * The meta object literal for the '<em><b>Custom Time Period Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_TIME_PERIOD__CUSTOM_TIME_PERIOD_ID = eINSTANCE.getCustomTimePeriod_CustomTimePeriodId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_TIME_PERIOD__FROM_DATE = eINSTANCE.getCustomTimePeriod_FromDate();

		/**
		 * The meta object literal for the '<em><b>Is Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_TIME_PERIOD__IS_CLOSED = eINSTANCE.getCustomTimePeriod_IsClosed();

		/**
		 * The meta object literal for the '<em><b>Organization Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_TIME_PERIOD__ORGANIZATION_PARTY_ID = eINSTANCE.getCustomTimePeriod_OrganizationPartyId();

		/**
		 * The meta object literal for the '<em><b>Parent Period Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_TIME_PERIOD__PARENT_PERIOD_ID = eINSTANCE.getCustomTimePeriod_ParentPeriodId();

		/**
		 * The meta object literal for the '<em><b>Period Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_TIME_PERIOD__PERIOD_NAME = eINSTANCE.getCustomTimePeriod_PeriodName();

		/**
		 * The meta object literal for the '<em><b>Period Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_TIME_PERIOD__PERIOD_NUM = eINSTANCE.getCustomTimePeriod_PeriodNum();

		/**
		 * The meta object literal for the '<em><b>Period Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_TIME_PERIOD__PERIOD_TYPE_ID = eINSTANCE.getCustomTimePeriod_PeriodTypeId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_TIME_PERIOD__THRU_DATE = eINSTANCE.getCustomTimePeriod_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.period.impl.PeriodTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.period.impl.PeriodTypeImpl
		 * @see org.abchip.mimo.biz.common.period.impl.PeriodPackageImpl#getPeriodType()
		 * @generated
		 */
		EClass PERIOD_TYPE = eINSTANCE.getPeriodType();

		/**
		 * The meta object literal for the '<em><b>Period Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIOD_TYPE__PERIOD_TYPE_ID = eINSTANCE.getPeriodType_PeriodTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIOD_TYPE__DESCRIPTION = eINSTANCE.getPeriodType_Description();

		/**
		 * The meta object literal for the '<em><b>Period Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIOD_TYPE__PERIOD_LENGTH = eINSTANCE.getPeriodType_PeriodLength();

		/**
		 * The meta object literal for the '<em><b>Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIOD_TYPE__UOM_ID = eINSTANCE.getPeriodType_UomId();

	}

} //PeriodPackage
