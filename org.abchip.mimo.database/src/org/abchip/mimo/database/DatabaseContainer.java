/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.database;

import java.util.List;
import org.abchip.mimo.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.DatabaseContainer#getCatalogContainers <em>Catalog Containers</em>}</li>
 *   <li>{@link org.abchip.mimo.database.DatabaseContainer#getDefaultCatalogContainer <em>Default Catalog Container</em>}</li>
 *   <li>{@link org.abchip.mimo.database.DatabaseContainer#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.abchip.mimo.database.DatabaseContainer#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.database.DatabasePackage#getDatabaseContainer()
 * @model
 * @generated
 */
public interface DatabaseContainer extends Entity {
	/**
	 * Returns the value of the '<em><b>Catalog Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.database.CatalogContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalog Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog Containers</em>' containment reference list.
	 * @see org.abchip.mimo.database.DatabasePackage#getDatabaseContainer_CatalogContainers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	List<CatalogContainer> getCatalogContainers();

	/**
	 * Returns the value of the '<em><b>Default Catalog Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Catalog Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Catalog Container</em>' reference.
	 * @see #setDefaultCatalogContainer(CatalogContainer)
	 * @see org.abchip.mimo.database.DatabasePackage#getDatabaseContainer_DefaultCatalogContainer()
	 * @model keys="name" required="true"
	 * @generated
	 */
	CatalogContainer getDefaultCatalogContainer();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.DatabaseContainer#getDefaultCatalogContainer <em>Default Catalog Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Catalog Container</em>' reference.
	 * @see #getDefaultCatalogContainer()
	 * @generated
	 */
	void setDefaultCatalogContainer(CatalogContainer value);

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(String)
	 * @see org.abchip.mimo.database.DatabasePackage#getDatabaseContainer_Vendor()
	 * @model required="true"
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.DatabaseContainer#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.abchip.mimo.database.DatabasePackage#getDatabaseContainer_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.DatabaseContainer#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // DatabaseContainer
