/**
 *  Copyright (c) 2017, 2018 ABChip and others.
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

import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.util.DataDef;
import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.context.ContextPackage
 * @generated
 */
public interface ContextFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContextFactory eINSTANCE = org.abchip.mimo.context.impl.ContextFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description</em>'.
	 * @generated
	 */
	ContextDescription createContextDescription();

	/**
	 * Returns a new object of class '<em>Identity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identity</em>'.
	 * @generated
	 */
	<T extends Entity> Identity<T> createIdentity();

	/**
	 * Returns a new object of class '<em>Message Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Description</em>'.
	 * @generated
	 */
	MessageDescription createMessageDescription();

	/**
	 * Returns a new object of class '<em>Message Data Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Data Field</em>'.
	 * @generated
	 */
	<DD extends DataDef<?>> MessageDataField<DD> createMessageDataField();

	/**
	 * Returns a new object of class '<em>Message File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message File</em>'.
	 * @generated
	 */
	MessageFile createMessageFile();

	/**
	 * Returns a new object of class '<em>User Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Profile</em>'.
	 * @generated
	 */
	UserProfile createUserProfile();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContextPackage getContextPackage();

} //ContextFactory
