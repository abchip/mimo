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
 * A representation of the model object '<em><b>Product Config Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.config.ProductConfigStats#getConfigId <em>Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.ProductConfigStats#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.ProductConfigStats#getConfigTypeId <em>Config Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.ProductConfigStats#getNumOfConfs <em>Num Of Confs</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.config.ConfigPackage#getProductConfigStats()
 * @model
 * @generated
 */
public interface ProductConfigStats extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Id</em>' attribute.
	 * @see #setConfigId(String)
	 * @see org.abchip.mimo.biz.product.config.ConfigPackage#getProductConfigStats_ConfigId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getConfigId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.config.ProductConfigStats#getConfigId <em>Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Id</em>' attribute.
	 * @see #getConfigId()
	 * @generated
	 */
	void setConfigId(String value);

	/**
	 * Returns the value of the '<em><b>Config Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Type Id</em>' attribute.
	 * @see #setConfigTypeId(String)
	 * @see org.abchip.mimo.biz.product.config.ConfigPackage#getProductConfigStats_ConfigTypeId()
	 * @model
	 * @generated
	 */
	String getConfigTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.config.ProductConfigStats#getConfigTypeId <em>Config Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Type Id</em>' attribute.
	 * @see #getConfigTypeId()
	 * @generated
	 */
	void setConfigTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Num Of Confs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Of Confs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Of Confs</em>' attribute.
	 * @see #setNumOfConfs(long)
	 * @see org.abchip.mimo.biz.product.config.ConfigPackage#getProductConfigStats_NumOfConfs()
	 * @model
	 * @generated
	 */
	long getNumOfConfs();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.config.ProductConfigStats#getNumOfConfs <em>Num Of Confs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Of Confs</em>' attribute.
	 * @see #getNumOfConfs()
	 * @generated
	 */
	void setNumOfConfs(long value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' attribute.
	 * @see #setProductId(String)
	 * @see org.abchip.mimo.biz.product.config.ConfigPackage#getProductConfigStats_ProductId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Product'"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.config.ProductConfigStats#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

} // ProductConfigStats
