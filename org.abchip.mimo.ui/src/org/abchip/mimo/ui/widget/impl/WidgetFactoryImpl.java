/**
 * Copyright (c) 2017, 2020 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
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
			case WidgetPackage.WIDGET_CHECK_BOX: return (EObject)createWidgetCheckBox();
			case WidgetPackage.WIDGET_COMBO_BOX: return (EObject)createWidgetComboBox();
			case WidgetPackage.WIDGET_COUNTER: return (EObject)createWidgetCounter();
			case WidgetPackage.WIDGETDASHBOARD: return (EObject)createWidgetdashboard();
			case WidgetPackage.WIDGET_DATE_PICKER: return (EObject)createWidgetDatePicker();
			case WidgetPackage.WIDGET_FORM: return (EObject)createWidgetForm();
			case WidgetPackage.WIDGET_IMAGE: return (EObject)createWidgetImage();
			case WidgetPackage.WIDGET_LAYOUT: return (EObject)createWidgetLayout();
			case WidgetPackage.WIDGET_TEXT_AREA: return (EObject)createWidgetTextArea();
			case WidgetPackage.WIDGET_NUMBER: return (EObject)createWidgetNumber();
			case WidgetPackage.WIDGET_NUMBER_ATTRIBUTE: return (EObject)createWidgetNumberAttribute();
			case WidgetPackage.WIDGET_SWITCH: return (EObject)createWidgetSwitch();
			case WidgetPackage.WIDGET_TEXT: return (EObject)createWidgetText();
			case WidgetPackage.WIDGET_TEXT_ATTRIBUTE: return (EObject)createWidgetTextAttribute();
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
	public Widgetdashboard createWidgetdashboard() {
		WidgetdashboardImpl widgetdashboard = new WidgetdashboardImpl();
		return widgetdashboard;
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
