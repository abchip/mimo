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
package org.abchip.mimo.core.base.expr.antlr;

import org.abchip.mimo.expression.ArithmeticOperator;
import org.abchip.mimo.expression.AtomicType;
import org.abchip.mimo.expression.ExpressionType;
import org.abchip.mimo.expression.LogicalOperator;
import org.abchip.mimo.expression.RelationalOperator;
import org.antlr.v4.runtime.tree.Tree;

public interface AntLRExpressionHelper {

	public ExpressionType getExpressionType(Tree tree);

	public AtomicType getTermType(Tree node);

	public ArithmeticOperator getArithmeticOperator(Tree node);

	public LogicalOperator getLogicalOperator(Tree node);

	public RelationalOperator getRelationalOperator(Tree node);

	public Tree parse(String expression);

	public String normalizeText(String text);

	public String getFunctionName(Tree node);
	
}
