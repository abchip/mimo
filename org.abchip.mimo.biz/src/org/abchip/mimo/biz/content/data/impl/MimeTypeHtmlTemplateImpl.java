/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.data.impl;

import org.abchip.mimo.biz.content.data.DataPackage;
import org.abchip.mimo.biz.content.data.MimeTypeHtmlTemplate;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mime Type Html Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.MimeTypeHtmlTemplateImpl#getMimeTypeId <em>Mime Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.MimeTypeHtmlTemplateImpl#getTemplateLocation <em>Template Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MimeTypeHtmlTemplateImpl extends BizEntityImpl implements MimeTypeHtmlTemplate {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getMimeTypeId() <em>Mime Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String MIME_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimeTypeId() <em>Mime Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeTypeId()
	 * @generated
	 * @ordered
	 */
	protected String mimeTypeId = MIME_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplateLocation() <em>Template Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateLocation() <em>Template Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateLocation()
	 * @generated
	 * @ordered
	 */
	protected String templateLocation = TEMPLATE_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MimeTypeHtmlTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.MIME_TYPE_HTML_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMimeTypeId() {
		return mimeTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMimeTypeId(String newMimeTypeId) {
		String oldMimeTypeId = mimeTypeId;
		mimeTypeId = newMimeTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.MIME_TYPE_HTML_TEMPLATE__MIME_TYPE_ID, oldMimeTypeId, mimeTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTemplateLocation() {
		return templateLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplateLocation(String newTemplateLocation) {
		String oldTemplateLocation = templateLocation;
		templateLocation = newTemplateLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.MIME_TYPE_HTML_TEMPLATE__TEMPLATE_LOCATION, oldTemplateLocation, templateLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.MIME_TYPE_HTML_TEMPLATE__MIME_TYPE_ID:
				return getMimeTypeId();
			case DataPackage.MIME_TYPE_HTML_TEMPLATE__TEMPLATE_LOCATION:
				return getTemplateLocation();
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
			case DataPackage.MIME_TYPE_HTML_TEMPLATE__MIME_TYPE_ID:
				setMimeTypeId((String)newValue);
				return;
			case DataPackage.MIME_TYPE_HTML_TEMPLATE__TEMPLATE_LOCATION:
				setTemplateLocation((String)newValue);
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
			case DataPackage.MIME_TYPE_HTML_TEMPLATE__MIME_TYPE_ID:
				setMimeTypeId(MIME_TYPE_ID_EDEFAULT);
				return;
			case DataPackage.MIME_TYPE_HTML_TEMPLATE__TEMPLATE_LOCATION:
				setTemplateLocation(TEMPLATE_LOCATION_EDEFAULT);
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
			case DataPackage.MIME_TYPE_HTML_TEMPLATE__MIME_TYPE_ID:
				return MIME_TYPE_ID_EDEFAULT == null ? mimeTypeId != null : !MIME_TYPE_ID_EDEFAULT.equals(mimeTypeId);
			case DataPackage.MIME_TYPE_HTML_TEMPLATE__TEMPLATE_LOCATION:
				return TEMPLATE_LOCATION_EDEFAULT == null ? templateLocation != null : !TEMPLATE_LOCATION_EDEFAULT.equals(templateLocation);
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
		result.append(" (mimeTypeId: ");
		result.append(mimeTypeId);
		result.append(", templateLocation: ");
		result.append(templateLocation);
		result.append(')');
		return result.toString();
	}

} //MimeTypeHtmlTemplateImpl
