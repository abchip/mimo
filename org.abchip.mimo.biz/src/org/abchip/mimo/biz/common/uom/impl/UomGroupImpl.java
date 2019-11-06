/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.uom.impl;

import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.common.uom.UomGroup;
import org.abchip.mimo.biz.common.uom.UomPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uom Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.uom.impl.UomGroupImpl#getUomGroupId <em>Uom Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.impl.UomGroupImpl#getUomId <em>Uom Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UomGroupImpl extends BizEntityImpl implements UomGroup {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getUomGroupId() <em>Uom Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUomGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String UOM_GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUomGroupId() <em>Uom Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUomGroupId()
	 * @generated
	 * @ordered
	 */
	protected String uomGroupId = UOM_GROUP_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUomId() <em>Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom uomId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UomGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UomPackage.Literals.UOM_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUomGroupId() {
		return uomGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUomGroupId(String newUomGroupId) {
		uomGroupId = newUomGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getUomId() {
		if (uomId != null && ((EObject)uomId).eIsProxy()) {
			InternalEObject oldUomId = (InternalEObject)uomId;
			uomId = (Uom)eResolveProxy(oldUomId);
			if (uomId != oldUomId) {
			}
		}
		return uomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetUomId() {
		return uomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUomId(Uom newUomId) {
		uomId = newUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UomPackage.UOM_GROUP__UOM_GROUP_ID:
				return getUomGroupId();
			case UomPackage.UOM_GROUP__UOM_ID:
				if (resolve) return getUomId();
				return basicGetUomId();
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
			case UomPackage.UOM_GROUP__UOM_GROUP_ID:
				setUomGroupId((String)newValue);
				return;
			case UomPackage.UOM_GROUP__UOM_ID:
				setUomId((Uom)newValue);
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
			case UomPackage.UOM_GROUP__UOM_GROUP_ID:
				setUomGroupId(UOM_GROUP_ID_EDEFAULT);
				return;
			case UomPackage.UOM_GROUP__UOM_ID:
				setUomId((Uom)null);
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
			case UomPackage.UOM_GROUP__UOM_GROUP_ID:
				return UOM_GROUP_ID_EDEFAULT == null ? uomGroupId != null : !UOM_GROUP_ID_EDEFAULT.equals(uomGroupId);
			case UomPackage.UOM_GROUP__UOM_ID:
				return uomId != null;
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
		result.append(" (uomGroupId: ");
		result.append(uomGroupId);
		result.append(')');
		return result.toString();
	}

} //UomGroupImpl
