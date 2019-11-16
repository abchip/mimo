/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.email.impl;

import org.abchip.mimo.biz.common.email.EmailPackage;
import org.abchip.mimo.biz.common.email.EmailTemplateSetting;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Email Template Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.email.impl.EmailTemplateSettingImpl#getEmailTemplateSettingId <em>Email Template Setting Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.email.impl.EmailTemplateSettingImpl#getBccAddress <em>Bcc Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.email.impl.EmailTemplateSettingImpl#getBodyScreenLocation <em>Body Screen Location</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.email.impl.EmailTemplateSettingImpl#getCcAddress <em>Cc Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.email.impl.EmailTemplateSettingImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.email.impl.EmailTemplateSettingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.email.impl.EmailTemplateSettingImpl#getFromAddress <em>From Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.email.impl.EmailTemplateSettingImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.email.impl.EmailTemplateSettingImpl#getXslfoAttachScreenLocation <em>Xslfo Attach Screen Location</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.email.impl.EmailTemplateSettingImpl#getEmailType <em>Email Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmailTemplateSettingImpl extends BizEntityImpl implements EmailTemplateSetting {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getEmailTemplateSettingId() <em>Email Template Setting Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailTemplateSettingId()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_TEMPLATE_SETTING_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmailTemplateSettingId() <em>Email Template Setting Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailTemplateSettingId()
	 * @generated
	 * @ordered
	 */
	protected String emailTemplateSettingId = EMAIL_TEMPLATE_SETTING_ID_EDEFAULT;
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getEmailType() <em>Email Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailType()
	 * @generated
	 * @ordered
	 */
	protected Enumeration emailType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmailTemplateSettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmailPackage.Literals.EMAIL_TEMPLATE_SETTING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmailPackage.EMAIL_TEMPLATE_SETTING__BCC_ADDRESS, oldBccAddress, bccAddress));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmailPackage.EMAIL_TEMPLATE_SETTING__BODY_SCREEN_LOCATION, oldBodyScreenLocation, bodyScreenLocation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmailPackage.EMAIL_TEMPLATE_SETTING__CC_ADDRESS, oldCcAddress, ccAddress));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmailPackage.EMAIL_TEMPLATE_SETTING__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailPackage.EMAIL_TEMPLATE_SETTING__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmailTemplateSettingId() {
		return emailTemplateSettingId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailTemplateSettingId(String newEmailTemplateSettingId) {
		String oldEmailTemplateSettingId = emailTemplateSettingId;
		emailTemplateSettingId = newEmailTemplateSettingId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailPackage.EMAIL_TEMPLATE_SETTING__EMAIL_TEMPLATE_SETTING_ID, oldEmailTemplateSettingId, emailTemplateSettingId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getEmailType() {
		if (emailType != null && ((EObject)emailType).eIsProxy()) {
			InternalEObject oldEmailType = (InternalEObject)emailType;
			emailType = (Enumeration)eResolveProxy(oldEmailType);
			if (emailType != oldEmailType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmailPackage.EMAIL_TEMPLATE_SETTING__EMAIL_TYPE, oldEmailType, emailType));
			}
		}
		return emailType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetEmailType() {
		return emailType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailType(Enumeration newEmailType) {
		Enumeration oldEmailType = emailType;
		emailType = newEmailType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmailPackage.EMAIL_TEMPLATE_SETTING__EMAIL_TYPE, oldEmailType, emailType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmailPackage.EMAIL_TEMPLATE_SETTING__FROM_ADDRESS, oldFromAddress, fromAddress));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmailPackage.EMAIL_TEMPLATE_SETTING__SUBJECT, oldSubject, subject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmailPackage.EMAIL_TEMPLATE_SETTING__XSLFO_ATTACH_SCREEN_LOCATION, oldXslfoAttachScreenLocation, xslfoAttachScreenLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmailPackage.EMAIL_TEMPLATE_SETTING__EMAIL_TEMPLATE_SETTING_ID:
				return getEmailTemplateSettingId();
			case EmailPackage.EMAIL_TEMPLATE_SETTING__BCC_ADDRESS:
				return getBccAddress();
			case EmailPackage.EMAIL_TEMPLATE_SETTING__BODY_SCREEN_LOCATION:
				return getBodyScreenLocation();
			case EmailPackage.EMAIL_TEMPLATE_SETTING__CC_ADDRESS:
				return getCcAddress();
			case EmailPackage.EMAIL_TEMPLATE_SETTING__CONTENT_TYPE:
				return getContentType();
			case EmailPackage.EMAIL_TEMPLATE_SETTING__DESCRIPTION:
				return getDescription();
			case EmailPackage.EMAIL_TEMPLATE_SETTING__FROM_ADDRESS:
				return getFromAddress();
			case EmailPackage.EMAIL_TEMPLATE_SETTING__SUBJECT:
				return getSubject();
			case EmailPackage.EMAIL_TEMPLATE_SETTING__XSLFO_ATTACH_SCREEN_LOCATION:
				return getXslfoAttachScreenLocation();
			case EmailPackage.EMAIL_TEMPLATE_SETTING__EMAIL_TYPE:
				if (resolve) return getEmailType();
				return basicGetEmailType();
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
			case EmailPackage.EMAIL_TEMPLATE_SETTING__EMAIL_TEMPLATE_SETTING_ID:
				setEmailTemplateSettingId((String)newValue);
				return;
			case EmailPackage.EMAIL_TEMPLATE_SETTING__BCC_ADDRESS:
				setBccAddress((String)newValue);
				return;
			case EmailPackage.EMAIL_TEMPLATE_SETTING__BODY_SCREEN_LOCATION:
				setBodyScreenLocation((String)newValue);
				return;
			case EmailPackage.EMAIL_TEMPLATE_SETTING__CC_ADDRESS:
				setCcAddress((String)newValue);
				return;
			case EmailPackage.EMAIL_TEMPLATE_SETTING__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case EmailPackage.EMAIL_TEMPLATE_SETTING__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EmailPackage.EMAIL_TEMPLATE_SETTING__FROM_ADDRESS:
				setFromAddress((String)newValue);
				return;
			case EmailPackage.EMAIL_TEMPLATE_SETTING__SUBJECT:
				setSubject((String)newValue);
				return;
			case EmailPackage.EMAIL_TEMPLATE_SETTING__XSLFO_ATTACH_SCREEN_LOCATION:
				setXslfoAttachScreenLocation((String)newValue);
				return;
			case EmailPackage.EMAIL_TEMPLATE_SETTING__EMAIL_TYPE:
				setEmailType((Enumeration)newValue);
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
			case EmailPackage.EMAIL_TEMPLATE_SETTING__EMAIL_TEMPLATE_SETTING_ID:
				setEmailTemplateSettingId(EMAIL_TEMPLATE_SETTING_ID_EDEFAULT);
				return;
			case EmailPackage.EMAIL_TEMPLATE_SETTING__BCC_ADDRESS:
				setBccAddress(BCC_ADDRESS_EDEFAULT);
				return;
			case EmailPackage.EMAIL_TEMPLATE_SETTING__BODY_SCREEN_LOCATION:
				setBodyScreenLocation(BODY_SCREEN_LOCATION_EDEFAULT);
				return;
			case EmailPackage.EMAIL_TEMPLATE_SETTING__CC_ADDRESS:
				setCcAddress(CC_ADDRESS_EDEFAULT);
				return;
			case EmailPackage.EMAIL_TEMPLATE_SETTING__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case EmailPackage.EMAIL_TEMPLATE_SETTING__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EmailPackage.EMAIL_TEMPLATE_SETTING__FROM_ADDRESS:
				setFromAddress(FROM_ADDRESS_EDEFAULT);
				return;
			case EmailPackage.EMAIL_TEMPLATE_SETTING__SUBJECT:
				setSubject(SUBJECT_EDEFAULT);
				return;
			case EmailPackage.EMAIL_TEMPLATE_SETTING__XSLFO_ATTACH_SCREEN_LOCATION:
				setXslfoAttachScreenLocation(XSLFO_ATTACH_SCREEN_LOCATION_EDEFAULT);
				return;
			case EmailPackage.EMAIL_TEMPLATE_SETTING__EMAIL_TYPE:
				setEmailType((Enumeration)null);
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
			case EmailPackage.EMAIL_TEMPLATE_SETTING__EMAIL_TEMPLATE_SETTING_ID:
				return EMAIL_TEMPLATE_SETTING_ID_EDEFAULT == null ? emailTemplateSettingId != null : !EMAIL_TEMPLATE_SETTING_ID_EDEFAULT.equals(emailTemplateSettingId);
			case EmailPackage.EMAIL_TEMPLATE_SETTING__BCC_ADDRESS:
				return BCC_ADDRESS_EDEFAULT == null ? bccAddress != null : !BCC_ADDRESS_EDEFAULT.equals(bccAddress);
			case EmailPackage.EMAIL_TEMPLATE_SETTING__BODY_SCREEN_LOCATION:
				return BODY_SCREEN_LOCATION_EDEFAULT == null ? bodyScreenLocation != null : !BODY_SCREEN_LOCATION_EDEFAULT.equals(bodyScreenLocation);
			case EmailPackage.EMAIL_TEMPLATE_SETTING__CC_ADDRESS:
				return CC_ADDRESS_EDEFAULT == null ? ccAddress != null : !CC_ADDRESS_EDEFAULT.equals(ccAddress);
			case EmailPackage.EMAIL_TEMPLATE_SETTING__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case EmailPackage.EMAIL_TEMPLATE_SETTING__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EmailPackage.EMAIL_TEMPLATE_SETTING__FROM_ADDRESS:
				return FROM_ADDRESS_EDEFAULT == null ? fromAddress != null : !FROM_ADDRESS_EDEFAULT.equals(fromAddress);
			case EmailPackage.EMAIL_TEMPLATE_SETTING__SUBJECT:
				return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
			case EmailPackage.EMAIL_TEMPLATE_SETTING__XSLFO_ATTACH_SCREEN_LOCATION:
				return XSLFO_ATTACH_SCREEN_LOCATION_EDEFAULT == null ? xslfoAttachScreenLocation != null : !XSLFO_ATTACH_SCREEN_LOCATION_EDEFAULT.equals(xslfoAttachScreenLocation);
			case EmailPackage.EMAIL_TEMPLATE_SETTING__EMAIL_TYPE:
				return emailType != null;
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
		result.append(" (emailTemplateSettingId: ");
		result.append(emailTemplateSettingId);
		result.append(", bccAddress: ");
		result.append(bccAddress);
		result.append(", bodyScreenLocation: ");
		result.append(bodyScreenLocation);
		result.append(", ccAddress: ");
		result.append(ccAddress);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", description: ");
		result.append(description);
		result.append(", fromAddress: ");
		result.append(fromAddress);
		result.append(", subject: ");
		result.append(subject);
		result.append(", xslfoAttachScreenLocation: ");
		result.append(xslfoAttachScreenLocation);
		result.append(')');
		return result.toString();
	}

} //EmailTemplateSettingImpl
