/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.impl;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.BizPackage;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityNameableImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OF Biz Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.impl.BizEntityImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.impl.BizEntityImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.impl.BizEntityImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.impl.BizEntityImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BizEntityImpl extends EntityNameableImpl implements BizEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getCreatedStamp() <em>Created Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedStamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedStamp() <em>Created Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedStamp()
	 * @generated
	 * @ordered
	 */
	protected Date createdStamp = CREATED_STAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedTxStamp() <em>Created Tx Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedTxStamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_TX_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedTxStamp() <em>Created Tx Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedTxStamp()
	 * @generated
	 * @ordered
	 */
	protected Date createdTxStamp = CREATED_TX_STAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastUpdatedStamp() <em>Last Updated Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdatedStamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_UPDATED_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastUpdatedStamp() <em>Last Updated Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdatedStamp()
	 * @generated
	 * @ordered
	 */
	protected Date lastUpdatedStamp = LAST_UPDATED_STAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastUpdatedTxStamp() <em>Last Updated Tx Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdatedTxStamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_UPDATED_TX_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastUpdatedTxStamp() <em>Last Updated Tx Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdatedTxStamp()
	 * @generated
	 * @ordered
	 */
	protected Date lastUpdatedTxStamp = LAST_UPDATED_TX_STAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BizEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BizPackage.Literals.BIZ_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedStamp() {
		return createdStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedStamp(Date newCreatedStamp) {
		Date oldCreatedStamp = createdStamp;
		createdStamp = newCreatedStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BizPackage.BIZ_ENTITY__CREATED_STAMP, oldCreatedStamp, createdStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedTxStamp() {
		return createdTxStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedTxStamp(Date newCreatedTxStamp) {
		Date oldCreatedTxStamp = createdTxStamp;
		createdTxStamp = newCreatedTxStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BizPackage.BIZ_ENTITY__CREATED_TX_STAMP, oldCreatedTxStamp, createdTxStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedStamp() {
		return lastUpdatedStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedStamp(Date newLastUpdatedStamp) {
		Date oldLastUpdatedStamp = lastUpdatedStamp;
		lastUpdatedStamp = newLastUpdatedStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP, oldLastUpdatedStamp, lastUpdatedStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedTxStamp() {
		return lastUpdatedTxStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedTxStamp(Date newLastUpdatedTxStamp) {
		Date oldLastUpdatedTxStamp = lastUpdatedTxStamp;
		lastUpdatedTxStamp = newLastUpdatedTxStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP, oldLastUpdatedTxStamp, lastUpdatedTxStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BizPackage.BIZ_ENTITY__CREATED_STAMP:
				return getCreatedStamp();
			case BizPackage.BIZ_ENTITY__CREATED_TX_STAMP:
				return getCreatedTxStamp();
			case BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP:
				return getLastUpdatedStamp();
			case BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP:
				return getLastUpdatedTxStamp();
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
			case BizPackage.BIZ_ENTITY__CREATED_STAMP:
				setCreatedStamp((Date)newValue);
				return;
			case BizPackage.BIZ_ENTITY__CREATED_TX_STAMP:
				setCreatedTxStamp((Date)newValue);
				return;
			case BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP:
				setLastUpdatedStamp((Date)newValue);
				return;
			case BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP:
				setLastUpdatedTxStamp((Date)newValue);
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
			case BizPackage.BIZ_ENTITY__CREATED_STAMP:
				setCreatedStamp(CREATED_STAMP_EDEFAULT);
				return;
			case BizPackage.BIZ_ENTITY__CREATED_TX_STAMP:
				setCreatedTxStamp(CREATED_TX_STAMP_EDEFAULT);
				return;
			case BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP:
				setLastUpdatedStamp(LAST_UPDATED_STAMP_EDEFAULT);
				return;
			case BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP:
				setLastUpdatedTxStamp(LAST_UPDATED_TX_STAMP_EDEFAULT);
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
			case BizPackage.BIZ_ENTITY__CREATED_STAMP:
				return CREATED_STAMP_EDEFAULT == null ? createdStamp != null : !CREATED_STAMP_EDEFAULT.equals(createdStamp);
			case BizPackage.BIZ_ENTITY__CREATED_TX_STAMP:
				return CREATED_TX_STAMP_EDEFAULT == null ? createdTxStamp != null : !CREATED_TX_STAMP_EDEFAULT.equals(createdTxStamp);
			case BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP:
				return LAST_UPDATED_STAMP_EDEFAULT == null ? lastUpdatedStamp != null : !LAST_UPDATED_STAMP_EDEFAULT.equals(lastUpdatedStamp);
			case BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP:
				return LAST_UPDATED_TX_STAMP_EDEFAULT == null ? lastUpdatedTxStamp != null : !LAST_UPDATED_TX_STAMP_EDEFAULT.equals(lastUpdatedTxStamp);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (derivedFeatureID) {
				case BizPackage.BIZ_ENTITY__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case BizPackage.BIZ_ENTITY__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (baseFeatureID) {
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return BizPackage.BIZ_ENTITY__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (createdStamp: ");
		result.append(createdStamp);
		result.append(", createdTxStamp: ");
		result.append(createdTxStamp);
		result.append(", lastUpdatedStamp: ");
		result.append(lastUpdatedStamp);
		result.append(", lastUpdatedTxStamp: ");
		result.append(lastUpdatedTxStamp);
		result.append(')');
		return result.toString();
	}

} //BizEntityImpl
