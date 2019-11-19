/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.language.gf;

import java.util.Iterator;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.language.LanguageExpression;
import org.abchip.mimo.language.LanguageFactory;
import org.abchip.mimo.language.LanguageParser;
import org.abchip.mimo.util.Strings;
import org.grammaticalframework.pgf.Concr;
import org.grammaticalframework.pgf.Expr;
import org.grammaticalframework.pgf.ExprProb;

public class GFLanguageParserImpl implements LanguageParser {

	@Override
	public LanguageExpression parse(ContextProvider contextProvider, String language, String text) {
		
		Concr syntaxBuilder = GFGrammarLoader.get().getConcr("App" + Strings.qINSTANCE.firstToUpper(language));
		Expr rowExpression = null;
		try {
			Iterator<ExprProb> iter = syntaxBuilder.parse("Chunk", text).iterator();
			while(iter.hasNext()) {
				ExprProb exprProb = iter.next();
				rowExpression = exprProb.getExpr();
				if(rowExpression != null)
					break;
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		LanguageExpression languageExpression = LanguageFactory.eINSTANCE.createLanguageExpression();
		languageExpression.setExpressionRow(rowExpression);

		return languageExpression;
	}
}
