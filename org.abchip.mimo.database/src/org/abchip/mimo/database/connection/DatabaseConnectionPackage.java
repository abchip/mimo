/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.connection;

import org.abchip.mimo.context.ContextPackage;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.java.JavaPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.database.connection.DatabaseConnectionFactory
 * @model kind="package"
 * @generated
 */
public interface DatabaseConnectionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "connection";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/database/connection";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dbc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatabaseConnectionPackage eINSTANCE = org.abchip.mimo.database.connection.impl.DatabaseConnectionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.connection.Connection <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.connection.Connection
	 * @see org.abchip.mimo.database.connection.impl.DatabaseConnectionPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 0;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = JavaPackage.JAVA_CLOSEABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.connection.impl.ConnectionConfigImpl <em>Connection Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.connection.impl.ConnectionConfigImpl
	 * @see org.abchip.mimo.database.connection.impl.DatabaseConnectionPackageImpl#getConnectionConfig()
	 * @generated
	 */
	int CONNECTION_CONFIG = 1;

	/**
	 * The feature id for the '<em><b>Credentials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__CREDENTIALS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__VENDOR = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__VERSION = EntityPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__URL = EntityPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__CATALOG = EntityPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG__PERSISTENT = EntityPackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Connection Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CONFIG_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.connection.impl.ConnectionCredentialsImpl <em>Connection Credentials</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.connection.impl.ConnectionCredentialsImpl
	 * @see org.abchip.mimo.database.connection.impl.DatabaseConnectionPackageImpl#getConnectionCredentials()
	 * @generated
	 */
	int CONNECTION_CREDENTIALS = 2;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CREDENTIALS__USER = ContextPackage.AUTHENTICATION_USER_PASSWORD__USER;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CREDENTIALS__PASSWORD = ContextPackage.AUTHENTICATION_USER_PASSWORD__PASSWORD;

	/**
	 * The feature id for the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CREDENTIALS__TENANT = ContextPackage.AUTHENTICATION_USER_PASSWORD__TENANT;

	/**
	 * The number of structural features of the '<em>Connection Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_CREDENTIALS_FEATURE_COUNT = ContextPackage.AUTHENTICATION_USER_PASSWORD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.connection.ConnectionManager <em>Connection Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.connection.ConnectionManager
	 * @see org.abchip.mimo.database.connection.impl.DatabaseConnectionPackageImpl#getConnectionManager()
	 * @generated
	 */
	int CONNECTION_MANAGER = 3;

	/**
	 * The number of structural features of the '<em>Connection Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.connection.Statement <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.connection.Statement
	 * @see org.abchip.mimo.database.connection.impl.DatabaseConnectionPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 5;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = JavaPackage.JAVA_CLOSEABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.connection.PreparedStatement <em>Prepared Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.connection.PreparedStatement
	 * @see org.abchip.mimo.database.connection.impl.DatabaseConnectionPackageImpl#getPreparedStatement()
	 * @generated
	 */
	int PREPARED_STATEMENT = 4;

	/**
	 * The number of structural features of the '<em>Prepared Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARED_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.connection.StatementType <em>Statement Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.connection.StatementType
	 * @see org.abchip.mimo.database.connection.impl.DatabaseConnectionPackageImpl#getStatementType()
	 * @generated
	 */
	int STATEMENT_TYPE = 6;

	/**
	 * The meta object id for the '<em>Database Result Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.sql.ResultSet
	 * @see org.abchip.mimo.database.connection.impl.DatabaseConnectionPackageImpl#getDatabaseResultSet()
	 * @generated
	 */
	int DATABASE_RESULT_SET = 7;

	/**
	 * The meta object id for the '<em>Database Result Set Meta Data</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.sql.ResultSetMetaData
	 * @see org.abchip.mimo.database.connection.impl.DatabaseConnectionPackageImpl#getDatabaseResultSetMetaData()
	 * @generated
	 */
	int DATABASE_RESULT_SET_META_DATA = 8;

	/**
	 * The meta object id for the '<em>Statement Batch Result</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.connection.impl.DatabaseConnectionPackageImpl#getStatementBatchResult()
	 * @generated
	 */
	int STATEMENT_BATCH_RESULT = 9;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.connection.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.abchip.mimo.database.connection.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.connection.ConnectionConfig <em>Connection Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Config</em>'.
	 * @see org.abchip.mimo.database.connection.ConnectionConfig
	 * @generated
	 */
	EClass getConnectionConfig();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.database.connection.ConnectionConfig#getCredentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Credentials</em>'.
	 * @see org.abchip.mimo.database.connection.ConnectionConfig#getCredentials()
	 * @see #getConnectionConfig()
	 * @generated
	 */
	EReference getConnectionConfig_Credentials();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.connection.ConnectionConfig#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see org.abchip.mimo.database.connection.ConnectionConfig#getVendor()
	 * @see #getConnectionConfig()
	 * @generated
	 */
	EAttribute getConnectionConfig_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.connection.ConnectionConfig#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.abchip.mimo.database.connection.ConnectionConfig#getVersion()
	 * @see #getConnectionConfig()
	 * @generated
	 */
	EAttribute getConnectionConfig_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.connection.ConnectionConfig#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.abchip.mimo.database.connection.ConnectionConfig#getUrl()
	 * @see #getConnectionConfig()
	 * @generated
	 */
	EAttribute getConnectionConfig_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.connection.ConnectionConfig#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.abchip.mimo.database.connection.ConnectionConfig#getCatalog()
	 * @see #getConnectionConfig()
	 * @generated
	 */
	EAttribute getConnectionConfig_Catalog();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.connection.ConnectionConfig#isPersistent <em>Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent</em>'.
	 * @see org.abchip.mimo.database.connection.ConnectionConfig#isPersistent()
	 * @see #getConnectionConfig()
	 * @generated
	 */
	EAttribute getConnectionConfig_Persistent();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.connection.ConnectionCredentials <em>Connection Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Credentials</em>'.
	 * @see org.abchip.mimo.database.connection.ConnectionCredentials
	 * @generated
	 */
	EClass getConnectionCredentials();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.connection.ConnectionManager <em>Connection Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Manager</em>'.
	 * @see org.abchip.mimo.database.connection.ConnectionManager
	 * @generated
	 */
	EClass getConnectionManager();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.connection.PreparedStatement <em>Prepared Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prepared Statement</em>'.
	 * @see org.abchip.mimo.database.connection.PreparedStatement
	 * @generated
	 */
	EClass getPreparedStatement();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.connection.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see org.abchip.mimo.database.connection.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.database.connection.StatementType <em>Statement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Statement Type</em>'.
	 * @see org.abchip.mimo.database.connection.StatementType
	 * @generated
	 */
	EEnum getStatementType();

	/**
	 * Returns the meta object for data type '{@link java.sql.ResultSet <em>Database Result Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Database Result Set</em>'.
	 * @see java.sql.ResultSet
	 * @model instanceClass="java.sql.ResultSet" serializeable="false"
	 * @generated
	 */
	EDataType getDatabaseResultSet();

	/**
	 * Returns the meta object for data type '{@link java.sql.ResultSetMetaData <em>Database Result Set Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Database Result Set Meta Data</em>'.
	 * @see java.sql.ResultSetMetaData
	 * @model instanceClass="java.sql.ResultSetMetaData" serializeable="false"
	 * @generated
	 */
	EDataType getDatabaseResultSetMetaData();

	/**
	 * Returns the meta object for data type '<em>Statement Batch Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Statement Batch Result</em>'.
	 * @model instanceClass="int[]" serializeable="false"
	 * @generated
	 */
	EDataType getStatementBatchResult();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatabaseConnectionFactory getDatabaseConnectionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.connection.Connection <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.connection.Connection
		 * @see org.abchip.mimo.database.connection.impl.DatabaseConnectionPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.connection.impl.ConnectionConfigImpl <em>Connection Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.connection.impl.ConnectionConfigImpl
		 * @see org.abchip.mimo.database.connection.impl.DatabaseConnectionPackageImpl#getConnectionConfig()
		 * @generated
		 */
		EClass CONNECTION_CONFIG = eINSTANCE.getConnectionConfig();

		/**
		 * The meta object literal for the '<em><b>Credentials</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_CONFIG__CREDENTIALS = eINSTANCE.getConnectionConfig_Credentials();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__VENDOR = eINSTANCE.getConnectionConfig_Vendor();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__VERSION = eINSTANCE.getConnectionConfig_Version();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__URL = eINSTANCE.getConnectionConfig_Url();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__CATALOG = eINSTANCE.getConnectionConfig_Catalog();

		/**
		 * The meta object literal for the '<em><b>Persistent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION_CONFIG__PERSISTENT = eINSTANCE.getConnectionConfig_Persistent();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.connection.impl.ConnectionCredentialsImpl <em>Connection Credentials</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.connection.impl.ConnectionCredentialsImpl
		 * @see org.abchip.mimo.database.connection.impl.DatabaseConnectionPackageImpl#getConnectionCredentials()
		 * @generated
		 */
		EClass CONNECTION_CREDENTIALS = eINSTANCE.getConnectionCredentials();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.connection.ConnectionManager <em>Connection Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.connection.ConnectionManager
		 * @see org.abchip.mimo.database.connection.impl.DatabaseConnectionPackageImpl#getConnectionManager()
		 * @generated
		 */
		EClass CONNECTION_MANAGER = eINSTANCE.getConnectionManager();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.connection.PreparedStatement <em>Prepared Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.connection.PreparedStatement
		 * @see org.abchip.mimo.database.connection.impl.DatabaseConnectionPackageImpl#getPreparedStatement()
		 * @generated
		 */
		EClass PREPARED_STATEMENT = eINSTANCE.getPreparedStatement();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.connection.Statement <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.connection.Statement
		 * @see org.abchip.mimo.database.connection.impl.DatabaseConnectionPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.connection.StatementType <em>Statement Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.connection.StatementType
		 * @see org.abchip.mimo.database.connection.impl.DatabaseConnectionPackageImpl#getStatementType()
		 * @generated
		 */
		EEnum STATEMENT_TYPE = eINSTANCE.getStatementType();

		/**
		 * The meta object literal for the '<em>Database Result Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.sql.ResultSet
		 * @see org.abchip.mimo.database.connection.impl.DatabaseConnectionPackageImpl#getDatabaseResultSet()
		 * @generated
		 */
		EDataType DATABASE_RESULT_SET = eINSTANCE.getDatabaseResultSet();

		/**
		 * The meta object literal for the '<em>Database Result Set Meta Data</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.sql.ResultSetMetaData
		 * @see org.abchip.mimo.database.connection.impl.DatabaseConnectionPackageImpl#getDatabaseResultSetMetaData()
		 * @generated
		 */
		EDataType DATABASE_RESULT_SET_META_DATA = eINSTANCE.getDatabaseResultSetMetaData();

		/**
		 * The meta object literal for the '<em>Statement Batch Result</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.connection.impl.DatabaseConnectionPackageImpl#getStatementBatchResult()
		 * @generated
		 */
		EDataType STATEMENT_BATCH_RESULT = eINSTANCE.getStatementBatchResult();

	}

} //DatabaseConnectionPackage
