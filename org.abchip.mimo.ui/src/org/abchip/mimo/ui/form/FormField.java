/**
 * Copyright (c) 2017, 2021 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.form;

import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.ui.widget.Widget;

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
 *   <li>{@link org.abchip.mimo.ui.form.FormField#getGroup <em>Group</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.form.FormField#isKey <em>Key</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.form.FormField#isTopSplit <em>Top Split</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.form.FormField#getWidget <em>Widget</em>}</li>
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
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see org.abchip.mimo.ui.form.FormPackage#getFormField_Group()
	 * @model
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.form.FormField#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(boolean)
	 * @see org.abchip.mimo.ui.form.FormPackage#getFormField_Key()
	 * @model
	 * @generated
	 */
	boolean isKey();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.form.FormField#isKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #isKey()
	 * @generated
	 */
	void setKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Top Split</b></em>' attribute.
	 * <!-- begin-user-doc -->
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
	 * Returns the value of the '<em><b>Widget</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widget</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widget</em>' containment reference.
	 * @see #setWidget(Widget)
	 * @see org.abchip.mimo.ui.form.FormPackage#getFormField_Widget()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	Widget getWidget();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.form.FormField#getWidget <em>Widget</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Widget</em>' containment reference.
	 * @see #getWidget()
	 * @generated
	 */
	void setWidget(Widget value);

} // FormField
