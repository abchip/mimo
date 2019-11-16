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

import org.abchip.mimo.biz.content.website.WebSiteContent;
import org.abchip.mimo.biz.content.website.WebSiteContentType;
import org.abchip.mimo.biz.content.website.WebsitePackage;
import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Site Content Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebSiteContentTypeImpl#getWebSiteContentTypeId <em>Web Site Content Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebSiteContentTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebSiteContentTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebSiteContentTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebSiteContentTypeImpl extends BizEntityTypeImpl<WebSiteContent> implements WebSiteContentType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebSiteContentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.WEB_SITE_CONTENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(WebsitePackage.Literals.WEB_SITE_CONTENT_TYPE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(WebsitePackage.Literals.WEB_SITE_CONTENT_TYPE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return (Boolean)eGet(WebsitePackage.Literals.WEB_SITE_CONTENT_TYPE__HAS_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		eSet(WebsitePackage.Literals.WEB_SITE_CONTENT_TYPE__HAS_TABLE, newHasTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebSiteContentType getParentTypeId() {
		return (WebSiteContentType)eGet(WebsitePackage.Literals.WEB_SITE_CONTENT_TYPE__PARENT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(WebSiteContentType newParentTypeId) {
		eSet(WebsitePackage.Literals.WEB_SITE_CONTENT_TYPE__PARENT_TYPE_ID, newParentTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childWebSiteContentTypes() {
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
			case WebsitePackage.WEB_SITE_CONTENT_TYPE___CHILD_WEB_SITE_CONTENT_TYPES:
				return childWebSiteContentTypes();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebSiteContentTypeId() {
		return (String)eGet(WebsitePackage.Literals.WEB_SITE_CONTENT_TYPE__WEB_SITE_CONTENT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebSiteContentTypeId(String newWebSiteContentTypeId) {
		eSet(WebsitePackage.Literals.WEB_SITE_CONTENT_TYPE__WEB_SITE_CONTENT_TYPE_ID, newWebSiteContentTypeId);
	}

} //WebSiteContentTypeImpl
