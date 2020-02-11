/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.config;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Config Option Iactn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.config.ProductConfigOptionIactn#getConfigItemId <em>Config Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.ProductConfigOptionIactn#getConfigItemIdTo <em>Config Item Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.ProductConfigOptionIactn#getConfigOptionId <em>Config Option Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.ProductConfigOptionIactn#getConfigOptionIdTo <em>Config Option Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.ProductConfigOptionIactn#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.ProductConfigOptionIactn#getConfigIactnTypeId <em>Config Iactn Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.ProductConfigOptionIactn#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.config.ConfigPackage#getProductConfigOptionIactn()
 * @model annotation="mimo-ent-frame title='Product Configuration Options' dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface ProductConfigOptionIactn extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Config Iactn Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Iactn Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Iactn Type Id</em>' attribute.
	 * @see #setConfigIactnTypeId(String)
	 * @see org.abchip.mimo.biz.product.config.ConfigPackage#getProductConfigOptionIactn_ConfigIactnTypeId()
	 * @model annotation="mimo-ent-slot help='INCOMPATIBLE, etc...'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getConfigIactnTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.config.ProductConfigOptionIactn#getConfigIactnTypeId <em>Config Iactn Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Iactn Type Id</em>' attribute.
	 * @see #getConfigIactnTypeId()
	 * @generated
	 */
	void setConfigIactnTypeId(String value);

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
	 * @see org.abchip.mimo.biz.product.config.ConfigPackage#getProductConfigOptionIactn_ConfigOptionId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getConfigOptionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.config.ProductConfigOptionIactn#getConfigOptionId <em>Config Option Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Option Id</em>' attribute.
	 * @see #getConfigOptionId()
	 * @generated
	 */
	void setConfigOptionId(String value);

	/**
	 * Returns the value of the '<em><b>Config Option Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Option Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Option Id To</em>' attribute.
	 * @see #setConfigOptionIdTo(String)
	 * @see org.abchip.mimo.biz.product.config.ConfigPackage#getProductConfigOptionIactn_ConfigOptionIdTo()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getConfigOptionIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.config.ProductConfigOptionIactn#getConfigOptionIdTo <em>Config Option Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Option Id To</em>' attribute.
	 * @see #getConfigOptionIdTo()
	 * @generated
	 */
	void setConfigOptionIdTo(String value);

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
	 * @see org.abchip.mimo.biz.product.config.ConfigPackage#getProductConfigOptionIactn_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.config.ProductConfigOptionIactn#getDescription <em>Description</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.product.config.ConfigPackage#getProductConfigOptionIactn_SequenceNum()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.config.ProductConfigOptionIactn#getSequenceNum <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Num</em>' attribute.
	 * @see #getSequenceNum()
	 * @generated
	 */
	void setSequenceNum(long value);

	/**
	 * Returns the value of the '<em><b>Config Item Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Item Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Item Id</em>' reference.
	 * @see #setConfigItemId(ProductConfigItem)
	 * @see org.abchip.mimo.biz.product.config.ConfigPackage#getProductConfigOptionIactn_ConfigItemId()
	 * @model keys="configItemId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductConfigItem getConfigItemId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.config.ProductConfigOptionIactn#getConfigItemId <em>Config Item Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Item Id</em>' reference.
	 * @see #getConfigItemId()
	 * @generated
	 */
	void setConfigItemId(ProductConfigItem value);

	/**
	 * Returns the value of the '<em><b>Config Item Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Item Id To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Item Id To</em>' reference.
	 * @see #setConfigItemIdTo(ProductConfigItem)
	 * @see org.abchip.mimo.biz.product.config.ConfigPackage#getProductConfigOptionIactn_ConfigItemIdTo()
	 * @model keys="configItemId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductConfigItem getConfigItemIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.config.ProductConfigOptionIactn#getConfigItemIdTo <em>Config Item Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Item Id To</em>' reference.
	 * @see #getConfigItemIdTo()
	 * @generated
	 */
	void setConfigItemIdTo(ProductConfigItem value);

} // ProductConfigOptionIactn
