/**
 * Copyright (c) 2017, 2019 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui;

import org.abchip.mimo.entity.EntityPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.abchip.mimo.ui.UIFactory
 * @model kind="package"
 * @generated
 */
public interface UIPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/ui";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UIPackage eINSTANCE = org.abchip.mimo.ui.impl.UIPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.ActionImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 0;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__COMMAND = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TYPE = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.DataNodeImpl <em>Data Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.DataNodeImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getDataNode()
	 * @generated
	 */
	int DATA_NODE = 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__ICON = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__ID = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__KEY = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE__VALUE = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_NODE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.UiFrameSetupImpl <em>Ui Frame Setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.UiFrameSetupImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getUiFrameSetup()
	 * @generated
	 */
	int UI_FRAME_SETUP = 2;

	/**
	 * The feature id for the '<em><b>Context Menu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FRAME_SETUP__CONTEXT_MENU = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FRAME_SETUP__NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FRAME_SETUP__ICON = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ui Frame Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FRAME_SETUP_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.UiUserSetupImpl <em>Ui User Setup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.UiUserSetupImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getUiUserSetup()
	 * @generated
	 */
	int UI_USER_SETUP = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_USER_SETUP__NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ui User Setup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_USER_SETUP_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.ViewImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 4;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__DISABLED = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__DOMAIN = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ICON = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__LABEL = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = EntityPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__PATTERN = EntityPackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.ViewPatternImpl <em>View Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.ViewPatternImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getViewPattern()
	 * @generated
	 */
	int VIEW_PATTERN = 5;

	/**
	 * The feature id for the '<em><b>Allow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PATTERN__ALLOW = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PATTERN__MASK = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>View Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_PATTERN_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.ViewCheckBoxImpl <em>View Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.ViewCheckBoxImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getViewCheckBox()
	 * @generated
	 */
	int VIEW_CHECK_BOX = 6;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CHECK_BOX__DISABLED = VIEW__DISABLED;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CHECK_BOX__DOMAIN = VIEW__DOMAIN;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CHECK_BOX__ICON = VIEW__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CHECK_BOX__LABEL = VIEW__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CHECK_BOX__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CHECK_BOX__PATTERN = VIEW__PATTERN;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CHECK_BOX__VIEW = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CHECK_BOX_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.ViewComboBoxImpl <em>View Combo Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.ViewComboBoxImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getViewComboBox()
	 * @generated
	 */
	int VIEW_COMBO_BOX = 7;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMBO_BOX__DISABLED = VIEW__DISABLED;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMBO_BOX__DOMAIN = VIEW__DOMAIN;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMBO_BOX__ICON = VIEW__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMBO_BOX__LABEL = VIEW__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMBO_BOX__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMBO_BOX__PATTERN = VIEW__PATTERN;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMBO_BOX__VIEW = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Combo Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMBO_BOX_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.ViewCounterImpl <em>View Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.ViewCounterImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getViewCounter()
	 * @generated
	 */
	int VIEW_COUNTER = 8;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COUNTER__DISABLED = VIEW__DISABLED;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COUNTER__DOMAIN = VIEW__DOMAIN;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COUNTER__ICON = VIEW__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COUNTER__LABEL = VIEW__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COUNTER__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COUNTER__PATTERN = VIEW__PATTERN;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COUNTER__VIEW = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COUNTER_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.ViewDatePickerImpl <em>View Date Picker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.ViewDatePickerImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getViewDatePicker()
	 * @generated
	 */
	int VIEW_DATE_PICKER = 9;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DATE_PICKER__DISABLED = VIEW__DISABLED;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DATE_PICKER__DOMAIN = VIEW__DOMAIN;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DATE_PICKER__ICON = VIEW__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DATE_PICKER__LABEL = VIEW__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DATE_PICKER__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DATE_PICKER__PATTERN = VIEW__PATTERN;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DATE_PICKER__VIEW = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Date Picker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DATE_PICKER_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.ViewFormImpl <em>View Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.ViewFormImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getViewForm()
	 * @generated
	 */
	int VIEW_FORM = 10;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FORM__DISABLED = VIEW__DISABLED;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FORM__DOMAIN = VIEW__DOMAIN;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FORM__ICON = VIEW__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FORM__LABEL = VIEW__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FORM__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FORM__PATTERN = VIEW__PATTERN;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FORM__VIEW = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FORM_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.ViewImageImpl <em>View Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.ViewImageImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getViewImage()
	 * @generated
	 */
	int VIEW_IMAGE = 11;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_IMAGE__DISABLED = VIEW__DISABLED;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_IMAGE__DOMAIN = VIEW__DOMAIN;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_IMAGE__ICON = VIEW__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_IMAGE__LABEL = VIEW__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_IMAGE__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_IMAGE__PATTERN = VIEW__PATTERN;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_IMAGE__VIEW = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_IMAGE_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.ViewNoteImpl <em>View Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.ViewNoteImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getViewNote()
	 * @generated
	 */
	int VIEW_NOTE = 12;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_NOTE__DISABLED = VIEW__DISABLED;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_NOTE__DOMAIN = VIEW__DOMAIN;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_NOTE__ICON = VIEW__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_NOTE__LABEL = VIEW__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_NOTE__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_NOTE__PATTERN = VIEW__PATTERN;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_NOTE__VIEW = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_NOTE_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.ViewNumberImpl <em>View Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.ViewNumberImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getViewNumber()
	 * @generated
	 */
	int VIEW_NUMBER = 13;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_NUMBER__DISABLED = VIEW__DISABLED;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_NUMBER__DOMAIN = VIEW__DOMAIN;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_NUMBER__ICON = VIEW__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_NUMBER__LABEL = VIEW__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_NUMBER__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_NUMBER__PATTERN = VIEW__PATTERN;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_NUMBER__VIEW = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_NUMBER__ATTRIBUTES = VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_NUMBER__PLACEHOLDER = VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>View Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_NUMBER_FEATURE_COUNT = VIEW_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.ViewNumberAttributeImpl <em>View Number Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.ViewNumberAttributeImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getViewNumberAttribute()
	 * @generated
	 */
	int VIEW_NUMBER_ATTRIBUTE = 14;

	/**
	 * The feature id for the '<em><b>Maxlength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_NUMBER_ATTRIBUTE__MAXLENGTH = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Number Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_NUMBER_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.ViewTextImpl <em>View Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.ViewTextImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getViewText()
	 * @generated
	 */
	int VIEW_TEXT = 15;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TEXT__DISABLED = VIEW__DISABLED;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TEXT__DOMAIN = VIEW__DOMAIN;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TEXT__ICON = VIEW__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TEXT__LABEL = VIEW__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TEXT__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TEXT__PATTERN = VIEW__PATTERN;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TEXT__VIEW = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TEXT__PLACEHOLDER = VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TEXT__ATTRIBUTES = VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>View Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TEXT_FEATURE_COUNT = VIEW_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.ViewTextAttributeImpl <em>View Text Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.ViewTextAttributeImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getViewTextAttribute()
	 * @generated
	 */
	int VIEW_TEXT_ATTRIBUTE = 16;

	/**
	 * The feature id for the '<em><b>Maxlength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TEXT_ATTRIBUTE__MAXLENGTH = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Text Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TEXT_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.ActionType
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 17;


	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.ViewType <em>View Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.ViewType
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getViewType()
	 * @generated
	 */
	int VIEW_TYPE = 18;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.abchip.mimo.ui.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.Action#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see org.abchip.mimo.ui.Action#getCommand()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Command();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.Action#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.abchip.mimo.ui.Action#getType()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Type();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.DataNode <em>Data Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Node</em>'.
	 * @see org.abchip.mimo.ui.DataNode
	 * @generated
	 */
	EClass getDataNode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.DataNode#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.abchip.mimo.ui.DataNode#getIcon()
	 * @see #getDataNode()
	 * @generated
	 */
	EAttribute getDataNode_Icon();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.DataNode#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.abchip.mimo.ui.DataNode#getId()
	 * @see #getDataNode()
	 * @generated
	 */
	EAttribute getDataNode_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.DataNode#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.abchip.mimo.ui.DataNode#getKey()
	 * @see #getDataNode()
	 * @generated
	 */
	EAttribute getDataNode_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.DataNode#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.abchip.mimo.ui.DataNode#getValue()
	 * @see #getDataNode()
	 * @generated
	 */
	EAttribute getDataNode_Value();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.UiFrameSetup <em>Ui Frame Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Frame Setup</em>'.
	 * @see org.abchip.mimo.ui.UiFrameSetup
	 * @generated
	 */
	EClass getUiFrameSetup();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.UiFrameSetup#isContextMenu <em>Context Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Menu</em>'.
	 * @see org.abchip.mimo.ui.UiFrameSetup#isContextMenu()
	 * @see #getUiFrameSetup()
	 * @generated
	 */
	EAttribute getUiFrameSetup_ContextMenu();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.UiFrameSetup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.ui.UiFrameSetup#getName()
	 * @see #getUiFrameSetup()
	 * @generated
	 */
	EAttribute getUiFrameSetup_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.UiFrameSetup#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.abchip.mimo.ui.UiFrameSetup#getIcon()
	 * @see #getUiFrameSetup()
	 * @generated
	 */
	EAttribute getUiFrameSetup_Icon();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.UiUserSetup <em>Ui User Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui User Setup</em>'.
	 * @see org.abchip.mimo.ui.UiUserSetup
	 * @generated
	 */
	EClass getUiUserSetup();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.UiUserSetup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.ui.UiUserSetup#getName()
	 * @see #getUiUserSetup()
	 * @generated
	 */
	EAttribute getUiUserSetup_Name();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see org.abchip.mimo.ui.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.View#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.abchip.mimo.ui.View#isDisabled()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Disabled();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.ui.View#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see org.abchip.mimo.ui.View#getDomain()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Domain();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.View#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.abchip.mimo.ui.View#getIcon()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Icon();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.View#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.abchip.mimo.ui.View#getLabel()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.View#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.ui.View#getName()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.ui.View#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see org.abchip.mimo.ui.View#getPattern()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Pattern();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.ViewPattern <em>View Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Pattern</em>'.
	 * @see org.abchip.mimo.ui.ViewPattern
	 * @generated
	 */
	EClass getViewPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.ViewPattern#getAllow <em>Allow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow</em>'.
	 * @see org.abchip.mimo.ui.ViewPattern#getAllow()
	 * @see #getViewPattern()
	 * @generated
	 */
	EAttribute getViewPattern_Allow();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.ViewPattern#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see org.abchip.mimo.ui.ViewPattern#getMask()
	 * @see #getViewPattern()
	 * @generated
	 */
	EAttribute getViewPattern_Mask();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.ViewCheckBox <em>View Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Check Box</em>'.
	 * @see org.abchip.mimo.ui.ViewCheckBox
	 * @generated
	 */
	EClass getViewCheckBox();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.ViewCheckBox#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.ViewCheckBox#getView()
	 * @see #getViewCheckBox()
	 * @generated
	 */
	EAttribute getViewCheckBox_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.ViewComboBox <em>View Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Combo Box</em>'.
	 * @see org.abchip.mimo.ui.ViewComboBox
	 * @generated
	 */
	EClass getViewComboBox();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.ViewComboBox#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.ViewComboBox#getView()
	 * @see #getViewComboBox()
	 * @generated
	 */
	EAttribute getViewComboBox_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.ViewCounter <em>View Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Counter</em>'.
	 * @see org.abchip.mimo.ui.ViewCounter
	 * @generated
	 */
	EClass getViewCounter();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.ViewCounter#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.ViewCounter#getView()
	 * @see #getViewCounter()
	 * @generated
	 */
	EAttribute getViewCounter_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.ViewDatePicker <em>View Date Picker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Date Picker</em>'.
	 * @see org.abchip.mimo.ui.ViewDatePicker
	 * @generated
	 */
	EClass getViewDatePicker();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.ViewDatePicker#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.ViewDatePicker#getView()
	 * @see #getViewDatePicker()
	 * @generated
	 */
	EAttribute getViewDatePicker_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.ViewForm <em>View Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Form</em>'.
	 * @see org.abchip.mimo.ui.ViewForm
	 * @generated
	 */
	EClass getViewForm();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.ViewForm#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.ViewForm#getView()
	 * @see #getViewForm()
	 * @generated
	 */
	EAttribute getViewForm_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.ViewImage <em>View Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Image</em>'.
	 * @see org.abchip.mimo.ui.ViewImage
	 * @generated
	 */
	EClass getViewImage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.ViewImage#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.ViewImage#getView()
	 * @see #getViewImage()
	 * @generated
	 */
	EAttribute getViewImage_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.ViewNote <em>View Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Note</em>'.
	 * @see org.abchip.mimo.ui.ViewNote
	 * @generated
	 */
	EClass getViewNote();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.ViewNote#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.ViewNote#getView()
	 * @see #getViewNote()
	 * @generated
	 */
	EAttribute getViewNote_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.ViewNumber <em>View Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Number</em>'.
	 * @see org.abchip.mimo.ui.ViewNumber
	 * @generated
	 */
	EClass getViewNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.ViewNumber#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.ViewNumber#getView()
	 * @see #getViewNumber()
	 * @generated
	 */
	EAttribute getViewNumber_View();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.ViewNumber#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see org.abchip.mimo.ui.ViewNumber#getPlaceholder()
	 * @see #getViewNumber()
	 * @generated
	 */
	EAttribute getViewNumber_Placeholder();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.ui.ViewNumber#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see org.abchip.mimo.ui.ViewNumber#getAttributes()
	 * @see #getViewNumber()
	 * @generated
	 */
	EReference getViewNumber_Attributes();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.ViewNumberAttribute <em>View Number Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Number Attribute</em>'.
	 * @see org.abchip.mimo.ui.ViewNumberAttribute
	 * @generated
	 */
	EClass getViewNumberAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.ViewNumberAttribute#getMaxlength <em>Maxlength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxlength</em>'.
	 * @see org.abchip.mimo.ui.ViewNumberAttribute#getMaxlength()
	 * @see #getViewNumberAttribute()
	 * @generated
	 */
	EAttribute getViewNumberAttribute_Maxlength();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.ViewText <em>View Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Text</em>'.
	 * @see org.abchip.mimo.ui.ViewText
	 * @generated
	 */
	EClass getViewText();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.ViewText#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.ViewText#getView()
	 * @see #getViewText()
	 * @generated
	 */
	EAttribute getViewText_View();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.ViewText#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see org.abchip.mimo.ui.ViewText#getPlaceholder()
	 * @see #getViewText()
	 * @generated
	 */
	EAttribute getViewText_Placeholder();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.ui.ViewText#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see org.abchip.mimo.ui.ViewText#getAttributes()
	 * @see #getViewText()
	 * @generated
	 */
	EReference getViewText_Attributes();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.ViewTextAttribute <em>View Text Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Text Attribute</em>'.
	 * @see org.abchip.mimo.ui.ViewTextAttribute
	 * @generated
	 */
	EClass getViewTextAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.ViewTextAttribute#getMaxlength <em>Maxlength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxlength</em>'.
	 * @see org.abchip.mimo.ui.ViewTextAttribute#getMaxlength()
	 * @see #getViewTextAttribute()
	 * @generated
	 */
	EAttribute getViewTextAttribute_Maxlength();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.ui.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type</em>'.
	 * @see org.abchip.mimo.ui.ActionType
	 * @generated
	 */
	EEnum getActionType();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.ui.ViewType <em>View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>View Type</em>'.
	 * @see org.abchip.mimo.ui.ViewType
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
	UIFactory getUIFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.ActionImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__COMMAND = eINSTANCE.getAction_Command();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__TYPE = eINSTANCE.getAction_Type();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.DataNodeImpl <em>Data Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.DataNodeImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getDataNode()
		 * @generated
		 */
		EClass DATA_NODE = eINSTANCE.getDataNode();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_NODE__ICON = eINSTANCE.getDataNode_Icon();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_NODE__ID = eINSTANCE.getDataNode_Id();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_NODE__KEY = eINSTANCE.getDataNode_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_NODE__VALUE = eINSTANCE.getDataNode_Value();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.UiFrameSetupImpl <em>Ui Frame Setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.UiFrameSetupImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getUiFrameSetup()
		 * @generated
		 */
		EClass UI_FRAME_SETUP = eINSTANCE.getUiFrameSetup();

		/**
		 * The meta object literal for the '<em><b>Context Menu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_FRAME_SETUP__CONTEXT_MENU = eINSTANCE.getUiFrameSetup_ContextMenu();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_FRAME_SETUP__NAME = eINSTANCE.getUiFrameSetup_Name();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_FRAME_SETUP__ICON = eINSTANCE.getUiFrameSetup_Icon();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.UiUserSetupImpl <em>Ui User Setup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.UiUserSetupImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getUiUserSetup()
		 * @generated
		 */
		EClass UI_USER_SETUP = eINSTANCE.getUiUserSetup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_USER_SETUP__NAME = eINSTANCE.getUiUserSetup_Name();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.ViewImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__DISABLED = eINSTANCE.getView_Disabled();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__DOMAIN = eINSTANCE.getView_Domain();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__ICON = eINSTANCE.getView_Icon();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__LABEL = eINSTANCE.getView_Label();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__NAME = eINSTANCE.getView_Name();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__PATTERN = eINSTANCE.getView_Pattern();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.ViewPatternImpl <em>View Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.ViewPatternImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getViewPattern()
		 * @generated
		 */
		EClass VIEW_PATTERN = eINSTANCE.getViewPattern();

		/**
		 * The meta object literal for the '<em><b>Allow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_PATTERN__ALLOW = eINSTANCE.getViewPattern_Allow();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_PATTERN__MASK = eINSTANCE.getViewPattern_Mask();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.ViewCheckBoxImpl <em>View Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.ViewCheckBoxImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getViewCheckBox()
		 * @generated
		 */
		EClass VIEW_CHECK_BOX = eINSTANCE.getViewCheckBox();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_CHECK_BOX__VIEW = eINSTANCE.getViewCheckBox_View();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.ViewComboBoxImpl <em>View Combo Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.ViewComboBoxImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getViewComboBox()
		 * @generated
		 */
		EClass VIEW_COMBO_BOX = eINSTANCE.getViewComboBox();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_COMBO_BOX__VIEW = eINSTANCE.getViewComboBox_View();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.ViewCounterImpl <em>View Counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.ViewCounterImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getViewCounter()
		 * @generated
		 */
		EClass VIEW_COUNTER = eINSTANCE.getViewCounter();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_COUNTER__VIEW = eINSTANCE.getViewCounter_View();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.ViewDatePickerImpl <em>View Date Picker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.ViewDatePickerImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getViewDatePicker()
		 * @generated
		 */
		EClass VIEW_DATE_PICKER = eINSTANCE.getViewDatePicker();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_DATE_PICKER__VIEW = eINSTANCE.getViewDatePicker_View();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.ViewFormImpl <em>View Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.ViewFormImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getViewForm()
		 * @generated
		 */
		EClass VIEW_FORM = eINSTANCE.getViewForm();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_FORM__VIEW = eINSTANCE.getViewForm_View();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.ViewImageImpl <em>View Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.ViewImageImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getViewImage()
		 * @generated
		 */
		EClass VIEW_IMAGE = eINSTANCE.getViewImage();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_IMAGE__VIEW = eINSTANCE.getViewImage_View();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.ViewNoteImpl <em>View Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.ViewNoteImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getViewNote()
		 * @generated
		 */
		EClass VIEW_NOTE = eINSTANCE.getViewNote();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_NOTE__VIEW = eINSTANCE.getViewNote_View();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.ViewNumberImpl <em>View Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.ViewNumberImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getViewNumber()
		 * @generated
		 */
		EClass VIEW_NUMBER = eINSTANCE.getViewNumber();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_NUMBER__VIEW = eINSTANCE.getViewNumber_View();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_NUMBER__PLACEHOLDER = eINSTANCE.getViewNumber_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_NUMBER__ATTRIBUTES = eINSTANCE.getViewNumber_Attributes();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.ViewNumberAttributeImpl <em>View Number Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.ViewNumberAttributeImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getViewNumberAttribute()
		 * @generated
		 */
		EClass VIEW_NUMBER_ATTRIBUTE = eINSTANCE.getViewNumberAttribute();

		/**
		 * The meta object literal for the '<em><b>Maxlength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_NUMBER_ATTRIBUTE__MAXLENGTH = eINSTANCE.getViewNumberAttribute_Maxlength();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.ViewTextImpl <em>View Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.ViewTextImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getViewText()
		 * @generated
		 */
		EClass VIEW_TEXT = eINSTANCE.getViewText();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_TEXT__VIEW = eINSTANCE.getViewText_View();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_TEXT__PLACEHOLDER = eINSTANCE.getViewText_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_TEXT__ATTRIBUTES = eINSTANCE.getViewText_Attributes();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.ViewTextAttributeImpl <em>View Text Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.ViewTextAttributeImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getViewTextAttribute()
		 * @generated
		 */
		EClass VIEW_TEXT_ATTRIBUTE = eINSTANCE.getViewTextAttribute();

		/**
		 * The meta object literal for the '<em><b>Maxlength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_TEXT_ATTRIBUTE__MAXLENGTH = eINSTANCE.getViewTextAttribute_Maxlength();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.ActionType <em>Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.ActionType
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getActionType()
		 * @generated
		 */
		EEnum ACTION_TYPE = eINSTANCE.getActionType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.ViewType <em>View Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.ViewType
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getViewType()
		 * @generated
		 */
		EEnum VIEW_TYPE = eINSTANCE.getViewType();

	}

} //UIPackage
