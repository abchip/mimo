/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.feature.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.feature.FeaturePackage;
import org.abchip.mimo.biz.product.feature.ProductFeature;
import org.abchip.mimo.biz.product.feature.ProductFeatureGroup;
import org.abchip.mimo.biz.product.feature.ProductFeatureGroupAppl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Feature Group Appl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureGroupApplImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureGroupApplImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureGroupApplImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureGroupApplImpl#getProductFeatureGroupId <em>Product Feature Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureGroupApplImpl#getProductFeatureId <em>Product Feature Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductFeatureGroupApplImpl extends BizEntityImpl implements ProductFeatureGroupAppl {
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
	 * The default value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected static final long SEQUENCE_NUM_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected long sequenceNum = SEQUENCE_NUM_EDEFAULT;

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
	 * The cached value of the '{@link #getProductFeatureGroupId() <em>Product Feature Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureGroupId()
	 * @generated
	 * @ordered
	 */
	protected ProductFeatureGroup productFeatureGroupId;

	/**
	 * The cached value of the '{@link #getProductFeatureId() <em>Product Feature Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureId()
	 * @generated
	 * @ordered
	 */
	protected ProductFeature productFeatureId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductFeatureGroupApplImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturePackage.Literals.PRODUCT_FEATURE_GROUP_APPL;
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
	public long getSequenceNum() {
		return sequenceNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNum(long newSequenceNum) {
		sequenceNum = newSequenceNum;
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
	public ProductFeatureGroup getProductFeatureGroupId() {
		if (productFeatureGroupId != null && ((EObject)productFeatureGroupId).eIsProxy()) {
			InternalEObject oldProductFeatureGroupId = (InternalEObject)productFeatureGroupId;
			productFeatureGroupId = (ProductFeatureGroup)eResolveProxy(oldProductFeatureGroupId);
			if (productFeatureGroupId != oldProductFeatureGroupId) {
			}
		}
		return productFeatureGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFeatureGroup basicGetProductFeatureGroupId() {
		return productFeatureGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureGroupId(ProductFeatureGroup newProductFeatureGroupId) {
		productFeatureGroupId = newProductFeatureGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFeature getProductFeatureId() {
		if (productFeatureId != null && ((EObject)productFeatureId).eIsProxy()) {
			InternalEObject oldProductFeatureId = (InternalEObject)productFeatureId;
			productFeatureId = (ProductFeature)eResolveProxy(oldProductFeatureId);
			if (productFeatureId != oldProductFeatureId) {
			}
		}
		return productFeatureId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFeature basicGetProductFeatureId() {
		return productFeatureId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureId(ProductFeature newProductFeatureId) {
		productFeatureId = newProductFeatureId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeaturePackage.PRODUCT_FEATURE_GROUP_APPL__FROM_DATE:
				return getFromDate();
			case FeaturePackage.PRODUCT_FEATURE_GROUP_APPL__SEQUENCE_NUM:
				return getSequenceNum();
			case FeaturePackage.PRODUCT_FEATURE_GROUP_APPL__THRU_DATE:
				return getThruDate();
			case FeaturePackage.PRODUCT_FEATURE_GROUP_APPL__PRODUCT_FEATURE_GROUP_ID:
				if (resolve) return getProductFeatureGroupId();
				return basicGetProductFeatureGroupId();
			case FeaturePackage.PRODUCT_FEATURE_GROUP_APPL__PRODUCT_FEATURE_ID:
				if (resolve) return getProductFeatureId();
				return basicGetProductFeatureId();
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
			case FeaturePackage.PRODUCT_FEATURE_GROUP_APPL__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case FeaturePackage.PRODUCT_FEATURE_GROUP_APPL__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case FeaturePackage.PRODUCT_FEATURE_GROUP_APPL__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case FeaturePackage.PRODUCT_FEATURE_GROUP_APPL__PRODUCT_FEATURE_GROUP_ID:
				setProductFeatureGroupId((ProductFeatureGroup)newValue);
				return;
			case FeaturePackage.PRODUCT_FEATURE_GROUP_APPL__PRODUCT_FEATURE_ID:
				setProductFeatureId((ProductFeature)newValue);
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
			case FeaturePackage.PRODUCT_FEATURE_GROUP_APPL__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case FeaturePackage.PRODUCT_FEATURE_GROUP_APPL__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case FeaturePackage.PRODUCT_FEATURE_GROUP_APPL__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case FeaturePackage.PRODUCT_FEATURE_GROUP_APPL__PRODUCT_FEATURE_GROUP_ID:
				setProductFeatureGroupId((ProductFeatureGroup)null);
				return;
			case FeaturePackage.PRODUCT_FEATURE_GROUP_APPL__PRODUCT_FEATURE_ID:
				setProductFeatureId((ProductFeature)null);
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
			case FeaturePackage.PRODUCT_FEATURE_GROUP_APPL__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case FeaturePackage.PRODUCT_FEATURE_GROUP_APPL__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case FeaturePackage.PRODUCT_FEATURE_GROUP_APPL__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case FeaturePackage.PRODUCT_FEATURE_GROUP_APPL__PRODUCT_FEATURE_GROUP_ID:
				return productFeatureGroupId != null;
			case FeaturePackage.PRODUCT_FEATURE_GROUP_APPL__PRODUCT_FEATURE_ID:
				return productFeatureId != null;
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
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //ProductFeatureGroupApplImpl
