/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.config;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Config Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.config.ProductConfigOption#getConfigItemId <em>Config Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.ProductConfigOption#getConfigOptionId <em>Config Option Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.ProductConfigOption#getConfigOptionName <em>Config Option Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.ProductConfigOption#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.ProductConfigOption#getSequenceNum <em>Sequence Num</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.config.ConfigPackage#getProductConfigOption()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface ProductConfigOption extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Config Option Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Option Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Option Id</em>' attribute.
	 * @see #setConfigOptionId(String)
	 * @see org.abchip.mimo.biz.product.config.ConfigPackage#getProductConfigOption_ConfigOptionId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getConfigOptionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.config.ProductConfigOption#getConfigOptionId <em>Config Option Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Option Id</em>' attribute.
	 * @see #getConfigOptionId()
	 * @generated
	 */
	void setConfigOptionId(String value);

	/**
	 * Returns the value of the '<em><b>Config Option Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Option Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Option Name</em>' attribute.
	 * @see #setConfigOptionName(String)
	 * @see org.abchip.mimo.biz.product.config.ConfigPackage#getProductConfigOption_ConfigOptionName()
	 * @model
	 * @generated
	 */
	String getConfigOptionName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.config.ProductConfigOption#getConfigOptionName <em>Config Option Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Option Name</em>' attribute.
	 * @see #getConfigOptionName()
	 * @generated
	 */
	void setConfigOptionName(String value);

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
	 * @see org.abchip.mimo.biz.product.config.ConfigPackage#getProductConfigOption_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.config.ProductConfigOption#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Num</em>' attribute.
	 * @see #setSequenceNum(long)
	 * @see org.abchip.mimo.biz.product.config.ConfigPackage#getProductConfigOption_SequenceNum()
	 * @model
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.config.ProductConfigOption#getSequenceNum <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Num</em>' attribute.
	 * @see #getSequenceNum()
	 * @generated
	 */
	void setSequenceNum(long value);

	/**
	 * Returns the value of the '<em><b>Config Item Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Item Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Item Id</em>' attribute.
	 * @see #setConfigItemId(String)
	 * @see org.abchip.mimo.biz.product.config.ConfigPackage#getProductConfigOption_ConfigItemId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getConfigItemId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.config.ProductConfigOption#getConfigItemId <em>Config Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Item Id</em>' attribute.
	 * @see #getConfigItemId()
	 * @generated
	 */
	void setConfigItemId(String value);

} // ProductConfigOption