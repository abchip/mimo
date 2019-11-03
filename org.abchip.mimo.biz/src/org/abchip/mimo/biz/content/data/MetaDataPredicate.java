/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.data;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Data Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.data.MetaDataPredicate#getMetaDataPredicateId <em>Meta Data Predicate Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.MetaDataPredicate#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.data.DataPackage#getMetaDataPredicate()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface MetaDataPredicate extends BizEntity {
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
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getMetaDataPredicate_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.MetaDataPredicate#getDescription <em>Description</em>}' attribute.
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
	 *        annotation="mimo-ent-domain frame='ContentMetaData' route='metaDataPredicateId'"
	 * @generated
	 */
	List<String> contentMetaDatas();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='DataResourceMetaData' route='metaDataPredicateId'"
	 * @generated
	 */
	List<String> dataResourceMetaDatas();

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
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getMetaDataPredicate_MetaDataPredicateId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getMetaDataPredicateId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.MetaDataPredicate#getMetaDataPredicateId <em>Meta Data Predicate Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Data Predicate Id</em>' attribute.
	 * @see #getMetaDataPredicateId()
	 * @generated
	 */
	void setMetaDataPredicateId(String value);

} // MetaDataPredicate
