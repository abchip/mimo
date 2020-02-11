/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.language.base;

import java.util.List;

import javax.inject.Inject;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.language.Language;
import org.abchip.mimo.language.LanguageExpression;
import org.abchip.mimo.language.LanguageLinearizer;
import org.abchip.mimo.language.LanguageLinearizerRegistry;
import org.abchip.mimo.language.LanguageManager;
import org.abchip.mimo.language.LanguageParser;
import org.abchip.mimo.language.LanguageParserRegistry;
import org.abchip.mimo.mining.MiningManager;
import org.abchip.mimo.mining.classification.Classification;

public class BaseLanguageManagerImpl implements LanguageManager {

	@Inject
	private LanguageParserRegistry languageParserRegistry;
	@Inject
	private LanguageLinearizerRegistry languageWriterRegistry;
	@Inject
	private MiningManager miningManager;
	
	@Override
	public Classification<Language> classifyLanguage(Context context, String text) {
		
		List<Classification<Language>> classifications = miningManager.classify(context, Language.class, text); 
		
		return classifications.get(0);
	}

	@Override
	public String translate(Context context, String languageSource, String text, String languageTarget) {
		
		LanguageParser languageParser = languageParserRegistry.list().get(0);		
		LanguageExpression languageExpression = languageParser.parse(context, languageSource, text);
		
		LanguageLinearizer languageLinearizer = languageWriterRegistry.list().get(0);		
		String result = languageLinearizer.linearize(context, languageTarget, languageExpression);

		return result;
	}
}
