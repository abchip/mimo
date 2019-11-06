/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.workeffort.workeffort.Deliverable;
import org.abchip.mimo.biz.workeffort.workeffort.DeliverableType;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deliverable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.DeliverableImpl#getDeliverableId <em>Deliverable Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.DeliverableImpl#getDeliverableName <em>Deliverable Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.DeliverableImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.DeliverableImpl#getDeliverableTypeId <em>Deliverable Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeliverableImpl extends BizEntityTypedImpl<DeliverableType> implements Deliverable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getDeliverableId() <em>Deliverable Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliverableId()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIVERABLE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliverableId() <em>Deliverable Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliverableId()
	 * @generated
	 * @ordered
	 */
	protected String deliverableId = DELIVERABLE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeliverableName() <em>Deliverable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliverableName()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIVERABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliverableName() <em>Deliverable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliverableName()
	 * @generated
	 * @ordered
	 */
	protected String deliverableName = DELIVERABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeliverableTypeId() <em>Deliverable Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliverableTypeId()
	 * @generated
	 * @ordered
	 */
	protected DeliverableType deliverableTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeliverableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkeffortPackage.Literals.DELIVERABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeliverableId() {
		return deliverableId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliverableId(String newDeliverableId) {
		deliverableId = newDeliverableId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeliverableName() {
		return deliverableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliverableName(String newDeliverableName) {
		deliverableName = newDeliverableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeliverableType getDeliverableTypeId() {
		if (deliverableTypeId != null && ((EObject)deliverableTypeId).eIsProxy()) {
			InternalEObject oldDeliverableTypeId = (InternalEObject)deliverableTypeId;
			deliverableTypeId = (DeliverableType)eResolveProxy(oldDeliverableTypeId);
			if (deliverableTypeId != oldDeliverableTypeId) {
			}
		}
		return deliverableTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliverableType basicGetDeliverableTypeId() {
		return deliverableTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliverableTypeId(DeliverableType newDeliverableTypeId) {
		deliverableTypeId = newDeliverableTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> requirements() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> workEffortDeliverableProds() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkeffortPackage.DELIVERABLE__DELIVERABLE_ID:
				return getDeliverableId();
			case WorkeffortPackage.DELIVERABLE__DELIVERABLE_NAME:
				return getDeliverableName();
			case WorkeffortPackage.DELIVERABLE__DESCRIPTION:
				return getDescription();
			case WorkeffortPackage.DELIVERABLE__DELIVERABLE_TYPE_ID:
				if (resolve) return getDeliverableTypeId();
				return basicGetDeliverableTypeId();
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
			case WorkeffortPackage.DELIVERABLE__DELIVERABLE_ID:
				setDeliverableId((String)newValue);
				return;
			case WorkeffortPackage.DELIVERABLE__DELIVERABLE_NAME:
				setDeliverableName((String)newValue);
				return;
			case WorkeffortPackage.DELIVERABLE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WorkeffortPackage.DELIVERABLE__DELIVERABLE_TYPE_ID:
				setDeliverableTypeId((DeliverableType)newValue);
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
			case WorkeffortPackage.DELIVERABLE__DELIVERABLE_ID:
				setDeliverableId(DELIVERABLE_ID_EDEFAULT);
				return;
			case WorkeffortPackage.DELIVERABLE__DELIVERABLE_NAME:
				setDeliverableName(DELIVERABLE_NAME_EDEFAULT);
				return;
			case WorkeffortPackage.DELIVERABLE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WorkeffortPackage.DELIVERABLE__DELIVERABLE_TYPE_ID:
				setDeliverableTypeId((DeliverableType)null);
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
			case WorkeffortPackage.DELIVERABLE__DELIVERABLE_ID:
				return DELIVERABLE_ID_EDEFAULT == null ? deliverableId != null : !DELIVERABLE_ID_EDEFAULT.equals(deliverableId);
			case WorkeffortPackage.DELIVERABLE__DELIVERABLE_NAME:
				return DELIVERABLE_NAME_EDEFAULT == null ? deliverableName != null : !DELIVERABLE_NAME_EDEFAULT.equals(deliverableName);
			case WorkeffortPackage.DELIVERABLE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WorkeffortPackage.DELIVERABLE__DELIVERABLE_TYPE_ID:
				return deliverableTypeId != null;
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
		result.append(" (deliverableId: ");
		result.append(deliverableId);
		result.append(", deliverableName: ");
		result.append(deliverableName);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //DeliverableImpl
