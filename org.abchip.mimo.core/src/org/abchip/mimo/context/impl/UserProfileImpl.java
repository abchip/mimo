/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.context.impl;

import org.abchip.mimo.context.ContextPackage;
import org.abchip.mimo.context.UserClass;
import org.abchip.mimo.context.UserProfile;
import org.abchip.mimo.entity.impl.EntityNameableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>QUser Profile</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.context.impl.UserProfileImpl#getJobDescription <em>Job Description</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.UserProfileImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.UserProfileImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.UserProfileImpl#getUserClass <em>User Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserProfileImpl extends EntityNameableImpl implements UserProfile {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected UserProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.USER_PROFILE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobDescription() {
		return (String)eGet(ContextPackage.Literals.USER_PROFILE__JOB_DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobDescription(String newJobDescription) {
		eSet(ContextPackage.Literals.USER_PROFILE__JOB_DESCRIPTION, newJobDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eGet(ContextPackage.Literals.USER_PROFILE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eSet(ContextPackage.Literals.USER_PROFILE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserClass getUserClass() {
		return (UserClass)eGet(ContextPackage.Literals.USER_PROFILE__USER_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserClass(UserClass newUserClass) {
		eSet(ContextPackage.Literals.USER_PROFILE__USER_CLASS, newUserClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return (String)eGet(ContextPackage.Literals.USER_PROFILE__TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		eSet(ContextPackage.Literals.USER_PROFILE__TEXT, newText);
	}
} // QUserProfileImpl
