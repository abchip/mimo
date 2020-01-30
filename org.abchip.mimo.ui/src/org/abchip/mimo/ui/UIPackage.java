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
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.WidgetImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 4;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__DISABLED = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__DOMAIN = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ICON = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__LABEL = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__NAME = EntityPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__PATTERN = EntityPackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.WidgetPatternImpl <em>Widget Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.WidgetPatternImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getWidgetPattern()
	 * @generated
	 */
	int WIDGET_PATTERN = 5;

	/**
	 * The feature id for the '<em><b>Allow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_PATTERN__ALLOW = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_PATTERN__MASK = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Widget Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_PATTERN_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.WidgetCheckBoxImpl <em>Widget Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.WidgetCheckBoxImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getWidgetCheckBox()
	 * @generated
	 */
	int WIDGET_CHECK_BOX = 6;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_CHECK_BOX__DISABLED = WIDGET__DISABLED;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_CHECK_BOX__DOMAIN = WIDGET__DOMAIN;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_CHECK_BOX__ICON = WIDGET__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_CHECK_BOX__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_CHECK_BOX__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_CHECK_BOX__PATTERN = WIDGET__PATTERN;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_CHECK_BOX__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Widget Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_CHECK_BOX_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.WidgetComboBoxImpl <em>Widget Combo Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.WidgetComboBoxImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getWidgetComboBox()
	 * @generated
	 */
	int WIDGET_COMBO_BOX = 7;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMBO_BOX__DISABLED = WIDGET__DISABLED;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMBO_BOX__DOMAIN = WIDGET__DOMAIN;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMBO_BOX__ICON = WIDGET__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMBO_BOX__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMBO_BOX__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMBO_BOX__PATTERN = WIDGET__PATTERN;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMBO_BOX__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Widget Combo Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMBO_BOX_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.WidgetCounterImpl <em>Widget Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.WidgetCounterImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getWidgetCounter()
	 * @generated
	 */
	int WIDGET_COUNTER = 8;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COUNTER__DISABLED = WIDGET__DISABLED;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COUNTER__DOMAIN = WIDGET__DOMAIN;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COUNTER__ICON = WIDGET__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COUNTER__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COUNTER__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COUNTER__PATTERN = WIDGET__PATTERN;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COUNTER__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Widget Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COUNTER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.WidgetDatePickerImpl <em>Widget Date Picker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.WidgetDatePickerImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getWidgetDatePicker()
	 * @generated
	 */
	int WIDGET_DATE_PICKER = 9;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DATE_PICKER__DISABLED = WIDGET__DISABLED;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DATE_PICKER__DOMAIN = WIDGET__DOMAIN;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DATE_PICKER__ICON = WIDGET__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DATE_PICKER__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DATE_PICKER__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DATE_PICKER__PATTERN = WIDGET__PATTERN;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DATE_PICKER__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Widget Date Picker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DATE_PICKER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.WidgetFormImpl <em>Widget Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.WidgetFormImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getWidgetForm()
	 * @generated
	 */
	int WIDGET_FORM = 10;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FORM__DISABLED = WIDGET__DISABLED;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FORM__DOMAIN = WIDGET__DOMAIN;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FORM__ICON = WIDGET__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FORM__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FORM__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FORM__PATTERN = WIDGET__PATTERN;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FORM__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Widget Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FORM_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.WidgetImageImpl <em>Widget Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.WidgetImageImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getWidgetImage()
	 * @generated
	 */
	int WIDGET_IMAGE = 11;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_IMAGE__DISABLED = WIDGET__DISABLED;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_IMAGE__DOMAIN = WIDGET__DOMAIN;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_IMAGE__ICON = WIDGET__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_IMAGE__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_IMAGE__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_IMAGE__PATTERN = WIDGET__PATTERN;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_IMAGE__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Widget Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_IMAGE_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.WidgetNoteImpl <em>Widget Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.WidgetNoteImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getWidgetNote()
	 * @generated
	 */
	int WIDGET_NOTE = 12;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_NOTE__DISABLED = WIDGET__DISABLED;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_NOTE__DOMAIN = WIDGET__DOMAIN;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_NOTE__ICON = WIDGET__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_NOTE__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_NOTE__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_NOTE__PATTERN = WIDGET__PATTERN;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_NOTE__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Widget Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_NOTE_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.WidgetNumberImpl <em>Widget Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.WidgetNumberImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getWidgetNumber()
	 * @generated
	 */
	int WIDGET_NUMBER = 13;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_NUMBER__DISABLED = WIDGET__DISABLED;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_NUMBER__DOMAIN = WIDGET__DOMAIN;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_NUMBER__ICON = WIDGET__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_NUMBER__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_NUMBER__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_NUMBER__PATTERN = WIDGET__PATTERN;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_NUMBER__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_NUMBER__ATTRIBUTES = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_NUMBER__PLACEHOLDER = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Widget Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_NUMBER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.WidgetNumberAttributeImpl <em>Widget Number Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.WidgetNumberAttributeImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getWidgetNumberAttribute()
	 * @generated
	 */
	int WIDGET_NUMBER_ATTRIBUTE = 14;

	/**
	 * The feature id for the '<em><b>Maxlength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_NUMBER_ATTRIBUTE__MAXLENGTH = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Widget Number Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_NUMBER_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.WidgetTextImpl <em>Widget Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.WidgetTextImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getWidgetText()
	 * @generated
	 */
	int WIDGET_TEXT = 15;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TEXT__DISABLED = WIDGET__DISABLED;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TEXT__DOMAIN = WIDGET__DOMAIN;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TEXT__ICON = WIDGET__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TEXT__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TEXT__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TEXT__PATTERN = WIDGET__PATTERN;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TEXT__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TEXT__PLACEHOLDER = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TEXT__ATTRIBUTES = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Widget Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TEXT_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.impl.WidgetTextAttributeImpl <em>Widget Text Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.impl.WidgetTextAttributeImpl
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getWidgetTextAttribute()
	 * @generated
	 */
	int WIDGET_TEXT_ATTRIBUTE = 16;

	/**
	 * The feature id for the '<em><b>Maxlength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TEXT_ATTRIBUTE__MAXLENGTH = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Widget Text Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TEXT_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link org.abchip.mimo.ui.WidgetType <em>Widget Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.WidgetType
	 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getWidgetType()
	 * @generated
	 */
	int WIDGET_TYPE = 18;

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
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see org.abchip.mimo.ui.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.Widget#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.abchip.mimo.ui.Widget#isDisabled()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Disabled();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.ui.Widget#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see org.abchip.mimo.ui.Widget#getDomain()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Domain();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.Widget#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.abchip.mimo.ui.Widget#getIcon()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Icon();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.Widget#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.abchip.mimo.ui.Widget#getLabel()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.Widget#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.ui.Widget#getName()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.ui.Widget#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see org.abchip.mimo.ui.Widget#getPattern()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Pattern();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.WidgetPattern <em>Widget Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Pattern</em>'.
	 * @see org.abchip.mimo.ui.WidgetPattern
	 * @generated
	 */
	EClass getWidgetPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.WidgetPattern#getAllow <em>Allow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow</em>'.
	 * @see org.abchip.mimo.ui.WidgetPattern#getAllow()
	 * @see #getWidgetPattern()
	 * @generated
	 */
	EAttribute getWidgetPattern_Allow();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.WidgetPattern#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see org.abchip.mimo.ui.WidgetPattern#getMask()
	 * @see #getWidgetPattern()
	 * @generated
	 */
	EAttribute getWidgetPattern_Mask();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.WidgetCheckBox <em>Widget Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Check Box</em>'.
	 * @see org.abchip.mimo.ui.WidgetCheckBox
	 * @generated
	 */
	EClass getWidgetCheckBox();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.WidgetCheckBox#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.WidgetCheckBox#getView()
	 * @see #getWidgetCheckBox()
	 * @generated
	 */
	EAttribute getWidgetCheckBox_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.WidgetComboBox <em>Widget Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Combo Box</em>'.
	 * @see org.abchip.mimo.ui.WidgetComboBox
	 * @generated
	 */
	EClass getWidgetComboBox();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.WidgetComboBox#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.WidgetComboBox#getView()
	 * @see #getWidgetComboBox()
	 * @generated
	 */
	EAttribute getWidgetComboBox_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.WidgetCounter <em>Widget Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Counter</em>'.
	 * @see org.abchip.mimo.ui.WidgetCounter
	 * @generated
	 */
	EClass getWidgetCounter();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.WidgetCounter#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.WidgetCounter#getView()
	 * @see #getWidgetCounter()
	 * @generated
	 */
	EAttribute getWidgetCounter_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.WidgetDatePicker <em>Widget Date Picker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Date Picker</em>'.
	 * @see org.abchip.mimo.ui.WidgetDatePicker
	 * @generated
	 */
	EClass getWidgetDatePicker();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.WidgetDatePicker#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.WidgetDatePicker#getView()
	 * @see #getWidgetDatePicker()
	 * @generated
	 */
	EAttribute getWidgetDatePicker_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.WidgetForm <em>Widget Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Form</em>'.
	 * @see org.abchip.mimo.ui.WidgetForm
	 * @generated
	 */
	EClass getWidgetForm();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.WidgetForm#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.WidgetForm#getView()
	 * @see #getWidgetForm()
	 * @generated
	 */
	EAttribute getWidgetForm_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.WidgetImage <em>Widget Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Image</em>'.
	 * @see org.abchip.mimo.ui.WidgetImage
	 * @generated
	 */
	EClass getWidgetImage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.WidgetImage#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.WidgetImage#getView()
	 * @see #getWidgetImage()
	 * @generated
	 */
	EAttribute getWidgetImage_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.WidgetNote <em>Widget Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Note</em>'.
	 * @see org.abchip.mimo.ui.WidgetNote
	 * @generated
	 */
	EClass getWidgetNote();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.WidgetNote#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.WidgetNote#getView()
	 * @see #getWidgetNote()
	 * @generated
	 */
	EAttribute getWidgetNote_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.WidgetNumber <em>Widget Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Number</em>'.
	 * @see org.abchip.mimo.ui.WidgetNumber
	 * @generated
	 */
	EClass getWidgetNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.WidgetNumber#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.WidgetNumber#getView()
	 * @see #getWidgetNumber()
	 * @generated
	 */
	EAttribute getWidgetNumber_View();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.ui.WidgetNumber#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see org.abchip.mimo.ui.WidgetNumber#getAttributes()
	 * @see #getWidgetNumber()
	 * @generated
	 */
	EReference getWidgetNumber_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.WidgetNumber#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see org.abchip.mimo.ui.WidgetNumber#getPlaceholder()
	 * @see #getWidgetNumber()
	 * @generated
	 */
	EAttribute getWidgetNumber_Placeholder();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.WidgetNumberAttribute <em>Widget Number Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Number Attribute</em>'.
	 * @see org.abchip.mimo.ui.WidgetNumberAttribute
	 * @generated
	 */
	EClass getWidgetNumberAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.WidgetNumberAttribute#getMaxlength <em>Maxlength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxlength</em>'.
	 * @see org.abchip.mimo.ui.WidgetNumberAttribute#getMaxlength()
	 * @see #getWidgetNumberAttribute()
	 * @generated
	 */
	EAttribute getWidgetNumberAttribute_Maxlength();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.WidgetText <em>Widget Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Text</em>'.
	 * @see org.abchip.mimo.ui.WidgetText
	 * @generated
	 */
	EClass getWidgetText();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.WidgetText#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.WidgetText#getView()
	 * @see #getWidgetText()
	 * @generated
	 */
	EAttribute getWidgetText_View();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.WidgetText#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see org.abchip.mimo.ui.WidgetText#getPlaceholder()
	 * @see #getWidgetText()
	 * @generated
	 */
	EAttribute getWidgetText_Placeholder();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.ui.WidgetText#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see org.abchip.mimo.ui.WidgetText#getAttributes()
	 * @see #getWidgetText()
	 * @generated
	 */
	EReference getWidgetText_Attributes();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.WidgetTextAttribute <em>Widget Text Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Text Attribute</em>'.
	 * @see org.abchip.mimo.ui.WidgetTextAttribute
	 * @generated
	 */
	EClass getWidgetTextAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.WidgetTextAttribute#getMaxlength <em>Maxlength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxlength</em>'.
	 * @see org.abchip.mimo.ui.WidgetTextAttribute#getMaxlength()
	 * @see #getWidgetTextAttribute()
	 * @generated
	 */
	EAttribute getWidgetTextAttribute_Maxlength();

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
	 * Returns the meta object for enum '{@link org.abchip.mimo.ui.WidgetType <em>Widget Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Widget Type</em>'.
	 * @see org.abchip.mimo.ui.WidgetType
	 * @generated
	 */
	EEnum getWidgetType();

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
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.WidgetImpl <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.WidgetImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getWidget()
		 * @generated
		 */
		EClass WIDGET = eINSTANCE.getWidget();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__DISABLED = eINSTANCE.getWidget_Disabled();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__DOMAIN = eINSTANCE.getWidget_Domain();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__ICON = eINSTANCE.getWidget_Icon();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__LABEL = eINSTANCE.getWidget_Label();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__NAME = eINSTANCE.getWidget_Name();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET__PATTERN = eINSTANCE.getWidget_Pattern();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.WidgetPatternImpl <em>Widget Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.WidgetPatternImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getWidgetPattern()
		 * @generated
		 */
		EClass WIDGET_PATTERN = eINSTANCE.getWidgetPattern();

		/**
		 * The meta object literal for the '<em><b>Allow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_PATTERN__ALLOW = eINSTANCE.getWidgetPattern_Allow();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_PATTERN__MASK = eINSTANCE.getWidgetPattern_Mask();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.WidgetCheckBoxImpl <em>Widget Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.WidgetCheckBoxImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getWidgetCheckBox()
		 * @generated
		 */
		EClass WIDGET_CHECK_BOX = eINSTANCE.getWidgetCheckBox();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_CHECK_BOX__VIEW = eINSTANCE.getWidgetCheckBox_View();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.WidgetComboBoxImpl <em>Widget Combo Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.WidgetComboBoxImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getWidgetComboBox()
		 * @generated
		 */
		EClass WIDGET_COMBO_BOX = eINSTANCE.getWidgetComboBox();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_COMBO_BOX__VIEW = eINSTANCE.getWidgetComboBox_View();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.WidgetCounterImpl <em>Widget Counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.WidgetCounterImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getWidgetCounter()
		 * @generated
		 */
		EClass WIDGET_COUNTER = eINSTANCE.getWidgetCounter();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_COUNTER__VIEW = eINSTANCE.getWidgetCounter_View();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.WidgetDatePickerImpl <em>Widget Date Picker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.WidgetDatePickerImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getWidgetDatePicker()
		 * @generated
		 */
		EClass WIDGET_DATE_PICKER = eINSTANCE.getWidgetDatePicker();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_DATE_PICKER__VIEW = eINSTANCE.getWidgetDatePicker_View();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.WidgetFormImpl <em>Widget Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.WidgetFormImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getWidgetForm()
		 * @generated
		 */
		EClass WIDGET_FORM = eINSTANCE.getWidgetForm();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_FORM__VIEW = eINSTANCE.getWidgetForm_View();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.WidgetImageImpl <em>Widget Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.WidgetImageImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getWidgetImage()
		 * @generated
		 */
		EClass WIDGET_IMAGE = eINSTANCE.getWidgetImage();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_IMAGE__VIEW = eINSTANCE.getWidgetImage_View();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.WidgetNoteImpl <em>Widget Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.WidgetNoteImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getWidgetNote()
		 * @generated
		 */
		EClass WIDGET_NOTE = eINSTANCE.getWidgetNote();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_NOTE__VIEW = eINSTANCE.getWidgetNote_View();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.WidgetNumberImpl <em>Widget Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.WidgetNumberImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getWidgetNumber()
		 * @generated
		 */
		EClass WIDGET_NUMBER = eINSTANCE.getWidgetNumber();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_NUMBER__VIEW = eINSTANCE.getWidgetNumber_View();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_NUMBER__ATTRIBUTES = eINSTANCE.getWidgetNumber_Attributes();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_NUMBER__PLACEHOLDER = eINSTANCE.getWidgetNumber_Placeholder();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.WidgetNumberAttributeImpl <em>Widget Number Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.WidgetNumberAttributeImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getWidgetNumberAttribute()
		 * @generated
		 */
		EClass WIDGET_NUMBER_ATTRIBUTE = eINSTANCE.getWidgetNumberAttribute();

		/**
		 * The meta object literal for the '<em><b>Maxlength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_NUMBER_ATTRIBUTE__MAXLENGTH = eINSTANCE.getWidgetNumberAttribute_Maxlength();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.WidgetTextImpl <em>Widget Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.WidgetTextImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getWidgetText()
		 * @generated
		 */
		EClass WIDGET_TEXT = eINSTANCE.getWidgetText();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_TEXT__VIEW = eINSTANCE.getWidgetText_View();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_TEXT__PLACEHOLDER = eINSTANCE.getWidgetText_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_TEXT__ATTRIBUTES = eINSTANCE.getWidgetText_Attributes();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.impl.WidgetTextAttributeImpl <em>Widget Text Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.impl.WidgetTextAttributeImpl
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getWidgetTextAttribute()
		 * @generated
		 */
		EClass WIDGET_TEXT_ATTRIBUTE = eINSTANCE.getWidgetTextAttribute();

		/**
		 * The meta object literal for the '<em><b>Maxlength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_TEXT_ATTRIBUTE__MAXLENGTH = eINSTANCE.getWidgetTextAttribute_Maxlength();

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
		 * The meta object literal for the '{@link org.abchip.mimo.ui.WidgetType <em>Widget Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.WidgetType
		 * @see org.abchip.mimo.ui.impl.UIPackageImpl#getWidgetType()
		 * @generated
		 */
		EEnum WIDGET_TYPE = eINSTANCE.getWidgetType();

	}

} //UIPackage
