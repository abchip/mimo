/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.need;

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
 * @see org.abchip.mimo.biz.party.need.NeedFactory
 * @model kind="package"
 * @generated
 */
public interface NeedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "need";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/party/need";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-need";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NeedPackage eINSTANCE = org.abchip.mimo.biz.party.need.impl.NeedPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.need.impl.NeedTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.need.impl.NeedTypeImpl
	 * @see org.abchip.mimo.biz.party.need.impl.NeedPackageImpl#getNeedType()
	 * @generated
	 */
	int NEED_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Need Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED_TYPE__NEED_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEED_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.need.impl.PartyNeedImpl <em>Party Need</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.need.impl.PartyNeedImpl
	 * @see org.abchip.mimo.biz.party.need.impl.NeedPackageImpl#getPartyNeed()
	 * @generated
	 */
	int PARTY_NEED = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NEED__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NEED__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NEED__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NEED__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NEED__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NEED__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Party Need Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NEED__PARTY_NEED_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Communication Event Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NEED__COMMUNICATION_EVENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Datetime Recorded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NEED__DATETIME_RECORDED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NEED__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Need Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NEED__NEED_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Party Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NEED__PARTY_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Product Category Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NEED__PRODUCT_CATEGORY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NEED__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Visit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NEED__VISIT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Party Need</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NEED_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.need.NeedType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.biz.party.need.NeedType
	 * @generated
	 */
	EClass getNeedType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.need.NeedType#getNeedTypeId <em>Need Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Need Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.need.NeedType#getNeedTypeId()
	 * @see #getNeedType()
	 * @generated
	 */
	EAttribute getNeedType_NeedTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.need.NeedType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.party.need.NeedType#getDescription()
	 * @see #getNeedType()
	 * @generated
	 */
	EAttribute getNeedType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.need.PartyNeed <em>Party Need</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party Need</em>'.
	 * @see org.abchip.mimo.biz.party.need.PartyNeed
	 * @generated
	 */
	EClass getPartyNeed();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.need.PartyNeed#getPartyNeedId <em>Party Need Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Need Id</em>'.
	 * @see org.abchip.mimo.biz.party.need.PartyNeed#getPartyNeedId()
	 * @see #getPartyNeed()
	 * @generated
	 */
	EAttribute getPartyNeed_PartyNeedId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.need.PartyNeed#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.party.need.PartyNeed#getPartyId()
	 * @see #getPartyNeed()
	 * @generated
	 */
	EReference getPartyNeed_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.need.PartyNeed#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.need.PartyNeed#getRoleTypeId()
	 * @see #getPartyNeed()
	 * @generated
	 */
	EReference getPartyNeed_RoleTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.need.PartyNeed#getCommunicationEventId <em>Communication Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Event Id</em>'.
	 * @see org.abchip.mimo.biz.party.need.PartyNeed#getCommunicationEventId()
	 * @see #getPartyNeed()
	 * @generated
	 */
	EReference getPartyNeed_CommunicationEventId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.need.PartyNeed#getDatetimeRecorded <em>Datetime Recorded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datetime Recorded</em>'.
	 * @see org.abchip.mimo.biz.party.need.PartyNeed#getDatetimeRecorded()
	 * @see #getPartyNeed()
	 * @generated
	 */
	EAttribute getPartyNeed_DatetimeRecorded();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.need.PartyNeed#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.party.need.PartyNeed#getDescription()
	 * @see #getPartyNeed()
	 * @generated
	 */
	EAttribute getPartyNeed_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.need.PartyNeed#getNeedTypeId <em>Need Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Need Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.need.PartyNeed#getNeedTypeId()
	 * @see #getPartyNeed()
	 * @generated
	 */
	EReference getPartyNeed_NeedTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.need.PartyNeed#getPartyTypeId <em>Party Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.need.PartyNeed#getPartyTypeId()
	 * @see #getPartyNeed()
	 * @generated
	 */
	EReference getPartyNeed_PartyTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.need.PartyNeed#getProductCategoryId <em>Product Category Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Category Id</em>'.
	 * @see org.abchip.mimo.biz.party.need.PartyNeed#getProductCategoryId()
	 * @see #getPartyNeed()
	 * @generated
	 */
	EReference getPartyNeed_ProductCategoryId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.need.PartyNeed#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.party.need.PartyNeed#getProductId()
	 * @see #getPartyNeed()
	 * @generated
	 */
	EReference getPartyNeed_ProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.need.PartyNeed#getVisitId <em>Visit Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visit Id</em>'.
	 * @see org.abchip.mimo.biz.party.need.PartyNeed#getVisitId()
	 * @see #getPartyNeed()
	 * @generated
	 */
	EAttribute getPartyNeed_VisitId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NeedFactory getNeedFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.need.impl.NeedTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.need.impl.NeedTypeImpl
		 * @see org.abchip.mimo.biz.party.need.impl.NeedPackageImpl#getNeedType()
		 * @generated
		 */
		EClass NEED_TYPE = eINSTANCE.getNeedType();

		/**
		 * The meta object literal for the '<em><b>Need Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEED_TYPE__NEED_TYPE_ID = eINSTANCE.getNeedType_NeedTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEED_TYPE__DESCRIPTION = eINSTANCE.getNeedType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.need.impl.PartyNeedImpl <em>Party Need</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.need.impl.PartyNeedImpl
		 * @see org.abchip.mimo.biz.party.need.impl.NeedPackageImpl#getPartyNeed()
		 * @generated
		 */
		EClass PARTY_NEED = eINSTANCE.getPartyNeed();

		/**
		 * The meta object literal for the '<em><b>Party Need Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_NEED__PARTY_NEED_ID = eINSTANCE.getPartyNeed_PartyNeedId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_NEED__PARTY_ID = eINSTANCE.getPartyNeed_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_NEED__ROLE_TYPE_ID = eINSTANCE.getPartyNeed_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Communication Event Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_NEED__COMMUNICATION_EVENT_ID = eINSTANCE.getPartyNeed_CommunicationEventId();

		/**
		 * The meta object literal for the '<em><b>Datetime Recorded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_NEED__DATETIME_RECORDED = eINSTANCE.getPartyNeed_DatetimeRecorded();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_NEED__DESCRIPTION = eINSTANCE.getPartyNeed_Description();

		/**
		 * The meta object literal for the '<em><b>Need Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_NEED__NEED_TYPE_ID = eINSTANCE.getPartyNeed_NeedTypeId();

		/**
		 * The meta object literal for the '<em><b>Party Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_NEED__PARTY_TYPE_ID = eINSTANCE.getPartyNeed_PartyTypeId();

		/**
		 * The meta object literal for the '<em><b>Product Category Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_NEED__PRODUCT_CATEGORY_ID = eINSTANCE.getPartyNeed_ProductCategoryId();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_NEED__PRODUCT_ID = eINSTANCE.getPartyNeed_ProductId();

		/**
		 * The meta object literal for the '<em><b>Visit Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_NEED__VISIT_ID = eINSTANCE.getPartyNeed_VisitId();

	}

} //NeedPackage
