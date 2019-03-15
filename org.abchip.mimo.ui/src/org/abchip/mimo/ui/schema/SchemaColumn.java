/**
 * Copyright (c) 2017, 2019 ABChip and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.ui.schema;

import org.abchip.mimo.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.ui.schema.SchemaColumn#getId <em>Id</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.schema.SchemaColumn#getHeader <em>Header</em>}</li>
 *   <li>{@link org.abchip.mimo.ui.schema.SchemaColumn#isAdjust <em>Adjust</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.ui.schema.SchemaPackage#getSchemaColumn()
 * @model
 * @generated
 */
public interface SchemaColumn extends Entity {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.abchip.mimo.ui.schema.SchemaPackage#getSchemaColumn_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.schema.SchemaColumn#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' attribute.
	 * @see #setHeader(String)
	 * @see org.abchip.mimo.ui.schema.SchemaPackage#getSchemaColumn_Header()
	 * @model
	 * @generated
	 */
	String getHeader();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.schema.SchemaColumn#getHeader <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' attribute.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(String value);

	/**
	 * Returns the value of the '<em><b>Adjust</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adjust</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjust</em>' attribute.
	 * @see #setAdjust(boolean)
	 * @see org.abchip.mimo.ui.schema.SchemaPackage#getSchemaColumn_Adjust()
	 * @model
	 * @generated
	 */
	boolean isAdjust();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.ui.schema.SchemaColumn#isAdjust <em>Adjust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adjust</em>' attribute.
	 * @see #isAdjust()
	 * @generated
	 */
	void setAdjust(boolean value);

} // SchemaColumn
