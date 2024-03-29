/**
 * Copyright (c) 2017, 2021 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.widget.impl;

import org.abchip.mimo.ui.widget.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WidgetFactoryImpl extends EFactoryImpl implements WidgetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WidgetFactory init() {
		try {
			WidgetFactory theWidgetFactory = (WidgetFactory)EPackage.Registry.INSTANCE.getEFactory(WidgetPackage.eNS_URI);
			if (theWidgetFactory != null) {
				return theWidgetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WidgetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WidgetPackage.WIDGET_BROWSER: return (EObject)createWidgetBrowser();
			case WidgetPackage.WIDGET_CHECK_BOX: return (EObject)createWidgetCheckBox();
			case WidgetPackage.WIDGET_COMBO_BOX: return (EObject)createWidgetComboBox();
			case WidgetPackage.WIDGET_COMBO_BOX_ENTRY: return (EObject)createWidgetComboBoxEntry();
			case WidgetPackage.WIDGET_COUNTER: return (EObject)createWidgetCounter();
			case WidgetPackage.WIDGET_DASHBOARD: return (EObject)createWidgetDashboard();
			case WidgetPackage.WIDGET_DATE_PICKER: return (EObject)createWidgetDatePicker();
			case WidgetPackage.WIDGET_FORM: return (EObject)createWidgetForm();
			case WidgetPackage.WIDGET_FORM_ENTRY: return (EObject)createWidgetFormEntry();
			case WidgetPackage.WIDGET_IMAGE: return (EObject)createWidgetImage();
			case WidgetPackage.WIDGET_LAYOUT: return (EObject)createWidgetLayout();
			case WidgetPackage.WIDGET_MENU: return (EObject)createWidgetMenu();
			case WidgetPackage.WIDGET_NUMBER: return (EObject)createWidgetNumber();
			case WidgetPackage.WIDGET_NUMBER_ATTRIBUTE: return (EObject)createWidgetNumberAttribute();
			case WidgetPackage.WIDGET_PROPERTY: return (EObject)createWidgetProperty();
			case WidgetPackage.WIDGET_QUERY: return (EObject)createWidgetQuery();
			case WidgetPackage.WIDGE_REVIEW: return (EObject)createWidgeReview();
			case WidgetPackage.WIDGET_SWITCH: return (EObject)createWidgetSwitch();
			case WidgetPackage.WIDGET_TAB: return (EObject)createWidgetTab();
			case WidgetPackage.WIDGET_TABLE: return (EObject)createWidgetTable();
			case WidgetPackage.WIDGET_TEXT: return (EObject)createWidgetText();
			case WidgetPackage.WIDGET_TEXT_ATTRIBUTE: return (EObject)createWidgetTextAttribute();
			case WidgetPackage.WIDGET_TEXT_AREA: return (EObject)createWidgetTextArea();
			case WidgetPackage.WIDGET_TOOLBAR: return (EObject)createWidgetToolbar();
			case WidgetPackage.WIDGET_UPLOADER: return (EObject)createWidgetUploader();
			case WidgetPackage.WIDGET_VIEW: return (EObject)createWidgetView();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case WidgetPackage.WIDGET_TYPE:
				return createWidgetTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case WidgetPackage.WIDGET_TYPE:
				return convertWidgetTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetBrowser createWidgetBrowser() {
		WidgetBrowserImpl widgetBrowser = new WidgetBrowserImpl();
		return widgetBrowser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetCheckBox createWidgetCheckBox() {
		WidgetCheckBoxImpl widgetCheckBox = new WidgetCheckBoxImpl();
		return widgetCheckBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetComboBox createWidgetComboBox() {
		WidgetComboBoxImpl widgetComboBox = new WidgetComboBoxImpl();
		return widgetComboBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetComboBoxEntry createWidgetComboBoxEntry() {
		WidgetComboBoxEntryImpl widgetComboBoxEntry = new WidgetComboBoxEntryImpl();
		return widgetComboBoxEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetCounter createWidgetCounter() {
		WidgetCounterImpl widgetCounter = new WidgetCounterImpl();
		return widgetCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetDashboard createWidgetDashboard() {
		WidgetDashboardImpl widgetDashboard = new WidgetDashboardImpl();
		return widgetDashboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetDatePicker createWidgetDatePicker() {
		WidgetDatePickerImpl widgetDatePicker = new WidgetDatePickerImpl();
		return widgetDatePicker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetForm createWidgetForm() {
		WidgetFormImpl widgetForm = new WidgetFormImpl();
		return widgetForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetFormEntry createWidgetFormEntry() {
		WidgetFormEntryImpl widgetFormEntry = new WidgetFormEntryImpl();
		return widgetFormEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetImage createWidgetImage() {
		WidgetImageImpl widgetImage = new WidgetImageImpl();
		return widgetImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetLayout createWidgetLayout() {
		WidgetLayoutImpl widgetLayout = new WidgetLayoutImpl();
		return widgetLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetMenu createWidgetMenu() {
		WidgetMenuImpl widgetMenu = new WidgetMenuImpl();
		return widgetMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetTextArea createWidgetTextArea() {
		WidgetTextAreaImpl widgetTextArea = new WidgetTextAreaImpl();
		return widgetTextArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetNumber createWidgetNumber() {
		WidgetNumberImpl widgetNumber = new WidgetNumberImpl();
		return widgetNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetNumberAttribute createWidgetNumberAttribute() {
		WidgetNumberAttributeImpl widgetNumberAttribute = new WidgetNumberAttributeImpl();
		return widgetNumberAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetProperty createWidgetProperty() {
		WidgetPropertyImpl widgetProperty = new WidgetPropertyImpl();
		return widgetProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetQuery createWidgetQuery() {
		WidgetQueryImpl widgetQuery = new WidgetQueryImpl();
		return widgetQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetSwitch createWidgetSwitch() {
		WidgetSwitchImpl widgetSwitch = new WidgetSwitchImpl();
		return widgetSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetTab createWidgetTab() {
		WidgetTabImpl widgetTab = new WidgetTabImpl();
		return widgetTab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetTable createWidgetTable() {
		WidgetTableImpl widgetTable = new WidgetTableImpl();
		return widgetTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgeReview createWidgeReview() {
		WidgeReviewImpl widgeReview = new WidgeReviewImpl();
		return widgeReview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetText createWidgetText() {
		WidgetTextImpl widgetText = new WidgetTextImpl();
		return widgetText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetTextAttribute createWidgetTextAttribute() {
		WidgetTextAttributeImpl widgetTextAttribute = new WidgetTextAttributeImpl();
		return widgetTextAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetToolbar createWidgetToolbar() {
		WidgetToolbarImpl widgetToolbar = new WidgetToolbarImpl();
		return widgetToolbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetUploader createWidgetUploader() {
		WidgetUploaderImpl widgetUploader = new WidgetUploaderImpl();
		return widgetUploader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetView createWidgetView() {
		WidgetViewImpl widgetView = new WidgetViewImpl();
		return widgetView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetType createWidgetTypeFromString(EDataType eDataType, String initialValue) {
		WidgetType result = WidgetType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWidgetTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WidgetPackage getWidgetPackage() {
		return (WidgetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WidgetPackage getPackage() {
		return WidgetPackage.eINSTANCE;
	}

} //WidgetFactoryImpl
