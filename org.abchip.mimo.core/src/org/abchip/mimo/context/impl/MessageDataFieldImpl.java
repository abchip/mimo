/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.context.impl;

import org.abchip.mimo.context.ContextPackage;
import org.abchip.mimo.context.MessageDataField;
import org.abchip.mimo.entity.impl.EntityImpl;
import org.abchip.mimo.util.DataDef;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Data Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.context.impl.MessageDataFieldImpl#getOutputMask <em>Output Mask</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.MessageDataFieldImpl#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageDataFieldImpl<DD extends DataDef<?>> extends EntityImpl implements MessageDataField<DD> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageDataFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.MESSAGE_DATA_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutputMask() {
		return (String)eGet(ContextPackage.Literals.MESSAGE_DATA_FIELD__OUTPUT_MASK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputMask(String newOutputMask) {
		eSet(ContextPackage.Literals.MESSAGE_DATA_FIELD__OUTPUT_MASK, newOutputMask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataDef<?> getDefinition() {
		return (DataDef<?>)eGet(ContextPackage.Literals.MESSAGE_DATA_FIELD__DEFINITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinition(DataDef<?> newDefinition) {
		eSet(ContextPackage.Literals.MESSAGE_DATA_FIELD__DEFINITION, newDefinition);
	}

} //MessageDataFieldImpl
