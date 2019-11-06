/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.request.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.request.CustRequestType;
import org.abchip.mimo.biz.order.request.CustRequestTypeAttr;
import org.abchip.mimo.biz.order.request.RequestPackage;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cust Request Type Attr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestTypeAttrImpl#getAttrName <em>Attr Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestTypeAttrImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestTypeAttrImpl#getCustRequestTypeId <em>Cust Request Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustRequestTypeAttrImpl extends BizEntityImpl implements CustRequestTypeAttr {
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
	 * The cached value of the '{@link #getCustRequestTypeId() <em>Cust Request Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestTypeId()
	 * @generated
	 * @ordered
	 */
	protected CustRequestType custRequestTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustRequestTypeAttrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequestPackage.Literals.CUST_REQUEST_TYPE_ATTR;
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
	public CustRequestType getCustRequestTypeId() {
		if (custRequestTypeId != null && ((EObject)custRequestTypeId).eIsProxy()) {
			InternalEObject oldCustRequestTypeId = (InternalEObject)custRequestTypeId;
			custRequestTypeId = (CustRequestType)eResolveProxy(oldCustRequestTypeId);
			if (custRequestTypeId != oldCustRequestTypeId) {
			}
		}
		return custRequestTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustRequestType basicGetCustRequestTypeId() {
		return custRequestTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustRequestTypeId(CustRequestType newCustRequestTypeId) {
		custRequestTypeId = newCustRequestTypeId;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequestPackage.CUST_REQUEST_TYPE_ATTR__ATTR_NAME:
				return getAttrName();
			case RequestPackage.CUST_REQUEST_TYPE_ATTR__DESCRIPTION:
				return getDescription();
			case RequestPackage.CUST_REQUEST_TYPE_ATTR__CUST_REQUEST_TYPE_ID:
				if (resolve) return getCustRequestTypeId();
				return basicGetCustRequestTypeId();
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
			case RequestPackage.CUST_REQUEST_TYPE_ATTR__ATTR_NAME:
				setAttrName((String)newValue);
				return;
			case RequestPackage.CUST_REQUEST_TYPE_ATTR__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case RequestPackage.CUST_REQUEST_TYPE_ATTR__CUST_REQUEST_TYPE_ID:
				setCustRequestTypeId((CustRequestType)newValue);
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
			case RequestPackage.CUST_REQUEST_TYPE_ATTR__ATTR_NAME:
				setAttrName(ATTR_NAME_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST_TYPE_ATTR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST_TYPE_ATTR__CUST_REQUEST_TYPE_ID:
				setCustRequestTypeId((CustRequestType)null);
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
			case RequestPackage.CUST_REQUEST_TYPE_ATTR__ATTR_NAME:
				return ATTR_NAME_EDEFAULT == null ? attrName != null : !ATTR_NAME_EDEFAULT.equals(attrName);
			case RequestPackage.CUST_REQUEST_TYPE_ATTR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case RequestPackage.CUST_REQUEST_TYPE_ATTR__CUST_REQUEST_TYPE_ID:
				return custRequestTypeId != null;
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

} //CustRequestTypeAttrImpl
