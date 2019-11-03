/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.config.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.product.config.ConfigPackage;
import org.abchip.mimo.biz.product.config.ProdConfItemContent;
import org.abchip.mimo.biz.product.config.ProdConfItemContentType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prod Conf Item Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProdConfItemContentImpl#getConfigItemId <em>Config Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProdConfItemContentImpl#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProdConfItemContentImpl#getConfItemContentTypeId <em>Conf Item Content Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProdConfItemContentImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProdConfItemContentImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProdConfItemContentImpl extends BizEntityTypedImpl<ProdConfItemContentType> implements ProdConfItemContent {
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
	 * The default value of the '{@link #getContentId() <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentId() <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected String contentId = CONTENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfItemContentTypeId() <em>Conf Item Content Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfItemContentTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONF_ITEM_CONTENT_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfItemContentTypeId() <em>Conf Item Content Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfItemContentTypeId()
	 * @generated
	 * @ordered
	 */
	protected String confItemContentTypeId = CONF_ITEM_CONTENT_TYPE_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProdConfItemContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.PROD_CONF_ITEM_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentId() {
		return contentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentId(String newContentId) {
		String oldContentId = contentId;
		contentId = newContentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PROD_CONF_ITEM_CONTENT__CONTENT_ID, oldContentId, contentId));
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
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PROD_CONF_ITEM_CONTENT__FROM_DATE, oldFromDate, fromDate));
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
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PROD_CONF_ITEM_CONTENT__THRU_DATE, oldThruDate, thruDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PROD_CONF_ITEM_CONTENT__CONFIG_ITEM_ID, oldConfigItemId, configItemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfItemContentTypeId() {
		return confItemContentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfItemContentTypeId(String newConfItemContentTypeId) {
		String oldConfItemContentTypeId = confItemContentTypeId;
		confItemContentTypeId = newConfItemContentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PROD_CONF_ITEM_CONTENT__CONF_ITEM_CONTENT_TYPE_ID, oldConfItemContentTypeId, confItemContentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__CONFIG_ITEM_ID:
				return getConfigItemId();
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__CONTENT_ID:
				return getContentId();
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__CONF_ITEM_CONTENT_TYPE_ID:
				return getConfItemContentTypeId();
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__FROM_DATE:
				return getFromDate();
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__THRU_DATE:
				return getThruDate();
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
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__CONFIG_ITEM_ID:
				setConfigItemId((String)newValue);
				return;
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__CONTENT_ID:
				setContentId((String)newValue);
				return;
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__CONF_ITEM_CONTENT_TYPE_ID:
				setConfItemContentTypeId((String)newValue);
				return;
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__THRU_DATE:
				setThruDate((Date)newValue);
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
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__CONFIG_ITEM_ID:
				setConfigItemId(CONFIG_ITEM_ID_EDEFAULT);
				return;
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__CONTENT_ID:
				setContentId(CONTENT_ID_EDEFAULT);
				return;
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__CONF_ITEM_CONTENT_TYPE_ID:
				setConfItemContentTypeId(CONF_ITEM_CONTENT_TYPE_ID_EDEFAULT);
				return;
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
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
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__CONFIG_ITEM_ID:
				return CONFIG_ITEM_ID_EDEFAULT == null ? configItemId != null : !CONFIG_ITEM_ID_EDEFAULT.equals(configItemId);
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__CONTENT_ID:
				return CONTENT_ID_EDEFAULT == null ? contentId != null : !CONTENT_ID_EDEFAULT.equals(contentId);
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__CONF_ITEM_CONTENT_TYPE_ID:
				return CONF_ITEM_CONTENT_TYPE_ID_EDEFAULT == null ? confItemContentTypeId != null : !CONF_ITEM_CONTENT_TYPE_ID_EDEFAULT.equals(confItemContentTypeId);
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
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
		result.append(", contentId: ");
		result.append(contentId);
		result.append(", confItemContentTypeId: ");
		result.append(confItemContentTypeId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //ProdConfItemContentImpl
