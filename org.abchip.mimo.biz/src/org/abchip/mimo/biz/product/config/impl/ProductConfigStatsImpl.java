/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.config.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.config.ConfigPackage;
import org.abchip.mimo.biz.product.config.ProductConfigStats;
import org.abchip.mimo.biz.product.product.Product;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Config Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigStatsImpl#getConfigId <em>Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigStatsImpl#getConfigTypeId <em>Config Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigStatsImpl#getNumOfConfs <em>Num Of Confs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigStatsImpl#getProductId <em>Product Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductConfigStatsImpl extends BizEntityImpl implements ProductConfigStats {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getConfigId() <em>Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigId() <em>Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigId()
	 * @generated
	 * @ordered
	 */
	protected String configId = CONFIG_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigTypeId() <em>Config Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigTypeId() <em>Config Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigTypeId()
	 * @generated
	 * @ordered
	 */
	protected String configTypeId = CONFIG_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumOfConfs() <em>Num Of Confs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfConfs()
	 * @generated
	 * @ordered
	 */
	protected static final long NUM_OF_CONFS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumOfConfs() <em>Num Of Confs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfConfs()
	 * @generated
	 * @ordered
	 */
	protected long numOfConfs = NUM_OF_CONFS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected Product productId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductConfigStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.PRODUCT_CONFIG_STATS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigId() {
		return configId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigId(String newConfigId) {
		String oldConfigId = configId;
		configId = newConfigId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PRODUCT_CONFIG_STATS__CONFIG_ID, oldConfigId, configId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigTypeId() {
		return configTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigTypeId(String newConfigTypeId) {
		String oldConfigTypeId = configTypeId;
		configTypeId = newConfigTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PRODUCT_CONFIG_STATS__CONFIG_TYPE_ID, oldConfigTypeId, configTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getNumOfConfs() {
		return numOfConfs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumOfConfs(long newNumOfConfs) {
		long oldNumOfConfs = numOfConfs;
		numOfConfs = newNumOfConfs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PRODUCT_CONFIG_STATS__NUM_OF_CONFS, oldNumOfConfs, numOfConfs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductId() {
		if (productId != null && ((EObject)productId).eIsProxy()) {
			InternalEObject oldProductId = (InternalEObject)productId;
			productId = (Product)eResolveProxy(oldProductId);
			if (productId != oldProductId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigPackage.PRODUCT_CONFIG_STATS__PRODUCT_ID, oldProductId, productId));
			}
		}
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		Product oldProductId = productId;
		productId = newProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PRODUCT_CONFIG_STATS__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.PRODUCT_CONFIG_STATS__CONFIG_ID:
				return getConfigId();
			case ConfigPackage.PRODUCT_CONFIG_STATS__CONFIG_TYPE_ID:
				return getConfigTypeId();
			case ConfigPackage.PRODUCT_CONFIG_STATS__NUM_OF_CONFS:
				return getNumOfConfs();
			case ConfigPackage.PRODUCT_CONFIG_STATS__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
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
			case ConfigPackage.PRODUCT_CONFIG_STATS__CONFIG_ID:
				setConfigId((String)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG_STATS__CONFIG_TYPE_ID:
				setConfigTypeId((String)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG_STATS__NUM_OF_CONFS:
				setNumOfConfs((Long)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG_STATS__PRODUCT_ID:
				setProductId((Product)newValue);
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
			case ConfigPackage.PRODUCT_CONFIG_STATS__CONFIG_ID:
				setConfigId(CONFIG_ID_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG_STATS__CONFIG_TYPE_ID:
				setConfigTypeId(CONFIG_TYPE_ID_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG_STATS__NUM_OF_CONFS:
				setNumOfConfs(NUM_OF_CONFS_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG_STATS__PRODUCT_ID:
				setProductId((Product)null);
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
			case ConfigPackage.PRODUCT_CONFIG_STATS__CONFIG_ID:
				return CONFIG_ID_EDEFAULT == null ? configId != null : !CONFIG_ID_EDEFAULT.equals(configId);
			case ConfigPackage.PRODUCT_CONFIG_STATS__CONFIG_TYPE_ID:
				return CONFIG_TYPE_ID_EDEFAULT == null ? configTypeId != null : !CONFIG_TYPE_ID_EDEFAULT.equals(configTypeId);
			case ConfigPackage.PRODUCT_CONFIG_STATS__NUM_OF_CONFS:
				return numOfConfs != NUM_OF_CONFS_EDEFAULT;
			case ConfigPackage.PRODUCT_CONFIG_STATS__PRODUCT_ID:
				return productId != null;
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
		result.append(" (configId: ");
		result.append(configId);
		result.append(", configTypeId: ");
		result.append(configTypeId);
		result.append(", numOfConfs: ");
		result.append(numOfConfs);
		result.append(')');
		return result.toString();
	}

} //ProductConfigStatsImpl
