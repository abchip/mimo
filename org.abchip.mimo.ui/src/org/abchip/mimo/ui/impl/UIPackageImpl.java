/**
 * Copyright (c) 2017, 2019 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.impl;

import org.abchip.mimo.MimoPackage;

import org.abchip.mimo.entity.EntityPackage;

import org.abchip.mimo.ui.Action;
import org.abchip.mimo.ui.ActionType;
import org.abchip.mimo.ui.DataNode;
import org.abchip.mimo.ui.UIFactory;
import org.abchip.mimo.ui.UIPackage;

import org.abchip.mimo.ui.UiFrameSetup;
import org.abchip.mimo.ui.UiUserSetup;
import org.abchip.mimo.ui.View;
import org.abchip.mimo.ui.ViewCheckBox;
import org.abchip.mimo.ui.ViewComboBox;
import org.abchip.mimo.ui.ViewCounter;
import org.abchip.mimo.ui.ViewDatePicker;
import org.abchip.mimo.ui.ViewForm;
import org.abchip.mimo.ui.ViewImage;
import org.abchip.mimo.ui.ViewNote;
import org.abchip.mimo.ui.ViewNumber;
import org.abchip.mimo.ui.ViewNumberAttribute;
import org.abchip.mimo.ui.ViewPattern;
import org.abchip.mimo.ui.ViewText;
import org.abchip.mimo.ui.ViewTextAttribute;
import org.abchip.mimo.ui.ViewType;
import org.abchip.mimo.ui.form.FormPackage;
import org.abchip.mimo.ui.form.impl.FormPackageImpl;
import org.abchip.mimo.ui.menu.MenuPackage;

import org.abchip.mimo.ui.menu.impl.MenuPackageImpl;

import org.abchip.mimo.ui.query.QueryPackage;
import org.abchip.mimo.ui.query.impl.QueryPackageImpl;
import org.abchip.mimo.ui.schema.SchemaPackage;

import org.abchip.mimo.ui.schema.impl.SchemaPackageImpl;

import org.abchip.mimo.ui.toolbar.ToolbarPackage;

import org.abchip.mimo.ui.toolbar.impl.ToolbarPackageImpl;
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
public class UIPackageImpl extends EPackageImpl implements UIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiFrameSetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiUserSetupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewCheckBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewComboBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewCounterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewDatePickerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewNumberAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewTextAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum viewTypeEEnum = null;

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
	 * @see org.abchip.mimo.ui.UIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UIPackageImpl() {
		super(eNS_URI, UIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UIPackage init() {
		if (isInited) return (UIPackage)EPackage.Registry.INSTANCE.getEPackage(UIPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUIPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UIPackageImpl theUIPackage = registeredUIPackage instanceof UIPackageImpl ? (UIPackageImpl)registeredUIPackage : new UIPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		MimoPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI);
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
		theUIPackage.createPackageContents();
		theFormPackage.createPackageContents();
		theMenuPackage.createPackageContents();
		theQueryPackage.createPackageContents();
		theSchemaPackage.createPackageContents();
		theToolbarPackage.createPackageContents();

		// Initialize created meta-data
		theUIPackage.initializePackageContents();
		theFormPackage.initializePackageContents();
		theMenuPackage.initializePackageContents();
		theQueryPackage.initializePackageContents();
		theSchemaPackage.initializePackageContents();
		theToolbarPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUIPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UIPackage.eNS_URI, theUIPackage);
		return theUIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Command() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Type() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataNode() {
		return dataNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataNode_Icon() {
		return (EAttribute)dataNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataNode_Id() {
		return (EAttribute)dataNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataNode_Key() {
		return (EAttribute)dataNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataNode_Value() {
		return (EAttribute)dataNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUiFrameSetup() {
		return uiFrameSetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUiFrameSetup_ContextMenu() {
		return (EAttribute)uiFrameSetupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUiFrameSetup_Name() {
		return (EAttribute)uiFrameSetupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUiFrameSetup_Icon() {
		return (EAttribute)uiFrameSetupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUiUserSetup() {
		return uiUserSetupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUiUserSetup_Name() {
		return (EAttribute)uiUserSetupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getView_Disabled() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getView_Domain() {
		return (EReference)viewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getView_Icon() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getView_Label() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getView_Name() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getView_Pattern() {
		return (EReference)viewEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewPattern() {
		return viewPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViewPattern_Allow() {
		return (EAttribute)viewPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViewPattern_Mask() {
		return (EAttribute)viewPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewCheckBox() {
		return viewCheckBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViewCheckBox_View() {
		return (EAttribute)viewCheckBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewComboBox() {
		return viewComboBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViewComboBox_View() {
		return (EAttribute)viewComboBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewCounter() {
		return viewCounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViewCounter_View() {
		return (EAttribute)viewCounterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewDatePicker() {
		return viewDatePickerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViewDatePicker_View() {
		return (EAttribute)viewDatePickerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewForm() {
		return viewFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViewForm_View() {
		return (EAttribute)viewFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewImage() {
		return viewImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViewImage_View() {
		return (EAttribute)viewImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewNote() {
		return viewNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViewNote_View() {
		return (EAttribute)viewNoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewNumber() {
		return viewNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViewNumber_View() {
		return (EAttribute)viewNumberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViewNumber_Placeholder() {
		return (EAttribute)viewNumberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewNumber_Attributes() {
		return (EReference)viewNumberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewNumberAttribute() {
		return viewNumberAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViewNumberAttribute_Maxlength() {
		return (EAttribute)viewNumberAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewText() {
		return viewTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViewText_View() {
		return (EAttribute)viewTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViewText_Placeholder() {
		return (EAttribute)viewTextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewText_Attributes() {
		return (EReference)viewTextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewTextAttribute() {
		return viewTextAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViewTextAttribute_Maxlength() {
		return (EAttribute)viewTextAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getActionType() {
		return actionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getViewType() {
		return viewTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UIFactory getUIFactory() {
		return (UIFactory)getEFactoryInstance();
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
		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__COMMAND);
		createEAttribute(actionEClass, ACTION__TYPE);

		dataNodeEClass = createEClass(DATA_NODE);
		createEAttribute(dataNodeEClass, DATA_NODE__ICON);
		createEAttribute(dataNodeEClass, DATA_NODE__ID);
		createEAttribute(dataNodeEClass, DATA_NODE__KEY);
		createEAttribute(dataNodeEClass, DATA_NODE__VALUE);

		uiFrameSetupEClass = createEClass(UI_FRAME_SETUP);
		createEAttribute(uiFrameSetupEClass, UI_FRAME_SETUP__CONTEXT_MENU);
		createEAttribute(uiFrameSetupEClass, UI_FRAME_SETUP__NAME);
		createEAttribute(uiFrameSetupEClass, UI_FRAME_SETUP__ICON);

		uiUserSetupEClass = createEClass(UI_USER_SETUP);
		createEAttribute(uiUserSetupEClass, UI_USER_SETUP__NAME);

		viewEClass = createEClass(VIEW);
		createEAttribute(viewEClass, VIEW__DISABLED);
		createEReference(viewEClass, VIEW__DOMAIN);
		createEAttribute(viewEClass, VIEW__ICON);
		createEAttribute(viewEClass, VIEW__LABEL);
		createEAttribute(viewEClass, VIEW__NAME);
		createEReference(viewEClass, VIEW__PATTERN);

		viewPatternEClass = createEClass(VIEW_PATTERN);
		createEAttribute(viewPatternEClass, VIEW_PATTERN__ALLOW);
		createEAttribute(viewPatternEClass, VIEW_PATTERN__MASK);

		viewCheckBoxEClass = createEClass(VIEW_CHECK_BOX);
		createEAttribute(viewCheckBoxEClass, VIEW_CHECK_BOX__VIEW);

		viewComboBoxEClass = createEClass(VIEW_COMBO_BOX);
		createEAttribute(viewComboBoxEClass, VIEW_COMBO_BOX__VIEW);

		viewCounterEClass = createEClass(VIEW_COUNTER);
		createEAttribute(viewCounterEClass, VIEW_COUNTER__VIEW);

		viewDatePickerEClass = createEClass(VIEW_DATE_PICKER);
		createEAttribute(viewDatePickerEClass, VIEW_DATE_PICKER__VIEW);

		viewFormEClass = createEClass(VIEW_FORM);
		createEAttribute(viewFormEClass, VIEW_FORM__VIEW);

		viewImageEClass = createEClass(VIEW_IMAGE);
		createEAttribute(viewImageEClass, VIEW_IMAGE__VIEW);

		viewNoteEClass = createEClass(VIEW_NOTE);
		createEAttribute(viewNoteEClass, VIEW_NOTE__VIEW);

		viewNumberEClass = createEClass(VIEW_NUMBER);
		createEAttribute(viewNumberEClass, VIEW_NUMBER__VIEW);
		createEReference(viewNumberEClass, VIEW_NUMBER__ATTRIBUTES);
		createEAttribute(viewNumberEClass, VIEW_NUMBER__PLACEHOLDER);

		viewNumberAttributeEClass = createEClass(VIEW_NUMBER_ATTRIBUTE);
		createEAttribute(viewNumberAttributeEClass, VIEW_NUMBER_ATTRIBUTE__MAXLENGTH);

		viewTextEClass = createEClass(VIEW_TEXT);
		createEAttribute(viewTextEClass, VIEW_TEXT__VIEW);
		createEAttribute(viewTextEClass, VIEW_TEXT__PLACEHOLDER);
		createEReference(viewTextEClass, VIEW_TEXT__ATTRIBUTES);

		viewTextAttributeEClass = createEClass(VIEW_TEXT_ATTRIBUTE);
		createEAttribute(viewTextAttributeEClass, VIEW_TEXT_ATTRIBUTE__MAXLENGTH);

		// Create enums
		actionTypeEEnum = createEEnum(ACTION_TYPE);
		viewTypeEEnum = createEEnum(VIEW_TYPE);
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
		FormPackage theFormPackage = (FormPackage)EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI);
		MenuPackage theMenuPackage = (MenuPackage)EPackage.Registry.INSTANCE.getEPackage(MenuPackage.eNS_URI);
		QueryPackage theQueryPackage = (QueryPackage)EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI);
		SchemaPackage theSchemaPackage = (SchemaPackage)EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI);
		ToolbarPackage theToolbarPackage = (ToolbarPackage)EPackage.Registry.INSTANCE.getEPackage(ToolbarPackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theFormPackage);
		getESubpackages().add(theMenuPackage);
		getESubpackages().add(theQueryPackage);
		getESubpackages().add(theSchemaPackage);
		getESubpackages().add(theToolbarPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actionEClass.getESuperTypes().add(theEntityPackage.getEntity());
		dataNodeEClass.getESuperTypes().add(theEntityPackage.getEntity());
		uiFrameSetupEClass.getESuperTypes().add(theEntityPackage.getEntityIdentifiable());
		uiUserSetupEClass.getESuperTypes().add(theEntityPackage.getEntityIdentifiable());
		viewEClass.getESuperTypes().add(theEntityPackage.getEntity());
		viewPatternEClass.getESuperTypes().add(theEntityPackage.getEntity());
		viewCheckBoxEClass.getESuperTypes().add(this.getView());
		viewComboBoxEClass.getESuperTypes().add(this.getView());
		viewCounterEClass.getESuperTypes().add(this.getView());
		viewDatePickerEClass.getESuperTypes().add(this.getView());
		viewFormEClass.getESuperTypes().add(this.getView());
		viewImageEClass.getESuperTypes().add(this.getView());
		viewNoteEClass.getESuperTypes().add(this.getView());
		viewNumberEClass.getESuperTypes().add(this.getView());
		viewNumberAttributeEClass.getESuperTypes().add(theEntityPackage.getEntity());
		viewTextEClass.getESuperTypes().add(this.getView());
		viewTextAttributeEClass.getESuperTypes().add(theEntityPackage.getEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Command(), ecorePackage.getEString(), "command", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Type(), this.getActionType(), "type", null, 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataNodeEClass, DataNode.class, "DataNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataNode_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, DataNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataNode_Id(), ecorePackage.getEString(), "id", null, 0, 1, DataNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataNode_Key(), ecorePackage.getEString(), "key", null, 0, 1, DataNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataNode_Value(), ecorePackage.getEString(), "value", null, 0, 1, DataNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiFrameSetupEClass, UiFrameSetup.class, "UiFrameSetup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiFrameSetup_ContextMenu(), ecorePackage.getEBoolean(), "contextMenu", null, 0, 1, UiFrameSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiFrameSetup_Name(), ecorePackage.getEString(), "name", null, 1, 1, UiFrameSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUiFrameSetup_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, UiFrameSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiUserSetupEClass, UiUserSetup.class, "UiUserSetup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUiUserSetup_Name(), ecorePackage.getEString(), "name", null, 1, 1, UiUserSetup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewEClass, View.class, "View", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getView_Disabled(), ecorePackage.getEBoolean(), "disabled", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getView_Domain(), theEntityPackage.getDomain(), null, "domain", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_Label(), ecorePackage.getEString(), "label", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getView_Name(), ecorePackage.getEString(), "name", null, 1, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getView_Pattern(), this.getViewPattern(), null, "pattern", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(viewEClass, this.getViewType(), "getView", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(viewPatternEClass, ViewPattern.class, "ViewPattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewPattern_Allow(), ecorePackage.getEString(), "allow", null, 0, 1, ViewPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewPattern_Mask(), ecorePackage.getEString(), "mask", null, 0, 1, ViewPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewCheckBoxEClass, ViewCheckBox.class, "ViewCheckBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewCheckBox_View(), this.getViewType(), "view", "checkbox", 1, 1, ViewCheckBox.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewComboBoxEClass, ViewComboBox.class, "ViewComboBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewComboBox_View(), this.getViewType(), "view", "mm-combo", 1, 1, ViewComboBox.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewCounterEClass, ViewCounter.class, "ViewCounter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewCounter_View(), this.getViewType(), "view", "counter", 1, 1, ViewCounter.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewDatePickerEClass, ViewDatePicker.class, "ViewDatePicker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewDatePicker_View(), this.getViewType(), "view", "datepicker", 1, 1, ViewDatePicker.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewFormEClass, ViewForm.class, "ViewForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewForm_View(), this.getViewType(), "view", "form", 1, 1, ViewForm.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewImageEClass, ViewImage.class, "ViewImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewImage_View(), this.getViewType(), "view", "mm-image", 1, 1, ViewImage.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewNoteEClass, ViewNote.class, "ViewNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewNote_View(), this.getViewType(), "view", "note", 1, 1, ViewNote.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewNumberEClass, ViewNumber.class, "ViewNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewNumber_View(), this.getViewType(), "view", "text", 1, 1, ViewNumber.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewNumber_Attributes(), this.getViewNumberAttribute(), null, "attributes", null, 0, 1, ViewNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewNumber_Placeholder(), ecorePackage.getEString(), "placeholder", null, 0, 1, ViewNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewNumberAttributeEClass, ViewNumberAttribute.class, "ViewNumberAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewNumberAttribute_Maxlength(), ecorePackage.getEInt(), "maxlength", null, 0, 1, ViewNumberAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewTextEClass, ViewText.class, "ViewText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewText_View(), this.getViewType(), "view", "text", 1, 1, ViewText.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewText_Placeholder(), ecorePackage.getEString(), "placeholder", "Insert text here", 0, 1, ViewText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewText_Attributes(), this.getViewTextAttribute(), null, "attributes", null, 0, 1, ViewText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewTextAttributeEClass, ViewTextAttribute.class, "ViewTextAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewTextAttribute_Maxlength(), ecorePackage.getEInt(), "maxlength", null, 0, 1, ViewTextAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(actionTypeEEnum, ActionType.class, "ActionType");
		addEEnumLiteral(actionTypeEEnum, ActionType.USER_INTERFACE);
		addEEnumLiteral(actionTypeEEnum, ActionType.SERVICE);
		addEEnumLiteral(actionTypeEEnum, ActionType.EVENT);

		initEEnum(viewTypeEEnum, ViewType.class, "ViewType");
		addEEnumLiteral(viewTypeEEnum, ViewType.CHECK_BOX);
		addEEnumLiteral(viewTypeEEnum, ViewType.COMBO_BOX);
		addEEnumLiteral(viewTypeEEnum, ViewType.COUNTER);
		addEEnumLiteral(viewTypeEEnum, ViewType.DATE_PICKER);
		addEEnumLiteral(viewTypeEEnum, ViewType.FORM);
		addEEnumLiteral(viewTypeEEnum, ViewType.IMAGE);
		addEEnumLiteral(viewTypeEEnum, ViewType.NOTE);
		addEEnumLiteral(viewTypeEEnum, ViewType.TEXT);

		// Create resource
		createResource(eNS_URI);
	}

} //UIPackageImpl
