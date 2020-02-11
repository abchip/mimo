/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.employment;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pay Grade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.PayGrade#getPayGradeId <em>Pay Grade Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.PayGrade#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.PayGrade#getPayGradeName <em>Pay Grade Name</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getPayGrade()
 * @model
 * @generated
 */
public interface PayGrade extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getPayGrade_Comments()
	 * @model annotation="mimo-ent-format type='comment' length='255'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.PayGrade#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Pay Grade Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pay Grade Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pay Grade Id</em>' attribute.
	 * @see #setPayGradeId(String)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getPayGrade_PayGradeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPayGradeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.PayGrade#getPayGradeId <em>Pay Grade Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pay Grade Id</em>' attribute.
	 * @see #getPayGradeId()
	 * @generated
	 */
	void setPayGradeId(String value);

	/**
	 * Returns the value of the '<em><b>Pay Grade Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pay Grade Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pay Grade Name</em>' attribute.
	 * @see #setPayGradeName(String)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getPayGrade_PayGradeName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getPayGradeName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.PayGrade#getPayGradeName <em>Pay Grade Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pay Grade Name</em>' attribute.
	 * @see #getPayGradeName()
	 * @generated
	 */
	void setPayGradeName(String value);

} // PayGrade
