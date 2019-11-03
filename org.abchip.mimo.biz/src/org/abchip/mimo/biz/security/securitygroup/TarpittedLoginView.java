/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.security.securitygroup;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tarpitted Login View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.TarpittedLoginView#getViewNameId <em>View Name Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.TarpittedLoginView#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.TarpittedLoginView#getTarpitReleaseDateTime <em>Tarpit Release Date Time</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.security.securitygroup.SecuritygroupPackage#getTarpittedLoginView()
 * @model
 * @generated
 */
public interface TarpittedLoginView extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Tarpit Release Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tarpit Release Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tarpit Release Date Time</em>' attribute.
	 * @see #setTarpitReleaseDateTime(long)
	 * @see org.abchip.mimo.biz.security.securitygroup.SecuritygroupPackage#getTarpittedLoginView_TarpitReleaseDateTime()
	 * @model
	 * @generated
	 */
	long getTarpitReleaseDateTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.securitygroup.TarpittedLoginView#getTarpitReleaseDateTime <em>Tarpit Release Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tarpit Release Date Time</em>' attribute.
	 * @see #getTarpitReleaseDateTime()
	 * @generated
	 */
	void setTarpitReleaseDateTime(long value);

	/**
	 * Returns the value of the '<em><b>User Login Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Login Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Login Id</em>' attribute.
	 * @see #setUserLoginId(String)
	 * @see org.abchip.mimo.biz.security.securitygroup.SecuritygroupPackage#getTarpittedLoginView_UserLoginId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.securitygroup.TarpittedLoginView#getUserLoginId <em>User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Login Id</em>' attribute.
	 * @see #getUserLoginId()
	 * @generated
	 */
	void setUserLoginId(String value);

	/**
	 * Returns the value of the '<em><b>View Name Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Name Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Name Id</em>' attribute.
	 * @see #setViewNameId(String)
	 * @see org.abchip.mimo.biz.security.securitygroup.SecuritygroupPackage#getTarpittedLoginView_ViewNameId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getViewNameId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.securitygroup.TarpittedLoginView#getViewNameId <em>View Name Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Name Id</em>' attribute.
	 * @see #getViewNameId()
	 * @generated
	 */
	void setViewNameId(String value);

} // TarpittedLoginView
