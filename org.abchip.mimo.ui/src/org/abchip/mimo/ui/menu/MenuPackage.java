/**
 * Copyright (c) 2017, 2019 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.menu;

import org.abchip.mimo.entity.EntityPackage;

import org.abchip.mimo.ui.UIPackage;
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
 * @see org.abchip.mimo.ui.menu.MenuFactory
 * @model kind="package"
 * @generated
 */
public interface MenuPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "menu";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/ui/menu";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ui-menu";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MenuPackage eINSTANCE = org.abchip.mimo.ui.menu.impl.MenuPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.menu.impl.ContextMenuImpl <em>Context Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.menu.impl.ContextMenuImpl
	 * @see org.abchip.mimo.ui.menu.impl.MenuPackageImpl#getContextMenu()
	 * @generated
	 */
	int CONTEXT_MENU = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MENU__ELEMENTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MENU__ICON = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MENU__NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Context Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MENU_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.menu.impl.MenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.menu.impl.MenuImpl
	 * @see org.abchip.mimo.ui.menu.impl.MenuPackageImpl#getMenu()
	 * @generated
	 */
	int MENU = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ELEMENTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__ICON = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU__NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.menu.impl.MenuActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.menu.impl.MenuActionImpl
	 * @see org.abchip.mimo.ui.menu.impl.MenuPackageImpl#getMenuAction()
	 * @generated
	 */
	int MENU_ACTION = 2;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ACTION__ICON = UIPackage.DATA_NODE__ICON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ACTION__ID = UIPackage.DATA_NODE__ID;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ACTION__KEY = UIPackage.DATA_NODE__KEY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ACTION__VALUE = UIPackage.DATA_NODE__VALUE;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ACTION__ACTION = UIPackage.DATA_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ACTION__FILTER = UIPackage.DATA_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_ACTION_FEATURE_COUNT = UIPackage.DATA_NODE_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.menu.impl.MenuGroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.menu.impl.MenuGroupImpl
	 * @see org.abchip.mimo.ui.menu.impl.MenuPackageImpl#getMenuGroup()
	 * @generated
	 */
	int MENU_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_GROUP__ICON = UIPackage.DATA_NODE__ICON;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_GROUP__ID = UIPackage.DATA_NODE__ID;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_GROUP__KEY = UIPackage.DATA_NODE__KEY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_GROUP__VALUE = UIPackage.DATA_NODE__VALUE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_GROUP__DATA = UIPackage.DATA_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_GROUP_FEATURE_COUNT = UIPackage.DATA_NODE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.menu.ContextMenu <em>Context Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Menu</em>'.
	 * @see org.abchip.mimo.ui.menu.ContextMenu
	 * @generated
	 */
	EClass getContextMenu();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.ui.menu.ContextMenu#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.abchip.mimo.ui.menu.ContextMenu#getElements()
	 * @see #getContextMenu()
	 * @generated
	 */
	EReference getContextMenu_Elements();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.menu.ContextMenu#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.abchip.mimo.ui.menu.ContextMenu#getIcon()
	 * @see #getContextMenu()
	 * @generated
	 */
	EAttribute getContextMenu_Icon();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.menu.ContextMenu#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.ui.menu.ContextMenu#getName()
	 * @see #getContextMenu()
	 * @generated
	 */
	EAttribute getContextMenu_Name();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.menu.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see org.abchip.mimo.ui.menu.Menu
	 * @generated
	 */
	EClass getMenu();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.ui.menu.Menu#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.abchip.mimo.ui.menu.Menu#getElements()
	 * @see #getMenu()
	 * @generated
	 */
	EReference getMenu_Elements();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.menu.Menu#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.abchip.mimo.ui.menu.Menu#getIcon()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_Icon();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.menu.Menu#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.ui.menu.Menu#getName()
	 * @see #getMenu()
	 * @generated
	 */
	EAttribute getMenu_Name();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.menu.MenuAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.abchip.mimo.ui.menu.MenuAction
	 * @generated
	 */
	EClass getMenuAction();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.menu.MenuAction#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.abchip.mimo.ui.menu.MenuAction#getAction()
	 * @see #getMenuAction()
	 * @generated
	 */
	EAttribute getMenuAction_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.menu.MenuAction#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see org.abchip.mimo.ui.menu.MenuAction#getFilter()
	 * @see #getMenuAction()
	 * @generated
	 */
	EAttribute getMenuAction_Filter();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.menu.MenuGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see org.abchip.mimo.ui.menu.MenuGroup
	 * @generated
	 */
	EClass getMenuGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.ui.menu.MenuGroup#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see org.abchip.mimo.ui.menu.MenuGroup#getData()
	 * @see #getMenuGroup()
	 * @generated
	 */
	EReference getMenuGroup_Data();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MenuFactory getMenuFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.ui.menu.impl.ContextMenuImpl <em>Context Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.menu.impl.ContextMenuImpl
		 * @see org.abchip.mimo.ui.menu.impl.MenuPackageImpl#getContextMenu()
		 * @generated
		 */
		EClass CONTEXT_MENU = eINSTANCE.getContextMenu();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MENU__ELEMENTS = eINSTANCE.getContextMenu_Elements();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_MENU__ICON = eINSTANCE.getContextMenu_Icon();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_MENU__NAME = eINSTANCE.getContextMenu_Name();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.menu.impl.MenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.menu.impl.MenuImpl
		 * @see org.abchip.mimo.ui.menu.impl.MenuPackageImpl#getMenu()
		 * @generated
		 */
		EClass MENU = eINSTANCE.getMenu();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU__ELEMENTS = eINSTANCE.getMenu_Elements();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__ICON = eINSTANCE.getMenu_Icon();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU__NAME = eINSTANCE.getMenu_Name();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.menu.impl.MenuActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.menu.impl.MenuActionImpl
		 * @see org.abchip.mimo.ui.menu.impl.MenuPackageImpl#getMenuAction()
		 * @generated
		 */
		EClass MENU_ACTION = eINSTANCE.getMenuAction();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU_ACTION__ACTION = eINSTANCE.getMenuAction_Action();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU_ACTION__FILTER = eINSTANCE.getMenuAction_Filter();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.menu.impl.MenuGroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.menu.impl.MenuGroupImpl
		 * @see org.abchip.mimo.ui.menu.impl.MenuPackageImpl#getMenuGroup()
		 * @generated
		 */
		EClass MENU_GROUP = eINSTANCE.getMenuGroup();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_GROUP__DATA = eINSTANCE.getMenuGroup_Data();

	}

} //MenuPackage
