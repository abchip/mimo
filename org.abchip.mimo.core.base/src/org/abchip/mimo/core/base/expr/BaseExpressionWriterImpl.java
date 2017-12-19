/**
 *  Copyright (c) 2017, 2018 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial implementation
 */

package org.abchip.mimo.core.base.expr;

import org.abchip.mimo.expression.Expression;
import org.abchip.mimo.expression.ExpressionWriter;

public class BaseExpressionWriterImpl implements ExpressionWriter {

	//TODO
	@Override
	public String writeExpression(Expression expression) {
		NeutralExpressionStringBuilder builder = new NeutralExpressionStringBuilder();
		expression.accept(builder);
		return builder.getResult();
	}

}
