/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.crypto;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Key Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.crypto.EntityKeyStore#getKeyName <em>Key Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.crypto.EntityKeyStore#getKeyText <em>Key Text</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.entity.crypto.CryptoPackage#getEntityKeyStore()
 * @model
 * @generated
 */
public interface EntityKeyStore extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Name</em>' attribute.
	 * @see #setKeyName(String)
	 * @see org.abchip.mimo.biz.entity.crypto.CryptoPackage#getEntityKeyStore_KeyName()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getKeyName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.crypto.EntityKeyStore#getKeyName <em>Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Name</em>' attribute.
	 * @see #getKeyName()
	 * @generated
	 */
	void setKeyName(String value);

	/**
	 * Returns the value of the '<em><b>Key Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Text</em>' attribute.
	 * @see #setKeyText(String)
	 * @see org.abchip.mimo.biz.entity.crypto.CryptoPackage#getEntityKeyStore_KeyText()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getKeyText();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.crypto.EntityKeyStore#getKeyText <em>Key Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Text</em>' attribute.
	 * @see #getKeyText()
	 * @generated
	 */
	void setKeyText(String value);

} // EntityKeyStore
