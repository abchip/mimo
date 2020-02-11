/**
 * Copyright (c) 2017, 2020 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.widget;

import org.abchip.mimo.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget Text Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.ui.widget.WidgetTextAttribute#getMaxlength <em>Maxlength</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.ui.widget.WidgetPackage#getWidgetTextAttribute()
 * @model
 * @generated
 */
public interface WidgetTextAttribute extends Entity {
	/**
	 * Returns the value of the '<em><b>Maxlength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maxlength</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maxlength</em>' attribute.
	 * @see #setMaxlength(int)
	 * @see org.abchip.mimo.ui.widget.WidgetPackage#getWidgetTextAttribute_Maxlength()
	 * @model
	 * @generated
	 */
	int getMaxlength();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.widget.WidgetTextAttribute#getMaxlength <em>Maxlength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maxlength</em>' attribute.
	 * @see #getMaxlength()
	 * @generated
	 */
	void setMaxlength(int value);

} // WidgetTextAttribute
