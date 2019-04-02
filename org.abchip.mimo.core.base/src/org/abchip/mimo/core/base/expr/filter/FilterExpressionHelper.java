/**
 *  Copyright (c) 2012, 2016 Sme.UP and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Dario Foresti - Initial API and implementation
 *   Mattia Rocchi - Implementation
 */
package org.abchip.mimo.core.base.expr.filter;

import org.abchip.mimo.core.base.expr.antlr.AntLRExpressionHelper;
import org.abchip.mimo.core.base.expr.antlr4.SQLiteBaseListener;
import org.abchip.mimo.core.base.expr.antlr4.SQLiteLexer;
import org.abchip.mimo.core.base.expr.antlr4.SQLiteParser;
import org.abchip.mimo.expression.ArithmeticOperator;
import org.abchip.mimo.expression.AtomicType;
import org.abchip.mimo.expression.ExpressionType;
import org.abchip.mimo.expression.LogicalOperator;
import org.abchip.mimo.expression.RelationalOperator;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.Tree;

public class FilterExpressionHelper implements AntLRExpressionHelper {

	@Override
	public ExpressionType getExpressionType(Tree node) {
		return null;

	}

	@Override
	public ArithmeticOperator getArithmeticOperator(Tree node) {
		return null;

	}

	@Override
	public LogicalOperator getLogicalOperator(Tree node) {
		return null;

	}

	@Override
	public RelationalOperator getRelationalOperator(Tree node) {
		return null;

	}

	@Override
	public AtomicType getTermType(Tree node) {
		return null;

	}

	@Override
	public Tree parse(String expression) {

		System.out.println(expression);

		String sql = expression;
		ANTLRInputStream input = new ANTLRInputStream(sql);
		SQLiteLexer SQLiteLexer = new SQLiteLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(SQLiteLexer);
		SQLiteParser parser = new SQLiteParser(tokens);

		ParseTree tree = parser.expr();
		ParseTreeWalker walker = new ParseTreeWalker();
		SQLiteBaseListener listener = new SQLiteBaseListener();
		walker.walk(listener, tree);

		for (int i = 0; i < tree.getChildCount(); i++) {
			System.out.println(tree.getChild(i).toStringTree(parser));
		}

		return null;

		/*
		 * SQLiteLexer lex = new SQLiteLexer(new ANTLRStringStream(sql));
		 * CommonTokenStream tokens = new CommonTokenStream(lex); MySQLParser parser =
		 * new MySQLParser(tokens);
		 * 
		 * try { Tree tree = parser.where_clause().getTree().getChild(2); return tree; }
		 * catch (RecognitionException e) { throw new RuntimeException(e); }
		 */
	}

	@Override
	public String normalizeText(String text) {
		return text;
	}

	@Override
	public String getFunctionName(Tree node) {
		return normalizeText(node.toString());
	}
}