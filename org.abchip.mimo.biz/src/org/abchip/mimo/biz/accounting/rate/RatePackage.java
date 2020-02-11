/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.rate;

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
 * @see org.abchip.mimo.biz.accounting.rate.RateFactory
 * @model kind="package"
 * @generated
 */
public interface RatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rate";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/accounting/rate";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-rate";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RatePackage eINSTANCE = org.abchip.mimo.biz.accounting.rate.impl.RatePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.rate.impl.PartyRateImpl <em>Party Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.rate.impl.PartyRateImpl
	 * @see org.abchip.mimo.biz.accounting.rate.impl.RatePackageImpl#getPartyRate()
	 * @generated
	 */
	int PARTY_RATE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RATE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RATE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RATE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RATE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RATE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rate Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RATE__RATE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RATE__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RATE__DEFAULT_RATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Percentage Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RATE__PERCENTAGE_USED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RATE__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Party Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RATE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.rate.impl.RateAmountImpl <em>Amount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.rate.impl.RateAmountImpl
	 * @see org.abchip.mimo.biz.accounting.rate.impl.RatePackageImpl#getRateAmount()
	 * @generated
	 */
	int RATE_AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_AMOUNT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_AMOUNT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_AMOUNT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_AMOUNT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Rate Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_AMOUNT__RATE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rate Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_AMOUNT__RATE_CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_AMOUNT__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_AMOUNT__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Empl Position Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_AMOUNT__EMPL_POSITION_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Period Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_AMOUNT__PERIOD_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_AMOUNT__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rate Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_AMOUNT__RATE_AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_AMOUNT__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Amount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_AMOUNT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.rate.impl.RateTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.rate.impl.RateTypeImpl
	 * @see org.abchip.mimo.biz.accounting.rate.impl.RatePackageImpl#getRateType()
	 * @generated
	 */
	int RATE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Rate Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_TYPE__RATE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.rate.PartyRate <em>Party Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party Rate</em>'.
	 * @see org.abchip.mimo.biz.accounting.rate.PartyRate
	 * @generated
	 */
	EClass getPartyRate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.rate.PartyRate#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.rate.PartyRate#getPartyId()
	 * @see #getPartyRate()
	 * @generated
	 */
	EReference getPartyRate_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.rate.PartyRate#getRateTypeId <em>Rate Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rate Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.rate.PartyRate#getRateTypeId()
	 * @see #getPartyRate()
	 * @generated
	 */
	EReference getPartyRate_RateTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.rate.PartyRate#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.rate.PartyRate#getFromDate()
	 * @see #getPartyRate()
	 * @generated
	 */
	EAttribute getPartyRate_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.rate.PartyRate#isDefaultRate <em>Default Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Rate</em>'.
	 * @see org.abchip.mimo.biz.accounting.rate.PartyRate#isDefaultRate()
	 * @see #getPartyRate()
	 * @generated
	 */
	EAttribute getPartyRate_DefaultRate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.rate.PartyRate#getPercentageUsed <em>Percentage Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Used</em>'.
	 * @see org.abchip.mimo.biz.accounting.rate.PartyRate#getPercentageUsed()
	 * @see #getPartyRate()
	 * @generated
	 */
	EAttribute getPartyRate_PercentageUsed();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.rate.PartyRate#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.rate.PartyRate#getThruDate()
	 * @see #getPartyRate()
	 * @generated
	 */
	EAttribute getPartyRate_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.rate.RateAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.accounting.rate.RateAmount
	 * @generated
	 */
	EClass getRateAmount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getRateTypeId <em>Rate Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rate Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.rate.RateAmount#getRateTypeId()
	 * @see #getRateAmount()
	 * @generated
	 */
	EReference getRateAmount_RateTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getRateCurrencyUomId <em>Rate Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rate Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.rate.RateAmount#getRateCurrencyUomId()
	 * @see #getRateAmount()
	 * @generated
	 */
	EReference getRateAmount_RateCurrencyUomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getPeriodTypeId <em>Period Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Period Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.rate.RateAmount#getPeriodTypeId()
	 * @see #getRateAmount()
	 * @generated
	 */
	EReference getRateAmount_PeriodTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.rate.RateAmount#getPartyId()
	 * @see #getRateAmount()
	 * @generated
	 */
	EReference getRateAmount_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.rate.RateAmount#getWorkEffortId()
	 * @see #getRateAmount()
	 * @generated
	 */
	EReference getRateAmount_WorkEffortId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getEmplPositionTypeId <em>Empl Position Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Empl Position Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.rate.RateAmount#getEmplPositionTypeId()
	 * @see #getRateAmount()
	 * @generated
	 */
	EReference getRateAmount_EmplPositionTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.rate.RateAmount#getFromDate()
	 * @see #getRateAmount()
	 * @generated
	 */
	EAttribute getRateAmount_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getRateAmount <em>Rate Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate Amount</em>'.
	 * @see org.abchip.mimo.biz.accounting.rate.RateAmount#getRateAmount()
	 * @see #getRateAmount()
	 * @generated
	 */
	EAttribute getRateAmount_RateAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.rate.RateAmount#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.rate.RateAmount#getThruDate()
	 * @see #getRateAmount()
	 * @generated
	 */
	EAttribute getRateAmount_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.rate.RateType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.rate.RateType
	 * @generated
	 */
	EClass getRateType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.rate.RateType#getRateTypeId <em>Rate Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.rate.RateType#getRateTypeId()
	 * @see #getRateType()
	 * @generated
	 */
	EAttribute getRateType_RateTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.rate.RateType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.rate.RateType#getDescription()
	 * @see #getRateType()
	 * @generated
	 */
	EAttribute getRateType_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RateFactory getRateFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.rate.impl.PartyRateImpl <em>Party Rate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.rate.impl.PartyRateImpl
		 * @see org.abchip.mimo.biz.accounting.rate.impl.RatePackageImpl#getPartyRate()
		 * @generated
		 */
		EClass PARTY_RATE = eINSTANCE.getPartyRate();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_RATE__PARTY_ID = eINSTANCE.getPartyRate_PartyId();

		/**
		 * The meta object literal for the '<em><b>Rate Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_RATE__RATE_TYPE_ID = eINSTANCE.getPartyRate_RateTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_RATE__FROM_DATE = eINSTANCE.getPartyRate_FromDate();

		/**
		 * The meta object literal for the '<em><b>Default Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_RATE__DEFAULT_RATE = eINSTANCE.getPartyRate_DefaultRate();

		/**
		 * The meta object literal for the '<em><b>Percentage Used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_RATE__PERCENTAGE_USED = eINSTANCE.getPartyRate_PercentageUsed();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_RATE__THRU_DATE = eINSTANCE.getPartyRate_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.rate.impl.RateAmountImpl <em>Amount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.rate.impl.RateAmountImpl
		 * @see org.abchip.mimo.biz.accounting.rate.impl.RatePackageImpl#getRateAmount()
		 * @generated
		 */
		EClass RATE_AMOUNT = eINSTANCE.getRateAmount();

		/**
		 * The meta object literal for the '<em><b>Rate Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATE_AMOUNT__RATE_TYPE_ID = eINSTANCE.getRateAmount_RateTypeId();

		/**
		 * The meta object literal for the '<em><b>Rate Currency Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATE_AMOUNT__RATE_CURRENCY_UOM_ID = eINSTANCE.getRateAmount_RateCurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Period Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATE_AMOUNT__PERIOD_TYPE_ID = eINSTANCE.getRateAmount_PeriodTypeId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATE_AMOUNT__PARTY_ID = eINSTANCE.getRateAmount_PartyId();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATE_AMOUNT__WORK_EFFORT_ID = eINSTANCE.getRateAmount_WorkEffortId();

		/**
		 * The meta object literal for the '<em><b>Empl Position Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATE_AMOUNT__EMPL_POSITION_TYPE_ID = eINSTANCE.getRateAmount_EmplPositionTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATE_AMOUNT__FROM_DATE = eINSTANCE.getRateAmount_FromDate();

		/**
		 * The meta object literal for the '<em><b>Rate Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATE_AMOUNT__RATE_AMOUNT = eINSTANCE.getRateAmount_RateAmount();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATE_AMOUNT__THRU_DATE = eINSTANCE.getRateAmount_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.rate.impl.RateTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.rate.impl.RateTypeImpl
		 * @see org.abchip.mimo.biz.accounting.rate.impl.RatePackageImpl#getRateType()
		 * @generated
		 */
		EClass RATE_TYPE = eINSTANCE.getRateType();

		/**
		 * The meta object literal for the '<em><b>Rate Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATE_TYPE__RATE_TYPE_ID = eINSTANCE.getRateType_RateTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATE_TYPE__DESCRIPTION = eINSTANCE.getRateType_Description();

	}

} //RatePackage
