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

import java.sql.SQLException;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.database.connection.ConnectionConfig;
import org.eclipse.datatools.modelbase.sql.constraints.Index;

import org.eclipse.datatools.modelbase.sql.schema.Schema;

import org.eclipse.datatools.modelbase.sql.tables.Table;
import org.eclipse.datatools.modelbase.sql.tables.ViewTable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.CatalogContainer#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.database.CatalogContainer#isActive <em>Active</em>}</li>
 *   <li>{@link org.abchip.mimo.database.CatalogContainer#getConnectionConfig <em>Connection Config</em>}</li>
 *   <li>{@link org.abchip.mimo.database.CatalogContainer#isSupportsGuestAccess <em>Supports Guest Access</em>}</li>
 *   <li>{@link org.abchip.mimo.database.CatalogContainer#getGenerationStrategy <em>Generation Strategy</em>}</li>
 *   <li>{@link org.abchip.mimo.database.CatalogContainer#getSearchStrategy <em>Search Strategy</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.database.DatabasePackage#getCatalogContainer()
 * @model
 * @generated
 */
public interface CatalogContainer {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static final String TEMPLATE_SUFFIX = "mimo.driverTemplate";

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.abchip.mimo.database.DatabasePackage#getCatalogContainer_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.CatalogContainer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see org.abchip.mimo.database.DatabasePackage#getCatalogContainer_Active()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.CatalogContainer#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Connection Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Config</em>' containment reference.
	 * @see #setConnectionConfig(ConnectionConfig)
	 * @see org.abchip.mimo.database.DatabasePackage#getCatalogContainer_ConnectionConfig()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConnectionConfig getConnectionConfig();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.CatalogContainer#getConnectionConfig <em>Connection Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Config</em>' containment reference.
	 * @see #getConnectionConfig()
	 * @generated
	 */
	void setConnectionConfig(ConnectionConfig value);

	/**
	 * Returns the value of the '<em><b>Supports Guest Access</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supports Guest Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supports Guest Access</em>' attribute.
	 * @see #setSupportsGuestAccess(boolean)
	 * @see org.abchip.mimo.database.DatabasePackage#getCatalogContainer_SupportsGuestAccess()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isSupportsGuestAccess();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.CatalogContainer#isSupportsGuestAccess <em>Supports Guest Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supports Guest Access</em>' attribute.
	 * @see #isSupportsGuestAccess()
	 * @generated
	 */
	void setSupportsGuestAccess(boolean value);

	/**
	 * Returns the value of the '<em><b>Generation Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Strategy</em>' containment reference.
	 * @see #setGenerationStrategy(CatalogGenerationStrategy)
	 * @see org.abchip.mimo.database.DatabasePackage#getCatalogContainer_GenerationStrategy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CatalogGenerationStrategy getGenerationStrategy();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.CatalogContainer#getGenerationStrategy <em>Generation Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation Strategy</em>' containment reference.
	 * @see #getGenerationStrategy()
	 * @generated
	 */
	void setGenerationStrategy(CatalogGenerationStrategy value);

	/**
	 * Returns the value of the '<em><b>Search Strategy</b></em>' attribute.
	 * The default value is <code>"CUR"</code>.
	 * The literals are from the enumeration {@link org.abchip.mimo.database.SearchStrategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Strategy</em>' attribute.
	 * @see org.abchip.mimo.database.SearchStrategy
	 * @see #setSearchStrategy(SearchStrategy)
	 * @see org.abchip.mimo.database.DatabasePackage#getCatalogContainer_SearchStrategy()
	 * @model default="CUR" required="true"
	 * @generated
	 */
	SearchStrategy getSearchStrategy();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.database.CatalogContainer#getSearchStrategy <em>Search Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search Strategy</em>' attribute.
	 * @see org.abchip.mimo.database.SearchStrategy
	 * @see #getSearchStrategy()
	 * @generated
	 */
	void setSearchStrategy(SearchStrategy value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException" factoryRequired="true"
	 * @generated
	 */
	<C> C createConnection(Class<C> factory) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.database.DatabaseException" factoryRequired="true"
	 * @generated
	 */
	<C> C createConnection(Class<C> factory, String user, String password) throws SQLException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	CatalogMetaData getMetaData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Context getCatalogContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" tableRequired="true" nameRequired="true"
	 * @generated
	 */
	Index loadIndex(Table table, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	Schema loadSchema(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" schemaRequired="true" nameRequired="true"
	 * @generated
	 */
	Table loadTable(Schema schema, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" schemaRequired="true" nameRequired="true"
	 * @generated
	 */
	ViewTable loadView(Schema schema, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexRequired="true"
	 * @generated
	 */
	void removeIndex(Index index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model schemaRequired="true"
	 * @generated
	 */
	void removeSchema(Schema schema);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tableRequired="true"
	 * @generated
	 */
	void removeTable(Table table);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model viewRequired="true"
	 * @generated
	 */
	void removeView(ViewTable view);

} // CatalogContainer
