/**
 * Copyright (c) 2017, 2018 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http:/**
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
package org.abchip.mimo.database.definition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rollback Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.definition.RollbackStatement#isHold <em>Hold</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getRollbackStatement()
 * @model
 * @generated
 */
public interface RollbackStatement extends DefinitionStatement {
	/**
	 * Returns the value of the '<em><b>Hold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hold</em>' attribute.
	 * @see #setHold(boolean)
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getRollbackStatement_Hold()
	 * @model
	 * @generated
	 */
	boolean isHold();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.definition.RollbackStatement#isHold <em>Hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hold</em>' attribute.
	 * @see #isHold()
	 * @generated
	 */
	void setHold(boolean value);

} // RollbackStatement
