/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.logic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.logic.Question#getObject <em>Object</em>}</li>
 *   <li>{@link org.abchip.mimo.logic.Question#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.abchip.mimo.logic.Question#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.abchip.mimo.logic.Question#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.logic.LogicPackage#getQuestion()
 * @model
 * @generated
 */
public interface Question {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(Term)
	 * @see org.abchip.mimo.logic.LogicPackage#getQuestion_Object()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Term getObject();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.logic.Question#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(Term value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Term)
	 * @see org.abchip.mimo.logic.LogicPackage#getQuestion_Subject()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Term getSubject();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.logic.Question#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Term value);

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference.
	 * @see #setRelation(Term)
	 * @see org.abchip.mimo.logic.LogicPackage#getQuestion_Relation()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Term getRelation();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.logic.Question#getRelation <em>Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' containment reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(Term value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(Term)
	 * @see org.abchip.mimo.logic.LogicPackage#getQuestion_Rule()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Term getRule();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.logic.Question#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Term value);

} // Question
