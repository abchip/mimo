/**
 * Copyright (c) 2017, 2021 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.toolbar;

import org.abchip.mimo.entity.EntityPackage;

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
 * @see org.abchip.mimo.ui.toolbar.ToolbarFactory
 * @model kind="package"
 * @generated
 */
public interface ToolbarPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "toolbar";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/ui/toolbar";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ui-toolbar";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToolbarPackage eINSTANCE = org.abchip.mimo.ui.toolbar.impl.ToolbarPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.toolbar.impl.ToolbarImpl <em>Toolbar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.toolbar.impl.ToolbarImpl
	 * @see org.abchip.mimo.ui.toolbar.impl.ToolbarPackageImpl#getToolbar()
	 * @generated
	 */
	int TOOLBAR = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR__ELEMENTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR__NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Toolbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.toolbar.impl.ToolbarViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.toolbar.impl.ToolbarViewImpl
	 * @see org.abchip.mimo.ui.toolbar.impl.ToolbarPackageImpl#getToolbarView()
	 * @generated
	 */
	int TOOLBAR_VIEW = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR_VIEW__ACTION = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR_VIEW__ICON = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR_VIEW__LABEL = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR_VIEW__VIEW = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLBAR_VIEW_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.toolbar.Toolbar <em>Toolbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toolbar</em>'.
	 * @see org.abchip.mimo.ui.toolbar.Toolbar
	 * @generated
	 */
	EClass getToolbar();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.ui.toolbar.Toolbar#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.abchip.mimo.ui.toolbar.Toolbar#getElements()
	 * @see #getToolbar()
	 * @generated
	 */
	EReference getToolbar_Elements();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.toolbar.Toolbar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.ui.toolbar.Toolbar#getName()
	 * @see #getToolbar()
	 * @generated
	 */
	EAttribute getToolbar_Name();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.toolbar.ToolbarView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see org.abchip.mimo.ui.toolbar.ToolbarView
	 * @generated
	 */
	EClass getToolbarView();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.toolbar.ToolbarView#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.abchip.mimo.ui.toolbar.ToolbarView#getAction()
	 * @see #getToolbarView()
	 * @generated
	 */
	EAttribute getToolbarView_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.toolbar.ToolbarView#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.abchip.mimo.ui.toolbar.ToolbarView#getIcon()
	 * @see #getToolbarView()
	 * @generated
	 */
	EAttribute getToolbarView_Icon();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.toolbar.ToolbarView#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.abchip.mimo.ui.toolbar.ToolbarView#getLabel()
	 * @see #getToolbarView()
	 * @generated
	 */
	EAttribute getToolbarView_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.toolbar.ToolbarView#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.toolbar.ToolbarView#getView()
	 * @see #getToolbarView()
	 * @generated
	 */
	EAttribute getToolbarView_View();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToolbarFactory getToolbarFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.ui.toolbar.impl.ToolbarImpl <em>Toolbar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.toolbar.impl.ToolbarImpl
		 * @see org.abchip.mimo.ui.toolbar.impl.ToolbarPackageImpl#getToolbar()
		 * @generated
		 */
		EClass TOOLBAR = eINSTANCE.getToolbar();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOLBAR__ELEMENTS = eINSTANCE.getToolbar_Elements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOLBAR__NAME = eINSTANCE.getToolbar_Name();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.toolbar.impl.ToolbarViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.toolbar.impl.ToolbarViewImpl
		 * @see org.abchip.mimo.ui.toolbar.impl.ToolbarPackageImpl#getToolbarView()
		 * @generated
		 */
		EClass TOOLBAR_VIEW = eINSTANCE.getToolbarView();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOLBAR_VIEW__ACTION = eINSTANCE.getToolbarView_Action();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOLBAR_VIEW__ICON = eINSTANCE.getToolbarView_Icon();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOLBAR_VIEW__LABEL = eINSTANCE.getToolbarView_Label();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOLBAR_VIEW__VIEW = eINSTANCE.getToolbarView_View();

	}

} //ToolbarPackage
