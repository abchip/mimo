/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Portal Page Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageColumnImpl#getColumnSeqId <em>Column Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageColumnImpl#getColumnWidthPercentage <em>Column Width Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageColumnImpl#getColumnWidthPixels <em>Column Width Pixels</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageColumnImpl#getPortalPageId <em>Portal Page Id</em>}</li>
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
	 * The default value of the '{@link #getColumnSeqId() <em>Column Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_SEQ_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getColumnSeqId() <em>Column Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnSeqId()
	 * @generated
	 * @ordered
	 */
	protected String columnSeqId = COLUMN_SEQ_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getColumnWidthPercentage() <em>Column Width Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnWidthPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final long COLUMN_WIDTH_PERCENTAGE_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getColumnWidthPercentage() <em>Column Width Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnWidthPercentage()
	 * @generated
	 * @ordered
	 */
	protected long columnWidthPercentage = COLUMN_WIDTH_PERCENTAGE_EDEFAULT;
	/**
	 * The default value of the '{@link #getColumnWidthPixels() <em>Column Width Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnWidthPixels()
	 * @generated
	 * @ordered
	 */
	protected static final long COLUMN_WIDTH_PIXELS_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getColumnWidthPixels() <em>Column Width Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnWidthPixels()
	 * @generated
	 * @ordered
	 */
	protected long columnWidthPixels = COLUMN_WIDTH_PIXELS_EDEFAULT;
	/**
	 * The cached value of the '{@link #getPortalPageId() <em>Portal Page Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortalPageId()
	 * @generated
	 * @ordered
	 */
	protected PortalPage portalPageId;

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
		return columnSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnSeqId(String newColumnSeqId) {
		String oldColumnSeqId = columnSeqId;
		columnSeqId = newColumnSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortalPackage.PORTAL_PAGE_COLUMN__COLUMN_SEQ_ID, oldColumnSeqId, columnSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getColumnWidthPercentage() {
		return columnWidthPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnWidthPercentage(long newColumnWidthPercentage) {
		long oldColumnWidthPercentage = columnWidthPercentage;
		columnWidthPercentage = newColumnWidthPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortalPackage.PORTAL_PAGE_COLUMN__COLUMN_WIDTH_PERCENTAGE, oldColumnWidthPercentage, columnWidthPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getColumnWidthPixels() {
		return columnWidthPixels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnWidthPixels(long newColumnWidthPixels) {
		long oldColumnWidthPixels = columnWidthPixels;
		columnWidthPixels = newColumnWidthPixels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortalPackage.PORTAL_PAGE_COLUMN__COLUMN_WIDTH_PIXELS, oldColumnWidthPixels, columnWidthPixels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortalPage getPortalPageId() {
		if (portalPageId != null && ((EObject)portalPageId).eIsProxy()) {
			InternalEObject oldPortalPageId = (InternalEObject)portalPageId;
			portalPageId = (PortalPage)eResolveProxy(oldPortalPageId);
			if (portalPageId != oldPortalPageId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PortalPackage.PORTAL_PAGE_COLUMN__PORTAL_PAGE_ID, oldPortalPageId, portalPageId));
			}
		}
		return portalPageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortalPage basicGetPortalPageId() {
		return portalPageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortalPageId(PortalPage newPortalPageId) {
		PortalPage oldPortalPageId = portalPageId;
		portalPageId = newPortalPageId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortalPackage.PORTAL_PAGE_COLUMN__PORTAL_PAGE_ID, oldPortalPageId, portalPageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PortalPackage.PORTAL_PAGE_COLUMN__COLUMN_SEQ_ID:
				return getColumnSeqId();
			case PortalPackage.PORTAL_PAGE_COLUMN__COLUMN_WIDTH_PERCENTAGE:
				return getColumnWidthPercentage();
			case PortalPackage.PORTAL_PAGE_COLUMN__COLUMN_WIDTH_PIXELS:
				return getColumnWidthPixels();
			case PortalPackage.PORTAL_PAGE_COLUMN__PORTAL_PAGE_ID:
				if (resolve) return getPortalPageId();
				return basicGetPortalPageId();
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
			case PortalPackage.PORTAL_PAGE_COLUMN__COLUMN_SEQ_ID:
				setColumnSeqId((String)newValue);
				return;
			case PortalPackage.PORTAL_PAGE_COLUMN__COLUMN_WIDTH_PERCENTAGE:
				setColumnWidthPercentage((Long)newValue);
				return;
			case PortalPackage.PORTAL_PAGE_COLUMN__COLUMN_WIDTH_PIXELS:
				setColumnWidthPixels((Long)newValue);
				return;
			case PortalPackage.PORTAL_PAGE_COLUMN__PORTAL_PAGE_ID:
				setPortalPageId((PortalPage)newValue);
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
			case PortalPackage.PORTAL_PAGE_COLUMN__COLUMN_SEQ_ID:
				setColumnSeqId(COLUMN_SEQ_ID_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PAGE_COLUMN__COLUMN_WIDTH_PERCENTAGE:
				setColumnWidthPercentage(COLUMN_WIDTH_PERCENTAGE_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PAGE_COLUMN__COLUMN_WIDTH_PIXELS:
				setColumnWidthPixels(COLUMN_WIDTH_PIXELS_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PAGE_COLUMN__PORTAL_PAGE_ID:
				setPortalPageId((PortalPage)null);
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
			case PortalPackage.PORTAL_PAGE_COLUMN__COLUMN_SEQ_ID:
				return COLUMN_SEQ_ID_EDEFAULT == null ? columnSeqId != null : !COLUMN_SEQ_ID_EDEFAULT.equals(columnSeqId);
			case PortalPackage.PORTAL_PAGE_COLUMN__COLUMN_WIDTH_PERCENTAGE:
				return columnWidthPercentage != COLUMN_WIDTH_PERCENTAGE_EDEFAULT;
			case PortalPackage.PORTAL_PAGE_COLUMN__COLUMN_WIDTH_PIXELS:
				return columnWidthPixels != COLUMN_WIDTH_PIXELS_EDEFAULT;
			case PortalPackage.PORTAL_PAGE_COLUMN__PORTAL_PAGE_ID:
				return portalPageId != null;
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
		result.append(" (columnSeqId: ");
		result.append(columnSeqId);
		result.append(", columnWidthPercentage: ");
		result.append(columnWidthPercentage);
		result.append(", columnWidthPixels: ");
		result.append(columnWidthPixels);
		result.append(')');
		return result.toString();
	}

} //PortalPageColumnImpl
