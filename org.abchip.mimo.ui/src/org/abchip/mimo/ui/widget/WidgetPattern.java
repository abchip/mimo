/**
 * Copyright (c) 2017, 2020 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.widget;

import org.abchip.mimo.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.ui.widget.WidgetPattern#getAllow <em>Allow</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.widget.WidgetPattern#getMask <em>Mask</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.ui.widget.WidgetPackage#getWidgetPattern()
 * @model abstract="true"
 * @generated
 */
public interface WidgetPattern extends Entity {
	/**
	 * Returns the value of the '<em><b>Allow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow</em>' attribute.
	 * @see #setAllow(String)
	 * @see org.abchip.mimo.ui.widget.WidgetPackage#getWidgetPattern_Allow()
	 * @model
	 * @generated
	 */
	String getAllow();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.widget.WidgetPattern#getAllow <em>Allow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow</em>' attribute.
	 * @see #getAllow()
	 * @generated
	 */
	void setAllow(String value);

	/**
	 * Returns the value of the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mask</em>' attribute.
	 * @see #setMask(String)
	 * @see org.abchip.mimo.ui.widget.WidgetPackage#getWidgetPattern_Mask()
	 * @model
	 * @generated
	 */
	String getMask();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.widget.WidgetPattern#getMask <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask</em>' attribute.
	 * @see #getMask()
	 * @generated
	 */
	void setMask(String value);

} // WidgetPattern
