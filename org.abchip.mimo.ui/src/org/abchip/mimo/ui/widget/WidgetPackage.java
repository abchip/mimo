/**
 * Copyright (c) 2017, 2021 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.widget;

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
 * @see org.abchip.mimo.ui.widget.WidgetFactory
 * @model kind="package"
 * @generated
 */
public interface WidgetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "widget";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/ui/widget";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ui-widget";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WidgetPackage eINSTANCE = org.abchip.mimo.ui.widget.impl.WidgetPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 0;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__DISABLED = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__ICON = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__LABEL = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__NAME = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetEntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetEntryImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetEntry()
	 * @generated
	 */
	int WIDGET_ENTRY = 1;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_ENTRY_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetBrowserImpl <em>Browser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetBrowserImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetBrowser()
	 * @generated
	 */
	int WIDGET_BROWSER = 2;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_BROWSER__DISABLED = WIDGET__DISABLED;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_BROWSER__ICON = WIDGET__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_BROWSER__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_BROWSER__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_BROWSER__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Browser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_BROWSER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetCheckBoxImpl <em>Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetCheckBoxImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetCheckBox()
	 * @generated
	 */
	int WIDGET_CHECK_BOX = 3;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_CHECK_BOX__DISABLED = WIDGET__DISABLED;

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
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_CHECK_BOX__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_CHECK_BOX_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetComboBoxImpl <em>Combo Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetComboBoxImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetComboBox()
	 * @generated
	 */
	int WIDGET_COMBO_BOX = 4;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMBO_BOX__DISABLED = WIDGET__DISABLED;

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
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMBO_BOX__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMBO_BOX__ENTRY = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Combo Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMBO_BOX_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetComboBoxEntryImpl <em>Combo Box Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetComboBoxEntryImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetComboBoxEntry()
	 * @generated
	 */
	int WIDGET_COMBO_BOX_ENTRY = 5;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMBO_BOX_ENTRY__FRAME = WIDGET_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMBO_BOX_ENTRY__FILTER = WIDGET_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMBO_BOX_ENTRY__SELECTED = WIDGET_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Combo Box Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMBO_BOX_ENTRY_FEATURE_COUNT = WIDGET_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetCounterImpl <em>Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetCounterImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetCounter()
	 * @generated
	 */
	int WIDGET_COUNTER = 6;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COUNTER__DISABLED = WIDGET__DISABLED;

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
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COUNTER__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COUNTER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetDashboardImpl <em>Dashboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetDashboardImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetDashboard()
	 * @generated
	 */
	int WIDGET_DASHBOARD = 7;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DASHBOARD__DISABLED = WIDGET__DISABLED;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DASHBOARD__ICON = WIDGET__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DASHBOARD__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DASHBOARD__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DASHBOARD__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dashboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DASHBOARD_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetDatePickerImpl <em>Date Picker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetDatePickerImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetDatePicker()
	 * @generated
	 */
	int WIDGET_DATE_PICKER = 8;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DATE_PICKER__DISABLED = WIDGET__DISABLED;

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
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DATE_PICKER__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Picker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_DATE_PICKER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetFormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetFormImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetForm()
	 * @generated
	 */
	int WIDGET_FORM = 9;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FORM__DISABLED = WIDGET__DISABLED;

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
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FORM__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FORM__ENTRY = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FORM_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetFormEntryImpl <em>Form Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetFormEntryImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetFormEntry()
	 * @generated
	 */
	int WIDGET_FORM_ENTRY = 10;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FORM_ENTRY__FRAME = WIDGET_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FORM_ENTRY__NAME = WIDGET_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Form Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FORM_ENTRY_FEATURE_COUNT = WIDGET_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetImageImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetImage()
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
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_IMAGE__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_IMAGE_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetLayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetLayoutImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetLayout()
	 * @generated
	 */
	int WIDGET_LAYOUT = 12;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_LAYOUT__DISABLED = WIDGET__DISABLED;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_LAYOUT__ICON = WIDGET__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_LAYOUT__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_LAYOUT__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_LAYOUT__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_LAYOUT__EVENTS = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_LAYOUT_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetMenuImpl <em>Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetMenuImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetMenu()
	 * @generated
	 */
	int WIDGET_MENU = 13;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_MENU__DISABLED = WIDGET__DISABLED;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_MENU__ICON = WIDGET__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_MENU__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_MENU__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_MENU__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_MENU_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetTextAreaImpl <em>Text Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetTextAreaImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetTextArea()
	 * @generated
	 */
	int WIDGET_TEXT_AREA = 24;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetNumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetNumberImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetNumber()
	 * @generated
	 */
	int WIDGET_NUMBER = 14;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_NUMBER__DISABLED = WIDGET__DISABLED;

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
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_NUMBER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetNumberAttributeImpl <em>Number Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetNumberAttributeImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetNumberAttribute()
	 * @generated
	 */
	int WIDGET_NUMBER_ATTRIBUTE = 15;

	/**
	 * The feature id for the '<em><b>Maxlength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_NUMBER_ATTRIBUTE__MAXLENGTH = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_NUMBER_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetPropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPropertyImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetProperty()
	 * @generated
	 */
	int WIDGET_PROPERTY = 16;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_PROPERTY__DISABLED = WIDGET__DISABLED;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_PROPERTY__ICON = WIDGET__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_PROPERTY__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_PROPERTY__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_PROPERTY__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_PROPERTY_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetQueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetQueryImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetQuery()
	 * @generated
	 */
	int WIDGET_QUERY = 17;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_QUERY__DISABLED = WIDGET__DISABLED;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_QUERY__ICON = WIDGET__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_QUERY__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_QUERY__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_QUERY__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_QUERY_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetSwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetSwitchImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetSwitch()
	 * @generated
	 */
	int WIDGET_SWITCH = 19;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetTabImpl <em>Tab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetTabImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetTab()
	 * @generated
	 */
	int WIDGET_TAB = 20;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetTableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetTableImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetTable()
	 * @generated
	 */
	int WIDGET_TABLE = 21;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgeReviewImpl <em>Widge Review</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgeReviewImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgeReview()
	 * @generated
	 */
	int WIDGE_REVIEW = 18;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGE_REVIEW__DISABLED = WIDGET__DISABLED;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGE_REVIEW__ICON = WIDGET__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGE_REVIEW__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGE_REVIEW__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGE_REVIEW__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Widge Review</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGE_REVIEW_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_SWITCH__DISABLED = WIDGET__DISABLED;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_SWITCH__ICON = WIDGET__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_SWITCH__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_SWITCH__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_SWITCH__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_SWITCH_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TAB__DISABLED = WIDGET__DISABLED;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TAB__ICON = WIDGET__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TAB__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TAB__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TAB__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TAB_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TABLE__DISABLED = WIDGET__DISABLED;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TABLE__ICON = WIDGET__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TABLE__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TABLE__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TABLE__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TABLE_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetTextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetTextImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetText()
	 * @generated
	 */
	int WIDGET_TEXT = 22;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TEXT__DISABLED = WIDGET__DISABLED;

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
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TEXT_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetTextAttributeImpl <em>Text Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetTextAttributeImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetTextAttribute()
	 * @generated
	 */
	int WIDGET_TEXT_ATTRIBUTE = 23;

	/**
	 * The feature id for the '<em><b>Maxlength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TEXT_ATTRIBUTE__MAXLENGTH = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TEXT_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TEXT_AREA__DISABLED = WIDGET__DISABLED;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TEXT_AREA__ICON = WIDGET__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TEXT_AREA__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TEXT_AREA__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TEXT_AREA__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TEXT_AREA_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetToolbarImpl <em>Toolbar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetToolbarImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetToolbar()
	 * @generated
	 */
	int WIDGET_TOOLBAR = 25;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TOOLBAR__DISABLED = WIDGET__DISABLED;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TOOLBAR__ICON = WIDGET__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TOOLBAR__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TOOLBAR__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TOOLBAR__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Toolbar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_TOOLBAR_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetUploaderImpl <em>Uploader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetUploaderImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetUploader()
	 * @generated
	 */
	int WIDGET_UPLOADER = 26;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_UPLOADER__DISABLED = WIDGET__DISABLED;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_UPLOADER__ICON = WIDGET__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_UPLOADER__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_UPLOADER__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_UPLOADER__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uploader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_UPLOADER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetViewImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetView()
	 * @generated
	 */
	int WIDGET_VIEW = 27;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_VIEW__DISABLED = WIDGET__DISABLED;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_VIEW__ICON = WIDGET__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_VIEW__LABEL = WIDGET__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_VIEW__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_VIEW__VIEW = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_VIEW_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.WidgetType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.WidgetType
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetType()
	 * @generated
	 */
	int WIDGET_TYPE = 28;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see org.abchip.mimo.ui.widget.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.Widget#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.abchip.mimo.ui.widget.Widget#isDisabled()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.Widget#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.abchip.mimo.ui.widget.Widget#getIcon()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Icon();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.Widget#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.abchip.mimo.ui.widget.Widget#getLabel()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.Widget#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.ui.widget.Widget#getName()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Name();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgetEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetEntry
	 * @generated
	 */
	EClass getWidgetEntry();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgetBrowser <em>Browser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Browser</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetBrowser
	 * @generated
	 */
	EClass getWidgetBrowser();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetBrowser#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetBrowser#getView()
	 * @see #getWidgetBrowser()
	 * @generated
	 */
	EAttribute getWidgetBrowser_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgetCheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Box</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetCheckBox
	 * @generated
	 */
	EClass getWidgetCheckBox();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetCheckBox#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetCheckBox#getView()
	 * @see #getWidgetCheckBox()
	 * @generated
	 */
	EAttribute getWidgetCheckBox_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgetComboBox <em>Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combo Box</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetComboBox
	 * @generated
	 */
	EClass getWidgetComboBox();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetComboBox#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetComboBox#getView()
	 * @see #getWidgetComboBox()
	 * @generated
	 */
	EAttribute getWidgetComboBox_View();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.ui.widget.WidgetComboBox#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetComboBox#getEntry()
	 * @see #getWidgetComboBox()
	 * @generated
	 */
	EReference getWidgetComboBox_Entry();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgetComboBoxEntry <em>Combo Box Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combo Box Entry</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetComboBoxEntry
	 * @generated
	 */
	EClass getWidgetComboBoxEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetComboBoxEntry#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetComboBoxEntry#getFrame()
	 * @see #getWidgetComboBoxEntry()
	 * @generated
	 */
	EAttribute getWidgetComboBoxEntry_Frame();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetComboBoxEntry#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetComboBoxEntry#getFilter()
	 * @see #getWidgetComboBoxEntry()
	 * @generated
	 */
	EAttribute getWidgetComboBoxEntry_Filter();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetComboBoxEntry#getSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetComboBoxEntry#getSelected()
	 * @see #getWidgetComboBoxEntry()
	 * @generated
	 */
	EAttribute getWidgetComboBoxEntry_Selected();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgetCounter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counter</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetCounter
	 * @generated
	 */
	EClass getWidgetCounter();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetCounter#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetCounter#getView()
	 * @see #getWidgetCounter()
	 * @generated
	 */
	EAttribute getWidgetCounter_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgetDashboard <em>Dashboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dashboard</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetDashboard
	 * @generated
	 */
	EClass getWidgetDashboard();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetDashboard#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetDashboard#getView()
	 * @see #getWidgetDashboard()
	 * @generated
	 */
	EAttribute getWidgetDashboard_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgetDatePicker <em>Date Picker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Picker</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetDatePicker
	 * @generated
	 */
	EClass getWidgetDatePicker();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetDatePicker#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetDatePicker#getView()
	 * @see #getWidgetDatePicker()
	 * @generated
	 */
	EAttribute getWidgetDatePicker_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgetForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetForm
	 * @generated
	 */
	EClass getWidgetForm();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetForm#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetForm#getView()
	 * @see #getWidgetForm()
	 * @generated
	 */
	EAttribute getWidgetForm_View();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.ui.widget.WidgetForm#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetForm#getEntry()
	 * @see #getWidgetForm()
	 * @generated
	 */
	EReference getWidgetForm_Entry();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgetFormEntry <em>Form Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Entry</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetFormEntry
	 * @generated
	 */
	EClass getWidgetFormEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetFormEntry#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetFormEntry#getFrame()
	 * @see #getWidgetFormEntry()
	 * @generated
	 */
	EAttribute getWidgetFormEntry_Frame();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetFormEntry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetFormEntry#getName()
	 * @see #getWidgetFormEntry()
	 * @generated
	 */
	EAttribute getWidgetFormEntry_Name();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgetImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetImage
	 * @generated
	 */
	EClass getWidgetImage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetImage#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetImage#getView()
	 * @see #getWidgetImage()
	 * @generated
	 */
	EAttribute getWidgetImage_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgetLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetLayout
	 * @generated
	 */
	EClass getWidgetLayout();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetLayout#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetLayout#getView()
	 * @see #getWidgetLayout()
	 * @generated
	 */
	EAttribute getWidgetLayout_View();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.ui.widget.WidgetLayout#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Events</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetLayout#getEvents()
	 * @see #getWidgetLayout()
	 * @generated
	 */
	EReference getWidgetLayout_Events();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgetMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetMenu
	 * @generated
	 */
	EClass getWidgetMenu();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetMenu#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetMenu#getView()
	 * @see #getWidgetMenu()
	 * @generated
	 */
	EAttribute getWidgetMenu_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgetTextArea <em>Text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Area</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetTextArea
	 * @generated
	 */
	EClass getWidgetTextArea();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetTextArea#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetTextArea#getView()
	 * @see #getWidgetTextArea()
	 * @generated
	 */
	EAttribute getWidgetTextArea_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgetNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetNumber
	 * @generated
	 */
	EClass getWidgetNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetNumber#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetNumber#getView()
	 * @see #getWidgetNumber()
	 * @generated
	 */
	EAttribute getWidgetNumber_View();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.ui.widget.WidgetNumber#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetNumber#getAttributes()
	 * @see #getWidgetNumber()
	 * @generated
	 */
	EReference getWidgetNumber_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetNumber#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetNumber#getPlaceholder()
	 * @see #getWidgetNumber()
	 * @generated
	 */
	EAttribute getWidgetNumber_Placeholder();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgetNumberAttribute <em>Number Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Attribute</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetNumberAttribute
	 * @generated
	 */
	EClass getWidgetNumberAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetNumberAttribute#getMaxlength <em>Maxlength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxlength</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetNumberAttribute#getMaxlength()
	 * @see #getWidgetNumberAttribute()
	 * @generated
	 */
	EAttribute getWidgetNumberAttribute_Maxlength();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgetProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetProperty
	 * @generated
	 */
	EClass getWidgetProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetProperty#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetProperty#getView()
	 * @see #getWidgetProperty()
	 * @generated
	 */
	EAttribute getWidgetProperty_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgetQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetQuery
	 * @generated
	 */
	EClass getWidgetQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetQuery#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetQuery#getView()
	 * @see #getWidgetQuery()
	 * @generated
	 */
	EAttribute getWidgetQuery_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgetSwitch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetSwitch
	 * @generated
	 */
	EClass getWidgetSwitch();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetSwitch#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetSwitch#getView()
	 * @see #getWidgetSwitch()
	 * @generated
	 */
	EAttribute getWidgetSwitch_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgetTab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetTab
	 * @generated
	 */
	EClass getWidgetTab();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetTab#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetTab#getView()
	 * @see #getWidgetTab()
	 * @generated
	 */
	EAttribute getWidgetTab_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgetTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetTable
	 * @generated
	 */
	EClass getWidgetTable();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetTable#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetTable#getView()
	 * @see #getWidgetTable()
	 * @generated
	 */
	EAttribute getWidgetTable_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgeReview <em>Widge Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widge Review</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgeReview
	 * @generated
	 */
	EClass getWidgeReview();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgeReview#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgeReview#getView()
	 * @see #getWidgeReview()
	 * @generated
	 */
	EAttribute getWidgeReview_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgetText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetText
	 * @generated
	 */
	EClass getWidgetText();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetText#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetText#getView()
	 * @see #getWidgetText()
	 * @generated
	 */
	EAttribute getWidgetText_View();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetText#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetText#getPlaceholder()
	 * @see #getWidgetText()
	 * @generated
	 */
	EAttribute getWidgetText_Placeholder();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.ui.widget.WidgetText#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetText#getAttributes()
	 * @see #getWidgetText()
	 * @generated
	 */
	EReference getWidgetText_Attributes();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgetTextAttribute <em>Text Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Attribute</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetTextAttribute
	 * @generated
	 */
	EClass getWidgetTextAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetTextAttribute#getMaxlength <em>Maxlength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxlength</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetTextAttribute#getMaxlength()
	 * @see #getWidgetTextAttribute()
	 * @generated
	 */
	EAttribute getWidgetTextAttribute_Maxlength();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgetToolbar <em>Toolbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toolbar</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetToolbar
	 * @generated
	 */
	EClass getWidgetToolbar();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetToolbar#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetToolbar#getView()
	 * @see #getWidgetToolbar()
	 * @generated
	 */
	EAttribute getWidgetToolbar_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgetUploader <em>Uploader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uploader</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetUploader
	 * @generated
	 */
	EClass getWidgetUploader();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetUploader#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetUploader#getView()
	 * @see #getWidgetUploader()
	 * @generated
	 */
	EAttribute getWidgetUploader_View();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgetView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetView
	 * @generated
	 */
	EClass getWidgetView();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetView#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetView#getView()
	 * @see #getWidgetView()
	 * @generated
	 */
	EAttribute getWidgetView_View();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.ui.widget.WidgetType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetType
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
	WidgetFactory getWidgetFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetImpl <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidget()
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
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetEntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetEntryImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetEntry()
		 * @generated
		 */
		EClass WIDGET_ENTRY = eINSTANCE.getWidgetEntry();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetBrowserImpl <em>Browser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetBrowserImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetBrowser()
		 * @generated
		 */
		EClass WIDGET_BROWSER = eINSTANCE.getWidgetBrowser();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_BROWSER__VIEW = eINSTANCE.getWidgetBrowser_View();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetCheckBoxImpl <em>Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetCheckBoxImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetCheckBox()
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
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetComboBoxImpl <em>Combo Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetComboBoxImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetComboBox()
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
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_COMBO_BOX__ENTRY = eINSTANCE.getWidgetComboBox_Entry();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetComboBoxEntryImpl <em>Combo Box Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetComboBoxEntryImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetComboBoxEntry()
		 * @generated
		 */
		EClass WIDGET_COMBO_BOX_ENTRY = eINSTANCE.getWidgetComboBoxEntry();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_COMBO_BOX_ENTRY__FRAME = eINSTANCE.getWidgetComboBoxEntry_Frame();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_COMBO_BOX_ENTRY__FILTER = eINSTANCE.getWidgetComboBoxEntry_Filter();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_COMBO_BOX_ENTRY__SELECTED = eINSTANCE.getWidgetComboBoxEntry_Selected();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetCounterImpl <em>Counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetCounterImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetCounter()
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
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetDashboardImpl <em>Dashboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetDashboardImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetDashboard()
		 * @generated
		 */
		EClass WIDGET_DASHBOARD = eINSTANCE.getWidgetDashboard();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_DASHBOARD__VIEW = eINSTANCE.getWidgetDashboard_View();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetDatePickerImpl <em>Date Picker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetDatePickerImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetDatePicker()
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
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetFormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetFormImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetForm()
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
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_FORM__ENTRY = eINSTANCE.getWidgetForm_Entry();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetFormEntryImpl <em>Form Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetFormEntryImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetFormEntry()
		 * @generated
		 */
		EClass WIDGET_FORM_ENTRY = eINSTANCE.getWidgetFormEntry();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_FORM_ENTRY__FRAME = eINSTANCE.getWidgetFormEntry_Frame();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_FORM_ENTRY__NAME = eINSTANCE.getWidgetFormEntry_Name();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetImageImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetImage()
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
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetLayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetLayoutImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetLayout()
		 * @generated
		 */
		EClass WIDGET_LAYOUT = eINSTANCE.getWidgetLayout();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_LAYOUT__VIEW = eINSTANCE.getWidgetLayout_View();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_LAYOUT__EVENTS = eINSTANCE.getWidgetLayout_Events();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetMenuImpl <em>Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetMenuImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetMenu()
		 * @generated
		 */
		EClass WIDGET_MENU = eINSTANCE.getWidgetMenu();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_MENU__VIEW = eINSTANCE.getWidgetMenu_View();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetTextAreaImpl <em>Text Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetTextAreaImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetTextArea()
		 * @generated
		 */
		EClass WIDGET_TEXT_AREA = eINSTANCE.getWidgetTextArea();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_TEXT_AREA__VIEW = eINSTANCE.getWidgetTextArea_View();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetNumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetNumberImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetNumber()
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
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetNumberAttributeImpl <em>Number Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetNumberAttributeImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetNumberAttribute()
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
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetPropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPropertyImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetProperty()
		 * @generated
		 */
		EClass WIDGET_PROPERTY = eINSTANCE.getWidgetProperty();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_PROPERTY__VIEW = eINSTANCE.getWidgetProperty_View();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetQueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetQueryImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetQuery()
		 * @generated
		 */
		EClass WIDGET_QUERY = eINSTANCE.getWidgetQuery();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_QUERY__VIEW = eINSTANCE.getWidgetQuery_View();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetSwitchImpl <em>Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetSwitchImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetSwitch()
		 * @generated
		 */
		EClass WIDGET_SWITCH = eINSTANCE.getWidgetSwitch();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_SWITCH__VIEW = eINSTANCE.getWidgetSwitch_View();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetTabImpl <em>Tab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetTabImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetTab()
		 * @generated
		 */
		EClass WIDGET_TAB = eINSTANCE.getWidgetTab();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_TAB__VIEW = eINSTANCE.getWidgetTab_View();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetTableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetTableImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetTable()
		 * @generated
		 */
		EClass WIDGET_TABLE = eINSTANCE.getWidgetTable();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_TABLE__VIEW = eINSTANCE.getWidgetTable_View();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgeReviewImpl <em>Widge Review</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgeReviewImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgeReview()
		 * @generated
		 */
		EClass WIDGE_REVIEW = eINSTANCE.getWidgeReview();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGE_REVIEW__VIEW = eINSTANCE.getWidgeReview_View();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetTextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetTextImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetText()
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
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetTextAttributeImpl <em>Text Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetTextAttributeImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetTextAttribute()
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
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetToolbarImpl <em>Toolbar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetToolbarImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetToolbar()
		 * @generated
		 */
		EClass WIDGET_TOOLBAR = eINSTANCE.getWidgetToolbar();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_TOOLBAR__VIEW = eINSTANCE.getWidgetToolbar_View();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetUploaderImpl <em>Uploader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetUploaderImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetUploader()
		 * @generated
		 */
		EClass WIDGET_UPLOADER = eINSTANCE.getWidgetUploader();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_UPLOADER__VIEW = eINSTANCE.getWidgetUploader_View();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetViewImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetView()
		 * @generated
		 */
		EClass WIDGET_VIEW = eINSTANCE.getWidgetView();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_VIEW__VIEW = eINSTANCE.getWidgetView_View();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.WidgetType <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.WidgetType
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetType()
		 * @generated
		 */
		EEnum WIDGET_TYPE = eINSTANCE.getWidgetType();

	}

} //WidgetPackage
