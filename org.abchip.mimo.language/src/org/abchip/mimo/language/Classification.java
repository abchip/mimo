/**
 * Copyright (c) 2017, 2018 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.language;

import org.abchip.mimo.entity.EntityNameable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.language.Classification#getScore <em>Score</em>}</li>
 *   <li>{@link org.abchip.mimo.language.Classification#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.language.LanguagePackage#getClassification()
 * @model
 * @generated
 */
public interface Classification<E> {
	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(double)
	 * @see org.abchip.mimo.language.LanguagePackage#getClassification_Score()
	 * @model required="true"
	 * @generated
	 */
	double getScore();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.language.Classification#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(double value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(EntityNameable)
	 * @see org.abchip.mimo.language.LanguagePackage#getClassification_Entity()
	 * @model
	 * @generated
	 */
	EntityNameable getEntity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.language.Classification#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(EntityNameable value);

} // Classification
