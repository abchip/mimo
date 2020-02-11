/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.TarpittedLoginView#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.TarpittedLoginView#getViewNameId <em>View Name Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.TarpittedLoginView#getTarpitReleaseDateTime <em>Tarpit Release Date Time</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.security.securitygroup.SecuritygroupPackage#getTarpittedLoginView()
 * @model annotation="mimo-ent-frame help='Login View couple currently tarpitted : any access to the view for the login is denied' title='Security Component - Protected View'"
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
	 * @model annotation="mimo-ent-slot help='Date/Time at which the login will gain anew access to the view (in milliseconds from midnight, January 1, 1970 UTC , 0 meaning no tarpit to allow the admin to free a view and to keep history'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
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
	 *        annotation="mimo-ent-format length='255'"
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
	 *        annotation="mimo-ent-slot key='true' help='name of view protected from data theft'"
	 *        annotation="mimo-ent-format length='60'"
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
