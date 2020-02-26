/**
 * Copyright (c) 2017, 2020 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.view;

import org.abchip.mimo.entity.EntityPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.abchip.mimo.ui.view.ViewFactory
 * @model kind="package"
 * @generated
 */
public interface ViewPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "view";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/ui/view";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ui-view";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewPackage eINSTANCE = org.abchip.mimo.ui.view.impl.ViewPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.view.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.view.impl.ViewImpl
	 * @see org.abchip.mimo.ui.view.impl.ViewPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__DISABLED = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.view.impl.ViewCardImpl <em>Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.view.impl.ViewCardImpl
	 * @see org.abchip.mimo.ui.view.impl.ViewPackageImpl#getViewCard()
	 * @generated
	 */
	int VIEW_CARD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CARD__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CARD__DISABLED = VIEW__DISABLED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CARD__TYPE = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CARD_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.view.impl.ViewDashboardImpl <em>Dashboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.view.impl.ViewDashboardImpl
	 * @see org.abchip.mimo.ui.view.impl.ViewPackageImpl#getViewDashboard()
	 * @generated
	 */
	int VIEW_DASHBOARD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DASHBOARD__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DASHBOARD__DISABLED = VIEW__DISABLED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DASHBOARD__TYPE = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dashboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DASHBOARD_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.view.impl.ViewEditorImpl <em>Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.view.impl.ViewEditorImpl
	 * @see org.abchip.mimo.ui.view.impl.ViewPackageImpl#getViewEditor()
	 * @generated
	 */
	int VIEW_EDITOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_EDITOR__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_EDITOR__DISABLED = VIEW__DISABLED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_EDITOR__TYPE = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_EDITOR_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.view.impl.ViewSearchImpl <em>Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.view.impl.ViewSearchImpl
	 * @see org.abchip.mimo.ui.view.impl.ViewPackageImpl#getViewSearch()
	 * @generated
	 */
	int VIEW_SEARCH = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_SEARCH__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_SEARCH__DISABLED = VIEW__DISABLED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_SEARCH__TYPE = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_SEARCH_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.view.impl.ViewImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.view.impl.ViewImportImpl
	 * @see org.abchip.mimo.ui.view.impl.ViewPackageImpl#getViewImport()
	 * @generated
	 */
	int VIEW_IMPORT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_IMPORT__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_IMPORT__DISABLED = VIEW__DISABLED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_IMPORT__TYPE = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_IMPORT_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.view.ViewType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.view.ViewType
	 * @see org.abchip.mimo.ui.view.impl.ViewPackageImpl#getViewType()
	 * @generated
	 */
	int VIEW_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.view.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see org.abchip.mimo.ui.view.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.view.View#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.ui.view.View#getName()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.view.View#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.abchip.mimo.ui.view.View#isDisabled()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Disabled();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.view.ViewCard <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card</em>'.
	 * @see org.abchip.mimo.ui.view.ViewCard
	 * @generated
	 */
	EClass getViewCard();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.view.ViewCard#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.abchip.mimo.ui.view.ViewCard#getType()
	 * @see #getViewCard()
	 * @generated
	 */
	EAttribute getViewCard_Type();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.view.ViewDashboard <em>Dashboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dashboard</em>'.
	 * @see org.abchip.mimo.ui.view.ViewDashboard
	 * @generated
	 */
	EClass getViewDashboard();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.view.ViewDashboard#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.abchip.mimo.ui.view.ViewDashboard#getType()
	 * @see #getViewDashboard()
	 * @generated
	 */
	EAttribute getViewDashboard_Type();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.view.ViewEditor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editor</em>'.
	 * @see org.abchip.mimo.ui.view.ViewEditor
	 * @generated
	 */
	EClass getViewEditor();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.view.ViewEditor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.abchip.mimo.ui.view.ViewEditor#getType()
	 * @see #getViewEditor()
	 * @generated
	 */
	EAttribute getViewEditor_Type();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.view.ViewSearch <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search</em>'.
	 * @see org.abchip.mimo.ui.view.ViewSearch
	 * @generated
	 */
	EClass getViewSearch();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.view.ViewSearch#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.abchip.mimo.ui.view.ViewSearch#getType()
	 * @see #getViewSearch()
	 * @generated
	 */
	EAttribute getViewSearch_Type();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.view.ViewImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.abchip.mimo.ui.view.ViewImport
	 * @generated
	 */
	EClass getViewImport();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.view.ViewImport#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.abchip.mimo.ui.view.ViewImport#getType()
	 * @see #getViewImport()
	 * @generated
	 */
	EAttribute getViewImport_Type();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.ui.view.ViewType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see org.abchip.mimo.ui.view.ViewType
	 * @generated
	 */
	EEnum getViewType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ViewFactory getViewFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.ui.view.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.view.impl.ViewImpl
		 * @see org.abchip.mimo.ui.view.impl.ViewPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__NAME = eINSTANCE.getView_Name();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__DISABLED = eINSTANCE.getView_Disabled();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.view.impl.ViewCardImpl <em>Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.view.impl.ViewCardImpl
		 * @see org.abchip.mimo.ui.view.impl.ViewPackageImpl#getViewCard()
		 * @generated
		 */
		EClass VIEW_CARD = eINSTANCE.getViewCard();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_CARD__TYPE = eINSTANCE.getViewCard_Type();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.view.impl.ViewDashboardImpl <em>Dashboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.view.impl.ViewDashboardImpl
		 * @see org.abchip.mimo.ui.view.impl.ViewPackageImpl#getViewDashboard()
		 * @generated
		 */
		EClass VIEW_DASHBOARD = eINSTANCE.getViewDashboard();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_DASHBOARD__TYPE = eINSTANCE.getViewDashboard_Type();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.view.impl.ViewEditorImpl <em>Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.view.impl.ViewEditorImpl
		 * @see org.abchip.mimo.ui.view.impl.ViewPackageImpl#getViewEditor()
		 * @generated
		 */
		EClass VIEW_EDITOR = eINSTANCE.getViewEditor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_EDITOR__TYPE = eINSTANCE.getViewEditor_Type();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.view.impl.ViewSearchImpl <em>Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.view.impl.ViewSearchImpl
		 * @see org.abchip.mimo.ui.view.impl.ViewPackageImpl#getViewSearch()
		 * @generated
		 */
		EClass VIEW_SEARCH = eINSTANCE.getViewSearch();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_SEARCH__TYPE = eINSTANCE.getViewSearch_Type();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.view.impl.ViewImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.view.impl.ViewImportImpl
		 * @see org.abchip.mimo.ui.view.impl.ViewPackageImpl#getViewImport()
		 * @generated
		 */
		EClass VIEW_IMPORT = eINSTANCE.getViewImport();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_IMPORT__TYPE = eINSTANCE.getViewImport_Type();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.view.ViewType <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.view.ViewType
		 * @see org.abchip.mimo.ui.view.impl.ViewPackageImpl#getViewType()
		 * @generated
		 */
		EEnum VIEW_TYPE = eINSTANCE.getViewType();

	}

} //ViewPackage
