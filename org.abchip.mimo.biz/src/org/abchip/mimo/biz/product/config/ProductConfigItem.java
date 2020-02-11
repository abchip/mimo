/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.config;

import java.util.List;
import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Config Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.config.ProductConfigItem#getConfigItemId <em>Config Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.ProductConfigItem#getConfigItemName <em>Config Item Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.ProductConfigItem#getConfigItemProductConfigOptions <em>Config Item Product Config Options</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.ProductConfigItem#getConfigItemTypeId <em>Config Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.ProductConfigItem#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.ProductConfigItem#getImageUrl <em>Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.config.ProductConfigItem#getLongDescription <em>Long Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.config.ConfigPackage#getProductConfigItem()
 * @model annotation="mimo-ent-frame title='Product Configuration Question' dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface ProductConfigItem extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Config Item Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Item Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Item Name</em>' attribute.
	 * @see #setConfigItemName(String)
	 * @see org.abchip.mimo.biz.product.config.ConfigPackage#getProductConfigItem_ConfigItemName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getConfigItemName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.config.ProductConfigItem#getConfigItemName <em>Config Item Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Item Name</em>' attribute.
	 * @see #getConfigItemName()
	 * @generated
	 */
	void setConfigItemName(String value);

	/**
	 * Returns the value of the '<em><b>Config Item Product Config Options</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.product.config.ProductConfigOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Item Product Config Options</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Item Product Config Options</em>' reference list.
	 * @see org.abchip.mimo.biz.product.config.ConfigPackage#getProductConfigItem_ConfigItemProductConfigOptions()
	 * @model derived="true"
	 * @generated
	 */
	List<ProductConfigOption> getConfigItemProductConfigOptions();

	/**
	 * Returns the value of the '<em><b>Config Item Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Item Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Item Type Id</em>' attribute.
	 * @see #setConfigItemTypeId(String)
	 * @see org.abchip.mimo.biz.product.config.ConfigPackage#getProductConfigItem_ConfigItemTypeId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getConfigItemTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.config.ProductConfigItem#getConfigItemTypeId <em>Config Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Item Type Id</em>' attribute.
	 * @see #getConfigItemTypeId()
	 * @generated
	 */
	void setConfigItemTypeId(String value);

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
	 * @see org.abchip.mimo.biz.product.config.ConfigPackage#getProductConfigItem_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.config.ProductConfigItem#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Url</em>' attribute.
	 * @see #setImageUrl(String)
	 * @see org.abchip.mimo.biz.product.config.ConfigPackage#getProductConfigItem_ImageUrl()
	 * @model annotation="mimo-ent-format type='url' length='2000'"
	 * @generated
	 */
	String getImageUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.config.ProductConfigItem#getImageUrl <em>Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Url</em>' attribute.
	 * @see #getImageUrl()
	 * @generated
	 */
	void setImageUrl(String value);

	/**
	 * Returns the value of the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Description</em>' attribute.
	 * @see #setLongDescription(String)
	 * @see org.abchip.mimo.biz.product.config.ConfigPackage#getProductConfigItem_LongDescription()
	 * @model
	 * @generated
	 */
	String getLongDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.config.ProductConfigItem#getLongDescription <em>Long Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Description</em>' attribute.
	 * @see #getLongDescription()
	 * @generated
	 */
	void setLongDescription(String value);

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
	 * @see org.abchip.mimo.biz.product.config.ConfigPackage#getProductConfigItem_ConfigItemId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getConfigItemId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.config.ProductConfigItem#getConfigItemId <em>Config Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Item Id</em>' attribute.
	 * @see #getConfigItemId()
	 * @generated
	 */
	void setConfigItemId(String value);

} // ProductConfigItem
