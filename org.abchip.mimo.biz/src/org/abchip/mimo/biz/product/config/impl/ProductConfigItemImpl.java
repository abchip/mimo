/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.config.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.config.ConfigPackage;
import org.abchip.mimo.biz.product.config.ProductConfigItem;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Config Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigItemImpl#getConfigItemId <em>Config Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigItemImpl#getConfigItemName <em>Config Item Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigItemImpl#getConfigItemTypeId <em>Config Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigItemImpl#getImageUrl <em>Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigItemImpl#getLongDescription <em>Long Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProductConfigItemImpl#getConfigItemProductConfigOptions <em>Config Item Product Config Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductConfigItemImpl extends BizEntityImpl implements ProductConfigItem {
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
	 * The default value of the '{@link #getConfigItemName() <em>Config Item Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigItemName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_ITEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigItemName() <em>Config Item Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigItemName()
	 * @generated
	 * @ordered
	 */
	protected String configItemName = CONFIG_ITEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigItemTypeId() <em>Config Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_ITEM_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigItemTypeId() <em>Config Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected String configItemTypeId = CONFIG_ITEM_TYPE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getImageUrl() <em>Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageUrl() <em>Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUrl()
	 * @generated
	 * @ordered
	 */
	protected String imageUrl = IMAGE_URL_EDEFAULT;

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
	 * The cached value of the '{@link #getConfigItemProductConfigOptions() <em>Config Item Product Config Options</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigItemProductConfigOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> configItemProductConfigOptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductConfigItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.PRODUCT_CONFIG_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigItemName() {
		return configItemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigItemName(String newConfigItemName) {
		String oldConfigItemName = configItemName;
		configItemName = newConfigItemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PRODUCT_CONFIG_ITEM__CONFIG_ITEM_NAME, oldConfigItemName, configItemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigItemTypeId() {
		return configItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigItemTypeId(String newConfigItemTypeId) {
		String oldConfigItemTypeId = configItemTypeId;
		configItemTypeId = newConfigItemTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PRODUCT_CONFIG_ITEM__CONFIG_ITEM_TYPE_ID, oldConfigItemTypeId, configItemTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PRODUCT_CONFIG_ITEM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageUrl(String newImageUrl) {
		String oldImageUrl = imageUrl;
		imageUrl = newImageUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PRODUCT_CONFIG_ITEM__IMAGE_URL, oldImageUrl, imageUrl));
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
		String oldLongDescription = longDescription;
		longDescription = newLongDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PRODUCT_CONFIG_ITEM__LONG_DESCRIPTION, oldLongDescription, longDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getConfigItemProductConfigOptions() {
		if (configItemProductConfigOptions == null) {
			configItemProductConfigOptions = new EDataTypeUniqueEList<String>(String.class, this, ConfigPackage.PRODUCT_CONFIG_ITEM__CONFIG_ITEM_PRODUCT_CONFIG_OPTIONS);
		}
		return configItemProductConfigOptions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PRODUCT_CONFIG_ITEM__CONFIG_ITEM_ID, oldConfigItemId, configItemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.PRODUCT_CONFIG_ITEM__CONFIG_ITEM_ID:
				return getConfigItemId();
			case ConfigPackage.PRODUCT_CONFIG_ITEM__CONFIG_ITEM_NAME:
				return getConfigItemName();
			case ConfigPackage.PRODUCT_CONFIG_ITEM__CONFIG_ITEM_TYPE_ID:
				return getConfigItemTypeId();
			case ConfigPackage.PRODUCT_CONFIG_ITEM__DESCRIPTION:
				return getDescription();
			case ConfigPackage.PRODUCT_CONFIG_ITEM__IMAGE_URL:
				return getImageUrl();
			case ConfigPackage.PRODUCT_CONFIG_ITEM__LONG_DESCRIPTION:
				return getLongDescription();
			case ConfigPackage.PRODUCT_CONFIG_ITEM__CONFIG_ITEM_PRODUCT_CONFIG_OPTIONS:
				return getConfigItemProductConfigOptions();
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
			case ConfigPackage.PRODUCT_CONFIG_ITEM__CONFIG_ITEM_ID:
				setConfigItemId((String)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG_ITEM__CONFIG_ITEM_NAME:
				setConfigItemName((String)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG_ITEM__CONFIG_ITEM_TYPE_ID:
				setConfigItemTypeId((String)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG_ITEM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG_ITEM__IMAGE_URL:
				setImageUrl((String)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG_ITEM__LONG_DESCRIPTION:
				setLongDescription((String)newValue);
				return;
			case ConfigPackage.PRODUCT_CONFIG_ITEM__CONFIG_ITEM_PRODUCT_CONFIG_OPTIONS:
				getConfigItemProductConfigOptions().clear();
				getConfigItemProductConfigOptions().addAll((Collection<? extends String>)newValue);
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
			case ConfigPackage.PRODUCT_CONFIG_ITEM__CONFIG_ITEM_ID:
				setConfigItemId(CONFIG_ITEM_ID_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG_ITEM__CONFIG_ITEM_NAME:
				setConfigItemName(CONFIG_ITEM_NAME_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG_ITEM__CONFIG_ITEM_TYPE_ID:
				setConfigItemTypeId(CONFIG_ITEM_TYPE_ID_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG_ITEM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG_ITEM__IMAGE_URL:
				setImageUrl(IMAGE_URL_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG_ITEM__LONG_DESCRIPTION:
				setLongDescription(LONG_DESCRIPTION_EDEFAULT);
				return;
			case ConfigPackage.PRODUCT_CONFIG_ITEM__CONFIG_ITEM_PRODUCT_CONFIG_OPTIONS:
				getConfigItemProductConfigOptions().clear();
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
			case ConfigPackage.PRODUCT_CONFIG_ITEM__CONFIG_ITEM_ID:
				return CONFIG_ITEM_ID_EDEFAULT == null ? configItemId != null : !CONFIG_ITEM_ID_EDEFAULT.equals(configItemId);
			case ConfigPackage.PRODUCT_CONFIG_ITEM__CONFIG_ITEM_NAME:
				return CONFIG_ITEM_NAME_EDEFAULT == null ? configItemName != null : !CONFIG_ITEM_NAME_EDEFAULT.equals(configItemName);
			case ConfigPackage.PRODUCT_CONFIG_ITEM__CONFIG_ITEM_TYPE_ID:
				return CONFIG_ITEM_TYPE_ID_EDEFAULT == null ? configItemTypeId != null : !CONFIG_ITEM_TYPE_ID_EDEFAULT.equals(configItemTypeId);
			case ConfigPackage.PRODUCT_CONFIG_ITEM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ConfigPackage.PRODUCT_CONFIG_ITEM__IMAGE_URL:
				return IMAGE_URL_EDEFAULT == null ? imageUrl != null : !IMAGE_URL_EDEFAULT.equals(imageUrl);
			case ConfigPackage.PRODUCT_CONFIG_ITEM__LONG_DESCRIPTION:
				return LONG_DESCRIPTION_EDEFAULT == null ? longDescription != null : !LONG_DESCRIPTION_EDEFAULT.equals(longDescription);
			case ConfigPackage.PRODUCT_CONFIG_ITEM__CONFIG_ITEM_PRODUCT_CONFIG_OPTIONS:
				return configItemProductConfigOptions != null && !configItemProductConfigOptions.isEmpty();
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
		result.append(", configItemName: ");
		result.append(configItemName);
		result.append(", configItemTypeId: ");
		result.append(configItemTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", imageUrl: ");
		result.append(imageUrl);
		result.append(", longDescription: ");
		result.append(longDescription);
		result.append(", configItemProductConfigOptions: ");
		result.append(configItemProductConfigOptions);
		result.append(')');
		return result.toString();
	}

} //ProductConfigItemImpl
