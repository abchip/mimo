/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.config.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.product.config.ConfigPackage;
import org.abchip.mimo.biz.product.config.ProdConfItemContent;
import org.abchip.mimo.biz.product.config.ProdConfItemContentType;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prod Conf Item Content Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProdConfItemContentTypeImpl#getConfItemContentTypeId <em>Conf Item Content Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProdConfItemContentTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProdConfItemContentTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.impl.ProdConfItemContentTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProdConfItemContentTypeImpl extends BizEntityTypeImpl<ProdConfItemContent> implements ProdConfItemContentType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
	protected ProdConfItemContentType parentTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProdConfItemContentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.PROD_CONF_ITEM_CONTENT_TYPE;
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
		hasTable = newHasTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProdConfItemContentType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (ProdConfItemContentType)eResolveProxy(oldParentTypeId);
			if (parentTypeId != oldParentTypeId) {
			}
		}
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProdConfItemContentType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(ProdConfItemContentType newParentTypeId) {
		parentTypeId = newParentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childProdConfItemContentTypes() {
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
			case ConfigPackage.PROD_CONF_ITEM_CONTENT_TYPE__CONF_ITEM_CONTENT_TYPE_ID:
				return getConfItemContentTypeId();
			case ConfigPackage.PROD_CONF_ITEM_CONTENT_TYPE__DESCRIPTION:
				return getDescription();
			case ConfigPackage.PROD_CONF_ITEM_CONTENT_TYPE__HAS_TABLE:
				return isHasTable();
			case ConfigPackage.PROD_CONF_ITEM_CONTENT_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
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
			case ConfigPackage.PROD_CONF_ITEM_CONTENT_TYPE__CONF_ITEM_CONTENT_TYPE_ID:
				setConfItemContentTypeId((String)newValue);
				return;
			case ConfigPackage.PROD_CONF_ITEM_CONTENT_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ConfigPackage.PROD_CONF_ITEM_CONTENT_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case ConfigPackage.PROD_CONF_ITEM_CONTENT_TYPE__PARENT_TYPE_ID:
				setParentTypeId((ProdConfItemContentType)newValue);
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
			case ConfigPackage.PROD_CONF_ITEM_CONTENT_TYPE__CONF_ITEM_CONTENT_TYPE_ID:
				setConfItemContentTypeId(CONF_ITEM_CONTENT_TYPE_ID_EDEFAULT);
				return;
			case ConfigPackage.PROD_CONF_ITEM_CONTENT_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ConfigPackage.PROD_CONF_ITEM_CONTENT_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case ConfigPackage.PROD_CONF_ITEM_CONTENT_TYPE__PARENT_TYPE_ID:
				setParentTypeId((ProdConfItemContentType)null);
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
			case ConfigPackage.PROD_CONF_ITEM_CONTENT_TYPE__CONF_ITEM_CONTENT_TYPE_ID:
				return CONF_ITEM_CONTENT_TYPE_ID_EDEFAULT == null ? confItemContentTypeId != null : !CONF_ITEM_CONTENT_TYPE_ID_EDEFAULT.equals(confItemContentTypeId);
			case ConfigPackage.PROD_CONF_ITEM_CONTENT_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ConfigPackage.PROD_CONF_ITEM_CONTENT_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case ConfigPackage.PROD_CONF_ITEM_CONTENT_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
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
		result.append(" (confItemContentTypeId: ");
		result.append(confItemContentTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(')');
		return result.toString();
	}

} //ProdConfItemContentTypeImpl
