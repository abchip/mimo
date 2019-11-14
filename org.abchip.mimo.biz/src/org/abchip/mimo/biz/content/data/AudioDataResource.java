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
 * A representation of the model object '<em><b>Audio Data ResourceDriver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.data.AudioDataResource#getAudioData <em>Audio Data</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.AudioDataResource#getDataResourceId <em>Data ResourceDriver Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.data.DataPackage#getAudioDataResource()
 * @model
 * @generated
 */
public interface AudioDataResource extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Audio Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audio Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audio Data</em>' attribute.
	 * @see #setAudioData(byte[])
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getAudioDataResource_AudioData()
	 * @model
	 * @generated
	 */
	byte[] getAudioData();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.AudioDataResource#getAudioData <em>Audio Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audio Data</em>' attribute.
	 * @see #getAudioData()
	 * @generated
	 */
	void setAudioData(byte[] value);

	/**
	 * Returns the value of the '<em><b>Data ResourceDriver Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data ResourceDriver Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data ResourceDriver Id</em>' reference.
	 * @see #setDataResourceId(DataResource)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getAudioDataResource_DataResourceId()
	 * @model keys="dataResourceId"
	 * @generated
	 */
	DataResource getDataResourceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.AudioDataResource#getDataResourceId <em>Data ResourceDriver Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data ResourceDriver Id</em>' reference.
	 * @see #getDataResourceId()
	 * @generated
	 */
	void setDataResourceId(DataResource value);

} // AudioDataResource
