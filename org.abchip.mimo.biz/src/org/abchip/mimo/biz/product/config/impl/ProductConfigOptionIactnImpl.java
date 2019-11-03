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
import org.abchip.mimo.biz.product.config.ProductConfigOptionIactn;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Config Option Iactn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigOptionIactnImpl#getConfigItemId <em>Config Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigOptionIactnImpl#getConfigOptionId <em>Config Option Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigOptionIactnImpl#getConfigItemIdTo <em>Config Item Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigOptionIactnImpl#getConfigOptionIdTo <em>Config Option Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigOptionIactnImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigOptionIactnImpl#getConfigIactnTypeId <em>Config Iactn Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigOptionIactnImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductConfigOptionIactnImpl extends BizEntityImpl implements ProductConfigOptionIactn {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getConfigItemId() <em>Config Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigItemId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_ITEM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigItemId() <em>Config Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigItemId()
	 * @generated
	 * @ordered
	 */
	protected String configItemId = CONFIG_ITEM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigOptionId() <em>Config Option Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigOptionId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_OPTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigOptionId() <em>Config Option Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigOptionId()
	 * @generated
	 * @ordered
	 */
	protected String configOptionId = CONFIG_OPTION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigItemIdTo() <em>Config Item Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigItemIdTo()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_ITEM_ID_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigItemIdTo() <em>Config Item Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigItemIdTo()
	 * @generated
	 * @ordered
	 */
	protected String configItemIdTo = CONFIG_ITEM_ID_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigOptionIdTo() <em>Config Option Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigOptionIdTo()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_OPTION_ID_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigOptionIdTo() <em>Config Option Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigOptionIdTo()
	 * @generated
	 * @ordered
	 */
	protected String configOptionIdTo = CONFIG_OPTION_ID_TO_EDEFAULT;

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
	 * The default value of the '{@link #getConfigIactnTypeId() <em>Config Iactn Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigIactnTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_IACTN_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigIactnTypeId() <em>Config Iactn Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigIactnTypeId()
	 * @generated
	 * @ordered
	 */
	protected String configIactnTypeId = CONFIG_IACTN_TYPE_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductConfigOptionIactnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigIactnTypeId() {
		return configIactnTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigIactnTypeId(String newConfigIactnTypeId) {
		String oldConfigIactnTypeId = configIactnTypeId;
		configIactnTypeId = newConfigIactnTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_IACTN_TYPE_ID, oldConfigIactnTypeId, configIactnTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigOptionId() {
		return configOptionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigOptionId(String newConfigOptionId) {
		String oldConfigOptionId = configOptionId;
		configOptionId = newConfigOptionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_OPTION_ID, oldConfigOptionId, configOptionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigOptionIdTo() {
		return configOptionIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigOptionIdTo(String newConfigOptionIdTo) {
		String oldConfigOptionIdTo = configOptionIdTo;
		configOptionIdTo = newConfigOptionIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_OPTION_ID_TO, oldConfigOptionIdTo, configOptionIdTo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__DESCRIPTION, oldDescription, description));
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
		long oldSequenceNum = sequenceNum;
		sequenceNum = newSequenceNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__SEQUENCE_NUM, oldSequenceNum, sequenceNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigItemId() {
		return configItemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigItemId(String newConfigItemId) {
		String oldConfigItemId = configItemId;
		configItemId = newConfigItemId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_ITEM_ID, oldConfigItemId, configItemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigItemIdTo() {
		return configItemIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigItemIdTo(String newConfigItemIdTo) {
		String oldConfigItemIdTo = configItemIdTo;
		configItemIdTo = newConfigItemIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_ITEM_ID_TO, oldConfigItemIdTo, configItemIdTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_ITEM_ID:
				return getConfigItemId();
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_OPTION_ID:
				return getConfigOptionId();
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_ITEM_ID_TO:
				return getConfigItemIdTo();
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_OPTION_ID_TO:
				return getConfigOptionIdTo();
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__SEQUENCE_NUM:
				return getSequenceNum();
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_IACTN_TYPE_ID:
				return getConfigIactnTypeId();
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__DESCRIPTION:
				return getDescription();
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
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_ITEM_ID:
				setConfigItemId((String)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_OPTION_ID:
				setConfigOptionId((String)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_ITEM_ID_TO:
				setConfigItemIdTo((String)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_OPTION_ID_TO:
				setConfigOptionIdTo((String)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_IACTN_TYPE_ID:
				setConfigIactnTypeId((String)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__DESCRIPTION:
				setDescription((String)newValue);
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
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_ITEM_ID:
				setConfigItemId(CONFIG_ITEM_ID_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_OPTION_ID:
				setConfigOptionId(CONFIG_OPTION_ID_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_ITEM_ID_TO:
				setConfigItemIdTo(CONFIG_ITEM_ID_TO_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_OPTION_ID_TO:
				setConfigOptionIdTo(CONFIG_OPTION_ID_TO_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_IACTN_TYPE_ID:
				setConfigIactnTypeId(CONFIG_IACTN_TYPE_ID_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_ITEM_ID:
				return CONFIG_ITEM_ID_EDEFAULT == null ? configItemId != null : !CONFIG_ITEM_ID_EDEFAULT.equals(configItemId);
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_OPTION_ID:
				return CONFIG_OPTION_ID_EDEFAULT == null ? configOptionId != null : !CONFIG_OPTION_ID_EDEFAULT.equals(configOptionId);
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_ITEM_ID_TO:
				return CONFIG_ITEM_ID_TO_EDEFAULT == null ? configItemIdTo != null : !CONFIG_ITEM_ID_TO_EDEFAULT.equals(configItemIdTo);
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_OPTION_ID_TO:
				return CONFIG_OPTION_ID_TO_EDEFAULT == null ? configOptionIdTo != null : !CONFIG_OPTION_ID_TO_EDEFAULT.equals(configOptionIdTo);
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_IACTN_TYPE_ID:
				return CONFIG_IACTN_TYPE_ID_EDEFAULT == null ? configIactnTypeId != null : !CONFIG_IACTN_TYPE_ID_EDEFAULT.equals(configIactnTypeId);
			case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (configItemId: ");
		result.append(configItemId);
		result.append(", configOptionId: ");
		result.append(configOptionId);
		result.append(", configItemIdTo: ");
		result.append(configItemIdTo);
		result.append(", configOptionIdTo: ");
		result.append(configOptionIdTo);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(", configIactnTypeId: ");
		result.append(configIactnTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ProductConfigOptionIactnImpl
