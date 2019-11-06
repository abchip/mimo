/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.category.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.RoleType;
import org.abchip.mimo.biz.product.category.CategoryPackage;
import org.abchip.mimo.biz.product.category.ProductCategory;
import org.abchip.mimo.biz.product.category.ProductCategoryRole;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Category Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryRoleImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryRoleImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryRoleImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryRoleImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryRoleImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryRoleImpl#getProductCategoryId <em>Product Category Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductCategoryRoleImpl extends BizEntityImpl implements ProductCategoryRole {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;

	/**
	 * The cached value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected RoleType roleTypeId;

	/**
	 * The cached value of the '{@link #getProductCategoryId() <em>Product Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryId()
	 * @generated
	 * @ordered
	 */
	protected ProductCategory productCategoryId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductCategoryRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CategoryPackage.Literals.PRODUCT_CATEGORY_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		comments = newComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		fromDate = newFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
			}
		}
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		partyId = newPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoleTypeId() {
		if (roleTypeId != null && ((EObject)roleTypeId).eIsProxy()) {
			InternalEObject oldRoleTypeId = (InternalEObject)roleTypeId;
			roleTypeId = (RoleType)eResolveProxy(oldRoleTypeId);
			if (roleTypeId != oldRoleTypeId) {
			}
		}
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetRoleTypeId() {
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(RoleType newRoleTypeId) {
		roleTypeId = newRoleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		thruDate = newThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategory getProductCategoryId() {
		if (productCategoryId != null && ((EObject)productCategoryId).eIsProxy()) {
			InternalEObject oldProductCategoryId = (InternalEObject)productCategoryId;
			productCategoryId = (ProductCategory)eResolveProxy(oldProductCategoryId);
			if (productCategoryId != oldProductCategoryId) {
			}
		}
		return productCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductCategory basicGetProductCategoryId() {
		return productCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategoryId(ProductCategory newProductCategoryId) {
		productCategoryId = newProductCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CategoryPackage.PRODUCT_CATEGORY_ROLE__FROM_DATE:
				return getFromDate();
			case CategoryPackage.PRODUCT_CATEGORY_ROLE__COMMENTS:
				return getComments();
			case CategoryPackage.PRODUCT_CATEGORY_ROLE__THRU_DATE:
				return getThruDate();
			case CategoryPackage.PRODUCT_CATEGORY_ROLE__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case CategoryPackage.PRODUCT_CATEGORY_ROLE__ROLE_TYPE_ID:
				if (resolve) return getRoleTypeId();
				return basicGetRoleTypeId();
			case CategoryPackage.PRODUCT_CATEGORY_ROLE__PRODUCT_CATEGORY_ID:
				if (resolve) return getProductCategoryId();
				return basicGetProductCategoryId();
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
			case CategoryPackage.PRODUCT_CATEGORY_ROLE__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_ROLE__COMMENTS:
				setComments((String)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_ROLE__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_ROLE__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_ROLE__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_ROLE__PRODUCT_CATEGORY_ID:
				setProductCategoryId((ProductCategory)newValue);
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
			case CategoryPackage.PRODUCT_CATEGORY_ROLE__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_ROLE__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_ROLE__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_ROLE__PARTY_ID:
				setPartyId((Party)null);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_ROLE__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)null);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_ROLE__PRODUCT_CATEGORY_ID:
				setProductCategoryId((ProductCategory)null);
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
			case CategoryPackage.PRODUCT_CATEGORY_ROLE__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case CategoryPackage.PRODUCT_CATEGORY_ROLE__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case CategoryPackage.PRODUCT_CATEGORY_ROLE__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case CategoryPackage.PRODUCT_CATEGORY_ROLE__PARTY_ID:
				return partyId != null;
			case CategoryPackage.PRODUCT_CATEGORY_ROLE__ROLE_TYPE_ID:
				return roleTypeId != null;
			case CategoryPackage.PRODUCT_CATEGORY_ROLE__PRODUCT_CATEGORY_ID:
				return productCategoryId != null;
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
		result.append(" (fromDate: ");
		result.append(fromDate);
		result.append(", comments: ");
		result.append(comments);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //ProductCategoryRoleImpl
