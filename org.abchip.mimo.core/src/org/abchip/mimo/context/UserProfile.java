/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.context;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.context.UserProfile#getJobDescriptionId <em>Job Description Id</em>}</li>
 *   <li>{@link org.abchip.mimo.context.UserProfile#getUserClass <em>User Class</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.context.ContextPackage#getUserProfile()
 * @model abstract="true"
 * @generated
 */
public interface UserProfile extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Job Description Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Description Id</em>' attribute.
	 * @see #setJobDescriptionId(String)
	 * @see org.abchip.mimo.context.ContextPackage#getUserProfile_JobDescriptionId()
	 * @model
	 * @generated
	 */
	String getJobDescriptionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.UserProfile#getJobDescriptionId <em>Job Description Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Description Id</em>' attribute.
	 * @see #getJobDescriptionId()
	 * @generated
	 */
	void setJobDescriptionId(String value);

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
