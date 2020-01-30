/**
 * Copyright (c) 2017, 2019 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.ui.UIPackage
 * @generated
 */
public interface UIFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UIFactory eINSTANCE = org.abchip.mimo.ui.impl.UIFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Ui Frame Setup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Frame Setup</em>'.
	 * @generated
	 */
	UiFrameSetup createUiFrameSetup();

	/**
	 * Returns a new object of class '<em>Ui User Setup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui User Setup</em>'.
	 * @generated
	 */
	UiUserSetup createUiUserSetup();

	/**
	 * Returns a new object of class '<em>Widget Check Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Widget Check Box</em>'.
	 * @generated
	 */
	WidgetCheckBox createWidgetCheckBox();

	/**
	 * Returns a new object of class '<em>Widget Combo Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Widget Combo Box</em>'.
	 * @generated
	 */
	WidgetComboBox createWidgetComboBox();

	/**
	 * Returns a new object of class '<em>Widget Counter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Widget Counter</em>'.
	 * @generated
	 */
	WidgetCounter createWidgetCounter();

	/**
	 * Returns a new object of class '<em>Widget Date Picker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Widget Date Picker</em>'.
	 * @generated
	 */
	WidgetDatePicker createWidgetDatePicker();

	/**
	 * Returns a new object of class '<em>Widget Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Widget Form</em>'.
	 * @generated
	 */
	WidgetForm createWidgetForm();

	/**
	 * Returns a new object of class '<em>Widget Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Widget Image</em>'.
	 * @generated
	 */
	WidgetImage createWidgetImage();

	/**
	 * Returns a new object of class '<em>Widget Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Widget Note</em>'.
	 * @generated
	 */
	WidgetNote createWidgetNote();

	/**
	 * Returns a new object of class '<em>Widget Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Widget Number</em>'.
	 * @generated
	 */
	WidgetNumber createWidgetNumber();

	/**
	 * Returns a new object of class '<em>Widget Number Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Widget Number Attribute</em>'.
	 * @generated
	 */
	WidgetNumberAttribute createWidgetNumberAttribute();

	/**
	 * Returns a new object of class '<em>Widget Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Widget Text</em>'.
	 * @generated
	 */
	WidgetText createWidgetText();

	/**
	 * Returns a new object of class '<em>Widget Text Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Widget Text Attribute</em>'.
	 * @generated
	 */
	WidgetTextAttribute createWidgetTextAttribute();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UIPackage getUIPackage();

} //UIFactory
