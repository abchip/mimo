/**
 * Copyright (c) 2017, 2019 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.toolbar;

import java.util.List;

import org.abchip.mimo.entity.EntityNameable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Toolbar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.ui.toolbar.Toolbar#getElements <em>Elements</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.toolbar.Toolbar#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.ui.toolbar.ToolbarPackage#getToolbar()
 * @model
 * @generated
 */
public interface Toolbar extends EntityNameable {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.ui.toolbar.ToolbarView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.abchip.mimo.ui.toolbar.ToolbarPackage#getToolbar_Elements()
	 * @model containment="true"
	 * @generated
	 */
	List<ToolbarView> getElements();

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
	 * @see org.abchip.mimo.ui.toolbar.ToolbarPackage#getToolbar_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.toolbar.Toolbar#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Toolbar
