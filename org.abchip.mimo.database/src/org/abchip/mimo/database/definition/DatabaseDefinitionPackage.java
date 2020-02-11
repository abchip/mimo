/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.definition;

import org.abchip.mimo.context.ContextPackage;
import org.abchip.mimo.database.query.DatabaseQueryPackage;

import org.abchip.mimo.entity.EntityPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.abchip.mimo.database.definition.DatabaseDefinitionFactory
 * @model kind="package"
 * @generated
 */
public interface DatabaseDefinitionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "definition";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/database/definition";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dbd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatabaseDefinitionPackage eINSTANCE = org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.impl.DefinitionStatementImpl <em>Definition Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.impl.DefinitionStatementImpl
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getDefinitionStatement()
	 * @generated
	 */
	int DEFINITION_STATEMENT = 12;

	/**
	 * The number of structural features of the '<em>Definition Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_STATEMENT_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.impl.CallStatementImpl <em>Call Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.impl.CallStatementImpl
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getCallStatement()
	 * @generated
	 */
	int CALL_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Procedure Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_STATEMENT__PROCEDURE_NAME = DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parms</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_STATEMENT__PARMS = DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Call Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_STATEMENT_FEATURE_COUNT = DEFINITION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.impl.CommitStatementImpl <em>Commit Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.impl.CommitStatementImpl
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getCommitStatement()
	 * @generated
	 */
	int COMMIT_STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Hold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_STATEMENT__HOLD = DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Commit Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_STATEMENT_FEATURE_COUNT = DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.impl.ConnectStatementImpl <em>Connect Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.impl.ConnectStatementImpl
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getConnectStatement()
	 * @generated
	 */
	int CONNECT_STATEMENT = 2;

	/**
	 * The feature id for the '<em><b>Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_STATEMENT__PWD = DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_STATEMENT__RESET = DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_STATEMENT__TO = DEFINITION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_STATEMENT__USER = DEFINITION_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Connect Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_STATEMENT_FEATURE_COUNT = DEFINITION_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.impl.CreateAliasStatementImpl <em>Create Alias Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.impl.CreateAliasStatementImpl
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getCreateAliasStatement()
	 * @generated
	 */
	int CREATE_ALIAS_STATEMENT = 3;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ALIAS_STATEMENT__ALIAS_NAME = DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ALIAS_STATEMENT__TABLE_NAME = DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Create Alias Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ALIAS_STATEMENT_FEATURE_COUNT = DEFINITION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.impl.CreateIndexStatementImpl <em>Create Index Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.impl.CreateIndexStatementImpl
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getCreateIndexStatement()
	 * @generated
	 */
	int CREATE_INDEX_STATEMENT = 4;

	/**
	 * The feature id for the '<em><b>Index Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX_STATEMENT__INDEX_NAME = DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX_STATEMENT__ON_TABLE = DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sort By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX_STATEMENT__SORT_BY = DEFINITION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX_STATEMENT__UNIQUE = DEFINITION_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Create Index Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX_STATEMENT_FEATURE_COUNT = DEFINITION_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.impl.CreateTableStatementImpl <em>Create Table Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.impl.CreateTableStatementImpl
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getCreateTableStatement()
	 * @generated
	 */
	int CREATE_TABLE_STATEMENT = 5;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE_STATEMENT__TABLE_NAME = DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE_STATEMENT__FIELDS = DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Create Table Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE_STATEMENT_FEATURE_COUNT = DEFINITION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.impl.CreateViewStatementImpl <em>Create View Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.impl.CreateViewStatementImpl
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getCreateViewStatement()
	 * @generated
	 */
	int CREATE_VIEW_STATEMENT = 6;

	/**
	 * The feature id for the '<em><b>View Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW_STATEMENT__VIEW_NAME = DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW_STATEMENT__FIELDS = DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW_STATEMENT__QUERY = DEFINITION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Create View Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW_STATEMENT_FEATURE_COUNT = DEFINITION_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.impl.DatabaseObjectDefImpl <em>Database Object Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.impl.DatabaseObjectDefImpl
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getDatabaseObjectDef()
	 * @generated
	 */
	int DATABASE_OBJECT_DEF = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OBJECT_DEF__LABEL = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Database Object Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OBJECT_DEF_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.DefinitionParser <em>Definition Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.DefinitionParser
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getDefinitionParser()
	 * @generated
	 */
	int DEFINITION_PARSER = 8;

	/**
	 * The number of structural features of the '<em>Definition Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSER_FEATURE_COUNT = DatabaseQueryPackage.STATEMENT_PARSER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.DefinitionParserRegistry <em>Definition Parser Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.DefinitionParserRegistry
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getDefinitionParserRegistry()
	 * @generated
	 */
	int DEFINITION_PARSER_REGISTRY = 9;

	/**
	 * The number of structural features of the '<em>Definition Parser Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSER_REGISTRY_FEATURE_COUNT = ContextPackage.REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.impl.DefinitionParseErrorImpl <em>Definition Parse Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.impl.DefinitionParseErrorImpl
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getDefinitionParseError()
	 * @generated
	 */
	int DEFINITION_PARSE_ERROR = 10;

	/**
	 * The number of structural features of the '<em>Definition Parse Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSE_ERROR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.impl.DefinitionParseResultImpl <em>Definition Parse Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.impl.DefinitionParseResultImpl
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getDefinitionParseResult()
	 * @generated
	 */
	int DEFINITION_PARSE_RESULT = 11;

	/**
	 * The feature id for the '<em><b>Definition Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSE_RESULT__DEFINITION_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Error List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSE_RESULT__ERROR_LIST = 1;

	/**
	 * The number of structural features of the '<em>Definition Parse Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_PARSE_RESULT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.DefinitionWriter <em>Definition Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.DefinitionWriter
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getDefinitionWriter()
	 * @generated
	 */
	int DEFINITION_WRITER = 13;

	/**
	 * The feature id for the '<em><b>Name Helper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_WRITER__NAME_HELPER = DatabaseQueryPackage.STATEMENT_WRITER__NAME_HELPER;

	/**
	 * The number of structural features of the '<em>Definition Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_WRITER_FEATURE_COUNT = DatabaseQueryPackage.STATEMENT_WRITER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.DefinitionWriterRegistry <em>Definition Writer Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.DefinitionWriterRegistry
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getDefinitionWriterRegistry()
	 * @generated
	 */
	int DEFINITION_WRITER_REGISTRY = 14;

	/**
	 * The number of structural features of the '<em>Definition Writer Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_WRITER_REGISTRY_FEATURE_COUNT = ContextPackage.REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.impl.DisconnectStatementImpl <em>Disconnect Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.impl.DisconnectStatementImpl
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getDisconnectStatement()
	 * @generated
	 */
	int DISCONNECT_STATEMENT = 15;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECT_STATEMENT__TARGET = DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Disconnect Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECT_STATEMENT_FEATURE_COUNT = DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.impl.DropStatementImpl <em>Drop Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.impl.DropStatementImpl
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getDropStatement()
	 * @generated
	 */
	int DROP_STATEMENT = 16;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_STATEMENT__RANGE = DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_STATEMENT__TARGET_NAME = DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_STATEMENT__TARGET = DEFINITION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Drop Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_STATEMENT_FEATURE_COUNT = DEFINITION_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.impl.IndexDefImpl <em>Index Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.impl.IndexDefImpl
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getIndexDef()
	 * @generated
	 */
	int INDEX_DEF = 17;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_DEF__LABEL = DATABASE_OBJECT_DEF__LABEL;

	/**
	 * The feature id for the '<em><b>Clustered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_DEF__CLUSTERED = DATABASE_OBJECT_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_DEF__COLUMNS = DATABASE_OBJECT_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_DEF__UNIQUE = DATABASE_OBJECT_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Index Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_DEF_FEATURE_COUNT = DATABASE_OBJECT_DEF_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.impl.IndexColumnDefImpl <em>Index Column Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.impl.IndexColumnDefImpl
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getIndexColumnDef()
	 * @generated
	 */
	int INDEX_COLUMN_DEF = 18;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN_DEF__LABEL = DATABASE_OBJECT_DEF__LABEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN_DEF__NAME = DATABASE_OBJECT_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN_DEF__ORDERING = DATABASE_OBJECT_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN_DEF__SEQUENCE = DATABASE_OBJECT_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Index Column Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_COLUMN_DEF_FEATURE_COUNT = DATABASE_OBJECT_DEF_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.impl.LockTableStatementImpl <em>Lock Table Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.impl.LockTableStatementImpl
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getLockTableStatement()
	 * @generated
	 */
	int LOCK_TABLE_STATEMENT = 19;

	/**
	 * The feature id for the '<em><b>Allow Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_TABLE_STATEMENT__ALLOW_READ = DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Share Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_TABLE_STATEMENT__SHARE_MODE = DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_TABLE_STATEMENT__TABLE_NAME = DEFINITION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Lock Table Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_TABLE_STATEMENT_FEATURE_COUNT = DEFINITION_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.impl.ReleaseStatementImpl <em>Release Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.impl.ReleaseStatementImpl
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getReleaseStatement()
	 * @generated
	 */
	int RELEASE_STATEMENT = 20;

	/**
	 * The feature id for the '<em><b>Server Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STATEMENT__SERVER_NAME = DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Release Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STATEMENT_FEATURE_COUNT = DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.impl.RenameStatementImpl <em>Rename Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.impl.RenameStatementImpl
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getRenameStatement()
	 * @generated
	 */
	int RENAME_STATEMENT = 21;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_STATEMENT__NEW_NAME = DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_STATEMENT__SYSTEM = DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Original Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_STATEMENT__ORIGINAL_NAME = DEFINITION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_STATEMENT__TARGET = DEFINITION_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rename Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_STATEMENT_FEATURE_COUNT = DEFINITION_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.impl.RollbackStatementImpl <em>Rollback Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.impl.RollbackStatementImpl
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getRollbackStatement()
	 * @generated
	 */
	int ROLLBACK_STATEMENT = 22;

	/**
	 * The feature id for the '<em><b>Hold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_STATEMENT__HOLD = DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rollback Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLBACK_STATEMENT_FEATURE_COUNT = DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.impl.SetConnectionStatementImpl <em>Set Connection Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.impl.SetConnectionStatementImpl
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getSetConnectionStatement()
	 * @generated
	 */
	int SET_CONNECTION_STATEMENT = 23;

	/**
	 * The feature id for the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONNECTION_STATEMENT__DATABASE_NAME = DEFINITION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Connection Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONNECTION_STATEMENT_FEATURE_COUNT = DEFINITION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.impl.SchemaDefImpl <em>Schema Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.impl.SchemaDefImpl
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getSchemaDef()
	 * @generated
	 */
	int SCHEMA_DEF = 24;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DEF__LABEL = DATABASE_OBJECT_DEF__LABEL;

	/**
	 * The number of structural features of the '<em>Schema Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DEF_FEATURE_COUNT = DATABASE_OBJECT_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.impl.TableDefImpl <em>Table Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.impl.TableDefImpl
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getTableDef()
	 * @generated
	 */
	int TABLE_DEF = 25;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DEF__LABEL = DATABASE_OBJECT_DEF__LABEL;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DEF__COLUMNS = DATABASE_OBJECT_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DEF_FEATURE_COUNT = DATABASE_OBJECT_DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.impl.TableColumnDefImpl <em>Table Column Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.impl.TableColumnDefImpl
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getTableColumnDef()
	 * @generated
	 */
	int TABLE_COLUMN_DEF = 26;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_DEF__LABEL = DATABASE_OBJECT_DEF__LABEL;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_DEF__DEFAULT = DATABASE_OBJECT_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_DEF__DEFINITION = DATABASE_OBJECT_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_DEF__NAME = DATABASE_OBJECT_DEF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_DEF__NULLABLE = DATABASE_OBJECT_DEF_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Table Column Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_COLUMN_DEF_FEATURE_COUNT = DATABASE_OBJECT_DEF_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.impl.TableTermImpl <em>Table Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.impl.TableTermImpl
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getTableTerm()
	 * @generated
	 */
	int TABLE_TERM = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TERM__NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TERM__TABLE_DEF = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Table Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TERM_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.impl.ViewDefImpl <em>View Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.impl.ViewDefImpl
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getViewDef()
	 * @generated
	 */
	int VIEW_DEF = 28;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DEF__LABEL = TABLE_DEF__LABEL;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DEF__COLUMNS = TABLE_DEF__COLUMNS;

	/**
	 * The feature id for the '<em><b>Query Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DEF__QUERY_SELECT = TABLE_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_DEF_FEATURE_COUNT = TABLE_DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.DropRange <em>Drop Range</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.DropRange
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getDropRange()
	 * @generated
	 */
	int DROP_RANGE = 29;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.OrderingType <em>Ordering Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.OrderingType
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getOrderingType()
	 * @generated
	 */
	int ORDERING_TYPE = 30;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.ShareMode <em>Share Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.ShareMode
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getShareMode()
	 * @generated
	 */
	int SHARE_MODE = 31;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.TargetElement <em>Target Element</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.TargetElement
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getTargetElement()
	 * @generated
	 */
	int TARGET_ELEMENT = 32;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.database.definition.TargetItem <em>Target Item</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.database.definition.TargetItem
	 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getTargetItem()
	 * @generated
	 */
	int TARGET_ITEM = 33;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.CallStatement <em>Call Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Statement</em>'.
	 * @see org.abchip.mimo.database.definition.CallStatement
	 * @generated
	 */
	EClass getCallStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.database.definition.CallStatement#getProcedureName <em>Procedure Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Procedure Name</em>'.
	 * @see org.abchip.mimo.database.definition.CallStatement#getProcedureName()
	 * @see #getCallStatement()
	 * @generated
	 */
	EReference getCallStatement_ProcedureName();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.database.definition.CallStatement#getParms <em>Parms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parms</em>'.
	 * @see org.abchip.mimo.database.definition.CallStatement#getParms()
	 * @see #getCallStatement()
	 * @generated
	 */
	EAttribute getCallStatement_Parms();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.CommitStatement <em>Commit Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commit Statement</em>'.
	 * @see org.abchip.mimo.database.definition.CommitStatement
	 * @generated
	 */
	EClass getCommitStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.CommitStatement#isHold <em>Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hold</em>'.
	 * @see org.abchip.mimo.database.definition.CommitStatement#isHold()
	 * @see #getCommitStatement()
	 * @generated
	 */
	EAttribute getCommitStatement_Hold();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.ConnectStatement <em>Connect Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connect Statement</em>'.
	 * @see org.abchip.mimo.database.definition.ConnectStatement
	 * @generated
	 */
	EClass getConnectStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.ConnectStatement#getPwd <em>Pwd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pwd</em>'.
	 * @see org.abchip.mimo.database.definition.ConnectStatement#getPwd()
	 * @see #getConnectStatement()
	 * @generated
	 */
	EAttribute getConnectStatement_Pwd();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.ConnectStatement#isReset <em>Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reset</em>'.
	 * @see org.abchip.mimo.database.definition.ConnectStatement#isReset()
	 * @see #getConnectStatement()
	 * @generated
	 */
	EAttribute getConnectStatement_Reset();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.ConnectStatement#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see org.abchip.mimo.database.definition.ConnectStatement#getTo()
	 * @see #getConnectStatement()
	 * @generated
	 */
	EAttribute getConnectStatement_To();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.ConnectStatement#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.abchip.mimo.database.definition.ConnectStatement#getUser()
	 * @see #getConnectStatement()
	 * @generated
	 */
	EAttribute getConnectStatement_User();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.CreateAliasStatement <em>Create Alias Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Alias Statement</em>'.
	 * @see org.abchip.mimo.database.definition.CreateAliasStatement
	 * @generated
	 */
	EClass getCreateAliasStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.database.definition.CreateAliasStatement#getAliasName <em>Alias Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alias Name</em>'.
	 * @see org.abchip.mimo.database.definition.CreateAliasStatement#getAliasName()
	 * @see #getCreateAliasStatement()
	 * @generated
	 */
	EReference getCreateAliasStatement_AliasName();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.database.definition.CreateAliasStatement#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Name</em>'.
	 * @see org.abchip.mimo.database.definition.CreateAliasStatement#getTableName()
	 * @see #getCreateAliasStatement()
	 * @generated
	 */
	EReference getCreateAliasStatement_TableName();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.CreateIndexStatement <em>Create Index Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Index Statement</em>'.
	 * @see org.abchip.mimo.database.definition.CreateIndexStatement
	 * @generated
	 */
	EClass getCreateIndexStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.database.definition.CreateIndexStatement#getIndexName <em>Index Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index Name</em>'.
	 * @see org.abchip.mimo.database.definition.CreateIndexStatement#getIndexName()
	 * @see #getCreateIndexStatement()
	 * @generated
	 */
	EReference getCreateIndexStatement_IndexName();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.database.definition.CreateIndexStatement#getOnTable <em>On Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Table</em>'.
	 * @see org.abchip.mimo.database.definition.CreateIndexStatement#getOnTable()
	 * @see #getCreateIndexStatement()
	 * @generated
	 */
	EReference getCreateIndexStatement_OnTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.database.definition.CreateIndexStatement#getSortBy <em>Sort By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sort By</em>'.
	 * @see org.abchip.mimo.database.definition.CreateIndexStatement#getSortBy()
	 * @see #getCreateIndexStatement()
	 * @generated
	 */
	EReference getCreateIndexStatement_SortBy();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.CreateIndexStatement#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.abchip.mimo.database.definition.CreateIndexStatement#isUnique()
	 * @see #getCreateIndexStatement()
	 * @generated
	 */
	EAttribute getCreateIndexStatement_Unique();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.CreateTableStatement <em>Create Table Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Table Statement</em>'.
	 * @see org.abchip.mimo.database.definition.CreateTableStatement
	 * @generated
	 */
	EClass getCreateTableStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.database.definition.CreateTableStatement#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Name</em>'.
	 * @see org.abchip.mimo.database.definition.CreateTableStatement#getTableName()
	 * @see #getCreateTableStatement()
	 * @generated
	 */
	EReference getCreateTableStatement_TableName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.database.definition.CreateTableStatement#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see org.abchip.mimo.database.definition.CreateTableStatement#getFields()
	 * @see #getCreateTableStatement()
	 * @generated
	 */
	EReference getCreateTableStatement_Fields();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.CreateViewStatement <em>Create View Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create View Statement</em>'.
	 * @see org.abchip.mimo.database.definition.CreateViewStatement
	 * @generated
	 */
	EClass getCreateViewStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.database.definition.CreateViewStatement#getViewName <em>View Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>View Name</em>'.
	 * @see org.abchip.mimo.database.definition.CreateViewStatement#getViewName()
	 * @see #getCreateViewStatement()
	 * @generated
	 */
	EReference getCreateViewStatement_ViewName();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.database.definition.CreateViewStatement#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Fields</em>'.
	 * @see org.abchip.mimo.database.definition.CreateViewStatement#getFields()
	 * @see #getCreateViewStatement()
	 * @generated
	 */
	EAttribute getCreateViewStatement_Fields();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.CreateViewStatement#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see org.abchip.mimo.database.definition.CreateViewStatement#getQuery()
	 * @see #getCreateViewStatement()
	 * @generated
	 */
	EAttribute getCreateViewStatement_Query();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.DatabaseObjectDef <em>Database Object Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Object Def</em>'.
	 * @see org.abchip.mimo.database.definition.DatabaseObjectDef
	 * @generated
	 */
	EClass getDatabaseObjectDef();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.DatabaseObjectDef#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.abchip.mimo.database.definition.DatabaseObjectDef#getLabel()
	 * @see #getDatabaseObjectDef()
	 * @generated
	 */
	EAttribute getDatabaseObjectDef_Label();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.DefinitionParser <em>Definition Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Parser</em>'.
	 * @see org.abchip.mimo.database.definition.DefinitionParser
	 * @generated
	 */
	EClass getDefinitionParser();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.DefinitionParserRegistry <em>Definition Parser Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Parser Registry</em>'.
	 * @see org.abchip.mimo.database.definition.DefinitionParserRegistry
	 * @generated
	 */
	EClass getDefinitionParserRegistry();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.DefinitionParseError <em>Definition Parse Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Parse Error</em>'.
	 * @see org.abchip.mimo.database.definition.DefinitionParseError
	 * @generated
	 */
	EClass getDefinitionParseError();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.DefinitionParseResult <em>Definition Parse Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Parse Result</em>'.
	 * @see org.abchip.mimo.database.definition.DefinitionParseResult
	 * @generated
	 */
	EClass getDefinitionParseResult();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.database.definition.DefinitionParseResult#getDefinitionStatement <em>Definition Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition Statement</em>'.
	 * @see org.abchip.mimo.database.definition.DefinitionParseResult#getDefinitionStatement()
	 * @see #getDefinitionParseResult()
	 * @generated
	 */
	EReference getDefinitionParseResult_DefinitionStatement();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.database.definition.DefinitionParseResult#getErrorList <em>Error List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Error List</em>'.
	 * @see org.abchip.mimo.database.definition.DefinitionParseResult#getErrorList()
	 * @see #getDefinitionParseResult()
	 * @generated
	 */
	EReference getDefinitionParseResult_ErrorList();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.DefinitionStatement <em>Definition Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Statement</em>'.
	 * @see org.abchip.mimo.database.definition.DefinitionStatement
	 * @generated
	 */
	EClass getDefinitionStatement();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.DefinitionWriter <em>Definition Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Writer</em>'.
	 * @see org.abchip.mimo.database.definition.DefinitionWriter
	 * @generated
	 */
	EClass getDefinitionWriter();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.DefinitionWriterRegistry <em>Definition Writer Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Writer Registry</em>'.
	 * @see org.abchip.mimo.database.definition.DefinitionWriterRegistry
	 * @generated
	 */
	EClass getDefinitionWriterRegistry();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.DisconnectStatement <em>Disconnect Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disconnect Statement</em>'.
	 * @see org.abchip.mimo.database.definition.DisconnectStatement
	 * @generated
	 */
	EClass getDisconnectStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.DisconnectStatement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.abchip.mimo.database.definition.DisconnectStatement#getTarget()
	 * @see #getDisconnectStatement()
	 * @generated
	 */
	EAttribute getDisconnectStatement_Target();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.DropStatement <em>Drop Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Statement</em>'.
	 * @see org.abchip.mimo.database.definition.DropStatement
	 * @generated
	 */
	EClass getDropStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.DropStatement#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see org.abchip.mimo.database.definition.DropStatement#getRange()
	 * @see #getDropStatement()
	 * @generated
	 */
	EAttribute getDropStatement_Range();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.database.definition.DropStatement#getTargetName <em>Target Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Name</em>'.
	 * @see org.abchip.mimo.database.definition.DropStatement#getTargetName()
	 * @see #getDropStatement()
	 * @generated
	 */
	EReference getDropStatement_TargetName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.DropStatement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.abchip.mimo.database.definition.DropStatement#getTarget()
	 * @see #getDropStatement()
	 * @generated
	 */
	EAttribute getDropStatement_Target();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.IndexDef <em>Index Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Def</em>'.
	 * @see org.abchip.mimo.database.definition.IndexDef
	 * @generated
	 */
	EClass getIndexDef();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.IndexDef#isClustered <em>Clustered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clustered</em>'.
	 * @see org.abchip.mimo.database.definition.IndexDef#isClustered()
	 * @see #getIndexDef()
	 * @generated
	 */
	EAttribute getIndexDef_Clustered();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.database.definition.IndexDef#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.abchip.mimo.database.definition.IndexDef#getColumns()
	 * @see #getIndexDef()
	 * @generated
	 */
	EReference getIndexDef_Columns();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.IndexDef#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.abchip.mimo.database.definition.IndexDef#isUnique()
	 * @see #getIndexDef()
	 * @generated
	 */
	EAttribute getIndexDef_Unique();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.IndexColumnDef <em>Index Column Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Column Def</em>'.
	 * @see org.abchip.mimo.database.definition.IndexColumnDef
	 * @generated
	 */
	EClass getIndexColumnDef();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.IndexColumnDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.database.definition.IndexColumnDef#getName()
	 * @see #getIndexColumnDef()
	 * @generated
	 */
	EAttribute getIndexColumnDef_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.IndexColumnDef#getOrdering <em>Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordering</em>'.
	 * @see org.abchip.mimo.database.definition.IndexColumnDef#getOrdering()
	 * @see #getIndexColumnDef()
	 * @generated
	 */
	EAttribute getIndexColumnDef_Ordering();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.IndexColumnDef#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence</em>'.
	 * @see org.abchip.mimo.database.definition.IndexColumnDef#getSequence()
	 * @see #getIndexColumnDef()
	 * @generated
	 */
	EAttribute getIndexColumnDef_Sequence();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.LockTableStatement <em>Lock Table Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lock Table Statement</em>'.
	 * @see org.abchip.mimo.database.definition.LockTableStatement
	 * @generated
	 */
	EClass getLockTableStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.LockTableStatement#isAllowRead <em>Allow Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Read</em>'.
	 * @see org.abchip.mimo.database.definition.LockTableStatement#isAllowRead()
	 * @see #getLockTableStatement()
	 * @generated
	 */
	EAttribute getLockTableStatement_AllowRead();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.LockTableStatement#getShareMode <em>Share Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Share Mode</em>'.
	 * @see org.abchip.mimo.database.definition.LockTableStatement#getShareMode()
	 * @see #getLockTableStatement()
	 * @generated
	 */
	EAttribute getLockTableStatement_ShareMode();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.database.definition.LockTableStatement#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Name</em>'.
	 * @see org.abchip.mimo.database.definition.LockTableStatement#getTableName()
	 * @see #getLockTableStatement()
	 * @generated
	 */
	EReference getLockTableStatement_TableName();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.ReleaseStatement <em>Release Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release Statement</em>'.
	 * @see org.abchip.mimo.database.definition.ReleaseStatement
	 * @generated
	 */
	EClass getReleaseStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.ReleaseStatement#getServerName <em>Server Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Name</em>'.
	 * @see org.abchip.mimo.database.definition.ReleaseStatement#getServerName()
	 * @see #getReleaseStatement()
	 * @generated
	 */
	EAttribute getReleaseStatement_ServerName();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.RenameStatement <em>Rename Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Statement</em>'.
	 * @see org.abchip.mimo.database.definition.RenameStatement
	 * @generated
	 */
	EClass getRenameStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.RenameStatement#getNewName <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see org.abchip.mimo.database.definition.RenameStatement#getNewName()
	 * @see #getRenameStatement()
	 * @generated
	 */
	EAttribute getRenameStatement_NewName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.RenameStatement#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see org.abchip.mimo.database.definition.RenameStatement#getSystem()
	 * @see #getRenameStatement()
	 * @generated
	 */
	EAttribute getRenameStatement_System();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.database.definition.RenameStatement#getOriginalName <em>Original Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Original Name</em>'.
	 * @see org.abchip.mimo.database.definition.RenameStatement#getOriginalName()
	 * @see #getRenameStatement()
	 * @generated
	 */
	EReference getRenameStatement_OriginalName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.RenameStatement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.abchip.mimo.database.definition.RenameStatement#getTarget()
	 * @see #getRenameStatement()
	 * @generated
	 */
	EAttribute getRenameStatement_Target();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.RollbackStatement <em>Rollback Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rollback Statement</em>'.
	 * @see org.abchip.mimo.database.definition.RollbackStatement
	 * @generated
	 */
	EClass getRollbackStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.RollbackStatement#isHold <em>Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hold</em>'.
	 * @see org.abchip.mimo.database.definition.RollbackStatement#isHold()
	 * @see #getRollbackStatement()
	 * @generated
	 */
	EAttribute getRollbackStatement_Hold();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.SetConnectionStatement <em>Set Connection Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Connection Statement</em>'.
	 * @see org.abchip.mimo.database.definition.SetConnectionStatement
	 * @generated
	 */
	EClass getSetConnectionStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.SetConnectionStatement#getDatabaseName <em>Database Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Name</em>'.
	 * @see org.abchip.mimo.database.definition.SetConnectionStatement#getDatabaseName()
	 * @see #getSetConnectionStatement()
	 * @generated
	 */
	EAttribute getSetConnectionStatement_DatabaseName();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.SchemaDef <em>Schema Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Def</em>'.
	 * @see org.abchip.mimo.database.definition.SchemaDef
	 * @generated
	 */
	EClass getSchemaDef();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.TableDef <em>Table Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Def</em>'.
	 * @see org.abchip.mimo.database.definition.TableDef
	 * @generated
	 */
	EClass getTableDef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.database.definition.TableDef#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.abchip.mimo.database.definition.TableDef#getColumns()
	 * @see #getTableDef()
	 * @generated
	 */
	EReference getTableDef_Columns();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.TableColumnDef <em>Table Column Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Column Def</em>'.
	 * @see org.abchip.mimo.database.definition.TableColumnDef
	 * @generated
	 */
	EClass getTableColumnDef();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.TableColumnDef#isDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.abchip.mimo.database.definition.TableColumnDef#isDefault()
	 * @see #getTableColumnDef()
	 * @generated
	 */
	EAttribute getTableColumnDef_Default();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.database.definition.TableColumnDef#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see org.abchip.mimo.database.definition.TableColumnDef#getDefinition()
	 * @see #getTableColumnDef()
	 * @generated
	 */
	EReference getTableColumnDef_Definition();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.TableColumnDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.database.definition.TableColumnDef#getName()
	 * @see #getTableColumnDef()
	 * @generated
	 */
	EAttribute getTableColumnDef_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.TableColumnDef#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see org.abchip.mimo.database.definition.TableColumnDef#isNullable()
	 * @see #getTableColumnDef()
	 * @generated
	 */
	EAttribute getTableColumnDef_Nullable();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.TableTerm <em>Table Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Term</em>'.
	 * @see org.abchip.mimo.database.definition.TableTerm
	 * @generated
	 */
	EClass getTableTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.TableTerm#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.database.definition.TableTerm#getName()
	 * @see #getTableTerm()
	 * @generated
	 */
	EAttribute getTableTerm_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.database.definition.TableTerm#getTableDef <em>Table Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Def</em>'.
	 * @see org.abchip.mimo.database.definition.TableTerm#getTableDef()
	 * @see #getTableTerm()
	 * @generated
	 */
	EReference getTableTerm_TableDef();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.database.definition.ViewDef <em>View Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Def</em>'.
	 * @see org.abchip.mimo.database.definition.ViewDef
	 * @generated
	 */
	EClass getViewDef();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.database.definition.ViewDef#getQuerySelect <em>Query Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Select</em>'.
	 * @see org.abchip.mimo.database.definition.ViewDef#getQuerySelect()
	 * @see #getViewDef()
	 * @generated
	 */
	EAttribute getViewDef_QuerySelect();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.database.definition.DropRange <em>Drop Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Drop Range</em>'.
	 * @see org.abchip.mimo.database.definition.DropRange
	 * @generated
	 */
	EEnum getDropRange();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.database.definition.OrderingType <em>Ordering Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ordering Type</em>'.
	 * @see org.abchip.mimo.database.definition.OrderingType
	 * @generated
	 */
	EEnum getOrderingType();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.database.definition.ShareMode <em>Share Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Share Mode</em>'.
	 * @see org.abchip.mimo.database.definition.ShareMode
	 * @generated
	 */
	EEnum getShareMode();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.database.definition.TargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Target Element</em>'.
	 * @see org.abchip.mimo.database.definition.TargetElement
	 * @generated
	 */
	EEnum getTargetElement();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.database.definition.TargetItem <em>Target Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Target Item</em>'.
	 * @see org.abchip.mimo.database.definition.TargetItem
	 * @generated
	 */
	EEnum getTargetItem();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatabaseDefinitionFactory getDatabaseDefinitionFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.impl.CallStatementImpl <em>Call Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.impl.CallStatementImpl
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getCallStatement()
		 * @generated
		 */
		EClass CALL_STATEMENT = eINSTANCE.getCallStatement();

		/**
		 * The meta object literal for the '<em><b>Procedure Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_STATEMENT__PROCEDURE_NAME = eINSTANCE.getCallStatement_ProcedureName();

		/**
		 * The meta object literal for the '<em><b>Parms</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_STATEMENT__PARMS = eINSTANCE.getCallStatement_Parms();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.impl.CommitStatementImpl <em>Commit Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.impl.CommitStatementImpl
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getCommitStatement()
		 * @generated
		 */
		EClass COMMIT_STATEMENT = eINSTANCE.getCommitStatement();

		/**
		 * The meta object literal for the '<em><b>Hold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT_STATEMENT__HOLD = eINSTANCE.getCommitStatement_Hold();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.impl.ConnectStatementImpl <em>Connect Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.impl.ConnectStatementImpl
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getConnectStatement()
		 * @generated
		 */
		EClass CONNECT_STATEMENT = eINSTANCE.getConnectStatement();

		/**
		 * The meta object literal for the '<em><b>Pwd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT_STATEMENT__PWD = eINSTANCE.getConnectStatement_Pwd();

		/**
		 * The meta object literal for the '<em><b>Reset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT_STATEMENT__RESET = eINSTANCE.getConnectStatement_Reset();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT_STATEMENT__TO = eINSTANCE.getConnectStatement_To();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT_STATEMENT__USER = eINSTANCE.getConnectStatement_User();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.impl.CreateAliasStatementImpl <em>Create Alias Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.impl.CreateAliasStatementImpl
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getCreateAliasStatement()
		 * @generated
		 */
		EClass CREATE_ALIAS_STATEMENT = eINSTANCE.getCreateAliasStatement();

		/**
		 * The meta object literal for the '<em><b>Alias Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_ALIAS_STATEMENT__ALIAS_NAME = eINSTANCE.getCreateAliasStatement_AliasName();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_ALIAS_STATEMENT__TABLE_NAME = eINSTANCE.getCreateAliasStatement_TableName();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.impl.CreateIndexStatementImpl <em>Create Index Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.impl.CreateIndexStatementImpl
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getCreateIndexStatement()
		 * @generated
		 */
		EClass CREATE_INDEX_STATEMENT = eINSTANCE.getCreateIndexStatement();

		/**
		 * The meta object literal for the '<em><b>Index Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_INDEX_STATEMENT__INDEX_NAME = eINSTANCE.getCreateIndexStatement_IndexName();

		/**
		 * The meta object literal for the '<em><b>On Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_INDEX_STATEMENT__ON_TABLE = eINSTANCE.getCreateIndexStatement_OnTable();

		/**
		 * The meta object literal for the '<em><b>Sort By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_INDEX_STATEMENT__SORT_BY = eINSTANCE.getCreateIndexStatement_SortBy();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_INDEX_STATEMENT__UNIQUE = eINSTANCE.getCreateIndexStatement_Unique();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.impl.CreateTableStatementImpl <em>Create Table Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.impl.CreateTableStatementImpl
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getCreateTableStatement()
		 * @generated
		 */
		EClass CREATE_TABLE_STATEMENT = eINSTANCE.getCreateTableStatement();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_TABLE_STATEMENT__TABLE_NAME = eINSTANCE.getCreateTableStatement_TableName();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_TABLE_STATEMENT__FIELDS = eINSTANCE.getCreateTableStatement_Fields();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.impl.CreateViewStatementImpl <em>Create View Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.impl.CreateViewStatementImpl
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getCreateViewStatement()
		 * @generated
		 */
		EClass CREATE_VIEW_STATEMENT = eINSTANCE.getCreateViewStatement();

		/**
		 * The meta object literal for the '<em><b>View Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_VIEW_STATEMENT__VIEW_NAME = eINSTANCE.getCreateViewStatement_ViewName();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_VIEW_STATEMENT__FIELDS = eINSTANCE.getCreateViewStatement_Fields();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_VIEW_STATEMENT__QUERY = eINSTANCE.getCreateViewStatement_Query();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.impl.DatabaseObjectDefImpl <em>Database Object Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.impl.DatabaseObjectDefImpl
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getDatabaseObjectDef()
		 * @generated
		 */
		EClass DATABASE_OBJECT_DEF = eINSTANCE.getDatabaseObjectDef();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_OBJECT_DEF__LABEL = eINSTANCE.getDatabaseObjectDef_Label();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.DefinitionParser <em>Definition Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.DefinitionParser
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getDefinitionParser()
		 * @generated
		 */
		EClass DEFINITION_PARSER = eINSTANCE.getDefinitionParser();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.DefinitionParserRegistry <em>Definition Parser Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.DefinitionParserRegistry
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getDefinitionParserRegistry()
		 * @generated
		 */
		EClass DEFINITION_PARSER_REGISTRY = eINSTANCE.getDefinitionParserRegistry();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.impl.DefinitionParseErrorImpl <em>Definition Parse Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.impl.DefinitionParseErrorImpl
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getDefinitionParseError()
		 * @generated
		 */
		EClass DEFINITION_PARSE_ERROR = eINSTANCE.getDefinitionParseError();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.impl.DefinitionParseResultImpl <em>Definition Parse Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.impl.DefinitionParseResultImpl
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getDefinitionParseResult()
		 * @generated
		 */
		EClass DEFINITION_PARSE_RESULT = eINSTANCE.getDefinitionParseResult();

		/**
		 * The meta object literal for the '<em><b>Definition Statement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_PARSE_RESULT__DEFINITION_STATEMENT = eINSTANCE.getDefinitionParseResult_DefinitionStatement();

		/**
		 * The meta object literal for the '<em><b>Error List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_PARSE_RESULT__ERROR_LIST = eINSTANCE.getDefinitionParseResult_ErrorList();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.impl.DefinitionStatementImpl <em>Definition Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.impl.DefinitionStatementImpl
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getDefinitionStatement()
		 * @generated
		 */
		EClass DEFINITION_STATEMENT = eINSTANCE.getDefinitionStatement();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.DefinitionWriter <em>Definition Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.DefinitionWriter
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getDefinitionWriter()
		 * @generated
		 */
		EClass DEFINITION_WRITER = eINSTANCE.getDefinitionWriter();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.DefinitionWriterRegistry <em>Definition Writer Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.DefinitionWriterRegistry
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getDefinitionWriterRegistry()
		 * @generated
		 */
		EClass DEFINITION_WRITER_REGISTRY = eINSTANCE.getDefinitionWriterRegistry();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.impl.DisconnectStatementImpl <em>Disconnect Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.impl.DisconnectStatementImpl
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getDisconnectStatement()
		 * @generated
		 */
		EClass DISCONNECT_STATEMENT = eINSTANCE.getDisconnectStatement();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCONNECT_STATEMENT__TARGET = eINSTANCE.getDisconnectStatement_Target();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.impl.DropStatementImpl <em>Drop Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.impl.DropStatementImpl
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getDropStatement()
		 * @generated
		 */
		EClass DROP_STATEMENT = eINSTANCE.getDropStatement();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_STATEMENT__RANGE = eINSTANCE.getDropStatement_Range();

		/**
		 * The meta object literal for the '<em><b>Target Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROP_STATEMENT__TARGET_NAME = eINSTANCE.getDropStatement_TargetName();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_STATEMENT__TARGET = eINSTANCE.getDropStatement_Target();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.impl.IndexDefImpl <em>Index Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.impl.IndexDefImpl
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getIndexDef()
		 * @generated
		 */
		EClass INDEX_DEF = eINSTANCE.getIndexDef();

		/**
		 * The meta object literal for the '<em><b>Clustered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_DEF__CLUSTERED = eINSTANCE.getIndexDef_Clustered();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_DEF__COLUMNS = eINSTANCE.getIndexDef_Columns();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_DEF__UNIQUE = eINSTANCE.getIndexDef_Unique();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.impl.IndexColumnDefImpl <em>Index Column Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.impl.IndexColumnDefImpl
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getIndexColumnDef()
		 * @generated
		 */
		EClass INDEX_COLUMN_DEF = eINSTANCE.getIndexColumnDef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_COLUMN_DEF__NAME = eINSTANCE.getIndexColumnDef_Name();

		/**
		 * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_COLUMN_DEF__ORDERING = eINSTANCE.getIndexColumnDef_Ordering();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_COLUMN_DEF__SEQUENCE = eINSTANCE.getIndexColumnDef_Sequence();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.impl.LockTableStatementImpl <em>Lock Table Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.impl.LockTableStatementImpl
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getLockTableStatement()
		 * @generated
		 */
		EClass LOCK_TABLE_STATEMENT = eINSTANCE.getLockTableStatement();

		/**
		 * The meta object literal for the '<em><b>Allow Read</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCK_TABLE_STATEMENT__ALLOW_READ = eINSTANCE.getLockTableStatement_AllowRead();

		/**
		 * The meta object literal for the '<em><b>Share Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCK_TABLE_STATEMENT__SHARE_MODE = eINSTANCE.getLockTableStatement_ShareMode();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCK_TABLE_STATEMENT__TABLE_NAME = eINSTANCE.getLockTableStatement_TableName();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.impl.ReleaseStatementImpl <em>Release Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.impl.ReleaseStatementImpl
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getReleaseStatement()
		 * @generated
		 */
		EClass RELEASE_STATEMENT = eINSTANCE.getReleaseStatement();

		/**
		 * The meta object literal for the '<em><b>Server Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE_STATEMENT__SERVER_NAME = eINSTANCE.getReleaseStatement_ServerName();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.impl.RenameStatementImpl <em>Rename Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.impl.RenameStatementImpl
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getRenameStatement()
		 * @generated
		 */
		EClass RENAME_STATEMENT = eINSTANCE.getRenameStatement();

		/**
		 * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_STATEMENT__NEW_NAME = eINSTANCE.getRenameStatement_NewName();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_STATEMENT__SYSTEM = eINSTANCE.getRenameStatement_System();

		/**
		 * The meta object literal for the '<em><b>Original Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENAME_STATEMENT__ORIGINAL_NAME = eINSTANCE.getRenameStatement_OriginalName();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_STATEMENT__TARGET = eINSTANCE.getRenameStatement_Target();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.impl.RollbackStatementImpl <em>Rollback Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.impl.RollbackStatementImpl
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getRollbackStatement()
		 * @generated
		 */
		EClass ROLLBACK_STATEMENT = eINSTANCE.getRollbackStatement();

		/**
		 * The meta object literal for the '<em><b>Hold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLLBACK_STATEMENT__HOLD = eINSTANCE.getRollbackStatement_Hold();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.impl.SetConnectionStatementImpl <em>Set Connection Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.impl.SetConnectionStatementImpl
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getSetConnectionStatement()
		 * @generated
		 */
		EClass SET_CONNECTION_STATEMENT = eINSTANCE.getSetConnectionStatement();

		/**
		 * The meta object literal for the '<em><b>Database Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_CONNECTION_STATEMENT__DATABASE_NAME = eINSTANCE.getSetConnectionStatement_DatabaseName();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.impl.SchemaDefImpl <em>Schema Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.impl.SchemaDefImpl
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getSchemaDef()
		 * @generated
		 */
		EClass SCHEMA_DEF = eINSTANCE.getSchemaDef();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.impl.TableDefImpl <em>Table Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.impl.TableDefImpl
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getTableDef()
		 * @generated
		 */
		EClass TABLE_DEF = eINSTANCE.getTableDef();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_DEF__COLUMNS = eINSTANCE.getTableDef_Columns();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.impl.TableColumnDefImpl <em>Table Column Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.impl.TableColumnDefImpl
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getTableColumnDef()
		 * @generated
		 */
		EClass TABLE_COLUMN_DEF = eINSTANCE.getTableColumnDef();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_COLUMN_DEF__DEFAULT = eINSTANCE.getTableColumnDef_Default();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_COLUMN_DEF__DEFINITION = eINSTANCE.getTableColumnDef_Definition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_COLUMN_DEF__NAME = eINSTANCE.getTableColumnDef_Name();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_COLUMN_DEF__NULLABLE = eINSTANCE.getTableColumnDef_Nullable();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.impl.TableTermImpl <em>Table Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.impl.TableTermImpl
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getTableTerm()
		 * @generated
		 */
		EClass TABLE_TERM = eINSTANCE.getTableTerm();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TERM__NAME = eINSTANCE.getTableTerm_Name();

		/**
		 * The meta object literal for the '<em><b>Table Def</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TERM__TABLE_DEF = eINSTANCE.getTableTerm_TableDef();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.impl.ViewDefImpl <em>View Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.impl.ViewDefImpl
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getViewDef()
		 * @generated
		 */
		EClass VIEW_DEF = eINSTANCE.getViewDef();

		/**
		 * The meta object literal for the '<em><b>Query Select</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_DEF__QUERY_SELECT = eINSTANCE.getViewDef_QuerySelect();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.DropRange <em>Drop Range</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.DropRange
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getDropRange()
		 * @generated
		 */
		EEnum DROP_RANGE = eINSTANCE.getDropRange();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.OrderingType <em>Ordering Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.OrderingType
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getOrderingType()
		 * @generated
		 */
		EEnum ORDERING_TYPE = eINSTANCE.getOrderingType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.ShareMode <em>Share Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.ShareMode
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getShareMode()
		 * @generated
		 */
		EEnum SHARE_MODE = eINSTANCE.getShareMode();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.TargetElement <em>Target Element</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.TargetElement
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getTargetElement()
		 * @generated
		 */
		EEnum TARGET_ELEMENT = eINSTANCE.getTargetElement();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.database.definition.TargetItem <em>Target Item</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.database.definition.TargetItem
		 * @see org.abchip.mimo.database.definition.impl.DatabaseDefinitionPackageImpl#getTargetItem()
		 * @generated
		 */
		EEnum TARGET_ITEM = eINSTANCE.getTargetItem();

	}

} //DatabaseDefinitionPackage
