/**
 * Copyright (c) 2017, 2019 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.form;

import org.abchip.mimo.entity.Domain;
import org.abchip.mimo.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.ui.form.FormField#isContextMenu <em>Context Menu</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.form.FormField#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.form.FormField#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.form.FormField#getLabel <em>Label</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.form.FormField#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.form.FormField#getView <em>View</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.form.FormField#isTopSplit <em>Top Split</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.form.FormField#isDisabled <em>Disabled</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.ui.form.FormPackage#getFormField()
 * @model
 * @generated
 */
public interface FormField extends Entity {
	/**
	 * Returns the value of the '<em><b>Context Menu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Menu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Menu</em>' attribute.
	 * @see #setContextMenu(boolean)
	 * @see org.abchip.mimo.ui.form.FormPackage#getFormField_ContextMenu()
	 * @model annotation="mimo-ent frame='frame'"
	 * @generated
	 */
	boolean isContextMenu();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.form.FormField#isContextMenu <em>Context Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Menu</em>' attribute.
	 * @see #isContextMenu()
	 * @generated
	 */
	void setContextMenu(boolean value);

	/**
	 * Returns the value of the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' attribute.
	 * @see #setView(String)
	 * @see org.abchip.mimo.ui.form.FormPackage#getFormField_View()
	 * @model required="true"
	 * @generated
	 */
	String getView();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.form.FormField#getView <em>View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' attribute.
	 * @see #getView()
	 * @generated
	 */
	void setView(String value);

	/**
	 * Returns the value of the '<em><b>Top Split</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Split</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Split</em>' attribute.
	 * @see #setTopSplit(boolean)
	 * @see org.abchip.mimo.ui.form.FormPackage#getFormField_TopSplit()
	 * @model
	 * @generated
	 */
	boolean isTopSplit();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.form.FormField#isTopSplit <em>Top Split</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Split</em>' attribute.
	 * @see #isTopSplit()
	 * @generated
	 */
	void setTopSplit(boolean value);

	/**
	 * Returns the value of the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabled</em>' attribute.
	 * @see #setDisabled(boolean)
	 * @see org.abchip.mimo.ui.form.FormPackage#getFormField_Disabled()
	 * @model
	 * @generated
	 */
	boolean isDisabled();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.form.FormField#isDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled</em>' attribute.
	 * @see #isDisabled()
	 * @generated
	 */
	void setDisabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.abchip.mimo.ui.form.FormPackage#getFormField_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.form.FormField#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.abchip.mimo.ui.form.FormPackage#getFormField_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.form.FormField#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see #setDomain(Domain)
	 * @see org.abchip.mimo.ui.form.FormPackage#getFormField_Domain()
	 * @model containment="true"
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.form.FormField#getDomain <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' containment reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see org.abchip.mimo.ui.form.FormPackage#getFormField_Icon()
	 * @model
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.form.FormField#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

} // FormField
