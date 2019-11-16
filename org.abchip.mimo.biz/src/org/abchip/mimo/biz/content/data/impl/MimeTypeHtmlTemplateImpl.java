/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.data.impl;

import org.abchip.mimo.biz.content.data.DataPackage;
import org.abchip.mimo.biz.content.data.MimeType;
import org.abchip.mimo.biz.content.data.MimeTypeHtmlTemplate;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mime Type Html Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.MimeTypeHtmlTemplateImpl#getTemplateLocation <em>Template Location</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.MimeTypeHtmlTemplateImpl#getMimeTypeId <em>Mime Type Id</em>}</li>
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
	 * The cached value of the '{@link #getMimeTypeId() <em>Mime Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeTypeId()
	 * @generated
	 * @ordered
	 */
	protected MimeType mimeTypeId;

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
	public MimeType getMimeTypeId() {
		if (mimeTypeId != null && ((EObject)mimeTypeId).eIsProxy()) {
			InternalEObject oldMimeTypeId = (InternalEObject)mimeTypeId;
			mimeTypeId = (MimeType)eResolveProxy(oldMimeTypeId);
			if (mimeTypeId != oldMimeTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.MIME_TYPE_HTML_TEMPLATE__MIME_TYPE_ID, oldMimeTypeId, mimeTypeId));
			}
		}
		return mimeTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MimeType basicGetMimeTypeId() {
		return mimeTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMimeTypeId(MimeType newMimeTypeId) {
		MimeType oldMimeTypeId = mimeTypeId;
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
			case DataPackage.MIME_TYPE_HTML_TEMPLATE__TEMPLATE_LOCATION:
				return getTemplateLocation();
			case DataPackage.MIME_TYPE_HTML_TEMPLATE__MIME_TYPE_ID:
				if (resolve) return getMimeTypeId();
				return basicGetMimeTypeId();
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
			case DataPackage.MIME_TYPE_HTML_TEMPLATE__TEMPLATE_LOCATION:
				setTemplateLocation((String)newValue);
				return;
			case DataPackage.MIME_TYPE_HTML_TEMPLATE__MIME_TYPE_ID:
				setMimeTypeId((MimeType)newValue);
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
			case DataPackage.MIME_TYPE_HTML_TEMPLATE__TEMPLATE_LOCATION:
				setTemplateLocation(TEMPLATE_LOCATION_EDEFAULT);
				return;
			case DataPackage.MIME_TYPE_HTML_TEMPLATE__MIME_TYPE_ID:
				setMimeTypeId((MimeType)null);
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
			case DataPackage.MIME_TYPE_HTML_TEMPLATE__TEMPLATE_LOCATION:
				return TEMPLATE_LOCATION_EDEFAULT == null ? templateLocation != null : !TEMPLATE_LOCATION_EDEFAULT.equals(templateLocation);
			case DataPackage.MIME_TYPE_HTML_TEMPLATE__MIME_TYPE_ID:
				return mimeTypeId != null;
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
		result.append(" (templateLocation: ");
		result.append(templateLocation);
		result.append(')');
		return result.toString();
	}

} //MimeTypeHtmlTemplateImpl
