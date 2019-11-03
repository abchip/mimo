/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.datasource;

import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.datasource.DataSource#getDataSourceId <em>Data Source Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.datasource.DataSource#getDataSourceTypeId <em>Data Source Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.datasource.DataSource#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.datasource.DatasourcePackage#getDataSource()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface DataSource extends BizEntityTyped<DataSourceType> {
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
	 * @see org.abchip.mimo.biz.common.datasource.DatasourcePackage#getDataSource_DataSourceId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getDataSourceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.datasource.DataSource#getDataSourceId <em>Data Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source Id</em>' attribute.
	 * @see #getDataSourceId()
	 * @generated
	 */
	void setDataSourceId(String value);

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
	 * @see org.abchip.mimo.biz.common.datasource.DatasourcePackage#getDataSource_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.datasource.DataSource#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ContentMetaData' route='dataSourceId'"
	 * @generated
	 */
	List<String> contentMetaDatas();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Content' route='dataSourceId'"
	 * @generated
	 */
	List<String> contents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='DataResourceMetaData' route='dataSourceId'"
	 * @generated
	 */
	List<String> dataResourceMetaDatas();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='DataResource' route='dataSourceId'"
	 * @generated
	 */
	List<String> dataResources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='GeoPoint' route='dataSourceId'"
	 * @generated
	 */
	List<String> geoPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Party' route='dataSourceId'"
	 * @generated
	 */
	List<String> parties();

	/**
	 * Returns the value of the '<em><b>Data Source Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source Type Id</em>' attribute.
	 * @see #setDataSourceTypeId(String)
	 * @see org.abchip.mimo.biz.common.datasource.DatasourcePackage#getDataSource_DataSourceTypeId()
	 * @model annotation="mimo-ent-domain frame='DataSourceType'"
	 * @generated
	 */
	String getDataSourceTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.datasource.DataSource#getDataSourceTypeId <em>Data Source Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source Type Id</em>' attribute.
	 * @see #getDataSourceTypeId()
	 * @generated
	 */
	void setDataSourceTypeId(String value);

} // DataSource
