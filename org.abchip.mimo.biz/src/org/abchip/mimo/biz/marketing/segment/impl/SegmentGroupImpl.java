/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.segment.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.marketing.segment.SegmentGroup;
import org.abchip.mimo.biz.marketing.segment.SegmentGroupType;
import org.abchip.mimo.biz.marketing.segment.SegmentPackage;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Segment Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.segment.impl.SegmentGroupImpl#getSegmentGroupId <em>Segment Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.segment.impl.SegmentGroupImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.segment.impl.SegmentGroupImpl#getSegmentGroupTypeId <em>Segment Group Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.segment.impl.SegmentGroupImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.segment.impl.SegmentGroupImpl#getSegmentGroupClassifications <em>Segment Group Classifications</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.segment.impl.SegmentGroupImpl#getSegmentGroupGeos <em>Segment Group Geos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SegmentGroupImpl extends BizEntityTypedImpl<SegmentGroupType> implements SegmentGroup {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getSegmentGroupId() <em>Segment Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String SEGMENT_GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSegmentGroupId() <em>Segment Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentGroupId()
	 * @generated
	 * @ordered
	 */
	protected String segmentGroupId = SEGMENT_GROUP_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getSegmentGroupTypeId() <em>Segment Group Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentGroupTypeId()
	 * @generated
	 * @ordered
	 */
	protected SegmentGroupType segmentGroupTypeId;

	/**
	 * The cached value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected ProductStore productStoreId;

	/**
	 * The cached value of the '{@link #getSegmentGroupClassifications() <em>Segment Group Classifications</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentGroupClassifications()
	 * @generated
	 * @ordered
	 */
	protected EList<String> segmentGroupClassifications;

	/**
	 * The cached value of the '{@link #getSegmentGroupGeos() <em>Segment Group Geos</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentGroupGeos()
	 * @generated
	 * @ordered
	 */
	protected EList<String> segmentGroupGeos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SegmentGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SegmentPackage.Literals.SEGMENT_GROUP;
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
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SegmentPackage.SEGMENT_GROUP__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStore getProductStoreId() {
		if (productStoreId != null && ((EObject)productStoreId).eIsProxy()) {
			InternalEObject oldProductStoreId = (InternalEObject)productStoreId;
			productStoreId = (ProductStore)eResolveProxy(oldProductStoreId);
			if (productStoreId != oldProductStoreId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SegmentPackage.SEGMENT_GROUP__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
			}
		}
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductStore basicGetProductStoreId() {
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(ProductStore newProductStoreId) {
		ProductStore oldProductStoreId = productStoreId;
		productStoreId = newProductStoreId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SegmentPackage.SEGMENT_GROUP__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSegmentGroupId() {
		return segmentGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSegmentGroupId(String newSegmentGroupId) {
		String oldSegmentGroupId = segmentGroupId;
		segmentGroupId = newSegmentGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SegmentPackage.SEGMENT_GROUP__SEGMENT_GROUP_ID, oldSegmentGroupId, segmentGroupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SegmentGroupType getSegmentGroupTypeId() {
		if (segmentGroupTypeId != null && ((EObject)segmentGroupTypeId).eIsProxy()) {
			InternalEObject oldSegmentGroupTypeId = (InternalEObject)segmentGroupTypeId;
			segmentGroupTypeId = (SegmentGroupType)eResolveProxy(oldSegmentGroupTypeId);
			if (segmentGroupTypeId != oldSegmentGroupTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SegmentPackage.SEGMENT_GROUP__SEGMENT_GROUP_TYPE_ID, oldSegmentGroupTypeId, segmentGroupTypeId));
			}
		}
		return segmentGroupTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentGroupType basicGetSegmentGroupTypeId() {
		return segmentGroupTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSegmentGroupTypeId(SegmentGroupType newSegmentGroupTypeId) {
		SegmentGroupType oldSegmentGroupTypeId = segmentGroupTypeId;
		segmentGroupTypeId = newSegmentGroupTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SegmentPackage.SEGMENT_GROUP__SEGMENT_GROUP_TYPE_ID, oldSegmentGroupTypeId, segmentGroupTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getSegmentGroupClassifications() {
		if (segmentGroupClassifications == null) {
			segmentGroupClassifications = new EDataTypeUniqueEList<String>(String.class, this, SegmentPackage.SEGMENT_GROUP__SEGMENT_GROUP_CLASSIFICATIONS);
		}
		return segmentGroupClassifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getSegmentGroupGeos() {
		if (segmentGroupGeos == null) {
			segmentGroupGeos = new EDataTypeUniqueEList<String>(String.class, this, SegmentPackage.SEGMENT_GROUP__SEGMENT_GROUP_GEOS);
		}
		return segmentGroupGeos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SegmentPackage.SEGMENT_GROUP__SEGMENT_GROUP_ID:
				return getSegmentGroupId();
			case SegmentPackage.SEGMENT_GROUP__DESCRIPTION:
				return getDescription();
			case SegmentPackage.SEGMENT_GROUP__SEGMENT_GROUP_TYPE_ID:
				if (resolve) return getSegmentGroupTypeId();
				return basicGetSegmentGroupTypeId();
			case SegmentPackage.SEGMENT_GROUP__PRODUCT_STORE_ID:
				if (resolve) return getProductStoreId();
				return basicGetProductStoreId();
			case SegmentPackage.SEGMENT_GROUP__SEGMENT_GROUP_CLASSIFICATIONS:
				return getSegmentGroupClassifications();
			case SegmentPackage.SEGMENT_GROUP__SEGMENT_GROUP_GEOS:
				return getSegmentGroupGeos();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SegmentPackage.SEGMENT_GROUP__SEGMENT_GROUP_ID:
				setSegmentGroupId((String)newValue);
				return;
			case SegmentPackage.SEGMENT_GROUP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SegmentPackage.SEGMENT_GROUP__SEGMENT_GROUP_TYPE_ID:
				setSegmentGroupTypeId((SegmentGroupType)newValue);
				return;
			case SegmentPackage.SEGMENT_GROUP__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)newValue);
				return;
			case SegmentPackage.SEGMENT_GROUP__SEGMENT_GROUP_CLASSIFICATIONS:
				getSegmentGroupClassifications().clear();
				getSegmentGroupClassifications().addAll((Collection<? extends String>)newValue);
				return;
			case SegmentPackage.SEGMENT_GROUP__SEGMENT_GROUP_GEOS:
				getSegmentGroupGeos().clear();
				getSegmentGroupGeos().addAll((Collection<? extends String>)newValue);
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
			case SegmentPackage.SEGMENT_GROUP__SEGMENT_GROUP_ID:
				setSegmentGroupId(SEGMENT_GROUP_ID_EDEFAULT);
				return;
			case SegmentPackage.SEGMENT_GROUP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SegmentPackage.SEGMENT_GROUP__SEGMENT_GROUP_TYPE_ID:
				setSegmentGroupTypeId((SegmentGroupType)null);
				return;
			case SegmentPackage.SEGMENT_GROUP__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)null);
				return;
			case SegmentPackage.SEGMENT_GROUP__SEGMENT_GROUP_CLASSIFICATIONS:
				getSegmentGroupClassifications().clear();
				return;
			case SegmentPackage.SEGMENT_GROUP__SEGMENT_GROUP_GEOS:
				getSegmentGroupGeos().clear();
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
			case SegmentPackage.SEGMENT_GROUP__SEGMENT_GROUP_ID:
				return SEGMENT_GROUP_ID_EDEFAULT == null ? segmentGroupId != null : !SEGMENT_GROUP_ID_EDEFAULT.equals(segmentGroupId);
			case SegmentPackage.SEGMENT_GROUP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SegmentPackage.SEGMENT_GROUP__SEGMENT_GROUP_TYPE_ID:
				return segmentGroupTypeId != null;
			case SegmentPackage.SEGMENT_GROUP__PRODUCT_STORE_ID:
				return productStoreId != null;
			case SegmentPackage.SEGMENT_GROUP__SEGMENT_GROUP_CLASSIFICATIONS:
				return segmentGroupClassifications != null && !segmentGroupClassifications.isEmpty();
			case SegmentPackage.SEGMENT_GROUP__SEGMENT_GROUP_GEOS:
				return segmentGroupGeos != null && !segmentGroupGeos.isEmpty();
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
		result.append(" (segmentGroupId: ");
		result.append(segmentGroupId);
		result.append(", description: ");
		result.append(description);
		result.append(", segmentGroupClassifications: ");
		result.append(segmentGroupClassifications);
		result.append(", segmentGroupGeos: ");
		result.append(segmentGroupGeos);
		result.append(')');
		return result.toString();
	}

} //SegmentGroupImpl
