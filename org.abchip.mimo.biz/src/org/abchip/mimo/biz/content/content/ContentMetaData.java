/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.content;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.datasource.DataSource;
import org.abchip.mimo.biz.content.data.MetaDataPredicate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Meta Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentMetaData#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentMetaData#getMetaDataValue <em>Meta Data Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentMetaData#getMetaDataPredicateId <em>Meta Data Predicate Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentMetaData#getDataSourceId <em>Data Source Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentMetaData()
 * @model
 * @generated
 */
public interface ContentMetaData extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Content Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Id</em>' attribute.
	 * @see #setContentId(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentMetaData_ContentId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getContentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentMetaData#getContentId <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Id</em>' attribute.
	 * @see #getContentId()
	 * @generated
	 */
	void setContentId(String value);

	/**
	 * Returns the value of the '<em><b>Data Source Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source Id</em>' reference.
	 * @see #setDataSourceId(DataSource)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentMetaData_DataSourceId()
	 * @model keys="dataSourceId"
	 * @generated
	 */
	DataSource getDataSourceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentMetaData#getDataSourceId <em>Data Source Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source Id</em>' reference.
	 * @see #getDataSourceId()
	 * @generated
	 */
	void setDataSourceId(DataSource value);

	/**
	 * Returns the value of the '<em><b>Meta Data Predicate Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Data Predicate Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Data Predicate Id</em>' reference.
	 * @see #setMetaDataPredicateId(MetaDataPredicate)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentMetaData_MetaDataPredicateId()
	 * @model keys="metaDataPredicateId"
	 * @generated
	 */
	MetaDataPredicate getMetaDataPredicateId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentMetaData#getMetaDataPredicateId <em>Meta Data Predicate Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Data Predicate Id</em>' reference.
	 * @see #getMetaDataPredicateId()
	 * @generated
	 */
	void setMetaDataPredicateId(MetaDataPredicate value);

	/**
	 * Returns the value of the '<em><b>Meta Data Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Data Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Data Value</em>' attribute.
	 * @see #setMetaDataValue(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentMetaData_MetaDataValue()
	 * @model
	 * @generated
	 */
	String getMetaDataValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentMetaData#getMetaDataValue <em>Meta Data Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Data Value</em>' attribute.
	 * @see #getMetaDataValue()
	 * @generated
	 */
	void setMetaDataValue(String value);

} // ContentMetaData
