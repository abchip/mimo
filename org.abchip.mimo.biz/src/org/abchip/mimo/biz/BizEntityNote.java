/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biz Entity Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.BizEntityNote#getNoteId <em>Note Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.BizPackage#getBizEntityNote()
 * @model abstract="true"
 * @generated
 */
public interface BizEntityNote extends BizEntity {

	/**
	 * Returns the value of the '<em><b>Note Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Id</em>' attribute.
	 * @see #setNoteId(String)
	 * @see org.abchip.mimo.biz.BizPackage#getBizEntityNote_NoteId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getNoteId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.BizEntityNote#getNoteId <em>Note Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note Id</em>' attribute.
	 * @see #getNoteId()
	 * @generated
	 */
	void setNoteId(String value);
} // BizEntityNote
