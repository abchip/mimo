/**
 * Copyright (c) 2017, 2019 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.widget;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.ui.widget.WidgetForm#getView <em>View</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.ui.widget.WidgetPackage#getWidgetForm()
 * @model
 * @generated
 */
public interface WidgetForm extends Widget {
	/**
	 * Returns the value of the '<em><b>View</b></em>' attribute.
	 * The default value is <code>"form"</code>.
	 * The literals are from the enumeration {@link org.abchip.mimo.ui.widget.WidgetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widget</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' attribute.
	 * @see org.abchip.mimo.ui.widget.WidgetType
	 * @see org.abchip.mimo.ui.widget.WidgetPackage#getWidgetForm_View()
	 * @model default="form" required="true" changeable="false"
	 * @generated
	 */
	WidgetType getView();

} // WidgetForm
