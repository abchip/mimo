/**
 * Copyright (c) 2017, 2019 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.menu;

import java.util.List;

import org.abchip.mimo.entity.EntityNameable;

import org.abchip.mimo.ui.schema.DataNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.ui.menu.Menu#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.ui.menu.MenuPackage#getMenu()
 * @model
 * @generated
 */
public interface Menu extends EntityNameable, DataNode {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.ui.schema.DataNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see org.abchip.mimo.ui.menu.MenuPackage#getMenu_Data()
	 * @model containment="true"
	 * @generated
	 */
	List<DataNode> getData();

} // Menu
