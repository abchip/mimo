/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.portal.impl;

import org.abchip.mimo.biz.common.portal.PortalPackage;
import org.abchip.mimo.biz.common.portal.PortalPortlet;
import org.abchip.mimo.biz.common.portal.PortletAttribute;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Portlet Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortletAttributeImpl#getPortalPageId <em>Portal Page Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortletAttributeImpl#getPortletSeqId <em>Portlet Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortletAttributeImpl#getAttrName <em>Attr Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortletAttributeImpl#getAttrDescription <em>Attr Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortletAttributeImpl#getAttrType <em>Attr Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortletAttributeImpl#getAttrValue <em>Attr Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortletAttributeImpl#getPortalPortletId <em>Portal Portlet Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortletAttributeImpl extends BizEntityImpl implements PortletAttribute {
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
	 * The default value of the '{@link #getAttrName() <em>Attr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAttrName() <em>Attr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrName()
	 * @generated
	 * @ordered
	 */
	protected String attrName = ATTR_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getAttrDescription() <em>Attr Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAttrDescription() <em>Attr Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrDescription()
	 * @generated
	 * @ordered
	 */
	protected String attrDescription = ATTR_DESCRIPTION_EDEFAULT;
	/**
	 * The default value of the '{@link #getAttrType() <em>Attr Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrType()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAttrType() <em>Attr Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrType()
	 * @generated
	 * @ordered
	 */
	protected String attrType = ATTR_TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getAttrValue() <em>Attr Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAttrValue() <em>Attr Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrValue()
	 * @generated
	 * @ordered
	 */
	protected String attrValue = ATTR_VALUE_EDEFAULT;
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
	protected PortletAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PortalPackage.Literals.PORTLET_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttrDescription() {
		return attrDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttrDescription(String newAttrDescription) {
		String oldAttrDescription = attrDescription;
		attrDescription = newAttrDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortalPackage.PORTLET_ATTRIBUTE__ATTR_DESCRIPTION, oldAttrDescription, attrDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttrName() {
		return attrName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttrName(String newAttrName) {
		String oldAttrName = attrName;
		attrName = newAttrName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortalPackage.PORTLET_ATTRIBUTE__ATTR_NAME, oldAttrName, attrName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttrType() {
		return attrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttrType(String newAttrType) {
		String oldAttrType = attrType;
		attrType = newAttrType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortalPackage.PORTLET_ATTRIBUTE__ATTR_TYPE, oldAttrType, attrType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttrValue() {
		return attrValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttrValue(String newAttrValue) {
		String oldAttrValue = attrValue;
		attrValue = newAttrValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortalPackage.PORTLET_ATTRIBUTE__ATTR_VALUE, oldAttrValue, attrValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PortalPackage.PORTLET_ATTRIBUTE__PORTAL_PAGE_ID, oldPortalPageId, portalPageId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PortalPackage.PORTLET_ATTRIBUTE__PORTLET_SEQ_ID, oldPortletSeqId, portletSeqId));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PortalPackage.PORTLET_ATTRIBUTE__PORTAL_PORTLET_ID, oldPortalPortletId, portalPortletId));
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
		PortalPortlet oldPortalPortletId = portalPortletId;
		portalPortletId = newPortalPortletId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortalPackage.PORTLET_ATTRIBUTE__PORTAL_PORTLET_ID, oldPortalPortletId, portalPortletId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PortalPackage.PORTLET_ATTRIBUTE__PORTAL_PAGE_ID:
				return getPortalPageId();
			case PortalPackage.PORTLET_ATTRIBUTE__PORTLET_SEQ_ID:
				return getPortletSeqId();
			case PortalPackage.PORTLET_ATTRIBUTE__ATTR_NAME:
				return getAttrName();
			case PortalPackage.PORTLET_ATTRIBUTE__ATTR_DESCRIPTION:
				return getAttrDescription();
			case PortalPackage.PORTLET_ATTRIBUTE__ATTR_TYPE:
				return getAttrType();
			case PortalPackage.PORTLET_ATTRIBUTE__ATTR_VALUE:
				return getAttrValue();
			case PortalPackage.PORTLET_ATTRIBUTE__PORTAL_PORTLET_ID:
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
			case PortalPackage.PORTLET_ATTRIBUTE__PORTAL_PAGE_ID:
				setPortalPageId((String)newValue);
				return;
			case PortalPackage.PORTLET_ATTRIBUTE__PORTLET_SEQ_ID:
				setPortletSeqId((String)newValue);
				return;
			case PortalPackage.PORTLET_ATTRIBUTE__ATTR_NAME:
				setAttrName((String)newValue);
				return;
			case PortalPackage.PORTLET_ATTRIBUTE__ATTR_DESCRIPTION:
				setAttrDescription((String)newValue);
				return;
			case PortalPackage.PORTLET_ATTRIBUTE__ATTR_TYPE:
				setAttrType((String)newValue);
				return;
			case PortalPackage.PORTLET_ATTRIBUTE__ATTR_VALUE:
				setAttrValue((String)newValue);
				return;
			case PortalPackage.PORTLET_ATTRIBUTE__PORTAL_PORTLET_ID:
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
			case PortalPackage.PORTLET_ATTRIBUTE__PORTAL_PAGE_ID:
				setPortalPageId(PORTAL_PAGE_ID_EDEFAULT);
				return;
			case PortalPackage.PORTLET_ATTRIBUTE__PORTLET_SEQ_ID:
				setPortletSeqId(PORTLET_SEQ_ID_EDEFAULT);
				return;
			case PortalPackage.PORTLET_ATTRIBUTE__ATTR_NAME:
				setAttrName(ATTR_NAME_EDEFAULT);
				return;
			case PortalPackage.PORTLET_ATTRIBUTE__ATTR_DESCRIPTION:
				setAttrDescription(ATTR_DESCRIPTION_EDEFAULT);
				return;
			case PortalPackage.PORTLET_ATTRIBUTE__ATTR_TYPE:
				setAttrType(ATTR_TYPE_EDEFAULT);
				return;
			case PortalPackage.PORTLET_ATTRIBUTE__ATTR_VALUE:
				setAttrValue(ATTR_VALUE_EDEFAULT);
				return;
			case PortalPackage.PORTLET_ATTRIBUTE__PORTAL_PORTLET_ID:
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
			case PortalPackage.PORTLET_ATTRIBUTE__PORTAL_PAGE_ID:
				return PORTAL_PAGE_ID_EDEFAULT == null ? portalPageId != null : !PORTAL_PAGE_ID_EDEFAULT.equals(portalPageId);
			case PortalPackage.PORTLET_ATTRIBUTE__PORTLET_SEQ_ID:
				return PORTLET_SEQ_ID_EDEFAULT == null ? portletSeqId != null : !PORTLET_SEQ_ID_EDEFAULT.equals(portletSeqId);
			case PortalPackage.PORTLET_ATTRIBUTE__ATTR_NAME:
				return ATTR_NAME_EDEFAULT == null ? attrName != null : !ATTR_NAME_EDEFAULT.equals(attrName);
			case PortalPackage.PORTLET_ATTRIBUTE__ATTR_DESCRIPTION:
				return ATTR_DESCRIPTION_EDEFAULT == null ? attrDescription != null : !ATTR_DESCRIPTION_EDEFAULT.equals(attrDescription);
			case PortalPackage.PORTLET_ATTRIBUTE__ATTR_TYPE:
				return ATTR_TYPE_EDEFAULT == null ? attrType != null : !ATTR_TYPE_EDEFAULT.equals(attrType);
			case PortalPackage.PORTLET_ATTRIBUTE__ATTR_VALUE:
				return ATTR_VALUE_EDEFAULT == null ? attrValue != null : !ATTR_VALUE_EDEFAULT.equals(attrValue);
			case PortalPackage.PORTLET_ATTRIBUTE__PORTAL_PORTLET_ID:
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
		result.append(" (portalPageId: ");
		result.append(portalPageId);
		result.append(", portletSeqId: ");
		result.append(portletSeqId);
		result.append(", attrName: ");
		result.append(attrName);
		result.append(", attrDescription: ");
		result.append(attrDescription);
		result.append(", attrType: ");
		result.append(attrType);
		result.append(", attrValue: ");
		result.append(attrValue);
		result.append(')');
		return result.toString();
	}

} //PortletAttributeImpl
