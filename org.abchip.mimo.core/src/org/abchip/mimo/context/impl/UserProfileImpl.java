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
	 * The default value of the '{@link #getJobDescription() <em>Job Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getJobDescription() <em>Job Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobDescription()
	 * @generated
	 * @ordered
	 */
	protected String jobDescription = JOB_DESCRIPTION_EDEFAULT;
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;
	/**
	 * The default value of the '{@link #getUserClass() <em>User Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserClass()
	 * @generated
	 * @ordered
	 */
	protected static final UserClass USER_CLASS_EDEFAULT = UserClass.USER;
	/**
	 * The cached value of the '{@link #getUserClass() <em>User Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserClass()
	 * @generated
	 * @ordered
	 */
	protected UserClass userClass = USER_CLASS_EDEFAULT;
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
		return jobDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobDescription(String newJobDescription) {
		jobDescription = newJobDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserClass getUserClass() {
		return userClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserClass(UserClass newUserClass) {
		userClass = newUserClass == null ? USER_CLASS_EDEFAULT : newUserClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContextPackage.USER_PROFILE__JOB_DESCRIPTION:
				return getJobDescription();
			case ContextPackage.USER_PROFILE__NAME:
				return getName();
			case ContextPackage.USER_PROFILE__TEXT:
				return getText();
			case ContextPackage.USER_PROFILE__USER_CLASS:
				return getUserClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContextPackage.USER_PROFILE__JOB_DESCRIPTION:
				setJobDescription((String)newValue);
				return;
			case ContextPackage.USER_PROFILE__NAME:
				setName((String)newValue);
				return;
			case ContextPackage.USER_PROFILE__TEXT:
				setText((String)newValue);
				return;
			case ContextPackage.USER_PROFILE__USER_CLASS:
				setUserClass((UserClass)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ContextPackage.USER_PROFILE__JOB_DESCRIPTION:
				setJobDescription(JOB_DESCRIPTION_EDEFAULT);
				return;
			case ContextPackage.USER_PROFILE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ContextPackage.USER_PROFILE__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case ContextPackage.USER_PROFILE__USER_CLASS:
				setUserClass(USER_CLASS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ContextPackage.USER_PROFILE__JOB_DESCRIPTION:
				return JOB_DESCRIPTION_EDEFAULT == null ? jobDescription != null : !JOB_DESCRIPTION_EDEFAULT.equals(jobDescription);
			case ContextPackage.USER_PROFILE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ContextPackage.USER_PROFILE__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case ContextPackage.USER_PROFILE__USER_CLASS:
				return userClass != USER_CLASS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (jobDescription: ");
		result.append(jobDescription);
		result.append(", name: ");
		result.append(name);
		result.append(", text: ");
		result.append(text);
		result.append(", userClass: ");
		result.append(userClass);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		text = newText;
	}
} // QUserProfileImpl
