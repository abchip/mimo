/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.request.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.request.CustRequestCategory;
import org.abchip.mimo.biz.order.request.CustRequestType;
import org.abchip.mimo.biz.order.request.RequestPackage;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cust Request Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestCategoryImpl#getCustRequestCategoryId <em>Cust Request Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestCategoryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestCategoryImpl#getCustRequestTypeId <em>Cust Request Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustRequestCategoryImpl extends BizEntityImpl implements CustRequestCategory {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getCustRequestCategoryId() <em>Cust Request Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestCategoryId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUST_REQUEST_CATEGORY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustRequestCategoryId() <em>Cust Request Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestCategoryId()
	 * @generated
	 * @ordered
	 */
	protected String custRequestCategoryId = CUST_REQUEST_CATEGORY_ID_EDEFAULT;

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
	protected CustRequestCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequestPackage.Literals.CUST_REQUEST_CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustRequestCategoryId() {
		return custRequestCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustRequestCategoryId(String newCustRequestCategoryId) {
		custRequestCategoryId = newCustRequestCategoryId;
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
	public List<String> custRequests() {
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
			case RequestPackage.CUST_REQUEST_CATEGORY__CUST_REQUEST_CATEGORY_ID:
				return getCustRequestCategoryId();
			case RequestPackage.CUST_REQUEST_CATEGORY__DESCRIPTION:
				return getDescription();
			case RequestPackage.CUST_REQUEST_CATEGORY__CUST_REQUEST_TYPE_ID:
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
			case RequestPackage.CUST_REQUEST_CATEGORY__CUST_REQUEST_CATEGORY_ID:
				setCustRequestCategoryId((String)newValue);
				return;
			case RequestPackage.CUST_REQUEST_CATEGORY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case RequestPackage.CUST_REQUEST_CATEGORY__CUST_REQUEST_TYPE_ID:
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
			case RequestPackage.CUST_REQUEST_CATEGORY__CUST_REQUEST_CATEGORY_ID:
				setCustRequestCategoryId(CUST_REQUEST_CATEGORY_ID_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST_CATEGORY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST_CATEGORY__CUST_REQUEST_TYPE_ID:
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
			case RequestPackage.CUST_REQUEST_CATEGORY__CUST_REQUEST_CATEGORY_ID:
				return CUST_REQUEST_CATEGORY_ID_EDEFAULT == null ? custRequestCategoryId != null : !CUST_REQUEST_CATEGORY_ID_EDEFAULT.equals(custRequestCategoryId);
			case RequestPackage.CUST_REQUEST_CATEGORY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case RequestPackage.CUST_REQUEST_CATEGORY__CUST_REQUEST_TYPE_ID:
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
		result.append(" (custRequestCategoryId: ");
		result.append(custRequestCategoryId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //CustRequestCategoryImpl
