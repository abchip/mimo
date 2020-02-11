/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.context;

import org.abchip.mimo.data.DataDef;
import org.abchip.mimo.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Data Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.context.MessageDataField#getOutputMask <em>Output Mask</em>}</li>
 *   <li>{@link org.abchip.mimo.context.MessageDataField#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.context.ContextPackage#getMessageDataField()
 * @model
 * @generated
 */
public interface MessageDataField<DD extends DataDef<?>> extends Entity {
	/**
	 * Returns the value of the '<em><b>Output Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Mask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Mask</em>' attribute.
	 * @see #setOutputMask(String)
	 * @see org.abchip.mimo.context.ContextPackage#getMessageDataField_OutputMask()
	 * @model
	 * @generated
	 */
	String getOutputMask();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.MessageDataField#getOutputMask <em>Output Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Mask</em>' attribute.
	 * @see #getOutputMask()
	 * @generated
	 */
	void setOutputMask(String value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(DataDef)
	 * @see org.abchip.mimo.context.ContextPackage#getMessageDataField_Definition()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	DataDef<?> getDefinition();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.MessageDataField#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(DataDef<?> value);

} // MessageDataField
