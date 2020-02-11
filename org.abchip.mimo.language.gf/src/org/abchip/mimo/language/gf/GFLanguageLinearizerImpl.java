/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.language.gf;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.language.LanguageExpression;
import org.abchip.mimo.language.LanguageLinearizer;
import org.abchip.mimo.util.Strings;
import org.grammaticalframework.pgf.Concr;
import org.grammaticalframework.pgf.Expr;

public class GFLanguageLinearizerImpl implements LanguageLinearizer {

	
	
	@Override
	public String linearize(Context context, String language, LanguageExpression expression) {

		Concr syntaxBuilder = GFGrammarLoader.get().getConcr("App"+Strings.qINSTANCE.firstToUpper(language));
		Expr rawExpression = (Expr) expression.getExpressionRow();	
		String result = syntaxBuilder.linearize(rawExpression);
		
		return result;
	}
}
