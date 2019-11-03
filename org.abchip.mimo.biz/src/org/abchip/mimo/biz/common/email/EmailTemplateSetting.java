/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.email;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Email Template Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getEmailTemplateSettingId <em>Email Template Setting Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getBccAddress <em>Bcc Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getBodyScreenLocation <em>Body Screen Location</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getCcAddress <em>Cc Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getEmailType <em>Email Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getFromAddress <em>From Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getXslfoAttachScreenLocation <em>Xslfo Attach Screen Location</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.email.EmailPackage#getEmailTemplateSetting()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface EmailTemplateSetting extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Bcc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bcc Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bcc Address</em>' attribute.
	 * @see #setBccAddress(String)
	 * @see org.abchip.mimo.biz.common.email.EmailPackage#getEmailTemplateSetting_BccAddress()
	 * @model
	 * @generated
	 */
	String getBccAddress();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getBccAddress <em>Bcc Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bcc Address</em>' attribute.
	 * @see #getBccAddress()
	 * @generated
	 */
	void setBccAddress(String value);

	/**
	 * Returns the value of the '<em><b>Body Screen Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Screen Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Screen Location</em>' attribute.
	 * @see #setBodyScreenLocation(String)
	 * @see org.abchip.mimo.biz.common.email.EmailPackage#getEmailTemplateSetting_BodyScreenLocation()
	 * @model
	 * @generated
	 */
	String getBodyScreenLocation();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getBodyScreenLocation <em>Body Screen Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Screen Location</em>' attribute.
	 * @see #getBodyScreenLocation()
	 * @generated
	 */
	void setBodyScreenLocation(String value);

	/**
	 * Returns the value of the '<em><b>Cc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Address</em>' attribute.
	 * @see #setCcAddress(String)
	 * @see org.abchip.mimo.biz.common.email.EmailPackage#getEmailTemplateSetting_CcAddress()
	 * @model
	 * @generated
	 */
	String getCcAddress();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getCcAddress <em>Cc Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Address</em>' attribute.
	 * @see #getCcAddress()
	 * @generated
	 */
	void setCcAddress(String value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(String)
	 * @see org.abchip.mimo.biz.common.email.EmailPackage#getEmailTemplateSetting_ContentType()
	 * @model
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.common.email.EmailPackage#getEmailTemplateSetting_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Email Template Setting Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email Template Setting Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Template Setting Id</em>' attribute.
	 * @see #setEmailTemplateSettingId(String)
	 * @see org.abchip.mimo.biz.common.email.EmailPackage#getEmailTemplateSetting_EmailTemplateSettingId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getEmailTemplateSettingId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getEmailTemplateSettingId <em>Email Template Setting Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Template Setting Id</em>' attribute.
	 * @see #getEmailTemplateSettingId()
	 * @generated
	 */
	void setEmailTemplateSettingId(String value);

	/**
	 * Returns the value of the '<em><b>Email Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Type</em>' attribute.
	 * @see #setEmailType(String)
	 * @see org.abchip.mimo.biz.common.email.EmailPackage#getEmailTemplateSetting_EmailType()
	 * @model
	 * @generated
	 */
	String getEmailType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getEmailType <em>Email Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Type</em>' attribute.
	 * @see #getEmailType()
	 * @generated
	 */
	void setEmailType(String value);

	/**
	 * Returns the value of the '<em><b>From Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Address</em>' attribute.
	 * @see #setFromAddress(String)
	 * @see org.abchip.mimo.biz.common.email.EmailPackage#getEmailTemplateSetting_FromAddress()
	 * @model
	 * @generated
	 */
	String getFromAddress();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getFromAddress <em>From Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Address</em>' attribute.
	 * @see #getFromAddress()
	 * @generated
	 */
	void setFromAddress(String value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see #setSubject(String)
	 * @see org.abchip.mimo.biz.common.email.EmailPackage#getEmailTemplateSetting_Subject()
	 * @model
	 * @generated
	 */
	String getSubject();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getSubject <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' attribute.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(String value);

	/**
	 * Returns the value of the '<em><b>Xslfo Attach Screen Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xslfo Attach Screen Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xslfo Attach Screen Location</em>' attribute.
	 * @see #setXslfoAttachScreenLocation(String)
	 * @see org.abchip.mimo.biz.common.email.EmailPackage#getEmailTemplateSetting_XslfoAttachScreenLocation()
	 * @model
	 * @generated
	 */
	String getXslfoAttachScreenLocation();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getXslfoAttachScreenLocation <em>Xslfo Attach Screen Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xslfo Attach Screen Location</em>' attribute.
	 * @see #getXslfoAttachScreenLocation()
	 * @generated
	 */
	void setXslfoAttachScreenLocation(String value);

} // EmailTemplateSetting
