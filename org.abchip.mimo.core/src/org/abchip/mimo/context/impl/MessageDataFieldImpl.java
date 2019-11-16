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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

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
	 * The default value of the '{@link #getOutputMask() <em>Output Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputMask()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_MASK_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOutputMask() <em>Output Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputMask()
	 * @generated
	 * @ordered
	 */
	protected String outputMask = OUTPUT_MASK_EDEFAULT;
	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected DataDef<?> definition;
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
		return outputMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputMask(String newOutputMask) {
		outputMask = newOutputMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataDef<?> getDefinition() {
		if (definition != null && ((EObject)definition).eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (DataDef<?>)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				InternalEObject newDefinition = (InternalEObject)definition;
				NotificationChain msgs = oldDefinition.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContextPackage.MESSAGE_DATA_FIELD__DEFINITION, null, null);
				if (newDefinition.eInternalContainer() == null) {
					msgs = newDefinition.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContextPackage.MESSAGE_DATA_FIELD__DEFINITION, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDef<?> basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(DataDef<?> newDefinition, NotificationChain msgs) {
		definition = newDefinition;
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinition(DataDef<?> newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContextPackage.MESSAGE_DATA_FIELD__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContextPackage.MESSAGE_DATA_FIELD__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContextPackage.MESSAGE_DATA_FIELD__DEFINITION:
				return basicSetDefinition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContextPackage.MESSAGE_DATA_FIELD__OUTPUT_MASK:
				return getOutputMask();
			case ContextPackage.MESSAGE_DATA_FIELD__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContextPackage.MESSAGE_DATA_FIELD__OUTPUT_MASK:
				setOutputMask((String)newValue);
				return;
			case ContextPackage.MESSAGE_DATA_FIELD__DEFINITION:
				setDefinition((DataDef<?>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ContextPackage.MESSAGE_DATA_FIELD__OUTPUT_MASK:
				setOutputMask(OUTPUT_MASK_EDEFAULT);
				return;
			case ContextPackage.MESSAGE_DATA_FIELD__DEFINITION:
				setDefinition((DataDef<?>)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ContextPackage.MESSAGE_DATA_FIELD__OUTPUT_MASK:
				return OUTPUT_MASK_EDEFAULT == null ? outputMask != null : !OUTPUT_MASK_EDEFAULT.equals(outputMask);
			case ContextPackage.MESSAGE_DATA_FIELD__DEFINITION:
				return definition != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (outputMask: ");
		result.append(outputMask);
		result.append(')');
		return result.toString();
	}

} //MessageDataFieldImpl
