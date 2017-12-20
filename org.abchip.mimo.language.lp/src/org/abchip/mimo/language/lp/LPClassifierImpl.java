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
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.ResourceManager;
import org.abchip.mimo.entity.ResourceScope;
import org.abchip.mimo.language.Language;
import org.abchip.mimo.mining.classification.Classification;
import org.abchip.mimo.mining.classification.ClassificationFactory;
import org.abchip.mimo.mining.classification.Classifier;
import org.eclipse.core.runtime.FileLocator;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import com.aliasi.classify.ScoredClassification;
import com.aliasi.classify.ScoredClassifier;
import com.aliasi.util.AbstractExternalizable;

public class LPClassifierImpl implements Classifier {

	@Inject
	private Application application;
	@Inject
	private ResourceManager resourceManager;
	
	private ScoredClassifier<CharSequence> classifier;
	private Map<String, Language> languages;
	
	@PostConstruct
	private void init() {

		this.languages = new HashMap<String, Language>();
		
		loadLanguages();
		loadModels();
	}
	
	@Override
	public boolean isClassifierFor(Class<?> klass, Object object) {
		
		if(Language.class.isAssignableFrom(klass)) {		
			
			if(object instanceof String)
				return true;
			else
				return false;
		}
		else
			return false;
				
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E extends Entity> Classification<E> classify(ContextProvider contextProvider, Class<E> klass, Object object) {
		return (Classification<E>) classifyLanguage(contextProvider, (String)object);
	}

	private Classification<Language> classifyLanguage(ContextProvider contextProvider, String text) {

		ScoredClassification lpClassification = classifier.classify(text);

		Language languageClassified = null;
		
		for(Language language: languages.values()) {
			if(language.getText().equalsIgnoreCase(lpClassification.bestCategory())) { 
				languageClassified = language;
				break;
			}
		}
		
		Classification<Language> classification = ClassificationFactory.eINSTANCE.createClassification();
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
}
