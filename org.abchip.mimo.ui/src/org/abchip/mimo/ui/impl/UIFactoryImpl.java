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
			case UIPackage.VIEW_CHECK_BOX: return (EObject)createViewCheckBox();
			case UIPackage.VIEW_COMBO_BOX: return (EObject)createViewComboBox();
			case UIPackage.VIEW_COUNTER: return (EObject)createViewCounter();
			case UIPackage.VIEW_DATE_PICKER: return (EObject)createViewDatePicker();
			case UIPackage.VIEW_FORM: return (EObject)createViewForm();
			case UIPackage.VIEW_IMAGE: return (EObject)createViewImage();
			case UIPackage.VIEW_NOTE: return (EObject)createViewNote();
			case UIPackage.VIEW_NUMBER: return (EObject)createViewNumber();
			case UIPackage.VIEW_NUMBER_ATTRIBUTE: return (EObject)createViewNumberAttribute();
			case UIPackage.VIEW_TEXT: return (EObject)createViewText();
			case UIPackage.VIEW_TEXT_ATTRIBUTE: return (EObject)createViewTextAttribute();
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
			case UIPackage.VIEW_TYPE:
				return createViewTypeFromString(eDataType, initialValue);
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
			case UIPackage.VIEW_TYPE:
				return convertViewTypeToString(eDataType, instanceValue);
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
	public ViewCheckBox createViewCheckBox() {
		ViewCheckBoxImpl viewCheckBox = new ViewCheckBoxImpl();
		return viewCheckBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewComboBox createViewComboBox() {
		ViewComboBoxImpl viewComboBox = new ViewComboBoxImpl();
		return viewComboBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewCounter createViewCounter() {
		ViewCounterImpl viewCounter = new ViewCounterImpl();
		return viewCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewDatePicker createViewDatePicker() {
		ViewDatePickerImpl viewDatePicker = new ViewDatePickerImpl();
		return viewDatePicker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewForm createViewForm() {
		ViewFormImpl viewForm = new ViewFormImpl();
		return viewForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewImage createViewImage() {
		ViewImageImpl viewImage = new ViewImageImpl();
		return viewImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewNote createViewNote() {
		ViewNoteImpl viewNote = new ViewNoteImpl();
		return viewNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewNumber createViewNumber() {
		ViewNumberImpl viewNumber = new ViewNumberImpl();
		return viewNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewNumberAttribute createViewNumberAttribute() {
		ViewNumberAttributeImpl viewNumberAttribute = new ViewNumberAttributeImpl();
		return viewNumberAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewText createViewText() {
		ViewTextImpl viewText = new ViewTextImpl();
		return viewText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewTextAttribute createViewTextAttribute() {
		ViewTextAttributeImpl viewTextAttribute = new ViewTextAttributeImpl();
		return viewTextAttribute;
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
	public ViewType createViewTypeFromString(EDataType eDataType, String initialValue) {
		ViewType result = ViewType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertViewTypeToString(EDataType eDataType, Object instanceValue) {
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
