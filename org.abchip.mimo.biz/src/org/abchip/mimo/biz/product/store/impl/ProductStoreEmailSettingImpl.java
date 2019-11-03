/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.store.ProductStoreEmailSetting;
import org.abchip.mimo.biz.product.store.StorePackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Store Email Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreEmailSettingImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreEmailSettingImpl#getEmailType <em>Email Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreEmailSettingImpl#getBccAddress <em>Bcc Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreEmailSettingImpl#getBodyScreenLocation <em>Body Screen Location</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreEmailSettingImpl#getCcAddress <em>Cc Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreEmailSettingImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreEmailSettingImpl#getFromAddress <em>From Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreEmailSettingImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreEmailSettingImpl#getXslfoAttachScreenLocation <em>Xslfo Attach Screen Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductStoreEmailSettingImpl extends BizEntityImpl implements ProductStoreEmailSetting {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_STORE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected String productStoreId = PRODUCT_STORE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmailType() <em>Email Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailType()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmailType() <em>Email Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailType()
	 * @generated
	 * @ordered
	 */
	protected String emailType = EMAIL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBccAddress() <em>Bcc Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBccAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String BCC_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBccAddress() <em>Bcc Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBccAddress()
	 * @generated
	 * @ordered
	 */
	protected String bccAddress = BCC_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBodyScreenLocation() <em>Body Screen Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyScreenLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_SCREEN_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBodyScreenLocation() <em>Body Screen Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyScreenLocation()
	 * @generated
	 * @ordered
	 */
	protected String bodyScreenLocation = BODY_SCREEN_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcAddress() <em>Cc Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCcAddress() <em>Cc Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcAddress()
	 * @generated
	 * @ordered
	 */
	protected String ccAddress = CC_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected String contentType = CONTENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromAddress() <em>From Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromAddress() <em>From Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromAddress()
	 * @generated
	 * @ordered
	 */
	protected String fromAddress = FROM_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected String subject = SUBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getXslfoAttachScreenLocation() <em>Xslfo Attach Screen Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXslfoAttachScreenLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String XSLFO_ATTACH_SCREEN_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXslfoAttachScreenLocation() <em>Xslfo Attach Screen Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXslfoAttachScreenLocation()
	 * @generated
	 * @ordered
	 */
	protected String xslfoAttachScreenLocation = XSLFO_ATTACH_SCREEN_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductStoreEmailSettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.PRODUCT_STORE_EMAIL_SETTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBccAddress() {
		return bccAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBccAddress(String newBccAddress) {
		String oldBccAddress = bccAddress;
		bccAddress = newBccAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_EMAIL_SETTING__BCC_ADDRESS, oldBccAddress, bccAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBodyScreenLocation() {
		return bodyScreenLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBodyScreenLocation(String newBodyScreenLocation) {
		String oldBodyScreenLocation = bodyScreenLocation;
		bodyScreenLocation = newBodyScreenLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_EMAIL_SETTING__BODY_SCREEN_LOCATION, oldBodyScreenLocation, bodyScreenLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCcAddress() {
		return ccAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcAddress(String newCcAddress) {
		String oldCcAddress = ccAddress;
		ccAddress = newCcAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_EMAIL_SETTING__CC_ADDRESS, oldCcAddress, ccAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentType(String newContentType) {
		String oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_EMAIL_SETTING__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmailType() {
		return emailType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailType(String newEmailType) {
		String oldEmailType = emailType;
		emailType = newEmailType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_EMAIL_SETTING__EMAIL_TYPE, oldEmailType, emailType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFromAddress() {
		return fromAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromAddress(String newFromAddress) {
		String oldFromAddress = fromAddress;
		fromAddress = newFromAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_EMAIL_SETTING__FROM_ADDRESS, oldFromAddress, fromAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(String newSubject) {
		String oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_EMAIL_SETTING__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXslfoAttachScreenLocation() {
		return xslfoAttachScreenLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXslfoAttachScreenLocation(String newXslfoAttachScreenLocation) {
		String oldXslfoAttachScreenLocation = xslfoAttachScreenLocation;
		xslfoAttachScreenLocation = newXslfoAttachScreenLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_EMAIL_SETTING__XSLFO_ATTACH_SCREEN_LOCATION, oldXslfoAttachScreenLocation, xslfoAttachScreenLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductStoreId() {
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(String newProductStoreId) {
		String oldProductStoreId = productStoreId;
		productStoreId = newProductStoreId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_EMAIL_SETTING__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__PRODUCT_STORE_ID:
				return getProductStoreId();
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__EMAIL_TYPE:
				return getEmailType();
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__BCC_ADDRESS:
				return getBccAddress();
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__BODY_SCREEN_LOCATION:
				return getBodyScreenLocation();
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__CC_ADDRESS:
				return getCcAddress();
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__CONTENT_TYPE:
				return getContentType();
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__FROM_ADDRESS:
				return getFromAddress();
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__SUBJECT:
				return getSubject();
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__XSLFO_ATTACH_SCREEN_LOCATION:
				return getXslfoAttachScreenLocation();
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
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__PRODUCT_STORE_ID:
				setProductStoreId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__EMAIL_TYPE:
				setEmailType((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__BCC_ADDRESS:
				setBccAddress((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__BODY_SCREEN_LOCATION:
				setBodyScreenLocation((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__CC_ADDRESS:
				setCcAddress((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__FROM_ADDRESS:
				setFromAddress((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__SUBJECT:
				setSubject((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__XSLFO_ATTACH_SCREEN_LOCATION:
				setXslfoAttachScreenLocation((String)newValue);
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
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__PRODUCT_STORE_ID:
				setProductStoreId(PRODUCT_STORE_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__EMAIL_TYPE:
				setEmailType(EMAIL_TYPE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__BCC_ADDRESS:
				setBccAddress(BCC_ADDRESS_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__BODY_SCREEN_LOCATION:
				setBodyScreenLocation(BODY_SCREEN_LOCATION_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__CC_ADDRESS:
				setCcAddress(CC_ADDRESS_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__FROM_ADDRESS:
				setFromAddress(FROM_ADDRESS_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__SUBJECT:
				setSubject(SUBJECT_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__XSLFO_ATTACH_SCREEN_LOCATION:
				setXslfoAttachScreenLocation(XSLFO_ATTACH_SCREEN_LOCATION_EDEFAULT);
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
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__PRODUCT_STORE_ID:
				return PRODUCT_STORE_ID_EDEFAULT == null ? productStoreId != null : !PRODUCT_STORE_ID_EDEFAULT.equals(productStoreId);
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__EMAIL_TYPE:
				return EMAIL_TYPE_EDEFAULT == null ? emailType != null : !EMAIL_TYPE_EDEFAULT.equals(emailType);
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__BCC_ADDRESS:
				return BCC_ADDRESS_EDEFAULT == null ? bccAddress != null : !BCC_ADDRESS_EDEFAULT.equals(bccAddress);
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__BODY_SCREEN_LOCATION:
				return BODY_SCREEN_LOCATION_EDEFAULT == null ? bodyScreenLocation != null : !BODY_SCREEN_LOCATION_EDEFAULT.equals(bodyScreenLocation);
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__CC_ADDRESS:
				return CC_ADDRESS_EDEFAULT == null ? ccAddress != null : !CC_ADDRESS_EDEFAULT.equals(ccAddress);
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__FROM_ADDRESS:
				return FROM_ADDRESS_EDEFAULT == null ? fromAddress != null : !FROM_ADDRESS_EDEFAULT.equals(fromAddress);
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__SUBJECT:
				return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
			case StorePackage.PRODUCT_STORE_EMAIL_SETTING__XSLFO_ATTACH_SCREEN_LOCATION:
				return XSLFO_ATTACH_SCREEN_LOCATION_EDEFAULT == null ? xslfoAttachScreenLocation != null : !XSLFO_ATTACH_SCREEN_LOCATION_EDEFAULT.equals(xslfoAttachScreenLocation);
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
		result.append(" (productStoreId: ");
		result.append(productStoreId);
		result.append(", emailType: ");
		result.append(emailType);
		result.append(", bccAddress: ");
		result.append(bccAddress);
		result.append(", bodyScreenLocation: ");
		result.append(bodyScreenLocation);
		result.append(", ccAddress: ");
		result.append(ccAddress);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", fromAddress: ");
		result.append(fromAddress);
		result.append(", subject: ");
		result.append(subject);
		result.append(", xslfoAttachScreenLocation: ");
		result.append(xslfoAttachScreenLocation);
		result.append(')');
		return result.toString();
	}

} //ProductStoreEmailSettingImpl
