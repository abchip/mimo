/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.config.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.config.ConfigPackage;
import org.abchip.mimo.biz.product.config.ProductConfig;
import org.abchip.mimo.biz.product.config.ProductConfigItem;
import org.abchip.mimo.biz.product.product.Product;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigImpl#getConfigTypeId <em>Config Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigImpl#getDefaultConfigOptionId <em>Default Config Option Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigImpl#isIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigImpl#getLongDescription <em>Long Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigImpl#getConfigItemId <em>Config Item Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductConfigImpl extends BizEntityImpl implements ProductConfig {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
	 * The default value of the '{@link #getDefaultConfigOptionId() <em>Default Config Option Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultConfigOptionId()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_CONFIG_OPTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultConfigOptionId() <em>Default Config Option Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultConfigOptionId()
	 * @generated
	 * @ordered
	 */
	protected String defaultConfigOptionId = DEFAULT_CONFIG_OPTION_ID_EDEFAULT;

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
	 * The default value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean isMandatory = IS_MANDATORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongDescription() <em>Long Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String LONG_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongDescription() <em>Long Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongDescription()
	 * @generated
	 * @ordered
	 */
	protected String longDescription = LONG_DESCRIPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected Product productId;

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
	protected ProductConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.PRODUCT_CONFIG;
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
		configTypeId = newConfigTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultConfigOptionId() {
		return defaultConfigOptionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultConfigOptionId(String newDefaultConfigOptionId) {
		defaultConfigOptionId = newDefaultConfigOptionId;
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
	public boolean isIsMandatory() {
		return isMandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsMandatory(boolean newIsMandatory) {
		isMandatory = newIsMandatory;
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
	public String getLongDescription() {
		return longDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongDescription(String newLongDescription) {
		longDescription = newLongDescription;
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
		productId = newProductId;
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
			case ConfigPackage.PRODUCT_CONFIG__SEQUENCE_NUM:
				return getSequenceNum();
			case ConfigPackage.PRODUCT_CONFIG__FROM_DATE:
				return getFromDate();
			case ConfigPackage.PRODUCT_CONFIG__CONFIG_TYPE_ID:
				return getConfigTypeId();
			case ConfigPackage.PRODUCT_CONFIG__DEFAULT_CONFIG_OPTION_ID:
				return getDefaultConfigOptionId();
			case ConfigPackage.PRODUCT_CONFIG__DESCRIPTION:
				return getDescription();
			case ConfigPackage.PRODUCT_CONFIG__IS_MANDATORY:
				return isIsMandatory();
			case ConfigPackage.PRODUCT_CONFIG__LONG_DESCRIPTION:
				return getLongDescription();
			case ConfigPackage.PRODUCT_CONFIG__THRU_DATE:
				return getThruDate();
			case ConfigPackage.PRODUCT_CONFIG__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case ConfigPackage.PRODUCT_CONFIG__CONFIG_ITEM_ID:
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
			case ConfigPackage.PRODUCT_CONFIG__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG__CONFIG_TYPE_ID:
				setConfigTypeId((String)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG__DEFAULT_CONFIG_OPTION_ID:
				setDefaultConfigOptionId((String)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG__IS_MANDATORY:
				setIsMandatory((Boolean)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG__LONG_DESCRIPTION:
				setLongDescription((String)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG__CONFIG_ITEM_ID:
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
			case ConfigPackage.PRODUCT_CONFIG__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG__CONFIG_TYPE_ID:
				setConfigTypeId(CONFIG_TYPE_ID_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG__DEFAULT_CONFIG_OPTION_ID:
				setDefaultConfigOptionId(DEFAULT_CONFIG_OPTION_ID_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG__IS_MANDATORY:
				setIsMandatory(IS_MANDATORY_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG__LONG_DESCRIPTION:
				setLongDescription(LONG_DESCRIPTION_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case ConfigPackage.PRODUCT_CONFIG__CONFIG_ITEM_ID:
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
			case ConfigPackage.PRODUCT_CONFIG__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case ConfigPackage.PRODUCT_CONFIG__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case ConfigPackage.PRODUCT_CONFIG__CONFIG_TYPE_ID:
				return CONFIG_TYPE_ID_EDEFAULT == null ? configTypeId != null : !CONFIG_TYPE_ID_EDEFAULT.equals(configTypeId);
			case ConfigPackage.PRODUCT_CONFIG__DEFAULT_CONFIG_OPTION_ID:
				return DEFAULT_CONFIG_OPTION_ID_EDEFAULT == null ? defaultConfigOptionId != null : !DEFAULT_CONFIG_OPTION_ID_EDEFAULT.equals(defaultConfigOptionId);
			case ConfigPackage.PRODUCT_CONFIG__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ConfigPackage.PRODUCT_CONFIG__IS_MANDATORY:
				return isMandatory != IS_MANDATORY_EDEFAULT;
			case ConfigPackage.PRODUCT_CONFIG__LONG_DESCRIPTION:
				return LONG_DESCRIPTION_EDEFAULT == null ? longDescription != null : !LONG_DESCRIPTION_EDEFAULT.equals(longDescription);
			case ConfigPackage.PRODUCT_CONFIG__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case ConfigPackage.PRODUCT_CONFIG__PRODUCT_ID:
				return productId != null;
			case ConfigPackage.PRODUCT_CONFIG__CONFIG_ITEM_ID:
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
		result.append(" (sequenceNum: ");
		result.append(sequenceNum);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", configTypeId: ");
		result.append(configTypeId);
		result.append(", defaultConfigOptionId: ");
		result.append(defaultConfigOptionId);
		result.append(", description: ");
		result.append(description);
		result.append(", isMandatory: ");
		result.append(isMandatory);
		result.append(", longDescription: ");
		result.append(longDescription);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //ProductConfigImpl
