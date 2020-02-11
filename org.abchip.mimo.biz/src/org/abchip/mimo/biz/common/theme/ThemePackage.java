/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.theme;

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
 * @see org.abchip.mimo.biz.common.theme.ThemeFactory
 * @model kind="package"
 * @generated
 */
public interface ThemePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "theme";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/common/theme";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-theme";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ThemePackage eINSTANCE = org.abchip.mimo.biz.common.theme.impl.ThemePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.theme.impl.VisualThemeImpl <em>Visual Theme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.theme.impl.VisualThemeImpl
	 * @see org.abchip.mimo.biz.common.theme.impl.ThemePackageImpl#getVisualTheme()
	 * @generated
	 */
	int VISUAL_THEME = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_THEME__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_THEME__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_THEME__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_THEME__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Visual Theme Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_THEME__VISUAL_THEME_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_THEME__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Visual Theme Set Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_THEME__VISUAL_THEME_SET_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Visual Theme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_THEME_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.theme.impl.VisualThemeResourceImpl <em>Visual Theme Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.theme.impl.VisualThemeResourceImpl
	 * @see org.abchip.mimo.biz.common.theme.impl.ThemePackageImpl#getVisualThemeResource()
	 * @generated
	 */
	int VISUAL_THEME_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_THEME_RESOURCE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_THEME_RESOURCE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_THEME_RESOURCE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_THEME_RESOURCE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Visual Theme Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_THEME_RESOURCE__VISUAL_THEME_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Type Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_THEME_RESOURCE__RESOURCE_TYPE_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sequence Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_THEME_RESOURCE__SEQUENCE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resource Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_THEME_RESOURCE__RESOURCE_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Visual Theme Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_THEME_RESOURCE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.theme.impl.VisualThemeSetImpl <em>Visual Theme Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.theme.impl.VisualThemeSetImpl
	 * @see org.abchip.mimo.biz.common.theme.impl.ThemePackageImpl#getVisualThemeSet()
	 * @generated
	 */
	int VISUAL_THEME_SET = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_THEME_SET__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_THEME_SET__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_THEME_SET__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_THEME_SET__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Visual Theme Set Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_THEME_SET__VISUAL_THEME_SET_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_THEME_SET__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Visual Theme Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_THEME_SET_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.theme.VisualTheme <em>Visual Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visual Theme</em>'.
	 * @see org.abchip.mimo.biz.common.theme.VisualTheme
	 * @generated
	 */
	EClass getVisualTheme();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.theme.VisualTheme#getVisualThemeId <em>Visual Theme Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visual Theme Id</em>'.
	 * @see org.abchip.mimo.biz.common.theme.VisualTheme#getVisualThemeId()
	 * @see #getVisualTheme()
	 * @generated
	 */
	EAttribute getVisualTheme_VisualThemeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.theme.VisualTheme#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.common.theme.VisualTheme#getDescription()
	 * @see #getVisualTheme()
	 * @generated
	 */
	EAttribute getVisualTheme_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.theme.VisualTheme#getVisualThemeSetId <em>Visual Theme Set Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Visual Theme Set Id</em>'.
	 * @see org.abchip.mimo.biz.common.theme.VisualTheme#getVisualThemeSetId()
	 * @see #getVisualTheme()
	 * @generated
	 */
	EReference getVisualTheme_VisualThemeSetId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.theme.VisualThemeResource <em>Visual Theme Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visual Theme Resource</em>'.
	 * @see org.abchip.mimo.biz.common.theme.VisualThemeResource
	 * @generated
	 */
	EClass getVisualThemeResource();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.theme.VisualThemeResource#getVisualThemeId <em>Visual Theme Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Visual Theme Id</em>'.
	 * @see org.abchip.mimo.biz.common.theme.VisualThemeResource#getVisualThemeId()
	 * @see #getVisualThemeResource()
	 * @generated
	 */
	EReference getVisualThemeResource_VisualThemeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.theme.VisualThemeResource#getResourceTypeEnumId <em>Resource Type Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Type Enum Id</em>'.
	 * @see org.abchip.mimo.biz.common.theme.VisualThemeResource#getResourceTypeEnumId()
	 * @see #getVisualThemeResource()
	 * @generated
	 */
	EReference getVisualThemeResource_ResourceTypeEnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.theme.VisualThemeResource#getSequenceId <em>Sequence Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Id</em>'.
	 * @see org.abchip.mimo.biz.common.theme.VisualThemeResource#getSequenceId()
	 * @see #getVisualThemeResource()
	 * @generated
	 */
	EAttribute getVisualThemeResource_SequenceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.theme.VisualThemeResource#getResourceValue <em>Resource Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Value</em>'.
	 * @see org.abchip.mimo.biz.common.theme.VisualThemeResource#getResourceValue()
	 * @see #getVisualThemeResource()
	 * @generated
	 */
	EAttribute getVisualThemeResource_ResourceValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.theme.VisualThemeSet <em>Visual Theme Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visual Theme Set</em>'.
	 * @see org.abchip.mimo.biz.common.theme.VisualThemeSet
	 * @generated
	 */
	EClass getVisualThemeSet();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.theme.VisualThemeSet#getVisualThemeSetId <em>Visual Theme Set Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visual Theme Set Id</em>'.
	 * @see org.abchip.mimo.biz.common.theme.VisualThemeSet#getVisualThemeSetId()
	 * @see #getVisualThemeSet()
	 * @generated
	 */
	EAttribute getVisualThemeSet_VisualThemeSetId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.theme.VisualThemeSet#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.common.theme.VisualThemeSet#getDescription()
	 * @see #getVisualThemeSet()
	 * @generated
	 */
	EAttribute getVisualThemeSet_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ThemeFactory getThemeFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.theme.impl.VisualThemeImpl <em>Visual Theme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.theme.impl.VisualThemeImpl
		 * @see org.abchip.mimo.biz.common.theme.impl.ThemePackageImpl#getVisualTheme()
		 * @generated
		 */
		EClass VISUAL_THEME = eINSTANCE.getVisualTheme();

		/**
		 * The meta object literal for the '<em><b>Visual Theme Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUAL_THEME__VISUAL_THEME_ID = eINSTANCE.getVisualTheme_VisualThemeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUAL_THEME__DESCRIPTION = eINSTANCE.getVisualTheme_Description();

		/**
		 * The meta object literal for the '<em><b>Visual Theme Set Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUAL_THEME__VISUAL_THEME_SET_ID = eINSTANCE.getVisualTheme_VisualThemeSetId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.theme.impl.VisualThemeResourceImpl <em>Visual Theme Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.theme.impl.VisualThemeResourceImpl
		 * @see org.abchip.mimo.biz.common.theme.impl.ThemePackageImpl#getVisualThemeResource()
		 * @generated
		 */
		EClass VISUAL_THEME_RESOURCE = eINSTANCE.getVisualThemeResource();

		/**
		 * The meta object literal for the '<em><b>Visual Theme Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUAL_THEME_RESOURCE__VISUAL_THEME_ID = eINSTANCE.getVisualThemeResource_VisualThemeId();

		/**
		 * The meta object literal for the '<em><b>Resource Type Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUAL_THEME_RESOURCE__RESOURCE_TYPE_ENUM_ID = eINSTANCE.getVisualThemeResource_ResourceTypeEnumId();

		/**
		 * The meta object literal for the '<em><b>Sequence Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUAL_THEME_RESOURCE__SEQUENCE_ID = eINSTANCE.getVisualThemeResource_SequenceId();

		/**
		 * The meta object literal for the '<em><b>Resource Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUAL_THEME_RESOURCE__RESOURCE_VALUE = eINSTANCE.getVisualThemeResource_ResourceValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.theme.impl.VisualThemeSetImpl <em>Visual Theme Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.theme.impl.VisualThemeSetImpl
		 * @see org.abchip.mimo.biz.common.theme.impl.ThemePackageImpl#getVisualThemeSet()
		 * @generated
		 */
		EClass VISUAL_THEME_SET = eINSTANCE.getVisualThemeSet();

		/**
		 * The meta object literal for the '<em><b>Visual Theme Set Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUAL_THEME_SET__VISUAL_THEME_SET_ID = eINSTANCE.getVisualThemeSet_VisualThemeSetId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUAL_THEME_SET__DESCRIPTION = eINSTANCE.getVisualThemeSet_Description();

	}

} //ThemePackage
