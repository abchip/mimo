/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.screen;

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
 * @see org.abchip.mimo.biz.common.screen.ScreenFactory
 * @model kind="package"
 * @generated
 */
public interface ScreenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "screen";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/common/screen";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-screen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScreenPackage eINSTANCE = org.abchip.mimo.biz.common.screen.impl.ScreenPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.screen.impl.CustomScreenImpl <em>Custom Screen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.screen.impl.CustomScreenImpl
	 * @see org.abchip.mimo.biz.common.screen.impl.ScreenPackageImpl#getCustomScreen()
	 * @generated
	 */
	int CUSTOM_SCREEN = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SCREEN__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SCREEN__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SCREEN__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SCREEN__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Custom Screen Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SCREEN__CUSTOM_SCREEN_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Custom Screen Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SCREEN__CUSTOM_SCREEN_LOCATION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Custom Screen Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SCREEN__CUSTOM_SCREEN_NAME = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Custom Screen Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SCREEN__CUSTOM_SCREEN_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SCREEN__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Custom Screen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SCREEN_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.screen.impl.CustomScreenTypeImpl <em>Custom Screen Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.screen.impl.CustomScreenTypeImpl
	 * @see org.abchip.mimo.biz.common.screen.impl.ScreenPackageImpl#getCustomScreenType()
	 * @generated
	 */
	int CUSTOM_SCREEN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SCREEN_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SCREEN_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SCREEN_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SCREEN_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SCREEN_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Custom Screen Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SCREEN_TYPE__CUSTOM_SCREEN_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SCREEN_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SCREEN_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SCREEN_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Custom Screen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_SCREEN_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.screen.CustomScreen <em>Custom Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Screen</em>'.
	 * @see org.abchip.mimo.biz.common.screen.CustomScreen
	 * @generated
	 */
	EClass getCustomScreen();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.screen.CustomScreen#getCustomScreenId <em>Custom Screen Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Screen Id</em>'.
	 * @see org.abchip.mimo.biz.common.screen.CustomScreen#getCustomScreenId()
	 * @see #getCustomScreen()
	 * @generated
	 */
	EAttribute getCustomScreen_CustomScreenId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.screen.CustomScreen#getCustomScreenLocation <em>Custom Screen Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Screen Location</em>'.
	 * @see org.abchip.mimo.biz.common.screen.CustomScreen#getCustomScreenLocation()
	 * @see #getCustomScreen()
	 * @generated
	 */
	EAttribute getCustomScreen_CustomScreenLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.screen.CustomScreen#getCustomScreenName <em>Custom Screen Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Screen Name</em>'.
	 * @see org.abchip.mimo.biz.common.screen.CustomScreen#getCustomScreenName()
	 * @see #getCustomScreen()
	 * @generated
	 */
	EAttribute getCustomScreen_CustomScreenName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.screen.CustomScreen#getCustomScreenTypeId <em>Custom Screen Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Custom Screen Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.screen.CustomScreen#getCustomScreenTypeId()
	 * @see #getCustomScreen()
	 * @generated
	 */
	EReference getCustomScreen_CustomScreenTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.screen.CustomScreen#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.common.screen.CustomScreen#getDescription()
	 * @see #getCustomScreen()
	 * @generated
	 */
	EAttribute getCustomScreen_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.screen.CustomScreenType <em>Custom Screen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Screen Type</em>'.
	 * @see org.abchip.mimo.biz.common.screen.CustomScreenType
	 * @generated
	 */
	EClass getCustomScreenType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.screen.CustomScreenType#getCustomScreenTypeId <em>Custom Screen Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Screen Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.screen.CustomScreenType#getCustomScreenTypeId()
	 * @see #getCustomScreenType()
	 * @generated
	 */
	EAttribute getCustomScreenType_CustomScreenTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.screen.CustomScreenType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.common.screen.CustomScreenType#getDescription()
	 * @see #getCustomScreenType()
	 * @generated
	 */
	EAttribute getCustomScreenType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.screen.CustomScreenType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.common.screen.CustomScreenType#isHasTable()
	 * @see #getCustomScreenType()
	 * @generated
	 */
	EAttribute getCustomScreenType_HasTable();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.screen.CustomScreenType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.screen.CustomScreenType#getParentTypeId()
	 * @see #getCustomScreenType()
	 * @generated
	 */
	EAttribute getCustomScreenType_ParentTypeId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScreenFactory getScreenFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.screen.impl.CustomScreenImpl <em>Custom Screen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.screen.impl.CustomScreenImpl
		 * @see org.abchip.mimo.biz.common.screen.impl.ScreenPackageImpl#getCustomScreen()
		 * @generated
		 */
		EClass CUSTOM_SCREEN = eINSTANCE.getCustomScreen();

		/**
		 * The meta object literal for the '<em><b>Custom Screen Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_SCREEN__CUSTOM_SCREEN_ID = eINSTANCE.getCustomScreen_CustomScreenId();

		/**
		 * The meta object literal for the '<em><b>Custom Screen Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_SCREEN__CUSTOM_SCREEN_LOCATION = eINSTANCE.getCustomScreen_CustomScreenLocation();

		/**
		 * The meta object literal for the '<em><b>Custom Screen Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_SCREEN__CUSTOM_SCREEN_NAME = eINSTANCE.getCustomScreen_CustomScreenName();

		/**
		 * The meta object literal for the '<em><b>Custom Screen Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_SCREEN__CUSTOM_SCREEN_TYPE_ID = eINSTANCE.getCustomScreen_CustomScreenTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_SCREEN__DESCRIPTION = eINSTANCE.getCustomScreen_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.screen.impl.CustomScreenTypeImpl <em>Custom Screen Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.screen.impl.CustomScreenTypeImpl
		 * @see org.abchip.mimo.biz.common.screen.impl.ScreenPackageImpl#getCustomScreenType()
		 * @generated
		 */
		EClass CUSTOM_SCREEN_TYPE = eINSTANCE.getCustomScreenType();

		/**
		 * The meta object literal for the '<em><b>Custom Screen Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_SCREEN_TYPE__CUSTOM_SCREEN_TYPE_ID = eINSTANCE.getCustomScreenType_CustomScreenTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_SCREEN_TYPE__DESCRIPTION = eINSTANCE.getCustomScreenType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_SCREEN_TYPE__HAS_TABLE = eINSTANCE.getCustomScreenType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_SCREEN_TYPE__PARENT_TYPE_ID = eINSTANCE.getCustomScreenType_ParentTypeId();

	}

} //ScreenPackage
