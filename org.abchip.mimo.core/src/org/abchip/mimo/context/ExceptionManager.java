/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.context;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.context.ContextPackage#getExceptionManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ExceptionManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.abchip.mimo.context.MessageException" contextRequired="true" messageType="org.abchip.mimo.java.JavaEnum" messageRequired="true" EBounds="org.abchip.mimo.java.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> MessageException prepareException(Context context, Enum<E> message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.abchip.mimo.context.MessageException" contextRequired="true" messageType="org.abchip.mimo.java.JavaEnum" messageRequired="true" variableRequired="true" EBounds="org.abchip.mimo.java.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> MessageException prepareException(Context context, Enum<E> message, Object variable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.abchip.mimo.context.MessageException" contextRequired="true" messageType="org.abchip.mimo.java.JavaEnum" messageRequired="true" variablesDataType="org.abchip.mimo.context.MessageVariableList" variablesRequired="true" EBounds="org.abchip.mimo.java.JavaEnum"
	 * @generated
	 */
	<E extends Enum<E>> MessageException prepareException(Context context, Enum<E> message, Object[] variables);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.abchip.mimo.context.MessageException" contextRequired="true" messageRequired="true" messageFileNameRequired="true" messageFileLibRequired="true" variablesDataType="org.abchip.mimo.context.MessageVariableList" variablesRequired="true"
	 * @generated
	 */
	MessageException prepareException(Context context, String message, String messageFileName, String messageFileLib, Object[] variables);

} // ExceptionManager
