/**
 * Copyright (c) 2017, 2019 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget Photo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.ui.WidgetImage#getView <em>View</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.ui.UIPackage#getWidgetImage()
 * @model
 * @generated
 */
public interface WidgetImage extends Widget {

	/**
	 * Returns the value of the '<em><b>View</b></em>' attribute.
	 * The default value is <code>"mm-image"</code>.
	 * The literals are from the enumeration {@link org.abchip.mimo.ui.WidgetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widget</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' attribute.
	 * @see org.abchip.mimo.ui.WidgetType
	 * @see org.abchip.mimo.ui.UIPackage#getWidgetImage_View()
	 * @model default="mm-image" required="true" changeable="false"
	 * @generated
	 */
	WidgetType getView();
} // WidgetImage
