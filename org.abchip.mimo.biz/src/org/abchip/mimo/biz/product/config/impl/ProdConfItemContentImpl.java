/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.config.impl;

import java.util.Date;

import org.abchip.mimo.biz.content.content.Content;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.product.config.ConfigPackage;
import org.abchip.mimo.biz.product.config.ProdConfItemContent;
import org.abchip.mimo.biz.product.config.ProdConfItemContentType;
import org.abchip.mimo.biz.product.config.ProductConfigItem;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prod Conf Item Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProdConfItemContentImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProdConfItemContentImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProdConfItemContentImpl#getConfigItemId <em>Config Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProdConfItemContentImpl#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProdConfItemContentImpl#getConfItemContentTypeId <em>Conf Item Content Type Id</em>}</li>
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
	 * The cached value of the '{@link #getConfigItemId() <em>Config Item Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigItemId()
	 * @generated
	 * @ordered
	 */
	protected ProductConfigItem configItemId;

	/**
	 * The cached value of the '{@link #getContentId() <em>Content Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected Content contentId;

	/**
	 * The cached value of the '{@link #getConfItemContentTypeId() <em>Conf Item Content Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfItemContentTypeId()
	 * @generated
	 * @ordered
	 */
	protected ProdConfItemContentType confItemContentTypeId;

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
	public Content getContentId() {
		if (contentId != null && ((EObject)contentId).eIsProxy()) {
			InternalEObject oldContentId = (InternalEObject)contentId;
			contentId = (Content)eResolveProxy(oldContentId);
			if (contentId != oldContentId) {
			}
		}
		return contentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Content basicGetContentId() {
		return contentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentId(Content newContentId) {
		contentId = newContentId;
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
	public ProdConfItemContentType getConfItemContentTypeId() {
		if (confItemContentTypeId != null && ((EObject)confItemContentTypeId).eIsProxy()) {
			InternalEObject oldConfItemContentTypeId = (InternalEObject)confItemContentTypeId;
			confItemContentTypeId = (ProdConfItemContentType)eResolveProxy(oldConfItemContentTypeId);
			if (confItemContentTypeId != oldConfItemContentTypeId) {
			}
		}
		return confItemContentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProdConfItemContentType basicGetConfItemContentTypeId() {
		return confItemContentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfItemContentTypeId(ProdConfItemContentType newConfItemContentTypeId) {
		confItemContentTypeId = newConfItemContentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__FROM_DATE:
				return getFromDate();
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__THRU_DATE:
				return getThruDate();
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__CONFIG_ITEM_ID:
				if (resolve) return getConfigItemId();
				return basicGetConfigItemId();
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__CONTENT_ID:
				if (resolve) return getContentId();
				return basicGetContentId();
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__CONF_ITEM_CONTENT_TYPE_ID:
				if (resolve) return getConfItemContentTypeId();
				return basicGetConfItemContentTypeId();
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
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__CONFIG_ITEM_ID:
				setConfigItemId((ProductConfigItem)newValue);
				return;
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__CONTENT_ID:
				setContentId((Content)newValue);
				return;
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__CONF_ITEM_CONTENT_TYPE_ID:
				setConfItemContentTypeId((ProdConfItemContentType)newValue);
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
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__CONFIG_ITEM_ID:
				setConfigItemId((ProductConfigItem)null);
				return;
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__CONTENT_ID:
				setContentId((Content)null);
				return;
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__CONF_ITEM_CONTENT_TYPE_ID:
				setConfItemContentTypeId((ProdConfItemContentType)null);
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
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__CONFIG_ITEM_ID:
				return configItemId != null;
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__CONTENT_ID:
				return contentId != null;
			case ConfigPackage.PROD_CONF_ITEM_CONTENT__CONF_ITEM_CONTENT_TYPE_ID:
				return confItemContentTypeId != null;
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
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //ProdConfItemContentImpl
