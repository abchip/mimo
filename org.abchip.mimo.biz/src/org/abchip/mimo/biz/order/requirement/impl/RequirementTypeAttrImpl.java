/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.requirement.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.requirement.RequirementPackage;
import org.abchip.mimo.biz.order.requirement.RequirementType;
import org.abchip.mimo.biz.order.requirement.RequirementTypeAttr;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Type Attr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.RequirementTypeAttrImpl#getAttrName <em>Attr Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.RequirementTypeAttrImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.requirement.impl.RequirementTypeAttrImpl#getRequirementTypeId <em>Requirement Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementTypeAttrImpl extends BizEntityImpl implements RequirementTypeAttr {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getAttrName() <em>Attr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttrName() <em>Attr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrName()
	 * @generated
	 * @ordered
	 */
	protected String attrName = ATTR_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getRequirementTypeId() <em>Requirement Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementTypeId()
	 * @generated
	 * @ordered
	 */
	protected RequirementType requirementTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementTypeAttrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.REQUIREMENT_TYPE_ATTR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttrName() {
		return attrName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttrName(String newAttrName) {
		attrName = newAttrName;
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
	public RequirementType getRequirementTypeId() {
		if (requirementTypeId != null && ((EObject)requirementTypeId).eIsProxy()) {
			InternalEObject oldRequirementTypeId = (InternalEObject)requirementTypeId;
			requirementTypeId = (RequirementType)eResolveProxy(oldRequirementTypeId);
			if (requirementTypeId != oldRequirementTypeId) {
			}
		}
		return requirementTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementType basicGetRequirementTypeId() {
		return requirementTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirementTypeId(RequirementType newRequirementTypeId) {
		requirementTypeId = newRequirementTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementPackage.REQUIREMENT_TYPE_ATTR__ATTR_NAME:
				return getAttrName();
			case RequirementPackage.REQUIREMENT_TYPE_ATTR__DESCRIPTION:
				return getDescription();
			case RequirementPackage.REQUIREMENT_TYPE_ATTR__REQUIREMENT_TYPE_ID:
				if (resolve) return getRequirementTypeId();
				return basicGetRequirementTypeId();
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
			case RequirementPackage.REQUIREMENT_TYPE_ATTR__ATTR_NAME:
				setAttrName((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT_TYPE_ATTR__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case RequirementPackage.REQUIREMENT_TYPE_ATTR__REQUIREMENT_TYPE_ID:
				setRequirementTypeId((RequirementType)newValue);
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
			case RequirementPackage.REQUIREMENT_TYPE_ATTR__ATTR_NAME:
				setAttrName(ATTR_NAME_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT_TYPE_ATTR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case RequirementPackage.REQUIREMENT_TYPE_ATTR__REQUIREMENT_TYPE_ID:
				setRequirementTypeId((RequirementType)null);
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
			case RequirementPackage.REQUIREMENT_TYPE_ATTR__ATTR_NAME:
				return ATTR_NAME_EDEFAULT == null ? attrName != null : !ATTR_NAME_EDEFAULT.equals(attrName);
			case RequirementPackage.REQUIREMENT_TYPE_ATTR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case RequirementPackage.REQUIREMENT_TYPE_ATTR__REQUIREMENT_TYPE_ID:
				return requirementTypeId != null;
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
		result.append(" (attrName: ");
		result.append(attrName);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //RequirementTypeAttrImpl
