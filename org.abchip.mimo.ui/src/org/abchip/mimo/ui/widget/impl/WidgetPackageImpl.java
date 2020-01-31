/**
 * Copyright (c) 2017, 2019 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.widget.impl;

import org.abchip.mimo.MimoPackage;

import org.abchip.mimo.entity.EntityPackage;

import org.abchip.mimo.ui.UIPackage;

import org.abchip.mimo.ui.form.FormPackage;

import org.abchip.mimo.ui.form.impl.FormPackageImpl;

import org.abchip.mimo.ui.impl.UIPackageImpl;

import org.abchip.mimo.ui.menu.MenuPackage;

import org.abchip.mimo.ui.menu.impl.MenuPackageImpl;

import org.abchip.mimo.ui.query.QueryPackage;

import org.abchip.mimo.ui.query.impl.QueryPackageImpl;

import org.abchip.mimo.ui.schema.SchemaPackage;

import org.abchip.mimo.ui.schema.impl.SchemaPackageImpl;

import org.abchip.mimo.ui.toolbar.ToolbarPackage;

import org.abchip.mimo.ui.toolbar.impl.ToolbarPackageImpl;

import org.abchip.mimo.ui.widget.Widget;
import org.abchip.mimo.ui.widget.WidgetCheckBox;
import org.abchip.mimo.ui.widget.WidgetComboBox;
import org.abchip.mimo.ui.widget.WidgetCounter;
import org.abchip.mimo.ui.widget.WidgetDatePicker;
import org.abchip.mimo.ui.widget.WidgetFactory;
import org.abchip.mimo.ui.widget.WidgetForm;
import org.abchip.mimo.ui.widget.WidgetImage;
import org.abchip.mimo.ui.widget.WidgetNote;
import org.abchip.mimo.ui.widget.WidgetNumber;
import org.abchip.mimo.ui.widget.WidgetNumberAttribute;
import org.abchip.mimo.ui.widget.WidgetPackage;
import org.abchip.mimo.ui.widget.WidgetPattern;
import org.abchip.mimo.ui.widget.WidgetSwitch;
import org.abchip.mimo.ui.widget.WidgetText;
import org.abchip.mimo.ui.widget.WidgetTextAttribute;
import org.abchip.mimo.ui.widget.WidgetType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WidgetPackageImpl extends EPackageImpl implements WidgetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetCheckBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetComboBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetCounterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetDatePickerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetNumberAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetSwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetTextAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum widgetTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.abchip.mimo.ui.widget.WidgetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WidgetPackageImpl() {
		super(eNS_URI, WidgetFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link WidgetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WidgetPackage init() {
		if (isInited) return (WidgetPackage)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWidgetPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		WidgetPackageImpl theWidgetPackage = registeredWidgetPackage instanceof WidgetPackageImpl ? (WidgetPackageImpl)registeredWidgetPackage : new WidgetPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		MimoPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UIPackage.eNS_URI);
		UIPackageImpl theUIPackage = (UIPackageImpl)(registeredPackage instanceof UIPackageImpl ? registeredPackage : UIPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI);
		FormPackageImpl theFormPackage = (FormPackageImpl)(registeredPackage instanceof FormPackageImpl ? registeredPackage : FormPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MenuPackage.eNS_URI);
		MenuPackageImpl theMenuPackage = (MenuPackageImpl)(registeredPackage instanceof MenuPackageImpl ? registeredPackage : MenuPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI);
		QueryPackageImpl theQueryPackage = (QueryPackageImpl)(registeredPackage instanceof QueryPackageImpl ? registeredPackage : QueryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI);
		SchemaPackageImpl theSchemaPackage = (SchemaPackageImpl)(registeredPackage instanceof SchemaPackageImpl ? registeredPackage : SchemaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ToolbarPackage.eNS_URI);
		ToolbarPackageImpl theToolbarPackage = (ToolbarPackageImpl)(registeredPackage instanceof ToolbarPackageImpl ? registeredPackage : ToolbarPackage.eINSTANCE);

		// Create package meta-data objects
		theWidgetPackage.createPackageContents();
		theUIPackage.createPackageContents();
		theFormPackage.createPackageContents();
		theMenuPackage.createPackageContents();
		theQueryPackage.createPackageContents();
		theSchemaPackage.createPackageContents();
		theToolbarPackage.createPackageContents();

		// Initialize created meta-data
		theWidgetPackage.initializePackageContents();
		theUIPackage.initializePackageContents();
		theFormPackage.initializePackageContents();
		theMenuPackage.initializePackageContents();
		theQueryPackage.initializePackageContents();
		theSchemaPackage.initializePackageContents();
		theToolbarPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWidgetPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WidgetPackage.eNS_URI, theWidgetPackage);
		return theWidgetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWidget() {
		return widgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_Disabled() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWidget_Domain() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_Icon() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_Label() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_Name() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWidget_Pattern() {
		return (EReference)widgetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWidgetPattern() {
		return widgetPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidgetPattern_Allow() {
		return (EAttribute)widgetPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidgetPattern_Mask() {
		return (EAttribute)widgetPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWidgetCheckBox() {
		return widgetCheckBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidgetCheckBox_View() {
		return (EAttribute)widgetCheckBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWidgetComboBox() {
		return widgetComboBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidgetComboBox_View() {
		return (EAttribute)widgetComboBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWidgetCounter() {
		return widgetCounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidgetCounter_View() {
		return (EAttribute)widgetCounterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWidgetDatePicker() {
		return widgetDatePickerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidgetDatePicker_View() {
		return (EAttribute)widgetDatePickerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWidgetForm() {
		return widgetFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidgetForm_View() {
		return (EAttribute)widgetFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWidgetImage() {
		return widgetImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidgetImage_View() {
		return (EAttribute)widgetImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWidgetNote() {
		return widgetNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidgetNote_View() {
		return (EAttribute)widgetNoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWidgetNumber() {
		return widgetNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidgetNumber_View() {
		return (EAttribute)widgetNumberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWidgetNumber_Attributes() {
		return (EReference)widgetNumberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidgetNumber_Placeholder() {
		return (EAttribute)widgetNumberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWidgetNumberAttribute() {
		return widgetNumberAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidgetNumberAttribute_Maxlength() {
		return (EAttribute)widgetNumberAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWidgetSwitch() {
		return widgetSwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidgetSwitch_View() {
		return (EAttribute)widgetSwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWidgetText() {
		return widgetTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidgetText_View() {
		return (EAttribute)widgetTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidgetText_Placeholder() {
		return (EAttribute)widgetTextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWidgetText_Attributes() {
		return (EReference)widgetTextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWidgetTextAttribute() {
		return widgetTextAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidgetTextAttribute_Maxlength() {
		return (EAttribute)widgetTextAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getWidgetType() {
		return widgetTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetFactory getWidgetFactory() {
		return (WidgetFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		widgetEClass = createEClass(WIDGET);
		createEAttribute(widgetEClass, WIDGET__DISABLED);
		createEReference(widgetEClass, WIDGET__DOMAIN);
		createEAttribute(widgetEClass, WIDGET__ICON);
		createEAttribute(widgetEClass, WIDGET__LABEL);
		createEAttribute(widgetEClass, WIDGET__NAME);
		createEReference(widgetEClass, WIDGET__PATTERN);

		widgetPatternEClass = createEClass(WIDGET_PATTERN);
		createEAttribute(widgetPatternEClass, WIDGET_PATTERN__ALLOW);
		createEAttribute(widgetPatternEClass, WIDGET_PATTERN__MASK);

		widgetCheckBoxEClass = createEClass(WIDGET_CHECK_BOX);
		createEAttribute(widgetCheckBoxEClass, WIDGET_CHECK_BOX__VIEW);

		widgetComboBoxEClass = createEClass(WIDGET_COMBO_BOX);
		createEAttribute(widgetComboBoxEClass, WIDGET_COMBO_BOX__VIEW);

		widgetCounterEClass = createEClass(WIDGET_COUNTER);
		createEAttribute(widgetCounterEClass, WIDGET_COUNTER__VIEW);

		widgetDatePickerEClass = createEClass(WIDGET_DATE_PICKER);
		createEAttribute(widgetDatePickerEClass, WIDGET_DATE_PICKER__VIEW);

		widgetFormEClass = createEClass(WIDGET_FORM);
		createEAttribute(widgetFormEClass, WIDGET_FORM__VIEW);

		widgetImageEClass = createEClass(WIDGET_IMAGE);
		createEAttribute(widgetImageEClass, WIDGET_IMAGE__VIEW);

		widgetNoteEClass = createEClass(WIDGET_NOTE);
		createEAttribute(widgetNoteEClass, WIDGET_NOTE__VIEW);

		widgetNumberEClass = createEClass(WIDGET_NUMBER);
		createEAttribute(widgetNumberEClass, WIDGET_NUMBER__VIEW);
		createEReference(widgetNumberEClass, WIDGET_NUMBER__ATTRIBUTES);
		createEAttribute(widgetNumberEClass, WIDGET_NUMBER__PLACEHOLDER);

		widgetNumberAttributeEClass = createEClass(WIDGET_NUMBER_ATTRIBUTE);
		createEAttribute(widgetNumberAttributeEClass, WIDGET_NUMBER_ATTRIBUTE__MAXLENGTH);

		widgetSwitchEClass = createEClass(WIDGET_SWITCH);
		createEAttribute(widgetSwitchEClass, WIDGET_SWITCH__VIEW);

		widgetTextEClass = createEClass(WIDGET_TEXT);
		createEAttribute(widgetTextEClass, WIDGET_TEXT__VIEW);
		createEAttribute(widgetTextEClass, WIDGET_TEXT__PLACEHOLDER);
		createEReference(widgetTextEClass, WIDGET_TEXT__ATTRIBUTES);

		widgetTextAttributeEClass = createEClass(WIDGET_TEXT_ATTRIBUTE);
		createEAttribute(widgetTextAttributeEClass, WIDGET_TEXT_ATTRIBUTE__MAXLENGTH);

		// Create enums
		widgetTypeEEnum = createEEnum(WIDGET_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		widgetEClass.getESuperTypes().add(theEntityPackage.getEntity());
		widgetPatternEClass.getESuperTypes().add(theEntityPackage.getEntity());
		widgetCheckBoxEClass.getESuperTypes().add(this.getWidget());
		widgetComboBoxEClass.getESuperTypes().add(this.getWidget());
		widgetCounterEClass.getESuperTypes().add(this.getWidget());
		widgetDatePickerEClass.getESuperTypes().add(this.getWidget());
		widgetFormEClass.getESuperTypes().add(this.getWidget());
		widgetImageEClass.getESuperTypes().add(this.getWidget());
		widgetNoteEClass.getESuperTypes().add(this.getWidget());
		widgetNumberEClass.getESuperTypes().add(this.getWidget());
		widgetNumberAttributeEClass.getESuperTypes().add(theEntityPackage.getEntity());
		widgetSwitchEClass.getESuperTypes().add(this.getWidget());
		widgetTextEClass.getESuperTypes().add(this.getWidget());
		widgetTextAttributeEClass.getESuperTypes().add(theEntityPackage.getEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(widgetEClass, Widget.class, "Widget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidget_Disabled(), ecorePackage.getEBoolean(), "disabled", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Domain(), theEntityPackage.getDomain(), null, "domain", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Label(), ecorePackage.getEString(), "label", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Name(), ecorePackage.getEString(), "name", null, 1, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidget_Pattern(), this.getWidgetPattern(), null, "pattern", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(widgetEClass, this.getWidgetType(), "getView", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(widgetPatternEClass, WidgetPattern.class, "WidgetPattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidgetPattern_Allow(), ecorePackage.getEString(), "allow", null, 0, 1, WidgetPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidgetPattern_Mask(), ecorePackage.getEString(), "mask", null, 0, 1, WidgetPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetCheckBoxEClass, WidgetCheckBox.class, "WidgetCheckBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidgetCheckBox_View(), this.getWidgetType(), "view", "mm-checkbox", 1, 1, WidgetCheckBox.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetComboBoxEClass, WidgetComboBox.class, "WidgetComboBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidgetComboBox_View(), this.getWidgetType(), "view", "mm-combo", 1, 1, WidgetComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetCounterEClass, WidgetCounter.class, "WidgetCounter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidgetCounter_View(), this.getWidgetType(), "view", "mm-counter", 1, 1, WidgetCounter.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetDatePickerEClass, WidgetDatePicker.class, "WidgetDatePicker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidgetDatePicker_View(), this.getWidgetType(), "view", "mm-datepicker", 1, 1, WidgetDatePicker.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetFormEClass, WidgetForm.class, "WidgetForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidgetForm_View(), this.getWidgetType(), "view", "mm-form", 1, 1, WidgetForm.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetImageEClass, WidgetImage.class, "WidgetImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidgetImage_View(), this.getWidgetType(), "view", "mm-image", 1, 1, WidgetImage.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetNoteEClass, WidgetNote.class, "WidgetNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidgetNote_View(), this.getWidgetType(), "view", "mm-note", 1, 1, WidgetNote.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetNumberEClass, WidgetNumber.class, "WidgetNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidgetNumber_View(), this.getWidgetType(), "view", "mm-number", 1, 1, WidgetNumber.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidgetNumber_Attributes(), this.getWidgetNumberAttribute(), null, "attributes", null, 0, 1, WidgetNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidgetNumber_Placeholder(), ecorePackage.getEString(), "placeholder", null, 0, 1, WidgetNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetNumberAttributeEClass, WidgetNumberAttribute.class, "WidgetNumberAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidgetNumberAttribute_Maxlength(), ecorePackage.getEInt(), "maxlength", null, 0, 1, WidgetNumberAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetSwitchEClass, WidgetSwitch.class, "WidgetSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidgetSwitch_View(), this.getWidgetType(), "view", "mm-switch", 1, 1, WidgetSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetTextEClass, WidgetText.class, "WidgetText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidgetText_View(), this.getWidgetType(), "view", "mm-text", 1, 1, WidgetText.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidgetText_Placeholder(), ecorePackage.getEString(), "placeholder", "Insert text here", 0, 1, WidgetText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWidgetText_Attributes(), this.getWidgetTextAttribute(), null, "attributes", null, 0, 1, WidgetText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetTextAttributeEClass, WidgetTextAttribute.class, "WidgetTextAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidgetTextAttribute_Maxlength(), ecorePackage.getEInt(), "maxlength", null, 0, 1, WidgetTextAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(widgetTypeEEnum, WidgetType.class, "WidgetType");
		addEEnumLiteral(widgetTypeEEnum, WidgetType.CHECK_BOX);
		addEEnumLiteral(widgetTypeEEnum, WidgetType.COMBO_BOX);
		addEEnumLiteral(widgetTypeEEnum, WidgetType.COUNTER);
		addEEnumLiteral(widgetTypeEEnum, WidgetType.DATE_PICKER);
		addEEnumLiteral(widgetTypeEEnum, WidgetType.FORM);
		addEEnumLiteral(widgetTypeEEnum, WidgetType.IMAGE);
		addEEnumLiteral(widgetTypeEEnum, WidgetType.NOTE);
		addEEnumLiteral(widgetTypeEEnum, WidgetType.NUMBER);
		addEEnumLiteral(widgetTypeEEnum, WidgetType.SWITCH);
		addEEnumLiteral(widgetTypeEEnum, WidgetType.TEXT);
	}

} //WidgetPackageImpl
