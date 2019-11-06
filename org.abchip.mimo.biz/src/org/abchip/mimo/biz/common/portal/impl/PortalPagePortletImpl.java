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
import org.abchip.mimo.biz.common.portal.PortalPagePortlet;
import org.abchip.mimo.biz.common.portal.PortalPortlet;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Portal Page Portlet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPagePortletImpl#getPortletSeqId <em>Portlet Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPagePortletImpl#getColumnSeqId <em>Column Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPagePortletImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPagePortletImpl#getPortalPageId <em>Portal Page Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPagePortletImpl#getPortalPortletId <em>Portal Portlet Id</em>}</li>
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
	 * The cached value of the '{@link #getPortalPageId() <em>Portal Page Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortalPageId()
	 * @generated
	 * @ordered
	 */
	protected PortalPage portalPageId;
	/**
	 * The cached value of the '{@link #getPortalPortletId() <em>Portal Portlet Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortalPortletId()
	 * @generated
	 * @ordered
	 */
	protected PortalPortlet portalPortletId;

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
		columnSeqId = newColumnSeqId;
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
		portletSeqId = newPortletSeqId;
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
		sequenceNum = newSequenceNum;
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
		portalPageId = newPortalPageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortalPortlet getPortalPortletId() {
		if (portalPortletId != null && ((EObject)portalPortletId).eIsProxy()) {
			InternalEObject oldPortalPortletId = (InternalEObject)portalPortletId;
			portalPortletId = (PortalPortlet)eResolveProxy(oldPortalPortletId);
			if (portalPortletId != oldPortalPortletId) {
			}
		}
		return portalPortletId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortalPortlet basicGetPortalPortletId() {
		return portalPortletId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortalPortletId(PortalPortlet newPortalPortletId) {
		portalPortletId = newPortalPortletId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PortalPackage.PORTAL_PAGE_PORTLET__PORTLET_SEQ_ID:
				return getPortletSeqId();
			case PortalPackage.PORTAL_PAGE_PORTLET__COLUMN_SEQ_ID:
				return getColumnSeqId();
			case PortalPackage.PORTAL_PAGE_PORTLET__SEQUENCE_NUM:
				return getSequenceNum();
			case PortalPackage.PORTAL_PAGE_PORTLET__PORTAL_PAGE_ID:
				if (resolve) return getPortalPageId();
				return basicGetPortalPageId();
			case PortalPackage.PORTAL_PAGE_PORTLET__PORTAL_PORTLET_ID:
				if (resolve) return getPortalPortletId();
				return basicGetPortalPortletId();
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
			case PortalPackage.PORTAL_PAGE_PORTLET__PORTLET_SEQ_ID:
				setPortletSeqId((String)newValue);
				return;
			case PortalPackage.PORTAL_PAGE_PORTLET__COLUMN_SEQ_ID:
				setColumnSeqId((String)newValue);
				return;
			case PortalPackage.PORTAL_PAGE_PORTLET__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case PortalPackage.PORTAL_PAGE_PORTLET__PORTAL_PAGE_ID:
				setPortalPageId((PortalPage)newValue);
				return;
			case PortalPackage.PORTAL_PAGE_PORTLET__PORTAL_PORTLET_ID:
				setPortalPortletId((PortalPortlet)newValue);
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
			case PortalPackage.PORTAL_PAGE_PORTLET__PORTLET_SEQ_ID:
				setPortletSeqId(PORTLET_SEQ_ID_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PAGE_PORTLET__COLUMN_SEQ_ID:
				setColumnSeqId(COLUMN_SEQ_ID_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PAGE_PORTLET__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PAGE_PORTLET__PORTAL_PAGE_ID:
				setPortalPageId((PortalPage)null);
				return;
			case PortalPackage.PORTAL_PAGE_PORTLET__PORTAL_PORTLET_ID:
				setPortalPortletId((PortalPortlet)null);
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
			case PortalPackage.PORTAL_PAGE_PORTLET__PORTLET_SEQ_ID:
				return PORTLET_SEQ_ID_EDEFAULT == null ? portletSeqId != null : !PORTLET_SEQ_ID_EDEFAULT.equals(portletSeqId);
			case PortalPackage.PORTAL_PAGE_PORTLET__COLUMN_SEQ_ID:
				return COLUMN_SEQ_ID_EDEFAULT == null ? columnSeqId != null : !COLUMN_SEQ_ID_EDEFAULT.equals(columnSeqId);
			case PortalPackage.PORTAL_PAGE_PORTLET__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case PortalPackage.PORTAL_PAGE_PORTLET__PORTAL_PAGE_ID:
				return portalPageId != null;
			case PortalPackage.PORTAL_PAGE_PORTLET__PORTAL_PORTLET_ID:
				return portalPortletId != null;
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
		result.append(" (portletSeqId: ");
		result.append(portletSeqId);
		result.append(", columnSeqId: ");
		result.append(columnSeqId);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(')');
		return result.toString();
	}

} //PortalPagePortletImpl
