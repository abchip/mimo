/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.webapp.visit;

import java.util.List;

import org.abchip.mimo.biz.BizEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Agent Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.UserAgentType#getUserAgentTypeId <em>User Agent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.UserAgentType#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getUserAgentType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface UserAgentType extends BizEntityType<UserAgent> {
	/**
	 * Returns the value of the '<em><b>User Agent Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Agent Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Agent Type Id</em>' attribute.
	 * @see #setUserAgentTypeId(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getUserAgentType_UserAgentTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getUserAgentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.UserAgentType#getUserAgentTypeId <em>User Agent Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Agent Type Id</em>' attribute.
	 * @see #getUserAgentTypeId()
	 * @generated
	 */
	void setUserAgentTypeId(String value);

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
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getUserAgentType_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.UserAgentType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='UserAgent' route='userAgentTypeId'"
	 * @generated
	 */
	List<String> userAgents();

} // UserAgentType
