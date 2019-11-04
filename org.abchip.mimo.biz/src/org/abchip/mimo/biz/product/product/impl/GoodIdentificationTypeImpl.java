/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.product.product.GoodIdentification;
import org.abchip.mimo.biz.product.product.GoodIdentificationType;
import org.abchip.mimo.biz.product.product.ProductPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Good Identification Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.GoodIdentificationTypeImpl#getGoodIdentificationTypeId <em>Good Identification Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.GoodIdentificationTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.GoodIdentificationTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.GoodIdentificationTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.GoodIdentificationTypeImpl#getGoodIdentifications <em>Good Identifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoodIdentificationTypeImpl extends BizEntityTypeImpl<GoodIdentification> implements GoodIdentificationType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getGoodIdentificationTypeId() <em>Good Identification Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoodIdentificationTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String GOOD_IDENTIFICATION_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGoodIdentificationTypeId() <em>Good Identification Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoodIdentificationTypeId()
	 * @generated
	 * @ordered
	 */
	protected String goodIdentificationTypeId = GOOD_IDENTIFICATION_TYPE_ID_EDEFAULT;

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
	 * The default value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_TABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected boolean hasTable = HAS_TABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected GoodIdentificationType parentTypeId;

	/**
	 * The cached value of the '{@link #getGoodIdentifications() <em>Good Identifications</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoodIdentifications()
	 * @generated
	 * @ordered
	 */
	protected EList<String> goodIdentifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoodIdentificationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.GOOD_IDENTIFICATION_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.GOOD_IDENTIFICATION_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return hasTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		boolean oldHasTable = hasTable;
		hasTable = newHasTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.GOOD_IDENTIFICATION_TYPE__HAS_TABLE, oldHasTable, hasTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GoodIdentificationType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (GoodIdentificationType)eResolveProxy(oldParentTypeId);
			if (parentTypeId != oldParentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.GOOD_IDENTIFICATION_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
			}
		}
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoodIdentificationType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(GoodIdentificationType newParentTypeId) {
		GoodIdentificationType oldParentTypeId = parentTypeId;
		parentTypeId = newParentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.GOOD_IDENTIFICATION_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getGoodIdentifications() {
		if (goodIdentifications == null) {
			goodIdentifications = new EDataTypeUniqueEList<String>(String.class, this, ProductPackage.GOOD_IDENTIFICATION_TYPE__GOOD_IDENTIFICATIONS);
		}
		return goodIdentifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childGoodIdentificationTypes() {
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
	public String getGoodIdentificationTypeId() {
		return goodIdentificationTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGoodIdentificationTypeId(String newGoodIdentificationTypeId) {
		String oldGoodIdentificationTypeId = goodIdentificationTypeId;
		goodIdentificationTypeId = newGoodIdentificationTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.GOOD_IDENTIFICATION_TYPE__GOOD_IDENTIFICATION_TYPE_ID, oldGoodIdentificationTypeId, goodIdentificationTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.GOOD_IDENTIFICATION_TYPE__GOOD_IDENTIFICATION_TYPE_ID:
				return getGoodIdentificationTypeId();
			case ProductPackage.GOOD_IDENTIFICATION_TYPE__DESCRIPTION:
				return getDescription();
			case ProductPackage.GOOD_IDENTIFICATION_TYPE__HAS_TABLE:
				return isHasTable();
			case ProductPackage.GOOD_IDENTIFICATION_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
			case ProductPackage.GOOD_IDENTIFICATION_TYPE__GOOD_IDENTIFICATIONS:
				return getGoodIdentifications();
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
			case ProductPackage.GOOD_IDENTIFICATION_TYPE__GOOD_IDENTIFICATION_TYPE_ID:
				setGoodIdentificationTypeId((String)newValue);
				return;
			case ProductPackage.GOOD_IDENTIFICATION_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ProductPackage.GOOD_IDENTIFICATION_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case ProductPackage.GOOD_IDENTIFICATION_TYPE__PARENT_TYPE_ID:
				setParentTypeId((GoodIdentificationType)newValue);
				return;
			case ProductPackage.GOOD_IDENTIFICATION_TYPE__GOOD_IDENTIFICATIONS:
				getGoodIdentifications().clear();
				getGoodIdentifications().addAll((Collection<? extends String>)newValue);
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
			case ProductPackage.GOOD_IDENTIFICATION_TYPE__GOOD_IDENTIFICATION_TYPE_ID:
				setGoodIdentificationTypeId(GOOD_IDENTIFICATION_TYPE_ID_EDEFAULT);
				return;
			case ProductPackage.GOOD_IDENTIFICATION_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ProductPackage.GOOD_IDENTIFICATION_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case ProductPackage.GOOD_IDENTIFICATION_TYPE__PARENT_TYPE_ID:
				setParentTypeId((GoodIdentificationType)null);
				return;
			case ProductPackage.GOOD_IDENTIFICATION_TYPE__GOOD_IDENTIFICATIONS:
				getGoodIdentifications().clear();
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
			case ProductPackage.GOOD_IDENTIFICATION_TYPE__GOOD_IDENTIFICATION_TYPE_ID:
				return GOOD_IDENTIFICATION_TYPE_ID_EDEFAULT == null ? goodIdentificationTypeId != null : !GOOD_IDENTIFICATION_TYPE_ID_EDEFAULT.equals(goodIdentificationTypeId);
			case ProductPackage.GOOD_IDENTIFICATION_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ProductPackage.GOOD_IDENTIFICATION_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case ProductPackage.GOOD_IDENTIFICATION_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
			case ProductPackage.GOOD_IDENTIFICATION_TYPE__GOOD_IDENTIFICATIONS:
				return goodIdentifications != null && !goodIdentifications.isEmpty();
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
		result.append(" (goodIdentificationTypeId: ");
		result.append(goodIdentificationTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(", goodIdentifications: ");
		result.append(goodIdentifications);
		result.append(')');
		return result.toString();
	}

} //GoodIdentificationTypeImpl
