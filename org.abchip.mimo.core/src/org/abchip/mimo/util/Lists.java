/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.util;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lists</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.util.UtilPackage#getLists()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Lists extends Singleton<Lists> {
	
	Lists qINSTANCE = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listType="org.abchip.mimo.java.JavaList&lt;E&gt;" listRequired="true" listMany="false" elementRequired="true"
	 * @generated
	 */
	<E> void addFirst(List<E> list, E element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listType="org.abchip.mimo.java.JavaList&lt;E&gt;" listRequired="true" listMany="false" elementRequired="true"
	 * @generated
	 */
	<E> void addLast(List<E> list, E element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listType="org.abchip.mimo.java.JavaList&lt;E&gt;" listRequired="true" listMany="false" oldElementRequired="true" newElementRequired="true"
	 * @generated
	 */
	<E> void addBefore(List<E> list, E oldElement, E newElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listType="org.abchip.mimo.java.JavaList&lt;E&gt;" listRequired="true" listMany="false" oldElementRequired="true" newElementRequired="true"
	 * @generated
	 */
	<E> void addAfter(List<E> list, E oldElement, E newElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.java.JavaList&lt;E&gt;" many="false" listType="org.abchip.mimo.java.JavaList&lt;E&gt;" listRequired="true" listMany="false" indexRequired="true" limitRequired="true"
	 * @generated
	 */
	<E> List<E> slice(List<E> list, int index, int limit);

} // Lists
