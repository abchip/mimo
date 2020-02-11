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
import org.abchip.mimo.biz.common.portal.PortalPageColumn;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Portal Page Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageColumnImpl#getPortalPageId <em>Portal Page Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageColumnImpl#getColumnSeqId <em>Column Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageColumnImpl#getColumnWidthPercentage <em>Column Width Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageColumnImpl#getColumnWidthPixels <em>Column Width Pixels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortalPageColumnImpl extends BizEntityImpl implements PortalPageColumn {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortalPageColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PortalPackage.Literals.PORTAL_PAGE_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColumnSeqId() {
		return (String)eGet(PortalPackage.Literals.PORTAL_PAGE_COLUMN__COLUMN_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnSeqId(String newColumnSeqId) {
		eSet(PortalPackage.Literals.PORTAL_PAGE_COLUMN__COLUMN_SEQ_ID, newColumnSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getColumnWidthPercentage() {
		return (Long)eGet(PortalPackage.Literals.PORTAL_PAGE_COLUMN__COLUMN_WIDTH_PERCENTAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnWidthPercentage(long newColumnWidthPercentage) {
		eSet(PortalPackage.Literals.PORTAL_PAGE_COLUMN__COLUMN_WIDTH_PERCENTAGE, newColumnWidthPercentage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getColumnWidthPixels() {
		return (Long)eGet(PortalPackage.Literals.PORTAL_PAGE_COLUMN__COLUMN_WIDTH_PIXELS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnWidthPixels(long newColumnWidthPixels) {
		eSet(PortalPackage.Literals.PORTAL_PAGE_COLUMN__COLUMN_WIDTH_PIXELS, newColumnWidthPixels);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortalPage getPortalPageId() {
		return (PortalPage)eGet(PortalPackage.Literals.PORTAL_PAGE_COLUMN__PORTAL_PAGE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortalPageId(PortalPage newPortalPageId) {
		eSet(PortalPackage.Literals.PORTAL_PAGE_COLUMN__PORTAL_PAGE_ID, newPortalPageId);
	}

} //PortalPageColumnImpl
