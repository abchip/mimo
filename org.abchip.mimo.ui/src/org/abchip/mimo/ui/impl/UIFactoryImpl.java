/**
 * Copyright (c) 2017, 2019 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.impl;

import org.abchip.mimo.ui.*;

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
public class UIFactoryImpl extends EFactoryImpl implements UIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UIFactory init() {
		try {
			UIFactory theUIFactory = (UIFactory)EPackage.Registry.INSTANCE.getEFactory(UIPackage.eNS_URI);
			if (theUIFactory != null) {
				return theUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIFactoryImpl() {
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
			case UIPackage.ACTION: return (EObject)createAction();
			case UIPackage.UI_FRAME_SETUP: return (EObject)createUiFrameSetup();
			case UIPackage.UI_USER_SETUP: return (EObject)createUiUserSetup();
			case UIPackage.WIDGET_CHECK_BOX: return (EObject)createWidgetCheckBox();
			case UIPackage.WIDGET_COMBO_BOX: return (EObject)createWidgetComboBox();
			case UIPackage.WIDGET_COUNTER: return (EObject)createWidgetCounter();
			case UIPackage.WIDGET_DATE_PICKER: return (EObject)createWidgetDatePicker();
			case UIPackage.WIDGET_FORM: return (EObject)createWidgetForm();
			case UIPackage.WIDGET_IMAGE: return (EObject)createWidgetImage();
			case UIPackage.WIDGET_NOTE: return (EObject)createWidgetNote();
			case UIPackage.WIDGET_NUMBER: return (EObject)createWidgetNumber();
			case UIPackage.WIDGET_NUMBER_ATTRIBUTE: return (EObject)createWidgetNumberAttribute();
			case UIPackage.WIDGET_TEXT: return (EObject)createWidgetText();
			case UIPackage.WIDGET_TEXT_ATTRIBUTE: return (EObject)createWidgetTextAttribute();
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
			case UIPackage.ACTION_TYPE:
				return createActionTypeFromString(eDataType, initialValue);
			case UIPackage.WIDGET_TYPE:
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
			case UIPackage.ACTION_TYPE:
				return convertActionTypeToString(eDataType, instanceValue);
			case UIPackage.WIDGET_TYPE:
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
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UiFrameSetup createUiFrameSetup() {
		UiFrameSetupImpl uiFrameSetup = new UiFrameSetupImpl();
		return uiFrameSetup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UiUserSetup createUiUserSetup() {
		UiUserSetupImpl uiUserSetup = new UiUserSetupImpl();
		return uiUserSetup;
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
	public WidgetNote createWidgetNote() {
		WidgetNoteImpl widgetNote = new WidgetNoteImpl();
		return widgetNote;
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
	public ActionType createActionTypeFromString(EDataType eDataType, String initialValue) {
		ActionType result = ActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	public UIPackage getUIPackage() {
		return (UIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UIPackage getPackage() {
		return UIPackage.eINSTANCE;
	}

} //UIFactoryImpl
