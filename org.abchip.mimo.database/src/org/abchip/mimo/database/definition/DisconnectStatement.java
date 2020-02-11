/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http:/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.definition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disconnect Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.definition.DisconnectStatement#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getDisconnectStatement()
 * @model
 * @generated
 */
public interface DisconnectStatement extends DefinitionStatement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.database.definition.TargetItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see org.abchip.mimo.database.definition.TargetItem
	 * @see #setTarget(TargetItem)
	 * @see org.abchip.mimo.database.definition.DatabaseDefinitionPackage#getDisconnectStatement_Target()
	 * @model
	 * @generated
	 */
	TargetItem getTarget();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.definition.DisconnectStatement#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see org.abchip.mimo.database.definition.TargetItem
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TargetItem value);

} // DisconnectStatement
