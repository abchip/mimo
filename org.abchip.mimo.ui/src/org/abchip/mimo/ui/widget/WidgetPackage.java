/**
 * Copyright (c) 2017, 2019 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
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
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetPatternImpl <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPatternImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetPattern()
	 * @generated
	 */
	int WIDGET_PATTERN = 1;

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
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_PATTERN_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetCheckBoxImpl <em>Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetCheckBoxImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetCheckBox()
	 * @generated
	 */
	int WIDGET_CHECK_BOX = 2;

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
	int WIDGET_COMBO_BOX = 3;

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
	 * The number of structural features of the '<em>Combo Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COMBO_BOX_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetCounterImpl <em>Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetCounterImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetCounter()
	 * @generated
	 */
	int WIDGET_COUNTER = 4;

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
	 * The number of structural features of the '<em>Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_COUNTER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetDatePickerImpl <em>Date Picker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetDatePickerImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetDatePicker()
	 * @generated
	 */
	int WIDGET_DATE_PICKER = 5;

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
	int WIDGET_FORM = 6;

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
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FORM_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetImageImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetImage()
	 * @generated
	 */
	int WIDGET_IMAGE = 7;

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
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_IMAGE_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetNoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetNoteImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetNote()
	 * @generated
	 */
	int WIDGET_NOTE = 8;

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
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_NOTE_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetNumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetNumberImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetNumber()
	 * @generated
	 */
	int WIDGET_NUMBER = 9;

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
	int WIDGET_NUMBER_ATTRIBUTE = 10;

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
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.impl.WidgetTextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.impl.WidgetTextImpl
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetText()
	 * @generated
	 */
	int WIDGET_TEXT = 11;

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
	int WIDGET_TEXT_ATTRIBUTE = 12;

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
	 * The meta object id for the '{@link org.abchip.mimo.ui.widget.WidgetType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.ui.widget.WidgetType
	 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetType()
	 * @generated
	 */
	int WIDGET_TYPE = 13;


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
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.ui.widget.Widget#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see org.abchip.mimo.ui.widget.Widget#getDomain()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Domain();

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
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.ui.widget.Widget#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see org.abchip.mimo.ui.widget.Widget#getPattern()
	 * @see #getWidget()
	 * @generated
	 */
	EReference getWidget_Pattern();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgetPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetPattern
	 * @generated
	 */
	EClass getWidgetPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetPattern#getAllow <em>Allow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetPattern#getAllow()
	 * @see #getWidgetPattern()
	 * @generated
	 */
	EAttribute getWidgetPattern_Allow();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetPattern#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetPattern#getMask()
	 * @see #getWidgetPattern()
	 * @generated
	 */
	EAttribute getWidgetPattern_Mask();

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
	 * Returns the meta object for class '{@link org.abchip.mimo.ui.widget.WidgetNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetNote
	 * @generated
	 */
	EClass getWidgetNote();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.ui.widget.WidgetNote#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.abchip.mimo.ui.widget.WidgetNote#getView()
	 * @see #getWidgetNote()
	 * @generated
	 */
	EAttribute getWidgetNote_View();

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
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetPatternImpl <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPatternImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetPattern()
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
		 * The meta object literal for the '{@link org.abchip.mimo.ui.widget.impl.WidgetNoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.ui.widget.impl.WidgetNoteImpl
		 * @see org.abchip.mimo.ui.widget.impl.WidgetPackageImpl#getWidgetNote()
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
