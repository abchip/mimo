/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.email;

import org.abchip.mimo.biz.BizPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.common.email.EmailFactory
 * @model kind="package"
 * @generated
 */
public interface EmailPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "email";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/common/email";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-email";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmailPackage eINSTANCE = org.abchip.mimo.biz.common.email.impl.EmailPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.email.impl.EmailTemplateSettingImpl <em>Template Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.email.impl.EmailTemplateSettingImpl
	 * @see org.abchip.mimo.biz.common.email.impl.EmailPackageImpl#getEmailTemplateSetting()
	 * @generated
	 */
	int EMAIL_TEMPLATE_SETTING = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE_SETTING__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE_SETTING__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE_SETTING__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE_SETTING__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Email Template Setting Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE_SETTING__EMAIL_TEMPLATE_SETTING_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bcc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE_SETTING__BCC_ADDRESS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body Screen Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE_SETTING__BODY_SCREEN_LOCATION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE_SETTING__CC_ADDRESS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE_SETTING__CONTENT_TYPE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE_SETTING__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Email Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE_SETTING__EMAIL_TYPE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>From Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE_SETTING__FROM_ADDRESS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE_SETTING__SUBJECT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Xslfo Attach Screen Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE_SETTING__XSLFO_ATTACH_SCREEN_LOCATION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Template Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TEMPLATE_SETTING_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting <em>Template Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Setting</em>'.
	 * @see org.abchip.mimo.biz.common.email.EmailTemplateSetting
	 * @generated
	 */
	EClass getEmailTemplateSetting();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getEmailTemplateSettingId <em>Email Template Setting Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Template Setting Id</em>'.
	 * @see org.abchip.mimo.biz.common.email.EmailTemplateSetting#getEmailTemplateSettingId()
	 * @see #getEmailTemplateSetting()
	 * @generated
	 */
	EAttribute getEmailTemplateSetting_EmailTemplateSettingId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getBccAddress <em>Bcc Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bcc Address</em>'.
	 * @see org.abchip.mimo.biz.common.email.EmailTemplateSetting#getBccAddress()
	 * @see #getEmailTemplateSetting()
	 * @generated
	 */
	EAttribute getEmailTemplateSetting_BccAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getBodyScreenLocation <em>Body Screen Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body Screen Location</em>'.
	 * @see org.abchip.mimo.biz.common.email.EmailTemplateSetting#getBodyScreenLocation()
	 * @see #getEmailTemplateSetting()
	 * @generated
	 */
	EAttribute getEmailTemplateSetting_BodyScreenLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getCcAddress <em>Cc Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Address</em>'.
	 * @see org.abchip.mimo.biz.common.email.EmailTemplateSetting#getCcAddress()
	 * @see #getEmailTemplateSetting()
	 * @generated
	 */
	EAttribute getEmailTemplateSetting_CcAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see org.abchip.mimo.biz.common.email.EmailTemplateSetting#getContentType()
	 * @see #getEmailTemplateSetting()
	 * @generated
	 */
	EAttribute getEmailTemplateSetting_ContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.common.email.EmailTemplateSetting#getDescription()
	 * @see #getEmailTemplateSetting()
	 * @generated
	 */
	EAttribute getEmailTemplateSetting_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getEmailType <em>Email Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Email Type</em>'.
	 * @see org.abchip.mimo.biz.common.email.EmailTemplateSetting#getEmailType()
	 * @see #getEmailTemplateSetting()
	 * @generated
	 */
	EReference getEmailTemplateSetting_EmailType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getFromAddress <em>From Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Address</em>'.
	 * @see org.abchip.mimo.biz.common.email.EmailTemplateSetting#getFromAddress()
	 * @see #getEmailTemplateSetting()
	 * @generated
	 */
	EAttribute getEmailTemplateSetting_FromAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see org.abchip.mimo.biz.common.email.EmailTemplateSetting#getSubject()
	 * @see #getEmailTemplateSetting()
	 * @generated
	 */
	EAttribute getEmailTemplateSetting_Subject();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.email.EmailTemplateSetting#getXslfoAttachScreenLocation <em>Xslfo Attach Screen Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xslfo Attach Screen Location</em>'.
	 * @see org.abchip.mimo.biz.common.email.EmailTemplateSetting#getXslfoAttachScreenLocation()
	 * @see #getEmailTemplateSetting()
	 * @generated
	 */
	EAttribute getEmailTemplateSetting_XslfoAttachScreenLocation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EmailFactory getEmailFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.email.impl.EmailTemplateSettingImpl <em>Template Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.email.impl.EmailTemplateSettingImpl
		 * @see org.abchip.mimo.biz.common.email.impl.EmailPackageImpl#getEmailTemplateSetting()
		 * @generated
		 */
		EClass EMAIL_TEMPLATE_SETTING = eINSTANCE.getEmailTemplateSetting();

		/**
		 * The meta object literal for the '<em><b>Email Template Setting Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_TEMPLATE_SETTING__EMAIL_TEMPLATE_SETTING_ID = eINSTANCE.getEmailTemplateSetting_EmailTemplateSettingId();

		/**
		 * The meta object literal for the '<em><b>Bcc Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_TEMPLATE_SETTING__BCC_ADDRESS = eINSTANCE.getEmailTemplateSetting_BccAddress();

		/**
		 * The meta object literal for the '<em><b>Body Screen Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_TEMPLATE_SETTING__BODY_SCREEN_LOCATION = eINSTANCE.getEmailTemplateSetting_BodyScreenLocation();

		/**
		 * The meta object literal for the '<em><b>Cc Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_TEMPLATE_SETTING__CC_ADDRESS = eINSTANCE.getEmailTemplateSetting_CcAddress();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_TEMPLATE_SETTING__CONTENT_TYPE = eINSTANCE.getEmailTemplateSetting_ContentType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_TEMPLATE_SETTING__DESCRIPTION = eINSTANCE.getEmailTemplateSetting_Description();

		/**
		 * The meta object literal for the '<em><b>Email Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMAIL_TEMPLATE_SETTING__EMAIL_TYPE = eINSTANCE.getEmailTemplateSetting_EmailType();

		/**
		 * The meta object literal for the '<em><b>From Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_TEMPLATE_SETTING__FROM_ADDRESS = eINSTANCE.getEmailTemplateSetting_FromAddress();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_TEMPLATE_SETTING__SUBJECT = eINSTANCE.getEmailTemplateSetting_Subject();

		/**
		 * The meta object literal for the '<em><b>Xslfo Attach Screen Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_TEMPLATE_SETTING__XSLFO_ATTACH_SCREEN_LOCATION = eINSTANCE.getEmailTemplateSetting_XslfoAttachScreenLocation();

	}

} //EmailPackage
