/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.enum_.impl;

import java.util.List;
import org.abchip.mimo.biz.common.enum_.EnumPackage;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.enum_.EnumerationType;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.security.login.UserLoginSecurityQuestion;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.enum_.impl.EnumerationImpl#getEnumId <em>Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.enum_.impl.EnumerationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.enum_.impl.EnumerationImpl#getEnumCode <em>Enum Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.enum_.impl.EnumerationImpl#getEnumTypeId <em>Enum Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.enum_.impl.EnumerationImpl#getSequenceId <em>Sequence Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.enum_.impl.EnumerationImpl#getUserLoginSecurityQuestions <em>User Login Security Questions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationImpl extends BizEntityTypedImpl<EnumerationType> implements Enumeration {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnumPackage.Literals.ENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(EnumPackage.Literals.ENUMERATION__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(EnumPackage.Literals.ENUMERATION__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnumCode() {
		return (String)eGet(EnumPackage.Literals.ENUMERATION__ENUM_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnumCode(String newEnumCode) {
		eSet(EnumPackage.Literals.ENUMERATION__ENUM_CODE, newEnumCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSequenceId() {
		return (String)eGet(EnumPackage.Literals.ENUMERATION__SEQUENCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceId(String newSequenceId) {
		eSet(EnumPackage.Literals.ENUMERATION__SEQUENCE_ID, newSequenceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<UserLoginSecurityQuestion> getUserLoginSecurityQuestions() {
		return (List<UserLoginSecurityQuestion>)eGet(EnumPackage.Literals.ENUMERATION__USER_LOGIN_SECURITY_QUESTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumerationType getEnumTypeId() {
		return (EnumerationType)eGet(EnumPackage.Literals.ENUMERATION__ENUM_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnumTypeId(EnumerationType newEnumTypeId) {
		eSet(EnumPackage.Literals.ENUMERATION__ENUM_TYPE_ID, newEnumTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnumId() {
		return (String)eGet(EnumPackage.Literals.ENUMERATION__ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnumId(String newEnumId) {
		eSet(EnumPackage.Literals.ENUMERATION__ENUM_ID, newEnumId);
	}

} //EnumerationImpl
