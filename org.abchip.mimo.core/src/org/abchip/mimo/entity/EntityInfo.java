/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.entity;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.entity.EntityInfo#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.EntityInfo#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.EntityInfo#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.entity.EntityInfo#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.entity.EntityPackage#getEntityInfo()
 * @model abstract="true"
 * @generated
 */
public interface EntityInfo {
	/**
	 * Returns the value of the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Stamp</em>' attribute.
	 * @see #setCreatedStamp(Date)
	 * @see org.abchip.mimo.entity.EntityPackage#getEntityInfo_CreatedStamp()
	 * @model annotation="mimo-ent-slot group='info'"
	 * @generated
	 */
	Date getCreatedStamp();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.EntityInfo#getCreatedStamp <em>Created Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Stamp</em>' attribute.
	 * @see #getCreatedStamp()
	 * @generated
	 */
	void setCreatedStamp(Date value);

	/**
	 * Returns the value of the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Tx Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Tx Stamp</em>' attribute.
	 * @see #setCreatedTxStamp(Date)
	 * @see org.abchip.mimo.entity.EntityPackage#getEntityInfo_CreatedTxStamp()
	 * @model annotation="mimo-ent-slot group='info'"
	 * @generated
	 */
	Date getCreatedTxStamp();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.EntityInfo#getCreatedTxStamp <em>Created Tx Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Tx Stamp</em>' attribute.
	 * @see #getCreatedTxStamp()
	 * @generated
	 */
	void setCreatedTxStamp(Date value);

	/**
	 * Returns the value of the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Updated Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Updated Stamp</em>' attribute.
	 * @see #setLastUpdatedStamp(Date)
	 * @see org.abchip.mimo.entity.EntityPackage#getEntityInfo_LastUpdatedStamp()
	 * @model annotation="mimo-ent-slot group='info'"
	 * @generated
	 */
	Date getLastUpdatedStamp();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.EntityInfo#getLastUpdatedStamp <em>Last Updated Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Updated Stamp</em>' attribute.
	 * @see #getLastUpdatedStamp()
	 * @generated
	 */
	void setLastUpdatedStamp(Date value);

	/**
	 * Returns the value of the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Updated Tx Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Updated Tx Stamp</em>' attribute.
	 * @see #setLastUpdatedTxStamp(Date)
	 * @see org.abchip.mimo.entity.EntityPackage#getEntityInfo_LastUpdatedTxStamp()
	 * @model annotation="mimo-ent-slot group='info'"
	 * @generated
	 */
	Date getLastUpdatedTxStamp();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.entity.EntityInfo#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Updated Tx Stamp</em>' attribute.
	 * @see #getLastUpdatedTxStamp()
	 * @generated
	 */
	void setLastUpdatedTxStamp(Date value);

} // EntityInfo
