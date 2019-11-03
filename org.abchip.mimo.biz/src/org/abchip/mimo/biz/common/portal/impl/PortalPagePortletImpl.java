/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.portal.impl;

import org.abchip.mimo.biz.common.portal.PortalPackage;
import org.abchip.mimo.biz.common.portal.PortalPagePortlet;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The default value of the '{@link #getPortalPageId() <em>Portal Page Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortalPageId()
	 * @generated
	 * @ordered
	 */
	protected static final String PORTAL_PAGE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPortalPageId() <em>Portal Page Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortalPageId()
	 * @generated
	 * @ordered
	 */
	protected String portalPageId = PORTAL_PAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortalPortletId() <em>Portal Portlet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortalPortletId()
	 * @generated
	 * @ordered
	 */
	protected static final String PORTAL_PORTLET_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPortalPortletId() <em>Portal Portlet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortalPortletId()
	 * @generated
	 * @ordered
	 */
	protected String portalPortletId = PORTAL_PORTLET_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getPortletSeqId() <em>Portlet Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortletSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String PORTLET_SEQ_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPortletSeqId() <em>Portlet Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortletSeqId()
	 * @generated
	 * @ordered
	 */
	protected String portletSeqId = PORTLET_SEQ_ID_EDEFAULT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PortalPackage.PORTAL_PAGE_PORTLET__COLUMN_SEQ_ID, oldColumnSeqId, columnSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPortletSeqId() {
		return portletSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortletSeqId(String newPortletSeqId) {
		String oldPortletSeqId = portletSeqId;
		portletSeqId = newPortletSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortalPackage.PORTAL_PAGE_PORTLET__PORTLET_SEQ_ID, oldPortletSeqId, portletSeqId));
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
		long oldSequenceNum = sequenceNum;
		sequenceNum = newSequenceNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortalPackage.PORTAL_PAGE_PORTLET__SEQUENCE_NUM, oldSequenceNum, sequenceNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPortalPageId() {
		return portalPageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortalPageId(String newPortalPageId) {
		String oldPortalPageId = portalPageId;
		portalPageId = newPortalPageId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortalPackage.PORTAL_PAGE_PORTLET__PORTAL_PAGE_ID, oldPortalPageId, portalPageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPortalPortletId() {
		return portalPortletId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortalPortletId(String newPortalPortletId) {
		String oldPortalPortletId = portalPortletId;
		portalPortletId = newPortalPortletId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortalPackage.PORTAL_PAGE_PORTLET__PORTAL_PORTLET_ID, oldPortalPortletId, portalPortletId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PortalPackage.PORTAL_PAGE_PORTLET__PORTAL_PAGE_ID:
				return getPortalPageId();
			case PortalPackage.PORTAL_PAGE_PORTLET__PORTAL_PORTLET_ID:
				return getPortalPortletId();
			case PortalPackage.PORTAL_PAGE_PORTLET__PORTLET_SEQ_ID:
				return getPortletSeqId();
			case PortalPackage.PORTAL_PAGE_PORTLET__COLUMN_SEQ_ID:
				return getColumnSeqId();
			case PortalPackage.PORTAL_PAGE_PORTLET__SEQUENCE_NUM:
				return getSequenceNum();
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
			case PortalPackage.PORTAL_PAGE_PORTLET__PORTAL_PAGE_ID:
				setPortalPageId((String)newValue);
				return;
			case PortalPackage.PORTAL_PAGE_PORTLET__PORTAL_PORTLET_ID:
				setPortalPortletId((String)newValue);
				return;
			case PortalPackage.PORTAL_PAGE_PORTLET__PORTLET_SEQ_ID:
				setPortletSeqId((String)newValue);
				return;
			case PortalPackage.PORTAL_PAGE_PORTLET__COLUMN_SEQ_ID:
				setColumnSeqId((String)newValue);
				return;
			case PortalPackage.PORTAL_PAGE_PORTLET__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
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
			case PortalPackage.PORTAL_PAGE_PORTLET__PORTAL_PAGE_ID:
				setPortalPageId(PORTAL_PAGE_ID_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PAGE_PORTLET__PORTAL_PORTLET_ID:
				setPortalPortletId(PORTAL_PORTLET_ID_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PAGE_PORTLET__PORTLET_SEQ_ID:
				setPortletSeqId(PORTLET_SEQ_ID_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PAGE_PORTLET__COLUMN_SEQ_ID:
				setColumnSeqId(COLUMN_SEQ_ID_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PAGE_PORTLET__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
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
			case PortalPackage.PORTAL_PAGE_PORTLET__PORTAL_PAGE_ID:
				return PORTAL_PAGE_ID_EDEFAULT == null ? portalPageId != null : !PORTAL_PAGE_ID_EDEFAULT.equals(portalPageId);
			case PortalPackage.PORTAL_PAGE_PORTLET__PORTAL_PORTLET_ID:
				return PORTAL_PORTLET_ID_EDEFAULT == null ? portalPortletId != null : !PORTAL_PORTLET_ID_EDEFAULT.equals(portalPortletId);
			case PortalPackage.PORTAL_PAGE_PORTLET__PORTLET_SEQ_ID:
				return PORTLET_SEQ_ID_EDEFAULT == null ? portletSeqId != null : !PORTLET_SEQ_ID_EDEFAULT.equals(portletSeqId);
			case PortalPackage.PORTAL_PAGE_PORTLET__COLUMN_SEQ_ID:
				return COLUMN_SEQ_ID_EDEFAULT == null ? columnSeqId != null : !COLUMN_SEQ_ID_EDEFAULT.equals(columnSeqId);
			case PortalPackage.PORTAL_PAGE_PORTLET__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
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
		result.append(" (portalPageId: ");
		result.append(portalPageId);
		result.append(", portalPortletId: ");
		result.append(portalPortletId);
		result.append(", portletSeqId: ");
		result.append(portletSeqId);
		result.append(", columnSeqId: ");
		result.append(columnSeqId);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(')');
		return result.toString();
	}

} //PortalPagePortletImpl
