/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.enum_;

import java.util.List;
import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.biz.security.login.UserLoginSecurityQuestion;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.enum_.Enumeration#getEnumId <em>Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.enum_.Enumeration#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.enum_.Enumeration#getEnumCode <em>Enum Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.enum_.Enumeration#getEnumTypeId <em>Enum Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.enum_.Enumeration#getSequenceId <em>Sequence Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.enum_.Enumeration#getUserLoginSecurityQuestions <em>User Login Security Questions</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.enum_.EnumPackage#getEnumeration()
 * @model annotation="mimo-ent-frame dictionary='CommonEntityLabels' formula='description'"
 * @generated
 */
public interface Enumeration extends BizEntityTyped<EnumerationType> {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.common.enum_.EnumPackage#getEnumeration_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Enum Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Code</em>' attribute.
	 * @see #setEnumCode(String)
	 * @see org.abchip.mimo.biz.common.enum_.EnumPackage#getEnumeration_EnumCode()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getEnumCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#getEnumCode <em>Enum Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Code</em>' attribute.
	 * @see #getEnumCode()
	 * @generated
	 */
	void setEnumCode(String value);

	/**
	 * Returns the value of the '<em><b>Sequence Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Id</em>' attribute.
	 * @see #setSequenceId(String)
	 * @see org.abchip.mimo.biz.common.enum_.EnumPackage#getEnumeration_SequenceId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSequenceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#getSequenceId <em>Sequence Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Id</em>' attribute.
	 * @see #getSequenceId()
	 * @generated
	 */
	void setSequenceId(String value);

	/**
	 * Returns the value of the '<em><b>User Login Security Questions</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.security.login.UserLoginSecurityQuestion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Login Security Questions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Login Security Questions</em>' reference list.
	 * @see org.abchip.mimo.biz.common.enum_.EnumPackage#getEnumeration_UserLoginSecurityQuestions()
	 * @model derived="true"
	 * @generated
	 */
	List<UserLoginSecurityQuestion> getUserLoginSecurityQuestions();

	/**
	 * Returns the value of the '<em><b>Enum Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Type Id</em>' reference.
	 * @see #setEnumTypeId(EnumerationType)
	 * @see org.abchip.mimo.biz.common.enum_.EnumPackage#getEnumeration_EnumTypeId()
	 * @model keys="enumTypeId"
	 * @generated
	 */
	EnumerationType getEnumTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#getEnumTypeId <em>Enum Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Type Id</em>' reference.
	 * @see #getEnumTypeId()
	 * @generated
	 */
	void setEnumTypeId(EnumerationType value);

	/**
	 * Returns the value of the '<em><b>Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Id</em>' attribute.
	 * @see #setEnumId(String)
	 * @see org.abchip.mimo.biz.common.enum_.EnumPackage#getEnumeration_EnumId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#getEnumId <em>Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Id</em>' attribute.
	 * @see #getEnumId()
	 * @generated
	 */
	void setEnumId(String value);

} // Enumeration
