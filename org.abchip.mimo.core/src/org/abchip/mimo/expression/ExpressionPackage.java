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
package org.abchip.mimo.expression;

import org.abchip.mimo.context.ContextPackage;
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
 * @see org.abchip.mimo.expression.ExpressionFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "expression";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/expression";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mimo-exp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionPackage eINSTANCE = org.abchip.mimo.expression.impl.ExpressionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.expression.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.expression.impl.ExpressionImpl
	 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 7;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.expression.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.expression.impl.ArithmeticExpressionImpl
	 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getArithmeticExpression()
	 * @generated
	 */
	int ARITHMETIC_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.expression.impl.ArrayExpressionImpl <em>Array Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.expression.impl.ArrayExpressionImpl
	 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getArrayExpression()
	 * @generated
	 */
	int ARRAY_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.expression.impl.AssignmentExpressionImpl <em>Assignment Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.expression.impl.AssignmentExpressionImpl
	 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getAssignmentExpression()
	 * @generated
	 */
	int ASSIGNMENT_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXPRESSION__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXPRESSION__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assignment Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.expression.impl.TermExpressionImpl <em>Term Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.expression.impl.TermExpressionImpl
	 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getTermExpression()
	 * @generated
	 */
	int TERM_EXPRESSION = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Term Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.expression.impl.AtomicTermExpressionImpl <em>Atomic Term Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.expression.impl.AtomicTermExpressionImpl
	 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getAtomicTermExpression()
	 * @generated
	 */
	int ATOMIC_TERM_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TERM_EXPRESSION__VALUE = TERM_EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TERM_EXPRESSION__TYPE = TERM_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Term Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TERM_EXPRESSION_FEATURE_COUNT = TERM_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.expression.impl.PredicateExpressionImpl <em>Predicate Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.expression.impl.PredicateExpressionImpl
	 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getPredicateExpression()
	 * @generated
	 */
	int PREDICATE_EXPRESSION = 15;

	/**
	 * The number of structural features of the '<em>Predicate Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.expression.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.expression.impl.BooleanExpressionImpl
	 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__OPERAND = PREDICATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = PREDICATE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.expression.impl.BlockExpressionImpl <em>Block Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.expression.impl.BlockExpressionImpl
	 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getBlockExpression()
	 * @generated
	 */
	int BLOCK_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.expression.impl.CompoundTermExpressionImpl <em>Compound Term Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.expression.impl.CompoundTermExpressionImpl
	 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getCompoundTermExpression()
	 * @generated
	 */
	int COMPOUND_TERM_EXPRESSION = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TERM_EXPRESSION__VALUE = TERM_EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TERM_EXPRESSION__ELEMENTS = TERM_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compound Term Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_TERM_EXPRESSION_FEATURE_COUNT = TERM_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.expression.ExpressionParser <em>Parser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.expression.ExpressionParser
	 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getExpressionParser()
	 * @generated
	 */
	int EXPRESSION_PARSER = 8;

	/**
	 * The number of structural features of the '<em>Parser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PARSER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.expression.ExpressionParserRegistry <em>Parser Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.expression.ExpressionParserRegistry
	 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getExpressionParserRegistry()
	 * @generated
	 */
	int EXPRESSION_PARSER_REGISTRY = 9;

	/**
	 * The number of structural features of the '<em>Parser Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PARSER_REGISTRY_FEATURE_COUNT = ContextPackage.REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.expression.ExpressionWriter <em>Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.expression.ExpressionWriter
	 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getExpressionWriter()
	 * @generated
	 */
	int EXPRESSION_WRITER = 10;

	/**
	 * The number of structural features of the '<em>Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_WRITER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.expression.ExpressionWriterRegistry <em>Writer Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.expression.ExpressionWriterRegistry
	 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getExpressionWriterRegistry()
	 * @generated
	 */
	int EXPRESSION_WRITER_REGISTRY = 11;

	/**
	 * The number of structural features of the '<em>Writer Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_WRITER_REGISTRY_FEATURE_COUNT = ContextPackage.REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.expression.impl.ExpressionVisitorImpl <em>Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.expression.impl.ExpressionVisitorImpl
	 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getExpressionVisitor()
	 * @generated
	 */
	int EXPRESSION_VISITOR = 12;

	/**
	 * The number of structural features of the '<em>Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_VISITOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.expression.impl.FunctionTermExpressionImpl <em>Function Term Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.expression.impl.FunctionTermExpressionImpl
	 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getFunctionTermExpression()
	 * @generated
	 */
	int FUNCTION_TERM_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TERM_EXPRESSION__VALUE = COMPOUND_TERM_EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TERM_EXPRESSION__ELEMENTS = COMPOUND_TERM_EXPRESSION__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Function Term Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TERM_EXPRESSION_FEATURE_COUNT = COMPOUND_TERM_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.expression.impl.LogicalExpressionImpl <em>Logical Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.expression.impl.LogicalExpressionImpl
	 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getLogicalExpression()
	 * @generated
	 */
	int LOGICAL_EXPRESSION = 14;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION__LEFT_OPERAND = PREDICATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION__OPERATOR = PREDICATE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION__RIGHT_OPERAND = PREDICATE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION_FEATURE_COUNT = PREDICATE_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.expression.impl.QualifiedTermExpressionImpl <em>Qualified Term Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.expression.impl.QualifiedTermExpressionImpl
	 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getQualifiedTermExpression()
	 * @generated
	 */
	int QUALIFIED_TERM_EXPRESSION = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_TERM_EXPRESSION__VALUE = COMPOUND_TERM_EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_TERM_EXPRESSION__ELEMENTS = COMPOUND_TERM_EXPRESSION__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Qualified Term Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_TERM_EXPRESSION_FEATURE_COUNT = COMPOUND_TERM_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.expression.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.expression.impl.RelationalExpressionImpl
	 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getRelationalExpression()
	 * @generated
	 */
	int RELATIONAL_EXPRESSION = 17;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__LEFT_OPERAND = PREDICATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__OPERATOR = PREDICATE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__RIGHT_OPERAND = PREDICATE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION_FEATURE_COUNT = PREDICATE_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.expression.ArithmeticOperator <em>Arithmetic Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.expression.ArithmeticOperator
	 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getArithmeticOperator()
	 * @generated
	 */
	int ARITHMETIC_OPERATOR = 19;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.expression.AssignmentOperator <em>Assignment Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.expression.AssignmentOperator
	 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getAssignmentOperator()
	 * @generated
	 */
	int ASSIGNMENT_OPERATOR = 20;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.expression.AtomicType <em>Atomic Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.expression.AtomicType
	 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getAtomicType()
	 * @generated
	 */
	int ATOMIC_TYPE = 21;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.expression.ExpressionType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.expression.ExpressionType
	 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getExpressionType()
	 * @generated
	 */
	int EXPRESSION_TYPE = 22;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.expression.LogicalOperator <em>Logical Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.expression.LogicalOperator
	 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 23;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.expression.RelationalOperator <em>Relational Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.expression.RelationalOperator
	 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getRelationalOperator()
	 * @generated
	 */
	int RELATIONAL_OPERATOR = 24;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.expression.ArithmeticExpression <em>Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Expression</em>'.
	 * @see org.abchip.mimo.expression.ArithmeticExpression
	 * @generated
	 */
	EClass getArithmeticExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.expression.ArithmeticExpression#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see org.abchip.mimo.expression.ArithmeticExpression#getLeftOperand()
	 * @see #getArithmeticExpression()
	 * @generated
	 */
	EReference getArithmeticExpression_LeftOperand();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.expression.ArithmeticExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.abchip.mimo.expression.ArithmeticExpression#getOperator()
	 * @see #getArithmeticExpression()
	 * @generated
	 */
	EAttribute getArithmeticExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.expression.ArithmeticExpression#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see org.abchip.mimo.expression.ArithmeticExpression#getRightOperand()
	 * @see #getArithmeticExpression()
	 * @generated
	 */
	EReference getArithmeticExpression_RightOperand();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.expression.ArrayExpression <em>Array Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Expression</em>'.
	 * @see org.abchip.mimo.expression.ArrayExpression
	 * @generated
	 */
	EClass getArrayExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.expression.ArrayExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see org.abchip.mimo.expression.ArrayExpression#getExpression()
	 * @see #getArrayExpression()
	 * @generated
	 */
	EReference getArrayExpression_Expression();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.expression.AssignmentExpression <em>Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Expression</em>'.
	 * @see org.abchip.mimo.expression.AssignmentExpression
	 * @generated
	 */
	EClass getAssignmentExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.expression.AssignmentExpression#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see org.abchip.mimo.expression.AssignmentExpression#getLeftOperand()
	 * @see #getAssignmentExpression()
	 * @generated
	 */
	EReference getAssignmentExpression_LeftOperand();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.expression.AssignmentExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.abchip.mimo.expression.AssignmentExpression#getOperator()
	 * @see #getAssignmentExpression()
	 * @generated
	 */
	EAttribute getAssignmentExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.expression.AssignmentExpression#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see org.abchip.mimo.expression.AssignmentExpression#getRightOperand()
	 * @see #getAssignmentExpression()
	 * @generated
	 */
	EReference getAssignmentExpression_RightOperand();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.expression.AtomicTermExpression <em>Atomic Term Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Term Expression</em>'.
	 * @see org.abchip.mimo.expression.AtomicTermExpression
	 * @generated
	 */
	EClass getAtomicTermExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.expression.AtomicTermExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.abchip.mimo.expression.AtomicTermExpression#getType()
	 * @see #getAtomicTermExpression()
	 * @generated
	 */
	EAttribute getAtomicTermExpression_Type();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.expression.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see org.abchip.mimo.expression.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.expression.BooleanExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.abchip.mimo.expression.BooleanExpression#getOperand()
	 * @see #getBooleanExpression()
	 * @generated
	 */
	EReference getBooleanExpression_Operand();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.expression.BlockExpression <em>Block Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Expression</em>'.
	 * @see org.abchip.mimo.expression.BlockExpression
	 * @generated
	 */
	EClass getBlockExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.expression.BlockExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.abchip.mimo.expression.BlockExpression#getExpression()
	 * @see #getBlockExpression()
	 * @generated
	 */
	EReference getBlockExpression_Expression();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.expression.CompoundTermExpression <em>Compound Term Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Term Expression</em>'.
	 * @see org.abchip.mimo.expression.CompoundTermExpression
	 * @generated
	 */
	EClass getCompoundTermExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.expression.CompoundTermExpression#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.abchip.mimo.expression.CompoundTermExpression#getElements()
	 * @see #getCompoundTermExpression()
	 * @generated
	 */
	EReference getCompoundTermExpression_Elements();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.expression.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.abchip.mimo.expression.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.expression.ExpressionParser <em>Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parser</em>'.
	 * @see org.abchip.mimo.expression.ExpressionParser
	 * @generated
	 */
	EClass getExpressionParser();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.expression.ExpressionParserRegistry <em>Parser Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parser Registry</em>'.
	 * @see org.abchip.mimo.expression.ExpressionParserRegistry
	 * @generated
	 */
	EClass getExpressionParserRegistry();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.expression.ExpressionWriter <em>Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Writer</em>'.
	 * @see org.abchip.mimo.expression.ExpressionWriter
	 * @generated
	 */
	EClass getExpressionWriter();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.expression.ExpressionWriterRegistry <em>Writer Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Writer Registry</em>'.
	 * @see org.abchip.mimo.expression.ExpressionWriterRegistry
	 * @generated
	 */
	EClass getExpressionWriterRegistry();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.expression.ExpressionVisitor <em>Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visitor</em>'.
	 * @see org.abchip.mimo.expression.ExpressionVisitor
	 * @generated
	 */
	EClass getExpressionVisitor();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.expression.FunctionTermExpression <em>Function Term Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Term Expression</em>'.
	 * @see org.abchip.mimo.expression.FunctionTermExpression
	 * @generated
	 */
	EClass getFunctionTermExpression();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.expression.LogicalExpression <em>Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Expression</em>'.
	 * @see org.abchip.mimo.expression.LogicalExpression
	 * @generated
	 */
	EClass getLogicalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.expression.LogicalExpression#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see org.abchip.mimo.expression.LogicalExpression#getLeftOperand()
	 * @see #getLogicalExpression()
	 * @generated
	 */
	EReference getLogicalExpression_LeftOperand();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.expression.LogicalExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.abchip.mimo.expression.LogicalExpression#getOperator()
	 * @see #getLogicalExpression()
	 * @generated
	 */
	EAttribute getLogicalExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.expression.LogicalExpression#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see org.abchip.mimo.expression.LogicalExpression#getRightOperand()
	 * @see #getLogicalExpression()
	 * @generated
	 */
	EReference getLogicalExpression_RightOperand();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.expression.PredicateExpression <em>Predicate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Expression</em>'.
	 * @see org.abchip.mimo.expression.PredicateExpression
	 * @generated
	 */
	EClass getPredicateExpression();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.expression.QualifiedTermExpression <em>Qualified Term Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualified Term Expression</em>'.
	 * @see org.abchip.mimo.expression.QualifiedTermExpression
	 * @generated
	 */
	EClass getQualifiedTermExpression();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.expression.RelationalExpression <em>Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Expression</em>'.
	 * @see org.abchip.mimo.expression.RelationalExpression
	 * @generated
	 */
	EClass getRelationalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.expression.RelationalExpression#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see org.abchip.mimo.expression.RelationalExpression#getLeftOperand()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EReference getRelationalExpression_LeftOperand();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.expression.RelationalExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.abchip.mimo.expression.RelationalExpression#getOperator()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EAttribute getRelationalExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.expression.RelationalExpression#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see org.abchip.mimo.expression.RelationalExpression#getRightOperand()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EReference getRelationalExpression_RightOperand();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.expression.TermExpression <em>Term Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Expression</em>'.
	 * @see org.abchip.mimo.expression.TermExpression
	 * @generated
	 */
	EClass getTermExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.expression.TermExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.abchip.mimo.expression.TermExpression#getValue()
	 * @see #getTermExpression()
	 * @generated
	 */
	EAttribute getTermExpression_Value();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.expression.ArithmeticOperator <em>Arithmetic Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arithmetic Operator</em>'.
	 * @see org.abchip.mimo.expression.ArithmeticOperator
	 * @generated
	 */
	EEnum getArithmeticOperator();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.expression.AssignmentOperator <em>Assignment Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assignment Operator</em>'.
	 * @see org.abchip.mimo.expression.AssignmentOperator
	 * @generated
	 */
	EEnum getAssignmentOperator();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.expression.AtomicType <em>Atomic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Atomic Type</em>'.
	 * @see org.abchip.mimo.expression.AtomicType
	 * @generated
	 */
	EEnum getAtomicType();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.expression.ExpressionType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see org.abchip.mimo.expression.ExpressionType
	 * @generated
	 */
	EEnum getExpressionType();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.expression.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Operator</em>'.
	 * @see org.abchip.mimo.expression.LogicalOperator
	 * @generated
	 */
	EEnum getLogicalOperator();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.expression.RelationalOperator <em>Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relational Operator</em>'.
	 * @see org.abchip.mimo.expression.RelationalOperator
	 * @generated
	 */
	EEnum getRelationalOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExpressionFactory getExpressionFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.expression.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.expression.impl.ArithmeticExpressionImpl
		 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getArithmeticExpression()
		 * @generated
		 */
		EClass ARITHMETIC_EXPRESSION = eINSTANCE.getArithmeticExpression();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_EXPRESSION__LEFT_OPERAND = eINSTANCE.getArithmeticExpression_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITHMETIC_EXPRESSION__OPERATOR = eINSTANCE.getArithmeticExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_EXPRESSION__RIGHT_OPERAND = eINSTANCE.getArithmeticExpression_RightOperand();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.expression.impl.ArrayExpressionImpl <em>Array Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.expression.impl.ArrayExpressionImpl
		 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getArrayExpression()
		 * @generated
		 */
		EClass ARRAY_EXPRESSION = eINSTANCE.getArrayExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_EXPRESSION__EXPRESSION = eINSTANCE.getArrayExpression_Expression();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.expression.impl.AssignmentExpressionImpl <em>Assignment Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.expression.impl.AssignmentExpressionImpl
		 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getAssignmentExpression()
		 * @generated
		 */
		EClass ASSIGNMENT_EXPRESSION = eINSTANCE.getAssignmentExpression();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_EXPRESSION__LEFT_OPERAND = eINSTANCE.getAssignmentExpression_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_EXPRESSION__OPERATOR = eINSTANCE.getAssignmentExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_EXPRESSION__RIGHT_OPERAND = eINSTANCE.getAssignmentExpression_RightOperand();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.expression.impl.AtomicTermExpressionImpl <em>Atomic Term Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.expression.impl.AtomicTermExpressionImpl
		 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getAtomicTermExpression()
		 * @generated
		 */
		EClass ATOMIC_TERM_EXPRESSION = eINSTANCE.getAtomicTermExpression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_TERM_EXPRESSION__TYPE = eINSTANCE.getAtomicTermExpression_Type();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.expression.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.expression.impl.BooleanExpressionImpl
		 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getBooleanExpression()
		 * @generated
		 */
		EClass BOOLEAN_EXPRESSION = eINSTANCE.getBooleanExpression();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_EXPRESSION__OPERAND = eINSTANCE.getBooleanExpression_Operand();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.expression.impl.BlockExpressionImpl <em>Block Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.expression.impl.BlockExpressionImpl
		 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getBlockExpression()
		 * @generated
		 */
		EClass BLOCK_EXPRESSION = eINSTANCE.getBlockExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_EXPRESSION__EXPRESSION = eINSTANCE.getBlockExpression_Expression();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.expression.impl.CompoundTermExpressionImpl <em>Compound Term Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.expression.impl.CompoundTermExpressionImpl
		 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getCompoundTermExpression()
		 * @generated
		 */
		EClass COMPOUND_TERM_EXPRESSION = eINSTANCE.getCompoundTermExpression();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_TERM_EXPRESSION__ELEMENTS = eINSTANCE.getCompoundTermExpression_Elements();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.expression.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.expression.impl.ExpressionImpl
		 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.expression.ExpressionParser <em>Parser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.expression.ExpressionParser
		 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getExpressionParser()
		 * @generated
		 */
		EClass EXPRESSION_PARSER = eINSTANCE.getExpressionParser();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.expression.ExpressionParserRegistry <em>Parser Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.expression.ExpressionParserRegistry
		 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getExpressionParserRegistry()
		 * @generated
		 */
		EClass EXPRESSION_PARSER_REGISTRY = eINSTANCE.getExpressionParserRegistry();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.expression.ExpressionWriter <em>Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.expression.ExpressionWriter
		 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getExpressionWriter()
		 * @generated
		 */
		EClass EXPRESSION_WRITER = eINSTANCE.getExpressionWriter();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.expression.ExpressionWriterRegistry <em>Writer Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.expression.ExpressionWriterRegistry
		 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getExpressionWriterRegistry()
		 * @generated
		 */
		EClass EXPRESSION_WRITER_REGISTRY = eINSTANCE.getExpressionWriterRegistry();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.expression.impl.ExpressionVisitorImpl <em>Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.expression.impl.ExpressionVisitorImpl
		 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getExpressionVisitor()
		 * @generated
		 */
		EClass EXPRESSION_VISITOR = eINSTANCE.getExpressionVisitor();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.expression.impl.FunctionTermExpressionImpl <em>Function Term Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.expression.impl.FunctionTermExpressionImpl
		 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getFunctionTermExpression()
		 * @generated
		 */
		EClass FUNCTION_TERM_EXPRESSION = eINSTANCE.getFunctionTermExpression();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.expression.impl.LogicalExpressionImpl <em>Logical Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.expression.impl.LogicalExpressionImpl
		 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getLogicalExpression()
		 * @generated
		 */
		EClass LOGICAL_EXPRESSION = eINSTANCE.getLogicalExpression();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_EXPRESSION__LEFT_OPERAND = eINSTANCE.getLogicalExpression_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_EXPRESSION__OPERATOR = eINSTANCE.getLogicalExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_EXPRESSION__RIGHT_OPERAND = eINSTANCE.getLogicalExpression_RightOperand();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.expression.impl.PredicateExpressionImpl <em>Predicate Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.expression.impl.PredicateExpressionImpl
		 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getPredicateExpression()
		 * @generated
		 */
		EClass PREDICATE_EXPRESSION = eINSTANCE.getPredicateExpression();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.expression.impl.QualifiedTermExpressionImpl <em>Qualified Term Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.expression.impl.QualifiedTermExpressionImpl
		 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getQualifiedTermExpression()
		 * @generated
		 */
		EClass QUALIFIED_TERM_EXPRESSION = eINSTANCE.getQualifiedTermExpression();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.expression.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.expression.impl.RelationalExpressionImpl
		 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getRelationalExpression()
		 * @generated
		 */
		EClass RELATIONAL_EXPRESSION = eINSTANCE.getRelationalExpression();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_EXPRESSION__LEFT_OPERAND = eINSTANCE.getRelationalExpression_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONAL_EXPRESSION__OPERATOR = eINSTANCE.getRelationalExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_EXPRESSION__RIGHT_OPERAND = eINSTANCE.getRelationalExpression_RightOperand();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.expression.impl.TermExpressionImpl <em>Term Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.expression.impl.TermExpressionImpl
		 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getTermExpression()
		 * @generated
		 */
		EClass TERM_EXPRESSION = eINSTANCE.getTermExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM_EXPRESSION__VALUE = eINSTANCE.getTermExpression_Value();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.expression.ArithmeticOperator <em>Arithmetic Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.expression.ArithmeticOperator
		 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getArithmeticOperator()
		 * @generated
		 */
		EEnum ARITHMETIC_OPERATOR = eINSTANCE.getArithmeticOperator();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.expression.AssignmentOperator <em>Assignment Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.expression.AssignmentOperator
		 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getAssignmentOperator()
		 * @generated
		 */
		EEnum ASSIGNMENT_OPERATOR = eINSTANCE.getAssignmentOperator();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.expression.AtomicType <em>Atomic Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.expression.AtomicType
		 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getAtomicType()
		 * @generated
		 */
		EEnum ATOMIC_TYPE = eINSTANCE.getAtomicType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.expression.ExpressionType <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.expression.ExpressionType
		 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getExpressionType()
		 * @generated
		 */
		EEnum EXPRESSION_TYPE = eINSTANCE.getExpressionType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.expression.LogicalOperator <em>Logical Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.expression.LogicalOperator
		 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getLogicalOperator()
		 * @generated
		 */
		EEnum LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.expression.RelationalOperator <em>Relational Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.expression.RelationalOperator
		 * @see org.abchip.mimo.expression.impl.ExpressionPackageImpl#getRelationalOperator()
		 * @generated
		 */
		EEnum RELATIONAL_OPERATOR = eINSTANCE.getRelationalOperator();

	}

} //ExpressionPackage
