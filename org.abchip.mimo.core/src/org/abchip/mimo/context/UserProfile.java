/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.context;

import org.abchip.mimo.entity.EntityIdentifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.context.UserProfile#getJobDescription <em>Job Description</em>}</li>
 *   <li>{@link org.abchip.mimo.context.UserProfile#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.context.UserProfile#getText <em>Text</em>}</li>
 *   <li>{@link org.abchip.mimo.context.UserProfile#getUserClass <em>User Class</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.context.ContextPackage#getUserProfile()
 * @model
 * @generated
 */
public interface UserProfile extends EntityIdentifiable {
	/**
	 * Returns the value of the '<em><b>Job Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Description</em>' attribute.
	 * @see #setJobDescription(String)
	 * @see org.abchip.mimo.context.ContextPackage#getUserProfile_JobDescription()
	 * @model
	 * @generated
	 */
	String getJobDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.UserProfile#getJobDescription <em>Job Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Description</em>' attribute.
	 * @see #getJobDescription()
	 * @generated
	 */
	void setJobDescription(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.abchip.mimo.context.ContextPackage#getUserProfile_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.UserProfile#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.abchip.mimo.context.ContextPackage#getUserProfile_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.UserProfile#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>User Class</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.context.UserClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Class</em>' attribute.
	 * @see org.abchip.mimo.context.UserClass
	 * @see #setUserClass(UserClass)
	 * @see org.abchip.mimo.context.ContextPackage#getUserProfile_UserClass()
	 * @model required="true" derived="true"
	 * @generated
	 */
	UserClass getUserClass();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.UserProfile#getUserClass <em>User Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Class</em>' attribute.
	 * @see org.abchip.mimo.context.UserClass
	 * @see #getUserClass()
	 * @generated
	 */
	void setUserClass(UserClass value);

} // UserProfile
