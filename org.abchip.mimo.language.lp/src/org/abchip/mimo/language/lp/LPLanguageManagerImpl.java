/**
 * Copyright (c) 2017, 2018 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.language.lp;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceScope;
import org.abchip.mimo.language.Classification;
import org.abchip.mimo.language.Language;
import org.abchip.mimo.language.LanguageExpression;
import org.abchip.mimo.language.LanguageFactory;
import org.abchip.mimo.language.LanguageManager;
import org.abchip.mimo.language.LanguageParser;
import org.abchip.mimo.language.LanguageParserRegistry;
import org.abchip.mimo.language.LanguageLinearizer;
import org.abchip.mimo.language.LanguageLinearizerRegistry;
import org.eclipse.core.runtime.FileLocator;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import com.aliasi.classify.ScoredClassification;
import com.aliasi.classify.ScoredClassifier;
import com.aliasi.util.AbstractExternalizable;

public class LPLanguageManagerImpl implements LanguageManager {

	@Inject
	private Application application;
	@Inject
	private ResourceManager resourceManager;
	@Inject
	private LanguageParserRegistry languageParserRegistry;
	@Inject
	private LanguageLinearizerRegistry languageWriterRegistry;
	
	private ScoredClassifier<CharSequence> classifier;
	private Map<String, Language> languages;
	
	@PostConstruct
	private void init() {

		this.languages = new HashMap<String, Language>();
		
		loadLanguages();
		loadModels();
	}
	
	@Override
	public org.abchip.mimo.language.Classification<Language> classifyLanguage(ContextProvider contextProvider, String text) {

		ScoredClassification lpClassification = classifier.classify(text);

		Language languageClassified = null;
		
		for(Language language: languages.values()) {
			if(language.getText().equalsIgnoreCase(lpClassification.bestCategory())) { 
				languageClassified = language;
				break;
			}
		}
		
		Classification<Language> classification = LanguageFactory.eINSTANCE.createClassification();
		classification.setEntity(languageClassified);
		classification.setScore(lpClassification.score(0));
		
		return classification;
	}

	private void loadLanguages() {		
		EntityReader<Language> languageReader = resourceManager.getEntityReader(application, Language.class, ResourceScope.ALL);
		for(Language language: languageReader.find(null)) 
			languages.put(language.getName(), language);
	}

	@SuppressWarnings("unchecked")
	private void loadModels() {
		try {
			String classifierPath = "model/3LangId.LMClassifier";
			Bundle bundle = FrameworkUtil.getBundle(this.getClass());
			URL url = bundle.getResource(classifierPath);
			
			File serializedClassifier = new File(FileLocator.toFileURL(url).getPath());
			classifier = (ScoredClassifier<CharSequence>) AbstractExternalizable.readObject(serializedClassifier);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String translate(ContextProvider contextProvider, String languageSource, String text, String languageTarget) {
		
		LanguageParser languageParser = languageParserRegistry.list().get(0);		
		LanguageExpression languageExpression = languageParser.parse(contextProvider, languageSource, text);
		
		LanguageLinearizer languageLinearizer = languageWriterRegistry.list().get(0);		
		String result = languageLinearizer.linearize(contextProvider, languageTarget, languageExpression);

		return result;
	}
}
