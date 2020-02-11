/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.portal.impl;

import org.abchip.mimo.biz.common.portal.PortalPackage;
import org.abchip.mimo.biz.common.portal.PortalPage;
import org.abchip.mimo.biz.common.portal.PortalPagePortlet;
import org.abchip.mimo.biz.common.portal.PortalPortlet;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Portal Page Portlet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPagePortletImpl#getPortalPageId <em>Portal Page Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPagePortletImpl#getPortalPortletId <em>Portal Portlet Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPagePortletImpl#getPortletSeqId <em>Portlet Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPagePortletImpl#getColumnSeqId <em>Column Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPagePortletImpl#getSequenceNum <em>Sequence Num</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortalPagePortletImpl extends BizEntityImpl implements PortalPagePortlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortalPagePortletImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PortalPackage.Literals.PORTAL_PAGE_PORTLET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColumnSeqId() {
		return (String)eGet(PortalPackage.Literals.PORTAL_PAGE_PORTLET__COLUMN_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnSeqId(String newColumnSeqId) {
		eSet(PortalPackage.Literals.PORTAL_PAGE_PORTLET__COLUMN_SEQ_ID, newColumnSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPortletSeqId() {
		return (String)eGet(PortalPackage.Literals.PORTAL_PAGE_PORTLET__PORTLET_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortletSeqId(String newPortletSeqId) {
		eSet(PortalPackage.Literals.PORTAL_PAGE_PORTLET__PORTLET_SEQ_ID, newPortletSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceNum() {
		return (Long)eGet(PortalPackage.Literals.PORTAL_PAGE_PORTLET__SEQUENCE_NUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNum(long newSequenceNum) {
		eSet(PortalPackage.Literals.PORTAL_PAGE_PORTLET__SEQUENCE_NUM, newSequenceNum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortalPage getPortalPageId() {
		return (PortalPage)eGet(PortalPackage.Literals.PORTAL_PAGE_PORTLET__PORTAL_PAGE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortalPageId(PortalPage newPortalPageId) {
		eSet(PortalPackage.Literals.PORTAL_PAGE_PORTLET__PORTAL_PAGE_ID, newPortalPageId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortalPortlet getPortalPortletId() {
		return (PortalPortlet)eGet(PortalPackage.Literals.PORTAL_PAGE_PORTLET__PORTAL_PORTLET_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortalPortletId(PortalPortlet newPortalPortletId) {
		eSet(PortalPackage.Literals.PORTAL_PAGE_PORTLET__PORTAL_PORTLET_ID, newPortalPortletId);
	}

} //PortalPagePortletImpl
