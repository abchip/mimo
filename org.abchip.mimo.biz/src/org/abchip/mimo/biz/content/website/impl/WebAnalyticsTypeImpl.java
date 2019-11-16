/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.website.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.abchip.mimo.biz.content.website.WebAnalyticsType;
import org.abchip.mimo.biz.content.website.WebsitePackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Analytics Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebAnalyticsTypeImpl#getWebAnalyticsTypeId <em>Web Analytics Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebAnalyticsTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebAnalyticsTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebAnalyticsTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebAnalyticsTypeImpl extends BizEntityImpl implements WebAnalyticsType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebAnalyticsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.WEB_ANALYTICS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(WebsitePackage.Literals.WEB_ANALYTICS_TYPE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(WebsitePackage.Literals.WEB_ANALYTICS_TYPE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return (Boolean)eGet(WebsitePackage.Literals.WEB_ANALYTICS_TYPE__HAS_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		eSet(WebsitePackage.Literals.WEB_ANALYTICS_TYPE__HAS_TABLE, newHasTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebAnalyticsType getParentTypeId() {
		return (WebAnalyticsType)eGet(WebsitePackage.Literals.WEB_ANALYTICS_TYPE__PARENT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(WebAnalyticsType newParentTypeId) {
		eSet(WebsitePackage.Literals.WEB_ANALYTICS_TYPE__PARENT_TYPE_ID, newParentTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childWebAnalyticsTypes() {
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
	public List<String> webAnalyticsConfigs() {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case WebsitePackage.WEB_ANALYTICS_TYPE___CHILD_WEB_ANALYTICS_TYPES:
				return childWebAnalyticsTypes();
			case WebsitePackage.WEB_ANALYTICS_TYPE___WEB_ANALYTICS_CONFIGS:
				return webAnalyticsConfigs();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebAnalyticsTypeId() {
		return (String)eGet(WebsitePackage.Literals.WEB_ANALYTICS_TYPE__WEB_ANALYTICS_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebAnalyticsTypeId(String newWebAnalyticsTypeId) {
		eSet(WebsitePackage.Literals.WEB_ANALYTICS_TYPE__WEB_ANALYTICS_TYPE_ID, newWebAnalyticsTypeId);
	}

} //WebAnalyticsTypeImpl
