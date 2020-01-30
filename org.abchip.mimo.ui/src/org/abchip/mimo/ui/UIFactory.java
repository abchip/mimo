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
	 * Returns a new object of class '<em>View Check Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Check Box</em>'.
	 * @generated
	 */
	ViewCheckBox createViewCheckBox();

	/**
	 * Returns a new object of class '<em>View Combo Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Combo Box</em>'.
	 * @generated
	 */
	ViewComboBox createViewComboBox();

	/**
	 * Returns a new object of class '<em>View Counter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Counter</em>'.
	 * @generated
	 */
	ViewCounter createViewCounter();

	/**
	 * Returns a new object of class '<em>View Date Picker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Date Picker</em>'.
	 * @generated
	 */
	ViewDatePicker createViewDatePicker();

	/**
	 * Returns a new object of class '<em>View Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Form</em>'.
	 * @generated
	 */
	ViewForm createViewForm();

	/**
	 * Returns a new object of class '<em>View Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Image</em>'.
	 * @generated
	 */
	ViewImage createViewImage();

	/**
	 * Returns a new object of class '<em>View Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Note</em>'.
	 * @generated
	 */
	ViewNote createViewNote();

	/**
	 * Returns a new object of class '<em>View Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Number</em>'.
	 * @generated
	 */
	ViewNumber createViewNumber();

	/**
	 * Returns a new object of class '<em>View Number Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Number Attribute</em>'.
	 * @generated
	 */
	ViewNumberAttribute createViewNumberAttribute();

	/**
	 * Returns a new object of class '<em>View Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Text</em>'.
	 * @generated
	 */
	ViewText createViewText();

	/**
	 * Returns a new object of class '<em>View Text Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Text Attribute</em>'.
	 * @generated
	 */
	ViewTextAttribute createViewTextAttribute();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UIPackage getUIPackage();

} //UIFactory
