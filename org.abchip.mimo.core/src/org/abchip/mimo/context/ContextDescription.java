/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.context;

import java.util.List;
import org.abchip.mimo.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.context.ContextDescription#isAnonymous <em>Anonymous</em>}</li>
 *   <li>{@link org.abchip.mimo.context.ContextDescription#getId <em>Id</em>}</li>
 *   <li>{@link org.abchip.mimo.context.ContextDescription#getResources <em>Resources</em>}</li>
 *   <li>{@link org.abchip.mimo.context.ContextDescription#getResourceRoot <em>Resource Root</em>}</li>
 *   <li>{@link org.abchip.mimo.context.ContextDescription#getResourceTemporary <em>Resource Temporary</em>}</li>
 *   <li>{@link org.abchip.mimo.context.ContextDescription#getTenant <em>Tenant</em>}</li>
 *   <li>{@link org.abchip.mimo.context.ContextDescription#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.context.ContextPackage#getContextDescription()
 * @model
 * @generated
 */
public interface ContextDescription extends Entity {
	/**
	 * Returns the value of the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anonymous</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymous</em>' attribute.
	 * @see #setAnonymous(boolean)
	 * @see org.abchip.mimo.context.ContextPackage#getContextDescription_Anonymous()
	 * @model
	 * @generated
	 */
	boolean isAnonymous();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.ContextDescription#isAnonymous <em>Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anonymous</em>' attribute.
	 * @see #isAnonymous()
	 * @generated
	 */
	void setAnonymous(boolean value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.abchip.mimo.context.ContextPackage#getContextDescription_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.ContextDescription#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Resource Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Root</em>' attribute.
	 * @see #setResourceRoot(String)
	 * @see org.abchip.mimo.context.ContextPackage#getContextDescription_ResourceRoot()
	 * @model required="true"
	 * @generated
	 */
	String getResourceRoot();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.ContextDescription#getResourceRoot <em>Resource Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Root</em>' attribute.
	 * @see #getResourceRoot()
	 * @generated
	 */
	void setResourceRoot(String value);

	/**
	 * Returns the value of the '<em><b>Resource Temporary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Temporary</em>' attribute.
	 * @see #setResourceTemporary(String)
	 * @see org.abchip.mimo.context.ContextPackage#getContextDescription_ResourceTemporary()
	 * @model required="true"
	 * @generated
	 */
	String getResourceTemporary();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.ContextDescription#getResourceTemporary <em>Resource Temporary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Temporary</em>' attribute.
	 * @see #getResourceTemporary()
	 * @generated
	 */
	void setResourceTemporary(String value);

	/**
	 * Returns the value of the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tenant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant</em>' attribute.
	 * @see #setTenant(String)
	 * @see org.abchip.mimo.context.ContextPackage#getContextDescription_Tenant()
	 * @model
	 * @generated
	 */
	String getTenant();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.ContextDescription#getTenant <em>Tenant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant</em>' attribute.
	 * @see #getTenant()
	 * @generated
	 */
	void setTenant(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see org.abchip.mimo.context.ContextPackage#getContextDescription_User()
	 * @model required="true"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.ContextDescription#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' attribute list.
	 * @see org.abchip.mimo.context.ContextPackage#getContextDescription_Resources()
	 * @model
	 * @generated
	 */
	List<String> getResources();

} // ContextDescription
