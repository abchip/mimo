/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.data;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Resource Meta Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResourceMetaData#getDataResourceId <em>Data Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResourceMetaData#getMetaDataPredicateId <em>Meta Data Predicate Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResourceMetaData#getDataSourceId <em>Data Source Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResourceMetaData#getMetaDataValue <em>Meta Data Value</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResourceMetaData()
 * @model
 * @generated
 */
public interface DataResourceMetaData extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Data Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Resource Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Resource Id</em>' attribute.
	 * @see #setDataResourceId(String)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResourceMetaData_DataResourceId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='DataResource'"
	 * @generated
	 */
	String getDataResourceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResourceMetaData#getDataResourceId <em>Data Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Resource Id</em>' attribute.
	 * @see #getDataResourceId()
	 * @generated
	 */
	void setDataResourceId(String value);

	/**
	 * Returns the value of the '<em><b>Data Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source Id</em>' attribute.
	 * @see #setDataSourceId(String)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResourceMetaData_DataSourceId()
	 * @model annotation="mimo-ent-domain frame='DataSource'"
	 * @generated
	 */
	String getDataSourceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResourceMetaData#getDataSourceId <em>Data Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source Id</em>' attribute.
	 * @see #getDataSourceId()
	 * @generated
	 */
	void setDataSourceId(String value);

	/**
	 * Returns the value of the '<em><b>Meta Data Predicate Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Data Predicate Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Data Predicate Id</em>' attribute.
	 * @see #setMetaDataPredicateId(String)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResourceMetaData_MetaDataPredicateId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='MetaDataPredicate'"
	 * @generated
	 */
	String getMetaDataPredicateId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResourceMetaData#getMetaDataPredicateId <em>Meta Data Predicate Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Data Predicate Id</em>' attribute.
	 * @see #getMetaDataPredicateId()
	 * @generated
	 */
	void setMetaDataPredicateId(String value);

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
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResourceMetaData_MetaDataValue()
	 * @model
	 * @generated
	 */
	String getMetaDataValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResourceMetaData#getMetaDataValue <em>Meta Data Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Data Value</em>' attribute.
	 * @see #getMetaDataValue()
	 * @generated
	 */
	void setMetaDataValue(String value);

} // DataResourceMetaData
