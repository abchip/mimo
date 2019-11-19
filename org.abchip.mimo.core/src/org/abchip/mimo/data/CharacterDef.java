/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.data.CharacterDef#getLength <em>Length</em>}</li>
 *   <li>{@link org.abchip.mimo.data.CharacterDef#isVarying <em>Varying</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.data.DataPackage#getCharacterDef()
 * @model superTypes="org.abchip.mimo.data.DataDef&lt;org.eclipse.emf.ecore.EString&gt;"
 * @generated
 */
public interface CharacterDef extends DataDef<String> {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see org.abchip.mimo.data.DataPackage#getCharacterDef_Length()
	 * @model required="true"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.data.CharacterDef#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>Varying</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Varying</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varying</em>' attribute.
	 * @see #setVarying(boolean)
	 * @see org.abchip.mimo.data.DataPackage#getCharacterDef_Varying()
	 * @model
	 * @generated
	 */
	boolean isVarying();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.data.CharacterDef#isVarying <em>Varying</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Varying</em>' attribute.
	 * @see #isVarying()
	 * @generated
	 */
	void setVarying(boolean value);

} // CharacterDef
