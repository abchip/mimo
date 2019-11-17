/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.enum_.Enumeration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Store Email Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getBccAddress <em>Bcc Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getBodyScreenLocation <em>Body Screen Location</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getCcAddress <em>Cc Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getFromAddress <em>From Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getXslfoAttachScreenLocation <em>Xslfo Attach Screen Location</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getEmailType <em>Email Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreEmailSetting()
 * @model
 * @generated
 */
public interface ProductStoreEmailSetting extends BizEntity {
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
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreEmailSetting_BccAddress()
	 * @model annotation="mimo-ent-format type='email' length='320'"
	 * @generated
	 */
	String getBccAddress();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getBccAddress <em>Bcc Address</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreEmailSetting_BodyScreenLocation()
	 * @model annotation="mimo-ent-format type='long-varchar' length='255'"
	 * @generated
	 */
	String getBodyScreenLocation();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getBodyScreenLocation <em>Body Screen Location</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreEmailSetting_CcAddress()
	 * @model annotation="mimo-ent-format type='email' length='320'"
	 * @generated
	 */
	String getCcAddress();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getCcAddress <em>Cc Address</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreEmailSetting_ContentType()
	 * @model annotation="mimo-ent-format type='long-varchar' length='255'"
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

	/**
	 * Returns the value of the '<em><b>Email Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Type</em>' reference.
	 * @see #setEmailType(Enumeration)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreEmailSetting_EmailType()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getEmailType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getEmailType <em>Email Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Type</em>' reference.
	 * @see #getEmailType()
	 * @generated
	 */
	void setEmailType(Enumeration value);

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
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreEmailSetting_FromAddress()
	 * @model annotation="mimo-ent-format type='email' length='320'"
	 * @generated
	 */
	String getFromAddress();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getFromAddress <em>From Address</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreEmailSetting_Subject()
	 * @model annotation="mimo-ent-format type='comment' length='255'"
	 * @generated
	 */
	String getSubject();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getSubject <em>Subject</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreEmailSetting_XslfoAttachScreenLocation()
	 * @model annotation="mimo-ent-format type='long-varchar' length='255'"
	 * @generated
	 */
	String getXslfoAttachScreenLocation();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getXslfoAttachScreenLocation <em>Xslfo Attach Screen Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xslfo Attach Screen Location</em>' attribute.
	 * @see #getXslfoAttachScreenLocation()
	 * @generated
	 */
	void setXslfoAttachScreenLocation(String value);

	/**
	 * Returns the value of the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' reference.
	 * @see #setProductStoreId(ProductStore)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreEmailSetting_ProductStoreId()
	 * @model keys="productStoreId"
	 * @generated
	 */
	ProductStore getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getProductStoreId <em>Product Store Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' reference.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(ProductStore value);

} // ProductStoreEmailSetting
