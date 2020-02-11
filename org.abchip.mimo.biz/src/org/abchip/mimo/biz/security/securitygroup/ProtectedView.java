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
 * A representation of the model object '<em><b>Protected View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.ProtectedView#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.ProtectedView#getViewNameId <em>View Name Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.ProtectedView#getMaxHits <em>Max Hits</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.ProtectedView#getMaxHitsDuration <em>Max Hits Duration</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.security.securitygroup.ProtectedView#getTarpitDuration <em>Tarpit Duration</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.security.securitygroup.SecuritygroupPackage#getProtectedView()
 * @model annotation="mimo-ent-frame help='Defines views protected from data leakage' title='Security Component - Protected View'"
 * @generated
 */
public interface ProtectedView extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Id</em>' reference.
	 * @see #setGroupId(SecurityGroup)
	 * @see org.abchip.mimo.biz.security.securitygroup.SecuritygroupPackage#getProtectedView_GroupId()
	 * @model keys="groupId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	SecurityGroup getGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.securitygroup.ProtectedView#getGroupId <em>Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' reference.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(SecurityGroup value);

	/**
	 * Returns the value of the '<em><b>Max Hits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Hits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Hits</em>' attribute.
	 * @see #setMaxHits(long)
	 * @see org.abchip.mimo.biz.security.securitygroup.SecuritygroupPackage#getProtectedView_MaxHits()
	 * @model annotation="mimo-ent-slot help='number of hits before tarpitting a login for a view'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getMaxHits();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.securitygroup.ProtectedView#getMaxHits <em>Max Hits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Hits</em>' attribute.
	 * @see #getMaxHits()
	 * @generated
	 */
	void setMaxHits(long value);

	/**
	 * Returns the value of the '<em><b>Max Hits Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Hits Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Hits Duration</em>' attribute.
	 * @see #setMaxHitsDuration(long)
	 * @see org.abchip.mimo.biz.security.securitygroup.SecuritygroupPackage#getProtectedView_MaxHitsDuration()
	 * @model annotation="mimo-ent-slot help='period of time associated with maxHits (in seconds)'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getMaxHitsDuration();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.securitygroup.ProtectedView#getMaxHitsDuration <em>Max Hits Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Hits Duration</em>' attribute.
	 * @see #getMaxHitsDuration()
	 * @generated
	 */
	void setMaxHitsDuration(long value);

	/**
	 * Returns the value of the '<em><b>Tarpit Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tarpit Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tarpit Duration</em>' attribute.
	 * @see #setTarpitDuration(long)
	 * @see org.abchip.mimo.biz.security.securitygroup.SecuritygroupPackage#getProtectedView_TarpitDuration()
	 * @model annotation="mimo-ent-slot help='period of time a login will not be able to acces  this view again (in seconds)'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getTarpitDuration();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.securitygroup.ProtectedView#getTarpitDuration <em>Tarpit Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tarpit Duration</em>' attribute.
	 * @see #getTarpitDuration()
	 * @generated
	 */
	void setTarpitDuration(long value);

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
	 * @see org.abchip.mimo.biz.security.securitygroup.SecuritygroupPackage#getProtectedView_ViewNameId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true' help='name of view to protect from data theft'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getViewNameId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.security.securitygroup.ProtectedView#getViewNameId <em>View Name Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Name Id</em>' attribute.
	 * @see #getViewNameId()
	 * @generated
	 */
	void setViewNameId(String value);

} // ProtectedView
