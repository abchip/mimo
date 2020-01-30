/**
 * Copyright (c) 2017, 2019 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui;

import org.abchip.mimo.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.ui.ViewPattern#getAllow <em>Allow</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.ViewPattern#getMask <em>Mask</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.ui.UIPackage#getViewPattern()
 * @model abstract="true"
 * @generated
 */
public interface ViewPattern extends Entity {
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
	 * @see org.abchip.mimo.ui.UIPackage#getViewPattern_Allow()
	 * @model
	 * @generated
	 */
	String getAllow();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.ViewPattern#getAllow <em>Allow</em>}' attribute.
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
	 * @see org.abchip.mimo.ui.UIPackage#getViewPattern_Mask()
	 * @model
	 * @generated
	 */
	String getMask();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.ViewPattern#getMask <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask</em>' attribute.
	 * @see #getMask()
	 * @generated
	 */
	void setMask(String value);

} // ViewPattern
