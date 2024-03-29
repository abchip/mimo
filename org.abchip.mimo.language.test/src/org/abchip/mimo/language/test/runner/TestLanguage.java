/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.language.test.runner;

import javax.inject.Inject;

import org.abchip.mimo.language.Language;
import org.abchip.mimo.language.LanguageException;
import org.abchip.mimo.language.LanguageManager;
import org.abchip.mimo.mining.classification.Classification;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestAsserter;
import org.abchip.mimo.tester.TestRunner;
import org.abchip.mimo.tester.TestStarted;

@Test(entity = "Language")
public class TestLanguage {
		
	@Inject
	private LanguageManager languageManager;
	@Inject
	private TestAsserter asserter;
	@Inject
	private TestRunner testRunner;

	@TestStarted
	public void start() throws LanguageException {
		
		String text = languageManager.translate(testRunner.getContext(), "ita", "Marco è un fotografo", "eng");
		asserter.assertEquals("Text translation", "Marco is a photographer", text);
		
		Classification<Language> classification = languageManager.classifyLanguage(testRunner.getContext(), "Hello, world!!");
		classification = languageManager.classifyLanguage(testRunner.getContext(), "Hey, chiquito!!");
		classification = languageManager.classifyLanguage(testRunner.getContext(), "Ciao, mondo!!");		
		
		classification = languageManager.classifyLanguage(testRunner.getContext(), "If you can dream it, you can do it. 【夢見ることができれば、それは実現できる。】-　Walt Disney　（ウォルト・ディズニー）");				
		asserter.assertEquals("Language classification", "eng", classification.getEntity().getName());
	}
}
