/**
 *  Copyright (c) 2017, 2018 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.database.query;

import org.abchip.mimo.context.ContextPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.abchip.mimo.database.query.DatabaseQueryFactory
 * @model kind="package"
 * @generated
 */
public interface DatabaseQueryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "query";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/database/query";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dbq";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatabaseQueryPackage eINSTANCE = org.abchip.mimo.database.query.impl.DatabaseQueryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.query.AliasResolver <em>Alias Resolver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.query.AliasResolver
	 * @see org.abchip.mimo.database.query.impl.DatabaseQueryPackageImpl#getAliasResolver()
	 * @generated
	 */
	int ALIAS_RESOLVER = 0;

	/**
	 * The number of structural features of the '<em>Alias Resolver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_RESOLVER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper <em>SQL Object Name Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper
	 * @see org.abchip.mimo.database.query.impl.DatabaseQueryPackageImpl#getSQLObjectNameHelper()
	 * @generated
	 */
	int SQL_OBJECT_NAME_HELPER = 7;

	/**
	 * The number of structural features of the '<em>SQL Object Name Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_OBJECT_NAME_HELPER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.query.NameHelper <em>Name Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.query.NameHelper
	 * @see org.abchip.mimo.database.query.impl.DatabaseQueryPackageImpl#getNameHelper()
	 * @generated
	 */
	int NAME_HELPER = 1;

	/**
	 * The number of structural features of the '<em>Name Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_HELPER_FEATURE_COUNT = SQL_OBJECT_NAME_HELPER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.query.NameHelperRegistry <em>Name Helper Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.query.NameHelperRegistry
	 * @see org.abchip.mimo.database.query.impl.DatabaseQueryPackageImpl#getNameHelperRegistry()
	 * @generated
	 */
	int NAME_HELPER_REGISTRY = 2;

	/**
	 * The number of structural features of the '<em>Name Helper Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_HELPER_REGISTRY_FEATURE_COUNT = ContextPackage.SERVICE_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.query.impl.StatementWriterImpl <em>Statement Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.query.impl.StatementWriterImpl
	 * @see org.abchip.mimo.database.query.impl.DatabaseQueryPackageImpl#getStatementWriter()
	 * @generated
	 */
	int STATEMENT_WRITER = 8;

	/**
	 * The feature id for the '<em><b>Name Helper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_WRITER__NAME_HELPER = 0;

	/**
	 * The number of structural features of the '<em>Statement Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_WRITER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.query.QueryWriter <em>Query Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.query.QueryWriter
	 * @see org.abchip.mimo.database.query.impl.DatabaseQueryPackageImpl#getQueryWriter()
	 * @generated
	 */
	int QUERY_WRITER = 3;

	/**
	 * The feature id for the '<em><b>Name Helper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_WRITER__NAME_HELPER = STATEMENT_WRITER__NAME_HELPER;

	/**
	 * The number of structural features of the '<em>Query Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_WRITER_FEATURE_COUNT = STATEMENT_WRITER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.query.QueryWriterRegistry <em>Query Writer Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.query.QueryWriterRegistry
	 * @see org.abchip.mimo.database.query.impl.DatabaseQueryPackageImpl#getQueryWriterRegistry()
	 * @generated
	 */
	int QUERY_WRITER_REGISTRY = 4;

	/**
	 * The number of structural features of the '<em>Query Writer Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_WRITER_REGISTRY_FEATURE_COUNT = ContextPackage.SERVICE_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.query.StatementParser <em>Statement Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.query.StatementParser
	 * @see org.abchip.mimo.database.query.impl.DatabaseQueryPackageImpl#getStatementParser()
	 * @generated
	 */
	int STATEMENT_PARSER = 9;

	/**
	 * The number of structural features of the '<em>Statement Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_PARSER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.query.QueryParser <em>Query Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.query.QueryParser
	 * @see org.abchip.mimo.database.query.impl.DatabaseQueryPackageImpl#getQueryParser()
	 * @generated
	 */
	int QUERY_PARSER = 5;

	/**
	 * The number of structural features of the '<em>Query Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARSER_FEATURE_COUNT = STATEMENT_PARSER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.query.QueryParserRegistry <em>Query Parser Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.query.QueryParserRegistry
	 * @see org.abchip.mimo.database.query.impl.DatabaseQueryPackageImpl#getQueryParserRegistry()
	 * @generated
	 */
	int QUERY_PARSER_REGISTRY = 6;

	/**
	 * The number of structural features of the '<em>Query Parser Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARSER_REGISTRY_FEATURE_COUNT = ContextPackage.SERVICE_REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>SQL Query Parse Result</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult
	 * @see org.abchip.mimo.database.query.impl.DatabaseQueryPackageImpl#getSQLQueryParseResult()
	 * @generated
	 */
	int SQL_QUERY_PARSE_RESULT = 10;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.query.AliasResolver <em>Alias Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias Resolver</em>'.
	 * @see org.abchip.mimo.database.query.AliasResolver
	 * @generated
	 */
	EClass getAliasResolver();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.query.NameHelper <em>Name Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Helper</em>'.
	 * @see org.abchip.mimo.database.query.NameHelper
	 * @generated
	 */
	EClass getNameHelper();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.query.NameHelperRegistry <em>Name Helper Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Helper Registry</em>'.
	 * @see org.abchip.mimo.database.query.NameHelperRegistry
	 * @generated
	 */
	EClass getNameHelperRegistry();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.query.QueryWriter <em>Query Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Writer</em>'.
	 * @see org.abchip.mimo.database.query.QueryWriter
	 * @generated
	 */
	EClass getQueryWriter();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.query.QueryWriterRegistry <em>Query Writer Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Writer Registry</em>'.
	 * @see org.abchip.mimo.database.query.QueryWriterRegistry
	 * @generated
	 */
	EClass getQueryWriterRegistry();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.query.QueryParser <em>Query Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Parser</em>'.
	 * @see org.abchip.mimo.database.query.QueryParser
	 * @generated
	 */
	EClass getQueryParser();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.query.QueryParserRegistry <em>Query Parser Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Parser Registry</em>'.
	 * @see org.abchip.mimo.database.query.QueryParserRegistry
	 * @generated
	 */
	EClass getQueryParserRegistry();

	/**
	 * Returns the meta object for class '{@link org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper <em>SQL Object Name Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQL Object Name Helper</em>'.
	 * @see org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper
	 * @model instanceClass="org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper"
	 * @generated
	 */
	EClass getSQLObjectNameHelper();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.query.StatementWriter <em>Statement Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Writer</em>'.
	 * @see org.abchip.mimo.database.query.StatementWriter
	 * @generated
	 */
	EClass getStatementWriter();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.database.query.StatementWriter#getNameHelper <em>Name Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name Helper</em>'.
	 * @see org.abchip.mimo.database.query.StatementWriter#getNameHelper()
	 * @see #getStatementWriter()
	 * @generated
	 */
	EReference getStatementWriter_NameHelper();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.query.StatementParser <em>Statement Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Parser</em>'.
	 * @see org.abchip.mimo.database.query.StatementParser
	 * @generated
	 */
	EClass getStatementParser();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult <em>SQL Query Parse Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SQL Query Parse Result</em>'.
	 * @see org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult
	 * @model instanceClass="org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult"
	 * @generated
	 */
	EDataType getSQLQueryParseResult();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatabaseQueryFactory getDatabaseQueryFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.database.query.AliasResolver <em>Alias Resolver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.query.AliasResolver
		 * @see org.abchip.mimo.database.query.impl.DatabaseQueryPackageImpl#getAliasResolver()
		 * @generated
		 */
		EClass ALIAS_RESOLVER = eINSTANCE.getAliasResolver();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.query.NameHelper <em>Name Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.query.NameHelper
		 * @see org.abchip.mimo.database.query.impl.DatabaseQueryPackageImpl#getNameHelper()
		 * @generated
		 */
		EClass NAME_HELPER = eINSTANCE.getNameHelper();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.query.NameHelperRegistry <em>Name Helper Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.query.NameHelperRegistry
		 * @see org.abchip.mimo.database.query.impl.DatabaseQueryPackageImpl#getNameHelperRegistry()
		 * @generated
		 */
		EClass NAME_HELPER_REGISTRY = eINSTANCE.getNameHelperRegistry();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.query.QueryWriter <em>Query Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.query.QueryWriter
		 * @see org.abchip.mimo.database.query.impl.DatabaseQueryPackageImpl#getQueryWriter()
		 * @generated
		 */
		EClass QUERY_WRITER = eINSTANCE.getQueryWriter();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.query.QueryWriterRegistry <em>Query Writer Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.query.QueryWriterRegistry
		 * @see org.abchip.mimo.database.query.impl.DatabaseQueryPackageImpl#getQueryWriterRegistry()
		 * @generated
		 */
		EClass QUERY_WRITER_REGISTRY = eINSTANCE.getQueryWriterRegistry();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.query.QueryParser <em>Query Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.query.QueryParser
		 * @see org.abchip.mimo.database.query.impl.DatabaseQueryPackageImpl#getQueryParser()
		 * @generated
		 */
		EClass QUERY_PARSER = eINSTANCE.getQueryParser();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.query.QueryParserRegistry <em>Query Parser Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.query.QueryParserRegistry
		 * @see org.abchip.mimo.database.query.impl.DatabaseQueryPackageImpl#getQueryParserRegistry()
		 * @generated
		 */
		EClass QUERY_PARSER_REGISTRY = eINSTANCE.getQueryParserRegistry();

		/**
		 * The meta object literal for the '{@link org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper <em>SQL Object Name Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.datatools.modelbase.sql.schema.helper.ISQLObjectNameHelper
		 * @see org.abchip.mimo.database.query.impl.DatabaseQueryPackageImpl#getSQLObjectNameHelper()
		 * @generated
		 */
		EClass SQL_OBJECT_NAME_HELPER = eINSTANCE.getSQLObjectNameHelper();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.query.impl.StatementWriterImpl <em>Statement Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.query.impl.StatementWriterImpl
		 * @see org.abchip.mimo.database.query.impl.DatabaseQueryPackageImpl#getStatementWriter()
		 * @generated
		 */
		EClass STATEMENT_WRITER = eINSTANCE.getStatementWriter();

		/**
		 * The meta object literal for the '<em><b>Name Helper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_WRITER__NAME_HELPER = eINSTANCE.getStatementWriter_NameHelper();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.query.StatementParser <em>Statement Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.query.StatementParser
		 * @see org.abchip.mimo.database.query.impl.DatabaseQueryPackageImpl#getStatementParser()
		 * @generated
		 */
		EClass STATEMENT_PARSER = eINSTANCE.getStatementParser();

		/**
		 * The meta object literal for the '<em>SQL Query Parse Result</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult
		 * @see org.abchip.mimo.database.query.impl.DatabaseQueryPackageImpl#getSQLQueryParseResult()
		 * @generated
		 */
		EDataType SQL_QUERY_PARSE_RESULT = eINSTANCE.getSQLQueryParseResult();

	}

} //DatabaseQueryPackage
