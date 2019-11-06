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
import org.abchip.mimo.biz.product.config.ProductConfigItem;
import org.abchip.mimo.biz.product.config.ProductConfigOption;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Config Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigOptionImpl#getConfigOptionId <em>Config Option Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigOptionImpl#getConfigOptionName <em>Config Option Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigOptionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigOptionImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigOptionImpl#getConfigItemId <em>Config Item Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductConfigOptionImpl extends BizEntityImpl implements ProductConfigOption {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
	 * The default value of the '{@link #getConfigOptionName() <em>Config Option Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigOptionName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_OPTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigOptionName() <em>Config Option Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigOptionName()
	 * @generated
	 * @ordered
	 */
	protected String configOptionName = CONFIG_OPTION_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getConfigItemId() <em>Config Item Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigItemId()
	 * @generated
	 * @ordered
	 */
	protected ProductConfigItem configItemId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductConfigOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.PRODUCT_CONFIG_OPTION;
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
		configOptionId = newConfigOptionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigOptionName() {
		return configOptionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigOptionName(String newConfigOptionName) {
		configOptionName = newConfigOptionName;
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
	public ProductConfigItem getConfigItemId() {
		if (configItemId != null && ((EObject)configItemId).eIsProxy()) {
			InternalEObject oldConfigItemId = (InternalEObject)configItemId;
			configItemId = (ProductConfigItem)eResolveProxy(oldConfigItemId);
			if (configItemId != oldConfigItemId) {
			}
		}
		return configItemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductConfigItem basicGetConfigItemId() {
		return configItemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigItemId(ProductConfigItem newConfigItemId) {
		configItemId = newConfigItemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.PRODUCT_CONFIG_OPTION__CONFIG_OPTION_ID:
				return getConfigOptionId();
			case ConfigPackage.PRODUCT_CONFIG_OPTION__CONFIG_OPTION_NAME:
				return getConfigOptionName();
			case ConfigPackage.PRODUCT_CONFIG_OPTION__DESCRIPTION:
				return getDescription();
			case ConfigPackage.PRODUCT_CONFIG_OPTION__SEQUENCE_NUM:
				return getSequenceNum();
			case ConfigPackage.PRODUCT_CONFIG_OPTION__CONFIG_ITEM_ID:
				if (resolve) return getConfigItemId();
				return basicGetConfigItemId();
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
			case ConfigPackage.PRODUCT_CONFIG_OPTION__CONFIG_OPTION_ID:
				setConfigOptionId((String)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG_OPTION__CONFIG_OPTION_NAME:
				setConfigOptionName((String)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG_OPTION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG_OPTION__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG_OPTION__CONFIG_ITEM_ID:
				setConfigItemId((ProductConfigItem)newValue);
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
			case ConfigPackage.PRODUCT_CONFIG_OPTION__CONFIG_OPTION_ID:
				setConfigOptionId(CONFIG_OPTION_ID_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG_OPTION__CONFIG_OPTION_NAME:
				setConfigOptionName(CONFIG_OPTION_NAME_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG_OPTION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG_OPTION__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG_OPTION__CONFIG_ITEM_ID:
				setConfigItemId((ProductConfigItem)null);
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
			case ConfigPackage.PRODUCT_CONFIG_OPTION__CONFIG_OPTION_ID:
				return CONFIG_OPTION_ID_EDEFAULT == null ? configOptionId != null : !CONFIG_OPTION_ID_EDEFAULT.equals(configOptionId);
			case ConfigPackage.PRODUCT_CONFIG_OPTION__CONFIG_OPTION_NAME:
				return CONFIG_OPTION_NAME_EDEFAULT == null ? configOptionName != null : !CONFIG_OPTION_NAME_EDEFAULT.equals(configOptionName);
			case ConfigPackage.PRODUCT_CONFIG_OPTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ConfigPackage.PRODUCT_CONFIG_OPTION__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case ConfigPackage.PRODUCT_CONFIG_OPTION__CONFIG_ITEM_ID:
				return configItemId != null;
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
		result.append(" (configOptionId: ");
		result.append(configOptionId);
		result.append(", configOptionName: ");
		result.append(configOptionName);
		result.append(", description: ");
		result.append(description);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(')');
		return result.toString();
	}

} //ProductConfigOptionImpl
