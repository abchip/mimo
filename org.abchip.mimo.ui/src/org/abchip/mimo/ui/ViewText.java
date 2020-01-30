/**
 * Copyright (c) 2017, 2019 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.ui.ViewText#getView <em>View</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.ViewText#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.ViewText#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.ui.UIPackage#getViewText()
 * @model
 * @generated
 */
public interface ViewText extends View {

	/**
	 * Returns the value of the '<em><b>View</b></em>' attribute.
	 * The default value is <code>"text"</code>.
	 * The literals are from the enumeration {@link org.abchip.mimo.ui.ViewType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' attribute.
	 * @see org.abchip.mimo.ui.ViewType
	 * @see org.abchip.mimo.ui.UIPackage#getViewText_View()
	 * @model default="text" required="true" changeable="false"
	 * @generated
	 */
	ViewType getView();

	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * The default value is <code>"Insert text here"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placeholder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(String)
	 * @see org.abchip.mimo.ui.UIPackage#getViewText_Placeholder()
	 * @model default="Insert text here"
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.ViewText#getPlaceholder <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' attribute.
	 * @see #getPlaceholder()
	 * @generated
	 */
	void setPlaceholder(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference.
	 * @see #setAttributes(ViewTextAttribute)
	 * @see org.abchip.mimo.ui.UIPackage#getViewText_Attributes()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	ViewTextAttribute getAttributes();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.ViewText#getAttributes <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' containment reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(ViewTextAttribute value);
} // ViewText
