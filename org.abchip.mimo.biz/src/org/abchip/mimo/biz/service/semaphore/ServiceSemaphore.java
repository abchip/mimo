/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.semaphore;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Semaphore</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.semaphore.ServiceSemaphore#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.semaphore.ServiceSemaphore#getLockThread <em>Lock Thread</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.semaphore.ServiceSemaphore#getLockTime <em>Lock Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.semaphore.ServiceSemaphore#getLockedByInstanceId <em>Locked By Instance Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.semaphore.SemaphorePackage#getServiceSemaphore()
 * @model annotation="mimo-ent-frame title='Semaphore Lock'"
 * @generated
 */
public interface ServiceSemaphore extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see org.abchip.mimo.biz.service.semaphore.SemaphorePackage#getServiceSemaphore_ServiceName()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.semaphore.ServiceSemaphore#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Lock Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lock Thread</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock Thread</em>' attribute.
	 * @see #setLockThread(String)
	 * @see org.abchip.mimo.biz.service.semaphore.SemaphorePackage#getServiceSemaphore_LockThread()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getLockThread();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.semaphore.ServiceSemaphore#getLockThread <em>Lock Thread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock Thread</em>' attribute.
	 * @see #getLockThread()
	 * @generated
	 */
	void setLockThread(String value);

	/**
	 * Returns the value of the '<em><b>Lock Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lock Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock Time</em>' attribute.
	 * @see #setLockTime(Date)
	 * @see org.abchip.mimo.biz.service.semaphore.SemaphorePackage#getServiceSemaphore_LockTime()
	 * @model
	 * @generated
	 */
	Date getLockTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.semaphore.ServiceSemaphore#getLockTime <em>Lock Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock Time</em>' attribute.
	 * @see #getLockTime()
	 * @generated
	 */
	void setLockTime(Date value);

	/**
	 * Returns the value of the '<em><b>Locked By Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locked By Instance Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locked By Instance Id</em>' attribute.
	 * @see #setLockedByInstanceId(String)
	 * @see org.abchip.mimo.biz.service.semaphore.SemaphorePackage#getServiceSemaphore_LockedByInstanceId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getLockedByInstanceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.semaphore.ServiceSemaphore#getLockedByInstanceId <em>Locked By Instance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locked By Instance Id</em>' attribute.
	 * @see #getLockedByInstanceId()
	 * @generated
	 */
	void setLockedByInstanceId(String value);

} // ServiceSemaphore
