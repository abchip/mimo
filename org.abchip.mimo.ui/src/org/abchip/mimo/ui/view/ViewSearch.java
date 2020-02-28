/**
 * Copyright (c) 2017, 2020 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.view;

import org.abchip.mimo.ui.EntryFramed;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.ui.view.ViewSearch#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.ui.view.ViewPackage#getViewSearch()
 * @model
 * @generated
 */
public interface ViewSearch extends View<EntryFramed> {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"mm-search"</code>.
	 * The literals are from the enumeration {@link org.abchip.mimo.ui.view.ViewType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.abchip.mimo.ui.view.ViewType
	 * @see org.abchip.mimo.ui.view.ViewPackage#getViewSearch_Type()
	 * @model default="mm-search" required="true" changeable="false"
	 * @generated
	 */
	ViewType getType();

} // ViewSearch
