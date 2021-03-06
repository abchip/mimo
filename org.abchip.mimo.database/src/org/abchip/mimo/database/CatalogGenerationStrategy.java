/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database;

import org.abchip.mimo.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Generation Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.CatalogGenerationStrategy#isCreateIndexOnView <em>Create Index On View</em>}</li>
 *   <li>{@link org.abchip.mimo.database.CatalogGenerationStrategy#isCreateRelativeRecordNumber <em>Create Relative Record Number</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.database.DatabasePackage#getCatalogGenerationStrategy()
 * @model
 * @generated
 */
public interface CatalogGenerationStrategy extends Entity {
	/**
	 * Returns the value of the '<em><b>Create Index On View</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Index On View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Index On View</em>' attribute.
	 * @see #setCreateIndexOnView(boolean)
	 * @see org.abchip.mimo.database.DatabasePackage#getCatalogGenerationStrategy_CreateIndexOnView()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isCreateIndexOnView();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.CatalogGenerationStrategy#isCreateIndexOnView <em>Create Index On View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Index On View</em>' attribute.
	 * @see #isCreateIndexOnView()
	 * @generated
	 */
	void setCreateIndexOnView(boolean value);

	/**
	 * Returns the value of the '<em><b>Create Relative Record Number</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Relative Record Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Relative Record Number</em>' attribute.
	 * @see #setCreateRelativeRecordNumber(boolean)
	 * @see org.abchip.mimo.database.DatabasePackage#getCatalogGenerationStrategy_CreateRelativeRecordNumber()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isCreateRelativeRecordNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.CatalogGenerationStrategy#isCreateRelativeRecordNumber <em>Create Relative Record Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Relative Record Number</em>' attribute.
	 * @see #isCreateRelativeRecordNumber()
	 * @generated
	 */
	void setCreateRelativeRecordNumber(boolean value);

} // CatalogGenerationStrategy
